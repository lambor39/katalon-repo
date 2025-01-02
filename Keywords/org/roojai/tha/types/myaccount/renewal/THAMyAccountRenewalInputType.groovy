package org.roojai.tha.types.myaccount.renewal
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
import org.roojai.tha.core.THAGlobalConst
public class THAMyAccountRenewalInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/MyAccountRenewal/MyAccountRenewal_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_MyAccount_Renewal.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='MyAccount_Renewal_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=15
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=16
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/MyAccountRenewal/MyAccountRenewal_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_MyAccount_Renewal.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='MyAccount_Renewal_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=17
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=18
	//Constant
	public static final String DEFAULT_BASE_URL='https://myaccount.uat-roojai.com'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_LOGIN_METHOD='1'
	public static final String DEFAULT_LOGIN_EMAIL_THAI_ID_PASSPORT_NO=''
	public static final String DEFAULT_LOGIN_FACEBOOK_USER=THAGlobalConst.DEFAULT_FACEBOOK_ACCOUNT
	public static final String DEFAULT_LOGIN_FACEBOOK_PASSWORD=THAGlobalConst.DEFAULT_FACEBOOK_PASSWORD
	public static final String DEFAULT_OTP_METHOD='1'
	public static final String DEFAULT_OTP_EMAIL=''
	public static final String DEFAULT_OTP_PHONE_NO=''
	public static final String DEFAULT_EXPECTED_ACCOUNT_NAME=''
	public static final String DEFAULT_POSITIVE_CASE='No'
	public Map Input=[:]
	public Map Output=[:]
	public THAMyAccountRenewalInputType(){
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
		this.Input.put('Version',this.DEFAULT_VERSION)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('LoginMethod',this.DEFAULT_LOGIN_METHOD)
		this.Input.put('LoginEmailThaiIdPassportNo',this.DEFAULT_LOGIN_EMAIL_THAI_ID_PASSPORT_NO)
		this.Input.put('LoginFacebookUser',this.DEFAULT_LOGIN_FACEBOOK_USER)
		this.Input.put('LoginFacebookPassword',this.DEFAULT_LOGIN_FACEBOOK_PASSWORD)
		this.Input.put('OtpMethod',this.DEFAULT_OTP_METHOD)
		this.Input.put('OtpEmail',this.DEFAULT_OTP_EMAIL)
		this.Input.put('OtpPhoneNo',this.DEFAULT_OTP_PHONE_NO)
		this.Input.put('ExpectedAccountName',this.DEFAULT_EXPECTED_ACCOUNT_NAME)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Version','')
		this.Output.put('Language','')
		this.Output.put('LoginMethod','')
		this.Output.put('LoginEmailThaiIdPassportNo','')
		this.Output.put('LoginFacebookUser','')
		this.Output.put('LoginFacebookPassword','')
		this.Output.put('OtpMethod','')
		this.Output.put('OtpEmail','')
		this.Output.put('OtpPhoneNo','')
		this.Output.put('ExpectedAccountName','')
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
			caseInput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoginMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoginEmailThaiIdPassportNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoginFacebookUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoginFacebookPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OtpMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OtpEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OtpPhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ExpectedAccountName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoginMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoginEmailThaiIdPassportNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoginFacebookUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoginFacebookPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OtpMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OtpEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OtpPhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ExpectedAccountName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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