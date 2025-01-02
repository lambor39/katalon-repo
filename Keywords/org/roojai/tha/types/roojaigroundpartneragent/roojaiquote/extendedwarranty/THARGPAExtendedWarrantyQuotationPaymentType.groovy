package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THARGPAExtendedWarrantyQuotationPaymentType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_04_Payment.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Payment.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=30
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=31
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_04_Payment.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Payment.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=65
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=66
	//Constant
	public static final String DEFAULT_BASE_URL='https://portal.uat-roojaipartners.com'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_PAYMENT_METHOD='1'
	public static final String DEFAULT_CC_IS_YEARLY='Yes'
	public static final String DEFAULT_CC_INSTALMENT='1'
	public static final String DEFAULT_CC_NUMBER='4242424242424242'
	public static final String DEFAULT_CC_NAME='Pay Roojai'
	public static final String DEFAULT_CC_EXPIRY_MONTH='12'
	public static final String DEFAULT_CC_EXPIRY_YEAR='2029'
	public static final String DEFAULT_CC_CVV='123'
	public static final String DEFAULT_CC_BANK='Pay Bank'
	public static final String DEFAULT_CC_SUCCESS_CASE='Yes'
	public static final String DEFAULT_IB_BANK='2'
	public static final String DEFAULT_IB_SUCCESS_CASE='Yes'
	public static final String DEFAULT_TRUE_MONEY_IS_YEARLY='Yes'
	public static final String DEFAULT_TRUE_MONEY_INSTALMENT='1'
	public static final String DEFAULT_TRUE_MONEY_MOBILE_NO='0809591611'
	public static final String DEFAULT_TRUE_MONEY_EMAIL='chatchai.bun@roojai.com'
	public static final String DEFAULT_TRUE_MONEY_SUCCESS_CASE='Yes'
	public static final String DEFAULT_RABBIT_LINE_PAY_IS_YEARLY='Yes'
	public static final String DEFAULT_RABBIT_LINE_PAY_INSTALMENT='1'
	public static final String DEFAULT_RABBIT_LINE_PAY_MOBILE_NO='0809591611'
	public static final String DEFAULT_RABBIT_LINE_PAY_EMAIL='chatchai.bun@roojai.com'
	public static final String DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE='Yes'
	public static final String DEFAULT_E_POLICY='Yes'
	public static final String DEFAULT_AUTO_RENEW='Yes'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THARGPAExtendedWarrantyQuotationPaymentType(){
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
		this.Input.put('PaymentMethod',this.DEFAULT_PAYMENT_METHOD)
		this.Input.put('CcIsYearly',this.DEFAULT_CC_IS_YEARLY)
		this.Input.put('CcInstalment',this.DEFAULT_CC_INSTALMENT)
		this.Input.put('CcNumber',this.DEFAULT_CC_NUMBER)
		this.Input.put('CcName',this.DEFAULT_CC_NAME)
		this.Input.put('CcExpiryMonth',this.DEFAULT_CC_EXPIRY_MONTH)
		this.Input.put('CcExpiryYear',this.DEFAULT_CC_EXPIRY_YEAR)
		this.Input.put('CcCvv',this.DEFAULT_CC_CVV)
		this.Input.put('CcBank',this.DEFAULT_CC_BANK)
		this.Input.put('CcSuccessCase',this.DEFAULT_CC_SUCCESS_CASE)
		this.Input.put('IbBank',this.DEFAULT_IB_BANK)
		this.Input.put('IbSuccessCase',this.DEFAULT_IB_SUCCESS_CASE)
		this.Input.put('TrueMoneyIsYearly',this.DEFAULT_TRUE_MONEY_IS_YEARLY)
		this.Input.put('TrueMoneyInstalment',this.DEFAULT_TRUE_MONEY_INSTALMENT)
		this.Input.put('TrueMoneyMobileNo',this.DEFAULT_TRUE_MONEY_MOBILE_NO)
		this.Input.put('TrueMoneyEmail',this.DEFAULT_TRUE_MONEY_EMAIL)
		this.Input.put('TrueMoneySuccessCase',this.DEFAULT_TRUE_MONEY_SUCCESS_CASE)
		this.Input.put('RabbitLinePayIsYearly',this.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY)
		this.Input.put('RabbitLinePayInstalment',this.DEFAULT_RABBIT_LINE_PAY_INSTALMENT)
		this.Input.put('RabbitLinePayMobileNo',this.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO)
		this.Input.put('RabbitLinePayEmail',this.DEFAULT_RABBIT_LINE_PAY_EMAIL)
		this.Input.put('RabbitLinePaySuccessCase',this.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE)
		this.Input.put('EPolicy',this.DEFAULT_E_POLICY)
		this.Input.put('AutoRenew',this.DEFAULT_AUTO_RENEW)
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
		this.Output.put('PaymentMethod','')
		this.Output.put('CcIsYearly','')
		this.Output.put('CcInstalment','')
		this.Output.put('CcNumber','')
		this.Output.put('CcName','')
		this.Output.put('CcExpiryMonth','')
		this.Output.put('CcExpiryYear','')
		this.Output.put('CcCvv','')
		this.Output.put('CcBank','')
		this.Output.put('CcSuccessCase','')
		this.Output.put('IbBank','')
		this.Output.put('IbSuccessCase','')
		this.Output.put('TrueMoneyIsYearly','')
		this.Output.put('TrueMoneyInstalment','')
		this.Output.put('TrueMoneyMobileNo','')
		this.Output.put('TrueMoneyEmail','')
		this.Output.put('TrueMoneySuccessCase','')
		this.Output.put('RabbitLinePayIsYearly','')
		this.Output.put('RabbitLinePayInstalment','')
		this.Output.put('RabbitLinePayMobileNo','')
		this.Output.put('RabbitLinePayEmail','')
		this.Output.put('RabbitLinePaySuccessCase','')
		this.Output.put('EPolicy','')
		this.Output.put('AutoRenew','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('OpportunityNumber','')
		this.Output.put('CcAmtYearly','')
		this.Output.put('CcAmtDeposit','')
		this.Output.put('CcAmtMonthly','')
		this.Output.put('CcAmtInstalment','')
		this.Output.put('CcAmtNoDepositFirstAmount','')
		this.Output.put('CcAmtNoDepositAmount','')
		this.Output.put('CcAmtNoDepositTotal','')
		this.Output.put('CcAmtQuarterlyFirstAmount','')
		this.Output.put('CcAmtQuarterlyAmount','')
		this.Output.put('CcAmtQuarterlyTotal','')
		this.Output.put('IbAmtYearly','')
		this.Output.put('QrAmtYearly','')
		this.Output.put('TrueMoneyAmtYearly','')
		this.Output.put('TrueMoneyAmtDeposit','')
		this.Output.put('TrueMoneyAmtMonthly','')
		this.Output.put('TrueMoneyAmtInstalment','')
		this.Output.put('TrueMoneyAmtNoDepositFirstAmount','')
		this.Output.put('TrueMoneyAmtNoDepositAmount','')
		this.Output.put('TrueMoneyAmtNoDepositTotal','')
		this.Output.put('TrueMoneyAmtQuarterlyFirstAmount','')
		this.Output.put('TrueMoneyAmtQuarterlyAmount','')
		this.Output.put('TrueMoneyAmtQuarterlyTotal','')
		this.Output.put('RabbitLinePayAmtYearly','')
		this.Output.put('RabbitLinePayAmtDeposit','')
		this.Output.put('RabbitLinePayAmtMonthly','')
		this.Output.put('RabbitLinePayAmtInstalment','')
		this.Output.put('RabbitLinePayAmtNoDepositFirstAmount','')
		this.Output.put('RabbitLinePayAmtNoDepositAmount','')
		this.Output.put('RabbitLinePayAmtNoDepositTotal','')
		this.Output.put('RabbitLinePayAmtQuarterlyFirstAmount','')
		this.Output.put('RabbitLinePayAmtQuarterlyAmount','')
		this.Output.put('RabbitLinePayAmtQuarterlyTotal','')
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
			caseInput.put('PaymentMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcIsYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcExpiryMonth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcExpiryYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcCvv',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcBank',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CcSuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('IbBank',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('IbSuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TrueMoneyIsYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TrueMoneyInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TrueMoneyMobileNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TrueMoneyEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TrueMoneySuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RabbitLinePayIsYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RabbitLinePayInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RabbitLinePayMobileNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RabbitLinePayEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RabbitLinePaySuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('EPolicy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AutoRenew',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('PaymentMethod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcIsYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcExpiryMonth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcExpiryYear',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcCvv',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcBank',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcSuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('IbBank',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('IbSuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyIsYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyMobileNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneySuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayIsYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayMobileNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePaySuccessCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('EPolicy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AutoRenew',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OpportunityNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtDeposit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtMonthly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtNoDepositFirstAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtNoDepositAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtNoDepositTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtQuarterlyFirstAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtQuarterlyAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CcAmtQuarterlyTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('IbAmtYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QrAmtYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtDeposit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtMonthly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtNoDepositFirstAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtNoDepositAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtNoDepositTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtQuarterlyFirstAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtQuarterlyAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TrueMoneyAmtQuarterlyTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtDeposit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtMonthly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtNoDepositFirstAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtNoDepositAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtNoDepositTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtQuarterlyFirstAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtQuarterlyAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RabbitLinePayAmtQuarterlyTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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