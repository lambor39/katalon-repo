package org.roojai.tha.types.roojaigroundpartneragent.lowmileagecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarCoreType as LowMileageCarCoreType
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarQuotationSocialUtil
public class THARGPALowMileageCarQuotationSocialUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lLowMileageCarQuotationSocialUtil=null
	private lIsTrueMoneySuccessCase=false
	private lIsRabbitLinePaySuccessCase=false
	public THARGPALowMileageCarQuotationSocialUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THALowMileageCarQuotationSocialUtil getlLowMileageCarQuotationSocialUtil(){
		return this.lLowMileageCarQuotationSocialUtil
	}
	private void setlLowMileageCarQuotationSocialUtil(THALowMileageCarQuotationSocialUtil newlLowMileageCarQuotationSocialUtil){
		//Do Nothing
		//this.lLowMileageCarQuotationSocialUtil=newlLowMileageCarQuotationSocialUtil
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
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
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
			this.lLowMileageCarQuotationSocialUtil=new THALowMileageCarQuotationSocialUtil(this.driver,this.selenium)
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
					String lPaymentMethod=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD
					String lTrueMoneyMobileNo=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO
					String lTrueMoneyEmail=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL
					String lTrueMoneySuccessCase=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE
					String lRabbitLinePayMobileNo=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
					String lRabbitLinePayEmail=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL
					String lRabbitLinePaySuccessCase=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
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
							THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
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
							THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
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
				Boolean lIsActualResult=false
				Boolean lIsSalesforceProceedTodo=true
				Boolean lIsSalesforceProceedRetrieveTodo=false
				if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#new-paymentComplete',15)){
					if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete #rating-section')){
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
						lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
						if(lIsSalesforceProceedTodo){
							Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
							if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
								lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
							}
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
									Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL)
									lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
									lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
									caseOutput.ActualResult=lActualResult
									if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
										return lreturn
									}
								}
							}
						}
						if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#new-paymentComplete',15)){
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
						}
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
				lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				lIsActualResult=lIsPositiveCase&&lIsActualResult
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
					lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
					if(lIsSalesforceProceedTodo){
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
			}else{
				THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
				Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				lIsActualResult=lIsPositiveCase&&lIsActualResult
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
						}
						lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(lIsActualResult){
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
			lLanguage=THARGPALowMileageCarQuotationSocialType.DEFAULT_LANGUAGE.toUpperCase()
		}
		try{
			lreturn=this.lTHALowMileageCarQuotationSocialUtil.inputLanguage(lLanguage)
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
			lRatingForOverall=THARGPALowMileageCarQuotationSocialType.DEFAULT_RATING_FOR_OVERALL
		}
		String lRatingForWebsite=strRatingForWebsite.trim()
		if(lRatingForWebsite.length()<=0){
			lRatingForWebsite=THARGPALowMileageCarQuotationSocialType.DEFAULT_RATING_FOR_WEBSITE
		}
		String lRatingForCallCenter=strRatingForCallCenter.trim()
		if(lRatingForCallCenter.length()<=0){
			lRatingForCallCenter=THARGPALowMileageCarQuotationSocialType.DEFAULT_RATING_FOR_CALL_CENTER
		}
		String lRatingForProduct=strRatingForProduct.trim()
		if(lRatingForProduct.length()<=0){
			lRatingForProduct=THARGPALowMileageCarQuotationSocialType.DEFAULT_RATING_FOR_PRODUCT
		}
		String lRatingText=strRatingText.trim()
		if(lRatingText.length()<=0){
			lRatingText=THARGPALowMileageCarQuotationSocialType.DEFAULT_RATING_TEXT
		}
		String lWithFacebook=strWithFacebook.trim()
		if(lWithFacebook.length()<=0){
			lWithFacebook=THARGPALowMileageCarQuotationSocialType.DEFAULT_WITH_FACEBOOK
		}
		String lFacebookLoginId=strFacebookLoginId.trim()
		if(lFacebookLoginId.length()<=0){
			lFacebookLoginId=THARGPALowMileageCarQuotationSocialType.DEFAULT_FACEBOOK_LOGIN_ID
		}
		String lFacebookLoginPassword=strFacebookLoginPassword.trim()
		if(lFacebookLoginPassword.length()<=0){
			lFacebookLoginPassword=THARGPALowMileageCarQuotationSocialType.DEFAULT_FACEBOOK_LOGIN_PASSWORD
		}
		String lShareFacebook=strShareFacebook.trim()
		if(lShareFacebook.length()<=0){
			lShareFacebook=THARGPALowMileageCarQuotationSocialType.DEFAULT_SHARE_FACEBOOK
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
			Integer lRatingForOverallNum=IGNUemaHelper.convertStringToInteger(lRatingForOverall,lRatingScoreDefault)
			if((lRatingForOverallNum<lRatingScoreMin)||(lRatingForOverallNum>lRatingScoreMax)){
				lRatingForOverallNum=lRatingScoreDefault
			}
			Integer lRatingForWebsiteNum=IGNUemaHelper.convertStringToInteger(lRatingForWebsite,lRatingScoreDefault)
			if((lRatingForWebsiteNum<lRatingScoreMin)||(lRatingForWebsiteNum>lRatingScoreMax)){
				lRatingForWebsiteNum=lRatingScoreDefault
			}
			Integer lRatingForCallCenterNum=IGNUemaHelper.convertStringToInteger(lRatingForCallCenter,lRatingScoreDefault)
			if((lRatingForCallCenterNum<lRatingScoreMin)||(lRatingForCallCenterNum>lRatingScoreMax)){
				lRatingForCallCenterNum=lRatingScoreDefault
			}
			Integer lRatingForProductNum=IGNUemaHelper.convertStringToInteger(lRatingForProduct,lRatingScoreDefault)
			if((lRatingForProductNum<lRatingScoreMin)||(lRatingForProductNum>lRatingScoreMax)){
				lRatingForProductNum=lRatingScoreDefault
			}
			Boolean lIsValid=false
			Boolean lIsDone=false
			String lTagRateUsButton='rate-us-button'
			String lLocatorRateUsButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRateUsButton)
			WebElement lElementRateUsButton=null
			Boolean lIsRateUsButtonDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRateUsButton,15)
			lIsRateUsButtonDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorRateUsButton)
			if(lIsRateUsButtonDisplayed){
				lElementRateUsButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRateUsButton)
				if(lElementRateUsButton){
					Boolean lIsFoundFeefoWindow=false
					String lMainWindow=this.driver.getWindowHandle()
					if(lMainWindow.length()<=0){
						lMainWindow=this.driver.getWindowHandle()
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementRateUsButton)
					IGNUemaHelper.delayThreadSecond(3)
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
							IGNUemaHelper.delayThreadSecond(5)
							lSetWinHandle=this.driver.getWindowHandles()
						}else{
							if(lSetWinHandle.size()<=1){
								IGNUemaHelper.delayThreadSecond(5)
								lSetWinHandle=this.driver.getWindowHandles()
							}
						}
						if(!lSetWinHandle){
							IGNUemaHelper.delayThreadSecond(8)
							lSetWinHandle=this.driver.getWindowHandles()
						}else{
							if(lSetWinHandle.size()<=1){
								IGNUemaHelper.delayThreadSecond(8)
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
								lIsFoundFeefoWindow=true
								break
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
					if(lIsFoundFeefoWindow){
						String lLocatorRatingForOverall=''
						WebElement lElementRatingForOverall=null
						switch(lRatingForOverallNum){
							case 1:
								lLocatorRatingForOverall='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>feefo-rating>div>div>span:nth-child(1)>img:nth-child(2)'
								break
							case 2:
								lLocatorRatingForOverall='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>feefo-rating>div>div>span:nth-child(2)>img:nth-child(2)'
								break
							case 3:
								lLocatorRatingForOverall='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>feefo-rating>div>div>span:nth-child(3)>img:nth-child(2)'
								break
							case 4:
								lLocatorRatingForOverall='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>feefo-rating>div>div>span:nth-child(4)>img:nth-child(2)'
								break
							default:
								lLocatorRatingForOverall='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>feefo-rating>div>div>span:nth-child(5)>img:nth-child(2)'
								break
						}
						IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRatingForOverall,30)
						if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRatingForOverall,30)){
							lElementRatingForOverall=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRatingForOverall)
							if(lElementRatingForOverall){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementRatingForOverall)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRatingForOverall)
								if(lPolicyInsurer.length()>0){
									lRatingText='Insurer='+lPolicyInsurer+'|'+lRatingText
								}
								Map lCaseDetail2Output=[:]
								if(THARGPALowMileageCarQuotationDetail2Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Output)){
									String lOpportunityNumber=lCaseDetail2Output.get('OpportunityNumber').toString()
									lRatingText=lOpportunityNumber+'|'+lRatingText
								}
								lRatingText=lRatingText+'|LowMileageCar'
								String lText1=IGNUemaHelper.typeTextByLocator(this.driver,'body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>div>feefo-comment>div>div>textarea',lRatingText)
								String lText2=IGNUemaHelper.typeTextByLocator(this.driver,'body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>div>feefo-headline>div>div>input',lRatingText)
								lIsValid=(lText1.length()>0)&&(lText2.length()>0)
								if(!lIsValid){
									lRatingText=''
								}else{
									lRatingText=lText1
									String lLocatorRatingSubmitButton='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section>div>div:nth-child(2)>feefo-service-section>div>div>feefo-submit-button>button'
									WebElement lElementRatingSubmitButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRatingSubmitButton)
									if(lElementRatingSubmitButton){
										lIsValid=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementRatingSubmitButton)
										if(lIsValid){
											String lLocatorRatingForProduct=''
											WebElement lElementRatingForProduct=null
											switch(lRatingForProductNum){
												case 1:
													lLocatorRatingForProduct='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>div>div>div:nth-child(2)>div>feefo-rating>div>div>span:nth-child(1)>img:nth-child(2)'
													break
												case 2:
													lLocatorRatingForProduct='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>div>div>div:nth-child(2)>div>feefo-rating>div>div>span:nth-child(2)>img:nth-child(2)'
													break
												case 3:
													lLocatorRatingForProduct='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>div>div>div:nth-child(2)>div>feefo-rating>div>div>span:nth-child(3)>img:nth-child(2)'
													break
												case 4:
													lLocatorRatingForProduct='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>div>div>div:nth-child(2)>div>feefo-rating>div>div>span:nth-child(4)>img:nth-child(2)'
													break
												default:
													lLocatorRatingForProduct='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>div>div>div:nth-child(2)>div>feefo-rating>div>div>span:nth-child(5)>img:nth-child(2)'
													break
											}
											if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRatingForProduct,30)){
												lElementRatingForProduct=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRatingForProduct)
												if(lElementRatingForProduct){
													IGNUemaHelper.webJsScrollToElement(this.driver,lElementRatingForProduct)
													IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRatingForProduct)
													String lRatingForProductText=IGNUemaHelper.typeTextByLocator(this.driver,'body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>div>div>div:nth-child(2)>div>div>feefo-comment>div>div>textarea',lRatingText)
													String lLocatorRatingForProductSubmitButton='body>div.container>global>div>ui-view>ui-view>leave-feedback>div>feefo-sections>feefo-section:nth-child(2)>div>div:nth-child(2)>feefo-products-section>div>feefo-submit-button>button'
													WebElement lElementRatingForProductSubmitButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRatingForProductSubmitButton)
													if(lElementRatingForProductSubmitButton){
														lIsValid=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementRatingForProductSubmitButton)
														if(lIsValid){
															String lLocatorRatingThankyou='#reviews-ID>div.mp-content-reviews-block-banners'
															lIsDone=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRatingThankyou,30)
															if(lIsDone){
																IGNUemaHelper.delayThreadSecond(5)
																lRatingForWebsite='No Option'
																lRatingForCallCenter='No Option'
																lWithFacebook='No Option'
																lFacebookLoginId='No Option'
																lFacebookLoginPassword='No Option'
																lShareFacebook='No Option'
																try{
																	IGNUemaHelper.delayThreadSecond(5)
																	this.driver.close()
																	WebUI.switchToDefaultContent()
																	this.driver.switchTo().window(lMainWindow)
																}catch(Exception ex){
																	ex.printStackTrace()
																	this.driver.switchTo().window(lMainWindow)
																}
															}
														}
													}
												}
											}else{
												lIsDone=true
												if(lIsDone){
													IGNUemaHelper.delayThreadSecond(5)
													lRatingForWebsite='No Option'
													lRatingForCallCenter='No Option'
													lRatingForProduct='No Option'
													lWithFacebook='No Option'
													lFacebookLoginId='No Option'
													lFacebookLoginPassword='No Option'
													lShareFacebook='No Option'
													try{
														IGNUemaHelper.delayThreadSecond(5)
														this.driver.close()
														WebUI.switchToDefaultContent()
														this.driver.switchTo().window(lMainWindow)
													}catch(Exception ex){
														ex.printStackTrace()
														this.driver.switchTo().window(lMainWindow)
													}
												}
											}
										}
									}
								}
							}
						}
					}
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
			}
			lResult=lIsDone
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
			lTrueMoneyMobileNo=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE
		}
		String lOpportunityNumber=''
		String lAmtTotalPrice=''
		try{
			Boolean lResult=false
			lreturn.put('TrueMoneyMobileNo','')
			lreturn.put('TrueMoneyEmail','')
			lreturn.put('TrueMoneySuccessCase','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('AmtTotalPrice','')
			lreturn.put('Result',lResult)
			Boolean lIsValid=false
			Boolean lIsOK=false
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lTrueMoneyMobileNoText=lTrueMoneyMobileNo
			String lTrueMoneyEmailText=lTrueMoneyEmail
			lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'opportunity-id'))
			String lTagPaymentMethodModal=''
			String lLocatorPaymentMethodModal='.card-promptpay'
			WebElement lElementPaymentMethodModal=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModal)
			if(!lElementPaymentMethodModal){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentMethodModal)
			String lTagPaymentMethodModalForm='select-method'
			String lLocatorPaymentMethodModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentMethodModalForm)
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentMethodModalForm)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentMethodModalForm)
			String lTagPaymentByTrueMoneySelectButtonKey='payment-method'
			String lTagPaymentByTrueMoneySelectButtonValue='truemoney'
			String lLocatorPaymentByTrueMoneySelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByTrueMoneySelectButtonKey,lTagPaymentByTrueMoneySelectButtonValue)
			WebElement lElementPaymentByTrueMoneySelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentByTrueMoneySelectButtonKey,lTagPaymentByTrueMoneySelectButtonValue)
			if(!lElementPaymentByTrueMoneySelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByTrueMoneySelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByTrueMoneySelectButton)
			String lTagPaymentByTrueMoneyMobileNoInput='truemoney-mobile-number'
			String lLocatorPaymentByTrueMoneyMobileNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByTrueMoneyMobileNoInput)
			WebElement lElementPaymentByTrueMoneyMobileNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByTrueMoneyMobileNoInput)
			if(!lElementPaymentByTrueMoneyMobileNoInput){
				lTrueMoneyMobileNo='No Option'
			}else{
				lTrueMoneyMobileNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByTrueMoneyMobileNoInput,lTrueMoneyMobileNoText)
			}
			String lTagPaymentByTrueMoneyEmailInput='truemoney-email'
			String lLocatorPaymentByTrueMoneyEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByTrueMoneyEmailInput)
			WebElement lElementPaymentByTrueMoneyEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByTrueMoneyEmailInput)
			if(!lElementPaymentByTrueMoneyEmailInput){
				lTrueMoneyEmail='No Option'
			}else{
				lTrueMoneyEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByTrueMoneyEmailInput,lTrueMoneyEmailText)
			}
			lAmtTotalPrice=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'total-price'))
			String lTagPaymentByTrueMoneyButtonNext='btn-make-a-payment'
			String lLocatoPaymentByTrueMoneyButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByTrueMoneyButtonNext)
			WebElement lElementPaymentByTrueMoneyButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByTrueMoneyButtonNext)
			if(!lElementPaymentByTrueMoneyButtonNext){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByTrueMoneyButtonNext)
			lRedirected=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByTrueMoneyButtonNext)
			if(lRedirected){
				Boolean lIsTrueMoneySuccessCase=IGNUemaHelper.convertStringToBoolean(lTrueMoneySuccessCase)
				this.lIsTrueMoneySuccessCase=lIsTrueMoneySuccessCase
				String lLocatorFormOmise='#offsite-test-container'
				lIsValid=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				lIsValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(!lIsValid){
					return lreturn
				}else{
					if(lIsTrueMoneySuccessCase){
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lIsOK){
							lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lIsOK){
							lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
						}
					}
				}
				String lLocatorProgressDialog='#myPleaseWait'
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				String lTagButtonNext='nextProcess'
				String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
				IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
				WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
				String lLocatorThankyouPage='#thankyou-v3'
				String lLocatorSocialPage='#new-paymentComplete'
				String lLocatorAppDoc='#app'
				String lAppDocText=''
				String lCurrentURL=WebUI.getUrl()
				IGNUemaHelper.printLog(lCurrentURL)
				if(!lElementButtonNext){
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorSocialPage,10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
						if(!lRedirected){
							lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
							if(lAppDocText.length()<=0){
								if(lCurrentURL.toUpperCase().contains('THANKYOU')){
									WebUI.navigateToUrl(lCurrentURL)
									IGNUemaHelper.delayThreadSecond(10)
									lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
									if(!lRedirected){
										WebUI.navigateToUrl(lCurrentURL)
										IGNUemaHelper.delayThreadSecond(10)
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
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorSocialPage,30)
					if(!lRedirected){
						if(lCurrentURL.toUpperCase().contains('THANKYOU')){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							if(!lRedirected){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
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
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorSocialPage,60)
			}
			lIsDone=(lAmtTotalPrice.length()>0)&&lIsValid&&lIsOK&&lRedirected
			lResult=lIsDone
			if(lResult){
				lreturn.put('TrueMoneyMobileNo',lTrueMoneyMobileNo)
				lreturn.put('TrueMoneyEmail',lTrueMoneyEmail)
				lreturn.put('TrueMoneySuccessCase',lTrueMoneySuccessCase)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('AmtTotalPrice',lAmtTotalPrice)
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
			lRabbitLinePayMobileNo=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THARGPALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
		}
		String lOpportunityNumber=''
		String lAmtTotalPrice=''
		try{
			Boolean lResult=false
			lreturn.put('RabbitLinePayMobileNo','')
			lreturn.put('RabbitLinePayEmail','')
			lreturn.put('RabbitLinePaySuccessCase','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('AmtTotalPrice','')
			lreturn.put('Result',lResult)
			Boolean lIsValid=false
			Boolean lIsOK=false
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lRabbitLinePayMobileNoText=lRabbitLinePayMobileNo
			String lRabbitLinePayEmailText=lRabbitLinePayEmail
			lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'opportunity-id'))
			String lTagPaymentMethodModal=''
			String lLocatorPaymentMethodModal='.card-promptpay'
			WebElement lElementPaymentMethodModal=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentMethodModal)
			if(!lElementPaymentMethodModal){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentMethodModal)
			String lTagPaymentMethodModalForm='select-method'
			String lLocatorPaymentMethodModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentMethodModalForm)
			WebElement lElementPaymentMethodModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentMethodModalForm)
			if(!lElementPaymentMethodModalForm){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentMethodModalForm)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentMethodModalForm)
			String lTagPaymentByRabbitLinePaySelectButtonKey='payment-method'
			String lTagPaymentByRabbitLinePaySelectButtonValue='rabbit_linepay'
			String lLocatorPaymentByRabbitLinePaySelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByRabbitLinePaySelectButtonKey,lTagPaymentByRabbitLinePaySelectButtonValue)
			WebElement lElementPaymentByRabbitLinePaySelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentByRabbitLinePaySelectButtonKey,lTagPaymentByRabbitLinePaySelectButtonValue)
			if(!lElementPaymentByRabbitLinePaySelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByRabbitLinePaySelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByRabbitLinePaySelectButton)
			lAmtTotalPrice=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'total-price'))
			String lTagPaymentByRabbitLinePayButtonNext='btn-make-a-payment'
			String lLocatoPaymentByRabbitLinePayButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayButtonNext)
			WebElement lElementPaymentByRabbitLinePayButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayButtonNext)
			if(!lElementPaymentByRabbitLinePayButtonNext){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByRabbitLinePayButtonNext)
			lIsValid=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByRabbitLinePayButtonNext)
			if(lIsValid){
				Boolean lIsRabbitLinePaySuccessCase=IGNUemaHelper.convertStringToBoolean(lRabbitLinePaySuccessCase)
				this.lIsRabbitLinePaySuccessCase=lIsRabbitLinePaySuccessCase
				String lLocatorFormOmise='#payment-test-container'
				lIsValid=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				lIsValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(!lIsValid){
					return lreturn
				}else{
					String lTagPaymentByRabbitLinePayMobileNoInput='rabbit_linepay-mobile-number'
					String lLocatorPaymentByRabbitLinePayMobileNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayMobileNoInput)
					WebElement lElementPaymentByRabbitLinePayMobileNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayMobileNoInput)
					if(!lElementPaymentByRabbitLinePayMobileNoInput){
						lRabbitLinePayMobileNo='No Option'
					}else{
						lRabbitLinePayMobileNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByRabbitLinePayMobileNoInput,lRabbitLinePayMobileNoText)
					}
					String lTagPaymentByRabbitLinePayEmailInput='rabbit_linepay-email'
					String lLocatorPaymentByRabbitLinePayEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayEmailInput)
					WebElement lElementPaymentByRabbitLinePayEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayEmailInput)
					if(!lElementPaymentByRabbitLinePayEmailInput){
						lRabbitLinePayEmail='No Option'
					}else{
						lRabbitLinePayEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByRabbitLinePayEmailInput,lRabbitLinePayEmailText)
					}
					if(lIsRabbitLinePaySuccessCase){
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lIsOK){
							lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lIsOK){
							lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
						}
					}
				}
				String lLocatorProgressDialog='#myPleaseWait'
				IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,30)
				String lTagButtonNext='nextProcess'
				String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
				IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
				WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
				String lLocatorThankyouPage='#thankyou-v3'
				String lLocatorSocialPage='#new-paymentComplete'
				String lLocatorAppDoc='#app'
				String lAppDocText=''
				String lCurrentURL=WebUI.getUrl()
				IGNUemaHelper.printLog(lCurrentURL)
				if(!lElementButtonNext){
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorSocialPage,10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
						if(!lRedirected){
							lAppDocText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorAppDoc).trim()
							if(lAppDocText.length()<=0){
								if(lCurrentURL.toUpperCase().contains('THANKYOU')){
									WebUI.navigateToUrl(lCurrentURL)
									IGNUemaHelper.delayThreadSecond(10)
									lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
									if(!lRedirected){
										WebUI.navigateToUrl(lCurrentURL)
										IGNUemaHelper.delayThreadSecond(10)
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
					lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorSocialPage,30)
					if(!lRedirected){
						if(lCurrentURL.toUpperCase().contains('THANKYOU')){
							WebUI.navigateToUrl(lCurrentURL)
							IGNUemaHelper.delayThreadSecond(10)
							lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorThankyouPage,10)
							if(!lRedirected){
								WebUI.navigateToUrl(lCurrentURL)
								IGNUemaHelper.delayThreadSecond(10)
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
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorSocialPage,60)
			}
			lIsDone=(lAmtTotalPrice.length()>0)&&lIsValid&&lIsOK&&lRedirected
			lResult=lIsDone
			if(lResult){
				lreturn.put('RabbitLinePayMobileNo',lRabbitLinePayMobileNo)
				lreturn.put('RabbitLinePayEmail',lRabbitLinePayEmail)
				lreturn.put('RabbitLinePaySuccessCase',lRabbitLinePaySuccessCase)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('AmtTotalPrice',lAmtTotalPrice)
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
				lPositiveCase=THARGPALowMileageCarQuotationSocialType.DEFAULT_POSITIVE_CASE
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
			Map lMapPolicyInsurer=this.lTHALowMileageCarQuotationSocialUtil.inputPolicyInsurer(lPolicyInsurer)
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
			lSalesforceProceedTodo=THARGPALowMileageCarQuotationSocialType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHALowMileageCarQuotationSocialUtil.inputSalesforceProceedTodo(lSalesforceProceedTodo)
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
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyBefore=this.lTHALowMileageCarQuotationSocialUtil.inputSalesforceProceedVerifyBefore(caseOutput)
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
			Map lMapSalesforceProceedVerifyAfter=this.lTHALowMileageCarQuotationSocialUtil.inputSalesforceProceedVerifyAfter(caseOutput)
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
			lSalesforceProceedRetrieveTodo=THARGPALowMileageCarQuotationSocialType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lTHALowMileageCarQuotationSocialUtil.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
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
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lTHALowMileageCarQuotationSocialUtil.inputSalesforceProceedRetrieveWebFromUrl(lRetrievePageURL)
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