package org.roojai.tha.types.myaccount.renewal
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.tha.core.THARoojaiWebsite
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.myaccount.newbiz.THAMyAccountNewbizInputUtil
public class THAMyAccountRenewalInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAMyAccountNewbizInputUtil lMyAccountNewbizInputUtil=null
	public THAMyAccountRenewalInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAMyAccountNewbizInputUtil getlMyAccountNewbizInputUtil(){
		return this.lMyAccountNewbizInputUtil
	}
	private void setlMyAccountNewbizInputUtil(THAMyAccountNewbizInputUtil newlMyAccountNewbizInputUtil){
		//Do Nothing
		//this.lMyAccountNewbizInputUtil=newlMyAccountNewbizInputUtil
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
			this.lMyAccountNewbizInputUtil=new THAMyAccountNewbizInputUtil(this.driver,this.selenium)
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
			Integer lLoginMethodNum=IGNUemaHelper.convertStringToInteger(lLoginMethod,this.lTHAMyAccountNewbizInputUtil.DEFAULT_NUM_LOGIN_METHOD)
			if(lLoginMethodNum==this.lTHAMyAccountNewbizInputUtil.DEFAULT_NUM_LOGIN_METHOD){
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
			if(lLoginMethodNum==this.lTHAMyAccountNewbizInputUtil.DEFAULT_NUM_LOGIN_METHOD){
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
				Integer lOtpMethodNum=IGNUemaHelper.convertStringToInteger(lOtpMethod,this.lTHAMyAccountNewbizInputUtil.DEFAULT_NUM_OTP_METHOD)
				if(lOtpMethodNum==this.lTHAMyAccountNewbizInputUtil.DEFAULT_NUM_OTP_METHOD){
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
			lPositiveCase=THAMyAccountRenewalInputType.DEFAULT_POSITIVE_CASE
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
			lBaseUrl=THAMyAccountRenewalInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAMyAccountRenewalInputType.DEFAULT_VERSION
		lDefaultVersion=lDefaultVersion.toLowerCase()
		String lVersion=strVersion.trim()
		if(lVersion.length()<=0){
			lVersion=lDefaultVersion
		}
		try{
			Boolean lResult=false
			lreturn.put('Version','')
			lreturn.put('Result',lResult)
			Map lMapVersion=this.lTHAMyAccountNewbizInputUtil.inputVersion(lBaseUrl,lVersion)
			if(!lMapVersion.Result){
				lVersion=''
			}else{
				lVersion=lMapVersion.Version
			}
			lResult=lVersion.length()>0
			lreturn.put('Version',lVersion)
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
		if(lLanguage.length()<=0){
			lLanguage=THAMyAccountRenewalInputType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAMyAccountNewbizInputUtil.inputLanguage(lLanguage)
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
	public Map inputLoginMethod(String strLoginMethod){
		Map lreturn=[:]
		String lLoginMethod=strLoginMethod.trim()
		if(lLoginMethod.length()<=0){
			lLoginMethod=THAMyAccountRenewalInputType.DEFAULT_LOGIN_METHOD
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginMethod','')
			lreturn.put('Result',lResult)
			Map lMapLoginMethod=this.lTHAMyAccountNewbizInputUtil.inputLoginMethod(lLoginMethod)
			if(!lMapLoginMethod.Result){
				lLoginMethod=''
			}else{
				lLoginMethod=lMapLoginMethod.LoginMethod
			}
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
			lLoginEmailThaiIdPassportNo=THAMyAccountRenewalInputType.DEFAULT_LOGIN_EMAIL_THAI_ID_PASSPORT_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginEmailThaiIdPassportNo','')
			lreturn.put('Result',lResult)
			Map lMapLoginEmailThaiIdPassportNo=this.lTHAMyAccountNewbizInputUtil.inputLoginEmailThaiIdPassportNo(lLoginEmailThaiIdPassportNo)
			if(!lMapLoginEmailThaiIdPassportNo.Result){
				lLoginEmailThaiIdPassportNo=''
			}else{
				lLoginEmailThaiIdPassportNo=lMapLoginEmailThaiIdPassportNo.LoginEmailThaiIdPassportNo
			}
			lResult=lLoginEmailThaiIdPassportNo.length()>0
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
			lLoginFacebookUser=THAMyAccountRenewalInputType.DEFAULT_LOGIN_FACEBOOK_USER
		}
		String lLoginFacebookPassword=strLoginFacebookPassword.trim()
		if(lLoginFacebookPassword.length()<=0){
			lLoginFacebookPassword=THAMyAccountRenewalInputType.DEFAULT_LOGIN_FACEBOOK_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginFacebookUser','')
			lreturn.put('LoginFacebookPassword','')
			lreturn.put('Result',lResult)
			Map lMapLoginFacebook=this.lTHAMyAccountNewbizInputUtil.inputLoginFacebook(lLoginFacebookUser,lLoginFacebookPassword)
			if(!lMapLoginFacebook.Result){
				lLoginFacebookUser=''
				lLoginFacebookPassword=''
			}else{
				lLoginFacebookUser=lMapLoginFacebook.LoginFacebookUser
				lLoginFacebookPassword=lMapLoginFacebook.LoginFacebookPassword
			}
			lResult=lMapLoginFacebook.Result
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
	public Map inputOtpMethod(String strOtpMethod){
		Map lreturn=[:]
		String lOtpMethod=strOtpMethod.trim()
		if(lOtpMethod.length()<=0){
			lOtpMethod=THAMyAccountRenewalInputType.DEFAULT_OTP_METHOD
		}
		try{
			Boolean lResult=false
			lreturn.put('OtpMethod','')
			lreturn.put('Result',lResult)
			Map lMapOtpMethod=this.lTHAMyAccountNewbizInputUtil.inputOtpMethod(lOtpMethod)
			if(!lMapOtpMethod.Result){
				lOtpMethod=''
			}else{
				lOtpMethod=lMapOtpMethod.OtpMethod
			}
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
			lOtpEmail=THAMyAccountRenewalInputType.DEFAULT_OTP_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('OtpEmail','')
			lreturn.put('Result',lResult)
			Map lMapOtpEmail=this.lTHAMyAccountNewbizInputUtil.inputOtpEmail(lOtpEmail)
			if(!lMapOtpEmail.Result){
				lOtpEmail=''
			}else{
				lOtpEmail=lMapOtpEmail.OtpEmail
			}
			lResult=lOtpEmail.length()>0
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
			lOtpPhoneNo=THAMyAccountRenewalInputType.DEFAULT_OTP_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('OtpPhoneNo','')
			lreturn.put('Result',lResult)
			Map lMapOtpPhoneNo=this.lTHAMyAccountNewbizInputUtil.inputOtpPhoneNo(lOtpPhoneNo)
			if(!lMapOtpPhoneNo.Result){
				lOtpPhoneNo=''
			}else{
				lOtpPhoneNo=lMapOtpPhoneNo.OtpPhoneNo
			}
			lResult=lOtpPhoneNo.length()>0
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
	public Map inputExpectedAccountName(String strExpectedAccountName){
		Map lreturn=[:]
		String lExpectedAccountName=strExpectedAccountName.trim()
		if(lExpectedAccountName.length()<=0){
			lExpectedAccountName=THAMyAccountRenewalInputType.DEFAULT_EXPECTED_ACCOUNT_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('ExpectedAccountName','')
			lreturn.put('Result',lResult)
			Map lMapExpectedAccountName=this.lTHAMyAccountNewbizInputUtil.inputExpectedAccountName(lExpectedAccountName)
			if(!lMapExpectedAccountName.Result){
				lExpectedAccountName=''
			}else{
				lExpectedAccountName=lMapExpectedAccountName.ExpectedAccountName
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
			Map lMapActualResult=this.lTHAMyAccountNewbizInputUtil.inputActualResult(isPositiveCase)
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
}