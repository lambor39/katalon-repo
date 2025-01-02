package org.roojai.tha.types.roojaiapi2
public class THARoojaiAPI2GetPlanList_Output_A_Type{
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiAPI2.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME_TEMPLATE='GetPlanList_Output_A_00'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT='GetPlanList_Output_'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=0
	public static final Integer OUTPUT_EXCEL_COL_END=37
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public Map Output=[:]
	public THARoojaiAPI2GetPlanList_Output_A_Type(){
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
		this.Output.put('InsurerId','')
		this.Output.put('PartnerId','')
		this.Output.put('PlanId','')
		this.Output.put('Model','')
		this.Output.put('PlanType','')
		this.Output.put('PlanName','')
		this.Output.put('PlanNameTh','')
		this.Output.put('PlanShortDescription','')
		this.Output.put('PlanShortDescriptionTh','')
		this.Output.put('PlanLongDescription','')
		this.Output.put('PlanLongDescriptionTh','')
		this.Output.put('PricePerYear','')
		this.Output.put('CompulsoryPerYear','')
		this.Output.put('ExcessAmount','')
		this.Output.put('InstallmentMessage','')
		this.Output.put('FlagIsBuynowAvailable','')
		this.Output.put('FlagIsCompulsoryAvailable','')
		this.Output.put('FlagIsInstallment','')
		this.Output.put('FlagIsOnlinePayment','')
		this.Output.put('FlagIsPanelWorkshop','')
		this.Output.put('FlagIsPromotion','')
		this.Output.put('FlagIsRoadside','')
		this.Output.put('CarCoverage','')
		this.Output.put('CarCoverageFlagIsFireNTheft','')
		this.Output.put('CarCoverageFlagIsFlood','')
		this.Output.put('CarCoverageVehicleSumInsuredAmount','')
		this.Output.put('Liability','')
		this.Output.put('LiabilityDeathPerPersonCoverage','')
		this.Output.put('LiabilityMaxDeathCoverage','')
		this.Output.put('LiabilityPropertyCoverage','')
		this.Output.put('PersonalCoverage','')
		this.Output.put('PersonalCoverageBailbondCoverage','')
		this.Output.put('PersonalCoverageDriverPlan','')
		this.Output.put('PersonalCoverageMedicalCoverage','')
		this.Output.put('PersonalCoveragePaCoverage','')
		this.Output.put('BuyNowUrl','')
		this.Output.put('CallBackUrl','')
		this.Output.put('SeatCapacity','')
	}
}