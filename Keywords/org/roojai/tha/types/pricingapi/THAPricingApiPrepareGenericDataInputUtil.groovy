package org.roojai.tha.types.pricingapi
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
import org.roojai.tha.types.pricingapi.THAPricingApiGetPriceListMainUtil
import org.roojai.tha.types.pricingapi.THAPricingApiPrepareGenericDataInputUtil
public class THAPricingApiPrepareGenericDataInputUtil{
	public THAPricingApiPrepareGenericDataInputUtil(){
		super()
	}
	private THAPricingApiGetPriceListMainUtil lIDNPricingApiGetPriceListUtil=null
	private THAPricingApiGetPriceListMainUtil getlIDNPricingApiGetPriceListUtil(){
		return this.lIDNPricingApiGetPriceListUtil
	}
	private void setlIDNPricingApiGetPriceListUtil(THAPricingApiGetPriceListMainUtil newlIDNPricingApiGetPriceListUtil){
		//Do Nothing
	}
	public static final Hashtable<String,ArrayList<String>> PRODUCT_CODE_TABLE=new Hashtable<String,ArrayList<String>>()
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_MOTOR_CAR='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_MotorCar.xlsx'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_MOTOR_BIKE='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_MotorBike.xlsx'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_PERSONAL_ACCIDENT='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_NonMotor_PA.xlsx'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_CANCER='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_NonMotor_CA.xlsx'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_CRITICAL_ILLNESS='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_NonMotor_CI.xlsx'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_MACRO_MOTOR_CAR='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_MotorCar.xlsm'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_MACRO_MOTOR_BIKE='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_MotorBike.xlsm'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_MACRO_NON_MOTOR_PERSONAL_ACCIDENT='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_NonMotor_PA.xlsm'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_MACRO_NON_MOTOR_CANCER='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_NonMotor_CA.xlsm'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_MACRO_NON_MOTOR_CRITICAL_ILLNESS='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_NonMotor_CI.xlsm'
	public static final String CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER='Data Files/ZPrepareHere/Ignite/IDN/Excel_IgniteUniversalTestData_UserDataPricingAPIAll.xlsx'
	public  Boolean inputGenericPricingApiDataToUserDataSheet(){
		String lResult=''
		Boolean lreturn=false
		this.PRODUCT_CODE_TABLE.put("ProductCode",Arrays.asList('1','2','3','4','5'))
		List lProductCodeList=this.PRODUCT_CODE_TABLE.get("ProductCode")
		IGNUemaHelper.printLog('lProductCodeList')
		IGNUemaHelper.printLog(lProductCodeList)
		try{
			for(Integer lMainIndex=0;lMainIndex<=lProductCodeList.size()-1;lMainIndex++){
				String lStrProductCode=lProductCodeList.get(lMainIndex)
				IGNUemaHelper.printLog('lStrProductCode')
				IGNUemaHelper.printLog(lStrProductCode)
				Integer lInputProductCode=IGNUemaHelper.convertStringToInteger(lStrProductCode,0)
				Workbook lTestExcelFileGenericTestDataWorkBook=null
				Sheet lPricingApiSheet=null
				String lExcelGenericFilename=''
				switch(lInputProductCode){
					case '2':
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_MOTOR_BIKE)
						lExcelGenericFilename=this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_MOTOR_BIKE
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						break
					case  '3':
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_PERSONAL_ACCIDENT)
						lExcelGenericFilename=this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_PERSONAL_ACCIDENT
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						break
					case  '4':
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_CANCER)
						lExcelGenericFilename=this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_CANCER
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						break
					case '5':
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_CRITICAL_ILLNESS)
						lExcelGenericFilename=this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_NON_MOTOR_CRITICAL_ILLNESS
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						break
					default:
						lTestExcelFileGenericTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_MOTOR_CAR)
						lExcelGenericFilename=this.CURRENT_TEST_TRANSFORM_DATA_FILE_INPUT_GENERIC_MOTOR_CAR
						lPricingApiSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'PricingAPI')
						break
				}
				if(!IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileGenericTestDataWorkBook)){
					if(IGNUemaHelper.checkObjectNullOfObject(lPricingApiSheet)){
						IGNUemaHelper.printLog('PricingApi Generic  Sheet not valid')
						return lreturn
					}
					this.lIDNPricingApiGetPriceListUtil=new THAPricingApiGetPriceListMainUtil()
					Workbook lTestExcelFileUserTestDataWorkBook=IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER)
					Sheet lPricingApiUserSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileUserTestDataWorkBook,'UserDataPricingAPIAll')
					Integer lPricingApiSheetFirstRowNum=lPricingApiSheet.getFirstRowNum()
					Row lPricingApiSheetFirstRow=lPricingApiSheet.getRow(lPricingApiSheetFirstRowNum)
					Integer lLastRowNumber=lPricingApiSheet.getLastRowNum()
					Row lFirstRow=lPricingApiSheet.getRow(lPricingApiSheetFirstRowNum+1)
					Integer lGenericDataSheetLastColumnNum=lFirstRow.getLastCellNum()
					Integer lTargetedRowNumber=lFirstRow.rowNum
					Integer lSubSetColumnIndex=0
					Integer lTransactionColumnIndex=0
					Integer lReferCaseIndex=0
					for(Integer lIndex=0;lIndex<lGenericDataSheetLastColumnNum;lIndex++){
						Cell lTrackCell=ExcelKeywords.getCellByIndex(lPricingApiSheet,lTargetedRowNumber,lIndex)
						String lCellValue=lTrackCell.getStringCellValue()
						Integer lColumnIndex=lTrackCell.getColumnIndex()
						if(lCellValue=='Subset'){
							lSubSetColumnIndex=lColumnIndex
						}
						if(lCellValue=='TransactionType'){
							lTransactionColumnIndex=lColumnIndex
						}
						if(lCellValue=='ReferSubset'){
							lReferCaseIndex=lColumnIndex
						}
					}
					Boolean lIsWriteTestDataOk=true
					Integer lUserDataSheetFirstRowNum=lPricingApiUserSheet.getFirstRowNum()
					Integer lLastRow=lPricingApiUserSheet.getLastRowNum()
					Row lPricingApiUserSheetCurrentRow=lPricingApiUserSheet.getRow(lUserDataSheetFirstRowNum)
					Integer lCurrentRowNumber=lPricingApiUserSheetCurrentRow.rowNum
					Integer lUserDataSheetLastColumnNum=lPricingApiUserSheetCurrentRow.getLastCellNum()
					Integer lAppendIndex
					String lTestCaseNumber=''
					for(Integer lIndex=0;lIndex<lUserDataSheetLastColumnNum;lIndex++){
						Cell lTrackCell=ExcelKeywords.getCellByIndex(lPricingApiUserSheet,lCurrentRowNumber,lIndex)
						String lCellValue=lTrackCell.getStringCellValue()
						Integer lColumnIndex=lTrackCell.getColumnIndex()
						if(lCellValue=='PricingApiJsonRootQuotationInputPartOne'){
							for(Integer lInputIndex=1;lInputIndex<=lLastRow;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lInputIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lExcelCellvalue=ExcelKeywords.getCellValueByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex)
								if(lExcelCellvalue.isEmpty()){
									lAppendIndex=lInputIndex
									break
								}
							}
						}
					}
					for(Integer lIndex=0;lIndex<lUserDataSheetLastColumnNum;lIndex++){
						Cell lCurrentCell=ExcelKeywords.getCellByIndex(lPricingApiUserSheet,lCurrentRowNumber,lIndex)
						String lCellValue=lCurrentCell.getStringCellValue()
						Integer lColumnIndex=lCurrentCell.getColumnIndex()
						IGNUemaHelper.printLog('Inside Loop')
						Integer lTestCaseIndex=lAppendIndex
						if(lCellValue=='Test_Case_No'){
							Row lInputRow=lPricingApiUserSheet.getRow(lTestCaseIndex)
							Integer lRowIndex=lInputRow.rowNum
							lTestCaseNumber=lIDNPricingApiGetPriceListUtil.getValueFromExcelSheetForValidation(lPricingApiUserSheet,lRowIndex,lColumnIndex)
							lTestCaseIndex=lTestCaseIndex+1
						}
					}
					IGNUemaHelper.printLog('lFirstCaseNumber')
					IGNUemaHelper.printLog(lTestCaseNumber)
					String lProductVariable=''
					String lProductName=''
					Map lMapGetProductTypeAndValueResult=this.getMapProductTypeAndValueFromExcelSheet(lPricingApiSheetFirstRow)
					if(lMapGetProductTypeAndValueResult.Result){
						lProductVariable=lMapGetProductTypeAndValueResult.ProductType
						lProductName=lMapGetProductTypeAndValueResult.ProductName
					}
					IGNUemaHelper.printLog('lProductVariable')
					IGNUemaHelper.printLog(lProductVariable)
					IGNUemaHelper.printLog(lProductName)
					Map lMapGetTransactionHeader=this.getMapTransactionTypeAndHeaderFromExcelSheet(lPricingApiSheet)
					String lTransactionTypeHeader=lIDNPricingApiGetPriceListUtil.getValueFromExcelSheetForValidation(lPricingApiSheet,1,1)
					Integer lNumGenericTestDataCellMergeList=lPricingApiSheet.getNumMergedRegions()
					CellRangeAddress[] lCellRangeAddressMergedList=new CellRangeAddress[lNumGenericTestDataCellMergeList]
					for(Integer lIndex=0;lIndex<lCellRangeAddressMergedList.length;lIndex++){
						lCellRangeAddressMergedList[lIndex]=lPricingApiSheet.getMergedRegion(lIndex)
					}
					CellRangeAddress lCellRangeAddressQuotationInput
					CellRangeAddress lCellRangeAddressPlanOption
					CellRangeAddress lCellRangeAddressMultiCover
					CellRangeAddress lCellRangeAddressAdditionalCoverage
					CellRangeAddress lCellRangeAddressOptionalData
					CellRangeAddress lCellRangeAddressInputPremium
					CellRangeAddress lCellRangeAddressPayment
					CellRangeAddress lCellRangeAddressTransaction
					CellRangeAddress lCellRangeAddressPremium
					CellRangeAddress lCellRangeAddressVehicleData
					String lOptionalDataParameterName
					for(Integer lIndex=0;lIndex<lNumGenericTestDataCellMergeList;lIndex++){
						Row lCurrentRow=lPricingApiSheet.getRow(lCellRangeAddressMergedList[lIndex].getFirstRow())
						Cell lCell=lCurrentRow.getCell(lCellRangeAddressMergedList[lIndex].getFirstColumn())
						IGNUemaHelper.printLog(lCell)
						String lCellRangeAddressHeading=lCell.getStringCellValue()
						IGNUemaHelper.printLog('lCellRangeAddressHeading')
						IGNUemaHelper.printLog(lCellRangeAddressHeading)
						if(lCellRangeAddressHeading=='QuotationInput'){
							lCellRangeAddressQuotationInput=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='VehicleAccessories'){
							lOptionalDataParameterName=lCellRangeAddressHeading
							lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='HealthQuestion'){
							lOptionalDataParameterName=lCellRangeAddressHeading
							lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='NamedDriver'){
							lOptionalDataParameterName=lCellRangeAddressHeading
							lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='PlanOption'){
							lCellRangeAddressPlanOption=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='MultiCover'){
							lCellRangeAddressMultiCover=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='AdditionalCoverage'){
							lCellRangeAddressAdditionalCoverage=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='InputPremium'){
							lCellRangeAddressInputPremium=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='Payment'){
							lCellRangeAddressPayment=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='Transaction'){
							lCellRangeAddressTransaction=lCellRangeAddressMergedList[lIndex]
						}
						if(lCellRangeAddressHeading=='Premium'){
							lCellRangeAddressPremium=lCellRangeAddressMergedList[lIndex]
							IGNUemaHelper.printLog(lCellRangeAddressMergedList[lIndex])
						}
						if(lCellRangeAddressHeading=='VehicleData'){
							lCellRangeAddressVehicleData=lCellRangeAddressMergedList[lIndex]
						}
					}
					Row lSubHeaderRow=lPricingApiSheet.getRow(lCellRangeAddressMergedList[0].getFirstRow()+1)
					Boolean lCheckRow=IGNUemaHelper.checkObjectNullOfObject(lSubHeaderRow)
					List<String> lQuotationInputSubHeaderList=[]
					Integer lCellRangeAddressQuotationInputColumnLast=lCellRangeAddressQuotationInput.getLastColumn()-lCellRangeAddressQuotationInput.getFirstColumn()
					Map lMapQuotationInputSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressQuotationInput,lSubHeaderRow,lCellRangeAddressQuotationInputColumnLast,false)
					if(lMapQuotationInputSubHeaderList.Result){
						lQuotationInputSubHeaderList=lMapQuotationInputSubHeaderList.CellValueList
					}
					List<String> lPlanOptionSubHeaderList=[]
					Integer lCellRangeAddressPlanOptionColumnLast=lCellRangeAddressPlanOption.getLastColumn()-lCellRangeAddressPlanOption.getFirstColumn()
					Map lMapPlanOptionSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressPlanOption,lSubHeaderRow,lCellRangeAddressPlanOptionColumnLast,false)
					if(lMapPlanOptionSubHeaderList.Result){
						lPlanOptionSubHeaderList=lMapPlanOptionSubHeaderList.CellValueList
					}
					List<String> lMultiCoverSubHeaderList=[]
					Integer lCellRangeAddressMultiCoverColumnLast=lCellRangeAddressMultiCover.getLastColumn()-lCellRangeAddressMultiCover.getFirstColumn()
					Map lMapMultiCoverSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressMultiCover,lSubHeaderRow,lCellRangeAddressMultiCoverColumnLast,false)
					if(lMapMultiCoverSubHeaderList.Result){
						lMultiCoverSubHeaderList=lMapMultiCoverSubHeaderList.CellValueList
					}
					List<String> lOptionalDataSubHeaderList=[]
					Integer lCellRangeAddressOptionalDataColumnLast=lCellRangeAddressOptionalData.getLastColumn()-lCellRangeAddressOptionalData.getFirstColumn()
					Map lMapOptionalDataSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressOptionalData,lSubHeaderRow,lCellRangeAddressOptionalDataColumnLast,false)
					if(lMapOptionalDataSubHeaderList.Result){
						lOptionalDataSubHeaderList=lMapOptionalDataSubHeaderList.CellValueList
					}
					List<String> lAdditionalCoverageSubHeaderList=[]
					Integer lCellRangeAddressAdditionalCoverageColumnLast=lCellRangeAddressAdditionalCoverage.getLastColumn()-lCellRangeAddressAdditionalCoverage.getFirstColumn()
					Map lMapAdditionalCoverageSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressAdditionalCoverage,lSubHeaderRow,lCellRangeAddressAdditionalCoverageColumnLast,false)
					if(lMapAdditionalCoverageSubHeaderList.Result){
						lAdditionalCoverageSubHeaderList=lMapAdditionalCoverageSubHeaderList.CellValueList
					}
					List<String> lInputPremiumSubHeaderList=[]
					Integer lCellRangeAddressInputPremiumColumnLast=lCellRangeAddressInputPremium.getLastColumn()-lCellRangeAddressInputPremium.getFirstColumn()
					Map lMapInputPremiumSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressInputPremium,lSubHeaderRow,lCellRangeAddressInputPremiumColumnLast,false)
					if(lMapInputPremiumSubHeaderList.Result){
						lInputPremiumSubHeaderList=lMapInputPremiumSubHeaderList.CellValueList
					}
					List<String> lPaymentSubHeaderList=[]
					Integer lCellRangeAddressPaymentColumnLast=lCellRangeAddressPayment.getLastColumn()-lCellRangeAddressPayment.getFirstColumn()
					Map lMapPaymentSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressPayment,lSubHeaderRow,lCellRangeAddressPaymentColumnLast,false)
					if(lMapPaymentSubHeaderList.Result){
						lPaymentSubHeaderList=lMapPaymentSubHeaderList.CellValueList
					}
					List<String> lTransactionSubHeaderList=[]
					Integer lCellRangeAddressTransactionColumnLast=lCellRangeAddressTransaction.getLastColumn()-lCellRangeAddressTransaction.getFirstColumn()
					Map lMapTransactionSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressTransaction,lSubHeaderRow,lCellRangeAddressTransactionColumnLast,false)
					if(lMapTransactionSubHeaderList.Result){
						lTransactionSubHeaderList=lMapTransactionSubHeaderList.CellValueList
					}
					List<String> lPremiumSubHeaderList=[]
					Integer lCellRangeAddressPremiumColumnLast=lCellRangeAddressPremium.getLastColumn()-lCellRangeAddressPremium.getFirstColumn()
					Map lMapPremiumSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressPremium,lSubHeaderRow,lCellRangeAddressPremiumColumnLast,false)
					if(lMapPremiumSubHeaderList.Result){
						lPremiumSubHeaderList=lMapPremiumSubHeaderList.CellValueList
					}
					List<String> lVehicleDataSubHeaderList=[]
					Integer lCellRangeAddressVehicleDataColumnLast=lCellRangeAddressVehicleData.getLastColumn()-lCellRangeAddressVehicleData.getFirstColumn()
					Map lMapVehicleDataSubHeaderList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressVehicleData,lSubHeaderRow,lCellRangeAddressVehicleDataColumnLast,false)
					if(lMapVehicleDataSubHeaderList.Result){
						lVehicleDataSubHeaderList=lMapVehicleDataSubHeaderList.CellValueList
					}
					List lCurrentCellQuotationInputList=[]
					List lCurrentCellVehicleDataList=[]
					List lCurrentCellOptionalDataList=[]
					List lCurrentCellPlanOptionList=[]
					List lCurrentCellMultiCover=[]
					List lCurrentCellMultiCoverDataList=[]
					List lCurrentCellAdditionalCoverageList=[]
					List lCurrentCellInputPremiumList=[]
					List lCurrentCellPaymentList=[]
					List lCurrentCellTransactionList=[]
					List lCurrentCellPremiumList=[]
					List lJsonQuotationInputList=[]
					List lJsonVehicleDataList=[]
					List lJsonPremiumList=[]
					List lJsonPlanOptionList=[]
					List lJsonMultiCoverList=[]
					List lJsonPlanAdditionalCoverageDataList=[]
					List lJsonInputPremiumDataList=[]
					List lJsonPaymentList=[]
					List lJsonTransactionList=[]
					List lQuotationInputDateList=[]
					List<String> lReferCaseNumberList=[]
					List<String> lQuotationInputList=new ArrayList<String>()
					List<String> lVehicleDataList=new ArrayList<String>()
					List<String> lTransactionList=new ArrayList<String>()
					List<String> lOptionalDataList=new ArrayList<String>()
					List<String> lPlanOptionList=new ArrayList<String>()
					List<String> lMultiCoverList=new ArrayList<String>()
					List<String> lAdditionalCoverageList=new ArrayList<String>()
					List<String> lInputPremiumList=new ArrayList<String>()
					List<String> lPremiumList=new ArrayList<String>()
					List<String> lPaymentList=new ArrayList<String>()
					List<String> lTransactionTypeList=new ArrayList<String>()
					List lPlanOptionListAll=new ArrayList()
					List lPaymentRowKeyList=new ArrayList()
					List lPlanOptionRowKeyListAll=new ArrayList()
					List lPlanOptionRowKeyList=new ArrayList()
					Boolean lIsMultiCoverFlag=true
					List lMultiCoverListAll=new ArrayList()
					List lSubsetListAll=new ArrayList()
					List lReferSubSetListAll=new ArrayList()
					String lPreviousMultiCover=''
					List lAdditionalCoverageListAll=new ArrayList()
					List lInputPremiumListAll=new ArrayList()
					List lPaymentListAll=new ArrayList()
					List lTransactionListAll=new ArrayList()
					List lPremiumListAll=new ArrayList()
					IGNUemaHelper.printLog('lLastRowNumber')
					IGNUemaHelper.printLog(lLastRowNumber)
					for(Integer lIndex=2;lIndex<=lLastRowNumber;lIndex++){
						IGNUemaHelper.printLog('llCellRangeAddressQuotationInput.getFirstRow()'+lIndex)
						String lSubSetValue=lIDNPricingApiGetPriceListUtil.getValueFromExcelSheetForValidation(lPricingApiSheet,lIndex,lSubSetColumnIndex)
						String lReferTestCaseValue=lIDNPricingApiGetPriceListUtil.getValueFromExcelSheetForValidation(lPricingApiSheet,lIndex,lReferCaseIndex)
						if(!lReferTestCaseValue.isEmpty()){
							lReferSubSetListAll.add(lReferTestCaseValue)
						}
						if(!lSubSetValue.isEmpty()){
							lSubsetListAll.add(lSubSetValue)
						}
						String lTransactionTypeValue=lIDNPricingApiGetPriceListUtil.getValueFromExcelSheetForValidation(lPricingApiSheet,lIndex,lTransactionColumnIndex)
						Integer lLastTransactionIndex=lTransactionTypeList.size()-1
						IGNUemaHelper.printLog(lTransactionTypeList+''+lTransactionTypeList.size()+''+lLastTransactionIndex)
						if(IGNUemaHelper.checkObjectEmptyOfString(lTransactionTypeValue)){
							lTransactionTypeValue=lTransactionTypeList.get(lLastTransactionIndex)
							Boolean lIsWriteTransactionTypeValueToSheet=lIDNPricingApiGetPriceListUtil.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lIndex,lTransactionColumnIndex,lTransactionTypeValue)
							if(!lIsWriteTransactionTypeValueToSheet){
								return lreturn
							}
						}else{
							lTransactionTypeList.add(lTransactionTypeValue)
						}
						Row lCurrentRow=lPricingApiSheet.getRow(lCellRangeAddressQuotationInput.getFirstRow()+lIndex)
						Map lMapCurrentCellQuotationInputList=this.getMapQuotationInputValueFromExcelSpecificRange(lTestExcelFileGenericTestDataWorkBook,lPricingApiSheet,lCellRangeAddressQuotationInput,lCurrentRow,lCellRangeAddressQuotationInputColumnLast,true)
						if(lMapCurrentCellQuotationInputList.Result){
							lCurrentCellQuotationInputList=lMapCurrentCellQuotationInputList.CellValueList
						}
						Boolean lIsCurrentCellQuotationInputListValueAllContainStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lCurrentCellQuotationInputList,'None')
						if(lIsCurrentCellQuotationInputListValueAllContainStringNone){
							lCurrentCellQuotationInputList=[]
						}
						List lMapPlanOptionRowKeyList=[]
						Map lMapCurrentCellPlanOptionList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressPlanOption,lCurrentRow,lCellRangeAddressPlanOptionColumnLast,true)
						if(lMapCurrentCellPlanOptionList.Result){
							lCurrentCellPlanOptionList=lMapCurrentCellPlanOptionList.CellValueList
							Map lMapPlanOptionRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellPlanOptionList)
							if(lMapPlanOptionRowKeyListResult.Result){
								lMapPlanOptionRowKeyList=lMapPlanOptionRowKeyListResult.TargetInputRowKeyList
								IGNUemaHelper.printLog(lMapPlanOptionRowKeyList)
							}
						}
						lPlanOptionRowKeyList.add(lMapPlanOptionRowKeyList)
						IGNUemaHelper.printLog('Get Plan Option Table')
						IGNUemaHelper.printLog(lMapPlanOptionRowKeyList)
						if(!lCurrentCellPlanOptionList.isEmpty()){
							lPlanOptionList.add(lCurrentCellPlanOptionList)
						}
						Map lQuotationInputDate=[:]
						List lMapQuotationInputRowKeyList=[]
						Map lMapQuotationInputRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellQuotationInputList)
						if(lMapQuotationInputRowKeyListResult.Result){
							lMapQuotationInputRowKeyList=lMapQuotationInputRowKeyListResult.TargetInputRowKeyList
						}
						IGNUemaHelper.printLog('lMapQuotationInputRowKeyList')
						IGNUemaHelper.printLog(lMapQuotationInputRowKeyList)
						for(Integer lQuotationInputIndex=0;lQuotationInputIndex<=lQuotationInputSubHeaderList.size()-1;lQuotationInputIndex++){
							String lQuotationHeaderValue=lQuotationInputSubHeaderList.get(lQuotationInputIndex)
							if(lQuotationHeaderValue=='StartDate'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
							if(lQuotationHeaderValue=='EffectiveDate'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
							if(lQuotationHeaderValue=='FirstQuote'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
							if(lQuotationHeaderValue=='QuoteDate'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
							if(lQuotationHeaderValue=='EndDate'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
							if(lQuotationHeaderValue=='MasterSetId'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
							if(lQuotationHeaderValue=='EndorseCancellationMethod'){
								lQuotationInputDate.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lMapQuotationInputRowKeyList.get(lQuotationInputIndex))
							}
						}
						lQuotationInputDateList.add(lQuotationInputDate)
						Map lMapCurrentCellVehicleDataList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressVehicleData,lCurrentRow,lCellRangeAddressVehicleDataColumnLast,false)
						if(lMapCurrentCellVehicleDataList.Result){
							lCurrentCellVehicleDataList=lMapCurrentCellVehicleDataList.CellValueList
						}
						Boolean lIsCurrentCellVehicleDataListValueAllContainStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lCurrentCellVehicleDataList,'None')
						if(lIsCurrentCellVehicleDataListValueAllContainStringNone){
							lCurrentCellVehicleDataList=[]
						}
						Map lMapPremium=[:]
						if(!lCurrentCellQuotationInputList.isEmpty()){
							lQuotationInputList.addAll(lCurrentCellQuotationInputList)
							lVehicleDataList.addAll(lCurrentCellVehicleDataList)
							lPlanOptionRowKeyListAll.add(lMapPlanOptionRowKeyList)
							lPlanOptionListAll.add(lCurrentCellPlanOptionList)
							lReferTestCaseValue=lIDNPricingApiGetPriceListUtil.getValueFromExcelSheetForValidation(lPricingApiSheet,lIndex,lReferCaseIndex)
							lReferCaseNumberList.add(lReferTestCaseValue)
						}
						Map lMapCurrentCellOptionalDataList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressOptionalData,lCurrentRow,lCellRangeAddressOptionalDataColumnLast,false)
						if(lMapCurrentCellOptionalDataList.Result){
							lCurrentCellOptionalDataList=lMapCurrentCellOptionalDataList.CellValueList
						}
						Boolean lIsCurrentCellOptionalDataListValueAllContainStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lCurrentCellOptionalDataList,'None')
						if(lIsCurrentCellOptionalDataListValueAllContainStringNone){
							lCurrentCellOptionalDataList=[]
						}
						if(!lCurrentCellOptionalDataList.isEmpty()){
							lOptionalDataList.addAll(lCurrentCellOptionalDataList)
						}
						if(lCurrentCellQuotationInputList.isEmpty()){
							if(!lSubSetValue.isEmpty()){
								lPlanOptionListAll.add(lCurrentCellPlanOptionList)
								lPlanOptionRowKeyListAll.add(lMapPlanOptionRowKeyList)
								lAdditionalCoverageListAll.add(lAdditionalCoverageList)
								lAdditionalCoverageList=[]
								lInputPremiumListAll.add(lInputPremiumList)
								lInputPremiumList=[]
								lPaymentListAll.add(lPaymentList)
								lPaymentList=[]
								lPremiumListAll.add(lPremiumList)
								lPremiumList=[]
								lTransactionListAll.add(lTransactionList)
								lTransactionList=[]
								if(!lIsMultiCoverFlag){
									lMultiCoverListAll.add(lMultiCoverList)
									lMultiCoverList=[]
								}else{
									IGNUemaHelper.printLog('SubSet Starts Flag Yes'+lIndex)
									IGNUemaHelper.printLog(lMultiCoverList)
									lMultiCoverListAll.add(lMultiCoverList)
									lMultiCoverList=[]
									IGNUemaHelper.printLog(lMultiCoverListAll)
								}
							}else{
								lAdditionalCoverageListAll.add(lAdditionalCoverageList)
								lInputPremiumListAll.add(lInputPremiumList)
								lPaymentListAll.add(lPaymentList)
								lTransactionListAll.add(lTransactionList)
							}
						}
						Row lMultiCoverCurrentRow=lPricingApiSheet.getRow(lCellRangeAddressMultiCover.getFirstRow()+lIndex)
						Map lMapCurrentCellMultiCover=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressMultiCover,lCurrentRow,lCellRangeAddressMultiCoverColumnLast,true)
						if(lMapCurrentCellMultiCover.Result){
							lCurrentCellMultiCover=lMapCurrentCellMultiCover.CellValueList
						}
						String lMultiCoverFlag=lCurrentCellMultiCover.get(0)
						if(!IGNUemaHelper.checkObjectEmptyOfString(lMultiCoverFlag)){
							lIsMultiCoverFlag=IGNUemaHelper.convertStringToBoolean(lMultiCoverFlag)
						}
						Boolean lCheckCurrentCellMultiCoverListIsNone=IGNUemaHelper.checkAllValueInListContainSameString(lCurrentCellMultiCover,'None')
						if(lCheckCurrentCellMultiCoverListIsNone){
							lCurrentCellMultiCover=[]
						}
						if(!lCurrentCellMultiCover.isEmpty() || lIsMultiCoverFlag){
							IGNUemaHelper.printLog('First Add the MulticoverList'+' '+lIsMultiCoverFlag)
							IGNUemaHelper.printLog(lIndex)
							IGNUemaHelper.printLog(lMultiCoverList)
							lPreviousMultiCover=lCurrentCellMultiCover.get(1)
							lMultiCoverList.add(lCurrentCellMultiCover.get(1))
							IGNUemaHelper.printLog(lMultiCoverList)
						}else{
							List lMapInputMultiCoverRowKeyList=[]
							Map lMapMultiCoverRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellMultiCover)
							if(lMapMultiCoverRowKeyListResult.Result){
								lMapInputMultiCoverRowKeyList=lMapMultiCoverRowKeyListResult.TargetInputRowKeyList
							}
							Map lMapMultiCoverRowNumberAndColumnNumber=lMapInputMultiCoverRowKeyList.get(1)
							IGNUemaHelper.printLog('lMapMultiCoverRowNumberAndColumnNumber')
							IGNUemaHelper.printLog(lMapMultiCoverRowNumberAndColumnNumber)
							Integer lMultiCoverRowNumber=lMapMultiCoverRowNumberAndColumnNumber.RowNumber
							Integer lMultiCoverColumnNumber=lMapMultiCoverRowNumberAndColumnNumber.ColumnNumber
							Boolean lIsWriteMultiCoverToExcelSheet=lIDNPricingApiGetPriceListUtil.inputPricingApiResultToExcelSheetForValidation(lPricingApiSheet,lMultiCoverRowNumber,lMultiCoverColumnNumber,lPreviousMultiCover)
							if(!lIsWriteMultiCoverToExcelSheet){
								return lreturn
							}
							lMultiCoverList.add(lPreviousMultiCover)
						}
						Map lMapAdditionalCoverage=[:]
						Table<Integer,Integer,String> lTableExcelSheetAdditionalCoverage=HashBasedTable.create()
						Map lMapCurrentCellAdditionalCoverageList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressAdditionalCoverage,lCurrentRow,lCellRangeAddressAdditionalCoverageColumnLast,true)
						if(lMapCurrentCellAdditionalCoverageList.Result){
							lCurrentCellAdditionalCoverageList=lMapCurrentCellAdditionalCoverageList.CellValueList
							List lMapAdditionalCoverageRowKeyList=[]
							Map lMapAdditionalCoverageRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellAdditionalCoverageList)
							if(lMapAdditionalCoverageRowKeyListResult.Result){
								lMapAdditionalCoverageRowKeyList=lMapAdditionalCoverageRowKeyListResult.TargetInputRowKeyList
							}
							if(!lCurrentCellAdditionalCoverageList.isEmpty()){
								for(Integer lAdditionalCoverageIndex=0;lAdditionalCoverageIndex<=lCurrentCellAdditionalCoverageList.size()-1;lAdditionalCoverageIndex++){
									String lHeaderValue=lAdditionalCoverageSubHeaderList.get(lAdditionalCoverageIndex)
									if(lHeaderValue.endsWith('Premium')||(lHeaderValue.contains('ValidationTestResult'))){
										lMapAdditionalCoverage.put(lAdditionalCoverageSubHeaderList.get(lAdditionalCoverageIndex),lMapAdditionalCoverageRowKeyList.get(lAdditionalCoverageIndex))
									}else{
										lMapAdditionalCoverage.put(lAdditionalCoverageSubHeaderList.get(lAdditionalCoverageIndex),lCurrentCellAdditionalCoverageList.get(lAdditionalCoverageIndex))
									}
								}
								lAdditionalCoverageList.add(lMapAdditionalCoverage)
							}
						}
						Map lMapInputPremium=[:]
						Table<Integer,Integer,String> lTableExcelSheetInputPremium=HashBasedTable.create()
						Map lMapCurrentCellInputPremiumList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressInputPremium,lCurrentRow,lCellRangeAddressInputPremiumColumnLast,true)
						if(lMapCurrentCellInputPremiumList.Result){
							lCurrentCellInputPremiumList=lMapCurrentCellInputPremiumList.CellValueList
							lTableExcelSheetInputPremium=lMapCurrentCellInputPremiumList.CellTable
							Set<Integer> lTableInputPremiumKeySet=lTableExcelSheetInputPremium.columnKeySet()
							List lMapInputPremiumRowKeyList=[]
							Map lMapInputPremiumRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellInputPremiumList)
							if(lMapInputPremiumRowKeyListResult.Result){
								lMapInputPremiumRowKeyList=lMapInputPremiumRowKeyListResult.TargetInputRowKeyList
							}
							if(!lCurrentCellInputPremiumList.isEmpty()){
								for(Integer lInputPremiumIndex=0;lInputPremiumIndex<=lCurrentCellInputPremiumList.size()-1;lInputPremiumIndex++){
									String lHeaderValue=lInputPremiumSubHeaderList.get(lInputPremiumIndex)
									if(lHeaderValue.endsWith('Premium')){
										lMapInputPremium.put(lInputPremiumSubHeaderList.get(lInputPremiumIndex),lMapInputPremiumRowKeyList.get(lInputPremiumIndex))
									}else{
										lMapInputPremium.put(lInputPremiumSubHeaderList.get(lInputPremiumIndex),lCurrentCellInputPremiumList.get(lInputPremiumIndex))
									}
								}
								lInputPremiumList.add(lMapInputPremium)
							}
						}
						Map lMapPaymentList=[:]
						Map lMapCurrentCellPaymentList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressPayment,lCurrentRow,lCellRangeAddressPaymentColumnLast,true)
						if(lMapCurrentCellPaymentList.Result){
							lCurrentCellPaymentList=lMapCurrentCellPaymentList.CellValueList
							Table<Integer,Integer,String> lTableExcelSheetPayment=HashBasedTable.create()
							lTableExcelSheetPayment=lMapCurrentCellPaymentList.CellTable
							Set<Integer> lTablePaymentKeySet=lTableExcelSheetPayment.columnKeySet()
							List lMapPaymentRowKeyList=[]
							Map lMapPaymentRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellPaymentList)
							if(lMapPaymentRowKeyListResult.Result){
								lMapPaymentRowKeyList=lMapPaymentRowKeyListResult.TargetInputRowKeyList
							}
							if(!lCurrentCellPaymentList.isEmpty()){
								for(Integer lCurrentPaymentIndex=0;lCurrentPaymentIndex<=lCurrentCellPaymentList.size()-1;lCurrentPaymentIndex++){
									String lPaymentHeaderValue=lPaymentSubHeaderList.get(lCurrentPaymentIndex)
									if(lPaymentHeaderValue=='PaymentFrequency' && lCurrentCellPaymentList.get(lCurrentPaymentIndex) !='None' ){
										lMapPaymentList.put(lPaymentSubHeaderList.get(lCurrentPaymentIndex),lCurrentCellPaymentList.get(lCurrentPaymentIndex))
									}else{
										lMapPaymentList.put(lPaymentSubHeaderList.get(lCurrentPaymentIndex),lMapPaymentRowKeyList.get(lCurrentPaymentIndex))
									}
								}
								lPaymentList.add(lMapPaymentList)
							}
						}
						Map lMapTransactionList=[:]
						Map lMapCurrentCellTransactionList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressTransaction,lCurrentRow,lCellRangeAddressTransactionColumnLast,true)
						if(lMapCurrentCellTransactionList.Result){
							lCurrentCellTransactionList=lMapCurrentCellTransactionList.CellValueList
							List lMapTransactionRowKeyList=[]
							Map lMapTransactionRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellTransactionList)
							if(lMapTransactionRowKeyListResult.Result){
								lMapTransactionRowKeyList=lMapTransactionRowKeyListResult.TargetInputRowKeyList
							}
							if(!lCurrentCellTransactionList.isEmpty()){
								for(Integer lCurrentTransactionIndex=0;lCurrentTransactionIndex<=lCurrentCellTransactionList.size()-1;lCurrentTransactionIndex++){
									String lTransactionHeaderValue=lTransactionSubHeaderList.get(lCurrentTransactionIndex)
									lMapTransactionList.put(lTransactionSubHeaderList.get(lCurrentTransactionIndex),lMapTransactionRowKeyList.get(lCurrentTransactionIndex))
								}
								lTransactionList.add(lMapTransactionList)
							}
						}
						Table<Integer,Integer,String> lTableExcelSheetPremium=HashBasedTable.create()
						Map lMapCurrentCellPremiumList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressPremium,lCurrentRow,lCellRangeAddressPremiumColumnLast,true)
						if(lMapCurrentCellPremiumList.Result){
							lCurrentCellPremiumList=lMapCurrentCellPremiumList.CellValueList
							List lMapPremiumRowKeyList=[]
							Map lMapPremiumRowKeyListResult=this.getMapHashTableInformationForProccesingInput(lMapCurrentCellPremiumList)
							if(lMapPremiumRowKeyListResult.Result){
								lMapPremiumRowKeyList=lMapPremiumRowKeyListResult.TargetInputRowKeyList
							}
							if(!lCurrentCellPremiumList.isEmpty()){
								for(Integer lPremiumIndex=0;lPremiumIndex<=lCurrentCellPremiumList.size()-1;lPremiumIndex++){
									String lHeaderValue=lPremiumSubHeaderList.get(lPremiumIndex)
									lMapPremium.put(lPremiumSubHeaderList.get(lPremiumIndex),lMapPremiumRowKeyList.get(lPremiumIndex))
								}
								lPremiumList.add(lMapPremium)
							}
						}
						Integer lNexRowIndex=lCellRangeAddressQuotationInput.getFirstRow()+lIndex+1
						Row lNextRow=lPricingApiSheet.getRow(lNexRowIndex)
						List lNextRowQuotationInputList=[]
						Map lMapNextRowQuotationInputList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(lPricingApiSheet,lCellRangeAddressQuotationInput,lNextRow,lCellRangeAddressQuotationInputColumnLast,false)
						if(lMapNextRowQuotationInputList.Result){
							lNextRowQuotationInputList=lMapNextRowQuotationInputList.CellValueList
						}
						Boolean lCheckNextRowQuotationInputListIsNone=IGNUemaHelper.checkAllValueInListContainSameString(lNextRowQuotationInputList,'None')
						if(lCheckNextRowQuotationInputListIsNone){
							lNextRowQuotationInputList=[]
						}
						IGNUemaHelper.printLog('lNextRowQuotationInputList')
						IGNUemaHelper.printLog(lNextRowQuotationInputList)
						if(!lNextRowQuotationInputList.isEmpty()||(lIndex==lLastRowNumber)){
							Map lMapQuotationInput=[:]
							Map lMapQuotationInputAll=[:]
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
							List lPlanOptionListFinal=[]
							IGNUemaHelper.printLog('lPlanOptionRowKeyListAll')
							IGNUemaHelper.printLog(lPlanOptionRowKeyListAll)
							for(Integer lPlanOptionIndex=0;lPlanOptionIndex<=lPlanOptionListAll.size()-1;lPlanOptionIndex++){
								IGNUemaHelper.printLog('Plan Option None')
								IGNUemaHelper.printLog(lPlanOptionListAll.get(lPlanOptionIndex).getClass())
								IGNUemaHelper.printLog(lPlanOptionRowKeyListAll.get(lPlanOptionIndex).getClass())
								List lCurrentPlanOptionList=lPlanOptionListAll.get(lPlanOptionIndex)
								List lCurrentPlanOptionRowKeyList=lPlanOptionRowKeyListAll.get(lPlanOptionIndex)
								IGNUemaHelper.printLog(lPlanOptionRowKeyListAll.size())
								IGNUemaHelper.printLog(lPlanOptionSubHeaderList.size())
								IGNUemaHelper.printLog(lPlanOptionListAll.size())
								IGNUemaHelper.printLog(lPlanOptionListAll)
								Map lMapPlanOptionList=[:]
								for(Integer lCurrentPlanOptionIndex=0;lCurrentPlanOptionIndex<=lCurrentPlanOptionList.size()-1;lCurrentPlanOptionIndex++){
									IGNUemaHelper.printLog('PlanName')
									IGNUemaHelper.printLog(lCurrentPlanOptionList.get(lCurrentPlanOptionIndex))
									String lPlanName=lCurrentPlanOptionList.get(lCurrentPlanOptionIndex)
									IGNUemaHelper.printLog(lPlanName)
									if(lPlanName=='None'){
										IGNUemaHelper.printLog('AssignMap Row Number')
										IGNUemaHelper.printLog(lCurrentPlanOptionRowKeyList.get(lCurrentPlanOptionIndex))
										lMapPlanOptionList.put(lPlanOptionSubHeaderList.get(lCurrentPlanOptionIndex),lCurrentPlanOptionRowKeyList.get(lCurrentPlanOptionIndex))
									}else{
										lMapPlanOptionList.put(lPlanOptionSubHeaderList.get(lCurrentPlanOptionIndex),lCurrentPlanOptionList.get(lCurrentPlanOptionIndex))
									}
								}
								lPlanOptionListFinal.add(lMapPlanOptionList)
							}
							lMapQuotationInputAll.put(lProductVariable,lProductName)
							lMapQuotationInputAll.put(lTransactionTypeHeader,lTransactionTypeValue)
							for(Integer lQuotationInputIndex=0;lQuotationInputIndex<=lQuotationInputList.size()-1;lQuotationInputIndex++){
								String lQuotationInputValue=lQuotationInputList.get(lQuotationInputIndex)
								String lQuotationHeaderValue=lQuotationInputSubHeaderList.get(lQuotationInputIndex)
								lMapQuotationInputAll.put(lQuotationInputSubHeaderList.get(lQuotationInputIndex),lQuotationInputValue)
							}
							IGNUemaHelper.printLog(lVehicleDataSubHeaderList)
							IGNUemaHelper.printLog(lVehicleDataList)
							for(Integer lVehicleDataIndex=0;lVehicleDataIndex<=lVehicleDataList.size()-1;lVehicleDataIndex++){
								String lVehicleDataValue=lVehicleDataList.get(lVehicleDataIndex)
								lMapVehicleDataAll.put(lVehicleDataSubHeaderList.get(lVehicleDataIndex),lVehicleDataValue)
							}
							List lMapOptionalDataList=[]
							for(Integer lOptionalDataIndex=0;lOptionalDataIndex<lOptionalDataList.size()-1;lOptionalDataIndex=lOptionalDataIndex+2){
								Map lMapOptionalData=[:]
								String lOptionalDataName=lOptionalDataList.get(lOptionalDataIndex)
								String lOptionalDataValue=lOptionalDataList.get(lOptionalDataIndex+1)
								IGNUemaHelper.printLog(lOptionalDataValue)
								if(lOptionalDataName!='None'){
									lMapOptionalData.put(lOptionalDataSubHeaderList.get(lOptionalDataIndex),lOptionalDataName)
									lMapOptionalData.put(lOptionalDataSubHeaderList.get(lOptionalDataIndex+1),lOptionalDataValue)
									IGNUemaHelper.printLog(lMapOptionalData)
									lMapOptionalDataList.add(lMapOptionalData)
								}
							}
							IGNUemaHelper.printLog('lMapOptionalDataList-Read')
							IGNUemaHelper.printLog(lMapOptionalDataList)
							IGNUemaHelper.printLog(lOptionalDataList)
							Map lMapOptionalDataAll=[:]
							lMapQuotationInputAll.put(lOptionalDataParameterName,lMapOptionalDataList)
							IGNUemaHelper.printLog(lMapQuotationInputAll)
							if(lIndex<=(lLastRowNumber)){
								IGNUemaHelper.printLog('Adding Last Subset in the List'+lIndex+'  '+lLastRowNumber)
								lMultiCoverListAll.add(lMultiCoverList)
								lAdditionalCoverageListAll.add(lMapAdditionalCoverage)
								lInputPremiumListAll.add(lMapInputPremium)
								lPaymentListAll.add(lMapPaymentList)
								lTransactionListAll.add(lMapTransactionList)
								lPremiumListAll.add(lMapPremium)
							}
							IGNUemaHelper.printLog('lSubSetList')
							IGNUemaHelper.printLog(lSubsetListAll)
							IGNUemaHelper.printLog(lReferSubSetListAll)
							IGNUemaHelper.printLog(lAdditionalCoverageListAll.size())
							IGNUemaHelper.printLog(	lInputPremiumListAll.size())
							IGNUemaHelper.printLog(	lPaymentListAll.size())
							IGNUemaHelper.printLog(lTransactionListAll.size())
							IGNUemaHelper.printLog(lPremiumListAll.size())
							lMapQuotationInput.put('QuotationInput',lMapQuotationInputAll)
							lMapVehicleData.put('VehicleData',lMapVehicleDataAll)
							lMapVehicleData.put('QuotationInputDateList',lQuotationInputDateList)
							lMapVehicleData.put('SubSetList',lSubsetListAll)
							lMapVehicleData.put('ReferSubSetList',lReferSubSetListAll)
							lMapPremiumDataAll.put('Premium',lPremiumListAll)
							lMapMultiCoverAll.put('CoverList',lMultiCoverListAll)
							lMapAdditionalCoverageData.put('AdditionalCoverage',lAdditionalCoverageListAll)
							lMapPaymentData.put('PaymentList',lPaymentListAll)
							lMapInputPremiumData.put('InputPremium',lInputPremiumListAll)
							lMapAdditionalCoverageDataAll.put('AdditionalCoverageList',lMapAdditionalCoverageData)
							lMapPaymentDataAll.put('Payment',lMapPaymentData)
							lMapInputPremiumDataAll.put('InputPremiumList',lMapInputPremiumData)
							lMapTransactionData.put('Transaction',lTransactionListAll)
							JsonBuilder lJsonQuotationInput=new JsonBuilder(lMapQuotationInput)
							JsonBuilder lJsonVehicleData=new JsonBuilder(lMapVehicleData)
							JsonBuilder lJsonPremiumData=new JsonBuilder(lMapPremiumDataAll)
							JsonBuilder lJsonPlanListnput=new JsonBuilder(lPlanOptionListFinal)
							JsonBuilder lJsonMultiCoverInput=new JsonBuilder(lMapMultiCoverAll)
							JsonBuilder lJsonAddditionalCoverageListInput=new JsonBuilder(lMapAdditionalCoverageDataAll)
							JsonBuilder lJsonInputPremiumList=new JsonBuilder(lMapInputPremiumDataAll)
							JsonBuilder lJsonPaymentListInput=new JsonBuilder(lMapPaymentDataAll)
							JsonBuilder lJsonTransactionInput=new JsonBuilder(lMapTransactionData)
							lJsonQuotationInputList.add(lJsonQuotationInput.toString())
							lJsonVehicleDataList.add(lJsonVehicleData.toString())
							lJsonPremiumList.add(lJsonPremiumData.toString())
							lJsonPlanOptionList.add(lJsonPlanListnput.toString())
							lJsonPaymentList.add(lJsonPaymentListInput.toString())
							lJsonMultiCoverList.add(lJsonMultiCoverInput.toString())
							lJsonPlanAdditionalCoverageDataList.add(lJsonAddditionalCoverageListInput.toString())
							lJsonInputPremiumDataList.add(lJsonInputPremiumList.toString())
							lJsonTransactionList.add(lJsonTransactionInput.toString())
							lPlanOptionList.clear()
							lPlanOptionListAll=[]
							lPlanOptionRowKeyListAll=[]
							lPlanOptionRowKeyList.clear()
							lMultiCoverList.clear()
							lTransactionList.clear()
							lSubsetListAll=[]
							lReferSubSetListAll=[]
							lPremiumListAll=[]
							lCurrentCellAdditionalCoverageList.clear()
							lMultiCoverListAll=[]
							lQuotationInputList=[]
							lVehicleDataList=[]
							lPremiumList=[]
							lOptionalDataList=[]
							lPaymentList.clear()
							lInputPremiumList.clear()
							lPaymentRowKeyList.clear()
							lAdditionalCoverageListAll=[]
							lAdditionalCoverageList=[]
							lPaymentListAll=[]
							lTransactionListAll=[]
							lQuotationInputDateList=[]
							lInputPremiumListAll=[]
						}
						lCurrentCellQuotationInputList=[]
						lCurrentCellVehicleDataList=[]
						lCurrentCellPlanOptionList=[]
						lCurrentCellMultiCover=[]
						lCurrentCellAdditionalCoverageList=[]
						lCurrentCellOptionalDataList=[]
						lCurrentCellPaymentList=[]
						lCurrentCellTransactionList
					}
					Boolean lIsWriteOutputResultDone=IGNUemaHelper.saveExcelWorkbookByFileName(lExcelGenericFilename,lTestExcelFileGenericTestDataWorkBook)
					if(!lIsWriteOutputResultDone){
						return lreturn
					}
					Sheet lMasterDataMappingSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileGenericTestDataWorkBook,'MasterData-Mapping')
					if(IGNUemaHelper.checkObjectNullOfObject(lMasterDataMappingSheet)){
						IGNUemaHelper.printLog('MasterdataSheet not found')
						return lreturn
					}
					List lJsonFinalQuotationInputList=[]
					Map lMapQuotationInputParameterWithMasterParameterResult=this.inputMapQuotationInputParameterWithMasterParameter(lMasterDataMappingSheet,lOptionalDataParameterName)
					if(lMapQuotationInputParameterWithMasterParameterResult.Result){
						Map lMapQuotationInputParameterWithMasterParameterVehicleData=lMapQuotationInputParameterWithMasterParameterResult.VehicleDataParameter
						Map lMapQuotationInputParameterWithMasterParameterInsuredList=lMapQuotationInputParameterWithMasterParameterResult.InsuredListParameter
						Map lMapQuotationInputParameterWithMasterParameterQuoteData=lMapQuotationInputParameterWithMasterParameterResult.QuoteDataParameter
						Map lMapQuotationInputParameterWithMasterParameterOptionalData=lMapQuotationInputParameterWithMasterParameterResult.OptionalDataParameter
						List lMasterOptionalDataParameterList=[]
						Map lMapMasterVehicleDataParameter=[:]
						Map lMapMasterInsuredListParameter=[:]
						Map lMapMasterQuoteDataParameter=[:]
						Map lMapPreviousCoverDataParameter=[:]
						String  lMasterProductType=''
						String  lMasterProductName=''
						IGNUemaHelper.printLog('lJsonQuotationInputList')
						IGNUemaHelper.printLog(lJsonQuotationInputList)
						IGNUemaHelper.printLog(lJsonQuotationInputList.size())
						for(Integer lIndex=0;lIndex<lJsonQuotationInputList.size();lIndex++){
							Map lMapQuotationInputData=[:]
							lMapMasterVehicleDataParameter=[:]
							lMapMasterInsuredListParameter=[:]
							lMapMasterQuoteDataParameter=[:]
							List lMasterInsuredListParameter=[]
							List lMapMasterOptionalDataParameterList=[]
							String lQuotationInput=lJsonQuotationInputList.get(lIndex)
							Map lMapJson=new JsonSlurper().parseText(lQuotationInput)
							Map lMapQuotationInput=lMapJson.QuotationInput
							for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterQuoteData){
								String lMasterKey=lEntry.key.toString()
								Map lMapMasterOptionalDataParameter=[:]
								String lMasterKeyValue=lEntry.Value.toString()
								if(lMasterKey==lOptionalDataParameterName){
									List lMapOptionalDataValueList=lMapQuotationInput.getAt(lMasterKey)
									for(Integer lDataIndex=0;lDataIndex<=lMapOptionalDataValueList.size()-1;lDataIndex++){
										Map lMapOptionalData=lMapOptionalDataValueList.get(lDataIndex)
										for(Map.Entry lOptionalDataEntry in lMapQuotationInputParameterWithMasterParameterOptionalData){
											String lOptionalDataKey=lOptionalDataEntry.key.toString()
											String lOptionalDataValue=lOptionalDataEntry.Value.toString()
											String lMasterValue=lMapOptionalData.getAt(lOptionalDataKey)
											lMapMasterOptionalDataParameter.put(lOptionalDataValue,lMasterValue)
										}
										lMapMasterOptionalDataParameterList.add(lMapMasterOptionalDataParameter)
										lMapMasterOptionalDataParameter=[:]
									}
									String lMasterOptionalDataParameterName=lMapQuotationInputParameterWithMasterParameterQuoteData.getAt(lOptionalDataParameterName)
									lMapMasterQuoteDataParameter.put(lMasterOptionalDataParameterName,lMapMasterOptionalDataParameterList)
								}else{
									String lMasterValue=lMapQuotationInput.getAt(lMasterKey)
									IGNUemaHelper.printLog('QuotationInputMapping')
									IGNUemaHelper.printLog(lMasterValue)
									if(lMasterKeyValue=='Covers'){
										List lMapMasterCoverList=[]
										lMapMasterQuoteDataParameter.put(lMasterKeyValue,lMapMasterCoverList)
									}else if(lMasterKeyValue=='Quote_Date_of_Quote'){
										Map lMapQuoteRequiredQuoteDate=lIDNPricingApiGetPriceListUtil.inputQuoteRequiredQuoteDate('Yes',lMasterValue,'')
										if(lMapQuoteRequiredQuoteDate.Result){
											String lQuoteDateValue=lMapQuoteRequiredQuoteDate.QuoteRequiredQuoteDate
											lMapMasterQuoteDataParameter.put(lMasterKeyValue,lQuoteDateValue)
										}
									}
									else if(lMasterKeyValue=='Product_Type'){
										lMasterProductType=lMasterKeyValue
										lMasterProductName=lMasterValue
										lMapMasterQuoteDataParameter.put(lMasterProductType,lMasterProductName)
									}else{
										if(lMasterValue=='None'){
											lMasterValue=''
										}
										lMapMasterQuoteDataParameter.put(lMasterKeyValue,lMasterValue)
									}
								}
							}
							for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterInsuredList){
								List lEmptyList=[]
								String lMasterKey=lEntry.key.toString()
								String lMasterKeyValue=lEntry.Value.toString()
								IGNUemaHelper.printLog(lMasterKeyValue)
								String lMasterValue=lMapQuotationInput.getAt(lMasterKey)
								if(IGNUemaHelper.checkObjectNullOfObject(lMasterValue)){
									lMapMasterInsuredListParameter.put(lMasterKeyValue,lEmptyList)
								}else{
									if(lMasterValue=='None'){
										lMasterValue=''
									}
									lMapMasterInsuredListParameter.put(lMasterKeyValue,lMasterValue)
								}
							}
							IGNUemaHelper.printLog('lMasterInsuredListParameter')
							IGNUemaHelper.printLog(lMapMasterInsuredListParameter)
							IGNUemaHelper.printLog('lIndex'+lIndex)
							IGNUemaHelper.printLog(lTransactionTypeList)
							IGNUemaHelper.printLog(lTransactionTypeList.get(lIndex))
							lMasterInsuredListParameter.add(lMapMasterInsuredListParameter)
							lMapMasterQuoteDataParameter.put('Insured_List',lMasterInsuredListParameter)
							if(lTransactionTypeList.get(lIndex)=='Endorsement'||lTransactionTypeList.get(lIndex)=='Cancellation'){
								Map lMapQuotationInputParameterWithMasterParameterPreviousCoverParameter=lMapQuotationInputParameterWithMasterParameterResult.PreviousCoverParameter
								IGNUemaHelper.printLog('lMapQuotationInputParameterWithMasterParameterPreviousCoverParameter')
								IGNUemaHelper.printLog(lMapQuotationInputParameterWithMasterParameterPreviousCoverParameter)
								for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterPreviousCoverParameter){
									String lMasterKey=lEntry.key.toString()
									String lMasterValue=lEntry.value.toString()
									if(lMasterValue=='None'){
										lMasterValue=''
									}
									lMapPreviousCoverDataParameter.put(lMasterKey,lMasterValue)
								}
								lMapMasterQuoteDataParameter.put('PreviousCovers',lMapPreviousCoverDataParameter)
							}
							List lQuotationInputParameterWithMasterParameterVehicleDataList=[]
							Boolean lIsMapQuotationInputParameterWithMasterParameterVehicleDataEmpty=IGNUemaHelper.checkObjectEmptyOfMap(lMapQuotationInputParameterWithMasterParameterVehicleData)
							if(lIsMapQuotationInputParameterWithMasterParameterVehicleDataEmpty){
								lQuotationInputParameterWithMasterParameterVehicleDataList=[]
								lMapMasterQuoteDataParameter.put('Vehicle_Data',lQuotationInputParameterWithMasterParameterVehicleDataList)
							}else{
								Map lMapMasterOptionalDataParameter=[:]
								for(Map.Entry lEntry in lMapQuotationInputParameterWithMasterParameterVehicleData){
									String lMasterKey=lEntry.key.toString()
									String lMasterKeyValue=lEntry.Value.toString()
									IGNUemaHelper.printLog(lMasterKey)
									if(lMasterKey==lOptionalDataParameterName){
										List lMapOptionalDataValueList=lMapQuotationInput.getAt(lMasterKey)
										IGNUemaHelper.printLog('lMapOptionalDataValueList')
										IGNUemaHelper.printLog(lMapOptionalDataValueList)
										for(Integer lDataIndex=0;lDataIndex<=lMapOptionalDataValueList.size()-1;lDataIndex++){
											Map lMapOptionalData=lMapOptionalDataValueList.get(lDataIndex)
											for(Map.Entry lOptionalDataEntry in lMapQuotationInputParameterWithMasterParameterOptionalData){
												String lOptionalDataKey=lOptionalDataEntry.key.toString()
												String lOptionalDataValue=lOptionalDataEntry.Value.toString()
												String lMasterValue=lMapOptionalData.getAt(lOptionalDataKey)
												IGNUemaHelper.printLog(lMasterValue)
												lMapMasterOptionalDataParameter.put(lOptionalDataValue,lMasterValue)
											}
											lMapMasterOptionalDataParameterList.add(lMapMasterOptionalDataParameter)
											lMapMasterOptionalDataParameter=[:]
										}
									}else{
										String lMasterValue=lMapQuotationInput.getAt(lMasterKey)
										if(lMasterValue=='None'){
											lMasterValue=''
										}
										lMapMasterVehicleDataParameter.put(lMasterKeyValue,lMasterValue)
									}
								}
								String lMasterOptionalDataParameterName=lMapQuotationInputParameterWithMasterParameterVehicleData.getAt(lOptionalDataParameterName)
								lMapMasterVehicleDataParameter.put(lMasterOptionalDataParameterName,lMapMasterOptionalDataParameterList)
								lMapMasterQuoteDataParameter.put('Vehicle_Data',lMapMasterVehicleDataParameter)
							}
							Map lMapRootQuotationInputData=[:]
							lMapRootQuotationInputData.put(lMasterProductType,lMasterProductName)
							lMapQuotationInputData.put('Quote',lMapMasterQuoteDataParameter)
							lMapRootQuotationInputData.put('root',lMapQuotationInputData)
							JsonBuilder lJsonQuotationInput=new JsonBuilder(lMapRootQuotationInputData)
							IGNUemaHelper.printLog('ProcessedlJsonQuotationInput')
							IGNUemaHelper.printLog(lJsonQuotationInput)
							lJsonFinalQuotationInputList.add(lJsonQuotationInput.toString())
						}
					}
					IGNUemaHelper.printLog(lPricingApiSheet.getPhysicalNumberOfRows())
					if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileUserTestDataWorkBook)){
						IGNUemaHelper.printLog('PricingApi WorkBook not valid')
						return lreturn
					}
					if(IGNUemaHelper.checkObjectNullOfObject(lPricingApiUserSheet)){
						IGNUemaHelper.printLog('PricingApi User Sheet not valid')
						return lreturn
					}
					IGNUemaHelper.printLog('lJsonPlanAdditionalCoverageDataList')
					IGNUemaHelper.printLog(lJsonPlanAdditionalCoverageDataList)
					IGNUemaHelper.printLog('lAppendIndex')
					IGNUemaHelper.printLog(lAppendIndex)
					IGNUemaHelper.printLog('RefercaseNumber')
					IGNUemaHelper.printLog(lReferCaseNumberList)
					for(Integer lIndex=0;lIndex<lUserDataSheetLastColumnNum;lIndex++){
						Cell lCurrentCell=ExcelKeywords.getCellByIndex(lPricingApiUserSheet,lCurrentRowNumber,lIndex)
						String lCellValue=lCurrentCell.getStringCellValue()
						Integer lColumnIndex=lCurrentCell.getColumnIndex()
						//Row lInputRow=lPricingApiUserSheet.getRow(lAppendIndex)
						IGNUemaHelper.printLog('Inside Loop')
						Integer lTestCaseIndex=lAppendIndex
						if(lCellValue=='Test_Case_To_Do'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lTestCaseIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lTestCaseAction='Yes'
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lTestCaseAction)
								lTestCaseIndex=lTestCaseIndex+1
							}
						}
						Integer lReferCaseNumberIndex=lAppendIndex
						if(lCellValue=='Refer_Case_No'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lReferCaseNumberIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lStrReferCase=lReferCaseNumberList.get(lInputIndex)
								if(!IGNUemaHelper.checkObjectEmptyOfString(lStrReferCase)){
									Integer lReferTestCaseNum=IGNUemaHelper.convertStringToInteger(lStrReferCase,0)
									Integer lUserSheetTestCaseNumber=IGNUemaHelper.convertStringToInteger(lTestCaseNumber,0)
									Integer lReferCase=lUserSheetTestCaseNumber+lReferTestCaseNum
									lReferCase=lReferCase-1
									String lStrReferCaseNum=lReferCase.toString()
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lStrReferCaseNum)
								}
								lReferCaseNumberIndex=lReferCaseNumberIndex+1
							}
						}
						Integer lGroupListIndex=lAppendIndex
						if(lCellValue=='Product_Group_List_Field_Value_Story_Name'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lGroupListIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lProductGroupListFieldValueStoryName='0034_Group_Pricing_Api_Share_Quote_All_Name_Product_All_Story_Get_Price_List'
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lProductGroupListFieldValueStoryName)
								String lProductStoryUserDescription=IGNUemaHelper.concatMessageLeftRightByEnter('GetPriceListOf',lTransactionTypeList.get(lInputIndex))
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lProductStoryUserDescription)
								lGroupListIndex=lGroupListIndex+1
							}
						}
						Integer lForceStartIndex=lAppendIndex
						if(lCellValue=='Force_Start'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lForceStartIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lForceStartAction='Yes'
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lForceStartAction)
								lForceStartIndex=lForceStartIndex+1
							}
						}
						Integer lProductCodeIndex=lAppendIndex
						if(lCellValue=='PricingApiQuoteRequiredProductCode'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lProductCodeIndex)
								Integer lRowIndex=lInputRow.rowNum
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lStrProductCode)
								lProductCodeIndex=lProductCodeIndex+1
							}
						}
						Integer lProductTypeIndex=lAppendIndex
						if(lCellValue=='PricingApiQuoteRequiredProductType'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lProductTypeIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lRequiredProductType=lProductName
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lRequiredProductType)
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lTransactionTypeList.get(lInputIndex))
								lProductTypeIndex=lProductTypeIndex+1
							}
						}
						Integer lVehicleDataIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootVehicleData'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonVehicleDataList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lVehicleDataIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonVehicleData=lJsonVehicleDataList.get(lInputIndex)
								String lExcelFitValueJsonVehicleData=IGNUemaHelper.copyStringFitForExcelCell(lJsonVehicleData)
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lExcelFitValueJsonVehicleData)
								lVehicleDataIndex=lVehicleDataIndex+1
							}
						}
						Integer lQuotationInputIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootQuotationInputPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonFinalQuotationInputList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lQuotationInputIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonFinalQuotationInput=lJsonFinalQuotationInputList.get(lInputIndex)
								List lEncodedJsonQuotationInputDataList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonFinalQuotationInput)
								if(lEncodedJsonQuotationInputDataList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonQuotationInputDataList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonQuotationInputDataList.get(1))
								}
								else if(lEncodedJsonQuotationInputDataList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonQuotationInputDataList.get(0))
								}
								lQuotationInputIndex=lQuotationInputIndex+1
							}
						}
						Integer lPlanOptionIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootPlanOptionPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonPlanOptionList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lPlanOptionIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonPlanOption=lJsonPlanOptionList.get(lInputIndex)
								List lEncodedJsonPlanOptionDataList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonPlanOption)
								if(lEncodedJsonPlanOptionDataList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,IGNUemaHelper.getStringDecodedForExcelCell(lEncodedJsonPlanOptionDataList))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonPlanOptionDataList.get(1))
								}
								else if(lEncodedJsonPlanOptionDataList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonPlanOptionDataList.get(0))
								}
								lPlanOptionIndex=lPlanOptionIndex+1
							}
						}
						Integer lMultiCoverIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootMultiCoverPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonMultiCoverList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lMultiCoverIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonMultiCover=lJsonMultiCoverList.get(lInputIndex)
								List lEncodedJsonMultiCoverDataList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonMultiCover)
								if(lEncodedJsonMultiCoverDataList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonMultiCoverDataList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonMultiCoverDataList.get(1))
								}
								else if(lEncodedJsonMultiCoverDataList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,IGNUemaHelper.getStringDecodedForExcelCell(lEncodedJsonMultiCoverDataList))
								}
								lMultiCoverIndex=lMultiCoverIndex+1
							}
						}
						Integer lAdditionalCoverageIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootAdditionalCoveragePartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonPlanAdditionalCoverageDataList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lAdditionalCoverageIndex)
								Integer lRowIndex=lInputRow.rowNum
								IGNUemaHelper.printLog(lJsonPlanAdditionalCoverageDataList.get(lInputIndex))
								String lJsonPlanAdditionalCoverageData=lJsonPlanAdditionalCoverageDataList.get(lInputIndex)
								List lEncodedJsonAdditionalCoverageDataList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonPlanAdditionalCoverageData)
								if(lEncodedJsonAdditionalCoverageDataList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonAdditionalCoverageDataList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonAdditionalCoverageDataList.get(1))
								}
								else if(lEncodedJsonAdditionalCoverageDataList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,IGNUemaHelper.getStringDecodedForExcelCell(lEncodedJsonAdditionalCoverageDataList))
								}
								lAdditionalCoverageIndex=lAdditionalCoverageIndex+1
							}
						}
						Integer lInputPremiumIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootInputPremiumPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonInputPremiumDataList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lInputPremiumIndex)
								Integer lRowIndex=lInputRow.rowNum
								IGNUemaHelper.printLog(lJsonInputPremiumDataList.get(lInputIndex))
								String lJsonInputPremiumData=lJsonInputPremiumDataList.get(lInputIndex)
								List lEncodedJsonInputPremiumDataList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonInputPremiumData)
								if(lEncodedJsonInputPremiumDataList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonInputPremiumDataList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonInputPremiumDataList.get(1))
								}
								else if(lEncodedJsonInputPremiumDataList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonInputPremiumDataList.get(0))
								}
								lInputPremiumIndex=lInputPremiumIndex+1
							}
						}
						Integer lPaymentIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootPaymentPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonPaymentList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lPaymentIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonPayment=lJsonPaymentList.get(lInputIndex)
								List lEncodedJsonPaymentList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonPayment)
								if(lEncodedJsonPaymentList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonPaymentList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonPaymentList.get(1))
								}
								else if(lEncodedJsonPaymentList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonPaymentList.get(0))
								}
								lPaymentIndex=lPaymentIndex+1
							}
						}
						Integer lTransactionIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootTransactionPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonTransactionList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lTransactionIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonTransaction=lJsonTransactionList.get(lInputIndex)
								List lEncodedJsonTransactionList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonTransaction)
								if(lEncodedJsonTransactionList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonTransactionList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonTransactionList.get(1))
								}
								else if(lEncodedJsonTransactionList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonTransactionList.get(0))
								}
								lTransactionIndex=lTransactionIndex+1
							}
						}
						Integer lPremiumIndex=lAppendIndex
						if(lCellValue=='PricingApiJsonRootTotalPremiumPartOne'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonPremiumList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lPremiumIndex)
								Integer lRowIndex=lInputRow.rowNum
								String lJsonPremium=lJsonPremiumList.get(lInputIndex)
								Integer lSplitIndex=lJsonPremium.indexOf('}},',0)
								List lEncodedJsonPremiumList=IGNUemaHelper.getStringEncodedForExcelCell(lJsonPremium)
								if(lEncodedJsonPremiumList.size()==2){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonPremiumList.get(0))
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex+1,lEncodedJsonPremiumList.get(1))
								}
								else if(lEncodedJsonPremiumList.size()==1){
									ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,lEncodedJsonPremiumList.get(0))
								}
								lPremiumIndex=lPremiumIndex+1
							}
						}
						Integer lPositiveCaseIndex=lAppendIndex
						if(lCellValue=='PositiveCase'){
							for(Integer lInputIndex=0;lInputIndex<=lJsonPremiumList.size()-1;lInputIndex++){
								Row lInputRow=lPricingApiUserSheet.getRow(lPositiveCaseIndex)
								Integer lRowIndex=lInputRow.rowNum
								ExcelKeywords.setValueToCellByIndex(lPricingApiUserSheet,lRowIndex,lColumnIndex,'Yes')
								lPositiveCaseIndex=lPositiveCaseIndex+1
							}
						}
					}
					ExcelKeywords.saveWorkbook(this.CURRENT_TEST_TRANSFORM_DATA_FILE_OUTPUT_USER,lTestExcelFileUserTestDataWorkBook)
				}
			}
			lResult='Generic Test Data has been Transformed successfully'
			lreturn=lResult.length()>0
			return lreturn
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map getMapTransactionTypeAndHeaderFromExcelSheet(Sheet targetSheet){
		Boolean lResult=false
		Map lreturn=[:]
		String lTransactionType=''
		String lTransactionHeader=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('TransactionHeader',lTransactionHeader)
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				return lreturn
			}
			Sheet lTargetSheet=targetSheet
			lTransactionHeader=ExcelKeywords.getCellValueByIndex(lTargetSheet,1,1)
			lResult=lTransactionHeader.length()>=1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('TransactionHeader',lTransactionHeader)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static Map getMapProductTypeAndValueFromExcelSheet(Row rowPricingSheetFirstRow){
		Boolean lResult=false
		Map lreturn=[:]
		String lProductType=''
		String lProductName=''
		try{
			lreturn.put('Result',lResult)
			lreturn.put('ProductType',lProductType)
			lreturn.put('ProductName',lProductName)
			if(IGNUemaHelper.checkObjectNullOfObject(rowPricingSheetFirstRow)){
				return lreturn
			}
			IGNUemaHelper.printLog('Row Empty')
			Row lPricingApiSheetFirstRow=rowPricingSheetFirstRow
			Cell lProductVariableCell=lPricingApiSheetFirstRow.getCell(0)
			lProductType=lProductVariableCell.getStringCellValue()
			Cell lProductNameCell=lPricingApiSheetFirstRow.getCell(1)
			lProductName=lProductNameCell.getStringCellValue()
			lResult=lProductName.length()>1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('ProductType',lProductType)
				lreturn.put('ProductName',lProductName)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map getMapHashTableInformationForProccesingInput(Map mapTargetInputList){
		Boolean lResult=false
		Map lreturn=[:]
		List lMapTargetInputRowKeyList=[]
		try{
			lreturn.put('Result',lResult)
			lreturn.put('TargetInputRowKeyList',lMapTargetInputRowKeyList)
			if(IGNUemaHelper.checkObjectNullOfObject(mapTargetInputList)){
				return lreturn
			}
			Map lMapCurrentCellTargetInputList=mapTargetInputList
			Table<Integer,Integer,String> lTableExcelSheetTargetInput=HashBasedTable.create()
			lTableExcelSheetTargetInput=lMapCurrentCellTargetInputList.CellTable
			Set<Integer> lTableTargetInputKeySet=lTableExcelSheetTargetInput.columnKeySet()
			IGNUemaHelper.printLog(lTableTargetInputKeySet)
			for(Integer lTableKey:lTableTargetInputKeySet){
				Map lMapTargetInputRowColumnNumber=[:]
				Map lMapRowKey=lTableExcelSheetTargetInput.column(lTableKey)
				for(Map.Entry entry : lMapRowKey.entrySet()){
					lMapTargetInputRowColumnNumber.put('RowNumber',entry.getKey())
					lMapTargetInputRowColumnNumber.put('ColumnNumber',lTableKey)
				}
				lMapTargetInputRowKeyList.add(lMapTargetInputRowColumnNumber)
			}
			lResult=lMapTargetInputRowKeyList.size()>1
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('TargetInputRowKeyList',lMapTargetInputRowKeyList)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputMapQuotationInputParameterWithMasterParameter(Sheet sheetMasterDataMappingSheet,String strOptionalDataParameterName){
		Boolean lResult=false
		Map lreturn=[:]
		Map lMapVehicleDataParameter=[:]
		Map lMapInsuredListParameter=[:]
		Map lQuoteDataParameter=[:]
		Map lMapOptionalDataParameter=[:]
		Map lMapPreviousCoverParameter=[:]
		List lMappingRootDataParameterList=[]
		String lOptionalDataParameterName=strOptionalDataParameterName.trim()
		try{
			lreturn.put('VehicleDataParameter',lMapVehicleDataParameter)
			lreturn.put('InsuredListParameter',lMapInsuredListParameter)
			lreturn.put('QuoteDataParameter',lQuoteDataParameter)
			lreturn.put('OptionalDataParameter',lMapOptionalDataParameter)
			lreturn.put('PreviousCoverParameter',lMapPreviousCoverParameter)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(sheetMasterDataMappingSheet)){
				return lreturn
			}
			Integer lGenericTestDataCellMergeList=sheetMasterDataMappingSheet.getNumMergedRegions()
			CellRangeAddress[] lCellRangeAddressMergedList=new CellRangeAddress[sheetMasterDataMappingSheet.getNumMergedRegions()]
			for(Integer i=0; i < lCellRangeAddressMergedList.length; i++){
				lCellRangeAddressMergedList[i]=sheetMasterDataMappingSheet.getMergedRegion(i)
			}
			Integer lLastRowNumber=sheetMasterDataMappingSheet.getLastRowNum()
			CellRangeAddress lCellRangeAddressQuote
			CellRangeAddress lCellRangeAddressInsuredList
			CellRangeAddress lCellRangeAddressVehicleData
			CellRangeAddress lCellRangeAddressOptionalData
			CellRangeAddress lCellRangeAddressPreviousCoverData
			for(Integer lIndex=0;lIndex<lGenericTestDataCellMergeList;lIndex++){
				Row lInputCurrentRow=sheetMasterDataMappingSheet.getRow(lCellRangeAddressMergedList[lIndex].getFirstRow())
				Cell lCell=lInputCurrentRow.getCell(lCellRangeAddressMergedList[lIndex].getFirstColumn())
				String lCellRangeAddressHeading=lCell.getStringCellValue()
				IGNUemaHelper.printLog('MasterDatalCellRangeAddressHeading')
				IGNUemaHelper.printLog(lCellRangeAddressHeading)
				if(IGNUemaHelper.checkStringContainString(lCellRangeAddressHeading,'Quote')){
					lCellRangeAddressQuote=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lCellRangeAddressHeading,'InsuredList')){
					lCellRangeAddressInsuredList=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lCellRangeAddressHeading,'VehicleData')){
					lCellRangeAddressVehicleData=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lCellRangeAddressHeading,lOptionalDataParameterName)){
					lCellRangeAddressOptionalData=lCellRangeAddressMergedList[lIndex]
				}
				if(IGNUemaHelper.checkStringContainString(lCellRangeAddressHeading,'PreviousCovers')){
					lCellRangeAddressPreviousCoverData=lCellRangeAddressMergedList[lIndex]
				}
			}
			List lCurrentCellQuotationInputList=[]
			Boolean lIsMappingWithMasterParameterDone=true
			Integer lCellRangeAddressQuotationInputColumnLast=lCellRangeAddressQuote.getLastColumn()-lCellRangeAddressQuote.getFirstColumn()
			Integer lQuotationLastRowNumber=lCellRangeAddressQuote.getLastRow()
			Map lMappingParameterQuoteDataResult=this.getMasterDataParameterMapping(lCellRangeAddressQuote,sheetMasterDataMappingSheet,lLastRowNumber)
			if(lMappingParameterQuoteDataResult.Result){
				lQuoteDataParameter=lMappingParameterQuoteDataResult.MasterDataMappingParameter
				IGNUemaHelper.printLog('lQuoteDataParameter')
				IGNUemaHelper.printLog(lQuoteDataParameter)
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Integer lInsuredListRowNumber=lCellRangeAddressInsuredList.getLastRow()
			Map lMappingParameterInsuredListResult=this.getMasterDataParameterMapping(lCellRangeAddressInsuredList,sheetMasterDataMappingSheet,lLastRowNumber)
			if(lMappingParameterInsuredListResult.Result){
				lMapInsuredListParameter=lMappingParameterInsuredListResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Integer lVehicleDataRowNumber=lCellRangeAddressVehicleData.getLastRow()
			Map lMappingParameterVehicleDataResult=this.getMasterDataParameterMapping(lCellRangeAddressVehicleData,sheetMasterDataMappingSheet,lLastRowNumber)
			lMapVehicleDataParameter=lMappingParameterVehicleDataResult.MasterDataMappingParameter
			IGNUemaHelper.printLog(lMapVehicleDataParameter)
			if(lMappingParameterVehicleDataResult.Result){
				lMapVehicleDataParameter=lMappingParameterVehicleDataResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Map lMappingParameterOptionalDataResult=this.getMasterDataParameterMapping(lCellRangeAddressOptionalData,sheetMasterDataMappingSheet,lLastRowNumber)
			if(lMappingParameterOptionalDataResult.Result){
				lMapOptionalDataParameter=lMappingParameterOptionalDataResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			Map lMappingParameterPreviousCoverResult=this.getMasterDataParameterMapping(lCellRangeAddressPreviousCoverData,sheetMasterDataMappingSheet,lLastRowNumber)
			if(lMappingParameterPreviousCoverResult.Result){
				lMapPreviousCoverParameter=lMappingParameterPreviousCoverResult.MasterDataMappingParameter
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
				IGNUemaHelper.printLog('Not found sheet')
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(targetCellRangeAddress)){
				return lreturn
			}
			List lCurrentCellMappingParamterList=[]
			ArrayList lCurrentCellMappingParamterListAll=new ArrayList()
			Integer lTargetRangeAddressColumnLast=targetCellRangeAddress.getLastColumn()-targetCellRangeAddress.getFirstColumn()
			for(Integer lIndex=1;lIndex<targetRowNumber;lIndex++){
				Row lCurrentRow=targetSheet.getRow(targetCellRangeAddress.getFirstRow()+lIndex)
				Map lMapCurrentCellMappingParamterList=IGNUemaHelper.getMapExcelCellValueInSpecificRange(targetSheet,targetCellRangeAddress,lCurrentRow,lTargetRangeAddressColumnLast,false)
				if(lMapCurrentCellMappingParamterList.Result){
					lCurrentCellMappingParamterList=lMapCurrentCellMappingParamterList.CellValueList
					Boolean lIsCheckCurrentCellListValueContainSameStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lCurrentCellMappingParamterList,'None')
				}
				Boolean lIsCheckCurrentCellListValueContainSameStringNone=IGNUemaHelper.checkAllValueInListContainSameString(lCurrentCellMappingParamterList,'None')
				if(lIsCheckCurrentCellListValueContainSameStringNone){
					lCurrentCellMappingParamterList=[]
				}
				if(!IGNUemaHelper.checkObjectEmptyOfList(lCurrentCellMappingParamterList)){
					lCurrentCellMappingParamterListAll.add(lCurrentCellMappingParamterList)
					lMasterDataMappingParameter.put(lCurrentCellMappingParamterList.get(0),lCurrentCellMappingParamterList.get(1))
				}
			}
			lResult=lCurrentCellMappingParamterListAll.size()>=0
			if(lResult){
				lreturn.put('MasterDataMappingParameter',lMasterDataMappingParameter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Map<String,Object> getMapQuotationInputValueFromExcelSpecificRange(Workbook workBookTestExcelFileGenericTestData,Sheet targetSheet,CellRangeAddress targetCellRangeAddress,Row targetRow,Integer targetColumnNumber,Boolean boolIsRecordCellTable){
		Map<String,Object> lreturn=[:]
		Boolean lResult=false
		try{
			lreturn=new HashMap<>()
			List<String> lCellValueList=new ArrayList<>()
			Table<Integer,Integer,String> lTableExcelSheetSrc=HashBasedTable.create()
			lreturn.put('CellValueList',lCellValueList)
			lreturn.put('CellTable',lTableExcelSheetSrc)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				return lreturn
			}
			Sheet lTargetSheet=targetSheet
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
			Integer lTargetColumnNumber=targetColumnNumber
			Boolean lIsRecordCellTable=boolIsRecordCellTable
			String lStrCellValue=''
			String lStartDateText=''
			String lPolicyStartDateOffset=''
			String lPolicyEffectiveDateOffset=''
			for(Integer lIndex=0;lIndex<=lTargetColumnNumber;lIndex++){
				Cell lCell=lTargetRow.getCell(lTargetCellRangeAddress.getFirstColumn()+lIndex)
				Row lCurrentRow=lTargetSheet.getRow(lTargetCellRangeAddress.firstRow+1)
				Cell lHeaderCell=lCurrentRow.getCell(lTargetCellRangeAddress.getFirstColumn()+lIndex)
				Object lCellValueObject=null
				String lHeaderValueObject=''
				String lStrDataFormatterObjectValue=''
				try{
					lStrDataFormatterObjectValue=ExcelKeywords.getCellValueByIndex(lTargetSheet,lTargetRow.getRowNum(),lTargetCellRangeAddress.getFirstColumn()+lIndex)
					lHeaderValueObject=ExcelKeywords.getCellValueByIndex(lTargetSheet,lCurrentRow.getRowNum(),lTargetCellRangeAddress.getFirstColumn()+lIndex)
					if(lHeaderValueObject=='StartDayOffset'){
						if(!(IGNUemaHelper.checkObjectEmptyOfString(lStrDataFormatterObjectValue))){
							lPolicyStartDateOffset=lStrDataFormatterObjectValue
						}
					}
					else if(lHeaderValueObject=='StartDate'){
						lStrDataFormatterObjectValue=lPolicyStartDateOffset
					}
					else if(lHeaderValueObject=='EffectiveDayOffset'){
						if(!(IGNUemaHelper.checkObjectEmptyOfString(lStrDataFormatterObjectValue))){
							lPolicyEffectiveDateOffset=lStrDataFormatterObjectValue
						}
					}
					else if(lHeaderValueObject=='EffectiveDate'){
						lStrDataFormatterObjectValue=lPolicyEffectiveDateOffset
					}
					else if(lHeaderValueObject=='FirstQuote'){
						lStrDataFormatterObjectValue=lPolicyStartDateOffset
					}else{
						if(!IGNUemaHelper.checkObjectNullOfObject(lCell)){
							CellType lCellType=lCell.getCellTypeEnum()
							if((lCellType==CellType.NUMERIC)){
								Double lValue=lCell.getNumericCellValue()
								if(DateUtil.isCellDateFormatted(lCell)){
									Date lDate=lCell.getDateCellValue()
									String lDateFormat='yyyy-MM-dd'
									String lDateString=lDate.format(lDateFormat)
									lStrDataFormatterObjectValue=lDateString
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
						Integer lRowIndex=lTargetRow.getRowNum()
						Integer lColumnIndex=lTargetCellRangeAddress.getFirstColumn()+lIndex
						lTableExcelSheetSrc.put(lRowIndex,lColumnIndex,lStrCellValue)
					}
					lCellValueList.add(lStrCellValue)
					lResult=lCellValueList.size()>=0
				}catch(Exception ex){
					//ex.printStackTrace()
				}
			}
			if(lResult){
				lreturn.put('CellValueList',lCellValueList)
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
			String lTargetParameter=strParameter
			Integer lGenericTestDataCellMergeList=sheetMasterDataMappingSheet.getNumMergedRegions()
			CellRangeAddress[] lCellRangeAddressMergedList=new CellRangeAddress[sheetMasterDataMappingSheet.getNumMergedRegions()]
			for(Integer lIndex=0;lIndex<lCellRangeAddressMergedList.size();lIndex++){
				lCellRangeAddressMergedList[lIndex]=sheetMasterDataMappingSheet.getMergedRegion(lIndex)
			}
			Integer lLastRowNumber=sheetMasterDataMappingSheet.getLastRowNum()
			CellRangeAddress lRangeAddressRedBook
			for(Integer lIndex=0;lIndex<lGenericTestDataCellMergeList;lIndex++){
				Row lInputCurrentRow=sheetMasterDataMappingSheet.getRow(lCellRangeAddressMergedList[lIndex].getFirstRow())
				Cell lCell=lInputCurrentRow.getCell(lCellRangeAddressMergedList[lIndex].getFirstColumn())
				String lCellRangeAddressHeading=lCell.getStringCellValue()
				IGNUemaHelper.printLog('MasterDatalCellRangeAddressHeading')
				IGNUemaHelper.printLog(lCellRangeAddressHeading)
				if(IGNUemaHelper.checkStringContainString(lCellRangeAddressHeading,lTargetParameter)){
					lRangeAddressRedBook=lCellRangeAddressMergedList[lIndex]
				}
			}
			Integer lRedBookVehicleDataRowNumber=lRangeAddressRedBook.getLastRow()
			Map lMappingTargetParameterWithMasterDataParameterResult=this.getMasterDataParameterMapping(lRangeAddressRedBook,sheetMasterDataMappingSheet,lLastRowNumber)
			IGNUemaHelper.printLog(lMapTargetParameterWithMasterParameter)
			if(lMappingTargetParameterWithMasterDataParameterResult.Result){
				lMapTargetParameterWithMasterParameter=lMappingTargetParameterWithMasterDataParameterResult.MasterDataMappingParameter
			}else{
				lIsMappingWithMasterParameterDone=false
			}
			IGNUemaHelper.printLog('lMapTargetParameterWithMasterParameter')
			IGNUemaHelper.printLog(lMapTargetParameterWithMasterParameter)
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