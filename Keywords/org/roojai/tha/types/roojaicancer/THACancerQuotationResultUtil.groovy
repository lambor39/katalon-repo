package org.roojai.tha.types.roojaicancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THACancerQuotationResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THACancerQuotationResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
			String lOpportunityNumberOld=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.trim()
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
				THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
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
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-packages',30)
				if(!lRedirected){
					WebUI.back()
					this.waitUntilLoaded()
				}
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-packages',30)
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
								}
								THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
								THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
								THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
						THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
						THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
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
			lPositiveCase=THACancerQuotationResultType.DEFAULT_POSITIVE_CASE
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
	public Boolean checkPaymentOptionCancerSwitch(){
		Boolean lreturn=false
		try{
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
			String lLocatorPaymentOptionCancerSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionCancerSwitchButton)
			WebElement lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(lElementPaymentOptionCancerSwitchButton){
				Boolean lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
				Boolean lIsPaymentOptionCancerSwitchButtonAsMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('NO DEPOSIT')
				if(!lIsPaymentOptionCancerSwitchButtonDisabled){
					if(!lIsPaymentOptionCancerSwitchButtonAsMonthly){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
						lreturn=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
					}
				}
				lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
				Boolean lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
				if(lIsPaymentOptionCancerSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionCancerSwitchButton)
					lreturn=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionCancerSwitchButton)
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
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
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
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionCancerSwitchButtonDisabled){
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
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
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
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
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionCancerSwitchButtonDisabled){
				lPostPrePackagePremiumDeposit='No Option'
				lPostPrePackagePremiumMonthly='No Option'
				lPostPrePackagePremiumInstalment='No Option'
				lPostPrePackagePremiumNoDepositAmount='No Option'
				lPostPrePackagePremiumNoDepositTotal='No Option'
				lPostPrePackagePremiumQuarterlyAmount='No Option'
				lPostPrePackagePremiumQuarterlyTotal='No Option'
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
			lLanguage=THACancerQuotationResultType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THACancerQuotationResultType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THACancerQuotationResultType.DEFAULT_LANGUAGE)
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
			lLanguage=THACancerQuotationResultType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THACancerQuotationResultType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THACancerQuotationResultType.DEFAULT_LANGUAGE)
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
	public Map inputCancerPlan(String strCancerPlan){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CancerPlan','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCancerPlanA(strCancerPlan)
						break
					case 'B':
						lreturn=this.inputCancerPlanB(strCancerPlan)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCancerPlanA(strCancerPlan)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCancerPlanA(String strCancerPlan){
		Map lreturn=[:]
		String lCancerPlan=strCancerPlan.toUpperCase().trim()
		Map lCancerPlanList=['1':'1','2':'2','3':'3','4':'4','5':'5']
		try{
			Boolean lResult=false
			lreturn.put('CancerPlan','')
			lreturn.put('Result',lResult)
			String lTagCancerPlanButtonKey='package-Cancer'
			String lCancerPlanItemDefault=lCancerPlanList.get(THACancerQuotationResultType.DEFAULT_CANCER_PLAN.toUpperCase())
			String lCancerPlanItemDefaultValue=lCancerPlanItemDefault
			String lLocatorCancerPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
			WebElement lElementCancerPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
			if(!lElementCancerPlanDefaultButton){
				lCancerPlanItemDefaultValue='1'
				lLocatorCancerPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
				lElementCancerPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
			}
			if(!lElementCancerPlanDefaultButton){
				lCancerPlan='No Option'
			}else{
				String lCancerPlanItem=lCancerPlanList.get(lCancerPlan)
				if(!lCancerPlanItem){
					lCancerPlanItem=lCancerPlanItemDefaultValue
				}
				lCancerPlan=''
				String lTagCancerPlanButtonValue=lCancerPlanItem
				String lLocatorCancerPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCancerPlanButtonKey,lTagCancerPlanButtonValue)
				WebElement lElementCancerPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lTagCancerPlanButtonValue)
				if(!lElementCancerPlanButton){
					String lLocatorCancerPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCancerPlanButtonKey)+'.active'
					WebElement lElementCancerPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCancerPlanActiveButton)
					lElementCancerPlanButton=lElementCancerPlanActiveButton
				}
				if(!lElementCancerPlanButton){
					lCancerPlan='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCancerPlanButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCancerPlanButton)
					this.checkPriceChangeToYearlyPayment()
					lElementCancerPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lTagCancerPlanButtonValue)
					Boolean lIsElementCancerPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCancerPlanButton,'active')
					if(lIsElementCancerPlanButtonSelected){
						lCancerPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCancerPlanButton).trim()
					}else{
						lCancerPlan='No Option'
					}
				}
				if(lCancerPlan.contains('฿')){
					Integer lTextLength=lCancerPlan.length()
					if(lTextLength>0){
						String []lTextCheck=lCancerPlan
						Integer lTextIndex=0
						for(lTextIndex=0;lTextIndex<=lTextLength;lTextIndex++){
							if(lTextCheck[lTextIndex]=='฿'){
								lCancerPlan=lCancerPlan.substring(0,lTextIndex)
								break
							}
						}
					}
				}
			}
			lCancerPlan=lCancerPlan.trim()
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
	public Map inputCancerPlanB(String strCancerPlan){
		Map lreturn=[:]
		String lCancerPlan=strCancerPlan.toUpperCase().trim()
		Map lCancerPlanList=['1':'1','2':'2','3':'3','4':'4','5':'5']
		try{
			Boolean lResult=false
			lreturn.put('CancerPlan','')
			lreturn.put('Result',lResult)
			String lTagCancerPlanButtonKey='package-Cancer'
			String lCancerPlanItemDefault=lCancerPlanList.get(THACancerQuotationResultType.DEFAULT_CANCER_PLAN.toUpperCase())
			String lCancerPlanItemDefaultValue=lCancerPlanItemDefault
			String lLocatorCancerPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
			WebElement lElementCancerPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
			if(!lElementCancerPlanDefaultButton){
				lCancerPlanItemDefaultValue='1'
				lLocatorCancerPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
				lElementCancerPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lCancerPlanItemDefaultValue)
			}
			if(!lElementCancerPlanDefaultButton){
				lCancerPlan='No Option'
			}else{
				String lCancerPlanItem=lCancerPlanList.get(lCancerPlan)
				if(!lCancerPlanItem){
					lCancerPlanItem=lCancerPlanItemDefaultValue
				}
				lCancerPlan=''
				String lTagCancerPlanButtonValue=lCancerPlanItem
				String lLocatorCancerPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCancerPlanButtonKey,lTagCancerPlanButtonValue)
				WebElement lElementCancerPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lTagCancerPlanButtonValue)
				if(!lElementCancerPlanButton){
					String lLocatorCancerPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCancerPlanButtonKey)+'.active'
					WebElement lElementCancerPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCancerPlanActiveButton)
					lElementCancerPlanButton=lElementCancerPlanActiveButton
				}
				if(!lElementCancerPlanButton){
					lCancerPlan='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCancerPlanButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCancerPlanButton)
					this.checkPriceChangeToYearlyPayment()
					lElementCancerPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCancerPlanButtonKey,lTagCancerPlanButtonValue)
					Boolean lIsElementCancerPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCancerPlanButton,'active')
					if(lIsElementCancerPlanButtonSelected){
						lCancerPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCancerPlanButton).trim()
					}else{
						lCancerPlan='No Option'
					}
				}
				if(lCancerPlan.contains('฿')){
					Integer lTextLength=lCancerPlan.length()
					if(lTextLength>0){
						String []lTextCheck=lCancerPlan
						Integer lTextIndex=0
						for(lTextIndex=0;lTextIndex<=lTextLength;lTextIndex++){
							if(lTextCheck[lTextIndex]=='฿'){
								lCancerPlan=lCancerPlan.substring(0,lTextIndex)
								break
							}
						}
					}
				}
			}
			lCancerPlan=lCancerPlan.trim()
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
		try{
			Boolean lResult=false
			lreturn.put('CovidPlan','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCovidPlanA(strCovidPlan)
						break
					case 'B':
						lreturn=this.inputCovidPlanB(strCovidPlan)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCovidPlanA(strCovidPlan)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCovidPlanA(String strCovidPlan){
		Map lreturn=[:]
		String lCovidPlan=strCovidPlan.toUpperCase().trim()
		Map lCovidPlanList=['1':'0','2':'1','3':'2','4':'3']
		try{
			Boolean lResult=false
			lreturn.put('CovidPlan','')
			lreturn.put('Result',lResult)
			String lTagCovidPlanButtonKey='package-Covid19'
			String lCovidPlanItemDefault=lCovidPlanList.get(THACancerQuotationResultType.DEFAULT_COVID_PLAN.toUpperCase())
			String lCovidPlanItemDefaultValue=lCovidPlanItemDefault
			String lLocatorCovidPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
			WebElement lElementCovidPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
			if(!lElementCovidPlanDefaultButton){
				lCovidPlanItemDefaultValue='1'
				lLocatorCovidPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
				lElementCovidPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
			}
			if(!lElementCovidPlanDefaultButton){
				lCovidPlan='No Option'
			}else{
				String lCovidPlanItem=lCovidPlanList.get(lCovidPlan)
				if(!lCovidPlanItem){
					lCovidPlanItem=lCovidPlanItemDefaultValue
				}
				lCovidPlan=''
				String lTagCovidPlanExpandButton='suggestion-options-yes'
				String lLocatorCovidPlanExpandButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCovidPlanExpandButton)
				WebElement lElementCovidPlanExpandButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCovidPlanExpandButton)
				if(lElementCovidPlanExpandButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCovidPlanExpandButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCovidPlanExpandButton)
					IGNUemaHelper.delayThreadSecond(1)
					this.checkPriceChangeToYearlyPayment()
				}
				String lTagCovidPlanButtonValue=lCovidPlanItem
				String lLocatorCovidPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCovidPlanButtonKey,lTagCovidPlanButtonValue)
				WebElement lElementCovidPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lTagCovidPlanButtonValue)
				if(!lElementCovidPlanButton){
					String lLocatorCovidPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCovidPlanButtonKey)+'.active'
					WebElement lElementCovidPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCovidPlanActiveButton)
					lElementCovidPlanButton=lElementCovidPlanActiveButton
				}
				if(!lElementCovidPlanButton){
					lCovidPlan='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCovidPlanButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCovidPlanButton)
					this.checkPriceChangeToYearlyPayment()
					lElementCovidPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lTagCovidPlanButtonValue)
					Boolean lIsElementCovidPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCovidPlanButton,'active')
					if(lIsElementCovidPlanButtonSelected){
						lCovidPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCovidPlanButton).trim()
					}else{
						lCovidPlan='No Option'
					}
				}
				if(lCovidPlan.contains('฿')){
					Integer lTextLength=lCovidPlan.length()
					if(lTextLength>0){
						String []lTextCheck=lCovidPlan
						Integer lTextIndex=0
						for(lTextIndex=0;lTextIndex<=lTextLength;lTextIndex++){
							if(lTextCheck[lTextIndex]=='฿'){
								lCovidPlan=lCovidPlan.substring(0,lTextIndex)
								break
							}
						}
					}
				}
			}
			lCovidPlan=lCovidPlan.trim()
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
	public Map inputCovidPlanB(String strCovidPlan){
		Map lreturn=[:]
		String lCovidPlan=strCovidPlan.toUpperCase().trim()
		Map lCovidPlanList=['1':'0','2':'1','3':'2','4':'3']
		try{
			Boolean lResult=false
			lreturn.put('CovidPlan','')
			lreturn.put('Result',lResult)
			String lTagCovidPlanButtonKey='package-Covid19'
			String lCovidPlanItemDefault=lCovidPlanList.get(THACancerQuotationResultType.DEFAULT_COVID_PLAN.toUpperCase())
			String lCovidPlanItemDefaultValue=lCovidPlanItemDefault
			String lLocatorCovidPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
			WebElement lElementCovidPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
			if(!lElementCovidPlanDefaultButton){
				lCovidPlanItemDefaultValue='1'
				lLocatorCovidPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
				lElementCovidPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lCovidPlanItemDefaultValue)
			}
			if(!lElementCovidPlanDefaultButton){
				lCovidPlan='No Option'
			}else{
				String lCovidPlanItem=lCovidPlanList.get(lCovidPlan)
				if(!lCovidPlanItem){
					lCovidPlanItem=lCovidPlanItemDefaultValue
				}
				lCovidPlan=''
				String lTagCovidPlanExpandButton='suggestion-options-yes'
				String lLocatorCovidPlanExpandButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCovidPlanExpandButton)
				WebElement lElementCovidPlanExpandButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCovidPlanExpandButton)
				if(lElementCovidPlanExpandButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCovidPlanExpandButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCovidPlanExpandButton)
					IGNUemaHelper.delayThreadSecond(1)
					this.checkPriceChangeToYearlyPayment()
				}
				String lTagCovidPlanButtonValue=lCovidPlanItem
				String lLocatorCovidPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCovidPlanButtonKey,lTagCovidPlanButtonValue)
				WebElement lElementCovidPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lTagCovidPlanButtonValue)
				if(!lElementCovidPlanButton){
					String lLocatorCovidPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCovidPlanButtonKey)+'.active'
					WebElement lElementCovidPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCovidPlanActiveButton)
					lElementCovidPlanButton=lElementCovidPlanActiveButton
				}
				if(!lElementCovidPlanButton){
					lCovidPlan='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCovidPlanButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCovidPlanButton)
					this.checkPriceChangeToYearlyPayment()
					lElementCovidPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCovidPlanButtonKey,lTagCovidPlanButtonValue)
					Boolean lIsElementCovidPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCovidPlanButton,'active')
					if(lIsElementCovidPlanButtonSelected){
						lCovidPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCovidPlanButton).trim()
					}else{
						lCovidPlan='No Option'
					}
				}
				if(lCovidPlan.contains('฿')){
					Integer lTextLength=lCovidPlan.length()
					if(lTextLength>0){
						String []lTextCheck=lCovidPlan
						Integer lTextIndex=0
						for(lTextIndex=0;lTextIndex<=lTextLength;lTextIndex++){
							if(lTextCheck[lTextIndex]=='฿'){
								lCovidPlan=lCovidPlan.substring(0,lTextIndex)
								break
							}
						}
					}
				}
			}
			lCovidPlan=lCovidPlan.trim()
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHospitalIncomeBenefitPlanA(strHospitalIncomeBenefitPlan,strQueryHospitalIncomeBenefitQuestion01,strQueryHospitalIncomeBenefitQuestion02,strQueryHospitalIncomeBenefitQuestion03,strQueryHospitalIncomeBenefitQuestion04,strQueryHospitalIncomeBenefitQuestion05,strQueryHospitalIncomeBenefitQuestion06,strQueryHospitalIncomeBenefitQuestion07,strQueryHospitalIncomeBenefitQuestion08,strQueryHospitalIncomeBenefitQuestion09,strQueryHospitalIncomeBenefitQuestion10)
						break
					case 'B':
						lreturn=this.inputHospitalIncomeBenefitPlanB(strHospitalIncomeBenefitPlan,strQueryHospitalIncomeBenefitQuestion01,strQueryHospitalIncomeBenefitQuestion02,strQueryHospitalIncomeBenefitQuestion03,strQueryHospitalIncomeBenefitQuestion04,strQueryHospitalIncomeBenefitQuestion05,strQueryHospitalIncomeBenefitQuestion06,strQueryHospitalIncomeBenefitQuestion07,strQueryHospitalIncomeBenefitQuestion08,strQueryHospitalIncomeBenefitQuestion09,strQueryHospitalIncomeBenefitQuestion10)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHospitalIncomeBenefitPlanA(strHospitalIncomeBenefitPlan,strQueryHospitalIncomeBenefitQuestion01,strQueryHospitalIncomeBenefitQuestion02,strQueryHospitalIncomeBenefitQuestion03,strQueryHospitalIncomeBenefitQuestion04,strQueryHospitalIncomeBenefitQuestion05,strQueryHospitalIncomeBenefitQuestion06,strQueryHospitalIncomeBenefitQuestion07,strQueryHospitalIncomeBenefitQuestion08,strQueryHospitalIncomeBenefitQuestion09,strQueryHospitalIncomeBenefitQuestion10)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHospitalIncomeBenefitPlanA(String strHospitalIncomeBenefitPlan,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lHospitalIncomeBenefitPlan=strHospitalIncomeBenefitPlan.toUpperCase().trim()
		if(lHospitalIncomeBenefitPlan.length()<=0){
			lHospitalIncomeBenefitPlan=THACancerQuotationResultType.DEFAULT_HOSPITAL_INCOME_BENEFIT_PLAN
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		Map lHospitalIncomeBenefitPlanList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5','7':'6']
		Map lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
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
			String lTagHospitalIncomeBenefitPlanButtonKey='package-HospitalIncomeBenefit'
			String lHospitalIncomeBenefitPlanItemDefault=lHospitalIncomeBenefitPlanList.get(THACancerQuotationResultType.DEFAULT_HOSPITAL_INCOME_BENEFIT_PLAN.toUpperCase())
			String lHospitalIncomeBenefitPlanItemDefaultValue=lHospitalIncomeBenefitPlanItemDefault
			String lLocatorHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
			WebElement lElementHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
			if(!lElementHospitalIncomeBenefitPlanDefaultButton){
				lHospitalIncomeBenefitPlanItemDefaultValue='1'
				lLocatorHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
				lElementHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
			}
			Boolean lIsQueryHospitalIncomeBenefitToDo=false
			if(!lElementHospitalIncomeBenefitPlanDefaultButton){
				lHospitalIncomeBenefitPlan='No Option'
			}else{
				String lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanList.get(lHospitalIncomeBenefitPlan)
				if(!lHospitalIncomeBenefitPlanItem){
					lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanItemDefaultValue
				}
				lHospitalIncomeBenefitPlan=''
				String lTagHospitalIncomeBenefitPlanButtonValue=lHospitalIncomeBenefitPlanItem
				String lLocatorHospitalIncomeBenefitPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				WebElement lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				if(!lElementHospitalIncomeBenefitPlanButton){
					String lLocatorHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHospitalIncomeBenefitPlanButtonKey)+'.active'
					WebElement lElementHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHospitalIncomeBenefitPlanActiveButton)
					lElementHospitalIncomeBenefitPlanButton=lElementHospitalIncomeBenefitPlanActiveButton
				}
				if(!lElementHospitalIncomeBenefitPlanButton){
					lHospitalIncomeBenefitPlan='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementHospitalIncomeBenefitPlanButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementHospitalIncomeBenefitPlanButton)
					this.checkPriceChangeToYearlyPayment()
					lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
					Boolean lIsElementHospitalIncomeBenefitPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton,'active')
					lIsQueryHospitalIncomeBenefitToDo=!IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).equalsIgnoreCase('0')
					if(lIsElementHospitalIncomeBenefitPlanButtonSelected){
						lHospitalIncomeBenefitPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).trim()
					}else{
						lHospitalIncomeBenefitPlan='No Option'
					}
				}
			}
			lHospitalIncomeBenefitPlan=lHospitalIncomeBenefitPlan.trim()
			if(lIsQueryHospitalIncomeBenefitToDo){
				String lTagQueryHospitalIncomeBenefitToDoForm='interes-HIB-modal'
				String lLocatorQueryHospitalIncomeBenefitToDoForm=IGNUemaHelper.getTagDataSeleniumKey(lTagQueryHospitalIncomeBenefitToDoForm)
				WebElement lElementQueryHospitalIncomeBenefitToDoForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQueryHospitalIncomeBenefitToDoForm)
				Boolean lIsQueryHospitalIncomeBenefitToDoFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitToDoForm,5)
				lIsQueryHospitalIncomeBenefitToDoFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorQueryHospitalIncomeBenefitToDoForm)
				if(lIsQueryHospitalIncomeBenefitToDoFormDisplayed){
					lElementQueryHospitalIncomeBenefitToDoForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQueryHospitalIncomeBenefitToDoForm)
					if(lElementQueryHospitalIncomeBenefitToDoForm){
						String lTagQueryHospitalIncomeBenefitToDoFormButtonYesKey='interest-hib'
						String lTagQueryHospitalIncomeBenefitToDoFormButtonYesValue='Yes'
						String lLocatorQueryHospitalIncomeBenefitToDoFormButtonYes=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitToDoFormButtonYesKey,lTagQueryHospitalIncomeBenefitToDoFormButtonYesValue)
						WebElement lElementQueryHospitalIncomeBenefitToDoFormButtonYes=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementQueryHospitalIncomeBenefitToDoForm,lTagQueryHospitalIncomeBenefitToDoFormButtonYesKey,lTagQueryHospitalIncomeBenefitToDoFormButtonYesValue)
						if(lElementQueryHospitalIncomeBenefitToDoFormButtonYes){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitToDoFormButtonYes)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitToDoFormButtonYes)
							this.checkPriceChangeToYearlyPayment()
						}else{
							lIsQueryHospitalIncomeBenefitToDo=false
						}
					}else{
						lIsQueryHospitalIncomeBenefitToDo=false
					}
				}else{
					lIsQueryHospitalIncomeBenefitToDo=false
				}
			}
			if(lIsQueryHospitalIncomeBenefitToDo){
				String lQueryHospitalIncomeBenefitToDoItem=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get('1')
				String lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion01)
				if(!lQueryHospitalIncomeBenefitQuestion01Item){
					lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion01=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion01Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion02)
				if(!lQueryHospitalIncomeBenefitQuestion02Item){
					lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion02=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion02Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion03)
				if(!lQueryHospitalIncomeBenefitQuestion03Item){
					lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion03=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion03Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion04)
				if(!lQueryHospitalIncomeBenefitQuestion04Item){
					lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion04=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion04Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion05)
				if(!lQueryHospitalIncomeBenefitQuestion05Item){
					lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion05=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion05Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion06)
				if(!lQueryHospitalIncomeBenefitQuestion06Item){
					lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion06=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion06Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion07)
				if(!lQueryHospitalIncomeBenefitQuestion07Item){
					lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion07=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion07Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion08)
				if(!lQueryHospitalIncomeBenefitQuestion08Item){
					lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion08=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion08Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion09)
				if(!lQueryHospitalIncomeBenefitQuestion09Item){
					lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion09=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion09Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion10)
				if(!lQueryHospitalIncomeBenefitQuestion10Item){
					lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion10=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion10Item,'YES')
				Boolean lIsDoneQueryAll=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion01=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion02=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion03=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion04=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion05=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion06=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion07=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion08=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion09=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion10=false
				String lTagQueryHospitalIncomeBenefitToDoButtonKey='HIB'
				String lTagQueryHospitalIncomeBenefitToDoButtonValue=lQueryHospitalIncomeBenefitToDoItem
				String lLocatorQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				Boolean lIsQueryHospitalIncomeBenefitToDoButtonVisible=false
				String lTagQueryHospitalIncomeBenefitQuestion01ButtonKey='productQuestion-TMQ005'
				String lTagQueryHospitalIncomeBenefitQuestion01ButtonValue=lQueryHospitalIncomeBenefitQuestion01Item
				String lLocatorQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion02ButtonKey='productQuestion-HIR01Q01'
				String lTagQueryHospitalIncomeBenefitQuestion02ButtonValue=lQueryHospitalIncomeBenefitQuestion02Item
				String lLocatorQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion03ButtonKey='productQuestion-HIR01Q03'
				String lTagQueryHospitalIncomeBenefitQuestion03ButtonValue=lQueryHospitalIncomeBenefitQuestion03Item
				String lLocatorQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion04ButtonKey='productQuestion-HIR01Q04'
				String lTagQueryHospitalIncomeBenefitQuestion04ButtonValue=lQueryHospitalIncomeBenefitQuestion04Item
				String lLocatorQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion05ButtonKey='productQuestion-HIR01Q05'
				String lTagQueryHospitalIncomeBenefitQuestion05ButtonValue=lQueryHospitalIncomeBenefitQuestion05Item
				String lLocatorQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion06ButtonKey='productQuestion-HIR01Q06'
				String lTagQueryHospitalIncomeBenefitQuestion06ButtonValue=lQueryHospitalIncomeBenefitQuestion06Item
				String lLocatorQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion07ButtonKey='productQuestion-HIR01Q07'
				String lTagQueryHospitalIncomeBenefitQuestion07ButtonValue=lQueryHospitalIncomeBenefitQuestion07Item
				String lLocatorQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion08ButtonKey='productQuestion-HIR01Q08'
				String lTagQueryHospitalIncomeBenefitQuestion08ButtonValue=lQueryHospitalIncomeBenefitQuestion08Item
				String lLocatorQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion09ButtonKey='productQuestion-HIR01Q09'
				String lTagQueryHospitalIncomeBenefitQuestion09ButtonValue=lQueryHospitalIncomeBenefitQuestion09Item
				String lLocatorQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion10ButtonKey='productQuestion-HIR01Q10'
				String lTagQueryHospitalIncomeBenefitQuestion10ButtonValue=lQueryHospitalIncomeBenefitQuestion10Item
				String lLocatorQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
				String lTagCheckPointNextButton01Key='getQuote'
				String lLocatorCheckPointNextButton01=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton01Key)
				WebElement lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
				Boolean lIsCheckPointNextButton01Visible=false
				lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				if(!lElementQueryHospitalIncomeBenefitToDoButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				}
				if(!lElementQueryHospitalIncomeBenefitToDoButton){
					lIsDoneQueryAll=true
					lIsQueryHospitalIncomeBenefitToDo=false
				}else{
					lIsQueryHospitalIncomeBenefitToDoButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)
					if(!lIsQueryHospitalIncomeBenefitToDoButtonVisible){
						lIsDoneQueryAll=true
						lIsQueryHospitalIncomeBenefitToDo=false
					}else{
						if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)){
							return lreturn
						}
					}
				}
				if(!lIsDoneQueryAll){
					if(lIsQueryHospitalIncomeBenefitToDo){
						if(lElementCheckPointNextButton01){
							lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
							if(lIsCheckPointNextButton01Visible){
								lQueryHospitalIncomeBenefitQuestion01='No Option'
								lQueryHospitalIncomeBenefitQuestion02='No Option'
								lQueryHospitalIncomeBenefitQuestion03='No Option'
								lQueryHospitalIncomeBenefitQuestion04='No Option'
								lQueryHospitalIncomeBenefitQuestion05='No Option'
								lQueryHospitalIncomeBenefitQuestion06='No Option'
								lQueryHospitalIncomeBenefitQuestion07='No Option'
								lQueryHospitalIncomeBenefitQuestion08='No Option'
								lQueryHospitalIncomeBenefitQuestion09='No Option'
								lQueryHospitalIncomeBenefitQuestion10='No Option'
								lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion01Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
										lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
											lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
											lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion01){
											String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion02Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
										lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
											lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
											lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion02){
											String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion03Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
										lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
											lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
											lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion03){
											String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion04Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
										lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
											lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
											lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion04){
											String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion05Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
										lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
											lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
											lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion05){
											String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion06Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
										lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
											lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
											lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion06){
											String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion07Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
										lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
											lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
											lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion07){
											String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion08Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
										lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
											lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
											lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion08){
											String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion09Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
										lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
											lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
											lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion09){
											String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion10Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
										lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
											lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
											lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion10){
											String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
							}
						}
						Boolean lIsFoundNewQuestion=false
						Integer lIndexNoNewQuestionRound=0
						Integer lIndexTry=0
						for(lIndexTry=1;lIndexTry<=15;lIndexTry++){
							lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion01Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
									lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
										lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
										lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion01){
										String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion02Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
									lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
										lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
										lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion02){
										String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion03Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
									lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
										lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
										lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion03){
										String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion04Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
									lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
										lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
										lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion04){
										String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion05Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
									lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
										lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
										lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion05){
										String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion06Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
									lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
										lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
										lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion06){
										String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion07Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
									lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
										lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
										lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion07){
										String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion08Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
									lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
										lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
										lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion08){
										String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion09Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
									lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
										lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
										lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion09){
										String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion10Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
									lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
										lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
										lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion10){
										String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
							if(lElementCheckPointNextButton01){
								lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
								if(lIsCheckPointNextButton01Visible){
									break
								}
							}
							if(lIsFoundNewQuestion){
								lIsFoundNewQuestion=false
								lIndexNoNewQuestionRound=0
							}else{
								lIndexNoNewQuestionRound=lIndexNoNewQuestionRound+1
								if(lIndexNoNewQuestionRound>1){
									break
								}
							}
						}
					}
					lIsDoneQueryAll=true
					if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
						lQueryHospitalIncomeBenefitQuestion01='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion01
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
						lQueryHospitalIncomeBenefitQuestion02='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion02
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
						lQueryHospitalIncomeBenefitQuestion03='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion03
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
						lQueryHospitalIncomeBenefitQuestion04='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion04
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
						lQueryHospitalIncomeBenefitQuestion05='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion05
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
						lQueryHospitalIncomeBenefitQuestion06='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion06
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
						lQueryHospitalIncomeBenefitQuestion07='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion07
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
						lQueryHospitalIncomeBenefitQuestion08='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion08
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
						lQueryHospitalIncomeBenefitQuestion09='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion09
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
						lQueryHospitalIncomeBenefitQuestion10='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion10
					}
				}
				lResult=lIsDoneQueryAll
				if(lResult){
					Boolean lRedirected=false
					Boolean lIsDone=false
					String lTagButtonNext='getQuote'
					String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
					IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
					WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(lElementButtonNext){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
					}
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					String lLocatorResultPage='#illness-packages'
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorResultPage,15)
					lResult=lRedirected
				}
			}
			if(!lHospitalIncomeBenefitPlan.toUpperCase().equalsIgnoreCase('NO OPTION')){
				String lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanList.get(lHospitalIncomeBenefitPlan)
				if(!lHospitalIncomeBenefitPlanItem){
					lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanItemDefaultValue
				}
				String lTagHospitalIncomeBenefitPlanButtonValue=lHospitalIncomeBenefitPlanItem
				String lLocatorHospitalIncomeBenefitPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				WebElement lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				if(!lElementHospitalIncomeBenefitPlanButton){
					String lLocatorHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHospitalIncomeBenefitPlanButtonKey)+'.active'
					WebElement lElementHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHospitalIncomeBenefitPlanActiveButton)
					lElementHospitalIncomeBenefitPlanButton=lElementHospitalIncomeBenefitPlanActiveButton
				}
				if(!lElementHospitalIncomeBenefitPlanButton){
					lHospitalIncomeBenefitPlan='No Option'
				}else{
					lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
					Boolean lIsElementHospitalIncomeBenefitPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton,'active')
					lIsQueryHospitalIncomeBenefitToDo=!IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).equalsIgnoreCase('0')
					if(lIsElementHospitalIncomeBenefitPlanButtonSelected){
						lHospitalIncomeBenefitPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).trim()
					}else{
						lHospitalIncomeBenefitPlan='No Option'
					}
				}
			}
			if(!lIsQueryHospitalIncomeBenefitToDo){
				lQueryHospitalIncomeBenefitQuestion01='No Option'
				lQueryHospitalIncomeBenefitQuestion02='No Option'
				lQueryHospitalIncomeBenefitQuestion03='No Option'
				lQueryHospitalIncomeBenefitQuestion04='No Option'
				lQueryHospitalIncomeBenefitQuestion05='No Option'
				lQueryHospitalIncomeBenefitQuestion06='No Option'
				lQueryHospitalIncomeBenefitQuestion07='No Option'
				lQueryHospitalIncomeBenefitQuestion08='No Option'
				lQueryHospitalIncomeBenefitQuestion09='No Option'
				lQueryHospitalIncomeBenefitQuestion10='No Option'
				lResult=lHospitalIncomeBenefitPlan.length()>0
			}
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
	public Map inputHospitalIncomeBenefitPlanB(String strHospitalIncomeBenefitPlan,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lHospitalIncomeBenefitPlan=strHospitalIncomeBenefitPlan.toUpperCase().trim()
		if(lHospitalIncomeBenefitPlan.length()<=0){
			lHospitalIncomeBenefitPlan=THACancerQuotationResultType.DEFAULT_HOSPITAL_INCOME_BENEFIT_PLAN
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		Map lHospitalIncomeBenefitPlanList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5','7':'6']
		Map lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
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
			String lTagHospitalIncomeBenefitPlanButtonKey='package-HospitalIncomeBenefit'
			String lHospitalIncomeBenefitPlanItemDefault=lHospitalIncomeBenefitPlanList.get(THACancerQuotationResultType.DEFAULT_HOSPITAL_INCOME_BENEFIT_PLAN.toUpperCase())
			String lHospitalIncomeBenefitPlanItemDefaultValue=lHospitalIncomeBenefitPlanItemDefault
			String lLocatorHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
			WebElement lElementHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
			if(!lElementHospitalIncomeBenefitPlanDefaultButton){
				lHospitalIncomeBenefitPlanItemDefaultValue='1'
				lLocatorHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
				lElementHospitalIncomeBenefitPlanDefaultButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lHospitalIncomeBenefitPlanItemDefaultValue)
			}
			Boolean lIsQueryHospitalIncomeBenefitToDo=false
			if(!lElementHospitalIncomeBenefitPlanDefaultButton){
				lHospitalIncomeBenefitPlan='No Option'
			}else{
				String lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanList.get(lHospitalIncomeBenefitPlan)
				if(!lHospitalIncomeBenefitPlanItem){
					lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanItemDefaultValue
				}
				lHospitalIncomeBenefitPlan=''
				String lTagHospitalIncomeBenefitPlanButtonValue=lHospitalIncomeBenefitPlanItem
				String lLocatorHospitalIncomeBenefitPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				WebElement lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				if(!lElementHospitalIncomeBenefitPlanButton){
					String lLocatorHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHospitalIncomeBenefitPlanButtonKey)+'.active'
					WebElement lElementHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHospitalIncomeBenefitPlanActiveButton)
					lElementHospitalIncomeBenefitPlanButton=lElementHospitalIncomeBenefitPlanActiveButton
				}
				if(!lElementHospitalIncomeBenefitPlanButton){
					lHospitalIncomeBenefitPlan='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementHospitalIncomeBenefitPlanButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementHospitalIncomeBenefitPlanButton)
					this.checkPriceChangeToYearlyPayment()
					lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
					Boolean lIsElementHospitalIncomeBenefitPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton,'active')
					lIsQueryHospitalIncomeBenefitToDo=!IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).equalsIgnoreCase('0')
					if(lIsElementHospitalIncomeBenefitPlanButtonSelected){
						lHospitalIncomeBenefitPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).trim()
					}else{
						lHospitalIncomeBenefitPlan='No Option'
					}
				}
			}
			lHospitalIncomeBenefitPlan=lHospitalIncomeBenefitPlan.trim()
			if(lIsQueryHospitalIncomeBenefitToDo){
				String lTagQueryHospitalIncomeBenefitToDoForm='interes-HIB-modal'
				String lLocatorQueryHospitalIncomeBenefitToDoForm=IGNUemaHelper.getTagDataSeleniumKey(lTagQueryHospitalIncomeBenefitToDoForm)
				WebElement lElementQueryHospitalIncomeBenefitToDoForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQueryHospitalIncomeBenefitToDoForm)
				Boolean lIsQueryHospitalIncomeBenefitToDoFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitToDoForm,5)
				lIsQueryHospitalIncomeBenefitToDoFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorQueryHospitalIncomeBenefitToDoForm)
				if(lIsQueryHospitalIncomeBenefitToDoFormDisplayed){
					lElementQueryHospitalIncomeBenefitToDoForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQueryHospitalIncomeBenefitToDoForm)
					if(lElementQueryHospitalIncomeBenefitToDoForm){
						String lTagQueryHospitalIncomeBenefitToDoFormButtonYesKey='interest-hib'
						String lTagQueryHospitalIncomeBenefitToDoFormButtonYesValue='Yes'
						String lLocatorQueryHospitalIncomeBenefitToDoFormButtonYes=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitToDoFormButtonYesKey,lTagQueryHospitalIncomeBenefitToDoFormButtonYesValue)
						WebElement lElementQueryHospitalIncomeBenefitToDoFormButtonYes=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementQueryHospitalIncomeBenefitToDoForm,lTagQueryHospitalIncomeBenefitToDoFormButtonYesKey,lTagQueryHospitalIncomeBenefitToDoFormButtonYesValue)
						if(lElementQueryHospitalIncomeBenefitToDoFormButtonYes){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitToDoFormButtonYes)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitToDoFormButtonYes)
							this.checkPriceChangeToYearlyPayment()
						}else{
							lIsQueryHospitalIncomeBenefitToDo=false
						}
					}else{
						lIsQueryHospitalIncomeBenefitToDo=false
					}
				}else{
					lIsQueryHospitalIncomeBenefitToDo=false
				}
			}
			if(lIsQueryHospitalIncomeBenefitToDo){
				String lQueryHospitalIncomeBenefitToDoItem=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get('1')
				String lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion01)
				if(!lQueryHospitalIncomeBenefitQuestion01Item){
					lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion01=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion01Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion02)
				if(!lQueryHospitalIncomeBenefitQuestion02Item){
					lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion02=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion02Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion03)
				if(!lQueryHospitalIncomeBenefitQuestion03Item){
					lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion03=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion03Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion04)
				if(!lQueryHospitalIncomeBenefitQuestion04Item){
					lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion04=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion04Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion05)
				if(!lQueryHospitalIncomeBenefitQuestion05Item){
					lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion05=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion05Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion06)
				if(!lQueryHospitalIncomeBenefitQuestion06Item){
					lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion06=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion06Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion07)
				if(!lQueryHospitalIncomeBenefitQuestion07Item){
					lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion07=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion07Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion08)
				if(!lQueryHospitalIncomeBenefitQuestion08Item){
					lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion08=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion08Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion09)
				if(!lQueryHospitalIncomeBenefitQuestion09Item){
					lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion09=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion09Item,'YES')
				String lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion10)
				if(!lQueryHospitalIncomeBenefitQuestion10Item){
					lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACancerQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10.toUpperCase())
				}
				lQueryHospitalIncomeBenefitQuestion10=''
				Boolean lIsQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion10Item,'YES')
				Boolean lIsDoneQueryAll=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion01=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion02=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion03=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion04=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion05=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion06=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion07=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion08=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion09=false
				Boolean lIsDoneQueryHospitalIncomeBenefitQuestion10=false
				String lTagQueryHospitalIncomeBenefitToDoButtonKey='HIB'
				String lTagQueryHospitalIncomeBenefitToDoButtonValue=lQueryHospitalIncomeBenefitToDoItem
				String lLocatorQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				Boolean lIsQueryHospitalIncomeBenefitToDoButtonVisible=false
				String lTagQueryHospitalIncomeBenefitQuestion01ButtonKey='productQuestion-TMQ005'
				String lTagQueryHospitalIncomeBenefitQuestion01ButtonValue=lQueryHospitalIncomeBenefitQuestion01Item
				String lLocatorQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion02ButtonKey='productQuestion-HIR01Q01'
				String lTagQueryHospitalIncomeBenefitQuestion02ButtonValue=lQueryHospitalIncomeBenefitQuestion02Item
				String lLocatorQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion03ButtonKey='productQuestion-HIR01Q03'
				String lTagQueryHospitalIncomeBenefitQuestion03ButtonValue=lQueryHospitalIncomeBenefitQuestion03Item
				String lLocatorQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion04ButtonKey='productQuestion-HIR01Q04'
				String lTagQueryHospitalIncomeBenefitQuestion04ButtonValue=lQueryHospitalIncomeBenefitQuestion04Item
				String lLocatorQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion05ButtonKey='productQuestion-HIR01Q05'
				String lTagQueryHospitalIncomeBenefitQuestion05ButtonValue=lQueryHospitalIncomeBenefitQuestion05Item
				String lLocatorQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion06ButtonKey='productQuestion-HIR01Q06'
				String lTagQueryHospitalIncomeBenefitQuestion06ButtonValue=lQueryHospitalIncomeBenefitQuestion06Item
				String lLocatorQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion07ButtonKey='productQuestion-HIR01Q07'
				String lTagQueryHospitalIncomeBenefitQuestion07ButtonValue=lQueryHospitalIncomeBenefitQuestion07Item
				String lLocatorQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion08ButtonKey='productQuestion-HIR01Q08'
				String lTagQueryHospitalIncomeBenefitQuestion08ButtonValue=lQueryHospitalIncomeBenefitQuestion08Item
				String lLocatorQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion09ButtonKey='productQuestion-HIR01Q09'
				String lTagQueryHospitalIncomeBenefitQuestion09ButtonValue=lQueryHospitalIncomeBenefitQuestion09Item
				String lLocatorQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
				String lTagQueryHospitalIncomeBenefitQuestion10ButtonKey='productQuestion-HIR01Q10'
				String lTagQueryHospitalIncomeBenefitQuestion10ButtonValue=lQueryHospitalIncomeBenefitQuestion10Item
				String lLocatorQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
				WebElement lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
				String lTagCheckPointNextButton01Key='getQuote'
				String lLocatorCheckPointNextButton01=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton01Key)
				WebElement lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
				Boolean lIsCheckPointNextButton01Visible=false
				lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				if(!lElementQueryHospitalIncomeBenefitToDoButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
				}
				if(!lElementQueryHospitalIncomeBenefitToDoButton){
					lIsDoneQueryAll=true
					lIsQueryHospitalIncomeBenefitToDo=false
				}else{
					lIsQueryHospitalIncomeBenefitToDoButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)
					if(!lIsQueryHospitalIncomeBenefitToDoButtonVisible){
						lIsDoneQueryAll=true
						lIsQueryHospitalIncomeBenefitToDo=false
					}else{
						if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)){
							return lreturn
						}
					}
				}
				if(!lIsDoneQueryAll){
					if(lIsQueryHospitalIncomeBenefitToDo){
						if(lElementCheckPointNextButton01){
							lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
							if(lIsCheckPointNextButton01Visible){
								lQueryHospitalIncomeBenefitQuestion01='No Option'
								lQueryHospitalIncomeBenefitQuestion02='No Option'
								lQueryHospitalIncomeBenefitQuestion03='No Option'
								lQueryHospitalIncomeBenefitQuestion04='No Option'
								lQueryHospitalIncomeBenefitQuestion05='No Option'
								lQueryHospitalIncomeBenefitQuestion06='No Option'
								lQueryHospitalIncomeBenefitQuestion07='No Option'
								lQueryHospitalIncomeBenefitQuestion08='No Option'
								lQueryHospitalIncomeBenefitQuestion09='No Option'
								lQueryHospitalIncomeBenefitQuestion10='No Option'
								lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion01Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
										lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
											lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
											lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion01){
											String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion02Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
										lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
											lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
											lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion02){
											String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion03Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
										lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
											lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
											lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion03){
											String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion04Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
										lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
											lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
											lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion04){
											String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion05Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
										lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
											lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
											lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion05){
											String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion06Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
										lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
											lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
											lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion06){
											String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion07Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
										lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
											lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
											lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion07){
											String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion08Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
										lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
											lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
											lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion08){
											String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion09Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
										lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
											lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
											lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion09){
											String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
								lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
								if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
									IGNUemaHelper.delayThreadSecond(2)
									lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
								}
								if(lElementQueryHospitalIncomeBenefitQuestion10Button){
									if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
										lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
										if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
											lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
											lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
										}
										if(lIsQueryHospitalIncomeBenefitQuestion10){
											String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
											String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
											if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
												WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
									}
								}
							}
						}
						Boolean lIsFoundNewQuestion=false
						Integer lIndexNoNewQuestionRound=0
						Integer lIndexTry=0
						for(lIndexTry=1;lIndexTry<=15;lIndexTry++){
							lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion01Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
									lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
										lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
										lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion01){
										String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion02Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
									lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
										lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
										lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion02){
										String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion03Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
									lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
										lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
										lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion03){
										String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion04Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
									lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
										lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
										lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion04){
										String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion05Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
									lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
										lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
										lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion05){
										String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion06Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
									lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
										lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
										lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion06){
										String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion07Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
									lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
										lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
										lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion07){
										String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion08Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
									lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
										lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
										lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion08){
										String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion09Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
									lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
										lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
										lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion09){
										String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion10Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
									lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
										lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
										lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
										lIsFoundNewQuestion=true
									}
									if(lIsQueryHospitalIncomeBenefitQuestion10){
										String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
							if(lElementCheckPointNextButton01){
								lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
								if(lIsCheckPointNextButton01Visible){
									break
								}
							}
							if(lIsFoundNewQuestion){
								lIsFoundNewQuestion=false
								lIndexNoNewQuestionRound=0
							}else{
								lIndexNoNewQuestionRound=lIndexNoNewQuestionRound+1
								if(lIndexNoNewQuestionRound>1){
									break
								}
							}
						}
					}
					lIsDoneQueryAll=true
					if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
						lQueryHospitalIncomeBenefitQuestion01='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion01
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
						lQueryHospitalIncomeBenefitQuestion02='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion02
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
						lQueryHospitalIncomeBenefitQuestion03='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion03
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
						lQueryHospitalIncomeBenefitQuestion04='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion04
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
						lQueryHospitalIncomeBenefitQuestion05='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion05
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
						lQueryHospitalIncomeBenefitQuestion06='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion06
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
						lQueryHospitalIncomeBenefitQuestion07='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion07
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
						lQueryHospitalIncomeBenefitQuestion08='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion08
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
						lQueryHospitalIncomeBenefitQuestion09='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion09
					}
					if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
						lQueryHospitalIncomeBenefitQuestion10='No Option'
					}else{
						lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion10
					}
				}
				lResult=lIsDoneQueryAll
				if(lResult){
					Boolean lRedirected=false
					Boolean lIsDone=false
					String lTagButtonNext='getQuote'
					String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
					IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
					WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(lElementButtonNext){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
					}
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					String lLocatorResultPage='#illness-packages'
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorResultPage,15)
					lResult=lRedirected
				}
			}
			if(!lHospitalIncomeBenefitPlan.toUpperCase().equalsIgnoreCase('NO OPTION')){
				String lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanList.get(lHospitalIncomeBenefitPlan)
				if(!lHospitalIncomeBenefitPlanItem){
					lHospitalIncomeBenefitPlanItem=lHospitalIncomeBenefitPlanItemDefaultValue
				}
				String lTagHospitalIncomeBenefitPlanButtonValue=lHospitalIncomeBenefitPlanItem
				String lLocatorHospitalIncomeBenefitPlanButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				WebElement lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
				if(!lElementHospitalIncomeBenefitPlanButton){
					String lLocatorHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHospitalIncomeBenefitPlanButtonKey)+'.active'
					WebElement lElementHospitalIncomeBenefitPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHospitalIncomeBenefitPlanActiveButton)
					lElementHospitalIncomeBenefitPlanButton=lElementHospitalIncomeBenefitPlanActiveButton
				}
				if(!lElementHospitalIncomeBenefitPlanButton){
					lHospitalIncomeBenefitPlan='No Option'
				}else{
					lElementHospitalIncomeBenefitPlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHospitalIncomeBenefitPlanButtonKey,lTagHospitalIncomeBenefitPlanButtonValue)
					Boolean lIsElementHospitalIncomeBenefitPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton,'active')
					lIsQueryHospitalIncomeBenefitToDo=!IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).equalsIgnoreCase('0')
					if(lIsElementHospitalIncomeBenefitPlanButtonSelected){
						lHospitalIncomeBenefitPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementHospitalIncomeBenefitPlanButton).trim()
					}else{
						lHospitalIncomeBenefitPlan='No Option'
					}
				}
			}
			if(!lIsQueryHospitalIncomeBenefitToDo){
				lQueryHospitalIncomeBenefitQuestion01='No Option'
				lQueryHospitalIncomeBenefitQuestion02='No Option'
				lQueryHospitalIncomeBenefitQuestion03='No Option'
				lQueryHospitalIncomeBenefitQuestion04='No Option'
				lQueryHospitalIncomeBenefitQuestion05='No Option'
				lQueryHospitalIncomeBenefitQuestion06='No Option'
				lQueryHospitalIncomeBenefitQuestion07='No Option'
				lQueryHospitalIncomeBenefitQuestion08='No Option'
				lQueryHospitalIncomeBenefitQuestion09='No Option'
				lQueryHospitalIncomeBenefitQuestion10='No Option'
				lResult=lHospitalIncomeBenefitPlan.length()>0
			}
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
	public static final Integer DEFAULT_NUM_QUOTE_ME=1
	public Map inputQuoteMe(String strQuoteBy,String strQuoteCallWithType,String strQuoteCallWithWhen,String strQuoteCallWithTime,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQuoteMeA(strQuoteBy,strQuoteCallWithType,strQuoteCallWithWhen,strQuoteCallWithTime,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'B':
						lreturn=this.inputQuoteMeB(strQuoteBy,strQuoteCallWithType,strQuoteCallWithWhen,strQuoteCallWithTime,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQuoteMeA(strQuoteBy,strQuoteCallWithType,strQuoteCallWithWhen,strQuoteCallWithTime,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeA(String strQuoteBy,String strQuoteCallWithType,String strQuoteCallWithWhen,String strQuoteCallWithTime,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THACancerQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuoteCallWithType=strQuoteCallWithType.toUpperCase().trim()
		if(lQuoteCallWithType.length()<=0){
			lQuoteCallWithType=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TYPE
		}
		String lQuoteCallWithWhen=strQuoteCallWithWhen.toUpperCase().trim()
		if(lQuoteCallWithWhen.length()<=0){
			lQuoteCallWithWhen=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_WHEN
		}
		String lQuoteCallWithTime=strQuoteCallWithTime.toUpperCase().trim()
		if(lQuoteCallWithTime.length()<=0){
			lQuoteCallWithTime=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TIME
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THACancerQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THACancerQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THACancerQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THACancerQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		Map lQuoteByList=['1':'1','2':'2','3':'3']
		Integer lQuoteByDefault=1
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
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			String lQuoteByItem=lQuoteByList.get(lQuoteBy)
			if(!lQuoteByItem){
				lQuoteByItem=lQuoteByList.get(THACancerQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase())
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
						Map lMapQuoteCallWithTypeAndWhenAndTime=this.inputQuoteCallWithTypeAndWhenAndTime(lQuoteCallWithType,lQuoteCallWithWhen,lQuoteCallWithTime,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter)
						if(!lMapQuoteCallWithTypeAndWhenAndTime.Result){
							lQuoteCallWithType=''
							lQuoteCallWithWhen=''
							lQuoteCallWithTime=''
							lQuotePhoneNo=''
							lQuoteEmail=''
							lQuoteNewsletter=''
						}else{
							lQuoteCallWithType=lMapQuoteCallWithTypeAndWhenAndTime.QuoteCallWithType
							lQuoteCallWithWhen=lMapQuoteCallWithTypeAndWhenAndTime.QuoteCallWithWhen
							lQuoteCallWithTime=lMapQuoteCallWithTypeAndWhenAndTime.QuoteCallWithTime
							lQuotePhoneNo=lMapQuoteCallWithTypeAndWhenAndTime.QuotePhoneNo
							lQuoteEmail=lMapQuoteCallWithTypeAndWhenAndTime.QuoteEmail
							lQuoteNewsletter=lMapQuoteCallWithTypeAndWhenAndTime.QuoteNewsletter
						}
						if(!lMapQuoteCallWithTypeAndWhenAndTime.Result){
							return lreturn
						}
						lResult=lMapQuoteCallWithTypeAndWhenAndTime.Result
					}
					break
				case 3:
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
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
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.toUpperCase().contains('CA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
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
	public Map inputQuoteMeB(String strQuoteBy,String strQuoteCallWithType,String strQuoteCallWithWhen,String strQuoteCallWithTime,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THACancerQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuoteCallWithType=strQuoteCallWithType.toUpperCase().trim()
		if(lQuoteCallWithType.length()<=0){
			lQuoteCallWithType=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TYPE
		}
		String lQuoteCallWithWhen=strQuoteCallWithWhen.toUpperCase().trim()
		if(lQuoteCallWithWhen.length()<=0){
			lQuoteCallWithWhen=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_WHEN
		}
		String lQuoteCallWithTime=strQuoteCallWithTime.toUpperCase().trim()
		if(lQuoteCallWithTime.length()<=0){
			lQuoteCallWithTime=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TIME
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THACancerQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THACancerQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THACancerQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THACancerQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		Map lQuoteByList=['1':'1','2':'2','3':'3']
		Integer lQuoteByDefault=1
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
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			String lQuoteByItem=lQuoteByList.get(lQuoteBy)
			if(!lQuoteByItem){
				lQuoteByItem=lQuoteByList.get(THACancerQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase())
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
						Map lMapQuoteCallWithTypeAndWhenAndTime=this.inputQuoteCallWithTypeAndWhenAndTime(lQuoteCallWithType,lQuoteCallWithWhen,lQuoteCallWithTime,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter)
						if(!lMapQuoteCallWithTypeAndWhenAndTime.Result){
							lQuoteCallWithType=''
							lQuoteCallWithWhen=''
							lQuoteCallWithTime=''
							lQuotePhoneNo=''
							lQuoteEmail=''
							lQuoteNewsletter=''
						}else{
							lQuoteCallWithType=lMapQuoteCallWithTypeAndWhenAndTime.QuoteCallWithType
							lQuoteCallWithWhen=lMapQuoteCallWithTypeAndWhenAndTime.QuoteCallWithWhen
							lQuoteCallWithTime=lMapQuoteCallWithTypeAndWhenAndTime.QuoteCallWithTime
							lQuotePhoneNo=lMapQuoteCallWithTypeAndWhenAndTime.QuotePhoneNo
							lQuoteEmail=lMapQuoteCallWithTypeAndWhenAndTime.QuoteEmail
							lQuoteNewsletter=lMapQuoteCallWithTypeAndWhenAndTime.QuoteNewsletter
						}
						if(!lMapQuoteCallWithTypeAndWhenAndTime.Result){
							return lreturn
						}
						lResult=lMapQuoteCallWithTypeAndWhenAndTime.Result
					}
					break
				case 3:
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
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
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.toUpperCase().contains('CA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
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
			lSalesforceProceedTodo=THACancerQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
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
			String lTagCancerPlanActiveButton='package-Cancer'
			String lLocatorCancerPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCancerPlanActiveButton)+'.active'
			WebElement lElementCancerPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCancerPlanActiveButton)
			if(!lElementCancerPlanActiveButton){
				lAutomationCancerPlan='No Option'
			}else{
				Boolean lIsElementCancerPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCancerPlanActiveButton,'active')
				if(lIsElementCancerPlanButtonSelected){
					lAutomationCancerPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCancerPlanActiveButton).trim()
					lAutomationCancerPlan=this.wrapTextToGetAmountValue(lAutomationCancerPlan,'฿',1)
				}else{
					lAutomationCancerPlan='No Option'
				}
			}
			String lTagCovidPlanActiveButton='package-Covid19'
			String lLocatorCovidPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCovidPlanActiveButton)+'.active'
			WebElement lElementCovidPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCovidPlanActiveButton)
			if(!lElementCovidPlanActiveButton){
				lAutomationCovidPlan='No Option'
			}else{
				Boolean lIsElementCovidPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCovidPlanActiveButton,'active')
				if(lIsElementCovidPlanButtonSelected){
					lAutomationCovidPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCovidPlanActiveButton).trim()
					lAutomationCovidPlan=this.wrapTextToGetAmountValue(lAutomationCancerPlan,'฿',1)
				}else{
					lAutomationCovidPlan='No Option'
				}
			}
			String lTagHospitalIncomeBenefitActiveButton='package-HospitalIncomeBenefit'
			String lLocatorHospitalIncomeBenefitActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHospitalIncomeBenefitActiveButton)+'.active'
			WebElement lElementHospitalIncomeBenefitActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHospitalIncomeBenefitActiveButton)
			if(!lElementHospitalIncomeBenefitActiveButton){
				lAutomationHospitalIncomeBenefitPlan='No Option'
			}else{
				Boolean lIsElementHospitalIncomeBenefitButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementHospitalIncomeBenefitActiveButton,'active')
				if(lIsElementHospitalIncomeBenefitButtonSelected){
					lAutomationHospitalIncomeBenefitPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementHospitalIncomeBenefitActiveButton).trim()
					lAutomationHospitalIncomeBenefitPlan=this.wrapTextToGetAmountValue(lAutomationHospitalIncomeBenefitPlan,'฿',2)
				}else{
					lAutomationHospitalIncomeBenefitPlan='No Option'
				}
			}
			String lTagQueryHospitalIncomeBenefitToDoButton='HIB'
			String lLocatorQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getTagDataSeleniumKey(lTagQueryHospitalIncomeBenefitToDoButton)
			WebElement lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQueryHospitalIncomeBenefitToDoButton)
			if(!lElementQueryHospitalIncomeBenefitToDoButton){
				lAutomationQueryHospitalIncomeBenefitQuestion01='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion02='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion03='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion04='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion05='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion06='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion07='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion08='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion09='No Option'
				lAutomationQueryHospitalIncomeBenefitQuestion10='No Option'
			}else{
				lAutomationQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-TMQ005'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion01.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion01='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q01'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion02.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion02='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q03'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion03.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion03='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q04'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion04.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion04='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q05'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion05.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion05='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q06'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion06.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion06='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q07'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion07.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion07='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q08'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion08.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion08='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q09'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion09.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion09='No Option'
				}
				lAutomationQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q10'))
				if(lAutomationQueryHospitalIncomeBenefitQuestion10.length()<=0){
					lAutomationQueryHospitalIncomeBenefitQuestion10='No Option'
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
			this.checkPaymentOptionCancerSwitch()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
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
			String lTagCancerPlanActiveButton='package-Cancer'
			String lLocatorCancerPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCancerPlanActiveButton)+'.active'
			WebElement lElementCancerPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCancerPlanActiveButton)
			if(!lElementCancerPlanActiveButton){
				lSalesforceRetrieveDataCancerPlan='No Option'
			}else{
				Boolean lIsElementCancerPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCancerPlanActiveButton,'active')
				if(lIsElementCancerPlanButtonSelected){
					lSalesforceRetrieveDataCancerPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCancerPlanActiveButton).trim()
					lSalesforceRetrieveDataCancerPlan=this.wrapTextToGetAmountValue(lSalesforceRetrieveDataCancerPlan,'฿',1)
				}else{
					lSalesforceRetrieveDataCancerPlan='No Option'
				}
			}
			String lTagCovidPlanActiveButton='package-Covid19'
			String lLocatorCovidPlanActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCovidPlanActiveButton)+'.active'
			WebElement lElementCovidPlanActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCovidPlanActiveButton)
			if(!lElementCovidPlanActiveButton){
				lSalesforceRetrieveDataCovidPlan='No Option'
			}else{
				Boolean lIsElementCovidPlanButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementCovidPlanActiveButton,'active')
				if(lIsElementCovidPlanButtonSelected){
					lSalesforceRetrieveDataCovidPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCovidPlanActiveButton).trim()
					lSalesforceRetrieveDataCovidPlan=this.wrapTextToGetAmountValue(lSalesforceRetrieveDataCancerPlan,'฿',1)
				}else{
					lSalesforceRetrieveDataCovidPlan='No Option'
				}
			}
			String lTagHospitalIncomeBenefitActiveButton='package-HospitalIncomeBenefit'
			String lLocatorHospitalIncomeBenefitActiveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHospitalIncomeBenefitActiveButton)+'.active'
			WebElement lElementHospitalIncomeBenefitActiveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHospitalIncomeBenefitActiveButton)
			if(!lElementHospitalIncomeBenefitActiveButton){
				lSalesforceRetrieveDataHospitalIncomeBenefitPlan='No Option'
			}else{
				Boolean lIsElementHospitalIncomeBenefitButtonSelected=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementHospitalIncomeBenefitActiveButton,'active')
				if(lIsElementHospitalIncomeBenefitButtonSelected){
					lSalesforceRetrieveDataHospitalIncomeBenefitPlan=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementHospitalIncomeBenefitActiveButton).trim()
					lSalesforceRetrieveDataHospitalIncomeBenefitPlan=this.wrapTextToGetAmountValue(lSalesforceRetrieveDataHospitalIncomeBenefitPlan,'฿',2)
				}else{
					lSalesforceRetrieveDataHospitalIncomeBenefitPlan='No Option'
				}
			}
			String lTagQueryHospitalIncomeBenefitToDoButton='HIB'
			String lLocatorQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getTagDataSeleniumKey(lTagQueryHospitalIncomeBenefitToDoButton)
			WebElement lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQueryHospitalIncomeBenefitToDoButton)
			if(!lElementQueryHospitalIncomeBenefitToDoButton){
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09='No Option'
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10='No Option'
			}else{
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-TMQ005'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q01'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q03'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q04'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q05'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q06'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q07'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q08'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q09'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09='No Option'
				}
				lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButton,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'productQuestion-HIR01Q10'))
				if(lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10.length()<=0){
					lSalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10='No Option'
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
			this.checkPaymentOptionCancerSwitch()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
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
			for(Integer lIndex=0;lIndex<=5;lIndex++){
				Integer lItemIndex=lIndex+1
				String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
				String lQuoteLineItem=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverCodeC')
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'CANCER')){
					String lAutomationCancerPlan=caseOutput.AutomationCancerPlan
					String lSalesforceCancerPlan=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSumAssuredC')
					Float lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationCancerPlan,0)
					Float lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforceCancerPlan,0)
					Float lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
					if(lPrice>1){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('CancerPlan='+lAutomationCancerPlan,lSalesforceCancerPlan)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'HIB')){
					String lAutomationHospitalIncomeBenefitPlan=caseOutput.AutomationHospitalIncomeBenefitPlan
					String lSalesforceHospitalIncomeBenefitPlan=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured1C')
					Float lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationHospitalIncomeBenefitPlan,0)
					Float lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforceHospitalIncomeBenefitPlan,0)
					Float lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
					if(lPrice>1){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('HospitalIncomeBenefitPlan='+lAutomationHospitalIncomeBenefitPlan,lSalesforceHospitalIncomeBenefitPlan)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'COVID')){
					String lAutomationCovidPlan=caseOutput.AutomationCovidPlan
					String lSalesforceCovidPlan=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSumAssuredC')
					Float lAutomationPrice=IGNUemaHelper.convertStringToFloat(lAutomationCovidPlan,0)
					Float lSalesforcePrice=IGNUemaHelper.convertStringToFloat(lSalesforceCovidPlan,0)
					Float lPrice=Math.abs(lAutomationPrice-lSalesforcePrice)
					if(lPrice>1){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('CancerPlan='+lAutomationCovidPlan,lSalesforceCovidPlan)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
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
			String lAutomationCancerPlan=caseOutput.AutomationCancerPlan
			String lSalesforceCancerPlan=caseOutput.SalesforceRetrieveDataCancerPlan
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCancerPlan,lSalesforceCancerPlan)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('CancerPlan='+lAutomationCancerPlan,lSalesforceCancerPlan)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationCovidPlan=caseOutput.AutomationCovidPlan
			String lSalesforceCovidPlan=caseOutput.SalesforceRetrieveDataCovidPlan
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCovidPlan,lSalesforceCovidPlan)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('CovidPlan='+lAutomationCovidPlan,lSalesforceCovidPlan)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationHospitalIncomeBenefitPlan=caseOutput.AutomationHospitalIncomeBenefitPlan
			String lSalesforceHospitalIncomeBenefitPlan=caseOutput.SalesforceRetrieveDataHospitalIncomeBenefitPlan
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationHospitalIncomeBenefitPlan,lSalesforceHospitalIncomeBenefitPlan)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('HospitalIncomeBenefitPlan='+lAutomationHospitalIncomeBenefitPlan,lSalesforceHospitalIncomeBenefitPlan)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion01=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion01
			String lSalesforceQueryHospitalIncomeBenefitQuestion01=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion01
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion01,lSalesforceQueryHospitalIncomeBenefitQuestion01)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion01='+lAutomationQueryHospitalIncomeBenefitQuestion01,lSalesforceQueryHospitalIncomeBenefitQuestion01)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion02=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion02
			String lSalesforceQueryHospitalIncomeBenefitQuestion02=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion02
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion02,lSalesforceQueryHospitalIncomeBenefitQuestion02)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion02='+lAutomationQueryHospitalIncomeBenefitQuestion02,lSalesforceQueryHospitalIncomeBenefitQuestion02)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion03=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion03
			String lSalesforceQueryHospitalIncomeBenefitQuestion03=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion03
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion03,lSalesforceQueryHospitalIncomeBenefitQuestion03)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion03='+lAutomationQueryHospitalIncomeBenefitQuestion03,lSalesforceQueryHospitalIncomeBenefitQuestion03)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion04=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion04
			String lSalesforceQueryHospitalIncomeBenefitQuestion04=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion04
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion04,lSalesforceQueryHospitalIncomeBenefitQuestion04)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion04='+lAutomationQueryHospitalIncomeBenefitQuestion04,lSalesforceQueryHospitalIncomeBenefitQuestion04)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion05=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion05
			String lSalesforceQueryHospitalIncomeBenefitQuestion05=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion05
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion05,lSalesforceQueryHospitalIncomeBenefitQuestion05)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion05='+lAutomationQueryHospitalIncomeBenefitQuestion05,lSalesforceQueryHospitalIncomeBenefitQuestion05)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion06=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion06
			String lSalesforceQueryHospitalIncomeBenefitQuestion06=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion06
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion06,lSalesforceQueryHospitalIncomeBenefitQuestion06)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion06='+lAutomationQueryHospitalIncomeBenefitQuestion06,lSalesforceQueryHospitalIncomeBenefitQuestion06)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion07=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion07
			String lSalesforceQueryHospitalIncomeBenefitQuestion07=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion07
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion07,lSalesforceQueryHospitalIncomeBenefitQuestion07)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion07='+lAutomationQueryHospitalIncomeBenefitQuestion07,lSalesforceQueryHospitalIncomeBenefitQuestion07)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion08=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion08
			String lSalesforceQueryHospitalIncomeBenefitQuestion08=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion08
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion08,lSalesforceQueryHospitalIncomeBenefitQuestion08)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion08='+lAutomationQueryHospitalIncomeBenefitQuestion08,lSalesforceQueryHospitalIncomeBenefitQuestion08)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion09=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion09
			String lSalesforceQueryHospitalIncomeBenefitQuestion09=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion09
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion09,lSalesforceQueryHospitalIncomeBenefitQuestion09)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion09='+lAutomationQueryHospitalIncomeBenefitQuestion09,lSalesforceQueryHospitalIncomeBenefitQuestion09)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationQueryHospitalIncomeBenefitQuestion10=caseOutput.AutomationQueryHospitalIncomeBenefitQuestion10
			String lSalesforceQueryHospitalIncomeBenefitQuestion10=caseOutput.SalesforceRetrieveDataQueryHospitalIncomeBenefitQuestion10
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationQueryHospitalIncomeBenefitQuestion10,lSalesforceQueryHospitalIncomeBenefitQuestion10)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('QueryHospitalIncomeBenefitQuestion10='+lAutomationQueryHospitalIncomeBenefitQuestion10,lSalesforceQueryHospitalIncomeBenefitQuestion10)
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
			lSalesforceProceedRetrieveTodo=THACancerQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
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
				String lLocatorResultPage='#illness-packages'
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
			THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
			if(!lIsOK){
				return lreturn
			}
			this.checkPaymentOptionCancerSwitch()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
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
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionCancerSwitchButtonDisabled){
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
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
						Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
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
			THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
			if(!lIsOK){
				return lreturn
			}
			this.checkPaymentOptionCancerSwitch()
			this.checkPriceChangeToYearlyPayment()
			String lTagPaymentOptionCancerSwitchButton='paymentOptions-Cancer'
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
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionCancerSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionCancerSwitchButton)
			if(!lElementPaymentOptionCancerSwitchButton){
				return lreturn
			}
			lIsPaymentOptionCancerSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionCancerSwitchButton,'disabled')
			lIsPaymentOptionCancerSwitchButtonAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionCancerSwitchButton).toUpperCase().contains('YEARLY')
			if(lIsPaymentOptionCancerSwitchButtonDisabled){
				lPremiumDeposit='No Option'
				lPremiumMonthly='No Option'
				lPremiumInstalment='No Option'
				lPremiumNoDepositAmount='No Option'
				lPremiumNoDepositTotal='No Option'
				lPremiumQuarterlyAmount='No Option'
				lPremiumQuarterlyTotal='No Option'
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
						Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'illness-policydetail',30)
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
				THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
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
	public Map inputQuoteCallWithTypeAndWhenAndTime(String strQuoteCallWithType,String strQuoteCallWithWhen,String strQuoteCallWithTime,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter){
		Map lreturn=[:]
		String lQuoteCallWithType=strQuoteCallWithType.trim()
		if(lQuoteCallWithType.length()<=0){
			lQuoteCallWithType=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TYPE
		}
		String lQuoteCallWithWhen=strQuoteCallWithWhen.trim()
		if(lQuoteCallWithWhen.length()<=0){
			lQuoteCallWithWhen=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_WHEN
		}
		String lQuoteCallWithTime=strQuoteCallWithTime.trim()
		if(lQuoteCallWithTime.length()<=0){
			lQuoteCallWithTime=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TIME
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THACancerQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THACancerQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THACancerQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		try{
			Boolean lResult=false
			lreturn.put('QuoteCallWithType','')
			lreturn.put('QuoteCallWithWhen','')
			lreturn.put('QuoteCallWithTime','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('Result',lResult)
			Boolean lIsCallMeNow=false
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
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
			Map lMapInputQuoteCallWithType=this.inputQuoteCallWithType(lQuoteCallWithType)
			if(!lMapInputQuoteCallWithType.Result){
				lQuoteCallWithType=''
			}else{
				lQuoteCallWithType=lMapInputQuoteCallWithType.QuoteCallWithType
				lIsCallMeNow=lMapInputQuoteCallWithType.IsCallMeNow
			}
			if(!lMapInputQuoteCallWithType.Result){
				return lreturn
			}
			if(!lIsCallMeNow){
				Map lMapInputQuoteCallWithWhen=this.inputQuoteCallWithWhen(lQuoteCallWithWhen)
				if(!lMapInputQuoteCallWithWhen.Result){
					lQuoteCallWithWhen=''
				}else{
					lQuoteCallWithWhen=lMapInputQuoteCallWithWhen.QuoteCallWithWhen
				}
				if(!lMapInputQuoteCallWithWhen.Result){
					return lreturn
				}
				Map lMapInputQuoteCallWithTime=this.inputQuoteCallWithTime(lQuoteCallWithTime)
				if(!lMapInputQuoteCallWithTime.Result){
					lQuoteCallWithTime=''
				}else{
					lQuoteCallWithTime=lMapInputQuoteCallWithTime.QuoteCallWithTime
				}
				if(!lMapInputQuoteCallWithTime.Result){
					return lreturn
				}
			}else{
				lQuoteCallWithWhen=''
				lQuoteCallWithTime=''
			}
			lResult=true
			if(lResult){
				lreturn.put('QuoteCallWithType',lQuoteCallWithType)
				lreturn.put('QuoteCallWithWhen',lQuoteCallWithWhen)
				lreturn.put('QuoteCallWithTime',lQuoteCallWithTime)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteCallWithType(String strQuoteCallWithType){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			Boolean lIsCallMeNow=false
			lreturn.put('QuoteCallWithType','')
			lreturn.put('IsCallMeNow',lIsCallMeNow)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQuoteCallWithTypeA(strQuoteCallWithType)
						break
					case 'B':
						lreturn=this.inputQuoteCallWithTypeA(strQuoteCallWithType)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQuoteCallWithTypeA(strQuoteCallWithType)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteCallWithTypeA(String strQuoteCallWithType){
		Map lreturn=[:]
		String lQuoteCallWithType=strQuoteCallWithType.trim()
		if(lQuoteCallWithType.length()<=0){
			lQuoteCallWithType=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TYPE
		}
		Map lQuoteCallWithTypeList=['1':'callme-now','2':'callme-scheduled']
		try{
			Boolean lResult=false
			Boolean lIsCallMeNow=false
			lreturn.put('QuoteCallWithType','')
			lreturn.put('IsCallMeNow',lIsCallMeNow)
			lreturn.put('Result',lResult)
			String lQuoteCallWithTypeItem=lQuoteCallWithTypeList.get(lQuoteCallWithType)
			lQuoteCallWithType=''
			if(!lQuoteCallWithTypeItem){
				lQuoteCallWithTypeItem=lQuoteCallWithTypeList.get(THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TYPE)
			}
			String lTagQuoteCallWithType=lQuoteCallWithTypeItem
			String lLocatorQuoteCallWithType=IGNUemaHelper.getTagDataSeleniumKey(lTagQuoteCallWithType)
			WebElement lElementQuoteCallWithType=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuoteCallWithType)
			if(!lElementQuoteCallWithType){
				lQuoteCallWithTypeItem=lQuoteCallWithTypeList.get('2')
				lTagQuoteCallWithType=lQuoteCallWithTypeItem
				lLocatorQuoteCallWithType=IGNUemaHelper.getTagDataSeleniumKey(lTagQuoteCallWithType)
				lElementQuoteCallWithType=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuoteCallWithType)
			}
			if(!lElementQuoteCallWithType){
				lQuoteCallWithType=''
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQuoteCallWithType)){
					lQuoteCallWithType=lQuoteCallWithTypeItem
				}else{
					lQuoteCallWithType=''
				}
			}
			if(IGNUemaHelper.checkStringContainString(lQuoteCallWithType,'callme-now')){
				lIsCallMeNow=true
				IGNUemaHelper.delayThreadSecond(5)
				String lTagButtonCallMeBackCloseButton='callmeback-close'
				String lLocatorButtonCallMeBackCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackCloseButton)
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackCloseButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
			}
			lResult=lQuoteCallWithType.length()>0
			if(lResult){
				lreturn.put('QuoteCallWithType',lQuoteCallWithType)
				lreturn.put('IsCallMeNow',lIsCallMeNow)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteCallWithWhen(String strQuoteCallWithWhen){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('QuoteCallWithWhen','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQuoteCallWithWhenA(strQuoteCallWithWhen)
						break
					case 'B':
						lreturn=this.inputQuoteCallWithWhenA(strQuoteCallWithWhen)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQuoteCallWithWhenA(strQuoteCallWithWhen)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteCallWithWhenA(String strQuoteCallWithWhen){
		Map lreturn=[:]
		String lQuoteCallWithWhen=strQuoteCallWithWhen.trim()
		if(lQuoteCallWithWhen.length()<=0){
			lQuoteCallWithWhen=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_WHEN
		}
		Map lQuoteCallWithWhenList=['1':'Today','2':'nextWorkingDay']
		try{
			Boolean lResult=false
			lreturn.put('QuoteCallWithWhen','')
			lreturn.put('Result',lResult)
			String lQuoteCallWithWhenItem=lQuoteCallWithWhenList.get(lQuoteCallWithWhen)
			lQuoteCallWithWhen=''
			if(!lQuoteCallWithWhenItem){
				lQuoteCallWithWhenItem=lQuoteCallWithWhenList.get(THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_WHEN)
			}
			String lTagQuoteCallWithWhen='schedule-today'
			String lLocatorQuoteCallWithWhen=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQuoteCallWithWhen,lQuoteCallWithWhenItem)
			WebElement lElementQuoteCallWithWhen=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQuoteCallWithWhen,lQuoteCallWithWhenItem)
			if(!lElementQuoteCallWithWhen){
				lQuoteCallWithWhenItem=lQuoteCallWithWhenList.get('2')
				lLocatorQuoteCallWithWhen=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQuoteCallWithWhen,lQuoteCallWithWhenItem)
				lElementQuoteCallWithWhen=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQuoteCallWithWhen,lQuoteCallWithWhenItem)
			}
			if(!lElementQuoteCallWithWhen){
				lQuoteCallWithWhen=''
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQuoteCallWithWhen)){
					lQuoteCallWithWhen=lQuoteCallWithWhenItem
				}else{
					lQuoteCallWithWhen=''
				}
			}
			lResult=lQuoteCallWithWhen.length()>0
			if(lResult){
				lreturn.put('QuoteCallWithWhen',lQuoteCallWithWhen)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteCallWithTime(String strQuoteCallWithTime){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('QuoteCallWithTime','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQuoteCallWithTimeA(strQuoteCallWithTime)
						break
					case 'B':
						lreturn=this.inputQuoteCallWithTimeA(strQuoteCallWithTime)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQuoteCallWithTimeA(strQuoteCallWithTime)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteCallWithTimeA(String strQuoteCallWithTime){
		Map lreturn=[:]
		String lQuoteCallWithTime=strQuoteCallWithTime.trim()
		if(lQuoteCallWithTime.length()<=0){
			lQuoteCallWithTime=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TIME
		}
		Map lQuoteCallWithTimeList=['1':'9.00','2':'12.00','3':'14.00']
		try{
			Boolean lResult=false
			lreturn.put('QuoteCallWithTime','')
			lreturn.put('Result',lResult)
			String lQuoteCallWithTimeItem=lQuoteCallWithTimeList.get(lQuoteCallWithTime)
			lQuoteCallWithTime=''
			if(!lQuoteCallWithTimeItem){
				lQuoteCallWithTimeItem=THACancerQuotationResultType.DEFAULT_QUOTE_CALL_WITH_TIME
			}
			String lTagQuoteCallWithTime='schedule-slot'
			String lLocatorQuoteCallWithTime=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQuoteCallWithTime,lQuoteCallWithTimeItem)
			WebElement lElementQuoteCallWithTime=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQuoteCallWithTime,lQuoteCallWithTimeItem)
			List<WebElement> lElementQuoteCallWithTimeList=null
			Boolean lIsQuoteCallWithTimeDisabled=true
			if(!IGNUemaHelper.checkStringContainString(lQuoteCallWithTimeItem,'RANDOM')){
				lIsQuoteCallWithTimeDisabled=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementQuoteCallWithTime,'disabled')
			}
			if(lIsQuoteCallWithTimeDisabled){
				for(Integer lIndex=1;lIndex<=10;lIndex++){
					lElementQuoteCallWithTimeList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagQuoteCallWithTime)
					lElementQuoteCallWithTime=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementQuoteCallWithTimeList)
					lIsQuoteCallWithTimeDisabled=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementQuoteCallWithTime,'disabled')
					if(!lIsQuoteCallWithTimeDisabled){
						lQuoteCallWithTimeItem=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementQuoteCallWithTime).trim()
						break
					}
				}
			}
			if(lIsQuoteCallWithTimeDisabled){
				lQuoteCallWithTime=''
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQuoteCallWithTime)){
					lQuoteCallWithTime=lQuoteCallWithTimeItem
				}else{
					lQuoteCallWithTime=''
				}
			}
			lResult=lQuoteCallWithTime.length()>0
			String lTagButtonUnderstand='callme-scheduled'
			String lLocatorButtonUnderstand=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonUnderstand)
			Boolean lIsSelectedButton=IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonUnderstand)
			lResult=lIsSelectedButton
			if(lResult){
				lreturn.put('QuoteCallWithTime',lQuoteCallWithTime)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}