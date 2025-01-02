package org.roojai.ignite.core
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.BrowserType
import org.openqa.selenium.Point as Point
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.firefox.FirefoxProfile as FirefoxProfile
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.edge.EdgeOptions as EdgeOptions
import org.openqa.selenium.edge.EdgeDriverService as EdgeDriverService
import org.openqa.selenium.edge.EdgeDriver as EdgeDriver
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.By as By
import java.util.stream.Stream
import java.util.stream.Collectors
import java.util.List
import internal.GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.DriverConfigurationProvider
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
public class IGNBrowserConfig{
	protected static final Boolean isDebug=false
	protected static final Boolean useNewAuth=true
	protected static final Boolean isKillAfter=false
	private static String strPathRootProject=RunConfiguration.getProjectDir()
	private static String strPathToRun=(strPathRootProject+'/Plugins/')
	private static String strFillAuthApp=(strPathToRun+'AUTOIT/RJ_UAT.exe')
	private static String strCallItFinal=(strPathToRun+'AUTOIT/!!!CLEAR.cmd')
	private static String strChromeBinaryHere=(strPathToRun+'Chrome/Application/chrome.exe')
	private static String strFirefoxBinaryHere=(strPathToRun+'Firefox/firefox.exe')
	private static String strEdgeChromiumBinaryHere=(strPathToRun+'Microsoft/Edge/Application/msedge.exe')
	private static String strPathToDownload=(strPathRootProject+'/Data Files/Download')
	@ Keyword
	def static Boolean openBrowser(String baseURL,Boolean boolMaximize=false,Boolean boolAuth=false,String username='',String password=''){
		Boolean lreturn=false
		IGNUemaHelper.printLog('openBrowser Start')
		try{
			lreturn=this.openBrowserTask(baseURL,boolMaximize,boolAuth,username,password)
			def driver=null
			if(!lreturn){
				driver=DriverFactory.getWebDriver()
				if(driver){
					try{
						driver.quit()
					}catch(Exception ex){
						ex.printStackTrace()
					}
				}
				this.killBrowserAll()
				lreturn=this.openBrowserTask(baseURL,boolMaximize,boolAuth,username,password)
			}
			if(!lreturn){
				driver=DriverFactory.getWebDriver()
				if(driver){
					try{
						driver.quit()
					}catch(Exception ex){
						ex.printStackTrace()
					}
				}
				this.killBrowserAll()
				lreturn=this.openBrowserTask(baseURL,boolMaximize,boolAuth,username,password)
			}
			if(lreturn){
				driver=DriverFactory.getWebDriver()
				if(!driver){
					lreturn=false
				}else{
					try{
						IGNUemaHelper.setBrowserWindowPosition(driver,0,0)
						lreturn=driver.getWindowHandle().length()>0
					}catch(Exception ex){
						//ex.printStackTrace()
						lreturn=false
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		IGNUemaHelper.printLog('openBrowser Stop')
		return lreturn
	}
	@ Keyword
	def static Boolean openBrowserTask(String baseURL,Boolean boolMaximize=false,Boolean boolAuth=false,String username='',String password=''){
		Boolean lreturn=false
		IGNUemaHelper.printLog('openBrowserTask Start')
		String lStrBaseURL=baseURL.trim()
		if(lStrBaseURL.isBlank()){
			baseURL='about:blank'
			lStrBaseURL=baseURL.trim()
		}
		String strOpenJS="function openWeb(){ setTimeout(function(){ window.location.href='"+baseURL+"' },500);};openWeb();"
		try{
			IGNUemaHelper.printLog('DriverFactory Setup Start')
			WebUIDriverType executedBrowser=DriverFactory.getExecutedBrowser()
			IGNUemaHelper.printLog('ExecutedBrowser:'+executedBrowser)
			Boolean lIsCustomWebDriverSetUp=false
			Boolean lIsCustomWebDriverOK=false
			if(IGNUemaHelper.checkObjectNullOfObject(executedBrowser)){
				IGNUemaHelper.printLog('ExecutedBrowser=null')
				try{
					WebUI.openBrowser(baseURL,FailureHandling.CONTINUE_ON_FAILURE)
				}catch(Exception ex){
					//ex.printStackTrace()
				}
			}else{
				IGNUemaHelper.printLog('ExecutedBrowser=Not null')
				if(executedBrowser==WebUIDriverType.CHROME_DRIVER){
					IGNUemaHelper.printLog('Chrome=true')
					lIsCustomWebDriverSetUp=true
					String chromeBinary=''
					File lBinaryHere=new File(this.strChromeBinaryHere)
					File lBinary32_1=new File('C:/Program Files (x86)/Google/Chrome/Application/chrome.exe')
					File lBinary32_2=new File('C:/Program Files (x86)/Google/Chrome Beta/Application/chrome.exe')
					File lBinary64_1=new File('C:/Program Files/Google/Chrome/Application/chrome.exe')
					File lBinary64_2=new File('C:/Program Files/Google/Chrome Beta/Application/chrome.exe')
					if(lBinaryHere.exists()){
						chromeBinary=lBinaryHere.toString()
					}else if(lBinary32_2.exists()){
						chromeBinary=lBinary32_2.toString()
					}else if(lBinary32_1.exists()){
						chromeBinary=lBinary32_1.toString()
					}else if(lBinary64_2.exists()){
						chromeBinary=lBinary64_2.toString()
					}else if(lBinary64_1.exists()){
						chromeBinary=lBinary64_1.toString()
					}else{
						chromeBinary='chrome.exe'
					}
					IGNUemaHelper.printLog('Chrome:'+chromeBinary)
					System.setProperty('webdriver.chrome.driver',DriverFactory.getChromeDriverPath())
					DesiredCapabilities chromeCapabilities=new DesiredCapabilities()
					ChromeOptions chromeOptions=new ChromeOptions()
					Map<String,Object> prefs=new HashMap<String,Object>()
					prefs.put('credentials_enable_service',false)
					prefs.put('profile.password_manager_enabled',false)
					prefs.put('profile.default_content_settings.popups',0)
					prefs.put('download.default_directory',this.strPathToDownload)
					prefs.put('download.prompt_for_download',false)
					prefs.put('profile.default_content_setting_values.cookies',1)
					prefs.put('network.cookie.cookieBehavior',1)
					prefs.put('profile.block_third_party_cookies',false)
					chromeOptions.with{
						setBinary(chromeBinary)
						setExperimentalOption("prefs",prefs)
						setExperimentalOption('useAutomationExtension',false)
						setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"))
						setAcceptInsecureCerts(true)
						addArguments('--disable-dev-shm-usage')
						addArguments('--disable-dev-shm-using')
						addArguments('--disable-extensions')
						addArguments('--disable-features=NetworkService')
						addArguments('--disable-features=VizDisplayCompositor')
						addArguments('--disable-gpu')
						addArguments('--disable-infobars')
						addArguments('--disable-notifications')
						addArguments('--disable-popup-blocking')
						addArguments('--disable-prompt-on-repost')
						addArguments('--disable-save-password-bubble')
						addArguments('--disable-setuid-sandbox')
						addArguments('--disable-web-security')
						addArguments('--dns-prefetch-disable')
						addArguments('--enable-blink-features=ExperimentalProductivityFeatures')
						addArguments('--enable-features=NetworkServiceInProcess')
						addArguments('--ignore-certificate-errors')
						addArguments('--no-first-run')
						addArguments('--no-sandbox')
						addArguments('--profile-directory=Default')
						addArguments('--remote-allow-origins=*')
						//addArguments('--remote-debugging-port=9222')
						addArguments('--start-maximized')
						addArguments('--test-type')
						addArguments('--window-size=1280,1024')
					}
					chromeCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions)
					chromeOptions.merge(chromeCapabilities)
					WebDriver chromeDriver=new ChromeDriver(chromeOptions)
					DriverFactory.changeWebDriver(chromeDriver)
					lIsCustomWebDriverOK=true
				}else if(executedBrowser==WebUIDriverType.HEADLESS_DRIVER){
					IGNUemaHelper.printLog('ChromeHeadless=true')
					lIsCustomWebDriverSetUp=true
					String chromeBinary=''
					File lBinaryHere=new File(this.strChromeBinaryHere)
					File lBinary32_1=new File('C:/Program Files (x86)/Google/Chrome/Application/chrome.exe')
					File lBinary32_2=new File('C:/Program Files (x86)/Google/Chrome Beta/Application/chrome.exe')
					File lBinary64_1=new File('C:/Program Files/Google/Chrome/Application/chrome.exe')
					File lBinary64_2=new File('C:/Program Files/Google/Chrome Beta/Application/chrome.exe')
					if(lBinaryHere.exists()){
						chromeBinary=lBinaryHere.toString()
					}else if(lBinary32_2.exists()){
						chromeBinary=lBinary32_2.toString()
					}else if(lBinary32_1.exists()){
						chromeBinary=lBinary32_1.toString()
					}else if(lBinary64_2.exists()){
						chromeBinary=lBinary64_2.toString()
					}else if(lBinary64_1.exists()){
						chromeBinary=lBinary64_1.toString()
					}else{
						chromeBinary='chrome.exe'
					}
					IGNUemaHelper.printLog('Chrome:'+chromeBinary)
					System.setProperty('webdriver.chrome.driver',DriverFactory.getChromeDriverPath())
					DesiredCapabilities chromeCapabilities=new DesiredCapabilities()
					ChromeOptions chromeOptions=new ChromeOptions()
					Map<String,Object> prefs=new HashMap<String,Object>()
					prefs.put('credentials_enable_service',false)
					prefs.put('profile.password_manager_enabled',false)
					prefs.put('profile.default_content_settings.popups',0)
					prefs.put('download.default_directory',this.strPathToDownload)
					prefs.put('download.prompt_for_download',false)
					prefs.put('profile.default_content_setting_values.cookies',1)
					prefs.put('network.cookie.cookieBehavior',1)
					prefs.put('profile.block_third_party_cookies',false)
					chromeOptions.with{
						setBinary(chromeBinary)
						setExperimentalOption("prefs",prefs)
						setExperimentalOption('useAutomationExtension',false)
						setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"))
						setAcceptInsecureCerts(true)
						addArguments('--disable-dev-shm-usage')
						addArguments('--disable-dev-shm-using')
						addArguments('--disable-extensions')
						addArguments('--disable-features=NetworkService')
						addArguments('--disable-features=VizDisplayCompositor')
						addArguments('--disable-gpu')
						addArguments('--disable-infobars')
						addArguments('--disable-notifications')
						addArguments('--disable-popup-blocking')
						addArguments('--disable-prompt-on-repost')
						addArguments('--disable-save-password-bubble')
						addArguments('--disable-setuid-sandbox')
						addArguments('--disable-web-security')
						addArguments('--dns-prefetch-disable')
						addArguments('--enable-blink-features=ExperimentalProductivityFeatures')
						addArguments('--enable-features=NetworkServiceInProcess')
						addArguments('--headless')
						addArguments('--ignore-certificate-errors')
						addArguments('--no-first-run')
						addArguments('--no-sandbox')
						addArguments('--profile-directory=Default')
						addArguments('--remote-allow-origins=*')
						//addArguments('--remote-debugging-port=9222')
						addArguments('--start-maximized')
						addArguments('--test-type')
						addArguments('--window-size=1280,1024')
					}
					chromeCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions)
					chromeOptions.merge(chromeCapabilities)
					WebDriver chromeDriver=new ChromeDriver(chromeOptions)
					DriverFactory.changeWebDriver(chromeDriver)
					lIsCustomWebDriverOK=true
				}else if(executedBrowser==WebUIDriverType.FIREFOX_DRIVER){
					IGNUemaHelper.printLog('Firefox=true')
					lIsCustomWebDriverSetUp=true
					File lBinaryHere=new File(this.strFirefoxBinaryHere)
					String firefoxBinary=lBinaryHere
					FirefoxProfile firefoxProfile=new FirefoxProfile()
					FirefoxOptions firefoxOptions=new FirefoxOptions().setProfile(firefoxProfile)
					firefoxOptions.setBinary(firefoxBinary)
					System.setProperty('webdriver.gecko.driver',DriverFactory.getGeckoDriverPath())
					WebDriver firefoxDriver=new FirefoxDriver(firefoxOptions)
					DriverFactory.changeWebDriver(firefoxDriver)
					lIsCustomWebDriverOK=true
				}else if(executedBrowser==WebUIDriverType.FIREFOX_HEADLESS_DRIVER){
					IGNUemaHelper.printLog('FirefoxHeadless=true')
					lIsCustomWebDriverSetUp=true
					File lBinaryHere=new File(this.strFirefoxBinaryHere)
					String firefoxBinary=lBinaryHere
					FirefoxProfile firefoxProfile=new FirefoxProfile()
					FirefoxOptions firefoxOptions=new FirefoxOptions().setProfile(firefoxProfile)
					firefoxOptions.setBinary(firefoxBinary)
					firefoxOptions.setHeadless(true)
					System.setProperty('webdriver.gecko.driver',DriverFactory.getGeckoDriverPath())
					WebDriver firefoxDriver=new FirefoxDriver(firefoxOptions)
					DriverFactory.changeWebDriver(firefoxDriver)
					lIsCustomWebDriverOK=true
				}else if(executedBrowser==WebUIDriverType.EDGE_CHROMIUM_DRIVER){
					IGNUemaHelper.printLog('EdgeChromium=true')
					lIsCustomWebDriverSetUp=true
					String edgeChromiumBinary=''
					File lBinaryHere=new File(this.strEdgeChromiumBinaryHere)
					File lBinary32_1=new File('C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe')
					File lBinary32_2=new File('C:/Program Files (x86)/Microsoft/Edge Beta/Application/msedge.exe')
					File lBinary64_1=new File('C:/Program Files/Microsoft/Edge/Application/msedge.exe')
					File lBinary64_2=new File('C:/Program Files/Microsoft/Edge Beta/Application/msedge.exe')
					if(lBinaryHere.exists()){
						edgeChromiumBinary=lBinaryHere.toString()
					}else if(lBinary32_2.exists()){
						edgeChromiumBinary=lBinary32_2.toString()
					}else if(lBinary32_1.exists()){
						edgeChromiumBinary=lBinary32_1.toString()
					}else if(lBinary64_2.exists()){
						edgeChromiumBinary=lBinary64_2.toString()
					}else if(lBinary64_1.exists()){
						edgeChromiumBinary=lBinary64_1.toString()
					}else{
						edgeChromiumBinary='msedge.exe'
					}
					IGNUemaHelper.printLog('EdgeChromium:'+edgeChromiumBinary)
					String edgeChromiumDriverFile=this.strPathToRun+'Microsoft/Edge/Application/msedgedriver.exe'
					System.setProperty('webdriver.chrome.driver',edgeChromiumDriverFile)
					System.setProperty('webdriver.edge.driver',edgeChromiumDriverFile)
					System.setProperty('webdriver.edge.verboseLogging','true')
					DesiredCapabilities edgeChromiumCapabilities=new DesiredCapabilities()
					ChromeOptions edgeChromiumOptions=new ChromeOptions()
					Map<String,Object> prefs=new HashMap<String,Object>()
					prefs.put('credentials_enable_service',false)
					prefs.put('profile.password_manager_enabled',false)
					prefs.put('profile.default_content_settings.popups',0)
					prefs.put('download.default_directory',this.strPathToDownload)
					prefs.put('download.prompt_for_download',false)
					prefs.put('profile.default_content_setting_values.cookies',1)
					prefs.put('network.cookie.cookieBehavior',1)
					prefs.put('profile.block_third_party_cookies',false)
					edgeChromiumOptions.with{
						setBinary(edgeChromiumBinary)
						setExperimentalOption("prefs",prefs)
						setExperimentalOption('useAutomationExtension',false)
						setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"))
						setAcceptInsecureCerts(true)
						addArguments('--disable-blink-features=AutomationControlled')
						addArguments('--disable-dev-shm-usage')
						addArguments('--disable-dev-shm-using')
						addArguments('--disable-extensions')
						addArguments('--disable-features=NetworkService')
						addArguments('--disable-features=VizDisplayCompositor')
						addArguments('--disable-gpu')
						addArguments('--disable-infobars')
						addArguments('--disable-notifications')
						addArguments('--disable-popup-blocking')
						addArguments('--disable-prompt-on-repost')
						addArguments('--disable-save-password-bubble')
						addArguments('--disable-setuid-sandbox')
						addArguments('--disable-web-security')
						addArguments('--dns-prefetch-disable')
						addArguments('--enable-blink-features=ExperimentalProductivityFeatures')
						addArguments('--enable-features=NetworkServiceInProcess')
						addArguments('--ignore-certificate-errors')
						addArguments('--no-first-run')
						addArguments('--no-sandbox')
						addArguments('--profile-directory=Default')
						addArguments('--remote-allow-origins=*')
						//addArguments('--remote-debugging-port=9222')
						addArguments('--start-maximized')
						addArguments('--test-type')
						addArguments('--window-size=1280,1024')
					}
					edgeChromiumCapabilities.setCapability(edgeChromiumOptions.CAPABILITY,edgeChromiumOptions)
					edgeChromiumOptions.merge(edgeChromiumCapabilities)
					edgeChromiumOptions.setCapability(CapabilityType.BROWSER_NAME,BrowserType.EDGE)
					EdgeOptions edgeOptions=new EdgeOptions().merge(edgeChromiumOptions)
					WebDriver edgeChromiumDriver=new ChromeDriver(edgeOptions)
					DriverFactory.changeWebDriver(edgeChromiumDriver)
					lIsCustomWebDriverOK=true
				}else{
					IGNUemaHelper.printLog('Chrome=false')
					try{
						WebUI.openBrowser(baseURL,FailureHandling.CONTINUE_ON_FAILURE)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
				}
			}
			def driver=DriverFactory.getWebDriver()
			if(IGNUemaHelper.checkObjectNullOfObject(driver)){
				IGNUemaHelper.printLog('Driver=null')
			}else{
				IGNUemaHelper.printLog('Driver=Not null')
				String lBrowserName=IGNUemaHelper.getBrowserInfo(driver).toUpperCase()
				if(lBrowserName.contains('SAFARI')){
					IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=true')
					IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI=true
					IGNUemaHelper.printLog('CURRENT_BROWSER_IS_CHROME=false')
					IGNUemaHelper.CURRENT_BROWSER_IS_CHROME=false
					IGNUemaHelper.printLog('CURRENT_BROWSER_IS_EDGE=false')
					IGNUemaHelper.CURRENT_BROWSER_IS_EDGE=false
					IGNUemaHelper.printLog('CURRENT_BROWSER_IS_FIREFOX=false')
					IGNUemaHelper.CURRENT_BROWSER_IS_FIREFOX=false
					IGNUemaHelper.printLog('CURRENT_BROWSER_IS_UNKNOWN=false')
					IGNUemaHelper.CURRENT_BROWSER_IS_UNKNOWN=false
					if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI){
						IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=true')
						IGNUemaHelper.switchSmartWaitDelay(true)
					}else{
						IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=false')
						IGNUemaHelper.switchSmartWaitDelay(false)
					}
				}else{
					IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=false')
					IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI=false
					if(lBrowserName.contains('CHROME')){
						IGNUemaHelper.printLog('CURRENT_BROWSER_IS_CHROME=true')
						IGNUemaHelper.CURRENT_BROWSER_IS_CHROME=true
						IGNUemaHelper.printLog('CURRENT_BROWSER_IS_EDGE=false')
						IGNUemaHelper.CURRENT_BROWSER_IS_EDGE=false
						IGNUemaHelper.printLog('CURRENT_BROWSER_IS_FIREFOX=false')
						IGNUemaHelper.CURRENT_BROWSER_IS_FIREFOX=false
						IGNUemaHelper.printLog('CURRENT_BROWSER_IS_UNKNOWN=false')
						IGNUemaHelper.CURRENT_BROWSER_IS_UNKNOWN=false
					}else{
						IGNUemaHelper.printLog('CURRENT_BROWSER_IS_CHROME=false')
						IGNUemaHelper.CURRENT_BROWSER_IS_CHROME=false
						if(lBrowserName.contains('EDGE')){
							IGNUemaHelper.printLog('CURRENT_BROWSER_IS_EDGE=true')
							IGNUemaHelper.CURRENT_BROWSER_IS_EDGE=true
							IGNUemaHelper.printLog('CURRENT_BROWSER_IS_FIREFOX=false')
							IGNUemaHelper.CURRENT_BROWSER_IS_FIREFOX=false
							IGNUemaHelper.printLog('CURRENT_BROWSER_IS_UNKNOWN=false')
							IGNUemaHelper.CURRENT_BROWSER_IS_UNKNOWN=false
						}else{
							IGNUemaHelper.printLog('CURRENT_BROWSER_IS_EDGE=false')
							IGNUemaHelper.CURRENT_BROWSER_IS_EDGE=false
							if(lBrowserName.contains('FIREFOX')){
								IGNUemaHelper.printLog('CURRENT_BROWSER_IS_FIREFOX=true')
								IGNUemaHelper.CURRENT_BROWSER_IS_FIREFOX=true
								IGNUemaHelper.printLog('CURRENT_BROWSER_IS_UNKNOWN=false')
								IGNUemaHelper.CURRENT_BROWSER_IS_UNKNOWN=false
							}else{
								IGNUemaHelper.printLog('CURRENT_BROWSER_IS_FIREFOX=false')
								IGNUemaHelper.CURRENT_BROWSER_IS_FIREFOX=false
								IGNUemaHelper.printLog('CURRENT_BROWSER_IS_UNKNOWN=true')
								IGNUemaHelper.CURRENT_BROWSER_IS_UNKNOWN=true
							}
						}
					}
					if(IGNUemaHelper.CURRENT_BROWSER_IS_EDGE){
						IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=true
					}
					if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS){
						IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=true')
						IGNUemaHelper.switchSmartWaitDelay(true)
					}else{
						IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=false')
						IGNUemaHelper.switchSmartWaitDelay(false)
					}
				}
				if(this.isDebug){
					if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
						IGNUemaHelper.printLog('isDebug=true')
						IGNRobotAuth.sendF12()
					}else{
						IGNUemaHelper.printLog('isDebug=false')
					}
				}else{
					IGNUemaHelper.printLog('isDebug=false')
				}
				Map lMapSetBrowserWindowModeSize=[:]
				if(boolMaximize){
					IGNUemaHelper.printLog('maximizeWindow=true')
				}else{
					IGNUemaHelper.printLog('maximizeWindow=false')
				}
				lMapSetBrowserWindowModeSize=IGNUemaHelper.setBrowserWindowModeSize(driver,boolMaximize,1280,1024)
				IGNUemaHelper.printLog('setBrowserWindowModeSize='+lMapSetBrowserWindowModeSize.toString())
				if(boolAuth){
					IGNUemaHelper.printLog('boolAuth=true')
					if(this.useNewAuth){
						WebUI.executeJavaScript(strOpenJS,null)
						IGNUemaHelper.delayThreadSecond(3)
						IGNRobotAuth.loginAuthenticate(username,password)
						IGNUemaHelper.delayThreadSecond(3)
					}else{
						Runtime.getRuntime().exec(strFillAuthApp)
						WebUI.executeJavaScript(strOpenJS,null)
						IGNUemaHelper.delayThreadSecond(12)
					}
				}else{
					IGNUemaHelper.printLog('boolAuth=false')
					WebUI.executeJavaScript(strOpenJS,null)
				}
				lreturn=true
			}
			IGNUemaHelper.printLog('DriverFactory Setup Stop')
		}catch(Exception e){
			//e.printStackTrace()
		}
		IGNUemaHelper.printLog('openBrowserTask Stop')
		return lreturn
	}
	@ Keyword
	def static void closeBrowser(){
		IGNUemaHelper.printLog('closeBrowser Start')
		try{
			WebDriver driver=DriverFactory.getWebDriver()
			try{
				IGNUemaHelper.printLog('Printing Console Logs')
				LogEntries logs=this.browserLogEntries(driver)
				if(logs){
					for(LogEntry entry:logs){
						IGNUemaHelper.printLog(">>> $entry")
					}
				}else{
					IGNUemaHelper.printLog('WebDriver Not Support Console Logs')
				}
			}catch(Exception ex1){
				//ex1.printStackTrace()
			}
			try{
				IGNUemaHelper.printLog('Close Browser')
				try{
					WebUI.closeBrowser()
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
				try{
					if(driver){
						driver.close()
					}
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
				try{
					if(driver){
						driver.quit()
					}
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
				try{
					driver=DriverFactory.getWebDriver()
					if(driver){
						IGNUemaHelper.delayThreadSecond(1)
						driver.close()
					}
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
				try{
					driver=DriverFactory.getWebDriver()
					if(driver){
						IGNUemaHelper.delayThreadSecond(1)
						driver.quit()
					}
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
				try{
					driver=DriverFactory.getWebDriver()
					if(driver){
						IGNUemaHelper.delayThreadSecond(1)
						driver.close()
					}
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
				try{
					driver=DriverFactory.getWebDriver()
					if(driver){
						IGNUemaHelper.delayThreadSecond(1)
						driver.quit()
					}
				}catch(Exception ex4){
					//ex4.printStackTrace()
				}
			}catch(Exception ex2){
				//ex2.printStackTrace()
			}finally{
				try{
					IGNUemaHelper.printLog('Final Call')
					this.killBrowserAll()
				}catch(Exception ex3){
					//ex3.printStackTrace()
				}
				try{
					GlobalVariable.BrowserInit=false
				}catch(Exception exx){
					//exx.printStackTrace()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		IGNUemaHelper.printLog('closeBrowser Stop')
	}
	@ Keyword
	def static LogEntries browserLogEntries(WebDriver driver){
		IGNUemaHelper.printLog('browserLogEntries Start')
		LogEntries lreturn
		try{
			if(driver){
				lreturn=driver.manage().logs().get('browser')
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		IGNUemaHelper.printLog('browserLogEntries Stop')
		return lreturn
	}
	@ Keyword
	def static void killBrowserAll(){
		IGNUemaHelper.printLog('killBrowserAll Start')
		try{
			if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
				Integer lNumKatalonStudioCount=0
				Integer lNumKatalonEngineCount=0
				ProcessHandle lProcessHandleCurrent=ProcessHandle.current()
				//IGNUemaHelper.printLog('lProcessHandleCurrent='+lProcessHandleCurrent.pid().toString()+'|'+lProcessHandleCurrent.info().command())
				Optional<ProcessHandle> lOptionalProcessHandleParent=lProcessHandleCurrent.parent()
				ProcessHandle lProcessHandleParent=null
				ProcessHandle lProcessHandleParentOfParent=null
				try{
					lProcessHandleParent=lOptionalProcessHandleParent.orElseThrow()
					lProcessHandleParentOfParent=lProcessHandleParent.parent().orElseThrow()
				}catch(Exception ex){
					//ex.printStackTrace()
				}
				if(!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleParent)){
					//lProcessHandleParent=lProcessHandleParentOfParent
				}
				if(!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleParent)){
					//IGNUemaHelper.printLog('lProcessHandleParent='+lProcessHandleParent.pid().toString()+'|'+lProcessHandleParent.info().command())
				}
				Stream<ProcessHandle> lProcessHandleChildStream=null
				if(!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleParent)){
					lProcessHandleChildStream=lProcessHandleParent.descendants()
				}else{
					lProcessHandleChildStream=lProcessHandleCurrent.descendants()
				}
				if(!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleChildStream)){
					List<ProcessHandle> lProcessHandleChildList=lProcessHandleChildStream.toList()
					//IGNUemaHelper.printLog('lProcessHandleChildList='+lProcessHandleChildList.size().toString())
					if(lProcessHandleChildList.size()>0){
						for(ProcessHandle lProcessHandleChildItem in lProcessHandleChildList){
							if(!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleChildItem)){
								String lStrCommand=lProcessHandleChildItem.info().command()
								Boolean lIsReady=lStrCommand.length()>0
								Boolean lIsTerminated=false
								String lStrKillCmd='taskkill /F /T /PID '
								if(lIsReady){
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'CHROMEDRIVER.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'GECKODRIVER.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'IEDRIVERSERVER.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'IEXPLORE.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'KMSIE.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'MICROSOFTEDGE.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'MICROSOFTWEBDRIVER.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
									if(!lIsTerminated){
										if(IGNUemaHelper.checkStringContainString(lStrCommand,'MSEDGEDRIVER.EXE')){
											try{
												//IGNUemaHelper.printLog(lStrCommand+'|'+lProcessHandleChildItem.pid().toString())
												Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleChildItem.pid().toString())
												lIsTerminated=true
											}catch(Exception ex){
												//ex.printStackTrace()
											}
										}
									}
								}
							}
						}
					}
				}
				Stream<ProcessHandle> lOptionalProcessHandleAllStream=ProcessHandle.allProcesses()
				List<ProcessHandle> lOptionalProcessHandleAllList=lOptionalProcessHandleAllStream.toList()
				//IGNUemaHelper.printLog('lOptionalProcessHandleAllList='+lOptionalProcessHandleAllList.size().toString())
				if(lOptionalProcessHandleAllList.size()>0){
					for(ProcessHandle lOptionalProcessHandleAllItem in lOptionalProcessHandleAllList){
						if(!IGNUemaHelper.checkObjectNullOfObject(lOptionalProcessHandleAllItem)){
							String lStrCommand=lOptionalProcessHandleAllItem.info().command()
							Boolean lIsReady=lStrCommand.length()>0
							Boolean lIsTerminated=false
							String lStrKillCmd='taskkill /F /T /PID '
							Optional<ProcessHandle> lOptionalProcessHandleAllItemParent=null
							ProcessHandle lProcessHandleAllItemParent=null
							ProcessHandle lProcessHandleAllItemParentOfParent=null
							String lStrCommandParent=''
							if(IGNUemaHelper.checkStringContainString(lStrCommand,'KATALONC.EXE')){
								lNumKatalonEngineCount=lNumKatalonEngineCount+1
							}else if(IGNUemaHelper.checkStringContainString(lStrCommand,'KATALON.EXE')){
								lNumKatalonStudioCount=lNumKatalonStudioCount+1
							}
							if(lIsReady){
								lOptionalProcessHandleAllItemParent=lOptionalProcessHandleAllItem.parent()
								lIsReady=!IGNUemaHelper.checkObjectNullOfObject(lOptionalProcessHandleAllItemParent)
							}
							if(lIsReady){
								try{
									lProcessHandleAllItemParent=lOptionalProcessHandleAllItemParent.orElseThrow()
									lProcessHandleAllItemParentOfParent=lProcessHandleAllItemParent.parent().orElseThrow()
								}catch(Exception ex){
									//ex.printStackTrace()
								}
								if(!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleAllItemParentOfParent)){
									lProcessHandleAllItemParent=lProcessHandleAllItemParentOfParent
								}
								lIsReady=!IGNUemaHelper.checkObjectNullOfObject(lProcessHandleAllItemParent)
							}
							if(lIsReady){
								lStrCommandParent=lProcessHandleAllItemParent.info().command()
								lIsReady=lStrCommandParent.length()>0
							}
							if(lIsReady){
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'CHROMEDRIVER.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'GECKODRIVER.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'IEDRIVERSERVER.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'IEXPLORE.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'KMSIE.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'MICROSOFTEDGE.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'MICROSOFTWEBDRIVER.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
								if(!lIsTerminated){
									if((IGNUemaHelper.checkStringContainString(lStrCommandParent,'MSEDGEDRIVER.EXE'))&&(IGNUemaHelper.checkStringContainString(lStrCommand,'CONHOST.EXE'))){
										try{
											//IGNUemaHelper.printLog(lStrCommandParent+'|'+lProcessHandleAllItemParent.pid().toString())
											Runtime.getRuntime().exec(lStrKillCmd+lProcessHandleAllItemParent.pid().toString())
											lIsTerminated=true
										}catch(Exception ex){
											//ex.printStackTrace()
										}
									}
								}
							}
						}
					}
				}
				Integer lNumKatalonTotalCount=lNumKatalonStudioCount+lNumKatalonEngineCount
				if(lNumKatalonTotalCount<=1){
					IGNUemaHelper.printLog('killBrowserAll Only One Katalon')
					IGNUemaHelper.printLog('killBrowserAll Execute killBrowserGlobal')
					this.killBrowserGlobal()
				}else{
					IGNUemaHelper.printLog('killBrowserAll More Than One Katalon')
					IGNUemaHelper.printLog('killBrowserAll Do Kill After:'+IGNUemaHelper.convertBooleanToYesNoString(this.isKillAfter))
					if(this.isKillAfter){
						IGNUemaHelper.printLog('killBrowserAll Execute killBrowserGlobal')
						this.killBrowserGlobal()
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		IGNUemaHelper.printLog('killBrowserAll Stop')
	}
	@ Keyword
	def static void killBrowserGlobal(){
		IGNUemaHelper.printLog('killBrowserGlobal Start')
		try{
			IGNUemaHelper.printLog('killBrowserGlobal Execute')
			Runtime.getRuntime().exec(strCallItFinal)
		}catch(Exception e){
			//e.printStackTrace()
		}
		IGNUemaHelper.printLog('killBrowserGlobal Stop')
	}
}