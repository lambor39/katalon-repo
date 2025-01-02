package org.roojai.tha.types.roojaigroundpartneragent.electricmotorcar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.electricmotorcar.THAElectricMotorCarCoreType as THAElectricMotorCarCoreType
import org.roojai.tha.types.electricmotorcar.THAElectricMotorCarQuotationPaymentUtil
import org.roojai.tha.types.electricmotorcar.THAElectricMotorCarQuotationPaymentUtilOld
public class THARGPAElectricMotorCarQuotationPaymentUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lTHAElectricMotorCarQuotationPaymentUtil=null
	private Boolean lIsSalesforceProceedRetrieveWebFromUrlSuccess=false
	public THARGPAElectricMotorCarQuotationPaymentUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAElectricMotorCarQuotationPaymentUtil getlTHAElectricMotorCarQuotationPaymentUtil(){
		return this.lTHAElectricMotorCarQuotationPaymentUtil
	}
	private void setlTHAElectricMotorCarQuotationPaymentUtil(THAElectricMotorCarQuotationPaymentUtil newlTHAElectricMotorCarQuotationPaymentUtil){
		//Do Nothing
		//this.lTHAElectricMotorCarQuotationPaymentUtil=newlTHAElectricMotorCarQuotationPaymentUtil
	}
	public Boolean checkBlockRenewalCustomer(){
		Boolean lreturn=true
		try{
			String lTagBlockRenewalCustomer='insure-modal'
			String lLocatorBlockRenewalCustomer=IGNUemaHelper.getTagDataSeleniumKey(lTagBlockRenewalCustomer)
			WebElement lElementBlockRenewalCustomer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBlockRenewalCustomer)
			if(lElementBlockRenewalCustomer){
				Boolean lIsBlockRenewalCustomerFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByElementJs(this.driver,lElementBlockRenewalCustomer)
				if(lIsBlockRenewalCustomerFormDisplayed){
					lreturn=false
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPayment(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lPaymentMethod=caseInput.PaymentMethod.toString().trim()
		String lCcIsYearly=caseInput.CcIsYearly.toString().trim()
		String lCcInstalment=caseInput.CcInstalment.toString().trim()
		String lCcNumber=caseInput.CcNumber.toString().trim()
		String lCcName=caseInput.CcName.toString().trim()
		String lCcExpiryMonth=caseInput.CcExpiryMonth.toString().trim()
		String lCcExpiryYear=caseInput.CcExpiryYear.toString().trim()
		String lCcCvv=caseInput.CcCvv.toString().trim()
		String lCcBank=caseInput.CcBank.toString().trim()
		String lCcSuccessCase=caseInput.CcSuccessCase.toString().trim()
		String lIbBank=caseInput.IbBank.toString().trim()
		String lIbSuccessCase=caseInput.IbSuccessCase.toString().trim()
		String lQrIsYearly=caseInput.QrIsYearly.toString().trim()
		String lQrInstalment=caseInput.QrInstalment.toString().trim()
		String lQrSuccessCase=caseInput.QrSuccessCase.toString().trim()
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
		String lEPolicy=caseInput.EPolicy.toString().trim()
		String lAutoRenew=caseInput.AutoRenew.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lCcAmtYearly=''
		String lCcAmtDeposit=''
		String lCcAmtMonthly=''
		String lCcAmtInstalment=''
		String lCcAmtNoDepositAmount=''
		String lCcAmtNoDepositFirstAmount=''
		String lCcAmtNoDepositTotal=''
		String lCcAmtQuarterlyFirstAmount=''
		String lCcAmtQuarterlyAmount=''
		String lCcAmtQuarterlyTotal=''
		String lIbAmtYearly=''
		String lQrAmtYearly=''
		String lQrAmtDeposit=''
		String lQrAmtMonthly=''
		String lQrAmtInstalment=''
		String lQrAmtNoDepositFirstAmount=''
		String lQrAmtNoDepositAmount=''
		String lQrAmtNoDepositTotal=''
		String lQrAmtQuarterlyFirstAmount=''
		String lQrAmtQuarterlyAmount=''
		String lQrAmtQuarterlyTotal=''
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
			//Check QuoteApplication
			THARGPAElectricMotorCarCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION=IGNUemaHelper.checkWebDriverURLTargetUnderQuoteApplication(driver)
			if(THARGPAElectricMotorCarCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION){
				this.lTHAElectricMotorCarQuotationPaymentUtil=new THAElectricMotorCarQuotationPaymentUtil(this.driver,this.selenium)
			}else{
				this.lTHAElectricMotorCarQuotationPaymentUtil=new THAElectricMotorCarQuotationPaymentUtilOld(this.driver,this.selenium)
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
			Boolean lIsBlockRenewalCustomer=this.checkBlockRenewalCustomer()
			if(!lIsBlockRenewalCustomer){
				return lreturn
			}
			Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
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
			Boolean lIsSalesforceProceedRetrieveTodo=false
			if(lIsSalesforceProceedTodo){
				Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
				if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
					lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
				}
				THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
				THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
				THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
				lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
				lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
				caseOutput.ActualResult=lActualResult
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
					lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
					if(lIsSalesforceProceedRetrieveTodo){
						Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT)
						lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						lIsSalesforceProceedRetrieveWebFromUrlSuccess=lActualResult
						if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
							return lreturn
						}
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
			if(lIsSalesforceProceedRetrieveTodo){
				if(lIsActualResult){
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
				}
			}
			Map lMapPaymentMethod=this.inputPaymentMethod(lPaymentMethod)
			if(!lMapPaymentMethod.Result){
				lPaymentMethod=''
			}else{
				lPaymentMethod=lMapPaymentMethod.PaymentMethod
			}
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD=lPaymentMethod
			caseOutput.PaymentMethod=lPaymentMethod
			if(lPaymentMethod.length()<=0){
				return lreturn
			}
			switch(lPaymentMethod){
				case '2':
					Map lMapPaymentByIB=this.inputPaymentByIB(lIbBank,lEPolicy,lAutoRenew,lIbSuccessCase)
					if(!lMapPaymentByIB.Result){
						lIbBank=''
						lEPolicy=''
						lAutoRenew=''
						lIbSuccessCase=''
						lIbAmtYearly=''
					}else{
						lIbBank=lMapPaymentByIB.IbBank
						lEPolicy=lMapPaymentByIB.EPolicy
						lAutoRenew=lMapPaymentByIB.AutoRenew
						lIbSuccessCase=lMapPaymentByIB.IbSuccessCase
						lIbAmtYearly=lMapPaymentByIB.IbAmtYearly
					}
					caseOutput.IbBank=lIbBank
					caseOutput.EPolicy=lEPolicy
					caseOutput.AutoRenew=lAutoRenew
					caseOutput.IbSuccessCase=lIbSuccessCase
					caseOutput.IbAmtYearly=lIbAmtYearly
					if(!lMapPaymentByIB.Result){
						return lreturn
					}
					break
				case '3':
					Map lMapPaymentByQR=this.inputPaymentByQR(lQrIsYearly,lQrInstalment,lEPolicy,lQrSuccessCase)
					if(!lMapPaymentByQR.Result){
						lQrIsYearly=''
						lQrInstalment=''
						lEPolicy=''
						lQrSuccessCase=''
						lQrAmtYearly=''
						lQrAmtDeposit=''
						lQrAmtMonthly=''
						lQrAmtInstalment=''
						lQrAmtNoDepositFirstAmount=''
						lQrAmtNoDepositAmount=''
						lQrAmtNoDepositTotal=''
						lQrAmtQuarterlyFirstAmount=''
						lQrAmtQuarterlyAmount=''
						lQrAmtQuarterlyTotal=''
					}else{
						lQrIsYearly=lMapPaymentByQR.QrIsYearly
						lQrInstalment=lMapPaymentByQR.QrInstalment
						lEPolicy=lMapPaymentByQR.EPolicy
						lQrSuccessCase=lMapPaymentByQR.QrSuccessCase
						lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
						lQrAmtDeposit=lMapPaymentByQR.QrAmtDeposit
						lQrAmtMonthly=lMapPaymentByQR.QrAmtMonthly
						lQrAmtInstalment=lMapPaymentByQR.QrAmtInstalment
						lQrAmtNoDepositFirstAmount=lMapPaymentByQR.QrAmtNoDepositFirstAmount
						lQrAmtNoDepositAmount=lMapPaymentByQR.QrAmtNoDepositAmount
						lQrAmtNoDepositTotal=lMapPaymentByQR.QrAmtNoDepositTotal
						lQrAmtQuarterlyFirstAmount=lMapPaymentByQR.QrAmtQuarterlyFirstAmount
						lQrAmtQuarterlyAmount=lMapPaymentByQR.QrAmtQuarterlyAmount
						lQrAmtQuarterlyTotal=lMapPaymentByQR.QrAmtQuarterlyTotal
					}
					caseOutput.QrIsYearly=lQrIsYearly
					caseOutput.QrInstalment=lQrInstalment
					caseOutput.EPolicy=lEPolicy
					caseOutput.QrSuccessCase=lQrSuccessCase
					caseOutput.QrAmtYearly=lQrAmtYearly
					caseOutput.QrAmtDeposit=lQrAmtDeposit
					caseOutput.QrAmtMonthly=lQrAmtMonthly
					caseOutput.QrAmtInstalment=lQrAmtInstalment
					caseOutput.QrAmtNoDepositFirstAmount=lQrAmtNoDepositFirstAmount
					caseOutput.QrAmtNoDepositAmount=lQrAmtNoDepositAmount
					caseOutput.QrAmtNoDepositTotal=lQrAmtNoDepositTotal
					caseOutput.QrAmtQuarterlyFirstAmount=lQrAmtQuarterlyFirstAmount
					caseOutput.QrAmtQuarterlyAmount=lQrAmtQuarterlyAmount
					caseOutput.QrAmtQuarterlyTotal=lQrAmtQuarterlyTotal
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_QR_CODE_SUCCESS_CASE=lQrSuccessCase
					if(!lMapPaymentByQR.Result){
						return lreturn
					}
					break
				case '4':
					Map lMapPaymentByTrueMoney=this.inputPaymentByTrueMoney(lTrueMoneyIsYearly,lTrueMoneyInstalment,lTrueMoneyMobileNo,lTrueMoneyEmail,lEPolicy,lAutoRenew,lTrueMoneySuccessCase)
					if(!lMapPaymentByTrueMoney.Result){
						lTrueMoneyIsYearly=''
						lTrueMoneyInstalment=''
						lTrueMoneyMobileNo=''
						lTrueMoneyEmail=''
						lEPolicy=''
						lAutoRenew=''
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
						lEPolicy=lMapPaymentByTrueMoney.EPolicy
						lAutoRenew=lMapPaymentByTrueMoney.AutoRenew
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
					caseOutput.EPolicy=lEPolicy
					caseOutput.AutoRenew=lAutoRenew
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
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
					if(!lMapPaymentByTrueMoney.Result){
						return lreturn
					}
					break
				case '5':
					Map lMapPaymentByRabbitLinePay=this.inputPaymentByRabbitLinePay(lRabbitLinePayIsYearly,lRabbitLinePayInstalment,lRabbitLinePayMobileNo,lRabbitLinePayEmail,lEPolicy,lAutoRenew,lRabbitLinePaySuccessCase)
					if(!lMapPaymentByRabbitLinePay.Result){
						lRabbitLinePayIsYearly=''
						lRabbitLinePayInstalment=''
						lRabbitLinePayMobileNo=''
						lRabbitLinePayEmail=''
						lEPolicy=''
						lAutoRenew=''
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
						lEPolicy=lMapPaymentByRabbitLinePay.EPolicy
						lAutoRenew=lMapPaymentByRabbitLinePay.AutoRenew
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
					caseOutput.EPolicy=lEPolicy
					caseOutput.AutoRenew=lAutoRenew
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
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
					if(!lMapPaymentByRabbitLinePay.Result){
						return lreturn
					}
					break
				case '6':
					Map lMapPaymentByMobileBanking=this.inputPaymentByMobileBanking(lMobileBankingIsYearly,lMobileBankingInstalment,lMobileBankingCard,lEPolicy,lAutoRenew,lMobileBankingSuccessCase)
					if(!lMapPaymentByMobileBanking.Result){
						lMobileBankingIsYearly=''
						lMobileBankingInstalment=''
						lMobileBankingCard=''
						lEPolicy=''
						lAutoRenew=''
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
						lEPolicy=lMapPaymentByMobileBanking.EPolicy
						lAutoRenew=lMapPaymentByMobileBanking.AutoRenew
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
					caseOutput.EPolicy=lEPolicy
					caseOutput.AutoRenew=lAutoRenew
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
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_CARD=lMobileBankingCard
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_SUCCESS_CASE=lMobileBankingSuccessCase
					if(!lMapPaymentByMobileBanking.Result){
						return lreturn
					}
					break
				default:
					Map lMapPaymentByCC=this.inputPaymentByCC(lCcIsYearly,lCcInstalment,lCcNumber,lCcName,lCcExpiryMonth,lCcExpiryYear,lCcCvv,lCcBank,lEPolicy,lAutoRenew,lCcSuccessCase)
					if(!lMapPaymentByCC.Result){
						lCcIsYearly=''
						lCcInstalment=''
						lCcNumber=''
						lCcName=''
						lCcExpiryMonth=''
						lCcExpiryYear=''
						lCcCvv=''
						lCcBank=''
						lEPolicy=''
						lAutoRenew=''
						lCcSuccessCase=''
						lCcAmtYearly=''
						lCcAmtDeposit=''
						lCcAmtMonthly=''
						lCcAmtInstalment=''
						lCcAmtNoDepositFirstAmount=''
						lCcAmtNoDepositAmount=''
						lCcAmtNoDepositTotal=''
						lCcAmtQuarterlyFirstAmount=''
						lCcAmtQuarterlyAmount=''
						lCcAmtQuarterlyTotal=''
					}else{
						lCcIsYearly=lMapPaymentByCC.CcIsYearly
						lCcInstalment=lMapPaymentByCC.CcInstalment
						lCcNumber=lMapPaymentByCC.CcNumber
						lCcName=lMapPaymentByCC.CcName
						lCcExpiryMonth=lMapPaymentByCC.CcExpiryMonth
						lCcExpiryYear=lMapPaymentByCC.CcExpiryYear
						lCcCvv=lMapPaymentByCC.CcCvv
						lCcBank=lMapPaymentByCC.CcBank
						lEPolicy=lMapPaymentByCC.EPolicy
						lAutoRenew=lMapPaymentByCC.AutoRenew
						lCcSuccessCase=lMapPaymentByCC.CcSuccessCase
						lCcAmtYearly=lMapPaymentByCC.CcAmtYearly
						lCcAmtDeposit=lMapPaymentByCC.CcAmtDeposit
						lCcAmtMonthly=lMapPaymentByCC.CcAmtMonthly
						lCcAmtInstalment=lMapPaymentByCC.CcAmtInstalment
						lCcAmtNoDepositFirstAmount=lMapPaymentByCC.CcAmtNoDepositFirstAmount
						lCcAmtNoDepositAmount=lMapPaymentByCC.CcAmtNoDepositAmount
						lCcAmtNoDepositTotal=lMapPaymentByCC.CcAmtNoDepositTotal
						lCcAmtQuarterlyFirstAmount=lMapPaymentByCC.CcAmtQuarterlyFirstAmount
						lCcAmtQuarterlyAmount=lMapPaymentByCC.CcAmtQuarterlyAmount
						lCcAmtQuarterlyTotal=lMapPaymentByCC.CcAmtQuarterlyTotal
					}
					caseOutput.CcIsYearly=lCcIsYearly
					caseOutput.CcInstalment=lCcInstalment
					caseOutput.CcNumber=lCcNumber
					caseOutput.CcName=lCcName
					caseOutput.CcExpiryMonth=lCcExpiryMonth
					caseOutput.CcExpiryYear=lCcExpiryYear
					caseOutput.CcCvv=lCcCvv
					caseOutput.CcBank=lCcBank
					caseOutput.EPolicy=lEPolicy
					caseOutput.AutoRenew=lAutoRenew
					caseOutput.CcSuccessCase=lCcSuccessCase
					caseOutput.CcAmtYearly=lCcAmtYearly
					caseOutput.CcAmtDeposit=lCcAmtDeposit
					caseOutput.CcAmtMonthly=lCcAmtMonthly
					caseOutput.CcAmtInstalment=lCcAmtInstalment
					caseOutput.CcAmtNoDepositFirstAmount=lCcAmtNoDepositFirstAmount
					caseOutput.CcAmtNoDepositAmount=lCcAmtNoDepositAmount
					caseOutput.CcAmtNoDepositTotal=lCcAmtNoDepositTotal
					caseOutput.CcAmtQuarterlyFirstAmount=lCcAmtQuarterlyFirstAmount
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
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
					if(lIsActualResult){
						Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput)
						lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(!lMapSalesforceProceedVerifyBefore.Result){
							return lreturn
						}
					}
					if(lIsActualResult){
						if(lIsSalesforceProceedRetrieveTodo){
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
			lreturn=lIsActualResult
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
			lPositiveCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_POSITIVE_CASE
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
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			if(THARGPAElectricMotorCarCoreType.CURRENT_SKIP_PAGE_DETAIL2){
				isPositiveCase=false
			}
			Map lMapActualResult=this.lTHAElectricMotorCarQuotationPaymentUtil.inputActualResult(isPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
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
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAElectricMotorCarQuotationPaymentUtil.inputLanguage(lLanguage)
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
			Map lMapOpportunityNumber=this.lTHAElectricMotorCarQuotationPaymentUtil.inputOpportunityNumber()
			if(!lMapOpportunityNumber.Result){
				lOpportunityNumber=''
			}else{
				lOpportunityNumber=lMapOpportunityNumber.OpportunityNumber
				THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=THAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
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
		String lPaymentMethod=strPaymentMethod.trim()
		if(lPaymentMethod.length()<=0){
			lPaymentMethod=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_PAYMENT_METHOD
		}
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			Map lMapPaymentMethod=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentMethod(lPaymentMethod)
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
	public Map inputPaymentByQR(String strQrIsYearly,String strQrInstalment,String strEPolicy,String strQrSuccessCase){
		Map lreturn=[:]
		String lQrIsYearly=strQrIsYearly.trim()
		if(lQrIsYearly.length()<=0){
			lQrIsYearly=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_QR_IS_YEARLY
		}
		String lQrInstalment=strQrInstalment.trim()
		if(lQrInstalment.length()<=0){
			lQrInstalment=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_QR_INSTALMENT
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lQrSuccessCase=strQrSuccessCase.trim()
		if(lQrSuccessCase.length()<=0){
			lQrSuccessCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_QR_SUCCESS_CASE
		}
		String lQrAmtYearly=''
		String lQrAmtDeposit=''
		String lQrAmtMonthly=''
		String lQrAmtInstalment=''
		String lQrAmtNoDepositFirstAmount=''
		String lQrAmtNoDepositAmount=''
		String lQrAmtNoDepositTotal=''
		String lQrAmtQuarterlyFirstAmount=''
		String lQrAmtQuarterlyAmount=''
		String lQrAmtQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('QrIsYearly','')
			lreturn.put('QrInstalment','')
			lreturn.put('EPolicy','')
			lreturn.put('QrSuccessCase','')
			lreturn.put('QrAmtYearly','')
			lreturn.put('QrAmtDeposit','')
			lreturn.put('QrAmtMonthly','')
			lreturn.put('QrAmtInstalment','')
			lreturn.put('QrAmtNoDepositFirstAmount','')
			lreturn.put('QrAmtNoDepositAmount','')
			lreturn.put('QrAmtNoDepositTotal','')
			lreturn.put('QrAmtQuarterlyFirstAmount','')
			lreturn.put('QrAmtQuarterlyAmount','')
			lreturn.put('QrAmtQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Map lMapPaymentByQR=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentByQR(lQrIsYearly,lQrInstalment,lEPolicy,lQrSuccessCase)
			if(!lMapPaymentByQR.Result){
				lQrIsYearly=''
				lQrInstalment=''
				lEPolicy=''
				lQrSuccessCase=''
				lQrAmtYearly=''
				lQrAmtDeposit=''
				lQrAmtMonthly=''
				lQrAmtInstalment=''
				lQrAmtNoDepositFirstAmount=''
				lQrAmtNoDepositAmount=''
				lQrAmtNoDepositTotal=''
				lQrAmtQuarterlyFirstAmount=''
				lQrAmtQuarterlyAmount=''
				lQrAmtQuarterlyTotal=''
			}else{
				lQrIsYearly=lMapPaymentByQR.QrIsYearly
				lQrInstalment=lMapPaymentByQR.QrInstalment
				lEPolicy=lMapPaymentByQR.EPolicy
				lQrSuccessCase=lMapPaymentByQR.QrSuccessCase
				lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
				lQrAmtDeposit=lMapPaymentByQR.QrAmtDeposit
				lQrAmtMonthly=lMapPaymentByQR.QrAmtMonthly
				lQrAmtInstalment=lMapPaymentByQR.QrAmtInstalment
				lQrAmtNoDepositFirstAmount=lMapPaymentByQR.QrAmtNoDepositFirstAmount
				lQrAmtNoDepositAmount=lMapPaymentByQR.QrAmtNoDepositAmount
				lQrAmtNoDepositTotal=lMapPaymentByQR.QrAmtNoDepositTotal
				lQrAmtQuarterlyFirstAmount=lMapPaymentByQR.QrAmtQuarterlyFirstAmount
				lQrAmtQuarterlyAmount=lMapPaymentByQR.QrAmtQuarterlyAmount
				lQrAmtQuarterlyTotal=lMapPaymentByQR.QrAmtQuarterlyTotal
			}
			lResult=lMapPaymentByQR.Result
			if(lResult){
				lreturn.put('QrIsYearly',lQrIsYearly)
				lreturn.put('QrInstalment',lQrInstalment)
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('QrSuccessCase',lQrSuccessCase)
				lreturn.put('QrAmtYearly',lQrAmtYearly)
				lreturn.put('QrAmtDeposit',lQrAmtDeposit)
				lreturn.put('QrAmtMonthly',lQrAmtMonthly)
				lreturn.put('QrAmtInstalment',lQrAmtInstalment)
				lreturn.put('QrAmtNoDepositFirstAmount',lQrAmtNoDepositFirstAmount)
				lreturn.put('QrAmtNoDepositAmount',lQrAmtNoDepositAmount)
				lreturn.put('QrAmtNoDepositTotal',lQrAmtNoDepositTotal)
				lreturn.put('QrAmtQuarterlyFirstAmount',lQrAmtQuarterlyFirstAmount)
				lreturn.put('QrAmtQuarterlyAmount',lQrAmtQuarterlyAmount)
				lreturn.put('QrAmtQuarterlyTotal',lQrAmtQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByIB(String strIbBank,String strEPolicy,String strAutoRenew,String strIbSuccessCase){
		Map lreturn=[:]
		String lIbBank=strIbBank.toUpperCase().trim()
		if(lIbBank.length()<=0){
			lIbBank=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_IB_BANK.toUpperCase()
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lIbSuccessCase=strIbSuccessCase.trim()
		if(lIbSuccessCase.length()<=0){
			lIbSuccessCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_IB_SUCCESS_CASE
		}
		String lIbAmtYearly=''
		try{
			Boolean lResult=false
			lreturn.put('IbBank','')
			lreturn.put('EPolicy','')
			lreturn.put('AutoRenew','')
			lreturn.put('IbSuccessCase','')
			lreturn.put('IbAmtYearly','')
			lreturn.put('Result',lResult)
			Map lMapPaymentByIB=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentByIB(lIbBank,lEPolicy,lAutoRenew,lIbSuccessCase)
			if(!lMapPaymentByIB.Result){
				lIbBank=''
				lEPolicy=''
				lAutoRenew=''
				lIbSuccessCase=''
				lIbAmtYearly=''
			}else{
				lIbBank=lMapPaymentByIB.IbBank
				lEPolicy=lMapPaymentByIB.EPolicy
				lAutoRenew=lMapPaymentByIB.AutoRenew
				lIbSuccessCase=lMapPaymentByIB.IbSuccessCase
				lIbAmtYearly=lMapPaymentByIB.IbAmtYearly
			}
			lResult=lMapPaymentByIB.Result
			if(lResult){
				lreturn.put('IbBank',lIbBank)
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('AutoRenew',lAutoRenew)
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
	public Map inputPaymentByCC(String strCcIsYearly,String strCcInstalment,String strCcNumber,String strCcName,String strCcExpiryMonth,String strCcExpiryYear,String strCcCvv,String strCcBank,String strEPolicy,String strAutoRenew,String strCcSuccessCase){
		Map lreturn=[:]
		String lCcIsYearly=strCcIsYearly.trim()
		if(lCcIsYearly.length()<=0){
			lCcIsYearly=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_IS_YEARLY
		}
		String lCcInstalment=strCcInstalment.trim()
		if(lCcInstalment.length()<=0){
			lCcInstalment=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_INSTALMENT
		}
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
		}
		String lCcAmtYearly=''
		String lCcAmtDeposit=''
		String lCcAmtMonthly=''
		String lCcAmtInstalment=''
		String lCcAmtNoDepositFirstAmount=''
		String lCcAmtNoDepositAmount=''
		String lCcAmtNoDepositTotal=''
		String lCcAmtQuarterlyFirstAmount=''
		String lCcAmtQuarterlyAmount=''
		String lCcAmtQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('CcIsYearly','')
			lreturn.put('CcInstalment','')
			lreturn.put('CcNumber','')
			lreturn.put('CcName','')
			lreturn.put('CcExpiryMonth','')
			lreturn.put('CcExpiryYear','')
			lreturn.put('CcCvv','')
			lreturn.put('CcBank','')
			lreturn.put('EPolicy','')
			lreturn.put('AutoRenew','')
			lreturn.put('CcSuccessCase','')
			lreturn.put('CcAmtYearly','')
			lreturn.put('CcAmtDeposit','')
			lreturn.put('CcAmtMonthly','')
			lreturn.put('CcAmtInstalment','')
			lreturn.put('CcAmtNoDepositFirstAmount','')
			lreturn.put('CcAmtNoDepositAmount','')
			lreturn.put('CcAmtNoDepositTotal','')
			lreturn.put('CcAmtQuarterlyFirstAmount','')
			lreturn.put('CcAmtQuarterlyAmount','')
			lreturn.put('CcAmtQuarterlyTotal','')
			lreturn.put('Result',lResult)
			/*************************************************************************************************************************************************/
			if(this.lIsSalesforceProceedRetrieveWebFromUrlSuccess){
				THARGPAElectricMotorCarCoreType.CURRENT_SKIP_PAGE_DETAIL2=true
			}
			Map lMapPaymentByCC=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentByCC(lCcIsYearly,lCcInstalment,lCcNumber,lCcName,lCcExpiryMonth,lCcExpiryYear,lCcCvv,lCcBank,lEPolicy,lAutoRenew,lCcSuccessCase)
			if(!lMapPaymentByCC.Result){
				lCcIsYearly=''
				lCcInstalment=''
				lCcNumber=''
				lCcName=''
				lCcExpiryMonth=''
				lCcExpiryYear=''
				lCcCvv=''
				lCcBank=''
				lEPolicy=''
				lAutoRenew=''
				lCcSuccessCase=''
				lCcAmtYearly=''
				lCcAmtDeposit=''
				lCcAmtMonthly=''
				lCcAmtInstalment=''
				lCcAmtNoDepositFirstAmount=''
				lCcAmtNoDepositAmount=''
				lCcAmtNoDepositTotal=''
				lCcAmtQuarterlyFirstAmount=''
				lCcAmtQuarterlyAmount=''
				lCcAmtQuarterlyTotal=''
			}else{
				lCcIsYearly=lMapPaymentByCC.CcIsYearly
				lCcInstalment=lMapPaymentByCC.CcInstalment
				lCcNumber=lMapPaymentByCC.CcNumber
				lCcName=lMapPaymentByCC.CcName
				lCcExpiryMonth=lMapPaymentByCC.CcExpiryMonth
				lCcExpiryYear=lMapPaymentByCC.CcExpiryYear
				lCcCvv=lMapPaymentByCC.CcCvv
				lCcBank=lMapPaymentByCC.CcBank
				lEPolicy=lMapPaymentByCC.EPolicy
				lAutoRenew=lMapPaymentByCC.AutoRenew
				lCcSuccessCase=lMapPaymentByCC.CcSuccessCase
				lCcAmtYearly=lMapPaymentByCC.CcAmtYearly
				lCcAmtDeposit=lMapPaymentByCC.CcAmtDeposit
				lCcAmtMonthly=lMapPaymentByCC.CcAmtMonthly
				lCcAmtInstalment=lMapPaymentByCC.CcAmtInstalment
				lCcAmtNoDepositFirstAmount=lMapPaymentByCC.CcAmtNoDepositFirstAmount
				lCcAmtNoDepositAmount=lMapPaymentByCC.CcAmtNoDepositAmount
				lCcAmtNoDepositTotal=lMapPaymentByCC.CcAmtNoDepositTotal
				lCcAmtQuarterlyFirstAmount=lMapPaymentByCC.CcAmtQuarterlyFirstAmount
				lCcAmtQuarterlyAmount=lMapPaymentByCC.CcAmtQuarterlyAmount
				lCcAmtQuarterlyTotal=lMapPaymentByCC.CcAmtQuarterlyTotal
			}
			lResult=lMapPaymentByCC.Result
			if(lResult){
				lreturn.put('CcIsYearly',lCcIsYearly)
				lreturn.put('CcInstalment',lCcInstalment)
				lreturn.put('CcNumber',lCcNumber)
				lreturn.put('CcName',lCcName)
				lreturn.put('CcExpiryMonth',lCcExpiryMonth)
				lreturn.put('CcExpiryYear',lCcExpiryYear)
				lreturn.put('CcCvv',lCcCvv)
				lreturn.put('CcBank',lCcBank)
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('AutoRenew',lAutoRenew)
				lreturn.put('CcSuccessCase',lCcSuccessCase)
				lreturn.put('CcAmtYearly',lCcAmtYearly)
				lreturn.put('CcAmtDeposit',lCcAmtDeposit)
				lreturn.put('CcAmtMonthly',lCcAmtMonthly)
				lreturn.put('CcAmtInstalment',lCcAmtInstalment)
				lreturn.put('CcAmtNoDepositFirstAmount',lCcAmtNoDepositFirstAmount)
				lreturn.put('CcAmtNoDepositAmount',lCcAmtNoDepositAmount)
				lreturn.put('CcAmtNoDepositTotal',lCcAmtNoDepositTotal)
				lreturn.put('CcAmtQuarterlyFirstAmount',lCcAmtQuarterlyFirstAmount)
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
	public Map inputPaymentByTrueMoney(String strTrueMoneyIsYearly,String strTrueMoneyInstalment,String strTrueMoneyMobileNo,String strTrueMoneyEmail,String strEPolicy,String strAutoRenew,String strTrueMoneySuccessCase){
		Map lreturn=[:]
		String lTrueMoneyIsYearly=strTrueMoneyIsYearly.trim()
		if(lTrueMoneyIsYearly.length()<=0){
			lTrueMoneyIsYearly=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_YEARLY
		}
		String lTrueMoneyInstalment=strTrueMoneyInstalment.trim()
		if(lTrueMoneyInstalment.length()<=0){
			lTrueMoneyInstalment=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_TRUE_MONEY_INSTALMENT
		}
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_TRUE_MONEY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_TRUE_MONEY_SUCCESS_CASE
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
			lreturn.put('EPolicy','')
			lreturn.put('AutoRenew','')
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
			Map lMapPaymentByTrueMoney=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentByTrueMoney(lTrueMoneyIsYearly,lTrueMoneyInstalment,lTrueMoneyMobileNo,lTrueMoneyEmail,lEPolicy,lAutoRenew,lTrueMoneySuccessCase)
			if(!lMapPaymentByTrueMoney.Result){
				lTrueMoneyIsYearly=''
				lTrueMoneyInstalment=''
				lTrueMoneyMobileNo=''
				lTrueMoneyEmail=''
				lEPolicy=''
				lAutoRenew=''
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
				lEPolicy=lMapPaymentByTrueMoney.EPolicy
				lAutoRenew=lMapPaymentByTrueMoney.AutoRenew
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
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('AutoRenew',lAutoRenew)
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
	public Map inputPaymentByRabbitLinePay(String strRabbitLinePayIsYearly,String strRabbitLinePayInstalment,String strRabbitLinePayMobileNo,String strRabbitLinePayEmail,String strEPolicy,String strAutoRenew,String strRabbitLinePaySuccessCase){
		Map lreturn=[:]
		String lRabbitLinePayIsYearly=strRabbitLinePayIsYearly.trim()
		if(lRabbitLinePayIsYearly.length()<=0){
			lRabbitLinePayIsYearly=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lRabbitLinePayInstalment=strRabbitLinePayInstalment.trim()
		if(lRabbitLinePayInstalment.length()<=0){
			lRabbitLinePayInstalment=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_INSTALMENT
		}
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE
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
			lreturn.put('EPolicy','')
			lreturn.put('AutoRenew','')
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
			Map lMapPaymentByRabbitLinePay=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentByRabbitLinePay(lRabbitLinePayIsYearly,lRabbitLinePayInstalment,lRabbitLinePayMobileNo,lRabbitLinePayEmail,lEPolicy,lAutoRenew,lRabbitLinePaySuccessCase)
			if(!lMapPaymentByRabbitLinePay.Result){
				lRabbitLinePayIsYearly=''
				lRabbitLinePayInstalment=''
				lRabbitLinePayMobileNo=''
				lRabbitLinePayEmail=''
				lEPolicy=''
				lAutoRenew=''
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
				lEPolicy=lMapPaymentByRabbitLinePay.EPolicy
				lAutoRenew=lMapPaymentByRabbitLinePay.AutoRenew
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
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('AutoRenew',lAutoRenew)
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
	public Map inputPaymentByMobileBanking(String strMobileBankingIsYearly,String strMobileBankingInstalment,String strMobileBankingCard,String strEPolicy,String strAutoRenew,String strMobileBankingSuccessCase){
		Map lreturn=[:]
		String lMobileBankingIsYearly=strMobileBankingIsYearly.trim()
		if(lMobileBankingIsYearly.length()<=0){
			lMobileBankingIsYearly=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_MOBILE_BANKING_IS_YEARLY
		}
		String lMobileBankingInstalment=strMobileBankingInstalment.trim()
		if(lMobileBankingInstalment.length()<=0){
			lMobileBankingInstalment=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_MOBILE_BANKING_INSTALMENT
		}
		String lMobileBankingCard=strMobileBankingCard.trim()
		if(lMobileBankingCard.length()<=0){
			lMobileBankingCard=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_MOBILE_BANKING_CARD
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lMobileBankingSuccessCase=strMobileBankingSuccessCase.trim()
		if(lMobileBankingSuccessCase.length()<=0){
			lMobileBankingSuccessCase=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_MOBILE_BANKING_SUCCESS_CASE
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
			lreturn.put('MobileBankingCard','')
			lreturn.put('EPolicy','')
			lreturn.put('AutoRenew','')
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
			Map lMapPaymentByMobileBanking=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPaymentByMobileBanking(lMobileBankingIsYearly,lMobileBankingInstalment,lMobileBankingCard,lEPolicy,lAutoRenew,lMobileBankingSuccessCase)
			if(!lMapPaymentByMobileBanking.Result){
				lMobileBankingIsYearly=''
				lMobileBankingInstalment=''
				lMobileBankingCard=''
				lEPolicy=''
				lAutoRenew=''
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
				lEPolicy=lMapPaymentByMobileBanking.EPolicy
				lAutoRenew=lMapPaymentByMobileBanking.AutoRenew
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
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('AutoRenew',lAutoRenew)
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
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			Map lMapPolicyInsurer=this.lTHAElectricMotorCarQuotationPaymentUtil.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			lResult=lMapPolicyInsurer.Result
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHAElectricMotorCarQuotationPaymentUtil.inputSalesforceProceedTodo(lSalesforceProceedTodo)
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
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapAutomationDataBefore=this.lTHAElectricMotorCarQuotationPaymentUtil.inputAutomationDataBefore()
			lResult=lMapAutomationDataBefore.Result
			if(lResult){
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
			Map lMapAutomationDataAfter=this.lTHAElectricMotorCarQuotationPaymentUtil.inputAutomationDataAfter()
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
			lResult=lMapAutomationDataAfter.Result
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('SalesforceRetrieveDataOpportunityNumber',lSalesforceRetrieveDataOpportunityNumber)
				lreturn.put('SalesforceRetrieveDataPremiumYearly',lSalesforceRetrieveDataPremiumYearly)
				lreturn.put('SalesforceRetrieveDataPremiumDeposit',lSalesforceRetrieveDataPremiumDeposit)
				lreturn.put('SalesforceRetrieveDataPremiumMonthly',lSalesforceRetrieveDataPremiumMonthly)
				lreturn.put('SalesforceRetrieveDataPremiumInstalment',lSalesforceRetrieveDataPremiumInstalment)
				lreturn.put('SalesforceRetrieveDataPremiumNoDepositAmount',lSalesforceRetrieveDataPremiumNoDepositAmount)
				lreturn.put('SalesforceRetrieveDataPremiumNoDepositTotal',lSalesforceRetrieveDataPremiumNoDepositTotal)
				lreturn.put('SalesforceRetrieveDataPremiumQuarterlyAmount',lSalesforceRetrieveDataPremiumQuarterlyAmount)
				lreturn.put('SalesforceRetrieveDataPremiumQuarterlyTotal',lSalesforceRetrieveDataPremiumQuarterlyTotal)
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
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyBefore=this.lTHAElectricMotorCarQuotationPaymentUtil.inputSalesforceProceedVerifyBefore(caseOutput)
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
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyAfter=this.lTHAElectricMotorCarQuotationPaymentUtil.inputSalesforceProceedVerifyAfter(caseOutput)
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
			lSalesforceProceedRetrieveTodo=THARGPAElectricMotorCarQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lTHAElectricMotorCarQuotationPaymentUtil.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
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
		String lRetrievePageURL=strRetrievePageURL.trim()
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lTHAElectricMotorCarQuotationPaymentUtil.inputSalesforceProceedRetrieveWebFromUrl(lRetrievePageURL)
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
}