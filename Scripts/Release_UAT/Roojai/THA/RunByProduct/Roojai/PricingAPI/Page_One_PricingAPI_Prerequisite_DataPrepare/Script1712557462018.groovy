import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.Point as Point
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.By as By
import javax.swing.JOptionPane
import javax.swing.JFrame
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
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.ExcelData as ExcelData
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
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.*
import org.roojai.tha.types.pricingapi.THAPricingApiPrepareGenericDataInputUtil as THAPricingApiPrepareGenericDataInputUtil
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
Boolean lIsActualResult=false
//YOUR CODE HERE BEGIN
//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
THAPricingApiPrepareGenericDataInputUtil lCaseUtil=new THAPricingApiPrepareGenericDataInputUtil()
Boolean lIsGenericTestDataTransformedSuccess=lCaseUtil.inputGenericPricingApiDataToUserDataSheet()
lIsActualResult=lIsGenericTestDataTransformedSuccess
String lGenericTestDataTransformedSuccessMessage='Generic Test Data have been transformed successfully'
String lGenericTestDataTransformedFailureMessage='Generic Test Data have been failed in transformation'
if(lIsGenericTestDataTransformedSuccess){
	IGNUemaHelper.printLog(lGenericTestDataTransformedSuccessMessage)
	KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
}
else{
	IGNUemaHelper.printLog(lGenericTestDataTransformedFailureMessage)
	KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
}
//YOUR CODE HERE END
lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Stop>>'+GlobalVariable.CaseDateTimeEnd)
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
if(lIsActualResult){
	KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
}else{
	KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
	//IGNUemaHelper.FORCESTOP()
}
return null