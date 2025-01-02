package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THARGPAExtendedWarrantyQuotationDetail2Type{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_05_Detail2.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Detail2.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=24
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=25
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_05_Detail2.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Detail2.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=29
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=30
	//Constant
	public static final String DEFAULT_BASE_URL='https://portal.uat-roojaipartners.com'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_UNDER_FINANCING='Yes'
	public static final String DEFAULT_FINANCIAL_ORGANISATION=''
	public static final String DEFAULT_WITH_RED_PLATE='No'
	public static final String DEFAULT_CHASSIS_NUMBER=''
	public static final String DEFAULT_PREV_INSURANCE_COVERED='Yes'
	public static final String DEFAULT_PREV_INSURANCE_COMPANY=''
	public static final String DEFAULT_PREV_INSURANCE_TYPE=''
	public static final String DEFAULT_POLICY_EXPIRATION_DAY_OFFSET='0'
	public static final String DEFAULT_POLICY_EXPIRATION_DATE=''
	public static final String DEFAULT_POLICY_START_DAY_OFFSET='0'
	public static final String DEFAULT_POLICY_START_DATE=''
	public static final String DEFAULT_SEND_TO_POSTAL_CODE='20230'
	public static final String DEFAULT_SEND_TO_PROVINCE='Chon buri'
	public static final String DEFAULT_SEND_TO_DISTRICT='Si Racha'
	public static final String DEFAULT_SEND_TO_SUB_DISTRICT='Thung Sukhla'
	public static final String DEFAULT_SEND_TO_ROAD='Sukhumvit Rd.'
	public static final String DEFAULT_SEND_TO_BUILDING_NAME='HM Building'
	public static final String DEFAULT_SEND_TO_BUILDING_NUMBER='4/222'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THARGPAExtendedWarrantyQuotationDetail2Type(){
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
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('UnderFinancing',this.DEFAULT_UNDER_FINANCING)
		this.Input.put('FinancialOrganisation',this.DEFAULT_FINANCIAL_ORGANISATION)
		this.Input.put('WithRedPlate',this.DEFAULT_WITH_RED_PLATE)
		this.Input.put('ChassisNumber',this.DEFAULT_CHASSIS_NUMBER)
		this.Input.put('PrevInsuranceCovered',this.DEFAULT_PREV_INSURANCE_COVERED)
		this.Input.put('PrevInsuranceCompany',this.DEFAULT_PREV_INSURANCE_COMPANY)
		this.Input.put('PrevInsuranceType',this.DEFAULT_PREV_INSURANCE_TYPE)
		this.Input.put('PolicyExpirationDayOffset',this.DEFAULT_POLICY_EXPIRATION_DAY_OFFSET)
		this.Input.put('PolicyExpirationDate',this.DEFAULT_POLICY_EXPIRATION_DATE)
		this.Input.put('PolicyStartDayOffset',this.DEFAULT_POLICY_START_DAY_OFFSET)
		this.Input.put('PolicyStartDate',this.DEFAULT_POLICY_START_DATE)
		this.Input.put('SendToPostalCode',this.DEFAULT_SEND_TO_POSTAL_CODE)
		this.Input.put('SendToProvince',this.DEFAULT_SEND_TO_PROVINCE)
		this.Input.put('SendToDistrict',this.DEFAULT_SEND_TO_DISTRICT)
		this.Input.put('SendToSubDistrict',this.DEFAULT_SEND_TO_SUB_DISTRICT)
		this.Input.put('SendToRoad',this.DEFAULT_SEND_TO_ROAD)
		this.Input.put('SendToBuildingName',this.DEFAULT_SEND_TO_BUILDING_NAME)
		this.Input.put('SendToBuildingNumber',this.DEFAULT_SEND_TO_BUILDING_NUMBER)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Language','')
		this.Output.put('UnderFinancing','')
		this.Output.put('FinancialOrganisation','')
		this.Output.put('WithRedPlate','')
		this.Output.put('ChassisNumber','')
		this.Output.put('PrevInsuranceCovered','')
		this.Output.put('PrevInsuranceCompany','')
		this.Output.put('PrevInsuranceType','')
		this.Output.put('PolicyExpirationDayOffset','')
		this.Output.put('PolicyExpirationDate','')
		this.Output.put('PolicyStartDayOffset','')
		this.Output.put('PolicyStartDate','')
		this.Output.put('SendToPostalCode','')
		this.Output.put('SendToProvince','')
		this.Output.put('SendToDistrict','')
		this.Output.put('SendToSubDistrict','')
		this.Output.put('SendToRoad','')
		this.Output.put('SendToBuildingName','')
		this.Output.put('SendToBuildingNumber','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('OpportunityNumber','')
		this.Output.put('PolicyAmtYearly','')
		this.Output.put('PolicyAmtInstalment','')
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
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('UnderFinancing',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FinancialOrganisation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('WithRedPlate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ChassisNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PrevInsuranceCovered',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PrevInsuranceCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PrevInsuranceType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PolicyExpirationDayOffset',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PolicyExpirationDate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PolicyStartDayOffset',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PolicyStartDate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToProvince',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToSubDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToRoad',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToBuildingName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SendToBuildingNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('UnderFinancing',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FinancialOrganisation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('WithRedPlate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ChassisNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrevInsuranceCovered',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrevInsuranceCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrevInsuranceType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyExpirationDayOffset',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyExpirationDate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyStartDayOffset',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyStartDate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToProvince',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToSubDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToRoad',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToBuildingName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SendToBuildingNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OpportunityNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyAmtYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyAmtInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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