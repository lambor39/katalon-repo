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
import org.roojai.tha.core.THAGlobalConst as THAGlobalConst
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.core.THAUemaHelper as THAUemaHelper
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationInputFactory
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationInputType
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationInputUtil
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationResultFactory
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationResultType
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationResultUtil
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationDetail1Factory
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationDetail1Type
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationDetail1Util
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationPaymentFactory
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationPaymentType
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationPaymentUtil
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationVerifyFactory
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationVerifyType
import org.roojai.tha.types.roojaicriticalillness.THACriticalIllnessQuotationVerifyUtil
import org.roojai.ignite.core.IGNSendEmail as IGNSendEmail
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
//Test
Boolean lIsOnlyMe=THAGlobalConst.DEFAULT_EMAIL_ONLY_ME
Boolean lIsStop=THAGlobalConst.DEFAULT_EMAIL_STOP_SEND
//Summary
Integer lIndex=0
Integer lTotal=0
Integer lSuccess=0
Integer lFailed=0
Integer lErrors=0
TestData dataOutput=TestDataFactory.findTestData(THACriticalIllnessQuotationVerifyType.OUTPUT_DATA_FILE_NAME)
Integer dataColNum=dataOutput.getColumnNumbers()
String lText1=''
String lText2=''
for(lIndex=THACriticalIllnessQuotationVerifyType.OUTPUT_DATA_COL_BEGIN;lIndex<=dataColNum;lIndex++){
	lText1=''
	lText2=''
	lText1=dataOutput.getValue(lIndex,THACriticalIllnessQuotationVerifyType.OUTPUT_DATA_ROW_BEGIN).trim()
	lText2=dataOutput.getValue(lIndex,THACriticalIllnessQuotationVerifyType.OUTPUT_DATA_ROW_END).trim()
	if((lText1.length()>0)&&(lText2.length()>0)){
		lTotal=lTotal+1
		if(lText2.toUpperCase().contains('PASSED')){
			lSuccess=lSuccess+1
		}else if(lText2.toUpperCase().contains('FAILED')){
			lFailed=lFailed+1
		}else{
			lErrors=lErrors+1
		}
	}
}
IGNUemaHelper.printLog('Total:'+lTotal)
IGNUemaHelper.printLog('Success:'+lSuccess)
IGNUemaHelper.printLog('Failed:'+lFailed)
IGNUemaHelper.printLog('Errors:'+lErrors)
if(lIsStop){
	KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
	IGNUemaHelper.FORCESTOP()
}
//Message Info
String mailTo=''
if(lIsOnlyMe){
	mailTo=THAGlobalConst.DEFAULT_EMAIL_TO_ME
}else{
	mailTo=THAGlobalConst.DEFAULT_EMAIL_TO_PRODUCT_PROTECTION
}
String lstrDatetime=IGNUemaHelper.convertLocalDateTimeToString('yyyy/MM/dd HH:mm')
String lstrProductName='Quotation website (Critical Illness)'
String subject=lstrProductName+': Automation report ['+lstrDatetime+'].'
String message=THAUemaHelper.getEmailBodyForReport(lstrProductName,lstrDatetime,lTotal.toString(),lSuccess.toString(),lFailed.toString(),lErrors.toString())
//Attachments
String[] attachFiles=new String[1]
attachFiles[0]=THACriticalIllnessQuotationVerifyType.OUTPUT_EXCEL_FILE_NAME
if(lTotal>0){
	if(IGNSendEmail.sendRoojaiReportTHA(mailTo,subject,message,attachFiles)){
		IGNUemaHelper.printLog('Email sent.')
	}else{
		IGNUemaHelper.printLog('Could not send email.')
	}
}else{
	IGNUemaHelper.printLog('Not send email.')
}
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
return null