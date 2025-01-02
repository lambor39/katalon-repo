import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable
import java.util.List
import java.util.stream.Collectors
import java.util.stream.Stream
import org.dhatim.fastexcel.*
import org.dhatim.fastexcel.BorderSide
import org.dhatim.fastexcel.BorderStyle
import org.dhatim.fastexcel.Range
import org.dhatim.fastexcel.reader.*
import org.dhatim.fastexcel.reader.Cell
import org.dhatim.fastexcel.reader.ReadableWorkbook
import org.dhatim.fastexcel.reader.Row
import org.dhatim.fastexcel.reader.Sheet
import org.dhatim.fastexcel.StyleSetter
import org.dhatim.fastexcel.Workbook
import org.dhatim.fastexcel.Worksheet
import org.openqa.selenium.By as By
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.Point as Point
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultActual
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultExpected
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
import org.roojai.ignite.core.IGNSendEmail as IGNSendEmail
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestManager as IGNTestManager
import org.roojai.ignite.types.testmanager.*
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNTestResultActual lIGNTestResultActualThisCase=IGNTestResultActual.FailedNoWarning
try{
	/*============================================================================YOUR CODE HERE============================================================================*/
	Boolean lIsRunNext=true
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		IGNUemaHelper.printLog('Database Check Start')
		String lStrTHAOTPRoojaiWebsite=THARoojaiWebsite.OTPRoojaiWebsiteByPhoneNo('0638961786',true)
		if(lStrTHAOTPRoojaiWebsite.length()>0){
			IGNUemaHelper.printLog('lStrTHAOTPRoojaiWebsite='+lStrTHAOTPRoojaiWebsite)
		}else{
			IGNUemaHelper.printLog('lStrTHAOTPRoojaiWebsite=***Empty***')
		}
		String lStrTHAOTPMyAccount=THARoojaiWebsite.OTPMyAccountByEmail('chatchai.bun@roojai.com',true)
		if(lStrTHAOTPMyAccount.length()>0){
			IGNUemaHelper.printLog('lStrTHAOTPMyAccount='+lStrTHAOTPMyAccount)
		}else{
			IGNUemaHelper.printLog('lStrTHAOTPMyAccount=***Empty***')
		}
		String lStrTHAOTPMrKumka=THARoojaiWebsite.OTPMrKumkaByEmail('chatchai.bun@roojai.com',true)
		if(lStrTHAOTPMrKumka.length()>0){
			IGNUemaHelper.printLog('lStrTHAOTPMrKumka='+lStrTHAOTPRoojaiWebsite)
		}else{
			IGNUemaHelper.printLog('lStrTHAOTPMrKumka=***Empty***')
		}
		IGNUemaHelper.printLog('Database Check Stop')
	}
	Boolean lIsReadyBrowser=false
	Boolean lIsReadyWeb=false
	String lStrLogText=''
	String lStrUrlToNavigate='https://www.google.com'
	IGNUemaHelper.printLog('IGNBrowserConfig.openBrowser='+lStrUrlToNavigate)
	lIsReadyBrowser=IGNBrowserConfig.openBrowser(lStrUrlToNavigate,true,false,'','')
	if(lIsReadyBrowser){
		lIsRunNext=true
		IGNUemaHelper.printLog('lIsReadyBrowser=Yes')
	}else{
		lIsRunNext=false
		IGNUemaHelper.printLog('lIsReadyBrowser=No')
	}
	WebDriver lWebDriver=null
	String lMainWindow=''
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lWebDriver=DriverFactory.getWebDriver()
		if(IGNUemaHelper.checkObjectNullOfObject(lWebDriver)){
			IGNUemaHelper.delayThreadSecond(1)
			lWebDriver=DriverFactory.getWebDriver()
		}
		if(IGNUemaHelper.checkObjectNullOfObject(lWebDriver)){
			lIsRunNext=false
		}
		IGNUemaHelper.printLog('Found lWebDriver='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lMainWindow=lWebDriver.getWindowHandle()
		if(lMainWindow.length()<=0){
			IGNUemaHelper.delayThreadSecond(1)
			lMainWindow=lWebDriver.getWindowHandle()
		}
		if(lMainWindow.length()<=0){
			lIsRunNext=false
		}
	}
	Boolean lIsOpenNewBrowserTab=false
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lStrUrlToNavigate='https://www.ipchicken.com'
		lIsOpenNewBrowserTab=IGNUemaHelper.openNewBrowserTab(lWebDriver,lStrUrlToNavigate)
		if(lIsOpenNewBrowserTab){
			lIsRunNext=true
			IGNUemaHelper.printLog('lIsOpenNewBrowserTab=Yes')
		}else{
			lIsRunNext=false
			IGNUemaHelper.printLog('lIsOpenNewBrowserTab=No')
		}
	}
	Set<String> lSetWinHandle=null
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lSetWinHandle=lWebDriver.getWindowHandles()
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			IGNUemaHelper.delayThreadSecond(1)
			lSetWinHandle=lWebDriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(1)
				lSetWinHandle=lWebDriver.getWindowHandles()
			}
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			IGNUemaHelper.delayThreadSecond(2)
			lSetWinHandle=lWebDriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(2)
				lSetWinHandle=lWebDriver.getWindowHandles()
			}
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			IGNUemaHelper.delayThreadSecond(3)
			lSetWinHandle=lWebDriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(3)
				lSetWinHandle=lWebDriver.getWindowHandles()
			}
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			IGNUemaHelper.delayThreadSecond(4)
			lSetWinHandle=lWebDriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(4)
				lSetWinHandle=lWebDriver.getWindowHandles()
			}
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			lIsReadyBrowser=false
			lIsRunNext=false
			IGNUemaHelper.printLog('lSetWinHandle=Null')
		}else{
			IGNUemaHelper.printLog('lSetWinHandleSize='+lSetWinHandle.size().toString())
			if(lSetWinHandle.size()<=1){
				lIsReadyBrowser=false
				lIsRunNext=false
				IGNUemaHelper.printLog('lSetWinHandle<=1')
			}
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		for(String lStrWindowHandle in lSetWinHandle){
			if(lMainWindow.equals(lStrWindowHandle)){
				lWebDriver.close()
				IGNUemaHelper.printLog('lWebDriverCloselMainWindow='+lMainWindow)
				IGNUemaHelper.delayThreadSecond(1)
			}
		}
		lSetWinHandle=lWebDriver.getWindowHandles()
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			IGNUemaHelper.delayThreadSecond(1)
			lSetWinHandle=lWebDriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<1){
				IGNUemaHelper.delayThreadSecond(1)
				lSetWinHandle=lWebDriver.getWindowHandles()
			}
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetWinHandle)){
			lIsReadyBrowser=false
			lIsRunNext=false
			IGNUemaHelper.printLog('lSetWinHandle=Null')
		}else{
			IGNUemaHelper.printLog('lSetWinHandleSize='+lSetWinHandle.size().toString())
			if(lSetWinHandle.size()<1){
				lIsReadyBrowser=false
				lIsRunNext=false
				IGNUemaHelper.printLog('lSetWinHandle<1')
			}
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		for(String lStrWindowHandle in lSetWinHandle){
			lWebDriver.switchTo().window(lStrWindowHandle)
			IGNUemaHelper.printLog('lWebDriverSwitchToWindow='+lStrWindowHandle)
			IGNUemaHelper.delayThreadSecond(2)
			IGNUemaHelper.setBrowserWindowPosition(lWebDriver,0,0)
			IGNUemaHelper.delayThreadSecond(1)
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		String lStrUrlCurrent=lWebDriver.getCurrentUrl()
		if(!lStrUrlCurrent.contains('ipchicken.com')){
			WebUI.navigateToUrl(lStrUrlToNavigate)
			IGNUemaHelper.delayThreadSecond(2)
		}
		lStrUrlCurrent=lWebDriver.getCurrentUrl()
		if(lStrUrlCurrent.contains('ipchicken.com')){
			lIsRunNext=true
			IGNUemaHelper.printLog('lStrUrlToNavigate='+lStrUrlToNavigate+'|Yes')
		}else{
			lIsRunNext=false
			IGNUemaHelper.printLog('lStrUrlToNavigate='+lStrUrlToNavigate+'|No')
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		String lStrCssSelector01="document.querySelector('body table');"
		String lStrCssSelector02="document.querySelectorAll('body table');"
		String lStrCssSelector03=".querySelector('tbody > tr > td:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2) > font');"
		String lStrCssSelector04=".querySelectorAll('tbody');"
		WebElement lWebElementTable01=IGNUemaHelper.getWebElementFromCssSelector(lWebDriver,lStrCssSelector01)
		List<WebElement> lListWebElementTable01=IGNUemaHelper.getWebElementListFromCssSelector(lWebDriver,lStrCssSelector02)
		WebElement lWebElementChild01=null
		List<WebElement> lListWebElementChild01=null
		if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListWebElementTable01)){
			IGNUemaHelper.printLog('lListWebElementTable01=NullOrEmpty')
		}else{
			if(lListWebElementTable01.size()>3){
				lWebElementChild01=IGNUemaHelper.getChildWebElementFromCssSelector(lWebDriver,lListWebElementTable01[2],lStrCssSelector03)
				if(IGNUemaHelper.checkObjectNullOfObject(lWebElementChild01)){
					IGNUemaHelper.printLog('lWebElementChild01=Null')
				}else{
					IGNUemaHelper.printLog('lWebElementChild01='+lWebElementChild01.toString())
				}
				lListWebElementChild01=IGNUemaHelper.getChildWebElementListFromCssSelector(lWebDriver,lListWebElementTable01[2],lStrCssSelector04)
				if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListWebElementChild01)){
					IGNUemaHelper.printLog('lListWebElementChild01=NullOrEmpty')
				}else{
					IGNUemaHelper.printLog('lListWebElementChild01='+lListWebElementChild01.toString())
				}
			}else{
				IGNUemaHelper.printLog('lListWebElementTable01<=3')
			}
		}
		lLocatorCurrentIPAddress='b'
		WebElement lWebElementCurrentIPAddress=IGNUemaHelper.getWebElementFromCssLocator(lWebDriver,lLocatorCurrentIPAddress)
		if(IGNUemaHelper.checkObjectNullOfObject(lWebElementCurrentIPAddress)){
			IGNUemaHelper.delayThreadSecond(1)
			lWebElementCurrentIPAddress=IGNUemaHelper.getWebElementFromCssLocator(lWebDriver,lLocatorCurrentIPAddress)
		}
		if(IGNUemaHelper.checkObjectNullOfObject(lWebElementCurrentIPAddress)){
			lIsRunNext=false
			IGNUemaHelper.printLog('lWebElementCurrentIPAddress=Null')
		}else{
			IGNUemaHelper.printLog('lWebElementCurrentIPAddress='+lWebElementCurrentIPAddress.toString())
			IGNUemaHelper.webJsScrollToElement(lWebDriver,lWebElementCurrentIPAddress)
			IGNUemaHelper.webWheelScrollElement(lWebDriver,lWebElementCurrentIPAddress,500,0,0)
			String lStrCurrentIPAddress=IGNUemaHelper.getTextByWebElement(lWebDriver,lWebElementCurrentIPAddress).trim()
			if(lStrCurrentIPAddress.length()>0){
				lStrLogText='CurrentIPAddress='+lStrCurrentIPAddress
				lIsRunNext=true
				IGNUemaHelper.printLog(lStrLogText)
				IGNUemaHelper.delayThreadSecond(3)
			}else{
				lIsRunNext=false
				IGNUemaHelper.printLog('lStrCurrentIPAddress=Empty')
			}
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lStrUrlToNavigate='https://insure.uat-roojai.com/#/quotationInput'
		lLocatorToCheck01=IGNUemaHelper.getTagDataSeleniumKey('carBrand')
		WebUI.navigateToUrl(lStrUrlToNavigate)
		if(!IGNUemaHelper.checkElementVisibleByLocatorKs(lWebDriver,lLocatorToCheck01)){
			WebUI.navigateToUrl(lStrUrlToNavigate)
		}
		if(!IGNUemaHelper.checkElementVisibleByLocatorKs(lWebDriver,lLocatorToCheck01)){
			WebUI.refresh()
		}
		if(!IGNUemaHelper.checkElementVisibleByLocatorKs(lWebDriver,lLocatorToCheck01)){
			WebUI.navigateToUrl(lStrUrlToNavigate)
		}
		if(!IGNUemaHelper.checkElementVisibleByLocatorKs(lWebDriver,lLocatorToCheck01)){
			WebUI.refresh()
		}
		lIsReadyWeb=IGNUemaHelper.checkElementVisibleByLocatorKs(lWebDriver,lLocatorToCheck01)
		if(lIsReadyWeb){
			lStrLogText='lStrUrlToNavigate='+lStrUrlToNavigate+'|PASSED'
			lIsRunNext=true
			IGNUemaHelper.printLog(lStrLogText)
		}else{
			lStrLogText='lStrUrlToNavigate='+lStrUrlToNavigate+'|FAILED'
			lIsRunNext=false
			IGNUemaHelper.printLog(lStrLogText)
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		IGNUemaHelper.delayThreadSecond(10)
	}else{
		IGNUemaHelper.delayThreadSecond(5)
	}
	IGNUemaHelper.printLog('Email Sending Start')
	IGNBrowserConfig.closeBrowser()
	IGNBrowserConfig.killBrowserAll()
	IGNBrowserConfig.killBrowserGlobal()
	String lStrMailTo='chatchai.bun@roojai.com'
	String lStrDatetime=IGNUemaHelper.convertLocalDateTimeToString('yyyy/MM/dd HH:mm')
	String lStrProductName='IGN Config Testing'
	String lStrSubject=lStrProductName+': Automation report ['+lStrDatetime+'].'
	String lStrMessage=''
	if(lIsReadyBrowser){
		if(lIsReadyWeb){
			lStrMessage=IGNUemaHelper.getEmailBodyForReport(lStrProductName,lStrDatetime,'1','1','0','0')
			lIGNTestResultActualThisCase=IGNTestResultActual.PassedNoWarning
		}else{
			lStrMessage=IGNUemaHelper.getEmailBodyForReport(lStrProductName,lStrDatetime,'1','0','1','0')
			lIGNTestResultActualThisCase=IGNTestResultActual.FailedNoWarning
		}
	}else{
		lStrMessage=IGNUemaHelper.getEmailBodyForReport(lStrProductName,lStrDatetime,'1','0','0','1')
		lIGNTestResultActualThisCase=IGNTestResultActual.Error
	}
	String[] lArrayAttachFile=new String[1]
	lArrayAttachFile[0]=IGNUemaHelper.CURRENT_RUNNING_LOG_FULL_FILE_NAME
	if(IGNSendEmail.sendRoojaiReportTHA(lStrMailTo,lStrSubject,lStrMessage,lArrayAttachFile)){
		IGNUemaHelper.printLog('Email sent.')
	}else{
		IGNUemaHelper.printLog('Could not send email.')
	}
	IGNUemaHelper.printLog('Email Sending Stop')
	/*============================================================================YOUR CODE HERE============================================================================*/
}catch(Exception e){
	try{
		IGNUemaHelper.printLog('PageException='+e.message)
		IGNBrowserConfig.killBrowserAll()
	}catch(Exception ex){
		IGNUemaHelper.printLog('PageExceptionOfException='+ex.message)
	}
	lIGNTestResultActualThisCase=IGNTestResultActual.Error
}
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
try{
	switch(lIGNTestResultActualThisCase){
		case IGNTestResultActual.PassedNoWarning:
			KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.PassedWithWarning:
			KeywordUtil.markWarning(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.FailedNoWarning:
			KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.FailedWithWarning:
			KeywordUtil.markWarning(GlobalVariable.TestCaseFullName)
			break
		default:
			KeywordUtil.markError(GlobalVariable.TestCaseFullName)
			break
	}
}catch(Exception e){
}
return null