import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Point as Point
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.Cookie as Cookie
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.By as By
import internal.GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
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
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaisharinpix.THARoojaiSharinPixAlbumDownloadUtil
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
String lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
	GlobalVariable.CaseDateTimeBegin=lDateTimeNow
}
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Start>>'+GlobalVariable.CaseDateTimeBegin)
if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
	IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=true')
	if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI){
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=true')
		IGNUemaHelper.switchSmartWaitDelay(true)
	}else{
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=false')
		IGNUemaHelper.switchSmartWaitDelay(false)
	}
}else{
	IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=false')
	if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS){
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=true')
		IGNUemaHelper.switchSmartWaitDelay(true)
	}else{
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=false')
		IGNUemaHelper.switchSmartWaitDelay(false)
	}
}
IGNUemaHelper.printLog('GlobalVariable.CaseNumber:'+GlobalVariable.CaseNumber)
TestData dataInput=TestDataFactory.findTestData(THARoojaiSharinPixAlbumDownloadUtil.INPUT_DATA_FILE_NAME)
WebDriver driver=null
WebDriver selenium=null
THARoojaiSharinPixAlbumDownloadUtil caseUtil=null
Boolean runNext=false
if(GlobalVariable.PrevStatus){
	IGNUemaHelper.printLog('GlobalVariable.PrevStatus:'+GlobalVariable.PrevStatus.toString())
	GlobalVariable.PrevStatus=false
	String lBaseUrl=THARoojaiSharinPixAlbumDownloadUtil.BASE_URL
	if(!(GlobalVariable.BrowserInit)){
		IGNUemaHelper.printLog('BrowserInit Open')
		GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(lBaseUrl,false,false,'','')
	}
	if(GlobalVariable.BrowserInit){
		IGNUemaHelper.printLog('BrowserInit=true')
		IGNUemaHelper.printLog('Script Start')
		driver=DriverFactory.getWebDriver()
		selenium=driver
		caseUtil=new THARoojaiSharinPixAlbumDownloadUtil(driver,selenium)
		//Navigate&Login
		String lLocatorToCheck=THARoojaiSharinPixAlbumDownloadUtil.LOCATOR_BUTTON_LOGIN
		if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
			IGNUemaHelper.switchSmartWaitDelay(true)
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.navigateToUrl(lBaseUrl)
			}
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.refresh()
			}
			IGNUemaHelper.delayThreadSecond(5)
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.navigateToUrl(lBaseUrl)
			}
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.refresh()
			}
			if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
				IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=true')
				if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI){
					IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=true')
					IGNUemaHelper.switchSmartWaitDelay(true)
				}else{
					IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=false')
					IGNUemaHelper.switchSmartWaitDelay(false)
				}
			}else{
				IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=false')
				if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS){
					IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=true')
					IGNUemaHelper.switchSmartWaitDelay(true)
				}else{
					IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=false')
					IGNUemaHelper.switchSmartWaitDelay(false)
				}
			}
		}else{
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.navigateToUrl(lBaseUrl)
			}
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.refresh()
			}
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.navigateToUrl(lBaseUrl)
			}
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.refresh()
			}
		}
		Boolean ready=IGNUemaHelper.checkElementPresentByLocator(driver,THARoojaiSharinPixAlbumDownloadUtil.LOCATOR_TO_CHECK_1,5)
		runNext=ready
		IGNUemaHelper.delayThreadSecond(0)
		if(!runNext){
			KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
			IGNUemaHelper.FORCESTOP()
		}
		//Processing Start
		Map lMapInputCase=caseUtil.inputCase(dataInput)
		if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
			if(lMapInputCase.Result){
				try{
					if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
						WebUI.executeJavaScript('alert =function(message){return true;};',[''])
					}
					if(IGNUemaHelper.CURRENT_BROWSER_IS_CHROME){
						WebUI.executeJavaScript('alert("PASSED: '+lMapInputCase.Message+'");',[''])
						IGNUemaHelper.delayThreadSecond(5)
						WebUI.acceptAlert()
					}
				}catch(Exception exx){
				}
			}else{
				try{
					if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
						WebUI.executeJavaScript('alert =function(message){return true;};',[''])
					}
					if(IGNUemaHelper.CURRENT_BROWSER_IS_CHROME){
						WebUI.executeJavaScript('alert("FAILED: '+lMapInputCase.Message+'");',[''])
						IGNUemaHelper.delayThreadSecond(5)
						WebUI.acceptAlert()
					}
				}catch(Exception exx){
				}
			}
		}
		//Processing Stop
		IGNUemaHelper.delayThreadSecond(5)
		IGNUemaHelper.printLog('Script Stop')
		IGNBrowserConfig.closeBrowser()
		KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
	}else{
		IGNUemaHelper.printLog('BrowserInit=false')
		KeywordUtil.markError(GlobalVariable.TestCaseFullName)
	}
}else{
	IGNUemaHelper.printLog('GlobalVariable.PrevStatus:'+GlobalVariable.PrevStatus.toString())
	KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
}
lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Stop>>'+GlobalVariable.CaseDateTimeEnd)
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
return null