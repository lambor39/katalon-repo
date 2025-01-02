package org.roojai.tha.types.roojaiapi2
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.json.JsonSlurper
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiAPI2GetPlanList_Output_A_Util{
	private Map lMapJson=[:]
	public String SuffixText=''
	public Boolean IsValidJson=false
	public Boolean IsObjectReady=false
	public THARoojaiAPI2GetPlanList_Output_A_Util(String suffixText,String newJSONText){
		super()
		this.setSuffixText(suffixText)
		this.initJsonSlurper(newJSONText)
	}
	private Map getlMapJson(){
		return this.lMapJson
	}
	private void setlMapJson(Map newlMapJson){
		//Do Nothing
		//this.lMapJson=newlMapJson
	}
	public String getSuffixText(){
		return this.SuffixText
	}
	public void setSuffixText(String suffixText){
		this.SuffixText=suffixText.trim()
	}
	public Boolean getIsValidJson(){
		return this.IsValidJson
	}
	public void setIsValidJson(Boolean IsValidJson){
		//Do Nothing
		//this.IsValidJson=IsValidJson
	}
	public Boolean getIsObjectReady(){
		return this.IsObjectReady
	}
	public void setIsObjectReady(Boolean isObjectReady){
		//Do Nothing
		//this.IsObjectReady=isObjectReady
	}
	public void initJsonSlurper(String newJSONText){
		try{
			Boolean lIsValidJson=false
			Boolean lIsObjectReady=false
			lIsValidJson=newJSONText.length()>0
			if(lIsValidJson){
				lIsValidJson=newJSONText.toUpperCase().contains('PLANLIST')
			}
			this.IsValidJson=lIsValidJson
			if(lIsValidJson){
				try{
					JsonSlurper lJsonSlurper=new JsonSlurper()
					this.lMapJson=lJsonSlurper.parseText(newJSONText)
					if(this.lMapJson){
						lIsObjectReady=this.lMapJson.containsKey('planList')
						this.IsObjectReady=lIsObjectReady
					}
				}catch(Exception ex){
					ex.printStackTrace()
				}
			}
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public Map outputListSave(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			Integer lNumberOfPlanListNum=0
			String lNumberOfPlanListStr=''
			lreturn.put('NumberOfPlanListNum',lNumberOfPlanListNum)
			lreturn.put('NumberOfPlanListStr',lNumberOfPlanListStr)
			lreturn.put('Result',lResult)
			lResult=!this.IsObjectReady
			if(lResult){
				lNumberOfPlanListStr=lNumberOfPlanListNum.toString()
				lResult=lNumberOfPlanListStr.length()>0
				lreturn.put('NumberOfPlanListNum',lNumberOfPlanListNum)
				lreturn.put('NumberOfPlanListStr',lNumberOfPlanListStr)
				lreturn.put('Result',lResult)
				return lreturn
			}
			THARoojaiAPI2GetPlanList_Output_A_Factory lOutputList=new THARoojaiAPI2GetPlanList_Output_A_Factory(this.SuffixText,GlobalVariable.CaseNumber)
			lNumberOfPlanListNum=this.lMapJson.planList.size()
			if(lNumberOfPlanListNum>0){
				Boolean lIsOK=false
				Integer lIndexOutput=0
				String lOutputText=''
				THARoojaiAPI2GetPlanList_Output_A_Type lOutputItem=new THARoojaiAPI2GetPlanList_Output_A_Type()
				for(lIndexOutput=0;lIndexOutput<lNumberOfPlanListNum;lIndexOutput++){
					lOutputItem.initOutput()
					lOutputText=this.lMapJson.planList[lIndexOutput].insurerID
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('InsurerId',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].partnerID
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PartnerId',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planID
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanId',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].model
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('Model',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planType
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanType',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planName
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanName',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planNameTH
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanNameTh',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planShortDescription
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanShortDescription',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planShortDescriptionTH
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanShortDescriptionTh',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planLongDescription
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanLongDescription',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].planLongDescriptionTH
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PlanLongDescriptionTh',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].pricePerYear
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PricePerYear',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].compulsoryPerYear
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('CompulsoryPerYear',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].excessAmount
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('ExcessAmount',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].installmentMessage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('InstallmentMessage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isBuynowAvailable
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsBuynowAvailable',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isCompulsoryAvailable
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsCompulsoryAvailable',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isInstallment
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsInstallment',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isOnlinePayment
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsOnlinePayment',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isPanelWorkshop
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsPanelWorkshop',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isPromotion
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsPromotion',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].isRoadside
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('FlagIsRoadside',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].carCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('CarCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].carCoverage.isFireNTheft
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('CarCoverageFlagIsFireNTheft',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].carCoverage.isFlood
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('CarCoverageFlagIsFlood',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].carCoverage.vehiclesumInsuredAmount
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('CarCoverageVehicleSumInsuredAmount',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].liability
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('Liability',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].liability.deathPerPersonCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('LiabilityDeathPerPersonCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].liability.maxDeathCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('LiabilityMaxDeathCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].liability.propertyCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('LiabilityPropertyCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].personalCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PersonalCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].personalCoverage.bailBondCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PersonalCoverageBailbondCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].personalCoverage.driverPlan
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PersonalCoverageDriverPlan',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].personalCoverage.medicalCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PersonalCoverageMedicalCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].personalCoverage.paCoverage
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('PersonalCoveragePaCoverage',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].buynowURL
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('BuyNowUrl',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].callBackURL
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('CallBackUrl',lOutputText)
					lOutputText=this.lMapJson.planList[lIndexOutput].seatCapacity
					if(!lOutputText){
						lOutputText=''
					}
					lOutputItem.Output.put('SeatCapacity',lOutputText)
					lIsOK=lOutputList.addMapItemToOutputList(lOutputItem.Output)
					if(!lIsOK){
						break
					}
				}
			}
			lNumberOfPlanListStr=lNumberOfPlanListNum.toString()
			lResult=lOutputList.saveOutputList()
			if(lResult){
				lreturn.put('NumberOfPlanListNum',lNumberOfPlanListNum)
				lreturn.put('NumberOfPlanListStr',lNumberOfPlanListStr)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}