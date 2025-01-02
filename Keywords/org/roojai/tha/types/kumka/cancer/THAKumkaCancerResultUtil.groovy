package org.roojai.tha.types.kumka.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaCancerResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private String saveQuoteId=''
	private String opportunityNumber=''
	public THAKumkaCancerResultUtil(WebDriver newDriver,WebDriver newSelenium){
		super()
		this.driver=newDriver
		this.selenium=newSelenium
	}
	private WebDriver getDriver(){
		return this.driver
	}
	private void setDriver(WebDriver newDriver){
		//Do Nothing
		//this.driver=newDriver
	}
	private WebDriver getSelenium(){
		return this.selenium
	}
	private void setSelenium(WebDriver newSelenium){
		//Do Nothing
		//this.selenium=newSelenium
	}
	public Boolean inputCase(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeOption=caseInput.MaximizeOption.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lEmailToSave=caseInput.EmailToSave.toString().trim()
		String lApplyFilter=caseInput.ApplyFilter.toString().trim()
		String lFillPlanCustomChemoTherapy=caseInput.FillPlanCustomChemoTherapy.toString().trim()
		String lPlanCustomChemoTherapy=caseInput.PlanCustomChemoTherapy.toString().trim()
		String lFillPlanCustomHospitalCash=caseInput.FillPlanCustomHospitalCash.toString().trim()
		String lPlanCustomHospitalCash=caseInput.PlanCustomHospitalCash.toString().trim()
		String lFillPlanCustomBenefitsPa=caseInput.FillPlanCustomBenefitsPa.toString().trim()
		String lPlanCustomBenefitsPa=caseInput.PlanCustomBenefitsPa.toString().trim()
		String lFillPlanCustomPurchaseWithLifeinsure=caseInput.FillPlanCustomPurchaseWithLifeinsure.toString().trim()
		String lPlanCustomPurchaseWithLifeinsure=caseInput.PlanCustomPurchaseWithLifeinsure.toString().trim()
		String lFillSortingBy=caseInput.FillSortingBy.toString().trim()
		String lFillSortingPremiumMinMax=caseInput.FillSortingPremiumMinMax.toString().trim()
		String lSortingPremiumMin=caseInput.SortingPremiumMin.toString().trim()
		String lSortingPremiumMax=caseInput.SortingPremiumMax.toString().trim()
		String lFillSortingSumInsuredMinMax=caseInput.FillSortingSumInsuredMinMax.toString().trim()
		String lSortingSumInsuredMin=caseInput.SortingSumInsuredMin.toString().trim()
		String lSortingSumInsuredMax=caseInput.SortingSumInsuredMax.toString().trim()
		String lFillInsuranceCompany=caseInput.FillInsuranceCompany.toString().trim()
		String lFillInsuranceCompanyA=caseInput.FillInsuranceCompanyA.toString().trim()
		String lInsuranceCompanyA=caseInput.InsuranceCompanyA.toString().trim()
		String lFillInsuranceCompanyB=caseInput.FillInsuranceCompanyB.toString().trim()
		String lInsuranceCompanyB=caseInput.InsuranceCompanyB.toString().trim()
		String lOutboundSave=caseInput.OutboundSave.toString().trim()
		String lOutboundPrefixName=caseInput.OutboundPrefixName.toString().trim()
		String lOutboundName=caseInput.OutboundName.toString().trim()
		String lOutboundSurname=caseInput.OutboundSurname.toString().trim()
		String lOutboundMobileNumber=caseInput.OutboundMobileNumber.toString().trim()
		String lOutboundFillEmailAddress=caseInput.OutboundFillEmailAddress.toString().trim()
		String lOutboundEmailAddress=caseInput.OutboundEmailAddress.toString().trim()
		String lOutboundCallBackTime=caseInput.OutboundCallBackTime.toString().trim()
		String lOutboundAcceptTermAndCondition=caseInput.OutboundAcceptTermAndCondition.toString().trim()
		String lCallMeBack=caseInput.CallMeBack.toString().trim()
		String lCallMeBackPhoneNo=caseInput.CallMeBackPhoneNo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lDefaultPlanPersonInfo=''
		String lDefaultSaveQuoteId=''
		String lDefaultNumberOfCards=''
		String lDefaultSortingPremiumMinMax=''
		String lDefaultSortingSumInsuredMinMax=''
		String lDefaultInsuranceCompany=''
		String lDefaultPlanCustomChemoTherapy=''
		String lDefaultPlanCustomHospitalCash=''
		String lDefaultPlanCustomBenefitsPa=''
		String lDefaultPlanCustomPurchaseWithLifeinsure=''
		String lFilteredSaveQuoteId=''
		String lFilteredNumberOfCards=''
		String lFilteredSortingPremiumMinMax=''
		String lFilteredSortingSumInsuredMinMax=''
		String lFilteredInsuranceCompany=''
		String lFilteredPlanCustomChemoTherapy=''
		String lFilteredPlanCustomHospitalCash=''
		String lFilteredPlanCustomBenefitsPa=''
		String lFilteredPlanCustomPurchaseWithLifeinsure=''
		String lOutboundCpcFormMoreCardDisplayPlanId=''
		String lOutboundCpcFormMoreCardPlanType=''
		String lOutboundCpcFormMoreCardPlanPartnerName=''
		String lOutboundCpcFormMoreCardPlanName=''
		String lOutboundCpcFormMoreCardPlanCoverage=''
		String lOutboundCpcFormMoreCardPlanPaymentOptionAmount=''
		String lOutboundCpcFormMoreCardPlanPaymentInstalment=''
		String lOutboundCpcFormMoreCardModalPaymentInstalment=''
		String lOutboundCpcFormMoreCardPlanTaxDeduct=''
		String lOutboundCpcFormMoreCardPlanChemoTherapy=''
		String lOutboundCpcFormMoreCardPlanHospitalCash=''
		String lOutboundCpcFormMoreCardPlanBenefitsPa=''
		String lOutboundCpcFormMoreCardPlanRenew=''
		String lOutboundCpcFormMoreCardPlanActive=''
		String lOutboundCpcFormMoreCardPlanWait=''
		String lOutboundCpcFormMoreCardPromoText=''
		String lOutboundCpcFormMoreOutboundButtonName=''
		String lOutboundCpcFormMoreCardDetailPartnerName=''
		String lOutboundCpcFormMoreCardDetailPlanName=''
		String lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCpcFormMoreCardDetailIsCoverOpd=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender=''
		String lOutboundCpcFormMoreCardDetailIsOtherCovid=''
		String lOutboundCpcFormMoreCardDetailTermAndCondition=''
		String lOutboundCpcFormMorePlanResultText=''
		String lOutboundCpcCardDisplayPlanId=''
		String lOutboundCpcCardPlanType=''
		String lOutboundCpcCardPlanPartnerName=''
		String lOutboundCpcCardPlanName=''
		String lOutboundCpcCardPlanCoverage=''
		String lOutboundCpcCardPlanPaymentOptionAmount=''
		String lOutboundCpcCardPlanPaymentInstalment=''
		String lOutboundCpcCardModalPaymentInstalment=''
		String lOutboundCpcCardPlanTaxDeduct=''
		String lOutboundCpcCardPlanChemoTherapy=''
		String lOutboundCpcCardPlanHospitalCash=''
		String lOutboundCpcCardPlanBenefitsPa=''
		String lOutboundCpcCardPlanRenew=''
		String lOutboundCpcCardPlanActive=''
		String lOutboundCpcCardPlanWait=''
		String lOutboundCpcCardPromoText=''
		String lOutboundCpcOutboundButtonName=''
		String lOutboundCpcCardDetailPartnerName=''
		String lOutboundCpcCardDetailPlanName=''
		String lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCpcCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCpcCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCpcCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCpcCardDetailIsCoverOpd=''
		String lOutboundCpcCardDetailIsAddBenefitsForGender=''
		String lOutboundCpcCardDetailIsOtherCovid=''
		String lOutboundCpcCardDetailTermAndCondition=''
		String lOutboundCpcOutboundPlanResultText=''
		String lOutboundCplFormMoreCardDisplayPlanId=''
		String lOutboundCplFormMoreCardPlanType=''
		String lOutboundCplFormMoreCardPlanPartnerName=''
		String lOutboundCplFormMoreCardPlanName=''
		String lOutboundCplFormMoreCardPlanCoverage=''
		String lOutboundCplFormMoreCardPlanPaymentOptionAmount=''
		String lOutboundCplFormMoreCardPlanPaymentInstalment=''
		String lOutboundCplFormMoreCardModalPaymentInstalment=''
		String lOutboundCplFormMoreCardPlanTaxDeduct=''
		String lOutboundCplFormMoreCardPlanChemoTherapy=''
		String lOutboundCplFormMoreCardPlanHospitalCash=''
		String lOutboundCplFormMoreCardPlanBenefitsPa=''
		String lOutboundCplFormMoreCardPlanRenew=''
		String lOutboundCplFormMoreCardPlanActive=''
		String lOutboundCplFormMoreCardPlanWait=''
		String lOutboundCplFormMoreCardPromoText=''
		String lOutboundCplFormMoreOutboundButtonName=''
		String lOutboundCplFormMoreCardDetailPartnerName=''
		String lOutboundCplFormMoreCardDetailPlanName=''
		String lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCplFormMoreCardDetailIsCoverOpd=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsForGender=''
		String lOutboundCplFormMoreCardDetailIsOtherCovid=''
		String lOutboundCplFormMoreCardDetailTermAndCondition=''
		String lOutboundCplPopupFormCardDisplayPlanId=''
		String lOutboundCplPopupFormCardPlanType=''
		String lOutboundCplPopupFormCardPlanPartnerName=''
		String lOutboundCplPopupFormCardPlanName=''
		String lOutboundCplPopupFormCardPlanCoverage=''
		String lOutboundCplPopupFormCardPlanPaymentOptionAmount=''
		String lOutboundCplPopupFormCardPlanPaymentInstalment=''
		String lOutboundCplPopupFormCardModalPaymentInstalment=''
		String lOutboundCplPopupFormCardPlanTaxDeduct=''
		String lOutboundCplPopupFormCardPlanChemoTherapy=''
		String lOutboundCplPopupFormCardPlanHospitalCash=''
		String lOutboundCplPopupFormCardPlanBenefitsPa=''
		String lOutboundCplPopupFormCardPlanRenew=''
		String lOutboundCplPopupFormCardPlanActive=''
		String lOutboundCplPopupFormCardPlanWait=''
		String lOutboundCplPopupFormCardPromoText=''
		String lOutboundCplPopupFormOutboundButtonName=''
		String lOutboundCplPopupFormCardDetailPartnerName=''
		String lOutboundCplPopupFormCardDetailPlanName=''
		String lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCplPopupFormCardDetailIsCoverOpd=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsForGender=''
		String lOutboundCplPopupFormCardDetailIsOtherCovid=''
		String lOutboundCplPopupFormCardDetailTermAndCondition=''
		try{
			Map lMapPositiveCase=this.inputPositiveCase(lPositiveCase)
			if(!lMapPositiveCase.Result){
				lPositiveCase=''
			}else{
				lPositiveCase=lMapPositiveCase.PositiveCase
			}
			caseOutput.PositiveCase=lPositiveCase
			if(lPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			if(!this.waitUntilLoaded()){
				if(!this.waitUntilLoaded()){
					return lreturn
				}
			}
			Map lMapLanguage=this.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			caseOutput.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
			}
			String lStrEmailEN='.en@'
			String lStrEmailTH='.th@'
			if(lLanguage.equalsIgnoreCase('EN')){
				lEmailToSave=lEmailToSave.toLowerCase().replaceAll(lStrEmailTH,lStrEmailEN)
				lOutboundEmailAddress=lOutboundEmailAddress.toLowerCase().replaceAll(lStrEmailTH,lStrEmailEN)
			}else{
				lEmailToSave=lEmailToSave.toLowerCase().replaceAll(lStrEmailEN,lStrEmailTH)
				lOutboundEmailAddress=lOutboundEmailAddress.toLowerCase().replaceAll(lStrEmailEN,lStrEmailTH)
			}
			Map lMapEmailToSave=this.inputEmailToSave(lEmailToSave,true)
			if(!lMapEmailToSave.Result){
				lEmailToSave=''
				lDefaultSaveQuoteId=''
			}else{
				lEmailToSave=lMapEmailToSave.EmailToSave
				lDefaultSaveQuoteId=lMapEmailToSave.SaveQuoteId
			}
			caseOutput.EmailToSave=lEmailToSave
			caseOutput.DefaultSaveQuoteId=lDefaultSaveQuoteId
			if(lEmailToSave.length()<=0){
				return lreturn
			}
			Map lMapOutputOfDefault=this.inputOutputOfDefault()
			if(!lMapOutputOfDefault.Result){
				lDefaultPlanPersonInfo=''
				lDefaultNumberOfCards=''
				lDefaultSortingPremiumMinMax=''
				lDefaultSortingSumInsuredMinMax=''
				lDefaultInsuranceCompany=''
				lDefaultPlanCustomChemoTherapy=''
				lDefaultPlanCustomHospitalCash=''
				lDefaultPlanCustomBenefitsPa=''
				lDefaultPlanCustomPurchaseWithLifeinsure=''
			}else{
				lDefaultPlanPersonInfo=lMapOutputOfDefault.DefaultPlanPersonInfo
				lDefaultNumberOfCards=lMapOutputOfDefault.DefaultNumberOfCards
				lDefaultSortingPremiumMinMax=lMapOutputOfDefault.DefaultSortingPremiumMinMax
				lDefaultSortingSumInsuredMinMax=lMapOutputOfDefault.DefaultSortingSumInsuredMinMax
				lDefaultInsuranceCompany=lMapOutputOfDefault.DefaultInsuranceCompany
				lDefaultPlanCustomChemoTherapy=lMapOutputOfDefault.DefaultPlanCustomChemoTherapy
				lDefaultPlanCustomHospitalCash=lMapOutputOfDefault.DefaultPlanCustomHospitalCash
				lDefaultPlanCustomBenefitsPa=lMapOutputOfDefault.DefaultPlanCustomBenefitsPa
				lDefaultPlanCustomPurchaseWithLifeinsure=lMapOutputOfDefault.DefaultPlanCustomPurchaseWithLifeinsure
			}
			caseOutput.DefaultPlanPersonInfo=lDefaultPlanPersonInfo
			caseOutput.DefaultNumberOfCards=lDefaultNumberOfCards
			caseOutput.DefaultSortingPremiumMinMax=lDefaultSortingPremiumMinMax
			caseOutput.DefaultSortingSumInsuredMinMax=lDefaultSortingSumInsuredMinMax
			caseOutput.DefaultInsuranceCompany=lDefaultInsuranceCompany
			caseOutput.DefaultPlanCustomChemoTherapy=lDefaultPlanCustomChemoTherapy
			caseOutput.DefaultPlanCustomHospitalCash=lDefaultPlanCustomHospitalCash
			caseOutput.DefaultPlanCustomBenefitsPa=lDefaultPlanCustomBenefitsPa
			caseOutput.DefaultPlanCustomPurchaseWithLifeinsure=lDefaultPlanCustomPurchaseWithLifeinsure
			if(!lMapOutputOfDefault.Result){
				return lreturn
			}
			Map lMapApplyFilter=this.inputApplyFilter(lApplyFilter)
			if(!lMapApplyFilter.Result){
				lApplyFilter=''
			}else{
				lApplyFilter=lMapApplyFilter.ApplyFilter
			}
			caseOutput.ApplyFilter=lApplyFilter
			if(lApplyFilter.length()<=0){
				return lreturn
			}
			Boolean lIsApplyFilter=IGNUemaHelper.convertStringToBoolean(lApplyFilter)
			if(lIsApplyFilter){
				Map lMapFillPlanCustomChemoTherapy=this.inputFillPlanCustomChemoTherapy(lFillPlanCustomChemoTherapy)
				if(!lMapFillPlanCustomChemoTherapy.Result){
					lFillPlanCustomChemoTherapy=''
				}else{
					lFillPlanCustomChemoTherapy=lMapFillPlanCustomChemoTherapy.FillPlanCustomChemoTherapy
				}
				caseOutput.FillPlanCustomChemoTherapy=lFillPlanCustomChemoTherapy
				if(lFillPlanCustomChemoTherapy.length()<=0){
					return lreturn
				}
				Boolean lIsFillPlanCustomChemoTherapy=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomChemoTherapy)
				if(lIsFillPlanCustomChemoTherapy){
					Map lMapPlanCustomChemoTherapy=this.inputPlanCustomChemoTherapy(lPlanCustomChemoTherapy)
					if(!lMapPlanCustomChemoTherapy.Result){
						lPlanCustomChemoTherapy=''
					}else{
						lPlanCustomChemoTherapy=lMapPlanCustomChemoTherapy.PlanCustomChemoTherapy
					}
					caseOutput.PlanCustomChemoTherapy=lPlanCustomChemoTherapy
					if(lPlanCustomChemoTherapy.length()<=0){
						return lreturn
					}
				}
				Map lMapFillPlanCustomHospitalCash=this.inputFillPlanCustomHospitalCash(lFillPlanCustomHospitalCash)
				if(!lMapFillPlanCustomHospitalCash.Result){
					lFillPlanCustomHospitalCash=''
				}else{
					lFillPlanCustomHospitalCash=lMapFillPlanCustomHospitalCash.FillPlanCustomHospitalCash
				}
				caseOutput.FillPlanCustomHospitalCash=lFillPlanCustomHospitalCash
				if(lFillPlanCustomHospitalCash.length()<=0){
					return lreturn
				}
				Boolean lIsFillPlanCustomHospitalCash=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomHospitalCash)
				if(lIsFillPlanCustomHospitalCash){
					Map lMapPlanCustomHospitalCash=this.inputPlanCustomHospitalCash(lPlanCustomHospitalCash)
					if(!lMapPlanCustomHospitalCash.Result){
						lPlanCustomHospitalCash=''
					}else{
						lPlanCustomHospitalCash=lMapPlanCustomHospitalCash.PlanCustomHospitalCash
					}
					caseOutput.PlanCustomHospitalCash=lPlanCustomHospitalCash
					if(lPlanCustomHospitalCash.length()<=0){
						return lreturn
					}
				}
				Map lMapFillPlanCustomBenefitsPa=this.inputFillPlanCustomBenefitsPa(lFillPlanCustomBenefitsPa)
				if(!lMapFillPlanCustomBenefitsPa.Result){
					lFillPlanCustomBenefitsPa=''
				}else{
					lFillPlanCustomBenefitsPa=lMapFillPlanCustomBenefitsPa.FillPlanCustomBenefitsPa
				}
				caseOutput.FillPlanCustomBenefitsPa=lFillPlanCustomBenefitsPa
				if(lFillPlanCustomBenefitsPa.length()<=0){
					return lreturn
				}
				Boolean lIsFillPlanCustomBenefitsPa=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomBenefitsPa)
				if(lIsFillPlanCustomBenefitsPa){
					Map lMapPlanCustomBenefitsPa=this.inputPlanCustomBenefitsPa(lPlanCustomBenefitsPa)
					if(!lMapPlanCustomBenefitsPa.Result){
						lPlanCustomBenefitsPa=''
					}else{
						lPlanCustomBenefitsPa=lMapPlanCustomBenefitsPa.PlanCustomBenefitsPa
					}
					caseOutput.PlanCustomBenefitsPa=lPlanCustomBenefitsPa
					if(lPlanCustomBenefitsPa.length()<=0){
						return lreturn
					}
				}
				Map lMapFillPlanCustomPurchaseWithLifeinsure=this.inputFillPlanCustomPurchaseWithLifeinsure(lFillPlanCustomPurchaseWithLifeinsure)
				if(!lMapFillPlanCustomPurchaseWithLifeinsure.Result){
					lFillPlanCustomPurchaseWithLifeinsure=''
				}else{
					lFillPlanCustomPurchaseWithLifeinsure=lMapFillPlanCustomPurchaseWithLifeinsure.FillPlanCustomPurchaseWithLifeinsure
				}
				caseOutput.FillPlanCustomPurchaseWithLifeinsure=lFillPlanCustomPurchaseWithLifeinsure
				if(lFillPlanCustomPurchaseWithLifeinsure.length()<=0){
					return lreturn
				}
				Boolean lIsFillPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomPurchaseWithLifeinsure)
				if(lIsFillPlanCustomPurchaseWithLifeinsure){
					Map lMapPlanCustomPurchaseWithLifeinsure=this.inputPlanCustomPurchaseWithLifeinsure(lPlanCustomPurchaseWithLifeinsure)
					if(!lMapPlanCustomPurchaseWithLifeinsure.Result){
						lPlanCustomPurchaseWithLifeinsure=''
					}else{
						lPlanCustomPurchaseWithLifeinsure=lMapPlanCustomPurchaseWithLifeinsure.PlanCustomPurchaseWithLifeinsure
					}
					caseOutput.PlanCustomPurchaseWithLifeinsure=lPlanCustomPurchaseWithLifeinsure
					if(lPlanCustomPurchaseWithLifeinsure.length()<=0){
						return lreturn
					}
				}
				Map lMapFillSortingBy=this.inputFillSortingBy(lFillSortingBy)
				if(!lMapFillSortingBy.Result){
					lFillSortingBy=''
				}else{
					lFillSortingBy=lMapFillSortingBy.FillSortingBy
				}
				caseOutput.FillSortingBy=lFillSortingBy
				if(lFillSortingBy.length()<=0){
					return lreturn
				}
				Boolean lIsFillSortingBy=IGNUemaHelper.convertStringToBoolean(lFillSortingBy)
				if(lIsFillSortingBy){
					Map lMapFillSortingPremiumMinMax=this.inputFillSortingPremiumMinMax(lFillSortingPremiumMinMax,lSortingPremiumMin,lSortingPremiumMax)
					if(!lMapFillSortingPremiumMinMax.Result){
						lFillSortingPremiumMinMax=''
						lSortingPremiumMin=''
						lSortingPremiumMax=''
					}else{
						lFillSortingPremiumMinMax=lMapFillSortingPremiumMinMax.FillSortingPremiumMinMax
						lSortingPremiumMin=lMapFillSortingPremiumMinMax.SortingPremiumMin
						lSortingPremiumMax=lMapFillSortingPremiumMinMax.SortingPremiumMax
					}
					caseOutput.FillSortingPremiumMinMax=lFillSortingPremiumMinMax
					caseOutput.SortingPremiumMin=lSortingPremiumMin
					caseOutput.SortingPremiumMax=lSortingPremiumMax
					if(!lMapFillSortingPremiumMinMax.Result){
						return lreturn
					}
					Map lMapFillSortingSumInsuredMinMax=this.inputFillSortingSumInsuredMinMax(lFillSortingSumInsuredMinMax,lSortingSumInsuredMin,lSortingSumInsuredMax)
					if(!lMapFillSortingSumInsuredMinMax.Result){
						lFillSortingSumInsuredMinMax=''
						lSortingSumInsuredMin=''
						lSortingSumInsuredMax=''
					}else{
						lFillSortingSumInsuredMinMax=lMapFillSortingSumInsuredMinMax.FillSortingSumInsuredMinMax
						lSortingSumInsuredMin=lMapFillSortingSumInsuredMinMax.SortingSumInsuredMin
						lSortingSumInsuredMax=lMapFillSortingSumInsuredMinMax.SortingSumInsuredMax
					}
					caseOutput.FillSortingSumInsuredMinMax=lFillSortingSumInsuredMinMax
					caseOutput.SortingSumInsuredMin=lSortingSumInsuredMin
					caseOutput.SortingSumInsuredMax=lSortingSumInsuredMax
					if(!lMapFillSortingSumInsuredMinMax.Result){
						return lreturn
					}
				}
				Map lMapFillInsuranceCompany=this.inputFillInsuranceCompany(lFillInsuranceCompany)
				if(!lMapFillInsuranceCompany.Result){
					lFillInsuranceCompany=''
				}else{
					lFillInsuranceCompany=lMapFillInsuranceCompany.FillInsuranceCompany
				}
				caseOutput.FillInsuranceCompany=lFillInsuranceCompany
				if(lFillInsuranceCompany.length()<=0){
					return lreturn
				}
				Boolean lIsFillInsuranceCompany=IGNUemaHelper.convertStringToBoolean(lFillInsuranceCompany)
				if(lIsFillInsuranceCompany){
					Map lMapFillInsuranceCompanyA=this.inputFillInsuranceCompanyA(lFillInsuranceCompanyA,lInsuranceCompanyA)
					if(!lMapFillInsuranceCompanyA.Result){
						lFillInsuranceCompanyA=''
						lInsuranceCompanyA=''
					}else{
						lFillInsuranceCompanyA=lMapFillInsuranceCompanyA.FillInsuranceCompanyA
						lInsuranceCompanyA=lMapFillInsuranceCompanyA.InsuranceCompanyA
					}
					caseOutput.FillInsuranceCompanyA=lFillInsuranceCompanyA
					caseOutput.InsuranceCompanyA=lInsuranceCompanyA
					if(!lMapFillInsuranceCompanyA.Result){
						return lreturn
					}
					Map lMapFillInsuranceCompanyB=this.inputFillInsuranceCompanyB(lFillInsuranceCompanyB,lInsuranceCompanyB)
					if(!lMapFillInsuranceCompanyB.Result){
						lFillInsuranceCompanyB=''
						lInsuranceCompanyB=''
					}else{
						lFillInsuranceCompanyB=lMapFillInsuranceCompanyB.FillInsuranceCompanyB
						lInsuranceCompanyB=lMapFillInsuranceCompanyB.InsuranceCompanyB
					}
					caseOutput.FillInsuranceCompanyB=lFillInsuranceCompanyB
					caseOutput.InsuranceCompanyB=lInsuranceCompanyB
					if(!lMapFillInsuranceCompanyB.Result){
						return lreturn
					}
				}
				Map lMapOutputOfFiltered=this.inputOutputOfFiltered()
				if(!lMapOutputOfFiltered.Result){
					lFilteredNumberOfCards=''
					lFilteredSortingPremiumMinMax=''
					lFilteredSortingSumInsuredMinMax=''
					lFilteredInsuranceCompany=''
					lFilteredPlanCustomChemoTherapy=''
					lFilteredPlanCustomHospitalCash=''
					lFilteredPlanCustomBenefitsPa=''
					lFilteredPlanCustomPurchaseWithLifeinsure=''
				}else{
					lFilteredNumberOfCards=lMapOutputOfFiltered.FilteredNumberOfCards
					lFilteredSortingPremiumMinMax=lMapOutputOfFiltered.FilteredSortingPremiumMinMax
					lFilteredSortingSumInsuredMinMax=lMapOutputOfFiltered.FilteredSortingSumInsuredMinMax
					lFilteredInsuranceCompany=lMapOutputOfFiltered.FilteredInsuranceCompany
					lFilteredPlanCustomChemoTherapy=lMapOutputOfFiltered.FilteredPlanCustomChemoTherapy
					lFilteredPlanCustomHospitalCash=lMapOutputOfFiltered.FilteredPlanCustomHospitalCash
					lFilteredPlanCustomBenefitsPa=lMapOutputOfFiltered.FilteredPlanCustomBenefitsPa
					lFilteredPlanCustomPurchaseWithLifeinsure=lMapOutputOfFiltered.FilteredPlanCustomPurchaseWithLifeinsure
				}
				caseOutput.FilteredNumberOfCards=lFilteredNumberOfCards
				caseOutput.FilteredSortingPremiumMinMax=lFilteredSortingPremiumMinMax
				caseOutput.FilteredSortingSumInsuredMinMax=lFilteredSortingSumInsuredMinMax
				caseOutput.FilteredInsuranceCompany=lFilteredInsuranceCompany
				caseOutput.FilteredPlanCustomChemoTherapy=lFilteredPlanCustomChemoTherapy
				caseOutput.FilteredPlanCustomHospitalCash=lFilteredPlanCustomHospitalCash
				caseOutput.FilteredPlanCustomBenefitsPa=lFilteredPlanCustomBenefitsPa
				caseOutput.FilteredPlanCustomPurchaseWithLifeinsure=lFilteredPlanCustomPurchaseWithLifeinsure
				if(!lMapOutputOfFiltered.Result){
					return lreturn
				}
				Map lMapEmailToSaveFiltered=this.inputEmailToSave(lEmailToSave,false)
				if(!lMapEmailToSave.Result){
					lEmailToSave=''
					lFilteredSaveQuoteId=''
				}else{
					lEmailToSave=lMapEmailToSaveFiltered.EmailToSave
					lFilteredSaveQuoteId=lMapEmailToSaveFiltered.SaveQuoteId
				}
				caseOutput.EmailToSave=lEmailToSave
				caseOutput.FilteredSaveQuoteId=lFilteredSaveQuoteId
			}
			Map lMapOutboundSave=this.inputOutboundSave(lIsPositiveCase,lOutboundSave,lOutboundPrefixName,lOutboundName,lOutboundSurname,lOutboundMobileNumber,lOutboundFillEmailAddress,lOutboundEmailAddress,lOutboundCallBackTime,lOutboundAcceptTermAndCondition)
			if(!lMapOutboundSave.Result){
				lOutboundSave=''
				lOutboundPrefixName=''
				lOutboundName=''
				lOutboundSurname=''
				lOutboundMobileNumber=''
				lOutboundFillEmailAddress=''
				lOutboundEmailAddress=''
				lOutboundCallBackTime=''
				lOutboundAcceptTermAndCondition=''
				lOutboundCpcFormMoreCardDisplayPlanId=''
				lOutboundCpcFormMoreCardPlanType=''
				lOutboundCpcFormMoreCardPlanPartnerName=''
				lOutboundCpcFormMoreCardPlanName=''
				lOutboundCpcFormMoreCardPlanCoverage=''
				lOutboundCpcFormMoreCardPlanPaymentOptionAmount=''
				lOutboundCpcFormMoreCardPlanPaymentInstalment=''
				lOutboundCpcFormMoreCardModalPaymentInstalment=''
				lOutboundCpcFormMoreCardPlanTaxDeduct=''
				lOutboundCpcFormMoreCardPlanChemoTherapy=''
				lOutboundCpcFormMoreCardPlanHospitalCash=''
				lOutboundCpcFormMoreCardPlanBenefitsPa=''
				lOutboundCpcFormMoreCardPlanRenew=''
				lOutboundCpcFormMoreCardPlanActive=''
				lOutboundCpcFormMoreCardPlanWait=''
				lOutboundCpcFormMoreCardPromoText=''
				lOutboundCpcFormMoreOutboundButtonName=''
				lOutboundCpcFormMoreCardDetailPartnerName=''
				lOutboundCpcFormMoreCardDetailPlanName=''
				lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer=''
				lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer=''
				lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer=''
				lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer=''
				lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee=''
				lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee=''
				lOutboundCpcFormMoreCardDetailIsCoverOpd=''
				lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender=''
				lOutboundCpcFormMoreCardDetailIsOtherCovid=''
				lOutboundCpcFormMoreCardDetailTermAndCondition=''
				lOutboundCpcFormMorePlanResultText=''
				lOutboundCpcCardDisplayPlanId=''
				lOutboundCpcCardPlanType=''
				lOutboundCpcCardPlanPartnerName=''
				lOutboundCpcCardPlanName=''
				lOutboundCpcCardPlanCoverage=''
				lOutboundCpcCardPlanPaymentOptionAmount=''
				lOutboundCpcCardPlanPaymentInstalment=''
				lOutboundCpcCardModalPaymentInstalment=''
				lOutboundCpcCardPlanTaxDeduct=''
				lOutboundCpcCardPlanChemoTherapy=''
				lOutboundCpcCardPlanHospitalCash=''
				lOutboundCpcCardPlanBenefitsPa=''
				lOutboundCpcCardPlanRenew=''
				lOutboundCpcCardPlanActive=''
				lOutboundCpcCardPlanWait=''
				lOutboundCpcCardPromoText=''
				lOutboundCpcOutboundButtonName=''
				lOutboundCpcCardDetailPartnerName=''
				lOutboundCpcCardDetailPlanName=''
				lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer=''
				lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer=''
				lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer=''
				lOutboundCpcCardDetailIsAddBenefitsSkinCancer=''
				lOutboundCpcCardDetailIsAddBenefitsFuneralFee=''
				lOutboundCpcCardDetailIsAddBenefitsSecondExamFee=''
				lOutboundCpcCardDetailIsCoverOpd=''
				lOutboundCpcCardDetailIsAddBenefitsForGender=''
				lOutboundCpcCardDetailIsOtherCovid=''
				lOutboundCpcCardDetailTermAndCondition=''
				lOutboundCpcOutboundPlanResultText=''
				lOutboundCplFormMoreCardDisplayPlanId=''
				lOutboundCplFormMoreCardPlanType=''
				lOutboundCplFormMoreCardPlanPartnerName=''
				lOutboundCplFormMoreCardPlanName=''
				lOutboundCplFormMoreCardPlanCoverage=''
				lOutboundCplFormMoreCardPlanPaymentOptionAmount=''
				lOutboundCplFormMoreCardPlanPaymentInstalment=''
				lOutboundCplFormMoreCardModalPaymentInstalment=''
				lOutboundCplFormMoreCardPlanTaxDeduct=''
				lOutboundCplFormMoreCardPlanChemoTherapy=''
				lOutboundCplFormMoreCardPlanHospitalCash=''
				lOutboundCplFormMoreCardPlanBenefitsPa=''
				lOutboundCplFormMoreCardPlanRenew=''
				lOutboundCplFormMoreCardPlanActive=''
				lOutboundCplFormMoreCardPlanWait=''
				lOutboundCplFormMoreCardPromoText=''
				lOutboundCplFormMoreOutboundButtonName=''
				lOutboundCplFormMoreCardDetailPartnerName=''
				lOutboundCplFormMoreCardDetailPlanName=''
				lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer=''
				lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer=''
				lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer=''
				lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer=''
				lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee=''
				lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee=''
				lOutboundCplFormMoreCardDetailIsCoverOpd=''
				lOutboundCplFormMoreCardDetailIsAddBenefitsForGender=''
				lOutboundCplFormMoreCardDetailIsOtherCovid=''
				lOutboundCplFormMoreCardDetailTermAndCondition=''
				lOutboundCplPopupFormCardDisplayPlanId=''
				lOutboundCplPopupFormCardPlanType=''
				lOutboundCplPopupFormCardPlanPartnerName=''
				lOutboundCplPopupFormCardPlanName=''
				lOutboundCplPopupFormCardPlanCoverage=''
				lOutboundCplPopupFormCardPlanPaymentOptionAmount=''
				lOutboundCplPopupFormCardPlanPaymentInstalment=''
				lOutboundCplPopupFormCardModalPaymentInstalment=''
				lOutboundCplPopupFormCardPlanTaxDeduct=''
				lOutboundCplPopupFormCardPlanChemoTherapy=''
				lOutboundCplPopupFormCardPlanHospitalCash=''
				lOutboundCplPopupFormCardPlanBenefitsPa=''
				lOutboundCplPopupFormCardPlanRenew=''
				lOutboundCplPopupFormCardPlanActive=''
				lOutboundCplPopupFormCardPlanWait=''
				lOutboundCplPopupFormCardPromoText=''
				lOutboundCplPopupFormOutboundButtonName=''
				lOutboundCplPopupFormCardDetailPartnerName=''
				lOutboundCplPopupFormCardDetailPlanName=''
				lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer=''
				lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer=''
				lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer=''
				lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer=''
				lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee=''
				lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee=''
				lOutboundCplPopupFormCardDetailIsCoverOpd=''
				lOutboundCplPopupFormCardDetailIsAddBenefitsForGender=''
				lOutboundCplPopupFormCardDetailIsOtherCovid=''
				lOutboundCplPopupFormCardDetailTermAndCondition=''
			}else{
				lOutboundSave=lMapOutboundSave.OutboundSave
				lOutboundPrefixName=lMapOutboundSave.OutboundPrefixName
				lOutboundName=lMapOutboundSave.OutboundName
				lOutboundSurname=lMapOutboundSave.OutboundSurname
				lOutboundMobileNumber=lMapOutboundSave.OutboundMobileNumber
				lOutboundFillEmailAddress=lMapOutboundSave.OutboundFillEmailAddress
				lOutboundEmailAddress=lMapOutboundSave.OutboundEmailAddress
				lOutboundCallBackTime=lMapOutboundSave.OutboundCallBackTime
				lOutboundAcceptTermAndCondition=lMapOutboundSave.OutboundAcceptTermAndCondition
				lOutboundCpcFormMoreCardDisplayPlanId=lMapOutboundSave.OutboundCpcFormMoreCardDisplayPlanId
				lOutboundCpcFormMoreCardPlanType=lMapOutboundSave.OutboundCpcFormMoreCardPlanType
				lOutboundCpcFormMoreCardPlanPartnerName=lMapOutboundSave.OutboundCpcFormMoreCardPlanPartnerName
				lOutboundCpcFormMoreCardPlanName=lMapOutboundSave.OutboundCpcFormMoreCardPlanName
				lOutboundCpcFormMoreCardPlanCoverage=lMapOutboundSave.OutboundCpcFormMoreCardPlanCoverage
				lOutboundCpcFormMoreCardPlanPaymentOptionAmount=lMapOutboundSave.OutboundCpcFormMoreCardPlanPaymentOptionAmount
				lOutboundCpcFormMoreCardPlanPaymentInstalment=lMapOutboundSave.OutboundCpcFormMoreCardPlanPaymentInstalment
				lOutboundCpcFormMoreCardModalPaymentInstalment=lMapOutboundSave.OutboundCpcFormMoreCardModalPaymentInstalment
				lOutboundCpcFormMoreCardPlanTaxDeduct=lMapOutboundSave.OutboundCpcFormMoreCardPlanTaxDeduct
				lOutboundCpcFormMoreCardPlanChemoTherapy=lMapOutboundSave.OutboundCpcFormMoreCardPlanChemoTherapy
				lOutboundCpcFormMoreCardPlanHospitalCash=lMapOutboundSave.OutboundCpcFormMoreCardPlanHospitalCash
				lOutboundCpcFormMoreCardPlanBenefitsPa=lMapOutboundSave.OutboundCpcFormMoreCardPlanBenefitsPa
				lOutboundCpcFormMoreCardPlanRenew=lMapOutboundSave.OutboundCpcFormMoreCardPlanRenew
				lOutboundCpcFormMoreCardPlanActive=lMapOutboundSave.OutboundCpcFormMoreCardPlanActive
				lOutboundCpcFormMoreCardPlanWait=lMapOutboundSave.OutboundCpcFormMoreCardPlanWait
				lOutboundCpcFormMoreCardPromoText=lMapOutboundSave.OutboundCpcFormMoreCardPromoText
				lOutboundCpcFormMoreOutboundButtonName=lMapOutboundSave.OutboundCpcFormMoreOutboundButtonName
				lOutboundCpcFormMoreCardDetailPartnerName=lMapOutboundSave.OutboundCpcFormMoreCardDetailPartnerName
				lOutboundCpcFormMoreCardDetailPlanName=lMapOutboundSave.OutboundCpcFormMoreCardDetailPlanName
				lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer
				lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer
				lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer
				lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer
				lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee
				lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee
				lOutboundCpcFormMoreCardDetailIsCoverOpd=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsCoverOpd
				lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsAddBenefitsForGender
				lOutboundCpcFormMoreCardDetailIsOtherCovid=lMapOutboundSave.OutboundCpcFormMoreCardDetailIsOtherCovid
				lOutboundCpcFormMoreCardDetailTermAndCondition=lMapOutboundSave.OutboundCpcFormMoreCardDetailTermAndCondition
				lOutboundCpcFormMorePlanResultText=lMapOutboundSave.OutboundCpcFormMorePlanResultText
				lOutboundCpcCardDisplayPlanId=lMapOutboundSave.OutboundCpcCardDisplayPlanId
				lOutboundCpcCardPlanType=lMapOutboundSave.OutboundCpcCardPlanType
				lOutboundCpcCardPlanPartnerName=lMapOutboundSave.OutboundCpcCardPlanPartnerName
				lOutboundCpcCardPlanName=lMapOutboundSave.OutboundCpcCardPlanName
				lOutboundCpcCardPlanCoverage=lMapOutboundSave.OutboundCpcCardPlanCoverage
				lOutboundCpcCardPlanPaymentOptionAmount=lMapOutboundSave.OutboundCpcCardPlanPaymentOptionAmount
				lOutboundCpcCardPlanPaymentInstalment=lMapOutboundSave.OutboundCpcCardPlanPaymentInstalment
				lOutboundCpcCardModalPaymentInstalment=lMapOutboundSave.OutboundCpcCardModalPaymentInstalment
				lOutboundCpcCardPlanTaxDeduct=lMapOutboundSave.OutboundCpcCardPlanTaxDeduct
				lOutboundCpcCardPlanChemoTherapy=lMapOutboundSave.OutboundCpcCardPlanChemoTherapy
				lOutboundCpcCardPlanHospitalCash=lMapOutboundSave.OutboundCpcCardPlanHospitalCash
				lOutboundCpcCardPlanBenefitsPa=lMapOutboundSave.OutboundCpcCardPlanBenefitsPa
				lOutboundCpcCardPlanRenew=lMapOutboundSave.OutboundCpcCardPlanRenew
				lOutboundCpcCardPlanActive=lMapOutboundSave.OutboundCpcCardPlanActive
				lOutboundCpcCardPlanWait=lMapOutboundSave.OutboundCpcCardPlanWait
				lOutboundCpcCardPromoText=lMapOutboundSave.OutboundCpcCardPromoText
				lOutboundCpcOutboundButtonName=lMapOutboundSave.OutboundCpcOutboundButtonName
				lOutboundCpcCardDetailPartnerName=lMapOutboundSave.OutboundCpcCardDetailPartnerName
				lOutboundCpcCardDetailPlanName=lMapOutboundSave.OutboundCpcCardDetailPlanName
				lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer=lMapOutboundSave.OutboundCpcCardDetailIsLumpsumAllInvasiveCancer
				lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer=lMapOutboundSave.OutboundCpcCardDetailIsLumpsumNonInvasiveCancer
				lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer=lMapOutboundSave.OutboundCpcCardDetailIsLumpsumAddInvasiveCancer
				lOutboundCpcCardDetailIsAddBenefitsSkinCancer=lMapOutboundSave.OutboundCpcCardDetailIsAddBenefitsSkinCancer
				lOutboundCpcCardDetailIsAddBenefitsFuneralFee=lMapOutboundSave.OutboundCpcCardDetailIsAddBenefitsFuneralFee
				lOutboundCpcCardDetailIsAddBenefitsSecondExamFee=lMapOutboundSave.OutboundCpcCardDetailIsAddBenefitsSecondExamFee
				lOutboundCpcCardDetailIsCoverOpd=lMapOutboundSave.OutboundCpcCardDetailIsCoverOpd
				lOutboundCpcCardDetailIsAddBenefitsForGender=lMapOutboundSave.OutboundCpcCardDetailIsAddBenefitsForGender
				lOutboundCpcCardDetailIsOtherCovid=lMapOutboundSave.OutboundCpcCardDetailIsOtherCovid
				lOutboundCpcCardDetailTermAndCondition=lMapOutboundSave.OutboundCpcCardDetailTermAndCondition
				lOutboundCpcOutboundPlanResultText=lMapOutboundSave.OutboundCpcOutboundPlanResultText
				lOutboundCplFormMoreCardDisplayPlanId=lMapOutboundSave.OutboundCplFormMoreCardDisplayPlanId
				lOutboundCplFormMoreCardPlanType=lMapOutboundSave.OutboundCplFormMoreCardPlanType
				lOutboundCplFormMoreCardPlanPartnerName=lMapOutboundSave.OutboundCplFormMoreCardPlanPartnerName
				lOutboundCplFormMoreCardPlanName=lMapOutboundSave.OutboundCplFormMoreCardPlanName
				lOutboundCplFormMoreCardPlanCoverage=lMapOutboundSave.OutboundCplFormMoreCardPlanCoverage
				lOutboundCplFormMoreCardPlanPaymentOptionAmount=lMapOutboundSave.OutboundCplFormMoreCardPlanPaymentOptionAmount
				lOutboundCplFormMoreCardPlanPaymentInstalment=lMapOutboundSave.OutboundCplFormMoreCardPlanPaymentInstalment
				lOutboundCplFormMoreCardModalPaymentInstalment=lMapOutboundSave.OutboundCplFormMoreCardModalPaymentInstalment
				lOutboundCplFormMoreCardPlanTaxDeduct=lMapOutboundSave.OutboundCplFormMoreCardPlanTaxDeduct
				lOutboundCplFormMoreCardPlanChemoTherapy=lMapOutboundSave.OutboundCplFormMoreCardPlanChemoTherapy
				lOutboundCplFormMoreCardPlanHospitalCash=lMapOutboundSave.OutboundCplFormMoreCardPlanHospitalCash
				lOutboundCplFormMoreCardPlanBenefitsPa=lMapOutboundSave.OutboundCplFormMoreCardPlanBenefitsPa
				lOutboundCplFormMoreCardPlanRenew=lMapOutboundSave.OutboundCplFormMoreCardPlanRenew
				lOutboundCplFormMoreCardPlanActive=lMapOutboundSave.OutboundCplFormMoreCardPlanActive
				lOutboundCplFormMoreCardPlanWait=lMapOutboundSave.OutboundCplFormMoreCardPlanWait
				lOutboundCplFormMoreCardPromoText=lMapOutboundSave.OutboundCplFormMoreCardPromoText
				lOutboundCplFormMoreOutboundButtonName=lMapOutboundSave.OutboundCplFormMoreOutboundButtonName
				lOutboundCplFormMoreCardDetailPartnerName=lMapOutboundSave.OutboundCplFormMoreCardDetailPartnerName
				lOutboundCplFormMoreCardDetailPlanName=lMapOutboundSave.OutboundCplFormMoreCardDetailPlanName
				lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer=lMapOutboundSave.OutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer
				lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer=lMapOutboundSave.OutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer
				lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer=lMapOutboundSave.OutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer
				lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer=lMapOutboundSave.OutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer
				lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee=lMapOutboundSave.OutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee
				lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee=lMapOutboundSave.OutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee
				lOutboundCplFormMoreCardDetailIsCoverOpd=lMapOutboundSave.OutboundCplFormMoreCardDetailIsCoverOpd
				lOutboundCplFormMoreCardDetailIsAddBenefitsForGender=lMapOutboundSave.OutboundCplFormMoreCardDetailIsAddBenefitsForGender
				lOutboundCplFormMoreCardDetailIsOtherCovid=lMapOutboundSave.OutboundCplFormMoreCardDetailIsOtherCovid
				lOutboundCplFormMoreCardDetailTermAndCondition=lMapOutboundSave.OutboundCplFormMoreCardDetailTermAndCondition
				lOutboundCplPopupFormCardDisplayPlanId=lMapOutboundSave.OutboundCplPopupFormCardDisplayPlanId
				lOutboundCplPopupFormCardPlanType=lMapOutboundSave.OutboundCplPopupFormCardPlanType
				lOutboundCplPopupFormCardPlanPartnerName=lMapOutboundSave.OutboundCplPopupFormCardPlanPartnerName
				lOutboundCplPopupFormCardPlanName=lMapOutboundSave.OutboundCplPopupFormCardPlanName
				lOutboundCplPopupFormCardPlanCoverage=lMapOutboundSave.OutboundCplPopupFormCardPlanCoverage
				lOutboundCplPopupFormCardPlanPaymentOptionAmount=lMapOutboundSave.OutboundCplPopupFormCardPlanPaymentOptionAmount
				lOutboundCplPopupFormCardPlanPaymentInstalment=lMapOutboundSave.OutboundCplPopupFormCardPlanPaymentInstalment
				lOutboundCplPopupFormCardModalPaymentInstalment=lMapOutboundSave.OutboundCplPopupFormCardModalPaymentInstalment
				lOutboundCplPopupFormCardPlanTaxDeduct=lMapOutboundSave.OutboundCplPopupFormCardPlanTaxDeduct
				lOutboundCplPopupFormCardPlanChemoTherapy=lMapOutboundSave.OutboundCplPopupFormCardPlanChemoTherapy
				lOutboundCplPopupFormCardPlanHospitalCash=lMapOutboundSave.OutboundCplPopupFormCardPlanHospitalCash
				lOutboundCplPopupFormCardPlanBenefitsPa=lMapOutboundSave.OutboundCplPopupFormCardPlanBenefitsPa
				lOutboundCplPopupFormCardPlanRenew=lMapOutboundSave.OutboundCplPopupFormCardPlanRenew
				lOutboundCplPopupFormCardPlanActive=lMapOutboundSave.OutboundCplPopupFormCardPlanActive
				lOutboundCplPopupFormCardPlanWait=lMapOutboundSave.OutboundCplPopupFormCardPlanWait
				lOutboundCplPopupFormCardPromoText=lMapOutboundSave.OutboundCplPopupFormCardPromoText
				lOutboundCplPopupFormOutboundButtonName=lMapOutboundSave.OutboundCplPopupFormOutboundButtonName
				lOutboundCplPopupFormCardDetailPartnerName=lMapOutboundSave.OutboundCplPopupFormCardDetailPartnerName
				lOutboundCplPopupFormCardDetailPlanName=lMapOutboundSave.OutboundCplPopupFormCardDetailPlanName
				lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer=lMapOutboundSave.OutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer
				lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer=lMapOutboundSave.OutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer
				lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer=lMapOutboundSave.OutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer
				lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer=lMapOutboundSave.OutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer
				lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee=lMapOutboundSave.OutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee
				lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee=lMapOutboundSave.OutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee
				lOutboundCplPopupFormCardDetailIsCoverOpd=lMapOutboundSave.OutboundCplPopupFormCardDetailIsCoverOpd
				lOutboundCplPopupFormCardDetailIsAddBenefitsForGender=lMapOutboundSave.OutboundCplPopupFormCardDetailIsAddBenefitsForGender
				lOutboundCplPopupFormCardDetailIsOtherCovid=lMapOutboundSave.OutboundCplPopupFormCardDetailIsOtherCovid
				lOutboundCplPopupFormCardDetailTermAndCondition=lMapOutboundSave.OutboundCplPopupFormCardDetailTermAndCondition
			}
			caseOutput.OutboundSave=lOutboundSave
			caseOutput.OutboundPrefixName=lOutboundPrefixName
			caseOutput.OutboundName=lOutboundName
			caseOutput.OutboundSurname=lOutboundSurname
			caseOutput.OutboundMobileNumber=lOutboundMobileNumber
			caseOutput.OutboundFillEmailAddress=lOutboundFillEmailAddress
			caseOutput.OutboundEmailAddress=lOutboundEmailAddress
			caseOutput.OutboundCallBackTime=lOutboundCallBackTime
			caseOutput.OutboundAcceptTermAndCondition=lOutboundAcceptTermAndCondition
			caseOutput.OutboundCpcFormMoreCardDisplayPlanId=lOutboundCpcFormMoreCardDisplayPlanId
			caseOutput.OutboundCpcFormMoreCardPlanType=lOutboundCpcFormMoreCardPlanType
			caseOutput.OutboundCpcFormMoreCardPlanPartnerName=lOutboundCpcFormMoreCardPlanPartnerName
			caseOutput.OutboundCpcFormMoreCardPlanName=lOutboundCpcFormMoreCardPlanName
			caseOutput.OutboundCpcFormMoreCardPlanCoverage=lOutboundCpcFormMoreCardPlanCoverage
			caseOutput.OutboundCpcFormMoreCardPlanPaymentOptionAmount=lOutboundCpcFormMoreCardPlanPaymentOptionAmount
			caseOutput.OutboundCpcFormMoreCardPlanPaymentInstalment=lOutboundCpcFormMoreCardPlanPaymentInstalment
			caseOutput.OutboundCpcFormMoreCardModalPaymentInstalment=lOutboundCpcFormMoreCardModalPaymentInstalment
			caseOutput.OutboundCpcFormMoreCardPlanTaxDeduct=lOutboundCpcFormMoreCardPlanTaxDeduct
			caseOutput.OutboundCpcFormMoreCardPlanChemoTherapy=lOutboundCpcFormMoreCardPlanChemoTherapy
			caseOutput.OutboundCpcFormMoreCardPlanHospitalCash=lOutboundCpcFormMoreCardPlanHospitalCash
			caseOutput.OutboundCpcFormMoreCardPlanBenefitsPa=lOutboundCpcFormMoreCardPlanBenefitsPa
			caseOutput.OutboundCpcFormMoreCardPlanRenew=lOutboundCpcFormMoreCardPlanRenew
			caseOutput.OutboundCpcFormMoreCardPlanActive=lOutboundCpcFormMoreCardPlanActive
			caseOutput.OutboundCpcFormMoreCardPlanWait=lOutboundCpcFormMoreCardPlanWait
			caseOutput.OutboundCpcFormMoreCardPromoText=lOutboundCpcFormMoreCardPromoText
			caseOutput.OutboundCpcFormMoreOutboundButtonName=lOutboundCpcFormMoreOutboundButtonName
			caseOutput.OutboundCpcFormMoreCardDetailPartnerName=lOutboundCpcFormMoreCardDetailPartnerName
			caseOutput.OutboundCpcFormMoreCardDetailPlanName=lOutboundCpcFormMoreCardDetailPlanName
			caseOutput.OutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer=lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer
			caseOutput.OutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer=lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer
			caseOutput.OutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer=lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer
			caseOutput.OutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer=lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer
			caseOutput.OutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee=lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee
			caseOutput.OutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee=lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee
			caseOutput.OutboundCpcFormMoreCardDetailIsCoverOpd=lOutboundCpcFormMoreCardDetailIsCoverOpd
			caseOutput.OutboundCpcFormMoreCardDetailIsAddBenefitsForGender=lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender
			caseOutput.OutboundCpcFormMoreCardDetailIsOtherCovid=lOutboundCpcFormMoreCardDetailIsOtherCovid
			caseOutput.OutboundCpcFormMoreCardDetailTermAndCondition=lOutboundCpcFormMoreCardDetailTermAndCondition
			caseOutput.OutboundCpcFormMorePlanResultText=lOutboundCpcFormMorePlanResultText
			caseOutput.OutboundCpcCardDisplayPlanId=lOutboundCpcCardDisplayPlanId
			caseOutput.OutboundCpcCardPlanType=lOutboundCpcCardPlanType
			caseOutput.OutboundCpcCardPlanPartnerName=lOutboundCpcCardPlanPartnerName
			caseOutput.OutboundCpcCardPlanName=lOutboundCpcCardPlanName
			caseOutput.OutboundCpcCardPlanCoverage=lOutboundCpcCardPlanCoverage
			caseOutput.OutboundCpcCardPlanPaymentOptionAmount=lOutboundCpcCardPlanPaymentOptionAmount
			caseOutput.OutboundCpcCardPlanPaymentInstalment=lOutboundCpcCardPlanPaymentInstalment
			caseOutput.OutboundCpcCardModalPaymentInstalment=lOutboundCpcCardModalPaymentInstalment
			caseOutput.OutboundCpcCardPlanTaxDeduct=lOutboundCpcCardPlanTaxDeduct
			caseOutput.OutboundCpcCardPlanChemoTherapy=lOutboundCpcCardPlanChemoTherapy
			caseOutput.OutboundCpcCardPlanHospitalCash=lOutboundCpcCardPlanHospitalCash
			caseOutput.OutboundCpcCardPlanBenefitsPa=lOutboundCpcCardPlanBenefitsPa
			caseOutput.OutboundCpcCardPlanRenew=lOutboundCpcCardPlanRenew
			caseOutput.OutboundCpcCardPlanActive=lOutboundCpcCardPlanActive
			caseOutput.OutboundCpcCardPlanWait=lOutboundCpcCardPlanWait
			caseOutput.OutboundCpcCardPromoText=lOutboundCpcCardPromoText
			caseOutput.OutboundCpcOutboundButtonName=lOutboundCpcOutboundButtonName
			caseOutput.OutboundCpcCardDetailPartnerName=lOutboundCpcCardDetailPartnerName
			caseOutput.OutboundCpcCardDetailPlanName=lOutboundCpcCardDetailPlanName
			caseOutput.OutboundCpcCardDetailIsLumpsumAllInvasiveCancer=lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer
			caseOutput.OutboundCpcCardDetailIsLumpsumNonInvasiveCancer=lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer
			caseOutput.OutboundCpcCardDetailIsLumpsumAddInvasiveCancer=lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer
			caseOutput.OutboundCpcCardDetailIsAddBenefitsSkinCancer=lOutboundCpcCardDetailIsAddBenefitsSkinCancer
			caseOutput.OutboundCpcCardDetailIsAddBenefitsFuneralFee=lOutboundCpcCardDetailIsAddBenefitsFuneralFee
			caseOutput.OutboundCpcCardDetailIsAddBenefitsSecondExamFee=lOutboundCpcCardDetailIsAddBenefitsSecondExamFee
			caseOutput.OutboundCpcCardDetailIsCoverOpd=lOutboundCpcCardDetailIsCoverOpd
			caseOutput.OutboundCpcCardDetailIsAddBenefitsForGender=lOutboundCpcCardDetailIsAddBenefitsForGender
			caseOutput.OutboundCpcCardDetailIsOtherCovid=lOutboundCpcCardDetailIsOtherCovid
			caseOutput.OutboundCpcCardDetailTermAndCondition=lOutboundCpcCardDetailTermAndCondition
			caseOutput.OutboundCpcOutboundPlanResultText=lOutboundCpcOutboundPlanResultText
			caseOutput.OutboundCplFormMoreCardDisplayPlanId=lOutboundCplFormMoreCardDisplayPlanId
			caseOutput.OutboundCplFormMoreCardPlanType=lOutboundCplFormMoreCardPlanType
			caseOutput.OutboundCplFormMoreCardPlanPartnerName=lOutboundCplFormMoreCardPlanPartnerName
			caseOutput.OutboundCplFormMoreCardPlanName=lOutboundCplFormMoreCardPlanName
			caseOutput.OutboundCplFormMoreCardPlanCoverage=lOutboundCplFormMoreCardPlanCoverage
			caseOutput.OutboundCplFormMoreCardPlanPaymentOptionAmount=lOutboundCplFormMoreCardPlanPaymentOptionAmount
			caseOutput.OutboundCplFormMoreCardPlanPaymentInstalment=lOutboundCplFormMoreCardPlanPaymentInstalment
			caseOutput.OutboundCplFormMoreCardModalPaymentInstalment=lOutboundCplFormMoreCardModalPaymentInstalment
			caseOutput.OutboundCplFormMoreCardPlanTaxDeduct=lOutboundCplFormMoreCardPlanTaxDeduct
			caseOutput.OutboundCplFormMoreCardPlanChemoTherapy=lOutboundCplFormMoreCardPlanChemoTherapy
			caseOutput.OutboundCplFormMoreCardPlanHospitalCash=lOutboundCplFormMoreCardPlanHospitalCash
			caseOutput.OutboundCplFormMoreCardPlanBenefitsPa=lOutboundCplFormMoreCardPlanBenefitsPa
			caseOutput.OutboundCplFormMoreCardPlanRenew=lOutboundCplFormMoreCardPlanRenew
			caseOutput.OutboundCplFormMoreCardPlanActive=lOutboundCplFormMoreCardPlanActive
			caseOutput.OutboundCplFormMoreCardPlanWait=lOutboundCplFormMoreCardPlanWait
			caseOutput.OutboundCplFormMoreCardPromoText=lOutboundCplFormMoreCardPromoText
			caseOutput.OutboundCplFormMoreOutboundButtonName=lOutboundCplFormMoreOutboundButtonName
			caseOutput.OutboundCplFormMoreCardDetailPartnerName=lOutboundCplFormMoreCardDetailPartnerName
			caseOutput.OutboundCplFormMoreCardDetailPlanName=lOutboundCplFormMoreCardDetailPlanName
			caseOutput.OutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer=lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer
			caseOutput.OutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer=lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer
			caseOutput.OutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer=lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer
			caseOutput.OutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer=lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer
			caseOutput.OutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee=lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee
			caseOutput.OutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee=lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee
			caseOutput.OutboundCplFormMoreCardDetailIsCoverOpd=lOutboundCplFormMoreCardDetailIsCoverOpd
			caseOutput.OutboundCplFormMoreCardDetailIsAddBenefitsForGender=lOutboundCplFormMoreCardDetailIsAddBenefitsForGender
			caseOutput.OutboundCplFormMoreCardDetailIsOtherCovid=lOutboundCplFormMoreCardDetailIsOtherCovid
			caseOutput.OutboundCplFormMoreCardDetailTermAndCondition=lOutboundCplFormMoreCardDetailTermAndCondition
			caseOutput.OutboundCplPopupFormCardDisplayPlanId=lOutboundCplPopupFormCardDisplayPlanId
			caseOutput.OutboundCplPopupFormCardPlanType=lOutboundCplPopupFormCardPlanType
			caseOutput.OutboundCplPopupFormCardPlanPartnerName=lOutboundCplPopupFormCardPlanPartnerName
			caseOutput.OutboundCplPopupFormCardPlanName=lOutboundCplPopupFormCardPlanName
			caseOutput.OutboundCplPopupFormCardPlanCoverage=lOutboundCplPopupFormCardPlanCoverage
			caseOutput.OutboundCplPopupFormCardPlanPaymentOptionAmount=lOutboundCplPopupFormCardPlanPaymentOptionAmount
			caseOutput.OutboundCplPopupFormCardPlanPaymentInstalment=lOutboundCplPopupFormCardPlanPaymentInstalment
			caseOutput.OutboundCplPopupFormCardModalPaymentInstalment=lOutboundCplPopupFormCardModalPaymentInstalment
			caseOutput.OutboundCplPopupFormCardPlanTaxDeduct=lOutboundCplPopupFormCardPlanTaxDeduct
			caseOutput.OutboundCplPopupFormCardPlanChemoTherapy=lOutboundCplPopupFormCardPlanChemoTherapy
			caseOutput.OutboundCplPopupFormCardPlanHospitalCash=lOutboundCplPopupFormCardPlanHospitalCash
			caseOutput.OutboundCplPopupFormCardPlanBenefitsPa=lOutboundCplPopupFormCardPlanBenefitsPa
			caseOutput.OutboundCplPopupFormCardPlanRenew=lOutboundCplPopupFormCardPlanRenew
			caseOutput.OutboundCplPopupFormCardPlanActive=lOutboundCplPopupFormCardPlanActive
			caseOutput.OutboundCplPopupFormCardPlanWait=lOutboundCplPopupFormCardPlanWait
			caseOutput.OutboundCplPopupFormCardPromoText=lOutboundCplPopupFormCardPromoText
			caseOutput.OutboundCplPopupFormOutboundButtonName=lOutboundCplPopupFormOutboundButtonName
			caseOutput.OutboundCplPopupFormCardDetailPartnerName=lOutboundCplPopupFormCardDetailPartnerName
			caseOutput.OutboundCplPopupFormCardDetailPlanName=lOutboundCplPopupFormCardDetailPlanName
			caseOutput.OutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer=lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer
			caseOutput.OutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer=lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer
			caseOutput.OutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer=lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer
			caseOutput.OutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer=lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer
			caseOutput.OutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee=lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee
			caseOutput.OutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee=lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee
			caseOutput.OutboundCplPopupFormCardDetailIsCoverOpd=lOutboundCplPopupFormCardDetailIsCoverOpd
			caseOutput.OutboundCplPopupFormCardDetailIsAddBenefitsForGender=lOutboundCplPopupFormCardDetailIsAddBenefitsForGender
			caseOutput.OutboundCplPopupFormCardDetailIsOtherCovid=lOutboundCplPopupFormCardDetailIsOtherCovid
			caseOutput.OutboundCplPopupFormCardDetailTermAndCondition=lOutboundCplPopupFormCardDetailTermAndCondition
			if(lOutboundSave.length()<=0){
				return lreturn
			}
			Map lMapCallMeBack=this.inputCallMeBack(lCallMeBack,lCallMeBackPhoneNo)
			if(!lMapCallMeBack.Result){
				lCallMeBack=''
				lCallMeBackPhoneNo=''
			}else{
				lCallMeBack=lMapCallMeBack.CallMeBack
				lCallMeBackPhoneNo=lMapCallMeBack.CallMeBackPhoneNo
			}
			caseOutput.CallMeBack=lCallMeBack
			caseOutput.CallMeBackPhoneNo=lCallMeBackPhoneNo
			if(lCallMeBack.length()<=0){
				return lreturn
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			caseOutput.ActualResult=lActualResult
			lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
		}catch(Exception e){
			e.printStackTrace()
			lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,e.getMessage())
			caseOutput.ResultMessage=lResultMessage
			return lreturn
		}
		return lreturn
	}
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lTagFormLoading=''
			String lLocatorFormLoading='#loading'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
				IGNUemaHelper.delayThreadSecond(1)
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(3)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			}
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean closeAskToSaveEmailForm(){
		Boolean lreturn=false
		try{
			String lTagFormSaveQuote='save-quote-modal'
			String lLocatorFormSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagFormSaveQuote)
			String lTagButtonCloseSaveQuote='save-quote-modal-close'
			String lLocatorButtonCloseSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCloseSaveQuote)
			WebElement lElementButtonCloseSaveQuote=null
			Boolean lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			if(lIsSaveQuoteVisible){
				lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
				if(lElementButtonCloseSaveQuote){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonCloseSaveQuote)
				}
				lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			}
			if(lIsSaveQuoteVisible){
				lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
				if(lElementButtonCloseSaveQuote){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonCloseSaveQuote)
				}
				lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			}
			lreturn=!lIsSaveQuoteVisible
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THAKumkaCancerInputType.DEFAULT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('PositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lPositiveCase=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lResult=lPositiveCase.length()>0
			if(lResult){
				lreturn.put('PositiveCase',lPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAKumkaCancerResultType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THAKumkaCancerResultType.DEFAULT_LANGUAGE
			}
			lResult=lLanguage.length()>0
			if(lResult){
				lreturn.put('Language',lLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputEmailToSave(String strEmailToSave,Boolean isForDefault){
		Map lreturn=[:]
		String lEmailToSave=strEmailToSave.trim()
		String lSaveQuoteId=''
		if(lEmailToSave.length()<=0){
			lEmailToSave=THAKumkaCancerResultType.DEFAULT_EMAIL_TO_SAVE
		}
		try{
			Boolean lResult=false
			lreturn.put('EmailToSave','')
			lreturn.put('SaveQuoteId','')
			lreturn.put('Result',lResult)
			String lTagButtonExpandSaveQuote='call-me-back-btn'
			String lLocatorButtonExpandSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonExpandSaveQuote)
			WebElement lElementButtonExpandSaveQuote=null
			String lTagButtonOpenSaveQuote='open-save-quote-modal'
			String lLocatorButtonOpenSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonOpenSaveQuote)
			WebElement lElementButtonOpenSaveQuote=null
			String lTagFormSaveQuote='save-quote-modal'
			String lLocatorFormSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagFormSaveQuote)
			Boolean lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,5)
			if(!lIsSaveQuoteVisible){
				lElementButtonExpandSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonExpandSaveQuote)
				if(lElementButtonExpandSaveQuote){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonExpandSaveQuote)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonExpandSaveQuote)
				}
				lElementButtonOpenSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonOpenSaveQuote)
				if(lElementButtonOpenSaveQuote){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonOpenSaveQuote)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonOpenSaveQuote)
				}
				lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,20)
			}
			String lTagEmailInputText='save-quote-modal-email-input'
			String lLocatorEmailInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagEmailInputText)
			WebElement lElementEmailInputText=null
			String lTagSaveQuoteSubmitButton='save-quote-submit-btn'
			String lLocatorSaveQuoteSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSaveQuoteSubmitButton)
			WebElement lElementSaveQuoteSubmitButton=null
			if(!lIsSaveQuoteVisible){
				lEmailToSave='No Option'
			}else{
				lElementEmailInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagEmailInputText)
				if(!lElementEmailInputText){
					lEmailToSave=''
				}else{
					lEmailToSave=IGNUemaHelper.typeTextByWebElement(this.driver,lElementEmailInputText,lEmailToSave)
				}
				lElementSaveQuoteSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSaveQuoteSubmitButton)
				if(lElementSaveQuoteSubmitButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSaveQuoteSubmitButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSaveQuoteSubmitButton)
				}
			}
			lResult=lEmailToSave.length()>0
			String lTagSaveQuoteCloseButton='save-quote-modal-close'
			String lLocatorSaveQuoteCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSaveQuoteCloseButton)
			IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorSaveQuoteCloseButton)
			if(lIsSaveQuoteVisible){
				lElementButtonExpandSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonExpandSaveQuote)
				if(lElementButtonExpandSaveQuote){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonExpandSaveQuote)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonExpandSaveQuote)
				}
			}
			String lTagSaveQuoteIdText='save-result-id'
			String lLocatorSaveQuoteIdText=IGNUemaHelper.getTagDataSeleniumKey(lTagSaveQuoteIdText)
			WebElement lElementSaveQuoteIdText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSaveQuoteIdText)
			if(lElementSaveQuoteIdText){
				for(Integer lIndex=1;lIndex<=10;lIndex++){
					lElementSaveQuoteIdText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSaveQuoteIdText)
					lSaveQuoteId=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSaveQuoteIdText).trim()
					if(lSaveQuoteId.length()>0){
						if(lSaveQuoteId.equalsIgnoreCase(this.saveQuoteId)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}else{
						IGNUemaHelper.delayThreadSecond(lIndex)
					}
				}
				String lPrefixURLText='https://compare.uat-mrkumka.com/cancer/#/redirect?utm_source=MrKumka-SaveQuote&saveQuoteid='
				lSaveQuoteId=lPrefixURLText+lSaveQuoteId
				this.saveQuoteId=lSaveQuoteId
			}
			String lOpportunityNumber=''
			String lTagOpportunityNumberText='opportunity'
			String lLocatorOpportunityNumberText=IGNUemaHelper.getTagDataSeleniumKey(lTagOpportunityNumberText)
			WebElement lElementOpportunityNumberText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberText)
			if(lElementOpportunityNumberText){
				for(Integer lIndex=1;lIndex<=10;lIndex++){
					lElementOpportunityNumberText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberText)
					lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOpportunityNumberText).trim()
					if(lOpportunityNumber.length()>0){
						if(lOpportunityNumber.equalsIgnoreCase(this.opportunityNumber)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}else{
						IGNUemaHelper.delayThreadSecond(lIndex)
					}
				}
				this.opportunityNumber=lOpportunityNumber
				lSaveQuoteId=IGNUemaHelper.concatMessageLeftRightByPipe(lSaveQuoteId,lOpportunityNumber)
			}
			if(lResult){
				lreturn.put('EmailToSave',lEmailToSave)
				lreturn.put('SaveQuoteId',lSaveQuoteId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeBack(String strCallMeBack,String strCallMeBackPhoneNo){
		Map lreturn=[:]
		String lCallMeBack=strCallMeBack.trim()
		if(lCallMeBack.length()<=0){
			lCallMeBack=THAKumkaCancerResultType.DEFAULT_CALL_ME_BACK
		}
		String lCallMeBackPhoneNo=strCallMeBackPhoneNo.trim()
		if(lCallMeBackPhoneNo.length()<=0){
			lCallMeBackPhoneNo=THAKumkaCancerResultType.DEFAULT_CALL_ME_BACK_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('CallMeBack','')
			lreturn.put('CallMeBackPhoneNo','')
			lreturn.put('Result',lResult)
			Boolean lIsCallMeBack=IGNUemaHelper.convertStringToBoolean(lCallMeBack)
			lCallMeBack=IGNUemaHelper.convertBooleanToString(lIsCallMeBack)
			if(!lIsCallMeBack){
				lCallMeBackPhoneNo=''
			}else{
				String lTagButtonExpandCallMeBack='call-me-back-btn'
				String lLocatorButtonExpandCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonExpandCallMeBack)
				WebElement lElementButtonExpandCallMeBack=null
				String lTagButtonOpenCallMeBack='open-call-me-back-modal'
				String lLocatorButtonOpenCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonOpenCallMeBack)
				WebElement lElementButtonOpenCallMeBack=null
				String lTagFormCallMeBack='call-me-back-modal'
				String lLocatorFormCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagFormCallMeBack)
				Boolean lIsCallMeBackVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormCallMeBack,5)
				if(!lIsCallMeBackVisible){
					lElementButtonExpandCallMeBack=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonExpandCallMeBack)
					if(lElementButtonExpandCallMeBack){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonExpandCallMeBack)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonExpandCallMeBack)
						IGNUemaHelper.delayThreadSecond(1)
					}
					lElementButtonOpenCallMeBack=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonOpenCallMeBack)
					if(lElementButtonOpenCallMeBack){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonOpenCallMeBack)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonOpenCallMeBack)
						IGNUemaHelper.delayThreadSecond(2)
					}
					lIsCallMeBackVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormCallMeBack,20)
				}
				String lTagPhoneNoInputText='call-me-back-mobile-input'
				String lLocatorPhoneNoInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagPhoneNoInputText)
				WebElement lElementPhoneNoInputText=null
				String lTagCallMeBackSubmitButton='call-me-back-submit-btn'
				String lLocatorCallMeBackSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeBackSubmitButton)
				WebElement lElementCallMeBackSubmitButton=null
				if(!lIsCallMeBackVisible){
					lCallMeBackPhoneNo='No Option'
				}else{
					lElementPhoneNoInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPhoneNoInputText)
					if(!lElementPhoneNoInputText){
						lCallMeBackPhoneNo=''
					}else{
						lCallMeBackPhoneNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPhoneNoInputText,lCallMeBackPhoneNo)
					}
					lElementCallMeBackSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeBackSubmitButton)
					if(lElementCallMeBackSubmitButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCallMeBackSubmitButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCallMeBackSubmitButton)
						IGNUemaHelper.delayThreadSecond(3)
					}
				}
				String lTagCallMeBackDismissButton=''
				String lLocatorCallMeBackDismissButton='#callback-popupsuccess button'
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorCallMeBackDismissButton)
				String lTagCallMeBackCloseButton='call-me-back-modal-close'
				String lLocatorCallMeBackCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeBackCloseButton)
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorCallMeBackCloseButton)
				if(lIsCallMeBackVisible){
					lElementButtonExpandCallMeBack=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonExpandCallMeBack)
					if(lElementButtonExpandCallMeBack){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonExpandCallMeBack)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonExpandCallMeBack)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				String lCallMeBackId=''
				String lTagCallMeBackIdText='save-result-id'
				String lLocatorCallMeBackIdText=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeBackIdText)
				WebElement lElementCallMeBackIdText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeBackIdText)
				if(lElementCallMeBackIdText){
					for(Integer lIndex=1;lIndex<=10;lIndex++){
						lElementCallMeBackIdText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeBackIdText)
						lCallMeBackId=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCallMeBackIdText).trim()
						if(lCallMeBackId.length()>0){
							if(lCallMeBackId.equalsIgnoreCase(this.saveQuoteId)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}else{
							IGNUemaHelper.delayThreadSecond(lIndex)
						}
					}
					String lPrefixURLText='https://compare.uat-mrkumka.com/cancer/#/redirect?utm_source=MrKumka-SaveQuote&saveQuoteid='
					lCallMeBackPhoneNo=lCallMeBackPhoneNo+'|'+lCallMeBackId+'|'+lPrefixURLText+lCallMeBackId
					this.saveQuoteId=lCallMeBackId
				}
			}
			if(!lIsCallMeBack){
				lResult=lCallMeBack.length()>0
			}else{
				lResult=lCallMeBackPhoneNo.length()>0
			}
			if(lResult){
				lreturn.put('CallMeBack',lCallMeBack)
				lreturn.put('CallMeBackPhoneNo',lCallMeBackPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutputOfDefault(){
		Map lreturn=[:]
		String lDefaultPlanPersonInfo=''
		String lDefaultNumberOfCards=''
		String lDefaultSortingPremiumMinMax=''
		String lDefaultSortingSumInsuredMinMax=''
		String lDefaultInsuranceCompany=''
		String lDefaultPlanCustomChemoTherapy=''
		String lDefaultPlanCustomHospitalCash=''
		String lDefaultPlanCustomBenefitsPa=''
		String lDefaultPlanCustomPurchaseWithLifeinsure=''
		try{
			Boolean lResult=false
			lreturn.put('DefaultPlanPersonInfo','')
			lreturn.put('DefaultNumberOfCards','')
			lreturn.put('DefaultSortingPremiumMinMax','')
			lreturn.put('DefaultSortingSumInsuredMinMax','')
			lreturn.put('DefaultInsuranceCompany','')
			lreturn.put('DefaultPlanCustomChemoTherapy','')
			lreturn.put('DefaultPlanCustomHospitalCash','')
			lreturn.put('DefaultPlanCustomBenefitsPa','')
			lreturn.put('DefaultPlanCustomPurchaseWithLifeinsure','')
			lreturn.put('Result',lResult)
			this.closeAskToSaveEmailForm()
			Boolean lIsOK=false
			String lTagPlanPersonInfo='brand-name'
			String lLocatorPlanPersonInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanPersonInfo)
			WebElement lElementPlanPersonInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanPersonInfo)
			if(!lElementPlanPersonInfo){
				return lreturn
			}
			lDefaultPlanPersonInfo=IGNUemaHelper.getTextByWebElement(this.driver,lElementPlanPersonInfo).trim()
			lIsOK=lDefaultPlanPersonInfo.length()>0
			if(!lIsOK){
				return lreturn
			}
			Integer lDefaultNumberOfCardsNum=0
			String lTagListOfCardResultList='card-plan'
			String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
			List<WebElement> lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
			if(lElementListOfCardResultList){
				lDefaultNumberOfCardsNum=lElementListOfCardResultList.size()
			}
			lDefaultNumberOfCards=lDefaultNumberOfCardsNum.toString()
			lIsOK=lDefaultNumberOfCards.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagSortingPremiumButton='sort-by-premium-ASC'
			String lLocatorSortingPremiumButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumButton)
			WebElement lElementSortingPremiumButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumButton)
			if(!lElementSortingPremiumButton){
				return lreturn
			}
			String lTagSortingSumInsuredButton='sort-by-sumInsured-DESC'
			String lLocatorSortingSumInsuredButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredButton)
			WebElement lElementSortingSumInsuredButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredButton)
			if(!lElementSortingSumInsuredButton){
				return lreturn
			}
			Boolean lIsFilterSortingByPremiumActive=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementSortingPremiumButton,'active')
			THAKumkaCancerCoreType.CURRENT_KUMKA_CANCER_RESULT_UTIL_FILTER_SORTING_BY_DEFAULT_PREMIUM=lIsFilterSortingByPremiumActive
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
			this.closeAskToSaveEmailForm()
			String lTagSortingPremiumTextMin='minPremium'
			String lLocatorSortingPremiumTextMin=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumTextMin)
			WebElement lElementSortingPremiumTextMin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumTextMin)
			if(!lElementSortingPremiumTextMin){
				return lreturn
			}
			String lTagSortingPremiumTextMax='maxPremium'
			String lLocatorSortingPremiumTextMax=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumTextMax)
			WebElement lElementSortingPremiumTextMax=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumTextMax)
			if(!lElementSortingPremiumTextMax){
				return lreturn
			}
			String lTextSortingPremiumTextMin=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingPremiumTextMin).trim()
			String lTextSortingPremiumTextMax=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingPremiumTextMax).trim()
			lDefaultSortingPremiumMinMax=IGNUemaHelper.concatMessageLeftRightByPipe(lTextSortingPremiumTextMin,lTextSortingPremiumTextMax)
			lIsOK=lDefaultSortingPremiumMinMax.length()>0
			if(!lIsOK){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingSumInsuredButton)
			this.closeAskToSaveEmailForm()
			String lTagSortingSumInsuredTextMin='minSumInsure'
			String lLocatorSortingSumInsuredTextMin=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredTextMin)
			WebElement lElementSortingSumInsuredTextMin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredTextMin)
			if(!lElementSortingSumInsuredTextMin){
				return lreturn
			}
			String lTagSortingSumInsuredTextMax='maxSumInsure'
			String lLocatorSortingSumInsuredTextMax=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredTextMax)
			WebElement lElementSortingSumInsuredTextMax=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredTextMax)
			if(!lElementSortingSumInsuredTextMax){
				return lreturn
			}
			String lTextSortingSumInsuredTextMin=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingSumInsuredTextMin).trim()
			String lTextSortingSumInsuredTextMax=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingSumInsuredTextMax).trim()
			lDefaultSortingSumInsuredMinMax=IGNUemaHelper.concatMessageLeftRightByPipe(lTextSortingSumInsuredTextMin,lTextSortingSumInsuredTextMax)
			lIsOK=lDefaultSortingSumInsuredMinMax.length()>0
			if(!lIsOK){
				return lreturn
			}
			if(lIsFilterSortingByPremiumActive){
				lElementSortingPremiumButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumButton)
				if(!lElementSortingPremiumButton){
					return lreturn
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
			}else{
				lElementSortingSumInsuredButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredButton)
				if(!lElementSortingSumInsuredButton){
					return lreturn
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
			}
			this.closeAskToSaveEmailForm()
			String lTagInsuranceCompanyParent='company-filter-multiselect'
			String lLocatorInsuranceCompanyParent=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuranceCompanyParent)
			WebElement lElementInsuranceCompanyParent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuranceCompanyParent)
			if(!lElementInsuranceCompanyParent){
				return lreturn
			}
			String lTagInsuranceCompanyText=''
			String lLocatorInsuranceCompanyText='.multiselect__tags-wrap'
			WebElement lElementInsuranceCompanyText=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementInsuranceCompanyParent,lLocatorInsuranceCompanyText,true)
			if(!lElementInsuranceCompanyText){
				return lreturn
			}
			lDefaultInsuranceCompany=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInsuranceCompanyText).trim()
			String lTagPlanCustomChemoTherapy='filter-coverage-chemotherapy'
			String lLocatorPlanCustomChemoTherapy=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomChemoTherapy)
			WebElement lElementPlanCustomChemoTherapy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomChemoTherapy)
			if(!lElementPlanCustomChemoTherapy){
				return lreturn
			}
			lDefaultPlanCustomChemoTherapy=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomChemoTherapy))
			lIsOK=lDefaultPlanCustomChemoTherapy.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagPlanCustomHospitalCash='filter-coverage-hospitalization'
			String lLocatorPlanCustomHospitalCash=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomHospitalCash)
			WebElement lElementPlanCustomHospitalCash=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomHospitalCash)
			if(!lElementPlanCustomHospitalCash){
				return lreturn
			}
			lDefaultPlanCustomHospitalCash=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomHospitalCash))
			lIsOK=lDefaultPlanCustomHospitalCash.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagPlanCustomBenefitsPa='filter-coverage-PA'
			String lLocatorPlanCustomBenefitsPa=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomBenefitsPa)
			WebElement lElementPlanCustomBenefitsPa=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomBenefitsPa)
			if(!lElementPlanCustomBenefitsPa){
				return lreturn
			}
			lDefaultPlanCustomBenefitsPa=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomBenefitsPa))
			lIsOK=lDefaultPlanCustomBenefitsPa.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagPlanCustomPurchaseWithLifeinsure='filter-coverage-lifeInsuranceRequired'
			String lLocatorPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomPurchaseWithLifeinsure)
			WebElement lElementPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomPurchaseWithLifeinsure)
			if(!lElementPlanCustomPurchaseWithLifeinsure){
				return lreturn
			}
			lDefaultPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomPurchaseWithLifeinsure))
			lIsOK=lDefaultPlanCustomPurchaseWithLifeinsure.length()>0
			if(!lIsOK){
				return lreturn
			}
			if(IGNUemaHelper.CURRENT_ENABLE_WRITE_REPORT_DETAIL_LIST){
				if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
					THAKumkaCancerResult_OutputUtil lOutputUtil=new THAKumkaCancerResult_OutputUtil(this.driver,this.selenium)
					lIsOK=lOutputUtil.outputListSave(true)
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('DefaultPlanPersonInfo',lDefaultPlanPersonInfo)
				lreturn.put('DefaultNumberOfCards',lDefaultNumberOfCards)
				lreturn.put('DefaultSortingPremiumMinMax',lDefaultSortingPremiumMinMax)
				lreturn.put('DefaultSortingSumInsuredMinMax',lDefaultSortingSumInsuredMinMax)
				lreturn.put('DefaultInsuranceCompany',lDefaultInsuranceCompany)
				lreturn.put('DefaultPlanCustomChemoTherapy',lDefaultPlanCustomChemoTherapy)
				lreturn.put('DefaultPlanCustomHospitalCash',lDefaultPlanCustomHospitalCash)
				lreturn.put('DefaultPlanCustomBenefitsPa',lDefaultPlanCustomBenefitsPa)
				lreturn.put('DefaultPlanCustomPurchaseWithLifeinsure',lDefaultPlanCustomPurchaseWithLifeinsure)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutputOfFiltered(){
		Map lreturn=[:]
		String lFilteredNumberOfCards=''
		String lFilteredSortingPremiumMinMax=''
		String lFilteredSortingSumInsuredMinMax=''
		String lFilteredInsuranceCompany=''
		String lFilteredPlanCustomChemoTherapy=''
		String lFilteredPlanCustomHospitalCash=''
		String lFilteredPlanCustomBenefitsPa=''
		String lFilteredPlanCustomPurchaseWithLifeinsure=''
		try{
			Boolean lResult=false
			lreturn.put('FilteredNumberOfCards','')
			lreturn.put('FilteredSortingPremiumMinMax','')
			lreturn.put('FilteredSortingSumInsuredMinMax','')
			lreturn.put('FilteredInsuranceCompany','')
			lreturn.put('FilteredPlanCustomChemoTherapy','')
			lreturn.put('FilteredPlanCustomHospitalCash','')
			lreturn.put('FilteredPlanCustomBenefitsPa','')
			lreturn.put('FilteredPlanCustomPurchaseWithLifeinsure','')
			lreturn.put('Result',lResult)
			this.closeAskToSaveEmailForm()
			Boolean lIsOK=false
			Integer lFilteredNumberOfCardsNum=0
			String lTagListOfCardResultList='card-plan'
			String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
			List<WebElement> lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
			if(lElementListOfCardResultList){
				lFilteredNumberOfCardsNum=lElementListOfCardResultList.size()
			}
			lFilteredNumberOfCards=lFilteredNumberOfCardsNum.toString()
			lIsOK=lFilteredNumberOfCards.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagSortingPremiumButton='sort-by-premium-ASC'
			String lLocatorSortingPremiumButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumButton)
			WebElement lElementSortingPremiumButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumButton)
			if(!lElementSortingPremiumButton){
				return lreturn
			}
			String lTagSortingSumInsuredButton='sort-by-sumInsured-DESC'
			String lLocatorSortingSumInsuredButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredButton)
			WebElement lElementSortingSumInsuredButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredButton)
			if(!lElementSortingSumInsuredButton){
				return lreturn
			}
			Boolean lIsFilterSortingByPremiumActive=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementSortingPremiumButton,'active')
			THAKumkaCancerCoreType.CURRENT_KUMKA_CANCER_RESULT_UTIL_FILTER_SORTING_BY_DEFAULT_PREMIUM=lIsFilterSortingByPremiumActive
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
			this.closeAskToSaveEmailForm()
			String lTagSortingPremiumTextMin='minPremium'
			String lLocatorSortingPremiumTextMin=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumTextMin)
			WebElement lElementSortingPremiumTextMin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumTextMin)
			if(!lElementSortingPremiumTextMin){
				return lreturn
			}
			String lTagSortingPremiumTextMax='maxPremium'
			String lLocatorSortingPremiumTextMax=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumTextMax)
			WebElement lElementSortingPremiumTextMax=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumTextMax)
			if(!lElementSortingPremiumTextMax){
				return lreturn
			}
			String lTextSortingPremiumTextMin=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingPremiumTextMin).trim()
			String lTextSortingPremiumTextMax=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingPremiumTextMax).trim()
			lFilteredSortingPremiumMinMax=IGNUemaHelper.concatMessageLeftRightByPipe(lTextSortingPremiumTextMin,lTextSortingPremiumTextMax)
			lIsOK=lFilteredSortingPremiumMinMax.length()>0
			if(!lIsOK){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingSumInsuredButton)
			this.closeAskToSaveEmailForm()
			String lTagSortingSumInsuredTextMin='minSumInsure'
			String lLocatorSortingSumInsuredTextMin=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredTextMin)
			WebElement lElementSortingSumInsuredTextMin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredTextMin)
			if(!lElementSortingSumInsuredTextMin){
				return lreturn
			}
			String lTagSortingSumInsuredTextMax='maxSumInsure'
			String lLocatorSortingSumInsuredTextMax=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredTextMax)
			WebElement lElementSortingSumInsuredTextMax=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredTextMax)
			if(!lElementSortingSumInsuredTextMax){
				return lreturn
			}
			String lTextSortingSumInsuredTextMin=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingSumInsuredTextMin).trim()
			String lTextSortingSumInsuredTextMax=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingSumInsuredTextMax).trim()
			lFilteredSortingSumInsuredMinMax=IGNUemaHelper.concatMessageLeftRightByPipe(lTextSortingSumInsuredTextMin,lTextSortingSumInsuredTextMax)
			lIsOK=lFilteredSortingSumInsuredMinMax.length()>0
			if(!lIsOK){
				return lreturn
			}
			if(lIsFilterSortingByPremiumActive){
				lElementSortingPremiumButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumButton)
				if(!lElementSortingPremiumButton){
					return lreturn
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
			}else{
				lElementSortingSumInsuredButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredButton)
				if(!lElementSortingSumInsuredButton){
					return lreturn
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
			}
			this.closeAskToSaveEmailForm()
			String lTagInsuranceCompanyParent='company-filter-multiselect'
			String lLocatorInsuranceCompanyParent=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuranceCompanyParent)
			WebElement lElementInsuranceCompanyParent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuranceCompanyParent)
			if(!lElementInsuranceCompanyParent){
				return lreturn
			}
			String lTagInsuranceCompanyText=''
			String lLocatorInsuranceCompanyText='.multiselect__tags-wrap'
			WebElement lElementInsuranceCompanyText=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementInsuranceCompanyParent,lLocatorInsuranceCompanyText,true)
			if(!lElementInsuranceCompanyText){
				return lreturn
			}
			lFilteredInsuranceCompany=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInsuranceCompanyText).trim()
			String lTagPlanCustomChemoTherapy='filter-coverage-chemotherapy'
			String lLocatorPlanCustomChemoTherapy=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomChemoTherapy)
			WebElement lElementPlanCustomChemoTherapy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomChemoTherapy)
			if(!lElementPlanCustomChemoTherapy){
				return lreturn
			}
			lFilteredPlanCustomChemoTherapy=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomChemoTherapy))
			lIsOK=lFilteredPlanCustomChemoTherapy.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagPlanCustomHospitalCash='filter-coverage-hospitalization'
			String lLocatorPlanCustomHospitalCash=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomHospitalCash)
			WebElement lElementPlanCustomHospitalCash=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomHospitalCash)
			if(!lElementPlanCustomHospitalCash){
				return lreturn
			}
			lFilteredPlanCustomHospitalCash=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomHospitalCash))
			lIsOK=lFilteredPlanCustomHospitalCash.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagPlanCustomBenefitsPa='filter-coverage-PA'
			String lLocatorPlanCustomBenefitsPa=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomBenefitsPa)
			WebElement lElementPlanCustomBenefitsPa=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomBenefitsPa)
			if(!lElementPlanCustomBenefitsPa){
				return lreturn
			}
			lFilteredPlanCustomBenefitsPa=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomBenefitsPa))
			lIsOK=lFilteredPlanCustomBenefitsPa.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagPlanCustomPurchaseWithLifeinsure='filter-coverage-lifeInsuranceRequired'
			String lLocatorPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomPurchaseWithLifeinsure)
			WebElement lElementPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomPurchaseWithLifeinsure)
			if(!lElementPlanCustomPurchaseWithLifeinsure){
				return lreturn
			}
			lFilteredPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertBooleanToYesNoString(IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomPurchaseWithLifeinsure))
			lIsOK=lFilteredPlanCustomPurchaseWithLifeinsure.length()>0
			if(!lIsOK){
				return lreturn
			}
			if(IGNUemaHelper.CURRENT_ENABLE_WRITE_REPORT_DETAIL_LIST){
				if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
					THAKumkaCancerResult_OutputUtil lOutputUtil=new THAKumkaCancerResult_OutputUtil(this.driver,this.selenium)
					lIsOK=lOutputUtil.outputListSave(false)
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('FilteredNumberOfCards',lFilteredNumberOfCards)
				lreturn.put('FilteredSortingPremiumMinMax',lFilteredSortingPremiumMinMax)
				lreturn.put('FilteredSortingSumInsuredMinMax',lFilteredSortingSumInsuredMinMax)
				lreturn.put('FilteredInsuranceCompany',lFilteredInsuranceCompany)
				lreturn.put('FilteredPlanCustomChemoTherapy',lFilteredPlanCustomChemoTherapy)
				lreturn.put('FilteredPlanCustomHospitalCash',lFilteredPlanCustomHospitalCash)
				lreturn.put('FilteredPlanCustomBenefitsPa',lFilteredPlanCustomBenefitsPa)
				lreturn.put('FilteredPlanCustomPurchaseWithLifeinsure',lFilteredPlanCustomPurchaseWithLifeinsure)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputApplyFilter(String strApplyFilter){
		Map lreturn=[:]
		String lApplyFilter=strApplyFilter.trim()
		if(lApplyFilter.length()<=0){
			lApplyFilter=THAKumkaCancerResultType.DEFAULT_APPLY_FILTER
		}
		try{
			Boolean lResult=false
			lreturn.put('ApplyFilter','')
			lreturn.put('Result',lResult)
			Boolean lIsApplyFilter=IGNUemaHelper.convertStringToBoolean(lApplyFilter)
			lApplyFilter=IGNUemaHelper.convertBooleanToString(lIsApplyFilter)
			lResult=lApplyFilter.length()>0
			if(lResult){
				lreturn.put('ApplyFilter',lApplyFilter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillPlanCustomChemoTherapy(String strFillPlanCustomChemoTherapy){
		Map lreturn=[:]
		String lFillPlanCustomChemoTherapy=strFillPlanCustomChemoTherapy.trim()
		if(lFillPlanCustomChemoTherapy.length()<=0){
			lFillPlanCustomChemoTherapy=THAKumkaCancerResultType.DEFAULT_FILL_PLAN_CUSTOM_CHEMO_THERAPY
		}
		try{
			Boolean lResult=false
			lreturn.put('FillPlanCustomChemoTherapy','')
			lreturn.put('Result',lResult)
			Boolean lIsFillPlanCustomChemoTherapy=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomChemoTherapy)
			lFillPlanCustomChemoTherapy=IGNUemaHelper.convertBooleanToString(lIsFillPlanCustomChemoTherapy)
			lResult=lFillPlanCustomChemoTherapy.length()>0
			if(lResult){
				lreturn.put('FillPlanCustomChemoTherapy',lFillPlanCustomChemoTherapy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanCustomChemoTherapy(String strPlanCustomChemoTherapy){
		Map lreturn=[:]
		String lPlanCustomChemoTherapy=strPlanCustomChemoTherapy.trim()
		if(lPlanCustomChemoTherapy.length()<=0){
			lPlanCustomChemoTherapy=THAKumkaCancerResultType.DEFAULT_PLAN_CUSTOM_CHEMO_THERAPY
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanCustomChemoTherapy','')
			lreturn.put('Result',lResult)
			Boolean lIsPlanCustomChemoTherapy=IGNUemaHelper.convertStringToBoolean(lPlanCustomChemoTherapy)
			lPlanCustomChemoTherapy=''
			String lTagPlanCustomChemoTherapyButton='filter-coverage-chemotherapy'
			String lLocatorPlanCustomChemoTherapyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomChemoTherapyButton)
			WebElement lElementPlanCustomChemoTherapy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomChemoTherapyButton)
			Boolean lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomChemoTherapy)
			if(lIsChecked){
				if(!lIsPlanCustomChemoTherapy){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomChemoTherapy)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomChemoTherapy)
				}
			}else{
				if(lIsPlanCustomChemoTherapy){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomChemoTherapy)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomChemoTherapy)
				}
			}
			lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomChemoTherapy)
			lPlanCustomChemoTherapy=IGNUemaHelper.convertBooleanToString(lIsChecked)
			lResult=lPlanCustomChemoTherapy.length()>0
			if(lResult){
				lreturn.put('PlanCustomChemoTherapy',lPlanCustomChemoTherapy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillPlanCustomHospitalCash(String strFillPlanCustomHospitalCash){
		Map lreturn=[:]
		String lFillPlanCustomHospitalCash=strFillPlanCustomHospitalCash.trim()
		if(lFillPlanCustomHospitalCash.length()<=0){
			lFillPlanCustomHospitalCash=THAKumkaCancerResultType.DEFAULT_FILL_PLAN_CUSTOM_HOSPITAL_CASH
		}
		try{
			Boolean lResult=false
			lreturn.put('FillPlanCustomHospitalCash','')
			lreturn.put('Result',lResult)
			Boolean lIsFillPlanCustomHospitalCash=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomHospitalCash)
			lFillPlanCustomHospitalCash=IGNUemaHelper.convertBooleanToString(lIsFillPlanCustomHospitalCash)
			lResult=lFillPlanCustomHospitalCash.length()>0
			if(lResult){
				lreturn.put('FillPlanCustomHospitalCash',lFillPlanCustomHospitalCash)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanCustomHospitalCash(String strPlanCustomHospitalCash){
		Map lreturn=[:]
		String lPlanCustomHospitalCash=strPlanCustomHospitalCash.trim()
		if(lPlanCustomHospitalCash.length()<=0){
			lPlanCustomHospitalCash=THAKumkaCancerResultType.DEFAULT_PLAN_CUSTOM_HOSPITAL_CASH
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanCustomHospitalCash','')
			lreturn.put('Result',lResult)
			Boolean lIsPlanCustomHospitalCash=IGNUemaHelper.convertStringToBoolean(lPlanCustomHospitalCash)
			lPlanCustomHospitalCash=''
			String lTagPlanCustomHospitalCashButton='filter-coverage-hospitalization'
			String lLocatorPlanCustomHospitalCashButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomHospitalCashButton)
			WebElement lElementPlanCustomHospitalCash=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomHospitalCashButton)
			Boolean lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomHospitalCash)
			if(lIsChecked){
				if(!lIsPlanCustomHospitalCash){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomHospitalCash)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomHospitalCash)
				}
			}else{
				if(lIsPlanCustomHospitalCash){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomHospitalCash)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomHospitalCash)
				}
			}
			lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomHospitalCash)
			lPlanCustomHospitalCash=IGNUemaHelper.convertBooleanToString(lIsChecked)
			lResult=lPlanCustomHospitalCash.length()>0
			if(lResult){
				lreturn.put('PlanCustomHospitalCash',lPlanCustomHospitalCash)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillPlanCustomBenefitsPa(String strFillPlanCustomBenefitsPa){
		Map lreturn=[:]
		String lFillPlanCustomBenefitsPa=strFillPlanCustomBenefitsPa.trim()
		if(lFillPlanCustomBenefitsPa.length()<=0){
			lFillPlanCustomBenefitsPa=THAKumkaCancerResultType.DEFAULT_FILL_PLAN_CUSTOM_BENEFITS_PA
		}
		try{
			Boolean lResult=false
			lreturn.put('FillPlanCustomBenefitsPa','')
			lreturn.put('Result',lResult)
			Boolean lIsFillPlanCustomBenefitsPa=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomBenefitsPa)
			lFillPlanCustomBenefitsPa=IGNUemaHelper.convertBooleanToString(lIsFillPlanCustomBenefitsPa)
			lResult=lFillPlanCustomBenefitsPa.length()>0
			if(lResult){
				lreturn.put('FillPlanCustomBenefitsPa',lFillPlanCustomBenefitsPa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanCustomBenefitsPa(String strPlanCustomBenefitsPa){
		Map lreturn=[:]
		String lPlanCustomBenefitsPa=strPlanCustomBenefitsPa.trim()
		if(lPlanCustomBenefitsPa.length()<=0){
			lPlanCustomBenefitsPa=THAKumkaCancerResultType.DEFAULT_PLAN_CUSTOM_BENEFITS_PA
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanCustomBenefitsPa','')
			lreturn.put('Result',lResult)
			Boolean lIsPlanCustomBenefitsPa=IGNUemaHelper.convertStringToBoolean(lPlanCustomBenefitsPa)
			lPlanCustomBenefitsPa=''
			String lTagPlanCustomBenefitsPaButton='filter-coverage-PA'
			String lLocatorPlanCustomBenefitsPaButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomBenefitsPaButton)
			WebElement lElementPlanCustomBenefitsPa=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomBenefitsPaButton)
			Boolean lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomBenefitsPa)
			if(lIsChecked){
				if(!lIsPlanCustomBenefitsPa){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomBenefitsPa)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomBenefitsPa)
				}
			}else{
				if(lIsPlanCustomBenefitsPa){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomBenefitsPa)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomBenefitsPa)
				}
			}
			lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomBenefitsPa)
			lPlanCustomBenefitsPa=IGNUemaHelper.convertBooleanToString(lIsChecked)
			lResult=lPlanCustomBenefitsPa.length()>0
			if(lResult){
				lreturn.put('PlanCustomBenefitsPa',lPlanCustomBenefitsPa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillPlanCustomPurchaseWithLifeinsure(String strFillPlanCustomPurchaseWithLifeinsure){
		Map lreturn=[:]
		String lFillPlanCustomPurchaseWithLifeinsure=strFillPlanCustomPurchaseWithLifeinsure.trim()
		if(lFillPlanCustomPurchaseWithLifeinsure.length()<=0){
			lFillPlanCustomPurchaseWithLifeinsure=THAKumkaCancerResultType.DEFAULT_FILL_PLAN_CUSTOM_PURCHASE_WITH_LIFEINSURE
		}
		try{
			Boolean lResult=false
			lreturn.put('FillPlanCustomPurchaseWithLifeinsure','')
			lreturn.put('Result',lResult)
			Boolean lIsFillPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertStringToBoolean(lFillPlanCustomPurchaseWithLifeinsure)
			lFillPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertBooleanToString(lIsFillPlanCustomPurchaseWithLifeinsure)
			lResult=lFillPlanCustomPurchaseWithLifeinsure.length()>0
			if(lResult){
				lreturn.put('FillPlanCustomPurchaseWithLifeinsure',lFillPlanCustomPurchaseWithLifeinsure)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanCustomPurchaseWithLifeinsure(String strPlanCustomPurchaseWithLifeinsure){
		Map lreturn=[:]
		String lPlanCustomPurchaseWithLifeinsure=strPlanCustomPurchaseWithLifeinsure.trim()
		if(lPlanCustomPurchaseWithLifeinsure.length()<=0){
			lPlanCustomPurchaseWithLifeinsure=THAKumkaCancerResultType.DEFAULT_PLAN_CUSTOM_PURCHASE_WITH_LIFEINSURE
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanCustomPurchaseWithLifeinsure','')
			lreturn.put('Result',lResult)
			Boolean lIsPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertStringToBoolean(lPlanCustomPurchaseWithLifeinsure)
			lPlanCustomPurchaseWithLifeinsure=''
			String lTagPlanCustomPurchaseWithLifeinsureButton='filter-coverage-lifeInsuranceRequired'
			String lLocatorPlanCustomPurchaseWithLifeinsureButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanCustomPurchaseWithLifeinsureButton)
			WebElement lElementPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPlanCustomPurchaseWithLifeinsureButton)
			Boolean lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomPurchaseWithLifeinsure)
			if(lIsChecked){
				if(!lIsPlanCustomPurchaseWithLifeinsure){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomPurchaseWithLifeinsure)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomPurchaseWithLifeinsure)
				}
			}else{
				if(lIsPlanCustomPurchaseWithLifeinsure){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPlanCustomPurchaseWithLifeinsure)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPlanCustomPurchaseWithLifeinsure)
				}
			}
			lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPlanCustomPurchaseWithLifeinsure)
			lPlanCustomPurchaseWithLifeinsure=IGNUemaHelper.convertBooleanToString(lIsChecked)
			lResult=lPlanCustomPurchaseWithLifeinsure.length()>0
			if(lResult){
				lreturn.put('PlanCustomPurchaseWithLifeinsure',lPlanCustomPurchaseWithLifeinsure)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillSortingBy(String strFillSortingBy){
		Map lreturn=[:]
		String lFillSortingBy=strFillSortingBy.trim()
		if(lFillSortingBy.length()<=0){
			lFillSortingBy=THAKumkaCancerResultType.DEFAULT_FILL_SORTING_BY
		}
		try{
			Boolean lResult=false
			lreturn.put('FillSortingBy','')
			lreturn.put('Result',lResult)
			Boolean lIsFillSortingBy=IGNUemaHelper.convertStringToBoolean(lFillSortingBy)
			lFillSortingBy=IGNUemaHelper.convertBooleanToString(lIsFillSortingBy)
			lResult=lFillSortingBy.length()>0
			if(lResult){
				lreturn.put('FillSortingBy',lFillSortingBy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillSortingPremiumMinMax(String strFillSortingPremiumMinMax,String strSortingPremiumMin,String strSortingPremiumMax){
		Map lreturn=[:]
		String lFillSortingPremiumMinMax=strFillSortingPremiumMinMax.trim()
		if(lFillSortingPremiumMinMax.length()<=0){
			lFillSortingPremiumMinMax=THAKumkaCancerResultType.DEFAULT_FILL_SORTING_PREMIUM_MIN_MAX
		}
		String lSortingPremiumMin=strSortingPremiumMin.trim()
		if(lSortingPremiumMin.length()<=0){
			lSortingPremiumMin=THAKumkaCancerResultType.DEFAULT_SORTING_PREMIUM_MIN
		}
		String lSortingPremiumMax=strSortingPremiumMax.trim()
		if(lSortingPremiumMax.length()<=0){
			lSortingPremiumMax=THAKumkaCancerResultType.DEFAULT_SORTING_PREMIUM_MAX
		}
		Integer lSortingPremiumDefaultMin=0
		Integer lSortingPremiumDefaultMax=11
		Integer lSortingPremiumMinNum=lSortingPremiumDefaultMin
		Integer lSortingPremiumMaxNum=lSortingPremiumDefaultMax
		try{
			Boolean lResult=false
			lreturn.put('FillSortingPremiumMinMax','')
			lreturn.put('SortingPremiumMin','')
			lreturn.put('SortingPremiumMax','')
			lreturn.put('Result',lResult)
			Boolean lIsFillSortingPremiumMinMax=IGNUemaHelper.convertStringToBoolean(lFillSortingPremiumMinMax)
			lFillSortingPremiumMinMax=''
			Integer lSortingPremiumMinItem=IGNUemaHelper.convertStringToInteger(lSortingPremiumMin,lSortingPremiumDefaultMin)
			lSortingPremiumMin=''
			if((lSortingPremiumMinItem<lSortingPremiumDefaultMin)||(lSortingPremiumMinItem>lSortingPremiumDefaultMax)){
				lSortingPremiumMinItem=lSortingPremiumDefaultMin
			}
			Integer lSortingPremiumMaxItem=IGNUemaHelper.convertStringToInteger(lSortingPremiumMax,lSortingPremiumDefaultMax)
			lSortingPremiumMax=''
			if((lSortingPremiumMaxItem<lSortingPremiumDefaultMin)||(lSortingPremiumMaxItem>lSortingPremiumDefaultMax)){
				lSortingPremiumMaxItem=lSortingPremiumDefaultMax
			}
			if(lSortingPremiumMinItem>lSortingPremiumMaxItem){
				lSortingPremiumMinNum=lSortingPremiumMaxItem
				lSortingPremiumMaxNum=lSortingPremiumMinItem
			}else{
				lSortingPremiumMinNum=lSortingPremiumMinItem
				lSortingPremiumMaxNum=lSortingPremiumMaxItem
			}
			String lTagSortingPremiumButton='sort-by-premium-ASC'
			String lLocatorSortingPremiumButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumButton)
			WebElement lElementSortingPremiumButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumButton)
			if(!lElementSortingPremiumButton){
				lIsFillSortingPremiumMinMax=false
			}
			Boolean lIsOK=false
			if(lIsFillSortingPremiumMinMax){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingPremiumButton)
				this.closeAskToSaveEmailForm()
				String lTagSortingPremiumSliderParentDiv='filter-by-price'
				String lLocatorSortingPremiumSliderParentDiv=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumSliderParentDiv)
				WebElement lElementSortingPremiumSliderParentDiv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumSliderParentDiv)
				if(lElementSortingPremiumSliderParentDiv){
					String lTagSortingPremiumSliderWrapper=''
					String lLocatorSortingPremiumSliderWrapper='.slider-wrapper'
					WebElement lElementSortingPremiumSliderWrapper=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementSortingPremiumSliderParentDiv,lLocatorSortingPremiumSliderWrapper,true)
					if(lElementSortingPremiumSliderWrapper){
						lIsOK=IGNUemaHelper.selectSliderTrackByLocatorV4(this.driver,lElementSortingPremiumSliderWrapper,lSortingPremiumMinNum,lSortingPremiumMaxNum)
					}
				}
				String lTagSortingPremiumTextMin='minPremium'
				String lLocatorSortingPremiumTextMin=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumTextMin)
				WebElement lElementSortingPremiumTextMin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumTextMin)
				if(lElementSortingPremiumTextMin){
					lSortingPremiumMin=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingPremiumTextMin).trim()
				}
				String lTagSortingPremiumTextMax='maxPremium'
				String lLocatorSortingPremiumTextMax=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingPremiumTextMax)
				WebElement lElementSortingPremiumTextMax=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingPremiumTextMax)
				if(lElementSortingPremiumTextMax){
					lSortingPremiumMax=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingPremiumTextMax).trim()
				}
				this.closeAskToSaveEmailForm()
				lIsOK=lIsOK&&(lSortingPremiumMin.length()>0)&&(lSortingPremiumMax.length()>0)
			}
			lFillSortingPremiumMinMax=IGNUemaHelper.convertBooleanToYesNoString(lIsFillSortingPremiumMinMax)
			if(!lIsFillSortingPremiumMinMax){
				lIsOK=true
				lSortingPremiumMin=''
				lSortingPremiumMax=''
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('FillSortingPremiumMinMax',lFillSortingPremiumMinMax)
				lreturn.put('SortingPremiumMin',lSortingPremiumMin)
				lreturn.put('SortingPremiumMax',lSortingPremiumMax)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillSortingSumInsuredMinMax(String strFillSortingSumInsuredMinMax,String strSortingSumInsuredMin,String strSortingSumInsuredMax){
		Map lreturn=[:]
		String lFillSortingSumInsuredMinMax=strFillSortingSumInsuredMinMax.trim()
		if(lFillSortingSumInsuredMinMax.length()<=0){
			lFillSortingSumInsuredMinMax=THAKumkaCancerResultType.DEFAULT_FILL_SORTING_SUM_INSURED_MIN_MAX
		}
		String lSortingSumInsuredMin=strSortingSumInsuredMin.trim()
		if(lSortingSumInsuredMin.length()<=0){
			lSortingSumInsuredMin=THAKumkaCancerResultType.DEFAULT_SORTING_SUM_INSURED_MIN
		}
		String lSortingSumInsuredMax=strSortingSumInsuredMax.trim()
		if(lSortingSumInsuredMax.length()<=0){
			lSortingSumInsuredMax=THAKumkaCancerResultType.DEFAULT_SORTING_SUM_INSURED_MAX
		}
		Integer lSortingSumInsuredDefaultMin=0
		Integer lSortingSumInsuredDefaultMax=11
		Integer lSortingSumInsuredMinNum=lSortingSumInsuredDefaultMin
		Integer lSortingSumInsuredMaxNum=lSortingSumInsuredDefaultMax
		try{
			Boolean lResult=false
			lreturn.put('FillSortingSumInsuredMinMax','')
			lreturn.put('SortingSumInsuredMin','')
			lreturn.put('SortingSumInsuredMax','')
			lreturn.put('Result',lResult)
			Boolean lIsFillSortingSumInsuredMinMax=IGNUemaHelper.convertStringToBoolean(lFillSortingSumInsuredMinMax)
			lFillSortingSumInsuredMinMax=''
			Integer lSortingSumInsuredMinItem=IGNUemaHelper.convertStringToInteger(lSortingSumInsuredMin,lSortingSumInsuredDefaultMin)
			lSortingSumInsuredMin=''
			if((lSortingSumInsuredMinItem<lSortingSumInsuredDefaultMin)||(lSortingSumInsuredMinItem>lSortingSumInsuredDefaultMax)){
				lSortingSumInsuredMinItem=lSortingSumInsuredDefaultMin
			}
			Integer lSortingSumInsuredMaxItem=IGNUemaHelper.convertStringToInteger(lSortingSumInsuredMax,lSortingSumInsuredDefaultMax)
			lSortingSumInsuredMax=''
			if((lSortingSumInsuredMaxItem<lSortingSumInsuredDefaultMin)||(lSortingSumInsuredMaxItem>lSortingSumInsuredDefaultMax)){
				lSortingSumInsuredMaxItem=lSortingSumInsuredDefaultMax
			}
			if(lSortingSumInsuredMinItem>lSortingSumInsuredMaxItem){
				lSortingSumInsuredMinNum=lSortingSumInsuredMaxItem
				lSortingSumInsuredMaxNum=lSortingSumInsuredMinItem
			}else{
				lSortingSumInsuredMinNum=lSortingSumInsuredMinItem
				lSortingSumInsuredMaxNum=lSortingSumInsuredMaxItem
			}
			String lTagSortingSumInsuredButton='sort-by-sumInsured-DESC'
			String lLocatorSortingSumInsuredButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredButton)
			WebElement lElementSortingSumInsuredButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredButton)
			if(!lElementSortingSumInsuredButton){
				lIsFillSortingSumInsuredMinMax=false
			}
			Boolean lIsOK=false
			if(lIsFillSortingSumInsuredMinMax){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSortingSumInsuredButton)
				this.closeAskToSaveEmailForm()
				String lTagSortingSumInsuredSliderParentDiv='filter-by-suminsure'
				String lLocatorSortingSumInsuredSliderParentDiv=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredSliderParentDiv)
				WebElement lElementSortingSumInsuredSliderParentDiv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredSliderParentDiv)
				if(lElementSortingSumInsuredSliderParentDiv){
					String lTagSortingSumInsuredSliderWrapper=''
					String lLocatorSortingSumInsuredSliderWrapper='.slider-wrapper'
					WebElement lElementSortingSumInsuredSliderWrapper=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementSortingSumInsuredSliderParentDiv,lLocatorSortingSumInsuredSliderWrapper,true)
					if(lElementSortingSumInsuredSliderWrapper){
						lIsOK=IGNUemaHelper.selectSliderTrackByLocatorV4(this.driver,lElementSortingSumInsuredSliderWrapper,lSortingSumInsuredMinNum,lSortingSumInsuredMaxNum)
					}
				}
				String lTagSortingSumInsuredTextMin='minSumInsure'
				String lLocatorSortingSumInsuredTextMin=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredTextMin)
				WebElement lElementSortingSumInsuredTextMin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredTextMin)
				if(lElementSortingSumInsuredTextMin){
					lSortingSumInsuredMin=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingSumInsuredTextMin).trim()
				}
				String lTagSortingSumInsuredTextMax='maxSumInsure'
				String lLocatorSortingSumInsuredTextMax=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingSumInsuredTextMax)
				WebElement lElementSortingSumInsuredTextMax=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSortingSumInsuredTextMax)
				if(lElementSortingSumInsuredTextMax){
					lSortingSumInsuredMax=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingSumInsuredTextMax).trim()
				}
				this.closeAskToSaveEmailForm()
				lIsOK=lIsOK&&(lSortingSumInsuredMin.length()>0)&&(lSortingSumInsuredMax.length()>0)
			}
			lFillSortingSumInsuredMinMax=IGNUemaHelper.convertBooleanToYesNoString(lIsFillSortingSumInsuredMinMax)
			if(!lIsFillSortingSumInsuredMinMax){
				lIsOK=true
				lSortingSumInsuredMin=''
				lSortingSumInsuredMax=''
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('FillSortingSumInsuredMinMax',lFillSortingSumInsuredMinMax)
				lreturn.put('SortingSumInsuredMin',lSortingSumInsuredMin)
				lreturn.put('SortingSumInsuredMax',lSortingSumInsuredMax)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillInsuranceCompany(String strFillInsuranceCompany){
		Map lreturn=[:]
		String lFillInsuranceCompany=strFillInsuranceCompany.trim()
		if(lFillInsuranceCompany.length()<=0){
			lFillInsuranceCompany=THAKumkaCancerResultType.DEFAULT_FILL_INSURANCE_COMPANY
		}
		try{
			Boolean lResult=false
			lreturn.put('FillInsuranceCompany','')
			lreturn.put('Result',lResult)
			Boolean lIsFillInsuranceCompany=IGNUemaHelper.convertStringToBoolean(lFillInsuranceCompany)
			lFillInsuranceCompany=IGNUemaHelper.convertBooleanToString(lIsFillInsuranceCompany)
			lResult=lFillInsuranceCompany.length()>0
			if(lResult){
				lreturn.put('FillInsuranceCompany',lFillInsuranceCompany)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillInsuranceCompanyA(String strFillInsuranceCompanyA,String strInsuranceCompanyA){
		Map lreturn=[:]
		String lFillInsuranceCompanyA=strFillInsuranceCompanyA.trim()
		if(lFillInsuranceCompanyA.length()<=0){
			lFillInsuranceCompanyA=THAKumkaCancerResultType.DEFAULT_FILL_INSURANCE_COMPANY_A
		}
		String lInsuranceCompanyA=strInsuranceCompanyA.trim()
		if(lInsuranceCompanyA.length()<=0){
			lInsuranceCompanyA=THAKumkaCancerResultType.DEFAULT_INSURANCE_COMPANY_A
		}
		try{
			Boolean lResult=false
			lreturn.put('FillInsuranceCompanyA','')
			lreturn.put('InsuranceCompanyA','')
			lreturn.put('Result',lResult)
			Boolean lIsFillInsuranceCompanyA=IGNUemaHelper.convertStringToBoolean(lFillInsuranceCompanyA)
			if(lInsuranceCompanyA.length()<=0){
				lIsFillInsuranceCompanyA=false
			}
			String lTagInsuranceCompanyParentDiv='company-filter-multiselect'
			String lLocatorInsuranceCompanyParentDiv=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuranceCompanyParentDiv)
			WebElement lElementInsuranceCompanyParentDiv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuranceCompanyParentDiv)
			if(!lElementInsuranceCompanyParentDiv){
				lIsFillInsuranceCompanyA=false
			}
			Boolean lIsOK=false
			if(lIsFillInsuranceCompanyA){
				this.closeAskToSaveEmailForm()
				String lLocatorInsuranceCompanyFilterRootSelect='.multiselect__content-wrapper'
				WebElement lElementInsuranceCompanyFilterRootSelect=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementInsuranceCompanyParentDiv,lLocatorInsuranceCompanyFilterRootSelect,true)
				if(!lElementInsuranceCompanyFilterRootSelect){
					return lreturn
				}
				List<WebElement> lInsurerInsuranceCompanyFilterList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementInsuranceCompanyFilterRootSelect,'ul li span')
				if(lInsurerInsuranceCompanyFilterList){
					if(lInsurerInsuranceCompanyFilterList.size()>0){
						String lTextFind=''
						String lTextDisplayed=''
						lTextFind=lInsuranceCompanyA.toLowerCase()
						lInsuranceCompanyA=''
						if(lTextFind.length()>0){
							lTextDisplayed=''
							for(WebElement lInsurerInsuranceCompanyFilterItem in lInsurerInsuranceCompanyFilterList){
								lTextDisplayed=IGNUemaHelper.getChildTextByWebElement(this.driver,lInsurerInsuranceCompanyFilterItem)
								lTextDisplayed=lTextDisplayed.toLowerCase().trim()
								if(lTextDisplayed.length()>0){
									if(lTextDisplayed.contains(lTextFind)){
										lInsuranceCompanyA=IGNUemaHelper.getChildTextByWebElement(this.driver,lInsurerInsuranceCompanyFilterItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lInsurerInsuranceCompanyFilterItem)
										break
									}
								}
							}
						}
						lIsOK=lInsuranceCompanyA.length()>0
					}
				}
				this.closeAskToSaveEmailForm()
			}
			lFillInsuranceCompanyA=IGNUemaHelper.convertBooleanToYesNoString(lIsFillInsuranceCompanyA)
			if(!lIsFillInsuranceCompanyA){
				lIsOK=true
				lInsuranceCompanyA=''
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('FillInsuranceCompanyA',lFillInsuranceCompanyA)
				lreturn.put('InsuranceCompanyA',lInsuranceCompanyA)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillInsuranceCompanyB(String strFillInsuranceCompanyB,String strInsuranceCompanyB){
		Map lreturn=[:]
		String lFillInsuranceCompanyB=strFillInsuranceCompanyB.trim()
		if(lFillInsuranceCompanyB.length()<=0){
			lFillInsuranceCompanyB=THAKumkaCancerResultType.DEFAULT_FILL_INSURANCE_COMPANY_B
		}
		String lInsuranceCompanyB=strInsuranceCompanyB.trim()
		if(lInsuranceCompanyB.length()<=0){
			lInsuranceCompanyB=THAKumkaCancerResultType.DEFAULT_INSURANCE_COMPANY_B
		}
		try{
			Boolean lResult=false
			lreturn.put('FillInsuranceCompanyB','')
			lreturn.put('InsuranceCompanyB','')
			lreturn.put('Result',lResult)
			Boolean lIsFillInsuranceCompanyB=IGNUemaHelper.convertStringToBoolean(lFillInsuranceCompanyB)
			if(lInsuranceCompanyB.length()<=0){
				lIsFillInsuranceCompanyB=false
			}
			String lTagInsuranceCompanyParentDiv='company-filter-multiselect'
			String lLocatorInsuranceCompanyParentDiv=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuranceCompanyParentDiv)
			WebElement lElementInsuranceCompanyParentDiv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuranceCompanyParentDiv)
			if(!lElementInsuranceCompanyParentDiv){
				lIsFillInsuranceCompanyB=false
			}
			Boolean lIsOK=false
			if(lIsFillInsuranceCompanyB){
				this.closeAskToSaveEmailForm()
				String lLocatorInsuranceCompanyFilterRootSelect='.multiselect__content-wrapper'
				WebElement lElementInsuranceCompanyFilterRootSelect=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementInsuranceCompanyParentDiv,lLocatorInsuranceCompanyFilterRootSelect,true)
				if(!lElementInsuranceCompanyFilterRootSelect){
					return lreturn
				}
				List<WebElement> lInsurerInsuranceCompanyFilterList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementInsuranceCompanyFilterRootSelect,'ul li span')
				if(lInsurerInsuranceCompanyFilterList){
					if(lInsurerInsuranceCompanyFilterList.size()>0){
						String lTextFind=''
						String lTextDisplayed=''
						lTextFind=lInsuranceCompanyB.toLowerCase()
						lInsuranceCompanyB=''
						if(lTextFind.length()>0){
							lTextDisplayed=''
							for(WebElement lInsurerInsuranceCompanyFilterItem in lInsurerInsuranceCompanyFilterList){
								lTextDisplayed=IGNUemaHelper.getChildTextByWebElement(this.driver,lInsurerInsuranceCompanyFilterItem)
								lTextDisplayed=lTextDisplayed.toLowerCase().trim()
								if(lTextDisplayed.length()>0){
									if(lTextDisplayed.contains(lTextFind)){
										lInsuranceCompanyB=IGNUemaHelper.getChildTextByWebElement(this.driver,lInsurerInsuranceCompanyFilterItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lInsurerInsuranceCompanyFilterItem)
										break
									}
								}
							}
						}
						lIsOK=lInsuranceCompanyB.length()>0
					}
				}
				this.closeAskToSaveEmailForm()
			}
			lFillInsuranceCompanyB=IGNUemaHelper.convertBooleanToYesNoString(lIsFillInsuranceCompanyB)
			if(!lIsFillInsuranceCompanyB){
				lIsOK=true
				lInsuranceCompanyB=''
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('FillInsuranceCompanyB',lFillInsuranceCompanyB)
				lreturn.put('InsuranceCompanyB',lInsuranceCompanyB)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundSave(Boolean isPositiveCase,String strOutboundSave,String strOutboundPrefixName,String strOutboundName,String strOutboundSurname,String strOutboundMobileNumber,String strOutboundFillEmailAddress,String strOutboundEmailAddress,String strOutboundCallBackTime,String strOutboundAcceptTermAndCondition){
		Map lreturn=[:]
		String lOutboundSave=strOutboundSave.trim()
		if(lOutboundSave.length()<=0){
			lOutboundSave=THAKumkaCancerResultType.DEFAULT_OUTBOUND_SAVE
		}
		String lOutboundPrefixName=strOutboundPrefixName.trim()
		if(lOutboundPrefixName.length()<=0){
			lOutboundPrefixName=THAKumkaCancerResultType.DEFAULT_OUTBOUND_PREFIX_NAME
		}
		String lOutboundName=strOutboundName.trim()
		if(lOutboundName.length()<=0){
			lOutboundName=THAKumkaCancerResultType.DEFAULT_OUTBOUND_NAME
		}
		String lOutboundSurname=strOutboundSurname.trim()
		if(lOutboundSurname.length()<=0){
			lOutboundSurname=THAKumkaCancerResultType.DEFAULT_OUTBOUND_SURNAME
		}
		String lOutboundMobileNumber=strOutboundMobileNumber.trim()
		if(lOutboundMobileNumber.length()<=0){
			lOutboundMobileNumber=THAKumkaCancerResultType.DEFAULT_OUTBOUND_MOBILE_NUMBER
		}
		String lOutboundFillEmailAddress=strOutboundFillEmailAddress.trim()
		if(lOutboundFillEmailAddress.length()<=0){
			lOutboundFillEmailAddress=THAKumkaCancerResultType.DEFAULT_OUTBOUND_FILL_EMAIL_ADDRESS
		}
		String lOutboundEmailAddress=strOutboundEmailAddress.trim()
		if(lOutboundEmailAddress.length()<=0){
			lOutboundEmailAddress=THAKumkaCancerResultType.DEFAULT_OUTBOUND_EMAIL_ADDRESS
		}
		String lOutboundCallBackTime=strOutboundCallBackTime.trim()
		if(lOutboundCallBackTime.length()<=0){
			lOutboundCallBackTime=THAKumkaCancerResultType.DEFAULT_OUTBOUND_CALL_BACK_TIME
		}
		String lOutboundAcceptTermAndCondition=strOutboundAcceptTermAndCondition.trim()
		if(lOutboundAcceptTermAndCondition.length()<=0){
			lOutboundAcceptTermAndCondition=THAKumkaCancerResultType.DEFAULT_OUTBOUND_ACCEPT_TERM_AND_CONDITION
		}
		String lOutboundCpcFormMoreCardDisplayPlanId=''
		String lOutboundCpcFormMoreCardPlanType=''
		String lOutboundCpcFormMoreCardPlanPartnerName=''
		String lOutboundCpcFormMoreCardPlanName=''
		String lOutboundCpcFormMoreCardPlanCoverage=''
		String lOutboundCpcFormMoreCardPlanPaymentOptionAmount=''
		String lOutboundCpcFormMoreCardPlanPaymentInstalment=''
		String lOutboundCpcFormMoreCardModalPaymentInstalment=''
		String lOutboundCpcFormMoreCardPlanTaxDeduct=''
		String lOutboundCpcFormMoreCardPlanChemoTherapy=''
		String lOutboundCpcFormMoreCardPlanHospitalCash=''
		String lOutboundCpcFormMoreCardPlanBenefitsPa=''
		String lOutboundCpcFormMoreCardPlanRenew=''
		String lOutboundCpcFormMoreCardPlanActive=''
		String lOutboundCpcFormMoreCardPlanWait=''
		String lOutboundCpcFormMoreCardPromoText=''
		String lOutboundCpcFormMoreOutboundButtonName=''
		String lOutboundCpcFormMoreCardDetailPartnerName=''
		String lOutboundCpcFormMoreCardDetailPlanName=''
		String lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCpcFormMoreCardDetailIsCoverOpd=''
		String lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender=''
		String lOutboundCpcFormMoreCardDetailIsOtherCovid=''
		String lOutboundCpcFormMoreCardDetailTermAndCondition=''
		String lOutboundCpcFormMorePlanResultText=''
		String lOutboundCpcCardDisplayPlanId=''
		String lOutboundCpcCardPlanType=''
		String lOutboundCpcCardPlanPartnerName=''
		String lOutboundCpcCardPlanName=''
		String lOutboundCpcCardPlanCoverage=''
		String lOutboundCpcCardPlanPaymentOptionAmount=''
		String lOutboundCpcCardPlanPaymentInstalment=''
		String lOutboundCpcCardModalPaymentInstalment=''
		String lOutboundCpcCardPlanTaxDeduct=''
		String lOutboundCpcCardPlanChemoTherapy=''
		String lOutboundCpcCardPlanHospitalCash=''
		String lOutboundCpcCardPlanBenefitsPa=''
		String lOutboundCpcCardPlanRenew=''
		String lOutboundCpcCardPlanActive=''
		String lOutboundCpcCardPlanWait=''
		String lOutboundCpcCardPromoText=''
		String lOutboundCpcOutboundButtonName=''
		String lOutboundCpcCardDetailPartnerName=''
		String lOutboundCpcCardDetailPlanName=''
		String lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCpcCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCpcCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCpcCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCpcCardDetailIsCoverOpd=''
		String lOutboundCpcCardDetailIsAddBenefitsForGender=''
		String lOutboundCpcCardDetailIsOtherCovid=''
		String lOutboundCpcCardDetailTermAndCondition=''
		String lOutboundCpcOutboundPlanResultText=''
		String lOutboundCplFormMoreCardDisplayPlanId=''
		String lOutboundCplFormMoreCardPlanType=''
		String lOutboundCplFormMoreCardPlanPartnerName=''
		String lOutboundCplFormMoreCardPlanName=''
		String lOutboundCplFormMoreCardPlanCoverage=''
		String lOutboundCplFormMoreCardPlanPaymentOptionAmount=''
		String lOutboundCplFormMoreCardPlanPaymentInstalment=''
		String lOutboundCplFormMoreCardModalPaymentInstalment=''
		String lOutboundCplFormMoreCardPlanTaxDeduct=''
		String lOutboundCplFormMoreCardPlanChemoTherapy=''
		String lOutboundCplFormMoreCardPlanHospitalCash=''
		String lOutboundCplFormMoreCardPlanBenefitsPa=''
		String lOutboundCplFormMoreCardPlanRenew=''
		String lOutboundCplFormMoreCardPlanActive=''
		String lOutboundCplFormMoreCardPlanWait=''
		String lOutboundCplFormMoreCardPromoText=''
		String lOutboundCplFormMoreOutboundButtonName=''
		String lOutboundCplFormMoreCardDetailPartnerName=''
		String lOutboundCplFormMoreCardDetailPlanName=''
		String lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCplFormMoreCardDetailIsCoverOpd=''
		String lOutboundCplFormMoreCardDetailIsAddBenefitsForGender=''
		String lOutboundCplFormMoreCardDetailIsOtherCovid=''
		String lOutboundCplFormMoreCardDetailTermAndCondition=''
		String lOutboundCplPopupFormCardDisplayPlanId=''
		String lOutboundCplPopupFormCardPlanType=''
		String lOutboundCplPopupFormCardPlanPartnerName=''
		String lOutboundCplPopupFormCardPlanName=''
		String lOutboundCplPopupFormCardPlanCoverage=''
		String lOutboundCplPopupFormCardPlanPaymentOptionAmount=''
		String lOutboundCplPopupFormCardPlanPaymentInstalment=''
		String lOutboundCplPopupFormCardModalPaymentInstalment=''
		String lOutboundCplPopupFormCardPlanTaxDeduct=''
		String lOutboundCplPopupFormCardPlanChemoTherapy=''
		String lOutboundCplPopupFormCardPlanHospitalCash=''
		String lOutboundCplPopupFormCardPlanBenefitsPa=''
		String lOutboundCplPopupFormCardPlanRenew=''
		String lOutboundCplPopupFormCardPlanActive=''
		String lOutboundCplPopupFormCardPlanWait=''
		String lOutboundCplPopupFormCardPromoText=''
		String lOutboundCplPopupFormOutboundButtonName=''
		String lOutboundCplPopupFormCardDetailPartnerName=''
		String lOutboundCplPopupFormCardDetailPlanName=''
		String lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer=''
		String lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer=''
		String lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee=''
		String lOutboundCplPopupFormCardDetailIsCoverOpd=''
		String lOutboundCplPopupFormCardDetailIsAddBenefitsForGender=''
		String lOutboundCplPopupFormCardDetailIsOtherCovid=''
		String lOutboundCplPopupFormCardDetailTermAndCondition=''
		try{
			Boolean lResult=false
			lreturn.put('OutboundSave','')
			lreturn.put('OutboundPrefixName','')
			lreturn.put('OutboundName','')
			lreturn.put('OutboundSurname','')
			lreturn.put('OutboundMobileNumber','')
			lreturn.put('OutboundFillEmailAddress','')
			lreturn.put('OutboundEmailAddres','')
			lreturn.put('OutboundCallBackTime','')
			lreturn.put('OutboundAcceptTermAndCondition','')
			lreturn.put('OutboundCpcFormMoreCardDisplayPlanId','')
			lreturn.put('OutboundCpcFormMoreCardPlanType','')
			lreturn.put('OutboundCpcFormMoreCardPlanPartnerName','')
			lreturn.put('OutboundCpcFormMoreCardPlanName','')
			lreturn.put('OutboundCpcFormMoreCardPlanCoverage','')
			lreturn.put('OutboundCpcFormMoreCardPlanPaymentOptionAmount','')
			lreturn.put('OutboundCpcFormMoreCardPlanPaymentInstalment','')
			lreturn.put('OutboundCpcFormMoreCardModalPaymentInstalment','')
			lreturn.put('OutboundCpcFormMoreCardPlanTaxDeduct','')
			lreturn.put('OutboundCpcFormMoreCardPlanChemoTherapy','')
			lreturn.put('OutboundCpcFormMoreCardPlanHospitalCash','')
			lreturn.put('OutboundCpcFormMoreCardPlanBenefitsPa','')
			lreturn.put('OutboundCpcFormMoreCardPlanRenew','')
			lreturn.put('OutboundCpcFormMoreCardPlanActive','')
			lreturn.put('OutboundCpcFormMoreCardPlanWait','')
			lreturn.put('OutboundCpcFormMoreCardPromoText','')
			lreturn.put('OutboundCpcFormMoreOutboundButtonName','')
			lreturn.put('OutboundCpcFormMoreCardDetailPartnerName','')
			lreturn.put('OutboundCpcFormMoreCardDetailPlanName','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsCoverOpd','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsForGender','')
			lreturn.put('OutboundCpcFormMoreCardDetailIsOtherCovid','')
			lreturn.put('OutboundCpcFormMoreCardDetailTermAndCondition','')
			lreturn.put('OutboundCpcFormMorePlanResultText','')
			lreturn.put('OutboundCpcCardDisplayPlanId','')
			lreturn.put('OutboundCpcCardPlanType','')
			lreturn.put('OutboundCpcCardPlanPartnerName','')
			lreturn.put('OutboundCpcCardPlanName','')
			lreturn.put('OutboundCpcCardPlanCoverage','')
			lreturn.put('OutboundCpcCardPlanPaymentOptionAmount','')
			lreturn.put('OutboundCpcCardPlanPaymentInstalment','')
			lreturn.put('OutboundCpcCardModalPaymentInstalment','')
			lreturn.put('OutboundCpcCardPlanTaxDeduct','')
			lreturn.put('OutboundCpcCardPlanChemoTherapy','')
			lreturn.put('OutboundCpcCardPlanHospitalCash','')
			lreturn.put('OutboundCpcCardPlanBenefitsPa','')
			lreturn.put('OutboundCpcCardPlanRenew','')
			lreturn.put('OutboundCpcCardPlanActive','')
			lreturn.put('OutboundCpcCardPlanWait','')
			lreturn.put('OutboundCpcCardPromoText','')
			lreturn.put('OutboundCpcOutboundButtonName','')
			lreturn.put('OutboundCpcCardDetailPartnerName','')
			lreturn.put('OutboundCpcCardDetailPlanName','')
			lreturn.put('OutboundCpcCardDetailIsLumpsumAllInvasiveCancer','')
			lreturn.put('OutboundCpcCardDetailIsLumpsumNonInvasiveCancer','')
			lreturn.put('OutboundCpcCardDetailIsLumpsumAddInvasiveCancer','')
			lreturn.put('OutboundCpcCardDetailIsAddBenefitsSkinCancer','')
			lreturn.put('OutboundCpcCardDetailIsAddBenefitsFuneralFee','')
			lreturn.put('OutboundCpcCardDetailIsAddBenefitsSecondExamFee','')
			lreturn.put('OutboundCpcCardDetailIsCoverOpd','')
			lreturn.put('OutboundCpcCardDetailIsAddBenefitsForGender','')
			lreturn.put('OutboundCpcCardDetailIsOtherCovid','')
			lreturn.put('OutboundCpcCardDetailTermAndCondition','')
			lreturn.put('OutboundCpcOutboundPlanResultText','')
			lreturn.put('OutboundCplFormMoreCardDisplayPlanId','')
			lreturn.put('OutboundCplFormMoreCardPlanType','')
			lreturn.put('OutboundCplFormMoreCardPlanPartnerName','')
			lreturn.put('OutboundCplFormMoreCardPlanName','')
			lreturn.put('OutboundCplFormMoreCardPlanCoverage','')
			lreturn.put('OutboundCplFormMoreCardPlanPaymentOptionAmount','')
			lreturn.put('OutboundCplFormMoreCardPlanPaymentInstalment','')
			lreturn.put('OutboundCplFormMoreCardModalPaymentInstalment','')
			lreturn.put('OutboundCplFormMoreCardPlanTaxDeduct','')
			lreturn.put('OutboundCplFormMoreCardPlanChemoTherapy','')
			lreturn.put('OutboundCplFormMoreCardPlanHospitalCash','')
			lreturn.put('OutboundCplFormMoreCardPlanBenefitsPa','')
			lreturn.put('OutboundCplFormMoreCardPlanRenew','')
			lreturn.put('OutboundCplFormMoreCardPlanActive','')
			lreturn.put('OutboundCplFormMoreCardPlanWait','')
			lreturn.put('OutboundCplFormMoreCardPromoText','')
			lreturn.put('OutboundCplFormMoreOutboundButtonName','')
			lreturn.put('OutboundCplFormMoreCardDetailPartnerName','')
			lreturn.put('OutboundCplFormMoreCardDetailPlanName','')
			lreturn.put('OutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer','')
			lreturn.put('OutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer','')
			lreturn.put('OutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer','')
			lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer','')
			lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee','')
			lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee','')
			lreturn.put('OutboundCplFormMoreCardDetailIsCoverOpd','')
			lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsForGender','')
			lreturn.put('OutboundCplFormMoreCardDetailIsOtherCovid','')
			lreturn.put('OutboundCplFormMoreCardDetailTermAndCondition','')
			lreturn.put('OutboundCplPopupFormCardDisplayPlanId','')
			lreturn.put('OutboundCplPopupFormCardPlanType','')
			lreturn.put('OutboundCplPopupFormCardPlanPartnerName','')
			lreturn.put('OutboundCplPopupFormCardPlanName','')
			lreturn.put('OutboundCplPopupFormCardPlanCoverage','')
			lreturn.put('OutboundCplPopupFormCardPlanPaymentOptionAmount','')
			lreturn.put('OutboundCplPopupFormCardPlanPaymentInstalment','')
			lreturn.put('OutboundCplPopupFormCardModalPaymentInstalment','')
			lreturn.put('OutboundCplPopupFormCardPlanTaxDeduct','')
			lreturn.put('OutboundCplPopupFormCardPlanChemoTherapy','')
			lreturn.put('OutboundCplPopupFormCardPlanHospitalCash','')
			lreturn.put('OutboundCplPopupFormCardPlanBenefitsPa','')
			lreturn.put('OutboundCplPopupFormCardPlanRenew','')
			lreturn.put('OutboundCplPopupFormCardPlanActive','')
			lreturn.put('OutboundCplPopupFormCardPlanWait','')
			lreturn.put('OutboundCplPopupFormCardPromoText','')
			lreturn.put('OutboundCplPopupFormOutboundButtonName','')
			lreturn.put('OutboundCplPopupFormCardDetailPartnerName','')
			lreturn.put('OutboundCplPopupFormCardDetailPlanName','')
			lreturn.put('OutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer','')
			lreturn.put('OutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer','')
			lreturn.put('OutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer','')
			lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer','')
			lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee','')
			lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee','')
			lreturn.put('OutboundCplPopupFormCardDetailIsCoverOpd','')
			lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsForGender','')
			lreturn.put('OutboundCplPopupFormCardDetailIsOtherCovid','')
			lreturn.put('OutboundCplPopupFormCardDetailTermAndCondition','')
			lreturn.put('Result',lResult)
			this.closeAskToSaveEmailForm()
			Boolean lIsOutboundSave=IGNUemaHelper.convertStringToBoolean(lOutboundSave)
			lOutboundSave=IGNUemaHelper.convertBooleanToString(lIsOutboundSave)
			Boolean lIsOutboundFillEmailAddress=IGNUemaHelper.convertStringToBoolean(lOutboundFillEmailAddress)
			lOutboundFillEmailAddress=IGNUemaHelper.convertBooleanToString(lIsOutboundFillEmailAddress)
			Boolean lIsOutboundAcceptTermAndCondition=IGNUemaHelper.convertStringToBoolean(lOutboundAcceptTermAndCondition)
			lOutboundAcceptTermAndCondition=IGNUemaHelper.convertBooleanToString(lIsOutboundAcceptTermAndCondition)
			String lTagListOfCardResultList='card-plan'
			String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
			THAKumkaCancerResult_OutputUtil lOutputUtil=new THAKumkaCancerResult_OutputUtil(this.driver,this.selenium)
			def lElementListOfCardResultList=[]
			def lElementOutboundCpcList=[]
			def lElementOutboundCplList=[]
			Integer lOutputNumberOfCardsNum=0
			Integer lElementOutboundCpcListNum=0
			Integer lElementOutboundCplListNum=0
			if(lIsOutboundSave){
				lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				if(lElementListOfCardResultList){
					lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
				}
				if(lOutputNumberOfCardsNum<=0){
					lIsOutboundSave=false
					lOutboundSave=IGNUemaHelper.convertBooleanToString(lIsOutboundSave)
				}
			}
			if(lIsOutboundSave){
				String lCardPlanType=''
				String lCardPlanPartnerName=''
				String lCardPlanName=''
				Integer lIndexOutput=0
				for(lIndexOutput=0;lIndexOutput<lOutputNumberOfCardsNum;lIndexOutput++){
					lCardPlanType=lOutputUtil.outputCardPlanType(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanType=lCardPlanType.toUpperCase().trim()
					lCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanPartnerName=lCardPlanPartnerName.toUpperCase().trim()
					lCardPlanName=lOutputUtil.outputCardPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanName=lCardPlanName.toUpperCase().trim()
					if(lCardPlanType.length()>0){
						if(lCardPlanName.length()>0){
							if(lCardPlanName.contains('FIX')){
								lElementOutboundCpcList.add(lElementListOfCardResultList[lIndexOutput])
							}else{
								lElementOutboundCplList.add(lElementListOfCardResultList[lIndexOutput])
							}
						}
					}
				}
			}
			Boolean lIsDone=true
			lElementOutboundCpcListNum=lElementOutboundCpcList.size()
			lElementOutboundCplListNum=lElementOutboundCplList.size()
			WebElement lElementCpcFormMore=null
			WebElement lElementCpcOutbound=null
			WebElement lElementCplFormMore=null
			WebElement lElementCplPopupForm=null
			if(lElementOutboundCpcListNum>0){
				lElementCpcFormMore=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundCpcList)
				lElementCpcOutbound=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundCpcList)
			}
			if(lElementOutboundCplListNum>0){
				lElementCplFormMore=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundCplList)
				lElementCplPopupForm=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundCplList)
			}
			String lTagModalPaymentInstalmentOpenButton=''
			String lLocatorModalPaymentInstalmentOpenButton='[data-target="#detail_installment"]'
			WebElement lElementModalPaymentInstalmentOpenButton=null
			String lTagModalPaymentInstalmentCloseButton=''
			String lLocatorModalPaymentInstalmentCloseButton='#detail_installment'
			WebElement lElementModalPaymentInstalmentCloseButton=null
			String lTagMoreDetailOpenButton=''
			String lLocatorMoreDetailOpenButton='.card-body div:nth-child(14) a'
			WebElement lElementMoreDetailOpenButton=null
			String lTagFormMoreToggleOpenButton=''
			String lLocatorFormMoreToggleOpenButton='#goToLeadFormBtn button'
			WebElement lElementFormMoreToggleOpenButton=null
			String lTagFormMoreToggleCloseButton=''
			String lLocatorFormMoreToggleCloseButton='#goToSeemoreLink a'
			WebElement lElementFormMoreToggleCloseButton=null
			String lTagFormMorePrefixName=''
			String lLocatorFormMorePrefixName='#validationCustPrefix'
			WebElement lElementFormMorePrefixName=null
			String lTagFormMoreName=''
			String lLocatorFormMoreName='#validationCustFirstName'
			WebElement lElementFormMoreName=null
			String lTagFormMoreSurname=''
			String lLocatorFormMoreSurname='#validationCustLastName'
			WebElement lElementFormMoreSurname=null
			String lTagFormMoreMobileNumberText=''
			String lLocatorFormMoreMobileNumberText='#validationCustMobile'
			WebElement lElementFormMoreMobileNumberText=null
			String lTagFormMoreEmailAddress=''
			String lLocatorFormMoreEmailAddress='#validationCustEmail'
			WebElement lElementFormMoreEmailAddress=null
			String lTagFormMoreCallBackTime=''
			String lLocatorFormMoreCallBackTime='#validationCustPrefix'
			WebElement lElementFormMoreCallBackTime=null
			String lTagFormMoreAcceptTermAndConditionCheckbox=''
			String lLocatorFormMoreAcceptTermAndConditionCheckbox='#gridCheck'
			WebElement lElementFormMoreAcceptTermAndConditionCheckbox=null
			Boolean lIsOutboundAcceptTermAndConditionChecked=false
			String lTagFormMoreConfirmButton=''
			String lLocatorFormMoreConfirmButton='#submitLeadBtn'
			WebElement lElementFormMoreConfirmButton=null
			String lTagFormMoreCPLThankyouForm=''
			String lLocatorFormMoreCPLThankyouPage='#app #complete'
			WebElement lElementFormMoreCPLThankyouPage=null
			Boolean lIsVisibleFormMoreCPLThankyouPage=false
			String lTagFormMoreCPLThankyouCloseButton=''
			String lLocatorFormMoreCPLThankyouCloseButton='#app #complete button'
			WebElement lElementFormMoreCPLThankyouCloseButton=null
			String lTagMoreDetailCloseButton=''
			String lLocatorMoreDetailCloseButton='#modal-close'
			WebElement lElementMoreDetailCloseButton=null
			String lTagPopupFormOpenButton=''
			String lLocatorPopupFormOpenButton='.card-footer button'
			WebElement lElementPopupFormOpenButton=null
			String lTagPopupFormPrefixName=''
			String lLocatorPopupFormPrefixName='#validationCustPrefix'
			WebElement lElementPopupFormPrefixName=null
			String lTagPopupFormName=''
			String lLocatorPopupFormName='#validationCustFirstName'
			WebElement lElementPopupFormName=null
			String lTagPopupFormSurname=''
			String lLocatorPopupFormSurname='#validationCustLastName'
			WebElement lElementPopupFormSurname=null
			String lTagPopupFormMobileNumberText=''
			String lLocatorPopupFormMobileNumberText='#validationCustMobile'
			WebElement lElementPopupFormMobileNumberText=null
			String lTagPopupFormEmailAddress=''
			String lLocatorPopupFormEmailAddress='#validationCustEmail'
			WebElement lElementPopupFormEmailAddress=null
			String lTagPopupFormCallBackTime=''
			String lLocatorPopupFormCallBackTime=''
			WebElement lElementPopupFormCallBackTime=null
			String lTagPopupFormAcceptTermAndConditionCheckbox=''
			String lLocatorPopupFormAcceptTermAndConditionCheckbox='#gridCheck'
			WebElement lElementPopupFormAcceptTermAndConditionCheckbox=null
			String lTagPopupFormConfirmButton=''
			String lLocatorPopupFormConfirmButton='#submitLeadBtn'
			WebElement lElementPopupFormConfirmButton=null
			String lTagPopupFormCPLThankyouPage=''
			String lLocatorPopupFormCPLThankyouPage='#app #complete'
			Boolean lIsVisiblePopupFormCPLThankyouPage=false
			String lTagPopupFormCPLThankyouCloseButton=''
			String lLocatorPopupFormCPLThankyouCloseButton='#app #complete button'
			WebElement lElementPopupFormCPLThankyouCloseButton=null
			String lTagPopupFormMoreDetailCloseButton=''
			String lLocatorPopupFormMoreDetailCloseButton='#modal-close'
			WebElement lElementPopupFormMoreDetailCloseButton=null
			String lMainWindow=this.driver.getWindowHandle()
			String lTagLeadPlanResultText=''
			String lLocatorLeadPlanResultText='#summary'
			WebElement lElementLeadPlanResultText=null
			if(lElementCpcFormMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCpcFormMore)
				lOutboundCpcFormMoreCardDisplayPlanId=lOutputUtil.outputCardDisplayPlanId(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanType=lOutputUtil.outputCardPlanType(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanName=lOutputUtil.outputCardPlanName(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanCoverage=lOutputUtil. outputCardPlanCoverage(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanPaymentOptionAmount=lOutputUtil. outputCardPlanPaymentOptionAmount(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanPaymentInstalment=lOutputUtil.outputCardPlanPaymentInstalment(lElementCpcFormMore,0)
				lElementModalPaymentInstalmentOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCpcFormMore,lLocatorModalPaymentInstalmentOpenButton,true)
				if(lElementModalPaymentInstalmentOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOutboundCpcFormMoreCardModalPaymentInstalment=lOutputUtil.outputCardModalPaymentInstalment(lElementCpcFormMore,0)
					if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton,5)){
						lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}else{
					lOutboundCpcFormMoreCardModalPaymentInstalment='No Option'
				}
				lOutboundCpcFormMoreCardPlanTaxDeduct=lOutputUtil.outputCardPlanTaxDeduct(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanChemoTherapy=lOutputUtil.outputCardPlanChemoTherapy(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanHospitalCash=lOutputUtil.outputCardPlanHospitalCash(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanBenefitsPa=lOutputUtil.outputCardPlanBenefitsPa(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanRenew=lOutputUtil.outputCardPlanRenew(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanActive=lOutputUtil.outputCardPlanActive(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPlanWait=lOutputUtil.outputCardPlanWait(lElementCpcFormMore,0)
				lOutboundCpcFormMoreCardPromoText=lOutputUtil.outputCardPromoText(lElementCpcFormMore,0)
				lOutboundCpcFormMoreOutboundButtonName=lOutputUtil.outputOutboundButtonName(lElementCpcFormMore,0)
				lElementMoreDetailOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCpcFormMore,lLocatorMoreDetailOpenButton,true)
				if(lElementMoreDetailOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMoreDetailOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailOpenButton)
					IGNUemaHelper.delayThreadSecond(3)
					lOutboundCpcFormMoreCardDetailPartnerName=lOutputUtil.outputCardDetailPartnerName(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailPlanName=lOutputUtil.outputCardDetailPlanName(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAllInvasiveCancer(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumNonInvasiveCancer(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAddInvasiveCancer(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer=lOutputUtil.outputCardDetailIsAddBenefitsSkinCancer(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee=lOutputUtil.outputCardDetailIsAddBenefitsFuneralFee(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee=lOutputUtil.outputCardDetailIsAddBenefitsSecondExamFee(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsCoverOpd=lOutputUtil.outputCardDetailIsCoverOpd(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender=lOutputUtil.outputCardDetailIsAddBenefitsForGender(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailIsOtherCovid=lOutputUtil.outputCardDetailIsOtherCovid(lElementCpcFormMore,0)
					lOutboundCpcFormMoreCardDetailTermAndCondition=lOutputUtil.outputCardDetailTermAndCondition(lElementCpcFormMore,0)
					lElementFormMoreToggleOpenButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreToggleOpenButton)
					if(lElementFormMoreToggleOpenButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementFormMoreToggleOpenButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreToggleOpenButton)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				try{
					Set<String> lSetWinHandle=this.driver.getWindowHandles()
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							for(Integer lIndex=0;lIndex<=5;lIndex++){
								if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorLeadPlanResultText,5)){
									lElementLeadPlanResultText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorLeadPlanResultText)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementLeadPlanResultText)
									if(lElementLeadPlanResultText){
										lOutboundCpcFormMorePlanResultText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementLeadPlanResultText,"baseURI")
										if(lOutboundCpcFormMorePlanResultText.length()>0){
											if(lOutboundCpcFormMorePlanResultText.toUpperCase().contains('MSIG')){
												IGNUemaHelper.delayThreadSecond(3)
												break
											}else{
												IGNUemaHelper.delayThreadSecond(1)
											}
										}else{
											IGNUemaHelper.delayThreadSecond(1)
										}
									}else{
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
							}
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
				lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
				if(lElementModalPaymentInstalmentCloseButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
				}
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormMoreCPLThankyouCloseButton,5)){
					lElementFormMoreCPLThankyouCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreCPLThankyouCloseButton)
					if(lElementFormMoreCPLThankyouCloseButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreCPLThankyouCloseButton)
						IGNUemaHelper.delayThreadSecond(5)
					}
				}
				lElementMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMoreDetailCloseButton)
				if(lElementMoreDetailCloseButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
				}
				lIsDone=lIsDone&&(lOutboundCpcFormMorePlanResultText.length()>0)
				lIsDone=true
			}
			if(lElementCpcOutbound){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCpcOutbound)
				lOutboundCpcCardDisplayPlanId=lOutputUtil.outputCardDisplayPlanId(lElementCpcOutbound,0)
				lOutboundCpcCardPlanType=lOutputUtil.outputCardPlanType(lElementCpcOutbound,0)
				lOutboundCpcCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementCpcOutbound,0)
				lOutboundCpcCardPlanName=lOutputUtil.outputCardPlanName(lElementCpcOutbound,0)
				lOutboundCpcCardPlanCoverage=lOutputUtil.outputCardPlanCoverage(lElementCpcOutbound,0)
				lOutboundCpcCardPlanPaymentOptionAmount=lOutputUtil.outputCardPlanPaymentOptionAmount(lElementCpcOutbound,0)
				lOutboundCpcCardPlanPaymentInstalment=lOutputUtil.outputCardPlanPaymentInstalment(lElementCpcOutbound,0)
				lElementModalPaymentInstalmentOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCpcOutbound,lLocatorModalPaymentInstalmentOpenButton,true)
				if(lElementModalPaymentInstalmentOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOutboundCpcCardModalPaymentInstalment=lOutputUtil.outputCardModalPaymentInstalment(lElementCpcOutbound,0)
					if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton,5)){
						lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}else{
					lOutboundCpcCardModalPaymentInstalment='No Option'
				}
				lOutboundCpcCardPlanTaxDeduct=lOutputUtil.outputCardPlanTaxDeduct(lElementCpcOutbound,0)
				lOutboundCpcCardPlanChemoTherapy=lOutputUtil.outputCardPlanChemoTherapy(lElementCpcOutbound,0)
				lOutboundCpcCardPlanHospitalCash=lOutputUtil.outputCardPlanHospitalCash(lElementCpcOutbound,0)
				lOutboundCpcCardPlanBenefitsPa=lOutputUtil.outputCardPlanBenefitsPa(lElementCpcOutbound,0)
				lOutboundCpcCardPlanRenew=lOutputUtil.outputCardPlanRenew(lElementCpcOutbound,0)
				lOutboundCpcCardPlanActive=lOutputUtil.outputCardPlanActive(lElementCpcOutbound,0)
				lOutboundCpcCardPlanWait=lOutputUtil.outputCardPlanWait(lElementCpcOutbound,0)
				lOutboundCpcCardPromoText=lOutputUtil.outputCardPromoText(lElementCpcOutbound,0)
				lOutboundCpcOutboundButtonName=lOutputUtil.outputOutboundButtonName(lElementCpcOutbound,0)
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMoreDetailOpenButton,5)){
					lElementMoreDetailOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCpcOutbound,lLocatorMoreDetailOpenButton,true)
					if(lElementMoreDetailOpenButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMoreDetailOpenButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailOpenButton)
						IGNUemaHelper.delayThreadSecond(1)
						lOutboundCpcCardDetailPartnerName=lOutputUtil.outputCardDetailPartnerName(lElementCpcOutbound,0)
						lOutboundCpcCardDetailPlanName=lOutputUtil.outputCardDetailPlanName(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAllInvasiveCancer(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumNonInvasiveCancer(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAddInvasiveCancer(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsAddBenefitsSkinCancer=lOutputUtil.outputCardDetailIsAddBenefitsSkinCancer(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsAddBenefitsFuneralFee=lOutputUtil.outputCardDetailIsAddBenefitsFuneralFee(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsAddBenefitsSecondExamFee=lOutputUtil.outputCardDetailIsAddBenefitsSecondExamFee(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsCoverOpd=lOutputUtil.outputCardDetailIsCoverOpd(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsAddBenefitsForGender=lOutputUtil.outputCardDetailIsAddBenefitsForGender(lElementCpcOutbound,0)
						lOutboundCpcCardDetailIsOtherCovid=lOutputUtil.outputCardDetailIsOtherCovid(lElementCpcOutbound,0)
						lOutboundCpcCardDetailTermAndCondition=lOutputUtil.outputCardDetailTermAndCondition(lElementCpcOutbound,0)
						lElementMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMoreDetailCloseButton)
						if(lElementMoreDetailCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
				lElementPopupFormOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCpcOutbound,lLocatorPopupFormOpenButton,true)
				if(lElementPopupFormOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPopupFormOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
				}
				try{
					Set<String> lSetWinHandle=this.driver.getWindowHandles()
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							for(Integer lIndex=0;lIndex<=5;lIndex++){
								if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorLeadPlanResultText,5)){
									lElementLeadPlanResultText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorLeadPlanResultText)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementLeadPlanResultText)
									if(lElementLeadPlanResultText){
										lOutboundCpcOutboundPlanResultText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementLeadPlanResultText,"baseURI")
										if(lOutboundCpcOutboundPlanResultText.length()>0){
											if(lOutboundCpcOutboundPlanResultText.toUpperCase().contains('MSIG')){
												IGNUemaHelper.delayThreadSecond(3)
												break
											}else{
												IGNUemaHelper.delayThreadSecond(1)
											}
										}else{
											IGNUemaHelper.delayThreadSecond(1)
										}
									}else{
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
							}
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
				lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
				if(lElementModalPaymentInstalmentCloseButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
				}
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormMoreCPLThankyouCloseButton,5)){
					lElementFormMoreCPLThankyouCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreCPLThankyouCloseButton)
					if(lElementFormMoreCPLThankyouCloseButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreCPLThankyouCloseButton)
						IGNUemaHelper.delayThreadSecond(5)
					}
				}
				lElementMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMoreDetailCloseButton)
				if(lElementMoreDetailCloseButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
				}
				lIsDone=lIsDone&&(lOutboundCpcOutboundPlanResultText.length()>0)
				lIsDone=true
			}
			lOutputNumberOfCardsNum=0
			lElementOutboundCpcList.clear()
			lElementOutboundCplList.clear()
			lElementCplFormMore=null
			if(lIsOutboundSave){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				if(!lElementListOfCardResultList){
					IGNUemaHelper.delayThreadSecond(3)
					lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				}
				if(lElementListOfCardResultList){
					lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
				}
				if(lOutputNumberOfCardsNum<=0){
					IGNUemaHelper.delayThreadSecond(3)
					lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
					if(lElementListOfCardResultList){
						lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
					}
				}
				if(lOutputNumberOfCardsNum<=0){
					lIsOutboundSave=false
				}
			}
			if(lIsOutboundSave){
				String lCardPlanType=''
				String lCardPlanPartnerName=''
				String lCardPlanName=''
				Integer lIndexOutput=0
				for(lIndexOutput=0;lIndexOutput<lOutputNumberOfCardsNum;lIndexOutput++){
					lCardPlanType=lOutputUtil.outputCardPlanType(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanType=lCardPlanType.toUpperCase().trim()
					lCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanPartnerName=lCardPlanPartnerName.toUpperCase().trim()
					lCardPlanName=lOutputUtil.outputCardPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanName=lCardPlanName.toUpperCase().trim()
					if(lCardPlanType.length()>0){
						if(lCardPlanName.length()>0){
							if(lCardPlanName.contains('FIX')){
								lElementOutboundCpcList.add(lElementListOfCardResultList[lIndexOutput])
							}else{
								lElementOutboundCplList.add(lElementListOfCardResultList[lIndexOutput])
							}
						}
					}
				}
				lElementOutboundCpcListNum=lElementOutboundCpcList.size()
				lElementOutboundCplListNum=lElementOutboundCplList.size()
				if(lElementOutboundCplListNum>0){
					lElementCplFormMore=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundCplList)
				}
			}
			if(lElementCplFormMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCplFormMore)
				lOutboundCplFormMoreCardDisplayPlanId=lOutputUtil.outputCardDisplayPlanId(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanType=lOutputUtil.outputCardPlanType(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanName=lOutputUtil.outputCardPlanName(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanCoverage=lOutputUtil.outputCardPlanCoverage(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanPaymentOptionAmount=lOutputUtil.outputCardPlanPaymentOptionAmount(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanPaymentInstalment=lOutputUtil.outputCardPlanPaymentInstalment(lElementCplFormMore,0)
				lElementModalPaymentInstalmentOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCplFormMore,lLocatorModalPaymentInstalmentOpenButton,true)
				if(lElementModalPaymentInstalmentOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOutboundCplFormMoreCardModalPaymentInstalment=lOutputUtil.outputCardModalPaymentInstalment(lElementCplFormMore,0)
					if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton,5)){
						lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
				}else{
					lOutboundCplFormMoreCardModalPaymentInstalment='No Option'
				}
				lOutboundCplFormMoreCardPlanTaxDeduct=lOutputUtil.outputCardPlanTaxDeduct(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanChemoTherapy=lOutputUtil.outputCardPlanChemoTherapy(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanHospitalCash=lOutputUtil.outputCardPlanHospitalCash(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanBenefitsPa=lOutputUtil.outputCardPlanBenefitsPa(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanRenew=lOutputUtil.outputCardPlanRenew(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanActive=lOutputUtil.outputCardPlanActive(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPlanWait=lOutputUtil.outputCardPlanWait(lElementCplFormMore,0)
				lOutboundCplFormMoreCardPromoText=lOutputUtil.outputCardPromoText(lElementCplFormMore,0)
				lOutboundCplFormMoreOutboundButtonName=lOutputUtil.outputOutboundButtonName(lElementCplFormMore,0)
				lElementMoreDetailOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCplFormMore,lLocatorMoreDetailOpenButton,true)
				if(lElementMoreDetailOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMoreDetailOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOutboundCplFormMoreCardDetailPartnerName=lOutputUtil.outputCardDetailPartnerName(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailPlanName=lOutputUtil.outputCardDetailPlanName(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAllInvasiveCancer(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumNonInvasiveCancer(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAddInvasiveCancer(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer=lOutputUtil.outputCardDetailIsAddBenefitsSkinCancer(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee=lOutputUtil.outputCardDetailIsAddBenefitsFuneralFee(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee=lOutputUtil.outputCardDetailIsAddBenefitsSecondExamFee(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsCoverOpd=lOutputUtil.outputCardDetailIsCoverOpd(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsAddBenefitsForGender=lOutputUtil.outputCardDetailIsAddBenefitsForGender(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailIsOtherCovid=lOutputUtil.outputCardDetailIsOtherCovid(lElementCplFormMore,0)
					lOutboundCplFormMoreCardDetailTermAndCondition=lOutputUtil.outputCardDetailTermAndCondition(lElementCplFormMore,0)
					lElementFormMoreToggleOpenButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreToggleOpenButton)
					if(lElementFormMoreToggleOpenButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreToggleOpenButton)
						IGNUemaHelper.delayThreadSecond(1)
						lElementFormMoreName=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreName)
						lOutboundName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementFormMoreName,lOutboundName)
						lElementFormMoreSurname=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreSurname)
						lOutboundSurname=IGNUemaHelper.typeTextByWebElement(this.driver,lElementFormMoreSurname,lOutboundSurname)
						lElementFormMoreMobileNumberText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreMobileNumberText)
						lOutboundMobileNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementFormMoreMobileNumberText,lOutboundMobileNumber)
						if(lIsOutboundFillEmailAddress){
							lElementFormMoreEmailAddress=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreEmailAddress)
							lOutboundEmailAddress=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementFormMoreEmailAddress,lOutboundEmailAddress)
						}
						lElementFormMoreAcceptTermAndConditionCheckbox=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreAcceptTermAndConditionCheckbox)
						if(lElementFormMoreAcceptTermAndConditionCheckbox){
							lIsOutboundAcceptTermAndConditionChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementFormMoreAcceptTermAndConditionCheckbox)
							if(lIsOutboundAcceptTermAndCondition){
								if(!lIsOutboundAcceptTermAndConditionChecked){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreAcceptTermAndConditionCheckbox)
								}
							}else{
								if(lIsOutboundAcceptTermAndConditionChecked){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreAcceptTermAndConditionCheckbox)
								}
							}
						}
						lOutboundPrefixName=this.inputOutboundPrefixName(lOutboundPrefixName)
						lOutboundCallBackTime=this.inputOutboundCallBackTime(lOutboundCallBackTime)
						lElementFormMoreConfirmButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreConfirmButton)
						if(lElementFormMoreConfirmButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreConfirmButton)
							IGNUemaHelper.delayThreadSecond(5)
						}
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPopupFormCPLThankyouPage,30)
						lIsVisibleFormMoreCPLThankyouPage=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorPopupFormCPLThankyouPage)
						if(isPositiveCase){
							lIsDone=lIsDone&&lIsVisibleFormMoreCPLThankyouPage
						}else{
							lIsDone=lIsDone&&!lIsVisibleFormMoreCPLThankyouPage
						}
						lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
						if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormMoreCPLThankyouCloseButton,10)){
							lElementFormMoreCPLThankyouCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormMoreCPLThankyouCloseButton)
							if(lElementFormMoreCPLThankyouCloseButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementFormMoreCPLThankyouCloseButton)
								IGNUemaHelper.delayThreadSecond(5)
							}
						}
						lElementMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMoreDetailCloseButton)
						if(lElementMoreDetailCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailCloseButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
				}
			}
			lOutputNumberOfCardsNum=0
			lElementOutboundCpcList.clear()
			lElementOutboundCplList.clear()
			lElementCplPopupForm=null
			if(lIsOutboundSave){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(5)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(5)
				lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				if(!lElementListOfCardResultList){
					IGNUemaHelper.delayThreadSecond(5)
					lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				}
				if(lElementListOfCardResultList){
					lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
				}
				if(lOutputNumberOfCardsNum<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
					if(lElementListOfCardResultList){
						lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
					}
				}
				if(lOutputNumberOfCardsNum<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
					if(lElementListOfCardResultList){
						lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
					}
				}
				if(lOutputNumberOfCardsNum<=0){
					lIsOutboundSave=false
				}
			}
			if(lIsOutboundSave){
				String lCardPlanType=''
				String lCardPlanPartnerName=''
				String lCardPlanName=''
				Integer lIndexOutput=0
				for(lIndexOutput=0;lIndexOutput<lOutputNumberOfCardsNum;lIndexOutput++){
					lCardPlanType=lOutputUtil.outputCardPlanType(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanType=lCardPlanType.toUpperCase().trim()
					lCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanPartnerName=lCardPlanPartnerName.toUpperCase().trim()
					lCardPlanName=lOutputUtil.outputCardPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lCardPlanName=lCardPlanName.toUpperCase().trim()
					if(lCardPlanType.length()>0){
						if(lCardPlanName.length()>0){
							if(lCardPlanName.contains('FIX')){
								lElementOutboundCpcList.add(lElementListOfCardResultList[lIndexOutput])
							}else{
								lElementOutboundCplList.add(lElementListOfCardResultList[lIndexOutput])
							}
						}
					}
				}
				lElementOutboundCpcListNum=lElementOutboundCpcList.size()
				lElementOutboundCplListNum=lElementOutboundCplList.size()
				if(lElementOutboundCplListNum>0){
					lElementCplPopupForm=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundCplList)
				}
			}
			if(lElementCplPopupForm){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCplPopupForm)
				lOutboundCplPopupFormCardDisplayPlanId=lOutputUtil.outputCardDisplayPlanId(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanType=lOutputUtil.outputCardPlanType(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanPartnerName=lOutputUtil.outputCardPlanPartnerName(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanName=lOutputUtil.outputCardPlanName(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanCoverage=lOutputUtil.outputCardPlanCoverage(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanPaymentOptionAmount=lOutputUtil.outputCardPlanPaymentOptionAmount(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanPaymentInstalment=lOutputUtil.outputCardPlanPaymentInstalment(lElementCplPopupForm,0)
				lElementModalPaymentInstalmentOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCplPopupForm,lLocatorModalPaymentInstalmentOpenButton,true)
				if(lElementModalPaymentInstalmentOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOutboundCplPopupFormCardModalPaymentInstalment=lOutputUtil.outputCardModalPaymentInstalment(lElementCplPopupForm,0)
					if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton,5)){
						lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
				}else{
					lOutboundCplPopupFormCardModalPaymentInstalment='No Option'
				}
				lOutboundCplPopupFormCardPlanTaxDeduct=lOutputUtil.outputCardPlanTaxDeduct(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanChemoTherapy=lOutputUtil.outputCardPlanChemoTherapy(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanHospitalCash=lOutputUtil.outputCardPlanHospitalCash(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanBenefitsPa=lOutputUtil.outputCardPlanBenefitsPa(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanRenew=lOutputUtil.outputCardPlanRenew(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanActive=lOutputUtil.outputCardPlanActive(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPlanWait=lOutputUtil.outputCardPlanWait(lElementCplPopupForm,0)
				lOutboundCplPopupFormCardPromoText=lOutputUtil.outputCardPromoText(lElementCplPopupForm,0)
				lOutboundCplPopupFormOutboundButtonName=lOutputUtil.outputOutboundButtonName(lElementCplPopupForm,0)
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMoreDetailOpenButton,5)){
					lElementMoreDetailOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCplPopupForm,lLocatorMoreDetailOpenButton,true)
					if(lElementMoreDetailOpenButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMoreDetailOpenButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailOpenButton)
						IGNUemaHelper.delayThreadSecond(1)
						lOutboundCplPopupFormCardDetailPartnerName=lOutputUtil.outputCardDetailPartnerName(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailPlanName=lOutputUtil.outputCardDetailPlanName(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAllInvasiveCancer(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumNonInvasiveCancer(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer=lOutputUtil.outputCardDetailIsLumpsumAddInvasiveCancer(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer=lOutputUtil.outputCardDetailIsAddBenefitsSkinCancer(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee=lOutputUtil.outputCardDetailIsAddBenefitsFuneralFee(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee=lOutputUtil.outputCardDetailIsAddBenefitsSecondExamFee(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsCoverOpd=lOutputUtil.outputCardDetailIsCoverOpd(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsAddBenefitsForGender=lOutputUtil.outputCardDetailIsAddBenefitsForGender(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailIsOtherCovid=lOutputUtil.outputCardDetailIsOtherCovid(lElementCplPopupForm,0)
						lOutboundCplPopupFormCardDetailTermAndCondition=lOutputUtil.outputCardDetailTermAndCondition(lElementCplPopupForm,0)
						if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMoreDetailCloseButton,5)){
							lElementMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMoreDetailCloseButton)
							if(lElementMoreDetailCloseButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailCloseButton)
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
				}
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPopupFormOpenButton,5)){
					lElementPopupFormOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementCplPopupForm,lLocatorPopupFormOpenButton,true)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPopupFormOpenButton)
					if(lElementPopupFormOpenButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormOpenButton)
						IGNUemaHelper.delayThreadSecond(1)
						lElementPopupFormName=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormName)
						lOutboundName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPopupFormName,lOutboundName)
						lElementPopupFormSurname=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormSurname)
						lOutboundSurname=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPopupFormSurname,lOutboundSurname)
						lElementPopupFormMobileNumberText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormMobileNumberText)
						lOutboundMobileNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPopupFormMobileNumberText,lOutboundMobileNumber)
						if(lIsOutboundFillEmailAddress){
							lElementPopupFormEmailAddress=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormEmailAddress)
							lOutboundEmailAddress=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementPopupFormEmailAddress,lOutboundEmailAddress)
						}
						lElementPopupFormAcceptTermAndConditionCheckbox=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormAcceptTermAndConditionCheckbox)
						if(lElementPopupFormAcceptTermAndConditionCheckbox){
							lIsOutboundAcceptTermAndConditionChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementPopupFormAcceptTermAndConditionCheckbox)
							if(lIsOutboundAcceptTermAndCondition){
								if(!lIsOutboundAcceptTermAndConditionChecked){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormAcceptTermAndConditionCheckbox)
								}
							}else{
								if(lIsOutboundAcceptTermAndConditionChecked){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormAcceptTermAndConditionCheckbox)
								}
							}
						}
						lOutboundPrefixName=this.inputOutboundPrefixName(lOutboundPrefixName)
						lOutboundCallBackTime=this.inputOutboundCallBackTime(lOutboundCallBackTime)
						lElementPopupFormConfirmButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormConfirmButton)
						if(lElementPopupFormConfirmButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormConfirmButton)
							IGNUemaHelper.delayThreadSecond(5)
						}
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPopupFormCPLThankyouPage,30)
						lIsVisiblePopupFormCPLThankyouPage=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorPopupFormCPLThankyouPage)
						if(isPositiveCase){
							lIsDone=lIsDone&&lIsVisiblePopupFormCPLThankyouPage
						}else{
							lIsDone=lIsDone&&!lIsVisiblePopupFormCPLThankyouPage
						}
						lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
						if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPopupFormCPLThankyouCloseButton,10)){
							lElementPopupFormCPLThankyouCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormCPLThankyouCloseButton)
							if(lElementPopupFormCPLThankyouCloseButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormCPLThankyouCloseButton)
								IGNUemaHelper.delayThreadSecond(5)
							}
						}
						lElementPopupFormMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPopupFormMoreDetailCloseButton)
						if(lElementPopupFormMoreDetailCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPopupFormMoreDetailCloseButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
				}
			}
			lResult=lIsDone
			if(lResult){
				lreturn.put('OutboundSave',lOutboundSave)
				lreturn.put('OutboundPrefixName',lOutboundPrefixName)
				lreturn.put('OutboundName',lOutboundName)
				lreturn.put('OutboundSurname',lOutboundSurname)
				lreturn.put('OutboundMobileNumber',lOutboundMobileNumber)
				lreturn.put('OutboundFillEmailAddress',lOutboundFillEmailAddress)
				lreturn.put('OutboundEmailAddress',lOutboundEmailAddress)
				lreturn.put('OutboundCallBackTime',lOutboundCallBackTime)
				lreturn.put('OutboundAcceptTermAndCondition',lOutboundAcceptTermAndCondition)
				lreturn.put('OutboundCpcFormMoreCardDisplayPlanId',lOutboundCpcFormMoreCardDisplayPlanId)
				lreturn.put('OutboundCpcFormMoreCardPlanType',lOutboundCpcFormMoreCardPlanType)
				lreturn.put('OutboundCpcFormMoreCardPlanPartnerName',lOutboundCpcFormMoreCardPlanPartnerName)
				lreturn.put('OutboundCpcFormMoreCardPlanName',lOutboundCpcFormMoreCardPlanName)
				lreturn.put('OutboundCpcFormMoreCardPlanCoverage',lOutboundCpcFormMoreCardPlanCoverage)
				lreturn.put('OutboundCpcFormMoreCardPlanPaymentOptionAmount',lOutboundCpcFormMoreCardPlanPaymentOptionAmount)
				lreturn.put('OutboundCpcFormMoreCardPlanPaymentInstalment',lOutboundCpcFormMoreCardPlanPaymentInstalment)
				lreturn.put('OutboundCpcFormMoreCardModalPaymentInstalment',lOutboundCpcFormMoreCardModalPaymentInstalment)
				lreturn.put('OutboundCpcFormMoreCardPlanTaxDeduct',lOutboundCpcFormMoreCardPlanTaxDeduct)
				lreturn.put('OutboundCpcFormMoreCardPlanChemoTherapy',lOutboundCpcFormMoreCardPlanChemoTherapy)
				lreturn.put('OutboundCpcFormMoreCardPlanHospitalCash',lOutboundCpcFormMoreCardPlanHospitalCash)
				lreturn.put('OutboundCpcFormMoreCardPlanBenefitsPa',lOutboundCpcFormMoreCardPlanBenefitsPa)
				lreturn.put('OutboundCpcFormMoreCardPlanRenew',lOutboundCpcFormMoreCardPlanRenew)
				lreturn.put('OutboundCpcFormMoreCardPlanActive',lOutboundCpcFormMoreCardPlanActive)
				lreturn.put('OutboundCpcFormMoreCardPlanWait',lOutboundCpcFormMoreCardPlanWait)
				lreturn.put('OutboundCpcFormMoreCardPromoText',lOutboundCpcFormMoreCardPromoText)
				lreturn.put('OutboundCpcFormMoreOutboundButtonName',lOutboundCpcFormMoreOutboundButtonName)
				lreturn.put('OutboundCpcFormMoreCardDetailPartnerName',lOutboundCpcFormMoreCardDetailPartnerName)
				lreturn.put('OutboundCpcFormMoreCardDetailPlanName',lOutboundCpcFormMoreCardDetailPlanName)
				lreturn.put('OutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer',lOutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer)
				lreturn.put('OutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer',lOutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer)
				lreturn.put('OutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer',lOutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer)
				lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer',lOutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer)
				lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee',lOutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee)
				lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee',lOutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee)
				lreturn.put('OutboundCpcFormMoreCardDetailIsCoverOpd',lOutboundCpcFormMoreCardDetailIsCoverOpd)
				lreturn.put('OutboundCpcFormMoreCardDetailIsAddBenefitsForGender',lOutboundCpcFormMoreCardDetailIsAddBenefitsForGender)
				lreturn.put('OutboundCpcFormMoreCardDetailIsOtherCovid',lOutboundCpcFormMoreCardDetailIsOtherCovid)
				lreturn.put('OutboundCpcFormMoreCardDetailTermAndCondition',lOutboundCpcFormMoreCardDetailTermAndCondition)
				lreturn.put('OutboundCpcFormMorePlanResultText',lOutboundCpcFormMorePlanResultText)
				lreturn.put('OutboundCpcCardDisplayPlanId',lOutboundCpcCardDisplayPlanId)
				lreturn.put('OutboundCpcCardPlanType',lOutboundCpcCardPlanType)
				lreturn.put('OutboundCpcCardPlanPartnerName',lOutboundCpcCardPlanPartnerName)
				lreturn.put('OutboundCpcCardPlanName',lOutboundCpcCardPlanName)
				lreturn.put('OutboundCpcCardPlanCoverage',lOutboundCpcCardPlanCoverage)
				lreturn.put('OutboundCpcCardPlanPaymentOptionAmount',lOutboundCpcCardPlanPaymentOptionAmount)
				lreturn.put('OutboundCpcCardPlanPaymentInstalment',lOutboundCpcCardPlanPaymentInstalment)
				lreturn.put('OutboundCpcCardModalPaymentInstalment',lOutboundCpcCardModalPaymentInstalment)
				lreturn.put('OutboundCpcCardPlanTaxDeduct',lOutboundCpcCardPlanTaxDeduct)
				lreturn.put('OutboundCpcCardPlanChemoTherapy',lOutboundCpcCardPlanChemoTherapy)
				lreturn.put('OutboundCpcCardPlanHospitalCash',lOutboundCpcCardPlanHospitalCash)
				lreturn.put('OutboundCpcCardPlanBenefitsPa',lOutboundCpcCardPlanBenefitsPa)
				lreturn.put('OutboundCpcCardPlanRenew',lOutboundCpcCardPlanRenew)
				lreturn.put('OutboundCpcCardPlanActive',lOutboundCpcCardPlanActive)
				lreturn.put('OutboundCpcCardPlanWait',lOutboundCpcCardPlanWait)
				lreturn.put('OutboundCpcCardPromoText',lOutboundCpcCardPromoText)
				lreturn.put('OutboundCpcOutboundButtonName',lOutboundCpcOutboundButtonName)
				lreturn.put('OutboundCpcCardDetailPartnerName',lOutboundCpcCardDetailPartnerName)
				lreturn.put('OutboundCpcCardDetailPlanName',lOutboundCpcCardDetailPlanName)
				lreturn.put('OutboundCpcCardDetailIsLumpsumAllInvasiveCancer',lOutboundCpcCardDetailIsLumpsumAllInvasiveCancer)
				lreturn.put('OutboundCpcCardDetailIsLumpsumNonInvasiveCancer',lOutboundCpcCardDetailIsLumpsumNonInvasiveCancer)
				lreturn.put('OutboundCpcCardDetailIsLumpsumAddInvasiveCancer',lOutboundCpcCardDetailIsLumpsumAddInvasiveCancer)
				lreturn.put('OutboundCpcCardDetailIsAddBenefitsSkinCancer',lOutboundCpcCardDetailIsAddBenefitsSkinCancer)
				lreturn.put('OutboundCpcCardDetailIsAddBenefitsFuneralFee',lOutboundCpcCardDetailIsAddBenefitsFuneralFee)
				lreturn.put('OutboundCpcCardDetailIsAddBenefitsSecondExamFee',lOutboundCpcCardDetailIsAddBenefitsSecondExamFee)
				lreturn.put('OutboundCpcCardDetailIsCoverOpd',lOutboundCpcCardDetailIsCoverOpd)
				lreturn.put('OutboundCpcCardDetailIsAddBenefitsForGender',lOutboundCpcCardDetailIsAddBenefitsForGender)
				lreturn.put('OutboundCpcCardDetailIsOtherCovid',lOutboundCpcCardDetailIsOtherCovid)
				lreturn.put('OutboundCpcCardDetailTermAndCondition',lOutboundCpcCardDetailTermAndCondition)
				lreturn.put('OutboundCpcOutboundPlanResultText',lOutboundCpcOutboundPlanResultText)
				lreturn.put('OutboundCplFormMoreCardDisplayPlanId',lOutboundCplFormMoreCardDisplayPlanId)
				lreturn.put('OutboundCplFormMoreCardPlanType',lOutboundCplFormMoreCardPlanType)
				lreturn.put('OutboundCplFormMoreCardPlanPartnerName',lOutboundCplFormMoreCardPlanPartnerName)
				lreturn.put('OutboundCplFormMoreCardPlanName',lOutboundCplFormMoreCardPlanName)
				lreturn.put('OutboundCplFormMoreCardPlanCoverage',lOutboundCplFormMoreCardPlanCoverage)
				lreturn.put('OutboundCplFormMoreCardPlanPaymentOptionAmount',lOutboundCplFormMoreCardPlanPaymentOptionAmount)
				lreturn.put('OutboundCplFormMoreCardPlanPaymentInstalment',lOutboundCplFormMoreCardPlanPaymentInstalment)
				lreturn.put('OutboundCplFormMoreCardModalPaymentInstalment',lOutboundCplFormMoreCardModalPaymentInstalment)
				lreturn.put('OutboundCplFormMoreCardPlanTaxDeduct',lOutboundCplFormMoreCardPlanTaxDeduct)
				lreturn.put('OutboundCplFormMoreCardPlanChemoTherapy',lOutboundCplFormMoreCardPlanChemoTherapy)
				lreturn.put('OutboundCplFormMoreCardPlanHospitalCash',lOutboundCplFormMoreCardPlanHospitalCash)
				lreturn.put('OutboundCplFormMoreCardPlanBenefitsPa',lOutboundCplFormMoreCardPlanBenefitsPa)
				lreturn.put('OutboundCplFormMoreCardPlanRenew',lOutboundCplFormMoreCardPlanRenew)
				lreturn.put('OutboundCplFormMoreCardPlanActive',lOutboundCplFormMoreCardPlanActive)
				lreturn.put('OutboundCplFormMoreCardPlanWait',lOutboundCplFormMoreCardPlanWait)
				lreturn.put('OutboundCplFormMoreCardPromoText',lOutboundCplFormMoreCardPromoText)
				lreturn.put('OutboundCplFormMoreOutboundButtonName',lOutboundCplFormMoreOutboundButtonName)
				lreturn.put('OutboundCplFormMoreCardDetailPartnerName',lOutboundCplFormMoreCardDetailPartnerName)
				lreturn.put('OutboundCplFormMoreCardDetailPlanName',lOutboundCplFormMoreCardDetailPlanName)
				lreturn.put('OutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer',lOutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer)
				lreturn.put('OutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer',lOutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer)
				lreturn.put('OutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer',lOutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer)
				lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer',lOutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer)
				lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee',lOutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee)
				lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee',lOutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee)
				lreturn.put('OutboundCplFormMoreCardDetailIsCoverOpd',lOutboundCplFormMoreCardDetailIsCoverOpd)
				lreturn.put('OutboundCplFormMoreCardDetailIsAddBenefitsForGender',lOutboundCplFormMoreCardDetailIsAddBenefitsForGender)
				lreturn.put('OutboundCplFormMoreCardDetailIsOtherCovid',lOutboundCplFormMoreCardDetailIsOtherCovid)
				lreturn.put('OutboundCplFormMoreCardDetailTermAndCondition',lOutboundCplFormMoreCardDetailTermAndCondition)
				lreturn.put('OutboundCplPopupFormCardDisplayPlanId',lOutboundCplPopupFormCardDisplayPlanId)
				lreturn.put('OutboundCplPopupFormCardPlanType',lOutboundCplPopupFormCardPlanType)
				lreturn.put('OutboundCplPopupFormCardPlanPartnerName',lOutboundCplPopupFormCardPlanPartnerName)
				lreturn.put('OutboundCplPopupFormCardPlanName',lOutboundCplPopupFormCardPlanName)
				lreturn.put('OutboundCplPopupFormCardPlanCoverage',lOutboundCplPopupFormCardPlanCoverage)
				lreturn.put('OutboundCplPopupFormCardPlanPaymentOptionAmount',lOutboundCplPopupFormCardPlanPaymentOptionAmount)
				lreturn.put('OutboundCplPopupFormCardPlanPaymentInstalment',lOutboundCplPopupFormCardPlanPaymentInstalment)
				lreturn.put('OutboundCplPopupFormCardModalPaymentInstalment',lOutboundCplPopupFormCardModalPaymentInstalment)
				lreturn.put('OutboundCplPopupFormCardPlanTaxDeduct',lOutboundCplPopupFormCardPlanTaxDeduct)
				lreturn.put('OutboundCplPopupFormCardPlanChemoTherapy',lOutboundCplPopupFormCardPlanChemoTherapy)
				lreturn.put('OutboundCplPopupFormCardPlanHospitalCash',lOutboundCplPopupFormCardPlanHospitalCash)
				lreturn.put('OutboundCplPopupFormCardPlanBenefitsPa',lOutboundCplPopupFormCardPlanBenefitsPa)
				lreturn.put('OutboundCplPopupFormCardPlanRenew',lOutboundCplPopupFormCardPlanRenew)
				lreturn.put('OutboundCplPopupFormCardPlanActive',lOutboundCplPopupFormCardPlanActive)
				lreturn.put('OutboundCplPopupFormCardPlanWait',lOutboundCplPopupFormCardPlanWait)
				lreturn.put('OutboundCplPopupFormCardPromoText',lOutboundCplPopupFormCardPromoText)
				lreturn.put('OutboundCplPopupFormOutboundButtonName',lOutboundCplPopupFormOutboundButtonName)
				lreturn.put('OutboundCplPopupFormCardDetailPartnerName',lOutboundCplPopupFormCardDetailPartnerName)
				lreturn.put('OutboundCplPopupFormCardDetailPlanName',lOutboundCplPopupFormCardDetailPlanName)
				lreturn.put('OutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer',lOutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer)
				lreturn.put('OutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer',lOutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer)
				lreturn.put('OutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer',lOutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer)
				lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer',lOutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer)
				lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee',lOutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee)
				lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee',lOutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee)
				lreturn.put('OutboundCplPopupFormCardDetailIsCoverOpd',lOutboundCplPopupFormCardDetailIsCoverOpd)
				lreturn.put('OutboundCplPopupFormCardDetailIsAddBenefitsForGender',lOutboundCplPopupFormCardDetailIsAddBenefitsForGender)
				lreturn.put('OutboundCplPopupFormCardDetailIsOtherCovid',lOutboundCplPopupFormCardDetailIsOtherCovid)
				lreturn.put('OutboundCplPopupFormCardDetailTermAndCondition',lOutboundCplPopupFormCardDetailTermAndCondition)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputOutboundPrefixName(String strOutboundPrefixName){
		String lreturn=''
		String lOutboundPrefixName=strOutboundPrefixName.trim()
		Map lOutboundPrefixNameList=['1':'นาย','2':'นาง','3':'นางสาว','4':'เด็กชาย','5':'เด็กหญิง']
		if(lOutboundPrefixName.length()<=0){
			lOutboundPrefixName=THAKumkaCancerResultType.DEFAULT_OUTBOUND_PREFIX_NAME
		}
		try{
			Boolean lResult=false
			String lOutboundPrefixNameItem=lOutboundPrefixNameList.get(lOutboundPrefixName)
			if(!lOutboundPrefixNameItem){
				lOutboundPrefixNameItem=lOutboundPrefixNameList.get(THAKumkaCancerResultType.DEFAULT_OUTBOUND_PREFIX_NAME)
			}
			lOutboundPrefixName=''
			String lTagSelectPrefixName='lead-form-prefix-select'
			String lLocatorSelectPrefixName=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectPrefixName)
			WebElement lElementSelectPrefixName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectPrefixName)
			if(lElementSelectPrefixName){
				Select lSelectPrefixName=new Select(lElementSelectPrefixName)
				lSelectPrefixName.selectByVisibleText(lOutboundPrefixNameItem)
				WebElement lElementSelectPrefixNameSelected=lSelectPrefixName.getFirstSelectedOption()
				lOutboundPrefixName=lElementSelectPrefixNameSelected.getText().trim()
			}
			lResult=lOutboundPrefixName.length()>0
			if(lResult){
				lreturn=lOutboundPrefixName
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputOutboundCallBackTime(String strOutboundCallBackTime){
		String lreturn=''
		String lOutboundCallBackTime=strOutboundCallBackTime.trim()
		Map lOutboundCallBackTimeList=['1':'ติดต่อได้ทันที (08.30-18.30))','2':'8:30 - 12:00','3':'12:00 - 13.00','4':'13:00 - 15.00','5':'15:00 - 17.00','6':'17:00 - 18.00']
		if(lOutboundCallBackTime.length()<=0){
			lOutboundCallBackTime=THAKumkaCancerResultType.DEFAULT_OUTBOUND_CALL_BACK_TIME
		}
		try{
			Boolean lResult=false
			String lOutboundCallBackTimeItem=lOutboundCallBackTimeList.get(lOutboundCallBackTime)
			if(!lOutboundCallBackTimeItem){
				lOutboundCallBackTimeItem=lOutboundCallBackTimeList.get(THAKumkaCancerResultType.DEFAULT_OUTBOUND_CALL_BACK_TIME)
			}
			lOutboundCallBackTime=''
			String lTagSelectCallBackTime='lead-form-call-back-time-select'
			String lLocatorSelectCallBackTime=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCallBackTime)
			WebElement lElementSelectCallBackTime=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCallBackTime)
			if(lElementSelectCallBackTime){
				Select lSelectCallBackTime=new Select(lElementSelectCallBackTime)
				lSelectCallBackTime.selectByVisibleText(lOutboundCallBackTimeItem)
				WebElement lElementSelectCallBackTimeSelected=lSelectCallBackTime.getFirstSelectedOption()
				lOutboundCallBackTime=lElementSelectCallBackTimeSelected.getText().trim()
			}
			if(lOutboundCallBackTime.length()<=0){
				lOutboundCallBackTime='No Option'
			}
			lResult=lOutboundCallBackTime.length()>0
			if(lResult){
				lreturn=lOutboundCallBackTime
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			lActualResult=IGNUemaHelper.convertBooleanToString(true)
			lResult=lActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}