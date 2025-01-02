package org.roojai.tha.types.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAExtendedWarrantyQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAExtendedWarrantyQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lTagLoadingForm='loading'
			String lLocatorLoadingForm=IGNUemaHelper.getTagDataSeleniumKey(lTagLoadingForm)
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
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
	public Map inputVersionReferrer(String strBaseUrl,String strVersion,String strReferrer){
		Map lreturn=[:]
		String lBaseUrl=strBaseUrl.trim()
		if(lBaseUrl.length()<=0){
			lBaseUrl=THAExtendedWarrantyQuotationInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAExtendedWarrantyQuotationInputType.DEFAULT_VERSION
		String lVersion=strVersion.trim()
		if(lVersion.length()<=0){
			lVersion=lDefaultVersion
		}
		String lReferrer=strReferrer.trim()
		try{
			Boolean lResult=false
			lreturn.put('Version','')
			lreturn.put('Referrer',lReferrer)
			lreturn.put('Result',lResult)
			String lBrowserInfo=IGNUemaHelper.getBrowserInfo(this.driver)
			Boolean lIsUrlUAT=IGNUemaHelper.checkWebDriverURLTargerAsUAT(this.driver)
			String lAboutUrl=''
			if(lIsUrlUAT){
				lAboutUrl='https://insure.uat-roojai.com/quote/#/about'
			}else{
				lAboutUrl='https://insure.roojai.com/quote/#/about'
			}
			this.driver.get(lAboutUrl)
			IGNUemaHelper.delayThreadSecond(3)
			String lBuildVersion=IGNUemaHelper.getTextByLocator(this.driver,'#app')
			lBuildVersion=lBuildVersion.trim()
			String lVersionOutput=''
			lVersion=IGNUemaHelper.validateVersionString(lVersion,lDefaultVersion)
			lVersion=lVersion.toLowerCase()
			this.driver.get(lBaseUrl+'&abtesting='+lVersion)
			IGNUemaHelper.delayThreadSecond(3)
			this.driver.get(lBaseUrl+'&abtesting='+lVersion)
			IGNUemaHelper.delayThreadSecond(5)
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
	public Map inputCmsLanguage(String strCmsLanguage){
		Map lreturn=[:]
		String lCmsLanguage=strCmsLanguage.toUpperCase().trim()
		if(lCmsLanguage.length()<=0){
			lCmsLanguage=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_LANGUAGE.toUpperCase()
		}
		Map lCmsLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('CmsLanguage','')
			lreturn.put('Result',lResult)
			String lCmsLanguageItem=lCmsLanguageList.get(lCmsLanguage)
			if(!lCmsLanguageItem){
				lCmsLanguageItem=lCmsLanguageList.get(THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_LANGUAGE.toUpperCase())
			}
			lCmsLanguage=''
			Boolean lIsCmsLanguageTargetThai=lCmsLanguageItem.equalsIgnoreCase('TH')
			String lLocatorCMSLanguageSelectedImage='#navbar-action ul li a img'
			WebElement lElementCMSLanguageSelectedImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCMSLanguageSelectedImage)
			if(!lElementCMSLanguageSelectedImage){
				return lreturn
			}
			String lStrElementAttributeImageSource='src'
			String lCMSLanguageSelectedImageSource=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCMSLanguageSelectedImage,lStrElementAttributeImageSource)
			if(lCMSLanguageSelectedImageSource.length()<=0){
				return lreturn
			}
			String lStrCmsLanguageImageSourceThai='th.svg'
			Boolean lIsCmsLanguageCurrentThai=lCMSLanguageSelectedImageSource.toLowerCase().contains(lStrCmsLanguageImageSourceThai)
			Boolean lToChangeCmsLanguage=false
			if(lIsCmsLanguageTargetThai){
				if(!lIsCmsLanguageCurrentThai){
					lToChangeCmsLanguage=true
				}
			}else{
				if(lIsCmsLanguageCurrentThai){
					lToChangeCmsLanguage=true
				}
			}
			if(lToChangeCmsLanguage){
				String lLocatorCMSLanguageChangeButton='#navbar-action ul li ul li a'
				WebElement lElementCMSLanguageChangeButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCMSLanguageChangeButton)
				if(!lElementCMSLanguageChangeButton){
					return lreturn
				}
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCMSLanguageChangeButton)
				IGNUemaHelper.delayThreadSecond(3)
			}
			lElementCMSLanguageSelectedImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCMSLanguageSelectedImage)
			if(!lElementCMSLanguageSelectedImage){
				return lreturn
			}
			lCMSLanguageSelectedImageSource=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCMSLanguageSelectedImage,lStrElementAttributeImageSource)
			if(lCMSLanguageSelectedImageSource.length()<=0){
				return lreturn
			}
			lIsCmsLanguageCurrentThai=lCMSLanguageSelectedImageSource.toLowerCase().contains(lStrCmsLanguageImageSourceThai)
			if(lIsCmsLanguageCurrentThai){
				lCmsLanguage='TH'
			}else{
				lCmsLanguage='EN'
			}
			lResult=lCmsLanguage.length()>0
			String lTagPDPAForm=''
			String lLocatorPDPAForm='#pdpa_cookie'
			WebElement lElementPDPAForm=null
			Boolean lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,10)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,10)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,10)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,10)
			}

			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,10)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,10)
			}
			String lTagPDPAButton=''
			String lLocatorPDPAButton='#pdpa_accept_all'
			WebElement lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						IGNUemaHelper.delayThreadSecond(1)
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
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						IGNUemaHelper.delayThreadSecond(1)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			lElementPDPAButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAButton)
			if(lElementPDPAButton){
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
				IGNUemaHelper.delayThreadSecond(1)
			}
			if(lResult){
				lreturn.put('CmsLanguage',lCmsLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputLanguage(String strLanguage){
		String lreturn=''
		try{
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
	public String inputLanguageA(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAExtendedWarrantyQuotationInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			String lResultText=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lResultText='No Option'
			}else{
				lResultText=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
			}
			lreturn=lResultText
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
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputLanguageB(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAExtendedWarrantyQuotationInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			String lResultText=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lResultText='No Option'
			}else{
				lResultText=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
			}
			lreturn=lResultText
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
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInputFromCmsMain(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lCmsLanguage=caseInput.CmsLanguage.toString().trim()
		String lCmsCarMake=caseInput.CmsCarMake.toString().trim()
		String lCmsCarModel=caseInput.CmsCarModel.toString().trim()
		String lCmsCarYear=caseInput.CmsCarYear.toString().trim()
		String lCmsCarSubmodel=caseInput.CmsCarSubmodel.toString().trim()
		String lCmsKeepDetail=caseInput.CmsKeepDetail.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lCarMake=caseInput.CarMake.toString().trim()
		String lCarModel=caseInput.CarModel.toString().trim()
		String lCarYear=caseInput.CarYear.toString().trim()
		String lCarSubmodel=caseInput.CarSubmodel.toString().trim()
		String lCarOdometerReading=caseInput.CarOdometerReading.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredPostalCode=caseInput.InsuredPostalCode.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lCmsPostLanguage=''
		String lCmsPostCarMake=''
		String lCmsPostCarModel=''
		String lCmsPostCarYear=''
		String lCmsPostCarSubmodel=''
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
			Map lMapCmsLanguage=this.inputCmsLanguage(lCmsLanguage)
			if(!lMapCmsLanguage.Result){
				lCmsLanguage=''
			}else{
				lCmsLanguage=lMapCmsLanguage.CmsLanguage
			}
			caseOutput.CmsLanguage=lCmsLanguage
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			/*Map lMapCmsCarMake=this.inputCmsCarMake(lCmsCarMake)
			 if(!lMapCmsCarMake.Result){
			 lCmsCarMake=''
			}else{
			 lCmsCarMake=lMapCmsCarMake.CmsCarMake
			}
			 caseOutput.CmsCarMake=lCmsCarMake
			 if(lCmsCarMake.length()<=0){
			 return lreturn
			}
			 Map lMapCmsCarModel=this.inputCmsCarModel(lCmsCarModel)
			 if(!lMapCmsCarModel.Result){
			 lCmsCarModel=''
			}else{
			 lCmsCarModel=lMapCmsCarModel.CmsCarModel
			}
			 caseOutput.CmsCarModel=lCmsCarModel
			 if(lCmsCarModel.length()<=0){
			 return lreturn
			}
			 Map lMapCmsCarYear=this.inputCmsCarYear(lCmsCarYear)
			 if(!lMapCmsCarYear.Result){
			 lCmsCarYear=''
			}else{
			 lCmsCarYear=lMapCmsCarYear.CmsCarYear
			}
			 caseOutput.CmsCarYear=lCmsCarYear
			 if(lCmsCarYear.length()<=0){
			 return lreturn
			}
			 Map lMapCmsCarSubmodel=this.inputCmsCarSubmodel(lCmsCarSubmodel)
			 if(!lMapCmsCarSubmodel.Result){
			 lCmsCarSubmodel=''
			}else{
			 lCmsCarSubmodel=lMapCmsCarSubmodel.CmsCarSubmodel
			}
			 caseOutput.CmsCarSubmodel=lCmsCarSubmodel
			 if(lCmsCarSubmodel.length()<=0){
			 return lreturn
			}*/
			Boolean lIsCmsMainProductExtendedWarranty=false
			String lTagCmsMainProductButton=''
			String lLocatorCmsMainProductButton='#product-link a'
			List<WebElement> lElementCmsMainProductButtontList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCmsMainProductButton)
			if(!lElementCmsMainProductButtontList){
				return lreturn
			}
			if(lElementCmsMainProductButtontList){
				for(WebElement lElementCmsMainProductButtontItem in lElementCmsMainProductButtontList){
					String lCmsMainProductButtontHrefText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsMainProductButtontItem,'href')
					lIsCmsMainProductExtendedWarranty=IGNUemaHelper.checkStringContainString(lCmsMainProductButtontHrefText,'productType=ExtendedWarranty')
					if(lIsCmsMainProductExtendedWarranty){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsMainProductButtontItem)
						break
					}
				}
				if(!lIsCmsMainProductExtendedWarranty){
					return lreturn
				}
			}
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
			Map lMapCmsKeepDetail=this.inputCmsKeepDetail(lCmsKeepDetail,lCmsLanguage,lCmsCarMake,lCmsCarModel,lCmsCarYear,lCmsCarSubmodel)
			if(!lMapCmsKeepDetail.Result){
				lCmsKeepDetail=''
				lCmsPostLanguage=''
				lCmsPostCarMake=''
				lCmsPostCarModel=''
				lCmsPostCarYear=''
				lCmsPostCarSubmodel=''
			}else{
				lCmsKeepDetail=lMapCmsKeepDetail.CmsKeepDetail
				lCmsPostLanguage=lMapCmsKeepDetail.CmsPostLanguage
				/*lCmsPostCarMake=lMapCmsKeepDetail.CmsPostCarMake
				 lCmsPostCarModel=lMapCmsKeepDetail.CmsPostCarModel
				 lCmsPostCarYear=lMapCmsKeepDetail.CmsPostCarYear
				 lCmsPostCarSubmodel=lMapCmsKeepDetail.CmsPostCarSubmodel*/
			}
			caseOutput.CmsKeepDetail=lCmsKeepDetail
			caseOutput.CmsPostLanguage=lCmsPostLanguage
			caseOutput.CmsPostCarMake=lCmsPostCarMake
			caseOutput.CmsPostCarModel=lCmsPostCarModel
			caseOutput.CmsPostCarYear=lCmsPostCarYear
			caseOutput.CmsPostCarSubmodel=lCmsPostCarSubmodel
			if(!lMapCmsKeepDetail.Result){
				return lreturn
			}
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			if(lIsCmsKeepDetail){
				lLanguage=lCmsPostLanguage
				/*lCarMake=lCmsPostCarMake
				 lCarModel=lCmsPostCarModel
				 lCarYear=lCmsPostCarYear
				 lCarSubmodel=lCmsPostCarSubmodel*/
				caseOutput.Language=lLanguage
				/*caseOutput.CarMake=lCarMake
				 caseOutput.CarModel=lCarModel
				 caseOutput.CarYear=lCarYear
				 caseOutput.Submodel=lCarSubmodel*/
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						case 'B':
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						default:
							return lreturn
							break
					}
				}else{
					Map lMapCarMake=this.inputCarMake(lCarMake)
					if(!lMapCarMake.Result){
						lCarMake=''
					}else{
						lCarMake=lMapCarMake.CarMake
					}
					caseOutput.CarMake=lCarMake
					if(lCarMake.length()<=0){
						return lreturn
					}
					Map lMapCarModel=this.inputCarModel(lCarModel)
					if(!lMapCarModel.Result){
						lCarModel=''
					}else{
						lCarModel=lMapCarModel.CarModel
					}
					caseOutput.CarModel=lCarModel
					if(lCarModel.length()<=0){
						return lreturn
					}
					Map lMapCarYear=this.inputCarYear(lCarYear)
					if(!lMapCarYear.Result){
						lCarYear=''
					}else{
						lCarYear=lMapCarYear.CarYear
					}
					caseOutput.CarYear=lCarYear
					if(lCarYear.length()<=0){
						return lreturn
					}
					Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
					if(!lMapCarSubmodel.Result){
						lCarSubmodel=''
					}else{
						lCarSubmodel=lMapCarSubmodel.CarSubmodel
					}
					caseOutput.CarSubmodel=lCarSubmodel
					if(lCarSubmodel.length()<=0){
						return lreturn
					}
				}
			}else{
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
							lLanguage=this.inputLanguage(lLanguage)
							if(lLanguage.length()<=0){
								return lreturn
							}else{
								caseOutput.Language=lLanguage
							}
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						case 'B':
							lLanguage=this.inputLanguage(lLanguage)
							if(lLanguage.length()<=0){
								return lreturn
							}else{
								caseOutput.Language=lLanguage
							}
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						default:
							return lreturn
							break
					}
				}else{
					lLanguage=this.inputLanguage(lLanguage)
					if(lLanguage.length()<=0){
						return lreturn
					}else{
						caseOutput.Language=lLanguage
					}
					Map lMapCarMake=this.inputCarMake(lCarMake)
					if(!lMapCarMake.Result){
						lCarMake=''
					}else{
						lCarMake=lMapCarMake.CarMake
					}
					caseOutput.CarMake=lCarMake
					if(lCarMake.length()<=0){
						return lreturn
					}
					Map lMapCarModel=this.inputCarModel(lCarModel)
					if(!lMapCarModel.Result){
						lCarModel=''
					}else{
						lCarModel=lMapCarModel.CarModel
					}
					caseOutput.CarModel=lCarModel
					if(lCarModel.length()<=0){
						return lreturn
					}
					Map lMapCarYear=this.inputCarYear(lCarYear)
					if(!lMapCarYear.Result){
						lCarYear=''
					}else{
						lCarYear=lMapCarYear.CarYear
					}
					caseOutput.CarYear=lCarYear
					if(lCarYear.length()<=0){
						return lreturn
					}
					Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
					if(!lMapCarSubmodel.Result){
						lCarSubmodel=''
					}else{
						lCarSubmodel=lMapCarSubmodel.CarSubmodel
					}
					caseOutput.CarSubmodel=lCarSubmodel
					if(lCarSubmodel.length()<=0){
						return lreturn
					}
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
						if(!lMapCarOdometerReading.Result){
							lCarOdometerReading=''
						}else{
							lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
						}
						caseOutput.CarOdometerReading=lCarOdometerReading
						if(lCarOdometerReading.length()<=0){
							return lreturn
						}
						Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
						if(!lMapInsuredGenderAndMaritalStatus.Result){
							lInsuredGenderAndMaritalStatus=''
						}else{
							lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
						}
						caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
						if(lInsuredGenderAndMaritalStatus.length()<=0){
							return lreturn
						}
						Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
						if(!lMapInsuredPostalCode.Result){
							lInsuredPostalCode=''
						}else{
							lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
						}
						caseOutput.InsuredPostalCode=lInsuredPostalCode
						if(lInsuredPostalCode.length()<=0){
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
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
						if(!lMapActualResult.Result){
							lActualResult=''
						}else{
							lActualResult=lMapActualResult.ActualResult
						}
						caseOutput.ActualResult=lActualResult
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					case 'B':
						Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
						if(!lMapCarOdometerReading.Result){
							lCarOdometerReading=''
						}else{
							lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
						}
						caseOutput.CarOdometerReading=lCarOdometerReading
						if(lCarOdometerReading.length()<=0){
							return lreturn
						}
						Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
						if(!lMapInsuredGenderAndMaritalStatus.Result){
							lInsuredGenderAndMaritalStatus=''
						}else{
							lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
						}
						caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
						if(lInsuredGenderAndMaritalStatus.length()<=0){
							return lreturn
						}
						Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
						if(!lMapInsuredPostalCode.Result){
							lInsuredPostalCode=''
						}else{
							lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
						}
						caseOutput.InsuredPostalCode=lInsuredPostalCode
						if(lInsuredPostalCode.length()<=0){
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
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
						if(!lMapActualResult.Result){
							lActualResult=''
						}else{
							lActualResult=lMapActualResult.ActualResult
						}
						caseOutput.ActualResult=lActualResult
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					default:
						return lreturn
						break
				}
			}else{
				Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
				if(!lMapCarOdometerReading.Result){
					lCarOdometerReading=''
				}else{
					lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
				}
				caseOutput.CarOdometerReading=lCarOdometerReading
				if(lCarOdometerReading.length()<=0){
					return lreturn
				}
				Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
				if(!lMapInsuredGenderAndMaritalStatus.Result){
					lInsuredGenderAndMaritalStatus=''
				}else{
					lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
				}
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				if(lInsuredGenderAndMaritalStatus.length()<=0){
					return lreturn
				}
				Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
				if(!lMapInsuredPostalCode.Result){
					lInsuredPostalCode=''
				}else{
					lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
				}
				caseOutput.InsuredPostalCode=lInsuredPostalCode
				if(lInsuredPostalCode.length()<=0){
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				caseOutput.ActualResult=lActualResult
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInputFromCmsMini(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lCmsLanguage=caseInput.CmsLanguage.toString().trim()
		String lCmsCarMake=caseInput.CmsCarMake.toString().trim()
		String lCmsCarModel=caseInput.CmsCarModel.toString().trim()
		String lCmsCarYear=caseInput.CmsCarYear.toString().trim()
		String lCmsCarSubmodel=caseInput.CmsCarSubmodel.toString().trim()
		String lCmsKeepDetail=caseInput.CmsKeepDetail.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lCarMake=caseInput.CarMake.toString().trim()
		String lCarModel=caseInput.CarModel.toString().trim()
		String lCarYear=caseInput.CarYear.toString().trim()
		String lCarSubmodel=caseInput.CarSubmodel.toString().trim()
		String lCarOdometerReading=caseInput.CarOdometerReading.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredPostalCode=caseInput.InsuredPostalCode.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lCmsPostLanguage=''
		String lCmsPostCarMake=''
		String lCmsPostCarModel=''
		String lCmsPostCarYear=''
		String lCmsPostCarSubmodel=''
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
			Map lMapCmsLanguage=this.inputCmsLanguage(lCmsLanguage)
			if(!lMapCmsLanguage.Result){
				lCmsLanguage=''
			}else{
				lCmsLanguage=lMapCmsLanguage.CmsLanguage
			}
			caseOutput.CmsLanguage=lCmsLanguage
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			/*Map lMapCmsCarMake=this.inputCmsCarMake(lCmsCarMake)
			 if(!lMapCmsCarMake.Result){
			 lCmsCarMake=''
			}else{
			 lCmsCarMake=lMapCmsCarMake.CmsCarMake
			}
			 caseOutput.CmsCarMake=lCmsCarMake
			 if(lCmsCarMake.length()<=0){
			 return lreturn
			}
			 Map lMapCmsCarModel=this.inputCmsCarModel(lCmsCarModel)
			 if(!lMapCmsCarModel.Result){
			 lCmsCarModel=''
			}else{
			 lCmsCarModel=lMapCmsCarModel.CmsCarModel
			}
			 caseOutput.CmsCarModel=lCmsCarModel
			 if(lCmsCarModel.length()<=0){
			 return lreturn
			}
			 Map lMapCmsCarYear=this.inputCmsCarYear(lCmsCarYear)
			 if(!lMapCmsCarYear.Result){
			 lCmsCarYear=''
			}else{
			 lCmsCarYear=lMapCmsCarYear.CmsCarYear
			}
			 caseOutput.CmsCarYear=lCmsCarYear
			 if(lCmsCarYear.length()<=0){
			 return lreturn
			}
			 Map lMapCmsCarSubmodel=this.inputCmsCarSubmodel(lCmsCarSubmodel)
			 if(!lMapCmsCarSubmodel.Result){
			 lCmsCarSubmodel=''
			}else{
			 lCmsCarSubmodel=lMapCmsCarSubmodel.CmsCarSubmodel
			}
			 caseOutput.CmsCarSubmodel=lCmsCarSubmodel
			 if(lCmsCarSubmodel.length()<=0){
			 return lreturn
			}*/
			String lStartQuoteButton='#main .section-header a.btn'
			WebElement lElementStartQuoteButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lStartQuoteButton)
			if(lElementStartQuoteButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementStartQuoteButton)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementStartQuoteButton)
				IGNUemaHelper.delayThreadSecond(5)
			}
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
			Map lMapCmsKeepDetail=this.inputCmsKeepDetail(lCmsKeepDetail,lCmsLanguage,lCmsCarMake,lCmsCarModel,lCmsCarYear,lCmsCarSubmodel)
			if(!lMapCmsKeepDetail.Result){
				lCmsKeepDetail=''
				lCmsPostLanguage=''
				lCmsPostCarMake=''
				lCmsPostCarModel=''
				lCmsPostCarYear=''
				lCmsPostCarSubmodel=''
			}else{
				lCmsKeepDetail=lMapCmsKeepDetail.CmsKeepDetail
				lCmsPostLanguage=lMapCmsKeepDetail.CmsPostLanguage
				/*lCmsPostCarMake=lMapCmsKeepDetail.CmsPostCarMake
				 lCmsPostCarModel=lMapCmsKeepDetail.CmsPostCarModel
				 lCmsPostCarYear=lMapCmsKeepDetail.CmsPostCarYear
				 lCmsPostCarSubmodel=lMapCmsKeepDetail.CmsPostCarSubmodel*/
			}
			caseOutput.CmsKeepDetail=lCmsKeepDetail
			caseOutput.CmsPostLanguage=lCmsPostLanguage
			caseOutput.CmsPostCarMake=lCmsPostCarMake
			caseOutput.CmsPostCarModel=lCmsPostCarModel
			caseOutput.CmsPostCarYear=lCmsPostCarYear
			caseOutput.CmsPostCarSubmodel=lCmsPostCarSubmodel
			if(!lMapCmsKeepDetail.Result){
				return lreturn
			}
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			if(lIsCmsKeepDetail){
				lLanguage=lCmsPostLanguage
				/*lCarMake=lCmsPostCarMake
				 lCarModel=lCmsPostCarModel
				 lCarYear=lCmsPostCarYear
				 lCarSubmodel=lCmsPostCarSubmodel*/
				caseOutput.Language=lLanguage
				/*caseOutput.CarMake=lCarMake
				 caseOutput.CarModel=lCarModel
				 caseOutput.CarYear=lCarYear
				 caseOutput.Submodel=lCarSubmodel*/
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						case 'B':
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						default:
							return lreturn
							break
					}
				}else{
					Map lMapCarMake=this.inputCarMake(lCarMake)
					if(!lMapCarMake.Result){
						lCarMake=''
					}else{
						lCarMake=lMapCarMake.CarMake
					}
					caseOutput.CarMake=lCarMake
					if(lCarMake.length()<=0){
						return lreturn
					}
					Map lMapCarModel=this.inputCarModel(lCarModel)
					if(!lMapCarModel.Result){
						lCarModel=''
					}else{
						lCarModel=lMapCarModel.CarModel
					}
					caseOutput.CarModel=lCarModel
					if(lCarModel.length()<=0){
						return lreturn
					}
					Map lMapCarYear=this.inputCarYear(lCarYear)
					if(!lMapCarYear.Result){
						lCarYear=''
					}else{
						lCarYear=lMapCarYear.CarYear
					}
					caseOutput.CarYear=lCarYear
					if(lCarYear.length()<=0){
						return lreturn
					}
					Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
					if(!lMapCarSubmodel.Result){
						lCarSubmodel=''
					}else{
						lCarSubmodel=lMapCarSubmodel.CarSubmodel
					}
					caseOutput.CarSubmodel=lCarSubmodel
					if(lCarSubmodel.length()<=0){
						return lreturn
					}
				}
			}else{
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
							lLanguage=this.inputLanguage(lLanguage)
							if(lLanguage.length()<=0){
								return lreturn
							}else{
								caseOutput.Language=lLanguage
							}
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						case 'B':
							lLanguage=this.inputLanguage(lLanguage)
							if(lLanguage.length()<=0){
								return lreturn
							}else{
								caseOutput.Language=lLanguage
							}
							Map lMapCarMake=this.inputCarMake(lCarMake)
							if(!lMapCarMake.Result){
								lCarMake=''
							}else{
								lCarMake=lMapCarMake.CarMake
							}
							caseOutput.CarMake=lCarMake
							if(lCarMake.length()<=0){
								return lreturn
							}
							Map lMapCarModel=this.inputCarModel(lCarModel)
							if(!lMapCarModel.Result){
								lCarModel=''
							}else{
								lCarModel=lMapCarModel.CarModel
							}
							caseOutput.CarModel=lCarModel
							if(lCarModel.length()<=0){
								return lreturn
							}
							Map lMapCarYear=this.inputCarYear(lCarYear)
							if(!lMapCarYear.Result){
								lCarYear=''
							}else{
								lCarYear=lMapCarYear.CarYear
							}
							caseOutput.CarYear=lCarYear
							if(lCarYear.length()<=0){
								return lreturn
							}
							Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
							if(!lMapCarSubmodel.Result){
								lCarSubmodel=''
							}else{
								lCarSubmodel=lMapCarSubmodel.CarSubmodel
							}
							caseOutput.CarSubmodel=lCarSubmodel
							if(lCarSubmodel.length()<=0){
								return lreturn
							}
							break
						default:
							return lreturn
							break
					}
				}else{
					lLanguage=this.inputLanguage(lLanguage)
					if(lLanguage.length()<=0){
						return lreturn
					}else{
						caseOutput.Language=lLanguage
					}
					Map lMapCarMake=this.inputCarMake(lCarMake)
					if(!lMapCarMake.Result){
						lCarMake=''
					}else{
						lCarMake=lMapCarMake.CarMake
					}
					caseOutput.CarMake=lCarMake
					if(lCarMake.length()<=0){
						return lreturn
					}
					Map lMapCarModel=this.inputCarModel(lCarModel)
					if(!lMapCarModel.Result){
						lCarModel=''
					}else{
						lCarModel=lMapCarModel.CarModel
					}
					caseOutput.CarModel=lCarModel
					if(lCarModel.length()<=0){
						return lreturn
					}
					Map lMapCarYear=this.inputCarYear(lCarYear)
					if(!lMapCarYear.Result){
						lCarYear=''
					}else{
						lCarYear=lMapCarYear.CarYear
					}
					caseOutput.CarYear=lCarYear
					if(lCarYear.length()<=0){
						return lreturn
					}
					Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
					if(!lMapCarSubmodel.Result){
						lCarSubmodel=''
					}else{
						lCarSubmodel=lMapCarSubmodel.CarSubmodel
					}
					caseOutput.CarSubmodel=lCarSubmodel
					if(lCarSubmodel.length()<=0){
						return lreturn
					}
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
						if(!lMapCarOdometerReading.Result){
							lCarOdometerReading=''
						}else{
							lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
						}
						caseOutput.CarOdometerReading=lCarOdometerReading
						if(lCarOdometerReading.length()<=0){
							return lreturn
						}
						Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
						if(!lMapInsuredGenderAndMaritalStatus.Result){
							lInsuredGenderAndMaritalStatus=''
						}else{
							lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
						}
						caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
						if(lInsuredGenderAndMaritalStatus.length()<=0){
							return lreturn
						}
						Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
						if(!lMapInsuredPostalCode.Result){
							lInsuredPostalCode=''
						}else{
							lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
						}
						caseOutput.InsuredPostalCode=lInsuredPostalCode
						if(lInsuredPostalCode.length()<=0){
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
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
						if(!lMapActualResult.Result){
							lActualResult=''
						}else{
							lActualResult=lMapActualResult.ActualResult
						}
						caseOutput.ActualResult=lActualResult
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					case 'B':
						Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
						if(!lMapCarOdometerReading.Result){
							lCarOdometerReading=''
						}else{
							lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
						}
						caseOutput.CarOdometerReading=lCarOdometerReading
						if(lCarOdometerReading.length()<=0){
							return lreturn
						}
						Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
						if(!lMapInsuredGenderAndMaritalStatus.Result){
							lInsuredGenderAndMaritalStatus=''
						}else{
							lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
						}
						caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
						if(lInsuredGenderAndMaritalStatus.length()<=0){
							return lreturn
						}
						Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
						if(!lMapInsuredPostalCode.Result){
							lInsuredPostalCode=''
						}else{
							lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
						}
						caseOutput.InsuredPostalCode=lInsuredPostalCode
						if(lInsuredPostalCode.length()<=0){
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
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
						if(!lMapActualResult.Result){
							lActualResult=''
						}else{
							lActualResult=lMapActualResult.ActualResult
						}
						caseOutput.ActualResult=lActualResult
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					default:
						return lreturn
						break
				}
			}else{
				Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
				if(!lMapCarOdometerReading.Result){
					lCarOdometerReading=''
				}else{
					lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
				}
				caseOutput.CarOdometerReading=lCarOdometerReading
				if(lCarOdometerReading.length()<=0){
					return lreturn
				}
				Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
				if(!lMapInsuredGenderAndMaritalStatus.Result){
					lInsuredGenderAndMaritalStatus=''
				}else{
					lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
				}
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				if(lInsuredGenderAndMaritalStatus.length()<=0){
					return lreturn
				}
				Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
				if(!lMapInsuredPostalCode.Result){
					lInsuredPostalCode=''
				}else{
					lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
				}
				caseOutput.InsuredPostalCode=lInsuredPostalCode
				if(lInsuredPostalCode.length()<=0){
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				caseOutput.ActualResult=lActualResult
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInputFromProduct(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseOutput.BaseUrl.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lReferrer=caseInput.Referrer.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lCarMake=caseInput.CarMake.toString().trim()
		String lCarModel=caseInput.CarModel.toString().trim()
		String lCarYear=caseInput.CarYear.toString().trim()
		String lCarSubmodel=caseInput.CarSubmodel.toString().trim()
		String lCarOdometerReading=caseInput.CarOdometerReading.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredPostalCode=caseInput.InsuredPostalCode.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
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
			Map lMapVersionReferrer=this.inputVersionReferrer(lBaseUrl,lVersion,lReferrer)
			if(!lMapVersionReferrer.Result){
				lVersion=''
				lReferrer=''
			}else{
				lVersion=lMapVersionReferrer.Version
				lReferrer=lMapVersionReferrer.Referrer
			}
			caseOutput.Version=lVersion
			caseOutput.Referrer=lReferrer
			if(!lMapVersionReferrer.Result){
				return lreturn
			}
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
						lLanguage=this.inputLanguage(lLanguage)
						if(lLanguage.length()<=0){
							return lreturn
						}else{
							caseOutput.Language=lLanguage
						}
						Map lMapCarMake=this.inputCarMake(lCarMake)
						if(!lMapCarMake.Result){
							lCarMake=''
						}else{
							lCarMake=lMapCarMake.CarMake
						}
						caseOutput.CarMake=lCarMake
						if(lCarMake.length()<=0){
							return lreturn
						}
						Map lMapCarModel=this.inputCarModel(lCarModel)
						if(!lMapCarModel.Result){
							lCarModel=''
						}else{
							lCarModel=lMapCarModel.CarModel
						}
						caseOutput.CarModel=lCarModel
						if(lCarModel.length()<=0){
							return lreturn
						}
						Map lMapCarYear=this.inputCarYear(lCarYear)
						if(!lMapCarYear.Result){
							lCarYear=''
						}else{
							lCarYear=lMapCarYear.CarYear
						}
						caseOutput.CarYear=lCarYear
						if(lCarYear.length()<=0){
							return lreturn
						}
						Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
						if(!lMapCarSubmodel.Result){
							lCarSubmodel=''
						}else{
							lCarSubmodel=lMapCarSubmodel.CarSubmodel
						}
						caseOutput.CarSubmodel=lCarSubmodel
						if(lCarSubmodel.length()<=0){
							return lreturn
						}
						Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
						if(!lMapCarOdometerReading.Result){
							lCarOdometerReading=''
						}else{
							lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
						}
						caseOutput.CarOdometerReading=lCarOdometerReading
						if(lCarOdometerReading.length()<=0){
							return lreturn
						}
						Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
						if(!lMapInsuredGenderAndMaritalStatus.Result){
							lInsuredGenderAndMaritalStatus=''
						}else{
							lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
						}
						caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
						if(lInsuredGenderAndMaritalStatus.length()<=0){
							return lreturn
						}
						Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
						if(!lMapInsuredPostalCode.Result){
							lInsuredPostalCode=''
						}else{
							lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
						}
						caseOutput.InsuredPostalCode=lInsuredPostalCode
						if(lInsuredPostalCode.length()<=0){
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
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
						if(!lMapActualResult.Result){
							lActualResult=''
						}else{
							lActualResult=lMapActualResult.ActualResult
						}
						caseOutput.ActualResult=lActualResult
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					case 'B':
						lLanguage=this.inputLanguage(lLanguage)
						if(lLanguage.length()<=0){
							return lreturn
						}else{
							caseOutput.Language=lLanguage
						}
						Map lMapCarMake=this.inputCarMake(lCarMake)
						if(!lMapCarMake.Result){
							lCarMake=''
						}else{
							lCarMake=lMapCarMake.CarMake
						}
						caseOutput.CarMake=lCarMake
						if(lCarMake.length()<=0){
							return lreturn
						}
						Map lMapCarModel=this.inputCarModel(lCarModel)
						if(!lMapCarModel.Result){
							lCarModel=''
						}else{
							lCarModel=lMapCarModel.CarModel
						}
						caseOutput.CarModel=lCarModel
						if(lCarModel.length()<=0){
							return lreturn
						}
						Map lMapCarYear=this.inputCarYear(lCarYear)
						if(!lMapCarYear.Result){
							lCarYear=''
						}else{
							lCarYear=lMapCarYear.CarYear
						}
						caseOutput.CarYear=lCarYear
						if(lCarYear.length()<=0){
							return lreturn
						}
						Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
						if(!lMapCarSubmodel.Result){
							lCarSubmodel=''
						}else{
							lCarSubmodel=lMapCarSubmodel.CarSubmodel
						}
						caseOutput.CarSubmodel=lCarSubmodel
						if(lCarSubmodel.length()<=0){
							return lreturn
						}
						Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
						if(!lMapCarOdometerReading.Result){
							lCarOdometerReading=''
						}else{
							lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
						}
						caseOutput.CarOdometerReading=lCarOdometerReading
						if(lCarOdometerReading.length()<=0){
							return lreturn
						}
						Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
						if(!lMapInsuredGenderAndMaritalStatus.Result){
							lInsuredGenderAndMaritalStatus=''
						}else{
							lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
						}
						caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
						if(lInsuredGenderAndMaritalStatus.length()<=0){
							return lreturn
						}
						Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
						if(!lMapInsuredPostalCode.Result){
							lInsuredPostalCode=''
						}else{
							lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
						}
						caseOutput.InsuredPostalCode=lInsuredPostalCode
						if(lInsuredPostalCode.length()<=0){
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
						Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
						if(!lMapActualResult.Result){
							lActualResult=''
						}else{
							lActualResult=lMapActualResult.ActualResult
						}
						caseOutput.ActualResult=lActualResult
						lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
						break
					default:
						return lreturn
						break
				}
			}else{
				lLanguage=this.inputLanguage(lLanguage)
				if(lLanguage.length()<=0){
					return lreturn
				}else{
					caseOutput.Language=lLanguage
				}
				Map lMapCarMake=this.inputCarMake(lCarMake)
				if(!lMapCarMake.Result){
					lCarMake=''
				}else{
					lCarMake=lMapCarMake.CarMake
				}
				caseOutput.CarMake=lCarMake
				if(lCarMake.length()<=0){
					return lreturn
				}
				Map lMapCarModel=this.inputCarModel(lCarModel)
				if(!lMapCarModel.Result){
					lCarModel=''
				}else{
					lCarModel=lMapCarModel.CarModel
				}
				caseOutput.CarModel=lCarModel
				if(lCarModel.length()<=0){
					return lreturn
				}
				Map lMapCarYear=this.inputCarYear(lCarYear)
				if(!lMapCarYear.Result){
					lCarYear=''
				}else{
					lCarYear=lMapCarYear.CarYear
				}
				caseOutput.CarYear=lCarYear
				if(lCarYear.length()<=0){
					return lreturn
				}
				Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
				if(!lMapCarSubmodel.Result){
					lCarSubmodel=''
				}else{
					lCarSubmodel=lMapCarSubmodel.CarSubmodel
				}
				caseOutput.CarSubmodel=lCarSubmodel
				if(lCarSubmodel.length()<=0){
					return lreturn
				}
				Map lMapCarOdometerReading=this.inputCarOdometerReading(lCarOdometerReading)
				if(!lMapCarOdometerReading.Result){
					lCarOdometerReading=''
				}else{
					lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
				}
				caseOutput.CarOdometerReading=lCarOdometerReading
				if(lCarOdometerReading.length()<=0){
					return lreturn
				}
				Map lMapInsuredGenderAndMaritalStatus=this.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
				if(!lMapInsuredGenderAndMaritalStatus.Result){
					lInsuredGenderAndMaritalStatus=''
				}else{
					lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
				}
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				if(lInsuredGenderAndMaritalStatus.length()<=0){
					return lreturn
				}
				Map lMapInsuredPostalCode=this.inputInsuredPostalCode(lInsuredPostalCode)
				if(!lMapInsuredPostalCode.Result){
					lInsuredPostalCode=''
				}else{
					lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
				}
				caseOutput.InsuredPostalCode=lInsuredPostalCode
				if(lInsuredPostalCode.length()<=0){
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				caseOutput.ActualResult=lActualResult
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
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
			lPositiveCase=THAExtendedWarrantyQuotationInputType.DEFAULT_POSITIVE_CASE
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
			String lTagButtonNext='getQuote'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			String lLocatorResultPage='#extendedWarranty-packages'
			if(lElementButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			}
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorResultPage,15)
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
			String lTagButtonNext='getQuote'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonNext,15)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			String lLocatorResultPage='#extendedWarranty-packages'
			if(lElementButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			}
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorResultPage,15)
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
	public Map inputCmsCarMake(String strCmsCarMake){
		Map lreturn=[:]
		String lCmsCarMake=strCmsCarMake.trim()
		if(lCmsCarMake.length()<=0){
			lCmsCarMake=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsCarMake','')
			lreturn.put('Result',lResult)
			String lCmsCarMakeTarget=lCmsCarMake.toLowerCase()
			Boolean lIsRandomFromTopList=lCmsCarMakeTarget.length()<=0
			lCmsCarMake=''
			String lLocatorCarMakeHitButtonList='#step div.top-car-brand a'
			List<WebElement> lElementCarMakeHitButtonList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCarMakeHitButtonList)
			Boolean lIsFoundCarMakeHitButtonItem=false
			WebElement lElementCarMakeHitButtonItem=null
			String lStrCarMakeHitButtonItem=''
			WebElement lElementCarMakeOtherGroupParent=null
			List<WebElement> lElementCarMakeOtherGroupListAll=null
			List<WebElement> lElementCarMakeOtherGroupListHit=null
			List<WebElement> lElementCarMakeOtherGroupListOther=null
			Boolean lIsFoundCarMakeOtherButtonItem=false
			WebElement lElementCarMakeOtherButtonItem=null
			String lStrCarMakeOtherButtonItem=''
			String lStrElementAttributeDataBrand='data-brand'
			String lLocatorCarMakeOtherButtonOpen='#step div.other-brand a'
			String lLocatorCarMakeOtherGroupListParent='#step div.car-brand .list-group'
			if(!lElementCarMakeHitButtonList){
				return lreturn
			}
			if(lIsRandomFromTopList){
				lElementCarMakeHitButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarMakeHitButtonList)
				if(lElementCarMakeHitButtonItem){
					lIsFoundCarMakeHitButtonItem=true
					lStrCarMakeHitButtonItem=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCarMakeHitButtonItem,lStrElementAttributeDataBrand)
					lStrCarMakeHitButtonItem=lStrCarMakeHitButtonItem.trim()
				}
			}else{
				String lStrCarMakeHitButtonItemValue=''
				String lStrCarMakeHitButtonItemFind=''
				for(WebElement lElementCarMakeHitButtonItemFind in lElementCarMakeHitButtonList){
					lStrCarMakeHitButtonItemValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCarMakeHitButtonItemFind,lStrElementAttributeDataBrand)
					lStrCarMakeHitButtonItemValue=lStrCarMakeHitButtonItemValue.trim()
					lStrCarMakeHitButtonItemFind=lStrCarMakeHitButtonItemValue.toLowerCase()
					if(lStrCarMakeHitButtonItemFind.length()>0){
						lIsFoundCarMakeHitButtonItem=lStrCarMakeHitButtonItemFind.contains(lCmsCarMakeTarget)
					}
					if(lIsFoundCarMakeHitButtonItem){
						lElementCarMakeHitButtonItem=lElementCarMakeHitButtonItemFind
						lStrCarMakeHitButtonItem=lStrCarMakeHitButtonItemValue
						break
					}
				}
			}
			if(lIsFoundCarMakeHitButtonItem){
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarMakeHitButtonItem)){
					lCmsCarMake=lStrCarMakeHitButtonItem
				}
			}else{
				WebElement lElementCarMakeOtherButtonOpen=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarMakeOtherButtonOpen)
				if(!lElementCarMakeOtherButtonOpen){
					return lreturn
				}else{
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarMakeOtherButtonOpen)
					Integer lIndexRound=0
					Integer lIndexWait=0
					for(lIndexRound=0;lIndexRound<=10;lIndexRound++){
						lElementCarMakeOtherGroupParent=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarMakeOtherGroupListParent)
						if(!lElementCarMakeOtherGroupParent){
							IGNUemaHelper.delayThreadSecond(lIndexRound)
						}else{
							for(lIndexWait=0;lIndexWait<=10;lIndexWait++){
								lElementCarMakeOtherGroupListAll=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementCarMakeOtherGroupParent,'')
								if(!lElementCarMakeOtherGroupListAll){
									IGNUemaHelper.delayThreadSecond(lIndexWait)
								}else{
									if(lElementCarMakeOtherGroupListAll.size()>0){
										break
									}else{
										IGNUemaHelper.delayThreadSecond(lIndexWait)
									}
								}
							}
							break
						}
					}
					if(!lElementCarMakeOtherGroupListAll){
						return lreturn
					}
					if(lElementCarMakeOtherGroupListAll.size()<=0){
						return lreturn
					}
					lElementCarMakeOtherGroupListHit=new ArrayList<WebElement>()
					lElementCarMakeOtherGroupListOther=new ArrayList<WebElement>()
					Boolean lIsFoundDivider=false
					Boolean lIsDivider=false
					String lStrCarMakeOtherGroupListItemType=''
					String lStrCarMakeOtherGroupListItemValue=''
					String lStrCarMakeOtherGroupListItemFind=''
					for(WebElement lElementCarMakeOtherGroupListItem in lElementCarMakeOtherGroupListAll){
						lStrCarMakeOtherGroupListItemType=IGNUemaHelper.checkTypeOfWebElement(this.driver,lElementCarMakeOtherGroupListItem)
						lIsDivider=lStrCarMakeOtherGroupListItemType.equalsIgnoreCase('p')
						if(lIsDivider){
							lIsFoundDivider=true
						}else{
							if(!lIsFoundDivider){
								lElementCarMakeOtherGroupListHit.add(lElementCarMakeOtherGroupListItem)
							}else{
								lElementCarMakeOtherGroupListOther.add(lElementCarMakeOtherGroupListItem)
							}
							if(!lIsFoundCarMakeOtherButtonItem){
								lStrCarMakeOtherGroupListItemValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarMakeOtherGroupListItem)
								lStrCarMakeOtherGroupListItemValue=lStrCarMakeOtherGroupListItemValue.trim()
								lStrCarMakeOtherGroupListItemFind=lStrCarMakeOtherGroupListItemValue.toLowerCase()
								if(lStrCarMakeOtherGroupListItemFind.length()>0){
									lIsFoundCarMakeOtherButtonItem=lStrCarMakeOtherGroupListItemFind.contains(lCmsCarMakeTarget)
								}
								if(lIsFoundCarMakeOtherButtonItem){
									lElementCarMakeOtherButtonItem=lElementCarMakeOtherGroupListItem
									lStrCarMakeOtherButtonItem=lStrCarMakeOtherGroupListItemValue
								}
							}
						}
					}
					if(!lIsFoundCarMakeOtherButtonItem){
						lElementCarMakeOtherButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarMakeOtherGroupListHit)
						if(lElementCarMakeOtherButtonItem){
							lIsFoundCarMakeOtherButtonItem=true
							lStrCarMakeOtherButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarMakeOtherButtonItem)
							lStrCarMakeOtherButtonItem=lStrCarMakeOtherButtonItem.trim()
						}
					}
					if(!lIsFoundCarMakeOtherButtonItem){
						lElementCarMakeOtherButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarMakeOtherGroupListOther)
						if(lElementCarMakeOtherButtonItem){
							lIsFoundCarMakeOtherButtonItem=true
							lStrCarMakeOtherButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarMakeOtherButtonItem)
							lStrCarMakeOtherButtonItem=lStrCarMakeOtherButtonItem.trim()
						}
					}
					if(lIsFoundCarMakeOtherButtonItem){
						if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarMakeOtherButtonItem)){
							lCmsCarMake=lStrCarMakeOtherButtonItem
						}
					}
				}
			}
			lResult=lCmsCarMake.length()>0
			if(lResult){
				lreturn.put('CmsCarMake',lCmsCarMake)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarMake(String strCarMake){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarMakeA(strCarMake)
						break
					case 'B':
						lreturn=this.inputCarMakeB(strCarMake)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarMakeA(strCarMake)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarMakeA(String strCarMake){
		Map lreturn=[:]
		String lCarMake=strCarMake.trim()
		if(lCarMake.length()<=0){
			lCarMake=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			String lTagButton='carBrand'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carBrand-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carBrand-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarMake.length()<=0){
				if(lValid){
					lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarMake,true)
				}
			}else{
				if(!lValid){
					lCarMake=''
				}else{
					lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarMake,false)
				}
			}
			if(lCarMake.length()<=0){
				if(!lValid){
					lCarMake='No Option'
				}else{
					lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarMake,true)
					if(lCarMake.length()<=0){
						lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarMake,true)
					}
				}
			}
			lResult=lCarMake.length()>0
			if(lResult){
				lreturn.put('CarMake',lCarMake)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarMakeB(String strCarMake){
		Map lreturn=[:]
		String lCarMake=strCarMake.trim()
		if(lCarMake.length()<=0){
			lCarMake=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			String lTagButton='carBrand'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carBrand-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carBrand-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarMake.length()<=0){
				if(lValid){
					lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarMake,true)
				}
			}else{
				if(!lValid){
					lCarMake=''
				}else{
					lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarMake,false)
				}
			}
			if(lCarMake.length()<=0){
				if(!lValid){
					lCarMake='No Option'
				}else{
					lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarMake,true)
					if(lCarMake.length()<=0){
						lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarMake,true)
					}
				}
			}
			lResult=lCarMake.length()>0
			if(lResult){
				lreturn.put('CarMake',lCarMake)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsCarModel(String strCmsCarModel){
		Map lreturn=[:]
		String lCmsCarModel=strCmsCarModel.trim()
		if(lCmsCarModel.length()<=0){
			lCmsCarModel=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsCarModel','')
			lreturn.put('Result',lResult)
			String lCmsCarModelTarget=lCmsCarModel.toLowerCase()
			Boolean lIsRandomFromTopList=lCmsCarModelTarget.length()<=0
			lCmsCarModel=''
			WebElement lElementCarModelGroupParent=null
			List<WebElement> lElementCarModelGroupListAll=null
			List<WebElement> lElementCarModelGroupListHit=null
			List<WebElement> lElementCarModelGroupListOther=null
			Boolean lIsFoundCarModelButtonItem=false
			WebElement lElementCarModelButtonItem=null
			String lStrCarModelButtonItem=''
			String lLocatorCarModelGroupListParent='#step div.car-model .list-group'
			Integer lIndexRound=0
			Integer lIndexWait=0
			for(lIndexRound=0;lIndexRound<=10;lIndexRound++){
				lElementCarModelGroupParent=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarModelGroupListParent)
				if(!lElementCarModelGroupParent){
					IGNUemaHelper.delayThreadSecond(lIndexRound)
				}else{
					for(lIndexWait=0;lIndexWait<=10;lIndexWait++){
						lElementCarModelGroupListAll=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementCarModelGroupParent,'')
						if(!lElementCarModelGroupListAll){
							IGNUemaHelper.delayThreadSecond(lIndexWait)
						}else{
							if(lElementCarModelGroupListAll.size()>0){
								break
							}else{
								IGNUemaHelper.delayThreadSecond(lIndexWait)
							}
						}
					}
					break
				}
			}
			if(!lElementCarModelGroupListAll){
				return lreturn
			}
			if(lElementCarModelGroupListAll.size()<=0){
				return lreturn
			}
			lElementCarModelGroupListHit=new ArrayList<WebElement>()
			lElementCarModelGroupListOther=new ArrayList<WebElement>()
			Boolean lIsFoundDivider=false
			Boolean lIsDivider=false
			String lStrCarModelGroupListItemValue=''
			String lStrCarModelGroupListItemFind=''
			for(WebElement lElementCarModelGroupListItem in lElementCarModelGroupListAll){
				lStrCarModelGroupListItemValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarModelGroupListItem)
				lStrCarModelGroupListItemValue=lStrCarModelGroupListItemValue.trim()
				lStrCarModelGroupListItemFind=lStrCarModelGroupListItemValue.toLowerCase()
				if(lStrCarModelGroupListItemFind.length()>0){
					lIsDivider=lStrCarModelGroupListItemFind.contains('--')
					if(lIsDivider){
						lIsFoundDivider=true
					}else{
						if(!lIsFoundDivider){
							lElementCarModelGroupListHit.add(lElementCarModelGroupListItem)
						}else{
							lElementCarModelGroupListOther.add(lElementCarModelGroupListItem)
						}
						if(!lIsFoundCarModelButtonItem){
							lIsFoundCarModelButtonItem=lStrCarModelGroupListItemFind.contains(lCmsCarModelTarget)
							if(lIsFoundCarModelButtonItem){
								lElementCarModelButtonItem=lElementCarModelGroupListItem
								lStrCarModelButtonItem=lStrCarModelGroupListItemValue
							}
						}
					}
				}
			}
			if(!lIsFoundCarModelButtonItem){
				lElementCarModelButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarModelGroupListHit)
				if(lElementCarModelButtonItem){
					lIsFoundCarModelButtonItem=true
					lStrCarModelButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarModelButtonItem)
					lStrCarModelButtonItem=lStrCarModelButtonItem.trim()
				}
			}
			if(!lIsFoundCarModelButtonItem){
				lElementCarModelButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarModelGroupListOther)
				if(lElementCarModelButtonItem){
					lIsFoundCarModelButtonItem=true
					lStrCarModelButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarModelButtonItem)
					lStrCarModelButtonItem=lStrCarModelButtonItem.trim()
				}
			}
			if(lIsFoundCarModelButtonItem){
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarModelButtonItem)){
					lCmsCarModel=lStrCarModelButtonItem
				}
			}
			lResult=lCmsCarModel.length()>0
			if(lResult){
				lreturn.put('CmsCarModel',lCmsCarModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarModel(String strCarModel){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarModelA(strCarModel)
						break
					case 'B':
						lreturn=this.inputCarModelB(strCarModel)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarModelA(strCarModel)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarModelA(String strCarModel){
		Map lreturn=[:]
		String lCarModel=strCarModel.trim()
		if(lCarModel.length()<=0){
			lCarModel=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			String lTagButton='carModel'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carModel-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carModel-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarModel.length()<=0){
				if(lValid){
					lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarModel,true)
				}
			}else{
				if(!lValid){
					lCarModel=''
				}else{
					lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarModel,false)
				}
			}
			if(lCarModel.length()<=0){
				if(!lValid){
					lCarModel='No Option'
				}else{
					lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarModel,true)
					if(lCarModel.length()<=0){
						lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarModel,true)
					}
				}
			}
			lResult=lCarModel.length()>0
			if(lResult){
				lreturn.put('CarModel',lCarModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarModelB(String strCarModel){
		Map lreturn=[:]
		String lCarModel=strCarModel.trim()
		if(lCarModel.length()<=0){
			lCarModel=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			String lTagButton='carModel'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carModel-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carModel-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarModel.length()<=0){
				if(lValid){
					lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarModel,true)
				}
			}else{
				if(!lValid){
					lCarModel=''
				}else{
					lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarModel,false)
				}
			}
			if(lCarModel.length()<=0){
				if(!lValid){
					lCarModel='No Option'
				}else{
					lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarModel,true)
					if(lCarModel.length()<=0){
						lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarModel,true)
					}
				}
			}
			lResult=lCarModel.length()>0
			if(lResult){
				lreturn.put('CarModel',lCarModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsCarYear(String strCmsCarYear){
		Map lreturn=[:]
		String lCmsCarYear=strCmsCarYear.trim()
		if(lCmsCarYear.length()<=0){
			lCmsCarYear=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsCarYear','')
			lreturn.put('Result',lResult)
			String lCmsCarYearTarget=lCmsCarYear.toLowerCase()
			Boolean lIsRandomFromTopList=lCmsCarYearTarget.length()<=0
			lCmsCarYear=''
			WebElement lElementCarYearGroupParent=null
			List<WebElement> lElementCarYearGroupListAll=null
			List<WebElement> lElementCarYearGroupListHit=null
			List<WebElement> lElementCarYearGroupListOther=null
			Boolean lIsFoundCarYearButtonItem=false
			WebElement lElementCarYearButtonItem=null
			String lStrCarYearButtonItem=''
			String lLocatorCarYearGroupListParent='#step div.car-year .list-group'
			Integer lIndexRound=0
			Integer lIndexWait=0
			for(lIndexRound=0;lIndexRound<=10;lIndexRound++){
				lElementCarYearGroupParent=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarYearGroupListParent)
				if(!lElementCarYearGroupParent){
					IGNUemaHelper.delayThreadSecond(lIndexRound)
				}else{
					for(lIndexWait=0;lIndexWait<=10;lIndexWait++){
						lElementCarYearGroupListAll=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementCarYearGroupParent,'')
						if(!lElementCarYearGroupListAll){
							IGNUemaHelper.delayThreadSecond(lIndexWait)
						}else{
							if(lElementCarYearGroupListAll.size()>0){
								break
							}else{
								IGNUemaHelper.delayThreadSecond(lIndexWait)
							}
						}
					}
					break
				}
			}
			if(!lElementCarYearGroupListAll){
				return lreturn
			}
			if(lElementCarYearGroupListAll.size()<=0){
				return lreturn
			}
			lElementCarYearGroupListHit=new ArrayList<WebElement>()
			lElementCarYearGroupListOther=new ArrayList<WebElement>()
			Boolean lIsFoundDivider=false
			Boolean lIsDivider=false
			String lStrCarYearGroupListItemValue=''
			String lStrCarYearGroupListItemFind=''
			for(WebElement lElementCarYearGroupListItem in lElementCarYearGroupListAll){
				lStrCarYearGroupListItemValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarYearGroupListItem)
				lStrCarYearGroupListItemValue=lStrCarYearGroupListItemValue.trim()
				lStrCarYearGroupListItemFind=lStrCarYearGroupListItemValue.toLowerCase()
				if(lStrCarYearGroupListItemFind.length()>0){
					lIsDivider=lStrCarYearGroupListItemFind.contains('--')
					if(lIsDivider){
						lIsFoundDivider=true
					}else{
						if(!lIsFoundDivider){
							lElementCarYearGroupListHit.add(lElementCarYearGroupListItem)
						}else{
							lElementCarYearGroupListOther.add(lElementCarYearGroupListItem)
						}
						if(!lIsFoundCarYearButtonItem){
							lIsFoundCarYearButtonItem=lStrCarYearGroupListItemFind.contains(lCmsCarYearTarget)
							if(lIsFoundCarYearButtonItem){
								lElementCarYearButtonItem=lElementCarYearGroupListItem
								lStrCarYearButtonItem=lStrCarYearGroupListItemValue
							}
						}
					}
				}
			}
			if(!lIsFoundCarYearButtonItem){
				lElementCarYearButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarYearGroupListHit)
				if(lElementCarYearButtonItem){
					lIsFoundCarYearButtonItem=true
					lStrCarYearButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarYearButtonItem)
					lStrCarYearButtonItem=lStrCarYearButtonItem.trim()
				}
			}
			if(!lIsFoundCarYearButtonItem){
				lElementCarYearButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementCarYearGroupListOther)
				if(lElementCarYearButtonItem){
					lIsFoundCarYearButtonItem=true
					lStrCarYearButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarYearButtonItem)
					lStrCarYearButtonItem=lStrCarYearButtonItem.trim()
				}
			}
			if(lIsFoundCarYearButtonItem){
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarYearButtonItem)){
					lCmsCarYear=lStrCarYearButtonItem
				}
			}
			lResult=lCmsCarYear.length()>0
			if(lResult){
				lreturn.put('CmsCarYear',lCmsCarYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarYear(String strCarYear){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarYearA(strCarYear)
						break
					case 'B':
						lreturn=this.inputCarYearB(strCarYear)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarYearA(strCarYear)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarYearA(String strCarYear){
		Map lreturn=[:]
		String lCarYear=strCarYear.trim()
		if(lCarYear.length()<=0){
			lCarYear=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			String lTagButton='carYear'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carYear-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carYear-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarYear.length()<=0){
				if(lValid){
					lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarYear,true)
				}
			}else{
				if(!lValid){
					lCarYear=''
				}else{
					lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarYear,false)
				}
			}
			if(lCarYear.length()<=0){
				if(!lValid){
					lCarYear='No Option'
				}else{
					lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarYear,true)
					if(lCarYear.length()<=0){
						lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarYear,true)
					}
				}
			}
			lResult=lCarYear.length()>0
			if(lResult){
				lreturn.put('CarYear',lCarYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarYearB(String strCarYear){
		Map lreturn=[:]
		String lCarYear=strCarYear.trim()
		if(lCarYear.length()<=0){
			lCarYear=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			String lTagButton='carYear'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carYear-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carYear-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarYear.length()<=0){
				if(lValid){
					lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarYear,true)
				}
			}else{
				if(!lValid){
					lCarYear=''
				}else{
					lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarYear,false)
				}
			}
			if(lCarYear.length()<=0){
				if(!lValid){
					lCarYear='No Option'
				}else{
					lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarYear,true)
					if(lCarYear.length()<=0){
						lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarYear,true)
					}
				}
			}
			lResult=lCarYear.length()>0
			if(lResult){
				lreturn.put('CarYear',lCarYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsCarSubmodel(String strCmsCarSubmodel){
		Map lreturn=[:]
		String lCmsCarSubmodel=strCmsCarSubmodel.trim()
		if(lCmsCarSubmodel.length()<=0){
			lCmsCarSubmodel=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsCarSubmodel','')
			lreturn.put('Result',lResult)
			String lCmsCarSubmodelTarget=lCmsCarSubmodel.toLowerCase()
			Boolean lIsRandomFromTopList=lCmsCarSubmodelTarget.length()<=0
			lCmsCarSubmodel=''
			WebElement lElementCarSubmodelGroupParent=null
			List<WebElement> lElementCarSubmodelGroupListAll=null
			List<WebElement> lElementCarSubmodelGroupListHit=null
			List<WebElement> lElementCarSubmodelGroupListOther=null
			Boolean lIsFoundCarSubmodelButtonItem=false
			WebElement lElementCarSubmodelButtonItem=null
			String lStrCarSubmodelButtonItem=''
			String lLocatorCarSubmodelGroupListParent='#step div.car-sub-model .list-group'
			Integer lIndexRound=0
			Integer lIndexWait=0
			for(lIndexRound=0;lIndexRound<=10;lIndexRound++){
				lElementCarSubmodelGroupParent=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarSubmodelGroupListParent)
				if(!lElementCarSubmodelGroupParent){
					IGNUemaHelper.delayThreadSecond(lIndexRound)
				}else{
					for(lIndexWait=0;lIndexWait<=10;lIndexWait++){
						lElementCarSubmodelGroupListAll=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementCarSubmodelGroupParent,'')
						if(!lElementCarSubmodelGroupListAll){
							IGNUemaHelper.delayThreadSecond(lIndexWait)
						}else{
							if(lElementCarSubmodelGroupListAll.size()>0){
								break
							}else{
								IGNUemaHelper.delayThreadSecond(lIndexWait)
							}
						}
					}
					break
				}
			}
			if(!lElementCarSubmodelGroupListAll){
				return lreturn
			}
			if(lElementCarSubmodelGroupListAll.size()<=0){
				return lreturn
			}
			lElementCarSubmodelGroupListHit=new ArrayList<WebElement>()
			lElementCarSubmodelGroupListOther=new ArrayList<WebElement>()
			Boolean lIsFoundDivider=false
			Boolean lIsDivider=false
			String lStrCarSubmodelGroupListItemValue=''
			String lStrCarSubmodelGroupListItemFind=''
			for(WebElement lElementCarSubmodelGroupListItem in lElementCarSubmodelGroupListAll){
				lStrCarSubmodelGroupListItemValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarSubmodelGroupListItem)
				lStrCarSubmodelGroupListItemValue=lStrCarSubmodelGroupListItemValue.trim()
				lStrCarSubmodelGroupListItemFind=lStrCarSubmodelGroupListItemValue.toLowerCase()
				if(lStrCarSubmodelGroupListItemFind.length()>0){
					lIsDivider=lStrCarSubmodelGroupListItemFind.contains('--')
					if(lIsDivider){
						lIsFoundDivider=true
					}else{
						if(!lIsFoundDivider){
							lElementCarSubmodelGroupListHit.add(lElementCarSubmodelGroupListItem)
						}else{
							lElementCarSubmodelGroupListOther.add(lElementCarSubmodelGroupListItem)
						}
						if(!lIsFoundCarSubmodelButtonItem){
							lIsFoundCarSubmodelButtonItem=lStrCarSubmodelGroupListItemFind.contains(lCmsCarSubmodelTarget)
							if(lIsFoundCarSubmodelButtonItem){
								lElementCarSubmodelButtonItem=lElementCarSubmodelGroupListItem
								lStrCarSubmodelButtonItem=lStrCarSubmodelGroupListItemValue
							}
						}
					}
				}
			}
			if(!lIsFoundCarSubmodelButtonItem){
				lElementCarSubmodelButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementListSkipLast(this.driver,lElementCarSubmodelGroupListHit)
				if(lElementCarSubmodelButtonItem){
					lIsFoundCarSubmodelButtonItem=true
					lStrCarSubmodelButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarSubmodelButtonItem)
					lStrCarSubmodelButtonItem=lStrCarSubmodelButtonItem.trim()
				}
			}
			if(!lIsFoundCarSubmodelButtonItem){
				lElementCarSubmodelButtonItem=IGNUemaHelper.getWebElementRandomFromWebElementListSkipLast(this.driver,lElementCarSubmodelGroupListOther)
				if(lElementCarSubmodelButtonItem){
					lIsFoundCarSubmodelButtonItem=true
					lStrCarSubmodelButtonItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCarSubmodelButtonItem)
					lStrCarSubmodelButtonItem=lStrCarSubmodelButtonItem.trim()
				}
			}
			if(lIsFoundCarSubmodelButtonItem){
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarSubmodelButtonItem)){
					lCmsCarSubmodel=lStrCarSubmodelButtonItem
				}
			}
			lResult=lCmsCarSubmodel.length()>0
			if(lResult){
				lreturn.put('CmsCarSubmodel',lCmsCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarSubmodel(String strCarSubmodel){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarSubmodelA(strCarSubmodel)
						break
					case 'B':
						lreturn=this.inputCarSubmodelB(strCarSubmodel)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarSubmodelA(strCarSubmodel)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarSubmodelA(String strSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			String lTagButton='carDesc'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carDesc-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carDesc-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarSubmodel.length()<=0){
				if(lValid){
					lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarSubmodel,true)
				}
			}else{
				if(!lValid){
					lCarSubmodel=''
				}else{
					lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarSubmodel,false)
				}
			}
			if(lCarSubmodel.length()<=0){
				if(!lValid){
					lCarSubmodel='No Option'
				}else{
					lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarSubmodel,true)
					if(lCarSubmodel.length()<=0){
						lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV3(this.driver,lTagButton,lTagDropdownListAll,lCarSubmodel,true)
					}
				}
			}
			lResult=lCarSubmodel.length()>0
			if(lResult){
				lreturn.put('CarSubmodel',lCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarSubmodelB(String strSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			String lTagButton='carDesc'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownListHit='carDesc-item-hit'
			String lLocatorDropdownListHit=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListHit)
			String lTagDropdownListAll='carDesc-item'
			String lLocatorDropdownListAll=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownListAll)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(lCarSubmodel.length()<=0){
				if(lValid){
					lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarSubmodel,true)
				}
			}else{
				if(!lValid){
					lCarSubmodel=''
				}else{
					lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lCarSubmodel,false)
				}
			}
			if(lCarSubmodel.length()<=0){
				if(!lValid){
					lCarSubmodel='No Option'
				}else{
					lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lCarSubmodel,true)
					if(lCarSubmodel.length()<=0){
						lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV3(this.driver,lTagButton,lTagDropdownListAll,lCarSubmodel,true)
					}
				}
			}
			lResult=lCarSubmodel.length()>0
			if(lResult){
				lreturn.put('CarSubmodel',lCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsKeepDetail(String strCmsKeepDetail,String strCmsLanguage,String strCmsCarMake,String strCmsCarModel,String strCmsCarYear,String strCmsCarSubmodel){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostCarMake','')
			lreturn.put('CmsPostCarModel','')
			lreturn.put('CmsPostCarYear','')
			lreturn.put('CmsPostCarSubmodel','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCmsKeepDetailA(strCmsKeepDetail,strCmsLanguage,strCmsCarMake,strCmsCarModel,strCmsCarYear,strCmsCarSubmodel)
						break
					case 'B':
						lreturn=this.inputCmsKeepDetailB(strCmsKeepDetail,strCmsLanguage,strCmsCarMake,strCmsCarModel,strCmsCarYear,strCmsCarSubmodel)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCmsKeepDetailA(strCmsKeepDetail,strCmsLanguage,strCmsCarMake,strCmsCarModel,strCmsCarYear,strCmsCarSubmodel)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsKeepDetailA(String strCmsKeepDetail,String strCmsLanguage,String strCmsCarMake,String strCmsCarModel,String strCmsCarYear,String strCmsCarSubmodel){
		Map lreturn=[:]
		String lCmsKeepDetail=strCmsKeepDetail.trim()
		if(lCmsKeepDetail.length()<=0){
			lCmsKeepDetail=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
		}
		String lCmsLanguage=strCmsLanguage.toUpperCase().trim()
		String lCmsCarMake=strCmsCarMake.trim()
		String lCmsCarModel=strCmsCarModel.trim()
		String lCmsCarYear=strCmsCarYear.trim()
		String lCmsCarSubmodel=strCmsCarSubmodel.trim()
		String lCmsPostLanguage=''
		String lCmsPostCarMake=''
		String lCmsPostCarModel=''
		String lCmsPostCarYear=''
		String lCmsPostCarSubmodel=''
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostCarMake','')
			lreturn.put('CmsPostCarModel','')
			lreturn.put('CmsPostCarYear','')
			lreturn.put('CmsPostCarSubmodel','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.delayThreadSecond(3)
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			lCmsKeepDetail=IGNUemaHelper.convertBooleanToString(lIsCmsKeepDetail)
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			/*if(lCmsCarMake.length()<=0){
			 return lreturn
			}
			 if(lCmsCarModel.length()<=0){
			 return lreturn
			}
			 if(lCmsCarYear.length()<=0){
			 return lreturn
			}
			 if(lCmsCarSubmodel.length()<=0){
			 return lreturn
			}*/
			String lTagToCheckMainProductReady='carBrand'
			String lLocatorToCheckMainProductReady=IGNUemaHelper.getTagDataSeleniumKey(lTagToCheckMainProductReady)
			Boolean lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,20)
			if(!lIsMainProductReady){
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,20)
			}
			if(!lIsMainProductReady){
				return lreturn
			}
			String lTagCmsPostLanguageButton='select-language'
			String lLocatorCmsPostLanguageButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostLanguageButton)
			WebElement lElementCmsPostLanguageButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostLanguageButton)
			if(!lElementCmsPostLanguageButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementCmsPostLanguageButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostLanguageButton)
			}
			if(!lElementCmsPostLanguageButton){
				return lreturn
			}
			lCmsPostLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostLanguageButton).trim()
			/*String lTagCmsPostCarMakeButton='carrand'
			 String lLocatorCmsPostCarMakeButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarMakeButton)
			 WebElement lElementCmsPostCarMakeButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarMakeButton)
			 if(!lElementCmsPostCarMakeButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarMakeButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarMakeButton)
			}
			 if(!lElementCmsPostCarMakeButton){
			 return lreturn
			}
			 lCmsPostCarMake=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarMakeButton).trim()
			 String lTagCmsPostCarModelButton='carModel'
			 String lLocatorCmsPostCarModelButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarModelButton)
			 WebElement lElementCmsPostCarModelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarModelButton)
			 if(!lElementCmsPostCarModelButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarModelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarModelButton)
			}
			 if(!lElementCmsPostCarModelButton){
			 return lreturn
			}
			 lCmsPostCarModel=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarModelButton).trim()
			 String lTagCmsPostCarYearButton='carYear'
			 String lLocatorCmsPostCarYearButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarYearButton)
			 WebElement lElementCmsPostCarYearButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarYearButton)
			 if(!lElementCmsPostCarYearButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarYearButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarYearButton)
			}
			 if(!lElementCmsPostCarYearButton){
			 return lreturn
			}
			 lCmsPostCarYear=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarYearButton).trim()
			 String lTagCmsPostCarSubmodelButton='carDesc'
			 String lLocatorCmsPostCarSubmodelButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarSubmodelButton)
			 WebElement lElementCmsPostCarSubmodelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarSubmodelButton)
			 if(!lElementCmsPostCarSubmodelButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarSubmodelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarSubmodelButton)
			}
			 if(!lElementCmsPostCarSubmodelButton){
			 return lreturn
			}
			 lCmsPostCarSubmodel=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarSubmodelButton).trim()*/
			if(lCmsPostLanguage.length()<=0){
				return lreturn
			}
			/*if(lCmsPostCarMake.length()<=0){
			 return lreturn
			}
			 if(lCmsPostCarModel.length()<=0){
			 return lreturn
			}
			 if(lCmsPostCarYear.length()<=0){
			 return lreturn
			}
			 if(lCmsPostCarSubmodel.length()<=0){
			 return lreturn
			}*/
			Boolean lIsDone=false
			Boolean lIsOK=false
			lIsOK=lCmsKeepDetail.length()>0
			lIsDone=lIsOK
			lIsOK=(lCmsLanguage.equalsIgnoreCase(lCmsPostLanguage))
			lIsDone=lIsDone&&lIsOK
			/*lIsOK=(lCmsCarMake.equalsIgnoreCase(lCmsPostCarMake))
			 lIsDone=lIsDone&&lIsOK
			 lIsOK=(lCmsCarModel.equalsIgnoreCase(lCmsPostCarModel))
			 lIsDone=lIsDone&&lIsOK
			 lIsOK=(lCmsCarYear.equalsIgnoreCase(lCmsPostCarYear))
			 lIsDone=lIsDone&&lIsOK
			 lIsOK=(lCmsCarSubmodel.equalsIgnoreCase(lCmsPostCarSubmodel))
			 lIsDone=lIsDone&&lIsOK*/
			lResult=lIsDone
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
				lreturn.put('CmsKeepDetail',lCmsKeepDetail)
				lreturn.put('CmsPostLanguage',lCmsPostLanguage)
				lreturn.put('CmsPostCarMake',lCmsPostCarMake)
				lreturn.put('CmsPostCarModel',lCmsPostCarModel)
				lreturn.put('CmsPostCarYear',lCmsPostCarYear)
				lreturn.put('CmsPostCarSubmodel',lCmsPostCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsKeepDetailB(String strCmsKeepDetail,String strCmsLanguage,String strCmsCarMake,String strCmsCarModel,String strCmsCarYear,String strCmsCarSubmodel){
		Map lreturn=[:]
		String lCmsKeepDetail=strCmsKeepDetail.trim()
		if(lCmsKeepDetail.length()<=0){
			lCmsKeepDetail=THAExtendedWarrantyQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
		}
		String lCmsLanguage=strCmsLanguage.toUpperCase().trim()
		String lCmsCarMake=strCmsCarMake.trim()
		String lCmsCarModel=strCmsCarModel.trim()
		String lCmsCarYear=strCmsCarYear.trim()
		String lCmsCarSubmodel=strCmsCarSubmodel.trim()
		String lCmsPostLanguage=''
		String lCmsPostCarMake=''
		String lCmsPostCarModel=''
		String lCmsPostCarYear=''
		String lCmsPostCarSubmodel=''
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostCarMake','')
			lreturn.put('CmsPostCarModel','')
			lreturn.put('CmsPostCarYear','')
			lreturn.put('CmsPostCarSubmodel','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.delayThreadSecond(3)
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			lCmsKeepDetail=IGNUemaHelper.convertBooleanToString(lIsCmsKeepDetail)
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			/*if(lCmsCarMake.length()<=0){
			 return lreturn
			}
			 if(lCmsCarModel.length()<=0){
			 return lreturn
			}
			 if(lCmsCarYear.length()<=0){
			 return lreturn
			}
			 if(lCmsCarSubmodel.length()<=0){
			 return lreturn
			}*/
			String lTagToCheckMainProductReady='carBrand'
			String lLocatorToCheckMainProductReady=IGNUemaHelper.getTagDataSeleniumKey(lTagToCheckMainProductReady)
			Boolean lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,20)
			if(!lIsMainProductReady){
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,20)
			}
			if(!lIsMainProductReady){
				return lreturn
			}
			String lTagCmsPostLanguageButton='select-language'
			String lLocatorCmsPostLanguageButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostLanguageButton)
			WebElement lElementCmsPostLanguageButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostLanguageButton)
			if(!lElementCmsPostLanguageButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementCmsPostLanguageButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostLanguageButton)
			}
			if(!lElementCmsPostLanguageButton){
				return lreturn
			}
			lCmsPostLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostLanguageButton).trim()
			/*String lTagCmsPostCarMakeButton='carrand'
			 String lLocatorCmsPostCarMakeButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarMakeButton)
			 WebElement lElementCmsPostCarMakeButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarMakeButton)
			 if(!lElementCmsPostCarMakeButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarMakeButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarMakeButton)
			}
			 if(!lElementCmsPostCarMakeButton){
			 return lreturn
			}
			 lCmsPostCarMake=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarMakeButton).trim()
			 String lTagCmsPostCarModelButton='carModel'
			 String lLocatorCmsPostCarModelButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarModelButton)
			 WebElement lElementCmsPostCarModelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarModelButton)
			 if(!lElementCmsPostCarModelButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarModelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarModelButton)
			}
			 if(!lElementCmsPostCarModelButton){
			 return lreturn
			}
			 lCmsPostCarModel=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarModelButton).trim()
			 String lTagCmsPostCarYearButton='carYear'
			 String lLocatorCmsPostCarYearButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarYearButton)
			 WebElement lElementCmsPostCarYearButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarYearButton)
			 if(!lElementCmsPostCarYearButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarYearButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarYearButton)
			}
			 if(!lElementCmsPostCarYearButton){
			 return lreturn
			}
			 lCmsPostCarYear=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarYearButton).trim()
			 String lTagCmsPostCarSubmodelButton='carDesc'
			 String lLocatorCmsPostCarSubmodelButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsPostCarSubmodelButton)
			 WebElement lElementCmsPostCarSubmodelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarSubmodelButton)
			 if(!lElementCmsPostCarSubmodelButton){
			 IGNUemaHelper.delayThreadSecond(3)
			 lElementCmsPostCarSubmodelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsPostCarSubmodelButton)
			}
			 if(!lElementCmsPostCarSubmodelButton){
			 return lreturn
			}
			 lCmsPostCarSubmodel=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarSubmodelButton).trim()*/
			if(lCmsPostLanguage.length()<=0){
				return lreturn
			}
			/*if(lCmsPostCarMake.length()<=0){
			 return lreturn
			}
			 if(lCmsPostCarModel.length()<=0){
			 return lreturn
			}
			 if(lCmsPostCarYear.length()<=0){
			 return lreturn
			}
			 if(lCmsPostCarSubmodel.length()<=0){
			 return lreturn
			}*/
			Boolean lIsDone=false
			Boolean lIsOK=false
			lIsOK=lCmsKeepDetail.length()>0
			lIsDone=lIsOK
			lIsOK=(lCmsLanguage.equalsIgnoreCase(lCmsPostLanguage))
			lIsDone=lIsDone&&lIsOK
			/*lIsOK=(lCmsCarMake.equalsIgnoreCase(lCmsPostCarMake))
			 lIsDone=lIsDone&&lIsOK
			 lIsOK=(lCmsCarModel.equalsIgnoreCase(lCmsPostCarModel))
			 lIsDone=lIsDone&&lIsOK
			 lIsOK=(lCmsCarYear.equalsIgnoreCase(lCmsPostCarYear))
			 lIsDone=lIsDone&&lIsOK
			 lIsOK=(lCmsCarSubmodel.equalsIgnoreCase(lCmsPostCarSubmodel))
			 lIsDone=lIsDone&&lIsOK*/
			lResult=lIsDone
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
				lreturn.put('CmsKeepDetail',lCmsKeepDetail)
				lreturn.put('CmsPostLanguage',lCmsPostLanguage)
				lreturn.put('CmsPostCarMake',lCmsPostCarMake)
				lreturn.put('CmsPostCarModel',lCmsPostCarModel)
				lreturn.put('CmsPostCarYear',lCmsPostCarYear)
				lreturn.put('CmsPostCarSubmodel',lCmsPostCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredGenderAndMaritalStatus(String strInsuredGenderAndMaritalStatus){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputInsuredGenderAndMaritalStatusA(strInsuredGenderAndMaritalStatus)
						break
					case 'B':
						lreturn=this.inputInsuredGenderAndMaritalStatusB(strInsuredGenderAndMaritalStatus)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputInsuredGenderAndMaritalStatusA(strInsuredGenderAndMaritalStatus)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredGenderAndMaritalStatusA(String strInsuredGenderAndMaritalStatus){
		Map lreturn=[:]
		String lInsuredGenderAndMaritalStatus=strInsuredGenderAndMaritalStatus.trim()
		if(lInsuredGenderAndMaritalStatus.length()<=0){
			lInsuredGenderAndMaritalStatus=THAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		Map lInsuredGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lInsuredGenderAndMaritalStatusItem=lInsuredGenderAndMaritalStatusList.get(lInsuredGenderAndMaritalStatus)
			if(!lInsuredGenderAndMaritalStatusItem){
				lInsuredGenderAndMaritalStatusItem=lInsuredGenderAndMaritalStatusList.get(THAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
			}
			lInsuredGenderAndMaritalStatus=''
			String lTagInsuredGenderAndMaritalStatusButtonKey='gender'
			String lTagInsuredGenderAndMaritalStatusButtonValue=lInsuredGenderAndMaritalStatusItem
			String lLocatorInsuredGenderAndMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagInsuredGenderAndMaritalStatusButtonKey,lTagInsuredGenderAndMaritalStatusButtonValue)
			WebElement lElementInsuredGenderAndMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagInsuredGenderAndMaritalStatusButtonKey,lTagInsuredGenderAndMaritalStatusButtonValue)
			if(!lElementInsuredGenderAndMaritalStatusButton){
				return lreturn
			}else{
				String lInsuredGenderAndMaritalStatusText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInsuredGenderAndMaritalStatusButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredGenderAndMaritalStatusButton)){
					lInsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatusText
				}
			}
			lResult=lInsuredGenderAndMaritalStatus.length()>0
			if(lResult){
				lreturn.put('InsuredGenderAndMaritalStatus',lInsuredGenderAndMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredGenderAndMaritalStatusB(String strInsuredGenderAndMaritalStatus){
		Map lreturn=[:]
		String lInsuredGenderAndMaritalStatus=strInsuredGenderAndMaritalStatus.trim()
		if(lInsuredGenderAndMaritalStatus.length()<=0){
			lInsuredGenderAndMaritalStatus=THAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		Map lInsuredGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lInsuredGenderAndMaritalStatusItem=lInsuredGenderAndMaritalStatusList.get(lInsuredGenderAndMaritalStatus)
			if(!lInsuredGenderAndMaritalStatusItem){
				lInsuredGenderAndMaritalStatusItem=lInsuredGenderAndMaritalStatusList.get(THAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
			}
			lInsuredGenderAndMaritalStatus=''
			String lTagInsuredGenderAndMaritalStatusButtonKey='gender'
			String lTagInsuredGenderAndMaritalStatusButtonValue=lInsuredGenderAndMaritalStatusItem
			String lLocatorInsuredGenderAndMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagInsuredGenderAndMaritalStatusButtonKey,lTagInsuredGenderAndMaritalStatusButtonValue)
			WebElement lElementInsuredGenderAndMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagInsuredGenderAndMaritalStatusButtonKey,lTagInsuredGenderAndMaritalStatusButtonValue)
			if(!lElementInsuredGenderAndMaritalStatusButton){
				return lreturn
			}else{
				String lInsuredGenderAndMaritalStatusText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInsuredGenderAndMaritalStatusButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredGenderAndMaritalStatusButton)){
					lInsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatusText
				}
			}
			lResult=lInsuredGenderAndMaritalStatus.length()>0
			if(lResult){
				lreturn.put('InsuredGenderAndMaritalStatus',lInsuredGenderAndMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredPostalCode(String strInsuredPostalCode){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('InsuredPostalCode','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputInsuredPostalCodeA(strInsuredPostalCode)
						break
					case 'B':
						lreturn=this.inputInsuredPostalCodeB(strInsuredPostalCode)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputInsuredPostalCodeA(strInsuredPostalCode)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredPostalCodeA(String strInsuredPostalCode){
		Map lreturn=[:]
		String lInsuredPostalCode=strInsuredPostalCode.trim()
		if(lInsuredPostalCode.length()<=0){
			lInsuredPostalCode=THAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredPostalCode','')
			lreturn.put('Result',lResult)
			String lTagInputText='quotePostalCode'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			WebElement lElementInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText)
			lInsuredPostalCode=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputText,lInsuredPostalCode)
			String lTagButtonNext='quotePostalCode-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			if(lResult){
				lreturn.put('InsuredPostalCode',lInsuredPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredPostalCodeB(String strInsuredPostalCode){
		Map lreturn=[:]
		String lInsuredPostalCode=strInsuredPostalCode.trim()
		if(lInsuredPostalCode.length()<=0){
			lInsuredPostalCode=THAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredPostalCode','')
			lreturn.put('Result',lResult)
			String lTagInputText='quotePostalCode'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			WebElement lElementInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText)
			lInsuredPostalCode=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputText,lInsuredPostalCode)
			String lTagButtonNext='quotePostalCode-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			if(lResult){
				lreturn.put('InsuredPostalCode',lInsuredPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOdometerReading(String strCarOdometerReading){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarOdometerReading','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarOdometerReadingA(strCarOdometerReading)
						break
					case 'B':
						lreturn=this.inputCarOdometerReadingB(strCarOdometerReading)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarOdometerReadingA(strCarOdometerReading)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOdometerReadingA(String strCarOdometerReading){
		Map lreturn=[:]
		String lCarOdometerReading=strCarOdometerReading.trim()
		if(lCarOdometerReading.length()<=0){
			lCarOdometerReading=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_ODOMETER_READING
		}
		Integer lCarOdometerReadingMin=0
		Integer lCarOdometerReadingMax=11
		Integer lCarOdometerReadingDefault=3
		Integer lCarOdometerStep=20000
		Integer lCarOdometerReadingNum=IGNUemaHelper.convertStringToInteger(lCarOdometerReading,lCarOdometerReadingDefault)
		if((lCarOdometerReadingNum<lCarOdometerReadingMin)||(lCarOdometerReadingNum>lCarOdometerReadingMax)){
			lCarOdometerReadingNum=lCarOdometerReadingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('CarOdometerReading','')
			lreturn.put('Result',lResult)
			lCarOdometerReading=''
			String lTagSliderInput='ODOmeter'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lCarOdometerInput=lCarOdometerReadingNum.toString()
			lCarOdometerInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lCarOdometerInput)
			IGNUemaHelper.delayThreadSecond(1)
			lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lCarOdometerText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderInput).trim()
			IGNUemaHelper.printLog('lCarOdometerNum:'+lCarOdometerText)
			String lTagCarOdometerValueStep='ODOmeter-step'
			String lLocatorCarOdometerValueStep=IGNUemaHelper.getTagDataSeleniumKey(lTagCarOdometerValueStep)
			WebElement lElementCarOdometerValueStep=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarOdometerValueStep)
			if(!lElementCarOdometerValueStep){
				return lreturn
			}
			String lCarOdometerValueStepText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCarOdometerValueStep).trim()
			if(lCarOdometerValueStepText.length()<=0){
				return lreturn
			}
			Float lCarOdometerNumFloat=lCarOdometerReadingNum*lCarOdometerStep
			Integer lCarOdometerNumInt=lCarOdometerNumFloat.intValue()
			if(lCarOdometerNumFloat>200000){
				lCarOdometerNumInt=200001
			}
			lCarOdometerText='CarOdometerNum='+lCarOdometerText+'|EachStep='+lCarOdometerStep+'|CalValue='+lCarOdometerNumInt.toString()
			String lTagCarOdometerDisplayText=''
			String lLocatorCarOdometerDisplayText='.car-mileage .selected-migeage'
			String lCarOdometerDisplayText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorCarOdometerDisplayText).trim()
			if(lCarOdometerDisplayText.length()>0){
				lCarOdometerText=lCarOdometerText+'|Text='+lCarOdometerDisplayText
			}
			lCarOdometerReading=lCarOdometerText
			String lTagCarOdometerNext='ODOmeter-next'
			String lLocatorCarOdometerNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCarOdometerNext)
			WebElement lElementCarOdometerNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarOdometerNext)
			if(lElementCarOdometerNext){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarOdometerNext)
			}
			lResult=lResult&&(lCarOdometerReading.length()>0)
			if(lResult){
				lreturn.put('CarOdometerReading',lCarOdometerReading)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOdometerReadingB(String strCarOdometerReading){
		Map lreturn=[:]
		String lCarOdometerReading=strCarOdometerReading.trim()
		if(lCarOdometerReading.length()<=0){
			lCarOdometerReading=THAExtendedWarrantyQuotationInputType.DEFAULT_CAR_ODOMETER_READING
		}
		Integer lCarOdometerReadingMin=0
		Integer lCarOdometerReadingMax=11
		Integer lCarOdometerReadingDefault=3
		Integer lCarOdometerStep=20000
		Integer lCarOdometerReadingNum=IGNUemaHelper.convertStringToInteger(lCarOdometerReading,lCarOdometerReadingDefault)
		if((lCarOdometerReadingNum<lCarOdometerReadingMin)||(lCarOdometerReadingNum>lCarOdometerReadingMax)){
			lCarOdometerReadingNum=lCarOdometerReadingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('CarOdometerReading','')
			lreturn.put('Result',lResult)
			lCarOdometerReading=''
			String lTagSliderInput='ODOmeter'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lCarOdometerInput=lCarOdometerReadingNum.toString()
			lCarOdometerInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lCarOdometerInput)
			IGNUemaHelper.delayThreadSecond(1)
			lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lCarOdometerText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderInput).trim()
			IGNUemaHelper.printLog('lCarOdometerNum:'+lCarOdometerText)
			String lTagCarOdometerValueStep='ODOmeter-step'
			String lLocatorCarOdometerValueStep=IGNUemaHelper.getTagDataSeleniumKey(lTagCarOdometerValueStep)
			WebElement lElementCarOdometerValueStep=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarOdometerValueStep)
			if(!lElementCarOdometerValueStep){
				return lreturn
			}
			String lCarOdometerValueStepText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCarOdometerValueStep).trim()
			if(lCarOdometerValueStepText.length()<=0){
				return lreturn
			}
			Float lCarOdometerNumFloat=lCarOdometerReadingNum*lCarOdometerStep
			Integer lCarOdometerNumInt=lCarOdometerNumFloat.intValue()
			if(lCarOdometerNumFloat>200000){
				lCarOdometerNumInt=200001
			}
			lCarOdometerText='CarOdometerNum='+lCarOdometerText+'|EachStep='+lCarOdometerStep+'|CalValue='+lCarOdometerNumInt.toString()
			String lTagCarOdometerDisplayText=''
			String lLocatorCarOdometerDisplayText='.car-mileage .selected-migeage'
			String lCarOdometerDisplayText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorCarOdometerDisplayText).trim()
			if(lCarOdometerDisplayText.length()>0){
				lCarOdometerText=lCarOdometerText+'|Text='+lCarOdometerDisplayText
			}
			lCarOdometerReading=lCarOdometerText
			String lTagCarOdometerNext='ODOmeter-next'
			String lLocatorCarOdometerNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCarOdometerNext)
			WebElement lElementCarOdometerNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarOdometerNext)
			if(lElementCarOdometerNext){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarOdometerNext)
			}
			lResult=lResult&&(lCarOdometerReading.length()>0)
			if(lResult){
				lreturn.put('CarOdometerReading',lCarOdometerReading)
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
}