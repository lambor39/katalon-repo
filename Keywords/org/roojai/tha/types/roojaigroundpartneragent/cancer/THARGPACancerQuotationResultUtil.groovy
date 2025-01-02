package org.roojai.tha.types.roojaigroundpartneragent.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaicancer.THACancerQuotationResultUtil
import org.roojai.tha.types.roojaicancer.THACancerCoreType as THACancerCoreType
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THARGPACancerQuotationResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THACancerQuotationResultUtil lTHACancerQuotationResultUtil=null
	public THARGPACancerQuotationResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THACancerQuotationResultUtil getlTHACancerQuotationResultUtil(){
		return this.lTHACancerQuotationResultUtil
	}
	private void setlTHACancerQuotationResultUtil(THACancerQuotationResultUtil newlTHACancerQuotationResultUtil){
		//Do Nothing
		//this.lTHACancerQuotationResultUtil=newlTHACancerQuotationResultUtil
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
		String lCancerPlan=caseInput.CancerPlan.toString().trim()
		String lCovidPlan=caseInput.CovidPlan.toString().trim()
		String lHospitalIncomeBenefitPlan=caseInput.HospitalIncomeBenefitPlan.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion01=caseInput.QueryHospitalIncomeBenefitQuestion01.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion02=caseInput.QueryHospitalIncomeBenefitQuestion02.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion03=caseInput.QueryHospitalIncomeBenefitQuestion03.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion04=caseInput.QueryHospitalIncomeBenefitQuestion04.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion05=caseInput.QueryHospitalIncomeBenefitQuestion05.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion06=caseInput.QueryHospitalIncomeBenefitQuestion06.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion07=caseInput.QueryHospitalIncomeBenefitQuestion07.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion08=caseInput.QueryHospitalIncomeBenefitQuestion08.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion09=caseInput.QueryHospitalIncomeBenefitQuestion09.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion10=caseInput.QueryHospitalIncomeBenefitQuestion10.toString().trim()
		String lQuoteBy=caseInput.QuoteBy.toString().trim()
		String lQuoteCallWithType=caseInput.QuoteCallWithType.toString().trim()
		String lQuoteCallWithWhen=caseInput.QuoteCallWithWhen.toString().trim()
		String lQuoteCallWithTime=caseInput.QuoteCallWithTime.toString().trim()
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
		String lAutomationCancerPlan=''
		String lAutomationCovidPlan=''
		String lAutomationHospitalIncomeBenefitPlan=''
		String lAutomationQueryHospitalIncomeBenefitQuestion01=''
		String lAutomationQueryHospitalIncomeBenefitQuestion02=''
		String lAutomationQueryHospitalIncomeBenefitQuestion03=''
		String lAutomationQueryHospitalIncomeBenefitQuestion04=''
		String lAutomationQueryHospitalIncomeBenefitQuestion05=''
		String lAutomationQueryHospitalIncomeBenefitQuestion06=''
		String lAutomationQueryHospitalIncomeBenefitQuestion07=''
		String lAutomationQueryHospitalIncomeBenefitQuestion08=''
		String lAutomationQueryHospitalIncomeBenefitQuestion09=''
		String lAutomationQueryHospitalIncomeBenefitQuestion10=''
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
		String lSalesforceRetrieveDataCancerPlan=''
		String lSalesforceRetrieveDataCovidPlan=''
		String lSalesforceRetrieveDataHospitalIncomeBenefitPlan=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=''
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
			this.lTHACancerQuotationResultUtil=new THACancerQuotationResultUtil(this.driver,this.selenium)
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
						Map lMapCancerPlan=this.inputCancerPlan(lCancerPlan)
						if(!lMapCancerPlan.Result){
							lCancerPlan=''
						}else{
							lCancerPlan=lMapCancerPlan.CancerPlan
						}
						caseOutput.CancerPlan=lCancerPlan
						if(lCancerPlan.length()<=0){
							return lreturn
						}
						Map lMapCovidPlan=this.inputCovidPlan(lCovidPlan)
						if(!lMapCovidPlan.Result){
							lCovidPlan=''
						}else{
							lCovidPlan=lMapCovidPlan.CovidPlan
						}
						caseOutput.CovidPlan=lCovidPlan
						if(lCovidPlan.length()<=0){
							return lreturn
						}
						Map lMapHospitalIncomeBenefitPlan=this.inputHospitalIncomeBenefitPlan(lHospitalIncomeBenefitPlan,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
						if(!lMapHospitalIncomeBenefitPlan.Result){
							lHospitalIncomeBenefitPlan=''
							lQueryHospitalIncomeBenefitQuestion01=''
							lQueryHospitalIncomeBenefitQuestion02=''
							lQueryHospitalIncomeBenefitQuestion03=''
							lQueryHospitalIncomeBenefitQuestion04=''
							lQueryHospitalIncomeBenefitQuestion05=''
							lQueryHospitalIncomeBenefitQuestion06=''
							lQueryHospitalIncomeBenefitQuestion07=''
							lQueryHospitalIncomeBenefitQuestion08=''
							lQueryHospitalIncomeBenefitQuestion09=''
							lQueryHospitalIncomeBenefitQuestion10=''
						}else{
							lHospitalIncomeBenefitPlan=lMapHospitalIncomeBenefitPlan.HospitalIncomeBenefitPlan
							lQueryHospitalIncomeBenefitQuestion01=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion01
							lQueryHospitalIncomeBenefitQuestion02=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion02
							lQueryHospitalIncomeBenefitQuestion03=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion03
							lQueryHospitalIncomeBenefitQuestion04=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion04
							lQueryHospitalIncomeBenefitQuestion05=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion05
							lQueryHospitalIncomeBenefitQuestion06=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion06
							lQueryHospitalIncomeBenefitQuestion07=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion07
							lQueryHospitalIncomeBenefitQuestion08=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion08
							lQueryHospitalIncomeBenefitQuestion09=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion09
							lQueryHospitalIncomeBenefitQuestion10=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion10
						}
						caseOutput.HospitalIncomeBenefitPlan=lHospitalIncomeBenefitPlan
						caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
						caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
						caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
						caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
						caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
						caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
						caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
						caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
						caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
						caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
						if(!lMapHospitalIncomeBenefitPlan.Result){
							return lreturn
						}
						Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuoteCallWithType,lQuoteCallWithWhen,lQuoteCallWithTime,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
						if(!lMapQuoteMe.Result){
							lQuoteBy=''
							lQuoteCallWithType=''
							lQuoteCallWithWhen=''
							lQuoteCallWithTime=''
							lQuotePhoneNo=''
							lQuoteEmail=''
							lQuoteNewsletter=''
							lQuoteCallMeNow=''
							lQuotePDFDownloadToDo=''
							lQuotePDFDownloadDetail=''
							lQuotePDFDownloadResult=''
						}else{
							lQuoteBy=lMapQuoteMe.QuoteBy
							lQuoteCallWithType=lMapQuoteMe.QuoteCallWithType
							lQuoteCallWithWhen=lMapQuoteMe.QuoteCallWithWhen
							lQuoteCallWithTime=lMapQuoteMe.QuoteCallWithTime
							lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
							lQuoteEmail=lMapQuoteMe.QuoteEmail
							lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
							lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
							lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
							lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
							lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
						}
						caseOutput.QuoteBy=lQuoteBy
						caseOutput.QuoteCallWithType=lQuoteCallWithType
						caseOutput.QuoteCallWithWhen=lQuoteCallWithWhen
						caseOutput.QuoteCallWithTime=lQuoteCallWithTime
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
						THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
									this.lTHACancerQuotationResultUtil.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
								}
							}
						}
						Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
						if(!lMapAutomationDataBefore.Result){
							lAutomationLanguage=''
							lAutomationCancerPlan=''
							lAutomationCovidPlan=''
							lAutomationHospitalIncomeBenefitPlan=''
							lAutomationQueryHospitalIncomeBenefitQuestion01=''
							lAutomationQueryHospitalIncomeBenefitQuestion02=''
							lAutomationQueryHospitalIncomeBenefitQuestion03=''
							lAutomationQueryHospitalIncomeBenefitQuestion04=''
							lAutomationQueryHospitalIncomeBenefitQuestion05=''
							lAutomationQueryHospitalIncomeBenefitQuestion06=''
							lAutomationQueryHospitalIncomeBenefitQuestion07=''
							lAutomationQueryHospitalIncomeBenefitQuestion08=''
							lAutomationQueryHospitalIncomeBenefitQuestion09=''
							lAutomationQueryHospitalIncomeBenefitQuestion10=''
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
							lAutomationCancerPlan=lMapAutomationDataBefore.AutomationCancerPlan
							lAutomationCovidPlan=lMapAutomationDataBefore.AutomationCovidPlan
							lAutomationHospitalIncomeBenefitPlan=lMapAutomationDataBefore.AutomationHospitalIncomeBenefitPlan
							lAutomationQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion01
							lAutomationQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion02
							lAutomationQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion03
							lAutomationQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion04
							lAutomationQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion05
							lAutomationQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion06
							lAutomationQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion07
							lAutomationQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion08
							lAutomationQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion09
							lAutomationQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion10
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
						caseOutput.AutomationCancerPlan=lAutomationCancerPlan
						caseOutput.AutomationCovidPlan=lAutomationCovidPlan
						caseOutput.AutomationHospitalIncomeBenefitPlan=lAutomationHospitalIncomeBenefitPlan
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion01=lAutomationQueryHospitalIncomeBenefitQuestion01
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion02=lAutomationQueryHospitalIncomeBenefitQuestion02
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion03=lAutomationQueryHospitalIncomeBenefitQuestion03
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion04=lAutomationQueryHospitalIncomeBenefitQuestion04
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion05=lAutomationQueryHospitalIncomeBenefitQuestion05
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion06=lAutomationQueryHospitalIncomeBenefitQuestion06
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion07=lAutomationQueryHospitalIncomeBenefitQuestion07
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion08=lAutomationQueryHospitalIncomeBenefitQuestion08
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion09=lAutomationQueryHospitalIncomeBenefitQuestion09
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion10=lAutomationQueryHospitalIncomeBenefitQuestion10
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
						THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
											lSalesforceRetrieveDataCancerPlan=''
											lSalesforceRetrieveDataCovidPlan=''
											lSalesforceRetrieveDataHospitalIncomeBenefitPlan=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=''
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
											lSalesforceRetrieveDataCancerPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCancerPlan
											lSalesforceRetrieveDataCovidPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCovidPlan
											lSalesforceRetrieveDataHospitalIncomeBenefitPlan=lMapAutomationDataAfter.SalesforceRetrieveDataHospitalIncomeBenefitPlan
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
										caseOutput.SalesforceRetrieveDataCancerPlan=lSalesforceRetrieveDataCancerPlan
										caseOutput.SalesforceRetrieveDataCovidPlan=lSalesforceRetrieveDataCovidPlan
										caseOutput.SalesforceRetrieveDataHospitalIncomeBenefitPlan=lSalesforceRetrieveDataHospitalIncomeBenefitPlan
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
						Map lMapCancerPlan=this.inputCancerPlan(lCancerPlan)
						if(!lMapCancerPlan.Result){
							lCancerPlan=''
						}else{
							lCancerPlan=lMapCancerPlan.CancerPlan
						}
						caseOutput.CancerPlan=lCancerPlan
						if(lCancerPlan.length()<=0){
							return lreturn
						}
						Map lMapCovidPlan=this.inputCovidPlan(lCovidPlan)
						if(!lMapCovidPlan.Result){
							lCovidPlan=''
						}else{
							lCovidPlan=lMapCovidPlan.CovidPlan
						}
						caseOutput.CovidPlan=lCovidPlan
						if(lCovidPlan.length()<=0){
							return lreturn
						}
						Map lMapHospitalIncomeBenefitPlan=this.inputHospitalIncomeBenefitPlan(lHospitalIncomeBenefitPlan,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
						if(!lMapHospitalIncomeBenefitPlan.Result){
							lHospitalIncomeBenefitPlan=''
							lQueryHospitalIncomeBenefitQuestion01=''
							lQueryHospitalIncomeBenefitQuestion02=''
							lQueryHospitalIncomeBenefitQuestion03=''
							lQueryHospitalIncomeBenefitQuestion04=''
							lQueryHospitalIncomeBenefitQuestion05=''
							lQueryHospitalIncomeBenefitQuestion06=''
							lQueryHospitalIncomeBenefitQuestion07=''
							lQueryHospitalIncomeBenefitQuestion08=''
							lQueryHospitalIncomeBenefitQuestion09=''
							lQueryHospitalIncomeBenefitQuestion10=''
						}else{
							lHospitalIncomeBenefitPlan=lMapHospitalIncomeBenefitPlan.HospitalIncomeBenefitPlan
							lQueryHospitalIncomeBenefitQuestion01=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion01
							lQueryHospitalIncomeBenefitQuestion02=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion02
							lQueryHospitalIncomeBenefitQuestion03=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion03
							lQueryHospitalIncomeBenefitQuestion04=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion04
							lQueryHospitalIncomeBenefitQuestion05=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion05
							lQueryHospitalIncomeBenefitQuestion06=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion06
							lQueryHospitalIncomeBenefitQuestion07=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion07
							lQueryHospitalIncomeBenefitQuestion08=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion08
							lQueryHospitalIncomeBenefitQuestion09=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion09
							lQueryHospitalIncomeBenefitQuestion10=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion10
						}
						caseOutput.HospitalIncomeBenefitPlan=lHospitalIncomeBenefitPlan
						caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
						caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
						caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
						caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
						caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
						caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
						caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
						caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
						caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
						caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
						if(!lMapHospitalIncomeBenefitPlan.Result){
							return lreturn
						}
						Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuoteCallWithType,lQuoteCallWithWhen,lQuoteCallWithTime,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
						if(!lMapQuoteMe.Result){
							lQuoteBy=''
							lQuoteCallWithType=''
							lQuoteCallWithWhen=''
							lQuoteCallWithTime=''
							lQuotePhoneNo=''
							lQuoteEmail=''
							lQuoteNewsletter=''
							lQuoteCallMeNow=''
							lQuotePDFDownloadToDo=''
							lQuotePDFDownloadDetail=''
							lQuotePDFDownloadResult=''
						}else{
							lQuoteBy=lMapQuoteMe.QuoteBy
							lQuoteCallWithType=lMapQuoteMe.QuoteCallWithType
							lQuoteCallWithWhen=lMapQuoteMe.QuoteCallWithWhen
							lQuoteCallWithTime=lMapQuoteMe.QuoteCallWithTime
							lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
							lQuoteEmail=lMapQuoteMe.QuoteEmail
							lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
							lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
							lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
							lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
							lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
						}
						caseOutput.QuoteBy=lQuoteBy
						caseOutput.QuoteCallWithType=lQuoteCallWithType
						caseOutput.QuoteCallWithWhen=lQuoteCallWithWhen
						caseOutput.QuoteCallWithTime=lQuoteCallWithTime
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
						THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
									this.lTHACancerQuotationResultUtil.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
								}
							}
						}
						Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
						if(!lMapAutomationDataBefore.Result){
							lAutomationLanguage=''
							lAutomationCancerPlan=''
							lAutomationCovidPlan=''
							lAutomationHospitalIncomeBenefitPlan=''
							lAutomationQueryHospitalIncomeBenefitQuestion01=''
							lAutomationQueryHospitalIncomeBenefitQuestion02=''
							lAutomationQueryHospitalIncomeBenefitQuestion03=''
							lAutomationQueryHospitalIncomeBenefitQuestion04=''
							lAutomationQueryHospitalIncomeBenefitQuestion05=''
							lAutomationQueryHospitalIncomeBenefitQuestion06=''
							lAutomationQueryHospitalIncomeBenefitQuestion07=''
							lAutomationQueryHospitalIncomeBenefitQuestion08=''
							lAutomationQueryHospitalIncomeBenefitQuestion09=''
							lAutomationQueryHospitalIncomeBenefitQuestion10=''
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
							lAutomationCancerPlan=lMapAutomationDataBefore.AutomationCancerPlan
							lAutomationCovidPlan=lMapAutomationDataBefore.AutomationCovidPlan
							lAutomationHospitalIncomeBenefitPlan=lMapAutomationDataBefore.AutomationHospitalIncomeBenefitPlan
							lAutomationQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion01
							lAutomationQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion02
							lAutomationQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion03
							lAutomationQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion04
							lAutomationQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion05
							lAutomationQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion06
							lAutomationQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion07
							lAutomationQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion08
							lAutomationQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion09
							lAutomationQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion10
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
						caseOutput.AutomationCancerPlan=lAutomationCancerPlan
						caseOutput.AutomationCovidPlan=lAutomationCovidPlan
						caseOutput.AutomationHospitalIncomeBenefitPlan=lAutomationHospitalIncomeBenefitPlan
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion01=lAutomationQueryHospitalIncomeBenefitQuestion01
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion02=lAutomationQueryHospitalIncomeBenefitQuestion02
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion03=lAutomationQueryHospitalIncomeBenefitQuestion03
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion04=lAutomationQueryHospitalIncomeBenefitQuestion04
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion05=lAutomationQueryHospitalIncomeBenefitQuestion05
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion06=lAutomationQueryHospitalIncomeBenefitQuestion06
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion07=lAutomationQueryHospitalIncomeBenefitQuestion07
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion08=lAutomationQueryHospitalIncomeBenefitQuestion08
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion09=lAutomationQueryHospitalIncomeBenefitQuestion09
						caseOutput.AutomationQueryHospitalIncomeBenefitQuestion10=lAutomationQueryHospitalIncomeBenefitQuestion10
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
						THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
											lSalesforceRetrieveDataCancerPlan=''
											lSalesforceRetrieveDataCovidPlan=''
											lSalesforceRetrieveDataHospitalIncomeBenefitPlan=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=''
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=''
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
											lSalesforceRetrieveDataCancerPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCancerPlan
											lSalesforceRetrieveDataCovidPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCovidPlan
											lSalesforceRetrieveDataHospitalIncomeBenefitPlan=lMapAutomationDataAfter.SalesforceRetrieveDataHospitalIncomeBenefitPlan
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
											lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
										caseOutput.SalesforceRetrieveDataCancerPlan=lSalesforceRetrieveDataCancerPlan
										caseOutput.SalesforceRetrieveDataCovidPlan=lSalesforceRetrieveDataCovidPlan
										caseOutput.SalesforceRetrieveDataHospitalIncomeBenefitPlan=lSalesforceRetrieveDataHospitalIncomeBenefitPlan
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
										caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
				Map lMapCancerPlan=this.inputCancerPlan(lCancerPlan)
				if(!lMapCancerPlan.Result){
					lCancerPlan=''
				}else{
					lCancerPlan=lMapCancerPlan.CancerPlan
				}
				caseOutput.CancerPlan=lCancerPlan
				if(lCancerPlan.length()<=0){
					return lreturn
				}
				Map lMapCovidPlan=this.inputCovidPlan(lCovidPlan)
				if(!lMapCovidPlan.Result){
					lCovidPlan=''
				}else{
					lCovidPlan=lMapCovidPlan.CovidPlan
				}
				caseOutput.CovidPlan=lCovidPlan
				if(lCovidPlan.length()<=0){
					return lreturn
				}
				Map lMapHospitalIncomeBenefitPlan=this.inputHospitalIncomeBenefitPlan(lHospitalIncomeBenefitPlan,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
				if(!lMapHospitalIncomeBenefitPlan.Result){
					lHospitalIncomeBenefitPlan=''
					lQueryHospitalIncomeBenefitQuestion01=''
					lQueryHospitalIncomeBenefitQuestion02=''
					lQueryHospitalIncomeBenefitQuestion03=''
					lQueryHospitalIncomeBenefitQuestion04=''
					lQueryHospitalIncomeBenefitQuestion05=''
					lQueryHospitalIncomeBenefitQuestion06=''
					lQueryHospitalIncomeBenefitQuestion07=''
					lQueryHospitalIncomeBenefitQuestion08=''
					lQueryHospitalIncomeBenefitQuestion09=''
					lQueryHospitalIncomeBenefitQuestion10=''
				}else{
					lHospitalIncomeBenefitPlan=lMapHospitalIncomeBenefitPlan.HospitalIncomeBenefitPlan
					lQueryHospitalIncomeBenefitQuestion01=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion01
					lQueryHospitalIncomeBenefitQuestion02=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion02
					lQueryHospitalIncomeBenefitQuestion03=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion03
					lQueryHospitalIncomeBenefitQuestion04=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion04
					lQueryHospitalIncomeBenefitQuestion05=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion05
					lQueryHospitalIncomeBenefitQuestion06=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion06
					lQueryHospitalIncomeBenefitQuestion07=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion07
					lQueryHospitalIncomeBenefitQuestion08=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion08
					lQueryHospitalIncomeBenefitQuestion09=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion09
					lQueryHospitalIncomeBenefitQuestion10=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion10
				}
				caseOutput.HospitalIncomeBenefitPlan=lHospitalIncomeBenefitPlan
				caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
				caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
				caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
				caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
				caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
				caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
				caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
				caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
				caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
				caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
				if(!lMapHospitalIncomeBenefitPlan.Result){
					return lreturn
				}
				Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuoteCallWithType,lQuoteCallWithWhen,lQuoteCallWithTime,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
				if(!lMapQuoteMe.Result){
					lQuoteBy=''
					lQuoteCallWithType=''
					lQuoteCallWithWhen=''
					lQuoteCallWithTime=''
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
				}else{
					lQuoteBy=lMapQuoteMe.QuoteBy
					lQuoteCallWithType=lMapQuoteMe.QuoteCallWithType
					lQuoteCallWithWhen=lMapQuoteMe.QuoteCallWithWhen
					lQuoteCallWithTime=lMapQuoteMe.QuoteCallWithTime
					lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
					lQuoteEmail=lMapQuoteMe.QuoteEmail
					lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
					lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
					lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
					lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
					lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
				}
				caseOutput.QuoteBy=lQuoteBy
				caseOutput.QuoteCallWithType=lQuoteCallWithType
				caseOutput.QuoteCallWithWhen=lQuoteCallWithWhen
				caseOutput.QuoteCallWithTime=lQuoteCallWithTime
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
				THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
							this.lTHACancerQuotationResultUtil.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
						}
					}
				}
				Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
				if(!lMapAutomationDataBefore.Result){
					lAutomationLanguage=''
					lAutomationCancerPlan=''
					lAutomationCovidPlan=''
					lAutomationHospitalIncomeBenefitPlan=''
					lAutomationQueryHospitalIncomeBenefitQuestion01=''
					lAutomationQueryHospitalIncomeBenefitQuestion02=''
					lAutomationQueryHospitalIncomeBenefitQuestion03=''
					lAutomationQueryHospitalIncomeBenefitQuestion04=''
					lAutomationQueryHospitalIncomeBenefitQuestion05=''
					lAutomationQueryHospitalIncomeBenefitQuestion06=''
					lAutomationQueryHospitalIncomeBenefitQuestion07=''
					lAutomationQueryHospitalIncomeBenefitQuestion08=''
					lAutomationQueryHospitalIncomeBenefitQuestion09=''
					lAutomationQueryHospitalIncomeBenefitQuestion10=''
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
					lAutomationCancerPlan=lMapAutomationDataBefore.AutomationCancerPlan
					lAutomationCovidPlan=lMapAutomationDataBefore.AutomationCovidPlan
					lAutomationHospitalIncomeBenefitPlan=lMapAutomationDataBefore.AutomationHospitalIncomeBenefitPlan
					lAutomationQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion01
					lAutomationQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion02
					lAutomationQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion03
					lAutomationQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion04
					lAutomationQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion05
					lAutomationQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion06
					lAutomationQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion07
					lAutomationQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion08
					lAutomationQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion09
					lAutomationQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion10
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
				caseOutput.AutomationCancerPlan=lAutomationCancerPlan
				caseOutput.AutomationCovidPlan=lAutomationCovidPlan
				caseOutput.AutomationHospitalIncomeBenefitPlan=lAutomationHospitalIncomeBenefitPlan
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion01=lAutomationQueryHospitalIncomeBenefitQuestion01
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion02=lAutomationQueryHospitalIncomeBenefitQuestion02
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion03=lAutomationQueryHospitalIncomeBenefitQuestion03
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion04=lAutomationQueryHospitalIncomeBenefitQuestion04
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion05=lAutomationQueryHospitalIncomeBenefitQuestion05
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion06=lAutomationQueryHospitalIncomeBenefitQuestion06
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion07=lAutomationQueryHospitalIncomeBenefitQuestion07
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion08=lAutomationQueryHospitalIncomeBenefitQuestion08
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion09=lAutomationQueryHospitalIncomeBenefitQuestion09
				caseOutput.AutomationQueryHospitalIncomeBenefitQuestion10=lAutomationQueryHospitalIncomeBenefitQuestion10
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
				THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
						THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
						THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
									lSalesforceRetrieveDataCancerPlan=''
									lSalesforceRetrieveDataCovidPlan=''
									lSalesforceRetrieveDataHospitalIncomeBenefitPlan=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=''
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=''
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
									lSalesforceRetrieveDataCancerPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCancerPlan
									lSalesforceRetrieveDataCovidPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCovidPlan
									lSalesforceRetrieveDataHospitalIncomeBenefitPlan=lMapAutomationDataAfter.SalesforceRetrieveDataHospitalIncomeBenefitPlan
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
									lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
								caseOutput.SalesforceRetrieveDataCancerPlan=lSalesforceRetrieveDataCancerPlan
								caseOutput.SalesforceRetrieveDataCovidPlan=lSalesforceRetrieveDataCovidPlan
								caseOutput.SalesforceRetrieveDataHospitalIncomeBenefitPlan=lSalesforceRetrieveDataHospitalIncomeBenefitPlan
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
								caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
			lPositiveCase=THARGPACancerQuotationResultType.DEFAULT_POSITIVE_CASE
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
			Map lMapPostPrePackage=this.lTHACancerQuotationResultUtil.inputPostPrePackage()
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
			lLanguage=THARGPACancerQuotationResultType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHACancerQuotationResultUtil.inputLanguage(lLanguage)
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
	public Map inputCancerPlan(String strCancerPlan){
		Map lreturn=[:]
		String lCancerPlan=strCancerPlan.toUpperCase().trim()
		if(lCancerPlan.length()<=0){
			lCancerPlan=THARGPACancerQuotationResultType.DEFAULT_CANCER_PLAN
		}
		try{
			Boolean lResult=false
			lreturn.put('CancerPlan','')
			lreturn.put('Result',lResult)
			Map lMapCancerPlan=this.lTHACancerQuotationResultUtil.inputCancerPlan(lCancerPlan)
			if(!lMapCancerPlan.Result){
				lCancerPlan=''
			}else{
				lCancerPlan=lMapCancerPlan.CancerPlan
			}
			lResult=lCancerPlan.length()>0
			if(lResult){
				lreturn.put('CancerPlan',lCancerPlan)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCovidPlan(String strCovidPlan){
		Map lreturn=[:]
		String lCovidPlan=strCovidPlan.toUpperCase().trim()
		if(lCovidPlan.length()<=0){
			lCovidPlan=THARGPACancerQuotationResultType.DEFAULT_COVID_PLAN
		}
		try{
			Boolean lResult=false
			lreturn.put('CovidPlan','')
			lreturn.put('Result',lResult)
			Map lMapCovidPlan=this.lTHACancerQuotationResultUtil.inputCovidPlan(lCovidPlan)
			if(!lMapCovidPlan.Result){
				lCovidPlan=''
			}else{
				lCovidPlan=lMapCovidPlan.CovidPlan
			}
			lResult=lCovidPlan.length()>0
			if(lResult){
				lreturn.put('CovidPlan',lCovidPlan)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHospitalIncomeBenefitPlan(String strHospitalIncomeBenefitPlan,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lHospitalIncomeBenefitPlan=strHospitalIncomeBenefitPlan.toUpperCase().trim()
		if(lHospitalIncomeBenefitPlan.length()<=0){
			lHospitalIncomeBenefitPlan=THARGPACancerQuotationResultType.DEFAULT_HOSPITAL_INCOME_BENEFIT_PLAN
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THARGPACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		try{
			Boolean lResult=false
			lreturn.put('HospitalIncomeBenefitPlan','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion01','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion02','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion03','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion04','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion05','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion06','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion07','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion08','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion09','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion10','')
			lreturn.put('Result',lResult)
			Map lMapHospitalIncomeBenefitPlan=this.lTHACancerQuotationResultUtil.inputHospitalIncomeBenefitPlan(lHospitalIncomeBenefitPlan,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
			if(!lMapHospitalIncomeBenefitPlan.Result){
				lHospitalIncomeBenefitPlan=''
				lQueryHospitalIncomeBenefitQuestion01=''
				lQueryHospitalIncomeBenefitQuestion02=''
				lQueryHospitalIncomeBenefitQuestion03=''
				lQueryHospitalIncomeBenefitQuestion04=''
				lQueryHospitalIncomeBenefitQuestion05=''
				lQueryHospitalIncomeBenefitQuestion06=''
				lQueryHospitalIncomeBenefitQuestion07=''
				lQueryHospitalIncomeBenefitQuestion08=''
				lQueryHospitalIncomeBenefitQuestion09=''
				lQueryHospitalIncomeBenefitQuestion10=''
			}else{
				lHospitalIncomeBenefitPlan=lMapHospitalIncomeBenefitPlan.HospitalIncomeBenefitPlan
				lQueryHospitalIncomeBenefitQuestion01=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion01
				lQueryHospitalIncomeBenefitQuestion02=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion02
				lQueryHospitalIncomeBenefitQuestion03=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion03
				lQueryHospitalIncomeBenefitQuestion04=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion04
				lQueryHospitalIncomeBenefitQuestion05=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion05
				lQueryHospitalIncomeBenefitQuestion06=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion06
				lQueryHospitalIncomeBenefitQuestion07=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion07
				lQueryHospitalIncomeBenefitQuestion08=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion08
				lQueryHospitalIncomeBenefitQuestion09=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion09
				lQueryHospitalIncomeBenefitQuestion10=lMapHospitalIncomeBenefitPlan.QueryHospitalIncomeBenefitQuestion10
			}
			lResult=lMapHospitalIncomeBenefitPlan.Result
			if(lResult){
				lreturn.put('HospitalIncomeBenefitPlan',lHospitalIncomeBenefitPlan)
				lreturn.put('QueryHospitalIncomeBenefitQuestion01',lQueryHospitalIncomeBenefitQuestion01)
				lreturn.put('QueryHospitalIncomeBenefitQuestion02',lQueryHospitalIncomeBenefitQuestion02)
				lreturn.put('QueryHospitalIncomeBenefitQuestion03',lQueryHospitalIncomeBenefitQuestion03)
				lreturn.put('QueryHospitalIncomeBenefitQuestion04',lQueryHospitalIncomeBenefitQuestion04)
				lreturn.put('QueryHospitalIncomeBenefitQuestion05',lQueryHospitalIncomeBenefitQuestion05)
				lreturn.put('QueryHospitalIncomeBenefitQuestion06',lQueryHospitalIncomeBenefitQuestion06)
				lreturn.put('QueryHospitalIncomeBenefitQuestion07',lQueryHospitalIncomeBenefitQuestion07)
				lreturn.put('QueryHospitalIncomeBenefitQuestion08',lQueryHospitalIncomeBenefitQuestion08)
				lreturn.put('QueryHospitalIncomeBenefitQuestion09',lQueryHospitalIncomeBenefitQuestion09)
				lreturn.put('QueryHospitalIncomeBenefitQuestion10',lQueryHospitalIncomeBenefitQuestion10)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMe(String strQuoteBy,String strQuoteCallWithType,String strQuoteCallWithWhen,String strQuoteCallWithTime,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THARGPACancerQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuoteCallWithType=strQuoteCallWithType.toUpperCase().trim()
		if(lQuoteCallWithType.length()<=0){
			lQuoteCallWithType=THARGPACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TYPE
		}
		String lQuoteCallWithWhen=strQuoteCallWithWhen.toUpperCase().trim()
		if(lQuoteCallWithWhen.length()<=0){
			lQuoteCallWithWhen=THARGPACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_WHEN
		}
		String lQuoteCallWithTime=strQuoteCallWithTime.toUpperCase().trim()
		if(lQuoteCallWithTime.length()<=0){
			lQuoteCallWithTime=THARGPACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TIME
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THARGPACancerQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THARGPACancerQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THARGPACancerQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THARGPACancerQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THARGPACancerQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuoteCallWithType','')
			lreturn.put('QuoteCallWithWhen','')
			lreturn.put('QuoteCallWithTime','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			Map lMapQuoteMe=this.lTHACancerQuotationResultUtil.inputQuoteMe(lQuoteBy,lQuoteCallWithType,lQuoteCallWithWhen,lQuoteCallWithTime,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
			if(!lMapQuoteMe.Result){
				lQuoteBy=''
				lQuoteCallWithType=''
				lQuoteCallWithWhen=''
				lQuoteCallWithTime=''
				lQuotePhoneNo=''
				lQuoteEmail=''
				lQuoteNewsletter=''
				lQuoteCallMeNow=''
				lQuotePDFDownloadToDo=''
				lQuotePDFDownloadDetail=''
				lQuotePDFDownloadResult=''
			}else{
				lQuoteBy=lMapQuoteMe.QuoteBy
				lQuoteCallWithType=lMapQuoteMe.QuoteCallWithType
				lQuoteCallWithWhen=lMapQuoteMe.QuoteCallWithWhen
				lQuoteCallWithTime=lMapQuoteMe.QuoteCallWithTime
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
				lreturn.put('QuoteCallWithType',lQuoteCallWithType)
				lreturn.put('QuoteCallWithWhen',lQuoteCallWithWhen)
				lreturn.put('QuoteCallWithTime',lQuoteCallWithTime)
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
			lSalesforceProceedTodo=THARGPACancerQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHACancerQuotationResultUtil.inputSalesforceProceedTodo(lSalesforceProceedTodo)
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
		String lAutomationCancerPlan=''
		String lAutomationCovidPlan=''
		String lAutomationHospitalIncomeBenefitPlan=''
		String lAutomationQueryHospitalIncomeBenefitQuestion01=''
		String lAutomationQueryHospitalIncomeBenefitQuestion02=''
		String lAutomationQueryHospitalIncomeBenefitQuestion03=''
		String lAutomationQueryHospitalIncomeBenefitQuestion04=''
		String lAutomationQueryHospitalIncomeBenefitQuestion05=''
		String lAutomationQueryHospitalIncomeBenefitQuestion06=''
		String lAutomationQueryHospitalIncomeBenefitQuestion07=''
		String lAutomationQueryHospitalIncomeBenefitQuestion08=''
		String lAutomationQueryHospitalIncomeBenefitQuestion09=''
		String lAutomationQueryHospitalIncomeBenefitQuestion10=''
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
			lreturn.put('AutomationCancerPlan','')
			lreturn.put('AutomationCovidPlan','')
			lreturn.put('AutomationHospitalIncomeBenefitPlan','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion01','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion02','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion03','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion04','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion05','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion06','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion07','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion08','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion09','')
			lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion10','')
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
			Map lMapAutomationDataBefore=this.lTHACancerQuotationResultUtil.inputAutomationDataBefore()
			if(!lMapAutomationDataBefore.Result){
				lAutomationLanguage=''
				lAutomationCancerPlan=''
				lAutomationCovidPlan=''
				lAutomationHospitalIncomeBenefitPlan=''
				lAutomationQueryHospitalIncomeBenefitQuestion01=''
				lAutomationQueryHospitalIncomeBenefitQuestion02=''
				lAutomationQueryHospitalIncomeBenefitQuestion03=''
				lAutomationQueryHospitalIncomeBenefitQuestion04=''
				lAutomationQueryHospitalIncomeBenefitQuestion05=''
				lAutomationQueryHospitalIncomeBenefitQuestion06=''
				lAutomationQueryHospitalIncomeBenefitQuestion07=''
				lAutomationQueryHospitalIncomeBenefitQuestion08=''
				lAutomationQueryHospitalIncomeBenefitQuestion09=''
				lAutomationQueryHospitalIncomeBenefitQuestion10=''
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
				lAutomationCancerPlan=lMapAutomationDataBefore.AutomationCancerPlan
				lAutomationCovidPlan=lMapAutomationDataBefore.AutomationCovidPlan
				lAutomationHospitalIncomeBenefitPlan=lMapAutomationDataBefore.AutomationHospitalIncomeBenefitPlan
				lAutomationQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion01
				lAutomationQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion02
				lAutomationQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion03
				lAutomationQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion04
				lAutomationQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion05
				lAutomationQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion06
				lAutomationQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion07
				lAutomationQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion08
				lAutomationQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion09
				lAutomationQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataBefore.AutomationQueryHospitalIncomeBenefitQuestion10
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
				lreturn.put('AutomationCancerPlan',lAutomationCancerPlan)
				lreturn.put('AutomationCovidPlan',lAutomationCovidPlan)
				lreturn.put('AutomationHospitalIncomeBenefitPlan',lAutomationHospitalIncomeBenefitPlan)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion01',lAutomationQueryHospitalIncomeBenefitQuestion01)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion02',lAutomationQueryHospitalIncomeBenefitQuestion02)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion03',lAutomationQueryHospitalIncomeBenefitQuestion03)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion04',lAutomationQueryHospitalIncomeBenefitQuestion04)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion05',lAutomationQueryHospitalIncomeBenefitQuestion05)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion06',lAutomationQueryHospitalIncomeBenefitQuestion06)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion07',lAutomationQueryHospitalIncomeBenefitQuestion07)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion08',lAutomationQueryHospitalIncomeBenefitQuestion08)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion09',lAutomationQueryHospitalIncomeBenefitQuestion09)
				lreturn.put('AutomationQueryHospitalIncomeBenefitQuestion10',lAutomationQueryHospitalIncomeBenefitQuestion10)
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
		String lSalesforceRetrieveDataCancerPlan=''
		String lSalesforceRetrieveDataCovidPlan=''
		String lSalesforceRetrieveDataHospitalIncomeBenefitPlan=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=''
		String lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=''
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
			lreturn.put('SalesforceRetrieveDataCancerPlan','')
			lreturn.put('SalesforceRetrieveDataCovidPlan','')
			lreturn.put('SalesforceRetrieveDataHospitalIncomeBenefitPlan','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09','')
			lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10','')
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
			Map lMapAutomationDataAfter=this.lTHACancerQuotationResultUtil.inputAutomationDataAfter()
			if(!lMapAutomationDataAfter.Result){
				lSalesforceRetrieveDataLanguage=''
				lSalesforceRetrieveDataCancerPlan=''
				lSalesforceRetrieveDataCovidPlan=''
				lSalesforceRetrieveDataHospitalIncomeBenefitPlan=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=''
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=''
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
				lSalesforceRetrieveDataCancerPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCancerPlan
				lSalesforceRetrieveDataCovidPlan=lMapAutomationDataAfter.SalesforceRetrieveDataCovidPlan
				lSalesforceRetrieveDataHospitalIncomeBenefitPlan=lMapAutomationDataAfter.SalesforceRetrieveDataHospitalIncomeBenefitPlan
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=lMapAutomationDataAfter.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
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
				lreturn.put('SalesforceRetrieveDataCancerPlan',lSalesforceRetrieveDataCancerPlan)
				lreturn.put('SalesforceRetrieveDataCovidPlan',lSalesforceRetrieveDataCovidPlan)
				lreturn.put('SalesforceRetrieveDataHospitalIncomeBenefitPlan',lSalesforceRetrieveDataHospitalIncomeBenefitPlan)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09)
				lreturn.put('SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10',lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10)
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
			Map lMapSalesforceProceedVerifyBefore=this.lTHACancerQuotationResultUtil.inputSalesforceProceedVerifyBefore(caseOutput,isQuoteByNone)
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
			Map lMapSalesforceProceedVerifyAfter=this.lTHACancerQuotationResultUtil.inputSalesforceProceedVerifyAfter(caseOutput)
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
			lSalesforceProceedRetrieveTodo=THARGPACancerQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lTHACancerQuotationResultUtil.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
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
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lTHACancerQuotationResultUtil.inputSalesforceProceedRetrieveWebFromUrl(strRetrievePageURL)
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
			Map lMapActualResult=this.lTHACancerQuotationResultUtil.inputActualResult(isPositiveCase,isQuoteByNone)
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