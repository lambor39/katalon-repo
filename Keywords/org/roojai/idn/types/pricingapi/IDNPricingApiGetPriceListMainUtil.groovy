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
import org.roojai.ignite.core.IGNSendEmail as IGNSendEmail
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.types.pricingapi.IDNPricingApiGetPriceListCoreType as IDNPricingApiGetPriceListCoreType
import org.roojai.idn.types.pricingapi.IDNPricingApiRestAPIHelper as IDNPricingApiRestAPIHelper
import org.roojai.idn.types.pricingapi.IDNPricingApiPrepareGenericDataInputUtil
import org.roojai.idn.types.pricingapi.IDNPricingApiLibraryGetPriceListMainUtil
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList
import org.roojai.idn.types.pricingapi.IDNPricingApiGetPriceListDatabaseHandling
import org.roojai.idn.core.IDNUemaHelper as IDNUemaHelper
import org.roojai.idn.core.IDNGlobalConst
import com.kms.katalon.core.testobject.ResponseObject
import org.openqa.selenium.*
public class IDNPricingApiGetPriceListMainUtil{
	private IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList parentStageController
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
	public static Integer CURRENT_PRICING_API_NUMBER_OF_SUBSET=0
	public static String CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME=''
	public Boolean inputCase(){
		Boolean lreturn=false
		String lStrActualResult=''
		String lStrResultMessage=''
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiCallTokenKey=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallTokenKey
			String lStrPricingApiCallSdkVersion=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallSdkVersion
			String lStrPricingApiCallStrProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallStrProductType
			String lStrPricingApiCallMasterSetId=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallMasterSetId
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			String lStrPricingApiProductCode=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiProductCode
			String lStrPricingApiQuoteRequiredTransactionType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			String lStrPricingApiJsonRootVehicleData=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootVehicleData
			String lStrPricingApiJsonRootQuotationInputPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootQuotationInputPartOne
			String lStrPricingApiJsonRootQuotationInputPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootQuotationInputPartTwo
			String lStrPricingApiJsonRootPlanOptionPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPlanOptionPartOne
			String lStrPricingApiJsonRootPlanOptionPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPlanOptionPartTwo
			String lStrPricingApiJsonRootMultiCoverPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootMultiCoverPartOne
			String lStrPricingApiJsonRootMultiCoverPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootMultiCoverPartTwo
			String lStrPricingApiJsonRootAdditionalCoveragePartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootAdditionalCoveragePartOne
			String lStrPricingApiJsonRootAdditionalCoveragePartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootAdditionalCoveragePartTwo
			String lStrPricingApiJsonRootPaymentPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPaymentPartOne
			String lStrPricingApiJsonRootPaymentPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootPaymentPartTwo
			String lStrPricingApiJsonRootInputPremiumPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootInputPremiumPartOne
			String lStrPricingApiJsonRootInputPremiumPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootInputPremiumPartTwo
			String lStrPricingApiJsonRootTransactionPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTransactionPartOne
			String lStrPricingApiJsonRootTransactionPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTransactionPartTwo
			String lStrPricingApiJsonRootTotalPremiumPartOne=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTotalPremiumPartOne
			String lStrPricingApiJsonRootTotalPremiumPartTwo=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiJsonRootTotalPremiumPartTwo
			String lStrPricingApiLibraryHostUrl=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiLibraryHostUrl
			String lStrPositiveCase=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPositiveCase
			Boolean lIsReferCaseDataToUse=this.parentStageController.getParentIGNTestExecutorTypeItem().getIsTestCaseRefer()
			lStrActualResult=''
			lStrResultMessage=''
			List lListPricingApiJsonRootQuotationInput=[]
			lListPricingApiJsonRootQuotationInput.add(lStrPricingApiJsonRootQuotationInputPartOne)
			lListPricingApiJsonRootQuotationInput.add(lStrPricingApiJsonRootQuotationInputPartTwo)
			String lStrPricingApiJsonRootQuotationInput=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootQuotationInput)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootQuotationInput)){
				return lreturn
			}
			List lListPricingApiJsonRootPlanOption=[]
			lListPricingApiJsonRootPlanOption.add(lStrPricingApiJsonRootPlanOptionPartOne)
			lListPricingApiJsonRootPlanOption.add(lStrPricingApiJsonRootPlanOptionPartTwo)
			String lStrPricingApiJsonRootPlanOption=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootPlanOption)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootPlanOption)){
				return lreturn
			}
			List lListPricingApiJsonRootMultiCover=[]
			lListPricingApiJsonRootMultiCover.add(lStrPricingApiJsonRootMultiCoverPartOne)
			lListPricingApiJsonRootMultiCover.add(lStrPricingApiJsonRootMultiCoverPartTwo)
			String lStrPricingApiJsonRootMultiCover=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootMultiCover)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootMultiCover)){
				return lreturn
			}
			List lListPricingApiJsonRootAdditionalCoverageData=[]
			lListPricingApiJsonRootAdditionalCoverageData.add(lStrPricingApiJsonRootAdditionalCoveragePartOne)
			lListPricingApiJsonRootAdditionalCoverageData.add(lStrPricingApiJsonRootAdditionalCoveragePartTwo)
			String lStrPricingApiJsonRootAdditionalCoverage=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootAdditionalCoverageData)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootAdditionalCoverage)){
				return lreturn
			}
			List lListPricingApiJsonRootPayment=[]
			lListPricingApiJsonRootPayment.add(lStrPricingApiJsonRootPaymentPartOne)
			lListPricingApiJsonRootPayment.add(lStrPricingApiJsonRootPaymentPartTwo)
			String lStrPricingApiJsonRootPayment=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootPayment)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootPayment)){
				return lreturn
			}
			List lListPricingApiJsonRootInputPremium=[]
			lListPricingApiJsonRootInputPremium.add(lStrPricingApiJsonRootInputPremiumPartOne)
			lListPricingApiJsonRootInputPremium.add(lStrPricingApiJsonRootInputPremiumPartTwo)
			String lStrPricingApiJsonRootInputPremium=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootInputPremium)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootInputPremium)){
				return lreturn
			}
			List lListPricingApiJsonRootTransaction=[]
			lListPricingApiJsonRootTransaction.add(lStrPricingApiJsonRootTransactionPartOne)
			lListPricingApiJsonRootTransaction.add(lStrPricingApiJsonRootTransactionPartTwo)
			String lStrPricingApiJsonRootTransaction=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootTransaction)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootTransaction)){
				return lreturn
			}
			List lListPricingApiJsonRootTotalPremium=[]
			lListPricingApiJsonRootTotalPremium.add(lStrPricingApiJsonRootTotalPremiumPartOne)
			lListPricingApiJsonRootTotalPremium.add(lStrPricingApiJsonRootTotalPremiumPartTwo)
			String lStrPricingApiJsonRootTotalPremium=IGNUemaHelper.getStringDecodedForExcelCell(lListPricingApiJsonRootTotalPremium)
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootTotalPremium)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
				return lreturn
			}
			Workbook lWorkBookExcelFileGenericTestData=null
			Sheet lSheetPricingApi=null
			String lStrExcelGenericFileName=''
			String lStrMacroGenericFileName=''
			Map lMapPricingApiSourceFileInformationResult=IDNPricingApiHelper.getMapPricingApiSourceFileInformation(lStrPricingApiQuoteRequiredProductType)
			if(!lMapPricingApiSourceFileInformationResult.Result){
				return lreturn
			}
			lStrExcelGenericFileName=lMapPricingApiSourceFileInformationResult.StrExcelGenericFileName
			lStrMacroGenericFileName=lMapPricingApiSourceFileInformationResult.StrMacroGenericFileName
			lWorkBookExcelFileGenericTestData=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(lStrExcelGenericFileName)
			this.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME=lStrExcelGenericFileName
			if(IGNUemaHelper.checkObjectNullOfObject(lWorkBookExcelFileGenericTestData)){
				IGNUemaHelper.printLog('PricingApi Generic Workbook not valid')
				return lreturn
			}
			lSheetPricingApi=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lWorkBookExcelFileGenericTestData,'PricingAPI')
			if(IGNUemaHelper.checkObjectNullOfObject(lSheetPricingApi)){
				IGNUemaHelper.printLog('PricingApi Generic  Sheet not valid')
				return lreturn
			}
			Sheet lSheetMasterData=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lWorkBookExcelFileGenericTestData,'MasterData-Mapping')
			if(IGNUemaHelper.checkObjectNullOfObject(lSheetMasterData)){
				IGNUemaHelper.printLog('PricingApi Generic Master Sheet not valid')
				return lreturn
			}
			Map lMapPricingApiSourceFileInformation=[:]
			lMapPricingApiSourceFileInformation.put('WorkBookExcelFileGenericTestData',lWorkBookExcelFileGenericTestData)
			lMapPricingApiSourceFileInformation.put('StrExcelGenericFileName',lStrExcelGenericFileName)
			lMapPricingApiSourceFileInformation.put('StrMacroGenericFileName',lStrMacroGenericFileName)
			lMapPricingApiSourceFileInformation.put('SheetPricingApi',lSheetPricingApi)
			Boolean lIsActualResult=false
			Boolean lIsRegClientOK=false,lIsPricingApiInitServiceCallResultOK=false,lIsPricingApiMultiPlanPriceCallResultOK=false
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lStrPositiveCase)
			Map lMapPricingApiInputOutput=[:]
			Boolean lIsInit=this.inputInitPricingApiInputOutput(lMapPricingApiInputOutput)
			lIsRegClientOK=this.inputPricingApiCallRegisterClient(lMapPricingApiInputOutput)
			if(!lIsRegClientOK){
				return lreturn
			}
			lIsPricingApiInitServiceCallResultOK=this.inputPricingApiCallInitService(lMapPricingApiInputOutput)
			if(!lIsPricingApiInitServiceCallResultOK){
				return lreturn
			}
			lMapPricingApiInputOutput.put('StrPricingApiJsonRootTotalPremium',lStrPricingApiJsonRootTotalPremium)
			lMapPricingApiInputOutput.put('StrPricingApiJsonRootMultiCover',lStrPricingApiJsonRootMultiCover)
			String lStrPricingApiVersion01JsonRootQuotationInput=this.preparePricingApiJsonQuotationInput(lSheetPricingApi,lSheetMasterData,lStrPricingApiJsonRootQuotationInput,lStrPricingApiJsonRootVehicleData,lMapPricingApiInputOutput)
			Boolean lIsSaveWorkBook=IGNUemaHelper.saveExcelWorkbookByFileName(lStrExcelGenericFileName,lWorkBookExcelFileGenericTestData)
			if(!lIsSaveWorkBook){
				return lreturn
			}
			lIsPricingApiMultiPlanPriceCallResultOK=this.inputPricingApiCallMultiPlanPrice(lStrPricingApiVersion01JsonRootQuotationInput,lStrPricingApiJsonRootMultiCover,lStrPricingApiJsonRootAdditionalCoverage,lIsPositiveCase,lMapPricingApiInputOutput,lMapPricingApiSourceFileInformation)
			if(!lIsPricingApiMultiPlanPriceCallResultOK){
				return lreturn
			}
			Map lMapPricingApiGetPlanPriceResult=this.inputPricingApiGetPlanPriceResult(lStrPricingApiVersion01JsonRootQuotationInput,lStrPricingApiJsonRootVehicleData,lStrPricingApiJsonRootPlanOption,lStrPricingApiJsonRootMultiCover,lStrPricingApiJsonRootAdditionalCoverage,lStrPricingApiJsonRootInputPremium,lStrPricingApiJsonRootTotalPremium,lStrPricingApiJsonRootTransaction,lStrPricingApiJsonRootPayment,lMapPricingApiInputOutput,lMapPricingApiSourceFileInformation)
			List lListCollectedPricingApiQuoteGetPlanPrice=lMapPricingApiGetPlanPriceResult.ListCollectedPricingApiQuoteGetPlanPrice
			List lListCollectedPricingApiQuoteGetPlanWithInstallmentPrice=lMapPricingApiGetPlanPriceResult.ListCollectedPricingApiQuoteGetPlanWithInstallmentPrice
			lIsActualResult=lMapPricingApiGetPlanPriceResult.Result
			lStrActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult=lStrActualResult
			lMapPricingApiInputOutput.ActualResult=lStrActualResult
			lMapPricingApiInputOutput.ResultMessage=lStrResultMessage
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldActualResult=lMapPricingApiInputOutput.ActualResult
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldResultMessage=lMapPricingApiInputOutput.ResultMessage
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lStrPositiveCase=strPositiveCase.trim()
		Boolean lIsPositiveCase=false
		try{
			Boolean lResult=false
			lreturn.put('PositiveCase',lStrPositiveCase)
			lreturn.put('IsPositiveCase',lIsPositiveCase)
			lreturn.put('Result',lResult)
			lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lStrPositiveCase)
			lStrPositiveCase=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lResult=lStrPositiveCase.length()>0
			if(lResult){
				lreturn.put('PositiveCase',lStrPositiveCase)
				lreturn.put('IsPositiveCase',lIsPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map getMapPricingApiJsonCoverageAndCover(String strPricingApiJsonRootMultiCover,String strPricingApiJsonRootAdditionalCoverage){
		Boolean lResult=false
		Map lreturn=[:]
		List<String> lListPricingApiCoverageAll=new ArrayList()
		List<String> lListPricingApiCoverName=new ArrayList<String>()
		try{
			lreturn.put('ListPricingApiCoverageAll',lListPricingApiCoverageAll)
			lreturn.put('ListPricingApiCoverName', lListPricingApiCoverName)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootMultiCover)){
				return lreturn
			}
			String lStrPricingApiJsonRootMultiCover=strPricingApiJsonRootMultiCover.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootMultiCover)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootAdditionalCoverage)){
				return lreturn
			}
			String lStrPricingApiJsonRootAdditionalCoverage=strPricingApiJsonRootAdditionalCoverage.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootAdditionalCoverage)){
				return lreturn
			}
			Map lMapPricingApiJsonRootMultiCover=new JsonSlurper().parseText(lStrPricingApiJsonRootMultiCover)
			List lListCover=lMapPricingApiJsonRootMultiCover.CoverList
			Map lMapPricingApiJsonRootAdditionalCoverage=new JsonSlurper().parseText(lStrPricingApiJsonRootAdditionalCoverage)
			Map lMapPricingApiJsonRootAdditionalListCoverage=lMapPricingApiJsonRootAdditionalCoverage.AdditionalCoverageList
			List lMapPricingApiJsonRootAdditionalListCoverageAll=lMapPricingApiJsonRootAdditionalListCoverage.AdditionalCoverage
			String lStrMultiCoverName=''
			Boolean lIsOK=false
			for(Integer lIndex=0;lIndex<=lListCover.size()-1;lIndex++){
				String lStrAdditionalCoverageName=''
				List lListPricingApiCoverageName=[]
				List lListSelectedCoverList=lListCover.get(lIndex)
				Object lObjectSelectedAdditionalListCoverage=lMapPricingApiJsonRootAdditionalListCoverageAll.get(lIndex)
				List lListSelectedAdditionalCoverage=[]
				if(lObjectSelectedAdditionalListCoverage.getClass()==LazyMap.class){
					Map lMapSelectedAdditionalCoverage=lMapPricingApiJsonRootAdditionalListCoverageAll.get(lIndex)
					lListSelectedAdditionalCoverage.add(lMapSelectedAdditionalCoverage)
				}
				else if(lObjectSelectedAdditionalListCoverage.getClass()==ArrayList.class){
					lListSelectedAdditionalCoverage=lMapPricingApiJsonRootAdditionalListCoverageAll.get(lIndex)
				}
				for(Integer lListIndex=0;lListIndex<=lListSelectedCoverList.size()-1;lListIndex++){
					lStrMultiCoverName=lListSelectedCoverList.get(lListIndex)
					for(Integer lMainIndex=0;lMainIndex<=lListSelectedAdditionalCoverage.size()-1;lMainIndex++){
						Map lMapSelectedAdditionalCoverage=lListSelectedAdditionalCoverage.get(lListIndex)
						for(Map.Entry lEntry : lMapSelectedAdditionalCoverage.entrySet()){
							String lKey=lEntry.getKey()
							if(lKey.endsWith('Name')){
								lStrAdditionalCoverageName=lKey.replace('Name','')
								String lValue=lEntry.getValue()
								if(lValue!='None'){
									lListPricingApiCoverageName.add(lValue)
								}
							}
						}
					}
				}
				lListPricingApiCoverageAll.add(lListPricingApiCoverageName)
				lListPricingApiCoverName.add(lStrMultiCoverName)
			}
			lIsOK=lListPricingApiCoverName.size()>0
			lIsOK=lIsOK&&lListPricingApiCoverageAll.size()>0
			lResult=lIsOK
			if(lResult){
				lreturn.put('ListPricingApiCoverageAll',lListPricingApiCoverageAll)
				lreturn.put('ListPricingApiCoverName', lListPricingApiCoverName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputEndorseCancellationMethodToExcel(Sheet sheetPricingApi,String strPricingApiJsonRootQuotationInput,String strPricingApiJsonRootVehicleData){
		Boolean lResult=false
		Boolean lreturn=false
		List<String> lListPricingApiCoverageAll=new ArrayList<String>()
		List<String> lListPricingApiCoverName=new ArrayList<String>()
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		String lStrPricingApiJsonRootQuotationInput=strPricingApiJsonRootQuotationInput.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootVehicleData)){
			return lreturn
		}
		String lStrPricingApiJsonRootVehicleData=strPricingApiJsonRootVehicleData.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
			return lreturn
		}
		try{
			Boolean lIsWriteEndorseCancellationMethodToExcelDone=false
			List<Map> lListQuoteTransactionDate=[]
			Map lMapJsonRootVehicleData=new JsonSlurper().parseText(lStrPricingApiJsonRootVehicleData)
			lListQuoteTransactionDate=lMapJsonRootVehicleData.QuotationInputDateList
			Map lMapJsonRootQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonRootQuotationInput)
			String lStrEndorseCancellationMethod=lMapJsonRootQuotationInput.root.quoteData.Endorsement_Cancellation_Method
			for(Integer lDateIndex=0;lDateIndex<=lListQuoteTransactionDate.size()-1;lDateIndex++){
				Map lMapTransactionDate=lListQuoteTransactionDate.get(lDateIndex)
				Map lMapTransactionEndorseCancellationMethod=lMapTransactionDate.EndorseCancellationMethod
				Integer lNumEndorseCancellationMethodRow=lMapTransactionEndorseCancellationMethod.RowNumber
				Integer lNumEndorseCancellationMethodColumn=lMapTransactionEndorseCancellationMethod.ColumnNumber
				lIsWriteEndorseCancellationMethodToExcelDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumEndorseCancellationMethodRow,lNumEndorseCancellationMethodColumn,lStrEndorseCancellationMethod)
				if(!lIsWriteEndorseCancellationMethodToExcelDone){
					return lreturn
				}
			}
			lResult=lIsWriteEndorseCancellationMethodToExcelDone
			if(lResult){
				return lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean checkPricingApiJsonStructureValidation(Sheet sheetMasterData,String strPricingApiJsonRootQuotationInput){
		Boolean lResult=false
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterData)){
			return lreturn
		}
		Sheet lSheetMasterData=sheetMasterData
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		String lStrPricingApiJsonRootQuotationInput=strPricingApiJsonRootQuotationInput.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		try{
			Map lMapRootParameterWithMasterDataParmeter=[:]
			Map lMapRootParameterWithMasterDataParmeterResult=IDNPricingApiPrepareGenericDataInputUtil.inputMapTargetParameterWithMasterParameter(lSheetMasterData,'Root')
			if(lMapRootParameterWithMasterDataParmeterResult.Result){
				lMapRootParameterWithMasterDataParmeter=lMapRootParameterWithMasterDataParmeterResult.MasterDataParameter
			}
			Boolean lIsJsonQuotationInputStructureValidationOK=false
			Map lMapJsonRootQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonRootQuotationInput)
			Object lObjectMapJsonQuotationInputRoot=lMapJsonRootQuotationInput.get('root')
			if(IGNUemaHelper.checkObjectNullOfObject(lObjectMapJsonQuotationInputRoot)){
				return lreturn
			}else{
				for(Map.Entry lEntry in lMapRootParameterWithMasterDataParmeter){
					String lStrKey=lEntry.getKey()
					String lStrValue=lEntry.getValue()
					Map lMapJsonQuotationInput=lObjectMapJsonQuotationInputRoot
					Object lObjectJsonQuotationInputQuoteData=lMapJsonQuotationInput.get(lStrKey)
					if(!IGNUemaHelper.checkObjectNullOfObject(lObjectJsonQuotationInputQuoteData)){
						String[] lArrayQuoteValue=lStrValue.split('/')
						Map lMapQuotationInputQuoteData=lObjectJsonQuotationInputQuoteData
						for(Integer lIndex=0;lIndex<=lArrayQuoteValue.size()-1;lIndex++){
							String lStrRequiredQuoteParameterName=lArrayQuoteValue[lIndex]
							Object lObjectQuotationInputQuoteData=lMapQuotationInputQuoteData.get(lStrRequiredQuoteParameterName)
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
			lreturn=lIsJsonQuotationInputStructureValidationOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyQuoteDateToExcelSheet(Sheet sheetPricingApi,String strPricingApiQuoteRequiredTransactionType,String strPricingApiJsonRootVehicleData,Map mapPricingApiJsonRootQuotationInput){
		Boolean lResult=false
		Map lreturn=[:]
		String lStrPolicyStartDateText=''
		String lStrEndorsementEffectiveDateText=''
		Map lMapJsonRootQuotationInput=[:]
		List<String> lListPricingApiCoverName=new ArrayList<String>()
		try{
			lreturn.put('StrPolicyStartDate',lStrPolicyStartDateText)
			lreturn.put('StrEndorsementEffectiveDate',lStrEndorsementEffectiveDateText)
			lreturn.put('MapJsonRootQuotationInput',lMapJsonRootQuotationInput)
			lreturn.put('Result',lResult)
			Boolean lIsWriteEffectiveDateTextToExcelDone=false
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiQuoteRequiredTransactionType)){
				return lreturn
			}
			String lStrPricingApiQuoteRequiredTransactionType=strPricingApiQuoteRequiredTransactionType.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiQuoteRequiredTransactionType)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonRootQuotationInput)){
				return lreturn
			}
			lMapJsonRootQuotationInput=mapPricingApiJsonRootQuotationInput
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootVehicleData)){
				return lreturn
			}
			String lStrPricingApiJsonRootVehicleData=strPricingApiJsonRootVehicleData.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
				return lreturn
			}
			Map lMapJsonRootVehicleData=new JsonSlurper().parseText(lStrPricingApiJsonRootVehicleData)
			List lListQuoteTransactionDate=lMapJsonRootVehicleData.QuotationInputDateList
			String lStartDateOffset=lMapJsonRootQuotationInput.root.quoteData.startDate
			Map lMapQuoteStartDate=this.inputQuoteOptionalPolicyStartDate('Yes',lStartDateOffset,'')
			if(lMapQuoteStartDate.Result){
				lStrPolicyStartDateText=lMapQuoteStartDate.QuoteOptionalPolicyStartDate
				lMapJsonRootQuotationInput.root.quoteData.put('startDate',lStrPolicyStartDateText)
			}
			if(lStrPricingApiQuoteRequiredTransactionType=='New Biz'){
				lStrEndorsementEffectiveDateText=lStrPolicyStartDateText
				lMapJsonRootQuotationInput.root.quoteData.put('endorseEffectiveDate',lStrEndorsementEffectiveDateText)
			}else{
				String lEffectiveDateOffset=lMapJsonRootQuotationInput.root.quoteData.endorseEffectiveDate
				Map lMapQuoteEffectiveDate=this.inputQuoteOptionalEndorsementEffectiveDate('Yes',lEffectiveDateOffset,'')
				if(lMapQuoteEffectiveDate.Result){
					lStrEndorsementEffectiveDateText=lMapQuoteEffectiveDate.QuoteOptionalEndorsementEffectiveDate
					lMapJsonRootQuotationInput.root.quoteData.put('endorseEffectiveDate',lStrEndorsementEffectiveDateText)
				}
			}
			for(Integer lDateIndex=0;lDateIndex<=lListQuoteTransactionDate.size()-1;lDateIndex++){
				Map lMapTransactionDate=lListQuoteTransactionDate.get(lDateIndex)
				Map lMapTransactionStartDate=lMapTransactionDate.StartDate
				Map lMapTransactionEffectiveDate=lMapTransactionDate.EffectiveDate
				Integer lNumStartDateRowNumber=lMapTransactionStartDate.RowNumber
				Integer lNumStartDateColumnNumber=lMapTransactionStartDate.ColumnNumber
				Boolean lIsWriteStartDateTextToExcelDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumStartDateRowNumber,lNumStartDateColumnNumber,lStrPolicyStartDateText)
				if(!lIsWriteStartDateTextToExcelDone){
					return lreturn
				}
				Integer lNumEffectiveDateRowNumber=lMapTransactionEffectiveDate.RowNumber
				Integer lNumEffectiveDateColumnNumber=lMapTransactionEffectiveDate.ColumnNumber
				if(lStrPricingApiQuoteRequiredTransactionType=='Endorsement'||lStrPricingApiQuoteRequiredTransactionType=='Cancellation'){
					lIsWriteEffectiveDateTextToExcelDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumEffectiveDateRowNumber,lNumEffectiveDateColumnNumber,lStrEndorsementEffectiveDateText)
				}else{
					lIsWriteEffectiveDateTextToExcelDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumEffectiveDateRowNumber,lNumEffectiveDateColumnNumber,lStrPolicyStartDateText)
				}
				if(!lIsWriteEffectiveDateTextToExcelDone){
					return lreturn
				}
			}
			lResult=lIsWriteEffectiveDateTextToExcelDone
			if(lResult){
				lreturn.put('StrPolicyStartDate',lStrPolicyStartDateText)
				lreturn.put('StrEndorsementEffectiveDate',lStrEndorsementEffectiveDateText)
				lreturn.put('MapJsonRootQuotationInput',lMapJsonRootQuotationInput)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiGetPlanPriceResult(String strPricingApiJsonRootQuotationInput,String strPricingApiJsonRootVehicleData,String strPricingApiJsonRootPlanOption,String strPricingApiJsonRootMultiCover,String strPricingApiJsonRootAdditionalCoverage,String strPricingApiJsonRootInputPremium,String strPricingApiJsonRootTotalPremium,String strPricingApiJsonRootTransaction,String strPricingApiJsonRootPayment,Map mapPricingApiInputOutput,Map mapPricingApiSourceFileInformation){
		Map lreturn=[:]
		List lListCollectedPricingApiQuoteGetPlanPrice=new ArrayList()
		List lListCollectedPricingApiQuoteGetPlanWithInstallmentPrice=new ArrayList()
		Boolean lResult=false
		try{
			lreturn.put('Result',lResult)
			lreturn.put('ListCollectedPricingApiQuoteGetPlanPrice',lListCollectedPricingApiQuoteGetPlanPrice)
			lreturn.put('ListCollectedPricingApiQuoteGetPlanWithInstallmentPrice',lListCollectedPricingApiQuoteGetPlanWithInstallmentPrice)
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootQuotationInput)){
				return lreturn
			}
			String lStrPricingApiJsonRootQuotationInput=strPricingApiJsonRootQuotationInput
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootVehicleData)){
				return lreturn
			}
			String lStrPricingApiJsonRootVehicleData=strPricingApiJsonRootVehicleData
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootPlanOption)){
				return lreturn
			}
			String lStrPricingApiJsonRootPlanOption=strPricingApiJsonRootPlanOption
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootPlanOption)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootMultiCover)){
				return lreturn
			}
			String lStrPricingApiJsonRootMultiCover=strPricingApiJsonRootMultiCover
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootMultiCover)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootAdditionalCoverage)){
				return lreturn
			}
			String lStrPricingApiJsonRootAdditionalCoverage=strPricingApiJsonRootAdditionalCoverage
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootAdditionalCoverage)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootInputPremium)){
				return lreturn
			}
			String lStrPricingApiJsonRootInputPremium=strPricingApiJsonRootInputPremium
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootInputPremium)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootTotalPremium)){
				return lreturn
			}
			String lStrPricingApiJsonRootTotalPremium=strPricingApiJsonRootTotalPremium
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootTotalPremium)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootTransaction)){
				return lreturn
			}
			String lStrPricingApiJsonRootTransaction=strPricingApiJsonRootTransaction
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootTransaction)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootPayment)){
				return lreturn
			}
			String lStrPricingApiJsonRootPayment=strPricingApiJsonRootPayment
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootPayment)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiSourceFileInformation)){
				return lreturn
			}
			Map lMapPricingApiSourceFileInformation=mapPricingApiSourceFileInformation
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPositiveCase=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPositiveCase
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lStrPositiveCase)
			Boolean lIsOK=true
			Workbook lWorkBookExcelFileGenericTestData=lMapPricingApiSourceFileInformation.WorkBookExcelFileGenericTestData
			String lStrExcelGenericFileName=lMapPricingApiSourceFileInformation.StrExcelGenericFileName
			String lStrExcelMacroFileName=lMapPricingApiSourceFileInformation.StrMacroGenericFileName
			Sheet lSheetPricingApi=lMapPricingApiSourceFileInformation.SheetPricingApi
			List lListPricingApiJsonPlanOption=new JsonSlurper().parseText(lStrPricingApiJsonRootPlanOption)
			Map lMapPricingApiJsonQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonRootQuotationInput)
			Map lMapPricingApiJsonPayment=new JsonSlurper().parseText(lStrPricingApiJsonRootPayment)
			Map lMapPricingApiJsonRootInputPremium=new JsonSlurper().parseText(lStrPricingApiJsonRootInputPremium)
			Map lMapPricingApiJsonTotalPremium=new JsonSlurper().parseText(lStrPricingApiJsonRootTotalPremium)
			Map lMapPricingApiJsonTransaction=new JsonSlurper().parseText(lStrPricingApiJsonRootTransaction)
			Map lMapPricingApiJsonAdditionalCoverage=new JsonSlurper().parseText(lStrPricingApiJsonRootAdditionalCoverage)
			Map lMapPricingApiJsonMultiCover=new JsonSlurper().parseText(lStrPricingApiJsonRootMultiCover)
			String lStrPricingApiMultiPlanPricingApiResponse=mapPricingApiInputOutput.MultiplePlanPriceResponseText
			Map lMapPricingApiMultiPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiMultiPlanPricingApiResponse)
			List<String> lListCover=lMapPricingApiJsonMultiCover.CoverList
			Map lMapListPricingApiJsonAdditionalCoverage=lMapPricingApiJsonAdditionalCoverage.AdditionalCoverageList
			List<String> lListPricingApiJsonRootAdditionalCoverageAll=lMapListPricingApiJsonAdditionalCoverage.AdditionalCoverage
			Map lMapListPricingApiJsonRootInputPremium=lMapPricingApiJsonRootInputPremium.InputPremiumList
			List lListPricingApiJsonRootInputPremiumAll=lMapListPricingApiJsonRootInputPremium.InputPremium
			Map lMapListPricingApiPayment=lMapPricingApiJsonPayment.Payment
			List<String> lListPricingApiJsonRootPaymentAll=lMapListPricingApiPayment.PaymentList
			List<String> lListPricingApiJsonRootTotalPremiumAll=lMapPricingApiJsonTotalPremium.Premium
			List<String> lListPricingApiJsonRootTransactionAll=lMapPricingApiJsonTransaction.Transaction
			Map lMapSelectedPricingApiPlanOption=[:]
			List<String> lListSelectedPricingApiCover=new ArrayList()
			List<String> lListSelectedPricingApiTransaction=new ArrayList()
			List<String> lListSelectedPricingApiTotalPremium=new ArrayList()
			List<String> lListSelectedPricingApiPayment=new ArrayList()
			List<String> lListSelectedPricingApiAdditionalCoverage=new ArrayList()
			List<String> lListSelectedPricingApiInputPremium=new ArrayList()
			List<String> lListPricingApiJsonRootAdditionalCoverage=new ArrayList()
			List<String> lListSelectedPricingApiPlanOption=new ArrayList()
			List<String> lListPricingApiInputPremium=new ArrayList()
			List<String> lListDecodedCover=new ArrayList()
			List<String> lListDecodedCoverage=new ArrayList()
			List<String> lListDecodedCoverageName=new ArrayList()
			List<String> lListDecodedAdditionalCoveragePremiumWithLoading=new ArrayList()
			List<String> lListDecodedAdditionalCoveragePremiumWithoutLoading=new ArrayList()
			List<String> lListDecodedPremiumValidationResult=new ArrayList()
			Map lMapInputPricingApiPaymentFrequencyResult=[:]
			Boolean lIsPricingApiFlagApplyLoadingFactor=false
			String lStrPricingApiPaymentFrequency=''
			String lStrPricingApiLoadingFactor=''
			String lStrPricingApiMasterSetId=''
			String lStrFlagApplyLoadingFactor='Yes'
			Boolean lIsFlagApplyLoadingFactorOK=false
			Integer lNumDataSubsetIndex=0
			for(Integer lIndex=0;lIndex<=lListCover.size()-1;lIndex++){
				Map lMapCollectedPricingApiDetailResult=[:]
				List<String> lListCollectedPricingApiPlanOption=new ArrayList()
				List<String> lListCollectedPricingApiCover=new ArrayList()
				List<String> lListCollectedPricingApiCoverage=new ArrayList()
				List<String> lListCollectedPricingApiCoverageName=new ArrayList()
				List<String> lListCollectedPricingApiCoverageSA=new ArrayList()
				List<String> lListCollectedPricingApiCoverageValidationTestResult=new ArrayList()
				List<Float> lListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading=new ArrayList()
				List<Float> lListCollectedPricingApiAdditionalCoveragePremiumWithLoading=new ArrayList()
				lListSelectedPricingApiAdditionalCoverage=this.getListDecodedPricingApiGenericData(lListPricingApiJsonRootAdditionalCoverageAll.get(lIndex))
				lListSelectedPricingApiInputPremium=this.getListDecodedPricingApiGenericData(lListPricingApiJsonRootInputPremiumAll.get(lIndex))
				lListSelectedPricingApiPayment=this.getListDecodedPricingApiGenericData(lListPricingApiJsonRootPaymentAll.get(lIndex))
				lListSelectedPricingApiTransaction=this.getListDecodedPricingApiGenericData(lListPricingApiJsonRootTransactionAll.get(lIndex))
				lListSelectedPricingApiTotalPremium=this.getListDecodedPricingApiGenericData(lListPricingApiJsonRootTotalPremiumAll.get(lIndex))
				lListSelectedPricingApiPlanOption=lListPricingApiJsonPlanOption.get(lIndex)
				lMapInputPricingApiPaymentFrequencyResult=this.inputMapPricingApiPaymentFrequency(lListSelectedPricingApiPayment,lMapPricingApiMultiPlanPriceResponse,lMapPricingApiJsonQuotationInput,lMapPricingApiSourceFileInformation)
				if(!lMapInputPricingApiPaymentFrequencyResult.Result){
					return lreturn
				}
				lStrPricingApiPaymentFrequency=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiPaymentFrequency
				lStrPricingApiLoadingFactor=lMapInputPricingApiPaymentFrequencyResult.StrLoadingFactor
				lStrPricingApiMasterSetId=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiMasterSetId
				lListSelectedPricingApiCover=lListCover.get(lIndex)
				for(Integer lListIndex=0;lListIndex<=lListSelectedPricingApiCover.size()-1;lListIndex++){
					String lStrCoverName=lListSelectedPricingApiCover.get(lListIndex)
					lMapSelectedPricingApiPlanOption=lListSelectedPricingApiPlanOption.get(lListIndex)
					Map lMapPricingApiSelectedAdditionalCoverage=lListSelectedPricingApiAdditionalCoverage.get(lListIndex)
					Map lMapPricingApiInputCoverageResult=this.getMapPricingApiInputCoverage(lMapPricingApiSelectedAdditionalCoverage)
					List<String> lListPricingApiCoverageName=lMapPricingApiInputCoverageResult.ListPricingApiCoverageName
					lListCollectedPricingApiCoverageName.add(lListPricingApiCoverageName)
					List<String> lListPricingApiCoverageSA=lMapPricingApiInputCoverageResult.ListPricingApiCoverageSA
					lListCollectedPricingApiCoverageSA.add(lListPricingApiCoverageSA)
					List<String> lListPricingApiCoveragePremium=lMapPricingApiInputCoverageResult.ListPricingApiCoveragePremium
					Map lMapPricingApiCoverageValidationTestResult=lMapPricingApiInputCoverageResult.MapPricingApiCoverageValidationTestResult
					lListCollectedPricingApiCoverageValidationTestResult.add(lMapPricingApiCoverageValidationTestResult)
					lStrPricingApiPaymentFrequency=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiPaymentFrequency
					lStrPricingApiLoadingFactor=lMapInputPricingApiPaymentFrequencyResult.StrLoadingFactor
					lStrPricingApiMasterSetId=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiMasterSetId
					lIsPricingApiFlagApplyLoadingFactor=lMapInputPricingApiPaymentFrequencyResult.BoolIsPricingApiFlagApplyLoadingFactor
					Map lMapPricingApiPlanOptionResult=this.inputMapPricingApiPlanOption(lSheetPricingApi,lStrCoverName,lMapPricingApiJsonQuotationInput,lMapPricingApiMultiPlanPriceResponse,lMapSelectedPricingApiPlanOption)
					if(!lMapPricingApiPlanOptionResult.Result){
						return lreturn
					}
					lMapSelectedPricingApiPlanOption=lMapPricingApiPlanOptionResult.MapSelectedPricingApiPlanOption
					lListCollectedPricingApiPlanOption.add(lMapSelectedPricingApiPlanOption)
					String lStrPricingApiCoverPlanName=lMapPricingApiPlanOptionResult.StrPricingApiCoverPlanName
					Map lMapSelectedPricingApiCover=lMapPricingApiPlanOptionResult.MapSelectedPricingApiCover
					lListCollectedPricingApiCover.add(lMapSelectedPricingApiCover)
					Map lMapSelectedPricingApiInputPremium=lListSelectedPricingApiInputPremium.get(lListIndex)
					Map lMapPricingApiInputCoverPremium=this.inputPricingApiCoverPremium(lSheetPricingApi,lStrCoverName,lStrPricingApiCoverPlanName,lMapPricingApiMultiPlanPriceResponse,lMapSelectedPricingApiInputPremium,lMapInputPricingApiPaymentFrequencyResult)
					if(!lMapPricingApiInputCoverPremium.Result){
						return lreturn
					}
					String lStrPricingApiCoverPremium=lMapPricingApiInputCoverPremium.StrPricingApiCoverPremium
					List<Map> lListPricingApiSelectedAdditionalCoverage=new ArrayList()
					Float lNumPricingApiSelectedAdditionalCoverageTotal=0.0
					Map lMapInputPricingApiAdditionalCoverageResult=[:]
					lMapInputPricingApiAdditionalCoverageResult=this.inputPricingApiAdditionalCoverageResult(lSheetPricingApi,lMapSelectedPricingApiInputPremium,lMapPricingApiMultiPlanPriceResponse,lMapPricingApiInputCoverageResult,lMapPricingApiPlanOptionResult,lMapInputPricingApiPaymentFrequencyResult)
					List lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading=lMapInputPricingApiAdditionalCoverageResult.ListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading
					lListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading.add(lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading)
					List lListPricingApiSelectedAdditionalCoveragePremiumWithLoading=lMapInputPricingApiAdditionalCoverageResult.ListPricingApiSelectedAdditionalCoveragePremiumWithLoading
					lListCollectedPricingApiAdditionalCoveragePremiumWithLoading.add(lListPricingApiSelectedAdditionalCoveragePremiumWithLoading)
					lListPricingApiSelectedAdditionalCoverage=lMapInputPricingApiAdditionalCoverageResult.ListPricingApiSelectedAdditionalCoverage
					lListCollectedPricingApiCoverage.add(lListPricingApiSelectedAdditionalCoverage)
					lNumPricingApiSelectedAdditionalCoverageTotal=lMapInputPricingApiAdditionalCoverageResult.NumPricingApiSelectedAdditionalCoverageTotal
					Map lMapPricingApiPayment=lListSelectedPricingApiPayment.get(lListIndex)
					Boolean lIsInputPricingApiAnnualNetPremiumResult=this.inputPricingApiAnnualNetPremiumResult(lSheetPricingApi,lNumPricingApiSelectedAdditionalCoverageTotal,lStrPricingApiCoverPremium,lMapPricingApiPayment,lMapInputPricingApiPaymentFrequencyResult)
				}
				lNumDataSubsetIndex=lNumDataSubsetIndex+1
				Boolean lIsSaveWorkBook=IGNUemaHelper.saveExcelWorkbookByFileName(lStrExcelGenericFileName,lWorkBookExcelFileGenericTestData)
				if(!lIsSaveWorkBook){
					return lreturn
				}
				Boolean lIsOpenExcelApplication=IGNUemaHelper.runExcelMacroFromExcelFileName(lStrExcelMacroFileName,'SpillWorksheetPricingAPI')
				lWorkBookExcelFileGenericTestData=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(lStrExcelGenericFileName)
				lSheetPricingApi=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lWorkBookExcelFileGenericTestData,'PricingAPI')
				Map lMapInputPricingApiMandatoryFieldForRequest=this.inputPricingApiMandatoryFieldForRequest(lSheetPricingApi,lMapPricingApiJsonQuotationInput,lStrPricingApiJsonRootVehicleData,lMapInputPricingApiPaymentFrequencyResult,mapPricingApiInputOutput)
				if(!lMapInputPricingApiMandatoryFieldForRequest.Result){
					return lreturn
				}
				String lStrPricingApiJsonQuotationInput=lMapInputPricingApiMandatoryFieldForRequest.StrPricingApiJsonQuotationInput
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiPlanOption',lListCollectedPricingApiPlanOption)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiCover',lListSelectedPricingApiCover)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiCoverage',lListCollectedPricingApiCoverage)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiCoverageName',lListCollectedPricingApiCoverageName)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiCoverageSA',lListCollectedPricingApiCoverageSA)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading',lListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiAdditionalCoveragePremiumWithLoading',lListCollectedPricingApiAdditionalCoveragePremiumWithLoading)
				lMapCollectedPricingApiDetailResult.put('ListCollectedPricingApiCoverageValidationTestResult',lListCollectedPricingApiCoverageValidationTestResult)
				lMapCollectedPricingApiDetailResult.put('StrPricingApiPaymentFrequency',lStrPricingApiPaymentFrequency)
				lMapCollectedPricingApiDetailResult.put('BoolIsPricingApiFlagApplyLoadingFactor',lIsPricingApiFlagApplyLoadingFactor)
				lMapCollectedPricingApiDetailResult.put('StrPricingApiLibraryJsonQuotationInput',lStrPricingApiJsonQuotationInput)
				String lStrPricingApiRequestProductTypeName=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiRequestProductTypeName
				lMapCollectedPricingApiDetailResult.put('StrPricingApiRequestProductTypeName',lStrPricingApiRequestProductTypeName)
				Map lMapInputPricingApiCoverField=this.inputPricingApiCoverField(lStrPricingApiJsonQuotationInput,lListCollectedPricingApiCover,lListCollectedPricingApiCoverage,lListCollectedPricingApiCoverageName,lListCollectedPricingApiCoverageSA)
				if(!lMapInputPricingApiCoverField.Result){
					return lreturn
				}
				lStrPricingApiJsonQuotationInput=lMapInputPricingApiCoverField.StrPricingApiVersion01JsonQuotationInput
				Map lMapInputPricingApiGetPlanPriceResult=this.inputCallPricingApiGetPlanPriceResult(lStrPricingApiJsonQuotationInput,lStrPricingApiPaymentFrequency,mapPricingApiInputOutput)
				Map lMapPricingApiQuoteGetPlanPrice=lMapInputPricingApiGetPlanPriceResult.MapPricingApiQuoteGetPlanPrice
				lListCollectedPricingApiQuoteGetPlanPrice.add(lMapPricingApiQuoteGetPlanPrice)
				Map lMapPricingApiQuoteGetPlanPriceWithInstallmentPrice=lMapInputPricingApiGetPlanPriceResult.MapPricingApiQuoteGetPlanPriceWithInstallmentPrice
				lListCollectedPricingApiQuoteGetPlanWithInstallmentPrice.add(lMapPricingApiQuoteGetPlanPriceWithInstallmentPrice)
				if(!lMapInputPricingApiGetPlanPriceResult.Result){
					return lreturn
				}
				Map lMapInputPricingApiInstallmentAndDownPaymentAmountResult=this.inputMapPricingApiInstallmentAndDownPaymentAmountResult(lSheetPricingApi,lListSelectedPricingApiTransaction,lListSelectedPricingApiTotalPremium)
				Map lMapPricingApiLibraryGetPlanPriceResult=this.inputCallPricingApiLibraryGetPlanPriceResult(lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput)
				Boolean lIsPricingApiLibraryAdditionalCoveragePremiumValidationOK=true
				Boolean lIsPricingApiAdditionalCoveragePremiumValidationOK=true
				Boolean lIsPricingApiLibraryPremiumValidationOK=true
				lIsPricingApiLibraryAdditionalCoveragePremiumValidationOK=this.validatePricingApiLibraryAdditionalCoveragePremiumResult(lSheetPricingApi,lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput,lMapPricingApiLibraryGetPlanPriceResult)
				lIsPricingApiAdditionalCoveragePremiumValidationOK=this.validatePricingApiAdditionalCoveragePremiumResult(lSheetPricingApi,lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput,lMapInputPricingApiPaymentFrequencyResult)
				IGNUemaHelper.printLog('AdditionalCoverageField'+lIsPricingApiAdditionalCoveragePremiumValidationOK)
				Boolean lIsPricingApiPremiumValidationOK=this.validatePricingApiPremiumResult(lSheetPricingApi,lListSelectedPricingApiTransaction,lListSelectedPricingApiTotalPremium,lMapInputPricingApiInstallmentAndDownPaymentAmountResult,lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput)
				lIsPricingApiLibraryPremiumValidationOK=this.validatePricingApiLibraryPremiumResult(lSheetPricingApi,lListSelectedPricingApiTotalPremium,lMapInputPricingApiInstallmentAndDownPaymentAmountResult,lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput,lMapPricingApiLibraryGetPlanPriceResult)
				Map lMapPricingApiActualResult=this.inputActualResult(lIsPositiveCase,lIsPricingApiAdditionalCoveragePremiumValidationOK,lIsPricingApiPremiumValidationOK,lIsPricingApiLibraryAdditionalCoveragePremiumValidationOK,lIsPricingApiLibraryPremiumValidationOK)
				String lStrSubSetActualResult=lMapPricingApiActualResult.ActualResult
				for(Integer lGetCellIndex=0;lGetCellIndex<=lListSelectedPricingApiTotalPremium.size()-1;lGetCellIndex++){
					Map lMapPricingApiInputResult=lListSelectedPricingApiTotalPremium.get(lGetCellIndex).Result
					Integer lNumPricingApiInputResultRow=lMapPricingApiInputResult.RowNumber
					Integer lNumPricingApiInputResultColumn=lMapPricingApiInputResult.ColumnNumber
					Boolean lIsSubSetStatusOK=IGNUemaHelper.convertStringToBoolean(lStrSubSetActualResult)
					String lStrSubSetStatus=''
					if(lIsSubSetStatusOK){
						lStrSubSetStatus='Passed'
					}
					else{
						lStrSubSetStatus='Failed'
						lIsOK=false
					}
					Boolean lIsInputResultToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiInputResultRow,lNumPricingApiInputResultColumn,lStrSubSetStatus)
					if(!lIsInputResultToExcelSheetDone){
						return lreturn
					}
				}
				lIsSaveWorkBook=IGNUemaHelper.saveExcelWorkbookByFileName(lStrExcelGenericFileName,lWorkBookExcelFileGenericTestData)
				if(!lIsSaveWorkBook){
					return lreturn
				}
			}
			Map lMapJsonRootVehicleData=new JsonSlurper().parseText(lStrPricingApiJsonRootVehicleData)
			List lListSubSet=lMapJsonRootVehicleData.SubSetList
			this.CURRENT_PRICING_API_NUMBER_OF_SUBSET=lNumDataSubsetIndex
			lResult=lIsOK
			lreturn.put('Result',lResult)
			lreturn.put('ListCollectedPricingApiQuoteGetPlanPrice',lListCollectedPricingApiQuoteGetPlanPrice)
			lreturn.put('ListCollectedPricingApiQuoteGetPlanWithInstallmentPrice',lListCollectedPricingApiQuoteGetPlanWithInstallmentPrice)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMapPricingApiInstallmentAndDownPaymentAmountResult(Sheet sheetPricingApi,List listSelectedPricingApiTransaction,List listSelectedPricingApiTotalPremium){
		Map lreturn=[:]
		Float lNumTotalInstallmentAmount=0.0
		Float lNumTotalDownPayment=0.0
		try{
			lreturn.put('NumTotalInstallmentAmount',lNumTotalInstallmentAmount)
			lreturn.put('NumTotalDownPayment',lNumTotalDownPayment)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi

			if(IGNUemaHelper.checkObjectEmptyOfList(listSelectedPricingApiTransaction)){
				return lreturn
			}
			List lListSelectedPricingApiTransaction=listSelectedPricingApiTransaction
			if(IGNUemaHelper.checkObjectEmptyOfList(listSelectedPricingApiTotalPremium)){
				return lreturn
			}
			List lListSelectedPricingApiTotalPremium=listSelectedPricingApiTotalPremium
			Float lNumDownPayment=0.0
			for(Integer lGetCellIndex=0;lGetCellIndex<=lListSelectedPricingApiTransaction.size()-1;lGetCellIndex++){
				Map lMapPricingApiTransactionDownPayment=lListSelectedPricingApiTransaction.get(lGetCellIndex).DownPayment
				Integer lNumDownPaymentRow=lMapPricingApiTransactionDownPayment.RowNumber
				Integer lNumDownPaymentColumn=lMapPricingApiTransactionDownPayment.ColumnNumber
				String lStrDownPayment=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lNumDownPaymentRow,lNumDownPaymentColumn)
				lNumDownPayment=IGNUemaHelper.convertStringToFloat(lStrDownPayment,0.0)
				lNumDownPayment=Math.floor(lNumDownPayment)
				lNumTotalDownPayment=lNumTotalDownPayment+lNumDownPayment
				Map lMapPricingApiTransactionInstallmentAmount=lListSelectedPricingApiTransaction.get(lGetCellIndex).InstallmentAmount
				Integer lNumInstallmentAmountRow=lMapPricingApiTransactionInstallmentAmount.RowNumber
				Integer lNumInstallmentAmountColumn=lMapPricingApiTransactionInstallmentAmount.ColumnNumber
				String lStrInstallmentAmount=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lNumInstallmentAmountRow,lNumInstallmentAmountColumn)
				Float lInstallmentAmountNum=IGNUemaHelper.convertStringToFloat(lStrInstallmentAmount,0.0)
				lInstallmentAmountNum=Math.floor(lInstallmentAmountNum)
				lNumTotalInstallmentAmount=lNumTotalInstallmentAmount+lInstallmentAmountNum
			}
			Map lMapPricingApiTotalDownPayment=lListSelectedPricingApiTotalPremium.get(0).TotalDownPayment
			Integer lNumTotalDownPaymentRow=lMapPricingApiTotalDownPayment.RowNumber
			Integer lNumTotalDownPaymentColumn=lMapPricingApiTotalDownPayment.ColumnNumber
			String lStrTotalDownPayment=lNumTotalDownPayment.toString()
			String lIsInputDownPaymentToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumTotalDownPaymentRow,lNumTotalDownPaymentColumn,lStrTotalDownPayment)
			if(!lIsInputDownPaymentToExcelSheetDone){
				return lreturn
			}
			Map lMapPricingApiTotalInstallmentAmount=lListSelectedPricingApiTotalPremium.get(0).TotalInstallmentAmount
			Integer lNumTotalInstallmentAmountRow=lMapPricingApiTotalInstallmentAmount.RowNumber
			Integer lNumTotalInstallmentAmountColumn=lMapPricingApiTotalInstallmentAmount.ColumnNumber
			String lStrTotalInstallmentAmount=lNumTotalInstallmentAmount.toString()
			String lIsInputInstallmentAmountToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumTotalInstallmentAmountRow,lNumTotalInstallmentAmountColumn,lStrTotalInstallmentAmount)
			if(!lIsInputInstallmentAmountToExcelSheetDone){
				return lreturn
			}
			lreturn.put('NumTotalInstallmentAmount',lNumTotalInstallmentAmount)
			lreturn.put('NumTotalDownPayment',lNumTotalDownPayment)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallPricingApiGetPlanPriceResult(String strPricingApiJsonQuotationInput,strPricingApiPaymentFrequency,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Map lMapPricingApiQuoteGetPlanPrice=[:]
		Map lMapPricingApiQuoteGetPlanPriceWithInstallmentPrice=[:]
		Boolean lResult=false
		try{
			lreturn.put('MapPricingApiQuoteGetPlanPrice',lMapPricingApiQuoteGetPlanPrice)
			lreturn.put('MapPricingApiQuoteGetPlanPriceWithInstallmentPrice',lMapPricingApiQuoteGetPlanPriceWithInstallmentPrice)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonQuotationInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiPaymentFrequency)){
				return lreturn
			}
			String lStrPricingApiPaymentFrequency=strPricingApiPaymentFrequency
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiPaymentFrequency)){
				return lreturn
			}
			String lStrPricingApiJsonQuotationInput=strPricingApiJsonQuotationInput
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonQuotationInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			Boolean lIsPricingApiGetPlanPriceRunSuccessOK=true
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			String lStrRegisterClientSessionKey=mapPricingApiInputOutput.RegisterClientSessionKey
			String lStrRegisterUuid=mapPricingApiInputOutput.RegisterUuid
			String lStrPricingApiGetPlanPriceRequestBody=lStrPricingApiJsonQuotationInput
			String lStrPricingApiVersion01GetPlanPriceRequestBody=this.getStringPricingApiGetPlanWithInstallmentPriceRequestBody(lStrPricingApiJsonQuotationInput,lStrPricingApiPaymentFrequency)
			Map lMapInputGetPlanPriceInputRequestResult=this.initPricingApiGetPlanPrice(lStrPricingApiQuoteRequiredProductType,lStrPricingApiVersion01GetPlanPriceRequestBody,mapPricingApiInputOutput)
			lMapPricingApiQuoteGetPlanPrice=lMapInputGetPlanPriceInputRequestResult
			if(!lMapInputGetPlanPriceInputRequestResult.Result){
				lIsPricingApiGetPlanPriceRunSuccessOK=false
			}
			Map lMapInputGetPlanWithInstallmentPriceInputRequestResult=this.initPricingApiGetPlanWithInstallmentPrice(lStrPricingApiQuoteRequiredProductType,lStrPricingApiVersion01GetPlanPriceRequestBody,mapPricingApiInputOutput)
			lMapPricingApiQuoteGetPlanPriceWithInstallmentPrice=lMapInputGetPlanWithInstallmentPriceInputRequestResult
			if(!lMapInputGetPlanWithInstallmentPriceInputRequestResult.Result){
				lIsPricingApiGetPlanPriceRunSuccessOK=false
			}
			lResult=lIsPricingApiGetPlanPriceRunSuccessOK
			lreturn.put('MapPricingApiQuoteGetPlanPrice',lMapPricingApiQuoteGetPlanPrice)
			lreturn.put('MapPricingApiQuoteGetPlanPriceWithInstallmentPrice',lMapPricingApiQuoteGetPlanPriceWithInstallmentPrice)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallPricingApiLibraryGetPlanPriceResult(Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		lreturn.put('Result',lResult)
		try{
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
				return lreturn
			}
			Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			Map lMapPricingApiInputOutput=mapPricingApiInputOutput
			Map lMapPricingApiLibraryGetPlanPricePremiumResult=[:]
			String lStrPricingApiLibraryJsonQuotationInput=lMapCollectedPricingApiDetailResult.StrPricingApiLibraryJsonQuotationInput
			String lStrPricingApiPaymentFrequency=lMapCollectedPricingApiDetailResult.StrPricingApiPaymentFrequency
			String lStrPricingApiVersion01LibraryJsonQuotationInput=this.getStringPricingApiGetPlanWithInstallmentPriceRequestBody(lStrPricingApiLibraryJsonQuotationInput,lStrPricingApiPaymentFrequency)
			lMapCollectedPricingApiDetailResult.StrPricingApiLibraryJsonQuotationInput=lStrPricingApiVersion01LibraryJsonQuotationInput
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiLibraryHostUrl=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiLibraryHostUrl
			Boolean lIsBrowserOpenOK=this.parentStageController.getIsWebBrowserInit()
			if(!lIsBrowserOpenOK){
				lIsBrowserOpenOK=this.parentStageController.browserInit(lStrPricingApiLibraryHostUrl)
			}
			else{
				WebUI.refresh()
			}
			lIsBrowserOpenOK=this.parentStageController.getIsWebBrowserInit()
			if(lIsBrowserOpenOK){
				WebDriver lDriver=this.parentStageController.getWebDriver()
				WebUI.refresh()
				Boolean lIsPricingApiLibraryInputRequestOK=IDNPricingApiLibraryGetPriceListMainUtil.inputPricingApiLibraryRequest(lDriver,lMapCaseDataCurrentInput,lMapCollectedPricingApiDetailResult)
				if(!lIsPricingApiLibraryInputRequestOK){
					return lreturn
				}
				Boolean lIsPricingApiLibraryInputCoverAndCoverageResult=IDNPricingApiLibraryGetPriceListMainUtil.inputPricingApiLibraryCoverAndCoverage(lDriver,lMapCaseDataCurrentInput,lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput)
				if(!lIsPricingApiLibraryInputCoverAndCoverageResult){
					return lreturn
				}
				lMapPricingApiLibraryGetPlanPricePremiumResult=IDNPricingApiLibraryGetPriceListMainUtil.getPricingApiLibraryGetPlanPricePremiumResult(lDriver,lMapCaseDataCurrentInput,lMapCollectedPricingApiDetailResult,mapPricingApiInputOutput)
			}
			if(!IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiLibraryGetPlanPricePremiumResult)){
				lResult=true
			}
			if(lResult){
				lreturn=lMapPricingApiLibraryGetPlanPricePremiumResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getStringPricingApiGetPlanWithInstallmentPriceRequestBody(String strPricingApiJsonQuotationInput,String strPricingApiPaymentFrequency){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonQuotationInput)){
			return lreturn
		}
		String lStrPricingApiJsonQuotationInput=strPricingApiJsonQuotationInput
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonQuotationInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiPaymentFrequency)){
			return lreturn
		}
		String lStrPricingApiPaymentFrequency=strPricingApiPaymentFrequency
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiPaymentFrequency)){
			return lreturn
		}
		try{
			Map lMapPricingApiJsonQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonQuotationInput)
			Map lMapPricingApiPaymentData=[:]
			lMapPricingApiPaymentData.put('flagPaymentConfirmed',false)
			lMapPricingApiPaymentData.put('paymentFrequency',lStrPricingApiPaymentFrequency)
			lMapPricingApiJsonQuotationInput.root.quoteData.put('paymentData',lMapPricingApiPaymentData)
			JsonBuilder lJsonPricingApiJsonQuotationInput=new JsonBuilder(lMapPricingApiJsonQuotationInput)
			lreturn=lJsonPricingApiJsonQuotationInput.toString()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiCoverField(String strPricingApiJsonQuotationInput,List listCollectedPricingApiCover,List listCollectedPricingApiCoverage,List listCollectedPricingApiCoverageName,List listCollectedPricingApiCoverageSA){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiVersion01JsonQuotationInput=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiVersion01JsonQuotationInput',lStrPricingApiVersion01JsonQuotationInput)
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonQuotationInput)){
				return lreturn
			}
			String lStrPricingApiJsonQuotationInput=strPricingApiJsonQuotationInput
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonQuotationInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(listCollectedPricingApiCover)){
				return lreturn
			}
			List lListCollectedPricingApiCover=listCollectedPricingApiCover
			List lListCollectedPricingApiCoverage=listCollectedPricingApiCoverage
			List lListCollectedPricingApiCoverageName=listCollectedPricingApiCoverageName
			List lListCollectedPricingApiCoverageSA=listCollectedPricingApiCoverageSA
			Map lMapPricingApiJsonQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonQuotationInput)
			if(lListCollectedPricingApiCover.size()>0){
				for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
					Map lMapPricingApiGetPlanPriceCover=[:]
					List lListSelectedPricingApiCoverage=null
					Map lMapSelectedPricingApiCover=lListCollectedPricingApiCover.get(lIndex)
					if(IGNUemaHelper.checkObjectEmptyOfList(lListCollectedPricingApiCoverage)){
						lListSelectedPricingApiCoverage=[]
					}else{
						lListSelectedPricingApiCoverage=lListCollectedPricingApiCoverage.get(lIndex)
					}
					lMapPricingApiGetPlanPriceCover=lMapSelectedPricingApiCover
					lMapPricingApiGetPlanPriceCover.put('coverages',lListSelectedPricingApiCoverage)
					lMapPricingApiJsonQuotationInput.root.quoteData.covers.add(lMapPricingApiGetPlanPriceCover)
				}
			}
			JsonBuilder lJsonPricingApiJsonQuotationInput=new JsonBuilder(lMapPricingApiJsonQuotationInput)
			lStrPricingApiVersion01JsonQuotationInput=lJsonPricingApiJsonQuotationInput.toString()
			lResult=lStrPricingApiVersion01JsonQuotationInput.length()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrPricingApiVersion01JsonQuotationInput',lStrPricingApiVersion01JsonQuotationInput)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}

	public Map inputPricingApiMandatoryFieldForRequest(Sheet sheetPricingApi,Map mapPricingApiJsonQuotationInput,String strPricingApiJsonRootVehicleData,Map mapInputPricingApiPaymentFrequencyResult, Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiJsonQuotationInput=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiJsonQuotationInput',lStrPricingApiJsonQuotationInput)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootVehicleData)){
				return lreturn
			}
			String lStrPricingApiJsonRootVehicleData=strPricingApiJsonRootVehicleData
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonQuotationInput)){
				return lreturn
			}
			Map lMapPricingApiJsonQuotationInput=mapPricingApiJsonQuotationInput
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiPaymentFrequencyResult)){
				return lreturn
			}
			Map lMapInputPricingApiPaymentFrequencyResult=mapInputPricingApiPaymentFrequencyResult
			Map lMapPricingApiJsonRootVehicleData=new JsonSlurper().parseText(lStrPricingApiJsonRootVehicleData)
			List lListPricingApiQuoteTransactionDate=lMapPricingApiJsonRootVehicleData.QuotationInputDateList
			Map lMapPricingApiQuoteTransactionDate=lListPricingApiQuoteTransactionDate.get(0)
			String lStrPaymentFrequency=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiPaymentFrequency
			String lStrPricingApiMasterSetId=lMapPricingApiJsonQuotationInput.root.quoteData.mastersetId
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMasterSetId)){
				lStrPricingApiMasterSetId=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiMasterSetId
				Map lMapPricingApiMasterSetIdRowAndColumnNumber=lMapPricingApiQuoteTransactionDate.QuoteMasterSetId
				Integer lNumPricingApiMasterSetIdRow=lMapPricingApiMasterSetIdRowAndColumnNumber.RowNumber
				Integer lNumPricingApiMasterSetIdColumn=lMapPricingApiMasterSetIdRowAndColumnNumber.ColumnNumber
				Boolean lIsWriteMasterSetIdToExcelSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiMasterSetIdRow,lNumPricingApiMasterSetIdColumn,lStrPricingApiMasterSetId)
				if(!lIsWriteMasterSetIdToExcelSheet){
					return lreturn
				}
				lMapPricingApiJsonQuotationInput.root.quoteData.put('mastersetId',lStrPricingApiMasterSetId)
			}
			Map lMapPricingApiEndDateRowAndColumnNumber=lMapPricingApiQuoteTransactionDate.EndDate
			Integer lNumPricingApiEndDateRow=lMapPricingApiEndDateRowAndColumnNumber.RowNumber
			Integer lNumPricingApiEndDateColumn=lMapPricingApiEndDateRowAndColumnNumber.ColumnNumber
			String lStrPricingApiEndDate=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lNumPricingApiEndDateRow,lNumPricingApiEndDateColumn)
			lMapPricingApiJsonQuotationInput.root.quoteData.put('endDate',lStrPricingApiEndDate)
			JsonBuilder lJsonPricingApiJsonQuotationInput=new JsonBuilder(lMapPricingApiJsonQuotationInput)
			lStrPricingApiJsonQuotationInput=lJsonPricingApiJsonQuotationInput.toString()
			mapPricingApiInputOutput.put('MultiplePlanPriceRequestText',lStrPricingApiJsonQuotationInput)
			mapPricingApiInputOutput.put('QuotePolicyEndDate',lStrPricingApiEndDate)
			lResult=lStrPricingApiJsonQuotationInput.length()>1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrPricingApiJsonQuotationInput',lStrPricingApiJsonQuotationInput)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPricingApiAnnualNetPremiumResult(Sheet sheetPricingApi,Float numPricingApiSelectedAdditionalCoverageTotal,String strPricingApiCoverPremium,Map mapPricingApiPayment,Map mapInputPricingApiPaymentFrequencyResult){
		Boolean lreturn=false
		Boolean lResult=false
		Boolean lIsOK=true
		String lStrPricingApiCoverPremium=strPricingApiCoverPremium
		Float lNumPricingApiSelectedAdditionalCoverageTotal=numPricingApiSelectedAdditionalCoverageTotal
		try{
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiPayment)){
				return lreturn
			}
			Map lMapPricingApiPayment=mapPricingApiPayment
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiPaymentFrequencyResult)){
				return lreturn
			}
			Map lMapPricingApiAnnualNetPremiumRowAndColumnNumber=[:]
			Integer lNumPricingApiAnnualNetPremiumRow=0
			Integer lNumPricingApiAnnualNetPremiumColumn=0
			Float lNumPricingApiCoverPremium=0.0
			Float lNumPricingApiAnnualNetPremium=0.0
			String lStrPricingApiAnnualNetPremium=''
			Map lMapInputPricingApiPaymentFrequencyResult=mapInputPricingApiPaymentFrequencyResult
			Boolean lIsFlagApplyLoadingFactorOK=lMapInputPricingApiPaymentFrequencyResult.BoolIsPricingApiFlagApplyLoadingFactor
			String lStrPricingApiLoadingFactor=''
			lNumPricingApiCoverPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiCoverPremium,0.0)
			lNumPricingApiAnnualNetPremium=lNumPricingApiSelectedAdditionalCoverageTotal+lNumPricingApiCoverPremium
			lStrPricingApiAnnualNetPremium=lNumPricingApiAnnualNetPremium.toString()
			if(lIsFlagApplyLoadingFactorOK){
				lMapPricingApiAnnualNetPremiumRowAndColumnNumber=lMapPricingApiPayment.AnnualNetPremCalcByTestScript
				lNumPricingApiAnnualNetPremiumRow=lMapPricingApiAnnualNetPremiumRowAndColumnNumber.RowNumber
				lNumPricingApiAnnualNetPremiumColumn=lMapPricingApiAnnualNetPremiumRowAndColumnNumber.ColumnNumber
			}else{
				lMapPricingApiAnnualNetPremiumRowAndColumnNumber=lMapPricingApiPayment.AnnualNetPremWithoutLoading
				lNumPricingApiAnnualNetPremiumRow=lMapPricingApiAnnualNetPremiumRowAndColumnNumber.RowNumber
				lNumPricingApiAnnualNetPremiumColumn=lMapPricingApiAnnualNetPremiumRowAndColumnNumber.ColumnNumber
			}
			String lStrFlagApplyLoadingFactor=''
			Map lMapPricingApiFlagApplyLoadingFactorRowAndColumnNumber=lMapPricingApiPayment.FlagApplyLoadingFactor
			Integer lNumPricingApiFlagApplyLoadingFactorRow=lMapPricingApiFlagApplyLoadingFactorRowAndColumnNumber.RowNumber
			Integer lNumPricingApiFlagApplyLoadingFactorColumn=lMapPricingApiFlagApplyLoadingFactorRowAndColumnNumber.ColumnNumber
			if(lIsFlagApplyLoadingFactorOK){
				lStrFlagApplyLoadingFactor='Yes'
			}
			else{
				lStrFlagApplyLoadingFactor='No'
			}
			Boolean lIsInputPricingApiFlagApplyLoadingFactorToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiFlagApplyLoadingFactorRow,lNumPricingApiFlagApplyLoadingFactorColumn,lStrFlagApplyLoadingFactor)
			if(!lIsInputPricingApiFlagApplyLoadingFactorToExcelSheetDone){
				return lreturn
			}
			Boolean lIsInputPricingApiAnnualNetPremiumToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiAnnualNetPremiumRow,lNumPricingApiAnnualNetPremiumColumn,lStrPricingApiAnnualNetPremium)
			if(!lIsInputPricingApiAnnualNetPremiumToExcelSheetDone){
				return lreturn
			}
			lreturn=lIsInputPricingApiAnnualNetPremiumToExcelSheetDone
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiAdditionalCoverageResult(Sheet sheetPricingApi,Map mapSelectedPricingApiInputPremium,Map mapPricingApiMultiPlanPriceResponse,Map mapPricingApiInputCoverageResult,Map mapPricingApiPlanOptionResult,Map mapInputPricingApiPaymentFrequencyResult){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lIsOK=true
		List<Float> lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading=new ArrayList()
		List<Float> lListPricingApiSelectedAdditionalCoveragePremiumWithLoading=new ArrayList()
		List<Map> lListPricingApiSelectedCoverage=new ArrayList()
		Float lNumPricingApiSelectedAdditionalCoverageTotal=0.0
		try{
			lreturn.put('Result',lResult)
			lreturn.put('ListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading',lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading)
			lreturn.put('ListPricingApiSelectedAdditionalCoveragePremiumWithLoading',lListPricingApiSelectedAdditionalCoveragePremiumWithLoading)
			lreturn.put('ListPricingApiSelectedAdditionalCoverage',lListPricingApiSelectedCoverage)
			lreturn.put('NumPricingApiSelectedAdditionalCoverageTotal',lNumPricingApiSelectedAdditionalCoverageTotal)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapSelectedPricingApiInputPremium)){
				return lreturn
			}
			Map lMapSelectedPricingApiInputPremium=mapSelectedPricingApiInputPremium
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMultiPlanPriceResponse)){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceResponse=mapPricingApiMultiPlanPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputCoverageResult)){
				return lreturn
			}
			Map lMapPricingApiInputCoverageResult=mapPricingApiInputCoverageResult
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiPlanOptionResult)){
				return lreturn
			}
			Map lMapPricingApiPlanOptionResult=mapPricingApiPlanOptionResult
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiPaymentFrequencyResult)){
				return lreturn
			}
			Map lMapInputPricingApiPaymentFrequencyResult=mapInputPricingApiPaymentFrequencyResult
			String lStrPaymentFrequency=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiPaymentFrequency
			String lStrPricingApiMasterSetId=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiMasterSetId
			Boolean lIsFlagApplyLoadingFactorOK=lMapInputPricingApiPaymentFrequencyResult.BoolIsPricingApiFlagApplyLoadingFactor
			String lStrPricingApiQuoteRequiredProductType=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiRequestProductTypeName
			String lStrPricingApiLoadingFactor=''
			if(lIsFlagApplyLoadingFactorOK){
				lStrPricingApiLoadingFactor=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiLoadingFactor
			}
			String lStrCoverPremiumSequence=IDNPricingApiHelper.getPricingProductFrequencyValue(lStrPaymentFrequency,lStrPricingApiMasterSetId)
			Integer lNumCoverPremiumSequence=IGNUemaHelper.convertStringToInteger(lStrCoverPremiumSequence,0)
			Map lMapSelectedPricingApiPlanOption=lMapPricingApiPlanOptionResult.MapSelectedPricingApiPlanOption
			List<String> lListPricingApiCoverageName=lMapPricingApiInputCoverageResult.ListPricingApiCoverageName
			List<String> lListPricingApiCoverageSA=lMapPricingApiInputCoverageResult.ListPricingApiCoverageSA
			List<String> lListPricingApiCoveragePremium=lMapPricingApiInputCoverageResult.ListPricingApiCoveragePremium
			List<GroovyRowResult> lListPricingApiDependencyCoverageMappingResultSet=[]
			String lStrPricingApiCoverageDecodedOptionName=''
			String lStrPricingApiCoverageSumAssured=''
			String lStrPricingApiCoverageFirstOptionSequence=''
			Boolean lIsDefaultSelectedOptionToSelect=true
			String lStrPricingModelVersion=lMapPricingApiMultiPlanPriceResponse.root.Quote.Pricing_Model_Version
			Map lMapPricingApiMultiPlanPriceResponseCoverage=lMapPricingApiMultiPlanPriceResponse.root.Quote.Coverages
			if(lListPricingApiCoverageName.size()>0){
				for(Integer lCoverageIndex=0;lCoverageIndex<=lListPricingApiCoverageName.size()-1;lCoverageIndex++){
					String lStrPricingApiCoverageName=lListPricingApiCoverageName.get(lCoverageIndex)
					String lStrPricingApiCoveragePlanName=''
					Map lMapPricingApiCoverage=[:]
					Map lMapPricingApiCoverageDependencyResult=IDNPricingApiHelper.getDependencyTable(lStrPricingModelVersion,lStrPricingApiQuoteRequiredProductType,lStrPricingApiCoverageName)
					if(!lMapPricingApiCoverageDependencyResult.Result){
						return lreturn
					}
					lListPricingApiDependencyCoverageMappingResultSet=lMapPricingApiCoverageDependencyResult.DependencyCodeMappingResultSet
					if(lListPricingApiDependencyCoverageMappingResultSet.size()==0){
						return lreturn
					}
					for(Integer lMappingIndex=0;lMappingIndex<=lListPricingApiDependencyCoverageMappingResultSet.size()-1;lMappingIndex++){
						String lStrPricingApiCoverageSelectionDependentCode=lListPricingApiDependencyCoverageMappingResultSet.get(lMappingIndex).selection_dependent_code
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverageSelectionDependentCode)){
							for(Map.Entry entry : lMapSelectedPricingApiPlanOption.entrySet()){
								String lStrPlanName=entry.getKey()
								if(lStrPlanName==lStrPricingApiCoverageSelectionDependentCode){
									lStrPricingApiCoverageDecodedOptionName=entry.getValue()
								}
							}
						}else{
							lStrPricingApiCoverageSumAssured=lListPricingApiCoverageSA.get(lCoverageIndex)
							lStrPricingApiCoverageDecodedOptionName=lListPricingApiCoverageSA.get(lCoverageIndex)
						}
						if(lMappingIndex==lListPricingApiDependencyCoverageMappingResultSet.size()-1){
							lStrPricingApiCoveragePlanName=lStrPricingApiCoveragePlanName+lStrPricingApiCoverageDecodedOptionName
						}else{
							lStrPricingApiCoveragePlanName=lStrPricingApiCoveragePlanName+lStrPricingApiCoverageDecodedOptionName+'_'
						}
					}
					if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverageSumAssured)){
						lStrPricingApiCoverageSumAssured=lListPricingApiCoverageSA.get(lCoverageIndex)
					}
					lMapPricingApiCoverage.put('additionalCoverageCode',lStrPricingApiCoverageName)
					lMapPricingApiCoverage.put('additionalCoverageSumAssured', lStrPricingApiCoverageSumAssured)
					lListPricingApiSelectedCoverage.add(lMapPricingApiCoverage)
					Map lMapPricingApiAdditionalCoveragePremium=lMapPricingApiMultiPlanPriceResponseCoverage.get(lStrPricingApiCoverageName)
					List lListPricingApiAdditionalCoveragePremiumOption=lMapPricingApiAdditionalCoveragePremium.Option
					for(Integer lOptionIndex=0;lOptionIndex<=lListPricingApiAdditionalCoveragePremiumOption.size()-1;lOptionIndex++){
						Map lMapPricingApiAdditionalCoverageOption=lListPricingApiAdditionalCoveragePremiumOption.get(lOptionIndex)
						String lStrPricingApiAdditionalCoverageOptionName=lMapPricingApiAdditionalCoverageOption.Name
						if(lStrPricingApiAdditionalCoverageOptionName==lStrPricingApiCoveragePlanName){
							String lStrPricingApiAdditionalCoveragePremium=lMapPricingApiAdditionalCoverageOption.Premium_Before_Taxes
							if(lIsFlagApplyLoadingFactorOK){
								lStrPricingApiAdditionalCoveragePremium=this.getPremiumBasedPolicyPaymentFrequencySequence(lStrPricingApiAdditionalCoveragePremium,lNumCoverPremiumSequence)
							}
							Map lMapPricingApiAdditionalCoveragePremiumResult=lListPricingApiCoveragePremium.get(lCoverageIndex)
							Integer lNumPricingApiAdditionalCoveragePremiumRow=lMapPricingApiAdditionalCoveragePremiumResult.RowNumber
							Integer lNumPricingApiAdditionalCoveragePremiumColumn=lMapPricingApiAdditionalCoveragePremiumResult.ColumnNumber
							Float lNumPricingApiAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiAdditionalCoveragePremium,0.0)
							Boolean lIsInputPricingApiAdditionalCoveragePremiumToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiAdditionalCoveragePremiumRow,lNumPricingApiAdditionalCoveragePremiumColumn,lStrPricingApiAdditionalCoveragePremium)
							if(!lIsInputPricingApiAdditionalCoveragePremiumToExcelSheetDone){
								return lreturn
							}

							Float lNumPricingApiAdditionalCoveragePremiumWithLoading=0.0
							if(lIsFlagApplyLoadingFactorOK){
								lNumPricingApiAdditionalCoveragePremiumWithLoading=lNumPricingApiAdditionalCoveragePremium
							}
							else{
								Integer lNumPricingApiLoadingFactor=lStrPricingApiLoadingFactor
								lNumPricingApiAdditionalCoveragePremiumWithLoading=lNumPricingApiAdditionalCoveragePremium*lNumPricingApiLoadingFactor
							}
							lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading.add(lNumPricingApiAdditionalCoveragePremium)
							lListPricingApiSelectedAdditionalCoveragePremiumWithLoading.add(lNumPricingApiAdditionalCoveragePremiumWithLoading)
							lNumPricingApiSelectedAdditionalCoverageTotal=lNumPricingApiSelectedAdditionalCoverageTotal+lNumPricingApiAdditionalCoveragePremium
						}
					}
				}
			}
			Map lMapPricingApiInputAdditionalCoveragePremiumRowAndColumnNumber=lMapSelectedPricingApiInputPremium.AdditionalCoveragePremium
			Integer lNumAdditionalCoveragePremiumRow=lMapPricingApiInputAdditionalCoveragePremiumRowAndColumnNumber.RowNumber
			Integer lNumAdditionalCoveragePremiumColumn=lMapPricingApiInputAdditionalCoveragePremiumRowAndColumnNumber.ColumnNumber
			String lStrPricingApiSelectedAdditionalCoverageTotal=lNumPricingApiSelectedAdditionalCoverageTotal.toString()
			Boolean lIsInputPricingApiSelectedAdditionalCoverageTotalToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumAdditionalCoveragePremiumRow,lNumAdditionalCoveragePremiumColumn,lStrPricingApiSelectedAdditionalCoverageTotal)
			if(!lIsInputPricingApiSelectedAdditionalCoverageTotalToExcelSheetDone){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(lListPricingApiSelectedAdditionalCoveragePremiumWithLoading)){
				lIsOK=false
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading)){
				lIsOK=false
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(lListPricingApiSelectedCoverage)){
				lIsOK=false
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('ListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading',lListPricingApiSelectedAdditionalCoveragePremiumWithoutLoading)
				lreturn.put('ListPricingApiSelectedAdditionalCoveragePremiumWithLoading',lListPricingApiSelectedAdditionalCoveragePremiumWithLoading)
				lreturn.put('ListPricingApiSelectedAdditionalCoverage',lListPricingApiSelectedCoverage)
				lreturn.put('NumPricingApiSelectedAdditionalCoverageTotal',lNumPricingApiSelectedAdditionalCoverageTotal)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiCoverPremium(Sheet sheetPricingApi,String strCoverName,String strPricingApiCoverPlanName,Map mapPricingApiMultiPlanPriceResponse,Map mapSelectedPricingApiInputPremium,Map mapInputPricingApiPaymentFrequencyResult){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiCoverPremium=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiCoverPremium',lStrPricingApiCoverPremium)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strCoverName)){
				return lreturn
			}
			String lStrCoverName=strCoverName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrCoverName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiCoverPlanName)){
				return lreturn
			}
			String lStrPricingApiCoverPlanName=strPricingApiCoverPlanName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverPlanName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMultiPlanPriceResponse)){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceResponse=mapPricingApiMultiPlanPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiPaymentFrequencyResult)){
				return lreturn
			}
			Map lMapInputPricingApiPaymentFrequencyResult=mapInputPricingApiPaymentFrequencyResult
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapSelectedPricingApiInputPremium)){
				return lreturn
			}
			Map lMapSelectedPricingApiInputPremium=mapSelectedPricingApiInputPremium

			String lStrPaymentFrequency=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiPaymentFrequency
			String lStrPricingApiMasterSetId=lMapInputPricingApiPaymentFrequencyResult.StrPricingApiMasterSetId
			Boolean lIsFlagApplyLoadingFactorOK=lMapInputPricingApiPaymentFrequencyResult.BoolIsPricingApiFlagApplyLoadingFactor
			Map lMapPricingApiMultiPlanPriceCoverage=lMapPricingApiMultiPlanPriceResponse.root.Quote.Coverages
			Map lMapPricingApiMultiPlanPriceCover=lMapPricingApiMultiPlanPriceCoverage.get(lStrCoverName)
			List<String> lListPricingApiCoverPremiumOption=lMapPricingApiMultiPlanPriceCover.Option
			for(Integer lCoverIndex=0;lCoverIndex<=lListPricingApiCoverPremiumOption.size()-1;lCoverIndex++){
				Map lMapPricingApiCoverPremiumOption=lListPricingApiCoverPremiumOption.get(lCoverIndex)
				String lStrPricingApiCoverPremiumOptionName=lMapPricingApiCoverPremiumOption.Name
				if(lStrPricingApiCoverPremiumOptionName==lStrPricingApiCoverPlanName){
					lStrPricingApiCoverPremium=lMapPricingApiCoverPremiumOption.Premium_Before_Taxes
					if(lIsFlagApplyLoadingFactorOK){
						String lStrCoverPremiumSequence=IDNPricingApiHelper.getPricingProductFrequencyValue(lStrPaymentFrequency,lStrPricingApiMasterSetId)
						Integer lNumCoverPremiumSequence=IGNUemaHelper.convertStringToInteger(lStrCoverPremiumSequence,0)
						lStrPricingApiCoverPremium=this.getPremiumBasedPolicyPaymentFrequencySequence(lStrPricingApiCoverPremium,lNumCoverPremiumSequence)
					}
				}
			}
			Map lMapPricingApiCoverPremiumRowAndColumnNumber=lMapSelectedPricingApiInputPremium.CoverPremium
			Integer lNumCoverPremiumRow=lMapPricingApiCoverPremiumRowAndColumnNumber.RowNumber
			Integer lNumCoverPremiumColumn=lMapPricingApiCoverPremiumRowAndColumnNumber.ColumnNumber
			Boolean lInputCoverPremiumToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumCoverPremiumRow,lNumCoverPremiumColumn,lStrPricingApiCoverPremium)
			if(!lInputCoverPremiumToExcelSheetDone){
				return lreturn
			}
			lResult=lStrPricingApiCoverPremium.length()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrPricingApiCoverPremium',lStrPricingApiCoverPremium)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMapPricingApiPlanOption(Sheet sheetPricingApi,String strCoverName,Map mapPricingApiJsonQuotationInput, Map mapPricingApiMultiPlanPriceResponse,Map mapSelectedPricingApiPlanOption){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiCoverPlanName=''
		Map lMapPricingApiCover=[:]
		Map lMapPricingApiPlanOptionResult=[:]
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiCoverPlanName',lStrPricingApiCoverPlanName)
			lreturn.put('MapSelectedPricingApiCover',lMapPricingApiCover)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strCoverName)){
				return lreturn
			}
			String lStrCoverName=strCoverName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrCoverName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapSelectedPricingApiPlanOption)){
				return lreturn
			}
			Map lMapSelectedPricingApiPlanOption=mapSelectedPricingApiPlanOption
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMultiPlanPriceResponse)){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceResponse=mapPricingApiMultiPlanPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonQuotationInput)){
				return lreturn
			}
			Map lMapPricingApiJsonQuotationInput=mapPricingApiJsonQuotationInput
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			if(lStrPricingApiQuoteRequiredProductType.contains('Motor')){
				lMapPricingApiPlanOptionResult=this.inputMapPricingApiPlanOptionA(lSheetPricingApi,lStrCoverName,lMapPricingApiMultiPlanPriceResponse,lMapSelectedPricingApiPlanOption)
			}else{
				lMapPricingApiPlanOptionResult=this.inputMapPricingApiPlanOptionB(lSheetPricingApi,lStrCoverName,lMapPricingApiJsonQuotationInput,lMapPricingApiMultiPlanPriceResponse,lMapSelectedPricingApiPlanOption)
			}
			lreturn=lMapPricingApiPlanOptionResult
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMapPricingApiPlanOptionA(Sheet sheetPricingApi,String strCoverName,Map mapPricingApiMultiPlanPriceResponse,Map mapSelectedPricingApiPlanOption){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiCoverPlanName=''
		Map lMapPricingApiCover=[:]
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiCoverPlanName',lStrPricingApiCoverPlanName)
			lreturn.put('MapSelectedPricingApiCover',lMapPricingApiCover)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strCoverName)){
				return lreturn
			}
			String lStrCoverName=strCoverName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrCoverName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapSelectedPricingApiPlanOption)){
				return lreturn
			}
			Map lMapSelectedPricingApiPlanOption=mapSelectedPricingApiPlanOption
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMultiPlanPriceResponse)){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceResponse=mapPricingApiMultiPlanPriceResponse
			Boolean lIsListPlanOptionOK=true
			String[] lArrayPricingApiDefaultSelectedOptionPlanOption=[]
			List<GroovyRowResult> lListPricingApiCoverDependencyCodeMappingResultSet=[]
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			Map lMapPricingApiMultiPlanPriceCoverage=lMapPricingApiMultiPlanPriceResponse.root.Quote.Coverages
			Map lMapPricingApiMultiPlanPriceCover=lMapPricingApiMultiPlanPriceCoverage.get(lStrCoverName)
			String lStrPricingModelVersion=lMapPricingApiMultiPlanPriceResponse.root.Quote.Pricing_Model_Version
			String lStrPricingApiDefaultSelectedOptionCover=lMapPricingApiMultiPlanPriceCover.Default_Selected_Option
			Map lMapPricingApiCoverDependencyResult=IDNPricingApiHelper.getDependencyTable(lStrPricingModelVersion,lStrPricingApiQuoteRequiredProductType,lStrCoverName)
			if(lMapPricingApiCoverDependencyResult.Result){
				lListPricingApiCoverDependencyCodeMappingResultSet=lMapPricingApiCoverDependencyResult.DependencyCodeMappingResultSet
				for(Map.Entry entry : lMapSelectedPricingApiPlanOption.entrySet()){
					String lStrPlanName=entry.getKey()
					Object lObjectPlanValue=entry.getValue()
					if(lObjectPlanValue.getClass()==LazyMap.class){
						lIsListPlanOptionOK=false
						lArrayPricingApiDefaultSelectedOptionPlanOption=lStrPricingApiDefaultSelectedOptionCover.split('_')
						break
					}
				}
				if(lIsListPlanOptionOK){
					for(Integer lCodeIndex=0;lCodeIndex<=lListPricingApiCoverDependencyCodeMappingResultSet.size()-1;lCodeIndex++){
						String lOptionName=lListPricingApiCoverDependencyCodeMappingResultSet.get(lCodeIndex).option_name
						String lCoverPlan=lMapSelectedPricingApiPlanOption.get(lOptionName)
						if(lCodeIndex==lListPricingApiCoverDependencyCodeMappingResultSet.size()-1){
							lStrPricingApiCoverPlanName=lStrPricingApiCoverPlanName+lCoverPlan
						}else{
							lStrPricingApiCoverPlanName=lStrPricingApiCoverPlanName+lCoverPlan+'_'
						}
					}
				}else{
					lStrPricingApiCoverPlanName=lMapPricingApiMultiPlanPriceCover.Default_Selected_Option
					for(Integer lCodeIndex=0;lCodeIndex<=lListPricingApiCoverDependencyCodeMappingResultSet.size()-1;lCodeIndex++){
						String lStrOptionName=lListPricingApiCoverDependencyCodeMappingResultSet.get(lCodeIndex).option_name
						Map lMapSelectedPricingApiPlanOptionRowAndColumnNumber=lMapSelectedPricingApiPlanOption.get(lStrOptionName)
						Integer lNumSelectedPricingApiPlanOptionRow=lMapSelectedPricingApiPlanOptionRowAndColumnNumber.RowNumber
						Integer lNumSelectedPricingApiPlanOptionColumn=lMapSelectedPricingApiPlanOptionRowAndColumnNumber.ColumnNumber
						Boolean lIsWriteDefaultPlanOptionToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumSelectedPricingApiPlanOptionRow,lNumSelectedPricingApiPlanOptionColumn,lArrayPricingApiDefaultSelectedOptionPlanOption[lCodeIndex])
						if(!lIsWriteDefaultPlanOptionToExcelSheetDone){
							return lreturn
						}
						lMapSelectedPricingApiPlanOption.put(lStrOptionName,lArrayPricingApiDefaultSelectedOptionPlanOption[lCodeIndex])
					}
				}
			}
			lResult=lStrPricingApiCoverPlanName.length()>1
			lMapPricingApiCover.put('code',lStrCoverName)
			lMapPricingApiCover.put('selectedOption',lStrPricingApiCoverPlanName)
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrPricingApiCoverPlanName',lStrPricingApiCoverPlanName)
				lreturn.put('MapSelectedPricingApiPlanOption',lMapSelectedPricingApiPlanOption)
				lreturn.put('MapSelectedPricingApiCover',lMapPricingApiCover)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMapPricingApiPlanOptionB(Sheet sheetPricingApi,String strCoverName,Map mapPricingApiJsonQuotationInput, Map mapPricingApiMultiPlanPriceResponse,Map mapSelectedPricingApiPlanOption){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiSumAssured=''
		Map lMapPricingApiCover=[:]
		Map lMapSelectedPricingApiVersion01PlanOption=[:]
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiCoverPlanName',lStrPricingApiSumAssured)
			lreturn.put('MapSelectedPricingApiCover',lMapPricingApiCover)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strCoverName)){
				return lreturn
			}
			String lStrCoverName=strCoverName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrCoverName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapSelectedPricingApiPlanOption)){
				return lreturn
			}
			Map lMapSelectedPricingApiPlanOption=mapSelectedPricingApiPlanOption
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMultiPlanPriceResponse)){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceResponse=mapPricingApiMultiPlanPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonQuotationInput)){
				return lreturn
			}
			Map lMapPricingApiJsonQuotationInput=mapPricingApiJsonQuotationInput
			List<GroovyRowResult> lListPricingApiCoverDependencyCodeMappingResultSet=[]
			String lStrPricingApiCoverPlanName=''
			String lStrPricingApiQuoteRequiredProductType=lMapPricingApiJsonQuotationInput.root.quoteData.productType
			Map lMapPricingApiMultiPlanPriceCoverage=lMapPricingApiMultiPlanPriceResponse.root.Quote.Coverages
			Map lMapPricingApiMultiPlanPriceCover=lMapPricingApiMultiPlanPriceCoverage.get(lStrCoverName)
			String lStrPricingModelVersion=lMapPricingApiMultiPlanPriceResponse.root.Quote.Pricing_Model_Version
			Map lMapPricingApiCoverDependencyResult=IDNPricingApiHelper.getDependencyTable(lStrPricingModelVersion,lStrPricingApiQuoteRequiredProductType,lStrCoverName)
			if(lMapPricingApiCoverDependencyResult.Result){
				lListPricingApiCoverDependencyCodeMappingResultSet=lMapPricingApiCoverDependencyResult.DependencyCodeMappingResultSet
				for(Integer lCodeIndex=0;lCodeIndex<=lListPricingApiCoverDependencyCodeMappingResultSet.size()-1;lCodeIndex++){
					String lStrOptionName=lListPricingApiCoverDependencyCodeMappingResultSet.get(lCodeIndex).option_name
					for(Map.Entry entry : lMapSelectedPricingApiPlanOption.entrySet()){
						String lStrPlanName=entry.getKey()
						String lStrPlanValue=entry.getValue()
						if(lStrOptionName.contains(lStrPlanName)){
							lMapSelectedPricingApiVersion01PlanOption.put(lStrOptionName,lStrPlanValue)
							if(lCodeIndex==lListPricingApiCoverDependencyCodeMappingResultSet.size()-1){
								lStrPricingApiCoverPlanName=lStrPricingApiCoverPlanName+lStrPlanValue
							}else{
								lStrPricingApiCoverPlanName=lStrPricingApiCoverPlanName+lStrPlanValue+'_'
							}
						}
					}
				}
			}
			lResult=lStrPricingApiCoverPlanName.length()>1
			lMapPricingApiCover.put('code',lStrCoverName)
			lMapPricingApiCover.put('selectedOption',lStrPricingApiCoverPlanName)
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrPricingApiCoverPlanName',lStrPricingApiCoverPlanName)
				lreturn.put('MapSelectedPricingApiPlanOption',lMapSelectedPricingApiVersion01PlanOption)
				lreturn.put('MapSelectedPricingApiCover',lMapPricingApiCover)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMapPricingApiPaymentFrequency(List listPricingApiPayment,Map mapPricingApiMultiPlanPriceResponse,Map mapPricingApiJsonQuotationInput,Map mapPricingApiSourceFileInformation){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lIsOK=true
		String lStrPricingApiPaymentFrequency=''
		Boolean lIsFlagApplyLoadingFactorOK=false
		String lStrPricingApiLoadingFactor=''
		String lStrPricingApiMasterSetId=''
		String lStrPricingApiRequestProductTypeName=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrPricingApiPaymentFrequency',lStrPricingApiPaymentFrequency)
			lreturn.put('BoolIsPricingApiFlagApplyLoadingFactor',lIsFlagApplyLoadingFactorOK)
			lreturn.put('StrPricingApiLoadingFactor',lStrPricingApiLoadingFactor)
			lreturn.put('StrPricingApiMasterSetId',lStrPricingApiMasterSetId)
			lreturn.put('StrPricingApiRequestProductTypeName',lStrPricingApiRequestProductTypeName)
			if(IGNUemaHelper.checkObjectEmptyOfList(listPricingApiPayment)){
				return lreturn
			}
			List lListPricingApiPayment=listPricingApiPayment
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiSourceFileInformation)){
				return lreturn
			}
			Map lMapPricingApiSourceFileInformation=mapPricingApiSourceFileInformation
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMultiPlanPriceResponse)){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceResponse=mapPricingApiMultiPlanPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonQuotationInput)){
				return lreturn
			}
			Map lMapPricingApiJsonQuotationInput=mapPricingApiJsonQuotationInput
			Workbook lWorkBookExcelFileGenericTestData=lMapPricingApiSourceFileInformation.WorkBookExcelFileGenericTestData
			String lStrExcelGenericFileName=lMapPricingApiSourceFileInformation.StrExcelGenericFileName
			Sheet lSheetPricingApi=lMapPricingApiSourceFileInformation.SheetPricingApi
			List<String> lListLoadingFactor=lMapPricingApiMultiPlanPriceResponse.root.Quote.Loading_Factors
			lStrPricingApiRequestProductTypeName=lMapPricingApiJsonQuotationInput.root.quoteData.productType
			lStrPricingApiMasterSetId=lMapPricingApiJsonQuotationInput.root.quoteData.mastersetId
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMasterSetId)){
				lStrPricingApiMasterSetId=lMapPricingApiMultiPlanPriceResponse.root.Quote.mastersetId
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMasterSetId)){
				lIsOK=false
			}
			String lFlagApplyLoadingFactor=IDNPricingApiHelper.getPricingCalculatorPaymentFlagValue('',lStrPricingApiMasterSetId)
			lIsFlagApplyLoadingFactorOK=IGNUemaHelper.convertStringToBoolean(lFlagApplyLoadingFactor)
			for(Integer lIndex=0;lIndex<=lListPricingApiPayment.size()-1;lIndex++){
				Map lMapPricingApiPayment=lListPricingApiPayment.get(lIndex)
				Object lObjectPaymentFrequency=lMapPricingApiPayment.PaymentFrequency
				if(lObjectPaymentFrequency.getClass()==String.class){
					lStrPricingApiPaymentFrequency=lMapPricingApiPayment.PaymentFrequency
				}else{
					Map lMapPolicyPaymentFrequency=lMapPricingApiPayment.PaymentFrequency
					Integer lNumPolicyPaymentFrequencyRow=lMapPolicyPaymentFrequency.RowNumber
					Integer lNumPolicyPaymentFrequencyColumn=lMapPolicyPaymentFrequency.ColumnNumber
					Boolean lIsInputPolicyPaymentFrequencyToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPolicyPaymentFrequencyRow,lNumPolicyPaymentFrequencyColumn,lStrPricingApiPaymentFrequency)
					if(!lIsInputPolicyPaymentFrequencyToExcelSheetDone){
						return lreturn
					}
				}
				if(!lIsFlagApplyLoadingFactorOK){
					lStrPricingApiLoadingFactor=this.inputPricingApiLoadingFactorForGivenPaymentFrequency(lSheetPricingApi,lListLoadingFactor,lStrPricingApiPaymentFrequency,lMapPricingApiPayment)
					if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiLoadingFactor)){
						lIsOK=false
					}
				}
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiPaymentFrequency)){
				lIsOK=false
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrPricingApiPaymentFrequency',lStrPricingApiPaymentFrequency)
				lreturn.put('BoolIsPricingApiFlagApplyLoadingFactor',lIsFlagApplyLoadingFactorOK)
				lreturn.put('StrPricingApiLoadingFactor',lStrPricingApiLoadingFactor)
				lreturn.put('StrPricingApiMasterSetId',lStrPricingApiMasterSetId)
				lreturn.put('StrPricingApiRequestProductTypeName',lStrPricingApiRequestProductTypeName)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map getMapPricingApiInputCoverage(Map mapPricingApiSelectedAdditionalCoverage){
		Map lreturn=[:]
		Boolean lResult=false
		List<String> lListPricingApiCoverageName=new ArrayList()
		List<String> lListPricingApiCoverageSA=new ArrayList()
		List<String> lListPricingApiCoveragePremium=new ArrayList()
		Map lMapPricingApiCoverageValidationTestResult=[:]
		try{
			lreturn.put('ListPricingApiCoverageName',lListPricingApiCoverageName)
			lreturn.put('ListPricingApiCoverageSA',lListPricingApiCoverageSA)
			lreturn.put('ListPricingApiCoveragePremium',lListPricingApiCoveragePremium)
			lreturn.put('MapPricingApiCoverageValidationTestResult',lMapPricingApiCoverageValidationTestResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiSelectedAdditionalCoverage)){
				return lreturn
			}
			Map lMapPricingApiSelectedAdditionalCoverage=mapPricingApiSelectedAdditionalCoverage
			String lStrAdditionalCoverageName=''
			String lStrAdditionalCoverageValue=''
			List<String> lListPricingApiCoverageNameAll=new ArrayList()
			for(Map.Entry lEntry : lMapPricingApiSelectedAdditionalCoverage.entrySet()){
				String lKey=lEntry.getKey()
				if(lKey.endsWith('Name')){
					lStrAdditionalCoverageName=lKey.replace('Name','')
					String lValue=lEntry.getValue()
					if(lValue!='None'){
						lStrAdditionalCoverageValue=lValue
					}
				}
				if(lKey.endsWith('SA')){
					String lValue=lEntry.getValue()
					lStrAdditionalCoverageName=lKey.replace('SA','')
					if(lValue!='None'){
						lListPricingApiCoverageSA.add(lValue)
						lListPricingApiCoverageName.add(lStrAdditionalCoverageValue)
						lListPricingApiCoverageNameAll.add(lStrAdditionalCoverageName)
					}
				}
				if(lKey.endsWith('Premium')){
					Map lValue=lEntry.getValue()
					lStrAdditionalCoverageName=lKey.replace('Premium','')
					if(lValue!='None'&&(lListPricingApiCoverageNameAll.contains(lStrAdditionalCoverageName))){
						lListPricingApiCoveragePremium.add(lValue)
					}
				}
			}
			lMapPricingApiCoverageValidationTestResult.put('GetPlanPriceValidationTestResult',lMapPricingApiSelectedAdditionalCoverage.ValidationTestResultGetPlanPrice)
			lMapPricingApiCoverageValidationTestResult.put('GetPlanWithInstallmentPriceValidationTestResult',lMapPricingApiSelectedAdditionalCoverage.ValidationTestResultGetPlanWithInstallmentPrice)
			lMapPricingApiCoverageValidationTestResult.put('LibraryGetPlanWithPriceValidationTestResult',lMapPricingApiSelectedAdditionalCoverage.ValidationTestResultLibraryGetPlanPrice)
			lMapPricingApiCoverageValidationTestResult.put('LibraryGetPlanWithInstallmentPriceValidationTestResult',lMapPricingApiSelectedAdditionalCoverage.ValidationTestResultLibraryGetPlanWithInstallmentPrice)
			lreturn.put('ListPricingApiCoverageName',lListPricingApiCoverageName)
			lreturn.put('ListPricingApiCoverageSA',lListPricingApiCoverageSA)
			lreturn.put('ListPricingApiCoveragePremium',lListPricingApiCoveragePremium)
			lreturn.put('MapPricingApiCoverageValidationTestResult',lMapPricingApiCoverageValidationTestResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public List getListDecodedPricingApiGenericData(Object objectPricingApiDecodedGenericData){
		List lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(objectPricingApiDecodedGenericData)){
			return lreturn
		}
		Object lObjectSelectedGenericDataList=objectPricingApiDecodedGenericData
		List<String>  lListSelectedPricingApiGenericData=new ArrayList<String>()
		try{
			if(lObjectSelectedGenericDataList.getClass()==LazyMap.class){
				Map lMapSelectedGenericData=lObjectSelectedGenericDataList
				lListSelectedPricingApiGenericData.add(lMapSelectedGenericData)
			}
			else if(lObjectSelectedGenericDataList.getClass()==ArrayList.class){
				lListSelectedPricingApiGenericData=lObjectSelectedGenericDataList
			}
			lResult=lListSelectedPricingApiGenericData.size()>0
			if(lResult){
				lreturn=lListSelectedPricingApiGenericData
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
			String lStrPricingApiCurrentProductType=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			String lStrPricingApiProductType=IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_PRODUCT_TYPE
			String lStrPricingApiGenericDataFile=IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME
			if((IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiProductType) || (IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGenericDataFile)))){
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_PRODUCT_TYPE=lStrPricingApiCurrentProductType
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME=this.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME
			}else if(lStrPricingApiCurrentProductType!=lStrPricingApiProductType){
				Boolean lIsPricingApiSendReportOK=this.sendPricingApiReport()
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_PRODUCT_TYPE=lStrPricingApiCurrentProductType
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME=this.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_PASSED='0'
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_FAILED='0'
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ERROR='0'
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ALL='0'
			}
			Boolean lIsActualResultOK=IGNUemaHelper.convertStringToBoolean(lActualResult)
			String lStrPricingApiTotalNumberOfCases=IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ALL
			Integer lNumPricingApiTotalNumberOfCases=IGNUemaHelper.convertStringToInteger(lStrPricingApiTotalNumberOfCases,0)
			lNumPricingApiTotalNumberOfCases=lNumPricingApiTotalNumberOfCases+1
			lStrPricingApiTotalNumberOfCases=Integer.toString(lNumPricingApiTotalNumberOfCases)
			Integer lSubSetDataIndex=0
			Integer lPricingApiNumberOfTestCaseSubset=IGNUemaHelper.convertStringToInteger(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_SUBSET,0)
			lSubSetDataIndex=this.CURRENT_PRICING_API_NUMBER_OF_SUBSET+lPricingApiNumberOfTestCaseSubset
			IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_SUBSET=lSubSetDataIndex.toString()
			IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ALL=lStrPricingApiTotalNumberOfCases
			if(lIsActualResultOK){
				Integer lNumPricingApiNumberOfTestCasesPassed=IGNUemaHelper.convertStringToInteger(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_PASSED,0)
				lNumPricingApiNumberOfTestCasesPassed=lNumPricingApiNumberOfTestCasesPassed+1
				String lStrPricingApiNumberOfTestCasesPassed=Integer.toString(lNumPricingApiNumberOfTestCasesPassed)
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_PASSED=lStrPricingApiNumberOfTestCasesPassed
			}else{
				Integer lPricingApiNumberOfTestCasesFailedNum=IGNUemaHelper.convertStringToInteger(IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_FAILED,0)
				lPricingApiNumberOfTestCasesFailedNum=lPricingApiNumberOfTestCasesFailedNum+1
				String lStrPricingApiNumberOfTestCasesFailed=Integer.toString(lPricingApiNumberOfTestCasesFailedNum)
				IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_FAILED=lStrPricingApiNumberOfTestCasesFailed
			}
			lreturn=true
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Boolean sendPricingApiReport(){
		Boolean lreturn=false
		try{
			String lStrDatetime=IGNUemaHelper.convertLocalDateTimeToString('yyyy/MM/dd HH:mm')
			String lStrSubject='Pricing API'+' '+'('+IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_PRODUCT_TYPE+')'+': Automation report ['+lStrDatetime+'].'
			String lStrEmailBody=IDNUemaHelper.getEmailBodyForReport(lStrSubject,IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS(),IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ALL,IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_PASSED,IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_FAILED,IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_TEST_CASE_ERROR)
			String[] lArrayEmailAttachFile=new String[1]
			lArrayEmailAttachFile[0]=IDNPricingApiGetPriceListCoreType.CURRENT_PRICING_API_GENERIC_DATA_FILE_NAME
			lreturn=IGNSendEmail.sendRoojaiReportIDN(IDNGlobalConst.DEFAULT_EMAIL_TO_ME,lStrSubject,lStrEmailBody,lArrayEmailAttachFile)
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredCallTokenKey(String strCallTokenKey){
		Map lreturn=[:]
		String lStrQuoteRequiredCallTokenKey=strCallTokenKey.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallTokenKey',lStrQuoteRequiredCallTokenKey)
			lreturn.put('Result',lResult)
			if(lStrQuoteRequiredCallTokenKey.length()<=0){
				lStrQuoteRequiredCallTokenKey=''
			}
			lResult=lStrQuoteRequiredCallTokenKey.length()>=0
			if(lResult){
				lreturn.put('CallTokenKey',lStrQuoteRequiredCallTokenKey)
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
		String lStrQuoteRequiredCallSdkVersion=strCallSdkVersion.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallSdkVersion','')
			lreturn.put('Result',lResult)
			if(lStrQuoteRequiredCallSdkVersion.length()<=0){
				lStrQuoteRequiredCallSdkVersion=''
			}
			lResult=lStrQuoteRequiredCallSdkVersion.length()>=0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('CallSdkVersion',lStrQuoteRequiredCallSdkVersion)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteRequiredCallStrProductType(String strCallStrProductType){
		Map lreturn=[:]
		String lStrQuoteRequiredCallStrProductType=strCallStrProductType.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallStrProductType','')
			lreturn.put('Result',lResult)
			if(lStrQuoteRequiredCallStrProductType.length()<=0){
				lStrQuoteRequiredCallStrProductType=''
			}
			lResult=lStrQuoteRequiredCallStrProductType.length()>=0
			if(lResult){
				lreturn.put('CallStrProductType',lStrQuoteRequiredCallStrProductType)
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
		String lStrQuoteRequiredCallMasterSetId=strCallMasterSetId.trim()
		try{
			Boolean lResult=false
			lreturn.put('CallMasterSetId','')
			lreturn.put('Result',lResult)
			if(lStrQuoteRequiredCallMasterSetId.length()<=0){
				lStrQuoteRequiredCallMasterSetId=''
			}
			lResult=lStrQuoteRequiredCallMasterSetId.length()>=0
			if(lResult){
				lreturn.put('CallMasterSetId',lStrQuoteRequiredCallMasterSetId)
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
		String lStrQuoteRequiredProductType=strProductType.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteRequiredProductType',lStrQuoteRequiredProductType)
			lreturn.put('Result',lResult)
			if(lStrQuoteRequiredProductType.length()<=0){
				lStrQuoteRequiredProductType=''
			}
			lResult=lStrQuoteRequiredProductType.length()>=0
			if(lResult){
				lreturn.put('QuoteRequiredProductType',lStrQuoteRequiredProductType)
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
		String lStrQuoteRequiredTransactionType=strTransactionType.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteRequiredTransactionType','')
			lreturn.put('Result',lResult)
			if(lStrQuoteRequiredTransactionType.length()<=0){
				lStrQuoteRequiredTransactionType=''
			}
			lResult=lStrQuoteRequiredTransactionType.length()>=0
			if(lResult){
				lreturn.put('QuoteRequiredTransactionType',lStrQuoteRequiredTransactionType)
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
		String lStrQuoteRequiredQuoteOffsetDay=strQuoteRequiredQuoteOffsetDay.trim()
		String lStrQuoteRequiredQuoteDate=strQuoteRequiredQuoteDate.trim()
		String lStrQuoteRequiredQuoteDateTime=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteRequiredQuoteDate',lStrQuoteRequiredQuoteDateTime)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteRequiredQuoteDateToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteRequiredQuoteDateToAdd)
			if(!lIsQuoteRequiredQuoteDateToAdd){
				lStrQuoteRequiredQuoteDate=''
			}else{
				String lFormatDate='dd/MM/yyyy'
				if(lStrQuoteRequiredQuoteDate.length()<=0){
					lStrQuoteRequiredQuoteDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
				}
				if(lStrQuoteRequiredQuoteOffsetDay.length()<=0){
					lStrQuoteRequiredQuoteOffsetDay='0'
				}
				Integer lQuoteRequiredQuoteOffsetDayNum=IGNUemaHelper.convertStringToInteger(lStrQuoteRequiredQuoteOffsetDay,0)
				lStrQuoteRequiredQuoteDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lStrQuoteRequiredQuoteDate,lQuoteRequiredQuoteOffsetDayNum)
				String lStrQuoteRequiredQuoteDateDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lStrQuoteRequiredQuoteDate)
				String lStrQuoteRequiredQuoteDateMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lStrQuoteRequiredQuoteDate)
				String lStrQuoteRequiredQuoteDateYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lStrQuoteRequiredQuoteDate)
				String lStrQuoteRequiredQuoteTime=IGNUemaHelper.convertLocalTimeToTimeZoneString()
				String lStrQuoteRequiredQuoteTimeHour=IGNUemaHelper.extractTimeStringHourFromTimeZoneStringColonDotHHMMSSZZZZ(lStrQuoteRequiredQuoteTime)
				String lStrQuoteRequiredQuoteTimeMinute=IGNUemaHelper.extractTimeStringMinuteFromTimeZoneStringColonDotHHMMSSZZZZ(lStrQuoteRequiredQuoteTime)
				String lStrQuoteRequiredQuoteTimeSecond=IGNUemaHelper.extractTimeStringSecondFromTimeZoneStringColonDotHHMMSSZZZZ(lStrQuoteRequiredQuoteTime)
				String lStrQuoteRequiredQuoteTimeZone=IGNUemaHelper.extractTimeStringZoneFromTimeZoneStringColonDotHHMMSSZZZZ(lStrQuoteRequiredQuoteTime)
				lStrQuoteRequiredQuoteDateTime=IGNUemaHelper.convertLocalDateTimeToInstantString(IGNUemaHelper.encodeLocalDateTimeWithZoneFromStringNumber(lStrQuoteRequiredQuoteDateYYYY,lStrQuoteRequiredQuoteDateMM,lStrQuoteRequiredQuoteDateDD,lStrQuoteRequiredQuoteTimeHour,lStrQuoteRequiredQuoteTimeMinute,lStrQuoteRequiredQuoteTimeSecond,lStrQuoteRequiredQuoteTimeZone))
			}
			lResult=(lStrQuoteRequiredQuoteDateTime.length())>=0
			if(lResult){
				lreturn.put('QuoteRequiredQuoteDate',lStrQuoteRequiredQuoteDateTime)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteOptionalPolicyStartDate(String strQuoteOptionalPolicyStartDateToAdd,String strQuoteOptionalPolicyStartOffsetDay,String strQuoteOptionalPolicyStartDate){
		Map lreturn=[:]
		String lStrQuoteOptionalPolicyStartDateToAdd=strQuoteOptionalPolicyStartDateToAdd.trim()
		String lStrQuoteOptionalPolicyStartDate=strQuoteOptionalPolicyStartDate.trim()
		String lStrQuoteOptionalPolicyStartDateOffsetDay=strQuoteOptionalPolicyStartOffsetDay.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalPolicyStartDate',lStrQuoteOptionalPolicyStartDate)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalStartDateToAdd=IGNUemaHelper.convertStringToBoolean(lStrQuoteOptionalPolicyStartDateToAdd)
			if(!lIsQuoteOptionalStartDateToAdd){
				lStrQuoteOptionalPolicyStartDate=''
			}else{
				String lStrFormatDate='yyyy-MM-dd'
				if(lStrQuoteOptionalPolicyStartDate.length()<=0){
					lStrQuoteOptionalPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lStrFormatDate)
				}
				if(lStrQuoteOptionalPolicyStartDateOffsetDay.length()<=0){
					lStrQuoteOptionalPolicyStartDateOffsetDay='0'
				}
				Integer lNumQuoteOptionalPolicyStartDateOffsetDay=IGNUemaHelper.convertStringToInteger(lStrQuoteOptionalPolicyStartDateOffsetDay,0)
				lStrQuoteOptionalPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lStrFormatDate,lStrQuoteOptionalPolicyStartDate,lNumQuoteOptionalPolicyStartDateOffsetDay)
			}
			lResult=(lStrQuoteOptionalPolicyStartDate.length()>0)
			if(lResult){
				lreturn.put('QuoteOptionalPolicyStartDate',lStrQuoteOptionalPolicyStartDate)
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
		String lStrQuoteOptionalPolicyEndDateToAdd=strQuoteOptionalPolicyEndDateToAdd.trim()
		String lStrQuoteOptionalPolicyEndDate=strQuoteOptionalPolicyEndDate.trim()
		String lStrQuoteOptionalPolicyEndDateOffsetDay=strQuoteOptionalPolicyEndOffsetDay.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalPolicyEndDate',lStrQuoteOptionalPolicyEndDate)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalPolicyEndDateToAdd=IGNUemaHelper.convertStringToBoolean(lStrQuoteOptionalPolicyEndDateToAdd)
			if(!lIsQuoteOptionalPolicyEndDateToAdd){
				lStrQuoteOptionalPolicyEndDate=''
			}else{
				String lStrFormatDate='yyyy-MM-dd'
				if(lStrQuoteOptionalPolicyEndDate.length()<=0){
					lStrQuoteOptionalPolicyEndDate=IGNUemaHelper.convertLocalDateToString(lStrFormatDate)
				}
				if(lStrQuoteOptionalPolicyEndDateOffsetDay.length()<=0){
					lStrQuoteOptionalPolicyEndDateOffsetDay='0'
				}
				Integer lQuoteOptionalPolicyEndDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lStrQuoteOptionalPolicyEndDateOffsetDay,0)
				lStrQuoteOptionalPolicyEndDate=IGNUemaHelper.offsetDayByDateString(lStrFormatDate,lStrQuoteOptionalPolicyEndDate,lStrQuoteOptionalPolicyEndDateOffsetDay)
			}
			lResult=lStrQuoteOptionalPolicyEndDate.length()>0
			if(lResult){
				lreturn.put('QuoteOptionalPolicyEndDate',lStrQuoteOptionalPolicyEndDate)
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
		String lStrQuoteOptionalFirstQuoteDateToAdd=strQuoteOptionalFirstQuoteDateToAdd.trim()
		String lStrQuoteOptionalFirstQuoteDateOffsetDay=strQuoteOptionalFirstQuoteDateOffsetDay.trim()
		String lStrQuoteOptionalFirstQuoteDate=strQuoteOptionalFirstQuoteDate.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalFirstQuoteDate',lStrQuoteOptionalFirstQuoteDate)
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalFirstQuoteDateToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalFirstQuoteDateToAdd)
			if(!lIsQuoteOptionalFirstQuoteDateToAdd){
				lStrQuoteOptionalFirstQuoteDate=''
			}else{
				String lStrFormatDate='yyyy-MM-dd'
				if(lStrQuoteOptionalFirstQuoteDate.length()<=0){
					lStrQuoteOptionalFirstQuoteDate=IGNUemaHelper.convertLocalDateToString(lStrFormatDate)
				}
				if(lStrQuoteOptionalFirstQuoteDateOffsetDay.length()<=0){
					lStrQuoteOptionalFirstQuoteDateOffsetDay='0'
				}
				Integer lQuoteOptionalFirstQuoteDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lStrQuoteOptionalFirstQuoteDateOffsetDay,0)
				lStrQuoteOptionalFirstQuoteDate=IGNUemaHelper.offsetDayByDateString(lStrFormatDate,lStrQuoteOptionalFirstQuoteDate,lQuoteOptionalFirstQuoteDateOffsetDayNum)
			}
			lResult=lStrQuoteOptionalFirstQuoteDate.length()>0
			if(lResult){
				lreturn.put('QuoteOptionalFirstQuoteDate',lStrQuoteOptionalFirstQuoteDate)
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
		String lStrQuoteOptionalEndorsementEffectiveDateToAdd=strQuoteOptionalEndorsementEffectiveDateToAdd.trim()
		String lStrQuoteOptionalEndorsementEffectiveDate=strQuoteOptionalEndorsementEffectiveDate.trim()
		String lStrQuoteOptionalEndorsementEffectiveDateOffsetDay=strQuoteOptionalEndorsementEffectiveDateOffsetDay.trim()
		try{
			Boolean lResult=false
			lreturn.put('QuoteOptionalEndorsementEffectiveDate','')
			lreturn.put('Result',lResult)
			Boolean lIsQuoteOptionalEndorsementEffectiveDateToAdd=IGNUemaHelper.convertStringToBoolean(strQuoteOptionalEndorsementEffectiveDateToAdd)
			if(!lIsQuoteOptionalEndorsementEffectiveDateToAdd){
				lStrQuoteOptionalEndorsementEffectiveDate=''
			}else{
				String lStrFormatDate='yyyy-MM-dd'
				if(lStrQuoteOptionalEndorsementEffectiveDate.length()<=0){
					lStrQuoteOptionalEndorsementEffectiveDate=IGNUemaHelper.convertLocalDateToString(lStrFormatDate)
				}
				if(lStrQuoteOptionalEndorsementEffectiveDateOffsetDay.length()<=0){
					lStrQuoteOptionalEndorsementEffectiveDateOffsetDay='0'
				}
				Integer lNumQuoteOptionalEndorsementEffectiveDateOffsetDay=IGNUemaHelper.convertStringToInteger(lStrQuoteOptionalEndorsementEffectiveDateOffsetDay,0)
				lStrQuoteOptionalEndorsementEffectiveDate=IGNUemaHelper.offsetDayByDateString(lStrFormatDate,lStrQuoteOptionalEndorsementEffectiveDate,lNumQuoteOptionalEndorsementEffectiveDateOffsetDay)
			}
			lResult=lStrQuoteOptionalEndorsementEffectiveDate.length()>0
			if(lResult){
				lreturn.put('QuoteOptionalEndorsementEffectiveDate',lStrQuoteOptionalEndorsementEffectiveDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPricingApiCallRegisterClient(Map mapPricingApiInputOutput){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiCallTokenKey=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallTokenKey
			String lStrPricingApiCallSdkVersion=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallSdkVersion
			String lStrPricingApiCallStrProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallStrProductType
			String lStrPricingApiCallMasterSetId=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiCallMasterSetId
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			Map lMapRegisterCallRequestParameter=[:]
			Map lMapPricingApiCallTokenKey=this.inputQuoteRequiredCallTokenKey(lStrPricingApiCallTokenKey)
			if(!lMapPricingApiCallTokenKey.Result){
				return lreturn
			}
			lStrPricingApiCallTokenKey=lMapPricingApiCallTokenKey.CallTokenKey
			lMapRegisterCallRequestParameter.put('PricingApiCallTokenKey',lStrPricingApiCallTokenKey)
			Map lMapPricingApiCallSdkVersion=this.inputQuoteRequiredCallSdkVersion(lStrPricingApiCallSdkVersion)
			if(!lMapPricingApiCallSdkVersion.Result){
				return lreturn
			}
			lStrPricingApiCallSdkVersion=lMapPricingApiCallSdkVersion.CallSdkVersion
			lMapRegisterCallRequestParameter.put('PricingApiCallSdkVersion',lStrPricingApiCallSdkVersion)
			Map lMapPricingApiCallStrProductType=this.inputQuoteRequiredCallStrProductType(lStrPricingApiQuoteRequiredProductType)
			if(!lMapPricingApiCallStrProductType.Result){
				return lreturn
			}
			lStrPricingApiCallStrProductType=lMapPricingApiCallStrProductType.CallStrProductType
			lMapRegisterCallRequestParameter.put('PricingApiCallStrProductType',lStrPricingApiQuoteRequiredProductType)
			Map lMapPricingApiCallMasterSetId=this.inputQuoteRequiredCallMasterSetId(lStrPricingApiCallMasterSetId)
			if(!lMapPricingApiCallMasterSetId.Result){
				return lreturn
			}
			lStrPricingApiCallMasterSetId=lMapPricingApiCallMasterSetId.CallMasterSetId
			lMapRegisterCallRequestParameter.put('PricingApiCallMasterSetId',lStrPricingApiCallMasterSetId)
			Map lMapPricingApiInput=[:]
			Map lMapPricingApiQuoteRequiredProductType=this.inputQuoteRequiredProductType(lStrPricingApiQuoteRequiredProductType)
			if(!lMapPricingApiQuoteRequiredProductType.Result){
				return lreturn
			}
			lStrPricingApiQuoteRequiredProductType=lMapPricingApiQuoteRequiredProductType.QuoteRequiredProductType
			lMapPricingApiInput.put('QuoteRequiredProductType',lStrPricingApiQuoteRequiredProductType)
			String lStrPricingApiRegisterClientInputRequestBodyContent=this.inputPricingApiRegisterClientSetRequestBodyContent(lMapRegisterCallRequestParameter)
			mapPricingApiInputOutput.RegisterClientRequest=lStrPricingApiRegisterClientInputRequestBodyContent
			Boolean lIsRegisterClientApiCallResult=this.initPricingApiRegisterClientApiRequest(lStrPricingApiRegisterClientInputRequestBodyContent,lStrPricingApiCallSdkVersion,mapPricingApiInputOutput)
			lreturn=lIsRegisterClientApiCallResult
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPricingApiCallInitService(Map mapPricingApiInputOutput){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			String lStrPricingApiInitServiceInputRequestBodyContent=this.inputPricingApiInitServiceClientSetRequestBodyContent(lStrPricingApiQuoteRequiredProductType)
			Boolean lIsInitServiceCallOK=this.initServicePricingApiRequest(lStrPricingApiInitServiceInputRequestBodyContent,mapPricingApiInputOutput)
			lreturn=lIsInitServiceCallOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String preparePricingApiJsonQuotationInput(Sheet sheetPricingApi,Sheet sheetMasterData,String strPricingApiJsonRootQuotationInput,String strPricingApiJsonRootVehicleData,Map mapPricingApiInputOutput){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterData)){
			return lreturn
		}
		Sheet lSheetMasterData=sheetMasterData
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		String lStrPricingApiJsonRootQuotationInput=strPricingApiJsonRootQuotationInput
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootVehicleData)){
			return lreturn
		}
		String lStrPricingApiJsonRootVehicleData=strPricingApiJsonRootVehicleData
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
			return lreturn
		}
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredTransactionType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			String lStrPricingApiQuoteProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			Map lMapJsonVersion01PricingApiRootQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonRootQuotationInput)
			if(lStrPricingApiQuoteProductType.contains('Motor')){
				lMapJsonVersion01PricingApiRootQuotationInput=this.getMapPricingApiVehicleData(lSheetPricingApi,lSheetMasterData,lStrPricingApiJsonRootQuotationInput,lStrPricingApiJsonRootVehicleData)
				if(IGNUemaHelper.checkObjectEmptyOfMap(lMapJsonVersion01PricingApiRootQuotationInput)){
					return lreturn
				}
			}
			Map lMapInputPricingApiPolicyQuoteDateToExcelSheetResult=this.inputPolicyQuoteDateToExcelSheet(lSheetPricingApi,lStrPricingApiQuoteRequiredTransactionType,lStrPricingApiJsonRootVehicleData,lMapJsonVersion01PricingApiRootQuotationInput)
			if(!lMapInputPricingApiPolicyQuoteDateToExcelSheetResult.Result){
				return lreturn
			}
			Map lMapJsonVersion02PricingApiRootQuotationInput=lMapInputPricingApiPolicyQuoteDateToExcelSheetResult.MapJsonRootQuotationInput
			String lStrStartDateText=lMapInputPricingApiPolicyQuoteDateToExcelSheetResult.StrPolicyStartDate
			String lStrEndorsementEffectiveDateText=lMapInputPricingApiPolicyQuoteDateToExcelSheetResult.StrEndorsementEffectiveDate
			mapPricingApiInputOutput.put('QuotePolicyStartDate',lStrStartDateText)
			mapPricingApiInputOutput.put('QuotePolicyEndorsementEffectiveDate',lStrEndorsementEffectiveDateText)
			JsonBuilder lJsonVersion02PricingApiRootQuotationInput=new JsonBuilder(lMapJsonVersion02PricingApiRootQuotationInput)
			String lStrJsonVersion02PricingApiRootQuotationInput=lJsonVersion02PricingApiRootQuotationInput.toString()
			lResult=lStrJsonVersion02PricingApiRootQuotationInput.length()>0
			if(lResult){
				lreturn=lStrJsonVersion02PricingApiRootQuotationInput
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map getMapPricingApiVehicleData(Sheet sheetPricingApi,Sheet sheetMasterData,String strPricingApiJsonRootQuotationInput,String strPricingApiJsonRootVehicleData){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterData)){
			return lreturn
		}
		Sheet lSheetMasterData=sheetMasterData
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		String lStrPricingApiJsonRootQuotationInput=strPricingApiJsonRootQuotationInput
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootQuotationInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootVehicleData)){
			return lreturn
		}
		String lStrPricingApiJsonRootVehicleData=strPricingApiJsonRootVehicleData
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootVehicleData)){
			return lreturn
		}
		try{
			List<GroovyRowResult> lListSetVehicleDataResult=[]
			Map lMapPricingApiJsonRootVehicleData=new JsonSlurper().parseText(lStrPricingApiJsonRootVehicleData)
			Map lMapInputVehicleData=lMapPricingApiJsonRootVehicleData.VehicleData
			Map lMapJsonRootQuotationInput=new JsonSlurper().parseText(lStrPricingApiJsonRootQuotationInput)
			Map lMapVehicleData=lMapJsonRootQuotationInput.root.quoteData.vehicleData
			String lStrVehicleMake=lMapVehicleData.make
			String lStrVehicleModel=lMapVehicleData.modelFamily
			String lStrVehicleYearOfManufacture=lMapVehicleData.yearOfManufacture
			String lStrVehicleSubModel=lMapVehicleData.modelDescription
			Map lMapPricingApiVehicleDataResult=IDNPricingApiHelper.getVehicleDataTable(lStrVehicleMake,lStrVehicleModel,lStrVehicleYearOfManufacture,lStrVehicleSubModel)
			if(!lMapPricingApiVehicleDataResult.Result){
				return lreturn
			}
			lListSetVehicleDataResult=lMapPricingApiVehicleDataResult.VehicleDataResultSet
			List lListPricingApiVehicleData=IGNUemaHelper.convertListGroovyRowResultToListMapString(lListSetVehicleDataResult)
			Map lMapPricingApiVehicleData=lListPricingApiVehicleData.get(0)
			Map lMapRedBookVehicleDataParameterWithMasterParameter=[:]
			Map lMapRedBookVehicleDataParameterWithMasterParameterResult=IDNPricingApiPrepareGenericDataInputUtil.inputMapTargetParameterWithMasterParameter(lSheetMasterData,'RedBook')
			if(lMapRedBookVehicleDataParameterWithMasterParameterResult.Result){
				lMapRedBookVehicleDataParameterWithMasterParameter=lMapRedBookVehicleDataParameterWithMasterParameterResult.MasterDataParameter
			}
			for(Map.Entry lEntry in lMapRedBookVehicleDataParameterWithMasterParameter){
				String lStrRedBookDataKey01=lEntry.getKey()
				String lStrVehicleDataValue01=lEntry.getValue()
				String[] lArrayRedBookDataKeyWithDataType=lStrRedBookDataKey01.split('/')
				String[] lArrayVehicleDataValueWithDataType=lStrVehicleDataValue01.split('/')
				String lStrRedBookDataKey02=lArrayRedBookDataKeyWithDataType[0]
				String lStrRedBookDataDataType=lArrayRedBookDataKeyWithDataType[1]
				String lStrVehicleDataValue02=lArrayVehicleDataValueWithDataType[0]
				String lStrVehicleDataType=lArrayVehicleDataValueWithDataType[1]
				Map lMapVehicleDataTableInformation=lMapInputVehicleData.get(lStrVehicleDataValue02)
				String lStrRedBookDataValue=lMapPricingApiVehicleData.get(lStrRedBookDataKey02)
				if(lStrRedBookDataDataType!=lStrVehicleDataType){
					lStrRedBookDataValue=IGNUemaHelper.convertStringValueToDataTypeByStringDataType(lStrRedBookDataValue,lStrVehicleDataType)
				}
				lMapJsonRootQuotationInput.root.quoteData.vehicleData.put(lStrVehicleDataValue02,lStrRedBookDataValue)
				Integer lNumPricingApiVehicleDataRow=lMapVehicleDataTableInformation.RowNumber
				Integer lNumPricingApiVehicleDataColumn=lMapVehicleDataTableInformation.ColumnNumber
				Boolean lIsInputPricingApiVehicleDataToExcelSheetOK=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiVehicleDataRow,lNumPricingApiVehicleDataColumn,lStrRedBookDataValue)
			}
			lreturn=lMapJsonRootQuotationInput
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
				String lStrKey=lEntry.getKey()
				String lStrValue=lEntry.getValue()
				String[] lArrayRedBookKeyWithDataType=lStrKey.split('/')
				String[] lArrayRedBookValueWithDataType=lStrValue.split('/')
				lMapDecodedRedBookVehicleDataParameterWithMasterParameter.put(lArrayRedBookKeyWithDataType[0],lArrayRedBookValueWithDataType[0])
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
	public String inputPricingApiLoadingFactorForGivenPaymentFrequency(Sheet targetSheet,List listLoadingFactor,String strPaymentFrequency,Map mapPricingApiJsonPayment){
		String lreturn=''
		Boolean lResult=false
		String lStrSumAssured=''
		String lStrLoadingFactor=''
		if(IGNUemaHelper.checkObjectEmptyOfList(listLoadingFactor)){
			return lreturn
		}
		List lListLoadingFactor=listLoadingFactor
		if(IGNUemaHelper.checkObjectEmptyOfString(strPaymentFrequency)){
			return lreturn
		}
		String lStrGivenPaymentFrequency=strPaymentFrequency
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonPayment)){
			return lreturn
		}
		Map lMapPricingApiJsonPayment=mapPricingApiJsonPayment
		if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
			return lreturn
		}
		Sheet lSheetPricingApi=targetSheet
		try{
			for(Integer lLoadingFactorIndex=0;lLoadingFactorIndex<=lListLoadingFactor.size()-1;lLoadingFactorIndex++){
				Map lMapPaymentLoadingFactor=lListLoadingFactor.get(lLoadingFactorIndex)
				String lStrPaymentFrequencyValue=lMapPaymentLoadingFactor.Payment_Frequency
				if(lStrGivenPaymentFrequency==lStrPaymentFrequencyValue){
					lStrLoadingFactor=lMapPaymentLoadingFactor.Payment_Loading
				}
			}
			Boolean lIsLoadingFactorOK=lStrLoadingFactor.length()>=1
			Map lMapLoadingFactor=lMapPricingApiJsonPayment.LoadingFactor
			Integer lNumRow=lMapLoadingFactor.RowNumber
			Integer lNumColumn=lMapLoadingFactor.ColumnNumber
			Boolean lIsWriteLoadingFactorValueToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumRow,lNumColumn,lStrLoadingFactor)
			lResult=(lIsWriteLoadingFactorValueToExcelSheetDone && lIsLoadingFactorOK)
			if(lResult){
				lreturn=lStrLoadingFactor
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getPremiumBasedPolicyPaymentFrequencySequence(String strTargetPremium,Integer numSequence){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetPremium)){
			return lreturn
		}
		String lStrTargetPremium=strTargetPremium
		Integer lNumSequence=numSequence
		try{
			String[] lArrayTargetPremiumWithPaymentFrequency=lStrTargetPremium.split('_')
			String lStrPremium=''
			lStrPremium=lArrayTargetPremiumWithPaymentFrequency[lNumSequence-1]
			lResult=lStrPremium.length()>0
			if(lResult){
				lreturn=lStrPremium
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
		String lStrPricingApiRegisterClientInputRequestBodyContent=''
		try{
			Boolean lIslPricingApiRegisterClientInputBodyContent=IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiRegisterClientInputBodyContent)
			if(lIslPricingApiRegisterClientInputBodyContent){
				return lreturn
			}
			Map lMapPricingApiMultiPlanPriceInputRequestBodyContent=[:]
			Map lMapPricingApiRegisterClientCallInputRequestData=[:]
			String lStrPricingApiRegisterClientInputRequestCallTokenKey=mapPricingApiRegisterClientInputBodyContent.PricingApiCallTokenKey
			lMapPricingApiRegisterClientCallInputRequestData.put('ApiKey',lStrPricingApiRegisterClientInputRequestCallTokenKey)
			String lStrPricingApiRegisterClientInputRequestCallSdkVersion=mapPricingApiRegisterClientInputBodyContent.PricingApiCallSdkVersion
			lMapPricingApiRegisterClientCallInputRequestData.put('SdkVersion',lStrPricingApiRegisterClientInputRequestCallSdkVersion)
			String lStrPricingApiRegisterClientInputRequestCallStrProductType=mapPricingApiRegisterClientInputBodyContent.PricingApiCallStrProductType
			lMapPricingApiRegisterClientCallInputRequestData.put('ProductType',lStrPricingApiRegisterClientInputRequestCallStrProductType)
			String lStrPricingApiRegisterClientInputRequestCallMasterSetId=mapPricingApiRegisterClientInputBodyContent.PricingApiCallMasterSetId
			lMapPricingApiRegisterClientCallInputRequestData.put('MasterSetId',lStrPricingApiRegisterClientInputRequestCallMasterSetId)
			JsonBuilder lJsonPricingApiRegisterClientInputRequest=new JsonBuilder(lMapPricingApiRegisterClientCallInputRequestData)
			lStrPricingApiRegisterClientInputRequestBodyContent=lJsonPricingApiRegisterClientInputRequest.toString()
			lreturn=lStrPricingApiRegisterClientInputRequestBodyContent
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPricingApiInitServiceClientSetRequestBodyContent(String strQuoteRequiredProductType){
		String lreturn=''
		Boolean lResult=false
		String lStrPricingApiInitServiceInputRequestBodyContent=''
		if(IGNUemaHelper.checkObjectEmptyOfString(strQuoteRequiredProductType)){
			return lreturn
		}
		String lStrPricingApiQuoteRequiredProductType=strQuoteRequiredProductType
		try{
			Map lMapPricingApiMultiPlanPriceInputRequestBodyContent=[:]
			Map lMapPricingApiInitServiceCallInputRequestData=[:]
			lMapPricingApiInitServiceCallInputRequestData.put('ProductType',lStrPricingApiQuoteRequiredProductType)
			lMapPricingApiInitServiceCallInputRequestData.put('LibName','IGNPricingEngine')
			JsonBuilder lJsonPricingApiInitServiceInputRequest=new JsonBuilder(lMapPricingApiInitServiceCallInputRequestData)
			lStrPricingApiInitServiceInputRequestBodyContent=lJsonPricingApiInitServiceInputRequest.toString()
			lreturn=lStrPricingApiInitServiceInputRequestBodyContent
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean initPricingApiRegisterClientApiRequest(String strPricingApiRegisterClientInputRequestBodyContent,String strPricingApiCallSdkVersion,Map mapPricingApiInputOutput){
		Boolean lreturn=false
		String lStrPricingApiRegisterClientInputRequestBodyContent=strPricingApiRegisterClientInputRequestBodyContent.trim()
		String lStrPricingApiCallSdkVersion=strPricingApiCallSdkVersion.trim()
		Boolean lIsMapRegisterClientBodyRequestEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiRegisterClientInputRequestBodyContent)
		if(lIsMapRegisterClientBodyRequestEmpty){
			return lreturn
		}
		try{
			Boolean lIsOK=false
			Map lMapPricingApiRegisterClientCallRequestResult=IDNPricingApiRestAPIHelper.mapPricingApiRegisterClientCallRequest(lStrPricingApiRegisterClientInputRequestBodyContent,lStrPricingApiCallSdkVersion)
			String lStrRegisterClientApiResponseStatusCode=lMapPricingApiRegisterClientCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.RegisterClientResponseStatus=lStrRegisterClientApiResponseStatusCode
			Integer lNumRegisterClientApiResponseStatusCode=Integer.valueOf(lStrRegisterClientApiResponseStatusCode)
			String lStrRegisterClientApiResponseTime=lMapPricingApiRegisterClientCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.RegisterClientResponseTime=lStrRegisterClientApiResponseTime
			String lStrRegisterClientApiResponse=lMapPricingApiRegisterClientCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.RegisterClientResponseText=lStrRegisterClientApiResponse
			Map lMapJson=new JsonSlurper().parseText(lStrRegisterClientApiResponse)
			String lStrRegisterClientApiUuid=lMapJson.UUID
			mapPricingApiInputOutput.RegisterUuid=lStrRegisterClientApiUuid
			mapPricingApiInputOutput.RegisterClientInitServiceUrl=lMapJson.initServiceUrl
			ResponseObject lResponseObject=lMapPricingApiRegisterClientCallRequestResult.ResponseObject
			Map lMapRegisterClientHeader=lResponseObject.getHeaderFields()
			List lListRegisterClientHeader=lMapRegisterClientHeader.get('Set-Cookie')
			if(lListRegisterClientHeader.size()>0){
				String lStrRegisterClientSessionKey=this.getStringRegisterClientCookieInformation(lListRegisterClientHeader,'SESSIONGW')
				mapPricingApiInputOutput.RegisterClientSessionKey=lStrRegisterClientSessionKey
			}
			Map lMapVerifyResponseRegisterClientApiResult=this.verifyResponseRegisterClientApi(lStrRegisterClientApiResponse,lNumRegisterClientApiResponseStatusCode,mapPricingApiInputOutput)
			lIsOK=lMapVerifyResponseRegisterClientApiResult.Result
			lIsOK=true
			lreturn=lIsOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getStringRegisterClientCookieInformation(List<String> listRegisterClientHeader,String strRegisterClientRequiredCookieHeader){
		String lreturn=''
		if(IGNUemaHelper.checkObjectEmptyOfList(listRegisterClientHeader)){
			return lreturn
		}
		List<String> lListRegisterClientHeader=listRegisterClientHeader
		if(IGNUemaHelper.checkObjectNullOfObject(strRegisterClientRequiredCookieHeader)){
			return lreturn
		}
		String lStrRegisterClientRequiredCookieHeader=strRegisterClientRequiredCookieHeader
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrRegisterClientRequiredCookieHeader)){
			return lreturn
		}
		try{
			String lRegisterClientRequiredCookieHeaderValue=''
			for(Integer lIndex=0;lIndex<=lListRegisterClientHeader.size()-1;lIndex++){
				String lStrRegisterClientHeader=lListRegisterClientHeader.get(lIndex)
				StringTokenizer lStringTokenizer=new StringTokenizer(lStrRegisterClientHeader, " ")
				while(lStringTokenizer.hasMoreTokens()){
					String lStrToken=lStringTokenizer.nextToken()
					if(IGNUemaHelper.checkStringContainString(lStrToken,lStrRegisterClientRequiredCookieHeader)){
						lRegisterClientRequiredCookieHeaderValue=lStrToken
					}
				}
			}
			lreturn=lRegisterClientRequiredCookieHeaderValue
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean initServicePricingApiRequest(String strPricingApiInitServiceInputRequestBodyContent,Map mapPricingApiInputOutput){
		Boolean lreturn=false
		Boolean lResult=false
		String lStrPricingApiInitServiceInputRequestBodyContent=strPricingApiInitServiceInputRequestBodyContent.trim()
		try{
			if(lStrPricingApiInitServiceInputRequestBodyContent.length()<=0){
				return lreturn
			}
			Boolean lIsOK=false
			String lStrPricingApiInitServiceInputRequestUrl=mapPricingApiInputOutput.RegisterClientInitServiceUrl
			String lStrRegisterUuid=mapPricingApiInputOutput.RegisterUuid
			String lStrRegisterClientSessionKey=mapPricingApiInputOutput.RegisterClientSessionKey
			Map lMapPricingApiInitServiceCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiIniServiceCallRequest(lStrPricingApiInitServiceInputRequestBodyContent,lStrPricingApiInitServiceInputRequestUrl,lStrRegisterUuid,lStrRegisterClientSessionKey)
			String lStrInitServiceApiResponseStatusCode=lMapPricingApiInitServiceCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.InitServiceResponseStatus=lStrInitServiceApiResponseStatusCode
			Integer lNumInitServiceApiResponseStatusCode=Integer.valueOf(lStrInitServiceApiResponseStatusCode)
			String lStrInitServiceApiResponseTime=lMapPricingApiInitServiceCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.InitServiceResponseTime=lStrInitServiceApiResponseTime
			String lStrInitServiceApiResponse=lMapPricingApiInitServiceCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.InitServiceResponseText=lStrInitServiceApiResponse
			Map lMapVerifyResponseInitServiceApiResult=this.verifyResponseInitServiceApi(lStrInitServiceApiResponse,lNumInitServiceApiResponseStatusCode,mapPricingApiInputOutput)
			lIsOK=lMapVerifyResponseInitServiceApiResult.Result
			lreturn=lIsOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPricingApiCallMultiPlanPrice(String strPricingApiMultiPlanPriceInputRequestBodyContent,String strPricingApiJsonRootMultiCover,String strPricingApiJsonRootAdditionalCoverage,Boolean isPositiveCase,Map mapPricingApiInputOutput,Map mapPricingApiSourceFileInformation){
		Boolean lreturn=false
		Boolean lResult=false
		String lStrPricingApiMultiPlanPriceResponse=''
		String lStrPricingApiMultiPlanPriceResponseVerifyDetail=''
		Boolean lIsPositiveCase=isPositiveCase
		String lStrPricingApiMultiPlanPriceInputRequestBodyContent=strPricingApiMultiPlanPriceInputRequestBodyContent.trim()
		if(lStrPricingApiMultiPlanPriceInputRequestBodyContent.length()<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootMultiCover)){
			return lreturn
		}
		String lStrPricingApiJsonRootMultiCover=strPricingApiJsonRootMultiCover
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootMultiCover)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiJsonRootAdditionalCoverage)){
			return lreturn
		}
		String lStrPricingApiJsonRootAdditionalCoverage=strPricingApiJsonRootAdditionalCoverage
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiJsonRootAdditionalCoverage)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiSourceFileInformation)){
			return lreturn
		}
		Map lMapPricingApiSourceFileInformation=mapPricingApiSourceFileInformation
		try{
			Boolean lIsOK=false
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredProductType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredProductType
			String lStrPricingApiMultiPlanPriceInputRequestUrl=mapPricingApiInputOutput.InitServiceDataMultiplePlanPriceUrl
			String lStrRegisterUuid=mapPricingApiInputOutput.RegisterUuid
			String lStrRegisterClientSessionKey=mapPricingApiInputOutput.RegisterClientSessionKey
			Map lMapPricingApiMultiPlanCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiMultiPlanPriceCallRequest(lStrPricingApiMultiPlanPriceInputRequestBodyContent,lStrPricingApiMultiPlanPriceInputRequestUrl,lStrRegisterUuid,lStrRegisterClientSessionKey)
			String lStrPricingApiMultiPlanPriceResponseStatusCode=lMapPricingApiMultiPlanCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.MultiplePlanPriceResponseStatus=lStrPricingApiMultiPlanPriceResponseStatusCode
			Integer lStrPricingApiMultiPlanPriceResponseStatusCodeNum=Integer.valueOf(lStrPricingApiMultiPlanPriceResponseStatusCode)
			String lStrPricingApiMultiPlanPriceResponseTime=lMapPricingApiMultiPlanCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.MultiplePlanPriceResponseTime=lStrPricingApiMultiPlanPriceResponseTime
			lStrPricingApiMultiPlanPriceResponse=lMapPricingApiMultiPlanCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.MultiplePlanPriceResponseText=lStrPricingApiMultiPlanPriceResponse
			Map lMapPricingApiJsonCoverageAndCoverResult=this.getMapPricingApiJsonCoverageAndCover(lStrPricingApiJsonRootMultiCover,lStrPricingApiJsonRootAdditionalCoverage)
			if(!lMapPricingApiJsonCoverageAndCoverResult.Result){
				return lreturn
			}
			List<String> lListPricingApiCoverageAll=lMapPricingApiJsonCoverageAndCoverResult.ListPricingApiCoverageAll
			List<String> lListPricingApiCoverName=lMapPricingApiJsonCoverageAndCoverResult.ListPricingApiCoverName
			Map lMapVerifyResponsePricingApiMultiPlanPriceResult=this.verifyResponsePricingApiMultiPlanPriceApi(lStrPricingApiQuoteRequiredProductType,lStrPricingApiMultiPlanPriceResponse,lStrPricingApiMultiPlanPriceResponseStatusCodeNum,lIsPositiveCase,mapPricingApiInputOutput,lListPricingApiCoverName,lListPricingApiCoverageAll,lMapPricingApiSourceFileInformation)
			lResult=lMapVerifyResponsePricingApiMultiPlanPriceResult.Result
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map initPricingApiGetPlanPrice(String strProductType,String strPricingApiGetPlanPriceInputRequestBodyContent,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapPricingApiGetPlanPriceResult=[:]
		String lStrPricingApiGetPlanPriceUrl=''
		String lStrPricingApiGetPlanPriceDetail=''
		String lStrPricingApiGetPlanPriceResponse=''
		try{
			lreturn.put('PricingApiGetPlanPriceDetail',lStrPricingApiGetPlanPriceDetail)
			lreturn.put('PricingApiGetPlanPriceResponse',lStrPricingApiGetPlanPriceResponse)
			lreturn.put('PricingApiGetPlanPriceResult',lMapPricingApiGetPlanPriceResult)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strProductType)){
				return lreturn
			}
			String lStrPricingApiQuoteRequiredProductType=strProductType.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiQuoteRequiredProductType)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiGetPlanPriceInputRequestBodyContent)){
				return lreturn
			}
			String lStrPricingApiGetPlanPriceRequestBodyContent=strPricingApiGetPlanPriceInputRequestBodyContent.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceRequestBodyContent)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			Boolean lIsOK=false
			if(lStrPricingApiQuoteRequiredProductType=='Endorsement'||lStrPricingApiQuoteRequiredProductType=='Cancellation' ){
				lStrPricingApiGetPlanPriceUrl=mapPricingApiInputOutput.InitServiceDataEndorsementUrl
			}else{
				lStrPricingApiGetPlanPriceUrl=mapPricingApiInputOutput.InitServiceDataGetPlanPriceUrl
			}
			String lStrRegisterClientSessionKey=mapPricingApiInputOutput.RegisterClientSessionKey
			String lStrRegisterUuid=mapPricingApiInputOutput.RegisterUuid
			mapPricingApiInputOutput.GetPlanPriceRequestBody=lStrPricingApiGetPlanPriceRequestBodyContent
			Map lMapPricingApiGetPlanPriceCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiGetPlanPriceCallRequest(lStrPricingApiGetPlanPriceRequestBodyContent,lStrPricingApiGetPlanPriceUrl,lStrRegisterUuid,lStrRegisterClientSessionKey)
			String lStrPricingApiGetPlanPriceResponseStatusCode=lMapPricingApiGetPlanPriceCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.GetPlanPriceResponseStatus=lStrPricingApiGetPlanPriceResponseStatusCode
			Integer lStrPricingApiGetPlanPriceResponseStatusCodeNum=Integer.valueOf(lStrPricingApiGetPlanPriceResponseStatusCode)
			String lStrPricingApiGetPlanPriceResponseTime=lMapPricingApiGetPlanPriceCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.GetPlanPriceResponseTime=lStrPricingApiGetPlanPriceResponseTime
			lStrPricingApiGetPlanPriceResponse=lMapPricingApiGetPlanPriceCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.GetPlanPriceResponseText=lStrPricingApiGetPlanPriceResponse
			lMapPricingApiGetPlanPriceResult.putAll(lMapPricingApiGetPlanPriceCallRequestResult)
			List<String> lGetPlanPriceDetailStatusList=[]
			Map lMapVerifyResponsePricingApiGetPlanPriceResult=this.verifyResponseGetPlanApi(lStrPricingApiQuoteRequiredProductType,lStrPricingApiGetPlanPriceResponse,lStrPricingApiGetPlanPriceResponseStatusCodeNum,mapPricingApiInputOutput)
			lStrPricingApiGetPlanPriceDetail=lMapVerifyResponsePricingApiGetPlanPriceResult.VerifyPricingApiGetPlanPriceDetail
			lResult=lStrPricingApiGetPlanPriceDetail.length()>=0
			if(lResult){
				lreturn.put('PricingApiGetPlanPriceDetail',lStrPricingApiGetPlanPriceDetail)
				lreturn.put('PricingApiGetPlanPriceResponse',lStrPricingApiGetPlanPriceResponse)
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
	public Map initPricingApiGetPlanWithInstallmentPrice(String strProductType,String strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		Map lMapPricingApiGetPlanWithInstallmentPriceResult=[:]
		String lStrPricingApiGetPlanWithInstallmentPriceUrl=''
		String lStrPricingApiGetPlanWithInstallmentPriceDetail=''
		String lStrPricingApiGetPlanWithInstallmentPriceResponse=''
		try{
			lreturn.put('PricingApiGetPlanWithInstallmentPriceResponse',lStrPricingApiGetPlanWithInstallmentPriceResponse)
			lreturn.put('PricingApiGetPlanWithInstallmentPriceDetail',lStrPricingApiGetPlanWithInstallmentPriceDetail)
			lreturn.put('PricingApiGetPlanWithInstallmentPriceResult',lMapPricingApiGetPlanWithInstallmentPriceResult)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strProductType)){
				return lreturn
			}
			String lStrPricingApiQuoteRequiredProductType=strProductType.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiQuoteRequiredProductType)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent)){
				return lreturn
			}
			String lStrPricingApiGetPlanWithInstallmentPriceRequestBodyContent=strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceRequestBodyContent)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			Boolean lIsGetPlanWithInstallmentPriceOK=false
			String lStrRegisterClientSessionKey=mapPricingApiInputOutput.RegisterClientSessionKey
			String lStrRegisterUuid=mapPricingApiInputOutput.RegisterUuid
			if(lStrPricingApiQuoteRequiredProductType=='Endorsement'||lStrPricingApiQuoteRequiredProductType=='Cancellation' ){
				lStrPricingApiGetPlanWithInstallmentPriceUrl=mapPricingApiInputOutput.InitServiceDataEndorsementInstUrl
			}else{
				lStrPricingApiGetPlanWithInstallmentPriceUrl=mapPricingApiInputOutput.InitServiceDataGetPlanPriceInstUrl
			}
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceRequestBody=lStrPricingApiGetPlanWithInstallmentPriceRequestBodyContent
			Map lMapPricingApiGetPlanWithInstallmentCallRequestResult=IDNPricingApiRestAPIHelper.inputPricingApiGetPlanWithInstallmentPriceCallRequest(lStrPricingApiGetPlanWithInstallmentPriceRequestBodyContent,lStrPricingApiGetPlanWithInstallmentPriceUrl,lStrRegisterUuid,lStrRegisterClientSessionKey)
			String lStrPricingApiGetPlanWithInstallmentPriceResponseStatusCode=lMapPricingApiGetPlanWithInstallmentCallRequestResult.ResponseObjectStatusCode
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseStatus=lStrPricingApiGetPlanWithInstallmentPriceResponseStatusCode
			Integer lNumPricingApiGetPlanWithInstallmentPriceResponseStatusCode=Integer.valueOf(lStrPricingApiGetPlanWithInstallmentPriceResponseStatusCode)
			String lStrPricingApiGetPlanWithInstallmentPriceResponseTime=lMapPricingApiGetPlanWithInstallmentCallRequestResult.ResponseObjectElapsedTimeText
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseTime=lStrPricingApiGetPlanWithInstallmentPriceResponseTime
			lStrPricingApiGetPlanWithInstallmentPriceResponse=lMapPricingApiGetPlanWithInstallmentCallRequestResult.ResponseObjectResponseText
			mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText=lStrPricingApiGetPlanWithInstallmentPriceResponse
			lMapPricingApiGetPlanWithInstallmentPriceResult.putAll(lMapPricingApiGetPlanWithInstallmentCallRequestResult)
			Map lMapVerifyResponsePricingApiGetPlanWithInstallmentPriceResult=this.verifyResponseGetPlanWithInstallmentApi(lStrPricingApiQuoteRequiredProductType,lStrPricingApiGetPlanWithInstallmentPriceResponse,lNumPricingApiGetPlanWithInstallmentPriceResponseStatusCode,mapPricingApiInputOutput)
			lStrPricingApiGetPlanWithInstallmentPriceDetail=lMapVerifyResponsePricingApiGetPlanWithInstallmentPriceResult.VerifyPricingApiGetPlanPriceWithInstallmentDetail
			lResult=lStrPricingApiGetPlanWithInstallmentPriceDetail.length()>=0
			if(lResult){
				lreturn.put('PricingApiGetPlanWithInstallmentPriceResponse',lStrPricingApiGetPlanWithInstallmentPriceResponse)
				lreturn.put('PricingApiGetPlanWithInstallmentPriceDetail',lStrPricingApiGetPlanWithInstallmentPriceDetail)
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
			targetMap.put('RegisterClientInitServiceUrl','')
			targetMap.put('InitServiceDataCreatePolicyUrl','')
			targetMap.put('InitServiceDataGetPlanPriceInstUrl','')
			targetMap.put('InitServiceDataEndorsementUrl','')
			targetMap.put('InitServiceDataGetPlanPriceUrl','')
			targetMap.put('InitServiceDataMultiplePlanPriceUrl','')
			targetMap.put('InitServiceDataGetDependencyCodeMappingUrl','')
			targetMap.put('InitServiceDataEndorsementInstUrl','')
			targetMap.put('RegisterClientServiceLibraryRoot','')
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
		String lStrVerifyRegisterClientApiDetail=''
		Boolean lIsVerifyRegisterClientApiResultOK=true
		Boolean lIsObjectOK=true
		try{
			lreturn.put("Result",lIsVerifyRegisterClientApiResultOK)
			lreturn.put("VerifyRegisterClientApiDetail",lStrVerifyRegisterClientApiDetail)
			if(strResponseText.length()<=0){
				return lreturn
			}
			String lStrText=''
			String lStrEmptyValue='EmptyValue'
			String lStrNullValue='NULL'
			Map lMapJson=new JsonSlurper().parseText(strResponseText)
			Boolean lIsObjectReady=lMapJson.containsKey('UUID')
			if(StatusCode==200){
				if(lIsObjectReady){
					//Integer lIntegerRegisterClientApiUuid=lMapJson.UUID
					String lRegisterClientApiUuid=lMapJson.UUID
					Boolean lIsRegisterClientApiUuidEmpty=IGNUemaHelper.checkObjectEmptyOfString(lRegisterClientApiUuid)
					if(lIsRegisterClientApiUuidEmpty){
						lIsObjectOK=false
						lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'Uuid='+lStrEmptyValue)
						lStrVerifyRegisterClientApiDetail=lStrText
					}
					mapPricingApiInputOutput.RegisterUuid=lRegisterClientApiUuid
					String lStrVerifyRegisterClientApiServiceDataDetailText=''
					Boolean lIsServiceDataKeyExist=lMapJson.containsKey('ServiceData')
					if(!lIsServiceDataKeyExist){
						lIsObjectOK=false
						lStrVerifyRegisterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiServiceDataDetailText,'ServiceData='+lStrNullValue)
					}
					Boolean lIsInitServiceKeyExist=lMapJson.containsKey('initServiceUrl')
					if(!lIsInitServiceKeyExist){
						lIsObjectOK=false
						lStrVerifyRegisterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiServiceDataDetailText,'InitServiceUrl='+lStrNullValue)
					}else{
						String  lStrRegisterClientApiInitServiceUrl=lMapJson.initServiceUrl
						if(IGNUemaHelper.checkObjectNullOfObject(lStrRegisterClientApiInitServiceUrl)){
							lIsObjectOK=false
							lStrVerifyRegisterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiServiceDataDetailText,'InitServiceUrl='+lStrNullValue)
						}else if(IGNUemaHelper.checkObjectEmptyOfString(lStrRegisterClientApiInitServiceUrl)){
							lIsObjectOK=false
							lStrVerifyRegisterClientApiServiceDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiServiceDataDetailText,'InitServiceUrl='+lStrEmptyValue)
						}else{
							mapPricingApiInputOutput.RegisterClientInitServiceUrl=lStrRegisterClientApiInitServiceUrl
						}
					}
					String lStrVerifyRegisterClientApiLibraryDataDetailText=''
					Boolean lIsLibraryKeyExist=lMapJson.containsKey('Libraries')
					if(!lIsLibraryKeyExist){
						lIsObjectOK=false
						lStrVerifyRegisterClientApiLibraryDataDetailText=lStrVerifyRegisterClientApiLibraryDataDetailText+IGNUemaHelper.concatMessageLeftRightByPipe("Libraries",lStrEmptyValue)
					}else{
						List lListRegisterClientApiLibrary=lMapJson.Libraries
						Boolean lIsRegisterClientApiLibraryListOK=IGNUemaHelper.checkObjectEmptyOfList(lListRegisterClientApiLibrary)
						if(lIsRegisterClientApiLibraryListOK){
							lIsObjectOK=false
							lStrVerifyRegisterClientApiLibraryDataDetailText=lStrVerifyRegisterClientApiLibraryDataDetailText+IGNUemaHelper.concatMessageLeftRightByPipe("Libraries",lStrEmptyValue)
						}else{
							String lStrRegisterClientApiLibrary=lListRegisterClientApiLibrary.toString()
							mapPricingApiInputOutput.RegisterClientServiceLibraryRoot=lStrRegisterClientApiLibrary
							List<String> lListRegisterClientLibrayName=[]
							List<String> lListRegisterClientLibrayVersion=[]
							if(lListRegisterClientApiLibrary.size()>0){
								for(Integer lIndex=0;lIndex<=lListRegisterClientApiLibrary.size()-1;lIndex++){
									String lLibName=lListRegisterClientApiLibrary.get(lIndex).LibName
									Boolean lIsLibNameNull=IGNUemaHelper.checkObjectNullOfObject(lLibName)
									if(!lIsLibNameNull){
										Boolean lIsLibNameEmpty=IGNUemaHelper.checkObjectEmptyOfString(lLibName)
										if(lIsLibNameEmpty){
											lIsObjectOK=false
											lStrVerifyRegisterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiLibraryDataDetailText,'LibName='+lStrEmptyValue)
										}else{
											lListRegisterClientLibrayName.add(lLibName)
										}
									}else{
										lIsObjectOK=false
										lStrVerifyRegisterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiLibraryDataDetailText,'LibName='+lStrNullValue)
									}
									String lStrLibVersion=lListRegisterClientApiLibrary.get(lIndex).LibVersion
									Boolean lIsLibVersionNull=IGNUemaHelper.checkObjectNullOfObject(lStrLibVersion)
									if(!lIsLibVersionNull){
										Boolean lIsLibVersionEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrLibVersion)
										if(lIsLibVersionEmpty){
											lIsObjectOK=false
											lStrVerifyRegisterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiLibraryDataDetailText,'LibVersion='+lStrEmptyValue)
										}else{
											lListRegisterClientLibrayVersion.add(lStrLibVersion)
										}
									}else{
										lIsObjectOK=false
										lStrVerifyRegisterClientApiLibraryDataDetailText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiLibraryDataDetailText,'LibVersion='+lStrNullValue)
									}
								}
							}
						}
					}
					if(lStrVerifyRegisterClientApiLibraryDataDetailText.length()>0){
						lStrText=lStrText+IGNUemaHelper.concatMessageLeftRightByPipe('Libraries',lStrVerifyRegisterClientApiLibraryDataDetailText)
						lStrVerifyRegisterClientApiDetail=lStrText
					}
				}else{
					lIsObjectOK=false
					String lJsonString=lMapJson.toString()
					lStrText=IGNUemaHelper.concatMessageLeftRightByPipe("UUID",lStrNullValue)
					lStrVerifyRegisterClientApiDetail=lStrText
				}
			}else{
				lIsObjectOK=false
				lStrVerifyRegisterClientApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				String lStrVerifyRegisterClientApiDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyRegisterClientApiDetail,StatusCode)
				lStrVerifyRegisterClientApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyRegisterClientApiDetail,lStrVerifyRegisterClientApiDetailResultMessage)
			}
			if(lStrVerifyRegisterClientApiDetail.length()>0){
				lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('RegisterClient',lStrVerifyRegisterClientApiDetail)
				lStrVerifyRegisterClientApiDetail=lStrText
			}
			if(lIsObjectOK){
				mapPricingApiInputOutput.RegisterClientApiResult='Passed'
				mapPricingApiInputOutput.RegisterClientApiDetail=''
			}else{
				mapPricingApiInputOutput.RegisterClientApiResult='Failed'
				mapPricingApiInputOutput.RegisterClientApiDetail=lStrVerifyRegisterClientApiDetail.trim()
			}
			lResult=lStrVerifyRegisterClientApiDetail.length()>=0
			lIsVerifyRegisterClientApiResultOK=lIsObjectOK
			if(lResult){
				lreturn.put("Result",lIsVerifyRegisterClientApiResultOK)
				lreturn.put("VerifyRegisterClientApiDetail",lStrVerifyRegisterClientApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map getMapInitServiceStructureValidation(Map mapInitServiceTargetPolicyConfiguration,String strInitServicePolicyConfigurationName){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrVerifyInitServiceApiDetail=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrVerifyInitServiceApiDetail',lStrVerifyInitServiceApiDetail)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapInitServiceTargetPolicyConfiguration)){
				return lreturn
			}
			Map lMapInitServiceTargetPolicyConfiguration=mapInitServiceTargetPolicyConfiguration
			if(IGNUemaHelper.checkObjectNullOfObject(strInitServicePolicyConfigurationName)){
				return lreturn
			}
			String lStrInitServicePolicyConfigurationName=strInitServicePolicyConfigurationName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrInitServicePolicyConfigurationName)){
				return lreturn
			}
			String lStrEmptyValue='EmptyValue'
			String lStrNullValue='NULL'
			Boolean lIsObjectOK=true
			String lStrInitServiceApiTargetPolicyConfigurationUrl=lMapInitServiceTargetPolicyConfiguration.url
			Boolean lIsInitServiceApiTargetPolicyConfigurationContainUrl=IGNUemaHelper.checkObjectNullOfObject(lStrInitServiceApiTargetPolicyConfigurationUrl)
			if(!lIsInitServiceApiTargetPolicyConfigurationContainUrl){
				String lInitServiceApiTargetPolicyConfigurationUrlValue=lMapInitServiceTargetPolicyConfiguration.url
				Boolean lIsInitServiceApiUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lInitServiceApiTargetPolicyConfigurationUrlValue)
				if(lIsInitServiceApiUrlValueEmpty){
					lIsObjectOK=false
					lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lStrInitServicePolicyConfigurationName+' '+'Url'+'='+lStrEmptyValue)
				}
			}else{
				lIsObjectOK=false
				lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lStrInitServicePolicyConfigurationName+' '+'Url='+lStrNullValue)
			}
			String  lInitServiceApiTargetPolicyConfigurationContainFlagConcurrent=lMapInitServiceTargetPolicyConfiguration.flagConcurrent
			Boolean lIsInitServiceApiTargetPolicyConfigurationContainFlagConcurrent=IGNUemaHelper.checkObjectNullOfObject(lInitServiceApiTargetPolicyConfigurationContainFlagConcurrent)
			if(!lIsInitServiceApiTargetPolicyConfigurationContainFlagConcurrent){
				String lInitServiceApiFlagConcurrentValue=lMapInitServiceTargetPolicyConfiguration.flagConcurrent
				Boolean lIsInitServiceApiFlagConcurrentValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lInitServiceApiFlagConcurrentValue)
				if(lIsInitServiceApiFlagConcurrentValueEmpty){
					lIsObjectOK=false
					lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lStrInitServicePolicyConfigurationName+' '+'FlagConcurrent='+lStrEmptyValue)
				}
			}else{
				lIsObjectOK=false
				lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lStrInitServicePolicyConfigurationName+' '+'FlagConcurrent='+lStrNullValue)
			}
			String  lInitServiceApiTargetPolicyConfigurationContainInterceptorServiceUrl=lMapInitServiceTargetPolicyConfiguration.interceptorServiceUrl
			Boolean lIsInitServiceApiTargetPolicyConfigurationContainInterceptorServiceUrl=IGNUemaHelper.checkObjectNullOfObject(lInitServiceApiTargetPolicyConfigurationContainInterceptorServiceUrl)
			if(!lIsInitServiceApiTargetPolicyConfigurationContainInterceptorServiceUrl){
				String lInitServiceApiInterceptorServiceUrlValue=lMapInitServiceTargetPolicyConfiguration.interceptorServiceUrl
				Boolean lIsInitServiceApiInterceptorServiceUrlValueEmpty=IGNUemaHelper.checkObjectEmptyOfString(lInitServiceApiInterceptorServiceUrlValue)
				if(lIsInitServiceApiInterceptorServiceUrlValueEmpty)
					lIsObjectOK=false
				lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lStrInitServicePolicyConfigurationName+' '+'InterceptorServiceUrl='+lStrEmptyValue)
			}
			lResult=lIsObjectOK
			lreturn.put('Result',lResult)
			lreturn.put('StrVerifyInitServiceApiDetail',lStrVerifyInitServiceApiDetail)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseInitServiceApi(String strResponseText,Integer StatusCode,Map mapPricingApiInputOutput){
		Boolean lResult=false
		Map lreturn=[:]
		String lStrVerifyInitServiceApiDetail=''
		Boolean lVerifyInitServiceApiResult=true
		Boolean lIsObjectOK=true
		try{
			lreturn.put("Result",lResult)
			if(strResponseText.length()<=0){
				return lreturn
			}
			String lStrText=''
			String lStrEmptyValue='EmptyValue'
			String lStrNullValue='NULL'
			Map lMapInitServiceApi=new JsonSlurper().parseText(strResponseText)
			if(StatusCode==200){
				String lStrInitServiceStructureValidationDetail=''
				for(Map.Entry lEntry in lMapInitServiceApi){
					String lStrInitServiceTargetPolicyConfigurationName=lEntry.getKey()
					Map lMapInitServiceTargetPolicyConfiguration=lEntry.getValue()
					Map lMapInitServiceStructureValidationResult=this.getMapInitServiceStructureValidation(lMapInitServiceTargetPolicyConfiguration, lStrInitServiceTargetPolicyConfigurationName)
					if(!lMapInitServiceStructureValidationResult.Result){
						lIsObjectOK=false
						lStrInitServiceStructureValidationDetail=lMapInitServiceStructureValidationResult.StrVerifyInitServiceApiDetail
						lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lStrInitServiceStructureValidationDetail)
					}else{
						if(lStrInitServiceTargetPolicyConfigurationName=='MultiplePlanPrice'){
							String lStrInitServiceMultiplePlanPriceUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataMultiplePlanPriceUrl=lStrInitServiceMultiplePlanPriceUrl
						}
						if(lStrInitServiceTargetPolicyConfigurationName=='GetPlanPrice'){
							String lStrInitServiceGetPlanPriceUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataGetPlanPriceUrl=lStrInitServiceGetPlanPriceUrl
						}
						if(lStrInitServiceTargetPolicyConfigurationName=='GetPlanPriceInst'){
							String lStrInitServiceGetPlanPriceInstUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataGetPlanPriceInstUrl=lStrInitServiceGetPlanPriceInstUrl
						}
						if(lStrInitServiceTargetPolicyConfigurationName=='EndorsementPlanPrice'){
							String lStrInitServiceEndorsementPlanPriceUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataEndorsementUrl=lStrInitServiceEndorsementPlanPriceUrl
						}
						if(lStrInitServiceTargetPolicyConfigurationName=='EndorsementInst'){
							String lStrInitServiceEndorsementInstUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataEndorsementInstUrl=lStrInitServiceEndorsementInstUrl
						}
						if(lStrInitServiceTargetPolicyConfigurationName=='EndorsementInst'){
							String lStrInitServiceEndorsementInstUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataEndorsementInstUrl=lStrInitServiceEndorsementInstUrl
						}
						if(lStrInitServiceTargetPolicyConfigurationName=='CreatePolicy'){
							String lStrInitServiceCreatePolicyUrl=lMapInitServiceTargetPolicyConfiguration.url
							mapPricingApiInputOutput.InitServiceDataCreatePolicyUrl=lStrInitServiceCreatePolicyUrl
						}
					}
				}
			}else{
				lIsObjectOK=false
				lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				String lVerifyInitServiceApiDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyInitServiceApiDetail,StatusCode)
				lStrVerifyInitServiceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyInitServiceApiDetail,lVerifyInitServiceApiDetailResultMessage)
			}
			if(lStrVerifyInitServiceApiDetail.length()>0){
				lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('InitService',lStrVerifyInitServiceApiDetail)
				lStrVerifyInitServiceApiDetail=lStrText
			}
			if(lIsObjectOK){
				mapPricingApiInputOutput.InitServiceApiResult='Passed'
				mapPricingApiInputOutput.InitServiceApiDetail=''
			}else{
				mapPricingApiInputOutput.InitServiceApiResult='Failed'
				mapPricingApiInputOutput.InitServiceApiDetail=lStrVerifyInitServiceApiDetail.trim()
			}
			lResult=lStrVerifyInitServiceApiDetail.length()>=0
			lVerifyInitServiceApiResult=lIsObjectOK
			if(lResult){
				lreturn.put("Result",lVerifyInitServiceApiResult)
				lreturn.put("VerifyInitServiceApiDetail",lStrVerifyInitServiceApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponsePricingApiMultiPlanPriceApi(String strProductType,String strResponseText,Integer statusCode,Boolean  isPositiveCase,Map mapPricingApiInputOutput,List strCoverList,List strCoverageList,Map mapPricingApiSourceFileInformation){
		Boolean lResult=false
		Map lreturn=[:]
		Boolean lIsVerifyPricingApiMultiPlanPriceApiResultOK=true
		String lStrVerifyPricingApiMultiPlanPriceApiDetail=''
		String lStrProductType=strProductType.trim()
		Integer lNumStatusCode=statusCode
		try{
			lreturn.put("Result",lResult)
			lreturn.put('StrPricingApiMultiPlanPriceApiDetail',lStrVerifyPricingApiMultiPlanPriceApiDetail)
			if(strResponseText.length()<=0){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverageList)){
				return lreturn
			}
			String lStrText=''
			Boolean lIsObjectOK=true
			Boolean lIsOK=true
			List<String> lListCover=strCoverList
			List<String> lListCoverage=strCoverageList
			if(lNumStatusCode==200){
				Map lMapJson=new JsonSlurper().parseText(strResponseText)
				String lStrEmptyValue='Empty'
				String lStrNullValue='Null'
				List<String> lListEmpty=[]
				Boolean lIsObjectReady=lMapJson.containsKey('root')
				if(lIsObjectReady){
					Map lMapPricingApiMultiPlanPriceQuoteData=lMapJson.root.Quote
					Boolean lIsPricingApiMultiPlanPriceApiQuoteDataListEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiMultiPlanPriceQuoteData)
					if(!lIsPricingApiMultiPlanPriceApiQuoteDataListEmpty){
						String lStrPricingApiMultiPlanPriceQuoteData=lMapPricingApiMultiPlanPriceQuoteData.toString()
						mapPricingApiInputOutput.MultiplePlanQuoteRoot=lStrPricingApiMultiPlanPriceQuoteData
						Object lObjectPricingApiMultiPlanPriceLoadingFactor=lMapJson.root.Quote.Loading_Factors
						String lStrPricingApiPricingApiMultiPlanPriceApiLoadingFactor=lObjectPricingApiMultiPlanPriceLoadingFactor.toString()
						mapPricingApiInputOutput.MultiplePlanPriceQuoteLoadingFactorRoot=lStrPricingApiPricingApiMultiPlanPriceApiLoadingFactor
						Boolean lIsPricingApiMultiPlanPriceLoadingFactorListNull=IGNUemaHelper.checkObjectNullOfObject(lObjectPricingApiMultiPlanPriceLoadingFactor)
						if(lIsPricingApiMultiPlanPriceLoadingFactorListNull){
							lIsObjectOK=false
							lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"LoadingFactor="+lStrNullValue)
						}
						if(IGNUemaHelper.checkStringContainString(lStrProductType,'Motor')){
							Map lMapPricingApiMultiPlanPriceApiVehicleData=lMapJson.root.Quote.Vehicle_Data
							Boolean lIsPricingApiMultiPlanPriceApiVehicleDataListNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiMultiPlanPriceApiVehicleData)
							if(lIsPricingApiMultiPlanPriceApiVehicleDataListNull){
								lIsObjectOK=false
								lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"VehicleDataList="+lStrNullValue)
							}else{
								Boolean lIsPricingApiMultiPlanPriceApiVehicleDataListEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiMultiPlanPriceApiVehicleData)
								if(lIsPricingApiMultiPlanPriceApiVehicleDataListEmpty){
									lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"VehicleDataList="+lStrEmptyValue)
								}else{
									lStrText=''
									String lStrPricingApiMultiPlanPriceApiVehicleData=lMapPricingApiMultiPlanPriceApiVehicleData.toString()
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataRoot=lStrPricingApiMultiPlanPriceApiVehicleData
									String lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleType=lMapPricingApiMultiPlanPriceApiVehicleData.UW_Vehicle_Type
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataUwVehicleType=lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleType
									Boolean lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleType)
									if(lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"UwVehicleTypeItem"+':'+lStrNullValue)
									}else{
										Boolean lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleType)
										if(lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeEmpty){
											lIsObjectOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"UwVehicleTypeItem"+'='+lStrEmptyValue)
										}
									}
									String lStrPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileage=lMapPricingApiMultiPlanPriceApiVehicleData.Policy_Estimated_Annual_Mileage
									if(lStrPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileage=='[]'){
										lStrPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileage=''
									}
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataPolicyEstimatedAnnualMileage=lStrPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileage
									Boolean lIsPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileageNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileage)
									if(lIsPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileageNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PolicyEstimatedAnnualMileageItem"+'='+lStrNullValue)
									}else{
										Boolean lIsPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileage)
										if(lIsPricingApiMultiPlanPriceApiVehicleDataPolicyEstimatedAnnualMileageEmpty){
											lIsObjectOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PolicyEstimatedAnnualMileageItem"+'='+lStrEmptyValue)
										}
									}
									String lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlag=lMapPricingApiMultiPlanPriceApiVehicleData.UW_Vehicle_Type_Warning_Flag
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataUwVehicleTypeWarningFlag=lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlag
									Boolean lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlagNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlag)
									if(lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlagNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"UwVehicleTypeWarningFlagItem"+'='+lStrNullValue)
									}else{
										Boolean lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlagEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlag)
										if(lIsPricingApiMultiPlanPriceApiVehicleDataUwVehicleTypeWarningFlagEmpty){
											lIsObjectOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"UwVehicleTypeWarningFlagItem"+'='+lStrEmptyValue)
										}
									}
									String lStrPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinal=lMapPricingApiMultiPlanPriceApiVehicleData.Car_Default_Value_Final
									mapPricingApiInputOutput.MultiplePlanPriceQuoteVehicleDataCarDefaultValueFinal=lStrPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinal
									Boolean lIsPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinalNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinal)
									if(lIsPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinalNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"CarDefaultValueFinalItem"+'='+lStrNullValue)
									}else{
										Boolean lIsPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinalEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinal)
										if(lIsPricingApiMultiPlanPriceApiVehicleDataCarDefaultValueFinalEmpty){
											lIsObjectOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"CarDefaultValueFinalItem"+'='+lStrEmptyValue)
										}
									}
									if(lStrText.length()>1){
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleData',lStrText)
										lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,lStrText)
									}
								}
							}
						}
						Map lMapPricingApiMultiPlanPriceApiCoverageData=lMapJson.root.Quote.Coverages
						Boolean lIsMapPricingApiMultiPlanPriceApiCoverageData=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiMultiPlanPriceApiCoverageData)
						if(lIsMapPricingApiMultiPlanPriceApiCoverageData){
							lIsObjectOK=false
							lIsOK=false
							lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Coverage="+lStrNullValue)
						}else{
							Boolean lIsPricingApiMultiPlanPriceApiCoverageDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiMultiPlanPriceApiCoverageData)
							if(lIsPricingApiMultiPlanPriceApiCoverageDataEmpty){
								lIsObjectOK=false
								lIsOK=false
								lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Coverage="+lStrEmptyValue)
								Map lMapPricingApiMultiPlanPriceApiIrregularityData=lMapJson.root.Quote.irregularities
								Boolean lIsMapPricingApiMultiPlanPriceApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiMultiPlanPriceApiIrregularityData)
								if(lIsMapPricingApiMultiPlanPriceApiIrregularityDataNull){
									lIsObjectOK=false
									lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Irregularity="+lStrNullValue)
								}else{
									lIsObjectOK=false
									lStrText=''
									String lStrPricingApiMultiPlanPriceApiIrregularityDataErrorMessage=lMapPricingApiMultiPlanPriceApiIrregularityData.ErrorMessages
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'ErrorMessage='+lStrPricingApiMultiPlanPriceApiIrregularityDataErrorMessage)
									String lStrPricingApiMultiPlanPriceApiIrregularityDataMaximumAuthorizationLevel=lMapPricingApiMultiPlanPriceApiIrregularityData.MaxAuthorisationLevel
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'MaxAuthorisationLevel='+lStrEmptyValue)
									if(lStrText.length()>1){
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lStrText)
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('ErrorMessageValidation',lStrText)
										lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,lStrText)
									}
								}
							}else{
								for(Integer lIndex=0;lIndex<=lListCover.size()-1;lIndex++){
									String lStrCoverName=lListCover.get(lIndex)
									Map lMapCoverData=lMapPricingApiMultiPlanPriceApiCoverageData.get(lStrCoverName)
									if(IGNUemaHelper.checkObjectNullOfObject(lMapCoverData)){
										lIsObjectOK=false
										lIsOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"Cover="+lStrCoverName+' '+'Found'+lStrNullValue)
										lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,lStrText)
									}
									List lAdditionalListCoverage=lListCoverage.get(lIndex)
									for(Integer lListIndex=0;lListIndex<=lAdditionalListCoverage.size()-1;lListIndex++){
										String lStrAdditionalCoverageName=lAdditionalListCoverage.get(lListIndex)
										Map lMapCoverageData=lMapPricingApiMultiPlanPriceApiCoverageData.get(lStrAdditionalCoverageName)
										if(IGNUemaHelper.checkObjectNullOfObject(lMapCoverageData)){
											lIsObjectOK=false
											lIsOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"Coverage="+lStrAdditionalCoverageName+' '+'Found'+lStrNullValue)
											lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,lStrText)
										}
									}
								}
								Map lMapPricingApiMultiPlanPriceApiIrregularityData=lMapJson.root.Quote.irregularities
								String lStrPricingApiMultiPlanPriceApiIrregularityData=lMapPricingApiMultiPlanPriceApiIrregularityData.toString()
								mapPricingApiInputOutput.MultiplePlanPriceQuoteIrregularityRoot=lStrPricingApiMultiPlanPriceApiIrregularityData
								Boolean lIsMapPricingApiMultiPlanPriceApiIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiMultiPlanPriceApiIrregularityData)
								if(lIsMapPricingApiMultiPlanPriceApiIrregularityDataNull){
									lIsObjectOK=false
									lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Irregularity="+lStrNullValue)
								}else{
									Boolean lIsMapPricingApiMultiPlanPriceApiIrregularityDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiMultiPlanPriceApiCoverageData)
									if(lIsMapPricingApiMultiPlanPriceApiIrregularityDataEmpty){
										lIsObjectOK=false
										lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Irregularity="+lStrEmptyValue)
									}else{
										lStrText=''
										//If Its a Negative case then the Error Message will be read from the response
										String lStrPricingApiMultiPlanPriceApiIrregularityDataErrorMessage=lMapPricingApiMultiPlanPriceApiIrregularityData.errorMessages
										mapPricingApiInputOutput.MultiplePlanPriceQuoteIrregularityErrorMessage=lStrPricingApiMultiPlanPriceApiIrregularityDataErrorMessage
										Boolean lIsPricingApiMultiPlanPriceApiIrregularityDataErrorMessageNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiIrregularityDataErrorMessage)
										if(lIsPricingApiMultiPlanPriceApiIrregularityDataErrorMessageNull){
											lIsObjectOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"ErrorMessages="+lStrNullValue)
										}else{
											Boolean lIsPricingApiMultiPlanPriceApiIrregularityDataErrorMessageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiIrregularityDataErrorMessage)
											if(lIsPricingApiMultiPlanPriceApiIrregularityDataErrorMessageEmpty){
												lIsObjectOK=false
												lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"ErrorMessages="+lStrEmptyValue)
											}else{
												//Write to output
											}
										}
										String lStrPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevel=lMapPricingApiMultiPlanPriceApiIrregularityData.maxAuthLevel
										mapPricingApiInputOutput.MultiplePlanPriceQuoteIrregularityMaxAuthorisarionLevel=lStrPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevel
										Boolean lIsPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevelNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevel)
										if(lIsPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevelNull){
											lIsObjectOK=false
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"MaxAuthorisationLevel="+lStrNullValue)
										}else{
											Boolean lIsPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevelEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevel)
											if(lIsPricingApiMultiPlanPriceApiIrregularityDataMaxAuthorisationLevelEmpty){
												lIsObjectOK=false
												lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"MaxAuthorisationLevel="+lStrEmptyValue)
											}else{
												//Write to output
											}
										}
										if(lStrText.length()>1){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lStrText)
											lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,lStrText)
										}
									}
								}
							}
						}
						String lStrPricingApiMultiPlanPriceApiMasterSetId=lMapJson.root.Quote.mastersetId
						mapPricingApiInputOutput.MultiplePlanPriceQuoteMasterSetId=lStrPricingApiMultiPlanPriceApiMasterSetId
						Boolean lIsPricingApiMultiPlanPriceApiMasterSetIdNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiMasterSetId)
						if(lIsPricingApiMultiPlanPriceApiMasterSetIdNull){
							lIsObjectOK=false
							lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"MasterSetId"+lStrNullValue)
						}else{
							Boolean lIsPricingApiMultiPlanPriceApiMasterSetIdEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiMasterSetId)
							if(lIsPricingApiMultiPlanPriceApiMasterSetIdEmpty){
								lIsObjectOK=false
								lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"MasterSetId="+lStrEmptyValue)
							}
						}
						String lStrPricingApiMultiPlanPriceApiPricingModelVersion=lMapJson.root.Quote.Pricing_Model_Version
						mapPricingApiInputOutput.MultiplePlanPriceQuotePricingModelVersion=lStrPricingApiMultiPlanPriceApiPricingModelVersion
						Boolean lIsPricingApiMultiPlanPriceApiPricingModelVersionNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiPricingModelVersion)
						if(lIsPricingApiMultiPlanPriceApiPricingModelVersionNull){
							lIsObjectOK=false
							lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"PricingModelVersion="+lStrEmptyValue)
						}else{
							Boolean lIsPricingApiMultiPlanPriceApiPricingModelVersionEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiPricingModelVersion)
							if(lIsPricingApiMultiPlanPriceApiPricingModelVersionEmpty){
								lIsObjectOK=false
								lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"PricingModelVersion="+lStrEmptyValue)
							}
						}
						String lStrPricingApiMultiPlanPriceApiPolicyProductVersion=lMapJson.root.Quote.Policy_Product_Version
						mapPricingApiInputOutput.MultiplePlanPriceQuotePolicyProductVersion=lStrPricingApiMultiPlanPriceApiPolicyProductVersion
						Boolean lIsPricingApiMultiPlanPriceApiPolicyProductVersionNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiPolicyProductVersion)
						if(lIsPricingApiMultiPlanPriceApiPolicyProductVersionNull){
							lIsObjectOK=false
							lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"PolicyProductVersion="+lStrNullValue)
						}else{
							Boolean lIsPricingApiMultiPlanPriceApiPolicyProductVersionEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiPolicyProductVersion)
							if(lIsPricingApiMultiPlanPriceApiPolicyProductVersionEmpty){
								lIsObjectOK=false
								lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"PolicyProductVersion="+lStrEmptyValue)
							}
						}
						String lStrPricingApiMultiPlanPriceApiDefaultShowPaymentFrequency=lMapJson.root.Quote.Default_Show_Payment_Frequency
						mapPricingApiInputOutput.MultiplePlanPriceQuoteDefaultShowPaymentFrequency=lStrPricingApiMultiPlanPriceApiDefaultShowPaymentFrequency
						Boolean lIsPricingApiMultiPlanPriceApiDefaultShowPaymentFrequencyNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiMultiPlanPriceApiDefaultShowPaymentFrequency)
						if(lIsPricingApiMultiPlanPriceApiDefaultShowPaymentFrequencyNull){
							lIsObjectOK=false
							lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"DefaultShowPaymentFrequency="+lStrNullValue)
						}else{
							Boolean lIsPricingApiMultiPlanPriceApiDefaultShowPaymentFrequencyEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiMultiPlanPriceApiDefaultShowPaymentFrequency)
							if(lIsPricingApiMultiPlanPriceApiDefaultShowPaymentFrequencyEmpty){
								lIsObjectOK=false
								lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"DefaultShowPaymentFrequency="+lStrEmptyValue)
							}
						}
					}else{
						lIsObjectOK=false
						lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Quote="+lListEmpty)
					}
				}else{
					lIsObjectOK=false
					lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,"Root="+lListEmpty)
				}
				if(lStrVerifyPricingApiMultiPlanPriceApiDetail.length()>1){
					lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('ResponseValidationError',lStrVerifyPricingApiMultiPlanPriceApiDetail)
				}
				if(isPositiveCase){
					if(lIsObjectOK){
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Passed'
						mapPricingApiInputOutput.MultiplePlanPricingApiDetail=''
						String lStrPricingApiMultiPlanPriceApiDetailResultMessage=this.inputGenericResultMessageA(lStrVerifyPricingApiMultiPlanPriceApiDetail)
					}else{
						//lIsOK=false
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Failed'
						mapPricingApiInputOutput.MultiplePlanPricingApiResult=lStrVerifyPricingApiMultiPlanPriceApiDetail.trim()
						String lStrPricingApiMultiPlanPriceApiDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyPricingApiMultiPlanPriceApiDetail,statusCode)
					}
				}else{
					if(!lIsObjectOK){
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Passed'
						mapPricingApiInputOutput.MultiplePlanPricingApiDetail=''
						String lStrPricingApiMultiPlanPriceApiDetailResultMessage=this.inputGenericResultMessageA(lStrVerifyPricingApiMultiPlanPriceApiDetail)
					}else{
						//lIsOK=false
						mapPricingApiInputOutput.MultiplePlanPricingApiResult='Failed'
						mapPricingApiInputOutput.MultiplePlanPricingApiResult=lStrVerifyPricingApiMultiPlanPriceApiDetail.trim()
						String lStrPricingApiMultiPlanPriceApiDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyPricingApiMultiPlanPriceApiDetail,statusCode)
					}
				}
			}else{
				lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				lIsOK=false
				String lStrPricingApiMultiPlanPriceApiDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyPricingApiMultiPlanPriceApiDetail,statusCode)
				lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiMultiPlanPriceApiDetail,lStrPricingApiMultiPlanPriceApiDetailResultMessage)
				mapPricingApiInputOutput.MultiplePlanPricingApiResult='Failed'
				mapPricingApiInputOutput.MultiplePlanPricingApiResult=lStrVerifyPricingApiMultiPlanPriceApiDetail.trim()
			}
			if(lStrVerifyPricingApiMultiPlanPriceApiDetail.length()>1){
				lStrVerifyPricingApiMultiPlanPriceApiDetail=IGNUemaHelper.concatMessageLeftRightByPipe('MultiplePlanApi',lStrVerifyPricingApiMultiPlanPriceApiDetail)
				Boolean lIsWritePricingApiMultiPlanPriceTestResultOK=this.writePricingApiMultiPlanTestResult(lStrVerifyPricingApiMultiPlanPriceApiDetail,strResponseText,lNumStatusCode,isPositiveCase,mapPricingApiInputOutput,mapPricingApiSourceFileInformation)
			}
			lResult=lStrVerifyPricingApiMultiPlanPriceApiDetail.length()>=0
			lIsVerifyPricingApiMultiPlanPriceApiResultOK=lIsOK
			if(lResult){
				lreturn.put('Result',lIsVerifyPricingApiMultiPlanPriceApiResultOK)
				lreturn.put('StrPricingApiMultiPlanPriceApiDetail',lStrVerifyPricingApiMultiPlanPriceApiDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean writePricingApiMultiPlanTestResult(String strVerifyPricingApiMultiPlanPriceApiDetail,String strResponseText,Integer statusCode,Boolean  isPositiveCase,Map mapPricingApiInputOutput,Map mapPricingApiSourceFileInformation){
		Boolean lreturn=false
		String lStrPricingApiMultiPlanPriceResponseText=strResponseText
		Integer lNumStatusCode=statusCode
		Map lMapPricingApiSourceFileInformation=mapPricingApiSourceFileInformation
		try{
			Workbook lWorkBookExcelFileGenericTestData=lMapPricingApiSourceFileInformation.WorkBookExcelFileGenericTestData
			String lStrExcelGenericFileName=lMapPricingApiSourceFileInformation.StrExcelGenericFileName
			String lStrExcelMacroFileName=lMapPricingApiSourceFileInformation.StrMacroGenericFileName
			Sheet lSheetPricingApi=lMapPricingApiSourceFileInformation.SheetPricingApi
			List<String> lListSelectedPricingApiTotalPremium=new ArrayList()
			String lStrPricingApiJsonRootTotalPremium=mapPricingApiInputOutput.StrPricingApiJsonRootTotalPremium
			String lStrPricingApiJsonRootMultiCover=mapPricingApiInputOutput.StrPricingApiJsonRootMultiCover
			Map lMapPricingApiJsonTotalPremium=new JsonSlurper().parseText(lStrPricingApiJsonRootTotalPremium)
			Map lMapPricingApiJsonMultiCover=new JsonSlurper().parseText(lStrPricingApiJsonRootMultiCover)
			List<String> lListCover=lMapPricingApiJsonMultiCover.CoverList
			List<String> lListPricingApiJsonRootTotalPremiumAll=lMapPricingApiJsonTotalPremium.Premium
			for(Integer lIndex=0;lIndex<=lListCover.size()-1;lIndex++){
				lListSelectedPricingApiTotalPremium=this.getListDecodedPricingApiGenericData(lListPricingApiJsonRootTotalPremiumAll.get(lIndex))
				for(Integer lGetCellIndex=0;lGetCellIndex<=lListSelectedPricingApiTotalPremium.size()-1;lGetCellIndex++){
					Map lMapPricingApiInputResult=lListSelectedPricingApiTotalPremium.get(lGetCellIndex).Result
					Integer lNumPricingApiInputResultRow=lMapPricingApiInputResult.RowNumber
					Integer lNumPricingApiInputResultColumn=lMapPricingApiInputResult.ColumnNumber
					String lStrSubSetStatus=''
					if(lNumStatusCode==200){
						lStrSubSetStatus='Passed'
					}else{
						lStrSubSetStatus='Failed'
					}
					Boolean lIsInputResultToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiInputResultRow,lNumPricingApiInputResultColumn,lStrSubSetStatus)
					if(!lIsInputResultToExcelSheetDone){
						return lreturn
					}
					Integer lNumPricingApiInputMultiPlanPriceResponseColumn=lNumPricingApiInputResultColumn+1
					Boolean lIsInputPricingApiMultiPlanPriceResponseToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiInputResultRow,lNumPricingApiInputMultiPlanPriceResponseColumn,lStrPricingApiMultiPlanPriceResponseText)
					if(!lIsInputPricingApiMultiPlanPriceResponseToExcelSheetDone){
						return lreturn
					}
				}
			}
			Boolean lIsSaveWorkBook=IGNUemaHelper.saveExcelWorkbookByFileName(lStrExcelGenericFileName,lWorkBookExcelFileGenericTestData)
			if(!lIsSaveWorkBook){
				return lreturn
			}
			lreturn=lIsSaveWorkBook
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseGetPlanApi(String strProductType,String strResponseText,Integer statusCode,Map mapPricingApiInput){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lStrVerifyPricingApiGetPlanPriceResult=true
		String lStrVerifyPricingApiGetPlanPriceDetail=''
		String lStrProductType=strProductType.trim()
		try{
			lreturn.put('Result',lStrVerifyPricingApiGetPlanPriceResult)
			lreturn.put('VerifyPricingApiGetPlanPriceDetail',lStrVerifyPricingApiGetPlanPriceDetail)
			if(strResponseText.length()<=0){
				return lreturn
			}
			Boolean lIsOK=true
			String lStrText=''
			if(statusCode==200){
				Boolean lIsObjectOK=true
				String lStrEmptyValue='Empty'
				String lStrNullValue='null'
				List lListEmpty=[]
				Map lMapJson=new JsonSlurper().parseText(strResponseText)
				Boolean lIsObjectReady=lMapJson.containsKey('root')
				if(lIsObjectReady){
					Map lMapPricingApiGetPlanPriceQuoteData=lMapJson.root.quoteData
					Boolean lIsMapPricingApiGetPlanPriceQuoteDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceQuoteData)
					if(!lIsMapPricingApiGetPlanPriceQuoteDataNull){
						String lStrPricingApiGetPlanPriceRewardPoint=lMapPricingApiGetPlanPriceQuoteData.rewardPoint
						Boolean lIsPricingApiGetPlanPriceRewardPointNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceRewardPoint)
						if(lIsPricingApiGetPlanPriceRewardPointNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"RewardPoint="+lStrNullValue)
						}
						String lStrPricingApiGetPlanPriceStartDate=lMapPricingApiGetPlanPriceQuoteData.startDate
						Boolean lIsPricingApiGetPlanPriceStartDateNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceStartDate)
						if(lIsPricingApiGetPlanPriceStartDateNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"StartDate="+lStrNullValue)
						}else{
							Boolean lIsPricingApiGetPlanPriceStartDateEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceStartDate)
							if(lIsPricingApiGetPlanPriceStartDateEmpty){
								lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"StartDate="+lStrEmptyValue)
							}
						}
						String lStrPricingApiGetPlanPriceMasterSetId=lMapPricingApiGetPlanPriceQuoteData.mastersetId
						Boolean lIsPricingApiGetPlanPriceMasterSetIdNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceMasterSetId)
						if(lIsPricingApiGetPlanPriceMasterSetIdNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"MasterSetID"+lStrNullValue)
						}else{
							Boolean lIsPricingApiGetPlanPriceMasterSetIdEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceMasterSetId)
							if(lIsPricingApiGetPlanPriceMasterSetIdEmpty){
								lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"MasterSetId"+lStrEmptyValue)
							}
						}
						String lStrPricingApiGetPlanPricePolicyAutoRenewalFlag=lMapPricingApiGetPlanPriceQuoteData.flagAutoRenewal
						Boolean lIsPricingApiGetPlanPricePolicyAutoRenewalFlagNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPricePolicyAutoRenewalFlag)
						if(lIsPricingApiGetPlanPricePolicyAutoRenewalFlagNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"PolicyAutoRenewalFlag"+lStrNullValue)
						}
						String lStrPricingApiGetPlanPriceOpportunityNumber=lMapPricingApiGetPlanPriceQuoteData.opportunityNumber
						Boolean lIsPricingApiGetPlanPriceOpportunityNumberNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceOpportunityNumber)
						if(lIsPricingApiGetPlanPriceOpportunityNumberNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"OpportunityNumber="+lStrNullValue)
						}
						Map lMapPricingApiGetPlanPricePolicyHolderData=lMapPricingApiGetPlanPriceQuoteData.policyHolderData
						Boolean lIsMapPricingApiGetPlanPricePolicyHolderDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPricePolicyHolderData)
						if(lIsMapPricingApiGetPlanPricePolicyHolderDataNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'PolicyHolderData='+lStrNullValue)
						}
						if(IGNUemaHelper.checkStringContainString(lStrProductType,'Motor')){
							Map lMapPricingApiGetPlanPriceVehicleData=lMapPricingApiGetPlanPriceQuoteData.vehicleData
							Boolean lIsMapPricingApiGetPlanPriceVehicleDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceVehicleData)
							String lStrPricingApiGetPlanPriceVehicleData=lMapPricingApiGetPlanPriceVehicleData.toString()
							if(lIsMapPricingApiGetPlanPriceVehicleDataNull){
								lIsObjectOK=false
								lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'VehicleData='+lStrNullValue)
							}else{
								Boolean lIsMapPricingApiGetPlanPriceVehicleDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiGetPlanPriceVehicleData)
								if(lIsMapPricingApiGetPlanPriceVehicleDataEmpty){
									lIsObjectOK=false
									lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'VehicleData='+lStrEmptyValue)
								}else{
									lStrText=''
									String lStrPricingApiGetPlanPricePolicyEstimatedAnnualMileage=lMapPricingApiGetPlanPriceVehicleData.yearlyMileage
									if(lStrPricingApiGetPlanPricePolicyEstimatedAnnualMileage=='[]'){
										lStrPricingApiGetPlanPricePolicyEstimatedAnnualMileage=''
									}
									Boolean lIsPricingApiGetPlanPricePolicyEstimatedAnnualMileageNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPricePolicyEstimatedAnnualMileage)
									if(lIsPricingApiGetPlanPricePolicyEstimatedAnnualMileageNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PolicyEstimatedAnnualMileage="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPricePolicyEstimatedAnnualMileageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPricePolicyEstimatedAnnualMileage)
										if(lIsPricingApiGetPlanPricePolicyEstimatedAnnualMileageEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'PolicyEstimatedAnnualMileage='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPricePlanType=lMapPricingApiGetPlanPriceVehicleData.planType
									Boolean lIsPricingApiGetPlanPricePlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPricePlanType)
									if(lIsPricingApiGetPlanPricePlanTypeNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PlanType="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPricePlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPricePlanType)
										if(lIsPricingApiGetPlanPricePlanTypeEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'PlanType='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPricevehicleTypeCode=lMapPricingApiGetPlanPriceVehicleData.vehicleTypeCode
									Boolean lIsPricingApiGetPlanPricevehicleTypeCodeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPricevehicleTypeCode)
									if(lIsPricingApiGetPlanPricevehicleTypeCodeNull){
										lIsObjectOK=false
										lStrText=+IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'vehicleTypeCode='+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPricevehicleTypeCodeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPricevehicleTypeCode)
										if(lIsPricingApiGetPlanPricevehicleTypeCodeEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'vehicleTypeCode='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceVehicleInspectionRequired=lMapPricingApiGetPlanPriceVehicleData.flagInspectionRequired
									Boolean lIsPricingApiGetPlanPriceVehicleInspectionRequiredNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceVehicleInspectionRequired)
									if(lIsPricingApiGetPlanPriceVehicleInspectionRequiredNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"VehicleInspectionRequired="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceVehicleInspectionRequiredEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceVehicleInspectionRequired)
										if(lIsPricingApiGetPlanPriceVehicleInspectionRequiredEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'VehicleInspectionRequired='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceVehiclePlanType=lMapPricingApiGetPlanPriceVehicleData.planType
									Boolean lIsPricingApiGetPlanPriceVehiclePlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceVehiclePlanType)
									if(lIsPricingApiGetPlanPriceVehiclePlanTypeNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PlanType="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceVehiclePlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceVehiclePlanType)
										if(lIsPricingApiGetPlanPriceVehiclePlanTypeEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'PlanType='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceVehicleInspectionLimit=lMapPricingApiGetPlanPriceVehicleData.inspection_Limit
									Boolean lIsPricingApiGetPlanPriceVehicleInspectionLimitNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceVehicleInspectionLimit)
									if(lIsPricingApiGetPlanPriceVehicleInspectionLimitNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"VehicleInspectionLimit="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceVehicleInspectionLimitEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceVehicleInspectionLimit)
										if(lIsPricingApiGetPlanPriceVehicleInspectionLimitEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'VehicleInspectionLimit='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceVehicleInspectionMethod=lMapPricingApiGetPlanPriceVehicleData.inspectionMethod
									Boolean lIsPricingApiGetPlanPriceVehicleInspectionMethodNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceVehicleInspectionMethod)
									if(lIsPricingApiGetPlanPriceVehicleInspectionMethodNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"VehicleInspectionMethod="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceVehicleInspectionMethodEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceVehicleInspectionMethod)
										if(lIsPricingApiGetPlanPriceVehicleInspectionMethodEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'VehicleInspectionMethod='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWorkshop=lMapPricingApiGetPlanPriceVehicleData.workshopType
									Boolean lIsPricingApiGetPlanPriceWorkshopNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWorkshop)
									if(lIsPricingApiGetPlanPriceWorkshopNull){
										lIsObjectOK=false
										lStrText=lStrText+IGNUemaHelper.concatMessageLeftRightByPipe("Workshop",lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWorkshopEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWorkshop)
										if(lIsPricingApiGetPlanPriceWorkshopEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'Workshop='+lStrEmptyValue)
										}
									}
									if(lStrText.length()>1){
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleData',lStrText)
										lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,lStrText)
									}
								}
							}
						}
						List<String> lListPricingApiGetPlanPriceLoadingFactor=lMapPricingApiGetPlanPriceQuoteData.loadingFactors
						Boolean lIsPricingApiGetPlanPriceLoadingFactorListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lListPricingApiGetPlanPriceLoadingFactor)
						if(!lIsPricingApiGetPlanPriceLoadingFactorListEmpty){
							if(lListPricingApiGetPlanPriceLoadingFactor.size()>0){
								if(lStrText.length()>1){
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe("LoadingFactor",lStrText)
									lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,lStrText)
								}
							}
						}else{
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'LoadingFactor='+lListEmpty)
						}
						def lMapPricingApiGetPlanPriceCoverData=lMapPricingApiGetPlanPriceQuoteData.covers
						String lGetPricingApiGetPlanPriceCoverData=lMapPricingApiGetPlanPriceCoverData.toString()
						if(lGetPricingApiGetPlanPriceCoverData=='[]'){
							lGetPricingApiGetPlanPriceCoverData=''
						}
						Boolean lIsMapPricingApiGetPlanPriceCoverDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceCoverData)
						if(lIsMapPricingApiGetPlanPriceCoverDataNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'CoverData='+lStrNullValue)
						}else{
							Boolean lIsMapPricingApiGetPlanPriceCoverDataEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPricingApiGetPlanPriceCoverData)
							if(lIsMapPricingApiGetPlanPriceCoverDataEmpty){
								lIsObjectOK=false
								lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'CoverData='+lStrEmptyValue)
								Map lMapPricingApiGetPlanPriceIrregularityData=lMapPricingApiGetPlanPriceQuoteData.Irregularities
								Boolean lIsMapPricingApiGetPlanPriceIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceIrregularityData)
								if(lIsMapPricingApiGetPlanPriceIrregularityDataNull){
									lIsObjectOK=false
									lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"Irregularity="+lStrNullValue)
								}else{
									lIsObjectOK=false
									lStrText=''
									String lStrPricingApiGetPlanPriceIrregularityDataErrorMessage=lMapPricingApiGetPlanPriceIrregularityData.ErrorMessages
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'ErrorMessage='+lStrPricingApiGetPlanPriceIrregularityDataErrorMessage)
									String lStrPricingApiGetPlanPriceIrregularityDataMaximumAuthorizationLevel=lMapPricingApiGetPlanPriceIrregularityData.MaxAuthorisationLevel
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'MaxAuthorisationLevel='+lStrPricingApiGetPlanPriceIrregularityDataMaximumAuthorizationLevel)
									if(lStrText.length()>1){
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lStrText)
										lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,lStrText)
									}
								}
							}else{
								//Write CoverData Response have been captured or not
							}
						}
					}else{
						lIsObjectOK=false
						lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,'Quote'+lStrNullValue)
					}
					if(lStrVerifyPricingApiGetPlanPriceDetail.length()>1){
						lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe('ResponseValidationFailed',lStrVerifyPricingApiGetPlanPriceDetail)
					}
				}else{
					lIsObjectOK=false
					lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,"Root"+lListEmpty)
				}
			}else{
				lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				lIsOK=false
				String lStrPricingApiGetPlanPriceDetailResultMessage=''
				lStrPricingApiGetPlanPriceDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyPricingApiGetPlanPriceDetail,statusCode)
				lStrVerifyPricingApiGetPlanPriceDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceDetail,lStrPricingApiGetPlanPriceDetailResultMessage)
			}
			lStrVerifyPricingApiGetPlanPriceResult=lIsOK
			lResult=lStrVerifyPricingApiGetPlanPriceDetail.length()>=0
			if(lResult){
				lreturn.put('Result',lStrVerifyPricingApiGetPlanPriceResult)
				lreturn.put('VerifyPricingApiGetPlanPriceDetail',lStrVerifyPricingApiGetPlanPriceDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map verifyResponseGetPlanWithInstallmentApi(String strProductType,String strResponseText,Integer statusCode,Map mapPricingApiInput){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lStrVerifyPricingApiGetPlanPriceWithInstallmentResult=true
		String lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=''
		String lStrProductType=strProductType.trim()
		try{
			lreturn.put("Result",lResult)
			if(strResponseText.length()<=0){
				return lreturn
			}
			Boolean lIsOK=true
			String lStrText=''
			if(statusCode==200){
				Boolean lIsObjectOK=true
				String lStrEmptyValue='Empty'
				String lStrNullValue='null'
				List lListEmpty=[]
				Map lMapJson=new JsonSlurper().parseText(strResponseText)
				Boolean lIsObjectReady=lMapJson.containsKey('root')
				if(lIsObjectReady){
					Map lMapPricingApiGetPlanPriceWithInstallmentQuoteData=lMapJson.root.quoteData
					Boolean lIsMapPricingApiGetPlanPriceWithInstallmentQuoteDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceWithInstallmentQuoteData)
					if(!lIsMapPricingApiGetPlanPriceWithInstallmentQuoteDataNull){
						String lStrPricingApiGetPlanPriceWithInstallmentRewardPoint=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.rewardPoint
						Boolean lIsPricingApiGetPlanPriceWithInstallmentRewardPointNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentRewardPoint)
						if(lIsPricingApiGetPlanPriceWithInstallmentRewardPointNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"RewardPoint="+lStrNullValue)
						}
						String lStrPricingApiGetPlanPriceWithInstallmentStartDate=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.startDate
						Boolean lIsPricingApiGetPlanPriceWithInstallmentStartDateNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentStartDate)
						if(lIsPricingApiGetPlanPriceWithInstallmentStartDateNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"StartDate="+lStrNullValue)
						}else{
							Boolean lIsPricingApiGetPlanPriceWithInstallmentStartDateEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentStartDate)
							if(lIsPricingApiGetPlanPriceWithInstallmentStartDateEmpty){
								lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"StartDate="+lStrEmptyValue)
							}
						}
						String lStrPricingApiGetPlanPriceWithInstallmentMasterSetId=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.mastersetId
						Boolean lIsPricingApiGetPlanPriceWithInstallmentMasterSetIdNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentMasterSetId)
						if(lIsPricingApiGetPlanPriceWithInstallmentMasterSetIdNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"MasterSetID"+lStrNullValue)
						}else{
							Boolean lIsPricingApiGetPlanPriceWithInstallmentMasterSetIdEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentMasterSetId)
							if(lIsPricingApiGetPlanPriceWithInstallmentMasterSetIdEmpty){
								lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"MasterSetId"+lStrEmptyValue)
							}
						}
						String lStrPricingApiGetPlanPriceWithInstallmentPolicyAutoRenewalFlag=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.flagAutoRenewal
						Boolean lIsPricingApiGetPlanPriceWithInstallmentPolicyAutoRenewalFlagNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentPolicyAutoRenewalFlag)
						if(lIsPricingApiGetPlanPriceWithInstallmentPolicyAutoRenewalFlagNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"PolicyAutoRenewalFlag"+lStrNullValue)
						}
						String lStrPricingApiGetPlanPriceWithInstallmentOpportunityNumber=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.opportunityNumber
						Boolean lIsPricingApiGetPlanPriceWithInstallmentOpportunityNumberNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentOpportunityNumber)
						if(lIsPricingApiGetPlanPriceWithInstallmentOpportunityNumberNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"OpportunityNumber="+lStrNullValue)
						}
						Map lMapPricingApiGetPlanPriceWithInstallmentPolicyHolderData=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.policyHolderData
						Boolean lIsMapPricingApiGetPlanPriceWithInstallmentPolicyHolderDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceWithInstallmentPolicyHolderData)
						if(lIsMapPricingApiGetPlanPriceWithInstallmentPolicyHolderDataNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'PolicyHolderData='+lStrNullValue)
						}
						if(IGNUemaHelper.checkStringContainString(lStrProductType,'Motor')){
							Map lMapPricingApiGetPlanPriceWithInstallmentVehicleData=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.vehicleData
							Boolean lIsMapPricingApiGetPlanPriceWithInstallmentVehicleDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceWithInstallmentVehicleData)
							String lStrPricingApiGetPlanPriceWithInstallmentVehicleData=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.toString()
							if(lIsMapPricingApiGetPlanPriceWithInstallmentVehicleDataNull){
								lIsObjectOK=false
								lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'VehicleData='+lStrNullValue)
							}else{
								Boolean lIsMapPricingApiGetPlanPriceWithInstallmentVehicleDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiGetPlanPriceWithInstallmentVehicleData)
								if(lIsMapPricingApiGetPlanPriceWithInstallmentVehicleDataEmpty){
									lIsObjectOK=false
									lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'VehicleData='+lStrEmptyValue)
								}else{
									lStrText=''
									String lStrPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileage=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.yearlyMileage
									if(lStrPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileage=='[]'){
										lStrPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileage=''
									}
									Boolean lIsPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileageNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileage)
									if(lIsPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileageNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PolicyEstimatedAnnualMileage="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileageEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileage)
										if(lIsPricingApiGetPlanPriceWithInstallmentPolicyEstimatedAnnualMileageEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'PolicyEstimatedAnnualMileage='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentPlanType=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.planType
									Boolean lIsPricingApiGetPlanPriceWithInstallmentPlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentPlanType)
									if(lIsPricingApiGetPlanPriceWithInstallmentPlanTypeNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PlanType="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentPlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentPlanType)
										if(lIsPricingApiGetPlanPriceWithInstallmentPlanTypeEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'PlanType='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentvehicleTypeCode=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.vehicleTypeCode
									Boolean lIsPricingApiGetPlanPriceWithInstallmentvehicleTypeCodeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentvehicleTypeCode)
									if(lIsPricingApiGetPlanPriceWithInstallmentvehicleTypeCodeNull){
										lIsObjectOK=false
										lStrText=+IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'vehicleTypeCode='+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentvehicleTypeCodeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentvehicleTypeCode)
										if(lIsPricingApiGetPlanPriceWithInstallmentvehicleTypeCodeEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'vehicleTypeCode='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequired=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.flagInspectionRequired
									Boolean lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequiredNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequired)
									if(lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequiredNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"VehicleInspectionRequired="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequiredEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequired)
										if(lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionRequiredEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'VehicleInspectionRequired='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentVehiclePlanType=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.planType
									Boolean lIsPricingApiGetPlanPriceWithInstallmentVehiclePlanTypeNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentVehiclePlanType)
									if(lIsPricingApiGetPlanPriceWithInstallmentVehiclePlanTypeNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"PlanType="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentVehiclePlanTypeEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentVehiclePlanType)
										if(lIsPricingApiGetPlanPriceWithInstallmentVehiclePlanTypeEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'PlanType='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimit=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.inspection_Limit
									Boolean lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimitNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimit)
									if(lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimitNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"VehicleInspectionLimit="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimitEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimit)
										if(lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionLimitEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'VehicleInspectionLimit='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethod=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.inspectionMethod
									Boolean lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethodNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethod)
									if(lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethodNull){
										lIsObjectOK=false
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,"VehicleInspectionMethod="+lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethodEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethod)
										if(lIsPricingApiGetPlanPriceWithInstallmentVehicleInspectionMethodEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'VehicleInspectionMethod='+lStrEmptyValue)
										}
									}
									String lStrPricingApiGetPlanPriceWithInstallmentWorkshop=lMapPricingApiGetPlanPriceWithInstallmentVehicleData.workshopType
									Boolean lIsPricingApiGetPlanPriceWithInstallmentWorkshopNull=IGNUemaHelper.checkObjectNullOfObject(lStrPricingApiGetPlanPriceWithInstallmentWorkshop)
									if(lIsPricingApiGetPlanPriceWithInstallmentWorkshopNull){
										lIsObjectOK=false
										lStrText=lStrText+IGNUemaHelper.concatMessageLeftRightByPipe("Workshop",lStrNullValue)
									}else{
										Boolean lIsPricingApiGetPlanPriceWithInstallmentWorkshopEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceWithInstallmentWorkshop)
										if(lIsPricingApiGetPlanPriceWithInstallmentWorkshopEmpty){
											lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'Workshop='+lStrEmptyValue)
										}
									}
									if(lStrText.length()>1){
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleData',lStrText)
										lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,lStrText)
									}
								}
							}
						}
						List<String> lListPricingApiGetPlanPriceWithInstallmentLoadingFactor=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.loadingFactors
						Boolean lIsPricingApiGetPlanPriceWithInstallmentLoadingFactorListEmpty=IGNUemaHelper.checkObjectEmptyOfList(lListPricingApiGetPlanPriceWithInstallmentLoadingFactor)
						if(!lIsPricingApiGetPlanPriceWithInstallmentLoadingFactorListEmpty){
							if(lListPricingApiGetPlanPriceWithInstallmentLoadingFactor.size()>0){
								if(lStrText.length()>1){
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe("LoadingFactor",lStrText)
									lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,lStrText)
								}
							}
						}else{
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'LoadingFactor='+lListEmpty)
						}
						def lMapPricingApiGetPlanPriceWithInstallmentCoverData=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.covers
						String lGetPricingApiGetPlanPriceWithInstallmentCoverData=lMapPricingApiGetPlanPriceWithInstallmentCoverData.toString()
						if(lGetPricingApiGetPlanPriceWithInstallmentCoverData=='[]'){
							lGetPricingApiGetPlanPriceWithInstallmentCoverData=''
						}
						Boolean lIsMapPricingApiGetPlanPriceWithInstallmentCoverDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceWithInstallmentCoverData)
						if(lIsMapPricingApiGetPlanPriceWithInstallmentCoverDataNull){
							lIsObjectOK=false
							lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'CoverData='+lStrNullValue)
						}else{
							Boolean lIsMapPricingApiGetPlanPriceWithInstallmentCoverDataEmpty=IGNUemaHelper.checkObjectEmptyOfString(lGetPricingApiGetPlanPriceWithInstallmentCoverData)
							if(lIsMapPricingApiGetPlanPriceWithInstallmentCoverDataEmpty){
								lIsObjectOK=false
								lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'CoverData='+lStrEmptyValue)
								Map lMapPricingApiGetPlanPriceWithInstallmentIrregularityData=lMapPricingApiGetPlanPriceWithInstallmentQuoteData.Irregularities
								Boolean lIsMapPricingApiGetPlanPriceWithInstallmentIrregularityDataNull=IGNUemaHelper.checkObjectNullOfObject(lMapPricingApiGetPlanPriceWithInstallmentIrregularityData)
								if(lIsMapPricingApiGetPlanPriceWithInstallmentIrregularityDataNull){
									lIsObjectOK=false
									lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"Irregularity="+lStrNullValue)
								}else{
									lIsObjectOK=false
									lStrText=''
									String lStrPricingApiGetPlanPriceWithInstallmentIrregularityDataErrorMessage=lMapPricingApiGetPlanPriceWithInstallmentIrregularityData.ErrorMessages
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'ErrorMessage='+lStrPricingApiGetPlanPriceWithInstallmentIrregularityDataErrorMessage)
									String lStrPricingApiGetPlanPriceWithInstallmentIrregularityDataMaximumAuthorizationLevel=lMapPricingApiGetPlanPriceWithInstallmentIrregularityData.MaxAuthorisationLevel
									lStrText=IGNUemaHelper.concatMessageLeftRightByPipe(lStrText,'MaxAuthorisationLevel='+lStrPricingApiGetPlanPriceWithInstallmentIrregularityDataMaximumAuthorizationLevel)
									if(lStrText.length()>1){
										lStrText=IGNUemaHelper.concatMessageLeftRightByPipe('Irregularity',lStrText)
										lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,lStrText)
									}
								}
							}else{
								//Write CoverData Response have been captured or not
							}
						}
					}else{
						lIsObjectOK=false
						lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,'Quote'+lStrNullValue)
					}
					if(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail.length()>1){
						lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe('ResponseValidationFailed',lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail)
					}
				}else{
					lIsObjectOK=false
					lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,"Root"+lListEmpty)
				}
			}else{
				lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe('StatusCodeFailed',strResponseText)
				lIsOK=false
				String lStrPricingApiGetPlanPriceWithInstallmentDetailResultMessage=''
				lStrPricingApiGetPlanPriceWithInstallmentDetailResultMessage=this.inputGenericResultMessageB(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,statusCode)
				lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail,lStrPricingApiGetPlanPriceWithInstallmentDetailResultMessage)
			}
			lStrVerifyPricingApiGetPlanPriceWithInstallmentResult=lIsOK
			lResult=lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail.length()>=0
			if(lResult){
				lreturn.put('Result',lStrVerifyPricingApiGetPlanPriceWithInstallmentResult)
				lreturn.put('VerifyPricingApiGetPlanPriceWithInstallmentDetail',lStrVerifyPricingApiGetPlanPriceWithInstallmentDetail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean validatePricingApiLibraryPremiumResult(Sheet sheetPricingApi,List listSelectedPricingApiTotalPremium,Map mapInputPricingApiInstallmentAndDownPaymentAmountResult,Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput,Map mapPricingApiLibraryGetPlanPriceResult){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectEmptyOfList(listSelectedPricingApiTotalPremium)){
			return lreturn
		}
		List lListSelectedPricingApiTotalPremium=listSelectedPricingApiTotalPremium
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiInstallmentAndDownPaymentAmountResult)){
			return lreturn
		}
		Map lMapInputPricingApiInstallmentAndDownPaymentAmountResult=mapInputPricingApiInstallmentAndDownPaymentAmountResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiLibraryGetPlanPriceResult)){
			return lreturn
		}
		Map lMapPricingApiLibraryGetPlanPriceResult=mapPricingApiLibraryGetPlanPriceResult
		try{
			Boolean lIsPremiumMatchedValidationResultOK=true
			Float lNumPricingApiLibraryTotalInstallmentAmount=0.0
			String lStrPricingApiLibraryGetPlanPriceTotalPremiumValidationResultMessage=''
			String lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage=''
			String lStrPaymentFrequency=lMapCollectedPricingApiDetailResult.StrPricingApiPaymentFrequency
			Boolean lIsPricingApiFlagApplyLoadingFactor=lMapCollectedPricingApiDetailResult.BoolIsPricingApiFlagApplyLoadingFactor
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredTransactionType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			String lStrPricingApiGetPlanPriceResponse=mapPricingApiInputOutput.GetPlanPriceResponseText
			String lStrPricingApiGetPlanWithInstallmentPriceResponse=mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText
			Map lMapJsonPricingApiGetPlanWithInstallmentPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanWithInstallmentPriceResponse)
			Map lMapPricingApiGetPlanWithInstallmentPaymentData=lMapJsonPricingApiGetPlanWithInstallmentPriceResponse.root.quoteData.paymentData
			List lListPricingApiGetPlanWithInstallmentPaymentDetail=lMapPricingApiGetPlanWithInstallmentPaymentData.paymentDetailsData
			String lStrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment=lMapPricingApiLibraryGetPlanPriceResult.StrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment
			Float lNumPricingApiLibraryGetPlanPriceWithInstallmentDownPayment=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment,0.0)
			String lStrPricingApiLibraryGetPlanWithInstallmentPriceInstallmentPayment=lMapPricingApiLibraryGetPlanPriceResult.StrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount
			Float lNumrPricingApiLibraryGetPlanWithInstallmentPriceInstallmentPayment=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryGetPlanWithInstallmentPriceInstallmentPayment,0.0)
			if(lStrPricingApiQuoteRequiredTransactionType=='New Biz'){
				Map lMapPricingApiGetPlanWithInstallmentPaymentDetail=lListPricingApiGetPlanWithInstallmentPaymentDetail.get(0)
				String lStrInstallmentAmount=lMapPricingApiGetPlanWithInstallmentPaymentDetail.amount
				Integer lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount=IGNUemaHelper.convertStringToInteger(lStrInstallmentAmount,0)
				if(lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount!=lNumPricingApiLibraryGetPlanPriceWithInstallmentDownPayment){
					lIsPremiumMatchedValidationResultOK=false
					String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('PricingApiInstallmentAmount'+lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount,'PricingApiLibraryGetPlanWithInstallmentPriceDownPaymentAmount'+lNumPricingApiLibraryGetPlanPriceWithInstallmentDownPayment)
					lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage,lStrMessageText)
				}
				if(lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount!=lNumrPricingApiLibraryGetPlanWithInstallmentPriceInstallmentPayment){
					lIsPremiumMatchedValidationResultOK=false
					String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('PricingApiInstallmentPayment'+lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount,'PricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount'+lNumrPricingApiLibraryGetPlanWithInstallmentPriceInstallmentPayment)
					lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage,lStrMessageText)
				}
			}
			List lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail=lMapPricingApiLibraryGetPlanPriceResult.ListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail
			if(lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail.size()>0){
				for(Integer lPaymentIndex=0;lPaymentIndex<=lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail.size()-1;lPaymentIndex++){
					Map lMapPricingApiLibraryGetPlanWithInstallmentPaymentDetail=lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail.get(lPaymentIndex)
					String lStrPricingApiLibraryInstallmentAmount=lMapPricingApiLibraryGetPlanWithInstallmentPaymentDetail.Amount
					Float lNumPricingApiLibraryInstallmentAmount=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryInstallmentAmount,0.0)
					lNumPricingApiLibraryTotalInstallmentAmount=lNumPricingApiLibraryTotalInstallmentAmount+lNumPricingApiLibraryInstallmentAmount
				}
			}
			Float lNumPricingApiTotalPolicyGrossPremium=mapPricingApiInputOutput.NumPricingApiTotalPolicyGrossPremium
			if(lNumPricingApiTotalPolicyGrossPremium!=lNumPricingApiLibraryTotalInstallmentAmount){
				String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationGrossPremium'+lNumPricingApiTotalPolicyGrossPremium,'PricingApiLibraryGetPlanWithPriceTotalInstallmentAmount'+lNumPricingApiLibraryTotalInstallmentAmount)
				lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage,lStrMessageText)
			}
			Map lMapPricingApiGetPlanPriceResponseTotalPremium=this.getMapPricingApiGetPlanPriceResponseTotalPremium(lStrPaymentFrequency,lStrPricingApiGetPlanPriceResponse,lStrPricingApiGetPlanWithInstallmentPriceResponse)
			if(!lMapPricingApiGetPlanPriceResponseTotalPremium.Result){
				return lreturn
			}
			Float lNumPricingApiGetPlanPriceTotalPremium=lMapPricingApiGetPlanPriceResponseTotalPremium.NumPricingApiGetPlanPriceTotalPremium
			Float lNumPricingApiGetPlanWithInstallmentPriceTotalPremium=lMapPricingApiGetPlanPriceResponseTotalPremium.NumPricingApiGetPlanWithInstallmentPriceTotalPremium
			if(!lIsPricingApiFlagApplyLoadingFactor){
				String lStrPricingApiLibraryGetPlanPriceTotalPremium=lMapPricingApiLibraryGetPlanPriceResult.StrPricingApiLibraryGetPlanPriceTotalPremium
				Float lNumPricingApiLibraryGetPlanPriceTotalPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryGetPlanPriceTotalPremium,0.0)
				if(lNumPricingApiLibraryGetPlanPriceTotalPremium!=lNumPricingApiGetPlanPriceTotalPremium){
					lIsPremiumMatchedValidationResultOK=false
					String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('PricingApiGetPlanPriceTotalPremium'+lNumPricingApiGetPlanPriceTotalPremium,'PricingApiLibraryGetPlanPriceTotalPremium'+lNumPricingApiLibraryGetPlanPriceTotalPremium)
					lStrPricingApiLibraryGetPlanPriceTotalPremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiLibraryGetPlanPriceTotalPremiumValidationResultMessage,lStrMessageText)
				}
			}
			String lStrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium=lMapPricingApiLibraryGetPlanPriceResult.StrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium
			Float lNumPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium,0.0)
			if(lNumPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium!=lNumPricingApiGetPlanWithInstallmentPriceTotalPremium){
				lIsPremiumMatchedValidationResultOK=false
				String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('PricingApiGetPlanPriceWithInstallmentTotalPremium'+lNumPricingApiGetPlanWithInstallmentPriceTotalPremium,'PricingApiLibraryGetPlanPriceWithInstallmentTotalPremium'+lNumPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium)
				lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage,lStrMessageText)
			}
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiLibraryGetPlanPriceTotalPremiumValidationResultMessage)){
				Map lMapPricingApiValidationTestResultLibraryGetPlanPrice=lListSelectedPricingApiTotalPremium[0].ValidationTestResultLibraryGetPlanPrice
				Integer lNumPricingApiLibraryValidationTestResultRow=lMapPricingApiValidationTestResultLibraryGetPlanPrice.RowNumber
				Integer lNumPricingApiLibraryValidationTestResultColumn=lMapPricingApiValidationTestResultLibraryGetPlanPrice.ColumnNumber
				Boolean lIsInputValidationTestResultMessageToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiLibraryValidationTestResultRow,lNumPricingApiLibraryValidationTestResultColumn,lStrPricingApiLibraryGetPlanPriceTotalPremiumValidationResultMessage)
				if(!lIsInputValidationTestResultMessageToExcelSheetDone){
					return lreturn
				}
			}
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage)){
				Map lMapPricingApiValidationTestResultLibraryGetPlanWithInstallmentPrice=lListSelectedPricingApiTotalPremium[0].ValidationTestResultLibraryGetPlanWithInstallmentPrice
				Integer lNumPricingApiLibraryValidationTestResultRow=lMapPricingApiValidationTestResultLibraryGetPlanWithInstallmentPrice.RowNumber
				Integer lNumPricingApiLibraryValidationTestResultColumn=lMapPricingApiValidationTestResultLibraryGetPlanWithInstallmentPrice.ColumnNumber
				Boolean lIsInputValidationTestResultMessageToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiLibraryValidationTestResultRow,lNumPricingApiLibraryValidationTestResultColumn,lStrPricingApiGetPlanWithInstallmentPriceTotalPremiumValidationMessage)
				if(!lIsInputValidationTestResultMessageToExcelSheetDone){
					return lreturn
				}
			}
			lResult=lIsPremiumMatchedValidationResultOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean validatePricingApiPremiumResult(Sheet sheetPricingApi,List listSelectedPricingApiTransaction,List listSelectedPricingApiTotalPremium,Map mapInputPricingApiInstallmentAndDownPaymentAmountResult,Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectEmptyOfList(listSelectedPricingApiTransaction)){
			return lreturn
		}
		List lListSelectedPricingApiTransaction=listSelectedPricingApiTransaction
		if(IGNUemaHelper.checkObjectEmptyOfList(listSelectedPricingApiTotalPremium)){
			return lreturn
		}
		List lListSelectedPricingApiTotalPremium=listSelectedPricingApiTotalPremium
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiInstallmentAndDownPaymentAmountResult)){
			return lreturn
		}
		Map lMapInputPricingApiInstallmentAndDownPaymentAmountResult=mapInputPricingApiInstallmentAndDownPaymentAmountResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		try{
			String lStrPricingApiGetPlanPricePremiumValidationResultMessage=''
			String lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=''
			String lStrPricingApiTotalPremiumValidationResultMessage=''
			Boolean lIsPremiumMatchedValidationResultOK=true
			Float lNumPricingApiTotalPolicyGrossPremium=0.0
			Float lNumPricingApiTotalPremium=0.0
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiCoverageName=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageName
			List lListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading
			List lListCollectedPricingApiAdditionalCoveragePremiumWithLoading=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiAdditionalCoveragePremiumWithLoading
			List lListMapCollectedPricingApiCoverageValidationTestResult=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageValidationTestResult
			String lStrPaymentFrequency=lMapCollectedPricingApiDetailResult.StrPricingApiPaymentFrequency
			Boolean lIsPricingApiFlagApplyLoadingFactor=lMapCollectedPricingApiDetailResult.BoolIsPricingApiFlagApplyLoadingFactor
			String lStrPricingApiGetPlanPriceResponse=mapPricingApiInputOutput.GetPlanPriceResponseText
			String lStrPricingApiGetPlanWithInstallmentPriceResponse=mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText
			Map lMapJsonPricingApiGetPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanPriceResponse)
			Map lMapJsonPricingApiGetPlanWithInstallmentPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanWithInstallmentPriceResponse)
			List lListGetPlanPriceCoverData=lMapJsonPricingApiGetPlanPriceResponse.root.quoteData.covers
			List lListGetPlanWithInstallmentPriceCoverData=lMapJsonPricingApiGetPlanWithInstallmentPriceResponse.root.quoteData.covers
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				Map lMapPricingApiGetPlanPriceCoverData=lListGetPlanPriceCoverData.get(lIndex)
				Map lMapPricingApiGetPlanWithInstallmentPriceCoverData=lListGetPlanWithInstallmentPriceCoverData.get(lIndex)
				lStrPricingApiGetPlanPricePremiumValidationResultMessage=''
				lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=''
				if(lMapPricingApiGetPlanPriceCoverData.code==lStrCoverName){
					Map lMapPricingApiTransactionNetPremium=lListSelectedPricingApiTransaction.get(lIndex).TransactionNetPremium
					String lStrPricingApiGetPlanPriceTransactionNetPremium=lMapPricingApiGetPlanPriceCoverData.transNetPremium
					String lStrPricingApiGetPlanWithInstallmentPriceTransactionNetPremium=lMapPricingApiGetPlanWithInstallmentPriceCoverData.transNetPremium
					Map lMapPricingApiTransactionNetPremiumValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'TransactionNetPremium', lMapPricingApiTransactionNetPremium,lStrPricingApiGetPlanPriceTransactionNetPremium,lStrPricingApiGetPlanWithInstallmentPriceTransactionNetPremium)
					if(!lMapPricingApiTransactionNetPremiumValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPriceTransactionNetPremiumValidationResultMessage=lMapPricingApiTransactionNetPremiumValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPriceTransactionNetPremiumValidationResultMessage=lMapPricingApiTransactionNetPremiumValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceTransactionNetPremiumValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPriceTransactionNetPremiumValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceTransactionNetPremiumValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceTransactionNetPremiumValidationResultMessage)
						}
					}
					Map  lMapPricingApiAnnualNetPremium=lListSelectedPricingApiTransaction.get(lIndex).AnnualNetPremium
					String lStrPricingApiGetPlanPriceAnnualNetPremium=lMapPricingApiGetPlanPriceCoverData.annualNetPremium
					String lStrPricingApiGetPlanWithInstallmentPriceAnnualNetPremium=lMapPricingApiGetPlanWithInstallmentPriceCoverData.annualNetPremium
					Map lMapPricingApiAnnualNetPremiumValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'AnnualNetPremium', lMapPricingApiAnnualNetPremium,lStrPricingApiGetPlanPriceAnnualNetPremium,lStrPricingApiGetPlanWithInstallmentPriceAnnualNetPremium)
					if(!lMapPricingApiAnnualNetPremiumValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPriceAnnualNetPremiumValidationResultMessage=lMapPricingApiAnnualNetPremiumValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPriceAnnualNetPremiumValidationResultMessage=lMapPricingApiAnnualNetPremiumValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceAnnualNetPremiumValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPriceAnnualNetPremiumValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceAnnualNetPremiumValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceAnnualNetPremiumValidationResultMessage)
						}
					}
					Map  lMapPricingApiAnnualStampDuty=lListSelectedPricingApiTransaction.get(lIndex).AnnualStampDutyCalc
					String lStrPricingApiGetPlanPriceAnnualStampDuty=lMapPricingApiGetPlanPriceCoverData.annualStampDuty
					String lStrPricingApiGetPlanWithInstallmentPriceAnnualStampDuty=lMapPricingApiGetPlanWithInstallmentPriceCoverData.annualStampDuty
					Map lMapPricingApiAnnualStampDutyValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'AnnualStampDuty', lMapPricingApiAnnualStampDuty,lStrPricingApiGetPlanPriceAnnualStampDuty,lStrPricingApiGetPlanWithInstallmentPriceAnnualStampDuty)
					if(!lMapPricingApiAnnualStampDutyValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPriceAnnualStampDutyValidationResultMessage=lMapPricingApiAnnualStampDutyValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPriceAnnualStampDutyValidationResultMessage=lMapPricingApiAnnualStampDutyValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceAnnualStampDutyValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPriceAnnualStampDutyValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceAnnualStampDutyValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceAnnualStampDutyValidationResultMessage)
						}
					}
					Map  lMapPricingApiAnnualGrossPremium=lListSelectedPricingApiTransaction.get(lIndex).AnnualGrossPremiumCalc
					String lStrPricingApiGetPlanPriceAnnualGrossPremium=lMapPricingApiGetPlanPriceCoverData.annualGrossPremium
					String lStrPricingApiGetPlanWithInstallmentPriceAnnualGrossPremium=lMapPricingApiGetPlanWithInstallmentPriceCoverData.annualGrossPremium
					Map lMapPricingApiAnnualGrossPremiumValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'AnnualGrossPremium', lMapPricingApiAnnualGrossPremium,lStrPricingApiGetPlanPriceAnnualGrossPremium,lStrPricingApiGetPlanWithInstallmentPriceAnnualGrossPremium)
					if(!lMapPricingApiAnnualGrossPremiumValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPriceAnnualGrossPremiumValidationResultMessage=lMapPricingApiAnnualGrossPremiumValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPriceAnnualGrossPremiumValidationResultMessage=lMapPricingApiAnnualGrossPremiumValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceAnnualGrossPremiumValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPriceAnnualGrossPremiumValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceAnnualGrossPremiumValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceAnnualGrossPremiumValidationResultMessage)
						}
					}
					Float lNumPricingApiAnnualGrossPremium=lMapPricingApiAnnualGrossPremiumValidationResult.NumPricingApiTargetPremium
					lNumPricingApiTotalPremium=lNumPricingApiTotalPremium+lNumPricingApiAnnualGrossPremium
					Map  lMapPricingApiPolicyNetPremium=lListSelectedPricingApiTransaction.get(lIndex).PolicyNetPremium
					String lStrPricingApiGetPlanPricePolicyNetPremium=lMapPricingApiGetPlanPriceCoverData.policyNetPremium
					String lStrPricingApiGetPlanWithInstallmentPricePolicyNetPremium=lMapPricingApiGetPlanWithInstallmentPriceCoverData.policyNetPremium
					Map lMapPricingApiPolicyNetPremiumValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'PolicyNetPremium', lMapPricingApiPolicyNetPremium,lStrPricingApiGetPlanPricePolicyNetPremium,lStrPricingApiGetPlanWithInstallmentPricePolicyNetPremium)
					if(!lMapPricingApiPolicyNetPremiumValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPricePolicyNetPremiumValidationResultMessage=lMapPricingApiPolicyNetPremiumValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPricePolicyNetPremiumValidationResultMessage=lMapPricingApiPolicyNetPremiumValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPricePolicyNetPremiumValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPricePolicyNetPremiumValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPricePolicyNetPremiumValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPricePolicyNetPremiumValidationResultMessage)
						}
					}
					Map  lMapPricingApiPolicyStampDuty=lListSelectedPricingApiTransaction.get(lIndex).PolicyStampDuty
					String lStrPricingApiGetPlanPricePolicyStampDuty=lMapPricingApiGetPlanPriceCoverData.policyStampDuty
					String lStrPricingApiGetPlanWithInstallmentPricePolicyStampDuty=lMapPricingApiGetPlanWithInstallmentPriceCoverData.policyStampDuty
					Map lMapPricingApiPolicyStampDutyValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'PolicyStampDuty', lMapPricingApiPolicyStampDuty,lStrPricingApiGetPlanPricePolicyStampDuty,lStrPricingApiGetPlanWithInstallmentPricePolicyStampDuty)
					if(!lMapPricingApiPolicyStampDutyValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPricePolicyStampDutyValidationResultMessage=lMapPricingApiPolicyStampDutyValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPricePolicyStampDutyValidationResultMessage=lMapPricingApiPolicyStampDutyValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPricePolicyStampDutyValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPricePolicyStampDutyValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPricePolicyStampDutyValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPricePolicyStampDutyValidationResultMessage)
						}
					}
					Map  lMapPricingApiPolicyGrossPremium=lListSelectedPricingApiTransaction.get(lIndex).PolicyGrossPremium
					String lStrPricingApiGetPlanPricePolicyGrossPremium=lMapPricingApiGetPlanPriceCoverData.policyGrossPremium
					String lStrPricingApiGetPlanWithInstallmentPricePolicyGrossPremium=lMapPricingApiGetPlanWithInstallmentPriceCoverData.policyGrossPremium
					Map lMapPricingApiPolicyGrossPremiumValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'PolicyGrossPremium', lMapPricingApiPolicyGrossPremium,lStrPricingApiGetPlanPricePolicyGrossPremium,lStrPricingApiGetPlanWithInstallmentPricePolicyGrossPremium)
					if(!lMapPricingApiPolicyGrossPremiumValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPricePolicyGrossPremiumValidationResultMessage=lMapPricingApiPolicyGrossPremiumValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPricePolicyGrossPremiumValidationResultMessage=lMapPricingApiPolicyGrossPremiumValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPricePolicyGrossPremiumValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPricePolicyGrossPremiumValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPricePolicyGrossPremiumValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPricePolicyGrossPremiumValidationResultMessage)
						}
					}
					Float lNumPricingApiPolicyGrossPremium=lMapPricingApiPolicyGrossPremiumValidationResult.NumPricingApiTargetPremium
					lNumPricingApiTotalPolicyGrossPremium=lNumPricingApiTotalPolicyGrossPremium+lNumPricingApiPolicyGrossPremium
					Map  lMapPricingApiTransactionStampDuty=lListSelectedPricingApiTransaction.get(lIndex).TransactionStampDuty
					String lStrPricingApiGetPlanPriceTransactionStampDuty=lMapPricingApiGetPlanPriceCoverData.transStampDuty
					String lStrPricingApiGetPlanWithInstallmentPriceTransactionStampDuty=lMapPricingApiGetPlanWithInstallmentPriceCoverData.transStampDuty
					Map lMapPricingApiTransactionStampDutyValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'TransactionStampDuty', lMapPricingApiTransactionStampDuty,lStrPricingApiGetPlanPriceTransactionStampDuty,lStrPricingApiGetPlanWithInstallmentPriceTransactionStampDuty)
					if(!lMapPricingApiTransactionStampDutyValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPriceTransactionStampDutyValidationResultMessage=lMapPricingApiTransactionStampDutyValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPriceTransactionStampDutyValidationResultMessage=lMapPricingApiTransactionStampDutyValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceTransactionStampDutyValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPriceTransactionStampDutyValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceTransactionStampDutyValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceTransactionStampDutyValidationResultMessage)
						}
					}
					Map  lMapPricingApiTransactionGrossPremium=lListSelectedPricingApiTransaction.get(lIndex).TransactionGrossPremium
					String lStrPricingApiGetPlanPriceTransactionGrossPremium=lMapPricingApiGetPlanPriceCoverData.transGrossPremium
					String lStrPricingApiGetPlanWithInstallmentPriceTransactionGrossPremium=lMapPricingApiGetPlanWithInstallmentPriceCoverData.transGrossPremium
					Map lMapPricingApiTransactionGrossPremiumValidationResult=this.getMapPricingApiTargetPremiumValidationResultMessage(lSheetPricingApi,lIsPricingApiFlagApplyLoadingFactor, 'TransactionGrossPremium', lMapPricingApiTransactionGrossPremium,lStrPricingApiGetPlanPriceTransactionGrossPremium,lStrPricingApiGetPlanWithInstallmentPriceTransactionGrossPremium)
					if(!lMapPricingApiTransactionGrossPremiumValidationResult.Result){
						lIsPremiumMatchedValidationResultOK=false
						String lStrPricingApiGetPlanWithInstallmentPriceTransactionGrossPremiumValidationResultMessage=lMapPricingApiTransactionGrossPremiumValidationResult.StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage
						if(!lIsPricingApiFlagApplyLoadingFactor){
							String lStrPricingApiGetPlanPriceTransactionGrossPremiumValidationResultMessage=lMapPricingApiTransactionGrossPremiumValidationResult.StrPricingApiGetPlanPricePremiumValidationResultMessage
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceTransactionGrossPremiumValidationResultMessage)){
								lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrPricingApiGetPlanPriceTransactionGrossPremiumValidationResultMessage)
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceTransactionGrossPremiumValidationResultMessage)){
							lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceTransactionGrossPremiumValidationResultMessage)
						}
					}
					if(!lIsPricingApiFlagApplyLoadingFactor){
						Map lMapPricingApiGetPlanPriceValidationTestResult=lListSelectedPricingApiTransaction.get(lIndex).ValidationTestResultGetPlanPrice
						Boolean lIsInputPricingApiGetPlanPriceValidationTestResult=this.inputPricingApiTestResultIntoExcelSheet(lSheetPricingApi,lStrPricingApiGetPlanPricePremiumValidationResultMessage,lMapPricingApiGetPlanPriceValidationTestResult)
					}
					Map lMapPricingApiGetPlanWithInstallmentPriceValidationTestResult=lListSelectedPricingApiTransaction.get(lIndex).ValidationTestResultGetPlanWithInstallmentPrice
					Boolean lIsInputPricingApiGetPlanWithInstallmentPriceValidationTestResult=this.inputPricingApiTestResultIntoExcelSheet(lSheetPricingApi,lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lMapPricingApiGetPlanWithInstallmentPriceValidationTestResult)
				}
			}
			Map lMapPricingApiGetPlanPriceResponseTotalPremium=this.getMapPricingApiGetPlanPriceResponseTotalPremium(lStrPaymentFrequency,lStrPricingApiGetPlanPriceResponse,lStrPricingApiGetPlanWithInstallmentPriceResponse)
			if(!lMapPricingApiGetPlanPriceResponseTotalPremium.Result){
				return lreturn
			}
			Float lNumPricingApiGetPlanPriceTotalPremium=lMapPricingApiGetPlanPriceResponseTotalPremium.NumPricingApiGetPlanPriceTotalPremium
			Float lNumPricingApiGetPlanWithInstallmentPriceTotalPremium=lMapPricingApiGetPlanPriceResponseTotalPremium.NumPricingApiGetPlanWithInstallmentPriceTotalPremium
			Map lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult=this.validateGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmount(lMapInputPricingApiInstallmentAndDownPaymentAmountResult,mapPricingApiInputOutput)
			if(!lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult.Result){
				return lreturn
			}
			String lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult.StrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage
			String lStrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult.StrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage
			String lStrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage=lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult.StrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage
			Float  lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount=lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult.NumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount
			Float lNumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount=lMapGetPlanWithInstallmentPriceTotalDownPaymentAndInstallmentAmountResult.NumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)){
				lIsPremiumMatchedValidationResultOK=false
				lStrPricingApiTotalPremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiTotalPremiumValidationResultMessage,lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
			}
			mapPricingApiInputOutput.NumPricingApiTotalPolicyGrossPremium=lNumPricingApiTotalPolicyGrossPremium
			if(lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount!=lNumPricingApiTotalPolicyGrossPremium){
				lIsPremiumMatchedValidationResultOK=false
				String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('GetPlanPriceWithInstallment-CalculationTotalInstallmentAmount'+lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount,'CalculationTotalPolicyGrossPremiumValue'+lNumPricingApiTotalPolicyGrossPremium)
				lStrPricingApiTotalPremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiTotalPremiumValidationResultMessage,lStrMessageText)
			}
			if(lNumPricingApiTotalPremium!=lNumPricingApiGetPlanPriceTotalPremium ||lNumPricingApiTotalPremium!=lNumPricingApiGetPlanWithInstallmentPriceTotalPremium){
				lIsPremiumMatchedValidationResultOK=false
				String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalPremium'+lNumPricingApiTotalPremium,'GetPlanPriceTotalPremium'+lNumPricingApiGetPlanPriceTotalPremium+' '+' GetPlanWithInstallmentPrice'+lNumPricingApiGetPlanWithInstallmentPriceTotalPremium)
				lStrPricingApiTotalPremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiTotalPremiumValidationResultMessage,lStrMessageText)
			}
			lStrPricingApiTotalPremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiTotalPremiumValidationResultMessage,lStrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
			String lStrPricingApiGetPlanPriceRequest=mapPricingApiInputOutput.GetPlanPriceRequestBody
			String lStrPricingApiGetPlanWithInstallmentPriceRequest=mapPricingApiInputOutput.GetPlanWithInstallmentPriceRequestBody
			Map lMapPricingApiTotalPremium=lListSelectedPricingApiTotalPremium.get(0).TotalPremium
			String lStrPricingApiTotalPremium=lNumPricingApiTotalPremium.toString()
			Boolean lIsInputPricingApiTotalPremium=this.inputPricingApiTestResultIntoExcelSheet(lSheetPricingApi,lStrPricingApiTotalPremium,lMapPricingApiTotalPremium)
			Map lMapPricingApiValidationTestResult=lListSelectedPricingApiTotalPremium[0].ValidationTestResult
			Integer lNumPricingApiValidationTestResultRow=lMapPricingApiValidationTestResult.RowNumber
			Integer lNumPricingApiValidationTestResultColumn=lMapPricingApiValidationTestResult.ColumnNumber
			Boolean lIsInputValidationTestResultMessageToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiValidationTestResultRow,lNumPricingApiValidationTestResultColumn,lStrPricingApiTotalPremiumValidationResultMessage)
			if(!lIsInputValidationTestResultMessageToExcelSheetDone){
				return lreturn
			}
			Integer lNumPricingApiGetPlanResponseColumn=lNumPricingApiValidationTestResultColumn+2
			Integer lNumPricingApiGetPlanWithInstallmentResponseColumn=lNumPricingApiValidationTestResultColumn+3
			Boolean lIsInputPricingApiGetPlanResponseToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiValidationTestResultRow,lNumPricingApiGetPlanResponseColumn,lStrPricingApiGetPlanPriceRequest)
			if(!lIsInputPricingApiGetPlanResponseToExcelSheetDone){
				return lreturn
			}
			Boolean lIsInputPricingApiGetPlanWithInstallmentResponseToExcelSheetDone=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiValidationTestResultRow,lNumPricingApiGetPlanWithInstallmentResponseColumn,lStrPricingApiGetPlanWithInstallmentPriceRequest)
			if(!lIsInputPricingApiGetPlanWithInstallmentResponseToExcelSheetDone){
				return lreturn
			}
			lreturn=lIsPremiumMatchedValidationResultOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map getMapPricingApiGetPlanPriceResponseTotalPremium(String strPaymentFrequency,String strPricingApiGetPlanPriceResponse,String strPricingApiGetPlanWithInstallmentPriceResponse){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiGetPlanPriceTotalPremium=''
		String lStrPricingApiGetPlanWithInstallmentPriceTotalPremium=''
		Float lNumPricingApiGetPlanPriceTotalPremium=0.0
		Float lNumPricingApiGetPlanWithInstallmentPriceTotalPremium=0.0
		try{
			lreturn.put('NumPricingApiGetPlanPriceTotalPremium',lNumPricingApiGetPlanPriceTotalPremium)
			lreturn.put('NumPricingApiGetPlanWithInstallmentPriceTotalPremium',lNumPricingApiGetPlanWithInstallmentPriceTotalPremium)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strPaymentFrequency)){
				return lreturn
			}
			String lStrPaymentFrequency=strPaymentFrequency
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPaymentFrequency)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiGetPlanPriceResponse)){
				return lreturn
			}
			String lStrPricingApiGetPlanPriceResponse=strPricingApiGetPlanPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceResponse)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiGetPlanWithInstallmentPriceResponse)){
				return lreturn
			}
			String lStrPricingApiGetPlanWithInstallmentPriceResponse=strPricingApiGetPlanWithInstallmentPriceResponse
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceResponse)){
				return lreturn
			}
			Boolean lIsOK=true
			Map lMapJsonPricingApiGetPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanPriceResponse)
			Map lMapJsonPricingApiGetPlanWithInstallmentPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanWithInstallmentPriceResponse)
			List lListGetPlanPriceLoadingFactorOptionList=lMapJsonPricingApiGetPlanPriceResponse.root.quoteData.loadingFactors
			List lListGetPlanWithInstallmentPriceLoadingFactorOptionList=lMapJsonPricingApiGetPlanWithInstallmentPriceResponse.root.quoteData.loadingFactors
			for(Integer lGetPlanPriceLoadingIndex=0;lGetPlanPriceLoadingIndex<=lListGetPlanPriceLoadingFactorOptionList.size()-1;lGetPlanPriceLoadingIndex++){
				String lStrGetPlanPaymentFrequency=lListGetPlanPriceLoadingFactorOptionList.get(lGetPlanPriceLoadingIndex).Payment_Frequency
				if(lStrGetPlanPaymentFrequency==lStrPaymentFrequency){
					lStrPricingApiGetPlanPriceTotalPremium=lListGetPlanPriceLoadingFactorOptionList.get(lGetPlanPriceLoadingIndex).Total_Premium
					lNumPricingApiGetPlanPriceTotalPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiGetPlanPriceTotalPremium,0.0)
					lStrPricingApiGetPlanWithInstallmentPriceTotalPremium=lListGetPlanWithInstallmentPriceLoadingFactorOptionList[0].Total_Premium
					lNumPricingApiGetPlanWithInstallmentPriceTotalPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiGetPlanWithInstallmentPriceTotalPremium,0.0)
				}
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanPriceTotalPremium)){
				lIsOK=false
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiGetPlanWithInstallmentPriceTotalPremium)){
				lIsOK=false
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('NumPricingApiGetPlanPriceTotalPremium',lNumPricingApiGetPlanPriceTotalPremium)
				lreturn.put('NumPricingApiGetPlanWithInstallmentPriceTotalPremium',lNumPricingApiGetPlanWithInstallmentPriceTotalPremium)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPricingApiTestResultIntoExcelSheet(Sheet sheetPricingApi,String strPricingApiTargetResult,Map mapPricingApiTargetData){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiTargetResult)){
			return lreturn
		}
		String lStrPricingApiTargetResult=strPricingApiTargetResult
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiTargetResult)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiTargetData)){
			return lreturn
		}
		Map lMapPricingApiTargetData=mapPricingApiTargetData
		try{
			Integer lNumPricingApiTargetDataRow=lMapPricingApiTargetData.RowNumber
			Integer lNumPricingApiTargetDataColumn=lMapPricingApiTargetData.ColumnNumber
			Boolean lIsInputPricingApiTargetDataResultIntoTheSheetOK=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumPricingApiTargetDataRow,lNumPricingApiTargetDataColumn,lStrPricingApiTargetResult)
			lreturn=lIsInputPricingApiTargetDataResultIntoTheSheetOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map getMapPricingApiTargetPremiumValidationResultMessage(Sheet sheetPricingApi,Boolean boolIsPricingApiFlagApplyLoadingFactorOK,String strPricingApiTargetPremiumName,Map mapPricingApiTargetTransaction,String strPricingApiTargetGetPlanPricePremium,String strPricingApiTargetGetPlanWithInstallmentPricePremium){
		Map lreturn=[:]
		String lStrPricingApiGetPlanPricePremiumValidationResultMessage=''
		String lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=''
		Float lNumPricingApiTargetPremium=0.0
		Boolean lResult=false
		try{
			lreturn.put('StrPricingApiGetPlanPricePremiumValidationResultMessage',lStrPricingApiGetPlanPricePremiumValidationResultMessage)
			lreturn.put('StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage',lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage)
			lreturn.put('NumPricingApiTargetPremium',lNumPricingApiTargetPremium)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiTargetPremiumName)){
				return lreturn
			}
			String lStrPricingApiTargetPremiumName=strPricingApiTargetPremiumName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiTargetPremiumName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiTargetTransaction)){
				return lreturn
			}
			Map lMapPricingApiTargetTransaction=mapPricingApiTargetTransaction
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiTargetGetPlanPricePremium)){
				return lreturn
			}
			String lStrPricingApiTargetGetPlanPricePremium=strPricingApiTargetGetPlanPricePremium
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiTargetGetPlanPricePremium)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiTargetGetPlanWithInstallmentPricePremium)){
				return lreturn
			}
			String lStrPricingApiTargetGetPlanWithInstallmentPricePremium=strPricingApiTargetGetPlanWithInstallmentPricePremium
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiTargetGetPlanWithInstallmentPricePremium)){
				return lreturn
			}
			Boolean lIsPricingApiFlagApplyLoadingFactorOK=boolIsPricingApiFlagApplyLoadingFactorOK
			Boolean lIsPremiumMatchedValidationResultOK=true
			Integer lNumPricingApiTargetPremiumRow=lMapPricingApiTargetTransaction.RowNumber
			Integer lNumPricingApiTargetPremiumColumn=lMapPricingApiTargetTransaction.ColumnNumber
			String lStrPricingApiTargetPremium=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lNumPricingApiTargetPremiumRow,lNumPricingApiTargetPremiumColumn)
			lNumPricingApiTargetPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiTargetPremium,0.0)
			Float lNumPricingApiGetPlanWithInstallmentPriceTargetPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiTargetGetPlanWithInstallmentPricePremium,0.0)
			if(!lIsPricingApiFlagApplyLoadingFactorOK){
				Float lNumPricingApiGetPlanPriceTargetPremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiTargetGetPlanPricePremium,0.0)
				if(lNumPricingApiTargetPremium!=lNumPricingApiGetPlanPriceTargetPremium){
					lIsPremiumMatchedValidationResultOK=false
					String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('Calculation'+lStrPricingApiTargetPremiumName+lNumPricingApiTargetPremium,'GetPlanPriceApi'+lStrPricingApiTargetPremiumName+lNumPricingApiGetPlanPriceTargetPremium)
					lStrPricingApiGetPlanPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanPricePremiumValidationResultMessage,lStrMessageText)
				}
			}
			if(lNumPricingApiTargetPremium!=lNumPricingApiGetPlanWithInstallmentPriceTargetPremium){
				lIsPremiumMatchedValidationResultOK=false
				String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('Calculation'+lStrPricingApiTargetPremiumName+lNumPricingApiTargetPremium,'GetPlanWithInstallmentPriceApi'+lStrPricingApiTargetPremiumName+lNumPricingApiGetPlanWithInstallmentPriceTargetPremium)
				lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage,lStrMessageText)
			}
			lResult=lIsPremiumMatchedValidationResultOK
			lreturn.put('StrPricingApiGetPlanPricePremiumValidationResultMessage',lStrPricingApiGetPlanPricePremiumValidationResultMessage)
			lreturn.put('StrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage',lStrPricingApiGetPlanWithInstallmentPricePremiumValidationResultMessage)
			lreturn.put('NumPricingApiTargetPremium',lNumPricingApiTargetPremium)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean validatePricingApiAdditionalCoveragePremiumResult(Sheet sheetPricingApi,Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput,Map mapInputPricingApiPaymentFrequencyResult){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiPaymentFrequencyResult)){
			return lreturn
		}
		Map lMapInputPricingApiPaymentFrequencyResult=mapInputPricingApiPaymentFrequencyResult
		try{
			Boolean lIsAdditionalCoveragePremiumMatchedValidationResultOK=true
			String lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage=''
			String lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage=''
			Boolean lIsFlagApplyLoadingFactorOK=lMapInputPricingApiPaymentFrequencyResult.BoolIsPricingApiFlagApplyLoadingFactor
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiCoverageName=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageName
			List lListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading
			List lListCollectedPricingApiAdditionalCoveragePremiumWithLoading=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiAdditionalCoveragePremiumWithLoading
			List lListMapCollectedPricingApiCoverageValidationTestResult=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageValidationTestResult
			String lStrPricingApiGetPlanPriceResponse=mapPricingApiInputOutput.GetPlanPriceResponseText
			String lStrPricingApiGetPlanWithInstallmentPriceResponse=mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText
			Map lMapJsonPricingApiGetPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanPriceResponse)
			Map lMapJsonPricingApiGetPlanWithInstallmentPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanWithInstallmentPriceResponse)
			List lListGetPlanPriceCoverData=lMapJsonPricingApiGetPlanPriceResponse.root.quoteData.covers
			List lListGetPlanWithInstallmentPriceCoverData=lMapJsonPricingApiGetPlanWithInstallmentPriceResponse.root.quoteData.covers
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				List lListCurrentPricingApiCoverageName=lListCollectedPricingApiCoverageName.get(lIndex)
				Map lMapPricingApiGetPlanPriceCoverData=lListGetPlanPriceCoverData.get(lIndex)
				Map lMapPricingApiGetPlanWithInstallmentPriceCoverData=lListGetPlanWithInstallmentPriceCoverData.get(lIndex)
				List<Float> lListSelectedPricingApiAdditionalCoveragePremiumWithoutLoading=lListCollectedPricingApiAdditionalCoveragePremiumWithoutLoading.get(lIndex)
				List<Float> lListSelectedPricingApiAdditionalCoveragePremiumWithLoading=lListCollectedPricingApiAdditionalCoveragePremiumWithLoading.get(lIndex)
				Map lMapPricingApiAdditionalCoveragePremiumValidationResultMessage=lListMapCollectedPricingApiCoverageValidationTestResult.get(lIndex)
				if(lMapPricingApiGetPlanPriceCoverData.code==lStrCoverName){
					if(lListCurrentPricingApiCoverageName.size()>0){
						for(Integer lCoverageIndex=0;lCoverageIndex<=lListCurrentPricingApiCoverageName.size()-1;lCoverageIndex++){
							String lStrCoverageName=lListCurrentPricingApiCoverageName.get(lCoverageIndex)
							List lListGetPlanPriceCoverageData=lMapPricingApiGetPlanPriceCoverData.coverages
							List lListGetPlanWithInstallmentPriceCoverageData=lMapPricingApiGetPlanWithInstallmentPriceCoverData.coverages
							String lStrPricingApiGetPlanPriceResponseAdditionalCoveragePremium=this.getStringTargetCoveragePremiumFromResponse(lListGetPlanPriceCoverageData,lStrCoverageName)
							String lStrPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium=this.getStringTargetCoveragePremiumFromResponse(lListGetPlanWithInstallmentPriceCoverageData,lStrCoverageName)
							Float lNumPricingApiGetPlanPriceResponseAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiGetPlanPriceResponseAdditionalCoveragePremium,0.0)
							Float lNumPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium,0.0)
							Float lNumPricingApiAdditionalCoveragePremiumWithoutLoading=lListSelectedPricingApiAdditionalCoveragePremiumWithoutLoading.get(lCoverageIndex)
							Float lNumPricingApiAdditionalCoveragePremiumWithLoading=lListSelectedPricingApiAdditionalCoveragePremiumWithLoading.get(lCoverageIndex)
							if(!lIsFlagApplyLoadingFactorOK){
								if(lNumPricingApiAdditionalCoveragePremiumWithLoading!=lNumPricingApiGetPlanPriceResponseAdditionalCoveragePremium){
									lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
									String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lStrCoverageName+' '+lNumPricingApiAdditionalCoveragePremiumWithLoading,'GetPlanPriceAdditionalCoveragePremium'+lNumPricingApiGetPlanPriceResponseAdditionalCoveragePremium)
									lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage,lStrMessageText)
								}
							}
							if(lNumPricingApiAdditionalCoveragePremiumWithLoading!=lNumPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationAdditionalCoveragePremium'+lStrCoverageName+' '+lNumPricingApiAdditionalCoveragePremiumWithLoading,'GetPlanWithInstallmentPriceAdditionalCoveragePremium'+lNumPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium)
								lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage,lStrMessageText)
							}
						}
						if(!lIsFlagApplyLoadingFactorOK){
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage)){
								Map lMapGetPlanPricePremiumResultValidationResultMessage=lMapPricingApiAdditionalCoveragePremiumValidationResultMessage.GetPlanPriceValidationTestResult
								Integer lNumGetPlanPricePremiumResultValidationResultMessageRowNumber=lMapGetPlanPricePremiumResultValidationResultMessage.RowNumber
								Integer lNumGetPlanPricePremiumResultValidationResultMessageColumnNumber=lMapGetPlanPricePremiumResultValidationResultMessage.ColumnNumber
								Boolean lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumGetPlanPricePremiumResultValidationResultMessageRowNumber,lNumGetPlanPricePremiumResultValidationResultMessageColumnNumber,lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage)
								if(!lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK){
									return lreturn
								}
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage)){
							Map lMapGetPlanWithInstallmentPricePremiumResultValidationResultMessage=lMapPricingApiAdditionalCoveragePremiumValidationResultMessage.GetPlanWithInstallmentPriceValidationTestResult
							Integer lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageRowNumber=lMapGetPlanWithInstallmentPricePremiumResultValidationResultMessage.RowNumber
							Integer lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageColumnNumber=lMapGetPlanWithInstallmentPricePremiumResultValidationResultMessage.ColumnNumber
							Boolean lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageRowNumber,lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageColumnNumber,lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage)
							if(!lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK){
								return lreturn
							}
						}
					}
				}
			}
			lreturn=lIsAdditionalCoveragePremiumMatchedValidationResultOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean validatePricingApiLibraryAdditionalCoveragePremiumResult(Sheet sheetPricingApi,Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput,Map mapInputPricingApiLibraryGetPlanPriceResult){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapInputPricingApiLibraryGetPlanPriceResult)){
			return lreturn
		}
		Map lMapInputPricingApiLibraryGetPlanPriceResult=mapInputPricingApiLibraryGetPlanPriceResult
		try{
			Boolean lIsAdditionalCoveragePremiumMatchedValidationResultOK=true
			List lListSelectedPricingApiLibraryGetPlanPriceAdditionalCoveragePremium=new ArrayList()
			List lListSelectedPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium=new ArrayList()
			String lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage=''
			String lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage=''
			Boolean lIsFlagApplyLoadingFactorOK=lMapCollectedPricingApiDetailResult.BoolIsPricingApiFlagApplyLoadingFactor
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiCoverageName=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageName
			List lListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium=lMapInputPricingApiLibraryGetPlanPriceResult.ListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium
			List lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium=lMapInputPricingApiLibraryGetPlanPriceResult.ListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium
			List lListMapCollectedPricingApiCoverageValidationTestResult=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageValidationTestResult
			String lStrPricingApiGetPlanPriceResponse=mapPricingApiInputOutput.GetPlanPriceResponseText
			String lStrPricingApiGetPlanWithInstallmentPriceResponse=mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText
			Map lMapJsonPricingApiGetPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanPriceResponse)
			Map lMapJsonPricingApiGetPlanWithInstallmentPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanWithInstallmentPriceResponse)
			List lListGetPlanPriceCoverData=lMapJsonPricingApiGetPlanPriceResponse.root.quoteData.covers
			List lListGetPlanWithInstallmentPriceCoverData=lMapJsonPricingApiGetPlanWithInstallmentPriceResponse.root.quoteData.covers
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				List lListCurrentPricingApiCoverageName=lListCollectedPricingApiCoverageName.get(lIndex)
				Map lMapPricingApiGetPlanPriceCoverData=lListGetPlanPriceCoverData.get(lIndex)
				Map lMapPricingApiGetPlanWithInstallmentPriceCoverData=lListGetPlanWithInstallmentPriceCoverData.get(lIndex)
				if(!lIsFlagApplyLoadingFactorOK){
					lListSelectedPricingApiLibraryGetPlanPriceAdditionalCoveragePremium=lListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium.get(lIndex)
				}
				if(lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium.size()>0){
					lListSelectedPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium=lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium.get(lIndex)
				}
				Map lMapPricingApiAdditionalCoveragePremiumValidationResultMessage=lListMapCollectedPricingApiCoverageValidationTestResult.get(lIndex)
				if(lMapPricingApiGetPlanPriceCoverData.code==lStrCoverName){
					if(lListCurrentPricingApiCoverageName.size()>0){
						for(Integer lCoverageIndex=0;lCoverageIndex<=lListCurrentPricingApiCoverageName.size()-1;lCoverageIndex++){
							String lStrCoverageName=lListCurrentPricingApiCoverageName.get(lCoverageIndex)
							List lListGetPlanPriceCoverageData=lMapPricingApiGetPlanPriceCoverData.coverages
							List lListGetPlanWithInstallmentPriceCoverageData=lMapPricingApiGetPlanWithInstallmentPriceCoverData.coverages
							String lStrPricingApiGetPlanPriceResponseAdditionalCoveragePremium=this.getStringTargetCoveragePremiumFromResponse(lListGetPlanPriceCoverageData,lStrCoverageName)
							String lStrPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium=this.getStringTargetCoveragePremiumFromResponse(lListGetPlanWithInstallmentPriceCoverageData,lStrCoverageName)
							Float lNumPricingApiGetPlanPriceResponseAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiGetPlanPriceResponseAdditionalCoveragePremium,0.0)
							Float lNumPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium,0.0)
							String lStrPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium=lListSelectedPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium.get(lCoverageIndex)
							Float lNumPricingApiGetPlanPriceWithInstallmentAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium,0.0)
							if(!lIsFlagApplyLoadingFactorOK){
								String lStrPricingApiLibraryGetPlanPriceAdditionalCoveragePremium=lListSelectedPricingApiLibraryGetPlanPriceAdditionalCoveragePremium.get(lCoverageIndex)
								Float lNumPricingApiGetPlanPriceAdditionalCoveragePremium=IGNUemaHelper.convertStringToFloat(lStrPricingApiLibraryGetPlanPriceAdditionalCoveragePremium,0.0)
								if(lNumPricingApiGetPlanPriceAdditionalCoveragePremium!=lNumPricingApiGetPlanPriceResponseAdditionalCoveragePremium){
									lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
									String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanPriceLibraryAdditionalCoveragePremium'+lStrCoverageName+' '+lNumPricingApiGetPlanPriceAdditionalCoveragePremium,'GetPlanPriceAdditionalCoveragePremium'+lNumPricingApiGetPlanPriceResponseAdditionalCoveragePremium)
									lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage,lStrMessageText)
								}
							}
							if(lNumPricingApiGetPlanPriceWithInstallmentAdditionalCoveragePremium!=lNumPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium){
								lIsAdditionalCoveragePremiumMatchedValidationResultOK=false
								String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('LibraryGetPlanPriceWithInstallmentLibraryAdditionalCoveragePremium'+lStrCoverageName+' '+lNumPricingApiGetPlanPriceWithInstallmentAdditionalCoveragePremium,'GetPlanWithInstallmentPriceAdditionalCoveragePremium'+lNumPricingApiGetPlanWithInstallmentPriceResponseAdditionalCoveragePremium)
								lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage,lStrMessageText)
							}
						}
						if(!lIsFlagApplyLoadingFactorOK){
							if(!IGNUemaHelper.checkObjectEmptyOfString(lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage)){
								Map lMapGetPlanPricePremiumResultValidationResultMessage=lMapPricingApiAdditionalCoveragePremiumValidationResultMessage.LibraryGetPlanWithPriceValidationTestResult
								Integer lNumGetPlanPricePremiumResultValidationResultMessageRowNumber=lMapGetPlanPricePremiumResultValidationResultMessage.RowNumber
								Integer lNumGetPlanPricePremiumResultValidationResultMessageColumnNumber=lMapGetPlanPricePremiumResultValidationResultMessage.ColumnNumber
								Boolean lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumGetPlanPricePremiumResultValidationResultMessageRowNumber,lNumGetPlanPricePremiumResultValidationResultMessageColumnNumber,lStrGetPlanPriceAdditionalCoveragePremiumValidationResultMessage)
								if(!lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK){
									return lreturn
								}
							}
						}
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage)){
							Map lMapGetPlanWithInstallmentPricePremiumResultValidationResultMessage=lMapPricingApiAdditionalCoveragePremiumValidationResultMessage.LibraryGetPlanWithInstallmentPriceValidationTestResult
							Integer lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageRowNumber=lMapGetPlanWithInstallmentPricePremiumResultValidationResultMessage.RowNumber
							Integer lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageColumnNumber=lMapGetPlanWithInstallmentPricePremiumResultValidationResultMessage.ColumnNumber
							Boolean lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageRowNumber,lNumGetPlanWithInstallmentPricePremiumResultValidationResultMessageColumnNumber,lStrGetPlanWithInstallmentPriceAdditionalCoveragePremiumValidationResultMessage)
							if(!lIsInputGetPlanWithPremiumResultValidationResultMessageIntoTheSheetOK){
								return lreturn
							}
						}
					}
				}
			}
			lreturn=lIsAdditionalCoveragePremiumMatchedValidationResultOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String  getStringTargetCoveragePremiumFromResponse(List listPricingApiGetPlanPriceCoverageData,String strPricingApiCoverageName){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfList(listPricingApiGetPlanPriceCoverageData)){
			return lreturn
		}
		List lListPricingApiGetPlanPriceCoverageData=listPricingApiGetPlanPriceCoverageData
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiCoverageName)){
			return lreturn
		}
		String lStrPricingApiCoverageName=strPricingApiCoverageName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverageName)){
			return lreturn
		}
		try{
			Map lMapPricingApiGetPlanPriceTargetCoverageData=[:]
			for(Integer lIndex=0;lIndex<=lListPricingApiGetPlanPriceCoverageData.size()-1;lIndex++){
				Map lMapPricingApiGetPlanPriceCoverageData=lListPricingApiGetPlanPriceCoverageData.get(lIndex)
				String lStrPricingApiCoverageCode=lMapPricingApiGetPlanPriceCoverageData.additionalCoverageCode
				if(lStrPricingApiCoverageCode==lStrPricingApiCoverageName){
					lreturn=lMapPricingApiGetPlanPriceCoverageData.additionalCoveragePremium
					return lreturn
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map validateGetPlanWithInstallmentTotalDownPaymentAndInstallmentAmount(Map mapPricingApiTotalInstallmentAndDownPaymentAmount,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=''
		String lStrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=''
		String lStrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage=''
		Float  lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount=0.0
		Float lNumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount=0.0
		try{
			lreturn.put('StrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage',lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
			lreturn.put('StrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage',lStrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
			lreturn.put('StrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage',lStrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage)
			lreturn.put('NumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount',lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount)
			lreturn.put('NumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount',lNumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiTotalInstallmentAndDownPaymentAmount)){
				return lreturn
			}
			Map lMapPricingApiTotalInstallmentAndDownPaymentAmount=mapPricingApiTotalInstallmentAndDownPaymentAmount
			Integer lNumTotalInstallmentAmount=lMapPricingApiTotalInstallmentAndDownPaymentAmount.NumTotalInstallmentAmount
			Integer lNumTotalDownPayment=lMapPricingApiTotalInstallmentAndDownPaymentAmount.NumTotalDownPayment
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			Map lMapPricingApiInputOutput=mapPricingApiInputOutput
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			String lStrPricingApiQuoteRequiredTransactionType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			String lStrPricingApiGetPlanWithInstallmentPriceResponse=mapPricingApiInputOutput.GetPlanWithInstallmentPriceResponseText
			Map lMapJsonPricingApiGetPlanWithInstallmentPriceResponse=new JsonSlurper().parseText(lStrPricingApiGetPlanWithInstallmentPriceResponse)
			Map lMapPricingApiGetPlanWithInstallmentPaymentData=lMapJsonPricingApiGetPlanWithInstallmentPriceResponse.root.quoteData.paymentData
			List lListPricingApiGetPlanWithInstallmentPaymentDetail=lMapPricingApiGetPlanWithInstallmentPaymentData.paymentDetailsData
			if(lStrPricingApiQuoteRequiredTransactionType=='New Biz'){
				Map lMapPricingApiGetPlanWithInstallmentPaymentDetail=lListPricingApiGetPlanWithInstallmentPaymentDetail.get(0)
				String lStrInstallmentAmount=lMapPricingApiGetPlanWithInstallmentPaymentDetail.amount
				Integer lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount=IGNUemaHelper.convertStringToInteger(lStrInstallmentAmount,0)
				if(lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount!=lNumTotalInstallmentAmount){
					String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalInstallmentAmount'+lNumTotalInstallmentAmount,'GetPlanWithInstallmentAmount'+lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount)
					lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage,lStrMessageText)
				}
				if(lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount!=lNumTotalDownPayment){
					String lStrMessageText=IGNUemaHelper.concatMessageLeftRightByPipe('CalculationTotalDownPayment'+lNumTotalDownPayment,'GetPlanWithInstallmentAmount'+lNumPricingApiGetPlanWithInstallmentPriceInstallmentAmount)
					lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage,lStrMessageText)
				}
			}
			for(Integer lPaymentIndex=0;lPaymentIndex<=lListPricingApiGetPlanWithInstallmentPaymentDetail.size()-1;lPaymentIndex++){
				Map lMapPricingApiGetPlanWithInstallmentPaymentDetail=lListPricingApiGetPlanWithInstallmentPaymentDetail.get(lPaymentIndex)
				String lStrInstallmentAmount=lMapPricingApiGetPlanWithInstallmentPaymentDetail.amount
				Integer lNumInstallmentAmount=IGNUemaHelper.convertStringToInteger(lStrInstallmentAmount,0)
				lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount=lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount+lNumInstallmentAmount
			}
			lResult=lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount>=0
			if(lResult){
				lreturn.put('StrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage',lStrPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
				lreturn.put('StrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage',lStrLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAndDownPaymentAmountValidationMessage)
				lreturn.put('StrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage',lStrLibraryPricingApiGetPlanPriceInstallmentAndDownPaymentAmountValidationMessage)
				lreturn.put('NumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount',lNumPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount)
				lreturn.put('NumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount',lNumLibraryPricingApiGetPlanWithInstallmentPriceTotalInstallmentAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase,Boolean isOKValidateAdditionalCoveragePremium,Boolean isOKValidateTotalPremium,Boolean isOKValidateLibraryAdditionalCoverage,Boolean isOKValidateLibraryTotalPremium){
		Map lreturn=[:]
		String lStrActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			Boolean lIsOK=true
			lIsOK=isOKValidateAdditionalCoveragePremium&&isOKValidateTotalPremium&&isOKValidateLibraryAdditionalCoverage&&isOKValidateLibraryTotalPremium
			if(isPositiveCase){
				lIsActualResult=lIsOK
			}else{
				lIsActualResult=!lIsOK
			}
			lStrActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			lResult=lStrActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lStrActualResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputResultMessage(String strActualResult){
		Map lreturn=[:]
		String lStrActualResult=strActualResult.trim()
		String lStrResultMessage=''
		try{
			Boolean lResult=false
			String lStrMessage=''
			lreturn.put('ResultMessage',lStrResultMessage)
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lStrActualResult)
			if(lIsActualResult){
				lStrMessage='Pricing Api have successfully retreived all the Possible Plan List'
			}else{
				lStrMessage='Pricing Api have been failed to retreive the Possible Plan List'
			}
			lStrResultMessage=lStrMessage
			lResult=lStrResultMessage.length()>0
			if(lResult){
				lreturn.put('ResultMessage',lStrResultMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public void inputGenericResultMessageA(String strVerifyApiResult){
		String lreturn=''
		String lStrVerifyApiResult=strVerifyApiResult.trim()
		try{
			String lStrMessage=''
			Boolean lIsCheckVerifyApiResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(lStrVerifyApiResult)
			if(lIsCheckVerifyApiResultEmpty){
				lStrMessage='The Api have been Successfully verified against the Positive Response'
			}
			else if(lStrVerifyApiResult.contains('ResponseErrorValidation')){
				lStrMessage='The Api have been Successfully verified the Error Message against the Negative Response'
			}
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public String inputGenericResultMessageB(String strVerifyApiResult,Integer statusCode){
		String lreturn=''
		Boolean lResult=false
		String lStrVerifyApiResult=strVerifyApiResult.trim()
		try{
			String lStrMessage=''
			String lStrText=''
			String lStrStatusCodeText=statusCode.toString()
			if(lStrVerifyApiResult.contains('StatusCodeFailed')){
				switch(lStrStatusCodeText){
					case '400':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Bad Request')
						break
					case '401':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'UnAuthorizedResponse')
						break
					case '403':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Forbidden Response')
						break
					case '404':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Response Not Found')
						break
					case '407':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Proxy Authentication Required')
						break
					case '408':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Request Time Out')
						break
					case '500':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Internal server Error')
						break
					case '502':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Bad Gateway Error')
						break
					case '504':
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Gateway Timeout Error')
						break
					default:
						lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,lStrStatusCodeText+'-'+'Anonymous Response')
						break
				}
			}
			else if(lStrVerifyApiResult.contains('ResponseValidationFailed')){
				lStrMessage='Failed in Response Validation'
			}
			lResult=lStrMessage.length()>0
			if(lResult){
				lreturn=lStrMessage
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputGenericResultMessageC(List<String> arrayOfQuoteApiStatusList){
		String lreturn=''
		Boolean lResult=false
		try{
			String lStrMessage=''
			List<String> lSortedQuoteApiStatusList=arrayOfQuoteApiStatusList.sort()
			List<String> lErrorMessageCodeList=[
				'StatusCode',
				'ResponseValidation'
			]
			List<String> lListSortedErrorMessageCode=lErrorMessageCodeList.sort()
			List<String> lListPossibleErrorMessageCode=[]
			Map lMapPossibleErrorMessageCodeList=this.getPossibleSequenceOfList(lListSortedErrorMessageCode)
			if(lMapPossibleErrorMessageCodeList.Result){
				lListPossibleErrorMessageCode=lMapPossibleErrorMessageCodeList.PossibleSequenceList
			}
			Integer lNumResultMessageType=lListPossibleErrorMessageCode.indexOf(lSortedQuoteApiStatusList)
			switch(lNumResultMessageType){
				case '0':
					lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,'Api have Failed in Response Validation ')
					break
				case '1':
					lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,'Api have Failed in Response & StatusCodeValidation ')
					break
				case '2':
					lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,'Api have Failed in ResponseValidation')
					break
				default:
					lStrMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lStrMessage,'Api have been Successfully Verified')
					break
			}
			lResult=lStrMessage.length()>1
			if(lResult){
				lreturn=lStrMessage
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map getPossibleSequenceOfList(List<String> targetList){
		Map lreturn=[:]
		ArrayList<String> lListPossibleSequence=new ArrayList<String>()
		try{
			Boolean lResult=false
			lreturn.put("Result",lResult)
			lreturn.put("PossibleSequenceList",lListPossibleSequence)
			if(!targetList){
			}else{
				if(targetList.size()>0){
					lListPossibleSequence=targetList.subsequences()
				}
			}
			lResult=lListPossibleSequence.size()>=0
			if(lResult){
				lreturn.put("Result",lResult)
				lreturn.put("PossibleSequenceList",lListPossibleSequence)
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
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		try{
			String lStrMultiplePlanPriceRequestText=lMapPricingApiInputOutput.MultiplePlanPriceRequestText
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateMultiplePlanPriceRequestText=lStrMultiplePlanPriceRequestText
			String lStrQuotePolicyStartDate=lMapPricingApiInputOutput.QuotePolicyStartDate
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateQuotePolicyStartDate=lStrQuotePolicyStartDate
			String lStrQuotePolicyEndDate=lMapPricingApiInputOutput.QuotePolicyEndDate
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateQuotePolicyEndDate=lStrQuotePolicyEndDate
			String lStrQuotePolicyEndorsementEffectiveDate=lMapPricingApiInputOutput.QuotePolicyEndorsementEffectiveDate
			this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiGenerateQuotePolicyEndorsementEffectiveDate=lStrQuotePolicyEndorsementEffectiveDate
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}