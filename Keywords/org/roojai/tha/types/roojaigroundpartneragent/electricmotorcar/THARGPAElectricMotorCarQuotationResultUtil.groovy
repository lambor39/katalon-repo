package org.roojai.tha.types.roojaigroundpartneragent.electricmotorcar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.electricmotorcar.THAElectricMotorCarCoreType as THAElectricMotorCarCoreType
import org.roojai.tha.types.electricmotorcar.THAElectricMotorCarQuotationResultUtil
import org.roojai.tha.types.electricmotorcar.THAElectricMotorCarQuotationResultUtilOld
import org.roojai.tha.types.kumka.insurecar.THAKumkaInsureCarResultType
import org.roojai.tha.types.kumka.insurecar.THAKumkaInsureCarResultUtilDesignA
import org.roojai.tha.types.kumka.insurecar.THAKumkaInsureCarResultUtilDesignB
public class THARGPAElectricMotorCarQuotationResultUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lTHAElectricMotorCarQuotationResultUtil=null
	private def lTHAKumkaInsureCarResultUtil=null
	private Boolean lIsChangedFromAnyToDealerWorkshop=false
	private Boolean lIsDealerWorkshop=false
	public THARGPAElectricMotorCarQuotationResultUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAElectricMotorCarQuotationResultUtil getlTHAElectricMotorCarQuotationResultUtil(){
		return this.lTHAElectricMotorCarQuotationResultUtil
	}
	private void setlTHAElectricMotorCarQuotationResultUtil(THAElectricMotorCarQuotationResultUtil newlTHAElectricMotorCarQuotationResultUtil){
		//Do Nothing
		//this.lTHAElectricMotorCarQuotationResultUtil=newlTHAElectricMotorCarQuotationResultUtil
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
		String lVoluntaryTpbi=caseInput.VoluntaryTpbi.toString().trim()
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
		String lWallChargerCoverage=caseInput.WallChargerCoverage.toString().trim()
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
			//Check QuoteApplication
			THARGPAElectricMotorCarCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION=IGNUemaHelper.checkWebDriverURLTargetUnderQuoteApplication(driver)
			if(THARGPAElectricMotorCarCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION){
				this.lTHAElectricMotorCarQuotationResultUtil=new THAElectricMotorCarQuotationResultUtil(this.driver,this.selenium)
			}else{
				this.lTHAElectricMotorCarQuotationResultUtil=new THAElectricMotorCarQuotationResultUtilOld(this.driver,this.selenium)
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
					Boolean lIsKumkaCompareNowResult=this.inputKumkaCompareNow(lLanguage,lQuoteEmail,'Yes',lQuotePhoneNo,lMapKumkaCompareNowInputOutput)
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
			Map lMapVoluntaryTpbi=this.inputVoluntaryTpbi(lVoluntaryTpbi)
			if(!lMapVoluntaryTpbi.Result){
				lVoluntaryTpbi=''
			}else{
				lVoluntaryTpbi=lMapVoluntaryTpbi.VoluntaryTpbi
			}
			caseOutput.VoluntaryTpbi=lVoluntaryTpbi
			if(lVoluntaryTpbi.length()<=0){
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
			Map lMapWallChargerCoverage=this.inputWallChargerCoverage(lWallChargerCoverage)
			if(!lMapWallChargerCoverage.Result){
				lWallChargerCoverage=''
			}else{
				lWallChargerCoverage=lMapWallChargerCoverage.WallChargerCoverage
			}
			caseOutput.WallChargerCoverage=lWallChargerCoverage
			if(lWallChargerCoverage.length()<=0){
				return lreturn
			}
			Boolean lIsAccessoryAdd=IGNUemaHelper.convertStringToBoolean(lAccessoryAdd)
			if(lIsAccessoryAdd){
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
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PAGE_VALUE=lAutomationPageValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PAGE_TEXT=lAutomationPageText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VERSION_VALUE=lAutomationVersionValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VERSION_TEXT=lAutomationVersionText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE=lAutomationOpportunityNumberValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_TEXT=lAutomationOpportunityNumberText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VEHICLE_DETAIL_VALUE=lAutomationVehicleDetailValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_VEHICLE_DETAIL_TEXT=lAutomationVehicleDetailText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE=lAutomationPremiumYearlyValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_TEXT=lAutomationPremiumYearlyText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_VALUE=lAutomationPremiumDepositValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_TEXT=lAutomationPremiumDepositText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_VALUE=lAutomationPremiumMonthlyValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_TEXT=lAutomationPremiumMonthlyText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_VALUE=lAutomationPremiumInstalmentValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_TEXT=lAutomationPremiumInstalmentText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NODEPOSIT_AMOUNT_VALUE=lAutomationPremiumNoDepositAmountValue=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NODEPOSIT_AMOUNT_TEXT=lAutomationPremiumNoDepositAmountText=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NODEPOSIT_TOTAL_VALUE=lAutomationPremiumNoDepositTotalValue=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NODEPOSIT_TOTAL_TEXT=lAutomationPremiumNoDepositTotalText=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_VALUE=lAutomationPremiumQuarterlyAmountValue=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_TEXT=lAutomationPremiumQuarterlyAmountText=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_VALUE=lAutomationPremiumQuarterlyTotalValue=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_TEXT=lAutomationPremiumQuarterlyTotalText=''
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PLAN_TYPE_VALUE=lAutomationPlanTypeValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PLAN_TYPE_TEXT=lAutomationPlanTypeText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_SUM_INSURED_VALUE=lAutomationSumInsuredValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_SUM_INSURED_TEXT=lAutomationSumInsuredText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_VALUE=lAutomationWorkshopValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_TEXT=lAutomationWorkshopText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_EXCESS_PRICE_VALUE=lAutomationExcessPriceValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_EXCESS_PRICE_TEXT=lAutomationExcessPriceText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_DRIVER_PLAN_VALUE=lAutomationDriverPlanValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_DRIVER_PLAN_TEXT=lAutomationDriverPlanText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPBI_VALUE=lAutomationTpbiValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPBI_TEXT=lAutomationTpbiText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPPD_VALUE=lAutomationTppdValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_TPPD_TEXT=lAutomationTppdText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_AND_ME_VALUE=lAutomationPaAndMeValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_AND_ME_TEXT=lAutomationPaAndMeText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_ONLY_VALUE=lAutomationPaOnlyValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_PA_ONLY_TEXT=lAutomationPaOnlyText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ME_ONLY_VALUE=lAutomationMeOnlyValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ME_ONLY_TEXT=lAutomationMeOnlyText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_COMPULSORY_VALUE=lAutomationCompulsoryValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_COMPULSORY_TEXT=lAutomationCompulsoryText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_RSA_VALUE=lAutomationRsaValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_RSA_TEXT=lAutomationRsaText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_CAR_REPLACEMENT_SERVICE_VALUE=lAutomationCarReplacementServiceValue
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_CAR_REPLACEMENT_SERVICE_TEXT=lAutomationCarReplacementServiceText
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_01_VALUE=lAutomationAccessoryItem01Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_01_TEXT=lAutomationAccessoryItem01Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_02_VALUE=lAutomationAccessoryItem02Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_02_TEXT=lAutomationAccessoryItem02Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_03_VALUE=lAutomationAccessoryItem03Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_03_TEXT=lAutomationAccessoryItem03Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_04_VALUE=lAutomationAccessoryItem04Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_04_TEXT=lAutomationAccessoryItem04Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_05_VALUE=lAutomationAccessoryItem05Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_05_TEXT=lAutomationAccessoryItem05Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_06_VALUE=lAutomationAccessoryItem06Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_06_TEXT=lAutomationAccessoryItem06Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_07_VALUE=lAutomationAccessoryItem07Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_07_TEXT=lAutomationAccessoryItem07Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_08_VALUE=lAutomationAccessoryItem08Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_08_TEXT=lAutomationAccessoryItem08Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_09_VALUE=lAutomationAccessoryItem09Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_09_TEXT=lAutomationAccessoryItem09Text
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_10_VALUE=lAutomationAccessoryItem10Value
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_ACCESSORY_ITEM_10_TEXT=lAutomationAccessoryItem10Text
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
			THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
			THAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
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
				Boolean lIsSalesforceProceedRetrieveTodo=false
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
					THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
					if(lIsActualResult){
						lIsChangedFromAnyToDealerWorkshop=caseOutput.SalesforceVerifyDataTransactionSyncedObjPolicyProductVersionC>=THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_POLICY_PRODUCT_VERSION
						lIsDealerWorkshop=false
						if(lPlanGarage.equalsIgnoreCase('AnyWorkshop')){
							lIsDealerWorkshop=true
						}
						if(lIsChangedFromAnyToDealerWorkshop&&lIsDealerWorkshop){
							lPlanGarage='DealerWorkshop'
							lAutomationWorkshopValue=lPlanGarage
							THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_AUTOMATION_WORKSHOP_VALUE=lAutomationWorkshopValue
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
						lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
						if(lIsSalesforceProceedRetrieveTodo){
							Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THARGPAElectricMotorCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
							lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
							lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
							caseOutput.ActualResult=lActualResult
							if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
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
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THARGPAElectricMotorCarQuotationResultType.DEFAULT_POSITIVE_CASE
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
				lQuoteBy=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_BY.toUpperCase()
			}
			Map lMapActualResult=this.lTHAElectricMotorCarQuotationResultUtil.inputActualResult(isPositiveCase,lQuoteBy)
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
			lResult=lMapActualResult.Result
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
			lLanguage=THARGPAElectricMotorCarQuotationResultType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAElectricMotorCarQuotationResultUtil.inputLanguage(lLanguage)
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
	public Map inputPrePackage(String strPrePackage){
		Map lreturn=[:]
		String lPrePackage=strPrePackage.trim()
		if(lPrePackage.length()<=0){
			lPrePackage=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PRE_PACKAGE
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
			Map lMapPrePackage=this.lTHAElectricMotorCarQuotationResultUtil.inputPrePackage(lPrePackage)
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
			lResult=lMapPrePackage.Result
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
			Map lMapPostPrePackage=this.lTHAElectricMotorCarQuotationResultUtil.inputPostPrePackage()
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
			lResult=lMapPostPrePackage.Result
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
		String lPlanType=strPlanType.trim()
		if(lPlanType.length()<=0){
			lPlanType=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanType','')
			lreturn.put('Result',lResult)
			Map lMapPlanType=this.lTHAElectricMotorCarQuotationResultUtil.inputPlanType(lPlanType)
			if(!lMapPlanType.Result){
				lPlanType=''
			}else{
				lPlanType=lMapPlanType.PlanType
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
		String lPlanGarage=strPlanGarage.trim()
		if(lPlanGarage.length()<=0){
			lPlanGarage=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PLAN_GARAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanGarage','')
			lreturn.put('Result',lResult)
			Map lMapPlanGarage=this.lTHAElectricMotorCarQuotationResultUtil.inputPlanGarage(lPlanGarage)
			if(!lMapPlanGarage.Result){
				lPlanGarage=''
			}else{
				lPlanGarage=lMapPlanGarage.PlanGarage
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
		String lPlanExcess=strPlanExcess.trim()
		if(lPlanExcess.length()<=0){
			lPlanExcess=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PLAN_EXCESS
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanExcess','')
			lreturn.put('Result',lResult)
			Map lMapPlanExcess=this.lTHAElectricMotorCarQuotationResultUtil.inputPlanExcess(lPlanExcess)
			if(!lMapPlanExcess.Result){
				lPlanExcess=''
			}else{
				lPlanExcess=lMapPlanExcess.PlanExcess
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
		String lPlanDriver=strPlanDriver.trim()
		if(lPlanDriver.length()<=0){
			lPlanDriver=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PLAN_DRIVER
		}
		try{
			Boolean lResult=false
			lreturn.put('PlanDriver','')
			lreturn.put('Result',lResult)
			Map lMapPlanDriver=this.lTHAElectricMotorCarQuotationResultUtil.inputPlanDriver(lPlanDriver)
			if(!lMapPlanDriver.Result){
				lPlanDriver=''
			}else{
				lPlanDriver=lMapPlanDriver.PlanDriver
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
		String lCompulsory=strCompulsory.trim()
		if(lCompulsory.length()<=0){
			lCompulsory=THARGPAElectricMotorCarQuotationResultType.DEFAULT_COMPULSORY
		}
		try{
			Boolean lResult=false
			lreturn.put('Compulsory','')
			lreturn.put('Result',lResult)
			Map lMapCompulsory=this.lTHAElectricMotorCarQuotationResultUtil.inputCompulsory(lCompulsory)
			if(!lMapCompulsory.Result){
				lCompulsory=''
			}else{
				lCompulsory=lMapCompulsory.Compulsory
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
		String lWithRsa=strWithRsa.trim()
		if(lWithRsa.length()<=0){
			lWithRsa=THARGPAElectricMotorCarQuotationResultType.DEFAULT_WITH_RSA
		}
		try{
			Boolean lResult=false
			lreturn.put('WithRsa','')
			lreturn.put('Result',lResult)
			Map lMapWithRsa=this.lTHAElectricMotorCarQuotationResultUtil.inputWithRsa(lWithRsa)
			if(!lMapWithRsa.Result){
				lWithRsa=''
			}else{
				lWithRsa=lMapWithRsa.WithRsa
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
	public Map inputVoluntaryTpbi(String strVoluntaryTpbi){
		Map lreturn=[:]
		String lVoluntaryTpbi=strVoluntaryTpbi.trim()
		if(lVoluntaryTpbi.length()<=0){
			lVoluntaryTpbi=THARGPAElectricMotorCarQuotationResultType.DEFAULT_VOLUNTARY_TPBI
		}
		try{
			Boolean lResult=false
			lreturn.put('VoluntaryTpbi','')
			lreturn.put('Result',lResult)
			Map lMapVoluntaryTpbi=this.lTHAElectricMotorCarQuotationResultUtil.inputVoluntaryTpbi(lVoluntaryTpbi)
			if(!lMapVoluntaryTpbi.Result){
				lVoluntaryTpbi=''
			}else{
				lVoluntaryTpbi=lMapVoluntaryTpbi.VoluntaryTpbi
			}
			lResult=lVoluntaryTpbi.length()>0
			if(lResult){
				lreturn.put('VoluntaryTpbi',lVoluntaryTpbi)
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
		String lPersonalAccidentPaAndMe=strPersonalAccidentPaAndMe.trim()
		if(lPersonalAccidentPaAndMe.length()<=0){
			lPersonalAccidentPaAndMe=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_AND_ME
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaAndMe','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentPaAndMe=this.lTHAElectricMotorCarQuotationResultUtil.inputPersonalAccidentPaAndMe(lPersonalAccidentPaAndMe)
			if(!lMapPersonalAccidentPaAndMe.Result){
				lPersonalAccidentPaAndMe=''
			}else{
				lPersonalAccidentPaAndMe=lMapPersonalAccidentPaAndMe.PersonalAccidentPaAndMe
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
		String lPersonalAccidentPaOnly=strPersonalAccidentPaOnly.trim()
		if(lPersonalAccidentPaOnly.length()<=0){
			lPersonalAccidentPaOnly=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_PA_ONLY
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentPaOnly','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentPaOnly=this.lTHAElectricMotorCarQuotationResultUtil.inputPersonalAccidentPaOnly(lPersonalAccidentPaOnly)
			if(!lMapPersonalAccidentPaOnly.Result){
				lPersonalAccidentPaOnly=''
			}else{
				lPersonalAccidentPaOnly=lMapPersonalAccidentPaOnly.PersonalAccidentPaOnly
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
		String lPersonalAccidentMeOnly=strPersonalAccidentMeOnly.trim()
		if(lPersonalAccidentMeOnly.length()<=0){
			lPersonalAccidentMeOnly=THARGPAElectricMotorCarQuotationResultType.DEFAULT_PERSONAL_ACCIDENT_ME_ONLY
		}
		try{
			Boolean lResult=false
			lreturn.put('PersonalAccidentMeOnly','')
			lreturn.put('Result',lResult)
			Map lMapPersonalAccidentMeOnly=this.lTHAElectricMotorCarQuotationResultUtil.inputPersonalAccidentMeOnly(lPersonalAccidentMeOnly)
			if(!lMapPersonalAccidentMeOnly.Result){
				lPersonalAccidentMeOnly=''
			}else{
				lPersonalAccidentMeOnly=lMapPersonalAccidentMeOnly.PersonalAccidentMeOnly
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
		String lCarRentalService=strCarRentalService.trim()
		if(lCarRentalService.length()<=0){
			lCarRentalService=THARGPAElectricMotorCarQuotationResultType.DEFAULT_CAR_RENTAL_SERVICE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarRentalService','')
			lreturn.put('Result',lResult)
			Map lMapCarRentalService=this.lTHAElectricMotorCarQuotationResultUtil.inputCarRentalService(lCarRentalService)
			if(!lMapCarRentalService.Result){
				lCarRentalService=''
			}else{
				lCarRentalService=lMapCarRentalService.CarRentalService
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
	public Map inputWallChargerCoverage(String strWallChargerCoverage){
		Map lreturn=[:]
		String lWallChargerCoverage=strWallChargerCoverage.trim()
		if(lWallChargerCoverage.length()<=0){
			lWallChargerCoverage=THARGPAElectricMotorCarQuotationResultType.DEFAULT_WALL_CHARGER_COVERAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('WallChargerCoverage','')
			lreturn.put('Result',lResult)
			Map lMapWallChargerCoverage=this.lTHAElectricMotorCarQuotationResultUtil.inputWallChargerCoverage(lWallChargerCoverage)
			if(!lMapWallChargerCoverage.Result){
				lWallChargerCoverage=''
			}else{
				lWallChargerCoverage=lMapWallChargerCoverage.WallChargerCoverage
			}
			lResult=lWallChargerCoverage.length()>0
			if(lResult){
				lreturn.put('WallChargerCoverage',lWallChargerCoverage)
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
		String lAccessoryAdd=strAccessoryAdd.trim()
		if(lAccessoryAdd.length()<=0){
			lAccessoryAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_ADD
		}
		String lAccessoryCarryBoyAdd=strAccessoryCarryBoyAdd.trim()
		if(lAccessoryCarryBoyAdd.length()<=0){
			lAccessoryCarryBoyAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_ADD
		}
		String lAccessoryCarryBoyOption=strAccessoryCarryBoyOption.trim()
		if(lAccessoryCarryBoyOption.length()<=0){
			lAccessoryCarryBoyOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_CARRY_BOY_OPTION
		}
		String lAccessoryGasFuelingSystemAdd=strAccessoryGasFuelingSystemAdd.trim()
		if(lAccessoryGasFuelingSystemAdd.length()<=0){
			lAccessoryGasFuelingSystemAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_ADD
		}
		String lAccessoryGasFuelingSystemOption=strAccessoryGasFuelingSystemOption.trim()
		if(lAccessoryGasFuelingSystemOption.length()<=0){
			lAccessoryGasFuelingSystemOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_GAS_FUELING_SYSTEM_OPTION
		}
		String lAccessoryBodyKitAdd=strAccessoryBodyKitAdd.trim()
		if(lAccessoryBodyKitAdd.length()<=0){
			lAccessoryBodyKitAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_ADD
		}
		String lAccessoryBodyKitOption=strAccessoryBodyKitOption.trim()
		if(lAccessoryBodyKitOption.length()<=0){
			lAccessoryBodyKitOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_BODY_KIT_OPTION
		}
		String lAccessoryRimsTiresAdd=strAccessoryRimsTiresAdd.trim()
		if(lAccessoryRimsTiresAdd.length()<=0){
			lAccessoryRimsTiresAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_ADD
		}
		String lAccessoryRimsTiresOption=strAccessoryRimsTiresOption.trim()
		if(lAccessoryRimsTiresOption.length()<=0){
			lAccessoryRimsTiresOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_RIMS_TIRES_OPTION
		}
		String lAccessorySolarFilmAdd=strAccessorySolarFilmAdd.trim()
		if(lAccessorySolarFilmAdd.length()<=0){
			lAccessorySolarFilmAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_ADD
		}
		String lAccessorySolarFilmOption=strAccessorySolarFilmOption.trim()
		if(lAccessorySolarFilmOption.length()<=0){
			lAccessorySolarFilmOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_SOLAR_FILM_OPTION
		}
		String lAccessorySuspensionStabilizerSystemAdd=strAccessorySuspensionStabilizerSystemAdd.trim()
		if(lAccessorySuspensionStabilizerSystemAdd.length()<=0){
			lAccessorySuspensionStabilizerSystemAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_ADD
		}
		String lAccessorySuspensionStabilizerSystemOption=strAccessorySuspensionStabilizerSystemOption.trim()
		if(lAccessorySuspensionStabilizerSystemOption.length()<=0){
			lAccessorySuspensionStabilizerSystemOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_SUSPENSION_STABILIZER_SYSTEM_OPTION
		}
		String lAccessoryInVehicleEntertainmentSystemAdd=strAccessoryInVehicleEntertainmentSystemAdd.trim()
		if(lAccessoryInVehicleEntertainmentSystemAdd.length()<=0){
			lAccessoryInVehicleEntertainmentSystemAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_ADD
		}
		String lAccessoryInVehicleEntertainmentSystemOption=strAccessoryInVehicleEntertainmentSystemOption.trim()
		if(lAccessoryInVehicleEntertainmentSystemOption.length()<=0){
			lAccessoryInVehicleEntertainmentSystemOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_IN_VEHICLE_ENTERTAINMENT_SYSTEM_OPTION
		}
		String lAccessoryAirIntakeExhaustSystemAdd=strAccessoryAirIntakeExhaustSystemAdd.trim()
		if(lAccessoryAirIntakeExhaustSystemAdd.length()<=0){
			lAccessoryAirIntakeExhaustSystemAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_ADD
		}
		String lAccessoryAirIntakeExhaustSystemOption=strAccessoryAirIntakeExhaustSystemOption.trim()
		if(lAccessoryAirIntakeExhaustSystemOption.length()<=0){
			lAccessoryAirIntakeExhaustSystemOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_AIR_INTAKE_EXHAUST_SYSTEM_OPTION
		}
		String lAccessoryCarCameraAdd=strAccessoryCarCameraAdd.trim()
		if(lAccessoryCarCameraAdd.length()<=0){
			lAccessoryCarCameraAdd=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_ADD
		}
		String lAccessoryCarCameraOption=strAccessoryCarCameraOption.trim()
		if(lAccessoryCarCameraOption.length()<=0){
			lAccessoryCarCameraOption=THARGPAElectricMotorCarQuotationResultType.DEFAULT_ACCESSORY_CAR_CAMERA_OPTION
		}
		String lAccessoryAmount=''
		String lAccessoryDetail=''
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
			Map lMapAccessoryAdd=this.lTHAElectricMotorCarQuotationResultUtil.inputAccessoryAdd(lAccessoryAdd,lAccessoryCarryBoyAdd,lAccessoryCarryBoyOption,lAccessoryGasFuelingSystemAdd,lAccessoryGasFuelingSystemOption,lAccessoryBodyKitAdd,lAccessoryBodyKitOption,lAccessoryRimsTiresAdd,lAccessoryRimsTiresOption,lAccessorySolarFilmAdd,lAccessorySolarFilmOption,lAccessorySuspensionStabilizerSystemAdd,lAccessorySuspensionStabilizerSystemOption,lAccessoryInVehicleEntertainmentSystemAdd,lAccessoryInVehicleEntertainmentSystemOption,lAccessoryAirIntakeExhaustSystemAdd,lAccessoryAirIntakeExhaustSystemOption,lAccessoryCarCameraAdd,lAccessoryCarCameraOption)
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
		String lQuoteBy=strQuoteBy.trim()
		if(lQuoteBy.length()<=0){
			lQuoteBy=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_BY
		}
		String lQuotePhoneNo=strQuotePhoneNo.trim()
		if(lQuotePhoneNo.length()<=0){
			lQuotePhoneNo=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_PHONE_NO
		}
		String lQuoteEmail=strQuoteEmail.trim()
		if(lQuoteEmail.length()<=0){
			lQuoteEmail=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_EMAIL
		}
		String lQuoteNewsletter=strQuoteNewsletter.trim()
		if(lQuoteNewsletter.length()<=0){
			lQuoteNewsletter=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_NEWSLETTER
		}
		String lQuoteCallMeNow=strQuoteCallMeNow.trim()
		if(lQuoteCallMeNow.length()<=0){
			lQuoteCallMeNow=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_CALL_ME_NOW
		}
		String lQuotePDFDownloadToDo=strQuotePDFDownloadToDo.trim()
		if(lQuotePDFDownloadToDo.length()<=0){
			lQuotePDFDownloadToDo=THARGPAElectricMotorCarQuotationResultType.DEFAULT_QUOTE_PDF_DOWNLOAD_TO_DO
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
			Map lMapQuoteMe=this.lTHAElectricMotorCarQuotationResultUtil.inputQuoteMe(lQuoteBy,lQuotePhoneNo,lQuoteEmail,lQuoteNewsletter,lQuoteCallMeNow,lQuotePDFDownloadToDo)
			if(!lMapQuoteMe.Result){
				lQuoteBy=''
				lQuotePhoneNo=''
				lQuoteEmail=''
				lQuoteNewsletter=''
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
			lResult=lMapQuoteMe.Result
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
			Map lMapPolicyInsurer=this.lTHAElectricMotorCarQuotationResultUtil.inputPolicyInsurer(lPolicyInsurer)
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
			lSalesforceProceedTodo=THARGPAElectricMotorCarQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHAElectricMotorCarQuotationResultUtil.inputSalesforceProceedTodo(lSalesforceProceedTodo)
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
			Map lMapAutomationDataBefore=this.lTHAElectricMotorCarQuotationResultUtil.inputAutomationDataBefore()
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
			lResult=lMapAutomationDataBefore.Result
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
			Map lMapAutomationDataBefore=this.lTHAElectricMotorCarQuotationResultUtil.inputAutomationDataBefore()
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
			lResult=lMapAutomationDataBefore.Result
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
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyBefore=this.lTHAElectricMotorCarQuotationResultUtil.inputSalesforceProceedVerifyBefore(caseOutput)
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
	public Map inputSalesforceProceedVerifyAfter(Map caseOutput,Boolean isPositiveCase,String strQuoteBy){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyAfter=this.lTHAElectricMotorCarQuotationResultUtil.inputSalesforceProceedVerifyAfter(caseOutput,isPositiveCase,strQuoteBy)
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
			lSalesforceProceedRetrieveTodo=THARGPAElectricMotorCarQuotationResultType.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lTHAElectricMotorCarQuotationResultUtil.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
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
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lTHAElectricMotorCarQuotationResultUtil.inputSalesforceProceedRetrieveWebFromUrl(lRetrievePageURL)
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
	public Boolean inputExpectedKumkaCompareButton(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		String lExpectedKumkaCompareButton=targetMap.ExpectedKumkaCompareButton.toString().trim()
		Map lExpectedKumkaCompareButtonList=['1':'Any','2':'No','3':'Yes']
		String lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(lExpectedKumkaCompareButton)
		if(!lExpectedKumkaCompareButtonItem){
			lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(THARGPAElectricMotorCarQuotationResultType.DEFAULT_EXPECTED_KUMKA_COMPARE_BUTTON.toUpperCase())
			lExpectedKumkaCompareButtonItem=lExpectedKumkaCompareButtonList.get(lExpectedKumkaCompareButtonItem)
		}
		String lKumkaCompareToDo=targetMap.KumkaCompareToDo.toString().trim()
		Map lKumkaCompareToDoList=['1':'No','2':'Yes']
		String lKumkaCompareToDoItem=lKumkaCompareToDoList.get(lKumkaCompareToDo)
		if(!lKumkaCompareToDoItem){
			lKumkaCompareToDoItem=lKumkaCompareToDoList.get(THARGPAElectricMotorCarQuotationResultType.DEFAULT_KUMKA_COMPARE_TO_DO.toUpperCase())
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
	public Boolean inputKumkaCompareNow(String strLanguage,String strEmailToSave,String strCallMeBack,String strCallMeBackPhoneNo,Map targetMap){
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
			lKumkaCompareToDo=THARGPAElectricMotorCarQuotationResultType.DEFAULT_KUMKA_COMPARE_TO_DO
		}
		String lKumkaLoginPage=THARGPAElectricMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_URL
		String lLoginUser=THARGPAElectricMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_USER
		String lLoginPassword=THARGPAElectricMotorCarQuotationResultType.DEFAULT_KUMKA_LOGIN_PASSWORD
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
				this.lTHAElectricMotorCarQuotationResultUtil.inputProceedRetrieveWebFromUrl(lKumkaLoginPage)
				this.lTHAElectricMotorCarQuotationResultUtil.inputLoginUserPassword(lLoginUser,lLoginPassword)
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
				this.lTHAElectricMotorCarQuotationResultUtil.waitUntilKumkaPageLoaded()
				this.lTHAElectricMotorCarQuotationResultUtil.closeAskToSaveEmailForm()
				Map lMapKumkaOutboundCardResult=this.lTHAElectricMotorCarQuotationResultUtil.countKumkaOutboundCard()
				if(!lMapKumkaOutboundCardResult.Result){
					lKumkaOutboundCardCompareLinkNumber=''
				}else{
					lKumkaOutboundCardCompareLinkNumber=lMapKumkaOutboundCardResult.KumkaOutboundCardNumber
				}
				lreturn=lreturn&&lMapKumkaOutboundCardResult.Result
				String lCurrentURLText=this.driver.getCurrentUrl().toUpperCase().trim()
				if(lCurrentURLText.length()>0){
					THARGPAElectricMotorCarCoreType.CURRENT_URL_UNDER_PAGE_RESULT_NEW_KUMKA=IGNUemaHelper.checkStringContainString(lCurrentURLText,'/CARDSNEW')
				}
				if(THARGPAElectricMotorCarCoreType.CURRENT_URL_UNDER_PAGE_RESULT_NEW_KUMKA){
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
				this.lTHAElectricMotorCarQuotationResultUtil.inputProceedRetrieveWebFromUrl(lKumkaDefaultSaveQuoteId)
				this.lTHAElectricMotorCarQuotationResultUtil.waitUntilKumkaPageLoaded()
				this.lTHAElectricMotorCarQuotationResultUtil.closeAskToSaveEmailForm()
				lMapKumkaOutboundCardResult.clear()
				lMapKumkaOutboundCardResult=this.lTHAElectricMotorCarQuotationResultUtil.countKumkaOutboundCard()
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
}