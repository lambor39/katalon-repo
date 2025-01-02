package org.roojai.tha.types.roojaiapi2
public class THARoojaiAPI2GetPlanList_Output_B_Type{
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiAPI2.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME_TEMPLATE='GetPlanList_Output_B_00'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT='GetPlanList_Output_'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=0
	public static final Integer OUTPUT_EXCEL_COL_END=39
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public Map Output=[:]
	public THARoojaiAPI2GetPlanList_Output_B_Type(){
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
		this.Output.put('PlanName','')
		this.Output.put('PlanNameTh','')
		this.Output.put('PlanType','')
		this.Output.put('PricePerYear','')
		this.Output.put('CompulsoryPerYear','')
		this.Output.put('RoadsideAssistancePerYear','')
		this.Output.put('InstallmentPrice','')
		this.Output.put('MonthOfInstallment','')
		this.Output.put('ExcessAmount','')
		this.Output.put('CarCoverage','')
		this.Output.put('CarCoverageFireNTheftAmount','')
		this.Output.put('CarCoverageFloodAmount','')
		this.Output.put('CarCoverageVehicleSumInsuredAmount','')
		this.Output.put('FlagIsDashCam','')
		this.Output.put('FlagIsOnlinePayment','')
		this.Output.put('FlagIsPanelWorkshop','')
		this.Output.put('Liability','')
		this.Output.put('LiabilityDeathPerPersonCoverage','')
		this.Output.put('LiabilityMaxDeathCoverage','')
		this.Output.put('LiabilityPropertyCoverage','')
		this.Output.put('Other','')
		this.Output.put('OtherTh','')
		this.Output.put('PersonalCoverage','')
		this.Output.put('PersonalCoverageBailbondCoverage','')
		this.Output.put('PersonalCoverageDriverPlan','')
		this.Output.put('PersonalCoverageMedicalCoverage','')
		this.Output.put('PersonalCoveragePaCoverage','')
		this.Output.put('Promotion','')
		this.Output.put('PromotionBody','')
		this.Output.put('PromotionHeader','')
		this.Output.put('PromotionFlagIsMain','')
		this.Output.put('PromotionTh','')
		this.Output.put('PromotionThBody','')
		this.Output.put('PromotionThHeader','')
		this.Output.put('PromotionThFlagIsMain','')
		this.Output.put('RedirectUrl','')
		this.Output.put('SaveDataUrl','')
	}
}