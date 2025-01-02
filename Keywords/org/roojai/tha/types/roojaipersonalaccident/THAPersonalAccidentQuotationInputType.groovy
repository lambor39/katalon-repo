package org.roojai.tha.types.roojaipersonalaccident
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAPersonalAccidentQuotationInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsitePersonalAccident/PersonalAccident_Quotation_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_PersonalAccident_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='PersonalAccident_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=40
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=41
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsitePersonalAccident/PersonalAccident_Quotation_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_PersonalAccident_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='PersonalAccident_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=48
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=49
	//Constant
	public static final String DEFAULT_START_FROM_CMS_FORM_MAIN='No'
	public static final String DEFAULT_START_FROM_CMS_FORM_MINI='No'
	public static final String DEFAULT_CMS_BASE_URL_FORM_MAIN='https://www.uat-roojai.com'
	public static final String DEFAULT_CMS_BASE_URL_FORM_MINI='https://www.uat-roojai.com/personal-accident-insurance'
	public static final String DEFAULT_CMS_MAXIMIZE_MODE='No'
	public static final String DEFAULT_CMS_WITH_AUTH='No'
	public static final String DEFAULT_CMS_AUTH_USER='demo'
	public static final String DEFAULT_CMS_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_CMS_LANGUAGE='1'
	public static final String DEFAULT_CMS_GENDER_AND_MARITAL_STATUS='1'
	public static final String DEFAULT_CMS_BIRTH_DATE_MAIN='32143'
	public static final String DEFAULT_CMS_INSURED_OCCUPATION=''
	public static final String DEFAULT_CMS_INSURED_SALARY='0'
	public static final String DEFAULT_CMS_KEEP_DETAIL='Yes'
	public static final String DEFAULT_BASE_URL='https://insure.uat-roojai.com/quote/#/?productType=pa'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_LANGUAGE='1'
	public static final String DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS='1'
	public static final String DEFAULT_INSURED_BIRTH_DATE='01/01/1988'
	public static final String DEFAULT_INSURED_OCCUPATION=''
	public static final String DEFAULT_INSURED_SALARY='0'
	public static final String DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE='3'
	public static final String DEFAULT_QUERY_INSURED_DENIED_COVERAGE='2'
	public static final String DEFAULT_QUERY_ACCIDENT_OR_INJURY='1'
	public static final String DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT='2'
	public static final String DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_01='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_02='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_03='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_04='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_05='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_06='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_07='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_08='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_09='2'
	public static final String DEFAULT_QUERY_OTHER_QUESTION_10='2'
	public static final String DEFAULT_POSITIVE_CASE='No'
	public Map Input=[:]
	public Map Output=[:]
	public THAPersonalAccidentQuotationInputType(){
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
		this.Input.put('CmsGenderAndMaritalStatus',this.DEFAULT_CMS_GENDER_AND_MARITAL_STATUS)
		this.Input.put('CmsBirthDateMain',this.DEFAULT_CMS_BIRTH_DATE_MAIN)
		this.Input.put('CmsInsuredOccupation',this.DEFAULT_CMS_INSURED_OCCUPATION)
		this.Input.put('CmsInsuredSalary',this.DEFAULT_CMS_INSURED_SALARY)
		this.Input.put('CmsKeepDetail',this.DEFAULT_CMS_KEEP_DETAIL)
		this.Input.put('BaseUrl',this.DEFAULT_BASE_URL)
		this.Input.put('MaximizeMode',this.DEFAULT_MAXIMIZE_MODE)
		this.Input.put('WithAuth',this.DEFAULT_WITH_AUTH)
		this.Input.put('AuthUser',this.DEFAULT_AUTH_USER)
		this.Input.put('AuthPassword',this.DEFAULT_AUTH_PASSWORD)
		this.Input.put('Version',this.DEFAULT_VERSION)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('InsuredGenderAndMaritalStatus',this.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
		this.Input.put('InsuredBirthDate',this.DEFAULT_INSURED_BIRTH_DATE)
		this.Input.put('InsuredOccupation',this.DEFAULT_INSURED_OCCUPATION)
		this.Input.put('InsuredSalary',this.DEFAULT_INSURED_SALARY)
		this.Input.put('QueryPersonalAccidentInsurance',this.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE)
		this.Input.put('QueryInsuredDeniedCoverage',this.DEFAULT_QUERY_INSURED_DENIED_COVERAGE)
		this.Input.put('QueryAccidentOrInjury',this.DEFAULT_QUERY_ACCIDENT_OR_INJURY)
		this.Input.put('QueryReceivedMedicalTreatment',this.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT)
		this.Input.put('QueryHypertensionBloodPositive',this.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE)
		this.Input.put('QueryOtherQuestion01',this.DEFAULT_QUERY_OTHER_QUESTION_01)
		this.Input.put('QueryOtherQuestion02',this.DEFAULT_QUERY_OTHER_QUESTION_02)
		this.Input.put('QueryOtherQuestion03',this.DEFAULT_QUERY_OTHER_QUESTION_03)
		this.Input.put('QueryOtherQuestion04',this.DEFAULT_QUERY_OTHER_QUESTION_04)
		this.Input.put('QueryOtherQuestion05',this.DEFAULT_QUERY_OTHER_QUESTION_05)
		this.Input.put('QueryOtherQuestion06',this.DEFAULT_QUERY_OTHER_QUESTION_06)
		this.Input.put('QueryOtherQuestion07',this.DEFAULT_QUERY_OTHER_QUESTION_07)
		this.Input.put('QueryOtherQuestion08',this.DEFAULT_QUERY_OTHER_QUESTION_08)
		this.Input.put('QueryOtherQuestion09',this.DEFAULT_QUERY_OTHER_QUESTION_09)
		this.Input.put('QueryOtherQuestion10',this.DEFAULT_QUERY_OTHER_QUESTION_10)
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
		this.Output.put('CmsGenderAndMaritalStatus','')
		this.Output.put('CmsBirthDateMain','')
		this.Output.put('CmsInsuredOccupation','')
		this.Output.put('CmsInsuredSalary','')
		this.Output.put('CmsKeepDetail','')
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Version','')
		this.Output.put('Language','')
		this.Output.put('InsuredGenderAndMaritalStatus','')
		this.Output.put('InsuredBirthDate','')
		this.Output.put('InsuredOccupation','')
		this.Output.put('InsuredSalary','')
		this.Output.put('QueryPersonalAccidentInsurance','')
		this.Output.put('QueryInsuredDeniedCoverage','')
		this.Output.put('QueryAccidentOrInjury','')
		this.Output.put('QueryReceivedMedicalTreatment','')
		this.Output.put('QueryHypertensionBloodPositive','')
		this.Output.put('QueryOtherQuestion01','')
		this.Output.put('QueryOtherQuestion02','')
		this.Output.put('QueryOtherQuestion03','')
		this.Output.put('QueryOtherQuestion04','')
		this.Output.put('QueryOtherQuestion05','')
		this.Output.put('QueryOtherQuestion06','')
		this.Output.put('QueryOtherQuestion07','')
		this.Output.put('QueryOtherQuestion08','')
		this.Output.put('QueryOtherQuestion09','')
		this.Output.put('QueryOtherQuestion10','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('CmsPostLanguage','')
		this.Output.put('CmsPostGenderAndMaritalStatus','')
		this.Output.put('CmsPostBirthDateMain','')
		this.Output.put('CmsPostInsuredOccupation','')
		this.Output.put('CmsPostInsuredSalary','')
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
			caseInput.put('CmsGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsBirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsInsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CmsInsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredBirthDate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryPersonalAccidentInsurance',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryInsuredDeniedCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryAccidentOrInjury',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryReceivedMedicalTreatment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHypertensionBloodPositive',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion01',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion02',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion03',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion04',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion05',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion06',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion07',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion08',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion09',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryOtherQuestion10',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('CmsGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsBirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsInsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsInsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredBirthDate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryPersonalAccidentInsurance',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryInsuredDeniedCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryAccidentOrInjury',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryReceivedMedicalTreatment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHypertensionBloodPositive',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion01',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion02',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion03',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion04',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion05',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion06',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion07',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion08',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion09',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryOtherQuestion10',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostGenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostBirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostInsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CmsPostInsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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