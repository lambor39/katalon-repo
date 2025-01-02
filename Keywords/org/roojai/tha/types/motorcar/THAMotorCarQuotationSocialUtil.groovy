package org.roojai.tha.types.motorcar
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNOmiseRestAPIHelper as IGNOmiseRestAPIHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THAMotorCarQuotationSocialUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private lIsQrSuccessCase=false
	private lIsTrueMoneySuccessCase=false
	private lIsRabbitLinePaySuccessCase=false
	private lIsMobileBankingSuccessCase=false
	public THAMotorCarQuotationSocialUtil(WebDriver newDriver,WebDriver newSelenium){
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
			String lOpportunityNumberOld=THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.trim()
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
				THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
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
			Boolean lIsPaymentPromptPayPageVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete #qr-payment')
			if(!lIsPaymentPromptPayPageVisible){
				lIsPaymentPromptPayPageVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-promptpay #qr-payment')
			}
			if(!lIsPaymentPromptPayPageVisible){
				lPolicyPaymentDetail='No Option'
				caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
			}else{
				String lPaymentMethod=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD
				String lQrSuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_QR_CODE_SUCCESS_CASE
				String lTrueMoneyMobileNo=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO
				String lTrueMoneyEmail=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL
				String lTrueMoneySuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE
				String lRabbitLinePayMobileNo=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
				String lRabbitLinePayEmail=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL
				String lRabbitLinePaySuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
				String lMobileBankingCard=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_CARD
				String lMobileBankingSuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_SUCCESS_CASE
				String lOpportunityNumber=''
				String lAmtTotalPrice=''
				switch(lPaymentMethod){
					case '3':
						Map lMapPaymentByQR=this.inputPaymentByQR(lQrSuccessCase)
						if(!lMapPaymentByQR.Result){
							lQrSuccessCase=''
							lOpportunityNumber=''
							lAmtTotalPrice=''
						}else{
							lQrSuccessCase=lMapPaymentByQR.QrSuccessCase
							lOpportunityNumber=lMapPaymentByQR.OpportunityNumber
							lAmtTotalPrice=lMapPaymentByQR.AmtTotalPrice
						}
						THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
						lPolicyPaymentDetail='OpportunityNumber='+lOpportunityNumber
						lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
						lPolicyPaymentDetail=lPolicyPaymentDetail+'SuccessCase='+lQrSuccessCase
						lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
						lPolicyPaymentDetail=lPolicyPaymentDetail+'AmtTotalPrice='+lAmtTotalPrice
						caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
						if(!lMapPaymentByQR.Result){
							return lreturn
						}
						break
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
						THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
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
						THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
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
					case '6':
						Boolean lSetBrowserWindowModeSize=IGNUemaHelper.setBrowserWindowModeSize(this.driver,false,576,1024)
						Map lMapPaymentByMobileBanking=this.inputPaymentByMobileBanking(lMobileBankingCard,lMobileBankingSuccessCase)
						if(!lMapPaymentByMobileBanking.Result){
							lMobileBankingCard=''
							lMobileBankingSuccessCase=''
							lOpportunityNumber=''
							lAmtTotalPrice=''
						}else{
							lMobileBankingCard=lMapPaymentByMobileBanking.MobileBankingCard
							lMobileBankingSuccessCase=lMapPaymentByMobileBanking.MobileBankingSuccessCase
							lOpportunityNumber=lMapPaymentByMobileBanking.OpportunityNumber
							lAmtTotalPrice=lMapPaymentByMobileBanking.AmtTotalPrice
						}
						THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
						lPolicyPaymentDetail='OpportunityNumber='+lOpportunityNumber
						lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
						lPolicyPaymentDetail=lPolicyPaymentDetail+'MobileNo='+lMobileBankingCard
						lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
						lPolicyPaymentDetail=lPolicyPaymentDetail+'SuccessCase='+lMobileBankingSuccessCase
						lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
						lPolicyPaymentDetail=lPolicyPaymentDetail+'AmtTotalPrice='+lAmtTotalPrice
						caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
						if(!lMapPaymentByMobileBanking.Result){
							return lreturn
						}
						break
					default:
						lPolicyPaymentDetail=IGNUemaHelper.getTextByLocator(this.driver,'#new-paymentComplete #qr-payment').trim()
						if(lPolicyPaymentDetail.length()>0){
							lPolicyPaymentDetail=lPolicyPaymentDetail+'\n'
						}
						lPolicyPaymentDetail=lPolicyPaymentDetail+IGNUemaHelper.getChildTextByLocator(this.driver,'#new-promptpay #qr-payment').trim()
						lPolicyPaymentDetail=lPolicyPaymentDetail.trim()
						if(lPolicyPaymentDetail.length()<=0){
							lPolicyPaymentDetail='No Option'
						}
						caseOutput.PolicyPaymentDetail=lPolicyPaymentDetail
						break
				}
			}
			Boolean lIsActualResult=false
			Boolean lIsSalesforceProceedTodo=true
			Boolean lIsSalesforceProceedRetrieveTodo=false
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
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THAMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL)
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
						lActualResult=IGNUemaHelper.convertBooleanToString(true)
						caseOutput.ActualResult=lActualResult
					}
					lActualResult=IGNUemaHelper.convertBooleanToString(true)
					caseOutput.ActualResult=lActualResult
				}
			}else if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-paymentComplete .card-promptpay')){
				lActualResult=IGNUemaHelper.convertBooleanToString(true)
				caseOutput.ActualResult=lActualResult
			}else if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,'#new-promptpay .card-promptpay')){
				lActualResult=IGNUemaHelper.convertBooleanToString(true)
				caseOutput.ActualResult=lActualResult
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
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAMotorCarQuotationSocialType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMotorCarQuotationSocialType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THAMotorCarQuotationSocialType.DEFAULT_LANGUAGE)
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
	public Map inputFeefoRating(String strPolicyInsurer,String strRatingForOverall,String strRatingForWebsite,String strRatingForCallCenter,String strRatingForProduct,String strRatingText,String strWithFacebook,String strFacebookLoginId,String strFacebookLoginPassword,String strShareFacebook){
		Map lreturn=[:]
		String lPolicyInsurer=strPolicyInsurer.trim()
		String lRatingForOverall=strRatingForOverall.trim()
		if(lRatingForOverall.length()<=0){
			lRatingForOverall=THAMotorCarQuotationSocialType.DEFAULT_RATING_FOR_OVERALL
		}
		String lRatingForWebsite=strRatingForWebsite.trim()
		if(lRatingForWebsite.length()<=0){
			lRatingForWebsite=THAMotorCarQuotationSocialType.DEFAULT_RATING_FOR_WEBSITE
		}
		String lRatingForCallCenter=strRatingForCallCenter.trim()
		if(lRatingForCallCenter.length()<=0){
			lRatingForCallCenter=THAMotorCarQuotationSocialType.DEFAULT_RATING_FOR_CALL_CENTER
		}
		String lRatingForProduct=strRatingForProduct.trim()
		if(lRatingForProduct.length()<=0){
			lRatingForProduct=THAMotorCarQuotationSocialType.DEFAULT_RATING_FOR_PRODUCT
		}
		String lRatingText=strRatingText.trim()
		if(lRatingText.length()<=0){
			lRatingText=THAMotorCarQuotationSocialType.DEFAULT_RATING_TEXT
		}
		String lWithFacebook=strWithFacebook.trim()
		if(lWithFacebook.length()<=0){
			lWithFacebook=THAMotorCarQuotationSocialType.DEFAULT_WITH_FACEBOOK
		}
		String lFacebookLoginId=strFacebookLoginId.trim()
		if(lFacebookLoginId.length()<=0){
			lFacebookLoginId=THAMotorCarQuotationSocialType.DEFAULT_FACEBOOK_LOGIN_ID
		}
		String lFacebookLoginPassword=strFacebookLoginPassword.trim()
		if(lFacebookLoginPassword.length()<=0){
			lFacebookLoginPassword=THAMotorCarQuotationSocialType.DEFAULT_FACEBOOK_LOGIN_PASSWORD
		}
		String lShareFacebook=strShareFacebook.trim()
		if(lShareFacebook.length()<=0){
			lShareFacebook=THAMotorCarQuotationSocialType.DEFAULT_SHARE_FACEBOOK
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
								if(THAMotorCarQuotationDetail2Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Output)){
									String lOpportunityNumber=lCaseDetail2Output.get('OpportunityNumber').toString()
									lRatingText=lOpportunityNumber+'|'+lRatingText
								}
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
															if(!lIsDone){
																lLocatorRatingThankyou='thank-you'
																IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRatingThankyou,15)
																lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorRatingThankyou,30)
															}
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
															if(!lIsDone){
																lLocatorRatingThankyou='thank-you'
																IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRatingThankyou,15)
																lIsDone=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorRatingThankyou,30)
															}
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
	public Map inputPaymentByQR(String strQrSuccessCase){
		Map lreturn=[:]
		String lQrSuccessCase=strQrSuccessCase.trim()
		if(lQrSuccessCase.length()<=0){
			lQrSuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_QR_CODE_SUCCESS_CASE
		}
		String lOpportunityNumber=''
		String lAmtTotalPrice=''
		try{
			Boolean lResult=false
			lreturn.put('QrSuccessCase','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('AmtTotalPrice','')
			lreturn.put('Result',lResult)
			Boolean lIsOK=false
			Boolean lIsDone=false
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
			String lTagPaymentByQRCodeSelectButtonKey='payment-method'
			String lTagPaymentByQRCodeSelectButtonValue='Cash'
			String lLocatorPaymentByQRCodeSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByQRCodeSelectButtonKey,lTagPaymentByQRCodeSelectButtonValue)
			WebElement lElementPaymentByQRCodeSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentByQRCodeSelectButtonKey,lTagPaymentByQRCodeSelectButtonValue)
			if(!lElementPaymentByQRCodeSelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByQRCodeSelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByQRCodeSelectButton)
			String lLocatorQRCodePromptPayImageId='#promptpayQRCode'
			Boolean lIsQRCodePromptPayImageDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQRCodePromptPayImageId,15)
			if(lIsQRCodePromptPayImageDisplayed){
				List<String> lQRCodePromptPayUrlList=[]
				WebElement lElementQRCodePromptPayImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQRCodePromptPayImageId)
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementQRCodePromptPayImage)
				Boolean lIsQrSuccessCase=IGNUemaHelper.convertStringToBoolean(lQrSuccessCase)
				this.lIsQrSuccessCase=lIsQrSuccessCase
				if(lIsQrSuccessCase){
					String lQRCodePromptPayUrl=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementQRCodePromptPayImage,'src').trim()
					lQRCodePromptPayUrlList=lQRCodePromptPayUrl.split('/')
					String lQRCodePromptPayChargesId=lQRCodePromptPayUrlList.get(4)
					Map lMapPostOmiseMarkAsPaid=IGNOmiseRestAPIHelper.mapPostOmiseMarkAsPaid(lQRCodePromptPayChargesId)
					lIsOK=lMapPostOmiseMarkAsPaid.Result
				}else{
					lIsOK=true
				}
				lAmtTotalPrice=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'total-price'))
				lIsDone=(lAmtTotalPrice.length()>0)&&lIsOK
				lResult=lIsDone
			}
			if(lResult){
				lreturn.put('QrSuccessCase',lQrSuccessCase)
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
	public Map inputPaymentByTrueMoney(String strTrueMoneyMobileNo,String strTrueMoneyEmail,String strTrueMoneySuccessCase){
		Map lreturn=[:]
		String lTrueMoneyMobileNo=strTrueMoneyMobileNo.trim()
		if(lTrueMoneyMobileNo.length()<=0){
			lTrueMoneyMobileNo=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_MOBILE_NO
		}
		String lTrueMoneyEmail=strTrueMoneyEmail.trim()
		if(lTrueMoneyEmail.length()<=0){
			lTrueMoneyEmail=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_EMAIL
		}
		String lTrueMoneySuccessCase=strTrueMoneySuccessCase.trim()
		if(lTrueMoneySuccessCase.length()<=0){
			lTrueMoneySuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_TRUE_MONEY_SUCCESS_CASE
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
			lRabbitLinePayMobileNo=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lRabbitLinePayEmail=strRabbitLinePayEmail.trim()
		if(lRabbitLinePayEmail.length()<=0){
			lRabbitLinePayEmail=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_EMAIL
		}
		String lRabbitLinePaySuccessCase=strRabbitLinePaySuccessCase.trim()
		if(lRabbitLinePaySuccessCase.length()<=0){
			lRabbitLinePaySuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
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
			IGNUemaHelper.delayThreadSecond(10)
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
						IGNUemaHelper.delayThreadSecond(3)
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						IGNUemaHelper.delayThreadSecond(3)
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
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
	public Map inputPaymentByMobileBanking(String strMobileBankingCard,String strMobileBankingSuccessCase){
		Map lreturn=[:]
		String lMobileBankingCard=strMobileBankingCard.trim()
		if(lMobileBankingCard.length()<=0){
			lMobileBankingCard=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_CARD
		}
		String lMobileBankingSuccessCase=strMobileBankingSuccessCase.trim()
		if(lMobileBankingSuccessCase.length()<=0){
			lMobileBankingSuccessCase=THAMotorCarCoreType.CURRENT_QUOTATION_PAYMENT_MOBILE_BANKING_SUCCESS_CASE
		}
		String lOpportunityNumber=''
		String lAmtTotalPrice=''
		try{
			Boolean lResult=false
			lreturn.put('MobileBankingCard','')
			lreturn.put('MobileBankingSuccessCase','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('AmtTotalPrice','')
			lreturn.put('Result',lResult)
			Boolean lIsValid=false
			Boolean lIsOK=false
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lMobileBankingCardText=lMobileBankingCard
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
			String lTagPaymentByMobileBankingSelectButtonKey='payment-method'
			String lTagPaymentByMobileBankingSelectButtonValue='mobilebanking'
			String lLocatorPaymentByMobileBankingSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentByMobileBankingSelectButtonKey,lTagPaymentByMobileBankingSelectButtonValue)
			WebElement lElementPaymentByMobileBankingSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentByMobileBankingSelectButtonKey,lTagPaymentByMobileBankingSelectButtonValue)
			if(!lElementPaymentByMobileBankingSelectButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByMobileBankingSelectButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByMobileBankingSelectButton)
			lAmtTotalPrice=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'total-price'))

			String lTagPaymentByMobileBankingCard='mobileBankingType'
			WebElement lElementPaymentByMobileBankingSelectedButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentByMobileBankingCard,lMobileBankingCardText)
			List<WebElement> lListElementPaymentByMobileBanking=[]
			if(!lElementPaymentByMobileBankingSelectedButton){
				lListElementPaymentByMobileBanking=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagPaymentByMobileBankingCard)
				if(lListElementPaymentByMobileBanking){
					lElementPaymentByMobileBankingSelectedButton=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lListElementPaymentByMobileBanking)
					lMobileBankingCardText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentByMobileBankingSelectedButton)
				}
			}
			if(!lElementPaymentByMobileBankingSelectedButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentByMobileBankingSelectedButton)
			lIsValid=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentByMobileBankingSelectedButton)
			IGNUemaHelper.delayThreadSecond(10)
			if(lIsValid){
				Boolean lIsMobileBankingSuccessCase=IGNUemaHelper.convertStringToBoolean(lMobileBankingSuccessCase)
				this.lIsMobileBankingSuccessCase=lIsMobileBankingSuccessCase
				String lLocatorFormOmise='#offsite-test-container'
				lIsValid=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				lIsValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(!lIsValid){
					return lreturn
				}else{
					if(lIsMobileBankingSuccessCase){
						IGNUemaHelper.delayThreadSecond(3)
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
						}
					}else{
						IGNUemaHelper.delayThreadSecond(3)
						lIsOK=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
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
			Boolean lSetBrowserWindowModeSize=IGNUemaHelper.setBrowserWindowModeSize(this.driver,false,576,1024)
			if(lResult){
				lreturn.put('MobileBankingCard',lMobileBankingCardText)
				lreturn.put('MobileBankingSuccessCase',lMobileBankingSuccessCase)
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
				lPositiveCase=THAMotorCarQuotationSocialType.DEFAULT_POSITIVE_CASE
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
	public String inputActualResult(Boolean isPositiveCase,Boolean isShareFacebook){
		String lreturn=''
		try{
			String lText=''
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lTagButton='post-button'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagButtonNext=''
			if(isShareFacebook){
				lTagButtonNext='next-to-fbshare'
			}else{
				lTagButtonNext='next-to-success'
			}
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=null
			IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorButton,10)
			if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButton)){
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorButtonNext,60)
				if(isPositiveCase){
					lIsDone=lRedirected
				}else{
					lIsDone=!lRedirected
				}
			}else{
				if(!isPositiveCase){
					lIsDone=true
				}
			}
			Boolean lIsActualResult=IGNUemaHelper.convertBooleanToString(lIsDone)
			if(isPositiveCase&&lIsActualResult){
				IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorButtonNext,10)
				lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
				if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonNext)){
					lIsActualResult=false
				}else{
					String lMainWindow=this.driver.getWindowHandle()
					if(lMainWindow.length()<=0){
						lMainWindow=this.driver.getWindowHandle()
					}
					if(!isShareFacebook){
						lIsActualResult=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#new-paymentComplete #success-section',60)
					}else{
						try{
							Set<String> lSetWinHandle=this.driver.getWindowHandles()
							for(String lWindowHandle:lSetWinHandle){
								if(!lMainWindow.equals(lWindowHandle)){
									this.driver.switchTo().window(lWindowHandle)
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,'button[name=__CONFIRM__]',5)){
										IGNUemaHelper.selectButtonByLocator(this.driver,'button[name=__CONFIRM__]')
										IGNUemaHelper.delayThreadSecond(5)
									}
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
						lIsActualResult=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#new-paymentComplete #success-section',60)
					}
				}
			}
			lText=IGNUemaHelper.convertBooleanToString(lIsActualResult)
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THAMotorCarQuotationSocialType.DEFAULT_SALESFORCE_PROCEED_TODO
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
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput){
		Map lreturn=[:]
		String lSalesforceVerifyCompareDetail=''
		String lSalesforceVerifyCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
			String lSalesforceOpportunityNumber=caseOutput.SalesforceVerifyDataOpportunityObjName
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
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
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'COMP')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice COMP'
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'VOL')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice VOL'
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'RSA')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice RSA'
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'CRS')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice CRS'
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
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
		Map lreturn=[:]
		String lSalesforceRetrieveCompareDetail=''
		String lSalesforceRetrieveCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
			String lSalesforceOpportunityNumber=caseOutput.SalesforceVerifyDataOpportunityObjName
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lSalesforceTransaction=caseOutput.SalesforceVerifyDataOpportunityObjStagename
			if(!IGNUemaHelper.checkStringContainString(lSalesforceTransaction,'Closed Won')){
				lIsOK=false
				lText='Transaction='+lSalesforceTransaction
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
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
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lSalesforceOutstandingBalanceC=caseOutput.SalesforceVerifyDataOpportunityObjOutstandingBalanceC
			Float lOutstandingBalance=IGNUemaHelper.convertStringToFloat(lSalesforceOutstandingBalanceC,0)
			if(lOutstandingBalance<1){
				for(Integer lIndex=0;lIndex<=5;lIndex++){
					Integer lItemIndex=lIndex+1
					String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
					String lQuoteLineItem=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverCodeC')
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'COMP')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice COMP'
							lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
						}
					}
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'VOL')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice VOL'
							lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
						}
					}
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'RSA')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice RSA'
							lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
						}
					}
					if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'CRS')){
						String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
						if(lQuoteLineItemTaxInvoice.length()<=0){
							lIsOK=false
							lText='TaxInvoice CRS'
							lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
						}
					}
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
			lSalesforceProceedRetrieveTodo=THAMotorCarQuotationPaymentType.DEFAULT_SALESFORCE_PROCEED_TODO
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
				String lLocatorResultPage='#new-paymentComplete'
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
					lRedirected=lCurrentURL.toUpperCase().contains('PAYMENTCOMPLETE')
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