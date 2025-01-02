package org.roojai.tha.types.kumka.insurecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaInsureCarResult_OutputUtilDesignA{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaInsureCarResult_OutputUtilDesignA(WebDriver newDriver,WebDriver newSelenium){
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
			String lTagButtonCloseSaveQuote='closeSaveQuote-btn'
			String lLocatorButtonCloseSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCloseSaveQuote)
			WebElement lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
			String lTagFormSaveQuote='modal-save-result'
			String lLocatorFormSaveQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagFormSaveQuote)
			Boolean lIsFormSaveQuoteDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			if(lIsFormSaveQuoteDisplayed){
				lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
				if(lElementButtonCloseSaveQuote){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCloseSaveQuote)
				}
				lIsFormSaveQuoteDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			}
			if(lIsFormSaveQuoteDisplayed){
				lElementButtonCloseSaveQuote=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
				if(lElementButtonCloseSaveQuote){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCloseSaveQuote)
				}
				lIsFormSaveQuoteDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSaveQuote,1)
			}
			lreturn=!lIsFormSaveQuoteDisplayed
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputListSave(Boolean isDefaultCase){
		Boolean lreturn=false
		try{
			THAKumkaInsureCarResult_OutputFactory lOutputList=new THAKumkaInsureCarResult_OutputFactory(isDefaultCase,GlobalVariable.CaseNumber)
			Integer lOutputNumberOfCardsNum=0
			String lTagListOfCardResultList='card-display-plan'
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
				THAKumkaInsureCarResult_OutputType lOutputItem=new THAKumkaInsureCarResult_OutputType()
				for(lIndexOutput=0;lIndexOutput<lOutputNumberOfCardsNum;lIndexOutput++){
					this.closeAskToSaveEmailForm()
					lOutputItem.initOutput()
					lOutputItem.Output.put('DesignACardDisplayPlanId',this.outputCardDisplayPlanId(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardDisplayPlanType',this.outputCardDisplayPlanType(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardOpenScore',this.outputCardOpenScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					String lTagCardOpenScore='open-score'
					String lLocatorCardOpenScore=IGNUemaHelper.getTagDataSeleniumKey(lTagCardOpenScore)
					WebElement lElementCardOpenScore=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementListOfCardResultList[lIndexOutput],lLocatorCardOpenScore,true)
					if(lElementCardOpenScore){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCardOpenScore)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCardOpenScore)
						IGNUemaHelper.delayThreadSecond(1)
						lOutputItem.Output.put('DesignAModalScorePartnernameScore',this.outputModalScorePartnernameScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScorePartnerName',this.outputModalScorePartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreSuminsured',this.outputModalScoreSuminsured(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreSuminsuredScore',this.outputModalScoreSuminsuredScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreExcess',this.outputModalScoreExcess(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreExcessScore',this.outputModalScoreExcessScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreGarage',this.outputModalScoreGarage(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreGarageScore',this.outputModalScoreGarageScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreDriver',this.outputModalScoreDriver(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreDriverScore',this.outputModalScoreDriverScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScoreProperty',this.outputModalScoreProperty(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalScorePropertyScore',this.outputModalScorePropertyScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						String lTagCardOpenScoreCloseButton='closeScore-btn'
						String lLocatorCardOpenScoreCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCardOpenScoreCloseButton)
						WebElement lElementCardOpenScoreCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCardOpenScoreCloseButton)
						if(lElementCardOpenScoreCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCardOpenScoreCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lOutputItem.Output.put('DesignACardPromotionText',this.outputCardPromotionText(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardInsurerName',this.outputCardInsurerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardPartnerName',this.outputCardPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardPlanName',this.outputCardPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardPrice',this.outputCardPrice(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardBasicPremium',this.outputCardBasicPremium(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardDiscountAmount',this.outputCardDiscountAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardExcess',this.outputCardExcess(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardSumInsure',this.outputCardSumInsure(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardProperty',this.outputCardProperty(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardIsRoadside',this.outputCardIsRoadside(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardIsOnlinePayment',this.outputCardIsOnlinePayment(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardIsCompulsoryAvailable',this.outputCardIsCompulsoryAvailable(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardIsFlood',this.outputCardIsFlood(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardGarage',this.outputCardGarage(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardDriver',this.outputCardDriver(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignACardInstalmentPrice',this.outputCardInstalmentPrice(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('DesignAOutboundButtonName',this.outputOutboundButtonName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					String lTagSeeMoreLink='seemore-link'
					String lLocatorSeeMoreLink=IGNUemaHelper.getTagDataSeleniumKey(lTagSeeMoreLink)
					WebElement lElementSeeMoreLink=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementListOfCardResultList[lIndexOutput],lLocatorSeeMoreLink,true)
					if(lElementSeeMoreLink){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementSeeMoreLink)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSeeMoreLink)
						IGNUemaHelper.delayThreadSecond(1)
						lOutputItem.Output.put('DesignAModalDetailInsurerName',this.outputModalDetailInsurerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailPartnerName',this.outputModalDetailPartnerName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailPrice',this.outputModalDetailPrice(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailBasicPremium',this.outputModalDetailBasicPremium(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailDiscountAmount',this.outputModalDetailDiscountAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailSuminsure',this.outputModalDetailSuminsure(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailScore',this.outputModalDetailScore(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailPromotion',this.outputModalDetailPromotion(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailExcess',this.outputModalDetailExcess(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailGarage',this.outputModalDetailGarage(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailDriver',this.outputModalDetailDriver(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailFire',this.outputModalDetailFire(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailFlood',this.outputModalDetailFlood(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailPersonal',this.outputModalDetailPersonal(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailMedical',this.outputModalDetailMedical(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailBail',this.outputModalDetailBail(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailProperty',this.outputModalDetailProperty(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailDeath',this.outputModalDetailDeath(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						lOutputItem.Output.put('DesignAModalDetailMaxDeath',this.outputModalDetailMaxDeath(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
						String lTagSeeMoreLinkCloseButton='closeDetailModal-btn'
						String lLocatorSeeMoreLinkCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSeeMoreLinkCloseButton)
						WebElement lElementSeeMoreLinkCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSeeMoreLinkCloseButton)
						if(lElementSeeMoreLinkCloseButton){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSeeMoreLinkCloseButton)
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
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,elementBase)
			lreturn=lText.substring(0,lText.lastIndexOf('_'))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDisplayPlanType(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,elementBase)
			lreturn=lText.substring(lText.lastIndexOf('_')+1,lText.length())
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardOpenScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardOpenScore='open-score'
			String lLocatorCardOpenScore=IGNUemaHelper.getTagDataSeleniumKey(lTagCardOpenScore)
			WebElement lElementCardOpenScore=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardOpenScore,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCardOpenScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScorePartnernameScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScorePartnernameScore='modal-Score-partnerName-score'
			String lLocatorModalScorePartnernameScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScorePartnernameScore)
			WebElement lElementModalScorePartnernameScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScorePartnernameScore)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementModalScorePartnernameScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScorePartnerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScorePartnerName='modal-Score-partner-name'
			String lLocatorModalScorePartnerName=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScorePartnerName)
			WebElement lElementModalScorePartnerName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScorePartnerName)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementModalScorePartnerName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreSuminsured(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreSuminsured='modal-Score-suminsured'
			String lLocatorModalScoreSuminsured=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreSuminsured)
			WebElement lElementModalScoreSuminsured=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreSuminsured)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreSuminsured)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreSuminsuredScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreSuminsuredScore='modal-Score-suminsured-score'
			String lLocatorModalScoreSuminsuredScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreSuminsuredScore)
			WebElement lElementModalScoreSuminsuredScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreSuminsuredScore)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreSuminsuredScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreExcess(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreExcess='modal-Score-excess'
			String lLocatorModalScoreExcess=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreExcess)
			WebElement lElementModalScoreExcess=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreExcess)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreExcess)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreExcessScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreExcessScore='modal-Score-excess-score'
			String lLocatorModalScoreExcessScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreExcessScore)
			WebElement lElementModalScoreExcessScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreExcessScore)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreExcessScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreGarage(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreGarage='modal-Score-garage'
			String lLocatorModalScoreGarage=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreGarage)
			WebElement lElementModalScoreGarage=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreGarage)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreGarage)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreGarageScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreGarageScore='modal-Score-garage-score'
			String lLocatorModalScoreGarageScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreGarageScore)
			WebElement lElementModalScoreGarageScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreGarageScore)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreGarageScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreDriver(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreDriver='modal-Score-driver'
			String lLocatorModalScoreDriver=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreDriver)
			WebElement lElementModalScoreDriver=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreDriver)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreDriver)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreDriverScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreDriverScore='modal-Score-driver-score'
			String lLocatorModalScoreDriverScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreDriverScore)
			WebElement lElementModalScoreDriverScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreDriverScore)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreDriverScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScoreProperty(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScoreProperty='modal-Score-property'
			String lLocatorModalScoreProperty=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScoreProperty)
			WebElement lElementModalScoreProperty=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScoreProperty)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScoreProperty)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalScorePropertyScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalScorePropertyScore='modal-Score-property-score'
			String lLocatorModalScorePropertyScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalScorePropertyScore)
			WebElement lElementModalScorePropertyScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalScorePropertyScore)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalScorePropertyScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPromotionText(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPromotionText='card-promotion-text'
			String lLocatorCardPromotionText=IGNUemaHelper.getTagDataSeleniumKey(lTagCardPromotionText)
			WebElement lElementCardPromotionText=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPromotionText,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPromotionText)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardInsurerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardInsurerName='card-insurer-name'
			String lLocatorCardInsurerName=IGNUemaHelper.getTagDataSeleniumKey(lTagCardInsurerName)
			WebElement lElementCardInsurerName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardInsurerName,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardInsurerName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPartnerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPartnerName='card-partner-name'
			String lLocatorCardPartnerName=IGNUemaHelper.getTagDataSeleniumKey(lTagCardPartnerName)
			WebElement lElementCardPartnerName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPartnerName,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPartnerName)
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
			String lTagCardPlanName='card-plan-name'
			String lLocatorCardPlanName=IGNUemaHelper.getTagDataSeleniumKey(lTagCardPlanName)
			WebElement lElementCardPlanName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPlanName,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPlanName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardPrice(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardPrice='card-price'
			String lLocatorCardPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagCardPrice)
			WebElement lElementCardPrice=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardPrice,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardPrice)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardBasicPremium(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardBasicPremium='card-full-price'
			String lLocatorCardBasicPremium=IGNUemaHelper.getTagDataSeleniumKey(lTagCardBasicPremium)
			WebElement lElementCardBasicPremium=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardBasicPremium,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardBasicPremium).trim()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDiscountAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDiscountAmount=''
			String lLocatorCardDiscountAmount='.premuiam-tag'
			WebElement lElementCardDiscountAmount=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardDiscountAmount,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardDiscountAmount).trim()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardExcess(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardExcess='card-excess'
			String lLocatorCardExcess=IGNUemaHelper.getTagDataSeleniumKey(lTagCardExcess)
			WebElement lElementCardExcess=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardExcess,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardExcess)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardSumInsure(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardSumInsure='card-suminsure'
			String lLocatorCardSumInsure=IGNUemaHelper.getTagDataSeleniumKey(lTagCardSumInsure)
			WebElement lElementCardSumInsure=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardSumInsure,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardSumInsure)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardProperty(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardProperty='card-property'
			String lLocatorCardProperty=IGNUemaHelper.getTagDataSeleniumKey(lTagCardProperty)
			WebElement lElementCardProperty=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardProperty,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardProperty)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardIsRoadside(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardIsRoadside='is-roadside'
			String lLocatorCardIsRoadside=IGNUemaHelper.getTagDataSeleniumKey(lTagCardIsRoadside)
			WebElement lElementCardIsRoadside=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardIsRoadside,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCardIsRoadside)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardIsOnlinePayment(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardIsOnlinePayment='is-online-payment'
			String lLocatorCardIsOnlinePayment=IGNUemaHelper.getTagDataSeleniumKey(lTagCardIsOnlinePayment)
			WebElement lElementCardIsOnlinePayment=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardIsOnlinePayment,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCardIsOnlinePayment)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardIsCompulsoryAvailable(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardIsCompulsoryAvailable='is-compulsory-available'
			String lLocatorCardIsCompulsoryAvailable=IGNUemaHelper.getTagDataSeleniumKey(lTagCardIsCompulsoryAvailable)
			WebElement lElementCardIsCompulsoryAvailable=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardIsCompulsoryAvailable,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCardIsCompulsoryAvailable)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardIsFlood(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardIsFlood='is-flood'
			String lLocatorCardIsFlood=IGNUemaHelper.getTagDataSeleniumKey(lTagCardIsFlood)
			WebElement lElementCardIsFlood=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardIsFlood,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCardIsFlood)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardGarage(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardGarage='card-garage'
			String lLocatorCardGarage=IGNUemaHelper.getTagDataSeleniumKey(lTagCardGarage)
			WebElement lElementCardGarage=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardGarage,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardGarage)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardDriver(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardDriver='card-driver'
			String lLocatorCardDriver=IGNUemaHelper.getTagDataSeleniumKey(lTagCardDriver)
			WebElement lElementCardDriver=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardDriver,true)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardDriver)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCardInstalmentPrice(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCardInstalmentPrice='card-instalment-price'
			String lLocatorCardInstalmentPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagCardInstalmentPrice)
			WebElement lElementCardInstalmentPrice=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCardInstalmentPrice,true)
			if(lElementCardInstalmentPrice){
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardInstalmentPrice).trim()
				WebElement lElementCardInstalmentPriceParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementCardInstalmentPrice)
				if(lElementCardInstalmentPriceParent){
					lText=IGNUemaHelper.concatMessageLeftRightByPipe(lText,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCardInstalmentPriceParent).trim())
				}
			}
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
			String lTagOutboundButtonName='outbound-btn'
			String lLocatorOutboundButtonName=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundButtonName)
			WebElement lElementOutboundButtonName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorOutboundButtonName,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOutboundButtonName)+'|'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementOutboundButtonName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailInsurerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailInsurerName='modal-detail-insurer-name'
			String lLocatorModalDetailInsurerName=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailInsurerName)
			WebElement lElementModalDetailInsurerName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailInsurerName)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailInsurerName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailPartnerName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailPartnerName='modal-detail-partner-name'
			String lLocatorModalDetailPartnerName=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailPartnerName)
			WebElement lElementModalDetailPartnerName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailPartnerName)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailPartnerName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailPrice(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailPrice='modal-detail-price'
			String lLocatorModalDetailPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailPrice)
			WebElement lElementModalDetailPrice=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailPrice)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailPrice)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailBasicPremium(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailBasicPremium='xxxxxx'
			String lLocatorModalDetailBasicPremium=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailBasicPremium)
			WebElement lElementModalDetailBasicPremium=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailBasicPremium)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailBasicPremium).trim()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailDiscountAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailDiscountAmount=''
			String lLocatorModalDetailDiscountAmount='.premuiam-tag'
			WebElement lElementModalDetailDiscountAmount=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorModalDetailDiscountAmount)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailDiscountAmount).trim()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailSuminsure(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailSuminsure='modal-detail-suminsure'
			String lLocatorModalDetailSuminsure=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailSuminsure)
			WebElement lElementModalDetailSuminsure=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailSuminsure)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailSuminsure)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailScore(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailScore='modal-detail-score'
			String lLocatorModalDetailScore=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailScore)
			WebElement lElementModalDetailScore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailScore)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailScore)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailPromotion(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailPromotion='modal-detail-promotion'
			String lLocatorModalDetailPromotion=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailPromotion)
			WebElement lElementModalDetailPromotion=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailPromotion)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailPromotion)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailExcess(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailExcess='modal-detail-excess'
			String lLocatorModalDetailExcess=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailExcess)
			WebElement lElementModalDetailExcess=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailExcess)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailExcess)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailGarage(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailGarage='modal-detail-garage'
			String lLocatorModalDetailGarage=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailGarage)
			WebElement lElementModalDetailGarage=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailGarage)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailGarage)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailDriver(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailDriver='modal-detail-driver'
			String lLocatorModalDetailDriver=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailDriver)
			WebElement lElementModalDetailDriver=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailDriver)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailDriver)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailFire(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailFire='modal-detail-fire'
			String lLocatorModalDetailFire=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailFire)
			WebElement lElementModalDetailFire=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailFire)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailFire)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailFlood(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailFlood='modal-detail-flood'
			String lLocatorModalDetailFlood=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailFlood)
			WebElement lElementModalDetailFlood=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailFlood)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailFlood)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailPersonal(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailPersonal='modal-detail-personal'
			String lLocatorModalDetailPersonal=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailPersonal)
			WebElement lElementModalDetailPersonal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailPersonal)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailPersonal)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailMedical(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailMedical='modal-detail-medical'
			String lLocatorModalDetailMedical=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailMedical)
			WebElement lElementModalDetailMedical=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailMedical)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailMedical)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailBail(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailBail='modal-detail-bail'
			String lLocatorModalDetailBail=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailBail)
			WebElement lElementModalDetailBail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailBail)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailBail)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailProperty(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailProperty='modal-detail-property'
			String lLocatorModalDetailProperty=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailProperty)
			WebElement lElementModalDetailProperty=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailProperty)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailProperty)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailDeath(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailDeath='modal-detail-death'
			String lLocatorModalDetailDeath=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailDeath)
			WebElement lElementModalDetailDeath=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailDeath)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailDeath)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputModalDetailMaxDeath(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagModalDetailMaxDeath='modal-detail-max-death'
			String lLocatorModalDetailMaxDeath=IGNUemaHelper.getTagDataSeleniumKey(lTagModalDetailMaxDeath)
			WebElement lElementModalDetailMaxDeath=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagModalDetailMaxDeath)
			lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementModalDetailMaxDeath)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}