package org.roojai.tha.types.roojailowmileagecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THALowMileageCarQuotationPaymentUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private lIsIBSuccessCase=false
	public THALowMileageCarQuotationPaymentUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public String checkOpportunityNumber(String strOpportunityNumber){
		String lreturn=''
		String lOpportunityNumber=strOpportunityNumber.trim()
		try{
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			String lInfoText=''
			WebElement lElementInfo=null
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			String lOpportunityNumberOld=lOpportunityNumber
			if(lOpportunityNumberOld.length()>0){
				for(Integer lIndex=1;lIndex<=10;lIndex++){
					lInfoTag=lTagOpportunityNumber
					lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
					lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
					if(!lElementInfo){
						IGNUemaHelper.delayThreadSecond(3)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
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
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
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
			lreturn=lOpportunityNumber
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
			//Check ABTesting
			String lTagABTesting='ABTesting'
			String lLocatorABTesting=IGNUemaHelper.getTagDataSeleniumKey(lTagABTesting)
			WebElement lElementABTesting=IGNUemaHelper.getWebElementFromDataSeleniumKey(driver,lTagABTesting)
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
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
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
							Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
							if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
								lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
							}
							THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
							THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
							THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT)
									lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
									lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
									caseOutput.ActualResult=lActualResult
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
								Map lMapPaymentByQR=this.inputPaymentByQR(lEPolicy)
								if(!lMapPaymentByQR.Result){
									lEPolicy=''
									lQrAmtYearly=''
								}else{
									lEPolicy=lMapPaymentByQR.EPolicy
									lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
								}
								caseOutput.EPolicy=lEPolicy
								caseOutput.QrAmtYearly=lQrAmtYearly
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
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
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
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
								if(!lMapPaymentByRabbitLinePay.Result){
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
						break
					case 'B':
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
							Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
							if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
								lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
							}
							THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
							THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
							THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT)
									lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
									lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
									caseOutput.ActualResult=lActualResult
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
								Map lMapPaymentByQR=this.inputPaymentByQR(lEPolicy)
								if(!lMapPaymentByQR.Result){
									lEPolicy=''
									lQrAmtYearly=''
								}else{
									lEPolicy=lMapPaymentByQR.EPolicy
									lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
								}
								caseOutput.EPolicy=lEPolicy
								caseOutput.QrAmtYearly=lQrAmtYearly
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
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
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
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
								THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
								if(!lMapPaymentByRabbitLinePay.Result){
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
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
						break
					default:
						return lreturn
						break
				}
			}else{
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
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
					THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
					THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT)
							lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
							lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
							caseOutput.ActualResult=lActualResult
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
						Map lMapPaymentByQR=this.inputPaymentByQR(lEPolicy)
						if(!lMapPaymentByQR.Result){
							lEPolicy=''
							lQrAmtYearly=''
						}else{
							lEPolicy=lMapPaymentByQR.EPolicy
							lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
						}
						caseOutput.EPolicy=lEPolicy
						caseOutput.QrAmtYearly=lQrAmtYearly
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
						THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
						THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
						THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
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
						THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
						THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
						THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
						if(!lMapPaymentByRabbitLinePay.Result){
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
			}
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
			lPositiveCase=THALowMileageCarQuotationResultType.DEFAULT_POSITIVE_CASE
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
				lLanguageItem=lLanguageList.get(THALowMileageCarQuotationPaymentType.DEFAULT_LANGUAGE.toUpperCase())
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
				lLanguage=THALowMileageCarQuotationPaymentType.DEFAULT_LANGUAGE
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
				lLanguageItem=lLanguageList.get(THALowMileageCarQuotationPaymentType.DEFAULT_LANGUAGE.toUpperCase())
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
				lLanguage=THALowMileageCarQuotationPaymentType.DEFAULT_LANGUAGE
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
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputActualResultA(isPositiveCase)
						break
					case 'B':
						lreturn=this.inputActualResultB(isPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputActualResultA(isPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultA(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lLocatorProgressDialog='#myPleaseWait'
			IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
			String lTagButtonNext='nextProcess'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			String lLocatorThankyouPage='#thankyou-v3'
			String lLocatorPolicyDetail2='#policy2-v3'
			String lLocatorAppDoc='#app'
			String lAppDocText=''
			String lCurrentURL=WebUI.getUrl()
			IGNUemaHelper.printLog(lCurrentURL)
			if(!lElementButtonNext){
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetail2,10)
				if(!lRedirected){
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
					if(!lRedirected){
						lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
						if(lAppDocText.length()<=0){
							String lLocatorFormOmise='#offsite-test-container'
							Boolean lValid=false
							if(lCurrentURL.toUpperCase().contains('THANKYOU')){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
								IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
								lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
								if(lValid){
									if(this.lIsIBSuccessCase){
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
								lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
								if(!lRedirected){
									WebUI.navigateToUrl(lCurrentURL)
									IGNUemaHelper.delayThreadSecond(10)
									IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
									lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
									if(lValid){
										if(this.lIsIBSuccessCase){
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
									lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
								}
							}
							lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
						}
					}
				}
				lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			}
			if(lElementButtonNext){
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetail2,30)
				if(!lRedirected){
					String lLocatorFormOmise='#offsite-test-container'
					Boolean lValid=false
					if(lCurrentURL.toUpperCase().contains('THANKYOU')){
						WebUI.navigateToUrl(lCurrentURL)
						IGNUemaHelper.delayThreadSecond(10)
						IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
						lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
						if(lValid){
							if(this.lIsIBSuccessCase){
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
						lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
						if(!lRedirected){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
							lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
							if(lValid){
								if(this.lIsIBSuccessCase){
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
							lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
						}
					}
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(lElementButtonNext){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
						IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
						IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
						IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					}
				}
			}
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetail2,60)
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
	public Map inputActualResultB(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lLocatorProgressDialog='#myPleaseWait'
			IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
			String lTagButtonNext='nextProcess'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			String lLocatorThankyouPage='#thankyou-v3'
			String lLocatorPolicyDetail2='#policy2-v3'
			String lLocatorAppDoc='#app'
			String lAppDocText=''
			String lCurrentURL=WebUI.getUrl()
			IGNUemaHelper.printLog(lCurrentURL)
			if(!lElementButtonNext){
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetail2,10)
				if(!lRedirected){
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
					if(!lRedirected){
						lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
						if(lAppDocText.length()<=0){
							String lLocatorFormOmise='#offsite-test-container'
							Boolean lValid=false
							if(lCurrentURL.toUpperCase().contains('THANKYOU')){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
								IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
								lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
								if(lValid){
									if(this.lIsIBSuccessCase){
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
								lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
								if(!lRedirected){
									WebUI.navigateToUrl(lCurrentURL)
									IGNUemaHelper.delayThreadSecond(10)
									IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
									lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
									if(lValid){
										if(this.lIsIBSuccessCase){
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
									lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
								}
							}
							lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
						}
					}
				}
				lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			}
			if(lElementButtonNext){
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetail2,30)
				if(!lRedirected){
					String lLocatorFormOmise='#offsite-test-container'
					Boolean lValid=false
					if(lCurrentURL.toUpperCase().contains('THANKYOU')){
						WebUI.navigateToUrl(lCurrentURL)
						IGNUemaHelper.delayThreadSecond(10)
						IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
						lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
						if(lValid){
							if(this.lIsIBSuccessCase){
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
						lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
						if(!lRedirected){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
							lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
							if(lValid){
								if(this.lIsIBSuccessCase){
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
							lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
						}
					}
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,20)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
					if(lElementButtonNext){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
						IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
						IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
						IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
					}
				}
			}
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetail2,60)
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
	public Map inputOpportunityNumber(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputOpportunityNumberA()
						break
					case 'B':
						lreturn=this.inputOpportunityNumberB()
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputOpportunityNumberA()
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOpportunityNumberA(){
		Map lreturn=[:]
		String lOpportunityNumber=''
		try{
			Boolean lResult=false
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'qotation-no'))
			lOpportunityNumber=this.checkOpportunityNumber(lOpportunityNumber)
			THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
			lResult=lOpportunityNumber.length()>0
			String lLocatorRoojaiRewardText='#rewards-shake'
			WebElement lElementRoojaiRewardText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRoojaiRewardText)
			if(lElementRoojaiRewardText){
				String lRoojaiRewardText=lElementRoojaiRewardText.getText().trim()
				if(lRoojaiRewardText.length()>0){
					lOpportunityNumber=lOpportunityNumber+'|'+lRoojaiRewardText
				}
			}
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
	public Map inputOpportunityNumberB(){
		Map lreturn=[:]
		String lOpportunityNumber=''
		try{
			Boolean lResult=false
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'qotation-no'))
			lOpportunityNumber=this.checkOpportunityNumber(lOpportunityNumber)
			THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
			lResult=lOpportunityNumber.length()>0
			String lLocatorRoojaiRewardText='#rewards-shake'
			WebElement lElementRoojaiRewardText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRoojaiRewardText)
			if(lElementRoojaiRewardText){
				String lRoojaiRewardText=lElementRoojaiRewardText.getText().trim()
				if(lRoojaiRewardText.length()>0){
					lOpportunityNumber=lOpportunityNumber+'|'+lRoojaiRewardText
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPaymentMethodA(strPaymentMethod)
						break
					case 'B':
						lreturn=this.inputPaymentMethodB(strPaymentMethod)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPaymentMethodA(strPaymentMethod)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentMethodA(String strPaymentMethod){
		Map lreturn=[:]
		String lPaymentMethod=strPaymentMethod.trim()
		Map lPaymentMethodList=['1':'1','2':'1','3':'3','4':'4','5':'5']
		Integer lPaymentMethodDefaultMin=1
		Integer lPaymentMethodDefaultMax=5
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			String lPaymentMethodItem=lPaymentMethodList.get(lPaymentMethod)
			if(!lPaymentMethodItem){
				lPaymentMethodItem=lPaymentMethodDefaultMin.toString()
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
			THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD=lPaymentMethod
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
	public Map inputPaymentMethodB(String strPaymentMethod){
		Map lreturn=[:]
		String lPaymentMethod=strPaymentMethod.trim()
		Map lPaymentMethodList=['1':'1','2':'1','3':'3','4':'4','5':'5']
		Integer lPaymentMethodDefaultMin=1
		Integer lPaymentMethodDefaultMax=5
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			String lPaymentMethodItem=lPaymentMethodList.get(lPaymentMethod)
			if(!lPaymentMethodItem){
				lPaymentMethodItem=lPaymentMethodDefaultMin.toString()
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
			THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD=lPaymentMethod
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
	public Map inputPaymentByQR(String strEPolicy){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('EPolicy','')
			lreturn.put('QrAmtYearly','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPaymentByQRA(strEPolicy)
						break
					case 'B':
						lreturn=this.inputPaymentByQRB(strEPolicy)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPaymentByQRA(strEPolicy)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByQRA(String strEPolicy){
		Map lreturn=[:]
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lQrAmtYearly=''
		try{
			Boolean lResult=false
			lreturn.put('EPolicy','')
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
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
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
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('QrAmtYearly',lQrAmtYearly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByQRB(String strEPolicy){
		Map lreturn=[:]
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lQrAmtYearly=''
		try{
			Boolean lResult=false
			lreturn.put('EPolicy','')
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
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
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
				lreturn.put('EPolicy',lEPolicy)
				lreturn.put('QrAmtYearly',lQrAmtYearly)
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
		try{
			Boolean lResult=false
			lreturn.put('IbBank','')
			lreturn.put('EPolicy','')
			lreturn.put('AutoRenew','')
			lreturn.put('IbSuccessCase','')
			lreturn.put('IbAmtYearly','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPaymentByIBA(strIbBank,strEPolicy,strAutoRenew,strIbSuccessCase)
						break
					case 'B':
						lreturn=this.inputPaymentByIBB(strIbBank,strEPolicy,strAutoRenew,strIbSuccessCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPaymentByIBA(strIbBank,strEPolicy,strAutoRenew,strIbSuccessCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByIBA(String strIbBank,String strEPolicy,String strAutoRenew,String strIbSuccessCase){
		Map lreturn=[:]
		String lIbBank=strIbBank.trim()
		Map lIbBankList=['1':'1','2':'2','3':'3','4':'4']
		Integer lIbBankDefault=2
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lIbSuccessCase=strIbSuccessCase.trim()
		if(lIbSuccessCase.length()<=0){
			lIbSuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_IB_SUCCESS_CASE
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
			String lIbBankItem=lIbBankList.get(lIbBank)
			if(!lIbBankItem){
				lIbBankItem=lIbBankList.get(THALowMileageCarQuotationPaymentType.DEFAULT_IB_BANK)
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
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
	public Map inputPaymentByIBB(String strIbBank,String strEPolicy,String strAutoRenew,String strIbSuccessCase){
		Map lreturn=[:]
		String lIbBank=strIbBank.trim()
		Map lIbBankList=['1':'1','2':'2','3':'3','4':'4']
		Integer lIbBankDefault=2
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lIbSuccessCase=strIbSuccessCase.trim()
		if(lIbSuccessCase.length()<=0){
			lIbSuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_IB_SUCCESS_CASE
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
			String lIbBankItem=lIbBankList.get(lIbBank)
			if(!lIbBankItem){
				lIbBankItem=lIbBankList.get(THALowMileageCarQuotationPaymentType.DEFAULT_IB_BANK)
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
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPaymentByCCA(strCcIsYearly,strCcInstalment,strCcNumber,strCcName,strCcExpiryMonth,strCcExpiryYear,strCcCvv,strCcBank,strEPolicy,strAutoRenew,strCcSuccessCase)
						break
					case 'B':
						lreturn=this.inputPaymentByCCB(strCcIsYearly,strCcInstalment,strCcNumber,strCcName,strCcExpiryMonth,strCcExpiryYear,strCcCvv,strCcBank,strEPolicy,strAutoRenew,strCcSuccessCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPaymentByCCA(strCcIsYearly,strCcInstalment,strCcNumber,strCcName,strCcExpiryMonth,strCcExpiryYear,strCcCvv,strCcBank,strEPolicy,strAutoRenew,strCcSuccessCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByCCA(String strCcIsYearly,String strCcInstalment,String strCcNumber,String strCcName,String strCcExpiryMonth,String strCcExpiryYear,String strCcCvv,String strCcBank,String strEPolicy,String strAutoRenew,String strCcSuccessCase){
		Map lreturn=[:]
		String lCcIsYearly=strCcIsYearly.trim()
		if(lCcIsYearly.length()<=0){
			lCcIsYearly=THALowMileageCarQuotationPaymentType.DEFAULT_CC_IS_YEARLY
		}
		String lCcInstalment=strCcInstalment.trim()
		if(lCcInstalment.length()<=0){
			lCcInstalment=THALowMileageCarQuotationPaymentType.DEFAULT_CC_INSTALMENT
		}
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THALowMileageCarQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THALowMileageCarQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THALowMileageCarQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THALowMileageCarQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THALowMileageCarQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THALowMileageCarQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
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
			Boolean lIsCcIsYearly=IGNUemaHelper.convertStringToBoolean(lCcIsYearly)
			lCcIsYearly=''
			Integer lCcInstalmentMin=1
			Integer lCcInstalmentMax=3
			Integer lCcInstalmentDefault=1
			Integer lCcInstalmentNum=IGNUemaHelper.convertStringToInteger(lCcInstalment,lCcInstalmentDefault)
			if((lCcInstalmentNum<lCcInstalmentMin)||(lCcInstalmentNum>lCcInstalmentMax)){
				lCcInstalmentNum=lCcInstalmentDefault
			}
			lCcInstalment=''
			String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
			String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
			String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
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
			if(!lIsCcIsYearly){
				if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
					if(lPaymentInstalmentOptionItemDefaultNum<=0){
						return lreturn
					}
				}
				switch(lCcInstalmentNum){
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lCcInstalment='Monthly No Deposit'
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						lCcInstalment='Quarterly'
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lCcInstalment='Monthly With Deposit'
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
						lCcAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
						lCcAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lCcAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lCcAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
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
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
			THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_CC_IS_YEARLY=lCcIsYearly
			/*************************************************************************************************************************************************/
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
	public Map inputPaymentByCCB(String strCcIsYearly,String strCcInstalment,String strCcNumber,String strCcName,String strCcExpiryMonth,String strCcExpiryYear,String strCcCvv,String strCcBank,String strEPolicy,String strAutoRenew,String strCcSuccessCase){
		Map lreturn=[:]
		String lCcIsYearly=strCcIsYearly.trim()
		if(lCcIsYearly.length()<=0){
			lCcIsYearly=THALowMileageCarQuotationPaymentType.DEFAULT_CC_IS_YEARLY
		}
		String lCcInstalment=strCcInstalment.trim()
		if(lCcInstalment.length()<=0){
			lCcInstalment=THALowMileageCarQuotationPaymentType.DEFAULT_CC_INSTALMENT
		}
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THALowMileageCarQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THALowMileageCarQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THALowMileageCarQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THALowMileageCarQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THALowMileageCarQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THALowMileageCarQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
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
			Boolean lIsCcIsYearly=IGNUemaHelper.convertStringToBoolean(lCcIsYearly)
			lCcIsYearly=''
			Integer lCcInstalmentMin=1
			Integer lCcInstalmentMax=3
			Integer lCcInstalmentDefault=1
			Integer lCcInstalmentNum=IGNUemaHelper.convertStringToInteger(lCcInstalment,lCcInstalmentDefault)
			if((lCcInstalmentNum<lCcInstalmentMin)||(lCcInstalmentNum>lCcInstalmentMax)){
				lCcInstalmentNum=lCcInstalmentDefault
			}
			lCcInstalment=''
			String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
			String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
			String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
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
			if(!lIsCcIsYearly){
				if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
					if(lPaymentInstalmentOptionItemDefaultNum<=0){
						return lreturn
					}
				}
				switch(lCcInstalmentNum){
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lCcInstalment='Monthly No Deposit'
						break
					case 3:
						if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
						lCcInstalment='Quarterly'
						break
					default:
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lCcInstalment='Monthly With Deposit'
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
						lCcAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
						lCcAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lCcAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lCcAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lCcAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lCcAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
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
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
			THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_CC_IS_YEARLY=lCcIsYearly
			/*************************************************************************************************************************************************/
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPaymentByTrueMoneyA(strTrueMoneyIsYearly,strTrueMoneyInstalment,strTrueMoneyMobileNo,strTrueMoneyEmail,strEPolicy,strAutoRenew,strTrueMoneySuccessCase)
						break
					case 'B':
						lreturn=this.inputPaymentByTrueMoneyB(strTrueMoneyIsYearly,strTrueMoneyInstalment,strTrueMoneyMobileNo,strTrueMoneyEmail,strEPolicy,strAutoRenew,strTrueMoneySuccessCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPaymentByTrueMoneyA(strTrueMoneyIsYearly,strTrueMoneyInstalment,strTrueMoneyMobileNo,strTrueMoneyEmail,strEPolicy,strAutoRenew,strTrueMoneySuccessCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByTrueMoneyA(String strTrueMoneyIsYearly,String strTrueMoneyInstalment,String strTrueMoneyMobileNo,String strTrueMoneyEmail,String strEPolicy,String strAutoRenew,String strTrueMoneySuccessCase){
		Map lreturn=[:]
		String lTrueMoneyIsYearly=strTrueMoneyIsYearly.trim()
		if(lTrueMoneyIsYearly.length()<=0){
			lTrueMoneyIsYearly=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_YEARLY
		}
		String lTrueMoneyInstalment=strTrueMoneyInstalment.trim()
		if(lTrueMoneyInstalment.length()<=0){
			lTrueMoneyInstalment=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_INSTALMENT
		}
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_SUCCESS_CASE
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
			Integer lTrueMoneyInstalmentDefault=1
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
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lTrueMoneyInstalment='Monthly No Deposit'
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lTrueMoneyInstalment='Monthly With Deposit'
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
					case 2:
						lTrueMoneyAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
						lTrueMoneyAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lTrueMoneyAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lTrueMoneyAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsTrueMoneySuccessCase){
					lResult=true
				}
			}
			THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_TRUE_MONEY_IS_YEARLY=lTrueMoneyIsYearly
			/*************************************************************************************************************************************************/
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
	public Map inputPaymentByTrueMoneyB(String strTrueMoneyIsYearly,String strTrueMoneyInstalment,String strTrueMoneyMobileNo,String strTrueMoneyEmail,String strEPolicy,String strAutoRenew,String strTrueMoneySuccessCase){
		Map lreturn=[:]
		String lTrueMoneyIsYearly=strTrueMoneyIsYearly.trim()
		if(lTrueMoneyIsYearly.length()<=0){
			lTrueMoneyIsYearly=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_YEARLY
		}
		String lTrueMoneyInstalment=strTrueMoneyInstalment.trim()
		if(lTrueMoneyInstalment.length()<=0){
			lTrueMoneyInstalment=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_INSTALMENT
		}
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_TRUE_MONEY_SUCCESS_CASE
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
			Integer lTrueMoneyInstalmentDefault=1
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
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lTrueMoneyInstalment='Monthly No Deposit'
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lTrueMoneyInstalment='Monthly With Deposit'
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
					case 2:
						lTrueMoneyAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
						lTrueMoneyAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lTrueMoneyAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lTrueMoneyAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lTrueMoneyAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lTrueMoneyAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsTrueMoneySuccessCase){
					lResult=true
				}
			}
			THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_TRUE_MONEY_IS_YEARLY=lTrueMoneyIsYearly
			/*************************************************************************************************************************************************/
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPaymentByRabbitLinePayA(strRabbitLinePayIsYearly,strRabbitLinePayInstalment,strRabbitLinePayMobileNo,strRabbitLinePayEmail,strEPolicy,strAutoRenew,strRabbitLinePaySuccessCase)
						break
					case 'B':
						lreturn=this.inputPaymentByRabbitLinePayB(strRabbitLinePayIsYearly,strRabbitLinePayInstalment,strRabbitLinePayMobileNo,strRabbitLinePayEmail,strEPolicy,strAutoRenew,strRabbitLinePaySuccessCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPaymentByRabbitLinePayA(strRabbitLinePayIsYearly,strRabbitLinePayInstalment,strRabbitLinePayMobileNo,strRabbitLinePayEmail,strEPolicy,strAutoRenew,strRabbitLinePaySuccessCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByRabbitLinePayA(String strRabbitLinePayIsYearly,String strRabbitLinePayInstalment,String strRabbitLinePayMobileNo,String strRabbitLinePayEmail,String strEPolicy,String strAutoRenew,String strRabbitLinePaySuccessCase){
		Map lreturn=[:]
		String lRabbitLinePayIsYearly=strRabbitLinePayIsYearly.trim()
		if(lRabbitLinePayIsYearly.length()<=0){
			lRabbitLinePayIsYearly=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lRabbitLinePayInstalment=strRabbitLinePayInstalment.trim()
		if(lRabbitLinePayInstalment.length()<=0){
			lRabbitLinePayInstalment=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_INSTALMENT
		}
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE
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
			Integer lRabbitLinePayInstalmentDefault=1
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
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lRabbitLinePayInstalment='Monthly No Deposit'
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lRabbitLinePayInstalment='Monthly With Deposit'
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
					case 2:
						lRabbitLinePayAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
						lRabbitLinePayAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lRabbitLinePayAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lRabbitLinePayAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsRabbitLinePaySuccessCase){
					lResult=true
				}
			}
			THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_RABBIT_LINE_PAY_IS_YEARLY=lRabbitLinePayIsYearly
			/*************************************************************************************************************************************************/
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
	public Map inputPaymentByRabbitLinePayB(String strRabbitLinePayIsYearly,String strRabbitLinePayInstalment,String strRabbitLinePayMobileNo,String strRabbitLinePayEmail,String strEPolicy,String strAutoRenew,String strRabbitLinePaySuccessCase){
		Map lreturn=[:]
		String lRabbitLinePayIsYearly=strRabbitLinePayIsYearly.trim()
		if(lRabbitLinePayIsYearly.length()<=0){
			lRabbitLinePayIsYearly=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lRabbitLinePayInstalment=strRabbitLinePayInstalment.trim()
		if(lRabbitLinePayInstalment.length()<=0){
			lRabbitLinePayInstalment=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_INSTALMENT
		}
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THALowMileageCarQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THALowMileageCarQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THALowMileageCarQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE
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
			Integer lRabbitLinePayInstalmentDefault=1
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
			String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
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
					case 2:
						if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
						lRabbitLinePayInstalment='Monthly No Deposit'
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
						if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
						lRabbitLinePayInstalment='Monthly With Deposit'
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
					case 2:
						lRabbitLinePayAmtNoDepositFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
						lRabbitLinePayAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					case 3:
						lRabbitLinePayAmtQuarterlyFirstAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
					default:
						lRabbitLinePayAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
						lRabbitLinePayAmtMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
						lRabbitLinePayAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
						break
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
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
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
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
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
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
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsRabbitLinePaySuccessCase){
					lResult=true
				}
			}
			THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_RABBIT_LINE_PAY_IS_YEARLY=lRabbitLinePayIsYearly
			/*************************************************************************************************************************************************/
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
	public Map inputAutomationDataBefore(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			String lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'qotation-no'))
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
			String lStrPremiumAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice')).trim()
			String lStrPremiumAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumAmtMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumAmtQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			String lTagPaymentInstalmentOptionModalFormCloseButton='installment-modal-close-btn'
			String lLocatorPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormCloseButton)
			WebElement lElementPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormCloseButton)
			if(!lElementPaymentInstalmentOptionModalFormCloseButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE=lOpportunityNumber
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE=lStrPremiumAmtYearly
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_VALUE=lStrPremiumAmtDeposit
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_VALUE=lStrPremiumAmtMonthly
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_VALUE=lStrPremiumAmtInstalment
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE=lStrPremiumAmtNoDepositAmount
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE=lStrPremiumAmtNoDepositTotal
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_VALUE=lStrPremiumAmtQuarterlyAmount
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_VALUE=lStrPremiumAmtQuarterlyTotal
			lResult=lOpportunityNumber.length()>0
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
			lSalesforceRetrieveDataOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'qotation-no'))
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
			String lStrPremiumAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice')).trim()
			String lStrPremiumAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumAmtMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumAmtQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			String lTagPaymentInstalmentOptionModalFormCloseButton='installment-modal-close-btn'
			String lLocatorPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormCloseButton)
			WebElement lElementPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormCloseButton)
			if(!lElementPaymentInstalmentOptionModalFormCloseButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			lSalesforceRetrieveDataPremiumYearly=lStrPremiumAmtYearly
			lSalesforceRetrieveDataPremiumDeposit=lStrPremiumAmtDeposit
			lSalesforceRetrieveDataPremiumMonthly=lStrPremiumAmtMonthly
			lSalesforceRetrieveDataPremiumInstalment=lStrPremiumAmtInstalment
			lSalesforceRetrieveDataPremiumNoDepositAmount=lStrPremiumAmtNoDepositAmount
			lSalesforceRetrieveDataPremiumNoDepositTotal=lStrPremiumAmtNoDepositTotal
			lSalesforceRetrieveDataPremiumQuarterlyAmount=lStrPremiumAmtQuarterlyAmount
			lSalesforceRetrieveDataPremiumQuarterlyTotal=lStrPremiumAmtQuarterlyTotal
			lResult=lSalesforceRetrieveDataOpportunityNumber.length()>0
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THALowMileageCarQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			lSalesforceProceedTodo='Yes'
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			lSalesforceProceedTodo=IGNUemaHelper.convertBooleanToString(lIsSalesforceProceedTodo)
			IGNUemaHelper.delayThreadSecond(30)
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
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput){
		Map lreturn=[:]
		String lSalesforceVerifyCompareDetail=''
		String lSalesforceVerifyCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=caseOutput.OpportunityNumber
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
			switch(THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD){
				case '2':
					lAutomationYearly=caseOutput.IbAmtYearly
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
					lAutomationYearly=caseOutput.QrAmtYearly
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
						lAutomationYearly=caseOutput.TrueMoneyAmtYearly
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
						lAutomationPremiumNoDepositAmount=caseOutput.TrueMoneyAmtNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
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
						lAutomationPremiumNoDepositTotal=caseOutput.TrueMoneyAmtNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
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
						lAutomationYearly=caseOutput.RabbitLinePayAmtYearly
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
						lAutomationPremiumNoDepositAmount=caseOutput.RabbitLinePayAmtNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
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
						lAutomationPremiumNoDepositTotal=caseOutput.RabbitLinePayAmtNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
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
						lAutomationYearly=caseOutput.CcAmtYearly
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
						lAutomationPremiumNoDepositAmount=caseOutput.CcAmtNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
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
						lAutomationPremiumNoDepositTotal=caseOutput.CcAmtNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
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
		Map lreturn=[:]
		String lSalesforceRetrieveCompareDetail=''
		String lSalesforceRetrieveCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE
			String lSalesforceOpportunityNumber=caseOutput.SalesforceRetrieveDataOpportunityNumber
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
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
			String lAutomationPremiumNoDepositAmount=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE
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
			String lAutomationPremiumNoDepositTotal=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE
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
			lSalesforceProceedRetrieveTodo=THALowMileageCarQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
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
				String lLocatorResultPage='#payment-v3'
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
}