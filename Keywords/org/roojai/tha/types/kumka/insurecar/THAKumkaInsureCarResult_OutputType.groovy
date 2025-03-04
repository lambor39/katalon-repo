package org.roojai.tha.types.kumka.insurecar
public class THAKumkaInsureCarResult_OutputType{
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_InsureCar_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME_TEMPLATE='InsureCar_Result_Output_00'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT='InsureCar_Result_Output_Def_'
	public static final String OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED='InsureCar_Result_Output_Fil_'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=0
	public static final Integer OUTPUT_EXCEL_COL_END=103
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public Map Output=[:]
	public THAKumkaInsureCarResult_OutputType(){
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
		this.Output.put('DesignACardDisplayPlanId','')
		this.Output.put('DesignACardDisplayPlanType','')
		this.Output.put('DesignACardOpenScore','')
		this.Output.put('DesignAModalScorePartnernameScore','')
		this.Output.put('DesignAModalScorePartnerName','')
		this.Output.put('DesignAModalScoreSuminsured','')
		this.Output.put('DesignAModalScoreSuminsuredScore','')
		this.Output.put('DesignAModalScoreExcess','')
		this.Output.put('DesignAModalScoreExcessScore','')
		this.Output.put('DesignAModalScoreGarage','')
		this.Output.put('DesignAModalScoreGarageScore','')
		this.Output.put('DesignAModalScoreDriver','')
		this.Output.put('DesignAModalScoreDriverScore','')
		this.Output.put('DesignAModalScoreProperty','')
		this.Output.put('DesignAModalScorePropertyScore','')
		this.Output.put('DesignACardPromotionText','')
		this.Output.put('DesignACardInsurerName','')
		this.Output.put('DesignACardPartnerName','')
		this.Output.put('DesignACardPlanName','')
		this.Output.put('DesignACardPrice','')
		this.Output.put('DesignACardBasicPremium','')
		this.Output.put('DesignACardDiscountAmount','')
		this.Output.put('DesignACardExcess','')
		this.Output.put('DesignACardSumInsure','')
		this.Output.put('DesignACardProperty','')
		this.Output.put('DesignACardIsRoadside','')
		this.Output.put('DesignACardIsOnlinePayment','')
		this.Output.put('DesignACardIsCompulsoryAvailable','')
		this.Output.put('DesignACardIsFlood','')
		this.Output.put('DesignACardGarage','')
		this.Output.put('DesignACardDriver','')
		this.Output.put('DesignACardInstalmentPrice','')
		this.Output.put('DesignAOutboundButtonName','')
		this.Output.put('DesignAModalDetailInsurerName','')
		this.Output.put('DesignAModalDetailPartnerName','')
		this.Output.put('DesignAModalDetailPrice','')
		this.Output.put('DesignAModalDetailBasicPremium','')
		this.Output.put('DesignAModalDetailDiscountAmount','')
		this.Output.put('DesignAModalDetailSuminsure','')
		this.Output.put('DesignAModalDetailScore','')
		this.Output.put('DesignAModalDetailPromotion','')
		this.Output.put('DesignAModalDetailExcess','')
		this.Output.put('DesignAModalDetailGarage','')
		this.Output.put('DesignAModalDetailDriver','')
		this.Output.put('DesignAModalDetailFire','')
		this.Output.put('DesignAModalDetailFlood','')
		this.Output.put('DesignAModalDetailPersonal','')
		this.Output.put('DesignAModalDetailMedical','')
		this.Output.put('DesignAModalDetailBail','')
		this.Output.put('DesignAModalDetailProperty','')
		this.Output.put('DesignAModalDetailDeath','')
		this.Output.put('DesignAModalDetailMaxDeath','')
		this.Output.put('DesignBCardDisplayPlanId','')
		this.Output.put('DesignBCardDisplayPlanType','')
		this.Output.put('DesignBCardOpenScore','')
		this.Output.put('DesignBModalScorePartnernameScore','')
		this.Output.put('DesignBModalScorePartnerName','')
		this.Output.put('DesignBModalScoreSuminsured','')
		this.Output.put('DesignBModalScoreSuminsuredScore','')
		this.Output.put('DesignBModalScoreExcess','')
		this.Output.put('DesignBModalScoreExcessScore','')
		this.Output.put('DesignBModalScoreGarage','')
		this.Output.put('DesignBModalScoreGarageScore','')
		this.Output.put('DesignBModalScoreDriver','')
		this.Output.put('DesignBModalScoreDriverScore','')
		this.Output.put('DesignBModalScoreProperty','')
		this.Output.put('DesignBModalScorePropertyScore','')
		this.Output.put('DesignBCardPromotionText','')
		this.Output.put('DesignBCardInsurerName','')
		this.Output.put('DesignBCardPartnerName','')
		this.Output.put('DesignBCardPlanName','')
		this.Output.put('DesignBCardPrice','')
		this.Output.put('DesignBCardBasicPremium','')
		this.Output.put('DesignBCardDiscountAmount','')
		this.Output.put('DesignBCardExcess','')
		this.Output.put('DesignBCardSumInsure','')
		this.Output.put('DesignBCardProperty','')
		this.Output.put('DesignBCardIsRoadside','')
		this.Output.put('DesignBCardIsOnlinePayment','')
		this.Output.put('DesignBCardIsCompulsoryAvailable','')
		this.Output.put('DesignBCardIsFlood','')
		this.Output.put('DesignBCardGarage','')
		this.Output.put('DesignBCardDriver','')
		this.Output.put('DesignBCardInstalmentPrice','')
		this.Output.put('DesignBOutboundButtonName','')
		this.Output.put('DesignBModalDetailInsurerName','')
		this.Output.put('DesignBModalDetailPartnerName','')
		this.Output.put('DesignBModalDetailPrice','')
		this.Output.put('DesignBModalDetailBasicPremium','')
		this.Output.put('DesignBModalDetailDiscountAmount','')
		this.Output.put('DesignBModalDetailSuminsure','')
		this.Output.put('DesignBModalDetailScore','')
		this.Output.put('DesignBModalDetailPromotion','')
		this.Output.put('DesignBModalDetailExcess','')
		this.Output.put('DesignBModalDetailGarage','')
		this.Output.put('DesignBModalDetailDriver','')
		this.Output.put('DesignBModalDetailFire','')
		this.Output.put('DesignBModalDetailFlood','')
		this.Output.put('DesignBModalDetailPersonal','')
		this.Output.put('DesignBModalDetailMedical','')
		this.Output.put('DesignBModalDetailBail','')
		this.Output.put('DesignBModalDetailProperty','')
		this.Output.put('DesignBModalDetailDeath','')
		this.Output.put('DesignBModalDetailMaxDeath','')
	}
}