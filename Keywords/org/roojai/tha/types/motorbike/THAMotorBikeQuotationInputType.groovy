package org.roojai.tha.types.motorbike
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAMotorBikeQuotationInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsiteMotorBike/MotorBike_Quotation_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_MotorBike_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='Quotation_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=56
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=57
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsiteMotorBike/MotorBike_Quotation_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_MotorBike_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='Quotation_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=63
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=64
	//Constant
	public static final String DEFAULT_START_FROM_CMS_AFFILIATE_MAIN='No'
	public static final String DEFAULT_START_FROM_CMS_FORM_MAIN='No'
	public static final String DEFAULT_START_FROM_CMS_FORM_MINI='Yes'
	public static final String DEFAULT_CMS_BASE_URL_FORM_MAIN='https://www.uat-roojai.com'
	public static final String DEFAULT_CMS_BASE_URL_FORM_MINI='https://www.uat-roojai.com/motorbike-insurance'
	public static final String DEFAULT_CMS_AFFILIATE_BASE_URL_FORM_MAIN='https://www.uat-roojai.com/affiliate'
	public static final String DEFAULT_CMS_AFFILIATE_BASE_NONCE=''
	public static final String DEFAULT_CMS_AFFILIATE_BASE_PSN_NUMBER=''
	public static final String DEFAULT_CMS_MAXIMIZE_MODE='No'
	public static final String DEFAULT_CMS_WITH_AUTH='No'
	public static final String DEFAULT_CMS_AUTH_USER='demo'
	public static final String DEFAULT_CMS_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_CMS_LANGUAGE='1'
	public static final String DEFAULT_CMS_CAR_MAKE=''
	public static final String DEFAULT_CMS_CAR_MODEL=''
	public static final String DEFAULT_CMS_CAR_YEAR='2018'
	public static final String DEFAULT_CMS_CAR_SUBMODEL=''
	public static final String DEFAULT_CMS_KEEP_DETAIL='Yes'
	public static final String DEFAULT_CMS_AFFILIATE_MAXIMIZE_MODE='No'
	public static final String DEFAULT_CMS_AFFILIATE_WITH_AUTH='No'
	public static final String DEFAULT_CMS_AFFILIATE_AUTH_USER='demo'
	public static final String DEFAULT_CMS_AFFILIATE_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_CMS_AFFILIATE_LANGUAGE='1'
	public static final String DEFAULT_BASE_URL='https://insure.uat-roojai.com/quote/#/?productType=Motorbike'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_REFERRER=''
	public static final String DEFAULT_LANGUAGE='1'
	public static final String DEFAULT_CAR_MAKE=''
	public static final String DEFAULT_CAR_MODEL=''
	public static final String DEFAULT_CAR_YEAR='2018'
	public static final String DEFAULT_SUBMODEL=''
	public static final String DEFAULT_GENDER_MAIN='Male'
	public static final String DEFAULT_MARITAL_STATUS='Single'
	public static final String DEFAULT_BIRTH_DATE_MAIN='01/01/1988'
	public static final String DEFAULT_YEAR_DRIVING='6'
	public static final String DEFAULT_CLAIMS_NO='0'
	public static final String DEFAULT_VEHICLE_USAGE='DTBW'
	public static final String DEFAULT_VEHICLE_USAGE_FOR_COMMERCIAL='No'
	public static final String DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK='Yes'
	public static final String DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK_OFTEN='1'
	public static final String DEFAULT_TAXI_OR_VEHICLE_FOR_HIRE='No'
	public static final String DEFAULT_RENTAL_VEHICLE='No'
	public static final String DEFAULT_GOODS_TRANSPORT_VEHICLE='Yes'
	public static final String DEFAULT_LOGISTICS_OR_COURIER_COMPANY='No'
	public static final String DEFAULT_GOODS_TRANSPORT_ROUTE='Variable'
	public static final String DEFAULT_POSTAL_CODE='10110'
	public static final String DEFAULT_ODOMETER_READING='3'
	public static final String DEFAULT_DECLARED_NCB='5'
	public static final String DEFAULT_CAR_CAMERA='Yes'
	public static final String DEFAULT_UNDER_FINANCING='Yes'
	public static final String DEFAULT_TENTATIVE='Later'
	public static final String DEFAULT_ALCOHOL_FREE='No'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAMotorBikeQuotationInputType(){
		super()
		this.initInput()
		this.initOutput()
	}
	public Map getInput(){
		return this.Input
	}
	public void setInput(Map newInput){
		this.Input.keySet().each{prop->
			if(newInput.containsKey(prop.toString())){
				this.Input[prop]=newInput.get(prop).toString().trim()
			}
		}
	}
	public Map getOutput(){
		return this.Output
	}
	public void setOutput(Map newOutput){
		this.Output.keySet().each{prop->
			if(newOutput.containsKey(prop.toString())){
				this.Output[prop]=newOutput.get(prop).toString().trim()
			}
		}
	}
	public void initInput(){
		this.Input.clear()
		this.Input.put('StartFromCmsAffiliateMain',this.DEFAULT_START_FROM_CMS_AFFILIATE_MAIN)
		this.Input.put('StartFromCmsFormMain',this.DEFAULT_START_FROM_CMS_FORM_MAIN)
		this.Input.put('StartFromCmsFormMini',this.DEFAULT_START_FROM_CMS_FORM_MINI)
		this.Input.put('CmsBaseUrlFormMain',this.DEFAULT_CMS_BASE_URL_FORM_MAIN)
		this.Input.put('CmsBaseUrlFormMini',this.DEFAULT_CMS_BASE_URL_FORM_MINI)
		this.Input.put('CmsAffiliateBaseUrlFormMain',this.DEFAULT_CMS_AFFILIATE_BASE_URL_FORM_MAIN)
		this.Input.put('CmsAffiliateBaseNonce',this.DEFAULT_CMS_AFFILIATE_BASE_NONCE)
		this.Input.put('CmsAffiliateBasePsnNumber',this.DEFAULT_CMS_AFFILIATE_BASE_PSN_NUMBER)
		this.Input.put('CmsMaximizeMode',this.DEFAULT_CMS_MAXIMIZE_MODE)
		this.Input.put('CmsWithAuth',this.DEFAULT_CMS_WITH_AUTH)
		this.Input.put('CmsAuthUser',this.DEFAULT_CMS_AUTH_USER)
		this.Input.put('CmsAuthPassword',this.DEFAULT_CMS_AUTH_PASSWORD)
		this.Input.put('CmsLanguage',this.DEFAULT_CMS_LANGUAGE)
		this.Input.put('CmsCarMake',this.DEFAULT_CMS_CAR_MAKE)
		this.Input.put('CmsCarModel',this.DEFAULT_CMS_CAR_MODEL)
		this.Input.put('CmsCarYear',this.DEFAULT_CMS_CAR_YEAR)
		this.Input.put('CmsCarSubmodel',this.DEFAULT_CMS_CAR_SUBMODEL)
		this.Input.put('CmsKeepDetail',this.DEFAULT_CMS_KEEP_DETAIL)
		this.Input.put('CmsAffiliateMaximizeMode',this.DEFAULT_CMS_AFFILIATE_MAXIMIZE_MODE)
		this.Input.put('CmsAffiliateWithAuth',this.DEFAULT_CMS_AFFILIATE_WITH_AUTH)
		this.Input.put('CmsAffiliateAuthUser',this.DEFAULT_CMS_AFFILIATE_AUTH_USER)
		this.Input.put('CmsAffiliateAuthPassword',this.DEFAULT_CMS_AFFILIATE_AUTH_PASSWORD)
		this.Input.put('CmsAffiliateLanguage',this.DEFAULT_CMS_AFFILIATE_LANGUAGE)
		this.Input.put('BaseUrl',this.DEFAULT_BASE_URL)
		this.Input.put('MaximizeMode',this.DEFAULT_MAXIMIZE_MODE)
		this.Input.put('WithAuth',this.DEFAULT_WITH_AUTH)
		this.Input.put('AuthUser',this.DEFAULT_AUTH_USER)
		this.Input.put('AuthPassword',this.DEFAULT_AUTH_PASSWORD)
		this.Input.put('Version',this.DEFAULT_VERSION)
		this.Input.put('Referrer',this.DEFAULT_REFERRER)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('CarMake',this.DEFAULT_CAR_MAKE)
		this.Input.put('CarModel',this.DEFAULT_CAR_MODEL)
		this.Input.put('CarYear',this.DEFAULT_CAR_YEAR)
		this.Input.put('Submodel',this.DEFAULT_SUBMODEL)
		this.Input.put('GenderMain',this.DEFAULT_GENDER_MAIN)
		this.Input.put('MaritalStatus',this.DEFAULT_MARITAL_STATUS)
		this.Input.put('BirthDateMain',this.DEFAULT_BIRTH_DATE_MAIN)
		this.Input.put('YearDriving',this.DEFAULT_YEAR_DRIVING)
		this.Input.put('ClaimsNo',this.DEFAULT_CLAIMS_NO)
		this.Input.put('VehicleUsage',this.DEFAULT_VEHICLE_USAGE)
		this.Input.put('VehicleUsageForCommercial',this.DEFAULT_VEHICLE_USAGE_FOR_COMMERCIAL)
		this.Input.put('VehicleUsageDriveToWork',this.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK)
		this.Input.put('VehicleUsageDriveToWorkOften',this.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK_OFTEN)
		this.Input.put('TaxiOrVehicleForHire',this.DEFAULT_TAXI_OR_VEHICLE_FOR_HIRE)
		this.Input.put('RentalVehicle',this.DEFAULT_RENTAL_VEHICLE)
		this.Input.put('GoodsTransportVehicle',this.DEFAULT_GOODS_TRANSPORT_VEHICLE)
		this.Input.put('LogisticsOrCourierCompany',this.DEFAULT_LOGISTICS_OR_COURIER_COMPANY)
		this.Input.put('GoodsTransportRoute',this.DEFAULT_GOODS_TRANSPORT_ROUTE)
		this.Input.put('PostalCode',this.DEFAULT_POSTAL_CODE)
		this.Input.put('OdometerReading',this.DEFAULT_ODOMETER_READING)
		this.Input.put('DeclaredNcb',this.DEFAULT_DECLARED_NCB)
		this.Input.put('CarCamera',this.DEFAULT_CAR_CAMERA)
		this.Input.put('UnderFinancing',this.DEFAULT_UNDER_FINANCING)
		this.Input.put('Tentative',this.DEFAULT_TENTATIVE)
		this.Input.put('AlcoholFree',this.DEFAULT_ALCOHOL_FREE)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('StartFromCmsAffiliateMain','')
		this.Output.put('StartFromCmsFormMain','')
		this.Output.put('StartFromCmsFormMini','')
		this.Output.put('CmsBaseUrlFormMain','')
		this.Output.put('CmsBaseUrlFormMini','')
		this.Output.put('CmsAffiliateBaseUrlFormMain','')
		this.Output.put('CmsAffiliateBaseNonce','')
		this.Output.put('CmsAffiliateBasePsnNumber','')
		this.Output.put('CmsMaximizeMode','')
		this.Output.put('CmsWithAuth','')
		this.Output.put('CmsAuthUser','')
		this.Output.put('CmsAuthPassword','')
		this.Output.put('CmsLanguage','')
		this.Output.put('CmsCarMake','')
		this.Output.put('CmsCarModel','')
		this.Output.put('CmsCarYear','')
		this.Output.put('CmsCarSubmodel','')
		this.Output.put('CmsKeepDetail','')
		this.Output.put('CmsAffiliateMaximizeMode','')
		this.Output.put('CmsAffiliateWithAuth','')
		this.Output.put('CmsAffiliateAuthUser','')
		this.Output.put('CmsAffiliateAuthPassword','')
		this.Output.put('CmsAffiliateLanguage','')
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Version','')
		this.Output.put('Referrer','')
		this.Output.put('Language','')
		this.Output.put('CarMake','')
		this.Output.put('CarModel','')
		this.Output.put('CarYear','')
		this.Output.put('Submodel','')
		this.Output.put('GenderMain','')
		this.Output.put('MaritalStatus','')
		this.Output.put('BirthDateMain','')
		this.Output.put('YearDriving','')
		this.Output.put('ClaimsNo','')
		this.Output.put('VehicleUsage','')
		this.Output.put('VehicleUsageForCommercial','')
		this.Output.put('VehicleUsageDriveToWork','')
		this.Output.put('VehicleUsageDriveToWorkOften','')
		this.Output.put('TaxiOrVehicleForHire','')
		this.Output.put('RentalVehicle','')
		this.Output.put('GoodsTransportVehicle','')
		this.Output.put('LogisticsOrCourierCompany','')
		this.Output.put('GoodsTransportRoute','')
		this.Output.put('PostalCode','')
		this.Output.put('OdometerReading','')
		this.Output.put('DeclaredNcb','')
		this.Output.put('CarCamera','')
		this.Output.put('UnderFinancing','')
		this.Output.put('Tentative','')
		this.Output.put('AlcoholFree','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('CmsPostLanguage','')
		this.Output.put('CmsPostCarMake','')
		this.Output.put('CmsPostCarModel','')
		this.Output.put('CmsPostCarYear','')
		this.Output.put('CmsPostCarSubmodel','')
		this.Output.put('PolicyInsurer','')
	}
	public static Boolean readInputFromDataFile(Integer caseNumber,Map caseInput){
		Boolean lreturn=false
		if(caseNumber<1){
			return lreturn
		}
		try{
			TestData lTestData=TestDataFactory.findTestData(this.INPUT_DATA_FILE_NAME)
			Integer dataColIndex=this.INPUT_DATA_COL_BEGIN+(caseNumber-1)
			Integer dataRowIndex=this.INPUT_DATA_ROW_BEGIN
			caseInput.put('StartFromCmsAffiliateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('StartFromCmsFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('StartFromCmsFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsBaseUrlFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsBaseUrlFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateBaseUrlFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateBaseNonce',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateBasePsnNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsMaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsWithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsCarMake',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsCarModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsCarYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsCarSubmodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsKeepDetail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateMaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateWithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateAuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateAuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsAffiliateLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BaseUrl',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('MaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('WithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Referrer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarMake',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Submodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GenderMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('MaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('YearDriving',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ClaimsNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('VehicleUsage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('VehicleUsageForCommercial',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('VehicleUsageDriveToWork',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('VehicleUsageDriveToWorkOften',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TaxiOrVehicleForHire',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RentalVehicle',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GoodsTransportVehicle',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LogisticsOrCourierCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GoodsTransportRoute',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OdometerReading',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('DeclaredNcb',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarCamera',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('UnderFinancing',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Tentative',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AlcoholFree',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Boolean readOutputFromDataFile(Integer caseNumber,Map caseOutput){
		Boolean lreturn=false
		if(caseNumber<1){
			return lreturn
		}
		try{
			TestData lTestData=TestDataFactory.findTestData(this.OUTPUT_DATA_FILE_NAME)
			Integer dataColIndex=this.OUTPUT_DATA_COL_BEGIN+(caseNumber-1)
			Integer dataRowIndex=this.OUTPUT_DATA_ROW_BEGIN
			caseOutput.put('StartFromCmsAffiliateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('StartFromCmsFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('StartFromCmsFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsBaseUrlFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsBaseUrlFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateBaseUrlFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateBaseNonce',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateBasePsnNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsMaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsWithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsCarMake',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsCarModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsCarYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsCarSubmodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsKeepDetail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateMaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateWithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateAuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateAuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsAffiliateLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BaseUrl',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('MaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('WithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Referrer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarMake',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Submodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GenderMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('MaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('YearDriving',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ClaimsNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('VehicleUsage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('VehicleUsageForCommercial',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('VehicleUsageDriveToWork',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('VehicleUsageDriveToWorkOften',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TaxiOrVehicleForHire',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RentalVehicle',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GoodsTransportVehicle',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LogisticsOrCourierCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GoodsTransportRoute',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OdometerReading',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DeclaredNcb',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarCamera',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('UnderFinancing',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Tentative',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AlcoholFree',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostCarMake',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostCarModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostCarYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostCarSubmodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyInsurer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}