package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAKumkaLoanCarInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaLoanCar/KumkaLoanCar_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_LoanCar_Kumka.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='LoanCar_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=36
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=37
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaLoanCar/KumkaLoanCar_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_LoanCar_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='LoanCar_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=38
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=39
	//Constant
	public static final String DEFAULT_BASE_URL='https://compare.uat-mrkumka.com/carloan'
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
	public static final String DEFAULT_CUSTOMER_OCCUPATION=''
	public static final String DEFAULT_CUSTOMER_SALARY_POSITIVE_CASE='Yes'
	public static final String DEFAULT_CUSTOMER_SALARY='50000'
	public static final String DEFAULT_CUSTOMER_WORK_EXPERIENCE='4'
	public static final String DEFAULT_CUSTOMER_DOB_POSITIVE_CASE='Yes'
	public static final String DEFAULT_CUSTOMER_DOB='01/01/1988'
	public static final String DEFAULT_CUSTOMER_ADDRESS_POSITIVE_CASE='Yes'
	public static final String DEFAULT_CUSTOMER_ADDRESS='20230'
	public static final String DEFAULT_CAR_REGISTER_UNDER='1'
	public static final String DEFAULT_CAR_HAVE_INSURANCE='1'
	public static final String DEFAULT_CAR_INSURANCE_EXPIRE=''
	public static final String DEFAULT_CAR_INSURANCE_OFFER='Yes'
	public static final String DEFAULT_CAR_INSURANCE_CALL_ME_BACK_TO_DO='Yes'
	public static final String DEFAULT_CAR_INSURANCE_CALL_ME_BACK_NUMBER='0809591611'
	public static final String DEFAULT_CAR_OWNERSHIP='Yes'
	public static final String DEFAULT_CAR_INSTALMENT_POSITIVE_CASE='Yes'
	public static final String DEFAULT_CAR_INSTALMENT_PAID_TERM='7'
	public static final String DEFAULT_CAR_INSTALMENT_AMOUNT='10000'
	public static final String DEFAULT_LOAN_PRODUCT_01_HOME_LOAN='Yes'
	public static final String DEFAULT_LOAN_PRODUCT_02_CREDIT_CARD='Yes'
	public static final String DEFAULT_LOAN_PRODUCT_03_PERSONAL_LOAN='Yes'
	public static final String DEFAULT_LOAN_PRODUCT_04_NONE='No'
	public static final String DEFAULT_LATE_PAYMENT='0'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAKumkaLoanCarInputType(){
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
		this.Input.put('CustomerOccupation',this.DEFAULT_CUSTOMER_OCCUPATION)
		this.Input.put('CustomerSalaryPositiveCase',this.DEFAULT_CUSTOMER_SALARY_POSITIVE_CASE)
		this.Input.put('CustomerSalary',this.DEFAULT_CUSTOMER_SALARY)
		this.Input.put('CustomerWorkExperience',this.DEFAULT_CUSTOMER_WORK_EXPERIENCE)
		this.Input.put('CustomerDobPositiveCase',this.DEFAULT_CUSTOMER_DOB_POSITIVE_CASE)
		this.Input.put('CustomerDob',this.DEFAULT_CUSTOMER_DOB)
		this.Input.put('CustomerAddressPositiveCase',this.DEFAULT_CUSTOMER_ADDRESS_POSITIVE_CASE)
		this.Input.put('CustomerAddress',this.DEFAULT_CUSTOMER_ADDRESS)
		this.Input.put('CarRegisterUnder',this.DEFAULT_CAR_REGISTER_UNDER)
		this.Input.put('CarHaveInsurance',this.DEFAULT_CAR_HAVE_INSURANCE)
		this.Input.put('CarInsuranceExpire',this.DEFAULT_CAR_INSURANCE_EXPIRE)
		this.Input.put('CarInsuranceOffer',this.DEFAULT_CAR_INSURANCE_OFFER)
		this.Input.put('CarInsuranceCallMeBackToDo',this.DEFAULT_CAR_INSURANCE_CALL_ME_BACK_TO_DO)
		this.Input.put('CarInsuranceCallMeBackNumber',this.DEFAULT_CAR_INSURANCE_CALL_ME_BACK_NUMBER)
		this.Input.put('CarOwnership',this.DEFAULT_CAR_OWNERSHIP)
		this.Input.put('CarInstalmentPositiveCase',this.DEFAULT_CAR_INSTALMENT_POSITIVE_CASE)
		this.Input.put('CarInstalmentPaidTerm',this.DEFAULT_CAR_INSTALMENT_PAID_TERM)
		this.Input.put('CarInstalmentAmount',this.DEFAULT_CAR_INSTALMENT_AMOUNT)
		this.Input.put('LoanProduct01HomeLoan',this.DEFAULT_LOAN_PRODUCT_01_HOME_LOAN)
		this.Input.put('LoanProduct02CreditCard',this.DEFAULT_LOAN_PRODUCT_02_CREDIT_CARD)
		this.Input.put('LoanProduct03PersonalLoan',this.DEFAULT_LOAN_PRODUCT_03_PERSONAL_LOAN)
		this.Input.put('LoanProduct04None',this.DEFAULT_LOAN_PRODUCT_04_NONE)
		this.Input.put('LatePayment',this.DEFAULT_LATE_PAYMENT)
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
		this.Output.put('CustomerOccupation','')
		this.Output.put('CustomerSalaryPositiveCase','')
		this.Output.put('CustomerSalary','')
		this.Output.put('CustomerWorkExperience','')
		this.Output.put('CustomerDobPositiveCase','')
		this.Output.put('CustomerDob','')
		this.Output.put('CustomerAddressPositiveCase','')
		this.Output.put('CustomerAddress','')
		this.Output.put('CarRegisterUnder','')
		this.Output.put('CarHaveInsurance','')
		this.Output.put('CarInsuranceExpire','')
		this.Output.put('CarInsuranceOffer','')
		this.Output.put('CarInsuranceCallMeBackToDo','')
		this.Output.put('CarInsuranceCallMeBackNumber','')
		this.Output.put('CarOwnership','')
		this.Output.put('CarInstalmentPositiveCase','')
		this.Output.put('CarInstalmentPaidTerm','')
		this.Output.put('CarInstalmentAmount','')
		this.Output.put('LoanProduct01HomeLoan','')
		this.Output.put('LoanProduct02CreditCard','')
		this.Output.put('LoanProduct03PersonalLoan','')
		this.Output.put('LoanProduct04None','')
		this.Output.put('LatePayment','')
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
			caseInput.put('CustomerOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerSalaryPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerWorkExperience',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerDobPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerAddressPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CustomerAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarRegisterUnder',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarHaveInsurance',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInsuranceExpire',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInsuranceOffer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInsuranceCallMeBackToDo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInsuranceCallMeBackNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarOwnership',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInstalmentPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInstalmentPaidTerm',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CarInstalmentAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoanProduct01HomeLoan',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoanProduct02CreditCard',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoanProduct03PersonalLoan',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoanProduct04None',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LatePayment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('CustomerOccupation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerSalaryPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerSalary',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerWorkExperience',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerDobPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerAddressPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CustomerAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarRegisterUnder',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarHaveInsurance',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInsuranceExpire',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInsuranceOffer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInsuranceCallMeBackToDo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInsuranceCallMeBackNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarOwnership',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInstalmentPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInstalmentPaidTerm',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CarInstalmentAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoanProduct01HomeLoan',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoanProduct02CreditCard',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoanProduct03PersonalLoan',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoanProduct04None',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LatePayment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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