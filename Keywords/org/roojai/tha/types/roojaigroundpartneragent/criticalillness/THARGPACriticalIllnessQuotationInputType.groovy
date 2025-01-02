package org.roojai.tha.types.roojaigroundpartneragent.criticalillness
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THARGPACriticalIllnessQuotationInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentCriticalIllness/RGPACriticalIllness_Quotation_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPACriticalIllness_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='CriticalIllness_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=45
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=46
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentCriticalIllness/RGPACriticalIllness_Quotation_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPACriticalIllness_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='CriticalIllness_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=49
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=50
	//Constant
	public static final String DEFAULT_BASE_URL='https://portal.uat-roojaipartners.com'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD='2'
	public static final String DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE='1'
	public static final String DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT='https://insure.uat-roojai.com/#/partnerlogin'
	public static final String DEFAULT_GROUND_PARTNER_AGENT_USER='chatchai.bun.en@roojai.com'
	public static final String DEFAULT_GROUND_PARTNER_AGENT_PASSWORD='admin'
	public static final String DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE='1'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_LANGUAGE='1'
	public static final String DEFAULT_GENDER_AND_MARITAL_STATUS='1'
	public static final String DEFAULT_BIRTH_DATE_MAIN='01/01/1988'
	public static final String DEFAULT_HEIGHT=''
	public static final String DEFAULT_WEIGHT=''
	public static final String DEFAULT_INSURED_OCCUPATION=''
	public static final String DEFAULT_INSURED_SALARY='0'
	public static final String DEFAULT_SMOKING_HABBIT='1'
	public static final String DEFAULT_QUERY_HEALTH_CONDITION='2'
	public static final String DEFAULT_QUERY_INSURED_DENIED_COVERAGE='2'
	public static final String DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES='2'
	public static final String DEFAULT_QUERY_INDUSTRY='2'
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
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_TO_DO='No'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09='2'
	public static final String DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10='2'
	public static final String DEFAULT_POSITIVE_CASE='No'
	public Map Input=[:]
	public Map Output=[:]
	public THARGPACriticalIllnessQuotationInputType(){
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
		this.Input.put('BaseUrl',this.DEFAULT_BASE_URL)
		this.Input.put('MaximizeMode',this.DEFAULT_MAXIMIZE_MODE)
		this.Input.put('WithAuth',this.DEFAULT_WITH_AUTH)
		this.Input.put('AuthUser',this.DEFAULT_AUTH_USER)
		this.Input.put('AuthPassword',this.DEFAULT_AUTH_PASSWORD)
		this.Input.put('GroundPartnerAgentLoginMethod',this.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
		this.Input.put('GroundPartnerAgentAccountSource',this.DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE)
		this.Input.put('GroundPartnerAgentUrlProductSelect',this.DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT)
		this.Input.put('GroundPartnerAgentUser',this.DEFAULT_GROUND_PARTNER_AGENT_USER)
		this.Input.put('GroundPartnerAgentPassword',this.DEFAULT_GROUND_PARTNER_AGENT_PASSWORD)
		this.Input.put('GroundPartnerAgentLanguage',this.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE)
		this.Input.put('Version',this.DEFAULT_VERSION)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('GenderAndMaritalStatus',this.DEFAULT_GENDER_AND_MARITAL_STATUS)
		this.Input.put('BirthDateMain',this.DEFAULT_BIRTH_DATE_MAIN)
		this.Input.put('Height',this.DEFAULT_HEIGHT)
		this.Input.put('Weight',this.DEFAULT_WEIGHT)
		this.Input.put('InsuredOccupation',this.DEFAULT_INSURED_OCCUPATION)
		this.Input.put('InsuredSalary',this.DEFAULT_INSURED_SALARY)
		this.Input.put('SmokingHabbit',this.DEFAULT_SMOKING_HABBIT)
		this.Input.put('QueryHealthCondition',this.DEFAULT_QUERY_HEALTH_CONDITION)
		this.Input.put('QueryInsuredDeniedCoverage',this.DEFAULT_QUERY_INSURED_DENIED_COVERAGE)
		this.Input.put('QueryDiedFromCriticalIllnesses',this.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES)
		this.Input.put('QueryIndustry',this.DEFAULT_QUERY_INDUSTRY)
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
		this.Input.put('QueryHospitalIncomeBenefitToDo',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_TO_DO)
		this.Input.put('QueryHospitalIncomeBenefitQuestion01',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01)
		this.Input.put('QueryHospitalIncomeBenefitQuestion02',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02)
		this.Input.put('QueryHospitalIncomeBenefitQuestion03',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03)
		this.Input.put('QueryHospitalIncomeBenefitQuestion04',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04)
		this.Input.put('QueryHospitalIncomeBenefitQuestion05',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05)
		this.Input.put('QueryHospitalIncomeBenefitQuestion06',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06)
		this.Input.put('QueryHospitalIncomeBenefitQuestion07',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07)
		this.Input.put('QueryHospitalIncomeBenefitQuestion08',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08)
		this.Input.put('QueryHospitalIncomeBenefitQuestion09',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09)
		this.Input.put('QueryHospitalIncomeBenefitQuestion10',this.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('GroundPartnerAgentLoginMethod','')
		this.Output.put('GroundPartnerAgentAccountSource','')
		this.Output.put('GroundPartnerAgentUrlProductSelect','')
		this.Output.put('GroundPartnerAgentUser','')
		this.Output.put('GroundPartnerAgentPassword','')
		this.Output.put('GroundPartnerAgentLanguage','')
		this.Output.put('Version','')
		this.Output.put('Language','')
		this.Output.put('GenderAndMaritalStatus','')
		this.Output.put('BirthDateMain','')
		this.Output.put('Height','')
		this.Output.put('Weight','')
		this.Output.put('InsuredOccupation','')
		this.Output.put('InsuredSalary','')
		this.Output.put('SmokingHabbit','')
		this.Output.put('QueryHealthCondition','')
		this.Output.put('QueryInsuredDeniedCoverage','')
		this.Output.put('QueryDiedFromCriticalIllnesses','')
		this.Output.put('QueryIndustry','')
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
		this.Output.put('QueryHospitalIncomeBenefitToDo','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion01','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion02','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion03','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion04','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion05','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion06','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion07','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion08','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion09','')
		this.Output.put('QueryHospitalIncomeBenefitQuestion10','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('GroundPartnerAgentSkipLoginUrl','')
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
			caseInput.put('GroundPartnerAgentLoginMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GroundPartnerAgentAccountSource',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GroundPartnerAgentUrlProductSelect',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GroundPartnerAgentUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GroundPartnerAgentPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GroundPartnerAgentLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('GenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Height',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Weight',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SmokingHabbit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHealthCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryInsuredDeniedCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryDiedFromCriticalIllnesses',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryIndustry',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseInput.put('QueryHospitalIncomeBenefitToDo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion01',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion02',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion03',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion04',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion05',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion06',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion07',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion08',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion09',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QueryHospitalIncomeBenefitQuestion10',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('GroundPartnerAgentLoginMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GroundPartnerAgentAccountSource',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GroundPartnerAgentUrlProductSelect',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GroundPartnerAgentUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GroundPartnerAgentPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GroundPartnerAgentLanguage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GenderAndMaritalStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BirthDateMain',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Height',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Weight',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuredSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SmokingHabbit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHealthCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryInsuredDeniedCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryDiedFromCriticalIllnesses',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryIndustry',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('QueryHospitalIncomeBenefitToDo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion01',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion02',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion03',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion04',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion05',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion06',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion07',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion08',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion09',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QueryHospitalIncomeBenefitQuestion10',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('GroundPartnerAgentSkipLoginUrl',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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