package org.roojai.tha.types.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAExtendedWarrantyQuotationInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsiteExtendedWarranty/ExtendedWarranty_Quotation_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_ExtendedWarranty_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='Quotation_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=29
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=30
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsiteExtendedWarranty/ExtendedWarranty_Quotation_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_ExtendedWarranty_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='Quotation_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=36
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=37
	//Constant
	public static final String DEFAULT_START_FROM_CMS_FORM_MAIN='No'
	public static final String DEFAULT_START_FROM_CMS_FORM_MINI='No'
	public static final String DEFAULT_CMS_BASE_URL_FORM_MAIN='https://www.uat-roojai.com'
	public static final String DEFAULT_CMS_BASE_URL_FORM_MINI='https://www.uat-roojai.com/extended-warranty-insurance'
	public static final String DEFAULT_CMS_MAXIMIZE_MODE='No'
	public static final String DEFAULT_CMS_WITH_AUTH='No'
	public static final String DEFAULT_CMS_AUTH_USER='demo'
	public static final String DEFAULT_CMS_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_CMS_LANGUAGE='TH'
	public static final String DEFAULT_CMS_CAR_MAKE=''
	public static final String DEFAULT_CMS_CAR_MODEL=''
	public static final String DEFAULT_CMS_CAR_YEAR='2020'
	public static final String DEFAULT_CMS_CAR_SUBMODEL=''
	public static final String DEFAULT_CMS_KEEP_DETAIL='Yes'
	public static final String DEFAULT_BASE_URL='https://insure.uat-roojai.com/quote/#/?productType=ExtendedWarranty'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_REFERRER=''
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_CAR_MAKE=''
	public static final String DEFAULT_CAR_MODEL=''
	public static final String DEFAULT_CAR_YEAR='2018'
	public static final String DEFAULT_CAR_SUBMODEL=''
	public static final String DEFAULT_CAR_ODOMETER_READING='3'
	public static final String DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS='1'
	public static final String DEFAULT_INSURED_POSTAL_CODE='10110'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAExtendedWarrantyQuotationInputType(){
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
		this.Input.put('StartFromCmsFormMain',this.DEFAULT_START_FROM_CMS_FORM_MAIN)
		this.Input.put('StartFromCmsFormMini',this.DEFAULT_START_FROM_CMS_FORM_MINI)
		this.Input.put('CmsBaseUrlFormMain',this.DEFAULT_CMS_BASE_URL_FORM_MAIN)
		this.Input.put('CmsBaseUrlFormMini',this.DEFAULT_CMS_BASE_URL_FORM_MINI)
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
		this.Input.put('CarSubmodel',this.DEFAULT_CAR_SUBMODEL)
		this.Input.put('CarOdometerReading',this.DEFAULT_CAR_ODOMETER_READING)
		this.Input.put('InsuredGenderAndMaritalStatus',this.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
		this.Input.put('InsuredPostalCode',this.DEFAULT_INSURED_POSTAL_CODE)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('StartFromCmsFormMain','')
		this.Output.put('StartFromCmsFormMini','')
		this.Output.put('CmsBaseUrlFormMain','')
		this.Output.put('CmsBaseUrlFormMini','')
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
		this.Output.put('CarSubmodel','')
		this.Output.put('CarOdometerReading','')
		this.Output.put('InsuredGenderAndMaritalStatus','')
		this.Output.put('InsuredPostalCode','')
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
			caseInput.put('StartFromCmsFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('StartFromCmsFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsBaseUrlFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsBaseUrlFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseInput.put('CarSubmodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarOdometerReading',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('StartFromCmsFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('StartFromCmsFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsBaseUrlFormMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsBaseUrlFormMini',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('CarSubmodel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarOdometerReading',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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