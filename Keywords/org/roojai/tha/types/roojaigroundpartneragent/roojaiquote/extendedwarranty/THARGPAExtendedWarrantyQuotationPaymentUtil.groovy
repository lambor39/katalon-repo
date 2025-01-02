package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaiquote.extendedwarranty.THAExtendedWarrantyQuotationPaymentUtil
public class THARGPAExtendedWarrantyQuotationPaymentUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAExtendedWarrantyQuotationPaymentUtil lTHAExtendedWarrantyQuotationPaymentUtil=null
	public THARGPAExtendedWarrantyQuotationPaymentUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAExtendedWarrantyQuotationPaymentUtil getlTHAExtendedWarrantyQuotationPaymentUtil(){
		return this.lTHAExtendedWarrantyQuotationPaymentUtil
	}
	private void setlTHAExtendedWarrantyQuotationPaymentUtil(THAExtendedWarrantyQuotationPaymentUtil newlTHAExtendedWarrantyQuotationPaymentUtil){
		//Do Nothing
		//this.lTHAExtendedWarrantyQuotationPaymentUtil=newlTHAExtendedWarrantyQuotationPaymentUtil
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
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lOpportunityNumber=''
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
			this.lTHAExtendedWarrantyQuotationPaymentUtil=new THAExtendedWarrantyQuotationPaymentUtil(this.driver,this.selenium)
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
			THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_METHOD=lPaymentMethod
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
					THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO=lTrueMoneyMobileNo
					THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL=lTrueMoneyEmail
					THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE=lTrueMoneySuccessCase
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
					THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO=lRabbitLinePayMobileNo
					THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL=lRabbitLinePayEmail
					THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE=lRabbitLinePaySuccessCase
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
			lPositiveCase=THARGPAExtendedWarrantyQuotationResultType.DEFAULT_POSITIVE_CASE
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
		if(lLanguage.length()<=0){
			lLanguage=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputLanguage(lLanguage)
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
			Map lMapOpportunityNumber=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputOpportunityNumber()
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
			lPaymentMethod=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_PAYMENT_METHOD
		}
		try{
			Boolean lResult=false
			lreturn.put('PaymentMethod','')
			lreturn.put('Result',lResult)
			Map lMapPaymentMethod=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPaymentMethod(lPaymentMethod)
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
	public Map inputPaymentByQR(String strEPolicy){
		Map lreturn=[:]
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lQrAmtYearly=''
		try{
			Boolean lResult=false
			Map lMapPaymentByQR=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPaymentByQR(lEPolicy)
			if(!lMapPaymentByQR.Result){
				lEPolicy=''
				lQrAmtYearly=''
			}else{
				lEPolicy=lMapPaymentByQR.EPolicy
				lQrAmtYearly=lMapPaymentByQR.QrAmtYearly
			}
			lResult=lMapPaymentByQR.Result
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
		String lIbBank=strIbBank.toUpperCase().trim()
		if(lIbBank.length()<=0){
			lIbBank=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_IB_BANK
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lIbSuccessCase=strIbSuccessCase.trim()
		if(lIbSuccessCase.length()<=0){
			lIbSuccessCase=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_IB_SUCCESS_CASE
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
			Map lMapPaymentByIB=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPaymentByIB(lIbBank,lEPolicy,lAutoRenew,lIbSuccessCase)
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
			lCcIsYearly=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_IS_YEARLY
		}
		String lCcInstalment=strCcInstalment.trim()
		if(lCcInstalment.length()<=0){
			lCcInstalment=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_INSTALMENT
		}
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
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
			Map lMapPaymentByCC=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPaymentByCC(lCcIsYearly,lCcInstalment,lCcNumber,lCcName,lCcExpiryMonth,lCcExpiryYear,lCcCvv,lCcBank,lEPolicy,lAutoRenew,lCcSuccessCase)
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
			lTrueMoneyIsYearly=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_TRUE_MONEY_IS_YEARLY
		}
		String lTrueMoneyInstalment=strTrueMoneyInstalment.trim()
		if(lTrueMoneyInstalment.length()<=0){
			lTrueMoneyInstalment=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_TRUE_MONEY_INSTALMENT
		}
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_TRUE_MONEY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_TRUE_MONEY_SUCCESS_CASE
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
			Map lMapPaymentByTrueMoney=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPaymentByTrueMoney(lTrueMoneyIsYearly,lTrueMoneyInstalment,lTrueMoneyMobileNo,lTrueMoneyEmail,lEPolicy,lAutoRenew,lTrueMoneySuccessCase)
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
			lRabbitLinePayIsYearly=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lRabbitLinePayInstalment=strRabbitLinePayInstalment.trim()
		if(lRabbitLinePayInstalment.length()<=0){
			lRabbitLinePayInstalment=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_INSTALMENT
		}
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_AUTO_RENEW
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THARGPAExtendedWarrantyQuotationPaymentType.DEFAULT_RABBIT_LINE_PAY_SUCCESS_CASE
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
			Map lMapPaymentByRabbitLinePay=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPaymentByRabbitLinePay(lRabbitLinePayIsYearly,lRabbitLinePayInstalment,lRabbitLinePayMobileNo,lRabbitLinePayEmail,lEPolicy,lAutoRenew,lRabbitLinePaySuccessCase)
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
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Map lMapActualResult=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputActualResult(isPositiveCase)
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
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			Map lMapPolicyInsurer=this.lTHAExtendedWarrantyQuotationPaymentUtil.inputPolicyInsurer(lPolicyInsurer)
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