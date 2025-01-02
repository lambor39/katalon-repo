package org.roojai.tha.types.roojaigroundpartneragent.personalaccident
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentQuotationResultUtil
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentCoreType as THAPersonalAccidentCoreType
public class THARGPAPersonalAccidentQuotationResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAPersonalAccidentQuotationResultUtil lTHAPersonalAccidentQuotationResultUtil=null
	public THARGPAPersonalAccidentQuotationResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAPersonalAccidentQuotationResultUtil getlTHAPersonalAccidentQuotationResultUtil(){
		return this.lTHAPersonalAccidentQuotationResultUtil
	}
	private void setlTHAPersonalAccidentQuotationResultUtil(THAPersonalAccidentQuotationResultUtil newlTHAPersonalAccidentQuotationResultUtil){
		//Do Nothing
		//this.lTHAPersonalAccidentQuotationResultUtil=newlTHAPersonalAccidentQuotationResultUtil
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
		String lPersonalAccidentDeath=caseInput.PersonalAccidentDeath.toString().trim()
		String lPersonalAccidentLoss=caseInput.PersonalAccidentLoss.toString().trim()
		String lPersonalAccidentMedicalExpense=caseInput.PersonalAccidentMedicalExpense.toString().trim()
		String lPersonalAccidentDailyCash=caseInput.PersonalAccidentDailyCash.toString().trim()
		String lAdditionalCoverageMotorcycle=caseInput.AdditionalCoverageMotorcycle.toString().trim()
		String lAdditionalCoverageMurderedOrAssaulted=caseInput.AdditionalCoverageMurderedOrAssaulted.toString().trim()
		String lAdditionalCoverageExtremeSport=caseInput.AdditionalCoverageExtremeSport.toString().trim()
		String lQuoteBy=caseInput.QuoteBy.toString().trim()
		String lQuotePhoneNo=caseInput.QuotePhoneNo.toString().trim()
		String lQuoteEmail=caseInput.QuoteEmail.toString().trim()
		String lQuoteNewsletter=caseInput.QuoteNewsletter.toString().trim()
		String lQuoteCallMeNow=caseInput.QuoteCallMeNow.toString().trim()
		String lQuotePDFDownloadToDo=caseInput.QuotePDFDownloadToDo.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
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
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		String lAutomationLanguage=''
		String lAutomationPersonalAccidentDeath=''
		String lAutomationPersonalAccidentLoss=''
		String lAutomationPersonalAccidentMedicalExpense=''
		String lAutomationPersonalAccidentDailyCash=''
		String lAutomationAdditionalCoverageMotorcycle=''
		String lAutomationAdditionalCoverageMurderedOrAssaulted=''
		String lAutomationAdditionalCoverageExtremeSport=''
		String lAutomationOpportunityNumber=''
		String lAutomationPremiumYearly=''
		String lAutomationPremiumDeposit=''
		String lAutomationPremiumMonthly=''
		String lAutomationPremiumInstalment=''
		String lAutomationPremiumNoDepositAmount=''
		String lAutomationPremiumNoDepositTotal=''
		String lAutomationPremiumQuarterlyAmount=''
		String lAutomationPremiumQuarterlyTotal=''
		String lSalesforceRetrieveDataLanguage=''
		String lSalesforceRetrieveDataPersonalAccidentDeath=''
		String lSalesforceRetrieveDataPersonalAccidentLoss=''
		String lSalesforceRetrieveDataPersonalAccidentMedicalExpense=''
		String lSalesforceRetrieveDataPersonalAccidentDailyCash=''
		String lSalesforceRetrieveDataAdditionalCoverageMotorcycle=''
		String lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=''
		String lSalesforceRetrieveDataAdditionalCoverageExtremeSport=''
		String lSalesforceRetrieveDataOpportunityNumber=''
		String lSalesforceRetrieveDataPremiumYearly=''
		String lSalesforceRetrieveDataPremiumDeposit=''
		String lSalesforceRetrieveDataPremiumMonthly=''
		String lSalesforceRetrieveDataPremiumInstalment=''
		String lSalesforceRetrieveDataPremiumNoDepositAmount=''
		String lSalesforceRetrieveDataPremiumNoDepositTotal=''
		String lSalesforceRetrieveDataPremiumQuarterlyAmount=''
		String lSalesforceRetrieveDataPremiumQuarterlyTotal=''
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
			this.lTHAPersonalAccidentQuotationResultUtil=new THAPersonalAccidentQuotationResultUtil(this.driver,this.selenium)
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
						Map lMapPersonalAccidentDeath=this.inputPersonalAccidentDeath(lPersonalAccidentDeath)
						if(!lMapPersonalAccidentDeath.Result){
							lPersonalAccidentDeath=''
						}else{
							lPersonalAccidentDeath=lMapPersonalAccidentDeath.PersonalAccidentDeath
						}
						caseOutput.PersonalAccidentDeath=lPersonalAccidentDeath
						if(lPersonalAccidentDeath.length()<=0){
							return lreturn
						}
						Map lMapPersonalAccidentLoss=this.inputPersonalAccidentLoss(lPersonalAccidentLoss)
						if(!lMapPersonalAccidentLoss.Result){
							lPersonalAccidentLoss=''
						}else{
							lPersonalAccidentLoss=lMapPersonalAccidentLoss.PersonalAccidentLoss
						}
						caseOutput.PersonalAccidentLoss=lPersonalAccidentLoss
						if(lPersonalAccidentLoss.length()<=0){
							return lreturn
						}
						Map lMapPersonalAccidentMedicalExpense=this.inputPersonalAccidentMedicalExpense(lPersonalAccidentMedicalExpense)
						if(!lMapPersonalAccidentMedicalExpense.Result){
							lPersonalAccidentMedicalExpense=''
						}else{
							lPersonalAccidentMedicalExpense=lMapPersonalAccidentMedicalExpense.PersonalAccidentMedicalExpense
						}
						caseOutput.PersonalAccidentMedicalExpense=lPersonalAccidentMedicalExpense
						if(lPersonalAccidentMedicalExpense.length()<=0){
							return lreturn
						}
						Map lMapPersonalAccidentDailyCash=this.inputPersonalAccidentDailyCash(lPersonalAccidentDailyCash)
						if(!lMapPersonalAccidentDailyCash.Result){
							lPersonalAccidentDailyCash=''
						}else{
							lPersonalAccidentDailyCash=lMapPersonalAccidentDailyCash.PersonalAccidentDailyCash
						}
						caseOutput.PersonalAccidentDailyCash=lPersonalAccidentDailyCash
						if(lPersonalAccidentDailyCash.length()<=0){
							return lreturn
						}
						Map lMapAdditionalCoverageMotorcycle=this.inputAdditionalCoverageMotorcycle(lAdditionalCoverageMotorcycle)
						if(!lMapAdditionalCoverageMotorcycle.Result){
							lAdditionalCoverageMotorcycle=''
						}else{
							lAdditionalCoverageMotorcycle=lMapAdditionalCoverageMotorcycle.AdditionalCoverageMotorcycle
						}
						caseOutput.AdditionalCoverageMotorcycle=lAdditionalCoverageMotorcycle
						if(lAdditionalCoverageMotorcycle.length()<=0){
							return lreturn
						}
						Map lMapAdditionalCoverageMurderedOrAssaulted=this.inputAdditionalCoverageMurderedOrAssaulted(lAdditionalCoverageMurderedOrAssaulted)
						if(!lMapAdditionalCoverageMurderedOrAssaulted.Result){
							lAdditionalCoverageMurderedOrAssaulted=''
						}else{
							lAdditionalCoverageMurderedOrAssaulted=lMapAdditionalCoverageMurderedOrAssaulted.AdditionalCoverageMurderedOrAssaulted
						}
						caseOutput.AdditionalCoverageMurderedOrAssaulted=lAdditionalCoverageMurderedOrAssaulted
						if(lAdditionalCoverageMurderedOrAssaulted.length()<=0){
							return lreturn
						}
						Map lMapAdditionalCoverageExtremeSport=this.inputAdditionalCoverageExtremeSport(lAdditionalCoverageExtremeSport)
						if(!lMapAdditionalCoverageExtremeSport.Result){
							lAdditionalCoverageExtremeSport=''
						}else{
							lAdditionalCoverageExtremeSport=lMapAdditionalCoverageExtremeSport.AdditionalCoverageExtremeSport
						}
						caseOutput.AdditionalCoverageExtremeSport=lAdditionalCoverageExtremeSport
						if(lAdditionalCoverageExtremeSport.length()<=0){
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
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
						Boolean lIsActualResult=false
						Boolean lIsQuoteByNone=lQuoteBy.equalsIgnoreCase('NONE')
						if(!lIsQuoteByNone){
							Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
							if(!lMapSalesforceProceedTodo.Result){
								lSalesforceProceedTodo=''
							}else{
								lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
							}
							caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
							if(lSalesforceProceedTodo.length()<=0){
								return lreturn
							}
							Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
							if(lIsSalesforceProceedTodo){
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
								if(lIsAccountNameAnonymous){
									this.lTHAPersonalAccidentQuotationResultUtil.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
								}
							}
						}
						Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
						if(!lMapAutomationDataBefore.Result){
							lAutomationLanguage=''
							lAutomationPersonalAccidentDeath=''
							lAutomationPersonalAccidentLoss=''
							lAutomationPersonalAccidentMedicalExpense=''
							lAutomationPersonalAccidentDailyCash=''
							lAutomationAdditionalCoverageMotorcycle=''
							lAutomationAdditionalCoverageMurderedOrAssaulted=''
							lAutomationAdditionalCoverageExtremeSport=''
							lAutomationOpportunityNumber=''
							lAutomationPremiumYearly=''
							lAutomationPremiumDeposit=''
							lAutomationPremiumMonthly=''
							lAutomationPremiumInstalment=''
							lAutomationPremiumNoDepositAmount=''
							lAutomationPremiumNoDepositTotal=''
							lAutomationPremiumQuarterlyAmount=''
							lAutomationPremiumQuarterlyTotal=''
						}else{
							lAutomationLanguage=lMapAutomationDataBefore.AutomationLanguage
							lAutomationPersonalAccidentDeath=lMapAutomationDataBefore.AutomationPersonalAccidentDeath
							lAutomationPersonalAccidentLoss=lMapAutomationDataBefore.AutomationPersonalAccidentLoss
							lAutomationPersonalAccidentMedicalExpense=lMapAutomationDataBefore.AutomationPersonalAccidentMedicalExpense
							lAutomationPersonalAccidentDailyCash=lMapAutomationDataBefore.AutomationPersonalAccidentDailyCash
							lAutomationAdditionalCoverageMotorcycle=lMapAutomationDataBefore.AutomationAdditionalCoverageMotorcycle
							lAutomationAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataBefore.AutomationAdditionalCoverageMurderedOrAssaulted
							lAutomationAdditionalCoverageExtremeSport=lMapAutomationDataBefore.AutomationAdditionalCoverageExtremeSport
							lAutomationOpportunityNumber=lMapAutomationDataBefore.AutomationOpportunityNumber
							lAutomationPremiumYearly=lMapAutomationDataBefore.AutomationPremiumYearly
							lAutomationPremiumDeposit=lMapAutomationDataBefore.AutomationPremiumDeposit
							lAutomationPremiumMonthly=lMapAutomationDataBefore.AutomationPremiumMonthly
							lAutomationPremiumInstalment=lMapAutomationDataBefore.AutomationPremiumInstalment
							lAutomationPremiumNoDepositAmount=lMapAutomationDataBefore.AutomationPremiumNoDepositAmount
							lAutomationPremiumNoDepositTotal=lMapAutomationDataBefore.AutomationPremiumNoDepositTotal
							lAutomationPremiumQuarterlyAmount=lMapAutomationDataBefore.AutomationPremiumQuarterlyAmount
							lAutomationPremiumQuarterlyTotal=lMapAutomationDataBefore.AutomationPremiumQuarterlyTotal
						}
						caseOutput.AutomationLanguage=lAutomationLanguage
						caseOutput.AutomationPersonalAccidentDeath=lAutomationPersonalAccidentDeath
						caseOutput.AutomationPersonalAccidentLoss=lAutomationPersonalAccidentLoss
						caseOutput.AutomationPersonalAccidentMedicalExpense=lAutomationPersonalAccidentMedicalExpense
						caseOutput.AutomationPersonalAccidentDailyCash=lAutomationPersonalAccidentDailyCash
						caseOutput.AutomationAdditionalCoverageMotorcycle=lAutomationAdditionalCoverageMotorcycle
						caseOutput.AutomationAdditionalCoverageMurderedOrAssaulted=lAutomationAdditionalCoverageMurderedOrAssaulted
						caseOutput.AutomationAdditionalCoverageExtremeSport=lAutomationAdditionalCoverageExtremeSport
						caseOutput.AutomationOpportunityNumber=lAutomationOpportunityNumber
						caseOutput.AutomationPremiumYearly=lAutomationPremiumYearly
						caseOutput.AutomationPremiumDeposit=lAutomationPremiumDeposit
						caseOutput.AutomationPremiumMonthly=lAutomationPremiumMonthly
						caseOutput.AutomationPremiumInstalment=lAutomationPremiumInstalment
						caseOutput.AutomationPremiumNoDepositAmount=lAutomationPremiumNoDepositAmount
						caseOutput.AutomationPremiumNoDepositTotal=lAutomationPremiumNoDepositTotal
						caseOutput.AutomationPremiumQuarterlyAmount=lAutomationPremiumQuarterlyAmount
						caseOutput.AutomationPremiumQuarterlyTotal=lAutomationPremiumQuarterlyTotal
						if(!lMapAutomationDataBefore.Result){
							return lreturn
						}
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
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
						lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
						if(lIsActualResult){
							Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
							if(!lMapSalesforceProceedTodo.Result){
								lSalesforceProceedTodo=''
							}else{
								lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
							}
							caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
							if(lSalesforceProceedTodo.length()<=0){
								return lreturn
							}
							Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
							if(lIsSalesforceProceedTodo){
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
								lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
							}
							if(lIsActualResult){
								Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput,lIsQuoteByNone)
								lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								if(!lMapSalesforceProceedVerifyBefore.Result){
									return lreturn
								}
							}
							if(lIsActualResult){
								Map lMapSalesforceProceedRetrieveTodo=this.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,caseOutput.SalesforceVerifyDataOpportunityObjAccountid)
								if(!lMapSalesforceProceedRetrieveTodo.Result){
									lSalesforceProceedRetrieveTodo=''
								}else{
									lSalesforceProceedRetrieveTodo=lMapSalesforceProceedRetrieveTodo.SalesforceProceedRetrieveTodo
								}
								caseOutput.SalesforceProceedRetrieveTodo=lSalesforceProceedRetrieveTodo
								if(lSalesforceProceedRetrieveTodo.length()<=0){
									return lreturn
								}
								Boolean lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
								if(lIsSalesforceProceedRetrieveTodo){
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
									lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
									lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
									caseOutput.ActualResult=lActualResult
									if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
										return lreturn
									}
									if(lIsActualResult){
										Map lMapAutomationDataAfter=this.inputAutomationDataAfter()
										if(!lMapAutomationDataAfter.Result){
											lSalesforceRetrieveDataLanguage=''
											lSalesforceRetrieveDataPersonalAccidentDeath=''
											lSalesforceRetrieveDataPersonalAccidentLoss=''
											lSalesforceRetrieveDataPersonalAccidentMedicalExpense=''
											lSalesforceRetrieveDataPersonalAccidentDailyCash=''
											lSalesforceRetrieveDataAdditionalCoverageMotorcycle=''
											lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=''
											lSalesforceRetrieveDataAdditionalCoverageExtremeSport=''
											lSalesforceRetrieveDataOpportunityNumber=''
											lSalesforceRetrieveDataPremiumYearly=''
											lSalesforceRetrieveDataPremiumDeposit=''
											lSalesforceRetrieveDataPremiumMonthly=''
											lSalesforceRetrieveDataPremiumInstalment=''
											lSalesforceRetrieveDataPremiumNoDepositAmount=''
											lSalesforceRetrieveDataPremiumNoDepositTotal=''
											lSalesforceRetrieveDataPremiumQuarterlyAmount=''
											lSalesforceRetrieveDataPremiumQuarterlyTotal=''
										}else{
											lSalesforceRetrieveDataLanguage=lMapAutomationDataAfter.SalesforceRetrieveDataLanguage
											lSalesforceRetrieveDataPersonalAccidentDeath=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDeath
											lSalesforceRetrieveDataPersonalAccidentLoss=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentLoss
											lSalesforceRetrieveDataPersonalAccidentMedicalExpense=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentMedicalExpense
											lSalesforceRetrieveDataPersonalAccidentDailyCash=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDailyCash
											lSalesforceRetrieveDataAdditionalCoverageMotorcycle=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMotorcycle
											lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
											lSalesforceRetrieveDataAdditionalCoverageExtremeSport=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageExtremeSport
											lSalesforceRetrieveDataOpportunityNumber=lMapAutomationDataAfter.SalesforceRetrieveDataOpportunityNumber
											lSalesforceRetrieveDataPremiumYearly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumYearly
											lSalesforceRetrieveDataPremiumDeposit=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumDeposit
											lSalesforceRetrieveDataPremiumMonthly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumMonthly
											lSalesforceRetrieveDataPremiumInstalment=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumInstalment
											lSalesforceRetrieveDataPremiumNoDepositAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositAmount
											lSalesforceRetrieveDataPremiumNoDepositTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositTotal
											lSalesforceRetrieveDataPremiumQuarterlyAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyAmount
											lSalesforceRetrieveDataPremiumQuarterlyTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyTotal
										}
										caseOutput.SalesforceRetrieveDataLanguage=lSalesforceRetrieveDataLanguage
										caseOutput.SalesforceRetrieveDataPersonalAccidentDeath=lSalesforceRetrieveDataPersonalAccidentDeath
										caseOutput.SalesforceRetrieveDataPersonalAccidentLoss=lSalesforceRetrieveDataPersonalAccidentLoss
										caseOutput.SalesforceRetrieveDataPersonalAccidentMedicalExpense=lSalesforceRetrieveDataPersonalAccidentMedicalExpense
										caseOutput.SalesforceRetrieveDataPersonalAccidentDailyCash=lSalesforceRetrieveDataPersonalAccidentDailyCash
										caseOutput.SalesforceRetrieveDataAdditionalCoverageMotorcycle=lSalesforceRetrieveDataAdditionalCoverageMotorcycle
										caseOutput.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
										caseOutput.SalesforceRetrieveDataAdditionalCoverageExtremeSport=lSalesforceRetrieveDataAdditionalCoverageExtremeSport
										caseOutput.SalesforceRetrieveDataOpportunityNumber=lSalesforceRetrieveDataOpportunityNumber
										caseOutput.SalesforceRetrieveDataPremiumYearly=lSalesforceRetrieveDataPremiumYearly
										caseOutput.SalesforceRetrieveDataPremiumDeposit=lSalesforceRetrieveDataPremiumDeposit
										caseOutput.SalesforceRetrieveDataPremiumMonthly=lSalesforceRetrieveDataPremiumMonthly
										caseOutput.SalesforceRetrieveDataPremiumInstalment=lSalesforceRetrieveDataPremiumInstalment
										caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount=lSalesforceRetrieveDataPremiumNoDepositAmount
										caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal=lSalesforceRetrieveDataPremiumNoDepositTotal
										caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount=lSalesforceRetrieveDataPremiumQuarterlyAmount
										caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal=lSalesforceRetrieveDataPremiumQuarterlyTotal
										if(!lMapAutomationDataAfter.Result){
											return lreturn
										}
										Map lMapSalesforceProceedVerifyAfter=this.inputSalesforceProceedVerifyAfter(caseOutput)
										lIsActualResult=lMapSalesforceProceedVerifyAfter.Result
										lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
										caseOutput.ActualResult=lActualResult
										if(!lMapSalesforceProceedVerifyAfter.Result){
											return lreturn
										}
									}
								}
							}
						}
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
						Map lMapPersonalAccidentDeath=this.inputPersonalAccidentDeath(lPersonalAccidentDeath)
						if(!lMapPersonalAccidentDeath.Result){
							lPersonalAccidentDeath=''
						}else{
							lPersonalAccidentDeath=lMapPersonalAccidentDeath.PersonalAccidentDeath
						}
						caseOutput.PersonalAccidentDeath=lPersonalAccidentDeath
						if(lPersonalAccidentDeath.length()<=0){
							return lreturn
						}
						Map lMapPersonalAccidentLoss=this.inputPersonalAccidentLoss(lPersonalAccidentLoss)
						if(!lMapPersonalAccidentLoss.Result){
							lPersonalAccidentLoss=''
						}else{
							lPersonalAccidentLoss=lMapPersonalAccidentLoss.PersonalAccidentLoss
						}
						caseOutput.PersonalAccidentLoss=lPersonalAccidentLoss
						if(lPersonalAccidentLoss.length()<=0){
							return lreturn
						}
						Map lMapPersonalAccidentMedicalExpense=this.inputPersonalAccidentMedicalExpense(lPersonalAccidentMedicalExpense)
						if(!lMapPersonalAccidentMedicalExpense.Result){
							lPersonalAccidentMedicalExpense=''
						}else{
							lPersonalAccidentMedicalExpense=lMapPersonalAccidentMedicalExpense.PersonalAccidentMedicalExpense
						}
						caseOutput.PersonalAccidentMedicalExpense=lPersonalAccidentMedicalExpense
						if(lPersonalAccidentMedicalExpense.length()<=0){
							return lreturn
						}
						Map lMapPersonalAccidentDailyCash=this.inputPersonalAccidentDailyCash(lPersonalAccidentDailyCash)
						if(!lMapPersonalAccidentDailyCash.Result){
							lPersonalAccidentDailyCash=''
						}else{
							lPersonalAccidentDailyCash=lMapPersonalAccidentDailyCash.PersonalAccidentDailyCash
						}
						caseOutput.PersonalAccidentDailyCash=lPersonalAccidentDailyCash
						if(lPersonalAccidentDailyCash.length()<=0){
							return lreturn
						}
						Map lMapAdditionalCoverageMotorcycle=this.inputAdditionalCoverageMotorcycle(lAdditionalCoverageMotorcycle)
						if(!lMapAdditionalCoverageMotorcycle.Result){
							lAdditionalCoverageMotorcycle=''
						}else{
							lAdditionalCoverageMotorcycle=lMapAdditionalCoverageMotorcycle.AdditionalCoverageMotorcycle
						}
						caseOutput.AdditionalCoverageMotorcycle=lAdditionalCoverageMotorcycle
						if(lAdditionalCoverageMotorcycle.length()<=0){
							return lreturn
						}
						Map lMapAdditionalCoverageMurderedOrAssaulted=this.inputAdditionalCoverageMurderedOrAssaulted(lAdditionalCoverageMurderedOrAssaulted)
						if(!lMapAdditionalCoverageMurderedOrAssaulted.Result){
							lAdditionalCoverageMurderedOrAssaulted=''
						}else{
							lAdditionalCoverageMurderedOrAssaulted=lMapAdditionalCoverageMurderedOrAssaulted.AdditionalCoverageMurderedOrAssaulted
						}
						caseOutput.AdditionalCoverageMurderedOrAssaulted=lAdditionalCoverageMurderedOrAssaulted
						if(lAdditionalCoverageMurderedOrAssaulted.length()<=0){
							return lreturn
						}
						Map lMapAdditionalCoverageExtremeSport=this.inputAdditionalCoverageExtremeSport(lAdditionalCoverageExtremeSport)
						if(!lMapAdditionalCoverageExtremeSport.Result){
							lAdditionalCoverageExtremeSport=''
						}else{
							lAdditionalCoverageExtremeSport=lMapAdditionalCoverageExtremeSport.AdditionalCoverageExtremeSport
						}
						caseOutput.AdditionalCoverageExtremeSport=lAdditionalCoverageExtremeSport
						if(lAdditionalCoverageExtremeSport.length()<=0){
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
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
						Boolean lIsActualResult=false
						Boolean lIsQuoteByNone=lQuoteBy.equalsIgnoreCase('NONE')
						if(!lIsQuoteByNone){
							Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
							if(!lMapSalesforceProceedTodo.Result){
								lSalesforceProceedTodo=''
							}else{
								lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
							}
							caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
							if(lSalesforceProceedTodo.length()<=0){
								return lreturn
							}
							Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
							if(lIsSalesforceProceedTodo){
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
								if(lIsAccountNameAnonymous){
									this.lTHAPersonalAccidentQuotationResultUtil.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
								}
							}
						}
						Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
						if(!lMapAutomationDataBefore.Result){
							lAutomationLanguage=''
							lAutomationPersonalAccidentDeath=''
							lAutomationPersonalAccidentLoss=''
							lAutomationPersonalAccidentMedicalExpense=''
							lAutomationPersonalAccidentDailyCash=''
							lAutomationAdditionalCoverageMotorcycle=''
							lAutomationAdditionalCoverageMurderedOrAssaulted=''
							lAutomationAdditionalCoverageExtremeSport=''
							lAutomationOpportunityNumber=''
							lAutomationPremiumYearly=''
							lAutomationPremiumDeposit=''
							lAutomationPremiumMonthly=''
							lAutomationPremiumInstalment=''
							lAutomationPremiumNoDepositAmount=''
							lAutomationPremiumNoDepositTotal=''
							lAutomationPremiumQuarterlyAmount=''
							lAutomationPremiumQuarterlyTotal=''
						}else{
							lAutomationLanguage=lMapAutomationDataBefore.AutomationLanguage
							lAutomationPersonalAccidentDeath=lMapAutomationDataBefore.AutomationPersonalAccidentDeath
							lAutomationPersonalAccidentLoss=lMapAutomationDataBefore.AutomationPersonalAccidentLoss
							lAutomationPersonalAccidentMedicalExpense=lMapAutomationDataBefore.AutomationPersonalAccidentMedicalExpense
							lAutomationPersonalAccidentDailyCash=lMapAutomationDataBefore.AutomationPersonalAccidentDailyCash
							lAutomationAdditionalCoverageMotorcycle=lMapAutomationDataBefore.AutomationAdditionalCoverageMotorcycle
							lAutomationAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataBefore.AutomationAdditionalCoverageMurderedOrAssaulted
							lAutomationAdditionalCoverageExtremeSport=lMapAutomationDataBefore.AutomationAdditionalCoverageExtremeSport
							lAutomationOpportunityNumber=lMapAutomationDataBefore.AutomationOpportunityNumber
							lAutomationPremiumYearly=lMapAutomationDataBefore.AutomationPremiumYearly
							lAutomationPremiumDeposit=lMapAutomationDataBefore.AutomationPremiumDeposit
							lAutomationPremiumMonthly=lMapAutomationDataBefore.AutomationPremiumMonthly
							lAutomationPremiumInstalment=lMapAutomationDataBefore.AutomationPremiumInstalment
							lAutomationPremiumNoDepositAmount=lMapAutomationDataBefore.AutomationPremiumNoDepositAmount
							lAutomationPremiumNoDepositTotal=lMapAutomationDataBefore.AutomationPremiumNoDepositTotal
							lAutomationPremiumQuarterlyAmount=lMapAutomationDataBefore.AutomationPremiumQuarterlyAmount
							lAutomationPremiumQuarterlyTotal=lMapAutomationDataBefore.AutomationPremiumQuarterlyTotal
						}
						caseOutput.AutomationLanguage=lAutomationLanguage
						caseOutput.AutomationPersonalAccidentDeath=lAutomationPersonalAccidentDeath
						caseOutput.AutomationPersonalAccidentLoss=lAutomationPersonalAccidentLoss
						caseOutput.AutomationPersonalAccidentMedicalExpense=lAutomationPersonalAccidentMedicalExpense
						caseOutput.AutomationPersonalAccidentDailyCash=lAutomationPersonalAccidentDailyCash
						caseOutput.AutomationAdditionalCoverageMotorcycle=lAutomationAdditionalCoverageMotorcycle
						caseOutput.AutomationAdditionalCoverageMurderedOrAssaulted=lAutomationAdditionalCoverageMurderedOrAssaulted
						caseOutput.AutomationAdditionalCoverageExtremeSport=lAutomationAdditionalCoverageExtremeSport
						caseOutput.AutomationOpportunityNumber=lAutomationOpportunityNumber
						caseOutput.AutomationPremiumYearly=lAutomationPremiumYearly
						caseOutput.AutomationPremiumDeposit=lAutomationPremiumDeposit
						caseOutput.AutomationPremiumMonthly=lAutomationPremiumMonthly
						caseOutput.AutomationPremiumInstalment=lAutomationPremiumInstalment
						caseOutput.AutomationPremiumNoDepositAmount=lAutomationPremiumNoDepositAmount
						caseOutput.AutomationPremiumNoDepositTotal=lAutomationPremiumNoDepositTotal
						caseOutput.AutomationPremiumQuarterlyAmount=lAutomationPremiumQuarterlyAmount
						caseOutput.AutomationPremiumQuarterlyTotal=lAutomationPremiumQuarterlyTotal
						if(!lMapAutomationDataBefore.Result){
							return lreturn
						}
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
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
						lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
						if(lIsActualResult){
							Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
							if(!lMapSalesforceProceedTodo.Result){
								lSalesforceProceedTodo=''
							}else{
								lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
							}
							caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
							if(lSalesforceProceedTodo.length()<=0){
								return lreturn
							}
							Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
							if(lIsSalesforceProceedTodo){
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
								lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
							}
							if(lIsActualResult){
								Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput,lIsQuoteByNone)
								lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								if(!lMapSalesforceProceedVerifyBefore.Result){
									return lreturn
								}
							}
							if(lIsActualResult){
								Map lMapSalesforceProceedRetrieveTodo=this.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,caseOutput.SalesforceVerifyDataOpportunityObjAccountid)
								if(!lMapSalesforceProceedRetrieveTodo.Result){
									lSalesforceProceedRetrieveTodo=''
								}else{
									lSalesforceProceedRetrieveTodo=lMapSalesforceProceedRetrieveTodo.SalesforceProceedRetrieveTodo
								}
								caseOutput.SalesforceProceedRetrieveTodo=lSalesforceProceedRetrieveTodo
								if(lSalesforceProceedRetrieveTodo.length()<=0){
									return lreturn
								}
								Boolean lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
								if(lIsSalesforceProceedRetrieveTodo){
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
									lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
									lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
									caseOutput.ActualResult=lActualResult
									if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
										return lreturn
									}
									if(lIsActualResult){
										Map lMapAutomationDataAfter=this.inputAutomationDataAfter()
										if(!lMapAutomationDataAfter.Result){
											lSalesforceRetrieveDataLanguage=''
											lSalesforceRetrieveDataPersonalAccidentDeath=''
											lSalesforceRetrieveDataPersonalAccidentLoss=''
											lSalesforceRetrieveDataPersonalAccidentMedicalExpense=''
											lSalesforceRetrieveDataPersonalAccidentDailyCash=''
											lSalesforceRetrieveDataAdditionalCoverageMotorcycle=''
											lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=''
											lSalesforceRetrieveDataAdditionalCoverageExtremeSport=''
											lSalesforceRetrieveDataOpportunityNumber=''
											lSalesforceRetrieveDataPremiumYearly=''
											lSalesforceRetrieveDataPremiumDeposit=''
											lSalesforceRetrieveDataPremiumMonthly=''
											lSalesforceRetrieveDataPremiumInstalment=''
											lSalesforceRetrieveDataPremiumNoDepositAmount=''
											lSalesforceRetrieveDataPremiumNoDepositTotal=''
											lSalesforceRetrieveDataPremiumQuarterlyAmount=''
											lSalesforceRetrieveDataPremiumQuarterlyTotal=''
										}else{
											lSalesforceRetrieveDataLanguage=lMapAutomationDataAfter.SalesforceRetrieveDataLanguage
											lSalesforceRetrieveDataPersonalAccidentDeath=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDeath
											lSalesforceRetrieveDataPersonalAccidentLoss=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentLoss
											lSalesforceRetrieveDataPersonalAccidentMedicalExpense=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentMedicalExpense
											lSalesforceRetrieveDataPersonalAccidentDailyCash=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDailyCash
											lSalesforceRetrieveDataAdditionalCoverageMotorcycle=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMotorcycle
											lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
											lSalesforceRetrieveDataAdditionalCoverageExtremeSport=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageExtremeSport
											lSalesforceRetrieveDataOpportunityNumber=lMapAutomationDataAfter.SalesforceRetrieveDataOpportunityNumber
											lSalesforceRetrieveDataPremiumYearly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumYearly
											lSalesforceRetrieveDataPremiumDeposit=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumDeposit
											lSalesforceRetrieveDataPremiumMonthly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumMonthly
											lSalesforceRetrieveDataPremiumInstalment=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumInstalment
											lSalesforceRetrieveDataPremiumNoDepositAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositAmount
											lSalesforceRetrieveDataPremiumNoDepositTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositTotal
											lSalesforceRetrieveDataPremiumQuarterlyAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyAmount
											lSalesforceRetrieveDataPremiumQuarterlyTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyTotal
										}
										caseOutput.SalesforceRetrieveDataLanguage=lSalesforceRetrieveDataLanguage
										caseOutput.SalesforceRetrieveDataPersonalAccidentDeath=lSalesforceRetrieveDataPersonalAccidentDeath
										caseOutput.SalesforceRetrieveDataPersonalAccidentLoss=lSalesforceRetrieveDataPersonalAccidentLoss
										caseOutput.SalesforceRetrieveDataPersonalAccidentMedicalExpense=lSalesforceRetrieveDataPersonalAccidentMedicalExpense
										caseOutput.SalesforceRetrieveDataPersonalAccidentDailyCash=lSalesforceRetrieveDataPersonalAccidentDailyCash
										caseOutput.SalesforceRetrieveDataAdditionalCoverageMotorcycle=lSalesforceRetrieveDataAdditionalCoverageMotorcycle
										caseOutput.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
										caseOutput.SalesforceRetrieveDataAdditionalCoverageExtremeSport=lSalesforceRetrieveDataAdditionalCoverageExtremeSport
										caseOutput.SalesforceRetrieveDataOpportunityNumber=lSalesforceRetrieveDataOpportunityNumber
										caseOutput.SalesforceRetrieveDataPremiumYearly=lSalesforceRetrieveDataPremiumYearly
										caseOutput.SalesforceRetrieveDataPremiumDeposit=lSalesforceRetrieveDataPremiumDeposit
										caseOutput.SalesforceRetrieveDataPremiumMonthly=lSalesforceRetrieveDataPremiumMonthly
										caseOutput.SalesforceRetrieveDataPremiumInstalment=lSalesforceRetrieveDataPremiumInstalment
										caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount=lSalesforceRetrieveDataPremiumNoDepositAmount
										caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal=lSalesforceRetrieveDataPremiumNoDepositTotal
										caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount=lSalesforceRetrieveDataPremiumQuarterlyAmount
										caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal=lSalesforceRetrieveDataPremiumQuarterlyTotal
										if(!lMapAutomationDataAfter.Result){
											return lreturn
										}
										Map lMapSalesforceProceedVerifyAfter=this.inputSalesforceProceedVerifyAfter(caseOutput)
										lIsActualResult=lMapSalesforceProceedVerifyAfter.Result
										lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
										caseOutput.ActualResult=lActualResult
										if(!lMapSalesforceProceedVerifyAfter.Result){
											return lreturn
										}
									}
								}
							}
						}
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
				Map lMapPersonalAccidentDeath=this.inputPersonalAccidentDeath(lPersonalAccidentDeath)
				if(!lMapPersonalAccidentDeath.Result){
					lPersonalAccidentDeath=''
				}else{
					lPersonalAccidentDeath=lMapPersonalAccidentDeath.PersonalAccidentDeath
				}
				caseOutput.PersonalAccidentDeath=lPersonalAccidentDeath
				if(lPersonalAccidentDeath.length()<=0){
					return lreturn
				}
				Map lMapPersonalAccidentLoss=this.inputPersonalAccidentLoss(lPersonalAccidentLoss)
				if(!lMapPersonalAccidentLoss.Result){
					lPersonalAccidentLoss=''
				}else{
					lPersonalAccidentLoss=lMapPersonalAccidentLoss.PersonalAccidentLoss
				}
				caseOutput.PersonalAccidentLoss=lPersonalAccidentLoss
				if(lPersonalAccidentLoss.length()<=0){
					return lreturn
				}
				Map lMapPersonalAccidentMedicalExpense=this.inputPersonalAccidentMedicalExpense(lPersonalAccidentMedicalExpense)
				if(!lMapPersonalAccidentMedicalExpense.Result){
					lPersonalAccidentMedicalExpense=''
				}else{
					lPersonalAccidentMedicalExpense=lMapPersonalAccidentMedicalExpense.PersonalAccidentMedicalExpense
				}
				caseOutput.PersonalAccidentMedicalExpense=lPersonalAccidentMedicalExpense
				if(lPersonalAccidentMedicalExpense.length()<=0){
					return lreturn
				}
				Map lMapPersonalAccidentDailyCash=this.inputPersonalAccidentDailyCash(lPersonalAccidentDailyCash)
				if(!lMapPersonalAccidentDailyCash.Result){
					lPersonalAccidentDailyCash=''
				}else{
					lPersonalAccidentDailyCash=lMapPersonalAccidentDailyCash.PersonalAccidentDailyCash
				}
				caseOutput.PersonalAccidentDailyCash=lPersonalAccidentDailyCash
				if(lPersonalAccidentDailyCash.length()<=0){
					return lreturn
				}
				Map lMapAdditionalCoverageMotorcycle=this.inputAdditionalCoverageMotorcycle(lAdditionalCoverageMotorcycle)
				if(!lMapAdditionalCoverageMotorcycle.Result){
					lAdditionalCoverageMotorcycle=''
				}else{
					lAdditionalCoverageMotorcycle=lMapAdditionalCoverageMotorcycle.AdditionalCoverageMotorcycle
				}
				caseOutput.AdditionalCoverageMotorcycle=lAdditionalCoverageMotorcycle
				if(lAdditionalCoverageMotorcycle.length()<=0){
					return lreturn
				}
				Map lMapAdditionalCoverageMurderedOrAssaulted=this.inputAdditionalCoverageMurderedOrAssaulted(lAdditionalCoverageMurderedOrAssaulted)
				if(!lMapAdditionalCoverageMurderedOrAssaulted.Result){
					lAdditionalCoverageMurderedOrAssaulted=''
				}else{
					lAdditionalCoverageMurderedOrAssaulted=lMapAdditionalCoverageMurderedOrAssaulted.AdditionalCoverageMurderedOrAssaulted
				}
				caseOutput.AdditionalCoverageMurderedOrAssaulted=lAdditionalCoverageMurderedOrAssaulted
				if(lAdditionalCoverageMurderedOrAssaulted.length()<=0){
					return lreturn
				}
				Map lMapAdditionalCoverageExtremeSport=this.inputAdditionalCoverageExtremeSport(lAdditionalCoverageExtremeSport)
				if(!lMapAdditionalCoverageExtremeSport.Result){
					lAdditionalCoverageExtremeSport=''
				}else{
					lAdditionalCoverageExtremeSport=lMapAdditionalCoverageExtremeSport.AdditionalCoverageExtremeSport
				}
				caseOutput.AdditionalCoverageExtremeSport=lAdditionalCoverageExtremeSport
				if(lAdditionalCoverageExtremeSport.length()<=0){
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
				THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
				Boolean lIsActualResult=false
				Boolean lIsQuoteByNone=lQuoteBy.equalsIgnoreCase('NONE')
				if(!lIsQuoteByNone){
					Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
					if(!lMapSalesforceProceedTodo.Result){
						lSalesforceProceedTodo=''
					}else{
						lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
					}
					caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
					if(lSalesforceProceedTodo.length()<=0){
						return lreturn
					}
					Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
					if(lIsSalesforceProceedTodo){
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
						if(lIsAccountNameAnonymous){
							this.lTHAPersonalAccidentQuotationResultUtil.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
						}
					}
				}
				Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
				if(!lMapAutomationDataBefore.Result){
					lAutomationLanguage=''
					lAutomationPersonalAccidentDeath=''
					lAutomationPersonalAccidentLoss=''
					lAutomationPersonalAccidentMedicalExpense=''
					lAutomationPersonalAccidentDailyCash=''
					lAutomationAdditionalCoverageMotorcycle=''
					lAutomationAdditionalCoverageMurderedOrAssaulted=''
					lAutomationAdditionalCoverageExtremeSport=''
					lAutomationOpportunityNumber=''
					lAutomationPremiumYearly=''
					lAutomationPremiumDeposit=''
					lAutomationPremiumMonthly=''
					lAutomationPremiumInstalment=''
					lAutomationPremiumNoDepositAmount=''
					lAutomationPremiumNoDepositTotal=''
					lAutomationPremiumQuarterlyAmount=''
					lAutomationPremiumQuarterlyTotal=''
				}else{
					lAutomationLanguage=lMapAutomationDataBefore.AutomationLanguage
					lAutomationPersonalAccidentDeath=lMapAutomationDataBefore.AutomationPersonalAccidentDeath
					lAutomationPersonalAccidentLoss=lMapAutomationDataBefore.AutomationPersonalAccidentLoss
					lAutomationPersonalAccidentMedicalExpense=lMapAutomationDataBefore.AutomationPersonalAccidentMedicalExpense
					lAutomationPersonalAccidentDailyCash=lMapAutomationDataBefore.AutomationPersonalAccidentDailyCash
					lAutomationAdditionalCoverageMotorcycle=lMapAutomationDataBefore.AutomationAdditionalCoverageMotorcycle
					lAutomationAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataBefore.AutomationAdditionalCoverageMurderedOrAssaulted
					lAutomationAdditionalCoverageExtremeSport=lMapAutomationDataBefore.AutomationAdditionalCoverageExtremeSport
					lAutomationOpportunityNumber=lMapAutomationDataBefore.AutomationOpportunityNumber
					lAutomationPremiumYearly=lMapAutomationDataBefore.AutomationPremiumYearly
					lAutomationPremiumDeposit=lMapAutomationDataBefore.AutomationPremiumDeposit
					lAutomationPremiumMonthly=lMapAutomationDataBefore.AutomationPremiumMonthly
					lAutomationPremiumInstalment=lMapAutomationDataBefore.AutomationPremiumInstalment
					lAutomationPremiumNoDepositAmount=lMapAutomationDataBefore.AutomationPremiumNoDepositAmount
					lAutomationPremiumNoDepositTotal=lMapAutomationDataBefore.AutomationPremiumNoDepositTotal
					lAutomationPremiumQuarterlyAmount=lMapAutomationDataBefore.AutomationPremiumQuarterlyAmount
					lAutomationPremiumQuarterlyTotal=lMapAutomationDataBefore.AutomationPremiumQuarterlyTotal
				}
				caseOutput.AutomationLanguage=lAutomationLanguage
				caseOutput.AutomationPersonalAccidentDeath=lAutomationPersonalAccidentDeath
				caseOutput.AutomationPersonalAccidentLoss=lAutomationPersonalAccidentLoss
				caseOutput.AutomationPersonalAccidentMedicalExpense=lAutomationPersonalAccidentMedicalExpense
				caseOutput.AutomationPersonalAccidentDailyCash=lAutomationPersonalAccidentDailyCash
				caseOutput.AutomationAdditionalCoverageMotorcycle=lAutomationAdditionalCoverageMotorcycle
				caseOutput.AutomationAdditionalCoverageMurderedOrAssaulted=lAutomationAdditionalCoverageMurderedOrAssaulted
				caseOutput.AutomationAdditionalCoverageExtremeSport=lAutomationAdditionalCoverageExtremeSport
				caseOutput.AutomationOpportunityNumber=lAutomationOpportunityNumber
				caseOutput.AutomationPremiumYearly=lAutomationPremiumYearly
				caseOutput.AutomationPremiumDeposit=lAutomationPremiumDeposit
				caseOutput.AutomationPremiumMonthly=lAutomationPremiumMonthly
				caseOutput.AutomationPremiumInstalment=lAutomationPremiumInstalment
				caseOutput.AutomationPremiumNoDepositAmount=lAutomationPremiumNoDepositAmount
				caseOutput.AutomationPremiumNoDepositTotal=lAutomationPremiumNoDepositTotal
				caseOutput.AutomationPremiumQuarterlyAmount=lAutomationPremiumQuarterlyAmount
				caseOutput.AutomationPremiumQuarterlyTotal=lAutomationPremiumQuarterlyTotal
				if(!lMapAutomationDataBefore.Result){
					return lreturn
				}
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
				THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
				lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				if(lIsActualResult){
					Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
					if(!lMapSalesforceProceedTodo.Result){
						lSalesforceProceedTodo=''
					}else{
						lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
					}
					caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
					if(lSalesforceProceedTodo.length()<=0){
						return lreturn
					}
					Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
					if(lIsSalesforceProceedTodo){
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
						THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
						lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
					}
					if(lIsActualResult){
						Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput,lIsQuoteByNone)
						lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(!lMapSalesforceProceedVerifyBefore.Result){
							return lreturn
						}
					}
					if(lIsActualResult){
						Map lMapSalesforceProceedRetrieveTodo=this.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,caseOutput.SalesforceVerifyDataOpportunityObjAccountid)
						if(!lMapSalesforceProceedRetrieveTodo.Result){
							lSalesforceProceedRetrieveTodo=''
						}else{
							lSalesforceProceedRetrieveTodo=lMapSalesforceProceedRetrieveTodo.SalesforceProceedRetrieveTodo
						}
						caseOutput.SalesforceProceedRetrieveTodo=lSalesforceProceedRetrieveTodo
						if(lSalesforceProceedRetrieveTodo.length()<=0){
							return lreturn
						}
						Boolean lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
						if(lIsSalesforceProceedRetrieveTodo){
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
							lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
							lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
							caseOutput.ActualResult=lActualResult
							if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
								return lreturn
							}
							if(lIsActualResult){
								Map lMapAutomationDataAfter=this.inputAutomationDataAfter()
								if(!lMapAutomationDataAfter.Result){
									lSalesforceRetrieveDataLanguage=''
									lSalesforceRetrieveDataPersonalAccidentDeath=''
									lSalesforceRetrieveDataPersonalAccidentLoss=''
									lSalesforceRetrieveDataPersonalAccidentMedicalExpense=''
									lSalesforceRetrieveDataPersonalAccidentDailyCash=''
									lSalesforceRetrieveDataAdditionalCoverageMotorcycle=''
									lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=''
									lSalesforceRetrieveDataAdditionalCoverageExtremeSport=''
									lSalesforceRetrieveDataOpportunityNumber=''
									lSalesforceRetrieveDataPremiumYearly=''
									lSalesforceRetrieveDataPremiumDeposit=''
									lSalesforceRetrieveDataPremiumMonthly=''
									lSalesforceRetrieveDataPremiumInstalment=''
									lSalesforceRetrieveDataPremiumNoDepositAmount=''
									lSalesforceRetrieveDataPremiumNoDepositTotal=''
									lSalesforceRetrieveDataPremiumQuarterlyAmount=''
									lSalesforceRetrieveDataPremiumQuarterlyTotal=''
								}else{
									lSalesforceRetrieveDataLanguage=lMapAutomationDataAfter.SalesforceRetrieveDataLanguage
									lSalesforceRetrieveDataPersonalAccidentDeath=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDeath
									lSalesforceRetrieveDataPersonalAccidentLoss=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentLoss
									lSalesforceRetrieveDataPersonalAccidentMedicalExpense=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentMedicalExpense
									lSalesforceRetrieveDataPersonalAccidentDailyCash=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDailyCash
									lSalesforceRetrieveDataAdditionalCoverageMotorcycle=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMotorcycle
									lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
									lSalesforceRetrieveDataAdditionalCoverageExtremeSport=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageExtremeSport
									lSalesforceRetrieveDataOpportunityNumber=lMapAutomationDataAfter.SalesforceRetrieveDataOpportunityNumber
									lSalesforceRetrieveDataPremiumYearly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumYearly
									lSalesforceRetrieveDataPremiumDeposit=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumDeposit
									lSalesforceRetrieveDataPremiumMonthly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumMonthly
									lSalesforceRetrieveDataPremiumInstalment=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumInstalment
									lSalesforceRetrieveDataPremiumNoDepositAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositAmount
									lSalesforceRetrieveDataPremiumNoDepositTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositTotal
									lSalesforceRetrieveDataPremiumQuarterlyAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyAmount
									lSalesforceRetrieveDataPremiumQuarterlyTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyTotal
								}
								caseOutput.SalesforceRetrieveDataLanguage=lSalesforceRetrieveDataLanguage
								caseOutput.SalesforceRetrieveDataPersonalAccidentDeath=lSalesforceRetrieveDataPersonalAccidentDeath
								caseOutput.SalesforceRetrieveDataPersonalAccidentLoss=lSalesforceRetrieveDataPersonalAccidentLoss
								caseOutput.SalesforceRetrieveDataPersonalAccidentMedicalExpense=lSalesforceRetrieveDataPersonalAccidentMedicalExpense
								caseOutput.SalesforceRetrieveDataPersonalAccidentDailyCash=lSalesforceRetrieveDataPersonalAccidentDailyCash
								caseOutput.SalesforceRetrieveDataAdditionalCoverageMotorcycle=lSalesforceRetrieveDataAdditionalCoverageMotorcycle
								caseOutput.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
								caseOutput.SalesforceRetrieveDataAdditionalCoverageExtremeSport=lSalesforceRetrieveDataAdditionalCoverageExtremeSport
								caseOutput.SalesforceRetrieveDataOpportunityNumber=lSalesforceRetrieveDataOpportunityNumber
								caseOutput.SalesforceRetrieveDataPremiumYearly=lSalesforceRetrieveDataPremiumYearly
								caseOutput.SalesforceRetrieveDataPremiumDeposit=lSalesforceRetrieveDataPremiumDeposit
								caseOutput.SalesforceRetrieveDataPremiumMonthly=lSalesforceRetrieveDataPremiumMonthly
								caseOutput.SalesforceRetrieveDataPremiumInstalment=lSalesforceRetrieveDataPremiumInstalment
								caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount=lSalesforceRetrieveDataPremiumNoDepositAmount
								caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal=lSalesforceRetrieveDataPremiumNoDepositTotal
								caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount=lSalesforceRetrieveDataPremiumQuarterlyAmount
								caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal=lSalesforceRetrieveDataPremiumQuarterlyTotal
								if(!lMapAutomationDataAfter.Result){
									return lreturn
								}
								Map lMapSalesforceProceedVerifyAfter=this.inputSalesforceProceedVerifyAfter(caseOutput)
								lIsActualResult=lMapSalesforceProceedVerifyAfter.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								if(!lMapSalesforceProceedVerifyAfter.Result){
									return lreturn
								}
							}
						}
					}
				}
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
			lPositiveCase=THARGPAPersonalAccidentQuotationResultType.DEFAULT_POSITIVE_CASE
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
	public Map inputPostPrePackage(){
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
			Map lMapPostPrePackage=this.lTHAPersonalAccidentQuotationResultUtil.inputPostPrePackage()
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
			lResult=lMapPostPrePackage.Result
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
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAPersonalAccidentQuotationResultUtil.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
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
	public Map inputPersonalAccidentDeath(String strPersonalAccidentDeath){
		Map lreturn=[:]
		String lPersonalAccidentDeath=strPersonalAccidentDeath.trim()
		if(lPersonalAccidentDeath.length()<=0){
			lPersonalAccidentDeath=THARGPAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDeath','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentDeath=this.lTHAPersonalAccidentQuotationResultUtil.inputPersonalAccidentDeath(lPersonalAccidentDeath)
			if(!lMapPersonalAccidentDeath.Result){
				lPersonalAccidentDeath=''
			}else{
				lPersonalAccidentDeath=lMapPersonalAccidentDeath.PersonalAccidentDeath
			}
			lResult=lPersonalAccidentDeath.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentDeath',lPersonalAccidentDeath)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentLoss(String strPersonalAccidentLoss){
		Map lreturn=[:]
		String lPersonalAccidentLoss=strPersonalAccidentLoss.trim()
		if(lPersonalAccidentLoss.length()<=0){
			lPersonalAccidentLoss=THARGPAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_LOSS
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentLoss','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentLoss=this.lTHAPersonalAccidentQuotationResultUtil.inputPersonalAccidentLoss(lPersonalAccidentLoss)
			if(!lMapPersonalAccidentLoss.Result){
				lPersonalAccidentLoss=''
			}else{
				lPersonalAccidentLoss=lMapPersonalAccidentLoss.PersonalAccidentLoss
			}
			lResult=lPersonalAccidentLoss.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentLoss',lPersonalAccidentLoss)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMedicalExpense(String strPersonalAccidentMedicalExpense){
		Map lreturn=[:]
		String lPersonalAccidentMedicalExpense=strPersonalAccidentMedicalExpense.trim()
		if(lPersonalAccidentMedicalExpense.length()<=0){
			lPersonalAccidentMedicalExpense=THARGPAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMedicalExpense','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentMedicalExpense=this.lTHAPersonalAccidentQuotationResultUtil.inputPersonalAccidentMedicalExpense(lPersonalAccidentMedicalExpense)
			if(!lMapPersonalAccidentMedicalExpense.Result){
				lPersonalAccidentMedicalExpense=''
			}else{
				lPersonalAccidentMedicalExpense=lMapPersonalAccidentMedicalExpense.PersonalAccidentMedicalExpense
			}
			lResult=lPersonalAccidentMedicalExpense.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMedicalExpense',lPersonalAccidentMedicalExpense)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentDailyCash(String strPersonalAccidentDailyCash){
		Map lreturn=[:]
		String lPersonalAccidentDailyCash=strPersonalAccidentDailyCash.trim()
		if(lPersonalAccidentDailyCash.length()<=0){
			lPersonalAccidentDailyCash=THARGPAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDailyCash','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentDailyCash=this.lTHAPersonalAccidentQuotationResultUtil.inputPersonalAccidentDailyCash(lPersonalAccidentDailyCash)
			if(!lMapPersonalAccidentDailyCash.Result){
				lPersonalAccidentDailyCash=''
			}else{
				lPersonalAccidentDailyCash=lMapPersonalAccidentDailyCash.PersonalAccidentDailyCash
			}
			lResult=lPersonalAccidentDailyCash.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentDailyCash',lPersonalAccidentDailyCash)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionalCoverageMotorcycle(String strAdditionalCoverageMotorcycle){
		Map lreturn=[:]
		String lAdditionalCoverageMotorcycle=strAdditionalCoverageMotorcycle.trim()
		if(lAdditionalCoverageMotorcycle.length()<=0){
			lAdditionalCoverageMotorcycle=THARGPAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_MOTORCYCLE
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMotorcycle','')
			lreturn.put('Result',lResult)
			Map lMapAdditionalCoverageMotorcycle=this.lTHAPersonalAccidentQuotationResultUtil.inputAdditionalCoverageMotorcycle(lAdditionalCoverageMotorcycle)
			if(!lMapAdditionalCoverageMotorcycle.Result){
				lAdditionalCoverageMotorcycle=''
			}else{
				lAdditionalCoverageMotorcycle=lMapAdditionalCoverageMotorcycle.AdditionalCoverageMotorcycle
			}
			lResult=lAdditionalCoverageMotorcycle.length()>0
			if(lResult){
				lreturn.put('AdditionalCoverageMotorcycle',lAdditionalCoverageMotorcycle)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionalCoverageMurderedOrAssaulted(String strAdditionalCoverageMurderedOrAssaulted){
		Map lreturn=[:]
		String lAdditionalCoverageMurderedOrAssaulted=strAdditionalCoverageMurderedOrAssaulted.trim()
		if(lAdditionalCoverageMurderedOrAssaulted.length()<=0){
			lAdditionalCoverageMurderedOrAssaulted=THARGPAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_MURDERED_OR_ASSAULTED
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMurderedOrAssaulted','')
			lreturn.put('Result',lResult)
			Map lMapAdditionalCoverageMurderedOrAssaulted=this.lTHAPersonalAccidentQuotationResultUtil.inputAdditionalCoverageMurderedOrAssaulted(lAdditionalCoverageMurderedOrAssaulted)
			if(!lMapAdditionalCoverageMurderedOrAssaulted.Result){
				lAdditionalCoverageMurderedOrAssaulted=''
			}else{
				lAdditionalCoverageMurderedOrAssaulted=lMapAdditionalCoverageMurderedOrAssaulted.AdditionalCoverageMurderedOrAssaulted
			}
			lResult=lAdditionalCoverageMurderedOrAssaulted.length()>0
			if(lResult){
				lreturn.put('AdditionalCoverageMurderedOrAssaulted',lAdditionalCoverageMurderedOrAssaulted)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionalCoverageExtremeSport(String strAdditionalCoverageExtremeSport){
		Map lreturn=[:]
		String lAdditionalCoverageExtremeSport=strAdditionalCoverageExtremeSport.trim()
		if(lAdditionalCoverageExtremeSport.length()<=0){
			lAdditionalCoverageExtremeSport=THARGPAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_EXTREME_SPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageExtremeSport','')
			lreturn.put('Result',lResult)
			Map lMapAdditionalCoverageExtremeSport=this.lTHAPersonalAccidentQuotationResultUtil.inputAdditionalCoverageExtremeSport(lAdditionalCoverageExtremeSport)
			if(!lMapAdditionalCoverageExtremeSport.Result){
				lAdditionalCoverageExtremeSport=''
			}else{
				lAdditionalCoverageExtremeSport=lMapAdditionalCoverageExtremeSport.AdditionalCoverageExtremeSport
			}
			lResult=lAdditionalCoverageExtremeSport.length()>0
			if(lResult){
				lreturn.put('AdditionalCoverageExtremeSport',lAdditionalCoverageExtremeSport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMe(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THARGPAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THARGPAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THARGPAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THARGPAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THARGPAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THARGPAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
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
			Map lMapQuoteMe=this.lTHAPersonalAccidentQuotationResultUtil.inputQuoteMe(lQuoteBy,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
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
			lResult=lMapQuoteMe.Result
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THARGPAPersonalAccidentQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHAPersonalAccidentQuotationResultUtil.inputSalesforceProceedTodo(lSalesforceProceedTodo)
			if(!lMapSalesforceProceedTodo.Result){
				lSalesforceProceedTodo=''
			}else{
				lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
			}
			lResult=lSalesforceProceedTodo.length()>0
			if(lResult){
				lreturn.put('SalesforceProceedTodo',lSalesforceProceedTodo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAutomationDataBefore(){
		Map lreturn=[:]
		String lAutomationLanguage=''
		String lAutomationPersonalAccidentDeath=''
		String lAutomationPersonalAccidentLoss=''
		String lAutomationPersonalAccidentMedicalExpense=''
		String lAutomationPersonalAccidentDailyCash=''
		String lAutomationAdditionalCoverageMotorcycle=''
		String lAutomationAdditionalCoverageMurderedOrAssaulted=''
		String lAutomationAdditionalCoverageExtremeSport=''
		String lAutomationOpportunityNumber=''
		String lAutomationPremiumYearly=''
		String lAutomationPremiumDeposit=''
		String lAutomationPremiumMonthly=''
		String lAutomationPremiumInstalment=''
		String lAutomationPremiumNoDepositAmount=''
		String lAutomationPremiumNoDepositTotal=''
		String lAutomationPremiumQuarterlyAmount=''
		String lAutomationPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('AutomationLanguage','')
			lreturn.put('AutomationPersonalAccidentDeath','')
			lreturn.put('AutomationPersonalAccidentLoss','')
			lreturn.put('AutomationPersonalAccidentMedicalExpense','')
			lreturn.put('AutomationPersonalAccidentDailyCash','')
			lreturn.put('AutomationAdditionalCoverageMotorcycle','')
			lreturn.put('AutomationAdditionalCoverageMurderedOrAssaulted','')
			lreturn.put('AutomationAdditionalCoverageExtremeSport','')
			lreturn.put('AutomationOpportunityNumber','')
			lreturn.put('AutomationPremiumYearly','')
			lreturn.put('AutomationPremiumDeposit','')
			lreturn.put('AutomationPremiumMonthly','')
			lreturn.put('AutomationPremiumInstalment','')
			lreturn.put('AutomationPremiumNoDepositAmount','')
			lreturn.put('AutomationPremiumNoDepositTotal','')
			lreturn.put('AutomationPremiumQuarterlyAmount','')
			lreturn.put('AutomationPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Map lMapAutomationDataBefore=this.lTHAPersonalAccidentQuotationResultUtil.inputAutomationDataBefore()
			if(!lMapAutomationDataBefore.Result){
				lAutomationLanguage=''
				lAutomationPersonalAccidentDeath=''
				lAutomationPersonalAccidentLoss=''
				lAutomationPersonalAccidentMedicalExpense=''
				lAutomationPersonalAccidentDailyCash=''
				lAutomationAdditionalCoverageMotorcycle=''
				lAutomationAdditionalCoverageMurderedOrAssaulted=''
				lAutomationAdditionalCoverageExtremeSport=''
				lAutomationOpportunityNumber=''
				lAutomationPremiumYearly=''
				lAutomationPremiumDeposit=''
				lAutomationPremiumMonthly=''
				lAutomationPremiumInstalment=''
				lAutomationPremiumNoDepositAmount=''
				lAutomationPremiumNoDepositTotal=''
				lAutomationPremiumQuarterlyAmount=''
				lAutomationPremiumQuarterlyTotal=''
			}else{
				lAutomationLanguage=lMapAutomationDataBefore.AutomationLanguage
				lAutomationPersonalAccidentDeath=lMapAutomationDataBefore.AutomationPersonalAccidentDeath
				lAutomationPersonalAccidentLoss=lMapAutomationDataBefore.AutomationPersonalAccidentLoss
				lAutomationPersonalAccidentMedicalExpense=lMapAutomationDataBefore.AutomationPersonalAccidentMedicalExpense
				lAutomationPersonalAccidentDailyCash=lMapAutomationDataBefore.AutomationPersonalAccidentDailyCash
				lAutomationAdditionalCoverageMotorcycle=lMapAutomationDataBefore.AutomationAdditionalCoverageMotorcycle
				lAutomationAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataBefore.AutomationAdditionalCoverageMurderedOrAssaulted
				lAutomationAdditionalCoverageExtremeSport=lMapAutomationDataBefore.AutomationAdditionalCoverageExtremeSport
				lAutomationOpportunityNumber=lMapAutomationDataBefore.AutomationOpportunityNumber
				lAutomationPremiumYearly=lMapAutomationDataBefore.AutomationPremiumYearly
				lAutomationPremiumDeposit=lMapAutomationDataBefore.AutomationPremiumDeposit
				lAutomationPremiumMonthly=lMapAutomationDataBefore.AutomationPremiumMonthly
				lAutomationPremiumInstalment=lMapAutomationDataBefore.AutomationPremiumInstalment
				lAutomationPremiumNoDepositAmount=lMapAutomationDataBefore.AutomationPremiumNoDepositAmount
				lAutomationPremiumNoDepositTotal=lMapAutomationDataBefore.AutomationPremiumNoDepositTotal
				lAutomationPremiumQuarterlyAmount=lMapAutomationDataBefore.AutomationPremiumQuarterlyAmount
				lAutomationPremiumQuarterlyTotal=lMapAutomationDataBefore.AutomationPremiumQuarterlyTotal
			}
			lResult=lAutomationOpportunityNumber.length()>0
			if(lResult){
				lreturn.put('AutomationLanguage',lAutomationLanguage)
				lreturn.put('AutomationPersonalAccidentDeath',lAutomationPersonalAccidentDeath)
				lreturn.put('AutomationPersonalAccidentLoss',lAutomationPersonalAccidentLoss)
				lreturn.put('AutomationPersonalAccidentMedicalExpense',lAutomationPersonalAccidentMedicalExpense)
				lreturn.put('AutomationPersonalAccidentDailyCash',lAutomationPersonalAccidentDailyCash)
				lreturn.put('AutomationAdditionalCoverageMotorcycle',lAutomationAdditionalCoverageMotorcycle)
				lreturn.put('AutomationAdditionalCoverageMurderedOrAssaulted',lAutomationAdditionalCoverageMurderedOrAssaulted)
				lreturn.put('AutomationAdditionalCoverageExtremeSport',lAutomationAdditionalCoverageExtremeSport)
				lreturn.put('AutomationOpportunityNumber',lAutomationOpportunityNumber)
				lreturn.put('AutomationPremiumYearly',lAutomationPremiumYearly)
				lreturn.put('AutomationPremiumDeposit',lAutomationPremiumDeposit)
				lreturn.put('AutomationPremiumMonthly',lAutomationPremiumMonthly)
				lreturn.put('AutomationPremiumInstalment',lAutomationPremiumInstalment)
				lreturn.put('AutomationPremiumNoDepositAmount',lAutomationPremiumNoDepositAmount)
				lreturn.put('AutomationPremiumNoDepositTotal',lAutomationPremiumNoDepositTotal)
				lreturn.put('AutomationPremiumQuarterlyAmount',lAutomationPremiumQuarterlyAmount)
				lreturn.put('AutomationPremiumQuarterlyTotal',lAutomationPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAutomationDataAfter(){
		Map lreturn=[:]
		String lSalesforceRetrieveDataLanguage=''
		String lSalesforceRetrieveDataPersonalAccidentDeath=''
		String lSalesforceRetrieveDataPersonalAccidentLoss=''
		String lSalesforceRetrieveDataPersonalAccidentMedicalExpense=''
		String lSalesforceRetrieveDataPersonalAccidentDailyCash=''
		String lSalesforceRetrieveDataAdditionalCoverageMotorcycle=''
		String lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=''
		String lSalesforceRetrieveDataAdditionalCoverageExtremeSport=''
		String lSalesforceRetrieveDataOpportunityNumber=''
		String lSalesforceRetrieveDataPremiumYearly=''
		String lSalesforceRetrieveDataPremiumDeposit=''
		String lSalesforceRetrieveDataPremiumMonthly=''
		String lSalesforceRetrieveDataPremiumInstalment=''
		String lSalesforceRetrieveDataPremiumNoDepositAmount=''
		String lSalesforceRetrieveDataPremiumNoDepositTotal=''
		String lSalesforceRetrieveDataPremiumQuarterlyAmount=''
		String lSalesforceRetrieveDataPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('SalesforceRetrieveDataLanguage','')
			lreturn.put('SalesforceRetrieveDataPersonalAccidentDeath','')
			lreturn.put('SalesforceRetrieveDataPersonalAccidentLoss','')
			lreturn.put('SalesforceRetrieveDataPersonalAccidentMedicalExpense','')
			lreturn.put('SalesforceRetrieveDataPersonalAccidentDailyCash','')
			lreturn.put('SalesforceRetrieveDataAdditionalCoverageMotorcycle','')
			lreturn.put('SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted','')
			lreturn.put('SalesforceRetrieveDataAdditionalCoverageExtremeSport','')
			lreturn.put('SalesforceRetrieveDataOpportunityNumber','')
			lreturn.put('SalesforceRetrieveDataPremiumYearly','')
			lreturn.put('SalesforceRetrieveDataPremiumDeposit','')
			lreturn.put('SalesforceRetrieveDataPremiumMonthly','')
			lreturn.put('SalesforceRetrieveDataPremiumInstalment','')
			lreturn.put('SalesforceRetrieveDataPremiumNoDepositAmount','')
			lreturn.put('SalesforceRetrieveDataPremiumNoDepositTotal','')
			lreturn.put('SalesforceRetrieveDataPremiumQuarterlyAmount','')
			lreturn.put('SalesforceRetrieveDataPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Map lMapAutomationDataAfter=this.lTHAPersonalAccidentQuotationResultUtil.inputAutomationDataAfter()
			if(!lMapAutomationDataAfter.Result){
				lSalesforceRetrieveDataLanguage=''
				lSalesforceRetrieveDataPersonalAccidentDeath=''
				lSalesforceRetrieveDataPersonalAccidentLoss=''
				lSalesforceRetrieveDataPersonalAccidentMedicalExpense=''
				lSalesforceRetrieveDataPersonalAccidentDailyCash=''
				lSalesforceRetrieveDataAdditionalCoverageMotorcycle=''
				lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=''
				lSalesforceRetrieveDataAdditionalCoverageExtremeSport=''
				lSalesforceRetrieveDataOpportunityNumber=''
				lSalesforceRetrieveDataPremiumYearly=''
				lSalesforceRetrieveDataPremiumDeposit=''
				lSalesforceRetrieveDataPremiumMonthly=''
				lSalesforceRetrieveDataPremiumInstalment=''
				lSalesforceRetrieveDataPremiumNoDepositAmount=''
				lSalesforceRetrieveDataPremiumNoDepositTotal=''
				lSalesforceRetrieveDataPremiumQuarterlyAmount=''
				lSalesforceRetrieveDataPremiumQuarterlyTotal=''
			}else{
				lSalesforceRetrieveDataLanguage=lMapAutomationDataAfter.SalesforceRetrieveDataLanguage
				lSalesforceRetrieveDataPersonalAccidentDeath=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDeath
				lSalesforceRetrieveDataPersonalAccidentLoss=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentLoss
				lSalesforceRetrieveDataPersonalAccidentMedicalExpense=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentMedicalExpense
				lSalesforceRetrieveDataPersonalAccidentDailyCash=lMapAutomationDataAfter.SalesforceRetrieveDataPersonalAccidentDailyCash
				lSalesforceRetrieveDataAdditionalCoverageMotorcycle=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMotorcycle
				lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted
				lSalesforceRetrieveDataAdditionalCoverageExtremeSport=lMapAutomationDataAfter.SalesforceRetrieveDataAdditionalCoverageExtremeSport
				lSalesforceRetrieveDataOpportunityNumber=lMapAutomationDataAfter.SalesforceRetrieveDataOpportunityNumber
				lSalesforceRetrieveDataPremiumYearly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumYearly
				lSalesforceRetrieveDataPremiumDeposit=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumDeposit
				lSalesforceRetrieveDataPremiumMonthly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumMonthly
				lSalesforceRetrieveDataPremiumInstalment=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumInstalment
				lSalesforceRetrieveDataPremiumNoDepositAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositAmount
				lSalesforceRetrieveDataPremiumNoDepositTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositTotal
				lSalesforceRetrieveDataPremiumQuarterlyAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyAmount
				lSalesforceRetrieveDataPremiumQuarterlyTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyTotal
			}
			lResult=lSalesforceRetrieveDataOpportunityNumber.length()>0
			if(lResult){
				lreturn.put('SalesforceRetrieveDataLanguage',lSalesforceRetrieveDataLanguage)
				lreturn.put('SalesforceRetrieveDataPersonalAccidentDeath',lSalesforceRetrieveDataPersonalAccidentDeath)
				lreturn.put('SalesforceRetrieveDataPersonalAccidentLoss',lSalesforceRetrieveDataPersonalAccidentLoss)
				lreturn.put('SalesforceRetrieveDataPersonalAccidentMedicalExpense',lSalesforceRetrieveDataPersonalAccidentMedicalExpense)
				lreturn.put('SalesforceRetrieveDataPersonalAccidentDailyCash',lSalesforceRetrieveDataPersonalAccidentDailyCash)
				lreturn.put('SalesforceRetrieveDataAdditionalCoverageMotorcycle',lSalesforceRetrieveDataAdditionalCoverageMotorcycle)
				lreturn.put('SalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted',lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted)
				lreturn.put('SalesforceRetrieveDataAdditionalCoverageExtremeSport',lSalesforceRetrieveDataAdditionalCoverageExtremeSport)
				lreturn.put('SalesforceRetrieveDataOpportunityNumber',lSalesforceRetrieveDataOpportunityNumber)
				lreturn.put('SalesforceRetrieveDataPremiumYearly',lSalesforceRetrieveDataPremiumYearly)
				lreturn.put('SalesforceRetrieveDataPremiumDeposit',lSalesforceRetrieveDataPremiumDeposit)
				lreturn.put('SalesforceRetrieveDataPremiumMonthly',lSalesforceRetrieveDataPremiumMonthly)
				lreturn.put('SalesforceRetrieveDataPremiumInstalment',lSalesforceRetrieveDataPremiumInstalment)
				lreturn.put('SalesforceRetrieveDataPremiumNoDepositAmount',lSalesforceRetrieveDataPremiumNoDepositAmount)
				lreturn.put('SalesforceRetrieveDataPremiumNoDepositTotal',lSalesforceRetrieveDataPremiumNoDepositTotal)
				lreturn.put('SalesforceRetrieveDataPremiumQuarterlyAmount',lSalesforceRetrieveDataPremiumQuarterlyAmount)
				lreturn.put('SalesforceRetrieveDataPremiumQuarterlyTotal',lSalesforceRetrieveDataPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput,Boolean isQuoteByNone){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result','')
			Map lMapSalesforceProceedVerifyBefore=this.lTHAPersonalAccidentQuotationResultUtil.inputSalesforceProceedVerifyBefore(caseOutput,isQuoteByNone)
			lResult=lMapSalesforceProceedVerifyBefore.Result
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedVerifyAfter(Map caseOutput){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result','')
			Map lMapSalesforceProceedVerifyAfter=this.lTHAPersonalAccidentQuotationResultUtil.inputSalesforceProceedVerifyAfter(caseOutput)
			lResult=lMapSalesforceProceedVerifyAfter.Result
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedRetrieveTodo(String strSalesforceProceedRetrieveTodo,String strAccountNameAnonymous){
		Map lreturn=[:]
		String lSalesforceProceedRetrieveTodo=strSalesforceProceedRetrieveTodo.trim()
		if(lSalesforceProceedRetrieveTodo.length()<=0){
			lSalesforceProceedRetrieveTodo=THARGPAPersonalAccidentQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lTHAPersonalAccidentQuotationResultUtil.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
			if(!lMapSalesforceProceedRetrieveTodo.Result){
				lSalesforceProceedRetrieveTodo=''
			}else{
				lSalesforceProceedRetrieveTodo=lMapSalesforceProceedRetrieveTodo.SalesforceProceedRetrieveTodo
			}
			lResult=lSalesforceProceedRetrieveTodo.length()>0
			if(lResult){
				lreturn.put('SalesforceProceedRetrieveTodo',lSalesforceProceedRetrieveTodo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedRetrieveWebFromUrl(String strRetrievePageURL){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lTHAPersonalAccidentQuotationResultUtil.inputSalesforceProceedRetrieveWebFromUrl(strRetrievePageURL)
			lResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
			if(lResult){
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
			Map lMapActualResult=this.lTHAPersonalAccidentQuotationResultUtil.inputActualResult(isPositiveCase,isQuoteByNone)
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
			lResult=lMapActualResult.Result
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
}