package org.roojai.tha.types.roojaicovid
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiCovidQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiCovidQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public String inputLanguage(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARoojaiCovidQuotationInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lResultText=''
			String lTagLanguageStatus=''
			String lLocatorLanguageStatus='#navbar-action div ul li span'
			WebElement lElementLanguageStatus=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorLanguageStatus)
			String lStrLanguageStatus=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementLanguageStatus)
			Boolean lToSwitchLanguage=false
			if(lStrLanguageStatus.toUpperCase().contains('ENGLISH')){
				if(!lLanguageItem.toUpperCase().contains('EN')){
					lToSwitchLanguage=true
				}
			}else{
				if(lLanguageItem.toUpperCase().contains('EN')){
					lToSwitchLanguage=true
				}
			}
			if(lToSwitchLanguage){
				String lTagButtonLanguageOpen=''
				String lLocatorButtonLanguageOpen='#navbar-action div ul'
				WebElement lElementButtonLanguageOpen=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonLanguageOpen)
				if(!lElementButtonLanguageOpen){
					lResultText='No Option'
				}else{
					if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonLanguageOpen)){
						lResultText='No Option'
					}
					String lTagButtonLanguageSwitch=''
					String lLocatorButtonLanguageSwitch='#navbar-action div ul li ul li a'
					WebElement lElementButtonLanguageSwitch=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonLanguageSwitch)
					if(!lElementButtonLanguageSwitch){
						lResultText='No Option'
					}else{
						if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonLanguageSwitch)){
							lResultText='No Option'
						}
					}
				}
			}
			IGNUemaHelper.delayThreadSecond(3)
			lElementLanguageStatus=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorLanguageStatus)
			lStrLanguageStatus=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementLanguageStatus)
			if(lResultText.length()<=0){
				lResultText=lStrLanguageStatus
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
	public Boolean inputInput(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lSelectPlan=caseInput.SelectPlan.toString().trim()
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
			Map lMapSelectPlan=this.inputSelectPlan(lSelectPlan)
			if(!lMapSelectPlan.Result){
				lSelectPlan=''
			}else{
				lSelectPlan=lMapSelectPlan.SelectPlan
			}
			caseOutput.SelectPlan=lSelectPlan
			if(lSelectPlan.length()<=0){
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
			lPositiveCase=THARoojaiCovidQuotationInputType.DEFAULT_POSITIVE_CASE
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
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lTagPriceSum=''
			String lLocatorResultPage='#summary-price'
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
	public Map inputSelectPlan(String strSelectPlan){
		Map lreturn=[:]
		String lSelectPlan=strSelectPlan.trim()
		Map lSelectPlanList=['1':'0','2':'1']
		if(lSelectPlan.length()<=0){
			lSelectPlan=THARoojaiCovidQuotationInputType.DEFAULT_SELECT_PLAN
		}
		Integer lSelectPlanDefault=0
		try{
			Boolean lResult=false
			lreturn.put('SelectPlan','')
			lreturn.put('Result',lResult)
			String lSelectPlanItem=lSelectPlanList.get(lSelectPlan)
			if(!lSelectPlanItem){
				lSelectPlanItem=lSelectPlanList.get(THARoojaiCovidQuotationInputType.DEFAULT_SELECT_PLAN)
			}
			Integer lSelectPlanNum=IGNUemaHelper.convertStringToInteger(lSelectPlanItem,lSelectPlanDefault)
			lSelectPlan=''
			String lLocatorSelectPlanButton='.owl-item .btn'
			List<WebElement> lElementSelectPlanButtonList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorSelectPlanButton)
			if(!lElementSelectPlanButtonList){
				lSelectPlan='No Option'
			}
			if(lElementSelectPlanButtonList.size()<lSelectPlanList.size()){
				return lreturn
			}
			WebElement lElementSelectPlanButton=lElementSelectPlanButtonList[lSelectPlanNum]
			String lTagLabelSelectedPlan=''
			String lLocatorLabelSelectedPlan='p'
			WebElement lElementSelectPlanParentButton=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementSelectPlanButton)
			WebElement lElementSelectPlanButtonLabel=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementSelectPlanParentButton,lLocatorLabelSelectedPlan,true)
			lSelectPlan=IGNUemaHelper.getTextByWebElement(this.driver,lElementSelectPlanButtonLabel)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSelectPlanButton)
			if(lResult){
				lreturn.put('SelectPlan',lSelectPlan)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}