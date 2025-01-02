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
	IGNTestManager lIGNTestManager01=IGNTestManagerHelperTHA.getIGNTestManagerInstance()
	IGNUemaHelper.printLog(lIGNTestManager01.getIsIGNTestManagerReady().toString())
	if(lIGNTestManager01.getIsIGNTestManagerReady()){
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestMandatoryParameter().getIsIGNTestMandatoryParameterReady().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestMandatoryParameter().getListIGNTestPreDefineParameterOneToOne().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestMandatoryParameter().getListIGNTestPreDefineParameterOneToMany().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigDataFileInputColMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigDataFileInputRowMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigDataFileOutputColMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigDataFileOutputRowMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigExcelFileInputColMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigExcelFileInputRowMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigExcelFileOutputColMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigExcelFileOutputRowMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigDataFileTemplateOutputColMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigDataFileTemplateOutputRowMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigExcelFileTemplateOutputColMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getNumConfigExcelFileTemplateOutputRowMax().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeSingle().size().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeMultiple().size().toString())
		IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeMultiple()[0]
		IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeMultipleByProgramParameterName(lIGNTestMasterFieldTypeMultiple01.getStrProgramParameterName())
		IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeMultipleByProjectFieldListFieldName(lIGNTestMasterFieldTypeMultiple01.getStrProjectFieldListFieldName())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeMultiple03.getNumDataCellColIndex().toString())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeMultiple03.getNumExcelCellColIndex().toString())
		IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeSingle()[0]
		IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lIGNTestMasterFieldTypeSingle01.getStrProgramParameterName())
		IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName(lIGNTestMasterFieldTypeSingle01.getStrProjectFieldListFieldName())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle03.getNumDataCellColIndex().toString())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle03.getNumExcelCellColIndex().toString())
		IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle04=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareAccountStage02DoManageFieldSfSwitchProfileToDo')
		IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle05=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Account_Stage_02_Do_Manage_Field_Sf_Switch_Profile_To_Do')
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle05.getNumDataCellColIndex().toString())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle05.getNumExcelCellColIndex().toString())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle05.getNumProjectFieldListFieldMasterTypeNum().toString())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle05.getMasterPairDefaultValue())
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle05.getMasterPairValueByKey('1'))
		IGNUemaHelper.printLog(lIGNTestMasterFieldTypeSingle05.getStrValidatedValueFromIGNTestDataFiledType(lIGNTestMasterFieldTypeSingle05.getMasterPairKeyByValue('Yes')))
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getMapProjectFieldListFieldMasterPairByProgramParameterName(lIGNTestMasterFieldTypeSingle05.getStrProgramParameterName()).toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getMapProjectFieldListFieldMasterPairByProjectFieldListFieldName(lIGNTestMasterFieldTypeSingle05.getStrProjectFieldListFieldName()).toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIsIGNTestMasterCaseFactoryReady())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeSingle().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeMultiple().toString())
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getMapIGNTestDataStoreMain().size().toString())
		IGNTestDataStoreMain lIGNTestDataStoreMain01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIGNTestDataStoreMainByCaseNumber(1)
		IGNUemaHelper.printLog(lIGNTestDataStoreMain01.getStrCaseIndex())
		IGNUemaHelper.printLog(lIGNTestDataStoreMain01.getMapDataInput().toString())
		Map lMapDataOutput01=lIGNTestDataStoreMain01.getMapDataOutput()
		IGNUemaHelper.printLog(lMapDataOutput01.toString())
		lMapDataOutput01.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListName','TEST')
		IGNUemaHelper.printLog(lMapDataOutput01.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListName'))
		IGNUemaHelper.printLog(lMapDataOutput01.toString())
		IGNUemaHelper.printLog(lIGNTestDataStoreMain01.applyMapDataOutputChanged(lMapDataOutput01).toString())
		IGNUemaHelper.printLog(lIGNTestDataStoreMain01.getParentIGNTestMasterCaseFactory().applyIGNTestDataStoreMainMapDataOutputChanged(lIGNTestDataStoreMain01.getNumCaseIndex(),lMapDataOutput01).toString())
		IGNTestDataStoreMain lIGNTestDataStoreMain02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIGNTestDataStoreMainByCaseNumber(1)
		Map lMapDataOutput02=lIGNTestDataStoreMain02.getMapDataOutput()
		IGNUemaHelper.printLog(lMapDataOutput02.toString())
		IGNTestDataStoreMain lIGNTestDataStoreMain03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIGNTestDataStoreMainByCaseNumber(6)
		IGNUemaHelper.printLog(lIGNTestDataStoreMain03.getStrCaseRefer())
		Map lMapDataOutput03=lIGNTestDataStoreMain03.getMapDataOutput()
		lMapDataOutput03.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListName','UKHFEWSSA')
		lIGNTestDataStoreMain03.applyMapDataOutputChanged(lMapDataOutput03)
		IGNUemaHelper.printLog(lIGNTestDataStoreMain03.getMapDataOutput().toString())
		IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(6)
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.MapCaseDataReferOutput.toString())
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.getIsIGNTestMasterCaseTypeMainValid().toString())
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.MapCaseDataReferOutput.toString())
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.MapCaseDataCurrentOutput.toString())
		lIGNTestMasterCaseTypeMain01.MapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListNameX','YUUECWS')
		lIGNTestMasterCaseTypeMain01.MapCaseDataCurrentOutput.put('GroupSfLightningShareAccountStage01DoVerifyFieldActualResultX','THIS_COL_SEQ')
		lIGNTestMasterCaseTypeMain01.MapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListName','YUUECWS')
		lIGNTestMasterCaseTypeMain01.MapCaseDataCurrentOutput.put('GroupSfLightningShareAccountStage01DoVerifyFieldActualResult','THIS_COL_SEQ')
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.MapCaseDataCurrentOutput.toString())
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.applyMapCaseDataCurrentOutputChanged().toString())
		IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMain01.getIGNTestDataStoreMainCurrent().getIsIGNTestDataStoreMainChanged().toString())
		IGNTestMasterCaseGroupTypeSheet lIGNTestMasterCaseGroupTypeSheet01=lIGNTestMasterCaseTypeMain01.CaseGroupFactory.addIGNTestMasterCaseGroupTypeSheet('First')
		if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheet01)){
			IGNUemaHelper.printLog(lIGNTestMasterCaseGroupTypeSheet01.getStrSheetName())
			IGNTestMasterCaseGroupTypeRow lIGNTestMasterCaseGroupTypeRow01=lIGNTestMasterCaseGroupTypeSheet01.addIGNTestMasterCaseGroupTypeRow()
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeRow01)){
				Map<String,String> lMapDataOutputList01=lIGNTestMasterCaseGroupTypeRow01.MapDataOutput
				lMapDataOutputList01.put('GroupAllGlobalShareControlStage01MainOutputItemIndex',lIGNTestMasterCaseGroupTypeRow01.getStrRowIndex())
				lMapDataOutputList01.put('GroupPricingApiShareQuoteMotorStage02DoGetPriceListOutputPriceApiEndPointSourceName','MY_ITEM_VALUE')
				lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName','MY_ITEM_VALUE')
				Map<String,String> lMapDataOutputList02=lIGNTestMasterCaseGroupTypeSheet01.getIGNTestMasterCaseGroupTypeRowMapDataOutput(lIGNTestMasterCaseGroupTypeRow01.getNumRowIndex())
				IGNUemaHelper.printLog(lMapDataOutputList01.toString())
				IGNUemaHelper.printLog(lMapDataOutputList02.toString())
			}
		}
		IGNUemaHelper.printLog(lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().saveIGNTestMasterCaseFactory().toString())
	}else{
		lIGNTestResultActualThisCase=IGNTestResultActual.FailedNoWarning
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