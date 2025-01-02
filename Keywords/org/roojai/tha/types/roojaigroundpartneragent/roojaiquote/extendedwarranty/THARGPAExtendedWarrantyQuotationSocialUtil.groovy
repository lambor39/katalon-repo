package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaiquote.extendedwarranty.THAExtendedWarrantyCoreType as ExtendedWarrantyCoreType
import org.roojai.tha.types.roojaiquote.extendedwarranty.THAExtendedWarrantyQuotationSocialUtil
public class THARGPAExtendedWarrantyQuotationSocialUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAExtendedWarrantyQuotationSocialUtil lTHAExtendedWarrantyQuotationSocialUtil=null
	public THARGPAExtendedWarrantyQuotationSocialUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAExtendedWarrantyQuotationSocialUtil getlTHAExtendedWarrantyQuotationSocialUtil(){
		return this.lTHAExtendedWarrantyQuotationSocialUtil
	}
	private void setlTHAExtendedWarrantyQuotationSocialUtil(THAExtendedWarrantyQuotationSocialUtil newlTHAExtendedWarrantyQuotationSocialUtil){
		//Do Nothing
		//this.lTHAExtendedWarrantyQuotationSocialUtil=newlTHAExtendedWarrantyQuotationSocialUtil
	}
	public Boolean inputSocial(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lRatingForOverall=caseInput.RatingForOverall.toString().trim()
		String lRatingForWebsite=caseInput.RatingForWebsite.toString().trim()
		String lRatingForCallCenter=caseInput.RatingForCallCenter.toString().trim()
		String lRatingForProduct=caseInput.RatingForProduct.toString().trim()
		String lRatingText=caseInput.RatingText.toString().trim()
		String lWithFacebook=caseInput.WithFacebook.toString().trim()
		String lFacebookLoginId=caseInput.FacebookLoginId.toString().trim()
		String lFacebookLoginPassword=caseInput.FacebookLoginPassword.toString().trim()
		String lShareFacebook=caseInput.ShareFacebook.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyInsurer=''
		String lPolicyPaymentDetail=''
		try{
			lPositiveCase=this.inputPositiveCase(lPositiveCase)
			if(lPositiveCase.length()<=0){
				return lreturn
			}else{
				caseOutput.PositiveCase=lPositiveCase
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			this.lTHAExtendedWarrantyQuotationSocialUtil=new THAExtendedWarrantyQuotationSocialUtil(this.driver,this.selenium)
			lLanguage=this.inputLanguage(lLanguage)
			if(lLanguage.length()<=0){
				return lreturn
			}else{
				caseOutput.Language=lLanguage
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
			if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#new-paymentComplete',15)){
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete #qr-payment')){
					String lPaymentMethod=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_METHOD
					String lTrueMoneyMobileNo=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO
					String lTrueMoneyEmail=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL
					String lTrueMoneySuccessCase=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE
					String lRabbitLinePayMobileNo=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
					String lRabbitLinePayEmail=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL
					String lRabbitLinePaySuccessCase=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
					String lOpportunityNumber=''
					String lAmtTotalPrice=''
					switch(lPaymentMethod){
						case '4':
							Map lMapPaymentByTrueMoney=this.inputPaymentByTrueMoney(lTrueMoneyMobileNo,lTrueMoneyEmail,lTrueMoneySuccessCase)
							if(!lMapPaymentByTrueMoney.Result){
								lTrueMoneyMobileNo=''
								lTrueMoneyEmail=''
								lTrueMoneySuccessCase=''
								lOpportunityNumber=''
								lAmtTotalPrice=''
							}else{
								lTrueMoneyMobileNo=lMapPaymentByTrueMoney.TrueMoneyMobileNo
								lTrueMoneyEmail=lMapPaymentByTrueMoney.TrueMoneyEmail
								lTrueMoneySuccessCase=lMapPaymentByTrueMoney.TrueMoneySuccessCase
								lOpportunityNumber=lMapPaymentByTrueMoney.OpportunityNumber
								lAmtTotalPrice=lMapPaymentByTrueMoney.AmtTotalPrice
							}
							THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
							lPolicyPaymentDetail='OpportunityNumber='+lOpportunityNumber
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'MobileNo='+lTrueMoneyMobileNo
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'Email='+lTrueMoneyEmail
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'SuccessCase='+lTrueMoneySuccessCase
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'AmtTotalPrice='+lAmtTotalPrice
							caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
							if(!lMapPaymentByTrueMoney.Result){
								return lreturn
							}
							break
						case '5':
							Map lMapPaymentByRabbitLinePay=this.inputPaymentByRabbitLinePay(lRabbitLinePayMobileNo,lRabbitLinePayEmail,lRabbitLinePaySuccessCase)
							if(!lMapPaymentByRabbitLinePay.Result){
								lRabbitLinePayMobileNo=''
								lRabbitLinePayEmail=''
								lRabbitLinePaySuccessCase=''
								lOpportunityNumber=''
								lAmtTotalPrice=''
							}else{
								lRabbitLinePayMobileNo=lMapPaymentByRabbitLinePay.RabbitLinePayMobileNo
								lRabbitLinePayEmail=lMapPaymentByRabbitLinePay.RabbitLinePayEmail
								lRabbitLinePaySuccessCase=lMapPaymentByRabbitLinePay.RabbitLinePaySuccessCase
								lOpportunityNumber=lMapPaymentByRabbitLinePay.OpportunityNumber
								lAmtTotalPrice=lMapPaymentByRabbitLinePay.AmtTotalPrice
							}
							THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
							lPolicyPaymentDetail='OpportunityNumber='+lOpportunityNumber
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'MobileNo='+lRabbitLinePayMobileNo
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'Email='+lRabbitLinePayEmail
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'SuccessCase='+lRabbitLinePaySuccessCase
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							lPolicyPaymentDetail=lPolicyPaymentDetail+'AmtTotalPrice='+lAmtTotalPrice
							caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
							if(!lMapPaymentByRabbitLinePay.Result){
								return lreturn
							}
							break
						default:
							lPolicyPaymentDetail=IGNUemaHelper.getTextByLocator(this.driver,'#new-paymentComplete #qr-payment').trim()
							if(lPolicyPaymentDetail.length()>0){
								lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
							}
							lPolicyPaymentDetail=lPolicyPaymentDetail+IGNUemaHelper.getChildTextByLocator(this.driver,'#new-paymentComplete #qr-payment').trim()
							lPolicyPaymentDetail=lPolicyPaymentDetail.trim()
							if(lPolicyPaymentDetail.length()<=0){
								lPolicyPaymentDetail='No Option'
							}
							caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
							break
					}
				}else{
					lPolicyPaymentDetail='No Option'
					caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
				}
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#new-paymentComplete',15)){
					if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete #rating-section')){
						if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete #rating-section #rate-us-button')){
							Map lMapFeefoRating=this.inputFeefoRating(lPolicyInsurer,lRatingForOverall,lRatingForWebsite,lRatingForCallCenter,lRatingForProduct,lRatingText,lWithFacebook,lFacebookLoginId,lFacebookLoginPassword,lShareFacebook)
							if(!lMapFeefoRating.Result){
								lRatingForOverall=''
								lRatingForWebsite=''
								lRatingForCallCenter=''
								lRatingForProduct=''
								lRatingText=''
								lWithFacebook=''
								lFacebookLoginId=''
								lFacebookLoginPassword=''
								lShareFacebook=''
							}else{
								lRatingForOverall=lMapFeefoRating.RatingForOverall
								lRatingForWebsite=lMapFeefoRating.RatingForWebsite
								lRatingForCallCenter=lMapFeefoRating.RatingForCallCenter
								lRatingForProduct=lMapFeefoRating.RatingForProduct
								lRatingText=lMapFeefoRating.RatingText
								lWithFacebook=lMapFeefoRating.WithFacebook
								lFacebookLoginId=lMapFeefoRating.FacebookLoginId
								lFacebookLoginPassword=lMapFeefoRating.FacebookLoginPassword
								lShareFacebook=lMapFeefoRating.ShareFacebook
							}
							caseOutput.RatingForOverall=lRatingForOverall
							caseOutput.RatingForWebsite=lRatingForWebsite
							caseOutput.RatingForCallCenter=lRatingForCallCenter
							caseOutput.RatingForProduct=lRatingForProduct
							caseOutput.RatingText=lRatingText
							caseOutput.WithFacebook=lWithFacebook
							caseOutput.FacebookLoginId=lFacebookLoginId
							caseOutput.FacebookLoginPassword=lFacebookLoginPassword
							caseOutput.ShareFacebook=lShareFacebook
							if(!lMapFeefoRating.Result){
								return lreturn
							}
							lActualResult=IGNUemaHelper.convertBooleanToString(true)
							caseOutput.ActualResult=lActualResult
						}
						lActualResult=IGNUemaHelper.convertBooleanToString(true)
						caseOutput.ActualResult=lActualResult
					}else if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete .card-promptpay')){
						lActualResult=IGNUemaHelper.convertBooleanToString(true)
						caseOutput.ActualResult=lActualResult
					}else{
						lActualResult=IGNUemaHelper.convertBooleanToString(false)
						caseOutput.ActualResult=lActualResult
					}
				}else{
					lActualResult=IGNUemaHelper.convertBooleanToString(false)
					caseOutput.ActualResult=lActualResult
				}
				Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				lIsActualResult=lIsPositiveCase&&lIsActualResult
				lreturn=lIsActualResult
			}else{
				if(THAExtendedWarrantyCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION){
					lActualResult=IGNUemaHelper.convertBooleanToString(true)
					caseOutput.ActualResult=lActualResult
				}
				Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				lIsActualResult=lIsPositiveCase&&lIsActualResult
				lreturn=lIsActualResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputLanguage(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_LANGUAGE.toUpperCase()
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationSocialUtil.inputLanguage(lLanguage)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputFeefoRating(String strPolicyInsurer,String strRatingForOverall,String strRatingForWebsite,String strRatingForCallCenter,String strRatingForProduct,String strRatingText,String strWithFacebook,String strFacebookLoginId,String strFacebookLoginPassword,String strShareFacebook){
		Map lreturn=[:]
		String lPolicyInsurer=strPolicyInsurer.trim()
		String lRatingForOverall=strRatingForOverall.trim()
		if(lRatingForOverall.length()<=0){
			lRatingForOverall=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_RATING_FOR_OVERALL
		}
		String lRatingForWebsite=strRatingForWebsite.trim()
		if(lRatingForWebsite.length()<=0){
			lRatingForWebsite=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_RATING_FOR_WEBSITE
		}
		String lRatingForCallCenter=strRatingForCallCenter.trim()
		if(lRatingForCallCenter.length()<=0){
			lRatingForCallCenter=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_RATING_FOR_CALL_CENTER
		}
		String lRatingForProduct=strRatingForProduct.trim()
		if(lRatingForProduct.length()<=0){
			lRatingForProduct=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_RATING_FOR_PRODUCT
		}
		String lRatingText=strRatingText.trim()
		if(lRatingText.length()<=0){
			lRatingText=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_RATING_TEXT
		}
		String lWithFacebook=strWithFacebook.trim()
		if(lWithFacebook.length()<=0){
			lWithFacebook=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_WITH_FACEBOOK
		}
		String lFacebookLoginId=strFacebookLoginId.trim()
		if(lFacebookLoginId.length()<=0){
			lFacebookLoginId=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_FACEBOOK_LOGIN_ID
		}
		String lFacebookLoginPassword=strFacebookLoginPassword.trim()
		if(lFacebookLoginPassword.length()<=0){
			lFacebookLoginPassword=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_FACEBOOK_LOGIN_PASSWORD
		}
		String lShareFacebook=strShareFacebook.trim()
		if(lShareFacebook.length()<=0){
			lShareFacebook=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_SHARE_FACEBOOK
		}
		Integer lRatingScoreMin=1
		Integer lRatingScoreMax=5
		Integer lRatingScoreDefault=5
		try{
			Boolean lResult=false
			lreturn.put('RatingForOverall','')
			lreturn.put('RatingForWebsite','')
			lreturn.put('RatingForCallCenter','')
			lreturn.put('RatingForProduct','')
			lreturn.put('RatingText','')
			lreturn.put('WithFacebook','')
			lreturn.put('FacebookLoginId','')
			lreturn.put('FacebookLoginPassword','')
			lreturn.put('ShareFacebook','')
			lreturn.put('Result',lResult)
			Map lMapFeefoRating=this.lTHAExtendedWarrantyQuotationSocialUtil.inputFeefoRating(lPolicyInsurer,lRatingForOverall,lRatingForWebsite,lRatingForCallCenter,lRatingForProduct,lRatingText,lWithFacebook,lFacebookLoginId,lFacebookLoginPassword,lShareFacebook)
			if(!lMapFeefoRating.Result){
				lRatingForOverall=''
				lRatingForWebsite=''
				lRatingForCallCenter=''
				lRatingForProduct=''
				lRatingText=''
				lWithFacebook=''
				lFacebookLoginId=''
				lFacebookLoginPassword=''
				lShareFacebook=''
			}else{
				lRatingForOverall=lMapFeefoRating.RatingForOverall
				lRatingForWebsite=lMapFeefoRating.RatingForWebsite
				lRatingForCallCenter=lMapFeefoRating.RatingForCallCenter
				lRatingForProduct=lMapFeefoRating.RatingForProduct
				lRatingText=lMapFeefoRating.RatingText
				lWithFacebook=lMapFeefoRating.WithFacebook
				lFacebookLoginId=lMapFeefoRating.FacebookLoginId
				lFacebookLoginPassword=lMapFeefoRating.FacebookLoginPassword
				lShareFacebook=lMapFeefoRating.ShareFacebook
			}
			lResult=lMapFeefoRating.Result
			if(lResult){
				lreturn.put('RatingForOverall',lRatingForOverall)
				lreturn.put('RatingForWebsite',lRatingForWebsite)
				lreturn.put('RatingForCallCenter',lRatingForCallCenter)
				lreturn.put('RatingForProduct',lRatingForProduct)
				lreturn.put('RatingText',lRatingText)
				lreturn.put('WithFacebook',lWithFacebook)
				lreturn.put('FacebookLoginId',lFacebookLoginId)
				lreturn.put('FacebookLoginPassword',lFacebookLoginPassword)
				lreturn.put('ShareFacebook',lShareFacebook)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByTrueMoney(String strTrueMoneyMobileNo,String strTrueMoneyEmail,String strTrueMoneySuccessCase){
		Map lreturn=[:]
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE
		}
		String lAmtTotalPrice=''
		String lOpportunityNumber=''
		try{
			Boolean lResult=false
			lreturn.put('TrueMoneyMobileNo','')
			lreturn.put('TrueMoneyEmail','')
			lreturn.put('TrueMoneySuccessCase','')
			lreturn.put('AmtTotalPrice','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			Map lMapPaymentByTrueMoney=this.lTHAExtendedWarrantyQuotationSocialUtil.inputPaymentByTrueMoney(lTrueMoneyMobileNo,lTrueMoneyEmail,lTrueMoneySuccessCase)
			if(!lMapPaymentByTrueMoney.Result){
				lTrueMoneyMobileNo=''
				lTrueMoneyEmail=''
				lTrueMoneySuccessCase=''
				lOpportunityNumber=''
				lAmtTotalPrice=''
			}else{
				lTrueMoneyMobileNo=lMapPaymentByTrueMoney.TrueMoneyMobileNo
				lTrueMoneyEmail=lMapPaymentByTrueMoney.TrueMoneyEmail
				lTrueMoneySuccessCase=lMapPaymentByTrueMoney.TrueMoneySuccessCase
				lOpportunityNumber=lMapPaymentByTrueMoney.OpportunityNumber
				lAmtTotalPrice=lMapPaymentByTrueMoney.AmtTotalPrice
			}
			lResult=lMapPaymentByTrueMoney.Result
			if(lResult){
				lreturn.put('TrueMoneyMobileNo',lTrueMoneyMobileNo)
				lreturn.put('TrueMoneyEmail',lTrueMoneyEmail)
				lreturn.put('TrueMoneySuccessCase',lTrueMoneySuccessCase)
				lreturn.put('AmtTotalPrice',lAmtTotalPrice)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByRabbitLinePay(String strRabbitLinePayMobileNo,String strRabbitLinePayEmail,String strRabbitLinePaySuccessCase){
		Map lreturn=[:]
		String lRabbitLinePayMobileNo=strRabbitLinePayMobileNo.trim()
		if(lRabbitLinePayMobileNo.length()<=0){
			lRabbitLinePayMobileNo=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THARGPAExtendedWarrantyCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
		}
		String lAmtTotalPrice=''
		String lOpportunityNumber=''
		try{
			Boolean lResult=false
			lreturn.put('RabbitLinePayMobileNo','')
			lreturn.put('RabbitLinePayEmail','')
			lreturn.put('RabbitLinePaySuccessCase','')
			lreturn.put('AmtTotalPrice','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			Map lMapPaymentByRabbitLinePay=this.lTHAExtendedWarrantyQuotationSocialUtil.inputPaymentByRabbitLinePay(lRabbitLinePayMobileNo,lRabbitLinePayEmail,lRabbitLinePaySuccessCase)
			if(!lMapPaymentByRabbitLinePay.Result){
				lRabbitLinePayMobileNo=''
				lRabbitLinePayEmail=''
				lRabbitLinePaySuccessCase=''
				lAmtTotalPrice=''
				lOpportunityNumber=''
			}else{
				lRabbitLinePayMobileNo=lMapPaymentByRabbitLinePay.RabbitLinePayMobileNo
				lRabbitLinePayEmail=lMapPaymentByRabbitLinePay.RabbitLinePayEmail
				lRabbitLinePaySuccessCase=lMapPaymentByRabbitLinePay.RabbitLinePaySuccessCase
				lAmtTotalPrice=lMapPaymentByRabbitLinePay.AmtTotalPrice
				lOpportunityNumber=lMapPaymentByRabbitLinePay.OpportunityNumber
			}
			lResult=lMapPaymentByRabbitLinePay.Result
			if(lResult){
				lreturn.put('RabbitLinePayMobileNo',lRabbitLinePayMobileNo)
				lreturn.put('RabbitLinePayEmail',lRabbitLinePayEmail)
				lreturn.put('RabbitLinePaySuccessCase',lRabbitLinePaySuccessCase)
				lreturn.put('AmtTotalPrice',lAmtTotalPrice)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPositiveCase(String strPositiveCase){
		String lreturn=''
		String lPositiveCase=strPositiveCase.trim()
		try{
			String lText=''
			if(lPositiveCase.length()<=0){
				lPositiveCase=THARGPAExtendedWarrantyQuotationSocialType.DEFAULT_POSITIVE_CASE
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lText=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lreturn=lText
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
			Map lMapPolicyInsurer=this.lTHAExtendedWarrantyQuotationSocialUtil.inputPolicyInsurer(lPolicyInsurer)
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
}