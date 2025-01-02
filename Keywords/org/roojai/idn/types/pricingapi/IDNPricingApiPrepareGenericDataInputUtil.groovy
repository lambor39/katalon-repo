package org.roojai.idn.types.pricingapi
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.google.common.base.Splitter
import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table
import com.google.gson.JsonObject
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
import internal.GlobalVariable
import java.util.Collections
import org.apache.poi.ss.*
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.util.*
import org.apache.poi.xssf.usermodel.*
import org.json.*
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.idn.types.pricingapi.IDNPricingApiGetPriceListMainUtil
import org.roojai.idn.types.pricingapi.IDNPricingApiPrepareGenericDataInputUtil
import org.roojai.idn.core.IDNUemaHelper as IDNUemaHelper
public class IDNPricingApiPrepareGenericDataInputUtil{
	public IDNPricingApiPrepareGenericDataInputUtil(){
		super()
	}
	private static IDNPricingApiGetPriceListMainUtil lIDNPricingApiGetPriceListUtil=null
	private IDNPricingApiGetPriceListMainUtil getlIDNPricingApiGetPriceListUtil(){
		return this.lIDNPricingApiGetPriceListUtil
	}
	private void setlIDNPricingApiGetPriceListUtil(IDNPricingApiGetPriceListMainUtil newlIDNPricingApiGetPriceListUtil){
		//Do Nothing
	}

	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER='Data Files/ZPrepareHere/Ignite/IDN/Excel_IgniteUniversalTestData_UserDataPricingAPIAll.xlsx'
	public static final String CURRENT_TEST_IGN_LIBRARY_HOST_URL='http://localhost:5173/'
	public  Boolean inputGenericPricingApiDataToUserDataSheet(){
		String lResult=''
		Boolean lreturn=false
		String lPath='Data Files/Release_UAT/Roojai/IDN/'
		List<String> lListPricingApiFile=IDNPricingApiHelper.getPricingApiFileList(lPath)
		List<String> lListPricingApiExcelFile=[]
		List<String> lListPricingApiMacroFile=[]
		Map lMapPricingApiSourceFileResult=IDNPricingApiHelper.getMapPricingApiSourceFileList(lListPricingApiFile)
		if(!lMapPricingApiSourceFileResult.Result){
			return lreturn
		}
		lListPricingApiExcelFile=lMapPricingApiSourceFileResult.ListExcelGenericFile
		lListPricingApiMacroFile=lMapPricingApiSourceFileResult.ListMacroGenericFile
		try{
			for(Integer lMainIndex=0;lMainIndex<=lListPricingApiExcelFile.size()-1;lMainIndex++){
				String lStrExcelFileName=lListPricingApiExcelFile.get(lMainIndex)
				Workbook lWorkBookExcelFileGenericTestData=null
				Sheet lSheetPricingApi=null
				lWorkBookExcelFileGenericTestData=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(lStrExcelFileName)
				lSheetPricingApi=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lWorkBookExcelFileGenericTestData,'PricingAPI')
				if(!IGNUemaHelper.checkObjectNullOfObject(lWorkBookExcelFileGenericTestData)){
					if(IGNUemaHelper.checkObjectNullOfObject(lSheetPricingApi)){
						return lreturn
					}
					Integer lNumUserDataSheetLastRow=lSheetPricingApi.getLastRowNum()
					Integer lNumLastRow=lSheetPricingApi.getLastRowNum()
					if(lNumLastRow>2){
						Workbook lWorkBookExcelFileUserTestData=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER)
						Sheet lSheetUserData=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lWorkBookExcelFileUserTestData,'UserDataPricingAPIAll')
						Integer lNumPricingApiSheetFirstRow=lSheetPricingApi.getFirstRowNum()
						Row lRowPricingApiSheetFirst=lSheetPricingApi.getRow(lNumPricingApiSheetFirstRow)
						String lStrProductVariable=''
						String lStrProductName=''
						Map lMapPricingApiProductTypeAndNameResult=this.getMapPricingApiProductTypeAndValueFromExcelSheet(lRowPricingApiSheetFirst)
						if(!lMapPricingApiProductTypeAndNameResult.Result){
							return lreturn
						}
						lStrProductVariable=lMapPricingApiProductTypeAndNameResult.StrProductType
						lStrProductName=lMapPricingApiProductTypeAndNameResult.StrProductName
						Map lMapPricingApiMergeCellRangeAddressListResult=this.getMapPricingApiMergeCellRangeAddressList(lSheetPricingApi,lStrProductName)
						Map lMapPricingApiPrepareJsonInputFromExcelSheetResult=this.getMapPricingApiPrepareJsonInputFromExcelSheet(lWorkBookExcelFileGenericTestData,lSheetPricingApi,lMapPricingApiMergeCellRangeAddressListResult)
						if(!lMapPricingApiPrepareJsonInputFromExcelSheetResult.Result){
							return lreturn
						}
						Boolean lIsWriteOutputResultDone=IGNUemaHelper.saveExcelWorkbookByFileName(lStrExcelFileName,lWorkBookExcelFileGenericTestData)
						if(!lIsWriteOutputResultDone){
							return lreturn
						}
						if(IGNUemaHelper.checkObjectNullOfObject(lWorkBookExcelFileUserTestData)){
							return lreturn
						}
						if(IGNUemaHelper.checkObjectNullOfObject(lSheetUserData)){
							return lreturn
						}
						Boolean lIsPricingApiInputDataToUserExcelSheetOK=this.inputPricingApiInputDataToUserExcelSheet(lWorkBookExcelFileUserTestData,lSheetUserData,lMapPricingApiPrepareJsonInputFromExcelSheetResult)
						ExcelKeywords.saveWorkbook(this.CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER,lWorkBookExcelFileUserTestData)
					}
				}
			}
			lResult='Generic Test Data has been Transformed successfully'
			lreturn=lResult.length()>0
			return lreturn
		}catch(Exception e){
		}
		return lreturn
	}
	public static Integer getNumUserDataSheetLastDataEntry(Sheet sheetUserData){
		Boolean lResult=false
		Integer lreturn=0
		if(IGNUemaHelper.checkObjectNullOfObject(sheetUserData)){
			return lreturn
		}
		Sheet lSheetUserData=sheetUserData
		try{
			Integer lNumUserDataSheetFirstRow=lSheetUserData.getFirstRowNum()
			Integer lNumUserDataSheetLastRow=lSheetUserData.getLastRowNum()
			Row lRowUserSheetDataFirst=lSheetUserData.getRow(lNumUserDataSheetFirstRow)
			Integer lNumUserDataSheetRow=lRowUserSheetDataFirst.rowNum
			Integer lNumUserDataSheetLastColumn=lRowUserSheetDataFirst.getLastCellNum()
			Integer lNumUserDatalastEntryIndex=0
			for(Integer lIndex=0;lIndex<lNumUserDataSheetLastColumn;lIndex++){
				Cell lCellCurrent=ExcelKeywords.getCellByIndex(lSheetUserData,lNumUserDataSheetRow,lIndex)
				String lStrCellCurrentValue=lCellCurrent.getStringCellValue()
				Integer lNumColumnIndex=lCellCurrent.getColumnIndex()
				if(lStrCellCurrentValue=='PricingApiJsonRootQuotationInputPartOne'){
					for(Integer lInputIndex=1;lInputIndex<=lNumUserDataSheetLastRow;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lInputIndex)
						Integer lNumRowInputIndex=lRowInput.rowNum
						String lStrCellvalue=ExcelKeywords.getCellValueByIndex(lSheetUserData,lNumRowInputIndex,lNumColumnIndex)
						if(lStrCellvalue.isEmpty()){
							lNumUserDatalastEntryIndex=lInputIndex
							break
						}
					}
				}
			}
			lResult=lNumUserDatalastEntryIndex>0
			if(lResult){
				lreturn=lNumUserDatalastEntryIndex
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static String getNumUserDataSheetFirstTestCase(Sheet sheetUserData,Integer numUserDatalastEntryIndex){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetUserData)){
			return lreturn
		}
		Sheet lSheetUserData=sheetUserData
		Integer lNumUserDatalastEntryIndex=numUserDatalastEntryIndex
		try{
			Integer lNumUserDataSheetFirstRow=lSheetUserData.getFirstRowNum()
			Row lRowUserSheetDataFirst=lSheetUserData.getRow(lNumUserDataSheetFirstRow)
			Integer lNumUserDataSheetRow=lRowUserSheetDataFirst.rowNum
			Integer lNumUserDataSheetLastColumn=lRowUserSheetDataFirst.getLastCellNum()
			String lStrTestCaseNumber=''
			for(Integer lIndex=0;lIndex<lNumUserDataSheetLastColumn;lIndex++){
				Cell lCellCurrent=ExcelKeywords.getCellByIndex(lSheetUserData,lNumUserDataSheetRow,lIndex)
				String lStrCellValue=lCellCurrent.getStringCellValue()
				Integer lNumColumnIndex=lCellCurrent.getColumnIndex()
				Integer lNumTestCaseIndex=lNumUserDatalastEntryIndex
				if(lStrCellValue=='Test_Case_No'){
					Row lRowInput=lSheetUserData.getRow(lNumUserDatalastEntryIndex)
					Integer lNumRowIndex=lRowInput.rowNum
					lStrTestCaseNumber=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetUserData,lNumRowIndex,lNumColumnIndex)
					lNumUserDatalastEntryIndex=lNumUserDatalastEntryIndex+1
				}
			}
			lResult=lStrTestCaseNumber.length()>0
			if(lResult){
				lreturn=lStrTestCaseNumber
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static List getListPricingApiMergeCellSubHeader(Sheet sheetPricingApi,CellRangeAddress cellRangeAddressTargetHeader,Row rowSubHeader){
		List lreturn=[]
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
			return lreturn
		}
		Sheet lSheetPricingApi=sheetPricingApi
		if(IGNUemaHelper.checkObjectNullOfObject(cellRangeAddressTargetHeader)){
			return lreturn
		}
		CellRangeAddress lCellRangeAddressTargetHeader=cellRangeAddressTargetHeader
		Row lRowSubHeader=rowSubHeader
		List lListTargetSubHeader=new ArrayList<>()
		try{
			Integer lNumCellRangeAddressTargetHeaderColumnLast=lCellRangeAddressTargetHeader.getLastColumn()-lCellRangeAddressTargetHeader.getFirstColumn()
			Map lMapTargetHeaderSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressTargetHeader,lRowSubHeader,lNumCellRangeAddressTargetHeaderColumnLast,false)
			if(lMapTargetHeaderSubHeaderList.Result){
				lListTargetSubHeader=lMapTargetHeaderSubHeaderList.CellValueList
			}
			lResult=lListTargetSubHeader.size()>0
			if(lResult){
				lreturn=lListTargetSubHeader
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map getMapPricingApiMergeCellRangeAddressList(Sheet sheetPricingApi,String strProductName){
		Boolean lResult=false
		Map lreturn=[:]
		CellRangeAddress lCellRangeAddressQuotationInput=null
		CellRangeAddress lCellRangeAddressPlanOption=null
		CellRangeAddress lCellRangeAddressMultiCover=null
		CellRangeAddress lCellRangeAddressAdditionalCoverage=null
		CellRangeAddress lCellRangeAddressOptionalData=null
		CellRangeAddress lCellRangeAddressInputPremium=null
		CellRangeAddress lCellRangeAddressPayment=null
		CellRangeAddress lCellRangeAddressTransaction=null
		CellRangeAddress lCellRangeAddressPremium=null
		CellRangeAddress lCellRangeAddressVehicleData=null
		CellRangeAddress lCellRangeAddressInsuredData=null
		CellRangeAddress lCellRangeAddressPolicyHolderData=null
		Integer lNumCellRangeAddressQuotationInputColumnLast=0
		Integer lNumCellRangeAddressPlanOptionColumnLast=0
		Integer lNumCellRangeAddressMultiCoverColumnLast=0
		Integer lNumCellRangeAddressAdditionalCoverageColumnLast=0
		Integer lNumCellRangeAddressOptionalDataColumnLast=0
		Integer lNumCellRangeAddressInputPremiumColumnLast=0
		Integer lNumCellRangeAddressPaymentColumnLast=0
		Integer lNumCellRangeAddressTransactionColumnLast=0
		Integer lNumCellRangeAddressPremiumColumnLast=0
		Integer lNumCellRangeAddressVehicleDataColumnLast=0
		Integer lNumCellRangeAddressInsuredDataColumnLast=0
		Integer lNumCellRangeAddressPolicyHolderDataColumnLast=0
		List<String> lListQuotationInputSubHeader=new ArrayList<String>()
		List<String> lListPlanOptionSubHeader=new ArrayList<String>()
		List<String> lListMultiCoverSubHeader=new ArrayList<String>()
		List<String> lListAdditionalCoverageSubHeader=new ArrayList<String>()
		List<String> lListOptionalDataSubHeader=new ArrayList<String>()
		List<String> lListInputPremiumSubHeader=new ArrayList<String>()
		List<String> lListPaymentSubHeader=new ArrayList<String>()
		List<String> lListTransactionSubHeader=new ArrayList<String>()
		List<String> lListPremiumSubHeader=new ArrayList<String>()
		List<String> lListVehicleDataSubHeader=new ArrayList<String>()
		List<String> lListInsuredDataSubHeader=new ArrayList<String>()
		List<String> lListPolicyHolderDataSubHeader=new ArrayList<String>()
		String lStrOptionalDataParameterName=''
		Boolean lIsOK=true
		try{
			lreturn.put('Result',lResult)
			lreturn.put('CellRangeAddressQuotationInput',lCellRangeAddressQuotationInput)
			lreturn.put('CellRangeAddressPlanOption',lCellRangeAddressPlanOption)
			lreturn.put('CellRangeAddressMultiCover',lCellRangeAddressMultiCover)
			lreturn.put('CellRangeAddressAdditionalCoverage',lCellRangeAddressAdditionalCoverage)
			lreturn.put('CellRangeAddressOptionalData',lCellRangeAddressOptionalData)
			lreturn.put('CellRangeAddressInputPremium',lCellRangeAddressInputPremium)
			lreturn.put('CellRangeAddressPayment',lCellRangeAddressPayment)
			lreturn.put('CellRangeAddressTransaction',lCellRangeAddressTransaction)
			lreturn.put('CellRangeAddressPremium',lCellRangeAddressPremium)
			lreturn.put('CellRangeAddressVehicleData',lCellRangeAddressVehicleData)
			lreturn.put('CellRangeAddressInsuredData',lCellRangeAddressInsuredData)
			lreturn.put('CellRangeAddressPolicyHolderData',lCellRangeAddressPolicyHolderData)
			lreturn.put('NumCellRangeAddressQuotationInputColumnLast',lNumCellRangeAddressQuotationInputColumnLast)
			lreturn.put('NumCellRangeAddressPlanOptionColumnLast',lNumCellRangeAddressPlanOptionColumnLast)
			lreturn.put('NumCellRangeAddressMultiCoverColumnLast',lNumCellRangeAddressMultiCoverColumnLast)
			lreturn.put('NumCellRangeAddressAdditionalCoverageColumnLast',lNumCellRangeAddressAdditionalCoverageColumnLast)
			lreturn.put('NumCellRangeAddressOptionalDataColumnLast',lNumCellRangeAddressOptionalDataColumnLast)
			lreturn.put('NumCellRangeAddressInputPremiumColumnLast',lNumCellRangeAddressInputPremiumColumnLast)
			lreturn.put('NumCellRangeAddressPaymentColumnLast',lNumCellRangeAddressPaymentColumnLast)
			lreturn.put('NumCellRangeAddressTransactionColumnLast',lNumCellRangeAddressTransactionColumnLast)
			lreturn.put('NumCellRangeAddressPremiumColumnLast',lNumCellRangeAddressPremiumColumnLast)
			lreturn.put('NumCellRangeAddressVehicleDataColumnLast',lNumCellRangeAddressVehicleDataColumnLast)
			lreturn.put('NumCellRangeAddressInsuredDataColumnLast',lNumCellRangeAddressInsuredDataColumnLast)
			lreturn.put('NumCellRangeAddressPolicyHolderDataColumnLast',lNumCellRangeAddressPolicyHolderDataColumnLast)
			lreturn.put('ListQuotationInputSubHeader',lListQuotationInputSubHeader)
			lreturn.put('ListPlanOptionSubHeader',lListPlanOptionSubHeader)
			lreturn.put('ListMultiCoverSubHeader',lListMultiCoverSubHeader)
			lreturn.put('ListAdditionalCoverageSubHeader',lListAdditionalCoverageSubHeader)
			lreturn.put('ListOptionalDataSubHeader',lListOptionalDataSubHeader)
			lreturn.put('ListInputPremiumSubHeader',lListInputPremiumSubHeader)
			lreturn.put('ListPaymentSubHeader',lListPaymentSubHeader)
			lreturn.put('ListTransactionSubHeader',lListTransactionSubHeader)
			lreturn.put('ListPremiumSubHeader',lListPremiumSubHeader)
			lreturn.put('ListVehicleDataSubHeader',lListVehicleDataSubHeader)
			lreturn.put('ListInsuredDataSubHeader',lListInsuredDataSubHeader)
			lreturn.put('ListPolicyHolderDataSubHeader',lListPolicyHolderDataSubHeader)
			lreturn.put('StrOptionalDataParameterName',lStrOptionalDataParameterName)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(strProductName)){
				return lreturn
			}
			String lStrProductName=strProductName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrProductName)){
				return lreturn
			}
			Integer lNumGenericTestDataCellMergeList=lSheetPricingApi.getNumMergedRegions()
			CellRangeAddress[] lCellRangeAddressMergedList=new CellRangeAddress[lNumGenericTestDataCellMergeList]
			for(Integer lIndex=0;lIndex<lCellRangeAddressMergedList.length;lIndex++){
				lCellRangeAddressMergedList[lIndex]=lSheetPricingApi.getMergedRegion(lIndex)
			}
			for(Integer lIndex=0;lIndex<lNumGenericTestDataCellMergeList;lIndex++){
				Row lRowCurrent=lSheetPricingApi.getRow(lCellRangeAddressMergedList[lIndex].getFirstRow())
				Cell lCell=lRowCurrent.getCell(lCellRangeAddressMergedList[lIndex].getFirstColumn())
				String lStrCellRangeAddressHeading=lCell.getStringCellValue()
				if(lStrCellRangeAddressHeading=='QuotationInput'){
					lCellRangeAddressQuotationInput=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='VehicleAccessories'){
					lStrOptionalDataParameterName=lStrCellRangeAddressHeading
					lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='HealthQuestion'){
					lStrOptionalDataParameterName=lStrCellRangeAddressHeading
					lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='NamedDriver'){
					lStrOptionalDataParameterName=lStrCellRangeAddressHeading
					lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='PlanOption'){
					lCellRangeAddressPlanOption=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='MultiCover'){
					lCellRangeAddressMultiCover=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='AdditionalCoverage'){
					lCellRangeAddressAdditionalCoverage=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='InputPremium'){
					lCellRangeAddressInputPremium=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='Payment'){
					lCellRangeAddressPayment=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='Transaction'){
					lCellRangeAddressTransaction=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='Premium'){
					lCellRangeAddressPremium=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='VehicleData'){
					lCellRangeAddressVehicleData=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='InsuredData'){
					lCellRangeAddressInsuredData=lCellRangeAddressMergedList[lIndex]
				}
				if(lStrCellRangeAddressHeading=='PolicyHolderData'){
					lCellRangeAddressPolicyHolderData=lCellRangeAddressMergedList[lIndex]
				}
			}
			Row lRowSubHeader=lSheetPricingApi.getRow(lCellRangeAddressMergedList[0].getFirstRow()+1)
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressQuotationInput)){
				lListQuotationInputSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressQuotationInput,lRowSubHeader)
				lNumCellRangeAddressQuotationInputColumnLast=lCellRangeAddressQuotationInput.getLastColumn()-lCellRangeAddressQuotationInput.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressPlanOption)){
				lListPlanOptionSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressPlanOption,lRowSubHeader)
				lNumCellRangeAddressPlanOptionColumnLast=lCellRangeAddressPlanOption.getLastColumn()-lCellRangeAddressPlanOption.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressMultiCover)){
				lListMultiCoverSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressMultiCover,lRowSubHeader)
				lNumCellRangeAddressMultiCoverColumnLast=lCellRangeAddressMultiCover.getLastColumn()-lCellRangeAddressMultiCover.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressOptionalData)){
				lListOptionalDataSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressOptionalData,lRowSubHeader)
				lNumCellRangeAddressOptionalDataColumnLast=lCellRangeAddressOptionalData.getLastColumn()-lCellRangeAddressOptionalData.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressAdditionalCoverage)){
				lListAdditionalCoverageSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressAdditionalCoverage,lRowSubHeader)
				lNumCellRangeAddressAdditionalCoverageColumnLast=lCellRangeAddressAdditionalCoverage.getLastColumn()-lCellRangeAddressAdditionalCoverage.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressInputPremium)){
				lListInputPremiumSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressInputPremium,lRowSubHeader)
				lNumCellRangeAddressInputPremiumColumnLast=lCellRangeAddressInputPremium.getLastColumn()-lCellRangeAddressInputPremium.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressPremium)){
				lListPremiumSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressPremium,lRowSubHeader)
				lNumCellRangeAddressPremiumColumnLast=lCellRangeAddressPremium.getLastColumn()-lCellRangeAddressPremium.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressPayment)){
				lListPaymentSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressPayment,lRowSubHeader)
				lNumCellRangeAddressPaymentColumnLast=lCellRangeAddressPayment.getLastColumn()-lCellRangeAddressPayment.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressTransaction)){
				lListTransactionSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressTransaction,lRowSubHeader)
				lNumCellRangeAddressTransactionColumnLast=lCellRangeAddressTransaction.getLastColumn()-lCellRangeAddressTransaction.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressInsuredData)){
				lListInsuredDataSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressInsuredData,lRowSubHeader)
				lNumCellRangeAddressInsuredDataColumnLast=lCellRangeAddressInsuredData.getLastColumn()-lCellRangeAddressInsuredData.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressPolicyHolderData)){
				lListPolicyHolderDataSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressPolicyHolderData,lRowSubHeader)
				lNumCellRangeAddressPolicyHolderDataColumnLast=lCellRangeAddressPolicyHolderData.getLastColumn()-lCellRangeAddressPolicyHolderData.getFirstColumn()
			}
			else{
				lIsOK=false
			}
			if(lStrProductName.contains('Motor')){
				if(!IGNUemaHelper.checkObjectNullOfObject(lCellRangeAddressVehicleData)){
					lListVehicleDataSubHeader=this.getListPricingApiMergeCellSubHeader(lSheetPricingApi,lCellRangeAddressVehicleData,lRowSubHeader)
					lNumCellRangeAddressVehicleDataColumnLast=lCellRangeAddressVehicleData.getLastColumn()-lCellRangeAddressVehicleData.getFirstColumn()
				}
				else{
					lIsOK=false
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('CellRangeAddressQuotationInput',lCellRangeAddressQuotationInput)
				lreturn.put('CellRangeAddressPlanOption',lCellRangeAddressPlanOption)
				lreturn.put('CellRangeAddressMultiCover',lCellRangeAddressMultiCover)
				lreturn.put('CellRangeAddressAdditionalCoverage',lCellRangeAddressAdditionalCoverage)
				lreturn.put('CellRangeAddressOptionalData',lCellRangeAddressOptionalData)
				lreturn.put('CellRangeAddressInputPremium',lCellRangeAddressInputPremium)
				lreturn.put('CellRangeAddressPayment',lCellRangeAddressPayment)
				lreturn.put('CellRangeAddressTransaction',lCellRangeAddressTransaction)
				lreturn.put('CellRangeAddressPremium',lCellRangeAddressPremium)
				lreturn.put('CellRangeAddressVehicleData',lCellRangeAddressVehicleData)
				lreturn.put('CellRangeAddressInsuredData',lCellRangeAddressInsuredData)
				lreturn.put('CellRangeAddressPolicyHolderData',lCellRangeAddressPolicyHolderData)
				lreturn.put('NumCellRangeAddressQuotationInputColumnLast',lNumCellRangeAddressQuotationInputColumnLast)
				lreturn.put('NumCellRangeAddressPlanOptionColumnLast',lNumCellRangeAddressPlanOptionColumnLast)
				lreturn.put('NumCellRangeAddressMultiCoverColumnLast',lNumCellRangeAddressMultiCoverColumnLast)
				lreturn.put('NumCellRangeAddressAdditionalCoverageColumnLast',lNumCellRangeAddressAdditionalCoverageColumnLast)
				lreturn.put('NumCellRangeAddressOptionalDataColumnLast',lNumCellRangeAddressOptionalDataColumnLast)
				lreturn.put('NumCellRangeAddressInputPremiumColumnLast',lNumCellRangeAddressInputPremiumColumnLast)
				lreturn.put('NumCellRangeAddressPaymentColumnLast',lNumCellRangeAddressPaymentColumnLast)
				lreturn.put('NumCellRangeAddressTransactionColumnLast',lNumCellRangeAddressTransactionColumnLast)
				lreturn.put('NumCellRangeAddressPremiumColumnLast',lNumCellRangeAddressPremiumColumnLast)
				lreturn.put('NumCellRangeAddressVehicleDataColumnLast',lNumCellRangeAddressVehicleDataColumnLast)
				lreturn.put('NumCellRangeAddressInsuredDataColumnLast',lNumCellRangeAddressInsuredDataColumnLast)
				lreturn.put('NumCellRangeAddressPolicyHolderDataColumnLast',lNumCellRangeAddressPolicyHolderDataColumnLast)
				lreturn.put('ListQuotationInputSubHeader',lListQuotationInputSubHeader)
				lreturn.put('ListPlanOptionSubHeader',lListPlanOptionSubHeader)
				lreturn.put('ListMultiCoverSubHeader',lListMultiCoverSubHeader)
				lreturn.put('ListAdditionalCoverageSubHeader',lListAdditionalCoverageSubHeader)
				lreturn.put('ListOptionalDataSubHeader',lListOptionalDataSubHeader)
				lreturn.put('ListInputPremiumSubHeader',lListInputPremiumSubHeader)
				lreturn.put('ListPaymentSubHeader',lListPaymentSubHeader)
				lreturn.put('ListTransactionSubHeader',lListTransactionSubHeader)
				lreturn.put('ListPremiumSubHeader',lListPremiumSubHeader)
				lreturn.put('ListVehicleDataSubHeader',lListVehicleDataSubHeader)
				lreturn.put('ListInsuredDataSubHeader',lListInsuredDataSubHeader)
				lreturn.put('ListPolicyHolderDataSubHeader',lListPolicyHolderDataSubHeader)
				lreturn.put('StrOptionalDataParameterName',lStrOptionalDataParameterName)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map getMapPricingApiPrepareJsonInputFromExcelSheet(Workbook workBookExcelFileGenericTestData,Sheet sheetPricingApi,Map mapPricingApiMergeCellRangeAddressList){
		Map lreturn=[:]
		Boolean lResult=false
		List<String> lListJsonQuotationInput=new ArrayList<String>()
		List<String> lListJsonVehicleData=new ArrayList<String>()
		List<String> lListJsonPremium=new ArrayList<String>()
		List<String> lListJsonPlanOption=new ArrayList<String>()
		List<String> lListJsonMultiCover=new ArrayList<String>()
		List<String> lListJsonPlanAdditionalCoverageData=new ArrayList<String>()
		List<String> lListJsonInputPremiumData=new ArrayList<String>()
		List<String> lListJsonPayment=new ArrayList<String>()
		List<String> lListJsonTransaction=new ArrayList<String>()
		List<String> lListReferCaseNumber=new ArrayList<String>()
		List<String> lListTransactionType=new ArrayList<String>()
		String lStrProductName=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('ListJsonQuotationInput',lListJsonQuotationInput)
			lreturn.put('ListJsonVehicleData',lListJsonVehicleData)
			lreturn.put('ListJsonPremium',lListJsonPremium)
			lreturn.put('ListJsonPlanOption',lListJsonPlanOption)
			lreturn.put('ListJsonMultiCover',lListJsonMultiCover)
			lreturn.put('ListJsonPlanAdditionalCoverageData',lListJsonPlanAdditionalCoverageData)
			lreturn.put('ListJsonInputPremiumData',lListJsonInputPremiumData)
			lreturn.put('ListJsonPayment',lListJsonPayment)
			lreturn.put('ListJsonTransaction',lListJsonTransaction)
			lreturn.put('ListReferCaseNumber',lListReferCaseNumber)
			lreturn.put('ListTransactionType',lListTransactionType)
			lreturn.put('lStrProductName',lStrProductName)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiMergeCellRangeAddressList)){
				return lreturn
			}
			Map lMapPricingApiMergeCellRangeAddressList=mapPricingApiMergeCellRangeAddressList
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			if(IGNUemaHelper.checkObjectNullOfObject(workBookExcelFileGenericTestData)){
				return lreturn
			}
			Workbook  lWorkBookExcelFileGenericTestData=workBookExcelFileGenericTestData
			Sheet lMasterDataMappingSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lWorkBookExcelFileGenericTestData,'MasterData-Mapping')
			if(IGNUemaHelper.checkObjectNullOfObject(lMasterDataMappingSheet)){
				return lreturn
			}
			CellRangeAddress lCellRangeAddressQuotationInput=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressQuotationInput
			CellRangeAddress lCellRangeAddressPlanOption=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressPlanOption
			CellRangeAddress lCellRangeAddressMultiCover=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressMultiCover
			CellRangeAddress lCellRangeAddressAdditionalCoverage=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressAdditionalCoverage
			CellRangeAddress lCellRangeAddressOptionalData=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressOptionalData
			CellRangeAddress lCellRangeAddressInputPremium=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressInputPremium
			CellRangeAddress lCellRangeAddressPayment=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressPayment
			CellRangeAddress lCellRangeAddressTransaction=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressTransaction
			CellRangeAddress lCellRangeAddressPremium=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressPremium
			CellRangeAddress lCellRangeAddressVehicleData=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressVehicleData
			CellRangeAddress lCellRangeAddressInsuredData=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressInsuredData
			CellRangeAddress lCellRangeAddressPolicyHolderData=lMapPricingApiMergeCellRangeAddressList.CellRangeAddressPolicyHolderData
			Integer lNumCellRangeAddressQuotationInputColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressQuotationInputColumnLast
			Integer lNumCellRangeAddressPlanOptionColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressPlanOptionColumnLast
			Integer lNumCellRangeAddressMultiCoverColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressMultiCoverColumnLast
			Integer lNumCellRangeAddressAdditionalCoverageColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressAdditionalCoverageColumnLast
			Integer lNumCellRangeAddressOptionalDataColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressOptionalDataColumnLast
			Integer lNumCellRangeAddressInputPremiumColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressInputPremiumColumnLast
			Integer lNumCellRangeAddressPaymentColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressPaymentColumnLast
			Integer lNumCellRangeAddressTransactionColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressTransactionColumnLast
			Integer lNumCellRangeAddressPremiumColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressPremiumColumnLast
			Integer lNumCellRangeAddressVehicleDataColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressVehicleDataColumnLast
			Integer lNumCellRangeAddressInsuredDataColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressInsuredDataColumnLast
			Integer lNumCellRangeAddressPolicyHolderDataColumnLast=lMapPricingApiMergeCellRangeAddressList.NumCellRangeAddressPolicyHolderDataColumnLast
			List<String> lListQuotationInputSubHeader=lMapPricingApiMergeCellRangeAddressList.ListQuotationInputSubHeader
			List<String> lListPlanOptionSubHeader=lMapPricingApiMergeCellRangeAddressList.ListPlanOptionSubHeader
			List<String> lListMultiCoverSubHeader=lMapPricingApiMergeCellRangeAddressList.ListMultiCoverSubHeader
			List<String> lListAdditionalCoverageSubHeader=lMapPricingApiMergeCellRangeAddressList.ListAdditionalCoverageSubHeader
			List<String> lListOptionalDataSubHeader=lMapPricingApiMergeCellRangeAddressList.ListOptionalDataSubHeader
			List<String> lListInputPremiumSubHeader=lMapPricingApiMergeCellRangeAddressList.ListInputPremiumSubHeader
			List<String> lListPaymentSubHeader=lMapPricingApiMergeCellRangeAddressList.ListPaymentSubHeader
			List<String> lListTransactionSubHeader=lMapPricingApiMergeCellRangeAddressList.ListTransactionSubHeader
			List<String> lListPremiumSubHeader=lMapPricingApiMergeCellRangeAddressList.ListPremiumSubHeader
			List<String> lListVehicleDataSubHeader=lMapPricingApiMergeCellRangeAddressList.ListVehicleDataSubHeader
			List<String> lListInsuredDataSubHeader=lMapPricingApiMergeCellRangeAddressList.ListInsuredDataSubHeader
			List<String> lListPolicyHolderDataSubHeader=lMapPricingApiMergeCellRangeAddressList.ListPolicyHolderDataSubHeader
			String lStrOptionalDataParameterName=lMapPricingApiMergeCellRangeAddressList.StrOptionalDataParameterName
			List<String> lListCurrentCellQuotationInput=new ArrayList<String>()
			List<String> lListCurrentCellInsuredData=new ArrayList<String>()
			List<String> lListCurrentCellPolicyHolderData=new ArrayList<String>()
			List<String> lListCurrentCellVehicleData=new ArrayList<String>()
			List<String> lListCurrentCellOptionalData=new ArrayList<String>()
			List<String> lListCurrentCellPlanOption=new ArrayList<String>()
			List<String> lListCurrentCellMultiCover=new ArrayList<String>()
			List<String> lListCurrentCellMultiCoverData=new ArrayList<String>()
			List<String> lListCurrentCellAdditionalCoverage=new ArrayList<String>()
			List<String> lListCurrentCellInputPremium=new ArrayList<String>()
			List<String> lListCurrentCellPayment=new ArrayList<String>()
			List<String> lListCurrentCellTransaction=new ArrayList<String>()
			List<String> lListCurrentCellPremium=new ArrayList<String>()
			List<String> lListQuotationInputDate=new ArrayList<String>()
			List<String> lListMapVehicleData=new ArrayList<String>()
			List<String> lListQuotationInput=new ArrayList<String>()
			List<String> lListInsuredData=new ArrayList<String>()
			List<String> lListPolicyHolderData=new ArrayList<String>()
			List<String> lListVehicleData=new ArrayList<String>()
			List<String> lListTransaction=new ArrayList<String>()
			List<String> lListOptionalData=new ArrayList<String>()
			List<String> lListPlanOption=new ArrayList<String>()
			List<String> lListMultiCover=new ArrayList<String>()
			List<String> lListAdditionalCoverage=new ArrayList<String>()
			List<String> lListInputPremium=new ArrayList<String>()
			List<String> lListPremium=new ArrayList<String>()
			List<String> lListPayment=new ArrayList<String>()
			List<String> lListPlanOptionAll=new ArrayList()
			List<String> lListPaymentRowKey=new ArrayList()
			List<String> lListPlanOptionRowKeyAll=new ArrayList()
			List<String> lListPlanOptionRowKey=new ArrayList()
			List<String> lListMultiCoverAll=new ArrayList()
			List<String> lListSubsetAll=new ArrayList()
			List<String> lListReferSubSetAll=new ArrayList()
			List<String> lListAdditionalCoverageAll=new ArrayList()
			List<String> lListInputPremiumAll=new ArrayList()
			List<String> lListPaymentAll=new ArrayList()
			List<String> lListTransactionAll=new ArrayList()
			List<String> lListPremiumAll=new ArrayList()
			List<String> lListInvalidReferCase=[]
			List<String> lListInputValidRow=[]
			String lStrPreviousMultiCover=''
			Boolean lIsMultiCoverFlag=true
			Boolean lIsWriteReferCaseStatusToSheet=false
			Integer lNumPricingApiSheetFirstRow=lSheetPricingApi.getFirstRowNum()
			Row lSheetPricingApiFirstRow=lSheetPricingApi.getRow(lNumPricingApiSheetFirstRow)
			Row lRowFirst=lSheetPricingApi.getRow(lNumPricingApiSheetFirstRow+1)
			Integer lNumLastRow=lSheetPricingApi.getLastRowNum()
			Integer lNumGenericDataSheetLastColumn=lRowFirst.getLastCellNum()
			Integer lNumTargetedRow=lRowFirst.rowNum
			Integer lNumSubSetColumnIndex=0
			Integer lNumTransactionColumnIndex=0
			Integer lNumReferCaseIndex=0
			Integer lNumReferCaseValid=0
			Integer lNumInputValidColumnIndex=0
			String lStrProductVariable=''
			lNumSubSetColumnIndex=this.getTargetColumnIndexByColumnName(lSheetPricingApi,'Subset',lNumTargetedRow,lNumGenericDataSheetLastColumn)
			lNumTransactionColumnIndex=this.getTargetColumnIndexByColumnName(lSheetPricingApi,'TransactionType',lNumTargetedRow,lNumGenericDataSheetLastColumn)
			lNumReferCaseIndex=this.getTargetColumnIndexByColumnName(lSheetPricingApi,'ReferSubset',lNumTargetedRow,lNumGenericDataSheetLastColumn)
			lNumReferCaseValid=this.getTargetColumnIndexByColumnName(lSheetPricingApi,'ReferCaseValid',lNumTargetedRow,lNumGenericDataSheetLastColumn)
			lNumInputValidColumnIndex=this.getTargetColumnIndexByColumnName(lSheetPricingApi,'InputValid',lNumTargetedRow,lNumGenericDataSheetLastColumn)
			Map lMapPricingApiProductTypeAndNameResult=this.getMapPricingApiProductTypeAndValueFromExcelSheet(lSheetPricingApiFirstRow)
			if(!lMapPricingApiProductTypeAndNameResult.Result){
				return lreturn
			}
			lStrProductVariable=lMapPricingApiProductTypeAndNameResult.StrProductType
			lStrProductName=lMapPricingApiProductTypeAndNameResult.StrProductName
			Map lMapPricingApiTransactionHeaderResult=this.getMapPricingApiTransactionTypeAndHeaderFromExcelSheet(lSheetPricingApi)
			if(!lMapPricingApiTransactionHeaderResult.Result){
				return lreturn
			}
			String lStrTransactionTypeHeader=lMapPricingApiTransactionHeaderResult.StrTransactionHeader
			Map lMapOptionalDataParameterWithMasterParameter=this.inputMapTargetParameterWithMasterParameter(lMasterDataMappingSheet,lStrOptionalDataParameterName)
			if(!lMapOptionalDataParameterWithMasterParameter.Result){
				return lreturn
			}
			Map lMapOptionalDataParameter=lMapOptionalDataParameterWithMasterParameter.MasterDataParameter
			for(Integer lIndex=2;lIndex<=lNumLastRow;lIndex++){
				String lStrSubSetValue=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lIndex,lNumSubSetColumnIndex)
				String lStrReferTestCaseValue=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lIndex,lNumReferCaseIndex)
				String lStrTransactionTypeValue=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lIndex,lNumTransactionColumnIndex)
				Integer lLastTransactionIndex=lListTransactionType.size()-1
				if(IGNUemaHelper.checkObjectEmptyOfString(lStrTransactionTypeValue)){
					lStrTransactionTypeValue=lListTransactionType.get(lLastTransactionIndex)
					Boolean lIsWriteTransactionTypeValueToSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lIndex,lNumTransactionColumnIndex,lStrTransactionTypeValue)
					if(!lIsWriteTransactionTypeValueToSheet){
						return lreturn
					}
				}else{
					lListTransactionType.add(lStrTransactionTypeValue)
				}
				if(!lStrSubSetValue.isEmpty()){
					lListInputValidRow.add(lIndex)
					lListSubsetAll.add(lStrSubSetValue)
				}
				if(!lStrReferTestCaseValue.isEmpty()){
					lListReferSubSetAll.add(lStrReferTestCaseValue)
					if(lStrTransactionTypeValue=='New Biz'){
						lListInvalidReferCase.add(lStrSubSetValue)
						lIsWriteReferCaseStatusToSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lIndex,lNumReferCaseValid,'Invalid')
					}
					else{
						if(lListInvalidReferCase.contains(lStrReferTestCaseValue)){
							lIsWriteReferCaseStatusToSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lIndex,lNumReferCaseValid,'Invalid')
						}
						else{
							lIsWriteReferCaseStatusToSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lIndex,lNumReferCaseValid,'Valid')
						}
					}
					if(!lIsWriteReferCaseStatusToSheet){
						return lreturn
					}
				}
				Row lRowCurrent=lSheetPricingApi.getRow(lCellRangeAddressQuotationInput.getFirstRow()+lIndex)
				Map lMapCurrentCellListQuotationInput=this.getMapQuotationInputValueFromExcelSpecificRange(lWorkBookExcelFileGenericTestData,lSheetPricingApi,lCellRangeAddressQuotationInput,lRowCurrent,lNumCellRangeAddressQuotationInputColumnLast,true,true)
				if(lMapCurrentCellListQuotationInput.Result){
					lListCurrentCellQuotationInput=lMapCurrentCellListQuotationInput.CellValueList
				}
				Map lMapCurrentCellListInsuredData=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressInsuredData,lRowCurrent,lNumCellRangeAddressInsuredDataColumnLast,true)
				if(lMapCurrentCellListInsuredData.Result){
					lListCurrentCellInsuredData=lMapCurrentCellListInsuredData.CellValueList
				}
				Map lMapCurrentCellListPolicyHolderData=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressPolicyHolderData,lRowCurrent,lNumCellRangeAddressPolicyHolderDataColumnLast,true)
				if(lMapCurrentCellListPolicyHolderData.Result){
					lListCurrentCellPolicyHolderData=lMapCurrentCellListPolicyHolderData.CellValueList
				}
				List lListMapPlanOptionRowKey=[]
				Map lMapCurrentCellListPlanOption=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressPlanOption,lRowCurrent,lNumCellRangeAddressPlanOptionColumnLast,true)
				if(lMapCurrentCellListPlanOption.Result){
					lListCurrentCellPlanOption=lMapCurrentCellListPlanOption.CellValueList
					Map lMapPlanOptionRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListPlanOption)
					if(lMapPlanOptionRowKeyListResult.Result){
						lListMapPlanOptionRowKey=lMapPlanOptionRowKeyListResult.TargetInputRowKeyList
					}
				}
				Map lMapQuotationInputDate=[:]
				List lListMapQuotationInputRowKey=[]
				Map lMapQuotationInputRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListQuotationInput)
				if(lMapQuotationInputRowKeyListResult.Result){
					lListMapQuotationInputRowKey=lMapQuotationInputRowKeyListResult.TargetInputRowKeyList
				}
				for(Integer lNumQuotationInputIndex=0;lNumQuotationInputIndex<=lListQuotationInputSubHeader.size()-1;lNumQuotationInputIndex++){
					String lStrQuotationHeaderValue=lListQuotationInputSubHeader.get(lNumQuotationInputIndex)
					if(lStrQuotationHeaderValue=='StartDate'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
					if(lStrQuotationHeaderValue=='EffectiveDate'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
					if(lStrQuotationHeaderValue=='FirstQuote'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
					if(lStrQuotationHeaderValue=='QuoteDate'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
					if(lStrQuotationHeaderValue=='EndDate'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
					if(lStrQuotationHeaderValue=='MasterSetId'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
					if(lStrQuotationHeaderValue=='EndorseCancellationMethod'){
						lMapQuotationInputDate.put(lListQuotationInputSubHeader.get(lNumQuotationInputIndex),lListMapQuotationInputRowKey.get(lNumQuotationInputIndex))
					}
				}
				lListQuotationInputDate.add(lMapQuotationInputDate)
				if(lStrProductName.contains('Motor')){
					Map lMapVehicleDataInput=[:]
					Map lMapCurrentCellListVehicleData=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressVehicleData,lRowCurrent,lNumCellRangeAddressVehicleDataColumnLast,true)
					if(lMapCurrentCellListVehicleData.Result){
						lListCurrentCellVehicleData=lMapCurrentCellListVehicleData.CellValueList
						if(!lListCurrentCellQuotationInput.isEmpty()){
							List lListMapVehicleDataRowKey=[]
							Map lListMapVehicleDataRowKeyResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListVehicleData)
							if(lListMapVehicleDataRowKeyResult.Result){
								lListMapVehicleDataRowKey=lListMapVehicleDataRowKeyResult.TargetInputRowKeyList
								for(Integer lNumVehicleDataIndex=0;lNumVehicleDataIndex<=lListVehicleDataSubHeader.size()-1;lNumVehicleDataIndex++){
									String lStrVehicleDataHeaderValue=lListVehicleDataSubHeader.get(lNumVehicleDataIndex)
									lMapVehicleDataInput.put(lStrVehicleDataHeaderValue,lListMapVehicleDataRowKey.get(lNumVehicleDataIndex))
								}
							}
							lListMapVehicleData.add(lMapVehicleDataInput)
						}
					}
					Boolean lIsCurrentCellListVehicleDataValueAllContainStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lListCurrentCellVehicleData,'None')
					if(lIsCurrentCellListVehicleDataValueAllContainStringNone){
						lListCurrentCellVehicleData=[]
					}
				}
				Map lMapPremium=[:]
				if(!lListCurrentCellQuotationInput.isEmpty()){
					lListQuotationInput.addAll(lListCurrentCellQuotationInput)
					lListInsuredData.addAll(lListCurrentCellInsuredData)
					lListPolicyHolderData.addAll(lListCurrentCellPolicyHolderData)
					lListVehicleData.addAll(lListCurrentCellVehicleData)
					lStrReferTestCaseValue=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,lIndex,lNumReferCaseIndex)
					lListReferCaseNumber.add(lStrReferTestCaseValue)
				}
				Map lMapCurrentCellListOptionalData=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressOptionalData,lRowCurrent,lNumCellRangeAddressOptionalDataColumnLast,false)
				if(lMapCurrentCellListOptionalData.Result){
					lListCurrentCellOptionalData=lMapCurrentCellListOptionalData.CellValueList
				}
				Boolean lIsCurrentCellListOptionalDataValueAllContainStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lListCurrentCellOptionalData,'None')
				if(lIsCurrentCellListOptionalDataValueAllContainStringNone){
					lListCurrentCellOptionalData=[]
				}
				if(!lListCurrentCellOptionalData.isEmpty()){
					lListOptionalData.addAll(lListCurrentCellOptionalData)
				}
				if(lListCurrentCellQuotationInput.isEmpty()){
					if(!lStrSubSetValue.isEmpty()){
						lListAdditionalCoverageAll.add(lListAdditionalCoverage)
						lListAdditionalCoverage=[]
						lListInputPremiumAll.add(lListInputPremium)
						lListInputPremium=[]
						lListPaymentAll.add(lListPayment)
						lListPayment=[]
						lListPremiumAll.add(lListPremium)
						lListPremium=[]
						lListTransactionAll.add(lListTransaction)
						lListTransaction=[]
						if(!lIsMultiCoverFlag){
							lListPlanOptionRowKeyAll.add(lListPlanOptionRowKey)
							lListPlanOptionAll.add(lListPlanOption)
							lListMultiCoverAll.add(lListMultiCover)
							lListMultiCover=[]
							lListPlanOption=[]
							lListPlanOptionRowKey=[]
						}else{
							lListPlanOptionRowKeyAll.add(lListPlanOptionRowKey)
							lListPlanOptionAll.add(lListPlanOption)
							lListMultiCoverAll.add(lListMultiCover)
							lListMultiCover=[]
							lListPlanOption=[]
							lListPlanOptionRowKey=[]
						}
					}
				}
				Row lRowCurrentMultiCover=lSheetPricingApi.getRow(lCellRangeAddressMultiCover.getFirstRow()+lIndex)
				Map lMapCurrentCellMultiCover=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressMultiCover,lRowCurrent,lNumCellRangeAddressMultiCoverColumnLast,true)
				if(lMapCurrentCellMultiCover.Result){
					lListCurrentCellMultiCover=lMapCurrentCellMultiCover.CellValueList
				}
				String lMultiCoverFlag=lListCurrentCellMultiCover.get(0)
				if(!IGNUemaHelper.checkObjectEmptyOfString(lMultiCoverFlag)){
					lIsMultiCoverFlag=IGNUemaHelper.convertStringToBoolean(lMultiCoverFlag)
				}
				Boolean lIsCheckCurrentCellListMultiCoverNone=IGNUemaHelper.checkAllValueInListContainSameString(lListCurrentCellMultiCover,'None')
				if(lIsCheckCurrentCellListMultiCoverNone){
					lListCurrentCellMultiCover=[]
				}

				Map lMapAdditionalCoverage=[:]
				Table<Integer,Integer,String> lTableExcelSheetAdditionalCoverage=HashBasedTable.create()
				Map lMapCurrentCellListAdditionalCoverage=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressAdditionalCoverage,lRowCurrent,lNumCellRangeAddressAdditionalCoverageColumnLast,true)
				if(lMapCurrentCellListAdditionalCoverage.Result){
					lListCurrentCellAdditionalCoverage=lMapCurrentCellListAdditionalCoverage.CellValueList
					List lListMapAdditionalCoverageRowKey=[]
					Map lMapAdditionalCoverageRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListAdditionalCoverage)
					if(lMapAdditionalCoverageRowKeyListResult.Result){
						lListMapAdditionalCoverageRowKey=lMapAdditionalCoverageRowKeyListResult.TargetInputRowKeyList
					}
					if(!lListCurrentCellAdditionalCoverage.isEmpty()){
						for(Integer lNumAdditionalCoverageIndex=0;lNumAdditionalCoverageIndex<=lListCurrentCellAdditionalCoverage.size()-1;lNumAdditionalCoverageIndex++){
							String lStrHeaderValue=lListAdditionalCoverageSubHeader.get(lNumAdditionalCoverageIndex)
							if(lStrHeaderValue.endsWith('Premium')||(lStrHeaderValue.contains('ValidationTestResult'))){
								lMapAdditionalCoverage.put(lListAdditionalCoverageSubHeader.get(lNumAdditionalCoverageIndex),lListMapAdditionalCoverageRowKey.get(lNumAdditionalCoverageIndex))
							}else{
								lMapAdditionalCoverage.put(lListAdditionalCoverageSubHeader.get(lNumAdditionalCoverageIndex),lListCurrentCellAdditionalCoverage.get(lNumAdditionalCoverageIndex))
							}
						}
					}
				}
				Map lMapInputPremium=[:]
				Table<Integer,Integer,String> lTableExcelSheetInputPremium=HashBasedTable.create()
				Map lMapCurrentCellListInputPremium=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressInputPremium,lRowCurrent,lNumCellRangeAddressInputPremiumColumnLast,true)
				if(lMapCurrentCellListInputPremium.Result){
					lListCurrentCellInputPremium=lMapCurrentCellListInputPremium.CellValueList
					lTableExcelSheetInputPremium=lMapCurrentCellListInputPremium.CellTable
					Set<Integer> lTableInputPremiumKeySet=lTableExcelSheetInputPremium.columnKeySet()
					List lListMapInputPremiumRowKey=[]
					Map lMapInputPremiumRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListInputPremium)
					if(lMapInputPremiumRowKeyListResult.Result){
						lListMapInputPremiumRowKey=lMapInputPremiumRowKeyListResult.TargetInputRowKeyList
					}
					if(!lListCurrentCellInputPremium.isEmpty()){
						for(Integer lNumInputPremiumIndex=0;lNumInputPremiumIndex<=lListCurrentCellInputPremium.size()-1;lNumInputPremiumIndex++){
							String lStrHeaderValue=lListInputPremiumSubHeader.get(lNumInputPremiumIndex)
							if(lStrHeaderValue.endsWith('Premium')){
								lMapInputPremium.put(lListInputPremiumSubHeader.get(lNumInputPremiumIndex),lListMapInputPremiumRowKey.get(lNumInputPremiumIndex))
							}else{
								lMapInputPremium.put(lListInputPremiumSubHeader.get(lNumInputPremiumIndex),lListCurrentCellInputPremium.get(lNumInputPremiumIndex))
							}
						}
						//lListInputPremium.add(lMapInputPremium)
					}
				}
				Map lMapPaymentList=[:]
				Map lMapCurrentCellListPayment=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressPayment,lRowCurrent,lNumCellRangeAddressPaymentColumnLast,true)
				if(lMapCurrentCellListPayment.Result){
					lListCurrentCellPayment=lMapCurrentCellListPayment.CellValueList
					Table<Integer,Integer,String> lTableExcelSheetPayment=HashBasedTable.create()
					lTableExcelSheetPayment=lMapCurrentCellListPayment.CellTable
					Set<Integer> lTablePaymentKeySet=lTableExcelSheetPayment.columnKeySet()
					List lListMapPaymentRowKey=[]
					Map lMapPaymentRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListPayment)
					if(lMapPaymentRowKeyListResult.Result){
						lListMapPaymentRowKey=lMapPaymentRowKeyListResult.TargetInputRowKeyList
					}
					if(!lListCurrentCellPayment.isEmpty()){
						for(Integer lCurrentPaymentIndex=0;lCurrentPaymentIndex<=lListCurrentCellPayment.size()-1;lCurrentPaymentIndex++){
							String lStrPaymentHeaderValue=lListPaymentSubHeader.get(lCurrentPaymentIndex)
							if(lStrPaymentHeaderValue=='PaymentFrequency' && lListCurrentCellPayment.get(lCurrentPaymentIndex) !='None' ){
								lMapPaymentList.put(lListPaymentSubHeader.get(lCurrentPaymentIndex),lListCurrentCellPayment.get(lCurrentPaymentIndex))
							}else{
								lMapPaymentList.put(lListPaymentSubHeader.get(lCurrentPaymentIndex),lListMapPaymentRowKey.get(lCurrentPaymentIndex))
							}
						}
						//lListPayment.add(lMapPaymentList)
					}
				}
				Map lMapTransactionList=[:]
				Map lMapCurrentCellListTransaction=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressTransaction,lRowCurrent,lNumCellRangeAddressTransactionColumnLast,true)
				if(lMapCurrentCellListTransaction.Result){
					lListCurrentCellTransaction=lMapCurrentCellListTransaction.CellValueList
					List lListMapTransactionRowKey=[]
					Map lMapTransactionRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListTransaction)
					if(lMapTransactionRowKeyListResult.Result){
						lListMapTransactionRowKey=lMapTransactionRowKeyListResult.TargetInputRowKeyList
					}
					if(!lListCurrentCellTransaction.isEmpty()){
						for(Integer lCurrentTransactionIndex=0;lCurrentTransactionIndex<=lListCurrentCellTransaction.size()-1;lCurrentTransactionIndex++){
							String lStrTransactionHeaderValue=lListTransactionSubHeader.get(lCurrentTransactionIndex)
							lMapTransactionList.put(lStrTransactionHeaderValue,lListMapTransactionRowKey.get(lCurrentTransactionIndex))
						}
						//lListTransaction.add(lMapTransactionList)
					}
				}
				Map lMapCurrentCellListPremium=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressPremium,lRowCurrent,lNumCellRangeAddressPremiumColumnLast,true)
				if(lMapCurrentCellListPremium.Result){
					lListCurrentCellPremium=lMapCurrentCellListPremium.CellValueList
					List lListMapPremiumRowKey=[]
					Map lMapPremiumRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellListPremium)
					if(lMapPremiumRowKeyListResult.Result){
						lListMapPremiumRowKey=lMapPremiumRowKeyListResult.TargetInputRowKeyList
					}
					if(!lListCurrentCellPremium.isEmpty()){
						for(Integer lNumPremiumIndex=0;lNumPremiumIndex<=lListCurrentCellPremium.size()-1;lNumPremiumIndex++){
							String lStrHeaderValue=lListPremiumSubHeader.get(lNumPremiumIndex)
							lMapPremium.put(lListPremiumSubHeader.get(lNumPremiumIndex),lListMapPremiumRowKey.get(lNumPremiumIndex))
						}
						lListPremium.add(lMapPremium)
					}
				}
				if(!lListCurrentCellMultiCover.isEmpty() || lIsMultiCoverFlag){
					lStrPreviousMultiCover=lListCurrentCellMultiCover.get(1)
					lListMultiCover.add(lListCurrentCellMultiCover.get(1))
					lListPlanOptionRowKey.add(lListMapPlanOptionRowKey)
					lListPlanOption.add(lListCurrentCellPlanOption)
					lListTransaction.add(lMapTransactionList)
					lListPayment.add(lMapPaymentList)
					lListInputPremium.add(lMapInputPremium)
					lListAdditionalCoverage.add(lMapAdditionalCoverage)
				}else{
					List lListMapInputMultiCoverRowKey=[]
					Map lMapMultiCoverRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellMultiCover)
					if(lMapMultiCoverRowKeyListResult.Result){
						lListMapInputMultiCoverRowKey=lMapMultiCoverRowKeyListResult.TargetInputRowKeyList
					}
					Map lMapMultiCoverRowNumberAndColumnNumber=lListMapInputMultiCoverRowKey.get(1)
					Integer lNumMultiCoverRowNumber=lMapMultiCoverRowNumberAndColumnNumber.RowNumber
					Integer lNumMultiCoverColumnNumber=lMapMultiCoverRowNumberAndColumnNumber.ColumnNumber
					Boolean lIsWriteMultiCoverToExcelSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumMultiCoverRowNumber,lNumMultiCoverColumnNumber,lStrPreviousMultiCover)
					if(!lIsWriteMultiCoverToExcelSheet){
						return lreturn
					}
					lListMultiCover.add(lStrPreviousMultiCover)
					lListPlanOptionRowKey.add(lListMapPlanOptionRowKey)
					lListPlanOption.add(lListCurrentCellPlanOption)
					lListTransaction.add(lMapTransactionList)
					lListPayment.add(lMapPaymentList)
					lListInputPremium.add(lMapInputPremium)
					lListAdditionalCoverage.add(lMapAdditionalCoverage)
				}
				Integer lNumNextRowIndex=lCellRangeAddressQuotationInput.getFirstRow()+lIndex+1
				Row lRowNext=lSheetPricingApi.getRow(lNumNextRowIndex)
				List lListNextRowQuotationInput=[]
				Map lMapNextRowQuotationInputList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lSheetPricingApi,lCellRangeAddressQuotationInput,lRowNext,lNumCellRangeAddressQuotationInputColumnLast,false)
				if(lMapNextRowQuotationInputList.Result){
					lListNextRowQuotationInput=lMapNextRowQuotationInputList.CellValueList
				}
				Boolean lIsCheckNextRowQuotationInputListNone=IGNUemaHelper.checkAllValueInListContainSameString(lListNextRowQuotationInput,'None')
				if(lIsCheckNextRowQuotationInputListNone){
					lListNextRowQuotationInput=[]
				}
				if(!lListNextRowQuotationInput.isEmpty()||(lIndex==lNumLastRow)){
					Map lMapQuotationInput=[:]
					Map lMapQuotationInputAll=[:]
					Map lMapInsuredData=[:]
					Map lMapPolicyHolderData=[:]
					Map lMapVehicleData=[:]
					Map lMapVehicleDataAll=[:]
					Map lMapAdditionalCoverageData=[:]
					Map lMapAdditionalCoverageDataAll=[:]
					Map lMapInputPremiumData=[:]
					Map lMapInputPremiumDataAll=[:]
					Map lMapMultiCoverAll=[:]
					Map lMapPaymentData=[:]
					Map lMapPaymentDataAll=[:]
					Map lMapPremiumDataAll=[:]
					Map lMapTransactionData=[:]
					List lListPlanOptionFinal=[]
					lMapQuotationInputAll.put(lStrProductVariable,lStrProductName)
					lMapQuotationInputAll.put(lStrTransactionTypeHeader,lStrTransactionTypeValue)
					for(Integer lInsuredDataIndex=0;lInsuredDataIndex<=lListInsuredData.size()-1;lInsuredDataIndex++){
						String lStrInsuredDataValue=lListInsuredData.get(lInsuredDataIndex)
						String lStrInsuredHeaderValue=lListInsuredDataSubHeader.get(lInsuredDataIndex)
						lMapInsuredData.put(lStrInsuredHeaderValue,lStrInsuredDataValue)
					}
					for(Integer lPolicyHolderDataIndex=0;lPolicyHolderDataIndex<=lListPolicyHolderData.size()-1;lPolicyHolderDataIndex++){
						String lStrPolicyHolderDataValue=lListPolicyHolderData.get(lPolicyHolderDataIndex)
						String lStrPolicyHeaderValue=lListPolicyHolderDataSubHeader.get(lPolicyHolderDataIndex)
						lMapPolicyHolderData.put(lStrPolicyHeaderValue,lStrPolicyHolderDataValue)
					}
					for(Integer lNumQuotationInputIndex=0;lNumQuotationInputIndex<=lListQuotationInput.size()-1;lNumQuotationInputIndex++){
						String lStrQuotationInputValue=lListQuotationInput.get(lNumQuotationInputIndex)
						String lStrQuotationHeaderValue=lListQuotationInputSubHeader.get(lNumQuotationInputIndex)
						lMapQuotationInputAll.put(lStrQuotationHeaderValue,lStrQuotationInputValue)
					}
					if(lStrProductName.contains('Motor')){
						for(Integer lNumVehicleDataIndex=0;lNumVehicleDataIndex<=lListVehicleData.size()-1;lNumVehicleDataIndex++){
							String lStrVehicleDataValue=lListVehicleData.get(lNumVehicleDataIndex)
							String lStrVehicleHeaderValue=lListVehicleDataSubHeader.get(lNumVehicleDataIndex)
							lMapVehicleDataAll.put(lStrVehicleHeaderValue,lStrVehicleDataValue)
						}
					}
					List lListMapOptionalData=[]
					Integer lNumOptionalDataParameterSize=lMapOptionalDataParameter.size()
					Integer lOptionalDataIndex=0
					while(lOptionalDataIndex<lListOptionalData.size()-1){
						Map lMapOptionalData=[:]
						for(Integer lOptionalDataMapIndex=0;lOptionalDataMapIndex<=lNumOptionalDataParameterSize-1;lOptionalDataMapIndex++){
							String lStrOptionalDataName=lListOptionalData.get(lOptionalDataIndex)
							if(lStrOptionalDataName!='None'){
								lMapOptionalData.put(lListOptionalDataSubHeader.get(lOptionalDataMapIndex),lStrOptionalDataName)
							}
							lOptionalDataIndex=lOptionalDataIndex+1
						}
						lListMapOptionalData.add(lMapOptionalData)
					}
					Map lMapOptionalDataAll=[:]
					if(lStrProductName.contains('Motor')){
						lMapQuotationInputAll.put('VehicleData',lMapVehicleDataAll)
					}
					lMapQuotationInputAll.put(lStrOptionalDataParameterName,lListMapOptionalData)
					if(lIndex<=(lNumLastRow)){
						lListPlanOptionRowKeyAll.add(lListPlanOptionRowKey)
						lListPlanOptionAll.add(lListPlanOption)
						lListMultiCoverAll.add(lListMultiCover)
						lListAdditionalCoverageAll.add(lMapAdditionalCoverage)
						lListInputPremiumAll.add(lMapInputPremium)
						lListPaymentAll.add(lMapPaymentList)
						lListTransactionAll.add(lMapTransactionList)
						lListPremiumAll.add(lMapPremium)
					}
					for(Integer lNumPlanOptionIndex=0;lNumPlanOptionIndex<=lListPlanOptionAll.size()-1;lNumPlanOptionIndex++){
						List lListCurrentPlanOption=lListPlanOptionAll.get(lNumPlanOptionIndex)
						List lListCurrentPlanOptionRowKey=lListPlanOptionRowKeyAll.get(lNumPlanOptionIndex)
						List lListSelectedPlanOption=[]
						for(Integer lCurrentPlanOptionIndex=0;lCurrentPlanOptionIndex<=lListCurrentPlanOption.size()-1;lCurrentPlanOptionIndex++){
							Map lMapPlanOptionList=[:]
							List lListPlanOptionMain=lListCurrentPlanOption.get(lCurrentPlanOptionIndex)
							List lListPlanOptionRowKeyMain=lListCurrentPlanOptionRowKey.get(lCurrentPlanOptionIndex)
							for(Integer lMainIndex=0;lMainIndex<=lListPlanOptionMain.size()-1;lMainIndex++){
								String lStrPlanName=lListPlanOptionMain.get(lMainIndex)
								if(lStrPlanName=='None'){
									lMapPlanOptionList.put(lListPlanOptionSubHeader.get(lMainIndex),lListPlanOptionRowKeyMain.get(lMainIndex))
								}else{
									lMapPlanOptionList.put(lListPlanOptionSubHeader.get(lMainIndex),lStrPlanName)
								}
							}
							lListSelectedPlanOption.add(lMapPlanOptionList)
						}
						lListPlanOptionFinal.add(lListSelectedPlanOption)
					}
					lMapQuotationInput.put('QuotationInput',lMapQuotationInputAll)
					lMapQuotationInput.put('InsuredData',lMapInsuredData)
					lMapQuotationInput.put('PolicyHolderData',lMapPolicyHolderData)
					if(lStrProductName.contains('Motor')){
						lMapVehicleData.put('VehicleData',lListMapVehicleData)
					}
					lMapVehicleData.put('QuotationInputDateList',lListQuotationInputDate)
					lMapVehicleData.put('SubSetList',lListSubsetAll)
					lMapVehicleData.put('ReferSubSetList',lListReferSubSetAll)
					lMapPremiumDataAll.put('Premium',lListPremiumAll)
					lMapMultiCoverAll.put('CoverList',lListMultiCoverAll)
					lMapAdditionalCoverageData.put('AdditionalCoverage',lListAdditionalCoverageAll)
					lMapPaymentData.put('PaymentList',lListPaymentAll)
					lMapInputPremiumData.put('InputPremium',lListInputPremiumAll)
					lMapAdditionalCoverageDataAll.put('AdditionalCoverageList',lMapAdditionalCoverageData)
					lMapPaymentDataAll.put('Payment',lMapPaymentData)
					lMapInputPremiumDataAll.put('InputPremiumList',lMapInputPremiumData)
					lMapTransactionData.put('Transaction',lListTransactionAll)
					IGNUemaHelper.printLog('Pricing Api InputData List')
					Integer lNumPricingApiSubSetSize=lListSubsetAll.size()
					IGNUemaHelper.printLog(lListSubsetAll.size())
					IGNUemaHelper.printLog(lListMultiCoverAll.size())
					IGNUemaHelper.printLog(lListPremiumAll.size())
					IGNUemaHelper.printLog(lListAdditionalCoverageAll.size())
					IGNUemaHelper.printLog(lListInputPremiumAll.size())
					List<List> lLisPricingApiDataInput=[
						lListMultiCoverAll,
						lListPremiumAll,
						lListAdditionalCoverageAll,
						lListInputPremiumAll
					]
					Boolean lIsPricingApiListOK=this.checkAllPricingApiDataInputAreSameSize(lNumPricingApiSubSetSize,lLisPricingApiDataInput)
					for(Integer lInputValidIndex=0;lInputValidIndex<=lListInputValidRow.size()-1;lInputValidIndex++){
						Integer lNumInputValidRow=lListInputValidRow.get(lInputValidIndex)
						Boolean lIsWriteInputValidStatusToExcelSheet=false
						if(lIsPricingApiListOK){
							lIsWriteInputValidStatusToExcelSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumInputValidRow,lNumInputValidColumnIndex,'Valid')
						}else{
							lIsWriteInputValidStatusToExcelSheet=IDNPricingApiHelper.inputPricingApiResultToExcelSheetForValidation(lSheetPricingApi,lNumInputValidRow,lNumInputValidColumnIndex,'InValid')
						}
						if(!lIsWriteInputValidStatusToExcelSheet){
							return lreturn
						}
					}
					JsonBuilder lJsonQuotationInput=new JsonBuilder(lMapQuotationInput)
					JsonBuilder lStrJsonVehicleData=new JsonBuilder(lMapVehicleData)
					JsonBuilder lJsonPremiumData=new JsonBuilder(lMapPremiumDataAll)
					JsonBuilder lJsonPlanListnput=new JsonBuilder(lListPlanOptionFinal)
					JsonBuilder lJsonMultiCoverInput=new JsonBuilder(lMapMultiCoverAll)
					JsonBuilder lJsonAddditionalCoverageListInput=new JsonBuilder(lMapAdditionalCoverageDataAll)
					JsonBuilder lJsonInputPremiumList=new JsonBuilder(lMapInputPremiumDataAll)
					JsonBuilder lListJsonPaymentInput=new JsonBuilder(lMapPaymentDataAll)
					JsonBuilder lJsonTransactionInput=new JsonBuilder(lMapTransactionData)
					lListJsonQuotationInput.add(lJsonQuotationInput.toString())
					lListJsonVehicleData.add(lStrJsonVehicleData.toString())
					lListJsonPremium.add(lJsonPremiumData.toString())
					lListJsonPlanOption.add(lJsonPlanListnput.toString())
					lListJsonPayment.add(lListJsonPaymentInput.toString())
					lListJsonMultiCover.add(lJsonMultiCoverInput.toString())
					lListJsonPlanAdditionalCoverageData.add(lJsonAddditionalCoverageListInput.toString())
					lListJsonInputPremiumData.add(lJsonInputPremiumList.toString())
					lListJsonTransaction.add(lJsonTransactionInput.toString())
					lListPlanOption.clear()
					lListPlanOptionAll=[]
					lListPlanOptionRowKeyAll=[]
					lListPlanOptionRowKey.clear()
					lListMultiCover.clear()
					lListTransaction.clear()
					lListSubsetAll=[]
					lListReferSubSetAll=[]
					lListPremiumAll=[]
					lListCurrentCellAdditionalCoverage.clear()
					lListMultiCoverAll=[]
					lListQuotationInput=[]
					lListInsuredData=[]
					lListPolicyHolderData=[]
					lListVehicleData=[]
					lListPremium=[]
					lListOptionalData=[]
					lListPayment.clear()
					lListInputPremium.clear()
					lListPaymentRowKey.clear()
					lListAdditionalCoverageAll=[]
					lListAdditionalCoverage=[]
					lListPaymentAll=[]
					lListTransactionAll=[]
					lListQuotationInputDate=[]
					lListInputPremiumAll=[]
					lListMapVehicleData=[]
					lListInputValidRow=[]
				}
				lListCurrentCellQuotationInput=[]
				lListCurrentCellVehicleData=[]
				lListCurrentCellPlanOption=[]
				lListCurrentCellMultiCover=[]
				lListCurrentCellAdditionalCoverage=[]
				lListCurrentCellOptionalData=[]
				lListCurrentCellPayment=[]
				lListCurrentCellTransaction=[]
			}
			Map lMapPricingApiFinalQuotationInputResult=this.getMapPricingApiFinalQuotationInput(lMasterDataMappingSheet,lListJsonQuotationInput,lListJsonVehicleData,lListTransactionType,lStrOptionalDataParameterName,lStrProductName)
			List lListPricingApiFinalQuotationInput=lMapPricingApiFinalQuotationInputResult.ListJsonFinalQuotationInput
			if(lStrProductName.contains('Motor')){
				lListJsonVehicleData=lMapPricingApiFinalQuotationInputResult.ListJsonFinalVehicleDataInput
			}
			lResult=lListPricingApiFinalQuotationInput.size()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('ListJsonQuotationInput',lListPricingApiFinalQuotationInput)
				lreturn.put('ListJsonVehicleData',lListJsonVehicleData)
				lreturn.put('ListJsonPremium',lListJsonPremium)
				lreturn.put('ListJsonPlanOption',lListJsonPlanOption)
				lreturn.put('ListJsonMultiCover',lListJsonMultiCover)
				lreturn.put('ListJsonPlanAdditionalCoverageData',lListJsonPlanAdditionalCoverageData)
				lreturn.put('ListJsonInputPremiumData',lListJsonInputPremiumData)
				lreturn.put('ListJsonPayment',lListJsonPayment)
				lreturn.put('ListJsonTransaction',lListJsonTransaction)
				lreturn.put('ListReferCaseNumber',lListReferCaseNumber)
				lreturn.put('ListTransactionType',lListTransactionType)
				lreturn.put('lStrProductName',lStrProductName)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static boolean checkAllPricingApiDataInputAreSameSize(Integer numTargetSize,List<List> arrayListPricingApiDataInput){
		Boolean lreturn=false
		Boolean lResult=true
		if(IGNUemaHelper.checkObjectEmptyOfList(arrayListPricingApiDataInput)){
			return lreturn
		}
		List lArrayListPricingApiDataInput=arrayListPricingApiDataInput
		try{
			Integer lNumTargetSize=numTargetSize
			for (List lListPricingApiDataInput in arrayListPricingApiDataInput){
				if(lListPricingApiDataInput.size()!=lNumTargetSize){
					lResult=false
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputPricingApiInputDataToUserExcelSheet(Workbook workBookExcelFileUserTestData,Sheet sheetUserData,Map mapPricingApiJsonInputFromExcelSheet){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(workBookExcelFileUserTestData)){
			return lreturn
		}
		Workbook  lWorkBookExcelFileUserTestData=workBookExcelFileUserTestData
		if(IGNUemaHelper.checkObjectNullOfObject(sheetUserData)){
			return lreturn
		}
		Sheet lSheetUserData=sheetUserData
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiJsonInputFromExcelSheet)){
			return lreturn
		}
		Map lMapPricingApiJsonInputFromExcelSheet=mapPricingApiJsonInputFromExcelSheet
		try{
			List<String> lListJsonFinalQuotationInput=lMapPricingApiJsonInputFromExcelSheet.ListJsonQuotationInput
			List<String> lListJsonVehicleData=lMapPricingApiJsonInputFromExcelSheet.ListJsonVehicleData
			List<String> lListJsonPremium=lMapPricingApiJsonInputFromExcelSheet.ListJsonPremium
			List<String> lListJsonPlanOption=lMapPricingApiJsonInputFromExcelSheet.ListJsonPlanOption
			List<String> lListJsonMultiCover=lMapPricingApiJsonInputFromExcelSheet.ListJsonMultiCover
			List<String> lListJsonPlanAdditionalCoverageData=lMapPricingApiJsonInputFromExcelSheet.ListJsonPlanAdditionalCoverageData
			List<String> lListJsonInputPremiumData=lMapPricingApiJsonInputFromExcelSheet.ListJsonInputPremiumData
			List<String> lListJsonPayment=lMapPricingApiJsonInputFromExcelSheet.ListJsonPayment
			List<String> lListJsonTransaction=lMapPricingApiJsonInputFromExcelSheet.ListJsonTransaction
			List<String> lListReferCaseNumber=lMapPricingApiJsonInputFromExcelSheet.ListReferCaseNumber
			List<String> lListTransactionType=lMapPricingApiJsonInputFromExcelSheet.ListTransactionType
			String lStrProductName=lMapPricingApiJsonInputFromExcelSheet.lStrProductName
			Integer lNumUserDataSheetFirstRow=lSheetUserData.getFirstRowNum()
			Integer lNumUserDataSheetLastRow=lSheetUserData.getLastRowNum()
			Row lRowUserSheetDataFirst=lSheetUserData.getRow(lNumUserDataSheetFirstRow)
			Integer lNumUserDataSheetRow=lRowUserSheetDataFirst.rowNum
			Integer lNumUserDataSheetLastColumn=lRowUserSheetDataFirst.getLastCellNum()
			Integer lNumUserDataSheetLastDataEntry=this.getNumUserDataSheetLastDataEntry(lSheetUserData)
			String lStrUserDataFirstTestCase=this.getNumUserDataSheetFirstTestCase(lSheetUserData,lNumUserDataSheetLastDataEntry)
			for(Integer lIndex=0;lIndex<lNumUserDataSheetLastColumn;lIndex++){
				Cell lCellCurrent=ExcelKeywords.getCellByIndex(lSheetUserData,lNumUserDataSheetRow,lIndex)
				String lStrCellValue=lCellCurrent.getStringCellValue()
				Integer lNumColumnIndex=lCellCurrent.getColumnIndex()
				Integer lNumTestCaseIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='Test_Case_To_Do'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumTestCaseIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrTestCaseAction='Yes'
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrTestCaseAction)
						lNumTestCaseIndex=lNumTestCaseIndex+1
					}
				}
				Integer lNumReferCaseNumberIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='Refer_Case_No'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumReferCaseNumberIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrReferCase=lListReferCaseNumber.get(lInputIndex)
						if(!IGNUemaHelper.checkObjectEmptyOfString(lStrReferCase)){
							Integer lNumReferTestCase=IGNUemaHelper.convertStringToInteger(lStrReferCase,0)
							Integer lNumUserSheetTestCase=IGNUemaHelper.convertStringToInteger(lStrUserDataFirstTestCase,0)
							Integer lNumReferCase=lNumUserSheetTestCase+lNumReferTestCase
							lNumReferCase=lNumReferCase-1
							String lStrReferCaseNum=lNumReferCase.toString()
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrReferCaseNum)
						}
						lNumReferCaseNumberIndex=lNumReferCaseNumberIndex+1
					}
				}
				Integer lNumGroupListIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='Product_Group_List_Field_Value_Story_Name'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumGroupListIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrProductGroupListFieldValueStoryName='0042_Group_Pricing_Api_Share_Quote_All_Name_Product_All_Story_Get_Price_List'
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrProductGroupListFieldValueStoryName)
						String lStrProductStoryUserDescription=IGNUemaHelper.concatMessageLeftRightByEnter('GetPriceListOf',lListTransactionType.get(lInputIndex))
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lStrProductStoryUserDescription)
						lNumGroupListIndex=lNumGroupListIndex+1
					}
				}
				Integer lNumForceStartIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='Force_Start'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumForceStartIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrForceStartAction='Yes'
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrForceStartAction)
						lNumForceStartIndex=lNumForceStartIndex+1
					}
				}
				Integer lNumProductTypeIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiQuoteRequiredProductType'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumProductTypeIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrRequiredProductType=lStrProductName
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrRequiredProductType)
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListTransactionType.get(lInputIndex))
						lNumProductTypeIndex=lNumProductTypeIndex+1
					}
				}
				Integer lNumLibraryHostUrlIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiLibraryHostUrl'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumLibraryHostUrlIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrPricingApiLibraryHostUrl=this.CURRENT_TEST_IGN_LIBRARY_HOST_URL
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrPricingApiLibraryHostUrl)
						lNumLibraryHostUrlIndex=lNumLibraryHostUrlIndex+1
					}
				}
				Integer lNumVehicleDataIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootVehicleData'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonVehicleData.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumVehicleDataIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonVehicleData=lListJsonVehicleData.get(lInputIndex)
						String lStrExcelFitValueJsonVehicleData=IGNUemaHelper.copyStringFitForExcelCell(lStrJsonVehicleData)
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lStrExcelFitValueJsonVehicleData)
						lNumVehicleDataIndex=lNumVehicleDataIndex+1
					}
				}
				Integer lNumQuotationInputIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootQuotationInputPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonFinalQuotationInput.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumQuotationInputIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonFinalQuotationInput=lListJsonFinalQuotationInput.get(lInputIndex)
						List lListEncodedJsonQuotationInputData=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonFinalQuotationInput)
						if(lListEncodedJsonQuotationInputData.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonQuotationInputData.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonQuotationInputData.get(1))
						}
						else if(lListEncodedJsonQuotationInputData.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonQuotationInputData.get(0))
						}
						lNumQuotationInputIndex=lNumQuotationInputIndex+1
					}
				}
				Integer lNumPlanOptionIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootPlanOptionPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonPlanOption.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumPlanOptionIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonPlanOption=lListJsonPlanOption.get(lInputIndex)
						List lListEncodedJsonPlanOptionData=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonPlanOption)
						if(lListEncodedJsonPlanOptionData.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,IGNUemaHelper.getStringDecodedForExcelCell(lListEncodedJsonPlanOptionData))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonPlanOptionData.get(1))
						}
						else if(lListEncodedJsonPlanOptionData.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonPlanOptionData.get(0))
						}
						lNumPlanOptionIndex=lNumPlanOptionIndex+1
					}
				}
				Integer lNumMultiCoverIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootMultiCoverPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonMultiCover.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumMultiCoverIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonMultiCover=lListJsonMultiCover.get(lInputIndex)
						List lListEncodedJsonMultiCoverData=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonMultiCover)
						if(lListEncodedJsonMultiCoverData.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonMultiCoverData.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonMultiCoverData.get(1))
						}
						else if(lListEncodedJsonMultiCoverData.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,IGNUemaHelper.getStringDecodedForExcelCell(lListEncodedJsonMultiCoverData))
						}
						lNumMultiCoverIndex=lNumMultiCoverIndex+1
					}
				}
				Integer lNumAdditionalCoverageIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootAdditionalCoveragePartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonPlanAdditionalCoverageData.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumAdditionalCoverageIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonPlanAdditionalCoverageData=lListJsonPlanAdditionalCoverageData.get(lInputIndex)
						List lListEncodedJsonAdditionalCoverageData=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonPlanAdditionalCoverageData)
						if(lListEncodedJsonAdditionalCoverageData.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonAdditionalCoverageData.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonAdditionalCoverageData.get(1))
						}
						else if(lListEncodedJsonAdditionalCoverageData.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,IGNUemaHelper.getStringDecodedForExcelCell(lListEncodedJsonAdditionalCoverageData))
						}
						lNumAdditionalCoverageIndex=lNumAdditionalCoverageIndex+1
					}
				}
				Integer lNumInputPremiumIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootInputPremiumPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonInputPremiumData.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumInputPremiumIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonInputPremiumData=lListJsonInputPremiumData.get(lInputIndex)
						List lListEncodedJsonInputPremiumData=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonInputPremiumData)
						if(lListEncodedJsonInputPremiumData.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonInputPremiumData.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonInputPremiumData.get(1))
						}
						else if(lListEncodedJsonInputPremiumData.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonInputPremiumData.get(0))
						}
						lNumInputPremiumIndex=lNumInputPremiumIndex+1
					}
				}
				Integer lNumPaymentIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootPaymentPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonPayment.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumPaymentIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonPayment=lListJsonPayment.get(lInputIndex)
						List lListEncodedJsonPayment=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonPayment)
						if(lListEncodedJsonPayment.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonPayment.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonPayment.get(1))
						}
						else if(lListEncodedJsonPayment.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonPayment.get(0))
						}
						lNumPaymentIndex=lNumPaymentIndex+1
					}
				}
				Integer lNumTransactionIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootTransactionPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonTransaction.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumTransactionIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonTransaction=lListJsonTransaction.get(lInputIndex)
						List lListEncodedJsonTransaction=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonTransaction)
						if(lListEncodedJsonTransaction.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonTransaction.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonTransaction.get(1))
						}
						else if(lListEncodedJsonTransaction.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonTransaction.get(0))
						}
						lNumTransactionIndex=lNumTransactionIndex+1
					}
				}
				Integer lNumPremiumIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PricingApiJsonRootTotalPremiumPartOne'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonPremium.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumPremiumIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						String lStrJsonPremium=lListJsonPremium.get(lInputIndex)
						Integer lNumSplitIndex=lStrJsonPremium.indexOf('}},',0)
						List lListEncodedJsonPremium=IGNUemaHelper.getStringEncodedForExcelCell(lStrJsonPremium)
						if(lListEncodedJsonPremium.size()==2){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonPremium.get(0))
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex+1,lListEncodedJsonPremium.get(1))
						}
						else if(lListEncodedJsonPremium.size()==1){
							ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,lListEncodedJsonPremium.get(0))
						}
						lNumPremiumIndex=lNumPremiumIndex+1
					}
				}
				Integer lNumPositiveCaseIndex=lNumUserDataSheetLastDataEntry
				if(lStrCellValue=='PositiveCase'){
					for(Integer lInputIndex=0;lInputIndex<=lListJsonPremium.size()-1;lInputIndex++){
						Row lRowInput=lSheetUserData.getRow(lNumPositiveCaseIndex)
						Integer lNumRowIndex=lRowInput.rowNum
						ExcelKeywords.setValueToCellByIndex(lSheetUserData,lNumRowIndex,lNumColumnIndex,'Yes')
						lNumPositiveCaseIndex=lNumPositiveCaseIndex+1
					}
				}
			}
			ExcelKeywords.saveWorkbook(this.CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER,lWorkBookExcelFileUserTestData)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map getMapPricingApiFinalQuotationInput(Sheet sheetMasterDataMappingSheet,List listJsonQuotationInput,List listJsonVehicleData,List listTransactionType,String strOptionalDataParameterName,String strProductName){
		Map lreturn=[:]
		Boolean lResult=false
		List<String> lListJsonFinalQuotationInput=new ArrayList<String>()
		List<String> lListJsonFinalVehicleDataInput=new ArrayList<String>()
		try{
			lreturn.put('ListJsonFinalQuotationInput',lListJsonFinalQuotationInput)
			lreturn.put('ListJsonFinalVehicleDataInput',lListJsonFinalVehicleDataInput)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterDataMappingSheet)){
				return lreturn
			}
			Sheet lSheetMasterDataMapping=sheetMasterDataMappingSheet
			if(IGNUemaHelper.checkObjectEmptyOfList(listJsonQuotationInput)){
				return lreturn
			}
			List lListJsonQuotationInput=listJsonQuotationInput
			if(IGNUemaHelper.checkObjectEmptyOfList(listJsonVehicleData)){
				return lreturn
			}
			List lListJsonVehicleData=listJsonVehicleData
			if(IGNUemaHelper.checkObjectEmptyOfList(listTransactionType)){
				return lreturn
			}
			List lListTransactionType=listTransactionType
			if(IGNUemaHelper.checkObjectNullOfObject(strOptionalDataParameterName)){
				return lreturn
			}
			String lStrOptionalDataParameterName=strOptionalDataParameterName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrOptionalDataParameterName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strProductName)){
				return lreturn
			}
			String lStrProductName=strProductName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrProductName)){
				return lreturn
			}
			this.lIDNPricingApiGetPriceListUtil=new IDNPricingApiGetPriceListMainUtil()
			Map lMapQuotationInputParameterWithMasterParameterResult=this.inputMapQuotationInputParameterWithMasterParameter(lSheetMasterDataMapping,lStrOptionalDataParameterName,lStrProductName)
			if(lMapQuotationInputParameterWithMasterParameterResult.Result){
				Map  lMapQuotationInputParameterWithMasterParameterVehicleData=[:]
				if(lStrProductName.contains('Motor')){
					lMapQuotationInputParameterWithMasterParameterVehicleData=lMapQuotationInputParameterWithMasterParameterResult.VehicleDataParameter
				}
				Map lMapQuotationInputParameterWithMasterParameterInsuredList=lMapQuotationInputParameterWithMasterParameterResult.InsuredListParameter
				Map lMapQuotationInputParameterWithMasterParameterQuoteData=lMapQuotationInputParameterWithMasterParameterResult.QuoteDataParameter
				Map lMapQuotationInputParameterWithMasterParameterOptionalData=lMapQuotationInputParameterWithMasterParameterResult.OptionalDataParameter
				Map lMapQuotationInputParameterWithMasterParameterBrokerInformation=lMapQuotationInputParameterWithMasterParameterResult.BrokerInformationParameter
				Map lMapQuotationInputParameterWithMasterParameterInsuredData=lMapQuotationInputParameterWithMasterParameterResult.InsuredDataParameter
				Map lMapMasterVehicleDataParameter=[:]
				Map lMapMasterInsuredListParameter=[:]
				Map lMapMasterQuoteDataParameter=[:]
				Map lMapPreviousCoverDataParameter=[:]
				Map lMapMasterBrokerInformation=[:]
				Map lMapMasterInsuredData=[:]
				Map lMapMasterInsuredContactAddressData=[:]
				Map lMapMasterPolicyHolderData=[:]
				Map lMapMasterPolicyHolderContactAddressData=[:]
				Map lMapMasterVehicleData=[:]
				String  lStrMasterProductType=''
				String  lStrMasterProductName=''
				for(Integer lIndex=0;lIndex<lListJsonQuotationInput.size();lIndex++){
					Map lMapQuotationInputData=[:]
					lMapMasterVehicleDataParameter=[:]
					lMapMasterInsuredListParameter=[:]
					lMapMasterQuoteDataParameter=[:]
					lMapMasterBrokerInformation=[:]
					lMapMasterInsuredData=[:]
					lMapMasterPolicyHolderData=[:]
					List lListMasterInsuredParameter=[]
					List lListMasterOptionalDataParameter=[]
					String lStrQuotationInput=lListJsonQuotationInput.get(lIndex)
					Map lMapJson=new JsonSlurper().parseText(lStrQuotationInput)
					String lStrVehicleData=lListJsonVehicleData.get(lIndex)
					Map lMapJsonVehicleData=new JsonSlurper().parseText(lStrVehicleData)
					Map lMapQuotationInput=lMapJson.QuotationInput
					Map lMapVehicleDataInput=lMapQuotationInput.VehicleData
					Map lMapInsuredData=lMapJson.InsuredData
					Map lMapPolicyHolderData=lMapJson.PolicyHolderData
					for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterInsuredData){
						String lStrMasterKey=lEntry.key.toString()
						String lStrMasterKeyValue=lEntry.Value.toString()
						String lStrMasterValue=lMapInsuredData.getAt(lStrMasterKey)
						if(lStrMasterValue=='None'){
							lStrMasterValue=''
						}
						lMapMasterInsuredData.put(lStrMasterKeyValue,lStrMasterValue)
					}
					for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterInsuredData){
						String lStrMasterKey=lEntry.key.toString()
						String lStrMasterKeyValue=lEntry.Value.toString()
						String lStrMasterValue=lMapPolicyHolderData.getAt(lStrMasterKey)
						if(lStrMasterValue=='None'){
							lStrMasterValue=''
						}
						lMapMasterPolicyHolderData.put(lStrMasterKeyValue,lStrMasterValue)
					}
					for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterBrokerInformation){
						String lStrMasterKey=lEntry.key.toString()
						String lStrMasterKeyValue=lEntry.Value.toString()
						String lStrMasterValue=lMapQuotationInput.getAt(lStrMasterKey)
						if(lStrMasterValue=='None'){
							lStrMasterValue=''
						}
						lMapMasterBrokerInformation.put(lStrMasterKeyValue,lStrMasterValue)
					}
					lMapMasterQuoteDataParameter.put('brokerInfo',lMapMasterBrokerInformation)
					lMapMasterQuoteDataParameter.put('insuredData',lMapMasterInsuredData)
					lMapMasterQuoteDataParameter.put('policyHolderData',lMapMasterPolicyHolderData)
					for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterQuoteData){
						String lStrMasterKey=lEntry.key.toString()
						Map lMapMasterOptionalDataParameter=[:]
						String lStrMasterKeyValue=lEntry.Value.toString()
						if(lStrMasterKey==lStrOptionalDataParameterName){
							List lListMapOptionalDataValue=lMapQuotationInput.getAt(lStrMasterKey)
							for(Integer lDataIndex=0;lDataIndex<=lListMapOptionalDataValue.size()-1;lDataIndex++){
								Map lMapOptionalData=lListMapOptionalDataValue.get(lDataIndex)
								for(Map.Entry lOptionalDataEntry in lMapQuotationInputParameterWithMasterParameterOptionalData){
									String lStrOptionalDataKey=lOptionalDataEntry.key.toString()
									String lStrOptionalDataValue=lOptionalDataEntry.Value.toString()
									String lStrMasterValue=lMapOptionalData.getAt(lStrOptionalDataKey)
									lMapMasterOptionalDataParameter.put(lStrOptionalDataValue,lStrMasterValue)
								}
								lListMasterOptionalDataParameter.add(lMapMasterOptionalDataParameter)
								lMapMasterOptionalDataParameter=[:]
							}
							String lStrMasterOptionalDataParameterName=lMapQuotationInputParameterWithMasterParameterQuoteData.getAt(lStrOptionalDataParameterName)
							lMapMasterQuoteDataParameter.put(lStrMasterOptionalDataParameterName,lListMasterOptionalDataParameter)
						}else{
							String lStrMasterValue=lMapQuotationInput.getAt(lStrMasterKey)
							if(lStrMasterKeyValue=='covers'){
								List lListMapMasterCover=[]
								lMapMasterQuoteDataParameter.put(lStrMasterKeyValue,lListMapMasterCover)
							}else if(lStrMasterKeyValue=='Quote_Date_of_Quote'){
								Map lMapQuoteRequiredQuoteDate=lIDNPricingApiGetPriceListUtil.inputQuoteRequiredQuoteDate('Yes',lStrMasterValue,'')
								if(lMapQuoteRequiredQuoteDate.Result){
									String lQuoteDateValue=lMapQuoteRequiredQuoteDate.QuoteRequiredQuoteDate
									lMapMasterQuoteDataParameter.put(lStrMasterKeyValue,lQuoteDateValue)
								}
							}
							else if(lStrMasterKey=='productType'){
								lStrMasterProductType=lStrMasterKey
								lStrMasterProductName=lStrMasterKeyValue
								lMapMasterQuoteDataParameter.put(lStrMasterProductType,lStrMasterProductName)
							}else if(lStrMasterKeyValue=='transactionType'){
								String lTransactionType=lListTransactionType.get(lIndex)
								lMapMasterQuoteDataParameter.put(lStrMasterKeyValue,lTransactionType)
							}else{
								if(lStrMasterValue=='None'){
									lStrMasterValue=''
								}
								lMapMasterQuoteDataParameter.put(lStrMasterKeyValue,lStrMasterValue)
							}
						}
					}
					if(lListTransactionType.get(lIndex)=='Endorsement'||lListTransactionType.get(lIndex)=='Cancellation'){
						Map lMapQuotationInputParameterWithMasterParameterPreviousCoverParameter=lMapQuotationInputParameterWithMasterParameterResult.PreviousCoverParameter
						for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterPreviousCoverParameter){
							String lStrMasterKey=lEntry.key.toString()
							String lStrMasterValue=lEntry.value.toString()
							if(lStrMasterValue=='None'){
								lStrMasterValue=''
							}
							lMapPreviousCoverDataParameter.put(lStrMasterKey,lStrMasterValue)
						}
						lMapMasterQuoteDataParameter.put('PreviousCovers',lMapPreviousCoverDataParameter)
					}
					if(lStrProductName.contains('Motor')){
						List lListQuotationInputParameterWithMasterParameterVehicleData=[]
						Boolean lIsMapQuotationInputParameterWithMasterParameterVehicleDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapQuotationInputParameterWithMasterParameterVehicleData)
						if(lIsMapQuotationInputParameterWithMasterParameterVehicleDataEmpty){
							lListQuotationInputParameterWithMasterParameterVehicleData=[]
							lMapMasterQuoteDataParameter.put('vehicleData',lListQuotationInputParameterWithMasterParameterVehicleData)
						}else{
							Map lMapMasterOptionalDataParameter=[:]
							for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterVehicleData){
								String lStrMasterKey=lEntry.key.toString()
								String lStrMasterKeyValue=lEntry.Value.toString()
								if(lStrMasterKey==lStrOptionalDataParameterName){
									List lListMapOptionalDataValue=lMapQuotationInput.getAt(lStrMasterKey)
									for(Integer lDataIndex=0;lDataIndex<=lListMapOptionalDataValue.size()-1;lDataIndex++){
										Map lMapOptionalData=lListMapOptionalDataValue.get(lDataIndex)
										for(Map.Entry lOptionalDataEntry in lMapQuotationInputParameterWithMasterParameterOptionalData){
											String lStrOptionalDataKey=lOptionalDataEntry.key.toString()
											String lStrOptionalDataValue=lOptionalDataEntry.Value.toString()
											String lStrMasterValue=lMapOptionalData.getAt(lStrOptionalDataKey)
											lMapMasterOptionalDataParameter.put(lStrOptionalDataValue,lStrMasterValue)
										}
										lListMasterOptionalDataParameter.add(lMapMasterOptionalDataParameter)
										lMapMasterOptionalDataParameter=[:]
									}
									String lStrMasterOptionalDataParameterName=lMapQuotationInputParameterWithMasterParameterVehicleData.getAt(lStrOptionalDataParameterName)
									lMapMasterVehicleDataParameter.put(lStrMasterOptionalDataParameterName,lListMasterOptionalDataParameter)
								}else{
									String lStrMasterValue=lMapVehicleDataInput.getAt(lStrMasterKey)
									if(lStrMasterValue=='None'){
										lStrMasterValue=''
									}
									lMapMasterVehicleDataParameter.put(lStrMasterKeyValue,lStrMasterValue)
								}
							}
							lMapMasterQuoteDataParameter.put('vehicleData',lMapMasterVehicleDataParameter)
						}
						List lListPricingApiVehicleData=lMapJsonVehicleData.VehicleData
						Map lMapPricingApiVehicleData=lListPricingApiVehicleData.get(0)
						for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterVehicleData){
							String lStrMasterKey=lEntry.key.toString()
							String lStrMasterKeyValue=lEntry.Value.toString()
							Map lMapVehicleData=lMapPricingApiVehicleData.get(lStrMasterKey)
							lMapMasterVehicleData.put(lStrMasterKeyValue,lMapVehicleData)
						}
					}
					Map lMapRootQuotationInputData=[:]
					lMapQuotationInputData.put('quoteData',lMapMasterQuoteDataParameter)
					lMapRootQuotationInputData.put('root',lMapQuotationInputData)
					JsonBuilder lJsonQuotationInput=new JsonBuilder(lMapRootQuotationInputData)
					lListJsonFinalQuotationInput.add(lJsonQuotationInput.toString())
					if(lStrProductName.contains('Motor')){
						lMapJsonVehicleData.put('VehicleData',lMapMasterVehicleData)
						JsonBuilder lJsonVehicleData=new JsonBuilder(lMapJsonVehicleData)
						lListJsonFinalVehicleDataInput.add(lJsonVehicleData.toString())
					}
				}
			}
			if(!lStrProductName.contains('Motor')){
				lListJsonFinalVehicleDataInput=lListJsonVehicleData
			}
			lResult=lListJsonFinalQuotationInput.size()>0
			if(lResult){
				lreturn.put('ListJsonFinalQuotationInput',lListJsonFinalQuotationInput)
				lreturn.put('ListJsonFinalVehicleDataInput',lListJsonFinalVehicleDataInput)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map getMapPricingApiTransactionTypeAndHeaderFromExcelSheet(Sheet sheetPricingApi){
		Boolean lResult=false
		Map lreturn=[:]
		String lStrTransactionType=''
		String lStrTransactionHeader=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrTransactionHeader',lStrTransactionHeader)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetPricingApi)){
				return lreturn
			}
			Sheet lSheetPricingApi=sheetPricingApi
			lStrTransactionHeader=IDNPricingApiHelper.getValueFromExcelSheetForValidation(lSheetPricingApi,1,1)
			lResult=lStrTransactionHeader.length()>=1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrTransactionHeader',lStrTransactionHeader)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map getMapPricingApiProductTypeAndValueFromExcelSheet(Row rowPricingSheetFirstRow){
		Boolean lResult=false
		Map lreturn=[:]
		String lStrProductType=''
		String lStrProductName=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('StrProductType',lStrProductType)
			lreturn.put('StrProductName',lStrProductName)
			if(IGNUemaHelper.checkObjectNullOfObject(rowPricingSheetFirstRow)){
				return lreturn
			}
			Row lRowPricingApiSheetFirst=rowPricingSheetFirstRow
			Cell lCellProductVariable=lRowPricingApiSheetFirst.getCell(0)
			lStrProductType=lCellProductVariable.getStringCellValue()
			Cell lCellProductName=lRowPricingApiSheetFirst.getCell(1)
			lStrProductName=lCellProductName.getStringCellValue()
			lResult=lStrProductName.length()>1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('StrProductType',lStrProductType)
				lreturn.put('StrProductName',lStrProductName)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getTargetColumnIndexByColumnName(Sheet sheetPricingApiSheet,String strTargetColumnName,Integer numTargetRow,Integer numGenericDataSheetLastColumn){
		Integer lreturn=0
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetColumnName)){
			return lreturn
		}
		String lStrTargetColumnName=strTargetColumnName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetColumnName)){
			return lreturn
		}
		Integer lNumTargetRow=numTargetRow
		Integer lNumGenericDataSheetLastColumn=numGenericDataSheetLastColumn
		try{

			for(Integer lIndex=0;lIndex<=lNumGenericDataSheetLastColumn;lIndex++){
				Cell lCell=ExcelKeywords.getCellByIndex(sheetPricingApiSheet,lNumTargetRow,lIndex)
				if(!IGNUemaHelper.checkObjectNullOfObject(lCell)){
					String lStrCellValue=lCell.getStringCellValue()
					Integer lNumColumnIndex=lCell.getColumnIndex()
					if(lStrCellValue==lStrTargetColumnName){
						lreturn=lNumColumnIndex
						return lreturn=lNumColumnIndex
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map getMapHashTableInformationForProccesingInput(Map mapTargetInputList){
		Boolean lResult=false
		Map lreturn=[:]
		List lListMapTargetInputRowKey=[]
		try{
			lreturn.put('Result',lResult)
			lreturn.put('TargetInputRowKeyList',lListMapTargetInputRowKey)
			if(IGNUemaHelper.checkObjectNullOfObject(mapTargetInputList)){
				return lreturn
			}
			Map lMapCurrentCellTargetInputList=mapTargetInputList
			Table<Integer,Integer,String> lTableExcelSheetTargetInput=HashBasedTable.create()
			lTableExcelSheetTargetInput=lMapCurrentCellTargetInputList.CellTable
			Set<Integer> lTableTargetInputKeySet=lTableExcelSheetTargetInput.columnKeySet()
			for(Integer lTableKey:lTableTargetInputKeySet){
				Map lMapTargetInputRowColumnNumber=[:]
				Map lMapRowKey=lTableExcelSheetTargetInput.column(lTableKey)
				for(Map.Entry entry : lMapRowKey.entrySet()){
					lMapTargetInputRowColumnNumber.put('RowNumber',entry.getKey())
					lMapTargetInputRowColumnNumber.put('ColumnNumber',lTableKey)
				}
				lListMapTargetInputRowKey.add(lMapTargetInputRowColumnNumber)
			}
			lResult=lListMapTargetInputRowKey.size()>1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('TargetInputRowKeyList',lListMapTargetInputRowKey)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputMapQuotationInputParameterWithMasterParameter(Sheet sheetMasterDataMappingSheet,String strOptionalDataParameterName,String strProductName){
		Boolean lResult=false
		Map lreturn=[:]
		Map lMapVehicleDataParameter=[:]
		Map lMapInsuredListParameter=[:]
		Map lQuoteDataParameter=[:]
		Map lMapOptionalDataParameter=[:]
		Map lMapPreviousCoverParameter=[:]
		Map lMapBrokerInformationParameter=[:]
		Map lMapInsuredDataParameter=[:]
		List lListMappingRootDataParameter=[]
		String lStrOptionalDataParameterName=strOptionalDataParameterName.trim()
		try{
			lreturn.put('VehicleDataParameter',lMapVehicleDataParameter)
			lreturn.put('InsuredListParameter',lMapInsuredListParameter)
			lreturn.put('QuoteDataParameter',lQuoteDataParameter)
			lreturn.put('OptionalDataParameter',lMapOptionalDataParameter)
			lreturn.put('PreviousCoverParameter',lMapPreviousCoverParameter)
			lreturn.put('BrokerInformationParameter',lMapBrokerInformationParameter)
			lreturn.put('InsuredDataParameter',lMapInsuredDataParameter)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterDataMappingSheet)){
				return lreturn
			}
			Integer lNumGenericTestDataCellMerge=sheetMasterDataMappingSheet.getNumMergedRegions()
			CellRangeAddress[] lCellRangeAddressMergedList=new CellRangeAddress[sheetMasterDataMappingSheet.getNumMergedRegions()]
			for(Integer i=0; i < lCellRangeAddressMergedList.length; i++){
				lCellRangeAddressMergedList[i]=sheetMasterDataMappingSheet.getMergedRegion(i)
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strProductName)){
				return lreturn
			}
			String lStrProductName=strProductName
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrProductName)){
				return lreturn
			}
			Integer lNumLastRow=sheetMasterDataMappingSheet.getLastRowNum()
			CellRangeAddress lCellRangeAddressQuote
			CellRangeAddress lCellRangeAddressInsuredList
			CellRangeAddress lCellRangeAddressVehicleData
			CellRangeAddress lCellRangeAddressOptionalData
			CellRangeAddress lCellRangeAddressPreviousCoverData
			CellRangeAddress lCellRangeAddressBrokerInformation
			CellRangeAddress lCellRangeAddressInsuredData
			for(Integer lIndex=0;lIndex<lNumGenericTestDataCellMerge;lIndex++){
				Row lRowCurrent=sheetMasterDataMappingSheet.getRow(lCellRangeAddressMergedList[lIndex].getFirstRow())
				Cell lCell=lRowCurrent.getCell(lCellRangeAddressMergedList[lIndex].getFirstColumn())
				String lStrCellRangeAddressHeading=lCell.getStringCellValue()
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,'Quote')){
					lCellRangeAddressQuote=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,'insuredData')){
					lCellRangeAddressInsuredList=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,'vehicleData')){
					lCellRangeAddressVehicleData=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,lStrOptionalDataParameterName)){
					lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,'PreviousCovers')){
					lCellRangeAddressPreviousCoverData=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,'brokerInfo')){
					lCellRangeAddressBrokerInformation=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,'InsuredData')){
					lCellRangeAddressInsuredData=lCellRangeAddressMergedList[lIndex]
				}
			}
			List lListCurrentCellQuotationInput=[]
			Boolean lIsMappingWithMasterParameterDone=true
			Integer lNumCellRangeAddressQuotationInputColumnLast=lCellRangeAddressQuote.getLastColumn()-lCellRangeAddressQuote.getFirstColumn()
			Integer lQuotationLastRowNumber=lCellRangeAddressQuote.getLastRow()
			Map lMappingParameterQuoteDataResult=this.getMasterDataParameterMapping(lCellRangeAddressQuote,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMappingParameterQuoteDataResult.Result){
				lQuoteDataParameter=lMappingParameterQuoteDataResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Integer lInsuredListRowNumber=lCellRangeAddressInsuredList.getLastRow()
			Map lMappingParameterInsuredListResult=this.getMasterDataParameterMapping(lCellRangeAddressInsuredList,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMappingParameterInsuredListResult.Result){
				lMapInsuredListParameter=lMappingParameterInsuredListResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			if(lStrProductName.contains('Motor')){
				Integer lVehicleDataRowNumber=lCellRangeAddressVehicleData.getLastRow()
				Map lMappingParameterVehicleDataResult=this.getMasterDataParameterMapping(lCellRangeAddressVehicleData,sheetMasterDataMappingSheet,lNumLastRow)
				lMapVehicleDataParameter=lMappingParameterVehicleDataResult.MasterDataMappingParameter
				if(lMappingParameterVehicleDataResult.Result){
					lMapVehicleDataParameter=lMappingParameterVehicleDataResult.MasterDataMappingParameter
				}else{
					lIsMappingWithMasterParameterDone=false
				}
			}
			Map lMappingParameterOptionalDataResult=this.getMasterDataParameterMapping(lCellRangeAddressOptionalData,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMappingParameterOptionalDataResult.Result){
				lMapOptionalDataParameter=lMappingParameterOptionalDataResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Map lMappingParameterPreviousCoverResult=this.getMasterDataParameterMapping(lCellRangeAddressPreviousCoverData,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMappingParameterPreviousCoverResult.Result){
				lMapPreviousCoverParameter=lMappingParameterPreviousCoverResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Map lMappingParameterBrokerInformationResult=this.getMasterDataParameterMapping(lCellRangeAddressBrokerInformation,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMappingParameterBrokerInformationResult.Result){
				lMapBrokerInformationParameter=lMappingParameterBrokerInformationResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Map lMappingParameterInsuredDataResult=this.getMasterDataParameterMapping(lCellRangeAddressInsuredData,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMappingParameterInsuredDataResult.Result){
				lMapInsuredDataParameter=lMappingParameterInsuredDataResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			lResult=lIsMappingWithMasterParameterDone
			if(lResult){
				lreturn.put('VehicleDataParameter',lMapVehicleDataParameter)
				lreturn.put('InsuredListParameter',lMapInsuredListParameter)
				lreturn.put('QuoteDataParameter',lQuoteDataParameter)
				lreturn.put('OptionalDataParameter',lMapOptionalDataParameter)
				lreturn.put('PreviousCoverParameter',lMapPreviousCoverParameter)
				lreturn.put('BrokerInformationParameter',lMapBrokerInformationParameter)
				lreturn.put('InsuredDataParameter',lMapInsuredDataParameter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map getMasterDataParameterMapping(CellRangeAddress targetCellRangeAddress,Sheet targetSheet,Integer targetRowNumber){
		Boolean lResult=false
		Map lreturn=[:]
		Map lMasterDataMappingParameter=[:]
		try{
			lreturn.put('MasterDataMappingParameter',lMasterDataMappingParameter)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(targetCellRangeAddress)){
				return lreturn
			}
			List lListCellCurrentMappingParameter=[]
			List lListCurrentCellMappingParameterAll=new ArrayList()
			Integer lNumTargetRangeAddressColumnLast=targetCellRangeAddress.getLastColumn()-targetCellRangeAddress.getFirstColumn()
			for(Integer lIndex=1;lIndex<targetRowNumber;lIndex++){
				Row lRowCurrent=targetSheet.getRow(targetCellRangeAddress.getFirstRow()+lIndex)
				Map lMapCurrentCellMappingParameterList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(targetSheet,targetCellRangeAddress,lRowCurrent,lNumTargetRangeAddressColumnLast,false)
				if(lMapCurrentCellMappingParameterList.Result){
					lListCellCurrentMappingParameter=lMapCurrentCellMappingParameterList.CellValueList
					Boolean lIsCheckCurrentCellListValueContainSameStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lListCellCurrentMappingParameter,'None')
				}
				Boolean lIsCheckCurrentCellListValueContainSameStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lListCellCurrentMappingParameter,'None')
				if(lIsCheckCurrentCellListValueContainSameStringNone){
					lListCellCurrentMappingParameter=[]
				}
				if(!IGNUemaHelper.checkObjectEmptyOfList(lListCellCurrentMappingParameter)){
					lListCurrentCellMappingParameterAll.add(lListCellCurrentMappingParameter)
					lMasterDataMappingParameter.put(lListCellCurrentMappingParameter.get(0),lListCellCurrentMappingParameter.get(1))
				}
			}
			lResult=lListCurrentCellMappingParameterAll.size()>=0
			if(lResult){
				lreturn.put('MasterDataMappingParameter',lMasterDataMappingParameter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map<String,Object> getMapQuotationInputValueFromExcelSpecificRange(Workbook workBookTestExcelFileGenericTestData,Sheet targetSheet,CellRangeAddress targetCellRangeAddress,Row targetRow,Integer targetColumnNumber,Boolean boolIsRecordCellTable,Boolean boolIsCheckEmptyRowValue){
		Map<String,Object> lreturn=[:]
		Boolean lResult=false
		try{
			lreturn=new HashMap<>()
			List<String> lListCellValue=new ArrayList<>()
			Table<Integer,Integer,String> lTableExcelSheetSrc=HashBasedTable.create()
			lreturn.put('CellValueList',lListCellValue)
			lreturn.put('CellTable',lTableExcelSheetSrc)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				return lreturn
			}
			Sheet lSheetTarget=targetSheet
			if(IGNUemaHelper.checkObjectNullOfObject(targetCellRangeAddress)){
				return lreturn
			}
			CellRangeAddress lTargetCellRangeAddress=targetCellRangeAddress
			if(IGNUemaHelper.checkObjectNullOfObject(targetRow)){
				return lreturn
			}
			Row lTargetRow=targetRow
			if(targetColumnNumber<0){
				return lreturn
			}
			Integer lNumTargetColumnIndex=targetColumnNumber
			Boolean lIsRecordCellTable=boolIsRecordCellTable
			Boolean lIsCheckEmptyRowValue=boolIsCheckEmptyRowValue
			String lStrCellValue=''
			String lStrStartDateText=''
			String lStrPolicyStartDateOffset=''
			String lStrPolicyEffectiveDateOffset=''
			for(Integer lIndex=0;lIndex<=lNumTargetColumnIndex;lIndex++){
				Cell lCell=lTargetRow.getCell(lTargetCellRangeAddress.getFirstColumn()+lIndex)
				Row lRowCurrent=lSheetTarget.getRow(lTargetCellRangeAddress.firstRow+1)
				Cell lCellHeader=lRowCurrent.getCell(lTargetCellRangeAddress.getFirstColumn()+lIndex)
				String lStrHeaderValueObject=''
				String lStrDataFormatterObjectValue=''
				try{
					lStrDataFormatterObjectValue=ExcelKeywords.getCellValueByIndex(lSheetTarget,lTargetRow.getRowNum(),lTargetCellRangeAddress.getFirstColumn()+lIndex)
					lStrHeaderValueObject=ExcelKeywords.getCellValueByIndex(lSheetTarget,lRowCurrent.getRowNum(),lTargetCellRangeAddress.getFirstColumn()+lIndex)
					if(lStrHeaderValueObject=='StartDayOffset'){
						if(!(IGNUemaHelper.checkObjectEmptyOfString(lStrDataFormatterObjectValue))){
							lStrPolicyStartDateOffset=lStrDataFormatterObjectValue
						}
					}
					else if(lStrHeaderValueObject=='StartDate'){
						lStrDataFormatterObjectValue=lStrPolicyStartDateOffset
					}
					else if(lStrHeaderValueObject=='EffectiveDayOffset'){
						if(!(IGNUemaHelper.checkObjectEmptyOfString(lStrDataFormatterObjectValue))){
							lStrPolicyEffectiveDateOffset=lStrDataFormatterObjectValue
						}
					}
					else if(lStrHeaderValueObject=='EffectiveDate'){
						lStrDataFormatterObjectValue=lStrPolicyEffectiveDateOffset
					}
					else if(lStrHeaderValueObject=='FirstQuote'){
						lStrDataFormatterObjectValue=lStrPolicyStartDateOffset
					}else{
						if(!IGNUemaHelper.checkObjectNullOfObject(lCell)){
							CellType lCellType=lCell.getCellTypeEnum()
							if((lCellType==CellType.NUMERIC)){
								if(DateUtil.isCellDateFormatted(lCell)){
									Date lDate=lCell.getDateCellValue()
									String lStrDateFormat='yyyy-MM-dd'
									String lStrDateText=lDate.format(lStrDateFormat)
									lStrDataFormatterObjectValue=lStrDateText
								}else{
									lStrDataFormatterObjectValue=IGNUemaHelper.getStrDataFormatterOfExcelCell(lCell)
								}
							}else{
								lStrDataFormatterObjectValue=IGNUemaHelper.getStrDataFormatterOfExcelCell(lCell)
							}
						}
					}
					if(lStrDataFormatterObjectValue.isEmpty()){
						lStrCellValue='None'
					}else{
						lStrCellValue=lStrDataFormatterObjectValue.trim()
					}
					if(lIsRecordCellTable){
						Integer lNumRowIndex=lTargetRow.getRowNum()
						Integer lNumColumnIndex=lTargetCellRangeAddress.getFirstColumn()+lIndex
						lTableExcelSheetSrc.put(lNumRowIndex,lNumColumnIndex,lStrCellValue)
					}
					lListCellValue.add(lStrCellValue)
					lResult=lListCellValue.size()>=0
				}catch(Exception ex){
					//ex.printStackTrace()
				}
			}
			if(lIsCheckEmptyRowValue){
				Boolean lIsCheckQuotationInputListContainString=IGNUemaHelper.checkAllValueInListContainSameString(lListCellValue,'None')
				if(lIsCheckQuotationInputListContainString){
					lListCellValue=[]
				}
			}
			if(lResult){
				lreturn.put('CellValueList',lListCellValue)
				lreturn.put('CellTable',lTableExcelSheetSrc)
				lreturn.put('Result',lResult)
			}
		}catch(Exception ex){
			//ex.printStackTrace()
			return lreturn
		}
	}
	public static Map inputMapTargetParameterWithMasterParameter(Sheet sheetMasterDataMappingSheet,String strParameter){
		Boolean lResult=false
		Map lreturn=[:]
		Boolean lIsMappingWithMasterParameterDone=true
		Map lMapTargetParameterWithMasterParameter=[:]
		try{
			lreturn.put('MasterDataParameter',lMapTargetParameterWithMasterParameter)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterDataMappingSheet)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(strParameter)){
				return lreturn
			}
			String lStrTargetParameter=strParameter
			Integer lNumGenericTestDataCellMerge=sheetMasterDataMappingSheet.getNumMergedRegions()
			CellRangeAddress[] lCellRangeAddressMergedList=new CellRangeAddress[sheetMasterDataMappingSheet.getNumMergedRegions()]
			for(Integer lIndex=0;lIndex<lCellRangeAddressMergedList.size();lIndex++){
				lCellRangeAddressMergedList[lIndex]=sheetMasterDataMappingSheet.getMergedRegion(lIndex)
			}
			Integer lNumLastRow=sheetMasterDataMappingSheet.getLastRowNum()
			CellRangeAddress lCellRangeAddressRedBook=null
			for(Integer lIndex=0;lIndex<lNumGenericTestDataCellMerge;lIndex++){
				Row lRowCurrent=sheetMasterDataMappingSheet.getRow(lCellRangeAddressMergedList[lIndex].getFirstRow())
				Cell lCell=lRowCurrent.getCell(lCellRangeAddressMergedList[lIndex].getFirstColumn())
				String lStrCellRangeAddressHeading=lCell.getStringCellValue()
				if(IGNUemaHelper.checkStringContainString(lStrCellRangeAddressHeading,lStrTargetParameter)){
					lCellRangeAddressRedBook=lCellRangeAddressMergedList[lIndex]
				}
			}
			Integer lNumRedBookVehicleDataRow=lCellRangeAddressRedBook.getLastRow()
			Map lMapTargetParameterWithMasterDataParameterResult=this.getMasterDataParameterMapping(lCellRangeAddressRedBook,sheetMasterDataMappingSheet,lNumLastRow)
			if(lMapTargetParameterWithMasterDataParameterResult.Result){
				lMapTargetParameterWithMasterParameter=lMapTargetParameterWithMasterDataParameterResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			lResult=lIsMappingWithMasterParameterDone
			if(lResult){
				lreturn.put('MasterDataParameter',lMapTargetParameterWithMasterParameter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception ex){
			//ex.printStackTrace()
			return lreturn
		}
	}
}