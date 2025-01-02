package org.roojai.tha.types.kumka.cancer
public class THAKumkaCancerResult_OutputType{
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_Cancer_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME_TEMPLATE='Cancer_Result_Output_00'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT='Cancer_Result_Output_Def_'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED='Cancer_Result_Output_Fil_'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=0
	public static final Integer OUTPUT_EXCEL_COL_END=28
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public Map Output=[:]
	public THAKumkaCancerResult_OutputType(){
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
		this.Output.put('CardDisplayPlanId','')
		this.Output.put('CardPlanType','')
		this.Output.put('CardPlanPartnerName','')
		this.Output.put('CardPlanName','')
		this.Output.put('CardPlanCoverage','')
		this.Output.put('CardPlanPaymentOptionAmount','')
		this.Output.put('CardPlanPaymentInstalment','')
		this.Output.put('CardModalPaymentInstalment','')
		this.Output.put('CardPlanTaxDeduct','')
		this.Output.put('CardPlanChemoTherapy','')
		this.Output.put('CardPlanHospitalCash','')
		this.Output.put('CardPlanBenefitsPa','')
		this.Output.put('CardPlanRenew','')
		this.Output.put('CardPlanActive','')
		this.Output.put('CardPlanWait','')
		this.Output.put('CardPromoText','')
		this.Output.put('OutboundButtonName','')
		this.Output.put('CardDetailPartnerName','')
		this.Output.put('CardDetailPlanName','')
		this.Output.put('CardDetailIsLumpsumAllInvasiveCancer','')
		this.Output.put('CardDetailIsLumpsumNonInvasiveCancer','')
		this.Output.put('CardDetailIsLumpsumAddInvasiveCancer','')
		this.Output.put('CardDetailIsAddBenefitsSkinCancer','')
		this.Output.put('CardDetailIsAddBenefitsFuneralFee','')
		this.Output.put('CardDetailIsAddBenefitsSecondExamFee','')
		this.Output.put('CardDetailIsCoverOpd','')
		this.Output.put('CardDetailIsAddBenefitsForGender','')
		this.Output.put('CardDetailIsOtherCovid','')
		this.Output.put('CardDetailTermAndCondition','')
	}
}