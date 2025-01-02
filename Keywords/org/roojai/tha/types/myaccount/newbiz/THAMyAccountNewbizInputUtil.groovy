package org.roojai.tha.types.myaccount.newbiz
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.tha.core.THARoojaiWebsite
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAMyAccountNewbizInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAMyAccountNewbizInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean inputCase(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lLoginMethod=caseInput.LoginMethod.toString().trim()
		String lLoginEmailThaiIdPassportNo=caseInput.LoginEmailThaiIdPassportNo.toString().trim()
		String lLoginFacebookUser=caseInput.LoginFacebookUser.toString().trim()
		String lLoginFacebookPassword=caseInput.LoginFacebookPassword.toString().trim()
		String lOtpMethod=caseInput.OtpMethod.toString().trim()
		String lOtpEmail=caseInput.OtpEmail.toString().trim()
		String lOtpPhoneNo=caseInput.OtpPhoneNo.toString().trim()
		String lExpectedAccountName=caseInput.ExpectedAccountName.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
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
			Map lMapVersion=this.inputVersion(lBaseUrl,lVersion)
			if(!lMapVersion.Result){
				lVersion=''
			}else{
				lVersion=lMapVersion.Version
			}
			caseOutput.Version=lVersion
			if(lVersion.length()<=0){
				return lreturn
			}
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
			Map lMapLoginMethod=this.inputLoginMethod(lLoginMethod)
			if(!lMapLoginMethod.Result){
				lLoginMethod=''
			}else{
				lLoginMethod=lMapLoginMethod.LoginMethod
			}
			caseOutput.LoginMethod=lLoginMethod
			if(lLoginMethod.length()<=0){
				return lreturn
			}
			Integer lLoginMethodNum=IGNUemaHelper.convertStringToInteger(lLoginMethod,this.DEFAULT_NUM_LOGIN_METHOD)
			if(lLoginMethodNum==this.DEFAULT_NUM_LOGIN_METHOD){
				Map lMapLoginEmailThaiIdPassportNo=this.inputLoginEmailThaiIdPassportNo(lLoginEmailThaiIdPassportNo)
				if(!lMapLoginEmailThaiIdPassportNo.Result){
					lLoginEmailThaiIdPassportNo=''
				}else{
					lLoginEmailThaiIdPassportNo=lMapLoginEmailThaiIdPassportNo.LoginEmailThaiIdPassportNo
				}
				caseOutput.LoginEmailThaiIdPassportNo=lLoginEmailThaiIdPassportNo
			}else{
				Map lMapLoginFacebook=this.inputLoginFacebook(lLoginFacebookUser,lLoginFacebookPassword)
				if(!lMapLoginFacebook.Result){
					lLoginFacebookUser=''
					lLoginFacebookPassword=''
				}else{
					lLoginFacebookUser=lMapLoginFacebook.LoginFacebookUser
					lLoginFacebookPassword=lMapLoginFacebook.LoginFacebookPassword
				}
				caseOutput.LoginFacebookUser=lLoginFacebookUser
				caseOutput.LoginFacebookPassword=IGNUemaHelper.convertStringToPassword(lLoginFacebookPassword)
			}
			if(lLoginMethodNum==this.DEFAULT_NUM_LOGIN_METHOD){
				Map lMapOtpMethod=this.inputOtpMethod(lOtpMethod)
				if(!lMapOtpMethod.Result){
					lOtpMethod=''
				}else{
					lOtpMethod=lMapOtpMethod.OtpMethod
				}
				caseOutput.OtpMethod=lOtpMethod
				if(lOtpMethod.length()<=0){
					return lreturn
				}
				Integer lOtpMethodNum=IGNUemaHelper.convertStringToInteger(lOtpMethod,this.DEFAULT_NUM_OTP_METHOD)
				if(lOtpMethodNum==this.DEFAULT_NUM_OTP_METHOD){
					Map lMapOtpEmail=this.inputOtpEmail(lOtpEmail)
					if(!lMapOtpEmail.Result){
						lOtpEmail=''
					}else{
						lOtpEmail=lMapOtpEmail.OtpEmail
					}
					caseOutput.OtpEmail=lOtpEmail
					if(lOtpEmail.length()<=0){
						return lreturn
					}
				}else{
					Map lMapOtpPhoneNo=this.inputOtpPhoneNo(lOtpPhoneNo)
					if(!lMapOtpPhoneNo.Result){
						lOtpPhoneNo=''
					}else{
						lOtpPhoneNo=lMapOtpPhoneNo.OtpPhoneNo
					}
					caseOutput.OtpPhoneNo=lOtpPhoneNo
					if(lOtpPhoneNo.length()<=0){
						return lreturn
					}
				}
			}
			Map lMapExpectedAccountName=this.inputExpectedAccountName(lExpectedAccountName)
			if(!lMapExpectedAccountName.Result){
				lExpectedAccountName=''
			}else{
				lExpectedAccountName=lMapExpectedAccountName.ExpectedAccountName
			}
			caseOutput.ExpectedAccountName=lExpectedAccountName
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
			lPositiveCase=THAMyAccountNewbizInputType.DEFAULT_POSITIVE_CASE
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
	public Map inputVersion(String strBaseUrl,String strVersion){
		Map lreturn=[:]
		String lBaseUrl=strBaseUrl.trim()
		if(lBaseUrl.length()<=0){
			lBaseUrl=THAMyAccountNewbizInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAMyAccountNewbizInputType.DEFAULT_VERSION
		lDefaultVersion=lDefaultVersion.toLowerCase()
		String lVersion=strVersion.trim()
		if(lVersion.length()<=0){
			lVersion=lDefaultVersion
		}
		try{
			Boolean lResult=false
			lreturn.put('Version','')
			lreturn.put('Result',lResult)
			String lBrowserInfo=IGNUemaHelper.getBrowserInfo(this.driver)
			String lURLAbout='/#/test'
			this.driver.get(lBaseUrl+lURLAbout)
			IGNUemaHelper.delayThreadSecond(3)
			String lBuildVersion=IGNUemaHelper.getTextByLocator(this.driver,'#app')
			lBuildVersion=lBuildVersion.trim()
			if(lBuildVersion.length()<=0){
				this.driver.get(lBaseUrl+lURLAbout)
				IGNUemaHelper.delayThreadSecond(5)
				lBuildVersion=IGNUemaHelper.getTextByLocator(this.driver,'#app')
				lBuildVersion=lBuildVersion.trim()
			}
			if(lBuildVersion.length()<=0){
				this.driver.get(lBaseUrl+lURLAbout)
				IGNUemaHelper.delayThreadSecond(8)
				lBuildVersion=IGNUemaHelper.getTextByLocator(this.driver,'#app')
				lBuildVersion=lBuildVersion.trim()
			}
			String lVersionOutput=''
			lVersion=IGNUemaHelper.validateVersionString(lVersion,lDefaultVersion)
			lVersion=lVersion.toLowerCase()
			this.driver.get(lBaseUrl+'/#/?abtesting='+lVersion)
			IGNUemaHelper.delayThreadSecond(3)
			lVersionOutput=lVersion.toUpperCase()
			lVersionOutput=IGNUemaHelper.concatMessageLeftRightByPipe(lVersionOutput,lBrowserInfo)
			lVersionOutput=IGNUemaHelper.concatMessageLeftRightByPipe(lVersionOutput,lBuildVersion)
			lResult=lVersionOutput.length()>0
			lreturn.put('Version',lVersionOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMyAccountNewbizInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lLanguageItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lLanguageItem)
			if(!lElementButton){
				lLanguage='No Option'
			}else{
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)
				String lTagButtonSelected='select-language'
				String lLocatorButtonSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonSelected)
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonSelected)
				if(!lElementButtonSelected){
					lLanguage=lLanguageItem
				}else{
					lLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THAMyAccountNewbizInputType.DEFAULT_LANGUAGE
			}
			lLanguage=lLanguage.toUpperCase().trim()
			lResult=lLanguage.length()>0
			String lTagPDPAForm='pdpa_cookie'
			String lLocatorPDPAForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAForm)
			WebElement lElementPDPAForm=null
			Boolean lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			String lTagPDPAButton='pdpa_accept_all'
			String lLocatorPDPAButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAButton)
			WebElement lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPDPAForm,lTagPDPAButton)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPDPAForm,lTagPDPAButton)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
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
	public static final Integer DEFAULT_NUM_LOGIN_METHOD=1
	public Map inputLoginMethod(String strLoginMethod){
		Map lreturn=[:]
		String lLoginMethod=strLoginMethod.trim()
		if(lLoginMethod.length()<=0){
			lLoginMethod=THAMyAccountNewbizInputType.DEFAULT_LOGIN_METHOD
		}
		Map lLoginMethodList=['1':'1','2':'2']
		try{
			Boolean lResult=false
			lreturn.put('LoginMethod','')
			lreturn.put('Result',lResult)
			String lLoginMethodItem=lLoginMethodList.get(lLoginMethod)
			if(!lLoginMethodItem){
				lLoginMethodItem=lLoginMethodList.get(THAMyAccountNewbizInputType.DEFAULT_LOGIN_METHOD)
			}
			Integer lLoginMethodNum=IGNUemaHelper.convertStringToInteger(lLoginMethodItem,this.DEFAULT_NUM_LOGIN_METHOD)
			lLoginMethod=lLoginMethodNum.toString()
			lResult=lLoginMethod.length()>0
			if(lResult){
				lreturn.put('LoginMethod',lLoginMethod)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoginEmailThaiIdPassportNo(String strLoginEmailThaiIdPassportNo){
		Map lreturn=[:]
		String lLoginEmailThaiIdPassportNo=strLoginEmailThaiIdPassportNo.trim()
		if(lLoginEmailThaiIdPassportNo.length()<=0){
			lLoginEmailThaiIdPassportNo=THAMyAccountNewbizInputType.DEFAULT_LOGIN_EMAIL_THAI_ID_PASSPORT_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginEmailThaiIdPassportNo','')
			lreturn.put('Result',lResult)
			String lTagInputText='login-username'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lLoginEmailThaiIdPassportNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lLoginEmailThaiIdPassportNo)
			String lTagButtonSubmit='login-btn'
			String lLocatorButtonSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonSubmit)
			WebElement lElementButtonSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonSubmit)
			lResult=(lElementButtonSubmit!=null)
			if(lResult){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonSubmit)
			}
			if(lResult){
				lreturn.put('LoginEmailThaiIdPassportNo',lLoginEmailThaiIdPassportNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoginFacebook(String strLoginFacebookUser,String strLoginFacebookPassword){
		Map lreturn=[:]
		String lLoginFacebookUser=strLoginFacebookUser.trim()
		if(lLoginFacebookUser.length()<=0){
			lLoginFacebookUser=THAMyAccountNewbizInputType.DEFAULT_LOGIN_FACEBOOK_USER
		}
		String lLoginFacebookPassword=strLoginFacebookPassword.trim()
		if(lLoginFacebookPassword.length()<=0){
			lLoginFacebookPassword=THAMyAccountNewbizInputType.DEFAULT_LOGIN_FACEBOOK_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginFacebookUser','')
			lreturn.put('LoginFacebookPassword','')
			lreturn.put('Result',lResult)
			String lTagOpenFacebookLoginButton='fb-login-btn'
			String lLocatorOpenFacebookLoginButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOpenFacebookLoginButton)
			WebElement lElementOpenFacebookLoginButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenFacebookLoginButton)
			if(!lElementOpenFacebookLoginButton){
				return lreturn
			}
			lResult=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenFacebookLoginButton)
			if(lResult){
				String lMainWindow=this.driver.getWindowHandle()
				IGNUemaHelper.delayThreadSecond(3)
				try{
					Set<String> lSetWinHandle=this.driver.getWindowHandles()
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							IGNUemaHelper.delayThreadSecond(1)
							lLoginFacebookUser=IGNUemaHelper.typeTextByLocator(this.driver,'#facebook #email',lLoginFacebookUser)
							lLoginFacebookPassword=IGNUemaHelper.typeTextByLocator(this.driver,'#facebook #pass',lLoginFacebookPassword)
							if((lLoginFacebookUser.length()>0)&&(lLoginFacebookPassword.length()>0)){
								if(IGNUemaHelper.selectButtonByLocator(this.driver,'#facebook #loginbutton input')){
									if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,'button[name=__CONFIRM__]',5)){
										IGNUemaHelper.selectButtonByLocator(this.driver,'button[name=__CONFIRM__]')
									}
									IGNUemaHelper.delayThreadSecond(2)
								}
							}
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
			}
			IGNUemaHelper.delayThreadSecond(1)
			String lTagOpenFacebookLogonButton='fb-login'
			String lLocatorOpenFacebookLogonButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOpenFacebookLogonButton)
			WebElement lElementOpenFacebookLogonButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenFacebookLogonButton)
			if(!lElementOpenFacebookLogonButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementOpenFacebookLogonButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenFacebookLogonButton)
			}
			if(!lElementOpenFacebookLogonButton){
				return lreturn
			}
			lResult=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenFacebookLogonButton)
			IGNUemaHelper.delayThreadSecond(3)
			lElementOpenFacebookLoginButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenFacebookLoginButton)
			if(lElementOpenFacebookLoginButton){
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenFacebookLoginButton)
				IGNUemaHelper.delayThreadSecond(5)
				lElementOpenFacebookLogonButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenFacebookLogonButton)
				if(lElementOpenFacebookLogonButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenFacebookLogonButton)
				}
			}
			if(lResult){
				lreturn.put('LoginFacebookUser',lLoginFacebookUser)
				lreturn.put('LoginFacebookPassword',lLoginFacebookPassword)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final Integer DEFAULT_NUM_OTP_METHOD=1
	public Map inputOtpMethod(String strOtpMethod){
		Map lreturn=[:]
		String lOtpMethod=strOtpMethod.trim()
		if(lOtpMethod.length()<=0){
			lOtpMethod=THAMyAccountNewbizInputType.DEFAULT_OTP_METHOD
		}
		Map lOtpMethodList=['1':'1','2':'2']
		try{
			Boolean lResult=false
			lreturn.put('OtpMethod','')
			lreturn.put('Result',lResult)
			String lOtpMethodItem=lOtpMethodList.get(lOtpMethod)
			if(!lOtpMethodItem){
				lOtpMethodItem=lOtpMethodList.get(THAMyAccountNewbizInputType.DEFAULT_OTP_METHOD)
			}
			Integer lOtpMethodNum=IGNUemaHelper.convertStringToInteger(lOtpMethodItem,this.DEFAULT_NUM_OTP_METHOD)
			lOtpMethod=lOtpMethodNum.toString()
			lResult=lOtpMethod.length()>0
			if(lResult){
				lreturn.put('OtpMethod',lOtpMethod)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOtpEmail(String strOtpEmail){
		Map lreturn=[:]
		String lOtpEmail=strOtpEmail.toLowerCase().trim()
		if(lOtpEmail.length()<=0){
			lOtpEmail=THAMyAccountNewbizInputType.DEFAULT_OTP_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('OtpEmail','')
			lreturn.put('Result',lResult)
			if(lOtpEmail.length()<=0){
				return lreturn
			}
			String lOtpEmailMask=IGNUemaHelper.convertStringEmailToMyAccountMaskText(lOtpEmail)
			IGNUemaHelper.delayThreadSecond(1)
			String lTagOtpEmailItemList='email-otp'
			String lLocatorOtpEmailItemList=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpEmailItemList)
			List<WebElement> lElementOtpEmailItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpEmailItemList)
			if(!lElementOtpEmailItemList){
				IGNUemaHelper.delayThreadSecond(3)
				lElementOtpEmailItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpEmailItemList)
			}
			if(!lElementOtpEmailItemList){
				IGNUemaHelper.delayThreadSecond(5)
				lElementOtpEmailItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpEmailItemList)
			}
			if(!lElementOtpEmailItemList){
				IGNUemaHelper.delayThreadSecond(8)
				lElementOtpEmailItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpEmailItemList)
			}
			if(!lElementOtpEmailItemList){
				IGNUemaHelper.delayThreadSecond(13)
				lElementOtpEmailItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpEmailItemList)
			}
			if(!lElementOtpEmailItemList){
				return lreturn
			}
			WebElement lElementOtpEmailItemSelected=null
			for(WebElement lElementOtpEmailItem in lElementOtpEmailItemList){
				String lItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementOtpEmailItem).trim()
				if(lItemText.length()>0){
					if(lItemText.toLowerCase().contains(lOtpEmailMask)){
						lElementOtpEmailItemSelected=lElementOtpEmailItem
						break
					}
				}
			}
			if(!lElementOtpEmailItemSelected){
				return lreturn
			}
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOtpEmailItemSelected)
			String lTagOtpSendButton='sendOTP'
			String lLocatorOtpSendButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpSendButton)
			WebElement lElementOtpSendButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOtpSendButton)
			if(!lElementOtpSendButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementOtpSendButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOtpSendButton)
			}
			if(!lElementOtpSendButton){
				return lreturn
			}
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOtpSendButton)
			String lTagOtpReadyButton='otp-number-delete'
			String lLocatorOtpReadyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpReadyButton)
			String lIsReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorOtpReadyButton,90)
			if(!lIsReady){
				return lreturn
			}
			String lTextOTP=THARoojaiWebsite.OTPMyAccountByEmail(lOtpEmail,true)
			if(lTextOTP.length()<=0){
				return lreturn
			}
			lResult=this.inputFillTextOTP(lTextOTP)
			if(lResult){
				lreturn.put('OtpEmail',lOtpEmail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOtpPhoneNo(String strOtpPhoneNo){
		Map lreturn=[:]
		String lOtpPhoneNo=strOtpPhoneNo.toLowerCase().trim()
		if(lOtpPhoneNo.length()<=0){
			lOtpPhoneNo=THAMyAccountNewbizInputType.DEFAULT_OTP_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('OtpPhoneNo','')
			lreturn.put('Result',lResult)
			if(lOtpPhoneNo.length()<=0){
				return lreturn
			}
			String lOtpPhoneNoMask=IGNUemaHelper.convertStringPhoneToMyAccountMaskText(lOtpPhoneNo)
			IGNUemaHelper.delayThreadSecond(1)
			String lTagOtpPhoneNoItemList='mobile-otp'
			String lLocatorOtpPhoneNoItemList=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpPhoneNoItemList)
			List<WebElement> lElementOtpPhoneNoItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpPhoneNoItemList)
			if(!lElementOtpPhoneNoItemList){
				IGNUemaHelper.delayThreadSecond(3)
				lElementOtpPhoneNoItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpPhoneNoItemList)
			}
			if(!lElementOtpPhoneNoItemList){
				IGNUemaHelper.delayThreadSecond(5)
				lElementOtpPhoneNoItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpPhoneNoItemList)
			}
			if(!lElementOtpPhoneNoItemList){
				IGNUemaHelper.delayThreadSecond(8)
				lElementOtpPhoneNoItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpPhoneNoItemList)
			}
			if(!lElementOtpPhoneNoItemList){
				IGNUemaHelper.delayThreadSecond(13)
				lElementOtpPhoneNoItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOtpPhoneNoItemList)
			}
			if(!lElementOtpPhoneNoItemList){
				return lreturn
			}
			WebElement lElementOtpPhoneNoItemSelected=null
			for(WebElement lElementOtpPhoneNoItem in lElementOtpPhoneNoItemList){
				String lItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementOtpPhoneNoItem).trim()
				if(lItemText.length()>0){
					if(lItemText.toLowerCase().contains(lOtpPhoneNoMask)){
						lElementOtpPhoneNoItemSelected=lElementOtpPhoneNoItem
						break
					}
				}
			}
			if(!lElementOtpPhoneNoItemSelected){
				return lreturn
			}
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOtpPhoneNoItemSelected)
			String lTagOtpSendButton='sendOTP'
			String lLocatorOtpSendButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpSendButton)
			WebElement lElementOtpSendButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOtpSendButton)
			if(!lElementOtpSendButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementOtpSendButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOtpSendButton)
			}
			if(!lElementOtpSendButton){
				return lreturn
			}
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOtpSendButton)
			String lTagOtpReadyButton='otp-number-delete'
			String lLocatorOtpReadyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpReadyButton)
			String lIsReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorOtpReadyButton,90)
			if(!lIsReady){
				return lreturn
			}
			String lTextOTP=THARoojaiWebsite.OTPMyAccountByPhoneNo(lOtpPhoneNo,true)
			if(lTextOTP.length()<=0){
				return lreturn
			}
			lResult=this.inputFillTextOTP(lTextOTP)
			if(lResult){
				lreturn.put('OtpPhoneNo',lOtpPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputFillTextOTP(String strTextOTP){
		Boolean lreturn=false
		String lTextOTP=strTextOTP.trim()
		if(lTextOTP.length()<=0){
			return lreturn
		}
		try{
			IGNUemaHelper.printLog('inputFillTextOTP:'+strTextOTP)
			Map lTagButtonList=['0':'otp-number-0','1':'otp-number-1','2':'otp-number-2','3':'otp-number-3','4':'otp-number-4','5':'otp-number-5','6':'otp-number-6','7':'otp-number-7','8':'otp-number-8','9':'otp-number-9']
			Boolean lIsOK=true
			for(lTextOTPChar in lTextOTP){
				String lTagButtonFind=lTextOTPChar.toString()
				String lTagButtonItem=lTagButtonList.get(lTagButtonFind)
				if(!lTagButtonItem){
					lIsOK=false
					break
				}
				String lLocatorButtonItem=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonItem)
				WebElement lElementButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonItem)
				if(!lElementButtonItem){
					lIsOK=false
					break
				}
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonItem)
			}
			lreturn=lIsOK
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputExpectedAccountName(String strExpectedAccountName){
		Map lreturn=[:]
		String lExpectedAccountName=strExpectedAccountName.trim()
		if(lExpectedAccountName.length()<=0){
			lExpectedAccountName=THAMyAccountNewbizInputType.DEFAULT_EXPECTED_ACCOUNT_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('ExpectedAccountName','')
			lreturn.put('Result',lResult)
			String lTagOtpReadyButton='otp-number-delete'
			String lLocatorOtpReadyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOtpReadyButton)
			String lIsReady=IGNUemaHelper.checkElementAbsentByLocator(this.driver,lLocatorOtpReadyButton,90)
			if(!lIsReady){
				return lreturn
			}
			String lExpectedAccountNameFind=lExpectedAccountName.toLowerCase().trim()
			Boolean lIsFound=false
			if(lExpectedAccountNameFind.length()>0){
				String lTagExpectedAccountNameItemList='choose-account'
				String lLocatorExpectedAccountNameItemList=IGNUemaHelper.getTagDataSeleniumKey(lTagExpectedAccountNameItemList)
				List<WebElement> lElementExpectedAccountNameItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagExpectedAccountNameItemList)
				if(!lElementExpectedAccountNameItemList){
					IGNUemaHelper.delayThreadSecond(3)
					lElementExpectedAccountNameItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagExpectedAccountNameItemList)
				}
				if(!lElementExpectedAccountNameItemList){
					IGNUemaHelper.delayThreadSecond(5)
					lElementExpectedAccountNameItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagExpectedAccountNameItemList)
				}
				if(lElementExpectedAccountNameItemList){
					WebElement lElementExpectedAccountNameItemSelected=null
					WebElement lElementExpectedAccountNameItemParent=null
					String lItemText=''
					for(WebElement lElementExpectedAccountNameItem in lElementExpectedAccountNameItemList){
						lElementExpectedAccountNameItemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementExpectedAccountNameItem)
						if(lElementExpectedAccountNameItemParent){
							lItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementExpectedAccountNameItemParent).trim()
							if(lItemText.length()>0){
								if(lItemText.toLowerCase().contains(lExpectedAccountNameFind)){
									lElementExpectedAccountNameItemSelected=lElementExpectedAccountNameItem
									lExpectedAccountName=lItemText
									lIsFound=true
									break
								}
							}
						}
					}
					if(!lElementExpectedAccountNameItemSelected){
						lElementExpectedAccountNameItemSelected=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementExpectedAccountNameItemList)
						if(lElementExpectedAccountNameItemSelected){
							lElementExpectedAccountNameItemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementExpectedAccountNameItemSelected)
							lItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementExpectedAccountNameItemParent).trim()
							lExpectedAccountName=lItemText
							lIsFound=true
						}
					}
					if(lElementExpectedAccountNameItemSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementExpectedAccountNameItemSelected)
					}

				}
			}
			if(!lIsFound){
				lExpectedAccountName='No Multiple Account'
			}
			if(lIsFound){
				String lTagContinueButton='submit-btn'
				String lLocatorContinueButton=IGNUemaHelper.getTagDataSeleniumKey(lTagContinueButton)
				WebElement lElementContinueButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContinueButton)
				if(!lElementContinueButton){
					return lreturn
				}
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementContinueButton)
				String lLocatorProcessingForm='#app #processing'
				String lLocatorErrorModalForm='#app #errmsgModal'
				String lLocatorErrorModalFormCloseButton='#app #errmsgModal button'
				lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,30)
				Boolean lIsError=false
				WebElement lElementErrorModalFormCloseButton=null
				if(!lIsReady){
					lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
					if(lIsError){
						lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
						if(lElementErrorModalFormCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							lElementContinueButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContinueButton)
							if(lElementContinueButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementContinueButton)
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
					lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,30)
				}
				if(!lIsReady){
					lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
					if(lIsError){
						lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
						if(lElementErrorModalFormCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							lElementContinueButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContinueButton)
							if(lElementContinueButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementContinueButton)
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
					lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,60)
				}
				if(!lIsReady){
					lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
					if(lIsError){
						lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
						if(lElementErrorModalFormCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							lElementContinueButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContinueButton)
							if(lElementContinueButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementContinueButton)
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
					lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,90)
				}
				if(!lIsReady){
					IGNUemaHelper.delayThreadSecond(3)
					lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
					if(lIsError){
						lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
						if(lElementErrorModalFormCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							lElementContinueButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContinueButton)
							if(lElementContinueButton){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementContinueButton)
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
					lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,90)
				}
			}
			lResult=lExpectedAccountName.length()>0
			if(lResult){
				lreturn.put('ExpectedAccountName',lExpectedAccountName)
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
			Boolean lIsReady=false
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lLocatorProcessingForm='#app #processing'
			lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,30)
			if(!lIsReady){
				lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,30)
			}
			if(!lIsReady){
				lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,60)
			}
			if(!lIsReady){
				lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,90)
			}
			if(lIsReady){
				IGNUemaHelper.delayThreadSecond(3)
				lIsReady=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProcessingForm,90)
			}
			if(!lIsReady){
				return lreturn
			}
			String lTagCustomerName='customer-name'
			String lLocatorCustomerName=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerName)
			lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorCustomerName,30)
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
}