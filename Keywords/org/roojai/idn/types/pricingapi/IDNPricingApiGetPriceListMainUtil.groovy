package org.roojai.idn.types.pricingapi
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.keyword.excel.ExcelKeywords
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import groovy.sql.*
import internal.GlobalVariable
import org.apache.commons.lang3.math.NumberUtils
import org.apache.commons.lang3.StringUtils
import org.apache.groovy.json.internal.LazyMap
import org.apache.poi.ss.*
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.util.*
import org.apache.poi.xssf.usermodel.*
import java.text.SimpleDateFormat
import java.util.Date
import java.time.LocalDateTime
import java.time.LocalDate
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.types.pricingapi.IDNPricingApiGetPriceListCoreType as IDNPricingApiGetPriceListCoreType
import org.roojai.idn.types.pricingapi.IDNPricingApiRestAPIHelper as IDNPricingApiRestAPIHelper
import org.roojai.idn.types.pricingapi.IDNPricingApiPrepareGenericDataInputUtil
import org.roojai.idn.types.pricingapi.IDNPricingApiLibraryGetPriceListMainUtil
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList
import org.roojai.idn.core.IDNUemaHelper as IDNUemaHelper
public class IDNPricingApiGetPriceListMainUtil{
	private IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList parentStageController
	private IDNPricingApiLibraryGetPriceListMainUtil lIDNPricingApiLibraryGetPriceListMainUtil=null
	private IDNPricingApiLibraryGetPriceListMainUtil getlIDNPricingApiLibraryGetPriceListMainUtil(){
		return this.lIDNPricingApiLibraryGetPriceListMainUtil
	}
	public IDNPricingApiGetPriceListMainUtil(IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList initStageController){
		super()
		try{
			this.parentStageController=initStageController
		}catch(Exception e){
		}
	}
	public IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList getParentStageController(){
		try{
			return this.parentStageController
		}catch(Exception e){
		}
	}
	public void setParentStageController(IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList newParentStageController){
		//Do Nothing
		//this.parentStageController=newParentStageController
	}
	public static Integer CURRENT_NUMBER_OF_SUBSET=0
	public Boolean inputCase(){
		IGNUemaHelper.printLog('InsideMethod')
		Boolean lreturn=false
		String lPricingApiCallTokenKey=''
		String lPricingApiCallSdkVersion=''
		String lPricingApiCallProductType=''
		String lPricingApiCallMasterSetId=''
		String lPricingApiQuoteRequiredProductType=''
		String lPricingApiProductCode=''
		String lPricingApiQuoteRequiredTransactionType=''
		String lPricingApiQuoteRequiredQuoteDateToAdd=''
		String lPricingApiQuoteRequiredQuoteDateOffSetDay=''
		String lPricingApiQuoteRequiredQuoteDateText=''
		String lPricingApiQuoteOptionalGeoPostalCodeToAdd=''
		String lPricingApiQuoteOptionalGeoPostalCode=''
		String lPricingApiQuoteOptionalCover=''
		String lPricingApiQuoteOptionalHealthQuestionToAdd=''
		String lPricingApiQuoteOptionalHealthQuestionMain=''
		String lPricingApiQuoteOptionalPolicyAutoRenewalToAdd=''
		String lPricingApiQuoteOptionalPolicyAutoRenewalMain=''
		String lPricingApiQuoteOptionalPolicyStartDateToAdd=''
		String lPricingApiQuoteOptionalPolicyStartDateOffsetDay=''
		String lPricingApiQuoteOptionalPolicyStartDateText=''
		String lPricingApiQuoteOptionalPolicyEndDateToAdd=''
		String lPricingApiQuoteOptionalPolicyEndDateOffsetDay=''
		String lPricingApiQuoteOptionalPolicyEndDateText=''
		String lPricingApiQuoteOptionalFirstQuoteDateToAdd=''
		String lPricingApiQuoteOptionalFirstQuoteDateOffsetDay=''
		String lPricingApiQuoteOptionalFirstQuoteDateText=''
		String lPricingApiQuoteOptionalPolicyRenewalInviteCountToAdd=''
		String lPricingApiQuoteOptionalPolicyRenewalInviteCountMain=''
		String lPricingApiQuoteOptionalEndorsementEffectiveDateToAdd=''
		String lPricingApiQuoteOptionalEndorsementEffectiveDateOffsetDay=''
		String lPricingApiQuoteOptionalEndorsementEffectiveDateText=''
		String lPricingApiJsonRootVehicleData=''
		String lPricingApiJsonRootQuotationInputPartOne=''
		String lPricingApiJsonRootQuotationInputPartTwo=''
		String lPricingApiJsonRootPlanOptionPartOne=''
		String lPricingApiJsonRootPlanOptionPartTwo=''
		String lPricingApiJsonRootMultiCoverPartOne=''
		String lPricingApiJsonRootMultiCoverPartTwo=''
		String lPricingApiJsonRootAdditionalCoveragePartOne=''
		String lPricingApiJsonRootAdditionalCoveragePartTwo=''
		String lPricingApiJsonRootPaymentPartOne=''
		String lPricingApiJsonRootPaymentPartTwo=''
		String lPricingApiJsonRootInputPremiumPartOne=''
		String lPricingApiJsonRootInputPremiumPartTwo=''
		String lPricingApiJsonRootTransactionPartOne=''
		String lPricingApiJsonRootTransactionPartTwo=''
		String lPricingApiJsonRootTotalPremiumPartOne=''
		String lPricingApiJsonRootTotalPremiumPartTwo=''
		String lPricingApiLibraryHostUrl=''
		String lPositiveCase=''
		String lActualResult=''
		String lResultMessage=''
		String lReferCaseNumber=''
		try{
			Boolean lIsReferCaseDataToUse=this.parentStageController.getParentIGNTestExecutorTypeItem().getIsTestCaseRefer()
			lReferCaseNumber=this.parentStageController.getParentIGNTestExecutorTypeItem().getStrTestCaseDataCurrentInputTestCaseReferCaseNumber()
			lPricingApiCallTokenKey=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallTokenKey
			lPricingApiCallSdkVersion=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallSdkVersion
			lPricingApiCallProductType=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallProductType
			lPricingApiCallMasterSetId=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallMasterSetId
			lPricingApiQuoteRequiredProductType=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			lPricingApiProductCode=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiProductCode
			lPricingApiQuoteRequiredTransactionType=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			lPricingApiQuoteRequiredQuoteDateToAdd=''
			lPricingApiQuoteRequiredQuoteDateOffSetDay=''
			lPricingApiQuoteRequiredQuoteDateText=''
			lPricingApiQuoteOptionalGeoPostalCodeToAdd=''
			lPricingApiQuoteOptionalGeoPostalCode=''
			lPricingApiQuoteOptionalCover=''
			lPricingApiQuoteOptionalHealthQuestionToAdd=''
			lPricingApiQuoteOptionalHealthQuestionMain=''
			lPricingApiQuoteOptionalPolicyAutoRenewalToAdd=''
			lPricingApiQuoteOptionalPolicyAutoRenewalMain=''
			lPricingApiQuoteOptionalPolicyStartDateToAdd=''
			lPricingApiQuoteOptionalPolicyStartDateOffsetDay=''
			lPricingApiQuoteOptionalPolicyStartDateText=''
			lPricingApiQuoteOptionalPolicyEndDateToAdd=''
			lPricingApiQuoteOptionalPolicyEndDateOffsetDay=''
			lPricingApiQuoteOptionalPolicyEndDateText=''
			lPricingApiQuoteOptionalFirstQuoteDateToAdd=''
			lPricingApiQuoteOptionalFirstQuoteDateOffsetDay=''
			lPricingApiQuoteOptionalFirstQuoteDateText=''
			lPricingApiQuoteOptionalPolicyRenewalInviteCountToAdd=''
			lPricingApiQuoteOptionalPolicyRenewalInviteCountMain=''
			lPricingApiQuoteOptionalEndorsementEffectiveDateToAdd=''
			lPricingApiQuoteOptionalEndorsementEffectiveDateOffsetDay=''
			lPricingApiQuoteOptionalEndorsementEffectiveDateText=''
			lPricingApiJsonRootVehicleData=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootVehicleData
			lPricingApiJsonRootQuotationInputPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootQuotationInputPartOne
			lPricingApiJsonRootQuotationInputPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootQuotationInputPartTwo
			lPricingApiJsonRootPlanOptionPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPlanOptionPartOne
			lPricingApiJsonRootPlanOptionPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPlanOptionPartTwo
			lPricingApiJsonRootMultiCoverPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootMultiCoverPartOne
			lPricingApiJsonRootMultiCoverPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootMultiCoverPartTwo
			lPricingApiJsonRootAdditionalCoveragePartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootAdditionalCoveragePartOne
			lPricingApiJsonRootAdditionalCoveragePartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootAdditionalCoveragePartTwo
			lPricingApiJsonRootPaymentPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPaymentPartOne
			lPricingApiJsonRootPaymentPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPaymentPartTwo
			lPricingApiJsonRootInputPremiumPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootInputPremiumPartOne
			lPricingApiJsonRootInputPremiumPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootInputPremiumPartTwo
			lPricingApiJsonRootTransactionPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTransactionPartOne
			lPricingApiJsonRootTransactionPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTransactionPartTwo
			lPricingApiJsonRootTotalPremiumPartOne=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTotalPremiumPartOne
			lPricingApiJsonRootTotalPremiumPartTwo=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTotalPremiumPartTwo
			lPricingApiLibraryHostUrl=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiLibraryHostUrl
			lPositiveCase=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPositiveCase
			lActualResult=''
			lResultMessage=''
			List lPricingApiJsonRootQuotationInputList=[]
			lPricingApiJsonRootQuotationInputList.add(lPricingApiJsonRootQuotationInputPartOne)
			lPricingApiJsonRootQuotationInputList.add(lPricingApiJsonRootQuotationInputPartTwo)
			String lPricingApiJsonRootQuotationInput=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootQuotationInputList)
			IGNUemaHelper.printLog('lPricingApiJsonRootQuotationInput')
			IGNUemaHelper.printLog(lPricingApiJsonRootQuotationInput)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootQuotationInput)){
				return lreturn
			}
			List lPricingApiJsonRootPlanOptionList=[]
			lPricingApiJsonRootPlanOptionList.add(lPricingApiJsonRootPlanOptionPartOne)
			lPricingApiJsonRootPlanOptionList.add(lPricingApiJsonRootPlanOptionPartTwo)
			String lPricingApiJsonRootPlanOption=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootPlanOptionList)
			IGNUemaHelper.printLog('lPricingApiJsonRootPlanOption')
			IGNUemaHelper.printLog(lPricingApiJsonRootPlanOption)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootPlanOption)){
				return lreturn
			}
			List lPricingApiJsonRootMultiCoverList=[]
			lPricingApiJsonRootMultiCoverList.add(lPricingApiJsonRootMultiCoverPartOne)
			lPricingApiJsonRootMultiCoverList.add(lPricingApiJsonRootMultiCoverPartTwo)
			String lPricingApiJsonRootMultiCover=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootMultiCoverList)
			IGNUemaHelper.printLog('lPricingApiJsonRootMultiCover')
			IGNUemaHelper.printLog(lPricingApiJsonRootMultiCover)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootMultiCover)){
				return lreturn
			}
			List lPricingApiJsonRootAdditionalCoverageDataList=[]
			lPricingApiJsonRootAdditionalCoverageDataList.add(lPricingApiJsonRootAdditionalCoveragePartOne)
			lPricingApiJsonRootAdditionalCoverageDataList.add(lPricingApiJsonRootAdditionalCoveragePartTwo)
			String lPricingApiJsonRootAdditionalCoverage=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootAdditionalCoverageDataList)
			IGNUemaHelper.printLog('lPricingApiJsonRootAdditionalCoverage')
			IGNUemaHelper.printLog(lPricingApiJsonRootAdditionalCoverage)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootAdditionalCoverage)){
				return lreturn
			}
			List lPricingApiJsonRootPaymentList=[]
			lPricingApiJsonRootPaymentList.add(lPricingApiJsonRootPaymentPartOne)
			lPricingApiJsonRootPaymentList.add(lPricingApiJsonRootPaymentPartTwo)
			String lPricingApiJsonRootPayment=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootPaymentList)
			IGNUemaHelper.printLog('lPricingApiJsonRootPayment')
			IGNUemaHelper.printLog(lPricingApiJsonRootPayment)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootPayment)){
				return lreturn
			}
			List lPricingApiJsonRootInputPremiumList=[]
			lPricingApiJsonRootInputPremiumList.add(lPricingApiJsonRootInputPremiumPartOne)
			lPricingApiJsonRootInputPremiumList.add(lPricingApiJsonRootInputPremiumPartTwo)
			String lPricingApiJsonRootInputPremium=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootInputPremiumList)
			IGNUemaHelper.printLog('lPricingApiJsonRootInputPremium')
			IGNUemaHelper.printLog(lPricingApiJsonRootInputPremium)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootInputPremium)){
				return lreturn
			}
			List lPricingApiJsonRootTransactionList=[]
			lPricingApiJsonRootTransactionList.add(lPricingApiJsonRootTransactionPartOne)
			lPricingApiJsonRootTransactionList.add(lPricingApiJsonRootTransactionPartTwo)
			String lPricingApiJsonRootTransaction=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootTransactionList)
			IGNUemaHelper.printLog('lPricingApiJsonRootTransaction')
			IGNUemaHelper.printLog(lPricingApiJsonRootTransaction)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootTransaction)){
				return lreturn
			}
			List lPricingApiJsonRootTotalPremiumList=[]
			lPricingApiJsonRootTotalPremiumList.add(lPricingApiJsonRootTotalPremiumPartOne)
			lPricingApiJsonRootTotalPremiumList.add(lPricingApiJsonRootTotalPremiumPartTwo)
			String lPricingApiJsonRootTotalPremium=IGNUemaHelper.getStringDecodedForExcelCell(lPricingApiJsonRootTotalPremiumList)
			IGNUemaHelper.printLog('lPricingApiJsonRootPayment')
			IGNUemaHelper.printLog(lPricingApiJsonRootTotalPremium)
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootTotalPremium)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiJsonRootVehicleData)){
				return lreturn
			}
			Integer lProductCode=IGNUemaHelper.convertStringToInteger(lPricingApiProductCode,0)
			Workbook lTestExcelFileGenericTestDataWorkBook=null
			Sheet lPricingApiSheet=null
			String lExcelGenericFilename=''
			String lMacroGenericFileName=''
			String lFileSourcePath='Data Files/Release_UAT/Roojai/IDN/'
			List<String> lPricingApiFileList=IDNUemaHelper.getPricingApiFileList(lFileSourcePath)
			List<String> lPricingApiExcelFilePathList=[]
			List<String> lPricingApiMacroFilePathList=[]
			for(Integer lTargetFileIndex=0;lTargetFileIndex<=lPricingApiFileList.size()-1;lTargetFileIndex++){
				String lFileName=lPricingApiFileList.get(lTargetFileIndex)
				if(lFileName.contains('IGNGenericTemplatePricingAPI')){
					if(lFileName.contains('.xlsx')){
						lPricingApiExcelFilePathList.add(lFileName)
					}
					else{
						lPricingApiMacroFilePathList.add(lFileName)
					}
				}
			}
			for(Integer lMainIndex=0;lMainIndex<=lPricingApiExcelFilePathList.size()-1;lMainIndex++){
				String lExcelFilename=lPricingApiExcelFilePathList.get(lMainIndex)
				String lMacroFileName=lPricingApiMacroFilePathList.get(lMainIndex)
				if(lExcelFilename.contains(lPricingApiCallProductType)){
					lExcelGenericFilename=lExcelFilename
				}
				if(lMacroFileName.contains(lPricingApiCallProductType)){
					lMacroGenericFileName=lMacroFileName
				}
			}
			lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(lExcelGenericFilename)
			IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME=lExcelGenericFilename
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileGenericTestDataWorkBook)){
				IGNUemaHelper.printLog('PricingApi Generic Workbook not valid')
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(lPricingApiSheet)){
				IGNUemaHelper.printLog('PricingApi Generic  Sheet not valid')
				return lreturn
			}
			Boolean lIsActualResult=false
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult=lActualResult
			Map lMapRegisterCallRequestParameter=[:]
			Map lMapPricingApiCallTokenKey=inputQuoteRequiredCallTokenKey(lPricingApiCallTokenKey)
			if(lMapPricingApiCallTokenKey.Result){
				lPricingApiCallTokenKey=lMapPricingApiCallTokenKey.CallTokenKey
			}else{
				lPricingApiCallTokenKey=''
			}
			lMapRegisterCallRequestParameter.put('PricingApiCallTokenKey',lPricingApiCallTokenKey)
			Map lMapPricingApiCallSdkVersion=inputQuoteRequiredCallSdkVersion(lPricingApiCallSdkVersion)
			if(lMapPricingApiCallSdkVersion.Result){
				lPricingApiCallSdkVersion=lMapPricingApiCallSdkVersion.CallSdkVersion
			}else{
				lPricingApiCallSdkVersion=''
			}
			lMapRegisterCallRequestParameter.put('PricingApiCallSdkVersion',lPricingApiCallSdkVersion)
			Map lMapPricingApiCallProductType=inputQuoteRequiredCallProductType(lPricingApiCallProductType)
			if(lMapPricingApiCallProductType.Result){
				lPricingApiCallProductType=lMapPricingApiCallProductType.CallProductType
			}else{
				lPricingApiCallProductType=''
			}
			lMapRegisterCallRequestParameter.put('PricingApiCallProductType',lPricingApiCallProductType)
			Map lMapPricingApiCallMasterSetId=inputQuoteRequiredCallMasterSetId(lPricingApiCallMasterSetId)
			if(lMapPricingApiCallMasterSetId.Result){
				lPricingApiCallMasterSetId=lMapPricingApiCallMasterSetId.CallMasterSetId
			}else{
				lPricingApiCallMasterSetId=''
			}
			lMapRegisterCallRequestParameter.put('PricingApiCallMasterSetId',lPricingApiCallMasterSetId)
			Map lMapPricingApiInput=[:]
			Map lMapPricingApiQuoteRequiredProductType=this.inputQuoteRequiredProductType(lPricingApiQuoteRequiredProductType)
			if(lMapPricingApiQuoteRequiredProductType.Result){
				lPricingApiQuoteRequiredProductType=lMapPricingApiQuoteRequiredProductType.QuoteRequiredProductType
			}else{
				lPricingApiQuoteRequiredProductType=''
			}
			lMapPricingApiInput.put('QuoteRequiredProductType',lPricingApiQuoteRequiredProductType)
			Map lMapPricingApiQuoteRequiredTransactionType=this.inputQuoteRequiredTransactionType(lPricingApiQuoteRequiredTransactionType)
			if(lMapPricingApiQuoteRequiredTransactionType.Result){
				lPricingApiQuoteRequiredTransactionType=lMapPricingApiQuoteRequiredTransactionType.QuoteRequiredTransactionType
			}else{
				lPricingApiQuoteRequiredTransactionType=''
			}
			Integer lDataSubsetIndex=0
			lMapPricingApiInput.put('QuoteRequiredTransactionType',lPricingApiQuoteRequiredTransactionType)
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lMapPricingApiInput.put('PositiveCase',lIsPositiveCase)
			Map lMapPreviousCover=[:]
			Sheet lMasterDataSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'MasterData-Mapping')
			if(lIsReferCaseDataToUse){
				Map lMapPricingApiEndorsementOrCancellationRequestBodyDataResult=this.inputPricingApiEndorsementOrCancellationRequestBodyData(lPricingApiJsonRootQuotationInput,lMasterDataSheet)
				if(lMapPricingApiEndorsementOrCancellationRequestBodyDataResult.Result){
					lPricingApiJsonRootQuotationInput=lMapPricingApiEndorsementOrCancellationRequestBodyDataResult.PricingApiEndorsementOrCancellationRequestBodyData
				}else{
					return lreturn
				}
			}
			IGNUemaHelper.printLog(lPricingApiJsonRootQuotationInput)
			Map lMapPricingApiInputOutput=[:]
			lIDNPricingApiLibraryGetPriceListMainUtil=new IDNPricingApiLibraryGetPriceListMainUtil()
			Boolean lIsInit=this.inputInitPricingApiInputOutput(lMapPricingApiInputOutput)
			IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_PRODUCT_TYPE=lPricingApiQuoteRequiredProductType
			Boolean lIsRegClientOK=false,lIsMultiPlanOK=false,lIsGetPlanOK=false,lIsGetPlanWithInstallmentOK=false,lIsAdditionalCoveragePremiumValidationOK=true,lIsPremiumValidationOK=false
			String lPricingApiRegisterClientInputRequestBodyContent=this.inputPricingApiRegisterClientSetRequestBodyContent(lMapRegisterCallRequestParameter)
			List lOutputPricingApiQuotePlanList=new ArrayList()
			List lOutputPricingApiQuotePlanWithInstallmentList=new ArrayList()
			lMapPricingApiInputOutput.RegisterClientRequest=lPricingApiRegisterClientInputRequestBodyContent
			Boolean lIsRegisterClientApiCallResult=this.initPricingApiRegisterClientApiRequest(lPricingApiRegisterClientInputRequestBodyContent,lMapPricingApiInputOutput)
			if(lIsRegisterClientApiCallResult){
				lIsRegClientOK=true
			}
			String lPricingApiMultiplePlanPriceUrl=lMapPricingApiInputOutput.RegisterClientServiceDataPricingMultiplePlanPriceUrl
			IGNUemaHelper.printLog('lPricingApiMultiplePlanPriceUrl')
			IGNUemaHelper.printLog(lPricingApiMultiplePlanPriceUrl)
			String lPolicyPaymentFrequency=''
			List lSubSetList=[]
			List lReferSubSetList=[]
			if(lIsRegClientOK){
				Map lMapJson=new JsonSlurper().parseText(lPricingApiJsonRootMultiCover)
				List lCoverList=lMapJson.CoverList
				IGNUemaHelper.printLog(lPricingApiJsonRootAdditionalCoverage)
				Map lMapAdditionalCoverageJson=new JsonSlurper().parseText(lPricingApiJsonRootAdditionalCoverage)
				Map lMapPricingApiJsonRootAdditionalCoverageList=lMapAdditionalCoverageJson.AdditionalCoverageList
				List lMapPricingApiJsonRootAdditionalCoverageListAll=lMapPricingApiJsonRootAdditionalCoverageList.AdditionalCoverage
				List lPricingApiCoverageListAll=[]
				List lPricingApiCoverName=[]
				List lQuoteTransactionDateList=[]
				String lMultiCoverName=''
				for(Integer lIndex=0;lIndex<=lCoverList.size()-1;lIndex++){
					String lAdditionalCoverageName=''
					List lPricingApiCoverageNameList=[]
					List lSelectedCoverList=lCoverList.get(lIndex)
					Object lObjectSelectedAdditionalCoverageList=lMapPricingApiJsonRootAdditionalCoverageListAll.get(lIndex)
					List lSelectedAdditionalCoverageList=[]
					IGNUemaHelper.printLog(lObjectSelectedAdditionalCoverageList.getClass())
					if(lObjectSelectedAdditionalCoverageList.getClass()==LazyMap.class){
						Map lMapSelectedAdditionalCoverage=lMapPricingApiJsonRootAdditionalCoverageListAll.get(lIndex)
						lSelectedAdditionalCoverageList.add(lMapSelectedAdditionalCoverage)
					}
					else if(lObjectSelectedAdditionalCoverageList.getClass()==ArrayList.class){
						lSelectedAdditionalCoverageList=lMapPricingApiJsonRootAdditionalCoverageListAll.get(lIndex)
					}
					for(Integer lListIndex=0;lListIndex<=lSelectedCoverList.size()-1;lListIndex++){
						lMultiCoverName=lSelectedCoverList.get(lListIndex)
						Map lSelectedAdditionalCoverage=lSelectedAdditionalCoverageList.get(lListIndex)
						for(Map.Entry lEntry : lSelectedAdditionalCoverage.entrySet()){
							String lKey=lEntry.getKey()
							if(lKey.endsWith('Name')){
								lAdditionalCoverageName=lKey.replace('Name','')
								String lValue=lEntry.getValue()
								if(lValue!='None'){
									lPricingApiCoverageNameList.add(lValue)
								}
							}
						}
					}
					lPricingApiCoverageListAll.add(lPricingApiCoverageNameList)
					lPricingApiCoverName.add(lMultiCoverName)
				}
				String lStartDateText=''
				String lEndorsementEffectiveDateText=''
				Map lMapJsonRootVehicleData=new JsonSlurper().parseText(lPricingApiJsonRootVehicleData)
				IGNUemaHelper.printLog(lMapJsonRootVehicleData)
				lQuoteTransactionDateList=lMapJsonRootVehicleData.QuotationInputDateList
				Map lMapJsonRootQuotationInput=new JsonSlurper().parseText(lPricingApiJsonRootQuotationInput)
				if(lPricingApiQuoteRequiredTransactionType=='Endorsement'||lPricingApiQuoteRequiredTransactionType=='Cancellation'){
					lMapPreviousCover=lMapJsonRootQuotationInput.root.Quote.PreviousCovers
					String lEndorseCancellationMethod=lMapJsonRootQuotationInput.root.Quote.Endorsement_Cancellation_Method
					for(Integer lDateIndex=0;lDateIndex<=lQuoteTransactionDateList.size()-1;lDateIndex++){
						IGNUemaHelper.printLog(lDateIndex+'lDateIndex')
						Map lTransactionDate=lQuoteTransactionDateList.get(lDateIndex)
						Map lTransactionEndorseCancellationMethod=lTransactionDate.EndorseCancellationMethod
						Integer lEndorseCancellationMethodRowNumber=lTransactionEndorseCancellationMethod.RowNumber
						Integer lEndorseCancellationMethodColumnNumber=lTransactionEndorseCancellationMethod.ColumnNumber
						Boolean lIsWriteEndorseCancellationMethodToExcelDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lEndorseCancellationMethodRowNumber,lEndorseCancellationMethodColumnNumber,lEndorseCancellationMethod)
						if(!lIsWriteEndorseCancellationMethodToExcelDone){
							return lreturn
						}
					}
				}
				Map lMapRootParameterWithMasterDataParmeter=[:]
				Map lMapRootParameterWithMasterDataParmeterResult=IDNPricingApiPrepareGenericDataInputUtil.inputMapTargetParameterWithMasterParameter(lMasterDataSheet,'Root')
				IGNUemaHelper.printLog('lMapRootParameterWithMasterDataParmeter')
				IGNUemaHelper.printLog(lMapRootParameterWithMasterDataParmeterResult)
				if(lMapRootParameterWithMasterDataParmeterResult.Result){
					lMapRootParameterWithMasterDataParmeter=lMapRootParameterWithMasterDataParmeterResult.MasterDataParameter
				}
				Boolean lIsJsonQuotationInputStructureValidationOK=true
				Object lObjectMapJsonQuotationInputRoot=lMapJsonRootQuotationInput.get('root')
				if(IGNUemaHelper.checkObjectNullOfObject(lObjectMapJsonQuotationInputRoot)){
					return lreturn
				}else{
					for(Map.Entry lEntry in lMapRootParameterWithMasterDataParmeter){
						String lKey=lEntry.getKey()
						String lValue=lEntry.getValue()
						Map lMapJsonQuotationInput=lObjectMapJsonQuotationInputRoot
						Object lObjectJsonQuotationInputQuoteData=lMapJsonQuotationInput.get(lKey)
						if(!IGNUemaHelper.checkObjectNullOfObject(lObjectJsonQuotationInputQuoteData)){
							String[] lQuoteValueList=lValue.split('/')
							Map lMapQuotationInputQuoteData=lObjectJsonQuotationInputQuoteData
							for(Integer lIndex=0;lIndex<=lQuoteValueList.size()-1;lIndex++){
								String lRequiredQuoteParameterName=lQuoteValueList[lIndex]
								Object lObjectQuotationInputQuoteData=lMapQuotationInputQuoteData.get(lRequiredQuoteParameterName)
								if(IGNUemaHelper.checkObjectNullOfObject(lObjectQuotationInputQuoteData)){
									lIsJsonQuotationInputStructureValidationOK=false
								}
							}
						}else{
							lIsJsonQuotationInputStructureValidationOK=false
							break
						}
					}
				}
				if(lIsJsonQuotationInputStructureValidationOK){
					String lStartDateOffset=lMapJsonRootQuotationInput.root.Quote.Policy_Start_Date
					Map lMapQuoteStartDate=this.inputQuoteOptionalPolicyStartDate('Yes',lStartDateOffset,'')
					if(lMapQuoteStartDate.Result){
						lStartDateText=lMapQuoteStartDate.QuoteOptionalPolicyStartDate
						lMapJsonRootQuotationInput.root.Quote.put('Policy_Start_Date',lStartDateText)
						lMapJsonRootQuotationInput.root.Quote.put('Quote_Date_of_First_Quote',lStartDateText)
					}
					Map lMapQuoteRequiredQuoteDate=this.inputQuoteRequiredQuoteDate('Yes',lStartDateOffset,'')
					if(lMapQuoteRequiredQuoteDate.Result){
						String lQuoteDateValue=lMapQuoteRequiredQuoteDate.QuoteRequiredQuoteDate
						lMapJsonRootQuotationInput.root.Quote.put('Quote_Date_of_Quote',lQuoteDateValue)
					}
					lMapPricingApiInputOutput.put('QuotePolicyStartDate',lStartDateText)
					IGNUemaHelper.printLog('lEffectiveDateOffset')
					IGNUemaHelper.printLog(lPricingApiQuoteRequiredTransactionType)
					if(lPricingApiQuoteRequiredTransactionType=='New Biz'){
						lEndorsementEffectiveDateText=lStartDateText
						lMapJsonRootQuotationInput.root.Quote.put('Endorsement_Effective_Date',lEndorsementEffectiveDateText)
					}else{
						String lEffectiveDateOffset=lMapJsonRootQuotationInput.root.Quote.Endorsement_Effective_Date
						IGNUemaHelper.printLog('lEffectiveDateOffset')
						IGNUemaHelper.printLog(lEffectiveDateOffset)
						Map lMapQuoteEffectiveDate=this.inputQuoteOptionalEndorsementEffectiveDate('Yes',lEffectiveDateOffset,'')
						if(lMapQuoteEffectiveDate.Result){
							lEndorsementEffectiveDateText=lMapQuoteEffectiveDate.QuoteOptionalEndorsementEffectiveDate
							lMapJsonRootQuotationInput.root.Quote.put('Endorsement_Effective_Date',lEndorsementEffectiveDateText)
						}
					}
					lMapPricingApiInputOutput.put('QuotePolicyEndorsementEffectiveDate',lEndorsementEffectiveDateText)
					IGNUemaHelper.printLog('PolicyStartDateCheck')
					for(Integer lDateIndex=0;lDateIndex<=lQuoteTransactionDateList.size()-1;lDateIndex++){
						IGNUemaHelper.printLog(lDateIndex+'lDateIndex')
						Map lTransactionDate=lQuoteTransactionDateList.get(lDateIndex)
						Map lTransactionStartDate=lTransactionDate.StartDate
						Map lTransactionEffectiveDate=lTransactionDate.EffectiveDate
						Map lTransactionFirstQuote=lTransactionDate.FirstQuote
						Integer lStartDateRowNumber=lTransactionStartDate.RowNumber
						Integer lStartDateColumnNumber=lTransactionStartDate.ColumnNumber
						Boolean lIsWriteStartDateTextToExcelDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lStartDateRowNumber,lStartDateColumnNumber,lStartDateText)
						if(!lIsWriteStartDateTextToExcelDone){
							return lreturn
						}
						Integer lEffectiveDateRowNumber=lTransactionEffectiveDate.RowNumber
						Integer lEffectiveDateColumnNumber=lTransactionEffectiveDate.ColumnNumber
						Boolean lIsWriteEffectiveDateTextToExcelDone=false
						if(lPricingApiQuoteRequiredTransactionType=='Endorsement'||lPricingApiQuoteRequiredTransactionType=='Cancellation'){
							lIsWriteEffectiveDateTextToExcelDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lEffectiveDateRowNumber,lEffectiveDateColumnNumber,lEndorsementEffectiveDateText)
						}else{
							lIsWriteEffectiveDateTextToExcelDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lEffectiveDateRowNumber,lEffectiveDateColumnNumber,lStartDateText)
						}
						if(!lIsWriteEffectiveDateTextToExcelDone){
							return lreturn
						}
						Integer lFirstQuoteRowNumber=lTransactionFirstQuote.RowNumber
						Integer lFirstQuoteColumnNumber=lTransactionFirstQuote.ColumnNumber
						Boolean lIsWriteFirstQuoteTextToExcelDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lFirstQuoteRowNumber,lFirstQuoteColumnNumber,lStartDateText)
						if(!lIsWriteFirstQuoteTextToExcelDone){
							return lreturn
						}
					}
					try{
						IGNUemaHelper.printLog('Excel:Saving')
						IGNUemaHelper.saveExcelWorkbookByFileName(lExcelGenericFilename,lTestExcelFileGenericTestDataWorkBook)
					}catch(Exception ex){
						return lreturn
					}
					if(IGNUemaHelper.checkStringContainString(lPricingApiQuoteRequiredProductType,'Motor')){
						Map lMapVehicleData=lMapJsonRootVehicleData.VehicleData
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(lExcelGenericFilename)
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						lMasterDataSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'MasterData-Mapping')
						if(!IGNUemaHelper.checkObjectEmptyOfMap(lMapVehicleData)){
							String lVehicleMake=lMapVehicleData.Make
							String lVehicleModel=lMapVehicleData.Model
							String lVehicleYearOfManufacture=lMapVehicleData.YOM
							String lVehicleSubModel=lMapVehicleData.SubModel
							Map lMapVehicleDataResult=IDNPricingApiHelper.getVehicleDataTable(lVehicleMake,lVehicleModel,lVehicleYearOfManufacture,lVehicleSubModel)
							List<GroovyRowResult> lVehicleDataResultSet=[]
							Map lMapRedBookVehicleDataParameterWithMasterParameter=[:]
							Map lMapRedBookVehicleDataParameterWithMasterParameterResult=IDNPricingApiPrepareGenericDataInputUtil.inputMapTargetParameterWithMasterParameter(lMasterDataSheet,'RedBook')
							if(lMapRedBookVehicleDataParameterWithMasterParameterResult.Result){
								lMapRedBookVehicleDataParameterWithMasterParameter=lMapRedBookVehicleDataParameterWithMasterParameterResult.MasterDataParameter
							}
							IGNUemaHelper.printLog('lMapDecodedRedBookVehicleDataParameterWithMasterParameter')
							IGNUemaHelper.printLog(lMapRedBookVehicleDataParameterWithMasterParameter)
							Map lMapDecodedRedBookVehicleDataParameterWithMasterParameter=[:]
							Map lMapDecodedRedBookVehicleDataParameterWithMasterParameterResult=this.inputPricingApiRedbookDataMapBetweenDataType(lMapRedBookVehicleDataParameterWithMasterParameter)
							if(lMapDecodedRedBookVehicleDataParameterWithMasterParameterResult.Result){
								lMapDecodedRedBookVehicleDataParameterWithMasterParameter=lMapDecodedRedBookVehicleDataParameterWithMasterParameterResult.DecodedRedBookDataMappedWithMasterData
							}
							IGNUemaHelper.printLog('lMapDecodedRedBookVehicleDataParameterWithMasterParameter')
							IGNUemaHelper.printLog(lMapDecodedRedBookVehicleDataParameterWithMasterParameter)
							Boolean lIsMapDecodedRedBookVehicleDataParameterWithMasterParameterEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapDecodedRedBookVehicleDataParameterWithMasterParameter)
							if(lMapVehicleDataResult.Result && !lIsMapDecodedRedBookVehicleDataParameterWithMasterParameterEmpty){
								IGNUemaHelper.printLog('VehicleData Result')
								lVehicleDataResultSet=lMapVehicleDataResult.VehicleDataResultSet
								List lVehicleDataList=IGNUemaHelper.convertListGroovyRowResultToListMapString(lVehicleDataResultSet)
								Map lMapRedBookVehicleData=lVehicleDataList.get(0)
								IGNUemaHelper.printLog('lMapRedBookVehicleData')
								IGNUemaHelper.printLog(lMapRedBookVehicleData)
								IGNUemaHelper.printLog(lMapRedBookVehicleDataParameterWithMasterParameterResult)
								IGNUemaHelper.addMapValueFromMapToMapByPreferDstKey(lMapRedBookVehicleData,lMapDecodedRedBookVehicleDataParameterWithMasterParameter)
								IGNUemaHelper.printLog('Decoded')
								IGNUemaHelper.printLog(lMapDecodedRedBookVehicleDataParameterWithMasterParameter)
								for(Map.Entry lEntry in lMapRedBookVehicleDataParameterWithMasterParameter){
									String lKey=lEntry.getKey()
									String lValue=lEntry.getValue()
									String[] lDecodeKeyWithDataTypeList=lKey.split('/')
									String[] lDecodeValueWithDataTypeList=lValue.split('/')
									String lDecodeKey=lDecodeKeyWithDataTypeList[0]
									String lDecodeKeyDataType=lDecodeKeyWithDataTypeList[1]
									String lDecodeValue=lDecodeValueWithDataTypeList[0]
									String lDecodeValueDataType=lDecodeValueWithDataTypeList[1]
									IGNUemaHelper.printLog(lDecodeKeyWithDataTypeList[0])
									String lRedBookValue=lMapDecodedRedBookVehicleDataParameterWithMasterParameter.get(lDecodeKey)
									if(lDecodeKeyDataType!=lDecodeValueDataType){
										lRedBookValue=IGNUemaHelper.convertStringValueToDataTypeByStringDataType(lRedBookValue,lDecodeValueDataType)
									}
									lMapJsonRootQuotationInput.root.Quote.Vehicle_Data.put(lDecodeValue,lRedBookValue)
								}
								IGNUemaHelper.printLog('Generic-MapJsonRootQuotationInput')
								IGNUemaHelper.printLog(lMapJsonRootQuotationInput)
							}else{
								return lreturn
							}
						}
					}
				}else{
					return lreturn
				}
				JsonBuilder lUpdatedPricingApiJsonRootQuotationInput=new JsonBuilder(lMapJsonRootQuotationInput)
				String lStrUpdatedPricingApiJsonRootQuotationInput=lUpdatedPricingApiJsonRootQuotationInput.toString()
				IGNUemaHelper.printLog('Generic-MapJsonRootQuotationInput')
				IGNUemaHelper.printLog(lStrUpdatedPricingApiJsonRootQuotationInput)
				lSubSetList=lMapJsonRootVehicleData.SubSetList
				lReferSubSetList=lMapJsonRootVehicleData.ReferSubSetList
				String lPricingApiLibraryMultiPlanRequest=lStrUpdatedPricingApiJsonRootQuotationInput
				Map  lMapPricingApiMultiPlanApiCallResult=this.initMultiPlanPricingApiRequest(lPricingApiQuoteRequiredProductType,lStrUpdatedPricingApiJsonRootQuotationInput,lPricingApiMultiplePlanPriceUrl,lIsPositiveCase,lMapPricingApiInputOutput,lPricingApiCoverName,lPricingApiCoverageListAll)
				if(lMapPricingApiMultiPlanApiCallResult.Result){
					lIsMultiPlanOK=true
					String lPricingApiMultiPlanPricingApiResponse=lMapPricingApiMultiPlanApiCallResult.PricingApiMultiPlanPriceResponse
					List lMapPlanOptionJson=new JsonSlurper().parseText(lPricingApiJsonRootPlanOption)
					Map lMapPricingApiJsonPaymentList=new JsonSlurper().parseText(lPricingApiJsonRootPayment)
					Map lMapResponseJson=new JsonSlurper().parseText(lPricingApiMultiPlanPricingApiResponse)
					Map lMapPricingApiJsonRootInputPremium=new JsonSlurper().parseText(lPricingApiJsonRootInputPremium)
					Map lMapPricingApiJsonRootInputPremiumList=lMapPricingApiJsonRootInputPremium.InputPremiumList
					List lPricingApiInputPremiumListAll=lMapPricingApiJsonRootInputPremiumList.InputPremium
					Map lMapPricingApiPaymentList=lMapPricingApiJsonPaymentList.Payment
					List lPricingApiPaymentList=lMapPricingApiPaymentList.PaymentList
					Map lMapJsonPricingApiJsonTotalPremium=new JsonSlurper().parseText(lPricingApiJsonRootTotalPremium)
					List lPricingApiJsonTotalPremiumList=lMapJsonPricingApiJsonTotalPremium.Premium
					Map lMapJsonPricingApiJsonTransaction=new JsonSlurper().parseText(lPricingApiJsonRootTransaction)
					List lPricingApiJsonTransactionList=lMapJsonPricingApiJsonTransaction.Transaction
					List lSelectedPricingApiTransactionList=[]
					List lSelectedPricingApiTotalPremiumList=[]
					List lPricingApiJsonRootAdditionalCoverageList=[]
					List lPricingApiInputPremiumList=[]
					List lDecodedCoverList=new ArrayList()
					List lDecodedCoverageList=new ArrayList()
					List lDecodedCoverageNameList=new ArrayList()
					List lDecodedAdditionalCoveragePremiumWithLoadingList=new ArrayList()
					List lDecodedAdditionalCoveragePremiumWithoutLoadingList=new ArrayList()
					List lDecodedPremiumValidationResult=new ArrayList()
					String lStrFlagApplyLoadingFactor='Yes'
					Boolean lIsFlagApplyLoadingFactorOK=false
					for(Integer lIndex=0;lIndex<=lCoverList.size()-1;lIndex++){
						IGNUemaHelper.printLog('Processing Cover&Coverage Loop Starts'+lIndex)
						String lInputMasterSetId=''
						List lCollectedCoverList=[]
						List lSelectedCoverageList=[]
						List lSelectedAdditionalCoveragePremiumWithoutLoadingList=[]
						List lSelectedAdditionalCoveragePremiumWithLoadingList=[]
						List lSelectedCoverageNameList=[]
						List lSelectedCoverageSAList=[]
						List lSelectedCoverageSequenceList=[]
						List lSelectedCoverList=lCoverList.get(lIndex)
						String lSubsetIndex=lSubSetList.get(lIndex)
						String lReferSubSetIndex=''
						if(lIsReferCaseDataToUse){
							lReferSubSetIndex=lReferSubSetList.get(lIndex)
						}
						List lSelectedAdditionalCoverageList=[]
						List lSelectedValidationTestResultList=[]
						Float lAnnualNetPremium=0.0
						Object lObjectSelectedAdditionalCoverageList=lMapPricingApiJsonRootAdditionalCoverageListAll.get(lIndex)
						if(lObjectSelectedAdditionalCoverageList.getClass()==LazyMap.class){
							Map lMapSelectedAdditionalCoverage=lMapPricingApiJsonRootAdditionalCoverageListAll.get(lIndex)
							lSelectedAdditionalCoverageList.add(lMapSelectedAdditionalCoverage)
						}
						else if(lObjectSelectedAdditionalCoverageList.getClass()==ArrayList.class){
							lSelectedAdditionalCoverageList=lMapPricingApiJsonRootAdditionalCoverageListAll.get(lIndex)
						}
						Map lPlanOptionListAll=lMapPlanOptionJson.get(lIndex)
						String lAdditionalCoverageName=''
						List lSelectedPricingApiInputPremiumList=new ArrayList<>()
						Object lObjectPricingApiInputPremiumList=lPricingApiInputPremiumListAll.get(lIndex)
						if(lObjectPricingApiInputPremiumList.getClass()==LazyMap.class){
							Map lMapPricingApiInputPremiumList=lPricingApiInputPremiumListAll.get(lIndex)
							lSelectedPricingApiInputPremiumList.add(lMapPricingApiInputPremiumList)
						}
						else if(lObjectPricingApiInputPremiumList.getClass()==ArrayList.class){
							lSelectedPricingApiInputPremiumList=lPricingApiInputPremiumListAll.get(lIndex)
						}
						List lSelectedPricingApiInputPaymentList=[]
						Object lObjectPricingApiInputPaymentList=lPricingApiPaymentList.get(lIndex)
						if(lObjectPricingApiInputPaymentList.getClass()==LazyMap.class){
							Map lMapPricingApiInputPaymentList=lPricingApiPaymentList.get(lIndex)
							lSelectedPricingApiInputPaymentList.add(lMapPricingApiInputPaymentList)
						}
						else if(lObjectPricingApiInputPaymentList.getClass()==ArrayList.class){
							lSelectedPricingApiInputPaymentList=lPricingApiPaymentList.get(lIndex)
						}
						Object lObjectPricingApiTransactionList=lPricingApiJsonTransactionList.get(lIndex)
						if(lObjectPricingApiTransactionList.getClass()==LazyMap.class){
							Map lMapPricingApiTransactionList=lPricingApiJsonTransactionList.get(lIndex)
							lSelectedPricingApiTransactionList.add(lMapPricingApiTransactionList)
						}
						else if(lObjectPricingApiTransactionList.getClass()==ArrayList.class){
							lSelectedPricingApiTransactionList=lPricingApiJsonTransactionList.get(lIndex)
						}
						Object lObjectPricingApiTotalPremiumList=lPricingApiJsonTotalPremiumList.get(lIndex)
						if(lObjectPricingApiTotalPremiumList.getClass()==LazyMap.class){
							Map lMapPricingApiTotalPremiumList=lPricingApiJsonTotalPremiumList.get(lIndex)
							lSelectedPricingApiTotalPremiumList.add(lMapPricingApiTotalPremiumList)
						}
						else if(lObjectPricingApiTotalPremiumList.getClass()==ArrayList.class){
							lSelectedPricingApiTotalPremiumList=lPricingApiJsonTotalPremiumList.get(lIndex)
						}
						Integer lSelectedCoverListSize=lSelectedCoverList.size()-1
						for(Integer lListIndex=0;lListIndex<=lSelectedCoverList.size()-1;lListIndex++){
							String lCoverName=lSelectedCoverList.get(lListIndex)
							Map lSelectedAdditionalCoverage=lSelectedAdditionalCoverageList.get(lListIndex)
							List lPricingApiCoverageNameListAll=[]
							List lPricingApiCoverageNameList=[]
							List lPricingApiCoverageSequenceList=[]
							List lPricingApiCoverageSAList=[]
							List lPricingApiDecodedCoverageSAList=[]
							List lPricingApiCoveragePremiumList=[]
							String lAdditionalCoverageValue=''
							Map lMapValidationTestResult=[:]
							lMapValidationTestResult.put('GetPlanPriceValidationTestResult',lSelectedAdditionalCoverage.ValidationTestResultGetPlanPrice)
							lMapValidationTestResult.put('GetPlanWithInstallmentPriceValidationTestResult',lSelectedAdditionalCoverage.ValidationTestResultGetPlanWithInstallmentPrice)
							lMapValidationTestResult.put('LibraryGetPlanWithPriceValidationTestResult',lSelectedAdditionalCoverage.ValidationTestResultLibraryGetPlanPrice)
							lMapValidationTestResult.put('LibraryGetPlanWithInstallmentPriceValidationTestResult',lSelectedAdditionalCoverage.ValidationTestResultLibraryGetPlanWithInstallmentPrice)
							lSelectedValidationTestResultList.add(lMapValidationTestResult)
							for(Map.Entry lEntry : lSelectedAdditionalCoverage.entrySet()){
								String lKey=lEntry.getKey()
								if(lKey.endsWith('Name')){
									lAdditionalCoverageName=lKey.replace('Name','')
									String lValue=lEntry.getValue()
									if(lValue!='None'){
										lAdditionalCoverageValue=lValue
									}
								}
								if(lKey.endsWith('SA')){
									String lValue=lEntry.getValue()
									lAdditionalCoverageName=lKey.replace('SA','')
									if(lValue!='None'){
										lPricingApiCoverageSAList.add(lValue)
										lPricingApiCoverageNameList.add(lAdditionalCoverageValue)
										lPricingApiCoverageNameListAll.add(lAdditionalCoverageName)
									}
								}
								if(lKey.endsWith('Premium')){
									Map lValue=lEntry.getValue()
									lAdditionalCoverageName=lKey.replace('Premium','')
									if(lValue!='None'&&(lPricingApiCoverageNameListAll.contains(lAdditionalCoverageName))){
										lPricingApiCoveragePremiumList.add(lValue)
									}
								}
							}
							lInputMasterSetId=lMapJsonRootQuotationInput.root.Quote.MasterSetId
							if(IGNUemaHelper.checkObjectEmptyOfString(lInputMasterSetId)){
								lInputMasterSetId=lMapResponseJson.root[0].Quote[0].mastersetId
							}
							Boolean lIsPlanOptionListOK=true
							Map lMapPricingApiInputPremium=lSelectedPricingApiInputPremiumList.get(lListIndex)
							Map lPricingApiInputPremiumRowAndColumnNumber=lMapPricingApiInputPremium.CoverPremium
							Integer lPremiumRowNumber=lPricingApiInputPremiumRowAndColumnNumber.RowNumber
							Integer lPremiumColumnNumber=lPricingApiInputPremiumRowAndColumnNumber.ColumnNumber
							Map lMapCoverageDecodedFromMultiplanApiResponse=lMapResponseJson.root[0].Quote[0].Coverages
							Map lMapCoverPremium=lMapCoverageDecodedFromMultiplanApiResponse.get(lCoverName)
							String lPolicyProductVersion=lMapResponseJson.root[0].Quote[0].Policy_Product_Version
							IGNUemaHelper.printLog(lPolicyProductVersion+'PolicyProductVersion'+lPricingApiQuoteRequiredProductType+' '+lCoverName)
							Map lMapCoverDependencyResult=IDNPricingApiHelper.getDependencyTable(lPolicyProductVersion,lPricingApiQuoteRequiredProductType,lCoverName)
							List<GroovyRowResult> lDependencyCodeMappingResultSet=[]
							String lCoverPlanName=''
							String lDefaultSelectedOption=lMapCoverPremium.Default_Selected_Option
							String[] lPlanOptionDefaultSelectedOptionList=[]
							if(lMapCoverDependencyResult.Result){
								lDependencyCodeMappingResultSet=lMapCoverDependencyResult.DependencyCodeMappingResultSet
								for(Map.Entry entry : lPlanOptionListAll.entrySet()){
									String lPlanName=entry.getKey()
									Object lPlanValue=entry.getValue()
									if(lPlanValue.getClass()==LazyMap.class){
										lIsPlanOptionListOK=false
										lPlanOptionDefaultSelectedOptionList=lDefaultSelectedOption.split('_')
										break
									}
								}
								if(lIsPlanOptionListOK){
									for(Integer lCodeIndex=0;lCodeIndex<=lDependencyCodeMappingResultSet.size()-1;lCodeIndex++){
										String lOptionName=lDependencyCodeMappingResultSet.get(lCodeIndex).option_name
										String lCoverPlan=lPlanOptionListAll.get(lOptionName)
										if(lCodeIndex==lDependencyCodeMappingResultSet.size()-1){
											lCoverPlanName=lCoverPlanName+lCoverPlan
										}else{
											lCoverPlanName=lCoverPlanName+lCoverPlan+'_'
										}
									}
								}else{
									lCoverPlanName=lMapCoverPremium.Default_Selected_Option
									for(Integer lCodeIndex=0;lCodeIndex<=lDependencyCodeMappingResultSet.size()-1;lCodeIndex++){
										String lOptionName=lDependencyCodeMappingResultSet.get(lCodeIndex).option_name
										Map lMapOptionaNameRowAndColumnNUmber=lPlanOptionListAll.get(lOptionName)
										Integer lPlanOptionRowNumber=lMapOptionaNameRowAndColumnNUmber.RowNumber
										Integer lPlanOptionColumnNumber=lMapOptionaNameRowAndColumnNUmber.ColumnNumber
										Boolean lIsWriteDefaultPlanOptionToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lPlanOptionRowNumber,lPlanOptionColumnNumber,lPlanOptionDefaultSelectedOptionList[lCodeIndex])
										if(!lIsWriteDefaultPlanOptionToExcelSheetDone){
											return lreturn
										}
										String lCoverPlan=lPlanOptionListAll.get(lOptionName)
										lPlanOptionListAll.put(lOptionName,lPlanOptionDefaultSelectedOptionList[lCodeIndex])
									}
								}
							}
							Map lMapCoverList=[:]
							lMapCoverList.put('Code',lCoverName)
							lMapCoverList.put('Selected_Option',lCoverPlanName)
							lCollectedCoverList.add(lMapCoverList)
							IGNUemaHelper.printLog(lCoverName+' '+'PlanName'+' '+lCoverPlanName)
							Map lMapPricingApiJsonPayment=lSelectedPricingApiInputPaymentList.get(lListIndex)
							Object lPaymentFrequency=lMapPricingApiJsonPayment.PaymentFrequency
							if(lPaymentFrequency.getClass()==String.class){
								lPolicyPaymentFrequency=lMapPricingApiJsonPayment.PaymentFrequency
							}else{
								Map lMapPolicyPaymentFrequency=lMapPricingApiJsonPayment.PaymentFrequency
								Integer lPolicyPaymentFrequencyRowNumber=lMapPolicyPaymentFrequency.RowNumber
								Integer lPolicyPaymentFrequencyColumnNumber=lMapPolicyPaymentFrequency.ColumnNumber
								Boolean lIsInputPolicyPaymentFrequencyToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lPolicyPaymentFrequencyRowNumber,lPolicyPaymentFrequencyRowNumber,lPolicyPaymentFrequency)
								if(!lIsInputPolicyPaymentFrequencyToExcelSheetDone){
									return lreturn
								}
							}
							lPolicyPaymentFrequency=lMapPricingApiJsonPayment.PaymentFrequency
							Map lMapLoadingFactor=lMapPricingApiJsonPayment.LoadingFactor
							List lLoadingFactorList=lMapResponseJson.root[0].Quote[0].Loading_Factors
							IGNUemaHelper.printLog('Input-Loading Factor Value')
							String lLoadingFactor=''
							String lFlagApplyLoadingFactor=IDNPricingApiHelper.getPricingCalculatorPaymentFlagValue('',lInputMasterSetId)
							lIsFlagApplyLoadingFactorOK=IGNUemaHelper.convertStringToBoolean(lFlagApplyLoadingFactor)
							if(!lIsFlagApplyLoadingFactorOK){
								lLoadingFactor=this.inputPricingApiLoadingFactorForGivenPaymentFrequency(lPricingApiSheet,lLoadingFactorList,lPolicyPaymentFrequency,lMapPricingApiJsonPayment)
								if(IGNUemaHelper.checkObjectEmptyOfString(lLoadingFactor)){
									return lreturn
								}
							}
							String lPremiumValue=''
							Integer lSequenceNumber=0
							List lCoverPremiumOptionList=lMapCoverPremium.Option
							String lSequence=IDNPricingApiHelper.getPricingProductFrequencyValue(lPolicyPaymentFrequency,lInputMasterSetId)
							lSequenceNumber=IGNUemaHelper.convertStringToInteger(lSequence,0)
							for(Integer lCoverIndex=0;lCoverIndex<=lCoverPremiumOptionList.size()-1;lCoverIndex++){
								if(lCoverPremiumOptionList.get(lCoverIndex).Name==lCoverPlanName){
									lPremiumValue=lCoverPremiumOptionList.get(lCoverIndex).Premium_Before_Taxes
									if(lIsFlagApplyLoadingFactorOK){
										lPremiumValue=this.getPremiumBasedPolicyPaymentFrequencySequence(lPremiumValue,lSequenceNumber)
									}
								}
							}
							Boolean lInputCoverPremiumToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lPremiumRowNumber,lPremiumColumnNumber,lPremiumValue)
							if(!lInputCoverPremiumToExcelSheetDone){
								return lreturn
							}
							Float lTotalAdditionalCoverageSumValue=0.0
							IGNUemaHelper.printLog('lPricingApiCoverageNameList')
							IGNUemaHelper.printLog(lPricingApiCoverageNameList)
							if(lPricingApiCoverageNameList.size()>0){
								for(Integer lCoverageIndex=0;lCoverageIndex<=lPricingApiCoverageNameList.size()-1;lCoverageIndex++){
									String lCoverageName=lPricingApiCoverageNameList.get(lCoverageIndex)
									Map lMapCoverageDependencyResult=IDNPricingApiHelper.getDependencyTable(lPolicyProductVersion,lPricingApiQuoteRequiredProductType,lCoverageName)
									List<GroovyRowResult> lDependencyCoverageMappingResultSet=[]
									String lCoveragePlanName=''
									String lDecodedOptionName=''
									String lSumAssured=''
									String lFirstOptionSequence=''
									Boolean lIsDefaultSelectedOptionToSelect=true
									if(lMapCoverageDependencyResult.Result){
										lDependencyCoverageMappingResultSet=lMapCoverageDependencyResult.DependencyCodeMappingResultSet
										lFirstOptionSequence=lDependencyCoverageMappingResultSet.get(0).option_name
										for(Integer lMappingIndex=0;lMappingIndex<=lDependencyCoverageMappingResultSet.size()-1;lMappingIndex++){
											String lOptionName=lDependencyCoverageMappingResultSet.get(lMappingIndex).option_name
											IGNUemaHelper.printLog(lOptionName+' '+'OptionName'+lCoverageName)
											String lPossibleOption=lCoverageName+'Option'
											String lPossibleSumAssured=lCoverageName+'SumAssured'
											lSumAssured=lPricingApiCoverageSAList.get(lCoverageIndex)
											if(lOptionName==lPossibleOption||(lOptionName==lPossibleSumAssured)){
												lDecodedOptionName=lPricingApiCoverageSAList.get(lCoverageIndex)
												lIsDefaultSelectedOptionToSelect=false
											}else{
												for(Map.Entry entry : lPlanOptionListAll.entrySet()){
													String lPlanName=entry.getKey()
													if(lOptionName.contains(lPlanName)){
														lDecodedOptionName=entry.getValue()
													}
												}
											}
											if(lMappingIndex==lDependencyCoverageMappingResultSet.size()-1){
												lCoveragePlanName=lCoveragePlanName+lDecodedOptionName
											}else{
												lCoveragePlanName=lCoveragePlanName+lDecodedOptionName+'_'
											}
										}
									}
									lPricingApiCoverageSequenceList.add(lFirstOptionSequence)
									IGNUemaHelper.printLog('First Option Sequence')
									IGNUemaHelper.printLog(lFirstOptionSequence)
									if(lIsDefaultSelectedOptionToSelect){
										lSumAssured=this.inputPricingApiSelectDefaultSumAssuredForCoverage(lFirstOptionSequence,lPlanOptionListAll)
									}else{
										lSumAssured=lPricingApiCoverageSAList.get(lCoverageIndex)
									}
									lPricingApiDecodedCoverageSAList.add(lSumAssured)
									IGNUemaHelper.printLog(lCoverageName+' '+'PlanName'+' '+lCoveragePlanName+' '+lSumAssured)
									Map lMapCoverage=[:]
									lMapCoverage.put('Additional_Coverage_Code',lCoverageName)
									lMapCoverage.put('Additional_Coverage_Sum_Assured',lSumAssured)
									lSelectedCoverageList.add(lMapCoverage)
									IGNUemaHelper.printLog('Loading Factor' +lLoadingFactor)
									Float lLoadingFactorValue=IGNUemaHelper.convertStringToFloat(lLoadingFactor,0.0)
									IGNUemaHelper.printLog('Loading Factor' +lLoadingFactor+ ' '+lLoadingFactorValue)
									Map lMapAdditionalCoveragePremium=lMapCoverageDecodedFromMultiplanApiResponse.get(lCoverageName)
									List lAdditionalCoveragePremiumOptionList=lMapAdditionalCoveragePremium.Option
									for(Integer lOptionIndex=0;lOptionIndex<=lAdditionalCoveragePremiumOptionList.size()-1;lOptionIndex++){
										String lOptionName=lAdditionalCoveragePremiumOptionList.get(lOptionIndex).Name
										if(lOptionName==lCoveragePlanName){
											String lAdditionalCoveragePremium=lAdditionalCoveragePremiumOptionList.get(lOptionIndex).Premium_Before_Taxes
											if(lIsFlagApplyLoadingFactorOK){
												lAdditionalCoveragePremium=this.getPremiumBasedPolicyPaymentFrequencySequence(lAdditionalCoveragePremium,lSequenceNumber)
											}
											Map lMapAdditionalCoverageTableResult=lPricingApiCoveragePremiumList.get(lCoverageIndex)
											Integer lAdditionalCoveragePremiumRowNumber=lMapAdditionalCoverageTableResult.RowNumber
											Integer lAdditionalCoveragePremiumColumnNumber=lMapAdditionalCoverageTableResult.ColumnNumber
											Boolean lIsInputAdditionalCoveragePremiumToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lAdditionalCoveragePremiumRowNumber,lAdditionalCoveragePremiumColumnNumber,lAdditionalCoveragePremium)
											if(!lIsInputAdditionalCoveragePremiumToExcelSheetDone){
												return lreturn
											}
											Float lAdditionalCoveragePremiumNum=IGNUemaHelper.convertStringToFloat(lAdditionalCoveragePremium,0.0)
											Float lAdditionalCoveragePremiumWithLoading=0.0
											if(lIsFlagApplyLoadingFactorOK){
												lAdditionalCoveragePremiumWithLoading=lAdditionalCoveragePremiumNum
											}
											else{
												lAdditionalCoveragePremiumWithLoading=lAdditionalCoveragePremiumNum*lLoadingFactorValue
											}
											lSelectedAdditionalCoveragePremiumWithoutLoadingList.add(lAdditionalCoveragePremiumNum)
											lSelectedAdditionalCoveragePremiumWithLoadingList.add(lAdditionalCoveragePremiumWithLoading)
											lTotalAdditionalCoverageSumValue=lTotalAdditionalCoverageSumValue+lAdditionalCoveragePremiumNum
										}
									}
								}
							}
							lDecodedCoverageList.add(lSelectedCoverageList)
							lSelectedCoverageNameList.add(lPricingApiCoverageNameList)
							lSelectedCoverageSAList.add(lPricingApiDecodedCoverageSAList)
							lSelectedCoverageSequenceList.add(lPricingApiCoverageSequenceList)
							Map lPricingApiJsonRootInputAdditionalCoveragePremiumRowAndColumnNumber=lMapPricingApiInputPremium.AdditionalCoveragePremium
							Integer lAdditionalCoveragePremiumRowNumber=lPricingApiJsonRootInputAdditionalCoveragePremiumRowAndColumnNumber.RowNumber
							String lStrTotalAdditionalCoverageSumValue=lTotalAdditionalCoverageSumValue.toString()
							Integer lAdditionalCoveragePremiumColumnNumber=lPricingApiJsonRootInputAdditionalCoveragePremiumRowAndColumnNumber.ColumnNumber
							Boolean lIsInputTotalAdditionalCoveragePremiumToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lAdditionalCoveragePremiumRowNumber,lAdditionalCoveragePremiumColumnNumber,lStrTotalAdditionalCoverageSumValue)
							if(!lIsInputTotalAdditionalCoveragePremiumToExcelSheetDone){
								return lreturn
							}
							Map lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber=[:]
							Integer lAnnualNetPremiumPremiumRowNumber=0
							Integer lAnnualNetPremiumPremiumColumnNumber=0
							Float lCoverPremium=0.0
							String lStrAnnualNetPremium=''
							if(!lIsFlagApplyLoadingFactorOK){
								lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber=lMapPricingApiJsonPayment.AnnualNetPremWithoutLoading
								lAnnualNetPremiumPremiumRowNumber=lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber.RowNumber
								lAnnualNetPremiumPremiumColumnNumber=lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber.ColumnNumber
								lCoverPremium=IGNUemaHelper.convertStringToFloat(lPremiumValue,0.0)
								lAnnualNetPremium=lTotalAdditionalCoverageSumValue+lCoverPremium
								lStrAnnualNetPremium=lAnnualNetPremium.toString()
							}
							else{
								lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber=lMapPricingApiJsonPayment.AnnualNetPremCalcByTestScript
								lAnnualNetPremiumPremiumRowNumber=lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber.RowNumber
								lAnnualNetPremiumPremiumColumnNumber=lMapPricingApiJsonPaymentAnnualNetPremiumRowAndColumnNumber.ColumnNumber
								lCoverPremium=IGNUemaHelper.convertStringToFloat(lPremiumValue,0.0)
								lAnnualNetPremium=lTotalAdditionalCoverageSumValue+lCoverPremium
								lStrAnnualNetPremium=lAnnualNetPremium.toString()
							}
							Map lMapPricingApiJsonPaymentFlagApplyLoadingFactorRowAndColumnNumber=lMapPricingApiJsonPayment.FlagApplyLoadingFactor
							Integer lFlagApplyLoadingFactorPremiumRowNumber=lMapPricingApiJsonPaymentFlagApplyLoadingFactorRowAndColumnNumber.RowNumber
							Integer lFlagApplyLoadingFactorPremiumColumnNumber=lMapPricingApiJsonPaymentFlagApplyLoadingFactorRowAndColumnNumber.ColumnNumber
							if(lIsFlagApplyLoadingFactorOK){
								lStrFlagApplyLoadingFactor='Yes'
							}
							else{
								lStrFlagApplyLoadingFactor='No'
							}
							Boolean lIsInputFlagApplyLoadingFactorToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lFlagApplyLoadingFactorPremiumRowNumber,lFlagApplyLoadingFactorPremiumColumnNumber,lStrFlagApplyLoadingFactor)
							if(!lIsInputFlagApplyLoadingFactorToExcelSheetDone){
								return lreturn
							}
							Boolean lIsInputAnnualNetPremiumToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lAnnualNetPremiumPremiumRowNumber,lAnnualNetPremiumPremiumColumnNumber,lStrAnnualNetPremium)
							if(!lIsInputAnnualNetPremiumToExcelSheetDone){
								return lreturn
							}
							IGNUemaHelper.printLog('Processing All Coverage&CoverLoop Ends')
						}
						lDataSubsetIndex=lDataSubsetIndex+1
						IGNUemaHelper.printLog('lCollectedCoverList')
						IGNUemaHelper.printLog(lCollectedCoverList)
						IGNUemaHelper.printLog(lDecodedCoverageList)
						IGNUemaHelper.printLog(IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS())
						if(lPricingApiQuoteRequiredTransactionType=='Endorsement'||lPricingApiQuoteRequiredTransactionType=='Cancellation'){
							lMapJsonRootQuotationInput.root.Quote.put('PreviousCovers',lMapPreviousCover)
							IGNUemaHelper.printLog(lMapJsonRootQuotationInput)
							Map lMapPricingApiGetPlanPriceAddingCoverResult=this.inputPricingApiEndorsementOrCancellationPreviousCover(lPricingApiSheet,lReferSubSetIndex,lMapJsonRootQuotationInput,lSelectedCoverList,lSelectedPricingApiInputPaymentList)
							if(lMapPricingApiGetPlanPriceAddingCoverResult.Result){
								lMapJsonRootQuotationInput=lMapPricingApiGetPlanPriceAddingCoverResult.PricingApiUpdatedJsonQuotationInput
							}
							IGNUemaHelper.printLog('lMapPricingApiGetPlanPriceJsonRootQuotationInput Add Covers')
							IGNUemaHelper.printLog(lMapJsonRootQuotationInput)
						}
						Boolean lIsSaveWorkBook=IGNUemaHelper.saveExcelWorkbookByFileName(lExcelGenericFilename,lTestExcelFileGenericTestDataWorkBook)
						if(!lIsSaveWorkBook){
							return lreturn
						}
						Boolean lIsOpenExcelApplication=IGNUemaHelper.runExcelMacroFromExcelFileName(lMacroGenericFileName,'SpillWorksheetPricingAPI')
						IGNUemaHelper.printLog('lIsOpenExcelApplication='+IGNUemaHelper.convertBooleanToYesNoString(lIsOpenExcelApplication))
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(lExcelGenericFilename)
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						List lRequestedInputCover=[]
						Map lMapGetPlanPriceCover=[:]
						Map lMapGetPlanWithInstallmentPriceCover=[:]
						IGNUemaHelper.printLog('Check PolicyPayment Frequency')
						lMapGetPlanWithInstallmentPriceCover.put('Policy_Payment_Frequency',lPolicyPaymentFrequency)
						List lRequestedCoverageList=[]
						List lRequestedCoverList=[]
						Map lTransactionDate=lQuoteTransactionDateList.get(0)
						Map lTransactionEndDate=lTransactionDate.EndDate
						Integer lEndDateRowNumber=lTransactionEndDate.RowNumber
						Integer lEndDateColumnNumber=lTransactionEndDate.ColumnNumber
						String lGeneratePricingApiEndDate=this.getValueFromExcelSheetForValidation(lPricingApiSheet,lEndDateRowNumber,lEndDateColumnNumber)
						lMapJsonRootQuotationInput.root.Quote.put('Policy_End_Date',lGeneratePricingApiEndDate)
						IGNUemaHelper.printLog(lMapJsonRootQuotationInput)
						IGNUemaHelper.printLog(lTransactionDate)
						Map lTransactionMasterSetId=lTransactionDate.MasterSetId
						Integer lMasterSetIdRowNumber=lTransactionMasterSetId.RowNumber
						Integer lMasterSetIdColumnNumber=lTransactionMasterSetId.ColumnNumber
						IGNUemaHelper.printLog(lTransactionDate)
						lMapJsonRootQuotationInput.root.Quote.put('MasterSetId',lInputMasterSetId)
						Boolean lIsWriteMasterSetIdToExcelSheet=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lMasterSetIdRowNumber,lMasterSetIdColumnNumber,lInputMasterSetId)
						if(!lIsWriteMasterSetIdToExcelSheet){
							return lreturn
						}
						lUpdatedPricingApiJsonRootQuotationInput=new JsonBuilder(lMapJsonRootQuotationInput)
						lStrUpdatedPricingApiJsonRootQuotationInput=lUpdatedPricingApiJsonRootQuotationInput.toString()
						IGNUemaHelper.printLog(lGeneratePricingApiEndDate)
						JsonBuilder lFinalPricingApiJsonRootQuotationInput=new JsonBuilder(lMapJsonRootQuotationInput)
						String lStrUpdatedFinalPricingApiJsonRootQuotationInput=lFinalPricingApiJsonRootQuotationInput.toString()
						lMapPricingApiInputOutput.put('MultiplePlanPriceRequestText',lStrUpdatedFinalPricingApiJsonRootQuotationInput)
						lMapPricingApiInputOutput.put('QuotePolicyEndDate',lGeneratePricingApiEndDate)
						Map lMapPricingApiGetPlanPriceJsonRootQuotationInput=new JsonSlurper().parseText(lStrUpdatedPricingApiJsonRootQuotationInput)
						Map lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput=new JsonSlurper().parseText(lStrUpdatedPricingApiJsonRootQuotationInput)
						if(lPricingApiQuoteRequiredTransactionType=='Endorsement'||lPricingApiQuoteRequiredTransactionType=='Cancellation'){
							lMapPricingApiGetPlanPriceJsonRootQuotationInput.root.Quote.put('Policy_Payment_Frequency',lPolicyPaymentFrequency)
						}
						for(Integer lSelectedCoverageIndex=0;lSelectedCoverageIndex<=lCollectedCoverList.size()-1;lSelectedCoverageIndex++){
							IGNUemaHelper.printLog('Check Coveragelist')
							lRequestedCoverageList=lDecodedCoverageList.get(lSelectedCoverageIndex)
							if(lCollectedCoverList.get(lSelectedCoverageIndex).getClass()==ArrayList.class){
								lRequestedCoverList=lCollectedCoverList.get(lSelectedCoverageIndex)
							}else{
								lRequestedCoverList.add(lCollectedCoverList.get(lSelectedCoverageIndex))
							}
							IGNUemaHelper.printLog(lRequestedCoverList)
							for(Integer lCoverIndex=0;lCoverIndex<=lRequestedCoverList.size()-1;lCoverIndex++){
								lMapGetPlanPriceCover=lRequestedCoverList.get(lCoverIndex)
								lMapGetPlanPriceCover.put('Coverages',lRequestedCoverageList)
								lMapPricingApiGetPlanPriceJsonRootQuotationInput.root.Quote.Covers.add(lMapGetPlanPriceCover)
								lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput.root.Quote.put('Policy_Payment_Frequency',lPolicyPaymentFrequency)
								Map lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInputQuoteData=lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput.root.Quote
								lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput.root.Quote.Covers.add(lMapGetPlanPriceCover)
								lRequestedInputCover.add(lMapGetPlanPriceCover)
							}
						}
						Boolean lIsPricingApiRequestSentSuccessfully=false
						String lPricingApiGetPlanPriceUrl=''
						String lPricingApiGetPlanWithInstallmentPriceUrl=''
						String lPricingApiGetPlanPriceRegisterUuid=lMapPricingApiInputOutput.RegisterUuid
						if(lPricingApiQuoteRequiredTransactionType=='Endorsement'||lPricingApiQuoteRequiredTransactionType=='Cancellation'){
							Map lMapPricingApiGetPlanPriceAddingCoverResult=this.inputPricingApiEndorsementOrCancellationPaymentDetail(lReferSubSetIndex,lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput)
							if(lMapPricingApiGetPlanPriceAddingCoverResult.Result){
								lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput=lMapPricingApiGetPlanPriceAddingCoverResult.PricingApiUpdatedJsonQuotationInput
							}
							IGNUemaHelper.printLog('lMapPricingApiGetPlanPriceJsonRootQuotationInput Add Payment Detail')
							IGNUemaHelper.printLog(lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput)
							lPricingApiGetPlanPriceUrl=lMapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementUrl
							lPricingApiGetPlanWithInstallmentPriceUrl=lMapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementInstUrl
						}else{
							lPricingApiGetPlanPriceUrl=lMapPricingApiInputOutput.RegisterClientServiceDataPricingGetPlanPriceUrl
							lPricingApiGetPlanWithInstallmentPriceUrl=lMapPricingApiInputOutput.RegisterClientServiceDataGetPlanPriceInstUrl
						}
						JsonBuilder lDecodedPricingApiJsonRootQuotationInput=new JsonBuilder(lMapPricingApiGetPlanPriceJsonRootQuotationInput)
						JsonBuilder lDecodedPricingApiGetPlanWithInstallmentJsonRootQuotationInput=new JsonBuilder(lMapPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput)
						String lStrDecodedPricingApiJsonRootQuotationInput=lDecodedPricingApiJsonRootQuotationInput.toString()
						IGNUemaHelper.printLog('GetPlan & GetPlanWithInstallment Input Request data')
						IGNUemaHelper.printLog(lStrDecodedPricingApiJsonRootQuotationInput)
						Map lMapGetPlanPriceInputRequestResult=this.initGetPlanPricingApiRequest(lPricingApiQuoteRequiredProductType,lStrDecodedPricingApiJsonRootQuotationInput,lPricingApiGetPlanPriceRegisterUuid,lPricingApiGetPlanPriceUrl,lMapPricingApiInputOutput)
						String lStrDecodedPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput=lDecodedPricingApiGetPlanWithInstallmentJsonRootQuotationInput.toString()
						IGNUemaHelper.printLog('lStrDecodedPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput')
						IGNUemaHelper.printLog(lStrDecodedPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput)
						Map lMapGetPlanWithInstallmentPriceInputRequestResult=this.initGetPlanWithInstallmentPricingApiRequest(lPricingApiQuoteRequiredProductType,lStrDecodedPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput,lPricingApiGetPlanPriceRegisterUuid,lPricingApiGetPlanWithInstallmentPriceUrl,lMapPricingApiInputOutput)
						lIsGetPlanOK=lMapGetPlanPriceInputRequestResult.Result
						lIsGetPlanWithInstallmentOK=lMapGetPlanWithInstallmentPriceInputRequestResult.Result
						if((lIsGetPlanOK)&&(lIsGetPlanWithInstallmentOK)){
							lIsPricingApiRequestSentSuccessfully=true
							lOutputPricingApiQuotePlanList.add(lMapGetPlanPriceInputRequestResult.PricingApiGetPlanPriceResult)
							lOutputPricingApiQuotePlanWithInstallmentList.add(lMapGetPlanWithInstallmentPriceInputRequestResult.PricingApiGetPlanWithInstallmentPriceResult)
						}
						Float lTotalDownPaymentValue=0.0
						Float lTotalInstallmentAmountValue=0.0
						IGNUemaHelper.printLog(lSelectedPricingApiTransactionList.size())
						IGNUemaHelper.printLog(lSelectedPricingApiTransactionList)
						for(Integer lGetCellIndex=0;lGetCellIndex<=lSelectedPricingApiTransactionList.size()-1;lGetCellIndex++){
							Map lMapPricingApiTransactionDownPayment=lSelectedPricingApiTransactionList.get(lGetCellIndex).DownPayment
							IGNUemaHelper.printLog( lMapPricingApiTransactionDownPayment)
							Integer lDownPaymentRowNumber=lMapPricingApiTransactionDownPayment.RowNumber
							Integer lDownPaymentColumnNumber=lMapPricingApiTransactionDownPayment.ColumnNumber
							String lDownPayment=this.getValueFromExcelSheetForValidation(lPricingApiSheet,lDownPaymentRowNumber,lDownPaymentColumnNumber)
							Float lDownPaymentNum=IGNUemaHelper.convertStringToFloat(lDownPayment,0.0)
							lDownPaymentNum=Math.floor(lDownPaymentNum)
							lTotalDownPaymentValue=lTotalDownPaymentValue+lDownPaymentNum
							Map lMapPricingApiTransactionInstallmentAmount=lSelectedPricingApiTransactionList.get(lGetCellIndex).InstallmentAmount
							Integer lInstallmentAmountRowNumber=lMapPricingApiTransactionInstallmentAmount.RowNumber
							Integer lInstallmentAmountColumnNumber=lMapPricingApiTransactionInstallmentAmount.ColumnNumber
							String lInstallmentAmount=this.getValueFromExcelSheetForValidation(lPricingApiSheet,lInstallmentAmountRowNumber,lInstallmentAmountColumnNumber)
							Float lInstallmentAmountNum=IGNUemaHelper.convertStringToFloat(lInstallmentAmount,0.0)
							lInstallmentAmountNum=Math.floor(lInstallmentAmountNum)
							lTotalInstallmentAmountValue=lTotalInstallmentAmountValue+lInstallmentAmountNum
						}
						Map lMapTotalInstallmentAndDownPaymentAmount=[:]
						for(Integer lGetCellIndex=0;lGetCellIndex<=lSelectedPricingApiTotalPremiumList.size()-1;lGetCellIndex++){
							Map lMapInputTotalDownPayment=lSelectedPricingApiTotalPremiumList.get(lGetCellIndex).TotalDownPayment
							IGNUemaHelper.printLog(lMapInputTotalDownPayment)
							Integer lInputDownPaymentRowNumber=lMapInputTotalDownPayment.RowNumber
							Integer lInputDownPaymentColumnNumber=lMapInputTotalDownPayment.ColumnNumber
							lMapTotalInstallmentAndDownPaymentAmount.put('TotalDownPayment',lTotalDownPaymentValue)
							String lStrTotalDownPayment=lTotalDownPaymentValue.toString()
							String lIsInputDownPaymentToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lInputDownPaymentRowNumber,lInputDownPaymentColumnNumber,lStrTotalDownPayment)
							if(!lIsInputDownPaymentToExcelSheetDone){
								return lreturn
							}
							Map lMapInputTotalInstallmentAmount=lSelectedPricingApiTotalPremiumList.get(lGetCellIndex).TotalInstallmentAmount
							Integer lInputInstallmentAmountRowNumber=lMapInputTotalInstallmentAmount.RowNumber
							Integer lInputInstallmentAmountColumnNumber=lMapInputTotalInstallmentAmount.ColumnNumber
							lMapTotalInstallmentAndDownPaymentAmount.put('TotalInstallmentAmount',lTotalInstallmentAmountValue)
							String lStrTotalInstallmentAmount=lTotalInstallmentAmountValue.toString()
							IGNUemaHelper.printLog('lInputInstallmentAmountRowNumber')
							IGNUemaHelper.printLog(lInputInstallmentAmountRowNumber)
							IGNUemaHelper.printLog(lInputInstallmentAmountColumnNumber)
							Boolean lIsInputInstallmentAmountToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lInputInstallmentAmountRowNumber,lInputInstallmentAmountColumnNumber,lStrTotalInstallmentAmount)
							if(!lIsInputInstallmentAmountToExcelSheetDone){
								return lreturn
							}
						}
						lDecodedAdditionalCoveragePremiumWithoutLoadingList.add(lSelectedAdditionalCoveragePremiumWithoutLoadingList)
						lDecodedAdditionalCoveragePremiumWithLoadingList.add(lSelectedAdditionalCoveragePremiumWithLoadingList)
						IGNUemaHelper.printLog('lDecodedAdditionalCoveragePremiumWithLoadingList')
						IGNUemaHelper.printLog(lDecodedAdditionalCoveragePremiumWithLoadingList)
						IGNUemaHelper.printLog(lDecodedAdditionalCoveragePremiumWithoutLoadingList)
						if(lIsPricingApiRequestSentSuccessfully){
							Map lMapPricingApiLibraryInput=[:]
							Map lMapPricingApiLibraryOutput=[:]
							Boolean lIsPricingApiLibraryInitOK=this.inputInitPricingApiLibraryInputOutput(lMapPricingApiLibraryOutput)
							lMapPricingApiLibraryInput.put('PricingApiLibrarySelectedCoverageNameList',lSelectedCoverageNameList)
							lMapPricingApiLibraryInput.put('PricingApiLibrarySelectedCoverageSAList',lSelectedCoverageSAList)
							lMapPricingApiLibraryInput.put('PricingApiLibrarySelectedCoverageSequenceList',lSelectedCoverageSequenceList)
							lMapPricingApiLibraryInput.put('PricingApiLibraryMultiPlanRequest',lPricingApiLibraryMultiPlanRequest)
							lMapPricingApiLibraryInput.put('PricingApiLibraryHostUrl',lPricingApiLibraryHostUrl)
							lMapPricingApiLibraryInput.put('PricingApiLibraryPlanOption',lPlanOptionListAll)
							lMapPricingApiLibraryInput.put('PricingApiLibraryCoverList',lSelectedCoverList)
							lMapPricingApiLibraryInput.put('PolicyPaymentFrequency',lPolicyPaymentFrequency)
							IGNUemaHelper.printLog('Start Library')
							IGNUemaHelper.printLog(lPricingApiQuoteRequiredTransactionType)
							IGNUemaHelper.printLog(lPricingApiLibraryHostUrl)
							String lPricingApiLibraryResult=lIDNPricingApiLibraryGetPriceListMainUtil.inputCase(lPricingApiQuoteRequiredTransactionType,lMapPricingApiLibraryInput,lMapPricingApiLibraryOutput)
							Map lMapPricingApiJsonRootQuotationInput=new JsonSlurper().parseText(lPricingApiJsonRootQuotationInput)
							String lGetPlanPriceResponse=lMapGetPlanPriceInputRequestResult.PricingApiGetPlanPriceResponse
							String lGetPlanWithInstallmentPriceResponse=lMapGetPlanWithInstallmentPriceInputRequestResult.PricingApiGetPlanWithInstallmentPriceResponse
							IGNUemaHelper.printLog('Loop Index'+lIndex)
							if(lSelectedCoverageList.size()>0){
								lIsAdditionalCoveragePremiumValidationOK=this.validateAdditionalCoveragePremiumInGetPlanAndGetPlanWithInstallmentPriceResult(lPricingApiSheet,lPricingApiQuoteRequiredTransactionType,lPricingApiQuoteRequiredProductType,lGetPlanPriceResponse,lGetPlanWithInstallmentPriceResponse,lSelectedCoverList,lSelectedCoverageNameList,lMapPricingApiLibraryOutput,lDecodedAdditionalCoveragePremiumWithoutLoadingList,lDecodedAdditionalCoveragePremiumWithLoadingList,lSelectedValidationTestResultList)
							}
							lIsPremiumValidationOK=this.validateGetPlanPricingApiResult(lPricingApiSheet,lPricingApiQuoteRequiredTransactionType,lAnnualNetPremium,lSelectedPricingApiTransactionList,lSelectedCoverList,lMapPricingApiLibraryOutput,lSelectedPricingApiTotalPremiumList,lGetPlanPriceResponse,lGetPlanWithInstallmentPriceResponse,lPolicyPaymentFrequency,lStrDecodedPricingApiJsonRootQuotationInput,lStrDecodedPricingApiGetPlanWithInstallmentPriceJsonRootQuotationInput,lMapTotalInstallmentAndDownPaymentAmount)
							try{
								IGNUemaHelper.printLog('Excel:Saving')
								IGNUemaHelper.saveExcelWorkbookByFileName(lExcelGenericFilename,lTestExcelFileGenericTestDataWorkBook)
							}catch(Exception ex){
								return lreturn
							}
						}
						String lSubSetActualResult=''
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsRegClientOK,lIsMultiPlanOK,lIsGetPlanOK,lIsGetPlanWithInstallmentOK,lIsAdditionalCoveragePremiumValidationOK,lIsPremiumValidationOK)
						if(lMapActualResult.Result){
							lSubSetActualResult=lMapActualResult.ActualResult
						}
						for(Integer lGetCellIndex=0;lGetCellIndex<=lSelectedPricingApiTotalPremiumList.size()-1;lGetCellIndex++){
							Map lMapInputResult=lSelectedPricingApiTotalPremiumList.get(lGetCellIndex).Result
							Integer lInputResultRowNumber=lMapInputResult.RowNumber
							Integer lInputResultColumnNumber=lMapInputResult.ColumnNumber
							IGNUemaHelper.printLog(lInputResultRowNumber)
							IGNUemaHelper.printLog(lInputResultColumnNumber)
							Boolean lIsSubSetStatusOK=IGNUemaHelper.convertStringToBoolean(lSubSetActualResult)
							String lSubSetStatus=''
							if(lIsSubSetStatusOK){
								lSubSetStatus='Passed'
							}
							else{
								lSubSetStatus='Failed'
							}
							Boolean lIsInputResultToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lInputResultRowNumber,lInputResultColumnNumber,lSubSetStatus)
							if(!lIsInputResultToExcelSheetDone){
								return lreturn
							}
						}
						IGNUemaHelper.printLog('lSubSetActualResult')
						IGNUemaHelper.printLog(lSubSetActualResult)
						IGNUemaHelper.printLog('lPricingApiLibraryMultiPlanRequest')
						IGNUemaHelper.printLog(lPricingApiLibraryMultiPlanRequest)
						lDecodedAdditionalCoveragePremiumWithoutLoadingList=[]
						lDecodedAdditionalCoveragePremiumWithLoadingList=[]
						lDecodedCoverageNameList.add(lSelectedCoverageNameList)
						lCollectedCoverList=[]
						lDecodedCoverageList=[]
						lSelectedValidationTestResultList=[]
						lSelectedPricingApiTransactionList=[]
						lSelectedPricingApiTotalPremiumList=[]
						lSelectedPricingApiInputPremiumList=[]
					}
					IGNUemaHelper.printLog('lDecodedAdditionalCoveragePremiumWithoutLoadingList')
					IGNUemaHelper.printLog(lDecodedAdditionalCoveragePremiumWithoutLoadingList)
					IGNUemaHelper.printLog(lDecodedAdditionalCoveragePremiumWithLoadingList)
					try{
						IGNUemaHelper.printLog('Excel:Saving')
						IGNUemaHelper.saveExcelWorkbookByFileName(lExcelGenericFilename,lTestExcelFileGenericTestDataWorkBook)
					}catch(Exception ex){
						return lreturn
					}
				}
			}
			this.CURRENT_NUMBER_OF_SUBSET=lDataSubsetIndex
			IGNUemaHelper.printLog('lPricingApiQuotePlanList')
			IGNUemaHelper.printLog(lDataSubsetIndex)
			IGNUemaHelper.printLog(lOutputPricingApiQuotePlanList)
			IGNUemaHelper.printLog(lOutputPricingApiQuotePlanWithInstallmentList)
			Boolean lIsWriteOutputToExcelSheet=this.writeOutputToExcelSheet(lMapPricingApiInputOutput)
			Boolean lIsWriteOutputListToExcelSheet=this.writeOutputListToExcelSheet(lSubSetList,lOutputPricingApiQuotePlanList,lOutputPricingApiQuotePlanWithInstallmentList,lPricingApiQuoteRequiredProductType,lPricingApiQuoteRequiredTransactionType)
			/*this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientReleaseVersion=lRegisterClientReleaseVersion
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientResponseStatus=lRegisterClientResponseStatus
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientResponseTime=lRegisterClientResponseTime
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientResponseText=lRegisterClientResponseText
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterUuid=lRegisterUuid
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterServiceData=lRegisterServiceData
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataCreatePolicyUrl=lRegisterClientServiceDataCreatePolicyUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataCreatePolicyInterceptoUrl=lRegisterClientServiceDataCreatePolicyInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataCreatePolicyFlagConcurrent=lRegisterClientServiceDataCreatePolicyFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataGetPlanPriceInstUrl=lRegisterClientServiceDataGetPlanPriceInstUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataGetPlanPriceInstInterceptoUrl=lRegisterClientServiceDataGetPlanPriceInstInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataGetPlanPriceInstFlagConcurrent=lRegisterClientServiceDataGetPlanPriceInstFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingPolicyMappingUrl=lRegisterClientServiceDataPricingPolicyMappingUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingPolicyMappingInterceptoUrl=lRegisterClientServiceDataPricingPolicyMappingInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingPolicyMappingFlagConcurrent=lRegisterClientServiceDataPricingPolicyMappingFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingEndorsementUrl=lRegisterClientServiceDataPricingEndorsementUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingEndorsementInterceptoUrl=lRegisterClientServiceDataPricingEndorsementInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingEndorsementFlagConcurrent=lRegisterClientServiceDataPricingEndorsementFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingRetrievePolicyUrl=lRegisterClientServiceDataPricingRetrievePolicyUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingRetrievePolicyInterceptoUrl=lRegisterClientServiceDataPricingRetrievePolicyInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingRetrievePolicyFlagConcurrent=lRegisterClientServiceDataPricingRetrievePolicyFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetCalculationConfigurationUrl=lRegisterClientServiceDataPricingGetCalculationConfigurationUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetCalculationConfigurationInterceptoUrl=lRegisterClientServiceDataPricingGetCalculationConfigurationInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetCalculationConfigurationFlagConcurrent=lRegisterClientServiceDataPricingGetCalculationConfigurationFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetPlanPriceUrl=lRegisterClientServiceDataPricingGetPlanPriceUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetPlanPriceInterceptoUrl=lRegisterClientServiceDataPricingGetPlanPriceInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetPlanPriceFlagConcurrent=lRegisterClientServiceDataPricingGetPlanPriceFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingMultiplePlanPriceUrl=lRegisterClientServiceDataPricingMultiplePlanPriceUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingMultiplePlanPriceInterceptoUrl=lRegisterClientServiceDataPricingMultiplePlanPriceInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingMultiplePlanPriceFlagConcurrent=lRegisterClientServiceDataPricingMultiplePlanPriceFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetDependencyCodeMappingUrl=lRegisterClientServiceDataPricingGetDependencyCodeMappingUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetDependencyCodeMappingInterceptoUrl=lRegisterClientServiceDataPricingGetDependencyCodeMappingInterceptoUrl
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceDataPricingGetDependencyCodeMappingFlagConcurrent=lRegisterClientServiceDataPricingGetDependencyCodeMappingFlagConcurrent
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceLibraryRoot=lRegisterClientServiceLibraryRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceLibraryItem01Name=lRegisterClientServiceLibraryItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceLibraryItem01Version=lRegisterClientServiceLibraryItem01Version
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceLibraryItem02Name=lRegisterClientServiceLibraryItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientServiceLibraryItem02Version=lRegisterClientServiceLibraryItem02Version
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientApiResult=lRegisterClientApiResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateRegisterClientApiDetail=lRegisterClientApiDetail
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceReleaseVersion=lMultiplePlanPriceReleaseVersion
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceResponseStatus=lMultiplePlanPriceResponseStatus
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceResponseTime=lMultiplePlanPriceResponseTime
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceResponseText=lMultiplePlanPriceResponseText
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanQuoteRoot=lMultiplePlanQuoteRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuotePolicyNumber=lMultiplePlanPriceQuotePolicyNumber
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteLoadingFactorRoot=lMultiplePlanPriceQuoteLoadingFactorRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteLoadingFactorItemYearlyPaymentLoading=lMultiplePlanPriceQuoteLoadingFactorItemYearlyPaymentLoading
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteLoadingFactorItemYearlyPaymentFrequency=lMultiplePlanPriceQuoteLoadingFactorItemYearlyPaymentFrequency
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteLoadingFactorItemInstallmentSixMonthPaymentLoading=lMultiplePlanPriceQuoteLoadingFactorItemInstallmentSixMonthPaymentLoading
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteLoadingFactorItemInstallmentSixMonthPaymentFrequency=lMultiplePlanPriceQuoteLoadingFactorItemInstallmentSixMonthPaymentFrequency
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRoot=lMultiplePlanPriceQuoteCoverageRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageRsaAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageRsaAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionRewardPointExpected=lMultiplePlanPriceQuoteCoverageRsaOptionRewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionRewardPointTarget=lMultiplePlanPriceQuoteCoverageRsaOptionRewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionRewardPointResult=lMultiplePlanPriceQuoteCoverageRsaOptionRewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxExpected=lMultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxResult=lMultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxTarget=lMultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaOptionName=lMultiplePlanPriceQuoteCoverageRsaOptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageRsaDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageRsaFlagOptionalCoverage=lMultiplePlanPriceQuoteCoverageRsaFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageTplAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageTplAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem01Name=lMultiplePlanPriceQuoteCoverageTplOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem02Name=lMultiplePlanPriceQuoteCoverageTplOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem03Name=lMultiplePlanPriceQuoteCoverageTplOptionItem03Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem04Name=lMultiplePlanPriceQuoteCoverageTplOptionItem04Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem05Name=lMultiplePlanPriceQuoteCoverageTplOptionItem05Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem06Name=lMultiplePlanPriceQuoteCoverageTplOptionItem06Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointResult=lMultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxExpected=lMultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxResult=lMultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxTarget=lMultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplOptionItem07Name=lMultiplePlanPriceQuoteCoverageTplOptionItem07Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageTplDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTplFlagOptionalCoverage=lMultiplePlanPriceQuoteCoverageTplFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageTrrAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageTrrAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointExpected=lMultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointTarget=lMultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointResult=lMultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxExpected=lMultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxResult=lMultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxTarget=lMultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem01Name=lMultiplePlanPriceQuoteCoverageTrrOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointExpected=lMultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointTarget=lMultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointResult=lMultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxExpected=lMultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxResult=lMultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxTarget=lMultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrOptionItem02Name=lMultiplePlanPriceQuoteCoverageTrrOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageTrrDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTrrFlagOptionalCoverage=lMultiplePlanPriceQuoteCoverageTrrFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageFlAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageFlAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointExpected=lMultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointTarget=lMultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointResult=lMultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxExpected=lMultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxResult=lMultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxTarget=lMultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem01Name=lMultiplePlanPriceQuoteCoverageFlOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointExpected=lMultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointTarget=lMultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointResult=lMultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxExpected=lMultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxResult=lMultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxTarget=lMultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlOptionItem02Name=lMultiplePlanPriceQuoteCoverageFlOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageFlDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageFlFlagOptionalCoverage=lMultiplePlanPriceQuoteCoverageFlFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageSrccAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageSrccAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointExpected=lMultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointTarget=lMultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointResult=lMultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxExpected=lMultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxResult=lMultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxTarget=lMultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem01Name=lMultiplePlanPriceQuoteCoverageSrccOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointExpected=lMultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointTarget=lMultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointResult=lMultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxExpected=lMultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxResult=lMultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxTarget=lMultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccOptionItem02Name=lMultiplePlanPriceQuoteCoverageSrccOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageSrccDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageSrccSrccagOptionalCoverage=lMultiplePlanPriceQuoteCoverageSrccSrccagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageEqAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageEqAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointExpected=lMultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointTarget=lMultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointResult=lMultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxExpected=lMultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxResult=lMultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxTarget=lMultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem01Name=lMultiplePlanPriceQuoteCoverageEqOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointExpected=lMultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointTarget=lMultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointResult=lMultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxExpected=lMultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxResult=lMultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxTarget=lMultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqOptionItem02Name=lMultiplePlanPriceQuoteCoverageEqOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageEqDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageEqFlagOptionalCoverage=lMultiplePlanPriceQuoteCoverageEqFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoverageTaAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoverageTaAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionRewardPointExpected=lMultiplePlanPriceQuoteCoverageTaOptionRewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionRewardPointTarget=lMultiplePlanPriceQuoteCoverageTaOptionRewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionRewardPointResult=lMultiplePlanPriceQuoteCoverageTaOptionRewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxExpected=lMultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxResult=lMultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxTarget=lMultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaOptionName=lMultiplePlanPriceQuoteCoverageTaOptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageTaDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageTaFlagOptionalCoverage=lMultiplePlanPriceQuoteCoverageTaFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameAdditionalAdditionalCoverageCode=lMultiplePlanPriceQuoteCoveragePameAdditionalAdditionalCoverageCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameAdditionalAdditionalCoverageName=lMultiplePlanPriceQuoteCoveragePameAdditionalAdditionalCoverageName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointResult=lMultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxResult=lMultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem01Name=lMultiplePlanPriceQuoteCoveragePameOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointResult=lMultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxResult=lMultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem02Name=lMultiplePlanPriceQuoteCoveragePameOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointResult=lMultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxResult=lMultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem03Name=lMultiplePlanPriceQuoteCoveragePameOptionItem03Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointResult=lMultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxExpected=lMultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxExpected
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxResult=lMultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxTarget=lMultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxTarget
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameOptionItem04Name=lMultiplePlanPriceQuoteCoveragePameOptionItem04Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameDefaultSelectedOption=lMultiplePlanPriceQuoteCoveragePameDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoveragePameFlagOptionalCoverage=lMultiplePlanPriceQuoteCoveragePameFlagOptionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleProductOptionNumber=lMultiplePlanPriceQuoteCoverageMotorVehicleProductOptionNumber
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01RewardPoint=lMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01RewardPoint
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01PremiumBeforeTax=lMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01PremiumBeforeTax
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01Name=lMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02RewardPoint=lMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02RewardPoint
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02PremiumBeforeTax=lMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02PremiumBeforeTax
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02Name=lMultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02Name
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleFlagApplyLoadingFactor=lMultiplePlanPriceQuoteCoverageMotorVehicleFlagApplyLoadingFactor
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleCode=lMultiplePlanPriceQuoteCoverageMotorVehicleCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleDefaultSelectedOption=lMultiplePlanPriceQuoteCoverageMotorVehicleDefaultSelectedOption
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleName=lMultiplePlanPriceQuoteCoverageMotorVehicleName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteCoverageMotorVehicleFlagCoverage=lMultiplePlanPriceQuoteCoverageMotorVehicleFlagCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataRoot=lMultiplePlanPriceQuoteVehicleDataRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataUwVehicleType=lMultiplePlanPriceQuoteVehicleDataUwVehicleType
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataPolicyEstimatedAnnualMileage=lMultiplePlanPriceQuoteVehicleDataPolicyEstimatedAnnualMileage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataUwVehicleTypeWarningFlag=lMultiplePlanPriceQuoteVehicleDataUwVehicleTypeWarningFlag
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataCarDefaultValueFinal=lMultiplePlanPriceQuoteVehicleDataCarDefaultValueFinal
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataUwVehicleTypeUpdateFlag=lMultiplePlanPriceQuoteVehicleDataUwVehicleTypeUpdateFlag
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataFaultClaimsForRating=lMultiplePlanPriceQuoteVehicleDataFaultClaimsForRating
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteVehicleDataFaultIncurred=lMultiplePlanPriceQuoteVehicleDataFaultIncurred
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuotePolicyPaymentFrequency=lMultiplePlanPriceQuotePolicyPaymentFrequency
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteModelName=lMultiplePlanPriceQuoteModelName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuotePolicyAutoRenewalFlag=lMultiplePlanPriceQuotePolicyAutoRenewalFlag
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuotePolicyProductVersion=lMultiplePlanPriceQuotePolicyProductVersion
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteIrregularityRoot=lMultiplePlanPriceQuoteIrregularityRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteIrregularityErrorMessage=lMultiplePlanPriceQuoteIrregularityErrorMessage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteIrregularityMaxAuthorisarionLevel=lMultiplePlanPriceQuoteIrregularityMaxAuthorisarionLevel
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionRoot=lMultiplePlanPriceQuoteAvailableOptionRoot
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem01OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem01SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem01PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem01ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01Code=lMultiplePlanPriceQuoteAvailableOptionItem01Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem01FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem01OptionName=lMultiplePlanPriceQuoteAvailableOptionItem01OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem02OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem02SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem02PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem02ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02Code=lMultiplePlanPriceQuoteAvailableOptionItem02Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem02FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem02OptionName=lMultiplePlanPriceQuoteAvailableOptionItem02OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem03OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem03SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem03PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem03ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03Code=lMultiplePlanPriceQuoteAvailableOptionItem03Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem03FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem03OptionName=lMultiplePlanPriceQuoteAvailableOptionItem03OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem04OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem04SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem04PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem04ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04Code=lMultiplePlanPriceQuoteAvailableOptionItem04Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem04FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem04OptionName=lMultiplePlanPriceQuoteAvailableOptionItem04OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem05OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem05SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem05PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem05ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05Code=lMultiplePlanPriceQuoteAvailableOptionItem05Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem05FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem05OptionName=lMultiplePlanPriceQuoteAvailableOptionItem05OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem06OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem06SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem06PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem06ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06Code=lMultiplePlanPriceQuoteAvailableOptionItem06Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem06FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem06OptionName=lMultiplePlanPriceQuoteAvailableOptionItem06OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem07OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem07SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem07PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem07ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07Code=lMultiplePlanPriceQuoteAvailableOptionItem07Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem07FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem07OptionName=lMultiplePlanPriceQuoteAvailableOptionItem07OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem08OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem08SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem08PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem08ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08Code=lMultiplePlanPriceQuoteAvailableOptionItem08Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem08FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem08OptionName=lMultiplePlanPriceQuoteAvailableOptionItem08OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem09OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem09SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem09PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem09ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09Code=lMultiplePlanPriceQuoteAvailableOptionItem09Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem09FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem09OptionName=lMultiplePlanPriceQuoteAvailableOptionItem09OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem10OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem10SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem10PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem10ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10Code=lMultiplePlanPriceQuoteAvailableOptionItem10Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem10FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem10OptionName=lMultiplePlanPriceQuoteAvailableOptionItem10OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem11OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem11SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem11PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem11ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11Code=lMultiplePlanPriceQuoteAvailableOptionItem11Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem11FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem11OptionName=lMultiplePlanPriceQuoteAvailableOptionItem11OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem12OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem12SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem12PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem12ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12Code=lMultiplePlanPriceQuoteAvailableOptionItem12Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem12FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem12OptionName=lMultiplePlanPriceQuoteAvailableOptionItem12OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem13OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem13SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem13PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem13ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13Code=lMultiplePlanPriceQuoteAvailableOptionItem13Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem13FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem13OptionName=lMultiplePlanPriceQuoteAvailableOptionItem13OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem14OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem14SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem14PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem14ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14Code=lMultiplePlanPriceQuoteAvailableOptionItem14Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem14FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem14OptionName=lMultiplePlanPriceQuoteAvailableOptionItem14OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem15OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem15SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem15PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem15ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15Code=lMultiplePlanPriceQuoteAvailableOptionItem15Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem15FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem15OptionName=lMultiplePlanPriceQuoteAvailableOptionItem15OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem16OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem16SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem16PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem16ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16Code=lMultiplePlanPriceQuoteAvailableOptionItem16Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem16FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem16OptionName=lMultiplePlanPriceQuoteAvailableOptionItem16OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem17OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem17SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem17PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem17ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17Code=lMultiplePlanPriceQuoteAvailableOptionItem17Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem17FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem17OptionName=lMultiplePlanPriceQuoteAvailableOptionItem17OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem18OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem18SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem18PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem18ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18Code=lMultiplePlanPriceQuoteAvailableOptionItem18Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem18FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem18OptionName=lMultiplePlanPriceQuoteAvailableOptionItem18OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem19OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem19SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem19PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem19ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19Code=lMultiplePlanPriceQuoteAvailableOptionItem19Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem19FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem19OptionName=lMultiplePlanPriceQuoteAvailableOptionItem19OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20OptionSelection=lMultiplePlanPriceQuoteAvailableOptionItem20OptionSelection
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20SelectionDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem20SelectionDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20PremiumDependentCode=lMultiplePlanPriceQuoteAvailableOptionItem20PremiumDependentCode
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20ParentCover=lMultiplePlanPriceQuoteAvailableOptionItem20ParentCover
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20Code=lMultiplePlanPriceQuoteAvailableOptionItem20Code
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20FlagAdditionalCoverage=lMultiplePlanPriceQuoteAvailableOptionItem20FlagAdditionalCoverage
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteAvailableOptionItem20OptionName=lMultiplePlanPriceQuoteAvailableOptionItem20OptionName
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceQuoteDefaultShowPaymentFrequency=lMultiplePlanPriceQuoteDefaultShowPaymentFrequency
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceResult=lMultiplePlanPriceResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateMultiplePlanPriceDetail=lMultiplePlanPriceDetail
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanPriceReleaseVersion=lGetPlanPriceReleaseVersion
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanPriceNumberOfList=lGetPlanPriceNumberOfList
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanWithInstallmentPriceReleaseVersion=lGetPlanWithInstallmentPriceReleaseVersion
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanWithInstallmentPriceNumberOfList=lGetPlanWithInstallmentPriceNumberOfList
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanPriceResult=lGetPlanPriceResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanPriceDetail=lGetPlanPriceDetail
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanWithInstallmentPriceResult=lGetPlanWithInstallmentPriceResult
			 this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.PricingApiGenerateGetPlanWithInstallmentPriceDetail=lGetPlanWithInstallmentPriceDetail*/
			IGNUemaHelper.printLog('Validate ActualResult')
			IGNUemaHelper.printLog(lIsPositiveCase)
			IGNUemaHelper.printLog(lIsRegClientOK)
			IGNUemaHelper.printLog(lIsMultiPlanOK)
			IGNUemaHelper.printLog(lIsGetPlanOK)
			IGNUemaHelper.printLog(lIsGetPlanWithInstallmentOK)
			IGNUemaHelper.printLog(lIsAdditionalCoveragePremiumValidationOK)
			IGNUemaHelper.printLog(lIsPremiumValidationOK)
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsRegClientOK,lIsMultiPlanOK,lIsGetPlanOK,lIsGetPlanWithInstallmentOK,lIsAdditionalCoveragePremiumValidationOK,lIsPremiumValidationOK)
			if(lMapActualResult.Result){
				lActualResult=lMapActualResult.ActualResult
			}
			Map lMapResultMessageResult=this.inputResultMessage(lActualResult)
			if(lMapResultMessageResult.Result){
				lResultMessage=lMapResultMessageResult.ResultMessage
			}
			lMapPricingApiInputOutput.ActualResult=lActualResult
			lMapPricingApiInputOutput.ResultMessage=lResultMessage
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult=lMapPricingApiInputOutput.ActualResult
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldResultMessage=lMapPricingApiInputOutput.ResultMessage
			IGNUemaHelper.printLog(this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult)
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		Boolean lIsPositiveCase=false
		try{
			Boolean lResult=false
			lreturn.put('PositiveCase',lPositiveCase)
			lreturn.put('IsPositiveCase',lIsPositiveCase)
			lreturn.put('Result',lResult)
			lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lPositiveCase=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lResult=lPositiveCase.length()>0
			if(lResult){
				lreturn.put('PositiveCase',lPositiveCase)
				lreturn.put('IsPositiveCase',lIsPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiEndorsementOrCancellationPaymentDetail(String strSubSetIndex,Map mapPricingApiGetPlanWithInstallmentJsonQuotationInput){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapPricingApiUpdatedJsonQuotationInput=[:]
		try{
			lreturn.put('PricingApiUpdatedJsonQuotationInput',lMapPricingApiUpdatedJsonQuotationInput)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiGetPlanWithInstallmentJsonQuotationInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(strSubSetIndex)){
				return lreturn
			}
			String lSubSetIndex=strSubSetIndex
			Map lMapPricingApiGetPlanWithInstallmentJsonQuotationInput=mapPricingApiGetPlanWithInstallmentJsonQuotationInput
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainCurrent=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain()
			IGNUemaHelper.printLog('lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer()')
			IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer())
			List lMapPreviousCoverList=[]
			if(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer()!=0){
				IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainRefer=lIGNTestMasterCaseTypeMainCurrent.getParentIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer())
				IGNUemaHelper.printLog('Refer Output Value')
				IGNTestMasterCaseGroupTypeSheet lIGNTestMasterReferSheet=lIGNTestMasterCaseTypeMainRefer.CaseGroupFactory.getIGNTestMasterCaseGroupTypeSheet(1)
				TreeMap lReferOutput=lIGNTestMasterCaseTypeMainRefer.CaseGroupFactory.getIGNTestMasterCaseGroupTypeSheetMapIGNTestMasterCaseGroupTypeRow(1)
				for (Map.Entry lEntry in lReferOutput){
					IGNUemaHelper.printLog(lEntry.getKey())
					Integer lRowNumber=lEntry.getKey()
					Map lReferMapOutput=lIGNTestMasterReferSheet.getIGNTestMasterCaseGroupTypeRowMapDataOutput(lRowNumber)
					String lSourceName=lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName
					String lReferSubIndex=lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiSubsetIndex
					if(lSourceName.contains('InstallmentPrice')&& lSubSetIndex==lReferSubIndex){
						IGNUemaHelper.printLog(lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePaymentDetail)
						IGNUemaHelper.printLog(lMapPricingApiGetPlanWithInstallmentJsonQuotationInput)
						String lPricingApiGetPlanWithInstallmentPaymentDetail=lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePaymentDetail
						Map lMapPricingApiGetPlanWithInstallmentPaymentDetail=new JsonSlurper().parseText(lPricingApiGetPlanWithInstallmentPaymentDetail)
						List lPricingApiGetPlanWithInstallmentPaymentDetailList=lMapPricingApiGetPlanWithInstallmentPaymentDetail.PaymentDetail
						lMapPricingApiGetPlanWithInstallmentJsonQuotationInput.root.Quote.put('PaymentDetails',lPricingApiGetPlanWithInstallmentPaymentDetailList)
						lMapPricingApiGetPlanWithInstallmentJsonQuotationInput.root.Quote.put('Payment_Decision','IP')
					}
					IGNUemaHelper.printLog(lEntry.getKey().getClass())
				}
				IGNUemaHelper.printLog('Refer TreeMap Output')
				IGNUemaHelper.printLog(lReferOutput)
				IGNUemaHelper.printLog(lMapPricingApiGetPlanWithInstallmentJsonQuotationInput)
			}
			if(lResult){
				lreturn.put('PricingApiUpdatedJsonQuotationInput',lMapPricingApiGetPlanWithInstallmentJsonQuotationInput)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiEndorsementOrCancellationPreviousCover(Sheet targetSheet,String strSubSetIndex,Map mapPricingApiJsonQuotationInput,List strCoverList,List strPremiumList){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapPricingApiUpdatedJsonQuotationInput=[:]
		try{
			lreturn.put('PricingApiUpdatedJsonQuotationInput',lMapPricingApiUpdatedJsonQuotationInput)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				return lreturn
			}
			Sheet lTargetSheet=targetSheet
			if(IGNUemaHelper.checkObjectEmptyOfString(strSubSetIndex)){
				return lreturn
			}
			String lSubSetIndex=strSubSetIndex
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonQuotationInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverList)){
				return lreturn
			}
			List lCoverList=strCoverList
			if(IGNUemaHelper.checkObjectEmptyOfList(strPremiumList)){
				return lreturn
			}
			List lSelectedPricingApiPremiumList=strPremiumList
			Map lMapPricingApiJsonQuotationInput=mapPricingApiJsonQuotationInput
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainCurrent=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain()
			IGNUemaHelper.printLog('lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer()')
			IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer())
			List lMapPreviousCoverList=[]
			if(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer()!=0){
				IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainRefer=lIGNTestMasterCaseTypeMainCurrent.getParentIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer())
				IGNUemaHelper.printLog('Refer Output Value')
				IGNTestMasterCaseGroupTypeSheet lIGNTestMasterReferSheet=lIGNTestMasterCaseTypeMainRefer.CaseGroupFactory.getIGNTestMasterCaseGroupTypeSheet(1)
				TreeMap lReferOutputList=lIGNTestMasterCaseTypeMainRefer.CaseGroupFactory.getIGNTestMasterCaseGroupTypeSheetMapIGNTestMasterCaseGroupTypeRow(1)
				IGNUemaHelper.printLog(lReferOutputList)
				for (Map.Entry lReferRowIndex in lReferOutputList){
					IGNUemaHelper.printLog(lReferRowIndex.getKey())
					Integer lRowNumber=lReferRowIndex.getKey()
					Map lReferMapOutput=lIGNTestMasterReferSheet.getIGNTestMasterCaseGroupTypeRowMapDataOutput(lRowNumber)
					String lSourceName=lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName
					String lReferSubIndex=lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiSubsetIndex
					IGNUemaHelper.printLog(lReferSubIndex)
					IGNUemaHelper.printLog(lSubSetIndex)
					if(lSourceName.contains('InstallmentPrice')&& lSubSetIndex==lReferSubIndex){
						String lPreviousGetPlanCoverData=lReferMapOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteCoverRoot
						Map lMapJsonCoverData=new JsonSlurper().parseText(lPreviousGetPlanCoverData)
						Map lMapPreviousCover=[:]
						IGNUemaHelper.printLog('lMapJsonCoverData')
						IGNUemaHelper.printLog(lMapJsonCoverData)
						for(Map.Entry lEntry in lMapJsonCoverData){
							String lCoverName=lEntry.getKey()
							lMapPreviousCover=lMapJsonCoverData.get(lCoverName)
							Map lMapPreviousCoverData=[:]
							Map lMapPreviousCoverField=lMapPricingApiJsonQuotationInput.root.Quote.PreviousCovers
							for(Map.Entry lCoverFieldEntry in lMapPreviousCoverField){
								String lCoverField=lCoverFieldEntry.getKey()
								String lCoverValue=lCoverFieldEntry.getValue()
								IGNUemaHelper.printLog('lCover- Code')
								IGNUemaHelper.printLog(lCoverValue)
								String lCoverFieldValue=lMapPreviousCover.get(lCoverField)
								if(IGNUemaHelper.checkObjectNullOfObject(lCoverFieldValue)){
									lCoverFieldValue=lMapPreviousCover.get(lCoverValue)
									if(!IGNUemaHelper.checkObjectNullOfObject(lCoverFieldValue)){
										lMapPreviousCoverData.put(lCoverField,lCoverFieldValue)
									}else{
										lMapPreviousCoverData.put(lCoverField,lCoverValue)
									}
								}else{
									lMapPreviousCoverData.put(lCoverField,lCoverFieldValue)
								}
							}
							lMapPreviousCoverList.add(lMapPreviousCoverData)
						}
						lMapPricingApiJsonQuotationInput.root.Quote.put('PreviousCovers',lMapPreviousCoverList)
						IGNUemaHelper.printLog(lCoverList)
						IGNUemaHelper.printLog(lMapJsonCoverData)
						for(Integer lGetCellIndex=0;lGetCellIndex<=lSelectedPricingApiPremiumList.size()-1;lGetCellIndex++){
							String lCurrentCoverName=lCoverList.get(lGetCellIndex)
							lMapPreviousCover=lMapJsonCoverData.get(lCurrentCoverName)
							Map lMapPricingApiPreviousAnnualNetPremium=lSelectedPricingApiPremiumList.get(lGetCellIndex).PrevAnnualNetPremium
							Integer lAnnualNetPremiumRowNumber=lMapPricingApiPreviousAnnualNetPremium.RowNumber
							Integer lAnnualNetPremiumColumnNumber=lMapPricingApiPreviousAnnualNetPremium.ColumnNumber
							Map lMapPricingApiPreviousPolicyNetPremium=lSelectedPricingApiPremiumList.get(lGetCellIndex).PrevPolicyNetPremium
							Integer lPolicyNetPremiumRowNumber=lMapPricingApiPreviousPolicyNetPremium.RowNumber
							Integer lPolicyNetPremiumColumnNumber=lMapPricingApiPreviousPolicyNetPremium.ColumnNumber
							Map lMapPricingApiPreviousPolicyStampDuty=lSelectedPricingApiPremiumList.get(lGetCellIndex).PrevPolicyStampDuty
							Integer lPolicyStampDutyRowNumber=lMapPricingApiPreviousPolicyStampDuty.RowNumber
							Integer lPolicyStampDutyColumnNumber=lMapPricingApiPreviousPolicyStampDuty.ColumnNumber
							Map lMapPricingApiPreviousPolicyTax=lSelectedPricingApiPremiumList.get(lGetCellIndex).PrevPolicyTax
							Integer lPolicyTaxRowNumber=lMapPricingApiPreviousPolicyTax.RowNumber
							Integer lPolicyTaxColumnNumber=lMapPricingApiPreviousPolicyTax.ColumnNumber
							if(!IGNUemaHelper.checkObjectNullOfObject(lMapPreviousCover)){
								String lPreviousAnnualNetPremium=lMapPreviousCover.annualNetPremium
								IGNUemaHelper.printLog('lPreviousAnnualNetPremium- Previous')
								IGNUemaHelper.printLog(lPreviousAnnualNetPremium)
								Boolean lIsWriteAnnualNetPremium=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lAnnualNetPremiumRowNumber,lAnnualNetPremiumColumnNumber,lPreviousAnnualNetPremium)
								String lPreviousPolicyNetPremium=lMapPreviousCover.policyNetPremium
								IGNUemaHelper.printLog('lPreviousPolicyNetPremium- Previous')
								IGNUemaHelper.printLog(lPreviousPolicyNetPremium)
								Boolean lIsWritePolicyNetPremium=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lPolicyNetPremiumRowNumber,lPolicyNetPremiumColumnNumber,lPreviousPolicyNetPremium)
								String lPreviousPolicyStampDuty=lMapPreviousCover.policyStampDuty
								IGNUemaHelper.printLog('lPreviousPolicyStampDuty- Previous')
								IGNUemaHelper.printLog(lPreviousPolicyStampDuty)
								Boolean lIsWritePolicyStampDuty=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lPolicyStampDutyRowNumber,lPolicyStampDutyColumnNumber,lPreviousPolicyStampDuty)
								Boolean lIsWritePolicyTax=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lPolicyTaxRowNumber,lPolicyTaxColumnNumber,'0')
							}else{
								Boolean lIsWriteAnnualNetPremium=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lAnnualNetPremiumRowNumber,lAnnualNetPremiumColumnNumber,'0')
								Boolean lIsWritePolicyNetPremium=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lPolicyNetPremiumRowNumber,lPolicyNetPremiumColumnNumber,'0')
								Boolean lIsWritePolicyStampDuty=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lPolicyStampDutyRowNumber,lPolicyStampDutyColumnNumber,'0')
								Boolean lIsWritePolicyTax=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lPolicyTaxRowNumber,lPolicyTaxColumnNumber,'0')
							}
						}
					}
				}
			}
			IGNUemaHelper.printLog('Endorsement data After Adding previous Covers')
			IGNUemaHelper.printLog(lMapPricingApiJsonQuotationInput)
			lMapPricingApiUpdatedJsonQuotationInput=lMapPricingApiJsonQuotationInput
			lResult=lMapPreviousCoverList.size()>=0
			if(lResult){
				lreturn.put('PricingApiUpdatedJsonQuotationInput',lMapPricingApiUpdatedJsonQuotationInput)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiEndorsementOrCancellationRequestBodyData(String strPricingApiJsonQuotationInput,Sheet sheetMasterData){
		Map lreturn=[:]
		String lPricingApiEndorsementOrCancellationRequestBodyData=''
		Boolean lResult=false
		try{
			lreturn.put('Result',lResult)
			lreturn.put('PricingApiEndorsementOrCancellationRequestBodyData',lPricingApiEndorsementOrCancellationRequestBodyData)
			if(IGNUemaHelper.checkObjectEmptyOfString(strPricingApiJsonQuotationInput)){
				return lreturn
			}
			String lPricingApiJsonQuotationInput=strPricingApiJsonQuotationInput
			if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterData)){
				return lreturn
			}
			Sheet lTargetSheet=sheetMasterData
			String lActualResult=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataReferOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult
			Boolean lIsPreviousCaseResultOK=IGNUemaHelper.convertStringToBoolean(lActualResult)
			IGNUemaHelper.printLog(lActualResult)
			if(!lIsPreviousCaseResultOK){
				return lreturn
			}
			String lPricingApiReferJsonRootQuotationInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataReferOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateMultiplePlanPriceRequestText
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainCurrent=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain()
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainRefer=lIGNTestMasterCaseTypeMainCurrent.getParentIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer())
			IGNUemaHelper.printLog('ReferQuotationInput-lPricingApiReferJsonRootQuotationInput')
			IGNUemaHelper.printLog(lPricingApiReferJsonRootQuotationInput)
			Map lMapPricingApiReferJsonRootQuotationInput=new JsonSlurper().parseText(lPricingApiReferJsonRootQuotationInput)
			Map lMapPricingApiJsonQuotationInput=new JsonSlurper().parseText(lPricingApiJsonQuotationInput)
			Map lMapPricingApiJsonPreviousCoverData=lMapPricingApiJsonQuotationInput.root.Quote.PreviousCovers
			String lInputMasterSetId=lMapPricingApiJsonQuotationInput.root.Quote.MasterSetId
			lMapPricingApiReferJsonRootQuotationInput.root.Quote.put('PreviousCovers',lMapPricingApiJsonPreviousCoverData)
			JsonBuilder lJsonPricingApiReferJsonRootQuotationInput=new JsonBuilder(lMapPricingApiReferJsonRootQuotationInput)
			lPricingApiReferJsonRootQuotationInput=lJsonPricingApiReferJsonRootQuotationInput.toString()
			String lMergePricingApiJsonRootQuotationInput=IGNUemaHelper.mergeStringJsonTextFromOrgByUpdForPricingAPI(lPricingApiReferJsonRootQuotationInput,lPricingApiJsonQuotationInput,true,true,false)
			IGNUemaHelper.printLog('Endorsement-RequestBody After Merging')
			IGNUemaHelper.printLog(lMergePricingApiJsonRootQuotationInput)
			Map lMapPricingApiMergeJsonQuotationInput=new JsonSlurper().parseText(lMergePricingApiJsonRootQuotationInput)
			Map lUpdatedPricingApiJsonQuotationInput=new JsonSlurper().parseText(lMergePricingApiJsonRootQuotationInput)
			Map lMapPricingApiReferQuoteData=lMapPricingApiReferJsonRootQuotationInput.root.Quote
			Map lMapPricingApiPreviousCoverData=lMapPricingApiMergeJsonQuotationInput.root.Quote.PreviousCovers
			IGNUemaHelper.printLog('lMapPricingApiPreviousCoverData')
			IGNUemaHelper.printLog(lMapPricingApiPreviousCoverData)
			for(Map.Entry lEntry in lMapPricingApiPreviousCoverData){
				String lValue=lEntry.getValue()
				String lKey=lEntry.getKey()
				if(!IGNUemaHelper.checkObjectEmptyOfString(lValue)){
					String lPreviousCoverFieldValue=lMapPricingApiReferQuoteData.get(lValue)
					if(!IGNUemaHelper.checkObjectNullOfObject(lPreviousCoverFieldValue)){
						lUpdatedPricingApiJsonQuotationInput.root.Quote.PreviousCovers.put(lKey,lPreviousCoverFieldValue)
					}
				}
			}
			IGNUemaHelper.printLog('Update PreviousCoverdate Value')
			IGNUemaHelper.printLog(lUpdatedPricingApiJsonQuotationInput)
			if(!IGNUemaHelper.checkObjectEmptyOfString(lInputMasterSetId)){
				lUpdatedPricingApiJsonQuotationInput.root.Quote.put('MasterSetId',lInputMasterSetId)
			}
			JsonBuilder lJsonUpdatedPricingApiJsonQuotationInput=new JsonBuilder(lUpdatedPricingApiJsonQuotationInput)
			String lStrJsonUpdatedPricingApiJsonQuotationInput=lJsonUpdatedPricingApiJsonQuotationInput.toString()
			lPricingApiEndorsementOrCancellationRequestBodyData=lStrJsonUpdatedPricingApiJsonQuotationInput
			lResult=lPricingApiEndorsementOrCancellationRequestBodyData.length()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('PricingApiEndorsementOrCancellationRequestBodyData',lPricingApiEndorsementOrCancellationRequestBodyData)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputReferCaseNumber(String strReferCaseNumber){
		Boolean lreturn=false
		String lReferCaseNumber=strReferCaseNumber
		try{
			if(!IGNUemaHelper.checkObjectEmptyOfString(strReferCaseNumber)){
				lreturn=true
			}
		}
		catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Boolean inputTestReport(){
		Boolean lreturn=false
		try{
			String lActualResult=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult
			Boolean lIsActualResultOK=IGNUemaHelper.convertStringToBoolean(lActualResult)
			String lPricingApiTotalNumberOfCases=IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ALL
			Integer lPricingApiTotalNumberOfCasesNum=IGNUemaHelper.convertStringToInteger(lPricingApiTotalNumberOfCases,0)
			lPricingApiTotalNumberOfCasesNum=lPricingApiTotalNumberOfCasesNum+1
			lPricingApiTotalNumberOfCases=Integer.toString(lPricingApiTotalNumberOfCasesNum)
			IGNUemaHelper.printLog('Test Case sub set index')
			Integer lSubSetDataIndex=0
			Integer lPricingApiNumberOfTestCaseSubset=IGNUemaHelper.convertStringToInteger(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_SUBSET,0)
			lSubSetDataIndex=this.CURRENT_NUMBER_OF_SUBSET+lPricingApiNumberOfTestCaseSubset
			IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_SUBSET=lSubSetDataIndex.toString()
			IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ALL=lPricingApiTotalNumberOfCases
			IGNUemaHelper.printLog('Number Of Subset in Current Case:')
			IGNUemaHelper.printLog(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_SUBSET)
			if(lIsActualResultOK){
				Integer lPricingApiNumberOfTestCasesPassedNum=IGNUemaHelper.convertStringToInteger(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_PASSED,0)
				lPricingApiNumberOfTestCasesPassedNum=lPricingApiNumberOfTestCasesPassedNum+1
				String lPricingApiNumberOfTestCasesPassed=Integer.toString(lPricingApiNumberOfTestCasesPassedNum)
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_PASSED=lPricingApiNumberOfTestCasesPassed
			}else{
				Integer lPricingApiNumberOfTestCasesFailedNum=IGNUemaHelper.convertStringToInteger(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_FAILED,0)
				lPricingApiNumberOfTestCasesFailedNum=lPricingApiNumberOfTestCasesFailedNum+1
				String lPricingApiNumberOfTestCasesFailed=Integer.toString(lPricingApiNumberOfTestCasesFailedNum)
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_FAILED=lPricingApiNumberOfTestCasesFailed
			}
			lreturn=true
		}
		catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredCallTokenKey(String strCallTokenKey){
		Map lreturn=[:]
		String lQuoteRequiredCallTokenKey=strCallTokenKey.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallTokenKey',lQuoteRequiredCallTokenKey)
			lreturn.put('Result',lResult)
			if(lQuoteRequiredCallTokenKey.length()<=0){
				lQuoteRequiredCallTokenKey=''
			}
			lResult=lQuoteRequiredCallTokenKey.length()>=0
			if(lResult){
				lreturn.put('CallTokenKey',lQuoteRequiredCallTokenKey)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredCallSdkVersion(String strCallSdkVersion){
		Map lreturn=[:]
		String lQuoteRequiredCallSdkVersion=strCallSdkVersion.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallSdkVersion','')
			lreturn.put('Result',lResult)
			if(lQuoteRequiredCallSdkVersion.length()<=0){
				lQuoteRequiredCallSdkVersion=''
			}
			lResult=lQuoteRequiredCallSdkVersion.length()>=0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('CallSdkVersion',lQuoteRequiredCallSdkVersion)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredCallProductType(String strCallProductType){
		Map lreturn=[:]
		String lQuoteRequiredCallProductType=strCallProductType.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallProductType','')
			lreturn.put('Result',lResult)
			if(lQuoteRequiredCallProductType.length()<=0){
				lQuoteRequiredCallProductType=''
			}
			lResult=lQuoteRequiredCallProductType.length()>=0
			if(lResult){
				lreturn.put('CallProductType',lQuoteRequiredCallProductType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredCallMasterSetId(String strCallMasterSetId){
		Map lreturn=[:]
		String lQuoteRequiredCallMasterSetId=strCallMasterSetId.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallMasterSetId','')
			lreturn.put('Result',lResult)
			if(lQuoteRequiredCallMasterSetId.length()<=0){
				lQuoteRequiredCallMasterSetId=''
			}
			lResult=lQuoteRequiredCallMasterSetId.length()>=0
			if(lResult){
				lreturn.put('CallMasterSetId',lQuoteRequiredCallMasterSetId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredProductType(String strProductType){
		Map lreturn=[:]
		String lQuoteRequiredProductType=strProductType.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteRequiredProductType',lQuoteRequiredProductType)
			lreturn.put('Result',lResult)
			if(lQuoteRequiredProductType.length()<=0){
				lQuoteRequiredProductType=''
			}
			lResult=lQuoteRequiredProductType.length()>=0
			if(lResult){
				lreturn.put('QuoteRequiredProductType',lQuoteRequiredProductType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredTransactionType(String strTransactionType){
		Map lreturn=[:]
		String lQuoteRequiredTransactionType=strTransactionType.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteRequiredTransactionType','')
			lreturn.put('Result',lResult)
			if(lQuoteRequiredTransactionType.length()<=0){
				lQuoteRequiredTransactionType=''
			}
			lResult=lQuoteRequiredTransactionType.length()>=0
			if(lResult){
				lreturn.put('QuoteRequiredTransactionType',lQuoteRequiredTransactionType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredQuoteDate(String strQuoteRequiredQuoteDateToAdd,String strQuoteRequiredQuoteOffsetDay,String strQuoteRequiredQuoteDate){
		Map lreturn=[:]
		String lQuoteRequiredQuoteOffsetDay=strQuoteRequiredQuoteOffsetDay.trim()
		String lQuoteRequiredQuoteDate=strQuoteRequiredQuoteDate.trim()
		String lQuoteRequiredQuoteDateTime=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteRequiredQuoteDate',lQuoteRequiredQuoteDateTime)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteRequiredQuoteDateToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteRequiredQuoteDateToAdd)
			if(!lIsQuoteRequiredQuoteDateToAdd){
				lQuoteRequiredQuoteDate=''
			}else{
				String lFormatDate='dd/MM/yyyy'
				if(lQuoteRequiredQuoteDate.length()<=0){
					lQuoteRequiredQuoteDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
				}
				if(lQuoteRequiredQuoteOffsetDay.length()<=0){
					lQuoteRequiredQuoteOffsetDay='0'
				}
				IGNUemaHelper.printLog('QuoteRequiredQuoteDate')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteDate)
				Integer lQuoteRequiredQuoteOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteRequiredQuoteOffsetDay,0)
				IGNUemaHelper.printLog('QuoteRequiredQuoteDateOffsetNumber')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteOffsetDayNum)
				lQuoteRequiredQuoteDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteRequiredQuoteDate,lQuoteRequiredQuoteOffsetDayNum)
				IGNUemaHelper.printLog('QuoteRequiredQuoteDateOffset')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteDate)
				String lQuoteRequiredQuoteDateDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lQuoteRequiredQuoteDate)
				IGNUemaHelper.printLog('lQuoteRequiredQuoteDateDD')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteDateDD)
				String lQuoteRequiredQuoteDateMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lQuoteRequiredQuoteDate)
				IGNUemaHelper.printLog('lQuoteRequiredQuoteDateMM')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteDateMM)
				String lQuoteRequiredQuoteDateYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lQuoteRequiredQuoteDate)
				IGNUemaHelper.printLog('lQuoteRequiredQuoteDateYYYY')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteDateYYYY)
				String lQuoteRequiredQuoteTime=IGNUemaHelper.convertLocalTimeToTimeZoneString()
				IGNUemaHelper.printLog('lQuoteRequiredQuoteTime')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteTime)
				String lQuoteRequiredQuoteTimeHour=IGNUemaHelper.extractTimeStringHourFromTimeZoneStringColonDotHHMMSSZZZZ(lQuoteRequiredQuoteTime)
				String lQuoteRequiredQuoteTimeMinute=IGNUemaHelper.extractTimeStringMinuteFromTimeZoneStringColonDotHHMMSSZZZZ(lQuoteRequiredQuoteTime)
				String lQuoteRequiredQuoteTimeSecond=IGNUemaHelper.extractTimeStringSecondFromTimeZoneStringColonDotHHMMSSZZZZ(lQuoteRequiredQuoteTime)
				String lQuoteRequiredQuoteTimeZone=IGNUemaHelper.extractTimeStringZoneFromTimeZoneStringColonDotHHMMSSZZZZ(lQuoteRequiredQuoteTime)
				lQuoteRequiredQuoteDateTime=IGNUemaHelper.convertLocalDateTimeToInstantString(IGNUemaHelper.encodeLocalDateTimeWithZoneFromStringNumber(lQuoteRequiredQuoteDateYYYY,lQuoteRequiredQuoteDateMM,lQuoteRequiredQuoteDateDD,lQuoteRequiredQuoteTimeHour,lQuoteRequiredQuoteTimeMinute,lQuoteRequiredQuoteTimeSecond,lQuoteRequiredQuoteTimeZone))
				IGNUemaHelper.printLog('lQuoteRequiredQuoteDateTime')
				IGNUemaHelper.printLog(lQuoteRequiredQuoteDateTime)
			}
			lResult=(lQuoteRequiredQuoteDateTime.length())>=0
			if(lResult){
				lreturn.put('QuoteRequiredQuoteDate',lQuoteRequiredQuoteDateTime)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalGeoPostalCode(String strQuoteOptionalGeoPostalCodeToAdd,String strQuoteOptionalGeoPostalCode){
		Map lreturn=[:]
		String lQuoteOptionalGeoPostalCodeToAdd=strQuoteOptionalGeoPostalCodeToAdd.trim()
		String lQuoteOptionalGeoPostalCode=strQuoteOptionalGeoPostalCode.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalGeoPostalCode','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalGeoPostalCodeToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalGeoPostalCodeToAdd)
			if(!lIsQuoteOptionalGeoPostalCodeToAdd){
				lQuoteOptionalGeoPostalCode='0'
			}
			lResult=lQuoteOptionalGeoPostalCode.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalGeoPostalCode',lQuoteOptionalGeoPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalCover(String strQuoteOptionalCover){
		Map lreturn=[:]
		String lQuoteOptionalCover=strQuoteOptionalCover.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalCover','')
			lreturn.put('Result',lResult)
			if(lQuoteOptionalCover.length()<=0){
				lQuoteOptionalCover=''
			}
			lResult=lQuoteOptionalCover.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalCover',lQuoteOptionalCover)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalHealthQuestion(String strQuoteOptionalHealthQuestionToAdd,String strQuoteOptionalHealthQuestion){
		Map lreturn=[:]
		String lQuoteOptionalHealthQuestionToAdd=strQuoteOptionalHealthQuestionToAdd.trim()
		String lQuoteOptionalHealthQuestion=strQuoteOptionalHealthQuestion.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalHealthQuestion','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalHealthQuestionToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalHealthQuestionToAdd)
			if(!lIsQuoteOptionalHealthQuestionToAdd){
				lQuoteOptionalHealthQuestion=''
			}
			lResult=lQuoteOptionalHealthQuestion.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalHealthQuestion',lQuoteOptionalHealthQuestion)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalPolicyAutoRenewal(String strQuoteOptionalAutoRenewalToAdd,String strQuoteOptionalAutoRenewal){
		Map lreturn=[:]
		String lQuoteOptionalAutoRenewalToAdd=strQuoteOptionalAutoRenewalToAdd.trim()
		String lQuoteOptionalAutoRenewal=strQuoteOptionalAutoRenewal.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalPolicyAutoRenewal','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalAutoRenewalToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalAutoRenewalToAdd)
			if(!lIsQuoteOptionalAutoRenewalToAdd){
				lQuoteOptionalAutoRenewal='0'
			}
			lResult=lQuoteOptionalAutoRenewal.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalPolicyAutoRenewal',lQuoteOptionalAutoRenewal)
				lreturn.put('Result',lResult)
			}
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalPolicyStartDate(String strQuoteOptionalPolicyStartDateToAdd,String strQuoteOptionalPolicyStartOffsetDay,String strQuoteOptionalPolicyStartDate){
		Map lreturn=[:]
		String lQuoteOptionalPolicyStartDateToAdd=strQuoteOptionalPolicyStartDateToAdd.trim()
		String lQuoteOptionalPolicyStartDate=strQuoteOptionalPolicyStartDate.trim()
		String lQuoteOptionalPolicyStartDateOffsetDay=strQuoteOptionalPolicyStartOffsetDay.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalPolicyStartDate',lQuoteOptionalPolicyStartDate)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalStartDateToAdd=IGNUemaHelper.convertStringToBoolean(lQuoteOptionalPolicyStartDateToAdd)
			if(!lIsQuoteOptionalStartDateToAdd){
				lQuoteOptionalPolicyStartDate=''
			}else{
				String lFormatDate='yyyy-MM-dd'
				if(lQuoteOptionalPolicyStartDate.length()<=0){
					lQuoteOptionalPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
				}
				if(lQuoteOptionalPolicyStartDateOffsetDay.length()<=0){
					lQuoteOptionalPolicyStartDateOffsetDay='0'
				}
				Integer lQuoteOptionalPolicyStartDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteOptionalPolicyStartDateOffsetDay,0)
				lQuoteOptionalPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteOptionalPolicyStartDate,lQuoteOptionalPolicyStartDateOffsetDayNum)
			}
			IGNUemaHelper.printLog('lQuoteOptionalPolicyStartDate')
			IGNUemaHelper.printLog(lQuoteOptionalPolicyStartDate)
			lResult=(lQuoteOptionalPolicyStartDate.length()>0)
			if(lResult){
				lreturn.put('QuoteOptionalPolicyStartDate',lQuoteOptionalPolicyStartDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalPolicyEndDate(String strQuoteOptionalPolicyEndDateToAdd,String strQuoteOptionalPolicyEndOffsetDay,String strQuoteOptionalPolicyEndDate){
		Map lreturn=[:]
		String lQuoteOptionalPolicyEndDateToAdd=strQuoteOptionalPolicyEndDateToAdd.trim()
		String lQuoteOptionalPolicyEndDate=strQuoteOptionalPolicyEndDate.trim()
		String lQuoteOptionalPolicyEndDateOffsetDay=strQuoteOptionalPolicyEndOffsetDay.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalPolicyEndDate',lQuoteOptionalPolicyEndDate)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalPolicyEndDateToAdd=IGNUemaHelper.convertStringToBoolean(lQuoteOptionalPolicyEndDateToAdd)
			if(!lIsQuoteOptionalPolicyEndDateToAdd){
				lQuoteOptionalPolicyEndDate=''
			}else{
				String lFormatDate='yyyy-MM-dd'
				if(lQuoteOptionalPolicyEndDate.length()<=0){
					lQuoteOptionalPolicyEndDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
				}
				if(lQuoteOptionalPolicyEndDateOffsetDay.length()<=0){
					lQuoteOptionalPolicyEndDateOffsetDay='0'
				}
				Integer lQuoteOptionalPolicyEndDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteOptionalPolicyEndDateOffsetDay,0)
				lQuoteOptionalPolicyEndDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteOptionalPolicyEndDate,lQuoteOptionalPolicyEndDateOffsetDayNum)
			}
			lResult=lQuoteOptionalPolicyEndDate.length()>0
			if(lResult){
				lreturn.put('QuoteOptionalPolicyEndDate',lQuoteOptionalPolicyEndDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalFirstQuoteDate(String strQuoteOptionalFirstQuoteDateToAdd,String strQuoteOptionalFirstQuoteDateOffsetDay,String strQuoteOptionalFirstQuoteDate){
		Map lreturn=[:]
		String lQuoteOptionalFirstQuoteDateToAdd=strQuoteOptionalFirstQuoteDateToAdd.trim()
		String lQuoteOptionalFirstQuoteDateOffsetDay=strQuoteOptionalFirstQuoteDateOffsetDay.trim()
		String lQuoteOptionalFirstQuoteDate=strQuoteOptionalFirstQuoteDate.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalFirstQuoteDate',lQuoteOptionalFirstQuoteDate)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalFirstQuoteDateToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalFirstQuoteDateToAdd)
			if(!lIsQuoteOptionalFirstQuoteDateToAdd){
				lQuoteOptionalFirstQuoteDate=''
			}else{
				String lFormatDate='yyyy-MM-dd'
				if(lQuoteOptionalFirstQuoteDate.length()<=0){
					lQuoteOptionalFirstQuoteDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
				}
				if(lQuoteOptionalFirstQuoteDateOffsetDay.length()<=0){
					lQuoteOptionalFirstQuoteDateOffsetDay='0'
				}
				Integer lQuoteOptionalFirstQuoteDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteOptionalFirstQuoteDateOffsetDay,0)
				lQuoteOptionalFirstQuoteDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteOptionalFirstQuoteDate,lQuoteOptionalFirstQuoteDateOffsetDayNum)
			}
			lResult=lQuoteOptionalFirstQuoteDate.length()>0
			if(lResult){
				lreturn.put('QuoteOptionalFirstQuoteDate',lQuoteOptionalFirstQuoteDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalPolicyRenewalInviteCount(String strQuoteOptionalPolicyRenewalInviteCountToAdd,String strQuoteOptionalPolicyRenewalInviteCount){
		Map lreturn=[:]
		String lQuoteOptionalPolicyRenewalInviteCountToAdd=strQuoteOptionalPolicyRenewalInviteCountToAdd.trim()
		String lQuoteOptionalPolicyRenewalInviteCount=strQuoteOptionalPolicyRenewalInviteCount.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalPolicyRenewalInviteCount','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalPolicyRenewalInviteCountToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalPolicyRenewalInviteCountToAdd)
			if(lIsQuoteOptionalPolicyRenewalInviteCountToAdd){
				lQuoteOptionalPolicyRenewalInviteCount=strQuoteOptionalPolicyRenewalInviteCount
			}else{
				lQuoteOptionalPolicyRenewalInviteCount='0'
			}
			lResult=lQuoteOptionalPolicyRenewalInviteCount.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalPolicyRenewalInviteCount',lQuoteOptionalPolicyRenewalInviteCount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalEndorsementEffectiveDate(String strQuoteOptionalEndorsementEffectiveDateToAdd,String strQuoteOptionalEndorsementEffectiveDateOffsetDay,String strQuoteOptionalEndorsementEffectiveDate){
		Map lreturn=[:]
		String lQuoteOptionalEndorsementEffectiveDateToAdd=strQuoteOptionalEndorsementEffectiveDateToAdd.trim()
		String lQuoteOptionalEndorsementEffectiveDate=strQuoteOptionalEndorsementEffectiveDate.trim()
		String lQuoteOptionalEndorsementEffectiveDateOffsetDay=strQuoteOptionalEndorsementEffectiveDateOffsetDay.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalEndorsementEffectiveDate','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalEndorsementEffectiveDateToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalEndorsementEffectiveDateToAdd)
			if(!lIsQuoteOptionalEndorsementEffectiveDateToAdd){
				lQuoteOptionalEndorsementEffectiveDate=''
			}else{
				String lFormatDate='yyyy-MM-dd'
				if(lQuoteOptionalEndorsementEffectiveDate.length()<=0){
					lQuoteOptionalEndorsementEffectiveDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
				}
				if(lQuoteOptionalEndorsementEffectiveDateOffsetDay.length()<=0){
					lQuoteOptionalEndorsementEffectiveDateOffsetDay='0'
				}
				Integer lQuoteOptionalEndorsementEffectiveDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteOptionalEndorsementEffectiveDateOffsetDay,0)
				lQuoteOptionalEndorsementEffectiveDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteOptionalEndorsementEffectiveDate,lQuoteOptionalEndorsementEffectiveDateOffsetDayNum)
			}
			lResult=lQuoteOptionalEndorsementEffectiveDate.length()>0
			if(lResult){
				lreturn.put('QuoteOptionalEndorsementEffectiveDate',lQuoteOptionalEndorsementEffectiveDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalPolicyNumber(String strQuoteOptionalPolicyNumberToAdd,String strQuoteOptionalPolicyNumber){
		Map lreturn=[:]
		String lQuoteOptionalPolicyNumberToAdd=strQuoteOptionalPolicyNumberToAdd.trim()
		String lQuoteOptionalPolicyNumber=strQuoteOptionalPolicyNumber.trim()
		try{
			Boolean lResult=false
			lreturn.put('PolicyNumber','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalPolicyNumberToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalPolicyNumberToAdd)
			if(!lIsQuoteOptionalPolicyNumberToAdd){
				lQuoteOptionalPolicyNumber=''
			}
			lResult=lQuoteOptionalPolicyNumber.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalPolicyNumber',lQuoteOptionalPolicyNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalApprovedCode(String strQuoteOptionalApprovedCodeToAdd,String strQuoteOptionalApprovedCode){
		Map lreturn=[:]
		String lQuoteOptionalApprovedCodeToAdd=strQuoteOptionalApprovedCodeToAdd.trim()
		String lQuoteOptionalApprovedCode=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalApprovedCode','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalApprovedCodeToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalApprovedCodeToAdd)
			if(!lIsQuoteOptionalApprovedCodeToAdd){
				lQuoteOptionalApprovedCode=''
			}
			lResult=lQuoteOptionalApprovedCode.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalApprovedCode',lQuoteOptionalApprovedCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalQuestionSetCode(String strQuoteOptionalQuestionSetCodeToAdd,String strQuoteOptionalQuestionSetCode){
		Map lreturn=[:]
		String lQuoteOptionalQuestionSetCodeToAdd=strQuoteOptionalQuestionSetCodeToAdd.trim()
		String lQuoteOptionalQuestionSetCode=strQuoteOptionalQuestionSetCode.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalQuestionSetCode','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalQuestionSetCodeToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalQuestionSetCodeToAdd)
			if(!lIsQuoteOptionalQuestionSetCodeToAdd){
				lQuoteOptionalQuestionSetCode=''
			}
			lResult=lQuoteOptionalQuestionSetCode.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalQuestionSetCode',lQuoteOptionalQuestionSetCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalEndorsementReason(String strQuoteOptionalEndorsementReasonToAdd,String strQuoteOptionalEndorsementReason){
		Map lreturn=[:]
		String lQuoteOptionalEndorsementReasonToAdd=strQuoteOptionalEndorsementReasonToAdd.trim()
		String lQuoteOptionalEndorsementReason=strQuoteOptionalEndorsementReason.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalEndorsementReason','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalEndorsementReasonToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalEndorsementReasonToAdd)
			if(!lIsQuoteOptionalEndorsementReasonToAdd){
				lQuoteOptionalEndorsementReason=''
			}
			lResult=lQuoteOptionalEndorsementReason.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalEndorsementReason',lQuoteOptionalEndorsementReason)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalEndorsementCancellationMethod(String strQuoteOptionalEndorsementCancellationMethodToAdd,String strQuoteOptionalEndorsementCancellationMethod){
		Map lreturn=[:]
		String lQuoteOptionalEndorsementCancellationMethodToAdd=strQuoteOptionalEndorsementCancellationMethodToAdd.trim()
		String lQuoteOptionalEndorsementCancellationMethod=strQuoteOptionalEndorsementCancellationMethod.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalEndorsementCancellationMethod','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalEndorsementCancellationMethodToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalEndorsementCancellationMethodToAdd)
			if(!lIsQuoteOptionalEndorsementCancellationMethodToAdd){
				lQuoteOptionalEndorsementCancellationMethod=''
			}
			lResult=lQuoteOptionalEndorsementCancellationMethod.length()>=0
			if(lResult){
				lreturn.put('QuoteOptionalEndorsementCancellationMethod',lQuoteOptionalEndorsementCancellationMethod)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListRequiredAccident(String strQuoteInsuredListRequiredAccident){
		Map lreturn=[:]
		String lQuoteInsuredListRequiredAccident=strQuoteInsuredListRequiredAccident.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListRequiredAccident',lQuoteInsuredListRequiredAccident)
			lreturn.put('Result',lResult)
			if(lQuoteInsuredListRequiredAccident.length()<=0){
				lQuoteInsuredListRequiredAccident=''
			}
			lResult=lQuoteInsuredListRequiredAccident.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListRequiredAccident',lQuoteInsuredListRequiredAccident)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListRequiredDrivingExperience(String strQuoteInsuredListRequiredDrivingExperience){
		Map lreturn=[:]
		String lQuoteInsuredListRequiredDrivingExperience=strQuoteInsuredListRequiredDrivingExperience.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListRequiredDrivingExperience',lQuoteInsuredListRequiredDrivingExperience)
			lreturn.put('Result',lResult)
			if(lQuoteInsuredListRequiredDrivingExperience.length()<=0){
				lQuoteInsuredListRequiredDrivingExperience=''
			}
			lResult=lQuoteInsuredListRequiredDrivingExperience.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListRequiredDrivingExperience',lQuoteInsuredListRequiredDrivingExperience)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListRequiredGender(String strQuoteInsuredListRequiredGender){
		Map lreturn=[:]
		String lQuoteInsuredListRequiredGender=strQuoteInsuredListRequiredGender.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListRequiredGender',lQuoteInsuredListRequiredGender)
			lreturn.put('Result',lResult)
			if(lQuoteInsuredListRequiredGender.length()<=0){
				lQuoteInsuredListRequiredGender=''
			}
			lResult=lQuoteInsuredListRequiredGender.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListRequiredGender',lQuoteInsuredListRequiredGender)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListRequiredMaritalStatus(String strQuoteInsuredListRequiredMaritalStatus){
		Map lreturn=[:]
		String lQuoteInsuredListRequiredMaritalStatus=strQuoteInsuredListRequiredMaritalStatus.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListRequiredMaritalStatus',lQuoteInsuredListRequiredMaritalStatus)
			lreturn.put('Result',lResult)
			if(lQuoteInsuredListRequiredMaritalStatus.length()<=0){
				lQuoteInsuredListRequiredMaritalStatus=''
			}
			lResult=lQuoteInsuredListRequiredMaritalStatus.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListRequiredMaritalStatus',lQuoteInsuredListRequiredMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListRequiredAge(String strQuoteInsuredListRequiredAge){
		Map lreturn=[:]
		String lQuoteInsuredListRequiredAge=strQuoteInsuredListRequiredAge.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListRequiredAge','')
			lreturn.put('Result',lResult)
			if(lQuoteInsuredListRequiredAge.length()<=0){
				lQuoteInsuredListRequiredAge='0'
			}
			lResult=lQuoteInsuredListRequiredAge.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListRequiredAge',lQuoteInsuredListRequiredAge)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListRequiredDateOfBirth(String strQuoteInsuredListRequiredDob,String strQuoteInsuredListRequiredDobOffset){
		Map lreturn=[:]
		String lQuoteInsuredListRequiredDob=strQuoteInsuredListRequiredDob.trim()
		String lQuoteInsuredListRequiredDobOffset=strQuoteInsuredListRequiredDobOffset.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListRequiredDateOfBirth',lQuoteInsuredListRequiredDob)
			lreturn.put('Result',lResult)
			if(lQuoteInsuredListRequiredDob.length()<=0){
				String lStrCurrentYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(IGNUemaHelper.getStringCurrentDateSlashDDMMYYYY())
				Integer lQuoteInsuredListRequiredDobOffsetYearAgeNum=IGNUemaHelper.convertStringToInteger(lQuoteInsuredListRequiredDobOffset,0)
				Integer lNumCurrentYear=IGNUemaHelper.convertStringToInteger(lStrCurrentYear,IGNUemaHelper.CONST_INTEGER_YEAR_DEF_ENG+lQuoteInsuredListRequiredDobOffsetYearAgeNum)
				Integer lNumYearOfAge=lNumCurrentYear-lQuoteInsuredListRequiredDobOffsetYearAgeNum
				String lStrDateOfAge=IGNUemaHelper.convertLocalDateToString(IGNUemaHelper.CONST_PATTERN_FORMATTER_DATE,IGNUemaHelper.encodeLocalDateFromNumber(lNumYearOfAge,IGNUemaHelper.CONST_INTEGER_MONTH_DEF,IGNUemaHelper.CONST_INTEGER_DAY_DEF))
				lQuoteInsuredListRequiredDob=lStrDateOfAge
				lResult=lQuoteInsuredListRequiredDob.length()>=0
			}
			if(lResult){
				lreturn.put('QuoteInsuredListRequiredDateOfBirth',lQuoteInsuredListRequiredDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListOptionalMainInsured(String strQuoteInsuredListOptionalMainInsuredToAdd,String strQuoteInsuredListOptionalMainInsured){
		Map lreturn=[:]
		String lQuoteInsuredListOptionalMainInsuredToAdd=strQuoteInsuredListOptionalMainInsuredToAdd.trim()
		String lQuoteInsuredListOptionalMainInsured=strQuoteInsuredListOptionalMainInsured.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListOptionalMainInsured','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteInsuredListOptionalMainInsuredToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteInsuredListOptionalMainInsuredToAdd)
			if(!lIsQuoteInsuredListOptionalMainInsuredToAdd){
				lQuoteInsuredListOptionalMainInsured=''
			}
			if(lQuoteInsuredListOptionalMainInsured.length()<=0){
				//Assign Default Value
			}
			lResult=lQuoteInsuredListOptionalMainInsured.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListOptionalMainInsured',lQuoteInsuredListOptionalMainInsured)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListOptionalOccupation(String strQuoteInsuredListOptionalOccupationToAdd,String strQuoteInsuredListOptionalOccupation){
		Map lreturn=[:]
		String lQuoteInsuredListOptionalOccupationToAdd=strQuoteInsuredListOptionalOccupationToAdd.trim()
		String lQuoteInsuredListOptionalOccupation=strQuoteInsuredListOptionalOccupation.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListOptionalOccupation',lQuoteInsuredListOptionalOccupation)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteInsuredListOptionalOccupationToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteInsuredListOptionalOccupationToAdd)
			if(!lIsQuoteInsuredListOptionalOccupationToAdd){
				lQuoteInsuredListOptionalOccupation=''
			}
			lResult=lQuoteInsuredListOptionalOccupation.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListOptionalOccupation',lQuoteInsuredListOptionalOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteInsuredListOptionalOccupationGroup(String strQuoteInsuredListOptionalOccupationGroupToAdd,String strQuoteInsuredListOptionalOccupationGroup){
		Map lreturn=[:]
		String lQuoteInsuredListOptionalOccupationGroupToAdd=strQuoteInsuredListOptionalOccupationGroupToAdd.trim()
		String lQuoteInsuredListOptionalOccupationGroup=strQuoteInsuredListOptionalOccupationGroup.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteInsuredListOptionalOccupationGroup',lQuoteInsuredListOptionalOccupationGroup)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteInsuredListOptionalOccupationGroupToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteInsuredListOptionalOccupationGroupToAdd)
			if(!lIsQuoteInsuredListOptionalOccupationGroupToAdd){
				lQuoteInsuredListOptionalOccupationGroup=''
			}
			lResult=lQuoteInsuredListOptionalOccupationGroup.length()>=0
			if(lResult){
				lreturn.put('QuoteInsuredListOptionalOccupationGroup',lQuoteInsuredListOptionalOccupationGroup)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookListKerbWeight(String strQuoteVehicleDataRequiredRedBookListKerbWeight){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookListKerbWeight=strQuoteVehicleDataRequiredRedBookListKerbWeight.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookListKerbWeight',lQuoteVehicleDataRequiredRedBookListKerbWeight)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredRedBookListKerbWeight.length()<=0){
				lQuoteVehicleDataRequiredRedBookListKerbWeight=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookListKerbWeight.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookListKerbWeight',lQuoteVehicleDataRequiredRedBookListKerbWeight)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookListPower(String strQuoteVehicleDataRequiredRedBookListPower){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookListPower=strQuoteVehicleDataRequiredRedBookListPower.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookListPower',lQuoteVehicleDataRequiredRedBookListPower)
			lreturn.put('Result',lResult)
			if(lQuoteVehicleDataRequiredRedBookListPower.length()<=0){
				lQuoteVehicleDataRequiredRedBookListPower=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookListPower.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookListPower',lQuoteVehicleDataRequiredRedBookListPower)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookListValueNewPrice(String strQuoteVehicleDataRequiredRedBookListValueNewPrice){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookListValueNewPrice=strQuoteVehicleDataRequiredRedBookListValueNewPrice.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookListValueNewPrice',lQuoteVehicleDataRequiredRedBookListValueNewPrice)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredRedBookListValueNewPrice.length()<=0){
				lQuoteVehicleDataRequiredRedBookListValueNewPrice=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookListValueNewPrice.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookListValueNewPrice',lQuoteVehicleDataRequiredRedBookListValueNewPrice)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookListSeatCapacity(String strQuoteVehicleDataRequiredRedBookListSeatCapacity){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookListSeatCapacity=strQuoteVehicleDataRequiredRedBookListSeatCapacity.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookListSeatCapacity',lQuoteVehicleDataRequiredRedBookListSeatCapacity)
			lreturn.put('Result',lResult)
			if(lQuoteVehicleDataRequiredRedBookListSeatCapacity.length()<=0){
				lQuoteVehicleDataRequiredRedBookListSeatCapacity=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookListSeatCapacity.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookListSeatCapacity',lQuoteVehicleDataRequiredRedBookListSeatCapacity)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookListVehicleTypeCode(String strQuoteVehicleDataRequiredRedBookListVehicleTypeCode){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookListVehicleTypeCode=strQuoteVehicleDataRequiredRedBookListVehicleTypeCode.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookListVehicleTypeCode',lQuoteVehicleDataRequiredRedBookListVehicleTypeCode)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredRedBookListVehicleTypeCode.length()<=0){
				lQuoteVehicleDataRequiredRedBookListVehicleTypeCode=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookListVehicleTypeCode.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookListVehicleTypeCode',lQuoteVehicleDataRequiredRedBookListVehicleTypeCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookListBodyStyleDescription(String strQuoteVehicleDataRequiredRedBookListBodyStyleDescription){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookListBodyStyleDescription=strQuoteVehicleDataRequiredRedBookListBodyStyleDescription.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookListBodyStyleDescription',lQuoteVehicleDataRequiredRedBookListBodyStyleDescription)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredRedBookListBodyStyleDescription.length()<=0){
				lQuoteVehicleDataRequiredRedBookListBodyStyleDescription=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookListBodyStyleDescription.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookListBodyStyleDescription',lQuoteVehicleDataRequiredRedBookListBodyStyleDescription)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredRedBookSi(String strQuoteVehicleDataRequiredRedBookSi){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredRedBookSi=strQuoteVehicleDataRequiredRedBookSi.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredRedBookSi',lQuoteVehicleDataRequiredRedBookSi)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredRedBookSi.length()<=0){
				lQuoteVehicleDataRequiredRedBookSi=''
			}
			lResult=lQuoteVehicleDataRequiredRedBookSi.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredRedBookSi',lQuoteVehicleDataRequiredRedBookSi)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredCubicCapacity(String strQuoteVehicleDataRequiredCubicCapacity){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredCubicCapacity=strQuoteVehicleDataRequiredCubicCapacity.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredCubicCapacity',lQuoteVehicleDataRequiredCubicCapacity)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredCubicCapacity.length()<=0){
				lQuoteVehicleDataRequiredCubicCapacity=''
			}
			lResult=lQuoteVehicleDataRequiredCubicCapacity.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredCubicCapacity',lQuoteVehicleDataRequiredCubicCapacity)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredOdometerReading(String strQuoteVehicleDataRequiredOdometerReading){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredOdometerReading=strQuoteVehicleDataRequiredOdometerReading.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredOdometerReading',lQuoteVehicleDataRequiredOdometerReading)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredOdometerReading.length()<=0){
				lQuoteVehicleDataRequiredOdometerReading=''
			}
			lResult=lQuoteVehicleDataRequiredOdometerReading.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredOdometerReading',lQuoteVehicleDataRequiredOdometerReading)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredManufactureYear(String strQuoteVehicleDataRequiredManufactureYear){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredManufactureYear=strQuoteVehicleDataRequiredManufactureYear.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredManufactureYear',lQuoteVehicleDataRequiredManufactureYear)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredManufactureYear.length()<=0){
				lQuoteVehicleDataRequiredManufactureYear=''
			}
			lResult=lQuoteVehicleDataRequiredManufactureYear.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredManufactureYear',lQuoteVehicleDataRequiredManufactureYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredCarPlateProvince(String strQuoteVehicleDataRequiredCarPlateProvince){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredCarPlateProvince=strQuoteVehicleDataRequiredCarPlateProvince.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredCarPlateProvince',lQuoteVehicleDataRequiredCarPlateProvince)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredCarPlateProvince.length()<=0){
				lQuoteVehicleDataRequiredCarPlateProvince=''
			}
			lResult=lQuoteVehicleDataRequiredCarPlateProvince.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredCarPlateProvince',lQuoteVehicleDataRequiredCarPlateProvince)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredDefaultValue(String strQuoteVehicleDataRequiredDefaultValue){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredDefaultValue=strQuoteVehicleDataRequiredDefaultValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredDefaultValue',lQuoteVehicleDataRequiredDefaultValue)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredDefaultValue.length()<=0){
				lQuoteVehicleDataRequiredDefaultValue=''
			}
			lResult=lQuoteVehicleDataRequiredDefaultValue.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredDefaultValue',lQuoteVehicleDataRequiredDefaultValue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataRequiredUsageType(String strQuoteVehicleDataRequiredUsageType){
		Map lreturn=[:]
		String lQuoteVehicleDataRequiredUsageType=strQuoteVehicleDataRequiredUsageType.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataRequiredUsageType',lQuoteVehicleDataRequiredUsageType)
			lreturn.put('Result',lResult)
			if( lQuoteVehicleDataRequiredUsageType.length()<=0){
				lQuoteVehicleDataRequiredUsageType=''
			}
			lResult=lQuoteVehicleDataRequiredUsageType.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataRequiredUsageType',lQuoteVehicleDataRequiredUsageType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataOptionalUwPremiumClass(String strQuoteVehicleDataOptionalUwPremiumClassToAdd,String strQuoteVehicleDataOptionalUwPremiumClass){
		Map lreturn=[:]
		String lQuoteVehicleDataOptionalUwPremiumClassToAdd=strQuoteVehicleDataOptionalUwPremiumClassToAdd.trim()
		String lQuoteVehicleDataOptionalUwPremiumClass=strQuoteVehicleDataOptionalUwPremiumClass.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataOptionalUwPremiumClass',lQuoteVehicleDataOptionalUwPremiumClass)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteVehicleDataOptionalUwPremiumClassToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteVehicleDataOptionalUwPremiumClassToAdd)
			if(!lIsQuoteVehicleDataOptionalUwPremiumClassToAdd){
				lQuoteVehicleDataOptionalUwPremiumClass=''
			}
			lResult=lQuoteVehicleDataOptionalUwPremiumClass.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataOptionalUwPremiumClass',lQuoteVehicleDataOptionalUwPremiumClass)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataOptionalUwPremiumGroup(String strQuoteVehicleDataOptionalUwPremiumGroupToAdd,String strQuoteVehicleDataOptionalUwPremiumGroup){
		Map lreturn=[:]
		String lQuoteVehicleDataOptionalUwPremiumGroupToAdd=strQuoteVehicleDataOptionalUwPremiumGroupToAdd.trim()
		String lQuoteVehicleDataOptionalUwPremiumGroup=strQuoteVehicleDataOptionalUwPremiumGroup.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataOptionalUwPremiumGroup',lQuoteVehicleDataOptionalUwPremiumGroup)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteVehicleDataOptionalUwPremiumGroupToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteVehicleDataOptionalUwPremiumGroupToAdd)
			if(!lIsQuoteVehicleDataOptionalUwPremiumGroupToAdd){
				lQuoteVehicleDataOptionalUwPremiumGroup=''
			}
			lResult=lQuoteVehicleDataOptionalUwPremiumGroup.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataOptionalUwPremiumGroup',lQuoteVehicleDataOptionalUwPremiumGroup)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataOptionalRedBookListFamilyCode(String strQuoteVehicleDataOptionalRedBookListFamilyCodeToAdd,String strQuoteVehicleDataOptionalRedBookListFamilyCode){
		Map lreturn=[:]
		String lQuoteVehicleDataOptionalRedBookListFamilyCodeToAdd=strQuoteVehicleDataOptionalRedBookListFamilyCodeToAdd.trim()
		String lQuoteVehicleDataOptionalRedBookListFamilyCode=strQuoteVehicleDataOptionalRedBookListFamilyCode.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataOptionalRedBookListFamilyCode',lQuoteVehicleDataOptionalRedBookListFamilyCode)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteVehicleDataOptionalRedBookListFamilyCodeToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteVehicleDataOptionalRedBookListFamilyCodeToAdd)
			if(!lIsQuoteVehicleDataOptionalRedBookListFamilyCodeToAdd){
				lQuoteVehicleDataOptionalRedBookListFamilyCode=''
			}
			lResult=lQuoteVehicleDataOptionalRedBookListFamilyCode.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataOptionalRedBookListFamilyCode',lQuoteVehicleDataOptionalRedBookListFamilyCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataOptionalUwVehicleType(String strQuoteVehicleDataOptionalUwVehicleTypeToAdd,String strQuoteVehicleDataOptionalUwVehicleType){
		Map lreturn=[:]
		String lQuoteVehicleDataOptionalUwVehicleTypeToAdd=strQuoteVehicleDataOptionalUwVehicleTypeToAdd.trim()
		String lQuoteVehicleDataOptionalUwVehicleType=strQuoteVehicleDataOptionalUwVehicleType.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataOptionalUwVehicleType',lQuoteVehicleDataOptionalUwVehicleType)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteVehicleDataOptionalUwVehicleTypeToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteVehicleDataOptionalUwVehicleTypeToAdd)
			if(!lIsQuoteVehicleDataOptionalUwVehicleTypeToAdd){
				lQuoteVehicleDataOptionalUwVehicleType=''
			}
			lResult=lQuoteVehicleDataOptionalUwVehicleType.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataOptionalUwVehicleType',lQuoteVehicleDataOptionalUwVehicleType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteVehicleDataOptionalVehicleAccessoryItem(String strQuoteVehicleDataOptionalVehicleAccessoryItemName,String strQuoteVehicleDataOptionalVehicleAccessoryItemValue){
		Map lreturn=[:]
		String lQuoteVehicleDataOptionalVehicleAccessoryItemName=strQuoteVehicleDataOptionalVehicleAccessoryItemName.trim()
		String lQuoteVehicleDataOptionalVehicleAccessoryItemValue=strQuoteVehicleDataOptionalVehicleAccessoryItemValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteVehicleDataOptionalVehicleAccessoryItemName',lQuoteVehicleDataOptionalVehicleAccessoryItemName)
			lreturn.put('QuoteVehicleDataOptionalVehicleAccessoryItemValue',lQuoteVehicleDataOptionalVehicleAccessoryItemValue)
			lreturn.put('Result',lResult)
			if(lQuoteVehicleDataOptionalVehicleAccessoryItemName.length()<=0){
				lQuoteVehicleDataOptionalVehicleAccessoryItemName=''
			}
			if(lQuoteVehicleDataOptionalVehicleAccessoryItemValue.length()<=0){
				lQuoteVehicleDataOptionalVehicleAccessoryItemValue=''
			}
			lResult=lQuoteVehicleDataOptionalVehicleAccessoryItemName.length()>=0
			if(lResult){
				lreturn.put('QuoteVehicleDataOptionalVehicleAccessoryItemName',lQuoteVehicleDataOptionalVehicleAccessoryItemName)
				lreturn.put('QuoteVehicleDataOptionalVehicleAccessoryItemValue',lQuoteVehicleDataOptionalVehicleAccessoryItemValue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiRedbookDataMapBetweenDataType(Map mapRedBookVehicleDataParameterWithMasterParameter){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapDecodedRedBookVehicleDataParameterWithMasterParameter=[:]
		try{
			lreturn.put('DecodedRedBookDataMappedWithMasterData',lMapDecodedRedBookVehicleDataParameterWithMasterParameter)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapRedBookVehicleDataParameterWithMasterParameter)){
				return lreturn
			}
			Map lMapRedBookVehicleDataParameterWithMasterParameter=mapRedBookVehicleDataParameterWithMasterParameter
			for(Map.Entry lEntry in lMapRedBookVehicleDataParameterWithMasterParameter){
				String lKey=lEntry.getKey()
				String lValue=lEntry.getValue()
				String[] lDecodeKeyWithDataType=lKey.split('/')
				IGNUemaHelper.printLog(lDecodeKeyWithDataType)
				String[] lDecodeValueWithDataType=lValue.split('/')
				IGNUemaHelper.printLog(lDecodeValueWithDataType)
				lMapDecodedRedBookVehicleDataParameterWithMasterParameter.put(lDecodeKeyWithDataType[0],lDecodeValueWithDataType[0])
			}
			if(!IGNUemaHelper.checkObjectEmptyOfMap(lMapDecodedRedBookVehicleDataParameterWithMasterParameter)){
				lResult=true
			}
			if(lResult){
				lreturn.put('DecodedRedBookDataMappedWithMasterData',lMapDecodedRedBookVehicleDataParameterWithMasterParameter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPricingApiLoadingFactorForGivenPaymentFrequency(Sheet targetSheet,List strLoadingFactorList,String strPaymentFrequency,Map mapPricingApiJsonPayment){
		String lreturn=''
		Boolean lResult=false
		String lSumAssured=''
		String lLoadingFactor=''
		if(IGNUemaHelper.checkObjectEmptyOfList(strLoadingFactorList)){
			return lreturn
		}
		List lLoadingFactorList=strLoadingFactorList
		if(IGNUemaHelper.checkObjectEmptyOfString(strPaymentFrequency)){
			return lreturn
		}
		String lGivenPaymentFrequency=strPaymentFrequency
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonPayment)){
			return lreturn
		}
		Map lMapPricingApiJsonPayment=mapPricingApiJsonPayment
		if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
			return lreturn
		}
		Sheet lPricingApiSheet=targetSheet
		try{
			IGNUemaHelper.printLog(lLoadingFactorList)
			for(Integer lLoadingFactorIndex=0;lLoadingFactorIndex<=lLoadingFactorList.size()-1;lLoadingFactorIndex++){
				Map lMapPaymentLoadingFactor=lLoadingFactorList.get(lLoadingFactorIndex)
				IGNUemaHelper.printLog(lMapPaymentLoadingFactor)
				IGNUemaHelper.printLog(lGivenPaymentFrequency)
				String lPaymentFrequencyValue=lMapPaymentLoadingFactor.Payment_Frequency
				if(lGivenPaymentFrequency==lPaymentFrequencyValue){
					lLoadingFactor=lMapPaymentLoadingFactor.Payment_Loading
				}
			}
			Boolean lLoadingFactorOK=lLoadingFactor.length()>=1
			Map lMapLoadingFactor=lMapPricingApiJsonPayment.LoadingFactor
			IGNUemaHelper.printLog('Inside Loading factor lMapPricingApiJsonPayment')
			IGNUemaHelper.printLog(lMapPricingApiJsonPayment)
			Integer lRowNumber=lMapLoadingFactor.RowNumber
			Integer lColumnNumber=lMapLoadingFactor.ColumnNumber
			Boolean lIsWriteLoadingFactorValueToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lRowNumber,lColumnNumber,lLoadingFactor)
			lResult=(lIsWriteLoadingFactorValueToExcelSheetDone && lLoadingFactorOK)
			if(lResult){
				lreturn=lLoadingFactor
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getPremiumBasedPolicyPaymentFrequencySequence(String strTargetPremium,Integer numSequenceNumber){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetPremium)){
			return lreturn
		}
		String lTargetPremium=strTargetPremium
		Integer lSequenceNumber=numSequenceNumber
		try{
			String[] lTargetPremiumWithPaymentFrequencyList=lTargetPremium.split('_')
			String lPremium=''
			lPremium=lTargetPremiumWithPaymentFrequencyList[lSequenceNumber]
			lResult=lPremium.length()>0
			if(lResult){
				lreturn=lPremium
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPricingApiSelectDefaultSumAssuredForCoverage(String strFirstOptionSequence,Map mapPlanOption){
		String lreturn=''
		Boolean lResult=false
		String lSumAssured=''
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPlanOption)){
			return lreturn
		}
		Map lMapPlanOption=mapPlanOption
		if(IGNUemaHelper.checkObjectEmptyOfString(strFirstOptionSequence)){
			return lreturn
		}
		IGNUemaHelper.printLog(strFirstOptionSequence)
		String lFirstOptionSequence=strFirstOptionSequence
		try{
			for(Map.Entry entry : lMapPlanOption.entrySet()){
				String lPlanName=entry.getKey()
				if(lFirstOptionSequence.contains(lPlanName)){
					lSumAssured=entry.getValue()
				}
			}
			lResult=lSumAssured.length()>1
			if(lResult){
				lreturn=lSumAssured
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPricingApiRegisterClientSetRequestBodyContent(Map mapPricingApiRegisterClientInputBodyContent){
		String lreturn=''
		Boolean lResult=false
		String lPricingApiRegisterClientInputRequestBodyContent=''
		try{
			Boolean lIslPricingApiRegisterClientInputBodyContent=IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiRegisterClientInputBodyContent)
			if(lIslPricingApiRegisterClientInputBodyContent){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceInputRequestBodyContent=[:]
			Map lMapPricingApiRegisterClientCallInputRequestData=[:]
			String lPricingApiRegisterClientInputRequestCallTokenKey=mapPricingApiRegisterClientInputBodyContent.PricingApiCallTokenKey
			lMapPricingApiRegisterClientCallInputRequestData.put('ApiKey',lPricingApiRegisterClientInputRequestCallTokenKey)
			String lPricingApiRegisterClientInputRequestCallSdkVersion=mapPricingApiRegisterClientInputBodyContent.PricingApiCallSdkVersion
			lMapPricingApiRegisterClientCallInputRequestData.put('SdkVersion',lPricingApiRegisterClientInputRequestCallSdkVersion)
			String lPricingApiRegisterClientInputRequestCallProductType=mapPricingApiRegisterClientInputBodyContent.PricingApiCallProductType
			lMapPricingApiRegisterClientCallInputRequestData.put('ProductType',lPricingApiRegisterClientInputRequestCallProductType)
			String lPricingApiRegisterClientInputRequestCallMasterSetId=mapPricingApiRegisterClientInputBodyContent.PricingApiCallMasterSetId
			lMapPricingApiRegisterClientCallInputRequestData.put('MasterSetId',lPricingApiRegisterClientInputRequestCallMasterSetId)
			JsonBuilder lJsonPricingApiRegisterClientInputRequest=new JsonBuilder(lMapPricingApiRegisterClientCallInputRequestData)
			lPricingApiRegisterClientInputRequestBodyContent=lJsonPricingApiRegisterClientInputRequest.toString()
			lreturn=lPricingApiRegisterClientInputRequestBodyContent
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean initPricingApiRegisterClientApiRequest(String strPricingApiRegisterClientInputRequestBodyContent,Map mapPricingApiInputOutput){
		Boolean lreturn=false
		String lPricingApiRegisterClientInputRequestBodyContent=strPricingApiRegisterClientInputRequestBodyContent.trim()
		try{
			Boolean lIsOK=false
			Boolean lIsMapRegisterClientBodyRequestEmpty=IGNUemaHelper.checkObjectEmptyOfString(lPricingApiRegisterClientInputRequestBodyContent)
			IGNUemaHelper.printLog('Inside Request Call')
			if(lIsMapRegisterClientBodyRequestEmpty){
				return lreturn
			}
			Map lMapPricingApiRegisterClientCallRequestResult=IDNPricingApiRestAPIHelper.mapPricingApiRegisterClientCallRequest(lPricingApiRegisterClientInputRequestBodyContent)
			String lRegisterClientApiResponseStatusCode=lMapPricingApiRegisterClientCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.RegisterClientResponseStatus=lRegisterClientApiResponseStatusCode
			Integer lRegisterClientApiResponseStatusCodeNum=Integer.valueOf(lRegisterClientApiResponseStatusCode)
			String lRegisterClientApiResponseTime=lMapPricingApiRegisterClientCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.RegisterClientResponseTime=lRegisterClientApiResponseTime
			String lRegisterClientApiResponse=lMapPricingApiRegisterClientCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.RegisterClientResponseText=lRegisterClientApiResponse
			IGNUemaHelper.printLog('lRegisterClientApiResponse')
			IGNUemaHelper.printLog(lRegisterClientApiResponse)
			Map lMapVerifyResponseRegisterClientApiResult=this.verifyResponseRegisterClientApi(lRegisterClientApiResponse,lRegisterClientApiResponseStatusCodeNum,mapPricingApiInputOutput)
			lIsOK=lMapVerifyResponseRegisterClientApiResult.Result
			lreturn=lIsOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map initMultiPlanPricingApiRequest(String strProductType,String strPricingApiMultiPlanPriceInputRequestBodyContent,String strPricingApiMultiPlanPriceInputRequestUrl,Boolean isPositiveCase,Map mapPricingApiInputOutput,List strCoverList,List strCoverageList){
		Map lreturn=[:]
		Boolean lResult=false
		String lPricingApiMultiPlanPriceResponse=''
		String lPricingApiMultiPlanPriceResponseVerifyDetail=''
		Boolean lIsPositiveCase=isPositiveCase
		String lProductType=strProductType.trim()
		String lPricingApiMultiPlanPriceInputRequestBodyContent=strPricingApiMultiPlanPriceInputRequestBodyContent.trim()
		String lPricingApiMultiPlanPriceInputRequestUrl=strPricingApiMultiPlanPriceInputRequestUrl.trim()
		try{
			lreturn.put('PricingApiMultiPlanPriceResponse',lPricingApiMultiPlanPriceResponse)
			lreturn.put('PricingApiMultiPlanPriceDetail',lPricingApiMultiPlanPriceResponseVerifyDetail)
			lreturn.put('Result',lResult)
			if(lPricingApiMultiPlanPriceInputRequestBodyContent.length()<=0){
				return lreturn
			}
			Boolean lIsOK=false
			String lRegisterUuid=mapPricingApiInputOutput.RegisterUuid
			IGNUemaHelper.printLog('lRegisterUuid')
			IGNUemaHelper.printLog(lRegisterUuid)
			Map lMapPricingApiMultiPlanCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiMultiPlanPriceCallRequest(lPricingApiMultiPlanPriceInputRequestBodyContent,lPricingApiMultiPlanPriceInputRequestUrl,lRegisterUuid)
			String lPricingApiMultiPlanPriceResponseStatusCode=lMapPricingApiMultiPlanCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.MultiplePlanPriceResponseStatus=lPricingApiMultiPlanPriceResponseStatusCode
			Integer lPricingApiMultiPlanPriceResponseStatusCodeNum=Integer.valueOf(lPricingApiMultiPlanPriceResponseStatusCode)
			String lPricingApiMultiPlanPriceResponseTime=lMapPricingApiMultiPlanCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.MultiplePlanPriceResponseTime=lPricingApiMultiPlanPriceResponseTime
			lPricingApiMultiPlanPriceResponse=lMapPricingApiMultiPlanCallRequestResult.ResponseObjectResponseText
			IGNUemaHelper.printLog('lPricingApiMultiPlanPriceResponse')
			IGNUemaHelper.printLog(lPricingApiMultiPlanPriceResponse)
			mapPricingApiInputOutput.MultiplePlanPriceResponseText=lPricingApiMultiPlanPriceResponse
			Map lMapVerifyResponsePricingApiMultiPlanPriceResult=this.verifyResponseMultiPlanPricingApi(lProductType,lPricingApiMultiPlanPriceResponse,lPricingApiMultiPlanPriceResponseStatusCodeNum,lIsPositiveCase,mapPricingApiInputOutput,strCoverList,strCoverageList)
			if(lMapVerifyResponsePricingApiMultiPlanPriceResult.Result){
				lIsOK=true
				lPricingApiMultiPlanPriceResponseVerifyDetail=lMapVerifyResponsePricingApiMultiPlanPriceResult.MultiPlanPricingApiDetail
				IGNUemaHelper.printLog('lIsOKTrue')
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('PricingApiMultiPlanPriceResponse',lPricingApiMultiPlanPriceResponse)
				lreturn.put('PricingApiMultiPlanPriceDetail',lPricingApiMultiPlanPriceResponseVerifyDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map initGetPlanPricingApiRequest(String strProductType,String strPricingApiGetPlanPriceInputRequestBodyContent,String strPricingApiGetPlanPriceInputRegisterUuid,String strPricingApiGetPlanPriceInputRequestUrl,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapPricingApiGetPlanPriceResult=[:]
		String lPricingApiGetPlanPriceInputRequestBodyContent=strPricingApiGetPlanPriceInputRequestBodyContent.trim()
		String lPricingApiGetPlanPriceInputRequestUrl=strPricingApiGetPlanPriceInputRequestUrl.trim()
		String lPricingApiGetPlanPriceDetail=''
		String lPricingApiGetPlanPriceResponse=''
		String lProductType=strProductType.trim()
		String lRegisterUuid=strPricingApiGetPlanPriceInputRegisterUuid.trim()
		try{
			lreturn.put('PricingApiGetPlanPriceDetail',lPricingApiGetPlanPriceDetail)
			lreturn.put('PricingApiGetPlanPriceResponse',lPricingApiGetPlanPriceResponse)
			lreturn.put('PricingApiGetPlanPriceResult',lMapPricingApiGetPlanPriceResult)
			lreturn.put('Result',lResult)
			if(lPricingApiGetPlanPriceInputRequestBodyContent.length()<=0){
				return lreturn
			}
			Boolean lIsOK=false
			IGNUemaHelper.printLog('lRegisterUuid')
			IGNUemaHelper.printLog(lRegisterUuid)
			Map lMapPricingApiGetPlanPriceCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiGetPlanPriceCallRequest(lPricingApiGetPlanPriceInputRequestBodyContent,lPricingApiGetPlanPriceInputRequestUrl,lRegisterUuid)
			String lPricingApiGetPlanPriceResponseStatusCode=lMapPricingApiGetPlanPriceCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.GetPlanPriceResponseStatus=lPricingApiGetPlanPriceResponseStatusCode
			Integer lPricingApiGetPlanPriceResponseStatusCodeNum=Integer.valueOf(lPricingApiGetPlanPriceResponseStatusCode)
			String lPricingApiGetPlanPriceResponseTime=lMapPricingApiGetPlanPriceCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.GetPlanPriceResponseTime=lPricingApiGetPlanPriceResponseTime
			lPricingApiGetPlanPriceResponse=lMapPricingApiGetPlanPriceCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.GetPlanPriceResponseText=lPricingApiGetPlanPriceResponse
			lMapPricingApiGetPlanPriceResult.putAll(lMapPricingApiGetPlanPriceCallRequestResult)
			IGNUemaHelper.printLog('lPricingApiGetPlanPriceResponseStatusCode')
			IGNUemaHelper.printLog(lPricingApiGetPlanPriceResponseStatusCode)
			List<String> lGetPlanPriceDetailStatusList=[]
			Map lMapVerifyResponsePricingApiGetPlanPriceResult=this.verifyResponseGetPlanApi(lProductType,lPricingApiGetPlanPriceResponse,lPricingApiGetPlanPriceResponseStatusCodeNum,mapPricingApiInputOutput)
			lPricingApiGetPlanPriceDetail=lMapVerifyResponsePricingApiGetPlanPriceResult.VerifyGetPlanPricingApiDetail
			lResult=lPricingApiGetPlanPriceDetail.length()>=0
			if(lResult){
				lreturn.put('PricingApiGetPlanPriceDetail',lPricingApiGetPlanPriceDetail)
				lreturn.put('PricingApiGetPlanPriceResponse',lPricingApiGetPlanPriceResponse)
				lreturn.put('PricingApiGetPlanPriceResult',lMapPricingApiGetPlanPriceResult)
				lreturn.put('Result',lResult)
			}
			//lResult=lIsOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map initGetPlanWithInstallmentPricingApiRequest(String strProductType,String strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent,String strPricingApiGetPlanWithInstallmentPriceRegisterUuid,String strPricingApiGetPlanWithInstallmentPriceInputRequestUrl,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapPricingApiGetPlanWithInstallmentPriceResult=[:]
		String lPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent=strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent.trim()
		String lPricingApiGetPlanWithInstallmentPriceInputRequestUrl=strPricingApiGetPlanWithInstallmentPriceInputRequestUrl.trim()
		String lPricingApiGetPlanWithInstallmentPriceDetail=''
		String lPricingApiGetPlanWithInstallmentPriceResponse=''
		String lPricingApiGetPlanWithInstallmentPriceRegisterUuid=strPricingApiGetPlanWithInstallmentPriceRegisterUuid.trim()
		String lProductType=strProductType.trim()
		try{
			lreturn.put('PricingApiGetPlanWithInstallmentPriceResponse',lPricingApiGetPlanWithInstallmentPriceResponse)
			lreturn.put('PricingApiGetPlanWithInstallmentPriceDetail',lPricingApiGetPlanWithInstallmentPriceDetail)
			lreturn.put('PricingApiGetPlanWithInstallmentPriceResult',lMapPricingApiGetPlanWithInstallmentPriceResult)
			lreturn.put('Result',lResult)
			if(lPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent.length()<=0){
				return lreturn
			}
			Boolean lIsGetPlanWithInstallmentPriceOK=false
			Map lMapPricingApiGetPlanWithInstallmentCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiGetPlanWithInstallmentPriceCallRequest(lPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent,lPricingApiGetPlanWithInstallmentPriceInputRequestUrl,lPricingApiGetPlanWithInstallmentPriceRegisterUuid)
			String lPricingApiGetPlanWithInstallmentPriceResponseStatusCode=lMapPricingApiGetPlanWithInstallmentCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseStatus=lPricingApiGetPlanWithInstallmentPriceResponseStatusCode
			Integer lPricingApiGetPlanWithInstallmentPriceResponseStatusCodeNum=Integer.valueOf(lPricingApiGetPlanWithInstallmentPriceResponseStatusCode)
			String lPricingApiGetPlanWithInstallmentPriceResponseTime=lMapPricingApiGetPlanWithInstallmentCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseTime=lPricingApiGetPlanWithInstallmentPriceResponseTime
			lPricingApiGetPlanWithInstallmentPriceResponse=lMapPricingApiGetPlanWithInstallmentCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText=lPricingApiGetPlanWithInstallmentPriceResponse
			lMapPricingApiGetPlanWithInstallmentPriceResult.putAll(lMapPricingApiGetPlanWithInstallmentCallRequestResult)
			Map lMapVerifyResponsePricingApiGetPlanWithInstallmentPriceResult=this.verifyResponseGetPlanWithInstallmentApi(lProductType,lPricingApiGetPlanWithInstallmentPriceResponse,lPricingApiGetPlanWithInstallmentPriceResponseStatusCodeNum,mapPricingApiInputOutput)
			IGNUemaHelper.printLog('Verified GetPlan WIth Installment')
			lPricingApiGetPlanWithInstallmentPriceDetail=lMapVerifyResponsePricingApiGetPlanWithInstallmentPriceResult.VerifyGetPlanWithInstallmentPricingApiDetail
			lResult=lPricingApiGetPlanWithInstallmentPriceDetail.length()>=0
			if(lResult){
				lreturn.put('PricingApiGetPlanWithInstallmentPriceResponse',lPricingApiGetPlanWithInstallmentPriceResponse)
				lreturn.put('PricingApiGetPlanWithInstallmentPriceDetail',lPricingApiGetPlanWithInstallmentPriceDetail)
				lreturn.put('PricingApiGetPlanWithInstallmentPriceResult',lMapPricingApiGetPlanWithInstallmentPriceResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInitPricingApiLibraryInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('PricingApiLibraryGetPlanPriceTotalPremium','')
			targetMap.put('PricingApiLibraryGetPlanPriceDownPayment','')
			targetMap.put('PricingApiLibraryGetPlanPriceInstallmentAmount','')
			targetMap.put('PricingApiLibraryGetPlanWithInstallmentPriceTotalPremium','')
			targetMap.put('PricingApiLibraryGetPlanWithInstallmentPriceDownPayment','')
			targetMap.put('PricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount','')
			targetMap.put('PricingApiLibraryGetPlanPriceAdditionalCoverageNameList','')
			targetMap.put('PricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList','')
			targetMap.put('PricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList','')
			targetMap.put('PricingApiLibraryGetPlanPriceWithInstallmentPaymentDetailList','')
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInitPricingApiInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('RegisterClientReleaseVersion','')
			targetMap.put('RegisterClientResponseStatus','')
			targetMap.put('RegisterClientResponseTime','')
			targetMap.put('RegisterClientResponseText','')
			targetMap.put('RegisterUuid','')
			targetMap.put('RegisterServiceData','')
			targetMap.put('RegisterClientServiceDataCreatePolicyUrl','')
			targetMap.put('RegisterClientServiceDataCreatePolicyInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataCreatePolicyFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataGetPlanPriceInstUrl','')
			targetMap.put('RegisterClientServiceDataGetPlanPriceInstInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataGetPlanPriceInstFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingPolicyMappingUrl','')
			targetMap.put('RegisterClientServiceDataPricingPolicyMappingInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingPolicyMappingFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingEndorsementUrl','')
			targetMap.put('RegisterClientServiceDataPricingEndorsementInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingEndorsementFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingRetrievePolicyUrl','')
			targetMap.put('RegisterClientServiceDataPricingRetrievePolicyInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingRetrievePolicyFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingGetCalculationConfigurationUrl','')
			targetMap.put('RegisterClientServiceDataPricingGetCalculationConfigurationInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingGetCalculationConfigurationFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingGetPlanPriceUrl','')
			targetMap.put('RegisterClientServiceDataPricingGetPlanPriceInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingGetPlanPriceFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingMultiplePlanPriceUrl','')
			targetMap.put('RegisterClientServiceDataPricingMultiplePlanPriceInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingMultiplePlanPriceFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingGetDependencyCodeMappingUrl','')
			targetMap.put('RegisterClientServiceDataPricingGetDependencyCodeMappingInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingGetDependencyCodeMappingFlagConcurrent','')
			targetMap.put('RegisterClientServiceDataPricingEndorsementInstUrl','')
			targetMap.put('RegisterClientServiceDataPricingEndorsementInstInterceptoUrl','')
			targetMap.put('RegisterClientServiceDataPricingEndorsementInstFlagConcurrent','')
			targetMap.put('RegisterClientServiceLibraryRoot','')
			targetMap.put('RegisterClientServiceLibraryItem01Name','')
			targetMap.put('RegisterClientServiceLibraryItem01Version','')
			targetMap.put('RegisterClientServiceLibraryItem02Name','')
			targetMap.put('RegisterClientServiceLibraryItem02Version','')
			targetMap.put('RegisterClientApiResult','')
			targetMap.put('RegisterClientApiDetail','')
			targetMap.put('MultiplePlanPriceReleaseVersion','')
			targetMap.put('MultiplePlanPriceResponseStatus','')
			targetMap.put('MultiplePlanPriceResponseTime','')
			targetMap.put('MultiplePlanPriceRequestText','')
			targetMap.put('MultiplePlanPriceResponseText','')
			targetMap.put('MultiplePlanQuoteRoot','')
			targetMap.put('MultiplePlanPriceQuotePolicyNumber','')
			targetMap.put('MultiplePlanPriceQuoteLoadingFactorRoot','')
			targetMap.put('MultiplePlanPriceQuoteLoadingFactorItemYearlyPaymentLoading','')
			targetMap.put('MultiplePlanPriceQuoteLoadingFactorItemYearlyPaymentFrequency','')
			targetMap.put('MultiplePlanPriceQuoteLoadingFactorItemInstallmentSixMonthPaymentLoading','')
			targetMap.put('MultiplePlanPriceQuoteLoadingFactorItemInstallmentSixMonthPaymentFrequency','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRoot','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionRewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionRewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionRewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionPremiumBeforeRsaTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaOptionName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageRsaFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem03Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem04Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem05Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem06Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07PremiumBeforeTplTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplOptionItem07Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTplFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01PremiumBeforeTrrTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02PremiumBeforeTrrTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTrrFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01PremiumBeforeFlTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02PremiumBeforeFlTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageFlFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01PremiumBeforeSrccTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02PremiumBeforeSrccTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageSrccSrccagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01PremiumBeforeEqTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02PremiumBeforeEqTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageEqFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionRewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionRewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionRewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionPremiumBeforeEqTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaOptionName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageTaFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameAdditionalAdditionalCoverageCode','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameAdditionalAdditionalCoverageName','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01PremiumBeforePameTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02PremiumBeforePameTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03PremiumBeforePameTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem03Name','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04RewardPointResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxExpected','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxResult','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04PremiumBeforePameTaxTarget','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameOptionItem04Name','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoveragePameFlagOptionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleProductOptionNumber','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01RewardPoint','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01PremiumBeforeTax','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleOptionItem01Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02RewardPoint','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02PremiumBeforeTax','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleOptionItem02Name','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleFlagApplyLoadingFactor','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleCode','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleDefaultSelectedOption','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleName','')
			targetMap.put('MultiplePlanPriceQuoteCoverageMotorVehicleFlagCoverage','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataRoot','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataUwVehicleType','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataPolicyEstimatedAnnualMileage','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataUwVehicleTypeWarningFlag','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataCarDefaultValueFinal','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataUwVehicleTypeUpdateFlag','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataFaultClaimsForRating','')
			targetMap.put('MultiplePlanPriceQuoteVehicleDataFaultIncurred','')
			targetMap.put('MultiplePlanPriceQuotePolicyPaymentFrequency','')
			targetMap.put('MultiplePlanPriceQuoteModelName','')
			targetMap.put('MultiplePlanPriceQuotePolicyAutoRenewalFlag','')
			targetMap.put('MultiplePlanPriceQuotePolicyProductVersion','')
			targetMap.put('MultiplePlanPriceQuoteIrregularityRoot','')
			targetMap.put('MultiplePlanPriceQuoteIrregularityErrorMessage','')
			targetMap.put('MultiplePlanPriceQuoteIrregularityMaxAuthorisarionLevel','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionRoot','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem01OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem02OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem03OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem04OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem05OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem06OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem07OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem08OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem09OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem10OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem11OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem12OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem13OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem14OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem15OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem16OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem17OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem18OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem19OptionName','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20OptionSelection','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20SelectionDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20PremiumDependentCode','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20ParentCover','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20Code','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20FlagAdditionalCoverage','')
			targetMap.put('MultiplePlanPriceQuoteAvailableOptionItem20OptionName','')
			targetMap.put('MultiplePlanPriceQuoteDefaultShowPaymentFrequency','')
			targetMap.put('MultiplePlanPriceResult','')
			targetMap.put('MultiplePlanPriceDetail','')
			targetMap.put('GetPlanPriceReleaseVersion','')
			targetMap.put('GetPlanPriceNumberOfList','')
			targetMap.put('GetPlanWithInstallmentPriceReleaseVersion','')
			targetMap.put('GetPlanWithInstallmentPriceNumberOfList','')
			targetMap.put('GetPlanPriceResult','')
			targetMap.put('GetPlanPriceDetail','')
			targetMap.put('GetPlanWithInstallmentPriceResult','')
			targetMap.put('GetPlanWithInstallmentPriceDetail','')
			targetMap.put('QuotePolicyStartDate','')
			targetMap.put('QuotePolicyEndDate','')
			targetMap.put('QuotePolicyEndorsementEffectiveDate','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseRegisterClientApi(String strResponseText,Integer StatusCode,Map mapPricingApiInputOutput){
		Boolean lResult=false
		Map lreturn=[:]
		String lVerifyRegisterClientApiDetail=''
		Boolean lVerifyRegisterClientApiResult=true
		Boolean lIsObjectOK=true
		try{
			lreturn.put("Result",lResult)
			if(strResponseText.length()<=0){
				return lreturn
			}
			String lText=''
			String lEmptyValue='EmptyValue'
			String lNullValue='NULL'
			Map lMapJson=new JsonSlurper().parseText(strResponseText)
			Boolean lIsObjectReady=lMapJson.containsKey('UUID')
			if(StatusCode==200){
				if(lIsObjectReady){
					//Integer lIntegerRegisterClientApiUuid=lMapJson.UUID
					String lRegisterClientApiUuid=lMapJson.UUID
					Boolean lIsRegisterClientApiUuidEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiUuid)
					if(lIsRegisterClientApiUuidEmpty){
						lIsObjectOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'Uuid='+lEmptyValue)
						lVerifyRegisterClientApiDetail=lText
					}
					mapPricingApiInputOutput.RegisterUuid=lRegisterClientApiUuid
					String lVerifyRegsiterClientApiServiceDataDetailText=''
					Boolean lIsServiceDataKeyExist=lMapJson.containsKey('ServiceData')
					if(!lIsServiceDataKeyExist){
						lIsObjectOK=false
						lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'ServiceData='+lNullValue)
					}else{
						Map lMapRegisterClientApiServiceData=lMapJson.ServiceData
						String lStrRegisterClientApiServiceData=lMapRegisterClientApiServiceData.toString()
						mapPricingApiInputOutput.RegisterServiceData=lStrRegisterClientApiServiceData
						if(!lMapRegisterClientApiServiceData.CreatePolicy){
							lIsObjectOK=false
							lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'CreatePolicy='+lNullValue)
						}else{
							Boolean lIsRegisterClientApiServiceDataCreatePolicyContainUrl=lMapRegisterClientApiServiceData.CreatePolicy.Url
							if(lIsRegisterClientApiServiceDataCreatePolicyContainUrl){
								String lRegisterClientApiServiceDataCreatePolicyUrlValue=lMapRegisterClientApiServiceData.CreatePolicy.Url
								Boolean lIsRegisterClientApiServiceDataUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataCreatePolicyUrlValue)
								if(lIsRegisterClientApiServiceDataUrlValueEmpty){
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'CreatePolicyUrl='+lEmptyValue)
								}else{
									mapPricingApiInputOutput.RegisterClientServiceDataCreatePolicyUrl=lRegisterClientApiServiceDataCreatePolicyUrlValue
								}
							}else{
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'CreatePolicyUrl='+lNullValue)
							}
							String lRegisterClientApiServiceDataCreatePolicyInterceptorUrl=lMapRegisterClientApiServiceData.CreatePolicy.InterceptorUrl
							IGNUemaHelper.printLog('lRegisterClientApiServiceDataCreatePolicyInterceptorUrl:')
							IGNUemaHelper.printLog(lRegisterClientApiServiceDataCreatePolicyInterceptorUrl)
							Boolean lIsRegisterClientApiServiceDataCreatePolicyInterceptorUrlNull=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataCreatePolicyInterceptorUrl)
							if(!lIsRegisterClientApiServiceDataCreatePolicyInterceptorUrlNull){
								String lRegisterClientApiServiceDataInterceptorUrlValue=lMapRegisterClientApiServiceData.CreatePolicy.InterceptorUrl
								mapPricingApiInputOutput.RegisterClientServiceDataCreatePolicyInterceptoUrl=lRegisterClientApiServiceDataInterceptorUrlValue
							}else{
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'CreatePolicyInterceptorUrl='+lNullValue)
							}
							String  lRegisterClientApiServiceDataCreatePolicyContainFlagConcurrent=lMapRegisterClientApiServiceData.CreatePolicy.FlagConcurrent
							Boolean lIsRegisterClientApiServiceDataCreatePolicyContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataCreatePolicyContainFlagConcurrent)
							if(lIsRegisterClientApiServiceDataCreatePolicyContainFlagConcurrent){
								String lRegisterClientApiServiceDataFlagConcurrentValue=lMapRegisterClientApiServiceData.CreatePolicy.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataFlagConcurrentValue)
								if(lIsRegisterClientApiServiceDataFlagConcurrentValueEmpty){
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'CreatePolicyFlagConcurrent='+lEmptyValue)
								}else{
									mapPricingApiInputOutput.RegisterClientServiceDataCreatePolicyFlagConcurrent=lRegisterClientApiServiceDataCreatePolicyContainFlagConcurrent
								}
							}else{
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'CreatePolicyFlagConcurrent='+lNullValue)
							}
							if(!lMapRegisterClientApiServiceData.GetPlanPriceInst){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInst='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataGetPlanPriceInstContainUrl=lMapRegisterClientApiServiceData.GetPlanPriceInst.Url
								if(lIsRegisterClientApiServiceDataGetPlanPriceInstContainUrl){
									String lRegisterClientApiServiceDataGetPlanPriceInstUrlValue=lMapRegisterClientApiServiceData.GetPlanPriceInst.Url
									Boolean lIsRegisterClientApiServiceDataUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetPlanPriceInstUrlValue)
									if(lIsRegisterClientApiServiceDataUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInstUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataGetPlanPriceInstUrl=lRegisterClientApiServiceDataGetPlanPriceInstUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInstUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataGetPlanPriceInstContainInterceptorUrl=lMapRegisterClientApiServiceData.GetPlanPriceInst.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataGetPlanPriceInstContainInterceptorUrl=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetPlanPriceInstContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataGetPlanPriceInstContainInterceptorUrl){
									String lRegisterClientApiServiceDataGetPlanPriceInstInterceptorUrlValue=lMapRegisterClientApiServiceData.GetPlanPriceInst.InterceptorUrl
									mapPricingApiInputOutput.RegisterClientServiceDataGetPlanPriceInstInterceptoUrl=lRegisterClientApiServiceDataGetPlanPriceInstInterceptorUrlValue
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInstInterceptorUrl='+lNullValue)
								}
								String  lRegisterClientApiServiceDataGetPlanPriceInstContainFlagConcurrent=lMapRegisterClientApiServiceData.GetPlanPriceInst.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataGetPlanPriceInstContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetPlanPriceInstContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataGetPlanPriceInstContainFlagConcurrent){
									String lRegisterClientApiServiceDataGetPlanPriceInstFlagConcurrentValue=lMapRegisterClientApiServiceData.GetPlanPriceInst.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetPlanPriceInstFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInstFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataGetPlanPriceInstFlagConcurrent=lRegisterClientApiServiceDataGetPlanPriceInstFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInstFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.PricingPolicyMapping){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'PricingPolicyMapping='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataPricingPolicyMappingContainUrl=lMapRegisterClientApiServiceData.PricingPolicyMapping.Url
								if(lIsRegisterClientApiServiceDataPricingPolicyMappingContainUrl){
									String lRegisterClientApiServiceDataPricingPolicyMappingUrlValue=lMapRegisterClientApiServiceData.PricingPolicyMapping.Url
									Boolean lIsRegisterClientApiServiceDataPricingPolicyMappingUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataPricingPolicyMappingUrlValue)
									if(lIsRegisterClientApiServiceDataPricingPolicyMappingUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'PricingPolicyMappingUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingPolicyMappingUrl=lRegisterClientApiServiceDataPricingPolicyMappingUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'PricingPolicyMappingUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataPricingPolicyMappingContainInterceptorUrl=lMapRegisterClientApiServiceData.PricingPolicyMapping.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataPricingPolicyMappingContainInterceptorUrl=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataPricingPolicyMappingContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataPricingPolicyMappingContainInterceptorUrl){
									String lRegisterClientApiServiceDataPricingPolicyMappingInterceptorUrlValue=lMapRegisterClientApiServiceData.PricingPolicyMapping.InterceptorUrl
									Boolean lIsRegisterClientApiServiceDataInterceptorUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataPricingPolicyMappingInterceptorUrlValue)
									mapPricingApiInputOutput.RegisterClientServiceDataPricingPolicyMappingInterceptorUrl=lRegisterClientApiServiceDataPricingPolicyMappingContainInterceptorUrl
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'PricingPolicyMappingInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataPricingPolicyMappingContainFlagConcurrent=lMapRegisterClientApiServiceData.PricingPolicyMapping.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataPricingPolicyMappingContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataPricingPolicyMappingContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataPricingPolicyMappingContainFlagConcurrent){
									String lRegisterClientApiServiceDataPricingPolicyMappingFlagConcurrentValue=lMapRegisterClientApiServiceData.PricingPolicyMapping.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataPricingPolicyMappingFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataPricingPolicyMappingFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataPricingPolicyMappingFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'PricingPolicyMappingFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingPolicyMappingFlagConcurrent=lRegisterClientApiServiceDataPricingPolicyMappingFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'PricingPolicyMappingFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.EndorsementPlanPrice){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementPlanPrice='+lNullValue)
							}
							else{
								Boolean lIsRegisterClientApiServiceDataEndorsementPlanPriceContainUrl=lMapRegisterClientApiServiceData.EndorsementPlanPrice.Url
								if(lIsRegisterClientApiServiceDataEndorsementPlanPriceContainUrl){
									String lRegisterClientApiServiceDataEndorsementPlanPriceUrlValue=lMapRegisterClientApiServiceData.EndorsementPlanPrice.Url
									Boolean lIsRegisterClientApiServiceDataEndorsementPlanPriceUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataEndorsementPlanPriceUrlValue)
									if(lIsRegisterClientApiServiceDataEndorsementPlanPriceUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementPlanPriceUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementUrl=lRegisterClientApiServiceDataEndorsementPlanPriceUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementPlanPriceUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataEndorsementPlanPriceContainInterceptorUrl=lMapRegisterClientApiServiceData.EndorsementPlanPrice.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataEndorsementPlanPriceContainInterceptorUrl=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataEndorsementPlanPriceContainInterceptorUrl)
								if(lIsRegisterClientApiServiceDataEndorsementPlanPriceContainInterceptorUrl){
									String lRegisterClientApiServiceDataEndorsementPlanPriceInterceptorUrlValue=lMapRegisterClientApiServiceData.EndorsementPlanPrice.InterceptorUrl
									mapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementInterceptoUrl=lRegisterClientApiServiceDataEndorsementPlanPriceInterceptorUrlValue
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementPlanPriceInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataEndorsementPlanPriceContainFlagConcurrent=lMapRegisterClientApiServiceData.EndorsementPlanPrice.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataEndorsementPlanPriceContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataEndorsementPlanPriceContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataEndorsementPlanPriceContainFlagConcurrent){
									String lRegisterClientApiServiceDataEndorsementPlanPriceFlagConcurrentValue=lMapRegisterClientApiServiceData.EndorsementPlanPrice.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataEndorsementPlanPriceFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataEndorsementPlanPriceFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataEndorsementPlanPriceFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementPlanPriceFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementFlagConcurrent=lRegisterClientApiServiceDataEndorsementPlanPriceFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementPlanPriceFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.GetPlanPrice){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPrice='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataGetPlanPriceContainUrl=lMapRegisterClientApiServiceData.GetPlanPrice.Url
								if(lIsRegisterClientApiServiceDataGetPlanPriceContainUrl){
									String lRegisterClientApiServiceDataGetPlanPriceUrlValue=lMapRegisterClientApiServiceData.GetPlanPrice.Url
									Boolean lIsRegisterClientApiServiceDataGetPlanPriceUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetPlanPriceUrlValue)
									if(lIsRegisterClientApiServiceDataGetPlanPriceUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingGetPlanPriceUrl=lRegisterClientApiServiceDataGetPlanPriceUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataGetPlanPriceContainInterceptorUrl=lMapRegisterClientApiServiceData.GetPlanPrice.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataGetPlanPriceContainInterceptorUrl=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetPlanPriceContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataGetPlanPriceContainInterceptorUrl){
									String lRegisterClientApiServiceDataGetPlanPriceInterceptorUrlValue=lMapRegisterClientApiServiceData.GetPlanPrice.InterceptorUrl
									mapPricingApiInputOutput.RegisterClientServiceDataPricingGetPlanPriceInterceptoUrl=lRegisterClientApiServiceDataGetPlanPriceInterceptorUrlValue
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceInterceptorUrl='+lNullValue)
								}
								Boolean lRegisterClientApiServiceDataGetPlanPriceContainFlagConcurrent=lMapRegisterClientApiServiceData.GetPlanPrice.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataGetPlanPriceContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetPlanPriceContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataGetPlanPriceContainFlagConcurrent){
									String lRegisterClientApiServiceDataGetPlanPriceFlagConcurrentValue=lMapRegisterClientApiServiceData.GetPlanPrice.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataGetPlanPriceFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetPlanPriceFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataGetPlanPriceFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.lRegisterClientApiServiceDataGetPlanPriceFlagConcurrentValue=lRegisterClientApiServiceDataGetPlanPriceFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetPlanPriceFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.RetrievePolicy){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'RetrievePolicy='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataRetrievePolicyContainUrl=lMapRegisterClientApiServiceData.RetrievePolicy.Url
								if(lIsRegisterClientApiServiceDataRetrievePolicyContainUrl){
									String lRegisterClientApiServiceDataRetrievePolicyUrlValue=lMapRegisterClientApiServiceData.RetrievePolicy.Url
									Boolean lIsRegisterClientApiServiceDataRetrievePolicyUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataRetrievePolicyUrlValue)
									if(lIsRegisterClientApiServiceDataRetrievePolicyUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'RetrievePolicyUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingRetrievePolicyUrl=lRegisterClientApiServiceDataRetrievePolicyUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'RetrievePolicyUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataRetrievePolicyContainInterceptorUrl=lMapRegisterClientApiServiceData.RetrievePolicy.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataRetrievePolicyContainInterceptorUrl=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataRetrievePolicyContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataRetrievePolicyContainInterceptorUrl){
									String lRegisterClientApiServiceDataRetrievePolicyInterceptorUrlValue=lMapRegisterClientApiServiceData.RetrievePolicy.InterceptorUrl
									Boolean lIsRegisterClientApiServiceDataRetrievePolicyInterceptorUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataRetrievePolicyInterceptorUrlValue)
									mapPricingApiInputOutput.RegisterClientServiceDataPricingRetrievePolicyInterceptoUrl=lRegisterClientApiServiceDataRetrievePolicyContainInterceptorUrl
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'RetrievePolicyInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataRetrievePolicyContainFlagConcurrent=lMapRegisterClientApiServiceData.RetrievePolicy.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataRetrievePolicyContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataRetrievePolicyContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataRetrievePolicyContainFlagConcurrent){
									String lRegisterClientApiServiceDataRetrievePolicyFlagConcurrentValue=lMapRegisterClientApiServiceData.RetrievePolicy.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataRetrievePolicyFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataRetrievePolicyFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataRetrievePolicyFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'RetrievePolicyFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingRetrievePolicyFlagConcurrent=lRegisterClientApiServiceDataRetrievePolicyContainFlagConcurrent
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'RetrievePolicyFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.GetCalculationConfiguration){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetCalculationConfiguration='+lNullValue)
							}
							else{
								Boolean lIsRegisterClientApiServiceDataGetCalculationConfigurationContainUrl=lMapRegisterClientApiServiceData.GetCalculationConfiguration.Url
								if(lIsRegisterClientApiServiceDataGetCalculationConfigurationContainUrl){
									String lRegisterClientApiServiceDataGetCalculationConfigurationUrlValue=lMapRegisterClientApiServiceData.GetCalculationConfiguration.Url
									Boolean lIsRegisterClientApiServiceDataGetCalculationConfigurationUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetCalculationConfigurationUrlValue)
									if(lIsRegisterClientApiServiceDataGetCalculationConfigurationUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetCalculationConfigurationUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingGetCalculationConfigurationUrl=lRegisterClientApiServiceDataGetCalculationConfigurationUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetCalculationConfigurationUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataGetCalculationConfigurationContainInterceptorUrl=lMapRegisterClientApiServiceData.GetCalculationConfiguration.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataGetCalculationConfigurationContainInterceptorUrl=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetCalculationConfigurationContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataGetCalculationConfigurationContainInterceptorUrl){
									String lRegisterClientApiServiceDataGetCalculationConfigurationInterceptorUrlValue=lMapRegisterClientApiServiceData.GetCalculationConfiguration.InterceptorUrl
									mapPricingApiInputOutput.RegisterClientServiceDataPricingGetCalculationConfigurationInterceptoUrl=lRegisterClientApiServiceDataGetCalculationConfigurationContainInterceptorUrl
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetCalculationConfigurationInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataGetCalculationConfigurationContainFlagConcurrent=lMapRegisterClientApiServiceData.GetCalculationConfiguration.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataGetCalculationConfigurationContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetCalculationConfigurationContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataGetCalculationConfigurationContainFlagConcurrent){
									String lRegisterClientApiServiceDataGetCalculationConfigurationFlagConcurrentValue=lMapRegisterClientApiServiceData.GetCalculationConfiguration.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataGetCalculationConfigurationFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetCalculationConfigurationFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataGetCalculationConfigurationFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetCalculationConfigurationFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingGetCalculationConfigurationFlagConcurrent=lRegisterClientApiServiceDataGetCalculationConfigurationFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetCalculationConfigurationFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.MultiplePlanPrice){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'MultiplePlanPrice='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataMultiplePlanPriceContainUrl=lMapRegisterClientApiServiceData.MultiplePlanPrice.Url
								if(lIsRegisterClientApiServiceDataMultiplePlanPriceContainUrl){
									String lRegisterClientApiServiceDataMultiplePlanPriceUrlValue=lMapRegisterClientApiServiceData.MultiplePlanPrice.Url
									Boolean lIsRegisterClientApiServiceDataMultiplePlanPriceUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataMultiplePlanPriceUrlValue)
									if(lIsRegisterClientApiServiceDataMultiplePlanPriceUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'MultiplePlanPriceUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingMultiplePlanPriceUrl=lRegisterClientApiServiceDataMultiplePlanPriceUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'MultiplePlanPriceUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataMultiplePlanPriceContainInterceptorUrl=lMapRegisterClientApiServiceData.MultiplePlanPrice.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataMultiplePlanPriceContainInterceptorUrl=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataMultiplePlanPriceContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataMultiplePlanPriceContainInterceptorUrl){
									String lRegisterClientApiServiceDataMultiplePlanPriceInterceptorUrlValue=lMapRegisterClientApiServiceData.MultiplePlanPrice.InterceptorUrl
									Boolean lIsRegisterClientApiServiceDataMultiplePlanPriceInterceptorUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataMultiplePlanPriceInterceptorUrlValue)
									mapPricingApiInputOutput.RegisterClientServiceDataPricingMultiplePlanPriceInterceptoUrl=lRegisterClientApiServiceDataMultiplePlanPriceInterceptorUrlValue
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'MultiplePlanPriceInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataMultiplePlanPriceContainFlagConcurrent=lMapRegisterClientApiServiceData.MultiplePlanPrice.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataMultiplePlanPriceContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataMultiplePlanPriceContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataMultiplePlanPriceContainFlagConcurrent){
									String lRegisterClientApiServiceDataMultiplePlanPriceFlagConcurrentValue=lMapRegisterClientApiServiceData.MultiplePlanPrice.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataMultiplePlanPriceFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataMultiplePlanPriceFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataMultiplePlanPriceFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'MultiplePlanPriceFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingMultiplePlanPriceFlagConcurrent=lRegisterClientApiServiceDataMultiplePlanPriceFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'MultiplePlanPriceFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.GetDependencyCodeMapping){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetDependencyCodeMapping='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataGetDependencyCodeMappingContainUrl=lMapRegisterClientApiServiceData.GetDependencyCodeMapping.Url
								if(lIsRegisterClientApiServiceDataGetDependencyCodeMappingContainUrl){
									String lRegisterClientApiServiceDataGetDependencyCodeMappingUrlValue=lMapRegisterClientApiServiceData.GetDependencyCodeMapping.Url
									Boolean lIsRegisterClientApiServiceDataGetDependencyCodeMappingUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetDependencyCodeMappingUrlValue)
									if(lIsRegisterClientApiServiceDataGetDependencyCodeMappingUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetDependencyCodeMappingUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingGetDependencyCodeMappingUrl=lRegisterClientApiServiceDataGetDependencyCodeMappingUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetDependencyCodeMappingUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataGetDependencyCodeMappingContainInterceptorUrl=lMapRegisterClientApiServiceData.GetDependencyCodeMapping.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataGetDependencyCodeMappingContainInterceptorUrlNull=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetDependencyCodeMappingContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataGetDependencyCodeMappingContainInterceptorUrlNull){
									String lRegisterClientApiServiceDataGetDependencyCodeMappingInterceptorUrlValue=lMapRegisterClientApiServiceData.GetDependencyCodeMapping.InterceptorUrl
									mapPricingApiInputOutput.RegisterClientServiceDataPricingGetDependencyCodeMappingInterceptoUrl=lRegisterClientApiServiceDataGetDependencyCodeMappingInterceptorUrlValue
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetDependencyCodeMappingInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataGetDependencyCodeMappingContainFlagConcurrent=lMapRegisterClientApiServiceData.GetDependencyCodeMapping.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataGetDependencyCodeMappingContainFlagConcurrentNull=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataGetDependencyCodeMappingContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataGetDependencyCodeMappingContainFlagConcurrentNull){
									String lRegisterClientApiServiceDataGetDependencyCodeMappingFlagConcurrentValue=lMapRegisterClientApiServiceData.GetDependencyCodeMapping.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataGetDependencyCodeMappingFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataGetDependencyCodeMappingFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataGetDependencyCodeMappingFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetDependencyCodeMappingFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingGetDependencyCodeMappingFlagConcurrent=lRegisterClientApiServiceDataGetDependencyCodeMappingFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'GetDependencyCodeMappingFlagConcurrent='+lNullValue)
								}
							}
							if(!lMapRegisterClientApiServiceData.EndorsementInst){
								lIsObjectOK=false
								lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementInst='+lNullValue)
							}else{
								Boolean lIsRegisterClientApiServiceDataEndorsementInstContainUrl=lMapRegisterClientApiServiceData.EndorsementInst.Url
								if(lIsRegisterClientApiServiceDataEndorsementInstContainUrl){
									String lRegisterClientApiServiceDataEndorsementInstUrlValue=lMapRegisterClientApiServiceData.EndorsementInst.Url
									Boolean lIsRegisterClientApiServiceDataEndorsementInstUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataEndorsementInstUrlValue)
									if(lIsRegisterClientApiServiceDataEndorsementInstUrlValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementInstUrl='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementInstUrl=lRegisterClientApiServiceDataEndorsementInstUrlValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementInstUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataEndorsementInstContainInterceptorUrl=lMapRegisterClientApiServiceData.EndorsementInst.InterceptorUrl
								Boolean lIsRegisterClientApiServiceDataEndorsementInstContainInterceptorUrlNull=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataEndorsementInstContainInterceptorUrl)
								if(!lIsRegisterClientApiServiceDataEndorsementInstContainInterceptorUrlNull){
									String lRegisterClientApiServiceDataEndorsementInstInterceptorUrlValue=lMapRegisterClientApiServiceData.EndorsementInst.InterceptorUrl
									mapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementInstInterceptoUrl=lRegisterClientApiServiceDataEndorsementInstInterceptorUrlValue
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementInstInterceptorUrl='+lNullValue)
								}
								String lRegisterClientApiServiceDataEndorsementInstContainFlagConcurrent=lMapRegisterClientApiServiceData.EndorsementInst.FlagConcurrent
								Boolean lIsRegisterClientApiServiceDataEndorsementInstContainFlagConcurrentNull=IGNUemaHelper.checkObjectNullOfObject(lRegisterClientApiServiceDataEndorsementInstContainFlagConcurrent)
								if(lIsRegisterClientApiServiceDataEndorsementInstContainFlagConcurrentNull){
									String lRegisterClientApiServiceDataEndorsementInstFlagConcurrentValue=lMapRegisterClientApiServiceData.EndorsementInst.FlagConcurrent
									Boolean lIsRegisterClientApiServiceDataEndorsementInstFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiServiceDataEndorsementInstFlagConcurrentValue)
									if(lIsRegisterClientApiServiceDataEndorsementInstFlagConcurrentValueEmpty){
										lIsObjectOK=false
										lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementInstFlagConcurrent='+lEmptyValue)
									}else{
										mapPricingApiInputOutput.RegisterClientServiceDataPricingEndorsementInstFlagConcurrent=lRegisterClientApiServiceDataEndorsementInstFlagConcurrentValue
									}
								}else{
									lIsObjectOK=false
									lVerifyRegsiterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiServiceDataDetailText,'EndorsementInstFlagConcurrent='+lNullValue)
								}
							}
							if(lVerifyRegsiterClientApiServiceDataDetailText.length()>0){
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('ServiceData',lVerifyRegsiterClientApiServiceDataDetailText)
								lVerifyRegisterClientApiDetail=lText
							}
						}
					}
					String lVerifyRegsiterClientApiLibraryDataDetailText=''
					Boolean lIsLibraryKeyExist=lMapJson.containsKey('Libraries')
					if(!lIsLibraryKeyExist){
						lIsObjectOK=false
						lVerifyRegsiterClientApiLibraryDataDetailText=lVerifyRegsiterClientApiLibraryDataDetailText+IGNUemaHelper.concatMessageLeftRightByPipe("Libraries",lEmptyValue)
					}else{
						List lRegisterClientApiLibraryList=lMapJson.Libraries
						Boolean lIsRegisterClientApiLibraryList=IGNUemaHelper.checkObjectEmptyOfList(lRegisterClientApiLibraryList)
						if(lIsRegisterClientApiLibraryList){
							lIsObjectOK=false
							lVerifyRegsiterClientApiLibraryDataDetailText=lVerifyRegsiterClientApiLibraryDataDetailText+IGNUemaHelper.concatMessageLeftRightByPipe("Libraries",lEmptyValue)
						}else{
							String lRegisterClientApiLibrary=lRegisterClientApiLibraryList.toString()
							mapPricingApiInputOutput.RegisterClientServiceLibraryRoot=lRegisterClientApiLibrary
							List<String> lRegisterClientLibrayNameList=[]
							List<String> lRegisterClientLibrayVersionList=[]
							IGNUemaHelper.printLog(lRegisterClientApiLibraryList)
							if(lRegisterClientApiLibraryList.size()>0){
								for(Integer lIndex=0;lIndex<=lRegisterClientApiLibraryList.size()-1;lIndex++){
									String lLibName=lRegisterClientApiLibraryList.get(lIndex).LibName
									Boolean lIsLibNameNull=IGNUemaHelper.checkObjectNullOfObject(lLibName)
									if(!lIsLibNameNull){
										Boolean lIsLibNameEmpty=IGNUemaHelper.checkObjectEmptyOfString(lLibName)
										if(lIsLibNameEmpty){
											lIsObjectOK=false
											lVerifyRegsiterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiLibraryDataDetailText,'LibName='+lEmptyValue)
										}else{
											lRegisterClientLibrayNameList.add(lLibName)
										}
									}else{
										lIsObjectOK=false
										lVerifyRegsiterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiLibraryDataDetailText,'LibName='+lNullValue)
									}
									String lLibVersion=lRegisterClientApiLibraryList.get(lIndex).LibVersion
									Boolean lIsLibVersionNull=IGNUemaHelper.checkObjectNullOfObject(lLibVersion)
									if(!lIsLibVersionNull){
										Boolean lIsLibVersionEmpty=IGNUemaHelper.checkObjectEmptyOfString(lLibVersion)
										if(lIsLibVersionEmpty){
											lIsObjectOK=false
											lVerifyRegsiterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiLibraryDataDetailText,'LibVersion='+lEmptyValue)
										}else{
											lRegisterClientLibrayVersionList.add(lLibVersion)
										}
									}else{
										lIsObjectOK=false
										lVerifyRegsiterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegsiterClientApiLibraryDataDetailText,'LibVersion='+lNullValue)
									}
								}
								IGNUemaHelper.printLog('LibraryList')
								IGNUemaHelper.printLog(lRegisterClientLibrayNameList)
								IGNUemaHelper.printLog(lRegisterClientLibrayVersionList)
								mapPricingApiInputOutput.RegisterClientLibraryItem01Name=lRegisterClientLibrayNameList.get(0)
								mapPricingApiInputOutput.RegisterClientLibraryItem01Version=lRegisterClientLibrayVersionList.get(0)
								mapPricingApiInputOutput.RegisterClientLibraryItem02Name=lRegisterClientLibrayNameList.get(1)
								mapPricingApiInputOutput.RegisterClientLibraryItem01Version=lRegisterClientLibrayVersionList.get(1)
							}
						}
					}
					if(lVerifyRegsiterClientApiLibraryDataDetailText.length()>0){
						lText=lText+IGNUemaHelper.concatMessageLeftRightByPipe('Libraries',lVerifyRegsiterClientApiLibraryDataDetailText)
						lVerifyRegisterClientApiDetail=lText
					}
				}else{
					lIsObjectOK=false
					String lJsonString=lMapJson.toString()
					lText=IGNUemaHelper.concatMessageLeftRightByPipe("UUID",lNullValue)
					lVerifyRegisterClientApiDetail=lText
				}
			}else{
				lIsObjectOK=false
				lVerifyRegisterClientApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				String lVerifyRegisterClientApiDetailResultMessage=this.inputGenericResultMessageB(lVerifyRegisterClientApiDetail,StatusCode)
				lVerifyRegisterClientApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyRegisterClientApiDetail,lVerifyRegisterClientApiDetailResultMessage)
			}
			if(lVerifyRegisterClientApiDetail.length()>0){
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('RegisterClient',lVerifyRegisterClientApiDetail)
				lVerifyRegisterClientApiDetail=lText
			}
			if(lIsObjectOK){
				mapPricingApiInputOutput.RegisterClientApiResult='Passed'
				mapPricingApiInputOutput.RegisterClientApiDetail=''
			}else{
				mapPricingApiInputOutput.RegisterClientApiResult='Failed'
				mapPricingApiInputOutput.RegisterClientApiDetail=lVerifyRegisterClientApiDetail.trim()
			}
			lResult=lVerifyRegisterClientApiDetail.length()>=0
			lVerifyRegisterClientApiResult=lIsObjectOK
			if(lResult){
				lreturn.put("Result",lVerifyRegisterClientApiResult)
				lreturn.put("VerifyRegisterClientApiDetail",lVerifyRegisterClientApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseMultiPlanPricingApi(String strProductType,String strResponseText,Integer statusCode,Boolean  isPositiveCase,Map mapPricingApiInputOutput,List strCoverList,List strCoverageList){
		Boolean lResult=false
		Map lreturn=[:]
		//String lPositiveCase=strPositiveCase.trim()
		Boolean lVerifyMultiPlanPricingApiResult=true
		String lVerifyMultiPlanPricingApiDetail=''
		String lProductType=strProductType.trim()
		try{
			lreturn.put("Result",lResult)
			lreturn.put('MultiPlanPricingApiDetail',lVerifyMultiPlanPricingApiDetail)
			if(strResponseText.length()<=0){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverageList)){
				return lreturn
			}
			String lText=''
			Boolean lIsObjectOK=true
			Boolean lIsOK=true
			List lCoverList=strCoverList
			List lCoverageList=strCoverageList
			if(statusCode==200){
				Map lMapJson=new JsonSlurper().parseText(strResponseText)
				String lEmptyValue='Empty'
				String lNullValue='Null'
				List<String> lEmptyList=[]
				Boolean lIsObjectReady=lMapJson.containsKey('root')
				if(lIsObjectReady){
					List<String> lMultiPlanPricingApiQuoteDataList=lMapJson.root[0].Quote
					String lStrMultiPlanPricingApiQuoteData=lMultiPlanPricingApiQuoteDataList.toString()
					mapPricingApiInputOutput.MultiplePlanQuoteRoot=lStrMultiPlanPricingApiQuoteData
					Boolean lIsMultiPlanPricingApiQuoteDataListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lMultiPlanPricingApiQuoteDataList)
					if(!lIsMultiPlanPricingApiQuoteDataListEmpty){
						/*String lMutiPlanApiPolicyNumber=lMapJson.root[0].Quote[0].Policy_Number
						 Boolean lIsMultiPlanPricingApiPolicyNumberNull=IGNUemaHelper.checkObjectNullOfObject(lMutiPlanApiPolicyNumber)
						 if(lIsMultiPlanPricingApiPolicyNumberNull){
						 lIsObjectOK=false
						 lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"PolicyNumber="+lNullValue)
						}
						 mapPricingApiInputOutput.MultiplePlanPriceQuotePolicyNumber=lMutiPlanApiPolicyNumber*/
						List<String>lMultiPlanPricingApiLoadingFactorList=lMapJson.root[0].Quote[0].loadingFactor
						String lStrMultiPlanPricingApiLoadingFactor=lMultiPlanPricingApiLoadingFactorList.toString()
						mapPricingApiInputOutput.MultiplePlanPriceQuoteLoadingFactorRoot=lStrMultiPlanPricingApiLoadingFactor
						Boolean lIsMultiPlanPricingApiLoadingFactorListNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiLoadingFactorList)
						if(lIsMultiPlanPricingApiLoadingFactorListNull){
							lIsObjectOK=false
							lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"LoadingFactor="+lNullValue)
						}else{
							Boolean lIsMultiPlanPricingApiLoadingFactorListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lMultiPlanPricingApiLoadingFactorList)
							if(lIsMultiPlanPricingApiLoadingFactorListEmpty){
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"LoadingFactor="+lEmptyValue)
							}
						}
						if(IGNUemaHelper.checkStringContainString(lProductType,'Motor')){
							List<String>lMultiPlanPricingApiVehicleDataList=lMapJson.root[0].Quote[0].vehicleData
							Boolean lIsMultiPlanPricingApiVehicleDataListNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiVehicleDataList)
							if(lIsMultiPlanPricingApiVehicleDataListNull){
								lIsObjectOK=false
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"VehicleDataList="+lNullValue)
							}else{
								Boolean lIsMultiPlanPricingApiVehicleDataListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lMultiPlanPricingApiVehicleDataList)
								if(lIsMultiPlanPricingApiVehicleDataListEmpty){
									lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"VehicleDataList="+lEmptyValue)
								}else{
									lText=''
									String lStrMultiPlanPricingApiVehicleData=lMultiPlanPricingApiVehicleDataList.toString()
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataRoot=lStrMultiPlanPricingApiVehicleData
									String lMultiPlanPricingApiVehicleDataUwVehicleType=lMultiPlanPricingApiVehicleDataList[0].UW_Vehicle_Type
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataUwVehicleType=lMultiPlanPricingApiVehicleDataUwVehicleType
									Boolean lIsMultiPlanPricingApiVehicleDataUwVehicleTypeNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiVehicleDataList)
									if(lIsMultiPlanPricingApiVehicleDataUwVehicleTypeNull){
										lIsObjectOK=false
										IGNUemaHelper.printLog('IsObjectOK')
										IGNUemaHelper.printLog(lIsObjectOK)
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"UwVehicleTypeItem"+':'+lNullValue)
									}else{
										Boolean lIsMultiPlanPricingApiVehicleDataUwVehicleTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiVehicleDataUwVehicleType)
										if(lIsMultiPlanPricingApiVehicleDataUwVehicleTypeEmpty){
											lIsObjectOK=false
											IGNUemaHelper.printLog('I')
											IGNUemaHelper.printLog(lIsObjectOK)
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"UwVehicleTypeItem"+'='+lEmptyValue)
										}
									}
									String lMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileage=lMultiPlanPricingApiVehicleDataList[0].Policy_Estimated_Annual_Mileage
									if(lMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileage=='[]'){
										lMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileage=''
									}
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataPolicyEstimatedAnnualMileage=lMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileage
									Boolean lIsMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileageNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiVehicleDataList)
									if(lIsMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileageNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"PolicyEstimatedAnnualMileageItem"+'='+lNullValue)
									}else{
										Boolean lIsMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileage)
										if(lIsMultiPlanPricingApiVehicleDataPolicyEstimatedAnnualMileageEmpty){
											lIsObjectOK=false
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"PolicyEstimatedAnnualMileageItem"+'='+lEmptyValue)
										}
									}
									String lMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlag=lMultiPlanPricingApiVehicleDataList[0].UW_Vehicle_Type_Warning_Flag
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataUwVehicleTypeWarningFlag=lMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlag
									Boolean lIsMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlagNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiVehicleDataList)
									if(lIsMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlagNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"UwVehicleTypeWarningFlagItem"+'='+lNullValue)
									}else{
										Boolean lIsMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlagEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlag)
										if(lIsMultiPlanPricingApiVehicleDataUwVehicleTypeWarningFlagEmpty){
											lIsObjectOK=false
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"UwVehicleTypeWarningFlagItem"+'='+lEmptyValue)
										}
									}
									String lMultiPlanPricingApiVehicleDataCarDefaultValueFinal=lMultiPlanPricingApiVehicleDataList[0].Car_Default_Value_Final
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataCarDefaultValueFinal=lMultiPlanPricingApiVehicleDataCarDefaultValueFinal
									Boolean lIsMultiPlanPricingApiVehicleDataCarDefaultValueFinalNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiVehicleDataList)
									if(lIsMultiPlanPricingApiVehicleDataCarDefaultValueFinalNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"CarDefaultValueFinalItem"+'='+lNullValue)
									}else{
										Boolean lIsMultiPlanPricingApiVehicleDataCarDefaultValueFinalEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiVehicleDataCarDefaultValueFinal)
										if(lIsMultiPlanPricingApiVehicleDataCarDefaultValueFinalEmpty){
											lIsObjectOK=false
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"CarDefaultValueFinalItem"+'='+lEmptyValue)
										}
									}
									if(lText.length()>1){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleData',lText)
										lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lText)
									}
								}
							}
						}
						/*List<String>lMultiPlanPricingApiAvailableOptionList=lMapJson.root[0].Quote[0].AvailableOptions
						 String lStrMultiPlanPricingApiAvailableOption=lMultiPlanPricingApiAvailableOptionList.toString()
						 mapPricingApiInputOutput.MultiplePlanPriceQuoteAvailableOptionRoot=lStrMultiPlanPricingApiAvailableOption
						 Boolean lIsMultiPlanPricingApiAvailableOptionListNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiAvailableOptionList)
						 if(lIsMultiPlanPricingApiAvailableOptionListNull){
						 lIsObjectOK=false
						 lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"AvailableOptionList="+lNullValue)
						}else{
						 Boolean lIsMultiPlanPricingApiAvailableOptionListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lMultiPlanPricingApiAvailableOptionList)
						 if(lIsMultiPlanPricingApiAvailableOptionListEmpty){
						 lIsObjectOK=false
						 lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"AvailableOptionList="+lEmptyValue)
						}
						 if(lText.length()>1){
						 lText=IGNUemaHelper.concatMessageLeftRightByPipe('AvailableOption',lText)
						 lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lText)
						}
						}*/
						Map lMapMultiPlanPricingApiCoverageData=lMapJson.root[0].Quote[0].Coverages
						Boolean lIsMapMultiPlanPricingApiCoverageData=IGNUemaHelper.checkObjectNullOfObject(lMapMultiPlanPricingApiCoverageData)
						if(lIsMapMultiPlanPricingApiCoverageData){
							lIsObjectOK=false
							lIsOK=false
							lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Coverage="+lNullValue)
						}else{
							Boolean lIsMultiPlanPricingApiCoverageDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapMultiPlanPricingApiCoverageData)
							if(lIsMultiPlanPricingApiCoverageDataEmpty){
								lIsObjectOK=false
								IGNUemaHelper.printLog('lIsObjectOKCoverageCheck')
								IGNUemaHelper.printLog(lIsObjectOK)
								lIsOK=false
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Coverage="+lEmptyValue)
								Map lMapMultiPlanPricingApiIrregularityData=lMapJson.root[0].Quote[0].irregularities
								Boolean lIsMapMultiPlanPricingApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapMultiPlanPricingApiIrregularityData)
								if(lIsMapMultiPlanPricingApiIrregularityDataNull){
									lIsObjectOK=false
									lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Irregularity="+lNullValue)
								}else{
									lIsObjectOK=false
									lText=''
									String lMultiPlanPricingApiIrregularityDataErrorMessage=lMapMultiPlanPricingApiIrregularityData.ErrorMessages
									lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'ErrorMessage='+lMultiPlanPricingApiIrregularityDataErrorMessage)
									String lMultiPlanPricingApiIrregularityDataMaximumAuthorizationLevel=lMapMultiPlanPricingApiIrregularityData.MaxAuthorisationLevel
									lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'MaxAuthorisationLevel='+lEmptyValue)
									if(lText.length()>1){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lText)
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('ErrorMessageValidation',lText)
										lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lText)
									}
								}
							}else{
								for(Integer lIndex=0;lIndex<=lCoverList.size()-1;lIndex++){
									IGNUemaHelper.printLog('lCoverList')
									IGNUemaHelper.printLog(lCoverList.get(lIndex))
									String lCoverName=lCoverList.get(lIndex)
									Map lMapCoverData=lMapMultiPlanPricingApiCoverageData.get(lCoverName)
									if(IGNUemaHelper.checkObjectNullOfObject(lMapCoverData)){
										lIsObjectOK=false
										lIsOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"Cover="+lCoverName+' '+'Found'+lNullValue)
										lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lText)
									}
									List lAdditionalCoverageList=lCoverageList.get(lIndex)
									for(Integer lListIndex=0;lListIndex<=lAdditionalCoverageList.size()-1;lListIndex++){
										String lAdditionalCoverageName=lAdditionalCoverageList.get(lListIndex)
										Map lMapCoverageData=lMapMultiPlanPricingApiCoverageData.get(lAdditionalCoverageName)
										if(IGNUemaHelper.checkObjectNullOfObject(lMapCoverageData)){
											lIsObjectOK=false
											lIsOK=false
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"Coverage="+lAdditionalCoverageName+' '+'Found'+lNullValue)
											lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lText)
										}
									}
								}
								Map lMapMultiPlanPricingApiIrregularityData=lMapJson.root[0].Quote[0].irregularities
								String lStrMultiPlanPricingApiIrregularityData=lMapMultiPlanPricingApiIrregularityData.toString()
								mapPricingApiInputOutput.MultiplePlanPriceQuoteIrregularityRoot=lStrMultiPlanPricingApiIrregularityData
								Boolean lIsMapMultiPlanPricingApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapMultiPlanPricingApiIrregularityData)
								if(lIsMapMultiPlanPricingApiIrregularityDataNull){
									lIsObjectOK=false
									lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Irregularity="+lNullValue)
								}else{
									Boolean lIsMapMultiPlanPricingApiIrregularityDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapMultiPlanPricingApiCoverageData)
									if(lIsMapMultiPlanPricingApiIrregularityDataEmpty){
										lIsObjectOK=false
										lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Irregularity="+lEmptyValue)
									}else{
										lText=''
										//If Its a Negative case then the Error Message will be read from the response
										String lMultiPlanPricingApiIrregularityDataErrorMessage=lMapMultiPlanPricingApiIrregularityData.ErrorMessages
										mapPricingApiInputOutput.MultiplePlanPriceQuoteIrregularityErrorMessage=lMultiPlanPricingApiIrregularityDataErrorMessage
										Boolean lIsMultiPlanPricingApiIrregularityDataErrorMessageNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiIrregularityDataErrorMessage)
										if(lIsMultiPlanPricingApiIrregularityDataErrorMessageNull){
											lIsObjectOK=false
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"ErrorMessages="+lNullValue)
										}else{
											Boolean lIsMultiPlanPricingApiIrregularityDataErrorMessageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiIrregularityDataErrorMessage)
											if(lIsMultiPlanPricingApiIrregularityDataErrorMessageEmpty){
												lIsObjectOK=false
												lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"ErrorMessages="+lEmptyValue)
											}else{
												//Write to output
											}
										}
										String lMultiPlanPricingApiIrregularityDataMaxAuthorisationLevel=lMapMultiPlanPricingApiIrregularityData.MaxAuthorisationLevel
										mapPricingApiInputOutput.MultiplePlanPriceQuoteIrregularityMaxAuthorisarionLevel=lMultiPlanPricingApiIrregularityDataMaxAuthorisationLevel
										Boolean lIsMultiPlanPricingApiIrregularityDataMaxAuthorisationLevelNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiIrregularityDataMaxAuthorisationLevel)
										if(lIsMultiPlanPricingApiIrregularityDataMaxAuthorisationLevelNull){
											lIsObjectOK=false
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"MaxAuthorisationLevel="+lNullValue)
										}else{
											Boolean lIsMultiPlanPricingApiIrregularityDataMaxAuthorisationLevelEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiIrregularityDataMaxAuthorisationLevel)
											if(lIsMultiPlanPricingApiIrregularityDataMaxAuthorisationLevelEmpty){
												lIsObjectOK=false
												lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"MaxAuthorisationLevel="+lEmptyValue)
											}else{
												//Write to output
											}
										}
										if(lText.length()>1){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lText)
											lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lText)
										}
									}
								}
							}
						}
						/*String lMultiPlanPricingApiPolicyPaymentFrequency=lMapJson.root[0].Quote[0].Policy_Payment_Frequency
						 mapPricingApiInputOutput.MultiplePlanPriceQuotePolicyPaymentFrequency=lMultiPlanPricingApiPolicyPaymentFrequency
						 Boolean lIsMultiPlanPricingApiPolicyPaymentFrequencyNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiPolicyPaymentFrequency)
						 if(lIsMultiPlanPricingApiPolicyPaymentFrequencyNull){
						 lIsObjectOK=false
						 lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"PolicyPaymentFrequency"+lNullValue)
						}*/
						String lMultiPlanPricingApiModelName=lMapJson.root[0].Quote[0].modelName
						mapPricingApiInputOutput.MultiplePlanPriceQuoteModelName=lMultiPlanPricingApiModelName
						Boolean lIsMultiPlanPricingApiModelNameNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiModelName)
						if(lIsMultiPlanPricingApiModelNameNull){
							lIsObjectOK=false
							lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"ModelName"+lNullValue)
						}else{
							Boolean lIsMultiPlanPricingApiModelNameEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiModelName)
							if(lIsMultiPlanPricingApiModelNameEmpty){
								lIsObjectOK=false
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"ModelName="+lEmptyValue)
							}
						}
						String lMultiPlanPricingApiPricingModelVersion=lMapJson.root[0].Quote[0].pricingModelVersion
						mapPricingApiInputOutput.MultiplePlanPriceQuotePricingModelVersion=lMultiPlanPricingApiPricingModelVersion
						Boolean lIsMultiPlanPricingApiPricingModelVersionNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiPricingModelVersion)
						if(lIsMultiPlanPricingApiPricingModelVersionNull){
							lIsObjectOK=false
							lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"PricingModelVersion="+lEmptyValue)
						}else{
							Boolean lIsMultiPlanPricingApiPricingModelVersionEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiPricingModelVersion)
							if(lIsMultiPlanPricingApiPricingModelVersionEmpty){
								lIsObjectOK=false
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"PricingModelVersion="+lEmptyValue)
							}
						}
						String lMultiPlanPricingApiPolicyProductVersion=lMapJson.root[0].Quote[0].productVersionNo
						mapPricingApiInputOutput.MultiplePlanPriceQuotePolicyProductVersion=lMultiPlanPricingApiPolicyProductVersion
						Boolean lIsMultiPlanPricingApiPolicyProductVersionNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiPolicyProductVersion)
						if(lIsMultiPlanPricingApiPolicyProductVersionNull){
							lIsObjectOK=false
							lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"PolicyProductVersion="+lNullValue)
						}else{
							Boolean lIsMultiPlanPricingApiPolicyProductVersionEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiPolicyProductVersion)
							if(lIsMultiPlanPricingApiPolicyProductVersionEmpty){
								lIsObjectOK=false
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"PolicyProductVersion="+lEmptyValue)
							}
						}
						String lMultiPlanPricingApiDefaultShowPaymentFrequency=lMapJson.root[0].Quote[0].defaultShowPaymentFrequency
						mapPricingApiInputOutput.MultiplePlanPriceQuoteDefaultShowPaymentFrequency=lMultiPlanPricingApiDefaultShowPaymentFrequency
						Boolean lIsMultiPlanPricingApiDefaultShowPaymentFrequencyNull=IGNUemaHelper.checkObjectNullOfObject(lMultiPlanPricingApiDefaultShowPaymentFrequency)
						if(lIsMultiPlanPricingApiDefaultShowPaymentFrequencyNull){
							lIsObjectOK=false
							lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"DefaultShowPaymentFrequency="+lNullValue)
						}else{
							Boolean lIsMultiPlanPricingApiDefaultShowPaymentFrequencyEmpty=IGNUemaHelper.checkObjectEmptyOfString(lMultiPlanPricingApiDefaultShowPaymentFrequency)
							if(lIsMultiPlanPricingApiDefaultShowPaymentFrequencyEmpty){
								lIsObjectOK=false
								lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"DefaultShowPaymentFrequency="+lEmptyValue)
							}
						}
					}else{
						lIsObjectOK=false
						lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Quote="+lEmptyList)
					}
				}else{
					lIsObjectOK=false
					lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,"Root="+lEmptyList)
				}
				if(lVerifyMultiPlanPricingApiDetail.length()>1){
					lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('ResponseValidationError',lVerifyMultiPlanPricingApiDetail)
				}
				if(isPositiveCase){
					if(lIsObjectOK){
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Passed'
						mapPricingApiInputOutput.MultiplePlanPricingApiDetail=''
						String lMultiPlanPricingApiDetailResultMessage=this.inputGenericResultMessageA(lVerifyMultiPlanPricingApiDetail)
					}else{
						//lIsOK=false
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Failed'
						mapPricingApiInputOutput.MultiplePlanPricingApiResult=lVerifyMultiPlanPricingApiDetail.trim()
						String lMultiPlanPricingApiDetailResultMessage=this.inputGenericResultMessageB(lVerifyMultiPlanPricingApiDetail,statusCode)
					}
				}else{
					if(!lIsObjectOK){
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Passed'
						mapPricingApiInputOutput.MultiplePlanPricingApiDetail=''
						String lMultiPlanPricingApiDetailResultMessage=this.inputGenericResultMessageA(lVerifyMultiPlanPricingApiDetail)
					}else{
						//lIsOK=false
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Failed'
						mapPricingApiInputOutput.MultiplePlanPricingApiResult=lVerifyMultiPlanPricingApiDetail.trim()
						String lMultiPlanPricingApiDetailResultMessage=this.inputGenericResultMessageB(lVerifyMultiPlanPricingApiDetail,statusCode)
					}
				}
			}else{
				lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				lIsOK=false
				String lMultiPlanPricingApiDetailResultMessage=this.inputGenericResultMessageB(lVerifyMultiPlanPricingApiDetail,statusCode)
				lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyMultiPlanPricingApiDetail,lMultiPlanPricingApiDetailResultMessage)
				mapPricingApiInputOutput.MultiplePlanPricingApiResult='Failed'
				mapPricingApiInputOutput.MultiplePlanPricingApiResult=lVerifyMultiPlanPricingApiDetail.trim()
			}
			if(lVerifyMultiPlanPricingApiDetail.length()>1){
				lVerifyMultiPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('MultiplePlanApi',lVerifyMultiPlanPricingApiDetail)
			}
			lResult=lVerifyMultiPlanPricingApiDetail.length()>=0
			IGNUemaHelper.printLog('lVerifyMultiPlanPricingApiDetail')
			IGNUemaHelper.printLog(lVerifyMultiPlanPricingApiDetail)
			lVerifyMultiPlanPricingApiResult=lIsOK
			IGNUemaHelper.printLog('lVerifyMultiPlanPricingApiDetail')
			IGNUemaHelper.printLog(lVerifyMultiPlanPricingApiResult)
			if(lResult){
				lreturn.put('Result',lVerifyMultiPlanPricingApiResult)
				lreturn.put('MultiPlanPricingApiDetail',lVerifyMultiPlanPricingApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseGetPlanApi(String strProductType,String strResponseText,Integer statusCode,Map mapPricingApiInput){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lVerifyGetPlanPricingApiResult=true
		String lVerifyGetPlanPricingApiDetail=''
		String lProductType=strProductType.trim()
		try{
			lreturn.put("Result",lResult)
			if(strResponseText.length()<=0){
				return lreturn
			}
			Boolean lIsOK=true
			String lText=''
			if(statusCode==200){
				Boolean lIsObjectOK=true
				String lEmptyValue='Empty'
				String lNullValue='null'
				List lEmptyList=[]
				Map lMapJson=new JsonSlurper().parseText(strResponseText)
				Boolean lIsObjectReady=lMapJson.containsKey('root')
				if(lIsObjectReady){
					Map lMapGetPlanPricingApiQuoteData=lMapJson.root.Quote
					Boolean lIsMapGetPlanPricingApiQuoteDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanPricingApiQuoteData)
					if(!lIsMapGetPlanPricingApiQuoteDataNull){
						String lGetPlanPricingApiRewardPoint=lMapJson.root.Quote.rewardPoint
						Boolean lIsGetPlanPricingApiRewardPointNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiRewardPoint)
						if(lIsGetPlanPricingApiRewardPointNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"RewardPoint="+lNullValue)
						}
						String lGetPlanPricingApiStartDate=lMapJson.root.Quote.startDate
						Boolean lIsGetPlanPricingApiStartDateNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiStartDate)
						if(lIsGetPlanPricingApiStartDateNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"StartDate="+lNullValue)
						}else{
							Boolean lIsGetPlanPricingApiStartDateEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiStartDate)
							if(lIsGetPlanPricingApiStartDateEmpty){
								lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"StartDate="+lEmptyValue)
							}
						}
						String lGetPlanPricingApiMasterSetId=lMapJson.root.Quote.mastersetId
						Boolean lIsGetPlanPricingApiMasterSetIdNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiMasterSetId)
						if(lIsGetPlanPricingApiMasterSetIdNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"MasterSetID"+lNullValue)
						}else{
							Boolean lIsGetPlanPricingApiMasterSetIdEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiMasterSetId)
							if(lIsGetPlanPricingApiMasterSetIdEmpty){
								lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"MasterSetId"+lEmptyValue)
							}
						}
						String lGetPlanPricingApiPolicyAutoRenewalFlag=lMapJson.root.Quote.flagAutoRenewal
						Boolean lIsGetPlanPricingApiPolicyAutoRenewalFlagNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiPolicyAutoRenewalFlag)
						if(lIsGetPlanPricingApiPolicyAutoRenewalFlagNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"PolicyAutoRenewalFlag"+lNullValue)
						}else{
							Boolean lIsGetPlanPricingApiPolicyAutoRenewalFlagEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiPolicyAutoRenewalFlag)
							if(lIsGetPlanPricingApiPolicyAutoRenewalFlagEmpty){
								lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"PolicyAutoRenewalFlag"+lEmptyValue)
							}
						}
						String lGetPlanPricingApiOpportunityNumber=lMapJson.root.Quote.opportunityNumber
						Boolean lIsGetPlanPricingApiOpportunityNumberNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiOpportunityNumber)
						if(lIsGetPlanPricingApiOpportunityNumberNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"OpportunityNumber="+lNullValue)
						}
						Map lMapGetPlanPricingApiAdditionalInsuredData=lMapJson.root.Quote.additionalInsuredData
						Boolean lIsMapGetPlanPricingApiAdditionalInsuredDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanPricingApiAdditionalInsuredData)
						if(lIsMapGetPlanPricingApiAdditionalInsuredDataNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'AdditionalInsuredData='+lNullValue)
						}
						Map lMapGetPlanPricingApiPolicyHolderData=lMapJson.root.Quote.policyHolderData
						Boolean lIsMapGetPlanPricingApiPolicyHolderDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanPricingApiPolicyHolderData)
						if(lIsMapGetPlanPricingApiPolicyHolderDataNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'PolicyHolderData='+lNullValue)
						}
						if(IGNUemaHelper.checkStringContainString(lProductType,'Motor')){
							Map lMapGetPlanPricingApiVehicleData=lMapJson.root.Quote.vehicleData
							Boolean lIsMapGetPlanPricingApiVehicleDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanPricingApiVehicleData)
							String lStrGetPlanPricingApiVehicleData=lMapGetPlanPricingApiVehicleData.toString()
							if(lIsMapGetPlanPricingApiVehicleDataNull){
								lIsObjectOK=false
								lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'VehicleData='+lNullValue)
							}else{
								Boolean lIsMapGetPlanPricingApiVehicleDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapGetPlanPricingApiVehicleData)
								if(lIsMapGetPlanPricingApiVehicleDataEmpty){
									lIsObjectOK=false
									lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'VehicleData='+lEmptyValue)
								}else{
									lText=''
									String lGetPlanPricingApiPolicyEstimatedAnnualMileage=lMapGetPlanPricingApiVehicleData.yearlyMileage
									if(lGetPlanPricingApiPolicyEstimatedAnnualMileage=='[]'){
										lGetPlanPricingApiPolicyEstimatedAnnualMileage=''
									}
									Boolean lIsGetPlanPricingApiPolicyEstimatedAnnualMileageNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiPolicyEstimatedAnnualMileage)
									if(lIsGetPlanPricingApiPolicyEstimatedAnnualMileageNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"PolicyEstimatedAnnualMileage="+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiPolicyEstimatedAnnualMileageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiPolicyEstimatedAnnualMileage)
										if(lIsGetPlanPricingApiPolicyEstimatedAnnualMileageEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'PolicyEstimatedAnnualMileage='+lEmptyValue)
										}
									}
									String lGetPlanPricingApiPlanType=lMapGetPlanPricingApiVehicleData.planType
									Boolean lIsGetPlanPricingApiPlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiPlanType)
									if(lIsGetPlanPricingApiPlanTypeNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"PlanType="+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiPlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiPlanType)
										if(lIsGetPlanPricingApiPlanTypeEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'PlanType='+lEmptyValue)
										}
									}
									String lGetPlanPricingApivehicleTypeCode=lMapGetPlanPricingApiVehicleData.vehicleTypeCode
									Boolean lIsGetPlanPricingApivehicleTypeCodeNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApivehicleTypeCode)
									if(lIsGetPlanPricingApivehicleTypeCodeNull){
										lIsObjectOK=false
										lText=+IGNUemaHelper.concatMessageLeftRightByPipe(lText,'vehicleTypeCode='+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApivehicleTypeCodeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApivehicleTypeCode)
										if(lIsGetPlanPricingApivehicleTypeCodeEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'vehicleTypeCode='+lEmptyValue)
										}
									}
									String lGetPlanPricingApiVehicleInspectionRequired=lMapGetPlanPricingApiVehicleData.flagInspectionRequired
									Boolean lIsGetPlanPricingApiVehicleInspectionRequiredNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiVehicleInspectionRequired)
									if(lIsGetPlanPricingApiVehicleInspectionRequiredNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"VehicleInspectionRequired="+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiVehicleInspectionRequiredEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiVehicleInspectionRequired)
										if(lIsGetPlanPricingApiVehicleInspectionRequiredEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'VehicleInspectionRequired='+lEmptyValue)
										}
									}
									String lGetPlanPricingApiVehiclePlanType=lMapGetPlanPricingApiVehicleData.planType
									Boolean lIsGetPlanPricingApiVehiclePlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiVehiclePlanType)
									if(lIsGetPlanPricingApiVehiclePlanTypeNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"PlanType="+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiVehiclePlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiVehiclePlanType)
										if(lIsGetPlanPricingApiVehiclePlanTypeEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'PlanType='+lEmptyValue)
										}
									}
									String lGetPlanPricingApiVehicleInspectionLimit=lMapGetPlanPricingApiVehicleData.inspection_Limit
									Boolean lIsGetPlanPricingApiVehicleInspectionLimitNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiVehicleInspectionLimit)
									if(lIsGetPlanPricingApiVehicleInspectionLimitNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"VehicleInspectionLimit="+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiVehicleInspectionLimitEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiVehicleInspectionLimit)
										if(lIsGetPlanPricingApiVehicleInspectionLimitEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'VehicleInspectionLimit='+lEmptyValue)
										}
									}
									String lGetPlanPricingApiVehicleInspectionMethod=lMapGetPlanPricingApiVehicleData.inspectionMethod
									Boolean lIsGetPlanPricingApiVehicleInspectionMethodNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiVehicleInspectionMethod)
									if(lIsGetPlanPricingApiVehicleInspectionMethodNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"VehicleInspectionMethod="+lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiVehicleInspectionMethodEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiVehicleInspectionMethod)
										if(lIsGetPlanPricingApiVehicleInspectionMethodEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'VehicleInspectionMethod='+lEmptyValue)
										}
									}
									String lGetPlanPricingApiWorkshop=lMapGetPlanPricingApiVehicleData.workshopType
									Boolean lIsGetPlanPricingApiWorkshopNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanPricingApiWorkshop)
									if(lIsGetPlanPricingApiWorkshopNull){
										lIsObjectOK=false
										lText=lText+IGNUemaHelper.concatMessageLeftRightByPipe("Workshop",lNullValue)
									}else{
										Boolean lIsGetPlanPricingApiWorkshopEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanPricingApiWorkshop)
										if(lIsGetPlanPricingApiWorkshopEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'Workshop='+lEmptyValue)
										}
									}
									if(lText.length()>1){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleData',lText)
										lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,lText)
									}
								}
							}
						}
						List<String> lGetPlanPricingApiLoadingfactorList=lMapJson.root.Quote.Loading_Factors
						Boolean lIsGetPlanPricingApiLoadingfactorListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lGetPlanPricingApiLoadingfactorList)
						if(!lIsGetPlanPricingApiLoadingfactorListEmpty){
							if(lGetPlanPricingApiLoadingfactorList.size()>0){
								if(lText.length()>1){
									lText=IGNUemaHelper.concatMessageLeftRightByPipe("LoadingFactor",lText)
									lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,lText)
								}
							}
							//Assign LoadingFacto Root
						}else{
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'LoadingFactor='+lEmptyList)
						}
						def lMapGetPlanPricingApiCoverData=lMapJson.root.Quote.Covers
						String lGetlanPricingApiCoverData=lMapGetPlanPricingApiCoverData.toString()
						if(lGetlanPricingApiCoverData=='[]'){
							lGetlanPricingApiCoverData=''
						}
						Boolean lIsMapGetPlanPricingApiCoverDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanPricingApiCoverData)
						IGNUemaHelper.printLog('lMapGetPlanPricingApiCoverData')
						IGNUemaHelper.printLog(lMapGetPlanPricingApiCoverData)
						IGNUemaHelper.printLog('lStrGetPlanPricingApiCoverData')
						if(lIsMapGetPlanPricingApiCoverDataNull){
							lIsObjectOK=false
							lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'CoverData='+lNullValue)
						}else{
							Boolean lIsMapGetPlanPricingApiCoverDataEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetlanPricingApiCoverData)
							IGNUemaHelper.printLog('lIsMapGetPlanPricingApiVehicleDataEmpty')
							IGNUemaHelper.printLog(lIsMapGetPlanPricingApiCoverDataEmpty)
							if(lIsMapGetPlanPricingApiCoverDataEmpty){
								lIsObjectOK=false
								IGNUemaHelper.printLog('CoverEmpty')
								lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'CoverData='+lEmptyValue)
								Map lMapGetPlanPricingApiIrregularityData=lMapJson.root.Quote.Irregularities
								Boolean lIsMapGetPlanPricingApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanPricingApiIrregularityData)
								if(lIsMapGetPlanPricingApiIrregularityDataNull){
									lIsObjectOK=false
									lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"Irregularity="+lNullValue)
								}else{
									lIsObjectOK=false
									lText=''
									String lGetPlanPricingApiIrregularityDataErrorMessage=lMapGetPlanPricingApiIrregularityData.ErrorMessages
									lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'ErrorMessage='+lGetPlanPricingApiIrregularityDataErrorMessage)
									String lGetPlanPricingApiIrregularityDataMaximumAuthorizationLevel=lMapGetPlanPricingApiIrregularityData.MaxAuthorisationLevel
									lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'MaxAuthorisationLevel='+lGetPlanPricingApiIrregularityDataMaximumAuthorizationLevel)
									if(lText.length()>1){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lText)
										lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,lText)
									}
								}
							}else{
								//Write CoverData Response have been captured or not
							}
						}
					}else{
						lIsObjectOK=false
						lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,'Quote'+lNullValue)
					}
					if(lVerifyGetPlanPricingApiDetail.length()>1){
						lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('ResponseValidationFailed',lVerifyGetPlanPricingApiDetail)
					}
				}else{
					lIsObjectOK=false
					lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,"Root"+lEmptyList)
				}
			}else{
				lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				lIsOK=false
				String lGetPlanPricingApiDetailResultMessage=''
				lGetPlanPricingApiDetailResultMessage=this.inputGenericResultMessageB(lVerifyGetPlanPricingApiDetail,statusCode)
				lVerifyGetPlanPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanPricingApiDetail,lGetPlanPricingApiDetailResultMessage)
			}
			IGNUemaHelper.printLog('lVerifyGetPlanPricingApiDetail')
			IGNUemaHelper.printLog(lVerifyGetPlanPricingApiDetail)
			lVerifyGetPlanPricingApiResult=lIsOK
			lResult=lVerifyGetPlanPricingApiDetail.length()>=0
			if(lResult){
				lreturn.put('Result',lVerifyGetPlanPricingApiResult)
				lreturn.put('VerifyGetPlanPricingApiDetail',lVerifyGetPlanPricingApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseGetPlanWithInstallmentApi(String strProductType,String strResponseText,Integer statusCode,Map mapPricingApiInput){
		Boolean lResult=false
		Map lreturn=[:]
		Boolean lVerifyGetPlanWithInstallmentPricingApiResult=false
		String lVerifyGetPlanWithInstallmentPricingApiDetail=''
		String lProductType=strProductType.trim()
		try{
			lreturn.put("Result",lVerifyGetPlanWithInstallmentPricingApiResult)
			lreturn.put('VerifyGetPlanWithInstallmentPricingApiDetail',lVerifyGetPlanWithInstallmentPricingApiDetail)
			if(strResponseText.length()<=0){
				return lreturn
			}
			String lText=''
			Boolean lIsOK=true
			if(statusCode==200){
				Boolean lIsObjectOK=true
				Map lMapJson=new JsonSlurper().parseText(strResponseText)
				String lEmptyValue='Empty'
				String lNullValue='null'
				List lEmptyList=[]
				Boolean lIsObjectReady=lMapJson.containsKey('root')
				if(lIsObjectReady){
					Map lMapGetPlanWithInstallmentPricingApiQuoteData=lMapJson.root.Quote
					Boolean lIsMapGetPlanWithInstallmentPricingApiQuoteDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiQuoteData)
					if(!lIsMapGetPlanWithInstallmentPricingApiQuoteDataNull){
						String lGetPlanWithInstallmentPricingApiRewardPoint=lMapJson.root.Quote.reward_Point
						Boolean lIsGetPlanWithInstallmentPricingApiRewardPointNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiRewardPoint)
						if(lIsGetPlanWithInstallmentPricingApiRewardPointNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"RewardPoint="+lNullValue)
						}
						String lGetPlanWithInstallmentPricingApiStartDate=lMapJson.root.Quote.startDate
						Boolean lIsGetPlanWithInstallmentPricingApiStartDateNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiStartDate)
						if(lIsGetPlanWithInstallmentPricingApiStartDateNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"StartDate="+lNullValue)
						}else{
							Boolean lIsGetPlanWithInstallmentPricingApiStartDateEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiStartDate)
							if(lIsGetPlanWithInstallmentPricingApiStartDateEmpty){
								lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"StartDate="+lEmptyValue)
							}
						}
						String lGetPlanWithInstallmentPricingApiMasterSetId=lMapJson.root.Quote.mastersetId
						Boolean lIsGetPlanWithInstallmentPricingApiMasterSetIdNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiMasterSetId)
						if(lIsGetPlanWithInstallmentPricingApiMasterSetIdNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"MasterSetID"+lNullValue)
						}
						else{
							Boolean lIsGetPlanWithInstallmentPricingApiMasterSetIdEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiMasterSetId)
							if(lIsGetPlanWithInstallmentPricingApiMasterSetIdEmpty){
								lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"MasterSetId"+lEmptyValue)
							}
						}
						String lGetPlanWithInstallmentPricingApiSendEmailFlag=lMapJson.root.Quote.sendEmailFlag
						Boolean lIsGetPlanWithInstallmentPricingApiSendEmailFlagNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiSendEmailFlag)
						if(lIsGetPlanWithInstallmentPricingApiSendEmailFlagNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"SendEmailFlag"+lNullValue)
						}else{
							Boolean lIsGetPlanWithInstallmentPricingApiSendEmailFlagEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiSendEmailFlag)
							if(lIsGetPlanWithInstallmentPricingApiSendEmailFlagEmpty){
								lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"SendEmailFlag"+lEmptyValue)
							}
						}
						String lGetPlanWithInstallmentPricingApiProductVersionNumber=lMapJson.root.Quote.productVersionNo
						Boolean lIsGetPlanWithInstallmentPricingApiProductVersionNumberNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiProductVersionNumber)
						if(lIsGetPlanWithInstallmentPricingApiProductVersionNumberNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"ProductVersionNumber="+lNullValue)
						}else{
							Boolean lIsGetPlanWithInstallmentPricingApiProductVersionNumberEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiProductVersionNumber)
							if(lIsGetPlanWithInstallmentPricingApiProductVersionNumberEmpty){
								lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"ProductVersionNumber"+lEmptyValue)
							}
						}
						String lGetPlanWithInstallmentPricingApiOpportunityNumber=lMapJson.root.Quote.opportunityNumber
						Boolean lIsGetPlanWithInstallmentPricingApiOpportunityNumberNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiOpportunityNumber)
						if(lIsGetPlanWithInstallmentPricingApiOpportunityNumberNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"OpportunityNumber="+lNullValue)
						}
						Map lMapGetPlanWithInstallmentPricingApidditionalInsuredData=lMapJson.root.Quote.additionalInsuredData
						Boolean lIsMapGetPlanWithInstallmentPricingApiAdditionalInsuredDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApidditionalInsuredData)
						if(lIsMapGetPlanWithInstallmentPricingApiAdditionalInsuredDataNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'AdditionalInsuredData='+lNullValue)
						}
						Map lMapGetPlanWithInstallmentPricingApiPolicyHolderData=lMapJson.root.Quote.policyHolderData
						Boolean lIsMapGetPlanWithInstallmentPricingApiPolicyHolderDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiPolicyHolderData)
						if(lIsMapGetPlanWithInstallmentPricingApiPolicyHolderDataNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'PolicyHolderData='+lNullValue)
						}
						if(IGNUemaHelper.checkStringContainString(lProductType,'Motor')){
							Map lMapGetPlanWithInstallmentPricingApiVehicleData=lMapJson.root.Quote.Vehicle_Data
							Boolean lIsMapGetPlanWithInstallmentPricingApiVehicleDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiVehicleData)
							String lStrGetPlanWithInstallmentPricingApiVehicleData=lMapGetPlanWithInstallmentPricingApiVehicleData.toString()
							if(lIsMapGetPlanWithInstallmentPricingApiVehicleDataNull){
								lIsObjectOK=false
								lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'VehicleData='+lNullValue)
							}else{
								Boolean lIsMapGetPlanWithInstallmentPricingApiVehicleDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapGetPlanWithInstallmentPricingApiVehicleData)
								if(lIsMapGetPlanWithInstallmentPricingApiVehicleDataEmpty){
									lIsObjectOK=false
									lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'VehicleData='+lEmptyValue)
								}else{
									lText=''
									String lGetPlanWithInstallmentPricingApiYearlyMileage=lMapGetPlanWithInstallmentPricingApiVehicleData.yearlyMileage
									if(lGetPlanWithInstallmentPricingApiYearlyMileage=='[]'){
										lGetPlanWithInstallmentPricingApiYearlyMileage=''
									}
									Boolean lIsGetPlanWithInstallmentPricingApiYearlyMileageNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiYearlyMileage)
									if(lIsGetPlanWithInstallmentPricingApiYearlyMileageNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"YearlyMileage="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiYearlyMileageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiYearlyMileage)
										if(lIsGetPlanWithInstallmentPricingApiYearlyMileageEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'YearlyMileage='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiPlanType=lMapGetPlanWithInstallmentPricingApiVehicleData.planType
									Boolean lIsGetPlanWithInstallmentPricingApiPlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiPlanType)
									if(lIsGetPlanWithInstallmentPricingApiPlanTypeNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"PlanType="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiPlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiPlanType)
										if(lIsGetPlanWithInstallmentPricingApiPlanTypeEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'PlanType='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiUwVehicleTypeCode=lMapGetPlanWithInstallmentPricingApiVehicleData.vehicleTypeCode
									Boolean lIsGetPlanWithInstallmentPricingApiUwVehicleTypeCodeNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiUwVehicleTypeCode)
									if(lIsGetPlanWithInstallmentPricingApiUwVehicleTypeCodeNull){
										lIsObjectOK=false
										lText=+IGNUemaHelper.concatMessageLeftRightByPipe(lText,'UwVehicleTypeCode='+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiUwVehicleTypeCodeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiUwVehicleTypeCode)
										if(lIsGetPlanWithInstallmentPricingApiUwVehicleTypeCodeEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'UwVehicleTypeCode='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiVehicleInspectionRequired=lMapGetPlanWithInstallmentPricingApiVehicleData.flagInspectionRequired
									Boolean lIsGetPlanWithInstallmentPricingApiVehicleInspectionRequiredNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiVehicleInspectionRequired)
									if(lIsGetPlanWithInstallmentPricingApiVehicleInspectionRequiredNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"VehicleInspectionRequired="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiVehicleInspectionRequiredEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiVehicleInspectionRequired)
										if(lIsGetPlanWithInstallmentPricingApiVehicleInspectionRequiredEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'VehicleInspectionRequired='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiExcess=lMapGetPlanWithInstallmentPricingApiVehicleData.excess
									Boolean lIsGetPlanWithInstallmentPricingApiExcessNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiExcess)
									if(lIsGetPlanWithInstallmentPricingApiExcessNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"Excess="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiExcessEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiExcess)
										if(lIsGetPlanWithInstallmentPricingApiExcessEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'Excess='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiVehicleInspectionLimit=lMapGetPlanWithInstallmentPricingApiVehicleData.inspectionLimit
									Boolean lIsGetPlanWithInstallmentPricingApiVehicleInspectionLimitNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiVehicleInspectionLimit)
									if(lIsGetPlanWithInstallmentPricingApiVehicleInspectionLimitNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"VehicleInspectionLimit="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiVehicleInspectionLimitEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiVehicleInspectionLimit)
										if(lIsGetPlanWithInstallmentPricingApiVehicleInspectionLimitEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'VehicleInspectionLimit='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiVehicleInspectionMethod=lMapGetPlanWithInstallmentPricingApiVehicleData.inspection_Method
									Boolean lIsGetPlanWithInstallmentPricingApiVehicleInspectionMethodNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiVehicleInspectionMethod)
									if(lIsGetPlanWithInstallmentPricingApiVehicleInspectionMethodNull){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"VehicleInspectionMethod="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiVehicleInspectionMethodEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiVehicleInspectionMethod)
										if(lIsGetPlanWithInstallmentPricingApiVehicleInspectionMethodEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'VehicleInspectionMethod='+lEmptyValue)
										}
									}
									String lGetPlanWithInstallmentPricingApiWorkshop=lMapGetPlanWithInstallmentPricingApiVehicleData.workShopType
									Boolean lIsGetPlanWithInstallmentPricingApiWorkshopNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiWorkshop)
									if(lIsGetPlanWithInstallmentPricingApiWorkshopNull){
										lIsObjectOK=false
										lText=lText+IGNUemaHelper.concatMessageLeftRightByPipe("Workshop",lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiWorkshopEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiWorkshop)
										if(lIsGetPlanWithInstallmentPricingApiWorkshopEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'Workshop='+lEmptyValue)
										}
									}
									if(lText.length()>1){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleData',lText)
										lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,lText)
									}
								}
							}
						}
						List<String> lGetPlanWithInstallmentPricingApiLoadingfactorList=lMapJson.root.Quote.Loading_Factors
						Boolean lIsGetPlanWithInstallmentPricingApiLoadingfactorListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lGetPlanWithInstallmentPricingApiLoadingfactorList)
						if(!lIsGetPlanWithInstallmentPricingApiLoadingfactorListEmpty){
						}else{
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'LoadingFactor='+lEmptyList)
						}
						def lMapGetPlanWithInstallmentPricingApiCoverData=lMapJson.root.Quote.Covers
						String lStrGetPlanWithInstallmentPricingApiCoverData=lMapGetPlanWithInstallmentPricingApiCoverData.toString()
						if(lStrGetPlanWithInstallmentPricingApiCoverData=='[]'){
							lStrGetPlanWithInstallmentPricingApiCoverData=''
						}
						Boolean lIsMapGetPlanWithInstallmentPricingApiCoverDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiCoverData)
						if(lIsMapGetPlanWithInstallmentPricingApiCoverDataNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'CoverData='+lNullValue)
						}else{
							Boolean lIsGetPlanWithInstallmentPricingApiCoverDataEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrGetPlanWithInstallmentPricingApiCoverData)
							if(lIsGetPlanWithInstallmentPricingApiCoverDataEmpty){
								lIsObjectOK=false
								IGNUemaHelper.printLog('CoverEmpty')
								lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'CoverData='+lEmptyValue)
								Map lMapGetPlanWithInstallmentPricingApiIrregularityData=lMapJson.root.Quote.Irregularities
								Boolean lIsMapGetPlanWithInstallmentPricingApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiIrregularityData)
								if(lIsMapGetPlanWithInstallmentPricingApiIrregularityDataNull){
									lIsObjectOK=false
									lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"Irregularity="+lNullValue)
								}else{
									lIsObjectOK=false
									lText=''
									String lGetPlanWithInstallmentPricingApiIrregularityDataErrorMessage=lMapGetPlanWithInstallmentPricingApiIrregularityData.ErrorMessages
									lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'ErrorMessage='+lGetPlanWithInstallmentPricingApiIrregularityDataErrorMessage)
									String lGetPlanWithInstallmentPricingApiIrregularityDataMaximumAuthorizationLevel=lMapGetPlanWithInstallmentPricingApiIrregularityData.MaxAuthorisationLevel
									lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'MaxAuthorisationLevel='+lGetPlanWithInstallmentPricingApiIrregularityDataMaximumAuthorizationLevel)
									if(lText.length()>1){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lText)
										lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,lText)
									}
								}
							}else{
								//If Its a Negative case then the Error Message will be read from the response
								Map lMapGetPlanWithInstallmentPricingApiIrregularityData=lMapJson.root.Quote.Irregularities
								Boolean lIsMapGetPlanWithInstallmentPricingApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiIrregularityData)
								if(lIsMapGetPlanWithInstallmentPricingApiIrregularityDataNull){
									lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"Irregularity="+lNullValue)
								}else{
									String lGetPlanWithInstallmentPricingApiIrregularityDataErrorMessage=lMapGetPlanWithInstallmentPricingApiIrregularityData.ErrorMessages
									Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataErrorMessageNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiIrregularityDataErrorMessage)
									if(lIsGetPlanWithInstallmentPricingApiIrregularityDataErrorMessageNull){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"ErrorMessages="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataErrorMessageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiIrregularityDataErrorMessage)
										if(lIsGetPlanWithInstallmentPricingApiIrregularityDataErrorMessageEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"ErrorMessages="+lEmptyValue)
										}else{
											//Write to output
										}
									}
									String lGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevel=lMapGetPlanWithInstallmentPricingApiIrregularityData.MaxAuthorisationLevel
									Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevelNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevel)
									if(lIsGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevelNull){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"MaxAuthorisationLevel="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevelEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevel)
										if(lIsGetPlanWithInstallmentPricingApiIrregularityDataMaxAuthorisationLevelEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"MaxAuthorisationLevel="+lEmptyValue)
										}else{
											//Write to output
										}
									}
									String lGetPlanWithInstallmentPricingApiIrregularityDataValidation=lMapGetPlanWithInstallmentPricingApiIrregularityData.Data_Validation
									Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataValidationNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiIrregularityDataValidation)
									if(lIsGetPlanWithInstallmentPricingApiIrregularityDataValidationNull){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"DataValidation="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataValidationEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiIrregularityDataValidation)
										if(lIsGetPlanWithInstallmentPricingApiIrregularityDataValidationEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"DataValidation="+lEmptyValue)
										}else{
											//Write to output
										}
									}
									String lGetPlanWithInstallmentPricingApiIrregularityDataResult=lMapGetPlanWithInstallmentPricingApiIrregularityData.Result
									Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataResultNull=IGNUemaHelper.checkObjectNullOfObject(lGetPlanWithInstallmentPricingApiIrregularityDataResult)
									if(lIsGetPlanWithInstallmentPricingApiIrregularityDataResultNull){
										lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"Result="+lNullValue)
									}else{
										Boolean lIsGetPlanWithInstallmentPricingApiIrregularityDataResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPlanWithInstallmentPricingApiIrregularityDataResult)
										if(lIsGetPlanWithInstallmentPricingApiIrregularityDataResultEmpty){
											lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,"Result="+lEmptyValue)
										}else{
											//Write to output
										}
									}
									if(lText.length()>1){
										lIsObjectOK=false
										lText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lText)
										lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,lText)
									}
								}
							}
						}
						Map lMapGetPlanWithInstallmentPricingApiPaymentDetail=lMapJson.root.Quote.paymentData
						Boolean lIsGetPlanWithInstallmentPricingApiPaymentDetailNull=IGNUemaHelper.checkObjectNullOfObject(lMapGetPlanWithInstallmentPricingApiPaymentDetail)
						if(lIsGetPlanWithInstallmentPricingApiPaymentDetailNull){
							lIsObjectOK=false
							lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'PaymentDetail='+lNullValue)
						}
					}else{
						lIsObjectOK=false
						lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,'Quote'+lNullValue)
					}
				}else{
					lIsObjectOK=false
					lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,"Root"+lEmptyList)
				}
				if(lVerifyGetPlanWithInstallmentPricingApiDetail.length()>1){
					lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('ResponseValidationFailed',lVerifyGetPlanWithInstallmentPricingApiDetail)
				}
			}else{
				lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				lIsOK=false
				String lVerifyGetPlanWithInstallmentPricingApiResultMessage=this.inputGenericResultMessageB(lVerifyGetPlanWithInstallmentPricingApiDetail,0)
				lVerifyGetPlanWithInstallmentPricingApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lVerifyGetPlanWithInstallmentPricingApiDetail,lVerifyGetPlanWithInstallmentPricingApiResultMessage)
			}
			lResult=lVerifyGetPlanWithInstallmentPricingApiDetail.length()>=0
			lVerifyGetPlanWithInstallmentPricingApiResult=lIsOK
			if(lResult){
				lreturn.put("Result",lVerifyGetPlanWithInstallmentPricingApiResult)
				lreturn.put('VerifyGetPlanWithInstallmentPricingApiDetail',lVerifyGetPlanWithInstallmentPricingApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getValueFromExcelSheetForValidation(Sheet targetSheet,Integer integerRowNumber,Integer integerColumnNumber){
		String lreturn=''
		Boolean lResult=false
		Integer lRowNumber=integerRowNumber
		Integer lColumnNumber=integerColumnNumber
		try{
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				IGNUemaHelper.printLog('PricingApi Generic  Sheet not valid')
				return lreturn
			}
			String lCellValue=''
			Sheet lPricingApiSheet=targetSheet
			Row lCurrentRow=lPricingApiSheet.getRow(lRowNumber)
			Cell lCell=lCurrentRow.getCell(lColumnNumber)
			CellType lCellType=lCell.getCellTypeEnum()
			if(!IGNUemaHelper.checkObjectNullOfObject(lCell)){
				if((lCellType==CellType.NUMERIC)){
					Double lValue=lCell.getNumericCellValue()
					if(DateUtil.isCellDateFormatted(lCell)){
						Date lDate=new Date()
						lDate=lCell.getDateCellValue()
						IGNUemaHelper.printLog('FDinds Date')
						IGNUemaHelper.printLog(lDate)
						String lDateFormat='yyyy-MM-dd'
						String lDateString=lDate.format(lDateFormat)
						IGNUemaHelper.printLog(lDateString)
						lCellValue=lDateString
					}else{
						lCellValue=ExcelKeywords.getCellByIndex(lPricingApiSheet,lRowNumber,lColumnNumber)
					}
				}else{
					lCellValue=ExcelKeywords.getCellByIndex(lPricingApiSheet,lRowNumber,lColumnNumber)
				}
			}
			lResult=lCellValue.length()>1
			if(lResult){
				lreturn=lCellValue
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean validateAdditionalCoveragePremiumInGetPlanAndGetPlanWithInstallmentPriceResult(Sheet targetSheet,String strTransactionType,String strProductType,String strGetPlanResponse,String strGetPlanWithInstallmentResponse,List strCoverList,List strCoverageList,Map mapPricingApiLibrayInputOutput,List numAdditionalCoveragePremiumWithoutLoadingList,List numAdditionalCoveragePremiumWithLoadingList,List mapPremiumValidationResultList){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
			return lreturn
		}
		Sheet lTargetSheet=targetSheet
		if(IGNUemaHelper.checkObjectEmptyOfString(strTransactionType)){
			return lreturn
		}
		String lTransactionType=strTransactionType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strProductType)){
			return lreturn
		}
		String lProductType=strProductType
		if(IGNUemaHelper.checkObjectEmptyOfString(strGetPlanResponse)){
			return lreturn
		}
		String lGetPlanResponse=strGetPlanResponse.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strGetPlanWithInstallmentResponse)){
			return lreturn
		}
		String lGetPlanWithInstallmentResponse=strGetPlanWithInstallmentResponse.trim()
		if(IGNUemaHelper.checkObjectEmptyOfList(strCoverList)){
			return lreturn
		}
		List lCoverList=strCoverList
		if(IGNUemaHelper.checkObjectEmptyOfList(strCoverageList)){
			return lreturn
		}
		List lCoverageList=strCoverageList
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiLibrayInputOutput)){
			return lreturn
		}
		Map lPricingApiLibrayInputOutput=mapPricingApiLibrayInputOutput
		if(IGNUemaHelper.checkObjectEmptyOfList(numAdditionalCoveragePremiumWithoutLoadingList)){
			return lreturn
		}
		List lNumAdditionalCoveragePremiumWithoutLoadingList=numAdditionalCoveragePremiumWithoutLoadingList
		if(IGNUemaHelper.checkObjectEmptyOfList(numAdditionalCoveragePremiumWithLoadingList)){
			return lreturn
		}
		List lNumAdditionalCoveragePremiumWithLoadingList=numAdditionalCoveragePremiumWithLoadingList
		if(IGNUemaHelper.checkObjectEmptyOfList(mapPremiumValidationResultList)){
			return lreturn
		}
		List lMapPremiumValidationResultList=mapPremiumValidationResultList
		try{
			List lNumLibraryAdditionalCoveragePremiumWithoutLoadingList=lPricingApiLibrayInputOutput.PricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList
			if(IGNUemaHelper.checkObjectEmptyOfList(lNumLibraryAdditionalCoveragePremiumWithoutLoadingList)){
				return lreturn
			}
			List lNumLibraryAdditionalCoveragePremiumWithLoadingList=lPricingApiLibrayInputOutput.PricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList
			if(IGNUemaHelper.checkObjectEmptyOfList(lNumLibraryAdditionalCoveragePremiumWithLoadingList)){
				return lreturn
			}
			List lLibraryAdditionalCoverageNameList=lPricingApiLibrayInputOutput.PricingApiLibraryGetPlanPriceAdditionalCoverageNameList
			if(IGNUemaHelper.checkObjectEmptyOfList(lLibraryAdditionalCoverageNameList)){
				return lreturn
			}
			Boolean lIsAdditionalCoveragePremiumMatchedValidationResultOK=true
			Map lMapJsonGetPlanResponse=new JsonSlurper().parseText(lGetPlanResponse)
			Map lMapJsonGetPlanWithInstallmentResponse=new JsonSlurper().parseText(lGetPlanWithInstallmentResponse)
			String lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage=''
			String lAdditionalCoveragePremiumWithLoadingValidationResultMessage=''
			String lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage=''
			String lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage=''
			IGNUemaHelper.printLog(lCoverList)
			IGNUemaHelper.printLog(lCoverageList)
			List lGetPlanWithInstallmentCoverList=lMapJsonGetPlanWithInstallmentResponse.covers
			for(Integer lIndex=0;lIndex<=lCoverList.size()-1;lIndex++){
				List lCurrentCoverageList=lCoverageList.get(lIndex)
				List lCurrentLibraryCoverageList=lLibraryAdditionalCoverageNameList.get(lIndex)
				String lCover=lCoverList.get(lIndex)
				Map lMapGetPlanWithInstallmentCoverData=lGetPlanWithInstallmentCoverList.get(lIndex)
				Map lMapAdditionalCoveragePremiumValidationResultMessage=lMapPremiumValidationResultList.get(lIndex)
				List lCurrentAdditionalCoveragePremiumWithoutLoadingList=lNumAdditionalCoveragePremiumWithoutLoadingList.get(lIndex)
				List lCurrentAdditionalCoveragePremiumWithLoadingList=lNumAdditionalCoveragePremiumWithLoadingList.get(lIndex)
				List lCurrentLibraryAdditionalCoveragePremiumWithoutLoadingList=lNumLibraryAdditionalCoveragePremiumWithoutLoadingList.get(lIndex)
				List lCurrentLibraryAdditionalCoveragePremiumWithLoadingList=lNumLibraryAdditionalCoveragePremiumWithLoadingList.get(lIndex)
				if(lMapGetPlanWithInstallmentCoverData.Code==lCover){
					List lGetPlanWithInstallmentCoverageList=lMapGetPlanWithInstallmentCoverData.coverages
					for(Integer lCoverageIndex=0;lCoverageIndex<=lCurrentCoverageList.size()-1;lCoverageIndex++){
						Map lMapGetPlanCoverData=lMapJsonGetPlanResponse.root.Quote.Covers.get(lCover)
						Map lMapGetPlanWithInstallmentCoverageData=lGetPlanWithInstallmentCoverageList.get(lCoverageIndex)
						String lCoverageName=lCurrentCoverageList.get(lCoverageIndex)
						String lCoverageIndexValue=IDNPricingApiHelper.getPricingCoverageIndexValue(strProductType,lCoverageName)
						String lAdditionalCoverageName='additionalCoveragePremium'+lCoverageIndexValue
						String lAdditionalCoveragePremiumWithoutLoading=lMapGetPlanCoverData.get(lAdditionalCoverageName)
						String lAdditionalCoveragePremiumWithLoading=lMapGetPlanWithInstallmentCoverData.get(lAdditionalCoverageName)
						Float lGetPlanAdditionalCoverage=IGNUemaHelper.convertStringToFloat(lAdditionalCoveragePremiumWithoutLoading,0.0)
						Float lGetPlanWithInstallmentAdditionalCoverage=IGNUemaHelper.convertStringToFloat(lAdditionalCoveragePremiumWithLoading,0.0)
						Integer lLibraryCoveragePremiumIndex=lCurrentLibraryCoverageList.indexOf(lCoverageName)
						String lLibraryAdditionalCoverageWithoutLoading=lCurrentLibraryAdditionalCoveragePremiumWithoutLoadingList.get(lLibraryCoveragePremiumIndex)
						String lLibraryAdditionalCoverageWithLoading=lCurrentLibraryAdditionalCoveragePremiumWithLoadingList.get(lLibraryCoveragePremiumIndex)
						Float lNumLibraryAdditionalCoverageWithoutLoading=IGNUemaHelper.convertStringToFloat(lLibraryAdditionalCoverageWithoutLoading,0.0)
						Float lNumLibraryAdditionalCoverageWithLoading=IGNUemaHelper.convertStringToFloat(lLibraryAdditionalCoverageWithLoading,0.0)
						Float lAdditionalCoverageWithoutLoading=lCurrentAdditionalCoveragePremiumWithoutLoadingList.get(lCoverageIndex)
						Float lAdditionalCoverageWithLoading=lCurrentAdditionalCoveragePremiumWithLoadingList.get(lCoverageIndex)
						IGNUemaHelper.printLog('lAdditionalCoverageWithLoading')
						IGNUemaHelper.printLog(lAdditionalCoverageWithLoading)
						IGNUemaHelper.printLog('lAdditionalCoverageWithLoading-Library')
						IGNUemaHelper.printLog(lLibraryAdditionalCoverageWithoutLoading)
						IGNUemaHelper.printLog(lLibraryAdditionalCoverageWithLoading)
						Float lRoundAdditionalCoverageWithLoading=Math.ceil(lAdditionalCoverageWithLoading)
						Float lRoundLibraryAdditionalCoverageWithLoading=Math.ceil(lNumLibraryAdditionalCoverageWithLoading)
						if(lTransactionType=='New Biz'){
							if(lGetPlanAdditionalCoverage!=lAdditionalCoverageWithoutLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lCoverageName+' '+lAdditionalCoverageWithoutLoading,'GetPlanApiAdditionalCoveragePremium'+lGetPlanAdditionalCoverage)
								lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage,lMessageText)
							}
							if(lGetPlanWithInstallmentAdditionalCoverage!=lRoundAdditionalCoverageWithLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lCoverageName+' '+lRoundAdditionalCoverageWithLoading,'GetPlanWithInstallmentApiAdditionalCoveragePremium'+lGetPlanWithInstallmentAdditionalCoverage)
								lAdditionalCoveragePremiumWithLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionalCoveragePremiumWithLoadingValidationResultMessage,lMessageText)
							}
							if(lGetPlanAdditionalCoverage!=lNumLibraryAdditionalCoverageWithoutLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryCalculationAdditionalCoveragePremium'+lCoverageName+' '+lLibraryAdditionalCoverageWithoutLoading,'GetPlanApiAdditionalCoveragePremium'+lGetPlanAdditionalCoverage)
								lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage,lMessageText)
							}
							if(lGetPlanWithInstallmentAdditionalCoverage!=lRoundLibraryAdditionalCoverageWithLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryCalculationAdditionalCoveragePremium'+lCoverageName+' '+lRoundLibraryAdditionalCoverageWithLoading,'GetPlanWithInstallmentApiAdditionalCoveragePremium'+lGetPlanWithInstallmentAdditionalCoverage)
								lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage,lMessageText)
							}
						}else{
							if(lGetPlanAdditionalCoverage!=lRoundAdditionalCoverageWithLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lCoverageName+' '+lRoundAdditionalCoverageWithLoading,'GetPlanApiAdditionalCoveragePremium'+lGetPlanAdditionalCoverage)
								lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage,lMessageText)
							}
							if(lGetPlanWithInstallmentAdditionalCoverage!=lRoundAdditionalCoverageWithLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lCoverageName+' '+lRoundAdditionalCoverageWithLoading,'GetPlanWithInstallmentApiAdditionalCoveragePremium'+lGetPlanWithInstallmentAdditionalCoverage)
								lAdditionalCoveragePremiumWithLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionalCoveragePremiumWithLoadingValidationResultMessage,lMessageText)
							}
							if(lGetPlanAdditionalCoverage!=lRoundLibraryAdditionalCoverageWithLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryCalculationAdditionalCoveragePremium'+lCoverageName+' '+lRoundLibraryAdditionalCoverageWithLoading,'GetPlanApiAdditionalCoveragePremium'+lGetPlanAdditionalCoverage)
								lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage,lMessageText)
							}
							if(lGetPlanWithInstallmentAdditionalCoverage!=lRoundLibraryAdditionalCoverageWithLoading){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lCoverageName+' '+lRoundLibraryAdditionalCoverageWithLoading,'GetPlanWithInstallmentApiAdditionalCoveragePremium'+lGetPlanWithInstallmentAdditionalCoverage)
								lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage,lMessageText)
							}
						}
					}
				}
				if(!IGNUemaHelper.checkObjectEmptyOfString(lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage)){
					Map lMapGetPlanPremiumResultValidationResultMessage=lMapAdditionalCoveragePremiumValidationResultMessage.GetPlanPriceValidationTestResult
					Integer lGetPlanPremiumResultValidationResultMessageRowNumber=lMapGetPlanPremiumResultValidationResultMessage.RowNumber
					Integer lGetPlanPremiumResultValidationResultMessageColumnNumber=lMapGetPlanPremiumResultValidationResultMessage.ColumnNumber
					Boolean lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK=inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lGetPlanPremiumResultValidationResultMessageRowNumber,lGetPlanPremiumResultValidationResultMessageColumnNumber,lAdditionalCoveragePremiumWithoutLoadingValidationResultMessage)
					if(!lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK){
						return lreturn
					}
				}
				if(!IGNUemaHelper.checkObjectEmptyOfString(lAdditionalCoveragePremiumWithLoadingValidationResultMessage)){
					Map lMapGetPlanWithInstallmentPremiumResultValidationResultMessage=lMapAdditionalCoveragePremiumValidationResultMessage.GetPlanWithInstallmentPriceValidationTestResult
					Integer lGetPlanWithInstallmentPremiumResultValidationResultMessageRowNumber=lMapGetPlanWithInstallmentPremiumResultValidationResultMessage.RowNumber
					Integer lGetPlanWithInstallmentPremiumResultValidationResultMessageColumnNumber=lMapGetPlanWithInstallmentPremiumResultValidationResultMessage.ColumnNumber
					Boolean lIsInputGetPlanWithInstallmentWithPremiumResultValidationResultMessageIntoTheSheetOK=inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lGetPlanWithInstallmentPremiumResultValidationResultMessageRowNumber,lGetPlanWithInstallmentPremiumResultValidationResultMessageColumnNumber,lAdditionalCoveragePremiumWithLoadingValidationResultMessage)
					if(!lIsInputGetPlanWithInstallmentWithPremiumResultValidationResultMessageIntoTheSheetOK){
						return lreturn
					}
				}
				if(!IGNUemaHelper.checkObjectEmptyOfString(lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage)){
					Map lMapLibraryGetPlanPremiumResultValidationResultMessage=lMapAdditionalCoveragePremiumValidationResultMessage.LibraryGetPlanWithPriceValidationTestResult
					Integer lLibraryGetPlanPremiumResultValidationResultMessageRowNumber=lMapLibraryGetPlanPremiumResultValidationResultMessage.RowNumber
					Integer lLibraryGetPlanPremiumResultValidationResultMessageColumnNumber=lMapLibraryGetPlanPremiumResultValidationResultMessage.ColumnNumber
					Boolean lIsInputLibraryGetPlanPremiumResultValidationResultMessageIntoTheSheetOK=inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lLibraryGetPlanPremiumResultValidationResultMessageRowNumber,lLibraryGetPlanPremiumResultValidationResultMessageColumnNumber,lLibraryAdditionalCoveragePremiumWithoutLoadingValidationResultMessage)
					if(!lIsInputLibraryGetPlanPremiumResultValidationResultMessageIntoTheSheetOK){
						return lreturn
					}
				}
				if(!IGNUemaHelper.checkObjectEmptyOfString(lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage)){
					Map lMapLibraryGetPlanWithInstallmentPremiumResultValidationResultMessage=lMapAdditionalCoveragePremiumValidationResultMessage.LibraryGetPlanWithInstallmentPriceValidationTestResult
					Integer lLibraryGetPlanWithInstallmentPremiumResultValidationResultMessageRowNumber=lMapLibraryGetPlanWithInstallmentPremiumResultValidationResultMessage.RowNumber
					Integer lLibraryGetPlanWithInstallmentPremiumResultValidationResultMessageColumnNumber=lMapLibraryGetPlanWithInstallmentPremiumResultValidationResultMessage.ColumnNumber
					Boolean lIsInputLibraryGetPlanWithInstallmentPremiumResultValidationResultMessageIntoTheSheetOK=inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lLibraryGetPlanWithInstallmentPremiumResultValidationResultMessageRowNumber,lLibraryGetPlanWithInstallmentPremiumResultValidationResultMessageColumnNumber,lLibraryAdditionalCoveragePremiumWithLoadingValidationResultMessage)
					if(!lIsInputLibraryGetPlanWithInstallmentPremiumResultValidationResultMessageIntoTheSheetOK){
						return lreturn
					}
				}
			}
			IGNUemaHelper.printLog('lIsAdditionalCoveragePremiumMatchedValidationResultOK')
			IGNUemaHelper.printLog(lIsAdditionalCoveragePremiumMatchedValidationResultOK)
			lResult=lIsAdditionalCoveragePremiumMatchedValidationResultOK
			if(lResult){
				lreturn=true
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean validateGetPlanPricingApiResult(Sheet targetSheet,String strTransactionType,Float numAnnualNetPremiumWithoutLoading,List strPricingApiTransactionList,List strCoverList,Map mapPricingApiLibrayInputOutput,List strPricingApiJsonTotalPremiumList,String strGetPlanResponse,String strGetPlanWithInstallmentResponse,String strPaymentFrequency,String strGetPlanApiRequest,String strGetPlanWithInstallmentRequest,Map mapTotalInstallmentAndDownPaymentAmount){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfList(strPricingApiTransactionList)){
			return lreturn
		}
		List lSelectedPricingApiTransactionList=strPricingApiTransactionList
		if(IGNUemaHelper.checkObjectEmptyOfList(strCoverList)){
			return lreturn
		}
		List lCoverList=strCoverList
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiLibrayInputOutput)){
			return lreturn
		}
		Map lPricingApiLibrayInputOutput=mapPricingApiLibrayInputOutput
		if(IGNUemaHelper.checkObjectEmptyOfList(strPricingApiJsonTotalPremiumList)){
			return lreturn
		}
		List lPricingApiJsonTotalPremiumList=strPricingApiJsonTotalPremiumList
		if(IGNUemaHelper.checkObjectEmptyOfString(strGetPlanResponse)){
			return lreturn
		}
		String lGetPlanResponse=strGetPlanResponse.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTransactionType)){
			return lreturn
		}
		String lTransactionType=strTransactionType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strGetPlanWithInstallmentResponse)){
			return lreturn
		}
		String lGetPlanWithInstallmentResponse=strGetPlanWithInstallmentResponse.trim()
		if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
			return lreturn
		}
		Sheet lTargetSheet=targetSheet
		if(IGNUemaHelper.checkObjectEmptyOfString(strPaymentFrequency)){
			return lreturn
		}
		String lPaymentFrequency=strPaymentFrequency
		if(IGNUemaHelper.checkObjectEmptyOfString(strGetPlanApiRequest)){
			return lreturn
		}
		String lGetPlanApiRequest=strGetPlanApiRequest
		if(IGNUemaHelper.checkObjectEmptyOfString(strGetPlanWithInstallmentRequest)){
			return lreturn
		}
		String lGetPlanWithInstallmentRequest=strGetPlanWithInstallmentRequest
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapTotalInstallmentAndDownPaymentAmount)){
			return lreturn
		}
		Map lMapTotalInstallmentAndDownPaymentAmount=mapTotalInstallmentAndDownPaymentAmount
		Float lAnnualNetPremiumWithoutLoading=numAnnualNetPremiumWithoutLoading
		try{
			Boolean lIsPremiumMatchedValidationResultOK=true
			Map lMapJsonGetPlanResponse=new JsonSlurper().parseText(lGetPlanResponse)
			Map lMapJsonGetPlanWithInstallmentResponse=new JsonSlurper().parseText(lGetPlanWithInstallmentResponse)
			Float lTotalPremiumValue=0.0
			Float lTotalPolicyGrossPremiumValue=0.0
			Float lTotalInstallmentAmount=0.0
			Float lLibraryTotalInstallmentAmount=0.0
			Float lLibraryGetPlanPriceTotalInstallmentAmount=0.0
			Float lLibraryGetPlanWithInstallmentPriceTotalInstallmentAmount=0.0
			Float lLibraryGetPlanPriceTotalDownPaymentAmount=0.0
			Float lLibraryGetPlanWithInstallmentPriceTotalDownPaymentAmount=0.0
			String lPremiumValidationGetPlanPriceResultMessage=''
			String lPremiumValidationGetPlanWithInstallmentPriceResultMessage=''
			String lLibraryGetPlanPriceTotalPremium=lPricingApiLibrayInputOutput.PricingApiLibraryGetPlanPriceTotalPremium
			String lLibraryGetPlanWithInstallmentPriceTotalPremium=lPricingApiLibrayInputOutput.PricingApiLibraryGetPlanWithInstallmentPriceTotalPremium
			IGNUemaHelper.printLog('lSelectedPricingApiTransactionList.size()')
			IGNUemaHelper.printLog(lSelectedPricingApiTransactionList.size())
			IGNUemaHelper.printLog(lSelectedPricingApiTransactionList)
			IGNUemaHelper.printLog(lCoverList)
			List lMapCoverDataList=lMapJsonGetPlanResponse.covers
			List lMapGetPlanWithInstallmentCoverDataList=lMapJsonGetPlanWithInstallmentResponse.covers
			for(Integer lGetCellIndex=0;lGetCellIndex<=lSelectedPricingApiTransactionList.size()-1;lGetCellIndex++){
				String lCoverName=lCoverList.get(lGetCellIndex)
				Map lMapCoverData=lMapCoverDataList.get(lGetCellIndex)
				Map lMapGetPlanWithInstallmentCoverData=lMapGetPlanWithInstallmentCoverDataList.get(lGetCellIndex)
				if(lMapCoverData.Code==lCoverName){
					Map lMapPricingApiTransactionNetPremium=lSelectedPricingApiTransactionList.get(lGetCellIndex).TransactionNetPremium
					Integer lTransactionNetPremiumRowNumber=lMapPricingApiTransactionNetPremium.RowNumber
					Integer lTransactionNetPremiumColumnNumber=lMapPricingApiTransactionNetPremium.ColumnNumber
					String lTransactionNetPremium=this.getValueFromExcelSheetForValidation(lTargetSheet,lTransactionNetPremiumRowNumber,lTransactionNetPremiumColumnNumber)
					String lGetPlanResponseTransactionNetPremium=lMapCoverData.transNetPremium
					String lGetPlanWithInstallmentTransactionNetPremium=lMapGetPlanWithInstallmentCoverData.transNetPremium
					IGNUemaHelper.printLog('lTransactionNetPremium')
					IGNUemaHelper.printLog(lTransactionNetPremium)
					Float lTransactionNetPremiumNum=IGNUemaHelper.convertStringToFloat(lTransactionNetPremium,0.0)
					Float lGetPlanResponseTransactionNetPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponseTransactionNetPremium,0.0)
					Float lGetPlanWithInstallmentResponseTransactionNetPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentTransactionNetPremium,0.0)
					if(lTransactionType=='New Biz'){
						if(lAnnualNetPremiumWithoutLoading!=lGetPlanResponseTransactionNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionNetPremium'+lAnnualNetPremiumWithoutLoading,'GetPlanApiTransactionNetPremium'+lGetPlanResponseTransactionNetPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lTransactionNetPremiumNum!=lGetPlanWithInstallmentResponseTransactionNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionNetPremium'+lTransactionNetPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTransactionNetPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					else{
						IGNUemaHelper.printLog('lEndorsementValidation')
						IGNUemaHelper.printLog(lTransactionNetPremium)
						if(lTransactionNetPremiumNum!=lGetPlanResponseTransactionNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionNetPremium'+lTransactionNetPremiumNum,'GetPlanApiTransactionNetPremium'+lGetPlanResponseTransactionNetPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lTransactionNetPremiumNum!=lGetPlanWithInstallmentResponseTransactionNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionNetPremium'+lTransactionNetPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTransactionNetPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					Map lMapPricingApiAnnualNetPremium=lSelectedPricingApiTransactionList.get(lGetCellIndex).AnnualNetPremium
					Integer lAnnualNetPremiumRowNumber=lMapPricingApiAnnualNetPremium.RowNumber
					Integer lAnnualNetPremiumColumnNumber=lMapPricingApiAnnualNetPremium.ColumnNumber
					String lAnnualNetPremium=getValueFromExcelSheetForValidation(lTargetSheet,lAnnualNetPremiumRowNumber,lAnnualNetPremiumColumnNumber)
					String lGetPlanResponseAnnualNetPremium=lMapCoverData.annualNetPremium
					String lGetPlanWithInstallmentAnnualNetPremium=lMapGetPlanWithInstallmentCoverData.annualNetPremium
					Float lAnnualNetPremiumNum=IGNUemaHelper.convertStringToFloat(lAnnualNetPremium,0.0)
					Float lGetPlanResponseAnnualNetPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponseAnnualNetPremium,0.0)
					Float lGetPlanWithInstallmentResponseAnnualNetPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentAnnualNetPremium,0.0)
					if(lTransactionType=='New Biz'){
						if(lAnnualNetPremiumWithoutLoading!=lGetPlanResponseAnnualNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualNetPremium'+lAnnualNetPremiumWithoutLoading,'GetPlanApiAnnualNetPremium'+lGetPlanResponseAnnualNetPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lAnnualNetPremiumNum!=lGetPlanWithInstallmentResponseAnnualNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualNetPremium'+lAnnualNetPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseAnnualNetPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					else{
						if(lAnnualNetPremiumNum!=lGetPlanResponseAnnualNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualNetPremium'+lAnnualNetPremiumNum,'GetPlanApiAnnualNetPremium'+lGetPlanResponseAnnualNetPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lAnnualNetPremiumNum!=lGetPlanWithInstallmentResponseAnnualNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualNetPremium'+lAnnualNetPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseAnnualNetPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					Map lMapPricingApiAnnualStampDutyCalc=lSelectedPricingApiTransactionList.get(lGetCellIndex).AnnualStampDutyCalc
					Integer lAnnualStampDutyCalcRowNumber=lMapPricingApiAnnualStampDutyCalc.RowNumber
					Integer lAnnualStampDutyCalcColumnNumber=lMapPricingApiAnnualStampDutyCalc.ColumnNumber
					String lAnnualStampDutyCalc=this.getValueFromExcelSheetForValidation(lTargetSheet,lAnnualStampDutyCalcRowNumber,lAnnualStampDutyCalcColumnNumber)
					String lGetPlanResponseAnnualStampDuty=lMapCoverData.annualStampDuty
					String lGetPlanWithInstallmentResponseAnnualStampDuty=lMapGetPlanWithInstallmentCoverData.annualStampDuty
					Float lAnnualStampDutyNum=IGNUemaHelper.convertStringToFloat(lAnnualStampDutyCalc,0.0)
					Float lGetPlanResponseAnnualStampDutyNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponseAnnualStampDuty,0.0)
					Float lGetPlanWithInstallmentResponseAnnualStampDutyNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponseAnnualStampDuty,0.0)
					if(lAnnualStampDutyNum!=lGetPlanResponseAnnualStampDutyNum){
						lIsPremiumMatchedValidationResultOK=false
						String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualStampDuty'+lAnnualStampDutyNum,'GetPlanApiAnnualStampDuty'+lGetPlanResponseAnnualStampDutyNum)
						lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						IGNUemaHelper.printLog('lPremiumValidationGetPlanPriceResultMessage')
						IGNUemaHelper.printLog(lPremiumValidationGetPlanPriceResultMessage)
					}
					if(lAnnualStampDutyNum!=lGetPlanWithInstallmentResponseAnnualStampDutyNum){
						lIsPremiumMatchedValidationResultOK=false
						String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualStampDuty'+lAnnualStampDutyNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseAnnualStampDutyNum)
						lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
					}
					Map lMapPricingApiAnnualGrossPremiumCalc=lSelectedPricingApiTransactionList.get(lGetCellIndex).AnnualGrossPremiumCalc
					Integer lAnnualGrossPremiumCalcRowNumber=lMapPricingApiAnnualGrossPremiumCalc.RowNumber
					Integer lAnnualGrossPremiumCalcColumnNumber=lMapPricingApiAnnualGrossPremiumCalc.ColumnNumber
					String lAnnualGrossPremiumCalc=this.getValueFromExcelSheetForValidation(lTargetSheet,lAnnualGrossPremiumCalcRowNumber,lAnnualGrossPremiumCalcColumnNumber)
					String lGetPlanResponseAnnualGrossPremium=lMapCoverData.annualGrossPremium
					String lGetPlanWithInstallmentResponseAnnualGrossPremium=lMapGetPlanWithInstallmentCoverData.annualGrossPremium
					Float lAnnualGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lAnnualGrossPremiumCalc,0.0)
					Float lGetPlanResponseAnnualGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponseAnnualGrossPremium,0.0)
					Float lGetPlanWithInstallmentResponseAnnualGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponseAnnualGrossPremium,0.0)
					Float lAnnualGrossPremiumWithoutLoadingNum=lAnnualStampDutyNum+lAnnualNetPremiumWithoutLoading
					String lAnnualGrossPremiumWithoutLoading=lAnnualGrossPremiumWithoutLoadingNum.toString()
					lTotalPremiumValue=lTotalPremiumValue+lAnnualGrossPremiumNum
					IGNUemaHelper.printLog('lAnnualGrossPremiumWithoutLoading')
					IGNUemaHelper.printLog(lAnnualGrossPremiumWithoutLoading)
					IGNUemaHelper.printLog(lGetPlanResponseAnnualGrossPremiumNum)
					if(lTransactionType=='New Biz'){
						if(lAnnualGrossPremiumWithoutLoadingNum!=lGetPlanResponseAnnualGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualGrossPremium'+lAnnualGrossPremiumWithoutLoading,'GetPlanApiAnnualGrossPremium'+lGetPlanResponseAnnualGrossPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lAnnualGrossPremiumNum!=lGetPlanWithInstallmentResponseAnnualGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualGrossPremium'+lAnnualGrossPremiumNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseAnnualGrossPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					else{
						if(lAnnualGrossPremiumNum!=lGetPlanResponseAnnualGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualGrossPremium'+lAnnualGrossPremiumNum,'GetPlanApiAnnualGrossPremium'+lGetPlanResponseAnnualGrossPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lAnnualGrossPremiumNum!=lGetPlanWithInstallmentResponseAnnualGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAnnualGrossPremium'+lAnnualGrossPremiumNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseAnnualGrossPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					Map lMapPricingApiPolicyNetPremium=lSelectedPricingApiTransactionList.get(lGetCellIndex).PolicyNetPremium
					Integer lPolicyNetPremiumRowNumber=lMapPricingApiPolicyNetPremium.RowNumber
					Integer lPolicyNetPremiumColumnNumber=lMapPricingApiPolicyNetPremium.ColumnNumber
					String lPolicyNetPremium=this.getValueFromExcelSheetForValidation(lTargetSheet,lPolicyNetPremiumRowNumber,lPolicyNetPremiumColumnNumber)
					String lGetPlanResponsePolicyNetPremium=lMapCoverData.policyNetPremium
					String lGetPlanWithInstallmentResponsePolicyNetPremium=lMapGetPlanWithInstallmentCoverData.policyNetPremium
					Float lPolicyNetPremiumNum=IGNUemaHelper.convertStringToFloat(lPolicyNetPremium,0.0)
					Float lGetPlanResponsePolicyNetPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponsePolicyNetPremium,0.0)
					Float lGetPlanWithInstallmentResponsePolicyNetPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponsePolicyNetPremium,0.0)
					IGNUemaHelper.printLog('lPolicyNetPremiumNum Installment')
					IGNUemaHelper.printLog(lGetPlanWithInstallmentResponsePolicyNetPremium)
					IGNUemaHelper.printLog(lGetPlanResponsePolicyNetPremiumNum)
					if(lTransactionType=='New Biz'){
						if(lAnnualNetPremiumWithoutLoading!=lGetPlanResponsePolicyNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyNetPremium'+lAnnualNetPremiumWithoutLoading,'GetPlanApiPolicyNetPremium'+lGetPlanResponsePolicyNetPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lPolicyNetPremiumNum!=lGetPlanWithInstallmentResponsePolicyNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyNetPremium'+lPolicyNetPremiumNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponsePolicyNetPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}else{
						if(lPolicyNetPremiumNum!=lGetPlanResponsePolicyNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyNetPremium'+lPolicyNetPremiumNum,'GetPlanApiPolicyNetPremium'+lGetPlanResponsePolicyNetPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lPolicyNetPremiumNum!=lGetPlanWithInstallmentResponsePolicyNetPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyNetPremium'+lPolicyNetPremiumNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponsePolicyNetPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					Map lMapPricingApiPolicyStampDuty=lSelectedPricingApiTransactionList.get(lGetCellIndex).PolicyStampDuty
					Integer lPolicyStampDutyRowNumber=lMapPricingApiPolicyStampDuty.RowNumber
					Integer lPolicyStampDutyColumnNumber=lMapPricingApiPolicyStampDuty.ColumnNumber
					String lPolicyStampDuty=this.getValueFromExcelSheetForValidation(lTargetSheet,lPolicyStampDutyRowNumber,lPolicyStampDutyColumnNumber)
					IGNUemaHelper.printLog(lPolicyStampDuty)
					String lGetPlanResponsePolicyStampDuty=lMapCoverData.policyStampDuty
					String lGetPlanWithInstallmentResponsePolicyStampDuty=lMapGetPlanWithInstallmentCoverData.policyStampDuty
					Float lPolicyStampDutyNum=IGNUemaHelper.convertStringToFloat(lPolicyStampDuty,0.0)
					Float lGetPlanResponsePolicyStampDutyNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponsePolicyStampDuty,0.0)
					Float lGetPlanWithInstallmentResponsePolicyStampDutyNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponsePolicyStampDuty,0.0)
					IGNUemaHelper.printLog('lPolicyStampDutyNum Installment')
					IGNUemaHelper.printLog(lGetPlanWithInstallmentResponsePolicyStampDuty)
					IGNUemaHelper.printLog(lGetPlanResponsePolicyStampDutyNum)
					if(lPolicyStampDutyNum!=lGetPlanResponsePolicyStampDutyNum){
						lIsPremiumMatchedValidationResultOK=false
						String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyStampDuty'+lPolicyStampDutyNum,'GetPlanApiPolicyStampDuty'+lGetPlanResponsePolicyStampDutyNum)
						lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						IGNUemaHelper.printLog('lPremiumValidationResultMessage')
						IGNUemaHelper.printLog(lPremiumValidationGetPlanPriceResultMessage)
					}
					if(lPolicyStampDutyNum!=lGetPlanWithInstallmentResponsePolicyStampDutyNum){
						lIsPremiumMatchedValidationResultOK=false
						String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyStampDuty'+lPolicyStampDutyNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponsePolicyStampDutyNum)
						lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
					}
					Map lMapPricingApiPolicyGrossPremium=lSelectedPricingApiTransactionList.get(lGetCellIndex).PolicyGrossPremium
					Integer lPolicyGrossPremiumRowNumber=lMapPricingApiPolicyGrossPremium.RowNumber
					Integer lPolicyGrossPremiumColumnNumber=lMapPricingApiPolicyGrossPremium.ColumnNumber
					String lPolicyGrossPremium=getValueFromExcelSheetForValidation(lTargetSheet,lPolicyGrossPremiumRowNumber,lPolicyGrossPremiumColumnNumber)
					IGNUemaHelper.printLog(lPolicyGrossPremium)
					IGNUemaHelper.printLog(lMapCoverData.transNetPremium)
					String lGetPlanResponsePolicyGrossPremium=lMapCoverData.policyGrossPremium
					String lGetPlanWithInstallmentResponsePolicyGrossPremium=lMapGetPlanWithInstallmentCoverData.policyGrossPremium
					Float lPolicyGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lPolicyGrossPremium,0.0)
					lTotalPolicyGrossPremiumValue=lTotalPolicyGrossPremiumValue+lPolicyGrossPremiumNum
					Float lGetPlanResponsePolicyGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponsePolicyGrossPremium,0.0)
					Float lGetPlanWithInstallmentResponsePolicyGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponsePolicyGrossPremium,0.0)
					IGNUemaHelper.printLog('lPolicyGrossPremiumNum Installment')
					IGNUemaHelper.printLog(lGetPlanWithInstallmentResponsePolicyGrossPremium)
					IGNUemaHelper.printLog(lGetPlanResponsePolicyGrossPremiumNum)
					Float lPolicyGrossPremiumWithoutLoadingNum=lPolicyStampDutyNum+lAnnualNetPremiumWithoutLoading
					String lPolicyGrossPremiumWithoutLoading=lPolicyGrossPremiumWithoutLoadingNum.toString()
					if(lTransactionType=='New Biz'){
						if(lPolicyGrossPremiumWithoutLoadingNum!=lGetPlanResponsePolicyGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyGrossPremium'+lPolicyGrossPremiumWithoutLoading,'GetPlanApiPolicyGrossPremium'+lGetPlanResponsePolicyGrossPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lPolicyGrossPremiumNum!=lGetPlanWithInstallmentResponsePolicyGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyGrossPremium'+lPolicyGrossPremiumNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponsePolicyGrossPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}else{
						if(lPolicyGrossPremiumNum!=lGetPlanResponsePolicyGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyGrossPremium'+lPolicyGrossPremiumNum,'GetPlanApiPolicyGrossPremium'+lGetPlanResponsePolicyGrossPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lPolicyGrossPremiumNum!=lGetPlanWithInstallmentResponsePolicyGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationPolicyGrossPremium'+lPolicyGrossPremiumNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponsePolicyGrossPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					Map lMapPricingApiTransactionStampDuty=lSelectedPricingApiTransactionList.get(lGetCellIndex).TransactionStampDuty
					Integer lTransactionStampDutyRowNumber=lMapPricingApiTransactionStampDuty.RowNumber
					Integer lTransactionStampDutyColumnNumber=lMapPricingApiTransactionStampDuty.ColumnNumber
					String lTransactionStampDuty=getValueFromExcelSheetForValidation(lTargetSheet,lTransactionStampDutyRowNumber,lTransactionStampDutyColumnNumber)
					String lGetPlanResponseTransactionStampDuty=lMapCoverData.transStampDuty
					String lGetPlanWithInstallmentResponseTransactionStampDuty=lMapGetPlanWithInstallmentCoverData.transStampDuty
					Float lTransactionStampDutyNum=IGNUemaHelper.convertStringToFloat(lTransactionStampDuty,0.0)
					Float lGetPlanResponseTransactionStampDutyNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponseTransactionStampDuty,0.0)
					Float lGetPlanWithInstallmentResponseTransactionStampDutyNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponseTransactionStampDuty,0.0)
					IGNUemaHelper.printLog('lTransactionStampDutyNum Installment')
					IGNUemaHelper.printLog(lGetPlanWithInstallmentResponseTransactionStampDuty)
					IGNUemaHelper.printLog(lGetPlanResponseTransactionStampDutyNum)
					if(lTransactionStampDutyNum!=lGetPlanResponseTransactionStampDutyNum){
						lIsPremiumMatchedValidationResultOK=false
						String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionStampDuty'+lTransactionStampDutyNum,'GetPlanApiTransactionStampDuty'+lGetPlanResponseTransactionStampDutyNum)
						lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
					}
					if(lTransactionStampDutyNum!=lGetPlanWithInstallmentResponseTransactionStampDutyNum){
						lIsPremiumMatchedValidationResultOK=false
						String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionStampDuty'+lTransactionStampDutyNum,' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTransactionStampDutyNum)
						lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
					}
					Map lMapPricingApiTransactionGrossPremium=lSelectedPricingApiTransactionList.get(lGetCellIndex).TransactionGrossPremium
					Integer lTransactionGrossPremiumRowNumber=lMapPricingApiTransactionGrossPremium.RowNumber
					Integer lTransactionGrossPremiumColumnNumber=lMapPricingApiTransactionGrossPremium.ColumnNumber
					String lTransactionGrossPremium=getValueFromExcelSheetForValidation(lTargetSheet,lTransactionGrossPremiumRowNumber,lTransactionGrossPremiumColumnNumber)
					IGNUemaHelper.printLog(lTransactionGrossPremium)
					String lGetPlanResponseTransactionGrossPremium=lMapCoverData.transGrossPremium
					String lGetPlanWithInstallmentResponseTransactionGrossPremium=lMapGetPlanWithInstallmentCoverData.transGrossPremium
					Float lTransactionGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lTransactionGrossPremium,0.0)
					Float lGetPlanResponseTransactionGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanResponseTransactionGrossPremium,0.0)
					Float lGetPlanWithInstallmentResponseTransactionGrossPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentResponseTransactionGrossPremium,0.0)
					IGNUemaHelper.printLog('lTransactionGrossPremiumNum Installment')
					IGNUemaHelper.printLog(lGetPlanWithInstallmentResponseTransactionGrossPremium)
					IGNUemaHelper.printLog(lGetPlanResponseTransactionGrossPremiumNum)
					Float lTransactionGrossPremiumWithoutLoadingNum=lTransactionStampDutyNum+lAnnualNetPremiumWithoutLoading
					String lTransactionGrossPremiumWithoutLoading=lTransactionGrossPremiumWithoutLoadingNum.toString()
					if(lTransactionType=='New Biz'){
						if(lTransactionGrossPremiumWithoutLoadingNum!=lGetPlanResponseTransactionGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionGrossPremium'+lTransactionGrossPremiumWithoutLoading,'GetPlanApiTransactionGrossPremium'+lGetPlanResponseTransactionGrossPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lTransactionGrossPremiumNum!=lGetPlanWithInstallmentResponseTransactionGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionGrossPremium'+lTransactionGrossPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTransactionGrossPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}else{
						if(lTransactionGrossPremiumNum!=lGetPlanResponseTransactionGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionGrossPremium'+lTransactionGrossPremiumNum,'GetPlanApiTransactionGrossPremium'+lGetPlanResponseTransactionGrossPremiumNum)
							lPremiumValidationGetPlanPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanPriceResultMessage,lMessageText)
						}
						if(lTransactionGrossPremiumNum!=lGetPlanWithInstallmentResponseTransactionGrossPremiumNum){
							lIsPremiumMatchedValidationResultOK=false
							String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTransactionGrossPremium'+lTransactionGrossPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTransactionGrossPremiumNum)
							lPremiumValidationGetPlanWithInstallmentPriceResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumValidationGetPlanWithInstallmentPriceResultMessage,lMessageText)
						}
					}
					IGNUemaHelper.printLog('lPremiumValidationGetPlanPriceResultMessage')
					IGNUemaHelper.printLog(lPremiumValidationGetPlanPriceResultMessage)
					IGNUemaHelper.printLog(lPremiumValidationGetPlanWithInstallmentPriceResultMessage)
					Map lMapPricingApiValidationTestResultGetPlanPrice=lSelectedPricingApiTransactionList.get(lGetCellIndex).ValidationTestResultGetPlanPrice
					Integer lValidationTestResultGetPlanPriceRowNumber=lMapPricingApiValidationTestResultGetPlanPrice.RowNumber
					Integer lValidationTestResultGetPlanPriceColumnNumber=lMapPricingApiValidationTestResultGetPlanPrice.ColumnNumber
					Boolean lIsInputPremiumValidationGetPlanPriceResultMessageIntoTheSheetOK=inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lValidationTestResultGetPlanPriceRowNumber,lValidationTestResultGetPlanPriceColumnNumber,lPremiumValidationGetPlanPriceResultMessage)
					if(!lIsInputPremiumValidationGetPlanPriceResultMessageIntoTheSheetOK){
						return lreturn
					}
					Map lMapPricingApiValidationTestResultGetPlanWithInstallmentPrice=lSelectedPricingApiTransactionList.get(lGetCellIndex).ValidationTestResultGetPlanWithInstallmentPrice
					Integer lValidationTestResultGetPlanWithInstallmentPriceRowNumber=lMapPricingApiValidationTestResultGetPlanWithInstallmentPrice.RowNumber
					Integer lValidationTestResultGetPlanWithInstallmentPriceColumnNumber=lMapPricingApiValidationTestResultGetPlanWithInstallmentPrice.ColumnNumber
					Boolean lIsInputPremiumValidationGetPlanWithInstallmentPriceResultMessageIntoTheSheetOK=inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lValidationTestResultGetPlanWithInstallmentPriceRowNumber,lValidationTestResultGetPlanWithInstallmentPriceColumnNumber,lPremiumValidationGetPlanWithInstallmentPriceResultMessage)
					if(!lIsInputPremiumValidationGetPlanWithInstallmentPriceResultMessageIntoTheSheetOK){
						return lreturn
					}
				}
			}
			String lTotalPremiumValidationMessage=''
			String lLibraryGetPlanPriceTotalPremiumValidationMessage=''
			String lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage=''
			for(Integer lIndex=0;lIndex<=lPricingApiJsonTotalPremiumList.size()-1;lIndex++){
				Map lMapInputTotalPremium=lPricingApiJsonTotalPremiumList[lIndex].TotalPremium
				Integer lInputTotalPremiumRowNumber=lMapInputTotalPremium.RowNumber
				Integer lInputTotalPremiumColumnNumber=lMapInputTotalPremium.ColumnNumber
				String lStrTotalPremium=lTotalPremiumValue.toString()
				IGNUemaHelper.printLog('lStrTotalPremium')
				IGNUemaHelper.printLog(lStrTotalPremium)
				String lIsInputTotalPremiumToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lInputTotalPremiumRowNumber,lInputTotalPremiumColumnNumber,lStrTotalPremium)
				if(!lIsInputTotalPremiumToExcelSheetDone){
					return lreturn
				}
				String lGetPlanTotalPremium=''
				String  lGetPlanWithInstallmentTotalPremium=''
				List lGetPlanLoadingFactorOptionList=lMapJsonGetPlanResponse.root.Quote.Loading_Factors
				List lGetPlanWithInstallmentLoadingFactorOptionList=lMapJsonGetPlanWithInstallmentResponse.root.Quote.Loading_Factors
				for(Integer lGetPlanLoadingIndex=0;lGetPlanLoadingIndex<=lGetPlanLoadingFactorOptionList.size()-1;lGetPlanLoadingIndex++){
					String lGetPlanPaymentFrequency=lGetPlanLoadingFactorOptionList.get(lGetPlanLoadingIndex).Payment_Frequency
					if(lGetPlanPaymentFrequency==lPaymentFrequency){
						lGetPlanTotalPremium=lGetPlanLoadingFactorOptionList.get(lGetPlanLoadingIndex).Total_Premium
						lGetPlanWithInstallmentTotalPremium=lGetPlanWithInstallmentLoadingFactorOptionList[0].Total_Premium
					}
				}
				Float lGetPlanResponseTotalPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanTotalPremium,0.0)
				Float lGetPlanWithInstallmentResponseTotalPremiumNum=IGNUemaHelper.convertStringToFloat(lGetPlanWithInstallmentTotalPremium,0.0)
				Float lLibraryGetPlanResponseTotalPremiumNum=IGNUemaHelper.convertStringToFloat(lLibraryGetPlanPriceTotalPremium,0.0)
				Float lLibraryGetPlanWithInstallmentResponseTotalPremiumNum=IGNUemaHelper.convertStringToFloat(lLibraryGetPlanWithInstallmentPriceTotalPremium,0.0)
				IGNUemaHelper.printLog('lTotalPremium')
				IGNUemaHelper.printLog(lGetPlanTotalPremium)
				IGNUemaHelper.printLog(lGetPlanWithInstallmentTotalPremium)
				Map lMapInputValidationTestResult=lPricingApiJsonTotalPremiumList[lIndex].ValidationTestResult
				Integer lInputValidationTestResultRowNumber=lMapInputValidationTestResult.RowNumber
				Integer lInputValidationTestResultColumnNumber=lMapInputValidationTestResult.ColumnNumber
				Map lMapInputValidationTestResultLibraryGetPlanPrice=lPricingApiJsonTotalPremiumList[lIndex].ValidationTestResultLibraryGetPlanPrice
				Integer lInputValidationTestResultLibraryGetPlanPriceRowNumber=lMapInputValidationTestResultLibraryGetPlanPrice.RowNumber
				Integer lInputValidationTestResultLibraryGetPlanPriceColumnNumber=lMapInputValidationTestResultLibraryGetPlanPrice.ColumnNumber
				Map lMapInputValidationTestResultLibraryGetPlanWithInstallmentPrice=lPricingApiJsonTotalPremiumList[lIndex].ValidationTestResultLibraryGetPlanWithInstallmentPrice
				Integer lInputValidationTestResultLibraryGetPlanWithInstallmentPriceRowNumber=lMapInputValidationTestResultLibraryGetPlanWithInstallmentPrice.RowNumber
				Integer lInputValidationTestResultLibraryGetPlanWithInstallmentPriceColumnNumber=lMapInputValidationTestResultLibraryGetPlanWithInstallmentPrice.ColumnNumber
				Integer lInputGetPlanResponseColumnNumber=lInputValidationTestResultColumnNumber+2
				Integer lInputGetPlanWithInstallmentResponseColumnNumber=lInputValidationTestResultColumnNumber+3
				IGNUemaHelper.printLog('lInputValidationTestResultRowNumber')
				IGNUemaHelper.printLog(lInputValidationTestResultRowNumber)
				IGNUemaHelper.printLog(lInputGetPlanWithInstallmentResponseColumnNumber)
				Boolean lIsInputGetPlanRequestToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lInputValidationTestResultRowNumber,lInputGetPlanResponseColumnNumber,lGetPlanApiRequest)
				if(!lIsInputGetPlanRequestToExcelSheetDone){
					return lreturn
				}
				Boolean lIsInputGetPlanWithInstallmentRequestToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lInputValidationTestResultRowNumber,lInputGetPlanWithInstallmentResponseColumnNumber,lGetPlanWithInstallmentRequest)
				if(!lIsInputGetPlanWithInstallmentRequestToExcelSheetDone){
					return lreturn
				}
				String lTotalInstallmentAmountValidationMessage=''
				String lLibraryTotalInstallmentAmountValidationMessage=''
				String lTotalInstallmentAmountAndDownPaymentValidationMessage=''
				String lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage=''
				String lLibraryGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=''
				Map lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult=this.validateGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmount(lTransactionType,lMapTotalInstallmentAndDownPaymentAmount,lPricingApiLibrayInputOutput,lMapJsonGetPlanWithInstallmentResponse)
				if(lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult.Result){
					lTotalInstallmentAmount=lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult.TotalInstallmentAmount
					lLibraryTotalInstallmentAmount=lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult.LibraryTotalInstallmentAmount
					lTotalInstallmentAmountAndDownPaymentValidationMessage=lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult.TotalInstallmentAndDownPaymentAmountValidationMessage
					lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage=lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult.LibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage
					lLibraryGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=lMapGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmountValidationResult.LibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage
				}
				IGNUemaHelper.printLog('Policy Gross*Installment Amount')
				IGNUemaHelper.printLog(lTotalPolicyGrossPremiumValue)
				IGNUemaHelper.printLog(lTotalInstallmentAmount)
				if(lTotalInstallmentAmount!=lTotalPolicyGrossPremiumValue){
					lIsPremiumMatchedValidationResultOK=false
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalInstallmentAmount'+lTotalInstallmentAmount,'CalculationTotalPolicyGrossPremiumValue'+lTotalPolicyGrossPremiumValue)
					lTotalInstallmentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lTotalInstallmentAmountValidationMessage,lMessageText)
				}
				if(lLibraryTotalInstallmentAmount!=lTotalPolicyGrossPremiumValue){
					lIsPremiumMatchedValidationResultOK=false
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryCalculationTotalInstallmentAmount'+lLibraryTotalInstallmentAmount,'CalculationTotalPolicyGrossPremiumValue'+lTotalPolicyGrossPremiumValue)
					lLibraryTotalInstallmentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryTotalInstallmentAmountValidationMessage,lMessageText)
				}
				lTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lTotalPremiumValidationMessage,lTotalInstallmentAmountValidationMessage)
				lTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lTotalPremiumValidationMessage,lTotalInstallmentAmountAndDownPaymentValidationMessage)
				lLibraryGetPlanPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanPriceTotalPremiumValidationMessage,lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
				lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage,lLibraryTotalInstallmentAmountValidationMessage)
				lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage,lLibraryGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
				if(lTotalPremiumValue!=lGetPlanResponseTotalPremiumNum || lTotalPremiumValue!=lGetPlanWithInstallmentResponseTotalPremiumNum){
					lIsPremiumMatchedValidationResultOK=false
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalPremium'+lTotalPremiumValue,'GetPlanApiTotalPremium'+lGetPlanResponseTotalPremiumNum+' '+' GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTotalPremiumNum)
					lTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lTotalPremiumValidationMessage,lMessageText)
					IGNUemaHelper.printLog('lPremiumValidationGetPlanPriceResultMessage')
					IGNUemaHelper.printLog(lTotalPremiumValidationMessage)
				}
				IGNUemaHelper.printLog('lLibraryGetPlanResponseTotalPremiumNum')
				IGNUemaHelper.printLog(lLibraryGetPlanResponseTotalPremiumNum)
				IGNUemaHelper.printLog(lLibraryGetPlanWithInstallmentResponseTotalPremiumNum)
				IGNUemaHelper.printLog(lLibraryGetPlanPriceTotalPremiumValidationMessage)
				IGNUemaHelper.printLog(lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage)
				if(lLibraryGetPlanResponseTotalPremiumNum!=lGetPlanResponseTotalPremiumNum || lLibraryGetPlanWithInstallmentResponseTotalPremiumNum!=lGetPlanWithInstallmentResponseTotalPremiumNum){
					lIsPremiumMatchedValidationResultOK=false
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanTotalPremium'+lLibraryGetPlanResponseTotalPremiumNum, 'GetPlanApiTotalPremium'+lGetPlanResponseTotalPremiumNum)
					lLibraryGetPlanPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanPriceTotalPremiumValidationMessage,lMessageText)
				}
				if(lLibraryGetPlanWithInstallmentResponseTotalPremiumNum!=lGetPlanWithInstallmentResponseTotalPremiumNum){
					lIsPremiumMatchedValidationResultOK=false
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanWithInstallmentTotalPremium'+lLibraryGetPlanWithInstallmentResponseTotalPremiumNum,'GetPlanWithInstallmentPrice'+lGetPlanWithInstallmentResponseTotalPremiumNum)
					lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanPriceTotalPremiumValidationMessage,lMessageText)
				}
				Boolean lIsInputValidationTestResultMessageToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lInputValidationTestResultRowNumber,lInputValidationTestResultColumnNumber,lTotalPremiumValidationMessage)
				if(!lIsInputValidationTestResultMessageToExcelSheetDone){
					return lreturn
				}
				Boolean lIsInputValidationTestResultLibraryGetPlanPriceMessageToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lInputValidationTestResultLibraryGetPlanPriceRowNumber,lInputValidationTestResultLibraryGetPlanPriceColumnNumber,lLibraryGetPlanPriceTotalPremiumValidationMessage)
				if(!lIsInputValidationTestResultLibraryGetPlanPriceMessageToExcelSheetDone){
					return lreturn
				}
				Boolean lIsInputValidationTestResultLibraryGetPlanWithInstallmentPriceMessageToExcelSheetDone=this.inputPricingApiResultToExcelSheetForValidation(lTargetSheet,lInputValidationTestResultLibraryGetPlanWithInstallmentPriceRowNumber,lInputValidationTestResultLibraryGetPlanWithInstallmentPriceColumnNumber,lLibraryGetPlanWithInstallmentPriceTotalPremiumValidationMessage)
				if(!lIsInputValidationTestResultLibraryGetPlanWithInstallmentPriceMessageToExcelSheetDone){
					return lreturn
				}
			}
			lreturn=lIsPremiumMatchedValidationResultOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map validateGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmount(String strTransactionType,Map mapTotalInstallmentAndDownPaymentAmount,Map mapPricingApiLibraryInputOutput,Map mapJsonGetPlanWithInstallmentResponse){
		Map lreturn=[:]
		Boolean lResult=false
		String lTotalInstallmentAndDownPaymentAmountValidationMessage=''
		String lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage=''
		String lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage=''
		Float  lSumTotalInstallmentAmount=0.0
		Float lLibrarySumTotalInstallmentAmount=0.0
		try{
			lreturn.put('TotalInstallmentAndDownPaymentAmountValidationMessage',lTotalInstallmentAndDownPaymentAmountValidationMessage)
			lreturn.put('LibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage',lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
			lreturn.put('LibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage',lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage)
			lreturn.put('TotalInstallmentAmount',lSumTotalInstallmentAmount)
			lreturn.put('LibraryTotalInstallmentAmount',lLibrarySumTotalInstallmentAmount)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfString(strTransactionType)){
				return lreturn
			}
			String lTransactionType=strTransactionType
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapTotalInstallmentAndDownPaymentAmount)){
				return lreturn
			}
			Map lMapTotalInstallmentAndDownPaymentAmount=mapTotalInstallmentAndDownPaymentAmount
			Integer lTotalDownPayment=lMapTotalInstallmentAndDownPaymentAmount.TotalDownPayment
			Integer lTotalInstallmentAmount=lMapTotalInstallmentAndDownPaymentAmount.TotalInstallmentAmount
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapJsonGetPlanWithInstallmentResponse)){
				return lreturn
			}
			Map lMapJsonGetPlanWithInstallmentResponse=mapJsonGetPlanWithInstallmentResponse
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiLibraryInputOutput)){
				return lreturn
			}
			Map lMapPricingApiLibraryInputOutput=mapPricingApiLibraryInputOutput
			String lLibraryGetPlanPriceDownPayment=lMapPricingApiLibraryInputOutput.PricingApiLibraryGetPlanPriceDownPayment
			String lLibraryGetPlanPriceInstallmentAmount=lMapPricingApiLibraryInputOutput.PricingApiLibraryGetPlanPriceInstallmentAmount
			String lLibraryGetPlanWithInstallmentPriceTotalPremium=lMapPricingApiLibraryInputOutput.PricingApiLibraryGetPlanWithInstallmentPriceTotalPremium
			String lLibraryGetPlanWithInstallmentPriceDownPayment=lMapPricingApiLibraryInputOutput.PricingApiLibraryGetPlanWithInstallmentPriceDownPayment
			String lLibraryGetPlanWithInstallmentPriceInstallmentAmount=lMapPricingApiLibraryInputOutput.PricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount
			Float lLibraryGetPlanPriceTotalInstallmentAmount=IGNUemaHelper.convertStringToFloat(lLibraryGetPlanPriceInstallmentAmount,0.0)
			Float lLibraryGetPlanWithInstallmentPriceTotalInstallmentAmount=IGNUemaHelper.convertStringToFloat(lLibraryGetPlanWithInstallmentPriceInstallmentAmount,0.0)
			Float lLibraryGetPlanPriceTotalDownPaymentAmount=IGNUemaHelper.convertStringToFloat(lLibraryGetPlanPriceDownPayment,0.0)
			Float lLibraryGetPlanWithInstallmentPriceTotalDownPaymentAmount=IGNUemaHelper.convertStringToFloat(lLibraryGetPlanWithInstallmentPriceDownPayment,0.0)
			List lLibraryGetPlanWithInstallmentPaymentDetailList=lMapPricingApiLibraryInputOutput.PricingApiLibraryGetPlanPriceWithInstallmentPaymentDetailList
			List lGetPlanWithInstallmentPaymentDetailList=lMapJsonGetPlanWithInstallmentResponse.root.Quote.paymentDetails
			if(lTransactionType=='New Biz'){
				Map lMapGetPlanWithInstallmentPaymentDetail=lGetPlanWithInstallmentPaymentDetailList.get(0)
				String lInstallmentAmount=lMapGetPlanWithInstallmentPaymentDetail.amount
				Integer lInstallmentAmountNum=IGNUemaHelper.convertStringToInteger(lInstallmentAmount,0)
				if(lTotalDownPayment!=lInstallmentAmountNum){
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalDownAmount'+lTotalDownPayment,'GetPlanWithInstallmentAmount'+lInstallmentAmountNum)
					lTotalInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lTotalInstallmentAndDownPaymentAmountValidationMessage,lMessageText)
				}
				if(lTotalInstallmentAmount!=lInstallmentAmountNum){
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalInstallmentAmountAmount'+lTotalInstallmentAmount,'GetPlanWithInstallmentAmount'+lInstallmentAmountNum)
					lTotalInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lTotalInstallmentAndDownPaymentAmountValidationMessage,lMessageText)
				}
				IGNUemaHelper.printLog('lLibraryGetPlanPriceTotalDownPaymentAmount')
				IGNUemaHelper.printLog(lLibraryGetPlanPriceTotalDownPaymentAmount)
				IGNUemaHelper.printLog(lLibraryGetPlanPriceTotalInstallmentAmount)
				IGNUemaHelper.printLog(lLibraryGetPlanWithInstallmentPriceTotalDownPaymentAmount)
				IGNUemaHelper.printLog(lLibraryGetPlanWithInstallmentPriceTotalInstallmentAmount)
				IGNUemaHelper.printLog(lInstallmentAmountNum)
				if(lLibraryGetPlanPriceTotalDownPaymentAmount!=lInstallmentAmountNum){
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanPriceTotalDownPaymentAmount'+lLibraryGetPlanPriceTotalDownPaymentAmount,'GetPlanWithInstallmentAmount'+lInstallmentAmountNum)
					lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage,lMessageText)
				}
				if(lLibraryGetPlanPriceTotalInstallmentAmount!=lInstallmentAmountNum){
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanPriceTotalInstallmentAmount'+lLibraryGetPlanPriceTotalInstallmentAmount,'GetPlanWithInstallmentAmount'+lInstallmentAmountNum)
					lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage,lMessageText)
				}
				if(lLibraryGetPlanWithInstallmentPriceTotalDownPaymentAmount!=lInstallmentAmountNum){
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanWithInstallmentPriceTotalDownPaymentAmount'+lLibraryGetPlanWithInstallmentPriceTotalDownPaymentAmount,'GetPlanWithInstallmentAmount'+lInstallmentAmountNum)
					lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage,lMessageText)
				}
				if(lLibraryGetPlanWithInstallmentPriceTotalInstallmentAmount!=lInstallmentAmountNum){
					String lMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanWithInstallmentPriceTotalInstallmentAmount'+lLibraryGetPlanWithInstallmentPriceTotalInstallmentAmount,'GetPlanWithInstallmentAmount'+lInstallmentAmountNum)
					lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage,lMessageText)
				}
			}
			for(Integer lPaymentIndex=0;lPaymentIndex<=lGetPlanWithInstallmentPaymentDetailList.size()-1;lPaymentIndex++){
				Map lMapGetPlanWithInstallmentPaymentDetail=lGetPlanWithInstallmentPaymentDetailList.get(lPaymentIndex)
				Map lMapLibraryGetPlanWithInstallmentPaymentDetail=lLibraryGetPlanWithInstallmentPaymentDetailList.get(lPaymentIndex)
				IGNUemaHelper.printLog('lMapLibraryGetPlanWithInstallmentPaymentDetail')
				IGNUemaHelper.printLog(lMapLibraryGetPlanWithInstallmentPaymentDetail)
				String lInstallmentAmount=lMapGetPlanWithInstallmentPaymentDetail.amount
				String lLibraryInstallmentAmount=lMapLibraryGetPlanWithInstallmentPaymentDetail.Amount
				Integer lInstallmentAmountNum=IGNUemaHelper.convertStringToInteger(lInstallmentAmount,0)
				Integer lLibraryInstallmentAmountNum=IGNUemaHelper.convertStringToInteger(lLibraryInstallmentAmount,0)
				IGNUemaHelper.printLog('lInstallmentAmountNum')
				IGNUemaHelper.printLog(lInstallmentAmountNum)
				IGNUemaHelper.printLog('Library -lInstallmentAmountNum')
				IGNUemaHelper.printLog(lLibraryInstallmentAmount)
				IGNUemaHelper.printLog(lLibraryInstallmentAmountNum)
				lSumTotalInstallmentAmount=lSumTotalInstallmentAmount+lInstallmentAmountNum
				lLibrarySumTotalInstallmentAmount=lLibrarySumTotalInstallmentAmount+lLibraryInstallmentAmountNum
			}
			IGNUemaHelper.printLog('Total Installment Amount')
			IGNUemaHelper.printLog(lSumTotalInstallmentAmount)
			IGNUemaHelper.printLog(lLibrarySumTotalInstallmentAmount)
			lResult=lTotalInstallmentAndDownPaymentAmountValidationMessage.length()>=0
			if(lResult){
				lreturn.put('TotalInstallmentAndDownPaymentAmountValidationMessage',lTotalInstallmentAndDownPaymentAmountValidationMessage)
				lreturn.put('LibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage',lLibraryGetPlanPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
				lreturn.put('LibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage',lLibraryGetPlanWithInstallmentPriceInstallmentAndDownPaymentAmountValidationMessage)
				lreturn.put('TotalInstallmentAmount',lSumTotalInstallmentAmount)
				lreturn.put('LibraryTotalInstallmentAmount',lLibrarySumTotalInstallmentAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPricingApiResultToExcelSheetForValidation(Sheet targetSheet,Integer integerRowNumber,Integer integerColumnNumber,String strOutputResult){
		Boolean lreturn=false
		Integer lRowNumber=integerRowNumber
		Integer lColumnNumber=integerColumnNumber
		String lOutputResult=strOutputResult
		if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
			return lreturn
		}
		Sheet lPricingApiSheet=targetSheet
		try{
			lOutputResult=IGNUemaHelper.copyStringFitForExcelCell(lOutputResult)
			lOutputResult=lOutputResult.trim()
			ExcelKeywords.setValueToCellByIndex(lPricingApiSheet,lRowNumber,lColumnNumber,lOutputResult)
			IGNUemaHelper.printLog('WRITTEN'+lOutputResult)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase,Boolean isOKRegisterClient,Boolean isOKMultiPlan,Boolean isOKGetPlan,Boolean isOkGetPlanWithInstallment,Boolean isOKAdditionalCoveragePremiumValidation,Boolean isOKPremiumValidationOK){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			IGNUemaHelper.printLog('Inside Function Actual Result')
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			Boolean lIsOK=true
			lIsOK=isOKRegisterClient&&isOKMultiPlan&&isOKGetPlan&&isOkGetPlanWithInstallment&&isOKAdditionalCoveragePremiumValidation&&isOKPremiumValidationOK
			if(isPositiveCase){
				lIsActualResult=lIsOK
			}else{
				lIsActualResult=!lIsOK
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			lResult=lActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputResultMessage(String ActualResult){
		Map lreturn=[:]
		String lActualResult=ActualResult.trim()
		String lResultMessage=''
		try{
			Boolean lResult=false
			String lMessage=''
			lreturn.put('ResultMessage',lResultMessage)
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			if(lIsActualResult){
				lMessage='Pricing Api have successfully retreived all the Possible Plan List'
			}else{
				lMessage='Pricing Api have been failed to retreive the Possible Plan List'
			}
			lResultMessage=lMessage
			lResult=lResultMessage.length()>0
			if(lResult){
				lreturn.put('ResultMessage',lResultMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public void inputGenericResultMessageA(String verifyApiResult){
		String lreturn=''
		String lActualResult=''
		try{
			String lMessage=''
			Boolean lIsCheckVerifyApiResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(verifyApiResult)
			if(lIsCheckVerifyApiResultEmpty){
				lMessage='The Api have been Successfully verified against the Positive Response'
			}
			else if(verifyApiResult.contains('ResponseErrorValidation')){
				lMessage='The Api have been Successfully verified the Error Message against the Negative Response'
			}
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public String inputGenericResultMessageB(String verifyApiResult,Integer statusCode){
		String lreturn=''
		Boolean lResult=false
		String lActualResult=''
		try{
			String lMessage=''
			String lText=''
			String lStatusCodeText=statusCode.toString()
			if(verifyApiResult.contains('StatusCodeFailed')){
				switch(lStatusCodeText){
					case '400':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Bad Request')
						break
					case '401':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'UnAuthorizedResponse')
						break
					case '403':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Forbidden Response')
						break
					case '404':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Response Not Found')
						break
					case '407':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Proxy Authentication Required')
						break
					case '408':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Request Time Out')
						break
					case '500':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Internal server Error')
						break
					case '502':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Bad Gateway Error')
						break
					case '504':
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Gateway Timeout Error')
						break
					default:
						lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,lStatusCodeText+'-'+'Anonymous Response')
						break
				}
			}
			else if(verifyApiResult.contains('ResponseValidationFailed')){
				lMessage='Failed in Response Validation'
			}
			lResult=lMessage.length()>0
			if(lResult){
				lreturn=lMessage
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputGenericResultMessageC(List<String> arrayOfQuoteApiStatusList){
		String lreturn=''
		String lActualResult=''
		Boolean lResult=false
		try{
			String lMessage=''
			List<String> lSortedQuoteApiStatusList=arrayOfQuoteApiStatusList.sort()
			List<String> lErrorMessageCodeList=[
				'StatusCode',
				'ResponseValidation'
			]
			List<String> lSortedErrorMessageCodeList=lErrorMessageCodeList.sort()
			List<String> lPossibleErrorMessageCodeList=[]
			Map lMapPossibleErrorMessageCodeList=this.getPossibleSequenceOfList(lSortedErrorMessageCodeList)
			if(lMapPossibleErrorMessageCodeList.Result){
				lPossibleErrorMessageCodeList=lMapPossibleErrorMessageCodeList.PossibleSequenceList
			}
			IGNUemaHelper.printLog('lPossibleErrorMessageCodeList')
			IGNUemaHelper.printLog(lPossibleErrorMessageCodeList)
			Integer lResultMessageType=lPossibleErrorMessageCodeList.indexOf(lSortedQuoteApiStatusList)
			IGNUemaHelper.printLog(lResultMessageType)
			switch(lResultMessageType){
				case '0':
					lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,'Api have Failed in Response Validation ')
					break
				case '1':
					lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,'Api have Failed in Response & StatusCodeValidation ')
					break
				case '2':
					lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,'Api have Failed in ResponseValidation')
					break
				default:
					lMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lMessage,'Api have been Successfully Verified')
					break
			}
			lResult=lMessage.length()>1
			if(lResult){
				lreturn=lMessage
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map getPossibleSequenceOfList(List<String> targetList){
		Map lreturn=[:]
		ArrayList<String> lPossibleSequenceList=new ArrayList<String>()
		try{
			Boolean lResult=false
			lreturn.put("Result",lResult)
			lreturn.put("PossibleSequenceList",lPossibleSequenceList)
			if(!targetList){
			}else{
				if(targetList.size()>0){
					lPossibleSequenceList=targetList.subsequences()
				}
			}
			lResult=lPossibleSequenceList.size()>=0
			if(lResult){
				lreturn.put("Result",lResult)
				lreturn.put("PossibleSequenceList",lPossibleSequenceList)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean writeOutputToExcelSheet(Map mapPricingApiInputOutput){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lPricingApiInputOutput=mapPricingApiInputOutput
		try{
			String lMultiplePlanPriceRequestText=lPricingApiInputOutput.MultiplePlanPriceRequestText
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateMultiplePlanPriceRequestText=lMultiplePlanPriceRequestText
			String lQuotePolicyStartDate=lPricingApiInputOutput.QuotePolicyStartDate
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateQuotePolicyStartDate=lQuotePolicyStartDate
			String lQuotePolicyEndDate=lPricingApiInputOutput.QuotePolicyEndDate
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateQuotePolicyEndDate=lQuotePolicyEndDate
			String lQuotePolicyEndorsementEffectiveDate=lPricingApiInputOutput.QuotePolicyEndorsementEffectiveDate
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateQuotePolicyEndorsementEffectiveDate=lQuotePolicyEndorsementEffectiveDate
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean writeOutputListToExcelSheet(List strSubSetList,List strOutputQuotePlanList,List strOutputQuotePlanWithInstallmentList,String strProductType,String strTransactionType){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectEmptyOfList(strSubSetList)){
			return lreturn
		}
		List lSubSetList=strSubSetList
		if(IGNUemaHelper.checkObjectEmptyOfList(strOutputQuotePlanList)){
			return lreturn
		}
		List lOutputQuotePlanList=strOutputQuotePlanList
		if(IGNUemaHelper.checkObjectEmptyOfList(strOutputQuotePlanWithInstallmentList)){
			return lreturn
		}
		List lOutputQuotePlanWithInstallmentList=strOutputQuotePlanWithInstallmentList
		if(IGNUemaHelper.checkObjectEmptyOfString(strProductType)){
			return lreturn
		}
		String lProductType=strProductType
		if(IGNUemaHelper.checkObjectEmptyOfString(strTransactionType)){
			return lreturn
		}
		String lTransactionType=strTransactionType
		try{
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainCurrent=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain()
			IGNUemaHelper.printLog('lIGNTestMasterCaseTypeMainCurrent.getNumCaseNumber')
			IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMainCurrent.getNumCaseIndex())
			lIGNTestMasterCaseTypeMainCurrent=lIGNTestMasterCaseTypeMainCurrent.getParentIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(lIGNTestMasterCaseTypeMainCurrent.getNumCaseIndex())
			//	IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(6)
			IGNTestMasterCaseGroupTypeSheet lIGNTestMasterCaseGroupTypeSheet01=lIGNTestMasterCaseTypeMainCurrent.CaseGroupFactory.addIGNTestMasterCaseGroupTypeSheet('First')
			IGNUemaHelper.printLog('lOutputQuotePlanWithInstallmentList')
			IGNUemaHelper.printLog(lOutputQuotePlanList)
			IGNUemaHelper.printLog(lOutputQuotePlanWithInstallmentList)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheet01)){
				for(Integer lIndex=0;lIndex<=lOutputQuotePlanList.size()-1;lIndex++){
					String lSubSetIndex=lSubSetList.get(lIndex)
					Map lMapPricingApiPlanResponse=lOutputQuotePlanList.get(lIndex)
					String lPlanListResponse=lMapPricingApiPlanResponse.ResponseObjectResponseText
					Map lMapPlanListJson=new JsonSlurper().parseText(lPlanListResponse)
					IGNTestMasterCaseGroupTypeRow lIGNTestMasterCaseGroupTypeRow01=lIGNTestMasterCaseGroupTypeSheet01.addIGNTestMasterCaseGroupTypeRow()
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeRow01)){
						Map<String,String> lMapDataOutputList01=lIGNTestMasterCaseGroupTypeRow01.MapDataOutput
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiSubsetIndex',lSubSetIndex)
						lMapDataOutputList01.put('GroupAllGlobalShareControlStage01MainOutputItemIndex',lIGNTestMasterCaseGroupTypeRow01.getStrRowIndex())
						if(lTransactionType=='New Biz'){
							lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName','GetPlanPrice')
						}else{
							lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName','EndorsementPlanPrice')
						}
						String lResponseStatusCode=lMapPricingApiPlanResponse.ResponseObjectStatusText
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePlanListResponseStatus',lResponseStatusCode)
						String lResponseTimeText=lMapPricingApiPlanResponse.ResponseObjectElapsedTimeText
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePlanListResponseTime',lResponseTimeText)
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePlanListResponseText',lPlanListResponse)
						Map lVehicleDataRoot=lMapPlanListJson.root.Quote.Vehicle_Data
						JsonBuilder lJsonVehicleData=new JsonBuilder(lVehicleDataRoot)
						String lStrVehicleDataRoot=lJsonVehicleData.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteVehicleDataRoot',lStrVehicleDataRoot)
						Map lCoverRoot=lMapPlanListJson.root.Quote.Covers
						JsonBuilder lJsonCoverData=new JsonBuilder(lCoverRoot)
						String lStrCoverRoot=lJsonCoverData.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteCoverRoot',lStrCoverRoot)
						List lLoadingFactorListRoot=lMapPlanListJson.root.Quote.Loading_Factors
						Map lMapLoadingFactor=[:]
						lMapLoadingFactor.put('LoadingFactors',lLoadingFactorListRoot)
						JsonBuilder lJsonLoadingFactor=new JsonBuilder(lMapLoadingFactor)
						String lStrLoadingFactorRoot=lJsonLoadingFactor.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteLoadingFactorRoot',lStrLoadingFactorRoot)
						Map lIrregularityRoot=lMapPlanListJson.root.Quote.Irregularities
						String lStrIrregularityRoot=lIrregularityRoot.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteCoverIrregularityRoot',lStrIrregularityRoot)
						Map<String,String> lMapDataOutputList02=lIGNTestMasterCaseGroupTypeSheet01.getIGNTestMasterCaseGroupTypeRowMapDataOutput(lIGNTestMasterCaseGroupTypeRow01.getNumRowIndex())
						IGNUemaHelper.printLog(lMapDataOutputList01.toString())
						IGNUemaHelper.printLog(lMapDataOutputList02.toString())
					}
					Map lMapPricingApiPlanWithInstallmentResponse=lOutputQuotePlanWithInstallmentList.get(lIndex)
					String lPlanListWithInstallmentResponse=lMapPricingApiPlanWithInstallmentResponse.ResponseObjectResponseText
					Map lMapPlanListWithInstallmentJson=new JsonSlurper().parseText(lPlanListWithInstallmentResponse)
					lIGNTestMasterCaseGroupTypeRow01=lIGNTestMasterCaseGroupTypeSheet01.addIGNTestMasterCaseGroupTypeRow()
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeRow01)){
						Map<String,String> lMapDataOutputList01=lIGNTestMasterCaseGroupTypeRow01.MapDataOutput
						lMapDataOutputList01.put('GroupAllGlobalShareControlStage01MainOutputItemIndex',lIGNTestMasterCaseGroupTypeRow01.getStrRowIndex())
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiSubsetIndex',lSubSetIndex)
						if(lTransactionType=='New Biz'){
							lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName','GetPlanWithInstallmentPrice')
						}else{
							lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputPriceApiEndPointSourceName','EndorsementPlanWithInstallmentPrice')
						}
						String lResponseStatusCode=lMapPricingApiPlanWithInstallmentResponse.ResponseObjectStatusText
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePlanListResponseStatus',lResponseStatusCode)
						String lResponseTimeText=lMapPricingApiPlanWithInstallmentResponse.ResponseObjectElapsedTimeText
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePlanListResponseTime',lResponseTimeText)
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePlanListResponseText',lPlanListWithInstallmentResponse)
						Map lVehicleDataRoot=lMapPlanListWithInstallmentJson.root.Quote.Vehicle_Data
						JsonBuilder lJsonVehicleData=new JsonBuilder(lVehicleDataRoot)
						String lStrVehicleDataRoot=lJsonVehicleData.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteVehicleDataRoot',lStrVehicleDataRoot)
						Map lCoverRoot=lMapPlanListWithInstallmentJson.root.Quote.Covers
						JsonBuilder lJsonCoverData=new JsonBuilder(lCoverRoot)
						String lStrCoverRoot=lJsonCoverData.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteCoverRoot',lStrCoverRoot)
						List lLoadingFactorListRoot=lMapPlanListWithInstallmentJson.root.Quote.Loading_Factors
						Map lMapLoadingFactor=[:]
						lMapLoadingFactor.put('LoadingFactors',lLoadingFactorListRoot)
						JsonBuilder lJsonLoadingFactor=new JsonBuilder(lMapLoadingFactor)
						String lStrLoadingFactorRoot=lJsonLoadingFactor.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteLoadingFactorRoot',lStrLoadingFactorRoot)
						Map lIrregularityRoot=lMapPlanListWithInstallmentJson.root.Quote.Irregularities
						String lStrIrregularityRoot=lIrregularityRoot.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuoteCoverIrregularityRoot',lStrIrregularityRoot)
						Map<String,String> lMapDataOutputList02=lIGNTestMasterCaseGroupTypeSheet01.getIGNTestMasterCaseGroupTypeRowMapDataOutput(lIGNTestMasterCaseGroupTypeRow01.getNumRowIndex())
						List lPaymentDetailRootList=lMapPlanListWithInstallmentJson.root.Quote.paymentDetails
						Map lMapPaymentDetailRoot=[:]
						lMapPaymentDetailRoot.put('PaymentDetail',lPaymentDetailRootList)
						JsonBuilder lJsonPaymentDetail=new JsonBuilder(lMapPaymentDetailRoot)
						String lStrPaymentDetail=lJsonPaymentDetail.toString()
						lMapDataOutputList01.put('GroupPricingApiShareQuoteAllStage02DoGetPriceListOutputQuotePaymentDetail',lStrPaymentDetail)
						IGNUemaHelper.printLog(lMapDataOutputList01.toString())
						IGNUemaHelper.printLog(lMapDataOutputList02.toString())
					}
				}
			}
			IGNUemaHelper.printLog(lIGNTestMasterCaseTypeMainCurrent.getParentIGNTestMasterCaseFactory().saveIGNTestMasterCaseFactory().toString())
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}