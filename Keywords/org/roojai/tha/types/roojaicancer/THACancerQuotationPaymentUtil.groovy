package org.roojai.tha.types.roojaicancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THACancerQuotationPaymentUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private lIsIBSuccessCase=false
	public THACancerQuotationPaymentUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean inputPayment(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lPaymentMethod=caseInput.PaymentMethod.toString().trim()
		String lCcIsYearly=caseInput.CcIsYearly.toString().trim()
		String lCcIsInstalment=caseInput.CcIsInstalment.toString().trim()
		String lCcNumber=caseInput.CcNumber.toString().trim()
		String lCcName=caseInput.CcName.toString().trim()
		String lCcExpiryMonth=caseInput.CcExpiryMonth.toString().trim()
		String lCcExpiryYear=caseInput.CcExpiryYear.toString().trim()
		String lCcCvv=caseInput.CcCvv.toString().trim()
		String lCcBank=caseInput.CcBank.toString().trim()
		String lCcSuccessCase=caseInput.CcSuccessCase.toString().trim()
		String lIbBank=caseInput.IbBank.toString().trim()
		String lIbSuccessCase=caseInput.IbSuccessCase.toString().trim()
		String lTrueMoneyIsYearly=caseInput.TrueMoneyIsYearly.toString().trim()
		String lTrueMoneyInstalment=caseInput.TrueMoneyInstalment.toString().trim()
		String lTrueMoneyMobileNo=caseInput.TrueMoneyMobileNo.toString().trim()
		String lTrueMoneyEmail=caseInput.TrueMoneyEmail.toString().trim()
		String lTrueMoneySuccessCase=caseInput.TrueMoneySuccessCase.toString().trim()
		String lRabbitLinePayIsYearly=caseInput.RabbitLinePayIsYearly.toString().trim()
		String lRabbitLinePayInstalment=caseInput.RabbitLinePayInstalment.toString().trim()
		String lRabbitLinePayMobileNo=caseInput.RabbitLinePayMobileNo.toString().trim()
		String lRabbitLinePayEmail=caseInput.RabbitLinePayEmail.toString().trim()
		String lRabbitLinePaySuccessCase=caseInput.RabbitLinePaySuccessCase.toString().trim()
		String lMobileBankingIsYearly=caseInput.MobileBankingIsYearly.toString().trim()
		String lMobileBankingInstalment=caseInput.MobileBankingInstalment.toString().trim()
		String lMobileBankingCard=caseInput.MobileBankingCard.toString().trim()
		String lMobileBankingSuccessCase=caseInput.MobileBankingSuccessCase.toString().trim()
		String lPaymentAutoRenew=caseInput.PaymentAutoRenew.toString().trim()
		String lPaymentTaxDeduction=caseInput.PaymentTaxDeduction.toString().trim()
		String lPaymentEPolicy=caseInput.PaymentEPolicy.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lOpportunityNumber=''
		String lCcAmtYearly=''
		String lCcAmtDeposit=''
		String lCcAmtMonthly=''
		String lCcAmtInstalment=''
		String lCcAmtNoDepositAmount=''
		String lCcAmtNoDepositTotal=''
		String lCcAmtQuarterlyAmount=''
		String lCcAmtQuarterlyTotal=''
		String lIbAmtYearly=''
		String lQrAmtYearly=''
		String lTrueMoneyAmtYearly=''
		String lTrueMoneyAmtDeposit=''
		String lTrueMoneyAmtMonthly=''
		String lTrueMoneyAmtInstalment=''
		String lTrueMoneyAmtNoDepositFirstAmount=''
		String lTrueMoneyAmtNoDepositAmount=''
		String lTrueMoneyAmtNoDepositTotal=''
		String lTrueMoneyAmtQuarterlyFirstAmount=''
		String lTrueMoneyAmtQuarterlyAmount=''
		String lTrueMoneyAmtQuarterlyTotal=''
		String lRabbitLinePayAmtYearly=''
		String lRabbitLinePayAmtDeposit=''
		String lRabbitLinePayAmtMonthly=''
		String lRabbitLinePayAmtInstalment=''
		String lRabbitLinePayAmtNoDepositFirstAmount=''
		String lRabbitLinePayAmtNoDepositAmount=''
		String lRabbitLinePayAmtNoDepositTotal=''
		String lRabbitLinePayAmtQuarterlyFirstAmount=''
		String lRabbitLinePayAmtQuarterlyAmount=''
		String lRabbitLinePayAmtQuarterlyTotal=''
		String lMobileBankingAmtYearly=''
		String lMobileBankingAmtDeposit=''
		String lMobileBankingAmtMonthly=''
		String lMobileBankingAmtInstalment=''
		String lMobileBankingAmtNoDepositFirstAmount=''
		String lMobileBankingAmtNoDepositAmount=''
		String lMobileBankingAmtNoDepositTotal=''
		String lMobileBankingAmtQuarterlyFirstAmount=''
		String lMobileBankingAmtQuarterlyAmount=''
		String lMobileBankingAmtQuarterlyTotal=''
		String lPolicyInsurer=''
		String lAutomationOpportunityNumber=''
		String lAutomationPremiumYearly=''
		String lAutomationPremiumDeposit=''
		String lAutomationPremiumMonthly=''
		String lAutomationPremiumInstalment=''
		String lAutomationPremiumNoDepositAmount=''
		String lAutomationPremiumNoDepositTotal=''
		String lAutomationPremiumQuarterlyAmount=''
		String lAutomationPremiumQuarterlyTotal=''
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
			this.waitUntilOpportunityNumberUpdated()
			Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
			if(!lMapAutomationDataBefore.Result){
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
			Boolean lIsActualResult=false
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
					Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT)
					lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
					if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
						return lreturn
					}
					Map lMapAutomationDataAfter=this.inputAutomationDataAfter()
					if(!lMapAutomationDataAfter.Result){
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
			Map lMapOpportunityNumber=this.inputOpportunityNumber()
			if(!lMapOpportunityNumber.Result){
				lOpportunityNumber=''
			}else{
				lOpportunityNumber=lMapOpportunityNumber.OpportunityNumber
			}
			caseOutput.OpportunityNumber=lOpportunityNumber
			if(lOpportunityNumber.length()<=0){
				return lreturn
			}
			Map lMapPaymentMethod=this.inputPaymentMethod(lPaymentMethod)
			if(!lMapPaymentMethod.Result){
				lPaymentMethod=''
			}else{
				lPaymentMethod=lMapPaymentMethod.PaymentMethod
			}
			caseOutput.PaymentMethod=lPaymentMethod
			if(lPaymentMethod.length()<=0){
				return lreturn
			}
			switch(lPaymentMethod){
				case '2':
					Map lMapPaymentByIB=this.inputPaymentByIB(lIbBank,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lIbSuccessCase)
					if(!lMapPaymentByIB.Result){
						lIbBank=''
						lPaymentAutoRenew=''
						lPaymentTaxDeduction=''
						lPaymentEPolicy=''
						lIbSuccessCase=''
						lIbAmtYearly=''
					}else{
						lIbBank=lMapPaymentByIB.IbBank
						lPaymentAutoRenew=lMapPaymentByIB.PaymentAutoRenew
						lPaymentTaxDeduction=lMapPaymentByIB.PaymentTaxDeduction
						lPaymentEPolicy=lMapPaymentByIB.PaymentEPolicy
						lIbSuccessCase=lMapPaymentByIB.IbSuccessCase
						lIbAmtYearly=lMapPaymentByIB.IbAmtYearly
					}
					caseOutput.IbBank=lIbBank
					caseOutput.PaymentAutoRenew=lPaymentAutoRenew
					caseOutput.PaymentTaxDeduction=lPaymentTaxDeduction
					caseOutput.PaymentEPolicy=lPaymentEPolicy
					caseOutput.IbSuccessCase=lIbSuccessCase
					caseOutput.IbAmtYearly=lIbAmtYearly
					if(!lMapPaymentByIB.Result){
						return lreturn
					}
					break
				case '3':
					Map lMapPaymentByQR=this.inputPaymentByQR(lPaymentTaxDeduction,lPaymentEPolicy)
					if(!lMapPaymentByQR.Result){
						lPaymentTaxDeduction=''
						lPaymentEPolicy=''
						lQrAmtYearly=''
					}else{
						lPaymentTaxDeduction=lMapPaymentByQR.PaymentTaxDeduction
						lPaymentEPolicy=lMapPaymentByQR.PaymentEPolicy
						lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
					}
					caseOutput.PaymentTaxDeduction=lPaymentTaxDeduction
					caseOutput.PaymentEPolicy=lPaymentEPolicy
					caseOutput.QrAmtYearly=lQrAmtYearly
					if(!lMapPaymentByQR.Result){
						return lreturn
					}
					break
				case '4':
					Map lMapPaymentByTrueMoney=this.inputPaymentByTrueMoney(lTrueMoneyIsYearly,lTrueMoneyInstalment,lTrueMoneyMobileNo,lTrueMoneyEmail,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lTrueMoneySuccessCase)
					if(!lMapPaymentByTrueMoney.Result){
						lTrueMoneyIsYearly=''
						lTrueMoneyInstalment=''
						lTrueMoneyMobileNo=''
						lTrueMoneyEmail=''
						lPaymentAutoRenew=''
						lPaymentTaxDeduction=''
						lPaymentEPolicy=''
						lTrueMoneySuccessCase=''
						lTrueMoneyAmtYearly=''
						lTrueMoneyAmtDeposit=''
						lTrueMoneyAmtMonthly=''
						lTrueMoneyAmtInstalment=''
						lTrueMoneyAmtNoDepositFirstAmount=''
						lTrueMoneyAmtNoDepositAmount=''
						lTrueMoneyAmtNoDepositTotal=''
						lTrueMoneyAmtQuarterlyFirstAmount=''
						lTrueMoneyAmtQuarterlyAmount=''
						lTrueMoneyAmtQuarterlyTotal=''
					}else{
						lTrueMoneyIsYearly=lMapPaymentByTrueMoney.TrueMoneyIsYearly
						lTrueMoneyInstalment=lMapPaymentByTrueMoney.TrueMoneyInstalment
						lTrueMoneyMobileNo=lMapPaymentByTrueMoney.TrueMoneyMobileNo
						lTrueMoneyEmail=lMapPaymentByTrueMoney.TrueMoneyEmail
						lPaymentAutoRenew=lMapPaymentByTrueMoney.PaymentAutoRenew
						lPaymentTaxDeduction=lMapPaymentByTrueMoney.PaymentTaxDeduction
						lPaymentEPolicy=lMapPaymentByTrueMoney.PaymentEPolicy
						lTrueMoneySuccessCase=lMapPaymentByTrueMoney.TrueMoneySuccessCase
						lTrueMoneyAmtYearly=lMapPaymentByTrueMoney.TrueMoneyAmtYearly
						lTrueMoneyAmtDeposit=lMapPaymentByTrueMoney.TrueMoneyAmtDeposit
						lTrueMoneyAmtMonthly=lMapPaymentByTrueMoney.TrueMoneyAmtMonthly
						lTrueMoneyAmtInstalment=lMapPaymentByTrueMoney.TrueMoneyAmtInstalment
						lTrueMoneyAmtNoDepositFirstAmount=lMapPaymentByTrueMoney.TrueMoneyAmtNoDepositFirstAmount
						lTrueMoneyAmtNoDepositAmount=lMapPaymentByTrueMoney.TrueMoneyAmtNoDepositAmount
						lTrueMoneyAmtNoDepositTotal=lMapPaymentByTrueMoney.TrueMoneyAmtNoDepositTotal
						lTrueMoneyAmtQuarterlyFirstAmount=lMapPaymentByTrueMoney.TrueMoneyAmtQuarterlyFirstAmount
						lTrueMoneyAmtQuarterlyAmount=lMapPaymentByTrueMoney.TrueMoneyAmtQuarterlyAmount
						lTrueMoneyAmtQuarterlyTotal=lMapPaymentByTrueMoney.TrueMoneyAmtQuarterlyTotal
					}
					caseOutput.TrueMoneyIsYearly=lTrueMoneyIsYearly
					caseOutput.TrueMoneyInstalment=lTrueMoneyInstalment
					caseOutput.TrueMoneyMobileNo=lTrueMoneyMobileNo
					caseOutput.TrueMoneyEmail=lTrueMoneyEmail
					caseOutput.PaymentAutoRenew=lPaymentAutoRenew
					caseOutput.PaymentTaxDeduction=lPaymentTaxDeduction
					caseOutput.PaymentEPolicy=lPaymentEPolicy
					caseOutput.TrueMoneySuccessCase=lTrueMoneySuccessCase
					caseOutput.TrueMoneyAmtYearly=lTrueMoneyAmtYearly
					caseOutput.TrueMoneyAmtDeposit=lTrueMoneyAmtDeposit
					caseOutput.TrueMoneyAmtMonthly=lTrueMoneyAmtMonthly
					caseOutput.TrueMoneyAmtInstalment=lTrueMoneyAmtInstalment
					caseOutput.TrueMoneyAmtNoDepositFirstAmount=lTrueMoneyAmtNoDepositFirstAmount
					caseOutput.TrueMoneyAmtNoDepositAmount=lTrueMoneyAmtNoDepositAmount
					caseOutput.TrueMoneyAmtNoDepositTotal=lTrueMoneyAmtNoDepositTotal
					caseOutput.TrueMoneyAmtQuarterlyFirstAmount=lTrueMoneyAmtQuarterlyFirstAmount
					caseOutput.TrueMoneyAmtQuarterlyAmount=lTrueMoneyAmtQuarterlyAmount
					caseOutput.TrueMoneyAmtQuarterlyTotal=lTrueMoneyAmtQuarterlyTotal
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
					if(!lMapPaymentByTrueMoney.Result){
						return lreturn
					}
					break
				case '5':
					Map lMapPaymentByRabbitLinePay=this.inputPaymentByRabbitLinePay(lRabbitLinePayIsYearly,lRabbitLinePayInstalment,lRabbitLinePayMobileNo,lRabbitLinePayEmail,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lRabbitLinePaySuccessCase)
					if(!lMapPaymentByRabbitLinePay.Result){
						lRabbitLinePayIsYearly=''
						lRabbitLinePayInstalment=''
						lRabbitLinePayMobileNo=''
						lRabbitLinePayEmail=''
						lPaymentAutoRenew=''
						lPaymentTaxDeduction=''
						lPaymentEPolicy=''
						lRabbitLinePaySuccessCase=''
						lRabbitLinePayAmtYearly=''
						lRabbitLinePayAmtDeposit=''
						lRabbitLinePayAmtMonthly=''
						lRabbitLinePayAmtInstalment=''
						lRabbitLinePayAmtNoDepositFirstAmount=''
						lRabbitLinePayAmtNoDepositAmount=''
						lRabbitLinePayAmtNoDepositTotal=''
						lRabbitLinePayAmtQuarterlyFirstAmount=''
						lRabbitLinePayAmtQuarterlyAmount=''
						lRabbitLinePayAmtQuarterlyTotal=''
					}else{
						lRabbitLinePayIsYearly=lMapPaymentByRabbitLinePay.RabbitLinePayIsYearly
						lRabbitLinePayInstalment=lMapPaymentByRabbitLinePay.RabbitLinePayInstalment
						lRabbitLinePayMobileNo=lMapPaymentByRabbitLinePay.RabbitLinePayMobileNo
						lRabbitLinePayEmail=lMapPaymentByRabbitLinePay.RabbitLinePayEmail
						lPaymentAutoRenew=lMapPaymentByRabbitLinePay.PaymentAutoRenew
						lPaymentTaxDeduction=lMapPaymentByRabbitLinePay.PaymentTaxDeduction
						lPaymentEPolicy=lMapPaymentByRabbitLinePay.PaymentEPolicy
						lRabbitLinePaySuccessCase=lMapPaymentByRabbitLinePay.RabbitLinePaySuccessCase
						lRabbitLinePayAmtYearly=lMapPaymentByRabbitLinePay.RabbitLinePayAmtYearly
						lRabbitLinePayAmtDeposit=lMapPaymentByRabbitLinePay.RabbitLinePayAmtDeposit
						lRabbitLinePayAmtMonthly=lMapPaymentByRabbitLinePay.RabbitLinePayAmtMonthly
						lRabbitLinePayAmtInstalment=lMapPaymentByRabbitLinePay.RabbitLinePayAmtInstalment
						lRabbitLinePayAmtNoDepositFirstAmount=lMapPaymentByRabbitLinePay.RabbitLinePayAmtNoDepositFirstAmount
						lRabbitLinePayAmtNoDepositAmount=lMapPaymentByRabbitLinePay.RabbitLinePayAmtNoDepositAmount
						lRabbitLinePayAmtNoDepositTotal=lMapPaymentByRabbitLinePay.RabbitLinePayAmtNoDepositTotal
						lRabbitLinePayAmtQuarterlyFirstAmount=lMapPaymentByRabbitLinePay.RabbitLinePayAmtQuarterlyFirstAmount
						lRabbitLinePayAmtQuarterlyAmount=lMapPaymentByRabbitLinePay.RabbitLinePayAmtQuarterlyAmount
						lRabbitLinePayAmtQuarterlyTotal=lMapPaymentByRabbitLinePay.RabbitLinePayAmtQuarterlyTotal
					}
					caseOutput.RabbitLinePayIsYearly=lRabbitLinePayIsYearly
					caseOutput.RabbitLinePayInstalment=lRabbitLinePayInstalment
					caseOutput.RabbitLinePayMobileNo=lRabbitLinePayMobileNo
					caseOutput.RabbitLinePayEmail=lRabbitLinePayEmail
					caseOutput.PaymentAutoRenew=lPaymentAutoRenew
					caseOutput.PaymentTaxDeduction=lPaymentTaxDeduction
					caseOutput.PaymentEPolicy=lPaymentEPolicy
					caseOutput.RabbitLinePaySuccessCase=lRabbitLinePaySuccessCase
					caseOutput.RabbitLinePayAmtYearly=lRabbitLinePayAmtYearly
					caseOutput.RabbitLinePayAmtDeposit=lRabbitLinePayAmtDeposit
					caseOutput.RabbitLinePayAmtMonthly=lRabbitLinePayAmtMonthly
					caseOutput.RabbitLinePayAmtInstalment=lRabbitLinePayAmtInstalment
					caseOutput.RabbitLinePayAmtNoDepositFirstAmount=lRabbitLinePayAmtNoDepositFirstAmount
					caseOutput.RabbitLinePayAmtNoDepositAmount=lRabbitLinePayAmtNoDepositAmount
					caseOutput.RabbitLinePayAmtNoDepositTotal=lRabbitLinePayAmtNoDepositTotal
					caseOutput.RabbitLinePayAmtQuarterlyFirstAmount=lRabbitLinePayAmtQuarterlyFirstAmount
					caseOutput.RabbitLinePayAmtQuarterlyAmount=lRabbitLinePayAmtQuarterlyAmount
					caseOutput.RabbitLinePayAmtQuarterlyTotal=lRabbitLinePayAmtQuarterlyTotal
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
					if(!lMapPaymentByRabbitLinePay.Result){
						return lreturn
					}
					break
				case '6':
					Map lMapPaymentByMobileBanking=this.inputPaymentByMobileBanking(lMobileBankingIsYearly,lMobileBankingInstalment,lMobileBankingCard,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lMobileBankingSuccessCase)
					if(!lMapPaymentByMobileBanking.Result){
						lMobileBankingIsYearly=''
						lMobileBankingInstalment=''
						lMobileBankingCard=''
						lPaymentAutoRenew=''
						lPaymentTaxDeduction=''
						lPaymentEPolicy=''
						lMobileBankingSuccessCase=''
						lMobileBankingAmtYearly=''
						lMobileBankingAmtDeposit=''
						lMobileBankingAmtMonthly=''
						lMobileBankingAmtInstalment=''
						lMobileBankingAmtNoDepositFirstAmount=''
						lMobileBankingAmtNoDepositAmount=''
						lMobileBankingAmtNoDepositTotal=''
						lMobileBankingAmtQuarterlyFirstAmount=''
						lMobileBankingAmtQuarterlyAmount=''
						lMobileBankingAmtQuarterlyTotal=''
					}else{
						lMobileBankingIsYearly=lMapPaymentByMobileBanking.MobileBankingIsYearly
						lMobileBankingInstalment=lMapPaymentByMobileBanking.MobileBankingInstalment
						lMobileBankingCard=lMapPaymentByMobileBanking.MobileBankingCard
						lPaymentAutoRenew=lMapPaymentByMobileBanking.PaymentAutoRenew
						lPaymentTaxDeduction=lMapPaymentByMobileBanking.PaymentTaxDeduction
						lPaymentEPolicy=lMapPaymentByMobileBanking.PaymentEPolicy
						lMobileBankingSuccessCase=lMapPaymentByMobileBanking.MobileBankingSuccessCase
						lMobileBankingAmtYearly=lMapPaymentByMobileBanking.MobileBankingAmtYearly
						lMobileBankingAmtDeposit=lMapPaymentByMobileBanking.MobileBankingAmtDeposit
						lMobileBankingAmtMonthly=lMapPaymentByMobileBanking.MobileBankingAmtMonthly
						lMobileBankingAmtInstalment=lMapPaymentByMobileBanking.MobileBankingAmtInstalment
						lMobileBankingAmtNoDepositFirstAmount=lMapPaymentByMobileBanking.MobileBankingAmtNoDepositFirstAmount
						lMobileBankingAmtNoDepositAmount=lMapPaymentByMobileBanking.MobileBankingAmtNoDepositAmount
						lMobileBankingAmtNoDepositTotal=lMapPaymentByMobileBanking.MobileBankingAmtNoDepositTotal
						lMobileBankingAmtQuarterlyFirstAmount=lMapPaymentByMobileBanking.MobileBankingAmtQuarterlyFirstAmount
						lMobileBankingAmtQuarterlyAmount=lMapPaymentByMobileBanking.MobileBankingAmtQuarterlyAmount
						lMobileBankingAmtQuarterlyTotal=lMapPaymentByMobileBanking.MobileBankingAmtQuarterlyTotal
					}
					caseOutput.MobileBankingIsYearly=lMobileBankingIsYearly
					caseOutput.MobileBankingInstalment=lMobileBankingInstalment
					caseOutput.MobileBankingCard=lMobileBankingCard
					caseOutput.PaymentAutoRenew=lPaymentAutoRenew
					caseOutput.PaymentTaxDeduction=lPaymentTaxDeduction
					caseOutput.PaymentEPolicy=lPaymentEPolicy
					caseOutput.MobileBankingSuccessCase=lMobileBankingSuccessCase
					caseOutput.MobileBankingAmtYearly=lMobileBankingAmtYearly
					caseOutput.MobileBankingAmtDeposit=lMobileBankingAmtDeposit
					caseOutput.MobileBankingAmtMonthly=lMobileBankingAmtMonthly
					caseOutput.MobileBankingAmtInstalment=lMobileBankingAmtInstalment
					caseOutput.MobileBankingAmtNoDepositFirstAmount=lMobileBankingAmtNoDepositFirstAmount
					caseOutput.MobileBankingAmtNoDepositAmount=lMobileBankingAmtNoDepositAmount
					caseOutput.MobileBankingAmtNoDepositTotal=lMobileBankingAmtNoDepositTotal
					caseOutput.MobileBankingAmtQuarterlyFirstAmount=lMobileBankingAmtQuarterlyFirstAmount
					caseOutput.MobileBankingAmtQuarterlyAmount=lMobileBankingAmtQuarterlyAmount
					caseOutput.MobileBankingAmtQuarterlyTotal=lMobileBankingAmtQuarterlyTotal
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_CARD=lMobileBankingCard
					THACancerCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_SUCCESS_CASE=lMobileBankingSuccessCase
					if(!lMapPaymentByMobileBanking.Result){
						return lreturn
					}
					break
				default:
					Map lMapPaymentByCC=this.inputPaymentByCC(lCcIsYearly,lCcIsInstalment,lCcNumber,lCcName,lCcExpiryMonth,lCcExpiryYear,lCcCvv,lCcBank,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lCcSuccessCase)
					if(!lMapPaymentByCC.Result){
						lCcIsYearly=''
						lCcIsInstalment=''
						lCcNumber=''
						lCcName=''
						lCcExpiryMonth=''
						lCcExpiryYear=''
						lCcCvv=''
						lCcBank=''
						lPaymentAutoRenew=''
						lPaymentTaxDeduction=''
						lPaymentEPolicy=''
						lCcSuccessCase=''
						lCcAmtYearly=''
						lCcAmtDeposit=''
						lCcAmtMonthly=''
						lCcAmtInstalment=''
						lCcAmtNoDepositAmount=''
						lCcAmtNoDepositTotal=''
						lCcAmtQuarterlyAmount=''
						lCcAmtQuarterlyTotal=''
					}else{
						lCcIsYearly=lMapPaymentByCC.CcIsYearly
						lCcIsInstalment=lMapPaymentByCC.CcIsInstalment
						lCcNumber=lMapPaymentByCC.CcNumber
						lCcName=lMapPaymentByCC.CcName
						lCcExpiryMonth=lMapPaymentByCC.CcExpiryMonth
						lCcExpiryYear=lMapPaymentByCC.CcExpiryYear
						lCcCvv=lMapPaymentByCC.CcCvv
						lCcBank=lMapPaymentByCC.CcBank
						lPaymentAutoRenew=lMapPaymentByCC.PaymentAutoRenew
						lPaymentTaxDeduction=lMapPaymentByCC.PaymentTaxDeduction
						lPaymentEPolicy=lMapPaymentByCC.PaymentEPolicy
						lCcSuccessCase=lMapPaymentByCC.CcSuccessCase
						lCcAmtYearly=lMapPaymentByCC.CcAmtYearly
						lCcAmtDeposit=lMapPaymentByCC.CcAmtDeposit
						lCcAmtMonthly=lMapPaymentByCC.CcAmtMonthly
						lCcAmtInstalment=lMapPaymentByCC.CcAmtInstalment
						lCcAmtNoDepositAmount=lMapPaymentByCC.CcAmtNoDepositAmount
						lCcAmtNoDepositTotal=lMapPaymentByCC.CcAmtNoDepositTotal
						lCcAmtQuarterlyAmount=lMapPaymentByCC.CcAmtQuarterlyAmount
						lCcAmtQuarterlyTotal=lMapPaymentByCC.CcAmtQuarterlyTotal
					}
					caseOutput.CcIsYearly=lCcIsYearly
					caseOutput.CcIsInstalment=lCcIsInstalment
					caseOutput.CcNumber=lCcNumber
					caseOutput.CcName=lCcName
					caseOutput.CcExpiryMonth=lCcExpiryMonth
					caseOutput.CcExpiryYear=lCcExpiryYear
					caseOutput.CcCvv=lCcCvv
					caseOutput.CcBank=lCcBank
					caseOutput.PaymentAutoRenew=lPaymentAutoRenew
					caseOutput.PaymentTaxDeduction=lPaymentTaxDeduction
					caseOutput.PaymentEPolicy=lPaymentEPolicy
					caseOutput.CcSuccessCase=lCcSuccessCase
					caseOutput.CcAmtYearly=lCcAmtYearly
					caseOutput.CcAmtDeposit=lCcAmtDeposit
					caseOutput.CcAmtMonthly=lCcAmtMonthly
					caseOutput.CcAmtInstalment=lCcAmtInstalment
					caseOutput.CcAmtNoDepositAmount=lCcAmtNoDepositAmount
					caseOutput.CcAmtNoDepositTotal=lCcAmtNoDepositTotal
					caseOutput.CcAmtQuarterlyAmount=lCcAmtQuarterlyAmount
					caseOutput.CcAmtQuarterlyTotal=lCcAmtQuarterlyTotal
					if(!lMapPaymentByCC.Result){
						return lreturn
					}
					break
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			caseOutput.ActualResult=lActualResult
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			if(lIsActualResult){
				this.waitUntilOpportunityNumberUpdated()
				lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
					}
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
				}
				if(lIsActualResult){
					Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput)
					lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
					if(!lMapSalesforceProceedVerifyBefore.Result){
						return lreturn
					}
				}
			}
			lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
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
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THACancerQuotationPaymentType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THACancerQuotationPaymentType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THACancerQuotationPaymentType.DEFAULT_LANGUAGE)
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
	public Map inputOpportunityNumber(){
		Map lreturn=[:]
		String lOpportunityNumber=''
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
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			Boolean lIsOK=true
			String lTagInfo=''
			String lLocatorInfo=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			lTagInfo='qotation-no'
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
			lPremiumYearly='No Option'
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(lIsSelectedPremiumPaymentFrequencyAsYearly){
				String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
				String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
				lPremiumYearly=lPremiumYearlyTotalString
			}else{
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
			String lTagInstalmentOpen='btn-head-installment'
			String lLocatorInstalmentOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagInstalmentOpen)
			if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorInstalmentOpen)){
				IGNUemaHelper.delayThreadSecond(3)
				String lTagPaymentYearlyDefaultKey='installment-option'
				String lTagPaymentYearlyDefaultValue='Yearly'
				WebElement lElementPaymentYearlyDefault=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentYearlyDefaultKey,lTagPaymentYearlyDefaultValue)
				if(lElementPaymentYearlyDefault){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentYearlyDefault)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentYearlyDefault)
				}
				String lTagInstallmentCloseButton='installment-modal-close'
				String lLocatorInstallmentCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentCloseButton)
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorInstallmentCloseButton)
				WebElement lElementInstallmentCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInstallmentCloseButton)
				if(lElementInstallmentCloseButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentCloseButton)
				}
			}
			lOpportunityNumber=lOpportunityNumber+'\nPremiumYearly:'+lPremiumYearly
			lOpportunityNumber=lOpportunityNumber+'\nPremiumDeposit:'+lPremiumDeposit
			lOpportunityNumber=lOpportunityNumber+'\nPremiumMonthly:'+lPremiumMonthly
			lOpportunityNumber=lOpportunityNumber+'\nPremiumInstalment:'+lPremiumInstalment
			lOpportunityNumber=lOpportunityNumber+'\nPremiumNoDepositAmount:'+lPremiumNoDepositAmount
			lOpportunityNumber=lOpportunityNumber+'\nPremiumNoDepositTotal:'+lPremiumNoDepositTotal
			lOpportunityNumber=lOpportunityNumber+'\nPremiumQuarterlyAmount:'+lPremiumQuarterlyAmount
			lOpportunityNumber=lOpportunityNumber+'\nPremiumQuarterlyTotal:'+lPremiumQuarterlyTotal
			lOpportunityNumber=lOpportunityNumber.trim()
			lResult=lOpportunityNumber.length()>0
			if(lResult){
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentMethod(String strPaymentMethod){
		Map lreturn=[:]
		String lPaymentMethod=strPaymentMethod.trim()
		Map lPaymentMethodList=['1':'1','2':'2','3':'3','4':'4','5':'5','6':'6']
		Integer lPaymentMethodDefaultMin=1
		Integer lPaymentMethodDefaultMax=6
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			String lPaymentMethodItem=lPaymentMethodList.get(lPaymentMethod)
			if(!lPaymentMethodItem){
				lPaymentMethodItem=lPaymentMethodList.get(THACancerQuotationPaymentType.DEFAULT_PAYMENT_METHOD)
			}
			lPaymentMethod=''
			Integer lPaymentMethodItemNum=IGNUemaHelper.convertStringToInteger(lPaymentMethodItem,lPaymentMethodDefaultMin)
			String lTagPaymentMethodModalFormOpenButton='payment-method-modal'
			String lLocatorPaymentMethodModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentMethodModalFormOpenButton)
			WebElement lElementPaymentMethodModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentMethodModalFormOpenButton)
			if(!lElementPaymentMethodModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentMethodModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentMethodModalFormOpenButton)
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentMethodModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentMethodModalFormOpenButton)
				lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
				lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			}
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			switch(lPaymentMethodItemNum){
				case 2:
					String lTagPaymentByIbSelectButtonKey='payment-method'
					String lTagPaymentByIbSelectButtonValue='IB'
					String lLocatorPaymentByIbSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByIbSelectButtonKey,lTagPaymentByIbSelectButtonValue)
					WebElement lElementPaymentByIbSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByIbSelectButtonKey,lTagPaymentByIbSelectButtonValue)
					if(!lElementPaymentByIbSelectButton){
						lPaymentMethodItemNum=lPaymentMethodDefaultMin
					}
					break
				case 3:
					String lTagPaymentByQrSelectButtonKey='payment-method'
					String lTagPaymentByQrSelectButtonValue='Cash'
					String lLocatorPaymentByQrSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByQrSelectButtonKey,lTagPaymentByQrSelectButtonValue)
					WebElement lElementPaymentByQrSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByQrSelectButtonKey,lTagPaymentByQrSelectButtonValue)
					if(!lElementPaymentByQrSelectButton){
						lPaymentMethodItemNum=lPaymentMethodDefaultMin
					}
					break
				case 4:
					String lTagPaymentByTrueMoneySelectButtonKey='payment-method'
					String lTagPaymentByTrueMoneySelectButtonValue='truemoney'
					String lLocatorPaymentByTrueMoneySelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByTrueMoneySelectButtonKey,lTagPaymentByTrueMoneySelectButtonValue)
					WebElement lElementPaymentByTrueMoneySelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByTrueMoneySelectButtonKey,lTagPaymentByTrueMoneySelectButtonValue)
					if(!lElementPaymentByTrueMoneySelectButton){
						lPaymentMethodItemNum=lPaymentMethodDefaultMin
					}
					break
				case 5:
					String lTagPaymentByRabbitLinePaySelectButtonKey='payment-method'
					String lTagPaymentByRabbitLinePaySelectButtonValue='rabbit_linepay'
					String lLocatorPaymentByRabbitLinePaySelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByRabbitLinePaySelectButtonKey,lTagPaymentByRabbitLinePaySelectButtonValue)
					WebElement lElementPaymentByRabbitLinePaySelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByRabbitLinePaySelectButtonKey,lTagPaymentByRabbitLinePaySelectButtonValue)
					if(!lElementPaymentByRabbitLinePaySelectButton){
						lPaymentMethodItemNum=lPaymentMethodDefaultMin
					}
					break
				case 6:
					Boolean lSetBrowserWindowModeSize=IGNUemaHelper.setBrowserWindowModeSize(this.driver,false,576,1024)
					String lTagPaymentByMobileBankingSelectButtonKey='payment-method'
					String lTagPaymentByMobileBankingSelectButtonValue='mobile_banking'
					WebElement lElementPaymentByMobileBankingSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentByMobileBankingSelectButtonKey,lTagPaymentByMobileBankingSelectButtonValue)
					if(!lElementPaymentByMobileBankingSelectButton){
						lPaymentMethodItemNum=lPaymentMethodDefaultMin
					}
					break
				default:
					String lTagPaymentByCCSelectButtonKey='payment-method'
					String lTagPaymentByCCSelectButtonValue='CC'
					String lLocatorPaymentByCCSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByCCSelectButtonKey,lTagPaymentByCCSelectButtonValue)
					WebElement lElementPaymentByCCSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByCCSelectButtonKey,lTagPaymentByCCSelectButtonValue)
					if(!lElementPaymentByCCSelectButton){
						lPaymentMethodItemNum=lPaymentMethodDefaultMin
					}
					break
			}
			lPaymentMethod=lPaymentMethodItemNum.toString()
			THACancerCoreType.CURRENT_QUOTATION_PAYMENT_METHOD=lPaymentMethod
			lResult=lPaymentMethod.length()>0
			if(lResult){
				lreturn.put('PaymentMethod',lPaymentMethod)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByQR(String strPaymentTaxDeduction,String strPaymentEPolicy){
		Map lreturn=[:]
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lQrAmtYearly=''
		try{
			Boolean lResult=false
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('QrAmtYearly','')
			lreturn.put('Result',lResult)
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			String lTagPaymentByQrSelectButtonKey='payment-method'
			String lTagPaymentByQrSelectButtonValue='Cash'
			String lLocatorPaymentByQrSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByQrSelectButtonKey,lTagPaymentByQrSelectButtonValue)
			WebElement lElementPaymentByQrSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByQrSelectButtonKey,lTagPaymentByQrSelectButtonValue)
			if(!lElementPaymentByQrSelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByQrSelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByQrSelectButton)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsPaymentTaxDeduction=IGNUemaHelper.convertStringToBoolean(lPaymentTaxDeduction)
			String lTagCheckboxPaymentTaxDeduction='taxDeduction'
			String lLocatorCheckboxPaymentTaxDeduction=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxPaymentTaxDeduction)
			WebElement lElementCheckboxPaymentTaxDeduction=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxPaymentTaxDeduction)
			if(!lElementCheckboxPaymentTaxDeduction){
				lPaymentTaxDeduction='No Option'
			}else{
				String lCheckboxPaymentTaxDeductionStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
				if(lCheckboxPaymentTaxDeductionStageStr.equalsIgnoreCase('NO')){
					if(lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}else{
					if(!lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}
				lPaymentTaxDeduction=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
			}
			lQrAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			String lTagButtonPaymentByQRNext='cash-next'
			String lLocatorButtonPaymentByQRNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentByQRNext)
			WebElement lElementButtonPaymentByQRNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentByQRNext)
			if(!lElementButtonPaymentByQRNext){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentByQRNext)){
				return lreturn
			}
			String lLocatorFormDisclaimer='#payment-accept-modal'
			Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
			lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
			if(lIsDisplayedFormDisclaimer){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				String lTagCheckboxDisclaimer='payment-accept-modal-checked'
				String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
				WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
				if(lElementCheckboxDisclaimer){
					String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
					if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
							}
						}
					}
				}
				String lTagButtonConfirmPayment='payment-accept-modal-confirm'
				String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
				WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
				if(lElementButtonConfirmPayment){
					if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
						if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
						}
					}else{
						if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
						}
					}
				}
			}
			lResult=lQrAmtYearly.length()>0
			if(lResult){
				lreturn.put('PaymentTaxDeduction',lPaymentTaxDeduction)
				lreturn.put('PaymentEPolicy',lPaymentEPolicy)
				lreturn.put('QrAmtYearly',lQrAmtYearly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByIB(String strIbBank,String strPaymentAutoRenew,String strPaymentTaxDeduction,String strPaymentEPolicy,String strIbSuccessCase){
		Map lreturn=[:]
		String lIbBank=strIbBank.trim()
		Map lIbBankList=['1':'1','2':'2','3':'3','4':'4']
		Integer lIbBankDefault=2
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lIbSuccessCase=strIbSuccessCase.trim()
		if(lIbSuccessCase.length()<=0){
			lIbSuccessCase=THACancerQuotationPaymentType.DEFAULT_IB_SUCCESS_CASE
		}
		String lIbAmtYearly=''
		try{
			Boolean lResult=false
			lreturn.put('IbBank','')
			lreturn.put('PaymentAutoRenew','')
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('IbSuccessCase','')
			lreturn.put('IbAmtYearly','')
			lreturn.put('Result',lResult)
			String lIbBankItem=lIbBankList.get(lIbBank)
			if(!lIbBankItem){
				lIbBankItem=lIbBankList.get(THACancerQuotationPaymentType.DEFAULT_IB_BANK)
			}
			lIbBank=''
			Integer lIbBankItemNum=IGNUemaHelper.convertStringToInteger(lIbBankItem,lIbBankDefault)
			lIbBank=lIbBankItemNum.toString()
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			String lTagPaymentByIbSelectButtonKey='payment-method'
			String lTagPaymentByIbSelectButtonValue='IB'
			String lLocatorPaymentByIbSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByIbSelectButtonKey,lTagPaymentByIbSelectButtonValue)
			WebElement lElementPaymentByIbSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByIbSelectButtonKey,lTagPaymentByIbSelectButtonValue)
			if(!lElementPaymentByIbSelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByIbSelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByIbSelectButton)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			Boolean lIsIbSuccessCase=IGNUemaHelper.convertStringToBoolean(lIbSuccessCase)
			this.lIsIBSuccessCase=lIsIbSuccessCase
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsPaymentTaxDeduction=IGNUemaHelper.convertStringToBoolean(lPaymentTaxDeduction)
			String lTagCheckboxPaymentTaxDeduction='taxDeduction'
			String lLocatorCheckboxPaymentTaxDeduction=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxPaymentTaxDeduction)
			WebElement lElementCheckboxPaymentTaxDeduction=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxPaymentTaxDeduction)
			if(!lElementCheckboxPaymentTaxDeduction){
				lPaymentTaxDeduction='No Option'
			}else{
				String lCheckboxPaymentTaxDeductionStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
				if(lCheckboxPaymentTaxDeductionStageStr.equalsIgnoreCase('NO')){
					if(lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}else{
					if(!lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}
				lPaymentTaxDeduction=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lPaymentAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lPaymentAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lPaymentAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			lIbAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			String lTagButtonPaymentByIBExpand=''
			String lLocatorButtonPaymentByIBExpand=''
			WebElement lElementButtonPaymentByIBExpand=null
			String lTagButtonPaymentByIBNext=''
			String lLocatorButtonPaymentByIBNext=''
			WebElement lElementButtonPaymentByIBNext=null
			switch(lIbBank){
				case '1':
					lTagButtonPaymentByIBExpand='ib-collapse-ktb'
					lTagButtonPaymentByIBNext='ib-payment-ktb'
					break
				case '3':
					lTagButtonPaymentByIBExpand='ib-collapse-bay'
					lTagButtonPaymentByIBNext='ib-payment-bay'
					break
				case '4':
					lTagButtonPaymentByIBExpand='ib-collapse-bbl'
					lTagButtonPaymentByIBNext='ib-payment-bbl'
					break
				default:
					lTagButtonPaymentByIBExpand='ib-collapse-scb'
					lTagButtonPaymentByIBNext='ib-payment-scb'
					break
			}
			lLocatorButtonPaymentByIBExpand=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentByIBExpand)
			lElementButtonPaymentByIBExpand=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentByIBExpand)
			if(!lElementButtonPaymentByIBExpand){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentByIBExpand)){
				return lreturn
			}
			lLocatorButtonPaymentByIBNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentByIBNext)
			lElementButtonPaymentByIBNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentByIBNext)
			if(!lElementButtonPaymentByIBNext){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentByIBNext)){
				return lreturn
			}
			String lLocatorFormDisclaimer='#payment-accept-modal'
			Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
			lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
			if(lIsDisplayedFormDisclaimer){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				String lTagCheckboxDisclaimer='payment-accept-modal-checked'
				String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
				WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
				if(lElementCheckboxDisclaimer){
					String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
					if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
							}
						}
					}
				}
				String lTagButtonConfirmPayment='payment-accept-modal-confirm'
				String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
				WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
				if(lElementButtonConfirmPayment){
					if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
						if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
						}
					}else{
						if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
						}
					}
				}
			}
			String lLocatorFormOmise='#offsite-test-container'
			IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
			Boolean lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
			if(lValid){
				if(lIsIbSuccessCase){
					lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
					if(!lValid){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
					}
				}else{
					lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
					if(!lValid){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
					}
				}
			}
			lResult=(lIbAmtYearly.length()>0)&&lValid
			if(lResult){
				lreturn.put('IbBank',lIbBank)
				lreturn.put('PaymentAutoRenew',lPaymentAutoRenew)
				lreturn.put('PaymentTaxDeduction',lPaymentTaxDeduction)
				lreturn.put('PaymentEPolicy',lPaymentEPolicy)
				lreturn.put('IbSuccessCase',lIbSuccessCase)
				lreturn.put('IbAmtYearly',lIbAmtYearly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByCC(String strCcIsYearly,String strCcIsInstalment,String strCcNumber,String strCcName,String strCcExpiryMonth,String strCcExpiryYear,String strCcCvv,String strCcBank,String strPaymentAutoRenew,String strPaymentTaxDeduction,String strPaymentEPolicy,String strCcSuccessCase){
		Map lreturn=[:]
		String lCcIsYearly=strCcIsYearly.trim()
		if(lCcIsYearly.length()<=0){
			lCcIsYearly=THACancerQuotationPaymentType.DEFAULT_CC_IS_YEARLY
		}
		String lCcIsInstalment=strCcIsInstalment.trim()
		if(lCcIsInstalment.length()<=0){
			lCcIsInstalment=THACancerQuotationPaymentType.DEFAULT_CC_IS_INSTALMENT
		}
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THACancerQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THACancerQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THACancerQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THACancerQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THACancerQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THACancerQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THACancerQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
		}
		String lCcAmtYearly=''
		String lCcAmtDeposit=''
		String lCcAmtMonthly=''
		String lCcAmtInstalment=''
		String lCcAmtNoDepositAmount=''
		String lCcAmtNoDepositTotal=''
		String lCcAmtQuarterlyAmount=''
		String lCcAmtQuarterlyTotal=''
		String lCcAmtCovidPremium=''
		try{
			Boolean lResult=false
			lreturn.put('CcIsYearly','')
			lreturn.put('CcIsInstalment','')
			lreturn.put('CcNumber','')
			lreturn.put('CcName','')
			lreturn.put('CcExpiryMonth','')
			lreturn.put('CcExpiryYear','')
			lreturn.put('CcCvv','')
			lreturn.put('CcBank','')
			lreturn.put('PaymentAutoRenew','')
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('CcSuccessCase','')
			lreturn.put('CcAmtYearly','')
			lreturn.put('CcAmtDeposit','')
			lreturn.put('CcAmtMonthly','')
			lreturn.put('CcAmtInstalment','')
			lreturn.put('CcAmtNoDepositAmount','')
			lreturn.put('CcAmtNoDepositTotal','')
			lreturn.put('CcAmtQuarterlyAmount','')
			lreturn.put('CcAmtQuarterlyTotal','')
			lreturn.put('Result',lResult)
			/*************************************************************************************************************************************************/
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			String lTagPaymentByCCSelectButtonKey='payment-method'
			String lTagPaymentByCCSelectButtonValue='CC'
			String lLocatorPaymentByCCSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByCCSelectButtonKey,lTagPaymentByCCSelectButtonValue)
			WebElement lElementPaymentByCCSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByCCSelectButtonKey,lTagPaymentByCCSelectButtonValue)
			if(!lElementPaymentByCCSelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByCCSelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByCCSelectButton)
			IGNUemaHelper.delayThreadSecond(3)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm='installment-modal'
			String lLocatorPaymentInstalmentOptionModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalForm)
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			String lTagPaymentInstalmentOptionSelectedButton='selected-installment-option'
			String lLocatorPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionSelectedButton)
			WebElement lElementPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionSelectedButton)
			if(!lElementPaymentInstalmentOptionSelectedButton){
				return lreturn
			}
			String lPaymentInstalmentOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentInstalmentOptionSelectedButton)
			String lTagPaymentInstalmentOptionItemButtonKey='installment-option'
			String lTagPaymentInstalmentOptionItemDefaultButtonValue=lPaymentInstalmentOptionSelectedValue
			String lLocatorPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			WebElement lElementPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			if(!lElementPaymentInstalmentOptionItemDefaultButton){
				return lreturn
			}
			Boolean lIsCcIsYearly=IGNUemaHelper.convertStringToBoolean(lCcIsYearly)
			lCcIsYearly=''
			Integer lCcInstalmentMin=1
			Integer lCcInstalmentMax=3
			Integer lCcInstalmentDefault=1
			Integer lCcInstalmentNum=IGNUemaHelper.convertStringToInteger(lCcIsInstalment,lCcInstalmentDefault)
			if((lCcInstalmentNum<lCcInstalmentMin)||(lCcInstalmentNum>lCcInstalmentMax)){
				lCcInstalmentNum=lCcInstalmentDefault
			}
			lCcIsInstalment=''
			String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
			String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='12 months, no deposit'
			String lLocatorPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
			String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			String lTagPaymentInstalmentOptionItemQuarterlyButtonValue='Quarterly'
			String lLocatorPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			Integer lPaymentInstalmentOptionItemDefaultNum=0
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=1
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=2
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemQuarterlyButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=3
			}
			if(!lIsCcIsYearly){
				if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
					if(lPaymentInstalmentOptionItemDefaultNum<=0){
						return lreturn
					}
				}
				switch(lCcInstalmentNum){
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsCcIsYearly=true
							}else{
								lCcInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsCcIsYearly=true
							}else{
								lCcInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsCcIsYearly=true
							}else{
								lCcInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
				}
			}
			if(!lIsCcIsYearly){
				switch(lCcInstalmentNum){
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lCcIsInstalment='Monthly With Deposit'
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						lCcIsInstalment='Quarterly'
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lCcIsInstalment='Monthly No Deposit'
						break
				}
			}
			if(lIsCcIsYearly){
				if(!lElementPaymentInstalmentOptionItemYearlyButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
			}
			IGNUemaHelper.delayThreadSecond(3)
			lCcIsYearly=IGNUemaHelper.convertBooleanToYesNoString(lIsCcIsYearly)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			if(lIsCcIsYearly){
				lCcAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			}else{
				switch(lCcInstalmentNum){
					case 2:
						lCcAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lCcAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lCcAmtNoDepositAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			String lTagTextPaymentByCCNumber='card-number'
			String lLocatorTextPaymentByCCNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCCNumber)
			WebElement lElementTextPaymentByCCNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCCNumber)
			if(!lElementTextPaymentByCCNumber){
				return lreturn
			}
			lCcNumber=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCCNumber,lCcNumber)
			String lTagTextPaymentByCcName='card-name'
			String lLocatorTextPaymentByCcName=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCcName)
			WebElement lElementTextPaymentByCcName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCcName)
			if(!lElementTextPaymentByCcName){
				return lreturn
			}
			lCcName=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCcName,lCcName)
			String lTagSelectCcExpiryMonth='card-month'
			String lLocatorSelectCcExpiryMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryMonth)
			WebElement lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryMonth)
			if(!lElementSelectCcExpiryMonth){
				return lreturn
			}
			Select lSelectCcExpiryMonth=new Select(lElementSelectCcExpiryMonth)
			lSelectCcExpiryMonth.selectByVisibleText(lCcExpiryMonth)
			WebElement lElementSelectCcExpiryMonthSelected=lSelectCcExpiryMonth.getFirstSelectedOption()
			lCcExpiryMonth=lElementSelectCcExpiryMonthSelected.getText()
			String lTagSelectCcExpiryYear='card-year'
			String lLocatorSelectCcExpiryYear=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryYear)
			WebElement lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryYear)
			if(!lElementSelectCcExpiryYear){
				return lreturn
			}
			Select lSelectCcExpiryYear=new Select(lElementSelectCcExpiryYear)
			lSelectCcExpiryYear.selectByVisibleText(lCcExpiryYear)
			WebElement lElementSelectCcExpiryYearSelected=lSelectCcExpiryYear.getFirstSelectedOption()
			lCcExpiryYear=lElementSelectCcExpiryYearSelected.getText()
			String lTagTextPaymentByCCCvv='card-cvv'
			String lLocatorTextPaymentByCCCvv=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCCCvv)
			WebElement lElementTextPaymentByCCCvv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCCCvv)
			if(!lElementTextPaymentByCCCvv){
				return lreturn
			}
			lCcCvv=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCCCvv,lCcCvv)
			String lTagSelectCcBank='card-bank'
			String lLocatorSelectCcBank=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcBank)
			WebElement lElementSelectCcBank=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcBank)
			if(!lElementSelectCcBank){
				return lreturn
			}
			Select lSelectCcBank=new Select(lElementSelectCcBank)
			def lOptionListCcBank=lSelectCcBank.getOptions()
			if(lOptionListCcBank.size()<=0){
				lCcBank=''
			}else{
				Boolean lFoundCcBank=false
				Integer lIndexCcBank=0
				def lOptionItemCcBank=null
				String lOptionFindCcBank=''
				for(Integer lOptionIndexCcBank=0;lOptionIndexCcBank<lOptionListCcBank.size()-1;lOptionIndexCcBank++){
					lOptionItemCcBank=lOptionListCcBank.get(lOptionIndexCcBank)
					lOptionFindCcBank=lOptionItemCcBank.getText()
					if(lOptionFindCcBank.contains(lCcBank)){
						lFoundCcBank=true
						lIndexCcBank=lOptionIndexCcBank
						break
					}
				}
				if(lFoundCcBank){
					lSelectCcBank.selectByIndex(lIndexCcBank)
					lOptionItemCcBank=lSelectCcBank.getFirstSelectedOption()
					lCcBank=lOptionItemCcBank.getText()
				}else{
					lSelectCcBank.selectByIndex(lOptionListCcBank.size()-1)
					String lTagTextCcBank='card-other-bank'
					String lLocatorTextCcBank=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCcBank)
					WebElement lElementTextCcBank=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextCcBank)
					if(!lElementTextCcBank){
						return lreturn
					}
					lCcBank=IGNUemaHelper.typeTextByWebElement(driver,lElementTextCcBank,lCcBank)
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsPaymentTaxDeduction=IGNUemaHelper.convertStringToBoolean(lPaymentTaxDeduction)
			String lTagCheckboxPaymentTaxDeduction='taxDeduction'
			String lLocatorCheckboxPaymentTaxDeduction=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxPaymentTaxDeduction)
			WebElement lElementCheckboxPaymentTaxDeduction=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxPaymentTaxDeduction)
			if(!lElementCheckboxPaymentTaxDeduction){
				lPaymentTaxDeduction='No Option'
			}else{
				String lCheckboxPaymentTaxDeductionStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
				if(lCheckboxPaymentTaxDeductionStageStr.equalsIgnoreCase('NO')){
					if(lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}else{
					if(!lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}
				lPaymentTaxDeduction=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lPaymentAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lPaymentAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lPaymentAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			Boolean lIsCcSuccessCase=IGNUemaHelper.convertStringToBoolean(lCcSuccessCase)
			String lTagButtonPaymentSubmit='submitCreditCard'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			lCcSuccessCase=IGNUemaHelper.convertBooleanToString(lIsCcSuccessCase)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				String lLocatorFormDisclaimer='#payment-accept-modal'
				Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
				lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
				if(lIsDisplayedFormDisclaimer){
					IGNUemaHelper.webJsScrollToBottom(this.driver)
					String lTagCheckboxDisclaimer='payment-accept-modal-checked'
					String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
					WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
					if(lElementCheckboxDisclaimer){
						String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
						if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
							if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}else{
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}
						}
					}
					String lTagButtonConfirmPayment='payment-accept-modal-confirm'
					String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
					WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
					if(lElementButtonConfirmPayment){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}
					}
				}
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsCcSuccessCase){
					lResult=true
				}
			}
			/*************************************************************************************************************************************************/
			if(lResult){
				lreturn.put('CcIsYearly',lCcIsYearly)
				lreturn.put('CcIsInstalment',lCcIsInstalment)
				lreturn.put('CcNumber',lCcNumber)
				lreturn.put('CcName',lCcName)
				lreturn.put('CcExpiryMonth',lCcExpiryMonth)
				lreturn.put('CcExpiryYear',lCcExpiryYear)
				lreturn.put('CcCvv',lCcCvv)
				lreturn.put('CcBank',lCcBank)
				lreturn.put('PaymentAutoRenew',lPaymentAutoRenew)
				lreturn.put('PaymentTaxDeduction',lPaymentTaxDeduction)
				lreturn.put('PaymentEPolicy',lPaymentEPolicy)
				lreturn.put('CcSuccessCase',lCcSuccessCase)
				lreturn.put('CcAmtYearly',lCcAmtYearly)
				lreturn.put('CcAmtDeposit',lCcAmtDeposit)
				lreturn.put('CcAmtMonthly',lCcAmtMonthly)
				lreturn.put('CcAmtInstalment',lCcAmtInstalment)
				lreturn.put('CcAmtNoDepositAmount',lCcAmtNoDepositAmount)
				lreturn.put('CcAmtNoDepositTotal',lCcAmtNoDepositTotal)
				lreturn.put('CcAmtQuarterlyAmount',lCcAmtQuarterlyAmount)
				lreturn.put('CcAmtQuarterlyTotal',lCcAmtQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByTrueMoney(String strTrueMoneyIsYearly,String strTrueMoneyInstalment,String strTrueMoneyMobileNo,String strTrueMoneyEmail,String strPaymentAutoRenew,String strPaymentTaxDeduction,String strPaymentEPolicy,String strTrueMoneySuccessCase){
		Map lreturn=[:]
		String lTrueMoneyIsYearly=strTrueMoneyIsYearly.trim()
		if(lTrueMoneyIsYearly.length()<=0){
			lTrueMoneyIsYearly=THACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_YEARLY
		}
		String lTrueMoneyInstalment=strTrueMoneyInstalment.trim()
		if(lTrueMoneyInstalment.length()<=0){
			lTrueMoneyInstalment=THACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_INSTALMENT
		}
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_EMAIL
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_SUCCESS_CASE
		}
		String lTrueMoneyAmtYearly=''
		String lTrueMoneyAmtDeposit=''
		String lTrueMoneyAmtMonthly=''
		String lTrueMoneyAmtInstalment=''
		String lTrueMoneyAmtNoDepositFirstAmount=''
		String lTrueMoneyAmtNoDepositAmount=''
		String lTrueMoneyAmtNoDepositTotal=''
		String lTrueMoneyAmtQuarterlyFirstAmount=''
		String lTrueMoneyAmtQuarterlyAmount=''
		String lTrueMoneyAmtQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('TrueMoneyIsYearly','')
			lreturn.put('TrueMoneyInstalment','')
			lreturn.put('TrueMoneyMobileNo','')
			lreturn.put('TrueMoneyEmail','')
			lreturn.put('PaymentAutoRenew','')
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('TrueMoneySuccessCase','')
			lreturn.put('TrueMoneyAmtYearly','')
			lreturn.put('TrueMoneyAmtDeposit','')
			lreturn.put('TrueMoneyAmtMonthly','')
			lreturn.put('TrueMoneyAmtInstalment','')
			lreturn.put('TrueMoneyAmtNoDepositFirstAmount','')
			lreturn.put('TrueMoneyAmtNoDepositAmount','')
			lreturn.put('TrueMoneyAmtNoDepositTotal','')
			lreturn.put('TrueMoneyAmtQuarterlyFirstAmount','')
			lreturn.put('TrueMoneyAmtQuarterlyAmount','')
			lreturn.put('TrueMoneyAmtQuarterlyTotal','')
			lreturn.put('Result',lResult)
			/*************************************************************************************************************************************************/
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			String lTagPaymentByTrueMoneySelectButtonKey='payment-method'
			String lTagPaymentByTrueMoneySelectButtonValue='truemoney'
			String lLocatorPaymentByTrueMoneySelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByTrueMoneySelectButtonKey,lTagPaymentByTrueMoneySelectButtonValue)
			WebElement lElementPaymentByTrueMoneySelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByTrueMoneySelectButtonKey,lTagPaymentByTrueMoneySelectButtonValue)
			if(!lElementPaymentByTrueMoneySelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByTrueMoneySelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByTrueMoneySelectButton)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			String lTagPaymentInstalmentOptionSelectedButton='selected-installment-option'
			String lLocatorPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionSelectedButton)
			WebElement lElementPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionSelectedButton)
			if(!lElementPaymentInstalmentOptionSelectedButton){
				return lreturn
			}
			String lPaymentInstalmentOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentInstalmentOptionSelectedButton)
			String lTagPaymentInstalmentOptionItemButtonKey='installment-option'
			String lTagPaymentInstalmentOptionItemDefaultButtonValue=lPaymentInstalmentOptionSelectedValue
			String lLocatorPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			WebElement lElementPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			if(!lElementPaymentInstalmentOptionItemDefaultButton){
				return lreturn
			}
			Boolean lIsTrueMoneyIsYearly=IGNUemaHelper.convertStringToBoolean(lTrueMoneyIsYearly)
			lTrueMoneyIsYearly=''
			Integer lTrueMoneyInstalmentMin=1
			Integer lTrueMoneyInstalmentMax=3
			Integer lTrueMoneyInstalmentDefault=2
			Integer lTrueMoneyInstalmentNum=IGNUemaHelper.convertStringToInteger(lTrueMoneyInstalment,lTrueMoneyInstalmentDefault)
			if((lTrueMoneyInstalmentNum<lTrueMoneyInstalmentMin)||(lTrueMoneyInstalmentNum>lTrueMoneyInstalmentMax)){
				lTrueMoneyInstalmentNum=lTrueMoneyInstalmentDefault
			}
			lTrueMoneyInstalment=''
			String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
			String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
			String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='12 months, no deposit'
			String lLocatorPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			String lTagPaymentInstalmentOptionItemQuarterlyButtonValue='Quarterly'
			String lLocatorPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			Integer lPaymentInstalmentOptionItemDefaultNum=0
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=1
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=2
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemQuarterlyButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=3
			}
			if(!lIsTrueMoneyIsYearly){
				if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
					if(lPaymentInstalmentOptionItemDefaultNum<=0){
						return lreturn
					}
				}
				switch(lTrueMoneyInstalmentNum){
					case 1:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsTrueMoneyIsYearly=true
							}else{
								lTrueMoneyInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsTrueMoneyIsYearly=true
							}else{
								lTrueMoneyInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsTrueMoneyIsYearly=true
							}else{
								lTrueMoneyInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
				}
			}
			if(!lIsTrueMoneyIsYearly){
				switch(lTrueMoneyInstalmentNum){
					case 1:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lTrueMoneyInstalment='Monthly With Deposit'
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						lTrueMoneyInstalment='Quarterly'
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lTrueMoneyInstalment='Monthly No Deposit'
						break
				}
			}
			if(lIsTrueMoneyIsYearly){
				if(!lElementPaymentInstalmentOptionItemYearlyButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
			}
			IGNUemaHelper.delayThreadSecond(3)
			lTrueMoneyIsYearly=IGNUemaHelper.convertBooleanToYesNoString(lIsTrueMoneyIsYearly)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			if(lIsTrueMoneyIsYearly){
				lTrueMoneyAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			}else{
				switch(lTrueMoneyInstalmentNum){
					case 1:
						lTrueMoneyAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lTrueMoneyAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lTrueMoneyAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtNoDepositAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsPaymentTaxDeduction=IGNUemaHelper.convertStringToBoolean(lPaymentTaxDeduction)
			String lTagCheckboxPaymentTaxDeduction='taxDeduction'
			String lLocatorCheckboxPaymentTaxDeduction=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxPaymentTaxDeduction)
			WebElement lElementCheckboxPaymentTaxDeduction=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxPaymentTaxDeduction)
			if(!lElementCheckboxPaymentTaxDeduction){
				lPaymentTaxDeduction='No Option'
			}else{
				String lCheckboxPaymentTaxDeductionStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
				if(lCheckboxPaymentTaxDeductionStageStr.equalsIgnoreCase('NO')){
					if(lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}else{
					if(!lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}
				lPaymentTaxDeduction=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lPaymentAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lPaymentAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lPaymentAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			String lTrueMoneyMobileNoText=lTrueMoneyMobileNo
			lTrueMoneyMobileNo=''
			String lTagPaymentByTrueMoneyMobileNoInput='truemoney-mobile-number'
			String lLocatorPaymentByTrueMoneyMobileNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByTrueMoneyMobileNoInput)
			WebElement lElementPaymentByTrueMoneyMobileNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByTrueMoneyMobileNoInput)
			if(!lElementPaymentByTrueMoneyMobileNoInput){
				lTrueMoneyMobileNo='No Option'
			}else{
				lTrueMoneyMobileNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByTrueMoneyMobileNoInput,lTrueMoneyMobileNoText)
			}
			String lTrueMoneyEmailText=lTrueMoneyEmail
			lTrueMoneyEmail=''
			String lTagPaymentByTrueMoneyEmailInput='truemoney-email'
			String lLocatorPaymentByTrueMoneyEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByTrueMoneyEmailInput)
			WebElement lElementPaymentByTrueMoneyEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByTrueMoneyEmailInput)
			if(!lElementPaymentByTrueMoneyEmailInput){
				lTrueMoneyEmail='No Option'
			}else{
				lTrueMoneyEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByTrueMoneyEmailInput,lTrueMoneyEmailText)
			}
			Boolean lIsTrueMoneySuccessCase=IGNUemaHelper.convertStringToBoolean(lTrueMoneySuccessCase)
			String lTagButtonPaymentSubmit='TrueMoneyWallet-next'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			lTrueMoneySuccessCase=IGNUemaHelper.convertBooleanToString(lIsTrueMoneySuccessCase)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				String lLocatorFormDisclaimer='#payment-accept-modal'
				Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
				lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
				if(lIsDisplayedFormDisclaimer){
					IGNUemaHelper.webJsScrollToBottom(this.driver)
					String lTagCheckboxDisclaimer='payment-accept-modal-checked'
					String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
					WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
					if(lElementCheckboxDisclaimer){
						String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
						if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
							if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}else{
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}
						}
					}
					String lTagButtonConfirmPayment='payment-accept-modal-confirm'
					String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
					WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
					if(lElementButtonConfirmPayment){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}
					}
				}
				String lLocatorFormOmise='#offsite-test-container'
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				Boolean lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(lValid){
					if(lIsTrueMoneySuccessCase){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lValid){
							lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lValid){
							lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
						}
					}
				}
				String lLocatorThankyouPage='#thankyou'
				String lLocatorAppDoc='#app'
				String lAppDocText=''
				String lCurrentURL=WebUI.getUrl()
				IGNUemaHelper.printLog(lCurrentURL)
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorThankyouPage,10)
				Boolean lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
				if(lIsDone){
					lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
					if(lAppDocText.length()<=0){
						lLocatorFormOmise='#offsite-test-container'
						lValid=false
						if(lCurrentURL.toUpperCase().contains('THANKYOU')){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
							lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
							if(lValid){
								if(lIsTrueMoneySuccessCase){
									lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
									if(!lValid){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
									}
								}else{
									lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
									if(!lValid){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
									}
								}
							}
							lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							if(!lIsDone){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
								IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
								lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
								if(lValid){
									if(lIsTrueMoneySuccessCase){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
										if(!lValid){
											lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
										}
									}else{
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
										if(!lValid){
											lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
										}
									}
								}
								lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							}
						}
						lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
					}
					lAppDocText=''
				}
				if(lIsDone){
					String lTagPleaseWait=''
					String lLocatorPleaseWait='#loading'
					Boolean lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
					lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
					if(!lValid2){
						IGNUemaHelper.delayThreadSecond(2)
						lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
						lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
					}
					if(!lValid2){
						lResult=false
					}
					IGNUemaHelper.delayThreadSecond(10)
					lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
					String lTagButtonNext='nextProcess'
					String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
					WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(!lElementButtonNext){
						return lreturn
					}
					IGNUemaHelper.delayThreadSecond(10)
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,30)
				}
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsTrueMoneySuccessCase){
					lResult=true
				}
			}
			/*************************************************************************************************************************************************/
			if(lResult){
				lreturn.put('TrueMoneyIsYearly',lTrueMoneyIsYearly)
				lreturn.put('TrueMoneyInstalment',lTrueMoneyInstalment)
				lreturn.put('TrueMoneyMobileNo',lTrueMoneyMobileNo)
				lreturn.put('TrueMoneyEmail',lTrueMoneyEmail)
				lreturn.put('PaymentAutoRenew',lPaymentAutoRenew)
				lreturn.put('PaymentTaxDeduction',lPaymentTaxDeduction)
				lreturn.put('PaymentEPolicy',lPaymentEPolicy)
				lreturn.put('TrueMoneySuccessCase',lTrueMoneySuccessCase)
				lreturn.put('TrueMoneyAmtYearly',lTrueMoneyAmtYearly)
				lreturn.put('TrueMoneyAmtDeposit',lTrueMoneyAmtDeposit)
				lreturn.put('TrueMoneyAmtMonthly',lTrueMoneyAmtMonthly)
				lreturn.put('TrueMoneyAmtInstalment',lTrueMoneyAmtInstalment)
				lreturn.put('TrueMoneyAmtNoDepositFirstAmount',lTrueMoneyAmtNoDepositFirstAmount)
				lreturn.put('TrueMoneyAmtNoDepositAmount',lTrueMoneyAmtNoDepositAmount)
				lreturn.put('TrueMoneyAmtNoDepositTotal',lTrueMoneyAmtNoDepositTotal)
				lreturn.put('TrueMoneyAmtQuarterlyFirstAmount',lTrueMoneyAmtQuarterlyFirstAmount)
				lreturn.put('TrueMoneyAmtQuarterlyAmount',lTrueMoneyAmtQuarterlyAmount)
				lreturn.put('TrueMoneyAmtQuarterlyTotal',lTrueMoneyAmtQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByRabbitLinePay(String strRabbitLinePayIsYearly,String strRabbitLinePayInstalment,String strRabbitLinePayMobileNo,String strRabbitLinePayEmail,String strPaymentAutoRenew,String strPaymentTaxDeduction,String strPaymentEPolicy,String strRabbitLinePaySuccessCase){
		Map lreturn=[:]
		String lRabbitLinePayIsYearly=strRabbitLinePayIsYearly.trim()
		if(lRabbitLinePayIsYearly.length()<=0){
			lRabbitLinePayIsYearly=THACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lRabbitLinePayInstalment=strRabbitLinePayInstalment.trim()
		if(lRabbitLinePayInstalment.length()<=0){
			lRabbitLinePayInstalment=THACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_INSTALMENT
		}
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_EMAIL
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE
		}
		String lRabbitLinePayAmtYearly=''
		String lRabbitLinePayAmtDeposit=''
		String lRabbitLinePayAmtMonthly=''
		String lRabbitLinePayAmtInstalment=''
		String lRabbitLinePayAmtNoDepositFirstAmount=''
		String lRabbitLinePayAmtNoDepositAmount=''
		String lRabbitLinePayAmtNoDepositTotal=''
		String lRabbitLinePayAmtQuarterlyFirstAmount=''
		String lRabbitLinePayAmtQuarterlyAmount=''
		String lRabbitLinePayAmtQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('RabbitLinePayIsYearly','')
			lreturn.put('RabbitLinePayInstalment','')
			lreturn.put('RabbitLinePayMobileNo','')
			lreturn.put('RabbitLinePayEmail','')
			lreturn.put('PaymentAutoRenew','')
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('RabbitLinePaySuccessCase','')
			lreturn.put('RabbitLinePayAmtYearly','')
			lreturn.put('RabbitLinePayAmtDeposit','')
			lreturn.put('RabbitLinePayAmtMonthly','')
			lreturn.put('RabbitLinePayAmtInstalment','')
			lreturn.put('RabbitLinePayAmtNoDepositFirstAmount','')
			lreturn.put('RabbitLinePayAmtNoDepositAmount','')
			lreturn.put('RabbitLinePayAmtNoDepositTotal','')
			lreturn.put('RabbitLinePayAmtQuarterlyFirstAmount','')
			lreturn.put('RabbitLinePayAmtQuarterlyAmount','')
			lreturn.put('RabbitLinePayAmtQuarterlyTotal','')
			lreturn.put('Result',lResult)
			/*************************************************************************************************************************************************/
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			String lTagPaymentByRabbitLinePaySelectButtonKey='payment-method'
			String lTagPaymentByRabbitLinePaySelectButtonValue='rabbit_linepay'
			String lLocatorPaymentByRabbitLinePaySelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByRabbitLinePaySelectButtonKey,lTagPaymentByRabbitLinePaySelectButtonValue)
			WebElement lElementPaymentByRabbitLinePaySelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByRabbitLinePaySelectButtonKey,lTagPaymentByRabbitLinePaySelectButtonValue)
			if(!lElementPaymentByRabbitLinePaySelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByRabbitLinePaySelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByRabbitLinePaySelectButton)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			String lTagPaymentInstalmentOptionSelectedButton='selected-installment-option'
			String lLocatorPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionSelectedButton)
			WebElement lElementPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionSelectedButton)
			if(!lElementPaymentInstalmentOptionSelectedButton){
				return lreturn
			}
			String lPaymentInstalmentOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentInstalmentOptionSelectedButton)
			String lTagPaymentInstalmentOptionItemButtonKey='installment-option'
			String lTagPaymentInstalmentOptionItemDefaultButtonValue=lPaymentInstalmentOptionSelectedValue
			String lLocatorPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			WebElement lElementPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			if(!lElementPaymentInstalmentOptionItemDefaultButton){
				return lreturn
			}
			Boolean lIsRabbitLinePayIsYearly=IGNUemaHelper.convertStringToBoolean(lRabbitLinePayIsYearly)
			lRabbitLinePayIsYearly=''
			Integer lRabbitLinePayInstalmentMin=1
			Integer lRabbitLinePayInstalmentMax=3
			Integer lRabbitLinePayInstalmentDefault=2
			Integer lRabbitLinePayInstalmentNum=IGNUemaHelper.convertStringToInteger(lRabbitLinePayInstalment,lRabbitLinePayInstalmentDefault)
			if((lRabbitLinePayInstalmentNum<lRabbitLinePayInstalmentMin)||(lRabbitLinePayInstalmentNum>lRabbitLinePayInstalmentMax)){
				lRabbitLinePayInstalmentNum=lRabbitLinePayInstalmentDefault
			}
			lRabbitLinePayInstalment=''
			String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
			String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
			String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='12 months, no deposit'
			String lLocatorPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			String lTagPaymentInstalmentOptionItemQuarterlyButtonValue='Quarterly'
			String lLocatorPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			Integer lPaymentInstalmentOptionItemDefaultNum=0
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=1
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=2
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemQuarterlyButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=3
			}
			if(!lIsRabbitLinePayIsYearly){
				if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
					if(lPaymentInstalmentOptionItemDefaultNum<=0){
						return lreturn
					}
				}
				switch(lRabbitLinePayInstalmentNum){
					case 1:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsRabbitLinePayIsYearly=true
							}else{
								lRabbitLinePayInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsRabbitLinePayIsYearly=true
							}else{
								lRabbitLinePayInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsRabbitLinePayIsYearly=true
							}else{
								lRabbitLinePayInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
				}
			}
			if(!lIsRabbitLinePayIsYearly){
				switch(lRabbitLinePayInstalmentNum){
					case 1:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lRabbitLinePayInstalment='Monthly With Deposit'
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						lRabbitLinePayInstalment='Quarterly'
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lRabbitLinePayInstalment='Monthly No Deposit'
						break
				}
			}
			if(lIsRabbitLinePayIsYearly){
				if(!lElementPaymentInstalmentOptionItemYearlyButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
			}
			IGNUemaHelper.delayThreadSecond(3)
			lRabbitLinePayIsYearly=IGNUemaHelper.convertBooleanToYesNoString(lIsRabbitLinePayIsYearly)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			if(lIsRabbitLinePayIsYearly){
				lRabbitLinePayAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			}else{
				switch(lRabbitLinePayInstalmentNum){
					case 1:
						lRabbitLinePayAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lRabbitLinePayAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lRabbitLinePayAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtNoDepositAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsPaymentTaxDeduction=IGNUemaHelper.convertStringToBoolean(lPaymentTaxDeduction)
			String lTagCheckboxPaymentTaxDeduction='taxDeduction'
			String lLocatorCheckboxPaymentTaxDeduction=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxPaymentTaxDeduction)
			WebElement lElementCheckboxPaymentTaxDeduction=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxPaymentTaxDeduction)
			if(!lElementCheckboxPaymentTaxDeduction){
				lPaymentTaxDeduction='No Option'
			}else{
				String lCheckboxPaymentTaxDeductionStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
				if(lCheckboxPaymentTaxDeductionStageStr.equalsIgnoreCase('NO')){
					if(lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}else{
					if(!lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}
				lPaymentTaxDeduction=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lPaymentAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lPaymentAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lPaymentAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			Boolean lIsRabbitLinePaySuccessCase=IGNUemaHelper.convertStringToBoolean(lRabbitLinePaySuccessCase)
			String lTagButtonPaymentSubmit='RabbitLinePay-next'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			lRabbitLinePaySuccessCase=IGNUemaHelper.convertBooleanToString(lIsRabbitLinePaySuccessCase)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				String lLocatorFormDisclaimer='#payment-accept-modal'
				Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
				lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
				if(lIsDisplayedFormDisclaimer){
					IGNUemaHelper.webJsScrollToBottom(this.driver)
					String lTagCheckboxDisclaimer='payment-accept-modal-checked'
					String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
					WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
					if(lElementCheckboxDisclaimer){
						String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
						if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
							if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}else{
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}
						}
					}
					String lTagButtonConfirmPayment='payment-accept-modal-confirm'
					String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
					WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
					if(lElementButtonConfirmPayment){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}
					}
				}
				String lLocatorFormOmise='#payment-test-container'
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				Boolean lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(lValid){
					String lRabbitLinePayMobileNoText=lRabbitLinePayMobileNo
					lRabbitLinePayMobileNo=''
					String lTagPaymentByRabbitLinePayMobileNoInput='rabbit_linepay-mobile-number'
					String lLocatorPaymentByRabbitLinePayMobileNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayMobileNoInput)
					WebElement lElementPaymentByRabbitLinePayMobileNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayMobileNoInput)
					if(!lElementPaymentByRabbitLinePayMobileNoInput){
						lRabbitLinePayMobileNo='No Option'
					}else{
						lRabbitLinePayMobileNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByRabbitLinePayMobileNoInput,lRabbitLinePayMobileNoText)
					}
					String lRabbitLinePayEmailText=lRabbitLinePayEmail
					lRabbitLinePayEmail=''
					String lTagPaymentByRabbitLinePayEmailInput='rabbit_linepay-email'
					String lLocatorPaymentByRabbitLinePayEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayEmailInput)
					WebElement lElementPaymentByRabbitLinePayEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayEmailInput)
					if(!lElementPaymentByRabbitLinePayEmailInput){
						lRabbitLinePayEmail='No Option'
					}else{
						lRabbitLinePayEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByRabbitLinePayEmailInput,lRabbitLinePayEmailText)
					}
					if(lIsRabbitLinePaySuccessCase){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lValid){
							lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lValid){
							lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
						}
					}
				}
				String lLocatorThankyouPage='#thankyou'
				String lLocatorAppDoc='#app'
				String lAppDocText=''
				String lCurrentURL=WebUI.getUrl()
				IGNUemaHelper.printLog(lCurrentURL)
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorThankyouPage,10)
				Boolean lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
				if(lIsDone){
					lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
					if(lAppDocText.length()<=0){
						lLocatorFormOmise='#offsite-test-container'
						lValid=false
						if(lCurrentURL.toUpperCase().contains('THANKYOU')){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
							lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
							if(lValid){
								if(lIsRabbitLinePaySuccessCase){
									lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
									if(!lValid){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
									}
								}else{
									lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
									if(!lValid){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
									}
								}
							}
							lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							if(!lIsDone){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
								IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
								lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
								if(lValid){
									if(lIsRabbitLinePaySuccessCase){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
										if(!lValid){
											lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
										}
									}else{
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
										if(!lValid){
											lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
										}
									}
								}
								lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							}
						}
						lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
					}
					lAppDocText=''
				}
				if(lIsDone){
					String lTagPleaseWait=''
					String lLocatorPleaseWait='#loading'
					Boolean lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
					lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
					if(!lValid2){
						IGNUemaHelper.delayThreadSecond(2)
						lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
						lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
					}
					if(!lValid2){
						lResult=false
					}
					IGNUemaHelper.delayThreadSecond(10)
					lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
					String lTagButtonNext='nextProcess'
					String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
					WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(!lElementButtonNext){
						return lreturn
					}
					IGNUemaHelper.delayThreadSecond(10)
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,30)
				}
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsRabbitLinePaySuccessCase){
					lResult=true
				}
			}
			/*************************************************************************************************************************************************/
			if(lResult){
				lreturn.put('RabbitLinePayIsYearly',lRabbitLinePayIsYearly)
				lreturn.put('RabbitLinePayInstalment',lRabbitLinePayInstalment)
				lreturn.put('RabbitLinePayMobileNo',lRabbitLinePayMobileNo)
				lreturn.put('RabbitLinePayEmail',lRabbitLinePayEmail)
				lreturn.put('PaymentAutoRenew',lPaymentAutoRenew)
				lreturn.put('PaymentTaxDeduction',lPaymentTaxDeduction)
				lreturn.put('PaymentEPolicy',lPaymentEPolicy)
				lreturn.put('RabbitLinePaySuccessCase',lRabbitLinePaySuccessCase)
				lreturn.put('RabbitLinePayAmtYearly',lRabbitLinePayAmtYearly)
				lreturn.put('RabbitLinePayAmtDeposit',lRabbitLinePayAmtDeposit)
				lreturn.put('RabbitLinePayAmtMonthly',lRabbitLinePayAmtMonthly)
				lreturn.put('RabbitLinePayAmtInstalment',lRabbitLinePayAmtInstalment)
				lreturn.put('RabbitLinePayAmtNoDepositFirstAmount',lRabbitLinePayAmtNoDepositFirstAmount)
				lreturn.put('RabbitLinePayAmtNoDepositAmount',lRabbitLinePayAmtNoDepositAmount)
				lreturn.put('RabbitLinePayAmtNoDepositTotal',lRabbitLinePayAmtNoDepositTotal)
				lreturn.put('RabbitLinePayAmtQuarterlyFirstAmount',lRabbitLinePayAmtQuarterlyFirstAmount)
				lreturn.put('RabbitLinePayAmtQuarterlyAmount',lRabbitLinePayAmtQuarterlyAmount)
				lreturn.put('RabbitLinePayAmtQuarterlyTotal',lRabbitLinePayAmtQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByMobileBanking(String strMobileBankingIsYearly,String strMobileBankingInstalment,String strMobileBankingCard,String strPaymentAutoRenew,String strPaymentTaxDeduction,String strPaymentEPolicy,String strMobileBankingSuccessCase){
		Map lreturn=[:]
		String lMobileBankingIsYearly=strMobileBankingIsYearly.trim()
		if(lMobileBankingIsYearly.length()<=0){
			lMobileBankingIsYearly=THACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_IS_YEARLY
		}
		String lMobileBankingInstalment=strMobileBankingInstalment.trim()
		if(lMobileBankingInstalment.length()<=0){
			lMobileBankingInstalment=THACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_INSTALMENT
		}
		String lMobileBankingCard=strMobileBankingCard.trim()
		if(lMobileBankingCard.length()<=0){
			lMobileBankingCard=THACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_CARD
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lMobileBankingSuccessCase=strMobileBankingSuccessCase.trim()
		if(lMobileBankingSuccessCase.length()<=0){
			lMobileBankingSuccessCase=THACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_SUCCESS_CASE
		}
		String lMobileBankingAmtYearly=''
		String lMobileBankingAmtDeposit=''
		String lMobileBankingAmtMonthly=''
		String lMobileBankingAmtInstalment=''
		String lMobileBankingAmtNoDepositFirstAmount=''
		String lMobileBankingAmtNoDepositAmount=''
		String lMobileBankingAmtNoDepositTotal=''
		String lMobileBankingAmtQuarterlyFirstAmount=''
		String lMobileBankingAmtQuarterlyAmount=''
		String lMobileBankingAmtQuarterlyTotal=''
		Map lMobileBankingCardList=['1':'bbl','2':'kbank','3':'ktb','4':'bay','5':'scb']
		try{
			Boolean lResult=false
			lreturn.put('MobileBankingIsYearly','')
			lreturn.put('MobileBankingInstalment','')
			lreturn.put('MobileBankingCard','')
			lreturn.put('PaymentAutoRenew','')
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('MobileBankingSuccessCase','')
			lreturn.put('MobileBankingAmtYearly','')
			lreturn.put('MobileBankingAmtDeposit','')
			lreturn.put('MobileBankingAmtMonthly','')
			lreturn.put('MobileBankingAmtInstalment','')
			lreturn.put('MobileBankingAmtNoDepositFirstAmount','')
			lreturn.put('MobileBankingAmtNoDepositAmount','')
			lreturn.put('MobileBankingAmtNoDepositTotal','')
			lreturn.put('MobileBankingAmtQuarterlyFirstAmount','')
			lreturn.put('MobileBankingAmtQuarterlyAmount','')
			lreturn.put('MobileBankingAmtQuarterlyTotal','')
			lreturn.put('Result',lResult)
			/*************************************************************************************************************************************************/
			String lMobileBankingCardItem=lMobileBankingCardList.get(lMobileBankingCard)
			if(!lMobileBankingCardItem){
				lMobileBankingCardItem=lMobileBankingCardList.get(THACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_CARD)
			}
			String lTagPaymentMethodModalForm=''
			String lLocatorPaymentMethodModalForm='#method-detail-modal'
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			Boolean lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(!lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			String lTagPaymentByMobileBankingSelectButtonKey='payment-method'
			String lTagPaymentByMobileBankingSelectButtonValue='mobile_banking'
			String lLocatorPaymentByMobileBankingSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByMobileBankingSelectButtonKey,lTagPaymentByMobileBankingSelectButtonValue)
			WebElement lElementPaymentByMobileBankingSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentMethodModalForm,lTagPaymentByMobileBankingSelectButtonKey,lTagPaymentByMobileBankingSelectButtonValue)
			if(!lElementPaymentByMobileBankingSelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByMobileBankingSelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByMobileBankingSelectButton)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentMethodModalForm,10)
			lIsPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentMethodModalForm)
			if(lIsPaymentMethodModalFormDisplayed){
				return lreturn
			}
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			String lTagPaymentInstalmentOptionSelectedButton='selected-installment-option'
			String lLocatorPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionSelectedButton)
			WebElement lElementPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionSelectedButton)
			if(!lElementPaymentInstalmentOptionSelectedButton){
				return lreturn
			}
			String lPaymentInstalmentOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentInstalmentOptionSelectedButton)
			String lTagPaymentInstalmentOptionItemButtonKey='installment-option'
			String lTagPaymentInstalmentOptionItemDefaultButtonValue=lPaymentInstalmentOptionSelectedValue
			String lLocatorPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			WebElement lElementPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
			if(!lElementPaymentInstalmentOptionItemDefaultButton){
				return lreturn
			}
			Boolean lIsMobileBankingIsYearly=IGNUemaHelper.convertStringToBoolean(lMobileBankingIsYearly)
			lMobileBankingIsYearly=''
			Integer lMobileBankingInstalmentMin=1
			Integer lMobileBankingInstalmentMax=3
			Integer lMobileBankingInstalmentDefault=2
			Integer lMobileBankingInstalmentNum=IGNUemaHelper.convertStringToInteger(lMobileBankingInstalment,lMobileBankingInstalmentDefault)
			if((lMobileBankingInstalmentNum<lMobileBankingInstalmentMin)||(lMobileBankingInstalmentNum>lMobileBankingInstalmentMax)){
				lMobileBankingInstalmentNum=lMobileBankingInstalmentDefault
			}
			lMobileBankingInstalment=''
			String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
			String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
			String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='12 months, no deposit'
			String lLocatorPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
			String lTagPaymentInstalmentOptionItemQuarterlyButtonValue='Quarterly'
			String lLocatorPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
			Integer lPaymentInstalmentOptionItemDefaultNum=0
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=1
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=2
			}
			if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemQuarterlyButtonValue)){
				lPaymentInstalmentOptionItemDefaultNum=3
			}
			if(!lIsMobileBankingIsYearly){
				if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
					if(lPaymentInstalmentOptionItemDefaultNum<=0){
						return lreturn
					}
				}
				switch(lMobileBankingInstalmentNum){
					case 1:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsMobileBankingIsYearly=true
							}else{
								lMobileBankingInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsMobileBankingIsYearly=true
							}else{
								lMobileBankingInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
								lIsMobileBankingIsYearly=true
							}else{
								lMobileBankingInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
							}
						}
						break
				}
			}
			if(!lIsMobileBankingIsYearly){
				switch(lMobileBankingInstalmentNum){
					case 1:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lMobileBankingInstalment='Monthly With Deposit'
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						lMobileBankingInstalment='Quarterly'
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lMobileBankingInstalment='Monthly No Deposit'
						break
				}
			}
			if(lIsMobileBankingIsYearly){
				if(!lElementPaymentInstalmentOptionItemYearlyButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
			}
			IGNUemaHelper.delayThreadSecond(3)
			lMobileBankingIsYearly=IGNUemaHelper.convertBooleanToYesNoString(lIsMobileBankingIsYearly)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			if(lIsMobileBankingIsYearly){
				lMobileBankingAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			}else{
				switch(lMobileBankingInstalmentNum){
					case 1:
						lMobileBankingAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lMobileBankingAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lMobileBankingAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lMobileBankingAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lMobileBankingAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lMobileBankingAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lMobileBankingAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lMobileBankingAmtNoDepositAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lMobileBankingAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsPaymentTaxDeduction=IGNUemaHelper.convertStringToBoolean(lPaymentTaxDeduction)
			String lTagCheckboxPaymentTaxDeduction='taxDeduction'
			String lLocatorCheckboxPaymentTaxDeduction=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxPaymentTaxDeduction)
			WebElement lElementCheckboxPaymentTaxDeduction=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxPaymentTaxDeduction)
			if(!lElementCheckboxPaymentTaxDeduction){
				lPaymentTaxDeduction='No Option'
			}else{
				String lCheckboxPaymentTaxDeductionStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
				if(lCheckboxPaymentTaxDeductionStageStr.equalsIgnoreCase('NO')){
					if(lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}else{
					if(!lIsPaymentTaxDeduction){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxPaymentTaxDeduction)
							}
						}
					}
				}
				lPaymentTaxDeduction=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxPaymentTaxDeduction)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lPaymentAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lPaymentAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lPaymentAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			Boolean lIsMobileBankingSuccessCase=IGNUemaHelper.convertStringToBoolean(lMobileBankingSuccessCase)
			String lTagButtonPaymentSubmit='mobileBankingType'
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonPaymentSubmit,lMobileBankingCardItem)
			if(!lElementButtonPaymentSubmit){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonPaymentSubmit)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				String lLocatorFormDisclaimer='#payment-accept-modal'
				Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
				lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
				if(lIsDisplayedFormDisclaimer){
					IGNUemaHelper.webJsScrollToBottom(this.driver)
					String lTagCheckboxDisclaimer='payment-accept-modal-checked'
					String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
					WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
					if(lElementCheckboxDisclaimer){
						String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
						if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
							if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}else{
								if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
									IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
								}
							}
						}
					}
					String lTagButtonConfirmPayment='payment-accept-modal-confirm'
					String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
					WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
					if(lElementButtonConfirmPayment){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
							}
						}
					}
				}
				String lLocatorFormOmise='#offsite-test-container'
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				Boolean lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(lValid){
					if(lIsMobileBankingSuccessCase){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lValid){
							lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lValid){
							lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
						}
					}
				}
				String lLocatorThankyouPage='#thankyou'
				String lLocatorAppDoc='#app'
				String lAppDocText=''
				String lCurrentURL=WebUI.getUrl()
				IGNUemaHelper.printLog(lCurrentURL)
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorThankyouPage,10)
				Boolean lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
				if(lIsDone){
					lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
					if(lAppDocText.length()<=0){
						lLocatorFormOmise='#offsite-test-container'
						lValid=false
						if(lCurrentURL.toUpperCase().contains('THANKYOU')){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
							lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
							if(lValid){
								if(lIsMobileBankingSuccessCase){
									lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
									if(!lValid){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
									}
								}else{
									lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
									if(!lValid){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
									}
								}
							}
							lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							if(!lIsDone){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
								IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
								lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
								if(lValid){
									if(lIsMobileBankingSuccessCase){
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
										if(!lValid){
											lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
										}
									}else{
										lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
										if(!lValid){
											lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
										}
									}
								}
								lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							}
						}
						lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
					}
					lAppDocText=''
				}
				if(lIsDone){
					String lTagPleaseWait=''
					String lLocatorPleaseWait='#loading'
					Boolean lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
					lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
					if(!lValid2){
						IGNUemaHelper.delayThreadSecond(2)
						lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
						lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
					}
					if(!lValid2){
						lResult=false
					}
					IGNUemaHelper.delayThreadSecond(10)
					lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
					String lTagButtonNext='nextProcess'
					String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
					WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(!lElementButtonNext){
						return lreturn
					}
					IGNUemaHelper.delayThreadSecond(10)
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,30)
				}
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsMobileBankingSuccessCase){
					lResult=true
				}
			}
			/*************************************************************************************************************************************************/
			if(lResult){
				lreturn.put('MobileBankingIsYearly',lMobileBankingIsYearly)
				lreturn.put('MobileBankingInstalment',lMobileBankingInstalment)
				lreturn.put('MobileBankingCard',lMobileBankingCardItem)
				lreturn.put('PaymentAutoRenew',lPaymentAutoRenew)
				lreturn.put('PaymentTaxDeduction',lPaymentTaxDeduction)
				lreturn.put('PaymentEPolicy',lPaymentEPolicy)
				lreturn.put('MobileBankingSuccessCase',lMobileBankingSuccessCase)
				lreturn.put('MobileBankingAmtYearly',lMobileBankingAmtYearly)
				lreturn.put('MobileBankingAmtDeposit',lMobileBankingAmtDeposit)
				lreturn.put('MobileBankingAmtMonthly',lMobileBankingAmtMonthly)
				lreturn.put('MobileBankingAmtInstalment',lMobileBankingAmtInstalment)
				lreturn.put('MobileBankingAmtNoDepositFirstAmount',lMobileBankingAmtNoDepositFirstAmount)
				lreturn.put('MobileBankingAmtNoDepositAmount',lMobileBankingAmtNoDepositAmount)
				lreturn.put('MobileBankingAmtNoDepositTotal',lMobileBankingAmtNoDepositTotal)
				lreturn.put('MobileBankingAmtQuarterlyFirstAmount',lMobileBankingAmtQuarterlyFirstAmount)
				lreturn.put('MobileBankingAmtQuarterlyAmount',lMobileBankingAmtQuarterlyAmount)
				lreturn.put('MobileBankingAmtQuarterlyTotal',lMobileBankingAmtQuarterlyTotal)
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
			lSalesforceProceedTodo=THACancerQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
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
			String lTagAutomationOpportunityNumber='qotation-no'
			String lLocatorAutomationOpportunityNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationOpportunityNumber)
			WebElement lElementAutomationOpportunityNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAutomationOpportunityNumber)
			if(!lElementAutomationOpportunityNumber){
				lAutomationOpportunityNumber='No Option'
			}else{
				lAutomationOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationOpportunityNumber)
				if(lAutomationOpportunityNumber.length()<=0){
					return lreturn
				}
			}
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-head-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			lAutomationPremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'fullPayment-totalPrice')).trim()
			if(lAutomationPremiumYearly.length()<=0){
				lAutomationPremiumYearly='No Option'
			}
			lAutomationPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			if(lAutomationPremiumDeposit.length()<=0){
				lAutomationPremiumDeposit='No Option'
			}
			lAutomationPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			if(lAutomationPremiumMonthly.length()<=0){
				lAutomationPremiumMonthly='No Option'
			}
			lAutomationPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			if(lAutomationPremiumInstalment.length()<=0){
				lAutomationPremiumInstalment='No Option'
			}
			lAutomationPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-permonth')).trim()
			if(lAutomationPremiumNoDepositAmount.length()<=0){
				lAutomationPremiumNoDepositAmount='No Option'
			}
			lAutomationPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			if(lAutomationPremiumNoDepositTotal.length()<=0){
				lAutomationPremiumNoDepositTotal='No Option'
			}
			lAutomationPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			if(lAutomationPremiumQuarterlyAmount.length()<=0){
				lAutomationPremiumQuarterlyAmount='No Option'
			}
			lAutomationPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lAutomationPremiumQuarterlyTotal.length()<=0){
				lAutomationPremiumQuarterlyTotal='No Option'
			}
			String lTagPaymentInstalmentOptionModalFormCloseButton='installment-modal-close'
			String lLocatorPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormCloseButton)
			WebElement lElementPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormCloseButton)
			if(lElementPaymentInstalmentOptionModalFormCloseButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			}
			lResult=lAutomationOpportunityNumber.length()>0
			if(lResult){
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
			String lTagSalesforceRetrieveDataOpportunityNumber='qotation-no'
			String lLocatorSalesforceRetrieveDataOpportunityNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagSalesforceRetrieveDataOpportunityNumber)
			WebElement lElementSalesforceRetrieveDataOpportunityNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSalesforceRetrieveDataOpportunityNumber)
			if(!lElementSalesforceRetrieveDataOpportunityNumber){
				lSalesforceRetrieveDataOpportunityNumber='No Option'
			}else{
				lSalesforceRetrieveDataOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSalesforceRetrieveDataOpportunityNumber)
				if(lSalesforceRetrieveDataOpportunityNumber.length()<=0){
					return lreturn
				}
			}
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-head-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			lSalesforceRetrieveDataPremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'fullPayment-totalPrice')).trim()
			if(lSalesforceRetrieveDataPremiumYearly.length()<=0){
				lSalesforceRetrieveDataPremiumYearly='No Option'
			}
			lSalesforceRetrieveDataPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			if(lSalesforceRetrieveDataPremiumDeposit.length()<=0){
				lSalesforceRetrieveDataPremiumDeposit='No Option'
			}
			lSalesforceRetrieveDataPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			if(lSalesforceRetrieveDataPremiumMonthly.length()<=0){
				lSalesforceRetrieveDataPremiumMonthly='No Option'
			}
			lSalesforceRetrieveDataPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			if(lSalesforceRetrieveDataPremiumInstalment.length()<=0){
				lSalesforceRetrieveDataPremiumInstalment='No Option'
			}
			lSalesforceRetrieveDataPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-permonth')).trim()
			if(lSalesforceRetrieveDataPremiumNoDepositAmount.length()<=0){
				lSalesforceRetrieveDataPremiumNoDepositAmount='No Option'
			}
			lSalesforceRetrieveDataPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			if(lSalesforceRetrieveDataPremiumNoDepositTotal.length()<=0){
				lSalesforceRetrieveDataPremiumNoDepositTotal='No Option'
			}
			lSalesforceRetrieveDataPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			if(lSalesforceRetrieveDataPremiumQuarterlyAmount.length()<=0){
				lSalesforceRetrieveDataPremiumQuarterlyAmount='No Option'
			}
			lSalesforceRetrieveDataPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lSalesforceRetrieveDataPremiumQuarterlyTotal.length()<=0){
				lSalesforceRetrieveDataPremiumQuarterlyTotal='No Option'
			}
			String lTagPaymentInstalmentOptionModalFormCloseButton='installment-modal-close'
			String lLocatorPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormCloseButton)
			WebElement lElementPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormCloseButton)
			if(lElementPaymentInstalmentOptionModalFormCloseButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			}
			lResult=lSalesforceRetrieveDataOpportunityNumber.length()>0
			if(lResult){
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
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput){
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
			String lAutomationPaymentFrequency=''
			String lSalesforcePaymentFrequency=''
			Boolean lIsPaymentFrequency=false
			String lAutomationYearly=''
			String lSalesforceYearly=''
			Float lAutomationYearlyNumber=0
			Float lSalesforceYearlyNumber=0
			Float lYearlyPrice=0
			String lAutomationPremiumNoDepositAmount=''
			String lSalesforcePremiumNoDepositAmount=''
			Float lAutomationPremiumNoDepositAmountNumber=0
			Float lSalesforcePremiumNoDepositAmountNumber=0
			Float lPremiumNoDepositAmountPrice=0
			String lAutomationPremiumNoDepositTotal=''
			String lSalesforcePremiumNoDepositTotal=''
			Float lAutomationPremiumNoDepositTotalNumber=0
			Float lSalesforcePremiumNoDepositTotalNumber=0
			Float lPremiumNoDepositTotalPrice=0
			switch(THACancerCoreType.CURRENT_QUOTATION_PAYMENT_METHOD){
				case '2':
					lAutomationYearly=caseOutput.AutomationPremiumYearly
					lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
						lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
						lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
						lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
						if(lYearlyPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					break
				case '3':
					lAutomationYearly=caseOutput.AutomationPremiumYearly
					lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
						lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
						lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
						lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
						if(lYearlyPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					break
				case '4':
					lAutomationPaymentFrequency=caseOutput.TrueMoneyIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.AutomationPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTwelveMonthlyPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				case '5':
					lAutomationPaymentFrequency=caseOutput.RabbitLinePayIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.AutomationPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTwelveMonthlyPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				case '6':
					lAutomationPaymentFrequency=caseOutput.MobileBankingIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.AutomationPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTwelveMonthlyPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				default:
					lAutomationPaymentFrequency=caseOutput.CcIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.AutomationPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTwelveMonthlyPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
			}
			if(!IGNUemaHelper.checkStringContainString(THACancerCoreType.CURRENT_QUOTATION_PAYMENT_METHOD,'3')){
				String lSalesforceTransaction=caseOutput.SalesforceVerifyDataOpportunityObjStagename
				if(!IGNUemaHelper.checkStringContainString(lSalesforceTransaction,'Closed Won')){
					lIsOK=false
					lText='Transaction='+lSalesforceTransaction
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
				String lSalesforcePaidOnline=caseOutput.SalesforceVerifyDataOpportunityObjIsPaidOnlineC
				Boolean lIsPaidOnline=IGNUemaHelper.convertStringToBoolean(lSalesforcePaidOnline)
				if(!lIsPaidOnline){
					String lSalesforcePaidOnlineSF=caseOutput.SalesforceVerifyDataOpportunityObjPaymentInitiatedFromSfC
					Boolean lIsPaidOnlineSF=IGNUemaHelper.convertStringToBoolean(lSalesforcePaidOnlineSF)
					if(!lIsPaidOnlineSF){
						lIsOK=false
						lText='Paid Online='+lSalesforcePaidOnline
						lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,'Paid OnlineSF='+lSalesforcePaidOnlineSF)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}
				String lSalesforceOutstandingBalanceC=caseOutput.SalesforceVerifyDataOpportunityObjOutstandingBalanceC
				Float lOutstandingBalance=IGNUemaHelper.convertStringToFloat(lSalesforceOutstandingBalanceC,0)
				if(lOutstandingBalance<1){
					for(Integer lIndex=0;lIndex<=5;lIndex++){
						Integer lItemIndex=lIndex+1
						String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
						String lQuoteLineItem=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverCodeC')
						if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'CANCER')){
							String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
							if(lQuoteLineItemTaxInvoice.length()<=0){
								lIsOK=false
								lText='TaxInvoice CANCER'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'HIB')){
							String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
							if(lQuoteLineItemTaxInvoice.length()<=0){
								lIsOK=false
								lText='TaxInvoice HIB'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
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
			lSalesforceProceedRetrieveTodo=THACancerQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
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
				String lLocatorResultPage='#illness-payment'
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
					lRedirected=lCurrentURL.toUpperCase().contains('PAYMENT')
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
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lLocatorReviewDocument='#new-paymentComplete'
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorReviewDocument,15)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorReviewDocument,15)
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
	public Map inputPolicyInsurer(String strPolicyInsurer){
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