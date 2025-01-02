package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAKumkaLoanCarResultType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaLoanCar/KumkaLoanCar_02_Result.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_LoanCar_Kumka.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='LoanCar_Result.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=26
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=27
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaLoanCar/KumkaLoanCar_02_Result.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_LoanCar_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='LoanCar_Result.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=86
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=87
	//Constant
	public static final String DEFAULT_BASE_URL='https://compare.uat-mrkumka.com/carloan'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_EMAIL_TO_SAVE='oohhooworld.th@outlook.com'
	public static final String DEFAULT_APPLY_FILTER='No'
	public static final String DEFAULT_FILL_LOANS_REQUEST_AMOUNT='No'
	public static final String DEFAULT_POSITIVE_CASE_LOANS_REQUEST_AMOUNT='Yes'
	public static final String DEFAULT_LOANS_REQUEST_AMOUNT=''
	public static final String DEFAULT_FILL_NUMBER_OF_INSTALMENT='No'
	public static final String DEFAULT_POSITIVE_CASE_NUMBER_OF_INSTALMENT='Yes'
	public static final String DEFAULT_NUMBER_OF_INSTALMENT='24'
	public static final String DEFAULT_FILL_TRANSFER_RIGHTS='No'
	public static final String DEFAULT_TRANSFER_RIGHTS='All'
	public static final String DEFAULT_FILL_SORTING_BY='No'
	public static final String DEFAULT_SORTING_BY='Amount'
	public static final String DEFAULT_OUTBOUND_SAVE='No'
	public static final String DEFAULT_OUTBOUND_PREFIX_NAME='4'
	public static final String DEFAULT_OUTBOUND_FULL_NAME='Testing LoanCar'
	public static final String DEFAULT_OUTBOUND_MOBILE_NUMBER='0638961786'
	public static final String DEFAULT_OUTBOUND_FILL_EMAIL_ADDRESS='Yes'
	public static final String DEFAULT_OUTBOUND_EMAIL_ADDRESS='oohhooworld.th@outlook.com'
	public static final String DEFAULT_OUTBOUND_CALL_BACK_TIME='1'
	public static final String DEFAULT_OUTBOUND_ACCEPT_TERM_AND_CONDITION='Yes'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAKumkaLoanCarResultType(){
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
		this.Input.put('EmailToSave',this.DEFAULT_EMAIL_TO_SAVE)
		this.Input.put('ApplyFilter',this.DEFAULT_APPLY_FILTER)
		this.Input.put('FillLoansRequestAmount',this.DEFAULT_FILL_LOANS_REQUEST_AMOUNT)
		this.Input.put('PositiveCaseLoansRequestAmount',this.DEFAULT_POSITIVE_CASE_LOANS_REQUEST_AMOUNT)
		this.Input.put('LoansRequestAmount',this.DEFAULT_LOANS_REQUEST_AMOUNT)
		this.Input.put('FillNumberOfInstalment',this.DEFAULT_FILL_NUMBER_OF_INSTALMENT)
		this.Input.put('PositiveCaseNumberOfInstalment',this.DEFAULT_POSITIVE_CASE_NUMBER_OF_INSTALMENT)
		this.Input.put('NumberOfInstalment',this.DEFAULT_NUMBER_OF_INSTALMENT)
		this.Input.put('FillTransferRights',this.DEFAULT_FILL_TRANSFER_RIGHTS)
		this.Input.put('TransferRights',this.DEFAULT_TRANSFER_RIGHTS)
		this.Input.put('FillSortingBy',this.DEFAULT_FILL_SORTING_BY)
		this.Input.put('SortingBy',this.DEFAULT_SORTING_BY)
		this.Input.put('OutboundSave',this.DEFAULT_OUTBOUND_SAVE)
		this.Input.put('OutboundPrefixName',this.DEFAULT_OUTBOUND_PREFIX_NAME)
		this.Input.put('OutboundFullName',this.DEFAULT_OUTBOUND_FULL_NAME)
		this.Input.put('OutboundMobileNumber',this.DEFAULT_OUTBOUND_MOBILE_NUMBER)
		this.Input.put('OutboundFillEmailAddress',this.DEFAULT_OUTBOUND_FILL_EMAIL_ADDRESS)
		this.Input.put('OutboundEmailAddress',this.DEFAULT_OUTBOUND_EMAIL_ADDRESS)
		this.Input.put('OutboundCallBackTime',this.DEFAULT_OUTBOUND_CALL_BACK_TIME)
		this.Input.put('OutboundAcceptTermAndCondition',this.DEFAULT_OUTBOUND_ACCEPT_TERM_AND_CONDITION)
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
		this.Output.put('EmailToSave','')
		this.Output.put('ApplyFilter','')
		this.Output.put('FillLoansRequestAmount','')
		this.Output.put('PositiveCaseLoansRequestAmount','')
		this.Output.put('LoansRequestAmount','')
		this.Output.put('FillNumberOfInstalment','')
		this.Output.put('PositiveCaseNumberOfInstalment','')
		this.Output.put('NumberOfInstalment','')
		this.Output.put('FillTransferRights','')
		this.Output.put('TransferRights','')
		this.Output.put('FillSortingBy','')
		this.Output.put('SortingBy','')
		this.Output.put('OutboundSave','')
		this.Output.put('OutboundPrefixName','')
		this.Output.put('OutboundFullName','')
		this.Output.put('OutboundMobileNumber','')
		this.Output.put('OutboundFillEmailAddress','')
		this.Output.put('OutboundEmailAddress','')
		this.Output.put('OutboundCallBackTime','')
		this.Output.put('OutboundAcceptTermAndCondition','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('DefaultSaveQuoteId','')
		this.Output.put('DefaultNumberOfCards','')
		this.Output.put('DefaultCarBrandModel','')
		this.Output.put('DefaultCarSubModel','')
		this.Output.put('DefaultLoansRequestAmountMin','')
		this.Output.put('DefaultLoansRequestAmountMax','')
		this.Output.put('DefaultNumberOfInstalment','')
		this.Output.put('DefaultTransferRights','')
		this.Output.put('DefaultSortingBy','')
		this.Output.put('FilteredSaveQuoteId','')
		this.Output.put('FilteredNumberOfCards','')
		this.Output.put('FilteredCarBrandModel','')
		this.Output.put('FilteredCarSubModel','')
		this.Output.put('FilteredLoansRequestAmountMin','')
		this.Output.put('FilteredLoansRequestAmountMax','')
		this.Output.put('FilteredNumberOfInstalmentMax','')
		this.Output.put('FilteredNumberOfInstalmentMin','')
		this.Output.put('FilteredNumberOfInstalment','')
		this.Output.put('FilteredTransferRights','')
		this.Output.put('FilteredSortingBy','')
		this.Output.put('OutboundDisplayPlanId','')
		this.Output.put('OutboundBankName','')
		this.Output.put('OutboundPlanName','')
		this.Output.put('OutboundPlanLoanType','')
		this.Output.put('OutboundGuarantorRequired','')
		this.Output.put('OutboundCarInspectionRequired','')
		this.Output.put('OutboundCarInsuranceRequired','')
		this.Output.put('OutboundPromotionText','')
		this.Output.put('OutboundLoanAmount','')
		this.Output.put('OutboundMaxLoanAmount','')
		this.Output.put('OutboundLoanTerm','')
		this.Output.put('OutboundMonthlyInstalment','')
		this.Output.put('OutboundRatePerMonth','')
		this.Output.put('OutboundTotalInterest','')
		this.Output.put('OutboundTotalVat','')
		this.Output.put('OutboundTotalPayment','')
		this.Output.put('OutboundTotalFee','')
		this.Output.put('OutboundApprovalDateMessage','')
		this.Output.put('OutboundSelectedLoanAmount','')
		this.Output.put('OutboundSelectedMaxLoanAmount','')
		this.Output.put('OutboundSelectedLoanTerm','')
		this.Output.put('OutboundSelectedMonthlyInstalment','')
		this.Output.put('OutboundSelectedRatePerMonth','')
		this.Output.put('OutboundDetailGurantorRequired','')
		this.Output.put('OutboundDetailCarInspectionRequired','')
		this.Output.put('OutboundDetailCarInsuranceRequired','')
		this.Output.put('OutboundSelectedStampDutyFeePercent','')
		this.Output.put('OutboundSelectedStampDutyFee','')
		this.Output.put('OutboundSelectedCarInspectionFee','')
		this.Output.put('OutboundSelectedAdministrationFee','')
		this.Output.put('OutboundSelectedContractTransferFee','')
		this.Output.put('OutboundSelectedTotalVat','')
		this.Output.put('OutboundSelectedTotalFee','')
		this.Output.put('OutboundDetailQualificaiton','')
		this.Output.put('OutboundQualificationRequired','')
		this.Output.put('OutboundDetailDocumentRequire','')
		this.Output.put('OutboundDocumentRequired','')
		this.Output.put('OutboundDetailPromotionText','')
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
			caseInput.put('EmailToSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ApplyFilter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillLoansRequestAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PositiveCaseLoansRequestAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoansRequestAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillNumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PositiveCaseNumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('NumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillTransferRights',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('TransferRights',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillSortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundPrefixName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundFullName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundMobileNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundFillEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundCallBackTime',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundAcceptTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('EmailToSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ApplyFilter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillLoansRequestAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCaseLoansRequestAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoansRequestAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillNumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCaseNumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('NumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillTransferRights',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('TransferRights',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillSortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundPrefixName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundFullName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundMobileNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundFillEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCallBackTime',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundAcceptTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultSaveQuoteId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultNumberOfCards',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultCarBrandModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultCarSubModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultLoansRequestAmountMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultLoansRequestAmountMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultNumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultTransferRights',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultSortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredSaveQuoteId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredNumberOfCards',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredCarBrandModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredCarSubModel',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredLoansRequestAmountMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredLoansRequestAmountMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredNumberOfInstalmentMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredNumberOfInstalmentMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredNumberOfInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredTransferRights',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredSortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDisplayPlanId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundBankName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundPlanLoanType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundGuarantorRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCarInspectionRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCarInsuranceRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundPromotionText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundLoanAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundMaxLoanAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundLoanTerm',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundMonthlyInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundRatePerMonth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundTotalInterest',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundTotalVat',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundTotalPayment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundTotalFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundApprovalDateMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedLoanAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedMaxLoanAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedLoanTerm',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedMonthlyInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedRatePerMonth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDetailGurantorRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDetailCarInspectionRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDetailCarInsuranceRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedStampDutyFeePercent',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedStampDutyFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedCarInspectionFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedAdministrationFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedContractTransferFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedTotalVat',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSelectedTotalFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDetailQualificaiton',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundQualificationRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDetailDocumentRequire',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDocumentRequired',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundDetailPromotionText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}