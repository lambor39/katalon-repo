package org.roojai.tha.types.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAExtendedWarrantyQuotationResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAExtendedWarrantyQuotationResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean inputResult(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lPrePackage=caseInput.PrePackage.toString().trim()
		String lPlanPackage=caseInput.PlanPackage.toString().trim()
		String lQuoteBy=caseInput.QuoteBy.toString().trim()
		String lQuotePhoneNo=caseInput.QuotePhoneNo.toString().trim()
		String lQuoteEmail=caseInput.QuoteEmail.toString().trim()
		String lQuoteNewsletter=caseInput.QuoteNewsletter.toString().trim()
		String lQuoteCallMeNow=caseInput.QuoteCallMeNow.toString().trim()
		String lQuotePDFDownloadToDo=caseInput.QuotePDFDownloadToDo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lOpportunityNumber=''
		String lPrePackagePremiumYearly=''
		String lPrePackagePremiumDeposit=''
		String lPrePackagePremiumMonthly=''
		String lPrePackagePremiumInstalment=''
		String lPrePackagePremiumNoDepositAmount=''
		String lPrePackagePremiumNoDepositTotal=''
		String lPrePackagePremiumQuarterlyAmount=''
		String lPrePackagePremiumQuarterlyTotal=''
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		String lPolicyInsurer=''
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
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
			//Check ABTesting
			String lTagABTesting='ABTesting'
			String lLocatorABTesting=IGNUemaHelper.getTagDataSeleniumKey(lTagABTesting)
			WebElement lElementABTesting=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagABTesting)
			if(!lElementABTesting){
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=false
				IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
			}else{
				IGNUemaHelper.CURRENT_AB_TESTING_VERSION=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementABTesting).trim().toUpperCase()
				if(IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>1){
					IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
				}
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>0
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					IGNUemaHelper.printLog('IGNUemaHelper.CURRENT_AB_TESTING_VERSION='+IGNUemaHelper.CURRENT_AB_TESTING_VERSION)
					lVersion=IGNUemaHelper.CURRENT_AB_TESTING_VERSION
					caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,'ActualVersion:'+lVersion)
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						Map lMapPostPrePackage=this.inputPostPrePackage()
						if(!lMapPostPrePackage.Result){
							lPostPrePackagePremiumYearly=''
							lPostPrePackagePremiumDeposit=''
							lPostPrePackagePremiumMonthly=''
							lPostPrePackagePremiumInstalment=''
							lPostPrePackagePremiumNoDepositAmount=''
							lPostPrePackagePremiumNoDepositTotal=''
							lPostPrePackagePremiumQuarterlyAmount=''
							lPostPrePackagePremiumQuarterlyTotal=''
						}else{
							lPostPrePackagePremiumYearly=lMapPostPrePackage.PostPrePackagePremiumYearly
							lPostPrePackagePremiumDeposit=lMapPostPrePackage.PostPrePackagePremiumDeposit
							lPostPrePackagePremiumMonthly=lMapPostPrePackage.PostPrePackagePremiumMonthly
							lPostPrePackagePremiumInstalment=lMapPostPrePackage.PostPrePackagePremiumInstalment
							lPostPrePackagePremiumNoDepositAmount=lMapPostPrePackage.PostPrePackagePremiumNoDepositAmount
							lPostPrePackagePremiumNoDepositTotal=lMapPostPrePackage.PostPrePackagePremiumNoDepositTotal
							lPostPrePackagePremiumQuarterlyAmount=lMapPostPrePackage.PostPrePackagePremiumQuarterlyAmount
							lPostPrePackagePremiumQuarterlyTotal=lMapPostPrePackage.PostPrePackagePremiumQuarterlyTotal
						}
						caseOutput.PostPrePackagePremiumYearly=lPostPrePackagePremiumYearly
						caseOutput.PostPrePackagePremiumDeposit=lPostPrePackagePremiumDeposit
						caseOutput.PostPrePackagePremiumMonthly=lPostPrePackagePremiumMonthly
						caseOutput.PostPrePackagePremiumInstalment=lPostPrePackagePremiumInstalment
						caseOutput.PostPrePackagePremiumNoDepositAmount=lPostPrePackagePremiumNoDepositAmount
						caseOutput.PostPrePackagePremiumNoDepositTotal=lPostPrePackagePremiumNoDepositTotal
						caseOutput.PostPrePackagePremiumQuarterlyAmount=lPostPrePackagePremiumQuarterlyAmount
						caseOutput.PostPrePackagePremiumQuarterlyTotal=lPostPrePackagePremiumQuarterlyTotal
						if(lPostPrePackagePremiumYearly.length()<=0){
							return lreturn
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
						Map lMapPlanPackage=this.inputPlanPackage(lPlanPackage)
						if(!lMapPlanPackage.Result){
							lPlanPackage=''
						}else{
							lPlanPackage=lMapPlanPackage.PlanPackage
						}
						caseOutput.PlanPackage=lPlanPackage
						if(lPlanPackage.length()<=0){
							return lreturn
						}
						Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
						if(!lMapQuoteMe.Result){
							lQuoteBy=''
							lQuotePhoneNo=''
							lQuoteEmail=''
							lQuoteNewsletter=''
							lQuoteCallMeNow=''
							lQuotePDFDownloadToDo=''
							lQuotePDFDownloadDetail=''
							lQuotePDFDownloadResult=''
						}else{
							lQuoteBy=lMapQuoteMe.QuoteBy
							lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
							lQuoteEmail=lMapQuoteMe.QuoteEmail
							lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
							lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
							lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
							lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
							lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
						}
						caseOutput.QuoteBy=lQuoteBy
						caseOutput.QuotePhoneNo=lQuotePhoneNo
						caseOutput.QuoteEmail=lQuoteEmail
						caseOutput.QuoteNewsletter=lQuoteNewsletter
						caseOutput.QuoteCallMeNow=lQuoteCallMeNow
						caseOutput.QuotePDFDownloadToDo=lQuotePDFDownloadToDo
						caseOutput.QuotePDFDownloadDetail=lQuotePDFDownloadDetail
						caseOutput.QuotePDFDownloadResult=lQuotePDFDownloadResult
						if(lQuoteBy.length()<=0){
							return lreturn
						}
						Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
						if(!lMapPolicyInsurer.Result){
							lPolicyInsurer=''
						}else{
							lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
						}
						caseOutput.PolicyInsurer=lPolicyInsurer
						if(!lMapPolicyInsurer.Result){
							return lreturn
						}
						Boolean lIsQuoteByNone=lQuoteBy.equalsIgnoreCase('NONE')
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsQuoteByNone)
						if(!lMapActualResult.Result){
							lActualResult=''
							lOpportunityNumber=''
							lVersion=''
							lPremiumYearly=''
							lPremiumDeposit=''
							lPremiumMonthly=''
							lPremiumInstalment=''
							lPremiumNoDepositAmount=''
							lPremiumNoDepositTotal=''
							lPremiumQuarterlyAmount=''
							lPremiumQuarterlyTotal=''
						}else{
							lActualResult=lMapActualResult.ActualResult
							lOpportunityNumber=lMapActualResult.OpportunityNumber
							lVersion=lMapActualResult.Version
							lPremiumYearly=lMapActualResult.PremiumYearly
							lPremiumDeposit=lMapActualResult.PremiumDeposit
							lPremiumMonthly=lMapActualResult.PremiumMonthly
							lPremiumInstalment=lMapActualResult.PremiumInstalment
							lPremiumNoDepositAmount=lMapActualResult.PremiumNoDepositAmount
							lPremiumNoDepositTotal=lMapActualResult.PremiumNoDepositTotal
							lPremiumQuarterlyAmount=lMapActualResult.PremiumQuarterlyAmount
							lPremiumQuarterlyTotal=lMapActualResult.PremiumQuarterlyTotal
						}
						caseOutput.ActualResult=lActualResult
						caseOutput.OpportunityNumber=lOpportunityNumber
						if(lVersion.length()>0){
							caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,lVersion)
						}
						caseOutput.PremiumYearly=lPremiumYearly
						caseOutput.PremiumDeposit=lPremiumDeposit
						caseOutput.PremiumMonthly=lPremiumMonthly
						caseOutput.PremiumInstalment=lPremiumInstalment
						caseOutput.PremiumNoDepositAmount=lPremiumNoDepositAmount
						caseOutput.PremiumNoDepositTotal=lPremiumNoDepositTotal
						caseOutput.PremiumQuarterlyAmount=lPremiumQuarterlyAmount
						caseOutput.PremiumQuarterlyTotal=lPremiumQuarterlyTotal
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					case 'B':
						Map lMapPostPrePackage=this.inputPostPrePackage()
						if(!lMapPostPrePackage.Result){
							lPostPrePackagePremiumYearly=''
							lPostPrePackagePremiumDeposit=''
							lPostPrePackagePremiumMonthly=''
							lPostPrePackagePremiumInstalment=''
							lPostPrePackagePremiumNoDepositAmount=''
							lPostPrePackagePremiumNoDepositTotal=''
							lPostPrePackagePremiumQuarterlyAmount=''
							lPostPrePackagePremiumQuarterlyTotal=''
						}else{
							lPostPrePackagePremiumYearly=lMapPostPrePackage.PostPrePackagePremiumYearly
							lPostPrePackagePremiumDeposit=lMapPostPrePackage.PostPrePackagePremiumDeposit
							lPostPrePackagePremiumMonthly=lMapPostPrePackage.PostPrePackagePremiumMonthly
							lPostPrePackagePremiumInstalment=lMapPostPrePackage.PostPrePackagePremiumInstalment
							lPostPrePackagePremiumNoDepositAmount=lMapPostPrePackage.PostPrePackagePremiumNoDepositAmount
							lPostPrePackagePremiumNoDepositTotal=lMapPostPrePackage.PostPrePackagePremiumNoDepositTotal
							lPostPrePackagePremiumQuarterlyAmount=lMapPostPrePackage.PostPrePackagePremiumQuarterlyAmount
							lPostPrePackagePremiumQuarterlyTotal=lMapPostPrePackage.PostPrePackagePremiumQuarterlyTotal
						}
						caseOutput.PostPrePackagePremiumYearly=lPostPrePackagePremiumYearly
						caseOutput.PostPrePackagePremiumDeposit=lPostPrePackagePremiumDeposit
						caseOutput.PostPrePackagePremiumMonthly=lPostPrePackagePremiumMonthly
						caseOutput.PostPrePackagePremiumInstalment=lPostPrePackagePremiumInstalment
						caseOutput.PostPrePackagePremiumNoDepositAmount=lPostPrePackagePremiumNoDepositAmount
						caseOutput.PostPrePackagePremiumNoDepositTotal=lPostPrePackagePremiumNoDepositTotal
						caseOutput.PostPrePackagePremiumQuarterlyAmount=lPostPrePackagePremiumQuarterlyAmount
						caseOutput.PostPrePackagePremiumQuarterlyTotal=lPostPrePackagePremiumQuarterlyTotal
						if(lPostPrePackagePremiumYearly.length()<=0){
							return lreturn
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
						Map lMapPlanPackage=this.inputPlanPackage(lPlanPackage)
						if(!lMapPlanPackage.Result){
							lPlanPackage=''
						}else{
							lPlanPackage=lMapPlanPackage.PlanPackage
						}
						caseOutput.PlanPackage=lPlanPackage
						if(lPlanPackage.length()<=0){
							return lreturn
						}
						Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
						if(!lMapQuoteMe.Result){
							lQuoteBy=''
							lQuotePhoneNo=''
							lQuoteEmail=''
							lQuoteNewsletter=''
							lQuoteCallMeNow=''
							lQuotePDFDownloadToDo=''
							lQuotePDFDownloadDetail=''
							lQuotePDFDownloadResult=''
						}else{
							lQuoteBy=lMapQuoteMe.QuoteBy
							lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
							lQuoteEmail=lMapQuoteMe.QuoteEmail
							lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
							lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
							lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
							lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
							lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
						}
						caseOutput.QuoteBy=lQuoteBy
						caseOutput.QuotePhoneNo=lQuotePhoneNo
						caseOutput.QuoteEmail=lQuoteEmail
						caseOutput.QuoteNewsletter=lQuoteNewsletter
						caseOutput.QuoteCallMeNow=lQuoteCallMeNow
						caseOutput.QuotePDFDownloadToDo=lQuotePDFDownloadToDo
						caseOutput.QuotePDFDownloadDetail=lQuotePDFDownloadDetail
						caseOutput.QuotePDFDownloadResult=lQuotePDFDownloadResult
						if(lQuoteBy.length()<=0){
							return lreturn
						}
						Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
						if(!lMapPolicyInsurer.Result){
							lPolicyInsurer=''
						}else{
							lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
						}
						caseOutput.PolicyInsurer=lPolicyInsurer
						if(!lMapPolicyInsurer.Result){
							return lreturn
						}
						Boolean lIsQuoteByNone=lQuoteBy.equalsIgnoreCase('NONE')
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsQuoteByNone)
						if(!lMapActualResult.Result){
							lActualResult=''
							lOpportunityNumber=''
							lVersion=''
							lPremiumYearly=''
							lPremiumDeposit=''
							lPremiumMonthly=''
							lPremiumInstalment=''
							lPremiumNoDepositAmount=''
							lPremiumNoDepositTotal=''
							lPremiumQuarterlyAmount=''
							lPremiumQuarterlyTotal=''
						}else{
							lActualResult=lMapActualResult.ActualResult
							lOpportunityNumber=lMapActualResult.OpportunityNumber
							lVersion=lMapActualResult.Version
							lPremiumYearly=lMapActualResult.PremiumYearly
							lPremiumDeposit=lMapActualResult.PremiumDeposit
							lPremiumMonthly=lMapActualResult.PremiumMonthly
							lPremiumInstalment=lMapActualResult.PremiumInstalment
							lPremiumNoDepositAmount=lMapActualResult.PremiumNoDepositAmount
							lPremiumNoDepositTotal=lMapActualResult.PremiumNoDepositTotal
							lPremiumQuarterlyAmount=lMapActualResult.PremiumQuarterlyAmount
							lPremiumQuarterlyTotal=lMapActualResult.PremiumQuarterlyTotal
						}
						caseOutput.ActualResult=lActualResult
						caseOutput.OpportunityNumber=lOpportunityNumber
						if(lVersion.length()>0){
							caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,lVersion)
						}
						caseOutput.PremiumYearly=lPremiumYearly
						caseOutput.PremiumDeposit=lPremiumDeposit
						caseOutput.PremiumMonthly=lPremiumMonthly
						caseOutput.PremiumInstalment=lPremiumInstalment
						caseOutput.PremiumNoDepositAmount=lPremiumNoDepositAmount
						caseOutput.PremiumNoDepositTotal=lPremiumNoDepositTotal
						caseOutput.PremiumQuarterlyAmount=lPremiumQuarterlyAmount
						caseOutput.PremiumQuarterlyTotal=lPremiumQuarterlyTotal
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					default:
						return lreturn
						break
				}
			}else{
				Map lMapPostPrePackage=this.inputPostPrePackage()
				if(!lMapPostPrePackage.Result){
					lPostPrePackagePremiumYearly=''
					lPostPrePackagePremiumDeposit=''
					lPostPrePackagePremiumMonthly=''
					lPostPrePackagePremiumInstalment=''
					lPostPrePackagePremiumNoDepositAmount=''
					lPostPrePackagePremiumNoDepositTotal=''
					lPostPrePackagePremiumQuarterlyAmount=''
					lPostPrePackagePremiumQuarterlyTotal=''
				}else{
					lPostPrePackagePremiumYearly=lMapPostPrePackage.PostPrePackagePremiumYearly
					lPostPrePackagePremiumDeposit=lMapPostPrePackage.PostPrePackagePremiumDeposit
					lPostPrePackagePremiumMonthly=lMapPostPrePackage.PostPrePackagePremiumMonthly
					lPostPrePackagePremiumInstalment=lMapPostPrePackage.PostPrePackagePremiumInstalment
					lPostPrePackagePremiumNoDepositAmount=lMapPostPrePackage.PostPrePackagePremiumNoDepositAmount
					lPostPrePackagePremiumNoDepositTotal=lMapPostPrePackage.PostPrePackagePremiumNoDepositTotal
					lPostPrePackagePremiumQuarterlyAmount=lMapPostPrePackage.PostPrePackagePremiumQuarterlyAmount
					lPostPrePackagePremiumQuarterlyTotal=lMapPostPrePackage.PostPrePackagePremiumQuarterlyTotal
				}
				caseOutput.PostPrePackagePremiumYearly=lPostPrePackagePremiumYearly
				caseOutput.PostPrePackagePremiumDeposit=lPostPrePackagePremiumDeposit
				caseOutput.PostPrePackagePremiumMonthly=lPostPrePackagePremiumMonthly
				caseOutput.PostPrePackagePremiumInstalment=lPostPrePackagePremiumInstalment
				caseOutput.PostPrePackagePremiumNoDepositAmount=lPostPrePackagePremiumNoDepositAmount
				caseOutput.PostPrePackagePremiumNoDepositTotal=lPostPrePackagePremiumNoDepositTotal
				caseOutput.PostPrePackagePremiumQuarterlyAmount=lPostPrePackagePremiumQuarterlyAmount
				caseOutput.PostPrePackagePremiumQuarterlyTotal=lPostPrePackagePremiumQuarterlyTotal
				if(lPostPrePackagePremiumYearly.length()<=0){
					return lreturn
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
				Map lMapPlanPackage=this.inputPlanPackage(lPlanPackage)
				if(!lMapPlanPackage.Result){
					lPlanPackage=''
				}else{
					lPlanPackage=lMapPlanPackage.PlanPackage
				}
				caseOutput.PlanPackage=lPlanPackage
				if(lPlanPackage.length()<=0){
					return lreturn
				}
				Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
				if(!lMapQuoteMe.Result){
					lQuoteBy=''
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
				}else{
					lQuoteBy=lMapQuoteMe.QuoteBy
					lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
					lQuoteEmail=lMapQuoteMe.QuoteEmail
					lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
					lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
					lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
					lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
					lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
				}
				caseOutput.QuoteBy=lQuoteBy
				caseOutput.QuotePhoneNo=lQuotePhoneNo
				caseOutput.QuoteEmail=lQuoteEmail
				caseOutput.QuoteNewsletter=lQuoteNewsletter
				caseOutput.QuoteCallMeNow=lQuoteCallMeNow
				caseOutput.QuotePDFDownloadToDo=lQuotePDFDownloadToDo
				caseOutput.QuotePDFDownloadDetail=lQuotePDFDownloadDetail
				caseOutput.QuotePDFDownloadResult=lQuotePDFDownloadResult
				if(lQuoteBy.length()<=0){
					return lreturn
				}
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				caseOutput.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Boolean lIsQuoteByNone=lQuoteBy.equalsIgnoreCase('NONE')
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsQuoteByNone)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
					lVersion=''
					lPremiumYearly=''
					lPremiumDeposit=''
					lPremiumMonthly=''
					lPremiumInstalment=''
					lPremiumNoDepositAmount=''
					lPremiumNoDepositTotal=''
					lPremiumQuarterlyAmount=''
					lPremiumQuarterlyTotal=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
					lVersion=lMapActualResult.Version
					lPremiumYearly=lMapActualResult.PremiumYearly
					lPremiumDeposit=lMapActualResult.PremiumDeposit
					lPremiumMonthly=lMapActualResult.PremiumMonthly
					lPremiumInstalment=lMapActualResult.PremiumInstalment
					lPremiumNoDepositAmount=lMapActualResult.PremiumNoDepositAmount
					lPremiumNoDepositTotal=lMapActualResult.PremiumNoDepositTotal
					lPremiumQuarterlyAmount=lMapActualResult.PremiumQuarterlyAmount
					lPremiumQuarterlyTotal=lMapActualResult.PremiumQuarterlyTotal
				}
				caseOutput.ActualResult=lActualResult
				caseOutput.OpportunityNumber=lOpportunityNumber
				if(lVersion.length()>0){
					caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,lVersion)
				}
				caseOutput.PremiumYearly=lPremiumYearly
				caseOutput.PremiumDeposit=lPremiumDeposit
				caseOutput.PremiumMonthly=lPremiumMonthly
				caseOutput.PremiumInstalment=lPremiumInstalment
				caseOutput.PremiumNoDepositAmount=lPremiumNoDepositAmount
				caseOutput.PremiumNoDepositTotal=lPremiumNoDepositTotal
				caseOutput.PremiumQuarterlyAmount=lPremiumQuarterlyAmount
				caseOutput.PremiumQuarterlyTotal=lPremiumQuarterlyTotal
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}
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
			lPositiveCase=THAExtendedWarrantyQuotationResultType.DEFAULT_POSITIVE_CASE
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
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lTagLoadingForm='loading'
			String lLocatorLoadingForm=IGNUemaHelper.getTagDataSeleniumKey(lTagLoadingForm)
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
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
	public Map inputPostPrePackage(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPostPrePackageA()
						break
					case 'B':
						lreturn=this.inputPostPrePackageB()
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPostPrePackageA()
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageA(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			String lTagPaymentOptionExtendedWarrantySwitchButton='paymentOptions'
			String lLocatorPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionExtendedWarrantySwitchButton)
			WebElement lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumPaymentFrequency='paymentFrequency'
			String lLocatorSelectedPremiumPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumPaymentFrequency)
			WebElement lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
			if(!lElementSelectedPremiumPaymentFrequency){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='totalPremium'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lTagSelectedPremiumAmountFirst='firstInstalment'
			String lLocatorSelectedPremiumAmountFirst=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountFirst)
			WebElement lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
			if(!lElementSelectedPremiumAmountFirst){
				return lreturn
			}
			String lTagSelectedPremiumAmountNext='instalment'
			String lLocatorSelectedPremiumAmountNext=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountNext)
			WebElement lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
			if(!lElementSelectedPremiumAmountNext){
				return lreturn
			}
			Boolean lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
			if(!lIsSelectedPremiumPaymentFrequencyAsYearly){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
				lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
				if(!lElementPaymentOptionExtendedWarrantySwitchButton){
					return lreturn
				}
				lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
				lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
				if(!lElementSelectedPremiumPaymentFrequency){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
				if(!lElementSelectedPremiumAmountFirst){
					return lreturn
				}
				lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
				if(!lElementSelectedPremiumAmountNext){
					return lreturn
				}
				lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
				if(lIsSelectedPremiumPaymentFrequencyAsYearly){
					return lreturn
				}
				Boolean lIsSelectedPremiumPaymentFrequencyAsWithDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('MONTHLY')
				Boolean lIsSelectedPremiumPaymentFrequencyAsNoDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('NO DEPOSIT')
				Boolean lIsSelectedPremiumPaymentFrequencyAsQuarterly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('QUARTERLY')
				String lSelectedPremiumAmountTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountTotalValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountTotalValueText,0)
				Float lSelectedPremiumAmountTotalValueNumCal=0
				String lSelectedPremiumAmountFirstValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountFirst).trim()
				Float lSelectedPremiumAmountFirstValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountFirstValueText,0)
				String lSelectedPremiumAmountNextValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountNext).trim()
				Float lSelectedPremiumAmountNextValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountNextValueText,0)
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit && !lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPostPrePackagePremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPostPrePackagePremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*9)
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*10)
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPostPrePackagePremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageB(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			String lTagPaymentOptionExtendedWarrantySwitchButton='paymentOptions'
			String lLocatorPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionExtendedWarrantySwitchButton)
			WebElement lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumPaymentFrequency='paymentFrequency'
			String lLocatorSelectedPremiumPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumPaymentFrequency)
			WebElement lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
			if(!lElementSelectedPremiumPaymentFrequency){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='totalPremium'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lTagSelectedPremiumAmountFirst='firstInstalment'
			String lLocatorSelectedPremiumAmountFirst=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountFirst)
			WebElement lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
			if(!lElementSelectedPremiumAmountFirst){
				return lreturn
			}
			String lTagSelectedPremiumAmountNext='instalment'
			String lLocatorSelectedPremiumAmountNext=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountNext)
			WebElement lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
			if(!lElementSelectedPremiumAmountNext){
				return lreturn
			}
			Boolean lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
			if(!lIsSelectedPremiumPaymentFrequencyAsYearly){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
				lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
				if(!lElementPaymentOptionExtendedWarrantySwitchButton){
					return lreturn
				}
				lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
				lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
				if(!lElementSelectedPremiumPaymentFrequency){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
				if(!lElementSelectedPremiumAmountFirst){
					return lreturn
				}
				lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
				if(!lElementSelectedPremiumAmountNext){
					return lreturn
				}
				lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
				if(lIsSelectedPremiumPaymentFrequencyAsYearly){
					return lreturn
				}
				Boolean lIsSelectedPremiumPaymentFrequencyAsWithDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('MONTHLY')
				Boolean lIsSelectedPremiumPaymentFrequencyAsNoDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('NO DEPOSIT')
				Boolean lIsSelectedPremiumPaymentFrequencyAsQuarterly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('QUARTERLY')
				String lSelectedPremiumAmountTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountTotalValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountTotalValueText,0)
				Float lSelectedPremiumAmountTotalValueNumCal=0
				String lSelectedPremiumAmountFirstValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountFirst).trim()
				Float lSelectedPremiumAmountFirstValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountFirstValueText,0)
				String lSelectedPremiumAmountNextValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountNext).trim()
				Float lSelectedPremiumAmountNextValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountNextValueText,0)
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit && !lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPostPrePackagePremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPostPrePackagePremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*9)
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*10)
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPostPrePackagePremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
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
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputLanguageA(strLanguage)
						break
					case 'B':
						lreturn=this.inputLanguageB(strLanguage)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputLanguageA(strLanguage)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguageA(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAExtendedWarrantyQuotationResultType.DEFAULT_LANGUAGE.toUpperCase())
			}
			lLanguage=''
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
				lLanguage=THAExtendedWarrantyQuotationResultType.DEFAULT_LANGUAGE
			}
			lLanguage=lLanguage.toUpperCase()
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
	public Map inputLanguageB(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAExtendedWarrantyQuotationResultType.DEFAULT_LANGUAGE.toUpperCase())
			}
			lLanguage=''
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
				lLanguage=THAExtendedWarrantyQuotationResultType.DEFAULT_LANGUAGE
			}
			lLanguage=lLanguage.toUpperCase()
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
	public Map inputPlanPackage(String strPlanPackage){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PlanPackage','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPlanPackageA(strPlanPackage)
						break
					case 'B':
						lreturn=this.inputPlanPackageB(strPlanPackage)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPlanPackageA(strPlanPackage)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanPackageA(String strPlanPackage){
		Map lreturn=[:]
		String lPlanPackage=strPlanPackage.toUpperCase().trim()
		Map lPlanPackageList=['1':'Value','2':'Recommended','3':'Premium']
		String lPlanPackageItem=lPlanPackageList.get(lPlanPackage)
		if(!lPlanPackageItem){
			lPlanPackageItem=lPlanPackageList.get(THAExtendedWarrantyQuotationResultType.DEFAULT_PLAN_PACKAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanPackage','')
			lreturn.put('Result',lResult)
			String lTagButton='selected-package'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='package-option'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanPackage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanPackageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanPackage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanPackage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanPackage.length()<=0){
							lPlanPackage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanPackage.length()<=0){
					lPlanPackage='None'
				}
			}
			lResult=lPlanPackage.length()>0
			if(lResult){
				lreturn.put('PlanPackage',lPlanPackage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanPackageB(String strPlanPackage){
		Map lreturn=[:]
		String lPlanPackage=strPlanPackage.toUpperCase().trim()
		Map lPlanPackageList=['1':'Value','2':'Recommended','3':'Premium']
		String lPlanPackageItem=lPlanPackageList.get(lPlanPackage)
		if(!lPlanPackageItem){
			lPlanPackageItem=lPlanPackageList.get(THAExtendedWarrantyQuotationResultType.DEFAULT_PLAN_PACKAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanPackage','')
			lreturn.put('Result',lResult)
			String lTagButton='selected-package'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='package-option'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanPackage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanPackageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanPackage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanPackage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanPackage.length()<=0){
							lPlanPackage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanPackage.length()<=0){
					lPlanPackage='None'
				}
			}
			lResult=lPlanPackage.length()>0
			if(lResult){
				lreturn.put('PlanPackage',lPlanPackage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final Integer DEFAULT_NUM_QUOTE_ME=1
	public Map inputQuoteMe(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQuoteMeA(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'B':
						lreturn=this.inputQuoteMeB(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQuoteMeA(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeA(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		Map lQuoteByList=['1':'1','2':'2','3':'3']
		Integer lQuoteByDefault=1
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			String lQuoteByItem=lQuoteByList.get(lQuoteBy)
			if(!lQuoteByItem){
				lQuoteByItem=lQuoteByList.get(THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase())
			}
			lQuoteBy=''
			Integer lQuoteByNum=IGNUemaHelper.convertStringToInteger(lQuoteByItem,this.DEFAULT_NUM_QUOTE_ME)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			Boolean lIsCheckNewsletter=false
			switch(lQuoteByNum){
				case 2:
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callmeback-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='callMeBackModal-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-close'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callmeback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='callMeBackModal-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='callmeback-submit'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='callmeback-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 3:
					lQuoteBy='Email'
					String lTagButtonEmailMe='savequote-btn'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='quoteByEmail-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequoteModal-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='PDF'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lMainWindow=this.driver.getWindowHandle()
								try{
									Set<String> lSetWinHandle=this.driver.getWindowHandles()
									if(!lSetWinHandle){
										IGNUemaHelper.delayThreadSecond(1)
										lSetWinHandle=this.driver.getWindowHandles()
									}else{
										if(lSetWinHandle.size()<=1){
											IGNUemaHelper.delayThreadSecond(1)
											lSetWinHandle=this.driver.getWindowHandles()
										}
									}
									if(!lSetWinHandle){
										IGNUemaHelper.delayThreadSecond(2)
										lSetWinHandle=this.driver.getWindowHandles()
									}else{
										if(lSetWinHandle.size()<=1){
											IGNUemaHelper.delayThreadSecond(2)
											lSetWinHandle=this.driver.getWindowHandles()
										}
									}
									if(!lSetWinHandle){
										IGNUemaHelper.delayThreadSecond(3)
										lSetWinHandle=this.driver.getWindowHandles()
									}else{
										if(lSetWinHandle.size()<=1){
											IGNUemaHelper.delayThreadSecond(3)
											lSetWinHandle=this.driver.getWindowHandles()
										}
									}
									for(String lWindowHandle:lSetWinHandle){
										if(!lMainWindow.equals(lWindowHandle)){
											this.driver.switchTo().window(lWindowHandle)
											IGNUemaHelper.delayThreadSecond(1)
											lIsQuotePDFDownloadResult=true
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
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='quoteByEmail-email-next'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='quoteByEmail-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='quoteByEmail-mobileNumber-next'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='quoteByEmail-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				default:
					lQuoteBy='None'
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeB(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		Map lQuoteByList=['1':'1','2':'2','3':'3']
		Integer lQuoteByDefault=1
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			String lQuoteByItem=lQuoteByList.get(lQuoteBy)
			if(!lQuoteByItem){
				lQuoteByItem=lQuoteByList.get(THAExtendedWarrantyQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase())
			}
			lQuoteBy=''
			Integer lQuoteByNum=IGNUemaHelper.convertStringToInteger(lQuoteByItem,this.DEFAULT_NUM_QUOTE_ME)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			Boolean lIsCheckNewsletter=false
			switch(lQuoteByNum){
				case 2:
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callmeback-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='callMeBackModal-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-close'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callmeback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='callMeBackModal-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='callmeback-submit'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='callmeback-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 3:
					lQuoteBy='Email'
					String lTagButtonEmailMe='savequote-btn'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='quoteByEmail-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequoteModal-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='PDF'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lMainWindow=this.driver.getWindowHandle()
								try{
									Set<String> lSetWinHandle=this.driver.getWindowHandles()
									if(!lSetWinHandle){
										IGNUemaHelper.delayThreadSecond(1)
										lSetWinHandle=this.driver.getWindowHandles()
									}else{
										if(lSetWinHandle.size()<=1){
											IGNUemaHelper.delayThreadSecond(1)
											lSetWinHandle=this.driver.getWindowHandles()
										}
									}
									if(!lSetWinHandle){
										IGNUemaHelper.delayThreadSecond(2)
										lSetWinHandle=this.driver.getWindowHandles()
									}else{
										if(lSetWinHandle.size()<=1){
											IGNUemaHelper.delayThreadSecond(2)
											lSetWinHandle=this.driver.getWindowHandles()
										}
									}
									if(!lSetWinHandle){
										IGNUemaHelper.delayThreadSecond(3)
										lSetWinHandle=this.driver.getWindowHandles()
									}else{
										if(lSetWinHandle.size()<=1){
											IGNUemaHelper.delayThreadSecond(3)
											lSetWinHandle=this.driver.getWindowHandles()
										}
									}
									for(String lWindowHandle:lSetWinHandle){
										if(!lMainWindow.equals(lWindowHandle)){
											this.driver.switchTo().window(lWindowHandle)
											IGNUemaHelper.delayThreadSecond(1)
											lIsQuotePDFDownloadResult=true
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
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='quoteByEmail-email-next'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='quoteByEmail-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='quoteByEmail-mobileNumber-next'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='quoteByEmail-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				default:
					lQuoteBy='None'
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase,Boolean isQuoteByNone){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputActualResultA(isPositiveCase,isQuoteByNone)
						break
					case 'B':
						lreturn=this.inputActualResultB(isPositiveCase,isQuoteByNone)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputActualResultA(isPositiveCase,isQuoteByNone)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultA(Boolean isPositiveCase,Boolean isQuoteByNone){
		Map lreturn=[:]
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lTagInfo=''
			String lLocatorInfo=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='quotationNo'
			lTagInfo=lTagOpportunityNumber
			lLocatorInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagInfo)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lTagInfo='buyNow'
			lLocatorInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagInfo)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				return lreturn
			}
			String lTagPaymentOptionExtendedWarrantySwitchButton='paymentOptions'
			String lLocatorPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionExtendedWarrantySwitchButton)
			WebElement lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumPaymentFrequency='paymentFrequency'
			String lLocatorSelectedPremiumPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumPaymentFrequency)
			WebElement lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
			if(!lElementSelectedPremiumPaymentFrequency){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='totalPremium'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lTagSelectedPremiumAmountFirst='firstInstalment'
			String lLocatorSelectedPremiumAmountFirst=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountFirst)
			WebElement lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
			if(!lElementSelectedPremiumAmountFirst){
				return lreturn
			}
			String lTagSelectedPremiumAmountNext='instalment'
			String lLocatorSelectedPremiumAmountNext=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountNext)
			WebElement lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
			if(!lElementSelectedPremiumAmountNext){
				return lreturn
			}
			Boolean lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
			if(!lIsSelectedPremiumPaymentFrequencyAsYearly){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
				lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
				if(!lElementPaymentOptionExtendedWarrantySwitchButton){
					return lreturn
				}
				lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
				lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
				if(!lElementSelectedPremiumPaymentFrequency){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
				if(!lElementSelectedPremiumAmountFirst){
					return lreturn
				}
				lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
				if(!lElementSelectedPremiumAmountNext){
					return lreturn
				}
				lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
				if(lIsSelectedPremiumPaymentFrequencyAsYearly){
					return lreturn
				}
				Boolean lIsSelectedPremiumPaymentFrequencyAsWithDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('MONTHLY')
				Boolean lIsSelectedPremiumPaymentFrequencyAsNoDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('NO DEPOSIT')
				Boolean lIsSelectedPremiumPaymentFrequencyAsQuarterly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('QUARTERLY')
				String lSelectedPremiumAmountTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountTotalValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountTotalValueText,0)
				Float lSelectedPremiumAmountTotalValueNumCal=0
				String lSelectedPremiumAmountFirstValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountFirst).trim()
				Float lSelectedPremiumAmountFirstValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountFirstValueText,0)
				String lSelectedPremiumAmountNextValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountNext).trim()
				Float lSelectedPremiumAmountNextValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountNextValueText,0)
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit&&!lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*9)
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*10)
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			if(isQuoteByNone){
				if(lPremiumYearlyTotalValueFloat==0){
					if(isPositiveCase){
						lIsDone=false
					}else{
						lIsDone=true
					}
					lActualResult=lIsDone
				}else{
					if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
						if(!this.waitUntilLoaded()){
							this.waitUntilLoaded()
						}
						Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',30)
						if(isPositiveCase){
							lActualResult=lRedirected
							lIsDone=lRedirected
						}else{
							lActualResult=!lRedirected
							lIsDone=!lRedirected
						}
					}else{
						lIsDone=false
						lActualResult=lIsDone
					}
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lTagInfo=lTagOpportunityNumber
						lLocatorInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagInfo)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=lActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultB(Boolean isPositiveCase,Boolean isQuoteByNone){
		Map lreturn=[:]
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lTagInfo=''
			String lLocatorInfo=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='quotationNo'
			lTagInfo=lTagOpportunityNumber
			lLocatorInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagInfo)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lTagInfo='buyNow'
			lLocatorInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagInfo)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				return lreturn
			}
			String lTagPaymentOptionExtendedWarrantySwitchButton='paymentOptions'
			String lLocatorPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionExtendedWarrantySwitchButton)
			WebElement lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			Boolean lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumPaymentFrequency='paymentFrequency'
			String lLocatorSelectedPremiumPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumPaymentFrequency)
			WebElement lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
			if(!lElementSelectedPremiumPaymentFrequency){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='totalPremium'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lTagSelectedPremiumAmountFirst='firstInstalment'
			String lLocatorSelectedPremiumAmountFirst=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountFirst)
			WebElement lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
			if(!lElementSelectedPremiumAmountFirst){
				return lreturn
			}
			String lTagSelectedPremiumAmountNext='instalment'
			String lLocatorSelectedPremiumAmountNext=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountNext)
			WebElement lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
			if(!lElementSelectedPremiumAmountNext){
				return lreturn
			}
			Boolean lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
			if(!lIsSelectedPremiumPaymentFrequencyAsYearly){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
				lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
				if(!lElementPaymentOptionExtendedWarrantySwitchButton){
					return lreturn
				}
				lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
				lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
				if(!lElementSelectedPremiumPaymentFrequency){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
				if(!lElementSelectedPremiumAmountFirst){
					return lreturn
				}
				lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
				if(!lElementSelectedPremiumAmountNext){
					return lreturn
				}
				lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
				if(lIsSelectedPremiumPaymentFrequencyAsYearly){
					return lreturn
				}
				Boolean lIsSelectedPremiumPaymentFrequencyAsWithDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('MONTHLY')
				Boolean lIsSelectedPremiumPaymentFrequencyAsNoDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('NO DEPOSIT')
				Boolean lIsSelectedPremiumPaymentFrequencyAsQuarterly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('QUARTERLY')
				String lSelectedPremiumAmountTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountTotalValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountTotalValueText,0)
				Float lSelectedPremiumAmountTotalValueNumCal=0
				String lSelectedPremiumAmountFirstValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountFirst).trim()
				Float lSelectedPremiumAmountFirstValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountFirstValueText,0)
				String lSelectedPremiumAmountNextValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountNext).trim()
				Float lSelectedPremiumAmountNextValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountNextValueText,0)
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit&&!lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*9)
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*10)
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonDisabled){
				if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton)
				}
			}
			lElementPaymentOptionExtendedWarrantySwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionExtendedWarrantySwitchButton)
			if(!lElementPaymentOptionExtendedWarrantySwitchButton){
				return lreturn
			}
			lIsPaymentOptionExtendedWarrantySwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton,'disabled')
			lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionExtendedWarrantySwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionExtendedWarrantySwitchButtonAsYearly){
				return lreturn
			}
			if(isQuoteByNone){
				if(lPremiumYearlyTotalValueFloat==0){
					if(isPositiveCase){
						lIsDone=false
					}else{
						lIsDone=true
					}
					lActualResult=lIsDone
				}else{
					if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
						if(!this.waitUntilLoaded()){
							this.waitUntilLoaded()
						}
						Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',30)
						if(isPositiveCase){
							lActualResult=lRedirected
							lIsDone=lRedirected
						}else{
							lActualResult=!lRedirected
							lIsDone=!lRedirected
						}
					}else{
						lIsDone=false
						lActualResult=lIsDone
					}
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lTagInfo=lTagOpportunityNumber
						lLocatorInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagInfo)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInfo)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=lActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPolicyInsurerA(strPolicyInsurer)
						break
					case 'B':
						lreturn=this.inputPolicyInsurerB(strPolicyInsurer)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPolicyInsurerA(strPolicyInsurer)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurerA(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			String lTagButton='insurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer='No Option'
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lResult=true
			if(lResult){
				lreturn.put('PolicyInsurer',lPolicyInsurer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurerB(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			String lTagButton='insurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer='No Option'
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lResult=true
			if(lResult){
				lreturn.put('PolicyInsurer',lPolicyInsurer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}