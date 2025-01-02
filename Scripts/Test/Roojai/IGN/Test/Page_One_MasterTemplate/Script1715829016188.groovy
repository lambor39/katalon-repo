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
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultActual
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultExpected
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestManager as IGNTestManager
import org.roojai.ignite.types.testmanager.*
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNTestResultActual lIGNTestResultActualThisCase=IGNTestResultActual.FailedNoWarning
try{
	/*============================================================================YOUR CODE HERE============================================================================*/
	Boolean lIsRunNext=true
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lIGNTestResultActualThisCase=IGNTestResultActual.PassedNoWarning
	}
	/*============================================================================YOUR CODE HERE============================================================================*/
}catch(Exception e){
	try{
		IGNUemaHelper.printLog('PageException='+e.message)
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