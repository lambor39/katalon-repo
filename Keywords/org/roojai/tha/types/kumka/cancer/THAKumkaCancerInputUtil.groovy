package org.roojai.tha.types.kumka.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaCancerInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaCancerInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lLoginUser=caseInput.LoginUser.toString().trim()
		String lLoginPassword=caseInput.LoginPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lHolderGender=caseInput.HolderGender.toString().trim()
		String lHolderDobPositiveCase=caseInput.HolderDobPositiveCase.toString().trim()
		String lHolderDob=caseInput.HolderDob.toString().trim()
		String lHolderHeightPositiveCase=caseInput.HolderHeightPositiveCase.toString().trim()
		String lHolderHeight=caseInput.HolderHeight.toString().trim()
		String lHolderWeightPositiveCase=caseInput.HolderWeightPositiveCase.toString().trim()
		String lHolderWeight=caseInput.HolderWeight.toString().trim()
		String lHolderSmoking=caseInput.HolderSmoking.toString().trim()
		String lHolderDrinking=caseInput.HolderDrinking.toString().trim()
		String lHolderHaveCancer=caseInput.HolderHaveCancer.toString().trim()
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
			Map lMapLoginUserPassword=this.inputLoginUserPassword(lLoginUser,lLoginPassword)
			if(!lMapLoginUserPassword.Result){
				lLoginUser=''
				lLoginPassword=''
			}else{
				lLoginUser=lMapLoginUserPassword.LoginUser
				lLoginPassword=lMapLoginUserPassword.LoginPassword
			}
			caseOutput.LoginUser=lLoginUser
			caseOutput.LoginPassword=lLoginPassword
			if(!this.waitUntilLoaded()){
				return lreturn
			}
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
			if(!this.waitUntilLoaded()){
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
				lMapLoginUserPassword=this.inputLoginUserPassword(lLoginUser,lLoginPassword)
				this.waitUntilLoaded()
				lMapLanguage=this.inputLanguage(lLanguage)
			}
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			caseOutput.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapHolderGender=this.inputHolderGender(lHolderGender)
			if(!lMapHolderGender.Result){
				lHolderGender=''
			}else{
				lHolderGender=lMapHolderGender.HolderGender
			}
			caseOutput.HolderGender=lHolderGender
			if(lHolderGender.length()<=0){
				return lreturn
			}
			Map lMapHolderDobPositiveCase=this.inputHolderDobPositiveCase(lHolderDobPositiveCase)
			if(!lMapHolderDobPositiveCase.Result){
				lHolderDobPositiveCase=''
			}else{
				lHolderDobPositiveCase=lMapHolderDobPositiveCase.HolderDobPositiveCase
			}
			caseOutput.HolderDobPositiveCase=lHolderDobPositiveCase
			if(lHolderDobPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderDobPositiveCase)
			Map lMapHolderDob=this.inputHolderDob(lHolderDob,lIsHolderDobPositiveCase)
			if(!lMapHolderDob.Result){
				lHolderDob=''
			}else{
				lHolderDob=lMapHolderDob.HolderDob
			}
			caseOutput.HolderDob=lHolderDob
			if(lHolderDob.length()<=0){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapHolderHeightPositiveCase=this.inputHolderHeightPositiveCase(lHolderHeightPositiveCase)
			if(!lMapHolderHeightPositiveCase.Result){
				lHolderHeightPositiveCase=''
			}else{
				lHolderHeightPositiveCase=lMapHolderHeightPositiveCase.HolderHeightPositiveCase
			}
			caseOutput.HolderHeightPositiveCase=lHolderHeightPositiveCase
			if(lHolderHeightPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderHeightPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderHeightPositiveCase)
			Map lMapHolderHeight=this.inputHolderHeight(lHolderHeight,lIsHolderHeightPositiveCase)
			if(!lMapHolderHeight.Result){
				lHolderHeight=''
			}else{
				lHolderHeight=lMapHolderHeight.HolderHeight
			}
			caseOutput.HolderHeight=lHolderHeight
			if(lHolderHeight.length()<=0){
				return lreturn
			}
			Map lMapHolderWeightPositiveCase=this.inputHolderWeightPositiveCase(lHolderWeightPositiveCase)
			if(!lMapHolderWeightPositiveCase.Result){
				lHolderWeightPositiveCase=''
			}else{
				lHolderWeightPositiveCase=lMapHolderWeightPositiveCase.HolderWeightPositiveCase
			}
			caseOutput.HolderWeightPositiveCase=lHolderWeightPositiveCase
			if(lHolderWeightPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderWeightPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderWeightPositiveCase)
			Map lMapHolderWeight=this.inputHolderWeight(lHolderWeight,lIsHolderWeightPositiveCase)
			if(!lMapHolderWeight.Result){
				lHolderWeight=''
			}else{
				lHolderWeight=lMapHolderWeight.HolderWeight
			}
			caseOutput.HolderWeight=lHolderWeight
			if(lHolderWeight.length()<=0){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapHolderSmoking=this.inputHolderSmoking(lHolderSmoking)
			if(!lMapHolderSmoking.Result){
				lHolderSmoking=''
			}else{
				lHolderSmoking=lMapHolderSmoking.HolderSmoking
			}
			caseOutput.HolderSmoking=lHolderSmoking
			if(lHolderSmoking.length()<=0){
				return lreturn
			}
			Map lMapHolderDrinking=this.inputHolderDrinking(lHolderDrinking)
			if(!lMapHolderDrinking.Result){
				lHolderDrinking=''
			}else{
				lHolderDrinking=lMapHolderDrinking.HolderDrinking
			}
			caseOutput.HolderDrinking=lHolderDrinking
			if(lHolderDrinking.length()<=0){
				return lreturn
			}
			Map lMapHolderHaveCancer=this.inputHolderHaveCancer(lHolderHaveCancer)
			if(!lMapHolderHaveCancer.Result){
				lHolderHaveCancer=''
			}else{
				lHolderHaveCancer=lMapHolderHaveCancer.HolderHaveCancer
			}
			caseOutput.HolderHaveCancer=lHolderHaveCancer
			if(lHolderHaveCancer.length()<=0){
				return lreturn
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			caseOutput.ActualResult=lActualResult
			if(lActualResult.length()<=0){
				return lreturn
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
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lTagFormLoading='waiting'
			String lLocatorFormLoading=IGNUemaHelper.getTagDataSeleniumKey(lTagFormLoading)
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
				IGNUemaHelper.delayThreadSecond(1)
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			}
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
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
			lPositiveCase=THAKumkaCancerInputType.DEFAULT_POSITIVE_CASE
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
	public Map inputLoginUserPassword(String strLoginUser,String strLoginPassword){
		Map lreturn=[:]
		String lLoginUser=strLoginUser.trim()
		if(lLoginUser.length()<=0){
			lLoginUser=THAKumkaCancerInputType.DEFAULT_LOGIN_USER
		}
		String lLoginPassword=strLoginPassword.trim()
		if(lLoginPassword.length()<=0){
			lLoginPassword=THAKumkaCancerInputType.DEFAULT_LOGIN_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginUser','')
			lreturn.put('LoginPassword','')
			lreturn.put('Result',lResult)
			WebElement lElementLogin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'username')
			if(lElementLogin){
				lLoginUser=IGNUemaHelper.typeTextByWebElement(this.driver,lElementLogin,lLoginUser)
			}
			WebElement lElementPassword=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'password')
			if(lElementPassword){
				lLoginPassword=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPassword,lLoginPassword)
			}
			WebElement lElementSignIn=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'sign-in')
			if(lElementSignIn){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSignIn)
			}
			if(lResult){
				lreturn.put('LoginUser',lLoginUser)
				lreturn.put('LoginPassword',lLoginPassword)
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
			lBaseUrl=THAKumkaCancerInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAKumkaCancerInputType.DEFAULT_VERSION
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
			this.driver.get(lBaseUrl+'/#/about')
			IGNUemaHelper.delayThreadSecond(3)
			String lBuildVersion=IGNUemaHelper.getTextByLocator(this.driver,'#app')
			lBuildVersion=lBuildVersion.trim()
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
				lLanguageItem=lLanguageList.get(THAKumkaCancerInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lLanguageItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lLanguageItem)
			if(!lElementButton){
				lLanguage='No Option'
			}else{
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)
				String lTagButtonSelected='language-selected'
				String lLocatorButtonSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonSelected)
				if(!lElementButtonSelected){
					lLanguage=lLanguageItem
				}else{
					lLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THAKumkaCancerInputType.DEFAULT_LANGUAGE
			}
			lResult=lLanguage.length()>0
			String lTagPDPAForm=''
			String lLocatorPDPAForm='#pdpa_cookie'
			WebElement lElementPDPAForm=null
			Boolean lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			String lTagPDPAButton=''
			String lLocatorPDPAButton='#pdpa_accept_all'
			WebElement lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			lTagPDPAForm='pdpa_cookie'
			lLocatorPDPAForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAForm)
			lElementPDPAForm=null
			lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			lTagPDPAButton='pdpa_accept_all'
			lLocatorPDPAButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAButton)
			lElementPDPAButton=null
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
	public static final String CONST_TAG_PAGE_GROUP_LIST='#kumkastep-el'
	public static final String CONST_TAG_PAGE_GROUP_CLASS_ACTIVE='.kumkastep-container'
	public static final String CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB='#card-gender-birthdate'
	public static final String CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT='#card-height-weight'
	public static final String CONST_TAG_PAGE_ITEM_LIST_HEALTH='#card-health'
	public static final String CONST_TAG_PAGE_ITEM_LIST_CARD_COMPLETE='#card-complete'
	public static final String CONST_TAG_PAGE_ITEM_CLASS_ACTIVE='.active'
	public static final String CONST_TAG_BUTTON_PAGE_NEXT='#nav-next'
	public String getLocatorPageGroupActiveByCurrent(){
		String lreturn=''
		try{
			String lTagPageGroup=this.CONST_TAG_PAGE_GROUP_LIST
			String lLocatorPageGroupActiveByCurrent=lTagPageGroup+this.CONST_TAG_PAGE_GROUP_CLASS_ACTIVE
			lreturn=lLocatorPageGroupActiveByCurrent
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
	}
	public WebElement getWebElementPageGroupActiveByCurrent(){
		String lreturn=''
		try{
			lreturn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,this.getLocatorPageGroupActiveByCurrent())
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public Boolean checkPageGroupIsActiveByCurrent(){
		Boolean lreturn=false
		try{
			WebElement lElementPageGroupActiveByName=this.getWebElementPageGroupActiveByCurrent()
			if(lElementPageGroupActiveByName){
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getLocatorPageItemActiveByName(String tagPageItemName){
		String lreturn=''
		try{
			String lTagPageItem=''
			String lLocatorPageItemActiveByName=IGNUemaHelper.concatCssLocatorParentChild(this.getLocatorPageGroupActiveByCurrent(),tagPageItemName+this.CONST_TAG_PAGE_ITEM_CLASS_ACTIVE)
			lreturn=lLocatorPageItemActiveByName
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public WebElement getWebElementPageItemActiveByName(String tagPageItemName){
		WebElement lreturn=null
		try{
			lreturn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,this.getLocatorPageItemActiveByName(tagPageItemName))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean checkPageItemIsActiveByName(String tagPageItemName){
		Boolean lreturn=false
		try{
			WebElement lElementPageItemActiveByName=this.getWebElementPageItemActiveByName(tagPageItemName)
			if(lElementPageItemActiveByName){
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderGender(String strHolderGender){
		Map lreturn=[:]
		String lHolderGender=strHolderGender.trim()
		Map lGenderList=['1':'0','2':'1']
		Integer lGenderDefault=0
		try{
			Boolean lResult=false
			lreturn.put('HolderGender','')
			lreturn.put('Result',lResult)
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lHolderGenderItem=lGenderList.get(lHolderGender)
			if(!lHolderGenderItem){
				lHolderGenderItem=lGenderList.get(THAKumkaCancerInputType.DEFAULT_HOLDER_GENDER)
			}
			lHolderGender=''
			Integer lGenderNum=IGNUemaHelper.convertStringToInteger(lHolderGenderItem,lGenderDefault)
			String lTagGenderButton=''
			String lLocatorGenderButton=IGNUemaHelper.concatCssLocatorParentChild(this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB),'label')
			List<WebElement> lElementGenderButtonList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorGenderButton)
			if(!lElementGenderButtonList){
				lResult='No Option'
			}
			if(lElementGenderButtonList.size()<lGenderList.size()){
				return lreturn
			}else{
				String lTagGenderButtonSelected=''
				String lLocatorGenderButtonSelected=lLocatorGenderButton+this.CONST_TAG_PAGE_ITEM_CLASS_ACTIVE
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementGenderButtonList[lGenderNum])
				lHolderGender=IGNUemaHelper.getTextByLocator(this.driver,lLocatorGenderButtonSelected)
				lResult=lHolderGender.length()>0
			}
			if(lResult){
				lreturn.put('HolderGender',lHolderGender)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderDobPositiveCase(String strHolderDobPositiveCase){
		Map lreturn=[:]
		String lHolderDobPositiveCase=strHolderDobPositiveCase.trim()
		if(lHolderDobPositiveCase.length()<=0){
			lHolderDobPositiveCase=THAKumkaCancerInputType.DEFAULT_HOLDER_DOB_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderDobPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderDobPositiveCase)
			lHolderDobPositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderDobPositiveCase)
			lResult=lHolderDobPositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderDobPositiveCase',lHolderDobPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderDob(String strHolderDob,Boolean isHolderDobPositiveCase){
		Map lreturn=[:]
		String lHolderDob=strHolderDob.trim()
		if(lHolderDob.length()<=0){
			lHolderDob=THAKumkaCancerInputType.DEFAULT_HOLDER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderDob','')
			lreturn.put('Result',lResult)
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_GENDER_DOB)
			if(!lElementPageCurrent){
				return lreturn
			}
			String[] lStrDateSplit=IGNUemaHelper.extractStringArrayFromDateStringSlashDDMMYYYY(lHolderDob)
			lHolderDob=''
			if(lStrDateSplit.length>0&&lStrDateSplit[0].length()>0){
				String lTagInputText=''
				String lLocatorInputTextDate='#input-date'
				WebElement lElementInputTextDate=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputTextDate)
				lHolderDob=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDate,lStrDateSplit[0])
			}
			if(lStrDateSplit.length>1&&lStrDateSplit[1].length()>0){
				String lLocatorInputTextMonth='#input-month'
				WebElement lElementInputTextMonth=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputTextMonth)
				lHolderDob=lHolderDob.concat('/'+IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMonth,lStrDateSplit[1]))
			}
			if(lStrDateSplit.length>2&&lStrDateSplit[2].length()>0){
				String lLocatorInputTextYear='#input-year'
				WebElement lElementInputTextYear=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputTextYear)
				lHolderDob=lHolderDob.concat('/'+IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYear,lStrDateSplit[2]))
			}
			String lTagNextButton=''
			String lLocatorNextButton=this.CONST_TAG_BUTTON_PAGE_NEXT
			WebElement lElementNextButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorNextButton)
			if(lElementNextButton){
				Boolean lIsNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNextButton)
				if(isHolderDobPositiveCase){
					lResult=lIsNextClicked
				}else{
					lResult=!lIsNextClicked
				}
			}
			if(lResult){
				lreturn.put('HolderDob',lHolderDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderHeightPositiveCase(String strHolderHeightPositiveCase){
		Map lreturn=[:]
		String lHolderHeightPositiveCase=strHolderHeightPositiveCase.trim()
		if(lHolderHeightPositiveCase.length()<=0){
			lHolderHeightPositiveCase=THAKumkaCancerInputType.DEFAULT_HOLDER_HEIGHT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderHeightPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderHeightPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderHeightPositiveCase)
			lHolderHeightPositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderHeightPositiveCase)
			lResult=lHolderHeightPositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderHeightPositiveCase',lHolderHeightPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderHeight(String strHolderHeight,Boolean isHolderHeightPositiveCase){
		Map lreturn=[:]
		String lHolderHeight=strHolderHeight.trim()
		if(lHolderHeight.length()<=0){
			lHolderHeight=THAKumkaCancerInputType.DEFAULT_HOLDER_HEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderHeight','')
			lreturn.put('Result',lResult)
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagInputText=''
			String lLocatorInputText='#input-height'
			WebElement lElementInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputText)
			lHolderHeight=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputText,lHolderHeight)
			if(isHolderHeightPositiveCase){
				lResult=lHolderHeight.length()>0
			}else{
				lResult=!lHolderHeight.length()>0
			}
			if(lResult){
				lreturn.put('HolderHeight',lHolderHeight)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderWeightPositiveCase(String strHolderWeightPositiveCase){
		Map lreturn=[:]
		String lHolderWeightPositiveCase=strHolderWeightPositiveCase.trim()
		if(lHolderWeightPositiveCase.length()<=0){
			lHolderWeightPositiveCase=THAKumkaCancerInputType.DEFAULT_HOLDER_WEIGHT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderWeightPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderWeightPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderWeightPositiveCase)
			lHolderWeightPositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderWeightPositiveCase)
			lResult=lHolderWeightPositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderWeightPositiveCase',lHolderWeightPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderWeight(String strHolderWeight,Boolean isHolderWeightPositiveCase){
		Map lreturn=[:]
		String lHolderWeight=strHolderWeight.trim()
		if(lHolderWeight.length()<=0){
			lHolderWeight=THAKumkaCancerInputType.DEFAULT_HOLDER_WEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderWeight','')
			lreturn.put('Result',lResult)
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEIGHT_WEIGHT)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagInputText=''
			String lLocatorInputText='#input-weight'
			WebElement lElementInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputText)
			lHolderWeight=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputText,lHolderWeight)
			String lTagNextButton=''
			String lLocatorNextButton=this.CONST_TAG_BUTTON_PAGE_NEXT
			WebElement lElementNextButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorNextButton)
			if(lElementNextButton){
				Boolean lIsNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNextButton)
				if(isHolderWeightPositiveCase){
					lResult=lIsNextClicked
				}else{
					lResult=!lIsNextClicked
				}
			}
			if(lResult){
				lreturn.put('HolderWeight',lHolderWeight)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderSmoking(String strHolderSmoking){
		Map lreturn=[:]
		String lHolderSmoking=strHolderSmoking.trim()
		if(lHolderSmoking.length()<=0){
			lHolderSmoking=THAKumkaCancerInputType.DEFAULT_HOLDER_SMOKING
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderSmoking','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderSmoking=IGNUemaHelper.convertStringToBoolean(lHolderSmoking)
			lHolderSmoking=''
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagHolderSmoking=''
			String lLocatorHolderSmokingButton=''
			WebElement lElementHolderSmokingButton=null
			if(lIsHolderSmoking){
				lLocatorHolderSmokingButton='#smoking-1'
				lElementHolderSmokingButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderSmokingButton)
			}else{
				lLocatorHolderSmokingButton='#smoking-2'
				lElementHolderSmokingButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderSmokingButton)
			}
			if(!lElementHolderSmokingButton){
				lHolderSmoking='No Option'
			}else{
				Boolean lIsHolderSmokingButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderSmokingButton)
				if(lIsHolderSmokingButtonClicked){
					String lTagHolderSmokingButtonSelected=''
					String lLocatorHolderSmokingButtonSelected=IGNUemaHelper.concatCssLocatorParentChild('.btn-kumka-primary.active',lLocatorHolderSmokingButton)
					WebElement lElementSmokingButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderSmokingButtonSelected)
					if(lElementSmokingButtonSelected){
						lHolderSmoking=IGNUemaHelper.convertBooleanToString(lIsHolderSmoking)
					}
				}
			}
			lResult=lHolderSmoking.length()>0
			if(lResult){
				lreturn.put('HolderSmoking',lHolderSmoking)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderDrinking(String strHolderDrinking){
		Map lreturn=[:]
		String lHolderDrinking=strHolderDrinking.trim()
		if(lHolderDrinking.length()<=0){
			lHolderDrinking=THAKumkaCancerInputType.DEFAULT_HOLDER_DRINKING
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderDrinking','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderDrinking=IGNUemaHelper.convertStringToBoolean(lHolderDrinking)
			lHolderDrinking=''
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagHolderDrinkingButton=''
			String lLocatorHolderDrinkingButton=''
			WebElement lElementHolderDrinkingButton=null
			if(lIsHolderDrinking){
				lLocatorHolderDrinkingButton='#drinking-1'
				lElementHolderDrinkingButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderDrinkingButton)
			}else{
				lLocatorHolderDrinkingButton='#drinking-2'
				lElementHolderDrinkingButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderDrinkingButton)
			}
			if(!lElementHolderDrinkingButton){
				lHolderDrinking='No Option'
			}else{
				Boolean lIsHolderDrinkButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderDrinkingButton)
				if(lIsHolderDrinkButtonClicked){
					String lTagHolderDrinkingSelected=''
					String lLocatorHolderDrinkingButtonSelected=IGNUemaHelper.concatCssLocatorParentChild('.btn-kumka-primary.active',lLocatorHolderDrinkingButton)
					WebElement lElementHolderDrinkingButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderDrinkingButtonSelected)
					if(lElementHolderDrinkingButtonSelected){
						lHolderDrinking=IGNUemaHelper.convertBooleanToString(lIsHolderDrinking)
					}
				}
			}
			lResult=lHolderDrinking.length()>0
			if(lResult){
				lreturn.put('HolderDrinking',lHolderDrinking)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderHaveCancer(String strHolderHaveCancer){
		Map lreturn=[:]
		String lHolderHaveCancer=strHolderHaveCancer.trim()
		if(lHolderHaveCancer.length()<=0){
			lHolderHaveCancer=THAKumkaCancerInputType.DEFAULT_HOLDER_HAVE_CANCER
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderHaveCancer','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderHaveCancer=IGNUemaHelper.convertStringToBoolean(lHolderHaveCancer)
			lHolderHaveCancer=''
			String lTagPageGroup=''
			String lTagPageItem=''
			String lLocatorPageCurrent=this.getLocatorPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)
			if(!this.checkPageItemIsActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)){
				return lreturn
			}
			WebElement lElementPageCurrent=this.getWebElementPageItemActiveByName(this.CONST_TAG_PAGE_ITEM_LIST_HEALTH)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagHolderHaveCancer=''
			String lLocatorHolderHaveCancerButton=''
			WebElement lElementHolderHaveCancerButton=null
			if(lIsHolderHaveCancer){
				lLocatorHolderHaveCancerButton='#cancer-causing-1'
				lElementHolderHaveCancerButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderHaveCancerButton)
			}else{
				lLocatorHolderHaveCancerButton='#cancer-causing-2'
				lElementHolderHaveCancerButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderHaveCancerButton)
			}
			if(!lElementHolderHaveCancerButton){
				lHolderHaveCancer='No Option'
			}else{
				Boolean lIsHolderHaveCancerButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderHaveCancerButton)
				if(lIsHolderHaveCancerButtonClicked){
					String lTagHolderHaveCancerButtonSelected=''
					String lLocatorHolderHaveCancerButtonSelected=IGNUemaHelper.concatCssLocatorParentChild('.btn-kumka-primary.active',lLocatorHolderHaveCancerButton)
					WebElement lElementHolderHaveCancerButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderHaveCancerButtonSelected)
					if(lElementHolderHaveCancerButtonSelected){
						lHolderHaveCancer=IGNUemaHelper.convertBooleanToString(lIsHolderHaveCancer)
					}
				}
			}
			lResult=lHolderHaveCancer.length()>0
			if(lResult){
				lreturn.put('HolderHaveCancer',lHolderHaveCancer)
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
			String lTagNextButton=''
			String lLocatorNextButton=this.CONST_TAG_BUTTON_PAGE_NEXT
			WebElement lElementNextButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorNextButton)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorNextButton)
			if(lValid){
				Boolean lRedirected=false
				Boolean lIsDone=false
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNextButton)
				String lTagResultPage=''
				String lLocatorResultPage='#app #main'
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,20)
				if(isPositiveCase){
					lIsDone=lRedirected
				}else{
					lIsDone=!lRedirected
				}
				lActualResult=IGNUemaHelper.convertBooleanToString(true)
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