package org.roojai.tha.types.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAExtendedWarrantyQuotationResultType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsiteExtendedWarranty/ExtendedWarranty_Quotation_02_Result.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_ExtendedWarranty_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='Quotation_Result.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=15
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=16
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/QuotationWebsiteExtendedWarranty/ExtendedWarranty_Quotation_02_Result.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_ExtendedWarranty_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='Quotation_Result.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=45
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=46
	//Constant
	public static final String DEFAULT_BASE_URL='https://insure.uat-roojai.com/quote/#/?productType=ExtendedWarranty'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_PRE_PACKAGE='4'
	public static final String DEFAULT_PLAN_PACKAGE='1'
	public static final String DEFAULT_QUOTE_BY='1'
	public static final String DEFAULT_QUOTE_PHONE_NO='0638961786'
	public static final String DEFAULT_QUOTE_EMAIL='chatchai.bun@roojai.com'
	public static final String DEFAULT_QUOTE_NEWSLETTER='Yes'
	public static final String DEFAULT_QUOTE_CALL_ME_NOW='No'
	public static final String DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO='No'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAExtendedWarrantyQuotationResultType(){
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
		this.Input.put('PrePackage',this.DEFAULT_PRE_PACKAGE)
		this.Input.put('PlanPackage',this.DEFAULT_PLAN_PACKAGE)
		this.Input.put('QuoteBy',this.DEFAULT_QUOTE_BY)
		this.Input.put('QuotePhoneNo',this.DEFAULT_QUOTE_PHONE_NO)
		this.Input.put('QuoteEmail',this.DEFAULT_QUOTE_EMAIL)
		this.Input.put('QuoteNewsletter',this.DEFAULT_QUOTE_NEWSLETTER)
		this.Input.put('QuoteCallMeNow',this.DEFAULT_QUOTE_CALL_ME_NOW)
		this.Input.put('QuotePDFDownloadToDo',this.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO)
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
		this.Output.put('PrePackage','')
		this.Output.put('PlanPackage','')
		this.Output.put('QuoteBy','')
		this.Output.put('QuotePhoneNo','')
		this.Output.put('QuoteEmail','')
		this.Output.put('QuoteNewsletter','')
		this.Output.put('QuoteCallMeNow','')
		this.Output.put('QuotePDFDownloadToDo','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('OpportunityNumber','')
		this.Output.put('PrePackagePremiumYearly','')
		this.Output.put('PrePackagePremiumDeposit','')
		this.Output.put('PrePackagePremiumMonthly','')
		this.Output.put('PrePackagePremiumInstalment','')
		this.Output.put('PrePackagePremiumNoDepositAmount','')
		this.Output.put('PrePackagePremiumNoDepositTotal','')
		this.Output.put('PrePackagePremiumQuarterlyAmount','')
		this.Output.put('PrePackagePremiumQuarterlyTotal','')
		this.Output.put('PostPrePackagePremiumYearly','')
		this.Output.put('PostPrePackagePremiumDeposit','')
		this.Output.put('PostPrePackagePremiumMonthly','')
		this.Output.put('PostPrePackagePremiumInstalment','')
		this.Output.put('PostPrePackagePremiumNoDepositAmount','')
		this.Output.put('PostPrePackagePremiumNoDepositTotal','')
		this.Output.put('PostPrePackagePremiumQuarterlyAmount','')
		this.Output.put('PostPrePackagePremiumQuarterlyTotal','')
		this.Output.put('PremiumYearly','')
		this.Output.put('PremiumDeposit','')
		this.Output.put('PremiumMonthly','')
		this.Output.put('PremiumInstalment','')
		this.Output.put('PremiumNoDepositAmount','')
		this.Output.put('PremiumNoDepositTotal','')
		this.Output.put('PremiumQuarterlyAmount','')
		this.Output.put('PremiumQuarterlyTotal','')
		this.Output.put('PolicyInsurer','')
		this.Output.put('QuotePDFDownloadDetail','')
		this.Output.put('QuotePDFDownloadResult','')
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
			caseInput.put('PrePackage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PlanPackage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QuoteBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QuotePhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QuoteEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QuoteNewsletter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QuoteCallMeNow',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('QuotePDFDownloadToDo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('PrePackage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PlanPackage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuoteBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuotePhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuoteEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuoteNewsletter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuoteCallMeNow',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuotePDFDownloadToDo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OpportunityNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumDeposit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumMonthly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumNoDepositAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumNoDepositTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumQuarterlyAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PrePackagePremiumQuarterlyTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumDeposit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumMonthly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumNoDepositAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumNoDepositTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumQuarterlyAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PostPrePackagePremiumQuarterlyTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumYearly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumDeposit',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumMonthly',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumNoDepositAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumNoDepositTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumQuarterlyAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PremiumQuarterlyTotal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyInsurer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuotePDFDownloadDetail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('QuotePDFDownloadResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}