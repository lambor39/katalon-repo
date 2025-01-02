package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaLoanCarResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private String saveQuoteId=''
	private String opportunityNumber=''
	public THAKumkaLoanCarResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
		String lLanguage=caseInput.Language.toString().trim()
		String lEmailToSave=caseInput.EmailToSave.toString().trim()
		String lApplyFilter=caseInput.ApplyFilter.toString().trim()
		String lFillLoansRequestAmount=caseInput.FillLoansRequestAmount.toString().trim()
		String lPositiveCaseLoansRequestAmount=caseInput.PositiveCaseLoansRequestAmount.toString().trim()
		String lLoansRequestAmount=caseInput.LoansRequestAmount.toString().trim()
		String lFillNumberOfInstalment=caseInput.FillNumberOfInstalment.toString().trim()
		String lPositiveCaseNumberOfInstalment=caseInput.PositiveCaseNumberOfInstalment.toString().trim()
		String lNumberOfInstalment=caseInput.NumberOfInstalment.toString().trim()
		String lFillTransferRights=caseInput.FillTransferRights.toString().trim()
		String lTransferRights=caseInput.TransferRights.toString().trim()
		String lFillSortingBy=caseInput.FillSortingBy.toString().trim()
		String lSortingBy=caseInput.SortingBy.toString().trim()
		String lOutboundSave=caseInput.OutboundSave.toString().trim()
		String lOutboundPrefixName=caseInput.OutboundPrefixName.toString().trim()
		String lOutboundFullName=caseInput.OutboundFullName.toString().trim()
		String lOutboundMobileNumber=caseInput.OutboundMobileNumber.toString().trim()
		String lOutboundEmailAddress=caseInput.OutboundEmailAddress.toString().trim()
		String lOutboundFillEmailAddress=caseInput.OutboundFillEmailAddress.toString().trim()
		String lOutboundCallBackTime=caseInput.OutboundCallBackTime.toString().trim()
		String lOutboundAcceptTermAndCondition=caseInput.OutboundAcceptTermAndCondition.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lDefaultSaveQuoteId=''
		String lDefaultNumberOfCards=''
		String lDefaultCarBrandModel=''
		String lDefaultCarSubModel=''
		String lDefaultLoansRequestAmountMin=''
		String lDefaultLoansRequestAmountMax=''
		String lDefaultNumberOfInstalment=''
		String lDefaultTransferRights=''
		String lDefaultSortingBy=''
		String lFilteredSaveQuoteId=''
		String lFilteredNumberOfCards=''
		String lFilteredCarBrandModel=''
		String lFilteredCarSubModel=''
		String lFilteredLoansRequestAmountMin=''
		String lFilteredLoansRequestAmountMax=''
		String lFilteredNumberOfInstalmentMax=''
		String lFilteredNumberOfInstalmentMin=''
		String lFilteredNumberOfInstalment=''
		String lFilteredTransferRights=''
		String lFilteredSortingBy=''
		String lOutboundDisplayPlanId=''
		String lOutboundBankName=''
		String lOutboundPlanName=''
		String lOutboundPlanLoanType=''
		String lOutboundGuarantorRequired=''
		String lOutboundCarInspectionRequired=''
		String lOutboundCarInsuranceRequired=''
		String lOutboundPromotionText=''
		String lOutboundLoanAmount=''
		String lOutboundMaxLoanAmount=''
		String lOutboundLoanTerm=''
		String lOutboundMonthlyInstalment=''
		String lOutboundRatePerMonth=''
		String lOutboundTotalInterest=''
		String lOutboundTotalVat=''
		String lOutboundTotalPayment=''
		String lOutboundTotalFee=''
		String lOutboundApprovalDateMessage=''
		String lOutboundSelectedLoanAmount=''
		String lOutboundSelectedMaxLoanAmount=''
		String lOutboundSelectedLoanTerm=''
		String lOutboundSelectedMonthlyInstalment=''
		String lOutboundSelectedRatePerMonth=''
		String lOutboundDetailGurantorRequired=''
		String lOutboundDetailCarInspectionRequired=''
		String lOutboundDetailCarInsuranceRequired=''
		String lOutboundSelectedStampDutyFeePercent=''
		String lOutboundSelectedStampDutyFee=''
		String lOutboundSelectedCarInspectionFee=''
		String lOutboundSelectedAdministrationFee=''
		String lOutboundSelectedContractTransferFee=''
		String lOutboundSelectedTotalVat=''
		String lOutboundSelectedTotalFee=''
		String lOutboundDetailQualificaiton=''
		String lOutboundQualificationRequired=''
		String lOutboundDetailDocumentRequire=''
		String lOutboundDocumentRequired=''
		String lOutboundDetailPromotionText=''
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
				lDefaultNumberOfCards=''
				lDefaultCarBrandModel=''
				lDefaultCarSubModel=''
				lDefaultLoansRequestAmountMin=''
				lDefaultLoansRequestAmountMax=''
				lDefaultNumberOfInstalment=''
				lDefaultTransferRights=''
				lDefaultSortingBy=''
			}else{
				lDefaultNumberOfCards=lMapOutputOfDefault.DefaultNumberOfCards
				lDefaultCarBrandModel=lMapOutputOfDefault.DefaultCarBrandModel
				lDefaultCarSubModel=lMapOutputOfDefault.DefaultCarSubModel
				lDefaultLoansRequestAmountMin=lMapOutputOfDefault.DefaultLoansRequestAmountMin
				lDefaultLoansRequestAmountMax=lMapOutputOfDefault.DefaultLoansRequestAmountMax
				lDefaultNumberOfInstalment=lMapOutputOfDefault.DefaultNumberOfInstalment
				lDefaultTransferRights=lMapOutputOfDefault.DefaultTransferRights
				lDefaultSortingBy=lMapOutputOfDefault.DefaultSortingBy
			}
			caseOutput.DefaultNumberOfCards=lDefaultNumberOfCards
			caseOutput.DefaultCarBrandModel=lDefaultCarBrandModel
			caseOutput.DefaultCarSubModel=lDefaultCarSubModel
			caseOutput.DefaultLoansRequestAmountMin=lDefaultLoansRequestAmountMin
			caseOutput.DefaultLoansRequestAmountMax=lDefaultLoansRequestAmountMax
			caseOutput.DefaultNumberOfInstalment=lDefaultNumberOfInstalment
			caseOutput.DefaultTransferRights=lDefaultTransferRights
			caseOutput.DefaultSortingBy=lDefaultSortingBy
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
			Boolean lIsFillLoansRequestAmount=IGNUemaHelper.convertStringToBoolean(lFillLoansRequestAmount)
			Boolean lIsPositiveCaseLoansRequestAmount=IGNUemaHelper.convertStringToBoolean(lPositiveCaseLoansRequestAmount)
			if(lLoansRequestAmount.length()<=0){
				Integer lLoansRequestAmountMin=IGNUemaHelper.convertStringToInteger(caseOutput.DefaultLoansRequestAmountMin,0)
				Integer lLoansRequestAmountMax=IGNUemaHelper.convertStringToInteger(caseOutput.DefaultLoansRequestAmountMax,0)
				Integer lLoansRequestAmountMid1=150000
				Integer lLoansRequestAmountMid2=(Integer)((lLoansRequestAmountMin+lLoansRequestAmountMax)/2)
				if(lLoansRequestAmountMid1<=lLoansRequestAmountMid2){
					lLoansRequestAmount=lLoansRequestAmountMid1.toString()
				}else{
					lLoansRequestAmount=lLoansRequestAmountMid2.toString()
				}
			}
			Boolean lIsFillNumberOfInstalment=IGNUemaHelper.convertStringToBoolean(lFillNumberOfInstalment)
			Boolean lIsPositiveCaseNumberOfInstalment=IGNUemaHelper.convertStringToBoolean(lPositiveCaseNumberOfInstalment)
			Boolean lIsFillTransferRights=IGNUemaHelper.convertStringToBoolean(lFillTransferRights)
			Boolean lIsFillSortingBy=IGNUemaHelper.convertStringToBoolean(lFillSortingBy)
			if(lIsApplyFilter){
				Map lMapFillLoansRequestAmount=this.inputFillLoansRequestAmount(lFillLoansRequestAmount)
				if(!lMapFillLoansRequestAmount.Result){
					lFillLoansRequestAmount=''
				}else{
					lFillLoansRequestAmount=lMapFillLoansRequestAmount.FillLoansRequestAmount
				}
				caseOutput.FillLoansRequestAmount=lFillLoansRequestAmount
				if(lFillLoansRequestAmount.length()<=0){
					return lreturn
				}
				lIsFillLoansRequestAmount=IGNUemaHelper.convertStringToBoolean(lFillLoansRequestAmount)
				if(lIsFillLoansRequestAmount){
					Map lMapPositiveCaseLoansRequestAmount=this.inputPositiveCaseLoansRequestAmount(lPositiveCaseLoansRequestAmount)
					if(!lMapPositiveCaseLoansRequestAmount.Result){
						lPositiveCaseLoansRequestAmount=''
					}else{
						lPositiveCaseLoansRequestAmount=lMapPositiveCaseLoansRequestAmount.PositiveCaseLoansRequestAmount
					}
					caseOutput.PositiveCaseLoansRequestAmount=lPositiveCaseLoansRequestAmount
					if(lPositiveCaseLoansRequestAmount.length()<=0){
						return lreturn
					}
					lIsPositiveCaseLoansRequestAmount=IGNUemaHelper.convertStringToBoolean(lPositiveCaseLoansRequestAmount)
					Map lMapLoansRequestAmount=this.inputLoansRequestAmount(lLoansRequestAmount)
					if(!lMapLoansRequestAmount.Result){
						lLoansRequestAmount=''
					}else{
						lLoansRequestAmount=lMapLoansRequestAmount.LoansRequestAmount
					}
					caseOutput.LoansRequestAmount=lLoansRequestAmount
					if(lLoansRequestAmount.length()<=0){
						return lreturn
					}
				}
				Map lMapFillNumberOfInstalment=this.inputFillNumberOfInstalment(lFillNumberOfInstalment)
				if(!lMapFillNumberOfInstalment.Result){
					lFillNumberOfInstalment=''
				}else{

					lFillNumberOfInstalment=lMapFillNumberOfInstalment.FillNumberOfInstalment
				}
				caseOutput.FillNumberOfInstalment=lFillNumberOfInstalment
				if(lFillNumberOfInstalment.length()<=0){
					return lreturn
				}
				lIsFillNumberOfInstalment=IGNUemaHelper.convertStringToBoolean(lFillNumberOfInstalment)
				if(lIsFillNumberOfInstalment){
					Map lMapPositiveCaseNumberOfInstalment=this.inputPositiveCaseNumberOfInstalment(lPositiveCaseNumberOfInstalment)
					if(!lMapPositiveCaseNumberOfInstalment.Result){
						lPositiveCaseNumberOfInstalment=''
					}else{
						lPositiveCaseNumberOfInstalment=lMapPositiveCaseNumberOfInstalment.PositiveCaseNumberOfInstalment
					}
					caseOutput.PositiveCaseNumberOfInstalment=lPositiveCaseNumberOfInstalment
					if(lPositiveCaseNumberOfInstalment.length()<=0){
						return lreturn
					}
					lIsPositiveCaseNumberOfInstalment=IGNUemaHelper.convertStringToBoolean(lPositiveCaseNumberOfInstalment)
					Map lMapNumberOfInstalment=this.inputNumberOfInstalment(lNumberOfInstalment)
					if(!lMapNumberOfInstalment.Result){
						lFilteredNumberOfInstalmentMax=''
						lFilteredNumberOfInstalmentMin=''
						lNumberOfInstalment=''
					}else{
						lFilteredNumberOfInstalmentMax=lMapNumberOfInstalment.FilteredNumberOfInstalmentMax
						lFilteredNumberOfInstalmentMin=lMapNumberOfInstalment.FilteredNumberOfInstalmentMin
						lNumberOfInstalment=lMapNumberOfInstalment.NumberOfInstalment
					}
					caseOutput.FilteredNumberOfInstalmentMax=lFilteredNumberOfInstalmentMax
					caseOutput.FilteredNumberOfInstalmentMin=lFilteredNumberOfInstalmentMin
					caseOutput.NumberOfInstalment=lNumberOfInstalment
					if(lNumberOfInstalment.length()<=0){
						return lreturn
					}
				}
				Map lMapFillTransferRights=this.inputFillTransferRights(lFillTransferRights)
				if(!lMapFillTransferRights.Result){
					lFillTransferRights=''
				}else{
					lFillTransferRights=lMapFillTransferRights.FillTransferRights
				}
				caseOutput.FillTransferRights=lFillTransferRights
				if(lFillTransferRights.length()<=0){
					return lreturn
				}
				lIsFillTransferRights=IGNUemaHelper.convertStringToBoolean(lFillTransferRights)
				if(lIsFillTransferRights){
					Map lMapTransferRights=this.inputTransferRights(lTransferRights)
					if(!lMapTransferRights.Result){
						lTransferRights=''
					}else{
						lTransferRights=lMapTransferRights.TransferRights
					}
					caseOutput.TransferRights=lTransferRights
					if(lTransferRights.length()<=0){
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
				lIsFillSortingBy=IGNUemaHelper.convertStringToBoolean(lFillSortingBy)
				if(lIsFillSortingBy){
					Map lMapSortingBy=this.inputSortingBy(lSortingBy)
					if(!lMapSortingBy.Result){
						lSortingBy=''
					}else{
						lSortingBy=lMapSortingBy.SortingBy
					}
					caseOutput.SortingBy=lSortingBy
					if(lSortingBy.length()<=0){
						return lreturn
					}
				}
				Map lMapOutputOfFiltered=this.inputOutputOfFiltered()
				if(!lMapOutputOfDefault.Result){
					lFilteredNumberOfCards=''
					lFilteredCarBrandModel=''
					lFilteredCarSubModel=''
					lFilteredLoansRequestAmountMin=''
					lFilteredLoansRequestAmountMax=''
					lFilteredNumberOfInstalment=''
					lFilteredTransferRights=''
					lFilteredSortingBy=''
				}else{
					lFilteredNumberOfCards=lMapOutputOfFiltered.FilteredNumberOfCards
					lFilteredCarBrandModel=lMapOutputOfFiltered.FilteredCarBrandModel
					lFilteredCarSubModel=lMapOutputOfFiltered.FilteredCarSubModel
					lFilteredLoansRequestAmountMin=lMapOutputOfFiltered.FilteredLoansRequestAmountMin
					lFilteredLoansRequestAmountMax=lMapOutputOfFiltered.FilteredLoansRequestAmountMax
					lFilteredNumberOfInstalment=lMapOutputOfFiltered.FilteredNumberOfInstalment
					lFilteredTransferRights=lMapOutputOfFiltered.FilteredTransferRights
					lFilteredSortingBy=lMapOutputOfFiltered.FilteredSortingBy
				}
				caseOutput.FilteredNumberOfCards=lFilteredNumberOfCards
				caseOutput.FilteredCarBrandModel=lFilteredCarBrandModel
				caseOutput.FilteredCarSubModel=lFilteredCarSubModel
				caseOutput.FilteredLoansRequestAmountMin=lFilteredLoansRequestAmountMin
				caseOutput.FilteredLoansRequestAmountMax=lFilteredLoansRequestAmountMax
				caseOutput.FilteredNumberOfInstalment=lFilteredNumberOfInstalment
				caseOutput.FilteredTransferRights=lFilteredTransferRights
				caseOutput.FilteredSortingBy=lFilteredSortingBy
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
			Map lMapOutboundSave=this.inputOutboundSave(lOutboundSave)
			if(!lMapOutboundSave.Result){
				lOutboundSave=''
				lOutboundDisplayPlanId=''
				lOutboundBankName=''
				lOutboundPlanName=''
				lOutboundPlanLoanType=''
				lOutboundGuarantorRequired=''
				lOutboundCarInspectionRequired=''
				lOutboundCarInsuranceRequired=''
				lOutboundPromotionText=''
				lOutboundLoanAmount=''
				lOutboundMaxLoanAmount=''
				lOutboundLoanTerm=''
				lOutboundMonthlyInstalment=''
				lOutboundRatePerMonth=''
				lOutboundTotalInterest=''
				lOutboundTotalVat=''
				lOutboundTotalPayment=''
				lOutboundTotalFee=''
				lOutboundApprovalDateMessage=''
				lOutboundSelectedLoanAmount=''
				lOutboundSelectedMaxLoanAmount=''
				lOutboundSelectedLoanTerm=''
				lOutboundSelectedMonthlyInstalment=''
				lOutboundSelectedRatePerMonth=''
				lOutboundDetailGurantorRequired=''
				lOutboundDetailCarInspectionRequired=''
				lOutboundDetailCarInsuranceRequired=''
				lOutboundSelectedStampDutyFeePercent=''
				lOutboundSelectedStampDutyFee=''
				lOutboundSelectedCarInspectionFee=''
				lOutboundSelectedAdministrationFee=''
				lOutboundSelectedContractTransferFee=''
				lOutboundSelectedTotalVat=''
				lOutboundSelectedTotalFee=''
				lOutboundDetailQualificaiton=''
				lOutboundQualificationRequired=''
				lOutboundDetailDocumentRequire=''
				lOutboundDocumentRequired=''
				lOutboundDetailPromotionText=''
			}else{
				lOutboundSave=lMapOutboundSave.OutboundSave
				lOutboundDisplayPlanId=lMapOutboundSave.OutboundDisplayPlanId
				lOutboundBankName=lMapOutboundSave.OutboundBankName
				lOutboundPlanName=lMapOutboundSave.OutboundPlanName
				lOutboundPlanLoanType=lMapOutboundSave.OutboundPlanLoanType
				lOutboundGuarantorRequired=lMapOutboundSave.OutboundGuarantorRequired
				lOutboundCarInspectionRequired=lMapOutboundSave.OutboundCarInspectionRequired
				lOutboundCarInsuranceRequired=lMapOutboundSave.OutboundCarInsuranceRequired
				lOutboundPromotionText=lMapOutboundSave.OutboundPromotionText
				lOutboundLoanAmount=lMapOutboundSave.OutboundLoanAmount
				lOutboundMaxLoanAmount=lMapOutboundSave.OutboundMaxLoanAmount
				lOutboundLoanTerm=lMapOutboundSave.OutboundLoanTerm
				lOutboundMonthlyInstalment=lMapOutboundSave.OutboundMonthlyInstalment
				lOutboundRatePerMonth=lMapOutboundSave.OutboundRatePerMonth
				lOutboundTotalInterest=lMapOutboundSave.OutboundTotalInterest
				lOutboundTotalVat=lMapOutboundSave.OutboundTotalVat
				lOutboundTotalPayment=lMapOutboundSave.OutboundTotalPayment
				lOutboundTotalFee=lMapOutboundSave.OutboundTotalFee
				lOutboundApprovalDateMessage=lMapOutboundSave.OutboundApprovalDateMessage
				lOutboundSelectedLoanAmount=lMapOutboundSave.OutboundSelectedLoanAmount
				lOutboundSelectedMaxLoanAmount=lMapOutboundSave.OutboundSelectedMaxLoanAmount
				lOutboundSelectedLoanTerm=lMapOutboundSave.OutboundSelectedLoanTerm
				lOutboundSelectedMonthlyInstalment=lMapOutboundSave.OutboundSelectedMonthlyInstalment
				lOutboundSelectedRatePerMonth=lMapOutboundSave.OutboundSelectedRatePerMonth
				lOutboundDetailGurantorRequired=lMapOutboundSave.OutboundDetailGurantorRequired
				lOutboundDetailCarInspectionRequired=lMapOutboundSave.OutboundDetailCarInspectionRequired
				lOutboundDetailCarInsuranceRequired=lMapOutboundSave.OutboundDetailCarInsuranceRequired
				lOutboundSelectedStampDutyFeePercent=lMapOutboundSave.OutboundSelectedStampDutyFeePercent
				lOutboundSelectedStampDutyFee=lMapOutboundSave.OutboundSelectedStampDutyFee
				lOutboundSelectedCarInspectionFee=lMapOutboundSave.OutboundSelectedCarInspectionFee
				lOutboundSelectedAdministrationFee=lMapOutboundSave.OutboundSelectedAdministrationFee
				lOutboundSelectedContractTransferFee=lMapOutboundSave.OutboundSelectedContractTransferFee
				lOutboundSelectedTotalVat=lMapOutboundSave.OutboundSelectedTotalVat
				lOutboundSelectedTotalFee=lMapOutboundSave.OutboundSelectedTotalFee
				lOutboundDetailQualificaiton=lMapOutboundSave.OutboundDetailQualificaiton
				lOutboundQualificationRequired=lMapOutboundSave.OutboundQualificationRequired
				lOutboundDetailDocumentRequire=lMapOutboundSave.OutboundDetailDocumentRequire
				lOutboundDocumentRequired=lMapOutboundSave.OutboundDocumentRequired
				lOutboundDetailPromotionText=lMapOutboundSave.OutboundDetailPromotionText
			}
			caseOutput.OutboundSave=lOutboundSave
			caseOutput.OutboundDisplayPlanId=lOutboundDisplayPlanId
			caseOutput.OutboundBankName=lOutboundBankName
			caseOutput.OutboundPlanName=lOutboundPlanName
			caseOutput.OutboundPlanLoanType=lOutboundPlanLoanType
			caseOutput.OutboundGuarantorRequired=lOutboundGuarantorRequired
			caseOutput.OutboundCarInspectionRequired=lOutboundCarInspectionRequired
			caseOutput.OutboundCarInsuranceRequired=lOutboundCarInsuranceRequired
			caseOutput.OutboundPromotionText=lOutboundPromotionText
			caseOutput.OutboundLoanAmount=lOutboundLoanAmount
			caseOutput.OutboundMaxLoanAmount=lOutboundMaxLoanAmount
			caseOutput.OutboundLoanTerm=lOutboundLoanTerm
			caseOutput.OutboundMonthlyInstalment=lOutboundMonthlyInstalment
			caseOutput.OutboundRatePerMonth=lOutboundRatePerMonth
			caseOutput.OutboundTotalInterest=lOutboundTotalInterest
			caseOutput.OutboundTotalVat=lOutboundTotalVat
			caseOutput.OutboundTotalPayment=lOutboundTotalPayment
			caseOutput.OutboundTotalFee=lOutboundTotalFee
			caseOutput.OutboundApprovalDateMessage=lOutboundApprovalDateMessage
			caseOutput.OutboundSelectedLoanAmount=lOutboundSelectedLoanAmount
			caseOutput.OutboundSelectedMaxLoanAmount=lOutboundSelectedMaxLoanAmount
			caseOutput.OutboundSelectedLoanTerm=lOutboundSelectedLoanTerm
			caseOutput.OutboundSelectedMonthlyInstalment=lOutboundSelectedMonthlyInstalment
			caseOutput.OutboundSelectedRatePerMonth=lOutboundSelectedRatePerMonth
			caseOutput.OutboundDetailGurantorRequired=lOutboundDetailGurantorRequired
			caseOutput.OutboundDetailCarInspectionRequired=lOutboundDetailCarInspectionRequired
			caseOutput.OutboundDetailCarInsuranceRequired=lOutboundDetailCarInsuranceRequired
			caseOutput.OutboundSelectedStampDutyFeePercent=lOutboundSelectedStampDutyFeePercent
			caseOutput.OutboundSelectedStampDutyFee=lOutboundSelectedStampDutyFee
			caseOutput.OutboundSelectedCarInspectionFee=lOutboundSelectedCarInspectionFee
			caseOutput.OutboundSelectedAdministrationFee=lOutboundSelectedAdministrationFee
			caseOutput.OutboundSelectedContractTransferFee=lOutboundSelectedContractTransferFee
			caseOutput.OutboundSelectedTotalVat=lOutboundSelectedTotalVat
			caseOutput.OutboundSelectedTotalFee=lOutboundSelectedTotalFee
			caseOutput.OutboundDetailQualificaiton=lOutboundDetailQualificaiton
			caseOutput.OutboundQualificationRequired=lOutboundQualificationRequired
			caseOutput.OutboundDetailDocumentRequire=lOutboundDetailDocumentRequire
			caseOutput.OutboundDocumentRequired=lOutboundDocumentRequired
			caseOutput.OutboundDetailPromotionText=lOutboundDetailPromotionText
			if(lOutboundSave.length()<=0){
				return lreturn
			}
			Boolean lIsOutboundSave=IGNUemaHelper.convertStringToBoolean(lOutboundSave)
			if(lIsOutboundSave){
				Map lMapOutboundPrefixName=this.inputOutboundPrefixName(lOutboundPrefixName)
				if(!lMapOutboundPrefixName.Result){
					lOutboundPrefixName=''
				}else{
					lOutboundPrefixName=lMapOutboundPrefixName.OutboundPrefixName
				}
				caseOutput.OutboundPrefixName=lOutboundPrefixName
				if(lOutboundPrefixName.length()<=0){
					return lreturn
				}
				Map lMapOutboundFullName=this.inputOutboundFullName(lOutboundFullName)
				if(!lMapOutboundFullName.Result){
					lOutboundFullName=''
				}else{
					lOutboundFullName=lMapOutboundFullName.OutboundFullName
				}
				caseOutput.OutboundFullName=lOutboundFullName
				if(lOutboundFullName.length()<=0){
					return lreturn
				}
				Map lMapOutboundMobileNumber=this.inputOutboundMobileNumber(lOutboundMobileNumber)
				if(!lMapOutboundMobileNumber.Result){
					lOutboundMobileNumber=''
				}else{
					lOutboundMobileNumber=lMapOutboundMobileNumber.OutboundMobileNumber
				}
				caseOutput.OutboundMobileNumber=lOutboundMobileNumber
				if(lOutboundMobileNumber.length()<=0){
					return lreturn
				}
				Map lMapOutboundFillEmailAddress=this.inputOutboundFillEmailAddress(lOutboundFillEmailAddress)
				if(!lMapOutboundFillEmailAddress.Result){
					lOutboundFillEmailAddress=''
				}else{
					lOutboundFillEmailAddress=lMapOutboundFillEmailAddress.OutboundFillEmailAddress
				}
				caseOutput.OutboundFillEmailAddress=lOutboundFillEmailAddress
				if(lOutboundFillEmailAddress.length()<=0){
					return lreturn
				}
				Boolean lIsOutboundFillEmailAddress=IGNUemaHelper.convertStringToBoolean(lOutboundFillEmailAddress)
				if(lIsOutboundFillEmailAddress){
					Map lMapOutboundEmailAddress=this.inputOutboundEmailAddress(lOutboundEmailAddress)
					if(!lMapOutboundEmailAddress.Result){
						lOutboundEmailAddress=''
					}else{
						lOutboundEmailAddress=lMapOutboundEmailAddress.OutboundEmailAddress
					}
					caseOutput.OutboundEmailAddress=lOutboundEmailAddress
					if(lOutboundEmailAddress.length()<=0){
						return lreturn
					}
				}
				Map lMapOutboundCallBackTime=this.inputOutboundCallBackTime(lOutboundCallBackTime)
				if(!lMapOutboundCallBackTime.Result){
					lOutboundCallBackTime=''
				}else{
					lOutboundCallBackTime=lMapOutboundCallBackTime.OutboundCallBackTime
				}
				caseOutput.OutboundCallBackTime=lOutboundCallBackTime
				if(lOutboundCallBackTime.length()<=0){
					return lreturn
				}
				Map lMapOutboundAcceptTermAndCondition=this.inputOutboundAcceptTermAndCondition(lOutboundAcceptTermAndCondition)
				if(!lMapOutboundAcceptTermAndCondition.Result){
					lOutboundAcceptTermAndCondition=''
				}else{
					lOutboundAcceptTermAndCondition=lMapOutboundAcceptTermAndCondition.OutboundAcceptTermAndCondition
				}
				caseOutput.OutboundAcceptTermAndCondition=lOutboundAcceptTermAndCondition
				if(lOutboundAcceptTermAndCondition.length()<=0){
					return lreturn
				}
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsOutboundSave)
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
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THAKumkaLoanCarInputType.DEFAULT_POSITIVE_CASE
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
				lLanguageItem=lLanguageList.get(THAKumkaLoanCarResultType.DEFAULT_LANGUAGE.toUpperCase())
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
				lLanguage=THAKumkaLoanCarResultType.DEFAULT_LANGUAGE
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
			lEmailToSave=THAKumkaLoanCarResultType.DEFAULT_EMAIL_TO_SAVE
		}
		try{
			Boolean lResult=false
			lreturn.put('EmailToSave','')
			lreturn.put('SaveQuoteId','')
			lreturn.put('Result',lResult)
			String lTagSaveQuote='#save-quote-modal'
			Boolean lSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagSaveQuote,60)
			if(!isForDefault){
				String lTagButtonOpenSaveQuote='open-save-quote-modal-btn'
				String lLocatorButtonOpenSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonOpenSaveQuote)
				if(!lSaveQuoteVisible){
					IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagButtonOpenSaveQuote))
					lSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagSaveQuote,10)
				}
				if(!lSaveQuoteVisible){
					WebElement lElementButtonOpenSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonOpenSaveQuote)
					if(!lElementButtonOpenSaveQuote){
						return lreturn
					}
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonOpenSaveQuote)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonOpenSaveQuote)
					lSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagSaveQuote,10)
				}
			}
			String lTagInputText='mr-kumka-save-quote-email-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			if(!lSaveQuoteVisible){
				lEmailToSave='No Option'
			}else{
				lEmailToSave=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lEmailToSave)
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('save-quote-btn'))
			}
			lResult=lEmailToSave.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mr-kumka-save-quote-modal-close'))
			String lTagSaveQuoteIdText='saveQuoteId'
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
				String lPrefixURLText='https://compare.uat-mrkumka.com/carloan/#/redirect?utm_source=MrKumka-Carloan-SaveQuote&saveQuoteid='
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
	public Map inputOutputOfDefault(){
		Map lreturn=[:]
		String lDefaultNumberOfCards=''
		String lDefaultCarBrandModel=''
		String lDefaultCarSubModel=''
		String lDefaultLoansRequestAmountMin=''
		String lDefaultLoansRequestAmountMax=''
		String lDefaultNumberOfInstalment=''
		String lDefaultTransferRights=''
		String lDefaultSortingBy=''
		try{
			Boolean lResult=false
			lreturn.put('DefaultNumberOfCards','')
			lreturn.put('DefaultCarBrandModel','')
			lreturn.put('DefaultCarSubModel','')
			lreturn.put('DefaultLoansRequestAmountMin','')
			lreturn.put('DefaultLoansRequestAmountMax','')
			lreturn.put('DefaultNumberOfInstalment','')
			lreturn.put('DefaultTransferRights','')
			lreturn.put('DefaultSortingBy','')
			lreturn.put('Result',lResult)
			Boolean lIsOK=false
			Integer lDefaultNumberOfCardsNum=0
			String lTagListOfCardResultList='display-plan-id_gray_filter'
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
			String lTagCarBrandModel='info-brand-model'
			String lLocatorCarBrandModel=IGNUemaHelper.getTagDataSeleniumKey(lTagCarBrandModel)
			WebElement lElementCarBrandModel=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarBrandModel)
			if(!lElementCarBrandModel){
				return lreturn
			}
			lDefaultCarBrandModel=lElementCarBrandModel.getText().trim()
			lIsOK=lDefaultCarBrandModel.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagCarSubModel='info-year-sub-model'
			String lLocatorCarSubModel=IGNUemaHelper.getTagDataSeleniumKey(lTagCarSubModel)
			WebElement lElementCarSubModel=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarSubModel)
			if(!lElementCarSubModel){
				return lreturn
			}
			lDefaultCarSubModel=lElementCarSubModel.getText().trim()
			lIsOK=lDefaultCarSubModel.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagLoansRequestAmount='filter-loan-amount-input'
			String lLocatorLoansRequestAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagLoansRequestAmount)
			WebElement lElementLoansRequestAmount=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagLoansRequestAmount)
			if(!lElementLoansRequestAmount){
				return lreturn
			}
			String lDefaultLoansRequestAmountText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementLoansRequestAmount,'placeholder').trim()
			lIsOK=lDefaultLoansRequestAmountText.length()>0
			if(!lIsOK){
				return lreturn
			}
			String[] lDefaultLoansRequestAmountTextList=lDefaultLoansRequestAmountText.split('-')
			if(lDefaultLoansRequestAmountTextList.size()<2){
				return lreturn
			}
			lDefaultLoansRequestAmountMin=IGNUemaHelper.convertStringToInteger(lDefaultLoansRequestAmountTextList[0],0)
			Integer lDefaultLoansRequestAmountMinNum=Integer.parseInt(lDefaultLoansRequestAmountMin)
			lDefaultLoansRequestAmountMin=lDefaultLoansRequestAmountMinNum.toString()
			lDefaultLoansRequestAmountMax=IGNUemaHelper.convertStringToInteger(lDefaultLoansRequestAmountTextList[1],0)
			Integer lDefaultLoansRequestAmountMaxNum=Integer.parseInt(lDefaultLoansRequestAmountMax)
			lDefaultLoansRequestAmountMax=lDefaultLoansRequestAmountMaxNum.toString()
			lIsOK=(lDefaultLoansRequestAmountMinNum<=lDefaultLoansRequestAmountMaxNum)
			if(!lIsOK){
				return lreturn
			}
			String lTagNumberOfInstalment='filter-loan-term'
			String lLocatorNumberOfInstalment=IGNUemaHelper.getTagDataSeleniumKey(lTagNumberOfInstalment)
			WebElement lElementNumberOfInstalment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagNumberOfInstalment)
			if(!lElementNumberOfInstalment){
				return lreturn
			}
			lDefaultNumberOfInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementNumberOfInstalment)
			lIsOK=lDefaultNumberOfInstalment.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagTransferRights='filter-loan-type'
			String lLocatorTransferRights=IGNUemaHelper.getTagDataSeleniumKey(lTagTransferRights)
			List<WebElement> lElementTransferRightsList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagTransferRights)
			if(!lElementTransferRightsList){
				return lreturn
			}
			WebElement lElementTransferRightsParent=null
			for(WebElement lElementTransferRightsItem in lElementTransferRightsList){
				lElementTransferRightsParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementTransferRightsItem)
				if(lElementTransferRightsParent){
					if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementTransferRightsParent,'active')){
						lDefaultTransferRights=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTransferRightsItem)
						break
					}
				}
			}
			lIsOK=lDefaultTransferRights.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagSortingBy='sorting'
			String lLocatorSortingBy=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingBy)
			List<WebElement> lElementSortingByList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagSortingBy)
			if(!lElementSortingByList){
				return lreturn
			}
			WebElement lElementSortingByParent=null
			for(WebElement lElementSortingByItem in lElementSortingByList){
				lElementSortingByParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementSortingByItem)
				if(lElementSortingByParent){
					if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementSortingByParent,'show')){
						lDefaultSortingBy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingByItem)
						break
					}
				}
			}
			lIsOK=lDefaultSortingBy.length()>0
			if(!lIsOK){
				return lreturn
			}
			if(IGNUemaHelper.CURRENT_ENABLE_WRITE_REPORT_DETAIL_LIST){
				if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
					THAKumkaLoanCarResult_OutputUtil lOutputUtil=new THAKumkaLoanCarResult_OutputUtil(this.driver,this.selenium)
					lIsOK=lOutputUtil.outputListSave(true)
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('DefaultNumberOfCards',lDefaultNumberOfCards)
				lreturn.put('DefaultCarBrandModel',lDefaultCarBrandModel)
				lreturn.put('DefaultCarSubModel',lDefaultCarSubModel)
				lreturn.put('DefaultLoansRequestAmountMin',lDefaultLoansRequestAmountMin)
				lreturn.put('DefaultLoansRequestAmountMax',lDefaultLoansRequestAmountMax)
				lreturn.put('DefaultNumberOfInstalment',lDefaultNumberOfInstalment)
				lreturn.put('DefaultTransferRights',lDefaultTransferRights)
				lreturn.put('DefaultSortingBy',lDefaultSortingBy)
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
		String lFilteredCarBrandModel=''
		String lFilteredCarSubModel=''
		String lFilteredLoansRequestAmountMin=''
		String lFilteredLoansRequestAmountMax=''
		String lFilteredNumberOfInstalment=''
		String lFilteredTransferRights=''
		String lFilteredSortingBy=''
		try{
			Boolean lResult=false
			lreturn.put('FilteredNumberOfCards','')
			lreturn.put('FilteredCarBrandModel','')
			lreturn.put('FilteredCarSubModel','')
			lreturn.put('FilteredLoansRequestAmountMin','')
			lreturn.put('FilteredLoansRequestAmountMax','')
			lreturn.put('FilteredNumberOfInstalment','')
			lreturn.put('FilteredTransferRights','')
			lreturn.put('FilteredSortingBy','')
			Boolean lIsOK=false
			Integer lFilteredNumberOfCardsNum=0
			String lTagListOfCardResultList='display-plan-id_gray_filter'
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
			String lTagCarBrandModel='info-brand-model'
			String lLocatorCarBrandModel=IGNUemaHelper.getTagDataSeleniumKey(lTagCarBrandModel)
			WebElement lElementCarBrandModel=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarBrandModel)
			if(!lElementCarBrandModel){
				return lreturn
			}
			lFilteredCarBrandModel=lElementCarBrandModel.getText().trim()
			lIsOK=lFilteredCarBrandModel.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagCarSubModel='info-year-sub-model'
			String lLocatorCarSubModel=IGNUemaHelper.getTagDataSeleniumKey(lTagCarSubModel)
			WebElement lElementCarSubModel=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarSubModel)
			if(!lElementCarSubModel){
				return lreturn
			}
			lFilteredCarSubModel=lElementCarSubModel.getText().trim()
			lIsOK=lFilteredCarSubModel.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagLoansRequestAmount='filter-loan-amount-input'
			String lLocatorLoansRequestAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagLoansRequestAmount)
			WebElement lElementLoansRequestAmount=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagLoansRequestAmount)
			if(!lElementLoansRequestAmount){
				return lreturn
			}
			String lFilteredLoansRequestAmountText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementLoansRequestAmount,'placeholder').trim()
			lIsOK=lFilteredLoansRequestAmountText.length()>0
			if(!lIsOK){
				return lreturn
			}
			String[] lFilteredLoansRequestAmountTextList=lFilteredLoansRequestAmountText.split('-')
			if(lFilteredLoansRequestAmountTextList.size()<2){
				return lreturn
			}
			lFilteredLoansRequestAmountMin=IGNUemaHelper.convertStringToInteger(lFilteredLoansRequestAmountTextList[0],0)
			Integer lFilteredLoansRequestAmountMinNum=Integer.parseInt(lFilteredLoansRequestAmountMin)
			lFilteredLoansRequestAmountMin=lFilteredLoansRequestAmountMinNum.toString()
			lFilteredLoansRequestAmountMax=IGNUemaHelper.convertStringToInteger(lFilteredLoansRequestAmountTextList[1],0)
			Integer lFilteredLoansRequestAmountMaxNum=Integer.parseInt(lFilteredLoansRequestAmountMax)
			lFilteredLoansRequestAmountMax=lFilteredLoansRequestAmountMaxNum.toString()
			lIsOK=(lFilteredLoansRequestAmountMinNum<=lFilteredLoansRequestAmountMaxNum)
			if(!lIsOK){
				return lreturn
			}
			String lTagNumberOfInstalment='filter-loan-term'
			String lLocatorNumberOfInstalment=IGNUemaHelper.getTagDataSeleniumKey(lTagNumberOfInstalment)
			WebElement lElementNumberOfInstalment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagNumberOfInstalment)
			if(!lElementNumberOfInstalment){
				return lreturn
			}
			lFilteredNumberOfInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementNumberOfInstalment)
			lIsOK=lFilteredNumberOfInstalment.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagTransferRights='filter-loan-type'
			String lLocatorTransferRights=IGNUemaHelper.getTagDataSeleniumKey(lTagTransferRights)
			List<WebElement> lElementTransferRightsList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagTransferRights)
			if(!lElementTransferRightsList){
				return lreturn
			}
			WebElement lElementTransferRightsParent=null
			for(WebElement lElementTransferRightsItem in lElementTransferRightsList){
				lElementTransferRightsParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementTransferRightsItem)
				if(lElementTransferRightsParent){
					if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementTransferRightsParent,'active')){
						lFilteredTransferRights=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTransferRightsItem)
						break
					}
				}
			}
			lIsOK=lFilteredTransferRights.length()>0
			if(!lIsOK){
				return lreturn
			}
			String lTagSortingBy='sorting'
			String lLocatorSortingBy=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingBy)
			List<WebElement> lElementSortingByList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagSortingBy)
			if(!lElementSortingByList){
				return lreturn
			}
			WebElement lElementSortingByParent=null
			for(WebElement lElementSortingByItem in lElementSortingByList){
				lElementSortingByParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementSortingByItem)
				if(lElementSortingByParent){
					if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementSortingByParent,'show')){
						lFilteredSortingBy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingByItem)
						break
					}
				}
			}
			lIsOK=lFilteredSortingBy.length()>0
			if(!lIsOK){
				return lreturn
			}
			if(IGNUemaHelper.CURRENT_ENABLE_WRITE_REPORT_DETAIL_LIST){
				if(!IGNUemaHelper.checkRemoteTargetDriverExecution()){
					THAKumkaLoanCarResult_OutputUtil lOutputUtil=new THAKumkaLoanCarResult_OutputUtil(this.driver,this.selenium)
					lIsOK=lOutputUtil.outputListSave(false)
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('FilteredNumberOfCards',lFilteredNumberOfCards)
				lreturn.put('FilteredCarBrandModel',lFilteredCarBrandModel)
				lreturn.put('FilteredCarSubModel',lFilteredCarSubModel)
				lreturn.put('FilteredLoansRequestAmountMin',lFilteredLoansRequestAmountMin)
				lreturn.put('FilteredLoansRequestAmountMax',lFilteredLoansRequestAmountMax)
				lreturn.put('FilteredNumberOfInstalment',lFilteredNumberOfInstalment)
				lreturn.put('FilteredTransferRights',lFilteredTransferRights)
				lreturn.put('FilteredSortingBy',lFilteredSortingBy)
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
			lApplyFilter=THAKumkaLoanCarResultType.DEFAULT_APPLY_FILTER
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
	public Map inputFillLoansRequestAmount(String strFillLoansRequestAmount){
		Map lreturn=[:]
		String lFillLoansRequestAmount=strFillLoansRequestAmount.trim()
		if(lFillLoansRequestAmount.length()<=0){
			lFillLoansRequestAmount=THAKumkaLoanCarResultType.DEFAULT_FILL_LOANS_REQUEST_AMOUNT
		}
		try{
			Boolean lResult=false
			lreturn.put('FillLoansRequestAmount','')
			lreturn.put('Result',lResult)
			Boolean lIsFillLoansRequestAmount=IGNUemaHelper.convertStringToBoolean(lFillLoansRequestAmount)
			lFillLoansRequestAmount=IGNUemaHelper.convertBooleanToString(lIsFillLoansRequestAmount)
			lResult=lFillLoansRequestAmount.length()>0
			if(lResult){
				lreturn.put('FillLoansRequestAmount',lFillLoansRequestAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCaseLoansRequestAmount(String strPositiveCaseLoansRequestAmount){
		Map lreturn=[:]
		String lPositiveCaseLoansRequestAmount=strPositiveCaseLoansRequestAmount.trim()
		if(lPositiveCaseLoansRequestAmount.length()<=0){
			lPositiveCaseLoansRequestAmount=THAKumkaLoanCarResultType.DEFAULT_POSITIVE_CASE_LOANS_REQUEST_AMOUNT
		}
		try{
			Boolean lResult=false
			lreturn.put('PositiveCaseLoansRequestAmount','')
			lreturn.put('Result',lResult)
			Boolean lIsPositiveCaseLoansRequestAmount=IGNUemaHelper.convertStringToBoolean(lPositiveCaseLoansRequestAmount)
			lPositiveCaseLoansRequestAmount=IGNUemaHelper.convertBooleanToString(lIsPositiveCaseLoansRequestAmount)
			lResult=lPositiveCaseLoansRequestAmount.length()>0
			if(lResult){
				lreturn.put('PositiveCaseLoansRequestAmount',lPositiveCaseLoansRequestAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoansRequestAmount(String strLoansRequestAmount){
		Map lreturn=[:]
		String lLoansRequestAmount=strLoansRequestAmount.trim()
		if(lLoansRequestAmount.length()<=0){
			lLoansRequestAmount=THAKumkaLoanCarResultType.DEFAULT_LOANS_REQUEST_AMOUNT
		}
		try{
			Boolean lResult=false
			lreturn.put('LoansRequestAmount','')
			lreturn.put('Result',lResult)
			String lTagInputText='filter-loan-amount-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lLoansRequestAmount=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lLoansRequestAmount)
			lResult=lLoansRequestAmount.length()>0
			if(lResult){
				lreturn.put('LoansRequestAmount',lLoansRequestAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillNumberOfInstalment(String strFillNumberOfInstalment){
		Map lreturn=[:]
		String lFillNumberOfInstalment=strFillNumberOfInstalment.trim()
		if(lFillNumberOfInstalment.length()<=0){
			lFillNumberOfInstalment=THAKumkaLoanCarResultType.DEFAULT_FILL_NUMBER_OF_INSTALMENT
		}
		try{
			Boolean lResult=false
			lreturn.put('FillNumberOfInstalment','')
			lreturn.put('Result',lResult)
			Boolean lIsFillNumberOfInstalment=IGNUemaHelper.convertStringToBoolean(lFillNumberOfInstalment)
			lFillNumberOfInstalment=IGNUemaHelper.convertBooleanToString(lIsFillNumberOfInstalment)
			lResult=lFillNumberOfInstalment.length()>0
			if(lResult){
				lreturn.put('FillNumberOfInstalment',lFillNumberOfInstalment)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCaseNumberOfInstalment(String strPositiveCaseNumberOfInstalment){
		Map lreturn=[:]
		String lPositiveCaseNumberOfInstalment=strPositiveCaseNumberOfInstalment.trim()
		if(lPositiveCaseNumberOfInstalment.length()<=0){
			lPositiveCaseNumberOfInstalment=THAKumkaLoanCarResultType.DEFAULT_POSITIVE_CASE_NUMBER_OF_INSTALMENT
		}
		try{
			Boolean lResult=false
			lreturn.put('PositiveCaseNumberOfInstalment','')
			lreturn.put('Result',lResult)
			Boolean lIsPositiveCaseNumberOfInstalment=IGNUemaHelper.convertStringToBoolean(lPositiveCaseNumberOfInstalment)
			lPositiveCaseNumberOfInstalment=IGNUemaHelper.convertBooleanToString(lIsPositiveCaseNumberOfInstalment)
			lResult=lPositiveCaseNumberOfInstalment.length()>0
			if(lResult){
				lreturn.put('PositiveCaseNumberOfInstalment',lPositiveCaseNumberOfInstalment)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputNumberOfInstalment(String strNumberOfInstalment){
		Map lreturn=[:]
		String lFilteredNumberOfInstalmentMax=''
		String lFilteredNumberOfInstalmentMin=''
		String lNumberOfInstalment=strNumberOfInstalment.trim()
		if(lNumberOfInstalment.length()<=0){
			lNumberOfInstalment=THAKumkaLoanCarResultType.DEFAULT_NUMBER_OF_INSTALMENT
		}
		Integer lNumberOfInstalmentDef=24
		Integer lNumberOfInstalmentNum=IGNUemaHelper.convertStringToInteger(lNumberOfInstalment,lNumberOfInstalmentDef)
		String lNumberOfInstalmentTarget=lNumberOfInstalmentNum.toString()
		lNumberOfInstalment=''
		try{
			Boolean lResult=false
			lreturn.put('FilteredNumberOfInstalmentMax','')
			lreturn.put('FilteredNumberOfInstalmentMin','')
			lreturn.put('NumberOfInstalment','')
			lreturn.put('Result',lResult)
			String lTagButtonValue='filter-loan-term'
			String lLocatorButtonValue=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonValue)
			WebElement lElementButtonValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonValue)
			if(!lElementButtonValue){
				return lreturn
			}
			String lNumberOfInstalmentVal0=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonValue)
			String lNumberOfInstalmentVal1=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonValue)
			String lTagButtonPlus='filter-loan-term-plus'
			String lLocatorButtonPlus=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPlus)
			WebElement lElementButtonPlus=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPlus)
			if(!lElementButtonPlus){
				return lreturn
			}
			String lTagButtonMinus='filter-loan-term-minus'
			String lLocatorButtonMinus=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonMinus)
			WebElement lElementButtonMinus=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonMinus)
			if(!lElementButtonMinus){
				return lreturn
			}
			Integer lIndex=0
			for(lIndex=0;lIndex<10;lIndex++){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementButtonPlus,'disabled')){
					lFilteredNumberOfInstalmentMax=lNumberOfInstalmentVal1
					break
				}else{
					IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementButtonPlus,false)
					lNumberOfInstalmentVal1=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonValue)
					if(lNumberOfInstalmentVal0==lNumberOfInstalmentVal1){
						lFilteredNumberOfInstalmentMax=lNumberOfInstalmentVal1
						break
					}else{
						lNumberOfInstalmentVal0=lNumberOfInstalmentVal1
					}
				}
			}
			lNumberOfInstalmentVal0=lNumberOfInstalmentVal1
			for(lIndex=0;lIndex<10;lIndex++){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementButtonMinus,'disabled')){
					lFilteredNumberOfInstalmentMin=lNumberOfInstalmentVal1
					break
				}else{
					IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementButtonMinus,false)
					lNumberOfInstalmentVal1=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonValue)
					if(lNumberOfInstalmentVal0==lNumberOfInstalmentVal1){
						lFilteredNumberOfInstalmentMin=lNumberOfInstalmentVal1
						break
					}else{
						lNumberOfInstalmentVal0=lNumberOfInstalmentVal1
					}
				}
			}
			lNumberOfInstalmentVal0=lNumberOfInstalmentVal1
			if(lNumberOfInstalmentTarget==lNumberOfInstalmentVal0){
				lNumberOfInstalment=lNumberOfInstalmentTarget.toString()
			}else{
				for(lIndex=0;lIndex<10;lIndex++){
					if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementButtonPlus,'disabled')){
						lFilteredNumberOfInstalmentMax=lNumberOfInstalmentVal1
						break
					}else{
						IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementButtonPlus,false)
						lNumberOfInstalmentVal1=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonValue)
						if(lNumberOfInstalmentVal0==lNumberOfInstalmentVal1){
							lNumberOfInstalment=lNumberOfInstalmentVal1
							break
						}else{
							if(lNumberOfInstalmentVal1>=lNumberOfInstalmentTarget){
								lNumberOfInstalment=lNumberOfInstalmentVal1
								break
							}else{
								lNumberOfInstalmentVal0=lNumberOfInstalmentVal1
							}
						}
					}
				}
			}
			lResult=lNumberOfInstalment.length()>0
			if(lResult){
				lreturn.put('FilteredNumberOfInstalmentMax',lFilteredNumberOfInstalmentMax)
				lreturn.put('FilteredNumberOfInstalmentMin',lFilteredNumberOfInstalmentMin)
				lreturn.put('NumberOfInstalment',lNumberOfInstalment)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFillTransferRights(String strFillTransferRights){
		Map lreturn=[:]
		String lFillTransferRights=strFillTransferRights.trim()
		if(lFillTransferRights.length()<=0){
			lFillTransferRights=THAKumkaLoanCarResultType.DEFAULT_FILL_TRANSFER_RIGHTS
		}
		try{
			Boolean lResult=false
			lreturn.put('FillTransferRights','')
			lreturn.put('Result',lResult)
			Boolean lIsFillTransferRights=IGNUemaHelper.convertStringToBoolean(lFillTransferRights)
			lFillTransferRights=IGNUemaHelper.convertBooleanToString(lIsFillTransferRights)
			lResult=lFillTransferRights.length()>0
			if(lResult){
				lreturn.put('FillTransferRights',lFillTransferRights)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputTransferRights(String strTransferRights){
		Map lreturn=[:]
		String lTransferRights=strTransferRights.toUpperCase().trim()
		Map lTransferRightsList=['ALL':'0','NO':'1','YES':'2']
		if(lTransferRights.length()<=0){
			lTransferRights=THAKumkaLoanCarResultType.DEFAULT_TRANSFER_RIGHTS.toUpperCase()
		}
		Integer lTransferRightsDefault=0
		try{
			Boolean lResult=false
			lreturn.put('TransferRights','')
			lreturn.put('Result',lResult)
			String lTransferRightsItem=lTransferRightsList.get(lTransferRights)
			if(!lTransferRightsItem){
				lTransferRightsItem=lTransferRightsList.get(THAKumkaLoanCarResultType.DEFAULT_TRANSFER_RIGHTS.toUpperCase())
			}
			Integer lTransferRightsNum=IGNUemaHelper.convertStringToInteger(lTransferRightsItem,lTransferRightsDefault)
			lTransferRights=''
			String lTagTransferRights='filter-loan-type'
			String lLocatorTransferRights=IGNUemaHelper.getTagDataSeleniumKey(lTagTransferRights)
			List<WebElement> lElementTransferRightsList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagTransferRights)
			if(!lElementTransferRightsList){
				return lreturn
			}
			if(lElementTransferRightsList.size()<lTransferRightsList.size()){
				return lreturn
			}
			WebElement lElementTransferRightsItem=lElementTransferRightsList[lTransferRightsNum]
			Boolean lValid=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTransferRightsItem)
			if(!lValid){
				lTransferRights='No Option'
			}else{
				WebElement lElementTransferRightsParent=null
				for(WebElement lElementTransferRightsFind in lElementTransferRightsList){
					lElementTransferRightsParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementTransferRightsFind)
					if(lElementTransferRightsParent){
						if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementTransferRightsParent,'active')){
							lTransferRights=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTransferRightsFind)
							break
						}
					}
				}
			}
			lResult=lTransferRights.length()>0
			if(lResult){
				lreturn.put('TransferRights',lTransferRights)
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
			lFillSortingBy=THAKumkaLoanCarResultType.DEFAULT_FILL_SORTING_BY
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
	public Map inputSortingBy(String strSortingBy){
		Map lreturn=[:]
		String lSortingBy=strSortingBy.toUpperCase().trim()
		Map lSortingByList=['AMOUNT':'0','INTEREST':'1']
		if(lSortingBy.length()<=0){
			lSortingBy=THAKumkaLoanCarResultType.DEFAULT_SORTING_BY.toUpperCase()
		}
		Integer lSortingByDefault=0
		try{
			Boolean lResult=false
			lreturn.put('SortingBy','')
			lreturn.put('Result',lResult)

			String lSortingByItem=lSortingByList.get(lSortingBy)
			if(!lSortingByItem){
				lSortingByItem=lSortingByList.get(THAKumkaLoanCarResultType.DEFAULT_SORTING_BY.toUpperCase())
			}
			Integer lSortingByNum=IGNUemaHelper.convertStringToInteger(lSortingByItem,lSortingByDefault)
			lSortingBy=''
			String lTagSortingBy='sorting'
			String lLocatorSortingBy=IGNUemaHelper.getTagDataSeleniumKey(lTagSortingBy)
			List<WebElement> lElementSortingByList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagSortingBy)
			if(!lElementSortingByList){
				return lreturn
			}
			if(lElementSortingByList.size()<lSortingByList.size()){
				return lreturn
			}
			WebElement lElementSortingByItem=lElementSortingByList[lSortingByNum]
			Boolean lValid=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSortingByItem)
			if(!lValid){
				lSortingBy='No Option'
			}else{
				WebElement lElementSortingByParent=null
				for(WebElement lElementSortingByFind in lElementSortingByList){
					lElementSortingByParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementSortingByFind)
					if(lElementSortingByParent){
						if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementSortingByParent,'show')){
							lSortingBy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSortingByFind)
							break
						}
					}
				}
			}
			lResult=lSortingBy.length()>0
			if(lResult){
				lreturn.put('SortingBy',lSortingBy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundSave(String strOutboundSave){
		Map lreturn=[:]
		String lOutboundSave=strOutboundSave.trim()
		if(lOutboundSave.length()<=0){
			lOutboundSave=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_SAVE
		}
		String lOutboundDisplayPlanId=''
		String lOutboundBankName=''
		String lOutboundPlanName=''
		String lOutboundPlanLoanType=''
		String lOutboundGuarantorRequired=''
		String lOutboundCarInspectionRequired=''
		String lOutboundCarInsuranceRequired=''
		String lOutboundPromotionText=''
		String lOutboundLoanAmount=''
		String lOutboundMaxLoanAmount=''
		String lOutboundLoanTerm=''
		String lOutboundMonthlyInstalment=''
		String lOutboundRatePerMonth=''
		String lOutboundTotalInterest=''
		String lOutboundTotalVat=''
		String lOutboundTotalPayment=''
		String lOutboundTotalFee=''
		String lOutboundApprovalDateMessage=''
		String lOutboundSelectedLoanAmount=''
		String lOutboundSelectedMaxLoanAmount=''
		String lOutboundSelectedLoanTerm=''
		String lOutboundSelectedMonthlyInstalment=''
		String lOutboundSelectedRatePerMonth=''
		String lOutboundDetailGurantorRequired=''
		String lOutboundDetailCarInspectionRequired=''
		String lOutboundDetailCarInsuranceRequired=''
		String lOutboundSelectedStampDutyFeePercent=''
		String lOutboundSelectedStampDutyFee=''
		String lOutboundSelectedCarInspectionFee=''
		String lOutboundSelectedAdministrationFee=''
		String lOutboundSelectedContractTransferFee=''
		String lOutboundSelectedTotalVat=''
		String lOutboundSelectedTotalFee=''
		String lOutboundDetailQualificaiton=''
		String lOutboundQualificationRequired=''
		String lOutboundDetailDocumentRequire=''
		String lOutboundDocumentRequired=''
		String lOutboundDetailPromotionText=''
		try{
			Boolean lResult=false
			lreturn.put('OutboundSave','')
			lreturn.put('OutboundDisplayPlanId','')
			lreturn.put('OutboundBankName','')
			lreturn.put('OutboundPlanName','')
			lreturn.put('OutboundPlanLoanType','')
			lreturn.put('OutboundGuarantorRequired','')
			lreturn.put('OutboundCarInspectionRequired','')
			lreturn.put('OutboundCarInsuranceRequired','')
			lreturn.put('OutboundPromotionText','')
			lreturn.put('OutboundLoanAmount','')
			lreturn.put('OutboundMaxLoanAmount','')
			lreturn.put('OutboundLoanTerm','')
			lreturn.put('OutboundMonthlyInstalment','')
			lreturn.put('OutboundRatePerMonth','')
			lreturn.put('OutboundTotalInterest','')
			lreturn.put('OutboundTotalVat','')
			lreturn.put('OutboundTotalPayment','')
			lreturn.put('OutboundTotalFee','')
			lreturn.put('OutboundApprovalDateMessage','')
			lreturn.put('OutboundSelectedLoanAmount','')
			lreturn.put('OutboundSelectedMaxLoanAmount','')
			lreturn.put('OutboundSelectedLoanTerm','')
			lreturn.put('OutboundSelectedMonthlyInstalment','')
			lreturn.put('OutboundSelectedRatePerMonth','')
			lreturn.put('OutboundDetailGurantorRequired','')
			lreturn.put('OutboundDetailCarInspectionRequired','')
			lreturn.put('OutboundDetailCarInsuranceRequired','')
			lreturn.put('OutboundSelectedStampDutyFeePercent','')
			lreturn.put('OutboundSelectedStampDutyFee','')
			lreturn.put('OutboundSelectedCarInspectionFee','')
			lreturn.put('OutboundSelectedAdministrationFee','')
			lreturn.put('OutboundSelectedContractTransferFee','')
			lreturn.put('OutboundSelectedTotalVat','')
			lreturn.put('OutboundSelectedTotalFee','')
			lreturn.put('OutboundDetailQualificaiton','')
			lreturn.put('OutboundQualificationRequired','')
			lreturn.put('OutboundDetailDocumentRequire','')
			lreturn.put('OutboundDocumentRequired','')
			lreturn.put('OutboundDetailPromotionText','')
			lreturn.put('Result',lResult)
			Boolean lIsOutboundSave=IGNUemaHelper.convertStringToBoolean(lOutboundSave)
			lOutboundSave=''
			if(lIsOutboundSave){
				String lTagListOfCardResultList='display-plan-id_gray_filter'
				String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
				List<WebElement> lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				if(!lElementListOfCardResultList){
					lIsOutboundSave=false
				}else{
					def lElementOutboundSaveOpenParentList=[]
					String lText=''
					Boolean lIsDisabled=false
					for(WebElement lElementItemOfCards in lElementListOfCardResultList){
						lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementItemOfCards)
						lIsDisabled=IGNUemaHelper.convertStringToBoolean(lText.substring(lText.lastIndexOf('_')+1,lText.length()))
						if(!lIsDisabled){
							lElementOutboundSaveOpenParentList.add(lElementItemOfCards)
						}
					}
					WebElement lElementOutboundSaveOpenParentItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementOutboundSaveOpenParentList)
					if(!lElementOutboundSaveOpenParentItem){
						lIsOutboundSave=false
					}else{
						lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSaveOpenParentItem)
						lOutboundDisplayPlanId=lText.substring(0,lText.lastIndexOf('_'))
						String lTagOutboundBankName='bank-name'
						String lLocatorOutboundBankName=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundBankName)
						WebElement lElementOutboundBankName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundBankName,true)
						lOutboundBankName=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundBankName)
						String lTagOutboundPlanName='plan-name'
						String lLocatorOutboundPlanName=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundPlanName)
						WebElement lElementOutboundPlanName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundPlanName,true)
						lOutboundPlanName=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundPlanName)
						String lTagOutboundPlanLoanType='plan-loan-type'
						String lLocatorOutboundPlanLoanType=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundPlanLoanType)
						WebElement lElementOutboundPlanLoanType=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundPlanLoanType,true)
						lOutboundPlanLoanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundPlanLoanType)
						String lTagOutboundGuarantorRequired='gurantor-required'
						String lLocatorOutboundGuarantorRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundGuarantorRequired)
						WebElement lElementOutboundGuarantorRequired=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundGuarantorRequired,true)
						lOutboundGuarantorRequired=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundGuarantorRequired)
						String lTagOutboundCarInspectionRequired='car-inspection-required'
						String lLocatorOutboundCarInspectionRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundCarInspectionRequired)
						WebElement lElementOutboundCarInspectionRequired=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundCarInspectionRequired,true)
						lOutboundCarInspectionRequired=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundCarInspectionRequired)
						String lTagOutboundCarInsuranceRequired='car-insurance-required'
						String lLocatorOutboundCarInsuranceRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundCarInsuranceRequired)
						WebElement lElementOutboundCarInsuranceRequired=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundCarInsuranceRequired,true)
						lOutboundCarInsuranceRequired=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundCarInsuranceRequired)
						String lTagOutboundPromotionText='promotion-text'
						String lLocatorOutboundPromotionText=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundPromotionText)
						WebElement lElementOutboundPromotionText=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundPromotionText,true)
						lOutboundPromotionText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundPromotionText)
						if(lOutboundPromotionText.length()<=0){
							lOutboundPromotionText=IGNUemaHelper.getTextByWebElement(this.driver,lElementOutboundPromotionText)
						}
						String lTagOutboundLoanAmount='loan-amount'
						String lLocatorOutboundLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundLoanAmount)
						WebElement lElementOutboundLoanAmount=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundLoanAmount,true)
						lOutboundLoanAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundLoanAmount)
						String lTagOutboundMaxLoanAmount='max-loan-amount'
						String lLocatorOutboundMaxLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundMaxLoanAmount)
						WebElement lElementOutboundMaxLoanAmount=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundMaxLoanAmount,true)
						lOutboundMaxLoanAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundMaxLoanAmount)
						String lTagOutboundLoanTerm='loan-term'
						String lLocatorOutboundLoanTerm=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundLoanTerm)
						WebElement lElementOutboundLoanTerm=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundLoanTerm,true)
						lOutboundLoanTerm=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundLoanTerm)
						String lTagOutboundMonthlyInstalment='mountly-installment'
						String lLocatorOutboundMonthlyInstalment=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundMonthlyInstalment)
						WebElement lElementOutboundMonthlyInstalment=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundMonthlyInstalment,true)
						lOutboundMonthlyInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundMonthlyInstalment)
						String lTagOutboundRatePerMonth='rate-per-month'
						String lLocatorOutboundRatePerMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundRatePerMonth)
						WebElement lElementOutboundRatePerMonth=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundRatePerMonth,true)
						lOutboundRatePerMonth=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundRatePerMonth)
						String lTagOutboundTotalInterest='total-interest'
						String lLocatorOutboundTotalInterest=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundTotalInterest)
						WebElement lElementOutboundTotalInterest=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundTotalInterest,true)
						lOutboundTotalInterest=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundTotalInterest)
						String lTagOutboundTotalVat='total-vat'
						String lLocatorOutboundTotalVat=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundTotalVat)
						WebElement lElementOutboundTotalVat=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundTotalVat,true)
						lOutboundTotalVat=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundTotalVat)
						String lTagOutboundTotalPayment='total-payment'
						String lLocatorOutboundTotalPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundTotalPayment)
						WebElement lElementOutboundTotalPayment=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundTotalPayment,true)
						lOutboundTotalPayment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundTotalPayment)
						String lTagOutboundTotalFee='total-fee'
						String lLocatorOutboundTotalFee=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundTotalFee)
						WebElement lElementOutboundTotalFee=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundTotalFee,true)
						lOutboundTotalFee=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundTotalFee)
						String lTagOutboundApprovalDateMessage='approval-date-message'
						String lLocatorOutboundApprovalDateMessage=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundApprovalDateMessage)
						WebElement lElementOutboundApprovalDateMessage=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundApprovalDateMessage,true)
						lOutboundApprovalDateMessage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundApprovalDateMessage)
						if(lOutboundApprovalDateMessage.length()<=0){
							lOutboundApprovalDateMessage=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementOutboundApprovalDateMessage)
						}
						String lTagOutboundSaveOpenButton='open-detail-btn'
						String lLocatorOutboundSaveOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSaveOpenButton)
						WebElement lElementOutboundSaveOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementOutboundSaveOpenParentItem,lLocatorOutboundSaveOpenButton,true)
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementOutboundSaveOpenButton)
						lIsOutboundSave=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementOutboundSaveOpenButton)
						String lLocatorOutboundSaveDialog='#modal-details'
						Boolean lIsOutboundSaveOpen=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOutboundSaveDialog,1)
						if(!lIsOutboundSaveOpen){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOutboundSaveOpenButton)
							lIsOutboundSaveOpen=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOutboundSaveDialog,1)
							if(!lIsOutboundSaveOpen){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOutboundSaveOpenButton)
								lIsOutboundSaveOpen=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOutboundSaveDialog,1)
							}
						}
						lIsOutboundSave=lIsOutboundSaveOpen
						if(lIsOutboundSave){
							String lTagOutboundSelectedLoanAmount='selected-loan-amount'
							String lLocatorOutboundSelectedLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedLoanAmount)
							WebElement lElementOutboundSelectedLoanAmount=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedLoanAmount)
							lOutboundSelectedLoanAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedLoanAmount)
							String lTagOutboundSelectedMaxLoanAmount='selected-max-loan-amount'
							String lLocatorOutboundSelectedMaxLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedMaxLoanAmount)
							WebElement lElementOutboundSelectedMaxLoanAmount=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedMaxLoanAmount)
							lOutboundSelectedMaxLoanAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedMaxLoanAmount)
							String lTagOutboundSelectedLoanTerm='selected-loan-term'
							String lLocatorOutboundSelectedLoanTerm=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedLoanTerm)
							WebElement lElementOutboundSelectedLoanTerm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedLoanTerm)
							lOutboundSelectedLoanTerm=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedLoanTerm)
							String lTagOutboundSelectedMonthlyInstalment='selected-monthly-installment'
							String lLocatorOutboundSelectedMonthlyInstalment=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedMonthlyInstalment)
							WebElement lElementOutboundSelectedMonthlyInstalment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedMonthlyInstalment)
							lOutboundSelectedMonthlyInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedMonthlyInstalment)
							String lTagOutboundSelectedRatePerMonth='selected-rate-per-month'
							String lLocatorOutboundSelectedRatePerMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedRatePerMonth)
							WebElement lElementOutboundSelectedRatePerMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedRatePerMonth)
							lOutboundSelectedRatePerMonth=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedRatePerMonth)
							String lTagOutboundDetailGurantorRequired='detail-gurantor-required'
							String lLocatorOutboundDetailGurantorRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDetailGurantorRequired)
							WebElement lElementOutboundDetailGurantorRequired=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundDetailGurantorRequired)
							lOutboundDetailGurantorRequired=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDetailGurantorRequired)
							String lTagOutboundDetailCarInspectionRequired='detail-car-inspection-required'
							String lLocatorOutboundDetailCarInspectionRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDetailCarInspectionRequired)
							WebElement lElementOutboundDetailCarInspectionRequired=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundDetailCarInspectionRequired)
							lOutboundDetailCarInspectionRequired=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDetailCarInspectionRequired)
							String lTagOutboundDetailCarInsuranceRequired='detail-car-insurance-required'
							String lLocatorOutboundDetailCarInsuranceRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDetailCarInsuranceRequired)
							WebElement lElementOutboundDetailCarInsuranceRequired=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundDetailCarInsuranceRequired)
							lOutboundDetailCarInsuranceRequired=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDetailCarInsuranceRequired)
							String lTagOutboundSelectedStampDutyFeePercent='selected-stamp-duty-fee-percent'
							String lLocatorOutboundSelectedStampDutyFeePercent=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedStampDutyFeePercent)
							WebElement lElementOutboundSelectedStampDutyFeePercent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedStampDutyFeePercent)
							lOutboundSelectedStampDutyFeePercent=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedStampDutyFeePercent)
							String lTagOutboundSelectedStampDutyFee='selected-stamp-duty-fee'
							String lLocatorOutboundSelectedStampDutyFee=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedStampDutyFee)
							WebElement lElementOutboundSelectedStampDutyFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedStampDutyFee)
							lOutboundSelectedStampDutyFee=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedStampDutyFee)
							String lTagOutboundSelectedCarInspectionFee='selected-car-inspection-fee'
							String lLocatorOutboundSelectedCarInspectionFee=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedCarInspectionFee)
							WebElement lElementOutboundSelectedCarInspectionFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedCarInspectionFee)
							lOutboundSelectedCarInspectionFee=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedCarInspectionFee)
							String lTagOutboundSelectedAdministrationFee='selected-administration-fee'
							String lLocatorOutboundSelectedAdministrationFee=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedAdministrationFee)
							WebElement lElementOutboundSelectedAdministrationFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedAdministrationFee)
							lOutboundSelectedAdministrationFee=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedAdministrationFee)
							String lTagOutboundSelectedContractTransferFee='selected-contract-transfer-fee'
							String lLocatorOutboundSelectedContractTransferFee=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedContractTransferFee)
							WebElement lElementOutboundSelectedContractTransferFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedContractTransferFee)
							lOutboundSelectedContractTransferFee=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedContractTransferFee)
							String lTagOutboundSelectedTotalVat='selected-total-vat'
							String lLocatorOutboundSelectedTotalVat=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedTotalVat)
							WebElement lElementOutboundSelectedTotalVat=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedTotalVat)
							lOutboundSelectedTotalVat=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedTotalVat)
							String lTagOutboundSelectedTotalFee='selected-total-fee'
							String lLocatorOutboundSelectedTotalFee=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSelectedTotalFee)
							WebElement lElementOutboundSelectedTotalFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundSelectedTotalFee)
							lOutboundSelectedTotalFee=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundSelectedTotalFee)
							String lTagOutboundDetailQualificaiton='detail-qualificaiton'
							String lLocatorOutboundDetailQualificaiton=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDetailQualificaiton)
							WebElement lElementOutboundDetailQualificaiton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundDetailQualificaiton)
							lOutboundDetailQualificaiton=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDetailQualificaiton)
							if(lOutboundDetailQualificaiton.length()<=0){
								lOutboundDetailQualificaiton=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementOutboundDetailQualificaiton)
							}
							String lTagOutboundQualificationRequiredList='qualification-required'
							String lLocatorOutboundQualificationRequiredList=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundQualificationRequiredList)
							List<WebElement> lElementOutboundQualificationRequiredList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOutboundQualificationRequiredList)
							for(WebElement lElementOutboundQualificationRequiredItem in lElementOutboundQualificationRequiredList){
								lOutboundQualificationRequired=lOutboundQualificationRequired+IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundQualificationRequiredItem)+"\r\n"
							}
							String lTagOutboundDetailDocumentRequire='detail-document-require'
							String lLocatorOutboundDetailDocumentRequire=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDetailDocumentRequire)
							WebElement lElementOutboundDetailDocumentRequire=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundDetailDocumentRequire)
							lOutboundDetailDocumentRequire=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDetailDocumentRequire)
							if(lOutboundDetailDocumentRequire.length()<=0){
								lOutboundDetailDocumentRequire=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementOutboundDetailDocumentRequire)
							}
							String lTagOutboundDocumentRequiredList='document-required'
							String lLocatorOutboundDocumentRequiredList=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDocumentRequiredList)
							List<WebElement> lElementOutboundDocumentRequiredList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOutboundDocumentRequiredList)
							for(WebElement lElementOutboundDocumentRequiredItem in lElementOutboundDocumentRequiredList){
								lOutboundDocumentRequired=lOutboundDocumentRequired+IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDocumentRequiredItem)+"\r\n"
							}
							String lTagOutboundDetailPromotionText='detail-promotion-text'
							String lLocatorOutboundDetailPromotionText=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundDetailPromotionText)
							WebElement lElementOutboundDetailPromotionText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOutboundDetailPromotionText)
							lOutboundDetailPromotionText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundDetailPromotionText)
							if(lOutboundDetailPromotionText.length()<=0){
								lOutboundDetailPromotionText=IGNUemaHelper.getTextByWebElement(this.driver,lElementOutboundDetailPromotionText)
							}
							String lAriaExpandedText=''
							Boolean lAriaExpanded=false
							IGNUemaHelper.webJsScrollToTop(this.driver)
							String lTagQualificationToggle='qualification-toggle'
							String lLocatorQualificationToggle=IGNUemaHelper.getTagDataSeleniumKey(lTagQualificationToggle)
							WebElement lElementQualificationToggle=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQualificationToggle)
							if(lElementQualificationToggle){
								lAriaExpandedText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementQualificationToggle,'aria-expanded')
								lAriaExpanded=IGNUemaHelper.convertStringToBoolean(lAriaExpandedText)
								if(!lAriaExpanded){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQualificationToggle)
									lAriaExpandedText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementQualificationToggle,'aria-expanded')
									lAriaExpanded=IGNUemaHelper.convertStringToBoolean(lAriaExpandedText)
								}
								if(!lAriaExpanded){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQualificationToggle)
									lAriaExpandedText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementQualificationToggle,'aria-expanded')
									lAriaExpanded=IGNUemaHelper.convertStringToBoolean(lAriaExpandedText)
								}
								if(lAriaExpanded){
									IGNUemaHelper.webJsScrollToBottom(this.driver)
									IGNUemaHelper.delayThreadSecond(5)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQualificationToggle)
								}
							}
							IGNUemaHelper.webJsScrollToTop(this.driver)
							String lTagDocumentToggle='document-toggle'
							String lLocatorDocumentToggle=IGNUemaHelper.getTagDataSeleniumKey(lTagDocumentToggle)
							WebElement lElementDocumentToggle=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDocumentToggle)
							if(lElementDocumentToggle){
								lAriaExpandedText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementDocumentToggle,'aria-expanded')
								lAriaExpanded=IGNUemaHelper.convertStringToBoolean(lAriaExpandedText)
								if(!lAriaExpanded){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDocumentToggle)
									lAriaExpandedText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementDocumentToggle,'aria-expanded')
									lAriaExpanded=IGNUemaHelper.convertStringToBoolean(lAriaExpandedText)
								}
								if(!lAriaExpanded){
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDocumentToggle)
									lAriaExpandedText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementDocumentToggle,'aria-expanded')
									lAriaExpanded=IGNUemaHelper.convertStringToBoolean(lAriaExpandedText)
								}
								if(lAriaExpanded){
									IGNUemaHelper.webJsScrollToBottom(this.driver)
									IGNUemaHelper.delayThreadSecond(5)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDocumentToggle)
								}
							}
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
				}
			}
			lOutboundDisplayPlanId=lOutboundDisplayPlanId.trim()
			lOutboundBankName=lOutboundBankName.trim()
			lOutboundPlanName=lOutboundPlanName.trim()
			lOutboundPlanLoanType=lOutboundPlanLoanType.trim()
			lOutboundGuarantorRequired=lOutboundGuarantorRequired.trim()
			lOutboundCarInspectionRequired=lOutboundCarInspectionRequired.trim()
			lOutboundCarInsuranceRequired=lOutboundCarInsuranceRequired.trim()
			lOutboundPromotionText=lOutboundPromotionText.trim()
			lOutboundLoanAmount=lOutboundLoanAmount.trim()
			lOutboundMaxLoanAmount=lOutboundMaxLoanAmount.trim()
			lOutboundLoanTerm=lOutboundLoanTerm.trim()
			lOutboundMonthlyInstalment=lOutboundMonthlyInstalment.trim()
			lOutboundRatePerMonth=lOutboundRatePerMonth.trim()
			lOutboundTotalInterest=lOutboundTotalInterest.trim()
			lOutboundTotalVat=lOutboundTotalVat.trim()
			lOutboundTotalPayment=lOutboundTotalPayment.trim()
			lOutboundTotalFee=lOutboundTotalFee.trim()
			lOutboundApprovalDateMessage=lOutboundApprovalDateMessage.trim()
			lOutboundSelectedLoanAmount=lOutboundSelectedLoanAmount.trim()
			lOutboundSelectedMaxLoanAmount=lOutboundSelectedMaxLoanAmount.trim()
			lOutboundSelectedLoanTerm=lOutboundSelectedLoanTerm.trim()
			lOutboundSelectedMonthlyInstalment=lOutboundSelectedMonthlyInstalment.trim()
			lOutboundSelectedRatePerMonth=lOutboundSelectedRatePerMonth.trim()
			lOutboundDetailGurantorRequired=lOutboundDetailGurantorRequired.trim()
			lOutboundDetailCarInspectionRequired=lOutboundDetailCarInspectionRequired.trim()
			lOutboundDetailCarInsuranceRequired=lOutboundDetailCarInsuranceRequired.trim()
			lOutboundSelectedStampDutyFeePercent=lOutboundSelectedStampDutyFeePercent.trim()
			lOutboundSelectedStampDutyFee=lOutboundSelectedStampDutyFee.trim()
			lOutboundSelectedCarInspectionFee=lOutboundSelectedCarInspectionFee.trim()
			lOutboundSelectedAdministrationFee=lOutboundSelectedAdministrationFee.trim()
			lOutboundSelectedContractTransferFee=lOutboundSelectedContractTransferFee.trim()
			lOutboundSelectedTotalVat=lOutboundSelectedTotalVat.trim()
			lOutboundSelectedTotalFee=lOutboundSelectedTotalFee.trim()
			lOutboundDetailQualificaiton=lOutboundDetailQualificaiton.trim()
			lOutboundQualificationRequired=lOutboundQualificationRequired.trim()
			lOutboundDetailDocumentRequire=lOutboundDetailDocumentRequire.trim()
			lOutboundDocumentRequired=lOutboundDocumentRequired.trim()
			lOutboundDetailPromotionText=lOutboundDetailPromotionText.trim()
			lOutboundSave=IGNUemaHelper.convertBooleanToString(lIsOutboundSave)
			lResult=lOutboundSave.length()>0
			if(lResult){
				lreturn.put('OutboundSave',lOutboundSave)
				lreturn.put('OutboundDisplayPlanId',lOutboundDisplayPlanId)
				lreturn.put('OutboundBankName',lOutboundBankName)
				lreturn.put('OutboundPlanName',lOutboundPlanName)
				lreturn.put('OutboundPlanLoanType',lOutboundPlanLoanType)
				lreturn.put('OutboundGuarantorRequired',lOutboundGuarantorRequired)
				lreturn.put('OutboundCarInspectionRequired',lOutboundCarInspectionRequired)
				lreturn.put('OutboundCarInsuranceRequired',lOutboundCarInsuranceRequired)
				lreturn.put('OutboundPromotionText',lOutboundPromotionText)
				lreturn.put('OutboundLoanAmount',lOutboundLoanAmount)
				lreturn.put('OutboundMaxLoanAmount',lOutboundMaxLoanAmount)
				lreturn.put('OutboundLoanTerm',lOutboundLoanTerm)
				lreturn.put('OutboundMonthlyInstalment',lOutboundMonthlyInstalment)
				lreturn.put('OutboundRatePerMonth',lOutboundRatePerMonth)
				lreturn.put('OutboundTotalInterest',lOutboundTotalInterest)
				lreturn.put('OutboundTotalVat',lOutboundTotalVat)
				lreturn.put('OutboundTotalPayment',lOutboundTotalPayment)
				lreturn.put('OutboundTotalFee',lOutboundTotalFee)
				lreturn.put('OutboundApprovalDateMessage',lOutboundApprovalDateMessage)
				lreturn.put('OutboundSelectedLoanAmount',lOutboundSelectedLoanAmount)
				lreturn.put('OutboundSelectedMaxLoanAmount',lOutboundSelectedMaxLoanAmount)
				lreturn.put('OutboundSelectedLoanTerm',lOutboundSelectedLoanTerm)
				lreturn.put('OutboundSelectedMonthlyInstalment',lOutboundSelectedMonthlyInstalment)
				lreturn.put('OutboundSelectedRatePerMonth',lOutboundSelectedRatePerMonth)
				lreturn.put('OutboundDetailGurantorRequired',lOutboundDetailGurantorRequired)
				lreturn.put('OutboundDetailCarInspectionRequired',lOutboundDetailCarInspectionRequired)
				lreturn.put('OutboundDetailCarInsuranceRequired',lOutboundDetailCarInsuranceRequired)
				lreturn.put('OutboundSelectedStampDutyFeePercent',lOutboundSelectedStampDutyFeePercent)
				lreturn.put('OutboundSelectedStampDutyFee',lOutboundSelectedStampDutyFee)
				lreturn.put('OutboundSelectedCarInspectionFee',lOutboundSelectedCarInspectionFee)
				lreturn.put('OutboundSelectedAdministrationFee',lOutboundSelectedAdministrationFee)
				lreturn.put('OutboundSelectedContractTransferFee',lOutboundSelectedContractTransferFee)
				lreturn.put('OutboundSelectedTotalVat',lOutboundSelectedTotalVat)
				lreturn.put('OutboundSelectedTotalFee',lOutboundSelectedTotalFee)
				lreturn.put('OutboundDetailQualificaiton',lOutboundDetailQualificaiton)
				lreturn.put('OutboundQualificationRequired',lOutboundQualificationRequired)
				lreturn.put('OutboundDetailDocumentRequire',lOutboundDetailDocumentRequire)
				lreturn.put('OutboundDocumentRequired',lOutboundDocumentRequired)
				lreturn.put('OutboundDetailPromotionText',lOutboundDetailPromotionText)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundPrefixName(String strOutboundPrefixName){
		Map lreturn=[:]
		String lOutboundPrefixName=strOutboundPrefixName.trim()
		Map lOutboundPrefixNameList=['1':'0','2':'1','3':'2','4':'3']
		if(lOutboundPrefixName.length()<=0){
			lOutboundPrefixName=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_PREFIX_NAME
		}
		Integer lOutboundPrefixNameDefault=3
		try{
			Boolean lResult=false
			lreturn.put('OutboundPrefixName','')
			lreturn.put('Result',lResult)
			String lOutboundPrefixNameItem=lOutboundPrefixNameList.get(lOutboundPrefixName)
			if(!lOutboundPrefixNameItem){
				lOutboundPrefixNameItem=lOutboundPrefixNameList.get(THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_PREFIX_NAME)
			}
			Integer lOutboundPrefixNameNum=IGNUemaHelper.convertStringToInteger(lOutboundPrefixNameItem,lOutboundPrefixNameDefault)
			lOutboundPrefixName=''
			String lTagParentButtonToggle='prefix-name-select'
			String lLocatorParentButtonToggle=IGNUemaHelper.getTagDataSeleniumKey(lTagParentButtonToggle)
			WebElement lElementParentButtonToggle=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagParentButtonToggle)
			if(!lElementParentButtonToggle){
				lOutboundPrefixName='No Option'
			}else{
				String lLocatorButtonToggle=lLocatorParentButtonToggle+' li'
				WebElement lElementButtonToggle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonToggle)
				if(!lElementButtonToggle){
					lOutboundPrefixName='No Option'
				}else{
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonToggle)
					String lTagDropdownItemList='dropdown-item'
					String lLocatorDropdownItemList=IGNUemaHelper.concatCssLocatorParentChild(lLocatorParentButtonToggle,IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownItemList))
					List<WebElement> lElementDropdownItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorDropdownItemList)
					if(!lElementDropdownItemList){
						lOutboundPrefixName='No Option'
					}else{
						WebElement lElementDropdownItem=lElementDropdownItemList[lOutboundPrefixNameNum]
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDropdownItem)
						lOutboundPrefixName=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementParentButtonToggle)
					}
				}
			}
			lResult=lOutboundPrefixName.length()>0
			if(lResult){
				lreturn.put('OutboundPrefixName',lOutboundPrefixName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundFullName(String strOutboundFullName){
		Map lreturn=[:]
		String lOutboundFullName=strOutboundFullName.trim()
		if(lOutboundFullName.length()<=0){
			lOutboundFullName=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_FULL_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('OutboundFullName','')
			lreturn.put('Result',lResult)
			String lTagInputText='full-name-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lOutboundFullName=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lOutboundFullName)
			lResult=lOutboundFullName.length()>0
			if(lResult){
				lreturn.put('OutboundFullName',lOutboundFullName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundMobileNumber(String strOutboundMobileNumber){
		Map lreturn=[:]
		String lOutboundMobileNumber=strOutboundMobileNumber.trim()
		if(lOutboundMobileNumber.length()<=0){
			lOutboundMobileNumber=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_MOBILE_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('OutboundMobileNumber','')
			lreturn.put('Result',lResult)
			String lTagInputText='mobile-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lOutboundMobileNumber=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lOutboundMobileNumber)
			lResult=lOutboundMobileNumber.length()>0
			if(lResult){
				lreturn.put('OutboundMobileNumber',lOutboundMobileNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundFillEmailAddress(String strOutboundFillEmailAddress){
		Map lreturn=[:]
		String lOutboundFillEmailAddress=strOutboundFillEmailAddress.trim()
		if(lOutboundFillEmailAddress.length()<=0){
			lOutboundFillEmailAddress=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_FILL_EMAIL_ADDRESS
		}
		try{
			Boolean lResult=false
			lreturn.put('OutboundFillEmailAddress','')
			lreturn.put('Result',lResult)
			Boolean lIsOutboundFillEmailAddress=IGNUemaHelper.convertStringToBoolean(lOutboundFillEmailAddress)
			lOutboundFillEmailAddress=IGNUemaHelper.convertBooleanToString(lIsOutboundFillEmailAddress)
			lResult=lOutboundFillEmailAddress.length()>0
			if(lResult){
				lreturn.put('OutboundFillEmailAddress',lOutboundFillEmailAddress)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundEmailAddress(String strOutboundEmailAddress){
		Map lreturn=[:]
		String lOutboundEmailAddress=strOutboundEmailAddress.trim()
		if(lOutboundEmailAddress.length()<=0){
			lOutboundEmailAddress=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_EMAIL_ADDRESS
		}
		try{
			Boolean lResult=false
			lreturn.put('OutboundEmailAddress','')
			lreturn.put('Result',lResult)
			String lTagInputText='email-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lOutboundEmailAddress=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lOutboundEmailAddress)
			lResult=lOutboundEmailAddress.length()>0
			if(lResult){
				lreturn.put('OutboundEmailAddress',lOutboundEmailAddress)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundCallBackTime(String strOutboundCallBackTime){
		Map lreturn=[:]
		String lOutboundCallBackTime=strOutboundCallBackTime.trim()
		Map lOutboundCallBackTimeList=['1':'0','2':'1','3':'2']
		if(lOutboundCallBackTime.length()<=0){
			lOutboundCallBackTime=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_CALL_BACK_TIME
		}
		Integer lOutboundCallBackTimeDefault=0
		try{
			Boolean lResult=false
			lreturn.put('OutboundCallBackTime','')
			lreturn.put('Result',lResult)
			String lOutboundCallBackTimeItem=lOutboundCallBackTimeList.get(lOutboundCallBackTime)
			if(!lOutboundCallBackTimeItem){
				lOutboundCallBackTimeItem=lOutboundCallBackTimeList.get(THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_CALL_BACK_TIME)
			}
			Integer lOutboundCallBackTimeNum=IGNUemaHelper.convertStringToInteger(lOutboundCallBackTimeItem,lOutboundCallBackTimeDefault)
			lOutboundCallBackTime=''
			String lTagParentButtonToggle='call-back-time-select'
			String lLocatorParentButtonToggle=IGNUemaHelper.getTagDataSeleniumKey(lTagParentButtonToggle)
			WebElement lElementParentButtonToggle=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagParentButtonToggle)
			if(!lElementParentButtonToggle){
				lOutboundCallBackTime='No Option'
			}else{
				String lLocatorButtonToggle=lLocatorParentButtonToggle+' li'
				WebElement lElementButtonToggle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonToggle)
				if(!lElementButtonToggle){
					lOutboundCallBackTime='No Option'
				}else{
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonToggle)
					String lTagDropdownItemList='dropdown-item'
					String lLocatorDropdownItemList=IGNUemaHelper.concatCssLocatorParentChild(lLocatorParentButtonToggle,IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownItemList))
					List<WebElement> lElementDropdownItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorDropdownItemList)
					if(!lElementDropdownItemList){
						lOutboundCallBackTime='No Option'
					}else{
						WebElement lElementDropdownItem=lElementDropdownItemList[lOutboundCallBackTimeNum]
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDropdownItem)
						lOutboundCallBackTime=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementParentButtonToggle)
					}
				}
			}
			lResult=lOutboundCallBackTime.length()>0
			if(lResult){
				lreturn.put('OutboundCallBackTime',lOutboundCallBackTime)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOutboundAcceptTermAndCondition(String strOutboundAcceptTermAndCondition){
		Map lreturn=[:]
		String lOutboundAcceptTermAndCondition=strOutboundAcceptTermAndCondition.trim()
		if(lOutboundAcceptTermAndCondition.length()<=0){
			lOutboundAcceptTermAndCondition=THAKumkaLoanCarResultType.DEFAULT_OUTBOUND_ACCEPT_TERM_AND_CONDITION
		}
		try{
			Boolean lResult=false
			lreturn.put('OutboundAcceptTermAndCondition','')
			lreturn.put('Result',lResult)
			Boolean lIsOutboundAcceptTermAndCondition=IGNUemaHelper.convertStringToBoolean(lOutboundAcceptTermAndCondition)
			lOutboundAcceptTermAndCondition=''
			String lTagCheckbox='term-and-condition-checkbox'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lOutboundAcceptTermAndCondition='No Option'
			}else{
				Boolean lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementCheckbox)
				if(lIsChecked){
					if(!lIsOutboundAcceptTermAndCondition){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(lIsOutboundAcceptTermAndCondition){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lIsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementCheckbox)
				lOutboundAcceptTermAndCondition=IGNUemaHelper.convertBooleanToString(lIsChecked)
			}
			lResult=lOutboundAcceptTermAndCondition.length()>0
			if(lResult){
				lreturn.put('OutboundAcceptTermAndCondition',lOutboundAcceptTermAndCondition)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase,Boolean isOutboundSave){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			Boolean lIsDone=false
			if(!isOutboundSave){
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app #cards',30)
			}else{
				String lTagSaveOutboundButton='save-outbound-btn'
				String lLocatorSaveOutboundButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSaveOutboundButton)
				WebElement lElementSaveOutboundButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSaveOutboundButton)
				if(!lElementSaveOutboundButton){
					lRedirected=false
				}else{
					lRedirected=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSaveOutboundButton)
					if(lRedirected){
						lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app #Detail',30)
					}
				}
			}
			if(isPositiveCase){
				lIsDone=lRedirected
			}else{
				lIsDone=!lRedirected
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsDone)
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