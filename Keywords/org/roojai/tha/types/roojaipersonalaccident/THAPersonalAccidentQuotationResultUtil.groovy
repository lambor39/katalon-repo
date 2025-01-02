package org.roojai.tha.types.roojaipersonalaccident
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THAPersonalAccidentQuotationResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAPersonalAccidentQuotationResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean waitUntilOpportunityNumberUpdated(){
		Boolean lreturn=false
		try{
			String lOpportunityNumber=''
			String lOpportunityNumberNew=''
			String lOpportunityNumberOld=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.trim()
			String lTagOpportunityNumberNew='qotation-no'
			String lLocatorOpportunityNumberNew=IGNUemaHelper.getTagDataSeleniumKey(lTagOpportunityNumberNew)
			for(Integer lIndex=1;lIndex<=10;lIndex++){
				WebElement lElementOpportunityNumberNew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberNew)
				if(lElementOpportunityNumberNew){
					lElementOpportunityNumberNew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberNew)
					lOpportunityNumberNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOpportunityNumberNew).trim()
					if(lOpportunityNumberNew.length()>0){
						if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumberNew)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}else{
						IGNUemaHelper.delayThreadSecond(lIndex)
					}
				}else{
					IGNUemaHelper.delayThreadSecond(lIndex)
				}
			}
			lOpportunityNumber=lOpportunityNumberNew
			if(lOpportunityNumber.length()>0){
				lreturn=true
				THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean checkAnonymousAccountToGetActualOpportunityNumberByRedirecting(){
		Boolean lreturn=false
		try{
			Boolean lRedirected=false
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
			if(!lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))
				this.waitUntilLoaded()
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
				if(!lRedirected){
					IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))
					this.waitUntilLoaded()
				}
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('top-bar-goBack'))
				this.waitUntilLoaded()
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'pa-packages',30)
				if(!lRedirected){
					WebUI.back()
					this.waitUntilLoaded()
				}
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'pa-packages',30)
				lreturn=lRedirected
			}
			if(!lRedirected){
				return lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String wrapTextToGetAmountValue(String strText,String strTextSpecialString,Integer indexNoGetValue){
		String lreturn=strText
		String lText=strText.trim()
		String lTextSpecialString=strTextSpecialString.trim()
		Integer lIndexNoGetValue=indexNoGetValue
		List<String> lListText=new ArrayList<String>()
		try{
			if(lText.length()<=0){
				return lreturn
			}
			lListText=lText.split(lTextSpecialString)
			if(lListText.size()>0){
				if(lListText.size()-1>=lIndexNoGetValue){
					lText=lListText.get(lIndexNoGetValue).replaceAll('[^0-9.]','').trim()
					if(lText.length()>0){
						lreturn=lText
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
								if(lIsAccountNameAnonymous){
									this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THAPersonalAccidentCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
								lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
								caseOutput.ActualResult=lActualResult
								Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
								if(lIsAccountNameAnonymous){
									this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
						if(lIsAccountNameAnonymous){
							this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
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
			lPositiveCase=THAPersonalAccidentQuotationResultType.DEFAULT_POSITIVE_CASE
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
	public Boolean checkPriceChangeToYearlyPayment(){
		Boolean lreturn=false
		try{
			String lTagcheckPriceChangeToYearlyPayment=''
			String lLocatorcheckPriceChangeToYearlyPayment='#payment-change-to-yearly'
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorcheckPriceChangeToYearlyPayment,30)
			if(!lreturn){
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorcheckPriceChangeToYearlyPayment)){
					String lTagDialogButton='payment-change-close-btn'
					String lLocatorDialogButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDialogButton)
					WebElement lElementDialogButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDialogButton)
					if(!lElementDialogButton){
						lTagDialogButton='payment-change-close'
						lLocatorDialogButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDialogButton)
					}
					lElementDialogButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDialogButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementDialogButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDialogButton)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorcheckPriceChangeToYearlyPayment,30)
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
	public Boolean checkPaymentOptionPersonalAccidentSwitch(){
		Boolean lreturn=false
		try{
			String lTagPaymentOptionPersonalAccidentSwitchButton='paymentOption'
			String lLocatorPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionPersonalAccidentSwitchButton)
			WebElement lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(lElementPaymentOptionPersonalAccidentSwitchButton){
				Boolean lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
				Boolean lIsPaymentOptionPersonalAccidentSwitchButtonAsMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('NO DEPOSIT')
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
					if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsMonthly){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
						lreturn=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					}
				}
				lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
				Boolean lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					lreturn=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
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
			String lTagPaymentOptionPersonalAccidentSwitchButton='paymentOption'
			String lLocatorPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionPersonalAccidentSwitchButton)
			WebElement lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
				lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
				if(!lElementPaymentOptionPersonalAccidentSwitchButton){
					return lreturn
				}
				lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
				lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lPostPrePackagePremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPostPrePackagePremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPostPrePackagePremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
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
			String lTagPaymentOptionPersonalAccidentSwitchButton='paymentOption'
			String lLocatorPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionPersonalAccidentSwitchButton)
			WebElement lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
				lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
				if(!lElementPaymentOptionPersonalAccidentSwitchButton){
					return lreturn
				}
				lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
				lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lPostPrePackagePremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPostPrePackagePremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPostPrePackagePremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
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
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE)
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lLanguage=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				if(lLanguageItem.length()<=0){
					lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguage.length()<=0){
					lLanguage='No Option'
				}
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
	public Map inputLanguageB(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE)
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lLanguage=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				if(lLanguageItem.length()<=0){
					lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationResultType.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguage.length()<=0){
					lLanguage='No Option'
				}
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
			lQuoteBy=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
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
				lQuoteByItem=lQuoteByList.get(THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase())
			}
			lQuoteBy=''
			Integer lQuoteByNum=IGNUemaHelper.convertStringToInteger(lQuoteByItem,this.DEFAULT_NUM_QUOTE_ME)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteByNum){
				case 2:
					lQuoteBy='Call'
					String lTagButtonCallMeBack='roojai-call-back'
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
							String lTagButtonCallMeBackCloseButton='callmeback-close'
							String lLocatorButtonCallMeBackCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackCloseButton)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							lQuoteEmail=''
							lQuoteNewsletter=''
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}else{
							String lTagTextCallMeBackEmail='callmeback-email'
							String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
							lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
							String lTagCheckboxCallMeBackNewsletter='pa-package-userAcceptConsent'
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
					break
				case 3:
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='createPolicy-email'
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
						String lTagCheckboxEmailMeNewsletter='pa-package-userAcceptConsent'
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
						String lTagButtonEmailMeEmailNext='btn-createPolicy-email-next'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='createPolicy-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='btn-createPolicy-mobile-next'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='btn-createpolicy-customize'
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
			this.waitUntilOpportunityNumberUpdated()
			if(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.toUpperCase().contains('PA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
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
			lQuoteBy=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
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
				lQuoteByItem=lQuoteByList.get(THAPersonalAccidentQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase())
			}
			lQuoteBy=''
			Integer lQuoteByNum=IGNUemaHelper.convertStringToInteger(lQuoteByItem,this.DEFAULT_NUM_QUOTE_ME)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteByNum){
				case 2:
					lQuoteBy='Call'
					String lTagButtonCallMeBack='roojai-call-back'
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
							String lTagButtonCallMeBackCloseButton='callmeback-close'
							String lLocatorButtonCallMeBackCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackCloseButton)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							lQuoteEmail=''
							lQuoteNewsletter=''
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}else{
							String lTagTextCallMeBackEmail='callmeback-email'
							String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
							lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
							String lTagCheckboxCallMeBackNewsletter='pa-package-userAcceptConsent'
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
					break
				case 3:
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='createPolicy-email'
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
						String lTagCheckboxEmailMeNewsletter='pa-package-userAcceptConsent'
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
						String lTagButtonEmailMeEmailNext='btn-createPolicy-email-next'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='createPolicy-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='btn-createPolicy-mobile-next'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='btn-createpolicy-customize'
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
			this.waitUntilOpportunityNumberUpdated()
			if(THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.toUpperCase().contains('PA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
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
	public Map inputPersonalAccidentDeath(String strPersonalAccidentDeath){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDeath','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentDeathA(strPersonalAccidentDeath)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentDeathB(strPersonalAccidentDeath)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentDeathA(strPersonalAccidentDeath)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentDeathA(String strPersonalAccidentDeath){
		Map lreturn=[:]
		String lPersonalAccidentDeath=strPersonalAccidentDeath.trim()
		if(lPersonalAccidentDeath.length()<=0){
			lPersonalAccidentDeath=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH
		}
		Map lPersonalAccidentDeathList=['1':'0','2':'1','3':'2','4':'3','5':'4']
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDeath','')
			lreturn.put('Result',lResult)
			String lPersonalAccidentDeathItem=lPersonalAccidentDeathList.get(lPersonalAccidentDeath)
			if(!lPersonalAccidentDeathItem){
				lPersonalAccidentDeathItem=lPersonalAccidentDeathList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH)
			}
			lPersonalAccidentDeath=''
			String lTagPersonalAccidentDeathButton='accidentalDeath'
			String lLocatorPersonalAccidentDeathButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDeathButton)
			WebElement lElementPersonalAccidentDeathButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentDeathButton)
			if(!lElementPersonalAccidentDeathButton){
				lPersonalAccidentDeath='No Option'
			}else{
				String lTagPersonalAccidentDeathButtonKey='accidentalDeath-option'
				String lTagPersonalAccidentDeathButtonValue=lPersonalAccidentDeathItem
				String lLocatorPersonalAccidentDeathButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
				WebElement lElementPersonalAccidentDeathButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
				if(!lElementPersonalAccidentDeathButtonOption){
					lTagPersonalAccidentDeathButtonValue=lPersonalAccidentDeathList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH)
					lLocatorPersonalAccidentDeathButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
					lElementPersonalAccidentDeathButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
					if(!lElementPersonalAccidentDeathButton){
						return lreturn
					}
					if(lElementPersonalAccidentDeathButton){
						lPersonalAccidentDeath=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPersonalAccidentDeathButtonOption).trim()
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDeathButtonOption)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDeathButtonOption)
					}
				}else{
					lPersonalAccidentDeath=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPersonalAccidentDeathButtonOption).trim()
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDeathButtonOption)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDeathButtonOption)
				}
				lPersonalAccidentDeath=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDeathButton).trim()
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputPersonalAccidentDeathB(String strPersonalAccidentDeath){
		Map lreturn=[:]
		String lPersonalAccidentDeath=strPersonalAccidentDeath.trim()
		if(lPersonalAccidentDeath.length()<=0){
			lPersonalAccidentDeath=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH
		}
		Map lPersonalAccidentDeathList=['1':'0','2':'1','3':'2','4':'3','5':'4']
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDeath','')
			lreturn.put('Result',lResult)
			String lPersonalAccidentDeathItem=lPersonalAccidentDeathList.get(lPersonalAccidentDeath)
			if(!lPersonalAccidentDeathItem){
				lPersonalAccidentDeathItem=lPersonalAccidentDeathList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH)
			}
			lPersonalAccidentDeath=''
			String lTagPersonalAccidentDeathButton='accidentalDeath'
			String lLocatorPersonalAccidentDeathButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDeathButton)
			WebElement lElementPersonalAccidentDeathButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentDeathButton)
			if(!lElementPersonalAccidentDeathButton){
				lPersonalAccidentDeath='No Option'
			}else{
				String lTagPersonalAccidentDeathButtonKey='accidentalDeath-option'
				String lTagPersonalAccidentDeathButtonValue=lPersonalAccidentDeathItem
				String lLocatorPersonalAccidentDeathButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
				WebElement lElementPersonalAccidentDeathButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
				if(!lElementPersonalAccidentDeathButtonOption){
					lTagPersonalAccidentDeathButtonValue=lPersonalAccidentDeathList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DEATH)
					lLocatorPersonalAccidentDeathButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
					lElementPersonalAccidentDeathButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDeathButtonKey,lTagPersonalAccidentDeathButtonValue)
					if(!lElementPersonalAccidentDeathButton){
						return lreturn
					}
					if(lElementPersonalAccidentDeathButton){
						lPersonalAccidentDeath=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPersonalAccidentDeathButtonOption).trim()
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDeathButtonOption)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDeathButtonOption)
					}
				}else{
					lPersonalAccidentDeath=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPersonalAccidentDeathButtonOption).trim()
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDeathButtonOption)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDeathButtonOption)
				}
				lPersonalAccidentDeath=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDeathButton).trim()
			}
			this.checkPriceChangeToYearlyPayment()
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
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentLoss','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentLossA(strPersonalAccidentLoss)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentLossB(strPersonalAccidentLoss)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentLossA(strPersonalAccidentLoss)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentLossA(String strPersonalAccidentLoss){
		Map lreturn=[:]
		String lPersonalAccidentLoss=strPersonalAccidentLoss.trim()
		if(lPersonalAccidentLoss.length()<=0){
			lPersonalAccidentLoss=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_LOSS
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentLoss','')
			lreturn.put('Result',lResult)
			Boolean lIsPersonalAccidentLoss=IGNUemaHelper.convertStringToBoolean(lPersonalAccidentLoss)
			String lTagPersonalAccidentLossButton='additionalLossOfOrganOrSight-check'
			String lLocatorPersonalAccidentLossButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentLossButton)
			WebElement lElementPersonalAccidentLossButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentLossButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementPersonalAccidentLossButton){
				lPersonalAccidentLoss='No Option'
			}else{
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentLossButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsPersonalAccidentLoss){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentLossButton)
					}
				}else{
					if(lIsPersonalAccidentLoss){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentLossButton)
					}
				}
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentLossButton)
				lPersonalAccidentLoss=lStageStr
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputPersonalAccidentLossB(String strPersonalAccidentLoss){
		Map lreturn=[:]
		String lPersonalAccidentLoss=strPersonalAccidentLoss.trim()
		if(lPersonalAccidentLoss.length()<=0){
			lPersonalAccidentLoss=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_LOSS
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentLoss','')
			lreturn.put('Result',lResult)
			Boolean lIsPersonalAccidentLoss=IGNUemaHelper.convertStringToBoolean(lPersonalAccidentLoss)
			String lTagPersonalAccidentLossButton='additionalLossOfOrganOrSight-check'
			String lLocatorPersonalAccidentLossButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentLossButton)
			WebElement lElementPersonalAccidentLossButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentLossButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementPersonalAccidentLossButton){
				lPersonalAccidentLoss='No Option'
			}else{
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentLossButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsPersonalAccidentLoss){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentLossButton)
					}
				}else{
					if(lIsPersonalAccidentLoss){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentLossButton)
					}
				}
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentLossButton)
				lPersonalAccidentLoss=lStageStr
			}
			this.checkPriceChangeToYearlyPayment()
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
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMedicalExpense','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentMedicalExpenseA(strPersonalAccidentMedicalExpense)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentMedicalExpenseB(strPersonalAccidentMedicalExpense)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentMedicalExpenseA(strPersonalAccidentMedicalExpense)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMedicalExpenseA(String strPersonalAccidentMedicalExpense){
		Map lreturn=[:]
		String lPersonalAccidentMedicalExpense=strPersonalAccidentMedicalExpense.trim()
		if(lPersonalAccidentMedicalExpense.length()<=0){
			lPersonalAccidentMedicalExpense=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE
		}
		Map lPersonalAccidentMedicalExpenseList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5']
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMedicalExpense','')
			lreturn.put('Result',lResult)
			String lPersonalAccidentMedicalExpenseItem=lPersonalAccidentMedicalExpenseList.get(lPersonalAccidentMedicalExpense)
			if(!lPersonalAccidentMedicalExpenseItem){
				lPersonalAccidentMedicalExpenseItem=lPersonalAccidentMedicalExpenseList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE)
			}
			lPersonalAccidentMedicalExpense=''
			String lTagPersonalAccidentMedicalExpenseButton='additionalMedicalExpenses'
			String lLocatorPersonalAccidentMedicalExpenseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentMedicalExpenseButton)
			WebElement lElementPersonalAccidentMedicalExpenseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentMedicalExpenseButton)
			if(!lElementPersonalAccidentMedicalExpenseButton){
				lPersonalAccidentMedicalExpense='No Option'
			}else{
				String lTagPersonalAccidentMedicalExpenseButtonKey='additionalMedicalExpenses-option'
				String lTagPersonalAccidentMedicalExpenseButtonValue=lPersonalAccidentMedicalExpenseItem
				String lLocatorPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
				WebElement lElementPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
				if(!lElementPersonalAccidentMedicalExpenseButtonOption){
					lTagPersonalAccidentMedicalExpenseButtonValue=lPersonalAccidentMedicalExpenseList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE)
					lLocatorPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
					lElementPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
					if(!lElementPersonalAccidentMedicalExpenseButtonOption){
						return lreturn
					}
					if(lElementPersonalAccidentMedicalExpenseButtonOption){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
					IGNUemaHelper.delayThreadSecond(1)
				}
				lPersonalAccidentMedicalExpense=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentMedicalExpenseButton).trim()
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputPersonalAccidentMedicalExpenseB(String strPersonalAccidentMedicalExpense){
		Map lreturn=[:]
		String lPersonalAccidentMedicalExpense=strPersonalAccidentMedicalExpense.trim()
		if(lPersonalAccidentMedicalExpense.length()<=0){
			lPersonalAccidentMedicalExpense=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE
		}
		Map lPersonalAccidentMedicalExpenseList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5']
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMedicalExpense','')
			lreturn.put('Result',lResult)
			String lPersonalAccidentMedicalExpenseItem=lPersonalAccidentMedicalExpenseList.get(lPersonalAccidentMedicalExpense)
			if(!lPersonalAccidentMedicalExpenseItem){
				lPersonalAccidentMedicalExpenseItem=lPersonalAccidentMedicalExpenseList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE)
			}
			lPersonalAccidentMedicalExpense=''
			String lTagPersonalAccidentMedicalExpenseButton='additionalMedicalExpenses'
			String lLocatorPersonalAccidentMedicalExpenseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentMedicalExpenseButton)
			WebElement lElementPersonalAccidentMedicalExpenseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentMedicalExpenseButton)
			if(!lElementPersonalAccidentMedicalExpenseButton){
				lPersonalAccidentMedicalExpense='No Option'
			}else{
				String lTagPersonalAccidentMedicalExpenseButtonKey='additionalMedicalExpenses-option'
				String lTagPersonalAccidentMedicalExpenseButtonValue=lPersonalAccidentMedicalExpenseItem
				String lLocatorPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
				WebElement lElementPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
				if(!lElementPersonalAccidentMedicalExpenseButtonOption){
					lTagPersonalAccidentMedicalExpenseButtonValue=lPersonalAccidentMedicalExpenseList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_MEDICAL_EXPENSE)
					lLocatorPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
					lElementPersonalAccidentMedicalExpenseButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentMedicalExpenseButtonKey,lTagPersonalAccidentMedicalExpenseButtonValue)
					if(!lElementPersonalAccidentMedicalExpenseButtonOption){
						return lreturn
					}
					if(lElementPersonalAccidentMedicalExpenseButtonOption){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentMedicalExpenseButtonOption)
					IGNUemaHelper.delayThreadSecond(1)
				}
				lPersonalAccidentMedicalExpense=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentMedicalExpenseButton).trim()
			}
			lPersonalAccidentMedicalExpense=lPersonalAccidentMedicalExpense.trim()
			this.checkPriceChangeToYearlyPayment()
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
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDailyCash','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentDailyCashA(strPersonalAccidentDailyCash)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentDailyCashB(strPersonalAccidentDailyCash)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentDailyCashA(strPersonalAccidentDailyCash)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentDailyCashA(String strPersonalAccidentDailyCash){
		Map lreturn=[:]
		String lPersonalAccidentDailyCash=strPersonalAccidentDailyCash.trim()
		if(lPersonalAccidentDailyCash.length()<=0){
			lPersonalAccidentDailyCash=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH
		}
		Map lPersonalAccidentDailyCashList=['1':'0','2':'1','3':'2','4':'3','5':'4']
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDailyCash','')
			lreturn.put('Result',lResult)
			String lPersonalAccidentDailyCashItem=lPersonalAccidentDailyCashList.get(lPersonalAccidentDailyCash)
			if(!lPersonalAccidentDailyCashItem){
				lPersonalAccidentDailyCashItem=lPersonalAccidentDailyCashList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH)
			}
			lPersonalAccidentDailyCash=''
			String lTagPersonalAccidentDailyCashButton='additionalDailyCash'
			String lLocatorPersonalAccidentDailyCashButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDailyCashButton)
			WebElement lElementPersonalAccidentDailyCashButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentDailyCashButton)
			if(!lElementPersonalAccidentDailyCashButton){
				lPersonalAccidentDailyCash='No Option'
			}else{
				String lTagPersonalAccidentDailyCashButtonKey='additionalDailyCash-option'
				String lTagPersonalAccidentDailyCashButtonValue=lPersonalAccidentDailyCashItem
				String lLocatorPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
				WebElement lElementPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
				if(!lElementPersonalAccidentDailyCashButtonOption){
					lTagPersonalAccidentDailyCashButtonValue=lPersonalAccidentDailyCashList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH)
					lLocatorPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
					lElementPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
					if(!lElementPersonalAccidentDailyCashButtonOption){
						return lreturn
					}
					if(lElementPersonalAccidentDailyCashButtonOption){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDailyCashButtonOption)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDailyCashButtonOption)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDailyCashButtonOption)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDailyCashButtonOption)
					IGNUemaHelper.delayThreadSecond(1)
				}
				lPersonalAccidentDailyCash=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDailyCashButton).trim()
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputPersonalAccidentDailyCashB(String strPersonalAccidentDailyCash){
		Map lreturn=[:]
		String lPersonalAccidentDailyCash=strPersonalAccidentDailyCash.trim()
		if(lPersonalAccidentDailyCash.length()<=0){
			lPersonalAccidentDailyCash=THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH
		}
		Map lPersonalAccidentDailyCashList=['1':'0','2':'1','3':'2','4':'3','5':'4']
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentDailyCash','')
			lreturn.put('Result',lResult)
			String lPersonalAccidentDailyCashItem=lPersonalAccidentDailyCashList.get(lPersonalAccidentDailyCash)
			if(!lPersonalAccidentDailyCashItem){
				lPersonalAccidentDailyCashItem=lPersonalAccidentDailyCashList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH)
			}
			lPersonalAccidentDailyCash=''
			String lTagPersonalAccidentDailyCashButton='additionalDailyCash'
			String lLocatorPersonalAccidentDailyCashButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDailyCashButton)
			WebElement lElementPersonalAccidentDailyCashButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPersonalAccidentDailyCashButton)
			if(!lElementPersonalAccidentDailyCashButton){
				lPersonalAccidentDailyCash='No Option'
			}else{
				String lTagPersonalAccidentDailyCashButtonKey='additionalDailyCash-option'
				String lTagPersonalAccidentDailyCashButtonValue=lPersonalAccidentDailyCashItem
				String lLocatorPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
				WebElement lElementPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
				if(!lElementPersonalAccidentDailyCashButtonOption){
					lTagPersonalAccidentDailyCashButtonValue=lPersonalAccidentDailyCashList.get(THAPersonalAccidentQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_DAILY_CASH)
					lLocatorPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
					lElementPersonalAccidentDailyCashButtonOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPersonalAccidentDailyCashButtonKey,lTagPersonalAccidentDailyCashButtonValue)
					if(!lElementPersonalAccidentDailyCashButtonOption){
						return lreturn
					}
					if(lElementPersonalAccidentDailyCashButtonOption){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDailyCashButtonOption)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDailyCashButtonOption)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPersonalAccidentDailyCashButtonOption)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPersonalAccidentDailyCashButtonOption)
					IGNUemaHelper.delayThreadSecond(1)
				}
				lPersonalAccidentDailyCash=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDailyCashButton).trim()
			}
			this.checkPriceChangeToYearlyPayment()
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
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMotorcycle','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputAdditionalCoverageMotorcycleA(strAdditionalCoverageMotorcycle)
						break
					case 'B':
						lreturn=this.inputAdditionalCoverageMotorcycleB(strAdditionalCoverageMotorcycle)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputAdditionalCoverageMotorcycleA(strAdditionalCoverageMotorcycle)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionalCoverageMotorcycleA(String strAdditionalCoverageMotorcycle){
		Map lreturn=[:]
		String lAdditionalCoverageMotorcycle=strAdditionalCoverageMotorcycle.trim()
		if(lAdditionalCoverageMotorcycle.length()<=0){
			lAdditionalCoverageMotorcycle=THAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_MOTORCYCLE
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMotorcycle','')
			lreturn.put('Result',lResult)
			Boolean lIsAdditionalCoverageMotorcycle=IGNUemaHelper.convertStringToBoolean(lAdditionalCoverageMotorcycle)
			String lTagAdditionalCoverageMotorcycleOption='additionalRidingMotorcycle'
			String lLocatorAdditionalCoverageMotorcycleOption=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMotorcycleOption)
			WebElement lElementAdditionalCoverageMotorcycleOption=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdditionalCoverageMotorcycleOption)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementAdditionalCoverageMotorcycleOption){
				lAdditionalCoverageMotorcycle='No Option'
			}else{
				String lTagAdditionalCoverageMotorcycleButton=''
				String lLocatorAdditionalCoverageMotorcycleButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdditionalCoverageMotorcycleOption,'button')
				WebElement lElementAdditionalCoverageMotorcycleButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMotorcycleButton)
				if(!lElementAdditionalCoverageMotorcycleButton){
					return lreturn
				}
				if(lElementAdditionalCoverageMotorcycleButton){
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMotorcycleOption)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsAdditionalCoverageMotorcycle){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMotorcycleButton)
						}
					}else{
						if(lIsAdditionalCoverageMotorcycle){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMotorcycleButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMotorcycleOption)
					lAdditionalCoverageMotorcycle=lStageStr
				}
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputAdditionalCoverageMotorcycleB(String strAdditionalCoverageMotorcycle){
		Map lreturn=[:]
		String lAdditionalCoverageMotorcycle=strAdditionalCoverageMotorcycle.trim()
		if(lAdditionalCoverageMotorcycle.length()<=0){
			lAdditionalCoverageMotorcycle=THAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_MOTORCYCLE
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMotorcycle','')
			lreturn.put('Result',lResult)
			Boolean lIsAdditionalCoverageMotorcycle=IGNUemaHelper.convertStringToBoolean(lAdditionalCoverageMotorcycle)
			String lTagAdditionalCoverageMotorcycleOption='additionalRidingMotorcycle'
			String lLocatorAdditionalCoverageMotorcycleOption=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMotorcycleOption)
			WebElement lElementAdditionalCoverageMotorcycleOption=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdditionalCoverageMotorcycleOption)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementAdditionalCoverageMotorcycleOption){
				lAdditionalCoverageMotorcycle='No Option'
			}else{
				String lTagAdditionalCoverageMotorcycleButton=''
				String lLocatorAdditionalCoverageMotorcycleButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdditionalCoverageMotorcycleOption,'button')
				WebElement lElementAdditionalCoverageMotorcycleButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMotorcycleButton)
				if(!lElementAdditionalCoverageMotorcycleButton){
					return lreturn
				}
				if(lElementAdditionalCoverageMotorcycleButton){
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMotorcycleOption)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsAdditionalCoverageMotorcycle){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMotorcycleButton)
						}
					}else{
						if(lIsAdditionalCoverageMotorcycle){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMotorcycleButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMotorcycleOption)
					lAdditionalCoverageMotorcycle=lStageStr
				}
			}
			this.checkPriceChangeToYearlyPayment()
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
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMurderedOrAssaulted','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputAdditionalCoverageMurderedOrAssaultedA(strAdditionalCoverageMurderedOrAssaulted)
						break
					case 'B':
						lreturn=this.inputAdditionalCoverageMurderedOrAssaultedB(strAdditionalCoverageMurderedOrAssaulted)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputAdditionalCoverageMurderedOrAssaultedA(strAdditionalCoverageMurderedOrAssaulted)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionalCoverageMurderedOrAssaultedA(String strAdditionalCoverageMurderedOrAssaulted){
		Map lreturn=[:]
		String lAdditionalCoverageMurderedOrAssaulted=strAdditionalCoverageMurderedOrAssaulted.trim()
		if(lAdditionalCoverageMurderedOrAssaulted.length()<=0){
			lAdditionalCoverageMurderedOrAssaulted=THAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_MURDERED_OR_ASSAULTED
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMurderedOrAssaulted','')
			lreturn.put('Result',lResult)
			Boolean lIsAdditionalCoverageMurderedOrAssaulted=IGNUemaHelper.convertStringToBoolean(lAdditionalCoverageMurderedOrAssaulted)
			String lTagAdditionalCoverageMurderedOrAssaultedOption='additionalMurderedOrAssaulted'
			String lLocatorAdditionalCoverageMurderedOrAssaultedOption=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMurderedOrAssaultedOption)
			WebElement lElementAdditionalCoverageMurderedOrAssaultedOption=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdditionalCoverageMurderedOrAssaultedOption)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementAdditionalCoverageMurderedOrAssaultedOption){
				lAdditionalCoverageMurderedOrAssaulted='No Option'
			}else{
				String lTagAdditionalCoverageMurderedOrAssaultedButton=''
				String lLocatorAdditionalCoverageMurderedOrAssaultedButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdditionalCoverageMurderedOrAssaultedOption,'button')
				WebElement lElementAdditionalCoverageMurderedOrAssaultedButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMurderedOrAssaultedButton)
				if(!lElementAdditionalCoverageMurderedOrAssaultedButton){
					return lreturn
				}
				if(lElementAdditionalCoverageMurderedOrAssaultedButton){
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMurderedOrAssaultedOption)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsAdditionalCoverageMurderedOrAssaulted){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMurderedOrAssaultedButton)
						}
					}else{
						if(lIsAdditionalCoverageMurderedOrAssaulted){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMurderedOrAssaultedButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMurderedOrAssaultedOption)
					lAdditionalCoverageMurderedOrAssaulted=lStageStr
				}
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputAdditionalCoverageMurderedOrAssaultedB(String strAdditionalCoverageMurderedOrAssaulted){
		Map lreturn=[:]
		String lAdditionalCoverageMurderedOrAssaulted=strAdditionalCoverageMurderedOrAssaulted.trim()
		if(lAdditionalCoverageMurderedOrAssaulted.length()<=0){
			lAdditionalCoverageMurderedOrAssaulted=THAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_MURDERED_OR_ASSAULTED
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageMurderedOrAssaulted','')
			lreturn.put('Result',lResult)
			Boolean lIsAdditionalCoverageMurderedOrAssaulted=IGNUemaHelper.convertStringToBoolean(lAdditionalCoverageMurderedOrAssaulted)
			String lTagAdditionalCoverageMurderedOrAssaultedOption='additionalMurderedOrAssaulted'
			String lLocatorAdditionalCoverageMurderedOrAssaultedOption=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMurderedOrAssaultedOption)
			WebElement lElementAdditionalCoverageMurderedOrAssaultedOption=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdditionalCoverageMurderedOrAssaultedOption)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementAdditionalCoverageMurderedOrAssaultedOption){
				lAdditionalCoverageMurderedOrAssaulted='No Option'
			}else{
				String lTagAdditionalCoverageMurderedOrAssaultedButton=''
				String lLocatorAdditionalCoverageMurderedOrAssaultedButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdditionalCoverageMurderedOrAssaultedOption,'button')
				WebElement lElementAdditionalCoverageMurderedOrAssaultedButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMurderedOrAssaultedButton)
				if(!lElementAdditionalCoverageMurderedOrAssaultedButton){
					return lreturn
				}
				if(lElementAdditionalCoverageMurderedOrAssaultedButton){
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMurderedOrAssaultedOption)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsAdditionalCoverageMurderedOrAssaulted){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMurderedOrAssaultedButton)
						}
					}else{
						if(lIsAdditionalCoverageMurderedOrAssaulted){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageMurderedOrAssaultedButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMurderedOrAssaultedOption)
					lAdditionalCoverageMurderedOrAssaulted=lStageStr
				}
			}
			this.checkPriceChangeToYearlyPayment()
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
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageExtremeSport','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputAdditionalCoverageExtremeSportA(strAdditionalCoverageExtremeSport)
						break
					case 'B':
						lreturn=this.inputAdditionalCoverageExtremeSportB(strAdditionalCoverageExtremeSport)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputAdditionalCoverageExtremeSportA(strAdditionalCoverageExtremeSport)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionalCoverageExtremeSportA(String strAdditionalCoverageExtremeSport){
		Map lreturn=[:]
		String lAdditionalCoverageExtremeSport=strAdditionalCoverageExtremeSport.trim()
		if(lAdditionalCoverageExtremeSport.length()<=0){
			lAdditionalCoverageExtremeSport=THAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_EXTREME_SPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageExtremeSport','')
			lreturn.put('Result',lResult)
			Boolean lIsAdditionalCoverageExtremeSport=IGNUemaHelper.convertStringToBoolean(lAdditionalCoverageExtremeSport)
			String lTagAdditionalCoverageExtremeSportOption='additionalExtream'
			String lLocatorAdditionalCoverageExtremeSportOption=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageExtremeSportOption)
			WebElement lElementAdditionalCoverageExtremeSportOption=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdditionalCoverageExtremeSportOption)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementAdditionalCoverageExtremeSportOption){
				lAdditionalCoverageExtremeSport='No Option'
			}else{
				String lTagAdditionalCoverageMurderedOrAssaultedButton=''
				String lLocatorAdditionalCoverageMurderedOrAssaultedButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdditionalCoverageExtremeSportOption,'button')
				WebElement lElementAdditionalCoverageExtremeSportButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMurderedOrAssaultedButton)
				if(!lElementAdditionalCoverageExtremeSportButton){
					return lreturn
				}
				if(lElementAdditionalCoverageExtremeSportButton){
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageExtremeSportOption)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsAdditionalCoverageExtremeSport){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageExtremeSportButton)
						}
					}else{
						if(lIsAdditionalCoverageExtremeSport){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageExtremeSportButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageExtremeSportOption)
					lAdditionalCoverageExtremeSport=lStageStr
				}
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputAdditionalCoverageExtremeSportB(String strAdditionalCoverageExtremeSport){
		Map lreturn=[:]
		String lAdditionalCoverageExtremeSport=strAdditionalCoverageExtremeSport.trim()
		if(lAdditionalCoverageExtremeSport.length()<=0){
			lAdditionalCoverageExtremeSport=THAPersonalAccidentQuotationResultType.DEFAULT_ADDITIONAL_COVERAGE_EXTREME_SPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionalCoverageExtremeSport','')
			lreturn.put('Result',lResult)
			Boolean lIsAdditionalCoverageExtremeSport=IGNUemaHelper.convertStringToBoolean(lAdditionalCoverageExtremeSport)
			String lTagAdditionalCoverageExtremeSportOption='additionalExtream'
			String lLocatorAdditionalCoverageExtremeSportOption=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageExtremeSportOption)
			WebElement lElementAdditionalCoverageExtremeSportOption=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdditionalCoverageExtremeSportOption)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementAdditionalCoverageExtremeSportOption){
				lAdditionalCoverageExtremeSport='No Option'
			}else{
				String lTagAdditionalCoverageMurderedOrAssaultedButton=''
				String lLocatorAdditionalCoverageMurderedOrAssaultedButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdditionalCoverageExtremeSportOption,'button')
				WebElement lElementAdditionalCoverageExtremeSportButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMurderedOrAssaultedButton)
				if(!lElementAdditionalCoverageExtremeSportButton){
					return lreturn
				}
				if(lElementAdditionalCoverageExtremeSportButton){
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageExtremeSportOption)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsAdditionalCoverageExtremeSport){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageExtremeSportButton)
						}
					}else{
						if(lIsAdditionalCoverageExtremeSport){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdditionalCoverageExtremeSportButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageExtremeSportOption)
					lAdditionalCoverageExtremeSport=lStageStr
				}
			}
			this.checkPriceChangeToYearlyPayment()
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THAPersonalAccidentQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			lSalesforceProceedTodo='Yes'
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			lSalesforceProceedTodo=IGNUemaHelper.convertBooleanToString(lIsSalesforceProceedTodo)
			this.waitUntilOpportunityNumberUpdated()
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
			String lTagAutomationLanguage='select-language'
			String lLocatorAutomationLanguage=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationLanguage)
			WebElement lElementAutomationLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAutomationLanguage)
			if(!lElementAutomationLanguage){
				lAutomationLanguage='No Option'
			}else{
				lAutomationLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationLanguage)
				if(lAutomationLanguage.length()<=0){
					lAutomationLanguage='No Option'
				}
			}
			String lTagPersonalAccidentDeathActiveButton='accidentalDeath'
			String lLocatorPersonalAccidentDeathActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDeathActiveButton)
			WebElement lElementPersonalAccidentDeathActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentDeathActiveButton)
			if(!lElementPersonalAccidentDeathActiveButton){
				lAutomationPersonalAccidentDeath='No Option'
			}else{
				lAutomationPersonalAccidentDeath=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDeathActiveButton)
				if(lAutomationPersonalAccidentDeath.length()<=0){
					lAutomationPersonalAccidentDeath='No Option'
				}
			}
			String lTagPersonalAccidentLossActiveButton='additionalLossOfOrganOrSight-check'
			String lLocatorPersonalAccidentLossActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentLossActiveButton)
			WebElement lElementPersonalAccidentLossActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentLossActiveButton)
			if(!lElementPersonalAccidentLossActiveButton){
				lAutomationPersonalAccidentLoss='No Option'
			}else{
				lAutomationPersonalAccidentLoss=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentLossActiveButton)
				if(lAutomationPersonalAccidentLoss.length()<=0){
					lAutomationPersonalAccidentLoss='No Option'
				}
			}
			String lTagPersonalAccidentMedicalExpenseActiveButton='additionalMedicalExpenses'
			String lLocatorPersonalAccidentMedicalExpenseActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentMedicalExpenseActiveButton)
			WebElement lElementPersonalAccidentMedicalExpenseActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentMedicalExpenseActiveButton)
			if(!lElementPersonalAccidentMedicalExpenseActiveButton){
				lAutomationPersonalAccidentMedicalExpense='No Option'
			}else{
				lAutomationPersonalAccidentMedicalExpense=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentMedicalExpenseActiveButton)
				if(lAutomationPersonalAccidentMedicalExpense.length()<=0){
					lAutomationPersonalAccidentMedicalExpense='No Option'
				}
			}
			String lTagPersonalAccidentDailyCashActiveButton='additionalDailyCash'
			String lLocatorPersonalAccidentDailyCashActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDailyCashActiveButton)
			WebElement lElementPersonalAccidentDailyCashActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentDailyCashActiveButton)
			if(!lElementPersonalAccidentDailyCashActiveButton){
				lAutomationPersonalAccidentDailyCash='No Option'
			}else{
				lAutomationPersonalAccidentDailyCash=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDailyCashActiveButton)
				if(lAutomationPersonalAccidentDailyCash.length()<=0){
					lAutomationPersonalAccidentDailyCash='No Option'
				}
			}
			String lTagAdditionalCoverageMotorcycleActiveButton='additionalRidingMotorcycle'
			String lLocatorAdditionalCoverageMotorcycleActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMotorcycleActiveButton)
			WebElement lElementAdditionalCoverageMotorcycleActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMotorcycleActiveButton)
			if(!lElementAdditionalCoverageMotorcycleActiveButton){
				lAutomationAdditionalCoverageMotorcycle='No Option'
			}else{
				lAutomationAdditionalCoverageMotorcycle=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMotorcycleActiveButton)
				if(lAutomationAdditionalCoverageMotorcycle.length()<=0){
					lAutomationAdditionalCoverageMotorcycle='No Option'
				}
			}
			String lTagAdditionalCoverageMurderedOrAssaultedActiveButton='additionalMurderedOrAssaulted'
			String lLocatorAdditionalCoverageMurderedOrAssaultedActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMurderedOrAssaultedActiveButton)
			WebElement lElementAdditionalCoverageMurderedOrAssaultedActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMurderedOrAssaultedActiveButton)
			if(!lElementAdditionalCoverageMurderedOrAssaultedActiveButton){
				lAutomationAdditionalCoverageMurderedOrAssaulted='No Option'
			}else{
				lAutomationAdditionalCoverageMurderedOrAssaulted=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMurderedOrAssaultedActiveButton)
				if(lAutomationAdditionalCoverageMurderedOrAssaulted.length()<=0){
					lAutomationAdditionalCoverageMurderedOrAssaulted='No Option'
				}
			}
			String lTagAdditionalCoverageExtremeSportActiveButton='additionalExtream'
			String lLocatorAdditionalCoverageExtremeSportActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageExtremeSportActiveButton)
			WebElement lElementAdditionalCoverageExtremeSportActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageExtremeSportActiveButton)
			if(!lElementAdditionalCoverageExtremeSportActiveButton){
				lAutomationAdditionalCoverageExtremeSport='No Option'
			}else{
				lAutomationAdditionalCoverageExtremeSport=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageExtremeSportActiveButton)
				if(lAutomationAdditionalCoverageExtremeSport.length()<=0){
					lAutomationAdditionalCoverageExtremeSport='No Option'
				}
			}
			String lTagAutomationOpportunityNumber='qotation-no'
			String lLocatorAutomationOpportunityNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationOpportunityNumber)
			WebElement lElementAutomationOpportunityNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAutomationOpportunityNumber)
			if(!lElementAutomationOpportunityNumber){
				lAutomationOpportunityNumber='No Option'
			}else{
				this.waitUntilLoaded()
				lAutomationOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationOpportunityNumber)
				if(lAutomationOpportunityNumber.length()<=0){
					return lreturn
				}
			}
			this.checkPriceChangeToYearlyPayment()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionCancerSwitchButton='paymentOption'
			String lLocatorPaymentOptionCancerSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionCancerSwitchButton)
			WebElement lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			Boolean lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonDisabled){
				if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
				}
			}
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
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
			lAutomationPremiumYearly=lPremiumYearlyTotalValueText
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionCancerSwitchButtonDisabled){
				lAutomationPremiumDeposit='No Option'
				lAutomationPremiumMonthly='No Option'
				lAutomationPremiumInstalment='No Option'
				lAutomationPremiumNoDepositAmount='No Option'
				lAutomationPremiumNoDepositTotal='No Option'
				lAutomationPremiumQuarterlyAmount='No Option'
				lAutomationPremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
				}
				lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
				if(!lElementPaymentOptionCancerSwitchButton){
					return lreturn
				}
				lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
				lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionCancerSwitchButtonAsYearly){
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
				lAutomationPremiumDeposit='No Option'
				lAutomationPremiumMonthly='No Option'
				lAutomationPremiumInstalment='No Option'
				lAutomationPremiumNoDepositAmount='No Option'
				lAutomationPremiumNoDepositTotal='No Option'
				lAutomationPremiumQuarterlyAmount='No Option'
				lAutomationPremiumQuarterlyTotal='No Option'
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lAutomationPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lAutomationPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lAutomationPremiumInstalment=lSelectedPremiumAmountTotalValueText
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lAutomationPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lAutomationPremiumNoDepositTotal=lSelectedPremiumAmountTotalValueText
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lAutomationPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lAutomationPremiumQuarterlyTotal=lSelectedPremiumAmountTotalValueText
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonDisabled){
				if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
				}
			}
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
				return lreturn
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
			String lTagSalesforceRetrieveDataLanguage='select-language'
			String lLocatorSalesforceRetrieveDataLanguage=IGNUemaHelper.getTagDataSeleniumKey(lTagSalesforceRetrieveDataLanguage)
			WebElement lElementSalesforceRetrieveDataLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSalesforceRetrieveDataLanguage)
			if(!lElementSalesforceRetrieveDataLanguage){
				lSalesforceRetrieveDataLanguage='No Option'
			}else{
				lSalesforceRetrieveDataLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSalesforceRetrieveDataLanguage)
				if(lSalesforceRetrieveDataLanguage.length()<=0){
					lSalesforceRetrieveDataLanguage='No Option'
				}
			}
			String lTagPersonalAccidentDeathActiveButton='accidentalDeath'
			String lLocatorPersonalAccidentDeathActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDeathActiveButton)
			WebElement lElementPersonalAccidentDeathActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentDeathActiveButton)
			if(!lElementPersonalAccidentDeathActiveButton){
				lSalesforceRetrieveDataPersonalAccidentDeath='No Option'
			}else{
				lSalesforceRetrieveDataPersonalAccidentDeath=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDeathActiveButton)
				if(lSalesforceRetrieveDataPersonalAccidentDeath.length()<=0){
					lSalesforceRetrieveDataPersonalAccidentDeath='No Option'
				}
			}
			String lTagPersonalAccidentLossActiveButton='additionalLossOfOrganOrSight-check'
			String lLocatorPersonalAccidentLossActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentLossActiveButton)
			WebElement lElementPersonalAccidentLossActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentLossActiveButton)
			if(!lElementPersonalAccidentLossActiveButton){
				lSalesforceRetrieveDataPersonalAccidentLoss='No Option'
			}else{
				lSalesforceRetrieveDataPersonalAccidentLoss=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentLossActiveButton)
				if(lSalesforceRetrieveDataPersonalAccidentLoss.length()<=0){
					lSalesforceRetrieveDataPersonalAccidentLoss='No Option'
				}
			}
			String lTagPersonalAccidentMedicalExpenseActiveButton='additionalMedicalExpenses'
			String lLocatorPersonalAccidentMedicalExpenseActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentMedicalExpenseActiveButton)
			WebElement lElementPersonalAccidentMedicalExpenseActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentMedicalExpenseActiveButton)
			if(!lElementPersonalAccidentMedicalExpenseActiveButton){
				lSalesforceRetrieveDataPersonalAccidentMedicalExpense='No Option'
			}else{
				lSalesforceRetrieveDataPersonalAccidentMedicalExpense=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentMedicalExpenseActiveButton)
				if(lSalesforceRetrieveDataPersonalAccidentMedicalExpense.length()<=0){
					lSalesforceRetrieveDataPersonalAccidentMedicalExpense='No Option'
				}
			}
			String lTagPersonalAccidentDailyCashActiveButton='additionalDailyCash'
			String lLocatorPersonalAccidentDailyCashActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPersonalAccidentDailyCashActiveButton)
			WebElement lElementPersonalAccidentDailyCashActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPersonalAccidentDailyCashActiveButton)
			if(!lElementPersonalAccidentDailyCashActiveButton){
				lSalesforceRetrieveDataPersonalAccidentDailyCash='No Option'
			}else{
				lSalesforceRetrieveDataPersonalAccidentDailyCash=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPersonalAccidentDailyCashActiveButton)
				if(lSalesforceRetrieveDataPersonalAccidentDailyCash.length()<=0){
					lSalesforceRetrieveDataPersonalAccidentDailyCash='No Option'
				}
			}
			String lTagAdditionalCoverageMotorcycleActiveButton='additionalRidingMotorcycle'
			String lLocatorAdditionalCoverageMotorcycleActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMotorcycleActiveButton)
			WebElement lElementAdditionalCoverageMotorcycleActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMotorcycleActiveButton)
			if(!lElementAdditionalCoverageMotorcycleActiveButton){
				lSalesforceRetrieveDataAdditionalCoverageMotorcycle='No Option'
			}else{
				lSalesforceRetrieveDataAdditionalCoverageMotorcycle=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMotorcycleActiveButton)
				if(lSalesforceRetrieveDataAdditionalCoverageMotorcycle.length()<=0){
					lSalesforceRetrieveDataAdditionalCoverageMotorcycle='No Option'
				}
			}
			String lTagAdditionalCoverageMurderedOrAssaultedActiveButton='additionalMurderedOrAssaulted'
			String lLocatorAdditionalCoverageMurderedOrAssaultedActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageMurderedOrAssaultedActiveButton)
			WebElement lElementAdditionalCoverageMurderedOrAssaultedActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageMurderedOrAssaultedActiveButton)
			if(!lElementAdditionalCoverageMurderedOrAssaultedActiveButton){
				lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted='No Option'
			}else{
				lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageMurderedOrAssaultedActiveButton)
				if(lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted.length()<=0){
					lSalesforceRetrieveDataAdditionalCoverageMurderedOrAssaulted='No Option'
				}
			}
			String lTagAdditionalCoverageExtremeSportActiveButton='additionalExtream'
			String lLocatorAdditionalCoverageExtremeSportActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionalCoverageExtremeSportActiveButton)
			WebElement lElementAdditionalCoverageExtremeSportActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdditionalCoverageExtremeSportActiveButton)
			if(!lElementAdditionalCoverageExtremeSportActiveButton){
				lSalesforceRetrieveDataAdditionalCoverageExtremeSport='No Option'
			}else{
				lSalesforceRetrieveDataAdditionalCoverageExtremeSport=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAdditionalCoverageExtremeSportActiveButton)
				if(lSalesforceRetrieveDataAdditionalCoverageExtremeSport.length()<=0){
					lSalesforceRetrieveDataAdditionalCoverageExtremeSport='No Option'
				}
			}
			String lTagAutomationOpportunityNumber='qotation-no'
			String lLocatorAutomationOpportunityNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationOpportunityNumber)
			WebElement lElementAutomationOpportunityNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAutomationOpportunityNumber)
			if(!lElementAutomationOpportunityNumber){
				lSalesforceRetrieveDataOpportunityNumber='No Option'
			}else{
				this.waitUntilLoaded()
				lSalesforceRetrieveDataOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationOpportunityNumber)
				if(lSalesforceRetrieveDataOpportunityNumber.length()<=0){
					return lreturn
				}
			}
			this.checkPriceChangeToYearlyPayment()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionCancerSwitchButton='paymentOption'
			String lLocatorPaymentOptionCancerSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionCancerSwitchButton)
			WebElement lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			Boolean lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonDisabled){
				if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
				}
			}
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
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
			lSalesforceRetrieveDataPremiumYearly=lPremiumYearlyTotalValueText
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionCancerSwitchButtonDisabled){
				lSalesforceRetrieveDataPremiumDeposit='No Option'
				lSalesforceRetrieveDataPremiumMonthly='No Option'
				lSalesforceRetrieveDataPremiumInstalment='No Option'
				lSalesforceRetrieveDataPremiumNoDepositAmount='No Option'
				lSalesforceRetrieveDataPremiumNoDepositTotal='No Option'
				lSalesforceRetrieveDataPremiumQuarterlyAmount='No Option'
				lSalesforceRetrieveDataPremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
				}
				lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
				if(!lElementPaymentOptionCancerSwitchButton){
					return lreturn
				}
				lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
				lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionCancerSwitchButtonAsYearly){
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
				lSalesforceRetrieveDataPremiumDeposit='No Option'
				lSalesforceRetrieveDataPremiumMonthly='No Option'
				lSalesforceRetrieveDataPremiumInstalment='No Option'
				lSalesforceRetrieveDataPremiumNoDepositAmount='No Option'
				lSalesforceRetrieveDataPremiumNoDepositTotal='No Option'
				lSalesforceRetrieveDataPremiumQuarterlyAmount='No Option'
				lSalesforceRetrieveDataPremiumQuarterlyTotal='No Option'
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lSalesforceRetrieveDataPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lSalesforceRetrieveDataPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lSalesforceRetrieveDataPremiumInstalment=lSelectedPremiumAmountTotalValueText
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lSalesforceRetrieveDataPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lSalesforceRetrieveDataPremiumNoDepositTotal=lSelectedPremiumAmountTotalValueText
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lSalesforceRetrieveDataPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lSalesforceRetrieveDataPremiumQuarterlyTotal=lSelectedPremiumAmountTotalValueText
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonDisabled){
				if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
				}
			}
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionCancerSwitchButtonAsYearly){
				return lreturn
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
		//Verify WEB AND SF
		Map lreturn=[:]
		String lSalesforceVerifyCompareDetail=''
		String lSalesforceVerifyCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=caseOutput.AutomationOpportunityNumber
			String lSalesforceOpportunityNumber=caseOutput.SalesforceVerifyDataOpportunityObjName
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			Float lAutomationPrice=0
			Float lSalesforcePrice=0
			Float lPrice=0
			for(Integer lIndex=0;lIndex<=5;lIndex++){
				Integer lItemIndex=lIndex+1
				String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
				String lQuoteLineItem=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverCodeC')
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'PA')){
					String lAutomationPersonalAccidentPlan=caseOutput.AutomationPersonalAccidentDeath
					String lSalesforcePersonalAccidentPlan=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSumAssuredC')
					lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationPersonalAccidentPlan,0)
					lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforcePersonalAccidentPlan,0)
					lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
					if(lPrice>1){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('PersonalAccidentPlan='+lAutomationPersonalAccidentPlan,lSalesforcePersonalAccidentPlan)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}else{
						String lAutomationPersonalAccidentDeath=caseOutput.AutomationPersonalAccidentDeath
						String lSalesforcePersonalAccidentDeath=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured1C')
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPersonalAccidentDeath,lSalesforcePersonalAccidentDeath)){
							lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationPersonalAccidentDeath,0)
							lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforcePersonalAccidentDeath,0)
							lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
							if(lPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Personal Accident Death='+lAutomationPersonalAccidentDeath,lSalesforcePersonalAccidentDeath)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationPersonalAccidentMedicalExpense=caseOutput.AutomationPersonalAccidentMedicalExpense
						String lSalesforcePersonalAccidentMedicalExpense=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured2C')
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPersonalAccidentMedicalExpense,lSalesforcePersonalAccidentMedicalExpense)){
							lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationPersonalAccidentMedicalExpense,0)
							lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforcePersonalAccidentMedicalExpense,0)
							lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
							if(lPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Personal Accident Medical Expense='+lAutomationPersonalAccidentMedicalExpense,lSalesforcePersonalAccidentMedicalExpense)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationPersonalAccidentDailyCash=caseOutput.AutomationPersonalAccidentDailyCash
						String lSalesforcePersonalAccidentDailyCash=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured3C')
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPersonalAccidentDailyCash,lSalesforcePersonalAccidentDailyCash)){
							lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationPersonalAccidentDailyCash,0)
							lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforcePersonalAccidentDailyCash,0)
							lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
							if(lPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Personal Accident Daily Cash='+lAutomationPersonalAccidentDailyCash,lSalesforcePersonalAccidentDailyCash)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationAdditionalCoverageMotorcycle=caseOutput.AutomationAdditionalCoverageMotorcycle
						if(lAutomationAdditionalCoverageMotorcycle.toUpperCase().contains('YES')){
							String lSalesforceAdditionalCoverageMotorcycle=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured5C')
							if(lSalesforceAdditionalCoverageMotorcycle.length()<=0){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Additional Coverage Motorcycle='+lAutomationAdditionalCoverageMotorcycle,lSalesforceAdditionalCoverageMotorcycle)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationAdditionalCoverageExtremeSport=caseOutput.AutomationAdditionalCoverageExtremeSport
						if(lAutomationAdditionalCoverageExtremeSport.toUpperCase().contains('YES')){
							String lSalesforceAdditionalCoverageExtremeSport=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured6C')
							if(lSalesforceAdditionalCoverageExtremeSport.length()<=0){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Additional Coverage Extreme Sport='+lAutomationAdditionalCoverageExtremeSport,lSalesforceAdditionalCoverageExtremeSport)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationPersonalAccidentLoss=caseOutput.AutomationPersonalAccidentLoss
						if(lAutomationPersonalAccidentLoss.toUpperCase().contains('YES')){
							String lSalesforcePersonalAccidentLoss=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured7C')
							if(lSalesforcePersonalAccidentLoss.length()<=0){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Personal Accident Loss='+lAutomationPersonalAccidentLoss,lSalesforcePersonalAccidentLoss)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationAdditionalCoverageMurderedOrAssaulted=caseOutput.AutomationAdditionalCoverageMurderedOrAssaulted
						if(lAutomationAdditionalCoverageMurderedOrAssaulted.toUpperCase().contains('YES')){
							String lSalesforceAdditionalCoverageMurderedOrAssaulted=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured8C')
							if(lSalesforceAdditionalCoverageMurderedOrAssaulted.length()<=0){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Additional Coverage Murdered Or Assaulted='+lAutomationAdditionalCoverageMurderedOrAssaulted,lSalesforceAdditionalCoverageMurderedOrAssaulted)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
				}
			}
			String lAutomationYearly=caseOutput.AutomationPremiumYearly
			String lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
				Float lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
				Float lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
				Float lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
				if(lYearlyPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}else{
					if(lAutomationYearlyNumber>3000){
						String lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmount
						String lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							Float lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							Float lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							Float lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotal
						String lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTwelveMonthlyPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							Float lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							Float lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							Float lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
				}
			}
			if(!isQuoteByNone){
				Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(caseOutput.SalesforceVerifyDataOpportunityObjAccountid,'001p000000pE3R9AAK')
				if(lIsAccountNameAnonymous){
					lIsOK=false
					lText='Account Name : Roojai Anonymous'
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			if(lIsOK){
				caseOutput.SalesforceVerifyCompareDetail='Passed'
				caseOutput.SalesforceVerifyCompareResult='Passed'
			}else{
				caseOutput.SalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail.trim()
				caseOutput.SalesforceVerifyCompareResult='Failed'
			}
			lResult=lIsOK
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
		//Verify WEB AND WEB
		Map lreturn=[:]
		String lSalesforceRetrieveCompareDetail=''
		String lSalesforceRetrieveCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationLanguage=caseOutput.AutomationLanguage
			String lSalesforceLanguage=caseOutput.SalesforceRetrieveDataLanguage
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationLanguage,lSalesforceLanguage)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('Language='+lAutomationLanguage,lSalesforceLanguage)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationOpportunityNumber=caseOutput.AutomationOpportunityNumber
			String lSalesforceOpportunityNumber=caseOutput.SalesforceRetrieveDataOpportunityNumber
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationYearly=caseOutput.AutomationPremiumYearly
			String lSalesforceYearly=caseOutput.SalesforceRetrieveDataPremiumYearly
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
				Float lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
				Float lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
				Float lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
				if(lYearlyPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumDeposit=caseOutput.AutomationPremiumDeposit
			String lSalesforcePremiumDeposit=caseOutput.SalesforceRetrieveDataPremiumDeposit
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumDeposit,lSalesforcePremiumDeposit)){
				Float lAutomationPremiumDepositNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumDeposit,0)
				Float lSalesforcePremiumDepositNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumDeposit,0)
				Float lPremiumDepositPrice=Math.abs(lAutomationPremiumDepositNumber-lSalesforcePremiumDepositNumber)
				if(lPremiumDepositPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumDeposit='+lAutomationPremiumDeposit,lSalesforcePremiumDeposit)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumMonthly=caseOutput.AutomationPremiumMonthly
			String lSalesforcePremiumMonthly=caseOutput.SalesforceRetrieveDataPremiumMonthly
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumMonthly,lSalesforcePremiumMonthly)){
				Float lAutomationPremiumMonthlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumMonthly,0)
				Float lSalesforcePremiumMonthlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumMonthly,0)
				Float lPremiumMonthlyPrice=Math.abs(lAutomationPremiumMonthlyNumber-lSalesforcePremiumMonthlyNumber)
				if(lPremiumMonthlyPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumMonthly='+lAutomationPremiumMonthly,lSalesforcePremiumMonthly)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumInstalment=caseOutput.AutomationPremiumInstalment
			String lSalesforcePremiumInstalment=caseOutput.SalesforceRetrieveDataPremiumInstalment
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumInstalment,lSalesforcePremiumInstalment)){
				Float lAutomationPremiumInstalmentNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumInstalment,0)
				Float lSalesforcePremiumInstalmentNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumInstalment,0)
				Float lPremiumInstalmentPrice=Math.abs(lAutomationPremiumInstalmentNumber-lSalesforcePremiumInstalmentNumber)
				if(lPremiumInstalmentPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumInstalment='+lAutomationPremiumInstalment,lSalesforcePremiumInstalment)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmount
			String lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
				Float lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
				Float lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
				Float lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
				if(lPremiumNoDepositAmountPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotal
			String lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
				Float lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
				Float lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
				Float lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
				if(lPremiumNoDepositTotalPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumQuarterlyAmount=caseOutput.AutomationPremiumQuarterlyAmount
			String lSalesforcePremiumQuarterlyAmount=caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumQuarterlyAmount,lSalesforcePremiumQuarterlyAmount)){
				Float lAutomationPremiumQuarterlyAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumQuarterlyAmount,0)
				Float lSalesforcePremiumQuarterlyAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumQuarterlyAmount,0)
				Float lPremiumQuarterlyAmountPrice=Math.abs(lAutomationPremiumQuarterlyAmountNumber-lSalesforcePremiumQuarterlyAmountNumber)
				if(lPremiumQuarterlyAmountPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumQuarterlyAmount='+lAutomationPremiumQuarterlyAmount,lSalesforcePremiumQuarterlyAmount)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumQuarterlyTotal=caseOutput.AutomationPremiumQuarterlyTotal
			String lSalesforcePremiumQuarterlyTotal=caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumQuarterlyTotal,lSalesforcePremiumQuarterlyTotal)){
				Float lAutomationPremiumQuarterlyTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumQuarterlyTotal,0)
				Float lSalesforcePremiumQuarterlyTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumQuarterlyTotal,0)
				Float lPremiumQuarterlyTotalPrice=Math.abs(lAutomationPremiumQuarterlyTotalNumber-lSalesforcePremiumQuarterlyTotalNumber)
				if(lPremiumQuarterlyTotalPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumQuarterlyTotal='+lAutomationPremiumQuarterlyTotal,lSalesforcePremiumQuarterlyTotal)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			if(lIsOK){
				caseOutput.SalesforceRetrieveCompareDetail='Passed'
				caseOutput.SalesforceRetrieveCompareResult='Passed'
			}else{
				caseOutput.SalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail.trim()
				caseOutput.SalesforceRetrieveCompareResult='Failed'
			}
			lResult=lIsOK
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
			lSalesforceProceedRetrieveTodo=THAPersonalAccidentQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(strAccountNameAnonymous,'001p000000pE3R9AAK')
			if(lIsAccountNameAnonymous){
				lSalesforceProceedRetrieveTodo='No'
			}
			Boolean lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
			lSalesforceProceedRetrieveTodo=IGNUemaHelper.convertBooleanToYesNoString(lIsSalesforceProceedRetrieveTodo)
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
		String lRetrievePageURL=strRetrievePageURL.trim()
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			String lMainWindow=this.driver.getWindowHandle()
			if(lMainWindow.length()<=0){
				lMainWindow=this.driver.getWindowHandle()
			}
			String lUrlToNavigate=lRetrievePageURL
			Boolean lIsOpenNewBrowserTab=IGNUemaHelper.openNewBrowserTab(this.driver,lUrlToNavigate)
			if(!lIsOpenNewBrowserTab){
				return lreturn
			}
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
				if(!lSetWinHandle){
					IGNUemaHelper.delayThreadSecond(4)
					lSetWinHandle=this.driver.getWindowHandles()
				}else{
					if(lSetWinHandle.size()<=1){
						IGNUemaHelper.delayThreadSecond(4)
						lSetWinHandle=this.driver.getWindowHandles()
					}
				}
				if(!lSetWinHandle){
					return lreturn
				}else{
					if(lSetWinHandle.size()<=1){
						return lreturn
					}
				}
				for(String lWindowHandle:lSetWinHandle){
					if(lMainWindow.equals(lWindowHandle)){
						this.driver.close()
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lSetWinHandle=this.driver.getWindowHandles()
				if(!lSetWinHandle){
					return lreturn
				}else{
					if(lSetWinHandle.size()>1){
						return lreturn
					}
				}
				for(String lWindowHandle:lSetWinHandle){
					this.driver.switchTo().window(lWindowHandle)
					IGNUemaHelper.delayThreadSecond(3)
					this.driver.switchTo().window(lWindowHandle)
					IGNUemaHelper.delayThreadSecond(3)
				}
				String lLocatorResultPage='#pa-packages'
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				if(!lRedirected){
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.navigateToUrl(lUrlToNavigate)
					lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				}
				if(!lRedirected){
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.navigateToUrl(lUrlToNavigate)
					lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				}
				if(!lRedirected){
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.navigateToUrl(lUrlToNavigate)
					lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				}
				if(lRedirected){
					String lCurrentURL=WebUI.getUrl()
					IGNUemaHelper.printLog(lCurrentURL)
					lRedirected=lCurrentURL.toUpperCase().contains('PACKAGES')
				}
				lResult=lRedirected
			}catch(Exception ex){
				return lreturn
			}
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
			Boolean lIsActualResult=false
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lTagInfo=''
			String lLocatorInfo=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
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
			THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
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
			this.checkPaymentOptionPersonalAccidentSwitch()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionPersonalAccidentSwitchButton='paymentOption'
			String lLocatorPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionPersonalAccidentSwitchButton)
			WebElement lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
				lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
				if(!lElementPaymentOptionPersonalAccidentSwitchButton){
					return lreturn
				}
				lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
				lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
				return lreturn
			}
			if(isQuoteByNone){
				if(lPremiumYearlyTotalValueFloat==0){
					if(isPositiveCase){
						lIsDone=false
					}else{
						lIsDone=true
					}
					lIsActualResult=lIsDone
				}else{
					if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
						if(!this.waitUntilLoaded()){
							this.waitUntilLoaded()
						}
						Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
						if(isPositiveCase){
							lIsActualResult=lRedirected
							lIsDone=lRedirected
						}else{
							lIsActualResult=!lRedirected
							lIsDone=!lRedirected
						}
					}else{
						lIsDone=false
						lIsActualResult=lIsDone
					}
				}
			}
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
						if(!lOpportunityNumber.toUpperCase().contains('PA')){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}else{
							IGNUemaHelper.delayThreadSecond(lIndex)
						}
					}
				}
			}
			THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
			if(!isQuoteByNone){
				lIsActualResult=lIsOK
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			lResult=lIsActualResult
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
			Boolean lIsActualResult=false
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lTagInfo=''
			String lLocatorInfo=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
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
			THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
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
			this.checkPaymentOptionPersonalAccidentSwitch()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionPersonalAccidentSwitchButton='paymentOption'
			String lLocatorPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionPersonalAccidentSwitchButton)
			WebElement lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			Boolean lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
			}else{
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
				lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
				if(!lElementPaymentOptionPersonalAccidentSwitchButton){
					return lreturn
				}
				lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
				lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
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
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonDisabled){
				if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton)
				}
			}
			lElementPaymentOptionPersonalAccidentSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionPersonalAccidentSwitchButton)
			if(!lElementPaymentOptionPersonalAccidentSwitchButton){
				return lreturn
			}
			lIsPaymentOptionPersonalAccidentSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton,'disabled')
			lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionPersonalAccidentSwitchButton).toUpperCase().contains('YEARLY')
			if(!lIsPaymentOptionPersonalAccidentSwitchButtonAsYearly){
				return lreturn
			}
			if(isQuoteByNone){
				if(lPremiumYearlyTotalValueFloat==0){
					if(isPositiveCase){
						lIsDone=false
					}else{
						lIsDone=true
					}
					lIsActualResult=lIsDone
				}else{
					if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
						if(!this.waitUntilLoaded()){
							this.waitUntilLoaded()
						}
						Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
						if(isPositiveCase){
							lIsActualResult=lRedirected
							lIsDone=lRedirected
						}else{
							lIsActualResult=!lRedirected
							lIsDone=!lRedirected
						}
					}else{
						lIsDone=false
						lIsActualResult=lIsDone
					}
				}
			}
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
						if(!lOpportunityNumber.toUpperCase().contains('PA')){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}else{
							IGNUemaHelper.delayThreadSecond(lIndex)
						}
					}
				}
			}
			THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
			if(!isQuoteByNone){
				lIsActualResult=lIsOK
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			lResult=lIsActualResult
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