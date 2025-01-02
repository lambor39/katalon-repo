package org.roojai.tha.types.kumka.insurecar
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAKumkaInsureCarInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaInsureCar/KumkaInsureCar_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_InsureCar_Kumka.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='InsureCar_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=28
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=29
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaInsureCar/KumkaInsureCar_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_InsureCar_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='InsureCar_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=30
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=31
	//Constant
	public static final String DEFAULT_BASE_URL='https://compare.uat-mrkumka.com'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LOGIN_USER='demo'
	public static final String DEFAULT_LOGIN_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_CAR_MAKE=''
	public static final String DEFAULT_CAR_MODEL=''
	public static final String DEFAULT_CAR_YEAR=''
	public static final String DEFAULT_CAR_SUBMODEL=''
	public static final String DEFAULT_CUSTOMER_PHONE_NO='0809591611'
	public static final String DEFAULT_CUSTOMER_MARITAL_STATUS_SEX='1'
	public static final String DEFAULT_CUSTOMER_DOB_POSITIVE_CASE='Yes'
	public static final String DEFAULT_CUSTOMER_DOB='01/01/1988'
	public static final String DEFAULT_CUSTOMER_YEAR_OF_DRIVING='1'
	public static final String DEFAULT_CUSTOMER_NUMBER_OF_CLAIM='1'
	public static final String DEFAULT_CUSTOMER_POSTAL_CODE_POSITIVE_CASE='Yes'
	public static final String DEFAULT_CUSTOMER_POSTAL_CODE='20230'
	public static final String DEFAULT_CAR_ODOMETER='1'
	public static final String DEFAULT_CAR_USAGE='1'
	public static final String DEFAULT_CAR_DASH_CAMERA='Yes'
	public static final String DEFAULT_CAR_INSURANCE_DUE='1'
	public static final String DEFAULT_CAR_NCB_RATE='1'
	public static final String DEFAULT_CAR_CURRENT_INSURER=''
	public static final String DEFAULT_CAR_FINANCING='Yes'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAKumkaInsureCarInputType(){
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
		this.Input.put('LoginUser',this.DEFAULT_LOGIN_USER)
		this.Input.put('LoginPassword',this.DEFAULT_LOGIN_PASSWORD)
		this.Input.put('Version',this.DEFAULT_VERSION)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('CarMake',this.DEFAULT_CAR_MAKE)
		this.Input.put('CarModel',this.DEFAULT_CAR_MODEL)
		this.Input.put('CarYear',this.DEFAULT_CAR_YEAR)
		this.Input.put('CarSubmodel',this.DEFAULT_CAR_SUBMODEL)
		this.Input.put('CustomerPhoneNo',this.DEFAULT_CUSTOMER_PHONE_NO)
		this.Input.put('CustomerMaritalStatusSex',this.DEFAULT_CUSTOMER_MARITAL_STATUS_SEX)
		this.Input.put('CustomerDobPositiveCase',this.DEFAULT_CUSTOMER_DOB_POSITIVE_CASE)
		this.Input.put('CustomerDob',this.DEFAULT_CUSTOMER_DOB)
		this.Input.put('CustomerYearOfDriving',this.DEFAULT_CUSTOMER_YEAR_OF_DRIVING)
		this.Input.put('CustomerNumberOfClaim',this.DEFAULT_CUSTOMER_NUMBER_OF_CLAIM)
		this.Input.put('CustomerPostalCodePositiveCase',this.DEFAULT_CUSTOMER_POSTAL_CODE_POSITIVE_CASE)
		this.Input.put('CustomerPostalCode',this.DEFAULT_CUSTOMER_POSTAL_CODE)
		this.Input.put('CarOdometer',this.DEFAULT_CAR_ODOMETER)
		this.Input.put('CarUsage',this.DEFAULT_CAR_USAGE)
		this.Input.put('CarDashCamera',this.DEFAULT_CAR_DASH_CAMERA)
		this.Input.put('CarInsuranceDue',this.DEFAULT_CAR_INSURANCE_DUE)
		this.Input.put('CarNcbRate',this.DEFAULT_CAR_NCB_RATE)
		this.Input.put('CarCurrentInsurer',this.DEFAULT_CAR_CURRENT_INSURER)
		this.Input.put('CarFinancing',this.DEFAULT_CAR_FINANCING)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('LoginUser','')
		this.Output.put('LoginPassword','')
		this.Output.put('Version','')
		this.Output.put('Language','')
		this.Output.put('CarMake','')
		this.Output.put('CarModel','')
		this.Output.put('CarYear','')
		this.Output.put('CarSubmodel','')
		this.Output.put('CustomerPhoneNo','')
		this.Output.put('CustomerMaritalStatusSex','')
		this.Output.put('CustomerDobPositiveCase','')
		this.Output.put('CustomerDob','')
		this.Output.put('CustomerYearOfDriving','')
		this.Output.put('CustomerNumberOfClaim','')
		this.Output.put('CustomerPostalCodePositiveCase','')
		this.Output.put('CustomerPostalCode','')
		this.Output.put('CarOdometer','')
		this.Output.put('CarUsage','')
		this.Output.put('CarDashCamera','')
		this.Output.put('CarInsuranceDue','')
		this.Output.put('CarNcbRate','')
		this.Output.put('CarCurrentInsurer','')
		this.Output.put('CarFinancing','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
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
			caseInput.put('LoginUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoginPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseInput.put('CustomerPhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerMaritalStatusSex',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerDobPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerYearOfDriving',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerNumberOfClaim',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerPostalCodePositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarOdometer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarUsage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarDashCamera',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInsuranceDue',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarNcbRate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarCurrentInsurer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarFinancing',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('LoginUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoginPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('CustomerPhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerMaritalStatusSex',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerDobPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerYearOfDriving',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerNumberOfClaim',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerPostalCodePositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarOdometer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarUsage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarDashCamera',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInsuranceDue',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarNcbRate',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarCurrentInsurer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarFinancing',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}