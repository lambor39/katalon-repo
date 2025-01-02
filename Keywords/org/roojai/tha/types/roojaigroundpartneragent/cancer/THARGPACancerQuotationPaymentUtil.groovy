package org.roojai.tha.types.roojaigroundpartneragent.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaicancer.THACancerQuotationPaymentUtil
import org.roojai.tha.types.roojaicancer.THACancerCoreType as THACancerCoreType
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THARGPACancerQuotationPaymentUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THACancerQuotationPaymentUtil lTHACancerQuotationPaymentUtil=null
	public THARGPACancerQuotationPaymentUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THACancerQuotationPaymentUtil getlTHACancerQuotationPaymentUtil(){
		return this.lTHACancerQuotationPaymentUtil
	}
	private void setlTHACancerQuotationPaymentUtil(THACancerQuotationPaymentUtil newlTHACancerQuotationPaymentUtil){
		//Do Nothing
		//this.lTHACancerQuotationPaymentUtil=newlTHACancerQuotationPaymentUtil
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
			this.lTHACancerQuotationPaymentUtil=new THACancerQuotationPaymentUtil(this.driver,this.selenium)
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
			this.lTHACancerQuotationPaymentUtil.waitUntilOpportunityNumberUpdated()
			THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
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
					Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPACancerCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT)
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
			THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_METHOD=lPaymentMethod
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
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
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
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
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
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_CARD=lMobileBankingCard
					THARGPACancerCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_SUCCESS_CASE=lMobileBankingSuccessCase
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
			this.lTHACancerQuotationPaymentUtil.waitUntilOpportunityNumberUpdated()
			THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			if(lIsActualResult){
				lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPACancerCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
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
			lPositiveCase=THARGPACancerQuotationPaymentType.DEFAULT_POSITIVE_CASE
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
			lLanguage=THARGPACancerQuotationPaymentType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHACancerQuotationPaymentUtil.inputLanguage(lLanguage)
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
	public Map inputOpportunityNumber(){
		Map lreturn=[:]
		String lOpportunityNumber=''
		try{
			Boolean lResult=false
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			Map lMapOpportunityNumber=this.lTHACancerQuotationPaymentUtil.inputOpportunityNumber()
			if(!lMapOpportunityNumber.Result){
				lOpportunityNumber=''
			}else{
				lOpportunityNumber=lMapOpportunityNumber.OpportunityNumber
			}
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
		String lPaymentMethod=strPaymentMethod.toUpperCase().trim()
		if(lPaymentMethod.length()<=0){
			lPaymentMethod=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_METHOD
		}
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			Map lMapPaymentMethod=this.lTHACancerQuotationPaymentUtil.inputPaymentMethod(lPaymentMethod)
			if(!lMapPaymentMethod.Result){
				lPaymentMethod=''
			}else{
				lPaymentMethod=lMapPaymentMethod.PaymentMethod
			}
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
			lPaymentTaxDeduction=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lQrAmtYearly=''
		try{
			Boolean lResult=false
			lreturn.put('PaymentTaxDeduction','')
			lreturn.put('PaymentEPolicy','')
			lreturn.put('QrAmtYearly','')
			lreturn.put('Result',lResult)
			Map lMapPaymentByQR=this.lTHACancerQuotationPaymentUtil.inputPaymentByQR(lPaymentTaxDeduction,lPaymentEPolicy)
			if(!lMapPaymentByQR.Result){
				lPaymentTaxDeduction=''
				lPaymentEPolicy=''
				lQrAmtYearly=''
			}else{
				lPaymentTaxDeduction=lMapPaymentByQR.PaymentTaxDeduction
				lPaymentEPolicy=lMapPaymentByQR.PaymentEPolicy
				lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
			}
			lResult=lMapPaymentByQR.Result
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
		String lIbBank=strIbBank.toUpperCase().trim()
		if(lIbBank.length()<=0){
			lIbBank=THARGPACancerQuotationPaymentType.DEFAULT_IB_BANK
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lIbSuccessCase=strIbSuccessCase.trim()
		if(lIbSuccessCase.length()<=0){
			lIbSuccessCase=THARGPACancerQuotationPaymentType.DEFAULT_IB_SUCCESS_CASE
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
			Map lMapPaymentByIB=this.lTHACancerQuotationPaymentUtil.inputPaymentByIB(lIbBank,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lIbSuccessCase)
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
			lResult=lMapPaymentByIB.Result
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
			lCcIsYearly=THARGPACancerQuotationPaymentType.DEFAULT_CC_IS_YEARLY
		}
		String lCcIsInstalment=strCcIsInstalment.trim()
		if(lCcIsInstalment.length()<=0){
			lCcIsInstalment=THARGPACancerQuotationPaymentType.DEFAULT_CC_IS_INSTALMENT
		}
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THARGPACancerQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THARGPACancerQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THARGPACancerQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THARGPACancerQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THARGPACancerQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THARGPACancerQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THARGPACancerQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
		}
		String lCcAmtYearly=''
		String lCcAmtDeposit=''
		String lCcAmtMonthly=''
		String lCcAmtInstalment=''
		String lCcAmtNoDepositAmount=''
		String lCcAmtNoDepositTotal=''
		String lCcAmtQuarterlyAmount=''
		String lCcAmtQuarterlyTotal=''
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
			Map lMapPaymentByCC=this.lTHACancerQuotationPaymentUtil.inputPaymentByCC(lCcIsYearly,lCcIsInstalment,lCcNumber,lCcName,lCcExpiryMonth,lCcExpiryYear,lCcCvv,lCcBank,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lCcSuccessCase)
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
			lResult=lMapPaymentByCC.Result
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
			lTrueMoneyIsYearly=THARGPACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_YEARLY
		}
		String lTrueMoneyInstalment=strTrueMoneyInstalment.trim()
		if(lTrueMoneyInstalment.length()<=0){
			lTrueMoneyInstalment=THARGPACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_INSTALMENT
		}
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THARGPACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THARGPACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_EMAIL
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THARGPACancerQuotationPaymentType.DEFAULT_TRUE_MONEY_SUCCESS_CASE
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
			Map lMapPaymentByTrueMoney=this.lTHACancerQuotationPaymentUtil.inputPaymentByTrueMoney(lTrueMoneyIsYearly,lTrueMoneyInstalment,lTrueMoneyMobileNo,lTrueMoneyEmail,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lTrueMoneySuccessCase)
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
			lResult=lMapPaymentByTrueMoney.Result
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
			lRabbitLinePayIsYearly=THARGPACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lRabbitLinePayInstalment=strRabbitLinePayInstalment.trim()
		if(lRabbitLinePayInstalment.length()<=0){
			lRabbitLinePayInstalment=THARGPACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_INSTALMENT
		}
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THARGPACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THARGPACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_EMAIL
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THARGPACancerQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE
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
			Map lMapPaymentByRabbitLinePay=this.lTHACancerQuotationPaymentUtil.inputPaymentByRabbitLinePay(lRabbitLinePayIsYearly,lRabbitLinePayInstalment,lRabbitLinePayMobileNo,lRabbitLinePayEmail,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lRabbitLinePaySuccessCase)
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
			lResult=lMapPaymentByRabbitLinePay.Result
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
			lMobileBankingIsYearly=THARGPACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_IS_YEARLY
		}
		String lMobileBankingInstalment=strMobileBankingInstalment.trim()
		if(lMobileBankingInstalment.length()<=0){
			lMobileBankingInstalment=THARGPACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_INSTALMENT
		}
		String lMobileBankingCard=strMobileBankingCard.trim()
		if(lMobileBankingCard.length()<=0){
			lMobileBankingCard=THARGPACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_CARD
		}
		String lPaymentAutoRenew=strPaymentAutoRenew.trim()
		if(lPaymentAutoRenew.length()<=0){
			lPaymentAutoRenew=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_AUTO_RENEW
		}
		String lPaymentTaxDeduction=strPaymentTaxDeduction.trim()
		if(lPaymentTaxDeduction.length()<=0){
			lPaymentTaxDeduction=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_TAX_DEDUCTION
		}
		String lPaymentEPolicy=strPaymentEPolicy.trim()
		if(lPaymentEPolicy.length()<=0){
			lPaymentEPolicy=THARGPACancerQuotationPaymentType.DEFAULT_PAYMENT_E_POLICY
		}
		String lMobileBankingSuccessCase=strMobileBankingSuccessCase.trim()
		if(lMobileBankingSuccessCase.length()<=0){
			lMobileBankingSuccessCase=THARGPACancerQuotationPaymentType.DEFAULT_MOBILE_BANKING_SUCCESS_CASE
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
		try{
			Boolean lResult=false
			lreturn.put('MobileBankingIsYearly','')
			lreturn.put('MobileBankingInstalment','')
			lreturn.put('MobileBankingMobileNo','')
			lreturn.put('MobileBankingEmail','')
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
			Map lMapPaymentByMobileBanking=this.lTHACancerQuotationPaymentUtil.inputPaymentByMobileBanking(lMobileBankingIsYearly,lMobileBankingInstalment,lMobileBankingCard,lPaymentAutoRenew,lPaymentTaxDeduction,lPaymentEPolicy,lMobileBankingSuccessCase)
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
			lResult=lMapPaymentByMobileBanking.Result
			if(lResult){
				lreturn.put('MobileBankingIsYearly',lMobileBankingIsYearly)
				lreturn.put('MobileBankingInstalment',lMobileBankingInstalment)
				lreturn.put('MobileBankingCard',lMobileBankingCard)
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
			Map lMapActualResult=this.lTHACancerQuotationPaymentUtil.inputActualResult(isPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			lResult=lMapActualResult.Result
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THARGPACancerQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHACancerQuotationPaymentUtil.inputSalesforceProceedTodo(lSalesforceProceedTodo)
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
			Map lMapAutomationDataBefore=this.lTHACancerQuotationPaymentUtil.inputAutomationDataBefore()
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
			Map lMapAutomationDataAfter=this.lTHACancerQuotationPaymentUtil.inputAutomationDataAfter()
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
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result','')
			Map lMapSalesforceProceedVerifyBefore=this.lTHACancerQuotationPaymentUtil.inputSalesforceProceedVerifyBefore(caseOutput)
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
			Map lMapSalesforceProceedVerifyAfter=this.lTHACancerQuotationPaymentUtil.inputSalesforceProceedVerifyAfter(caseOutput)
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
			lSalesforceProceedRetrieveTodo=THARGPACancerQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lTHACancerQuotationPaymentUtil.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
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
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lTHACancerQuotationPaymentUtil.inputSalesforceProceedRetrieveWebFromUrl(strRetrievePageURL)
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
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			Map lMapPolicyInsurer=this.lTHACancerQuotationPaymentUtil.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			lResult=lPolicyInsurer.length()>0
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