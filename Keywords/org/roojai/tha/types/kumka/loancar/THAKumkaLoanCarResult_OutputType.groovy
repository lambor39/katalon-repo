package org.roojai.tha.types.kumka.loancar
public class THAKumkaLoanCarResult_OutputType{
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_LoanCar_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME_TEMPLATE='LoanCar_Result_Output_00'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT='LoanCar_Result_Output_Def_'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED='LoanCar_Result_Output_Fil_'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=0
	public static final Integer OUTPUT_EXCEL_COL_END=38
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public Map Output=[:]
	public THAKumkaLoanCarResult_OutputType(){
		super()
		this.initOutput()
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
	public void initOutput(){
		this.Output.clear()
		this.Output.put('DisplayPlanId','')
		this.Output.put('ItemDisabled','')
		this.Output.put('BankName','')
		this.Output.put('PlanName','')
		this.Output.put('PlanLoanType','')
		this.Output.put('GuarantorRequired','')
		this.Output.put('CarInspectionRequired','')
		this.Output.put('CarInsuranceRequired','')
		this.Output.put('PromotionText','')
		this.Output.put('LoanAmount','')
		this.Output.put('MaxLoanAmount','')
		this.Output.put('LoanTerm','')
		this.Output.put('MonthlyInstalment','')
		this.Output.put('RatePerMonth','')
		this.Output.put('TotalInterest','')
		this.Output.put('TotalVat','')
		this.Output.put('TotalPayment','')
		this.Output.put('TotalFee','')
		this.Output.put('ApprovalDateMessage','')
		this.Output.put('SelectedLoanAmount','')
		this.Output.put('SelectedMaxLoanAmount','')
		this.Output.put('SelectedLoanTerm','')
		this.Output.put('SelectedMonthlyInstalment','')
		this.Output.put('SelectedRatePerMonth','')
		this.Output.put('DetailGurantorRequired','')
		this.Output.put('DetailCarInspectionRequired','')
		this.Output.put('DetailCarInsuranceRequired','')
		this.Output.put('SelectedStampDutyFeePercent','')
		this.Output.put('SelectedStampDutyFee','')
		this.Output.put('SelectedCarInspectionFee','')
		this.Output.put('SelectedAdministrationFee','')
		this.Output.put('SelectedContractTransferFee','')
		this.Output.put('SelectedTotalVat','')
		this.Output.put('SelectedTotalFee','')
		this.Output.put('DetailQualificaiton','')
		this.Output.put('QualificationRequired','')
		this.Output.put('DetailDocumentRequire','')
		this.Output.put('DocumentRequired','')
		this.Output.put('DetailPromotionText','')
	}
}