package org.roojai.tha.types.kumka.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaCancerResult_OutputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaCancerResult_OutputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean closeAskToSaveEmailForm(){
		Boolean lreturn=false
		try{
			String lTagFormSaveQuote='save-quote-modal'
			String lLocatorFormSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagFormSaveQuote)
			String lTagButtonCloseSaveQuote='save-quote-modal-close'
			String lLocatorButtonCloseSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCloseSaveQuote)
			WebElement lElementButtonCloseSaveQuote=null
			Boolean lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			if(lIsSaveQuoteVisible){
				lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
				if(lElementButtonCloseSaveQuote){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonCloseSaveQuote)
				}
				lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			}
			if(lIsSaveQuoteVisible){
				lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
				if(lElementButtonCloseSaveQuote){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonCloseSaveQuote)
				}
				lIsSaveQuoteVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			}
			lreturn=!lIsSaveQuoteVisible
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputListSave(Boolean isDefaultCase){
		Boolean lreturn=false
		try{
			THAKumkaCancerResult_OutputFactory lOutputList=new THAKumkaCancerResult_OutputFactory(isDefaultCase,GlobalVariable.CaseNumber)
			Integer lOutputNumberOfCardsNum=0
			String lTagListOfCardResultList='card-plan'
			String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
			List<WebElement> lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
			if(lElementListOfCardResultList){
				lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
			}
			Boolean lIsOK=false
			if(lOutputNumberOfCardsNum<=0){
				lIsOK=true
			}else{
				Integer lIndexOutput=0
				THAKumkaCancerResult_OutputType lOutputItem=new THAKumkaCancerResult_OutputType()
				for(lIndexOutput=0;lIndexOutput<lOutputNumberOfCardsNum;lIndexOutput++){
					this.closeAskToSaveEmailForm()
					lOutputItem.Output.put('CardDisplayPlanId',this.outputCardDisplayPlanId(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanType',this.outputCardPlanType(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanPartnerName',this.outputCardPlanPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanName',this.outputCardPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanCoverage',this.outputCardPlanCoverage(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanPaymentOptionAmount',this.outputCardPlanPaymentOptionAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanPaymentInstalment',this.outputCardPlanPaymentInstalment(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					String lTagModalPaymentInstalmentOpenButton=''
					String lLocatorModalPaymentInstalmentOpenButton='[data-target="#detail_installment"]'
					WebElement lElementModalPaymentInstalmentOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementListOfCardResultList[lIndexOutput],lLocatorModalPaymentInstalmentOpenButton,true)
					if(lElementModalPaymentInstalmentOpenButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementModalPaymentInstalmentOpenButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentOpenButton)
						IGNUemaHelper.delayThreadSecond(1)
						lOutputItem.Output.put('CardModalPaymentInstalment',this.outputCardModalPaymentInstalment(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						String lTagModalPaymentInstalmentCloseButton=''
						String lLocatorModalPaymentInstalmentCloseButton='#detail_installment'
						WebElement lElementModalPaymentInstalmentCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalPaymentInstalmentCloseButton)
						if(lElementModalPaymentInstalmentCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementModalPaymentInstalmentCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lOutputItem.Output.put('CardPlanTaxDeduct',this.outputCardPlanTaxDeduct(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanChemoTherapy',this.outputCardPlanChemoTherapy(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanHospitalCash',this.outputCardPlanHospitalCash(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanBenefitsPa',this.outputCardPlanBenefitsPa(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanRenew',this.outputCardPlanRenew(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanActive',this.outputCardPlanActive(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPlanWait',this.outputCardPlanWait(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CardPromoText',this.outputCardPromoText(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('OutboundButtonName',this.outputOutboundButtonName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					String lTagMoreDetail=''
					String lLocatorMoreDetail='[data-target="#detail_modal"]'
					WebElement lElementMoreDetail=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementListOfCardResultList[lIndexOutput],lLocatorMoreDetail,true)
					if(lElementMoreDetail){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMoreDetail)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetail)
						IGNUemaHelper.delayThreadSecond(1)
						lOutputItem.Output.put('CardDetailPartnerName',this.outputCardDetailPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailPlanName',this.outputCardDetailPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsLumpsumAllInvasiveCancer',this.outputCardDetailIsLumpsumAllInvasiveCancer(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsLumpsumNonInvasiveCancer',this.outputCardDetailIsLumpsumNonInvasiveCancer(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsLumpsumAddInvasiveCancer',this.outputCardDetailIsLumpsumAddInvasiveCancer(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsAddBenefitsSkinCancer',this.outputCardDetailIsAddBenefitsSkinCancer(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsAddBenefitsFuneralFee',this.outputCardDetailIsAddBenefitsFuneralFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsAddBenefitsSecondExamFee',this.outputCardDetailIsAddBenefitsSecondExamFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsCoverOpd',this.outputCardDetailIsCoverOpd(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsAddBenefitsForGender',this.outputCardDetailIsAddBenefitsForGender(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailIsOtherCovid',this.outputCardDetailIsOtherCovid(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('CardDetailTermAndCondition',this.outputCardDetailTermAndCondition(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						String lTagMoreDetailCloseButton=''
						String lLocatorMoreDetailCloseButton='#modal-close'
						WebElement lElementMoreDetailCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMoreDetailCloseButton)
						if(lElementMoreDetailCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMoreDetailCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lIsOK=lOutputList.addMapItemToOutputList(lOutputItem.Output)
					if(!lIsOK){
						break
					}
				}
			}
			lreturn=lIsOK&&lOutputList.saveOutputList()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDisplayPlanId(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDisplayPlanId='card-plan'
			String lLocatorCardDisplayPlanId=IGNUemaHelper.getTagDataSeleniumKey(lTagCardDisplayPlanId)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,elementBase)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanType(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanType=''
			String lLocatorCardPlanType='.card-header p'
			WebElement lElementCardPlanType=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanType,true)
			if(IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCardPlanType)){
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanType)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanPartnerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanPartnerName=''
			String lLocatorCardPlanPartnerName='.card-header .rounded p:nth-child(1)'
			WebElement lElementCardPlanPartnerName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanPartnerName,true)
			if(IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCardPlanPartnerName)){
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanPartnerName)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanName=''
			String lLocatorCardPlanName='.card-header .rounded p:nth-child(2)'
			WebElement lElementCardPlanName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanName,true)
			if(IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCardPlanName)){
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanName)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanCoverage(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanCoverage=''
			String lLocatorCardPlanCoverageList='.row>div:nth-child(2).rounded span'
			String lLocatorCardPlanCoverageItem=''
			List<WebElement> lElementCardPlanCoverageList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,elementBase,lLocatorCardPlanCoverageList)
			if(lElementCardPlanCoverageList){
				WebElement lElementCardPlanCoverageItem=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,0,lElementCardPlanCoverageList)
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanCoverageItem)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanPaymentOptionAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanPaymentOptionAmountList=''
			String lLocatorCardPlanPaymentOptionAmountList='.price-height p'
			List<WebElement> lElementCardPlanPaymentOptionAmountList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,elementBase,lLocatorCardPlanPaymentOptionAmountList)
			if(lElementCardPlanPaymentOptionAmountList){
				WebElement lElementCardPlanPaymentOptionAmountItem=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,0,lElementCardPlanPaymentOptionAmountList)
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPlanPaymentOptionAmountItem)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanPaymentInstalment(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanPaymentInstalmentList=''
			String lLocatorCardPlanPaymentInstalmentList='.price-height p:nth-child(2)'
			List<WebElement> lElementCardPlanPaymentInstalmentList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,elementBase,lLocatorCardPlanPaymentInstalmentList)
			if(lElementCardPlanPaymentInstalmentList){
				WebElement lElementCardPlanPaymentInstalmentItem=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,0,lElementCardPlanPaymentInstalmentList)
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPlanPaymentInstalmentItem)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardModalPaymentInstalment(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardModalPaymentInstalment=''
			String lLocatorCardModalPaymentInstalment='#detail_installment'
			WebElement lElementCardModalPaymentInstalment=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardModalPaymentInstalment)
			if(!lElementCardModalPaymentInstalment){
				lText='No Option'
			}else{
				lText=(IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardModalPaymentInstalment)).trim()
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanTaxDeduct(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanTaxDeductList=''
			String lLocatorCardPlanTaxDeductList='.price-height p'
			List<WebElement> lElementCardPlanTaxDeductList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,elementBase,lLocatorCardPlanTaxDeductList)
			if(lElementCardPlanTaxDeductList){
				WebElement lElementCardPlanTaxDeductItem=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,2,lElementCardPlanTaxDeductList)
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPlanTaxDeductItem)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanChemoTherapy(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanChemoTherapy=''
			String lLocatorCardPlanChemoTherapy='.row>div:nth-child(3)'
			WebElement lElementCardPlanChemoTherapy=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanChemoTherapy,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanChemoTherapy)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanHospitalCash(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanHospitalCash=''
			String lLocatorCardPlanHospitalCashValue='display-hospitalCoverage'
			String lLocatorCardPlanHospitalCash='[display-id*="'+lLocatorCardPlanHospitalCashValue+'"]'
			WebElement lElementCardPlanHospitalCash=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanHospitalCash,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanHospitalCash)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanBenefitsPa(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanBenefitsPa=''
			String lLocatorCardPlanBenefitsPa='.row>div:nth-child(7)'
			WebElement lElementCardPlanBenefitsPa=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanBenefitsPa,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanBenefitsPa)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanRenew(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanRenew=''
			String lLocatorCardPlanRenewValue='display-endowmentFlag'
			String lLocatorCardPlanRenew='[display-id*="'+lLocatorCardPlanRenewValue+'"]'
			WebElement lElementCardPlanRenew=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanRenew,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanRenew)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanActive(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanActive=''
			String lLocatorCardPlanActiveValue='display-coveragePeriodFlag'
			String lLocatorCardPlanActive='[display-id*="'+lLocatorCardPlanActiveValue+'"]'
			WebElement lElementCardPlanActive=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanActive,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanActive)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPlanWait(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPlanWait=''
			String lLocatorCardPlanWaitValue='display-waitingPeriod'
			String lLocatorCardPlanWait='[display-id*="'+lLocatorCardPlanWaitValue+'"]'
			WebElement lElementCardPlanWait=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanWait,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPlanWait)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPromoText(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPromoText=''
			String lLocatorCardPromoText='.promotion-box'
			WebElement lElementCardPromoText=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPromoText,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardPromoText)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputOutboundButtonName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagOutboundButtonName=''
			String lLocatorOutboundButtonName='.card-footer button'
			WebElement lElementOutboundButtonName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorOutboundButtonName,true)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementOutboundButtonName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailPartnerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailPartnerName=''
			String lLocatorCardDetailPartnerName='#headerDiv p:first-child'
			WebElement lElementCardDetailPartnerName=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailPartnerName)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailPartnerName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailPlanName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailPlanName=''
			String lLocatorCardDetailPlanName='#headerDiv p:last-child'
			WebElement lElementCardDetailPlanName=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailPlanName)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailPlanName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsLumpsumAllInvasiveCancer(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsLumpsumAllInvasiveCancer=''
			String lLocatorCardDetailIsLumpsumAllInvasiveCancerValue='display-allInvasiveCoverage'
			String lLocatorCardDetailIsLumpsumAllInvasiveCancer='[display-id*="'+lLocatorCardDetailIsLumpsumAllInvasiveCancerValue+'"]'
			WebElement lElementCardDetailIsLumpsumAllInvasiveCancer=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsLumpsumAllInvasiveCancer)
			if(!lElementCardDetailIsLumpsumAllInvasiveCancer){
				lText='No Option'
			}else{
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsLumpsumAllInvasiveCancer)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsLumpsumNonInvasiveCancer(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsLumpsumNonInvasiveCancer=''
			String lLocatorCardDetailIsLumpsumNonInvasiveCancerValue='display-nonInvasiveCoverage'
			String lLocatorCardDetailIsLumpsumNonInvasiveCancer='[display-id*="'+lLocatorCardDetailIsLumpsumNonInvasiveCancerValue+'"]'
			WebElement lElementCardDetailIsLumpsumNonInvasiveCancer=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsLumpsumNonInvasiveCancer)
			if(!lElementCardDetailIsLumpsumNonInvasiveCancer){
				lText='No Option'
			}else{
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsLumpsumNonInvasiveCancer)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsLumpsumAddInvasiveCancer(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsLumpsumAddInvasiveCancer=''
			String lLocatorCardDetailIsLumpsumAddInvasiveCancerValue='display-invasiveCoverage'
			String lLocatorCardDetailIsLumpsumAddInvasiveCancer='[display-id*="'+lLocatorCardDetailIsLumpsumAddInvasiveCancerValue+'"]'
			WebElement lElementCardDetailIsLumpsumAddInvasiveCancer=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsLumpsumAddInvasiveCancer)
			if(!lElementCardDetailIsLumpsumAddInvasiveCancer){
				lText='No Option'
			}else{
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsLumpsumAddInvasiveCancer)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsAddBenefitsSkinCancer(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsAddBenefitsSkinCancer=''
			String lLocatorCardDetailIsAddBenefitsSkinCancerValue='display-addBenefitsSkinCancer'
			String lLocatorCardDetailIsAddBenefitsSkinCancer='[display-id*="'+lLocatorCardDetailIsAddBenefitsSkinCancerValue+'"]'
			WebElement lElementCardDetailIsAddBenefitsSkinCancer=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsAddBenefitsSkinCancer)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsAddBenefitsSkinCancer)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsAddBenefitsFuneralFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsAddBenefitsFuneralFee=''
			String lLocatorCardDetailIsAddBenefitsFuneralFeeValue='display-addBenefitsFuneralFee'
			String lLocatorCardDetailIsAddBenefitsFuneralFee='[display-id*="'+lLocatorCardDetailIsAddBenefitsFuneralFeeValue+'"]'
			WebElement lElementCardDetailIsAddBenefitsFuneralFee=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsAddBenefitsFuneralFee)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsAddBenefitsFuneralFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsAddBenefitsSecondExamFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsAddBenefitsSecondExamFee=''
			String lLocatorCardDetailIsAddBenefitsSecondExamFeeValue='display-addBenefitsSecoundExamFee'
			String lLocatorCardDetailIsAddBenefitsSecondExamFee='[display-id*="'+lLocatorCardDetailIsAddBenefitsSecondExamFeeValue+'"]'
			WebElement lElementCardDetailIsAddBenefitsSecondExamFee=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsAddBenefitsSecondExamFee)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsAddBenefitsSecondExamFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsCoverOpd(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsCoverOpd=''
			String lLocatorCardDetailIsCoverOpdValue='display-coverOPDBenefits'
			String lLocatorCardDetailIsCoverOpd='[display-id*="'+lLocatorCardDetailIsCoverOpdValue+'"]'
			WebElement lElementCardDetailIsCoverOpd=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsCoverOpd)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsCoverOpd)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsAddBenefitsForGender(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsAddBenefitsForGender=''
			String lLocatorCardDetailIsAddBenefitsForGenderValue='display-si'
			String lLocatorCardDetailIsAddBenefitsForGender='[display-id*="'+lLocatorCardDetailIsAddBenefitsForGenderValue+'"]'
			WebElement lElementCardDetailIsAddBenefitsForGender=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsAddBenefitsForGender)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsAddBenefitsForGender)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailIsOtherCovid(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailIsOtherCovid=''
			String lLocatorCardDetailIsOtherCovidValue='display-otherCovid19'
			String lLocatorCardDetailIsOtherCovid='[display-id*="'+lLocatorCardDetailIsOtherCovidValue+'"]'
			WebElement lElementCardDetailIsOtherCovid=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailIsOtherCovid)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailIsOtherCovid)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDetailTermAndCondition(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDetailTermAndCondition=''
			String lLocatorCardDetailTermAndCondition='#warrantyConditionsDiv'
			WebElement lElementCardDetailTermAndCondition=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardDetailTermAndCondition)
			lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementCardDetailTermAndCondition)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}