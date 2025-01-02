package org.roojai.tha.types.motorcar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.kumka.insurecar.THAKumkaInsureCarResultType
import org.roojai.tha.types.kumka.insurecar.THAKumkaInsureCarResultUtilDesignA
import org.roojai.tha.types.kumka.insurecar.THAKumkaInsureCarResultUtilDesignB
public class THAMotorCarQuotationResultUtilOld{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lTHAKumkaInsureCarResultUtil=null
	private Boolean lIsChangedFromAnyToDealerWorkshop=false
	private Boolean lIsDealerWorkshop=false
	public THAMotorCarQuotationResultUtilOld(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean waitUntilKumkaPageLoaded(){
		Boolean lreturn=false
		try{
			Boolean lIsOK1=false
			Boolean lIsOK2=false
			String lTagFormLoading=''
			String lLocatorFormLoading=''
			lTagFormLoading='loading-div'
			lLocatorFormLoading=IGNUemaHelper.getTagDataSeleniumKey(lTagFormLoading)
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
				IGNUemaHelper.delayThreadSecond(1)
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			lIsOK1=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			if(!lIsOK1){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(3)
				}
				lIsOK1=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			}
			lLocatorFormLoading='#loading'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
				IGNUemaHelper.delayThreadSecond(1)
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			lIsOK2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			if(!lIsOK2){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(3)
				}
				lIsOK2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			}
			lreturn=lIsOK1&&lIsOK2
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
			}else{
				String lTagListOfCardResultList='card-display-plan'
				String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
				def lElementListOfCardResultList=[]
				def lElementOutboundOtherList=[]
				def lElementOutboundRoojaiList=[]
				Integer lOutputNumberOfCardsNum=0
				lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
				if(lElementListOfCardResultList){
					lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
				}
				if(lOutputNumberOfCardsNum>0){
					lreturn=true
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String checkOpportunityNumber(String strOpportunityNumber){
		String lreturn=''
		String lOpportunityNumber=strOpportunityNumber.trim()
		try{
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			String lInfoText=''
			WebElement lElementInfo=null
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			String lOpportunityNumberOld=lOpportunityNumber
			if(lOpportunityNumberOld.length()>0){
				for(Integer lIndex=1;lIndex<=15;lIndex++){
					lInfoTag=lTagOpportunityNumber
					lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
					lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
					if(!lElementInfo){
						IGNUemaHelper.delayThreadSecond(3)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
					}
					if(!lElementInfo){
						lIsOK=false
					}else{
						lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
						lOpportunityNumber=lInfoText
						lIsOK=lIsOK&&(lInfoText.length()>0)
					}
					if(!lIsOK){
						IGNUemaHelper.delayThreadSecond(3)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(lElementInfo){
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
					}
					lOpportunityNumber=lOpportunityNumber.trim()
					if(lOpportunityNumber.length()>0){
						if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}
				}
			}
			lreturn=lOpportunityNumber
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputResult(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lPrePackage=caseInput.PrePackage.toString().trim()
		String lPlanType=caseInput.PlanType.toString().trim()
		String lPlanGarage=caseInput.PlanGarage.toString().trim()
		String lPlanExcess=caseInput.PlanExcess.toString().trim()
		String lPlanDriver=caseInput.PlanDriver.toString().trim()
		String lCompulsory=caseInput.Compulsory.toString().trim()
		String lWithRsa=caseInput.WithRsa.toString().trim()
		String lVoluntaryTPBI=caseInput.VoluntaryTPBI.toString().trim()
		String lPersonalAccidentPaAndMe=caseInput.PersonalAccidentPaAndMe.toString().trim()
		String lPersonalAccidentPaOnly=caseInput.PersonalAccidentPaOnly.toString().trim()
		String lPersonalAccidentMeOnly=caseInput.PersonalAccidentMeOnly.toString().trim()
		String lAccessoryAdd=caseInput.AccessoryAdd.toString().trim()
		String lAccessoryCarryBoyAdd=caseInput.AccessoryCarryBoyAdd.toString().trim()
		String lAccessoryCarryBoyOption=caseInput.AccessoryCarryBoyOption.toString().trim()
		String lAccessoryGasFuelingSystemAdd=caseInput.AccessoryGasFuelingSystemAdd.toString().trim()
		String lAccessoryGasFuelingSystemOption=caseInput.AccessoryGasFuelingSystemOption.toString().trim()
		String lAccessoryBodyKitAdd=caseInput.AccessoryBodyKitAdd.toString().trim()
		String lAccessoryBodyKitOption=caseInput.AccessoryBodyKitOption.toString().trim()
		String lAccessoryRimsTiresAdd=caseInput.AccessoryRimsTiresAdd.toString().trim()
		String lAccessoryRimsTiresOption=caseInput.AccessoryRimsTiresOption.toString().trim()
		String lAccessorySolarFilmAdd=caseInput.AccessorySolarFilmAdd.toString().trim()
		String lAccessorySolarFilmOption=caseInput.AccessorySolarFilmOption.toString().trim()
		String lAccessorySuspensionStabilizerSystemAdd=caseInput.AccessorySuspensionStabilizerSystemAdd.toString().trim()
		String lAccessorySuspensionStabilizerSystemOption=caseInput.AccessorySuspensionStabilizerSystemOption.toString().trim()
		String lAccessoryInVehicleEntertainmentSystemAdd=caseInput.AccessoryInVehicleEntertainmentSystemAdd.toString().trim()
		String lAccessoryInVehicleEntertainmentSystemOption=caseInput.AccessoryInVehicleEntertainmentSystemOption.toString().trim()
		String lAccessoryAirIntakeExhaustSystemAdd=caseInput.AccessoryAirIntakeExhaustSystemAdd.toString().trim()
		String lAccessoryAirIntakeExhaustSystemOption=caseInput.AccessoryAirIntakeExhaustSystemOption.toString().trim()
		String lAccessoryCarCameraAdd=caseInput.AccessoryCarCameraAdd.toString().trim()
		String lAccessoryCarCameraOption=caseInput.AccessoryCarCameraOption.toString().trim()
		String lCarRentalService=caseInput.CarRentalService.toString().trim()
		String lQuoteBy=caseInput.QuoteBy.toString().trim()
		String lQuotePhoneNo=caseInput.QuotePhoneNo.toString().trim()
		String lQuoteEmail=caseInput.QuoteEmail.toString().trim()
		String lQuoteNewsletter=caseInput.QuoteNewsletter.toString().trim()
		String lQuoteCallMeNow=caseInput.QuoteCallMeNow.toString().trim()
		String lQuotePDFDownloadToDo=caseInput.QuotePDFDownloadToDo.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lExpectedKumkaCompareButton=caseInput.ExpectedKumkaCompareButton.toString().trim()
		String lKumkaCompareToDo=caseInput.KumkaCompareToDo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lKumkaDefaultSaveQuoteId=''
		String lKumkaOutboundCardNumber=''
		String lPrePackagePremiumYearly=''
		String lPrePackagePremiumDeposit=''
		String lPrePackagePremiumMonthly=''
		String lPrePackagePremiumInstalment=''
		String lPrePackagePremiumNoDepositAmount=''
		String lPrePackagePremiumNoDepositTotal=''
		String lPrePackagePremiumQuarterlyAmount=''
		String lPrePackagePremiumQuarterlyTotal=''
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		String lPolicyInsurer=''
		String lAccessoryAmount=''
		String lAccessoryDetail=''
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		String lAutomationPageValue=''
		String lAutomationPageText=''
		String lAutomationVersionValue=''
		String lAutomationVersionText=''
		String lAutomationOpportunityNumberValue=''
		String lAutomationOpportunityNumberText=''
		String lAutomationVehicleDetailValue=''
		String lAutomationVehicleDetailText=''
		String lAutomationPremiumYearlyValue=''
		String lAutomationPremiumYearlyText=''
		String lAutomationPremiumDepositValue=''
		String lAutomationPremiumDepositText=''
		String lAutomationPremiumMonthlyValue=''
		String lAutomationPremiumMonthlyText=''
		String lAutomationPremiumInstalmentValue=''
		String lAutomationPremiumInstalmentText=''
		String lAutomationPremiumNoDepositAmountValue=''
		String lAutomationPremiumNoDepositAmountText=''
		String lAutomationPremiumNoDepositTotalValue=''
		String lAutomationPremiumNoDepositTotalText=''
		String lAutomationPremiumQuarterlyAmountValue=''
		String lAutomationPremiumQuarterlyAmountText=''
		String lAutomationPremiumQuarterlyTotalValue=''
		String lAutomationPremiumQuarterlyTotalText=''
		String lAutomationPlanTypeValue=''
		String lAutomationPlanTypeText=''
		String lAutomationSumInsuredValue=''
		String lAutomationSumInsuredText=''
		String lAutomationWorkshopValue=''
		String lAutomationWorkshopText=''
		String lAutomationExcessPriceValue=''
		String lAutomationExcessPriceText=''
		String lAutomationDriverPlanValue=''
		String lAutomationDriverPlanText=''
		String lAutomationTpbiValue=''
		String lAutomationTpbiText=''
		String lAutomationTppdValue=''
		String lAutomationTppdText=''
		String lAutomationPaAndMeValue=''
		String lAutomationPaAndMeText=''
		String lAutomationPaOnlyValue=''
		String lAutomationPaOnlyText=''
		String lAutomationMeOnlyValue=''
		String lAutomationMeOnlyText=''
		String lAutomationCompulsoryValue=''
		String lAutomationCompulsoryText=''
		String lAutomationRsaValue=''
		String lAutomationRsaText=''
		String lAutomationCarReplacementServiceValue=''
		String lAutomationCarReplacementServiceText=''
		String lAutomationAccessoryItem01Value=''
		String lAutomationAccessoryItem01Text=''
		String lAutomationAccessoryItem02Value=''
		String lAutomationAccessoryItem02Text=''
		String lAutomationAccessoryItem03Value=''
		String lAutomationAccessoryItem03Text=''
		String lAutomationAccessoryItem04Value=''
		String lAutomationAccessoryItem04Text=''
		String lAutomationAccessoryItem05Value=''
		String lAutomationAccessoryItem05Text=''
		String lAutomationAccessoryItem06Value=''
		String lAutomationAccessoryItem06Text=''
		String lAutomationAccessoryItem07Value=''
		String lAutomationAccessoryItem07Text=''
		String lAutomationAccessoryItem08Value=''
		String lAutomationAccessoryItem08Text=''
		String lAutomationAccessoryItem09Value=''
		String lAutomationAccessoryItem09Text=''
		String lAutomationAccessoryItem10Value=''
		String lAutomationAccessoryItem10Text=''
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
			Map lMapPrePackage=this.inputPrePackage(lPrePackage)
			if(!lMapPrePackage.Result){
				lPrePackage=''
				lPrePackagePremiumYearly=''
				lPrePackagePremiumDeposit=''
				lPrePackagePremiumMonthly=''
				lPrePackagePremiumInstalment=''
				lPrePackagePremiumNoDepositAmount=''
				lPrePackagePremiumNoDepositTotal=''
				lPrePackagePremiumQuarterlyAmount=''
				lPrePackagePremiumQuarterlyTotal=''
			}else{
				lPrePackage=lMapPrePackage.PrePackage
				lPrePackagePremiumYearly=lMapPrePackage.PrePackagePremiumYearly
				lPrePackagePremiumDeposit=lMapPrePackage.PrePackagePremiumDeposit
				lPrePackagePremiumMonthly=lMapPrePackage.PrePackagePremiumMonthly
				lPrePackagePremiumInstalment=lMapPrePackage.PrePackagePremiumInstalment
				lPrePackagePremiumNoDepositAmount=lMapPrePackage.PrePackagePremiumNoDepositAmount
				lPrePackagePremiumNoDepositTotal=lMapPrePackage.PrePackagePremiumNoDepositTotal
				lPrePackagePremiumQuarterlyAmount=lMapPrePackage.PrePackagePremiumQuarterlyAmount
				lPrePackagePremiumQuarterlyTotal=lMapPrePackage.PrePackagePremiumQuarterlyTotal
			}
			caseOutput.PrePackage=lPrePackage
			caseOutput.PrePackagePremiumYearly=lPrePackagePremiumYearly
			caseOutput.PrePackagePremiumDeposit=lPrePackagePremiumDeposit
			caseOutput.PrePackagePremiumMonthly=lPrePackagePremiumMonthly
			caseOutput.PrePackagePremiumInstalment=lPrePackagePremiumInstalment
			caseOutput.PrePackagePremiumNoDepositAmount=lPrePackagePremiumNoDepositAmount
			caseOutput.PrePackagePremiumNoDepositTotal=lPrePackagePremiumNoDepositTotal
			caseOutput.PrePackagePremiumQuarterlyAmount=lPrePackagePremiumQuarterlyAmount
			caseOutput.PrePackagePremiumQuarterlyTotal=lPrePackagePremiumQuarterlyTotal
			if(lPrePackage.length()<=0){
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
				if(IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()<=0){
					lElementABTesting=null
					String lTagAutomation='Automation'
					String lLocatorAutomation=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomation)
					List<WebElement> lElementAutomation=IGNUemaHelper.getWebElementListFromDataSeleniumKey(driver,lTagAutomation)
					lElementABTesting=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(driver,lElementAutomation[0],lTagABTesting)
					IGNUemaHelper.CURRENT_AB_TESTING_VERSION=IGNUemaHelper.getDataSeleniumValueWebElement(driver,lElementABTesting).trim().toUpperCase()
				}
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>0
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					IGNUemaHelper.printLog('IGNUemaHelper.CURRENT_AB_TESTING_VERSION='+IGNUemaHelper.CURRENT_AB_TESTING_VERSION)
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				String lTagButtonCustomizePlan='btn-customize-plan'
				String lLocatorButtonCustomizePlan=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCustomizePlan)
				WebElement lElementButtonCustomizePlan=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCustomizePlan)
				if(lElementButtonCustomizePlan){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonCustomizePlan)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCustomizePlan)
				}
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						break
					case 'B':
						break
					case 'C':
						break
					case 'D':
						break
					case 'E':
						break
					case 'F':
						break
					default:
						return lreturn
						break
				}
			}
			Map lMapPostPrePackage=this.inputPostPrePackage()
			if(!lMapPostPrePackage.Result){
				lPostPrePackagePremiumYearly=''
				lPostPrePackagePremiumDeposit=''
				lPostPrePackagePremiumMonthly=''
				lPostPrePackagePremiumInstalment=''
				lPostPrePackagePremiumNoDepositAmount=''
				lPostPrePackagePremiumNoDepositTotal=''
				lPostPrePackagePremiumQuarterlyAmount=''
				lPostPrePackagePremiumQuarterlyTotal=''
			}else{
				lPostPrePackagePremiumYearly=lMapPostPrePackage.PostPrePackagePremiumYearly
				lPostPrePackagePremiumDeposit=lMapPostPrePackage.PostPrePackagePremiumDeposit
				lPostPrePackagePremiumMonthly=lMapPostPrePackage.PostPrePackagePremiumMonthly
				lPostPrePackagePremiumInstalment=lMapPostPrePackage.PostPrePackagePremiumInstalment
				lPostPrePackagePremiumNoDepositAmount=lMapPostPrePackage.PostPrePackagePremiumNoDepositAmount
				lPostPrePackagePremiumNoDepositTotal=lMapPostPrePackage.PostPrePackagePremiumNoDepositTotal
				lPostPrePackagePremiumQuarterlyAmount=lMapPostPrePackage.PostPrePackagePremiumQuarterlyAmount
				lPostPrePackagePremiumQuarterlyTotal=lMapPostPrePackage.PostPrePackagePremiumQuarterlyTotal
			}
			caseOutput.PostPrePackagePremiumYearly=lPostPrePackagePremiumYearly
			caseOutput.PostPrePackagePremiumDeposit=lPostPrePackagePremiumDeposit
			caseOutput.PostPrePackagePremiumMonthly=lPostPrePackagePremiumMonthly
			caseOutput.PostPrePackagePremiumInstalment=lPostPrePackagePremiumInstalment
			caseOutput.PostPrePackagePremiumNoDepositAmount=lPostPrePackagePremiumNoDepositAmount
			caseOutput.PostPrePackagePremiumNoDepositTotal=lPostPrePackagePremiumNoDepositTotal
			caseOutput.PostPrePackagePremiumQuarterlyAmount=lPostPrePackagePremiumQuarterlyAmount
			caseOutput.PostPrePackagePremiumQuarterlyTotal=lPostPrePackagePremiumQuarterlyTotal
			if(lPostPrePackagePremiumYearly.length()<=0){
				return lreturn
			}
			Map lMapExpectedKumkaCompareButton=[:]
			this.inputExpectedKumkaCompareButtonInputOutput(lMapExpectedKumkaCompareButton)
			lMapExpectedKumkaCompareButton.ExpectedKumkaCompareButton=lExpectedKumkaCompareButton
			lMapExpectedKumkaCompareButton.KumkaCompareToDo=lKumkaCompareToDo
			Boolean lIsExpectedKumkaCompareButton=this.inputExpectedKumkaCompareButton(lMapExpectedKumkaCompareButton)
			lExpectedKumkaCompareButton=lMapExpectedKumkaCompareButton.ExpectedKumkaCompareButton
			lKumkaCompareToDo=lMapExpectedKumkaCompareButton.KumkaCompareToDo
			caseOutput.ExpectedKumkaCompareButton=lExpectedKumkaCompareButton
			caseOutput.KumkaCompareToDo=lKumkaCompareToDo
			caseOutput.KumkaDefaultSaveQuoteId=lKumkaDefaultSaveQuoteId
			caseOutput.KumkaOutboundCardNumber=lKumkaOutboundCardNumber
			if(!lIsExpectedKumkaCompareButton){
				return lreturn
			}
			Boolean lIsVisibleMrKumkaCompareButton=IGNUemaHelper.convertStringToBoolean(lExpectedKumkaCompareButton)
			if(lIsVisibleMrKumkaCompareButton){
				Boolean lIsKumkaCompareToDo=IGNUemaHelper.convertStringToBoolean(lKumkaCompareToDo)
				if(lIsKumkaCompareToDo){
					Map lMapKumkaCompareNowInputOutput=[:]
					this.inputInitKumkaCompareNowInputOutput(lMapKumkaCompareNowInputOutput)
					lMapKumkaCompareNowInputOutput.KumkaCompareToDo=lKumkaCompareToDo
					lMapKumkaCompareNowInputOutput.KumkaDefaultSaveQuoteId=lKumkaDefaultSaveQuoteId
					lMapKumkaCompareNowInputOutput.KumkaOutboundCardNumber=lKumkaOutboundCardNumber
					Boolean lIsKumkaCompareNowResult=false
					if(THAMotorCarCoreType.CURRENT_QUOTATION_KUMKA_LOW_CONVERSION_COMPARE_PLAN){
						lIsKumkaCompareNowResult=this.inputKumkaCompareNowV1(lLanguage,lQuoteEmail,'Yes',lQuotePhoneNo,lMapKumkaCompareNowInputOutput)
					}else{
						lIsKumkaCompareNowResult=this.inputKumkaCompareNowV2(lLanguage,lQuoteEmail,'Yes',lQuotePhoneNo,lMapKumkaCompareNowInputOutput)
					}
					lKumkaCompareToDo=lMapKumkaCompareNowInputOutput.KumkaCompareToDo
					lKumkaDefaultSaveQuoteId=lMapKumkaCompareNowInputOutput.KumkaDefaultSaveQuoteId
					lKumkaOutboundCardNumber=lMapKumkaCompareNowInputOutput.KumkaOutboundCardNumber
					caseOutput.KumkaCompareToDo=lKumkaCompareToDo
					caseOutput.KumkaDefaultSaveQuoteId=lKumkaDefaultSaveQuoteId
					caseOutput.KumkaOutboundCardNumber=lKumkaOutboundCardNumber
					if(!lIsKumkaCompareNowResult){
						return lreturn
					}
				}
			}
			Map lMapPlanType=this.inputPlanType(lPlanType)
			if(!lMapPlanType.Result){
				lPlanType=''
			}else{
				lPlanType=lMapPlanType.PlanType
			}
			caseOutput.PlanType=lPlanType
			if(lPlanType.length()<=0){
				return lreturn
			}
			Map lMapPlanGarage=this.inputPlanGarage(lPlanGarage)
			if(!lMapPlanGarage.Result){
				lPlanGarage=''
			}else{
				lPlanGarage=lMapPlanGarage.PlanGarage
			}
			caseOutput.PlanGarage=lPlanGarage
			if(lPlanGarage.length()<=0){
				return lreturn
			}
			Map lMapPlanExcess=this.inputPlanExcess(lPlanExcess)
			if(!lMapPlanExcess.Result){
				lPlanExcess=''
			}else{
				lPlanExcess=lMapPlanExcess.PlanExcess
			}
			caseOutput.PlanExcess=lPlanExcess
			if(lPlanExcess.length()<=0){
				return lreturn
			}
			Map lMapPlanDriver=this.inputPlanDriver(lPlanDriver)
			if(!lMapPlanDriver.Result){
				lPlanDriver=''
			}else{
				lPlanDriver=lMapPlanDriver.PlanDriver
			}
			caseOutput.PlanDriver=lPlanDriver
			if(lPlanDriver.length()<=0){
				return lreturn
			}
			Map lMapCompulsory=this.inputCompulsory(lCompulsory)
			if(!lMapCompulsory.Result){
				lCompulsory=''
			}else{
				lCompulsory=lMapCompulsory.Compulsory
			}
			caseOutput.Compulsory=lCompulsory
			if(lCompulsory.length()<=0){
				return lreturn
			}
			Map lMapWithRsa=this.inputWithRsa(lWithRsa)
			if(!lMapWithRsa.Result){
				lWithRsa=''
			}else{
				lWithRsa=lMapWithRsa.WithRsa
			}
			caseOutput.WithRsa=lWithRsa
			if(lWithRsa.length()<=0){
				return lreturn
			}
			Map lMapVoluntaryTPBI=this.inputVoluntaryTPBI(lVoluntaryTPBI)
			if(!lMapVoluntaryTPBI.Result){
				lVoluntaryTPBI=''
			}else{
				lVoluntaryTPBI=lMapVoluntaryTPBI.VoluntaryTPBI
			}
			caseOutput.VoluntaryTPBI=lVoluntaryTPBI
			if(lVoluntaryTPBI.length()<=0){
				return lreturn
			}
			Map lMapPersonalAccidentPaAndMe=this.inputPersonalAccidentPaAndMe(lPersonalAccidentPaAndMe)
			if(!lMapPersonalAccidentPaAndMe.Result){
				lPersonalAccidentPaAndMe=''
			}else{
				lPersonalAccidentPaAndMe=lMapPersonalAccidentPaAndMe.PersonalAccidentPaAndMe
			}
			caseOutput.PersonalAccidentPaAndMe=lPersonalAccidentPaAndMe
			if(lPersonalAccidentPaAndMe.length()<=0){
				return lreturn
			}
			Map lMapPersonalAccidentPaOnly=this.inputPersonalAccidentPaOnly(lPersonalAccidentPaOnly)
			if(!lMapPersonalAccidentPaOnly.Result){
				lPersonalAccidentPaOnly=''
			}else{
				lPersonalAccidentPaOnly=lMapPersonalAccidentPaOnly.PersonalAccidentPaOnly
			}
			caseOutput.PersonalAccidentPaOnly=lPersonalAccidentPaOnly
			if(lPersonalAccidentPaOnly.length()<=0){
				return lreturn
			}
			Map lMapPersonalAccidentMeOnly=this.inputPersonalAccidentMeOnly(lPersonalAccidentMeOnly)
			if(!lMapPersonalAccidentMeOnly.Result){
				lPersonalAccidentMeOnly=''
			}else{
				lPersonalAccidentMeOnly=lMapPersonalAccidentMeOnly.PersonalAccidentMeOnly
			}
			caseOutput.PersonalAccidentMeOnly=lPersonalAccidentMeOnly
			if(lPersonalAccidentMeOnly.length()<=0){
				return lreturn
			}
			Map lMapCarRentalService=this.inputCarRentalService(lCarRentalService)
			if(!lMapCarRentalService.Result){
				lCarRentalService=''
			}else{
				lCarRentalService=lMapCarRentalService.CarRentalService
			}
			caseOutput.CarRentalService=lCarRentalService
			if(lCarRentalService.length()<=0){
				return lreturn
			}
			Map lMapAccessoryAdd=this.inputAccessoryAdd(lAccessoryAdd,lAccessoryCarryBoyAdd,lAccessoryCarryBoyOption,lAccessoryGasFuelingSystemAdd,lAccessoryGasFuelingSystemOption,lAccessoryBodyKitAdd,lAccessoryBodyKitOption,lAccessoryRimsTiresAdd,lAccessoryRimsTiresOption,lAccessorySolarFilmAdd,lAccessorySolarFilmOption,lAccessorySuspensionStabilizerSystemAdd,lAccessorySuspensionStabilizerSystemOption,lAccessoryInVehicleEntertainmentSystemAdd,lAccessoryInVehicleEntertainmentSystemOption,lAccessoryAirIntakeExhaustSystemAdd,lAccessoryAirIntakeExhaustSystemOption,lAccessoryCarCameraAdd,lAccessoryCarCameraOption)
			if(!lMapAccessoryAdd.Result){
				lAccessoryAdd=''
				lAccessoryCarryBoyAdd=''
				lAccessoryCarryBoyOption=''
				lAccessoryGasFuelingSystemAdd=''
				lAccessoryGasFuelingSystemOption=''
				lAccessoryBodyKitAdd=''
				lAccessoryBodyKitOption=''
				lAccessoryRimsTiresAdd=''
				lAccessoryRimsTiresOption=''
				lAccessorySolarFilmAdd=''
				lAccessorySolarFilmOption=''
				lAccessorySuspensionStabilizerSystemAdd=''
				lAccessorySuspensionStabilizerSystemOption=''
				lAccessoryInVehicleEntertainmentSystemAdd=''
				lAccessoryInVehicleEntertainmentSystemOption=''
				lAccessoryAirIntakeExhaustSystemAdd=''
				lAccessoryAirIntakeExhaustSystemOption=''
				lAccessoryCarCameraAdd=''
				lAccessoryCarCameraOption=''
				lAccessoryAmount=''
				lAccessoryDetail=''
			}else{
				lAccessoryAdd=lMapAccessoryAdd.AccessoryAdd
				lAccessoryCarryBoyAdd=lMapAccessoryAdd.AccessoryCarryBoyAdd
				lAccessoryCarryBoyOption=lMapAccessoryAdd.AccessoryCarryBoyOption
				lAccessoryGasFuelingSystemAdd=lMapAccessoryAdd.AccessoryGasFuelingSystemAdd
				lAccessoryGasFuelingSystemOption=lMapAccessoryAdd.AccessoryGasFuelingSystemOption
				lAccessoryBodyKitAdd=lMapAccessoryAdd.AccessoryBodyKitAdd
				lAccessoryBodyKitOption=lMapAccessoryAdd.AccessoryBodyKitOption
				lAccessoryRimsTiresAdd=lMapAccessoryAdd.AccessoryRimsTiresAdd
				lAccessoryRimsTiresOption=lMapAccessoryAdd.AccessoryRimsTiresOption
				lAccessorySolarFilmAdd=lMapAccessoryAdd.AccessorySolarFilmAdd
				lAccessorySolarFilmOption=lMapAccessoryAdd.AccessorySolarFilmOption
				lAccessorySuspensionStabilizerSystemAdd=lMapAccessoryAdd.AccessorySuspensionStabilizerSystemAdd
				lAccessorySuspensionStabilizerSystemOption=lMapAccessoryAdd.AccessorySuspensionStabilizerSystemOption
				lAccessoryInVehicleEntertainmentSystemAdd=lMapAccessoryAdd.AccessoryInVehicleEntertainmentSystemAdd
				lAccessoryInVehicleEntertainmentSystemOption=lMapAccessoryAdd.AccessoryInVehicleEntertainmentSystemOption
				lAccessoryAirIntakeExhaustSystemAdd=lMapAccessoryAdd.AccessoryAirIntakeExhaustSystemAdd
				lAccessoryAirIntakeExhaustSystemOption=lMapAccessoryAdd.AccessoryAirIntakeExhaustSystemOption
				lAccessoryCarCameraAdd=lMapAccessoryAdd.AccessoryCarCameraAdd
				lAccessoryCarCameraOption=lMapAccessoryAdd.AccessoryCarCameraOption
				lAccessoryAmount=lMapAccessoryAdd.AccessoryAmount
				lAccessoryDetail=lMapAccessoryAdd.AccessoryDetail
			}
			caseOutput.AccessoryAdd=lAccessoryAdd
			caseOutput.AccessoryCarryBoyAdd=lAccessoryCarryBoyAdd
			caseOutput.AccessoryCarryBoyOption=lAccessoryCarryBoyOption
			caseOutput.AccessoryGasFuelingSystemAdd=lAccessoryGasFuelingSystemAdd
			caseOutput.AccessoryGasFuelingSystemOption=lAccessoryGasFuelingSystemOption
			caseOutput.AccessoryBodyKitAdd=lAccessoryBodyKitAdd
			caseOutput.AccessoryBodyKitOption=lAccessoryBodyKitOption
			caseOutput.AccessoryRimsTiresAdd=lAccessoryRimsTiresAdd
			caseOutput.AccessoryRimsTiresOption=lAccessoryRimsTiresOption
			caseOutput.AccessorySolarFilmAdd=lAccessorySolarFilmAdd
			caseOutput.AccessorySolarFilmOption=lAccessorySolarFilmOption
			caseOutput.AccessorySuspensionStabilizerSystemAdd=lAccessorySuspensionStabilizerSystemAdd
			caseOutput.AccessorySuspensionStabilizerSystemOption=lAccessorySuspensionStabilizerSystemOption
			caseOutput.AccessoryInVehicleEntertainmentSystemAdd=lAccessoryInVehicleEntertainmentSystemAdd
			caseOutput.AccessoryInVehicleEntertainmentSystemOption=lAccessoryInVehicleEntertainmentSystemOption
			caseOutput.AccessoryAirIntakeExhaustSystemAdd=lAccessoryAirIntakeExhaustSystemAdd
			caseOutput.AccessoryAirIntakeExhaustSystemOption=lAccessoryAirIntakeExhaustSystemOption
			caseOutput.AccessoryCarCameraAdd=lAccessoryCarCameraAdd
			caseOutput.AccessoryCarCameraOption=lAccessoryCarCameraOption
			caseOutput.AccessoryAmount=lAccessoryAmount
			caseOutput.AccessoryDetail=lAccessoryDetail
			if(!lMapAccessoryAdd.Result){
				return lreturn
			}
			Map lMapQuoteMe=this.inputQuoteMe(lQuoteBy,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
			if(!lMapQuoteMe.Result){
				lQuoteBy=''
				lQuotePhoneNo=''
				lQuoteEmail=''
				lQuoteNewsletter=''
				lQuoteCallMeNow=''
				lQuotePDFDownloadToDo=''
				lQuotePDFDownloadDetail=''
				lQuotePDFDownloadResult=''
			}else{
				lQuoteBy=lMapQuoteMe.QuoteBy
				lQuotePhoneNo=lMapQuoteMe.QuotePhoneNo
				lQuoteEmail=lMapQuoteMe.QuoteEmail
				lQuoteNewsletter=lMapQuoteMe.QuoteNewsletter
				lQuoteCallMeNow=lMapQuoteMe.QuoteCallMeNow
				lQuotePDFDownloadToDo=lMapQuoteMe.QuotePDFDownloadToDo
				lQuotePDFDownloadDetail=lMapQuoteMe.QuotePDFDownloadDetail
				lQuotePDFDownloadResult=lMapQuoteMe.QuotePDFDownloadResult
			}
			caseOutput.QuoteBy=lQuoteBy
			caseOutput.QuotePhoneNo=lQuotePhoneNo
			caseOutput.QuoteEmail=lQuoteEmail
			caseOutput.QuoteNewsletter=lQuoteNewsletter
			caseOutput.QuoteCallMeNow=lQuoteCallMeNow
			caseOutput.QuotePDFDownloadToDo=lQuotePDFDownloadToDo
			caseOutput.QuotePDFDownloadDetail=lQuotePDFDownloadDetail
			caseOutput.QuotePDFDownloadResult=lQuotePDFDownloadResult
			if(lQuoteBy.length()<=0){
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
			Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
			if(!lMapAutomationDataBefore.Result){
				lAutomationPageValue=''
				lAutomationPageText=''
				lAutomationVersionValue=''
				lAutomationVersionText=''
				lAutomationOpportunityNumberValue=''
				lAutomationOpportunityNumberText=''
				lAutomationVehicleDetailValue=''
				lAutomationVehicleDetailText=''
				lAutomationPremiumYearlyValue=''
				lAutomationPremiumYearlyText=''
				lAutomationPremiumDepositValue=''
				lAutomationPremiumDepositText=''
				lAutomationPremiumMonthlyValue=''
				lAutomationPremiumMonthlyText=''
				lAutomationPremiumInstalmentValue=''
				lAutomationPremiumInstalmentText=''
				lAutomationPremiumNoDepositAmountValue=''
				lAutomationPremiumNoDepositAmountText=''
				lAutomationPremiumNoDepositTotalValue=''
				lAutomationPremiumNoDepositTotalText=''
				lAutomationPremiumQuarterlyAmountValue=''
				lAutomationPremiumQuarterlyAmountText=''
				lAutomationPremiumQuarterlyTotalValue=''
				lAutomationPremiumQuarterlyTotalText=''
				lAutomationPlanTypeValue=''
				lAutomationPlanTypeText=''
				lAutomationSumInsuredValue=''
				lAutomationSumInsuredText=''
				lAutomationWorkshopValue=''
				lAutomationWorkshopText=''
				lAutomationExcessPriceValue=''
				lAutomationExcessPriceText=''
				lAutomationDriverPlanValue=''
				lAutomationDriverPlanText=''
				lAutomationTpbiValue=''
				lAutomationTpbiText=''
				lAutomationTppdValue=''
				lAutomationTppdText=''
				lAutomationPaAndMeValue=''
				lAutomationPaAndMeText=''
				lAutomationPaOnlyValue=''
				lAutomationPaOnlyText=''
				lAutomationMeOnlyValue=''
				lAutomationMeOnlyText=''
				lAutomationCompulsoryValue=''
				lAutomationCompulsoryText=''
				lAutomationRsaValue=''
				lAutomationRsaText=''
				lAutomationCarReplacementServiceValue=''
				lAutomationCarReplacementServiceText=''
				lAutomationAccessoryItem01Value=''
				lAutomationAccessoryItem01Text=''
				lAutomationAccessoryItem02Value=''
				lAutomationAccessoryItem02Text=''
				lAutomationAccessoryItem03Value=''
				lAutomationAccessoryItem03Text=''
				lAutomationAccessoryItem04Value=''
				lAutomationAccessoryItem04Text=''
				lAutomationAccessoryItem05Value=''
				lAutomationAccessoryItem05Text=''
				lAutomationAccessoryItem06Value=''
				lAutomationAccessoryItem06Text=''
				lAutomationAccessoryItem07Value=''
				lAutomationAccessoryItem07Text=''
				lAutomationAccessoryItem08Value=''
				lAutomationAccessoryItem08Text=''
				lAutomationAccessoryItem09Value=''
				lAutomationAccessoryItem09Text=''
				lAutomationAccessoryItem10Value=''
				lAutomationAccessoryItem10Text=''
			}else{
				lAutomationPageValue=lMapAutomationDataBefore.AutomationPageValue
				lAutomationPageText=lMapAutomationDataBefore.AutomationPageText
				lAutomationVersionValue=lMapAutomationDataBefore.AutomationVersionValue
				lAutomationVersionText=lMapAutomationDataBefore.AutomationVersionText
				lAutomationOpportunityNumberValue=lMapAutomationDataBefore.AutomationOpportunityNumberValue
				lAutomationOpportunityNumberText=lMapAutomationDataBefore.AutomationOpportunityNumberText
				lAutomationVehicleDetailValue=lMapAutomationDataBefore.AutomationVehicleDetailValue
				lAutomationVehicleDetailText=lMapAutomationDataBefore.AutomationVehicleDetailText
				lAutomationPremiumYearlyValue=lMapAutomationDataBefore.AutomationPremiumYearlyValue
				lAutomationPremiumYearlyText=lMapAutomationDataBefore.AutomationPremiumYearlyText
				lAutomationPremiumDepositValue=lMapAutomationDataBefore.AutomationPremiumDepositValue
				lAutomationPremiumDepositText=lMapAutomationDataBefore.AutomationPremiumDepositText
				lAutomationPremiumMonthlyValue=lMapAutomationDataBefore.AutomationPremiumMonthlyValue
				lAutomationPremiumMonthlyText=lMapAutomationDataBefore.AutomationPremiumMonthlyText
				lAutomationPremiumInstalmentValue=lMapAutomationDataBefore.AutomationPremiumInstalmentValue
				lAutomationPremiumInstalmentText=lMapAutomationDataBefore.AutomationPremiumInstalmentText
				lAutomationPremiumNoDepositAmountValue=lMapAutomationDataBefore.AutomationPremiumNoDepositAmountValue
				lAutomationPremiumNoDepositAmountText=lMapAutomationDataBefore.AutomationPremiumNoDepositAmountText
				lAutomationPremiumNoDepositTotalValue=lMapAutomationDataBefore.AutomationPremiumNoDepositTotalValue
				lAutomationPremiumNoDepositTotalText=lMapAutomationDataBefore.AutomationPremiumNoDepositTotalText
				lAutomationPremiumQuarterlyAmountValue=lMapAutomationDataBefore.AutomationPremiumQuarterlyAmountValue
				lAutomationPremiumQuarterlyAmountText=lMapAutomationDataBefore.AutomationPremiumQuarterlyAmountText
				lAutomationPremiumQuarterlyTotalValue=lMapAutomationDataBefore.AutomationPremiumQuarterlyTotalValue
				lAutomationPremiumQuarterlyTotalText=lMapAutomationDataBefore.AutomationPremiumQuarterlyTotalText
				lAutomationPlanTypeValue=lMapAutomationDataBefore.AutomationPlanTypeValue
				lAutomationPlanTypeText=lMapAutomationDataBefore.AutomationPlanTypeText
				lAutomationSumInsuredValue=lMapAutomationDataBefore.AutomationSumInsuredValue
				lAutomationSumInsuredText=lMapAutomationDataBefore.AutomationSumInsuredText
				lAutomationWorkshopValue=lMapAutomationDataBefore.AutomationWorkshopValue
				lAutomationWorkshopText=lMapAutomationDataBefore.AutomationWorkshopText
				lAutomationExcessPriceValue=lMapAutomationDataBefore.AutomationExcessPriceValue
				lAutomationExcessPriceText=lMapAutomationDataBefore.AutomationExcessPriceText
				lAutomationDriverPlanValue=lMapAutomationDataBefore.AutomationDriverPlanValue
				lAutomationDriverPlanText=lMapAutomationDataBefore.AutomationDriverPlanText
				lAutomationTpbiValue=lMapAutomationDataBefore.AutomationTpbiValue
				lAutomationTpbiText=lMapAutomationDataBefore.AutomationTpbiText
				lAutomationTppdValue=lMapAutomationDataBefore.AutomationTppdValue
				lAutomationTppdText=lMapAutomationDataBefore.AutomationTppdText
				lAutomationPaAndMeValue=lMapAutomationDataBefore.AutomationPaAndMeValue
				lAutomationPaAndMeText=lMapAutomationDataBefore.AutomationPaAndMeText
				lAutomationPaOnlyValue=lMapAutomationDataBefore.AutomationPaOnlyValue
				lAutomationPaOnlyText=lMapAutomationDataBefore.AutomationPaOnlyText
				lAutomationMeOnlyValue=lMapAutomationDataBefore.AutomationMeOnlyValue
				lAutomationMeOnlyText=lMapAutomationDataBefore.AutomationMeOnlyText
				lAutomationCompulsoryValue=lMapAutomationDataBefore.AutomationCompulsoryValue
				lAutomationCompulsoryText=lMapAutomationDataBefore.AutomationCompulsoryText
				lAutomationRsaValue=lMapAutomationDataBefore.AutomationRsaValue
				lAutomationRsaText=lMapAutomationDataBefore.AutomationRsaText
				lAutomationCarReplacementServiceValue=lMapAutomationDataBefore.AutomationCarReplacementServiceValue
				lAutomationCarReplacementServiceText=lMapAutomationDataBefore.AutomationCarReplacementServiceText
				lAutomationAccessoryItem01Value=lMapAutomationDataBefore.AutomationAccessoryItem01Value
				lAutomationAccessoryItem01Text=lMapAutomationDataBefore.AutomationAccessoryItem01Text
				lAutomationAccessoryItem02Value=lMapAutomationDataBefore.AutomationAccessoryItem02Value
				lAutomationAccessoryItem02Text=lMapAutomationDataBefore.AutomationAccessoryItem02Text
				lAutomationAccessoryItem03Value=lMapAutomationDataBefore.AutomationAccessoryItem03Value
				lAutomationAccessoryItem03Text=lMapAutomationDataBefore.AutomationAccessoryItem03Text
				lAutomationAccessoryItem04Value=lMapAutomationDataBefore.AutomationAccessoryItem04Value
				lAutomationAccessoryItem04Text=lMapAutomationDataBefore.AutomationAccessoryItem04Text
				lAutomationAccessoryItem05Value=lMapAutomationDataBefore.AutomationAccessoryItem05Value
				lAutomationAccessoryItem05Text=lMapAutomationDataBefore.AutomationAccessoryItem05Text
				lAutomationAccessoryItem06Value=lMapAutomationDataBefore.AutomationAccessoryItem06Value
				lAutomationAccessoryItem06Text=lMapAutomationDataBefore.AutomationAccessoryItem06Text
				lAutomationAccessoryItem07Value=lMapAutomationDataBefore.AutomationAccessoryItem07Value
				lAutomationAccessoryItem07Text=lMapAutomationDataBefore.AutomationAccessoryItem07Text
				lAutomationAccessoryItem08Value=lMapAutomationDataBefore.AutomationAccessoryItem08Value
				lAutomationAccessoryItem08Text=lMapAutomationDataBefore.AutomationAccessoryItem08Text
				lAutomationAccessoryItem09Value=lMapAutomationDataBefore.AutomationAccessoryItem09Value
				lAutomationAccessoryItem09Text=lMapAutomationDataBefore.AutomationAccessoryItem09Text
				lAutomationAccessoryItem10Value=lMapAutomationDataBefore.AutomationAccessoryItem10Value
				lAutomationAccessoryItem10Text=lMapAutomationDataBefore.AutomationAccessoryItem10Text
			}
			caseOutput.AutomationPageValue=lAutomationPageValue
			caseOutput.AutomationPageText=lAutomationPageText
			caseOutput.AutomationVersionValue=lAutomationVersionValue
			caseOutput.AutomationVersionText=lAutomationVersionText
			caseOutput.AutomationOpportunityNumberValue=lAutomationOpportunityNumberValue
			caseOutput.AutomationOpportunityNumberText=lAutomationOpportunityNumberText
			caseOutput.AutomationVehicleDetailValue=lAutomationVehicleDetailValue
			caseOutput.AutomationVehicleDetailText=lAutomationVehicleDetailText
			caseOutput.AutomationPremiumYearlyValue=lAutomationPremiumYearlyValue
			caseOutput.AutomationPremiumYearlyText=lAutomationPremiumYearlyText
			caseOutput.AutomationPremiumDepositValue=lAutomationPremiumDepositValue
			caseOutput.AutomationPremiumDepositText=lAutomationPremiumDepositText
			caseOutput.AutomationPremiumMonthlyValue=lAutomationPremiumMonthlyValue
			caseOutput.AutomationPremiumMonthlyText=lAutomationPremiumMonthlyText
			caseOutput.AutomationPremiumInstalmentValue=lAutomationPremiumInstalmentValue
			caseOutput.AutomationPremiumInstalmentText=lAutomationPremiumInstalmentText
			caseOutput.AutomationPremiumNoDepositAmountValue=lAutomationPremiumNoDepositAmountValue
			caseOutput.AutomationPremiumNoDepositAmountText=lAutomationPremiumNoDepositAmountText
			caseOutput.AutomationPremiumNoDepositTotalValue=lAutomationPremiumNoDepositTotalValue
			caseOutput.AutomationPremiumNoDepositTotalText=lAutomationPremiumNoDepositTotalText
			caseOutput.AutomationPremiumQuarterlyAmountValue=lAutomationPremiumQuarterlyAmountValue
			caseOutput.AutomationPremiumQuarterlyAmountText=lAutomationPremiumQuarterlyAmountText
			caseOutput.AutomationPremiumQuarterlyTotalValue=lAutomationPremiumQuarterlyTotalValue
			caseOutput.AutomationPremiumQuarterlyTotalText=lAutomationPremiumQuarterlyTotalText
			caseOutput.AutomationPlanTypeValue=lAutomationPlanTypeValue
			caseOutput.AutomationPlanTypeText=lAutomationPlanTypeText
			caseOutput.AutomationSumInsuredValue=lAutomationSumInsuredValue
			caseOutput.AutomationSumInsuredText=lAutomationSumInsuredText
			caseOutput.AutomationWorkshopValue=lAutomationWorkshopValue
			caseOutput.AutomationWorkshopText=lAutomationWorkshopText
			caseOutput.AutomationExcessPriceValue=lAutomationExcessPriceValue
			caseOutput.AutomationExcessPriceText=lAutomationExcessPriceText
			caseOutput.AutomationDriverPlanValue=lAutomationDriverPlanValue
			caseOutput.AutomationDriverPlanText=lAutomationDriverPlanText
			caseOutput.AutomationTpbiValue=lAutomationTpbiValue
			caseOutput.AutomationTpbiText=lAutomationTpbiText
			caseOutput.AutomationTppdValue=lAutomationTppdValue
			caseOutput.AutomationTppdText=lAutomationTppdText
			caseOutput.AutomationPaAndMeValue=lAutomationPaAndMeValue
			caseOutput.AutomationPaAndMeText=lAutomationPaAndMeText
			caseOutput.AutomationPaOnlyValue=lAutomationPaOnlyValue
			caseOutput.AutomationPaOnlyText=lAutomationPaOnlyText
			caseOutput.AutomationMeOnlyValue=lAutomationMeOnlyValue
			caseOutput.AutomationMeOnlyText=lAutomationMeOnlyText
			caseOutput.AutomationCompulsoryValue=lAutomationCompulsoryValue
			caseOutput.AutomationCompulsoryText=lAutomationCompulsoryText
			caseOutput.AutomationRsaValue=lAutomationRsaValue
			caseOutput.AutomationRsaText=lAutomationRsaText
			caseOutput.AutomationCarReplacementServiceValue=lAutomationCarReplacementServiceValue
			caseOutput.AutomationCarReplacementServiceText=lAutomationCarReplacementServiceText
			caseOutput.AutomationAccessoryItem01Value=lAutomationAccessoryItem01Value
			caseOutput.AutomationAccessoryItem01Text=lAutomationAccessoryItem01Text
			caseOutput.AutomationAccessoryItem02Value=lAutomationAccessoryItem02Value
			caseOutput.AutomationAccessoryItem02Text=lAutomationAccessoryItem02Text
			caseOutput.AutomationAccessoryItem03Value=lAutomationAccessoryItem03Value
			caseOutput.AutomationAccessoryItem03Text=lAutomationAccessoryItem03Text
			caseOutput.AutomationAccessoryItem04Value=lAutomationAccessoryItem04Value
			caseOutput.AutomationAccessoryItem04Text=lAutomationAccessoryItem04Text
			caseOutput.AutomationAccessoryItem05Value=lAutomationAccessoryItem05Value
			caseOutput.AutomationAccessoryItem05Text=lAutomationAccessoryItem05Text
			caseOutput.AutomationAccessoryItem06Value=lAutomationAccessoryItem06Value
			caseOutput.AutomationAccessoryItem06Text=lAutomationAccessoryItem06Text
			caseOutput.AutomationAccessoryItem07Value=lAutomationAccessoryItem07Value
			caseOutput.AutomationAccessoryItem07Text=lAutomationAccessoryItem07Text
			caseOutput.AutomationAccessoryItem08Value=lAutomationAccessoryItem08Value
			caseOutput.AutomationAccessoryItem08Text=lAutomationAccessoryItem08Text
			caseOutput.AutomationAccessoryItem09Value=lAutomationAccessoryItem09Value
			caseOutput.AutomationAccessoryItem09Text=lAutomationAccessoryItem09Text
			caseOutput.AutomationAccessoryItem10Value=lAutomationAccessoryItem10Value
			caseOutput.AutomationAccessoryItem10Text=lAutomationAccessoryItem10Text
			if(!lMapAutomationDataBefore.Result){
				return lreturn
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lQuoteBy)
			if(!lMapActualResult.Result){
				lActualResult=''
				lOpportunityNumber=''
				lVersion=''
				lPremiumYearly=''
				lPremiumDeposit=''
				lPremiumMonthly=''
				lPremiumInstalment=''
				lPremiumNoDepositAmount=''
				lPremiumNoDepositTotal=''
				lPremiumQuarterlyAmount=''
				lPremiumQuarterlyTotal=''
			}else{
				lActualResult=lMapActualResult.ActualResult
				lOpportunityNumber=lMapActualResult.OpportunityNumber
				lVersion=lMapActualResult.Version
				lPremiumYearly=lMapActualResult.PremiumYearly
				lPremiumDeposit=lMapActualResult.PremiumDeposit
				lPremiumMonthly=lMapActualResult.PremiumMonthly
				lPremiumInstalment=lMapActualResult.PremiumInstalment
				lPremiumNoDepositAmount=lMapActualResult.PremiumNoDepositAmount
				lPremiumNoDepositTotal=lMapActualResult.PremiumNoDepositTotal
				lPremiumQuarterlyAmount=lMapActualResult.PremiumQuarterlyAmount
				lPremiumQuarterlyTotal=lMapActualResult.PremiumQuarterlyTotal
			}
			caseOutput.ActualResult=lActualResult
			caseOutput.OpportunityNumber=lOpportunityNumber
			caseOutput.Version=lVersion
			caseOutput.PremiumYearly=lPremiumYearly
			caseOutput.PremiumDeposit=lPremiumDeposit
			caseOutput.PremiumMonthly=lPremiumMonthly
			caseOutput.PremiumInstalment=lPremiumInstalment
			caseOutput.PremiumNoDepositAmount=lPremiumNoDepositAmount
			caseOutput.PremiumNoDepositTotal=lPremiumNoDepositTotal
			caseOutput.PremiumQuarterlyAmount=lPremiumQuarterlyAmount
			caseOutput.PremiumQuarterlyTotal=lPremiumQuarterlyTotal
			THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
			Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
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
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					THAMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
					THAMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
					THAMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
					if(lIsActualResult){
						lIsChangedFromAnyToDealerWorkshop=caseOutput.SalesforceVerifyDataTransactionSyncedObjPolicyProductVersionC>=THAMotorCarCoreType.CURRENT_QUOTATION_POLICY_PRODUCT_VERSION
						lIsDealerWorkshop=false
						if(lPlanGarage.equalsIgnoreCase('AnyWorkshop')){
							lIsDealerWorkshop=true
						}
						if(lIsChangedFromAnyToDealerWorkshop&&lIsDealerWorkshop){
							lPlanGarage='DealerWorkshop'
							lAutomationWorkshopValue=lPlanGarage
							THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_VALUE=lAutomationWorkshopValue
							caseOutput.PlanGarage=lPlanGarage
							caseOutput.AutomationWorkshopValue=lAutomationWorkshopValue
						}
						Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput)
						lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(!lMapSalesforceProceedVerifyBefore.Result){
							return lreturn
						}
					}
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
						Boolean lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
						if(lIsSalesforceProceedRetrieveTodo){
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THAMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
							lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
							lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
							caseOutput.ActualResult=lActualResult
							if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
								return lreturn
							}
							if(lIsActualResult){
								Map lMapSalesforceProceedVerifyAfter=this.inputSalesforceProceedVerifyAfter(caseOutput,lIsPositiveCase,lQuoteBy)
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
			}
			lreturn=lIsActualResult
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
			lPositiveCase=THAMotorCarQuotationResultType.DEFAULT_POSITIVE_CASE
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
	public Map inputActualResult(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputActualResultA(isPositiveCase,strQuoteBy)
						break
					case 'B':
						lreturn=this.inputActualResultB(isPositiveCase,strQuoteBy)
						break
					case 'C':
						lreturn=this.inputActualResultC(isPositiveCase,strQuoteBy)
						break
					case 'D':
						lreturn=this.inputActualResultD(isPositiveCase,strQuoteBy)
						break
					case 'E':
						lreturn=this.inputActualResultE(isPositiveCase,strQuoteBy)
						break
					case 'F':
						lreturn=this.inputActualResultF(isPositiveCase,strQuoteBy)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputActualResultB(isPositiveCase,strQuoteBy)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultA(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(lQuoteBy.length()<=0){
				lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			lInfoTag=lTagOpportunityNumber
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lInfoTag='buyNow'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			lInfoTag='rewards2words'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lInfoTag='rewards2words2'
				lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lInfoTag=''
				lInfoLocator='#drt-cta span'
				lElementInfo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lInfoLocator)
			}
			if(!lElementInfo){
				lInfoText='No Option'
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()<=0){
					lInfoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInfo).trim()
				}
				THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT=lInfoText
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			String lTagPaymentOptionMotorSelectedSwitchButton='paymentOptionsSelected'
			String lLocatorPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSelectedSwitchButton)
			WebElement lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumDeposit,'NO OPTION')){
					lPremiumDeposit=lStrPremiumDeposit
				}else{
					lPremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumDeposit,'Amount='+lStrPremiumDeposit)
				}
			}
			if(lStrPremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumMonthly,'NO OPTION')){
					lPremiumMonthly=lStrPremiumMonthly
				}else{
					lPremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumMonthly,'Amount='+lStrPremiumMonthly)
				}
			}
			if(lStrPremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumInstalment,'NO OPTION')){
					lPremiumInstalment=lStrPremiumInstalment
				}else{
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumInstalment,'Total='+lStrPremiumInstalment)
				}
			}
			if(lStrPremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositAmount,'NO OPTION')){
					lPremiumNoDepositAmount=lStrPremiumNoDepositAmount
				}else{
					lPremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositAmount,'Amount='+lStrPremiumNoDepositAmount)
				}
			}
			if(lStrPremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositTotal,'NO OPTION')){
					lPremiumNoDepositTotal=lStrPremiumNoDepositTotal
				}else{
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositTotal,'Total='+lStrPremiumNoDepositTotal)
				}
			}
			if(lStrPremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyAmount,'NO OPTION')){
					lPremiumQuarterlyAmount=lStrPremiumQuarterlyAmount
				}else{
					lPremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyAmount,'Amount='+lStrPremiumQuarterlyAmount)
				}
			}
			if(lStrPremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyTotal,'NO OPTION')){
					lPremiumQuarterlyTotal=lStrPremiumQuarterlyTotal
				}else{
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyTotal,'Total='+lStrPremiumQuarterlyTotal)
				}
			}
			lIsOK=lIsOK&&(lPremiumYearlyTotalValueFloat>0)
			if(lQuoteBy.equalsIgnoreCase('NONE')){
				if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
					IGNUemaHelper.delayThreadSecond(1)
					Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
					}
					if(isPositiveCase){
						lActualResult=lRedirected
						lIsDone=lRedirected
					}else{
						lActualResult=!lRedirected
						lIsDone=!lRedirected
					}
				}else{
					lIsDone=false
					lActualResult=lIsDone
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lInfoTag=lTagOpportunityNumber
						lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=(isPositiveCase&&lIsOK&&lIsDone)
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultB(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(lQuoteBy.length()<=0){
				lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			lInfoTag=lTagOpportunityNumber
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lInfoTag='buyNow'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			lInfoTag='rewards2words'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lInfoTag='rewards2words2'
				lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lInfoTag=''
				lInfoLocator='#drt-cta span'
				lElementInfo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lInfoLocator)
			}
			if(!lElementInfo){
				lInfoText='No Option'
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()<=0){
					lInfoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInfo).trim()
				}
				THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT=lInfoText
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			String lTagPaymentOptionMotorSelectedSwitchButton='paymentOptionsSelected'
			String lLocatorPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSelectedSwitchButton)
			WebElement lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumDeposit,'NO OPTION')){
					lPremiumDeposit=lStrPremiumDeposit
				}else{
					lPremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumDeposit,'Amount='+lStrPremiumDeposit)
				}
			}
			if(lStrPremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumMonthly,'NO OPTION')){
					lPremiumMonthly=lStrPremiumMonthly
				}else{
					lPremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumMonthly,'Amount='+lStrPremiumMonthly)
				}
			}
			if(lStrPremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumInstalment,'NO OPTION')){
					lPremiumInstalment=lStrPremiumInstalment
				}else{
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumInstalment,'Total='+lStrPremiumInstalment)
				}
			}
			if(lStrPremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositAmount,'NO OPTION')){
					lPremiumNoDepositAmount=lStrPremiumNoDepositAmount
				}else{
					lPremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositAmount,'Amount='+lStrPremiumNoDepositAmount)
				}
			}
			if(lStrPremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositTotal,'NO OPTION')){
					lPremiumNoDepositTotal=lStrPremiumNoDepositTotal
				}else{
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositTotal,'Total='+lStrPremiumNoDepositTotal)
				}
			}
			if(lStrPremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyAmount,'NO OPTION')){
					lPremiumQuarterlyAmount=lStrPremiumQuarterlyAmount
				}else{
					lPremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyAmount,'Amount='+lStrPremiumQuarterlyAmount)
				}
			}
			if(lStrPremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyTotal,'NO OPTION')){
					lPremiumQuarterlyTotal=lStrPremiumQuarterlyTotal
				}else{
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyTotal,'Total='+lStrPremiumQuarterlyTotal)
				}
			}
			lIsOK=lIsOK&&(lPremiumYearlyTotalValueFloat>0)
			if(lQuoteBy.equalsIgnoreCase('NONE')){
				if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
					IGNUemaHelper.delayThreadSecond(1)
					Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
					}
					if(isPositiveCase){
						lActualResult=lRedirected
						lIsDone=lRedirected
					}else{
						lActualResult=!lRedirected
						lIsDone=!lRedirected
					}
				}else{
					lIsDone=false
					lActualResult=lIsDone
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lInfoTag=lTagOpportunityNumber
						lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=(isPositiveCase&&lIsOK&&lIsDone)
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultC(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(lQuoteBy.length()<=0){
				lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			lInfoTag=lTagOpportunityNumber
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lInfoTag='buyNow'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			lInfoTag='rewards2words'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lInfoTag='rewards2words2'
				lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lInfoTag=''
				lInfoLocator='#drt-cta span'
				lElementInfo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lInfoLocator)
			}
			if(!lElementInfo){
				lInfoText='No Option'
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()<=0){
					lInfoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInfo).trim()
				}
				THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT=lInfoText
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumDeposit,'NO OPTION')){
					lPremiumDeposit=lStrPremiumDeposit
				}else{
					lPremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumDeposit,'Amount='+lStrPremiumDeposit)
				}
			}
			if(lStrPremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumMonthly,'NO OPTION')){
					lPremiumMonthly=lStrPremiumMonthly
				}else{
					lPremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumMonthly,'Amount='+lStrPremiumMonthly)
				}
			}
			if(lStrPremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumInstalment,'NO OPTION')){
					lPremiumInstalment=lStrPremiumInstalment
				}else{
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumInstalment,'Total='+lStrPremiumInstalment)
				}
			}
			if(lStrPremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositAmount,'NO OPTION')){
					lPremiumNoDepositAmount=lStrPremiumNoDepositAmount
				}else{
					lPremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositAmount,'Amount='+lStrPremiumNoDepositAmount)
				}
			}
			if(lStrPremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositTotal,'NO OPTION')){
					lPremiumNoDepositTotal=lStrPremiumNoDepositTotal
				}else{
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositTotal,'Total='+lStrPremiumNoDepositTotal)
				}
			}
			if(lStrPremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyAmount,'NO OPTION')){
					lPremiumQuarterlyAmount=lStrPremiumQuarterlyAmount
				}else{
					lPremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyAmount,'Amount='+lStrPremiumQuarterlyAmount)
				}
			}
			if(lStrPremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyTotal,'NO OPTION')){
					lPremiumQuarterlyTotal=lStrPremiumQuarterlyTotal
				}else{
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyTotal,'Total='+lStrPremiumQuarterlyTotal)
				}
			}
			lIsOK=lIsOK&&(lPremiumYearlyTotalValueFloat>0)
			if(lQuoteBy.equalsIgnoreCase('NONE')){
				if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
					IGNUemaHelper.delayThreadSecond(1)
					Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
					}
					if(isPositiveCase){
						lActualResult=lRedirected
						lIsDone=lRedirected
					}else{
						lActualResult=!lRedirected
						lIsDone=!lRedirected
					}
				}else{
					lIsDone=false
					lActualResult=lIsDone
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lInfoTag=lTagOpportunityNumber
						lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=(isPositiveCase&&lIsOK&&lIsDone)
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultD(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(lQuoteBy.length()<=0){
				lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			lInfoTag=lTagOpportunityNumber
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lInfoTag='buyNow'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			lInfoTag='rewards2words'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lInfoTag='rewards2words2'
				lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lInfoTag=''
				lInfoLocator='#drt-cta span'
				lElementInfo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lInfoLocator)
			}
			if(!lElementInfo){
				lInfoText='No Option'
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()<=0){
					lInfoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInfo).trim()
				}
				THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT=lInfoText
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumDeposit,'NO OPTION')){
					lPremiumDeposit=lStrPremiumDeposit
				}else{
					lPremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumDeposit,'Amount='+lStrPremiumDeposit)
				}
			}
			if(lStrPremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumMonthly,'NO OPTION')){
					lPremiumMonthly=lStrPremiumMonthly
				}else{
					lPremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumMonthly,'Amount='+lStrPremiumMonthly)
				}
			}
			if(lStrPremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumInstalment,'NO OPTION')){
					lPremiumInstalment=lStrPremiumInstalment
				}else{
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumInstalment,'Total='+lStrPremiumInstalment)
				}
			}
			if(lStrPremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositAmount,'NO OPTION')){
					lPremiumNoDepositAmount=lStrPremiumNoDepositAmount
				}else{
					lPremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositAmount,'Amount='+lStrPremiumNoDepositAmount)
				}
			}
			if(lStrPremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositTotal,'NO OPTION')){
					lPremiumNoDepositTotal=lStrPremiumNoDepositTotal
				}else{
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositTotal,'Total='+lStrPremiumNoDepositTotal)
				}
			}
			if(lStrPremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyAmount,'NO OPTION')){
					lPremiumQuarterlyAmount=lStrPremiumQuarterlyAmount
				}else{
					lPremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyAmount,'Amount='+lStrPremiumQuarterlyAmount)
				}
			}
			if(lStrPremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyTotal,'NO OPTION')){
					lPremiumQuarterlyTotal=lStrPremiumQuarterlyTotal
				}else{
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyTotal,'Total='+lStrPremiumQuarterlyTotal)
				}
			}
			lIsOK=lIsOK&&(lPremiumYearlyTotalValueFloat>0)
			if(lQuoteBy.equalsIgnoreCase('NONE')){
				if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
					IGNUemaHelper.delayThreadSecond(1)
					Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
					}
					if(isPositiveCase){
						lActualResult=lRedirected
						lIsDone=lRedirected
					}else{
						lActualResult=!lRedirected
						lIsDone=!lRedirected
					}
				}else{
					lIsDone=false
					lActualResult=lIsDone
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lInfoTag=lTagOpportunityNumber
						lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=(isPositiveCase&&lIsOK&&lIsDone)
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultE(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(lQuoteBy.length()<=0){
				lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			lInfoTag=lTagOpportunityNumber
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lInfoTag='buyNow'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			lInfoTag='rewards2words'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lInfoTag='rewards2words2'
				lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lInfoTag=''
				lInfoLocator='#drt-cta span'
				lElementInfo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lInfoLocator)
			}
			if(!lElementInfo){
				lInfoText='No Option'
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()<=0){
					lInfoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInfo).trim()
				}
				THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT=lInfoText
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumDeposit,'NO OPTION')){
					lPremiumDeposit=lStrPremiumDeposit
				}else{
					lPremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumDeposit,'Amount='+lStrPremiumDeposit)
				}
			}
			if(lStrPremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumMonthly,'NO OPTION')){
					lPremiumMonthly=lStrPremiumMonthly
				}else{
					lPremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumMonthly,'Amount='+lStrPremiumMonthly)
				}
			}
			if(lStrPremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumInstalment,'NO OPTION')){
					lPremiumInstalment=lStrPremiumInstalment
				}else{
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumInstalment,'Total='+lStrPremiumInstalment)
				}
			}
			if(lStrPremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositAmount,'NO OPTION')){
					lPremiumNoDepositAmount=lStrPremiumNoDepositAmount
				}else{
					lPremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositAmount,'Amount='+lStrPremiumNoDepositAmount)
				}
			}
			if(lStrPremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositTotal,'NO OPTION')){
					lPremiumNoDepositTotal=lStrPremiumNoDepositTotal
				}else{
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositTotal,'Total='+lStrPremiumNoDepositTotal)
				}
			}
			if(lStrPremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyAmount,'NO OPTION')){
					lPremiumQuarterlyAmount=lStrPremiumQuarterlyAmount
				}else{
					lPremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyAmount,'Amount='+lStrPremiumQuarterlyAmount)
				}
			}
			if(lStrPremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyTotal,'NO OPTION')){
					lPremiumQuarterlyTotal=lStrPremiumQuarterlyTotal
				}else{
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyTotal,'Total='+lStrPremiumQuarterlyTotal)
				}
			}
			lIsOK=lIsOK&&(lPremiumYearlyTotalValueFloat>0)
			if(lQuoteBy.equalsIgnoreCase('NONE')){
				if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
					IGNUemaHelper.delayThreadSecond(1)
					Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
					}
					if(isPositiveCase){
						lActualResult=lRedirected
						lIsDone=lRedirected
					}else{
						lActualResult=!lRedirected
						lIsDone=!lRedirected
					}
				}else{
					lIsDone=false
					lActualResult=lIsDone
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lInfoTag=lTagOpportunityNumber
						lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=(isPositiveCase&&lIsOK&&lIsDone)
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultF(Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lVersion=''
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Version','')
			lreturn.put('PremiumYearly','')
			lreturn.put('PremiumDeposit','')
			lreturn.put('PremiumMonthly','')
			lreturn.put('PremiumInstalment','')
			lreturn.put('PremiumNoDepositAmount','')
			lreturn.put('PremiumNoDepositTotal','')
			lreturn.put('PremiumQuarterlyAmount','')
			lreturn.put('PremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(lQuoteBy.length()<=0){
				lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Boolean lIsDone=false
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			lInfoTag=lTagOpportunityNumber
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lOpportunityNumber=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(3)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
				if(lElementInfo){
					lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
					lOpportunityNumber=lInfoText
					lIsOK=lIsOK&&(lInfoText.length()>0)
				}
			}
			lInfoTag='buyNow'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lIsOK=false
			}else{
				lInfoText=lElementInfo.getText().trim()
				lVersion=lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			lInfoTag='rewards2words'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(!lElementInfo){
				lInfoTag='rewards2words2'
				lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
				lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			}
			if(!lElementInfo){
				lInfoTag=''
				lInfoLocator='#drt-cta span'
				lElementInfo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lInfoLocator)
			}
			if(!lElementInfo){
				lInfoText='No Option'
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}else{
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()<=0){
					lInfoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInfo).trim()
				}
				THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT=lInfoText
				lVersion=lVersion+'|Roojai Rewards='+lInfoText
				lIsOK=lIsOK&&(lInfoText.length()>0)
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
			String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
			lPremiumYearly=lPremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumDeposit,'NO OPTION')){
					lPremiumDeposit=lStrPremiumDeposit
				}else{
					lPremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumDeposit,'Amount='+lStrPremiumDeposit)
				}
			}
			if(lStrPremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumMonthly,'NO OPTION')){
					lPremiumMonthly=lStrPremiumMonthly
				}else{
					lPremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumMonthly,'Amount='+lStrPremiumMonthly)
				}
			}
			if(lStrPremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumInstalment,'NO OPTION')){
					lPremiumInstalment=lStrPremiumInstalment
				}else{
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumInstalment,'Total='+lStrPremiumInstalment)
				}
			}
			if(lStrPremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositAmount,'NO OPTION')){
					lPremiumNoDepositAmount=lStrPremiumNoDepositAmount
				}else{
					lPremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositAmount,'Amount='+lStrPremiumNoDepositAmount)
				}
			}
			if(lStrPremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumNoDepositTotal,'NO OPTION')){
					lPremiumNoDepositTotal=lStrPremiumNoDepositTotal
				}else{
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumNoDepositTotal,'Total='+lStrPremiumNoDepositTotal)
				}
			}
			if(lStrPremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyAmount,'NO OPTION')){
					lPremiumQuarterlyAmount=lStrPremiumQuarterlyAmount
				}else{
					lPremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyAmount,'Amount='+lStrPremiumQuarterlyAmount)
				}
			}
			if(lStrPremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPremiumQuarterlyTotal,'NO OPTION')){
					lPremiumQuarterlyTotal=lStrPremiumQuarterlyTotal
				}else{
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPremiumQuarterlyTotal,'Total='+lStrPremiumQuarterlyTotal)
				}
			}
			lIsOK=lIsOK&&(lPremiumYearlyTotalValueFloat>0)
			if(lQuoteBy.equalsIgnoreCase('NONE')){
				if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))){
					IGNUemaHelper.delayThreadSecond(1)
					Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
					if(!lRedirected){
						lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
					}
					if(isPositiveCase){
						lActualResult=lRedirected
						lIsDone=lRedirected
					}else{
						lActualResult=!lRedirected
						lIsDone=!lRedirected
					}
				}else{
					lIsDone=false
					lActualResult=lIsDone
				}
			}else{
				String lOpportunityNumberOld=lOpportunityNumber.trim()
				if(lIsOK&&(lOpportunityNumberOld.length()>0)){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lInfoTag=lTagOpportunityNumber
						lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(!lElementInfo){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						}
						if(!lElementInfo){
							lIsOK=false
						}else{
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
						if(!lIsOK){
							IGNUemaHelper.delayThreadSecond(3)
							lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
							if(lElementInfo){
								lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
								lOpportunityNumber=lInfoText
								lIsOK=lIsOK&&(lInfoText.length()>0)
							}
						}
						lOpportunityNumber=lOpportunityNumber.trim()
						if(lOpportunityNumber.length()>0){
							if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
								IGNUemaHelper.delayThreadSecond(lIndex)
							}else{
								break
							}
						}
					}
				}
				lIsDone=true
				lActualResult=lIsDone
			}
			lResult=(isPositiveCase&&lIsOK&&lIsDone)
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Version',lVersion)
				lreturn.put('PremiumYearly',lPremiumYearly)
				lreturn.put('PremiumDeposit',lPremiumDeposit)
				lreturn.put('PremiumMonthly',lPremiumMonthly)
				lreturn.put('PremiumInstalment',lPremiumInstalment)
				lreturn.put('PremiumNoDepositAmount',lPremiumNoDepositAmount)
				lreturn.put('PremiumNoDepositTotal',lPremiumNoDepositTotal)
				lreturn.put('PremiumQuarterlyAmount',lPremiumQuarterlyAmount)
				lreturn.put('PremiumQuarterlyTotal',lPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
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
			lLanguage=THAMotorCarQuotationResultType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMotorCarQuotationResultType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THAMotorCarQuotationResultType.DEFAULT_LANGUAGE)
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
	public Map inputPrePackage(String strPrePackage){
		Map lreturn=[:]
		String lPrePackage=strPrePackage.trim()
		if(lPrePackage.length()<=0){
			lPrePackage=THAMotorCarQuotationResultType.DEFAULT_PRE_PACKAGE
		}
		Integer lPrePackageMin=1
		Integer lPrePackageMax=4
		Integer lPrePackageDefault=4
		Integer lPrePackageNum=IGNUemaHelper.convertStringToInteger(lPrePackage,lPrePackageDefault)
		if((lPrePackageNum<lPrePackageMin)||(lPrePackageNum>lPrePackageMax)){
			lPrePackageNum=lPrePackageDefault
		}
		String lPrePackagePremiumYearly=''
		String lPrePackagePremiumDeposit=''
		String lPrePackagePremiumMonthly=''
		String lPrePackagePremiumInstalment=''
		String lPrePackagePremiumNoDepositAmount=''
		String lPrePackagePremiumNoDepositTotal=''
		String lPrePackagePremiumQuarterlyAmount=''
		String lPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PrePackage','')
			lreturn.put('PrePackagePremiumYearly','')
			lreturn.put('PrePackagePremiumDeposit','')
			lreturn.put('PrePackagePremiumMonthly','')
			lreturn.put('PrePackagePremiumInstalment','')
			lreturn.put('PrePackagePremiumNoDepositAmount','')
			lreturn.put('PrePackagePremiumNoDepositTotal','')
			lreturn.put('PrePackagePremiumQuarterlyAmount','')
			lreturn.put('PrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			String lTagButtonPlan=''
			String lLocatorButtonPlan=''
			WebElement lElementButtonPlan=null
			if(lPrePackageNum<4){
				switch(lPrePackageNum){
					case 1:
						lTagButtonPlan='saved-select'
						break
					case 2:
						lTagButtonPlan='popular-select'
						break
					default:
						lTagButtonPlan='platinum-select'
						break
				}
			}
			lLocatorButtonPlan=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPlan)
			lElementButtonPlan=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPlan)
			if(!lElementButtonPlan){
				lTagButtonPlan='card-design-myplan'
				lElementButtonPlan=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPlan)
				if(lElementButtonPlan){
					lPrePackageNum=lPrePackageDefault
				}
			}
			if(!lElementButtonPlan){
				lTagButtonPlan='btn-design-myplan'
				lElementButtonPlan=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPlan)
				if(lElementButtonPlan){
					lPrePackageNum=lPrePackageDefault
				}
			}
			if(!lElementButtonPlan){
				lPrePackage='No Option'
				lResult=true
			}else{
				if(lPrePackageNum<4){
					String lTagButtonInstalmentOpen=''
					switch(lPrePackageNum){
						case 3:
							lTagButtonInstalmentOpen='platinum-instalment'
							lPrePackagePremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'platinum-price'))
							break
						case 2:
							lTagButtonInstalmentOpen='popular-instalment'
							lPrePackagePremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'popular-price'))
							break
						default:
							lTagButtonInstalmentOpen='saved-instalment'
							lPrePackagePremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'saved-price'))
							break
					}
					String lLocatorButtonInstalmentOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonInstalmentOpen)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonInstalmentOpen)){
						IGNUemaHelper.delayThreadSecond(3)
						lPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first'))
						lPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment'))
						lPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice'))
						lPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment'))
						lPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice'))
						lPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment'))
						lPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice'))
						String lTagInstallmentSelectOptionSelected='selected-installment-option'
						String lLocatorInstallmentSelectOptionSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentSelectOptionSelected)
						WebElement lElementInstallmentSelectOptionSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInstallmentSelectOptionSelected)
						if(lElementInstallmentSelectOptionSelected){
							String lInstallmentSelectOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInstallmentSelectOptionSelected)
							String lTagInstallmentSelectOptionButtonKey='installment-option'
							String lLocatorInstallmentSelectOptionButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagInstallmentSelectOptionButtonKey,lInstallmentSelectOptionSelectedValue)
							WebElement lElementInstallmentSelectOptionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagInstallmentSelectOptionButtonKey,lInstallmentSelectOptionSelectedValue)
							if(lElementInstallmentSelectOptionButton){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
							}
						}
						String lLocatorInstallmentPanelActive='.panel.installment-option.active'
						WebElement lElementInstallmentPanelActive=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInstallmentPanelActive)
						if(lElementInstallmentPanelActive){
							String lTagInstallmentSelectOptionButton='installment-option'
							String lLocatorInstallmentSelectOptionButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentSelectOptionButton)
							WebElement lElementInstallmentSelectOptionButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementInstallmentPanelActive,lTagInstallmentSelectOptionButton)
							if(lElementInstallmentSelectOptionButton){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
							}
						}
						String lTagInstallmentCloseButton='installment-modal-close-btn'
						String lLocatorInstallmentCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentCloseButton)
						IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorInstallmentCloseButton)
						WebElement lElementInstallmentCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInstallmentCloseButton)
						if(lElementInstallmentCloseButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentCloseButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentCloseButton)
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentCloseButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentCloseButton)
						}
					}
				}
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPlan)){
					lPrePackage=lTagButtonPlan
				}else{
					lPrePackage=''
				}
			}
			lResult=lPrePackage.length()>0
			if(lResult){
				lreturn.put('PrePackage',lPrePackage)
				lreturn.put('PrePackagePremiumYearly',lPrePackagePremiumYearly)
				lreturn.put('PrePackagePremiumDeposit',lPrePackagePremiumDeposit)
				lreturn.put('PrePackagePremiumMonthly',lPrePackagePremiumMonthly)
				lreturn.put('PrePackagePremiumInstalment',lPrePackagePremiumInstalment)
				lreturn.put('PrePackagePremiumNoDepositAmount',lPrePackagePremiumNoDepositAmount)
				lreturn.put('PrePackagePremiumNoDepositTotal',lPrePackagePremiumNoDepositTotal)
				lreturn.put('PrePackagePremiumQuarterlyAmount',lPrePackagePremiumQuarterlyAmount)
				lreturn.put('PrePackagePremiumQuarterlyTotal',lPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackage(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPostPrePackageA()
						break
					case 'B':
						lreturn=this.inputPostPrePackageB()
						break
					case 'C':
						lreturn=this.inputPostPrePackageC()
						break
					case 'D':
						lreturn=this.inputPostPrePackageD()
						break
					case 'E':
						lreturn=this.inputPostPrePackageE()
						break
					case 'F':
						lreturn=this.inputPostPrePackageF()
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPostPrePackageB()
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageA(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
			}
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',10)
			if(!lRedirected){
				return lreturn
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			String lTagPaymentOptionMotorSelectedSwitchButton='paymentOptionsSelected'
			String lLocatorPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSelectedSwitchButton)
			WebElement lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			lPostPrePackagePremiumDeposit='No Option'
			lPostPrePackagePremiumMonthly='No Option'
			lPostPrePackagePremiumInstalment='No Option'
			lPostPrePackagePremiumNoDepositAmount='No Option'
			lPostPrePackagePremiumNoDepositTotal='No Option'
			lPostPrePackagePremiumQuarterlyAmount='No Option'
			lPostPrePackagePremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPostPrePackagePremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPostPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPostPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPostPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPostPrePackagePremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumDeposit,'NO OPTION')){
					lPostPrePackagePremiumDeposit=lStrPostPrePackagePremiumDeposit
				}else{
					lPostPrePackagePremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumDeposit,'Amount='+lStrPostPrePackagePremiumDeposit)
				}
			}
			if(lStrPostPrePackagePremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumMonthly,'NO OPTION')){
					lPostPrePackagePremiumMonthly=lStrPostPrePackagePremiumMonthly
				}else{
					lPostPrePackagePremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumMonthly,'Amount='+lStrPostPrePackagePremiumMonthly)
				}
			}
			if(lStrPostPrePackagePremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumInstalment,'NO OPTION')){
					lPostPrePackagePremiumInstalment=lStrPostPrePackagePremiumInstalment
				}else{
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumInstalment,'Total='+lStrPostPrePackagePremiumInstalment)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositAmount,'NO OPTION')){
					lPostPrePackagePremiumNoDepositAmount=lStrPostPrePackagePremiumNoDepositAmount
				}else{
					lPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositAmount,'Amount='+lStrPostPrePackagePremiumNoDepositAmount)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositTotal,'NO OPTION')){
					lPostPrePackagePremiumNoDepositTotal=lStrPostPrePackagePremiumNoDepositTotal
				}else{
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositTotal,'Total='+lStrPostPrePackagePremiumNoDepositTotal)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyAmount,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyAmount=lStrPostPrePackagePremiumQuarterlyAmount
				}else{
					lPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyAmount,'Amount='+lStrPostPrePackagePremiumQuarterlyAmount)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyTotal,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyTotal=lStrPostPrePackagePremiumQuarterlyTotal
				}else{
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyTotal,'Total='+lStrPostPrePackagePremiumQuarterlyTotal)
				}
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageB(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
			}
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',10)
			if(!lRedirected){
				return lreturn
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			String lTagPaymentOptionMotorSelectedSwitchButton='paymentOptionsSelected'
			String lLocatorPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSelectedSwitchButton)
			WebElement lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			lPostPrePackagePremiumDeposit='No Option'
			lPostPrePackagePremiumMonthly='No Option'
			lPostPrePackagePremiumInstalment='No Option'
			lPostPrePackagePremiumNoDepositAmount='No Option'
			lPostPrePackagePremiumNoDepositTotal='No Option'
			lPostPrePackagePremiumQuarterlyAmount='No Option'
			lPostPrePackagePremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPostPrePackagePremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
					lElementPaymentOptionMotorSelectedSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSelectedSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSelectedSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPostPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPostPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPostPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPostPrePackagePremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumDeposit,'NO OPTION')){
					lPostPrePackagePremiumDeposit=lStrPostPrePackagePremiumDeposit
				}else{
					lPostPrePackagePremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumDeposit,'Amount='+lStrPostPrePackagePremiumDeposit)
				}
			}
			if(lStrPostPrePackagePremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumMonthly,'NO OPTION')){
					lPostPrePackagePremiumMonthly=lStrPostPrePackagePremiumMonthly
				}else{
					lPostPrePackagePremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumMonthly,'Amount='+lStrPostPrePackagePremiumMonthly)
				}
			}
			if(lStrPostPrePackagePremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumInstalment,'NO OPTION')){
					lPostPrePackagePremiumInstalment=lStrPostPrePackagePremiumInstalment
				}else{
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumInstalment,'Total='+lStrPostPrePackagePremiumInstalment)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositAmount,'NO OPTION')){
					lPostPrePackagePremiumNoDepositAmount=lStrPostPrePackagePremiumNoDepositAmount
				}else{
					lPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositAmount,'Amount='+lStrPostPrePackagePremiumNoDepositAmount)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositTotal,'NO OPTION')){
					lPostPrePackagePremiumNoDepositTotal=lStrPostPrePackagePremiumNoDepositTotal
				}else{
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositTotal,'Total='+lStrPostPrePackagePremiumNoDepositTotal)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyAmount,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyAmount=lStrPostPrePackagePremiumQuarterlyAmount
				}else{
					lPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyAmount,'Amount='+lStrPostPrePackagePremiumQuarterlyAmount)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyTotal,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyTotal=lStrPostPrePackagePremiumQuarterlyTotal
				}else{
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyTotal,'Total='+lStrPostPrePackagePremiumQuarterlyTotal)
				}
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageC(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
			}
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',10)
			if(!lRedirected){
				return lreturn
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPostPrePackagePremiumDeposit='No Option'
			lPostPrePackagePremiumMonthly='No Option'
			lPostPrePackagePremiumInstalment='No Option'
			lPostPrePackagePremiumNoDepositAmount='No Option'
			lPostPrePackagePremiumNoDepositTotal='No Option'
			lPostPrePackagePremiumQuarterlyAmount='No Option'
			lPostPrePackagePremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPostPrePackagePremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPostPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPostPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPostPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPostPrePackagePremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumDeposit,'NO OPTION')){
					lPostPrePackagePremiumDeposit=lStrPostPrePackagePremiumDeposit
				}else{
					lPostPrePackagePremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumDeposit,'Amount='+lStrPostPrePackagePremiumDeposit)
				}
			}
			if(lStrPostPrePackagePremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumMonthly,'NO OPTION')){
					lPostPrePackagePremiumMonthly=lStrPostPrePackagePremiumMonthly
				}else{
					lPostPrePackagePremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumMonthly,'Amount='+lStrPostPrePackagePremiumMonthly)
				}
			}
			if(lStrPostPrePackagePremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumInstalment,'NO OPTION')){
					lPostPrePackagePremiumInstalment=lStrPostPrePackagePremiumInstalment
				}else{
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumInstalment,'Total='+lStrPostPrePackagePremiumInstalment)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositAmount,'NO OPTION')){
					lPostPrePackagePremiumNoDepositAmount=lStrPostPrePackagePremiumNoDepositAmount
				}else{
					lPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositAmount,'Amount='+lStrPostPrePackagePremiumNoDepositAmount)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositTotal,'NO OPTION')){
					lPostPrePackagePremiumNoDepositTotal=lStrPostPrePackagePremiumNoDepositTotal
				}else{
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositTotal,'Total='+lStrPostPrePackagePremiumNoDepositTotal)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyAmount,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyAmount=lStrPostPrePackagePremiumQuarterlyAmount
				}else{
					lPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyAmount,'Amount='+lStrPostPrePackagePremiumQuarterlyAmount)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyTotal,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyTotal=lStrPostPrePackagePremiumQuarterlyTotal
				}else{
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyTotal,'Total='+lStrPostPrePackagePremiumQuarterlyTotal)
				}
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageD(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
			}
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',10)
			if(!lRedirected){
				return lreturn
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPostPrePackagePremiumDeposit='No Option'
			lPostPrePackagePremiumMonthly='No Option'
			lPostPrePackagePremiumInstalment='No Option'
			lPostPrePackagePremiumNoDepositAmount='No Option'
			lPostPrePackagePremiumNoDepositTotal='No Option'
			lPostPrePackagePremiumQuarterlyAmount='No Option'
			lPostPrePackagePremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPostPrePackagePremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPostPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPostPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPostPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPostPrePackagePremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumDeposit,'NO OPTION')){
					lPostPrePackagePremiumDeposit=lStrPostPrePackagePremiumDeposit
				}else{
					lPostPrePackagePremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumDeposit,'Amount='+lStrPostPrePackagePremiumDeposit)
				}
			}
			if(lStrPostPrePackagePremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumMonthly,'NO OPTION')){
					lPostPrePackagePremiumMonthly=lStrPostPrePackagePremiumMonthly
				}else{
					lPostPrePackagePremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumMonthly,'Amount='+lStrPostPrePackagePremiumMonthly)
				}
			}
			if(lStrPostPrePackagePremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumInstalment,'NO OPTION')){
					lPostPrePackagePremiumInstalment=lStrPostPrePackagePremiumInstalment
				}else{
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumInstalment,'Total='+lStrPostPrePackagePremiumInstalment)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositAmount,'NO OPTION')){
					lPostPrePackagePremiumNoDepositAmount=lStrPostPrePackagePremiumNoDepositAmount
				}else{
					lPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositAmount,'Amount='+lStrPostPrePackagePremiumNoDepositAmount)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositTotal,'NO OPTION')){
					lPostPrePackagePremiumNoDepositTotal=lStrPostPrePackagePremiumNoDepositTotal
				}else{
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositTotal,'Total='+lStrPostPrePackagePremiumNoDepositTotal)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyAmount,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyAmount=lStrPostPrePackagePremiumQuarterlyAmount
				}else{
					lPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyAmount,'Amount='+lStrPostPrePackagePremiumQuarterlyAmount)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyTotal,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyTotal=lStrPostPrePackagePremiumQuarterlyTotal
				}else{
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyTotal,'Total='+lStrPostPrePackagePremiumQuarterlyTotal)
				}
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageE(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
			}
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',10)
			if(!lRedirected){
				return lreturn
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPostPrePackagePremiumDeposit='No Option'
			lPostPrePackagePremiumMonthly='No Option'
			lPostPrePackagePremiumInstalment='No Option'
			lPostPrePackagePremiumNoDepositAmount='No Option'
			lPostPrePackagePremiumNoDepositTotal='No Option'
			lPostPrePackagePremiumQuarterlyAmount='No Option'
			lPostPrePackagePremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPostPrePackagePremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPostPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPostPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPostPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPostPrePackagePremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumDeposit,'NO OPTION')){
					lPostPrePackagePremiumDeposit=lStrPostPrePackagePremiumDeposit
				}else{
					lPostPrePackagePremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumDeposit,'Amount='+lStrPostPrePackagePremiumDeposit)
				}
			}
			if(lStrPostPrePackagePremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumMonthly,'NO OPTION')){
					lPostPrePackagePremiumMonthly=lStrPostPrePackagePremiumMonthly
				}else{
					lPostPrePackagePremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumMonthly,'Amount='+lStrPostPrePackagePremiumMonthly)
				}
			}
			if(lStrPostPrePackagePremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumInstalment,'NO OPTION')){
					lPostPrePackagePremiumInstalment=lStrPostPrePackagePremiumInstalment
				}else{
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumInstalment,'Total='+lStrPostPrePackagePremiumInstalment)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositAmount,'NO OPTION')){
					lPostPrePackagePremiumNoDepositAmount=lStrPostPrePackagePremiumNoDepositAmount
				}else{
					lPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositAmount,'Amount='+lStrPostPrePackagePremiumNoDepositAmount)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositTotal,'NO OPTION')){
					lPostPrePackagePremiumNoDepositTotal=lStrPostPrePackagePremiumNoDepositTotal
				}else{
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositTotal,'Total='+lStrPostPrePackagePremiumNoDepositTotal)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyAmount,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyAmount=lStrPostPrePackagePremiumQuarterlyAmount
				}else{
					lPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyAmount,'Amount='+lStrPostPrePackagePremiumQuarterlyAmount)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyTotal,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyTotal=lStrPostPrePackagePremiumQuarterlyTotal
				}else{
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyTotal,'Total='+lStrPostPrePackagePremiumQuarterlyTotal)
				}
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostPrePackageF(){
		Map lreturn=[:]
		String lPostPrePackagePremiumYearly=''
		String lPostPrePackagePremiumDeposit=''
		String lPostPrePackagePremiumMonthly=''
		String lPostPrePackagePremiumInstalment=''
		String lPostPrePackagePremiumNoDepositAmount=''
		String lPostPrePackagePremiumNoDepositTotal=''
		String lPostPrePackagePremiumQuarterlyAmount=''
		String lPostPrePackagePremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('PostPrePackagePremiumYearly','')
			lreturn.put('PostPrePackagePremiumDeposit','')
			lreturn.put('PostPrePackagePremiumMonthly','')
			lreturn.put('PostPrePackagePremiumInstalment','')
			lreturn.put('PostPrePackagePremiumNoDepositAmount','')
			lreturn.put('PostPrePackagePremiumNoDepositTotal','')
			lreturn.put('PostPrePackagePremiumQuarterlyAmount','')
			lreturn.put('PostPrePackagePremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policy1-v3',10)
			if(!lRedirected){
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',10)
			}
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',10)
			if(!lRedirected){
				return lreturn
			}
			String lTagPaymentOptionMotorSwitchButton='paymentOptions'
			String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
			WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='summaryPrice2'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lPostPrePackagePremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
			Float lPostPrePackagePremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPostPrePackagePremiumYearlyTotalValueText,0)
			String lPostPrePackagePremiumYearlyTotalString='YearlyTotal='+lPostPrePackagePremiumYearlyTotalValueText
			lPostPrePackagePremiumYearly=lPostPrePackagePremiumYearlyTotalString
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			lPostPrePackagePremiumDeposit='No Option'
			lPostPrePackagePremiumMonthly='No Option'
			lPostPrePackagePremiumInstalment='No Option'
			lPostPrePackagePremiumNoDepositAmount='No Option'
			lPostPrePackagePremiumNoDepositTotal='No Option'
			lPostPrePackagePremiumQuarterlyAmount='No Option'
			lPostPrePackagePremiumQuarterlyTotal='No Option'
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
				lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
				if(!lElementPaymentOptionMotorSwitchButton){
					return lreturn
				}
				lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
				lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
				if(lIsPaymentOptionMotorSwitchButtonAsYearly){
					return lreturn
				}
				lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
				if(!lElementSelectedPremiumAmountTotal){
					return lreturn
				}
				String lSelectedPremiumAmountValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountValueText,0)
				Float lSelectedPremiumAmountValueNumCal=0
				lPostPrePackagePremiumNoDepositAmount=lSelectedPremiumAmountValueText
				lSelectedPremiumAmountValueNumCal=(lSelectedPremiumAmountValueFloat*10)
				lPostPrePackagePremiumNoDepositTotal='Cal='+lSelectedPremiumAmountValueNumCal.toString()
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonDisabled){
				if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
				}
			}
			lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
			if(!lElementPaymentOptionMotorSwitchButton){
				return lreturn
			}
			lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
			lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentOptionMotorSwitchButton),'YEARLY')
			if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
				return lreturn
			}
			String lStrPostPrePackagePremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPostPrePackagePremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPostPrePackagePremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			if(lStrPostPrePackagePremiumDeposit.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumDeposit,'NO OPTION')){
					lPostPrePackagePremiumDeposit=lStrPostPrePackagePremiumDeposit
				}else{
					lPostPrePackagePremiumDeposit=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumDeposit,'Amount='+lStrPostPrePackagePremiumDeposit)
				}
			}
			if(lStrPostPrePackagePremiumMonthly.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumMonthly,'NO OPTION')){
					lPostPrePackagePremiumMonthly=lStrPostPrePackagePremiumMonthly
				}else{
					lPostPrePackagePremiumMonthly=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumMonthly,'Amount='+lStrPostPrePackagePremiumMonthly)
				}
			}
			if(lStrPostPrePackagePremiumInstalment.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumInstalment,'NO OPTION')){
					lPostPrePackagePremiumInstalment=lStrPostPrePackagePremiumInstalment
				}else{
					lPostPrePackagePremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumInstalment,'Total='+lStrPostPrePackagePremiumInstalment)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositAmount,'NO OPTION')){
					lPostPrePackagePremiumNoDepositAmount=lStrPostPrePackagePremiumNoDepositAmount
				}else{
					lPostPrePackagePremiumNoDepositAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositAmount,'Amount='+lStrPostPrePackagePremiumNoDepositAmount)
				}
			}
			if(lStrPostPrePackagePremiumNoDepositTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumNoDepositTotal,'NO OPTION')){
					lPostPrePackagePremiumNoDepositTotal=lStrPostPrePackagePremiumNoDepositTotal
				}else{
					lPostPrePackagePremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumNoDepositTotal,'Total='+lStrPostPrePackagePremiumNoDepositTotal)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyAmount.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyAmount,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyAmount=lStrPostPrePackagePremiumQuarterlyAmount
				}else{
					lPostPrePackagePremiumQuarterlyAmount=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyAmount,'Amount='+lStrPostPrePackagePremiumQuarterlyAmount)
				}
			}
			if(lStrPostPrePackagePremiumQuarterlyTotal.length()>0){
				if(IGNUemaHelper.checkStringContainString(lPostPrePackagePremiumQuarterlyTotal,'NO OPTION')){
					lPostPrePackagePremiumQuarterlyTotal=lStrPostPrePackagePremiumQuarterlyTotal
				}else{
					lPostPrePackagePremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe(lPostPrePackagePremiumQuarterlyTotal,'Total='+lStrPostPrePackagePremiumQuarterlyTotal)
				}
			}
			lResult=lPostPrePackagePremiumYearly.length()>0
			if(lResult){
				lreturn.put('PostPrePackagePremiumYearly',lPostPrePackagePremiumYearly)
				lreturn.put('PostPrePackagePremiumDeposit',lPostPrePackagePremiumDeposit)
				lreturn.put('PostPrePackagePremiumMonthly',lPostPrePackagePremiumMonthly)
				lreturn.put('PostPrePackagePremiumInstalment',lPostPrePackagePremiumInstalment)
				lreturn.put('PostPrePackagePremiumNoDepositAmount',lPostPrePackagePremiumNoDepositAmount)
				lreturn.put('PostPrePackagePremiumNoDepositTotal',lPostPrePackagePremiumNoDepositTotal)
				lreturn.put('PostPrePackagePremiumQuarterlyAmount',lPostPrePackagePremiumQuarterlyAmount)
				lreturn.put('PostPrePackagePremiumQuarterlyTotal',lPostPrePackagePremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanType(String strPlanType){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPlanTypeA(strPlanType)
						break
					case 'B':
						lreturn=this.inputPlanTypeB(strPlanType)
						break
					case 'C':
						lreturn=this.inputPlanTypeC(strPlanType)
						break
					case 'D':
						lreturn=this.inputPlanTypeD(strPlanType)
						break
					case 'E':
						lreturn=this.inputPlanTypeE(strPlanType)
						break
					case 'F':
						lreturn=this.inputPlanTypeF(strPlanType)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPlanTypeB(strPlanType)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanTypeA(String strPlanType){
		Map lreturn=[:]
		String lPlanType=strPlanType.toUpperCase().trim()
		Map lPlanTypeList=['T1':'Type1','T2+':'Type2Plus','T3+':'Type3Plus','T2':'Type2','T3':'Type3']
		String lPlanTypeItem=lPlanTypeList.get(lPlanType)
		if(!lPlanTypeItem){
			lPlanTypeItem=lPlanTypeList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_TYPE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			String lTagButton='coverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='coverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanTypeItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanType.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanType.length()<=0){
							lPlanType=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanType.length()<=0){
					lPlanType='None'
				}
			}
			lResult=lPlanType.length()>0
			if(lResult){
				lreturn.put('PlanType',lPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanTypeB(String strPlanType){
		Map lreturn=[:]
		String lPlanType=strPlanType.toUpperCase().trim()
		Map lPlanTypeList=['T1':'Type1','T2+':'Type2Plus','T3+':'Type3Plus','T2':'Type2','T3':'Type3']
		String lPlanTypeItem=lPlanTypeList.get(lPlanType)
		if(!lPlanTypeItem){
			lPlanTypeItem=lPlanTypeList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_TYPE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			String lTagButton='coverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='coverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanTypeItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanType.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanType.length()<=0){
							lPlanType=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanType.length()<=0){
					lPlanType='None'
				}
			}
			lResult=lPlanType.length()>0
			if(lResult){
				lreturn.put('PlanType',lPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanTypeC(String strPlanType){
		Map lreturn=[:]
		String lPlanType=strPlanType.toUpperCase().trim()
		Map lPlanTypeList=['T1':'Type1','T2+':'Type2Plus','T3+':'Type3Plus','T2':'Type2','T3':'Type3']
		String lPlanTypeItem=lPlanTypeList.get(lPlanType)
		if(!lPlanTypeItem){
			lPlanTypeItem=lPlanTypeList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_TYPE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			String lTagButton='coverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='coverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanTypeItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanType.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanType.length()<=0){
							lPlanType=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanType.length()<=0){
					lPlanType='None'
				}
			}
			lResult=lPlanType.length()>0
			if(lResult){
				lreturn.put('PlanType',lPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanTypeD(String strPlanType){
		Map lreturn=[:]
		String lPlanType=strPlanType.toUpperCase().trim()
		Map lPlanTypeList=['T1':'Type1','T2+':'Type2Plus','T3+':'Type3Plus','T2':'Type2','T3':'Type3']
		String lPlanTypeItem=lPlanTypeList.get(lPlanType)
		if(!lPlanTypeItem){
			lPlanTypeItem=lPlanTypeList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_TYPE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			String lTagButton='coverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='coverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanTypeItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanType.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanType.length()<=0){
							lPlanType=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanType.length()<=0){
					lPlanType='None'
				}
			}
			lResult=lPlanType.length()>0
			if(lResult){
				lreturn.put('PlanType',lPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanTypeE(String strPlanType){
		Map lreturn=[:]
		String lPlanType=strPlanType.toUpperCase().trim()
		Map lPlanTypeList=['T1':'Type1','T2+':'Type2Plus','T3+':'Type3Plus','T2':'Type2','T3':'Type3']
		String lPlanTypeItem=lPlanTypeList.get(lPlanType)
		if(!lPlanTypeItem){
			lPlanTypeItem=lPlanTypeList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_TYPE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			String lTagButton='coverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='coverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanTypeItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanType.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanType.length()<=0){
							lPlanType=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanType.length()<=0){
					lPlanType='None'
				}
			}
			lResult=lPlanType.length()>0
			if(lResult){
				lreturn.put('PlanType',lPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanTypeF(String strPlanType){
		Map lreturn=[:]
		String lPlanType=strPlanType.toUpperCase().trim()
		Map lPlanTypeList=['T1':'Type1','T2+':'Type2Plus','T3+':'Type3Plus','T2':'Type2','T3':'Type3']
		String lPlanTypeItem=lPlanTypeList.get(lPlanType)
		if(!lPlanTypeItem){
			lPlanTypeItem=lPlanTypeList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_TYPE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			String lTagButton='coverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='coverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanTypeItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanType.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanType.length()<=0){
							lPlanType=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanType.length()<=0){
					lPlanType='None'
				}
			}
			lResult=lPlanType.length()>0
			if(lResult){
				lreturn.put('PlanType',lPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarage(String strPlanGarage){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPlanGarageA(strPlanGarage)
						break
					case 'B':
						lreturn=this.inputPlanGarageB(strPlanGarage)
						break
					case 'C':
						lreturn=this.inputPlanGarageC(strPlanGarage)
						break
					case 'D':
						lreturn=this.inputPlanGarageD(strPlanGarage)
						break
					case 'E':
						lreturn=this.inputPlanGarageE(strPlanGarage)
						break
					case 'F':
						lreturn=this.inputPlanGarageF(strPlanGarage)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPlanGarageB(strPlanGarage)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarageA(String strPlanGarage){
		Map lreturn=[:]
		String lPlanGarage=strPlanGarage.toUpperCase().trim()
		Map lPlanGarageList=['ANY':'AnyWorkshop','PANEL':'PanelWorkshop']
		String lPlanGarageItem=lPlanGarageList.get(lPlanGarage)
		if(!lPlanGarageItem){
			lPlanGarageItem=lPlanGarageList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			String lTagButton='workshop'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='garage-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanGarage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanGarageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanGarage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanGarage.length()<=0){
							lPlanGarage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanGarage.length()<=0){
					lPlanGarage='None'
				}
			}
			lResult=lPlanGarage.length()>0
			if(lResult){
				lreturn.put('PlanGarage',lPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarageB(String strPlanGarage){
		Map lreturn=[:]
		String lPlanGarage=strPlanGarage.toUpperCase().trim()
		Map lPlanGarageList=['ANY':'AnyWorkshop','PANEL':'PanelWorkshop']
		String lPlanGarageItem=lPlanGarageList.get(lPlanGarage)
		if(!lPlanGarageItem){
			lPlanGarageItem=lPlanGarageList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			String lTagButton='workshop'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='garage-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanGarage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanGarageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanGarage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanGarage.length()<=0){
							lPlanGarage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanGarage.length()<=0){
					lPlanGarage='None'
				}
			}
			lResult=lPlanGarage.length()>0
			if(lResult){
				lreturn.put('PlanGarage',lPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarageC(String strPlanGarage){
		Map lreturn=[:]
		String lPlanGarage=strPlanGarage.toUpperCase().trim()
		Map lPlanGarageList=['ANY':'AnyWorkshop','PANEL':'PanelWorkshop']
		String lPlanGarageItem=lPlanGarageList.get(lPlanGarage)
		if(!lPlanGarageItem){
			lPlanGarageItem=lPlanGarageList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			String lTagButton='workshop'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='garage-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanGarage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanGarageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanGarage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanGarage.length()<=0){
							lPlanGarage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanGarage.length()<=0){
					lPlanGarage='None'
				}
			}
			lResult=lPlanGarage.length()>0
			if(lResult){
				lreturn.put('PlanGarage',lPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarageD(String strPlanGarage){
		Map lreturn=[:]
		String lPlanGarage=strPlanGarage.toUpperCase().trim()
		Map lPlanGarageList=['ANY':'AnyWorkshop','PANEL':'PanelWorkshop']
		String lPlanGarageItem=lPlanGarageList.get(lPlanGarage)
		if(!lPlanGarageItem){
			lPlanGarageItem=lPlanGarageList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			String lTagButton='workshop'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='garage-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanGarage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanGarageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanGarage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanGarage.length()<=0){
							lPlanGarage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanGarage.length()<=0){
					lPlanGarage='None'
				}
			}
			lResult=lPlanGarage.length()>0
			if(lResult){
				lreturn.put('PlanGarage',lPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarageE(String strPlanGarage){
		Map lreturn=[:]
		String lPlanGarage=strPlanGarage.toUpperCase().trim()
		Map lPlanGarageList=['ANY':'AnyWorkshop','PANEL':'PanelWorkshop']
		String lPlanGarageItem=lPlanGarageList.get(lPlanGarage)
		if(!lPlanGarageItem){
			lPlanGarageItem=lPlanGarageList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			String lTagButton='workshop'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='garage-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanGarage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanGarageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanGarage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanGarage.length()<=0){
							lPlanGarage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanGarage.length()<=0){
					lPlanGarage='None'
				}
			}
			lResult=lPlanGarage.length()>0
			if(lResult){
				lreturn.put('PlanGarage',lPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanGarageF(String strPlanGarage){
		Map lreturn=[:]
		String lPlanGarage=strPlanGarage.toUpperCase().trim()
		Map lPlanGarageList=['ANY':'AnyWorkshop','PANEL':'PanelWorkshop']
		String lPlanGarageItem=lPlanGarageList.get(lPlanGarage)
		if(!lPlanGarageItem){
			lPlanGarageItem=lPlanGarageList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			String lTagButton='workshop'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='garage-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanGarage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanGarageItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanGarage.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanGarage.length()<=0){
							lPlanGarage=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanGarage.length()<=0){
					lPlanGarage='None'
				}
			}
			lResult=lPlanGarage.length()>0
			if(lResult){
				lreturn.put('PlanGarage',lPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcess(String strPlanExcess){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPlanExcessA(strPlanExcess)
						break
					case 'B':
						lreturn=this.inputPlanExcessB(strPlanExcess)
						break
					case 'C':
						lreturn=this.inputPlanExcessC(strPlanExcess)
						break
					case 'D':
						lreturn=this.inputPlanExcessD(strPlanExcess)
						break
					case 'E':
						lreturn=this.inputPlanExcessE(strPlanExcess)
						break
					case 'F':
						lreturn=this.inputPlanExcessF(strPlanExcess)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPlanExcessB(strPlanExcess)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcessA(String strPlanExcess){
		Map lreturn=[:]
		String lPlanExcess=strPlanExcess.toUpperCase().trim()
		Map lPlanExcessList=['0K':'0','1K':'1000','2K':'2000','3K':'3000','5K':'5000','10K':'10000','20K':'20000','30K':'30000','40K':'40000','50K':'50000']
		String lPlanExcessItem=lPlanExcessList.get(lPlanExcess)
		if(!lPlanExcessItem){
			lPlanExcessItem=lPlanExcessList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			String lTagButton='excessPrice'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='excessPrice-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanExcess=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanExcessItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanExcess.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanExcess.length()<=0){
							lPlanExcess=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanExcess.length()<=0){
					lPlanExcess='None'
				}
			}
			lResult=lPlanExcess.length()>0
			if(lResult){
				lreturn.put('PlanExcess',lPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcessB(String strPlanExcess){
		Map lreturn=[:]
		String lPlanExcess=strPlanExcess.toUpperCase().trim()
		Map lPlanExcessList=['0K':'0','1K':'1000','2K':'2000','3K':'3000','5K':'5000','10K':'10000','20K':'20000','30K':'30000','40K':'40000','50K':'50000']
		String lPlanExcessItem=lPlanExcessList.get(lPlanExcess)
		if(!lPlanExcessItem){
			lPlanExcessItem=lPlanExcessList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			String lTagButton='excessPrice'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='excessPrice-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanExcess=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanExcessItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanExcess.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanExcess.length()<=0){
							lPlanExcess=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanExcess.length()<=0){
					lPlanExcess='None'
				}
			}
			lResult=lPlanExcess.length()>0
			if(lResult){
				lreturn.put('PlanExcess',lPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcessC(String strPlanExcess){
		Map lreturn=[:]
		String lPlanExcess=strPlanExcess.toUpperCase().trim()
		Map lPlanExcessList=['0K':'0','1K':'1000','2K':'2000','3K':'3000','5K':'5000','10K':'10000','20K':'20000','30K':'30000','40K':'40000','50K':'50000']
		String lPlanExcessItem=lPlanExcessList.get(lPlanExcess)
		if(!lPlanExcessItem){
			lPlanExcessItem=lPlanExcessList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			String lTagButton='excessPrice'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='excessPrice-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanExcess=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanExcessItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanExcess.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanExcess.length()<=0){
							lPlanExcess=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanExcess.length()<=0){
					lPlanExcess='None'
				}
			}
			lResult=lPlanExcess.length()>0
			if(lResult){
				lreturn.put('PlanExcess',lPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcessD(String strPlanExcess){
		Map lreturn=[:]
		String lPlanExcess=strPlanExcess.toUpperCase().trim()
		Map lPlanExcessList=['0K':'0','1K':'1000','2K':'2000','3K':'3000','5K':'5000','10K':'10000','20K':'20000','30K':'30000','40K':'40000','50K':'50000']
		String lPlanExcessItem=lPlanExcessList.get(lPlanExcess)
		if(!lPlanExcessItem){
			lPlanExcessItem=lPlanExcessList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			String lTagButton='excessPrice'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='excessPrice-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanExcess=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanExcessItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanExcess.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanExcess.length()<=0){
							lPlanExcess=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanExcess.length()<=0){
					lPlanExcess='None'
				}
			}
			lResult=lPlanExcess.length()>0
			if(lResult){
				lreturn.put('PlanExcess',lPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcessE(String strPlanExcess){
		Map lreturn=[:]
		String lPlanExcess=strPlanExcess.toUpperCase().trim()
		Map lPlanExcessList=['0K':'0','1K':'1000','2K':'2000','3K':'3000','5K':'5000','10K':'10000','20K':'20000','30K':'30000','40K':'40000','50K':'50000']
		String lPlanExcessItem=lPlanExcessList.get(lPlanExcess)
		if(!lPlanExcessItem){
			lPlanExcessItem=lPlanExcessList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			String lTagButton='excessPrice'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='excessPrice-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanExcess=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanExcessItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanExcess.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanExcess.length()<=0){
							lPlanExcess=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanExcess.length()<=0){
					lPlanExcess='None'
				}
			}
			lResult=lPlanExcess.length()>0
			if(lResult){
				lreturn.put('PlanExcess',lPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanExcessF(String strPlanExcess){
		Map lreturn=[:]
		String lPlanExcess=strPlanExcess.toUpperCase().trim()
		Map lPlanExcessList=['0K':'0','1K':'1000','2K':'2000','3K':'3000','5K':'5000','10K':'10000','20K':'20000','30K':'30000','40K':'40000','50K':'50000']
		String lPlanExcessItem=lPlanExcessList.get(lPlanExcess)
		if(!lPlanExcessItem){
			lPlanExcessItem=lPlanExcessList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			String lTagButton='excessPrice'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='excessPrice-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanExcess=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanExcessItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanExcess.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanExcess.length()<=0){
							lPlanExcess=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanExcess.length()<=0){
					lPlanExcess='None'
				}
			}
			lResult=lPlanExcess.length()>0
			if(lResult){
				lreturn.put('PlanExcess',lPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriver(String strPlanDriver){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPlanDriverA(strPlanDriver)
						break
					case 'B':
						lreturn=this.inputPlanDriverB(strPlanDriver)
						break
					case 'C':
						lreturn=this.inputPlanDriverC(strPlanDriver)
						break
					case 'D':
						lreturn=this.inputPlanDriverD(strPlanDriver)
						break
					case 'E':
						lreturn=this.inputPlanDriverE(strPlanDriver)
						break
					case 'F':
						lreturn=this.inputPlanDriverF(strPlanDriver)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPlanDriverB(strPlanDriver)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriverA(String strPlanDriver){
		Map lreturn=[:]
		String lPlanDriver=strPlanDriver.toUpperCase().trim()
		Map lPlanDriverList=['ANY':'AnyDriver','25+':'AnyOver25','30+':'AnyOver30','NAMED':'Named']
		String lPlanDriverItem=lPlanDriverList.get(lPlanDriver)
		if(!lPlanDriverItem){
			lPlanDriverItem=lPlanDriverList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			String lTagButton='driverPlan'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='driverPlan-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanDriver=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanDriverItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanDriver.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanDriver.length()<=0){
							lPlanDriver=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanDriver.length()<=0){
					lPlanDriver='None'
				}
			}
			lResult=lPlanDriver.length()>0
			if(lResult){
				lreturn.put('PlanDriver',lPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriverB(String strPlanDriver){
		Map lreturn=[:]
		String lPlanDriver=strPlanDriver.toUpperCase().trim()
		Map lPlanDriverList=['ANY':'AnyDriver','25+':'AnyOver25','30+':'AnyOver30','NAMED':'Named']
		String lPlanDriverItem=lPlanDriverList.get(lPlanDriver)
		if(!lPlanDriverItem){
			lPlanDriverItem=lPlanDriverList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			String lTagButton='driverPlan'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='driverPlan-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanDriver=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanDriverItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanDriver.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanDriver.length()<=0){
							lPlanDriver=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanDriver.length()<=0){
					lPlanDriver='None'
				}
			}
			lResult=lPlanDriver.length()>0
			if(lResult){
				lreturn.put('PlanDriver',lPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriverC(String strPlanDriver){
		Map lreturn=[:]
		String lPlanDriver=strPlanDriver.toUpperCase().trim()
		Map lPlanDriverList=['ANY':'AnyDriver','25+':'AnyOver25','30+':'AnyOver30','NAMED':'Named']
		String lPlanDriverItem=lPlanDriverList.get(lPlanDriver)
		if(!lPlanDriverItem){
			lPlanDriverItem=lPlanDriverList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			String lTagButton='driverPlan'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='driverPlan-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanDriver=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanDriverItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanDriver.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanDriver.length()<=0){
							lPlanDriver=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanDriver.length()<=0){
					lPlanDriver='None'
				}
			}
			lResult=lPlanDriver.length()>0
			if(lResult){
				lreturn.put('PlanDriver',lPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriverD(String strPlanDriver){
		Map lreturn=[:]
		String lPlanDriver=strPlanDriver.toUpperCase().trim()
		Map lPlanDriverList=['ANY':'AnyDriver','25+':'AnyOver25','30+':'AnyOver30','NAMED':'Named']
		String lPlanDriverItem=lPlanDriverList.get(lPlanDriver)
		if(!lPlanDriverItem){
			lPlanDriverItem=lPlanDriverList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			String lTagButton='driverPlan'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='driverPlan-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanDriver=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanDriverItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanDriver.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanDriver.length()<=0){
							lPlanDriver=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanDriver.length()<=0){
					lPlanDriver='None'
				}
			}
			lResult=lPlanDriver.length()>0
			if(lResult){
				lreturn.put('PlanDriver',lPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriverE(String strPlanDriver){
		Map lreturn=[:]
		String lPlanDriver=strPlanDriver.toUpperCase().trim()
		Map lPlanDriverList=['ANY':'AnyDriver','25+':'AnyOver25','30+':'AnyOver30','NAMED':'Named']
		String lPlanDriverItem=lPlanDriverList.get(lPlanDriver)
		if(!lPlanDriverItem){
			lPlanDriverItem=lPlanDriverList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			String lTagButton='driverPlan'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='driverPlan-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanDriver=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanDriverItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanDriver.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanDriver.length()<=0){
							lPlanDriver=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanDriver.length()<=0){
					lPlanDriver='None'
				}
			}
			lResult=lPlanDriver.length()>0
			if(lResult){
				lreturn.put('PlanDriver',lPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPlanDriverF(String strPlanDriver){
		Map lreturn=[:]
		String lPlanDriver=strPlanDriver.toUpperCase().trim()
		Map lPlanDriverList=['ANY':'AnyDriver','25+':'AnyOver25','30+':'AnyOver30','NAMED':'Named']
		String lPlanDriverItem=lPlanDriverList.get(lPlanDriver)
		if(!lPlanDriverItem){
			lPlanDriverItem=lPlanDriverList.get(THAMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			String lTagButton='driverPlan'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='driverPlan-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lPlanDriver=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPlanDriverItem,false)
			Boolean lValid=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButton)
			if(lValid){
				if(lPlanDriver.length()<=0){
					WebElement lDefaultButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(lDefaultButtonItem){
						lPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lDefaultButtonItem)
						if(lPlanDriver.length()<=0){
							lPlanDriver=lDefaultButtonItem.getText()
						}
					}
				}
				WebElement lButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(lButtonOpen){
					IGNUemaHelper.webJsScrollToElement(this.driver,lButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lButtonStage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lButtonOpen,'aria-expanded')
					Boolean lIsButtonOpen=IGNUemaHelper.convertStringToBoolean(lButtonStage)
					if(lIsButtonOpen){
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lButtonOpen)){
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}else{
				if(lPlanDriver.length()<=0){
					lPlanDriver='None'
				}
			}
			lResult=lPlanDriver.length()>0
			if(lResult){
				lreturn.put('PlanDriver',lPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsory(String strCompulsory){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCompulsoryA(strCompulsory)
						break
					case 'B':
						lreturn=this.inputCompulsoryB(strCompulsory)
						break
					case 'C':
						lreturn=this.inputCompulsoryC(strCompulsory)
						break
					case 'D':
						lreturn=this.inputCompulsoryD(strCompulsory)
						break
					case 'E':
						lreturn=this.inputCompulsoryE(strCompulsory)
						break
					case 'F':
						lreturn=this.inputCompulsoryF(strCompulsory)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCompulsoryB(strCompulsory)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsoryA(String strCompulsory){
		Map lreturn=[:]
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THAMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsCompulsory=IGNUemaHelper.convertStringToBoolean(lCompulsory)
			String lTagCheckbox='includeCompulsory'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCompulsory='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NOCOMP')){
					if(lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCompulsory.length()>0
			if(lResult){
				lreturn.put('Compulsory',lCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsoryB(String strCompulsory){
		Map lreturn=[:]
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THAMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsCompulsory=IGNUemaHelper.convertStringToBoolean(lCompulsory)
			String lTagCheckbox='includeCompulsory'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCompulsory='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NOCOMP')){
					if(lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCompulsory.length()>0
			if(lResult){
				lreturn.put('Compulsory',lCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsoryC(String strCompulsory){
		Map lreturn=[:]
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THAMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsCompulsory=IGNUemaHelper.convertStringToBoolean(lCompulsory)
			String lTagCheckbox='includeCompulsory'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCompulsory='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NOCOMP')){
					if(lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCompulsory.length()>0
			if(lResult){
				lreturn.put('Compulsory',lCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsoryD(String strCompulsory){
		Map lreturn=[:]
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THAMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsCompulsory=IGNUemaHelper.convertStringToBoolean(lCompulsory)
			String lTagCheckbox='includeCompulsory'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCompulsory='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NOCOMP')){
					if(lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCompulsory.length()>0
			if(lResult){
				lreturn.put('Compulsory',lCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsoryE(String strCompulsory){
		Map lreturn=[:]
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THAMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsCompulsory=IGNUemaHelper.convertStringToBoolean(lCompulsory)
			String lTagCheckbox='includeCompulsory'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCompulsory='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NOCOMP')){
					if(lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCompulsory.length()>0
			if(lResult){
				lreturn.put('Compulsory',lCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCompulsoryF(String strCompulsory){
		Map lreturn=[:]
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THAMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsCompulsory=IGNUemaHelper.convertStringToBoolean(lCompulsory)
			String lTagCheckbox='includeCompulsory'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCompulsory='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NOCOMP')){
					if(lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCompulsory){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCompulsory.length()>0
			if(lResult){
				lreturn.put('Compulsory',lCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsa(String strWithRsa){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputWithRsaA(strWithRsa)
						break
					case 'B':
						lreturn=this.inputWithRsaB(strWithRsa)
						break
					case 'C':
						lreturn=this.inputWithRsaC(strWithRsa)
						break
					case 'D':
						lreturn=this.inputWithRsaD(strWithRsa)
						break
					case 'E':
						lreturn=this.inputWithRsaE(strWithRsa)
						break
					case 'F':
						lreturn=this.inputWithRsaF(strWithRsa)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputWithRsaB(strWithRsa)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsaA(String strWithRsa){
		Map lreturn=[:]
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THAMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsWithRsa=IGNUemaHelper.convertStringToBoolean(lWithRsa)
			String lTagCheckbox='rsaProduct'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lWithRsa='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.length()<=0){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				}
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lWithRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lWithRsa.length()>0
			if(lResult){
				lreturn.put('WithRsa',lWithRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsaB(String strWithRsa){
		Map lreturn=[:]
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THAMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsWithRsa=IGNUemaHelper.convertStringToBoolean(lWithRsa)
			String lTagCheckbox='rsaProduct'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lWithRsa='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.length()<=0){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				}
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lWithRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lWithRsa.length()>0
			if(lResult){
				lreturn.put('WithRsa',lWithRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsaC(String strWithRsa){
		Map lreturn=[:]
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THAMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsWithRsa=IGNUemaHelper.convertStringToBoolean(lWithRsa)
			String lTagCheckbox='rsaProduct'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lWithRsa='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.length()<=0){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				}
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lWithRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lWithRsa.length()>0
			if(lResult){
				lreturn.put('WithRsa',lWithRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsaD(String strWithRsa){
		Map lreturn=[:]
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THAMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsWithRsa=IGNUemaHelper.convertStringToBoolean(lWithRsa)
			String lTagCheckbox='rsaProduct'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lWithRsa='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.length()<=0){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				}
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lWithRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lWithRsa.length()>0
			if(lResult){
				lreturn.put('WithRsa',lWithRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsaE(String strWithRsa){
		Map lreturn=[:]
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THAMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsWithRsa=IGNUemaHelper.convertStringToBoolean(lWithRsa)
			String lTagCheckbox='rsaProduct'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lWithRsa='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.length()<=0){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				}
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lWithRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lWithRsa.length()>0
			if(lResult){
				lreturn.put('WithRsa',lWithRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWithRsaF(String strWithRsa){
		Map lreturn=[:]
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THAMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsWithRsa=IGNUemaHelper.convertStringToBoolean(lWithRsa)
			String lTagCheckbox='rsaProduct'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lWithRsa='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.length()<=0){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				}
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsWithRsa){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lWithRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lWithRsa.length()>0
			if(lResult){
				lreturn.put('WithRsa',lWithRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBI(String strVoluntaryTPBI){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputVoluntaryTPBIA(strVoluntaryTPBI)
						break
					case 'B':
						lreturn=this.inputVoluntaryTPBIB(strVoluntaryTPBI)
						break
					case 'C':
						lreturn=this.inputVoluntaryTPBIC(strVoluntaryTPBI)
						break
					case 'D':
						lreturn=this.inputVoluntaryTPBID(strVoluntaryTPBI)
						break
					case 'E':
						lreturn=this.inputVoluntaryTPBIE(strVoluntaryTPBI)
						break
					case 'F':
						lreturn=this.inputVoluntaryTPBIF(strVoluntaryTPBI)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputVoluntaryTPBIB(strVoluntaryTPBI)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBIA(String strVoluntaryTPBI){
		Map lreturn=[:]
		String lVoluntaryTPBI=strVoluntaryTPBI.toUpperCase().trim()
		Map lVoluntaryTPBIList=['500K':'500000','1M':'1000000','2M':'2000000','3M':'3000000','5M':'5000000']
		String lVoluntaryTPBIItem=lVoluntaryTPBIList.get(lVoluntaryTPBI)
		if(!lVoluntaryTPBIItem){
			lVoluntaryTPBIItem=lVoluntaryTPBIList.get(THAMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			String lTagValue='benefitsTPBIPremSI'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lVoluntaryTPBI='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='tpbi-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lVoluntaryTPBIItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lVoluntaryTPBIItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lVoluntaryTPBI=lValueStr
			}
			lResult=lVoluntaryTPBI.length()>0
			if(lResult){
				lreturn.put('VoluntaryTPBI',lVoluntaryTPBI)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBIB(String strVoluntaryTPBI){
		Map lreturn=[:]
		String lVoluntaryTPBI=strVoluntaryTPBI.toUpperCase().trim()
		Map lVoluntaryTPBIList=['500K':'500000','1M':'1000000','2M':'2000000','3M':'3000000','5M':'5000000']
		String lVoluntaryTPBIItem=lVoluntaryTPBIList.get(lVoluntaryTPBI)
		if(!lVoluntaryTPBIItem){
			lVoluntaryTPBIItem=lVoluntaryTPBIList.get(THAMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			String lTagValue='benefitsTPBIPremSI'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lVoluntaryTPBI='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='tpbi-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lVoluntaryTPBIItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lVoluntaryTPBIItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lVoluntaryTPBI=lValueStr
			}
			lResult=lVoluntaryTPBI.length()>0
			if(lResult){
				lreturn.put('VoluntaryTPBI',lVoluntaryTPBI)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBIC(String strVoluntaryTPBI){
		Map lreturn=[:]
		String lVoluntaryTPBI=strVoluntaryTPBI.toUpperCase().trim()
		Map lVoluntaryTPBIList=['500K':'500000','1M':'1000000','2M':'2000000','3M':'3000000','5M':'5000000']
		String lVoluntaryTPBIItem=lVoluntaryTPBIList.get(lVoluntaryTPBI)
		if(!lVoluntaryTPBIItem){
			lVoluntaryTPBIItem=lVoluntaryTPBIList.get(THAMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			String lTagValue='benefitsTPBIPremSI'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lVoluntaryTPBI='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='tpbi-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lVoluntaryTPBIItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lVoluntaryTPBIItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lVoluntaryTPBI=lValueStr
			}
			lResult=lVoluntaryTPBI.length()>0
			if(lResult){
				lreturn.put('VoluntaryTPBI',lVoluntaryTPBI)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBID(String strVoluntaryTPBI){
		Map lreturn=[:]
		String lVoluntaryTPBI=strVoluntaryTPBI.toUpperCase().trim()
		Map lVoluntaryTPBIList=['500K':'500000','1M':'1000000','2M':'2000000','3M':'3000000','5M':'5000000']
		String lVoluntaryTPBIItem=lVoluntaryTPBIList.get(lVoluntaryTPBI)
		if(!lVoluntaryTPBIItem){
			lVoluntaryTPBIItem=lVoluntaryTPBIList.get(THAMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			String lTagValue='benefitsTPBIPremSI'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lVoluntaryTPBI='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='tpbi-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lVoluntaryTPBIItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lVoluntaryTPBIItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lVoluntaryTPBI=lValueStr
			}
			lResult=lVoluntaryTPBI.length()>0
			if(lResult){
				lreturn.put('VoluntaryTPBI',lVoluntaryTPBI)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBIE(String strVoluntaryTPBI){
		Map lreturn=[:]
		String lVoluntaryTPBI=strVoluntaryTPBI.toUpperCase().trim()
		Map lVoluntaryTPBIList=['500K':'500000','1M':'1000000','2M':'2000000','3M':'3000000','5M':'5000000']
		String lVoluntaryTPBIItem=lVoluntaryTPBIList.get(lVoluntaryTPBI)
		if(!lVoluntaryTPBIItem){
			lVoluntaryTPBIItem=lVoluntaryTPBIList.get(THAMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			String lTagValue='benefitsTPBIPremSI'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lVoluntaryTPBI='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='tpbi-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lVoluntaryTPBIItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lVoluntaryTPBIItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lVoluntaryTPBI=lValueStr
			}
			lResult=lVoluntaryTPBI.length()>0
			if(lResult){
				lreturn.put('VoluntaryTPBI',lVoluntaryTPBI)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVoluntaryTPBIF(String strVoluntaryTPBI){
		Map lreturn=[:]
		String lVoluntaryTPBI=strVoluntaryTPBI.toUpperCase().trim()
		Map lVoluntaryTPBIList=['500K':'500000','1M':'1000000','2M':'2000000','3M':'3000000','5M':'5000000']
		String lVoluntaryTPBIItem=lVoluntaryTPBIList.get(lVoluntaryTPBI)
		if(!lVoluntaryTPBIItem){
			lVoluntaryTPBIItem=lVoluntaryTPBIList.get(THAMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTPBI','')
			lreturn.put('Result',lResult)
			String lTagValue='benefitsTPBIPremSI'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lVoluntaryTPBI='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='tpbi-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lVoluntaryTPBIItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lVoluntaryTPBIItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lVoluntaryTPBI=lValueStr
			}
			lResult=lVoluntaryTPBI.length()>0
			if(lResult){
				lreturn.put('VoluntaryTPBI',lVoluntaryTPBI)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMe(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentPaAndMeA(strPersonalAccidentPaAndMe)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentPaAndMeB(strPersonalAccidentPaAndMe)
						break
					case 'C':
						lreturn=this.inputPersonalAccidentPaAndMeC(strPersonalAccidentPaAndMe)
						break
					case 'D':
						lreturn=this.inputPersonalAccidentPaAndMeD(strPersonalAccidentPaAndMe)
						break
					case 'E':
						lreturn=this.inputPersonalAccidentPaAndMeE(strPersonalAccidentPaAndMe)
						break
					case 'F':
						lreturn=this.inputPersonalAccidentPaAndMeF(strPersonalAccidentPaAndMe)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentPaAndMeB(strPersonalAccidentPaAndMe)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMeA(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.toUpperCase().trim()
		Map lPersonalAccidentPaAndMeList=['100K':'100000','200K':'200000','500K':'500000']
		String lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(lPersonalAccidentPaAndMe)
		if(!lPersonalAccidentPaAndMeItem){
			lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaAndMe='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='pa-me-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaAndMe=lValueStr
			}
			lResult=lPersonalAccidentPaAndMe.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaAndMe',lPersonalAccidentPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMeB(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.toUpperCase().trim()
		Map lPersonalAccidentPaAndMeList=['100K':'100000','200K':'200000','500K':'500000']
		String lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(lPersonalAccidentPaAndMe)
		if(!lPersonalAccidentPaAndMeItem){
			lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaAndMe='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='pa-me-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaAndMe=lValueStr
			}
			lResult=lPersonalAccidentPaAndMe.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaAndMe',lPersonalAccidentPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMeC(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.toUpperCase().trim()
		Map lPersonalAccidentPaAndMeList=['100K':'100000','200K':'200000','500K':'500000']
		String lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(lPersonalAccidentPaAndMe)
		if(!lPersonalAccidentPaAndMeItem){
			lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaAndMe='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='pa-me-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaAndMe=lValueStr
			}
			lResult=lPersonalAccidentPaAndMe.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaAndMe',lPersonalAccidentPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMeD(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.toUpperCase().trim()
		Map lPersonalAccidentPaAndMeList=['100K':'100000','200K':'200000','500K':'500000']
		String lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(lPersonalAccidentPaAndMe)
		if(!lPersonalAccidentPaAndMeItem){
			lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaAndMe='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='pa-me-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaAndMe=lValueStr
			}
			lResult=lPersonalAccidentPaAndMe.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaAndMe',lPersonalAccidentPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMeE(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.toUpperCase().trim()
		Map lPersonalAccidentPaAndMeList=['100K':'100000','200K':'200000','500K':'500000']
		String lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(lPersonalAccidentPaAndMe)
		if(!lPersonalAccidentPaAndMeItem){
			lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaAndMe='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='pa-me-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaAndMe=lValueStr
			}
			lResult=lPersonalAccidentPaAndMe.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaAndMe',lPersonalAccidentPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaAndMeF(String strPersonalAccidentPaAndMe){
		Map lreturn=[:]
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.toUpperCase().trim()
		Map lPersonalAccidentPaAndMeList=['100K':'100000','200K':'200000','500K':'500000']
		String lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(lPersonalAccidentPaAndMe)
		if(!lPersonalAccidentPaAndMeItem){
			lPersonalAccidentPaAndMeItem=lPersonalAccidentPaAndMeList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaAndMe='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='pa-me-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaAndMeItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaAndMe=lValueStr
			}
			lResult=lPersonalAccidentPaAndMe.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaAndMe',lPersonalAccidentPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnly(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentPaOnlyA(strPersonalAccidentPaOnly)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentPaOnlyB(strPersonalAccidentPaOnly)
						break
					case 'C':
						lreturn=this.inputPersonalAccidentPaOnlyC(strPersonalAccidentPaOnly)
						break
					case 'D':
						lreturn=this.inputPersonalAccidentPaOnlyD(strPersonalAccidentPaOnly)
						break
					case 'E':
						lreturn=this.inputPersonalAccidentPaOnlyE(strPersonalAccidentPaOnly)
						break
					case 'F':
						lreturn=this.inputPersonalAccidentPaOnlyF(strPersonalAccidentPaOnly)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentPaOnlyB(strPersonalAccidentPaOnly)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnlyA(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.toUpperCase().trim()
		Map lPersonalAccidentPaOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(lPersonalAccidentPaOnly)
		if(!lPersonalAccidentPaOnlyItem){
			lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='PA-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaOnly=lValueStr
			}
			lResult=lPersonalAccidentPaOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaOnly',lPersonalAccidentPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnlyB(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.toUpperCase().trim()
		Map lPersonalAccidentPaOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(lPersonalAccidentPaOnly)
		if(!lPersonalAccidentPaOnlyItem){
			lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='PA-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaOnly=lValueStr
			}
			lResult=lPersonalAccidentPaOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaOnly',lPersonalAccidentPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnlyC(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.toUpperCase().trim()
		Map lPersonalAccidentPaOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(lPersonalAccidentPaOnly)
		if(!lPersonalAccidentPaOnlyItem){
			lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='PA-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaOnly=lValueStr
			}
			lResult=lPersonalAccidentPaOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaOnly',lPersonalAccidentPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnlyD(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.toUpperCase().trim()
		Map lPersonalAccidentPaOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(lPersonalAccidentPaOnly)
		if(!lPersonalAccidentPaOnlyItem){
			lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='PA-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaOnly=lValueStr
			}
			lResult=lPersonalAccidentPaOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaOnly',lPersonalAccidentPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnlyE(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.toUpperCase().trim()
		Map lPersonalAccidentPaOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(lPersonalAccidentPaOnly)
		if(!lPersonalAccidentPaOnlyItem){
			lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='PA-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaOnly=lValueStr
			}
			lResult=lPersonalAccidentPaOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaOnly',lPersonalAccidentPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentPaOnlyF(String strPersonalAccidentPaOnly){
		Map lreturn=[:]
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.toUpperCase().trim()
		Map lPersonalAccidentPaOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(lPersonalAccidentPaOnly)
		if(!lPersonalAccidentPaOnlyItem){
			lPersonalAccidentPaOnlyItem=lPersonalAccidentPaOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='pa-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentPaOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='PA-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentPaOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentPaOnly=lValueStr
			}
			lResult=lPersonalAccidentPaOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentPaOnly',lPersonalAccidentPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnly(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPersonalAccidentMeOnlyA(strPersonalAccidentMeOnly)
						break
					case 'B':
						lreturn=this.inputPersonalAccidentMeOnlyB(strPersonalAccidentMeOnly)
						break
					case 'C':
						lreturn=this.inputPersonalAccidentMeOnlyC(strPersonalAccidentMeOnly)
						break
					case 'D':
						lreturn=this.inputPersonalAccidentMeOnlyD(strPersonalAccidentMeOnly)
						break
					case 'E':
						lreturn=this.inputPersonalAccidentMeOnlyE(strPersonalAccidentMeOnly)
						break
					case 'F':
						lreturn=this.inputPersonalAccidentMeOnlyF(strPersonalAccidentMeOnly)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPersonalAccidentMeOnlyB(strPersonalAccidentMeOnly)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnlyA(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.toUpperCase().trim()
		Map lPersonalAccidentMeOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(lPersonalAccidentMeOnly)
		if(!lPersonalAccidentMeOnlyItem){
			lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentMeOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='ME-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentMeOnly=lValueStr
			}
			lResult=lPersonalAccidentMeOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMeOnly',lPersonalAccidentMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnlyB(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.toUpperCase().trim()
		Map lPersonalAccidentMeOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(lPersonalAccidentMeOnly)
		if(!lPersonalAccidentMeOnlyItem){
			lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentMeOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='ME-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentMeOnly=lValueStr
			}
			lResult=lPersonalAccidentMeOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMeOnly',lPersonalAccidentMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnlyC(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.toUpperCase().trim()
		Map lPersonalAccidentMeOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(lPersonalAccidentMeOnly)
		if(!lPersonalAccidentMeOnlyItem){
			lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentMeOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='ME-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentMeOnly=lValueStr
			}
			lResult=lPersonalAccidentMeOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMeOnly',lPersonalAccidentMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnlyD(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.toUpperCase().trim()
		Map lPersonalAccidentMeOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(lPersonalAccidentMeOnly)
		if(!lPersonalAccidentMeOnlyItem){
			lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentMeOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='ME-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentMeOnly=lValueStr
			}
			lResult=lPersonalAccidentMeOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMeOnly',lPersonalAccidentMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnlyE(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.toUpperCase().trim()
		Map lPersonalAccidentMeOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(lPersonalAccidentMeOnly)
		if(!lPersonalAccidentMeOnlyItem){
			lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentMeOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='ME-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentMeOnly=lValueStr
			}
			lResult=lPersonalAccidentMeOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMeOnly',lPersonalAccidentMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPersonalAccidentMeOnlyF(String strPersonalAccidentMeOnly){
		Map lreturn=[:]
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.toUpperCase().trim()
		Map lPersonalAccidentMeOnlyList=['50K':'50000','100K':'100000','200K':'200000']
		String lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(lPersonalAccidentMeOnly)
		if(!lPersonalAccidentMeOnlyItem){
			lPersonalAccidentMeOnlyItem=lPersonalAccidentMeOnlyList.get(THAMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY.toUpperCase())
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			String lTagValue='me-benefit'
			String lLocatorValue=IGNUemaHelper.getTagDataSeleniumKey(lTagValue)
			WebElement lElementValue=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagValue)
			if(!lElementValue){
				lPersonalAccidentMeOnly='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementValue)
				IGNUemaHelper.delayThreadSecond(1)
				String lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				String lTagButtonTarget='ME-item'
				String lLocatorButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				WebElement lElementButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonTarget,lPersonalAccidentMeOnlyItem)
				if(lElementButtonTarget){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonTarget)
					IGNUemaHelper.delayThreadSecond(1)
					lValueStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementValue)
				}
				lPersonalAccidentMeOnly=lValueStr
			}
			lResult=lPersonalAccidentMeOnly.length()>0
			if(lResult){
				lreturn.put('PersonalAccidentMeOnly',lPersonalAccidentMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalService(String strCarRentalService){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarRentalServiceA(strCarRentalService)
						break
					case 'B':
						lreturn=this.inputCarRentalServiceB(strCarRentalService)
						break
					case 'C':
						lreturn=this.inputCarRentalServiceC(strCarRentalService)
						break
					case 'D':
						lreturn=this.inputCarRentalServiceD(strCarRentalService)
						break
					case 'E':
						lreturn=this.inputCarRentalServiceE(strCarRentalService)
						break
					case 'F':
						lreturn=this.inputCarRentalServiceF(strCarRentalService)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarRentalServiceB(strCarRentalService)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalServiceA(String strCarRentalService){
		Map lreturn=[:]
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THAMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Boolean lIsCarRentalService=IGNUemaHelper.convertStringToBoolean(lCarRentalService)
			String lTagCheckbox='carRentalService'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCarRentalService='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCarRentalService=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCarRentalService.length()>0
			if(lResult){
				lreturn.put('CarRentalService',lCarRentalService)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalServiceB(String strCarRentalService){
		Map lreturn=[:]
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THAMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Boolean lIsCarRentalService=IGNUemaHelper.convertStringToBoolean(lCarRentalService)
			String lTagCheckbox='carRentalService'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCarRentalService='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCarRentalService=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCarRentalService.length()>0
			if(lResult){
				lreturn.put('CarRentalService',lCarRentalService)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalServiceC(String strCarRentalService){
		Map lreturn=[:]
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THAMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Boolean lIsCarRentalService=IGNUemaHelper.convertStringToBoolean(lCarRentalService)
			String lTagCheckbox='carRentalService'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCarRentalService='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCarRentalService=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCarRentalService.length()>0
			if(lResult){
				lreturn.put('CarRentalService',lCarRentalService)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalServiceD(String strCarRentalService){
		Map lreturn=[:]
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THAMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Boolean lIsCarRentalService=IGNUemaHelper.convertStringToBoolean(lCarRentalService)
			String lTagCheckbox='carRentalService'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCarRentalService='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCarRentalService=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCarRentalService.length()>0
			if(lResult){
				lreturn.put('CarRentalService',lCarRentalService)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalServiceE(String strCarRentalService){
		Map lreturn=[:]
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THAMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Boolean lIsCarRentalService=IGNUemaHelper.convertStringToBoolean(lCarRentalService)
			String lTagCheckbox='carRentalService'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCarRentalService='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCarRentalService=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCarRentalService.length()>0
			if(lResult){
				lreturn.put('CarRentalService',lCarRentalService)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRentalServiceF(String strCarRentalService){
		Map lreturn=[:]
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THAMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Boolean lIsCarRentalService=IGNUemaHelper.convertStringToBoolean(lCarRentalService)
			String lTagCheckbox='carRentalService'
			String lLocatorCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckbox)
			WebElement lElementCheckbox=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckbox)
			if(!lElementCheckbox){
				lCarRentalService='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCheckbox)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
				IGNUemaHelper.delayThreadSecond(1)
				String lCheckboxStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
				if(lCheckboxStageStr.equalsIgnoreCase('NO')){
					if(lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}else{
					if(!lIsCarRentalService){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckbox)
					}
				}
				lCarRentalService=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckbox)
			}
			lResult=lCarRentalService.length()>0
			if(lResult){
				lreturn.put('CarRentalService',lCarRentalService)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAccessoryAdd(String strAccessoryAdd,String strAccessoryCarryBoyAdd,String strAccessoryCarryBoyOption,String strAccessoryGasFuelingSystemAdd,String strAccessoryGasFuelingSystemOption,String strAccessoryBodyKitAdd,String strAccessoryBodyKitOption,String strAccessoryRimsTiresAdd,String strAccessoryRimsTiresOption,String strAccessorySolarFilmAdd,String strAccessorySolarFilmOption,String strAccessorySuspensionStabilizerSystemAdd,String strAccessorySuspensionStabilizerSystemOption,String strAccessoryInVehicleEntertainmentSystemAdd,String strAccessoryInVehicleEntertainmentSystemOption,String strAccessoryAirIntakeExhaustSystemAdd,String strAccessoryAirIntakeExhaustSystemOption,String strAccessoryCarCameraAdd,String strAccessoryCarCameraOption){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('AccessoryAdd','')
			lreturn.put('AccessoryCarryBoyAdd','')
			lreturn.put('AccessoryCarryBoyOption','')
			lreturn.put('AccessoryGasFuelingSystemAdd','')
			lreturn.put('AccessoryGasFuelingSystemOption','')
			lreturn.put('AccessoryBodyKitAdd','')
			lreturn.put('AccessoryBodyKitOption','')
			lreturn.put('AccessoryRimsTiresAdd','')
			lreturn.put('AccessoryRimsTiresOption','')
			lreturn.put('AccessorySolarFilmAdd','')
			lreturn.put('AccessorySolarFilmOption','')
			lreturn.put('AccessorySuspensionStabilizerSystemAdd','')
			lreturn.put('AccessorySuspensionStabilizerSystemOption','')
			lreturn.put('AccessoryInVehicleEntertainmentSystemAdd','')
			lreturn.put('AccessoryInVehicleEntertainmentSystemOption','')
			lreturn.put('AccessoryAirIntakeExhaustSystemAdd','')
			lreturn.put('AccessoryAirIntakeExhaustSystemOption','')
			lreturn.put('AccessoryCarCameraAdd','')
			lreturn.put('AccessoryCarCameraOption','')
			lreturn.put('AccessoryAmount','')
			lreturn.put('AccessoryDetail','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputAccessoryAddA(strAccessoryAdd,strAccessoryCarryBoyAdd,strAccessoryCarryBoyOption,strAccessoryGasFuelingSystemAdd,strAccessoryGasFuelingSystemOption,strAccessoryBodyKitAdd,strAccessoryBodyKitOption,strAccessoryRimsTiresAdd,strAccessoryRimsTiresOption,strAccessorySolarFilmAdd,strAccessorySolarFilmOption,strAccessorySuspensionStabilizerSystemAdd,strAccessorySuspensionStabilizerSystemOption,strAccessoryInVehicleEntertainmentSystemAdd,strAccessoryInVehicleEntertainmentSystemOption,strAccessoryAirIntakeExhaustSystemAdd,strAccessoryAirIntakeExhaustSystemOption,strAccessoryCarCameraAdd,strAccessoryCarCameraOption)
						break
					case 'B':
						lreturn=this.inputAccessoryAddB(strAccessoryAdd,strAccessoryCarryBoyAdd,strAccessoryCarryBoyOption,strAccessoryGasFuelingSystemAdd,strAccessoryGasFuelingSystemOption,strAccessoryBodyKitAdd,strAccessoryBodyKitOption,strAccessoryRimsTiresAdd,strAccessoryRimsTiresOption,strAccessorySolarFilmAdd,strAccessorySolarFilmOption,strAccessorySuspensionStabilizerSystemAdd,strAccessorySuspensionStabilizerSystemOption,strAccessoryInVehicleEntertainmentSystemAdd,strAccessoryInVehicleEntertainmentSystemOption,strAccessoryAirIntakeExhaustSystemAdd,strAccessoryAirIntakeExhaustSystemOption,strAccessoryCarCameraAdd,strAccessoryCarCameraOption)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputAccessoryAddB(strAccessoryAdd,strAccessoryCarryBoyAdd,strAccessoryCarryBoyOption,strAccessoryGasFuelingSystemAdd,strAccessoryGasFuelingSystemOption,strAccessoryBodyKitAdd,strAccessoryBodyKitOption,strAccessoryRimsTiresAdd,strAccessoryRimsTiresOption,strAccessorySolarFilmAdd,strAccessorySolarFilmOption,strAccessorySuspensionStabilizerSystemAdd,strAccessorySuspensionStabilizerSystemOption,strAccessoryInVehicleEntertainmentSystemAdd,strAccessoryInVehicleEntertainmentSystemOption,strAccessoryAirIntakeExhaustSystemAdd,strAccessoryAirIntakeExhaustSystemOption,strAccessoryCarCameraAdd,strAccessoryCarCameraOption)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAccessoryAddA(String strAccessoryAdd,String strAccessoryCarryBoyAdd,String strAccessoryCarryBoyOption,String strAccessoryGasFuelingSystemAdd,String strAccessoryGasFuelingSystemOption,String strAccessoryBodyKitAdd,String strAccessoryBodyKitOption,String strAccessoryRimsTiresAdd,String strAccessoryRimsTiresOption,String strAccessorySolarFilmAdd,String strAccessorySolarFilmOption,String strAccessorySuspensionStabilizerSystemAdd,String strAccessorySuspensionStabilizerSystemOption,String strAccessoryInVehicleEntertainmentSystemAdd,String strAccessoryInVehicleEntertainmentSystemOption,String strAccessoryAirIntakeExhaustSystemAdd,String strAccessoryAirIntakeExhaustSystemOption,String strAccessoryCarCameraAdd,String strAccessoryCarCameraOption){
		Map lreturn=[:]
		String lAccessoryAdd=strAccessoryAdd.trim()
		if(lAccessoryAdd.length()<=0){
			lAccessoryAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_ADD
		}
		String lAccessoryCarryBoyAdd=strAccessoryCarryBoyAdd.trim()
		if(lAccessoryCarryBoyAdd.length()<=0){
			lAccessoryCarryBoyAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_ADD
		}
		String lAccessoryCarryBoyOption=strAccessoryCarryBoyOption.trim()
		if(lAccessoryCarryBoyOption.length()<=0){
			lAccessoryCarryBoyOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION
		}
		String lAccessoryGasFuelingSystemAdd=strAccessoryGasFuelingSystemAdd.trim()
		if(lAccessoryGasFuelingSystemAdd.length()<=0){
			lAccessoryGasFuelingSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_ADD
		}
		String lAccessoryGasFuelingSystemOption=strAccessoryGasFuelingSystemOption.trim()
		if(lAccessoryGasFuelingSystemOption.length()<=0){
			lAccessoryGasFuelingSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION
		}
		String lAccessoryBodyKitAdd=strAccessoryBodyKitAdd.trim()
		if(lAccessoryBodyKitAdd.length()<=0){
			lAccessoryBodyKitAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_ADD
		}
		String lAccessoryBodyKitOption=strAccessoryBodyKitOption.trim()
		if(lAccessoryBodyKitOption.length()<=0){
			lAccessoryBodyKitOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION
		}
		String lAccessoryRimsTiresAdd=strAccessoryRimsTiresAdd.trim()
		if(lAccessoryRimsTiresAdd.length()<=0){
			lAccessoryRimsTiresAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_ADD
		}
		String lAccessoryRimsTiresOption=strAccessoryRimsTiresOption.trim()
		if(lAccessoryRimsTiresOption.length()<=0){
			lAccessoryRimsTiresOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION
		}
		String lAccessorySolarFilmAdd=strAccessorySolarFilmAdd.trim()
		if(lAccessorySolarFilmAdd.length()<=0){
			lAccessorySolarFilmAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_ADD
		}
		String lAccessorySolarFilmOption=strAccessorySolarFilmOption.trim()
		if(lAccessorySolarFilmOption.length()<=0){
			lAccessorySolarFilmOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION
		}
		String lAccessorySuspensionStabilizerSystemAdd=strAccessorySuspensionStabilizerSystemAdd.trim()
		if(lAccessorySuspensionStabilizerSystemAdd.length()<=0){
			lAccessorySuspensionStabilizerSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_ADD
		}
		String lAccessorySuspensionStabilizerSystemOption=strAccessorySuspensionStabilizerSystemOption.trim()
		if(lAccessorySuspensionStabilizerSystemOption.length()<=0){
			lAccessorySuspensionStabilizerSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION
		}
		String lAccessoryInVehicleEntertainmentSystemAdd=strAccessoryInVehicleEntertainmentSystemAdd.trim()
		if(lAccessoryInVehicleEntertainmentSystemAdd.length()<=0){
			lAccessoryInVehicleEntertainmentSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_ADD
		}
		String lAccessoryInVehicleEntertainmentSystemOption=strAccessoryInVehicleEntertainmentSystemOption.trim()
		if(lAccessoryInVehicleEntertainmentSystemOption.length()<=0){
			lAccessoryInVehicleEntertainmentSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION
		}
		String lAccessoryAirIntakeExhaustSystemAdd=strAccessoryAirIntakeExhaustSystemAdd.trim()
		if(lAccessoryAirIntakeExhaustSystemAdd.length()<=0){
			lAccessoryAirIntakeExhaustSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_ADD
		}
		String lAccessoryAirIntakeExhaustSystemOption=strAccessoryAirIntakeExhaustSystemOption.trim()
		if(lAccessoryAirIntakeExhaustSystemOption.length()<=0){
			lAccessoryAirIntakeExhaustSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION
		}
		String lAccessoryCarCameraAdd=strAccessoryCarCameraAdd.trim()
		if(lAccessoryCarCameraAdd.length()<=0){
			lAccessoryCarCameraAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_ADD
		}
		String lAccessoryCarCameraOption=strAccessoryCarCameraOption.trim()
		if(lAccessoryCarCameraOption.length()<=0){
			lAccessoryCarCameraOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION
		}
		String lAccessoryAmount=''
		String lAccessoryDetail=''
		Map lAccessoryItemOptionList=['1':'5000','2':'10000','3':'15000','4':'20000']
		Integer lAccessoryAmountNum=0
		try{
			Boolean lResult=false
			lreturn.put('AccessoryAdd','')
			lreturn.put('AccessoryCarryBoyAdd','')
			lreturn.put('AccessoryCarryBoyOption','')
			lreturn.put('AccessoryGasFuelingSystemAdd','')
			lreturn.put('AccessoryGasFuelingSystemOption','')
			lreturn.put('AccessoryBodyKitAdd','')
			lreturn.put('AccessoryBodyKitOption','')
			lreturn.put('AccessoryRimsTiresAdd','')
			lreturn.put('AccessoryRimsTiresOption','')
			lreturn.put('AccessorySolarFilmAdd','')
			lreturn.put('AccessorySolarFilmOption','')
			lreturn.put('AccessorySuspensionStabilizerSystemAdd','')
			lreturn.put('AccessorySuspensionStabilizerSystemOption','')
			lreturn.put('AccessoryInVehicleEntertainmentSystemAdd','')
			lreturn.put('AccessoryInVehicleEntertainmentSystemOption','')
			lreturn.put('AccessoryAirIntakeExhaustSystemAdd','')
			lreturn.put('AccessoryAirIntakeExhaustSystemOption','')
			lreturn.put('AccessoryCarCameraAdd','')
			lreturn.put('AccessoryCarCameraOption','')
			lreturn.put('AccessoryAmount','')
			lreturn.put('AccessoryDetail','')
			lreturn.put('Result',lResult)
			String lTagAccessoryAddButtonOpen='add-accessories'
			String lLocatorAccessoryAddButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddButtonOpen)
			WebElement lElementAccessoryAddButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddButtonOpen)
			if(!lElementAccessoryAddButtonOpen){
				lAccessoryAdd='No Option'
				lAccessoryCarryBoyAdd=''
				lAccessoryCarryBoyOption=''
				lAccessoryGasFuelingSystemAdd=''
				lAccessoryGasFuelingSystemOption=''
				lAccessoryBodyKitAdd=''
				lAccessoryBodyKitOption=''
				lAccessoryRimsTiresAdd=''
				lAccessoryRimsTiresOption=''
				lAccessorySolarFilmAdd=''
				lAccessorySolarFilmOption=''
				lAccessorySuspensionStabilizerSystemAdd=''
				lAccessorySuspensionStabilizerSystemOption=''
				lAccessoryInVehicleEntertainmentSystemAdd=''
				lAccessoryInVehicleEntertainmentSystemOption=''
				lAccessoryAirIntakeExhaustSystemAdd=''
				lAccessoryAirIntakeExhaustSystemOption=''
				lAccessoryCarCameraAdd=''
				lAccessoryCarCameraOption=''
			}else{
				Boolean lIsAccessoryAdd=false
				Boolean lIsAccessoryCarryBoyAdd=false
				Boolean lIsAccessoryGasFuelingSystemAdd=false
				Boolean lIsAccessoryBodyKitAdd=false
				Boolean lIsAccessoryRimsTiresAdd=false
				Boolean lIsAccessorySolarFilmAdd=false
				Boolean lIsAccessorySuspensionStabilizerSystemAdd=false
				Boolean lIsAccessoryInVehicleEntertainmentSystemAdd=false
				Boolean lIsAccessoryAirIntakeExhaustSystemAdd=false
				Boolean lIsAccessoryCarCameraAdd=false
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddButtonOpen)
				String lLocatorAccessoryAddForm='#accessories-modal'
				Boolean lIsAccessoryAddFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAccessoryAddForm,15)
				lIsAccessoryAddFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorAccessoryAddForm)
				if(!lIsAccessoryAddFormDisplayed){
					return lreturn
				}
				String lAccessoryAddKeyItemAdd='accessory-option'
				String lAccessoryAddKeyItemOption='accessory-option-value'
				String lTagAccessoryCarryBoyAddValue='carryBoy'
				String lLocatorAccessoryCarryBoyAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryCarryBoyAddValue)
				WebElement lElementAccessoryCarryBoyAdd=null
				String lTagAccessoryGasFuelingSystemAddValue='gasFuelingSystem'
				String lLocatorAccessoryGasFuelingSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryGasFuelingSystemAddValue)
				WebElement lElementAccessoryGasFuelingSystemAdd=null
				String lTagAccessoryBodyKitAddValue='bodyKit'
				String lLocatorAccessoryBodyKitAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryBodyKitAddValue)
				WebElement lElementAccessoryBodyKitAdd=null
				String lTagAccessoryRimsTiresAddValue='rimsTires'
				String lLocatorAccessoryRimsTiresAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryRimsTiresAddValue)
				WebElement lElementAccessoryRimsTiresAdd=null
				String lTagAccessorySolarFilmAddValue='solarFilm'
				String lLocatorAccessorySolarFilmAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessorySolarFilmAddValue)
				WebElement lElementAccessorySolarFilmAdd=null
				String lTagAccessorySuspensionStabilizerSystemAddValue='suspensionStabilizerSystem'
				String lLocatorAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessorySuspensionStabilizerSystemAddValue)
				WebElement lElementAccessorySuspensionStabilizerSystemAdd=null
				String lTagAccessoryInVehicleEntertainmentSystemAddValue='inVehicleEntertainmentSystem'
				String lLocatorAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryInVehicleEntertainmentSystemAddValue)
				WebElement lElementAccessoryInVehicleEntertainmentSystemAdd=null
				String lTagAccessoryAirIntakeExhaustSystemAddValue='airIntakeExhaustSystem'
				String lLocatorAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryAirIntakeExhaustSystemAddValue)
				WebElement lElementAccessoryAirIntakeExhaustSystemAdd=null
				String lTagAccessoryCarCameraAddValue='carCamera'
				String lLocatorAccessoryCarCameraAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryCarCameraAddValue)
				WebElement lElementAccessoryCarCameraAdd=null
				lElementAccessoryCarryBoyAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarryBoyAddValue)
				if(!lElementAccessoryCarryBoyAdd){
					lAccessoryCarryBoyAdd='No Option'
				}
				lElementAccessoryGasFuelingSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryGasFuelingSystemAddValue)
				if(!lElementAccessoryGasFuelingSystemAdd){
					lAccessoryGasFuelingSystemAdd='No Option'
				}
				lElementAccessoryBodyKitAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryBodyKitAddValue)
				if(!lElementAccessoryBodyKitAdd){
					lAccessoryBodyKitAdd='No Option'
				}
				lElementAccessoryRimsTiresAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryRimsTiresAddValue)
				if(!lElementAccessoryRimsTiresAdd){
					lAccessoryRimsTiresAdd='No Option'
				}
				lElementAccessorySolarFilmAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySolarFilmAddValue)
				if(!lElementAccessorySolarFilmAdd){
					lAccessorySolarFilmAdd='No Option'
				}
				lElementAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySuspensionStabilizerSystemAddValue)
				if(!lElementAccessorySuspensionStabilizerSystemAdd){
					lAccessorySuspensionStabilizerSystemAdd='No Option'
				}
				lElementAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryInVehicleEntertainmentSystemAddValue)
				if(!lElementAccessoryInVehicleEntertainmentSystemAdd){
					lAccessoryInVehicleEntertainmentSystemAdd='No Option'
				}
				lElementAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryAirIntakeExhaustSystemAddValue)
				if(!lElementAccessoryAirIntakeExhaustSystemAdd){
					lAccessoryAirIntakeExhaustSystemAdd='No Option'
				}
				lElementAccessoryCarCameraAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarCameraAddValue)
				if(!lElementAccessoryCarCameraAdd){
					lAccessoryCarCameraAdd='No Option'
				}
				WebElement lElementAccessoryCarryBoyParent=null
				WebElement lElementAccessoryGasFuelingSystemParent=null
				WebElement lElementAccessoryBodyKitParent=null
				WebElement lElementAccessoryRimsTiresParent=null
				WebElement lElementAccessorySolarFilmParent=null
				WebElement lElementAccessorySuspensionStabilizerSystemParent=null
				WebElement lElementAccessoryInVehicleEntertainmentSystemParent=null
				WebElement lElementAccessoryAirIntakeExhaustSystemParent=null
				WebElement lElementAccessoryCarCameraParent=null
				lElementAccessoryCarryBoyParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarryBoyAdd)
				lElementAccessoryGasFuelingSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemAdd)
				lElementAccessoryBodyKitParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryBodyKitAdd)
				lElementAccessoryRimsTiresParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryRimsTiresAdd)
				lElementAccessorySolarFilmParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySolarFilmAdd)
				lElementAccessorySuspensionStabilizerSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
				lElementAccessoryInVehicleEntertainmentSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
				lElementAccessoryAirIntakeExhaustSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
				lElementAccessoryCarCameraParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarCameraAdd)
				String lLocatorAccessoryStageSelected='div>div'
				WebElement lElementAccessoryCarryBoyStageSelected=null
				WebElement lElementAccessoryGasFuelingSystemStageSelected=null
				WebElement lElementAccessoryBodyKitStageSelected=null
				WebElement lElementAccessoryRimsTiresStageSelected=null
				WebElement lElementAccessorySolarFilmStageSelected=null
				WebElement lElementAccessorySuspensionStabilizerSystemStageSelected=null
				WebElement lElementAccessoryInVehicleEntertainmentSystemStageSelected=null
				WebElement lElementAccessoryAirIntakeExhaustSystemStageSelected=null
				WebElement lElementAccessoryCarCameraStageSelected=null
				lElementAccessoryCarryBoyStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarryBoyParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryGasFuelingSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryBodyKitStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryBodyKitParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryRimsTiresStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryRimsTiresParent,lLocatorAccessoryStageSelected,false)
				lElementAccessorySolarFilmStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySolarFilmParent,lLocatorAccessoryStageSelected,false)
				lElementAccessorySuspensionStabilizerSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryInVehicleEntertainmentSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryAirIntakeExhaustSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryCarCameraStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarCameraParent,lLocatorAccessoryStageSelected,false)
				String lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(lAccessoryCarryBoyOption)
				if(!lAccessoryCarryBoyOptionItem){
					lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION)
				}
				String lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(lAccessoryGasFuelingSystemOption)
				if(!lAccessoryGasFuelingSystemOptionItem){
					lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION)
				}
				String lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(lAccessoryBodyKitOption)
				if(!lAccessoryBodyKitOptionItem){
					lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION)
				}
				String lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(lAccessoryRimsTiresOption)
				if(!lAccessoryRimsTiresOptionItem){
					lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION)
				}
				String lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(lAccessorySolarFilmOption)
				if(!lAccessorySolarFilmOptionItem){
					lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION)
				}
				String lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(lAccessorySuspensionStabilizerSystemOption)
				if(!lAccessorySuspensionStabilizerSystemOptionItem){
					lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION)
				}
				String lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(lAccessoryInVehicleEntertainmentSystemOption)
				if(!lAccessoryInVehicleEntertainmentSystemOptionItem){
					lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION)
				}
				String lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(lAccessoryAirIntakeExhaustSystemOption)
				if(!lAccessoryAirIntakeExhaustSystemOptionItem){
					lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION)
				}
				String lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(lAccessoryCarCameraOption)
				if(!lAccessoryCarCameraOptionItem){
					lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION)
				}
				String lLocatorAccessoryCarryBoyOption=''
				WebElement lElementAccessoryCarryBoyOption=null
				String lLocatorAccessoryGasFuelingSystemOption=''
				WebElement lElementAccessoryGasFuelingSystemOption=null
				String lLocatorAccessoryBodyKitOption=''
				WebElement lElementAccessoryBodyKitOption=null
				String lLocatorAccessoryRimsTiresOption=''
				WebElement lElementAccessoryRimsTiresOption=null
				String lLocatorAccessorySolarFilmOption=''
				WebElement lElementAccessorySolarFilmOption=null
				String lLocatorAccessorySuspensionStabilizerSystemOption=''
				WebElement lElementAccessorySuspensionStabilizerSystemOption=null
				String lLocatorAccessoryInVehicleEntertainmentSystemOption=''
				WebElement lElementAccessoryInVehicleEntertainmentSystemOption=null
				String lLocatorAccessoryAirIntakeExhaustSystemOption=''
				WebElement lElementAccessoryAirIntakeExhaustSystemOption=null
				String lLocatorAccessoryCarCameraOption=''
				WebElement lElementAccessoryCarCameraOption=null
				String lTagAccessoryAddSaveButton='accessory-save'
				String lLocatorAccessoryAddSaveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddSaveButton)
				WebElement lElementAccessoryAddSaveButton=null
				lElementAccessoryAddSaveButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddSaveButton)
				if(!lElementAccessoryAddSaveButton){
					return lreturn
				}
				String lClassNameUnchecked='uncheck2list'
				Boolean lIsAccessoryCarryBoyAddSelected=false
				Boolean lIsAccessoryGasFuelingSystemAddSelected=false
				Boolean lIsAccessoryBodyKitAddSelected=false
				Boolean lIsAccessoryRimsTiresAddSelected=false
				Boolean lIsAccessorySolarFilmAddSelected=false
				Boolean lIsAccessorySuspensionStabilizerSystemAddSelected=false
				Boolean lIsAccessoryInVehicleEntertainmentSystemAddSelected=false
				Boolean lIsAccessoryAirIntakeExhaustSystemAddSelected=false
				Boolean lIsAccessoryCarCameraAddSelected=false
				Integer lAddAmountNum=0
				lIsAccessoryAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryAdd)
				if(!lIsAccessoryAdd){
					lIsAccessoryCarryBoyAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarryBoyStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarryBoyAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
					}
					lIsAccessoryGasFuelingSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryGasFuelingSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryGasFuelingSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
					}
					lIsAccessoryBodyKitAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryBodyKitStageSelected,lClassNameUnchecked)
					if(lIsAccessoryBodyKitAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
					}
					lIsAccessoryRimsTiresAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryRimsTiresStageSelected,lClassNameUnchecked)
					if(lIsAccessoryRimsTiresAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
					}
					lIsAccessorySolarFilmAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySolarFilmStageSelected,lClassNameUnchecked)
					if(lIsAccessorySolarFilmAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
					}
					lIsAccessorySuspensionStabilizerSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessorySuspensionStabilizerSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
					}
					lIsAccessoryInVehicleEntertainmentSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryInVehicleEntertainmentSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
					}
					lIsAccessoryAirIntakeExhaustSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryAirIntakeExhaustSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
					}
					lIsAccessoryCarCameraAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarCameraStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarCameraAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
					}
				}else{
					lIsAccessoryCarryBoyAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryCarryBoyAdd)
					lIsAccessoryGasFuelingSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryGasFuelingSystemAdd)
					lIsAccessoryBodyKitAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryBodyKitAdd)
					lIsAccessoryRimsTiresAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryRimsTiresAdd)
					lIsAccessorySolarFilmAdd=IGNUemaHelper.convertStringToBoolean(lAccessorySolarFilmAdd)
					lIsAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessorySuspensionStabilizerSystemAdd)
					lIsAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryInVehicleEntertainmentSystemAdd)
					lIsAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryAirIntakeExhaustSystemAdd)
					lIsAccessoryCarCameraAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryCarCameraAdd)
					lIsAccessoryCarryBoyAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarryBoyStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarryBoyAdd){
						if(!lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarryBoyOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						lElementAccessoryCarryBoyOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarryBoyParent,lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						if(!lElementAccessoryCarryBoyOption){
							lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION)
							lLocatorAccessoryCarryBoyOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
							lElementAccessoryCarryBoyOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarryBoyParent,lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						}
						if(!lElementAccessoryCarryBoyOption){
							lAccessoryCarryBoyOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarryBoyOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
						}
					}
					lIsAccessoryGasFuelingSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryGasFuelingSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryGasFuelingSystemAdd){
						if(!lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryGasFuelingSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						lElementAccessoryGasFuelingSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryGasFuelingSystemParent,lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						if(!lElementAccessoryGasFuelingSystemOption){
							lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION)
							lLocatorAccessoryGasFuelingSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
							lElementAccessoryGasFuelingSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryGasFuelingSystemParent,lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						}
						if(!lElementAccessoryGasFuelingSystemOption){
							lAccessoryGasFuelingSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryGasFuelingSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
						}
					}
					lIsAccessoryBodyKitAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryBodyKitStageSelected,lClassNameUnchecked)
					if(lIsAccessoryBodyKitAdd){
						if(!lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryBodyKitOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						lElementAccessoryBodyKitOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryBodyKitParent,lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						if(!lElementAccessoryBodyKitOption){
							lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION)
							lLocatorAccessoryBodyKitOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
							lElementAccessoryBodyKitOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryBodyKitParent,lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						}
						if(!lElementAccessoryBodyKitOption){
							lAccessoryBodyKitOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryBodyKitOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
						}
					}
					lIsAccessoryRimsTiresAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryRimsTiresStageSelected,lClassNameUnchecked)
					if(lIsAccessoryRimsTiresAdd){
						if(!lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryRimsTiresOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						lElementAccessoryRimsTiresOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryRimsTiresParent,lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						if(!lElementAccessoryRimsTiresOption){
							lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION)
							lLocatorAccessoryRimsTiresOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
							lElementAccessoryRimsTiresOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryRimsTiresParent,lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						}
						if(!lElementAccessoryRimsTiresOption){
							lAccessoryRimsTiresOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryRimsTiresOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
						}
					}
					lIsAccessorySolarFilmAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySolarFilmStageSelected,lClassNameUnchecked)
					if(lIsAccessorySolarFilmAdd){
						if(!lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySolarFilmOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						lElementAccessorySolarFilmOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySolarFilmParent,lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						if(!lElementAccessorySolarFilmOption){
							lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION)
							lLocatorAccessorySolarFilmOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
							lElementAccessorySolarFilmOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySolarFilmParent,lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						}
						if(!lElementAccessorySolarFilmOption){
							lAccessorySolarFilmOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySolarFilmOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
						}
					}
					lIsAccessorySuspensionStabilizerSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessorySuspensionStabilizerSystemAdd){
						if(!lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						lElementAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						if(!lElementAccessorySuspensionStabilizerSystemOption){
							lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION)
							lLocatorAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
							lElementAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						}
						if(!lElementAccessorySuspensionStabilizerSystemOption){
							lAccessorySuspensionStabilizerSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySuspensionStabilizerSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
						}
					}
					lIsAccessoryInVehicleEntertainmentSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryInVehicleEntertainmentSystemAdd){
						if(!lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						lElementAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						if(!lElementAccessoryInVehicleEntertainmentSystemOption){
							lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION)
							lLocatorAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
							lElementAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						}
						if(!lElementAccessoryInVehicleEntertainmentSystemOption){
							lAccessoryInVehicleEntertainmentSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryInVehicleEntertainmentSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
						}
					}
					lIsAccessoryAirIntakeExhaustSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryAirIntakeExhaustSystemAdd){
						if(!lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						lElementAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						if(!lElementAccessoryAirIntakeExhaustSystemOption){
							lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION)
							lLocatorAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
							lElementAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						}
						if(!lElementAccessoryAirIntakeExhaustSystemOption){
							lAccessoryAirIntakeExhaustSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryAirIntakeExhaustSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
						}
					}
					lIsAccessoryCarCameraAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarCameraStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarCameraAdd){
						if(!lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarCameraOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						lElementAccessoryCarCameraOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarCameraParent,lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						if(!lElementAccessoryCarCameraOption){
							lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION)
							lLocatorAccessoryCarCameraOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
							lElementAccessoryCarCameraOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarCameraParent,lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						}
						if(!lElementAccessoryCarCameraOption){
							lAccessoryCarCameraOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarCameraOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
						}
					}
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddSaveButton)
				String lLocatorPleaseWaitForm='#myPleaseWait'
				Boolean lIsPleaseWaitFormVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPleaseWaitForm,5)
				Boolean lIsPleaseWaitFormInvisible=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWaitForm,30)
				String lTagAccessoryAddWarningForm='accessories-warning'
				String lLocatorAccessoryAddWarningForm=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddWarningForm)
				Boolean lIsAccessoryAddWarningFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAccessoryAddWarningForm,5)
				lIsAccessoryAddWarningFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorAccessoryAddWarningForm)
				if(lIsAccessoryAddWarningFormDisplayed){
					String lTagAccessoryAddTryButton='accessories-warning-close'
					String lLocatorAccessoryAddTryButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddTryButton)
					WebElement lElementAccessoryAddTryButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddTryButton)
					if(!lElementAccessoryAddTryButton){
						return lreturn
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddTryButton)
					lIsAccessoryAddFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAccessoryAddForm,15)
					lIsAccessoryAddFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorAccessoryAddForm)
					if(!lIsAccessoryAddFormDisplayed){
						return lreturn
					}
					lAccessoryAmountNum=0
					lElementAccessoryCarryBoyAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarryBoyAddValue)
					if(!lElementAccessoryCarryBoyAdd){
						lAccessoryCarryBoyAdd='No Option'
					}
					lElementAccessoryGasFuelingSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryGasFuelingSystemAddValue)
					if(!lElementAccessoryGasFuelingSystemAdd){
						lAccessoryGasFuelingSystemAdd='No Option'
					}
					lElementAccessoryBodyKitAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryBodyKitAddValue)
					if(!lElementAccessoryBodyKitAdd){
						lAccessoryBodyKitAdd='No Option'
					}
					lElementAccessoryRimsTiresAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryRimsTiresAddValue)
					if(!lElementAccessoryRimsTiresAdd){
						lAccessoryRimsTiresAdd='No Option'
					}
					lElementAccessorySolarFilmAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySolarFilmAddValue)
					if(!lElementAccessorySolarFilmAdd){
						lAccessorySolarFilmAdd='No Option'
					}
					lElementAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySuspensionStabilizerSystemAddValue)
					if(!lElementAccessorySuspensionStabilizerSystemAdd){
						lAccessorySuspensionStabilizerSystemAdd='No Option'
					}
					lElementAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryInVehicleEntertainmentSystemAddValue)
					if(!lElementAccessoryInVehicleEntertainmentSystemAdd){
						lAccessoryInVehicleEntertainmentSystemAdd='No Option'
					}
					lElementAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryAirIntakeExhaustSystemAddValue)
					if(!lElementAccessoryAirIntakeExhaustSystemAdd){
						lAccessoryAirIntakeExhaustSystemAdd='No Option'
					}
					lElementAccessoryCarCameraAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarCameraAddValue)
					if(!lElementAccessoryCarCameraAdd){
						lAccessoryCarCameraAdd='No Option'
					}
					lElementAccessoryCarryBoyParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarryBoyAdd)
					lElementAccessoryGasFuelingSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemAdd)
					lElementAccessoryBodyKitParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryBodyKitAdd)
					lElementAccessoryRimsTiresParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryRimsTiresAdd)
					lElementAccessorySolarFilmParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySolarFilmAdd)
					lElementAccessorySuspensionStabilizerSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
					lElementAccessoryInVehicleEntertainmentSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
					lElementAccessoryAirIntakeExhaustSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
					lElementAccessoryCarCameraParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarCameraAdd)
					lElementAccessoryCarryBoyStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarryBoyParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryGasFuelingSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryBodyKitStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryBodyKitParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryRimsTiresStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryRimsTiresParent,lLocatorAccessoryStageSelected,false)
					lElementAccessorySolarFilmStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySolarFilmParent,lLocatorAccessoryStageSelected,false)
					lElementAccessorySuspensionStabilizerSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryInVehicleEntertainmentSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryAirIntakeExhaustSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryCarCameraStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarCameraParent,lLocatorAccessoryStageSelected,false)
					lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION)
					lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION)
					lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION)
					lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION)
					lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION)
					lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION)
					lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION)
					lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION)
					lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION)
					lAddAmountNum=0
					lIsAccessoryCarryBoyAdd=true
					lIsAccessoryGasFuelingSystemAdd=true
					lIsAccessoryBodyKitAdd=true
					lIsAccessoryRimsTiresAdd=true
					lIsAccessorySolarFilmAdd=true
					lIsAccessorySuspensionStabilizerSystemAdd=false
					lIsAccessoryInVehicleEntertainmentSystemAdd=false
					lIsAccessoryAirIntakeExhaustSystemAdd=false
					lIsAccessoryCarCameraAdd=false
					lIsAccessoryCarryBoyAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarryBoyStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarryBoyAdd){
						if(!lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarryBoyOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						lElementAccessoryCarryBoyOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarryBoyParent,lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						if(!lElementAccessoryCarryBoyOption){
							lAccessoryCarryBoyOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarryBoyOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
						}
					}
					lIsAccessoryGasFuelingSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryGasFuelingSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryGasFuelingSystemAdd){
						if(!lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryGasFuelingSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						lElementAccessoryGasFuelingSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryGasFuelingSystemParent,lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						if(!lElementAccessoryGasFuelingSystemOption){
							lAccessoryGasFuelingSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryGasFuelingSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
						}
					}
					lIsAccessoryBodyKitAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryBodyKitStageSelected,lClassNameUnchecked)
					if(lIsAccessoryBodyKitAdd){
						if(!lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryBodyKitOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						lElementAccessoryBodyKitOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryBodyKitParent,lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						if(!lElementAccessoryBodyKitOption){
							lAccessoryBodyKitOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryBodyKitOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
						}
					}
					lIsAccessoryRimsTiresAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryRimsTiresStageSelected,lClassNameUnchecked)
					if(lIsAccessoryRimsTiresAdd){
						if(!lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryRimsTiresOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						lElementAccessoryRimsTiresOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryRimsTiresParent,lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						if(!lElementAccessoryRimsTiresOption){
							lAccessoryRimsTiresOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryRimsTiresOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
						}
					}
					lIsAccessorySolarFilmAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySolarFilmStageSelected,lClassNameUnchecked)
					if(lIsAccessorySolarFilmAdd){
						if(!lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySolarFilmOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						lElementAccessorySolarFilmOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySolarFilmParent,lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						if(!lElementAccessorySolarFilmOption){
							lAccessorySolarFilmOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySolarFilmOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
						}
					}
					lIsAccessorySuspensionStabilizerSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessorySuspensionStabilizerSystemAdd){
						if(!lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						lElementAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						if(!lElementAccessorySuspensionStabilizerSystemOption){
							lAccessorySuspensionStabilizerSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySuspensionStabilizerSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
						}
					}
					lIsAccessoryInVehicleEntertainmentSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryInVehicleEntertainmentSystemAdd){
						if(!lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						lElementAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						if(!lElementAccessoryInVehicleEntertainmentSystemOption){
							lAccessoryInVehicleEntertainmentSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryInVehicleEntertainmentSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
						}
					}
					lIsAccessoryAirIntakeExhaustSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryAirIntakeExhaustSystemAdd){
						if(!lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						lElementAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						if(!lElementAccessoryAirIntakeExhaustSystemOption){
							lAccessoryAirIntakeExhaustSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryAirIntakeExhaustSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
						}
					}
					lIsAccessoryCarCameraAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarCameraStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarCameraAdd){
						if(!lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarCameraOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						lElementAccessoryCarCameraOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarCameraParent,lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						if(!lElementAccessoryCarCameraOption){
							lAccessoryCarCameraOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarCameraOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
						}
					}
					lElementAccessoryAddSaveButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddSaveButton)
					if(!lElementAccessoryAddSaveButton){
						return lreturn
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddSaveButton)
					lIsPleaseWaitFormVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPleaseWaitForm,5)
					lIsPleaseWaitFormInvisible=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWaitForm,30)
				}
				if(!lIsPleaseWaitFormInvisible){
					return lreturn
				}
				lAccessoryAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryAdd)
				lAccessoryCarryBoyAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryCarryBoyAdd)
				if(!lIsAccessoryCarryBoyAdd){
					lAccessoryCarryBoyOption=''
				}else{
					lAccessoryCarryBoyOption=lAccessoryCarryBoyOptionItem
				}
				lAccessoryGasFuelingSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryGasFuelingSystemAdd)
				if(!lIsAccessoryGasFuelingSystemAdd){
					lAccessoryGasFuelingSystemOption=''
				}else{
					lAccessoryGasFuelingSystemOption=lAccessoryGasFuelingSystemOptionItem
				}
				lAccessoryBodyKitAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryBodyKitAdd)
				if(!lIsAccessoryBodyKitAdd){
					lAccessoryBodyKitOption=''
				}else{
					lAccessoryBodyKitOption=lAccessoryBodyKitOptionItem
				}
				lAccessoryRimsTiresAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryRimsTiresAdd)
				if(!lIsAccessoryRimsTiresAdd){
					lAccessoryRimsTiresOption=''
				}else{
					lAccessoryRimsTiresOption=lAccessoryRimsTiresOptionItem
				}
				lAccessorySolarFilmAdd=IGNUemaHelper.convertBooleanToString(lIsAccessorySolarFilmAdd)
				if(!lIsAccessorySolarFilmAdd){
					lAccessorySolarFilmOption=''
				}else{
					lAccessorySolarFilmOption=lAccessorySolarFilmOptionItem
				}
				lAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessorySuspensionStabilizerSystemAdd)
				if(!lIsAccessorySuspensionStabilizerSystemAdd){
					lAccessorySuspensionStabilizerSystemOption=''
				}else{
					lAccessorySuspensionStabilizerSystemOption=lAccessorySuspensionStabilizerSystemOptionItem
				}
				lAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryInVehicleEntertainmentSystemAdd)
				if(!lIsAccessoryInVehicleEntertainmentSystemAdd){
					lAccessoryInVehicleEntertainmentSystemOption=''
				}else{
					lAccessoryInVehicleEntertainmentSystemOption=lAccessoryInVehicleEntertainmentSystemOptionItem
				}
				lAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryAirIntakeExhaustSystemAdd)
				if(!lIsAccessoryAirIntakeExhaustSystemAdd){
					lAccessoryAirIntakeExhaustSystemOption=''
				}else{
					lAccessoryAirIntakeExhaustSystemOption=lAccessoryAirIntakeExhaustSystemOptionItem
				}
				lAccessoryCarCameraAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryCarCameraAdd)
				if(!lIsAccessoryCarCameraAdd){
					lAccessoryCarCameraOption=''
				}else{
					lAccessoryCarCameraOption=lAccessoryCarCameraOptionItem
				}
				lAccessoryAmount=lAccessoryAmountNum.toString()
				String lTagAccessorySectionText='section-accessories'
				String lLocatorAccessorySectionText=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessorySectionText)
				lLocatorAccessorySectionText=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAccessorySectionText,'.item-pack')
				WebElement lElementAccessorySectionText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAccessorySectionText)
				if(lElementAccessorySectionText){
					lAccessoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAccessorySectionText).trim()
				}
			}
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_AMOUNT=lAccessoryAmount
			lResult=lAccessoryAdd.length()>0
			if(lResult){
				lreturn.put('AccessoryAdd',lAccessoryAdd)
				lreturn.put('AccessoryCarryBoyAdd',lAccessoryCarryBoyAdd)
				lreturn.put('AccessoryCarryBoyOption',lAccessoryCarryBoyOption)
				lreturn.put('AccessoryGasFuelingSystemAdd',lAccessoryGasFuelingSystemAdd)
				lreturn.put('AccessoryGasFuelingSystemOption',lAccessoryGasFuelingSystemOption)
				lreturn.put('AccessoryBodyKitAdd',lAccessoryBodyKitAdd)
				lreturn.put('AccessoryBodyKitOption',lAccessoryBodyKitOption)
				lreturn.put('AccessoryRimsTiresAdd',lAccessoryRimsTiresAdd)
				lreturn.put('AccessoryRimsTiresOption',lAccessoryRimsTiresOption)
				lreturn.put('AccessorySolarFilmAdd',lAccessorySolarFilmAdd)
				lreturn.put('AccessorySolarFilmOption',lAccessorySolarFilmOption)
				lreturn.put('AccessorySuspensionStabilizerSystemAdd',lAccessorySuspensionStabilizerSystemAdd)
				lreturn.put('AccessorySuspensionStabilizerSystemOption',lAccessorySuspensionStabilizerSystemOption)
				lreturn.put('AccessoryInVehicleEntertainmentSystemAdd',lAccessoryInVehicleEntertainmentSystemAdd)
				lreturn.put('AccessoryInVehicleEntertainmentSystemOption',lAccessoryInVehicleEntertainmentSystemOption)
				lreturn.put('AccessoryAirIntakeExhaustSystemAdd',lAccessoryAirIntakeExhaustSystemAdd)
				lreturn.put('AccessoryAirIntakeExhaustSystemOption',lAccessoryAirIntakeExhaustSystemOption)
				lreturn.put('AccessoryCarCameraAdd',lAccessoryCarCameraAdd)
				lreturn.put('AccessoryCarCameraOption',lAccessoryCarCameraOption)
				lreturn.put('AccessoryAmount',lAccessoryAmount)
				lreturn.put('AccessoryDetail',lAccessoryDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAccessoryAddB(String strAccessoryAdd,String strAccessoryCarryBoyAdd,String strAccessoryCarryBoyOption,String strAccessoryGasFuelingSystemAdd,String strAccessoryGasFuelingSystemOption,String strAccessoryBodyKitAdd,String strAccessoryBodyKitOption,String strAccessoryRimsTiresAdd,String strAccessoryRimsTiresOption,String strAccessorySolarFilmAdd,String strAccessorySolarFilmOption,String strAccessorySuspensionStabilizerSystemAdd,String strAccessorySuspensionStabilizerSystemOption,String strAccessoryInVehicleEntertainmentSystemAdd,String strAccessoryInVehicleEntertainmentSystemOption,String strAccessoryAirIntakeExhaustSystemAdd,String strAccessoryAirIntakeExhaustSystemOption,String strAccessoryCarCameraAdd,String strAccessoryCarCameraOption){
		Map lreturn=[:]
		String lAccessoryAdd=strAccessoryAdd.trim()
		if(lAccessoryAdd.length()<=0){
			lAccessoryAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_ADD
		}
		String lAccessoryCarryBoyAdd=strAccessoryCarryBoyAdd.trim()
		if(lAccessoryCarryBoyAdd.length()<=0){
			lAccessoryCarryBoyAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_ADD
		}
		String lAccessoryCarryBoyOption=strAccessoryCarryBoyOption.trim()
		if(lAccessoryCarryBoyOption.length()<=0){
			lAccessoryCarryBoyOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION
		}
		String lAccessoryGasFuelingSystemAdd=strAccessoryGasFuelingSystemAdd.trim()
		if(lAccessoryGasFuelingSystemAdd.length()<=0){
			lAccessoryGasFuelingSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_ADD
		}
		String lAccessoryGasFuelingSystemOption=strAccessoryGasFuelingSystemOption.trim()
		if(lAccessoryGasFuelingSystemOption.length()<=0){
			lAccessoryGasFuelingSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION
		}
		String lAccessoryBodyKitAdd=strAccessoryBodyKitAdd.trim()
		if(lAccessoryBodyKitAdd.length()<=0){
			lAccessoryBodyKitAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_ADD
		}
		String lAccessoryBodyKitOption=strAccessoryBodyKitOption.trim()
		if(lAccessoryBodyKitOption.length()<=0){
			lAccessoryBodyKitOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION
		}
		String lAccessoryRimsTiresAdd=strAccessoryRimsTiresAdd.trim()
		if(lAccessoryRimsTiresAdd.length()<=0){
			lAccessoryRimsTiresAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_ADD
		}
		String lAccessoryRimsTiresOption=strAccessoryRimsTiresOption.trim()
		if(lAccessoryRimsTiresOption.length()<=0){
			lAccessoryRimsTiresOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION
		}
		String lAccessorySolarFilmAdd=strAccessorySolarFilmAdd.trim()
		if(lAccessorySolarFilmAdd.length()<=0){
			lAccessorySolarFilmAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_ADD
		}
		String lAccessorySolarFilmOption=strAccessorySolarFilmOption.trim()
		if(lAccessorySolarFilmOption.length()<=0){
			lAccessorySolarFilmOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION
		}
		String lAccessorySuspensionStabilizerSystemAdd=strAccessorySuspensionStabilizerSystemAdd.trim()
		if(lAccessorySuspensionStabilizerSystemAdd.length()<=0){
			lAccessorySuspensionStabilizerSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_ADD
		}
		String lAccessorySuspensionStabilizerSystemOption=strAccessorySuspensionStabilizerSystemOption.trim()
		if(lAccessorySuspensionStabilizerSystemOption.length()<=0){
			lAccessorySuspensionStabilizerSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION
		}
		String lAccessoryInVehicleEntertainmentSystemAdd=strAccessoryInVehicleEntertainmentSystemAdd.trim()
		if(lAccessoryInVehicleEntertainmentSystemAdd.length()<=0){
			lAccessoryInVehicleEntertainmentSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_ADD
		}
		String lAccessoryInVehicleEntertainmentSystemOption=strAccessoryInVehicleEntertainmentSystemOption.trim()
		if(lAccessoryInVehicleEntertainmentSystemOption.length()<=0){
			lAccessoryInVehicleEntertainmentSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION
		}
		String lAccessoryAirIntakeExhaustSystemAdd=strAccessoryAirIntakeExhaustSystemAdd.trim()
		if(lAccessoryAirIntakeExhaustSystemAdd.length()<=0){
			lAccessoryAirIntakeExhaustSystemAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_ADD
		}
		String lAccessoryAirIntakeExhaustSystemOption=strAccessoryAirIntakeExhaustSystemOption.trim()
		if(lAccessoryAirIntakeExhaustSystemOption.length()<=0){
			lAccessoryAirIntakeExhaustSystemOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION
		}
		String lAccessoryCarCameraAdd=strAccessoryCarCameraAdd.trim()
		if(lAccessoryCarCameraAdd.length()<=0){
			lAccessoryCarCameraAdd=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_ADD
		}
		String lAccessoryCarCameraOption=strAccessoryCarCameraOption.trim()
		if(lAccessoryCarCameraOption.length()<=0){
			lAccessoryCarCameraOption=THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION
		}
		String lAccessoryAmount=''
		String lAccessoryDetail=''
		Map lAccessoryItemOptionList=['1':'5000','2':'10000','3':'15000','4':'20000']
		Integer lAccessoryAmountNum=0
		try{
			Boolean lResult=false
			lreturn.put('AccessoryAdd','')
			lreturn.put('AccessoryCarryBoyAdd','')
			lreturn.put('AccessoryCarryBoyOption','')
			lreturn.put('AccessoryGasFuelingSystemAdd','')
			lreturn.put('AccessoryGasFuelingSystemOption','')
			lreturn.put('AccessoryBodyKitAdd','')
			lreturn.put('AccessoryBodyKitOption','')
			lreturn.put('AccessoryRimsTiresAdd','')
			lreturn.put('AccessoryRimsTiresOption','')
			lreturn.put('AccessorySolarFilmAdd','')
			lreturn.put('AccessorySolarFilmOption','')
			lreturn.put('AccessorySuspensionStabilizerSystemAdd','')
			lreturn.put('AccessorySuspensionStabilizerSystemOption','')
			lreturn.put('AccessoryInVehicleEntertainmentSystemAdd','')
			lreturn.put('AccessoryInVehicleEntertainmentSystemOption','')
			lreturn.put('AccessoryAirIntakeExhaustSystemAdd','')
			lreturn.put('AccessoryAirIntakeExhaustSystemOption','')
			lreturn.put('AccessoryCarCameraAdd','')
			lreturn.put('AccessoryCarCameraOption','')
			lreturn.put('AccessoryAmount','')
			lreturn.put('AccessoryDetail','')
			lreturn.put('Result',lResult)
			String lTagAccessoryAddButtonOpen='add-accessories'
			String lLocatorAccessoryAddButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddButtonOpen)
			WebElement lElementAccessoryAddButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddButtonOpen)
			if(!lElementAccessoryAddButtonOpen){
				lAccessoryAdd='No Option'
				lAccessoryCarryBoyAdd=''
				lAccessoryCarryBoyOption=''
				lAccessoryGasFuelingSystemAdd=''
				lAccessoryGasFuelingSystemOption=''
				lAccessoryBodyKitAdd=''
				lAccessoryBodyKitOption=''
				lAccessoryRimsTiresAdd=''
				lAccessoryRimsTiresOption=''
				lAccessorySolarFilmAdd=''
				lAccessorySolarFilmOption=''
				lAccessorySuspensionStabilizerSystemAdd=''
				lAccessorySuspensionStabilizerSystemOption=''
				lAccessoryInVehicleEntertainmentSystemAdd=''
				lAccessoryInVehicleEntertainmentSystemOption=''
				lAccessoryAirIntakeExhaustSystemAdd=''
				lAccessoryAirIntakeExhaustSystemOption=''
				lAccessoryCarCameraAdd=''
				lAccessoryCarCameraOption=''
			}else{
				Boolean lIsAccessoryAdd=false
				Boolean lIsAccessoryCarryBoyAdd=false
				Boolean lIsAccessoryGasFuelingSystemAdd=false
				Boolean lIsAccessoryBodyKitAdd=false
				Boolean lIsAccessoryRimsTiresAdd=false
				Boolean lIsAccessorySolarFilmAdd=false
				Boolean lIsAccessorySuspensionStabilizerSystemAdd=false
				Boolean lIsAccessoryInVehicleEntertainmentSystemAdd=false
				Boolean lIsAccessoryAirIntakeExhaustSystemAdd=false
				Boolean lIsAccessoryCarCameraAdd=false
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddButtonOpen)
				String lLocatorAccessoryAddForm='#accessories-modal'
				Boolean lIsAccessoryAddFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAccessoryAddForm,15)
				lIsAccessoryAddFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorAccessoryAddForm)
				if(!lIsAccessoryAddFormDisplayed){
					return lreturn
				}
				String lAccessoryAddKeyItemAdd='accessory-option'
				String lAccessoryAddKeyItemOption='accessory-option-value'
				String lTagAccessoryCarryBoyAddValue='carryBoy'
				String lLocatorAccessoryCarryBoyAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryCarryBoyAddValue)
				WebElement lElementAccessoryCarryBoyAdd=null
				String lTagAccessoryGasFuelingSystemAddValue='gasFuelingSystem'
				String lLocatorAccessoryGasFuelingSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryGasFuelingSystemAddValue)
				WebElement lElementAccessoryGasFuelingSystemAdd=null
				String lTagAccessoryBodyKitAddValue='bodyKit'
				String lLocatorAccessoryBodyKitAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryBodyKitAddValue)
				WebElement lElementAccessoryBodyKitAdd=null
				String lTagAccessoryRimsTiresAddValue='rimsTires'
				String lLocatorAccessoryRimsTiresAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryRimsTiresAddValue)
				WebElement lElementAccessoryRimsTiresAdd=null
				String lTagAccessorySolarFilmAddValue='solarFilm'
				String lLocatorAccessorySolarFilmAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessorySolarFilmAddValue)
				WebElement lElementAccessorySolarFilmAdd=null
				String lTagAccessorySuspensionStabilizerSystemAddValue='suspensionStabilizerSystem'
				String lLocatorAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessorySuspensionStabilizerSystemAddValue)
				WebElement lElementAccessorySuspensionStabilizerSystemAdd=null
				String lTagAccessoryInVehicleEntertainmentSystemAddValue='inVehicleEntertainmentSystem'
				String lLocatorAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryInVehicleEntertainmentSystemAddValue)
				WebElement lElementAccessoryInVehicleEntertainmentSystemAdd=null
				String lTagAccessoryAirIntakeExhaustSystemAddValue='airIntakeExhaustSystem'
				String lLocatorAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryAirIntakeExhaustSystemAddValue)
				WebElement lElementAccessoryAirIntakeExhaustSystemAdd=null
				String lTagAccessoryCarCameraAddValue='carCamera'
				String lLocatorAccessoryCarCameraAdd=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemAdd,lTagAccessoryCarCameraAddValue)
				WebElement lElementAccessoryCarCameraAdd=null
				lElementAccessoryCarryBoyAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarryBoyAddValue)
				if(!lElementAccessoryCarryBoyAdd){
					lAccessoryCarryBoyAdd='No Option'
				}
				lElementAccessoryGasFuelingSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryGasFuelingSystemAddValue)
				if(!lElementAccessoryGasFuelingSystemAdd){
					lAccessoryGasFuelingSystemAdd='No Option'
				}
				lElementAccessoryBodyKitAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryBodyKitAddValue)
				if(!lElementAccessoryBodyKitAdd){
					lAccessoryBodyKitAdd='No Option'
				}
				lElementAccessoryRimsTiresAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryRimsTiresAddValue)
				if(!lElementAccessoryRimsTiresAdd){
					lAccessoryRimsTiresAdd='No Option'
				}
				lElementAccessorySolarFilmAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySolarFilmAddValue)
				if(!lElementAccessorySolarFilmAdd){
					lAccessorySolarFilmAdd='No Option'
				}
				lElementAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySuspensionStabilizerSystemAddValue)
				if(!lElementAccessorySuspensionStabilizerSystemAdd){
					lAccessorySuspensionStabilizerSystemAdd='No Option'
				}
				lElementAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryInVehicleEntertainmentSystemAddValue)
				if(!lElementAccessoryInVehicleEntertainmentSystemAdd){
					lAccessoryInVehicleEntertainmentSystemAdd='No Option'
				}
				lElementAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryAirIntakeExhaustSystemAddValue)
				if(!lElementAccessoryAirIntakeExhaustSystemAdd){
					lAccessoryAirIntakeExhaustSystemAdd='No Option'
				}
				lElementAccessoryCarCameraAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarCameraAddValue)
				if(!lElementAccessoryCarCameraAdd){
					lAccessoryCarCameraAdd='No Option'
				}
				WebElement lElementAccessoryCarryBoyParent=null
				WebElement lElementAccessoryGasFuelingSystemParent=null
				WebElement lElementAccessoryBodyKitParent=null
				WebElement lElementAccessoryRimsTiresParent=null
				WebElement lElementAccessorySolarFilmParent=null
				WebElement lElementAccessorySuspensionStabilizerSystemParent=null
				WebElement lElementAccessoryInVehicleEntertainmentSystemParent=null
				WebElement lElementAccessoryAirIntakeExhaustSystemParent=null
				WebElement lElementAccessoryCarCameraParent=null
				lElementAccessoryCarryBoyParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarryBoyAdd)
				lElementAccessoryGasFuelingSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemAdd)
				lElementAccessoryBodyKitParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryBodyKitAdd)
				lElementAccessoryRimsTiresParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryRimsTiresAdd)
				lElementAccessorySolarFilmParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySolarFilmAdd)
				lElementAccessorySuspensionStabilizerSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
				lElementAccessoryInVehicleEntertainmentSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
				lElementAccessoryAirIntakeExhaustSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
				lElementAccessoryCarCameraParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarCameraAdd)
				String lLocatorAccessoryStageSelected='div>div'
				WebElement lElementAccessoryCarryBoyStageSelected=null
				WebElement lElementAccessoryGasFuelingSystemStageSelected=null
				WebElement lElementAccessoryBodyKitStageSelected=null
				WebElement lElementAccessoryRimsTiresStageSelected=null
				WebElement lElementAccessorySolarFilmStageSelected=null
				WebElement lElementAccessorySuspensionStabilizerSystemStageSelected=null
				WebElement lElementAccessoryInVehicleEntertainmentSystemStageSelected=null
				WebElement lElementAccessoryAirIntakeExhaustSystemStageSelected=null
				WebElement lElementAccessoryCarCameraStageSelected=null
				lElementAccessoryCarryBoyStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarryBoyParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryGasFuelingSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryBodyKitStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryBodyKitParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryRimsTiresStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryRimsTiresParent,lLocatorAccessoryStageSelected,false)
				lElementAccessorySolarFilmStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySolarFilmParent,lLocatorAccessoryStageSelected,false)
				lElementAccessorySuspensionStabilizerSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryInVehicleEntertainmentSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryAirIntakeExhaustSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lLocatorAccessoryStageSelected,false)
				lElementAccessoryCarCameraStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarCameraParent,lLocatorAccessoryStageSelected,false)
				String lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(lAccessoryCarryBoyOption)
				if(!lAccessoryCarryBoyOptionItem){
					lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION)
				}
				String lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(lAccessoryGasFuelingSystemOption)
				if(!lAccessoryGasFuelingSystemOptionItem){
					lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION)
				}
				String lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(lAccessoryBodyKitOption)
				if(!lAccessoryBodyKitOptionItem){
					lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION)
				}
				String lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(lAccessoryRimsTiresOption)
				if(!lAccessoryRimsTiresOptionItem){
					lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION)
				}
				String lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(lAccessorySolarFilmOption)
				if(!lAccessorySolarFilmOptionItem){
					lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION)
				}
				String lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(lAccessorySuspensionStabilizerSystemOption)
				if(!lAccessorySuspensionStabilizerSystemOptionItem){
					lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION)
				}
				String lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(lAccessoryInVehicleEntertainmentSystemOption)
				if(!lAccessoryInVehicleEntertainmentSystemOptionItem){
					lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION)
				}
				String lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(lAccessoryAirIntakeExhaustSystemOption)
				if(!lAccessoryAirIntakeExhaustSystemOptionItem){
					lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION)
				}
				String lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(lAccessoryCarCameraOption)
				if(!lAccessoryCarCameraOptionItem){
					lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION)
				}
				String lLocatorAccessoryCarryBoyOption=''
				WebElement lElementAccessoryCarryBoyOption=null
				String lLocatorAccessoryGasFuelingSystemOption=''
				WebElement lElementAccessoryGasFuelingSystemOption=null
				String lLocatorAccessoryBodyKitOption=''
				WebElement lElementAccessoryBodyKitOption=null
				String lLocatorAccessoryRimsTiresOption=''
				WebElement lElementAccessoryRimsTiresOption=null
				String lLocatorAccessorySolarFilmOption=''
				WebElement lElementAccessorySolarFilmOption=null
				String lLocatorAccessorySuspensionStabilizerSystemOption=''
				WebElement lElementAccessorySuspensionStabilizerSystemOption=null
				String lLocatorAccessoryInVehicleEntertainmentSystemOption=''
				WebElement lElementAccessoryInVehicleEntertainmentSystemOption=null
				String lLocatorAccessoryAirIntakeExhaustSystemOption=''
				WebElement lElementAccessoryAirIntakeExhaustSystemOption=null
				String lLocatorAccessoryCarCameraOption=''
				WebElement lElementAccessoryCarCameraOption=null
				String lTagAccessoryAddSaveButton='accessory-save'
				String lLocatorAccessoryAddSaveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddSaveButton)
				WebElement lElementAccessoryAddSaveButton=null
				lElementAccessoryAddSaveButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddSaveButton)
				if(!lElementAccessoryAddSaveButton){
					return lreturn
				}
				String lClassNameUnchecked='uncheck2list'
				Boolean lIsAccessoryCarryBoyAddSelected=false
				Boolean lIsAccessoryGasFuelingSystemAddSelected=false
				Boolean lIsAccessoryBodyKitAddSelected=false
				Boolean lIsAccessoryRimsTiresAddSelected=false
				Boolean lIsAccessorySolarFilmAddSelected=false
				Boolean lIsAccessorySuspensionStabilizerSystemAddSelected=false
				Boolean lIsAccessoryInVehicleEntertainmentSystemAddSelected=false
				Boolean lIsAccessoryAirIntakeExhaustSystemAddSelected=false
				Boolean lIsAccessoryCarCameraAddSelected=false
				Integer lAddAmountNum=0
				lIsAccessoryAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryAdd)
				if(!lIsAccessoryAdd){
					lIsAccessoryCarryBoyAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarryBoyStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarryBoyAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
					}
					lIsAccessoryGasFuelingSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryGasFuelingSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryGasFuelingSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
					}
					lIsAccessoryBodyKitAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryBodyKitStageSelected,lClassNameUnchecked)
					if(lIsAccessoryBodyKitAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
					}
					lIsAccessoryRimsTiresAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryRimsTiresStageSelected,lClassNameUnchecked)
					if(lIsAccessoryRimsTiresAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
					}
					lIsAccessorySolarFilmAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySolarFilmStageSelected,lClassNameUnchecked)
					if(lIsAccessorySolarFilmAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
					}
					lIsAccessorySuspensionStabilizerSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessorySuspensionStabilizerSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
					}
					lIsAccessoryInVehicleEntertainmentSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryInVehicleEntertainmentSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
					}
					lIsAccessoryAirIntakeExhaustSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryAirIntakeExhaustSystemAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
					}
					lIsAccessoryCarCameraAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarCameraStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarCameraAddSelected){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
					}
				}else{
					lIsAccessoryCarryBoyAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryCarryBoyAdd)
					lIsAccessoryGasFuelingSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryGasFuelingSystemAdd)
					lIsAccessoryBodyKitAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryBodyKitAdd)
					lIsAccessoryRimsTiresAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryRimsTiresAdd)
					lIsAccessorySolarFilmAdd=IGNUemaHelper.convertStringToBoolean(lAccessorySolarFilmAdd)
					lIsAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessorySuspensionStabilizerSystemAdd)
					lIsAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryInVehicleEntertainmentSystemAdd)
					lIsAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryAirIntakeExhaustSystemAdd)
					lIsAccessoryCarCameraAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryCarCameraAdd)
					lIsAccessoryCarryBoyAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarryBoyStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarryBoyAdd){
						if(!lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarryBoyOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						lElementAccessoryCarryBoyOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarryBoyParent,lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						if(!lElementAccessoryCarryBoyOption){
							lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION)
							lLocatorAccessoryCarryBoyOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
							lElementAccessoryCarryBoyOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarryBoyParent,lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						}
						if(!lElementAccessoryCarryBoyOption){
							lAccessoryCarryBoyOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarryBoyOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
						}
					}
					lIsAccessoryGasFuelingSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryGasFuelingSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryGasFuelingSystemAdd){
						if(!lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryGasFuelingSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						lElementAccessoryGasFuelingSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryGasFuelingSystemParent,lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						if(!lElementAccessoryGasFuelingSystemOption){
							lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION)
							lLocatorAccessoryGasFuelingSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
							lElementAccessoryGasFuelingSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryGasFuelingSystemParent,lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						}
						if(!lElementAccessoryGasFuelingSystemOption){
							lAccessoryGasFuelingSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryGasFuelingSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
						}
					}
					lIsAccessoryBodyKitAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryBodyKitStageSelected,lClassNameUnchecked)
					if(lIsAccessoryBodyKitAdd){
						if(!lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryBodyKitOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						lElementAccessoryBodyKitOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryBodyKitParent,lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						if(!lElementAccessoryBodyKitOption){
							lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION)
							lLocatorAccessoryBodyKitOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
							lElementAccessoryBodyKitOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryBodyKitParent,lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						}
						if(!lElementAccessoryBodyKitOption){
							lAccessoryBodyKitOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryBodyKitOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
						}
					}
					lIsAccessoryRimsTiresAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryRimsTiresStageSelected,lClassNameUnchecked)
					if(lIsAccessoryRimsTiresAdd){
						if(!lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryRimsTiresOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						lElementAccessoryRimsTiresOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryRimsTiresParent,lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						if(!lElementAccessoryRimsTiresOption){
							lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION)
							lLocatorAccessoryRimsTiresOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
							lElementAccessoryRimsTiresOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryRimsTiresParent,lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						}
						if(!lElementAccessoryRimsTiresOption){
							lAccessoryRimsTiresOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryRimsTiresOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
						}
					}
					lIsAccessorySolarFilmAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySolarFilmStageSelected,lClassNameUnchecked)
					if(lIsAccessorySolarFilmAdd){
						if(!lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySolarFilmOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						lElementAccessorySolarFilmOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySolarFilmParent,lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						if(!lElementAccessorySolarFilmOption){
							lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION)
							lLocatorAccessorySolarFilmOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
							lElementAccessorySolarFilmOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySolarFilmParent,lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						}
						if(!lElementAccessorySolarFilmOption){
							lAccessorySolarFilmOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySolarFilmOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
						}
					}
					lIsAccessorySuspensionStabilizerSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessorySuspensionStabilizerSystemAdd){
						if(!lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						lElementAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						if(!lElementAccessorySuspensionStabilizerSystemOption){
							lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION)
							lLocatorAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
							lElementAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						}
						if(!lElementAccessorySuspensionStabilizerSystemOption){
							lAccessorySuspensionStabilizerSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySuspensionStabilizerSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
						}
					}
					lIsAccessoryInVehicleEntertainmentSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryInVehicleEntertainmentSystemAdd){
						if(!lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						lElementAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						if(!lElementAccessoryInVehicleEntertainmentSystemOption){
							lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION)
							lLocatorAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
							lElementAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						}
						if(!lElementAccessoryInVehicleEntertainmentSystemOption){
							lAccessoryInVehicleEntertainmentSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryInVehicleEntertainmentSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
						}
					}
					lIsAccessoryAirIntakeExhaustSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryAirIntakeExhaustSystemAdd){
						if(!lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						lElementAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						if(!lElementAccessoryAirIntakeExhaustSystemOption){
							lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION)
							lLocatorAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
							lElementAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						}
						if(!lElementAccessoryAirIntakeExhaustSystemOption){
							lAccessoryAirIntakeExhaustSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryAirIntakeExhaustSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
						}
					}
					lIsAccessoryCarCameraAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarCameraStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarCameraAdd){
						if(!lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarCameraOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						lElementAccessoryCarCameraOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarCameraParent,lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						if(!lElementAccessoryCarCameraOption){
							lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION)
							lLocatorAccessoryCarCameraOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
							lElementAccessoryCarCameraOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarCameraParent,lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						}
						if(!lElementAccessoryCarCameraOption){
							lAccessoryCarCameraOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarCameraOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
						}
					}
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddSaveButton)
				String lLocatorPleaseWaitForm='#myPleaseWait'
				Boolean lIsPleaseWaitFormVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPleaseWaitForm,5)
				Boolean lIsPleaseWaitFormInvisible=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWaitForm,30)
				String lTagAccessoryAddWarningForm='accessories-warning'
				String lLocatorAccessoryAddWarningForm=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddWarningForm)
				Boolean lIsAccessoryAddWarningFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAccessoryAddWarningForm,5)
				lIsAccessoryAddWarningFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorAccessoryAddWarningForm)
				if(lIsAccessoryAddWarningFormDisplayed){
					String lTagAccessoryAddTryButton='accessories-warning-close'
					String lLocatorAccessoryAddTryButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessoryAddTryButton)
					WebElement lElementAccessoryAddTryButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddTryButton)
					if(!lElementAccessoryAddTryButton){
						return lreturn
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddTryButton)
					lIsAccessoryAddFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAccessoryAddForm,15)
					lIsAccessoryAddFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorAccessoryAddForm)
					if(!lIsAccessoryAddFormDisplayed){
						return lreturn
					}
					lAccessoryAmountNum=0
					lElementAccessoryCarryBoyAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarryBoyAddValue)
					if(!lElementAccessoryCarryBoyAdd){
						lAccessoryCarryBoyAdd='No Option'
					}
					lElementAccessoryGasFuelingSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryGasFuelingSystemAddValue)
					if(!lElementAccessoryGasFuelingSystemAdd){
						lAccessoryGasFuelingSystemAdd='No Option'
					}
					lElementAccessoryBodyKitAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryBodyKitAddValue)
					if(!lElementAccessoryBodyKitAdd){
						lAccessoryBodyKitAdd='No Option'
					}
					lElementAccessoryRimsTiresAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryRimsTiresAddValue)
					if(!lElementAccessoryRimsTiresAdd){
						lAccessoryRimsTiresAdd='No Option'
					}
					lElementAccessorySolarFilmAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySolarFilmAddValue)
					if(!lElementAccessorySolarFilmAdd){
						lAccessorySolarFilmAdd='No Option'
					}
					lElementAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessorySuspensionStabilizerSystemAddValue)
					if(!lElementAccessorySuspensionStabilizerSystemAdd){
						lAccessorySuspensionStabilizerSystemAdd='No Option'
					}
					lElementAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryInVehicleEntertainmentSystemAddValue)
					if(!lElementAccessoryInVehicleEntertainmentSystemAdd){
						lAccessoryInVehicleEntertainmentSystemAdd='No Option'
					}
					lElementAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryAirIntakeExhaustSystemAddValue)
					if(!lElementAccessoryAirIntakeExhaustSystemAdd){
						lAccessoryAirIntakeExhaustSystemAdd='No Option'
					}
					lElementAccessoryCarCameraAdd=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lAccessoryAddKeyItemAdd,lTagAccessoryCarCameraAddValue)
					if(!lElementAccessoryCarCameraAdd){
						lAccessoryCarCameraAdd='No Option'
					}
					lElementAccessoryCarryBoyParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarryBoyAdd)
					lElementAccessoryGasFuelingSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemAdd)
					lElementAccessoryBodyKitParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryBodyKitAdd)
					lElementAccessoryRimsTiresParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryRimsTiresAdd)
					lElementAccessorySolarFilmParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySolarFilmAdd)
					lElementAccessorySuspensionStabilizerSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
					lElementAccessoryInVehicleEntertainmentSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
					lElementAccessoryAirIntakeExhaustSystemParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
					lElementAccessoryCarCameraParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementAccessoryCarCameraAdd)
					lElementAccessoryCarryBoyStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarryBoyParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryGasFuelingSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryGasFuelingSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryBodyKitStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryBodyKitParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryRimsTiresStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryRimsTiresParent,lLocatorAccessoryStageSelected,false)
					lElementAccessorySolarFilmStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySolarFilmParent,lLocatorAccessoryStageSelected,false)
					lElementAccessorySuspensionStabilizerSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryInVehicleEntertainmentSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryAirIntakeExhaustSystemStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lLocatorAccessoryStageSelected,false)
					lElementAccessoryCarCameraStageSelected=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementAccessoryCarCameraParent,lLocatorAccessoryStageSelected,false)
					lAccessoryCarryBoyOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION)
					lAccessoryGasFuelingSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION)
					lAccessoryBodyKitOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION)
					lAccessoryRimsTiresOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION)
					lAccessorySolarFilmOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION)
					lAccessorySuspensionStabilizerSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION)
					lAccessoryInVehicleEntertainmentSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION)
					lAccessoryAirIntakeExhaustSystemOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION)
					lAccessoryCarCameraOptionItem=lAccessoryItemOptionList.get(THAMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION)
					lAddAmountNum=0
					lIsAccessoryCarryBoyAdd=true
					lIsAccessoryGasFuelingSystemAdd=true
					lIsAccessoryBodyKitAdd=true
					lIsAccessoryRimsTiresAdd=true
					lIsAccessorySolarFilmAdd=true
					lIsAccessorySuspensionStabilizerSystemAdd=false
					lIsAccessoryInVehicleEntertainmentSystemAdd=false
					lIsAccessoryAirIntakeExhaustSystemAdd=false
					lIsAccessoryCarCameraAdd=false
					lIsAccessoryCarryBoyAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarryBoyStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarryBoyAdd){
						if(!lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarryBoyOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						lElementAccessoryCarryBoyOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarryBoyParent,lAccessoryAddKeyItemOption,lAccessoryCarryBoyOptionItem)
						if(!lElementAccessoryCarryBoyOption){
							lAccessoryCarryBoyOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarryBoyOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarryBoyAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarryBoyAdd)
						}
					}
					lIsAccessoryGasFuelingSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryGasFuelingSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryGasFuelingSystemAdd){
						if(!lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryGasFuelingSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						lElementAccessoryGasFuelingSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryGasFuelingSystemParent,lAccessoryAddKeyItemOption,lAccessoryGasFuelingSystemOptionItem)
						if(!lElementAccessoryGasFuelingSystemOption){
							lAccessoryGasFuelingSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryGasFuelingSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryGasFuelingSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryGasFuelingSystemAdd)
						}
					}
					lIsAccessoryBodyKitAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryBodyKitStageSelected,lClassNameUnchecked)
					if(lIsAccessoryBodyKitAdd){
						if(!lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryBodyKitOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						lElementAccessoryBodyKitOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryBodyKitParent,lAccessoryAddKeyItemOption,lAccessoryBodyKitOptionItem)
						if(!lElementAccessoryBodyKitOption){
							lAccessoryBodyKitOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryBodyKitOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryBodyKitAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryBodyKitAdd)
						}
					}
					lIsAccessoryRimsTiresAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryRimsTiresStageSelected,lClassNameUnchecked)
					if(lIsAccessoryRimsTiresAdd){
						if(!lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryRimsTiresOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						lElementAccessoryRimsTiresOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryRimsTiresParent,lAccessoryAddKeyItemOption,lAccessoryRimsTiresOptionItem)
						if(!lElementAccessoryRimsTiresOption){
							lAccessoryRimsTiresOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryRimsTiresOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryRimsTiresAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryRimsTiresAdd)
						}
					}
					lIsAccessorySolarFilmAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySolarFilmStageSelected,lClassNameUnchecked)
					if(lIsAccessorySolarFilmAdd){
						if(!lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySolarFilmOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						lElementAccessorySolarFilmOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySolarFilmParent,lAccessoryAddKeyItemOption,lAccessorySolarFilmOptionItem)
						if(!lElementAccessorySolarFilmOption){
							lAccessorySolarFilmOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySolarFilmOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySolarFilmAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySolarFilmAdd)
						}
					}
					lIsAccessorySuspensionStabilizerSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessorySuspensionStabilizerSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessorySuspensionStabilizerSystemAdd){
						if(!lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						lElementAccessorySuspensionStabilizerSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessorySuspensionStabilizerSystemParent,lAccessoryAddKeyItemOption,lAccessorySuspensionStabilizerSystemOptionItem)
						if(!lElementAccessorySuspensionStabilizerSystemOption){
							lAccessorySuspensionStabilizerSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessorySuspensionStabilizerSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessorySuspensionStabilizerSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessorySuspensionStabilizerSystemAdd)
						}
					}
					lIsAccessoryInVehicleEntertainmentSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryInVehicleEntertainmentSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryInVehicleEntertainmentSystemAdd){
						if(!lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						lElementAccessoryInVehicleEntertainmentSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryInVehicleEntertainmentSystemParent,lAccessoryAddKeyItemOption,lAccessoryInVehicleEntertainmentSystemOptionItem)
						if(!lElementAccessoryInVehicleEntertainmentSystemOption){
							lAccessoryInVehicleEntertainmentSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryInVehicleEntertainmentSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryInVehicleEntertainmentSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryInVehicleEntertainmentSystemAdd)
						}
					}
					lIsAccessoryAirIntakeExhaustSystemAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryAirIntakeExhaustSystemStageSelected,lClassNameUnchecked)
					if(lIsAccessoryAirIntakeExhaustSystemAdd){
						if(!lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						lElementAccessoryAirIntakeExhaustSystemOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryAirIntakeExhaustSystemParent,lAccessoryAddKeyItemOption,lAccessoryAirIntakeExhaustSystemOptionItem)
						if(!lElementAccessoryAirIntakeExhaustSystemOption){
							lAccessoryAirIntakeExhaustSystemOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryAirIntakeExhaustSystemOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryAirIntakeExhaustSystemAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryAirIntakeExhaustSystemAdd)
						}
					}
					lIsAccessoryCarCameraAddSelected=!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementAccessoryCarCameraStageSelected,lClassNameUnchecked)
					if(lIsAccessoryCarCameraAdd){
						if(!lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
							IGNUemaHelper.delayThreadSecond(1)
						}
						lLocatorAccessoryCarCameraOption=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						lElementAccessoryCarCameraOption=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAccessoryCarCameraParent,lAccessoryAddKeyItemOption,lAccessoryCarCameraOptionItem)
						if(!lElementAccessoryCarCameraOption){
							lAccessoryCarCameraOption='No Option'
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraOption)
						lAddAmountNum=IGNUemaHelper.convertStringToInteger(lAccessoryCarCameraOptionItem,0)
						lAccessoryAmountNum=lAccessoryAmountNum+lAddAmountNum
					}else{
						if(lIsAccessoryCarCameraAddSelected){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAccessoryCarCameraAdd)
						}
					}
					lElementAccessoryAddSaveButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAccessoryAddSaveButton)
					if(!lElementAccessoryAddSaveButton){
						return lreturn
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAccessoryAddSaveButton)
					lIsPleaseWaitFormVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPleaseWaitForm,5)
					lIsPleaseWaitFormInvisible=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWaitForm,30)
				}
				if(!lIsPleaseWaitFormInvisible){
					return lreturn
				}
				lAccessoryAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryAdd)
				lAccessoryCarryBoyAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryCarryBoyAdd)
				if(!lIsAccessoryCarryBoyAdd){
					lAccessoryCarryBoyOption=''
				}else{
					lAccessoryCarryBoyOption=lAccessoryCarryBoyOptionItem
				}
				lAccessoryGasFuelingSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryGasFuelingSystemAdd)
				if(!lIsAccessoryGasFuelingSystemAdd){
					lAccessoryGasFuelingSystemOption=''
				}else{
					lAccessoryGasFuelingSystemOption=lAccessoryGasFuelingSystemOptionItem
				}
				lAccessoryBodyKitAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryBodyKitAdd)
				if(!lIsAccessoryBodyKitAdd){
					lAccessoryBodyKitOption=''
				}else{
					lAccessoryBodyKitOption=lAccessoryBodyKitOptionItem
				}
				lAccessoryRimsTiresAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryRimsTiresAdd)
				if(!lIsAccessoryRimsTiresAdd){
					lAccessoryRimsTiresOption=''
				}else{
					lAccessoryRimsTiresOption=lAccessoryRimsTiresOptionItem
				}
				lAccessorySolarFilmAdd=IGNUemaHelper.convertBooleanToString(lIsAccessorySolarFilmAdd)
				if(!lIsAccessorySolarFilmAdd){
					lAccessorySolarFilmOption=''
				}else{
					lAccessorySolarFilmOption=lAccessorySolarFilmOptionItem
				}
				lAccessorySuspensionStabilizerSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessorySuspensionStabilizerSystemAdd)
				if(!lIsAccessorySuspensionStabilizerSystemAdd){
					lAccessorySuspensionStabilizerSystemOption=''
				}else{
					lAccessorySuspensionStabilizerSystemOption=lAccessorySuspensionStabilizerSystemOptionItem
				}
				lAccessoryInVehicleEntertainmentSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryInVehicleEntertainmentSystemAdd)
				if(!lIsAccessoryInVehicleEntertainmentSystemAdd){
					lAccessoryInVehicleEntertainmentSystemOption=''
				}else{
					lAccessoryInVehicleEntertainmentSystemOption=lAccessoryInVehicleEntertainmentSystemOptionItem
				}
				lAccessoryAirIntakeExhaustSystemAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryAirIntakeExhaustSystemAdd)
				if(!lIsAccessoryAirIntakeExhaustSystemAdd){
					lAccessoryAirIntakeExhaustSystemOption=''
				}else{
					lAccessoryAirIntakeExhaustSystemOption=lAccessoryAirIntakeExhaustSystemOptionItem
				}
				lAccessoryCarCameraAdd=IGNUemaHelper.convertBooleanToString(lIsAccessoryCarCameraAdd)
				if(!lIsAccessoryCarCameraAdd){
					lAccessoryCarCameraOption=''
				}else{
					lAccessoryCarCameraOption=lAccessoryCarCameraOptionItem
				}
				lAccessoryAmount=lAccessoryAmountNum.toString()
				String lTagAccessorySectionText='section-accessories'
				String lLocatorAccessorySectionText=IGNUemaHelper.getTagDataSeleniumKey(lTagAccessorySectionText)
				lLocatorAccessorySectionText=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAccessorySectionText,'.item-pack')
				WebElement lElementAccessorySectionText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAccessorySectionText)
				if(lElementAccessorySectionText){
					lAccessoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAccessorySectionText).trim()
				}
			}
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_AMOUNT=lAccessoryAmount
			lResult=lAccessoryAdd.length()>0
			if(lResult){
				lreturn.put('AccessoryAdd',lAccessoryAdd)
				lreturn.put('AccessoryCarryBoyAdd',lAccessoryCarryBoyAdd)
				lreturn.put('AccessoryCarryBoyOption',lAccessoryCarryBoyOption)
				lreturn.put('AccessoryGasFuelingSystemAdd',lAccessoryGasFuelingSystemAdd)
				lreturn.put('AccessoryGasFuelingSystemOption',lAccessoryGasFuelingSystemOption)
				lreturn.put('AccessoryBodyKitAdd',lAccessoryBodyKitAdd)
				lreturn.put('AccessoryBodyKitOption',lAccessoryBodyKitOption)
				lreturn.put('AccessoryRimsTiresAdd',lAccessoryRimsTiresAdd)
				lreturn.put('AccessoryRimsTiresOption',lAccessoryRimsTiresOption)
				lreturn.put('AccessorySolarFilmAdd',lAccessorySolarFilmAdd)
				lreturn.put('AccessorySolarFilmOption',lAccessorySolarFilmOption)
				lreturn.put('AccessorySuspensionStabilizerSystemAdd',lAccessorySuspensionStabilizerSystemAdd)
				lreturn.put('AccessorySuspensionStabilizerSystemOption',lAccessorySuspensionStabilizerSystemOption)
				lreturn.put('AccessoryInVehicleEntertainmentSystemAdd',lAccessoryInVehicleEntertainmentSystemAdd)
				lreturn.put('AccessoryInVehicleEntertainmentSystemOption',lAccessoryInVehicleEntertainmentSystemOption)
				lreturn.put('AccessoryAirIntakeExhaustSystemAdd',lAccessoryAirIntakeExhaustSystemAdd)
				lreturn.put('AccessoryAirIntakeExhaustSystemOption',lAccessoryAirIntakeExhaustSystemOption)
				lreturn.put('AccessoryCarCameraAdd',lAccessoryCarCameraAdd)
				lreturn.put('AccessoryCarCameraOption',lAccessoryCarCameraOption)
				lreturn.put('AccessoryAmount',lAccessoryAmount)
				lreturn.put('AccessoryDetail',lAccessoryDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMe(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQuoteMeA(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'B':
						lreturn=this.inputQuoteMeB(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'C':
						lreturn=this.inputQuoteMeC(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'D':
						lreturn=this.inputQuoteMeD(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'E':
						lreturn=this.inputQuoteMeE(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					case 'F':
						lreturn=this.inputQuoteMeF(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQuoteMeB(strQuoteBy,strQuotePhoneNo,strQuoteEmail,strQuoteNewsletter,strQuoteCallMeNow,strQuotePDFDownloadToDo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeA(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteBy){
				case 'CALL':
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callMeBack-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='p1-call-me-back-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-finished'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lQuoteCallMeNow=''
								lQuotePDFDownloadToDo=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='p1-call-me-back-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='btn-modal-save'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='btn-modal-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 'EMAIL':
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='savequote-v4d-email-submit'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='savequote-v4d-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='savequote-v4d-mobile-submit'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				case 'PDF':
					lQuoteBy='Pdf'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						String lLocatorInputPhoneModal='#step2phone2'
						WebElement lElementInputPhoneModal=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputPhoneModal)
						if(lElementInputPhoneModal){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lStrPhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							if(lStrPhoneNo.length()<=0){
								lTagTextEmailMePhoneNo='savequote-v4d-mobile'
								lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
								lStrPhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							}
							lQuotePhoneNo=lStrPhoneNo
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							String lStrPdfPath=''
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lStrPdfPath=this.driver.getCurrentUrl()
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail=lStrPdfPath
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
						String lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
						IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
						lResult=true
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsScrollToTop(this.driver)
					}
					break
				default:
					lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('MC')||THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('TBA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeB(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteBy){
				case 'CALL':
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callMeBack-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='p1-call-me-back-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-finished'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lQuoteCallMeNow=''
								lQuotePDFDownloadToDo=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='p1-call-me-back-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='btn-modal-save'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='btn-modal-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 'EMAIL':
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='savequote-v4d-email-submit'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='savequote-v4d-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='savequote-v4d-mobile-submit'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				case 'PDF':
					lQuoteBy='Pdf'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						String lLocatorInputPhoneModal='#step2phone2'
						WebElement lElementInputPhoneModal=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInputPhoneModal)
						if(lElementInputPhoneModal){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lStrPhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							if(lStrPhoneNo.length()<=0){
								lTagTextEmailMePhoneNo='savequote-v4d-mobile'
								lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
								lStrPhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							}
							lQuotePhoneNo=lStrPhoneNo
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							String lStrPdfPath=''
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lStrPdfPath=this.driver.getCurrentUrl()
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail=lStrPdfPath
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
						String lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
						IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
						lResult=true
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsScrollToTop(this.driver)
					}
					break
				default:
					lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('MC')||THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('TBA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeC(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteBy){
				case 'CALL':
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callMeBack-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='p1-call-me-back-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-finished'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lQuoteCallMeNow=''
								lQuotePDFDownloadToDo=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='p1-call-me-back-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='btn-modal-save'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='btn-modal-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 'EMAIL':
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='savequote-v4d-email-submit'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='savequote-v4d-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='savequote-v4d-mobile-submit'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				default:
					lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('MC')||THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('TBA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeD(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteBy){
				case 'CALL':
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callMeBack-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='p1-call-me-back-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-finished'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lQuoteCallMeNow=''
								lQuotePDFDownloadToDo=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='p1-call-me-back-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='btn-modal-save'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='btn-modal-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 'EMAIL':
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='savequote-v4d-email-submit'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='savequote-v4d-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='savequote-v4d-mobile-submit'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				default:
					lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('MC')||THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('TBA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeE(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteBy){
				case 'CALL':
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callMeBack-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='p1-call-me-back-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-finished'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lQuoteCallMeNow=''
								lQuotePDFDownloadToDo=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='p1-call-me-back-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='btn-modal-save'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='btn-modal-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 'EMAIL':
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='savequote-v4d-email-submit'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='savequote-v4d-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='savequote-v4d-mobile-submit'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				default:
					lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('MC')||THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('TBA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQuoteMeF(String strQuoteBy,String strQuotePhoneNo,String strQuoteEmail,String strQuoteNewsletter,String strQuoteCallMeNow,String strQuotePDFDownloadToDo){
		Map lreturn=[:]
		String lQuoteBy=strQuoteBy.toUpperCase().trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THAMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THAMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THAMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THAMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
		}
		String lQuotePDFDownloadDetail=''
		String lQuotePDFDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('QuoteBy','')
			lreturn.put('QuotePhoneNo','')
			lreturn.put('QuoteEmail','')
			lreturn.put('QuoteNewsletter','')
			lreturn.put('QuoteCallMeNow','')
			lreturn.put('QuotePDFDownloadToDo','')
			lreturn.put('QuotePDFDownloadDetail','')
			lreturn.put('QuotePDFDownloadResult','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			Boolean lIsQuoteNewsletter=IGNUemaHelper.convertStringToBoolean(lQuoteNewsletter)
			switch(lQuoteBy){
				case 'CALL':
					lQuoteBy='Call'
					String lTagButtonCallMeBack='callmeback-btn'
					String lLocatorButtonCallMeBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBack)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBack)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextCallMeBackPhoneNo='callMeBack-mobile'
						String lLocatorTextCallMeBackPhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackPhoneNo)
						lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackPhoneNo,lQuotePhoneNo)
						String lTagCheckboxCallMeBackConsent='p1-call-me-back-userAcceptConsent'
						String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
						WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
						if(lElementCheckboxCallMeBackConsent){
							String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
							Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
							if(!lIsCheckboxCallMeBackConsentStage){
								IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
							}
						}
						String lTagButtonCallMeBackPhoneNext='callmeback-submit'
						String lLocatorButtonCallMeBackPhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackPhoneNext)){
							IGNUemaHelper.delayThreadSecond(5)
							String lTagButtonCallMeBackPhoneFinished='callmeback-finished'
							String lLocatorButtonCallMeBackPhoneFinished=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackPhoneFinished)
							WebElement lElementButtonCallMeBackPhoneFinished=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonCallMeBackPhoneFinished)
							if(lElementButtonCallMeBackPhoneFinished){
								lQuoteEmail=''
								lQuoteNewsletter=''
								lQuoteCallMeNow=''
								lQuotePDFDownloadToDo=''
								lResult=true
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCallMeBackPhoneFinished)
								IGNUemaHelper.delayThreadSecond(1)
								IGNUemaHelper.webJsScrollToTop(this.driver)
							}else{
								String lTagTextCallMeBackEmail='callback-email'
								String lLocatorTextCallMeBackEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCallMeBackEmail)
								lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextCallMeBackEmail,lQuoteEmail)
								String lTagCheckboxCallMeBackNewsletter='p1-call-me-back-userAcceptConsent'
								String lLocatorCheckboxCallMeBackNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackNewsletter)
								WebElement lElementCheckboxCallMeBackNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackNewsletter)
								if(lElementCheckboxCallMeBackNewsletter){
									String lCheckboxCallMeBackNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
									Boolean lIsCheckboxCallMeBackNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackNewsletterStageStr)
									if(!lIsCheckboxCallMeBackNewsletterStage){
										if(lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}else{
										if(!lIsQuoteNewsletter){
											IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackNewsletter,false)
										}
									}
									lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackNewsletter)
								}else{
									lQuoteNewsletter='No Option'
								}
								String lTagButtonCallMeBackSave='btn-modal-save'
								String lLocatorButtonCallMeBackSave=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackSave)
								if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackSave)){
									IGNUemaHelper.delayThreadSecond(1)
									String lTagButtonCallMeBackGoBack='btn-modal-close'
									String lLocatorButtonCallMeBackGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonCallMeBackGoBack)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonCallMeBackGoBack)){
										lResult=true
										IGNUemaHelper.delayThreadSecond(1)
										IGNUemaHelper.webJsScrollToTop(this.driver)
									}
								}
							}
						}
					}
					break
				case 'EMAIL':
					lQuoteBy='Email'
					String lTagButtonEmailMe='create-policy'
					String lLocatorButtonEmailMe=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMe)
					if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMe)){
						IGNUemaHelper.delayThreadSecond(1)
						String lTagTextEmailMeEmail='savequote-v4d-email'
						String lLocatorTextEmailMeEmail=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMeEmail)
						WebElement lElementTextEmailMeEmail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMeEmail)
						if(!lElementTextEmailMeEmail){
							String lTagTextEmailMePhoneNo='savequote-v4d-mobileNumber'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
							String lTagButtonEmailMePhoneNext=''
							String lLocatorButtonEmailMePhoneNext=''
							Boolean lIsQuoteCallMeNow=IGNUemaHelper.convertStringToBoolean(lQuoteCallMeNow)
							if(!lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4no'
							}
							if(lIsQuoteCallMeNow){
								lLocatorButtonEmailMePhoneNext='#pk2call4Yes'
							}
							lQuoteCallMeNow=IGNUemaHelper.convertBooleanToString(lIsQuoteCallMeNow)
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
						}else{
							lQuoteCallMeNow='No Option'
						}
						lQuoteEmail=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMeEmail,lQuoteEmail)
						String lTagCheckboxEmailMeNewsletter='savequote-v4d-userAcceptConsent'
						String lLocatorCheckboxEmailMeNewsletter=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEmailMeNewsletter)
						WebElement lElementCheckboxEmailMeNewsletter=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEmailMeNewsletter)
						if(lElementCheckboxEmailMeNewsletter){
							String lCheckboxEmailMeNewsletterStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
							Boolean lIsCheckboxEmailMeNewsletterStage=IGNUemaHelper.convertStringToBoolean(lCheckboxEmailMeNewsletterStageStr)
							if(!lIsCheckboxEmailMeNewsletterStage){
								if(lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}else{
								if(!lIsQuoteNewsletter){
									IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxEmailMeNewsletter,false)
								}
							}
							lQuoteNewsletter=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEmailMeNewsletter)
						}else{
							lQuoteNewsletter='No Option'
						}
						String lTagQuotePDFDownload='savequote-v4d-pdf-submit'
						String lLocatorQuotePDFDownload=IGNUemaHelper.getTagDataSeleniumKey(lTagQuotePDFDownload)
						WebElement lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
						if(lElementQuotePDFDownload){
							Boolean lIsQuotePDFDownloadDetail=false
							Boolean lIsQuotePDFDownloadResult=false
							Boolean lIsQuotePDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lQuotePDFDownloadToDo)
							if(lIsQuotePDFDownloadToDo){
								lElementQuotePDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagQuotePDFDownload)
								if(!lElementQuotePDFDownload){
									return lreturn
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQuotePDFDownload)
								IGNUemaHelper.delayThreadSecond(3)
								String lTagFormLoading=''
								String lLocatorFormLoading='#myPleaseWait'
								Boolean lIsFormLoading=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormLoading,5)
								lIsFormLoading=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorFormLoading)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
									IGNUemaHelper.delayThreadSecond(1)
									if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
								}
								lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								if(!lIsFormLoading){
									IGNUemaHelper.delayThreadSecond(1)
									if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
										IGNUemaHelper.delayThreadSecond(3)
									}
									lIsFormLoading=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
								}
								if(!lIsFormLoading){
									return lreturn
								}else{
									String lMainWindow=this.driver.getWindowHandle()
									if(lMainWindow.length()<=0){
										lMainWindow=this.driver.getWindowHandle()
									}
									try{
										Set<String> lSetWinHandle=this.driver.getWindowHandles()
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
										for(String lWindowHandle:lSetWinHandle){
											if(!lMainWindow.equals(lWindowHandle)){
												this.driver.switchTo().window(lWindowHandle)
												IGNUemaHelper.delayThreadSecond(10)
												lIsQuotePDFDownloadResult=true
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
								}
								IGNUemaHelper.delayThreadSecond(2)
								if(lIsQuotePDFDownloadResult){
									lQuotePDFDownloadDetail='Passed'
									lQuotePDFDownloadResult='Passed'
								}else{
									lQuotePDFDownloadDetail='Failed'
									lQuotePDFDownloadResult='Failed'
								}
							}
						}else{
							lQuotePDFDownloadToDo='No Option'
						}
						String lTagButtonEmailMeEmailNext='savequote-v4d-email-submit'
						String lLocatorButtonEmailMeEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeEmailNext)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeEmailNext)){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagTextEmailMePhoneNo='savequote-v4d-mobile'
							String lLocatorTextEmailMePhoneNo=IGNUemaHelper.getTagDataSeleniumKey(lTagTextEmailMePhoneNo)
							String lTagButtonEmailMeGoBack=''
							String lLocatorButtonEmailMeGoBack=''
							WebElement lElementTextEmailMePhoneNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextEmailMePhoneNo)
							if(lElementTextEmailMePhoneNo){
								lQuotePhoneNo=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorTextEmailMePhoneNo,lQuotePhoneNo)
								String lTagButtonEmailMePhoneNext='savequote-v4d-mobile-submit'
								String lLocatorButtonEmailMePhoneNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMePhoneNext)
								IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMePhoneNext)
								IGNUemaHelper.delayThreadSecond(1)
								lTagButtonEmailMeGoBack='savequote-v4d-modal-close'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}else{
								lTagButtonEmailMeGoBack='btn-createpolicy-customize-modal'
								lLocatorButtonEmailMeGoBack=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonEmailMeGoBack)
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonEmailMeGoBack)
							lResult=true
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsScrollToTop(this.driver)
						}
					}
					break
				default:
					lQuoteBy=THAMotorCarQuotationResultType.DEFAULT_QUOTE_BY
					lQuotePhoneNo=''
					lQuoteEmail=''
					lQuoteNewsletter=''
					lQuoteCallMeNow=''
					lQuotePDFDownloadToDo=''
					lQuotePDFDownloadDetail=''
					lQuotePDFDownloadResult=''
					lResult=true
					break
			}
			this.waitUntilOpportunityNumberUpdated()
			if(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('MC')||THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.toUpperCase().contains('TBA')){
				this.checkAnonymousAccountToGetActualOpportunityNumberByRedirecting()
			}
			if(lResult){
				lreturn.put('QuoteBy',lQuoteBy)
				lreturn.put('QuotePhoneNo',lQuotePhoneNo)
				lreturn.put('QuoteEmail',lQuoteEmail)
				lreturn.put('QuoteNewsletter',lQuoteNewsletter)
				lreturn.put('QuoteCallMeNow',lQuoteCallMeNow)
				lreturn.put('QuotePDFDownloadToDo',lQuotePDFDownloadToDo)
				lreturn.put('QuotePDFDownloadDetail',lQuotePDFDownloadDetail)
				lreturn.put('QuotePDFDownloadResult',lQuotePDFDownloadResult)
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
			lSalesforceProceedTodo=THAMotorCarQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			lSalesforceProceedTodo='Yes'
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			lSalesforceProceedTodo=IGNUemaHelper.convertBooleanToString(lIsSalesforceProceedTodo)
			THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=this.checkOpportunityNumber(THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER)
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
	public Map inputAutomationDataBefore(){
		Map lreturn=[:]
		String lAutomationPageValue=''
		String lAutomationPageText=''
		String lAutomationVersionValue=''
		String lAutomationVersionText=''
		String lAutomationOpportunityNumberValue=''
		String lAutomationOpportunityNumberText=''
		String lAutomationVehicleDetailValue=''
		String lAutomationVehicleDetailText=''
		String lAutomationPremiumYearlyValue=''
		String lAutomationPremiumYearlyText=''
		String lAutomationPremiumDepositValue=''
		String lAutomationPremiumDepositText=''
		String lAutomationPremiumMonthlyValue=''
		String lAutomationPremiumMonthlyText=''
		String lAutomationPremiumInstalmentValue=''
		String lAutomationPremiumInstalmentText=''
		String lAutomationPremiumNoDepositAmountValue=''
		String lAutomationPremiumNoDepositAmountText=''
		String lAutomationPremiumNoDepositTotalValue=''
		String lAutomationPremiumNoDepositTotalText=''
		String lAutomationPremiumQuarterlyAmountValue=''
		String lAutomationPremiumQuarterlyAmountText=''
		String lAutomationPremiumQuarterlyTotalValue=''
		String lAutomationPremiumQuarterlyTotalText=''
		String lAutomationPlanTypeValue=''
		String lAutomationPlanTypeText=''
		String lAutomationSumInsuredValue=''
		String lAutomationSumInsuredText=''
		String lAutomationWorkshopValue=''
		String lAutomationWorkshopText=''
		String lAutomationExcessPriceValue=''
		String lAutomationExcessPriceText=''
		String lAutomationDriverPlanValue=''
		String lAutomationDriverPlanText=''
		String lAutomationTpbiValue=''
		String lAutomationTpbiText=''
		String lAutomationTppdValue=''
		String lAutomationTppdText=''
		String lAutomationPaAndMeValue=''
		String lAutomationPaAndMeText=''
		String lAutomationPaOnlyValue=''
		String lAutomationPaOnlyText=''
		String lAutomationMeOnlyValue=''
		String lAutomationMeOnlyText=''
		String lAutomationCompulsoryValue=''
		String lAutomationCompulsoryText=''
		String lAutomationRsaValue=''
		String lAutomationRsaText=''
		String lAutomationCarReplacementServiceValue=''
		String lAutomationCarReplacementServiceText=''
		String lAutomationAccessoryItem01Value=''
		String lAutomationAccessoryItem01Text=''
		String lAutomationAccessoryItem02Value=''
		String lAutomationAccessoryItem02Text=''
		String lAutomationAccessoryItem03Value=''
		String lAutomationAccessoryItem03Text=''
		String lAutomationAccessoryItem04Value=''
		String lAutomationAccessoryItem04Text=''
		String lAutomationAccessoryItem05Value=''
		String lAutomationAccessoryItem05Text=''
		String lAutomationAccessoryItem06Value=''
		String lAutomationAccessoryItem06Text=''
		String lAutomationAccessoryItem07Value=''
		String lAutomationAccessoryItem07Text=''
		String lAutomationAccessoryItem08Value=''
		String lAutomationAccessoryItem08Text=''
		String lAutomationAccessoryItem09Value=''
		String lAutomationAccessoryItem09Text=''
		String lAutomationAccessoryItem10Value=''
		String lAutomationAccessoryItem10Text=''
		try{
			Boolean lResult=false
			lreturn.put('AutomationPageValue','')
			lreturn.put('AutomationPageText','')
			lreturn.put('AutomationVersionValue','')
			lreturn.put('AutomationVersionText','')
			lreturn.put('AutomationOpportunityNumberValue','')
			lreturn.put('AutomationOpportunityNumberText','')
			lreturn.put('AutomationVehicleDetailValue','')
			lreturn.put('AutomationVehicleDetailText','')
			lreturn.put('AutomationPremiumYearlyValue','')
			lreturn.put('AutomationPremiumYearlyText','')
			lreturn.put('AutomationPremiumDepositValue','')
			lreturn.put('AutomationPremiumDepositText','')
			lreturn.put('AutomationPremiumMonthlyValue','')
			lreturn.put('AutomationPremiumMonthlyText','')
			lreturn.put('AutomationPremiumInstalmentValue','')
			lreturn.put('AutomationPremiumInstalmentText','')
			lreturn.put('AutomationPremiumNoDepositAmountValue','')
			lreturn.put('AutomationPremiumNoDepositAmountText','')
			lreturn.put('AutomationPremiumNoDepositTotalValue','')
			lreturn.put('AutomationPremiumNoDepositTotalText','')
			lreturn.put('AutomationPremiumQuarterlyAmountValue','')
			lreturn.put('AutomationPremiumQuarterlyAmountText','')
			lreturn.put('AutomationPremiumQuarterlyTotalValue','')
			lreturn.put('AutomationPremiumQuarterlyTotalText','')
			lreturn.put('AutomationPlanTypeValue','')
			lreturn.put('AutomationPlanTypeText','')
			lreturn.put('AutomationSumInsuredValue','')
			lreturn.put('AutomationSumInsuredText','')
			lreturn.put('AutomationWorkshopValue','')
			lreturn.put('AutomationWorkshopText','')
			lreturn.put('AutomationExcessPriceValue','')
			lreturn.put('AutomationExcessPriceText','')
			lreturn.put('AutomationDriverPlanValue','')
			lreturn.put('AutomationDriverPlanText','')
			lreturn.put('AutomationTpbiValue','')
			lreturn.put('AutomationTpbiText','')
			lreturn.put('AutomationTppdValue','')
			lreturn.put('AutomationTppdText','')
			lreturn.put('AutomationPaAndMeValue','')
			lreturn.put('AutomationPaAndMeText','')
			lreturn.put('AutomationPaOnlyValue','')
			lreturn.put('AutomationPaOnlyText','')
			lreturn.put('AutomationMeOnlyValue','')
			lreturn.put('AutomationMeOnlyText','')
			lreturn.put('AutomationCompulsoryValue','')
			lreturn.put('AutomationCompulsoryText','')
			lreturn.put('AutomationRsaValue','')
			lreturn.put('AutomationRsaText','')
			lreturn.put('AutomationCarReplacementServiceValue','')
			lreturn.put('AutomationCarReplacementServiceText','')
			lreturn.put('AutomationAccessoryItem01Value','')
			lreturn.put('AutomationAccessoryItem01Text','')
			lreturn.put('AutomationAccessoryItem02Value','')
			lreturn.put('AutomationAccessoryItem02Text','')
			lreturn.put('AutomationAccessoryItem03Value','')
			lreturn.put('AutomationAccessoryItem03Text','')
			lreturn.put('AutomationAccessoryItem04Value','')
			lreturn.put('AutomationAccessoryItem04Text','')
			lreturn.put('AutomationAccessoryItem05Value','')
			lreturn.put('AutomationAccessoryItem05Text','')
			lreturn.put('AutomationAccessoryItem06Value','')
			lreturn.put('AutomationAccessoryItem06Text','')
			lreturn.put('AutomationAccessoryItem07Value','')
			lreturn.put('AutomationAccessoryItem07Text','')
			lreturn.put('AutomationAccessoryItem08Value','')
			lreturn.put('AutomationAccessoryItem08Text','')
			lreturn.put('AutomationAccessoryItem09Value','')
			lreturn.put('AutomationAccessoryItem09Text','')
			lreturn.put('AutomationAccessoryItem10Value','')
			lreturn.put('AutomationAccessoryItem10Text','')
			lreturn.put('Result',lResult)
			String lTagAutomationParent='Automation'
			String lLocatorAutomationParent=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationParent)
			WebElement lElementAutomationParent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAutomationParent)
			if(lElementAutomationParent){
				String lTagAutomationPage='Page'
				String lLocatorAutomationPage=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPage)
				WebElement lElementAutomationPage=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPage)
				if(!lElementAutomationPage){
					lAutomationPageValue='No Option'
				}else{
					lAutomationPageValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPage).trim()
					WebElement lElementAutomationPageText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPage,lAutomationPageValue)
					if(lElementAutomationPageText){
						lAutomationPageText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPageText).trim()
					}
				}
				String lTagAutomationVersion='ABTesting'
				String lLocatorAutomationVersion=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationVersion)
				WebElement lElementAutomationVersion=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationVersion)
				if(!lElementAutomationVersion){
					lAutomationVersionValue='No Option'
				}else{
					lAutomationVersionValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationVersion).trim()
					WebElement lElementAutomationVersionText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationVersion,lAutomationVersionValue)
					if(lElementAutomationVersionText){
						lAutomationVersionText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationVersionText).trim()
					}
				}
				String lTagAutomationOpportunityNumber='Opp-no'
				String lLocatorAutomationOpportunityNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationOpportunityNumber)
				WebElement lElementAutomationOpportunityNumber=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationOpportunityNumber)
				if(!lElementAutomationOpportunityNumber){
					lAutomationOpportunityNumberValue='No Option'
				}else{
					lAutomationOpportunityNumberValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationOpportunityNumber).trim()
					lAutomationOpportunityNumberValue=this.checkOpportunityNumber(lAutomationOpportunityNumberValue)
					WebElement lElementAutomationOpportunityNumberText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationOpportunityNumber,lAutomationOpportunityNumberValue)
					if(lElementAutomationOpportunityNumberText){
						lAutomationOpportunityNumberText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationOpportunityNumberText).trim()
					}
				}
				String lTagAutomationVehicleDetail='Vehicle'
				String lLocatorAutomationVehicleDetail=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationVehicleDetail)
				WebElement lElementAutomationVehicleDetail=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationVehicleDetail)
				if(!lElementAutomationVehicleDetail){
					lAutomationVehicleDetailValue='No Option'
				}else{
					lAutomationVehicleDetailValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationVehicleDetail).trim()
					WebElement lElementAutomationVehicleDetailText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationVehicleDetail,lAutomationVehicleDetailValue)
					if(lElementAutomationVehicleDetailText){
						lAutomationVehicleDetailText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationVehicleDetailText).trim()
					}
				}
				String lTagAutomationPaymentFrequency='PaymentFrequency'
				String lLocatorAutomationPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaymentFrequency)
				WebElement lElementAutomationPaymentFrequency=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPaymentFrequency)
				if(!lElementAutomationPaymentFrequency){
					return lreturn
				}else{
					String lAutomationPremiumYearly='Yearly'
					String lAutomationPremiumMonthly='Monthly'
					String lAutomationPremiumNoDeposit='Monthly no deposit'
					String lAutomationPremiumQuarterly='Quarterly'
					String lTagPaymentOptionMotorSwitchButton='paymentOptions'
					String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
					WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
					if(!lElementPaymentOptionMotorSwitchButton){
						return lreturn
					}
					String lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
					String lLocatorAutomationPaymentFrequencyValue=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaymentFrequency)
					WebElement lElementAutomationPaymentFrequencyValue=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPaymentFrequency,lTagAutomationPaymentFrequencyValue)
					if(!lElementAutomationPaymentFrequencyValue){
						return lreturn
					}
					Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
					Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
					if(!lIsPaymentOptionMotorSwitchButtonDisabled){
						if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
						}
					}
					lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
					lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
					lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
					if(lIsPaymentOptionMotorSwitchButtonAsYearly){
						String lTagAutomationSummaryPrice='SummaryPrice'
						String lLocatorAutomationSummaryPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationSummaryPrice)
						WebElement lElementAutomationSummaryPrice=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice)
						if(!lElementAutomationSummaryPrice){
							return lreturn
						}
						lAutomationPremiumYearlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
						lAutomationPremiumDepositValue='No Option'
						lAutomationPremiumMonthlyValue='No Option'
						lAutomationPremiumInstalmentValue='No Option'
						lAutomationPremiumNoDepositAmountValue='No Option'
						lAutomationPremiumNoDepositTotalValue='No Option'
						lAutomationPremiumQuarterlyAmountValue='No Option'
						lAutomationPremiumQuarterlyTotalValue='No Option'
						if(!lIsPaymentOptionMotorSwitchButtonDisabled){
							if(lIsPaymentOptionMotorSwitchButtonAsYearly){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
							}
							lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
							lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
							lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
							if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
								switch(lTagAutomationPaymentFrequencyValue){
									case lAutomationPremiumMonthly:
										if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
											lAutomationPremiumMonthlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
											WebElement lElementAutomationPremiumMonthlyText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice,lAutomationPremiumMonthlyValue)
											if(lElementAutomationPremiumMonthlyText){
												lAutomationPremiumMonthlyText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPremiumMonthlyText).trim()
											}
										}
										break
									case lAutomationPremiumQuarterly:
										if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
											lAutomationPremiumQuarterlyAmountValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
											WebElement lElementAutomationPremiumQuarterlyTotalValue=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice,lAutomationPremiumQuarterlyAmountValue)
											if(lElementAutomationPremiumQuarterlyTotalValue){
												lAutomationPremiumQuarterlyTotalValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPremiumQuarterlyTotalValue).trim()
											}
										}
										break
									default:
										if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
											lAutomationPremiumNoDepositAmountValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
											WebElement lElementAutomationPremiumNoDepositTotalValue=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice,lAutomationPremiumNoDepositAmountValue)
											if(lElementAutomationPremiumNoDepositTotalValue){
												lAutomationPremiumNoDepositTotalValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPremiumNoDepositTotalValue).trim()
											}
										}
										break
								}
							}
						}
					}
					if(!lIsPaymentOptionMotorSwitchButtonDisabled){
						if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
						}
						lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
						lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
						lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
						if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
							return lreturn
						}
					}
				}
				String lTagAutomationPlanType='CoverType'
				String lLocatorAutomationPlanType=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPlanType)
				WebElement lElementAutomationPlanType=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPlanType)
				if(!lElementAutomationPlanType){
					lAutomationPlanTypeValue='No Option'
				}else{
					lAutomationPlanTypeValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPlanType).trim()
					WebElement lElementAutomationPlanTypeText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPlanType,lAutomationPlanTypeValue)
					if(lElementAutomationPlanTypeText){
						lAutomationPlanTypeText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPlanTypeText).trim()
					}
				}
				String lTagAutomationSumInsured='Sum-insured'
				String lLocatorAutomationSumInsured=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationSumInsured)
				WebElement lElementAutomationSumInsured=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationSumInsured)
				if(!lElementAutomationSumInsured){
					lAutomationSumInsuredValue='No Option'
				}else{
					lAutomationSumInsuredValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSumInsured).trim()
					WebElement lElementAutomationSumInsuredText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSumInsured,lAutomationSumInsuredValue)
					if(lElementAutomationSumInsuredText){
						lAutomationSumInsuredText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationSumInsuredText).trim()
					}
				}
				String lTagAutomationWorkshop='Workshop'
				String lLocatorAutomationWorkshop=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationWorkshop)
				WebElement lElementAutomationWorkshop=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationWorkshop)
				if(!lElementAutomationWorkshop){
					lAutomationWorkshopValue='No Option'
				}else{
					lAutomationWorkshopValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationWorkshop).trim()
					WebElement lElementAutomationWorkshopText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationWorkshop,lAutomationWorkshopValue)
					if(lElementAutomationWorkshopText){
						lAutomationWorkshopText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationWorkshopText).trim()
					}
				}
				String lTagAutomationExcessPrice='ExcessPrice'
				String lLocatorAutomationExcessPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationExcessPrice)
				WebElement lElementAutomationExcessPrice=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationExcessPrice)
				if(!lElementAutomationExcessPrice){
					lAutomationExcessPriceValue='No Option'
				}else{
					lAutomationExcessPriceValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationExcessPrice).trim()
					WebElement lElementAutomationExcessPriceText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationExcessPrice,lAutomationExcessPriceValue)
					if(lElementAutomationExcessPriceText){
						lAutomationExcessPriceText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationExcessPriceText).trim()
					}
				}
				String lTagAutomationDriverPlan='DriverPlan'
				String lLocatorAutomationDriverPlan=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationDriverPlan)
				WebElement lElementAutomationDriverPlan=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationDriverPlan)
				if(!lElementAutomationDriverPlan){
					lAutomationDriverPlanValue='No Option'
				}else{
					lAutomationDriverPlanValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationDriverPlan).trim()
					WebElement lElementAutomationDriverPlanText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationDriverPlan,lAutomationDriverPlanValue)
					if(lElementAutomationDriverPlanText){
						lAutomationDriverPlanText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationDriverPlanText).trim()
					}
				}
				String lTagAutomationTPBI='TPBI'
				String lLocatorAutomationTPBI=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationTPBI)
				WebElement lElementAutomationTPBI=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationTPBI)
				if(!lElementAutomationTPBI){
					lAutomationTpbiValue='No Option'
				}else{
					lAutomationTpbiValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationTPBI).trim()
					WebElement lElementAutomationTPBIText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationTPBI,lAutomationTpbiValue)
					if(lElementAutomationTPBIText){
						lAutomationTpbiText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationTPBIText).trim()
					}
				}
				String lTagAutomationTPPD='TPPD'
				String lLocatorAutomationTPPD=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationTPPD)
				WebElement lElementAutomationTPPD=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationTPPD)
				if(!lElementAutomationTPPD){
					lAutomationTppdValue='No Option'
				}else{
					lAutomationTppdValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationTPPD).trim()
					WebElement lElementAutomationTPPDText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationTPPD,lAutomationTppdValue)
					if(lElementAutomationTPPDText){
						lAutomationTppdText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationTPPDText).trim()
					}
				}
				String lTagAutomationPaAndMe='PAME'
				String lLocatorAutomationPaAndMe=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaAndMe)
				WebElement lElementAutomationPaAndMe=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPaAndMe)
				if(!lElementAutomationPaAndMe){
					lAutomationPaAndMeValue='No Option'
				}else{
					lAutomationPaAndMeValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaAndMe).trim()
					WebElement lElementAutomationPaAndMeText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPaAndMe,lAutomationPaAndMeValue)
					if(lElementAutomationPaAndMeText){
						lAutomationPaAndMeText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPaAndMeText).trim()
					}
				}
				String lTagAutomationPaOnly='PaOnly'
				String lLocatorAutomationPaOnly=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaOnly)
				WebElement lElementAutomationPaOnly=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPaOnly)
				if(!lElementAutomationPaOnly){
					lAutomationPaOnlyValue="No Option"
				}else{
					lAutomationPaOnlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaOnly).trim()
					WebElement lElementAutomationPaOnlyText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPaOnly,lAutomationPaOnlyValue)
					if(lElementAutomationPaOnlyText){
						lAutomationPaOnlyText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPaOnlyText).trim()
					}
				}
				String lTagAutomationMeOnly='MeOnly'
				String lLocatorAutomationMeOnly=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationMeOnly)
				WebElement lElementAutomationMeOnly=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationMeOnly)
				if(!lElementAutomationMeOnly){
					lAutomationMeOnlyValue="No Option"
				}else{
					lAutomationMeOnlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationMeOnly).trim()
					WebElement lElementAutomationMeOnlyText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationMeOnly,lAutomationMeOnlyValue)
					if(lElementAutomationMeOnlyText){
						lAutomationMeOnlyText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationMeOnlyText).trim()
					}
				}
				String lTagAutomationCompulsory='Compulsory'
				String lLocatorAutomationCompulsory=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationCompulsory)
				WebElement lElementAutomationCompulsory=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationCompulsory)
				if(!lElementAutomationCompulsory){
					lAutomationCompulsoryValue='No Option'
				}else{
					lAutomationCompulsoryValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationCompulsory).trim()
					WebElement lElementAutomationCompulsoryText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationCompulsory,lAutomationCompulsoryValue)
					if(lElementAutomationCompulsoryText){
						lAutomationCompulsoryText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationCompulsoryText).trim()
					}
				}
				String lTagAutomationRsa='RSA'
				String lLocatorAutomationRsa=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationRsa)
				WebElement lElementAutomationRsa=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationRsa)
				if(!lElementAutomationRsa){
					lAutomationRsaValue='No Option'
				}else{
					lAutomationRsaValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationRsa).trim()
					WebElement lElementAutomationRsaText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationRsa,lAutomationRsaValue)
					if(lElementAutomationRsaText){
						lAutomationRsaText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationRsaText).trim()
					}
				}
				String lTagAutomationCarReplacementService='CarReplacement'
				String lLocatorAutomationCarReplacementService=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationCarReplacementService)
				WebElement lElementAutomationCarReplacementService=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationCarReplacementService)
				if(!lElementAutomationCarReplacementService){
					lAutomationCarReplacementServiceValue='No Option'
				}else{
					lAutomationCarReplacementServiceValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationCarReplacementService).trim()
					WebElement lElementAutomationCarReplacementServiceText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationCarReplacementService,lAutomationCarReplacementServiceValue)
					if(lElementAutomationCarReplacementServiceText){
						lAutomationCarReplacementServiceText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationCarReplacementServiceText).trim()
					}
				}
				String lTagAutomationAccessoryParent='Accessories'
				String lLocatorAutomationAccessoryParent=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationAccessoryParent)
				WebElement lElementAutomationAccessoryParent=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationAccessoryParent)
				if(lElementAutomationAccessoryParent){
					String lTagAutomationAccessoryChild='item'
					String lLocatorAutomationAccessoryChild=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationAccessoryChild)
					List<WebElement> lElementAutomationAccessoryList=IGNUemaHelper.getChildWebElementListFromDataSeleniumKey(this.driver,lElementAutomationAccessoryParent,lTagAutomationAccessoryChild)
					if(lElementAutomationAccessoryList){
						String lAutomationAccessoryItemValue=''
						String lAutomationAccessoryItemText=''
						Integer lIndexAccessoryItem=0
						for(WebElement lElementAutomationAccessoryItem in lElementAutomationAccessoryList){
							lIndexAccessoryItem=lIndexAccessoryItem+1
							switch(lIndexAccessoryItem){
								case 2:
									lAutomationAccessoryItem02Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem02Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 3:
									lAutomationAccessoryItem03Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem03Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 4:
									lAutomationAccessoryItem04Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem04Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 5:
									lAutomationAccessoryItem05Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem05Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 6:
									lAutomationAccessoryItem06Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem06Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 7:
									lAutomationAccessoryItem07Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem07Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 8:
									lAutomationAccessoryItem08Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem08Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 9:
									lAutomationAccessoryItem09Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem09Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 10:
									lAutomationAccessoryItem10Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem10Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								default:
									lAutomationAccessoryItem01Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem01Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
							}
						}
					}
				}
			}
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PAGE_VALUE=lAutomationPageValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PAGE_TEXT=lAutomationPageText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VERSION_VALUE=lAutomationVersionValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VERSION_TEXT=lAutomationVersionText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE=lAutomationOpportunityNumberValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_TEXT=lAutomationOpportunityNumberText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VEHICLE_DETAIL_VALUE=lAutomationVehicleDetailValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VEHICLE_DETAIL_TEXT=lAutomationVehicleDetailText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE=lAutomationPremiumYearlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_TEXT=lAutomationPremiumYearlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_VALUE=lAutomationPremiumDepositValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_TEXT=lAutomationPremiumDepositText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_VALUE=lAutomationPremiumMonthlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_TEXT=lAutomationPremiumMonthlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_VALUE=lAutomationPremiumInstalmentValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_TEXT=lAutomationPremiumInstalmentText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE=lAutomationPremiumNoDepositAmountValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_TEXT=lAutomationPremiumNoDepositAmountText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE=lAutomationPremiumNoDepositTotalValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_TEXT=lAutomationPremiumNoDepositTotalText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_VALUE=lAutomationPremiumQuarterlyAmountValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_TEXT=lAutomationPremiumQuarterlyAmountText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_VALUE=lAutomationPremiumQuarterlyTotalValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_TEXT=lAutomationPremiumQuarterlyTotalText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PLAN_TYPE_VALUE=lAutomationPlanTypeValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PLAN_TYPE_TEXT=lAutomationPlanTypeText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_SUM_INSURED_VALUE=lAutomationSumInsuredValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_SUM_INSURED_TEXT=lAutomationSumInsuredText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_VALUE=lAutomationWorkshopValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_TEXT=lAutomationWorkshopText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_EXCESS_PRICE_VALUE=lAutomationExcessPriceValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_EXCESS_PRICE_TEXT=lAutomationExcessPriceText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_DRIVER_PLAN_VALUE=lAutomationDriverPlanValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_DRIVER_PLAN_TEXT=lAutomationDriverPlanText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPBI_VALUE=lAutomationTpbiValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPBI_TEXT=lAutomationTpbiText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPPD_VALUE=lAutomationTppdValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPPD_TEXT=lAutomationTppdText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_AND_ME_VALUE=lAutomationPaAndMeValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_AND_ME_TEXT=lAutomationPaAndMeText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_ONLY_VALUE=lAutomationPaOnlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_ONLY_TEXT=lAutomationPaOnlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ME_ONLY_VALUE=lAutomationMeOnlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ME_ONLY_TEXT=lAutomationMeOnlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_COMPULSORY_VALUE=lAutomationCompulsoryValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_COMPULSORY_TEXT=lAutomationCompulsoryText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_RSA_VALUE=lAutomationRsaValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_RSA_TEXT=lAutomationRsaText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_CAR_REPLACEMENT_SERVICE_VALUE=lAutomationCarReplacementServiceValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_CAR_REPLACEMENT_SERVICE_TEXT=lAutomationCarReplacementServiceText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_01_VALUE=lAutomationAccessoryItem01Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_01_TEXT=lAutomationAccessoryItem01Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_02_VALUE=lAutomationAccessoryItem02Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_02_TEXT=lAutomationAccessoryItem02Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_03_VALUE=lAutomationAccessoryItem03Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_03_TEXT=lAutomationAccessoryItem03Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_04_VALUE=lAutomationAccessoryItem04Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_04_TEXT=lAutomationAccessoryItem04Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_05_VALUE=lAutomationAccessoryItem05Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_05_TEXT=lAutomationAccessoryItem05Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_06_VALUE=lAutomationAccessoryItem06Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_06_TEXT=lAutomationAccessoryItem06Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_07_VALUE=lAutomationAccessoryItem07Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_07_TEXT=lAutomationAccessoryItem07Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_08_VALUE=lAutomationAccessoryItem08Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_08_TEXT=lAutomationAccessoryItem08Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_09_VALUE=lAutomationAccessoryItem09Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_09_TEXT=lAutomationAccessoryItem09Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_10_VALUE=lAutomationAccessoryItem10Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_10_TEXT=lAutomationAccessoryItem10Text
			lResult=true
			if(lResult){
				lreturn.put('AutomationPageValue',lAutomationPageValue)
				lreturn.put('AutomationPageText',lAutomationPageText)
				lreturn.put('AutomationVersionValue',lAutomationVersionValue)
				lreturn.put('AutomationVersionText',lAutomationVersionText)
				lreturn.put('AutomationOpportunityNumberValue',lAutomationOpportunityNumberValue)
				lreturn.put('AutomationOpportunityNumberText',lAutomationOpportunityNumberText)
				lreturn.put('AutomationVehicleDetailValue',lAutomationVehicleDetailValue)
				lreturn.put('AutomationVehicleDetailText',lAutomationVehicleDetailText)
				lreturn.put('AutomationPremiumYearlyValue',lAutomationPremiumYearlyValue)
				lreturn.put('AutomationPremiumYearlyText',lAutomationPremiumYearlyText)
				lreturn.put('AutomationPremiumDepositValue',lAutomationPremiumDepositValue)
				lreturn.put('AutomationPremiumDepositText',lAutomationPremiumDepositText)
				lreturn.put('AutomationPremiumMonthlyValue',lAutomationPremiumMonthlyValue)
				lreturn.put('AutomationPremiumMonthlyText',lAutomationPremiumMonthlyText)
				lreturn.put('AutomationPremiumInstalmentValue',lAutomationPremiumInstalmentValue)
				lreturn.put('AutomationPremiumInstalmentText',lAutomationPremiumInstalmentText)
				lreturn.put('AutomationPremiumNoDepositAmountValue',lAutomationPremiumNoDepositAmountValue)
				lreturn.put('AutomationPremiumNoDepositAmountText',lAutomationPremiumNoDepositAmountText)
				lreturn.put('AutomationPremiumNoDepositTotalValue',lAutomationPremiumNoDepositTotalValue)
				lreturn.put('AutomationPremiumNoDepositTotalText',lAutomationPremiumNoDepositTotalText)
				lreturn.put('AutomationPremiumQuarterlyAmountValue',lAutomationPremiumQuarterlyAmountValue)
				lreturn.put('AutomationPremiumQuarterlyAmountText',lAutomationPremiumQuarterlyAmountText)
				lreturn.put('AutomationPremiumQuarterlyTotalValue',lAutomationPremiumQuarterlyTotalValue)
				lreturn.put('AutomationPremiumQuarterlyTotalText',lAutomationPremiumQuarterlyTotalText)
				lreturn.put('AutomationPlanTypeValue',lAutomationPlanTypeValue)
				lreturn.put('AutomationPlanTypeText',lAutomationPlanTypeText)
				lreturn.put('AutomationSumInsuredValue',lAutomationSumInsuredValue)
				lreturn.put('AutomationSumInsuredText',lAutomationSumInsuredText)
				lreturn.put('AutomationWorkshopValue',lAutomationWorkshopValue)
				lreturn.put('AutomationWorkshopText',lAutomationWorkshopText)
				lreturn.put('AutomationExcessPriceValue',lAutomationExcessPriceValue)
				lreturn.put('AutomationExcessPriceText',lAutomationExcessPriceText)
				lreturn.put('AutomationDriverPlanValue',lAutomationDriverPlanValue)
				lreturn.put('AutomationDriverPlanText',lAutomationDriverPlanText)
				lreturn.put('AutomationTpbiValue',lAutomationTpbiValue)
				lreturn.put('AutomationTpbiText',lAutomationTpbiText)
				lreturn.put('AutomationTppdValue',lAutomationTppdValue)
				lreturn.put('AutomationTppdText',lAutomationTppdText)
				lreturn.put('AutomationPaAndMeValue',lAutomationPaAndMeValue)
				lreturn.put('AutomationPaAndMeText',lAutomationPaAndMeText)
				lreturn.put('AutomationPaOnlyValue',lAutomationPaOnlyValue)
				lreturn.put('AutomationPaOnlyText',lAutomationPaOnlyText)
				lreturn.put('AutomationMeOnlyValue',lAutomationMeOnlyValue)
				lreturn.put('AutomationMeOnlyText',lAutomationMeOnlyText)
				lreturn.put('AutomationCompulsoryValue',lAutomationCompulsoryValue)
				lreturn.put('AutomationCompulsoryText',lAutomationCompulsoryText)
				lreturn.put('AutomationRsaValue',lAutomationRsaValue)
				lreturn.put('AutomationRsaText',lAutomationRsaText)
				lreturn.put('AutomationCarReplacementServiceValue',lAutomationCarReplacementServiceValue)
				lreturn.put('AutomationCarReplacementServiceText',lAutomationCarReplacementServiceText)
				lreturn.put('AutomationAccessoryItem01Value',lAutomationAccessoryItem01Value)
				lreturn.put('AutomationAccessoryItem01Text',lAutomationAccessoryItem01Text)
				lreturn.put('AutomationAccessoryItem02Value',lAutomationAccessoryItem02Value)
				lreturn.put('AutomationAccessoryItem02Text',lAutomationAccessoryItem02Text)
				lreturn.put('AutomationAccessoryItem03Value',lAutomationAccessoryItem03Value)
				lreturn.put('AutomationAccessoryItem03Text',lAutomationAccessoryItem03Text)
				lreturn.put('AutomationAccessoryItem04Value',lAutomationAccessoryItem04Value)
				lreturn.put('AutomationAccessoryItem04Text',lAutomationAccessoryItem04Text)
				lreturn.put('AutomationAccessoryItem05Value',lAutomationAccessoryItem05Value)
				lreturn.put('AutomationAccessoryItem05Text',lAutomationAccessoryItem05Text)
				lreturn.put('AutomationAccessoryItem06Value',lAutomationAccessoryItem06Value)
				lreturn.put('AutomationAccessoryItem06Text',lAutomationAccessoryItem06Text)
				lreturn.put('AutomationAccessoryItem07Value',lAutomationAccessoryItem07Value)
				lreturn.put('AutomationAccessoryItem07Text',lAutomationAccessoryItem07Text)
				lreturn.put('AutomationAccessoryItem08Value',lAutomationAccessoryItem08Value)
				lreturn.put('AutomationAccessoryItem08Text',lAutomationAccessoryItem08Text)
				lreturn.put('AutomationAccessoryItem09Value',lAutomationAccessoryItem09Value)
				lreturn.put('AutomationAccessoryItem09Text',lAutomationAccessoryItem09Text)
				lreturn.put('AutomationAccessoryItem10Value',lAutomationAccessoryItem10Value)
				lreturn.put('AutomationAccessoryItem10Text',lAutomationAccessoryItem10Text)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAutomationDataAfter(){
		Map lreturn=[:]
		String lAutomationPageValue=''
		String lAutomationPageText=''
		String lAutomationVersionValue=''
		String lAutomationVersionText=''
		String lAutomationOpportunityNumberValue=''
		String lAutomationOpportunityNumberText=''
		String lAutomationVehicleDetailValue=''
		String lAutomationVehicleDetailText=''
		String lAutomationPremiumYearlyValue=''
		String lAutomationPremiumYearlyText=''
		String lAutomationPremiumDepositValue=''
		String lAutomationPremiumDepositText=''
		String lAutomationPremiumMonthlyValue=''
		String lAutomationPremiumMonthlyText=''
		String lAutomationPremiumInstalmentValue=''
		String lAutomationPremiumInstalmentText=''
		String lAutomationPremiumNoDepositAmountValue=''
		String lAutomationPremiumNoDepositAmountText=''
		String lAutomationPremiumNoDepositTotalValue=''
		String lAutomationPremiumNoDepositTotalText=''
		String lAutomationPremiumQuarterlyAmountValue=''
		String lAutomationPremiumQuarterlyAmountText=''
		String lAutomationPremiumQuarterlyTotalValue=''
		String lAutomationPremiumQuarterlyTotalText=''
		String lAutomationPlanTypeValue=''
		String lAutomationPlanTypeText=''
		String lAutomationSumInsuredValue=''
		String lAutomationSumInsuredText=''
		String lAutomationWorkshopValue=''
		String lAutomationWorkshopText=''
		String lAutomationExcessPriceValue=''
		String lAutomationExcessPriceText=''
		String lAutomationDriverPlanValue=''
		String lAutomationDriverPlanText=''
		String lAutomationTpbiValue=''
		String lAutomationTpbiText=''
		String lAutomationTppdValue=''
		String lAutomationTppdText=''
		String lAutomationPaAndMeValue=''
		String lAutomationPaAndMeText=''
		String lAutomationPaOnlyValue=''
		String lAutomationPaOnlyText=''
		String lAutomationMeOnlyValue=''
		String lAutomationMeOnlyText=''
		String lAutomationCompulsoryValue=''
		String lAutomationCompulsoryText=''
		String lAutomationRsaValue=''
		String lAutomationRsaText=''
		String lAutomationCarReplacementServiceValue=''
		String lAutomationCarReplacementServiceText=''
		String lAutomationAccessoryItem01Value=''
		String lAutomationAccessoryItem01Text=''
		String lAutomationAccessoryItem02Value=''
		String lAutomationAccessoryItem02Text=''
		String lAutomationAccessoryItem03Value=''
		String lAutomationAccessoryItem03Text=''
		String lAutomationAccessoryItem04Value=''
		String lAutomationAccessoryItem04Text=''
		String lAutomationAccessoryItem05Value=''
		String lAutomationAccessoryItem05Text=''
		String lAutomationAccessoryItem06Value=''
		String lAutomationAccessoryItem06Text=''
		String lAutomationAccessoryItem07Value=''
		String lAutomationAccessoryItem07Text=''
		String lAutomationAccessoryItem08Value=''
		String lAutomationAccessoryItem08Text=''
		String lAutomationAccessoryItem09Value=''
		String lAutomationAccessoryItem09Text=''
		String lAutomationAccessoryItem10Value=''
		String lAutomationAccessoryItem10Text=''
		try{
			Boolean lResult=false
			lreturn.put('AutomationPageValue','')
			lreturn.put('AutomationPageText','')
			lreturn.put('AutomationVersionValue','')
			lreturn.put('AutomationVersionText','')
			lreturn.put('AutomationOpportunityNumberValue','')
			lreturn.put('AutomationOpportunityNumberText','')
			lreturn.put('AutomationVehicleDetailValue','')
			lreturn.put('AutomationVehicleDetailText','')
			lreturn.put('AutomationPremiumYearlyValue','')
			lreturn.put('AutomationPremiumYearlyText','')
			lreturn.put('AutomationPremiumDepositValue','')
			lreturn.put('AutomationPremiumDepositText','')
			lreturn.put('AutomationPremiumMonthlyValue','')
			lreturn.put('AutomationPremiumMonthlyText','')
			lreturn.put('AutomationPremiumInstalmentValue','')
			lreturn.put('AutomationPremiumInstalmentText','')
			lreturn.put('AutomationPremiumNoDepositAmountValue','')
			lreturn.put('AutomationPremiumNoDepositAmountText','')
			lreturn.put('AutomationPremiumNoDepositTotalValue','')
			lreturn.put('AutomationPremiumNoDepositTotalText','')
			lreturn.put('AutomationPremiumQuarterlyAmountValue','')
			lreturn.put('AutomationPremiumQuarterlyAmountText','')
			lreturn.put('AutomationPremiumQuarterlyTotalValue','')
			lreturn.put('AutomationPremiumQuarterlyTotalText','')
			lreturn.put('AutomationPlanTypeValue','')
			lreturn.put('AutomationPlanTypeText','')
			lreturn.put('AutomationSumInsuredValue','')
			lreturn.put('AutomationSumInsuredText','')
			lreturn.put('AutomationWorkshopValue','')
			lreturn.put('AutomationWorkshopText','')
			lreturn.put('AutomationExcessPriceValue','')
			lreturn.put('AutomationExcessPriceText','')
			lreturn.put('AutomationDriverPlanValue','')
			lreturn.put('AutomationDriverPlanText','')
			lreturn.put('AutomationTpbiValue','')
			lreturn.put('AutomationTpbiText','')
			lreturn.put('AutomationTppdValue','')
			lreturn.put('AutomationTppdText','')
			lreturn.put('AutomationPaAndMeValue','')
			lreturn.put('AutomationPaAndMeText','')
			lreturn.put('AutomationPaOnlyValue','')
			lreturn.put('AutomationPaOnlyText','')
			lreturn.put('AutomationMeOnlyValue','')
			lreturn.put('AutomationMeOnlyText','')
			lreturn.put('AutomationCompulsoryValue','')
			lreturn.put('AutomationCompulsoryText','')
			lreturn.put('AutomationRsaValue','')
			lreturn.put('AutomationRsaText','')
			lreturn.put('AutomationCarReplacementServiceValue','')
			lreturn.put('AutomationCarReplacementServiceText','')
			lreturn.put('AutomationAccessoryItem01Value','')
			lreturn.put('AutomationAccessoryItem01Text','')
			lreturn.put('AutomationAccessoryItem02Value','')
			lreturn.put('AutomationAccessoryItem02Text','')
			lreturn.put('AutomationAccessoryItem03Value','')
			lreturn.put('AutomationAccessoryItem03Text','')
			lreturn.put('AutomationAccessoryItem04Value','')
			lreturn.put('AutomationAccessoryItem04Text','')
			lreturn.put('AutomationAccessoryItem05Value','')
			lreturn.put('AutomationAccessoryItem05Text','')
			lreturn.put('AutomationAccessoryItem06Value','')
			lreturn.put('AutomationAccessoryItem06Text','')
			lreturn.put('AutomationAccessoryItem07Value','')
			lreturn.put('AutomationAccessoryItem07Text','')
			lreturn.put('AutomationAccessoryItem08Value','')
			lreturn.put('AutomationAccessoryItem08Text','')
			lreturn.put('AutomationAccessoryItem09Value','')
			lreturn.put('AutomationAccessoryItem09Text','')
			lreturn.put('AutomationAccessoryItem10Value','')
			lreturn.put('AutomationAccessoryItem10Text','')
			lreturn.put('Result',lResult)
			String lTagAutomationParent='Automation'
			String lLocatorAutomationParent=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationParent)
			WebElement lElementAutomationParent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAutomationParent)
			if(lElementAutomationParent){
				String lTagAutomationPage='Page'
				String lLocatorAutomationPage=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPage)
				WebElement lElementAutomationPage=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPage)
				if(!lElementAutomationPage){
					lAutomationPageValue='No Option'
				}else{
					lAutomationPageValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPage).trim()
					WebElement lElementAutomationPageText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPage,lAutomationPageValue)
					if(lElementAutomationPageText){
						lAutomationPageText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPageText).trim()
					}
				}
				String lTagAutomationVersion='ABTesting'
				String lLocatorAutomationVersion=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationVersion)
				WebElement lElementAutomationVersion=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationVersion)
				if(!lElementAutomationVersion){
					lAutomationVersionValue='No Option'
				}else{
					lAutomationVersionValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationVersion).trim()
					WebElement lElementAutomationVersionText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationVersion,lAutomationVersionValue)
					if(lElementAutomationVersionText){
						lAutomationVersionText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationVersionText).trim()
					}
				}
				String lTagAutomationOpportunityNumber='Opp-no'
				String lLocatorAutomationOpportunityNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationOpportunityNumber)
				WebElement lElementAutomationOpportunityNumber=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationOpportunityNumber)
				if(!lElementAutomationOpportunityNumber){
					lAutomationOpportunityNumberValue='No Option'
				}else{
					lAutomationOpportunityNumberValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationOpportunityNumber).trim()
					lAutomationOpportunityNumberValue=this.checkOpportunityNumber(lAutomationOpportunityNumberValue)
					WebElement lElementAutomationOpportunityNumberText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationOpportunityNumber,lAutomationOpportunityNumberValue)
					if(lElementAutomationOpportunityNumberText){
						lAutomationOpportunityNumberText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationOpportunityNumberText).trim()
					}
				}
				String lTagAutomationVehicleDetail='Vehicle'
				String lLocatorAutomationVehicleDetail=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationVehicleDetail)
				WebElement lElementAutomationVehicleDetail=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationVehicleDetail)
				if(!lElementAutomationVehicleDetail){
					lAutomationVehicleDetailValue='No Option'
				}else{
					lAutomationVehicleDetailValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationVehicleDetail).trim()
					WebElement lElementAutomationVehicleDetailText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationVehicleDetail,lAutomationVehicleDetailValue)
					if(lElementAutomationVehicleDetailText){
						lAutomationVehicleDetailText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationVehicleDetailText).trim()
					}
				}
				String lTagAutomationPaymentFrequency='PaymentFrequency'
				String lLocatorAutomationPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaymentFrequency)
				WebElement lElementAutomationPaymentFrequency=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPaymentFrequency)
				if(!lElementAutomationPaymentFrequency){
					return lreturn
				}else{
					String lAutomationPremiumYearly='Yearly'
					String lAutomationPremiumMonthly='Monthly'
					String lAutomationPremiumNoDeposit='Monthly no deposit'
					String lAutomationPremiumQuarterly='Quarterly'
					String lTagPaymentOptionMotorSwitchButton='paymentOptions'
					String lLocatorPaymentOptionMotorSwitchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentOptionMotorSwitchButton)
					WebElement lElementPaymentOptionMotorSwitchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentOptionMotorSwitchButton)
					if(!lElementPaymentOptionMotorSwitchButton){
						return lreturn
					}
					String lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
					String lLocatorAutomationPaymentFrequencyValue=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaymentFrequency)
					WebElement lElementAutomationPaymentFrequencyValue=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPaymentFrequency,lTagAutomationPaymentFrequencyValue)
					if(!lElementAutomationPaymentFrequencyValue){
						return lreturn
					}
					Boolean lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
					Boolean lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
					if(!lIsPaymentOptionMotorSwitchButtonDisabled){
						if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
						}
					}
					lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
					lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
					lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
					if(lIsPaymentOptionMotorSwitchButtonAsYearly){
						String lTagAutomationSummaryPrice='SummaryPrice'
						String lLocatorAutomationSummaryPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationSummaryPrice)
						WebElement lElementAutomationSummaryPrice=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice)
						if(!lElementAutomationSummaryPrice){
							return lreturn
						}
						lAutomationPremiumYearlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
						lAutomationPremiumDepositValue='No Option'
						lAutomationPremiumMonthlyValue='No Option'
						lAutomationPremiumInstalmentValue='No Option'
						lAutomationPremiumNoDepositAmountValue='No Option'
						lAutomationPremiumNoDepositTotalValue='No Option'
						lAutomationPremiumQuarterlyAmountValue='No Option'
						lAutomationPremiumQuarterlyTotalValue='No Option'
						if(!lIsPaymentOptionMotorSwitchButtonDisabled){
							if(lIsPaymentOptionMotorSwitchButtonAsYearly){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
							}
							lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
							lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
							lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
							if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
								switch(lTagAutomationPaymentFrequencyValue){
									case lAutomationPremiumMonthly:
										if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
											lAutomationPremiumMonthlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
											WebElement lElementAutomationPremiumMonthlyText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice,lAutomationPremiumMonthlyValue)
											if(lElementAutomationPremiumMonthlyText){
												lAutomationPremiumMonthlyText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPremiumMonthlyText).trim()
											}
										}
										break
									case lAutomationPremiumQuarterly:
										if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
											lAutomationPremiumQuarterlyAmountValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
											WebElement lElementAutomationPremiumQuarterlyTotalValue=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice,lAutomationPremiumQuarterlyAmountValue)
											if(lElementAutomationPremiumQuarterlyTotalValue){
												lAutomationPremiumQuarterlyTotalValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPremiumQuarterlyTotalValue).trim()
											}
										}
										break
									default:
										if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
											lAutomationPremiumNoDepositAmountValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSummaryPrice).trim()
											WebElement lElementAutomationPremiumNoDepositTotalValue=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSummaryPrice,lAutomationPremiumNoDepositAmountValue)
											if(lElementAutomationPremiumNoDepositTotalValue){
												lAutomationPremiumNoDepositTotalValue=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPremiumNoDepositTotalValue).trim()
											}
										}
										break
								}
							}
						}
					}
					if(!lIsPaymentOptionMotorSwitchButtonDisabled){
						if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentOptionMotorSwitchButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentOptionMotorSwitchButton)
						}
						lTagAutomationPaymentFrequencyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaymentFrequency)
						lIsPaymentOptionMotorSwitchButtonDisabled=IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPaymentOptionMotorSwitchButton,'disabled')
						lIsPaymentOptionMotorSwitchButtonAsYearly=IGNUemaHelper.checkStringContainString(lTagAutomationPaymentFrequencyValue,lAutomationPremiumYearly)
						if(!lIsPaymentOptionMotorSwitchButtonAsYearly){
							return lreturn
						}
					}
				}
				String lTagAutomationPlanType='CoverType'
				String lLocatorAutomationPlanType=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPlanType)
				WebElement lElementAutomationPlanType=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPlanType)
				if(!lElementAutomationPlanType){
					lAutomationPlanTypeValue='No Option'
				}else{
					lAutomationPlanTypeValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPlanType).trim()
					WebElement lElementAutomationPlanTypeText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPlanType,lAutomationPlanTypeValue)
					if(lElementAutomationPlanTypeText){
						lAutomationPlanTypeText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPlanTypeText).trim()
					}
				}
				String lTagAutomationSumInsured='Sum-insured'
				String lLocatorAutomationSumInsured=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationSumInsured)
				WebElement lElementAutomationSumInsured=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationSumInsured)
				if(!lElementAutomationSumInsured){
					lAutomationSumInsuredValue='No Option'
				}else{
					lAutomationSumInsuredValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationSumInsured).trim()
					WebElement lElementAutomationSumInsuredText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationSumInsured,lAutomationSumInsuredValue)
					if(lElementAutomationSumInsuredText){
						lAutomationSumInsuredText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationSumInsuredText).trim()
					}
				}
				String lTagAutomationWorkshop='Workshop'
				String lLocatorAutomationWorkshop=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationWorkshop)
				WebElement lElementAutomationWorkshop=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationWorkshop)
				if(!lElementAutomationWorkshop){
					lAutomationWorkshopValue='No Option'
				}else{
					lAutomationWorkshopValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationWorkshop).trim()
					WebElement lElementAutomationWorkshopText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationWorkshop,lAutomationWorkshopValue)
					if(lElementAutomationWorkshopText){
						lAutomationWorkshopText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationWorkshopText).trim()
					}
					if(lIsChangedFromAnyToDealerWorkshop&&lIsDealerWorkshop){
						lAutomationWorkshopValue=THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_VALUE
					}
				}
				String lTagAutomationExcessPrice='ExcessPrice'
				String lLocatorAutomationExcessPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationExcessPrice)
				WebElement lElementAutomationExcessPrice=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationExcessPrice)
				if(!lElementAutomationExcessPrice){
					lAutomationExcessPriceValue='No Option'
				}else{
					lAutomationExcessPriceValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationExcessPrice).trim()
					WebElement lElementAutomationExcessPriceText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationExcessPrice,lAutomationExcessPriceValue)
					if(lElementAutomationExcessPriceText){
						lAutomationExcessPriceText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationExcessPriceText).trim()
					}
				}
				String lTagAutomationDriverPlan='DriverPlan'
				String lLocatorAutomationDriverPlan=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationDriverPlan)
				WebElement lElementAutomationDriverPlan=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationDriverPlan)
				if(!lElementAutomationDriverPlan){
					lAutomationDriverPlanValue='No Option'
				}else{
					lAutomationDriverPlanValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationDriverPlan).trim()
					WebElement lElementAutomationDriverPlanText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationDriverPlan,lAutomationDriverPlanValue)
					if(lElementAutomationDriverPlanText){
						lAutomationDriverPlanText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationDriverPlanText).trim()
					}
				}
				String lTagAutomationTPBI='TPBI'
				String lLocatorAutomationTPBI=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationTPBI)
				WebElement lElementAutomationTPBI=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationTPBI)
				if(!lElementAutomationTPBI){
					lAutomationTpbiValue='No Option'
				}else{
					lAutomationTpbiValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationTPBI).trim()
					WebElement lElementAutomationTPBIText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationTPBI,lAutomationTpbiValue)
					if(lElementAutomationTPBIText){
						lAutomationTpbiText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationTPBIText).trim()
					}
				}
				String lTagAutomationTPPD='TPPD'
				String lLocatorAutomationTPPD=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationTPPD)
				WebElement lElementAutomationTPPD=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationTPPD)
				if(!lElementAutomationTPPD){
					lAutomationTppdValue='No Option'
				}else{
					lAutomationTppdValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationTPPD).trim()
					WebElement lElementAutomationTPPDText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationTPPD,lAutomationTppdValue)
					if(lElementAutomationTPPDText){
						lAutomationTppdText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationTPPDText).trim()
					}
				}
				String lTagAutomationPaAndMe='PAME'
				String lLocatorAutomationPaAndMe=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaAndMe)
				WebElement lElementAutomationPaAndMe=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPaAndMe)
				if(!lElementAutomationPaAndMe){
					lAutomationPaAndMeValue='No Option'
				}else{
					lAutomationPaAndMeValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaAndMe).trim()
					WebElement lElementAutomationPaAndMeText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPaAndMe,lAutomationPaAndMeValue)
					if(lElementAutomationPaAndMeText){
						lAutomationPaAndMeText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPaAndMeText).trim()
					}
				}
				String lTagAutomationPaOnly='PaOnly'
				String lLocatorAutomationPaOnly=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationPaOnly)
				WebElement lElementAutomationPaOnly=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationPaOnly)
				if(!lElementAutomationPaOnly){
					lAutomationPaOnlyValue="No Option"
				}else{
					lAutomationPaOnlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationPaOnly).trim()
					WebElement lElementAutomationPaOnlyText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationPaOnly,lAutomationPaOnlyValue)
					if(lElementAutomationPaOnlyText){
						lAutomationPaOnlyText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationPaOnlyText).trim()
					}
				}
				String lTagAutomationMeOnly='MeOnly'
				String lLocatorAutomationMeOnly=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationMeOnly)
				WebElement lElementAutomationMeOnly=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationMeOnly)
				if(!lElementAutomationMeOnly){
					lAutomationMeOnlyValue="No Option"
				}else{
					lAutomationMeOnlyValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationMeOnly).trim()
					WebElement lElementAutomationMeOnlyText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationMeOnly,lAutomationMeOnlyValue)
					if(lElementAutomationMeOnlyText){
						lAutomationMeOnlyText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationMeOnlyText).trim()
					}
				}
				String lTagAutomationCompulsory='Compulsory'
				String lLocatorAutomationCompulsory=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationCompulsory)
				WebElement lElementAutomationCompulsory=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationCompulsory)
				if(!lElementAutomationCompulsory){
					lAutomationCompulsoryValue='No Option'
				}else{
					lAutomationCompulsoryValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationCompulsory).trim()
					WebElement lElementAutomationCompulsoryText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationCompulsory,lAutomationCompulsoryValue)
					if(lElementAutomationCompulsoryText){
						lAutomationCompulsoryText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationCompulsoryText).trim()
					}
				}
				String lTagAutomationRsa='RSA'
				String lLocatorAutomationRsa=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationRsa)
				WebElement lElementAutomationRsa=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationRsa)
				if(!lElementAutomationRsa){
					lAutomationRsaValue='No Option'
				}else{
					lAutomationRsaValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationRsa).trim()
					WebElement lElementAutomationRsaText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationRsa,lAutomationRsaValue)
					if(lElementAutomationRsaText){
						lAutomationRsaText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationRsaText).trim()
					}
				}
				String lTagAutomationCarReplacementService='CarReplacement'
				String lLocatorAutomationCarReplacementService=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationCarReplacementService)
				WebElement lElementAutomationCarReplacementService=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationCarReplacementService)
				if(!lElementAutomationCarReplacementService){
					lAutomationCarReplacementServiceValue='No Option'
				}else{
					lAutomationCarReplacementServiceValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationCarReplacementService).trim()
					WebElement lElementAutomationCarReplacementServiceText=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementAutomationParent,lTagAutomationCarReplacementService,lAutomationCarReplacementServiceValue)
					if(lElementAutomationCarReplacementServiceText){
						lAutomationCarReplacementServiceText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationCarReplacementServiceText).trim()
					}
				}
				String lTagAutomationAccessoryParent='Accessories'
				String lLocatorAutomationAccessoryParent=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationAccessoryParent)
				WebElement lElementAutomationAccessoryParent=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementAutomationParent,lTagAutomationAccessoryParent)
				if(lElementAutomationAccessoryParent){
					String lTagAutomationAccessoryChild='item'
					String lLocatorAutomationAccessoryChild=IGNUemaHelper.getTagDataSeleniumKey(lTagAutomationAccessoryChild)
					List<WebElement> lElementAutomationAccessoryList=IGNUemaHelper.getChildWebElementListFromDataSeleniumKey(this.driver,lElementAutomationAccessoryParent,lTagAutomationAccessoryChild)
					if(lElementAutomationAccessoryList){
						String lAutomationAccessoryItemValue=''
						String lAutomationAccessoryItemText=''
						Integer lIndexAccessoryItem=0
						for(WebElement lElementAutomationAccessoryItem in lElementAutomationAccessoryList){
							lIndexAccessoryItem=lIndexAccessoryItem+1
							switch(lIndexAccessoryItem){
								case 2:
									lAutomationAccessoryItem02Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem02Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 3:
									lAutomationAccessoryItem03Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem03Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 4:
									lAutomationAccessoryItem04Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem04Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 5:
									lAutomationAccessoryItem05Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem05Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 6:
									lAutomationAccessoryItem06Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem06Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 7:
									lAutomationAccessoryItem07Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem07Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 8:
									lAutomationAccessoryItem08Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem08Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 9:
									lAutomationAccessoryItem09Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem09Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								case 10:
									lAutomationAccessoryItem10Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem10Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
								default:
									lAutomationAccessoryItem01Value=lAutomationAccessoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									lAutomationAccessoryItem01Text=lAutomationAccessoryItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAutomationAccessoryItem).trim()
									break
							}
						}
					}
				}
			}
			lResult=true
			if(lResult){
				lreturn.put('AutomationPageValue',lAutomationPageValue)
				lreturn.put('AutomationPageText',lAutomationPageText)
				lreturn.put('AutomationVersionValue',lAutomationVersionValue)
				lreturn.put('AutomationVersionText',lAutomationVersionText)
				lreturn.put('AutomationOpportunityNumberValue',lAutomationOpportunityNumberValue)
				lreturn.put('AutomationOpportunityNumberText',lAutomationOpportunityNumberText)
				lreturn.put('AutomationVehicleDetailValue',lAutomationVehicleDetailValue)
				lreturn.put('AutomationVehicleDetailText',lAutomationVehicleDetailText)
				lreturn.put('AutomationPremiumYearlyValue',lAutomationPremiumYearlyValue)
				lreturn.put('AutomationPremiumYearlyText',lAutomationPremiumYearlyText)
				lreturn.put('AutomationPremiumDepositValue',lAutomationPremiumDepositValue)
				lreturn.put('AutomationPremiumDepositText',lAutomationPremiumDepositText)
				lreturn.put('AutomationPremiumMonthlyValue',lAutomationPremiumMonthlyValue)
				lreturn.put('AutomationPremiumMonthlyText',lAutomationPremiumMonthlyText)
				lreturn.put('AutomationPremiumInstalmentValue',lAutomationPremiumInstalmentValue)
				lreturn.put('AutomationPremiumInstalmentText',lAutomationPremiumInstalmentText)
				lreturn.put('AutomationPremiumNoDepositAmountValue',lAutomationPremiumNoDepositAmountValue)
				lreturn.put('AutomationPremiumNoDepositAmountText',lAutomationPremiumNoDepositAmountText)
				lreturn.put('AutomationPremiumNoDepositTotalValue',lAutomationPremiumNoDepositTotalValue)
				lreturn.put('AutomationPremiumNoDepositTotalText',lAutomationPremiumNoDepositTotalText)
				lreturn.put('AutomationPremiumQuarterlyAmountValue',lAutomationPremiumQuarterlyAmountValue)
				lreturn.put('AutomationPremiumQuarterlyAmountText',lAutomationPremiumQuarterlyAmountText)
				lreturn.put('AutomationPremiumQuarterlyTotalValue',lAutomationPremiumQuarterlyTotalValue)
				lreturn.put('AutomationPremiumQuarterlyTotalText',lAutomationPremiumQuarterlyTotalText)
				lreturn.put('AutomationPlanTypeValue',lAutomationPlanTypeValue)
				lreturn.put('AutomationPlanTypeText',lAutomationPlanTypeText)
				lreturn.put('AutomationSumInsuredValue',lAutomationSumInsuredValue)
				lreturn.put('AutomationSumInsuredText',lAutomationSumInsuredText)
				lreturn.put('AutomationWorkshopValue',lAutomationWorkshopValue)
				lreturn.put('AutomationWorkshopText',lAutomationWorkshopText)
				lreturn.put('AutomationExcessPriceValue',lAutomationExcessPriceValue)
				lreturn.put('AutomationExcessPriceText',lAutomationExcessPriceText)
				lreturn.put('AutomationDriverPlanValue',lAutomationDriverPlanValue)
				lreturn.put('AutomationDriverPlanText',lAutomationDriverPlanText)
				lreturn.put('AutomationTpbiValue',lAutomationTpbiValue)
				lreturn.put('AutomationTpbiText',lAutomationTpbiText)
				lreturn.put('AutomationTppdValue',lAutomationTppdValue)
				lreturn.put('AutomationTppdText',lAutomationTppdText)
				lreturn.put('AutomationPaAndMeValue',lAutomationPaAndMeValue)
				lreturn.put('AutomationPaAndMeText',lAutomationPaAndMeText)
				lreturn.put('AutomationPaOnlyValue',lAutomationPaOnlyValue)
				lreturn.put('AutomationPaOnlyText',lAutomationPaOnlyText)
				lreturn.put('AutomationMeOnlyValue',lAutomationMeOnlyValue)
				lreturn.put('AutomationMeOnlyText',lAutomationMeOnlyText)
				lreturn.put('AutomationCompulsoryValue',lAutomationCompulsoryValue)
				lreturn.put('AutomationCompulsoryText',lAutomationCompulsoryText)
				lreturn.put('AutomationRsaValue',lAutomationRsaValue)
				lreturn.put('AutomationRsaText',lAutomationRsaText)
				lreturn.put('AutomationCarReplacementServiceValue',lAutomationCarReplacementServiceValue)
				lreturn.put('AutomationCarReplacementServiceText',lAutomationCarReplacementServiceText)
				lreturn.put('AutomationAccessoryItem01Value',lAutomationAccessoryItem01Value)
				lreturn.put('AutomationAccessoryItem01Text',lAutomationAccessoryItem01Text)
				lreturn.put('AutomationAccessoryItem02Value',lAutomationAccessoryItem02Value)
				lreturn.put('AutomationAccessoryItem02Text',lAutomationAccessoryItem02Text)
				lreturn.put('AutomationAccessoryItem03Value',lAutomationAccessoryItem03Value)
				lreturn.put('AutomationAccessoryItem03Text',lAutomationAccessoryItem03Text)
				lreturn.put('AutomationAccessoryItem04Value',lAutomationAccessoryItem04Value)
				lreturn.put('AutomationAccessoryItem04Text',lAutomationAccessoryItem04Text)
				lreturn.put('AutomationAccessoryItem05Value',lAutomationAccessoryItem05Value)
				lreturn.put('AutomationAccessoryItem05Text',lAutomationAccessoryItem05Text)
				lreturn.put('AutomationAccessoryItem06Value',lAutomationAccessoryItem06Value)
				lreturn.put('AutomationAccessoryItem06Text',lAutomationAccessoryItem06Text)
				lreturn.put('AutomationAccessoryItem07Value',lAutomationAccessoryItem07Value)
				lreturn.put('AutomationAccessoryItem07Text',lAutomationAccessoryItem07Text)
				lreturn.put('AutomationAccessoryItem08Value',lAutomationAccessoryItem08Value)
				lreturn.put('AutomationAccessoryItem08Text',lAutomationAccessoryItem08Text)
				lreturn.put('AutomationAccessoryItem09Value',lAutomationAccessoryItem09Value)
				lreturn.put('AutomationAccessoryItem09Text',lAutomationAccessoryItem09Text)
				lreturn.put('AutomationAccessoryItem10Value',lAutomationAccessoryItem10Value)
				lreturn.put('AutomationAccessoryItem10Text',lAutomationAccessoryItem10Text)
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
			String lAutomationOpportunityNumber=caseOutput.AutomationOpportunityNumberValue
			String lSalesforceOpportunityNumber=caseOutput.SalesforceVerifyDataOpportunityObjName
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			String lAutomationVehicleDetail=caseOutput.AutomationVehicleDetailValue
			String lSalesforceVehicleDetailMake=caseOutput.SalesforceVerifyDataTransactionSyncedObjMakeC
			String lSalesforceVehicleDetailModel=caseOutput.SalesforceVerifyDataTransactionSyncedObjModelFamilyC
			String lSalesforceVehicleDetailYear=caseOutput.SalesforceVerifyDataTransactionSyncedObjYearOfManufactureC
			if(IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationVehicleDetail,lSalesforceVehicleDetailMake)){
				if(IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationVehicleDetail,lSalesforceVehicleDetailModel)){
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationVehicleDetail,lSalesforceVehicleDetailYear)){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleDetail='+lAutomationVehicleDetail,lSalesforceVehicleDetailYear)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}else{
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleDetail='+lAutomationVehicleDetail,lSalesforceVehicleDetailModel)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}else{
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('VehicleDetail='+lAutomationVehicleDetail,lSalesforceVehicleDetailMake)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			String lAutomationPlanType=caseOutput.AutomationPlanTypeValue
			String lSalesforcePlanType=caseOutput.SalesforceVerifyDataTransactionSyncedObjPlanTypeC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPlanType,lSalesforcePlanType)){
				String lPlanType=lSalesforcePlanType.toUpperCase().trim()
				Map lPlanTypeList=['TYPE 1':'Type1','TYPE 2+':'Type2Plus','TYPE 3+':'Type3Plus','TYPE 2':'Type2','TYPE 3':'Type3']
				String lPlanTypeItem=lPlanTypeList.get(lPlanType)
				if(!lPlanTypeItem){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PlanType='+lAutomationPlanType,lSalesforcePlanType)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}else{
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPlanType,lPlanTypeItem)){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('PlanType='+lAutomationPlanType,lSalesforcePlanType)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}
			}
			String lAutomationWorkshop=caseOutput.AutomationWorkshopValue
			String lSalesforceWorkshop=caseOutput.SalesforceVerifyDataTransactionSyncedObjWorkshopTypeC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationWorkshop,lSalesforceWorkshop)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('Workshop='+lAutomationWorkshop,lSalesforceWorkshop)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			String lAutomationDriverPlan=caseOutput.AutomationDriverPlanValue
			String lSalesforceDriverPlan=caseOutput.SalesforceVerifyDataTransactionSyncedObjDriverPlanC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationDriverPlan,lSalesforceDriverPlan)){
				String lDriverPlan=lSalesforceDriverPlan.toUpperCase().trim()
				Map lDriverPlanList=['ANY DRIVER':'AnyDriver','NAMED DRIVER':'Named','DRIVER > 25':'AnyOver25','DRIVER > 30':'AnyOver30']
				String lDriverPlanItem=lDriverPlanList.get(lDriverPlan)
				if(!lDriverPlanItem){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('DriverPlan='+lAutomationDriverPlan,lSalesforceDriverPlan)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}else{
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationDriverPlan,lDriverPlanItem)){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('DriverPlan='+lAutomationDriverPlan,lSalesforceDriverPlan)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}
			}
			String lAutomationCompulsoryPlan=caseOutput.AutomationCompulsoryValue
			String lSalesforceCompulsoryPlan=caseOutput.SalesforceVerifyDataTransactionSyncedObjCompulsoryPlanC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCompulsoryPlan,lSalesforceCompulsoryPlan)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('CompulsoryPlan='+lAutomationCompulsoryPlan,lSalesforceCompulsoryPlan)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			String lAutomationRsaPlan=caseOutput.AutomationRsaValue
			String lSalesforceRsaPlan=caseOutput.SalesforceVerifyDataTransactionSyncedObjRsaC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationRsaPlan,lSalesforceRsaPlan)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('RsaPlan='+lAutomationRsaPlan,lSalesforceRsaPlan)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			String lAutomationCarReplacementServicePlan=caseOutput.AutomationCarReplacementServiceValue
			String lSalesforceCarReplacementServicePlan=caseOutput.SalesforceVerifyDataTransactionSyncedObjCarReplacementPlanC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCarReplacementServicePlan,lSalesforceCarReplacementServicePlan)){
				String lCarReplacementServicePlan=lSalesforceCarReplacementServicePlan.toUpperCase().trim()
				Map lCarReplacementServicePlanList=['GOLD':'Yes','':'No']
				String lCarReplacementServicePlanItem=lCarReplacementServicePlanList.get(lCarReplacementServicePlan)
				if(!lCarReplacementServicePlanItem){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('CarReplacementServicePlan='+lAutomationCarReplacementServicePlan,lSalesforceCarReplacementServicePlan)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}else{
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCarReplacementServicePlan,lCarReplacementServicePlanItem)){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('CarReplacementServicePlan='+lAutomationCarReplacementServicePlan,lSalesforceCarReplacementServicePlan)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
				}
			}
			String lAutomationSumInsured=caseOutput.AutomationSumInsuredValue
			String lSalesforceSumInsured=caseOutput.SalesforceVerifyDataTransactionSyncedObjCndnSiRenewC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationSumInsured,lSalesforceSumInsured)){
				Float lAutomationSumInsuredNumber=IGNUemaHelper.convertStringToFloat(lAutomationSumInsured,0)
				Float lSalesforceSumInsuredPriceNumber=IGNUemaHelper.convertStringToFloat(lSalesforceSumInsured,0)
				Float lSumInsuredPrice=Math.abs(lAutomationSumInsuredNumber-lSalesforceSumInsuredPriceNumber)
				if(lSumInsuredPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('SumInsured='+lAutomationSumInsured,lSalesforceSumInsured)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			String lAutomationExcess=caseOutput.AutomationExcessPriceValue
			String lSalesforceExcess=caseOutput.SalesforceVerifyDataTransactionSyncedObjExcessC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationExcess,lSalesforceExcess)){
				Float lAutomationExcessNumber=IGNUemaHelper.convertStringToFloat(lAutomationExcess,0)
				Float lSalesforceExcessNumber=IGNUemaHelper.convertStringToFloat(lSalesforceExcess,0)
				Float lExcessPrice=Math.abs(lAutomationExcessNumber-lSalesforceExcessNumber)
				if(lExcessPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('Excess='+lAutomationExcess,lSalesforceExcess)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			String lAutomationYearly=caseOutput.AutomationPremiumYearlyValue
			String lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
				Float lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
				Float lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
				Float lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
				if(lYearlyPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumNoDepositAmount=caseOutput.AutomationPremiumNoDepositAmountValue
			String lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
				Float lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
				Float lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
				Float lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
				if(lPremiumNoDepositAmountPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumNoDepositTotal=caseOutput.AutomationPremiumNoDepositTotalValue
			String lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
				Float lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
				Float lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
				Float lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
				if(lPremiumNoDepositTotalPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			String lAutomationCarAccessoryAmount=caseOutput.AccessoryAmount
			String lSalesforceCarAccessoryAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjCarAccessoriesSiC
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCarAccessoryAmount,lSalesforceCarAccessoryAmount)){
				Float lAutomationCarAccessoryAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationCarAccessoryAmount,0)
				Float lSalesforceCarAccessoryAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforceCarAccessoryAmount,0)
				Float lCarAccessoryAmount=Math.abs(lAutomationCarAccessoryAmountNumber-lSalesforceCarAccessoryAmountNumber)
				if(lCarAccessoryAmount>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('CarAccessoryAmount='+lAutomationCarAccessoryAmount,lSalesforceCarAccessoryAmount)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
				}
			}
			for(Integer lIndex=0;lIndex<=5;lIndex++){
				Integer lItemIndex=lIndex+1
				String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
				String lQuoteLineItem=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverCodeC')
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'COMP')){
					String lAutomationCompulsoryPrice=caseOutput.AutomationCompulsoryText
					String lSalesforceCompulsoryPrice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransGrossPremiumC')
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCompulsoryPrice,lSalesforceCompulsoryPrice)){
						Float lAutomationCompulsoryPriceNumber=IGNUemaHelper.convertStringToFloat(lAutomationCompulsoryPrice,0)
						Float lSalesforceCompulsoryPriceNumber=IGNUemaHelper.convertStringToFloat(lSalesforceCompulsoryPrice,0)
						Float lCompulsoryPrice=Math.abs(lAutomationCompulsoryPriceNumber-lSalesforceCompulsoryPriceNumber)
						if(lCompulsoryPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('CompulsoryPrice='+lAutomationCompulsoryPrice,lSalesforceCompulsoryPrice)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
				}
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'VOL')){
					String lAutomationTPBI=caseOutput.AutomationTpbiValue
					String lSalesforceTPBI=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTpbiPerPersonSiC')
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationTPBI,lSalesforceTPBI)){
						Float lAutomationTPBINumber=IGNUemaHelper.convertStringToFloat(lAutomationTPBI,0)
						Float lSalesforceTPBINumber=IGNUemaHelper.convertStringToFloat(lSalesforceTPBI,0)
						Float lTPBIPrice=Math.abs(lAutomationTPBINumber-lSalesforceTPBINumber)
						if(lTPBIPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('TPBI='+lAutomationTPBI,lSalesforceTPBI)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					String lAutomationTPPD=caseOutput.AutomationTppdValue
					String lSalesforceTPPD=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTppdSiC')
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationTPPD,lSalesforceTPPD)){
						Float lAutomationTPPDNumber=IGNUemaHelper.convertStringToFloat(lAutomationTPPD,0)
						Float lSalesforceTPPDNumber=IGNUemaHelper.convertStringToFloat(lSalesforceTPPD,0)
						Float lTPPDPrice=Math.abs(lAutomationTPPDNumber-lSalesforceTPPDNumber)
						if(lTPPDPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('TPPD='+lAutomationTPPD,lSalesforceTPPD)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					String lAutomationPaAndMe=caseOutput.AutomationPaAndMeValue
					String lSalesforcePaAndMe=caseOutput.SalesforceVerifyDataTransactionSyncedObjAdditionalBenefitPaMeSiC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPaAndMe,lSalesforcePaAndMe)){
						lIsOK=false
						lText=IGNUemaHelper.concatMessageLeftRightByPipe('PaAndMe='+lAutomationPaAndMe,lSalesforcePaAndMe)
						lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
					}
					if(lSalesforcePaAndMe.length()<=0){
						String lAutomationPaOnly=caseOutput.AutomationPaOnlyValue
						String lSalesforcePaOnly=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaPassengerSiC')
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPaOnly,lSalesforcePaOnly)){
							Float lAutomationPaOnlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationPaOnly,0)
							Float lSalesforcePaOnlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePaOnly,0)
							Float lPaOnlyPrice=Math.abs(lAutomationPaOnlyNumber-lSalesforcePaOnlyNumber)
							if(lPaOnlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Personal Accident='+lAutomationPaOnly,lSalesforcePaOnly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						String lAutomationMeOnly=caseOutput.AutomationMeOnlyValue
						String lSalesforceMeOnly=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailMedicalExpensesSiC')
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationMeOnly,lSalesforceMeOnly)){
							Float lAutomationMeOnlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationMeOnly,0)
							Float lSalesforceMeOnlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceMeOnly,0)
							Float lMeOnlyPrice=Math.abs(lAutomationMeOnlyNumber-lSalesforceMeOnlyNumber)
							if(lMeOnlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Medical Expenses='+lAutomationMeOnly,lSalesforceMeOnly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
				}
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'RSA')){
					String lAutomationRsa=caseOutput.AutomationRsaText
					String lSalesforceRsa=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransGrossPremiumC')
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationRsa,lSalesforceRsa)){
						Float lAutomationRsaNumber=IGNUemaHelper.convertStringToFloat(lAutomationRsa,0)
						Float lSalesforceRsaNumber=IGNUemaHelper.convertStringToFloat(lSalesforceRsa,0)
						Float lRsaPrice=Math.abs(lAutomationRsaNumber-lSalesforceRsaNumber)
						if(lRsaPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('RSA='+lAutomationRsa,lSalesforceRsa)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
				}
				if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'CRS')){
					String lAutomationCarReplacementService=caseOutput.AutomationCarReplacementServiceText
					String lSalesforceCarReplacementService=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransGrossPremiumC')
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationCarReplacementService,lSalesforceCarReplacementService)){
						Float lAutomationCarReplacementServiceNumber=IGNUemaHelper.convertStringToFloat(lAutomationCarReplacementService,0)
						Float lSalesforceCarReplacementServiceNumber=IGNUemaHelper.convertStringToFloat(lSalesforceCarReplacementService,0)
						Float lCarReplacementServicePrice=Math.abs(lAutomationCarReplacementServiceNumber-lSalesforceCarReplacementServiceNumber)
						if(lCarReplacementServicePrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('CarReplacementService='+lAutomationCarReplacementService,lSalesforceCarReplacementService)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
				}
			}
			String lAutomationReward=THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ROOJAI_REWARD_POINT
			String lSalesforceReward=caseOutput.SalesforceVerifyDataOpportunityObjRewardPointsC
			if(!IGNUemaHelper.checkStringContainString(lAutomationReward,lSalesforceReward)){
				String lRewardNumber=lAutomationReward
				if(lRewardNumber.contains('฿')){
					Integer lTextLength=lRewardNumber.length()
					if(lTextLength>0){
						String []lTextCheck=lRewardNumber
						Integer lTextIndex=0
						for(lTextIndex=0;lTextIndex<=lTextLength;lTextIndex++){
							if(lTextCheck[lTextIndex]=='฿'){
								lRewardNumber=lRewardNumber.substring(1,lTextLength)
								break
							}
						}
					}
				}
				Float lAutomationRewardNumber=IGNUemaHelper.convertStringToFloat(lRewardNumber,0)
				Float lSalesforceRewardNumber=IGNUemaHelper.convertStringToFloat(lSalesforceReward,0)
				Float lRewardPoint=Math.abs(lAutomationRewardNumber-lSalesforceRewardNumber)
				if(lRewardPoint>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('Reward='+lAutomationReward,lSalesforceReward)
					lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
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
	public Map inputSalesforceProceedVerifyAfter(Map caseOutput,Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		String lSalesforceRetrieveCompareDetail=''
		String lSalesforceRetrieveCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			Map lMapAutomationDataAfter=this.inputAutomationDataAfter()
			caseOutput.SalesforceRetrieveDataAutomationPageValue=lMapAutomationDataAfter.AutomationPageValue
			caseOutput.SalesforceRetrieveDataAutomationPageText=lMapAutomationDataAfter.AutomationPageText
			caseOutput.SalesforceRetrieveDataAutomationVersionValue=lMapAutomationDataAfter.AutomationVersionValue
			caseOutput.SalesforceRetrieveDataAutomationVersionText=lMapAutomationDataAfter.AutomationVersionText
			caseOutput.SalesforceRetrieveDataAutomationOpportunityNumberValue=lMapAutomationDataAfter.AutomationOpportunityNumberValue
			caseOutput.SalesforceRetrieveDataAutomationOpportunityNumberText=lMapAutomationDataAfter.AutomationOpportunityNumberText
			caseOutput.SalesforceRetrieveDataAutomationVehicleDetailValue=lMapAutomationDataAfter.AutomationVehicleDetailValue
			caseOutput.SalesforceRetrieveDataAutomationVehicleDetailText=lMapAutomationDataAfter.AutomationVehicleDetailText
			caseOutput.SalesforceRetrieveDataAutomationPremiumYearlyValue=lMapAutomationDataAfter.AutomationPremiumYearlyValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumYearlyText=lMapAutomationDataAfter.AutomationPremiumYearlyText
			caseOutput.SalesforceRetrieveDataAutomationPremiumDepositValue=lMapAutomationDataAfter.AutomationPremiumDepositValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumDepositText=lMapAutomationDataAfter.AutomationPremiumDepositText
			caseOutput.SalesforceRetrieveDataAutomationPremiumMonthlyValue=lMapAutomationDataAfter.AutomationPremiumMonthlyValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumMonthlyText=lMapAutomationDataAfter.AutomationPremiumMonthlyText
			caseOutput.SalesforceRetrieveDataAutomationPremiumInstalmentValue=lMapAutomationDataAfter.AutomationPremiumInstalmentValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumInstalmentText=lMapAutomationDataAfter.AutomationPremiumInstalmentText
			caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositAmountValue=lMapAutomationDataAfter.AutomationPremiumNoDepositAmountValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositAmountText=lMapAutomationDataAfter.AutomationPremiumNoDepositAmountText
			caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositTotalValue=lMapAutomationDataAfter.AutomationPremiumNoDepositTotalValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositTotalText=lMapAutomationDataAfter.AutomationPremiumNoDepositTotalText
			caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyAmountValue=lMapAutomationDataAfter.AutomationPremiumQuarterlyAmountValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyAmountText=lMapAutomationDataAfter.AutomationPremiumQuarterlyAmountText
			caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyTotalValue=lMapAutomationDataAfter.AutomationPremiumQuarterlyTotalValue
			caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyTotalText=lMapAutomationDataAfter.AutomationPremiumQuarterlyTotalText
			caseOutput.SalesforceRetrieveDataAutomationPlanTypeValue=lMapAutomationDataAfter.AutomationPlanTypeValue
			caseOutput.SalesforceRetrieveDataAutomationPlanTypeText=lMapAutomationDataAfter.AutomationPlanTypeText
			caseOutput.SalesforceRetrieveDataAutomationSumInsuredValue=lMapAutomationDataAfter.AutomationSumInsuredValue
			caseOutput.SalesforceRetrieveDataAutomationSumInsuredText=lMapAutomationDataAfter.AutomationSumInsuredText
			caseOutput.SalesforceRetrieveDataAutomationWorkshopValue=lMapAutomationDataAfter.AutomationWorkshopValue
			caseOutput.SalesforceRetrieveDataAutomationWorkshopText=lMapAutomationDataAfter.AutomationWorkshopText
			caseOutput.SalesforceRetrieveDataAutomationExcessPriceValue=lMapAutomationDataAfter.AutomationExcessPriceValue
			caseOutput.SalesforceRetrieveDataAutomationExcessPriceText=lMapAutomationDataAfter.AutomationExcessPriceText
			caseOutput.SalesforceRetrieveDataAutomationDriverPlanValue=lMapAutomationDataAfter.AutomationDriverPlanValue
			caseOutput.SalesforceRetrieveDataAutomationDriverPlanText=lMapAutomationDataAfter.AutomationDriverPlanText
			caseOutput.SalesforceRetrieveDataAutomationTpbiValue=lMapAutomationDataAfter.AutomationTpbiValue
			caseOutput.SalesforceRetrieveDataAutomationTpbiText=lMapAutomationDataAfter.AutomationTpbiText
			caseOutput.SalesforceRetrieveDataAutomationTppdValue=lMapAutomationDataAfter.AutomationTppdValue
			caseOutput.SalesforceRetrieveDataAutomationTppdText=lMapAutomationDataAfter.AutomationTppdText
			caseOutput.SalesforceRetrieveDataAutomationPaAndMeValue=lMapAutomationDataAfter.AutomationPaAndMeValue
			caseOutput.SalesforceRetrieveDataAutomationPaAndMeText=lMapAutomationDataAfter.AutomationPaAndMeText
			caseOutput.SalesforceRetrieveDataAutomationPaOnlyValue=lMapAutomationDataAfter.AutomationPaOnlyValue
			caseOutput.SalesforceRetrieveDataAutomationPaOnlyText=lMapAutomationDataAfter.AutomationPaOnlyText
			caseOutput.SalesforceRetrieveDataAutomationMeOnlyValue=lMapAutomationDataAfter.AutomationMeOnlyValue
			caseOutput.SalesforceRetrieveDataAutomationMeOnlyText=lMapAutomationDataAfter.AutomationMeOnlyText
			caseOutput.SalesforceRetrieveDataAutomationCompulsoryValue=lMapAutomationDataAfter.AutomationCompulsoryValue
			caseOutput.SalesforceRetrieveDataAutomationCompulsoryText=lMapAutomationDataAfter.AutomationCompulsoryText
			caseOutput.SalesforceRetrieveDataAutomationRsaValue=lMapAutomationDataAfter.AutomationRsaValue
			caseOutput.SalesforceRetrieveDataAutomationRsaText=lMapAutomationDataAfter.AutomationRsaText
			caseOutput.SalesforceRetrieveDataAutomationCarReplacementServiceValue=lMapAutomationDataAfter.AutomationCarReplacementServiceValue
			caseOutput.SalesforceRetrieveDataAutomationCarReplacementServiceText=lMapAutomationDataAfter.AutomationCarReplacementServiceText
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem01Value=lMapAutomationDataAfter.AutomationAccessoryItem01Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem01Text=lMapAutomationDataAfter.AutomationAccessoryItem01Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem02Value=lMapAutomationDataAfter.AutomationAccessoryItem02Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem02Text=lMapAutomationDataAfter.AutomationAccessoryItem02Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem03Value=lMapAutomationDataAfter.AutomationAccessoryItem03Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem03Text=lMapAutomationDataAfter.AutomationAccessoryItem03Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem04Value=lMapAutomationDataAfter.AutomationAccessoryItem04Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem04Text=lMapAutomationDataAfter.AutomationAccessoryItem04Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem05Value=lMapAutomationDataAfter.AutomationAccessoryItem05Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem05Text=lMapAutomationDataAfter.AutomationAccessoryItem05Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem06Value=lMapAutomationDataAfter.AutomationAccessoryItem06Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem06Text=lMapAutomationDataAfter.AutomationAccessoryItem06Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem07Value=lMapAutomationDataAfter.AutomationAccessoryItem07Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem07Text=lMapAutomationDataAfter.AutomationAccessoryItem07Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem08Value=lMapAutomationDataAfter.AutomationAccessoryItem08Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem08Text=lMapAutomationDataAfter.AutomationAccessoryItem08Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem09Value=lMapAutomationDataAfter.AutomationAccessoryItem09Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem09Text=lMapAutomationDataAfter.AutomationAccessoryItem09Text
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem10Value=lMapAutomationDataAfter.AutomationAccessoryItem10Value
			caseOutput.SalesforceRetrieveDataAutomationAccessoryItem10Text=lMapAutomationDataAfter.AutomationAccessoryItem10Text
			Map lMapActualResult=this.inputActualResult(isPositiveCase,strQuoteBy)
			caseOutput.SalesforceRetrieveDataOpportunityNumber=lMapActualResult.OpportunityNumber
			caseOutput.SalesforceRetrieveDataPremiumYearly=lMapActualResult.PremiumYearly
			caseOutput.SalesforceRetrieveDataPremiumDeposit=lMapActualResult.PremiumDeposit
			caseOutput.SalesforceRetrieveDataPremiumMonthly=lMapActualResult.PremiumMonthly
			caseOutput.SalesforceRetrieveDataPremiumInstalment=lMapActualResult.PremiumInstalment
			caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount=lMapActualResult.PremiumNoDepositAmount
			caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal=lMapActualResult.PremiumNoDepositTotal
			caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount=lMapActualResult.PremiumQuarterlyAmount
			caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal=lMapActualResult.PremiumQuarterlyTotal
			String lOpportunityNumber=caseOutput.OpportunityNumber
			String lSalesforceRetrieveDataOpportunityNumber=caseOutput.SalesforceRetrieveDataOpportunityNumber
			if(!lOpportunityNumber.contentEquals(lSalesforceRetrieveDataOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lOpportunityNumber,lSalesforceRetrieveDataOpportunityNumber)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumYearly=caseOutput.PremiumYearly
			String lSalesforceRetrieveDataPremiumYearly=caseOutput.SalesforceRetrieveDataPremiumYearly
			if(!lPremiumYearly.contentEquals(lSalesforceRetrieveDataPremiumYearly)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumYearly='+lPremiumYearly,lSalesforceRetrieveDataPremiumYearly)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumDeposit=caseOutput.PremiumDeposit
			String lSalesforceRetrieveDataPremiumDeposit=caseOutput.SalesforceRetrieveDataPremiumDeposit
			if(!lPremiumDeposit.contentEquals(lSalesforceRetrieveDataPremiumDeposit)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumDeposit='+lPremiumDeposit,lSalesforceRetrieveDataPremiumDeposit)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumMonthly=caseOutput.PremiumMonthly
			String lSalesforceRetrieveDataPremiumMonthly=caseOutput.SalesforceRetrieveDataPremiumMonthly
			if(!lPremiumMonthly.contentEquals(lSalesforceRetrieveDataPremiumMonthly)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumMonthly='+lPremiumMonthly,lSalesforceRetrieveDataPremiumMonthly)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumInstalment=caseOutput.PremiumInstalment
			String lSalesforceRetrieveDataPremiumInstalment=caseOutput.SalesforceRetrieveDataPremiumInstalment
			if(!lPremiumInstalment.contentEquals(lSalesforceRetrieveDataPremiumInstalment)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumInstalment='+lPremiumInstalment,lSalesforceRetrieveDataPremiumInstalment)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumNoDepositAmount=caseOutput.PremiumNoDepositAmount
			String lSalesforceRetrieveDataPremiumNoDepositAmount=caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount
			if(!lPremiumNoDepositAmount.contentEquals(lSalesforceRetrieveDataPremiumNoDepositAmount)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lPremiumNoDepositAmount,lSalesforceRetrieveDataPremiumNoDepositAmount)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumNoDepositTotal=caseOutput.PremiumNoDepositTotal
			String lSalesforceRetrieveDataPremiumNoDepositTotal=caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal
			if(!lPremiumNoDepositTotal.contentEquals(lSalesforceRetrieveDataPremiumNoDepositTotal)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lPremiumNoDepositTotal,lSalesforceRetrieveDataPremiumNoDepositTotal)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumQuarterlyAmount=caseOutput.PremiumQuarterlyAmount
			String lSalesforceRetrieveDataPremiumQuarterlyAmount=caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount
			if(!lPremiumQuarterlyAmount.contentEquals(lSalesforceRetrieveDataPremiumQuarterlyAmount)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumQuarterlyAmount='+lPremiumQuarterlyAmount,lSalesforceRetrieveDataPremiumQuarterlyAmount)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lPremiumQuarterlyTotal=caseOutput.PremiumQuarterlyTotal
			String lSalesforceRetrieveDataPremiumQuarterlyTotal=caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal
			if(!lPremiumQuarterlyTotal.contentEquals(lSalesforceRetrieveDataPremiumQuarterlyTotal)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumQuarterlyTotal='+lPremiumQuarterlyTotal,lSalesforceRetrieveDataPremiumQuarterlyTotal)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPageValue=caseOutput.AutomationPageValue
			String lSalesforceRetrieveDataAutomationPageValue=caseOutput.SalesforceRetrieveDataAutomationPageValue
			if(!lAutomationPageValue.contentEquals(lSalesforceRetrieveDataAutomationPageValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPageValue='+lAutomationPageValue,lSalesforceRetrieveDataAutomationPageValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPageText=caseOutput.AutomationPageText
			String lSalesforceRetrieveDataAutomationPageText=caseOutput.SalesforceRetrieveDataAutomationPageText
			if(!lAutomationPageText.contentEquals(lSalesforceRetrieveDataAutomationPageText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPageText='+lAutomationPageText,lSalesforceRetrieveDataAutomationPageText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationVersionValue=caseOutput.AutomationVersionValue
			String lSalesforceRetrieveDataAutomationVersionValue=caseOutput.SalesforceRetrieveDataAutomationVersionValue
			if(!lAutomationVersionValue.contentEquals(lSalesforceRetrieveDataAutomationVersionValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationVersionValue='+lAutomationVersionValue,lSalesforceRetrieveDataAutomationVersionValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationVersionText=caseOutput.AutomationVersionText
			String lSalesforceRetrieveDataAutomationVersionText=caseOutput.SalesforceRetrieveDataAutomationVersionText
			if(!lAutomationVersionText.contentEquals(lSalesforceRetrieveDataAutomationVersionText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationVersionText='+lAutomationVersionText,lSalesforceRetrieveDataAutomationVersionText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationOpportunityNumberValue=caseOutput.AutomationOpportunityNumberValue
			String lSalesforceRetrieveDataAutomationOpportunityNumberValue=caseOutput.SalesforceRetrieveDataAutomationOpportunityNumberValue
			if(!lAutomationOpportunityNumberValue.contentEquals(lSalesforceRetrieveDataAutomationOpportunityNumberValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationOpportunityNumberValue='+lAutomationOpportunityNumberValue,lSalesforceRetrieveDataAutomationOpportunityNumberValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationOpportunityNumberText=caseOutput.AutomationOpportunityNumberText
			String lSalesforceRetrieveDataAutomationOpportunityNumberText=caseOutput.SalesforceRetrieveDataAutomationOpportunityNumberText
			if(!lAutomationOpportunityNumberText.contentEquals(lSalesforceRetrieveDataAutomationOpportunityNumberText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationOpportunityNumberText='+lAutomationOpportunityNumberText,lSalesforceRetrieveDataAutomationOpportunityNumberText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationVehicleDetailValue=caseOutput.AutomationVehicleDetailValue
			String lSalesforceRetrieveDataAutomationVehicleDetailValue=caseOutput.SalesforceRetrieveDataAutomationVehicleDetailValue
			if(!lAutomationVehicleDetailValue.contentEquals(lSalesforceRetrieveDataAutomationVehicleDetailValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationVehicleDetailValue='+lAutomationVehicleDetailValue,lSalesforceRetrieveDataAutomationVehicleDetailValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationVehicleDetailText=caseOutput.AutomationVehicleDetailText
			String lSalesforceRetrieveDataAutomationVehicleDetailText=caseOutput.SalesforceRetrieveDataAutomationVehicleDetailText
			if(!lAutomationVehicleDetailText.contentEquals(lSalesforceRetrieveDataAutomationVehicleDetailText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationVehicleDetailText='+lAutomationVehicleDetailText,lSalesforceRetrieveDataAutomationVehicleDetailText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumYearlyValue=caseOutput.AutomationPremiumYearlyValue
			String lSalesforceRetrieveDataAutomationPremiumYearlyValue=caseOutput.SalesforceRetrieveDataAutomationPremiumYearlyValue
			if(!lAutomationPremiumYearlyValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumYearlyValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumYearlyValue='+lAutomationPremiumYearlyValue,lSalesforceRetrieveDataAutomationPremiumYearlyValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumYearlyText=caseOutput.AutomationPremiumYearlyText
			String lSalesforceRetrieveDataAutomationPremiumYearlyText=caseOutput.SalesforceRetrieveDataAutomationPremiumYearlyText
			if(!lAutomationPremiumYearlyText.contentEquals(lSalesforceRetrieveDataAutomationPremiumYearlyText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumYearlyText='+lAutomationPremiumYearlyText,lSalesforceRetrieveDataAutomationPremiumYearlyText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumDepositValue=caseOutput.AutomationPremiumDepositValue
			String lSalesforceRetrieveDataAutomationPremiumDepositValue=caseOutput.SalesforceRetrieveDataAutomationPremiumDepositValue
			if(!lAutomationPremiumDepositValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumDepositValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumDepositValue='+lAutomationPremiumDepositValue,lSalesforceRetrieveDataAutomationPremiumDepositValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumDepositText=caseOutput.AutomationPremiumDepositText
			String lSalesforceRetrieveDataAutomationPremiumDepositText=caseOutput.SalesforceRetrieveDataAutomationPremiumDepositText
			if(!lAutomationPremiumDepositText.contentEquals(lSalesforceRetrieveDataAutomationPremiumDepositText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumDepositText='+lAutomationPremiumDepositText,lSalesforceRetrieveDataAutomationPremiumDepositText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumMonthlyValue=caseOutput.AutomationPremiumMonthlyValue
			String lSalesforceRetrieveDataAutomationPremiumMonthlyValue=caseOutput.SalesforceRetrieveDataAutomationPremiumMonthlyValue
			if(!lAutomationPremiumMonthlyValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumMonthlyValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumMonthlyValue='+lAutomationPremiumMonthlyValue,lSalesforceRetrieveDataAutomationPremiumMonthlyValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumMonthlyText=caseOutput.AutomationPremiumMonthlyText
			String lSalesforceRetrieveDataAutomationPremiumMonthlyText=caseOutput.SalesforceRetrieveDataAutomationPremiumMonthlyText
			if(!lAutomationPremiumMonthlyText.contentEquals(lSalesforceRetrieveDataAutomationPremiumMonthlyText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumMonthlyText='+lAutomationPremiumMonthlyText,lSalesforceRetrieveDataAutomationPremiumMonthlyText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumInstalmentValue=caseOutput.AutomationPremiumInstalmentValue
			String lSalesforceRetrieveDataAutomationPremiumInstalmentValue=caseOutput.SalesforceRetrieveDataAutomationPremiumInstalmentValue
			if(!lAutomationPremiumInstalmentValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumInstalmentValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumInstalmentValue='+lAutomationPremiumInstalmentValue,lSalesforceRetrieveDataAutomationPremiumInstalmentValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumInstalmentText=caseOutput.AutomationPremiumInstalmentText
			String lSalesforceRetrieveDataAutomationPremiumInstalmentText=caseOutput.SalesforceRetrieveDataAutomationPremiumInstalmentText
			if(!lAutomationPremiumInstalmentText.contentEquals(lSalesforceRetrieveDataAutomationPremiumInstalmentText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumInstalmentText='+lAutomationPremiumInstalmentText,lSalesforceRetrieveDataAutomationPremiumInstalmentText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumNoDepositAmountValue=caseOutput.AutomationPremiumNoDepositAmountValue
			String lSalesforceRetrieveDataAutomationPremiumNoDepositAmountValue=caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositAmountValue
			if(!lAutomationPremiumNoDepositAmountValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumNoDepositAmountValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumNoDepositAmountValue='+lAutomationPremiumNoDepositAmountValue,lSalesforceRetrieveDataAutomationPremiumNoDepositAmountValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumNoDepositAmountText=caseOutput.AutomationPremiumNoDepositAmountText
			String lSalesforceRetrieveDataAutomationPremiumNoDepositAmountText=caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositAmountText
			if(!lAutomationPremiumNoDepositAmountText.contentEquals(lSalesforceRetrieveDataAutomationPremiumNoDepositAmountText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumNoDepositAmountText='+lAutomationPremiumNoDepositAmountText,lSalesforceRetrieveDataAutomationPremiumNoDepositAmountText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumNoDepositTotalValue=caseOutput.AutomationPremiumNoDepositTotalValue
			String lSalesforceRetrieveDataAutomationPremiumNoDepositTotalValue=caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositTotalValue
			if(!lAutomationPremiumNoDepositTotalValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumNoDepositTotalValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumNoDepositTotalValue='+lAutomationPremiumNoDepositTotalValue,lSalesforceRetrieveDataAutomationPremiumNoDepositTotalValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumNoDepositTotalText=caseOutput.AutomationPremiumNoDepositTotalText
			String lSalesforceRetrieveDataAutomationPremiumNoDepositTotalText=caseOutput.SalesforceRetrieveDataAutomationPremiumNoDepositTotalText
			if(!lAutomationPremiumNoDepositTotalText.contentEquals(lSalesforceRetrieveDataAutomationPremiumNoDepositTotalText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumNoDepositTotalText='+lAutomationPremiumNoDepositTotalText,lSalesforceRetrieveDataAutomationPremiumNoDepositTotalText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumQuarterlyAmountValue=caseOutput.AutomationPremiumQuarterlyAmountValue
			String lSalesforceRetrieveDataAutomationPremiumQuarterlyAmountValue=caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyAmountValue
			if(!lAutomationPremiumQuarterlyAmountValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumQuarterlyAmountValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumQuarterlyAmountValue='+lAutomationPremiumQuarterlyAmountValue,lSalesforceRetrieveDataAutomationPremiumQuarterlyAmountValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumQuarterlyAmountText=caseOutput.AutomationPremiumQuarterlyAmountText
			String lSalesforceRetrieveDataAutomationPremiumQuarterlyAmountText=caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyAmountText
			if(!lAutomationPremiumQuarterlyAmountText.contentEquals(lSalesforceRetrieveDataAutomationPremiumQuarterlyAmountText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumQuarterlyAmountText='+lAutomationPremiumQuarterlyAmountText,lSalesforceRetrieveDataAutomationPremiumQuarterlyAmountText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumQuarterlyTotalValue=caseOutput.AutomationPremiumQuarterlyTotalValue
			String lSalesforceRetrieveDataAutomationPremiumQuarterlyTotalValue=caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyTotalValue
			if(!lAutomationPremiumQuarterlyTotalValue.contentEquals(lSalesforceRetrieveDataAutomationPremiumQuarterlyTotalValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumQuarterlyTotalValue='+lAutomationPremiumQuarterlyTotalValue,lSalesforceRetrieveDataAutomationPremiumQuarterlyTotalValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPremiumQuarterlyTotalText=caseOutput.AutomationPremiumQuarterlyTotalText
			String lSalesforceRetrieveDataAutomationPremiumQuarterlyTotalText=caseOutput.SalesforceRetrieveDataAutomationPremiumQuarterlyTotalText
			if(!lAutomationPremiumQuarterlyTotalText.contentEquals(lSalesforceRetrieveDataAutomationPremiumQuarterlyTotalText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPremiumQuarterlyTotalText='+lAutomationPremiumQuarterlyTotalText,lSalesforceRetrieveDataAutomationPremiumQuarterlyTotalText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPlanTypeValue=caseOutput.AutomationPlanTypeValue
			String lSalesforceRetrieveDataAutomationPlanTypeValue=caseOutput.SalesforceRetrieveDataAutomationPlanTypeValue
			if(!lAutomationPlanTypeValue.contentEquals(lSalesforceRetrieveDataAutomationPlanTypeValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPlanTypeValue='+lAutomationPlanTypeValue,lSalesforceRetrieveDataAutomationPlanTypeValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPlanTypeText=caseOutput.AutomationPlanTypeText
			String lSalesforceRetrieveDataAutomationPlanTypeText=caseOutput.SalesforceRetrieveDataAutomationPlanTypeText
			if(!lAutomationPlanTypeText.contentEquals(lSalesforceRetrieveDataAutomationPlanTypeText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPlanTypeText='+lAutomationPlanTypeText,lSalesforceRetrieveDataAutomationPlanTypeText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationSumInsuredValue=caseOutput.AutomationSumInsuredValue
			String lSalesforceRetrieveDataAutomationSumInsuredValue=caseOutput.SalesforceRetrieveDataAutomationSumInsuredValue
			if(!lAutomationSumInsuredValue.contentEquals(lSalesforceRetrieveDataAutomationSumInsuredValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationSumInsuredValue='+lAutomationSumInsuredValue,lSalesforceRetrieveDataAutomationSumInsuredValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationSumInsuredText=caseOutput.AutomationSumInsuredText
			String lSalesforceRetrieveDataAutomationSumInsuredText=caseOutput.SalesforceRetrieveDataAutomationSumInsuredText
			if(!lAutomationSumInsuredText.contentEquals(lSalesforceRetrieveDataAutomationSumInsuredText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationSumInsuredText='+lAutomationSumInsuredText,lSalesforceRetrieveDataAutomationSumInsuredText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationWorkshopValue=caseOutput.AutomationWorkshopValue
			String lSalesforceRetrieveDataAutomationWorkshopValue=caseOutput.SalesforceRetrieveDataAutomationWorkshopValue
			if(!lAutomationWorkshopValue.contentEquals(lSalesforceRetrieveDataAutomationWorkshopValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationWorkshopValue='+lAutomationWorkshopValue,lSalesforceRetrieveDataAutomationWorkshopValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationWorkshopText=caseOutput.AutomationWorkshopText
			String lSalesforceRetrieveDataAutomationWorkshopText=caseOutput.SalesforceRetrieveDataAutomationWorkshopText
			if(!lAutomationWorkshopText.contentEquals(lSalesforceRetrieveDataAutomationWorkshopText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationWorkshopText='+lAutomationWorkshopText,lSalesforceRetrieveDataAutomationWorkshopText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationExcessPriceValue=caseOutput.AutomationExcessPriceValue
			String lSalesforceRetrieveDataAutomationExcessPriceValue=caseOutput.SalesforceRetrieveDataAutomationExcessPriceValue
			if(!lAutomationExcessPriceValue.contentEquals(lSalesforceRetrieveDataAutomationExcessPriceValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationExcessPriceValue='+lAutomationExcessPriceValue,lSalesforceRetrieveDataAutomationExcessPriceValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationExcessPriceText=caseOutput.AutomationExcessPriceText
			String lSalesforceRetrieveDataAutomationExcessPriceText=caseOutput.SalesforceRetrieveDataAutomationExcessPriceText
			if(!lAutomationExcessPriceText.contentEquals(lSalesforceRetrieveDataAutomationExcessPriceText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationExcessPriceText='+lAutomationExcessPriceText,lSalesforceRetrieveDataAutomationExcessPriceText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationDriverPlanValue=caseOutput.AutomationDriverPlanValue
			String lSalesforceRetrieveDataAutomationDriverPlanValue=caseOutput.SalesforceRetrieveDataAutomationDriverPlanValue
			if(!lAutomationDriverPlanValue.contentEquals(lSalesforceRetrieveDataAutomationDriverPlanValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationDriverPlanValue='+lAutomationDriverPlanValue,lSalesforceRetrieveDataAutomationDriverPlanValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationDriverPlanText=caseOutput.AutomationDriverPlanText
			String lSalesforceRetrieveDataAutomationDriverPlanText=caseOutput.SalesforceRetrieveDataAutomationDriverPlanText
			if(!lAutomationDriverPlanText.contentEquals(lSalesforceRetrieveDataAutomationDriverPlanText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationDriverPlanText='+lAutomationDriverPlanText,lSalesforceRetrieveDataAutomationDriverPlanText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationTpbiValue=caseOutput.AutomationTpbiValue
			String lSalesforceRetrieveDataAutomationTpbiValue=caseOutput.SalesforceRetrieveDataAutomationTpbiValue
			if(!lAutomationTpbiValue.contentEquals(lSalesforceRetrieveDataAutomationTpbiValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationTpbiValue='+lAutomationTpbiValue,lSalesforceRetrieveDataAutomationTpbiValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationTpbiText=caseOutput.AutomationTpbiText
			String lSalesforceRetrieveDataAutomationTpbiText=caseOutput.SalesforceRetrieveDataAutomationTpbiText
			if(!lAutomationTpbiText.contentEquals(lSalesforceRetrieveDataAutomationTpbiText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationTpbiText='+lAutomationTpbiText,lSalesforceRetrieveDataAutomationTpbiText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationTppdValue=caseOutput.AutomationTppdValue
			String lSalesforceRetrieveDataAutomationTppdValue=caseOutput.SalesforceRetrieveDataAutomationTppdValue
			if(!lAutomationTppdValue.contentEquals(lSalesforceRetrieveDataAutomationTppdValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationTppdValue='+lAutomationTppdValue,lSalesforceRetrieveDataAutomationTppdValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationTppdText=caseOutput.AutomationTppdText
			String lSalesforceRetrieveDataAutomationTppdText=caseOutput.SalesforceRetrieveDataAutomationTppdText
			if(!lAutomationTppdText.contentEquals(lSalesforceRetrieveDataAutomationTppdText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationTppdText='+lAutomationTppdText,lSalesforceRetrieveDataAutomationTppdText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPaAndMeValue=caseOutput.AutomationPaAndMeValue
			String lSalesforceRetrieveDataAutomationPaAndMeValue=caseOutput.SalesforceRetrieveDataAutomationPaAndMeValue
			if(!lAutomationPaAndMeValue.contentEquals(lSalesforceRetrieveDataAutomationPaAndMeValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPaAndMeValue='+lAutomationPaAndMeValue,lSalesforceRetrieveDataAutomationPaAndMeValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPaAndMeText=caseOutput.AutomationPaAndMeText
			String lSalesforceRetrieveDataAutomationPaAndMeText=caseOutput.SalesforceRetrieveDataAutomationPaAndMeText
			if(!lAutomationPaAndMeText.contentEquals(lSalesforceRetrieveDataAutomationPaAndMeText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPaAndMeText='+lAutomationPaAndMeText,lSalesforceRetrieveDataAutomationPaAndMeText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPaOnlyValue=caseOutput.AutomationPaOnlyValue
			String lSalesforceRetrieveDataAutomationPaOnlyValue=caseOutput.SalesforceRetrieveDataAutomationPaOnlyValue
			if(!lAutomationPaOnlyValue.contentEquals(lSalesforceRetrieveDataAutomationPaOnlyValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPaOnlyValue='+lAutomationPaOnlyValue,lSalesforceRetrieveDataAutomationPaOnlyValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationPaOnlyText=caseOutput.AutomationPaOnlyText
			String lSalesforceRetrieveDataAutomationPaOnlyText=caseOutput.SalesforceRetrieveDataAutomationPaOnlyText
			if(!lAutomationPaOnlyText.contentEquals(lSalesforceRetrieveDataAutomationPaOnlyText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationPaOnlyText='+lAutomationPaOnlyText,lSalesforceRetrieveDataAutomationPaOnlyText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationMeOnlyValue=caseOutput.AutomationMeOnlyValue
			String lSalesforceRetrieveDataAutomationMeOnlyValue=caseOutput.SalesforceRetrieveDataAutomationMeOnlyValue
			if(!lAutomationMeOnlyValue.contentEquals(lSalesforceRetrieveDataAutomationMeOnlyValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationMeOnlyValue='+lAutomationMeOnlyValue,lSalesforceRetrieveDataAutomationMeOnlyValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationMeOnlyText=caseOutput.AutomationMeOnlyText
			String lSalesforceRetrieveDataAutomationMeOnlyText=caseOutput.SalesforceRetrieveDataAutomationMeOnlyText
			if(!lAutomationMeOnlyText.contentEquals(lSalesforceRetrieveDataAutomationMeOnlyText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationMeOnlyText='+lAutomationMeOnlyText,lSalesforceRetrieveDataAutomationMeOnlyText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationCompulsoryValue=caseOutput.AutomationCompulsoryValue
			String lSalesforceRetrieveDataAutomationCompulsoryValue=caseOutput.SalesforceRetrieveDataAutomationCompulsoryValue
			if(!lAutomationCompulsoryValue.contentEquals(lSalesforceRetrieveDataAutomationCompulsoryValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationCompulsoryValue='+lAutomationCompulsoryValue,lSalesforceRetrieveDataAutomationCompulsoryValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationCompulsoryText=caseOutput.AutomationCompulsoryText
			String lSalesforceRetrieveDataAutomationCompulsoryText=caseOutput.SalesforceRetrieveDataAutomationCompulsoryText
			if(!lAutomationCompulsoryText.contentEquals(lSalesforceRetrieveDataAutomationCompulsoryText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationCompulsoryText='+lAutomationCompulsoryText,lSalesforceRetrieveDataAutomationCompulsoryText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationRsaValue=caseOutput.AutomationRsaValue
			String lSalesforceRetrieveDataAutomationRsaValue=caseOutput.SalesforceRetrieveDataAutomationRsaValue
			if(!lAutomationRsaValue.contentEquals(lSalesforceRetrieveDataAutomationRsaValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationRsaValue='+lAutomationRsaValue,lSalesforceRetrieveDataAutomationRsaValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationRsaText=caseOutput.AutomationRsaText
			String lSalesforceRetrieveDataAutomationRsaText=caseOutput.SalesforceRetrieveDataAutomationRsaText
			if(!lAutomationRsaText.contentEquals(lSalesforceRetrieveDataAutomationRsaText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationRsaText='+lAutomationRsaText,lSalesforceRetrieveDataAutomationRsaText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationCarReplacementServiceValue=caseOutput.AutomationCarReplacementServiceValue
			String lSalesforceRetrieveDataAutomationCarReplacementServiceValue=caseOutput.SalesforceRetrieveDataAutomationCarReplacementServiceValue
			if(!lAutomationCarReplacementServiceValue.contentEquals(lSalesforceRetrieveDataAutomationCarReplacementServiceValue)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationCarReplacementServiceValue='+lAutomationCarReplacementServiceValue,lSalesforceRetrieveDataAutomationCarReplacementServiceValue)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationCarReplacementServiceText=caseOutput.AutomationCarReplacementServiceText
			String lSalesforceRetrieveDataAutomationCarReplacementServiceText=caseOutput.SalesforceRetrieveDataAutomationCarReplacementServiceText
			if(!lAutomationCarReplacementServiceText.contentEquals(lSalesforceRetrieveDataAutomationCarReplacementServiceText)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationCarReplacementServiceText='+lAutomationCarReplacementServiceText,lSalesforceRetrieveDataAutomationCarReplacementServiceText)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem01Value=caseOutput.AutomationAccessoryItem01Value
			String lSalesforceRetrieveDataAutomationAccessoryItem01Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem01Value
			if(!lAutomationAccessoryItem01Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem01Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem01Value='+lAutomationAccessoryItem01Value,lSalesforceRetrieveDataAutomationAccessoryItem01Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem01Text=caseOutput.AutomationAccessoryItem01Text
			String lSalesforceRetrieveDataAutomationAccessoryItem01Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem01Text
			if(!lAutomationAccessoryItem01Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem01Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem01Text='+lAutomationAccessoryItem01Text,lSalesforceRetrieveDataAutomationAccessoryItem01Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem02Value=caseOutput.AutomationAccessoryItem02Value
			String lSalesforceRetrieveDataAutomationAccessoryItem02Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem02Value
			if(!lAutomationAccessoryItem02Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem02Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem02Value='+lAutomationAccessoryItem02Value,lSalesforceRetrieveDataAutomationAccessoryItem02Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem02Text=caseOutput.AutomationAccessoryItem02Text
			String lSalesforceRetrieveDataAutomationAccessoryItem02Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem02Text
			if(!lAutomationAccessoryItem02Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem02Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem02Text='+lAutomationAccessoryItem02Text,lSalesforceRetrieveDataAutomationAccessoryItem02Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem03Value=caseOutput.AutomationAccessoryItem03Value
			String lSalesforceRetrieveDataAutomationAccessoryItem03Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem03Value
			if(!lAutomationAccessoryItem03Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem03Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem03Value='+lAutomationAccessoryItem03Value,lSalesforceRetrieveDataAutomationAccessoryItem03Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem03Text=caseOutput.AutomationAccessoryItem03Text
			String lSalesforceRetrieveDataAutomationAccessoryItem03Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem03Text
			if(!lAutomationAccessoryItem03Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem03Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem03Text='+lAutomationAccessoryItem03Text,lSalesforceRetrieveDataAutomationAccessoryItem03Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem04Value=caseOutput.AutomationAccessoryItem04Value
			String lSalesforceRetrieveDataAutomationAccessoryItem04Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem04Value
			if(!lAutomationAccessoryItem04Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem04Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem04Value='+lAutomationAccessoryItem04Value,lSalesforceRetrieveDataAutomationAccessoryItem04Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem04Text=caseOutput.AutomationAccessoryItem04Text
			String lSalesforceRetrieveDataAutomationAccessoryItem04Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem04Text
			if(!lAutomationAccessoryItem04Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem04Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem04Text='+lAutomationAccessoryItem04Text,lSalesforceRetrieveDataAutomationAccessoryItem04Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem05Value=caseOutput.AutomationAccessoryItem05Value
			String lSalesforceRetrieveDataAutomationAccessoryItem05Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem05Value
			if(!lAutomationAccessoryItem05Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem05Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem05Value='+lAutomationAccessoryItem05Value,lSalesforceRetrieveDataAutomationAccessoryItem05Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem05Text=caseOutput.AutomationAccessoryItem05Text
			String lSalesforceRetrieveDataAutomationAccessoryItem05Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem05Text
			if(!lAutomationAccessoryItem05Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem05Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem05Text='+lAutomationAccessoryItem05Text,lSalesforceRetrieveDataAutomationAccessoryItem05Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem06Value=caseOutput.AutomationAccessoryItem06Value
			String lSalesforceRetrieveDataAutomationAccessoryItem06Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem06Value
			if(!lAutomationAccessoryItem06Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem06Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem06Value='+lAutomationAccessoryItem06Value,lSalesforceRetrieveDataAutomationAccessoryItem06Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem06Text=caseOutput.AutomationAccessoryItem06Text
			String lSalesforceRetrieveDataAutomationAccessoryItem06Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem06Text
			if(!lAutomationAccessoryItem06Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem06Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem06Text='+lAutomationAccessoryItem06Text,lSalesforceRetrieveDataAutomationAccessoryItem06Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem07Value=caseOutput.AutomationAccessoryItem07Value
			String lSalesforceRetrieveDataAutomationAccessoryItem07Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem07Value
			if(!lAutomationAccessoryItem07Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem07Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem07Value='+lAutomationAccessoryItem07Value,lSalesforceRetrieveDataAutomationAccessoryItem07Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem07Text=caseOutput.AutomationAccessoryItem07Text
			String lSalesforceRetrieveDataAutomationAccessoryItem07Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem07Text
			if(!lAutomationAccessoryItem07Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem07Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem07Text='+lAutomationAccessoryItem07Text,lSalesforceRetrieveDataAutomationAccessoryItem07Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem08Value=caseOutput.AutomationAccessoryItem08Value
			String lSalesforceRetrieveDataAutomationAccessoryItem08Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem08Value
			if(!lAutomationAccessoryItem08Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem08Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem08Value='+lAutomationAccessoryItem08Value,lSalesforceRetrieveDataAutomationAccessoryItem08Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem08Text=caseOutput.AutomationAccessoryItem08Text
			String lSalesforceRetrieveDataAutomationAccessoryItem08Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem08Text
			if(!lAutomationAccessoryItem08Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem08Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem08Text='+lAutomationAccessoryItem08Text,lSalesforceRetrieveDataAutomationAccessoryItem08Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem09Value=caseOutput.AutomationAccessoryItem09Value
			String lSalesforceRetrieveDataAutomationAccessoryItem09Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem09Value
			if(!lAutomationAccessoryItem09Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem09Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem09Value='+lAutomationAccessoryItem09Value,lSalesforceRetrieveDataAutomationAccessoryItem09Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem09Text=caseOutput.AutomationAccessoryItem09Text
			String lSalesforceRetrieveDataAutomationAccessoryItem09Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem09Text
			if(!lAutomationAccessoryItem09Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem09Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem09Text='+lAutomationAccessoryItem09Text,lSalesforceRetrieveDataAutomationAccessoryItem09Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem10Value=caseOutput.AutomationAccessoryItem10Value
			String lSalesforceRetrieveDataAutomationAccessoryItem10Value=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem10Value
			if(!lAutomationAccessoryItem10Value.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem10Value)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem10Value='+lAutomationAccessoryItem10Value,lSalesforceRetrieveDataAutomationAccessoryItem10Value)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationAccessoryItem10Text=caseOutput.AutomationAccessoryItem10Text
			String lSalesforceRetrieveDataAutomationAccessoryItem10Text=caseOutput.SalesforceRetrieveDataAutomationAccessoryItem10Text
			if(!lAutomationAccessoryItem10Text.contentEquals(lSalesforceRetrieveDataAutomationAccessoryItem10Text)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('AutomationAccessoryItem10Text='+lAutomationAccessoryItem10Text,lSalesforceRetrieveDataAutomationAccessoryItem10Text)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PAGE_VALUE=lAutomationPageValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PAGE_TEXT=lAutomationPageText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VERSION_VALUE=lAutomationVersionValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VERSION_TEXT=lAutomationVersionText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE=lAutomationOpportunityNumberValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_TEXT=lAutomationOpportunityNumberText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VEHICLE_DETAIL_VALUE=lAutomationVehicleDetailValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VEHICLE_DETAIL_TEXT=lAutomationVehicleDetailText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE=lAutomationPremiumYearlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_TEXT=lAutomationPremiumYearlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_VALUE=lAutomationPremiumDepositValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_TEXT=lAutomationPremiumDepositText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_VALUE=lAutomationPremiumMonthlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_TEXT=lAutomationPremiumMonthlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_VALUE=lAutomationPremiumInstalmentValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_TEXT=lAutomationPremiumInstalmentText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE=lAutomationPremiumNoDepositAmountValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_TEXT=lAutomationPremiumNoDepositAmountText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE=lAutomationPremiumNoDepositTotalValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_TEXT=lAutomationPremiumNoDepositTotalText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_VALUE=lAutomationPremiumQuarterlyAmountValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_TEXT=lAutomationPremiumQuarterlyAmountText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_VALUE=lAutomationPremiumQuarterlyTotalValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_TEXT=lAutomationPremiumQuarterlyTotalText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PLAN_TYPE_VALUE=lAutomationPlanTypeValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PLAN_TYPE_TEXT=lAutomationPlanTypeText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_SUM_INSURED_VALUE=lAutomationSumInsuredValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_SUM_INSURED_TEXT=lAutomationSumInsuredText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_VALUE=lAutomationWorkshopValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_TEXT=lAutomationWorkshopText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_EXCESS_PRICE_VALUE=lAutomationExcessPriceValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_EXCESS_PRICE_TEXT=lAutomationExcessPriceText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_DRIVER_PLAN_VALUE=lAutomationDriverPlanValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_DRIVER_PLAN_TEXT=lAutomationDriverPlanText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPBI_VALUE=lAutomationTpbiValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPBI_TEXT=lAutomationTpbiText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPPD_VALUE=lAutomationTppdValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPPD_TEXT=lAutomationTppdText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_AND_ME_VALUE=lAutomationPaAndMeValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_AND_ME_TEXT=lAutomationPaAndMeText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_ONLY_VALUE=lAutomationPaOnlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_ONLY_TEXT=lAutomationPaOnlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ME_ONLY_VALUE=lAutomationMeOnlyValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ME_ONLY_TEXT=lAutomationMeOnlyText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_COMPULSORY_VALUE=lAutomationCompulsoryValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_COMPULSORY_TEXT=lAutomationCompulsoryText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_RSA_VALUE=lAutomationRsaValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_RSA_TEXT=lAutomationRsaText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_CAR_REPLACEMENT_SERVICE_VALUE=lAutomationCarReplacementServiceValue
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_CAR_REPLACEMENT_SERVICE_TEXT=lAutomationCarReplacementServiceText
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_01_VALUE=lAutomationAccessoryItem01Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_01_TEXT=lAutomationAccessoryItem01Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_02_VALUE=lAutomationAccessoryItem02Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_02_TEXT=lAutomationAccessoryItem02Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_03_VALUE=lAutomationAccessoryItem03Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_03_TEXT=lAutomationAccessoryItem03Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_04_VALUE=lAutomationAccessoryItem04Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_04_TEXT=lAutomationAccessoryItem04Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_05_VALUE=lAutomationAccessoryItem05Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_05_TEXT=lAutomationAccessoryItem05Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_06_VALUE=lAutomationAccessoryItem06Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_06_TEXT=lAutomationAccessoryItem06Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_07_VALUE=lAutomationAccessoryItem07Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_07_TEXT=lAutomationAccessoryItem07Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_08_VALUE=lAutomationAccessoryItem08Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_08_TEXT=lAutomationAccessoryItem08Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_09_VALUE=lAutomationAccessoryItem09Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_09_TEXT=lAutomationAccessoryItem09Text
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_10_VALUE=lAutomationAccessoryItem10Value
			THAMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_10_TEXT=lAutomationAccessoryItem10Text
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
			lSalesforceProceedRetrieveTodo=THAMotorCarQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
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
				String lLocatorResultPage='#result-package'
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
					lRedirected=lCurrentURL.toUpperCase().contains('RESULTPACKAGES')
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
	public Map inputProceedRetrieveWebFromUrl(String strRetrievePageURL){
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
					this.driver.switchTo().window(lWindowHandle)
					IGNUemaHelper.delayThreadSecond(3)
					this.driver.switchTo().window(lWindowHandle)
					IGNUemaHelper.delayThreadSecond(3)
				}
				lResult=true
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
	public Boolean inputExpectedKumkaCompareButton(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		String lExpectedKumkaCompareButton=targetMap.ExpectedKumkaCompareButton.toString().trim()
		Map lExpectedKumkaCompareButtonList=['1':'Any','2':'No','3':'Yes']
		String lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(lExpectedKumkaCompareButton)
		if(!lExpectedKumkaCompareButtonItem){
			lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(THAMotorCarQuotationResultType.DEFAULT_EXPECTED_KUMKA_COMPARE_BUTTON.toUpperCase())
			lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(lExpectedKumkaCompareButtonItem)
		}
		String lKumkaCompareToDo=targetMap.KumkaCompareToDo.toString().trim()
		Map lKumkaCompareToDoList=['1':'No','2':'Yes']
		String lKumkaCompareToDoItem=lKumkaCompareToDoList.get(lKumkaCompareToDo)
		if(!lKumkaCompareToDoItem){
			lKumkaCompareToDoItem=lKumkaCompareToDoList.get(THAMotorCarQuotationResultType.DEFAULT_KUMKA_COMPARE_TO_DO.toUpperCase())
			lKumkaCompareToDoItem=lKumkaCompareToDoList.get(lKumkaCompareToDoItem)
		}
		try{
			lreturn=true
			Boolean lIsExpectedContainsMrkumkaCompareButton=IGNUemaHelper.convertStringToBoolean(lExpectedKumkaCompareButtonItem)
			String lExpectedKumkaCompareButtonItemBefore=lExpectedKumkaCompareButtonItem
			if(lExpectedKumkaCompareButtonItem.equalsIgnoreCase('Any')){
				lIsExpectedContainsMrkumkaCompareButton=true
				lExpectedKumkaCompareButton='3'
				lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(lExpectedKumkaCompareButton)
			}
			if(lIsExpectedContainsMrkumkaCompareButton){
				String lTagButton='Go_To_MrKumka'
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(!lElementButton){
					lExpectedKumkaCompareButtonItem='No Option'
					lKumkaCompareToDoItem='No'
				}
			}
			if(lExpectedKumkaCompareButtonItemBefore.equalsIgnoreCase('Yes')&&lExpectedKumkaCompareButtonItem.equalsIgnoreCase('No Option')){
				lKumkaCompareToDoItem=''
				lreturn=false
			}
			targetMap.ExpectedKumkaCompareButton=lExpectedKumkaCompareButtonItem
			targetMap.KumkaCompareToDo=lKumkaCompareToDoItem
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputKumkaCompareNowV1(String strLanguage,String strEmailToSave,String strCallMeBack,String strCallMeBackPhoneNo,Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		String lLanguage=strLanguage.trim()
		String lEmailToSave=strEmailToSave.trim()
		String lCallMeBack=strCallMeBack.trim()
		String lCallMeBackPhoneNo=strCallMeBackPhoneNo.trim()
		String lKumkaCompareToDo=targetMap.KumkaCompareToDo.toString().trim()
		if(lKumkaCompareToDo.length()<=0){
			lKumkaCompareToDo=THAMotorCarQuotationResultType.DEFAULT_KUMKA_COMPARE_TO_DO
		}
		String lKumkaLoginPage=THAMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_URL
		String lLoginUser=THAMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_USER
		String lLoginPassword=THAMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_PASSWORD
		String lKumkaDefaultCompareLink=''
		String lKumkaOutboundCardCompareLinkNumber=''
		String lKumkaOutboundCardSaveQuoteIdNumber=''
		String lKumkaOutboundCardNumber=''
		String lKumkaDefaultSaveQuoteId=''
		try{
			String lStrEmailEN='.en@'
			String lStrEmailTH='.th@'
			String lMainWindow=this.driver.getWindowHandle()
			String lWindowHandle=''
			String lTagButton='Go_To_MrKumka'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(lElementButton){
				this.inputProceedRetrieveWebFromUrl(lKumkaLoginPage)
				this.inputLoginUserPassword(lLoginUser,lLoginPassword)
				lWindowHandle=this.driver.getWindowHandle()
				this.driver.close()
				this.driver.switchTo().window(lMainWindow)
				lKumkaDefaultCompareLink=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementButton,'href')
				if(lKumkaDefaultCompareLink.length()>0){
					lreturn=true
				}
				lMainWindow=this.driver.getWindowHandle()
				if(lMainWindow.length()<=0){
					lMainWindow=this.driver.getWindowHandle()
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
					for(String lWindowHandle2:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle2)){
							this.driver.switchTo().window(lWindowHandle2)
							IGNUemaHelper.delayThreadSecond(1)
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
				this.waitUntilKumkaPageLoaded()
				this.closeAskToSaveEmailForm()
				Map lMapKumkaOutboundCardResult=this.countKumkaOutboundCard()
				if(!lMapKumkaOutboundCardResult.Result){
					lKumkaOutboundCardCompareLinkNumber=''
				}else{
					lKumkaOutboundCardCompareLinkNumber=lMapKumkaOutboundCardResult.KumkaOutboundCardNumber
				}
				lreturn=lreturn&&lMapKumkaOutboundCardResult.Result
				String lCurrentURLText=this.driver.getCurrentUrl().toUpperCase().trim()
				if(lCurrentURLText.length()>0){
					THAMotorCarCoreType.CURRENT_URL_UNDER_PAGE_RESULT_NEW_KUMKA=IGNUemaHelper.checkStringContainString(lCurrentURLText,'/CARDSNEW')
				}
				if(THAMotorCarCoreType.CURRENT_URL_UNDER_PAGE_RESULT_NEW_KUMKA){
					lTHAKumkaInsureCarResultUtil=new THAKumkaInsureCarResultUtilDesignB(this.driver,this.selenium)
				}else{
					lTHAKumkaInsureCarResultUtil=new THAKumkaInsureCarResultUtilDesignA(this.driver,this.selenium)
				}
				if(lLanguage.equalsIgnoreCase('EN')){
					lEmailToSave=lEmailToSave.toLowerCase().replaceAll(lStrEmailTH,lStrEmailEN)
				}else{
					lEmailToSave=lEmailToSave.toLowerCase().replaceAll(lStrEmailEN,lStrEmailTH)
				}
				Map lMapEmailToSaveFiltered=lTHAKumkaInsureCarResultUtil.inputEmailToSave(lEmailToSave,true)
				if(!lMapEmailToSaveFiltered.Result){
					lKumkaDefaultSaveQuoteId=''
				}else{
					lKumkaDefaultSaveQuoteId=lMapEmailToSaveFiltered.SaveQuoteId
				}
				lreturn=lreturn&&lMapEmailToSaveFiltered.Result
				Map lMapCallMeBack=lTHAKumkaInsureCarResultUtil.inputCallMeBack(lCallMeBack,lCallMeBackPhoneNo)
				if(!lMapCallMeBack.Result){
					lCallMeBackPhoneNo=''
				}else{
					lCallMeBackPhoneNo=lMapCallMeBack.CallMeBackPhoneNo
				}
				lreturn=lreturn&&lMapCallMeBack.Result
				lWindowHandle=this.driver.getWindowHandle()
				this.driver.close()
				this.driver.switchTo().window(lMainWindow)
				this.inputProceedRetrieveWebFromUrl(lKumkaDefaultSaveQuoteId)
				this.waitUntilKumkaPageLoaded()
				this.closeAskToSaveEmailForm()
				lMapKumkaOutboundCardResult.clear()
				lMapKumkaOutboundCardResult=this.countKumkaOutboundCard()
				if(!lMapKumkaOutboundCardResult.Result){
					lKumkaOutboundCardSaveQuoteIdNumber=''
				}else{
					lKumkaOutboundCardSaveQuoteIdNumber=lMapKumkaOutboundCardResult.KumkaOutboundCardNumber
				}
				lreturn=lreturn&&lMapKumkaOutboundCardResult.Result
				Boolean lIsCompareEqualTotalKumkaOutboundCard=lKumkaOutboundCardCompareLinkNumber==lKumkaOutboundCardSaveQuoteIdNumber
				lKumkaDefaultSaveQuoteId=lKumkaDefaultCompareLink+' || '+lKumkaDefaultSaveQuoteId+' || '+lCallMeBackPhoneNo
				lKumkaOutboundCardNumber=lKumkaOutboundCardCompareLinkNumber+' || '+lKumkaOutboundCardSaveQuoteIdNumber
				WebUI.switchToDefaultContent()
				this.driver.close()
				this.driver.switchTo().window(lMainWindow)
				lreturn=lreturn&&lIsCompareEqualTotalKumkaOutboundCard
			}
			targetMap.KumkaCompareToDo=lKumkaCompareToDo
			targetMap.KumkaDefaultSaveQuoteId=lKumkaDefaultSaveQuoteId
			targetMap.KumkaOutboundCardNumber=lKumkaOutboundCardNumber
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputKumkaCompareNowV2(String strLanguage,String strEmailToSave,String strCallMeBack,String strCallMeBackPhoneNo,Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		String lLanguage=strLanguage.trim()
		String lEmailToSave=strEmailToSave.trim()
		String lCallMeBack=strCallMeBack.trim()
		String lCallMeBackPhoneNo=strCallMeBackPhoneNo.trim()
		String lKumkaCompareToDo=targetMap.KumkaCompareToDo.toString().trim()
		if(lKumkaCompareToDo.length()<=0){
			lKumkaCompareToDo=THAMotorCarQuotationResultType.DEFAULT_KUMKA_COMPARE_TO_DO
		}
		String lKumkaLoginPage=THAMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_URL
		String lLoginUser=THAMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_USER
		String lLoginPassword=THAMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_PASSWORD
		String lKumkaDefaultCompareLink=''
		String lKumkaOutboundCardCompareLinkNumber=''
		String lKumkaOutboundCardSaveQuoteIdNumber=''
		String lKumkaOutboundCardNumber=''
		String lKumkaDefaultSaveQuoteId=''
		try{
			String lStrEmailEN='.en@'
			String lStrEmailTH='.th@'
			String lMainWindow=this.driver.getWindowHandle()
			String lWindowHandle=''
			String lTagButton='Go_To_MrKumka'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(lElementButton){
				this.inputProceedRetrieveWebFromUrl(lKumkaLoginPage)
				this.inputLoginUserPassword(lLoginUser,lLoginPassword)
				lWindowHandle=this.driver.getWindowHandle()
				this.driver.close()
				this.driver.switchTo().window(lMainWindow)
				lKumkaDefaultCompareLink=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementButton,'href')
				if(lKumkaDefaultCompareLink.length()>0){
					lreturn=true
				}
				lMainWindow=this.driver.getWindowHandle()
				if(lMainWindow.length()<=0){
					lMainWindow=this.driver.getWindowHandle()
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
					for(String lWindowHandle2:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle2)){
							this.driver.switchTo().window(lWindowHandle2)
							IGNUemaHelper.delayThreadSecond(1)
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
				this.waitUntilKumkaPageLoaded()
				this.closeAskToSaveEmailForm()
				Map lMapKumkaOutboundCardResult=this.countKumkaOutboundCard()
				if(!lMapKumkaOutboundCardResult.Result){
					lKumkaOutboundCardNumber=''
				}else{
					lKumkaOutboundCardNumber=lMapKumkaOutboundCardResult.KumkaOutboundCardNumber
				}
				lreturn=lreturn&&lMapKumkaOutboundCardResult.Result
				lKumkaDefaultSaveQuoteId=lKumkaDefaultCompareLink
				WebUI.switchToDefaultContent()
				this.driver.close()
				this.driver.switchTo().window(lMainWindow)
				lreturn=lreturn&&lKumkaOutboundCardNumber.length()>0
			}
			targetMap.KumkaCompareToDo=lKumkaCompareToDo
			targetMap.KumkaDefaultSaveQuoteId=lKumkaDefaultSaveQuoteId
			targetMap.KumkaOutboundCardNumber=lKumkaOutboundCardNumber
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoginUserPassword(String strLoginUser,String strLoginPassword){
		Map lreturn=[:]
		String lLoginUser=strLoginUser.trim()
		String lLoginPassword=strLoginPassword.trim()
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
	public Map countKumkaOutboundCard(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('KumkaOutboundCardNumber','')
			lreturn.put('Result',lResult)
			List<WebElement> lElementAllResultCard=[]
			Integer lOutputNumberOfCardNum=0
			String lTagListOfCardResultList='card-display-plan'
			String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
			lElementAllResultCard=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
			if(lElementAllResultCard){
				lOutputNumberOfCardNum=lElementAllResultCard.size()
			}
			if(lOutputNumberOfCardNum<=0){
				return lreturn
			}
			lResult=true
			if(lResult){
				lreturn.put('KumkaOutboundCardNumber',lOutputNumberOfCardNum)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean closeAskToSaveEmailForm(){
		Boolean lreturn=false
		try{
			String lTagAdvertiseFormModal='advertise-banner-modal'
			String lLocatorAdvertiseFormModal=IGNUemaHelper.getTagDataSeleniumKey(lTagAdvertiseFormModal)
			WebElement lElementAdvertiseFormModal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdvertiseFormModal)
			String lTagAdvertiseFormDismissButton=''
			String lLocatorAdvertiseFormDismissButton='[data-dismiss="modal"]'
			lLocatorAdvertiseFormDismissButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorAdvertiseFormModal,lLocatorAdvertiseFormDismissButton)
			WebElement lElementAdvertiseFormDismissButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdvertiseFormDismissButton)
			Boolean lIsAdvertiseFormModalDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorAdvertiseFormModal,5)
			lIsAdvertiseFormModalDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorAdvertiseFormModal)
			if(lIsAdvertiseFormModalDisplayed){
				lElementAdvertiseFormModal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAdvertiseFormModal)
				if(lElementAdvertiseFormModal){
					lElementAdvertiseFormDismissButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdvertiseFormDismissButton)
					if(lElementAdvertiseFormDismissButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdvertiseFormDismissButton)
						IGNUemaHelper.delayThreadSecond(3)
					}
				}
			}else{
				lElementAdvertiseFormDismissButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorAdvertiseFormDismissButton)
				if(lElementAdvertiseFormDismissButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAdvertiseFormDismissButton)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
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
			List<WebElement> lElementButtonCloseSaveQuoteList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagButtonCloseSaveQuote)
			if(lElementButtonCloseSaveQuoteList){
				for(WebElement lElementButtonCloseSaveQuoteItem in lElementButtonCloseSaveQuoteList){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCloseSaveQuoteItem)
				}
			}
			List<WebElement> lElementFormSaveQuoteList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagFormSaveQuote)
			if(lElementFormSaveQuoteList){
				for(WebElement lElementFormSaveQuoteItem in lElementFormSaveQuoteList){
					IGNUemaHelper.delayThreadSecond(1)
					lIsFormSaveQuoteDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByElementJs(this.driver,lElementFormSaveQuoteItem)
					if(lIsFormSaveQuoteDisplayed){
						lElementButtonCloseSaveQuote=IGNUemaHelper.getChildWebElementListFromDataSeleniumKey(this.driver,lElementFormSaveQuoteItem,lTagButtonCloseSaveQuote)
						if(lElementButtonCloseSaveQuote){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonCloseSaveQuote)
						}
						IGNUemaHelper.delayThreadSecond(1)
						lIsFormSaveQuoteDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByElementJs(this.driver,lElementFormSaveQuoteItem)
					}
				}
			}
			lreturn=!lIsFormSaveQuoteDisplayed
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInitKumkaCompareNowInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('KumkaCompareToDo','')
			targetMap.put('KumkaDefaultSaveQuoteId','')
			targetMap.put('KumkaOutboundCardNumber','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputExpectedKumkaCompareButtonInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('ExpectedKumkaCompareButton','')
			targetMap.put('KumkaCompareToDo','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
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
	public Boolean checkAnonymousAccountToGetActualOpportunityNumberByRedirecting(){
		Boolean lreturn=false
		try{
			Boolean lRedirected=false
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',30)
			if(!lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',30)
				if(!lRedirected){
					IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('buyNow'))
				}
			}
			lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'policyDetails1',30)
			if(lRedirected){
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('goback'))
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',30)
				if(!lRedirected){
					WebUI.back()
				}
				lRedirected=IGNUemaHelper.checkElementPresentByElementId(this.driver,'result-package',30)
				lreturn=lRedirected
			}
			if(!lRedirected){
				return lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}