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
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationVerifyFactory
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationVerifyType
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationVerifyUtil
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
TestData dataInput=TestDataFactory.findTestData(THACriticalIllnessQuotationVerifyType.INPUT_DATA_FILE_NAME)
IGNUemaHelper.delayThreadSecond(1)
TestData dataOutput=TestDataFactory.findTestData(THACriticalIllnessQuotationVerifyType.OUTPUT_DATA_FILE_NAME)
IGNUemaHelper.delayThreadSecond(1)
THACriticalIllnessQuotationVerifyFactory caseFactory=new THACriticalIllnessQuotationVerifyFactory(dataInput)
caseFactory.CurrentCase=GlobalVariable.CaseNumber
THACriticalIllnessQuotationVerifyType caseData=caseFactory.CaseData()
Map caseInput=caseData.Input
Map caseOutput=caseData.Output
WebDriver driver=null
WebDriver selenium=null
THACriticalIllnessQuotationVerifyUtil caseUtil=null
Boolean runNext=false
/*Input
 caseInput.CriticalIllness01Input
 caseInput.CriticalIllness02Result
 caseInput.CriticalIllness03Detail1
 caseInput.CriticalIllness04Payment
 caseInput.ActualResult
 */
/*Output
 caseOutput.CriticalIllness01Input
 caseOutput.CriticalIllness02Result
 caseOutput.CriticalIllness03Detail1
 caseOutput.CriticalIllness04Payment
 caseOutput.ActualResult
 */
if(caseFactory.IsValid &&(caseFactory.CurrentCase>0)){
	IGNUemaHelper.printLog('caseFactory.IsValid=true')
	IGNUemaHelper.printLog(caseInput)
	if(GlobalVariable.BrowserInit){
		IGNUemaHelper.printLog('BrowserInit=true')
		IGNUemaHelper.printLog('Script Start')
		driver=DriverFactory.getWebDriver()
		selenium=driver
		caseUtil=new THACriticalIllnessQuotationVerifyUtil(driver,selenium)
		IGNUemaHelper.delayThreadSecond(0)
		runNext=caseUtil.inputVerify(caseInput,caseOutput)
		if(!runNext){
			caseOutput.ActualResult='Error'
		}
		lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
		GlobalVariable.CaseDateTimeEnd=lDateTimeNow
		caseOutput.ActualResult=caseOutput.ActualResult.toString()+'['+GlobalVariable.CaseDateTimeBegin+'-'+GlobalVariable.CaseDateTimeEnd+']'
		caseFactory.SaveOutput()
		IGNUemaHelper.writeLogStringToFile(IGNUemaHelper.concatMessageLeftRightByPipe(IGNUemaHelper.CURRENT_TEST_SUITE_FULL_NAME_WITH_CASE_NUMBER,caseOutput.ActualResult))
		GlobalVariable.PrevStatus=runNext
		if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
			try{
				if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
					WebUI.executeJavaScript('alert =function(message){return true;};',[''])
				}
				if(IGNUemaHelper.CURRENT_BROWSER_IS_CHROME){
					WebUI.executeJavaScript('alert("'+caseOutput.ActualResult+'");',[''])
					IGNUemaHelper.delayThreadSecond(5)
					WebUI.acceptAlert()
				}
			}catch(Exception exx){
			}
		}
		IGNUemaHelper.printLog(caseOutput)
		IGNUemaHelper.delayThreadSecond(0)
		IGNUemaHelper.printLog('Script Stop')
	}else{
		IGNUemaHelper.printLog('BrowserInit=false')
		caseFactory.SaveOutput()
	}
	KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
}else{
	IGNUemaHelper.printLog('caseFactory.IsValid=false')
	KeywordUtil.markError(GlobalVariable.TestCaseFullName)
	IGNUemaHelper.FORCESTOP()
}
//End Of Story
IGNUemaHelper.printLog('End Of Story')
IGNUemaHelper.delayThreadSecond(10)
if(GlobalVariable.BrowserInit){
	IGNBrowserConfig.closeBrowser()
}
lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Stop>>'+GlobalVariable.CaseDateTimeEnd)
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
return null