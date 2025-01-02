package org.roojai.tha.types.roojaigroundpartneragent.motor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.motorbike.THAMotorBikeQuotationInputUtil
import org.roojai.tha.types.motorbike.THAMotorBikeQuotationInputUtilOld
import org.roojai.tha.types.motorcar.THAMotorCarQuotationInputUtil
import org.roojai.tha.types.motorcar.THAMotorCarQuotationInputUtilOld
public class THARGPAMotorQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lTHAMotorBikeQuotationInputUtil=null
	private def lTHAMotorCarQuotationInputUtil=null
	public THARGPAMotorQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAMotorBikeQuotationInputUtil getlTHAMotorBikeQuotationInputUtil(){
		return this.lTHAMotorBikeQuotationInputUtil
	}
	private void setlTHAMotorBikeQuotationInputUtil(THAMotorBikeQuotationInputUtil newlTHAMotorBikeQuotationInputUtil){
		//Do Nothing
		//this.lTHAMotorBikeQuotationInputUtil=newlTHAMotorBikeQuotationInputUtil
	}
	private THAMotorCarQuotationInputUtil getlTHAMotorCarQuotationInputUtil(){
		return this.lTHAMotorCarQuotationInputUtil
	}
	private void setlTHAMotorCarQuotationInputUtil(THAMotorCarQuotationInputUtil newlTHAMotorCarQuotationInputUtil){
		//Do Nothing
		//this.lTHAMotorCarQuotationInputUtil=newlTHAMotorCarQuotationInputUtil
	}
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			Boolean lIsOK1=false
			Boolean lIsOK2=false
			String lTagFormLoading=''
			String lLocatorFormLoading=''
			lTagFormLoading='loading'
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
			lLocatorFormLoading='#myPleaseWait'
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
			lreturn=lIsOK1||lIsOK2
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean waitUntilTransactedPolicy(){
		Boolean lreturn=false
		try{
			String lLocatorCloseButton='.btn-close'
			WebElement lElementCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCloseButton)
			if(lElementCloseButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCloseButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCloseButton)
			}
			this.inputGroundPartnerAgentLanguage('1')
			this.inputGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo('Yes')
			this.inputGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo('Yes','11111')
			this.inputGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo('Yes','Test')
			this.inputGroundPartnerAgentMenuRenewalReportFilterPhoneToDo('Yes','')
			this.inputGroundPartnerAgentMenuRenewalReportFilterEmailToDo('Yes','')
			this.inputGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo('Yes','')
			this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo('Yes','No')
			lreturn=true
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean checkHandShake(){
		Boolean lreturn=false
		try{
			String lTagHandShake='handshake'
			String lLocatorHandShake=IGNUemaHelper.getTagDataSeleniumKey(lTagHandShake)
			WebElement lElementHandShake=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHandShake)
			if(!lElementHandShake){
				return lreturn
			}else{
				lreturn=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHandShake)
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
	public Boolean inputInput(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lGroundPartnerAgentLoginToDo=caseInput.GroundPartnerAgentLoginToDo.toString().trim()
		String lGroundPartnerAgentLoginMethod=caseInput.GroundPartnerAgentLoginMethod.toString().trim()
		String lGroundPartnerAgentAccountSource=caseInput.GroundPartnerAgentAccountSource.toString().trim()
		String lGroundPartnerAgentUrlProductSelect=caseInput.GroundPartnerAgentUrlProductSelect.toString().trim()
		String lGroundPartnerAgentUser=caseInput.GroundPartnerAgentUser.toString().trim()
		String lGroundPartnerAgentPassword=caseInput.GroundPartnerAgentPassword.toString().trim()
		String lGroundPartnerAgentLanguage=caseInput.GroundPartnerAgentLanguage.toString().trim()
		String lGroundPartnerAgentIsMotorBike=caseInput.GroundPartnerAgentIsMotorBike.toString().trim()
		String lGroundPartnerAgentRoojaiPurchaseToDo=caseInput.GroundPartnerAgentRoojaiPurchaseToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportToDo=caseInput.GroundPartnerAgentMenuRenewalReportToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=caseInput.GroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=caseInput.GroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=caseInput.GroundPartnerAgentMenuRenewalReportFilterDateTypeBy.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=caseInput.GroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=caseInput.GroundPartnerAgentMenuRenewalReportFilterOpportunityNumber.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=caseInput.GroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy=caseInput.GroundPartnerAgentMenuRenewalReportFilterHolderNameBy.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=caseInput.GroundPartnerAgentMenuRenewalReportFilterPhoneToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber=caseInput.GroundPartnerAgentMenuRenewalReportFilterPhoneNumber.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterEmailToDo=caseInput.GroundPartnerAgentMenuRenewalReportFilterEmailToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterEmailBy=caseInput.GroundPartnerAgentMenuRenewalReportFilterEmailBy.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=caseInput.GroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=caseInput.GroundPartnerAgentMenuRenewalReportFilterCarPlateNumber.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth.toString().trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=caseInput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear.toString().trim()
		String lSalesforceProceedToDo=caseInput.SalesforceProceedToDo.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lCarMake=caseInput.CarMake.toString().trim()
		String lCarModel=caseInput.CarModel.toString().trim()
		String lCarYear=caseInput.CarYear.toString().trim()
		String lSubmodel=caseInput.Submodel.toString().trim()
		String lGenderMain=caseInput.GenderMain.toString().trim()
		String lMaritalStatus=caseInput.MaritalStatus.toString().trim()
		String lBirthDateMain=caseInput.BirthDateMain.toString().trim()
		String lYearDriving=caseInput.YearDriving.toString().trim()
		String lClaimsNo=caseInput.ClaimsNo.toString().trim()
		String lVehicleUsage=caseInput.VehicleUsage.toString().trim()
		String lVehicleUsageForCommercial=caseInput.VehicleUsageForCommercial.toString().trim()
		String lVehicleUsageDriveToWork=caseInput.VehicleUsageDriveToWork.toString().trim()
		String lVehicleUsageDriveToWorkOften=caseInput.VehicleUsageDriveToWorkOften.toString().trim()
		String lTaxiOrVehicleForHire=caseInput.TaxiOrVehicleForHire.toString().trim()
		String lRentalVehicle=caseInput.RentalVehicle.toString().trim()
		String lGoodsTransportVehicle=caseInput.GoodsTransportVehicle.toString().trim()
		String lLogisticsOrCourierCompany=caseInput.LogisticsOrCourierCompany.toString().trim()
		String lGoodsTransportRoute=caseInput.GoodsTransportRoute.toString().trim()
		String lPostalCode=caseInput.PostalCode.toString().trim()
		String lOdometerReading=caseInput.OdometerReading.toString().trim()
		String lDeclaredNcb=caseInput.DeclaredNcb.toString().trim()
		String lCarCamera=caseInput.CarCamera.toString().trim()
		String lUnderFinancing=caseInput.UnderFinancing.toString().trim()
		String lTentative=caseInput.Tentative.toString().trim()
		String lAlcoholFree=caseInput.AlcoholFree.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lGroundPartnerAgentSkipLoginUrl=''
		String lPolicyInsurer=''
		String lGroundPartnerAgentRenewalReportDataRange=''
		String lGroundPartnerAgentRenewalReportSearchDate=''
		String lGroundPartnerAgentRenewalReportCardSelectedOpportunity=''
		String lGroundPartnerAgentRenewalReportCardSelectedDetail=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanType=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanGarage=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanExcess=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanDriver=''
		String lGroundPartnerAgentRenewalReportCardSelectedTpbi=''
		String lGroundPartnerAgentRenewalReportCardSelectedPaAndMe=''
		String lGroundPartnerAgentRenewalReportCardSelectedPaOnly=''
		String lGroundPartnerAgentRenewalReportCardSelectedMeOnly=''
		String lGroundPartnerAgentRenewalReportCardSelectedCompulsory=''
		String lGroundPartnerAgentRenewalReportCardSelectedRsa=''
		String lGroundPartnerAgentRenewalReportCardSelectedCrs=''
		String lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail=''
		String lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult=''
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		String lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=''
		String lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyResult=''
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
			Map lMapGroundPartnerAgentLogin=this.inputGroundPartnerAgentLogin(lGroundPartnerAgentUser,lGroundPartnerAgentPassword)
			if(!lMapGroundPartnerAgentLogin.Result){
				lGroundPartnerAgentUser=''
				lGroundPartnerAgentPassword=''
			}else{
				lGroundPartnerAgentUser=lMapGroundPartnerAgentLogin.GroundPartnerAgentUser
				lGroundPartnerAgentPassword=lMapGroundPartnerAgentLogin.GroundPartnerAgentPassword
			}
			THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_USER=lGroundPartnerAgentUser
			THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_PASSWORD=lGroundPartnerAgentPassword
			caseOutput.GroundPartnerAgentUser=lGroundPartnerAgentUser
			caseOutput.GroundPartnerAgentPassword=IGNUemaHelper.convertStringToPassword(lGroundPartnerAgentPassword)
			if(lGroundPartnerAgentUser.length()<=0){
				return lreturn
			}
			if(lGroundPartnerAgentPassword.length()<=0){
				return lreturn
			}
			Map lMapGroundPartnerAgentLanguage=this.inputGroundPartnerAgentLanguage(lGroundPartnerAgentLanguage)
			if(!lMapGroundPartnerAgentLanguage.Result){
				lGroundPartnerAgentLanguage=''
			}else{
				lGroundPartnerAgentLanguage=lMapGroundPartnerAgentLanguage.GroundPartnerAgentLanguage
			}
			caseOutput.GroundPartnerAgentLanguage=lGroundPartnerAgentLanguage
			if(lGroundPartnerAgentLanguage.length()<=0){
				return lreturn
			}
			Map lMapGroundPartnerAgentMenuRenewalReportToDo=this.inputGroundPartnerAgentMenuRenewalReportToDo(lGroundPartnerAgentMenuRenewalReportToDo)
			if(!lMapGroundPartnerAgentMenuRenewalReportToDo.Result){
				lGroundPartnerAgentMenuRenewalReportToDo=''
			}else{
				lGroundPartnerAgentMenuRenewalReportToDo=lMapGroundPartnerAgentMenuRenewalReportToDo.GroundPartnerAgentMenuRenewalReportToDo
			}
			caseOutput.GroundPartnerAgentMenuRenewalReportToDo=lGroundPartnerAgentMenuRenewalReportToDo
			if(lGroundPartnerAgentMenuRenewalReportToDo.length()<=0){
				return lreturn
			}
			Boolean lIsGroundPartnerAgentMenuRenewalReportToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportToDo)
			if(lIsGroundPartnerAgentMenuRenewalReportToDo){
				Map lMapGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=this.inputGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo(lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo)
				if(!lMapGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.Result){
					lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=''
				}else{
					lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=lMapGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.GroundPartnerAgentMenuRenewalReportAdvanceFilterToDo
				}
				caseOutput.GroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo
				if(lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.length()<=0){
					return lreturn
				}
				Boolean lIsGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo)
				if(lIsGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo){
					Map lMapGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=this.inputGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo(lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo,lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy)
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.Result){
						lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=''
						lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=''
					}else{
						lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=lMapGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.GroundPartnerAgentMenuRenewalReportFilterDateTypeToDo
						lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=lMapGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.GroundPartnerAgentMenuRenewalReportFilterDateTypeBy
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterDateTypeBy=lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.Result){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=this.inputGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo(lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo,lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber)
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.Result){
						lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=''
						lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=''
					}else{
						lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=lMapGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.GroundPartnerAgentMenuRenewalReportFilterOpportunityToDo
						lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=lMapGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.GroundPartnerAgentMenuRenewalReportFilterOpportunityNumber
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.Result){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=this.inputGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo(lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo,lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy)
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.Result){
						lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=''
						lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy=''
					}else{
						lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=lMapGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.GroundPartnerAgentMenuRenewalReportFilterHolderNameToDo
						lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy=lMapGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.GroundPartnerAgentMenuRenewalReportFilterHolderNameBy
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterHolderNameBy=lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.Result){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=this.inputGroundPartnerAgentMenuRenewalReportFilterPhoneToDo(lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo,lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber)
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.Result){
						lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=''
						lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber=''
					}else{
						lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=lMapGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.GroundPartnerAgentMenuRenewalReportFilterPhoneToDo
						lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber=lMapGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.GroundPartnerAgentMenuRenewalReportFilterPhoneNumber
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterPhoneToDo=lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterPhoneNumber=lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.Result){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportFilterEmailToDo=this.inputGroundPartnerAgentMenuRenewalReportFilterEmailToDo(lGroundPartnerAgentMenuRenewalReportFilterEmailToDo,lGroundPartnerAgentMenuRenewalReportFilterEmailBy)
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterEmailToDo.Result){
						lGroundPartnerAgentMenuRenewalReportFilterEmailToDo=''
						lGroundPartnerAgentMenuRenewalReportFilterEmailBy=''
					}else{
						lGroundPartnerAgentMenuRenewalReportFilterEmailToDo=lMapGroundPartnerAgentMenuRenewalReportFilterEmailToDo.GroundPartnerAgentMenuRenewalReportFilterEmailToDo
						lGroundPartnerAgentMenuRenewalReportFilterEmailBy=lMapGroundPartnerAgentMenuRenewalReportFilterEmailToDo.GroundPartnerAgentMenuRenewalReportFilterEmailBy
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterEmailToDo=lGroundPartnerAgentMenuRenewalReportFilterEmailToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterEmailBy=lGroundPartnerAgentMenuRenewalReportFilterEmailBy
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterEmailToDo.Result){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=this.inputGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo(lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo,lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber)
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.Result){
						lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=''
						lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=''
					}else{
						lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=lMapGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.GroundPartnerAgentMenuRenewalReportFilterCarPlateToDo
						lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=lMapGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.GroundPartnerAgentMenuRenewalReportFilterCarPlateNumber
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber
					if(!lMapGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.Result){
						return lreturn
					}
				}
				Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo,lGroundPartnerAgentIsMotorBike)
				if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=''
					lGroundPartnerAgentIsMotorBike=''
					lGroundPartnerAgentRenewalReportDataRange=''
					lGroundPartnerAgentRenewalReportSearchDate=''
					lGroundPartnerAgentRenewalReportCardSelectedOpportunity=''
					lGroundPartnerAgentRenewalReportCardSelectedDetail=''
				}else{
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailToDo
					lGroundPartnerAgentIsMotorBike=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.GroundPartnerAgentIsMotorBike
					lGroundPartnerAgentRenewalReportDataRange=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.GroundPartnerAgentRenewalReportDataRange
					lGroundPartnerAgentRenewalReportSearchDate=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.GroundPartnerAgentRenewalReportSearchDate
					lGroundPartnerAgentRenewalReportCardSelectedOpportunity=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.GroundPartnerAgentRenewalReportCardSelectedOpportunity
					lGroundPartnerAgentRenewalReportCardSelectedDetail=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.GroundPartnerAgentRenewalReportCardSelectedDetail
				}
				caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo
				caseOutput.GroundPartnerAgentIsMotorBike=lGroundPartnerAgentIsMotorBike
				caseOutput.GroundPartnerAgentRenewalReportDataRange=lGroundPartnerAgentRenewalReportDataRange
				caseOutput.GroundPartnerAgentRenewalReportSearchDate=lGroundPartnerAgentRenewalReportSearchDate
				caseOutput.GroundPartnerAgentRenewalReportCardSelectedOpportunity=lGroundPartnerAgentRenewalReportCardSelectedOpportunity
				caseOutput.GroundPartnerAgentRenewalReportCardSelectedDetail=lGroundPartnerAgentRenewalReportCardSelectedDetail
				if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
					return lreturn
				}
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo)
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo){
					Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo)
					if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.Result){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=''
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail=''
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult=''
					}else{
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo
					caseOutput.GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail=lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail
					caseOutput.GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult=lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult
					if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.length()<=0){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo)
					if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.Result){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=''
					}else{
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo
					if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.length()<=0){
						return lreturn
					}
					Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo)
					if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo){
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=''
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
					}
					Map lMapGroundPartnerAgentRenewalReportCardSelected=this.inputGroundPartnerAgentRenewalReportCardSelected()
					if(!lMapGroundPartnerAgentRenewalReportCardSelected.Result){
						lGroundPartnerAgentRenewalReportCardSelectedPlanType=''
						lGroundPartnerAgentRenewalReportCardSelectedPlanGarage=''
						lGroundPartnerAgentRenewalReportCardSelectedPlanExcess=''
						lGroundPartnerAgentRenewalReportCardSelectedPlanDriver=''
						lGroundPartnerAgentRenewalReportCardSelectedTpbi=''
						lGroundPartnerAgentRenewalReportCardSelectedPaAndMe=''
						lGroundPartnerAgentRenewalReportCardSelectedPaOnly=''
						lGroundPartnerAgentRenewalReportCardSelectedMeOnly=''
						lGroundPartnerAgentRenewalReportCardSelectedCompulsory=''
						lGroundPartnerAgentRenewalReportCardSelectedRsa=''
						lGroundPartnerAgentRenewalReportCardSelectedCrs=''
					}else{
						lGroundPartnerAgentRenewalReportCardSelectedPlanType=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedPlanType
						lGroundPartnerAgentRenewalReportCardSelectedPlanGarage=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedPlanGarage
						lGroundPartnerAgentRenewalReportCardSelectedPlanExcess=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedPlanExcess
						lGroundPartnerAgentRenewalReportCardSelectedPlanDriver=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedPlanDriver
						lGroundPartnerAgentRenewalReportCardSelectedTpbi=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedTpbi
						lGroundPartnerAgentRenewalReportCardSelectedPaAndMe=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedPaAndMe
						lGroundPartnerAgentRenewalReportCardSelectedPaOnly=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedPaOnly
						lGroundPartnerAgentRenewalReportCardSelectedMeOnly=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedMeOnly
						lGroundPartnerAgentRenewalReportCardSelectedCompulsory=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedCompulsory
						lGroundPartnerAgentRenewalReportCardSelectedRsa=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedRsa
						lGroundPartnerAgentRenewalReportCardSelectedCrs=lMapGroundPartnerAgentRenewalReportCardSelected.GroundPartnerAgentRenewalReportCardSelectedCrs
					}
					caseOutput.GroundPartnerAgentRenewalReportCardSelectedPlanType=lGroundPartnerAgentRenewalReportCardSelectedPlanType
					caseOutput.GroundPartnerAgentRenewalReportCardSelectedPlanGarage=lGroundPartnerAgentRenewalReportCardSelectedPlanGarage
					caseOutput.GroundPartnerAgentRenewalReportCardSelectedPlanExcess=lGroundPartnerAgentRenewalReportCardSelectedPlanExcess
					caseOutput.GroundPartnerAgentRenewalReportCardSelectedPlanDriver=lGroundPartnerAgentRenewalReportCardSelectedPlanDriver
					caseOutput.GroundPartnerAgentRenewalReportCardSelectedTpbi=lGroundPartnerAgentRenewalReportCardSelectedTpbi
					caseOutput.GroundPartnerAgentRenewalReportCardSelectedPaAndMe=lGroundPartnerAgentRenewalReportCardSelectedPaAndMe
					caseOutput.lGroundPartnerAgentRenewalReportCardSelectedPaOnly=lGroundPartnerAgentRenewalReportCardSelectedPaOnly
					caseOutput.lGroundPartnerAgentRenewalReportCardSelectedMeOnly=lGroundPartnerAgentRenewalReportCardSelectedMeOnly
					caseOutput.lGroundPartnerAgentRenewalReportCardSelectedCompulsory=lGroundPartnerAgentRenewalReportCardSelectedCompulsory
					caseOutput.lGroundPartnerAgentRenewalReportCardSelectedRsa=lGroundPartnerAgentRenewalReportCardSelectedRsa
					caseOutput.lGroundPartnerAgentRenewalReportCardSelectedCrs=lGroundPartnerAgentRenewalReportCardSelectedCrs
					if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
						return lreturn
					}
					Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink)
					if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.Result){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=''
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=''
					}else{
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink
					}
					caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo
					caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink
					if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
						return lreturn
					}
					Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo)
					if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo){
						Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod)
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod.Result){
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=''
						}else{
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod
						}
						caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod
						if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.Result){
							return lreturn
						}
						Boolean lIsRenewalPaymentSuccess=false
						switch(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod){
							case '2':
								Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase)
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.Result){
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase=''
									lGroundPartnerAgentRenewalReportPremiumYearly=''
									lGroundPartnerAgentRenewalReportPremiumDeposit=''
									lGroundPartnerAgentRenewalReportPremiumMonthly=''
									lGroundPartnerAgentRenewalReportPremiumInstalment=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
								}else{
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase
									lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumYearly
									lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumDeposit
									lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumMonthly
									lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumInstalment
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								}
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase
								caseOutput.GroundPartnerAgentRenewalReportPremiumYearly=lGroundPartnerAgentRenewalReportPremiumYearly
								caseOutput.GroundPartnerAgentRenewalReportPremiumDeposit=lGroundPartnerAgentRenewalReportPremiumDeposit
								caseOutput.GroundPartnerAgentRenewalReportPremiumMonthly=lGroundPartnerAgentRenewalReportPremiumMonthly
								caseOutput.GroundPartnerAgentRenewalReportPremiumInstalment=lGroundPartnerAgentRenewalReportPremiumInstalment
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount=lGroundPartnerAgentRenewalReportPremiumNoDepositAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal=lGroundPartnerAgentRenewalReportPremiumNoDepositTotal
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.Result){
									return lreturn
								}
								lIsRenewalPaymentSuccess=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB.Result
								break
							case '3':
								Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy)
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.Result){
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=''
									lGroundPartnerAgentRenewalReportPremiumYearly=''
									lGroundPartnerAgentRenewalReportPremiumDeposit=''
									lGroundPartnerAgentRenewalReportPremiumMonthly=''
									lGroundPartnerAgentRenewalReportPremiumInstalment=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
								}else{
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
									lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumYearly
									lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumDeposit
									lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumMonthly
									lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumInstalment
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								}
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
								caseOutput.GroundPartnerAgentRenewalReportPremiumYearly=lGroundPartnerAgentRenewalReportPremiumYearly
								caseOutput.GroundPartnerAgentRenewalReportPremiumDeposit=lGroundPartnerAgentRenewalReportPremiumDeposit
								caseOutput.GroundPartnerAgentRenewalReportPremiumMonthly=lGroundPartnerAgentRenewalReportPremiumMonthly
								caseOutput.GroundPartnerAgentRenewalReportPremiumInstalment=lGroundPartnerAgentRenewalReportPremiumInstalment
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount=lGroundPartnerAgentRenewalReportPremiumNoDepositAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal=lGroundPartnerAgentRenewalReportPremiumNoDepositTotal
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.Result){
									return lreturn
								}
								lIsRenewalPaymentSuccess=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR.Result
								break
							case '4':
								Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase)
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.Result){
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=''
									lGroundPartnerAgentRenewalReportPremiumYearly=''
									lGroundPartnerAgentRenewalReportPremiumDeposit=''
									lGroundPartnerAgentRenewalReportPremiumMonthly=''
									lGroundPartnerAgentRenewalReportPremiumInstalment=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
								}else{
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase
									lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumYearly
									lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumDeposit
									lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumMonthly
									lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumInstalment
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								}
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase
								caseOutput.GroundPartnerAgentRenewalReportPremiumYearly=lGroundPartnerAgentRenewalReportPremiumYearly
								caseOutput.GroundPartnerAgentRenewalReportPremiumDeposit=lGroundPartnerAgentRenewalReportPremiumDeposit
								caseOutput.GroundPartnerAgentRenewalReportPremiumMonthly=lGroundPartnerAgentRenewalReportPremiumMonthly
								caseOutput.GroundPartnerAgentRenewalReportPremiumInstalment=lGroundPartnerAgentRenewalReportPremiumInstalment
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount=lGroundPartnerAgentRenewalReportPremiumNoDepositAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal=lGroundPartnerAgentRenewalReportPremiumNoDepositTotal
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.Result){
									return lreturn
								}
								lIsRenewalPaymentSuccess=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney.Result
								break
							case '5':
								Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase)
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.Result){
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=''
									lGroundPartnerAgentRenewalReportPremiumYearly=''
									lGroundPartnerAgentRenewalReportPremiumDeposit=''
									lGroundPartnerAgentRenewalReportPremiumMonthly=''
									lGroundPartnerAgentRenewalReportPremiumInstalment=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
								}else{
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase
									lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumYearly
									lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumDeposit
									lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumMonthly
									lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumInstalment
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								}
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase
								caseOutput.GroundPartnerAgentRenewalReportPremiumYearly=lGroundPartnerAgentRenewalReportPremiumYearly
								caseOutput.GroundPartnerAgentRenewalReportPremiumDeposit=lGroundPartnerAgentRenewalReportPremiumDeposit
								caseOutput.GroundPartnerAgentRenewalReportPremiumMonthly=lGroundPartnerAgentRenewalReportPremiumMonthly
								caseOutput.GroundPartnerAgentRenewalReportPremiumInstalment=lGroundPartnerAgentRenewalReportPremiumInstalment
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount=lGroundPartnerAgentRenewalReportPremiumNoDepositAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal=lGroundPartnerAgentRenewalReportPremiumNoDepositTotal
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.Result){
									return lreturn
								}
								lIsRenewalPaymentSuccess=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay.Result
								break
							default:
								Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase)
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.Result){
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=''
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=''
									lGroundPartnerAgentRenewalReportPremiumYearly=''
									lGroundPartnerAgentRenewalReportPremiumDeposit=''
									lGroundPartnerAgentRenewalReportPremiumMonthly=''
									lGroundPartnerAgentRenewalReportPremiumInstalment=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
								}else{
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear
									lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase
									lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumYearly
									lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumDeposit
									lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumMonthly
									lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumInstalment
									lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
									lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
									lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
									lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								}
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear
								caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase
								caseOutput.GroundPartnerAgentRenewalReportPremiumYearly=lGroundPartnerAgentRenewalReportPremiumYearly
								caseOutput.GroundPartnerAgentRenewalReportPremiumDeposit=lGroundPartnerAgentRenewalReportPremiumDeposit
								caseOutput.GroundPartnerAgentRenewalReportPremiumMonthly=lGroundPartnerAgentRenewalReportPremiumMonthly
								caseOutput.GroundPartnerAgentRenewalReportPremiumInstalment=lGroundPartnerAgentRenewalReportPremiumInstalment
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount=lGroundPartnerAgentRenewalReportPremiumNoDepositAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal=lGroundPartnerAgentRenewalReportPremiumNoDepositTotal
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount
								caseOutput.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal
								if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.Result){
									return lreturn
								}
								lIsRenewalPaymentSuccess=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc.Result
								break
						}
						this.waitUntilTransactedPolicy()
						Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedToDo)
						Boolean lIsVerifyPassed=false
						if(lIsRenewalPaymentSuccess){
							lreturn=lIsRenewalPaymentSuccess
							if(lIsSalesforceProceedTodo){
								Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_RENEWAL_REPORT_CARD_SELECTED_OPPORTUNITY,caseOutput)
								if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
									lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_RENEWAL_REPORT_CARD_SELECTED_OPPORTUNITY,caseOutput)
								}
								lIsVerifyPassed=IGNUemaHelper.convertBooleanToString(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result)
								caseOutput.ActualResult=lIsVerifyPassed
								if(lIsVerifyPassed){
									Map lMapSalesforceProceedVerify=this.inputSalesforceProceedVerify(caseOutput)
									lActualResult=IGNUemaHelper.convertBooleanToString(lMapSalesforceProceedVerify.Result)
									caseOutput.ActualResult=lActualResult
									if(lMapSalesforceProceedVerify.Result){
										lreturn=lMapSalesforceProceedVerify.Result
									}
									if(!lMapSalesforceProceedVerify.Result){
										return lreturn
									}
								}
							}
							THARGPAMotorCoreType.CURRENT_INPUT_RESULT=true
						}
						if(!lIsRenewalPaymentSuccess){
							caseOutput.ActualResult='No'
							return lreturn
						}
					}
				}
			}
			Map lMapGroundPartnerAgentRoojaiPurchaseToDo=this.inputGroundPartnerAgentRoojaiPurchaseToDo(lGroundPartnerAgentRoojaiPurchaseToDo)
			if(!lMapGroundPartnerAgentRoojaiPurchaseToDo.Result){
				lGroundPartnerAgentRoojaiPurchaseToDo=''
			}else{
				lGroundPartnerAgentRoojaiPurchaseToDo=lMapGroundPartnerAgentRoojaiPurchaseToDo.GroundPartnerAgentRoojaiPurchaseToDo
			}
			caseOutput.GroundPartnerAgentRoojaiPurchaseToDo=lGroundPartnerAgentRoojaiPurchaseToDo
			if(!lMapGroundPartnerAgentRoojaiPurchaseToDo.Result){
				return lreturn
			}
			Boolean lIsGroundPartnerAgentRoojaiPurchaseToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentRoojaiPurchaseToDo)
			if(lIsGroundPartnerAgentRoojaiPurchaseToDo){
				Map lMapGroundPartnerAgentLoginToDo=this.inputGroundPartnerAgentLoginToDo(lGroundPartnerAgentLoginToDo)
				if(!lMapGroundPartnerAgentLoginToDo.Result){
					lGroundPartnerAgentLoginToDo=''
				}else{
					lGroundPartnerAgentLoginToDo=lMapGroundPartnerAgentLoginToDo.GroundPartnerAgentLoginToDo
				}
				caseOutput.GroundPartnerAgentLoginToDo=lGroundPartnerAgentLoginToDo
				if(lGroundPartnerAgentLoginToDo.length()<=0){
					return lreturn
				}
				Boolean lIsGroundPartnerAgentLoginToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentLoginToDo)
				if(lIsGroundPartnerAgentLoginToDo){
					Map lMapGroundPartnerAgentLoginMethod=this.inputGroundPartnerAgentLoginMethod(lGroundPartnerAgentLoginMethod,lGroundPartnerAgentAccountSource,lGroundPartnerAgentUrlProductSelect,lGroundPartnerAgentLanguage,lGroundPartnerAgentIsMotorBike)
					if(!lMapGroundPartnerAgentLoginMethod.Result){
						lGroundPartnerAgentLoginMethod=''
						lGroundPartnerAgentAccountSource=''
						lGroundPartnerAgentUrlProductSelect=''
						lGroundPartnerAgentLanguage=''
						lGroundPartnerAgentIsMotorBike=''
						lGroundPartnerAgentSkipLoginUrl=''
					}else{
						lGroundPartnerAgentLoginMethod=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentLoginMethod
						lGroundPartnerAgentAccountSource=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentAccountSource
						lGroundPartnerAgentUrlProductSelect=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentUrlProductSelect
						lGroundPartnerAgentLanguage=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentLanguage
						lGroundPartnerAgentIsMotorBike=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentIsMotorBike
						lGroundPartnerAgentSkipLoginUrl=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentSkipLoginUrl
					}
					caseOutput.GroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethod
					caseOutput.GroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSource
					caseOutput.GroundPartnerAgentUrlProductSelect=lGroundPartnerAgentUrlProductSelect
					caseOutput.GroundPartnerAgentLanguage=lGroundPartnerAgentLanguage
					caseOutput.GroundPartnerAgentIsMotorBike=lGroundPartnerAgentIsMotorBike
					caseOutput.GroundPartnerAgentSkipLoginUrl=lGroundPartnerAgentSkipLoginUrl
					if(!lMapGroundPartnerAgentLoginMethod.Result){
						return lreturn
					}
					//Check QuoteApplication
					THARGPAMotorCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION=IGNUemaHelper.checkWebDriverURLTargetUnderQuoteApplication(this.driver)
					if(THARGPAMotorCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION){
						if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
							this.lTHAMotorBikeQuotationInputUtil=new THAMotorBikeQuotationInputUtil(this.driver,this.selenium)
						}else{
							this.lTHAMotorCarQuotationInputUtil=new THAMotorCarQuotationInputUtil(this.driver,this.selenium)
						}
					}else{
						if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
							this.lTHAMotorBikeQuotationInputUtil=new THAMotorBikeQuotationInputUtilOld(this.driver,this.selenium)
						}else{
							this.lTHAMotorCarQuotationInputUtil=new THAMotorCarQuotationInputUtilOld(this.driver,this.selenium)
						}
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
						}
					}
					if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
						if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
							switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
								case 'A':
									this.checkHandShake()
									Map lMapLanguage=this.inputLanguage(lLanguage)
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(3)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(5)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(8)
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
									Map lMapSubmodel=this.inputSubmodel(lSubmodel)
									if(!lMapSubmodel.Result){
										lSubmodel=''
									}else{
										lSubmodel=lMapSubmodel.Submodel
									}
									caseOutput.Submodel=lSubmodel
									if(lSubmodel.length()<=0){
										return lreturn
									}
									Map lMapCarCamera=this.inputCarCamera(lCarCamera)
									if(!lMapCarCamera.Result){
										lCarCamera=''
									}else{
										lCarCamera=lMapCarCamera.CarCamera
									}
									caseOutput.CarCamera=lCarCamera
									if(lCarCamera.length()<=0){
										return lreturn
									}
									Map lMapOdometerReading=this.inputOdometerReading(lOdometerReading)
									if(!lMapOdometerReading.Result){
										lOdometerReading=''
									}else{
										lOdometerReading=lMapOdometerReading.OdometerReading
									}
									caseOutput.OdometerReading=lOdometerReading
									if(lOdometerReading.length()<=0){
										return lreturn
									}
									Map lMapGenderMainMaritalStatus=this.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
									if(!lMapGenderMainMaritalStatus.Result){
										lGenderMain=''
										lMaritalStatus=''
									}else{
										lGenderMain=lMapGenderMainMaritalStatus.GenderMain
										lMaritalStatus=lMapGenderMainMaritalStatus.MaritalStatus
									}
									caseOutput.GenderMain=lGenderMain
									caseOutput.MaritalStatus=lMaritalStatus
									if(!lMapGenderMainMaritalStatus.Result){
										return lreturn
									}
									Map lMapBirthDateMain=this.inputBirthDateMain(lBirthDateMain)
									if(!lMapBirthDateMain.Result){
										lBirthDateMain=''
									}else{
										lBirthDateMain=lMapBirthDateMain.BirthDateMain
									}
									caseOutput.BirthDateMain=lBirthDateMain
									if(lBirthDateMain.length()<=0){
										return lreturn
									}
									Map lMapYearDriving=this.inputYearDriving(lYearDriving)
									if(!lMapYearDriving.Result){
										lYearDriving=''
									}else{
										lYearDriving=lMapYearDriving.YearDriving
									}
									caseOutput.YearDriving=lYearDriving
									if(lYearDriving.length()<=0){
										return lreturn
									}
									Map lMapClaimsNo=this.inputClaimsNo(lClaimsNo)
									if(!lMapClaimsNo.Result){
										lClaimsNo=''
									}else{
										lClaimsNo=lMapClaimsNo.ClaimsNo
									}
									caseOutput.ClaimsNo=lClaimsNo
									if(lClaimsNo.length()<=0){
										return lreturn
									}
									Map lMapPostalCode=this.inputPostalCode(lPostalCode)
									if(!lMapPostalCode.Result){
										lPostalCode=''
									}else{
										lPostalCode=lMapPostalCode.PostalCode
									}
									caseOutput.PostalCode=lPostalCode
									if(lPostalCode.length()<=0){
										return lreturn
									}
									Map lMapDeclaredNcb=this.inputDeclaredNcb(lDeclaredNcb)
									if(!lMapDeclaredNcb.Result){
										lDeclaredNcb=''
									}else{
										lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
									}
									caseOutput.DeclaredNcb=lDeclaredNcb
									if(lDeclaredNcb.length()<=0){
										return lreturn
									}
									Map lMapVehicleUsage=this.inputVehicleUsage(lVehicleUsage)
									if(!lMapVehicleUsage.Result){
										lVehicleUsage=''
									}else{
										lVehicleUsage=lMapVehicleUsage.VehicleUsage
									}
									caseOutput.VehicleUsage=lVehicleUsage
									if(lVehicleUsage.length()<=0){
										return lreturn
									}
									caseOutput.VehicleUsageForCommercial='No Option'
									caseOutput.VehicleUsageDriveToWork='No Option'
									caseOutput.VehicleUsageDriveToWorkOften='No Option'
									Map lMapTaxiOrVehicleForHire=this.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
									if(!lMapTaxiOrVehicleForHire.Result){
										lTaxiOrVehicleForHire=''
									}else{
										lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
									}
									caseOutput.TaxiOrVehicleForHire=lTaxiOrVehicleForHire
									if(lTaxiOrVehicleForHire.length()<=0){
										return lreturn
									}
									Map lMapRentalVehicle=this.inputRentalVehicle(lRentalVehicle)
									if(!lMapRentalVehicle.Result){
										lRentalVehicle=''
									}else{
										lRentalVehicle=lMapRentalVehicle.RentalVehicle
									}
									caseOutput.RentalVehicle=lRentalVehicle
									if(lRentalVehicle.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportVehicle=this.inputGoodsTransportVehicle(lGoodsTransportVehicle)
									if(!lMapGoodsTransportVehicle.Result){
										lGoodsTransportVehicle=''
									}else{
										lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
									}
									caseOutput.GoodsTransportVehicle=lGoodsTransportVehicle
									if(lGoodsTransportVehicle.length()<=0){
										return lreturn
									}
									Map lMapLogisticsOrCourierCompany=this.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
									if(!lMapLogisticsOrCourierCompany.Result){
										lLogisticsOrCourierCompany=''
									}else{
										lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
									}
									caseOutput.LogisticsOrCourierCompany=lLogisticsOrCourierCompany
									if(lLogisticsOrCourierCompany.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportRoute=this.inputGoodsTransportRoute(lGoodsTransportRoute)
									if(!lMapGoodsTransportRoute.Result){
										lGoodsTransportRoute=''
									}else{
										lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
									}
									caseOutput.GoodsTransportRoute=lGoodsTransportRoute
									if(lGoodsTransportRoute.length()<=0){
										return lreturn
									}
									Map lMapUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
									if(!lMapUnderFinancing.Result){
										lUnderFinancing=''
									}else{
										lUnderFinancing=lMapUnderFinancing.UnderFinancing
									}
									caseOutput.UnderFinancing=lUnderFinancing
									if(lUnderFinancing.length()<=0){
										return lreturn
									}
									Map lMapTentative=this.inputTentative(lTentative)
									if(!lMapTentative.Result){
										lTentative=''
									}else{
										lTentative=lMapTentative.Tentative
									}
									caseOutput.Tentative=lTentative
									if(lTentative.length()<=0){
										return lreturn
									}
									Map lMapAlcoholFree=this.inputAlcoholFree(lAlcoholFree)
									if(!lMapAlcoholFree.Result){
										lAlcoholFree=''
									}else{
										lAlcoholFree=lMapAlcoholFree.AlcoholFree
									}
									caseOutput.AlcoholFree=lAlcoholFree
									if(lAlcoholFree.length()<=0){
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
									this.checkHandShake()
									Map lMapLanguage=this.inputLanguage(lLanguage)
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(3)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(5)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(8)
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
									Map lMapSubmodel=this.inputSubmodel(lSubmodel)
									if(!lMapSubmodel.Result){
										lSubmodel=''
									}else{
										lSubmodel=lMapSubmodel.Submodel
									}
									caseOutput.Submodel=lSubmodel
									if(lSubmodel.length()<=0){
										return lreturn
									}
									Map lMapCarCamera=this.inputCarCamera(lCarCamera)
									if(!lMapCarCamera.Result){
										lCarCamera=''
									}else{
										lCarCamera=lMapCarCamera.CarCamera
									}
									caseOutput.CarCamera=lCarCamera
									if(lCarCamera.length()<=0){
										return lreturn
									}
									Map lMapOdometerReading=this.inputOdometerReading(lOdometerReading)
									if(!lMapOdometerReading.Result){
										lOdometerReading=''
									}else{
										lOdometerReading=lMapOdometerReading.OdometerReading
									}
									caseOutput.OdometerReading=lOdometerReading
									if(lOdometerReading.length()<=0){
										return lreturn
									}
									Map lMapGenderMainMaritalStatus=this.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
									if(!lMapGenderMainMaritalStatus.Result){
										lGenderMain=''
										lMaritalStatus=''
									}else{
										lGenderMain=lMapGenderMainMaritalStatus.GenderMain
										lMaritalStatus=lMapGenderMainMaritalStatus.MaritalStatus
									}
									caseOutput.GenderMain=lGenderMain
									caseOutput.MaritalStatus=lMaritalStatus
									if(!lMapGenderMainMaritalStatus.Result){
										return lreturn
									}
									Map lMapBirthDateMain=this.inputBirthDateMain(lBirthDateMain)
									if(!lMapBirthDateMain.Result){
										lBirthDateMain=''
									}else{
										lBirthDateMain=lMapBirthDateMain.BirthDateMain
									}
									caseOutput.BirthDateMain=lBirthDateMain
									if(lBirthDateMain.length()<=0){
										return lreturn
									}
									Map lMapYearDriving=this.inputYearDriving(lYearDriving)
									if(!lMapYearDriving.Result){
										lYearDriving=''
									}else{
										lYearDriving=lMapYearDriving.YearDriving
									}
									caseOutput.YearDriving=lYearDriving
									if(lYearDriving.length()<=0){
										return lreturn
									}
									Map lMapClaimsNo=this.inputClaimsNo(lClaimsNo)
									if(!lMapClaimsNo.Result){
										lClaimsNo=''
									}else{
										lClaimsNo=lMapClaimsNo.ClaimsNo
									}
									caseOutput.ClaimsNo=lClaimsNo
									if(lClaimsNo.length()<=0){
										return lreturn
									}
									Map lMapPostalCode=this.inputPostalCode(lPostalCode)
									if(!lMapPostalCode.Result){
										lPostalCode=''
									}else{
										lPostalCode=lMapPostalCode.PostalCode
									}
									caseOutput.PostalCode=lPostalCode
									if(lPostalCode.length()<=0){
										return lreturn
									}
									Map lMapDeclaredNcb=this.inputDeclaredNcb(lDeclaredNcb)
									if(!lMapDeclaredNcb.Result){
										lDeclaredNcb=''
									}else{
										lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
									}
									caseOutput.DeclaredNcb=lDeclaredNcb
									if(lDeclaredNcb.length()<=0){
										return lreturn
									}
									Map lMapVehicleUsage=this.inputVehicleUsage(lVehicleUsage)
									if(!lMapVehicleUsage.Result){
										lVehicleUsage=''
									}else{
										lVehicleUsage=lMapVehicleUsage.VehicleUsage
									}
									caseOutput.VehicleUsage=lVehicleUsage
									if(lVehicleUsage.length()<=0){
										return lreturn
									}
									caseOutput.VehicleUsageForCommercial='No Option'
									caseOutput.VehicleUsageDriveToWork='No Option'
									caseOutput.VehicleUsageDriveToWorkOften='No Option'
									Map lMapTaxiOrVehicleForHire=this.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
									if(!lMapTaxiOrVehicleForHire.Result){
										lTaxiOrVehicleForHire=''
									}else{
										lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
									}
									caseOutput.TaxiOrVehicleForHire=lTaxiOrVehicleForHire
									if(lTaxiOrVehicleForHire.length()<=0){
										return lreturn
									}
									Map lMapRentalVehicle=this.inputRentalVehicle(lRentalVehicle)
									if(!lMapRentalVehicle.Result){
										lRentalVehicle=''
									}else{
										lRentalVehicle=lMapRentalVehicle.RentalVehicle
									}
									caseOutput.RentalVehicle=lRentalVehicle
									if(lRentalVehicle.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportVehicle=this.inputGoodsTransportVehicle(lGoodsTransportVehicle)
									if(!lMapGoodsTransportVehicle.Result){
										lGoodsTransportVehicle=''
									}else{
										lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
									}
									caseOutput.GoodsTransportVehicle=lGoodsTransportVehicle
									if(lGoodsTransportVehicle.length()<=0){
										return lreturn
									}
									Map lMapLogisticsOrCourierCompany=this.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
									if(!lMapLogisticsOrCourierCompany.Result){
										lLogisticsOrCourierCompany=''
									}else{
										lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
									}
									caseOutput.LogisticsOrCourierCompany=lLogisticsOrCourierCompany
									if(lLogisticsOrCourierCompany.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportRoute=this.inputGoodsTransportRoute(lGoodsTransportRoute)
									if(!lMapGoodsTransportRoute.Result){
										lGoodsTransportRoute=''
									}else{
										lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
									}
									caseOutput.GoodsTransportRoute=lGoodsTransportRoute
									if(lGoodsTransportRoute.length()<=0){
										return lreturn
									}
									Map lMapUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
									if(!lMapUnderFinancing.Result){
										lUnderFinancing=''
									}else{
										lUnderFinancing=lMapUnderFinancing.UnderFinancing
									}
									caseOutput.UnderFinancing=lUnderFinancing
									if(lUnderFinancing.length()<=0){
										return lreturn
									}
									Map lMapTentative=this.inputTentative(lTentative)
									if(!lMapTentative.Result){
										lTentative=''
									}else{
										lTentative=lMapTentative.Tentative
									}
									caseOutput.Tentative=lTentative
									if(lTentative.length()<=0){
										return lreturn
									}
									Map lMapAlcoholFree=this.inputAlcoholFree(lAlcoholFree)
									if(!lMapAlcoholFree.Result){
										lAlcoholFree=''
									}else{
										lAlcoholFree=lMapAlcoholFree.AlcoholFree
									}
									caseOutput.AlcoholFree=lAlcoholFree
									if(lAlcoholFree.length()<=0){
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
							this.checkHandShake()
							Map lMapLanguage=this.inputLanguage(lLanguage)
							if(!lMapLanguage.Result){
								IGNUemaHelper.delayThreadSecond(3)
								lMapLanguage=this.inputLanguage(lLanguage)
							}
							if(!lMapLanguage.Result){
								IGNUemaHelper.delayThreadSecond(5)
								lMapLanguage=this.inputLanguage(lLanguage)
							}
							if(!lMapLanguage.Result){
								IGNUemaHelper.delayThreadSecond(8)
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
							Map lMapSubmodel=this.inputSubmodel(lSubmodel)
							if(!lMapSubmodel.Result){
								lSubmodel=''
							}else{
								lSubmodel=lMapSubmodel.Submodel
							}
							caseOutput.Submodel=lSubmodel
							if(lSubmodel.length()<=0){
								return lreturn
							}
							Map lMapCarCamera=this.inputCarCamera(lCarCamera)
							if(!lMapCarCamera.Result){
								lCarCamera=''
							}else{
								lCarCamera=lMapCarCamera.CarCamera
							}
							caseOutput.CarCamera=lCarCamera
							if(lCarCamera.length()<=0){
								return lreturn
							}
							Map lMapOdometerReading=this.inputOdometerReading(lOdometerReading)
							if(!lMapOdometerReading.Result){
								lOdometerReading=''
							}else{
								lOdometerReading=lMapOdometerReading.OdometerReading
							}
							caseOutput.OdometerReading=lOdometerReading
							if(lOdometerReading.length()<=0){
								return lreturn
							}
							Map lMapGenderMainMaritalStatus=this.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
							if(!lMapGenderMainMaritalStatus.Result){
								lGenderMain=''
								lMaritalStatus=''
							}else{
								lGenderMain=lMapGenderMainMaritalStatus.GenderMain
								lMaritalStatus=lMapGenderMainMaritalStatus.MaritalStatus
							}
							caseOutput.GenderMain=lGenderMain
							caseOutput.MaritalStatus=lMaritalStatus
							if(!lMapGenderMainMaritalStatus.Result){
								return lreturn
							}
							Map lMapBirthDateMain=this.inputBirthDateMain(lBirthDateMain)
							if(!lMapBirthDateMain.Result){
								lBirthDateMain=''
							}else{
								lBirthDateMain=lMapBirthDateMain.BirthDateMain
							}
							caseOutput.BirthDateMain=lBirthDateMain
							if(lBirthDateMain.length()<=0){
								return lreturn
							}
							Map lMapYearDriving=this.inputYearDriving(lYearDriving)
							if(!lMapYearDriving.Result){
								lYearDriving=''
							}else{
								lYearDriving=lMapYearDriving.YearDriving
							}
							caseOutput.YearDriving=lYearDriving
							if(lYearDriving.length()<=0){
								return lreturn
							}
							Map lMapClaimsNo=this.inputClaimsNo(lClaimsNo)
							if(!lMapClaimsNo.Result){
								lClaimsNo=''
							}else{
								lClaimsNo=lMapClaimsNo.ClaimsNo
							}
							caseOutput.ClaimsNo=lClaimsNo
							if(lClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapPostalCode=this.inputPostalCode(lPostalCode)
							if(!lMapPostalCode.Result){
								lPostalCode=''
							}else{
								lPostalCode=lMapPostalCode.PostalCode
							}
							caseOutput.PostalCode=lPostalCode
							if(lPostalCode.length()<=0){
								return lreturn
							}
							Map lMapDeclaredNcb=this.inputDeclaredNcb(lDeclaredNcb)
							if(!lMapDeclaredNcb.Result){
								lDeclaredNcb=''
							}else{
								lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
							}
							caseOutput.DeclaredNcb=lDeclaredNcb
							if(lDeclaredNcb.length()<=0){
								return lreturn
							}
							Map lMapVehicleUsage=this.inputVehicleUsage(lVehicleUsage)
							if(!lMapVehicleUsage.Result){
								lVehicleUsage=''
							}else{
								lVehicleUsage=lMapVehicleUsage.VehicleUsage
							}
							caseOutput.VehicleUsage=lVehicleUsage
							if(lVehicleUsage.length()<=0){
								return lreturn
							}
							caseOutput.VehicleUsageForCommercial='No Option'
							caseOutput.VehicleUsageDriveToWork='No Option'
							caseOutput.VehicleUsageDriveToWorkOften='No Option'
							Map lMapTaxiOrVehicleForHire=this.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
							if(!lMapTaxiOrVehicleForHire.Result){
								lTaxiOrVehicleForHire=''
							}else{
								lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
							}
							caseOutput.TaxiOrVehicleForHire=lTaxiOrVehicleForHire
							if(lTaxiOrVehicleForHire.length()<=0){
								return lreturn
							}
							Map lMapRentalVehicle=this.inputRentalVehicle(lRentalVehicle)
							if(!lMapRentalVehicle.Result){
								lRentalVehicle=''
							}else{
								lRentalVehicle=lMapRentalVehicle.RentalVehicle
							}
							caseOutput.RentalVehicle=lRentalVehicle
							if(lRentalVehicle.length()<=0){
								return lreturn
							}
							Map lMapGoodsTransportVehicle=this.inputGoodsTransportVehicle(lGoodsTransportVehicle)
							if(!lMapGoodsTransportVehicle.Result){
								lGoodsTransportVehicle=''
							}else{
								lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
							}
							caseOutput.GoodsTransportVehicle=lGoodsTransportVehicle
							if(lGoodsTransportVehicle.length()<=0){
								return lreturn
							}
							Map lMapLogisticsOrCourierCompany=this.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
							if(!lMapLogisticsOrCourierCompany.Result){
								lLogisticsOrCourierCompany=''
							}else{
								lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
							}
							caseOutput.LogisticsOrCourierCompany=lLogisticsOrCourierCompany
							if(lLogisticsOrCourierCompany.length()<=0){
								return lreturn
							}
							Map lMapGoodsTransportRoute=this.inputGoodsTransportRoute(lGoodsTransportRoute)
							if(!lMapGoodsTransportRoute.Result){
								lGoodsTransportRoute=''
							}else{
								lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
							}
							caseOutput.GoodsTransportRoute=lGoodsTransportRoute
							if(lGoodsTransportRoute.length()<=0){
								return lreturn
							}
							Map lMapUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
							if(!lMapUnderFinancing.Result){
								lUnderFinancing=''
							}else{
								lUnderFinancing=lMapUnderFinancing.UnderFinancing
							}
							caseOutput.UnderFinancing=lUnderFinancing
							if(lUnderFinancing.length()<=0){
								return lreturn
							}
							Map lMapTentative=this.inputTentative(lTentative)
							if(!lMapTentative.Result){
								lTentative=''
							}else{
								lTentative=lMapTentative.Tentative
							}
							caseOutput.Tentative=lTentative
							if(lTentative.length()<=0){
								return lreturn
							}
							Map lMapAlcoholFree=this.inputAlcoholFree(lAlcoholFree)
							if(!lMapAlcoholFree.Result){
								lAlcoholFree=''
							}else{
								lAlcoholFree=lMapAlcoholFree.AlcoholFree
							}
							caseOutput.AlcoholFree=lAlcoholFree
							if(lAlcoholFree.length()<=0){
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
					}else{
						if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
							switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
								case 'A':
									this.checkHandShake()
									Map lMapLanguage=this.inputLanguage(lLanguage)
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(3)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(5)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(8)
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
									Map lMapSubmodel=this.inputSubmodel(lSubmodel)
									if(!lMapSubmodel.Result){
										lSubmodel=''
									}else{
										lSubmodel=lMapSubmodel.Submodel
									}
									caseOutput.Submodel=lSubmodel
									if(lSubmodel.length()<=0){
										return lreturn
									}
									Map lMapCarCamera=this.inputCarCamera(lCarCamera)
									if(!lMapCarCamera.Result){
										lCarCamera=''
									}else{
										lCarCamera=lMapCarCamera.CarCamera
									}
									caseOutput.CarCamera=lCarCamera
									if(lCarCamera.length()<=0){
										return lreturn
									}
									Map lMapOdometerReading=this.inputOdometerReading(lOdometerReading)
									if(!lMapOdometerReading.Result){
										lOdometerReading=''
									}else{
										lOdometerReading=lMapOdometerReading.OdometerReading
									}
									caseOutput.OdometerReading=lOdometerReading
									if(lOdometerReading.length()<=0){
										return lreturn
									}
									caseOutput.VehicleUsage='No Option'
									Map lMapVehicleUsageForCommercial=this.inputVehicleUsageForCommercial(lVehicleUsageForCommercial)
									if(!lMapVehicleUsageForCommercial.Result){
										lVehicleUsageForCommercial=''
									}else{
										lVehicleUsageForCommercial=lMapVehicleUsageForCommercial.VehicleUsageForCommercial
									}
									caseOutput.VehicleUsageForCommercial=lVehicleUsageForCommercial
									if(lVehicleUsageForCommercial.length()<=0){
										return lreturn
									}
									Map lMapVehicleUsageDriveToWork=this.inputVehicleUsageDriveToWork(lVehicleUsageDriveToWork)
									if(!lMapVehicleUsageDriveToWork.Result){
										lVehicleUsageDriveToWork=''
									}else{
										lVehicleUsageDriveToWork=lMapVehicleUsageDriveToWork.VehicleUsageDriveToWork
									}
									caseOutput.VehicleUsageDriveToWork=lVehicleUsageDriveToWork
									if(lVehicleUsageDriveToWork.length()<=0){
										return lreturn
									}
									Map lMapVehicleUsageDriveToWorkOften=this.inputVehicleUsageDriveToWorkOften(lVehicleUsageDriveToWorkOften)
									if(!lMapVehicleUsageDriveToWorkOften.Result){
										lVehicleUsageDriveToWorkOften=''
									}else{
										lVehicleUsageDriveToWorkOften=lMapVehicleUsageDriveToWorkOften.VehicleUsageDriveToWorkOften
									}
									caseOutput.VehicleUsageDriveToWorkOften=lVehicleUsageDriveToWorkOften
									if(lVehicleUsageDriveToWorkOften.length()<=0){
										return lreturn
									}
									Map lMapTaxiOrVehicleForHire=this.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
									if(!lMapTaxiOrVehicleForHire.Result){
										lTaxiOrVehicleForHire=''
									}else{
										lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
									}
									caseOutput.TaxiOrVehicleForHire=lTaxiOrVehicleForHire
									if(lTaxiOrVehicleForHire.length()<=0){
										return lreturn
									}
									Map lMapRentalVehicle=this.inputRentalVehicle(lRentalVehicle)
									if(!lMapRentalVehicle.Result){
										lRentalVehicle=''
									}else{
										lRentalVehicle=lMapRentalVehicle.RentalVehicle
									}
									caseOutput.RentalVehicle=lRentalVehicle
									if(lRentalVehicle.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportVehicle=this.inputGoodsTransportVehicle(lGoodsTransportVehicle)
									if(!lMapGoodsTransportVehicle.Result){
										lGoodsTransportVehicle=''
									}else{
										lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
									}
									caseOutput.GoodsTransportVehicle=lGoodsTransportVehicle
									if(lGoodsTransportVehicle.length()<=0){
										return lreturn
									}
									Map lMapLogisticsOrCourierCompany=this.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
									if(!lMapLogisticsOrCourierCompany.Result){
										lLogisticsOrCourierCompany=''
									}else{
										lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
									}
									caseOutput.LogisticsOrCourierCompany=lLogisticsOrCourierCompany
									if(lLogisticsOrCourierCompany.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportRoute=this.inputGoodsTransportRoute(lGoodsTransportRoute)
									if(!lMapGoodsTransportRoute.Result){
										lGoodsTransportRoute=''
									}else{
										lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
									}
									caseOutput.GoodsTransportRoute=lGoodsTransportRoute
									if(lGoodsTransportRoute.length()<=0){
										return lreturn
									}
									Map lMapClaimsNo=this.inputClaimsNo(lClaimsNo)
									if(!lMapClaimsNo.Result){
										lClaimsNo=''
									}else{
										lClaimsNo=lMapClaimsNo.ClaimsNo
									}
									caseOutput.ClaimsNo=lClaimsNo
									if(lClaimsNo.length()<=0){
										return lreturn
									}
									Map lMapUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
									if(!lMapUnderFinancing.Result){
										lUnderFinancing=''
									}else{
										lUnderFinancing=lMapUnderFinancing.UnderFinancing
									}
									caseOutput.UnderFinancing=lUnderFinancing
									if(lUnderFinancing.length()<=0){
										return lreturn
									}
									Map lMapGenderMainMaritalStatus=this.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
									if(!lMapGenderMainMaritalStatus.Result){
										lGenderMain=''
										lMaritalStatus=''
									}else{
										lGenderMain=lMapGenderMainMaritalStatus.GenderMain
										lMaritalStatus=lMapGenderMainMaritalStatus.MaritalStatus
									}
									caseOutput.GenderMain=lGenderMain
									caseOutput.MaritalStatus=lMaritalStatus
									if(!lMapGenderMainMaritalStatus.Result){
										return lreturn
									}
									Map lMapBirthDateMain=this.inputBirthDateMain(lBirthDateMain)
									if(!lMapBirthDateMain.Result){
										lBirthDateMain=''
									}else{
										lBirthDateMain=lMapBirthDateMain.BirthDateMain
									}
									caseOutput.BirthDateMain=lBirthDateMain
									if(lBirthDateMain.length()<=0){
										return lreturn
									}
									Map lMapYearDriving=this.inputYearDriving(lYearDriving)
									if(!lMapYearDriving.Result){
										lYearDriving=''
									}else{
										lYearDriving=lMapYearDriving.YearDriving
									}
									caseOutput.YearDriving=lYearDriving
									if(lYearDriving.length()<=0){
										return lreturn
									}
									Map lMapPostalCode=this.inputPostalCode(lPostalCode)
									if(!lMapPostalCode.Result){
										lPostalCode=''
									}else{
										lPostalCode=lMapPostalCode.PostalCode
									}
									caseOutput.PostalCode=lPostalCode
									if(lPostalCode.length()<=0){
										return lreturn
									}
									Map lMapDeclaredNcb=this.inputDeclaredNcb(lDeclaredNcb)
									if(!lMapDeclaredNcb.Result){
										lDeclaredNcb=''
									}else{
										lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
									}
									caseOutput.DeclaredNcb=lDeclaredNcb
									if(lDeclaredNcb.length()<=0){
										return lreturn
									}
									Map lMapTentative=this.inputTentative(lTentative)
									if(!lMapTentative.Result){
										lTentative=''
									}else{
										lTentative=lMapTentative.Tentative
									}
									caseOutput.Tentative=lTentative
									if(lTentative.length()<=0){
										return lreturn
									}
									Map lMapAlcoholFree=this.inputAlcoholFree(lAlcoholFree)
									if(!lMapAlcoholFree.Result){
										lAlcoholFree=''
									}else{
										lAlcoholFree=lMapAlcoholFree.AlcoholFree
									}
									caseOutput.AlcoholFree=lAlcoholFree
									if(lAlcoholFree.length()<=0){
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
									this.checkHandShake()
									Map lMapLanguage=this.inputLanguage(lLanguage)
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(3)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(5)
										lMapLanguage=this.inputLanguage(lLanguage)
									}
									if(!lMapLanguage.Result){
										IGNUemaHelper.delayThreadSecond(8)
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
									Map lMapSubmodel=this.inputSubmodel(lSubmodel)
									if(!lMapSubmodel.Result){
										lSubmodel=''
									}else{
										lSubmodel=lMapSubmodel.Submodel
									}
									caseOutput.Submodel=lSubmodel
									if(lSubmodel.length()<=0){
										return lreturn
									}
									Map lMapCarCamera=this.inputCarCamera(lCarCamera)
									if(!lMapCarCamera.Result){
										lCarCamera=''
									}else{
										lCarCamera=lMapCarCamera.CarCamera
									}
									caseOutput.CarCamera=lCarCamera
									if(lCarCamera.length()<=0){
										return lreturn
									}
									Map lMapOdometerReading=this.inputOdometerReading(lOdometerReading)
									if(!lMapOdometerReading.Result){
										lOdometerReading=''
									}else{
										lOdometerReading=lMapOdometerReading.OdometerReading
									}
									caseOutput.OdometerReading=lOdometerReading
									if(lOdometerReading.length()<=0){
										return lreturn
									}
									caseOutput.VehicleUsage='No Option'
									Map lMapVehicleUsageForCommercial=this.inputVehicleUsageForCommercial(lVehicleUsageForCommercial)
									if(!lMapVehicleUsageForCommercial.Result){
										lVehicleUsageForCommercial=''
									}else{
										lVehicleUsageForCommercial=lMapVehicleUsageForCommercial.VehicleUsageForCommercial
									}
									caseOutput.VehicleUsageForCommercial=lVehicleUsageForCommercial
									if(lVehicleUsageForCommercial.length()<=0){
										return lreturn
									}
									Map lMapVehicleUsageDriveToWork=this.inputVehicleUsageDriveToWork(lVehicleUsageDriveToWork)
									if(!lMapVehicleUsageDriveToWork.Result){
										lVehicleUsageDriveToWork=''
									}else{
										lVehicleUsageDriveToWork=lMapVehicleUsageDriveToWork.VehicleUsageDriveToWork
									}
									caseOutput.VehicleUsageDriveToWork=lVehicleUsageDriveToWork
									if(lVehicleUsageDriveToWork.length()<=0){
										return lreturn
									}
									Map lMapVehicleUsageDriveToWorkOften=this.inputVehicleUsageDriveToWorkOften(lVehicleUsageDriveToWorkOften)
									if(!lMapVehicleUsageDriveToWorkOften.Result){
										lVehicleUsageDriveToWorkOften=''
									}else{
										lVehicleUsageDriveToWorkOften=lMapVehicleUsageDriveToWorkOften.VehicleUsageDriveToWorkOften
									}
									caseOutput.VehicleUsageDriveToWorkOften=lVehicleUsageDriveToWorkOften
									if(lVehicleUsageDriveToWorkOften.length()<=0){
										return lreturn
									}
									Map lMapTaxiOrVehicleForHire=this.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
									if(!lMapTaxiOrVehicleForHire.Result){
										lTaxiOrVehicleForHire=''
									}else{
										lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
									}
									caseOutput.TaxiOrVehicleForHire=lTaxiOrVehicleForHire
									if(lTaxiOrVehicleForHire.length()<=0){
										return lreturn
									}
									Map lMapRentalVehicle=this.inputRentalVehicle(lRentalVehicle)
									if(!lMapRentalVehicle.Result){
										lRentalVehicle=''
									}else{
										lRentalVehicle=lMapRentalVehicle.RentalVehicle
									}
									caseOutput.RentalVehicle=lRentalVehicle
									if(lRentalVehicle.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportVehicle=this.inputGoodsTransportVehicle(lGoodsTransportVehicle)
									if(!lMapGoodsTransportVehicle.Result){
										lGoodsTransportVehicle=''
									}else{
										lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
									}
									caseOutput.GoodsTransportVehicle=lGoodsTransportVehicle
									if(lGoodsTransportVehicle.length()<=0){
										return lreturn
									}
									Map lMapLogisticsOrCourierCompany=this.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
									if(!lMapLogisticsOrCourierCompany.Result){
										lLogisticsOrCourierCompany=''
									}else{
										lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
									}
									caseOutput.LogisticsOrCourierCompany=lLogisticsOrCourierCompany
									if(lLogisticsOrCourierCompany.length()<=0){
										return lreturn
									}
									Map lMapGoodsTransportRoute=this.inputGoodsTransportRoute(lGoodsTransportRoute)
									if(!lMapGoodsTransportRoute.Result){
										lGoodsTransportRoute=''
									}else{
										lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
									}
									caseOutput.GoodsTransportRoute=lGoodsTransportRoute
									if(lGoodsTransportRoute.length()<=0){
										return lreturn
									}
									Map lMapClaimsNo=this.inputClaimsNo(lClaimsNo)
									if(!lMapClaimsNo.Result){
										lClaimsNo=''
									}else{
										lClaimsNo=lMapClaimsNo.ClaimsNo
									}
									caseOutput.ClaimsNo=lClaimsNo
									if(lClaimsNo.length()<=0){
										return lreturn
									}
									Map lMapUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
									if(!lMapUnderFinancing.Result){
										lUnderFinancing=''
									}else{
										lUnderFinancing=lMapUnderFinancing.UnderFinancing
									}
									caseOutput.UnderFinancing=lUnderFinancing
									if(lUnderFinancing.length()<=0){
										return lreturn
									}
									Map lMapGenderMainMaritalStatus=this.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
									if(!lMapGenderMainMaritalStatus.Result){
										lGenderMain=''
										lMaritalStatus=''
									}else{
										lGenderMain=lMapGenderMainMaritalStatus.GenderMain
										lMaritalStatus=lMapGenderMainMaritalStatus.MaritalStatus
									}
									caseOutput.GenderMain=lGenderMain
									caseOutput.MaritalStatus=lMaritalStatus
									if(!lMapGenderMainMaritalStatus.Result){
										return lreturn
									}
									Map lMapBirthDateMain=this.inputBirthDateMain(lBirthDateMain)
									if(!lMapBirthDateMain.Result){
										lBirthDateMain=''
									}else{
										lBirthDateMain=lMapBirthDateMain.BirthDateMain
									}
									caseOutput.BirthDateMain=lBirthDateMain
									if(lBirthDateMain.length()<=0){
										return lreturn
									}
									Map lMapYearDriving=this.inputYearDriving(lYearDriving)
									if(!lMapYearDriving.Result){
										lYearDriving=''
									}else{
										lYearDriving=lMapYearDriving.YearDriving
									}
									caseOutput.YearDriving=lYearDriving
									if(lYearDriving.length()<=0){
										return lreturn
									}
									Map lMapPostalCode=this.inputPostalCode(lPostalCode)
									if(!lMapPostalCode.Result){
										lPostalCode=''
									}else{
										lPostalCode=lMapPostalCode.PostalCode
									}
									caseOutput.PostalCode=lPostalCode
									if(lPostalCode.length()<=0){
										return lreturn
									}
									Map lMapDeclaredNcb=this.inputDeclaredNcb(lDeclaredNcb)
									if(!lMapDeclaredNcb.Result){
										lDeclaredNcb=''
									}else{
										lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
									}
									caseOutput.DeclaredNcb=lDeclaredNcb
									if(lDeclaredNcb.length()<=0){
										return lreturn
									}
									Map lMapTentative=this.inputTentative(lTentative)
									if(!lMapTentative.Result){
										lTentative=''
									}else{
										lTentative=lMapTentative.Tentative
									}
									caseOutput.Tentative=lTentative
									if(lTentative.length()<=0){
										return lreturn
									}
									Map lMapAlcoholFree=this.inputAlcoholFree(lAlcoholFree)
									if(!lMapAlcoholFree.Result){
										lAlcoholFree=''
									}else{
										lAlcoholFree=lMapAlcoholFree.AlcoholFree
									}
									caseOutput.AlcoholFree=lAlcoholFree
									if(lAlcoholFree.length()<=0){
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
							this.checkHandShake()
							Map lMapLanguage=this.inputLanguage(lLanguage)
							if(!lMapLanguage.Result){
								IGNUemaHelper.delayThreadSecond(3)
								lMapLanguage=this.inputLanguage(lLanguage)
							}
							if(!lMapLanguage.Result){
								IGNUemaHelper.delayThreadSecond(5)
								lMapLanguage=this.inputLanguage(lLanguage)
							}
							if(!lMapLanguage.Result){
								IGNUemaHelper.delayThreadSecond(8)
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
							Map lMapSubmodel=this.inputSubmodel(lSubmodel)
							if(!lMapSubmodel.Result){
								lSubmodel=''
							}else{
								lSubmodel=lMapSubmodel.Submodel
							}
							caseOutput.Submodel=lSubmodel
							if(lSubmodel.length()<=0){
								return lreturn
							}
							Map lMapCarCamera=this.inputCarCamera(lCarCamera)
							if(!lMapCarCamera.Result){
								lCarCamera=''
							}else{
								lCarCamera=lMapCarCamera.CarCamera
							}
							caseOutput.CarCamera=lCarCamera
							if(lCarCamera.length()<=0){
								return lreturn
							}
							Map lMapOdometerReading=this.inputOdometerReading(lOdometerReading)
							if(!lMapOdometerReading.Result){
								lOdometerReading=''
							}else{
								lOdometerReading=lMapOdometerReading.OdometerReading
							}
							caseOutput.OdometerReading=lOdometerReading
							if(lOdometerReading.length()<=0){
								return lreturn
							}
							caseOutput.VehicleUsage='No Option'
							Map lMapVehicleUsageForCommercial=this.inputVehicleUsageForCommercial(lVehicleUsageForCommercial)
							if(!lMapVehicleUsageForCommercial.Result){
								lVehicleUsageForCommercial=''
							}else{
								lVehicleUsageForCommercial=lMapVehicleUsageForCommercial.VehicleUsageForCommercial
							}
							caseOutput.VehicleUsageForCommercial=lVehicleUsageForCommercial
							if(lVehicleUsageForCommercial.length()<=0){
								return lreturn
							}
							Map lMapVehicleUsageDriveToWork=this.inputVehicleUsageDriveToWork(lVehicleUsageDriveToWork)
							if(!lMapVehicleUsageDriveToWork.Result){
								lVehicleUsageDriveToWork=''
							}else{
								lVehicleUsageDriveToWork=lMapVehicleUsageDriveToWork.VehicleUsageDriveToWork
							}
							caseOutput.VehicleUsageDriveToWork=lVehicleUsageDriveToWork
							if(lVehicleUsageDriveToWork.length()<=0){
								return lreturn
							}
							Map lMapVehicleUsageDriveToWorkOften=this.inputVehicleUsageDriveToWorkOften(lVehicleUsageDriveToWorkOften)
							if(!lMapVehicleUsageDriveToWorkOften.Result){
								lVehicleUsageDriveToWorkOften=''
							}else{
								lVehicleUsageDriveToWorkOften=lMapVehicleUsageDriveToWorkOften.VehicleUsageDriveToWorkOften
							}
							caseOutput.VehicleUsageDriveToWorkOften=lVehicleUsageDriveToWorkOften
							if(lVehicleUsageDriveToWorkOften.length()<=0){
								return lreturn
							}
							Map lMapTaxiOrVehicleForHire=this.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
							if(!lMapTaxiOrVehicleForHire.Result){
								lTaxiOrVehicleForHire=''
							}else{
								lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
							}
							caseOutput.TaxiOrVehicleForHire=lTaxiOrVehicleForHire
							if(lTaxiOrVehicleForHire.length()<=0){
								return lreturn
							}
							Map lMapRentalVehicle=this.inputRentalVehicle(lRentalVehicle)
							if(!lMapRentalVehicle.Result){
								lRentalVehicle=''
							}else{
								lRentalVehicle=lMapRentalVehicle.RentalVehicle
							}
							caseOutput.RentalVehicle=lRentalVehicle
							if(lRentalVehicle.length()<=0){
								return lreturn
							}
							Map lMapGoodsTransportVehicle=this.inputGoodsTransportVehicle(lGoodsTransportVehicle)
							if(!lMapGoodsTransportVehicle.Result){
								lGoodsTransportVehicle=''
							}else{
								lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
							}
							caseOutput.GoodsTransportVehicle=lGoodsTransportVehicle
							if(lGoodsTransportVehicle.length()<=0){
								return lreturn
							}
							Map lMapLogisticsOrCourierCompany=this.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
							if(!lMapLogisticsOrCourierCompany.Result){
								lLogisticsOrCourierCompany=''
							}else{
								lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
							}
							caseOutput.LogisticsOrCourierCompany=lLogisticsOrCourierCompany
							if(lLogisticsOrCourierCompany.length()<=0){
								return lreturn
							}
							Map lMapGoodsTransportRoute=this.inputGoodsTransportRoute(lGoodsTransportRoute)
							if(!lMapGoodsTransportRoute.Result){
								lGoodsTransportRoute=''
							}else{
								lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
							}
							caseOutput.GoodsTransportRoute=lGoodsTransportRoute
							if(lGoodsTransportRoute.length()<=0){
								return lreturn
							}
							Map lMapClaimsNo=this.inputClaimsNo(lClaimsNo)
							if(!lMapClaimsNo.Result){
								lClaimsNo=''
							}else{
								lClaimsNo=lMapClaimsNo.ClaimsNo
							}
							caseOutput.ClaimsNo=lClaimsNo
							if(lClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
							if(!lMapUnderFinancing.Result){
								lUnderFinancing=''
							}else{
								lUnderFinancing=lMapUnderFinancing.UnderFinancing
							}
							caseOutput.UnderFinancing=lUnderFinancing
							if(lUnderFinancing.length()<=0){
								return lreturn
							}
							Map lMapGenderMainMaritalStatus=this.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
							if(!lMapGenderMainMaritalStatus.Result){
								lGenderMain=''
								lMaritalStatus=''
							}else{
								lGenderMain=lMapGenderMainMaritalStatus.GenderMain
								lMaritalStatus=lMapGenderMainMaritalStatus.MaritalStatus
							}
							caseOutput.GenderMain=lGenderMain
							caseOutput.MaritalStatus=lMaritalStatus
							if(!lMapGenderMainMaritalStatus.Result){
								return lreturn
							}
							Map lMapBirthDateMain=this.inputBirthDateMain(lBirthDateMain)
							if(!lMapBirthDateMain.Result){
								lBirthDateMain=''
							}else{
								lBirthDateMain=lMapBirthDateMain.BirthDateMain
							}
							caseOutput.BirthDateMain=lBirthDateMain
							if(lBirthDateMain.length()<=0){
								return lreturn
							}
							Map lMapYearDriving=this.inputYearDriving(lYearDriving)
							if(!lMapYearDriving.Result){
								lYearDriving=''
							}else{
								lYearDriving=lMapYearDriving.YearDriving
							}
							caseOutput.YearDriving=lYearDriving
							if(lYearDriving.length()<=0){
								return lreturn
							}
							Map lMapPostalCode=this.inputPostalCode(lPostalCode)
							if(!lMapPostalCode.Result){
								lPostalCode=''
							}else{
								lPostalCode=lMapPostalCode.PostalCode
							}
							caseOutput.PostalCode=lPostalCode
							if(lPostalCode.length()<=0){
								return lreturn
							}
							Map lMapDeclaredNcb=this.inputDeclaredNcb(lDeclaredNcb)
							if(!lMapDeclaredNcb.Result){
								lDeclaredNcb=''
							}else{
								lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
							}
							caseOutput.DeclaredNcb=lDeclaredNcb
							if(lDeclaredNcb.length()<=0){
								return lreturn
							}
							Map lMapTentative=this.inputTentative(lTentative)
							if(!lMapTentative.Result){
								lTentative=''
							}else{
								lTentative=lMapTentative.Tentative
							}
							caseOutput.Tentative=lTentative
							if(lTentative.length()<=0){
								return lreturn
							}
							Map lMapAlcoholFree=this.inputAlcoholFree(lAlcoholFree)
							if(!lMapAlcoholFree.Result){
								lAlcoholFree=''
							}else{
								lAlcoholFree=lMapAlcoholFree.AlcoholFree
							}
							caseOutput.AlcoholFree=lAlcoholFree
							if(lAlcoholFree.length()<=0){
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
					}
				}
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
			lPositiveCase=THARGPAMotorQuotationInputType.DEFAULT_POSITIVE_CASE
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
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapActualResult=this.lTHAMotorBikeQuotationInputUtil.inputActualResult(isPositiveCase)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				lResult=lMapActualResult.Result
			}else{
				Map lMapActualResult=this.lTHAMotorCarQuotationInputUtil.inputActualResult(isPositiveCase)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				lResult=lMapActualResult.Result
			}
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
	public Map inputGroundPartnerAgentLoginToDo(String strGroundPartnerAgentLoginToDo){
		Map lreturn=[:]
		String lGroundPartnerAgentLoginToDo=strGroundPartnerAgentLoginToDo.trim()
		if(lGroundPartnerAgentLoginToDo.length()<=0){
			lGroundPartnerAgentLoginToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentLoginToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentLoginToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentLoginToDo)
			lGroundPartnerAgentLoginToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentLoginToDo)
			lResult=lGroundPartnerAgentLoginToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentLoginToDo',lGroundPartnerAgentLoginToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentLogin(String strGroundPartnerAgentUser,String strGroundPartnerAgentPassword){
		Map lreturn=[:]
		String lGroundPartnerAgentUser=strGroundPartnerAgentUser.trim()
		if(lGroundPartnerAgentUser.length()<=0){
			lGroundPartnerAgentUser=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_USER
		}
		String lGroundPartnerAgentPassword=strGroundPartnerAgentPassword.trim()
		if(lGroundPartnerAgentPassword.length()<=0){
			lGroundPartnerAgentPassword=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentUser','')
			lreturn.put('GroundPartnerAgentPassword','')
			lreturn.put('Result',lResult)
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
			String lTagInputEmailText=''
			String lLocatorInputEmailText='#app form #email'
			lGroundPartnerAgentUser=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputEmailText,lGroundPartnerAgentUser)
			String lTagInputPasswordText=''
			String lLocatorInputPasswordText='#app form #pass'
			lGroundPartnerAgentPassword=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputPasswordText,lGroundPartnerAgentPassword)
			String lTagButtonSubmit=''
			String lLocatorButtonSubmit='#app form button'
			WebElement lElementButtonSubmit=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonSubmit)
			if(!lElementButtonSubmit){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonSubmit)
			IGNUemaHelper.delayThreadSecond(5)
			Boolean lIsOK=false
			String lTagMenuButtonOpportuynityReportChild=''
			String lLocatorMenuButtonOpportuynityReportChild='#app .navbar-nav a[href="#/opportunity-report"]'
			WebElement lElementMenuButtonOpportuynityReportChild=null
			WebElement lElementMenuButtonOpportuynityReportParent=null
			lIsOK=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorMenuButtonOpportuynityReportChild,30)
			if(!lIsOK){
				IGNUemaHelper.delayThreadSecond(5)
				lIsOK=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorMenuButtonOpportuynityReportChild,30)
			}
			if(!lIsOK){
				lLocatorMenuButtonOpportuynityReportChild='#app .navbar-nav a[href="#/opportunity-aff-report"]'
				lIsOK=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorMenuButtonOpportuynityReportChild,30)
			}
			if(lIsOK){
				lIsOK=false
				lElementMenuButtonOpportuynityReportChild=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonOpportuynityReportChild)
				if(lElementMenuButtonOpportuynityReportChild){
					lElementMenuButtonOpportuynityReportParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementMenuButtonOpportuynityReportChild)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonOpportuynityReportChild)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonOpportuynityReportChild)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonOpportuynityReportChild)
					IGNUemaHelper.delayThreadSecond(1)
					String lTagButtonPortalSearchSubmit=''
					String lLocatorButtonPortalSearchSubmit='#app #opportunity-report #searchForm button[type="submit"]'
					lIsOK=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonPortalSearchSubmit,45)
					if(!lIsOK){
						IGNUemaHelper.delayThreadSecond(5)
						lIsOK=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonPortalSearchSubmit,30)
					}
					if(!lIsOK){
						lLocatorButtonPortalSearchSubmit='#app #opportunity-aff-report #searchForm button[type="submit"]'
						lIsOK=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorButtonPortalSearchSubmit,30)
					}
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('GroundPartnerAgentUser',lGroundPartnerAgentUser)
				lreturn.put('GroundPartnerAgentPassword',lGroundPartnerAgentPassword)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentLoginMethod(String strGroundPartnerAgentLoginMethod,String strGroundPartnerAgentAccountSource,String strGroundPartnerAgentUrlProductSelect,String strGroundPartnerAgentLanguage,String strGroundPartnerAgentIsMotorBike){
		Map lreturn=[:]
		String lGroundPartnerAgentLoginMethod=strGroundPartnerAgentLoginMethod.trim()
		if(lGroundPartnerAgentLoginMethod.length()<=0){
			lGroundPartnerAgentLoginMethod=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD
		}
		String lGroundPartnerAgentAccountSource=strGroundPartnerAgentAccountSource.trim()
		if(lGroundPartnerAgentAccountSource.length()<=0){
			lGroundPartnerAgentAccountSource=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE
		}
		String lGroundPartnerAgentUrlProductSelect=strGroundPartnerAgentUrlProductSelect.trim()
		if(lGroundPartnerAgentUrlProductSelect.length()<=0){
			lGroundPartnerAgentUrlProductSelect=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT
		}
		String lGroundPartnerAgentLanguage=strGroundPartnerAgentLanguage.trim()
		if(lGroundPartnerAgentLanguage.length()<=0){
			lGroundPartnerAgentLanguage=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE
		}
		String lGroundPartnerAgentIsMotorBike=strGroundPartnerAgentIsMotorBike.trim()
		if(lGroundPartnerAgentIsMotorBike.length()<=0){
			lGroundPartnerAgentIsMotorBike=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_IS_MOTOR_BIKE
		}
		String lGroundPartnerAgentSkipLoginUrl=''
		Map lGroundPartnerAgentLoginMethodList=['2':'2','3':'3']
		Map lGroundPartnerAgentAccountSourceList=['1':'1','2':'2','3':'3','4':'4']
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentLoginMethod','')
			lreturn.put('GroundPartnerAgentAccountSource','')
			lreturn.put('GroundPartnerAgentUrlProductSelect','')
			lreturn.put('GroundPartnerAgentLanguage','')
			lreturn.put('GroundPartnerAgentIsMotorBike','')
			lreturn.put('GroundPartnerAgentSkipLoginUrl','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(lGroundPartnerAgentLoginMethod)
			if(!lGroundPartnerAgentLoginMethodItem){
				lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
			String lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(lGroundPartnerAgentAccountSource)
			if(!lGroundPartnerAgentAccountSourceItem){
				lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSourceItem
			if(lGroundPartnerAgentAccountSource.equalsIgnoreCase('4')){
				if(lGroundPartnerAgentLoginMethod.equalsIgnoreCase('2')){
					lGroundPartnerAgentLoginMethodItem='3'
					lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
				}
			}
			THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentAccountSource,THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE)
			if(THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE==3){
				THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPAMotorCoreType.CURRENT_SOCIAL_SKIP_RATING=true
			}else{
				THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPAMotorCoreType.CURRENT_SOCIAL_SKIP_RATING=false
			}
			THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT=lGroundPartnerAgentUrlProductSelect
			String lLanguageItem=lLanguageList.get(lGroundPartnerAgentLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE)
			}
			lGroundPartnerAgentLanguage=lLanguageItem.toUpperCase()
			Boolean lIsGroundPartnerAgentIsMotorBike=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentIsMotorBike)
			THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE=lIsGroundPartnerAgentIsMotorBike
			lGroundPartnerAgentIsMotorBike=IGNUemaHelper.convertBooleanToString(lIsGroundPartnerAgentIsMotorBike)
			String lLocatorFormApp=''
			Boolean lIsFormReady=false
			switch(lGroundPartnerAgentLoginMethodItem){
				case '2':
					THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
					String lTagButtonLanguageSelected=''
					String lLocatorButtonLanguageSelected='#app #select-lang a'
					WebElement lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonLanguageSelected)
					if(!lElementButtonLanguageSelected){
						return lreturn
					}
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguageSelected)
					IGNUemaHelper.delayThreadSecond(1)
					lLanguageItem=lLanguageItem.toLowerCase()
					String lTagButtonLanguage='language'
					String lLocatorButtonLanguage=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonLanguage,lLanguageItem)
					WebElement lElementButtonLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonLanguage,lLanguageItem)
					if(!lElementButtonLanguage){
						return lreturn
					}
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguage)
					IGNUemaHelper.delayThreadSecond(1)
					lLanguageItem=lLanguageItem.toUpperCase()
					String lLanguageSelected=lLanguageItem
					lGroundPartnerAgentLanguage=lLanguageSelected
					String lTagMenuButtonProductGetQuoteChild=''
					String lLocatorMenuButtonProductGetQuoteChild='#app .navbar-nav a[href="#/new-quote"]'
					WebElement lElementMenuButtonProductGetQuoteChild=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonProductGetQuoteChild)
					WebElement lElementMenuButtonProductGetQuoteParent=null
					if(!lElementMenuButtonProductGetQuoteChild){
						return lreturn
					}
					lElementMenuButtonProductGetQuoteParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementMenuButtonProductGetQuoteChild)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonProductGetQuoteChild)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonProductGetQuoteChild)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonProductGetQuoteChild)
					IGNUemaHelper.delayThreadSecond(1)
					String lLocatorMenuButtonProductOpenChildImage=''
					WebElement lElementMenuButtonProductOpenChildImage=null
					WebElement lElementMenuButtonProductOpenParent0=null
					WebElement lElementMenuButtonProductOpenParent1=null
					WebElement lElementMenuButtonProductOpenChildButton=null
					if(lIsGroundPartnerAgentIsMotorBike){
						lLocatorMenuButtonProductOpenChildImage='#app .container-fluid #new-quote .row:nth-child(2) img[src="img/nq-mb.png"]'
					}else{
						lLocatorMenuButtonProductOpenChildImage='#app .container-fluid #new-quote .row:nth-child(2) img[src="img/nq-car.png"]'
					}
					lElementMenuButtonProductOpenChildImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonProductOpenChildImage)
					if(!lElementMenuButtonProductOpenChildImage){
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorMenuButtonProductOpenChildImage,10)
						lElementMenuButtonProductOpenChildImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonProductOpenChildImage)
					}
					if(!lElementMenuButtonProductOpenChildImage){
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorMenuButtonProductOpenChildImage,10)
						lElementMenuButtonProductOpenChildImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonProductOpenChildImage)
					}
					if(!lElementMenuButtonProductOpenChildImage){
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorMenuButtonProductOpenChildImage,10)
						lElementMenuButtonProductOpenChildImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonProductOpenChildImage)
					}
					if(!lElementMenuButtonProductOpenChildImage){
						return lreturn
					}
					lElementMenuButtonProductOpenParent0=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementMenuButtonProductOpenChildImage)
					lElementMenuButtonProductOpenParent1=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementMenuButtonProductOpenParent0)
					lElementMenuButtonProductOpenChildButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementMenuButtonProductOpenParent1,'button',false)
					if(!lElementMenuButtonProductOpenChildButton){
						return lreturn
					}else{
						String lMainWindow=this.driver.getWindowHandle()
						if(lMainWindow.length()<=0){
							lMainWindow=this.driver.getWindowHandle()
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuButtonProductOpenChildButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonProductOpenChildButton)
						this.waitUntilLoaded()
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
						}catch(Exception ex){
							return lreturn
						}
					}
					lResult=true
					break
				case '3':
					lLocatorFormApp='#app .row'
					THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=false
					String lTagButtonLanguageSelected=''
					String lLocatorButtonLanguageSelected='#app #select-lang a'
					WebElement lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonLanguageSelected)
					if(!lElementButtonLanguageSelected){
						return lreturn
					}
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguageSelected)
					IGNUemaHelper.delayThreadSecond(1)
					lLanguageItem=lLanguageItem.toLowerCase()
					String lTagButtonLanguage='language'
					String lLocatorButtonLanguage=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonLanguage,lLanguageItem)
					WebElement lElementButtonLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonLanguage,lLanguageItem)
					if(!lElementButtonLanguage){
						return lreturn
					}
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguage)
					IGNUemaHelper.delayThreadSecond(1)
					lLanguageItem=lLanguageItem.toUpperCase()
					String lLanguageSelected=lLanguageItem
					lGroundPartnerAgentLanguage=lLanguageSelected
					String lTagMenuButtonHomeBoardChild=''
					String lLocatorMenuButtonHomeBoardChild='#app .navbar-nav a[href="#/home"]'
					WebElement lElementMenuButtonHomeBoardChild=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuButtonHomeBoardChild)
					WebElement lElementMenuButtonHomeBoardParent=null
					if(!lElementMenuButtonHomeBoardChild){
						return lreturn
					}
					lElementMenuButtonHomeBoardParent=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementMenuButtonHomeBoardChild)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonHomeBoardChild)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonHomeBoardChild)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonHomeBoardChild)
					IGNUemaHelper.delayThreadSecond(1)
					String lTagURLShorLinkText=''
					String lLocatorURLShorLinkText='#app .container-fluid #short-link-product'
					WebElement lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
					lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
					if(!lElementURLShorLinkText){
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorURLShorLinkText,10)
						lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
					}
					if(!lElementURLShorLinkText){
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorURLShorLinkText,10)
						lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
					}
					if(!lElementURLShorLinkText){
						IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorURLShorLinkText,10)
						lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
					}
					if(!lElementURLShorLinkText){
						return lreturn
					}else{
						lGroundPartnerAgentSkipLoginUrl=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementURLShorLinkText,'value').trim()
						if(lGroundPartnerAgentSkipLoginUrl.length()<=0){
							IGNUemaHelper.delayThreadSecond(3)
							lGroundPartnerAgentSkipLoginUrl=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementURLShorLinkText,'value').trim()
						}
						if(lGroundPartnerAgentSkipLoginUrl.length()<=0){
							IGNUemaHelper.delayThreadSecond(5)
							lGroundPartnerAgentSkipLoginUrl=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementURLShorLinkText,'value').trim()
						}
						if(lGroundPartnerAgentSkipLoginUrl.length()<=0){
							return lreturn
						}
						THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_SKIP_LOGIN=lGroundPartnerAgentSkipLoginUrl
						this.driver.get(lGroundPartnerAgentSkipLoginUrl)
						IGNUemaHelper.delayThreadSecond(5)
						lIsFormReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormApp,30)
						if(!lIsFormReady){
							this.driver.get(lGroundPartnerAgentSkipLoginUrl)
							IGNUemaHelper.delayThreadSecond(8)
							lIsFormReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormApp,30)
						}
						if(!lIsFormReady){
							this.driver.get(lGroundPartnerAgentSkipLoginUrl)
							IGNUemaHelper.delayThreadSecond(13)
							lIsFormReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormApp,30)
						}
						if(!lIsFormReady){
							return lreturn
						}
						lTagButtonLanguageSelected='selected-lang'
						lLocatorButtonLanguageSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonLanguageSelected)
						lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonLanguageSelected)
						if(!lElementButtonLanguageSelected){
							return lreturn
						}
						lLanguageSelected=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonLanguageSelected).trim()
						if(lLanguageSelected.length()<=0){
							return lreturn
						}
						if(!lLanguageItem.equalsIgnoreCase(lLanguageSelected)){
							lTagButtonLanguage='language'
							lLocatorButtonLanguage=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonLanguage,lLanguageItem)
							lElementButtonLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonLanguage,lLanguageItem)
							if(!lElementButtonLanguage){
								return lreturn
							}
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguage)
							IGNUemaHelper.delayThreadSecond(1)
							lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonLanguageSelected)
							if(!lElementButtonLanguageSelected){
								return lreturn
							}
							lLanguageSelected=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonLanguageSelected).trim()
							if(lLanguageSelected.length()<=0){
								return lreturn
							}
						}
						lGroundPartnerAgentLanguage=lLanguageSelected.toUpperCase()
						String lTagProductSelectButton=''
						if(lIsGroundPartnerAgentIsMotorBike){
							lTagProductSelectButton='motorbike-btn'
						}else{
							lTagProductSelectButton='car-btn'
						}
						String lLocatorProductSelectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProductSelectButton)
						WebElement lElementProductSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProductSelectButton)
						if(!lElementProductSelectButton){
							if(lIsGroundPartnerAgentIsMotorBike){
								lLocatorProductSelectButton='#product-link img[alt="Motorbike insurance"]'
							}else{
								lLocatorProductSelectButton='#product-link img[alt="Car insurance"]'
							}
							lElementProductSelectButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorProductSelectButton)
							if(lElementProductSelectButton){
								WebElement lElementProductSelectButtonParentLevel1=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementProductSelectButton)
								WebElement lElementProductSelectButtonParentLevel2=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementProductSelectButtonParentLevel1)
								WebElement lElementProductSelectButtonParentLevel3=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementProductSelectButtonParentLevel2)
								lElementProductSelectButton=lElementProductSelectButtonParentLevel3
							}
						}
						if(!lElementProductSelectButton){
							return lreturn
						}
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementProductSelectButton)
						IGNUemaHelper.delayThreadSecond(5)
						String lTagProductSpecificPageSelectButton=''
						String lLocatorProductSpecificPageSelectButton=''
						if(lIsGroundPartnerAgentIsMotorBike){
							lLocatorProductSpecificPageSelectButton='#motorbike-insure-hero a'
						}else{
							lLocatorProductSpecificPageSelectButton='#car-insure-hero a'
						}
						Boolean lIsProductSpecificPageDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorProductSpecificPageSelectButton,5)
						lIsProductSpecificPageDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorProductSpecificPageSelectButton)
						if(lIsProductSpecificPageDisplayed){
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorProductSpecificPageSelectButton)
						}
					}
					lResult=true
					break
				default:
					lLocatorFormApp='#app form'
					THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
					this.driver.get(lGroundPartnerAgentUrlProductSelect)
					IGNUemaHelper.delayThreadSecond(5)
					lIsFormReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormApp,30)
					if(!lIsFormReady){
						this.driver.get(lGroundPartnerAgentUrlProductSelect)
						IGNUemaHelper.delayThreadSecond(8)
						lIsFormReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormApp,30)
					}
					if(!lIsFormReady){
						this.driver.get(lGroundPartnerAgentUrlProductSelect)
						IGNUemaHelper.delayThreadSecond(13)
						lIsFormReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormApp,30)
					}
					if(!lIsFormReady){
						return lreturn
					}
					String lTagButtonLanguageSelected='selected-lang'
					String lLocatorButtonLanguageSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonLanguageSelected)
					WebElement lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonLanguageSelected)
					if(!lElementButtonLanguageSelected){
						return lreturn
					}
					String lLanguageSelected=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonLanguageSelected).trim()
					if(lLanguageSelected.length()<=0){
						return lreturn
					}
					if(!lLanguageItem.equalsIgnoreCase(lLanguageSelected)){
						String lTagButtonLanguage='language'
						String lLocatorButtonLanguage=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonLanguage,lLanguageItem)
						WebElement lElementButtonLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonLanguage,lLanguageItem)
						if(!lElementButtonLanguage){
							return lreturn
						}
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguage)
						IGNUemaHelper.delayThreadSecond(1)
						lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonLanguageSelected)
						if(!lElementButtonLanguageSelected){
							return lreturn
						}
						lLanguageSelected=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonLanguageSelected).trim()
						if(lLanguageSelected.length()<=0){
							return lreturn
						}
					}
					lGroundPartnerAgentLanguage=lLanguageSelected.toUpperCase()
					String lTagInputEmailText='email'
					String lLocatorInputEmailText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputEmailText)
					String lGroundPartnerAgentUser=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputEmailText,THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_USER)
					if(lGroundPartnerAgentUser.length()<=0){
						return lreturn
					}
					String lTagSelectGroundPartnerAgentProduct='product-type'
					String lLocatorSelectGroundPartnerAgentProduct=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectGroundPartnerAgentProduct)
					WebElement lElementSelectGroundPartnerAgentProduct=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectGroundPartnerAgentProduct)
					if(!lElementSelectGroundPartnerAgentProduct){
						return lreturn
					}
					Select lSelectGroundPartnerAgentProduct=new Select(lElementSelectGroundPartnerAgentProduct)
					if(lIsGroundPartnerAgentIsMotorBike){
						lSelectGroundPartnerAgentProduct.selectByValue('motorbike')
					}else{
						lSelectGroundPartnerAgentProduct.selectByValue('car')
					}
					WebElement lElementSelectGroundPartnerAgentProductSelected=lSelectGroundPartnerAgentProduct.getFirstSelectedOption()
					String lGroundPartnerAgentProduct=lElementSelectGroundPartnerAgentProductSelected.getText().trim()
					if(lGroundPartnerAgentProduct.length()<=0){
						return lreturn
					}
					String lTagButtonGroundPartnerAgentSubmit='login-btn'
					String lLocatorButtonGroundPartnerAgentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonGroundPartnerAgentSubmit)
					WebElement lElementButtonGroundPartnerAgentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonGroundPartnerAgentSubmit)
					if(!lElementButtonGroundPartnerAgentSubmit){
						return lreturn
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonGroundPartnerAgentSubmit)
					IGNUemaHelper.delayThreadSecond(5)
					lResult=true
					break
			}
			Boolean lIsOK=false
			String lLocatorGroundPartnerAgentUser='#agent'
			WebElement lElementGroundPartnerAgentUser=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentUser)
			if(!lElementGroundPartnerAgentUser){
				IGNUemaHelper.delayThreadSecond(3)
				lElementGroundPartnerAgentUser=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentUser)
			}
			if(!lElementGroundPartnerAgentUser){
				IGNUemaHelper.delayThreadSecond(5)
				lElementGroundPartnerAgentUser=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentUser)
			}
			if(!lElementGroundPartnerAgentUser){
				IGNUemaHelper.delayThreadSecond(8)
				lElementGroundPartnerAgentUser=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentUser)
			}
			if(!lElementGroundPartnerAgentUser){
				IGNUemaHelper.delayThreadSecond(13)
				lElementGroundPartnerAgentUser=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentUser)
			}
			if(!lElementGroundPartnerAgentUser){
				IGNUemaHelper.printLog('No GroundPartnerAgentUserText')
				return lreturn
			}
			String lGroundPartnerAgentUserText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementGroundPartnerAgentUser).trim()
			lIsOK=lGroundPartnerAgentUserText.length()>0
			lResult=lIsOK
			if(lResult){
				lreturn.put('GroundPartnerAgentLoginMethod',lGroundPartnerAgentLoginMethod)
				lreturn.put('GroundPartnerAgentAccountSource',lGroundPartnerAgentAccountSource)
				lreturn.put('GroundPartnerAgentUrlProductSelect',lGroundPartnerAgentUrlProductSelect)
				lreturn.put('GroundPartnerAgentLanguage',lGroundPartnerAgentLanguage)
				lreturn.put('GroundPartnerAgentIsMotorBike',lGroundPartnerAgentIsMotorBike)
				lreturn.put('GroundPartnerAgentSkipLoginUrl',lGroundPartnerAgentSkipLoginUrl)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentLanguage(String strGroundPartnerAgentLanguage){
		Map lreturn=[:]
		String lGroundPartnerAgentLanguage=strGroundPartnerAgentLanguage.trim()
		if(lGroundPartnerAgentLanguage.length()<=0){
			lGroundPartnerAgentLanguage=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE
		}
		Map lGroundPartnerAgentLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentLanguage','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentLanguageItem=lGroundPartnerAgentLanguageList.get(lGroundPartnerAgentLanguage)
			if(!lGroundPartnerAgentLanguageItem){
				lGroundPartnerAgentLanguageItem=lGroundPartnerAgentLanguageList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE)
			}
			String lTagButtonLanguageSelected=''
			String lLocatorButtonLanguageSelected='#app #select-lang a'
			WebElement lElementButtonLanguageSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButtonLanguageSelected)
			if(!lElementButtonLanguageSelected){
				return lreturn
			}
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguageSelected)
			IGNUemaHelper.delayThreadSecond(1)
			lGroundPartnerAgentLanguageItem=lGroundPartnerAgentLanguageItem.toLowerCase()
			String lTagButtonLanguage='language'
			String lLocatorButtonLanguage=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonLanguage,lGroundPartnerAgentLanguageItem)
			WebElement lElementButtonLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonLanguage,lGroundPartnerAgentLanguageItem)
			if(!lElementButtonLanguage){
				return lreturn
			}
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonLanguage)
			IGNUemaHelper.delayThreadSecond(1)
			lGroundPartnerAgentLanguageItem=lGroundPartnerAgentLanguageItem.toUpperCase()
			String lLanguageSelected=lGroundPartnerAgentLanguageItem
			lGroundPartnerAgentLanguage=lLanguageSelected
			lResult=lGroundPartnerAgentLanguage.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentLanguage',lGroundPartnerAgentLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentRoojaiPurchaseToDo(String strGroundPartnerAgentRoojaiPurchaseToDo){
		Map lreturn=[:]
		String lGroundPartnerAgentRoojaiPurchaseToDo=strGroundPartnerAgentRoojaiPurchaseToDo.trim()
		if(lGroundPartnerAgentRoojaiPurchaseToDo.length()<=0){
			lGroundPartnerAgentRoojaiPurchaseToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_ROOJAI_PURCHASE_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentRoojaiPurchaseToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentRoojaiPurchaseToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentRoojaiPurchaseToDo)
			lGroundPartnerAgentRoojaiPurchaseToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentRoojaiPurchaseToDo)
			lResult=lGroundPartnerAgentRoojaiPurchaseToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentRoojaiPurchaseToDo',lGroundPartnerAgentRoojaiPurchaseToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportToDo(String strGroundPartnerAgentMenuRenewalReportToDo){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportToDo=strGroundPartnerAgentMenuRenewalReportToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportToDo)
			lGroundPartnerAgentMenuRenewalReportToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportToDo)
			String lTagMenuRenewalButton='menu-renewal-report'
			String lLocatorMenuRenewalButton=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuRenewalButton)
			WebElement lElementMenuRenewalButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagMenuRenewalButton)
			if(!lElementMenuRenewalButton){
				return lreturn
			}
			if(lIsGroundPartnerAgentMenuRenewalReportToDo){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRenewalButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRenewalButton)
				this.waitUntilLoaded()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportToDo',lGroundPartnerAgentMenuRenewalReportToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo(String strGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=strGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_ADVANCE_FILTER_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportAdvanceFilterToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo)
			lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo)
			String lTagMenuRenewalButton='menu-renewal-report'
			String lLocatorMenuRenewalButton=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuRenewalButton)
			WebElement lElementMenuRenewalButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagMenuRenewalButton)
			if(!lElementMenuRenewalButton){
				return lreturn
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRenewalButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRenewalButton)
				this.waitUntilLoaded()
			}
			String lTagGroundPartnerAgentMenuRenewalReportAdvanceFilterButton='advance-search'
			String lLocatorGroundPartnerAgentMenuRenewalReportAdvanceFilterButton=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentMenuRenewalReportAdvanceFilterButton)
			WebElement lElementGroundPartnerAgentMenuRenewalReportAdvanceFilterButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentMenuRenewalReportAdvanceFilterButton)
			if(!lElementGroundPartnerAgentMenuRenewalReportAdvanceFilterButton){
				return lreturn
			}
			if(lIsGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportAdvanceFilterButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportAdvanceFilterButton)
				this.waitUntilLoaded()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportAdvanceFilterToDo',lGroundPartnerAgentMenuRenewalReportAdvanceFilterToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo(String strGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo,String strGroundPartnerAgentMenuRenewalReportFilterDateTypeBy){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=strGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_DATE_TYPE_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=strGroundPartnerAgentMenuRenewalReportFilterDateTypeBy.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_DATE_TYPE_BY
		}
		Map lRenewalReportFilterDateTypeList=['1':'1','2':'2']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterDateTypeToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterDateTypeBy','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo)
			lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo)
			String lTagRenewalReportFilterDateTypeButton='select-date-type-dropdown'
			String lLocatorRenewalReportFilterDateTypeButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportFilterDateTypeButton)
			WebElement lElementRenewalReportFilterDateTypeButton=null
			Integer lRenewalReportFilterDateTypeItemIndex=0
			String lRenewalReportFilterDateTypeItem=''
			if(lIsGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo){
				lRenewalReportFilterDateTypeItem=lRenewalReportFilterDateTypeList.get(lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy)
				lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=''
				if(!lRenewalReportFilterDateTypeItem){
					lRenewalReportFilterDateTypeItem=lRenewalReportFilterDateTypeList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_DATE_TYPE_BY)
				}
				lElementRenewalReportFilterDateTypeButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportFilterDateTypeButton)
				if(lElementRenewalReportFilterDateTypeButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportFilterDateTypeButton)
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementRenewalReportFilterDateTypeButton)
				}
				Map lMapRenewalReportFilterDateTypeItem=this.validateRenewalReportFilterDateTypeItem(lElementRenewalReportFilterDateTypeButton,lRenewalReportFilterDateTypeItem)
				lRenewalReportFilterDateTypeItemIndex=lMapRenewalReportFilterDateTypeItem.IndexDateType
				lIsGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=lMapRenewalReportFilterDateTypeItem.Result
				lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo)
			}
			if(lIsGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo){
				lRenewalReportFilterDateTypeItem=IGNUemaHelper.selectOptionSelectByWebElementV2(this.driver,lElementRenewalReportFilterDateTypeButton,lRenewalReportFilterDateTypeItemIndex,false)
				if(lRenewalReportFilterDateTypeItem.length()<=0){
					lRenewalReportFilterDateTypeItem=lRenewalReportFilterDateTypeList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_DATE_TYPE_BY)
					lRenewalReportFilterDateTypeItem=IGNUemaHelper.selectOptionSelectByWebElementV2(this.driver,lElementRenewalReportFilterDateTypeButton,lRenewalReportFilterDateTypeItemIndex,false)
				}
				WebElement lElementRenewalReportFilterDateTypeSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportFilterDateTypeButton)
				if(!lElementRenewalReportFilterDateTypeSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportFilterDateTypeSelected)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterDateTypeToDo',lGroundPartnerAgentMenuRenewalReportFilterDateTypeToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterDateTypeBy',lGroundPartnerAgentMenuRenewalReportFilterDateTypeBy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo(String strGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo,String strGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=strGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_OPPORTUNITY_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=strGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_OPPORTUNITY_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterOpportunityToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterOpportunityNumber','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo)
			lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo)
			if(lIsGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo){
				String lTagReportFilterOpportunityInputText='opportunity'
				String lLocatorReportFilterOpportunityInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagReportFilterOpportunityInputText)
				WebElement lElementReportFilterOpportunityInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagReportFilterOpportunityInputText)
				if(!lElementReportFilterOpportunityInputText){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementReportFilterOpportunityInputText,lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterOpportunityToDo',lGroundPartnerAgentMenuRenewalReportFilterOpportunityToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterOpportunityNumber',lGroundPartnerAgentMenuRenewalReportFilterOpportunityNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo(String strGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo,String strGroundPartnerAgentMenuRenewalReportFilterHolderNameBy){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=strGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_HOLDER_NAME_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy=strGroundPartnerAgentMenuRenewalReportFilterHolderNameBy.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_HOLDER_NAME_BY
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterHolderNameToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterHolderNameBy','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo)
			lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo)
			if(lIsGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo){
				String lTagRenewalReportFilterHolderNameInputText='name'
				String lLocatorRenewalReportFilterHolderNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportFilterHolderNameInputText)
				WebElement lElementRenewalReportFilterHolderNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportFilterHolderNameInputText)
				if(!lElementRenewalReportFilterHolderNameInputText){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy=IGNUemaHelper.typeTextByWebElement(this.driver,lElementRenewalReportFilterHolderNameInputText,lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterHolderNameToDo',lGroundPartnerAgentMenuRenewalReportFilterHolderNameToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterHolderNameBy',lGroundPartnerAgentMenuRenewalReportFilterHolderNameBy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportFilterPhoneToDo(String strGroundPartnerAgentMenuRenewalReportFilterPhoneToDo,String strGroundPartnerAgentMenuRenewalReportFilterPhoneNumber){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=strGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_PHONE_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber=strGroundPartnerAgentMenuRenewalReportFilterPhoneNumber.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_PHONE_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterPhoneToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterPhoneNumber','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo)
			lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterPhoneToDo)
			if(lIsGroundPartnerAgentMenuRenewalReportFilterPhoneToDo){
				String lTagRenewalReportFilterPhoneNumberInputText='phone-number'
				String lLocatorRenewalReportFilterPhoneNumberInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportFilterPhoneNumberInputText)
				WebElement lElementRenewalReportFilterPhoneNumberInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportFilterPhoneNumberInputText)
				if(!lElementRenewalReportFilterPhoneNumberInputText){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementRenewalReportFilterPhoneNumberInputText,lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterPhoneToDo',lGroundPartnerAgentMenuRenewalReportFilterPhoneToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterPhoneNumber',lGroundPartnerAgentMenuRenewalReportFilterPhoneNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportFilterEmailToDo(String strGroundPartnerAgentMenuRenewalReportFilterEmailToDo,String strGroundPartnerAgentMenuRenewalReportFilterEmailBy){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportFilterEmailToDo=strGroundPartnerAgentMenuRenewalReportFilterEmailToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterEmailToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterEmailToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_EMAIL_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportFilterEmailBy=strGroundPartnerAgentMenuRenewalReportFilterEmailBy.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterEmailBy.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterEmailBy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_EMAIL_BY
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterEmailToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterEmailBy','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportFilterEmailToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportFilterEmailToDo)
			lGroundPartnerAgentMenuRenewalReportFilterEmailToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterEmailToDo)
			if(lIsGroundPartnerAgentMenuRenewalReportFilterEmailToDo){
				String lTagRenewalReportFilterEmailInputText='email'
				String lLocatorRenewalReportFilterEmailInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportFilterEmailInputText)
				WebElement lElementRenewalReportFilterEmailInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportFilterEmailInputText)
				if(!lElementRenewalReportFilterEmailInputText){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportFilterEmailBy=IGNUemaHelper.typeTextByWebElement(this.driver,lElementRenewalReportFilterEmailInputText,lGroundPartnerAgentMenuRenewalReportFilterEmailBy)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportFilterEmailToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterEmailToDo',lGroundPartnerAgentMenuRenewalReportFilterEmailToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterEmailBy',lGroundPartnerAgentMenuRenewalReportFilterEmailBy)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo(String strGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo,String strGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=strGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_CAR_PLATE_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=strGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber.trim()
		if(lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber.length()<=0){
			lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_FILTER_CAR_PLATE_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterCarPlateToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportFilterCarPlateNumber','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo)
			lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo)
			if(lIsGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo){
				String lTagGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText='plate'
				String lLocatorGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText)
				WebElement lElementGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText)
				if(!lElementGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportFilterCarPlateNumberInputText,lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterCarPlateToDo',lGroundPartnerAgentMenuRenewalReportFilterCarPlateToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportFilterCarPlateNumber',lGroundPartnerAgentMenuRenewalReportFilterCarPlateNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo,String strGroundPartnerAgentIsMotorBike){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_TO_DO
		}
		String lGroundPartnerAgentIsMotorBike=strGroundPartnerAgentIsMotorBike.trim()
		if(lGroundPartnerAgentIsMotorBike.length()<=0){
			lGroundPartnerAgentIsMotorBike=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_IS_MOTOR_BIKE
		}
		Map lGroundPartnerAgentProductMotorList=['false':'2','true':'3']
		String lGroundPartnerAgentRenewalReportDataRange=''
		String lGroundPartnerAgentRenewalReportSearchDate=''
		String lGroundPartnerAgentRenewalReportCardSelectedOpportunity=''
		String lGroundPartnerAgentRenewalReportCardSelectedDetail=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailToDo','')
			lreturn.put('GroundPartnerAgentIsMotorBike','')
			lreturn.put('GroundPartnerAgentRenewalReportDataRange','')
			lreturn.put('GroundPartnerAgentRenewalReportSearchDate','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedOpportunity','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedDetail','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo)
			Boolean lIsGroundPartnerAgentIsMotorBike=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentIsMotorBike)
			THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE=lIsGroundPartnerAgentIsMotorBike
			lGroundPartnerAgentIsMotorBike=IGNUemaHelper.convertBooleanToString(lIsGroundPartnerAgentIsMotorBike)
			String lGroundPartnerAgentProductMotorItem=lGroundPartnerAgentProductMotorList.get(lGroundPartnerAgentIsMotorBike)
			if(!lGroundPartnerAgentProductMotorItem){
				lGroundPartnerAgentProductMotorItem=lGroundPartnerAgentProductMotorList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_IS_MOTOR_BIKE)
			}
			String lTagGroundPartnerAgentProductMotorButton='select-product-dropdown'
			String lLocatorGroundPartnerAgentProductMotorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentProductMotorButton)
			WebElement lElementGroundPartnerAgentProductMotorButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentProductMotorButton)
			if(!lElementGroundPartnerAgentProductMotorButton){
				return lreturn
			}
			if(lElementGroundPartnerAgentProductMotorButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentProductMotorButton)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementGroundPartnerAgentProductMotorButton)
			}
			Boolean lIsGroundPartnerAgentFoundProductName=false
			Integer lGroundPartnerAgentProductMotorItemIndex=0
			Map lMapGroundPartnerAgentProductMotorItem=this.validateGroundPartnerAgentProductMotorItem(lElementGroundPartnerAgentProductMotorButton,lGroundPartnerAgentProductMotorItem)
			if(!lMapGroundPartnerAgentProductMotorItem.Result){
				lGroundPartnerAgentProductMotorItemIndex=0
			}else{
				lGroundPartnerAgentProductMotorItemIndex=lMapGroundPartnerAgentProductMotorItem.IndexProductName
			}
			if(!lMapGroundPartnerAgentProductMotorItem.Result){
				return lreturn
			}
			lIsGroundPartnerAgentFoundProductName=lMapGroundPartnerAgentProductMotorItem.Result
			if(lIsGroundPartnerAgentFoundProductName){
				lGroundPartnerAgentProductMotorItem=IGNUemaHelper.selectOptionSelectByWebElementV2(this.driver,lElementGroundPartnerAgentProductMotorButton,lGroundPartnerAgentProductMotorItemIndex,false)
				Integer lIndexItem=0
				Integer lIndexTry=0
				String lTagRenewalReportButton='select-date-value-dropdown'
				String lLocatorRenewalReportButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportButton)
				String lTagRenewalReportDropdownList='date-value-dropdown-item'
				String lLocatorRenewalReportDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportDropdownList)
				List<WebElement> lElementRenewalReportDropdownList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRenewalReportDropdownList)
				if(!lElementRenewalReportDropdownList){
					return lreturn
				}
				lIndexItem=lElementRenewalReportDropdownList.size()
				String lRenewalReportItem=lIndexItem.toString()
				lRenewalReportItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportButton,lTagRenewalReportDropdownList,lRenewalReportItem)
				String lTagRenewalReportSearchButton='search-refresh'
				String lLocatorRenewalReportSearchButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportSearchButton)
				WebElement lElementRenewalReportSearchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportSearchButton)
				if(!lElementRenewalReportSearchButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportSearchButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRenewalReportSearchButton)
				this.waitUntilLoaded()
				String lTagRenewalReportCardList='card-detail-list'
				String lLocatorRenewalReportCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportCardList)
				List<WebElement> lElementRenewalReportCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRenewalReportCardList)
				if(!lElementRenewalReportCardList.size()){
					for(lIndexTry=1;lIndexTry<=lIndexItem;lIndexTry++){
						lRenewalReportItem=lIndexTry.toString()
						lRenewalReportItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportButton,lTagRenewalReportDropdownList,lRenewalReportItem)
						lElementRenewalReportSearchButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportSearchButton)
						if(!lElementRenewalReportSearchButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportSearchButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRenewalReportSearchButton)
						this.waitUntilLoaded()
						lElementRenewalReportCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRenewalReportCardList)
						if(lElementRenewalReportCardList.size()){
							break
						}
					}
				}
				if(!lElementRenewalReportCardList.size()){
					return lreturn
				}
				lGroundPartnerAgentRenewalReportDataRange=IGNUemaHelper.getElementAttributeByWebElement(this.driver,IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#calendar .form-control'),'value').trim()
				WebElement lElementGroundPartnerAgentRenewalReportSearchDate=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportButton)
				lGroundPartnerAgentRenewalReportSearchDate=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportSearchDate).trim()
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo){
					WebElement lElementlElementRenewalReportCardSelect=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRenewalReportCardList)
					if(!lElementlElementRenewalReportCardSelect){
						return lreturn
					}
					lGroundPartnerAgentRenewalReportCardSelectedOpportunity=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementlElementRenewalReportCardSelect)
					THARGPAMotorCoreType.CURRENT_GROUND_PARTNER_AGENT_RENEWAL_REPORT_CARD_SELECTED_OPPORTUNITY=lGroundPartnerAgentRenewalReportCardSelectedOpportunity
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementlElementRenewalReportCardSelect)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementlElementRenewalReportCardSelect)
					this.waitUntilLoaded()
					String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailDisplay=''
					String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailDisplay='#renewal_detail_modal'
					IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailDisplay,10)
					if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailDisplay)){
						return lreturn
					}
					lGroundPartnerAgentRenewalReportCardSelectedDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailDisplay)
					String lTagReportOpportunityDetailRenewalEditButton='edit-plan-btn'
					String lLocatorReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagReportOpportunityDetailRenewalEditButton)
					WebElement lElementReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagReportOpportunityDetailRenewalEditButton)
					if(!lElementReportOpportunityDetailRenewalEditButton){
						return lreturn
					}else{
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementReportOpportunityDetailRenewalEditButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementReportOpportunityDetailRenewalEditButton)
						this.waitUntilLoaded()
						String lTagRenewalReportOpportunityDetailEditModalForm='edit-plan-modal'
						String lLocatorRenewalReportOpportunityDetailEditModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailEditModalForm)
						WebElement lElementRenewalReportOpportunityDetailEditModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
						Boolean lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm,10)
						lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
						if(!lIsRenewalReportOpportunityDetailEditModalFormDisplayed){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementReportOpportunityDetailRenewalEditButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementReportOpportunityDetailRenewalEditButton)
							this.waitUntilLoaded()
						}
						lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
						if(!lIsRenewalReportOpportunityDetailEditModalFormDisplayed){
							return lreturn
						}
					}
				}
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailToDo)
				lreturn.put('GroundPartnerAgentIsMotorBike',lGroundPartnerAgentIsMotorBike)
				lreturn.put('GroundPartnerAgentRenewalReportDataRange',lGroundPartnerAgentRenewalReportDataRange)
				lreturn.put('GroundPartnerAgentRenewalReportSearchDate',lGroundPartnerAgentRenewalReportSearchDate)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedOpportunity',lGroundPartnerAgentRenewalReportCardSelectedOpportunity)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedDetail',lGroundPartnerAgentRenewalReportCardSelectedDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo)
			String lTagRenewalReportOpportunityDetailEditModalForm='edit-plan-modal'
			String lLocatorRenewalReportOpportunityDetailEditModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailEditModalForm)
			WebElement lElementRenewalReportOpportunityDetailEditModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
			Boolean lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm,10)
			lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
			if(!lIsRenewalReportOpportunityDetailEditModalFormDisplayed){
				String lTagReportOpportunityDetailRenewalEditButton='edit-plan-btn'
				String lLocatorReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagReportOpportunityDetailRenewalEditButton)
				WebElement lElementReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagReportOpportunityDetailRenewalEditButton)
				if(!lElementReportOpportunityDetailRenewalEditButton){
					return lreturn
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementReportOpportunityDetailRenewalEditButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementReportOpportunityDetailRenewalEditButton)
					this.waitUntilLoaded()
				}
			}
			lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
			if(!lIsRenewalReportOpportunityDetailEditModalFormDisplayed){
				return lreturn
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_PLAN_TYPE_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_TYPE
		}
		Map lRenewalPlanTypeList=['1':'1','2':'2','3':'3','4':'4','5':'5']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo)
			String lRenewalReportOpportunityDetailRenewalPlanTypeItem=lRenewalPlanTypeList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType)
			if(!lRenewalReportOpportunityDetailRenewalPlanTypeItem){
				lRenewalReportOpportunityDetailRenewalPlanTypeItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_TYPE
			}
			String lRenewalReportOpportunityDetailRenewalPlanTypeText=lRenewalReportOpportunityDetailRenewalPlanTypeItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=''
			String lTagRenewalReportOpportunityDetailRenewalPlanTypeButton='select-type-class-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanTypeButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanTypeButton)
			String lTagRenewalReportOpportunityDetailRenewalPlanTypeDropdownList='type-class-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanTypeDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanTypeDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanTypeButton)
			if(!lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo){
				String lRenewalReportOpportunityDetailRenewalPlanTypeOld=''
				String lRenewalReportOpportunityDetailRenewalPlanTypeNew=''
				lRenewalReportOpportunityDetailRenewalPlanTypeOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected)
				lRenewalReportOpportunityDetailRenewalPlanTypeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanTypeButton,lTagRenewalReportOpportunityDetailRenewalPlanTypeDropdownList,lRenewalReportOpportunityDetailRenewalPlanTypeItem,true)
				if(lRenewalReportOpportunityDetailRenewalPlanTypeText.length()<=0){
					//Random Type New
					lRenewalReportOpportunityDetailRenewalPlanTypeNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanTypeOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanTypeNew)){
						lRenewalReportOpportunityDetailRenewalPlanTypeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanTypeButton,lTagRenewalReportOpportunityDetailRenewalPlanTypeDropdownList,lRenewalReportOpportunityDetailRenewalPlanTypeItem,true)
					}
					lRenewalReportOpportunityDetailRenewalPlanTypeNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanTypeOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanTypeNew)){
						lRenewalReportOpportunityDetailRenewalPlanTypeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanTypeButton,lTagRenewalReportOpportunityDetailRenewalPlanTypeDropdownList,lRenewalReportOpportunityDetailRenewalPlanTypeItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanTypeButton)
				if(!lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanTypeSelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanTypeToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_PLAN_GARAGE_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_GARAGE
		}
		Map lRenewalPlanGarageList=['1':'1','2':'2']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo)
			String lRenewalReportOpportunityDetailRenewalPlanGarageItem=lRenewalPlanGarageList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage)
			if(!lRenewalReportOpportunityDetailRenewalPlanGarageItem){
				lRenewalReportOpportunityDetailRenewalPlanGarageItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_GARAGE
			}
			String lRenewalReportOpportunityDetailRenewalPlanGarageText=lRenewalReportOpportunityDetailRenewalPlanGarageItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=''
			String lTagRenewalReportOpportunityDetailRenewalPlanGarageButton='select-garage-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanGarageButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanGarageButton)
			String lTagRenewalReportOpportunityDetailRenewalPlanGarageDropdownList='garage-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanGarageDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanGarageDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanGarageButton)
			if(!lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo){
				String lRenewalReportOpportunityDetailRenewalPlanGarageOld=''
				String lRenewalReportOpportunityDetailRenewalPlanGarageNew=''
				lRenewalReportOpportunityDetailRenewalPlanGarageOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected)
				lRenewalReportOpportunityDetailRenewalPlanGarageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanGarageButton,lTagRenewalReportOpportunityDetailRenewalPlanGarageDropdownList,lRenewalReportOpportunityDetailRenewalPlanGarageItem,true)
				if(lRenewalReportOpportunityDetailRenewalPlanGarageText.length()<=0){
					//Random Garage New
					lRenewalReportOpportunityDetailRenewalPlanGarageNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanGarageOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanGarageNew)){
						lRenewalReportOpportunityDetailRenewalPlanGarageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanGarageButton,lTagRenewalReportOpportunityDetailRenewalPlanGarageDropdownList,lRenewalReportOpportunityDetailRenewalPlanGarageItem,true)
					}
					lRenewalReportOpportunityDetailRenewalPlanGarageNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanGarageOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanGarageNew)){
						lRenewalReportOpportunityDetailRenewalPlanGarageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanGarageButton,lTagRenewalReportOpportunityDetailRenewalPlanGarageDropdownList,lRenewalReportOpportunityDetailRenewalPlanGarageItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanGarageButton)
				if(!lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanGarageSelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanGarageToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanGarage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_PLAN_EXCESS_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_EXCESS
		}
		Map lRenewalPlanExcessList=['1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7','8':'8','9':'9','10':'10','11':'11']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo)
			String lRenewalReportOpportunityDetailRenewalPlanExcessItem=lRenewalPlanExcessList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess)
			if(!lRenewalReportOpportunityDetailRenewalPlanExcessItem){
				lRenewalReportOpportunityDetailRenewalPlanExcessItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_EXCESS
			}
			String lRenewalReportOpportunityDetailRenewalPlanExcessText=lRenewalReportOpportunityDetailRenewalPlanExcessItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=''
			String lTagRenewalReportOpportunityDetailRenewalPlanExcessButton='select-excess-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanExcessButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanExcessButton)
			String lTagRenewalReportOpportunityDetailRenewalPlanExcessDropdownList='excess-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanExcessDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanExcessDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanExcessButton)
			if(!lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo){
				String lRenewalReportOpportunityDetailRenewalPlanExcessOld=''
				String lRenewalReportOpportunityDetailRenewalPlanExcessNew=''
				lRenewalReportOpportunityDetailRenewalPlanExcessOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected)
				lRenewalReportOpportunityDetailRenewalPlanExcessItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanExcessButton,lTagRenewalReportOpportunityDetailRenewalPlanExcessDropdownList,lRenewalReportOpportunityDetailRenewalPlanExcessItem,true)
				if(lRenewalReportOpportunityDetailRenewalPlanExcessText.length()<=0){
					//Random Excess New
					lRenewalReportOpportunityDetailRenewalPlanExcessNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanExcessOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanExcessNew)){
						lRenewalReportOpportunityDetailRenewalPlanExcessItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanExcessButton,lTagRenewalReportOpportunityDetailRenewalPlanExcessDropdownList,lRenewalReportOpportunityDetailRenewalPlanExcessItem,true)
					}
					lRenewalReportOpportunityDetailRenewalPlanExcessNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanExcessOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanExcessNew)){
						lRenewalReportOpportunityDetailRenewalPlanExcessItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanExcessButton,lTagRenewalReportOpportunityDetailRenewalPlanExcessDropdownList,lRenewalReportOpportunityDetailRenewalPlanExcessItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanExcessButton)
				if(!lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanExcessSelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanExcessToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanExcess)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_PLAN_DRIVER_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_DRIVER
		}
		Map lRenewalPlanDriverList=['1':'1','2':'2','3':'3','4':'4']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo)
			String lRenewalReportOpportunityDetailRenewalPlanDriverItem=lRenewalPlanDriverList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver)
			if(!lRenewalReportOpportunityDetailRenewalPlanDriverItem){
				lRenewalReportOpportunityDetailRenewalPlanDriverItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PLAN_DRIVER
			}
			String lRenewalReportOpportunityDetailRenewalPlanDriverText=lRenewalReportOpportunityDetailRenewalPlanDriverItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=''
			String lTagRenewalReportOpportunityDetailRenewalPlanDriverButton='select-name-driver-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanDriverButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanDriverButton)
			String lTagRenewalReportOpportunityDetailRenewalPlanDriverDropdownList='name-driver-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalPlanDriverDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPlanDriverDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanDriverButton)
			if(!lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo){
				String lRenewalReportOpportunityDetailRenewalPlanDriverOld=''
				String lRenewalReportOpportunityDetailRenewalPlanDriverNew=''
				lRenewalReportOpportunityDetailRenewalPlanDriverOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected)
				lRenewalReportOpportunityDetailRenewalPlanDriverItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanDriverButton,lTagRenewalReportOpportunityDetailRenewalPlanDriverDropdownList,lRenewalReportOpportunityDetailRenewalPlanDriverItem,true)
				if(lRenewalReportOpportunityDetailRenewalPlanDriverText.length()<=0){
					//Random Driver New
					lRenewalReportOpportunityDetailRenewalPlanDriverNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanDriverOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanDriverNew)){
						lRenewalReportOpportunityDetailRenewalPlanDriverItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanDriverButton,lTagRenewalReportOpportunityDetailRenewalPlanDriverDropdownList,lRenewalReportOpportunityDetailRenewalPlanDriverItem,true)
					}
					lRenewalReportOpportunityDetailRenewalPlanDriverNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected)
					if(lRenewalReportOpportunityDetailRenewalPlanDriverOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPlanDriverNew)){
						lRenewalReportOpportunityDetailRenewalPlanDriverItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanDriverButton,lTagRenewalReportOpportunityDetailRenewalPlanDriverDropdownList,lRenewalReportOpportunityDetailRenewalPlanDriverItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPlanDriverButton)
				if(!lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPlanDriverSelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPlanDriverToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPlanDriver)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_TPBI_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_TPBI
		}
		Map lRenewalTpbiList=['1':'1','2':'2','3':'3','4':'4','5':'5']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo)
			String lRenewalReportOpportunityDetailRenewalTpbiItem=lRenewalTpbiList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi)
			if(!lRenewalReportOpportunityDetailRenewalTpbiItem){
				lRenewalReportOpportunityDetailRenewalTpbiItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_TPBI
			}
			String lRenewalReportOpportunityDetailRenewalTpbiText=lRenewalReportOpportunityDetailRenewalTpbiItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=''
			String lTagRenewalReportOpportunityDetailRenewalTpbiButton='select-tpbi-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalTpbiButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalTpbiButton)
			String lTagRenewalReportOpportunityDetailRenewalTpbiDropdownList='tpbi-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalTpbiDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalTpbiDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalTpbiSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalTpbiButton)
			if(!lElementRenewalReportOpportunityDetailRenewalTpbiSelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo){
				String lRenewalReportOpportunityDetailRenewalTpbiOld=''
				String lRenewalReportOpportunityDetailRenewalTpbiNew=''
				lRenewalReportOpportunityDetailRenewalTpbiOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalTpbiSelected)
				lRenewalReportOpportunityDetailRenewalTpbiItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalTpbiButton,lTagRenewalReportOpportunityDetailRenewalTpbiDropdownList,lRenewalReportOpportunityDetailRenewalTpbiItem,true)
				if(lRenewalReportOpportunityDetailRenewalTpbiText.length()<=0){
					//Random Tpbi New
					lRenewalReportOpportunityDetailRenewalTpbiNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalTpbiSelected)
					if(lRenewalReportOpportunityDetailRenewalTpbiOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalTpbiNew)){
						lRenewalReportOpportunityDetailRenewalTpbiItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalTpbiButton,lTagRenewalReportOpportunityDetailRenewalTpbiDropdownList,lRenewalReportOpportunityDetailRenewalTpbiItem,true)
					}
					lRenewalReportOpportunityDetailRenewalTpbiNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalTpbiSelected)
					if(lRenewalReportOpportunityDetailRenewalTpbiOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalTpbiNew)){
						lRenewalReportOpportunityDetailRenewalTpbiItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalTpbiButton,lTagRenewalReportOpportunityDetailRenewalTpbiDropdownList,lRenewalReportOpportunityDetailRenewalTpbiItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalTpbiSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalTpbiButton)
				if(!lElementRenewalReportOpportunityDetailRenewalTpbiSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalTpbiSelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditTpbiToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalTpbi)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_PA_AND_ME_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PA_AND_ME
		}
		Map lRenewalPaAndMeList=['1':'1','2':'2','3':'3']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo)
			String lRenewalReportOpportunityDetailRenewalPaAndMeItem=lRenewalPaAndMeList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe)
			if(!lRenewalReportOpportunityDetailRenewalPaAndMeItem){
				lRenewalReportOpportunityDetailRenewalPaAndMeItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PA_AND_ME
			}
			String lRenewalReportOpportunityDetailRenewalPaAndMeText=lRenewalReportOpportunityDetailRenewalPaAndMeItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=''
			String lTagRenewalReportOpportunityDetailRenewalPaAndMeButton='select-pame-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalPaAndMeButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPaAndMeButton)
			String lTagRenewalReportOpportunityDetailRenewalPaAndMeDropdownList='pame-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalPaAndMeDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPaAndMeDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPaAndMeButton)
			if(!lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo){
				String lRenewalReportOpportunityDetailRenewalPaAndMeOld=''
				String lRenewalReportOpportunityDetailRenewalPaAndMeNew=''
				lRenewalReportOpportunityDetailRenewalPaAndMeOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected)
				lRenewalReportOpportunityDetailRenewalPaAndMeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPaAndMeButton,lTagRenewalReportOpportunityDetailRenewalPaAndMeDropdownList,lRenewalReportOpportunityDetailRenewalPaAndMeItem,true)
				if(lRenewalReportOpportunityDetailRenewalPaAndMeText.length()<=0){
					//Random PaAndMe New
					lRenewalReportOpportunityDetailRenewalPaAndMeNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected)
					if(lRenewalReportOpportunityDetailRenewalPaAndMeOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPaAndMeNew)){
						lRenewalReportOpportunityDetailRenewalPaAndMeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPaAndMeButton,lTagRenewalReportOpportunityDetailRenewalPaAndMeDropdownList,lRenewalReportOpportunityDetailRenewalPaAndMeItem,true)
					}
					lRenewalReportOpportunityDetailRenewalPaAndMeNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected)
					if(lRenewalReportOpportunityDetailRenewalPaAndMeOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPaAndMeNew)){
						lRenewalReportOpportunityDetailRenewalPaAndMeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPaAndMeButton,lTagRenewalReportOpportunityDetailRenewalPaAndMeDropdownList,lRenewalReportOpportunityDetailRenewalPaAndMeItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPaAndMeButton)
				if(!lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaAndMeSelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaAndMeToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaAndMe)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_PA_ONLY_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PA_ONLY
		}
		Map lRenewalPaOnlyList=['1':'1','2':'2','3':'3']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo)
			String lRenewalReportOpportunityDetailRenewalPaOnlyItem=lRenewalPaOnlyList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly)
			if(!lRenewalReportOpportunityDetailRenewalPaOnlyItem){
				lRenewalReportOpportunityDetailRenewalPaOnlyItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_PA_ONLY
			}
			String lRenewalReportOpportunityDetailRenewalPaOnlyText=lRenewalReportOpportunityDetailRenewalPaOnlyItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=''
			String lTagRenewalReportOpportunityDetailRenewalPaOnlyButton='select-pa-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalPaOnlyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPaOnlyButton)
			String lTagRenewalReportOpportunityDetailRenewalPaOnlyDropdownList='pa-dropdowm-item'
			String lLocatorRenewalReportOpportunityDetailRenewalPaOnlyDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalPaOnlyDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalPaOnlySelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPaOnlyButton)
			if(!lElementRenewalReportOpportunityDetailRenewalPaOnlySelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo){
				String lRenewalReportOpportunityDetailRenewalPaOnlyOld=''
				String lRenewalReportOpportunityDetailRenewalPaOnlyNew=''
				lRenewalReportOpportunityDetailRenewalPaOnlyOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaOnlySelected)
				lRenewalReportOpportunityDetailRenewalPaOnlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPaOnlyButton,lTagRenewalReportOpportunityDetailRenewalPaOnlyDropdownList,lRenewalReportOpportunityDetailRenewalPaOnlyItem,true)
				if(lRenewalReportOpportunityDetailRenewalPaOnlyText.length()<=0){
					//Random PaOnly New
					lRenewalReportOpportunityDetailRenewalPaOnlyNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaOnlySelected)
					if(lRenewalReportOpportunityDetailRenewalPaOnlyOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPaOnlyNew)){
						lRenewalReportOpportunityDetailRenewalPaOnlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPaOnlyButton,lTagRenewalReportOpportunityDetailRenewalPaOnlyDropdownList,lRenewalReportOpportunityDetailRenewalPaOnlyItem,true)
					}
					lRenewalReportOpportunityDetailRenewalPaOnlyNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaOnlySelected)
					if(lRenewalReportOpportunityDetailRenewalPaOnlyOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalPaOnlyNew)){
						lRenewalReportOpportunityDetailRenewalPaOnlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalPaOnlyButton,lTagRenewalReportOpportunityDetailRenewalPaOnlyDropdownList,lRenewalReportOpportunityDetailRenewalPaOnlyItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalPaOnlySelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalPaOnlyButton)
				if(!lElementRenewalReportOpportunityDetailRenewalPaOnlySelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalPaOnlySelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditPaOnlyToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalPaOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_ME_ONLY
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_ME_ONLY
		}
		Map lRenewalMeOnlyList=['1':'1','2':'2','3':'3']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo)
			String lRenewalReportOpportunityDetailRenewalMeOnlyItem=lRenewalMeOnlyList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly)
			if(!lRenewalReportOpportunityDetailRenewalMeOnlyItem){
				lRenewalReportOpportunityDetailRenewalMeOnlyItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_ME_ONLY
			}
			String lRenewalReportOpportunityDetailRenewalMeOnlyText=lRenewalReportOpportunityDetailRenewalMeOnlyItem
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=''
			String lTagRenewalReportOpportunityDetailRenewalMeOnlyButton='select-me-dropdown'
			String lLocatorRenewalReportOpportunityDetailRenewalMeOnlyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalMeOnlyButton)
			String lTagRenewalReportOpportunityDetailRenewalMeOnlyDropdownList='me-dropdown-item'
			String lLocatorRenewalReportOpportunityDetailRenewalMeOnlyDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailRenewalMeOnlyDropdownList)
			WebElement lElementRenewalReportOpportunityDetailRenewalMeOnlySelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalMeOnlyButton)
			if(!lElementRenewalReportOpportunityDetailRenewalMeOnlySelected){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo='No Option'
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo){
				String lRenewalReportOpportunityDetailRenewalMeOnlyOld=''
				String lRenewalReportOpportunityDetailRenewalMeOnlyNew=''
				lRenewalReportOpportunityDetailRenewalMeOnlyOld=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalMeOnlySelected)
				lRenewalReportOpportunityDetailRenewalMeOnlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalMeOnlyButton,lTagRenewalReportOpportunityDetailRenewalMeOnlyDropdownList,lRenewalReportOpportunityDetailRenewalMeOnlyItem,true)
				if(lRenewalReportOpportunityDetailRenewalMeOnlyText.length()<=0){
					//Random MeOnly New
					lRenewalReportOpportunityDetailRenewalMeOnlyNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalMeOnlySelected)
					if(lRenewalReportOpportunityDetailRenewalMeOnlyOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalMeOnlyNew)){
						lRenewalReportOpportunityDetailRenewalMeOnlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalMeOnlyButton,lTagRenewalReportOpportunityDetailRenewalMeOnlyDropdownList,lRenewalReportOpportunityDetailRenewalMeOnlyItem,true)
					}
					lRenewalReportOpportunityDetailRenewalMeOnlyNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalMeOnlySelected)
					if(lRenewalReportOpportunityDetailRenewalMeOnlyOld.equalsIgnoreCase(lRenewalReportOpportunityDetailRenewalMeOnlyNew)){
						lRenewalReportOpportunityDetailRenewalMeOnlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagRenewalReportOpportunityDetailRenewalMeOnlyButton,lTagRenewalReportOpportunityDetailRenewalMeOnlyDropdownList,lRenewalReportOpportunityDetailRenewalMeOnlyItem,true)
					}
				}
				lElementRenewalReportOpportunityDetailRenewalMeOnlySelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailRenewalMeOnlyButton)
				if(!lElementRenewalReportOpportunityDetailRenewalMeOnlySelected){
					return lreturn
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailRenewalMeOnlySelected).trim()
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditMeOnlyToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalMeOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_COMPULSORY_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_COMPULSORY
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(1,2)
		}
		Map lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryList=['1':'Yes','2':'No']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo)
			String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory)
			if(!lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryItem){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_COMPULSORY
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(1,2)
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory)
			}
			String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton=''
			String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton='#customize-compulsory'
			WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
			if(!lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo='No Option'
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryItem
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo){
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryOption=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryItem)
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryChecked){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
					this.waitUntilLoaded()
				}
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryOption){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
					this.waitUntilLoaded()
				}
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryButton)
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsoryChecked)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCompulsoryToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCompulsory)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_RSA_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_RSA
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(1,2)
		}
		Map lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaList=['1':'Yes','2':'No']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo)
			String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa)
			if(!lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaItem){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_RSA
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(1,2)
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa)
			}
			String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton=''
			String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton='#customize-rsa'
			WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
			if(!lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo='No Option'
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaItem
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo){
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaOption=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaItem)
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaChecked){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
					this.waitUntilLoaded()
				}
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaOption){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
					this.waitUntilLoaded()
				}
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaButton)
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsaChecked)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditRsaToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalRsa)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_EDIT_CRS_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=strGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_CRS
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(1,2)
		}
		Map lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsList=['1':'Yes','2':'No']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo)
			String lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs)
			if(!lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsItem){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_RENEWAL_CRS
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(1,2)
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs)
			}
			String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton=''
			String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton='#customize-crs'
			WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
			if(!lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton){
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo=false
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo='No Option'
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsItem
			}
			if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo){
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
				Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsOption=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsItem)
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsChecked){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
					this.waitUntilLoaded()
				}
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsOption){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
					this.waitUntilLoaded()
				}
				lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsButton)
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrsChecked)
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalEditCrsToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs',lGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalCrs)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentRenewalReportCardSelected(){
		Map lreturn=[:]
		String lGroundPartnerAgentRenewalReportCardSelectedPlanType=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanGarage=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanExcess=''
		String lGroundPartnerAgentRenewalReportCardSelectedPlanDriver=''
		String lGroundPartnerAgentRenewalReportCardSelectedTpbi=''
		String lGroundPartnerAgentRenewalReportCardSelectedPaAndMe=''
		String lGroundPartnerAgentRenewalReportCardSelectedPaOnly=''
		String lGroundPartnerAgentRenewalReportCardSelectedMeOnly=''
		String lGroundPartnerAgentRenewalReportCardSelectedCompulsory=''
		String lGroundPartnerAgentRenewalReportCardSelectedRsa=''
		String lGroundPartnerAgentRenewalReportCardSelectedCrs=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanType','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanGarage','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanExcess','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanDriver','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedTpbi','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPaAndMe','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPaOnly','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedMeOnly','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedCompulsory','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedRsa','')
			lreturn.put('GroundPartnerAgentRenewalReportCardSelectedCrs','')
			lreturn.put('Result',lResult)
			String lTagRenewalReportOpportunityDetailEditModalForm='edit-plan-modal'
			String lLocatorRenewalReportOpportunityDetailEditModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailEditModalForm)
			WebElement lElementRenewalReportOpportunityDetailEditModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
			Boolean lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm,10)
			lIsRenewalReportOpportunityDetailEditModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailEditModalForm)
			if(!lIsRenewalReportOpportunityDetailEditModalFormDisplayed){
				String lTagReportOpportunityDetailRenewalEditButton='edit-plan-btn'
				String lLocatorReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagReportOpportunityDetailRenewalEditButton)
				WebElement lElementReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagReportOpportunityDetailRenewalEditButton)
				if(!lElementReportOpportunityDetailRenewalEditButton){
					return lreturn
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementReportOpportunityDetailRenewalEditButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementReportOpportunityDetailRenewalEditButton)
					this.waitUntilLoaded()
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedPlanType='select-type-class-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedPlanType=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedPlanType)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedPlanType=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedPlanType)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedPlanType){
				lGroundPartnerAgentRenewalReportCardSelectedPlanType='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedPlanType=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedPlanType)
				if(lGroundPartnerAgentRenewalReportCardSelectedPlanType.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedPlanGarage='select-garage-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedPlanGarage=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedPlanGarage)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedPlanGarage=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedPlanGarage)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedPlanGarage){
				lGroundPartnerAgentRenewalReportCardSelectedPlanGarage='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedPlanGarage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedPlanGarage)
				if(lGroundPartnerAgentRenewalReportCardSelectedPlanGarage.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedPlanExcess='select-excess-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedPlanExcess=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedPlanExcess)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedPlanExcess=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedPlanExcess)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedPlanExcess){
				lGroundPartnerAgentRenewalReportCardSelectedPlanExcess='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedPlanExcess=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedPlanExcess)
				if(lGroundPartnerAgentRenewalReportCardSelectedPlanExcess.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedPlanDriver='select-name-driver-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedPlanDriver=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedPlanDriver)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedPlanDriver=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedPlanDriver)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedPlanDriver){
				lGroundPartnerAgentRenewalReportCardSelectedPlanDriver='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedPlanDriver=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedPlanDriver)
				if(lGroundPartnerAgentRenewalReportCardSelectedPlanDriver.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedTpbi='select-tpbi-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedTpbi=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedTpbi)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedTpbi=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedTpbi)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedTpbi){
				lGroundPartnerAgentRenewalReportCardSelectedTpbi='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedTpbi=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedTpbi)
				if(lGroundPartnerAgentRenewalReportCardSelectedTpbi.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedPaAndMe='select-pame-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedPaAndMe=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedPaAndMe)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedPaAndMe=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedPaAndMe)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedPaAndMe){
				lGroundPartnerAgentRenewalReportCardSelectedPaAndMe='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedPaAndMe=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedPaAndMe)
				if(lGroundPartnerAgentRenewalReportCardSelectedPaAndMe.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedPaOnly='select-pa-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedPaOnly=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedPaOnly)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedPaOnly=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedPaOnly)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedPaOnly){
				lGroundPartnerAgentRenewalReportCardSelectedPaOnly='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedPaOnly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedPaOnly)
				if(lGroundPartnerAgentRenewalReportCardSelectedPaOnly.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedMeOnly='select-me-dropdown'
			String lLocatGroundPartnerAgentRenewalReportCardSelectedMeOnlype=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedMeOnly)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedMeOnly=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedMeOnly)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedMeOnly){
				lGroundPartnerAgentRenewalReportCardSelectedMeOnly='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedMeOnly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedMeOnly)
				if(lGroundPartnerAgentRenewalReportCardSelectedMeOnly.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedCompulsory='compulsory'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedCompulsory=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedCompulsory)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedCompulsory=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedCompulsory)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedCompulsory){
				lGroundPartnerAgentRenewalReportCardSelectedCompulsory='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedCompulsory=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedCompulsory)
				if(lGroundPartnerAgentRenewalReportCardSelectedCompulsory.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedRsa='rsa'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedRsa=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedRsa)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedRsa=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedRsa)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedRsa){
				lGroundPartnerAgentRenewalReportCardSelectedRsa='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedRsa=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedRsa)
				if(lGroundPartnerAgentRenewalReportCardSelectedRsa.length()<=0){
					return lreturn
				}
			}
			String lTagGroundPartnerAgentRenewalReportCardSelectedCrs='select-crs-dropdown'
			String lLocatorGroundPartnerAgentRenewalReportCardSelectedCrs=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentRenewalReportCardSelectedCrs)
			WebElement lElementGroundPartnerAgentRenewalReportCardSelectedCrs=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentRenewalReportCardSelectedCrs)
			if(!lElementGroundPartnerAgentRenewalReportCardSelectedCrs){
				lGroundPartnerAgentRenewalReportCardSelectedCrs='No Option'
			}else{
				lGroundPartnerAgentRenewalReportCardSelectedCrs=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGroundPartnerAgentRenewalReportCardSelectedCrs)
				if(lGroundPartnerAgentRenewalReportCardSelectedCrs.length()<=0){
					return lreturn
				}
			}
			lResult=true
			if(lResult){
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanType',lGroundPartnerAgentRenewalReportCardSelectedPlanType)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanGarage',lGroundPartnerAgentRenewalReportCardSelectedPlanGarage)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanExcess',lGroundPartnerAgentRenewalReportCardSelectedPlanExcess)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPlanDriver',lGroundPartnerAgentRenewalReportCardSelectedPlanDriver)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedTpbi',lGroundPartnerAgentRenewalReportCardSelectedTpbi)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPaAndMe',lGroundPartnerAgentRenewalReportCardSelectedPaAndMe)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedPaOnly',lGroundPartnerAgentRenewalReportCardSelectedPaOnly)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedMeOnly',lGroundPartnerAgentRenewalReportCardSelectedMeOnly)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedCompulsory',lGroundPartnerAgentRenewalReportCardSelectedCompulsory)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedRsa',lGroundPartnerAgentRenewalReportCardSelectedRsa)
				lreturn.put('GroundPartnerAgentRenewalReportCardSelectedCrs',lGroundPartnerAgentRenewalReportCardSelectedCrs)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PDF_DOWNLOAD_TO_DO
		}
		String lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail=''
		String lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo','')
			lreturn.put('GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail','')
			lreturn.put('GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo=IGNUemaHelper.convertBooleanToString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo)
			String lTagRenewalReportOpportunityDetailPdfDownloadPDFDownload=''
			String lLocatorRenewalReportOpportunityDetailPdfDownloadPDFDownload='#btnPDFDrop'
			WebElement lElementRenewalReportOpportunityDetailPdfDownloadPDFDownload=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailPdfDownloadPDFDownload)
			if(lElementRenewalReportOpportunityDetailPdfDownloadPDFDownload){
				Boolean lIsRenewalReportOpportunityDetailPdfDownloadPDFDownloadDetail=false
				Boolean lIsRenewalReportOpportunityDetailPdfDownloadPDFDownloadResult=false
				Boolean lIsRenewalReportOpportunityDetailPdfDownloadPDFDownloadToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo)
				if(lIsRenewalReportOpportunityDetailPdfDownloadPDFDownloadToDo){
					lElementRenewalReportOpportunityDetailPdfDownloadPDFDownload=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPdfDownloadPDFDownload)
					if(!lElementRenewalReportOpportunityDetailPdfDownloadPDFDownload){
						return lreturn
					}
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportOpportunityDetailPdfDownloadPDFDownload)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRenewalReportOpportunityDetailPdfDownloadPDFDownload)
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
									lIsRenewalReportOpportunityDetailPdfDownloadPDFDownloadResult=true
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
					if(lIsRenewalReportOpportunityDetailPdfDownloadPDFDownloadResult){
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail='Passed'
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult='Passed'
					}else{
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail='Failed'
						lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult='Failed'
					}
				}
			}else{
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo='No Option'
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPdfDownloadToDo)
				lreturn.put('GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail',lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadDetail)
				lreturn.put('GroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult',lGroundPartnerAgentRenewalReportOpportunityDetailPdfDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK
		}
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink)
			String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera=''
			String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera='#customize-accept-terms-db'
			WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera)
			if(lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera)
				this.waitUntilLoaded()
			}
			String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection=''
			String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection='#customize-accept-terms'
			WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection)
			if(lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarInspection)
				this.waitUntilLoaded()
			}
			String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton='save-renewal'
			String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton)
			WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton)
			if(!lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo='No Option'
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink='No Option'
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentSaveButton)
				this.waitUntilLoaded()
				String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton='close-change-plan-btn'
				String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton)
				Boolean lIsRenewalReportOpportunityDetailPaymentSavePlanButtonDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton,10)
				lIsRenewalReportOpportunityDetailPaymentSavePlanButtonDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton)
				if(!lIsRenewalReportOpportunityDetailPaymentSavePlanButtonDisplayed){
					lIsRenewalReportOpportunityDetailPaymentSavePlanButtonDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton,10)
					lIsRenewalReportOpportunityDetailPaymentSavePlanButtonDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton)
				}
				WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton)
				if(!lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailSavePlanButton)
				this.waitUntilLoaded()
				String lLocatorCloseButton='.btn-close'
				WebElement lElementCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCloseButton)
				String lTagShorLink='short-link'
				String lLocatorShorLink=IGNUemaHelper.getTagDataSeleniumKey(lTagShorLink)
				WebElement lElementShorLink=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorShorLink)
				for(Integer lIndex=1;lIndex<=10;lIndex++){
					if(lElementCloseButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCloseButton)
					}
					if(lElementShorLink){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementShorLink)
					}
				}
				if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo){
					THARGPAMotorCoreType.CURRENT_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK=lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink
					if(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink){
						String lTagURLShorLinkText='short-link'
						String lLocatorURLShorLinkText=IGNUemaHelper.getTagDataSeleniumKey(lTagURLShorLinkText)
						WebElement lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
						lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
						if(!lElementURLShorLinkText){
							IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorURLShorLinkText,10)
							lElementURLShorLinkText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorURLShorLinkText)
						}
						if(!lElementURLShorLinkText){
							return lreturn
						}
						String lGroundPartnerAgentPaymentUrl=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementURLShorLinkText,'value').trim()
						if(lGroundPartnerAgentPaymentUrl.length()<=0){
							IGNUemaHelper.delayThreadSecond(5)
							lGroundPartnerAgentPaymentUrl=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementURLShorLinkText,'value').trim()
						}
						if(lGroundPartnerAgentPaymentUrl.length()<=0){
							return lreturn
						}
						Boolean lRedirected=false
						String lMainWindow=this.driver.getWindowHandle()
						if(lMainWindow.length()<=0){
							lMainWindow=this.driver.getWindowHandle()
						}
						String lUrlToNavigate=lGroundPartnerAgentPaymentUrl
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
							lSetWinHandle=this.driver.getWindowHandles()
							if(!lSetWinHandle){
								return lreturn
							}
							for(String lWindowHandle:lSetWinHandle){
								this.driver.switchTo().window(lWindowHandle)
								IGNUemaHelper.delayThreadSecond(3)
								this.driver.switchTo().window(lWindowHandle)
								IGNUemaHelper.delayThreadSecond(3)
							}
							String lLocatorMyAccountPaymentPage='#app main'
							lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMyAccountPaymentPage,15)
							if(!lRedirected){
								IGNUemaHelper.delayThreadSecond(1)
								WebUI.navigateToUrl(lUrlToNavigate)
								lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMyAccountPaymentPage,15)
							}
							if(!lRedirected){
								IGNUemaHelper.delayThreadSecond(1)
								WebUI.navigateToUrl(lUrlToNavigate)
								lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMyAccountPaymentPage,15)
							}
							if(!lRedirected){
								IGNUemaHelper.delayThreadSecond(1)
								WebUI.navigateToUrl(lUrlToNavigate)
								lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMyAccountPaymentPage,15)
							}
							if(lRedirected){
								String lCurrentURL=WebUI.getUrl()
								IGNUemaHelper.printLog(lCurrentURL)
								lRedirected=lCurrentURL.toUpperCase().contains('PPSTA')
							}
							if(!lRedirected){
								return lreturn
							}
						}catch(Exception ex){
							return lreturn
						}
					}else{
						String lTagReportOpportunityDetailRenewalEditButton='edit-plan-btn'
						String lLocatorReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagReportOpportunityDetailRenewalEditButton)
						WebElement lElementReportOpportunityDetailRenewalEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagReportOpportunityDetailRenewalEditButton)
						if(!lElementReportOpportunityDetailRenewalEditButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementReportOpportunityDetailRenewalEditButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementReportOpportunityDetailRenewalEditButton)
						this.waitUntilLoaded()
						lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera)
						if(lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailRenewalAvailableCarCamera)
							this.waitUntilLoaded()
						}
						String lTagRenewalReportOpportunityDetailPaymentConfirmButton='confirm-renewal'
						String lLocatorRenewalReportOpportunityDetailPaymentConfirmButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentConfirmButton)
						WebElement lElementRenewalReportOpportunityDetailPaymentConfirmButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentConfirmButton)
						if(!lElementRenewalReportOpportunityDetailPaymentConfirmButton){
							return lreturn
						}
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportOpportunityDetailPaymentConfirmButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRenewalReportOpportunityDetailPaymentConfirmButton)
						this.waitUntilLoaded()
					}
				}
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByPayOnlineLink)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LANGUAGE
		}
		Map lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage)
			if(!lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LANGUAGE)
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage='No Option'
			}else{
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem)
				if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem.length()<=0){
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LANGUAGE)
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem)
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguageItem.toUpperCase()
				if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage.length()<=0){
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage='No Option'
				}
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage.length()>0
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
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment,Boolean isRedirectToMyAccount){
		Map lreturn=[:]
		Boolean lIsRedirectToMyAccount=isRedirectToMyAccount
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly.trim()
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment.trim()
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		Map lRenewalReportOpportunityDetailPaymentCcInstalmentList=['1':'Monthly','2':'monthly no deposit','3':'Quarterly']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lIsYearly=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly)
			if(lIsRedirectToMyAccount){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly=''
				String lTagPaymentInstalmentOptionModalFormOpenButton='payment-option'
				String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
				WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
				if(!lElementPaymentInstalmentOptionModalFormOpenButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				String lTagPaymentInstalmentOptionModalForm=''
				String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
				WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
				Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
				if(!lIsPaymentInstalmentOptionModalFormDisplayed){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
					lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
					lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
				}
				if(!lIsPaymentInstalmentOptionModalFormDisplayed){
					return lreturn
				}
				lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
				if(!lElementPaymentInstalmentOptionModalForm){
					return lreturn
				}
				String lTagPaymentInstalmentOptionSelectedButton='selected-installment-option'
				String lLocatorPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionSelectedButton)
				WebElement lElementPaymentInstalmentOptionSelectedButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionSelectedButton)
				if(!lElementPaymentInstalmentOptionSelectedButton){
					return lreturn
				}
				String lPaymentInstalmentOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPaymentInstalmentOptionSelectedButton)
				String lTagPaymentInstalmentOptionItemButtonKey='installment-option'
				String lTagPaymentInstalmentOptionItemDefaultButtonValue=lPaymentInstalmentOptionSelectedValue
				String lLocatorPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
				WebElement lElementPaymentInstalmentOptionItemDefaultButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemDefaultButtonValue)
				if(!lElementPaymentInstalmentOptionItemDefaultButton){
					return lreturn
				}
				Integer lCcInstalmentMin=1
				Integer lCcInstalmentMax=3
				Integer lCcInstalmentDefault=1
				Integer lCcInstalmentNum=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment,lCcInstalmentDefault)
				if((lCcInstalmentNum<lCcInstalmentMin)||(lCcInstalmentNum>lCcInstalmentMax)){
					lCcInstalmentNum=lCcInstalmentDefault
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment=''
				String lTagPaymentInstalmentOptionItemYearlyButtonValue='Yearly'
				String lLocatorPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
				WebElement lElementPaymentInstalmentOptionItemYearlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemYearlyButtonValue)
				String lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue='Monthly'
				String lLocatorPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
				WebElement lElementPaymentInstalmentOptionItemMonthlyWithDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)
				String lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue='Monthly no deposit'
				String lLocatorPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
				WebElement lElementPaymentInstalmentOptionItemMonthlyNoDepositButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)
				String lTagPaymentInstalmentOptionItemQuarterlyButtonValue='Quarterly'
				String lLocatorPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
				WebElement lElementPaymentInstalmentOptionItemQuarterlyButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementPaymentInstalmentOptionModalForm,lTagPaymentInstalmentOptionItemButtonKey,lTagPaymentInstalmentOptionItemQuarterlyButtonValue)
				Integer lPaymentInstalmentOptionItemDefaultNum=0
				if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyWithDepositButtonValue)){
					lPaymentInstalmentOptionItemDefaultNum=1
				}
				if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemMonthlyNoDepositButtonValue)){
					lPaymentInstalmentOptionItemDefaultNum=2
				}
				if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemQuarterlyButtonValue)){
					lPaymentInstalmentOptionItemDefaultNum=3
				}
				if(!lIsYearly){
					if(!lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
						if(lPaymentInstalmentOptionItemDefaultNum<=0){
							return lreturn
						}
					}
					switch(lCcInstalmentNum){
						case 2:
							if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
								if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
									lIsYearly=true
								}else{
									lCcInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
								}
							}
							break
						case 3:
							if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
								if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
									lIsYearly=true
								}else{
									lCcInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
								}
							}
							break
						default:
							if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
								if(lTagPaymentInstalmentOptionItemDefaultButtonValue.equalsIgnoreCase(lTagPaymentInstalmentOptionItemYearlyButtonValue)){
									lIsYearly=true
								}else{
									lCcInstalmentNum=lPaymentInstalmentOptionItemDefaultNum
								}
							}
							break
					}
				}
				if(!lIsYearly){
					switch(lCcInstalmentNum){
						case 2:
							if(!lElementPaymentInstalmentOptionItemMonthlyNoDepositButton){
								return lreturn
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyNoDepositButton)
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment='Monthly No Deposit'
							break
						case 3:
							if(!lElementPaymentInstalmentOptionItemQuarterlyButton){
								return lreturn
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemQuarterlyButton)
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment='Quarterly'
							break
						default:
							if(!lElementPaymentInstalmentOptionItemMonthlyWithDepositButton){
								return lreturn
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemMonthlyWithDepositButton)
							lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment='Monthly With Deposit'
							break
					}
				}
				if(lIsYearly){
					if(!lElementPaymentInstalmentOptionItemYearlyButton){
						return lreturn
					}
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionItemYearlyButton)
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly=IGNUemaHelper.convertBooleanToYesNoString(lIsYearly)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
				if(lIsPaymentInstalmentOptionModalFormDisplayed){
					IGNUemaHelper.delayThreadSecond(3)
					lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
					lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
				}
				if(lIsPaymentInstalmentOptionModalFormDisplayed){
					return lreturn
				}
				if(lIsYearly){
					lGroundPartnerAgentRenewalReportPremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
				}else{
					switch(lCcInstalmentNum){
						case 2:
							lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
							lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice'))
							break
						case 3:
							lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
							lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
							break
						default:
							lGroundPartnerAgentRenewalReportPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
							lGroundPartnerAgentRenewalReportPremiumMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
							lGroundPartnerAgentRenewalReportPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-totalPrice'))
							break
					}
				}
			}else{
				Integer lCcInstalmentMin=1
				Integer lCcInstalmentMax=3
				Integer lCcInstalmentDefault=1
				Integer lCcInstalmentNum=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment,lCcInstalmentDefault)
				if((lCcInstalmentNum<lCcInstalmentMin)||(lCcInstalmentNum>lCcInstalmentMax)){
					lCcInstalmentNum=lCcInstalmentDefault
				}
				String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment
				String lRenewalReportOpportunityDetailPaymentCcYearlyItem=''
				String lTagRenewalReportOpportunityDetailPaymentCcButton='change-paymentFrequency-btn'
				String lLocatorRenewalReportOpportunityDetailPaymentCcButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentCcButton)
				String lTagRenewalReportOpportunityDetailPaymentCcDropdownList='select-paymentFrequency-btn'
				String lLocatorRenewalReportOpportunityDetailPaymentCcDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentCcDropdownList)
				if(lIsYearly){
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment=''
					lRenewalReportOpportunityDetailPaymentCcYearlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentCcButton,lTagRenewalReportOpportunityDetailPaymentCcDropdownList,'yearly')
					if(lRenewalReportOpportunityDetailPaymentCcYearlyItem.length()<=0){
						return lreturn
					}
				}
				if(!lIsYearly){
					String lRenewalReportOpportunityDetailPaymentCcInstalmentItem=lRenewalReportOpportunityDetailPaymentCcInstalmentList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment)
					if(!lRenewalReportOpportunityDetailPaymentCcInstalmentItem){
						lRenewalReportOpportunityDetailPaymentCcInstalmentItem=lRenewalReportOpportunityDetailPaymentCcInstalmentList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_INSTALMENT)
					}
					lRenewalReportOpportunityDetailPaymentCcInstalmentItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentCcButton,lTagRenewalReportOpportunityDetailPaymentCcDropdownList,lRenewalReportOpportunityDetailPaymentCcInstalmentItem)
					if(lRenewalReportOpportunityDetailPaymentCcInstalmentItem.length()<=0){
						lRenewalReportOpportunityDetailPaymentCcInstalmentItem=lRenewalReportOpportunityDetailPaymentCcInstalmentList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_INSTALMENT)
						lRenewalReportOpportunityDetailPaymentCcInstalmentItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentCcButton,lTagRenewalReportOpportunityDetailPaymentCcDropdownList,lRenewalReportOpportunityDetailPaymentCcInstalmentItem)
					}
					if(lRenewalReportOpportunityDetailPaymentCcInstalmentItem.length()<=0){
						lIsYearly=true
						lRenewalReportOpportunityDetailPaymentCcYearlyItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentCcButton,lTagRenewalReportOpportunityDetailPaymentCcDropdownList,'yearly')
						lRenewalReportOpportunityDetailPaymentCcInstalmentItem=''
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment=lRenewalReportOpportunityDetailPaymentCcInstalmentItem
				}
				if(lIsYearly){
					lGroundPartnerAgentRenewalReportPremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice')).trim()
				}else{
					switch(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption){
						case '2':
							lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'instalment-amount-due-today-price')).trim()
							lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice')).trim()
							break
						case '3':
							lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
							lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice')).trim()
							break
						default:
							lGroundPartnerAgentRenewalReportPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-first'))
							lGroundPartnerAgentRenewalReportPremiumMonthly=IGNUemaHelper.getChildTextByWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-instalment')).trim()
							lGroundPartnerAgentRenewalReportPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice')).trim()
							break
					}
				}
			}
			lResult=true
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly',lGroundPartnerAgentRenewalReportPremiumYearly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit',lGroundPartnerAgentRenewalReportPremiumDeposit)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly',lGroundPartnerAgentRenewalReportPremiumMonthly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment',lGroundPartnerAgentRenewalReportPremiumInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount',lGroundPartnerAgentRenewalReportPremiumNoDepositAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal',lGroundPartnerAgentRenewalReportPremiumNoDepositTotal)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount',lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal',lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_METHOD
		}
		Map lRenewalReportOpportunityDetailPaymentMethodMyAccountList=['1':'credit-card','2':'IB','3':'qr','4':'true-money','5':'rabbit-line-pay']
		Map lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentList=['1':'1','3':'2']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod','')
			lreturn.put('Result',lResult)
			String lRenewalReportOpportunityDetailPaymentMethodKey=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=''
			String lTagRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton='payment-method-modal'
			String lLocatorRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton)
			WebElement lElementRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton)
			if(lElementRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton){
				lTagRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton='change-payment-method-btn'
				lLocatorRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton)
				lElementRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton)
				if(!lElementRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton){
					return lreturn
				}
				String lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentList.get(lRenewalReportOpportunityDetailPaymentMethodKey)
				if(!lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem){
					lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_METHOD
					lRenewalReportOpportunityDetailPaymentMethodKey=lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem
					lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentList.get(lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem)
				}
				String lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentButton='change-payment-method-btn'
				String lLocatorRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentButton)
				String lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentDropdownList='payment-method-dropdown-item'
				String lLocatorRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentDropdownList)
				lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentButton,lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentDropdownList,lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem)
				if(lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem.length()<=0){
					lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_METHOD
					lRenewalReportOpportunityDetailPaymentMethodKey=lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem
					lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentList.get(lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem)
					lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentButton,lTagRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentDropdownList,lRenewalReportOpportunityDetailPaymentMethodGroundPartnerAgentItem)
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=lRenewalReportOpportunityDetailPaymentMethodKey
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRenewalReportOpportunityDetailPaymentMethodModalFormOpenButton)
				this.waitUntilLoaded()
				String lTagRenewalReportOpportunityDetailPaymentMethodModalForm='selected-installment-option'
				String lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm='#method-detail-modal'
				WebElement lElementRenewalReportOpportunityDetailPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm)
				String lTagRenewalReportOpportunityDetailPaymentMethodButton='payment-method-option'
				String lLocatorRenewalReportOpportunityDetailPaymentMethodButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentMethodButton)
				WebElement lElementRenewalReportOpportunityDetailPaymentMethodButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodButton)
				Boolean lIsRenewalReportOpportunityDetailPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm,10)
				lIsRenewalReportOpportunityDetailPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm)
				if(!lIsRenewalReportOpportunityDetailPaymentMethodModalFormDisplayed){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRenewalReportOpportunityDetailPaymentMethodButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRenewalReportOpportunityDetailPaymentMethodButton)
					lIsRenewalReportOpportunityDetailPaymentMethodModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm,10)
					lIsRenewalReportOpportunityDetailPaymentMethodModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm)
				}
				if(!lIsRenewalReportOpportunityDetailPaymentMethodModalFormDisplayed){
					return lreturn
				}
				lElementRenewalReportOpportunityDetailPaymentMethodModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRenewalReportOpportunityDetailPaymentMethodModalForm)
				if(!lElementRenewalReportOpportunityDetailPaymentMethodModalForm){
					return lreturn
				}
				String lRenewalReportOpportunityDetailPaymentMethodMyAccountItem=lRenewalReportOpportunityDetailPaymentMethodMyAccountList.get(lRenewalReportOpportunityDetailPaymentMethodKey)
				if(!lRenewalReportOpportunityDetailPaymentMethodMyAccountItem){
					lRenewalReportOpportunityDetailPaymentMethodMyAccountItem=lRenewalReportOpportunityDetailPaymentMethodMyAccountList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_METHOD)
				}
				String lTagPaymentSelectButtonKey='installment-option'
				String lLocatorPaymentSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentSelectButtonKey,lRenewalReportOpportunityDetailPaymentMethodMyAccountItem)
				WebElement lElementPaymentSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementRenewalReportOpportunityDetailPaymentMethodModalForm,lTagPaymentSelectButtonKey,lRenewalReportOpportunityDetailPaymentMethodMyAccountItem)
				if(!lElementPaymentSelectButton){
					lRenewalReportOpportunityDetailPaymentMethodMyAccountItem=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_METHOD
					lRenewalReportOpportunityDetailPaymentMethodKey=lRenewalReportOpportunityDetailPaymentMethodMyAccountItem
					lRenewalReportOpportunityDetailPaymentMethodMyAccountItem=lRenewalReportOpportunityDetailPaymentMethodMyAccountList.get(lRenewalReportOpportunityDetailPaymentMethodMyAccountItem)
					lElementPaymentSelectButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKeyValueEqual(this.driver,lElementRenewalReportOpportunityDetailPaymentMethodModalForm,lTagPaymentSelectButtonKey,lRenewalReportOpportunityDetailPaymentMethodMyAccountItem)
				}
				if(!lElementPaymentSelectButton){
					return lreturn
				}
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentSelectButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentSelectButton)
				this.waitUntilLoaded()
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=lRenewalReportOpportunityDetailPaymentMethodKey
			}
			lResult=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod.length()>0
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByCc(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_IS_YEARLY
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_INSTALMENT
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_NUMBER
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_NAME
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_EXPIRY_MONTH
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_EXPIRY_YEAR
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_CVV
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_BANK
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_E_POLICY
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_AUTO_RENEW
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_TO_DO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_DAY
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_MONTH
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_YEAR
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_CC_SUCCESS_CASE
		}
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo)
			Boolean lIsCcIsYearly=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly)
			Boolean lIsRedirectToMyAccount=THARGPAMotorCoreType.CURRENT_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK
			String lMainWindow=this.driver.getWindowHandle()
			Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment,lIsRedirectToMyAccount)
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=''
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=''
				lGroundPartnerAgentRenewalReportPremiumYearly=''
				lGroundPartnerAgentRenewalReportPremiumDeposit=''
				lGroundPartnerAgentRenewalReportPremiumMonthly=''
				lGroundPartnerAgentRenewalReportPremiumInstalment=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
			}else{
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment
				lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumYearly
				lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumDeposit
				lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumMonthly
				lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumInstalment
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
			}
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				return lreturn
			}
			String lTagTextPaymentByCCNumber='card-number'
			String lLocatorTextPaymentByCCNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCCNumber)
			WebElement lElementTextPaymentByCCNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCCNumber)
			if(!lElementTextPaymentByCCNumber){
				return lreturn
			}
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCCNumber,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber)
			String lTagTextPaymentByCcName='card-name'
			String lLocatorTextPaymentByCcName=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCcName)
			WebElement lElementTextPaymentByCcName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCcName)
			if(!lElementTextPaymentByCcName){
				lTagTextPaymentByCcName='card-hd-name'
				lLocatorTextPaymentByCcName=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCcName)
				lElementTextPaymentByCcName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCcName)
			}
			if(!lElementTextPaymentByCcName){
				return lreturn
			}
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCcName,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName)
			String lTagSelectCcExpiryMonth='card-month'
			String lLocatorSelectCcExpiryMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryMonth)
			WebElement lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryMonth)
			if(!lElementSelectCcExpiryMonth){
				lTagSelectCcExpiryMonth='card-exp-month'
				lLocatorSelectCcExpiryMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryMonth)
				lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryMonth)
			}
			if(!lElementSelectCcExpiryMonth){
				return lreturn
			}
			Select lSelectCcExpiryMonth=new Select(lElementSelectCcExpiryMonth)
			lSelectCcExpiryMonth.selectByVisibleText(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth)
			WebElement lElementSelectCcExpiryMonthSelected=lSelectCcExpiryMonth.getFirstSelectedOption()
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth=lElementSelectCcExpiryMonthSelected.getText()
			String lTagSelectCcExpiryYear='card-year'
			String lLocatorSelectCcExpiryYear=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryYear)
			WebElement lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryYear)
			if(!lElementSelectCcExpiryYear){
				lTagSelectCcExpiryYear='card-exp-year'
				lLocatorSelectCcExpiryYear=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryYear)
				lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryYear)
			}
			if(!lElementSelectCcExpiryYear){
				return lreturn
			}
			Select lSelectCcExpiryYear=new Select(lElementSelectCcExpiryYear)
			lSelectCcExpiryYear.selectByVisibleText(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear)
			WebElement lElementSelectCcExpiryYearSelected=lSelectCcExpiryYear.getFirstSelectedOption()
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear=lElementSelectCcExpiryYearSelected.getText()
			String lTagTextPaymentByCCCvv='card-cvv'
			String lLocatorTextPaymentByCCCvv=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCCCvv)
			WebElement lElementTextPaymentByCCCvv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCCCvv)
			if(!lElementTextPaymentByCCCvv){
				return lreturn
			}
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCCCvv,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv)
			String lTagSelectCcBank='card-bank'
			String lLocatorSelectCcBank=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcBank)
			WebElement lElementSelectCcBank=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcBank)
			if(!lElementSelectCcBank){
				return lreturn
			}
			Select lSelectCcBank=new Select(lElementSelectCcBank)
			def lOptionListCcBank=lSelectCcBank.getOptions()
			if(lOptionListCcBank.size()<=0){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=''
			}else{
				Boolean lFoundCcBank=false
				Integer lIndexCcBank=0
				def lOptionItemCcBank=null
				String lOptionFindCcBank=''
				for(Integer lOptionIndexCcBank=0;lOptionIndexCcBank<lOptionListCcBank.size()-1;lOptionIndexCcBank++){
					lOptionItemCcBank=lOptionListCcBank.get(lOptionIndexCcBank)
					lOptionFindCcBank=lOptionItemCcBank.getText()
					if(lOptionFindCcBank.contains(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank)){
						lFoundCcBank=true
						lIndexCcBank=lOptionIndexCcBank
						break
					}
				}
				if(lFoundCcBank){
					lSelectCcBank.selectByIndex(lIndexCcBank)
					lOptionItemCcBank=lSelectCcBank.getFirstSelectedOption()
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=lOptionItemCcBank.getText()
				}else{
					lSelectCcBank.selectByIndex(lOptionListCcBank.size()-1)
					String lTagTextCcBank='other-card-bank'
					String lLocatorTextCcBank=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCcBank)
					WebElement lElementTextCcBank=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextCcBank)
					if(!lElementTextCcBank){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank=IGNUemaHelper.typeTextByWebElement(driver,lElementTextCcBank,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank)
				}
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			String lTagPaymentLaterButton='payment-later'
			String lLocatorPaymentLaterButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentLaterButton)
			WebElement lElementPaymentLaterButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentLaterButton)
			if(!lElementPaymentLaterButton){
				lLocatorPaymentLaterButton='#now2defer .defer4div button'
				lElementPaymentLaterButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentLaterButton)
			}
			if(!lElementPaymentLaterButton){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo='No Option'
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=''
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=''
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=''
			}else{
				if(!lIsGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo){
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=''
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=''
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=''
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentLaterButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentLaterButton)
					this.waitUntilLoaded()
					String lTagRenewalReportOpportunityDetailPaymentLaterDayButton='defer-date'
					String lLocatorRenewalReportOpportunityDetailPaymentLaterDayButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentLaterDayButton)
					String lTagRenewalReportOpportunityDetailPaymentLaterDayDropdownList='date-dropdown-item-date'
					String lLocatorRenewalReportOpportunityDetailPaymentLaterDayDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentLaterDayDropdownList)
					WebElement lElementRenewalReportOpportunityDetailPaymentLaterDaySelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterDayButton)
					if(!lElementRenewalReportOpportunityDetailPaymentLaterDaySelected){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterDayButton,lTagRenewalReportOpportunityDetailPaymentLaterDayDropdownList,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay)
					if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay.length()<=0){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterDayButton,lTagRenewalReportOpportunityDetailPaymentLaterDayDropdownList,THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_DAY)
					}
					lElementRenewalReportOpportunityDetailPaymentLaterDaySelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterDayButton)
					if(!lElementRenewalReportOpportunityDetailPaymentLaterDaySelected){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailPaymentLaterDaySelected).trim()
					String lTagRenewalReportOpportunityDetailPaymentLaterMonthButton='defer-month'
					String lLocatorRenewalReportOpportunityDetailPaymentLaterMonthButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentLaterMonthButton)
					String lTagRenewalReportOpportunityDetailPaymentLaterMonthDropdownList='date-dropdown-item-month'
					String lLocatorRenewalReportOpportunityDetailPaymentLaterMonthDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentLaterMonthDropdownList)
					WebElement lElementRenewalReportOpportunityDetailPaymentLaterMonthSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterMonthButton)
					if(!lElementRenewalReportOpportunityDetailPaymentLaterMonthSelected){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterMonthButton,lTagRenewalReportOpportunityDetailPaymentLaterMonthDropdownList,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth)
					if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth.length()<=0){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterMonthButton,lTagRenewalReportOpportunityDetailPaymentLaterMonthDropdownList,THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_MONTH)
					}
					lElementRenewalReportOpportunityDetailPaymentLaterMonthSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterMonthButton)
					if(!lElementRenewalReportOpportunityDetailPaymentLaterMonthSelected){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailPaymentLaterMonthSelected).trim()
					String lTagRenewalReportOpportunityDetailPaymentLaterYearButton='defer-year'
					String lLocatorRenewalReportOpportunityDetailPaymentLaterYearButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentLaterYearButton)
					String lTagRenewalReportOpportunityDetailPaymentLaterYearDropdownList='date-dropdown-item-year'
					String lLocatorRenewalReportOpportunityDetailPaymentLaterYearDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRenewalReportOpportunityDetailPaymentLaterYearDropdownList)
					WebElement lElementRenewalReportOpportunityDetailPaymentLaterYearSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterYearButton)
					if(!lElementRenewalReportOpportunityDetailPaymentLaterYearSelected){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterYearButton,lTagRenewalReportOpportunityDetailPaymentLaterYearDropdownList,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear)
					if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear.length()<=0){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterYearButton,lTagRenewalReportOpportunityDetailPaymentLaterYearDropdownList,THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_LATER_YEAR)
					}
					lElementRenewalReportOpportunityDetailPaymentLaterYearSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRenewalReportOpportunityDetailPaymentLaterYearButton)
					if(!lElementRenewalReportOpportunityDetailPaymentLaterYearSelected){
						return lreturn
					}
					lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRenewalReportOpportunityDetailPaymentLaterYearSelected).trim()
				}
			}
			Boolean lIsCcSuccessCase=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase=IGNUemaHelper.convertBooleanToString(lIsCcSuccessCase)
			String lTagButtonPaymentSubmit='getQuote'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			if(!lElementButtonPaymentSubmit){
				String lTagButtonAgentPortalPaymentSubmit='confirmPayment-btn'
				String lLocatorButtonAgentPortalPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonAgentPortalPaymentSubmit)
				WebElement lElementAgentPortalPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonAgentPortalPaymentSubmit)
				if(!lElementAgentPortalPaymentSubmit){
					return lreturn
				}
				if(lElementAgentPortalPaymentSubmit){
					Boolean lIsClickByWebElement=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementAgentPortalPaymentSubmit)
					if(!lIsClickByWebElement){
						if(!lIsCcSuccessCase){
							lResult=true
						}
					}else{
						this.waitUntilLoaded()
						String lLocatorFormDisclaimer='#renewal-accept-modal'
						WebElement lElementFormDisclaimer=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormDisclaimer)
						Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
						lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
						if(lIsDisplayedFormDisclaimer){
							IGNUemaHelper.webJsScrollToBottom(this.driver)
							String lTagCheckboxDisclaimer='renewal-accept-modal-checked'
							String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
							WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
							if(lElementCheckboxDisclaimer){
								String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
								if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
									if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
										if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
											IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
										}
									}else{
										if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
											IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
										}
									}
								}
							}
							String lTagButtonConfirmPayment='renewal-accept-modal-confirm'
							String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
							WebElement lElementButtonConfirmPayment=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementFormDisclaimer,lTagButtonConfirmPayment)
							if(lElementButtonConfirmPayment){
								if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
									if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
										IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
									}
								}else{
									if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
										IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
									}
								}
							}
						}
						String lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton='close-renewal-completed-btn'
						String lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton=IGNUemaHelper.getTagDataSeleniumKey(lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton)
						Boolean lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton,10)
						lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton)
						if(!lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed){
							lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton,10)
							lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton)
						}
						WebElement lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton)
						if(!lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton){
							return lreturn
						}
						if(lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCompleteButton)
						}
						lResult=lIsRenewalReportOpportunityDetailPaymentCompleteButtonDisplayed
						this.waitUntilLoaded()
					}
				}
			}
			if(lElementButtonPaymentSubmit){
				Boolean lIsClickByWebElement=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)
				if(lIsClickByWebElement){
					String lLocatorFormPaymentSuccess='#payment-accept-modal'
					Boolean lIsDisplayedFormPaymentSuccess=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormPaymentSuccess,5)
					lIsDisplayedFormPaymentSuccess=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormPaymentSuccess)
					if(lIsDisplayedFormPaymentSuccess){
						IGNUemaHelper.webJsScrollToBottom(this.driver)
						lResult=lIsDisplayedFormPaymentSuccess
					}
				}else{
					if(!lIsCcSuccessCase){
						lResult=true
					}
				}
				this.waitUntilLoaded()
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
					this.driver.close()
					WebUI.switchToDefaultContent()
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
			}
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcInstalment)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcNumber)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcName)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryMonth)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcExpiryYear)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcCvv)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcBank)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterToDo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterDay)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterMonth)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentLaterYear)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcSuccessCase)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly',lGroundPartnerAgentRenewalReportPremiumYearly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit',lGroundPartnerAgentRenewalReportPremiumDeposit)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly',lGroundPartnerAgentRenewalReportPremiumMonthly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment',lGroundPartnerAgentRenewalReportPremiumInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount',lGroundPartnerAgentRenewalReportPremiumNoDepositAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal',lGroundPartnerAgentRenewalReportPremiumNoDepositTotal)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount',lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal',lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByIB(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank,String strEPolicy,String strAutoRenew,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank.trim()
		Map lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankList=['1':'1','2':'2','3':'3','4':'4']
		Integer lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankDefault=2
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_AUTO_RENEW
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_IB_SUCCESS_CASE
		}
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankList.get(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank)
			if(!lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankItem){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankItem=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankList.get(THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_IB_BANK)
			}
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=''
			Integer lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankItemNum=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankItem,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankDefault)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBankItemNum.toString()
			Boolean lIsRedirectToMyAccount=THARGPAMotorCoreType.CURRENT_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK
			Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption('Yes','1',lIsRedirectToMyAccount)
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				lGroundPartnerAgentRenewalReportPremiumYearly=''
				lGroundPartnerAgentRenewalReportPremiumDeposit=''
				lGroundPartnerAgentRenewalReportPremiumMonthly=''
				lGroundPartnerAgentRenewalReportPremiumInstalment=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
			}else{
				lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumYearly
				lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumDeposit
				lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumMonthly
				lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumInstalment
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
			}
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				return lreturn
			}
			Boolean lIsIbSuccessCase=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase)
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			lGroundPartnerAgentRenewalReportPremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			String lTagButtonPaymentByIBExpand=''
			String lLocatorButtonPaymentByIBExpand=''
			WebElement lElementButtonPaymentByIBExpand=null
			String lTagButtonPaymentByIBNext=''
			String lLocatorButtonPaymentByIBNext=''
			WebElement lElementButtonPaymentByIBNext=null
			switch(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank){
				case '1':
					lTagButtonPaymentByIBExpand='ib-collapse-ktb'
					lTagButtonPaymentByIBNext='ib-payment-ktb'
					break
				case '3':
					lTagButtonPaymentByIBExpand='ib-collapse-bay'
					lTagButtonPaymentByIBNext='ib-payment-bay'
					break
				case '4':
					lTagButtonPaymentByIBExpand='ib-collapse-bbl'
					lTagButtonPaymentByIBNext='ib-payment-bbl'
					break
				default:
					lTagButtonPaymentByIBExpand='ib-collapse-scb'
					lTagButtonPaymentByIBNext='ib-payment-scb'
					break
			}
			lLocatorButtonPaymentByIBExpand=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentByIBExpand)
			lElementButtonPaymentByIBExpand=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentByIBExpand)
			if(!lElementButtonPaymentByIBExpand){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentByIBExpand)){
				return lreturn
			}
			lLocatorButtonPaymentByIBNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentByIBNext)
			lElementButtonPaymentByIBNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentByIBNext)
			if(!lElementButtonPaymentByIBNext){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentByIBNext)){
				return lreturn
			}
			String lLocatorFormDisclaimer='#payment-accept-modal'
			Boolean lIsDisplayedFormDisclaimer=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormDisclaimer,5)
			lIsDisplayedFormDisclaimer=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormDisclaimer)
			if(lIsDisplayedFormDisclaimer){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				String lTagCheckboxDisclaimer='payment-accept-modal-checked'
				String lLocatorCheckboxDisclaimer=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxDisclaimer)
				WebElement lElementCheckboxDisclaimer=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxDisclaimer)
				if(lElementCheckboxDisclaimer){
					String lCheckboxDisclaimerStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxDisclaimer)
					if(lCheckboxDisclaimerStageStr.equalsIgnoreCase('NO')){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxDisclaimer)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxDisclaimer)
							}
						}
					}
				}
				String lTagButtonConfirmPayment='payment-accept-modal-confirm'
				String lLocatorButtonConfirmPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonConfirmPayment)
				WebElement lElementButtonConfirmPayment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonConfirmPayment)
				if(lElementButtonConfirmPayment){
					if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
						if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
						}
					}else{
						if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButtonConfirmPayment)){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonConfirmPayment)
						}
					}
				}
			}
			String lLocatorFormOmise='#offsite-test-container'
			IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
			Boolean lValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
			if(lValid){
				if(lIsIbSuccessCase){
					lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.SUCCESS')
					if(!lValid){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--success')
					}
				}else{
					lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.FAILURE')
					if(!lValid){
						lValid=IGNUemaHelper.selectButtonByLocator(this.driver,'.button--failure')
					}
				}
			}
			lResult=(lGroundPartnerAgentRenewalReportPremiumYearly.length()>0)&&lValid
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbBank)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy',lEPolicy)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew',lAutoRenew)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIbSuccessCase)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly',lGroundPartnerAgentRenewalReportPremiumYearly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit',lGroundPartnerAgentRenewalReportPremiumDeposit)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly',lGroundPartnerAgentRenewalReportPremiumMonthly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment',lGroundPartnerAgentRenewalReportPremiumInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount',lGroundPartnerAgentRenewalReportPremiumNoDepositAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal',lGroundPartnerAgentRenewalReportPremiumNoDepositTotal)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount',lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal',lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByQR(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_E_POLICY
		}
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			Boolean lIsRedirectToMyAccount=THARGPAMotorCoreType.CURRENT_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK
			String lMainWindow=this.driver.getWindowHandle()
			Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption('Yes','1',lIsRedirectToMyAccount)
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				lGroundPartnerAgentRenewalReportPremiumYearly=''
				lGroundPartnerAgentRenewalReportPremiumDeposit=''
				lGroundPartnerAgentRenewalReportPremiumMonthly=''
				lGroundPartnerAgentRenewalReportPremiumInstalment=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
			}else{
				lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumYearly
				lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumDeposit
				lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumMonthly
				lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumInstalment
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
			}
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				return lreturn
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			lGroundPartnerAgentRenewalReportPremiumYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'full-totalPrice'))
			String lTagButtonPaymentByQRNext='true-next'
			String lLocatorButtonPaymentByQRNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentByQRNext)
			WebElement lElementButtonPaymentByQRNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentByQRNext)
			if(!lElementButtonPaymentByQRNext){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentByQRNext)){
				return lreturn
			}
			lResult=lGroundPartnerAgentRenewalReportPremiumYearly.length()>0
			this.waitUntilLoaded()
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
				this.driver.close()
				WebUI.switchToDefaultContent()
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly',lGroundPartnerAgentRenewalReportPremiumYearly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit',lGroundPartnerAgentRenewalReportPremiumDeposit)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly',lGroundPartnerAgentRenewalReportPremiumMonthly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment',lGroundPartnerAgentRenewalReportPremiumInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount',lGroundPartnerAgentRenewalReportPremiumNoDepositAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal',lGroundPartnerAgentRenewalReportPremiumNoDepositTotal)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount',lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal',lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByTrueMoney(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail,String strEPolicy,String strAutoRenew,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_TRUE_MONEY_IS_YEARLY
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_TRUE_MONEY_INSTALMENT
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_TRUE_MONEY_MOBILE_NO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_TRUE_MONEY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_AUTO_RENEW
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_TRUE_MONEY_SUCCESS_CASE
		}
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			String lMainWindow=this.driver.getWindowHandle()
			Boolean lIsRedirectToMyAccount=THARGPAMotorCoreType.CURRENT_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK
			Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment,lIsRedirectToMyAccount)
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=''
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=''
				lGroundPartnerAgentRenewalReportPremiumYearly=''
				lGroundPartnerAgentRenewalReportPremiumDeposit=''
				lGroundPartnerAgentRenewalReportPremiumMonthly=''
				lGroundPartnerAgentRenewalReportPremiumInstalment=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
			}else{
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment
				lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumYearly
				lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumDeposit
				lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumMonthly
				lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumInstalment
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
			}
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				return lreturn
			}
			String lTagPaymentByTrueMoneyMobileNoInput='truemoney-mobile-number'
			String lLocatorPaymentByTrueMoneyMobileNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByTrueMoneyMobileNoInput)
			WebElement lElementPaymentByTrueMoneyMobileNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByTrueMoneyMobileNoInput)
			String lTrueMoneyMobileNoText=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo
			if(!lElementPaymentByTrueMoneyMobileNoInput){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo='No Option'
			}else{
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByTrueMoneyMobileNoInput,lTrueMoneyMobileNoText)
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			Boolean lIsTrueMoneySuccessCase=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase)
			String lTagButtonPaymentSubmit='true-next'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase=IGNUemaHelper.convertBooleanToString(lIsTrueMoneySuccessCase)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				Boolean lIsValid=false
				Boolean lIsOK=false
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
				lResult=lIsOK
			}
			this.waitUntilLoaded()
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
				this.driver.close()
				WebUI.switchToDefaultContent()
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyInstalment)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyMobileNo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyEmail)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy',lEPolicy)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew',lAutoRenew)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneySuccessCase)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly',lGroundPartnerAgentRenewalReportPremiumYearly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit',lGroundPartnerAgentRenewalReportPremiumDeposit)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly',lGroundPartnerAgentRenewalReportPremiumMonthly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment',lGroundPartnerAgentRenewalReportPremiumInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount',lGroundPartnerAgentRenewalReportPremiumNoDepositAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal',lGroundPartnerAgentRenewalReportPremiumNoDepositTotal)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount',lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal',lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentByRabbitLinePay(String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail,String strEPolicy,String strAutoRenew,String strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase){
		Map lreturn=[:]
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_RABBIT_LINE_PAY_IS_YEARLY
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_RABBIT_LINE_PAY_INSTALMENT
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_RABBIT_LINE_PAY_MOBILE_NO
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_RABBIT_LINE_PAY_EMAIL
		}
		String lEPolicy=strEPolicy.trim()
		if(lEPolicy.length()<=0){
			lEPolicy=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_E_POLICY
		}
		String lAutoRenew=strAutoRenew.trim()
		if(lAutoRenew.length()<=0){
			lAutoRenew=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_AUTO_RENEW
		}
		String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=strGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase.trim()
		if(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase.length()<=0){
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=THARGPAMotorQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_MENU_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_RABBIT_LINE_PAY_SUCCESS_CASE
		}
		String lGroundPartnerAgentRenewalReportPremiumYearly=''
		String lGroundPartnerAgentRenewalReportPremiumDeposit=''
		String lGroundPartnerAgentRenewalReportPremiumMonthly=''
		String lGroundPartnerAgentRenewalReportPremiumInstalment=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
		String lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
		String lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew','')
			lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount','')
			lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			String lMainWindow=this.driver.getWindowHandle()
			Boolean lIsRedirectToMyAccount=THARGPAMotorCoreType.CURRENT_RENEWAL_REPORT_OPPORTUNITY_DETAIL_PAYMENT_BY_PAY_ONLINE_LINK
			Map lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption=this.inputGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly,lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment,lIsRedirectToMyAccount)
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=''
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=''
				lGroundPartnerAgentRenewalReportPremiumYearly=''
				lGroundPartnerAgentRenewalReportPremiumDeposit=''
				lGroundPartnerAgentRenewalReportPremiumMonthly=''
				lGroundPartnerAgentRenewalReportPremiumInstalment=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=''
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=''
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=''
			}else{
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentIsYearly
				lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalment
				lGroundPartnerAgentRenewalReportPremiumYearly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumYearly
				lGroundPartnerAgentRenewalReportPremiumDeposit=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumDeposit
				lGroundPartnerAgentRenewalReportPremiumMonthly=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumMonthly
				lGroundPartnerAgentRenewalReportPremiumInstalment=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumInstalment
				lGroundPartnerAgentRenewalReportPremiumNoDepositAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
				lGroundPartnerAgentRenewalReportPremiumNoDepositTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
				lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyAmount
				lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal=lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.GroundPartnerAgentRenewalReportPremiumQuarterlyTotal
			}
			if(!lMapGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentInstalmentOption.Result){
				return lreturn
			}
			Boolean lIsEPolicy=IGNUemaHelper.convertStringToBoolean(lEPolicy)
			String lTagCheckboxEPolicy='ePolicyDocument'
			String lLocatorCheckboxEPolicy=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxEPolicy)
			WebElement lElementCheckboxEPolicy=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxEPolicy)
			if(!lElementCheckboxEPolicy){
				lEPolicy='No Option'
			}else{
				String lCheckboxEPolicyStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
				if(lCheckboxEPolicyStageStr.equalsIgnoreCase('NO')){
					if(lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}else{
					if(!lIsEPolicy){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxEPolicy)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxEPolicy)
							}
						}
					}
				}
				lEPolicy=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxEPolicy)
			}
			Boolean lIsAutoRenew=IGNUemaHelper.convertStringToBoolean(lAutoRenew)
			String lTagCheckboxAutoRenew='autoRenewFlag'
			String lLocatorCheckboxAutoRenew=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxAutoRenew)
			WebElement lElementCheckboxAutoRenew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxAutoRenew)
			if(!lElementCheckboxAutoRenew){
				lAutoRenew='No Option'
			}else{
				String lCheckboxAutoRenewStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
				if(lCheckboxAutoRenewStageStr.equalsIgnoreCase('NO')){
					if(lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}else{
					if(!lIsAutoRenew){
						if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}else{
							if(!IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCheckboxAutoRenew)){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCheckboxAutoRenew)
							}
						}
					}
				}
				lAutoRenew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxAutoRenew)
			}
			Boolean lIsRabbitLinePaySuccessCase=IGNUemaHelper.convertStringToBoolean(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase)
			String lTagButtonPaymentSubmit='line-next'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase=IGNUemaHelper.convertBooleanToString(lIsRabbitLinePaySuccessCase)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				Boolean lIsValid=false
				Boolean lIsOK=false
				String lLocatorFormOmise='#payment-test-container'
				lIsValid=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormOmise,15)
				lIsValid=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFormOmise,5)
				if(!lIsValid){
					return lreturn
				}else{
					String lTagPaymentByRabbitLinePayMobileNoInput='rabbit_linepay-mobile-number'
					String lLocatorPaymentByRabbitLinePayMobileNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayMobileNoInput)
					WebElement lElementPaymentByRabbitLinePayMobileNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayMobileNoInput)
					String lRabbitLinePayMobileNoText=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo
					if(!lElementPaymentByRabbitLinePayMobileNoInput){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo='No Option'
					}else{
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByRabbitLinePayMobileNoInput,lRabbitLinePayMobileNoText)
					}
					String lTagPaymentByRabbitLinePayEmailInput='rabbit_linepay-email'
					String lLocatorPaymentByRabbitLinePayEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentByRabbitLinePayEmailInput)
					WebElement lElementPaymentByRabbitLinePayEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentByRabbitLinePayEmailInput)
					String lRabbitLinePayEmailText=lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail
					if(!lElementPaymentByRabbitLinePayEmailInput){
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail='No Option'
					}else{
						lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPaymentByRabbitLinePayEmailInput,lRabbitLinePayEmailText)
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
				lResult=lIsOK
			}else{
				if(!lIsRabbitLinePaySuccessCase){
					lResult=true
				}
			}
			this.waitUntilLoaded()
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
				this.driver.close()
				WebUI.switchToDefaultContent()
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			if(lResult){
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayInstalment)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayMobileNo)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayEmail)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentEPolicy',lEPolicy)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentAutoRenew',lAutoRenew)
				lreturn.put('GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase',lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePaySuccessCase)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumYearly',lGroundPartnerAgentRenewalReportPremiumYearly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumDeposit',lGroundPartnerAgentRenewalReportPremiumDeposit)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumMonthly',lGroundPartnerAgentRenewalReportPremiumMonthly)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumInstalment',lGroundPartnerAgentRenewalReportPremiumInstalment)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositAmount',lGroundPartnerAgentRenewalReportPremiumNoDepositAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumNoDepositTotal',lGroundPartnerAgentRenewalReportPremiumNoDepositTotal)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyAmount',lGroundPartnerAgentRenewalReportPremiumQuarterlyAmount)
				lreturn.put('GroundPartnerAgentRenewalReportPremiumQuarterlyTotal',lGroundPartnerAgentRenewalReportPremiumQuarterlyTotal)
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
			lLanguage=THARGPAMotorQuotationInputType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapLanguage=this.lTHAMotorBikeQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
			}else{
				Map lMapLanguage=this.lTHAMotorCarQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
			}
			lResult=lLanguage.length()>0
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(3)
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapLanguage=this.lTHAMotorBikeQuotationInputUtil.inputLanguage(lLanguage)
					if(!lMapLanguage.Result){
						lLanguage=''
					}else{
						lLanguage=lMapLanguage.Language
					}
				}else{
					Map lMapLanguage=this.lTHAMotorCarQuotationInputUtil.inputLanguage(lLanguage)
					if(!lMapLanguage.Result){
						lLanguage=''
					}else{
						lLanguage=lMapLanguage.Language
					}
				}
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(5)
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapLanguage=this.lTHAMotorBikeQuotationInputUtil.inputLanguage(lLanguage)
					if(!lMapLanguage.Result){
						lLanguage=''
					}else{
						lLanguage=lMapLanguage.Language
					}
				}else{
					Map lMapLanguage=this.lTHAMotorCarQuotationInputUtil.inputLanguage(lLanguage)
					if(!lMapLanguage.Result){
						lLanguage=''
					}else{
						lLanguage=lMapLanguage.Language
					}
				}
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(8)
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapLanguage=this.lTHAMotorBikeQuotationInputUtil.inputLanguage(lLanguage)
					if(!lMapLanguage.Result){
						lLanguage=''
					}else{
						lLanguage=lMapLanguage.Language
					}
				}else{
					Map lMapLanguage=this.lTHAMotorCarQuotationInputUtil.inputLanguage(lLanguage)
					if(!lMapLanguage.Result){
						lLanguage=''
					}else{
						lLanguage=lMapLanguage.Language
					}
				}
				lResult=lLanguage.length()>0
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
	public Map inputCarMake(String strCarMake){
		Map lreturn=[:]
		String lCarMake=strCarMake.trim()
		if(lCarMake.length()<=0){
			lCarMake=THARGPAMotorQuotationInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarMake=this.lTHAMotorBikeQuotationInputUtil.inputCarMake(lCarMake)
				if(!lMapCarMake.Result){
					lCarMake=''
				}else{
					lCarMake=lMapCarMake.CarMake
				}
			}else{
				Map lMapCarMake=this.lTHAMotorCarQuotationInputUtil.inputCarMake(lCarMake)
				if(!lMapCarMake.Result){
					lCarMake=''
				}else{
					lCarMake=lMapCarMake.CarMake
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
	public Map inputCarModel(String strCarModel){
		Map lreturn=[:]
		String lCarModel=strCarModel.trim()
		if(lCarModel.length()<=0){
			lCarModel=THARGPAMotorQuotationInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarModel=this.lTHAMotorBikeQuotationInputUtil.inputCarModel(lCarModel)
				if(!lMapCarModel.Result){
					lCarModel=''
				}else{
					lCarModel=lMapCarModel.CarModel
				}
			}else{
				Map lMapCarModel=this.lTHAMotorCarQuotationInputUtil.inputCarModel(lCarModel)
				if(!lMapCarModel.Result){
					lCarModel=''
				}else{
					lCarModel=lMapCarModel.CarModel
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
	public Map inputCarYear(String strCarYear){
		Map lreturn=[:]
		String lCarYear=strCarYear.trim()
		if(lCarYear.length()<=0){
			lCarYear=THARGPAMotorQuotationInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarYear=this.lTHAMotorBikeQuotationInputUtil.inputCarYear(lCarYear)
				if(!lMapCarYear.Result){
					lCarYear=''
				}else{
					lCarYear=lMapCarYear.CarYear
				}
			}else{
				Map lMapCarYear=this.lTHAMotorCarQuotationInputUtil.inputCarYear(lCarYear)
				if(!lMapCarYear.Result){
					lCarYear=''
				}else{
					lCarYear=lMapCarYear.CarYear
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
	public Map inputSubmodel(String strSubmodel){
		Map lreturn=[:]
		String lSubmodel=strSubmodel.trim()
		if(lSubmodel.length()<=0){
			lSubmodel=THARGPAMotorQuotationInputType.DEFAULT_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('Submodel','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapSubmodel=this.lTHAMotorBikeQuotationInputUtil.inputSubmodel(lSubmodel)
				if(!lMapSubmodel.Result){
					lSubmodel=''
				}else{
					lSubmodel=lMapSubmodel.Submodel
				}
			}else{
				Map lMapSubmodel=this.lTHAMotorCarQuotationInputUtil.inputSubmodel(lSubmodel)
				if(!lMapSubmodel.Result){
					lSubmodel=''
				}else{
					lSubmodel=lMapSubmodel.Submodel
				}
			}
			lResult=lSubmodel.length()>0
			if(lResult){
				lreturn.put('Submodel',lSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGenderMainMaritalStatus(String strGenderMain,String strMaritalStatus){
		Map lreturn=[:]
		String lGenderMain=strGenderMain.trim()
		if(lGenderMain.length()<=0){
			lGenderMain=THARGPAMotorQuotationInputType.DEFAULT_GENDER_MAIN
		}
		String lMaritalStatus=strMaritalStatus.trim()
		if(lMaritalStatus.length()<=0){
			lMaritalStatus=THARGPAMotorQuotationInputType.DEFAULT_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('GenderMain','')
			lreturn.put('MaritalStatus','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapGenderMain=this.lTHAMotorBikeQuotationInputUtil.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
				if(!lMapGenderMain.Result){
					lGenderMain=''
				}else{
					lGenderMain=lMapGenderMain.GenderMain
				}
				lResult=lMapGenderMain.Result
			}else{
				Map lMapGenderMain=this.lTHAMotorCarQuotationInputUtil.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
				if(!lMapGenderMain.Result){
					lGenderMain=''
				}else{
					lGenderMain=lMapGenderMain.GenderMain
				}
				lResult=lMapGenderMain.Result
			}
			if(lResult){
				lreturn.put('GenderMain',lGenderMain)
				lreturn.put('MaritalStatus',lMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputBirthDateMain(String strBirthDateMain){
		Map lreturn=[:]
		String lBirthDateMain=strBirthDateMain.trim()
		if(lBirthDateMain.length()<=0){
			lBirthDateMain=THARGPAMotorQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('BirthDateMain','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapBirthDateMain=this.lTHAMotorBikeQuotationInputUtil.inputBirthDateMain(lBirthDateMain)
				if(!lMapBirthDateMain.Result){
					lBirthDateMain=''
				}else{
					lBirthDateMain=lMapBirthDateMain.BirthDateMain
				}
			}else{
				Map lMapBirthDateMain=this.lTHAMotorCarQuotationInputUtil.inputBirthDateMain(lBirthDateMain)
				if(!lMapBirthDateMain.Result){
					lBirthDateMain=''
				}else{
					lBirthDateMain=lMapBirthDateMain.BirthDateMain
				}
			}
			lResult=lBirthDateMain.length()>0
			if(lResult){
				lreturn.put('BirthDateMain',lBirthDateMain)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputYearDriving(String strYearDriving){
		Map lreturn=[:]
		String lYearDriving=strYearDriving.trim()
		if(lYearDriving.length()<=0){
			lYearDriving=THARGPAMotorQuotationInputType.DEFAULT_YEAR_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('YearDriving','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapYearDriving=this.lTHAMotorBikeQuotationInputUtil.inputYearDriving(lYearDriving)
				if(!lMapYearDriving.Result){
					lYearDriving=''
				}else{
					lYearDriving=lMapYearDriving.YearDriving
				}
			}else{
				Map lMapYearDriving=this.lTHAMotorCarQuotationInputUtil.inputYearDriving(lYearDriving)
				if(!lMapYearDriving.Result){
					lYearDriving=''
				}else{
					lYearDriving=lMapYearDriving.YearDriving
				}
			}
			lResult=lYearDriving.length()>0
			if(lResult){
				lreturn.put('YearDriving',lYearDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputClaimsNo(String strClaimsNo){
		Map lreturn=[:]
		String lClaimsNo=strClaimsNo.trim()
		if(lClaimsNo.length()<=0){
			lClaimsNo=THARGPAMotorQuotationInputType.DEFAULT_CLAIMS_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('ClaimsNo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapClaimsNo=this.lTHAMotorBikeQuotationInputUtil.inputClaimsNo(lClaimsNo)
				if(!lMapClaimsNo.Result){
					lClaimsNo=''
				}else{
					lClaimsNo=lMapClaimsNo.ClaimsNo
				}
			}else{
				Map lMapClaimsNo=this.lTHAMotorCarQuotationInputUtil.inputClaimsNo(lClaimsNo)
				if(!lMapClaimsNo.Result){
					lClaimsNo=''
				}else{
					lClaimsNo=lMapClaimsNo.ClaimsNo
				}
			}
			lResult=lClaimsNo.length()>0
			if(lResult){
				lreturn.put('ClaimsNo',lClaimsNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsage(String strVehicleUsage){
		Map lreturn=[:]
		String lVehicleUsage=strVehicleUsage.trim()
		if(lVehicleUsage.length()<=0){
			lVehicleUsage=THARGPAMotorQuotationInputType.DEFAULT_VEHICLE_USAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsage','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapVehicleUsage=this.lTHAMotorBikeQuotationInputUtil.inputVehicleUsage(lVehicleUsage)
				if(!lMapVehicleUsage.Result){
					lVehicleUsage=''
				}else{
					lVehicleUsage=lMapVehicleUsage.VehicleUsage
				}
			}else{
				Map lMapVehicleUsage=this.lTHAMotorCarQuotationInputUtil.inputVehicleUsage(lVehicleUsage)
				if(!lMapVehicleUsage.Result){
					lVehicleUsage=''
				}else{
					lVehicleUsage=lMapVehicleUsage.VehicleUsage
				}
			}
			lResult=lVehicleUsage.length()>0
			if(lResult){
				lreturn.put('VehicleUsage',lVehicleUsage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageForCommercial(String strVehicleUsageForCommercial){
		Map lreturn=[:]
		String lVehicleUsageForCommercial=strVehicleUsageForCommercial.trim()
		if(lVehicleUsageForCommercial.length()<=0){
			lVehicleUsageForCommercial=THARGPAMotorQuotationInputType.DEFAULT_VEHICLE_USAGE_FOR_COMMERCIAL
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageForCommercial','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapVehicleUsageForCommercial=this.lTHAMotorBikeQuotationInputUtil.inputVehicleUsageForCommercial(lVehicleUsageForCommercial)
				if(!lMapVehicleUsageForCommercial.Result){
					lVehicleUsageForCommercial=''
				}else{
					lVehicleUsageForCommercial=lMapVehicleUsageForCommercial.VehicleUsageForCommercial
				}
			}else{
				Map lMapVehicleUsageForCommercial=this.lTHAMotorCarQuotationInputUtil.inputVehicleUsageForCommercial(lVehicleUsageForCommercial)
				if(!lMapVehicleUsageForCommercial.Result){
					lVehicleUsageForCommercial=''
				}else{
					lVehicleUsageForCommercial=lMapVehicleUsageForCommercial.VehicleUsageForCommercial
				}
			}
			lResult=lVehicleUsageForCommercial.length()>0
			if(lResult){
				lreturn.put('VehicleUsageForCommercial',lVehicleUsageForCommercial)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageDriveToWork(String strVehicleUsageDriveToWork){
		Map lreturn=[:]
		String lVehicleUsageDriveToWork=strVehicleUsageDriveToWork.trim()
		if(lVehicleUsageDriveToWork.length()<=0){
			lVehicleUsageDriveToWork=THARGPAMotorQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWork','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapVehicleUsageDriveToWork=this.lTHAMotorBikeQuotationInputUtil.inputVehicleUsageDriveToWork(lVehicleUsageDriveToWork)
				if(!lMapVehicleUsageDriveToWork.Result){
					lVehicleUsageDriveToWork=''
				}else{
					lVehicleUsageDriveToWork=lMapVehicleUsageDriveToWork.VehicleUsageDriveToWork
				}
			}else{
				Map lMapVehicleUsageDriveToWork=this.lTHAMotorCarQuotationInputUtil.inputVehicleUsageDriveToWork(lVehicleUsageDriveToWork)
				if(!lMapVehicleUsageDriveToWork.Result){
					lVehicleUsageDriveToWork=''
				}else{
					lVehicleUsageDriveToWork=lMapVehicleUsageDriveToWork.VehicleUsageDriveToWork
				}
			}
			lResult=lVehicleUsageDriveToWork.length()>0
			if(lResult){
				lreturn.put('VehicleUsageDriveToWork',lVehicleUsageDriveToWork)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageDriveToWorkOften(String strVehicleUsageDriveToWorkOften){
		Map lreturn=[:]
		String lVehicleUsageDriveToWorkOften=strVehicleUsageDriveToWorkOften.trim()
		if(lVehicleUsageDriveToWorkOften.length()<=0){
			lVehicleUsageDriveToWorkOften=THARGPAMotorQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK_OFTEN
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWorkOften','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapVehicleUsageDriveToWorkOften=this.lTHAMotorBikeQuotationInputUtil.inputVehicleUsageDriveToWorkOften(lVehicleUsageDriveToWorkOften)
				if(!lMapVehicleUsageDriveToWorkOften.Result){
					lVehicleUsageDriveToWorkOften=''
				}else{
					lVehicleUsageDriveToWorkOften=lMapVehicleUsageDriveToWorkOften.VehicleUsageDriveToWorkOften
				}
			}else{
				Map lMapVehicleUsageDriveToWorkOften=this.lTHAMotorCarQuotationInputUtil.inputVehicleUsageDriveToWorkOften(lVehicleUsageDriveToWorkOften)
				if(!lMapVehicleUsageDriveToWorkOften.Result){
					lVehicleUsageDriveToWorkOften=''
				}else{
					lVehicleUsageDriveToWorkOften=lMapVehicleUsageDriveToWorkOften.VehicleUsageDriveToWorkOften
				}
			}
			lResult=lVehicleUsageDriveToWorkOften.length()>0
			if(lResult){
				lreturn.put('VehicleUsageDriveToWorkOften',lVehicleUsageDriveToWorkOften)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputTaxiOrVehicleForHire(String strTaxiOrVehicleForHire){
		Map lreturn=[:]
		String lTaxiOrVehicleForHire=strTaxiOrVehicleForHire.trim()
		if(lTaxiOrVehicleForHire.length()<=0){
			lTaxiOrVehicleForHire=THARGPAMotorQuotationInputType.DEFAULT_TAXI_OR_VEHICLE_FOR_HIRE
		}
		try{
			Boolean lResult=false
			lreturn.put('TaxiOrVehicleForHire','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapTaxiOrVehicleForHire=this.lTHAMotorBikeQuotationInputUtil.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
				if(!lMapTaxiOrVehicleForHire.Result){
					lTaxiOrVehicleForHire=''
				}else{
					lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
				}
			}else{
				Map lMapTaxiOrVehicleForHire=this.lTHAMotorCarQuotationInputUtil.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
				if(!lMapTaxiOrVehicleForHire.Result){
					lTaxiOrVehicleForHire=''
				}else{
					lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
				}
			}
			lResult=lTaxiOrVehicleForHire.length()>0
			if(lResult){
				lreturn.put('TaxiOrVehicleForHire',lTaxiOrVehicleForHire)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputRentalVehicle(String strRentalVehicle){
		Map lreturn=[:]
		String lRentalVehicle=strRentalVehicle.trim()
		if(lRentalVehicle.length()<=0){
			lRentalVehicle=THARGPAMotorQuotationInputType.DEFAULT_RENTAL_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('RentalVehicle','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapRentalVehicle=this.lTHAMotorBikeQuotationInputUtil.inputRentalVehicle(lRentalVehicle)
				if(!lMapRentalVehicle.Result){
					lRentalVehicle=''
				}else{
					lRentalVehicle=lMapRentalVehicle.RentalVehicle
				}
			}else{
				Map lMapRentalVehicle=this.lTHAMotorCarQuotationInputUtil.inputRentalVehicle(lRentalVehicle)
				if(!lMapRentalVehicle.Result){
					lRentalVehicle=''
				}else{
					lRentalVehicle=lMapRentalVehicle.RentalVehicle
				}
			}
			lResult=lRentalVehicle.length()>0
			if(lResult){
				lreturn.put('RentalVehicle',lRentalVehicle)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGoodsTransportVehicle(String strGoodsTransportVehicle){
		Map lreturn=[:]
		String lGoodsTransportVehicle=strGoodsTransportVehicle.trim()
		if(lGoodsTransportVehicle.length()<=0){
			lGoodsTransportVehicle=THARGPAMotorQuotationInputType.DEFAULT_GOODS_TRANSPORT_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportVehicle','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapGoodsTransportVehicle=this.lTHAMotorBikeQuotationInputUtil.inputGoodsTransportVehicle(lGoodsTransportVehicle)
				if(!lMapGoodsTransportVehicle.Result){
					lGoodsTransportVehicle=''
				}else{
					lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
				}
			}else{
				Map lMapGoodsTransportVehicle=this.lTHAMotorCarQuotationInputUtil.inputGoodsTransportVehicle(lGoodsTransportVehicle)
				if(!lMapGoodsTransportVehicle.Result){
					lGoodsTransportVehicle=''
				}else{
					lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
				}
			}
			lResult=lGoodsTransportVehicle.length()>0
			if(lResult){
				lreturn.put('GoodsTransportVehicle',lGoodsTransportVehicle)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLogisticsOrCourierCompany(String strLogisticsOrCourierCompany){
		Map lreturn=[:]
		String lLogisticsOrCourierCompany=strLogisticsOrCourierCompany.trim()
		if(lLogisticsOrCourierCompany.length()<=0){
			lLogisticsOrCourierCompany=THARGPAMotorQuotationInputType.DEFAULT_LOGISTICS_OR_COURIER_COMPANY
		}
		try{
			Boolean lResult=false
			lreturn.put('LogisticsOrCourierCompany','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapLogisticsOrCourierCompany=this.lTHAMotorBikeQuotationInputUtil.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
				if(!lMapLogisticsOrCourierCompany.Result){
					lLogisticsOrCourierCompany=''
				}else{
					lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
				}
			}else{
				Map lMapLogisticsOrCourierCompany=this.lTHAMotorCarQuotationInputUtil.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
				if(!lMapLogisticsOrCourierCompany.Result){
					lLogisticsOrCourierCompany=''
				}else{
					lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
				}
			}
			lResult=lLogisticsOrCourierCompany.length()>0
			if(lResult){
				lreturn.put('LogisticsOrCourierCompany',lLogisticsOrCourierCompany)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGoodsTransportRoute(String strGoodsTransportRoute){
		Map lreturn=[:]
		String lGoodsTransportRoute=strGoodsTransportRoute.trim()
		if(lGoodsTransportRoute.length()<=0){
			lGoodsTransportRoute=THARGPAMotorQuotationInputType.DEFAULT_GOODS_TRANSPORT_ROUTE
		}
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportRoute','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapGoodsTransportRoute=this.lTHAMotorBikeQuotationInputUtil.inputGoodsTransportRoute(lGoodsTransportRoute)
				if(!lMapGoodsTransportRoute.Result){
					lGoodsTransportRoute=''
				}else{
					lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
				}
			}else{
				Map lMapGoodsTransportRoute=this.lTHAMotorCarQuotationInputUtil.inputGoodsTransportRoute(lGoodsTransportRoute)
				if(!lMapGoodsTransportRoute.Result){
					lGoodsTransportRoute=''
				}else{
					lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
				}
			}
			lResult=lGoodsTransportRoute.length()>0
			if(lResult){
				lreturn.put('GoodsTransportRoute',lGoodsTransportRoute)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostalCode(String strPostalCode){
		Map lreturn=[:]
		String lPostalCode=strPostalCode.trim()
		if(lPostalCode.length()<=0){
			lPostalCode=THARGPAMotorQuotationInputType.DEFAULT_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('PostalCode','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapPostalCode=this.lTHAMotorBikeQuotationInputUtil.inputPostalCode(lPostalCode)
				if(!lMapPostalCode.Result){
					lPostalCode=''
				}else{
					lPostalCode=lMapPostalCode.PostalCode
				}
			}else{
				Map lMapPostalCode=this.lTHAMotorCarQuotationInputUtil.inputPostalCode(lPostalCode)
				if(!lMapPostalCode.Result){
					lPostalCode=''
				}else{
					lPostalCode=lMapPostalCode.PostalCode
				}
			}
			lResult=lPostalCode.length()>0
			if(lResult){
				lreturn.put('PostalCode',lPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOdometerReading(String strOdometerReading){
		Map lreturn=[:]
		String lOdometerReading=strOdometerReading.trim()
		if(lOdometerReading.length()<=0){
			lOdometerReading=THARGPAMotorQuotationInputType.DEFAULT_ODOMETER_READING
		}
		try{
			Boolean lResult=false
			lreturn.put('OdometerReading','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapOdometerReading=this.lTHAMotorBikeQuotationInputUtil.inputOdometerReading(lOdometerReading)
				if(!lMapOdometerReading.Result){
					lOdometerReading=''
				}else{
					lOdometerReading=lMapOdometerReading.OdometerReading
				}
			}else{
				Map lMapOdometerReading=this.lTHAMotorCarQuotationInputUtil.inputOdometerReading(lOdometerReading)
				if(!lMapOdometerReading.Result){
					lOdometerReading=''
				}else{
					lOdometerReading=lMapOdometerReading.OdometerReading
				}
			}
			lResult=lOdometerReading.length()>0
			if(lResult){
				lreturn.put('OdometerReading',lOdometerReading)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDeclaredNcb(String strDeclaredNcb){
		Map lreturn=[:]
		String lDeclaredNcb=strDeclaredNcb.trim()
		if(lDeclaredNcb.length()<=0){
			lDeclaredNcb=THARGPAMotorQuotationInputType.DEFAULT_DECLARED_NCB
		}
		try{
			Boolean lResult=false
			lreturn.put('DeclaredNcb','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDeclaredNcb=this.lTHAMotorBikeQuotationInputUtil.inputDeclaredNcb(lDeclaredNcb)
				if(!lMapDeclaredNcb.Result){
					lDeclaredNcb=''
				}else{
					lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
				}
			}else{
				Map lMapDeclaredNcb=this.lTHAMotorCarQuotationInputUtil.inputDeclaredNcb(lDeclaredNcb)
				if(!lMapDeclaredNcb.Result){
					lDeclaredNcb=''
				}else{
					lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
				}
			}
			lResult=lDeclaredNcb.length()>0
			if(lResult){
				lreturn.put('DeclaredNcb',lDeclaredNcb)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputUnderFinancing(String strUnderFinancing){
		Map lreturn=[:]
		String lUnderFinancing=strUnderFinancing.trim()
		if(lUnderFinancing.length()<=0){
			lUnderFinancing=THARGPAMotorQuotationInputType.DEFAULT_UNDER_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('UnderFinancing','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapUnderFinancing=this.lTHAMotorBikeQuotationInputUtil.inputUnderFinancing(lUnderFinancing)
				if(!lMapUnderFinancing.Result){
					lUnderFinancing=''
				}else{
					lUnderFinancing=lMapUnderFinancing.UnderFinancing
				}
			}else{
				Map lMapUnderFinancing=this.lTHAMotorCarQuotationInputUtil.inputUnderFinancing(lUnderFinancing)
				if(!lMapUnderFinancing.Result){
					lUnderFinancing=''
				}else{
					lUnderFinancing=lMapUnderFinancing.UnderFinancing
				}
			}
			lResult=lUnderFinancing.length()>0
			if(lResult){
				lreturn.put('UnderFinancing',lUnderFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarCamera(String strCarCamera){
		Map lreturn=[:]
		String lCarCamera=strCarCamera.trim()
		if(lCarCamera.length()<=0){
			lCarCamera=THARGPAMotorQuotationInputType.DEFAULT_CAR_CAMERA
		}
		try{
			Boolean lResult=false
			lreturn.put('CarCamera','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarCamera=this.lTHAMotorBikeQuotationInputUtil.inputCarCamera(lCarCamera)
				if(!lMapCarCamera.Result){
					lCarCamera=''
				}else{
					lCarCamera=lMapCarCamera.CarCamera
				}
			}else{
				Map lMapCarCamera=this.lTHAMotorCarQuotationInputUtil.inputCarCamera(lCarCamera)
				if(!lMapCarCamera.Result){
					lCarCamera=''
				}else{
					lCarCamera=lMapCarCamera.CarCamera
				}
			}
			lResult=lCarCamera.length()>0
			if(lResult){
				lreturn.put('CarCamera',lCarCamera)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputTentative(String strTentative){
		Map lreturn=[:]
		String lTentative=strTentative.trim()
		if(lTentative.length()<=0){
			lTentative=THARGPAMotorQuotationInputType.DEFAULT_TENTATIVE
		}
		try{
			Boolean lResult=false
			lreturn.put('Tentative','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapTentative=this.lTHAMotorBikeQuotationInputUtil.inputTentative(lTentative)
				if(!lMapTentative.Result){
					lTentative=''
				}else{
					lTentative=lMapTentative.Tentative
				}
			}else{
				Map lMapTentative=this.lTHAMotorCarQuotationInputUtil.inputTentative(lTentative)
				if(!lMapTentative.Result){
					lTentative=''
				}else{
					lTentative=lMapTentative.Tentative
				}
			}
			lResult=lTentative.length()>0
			if(lResult){
				lreturn.put('Tentative',lTentative)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAlcoholFree(String strAlcoholFree){
		Map lreturn=[:]
		String lAlcoholFree=strAlcoholFree.trim()
		if(lAlcoholFree.length()<=0){
			lAlcoholFree=THARGPAMotorQuotationInputType.DEFAULT_ALCOHOL_FREE
		}
		try{
			Boolean lResult=false
			lreturn.put('AlcoholFree','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapAlcoholFree=this.lTHAMotorBikeQuotationInputUtil.inputAlcoholFree(lAlcoholFree)
				if(!lMapAlcoholFree.Result){
					lAlcoholFree=''
				}else{
					lAlcoholFree=lMapAlcoholFree.AlcoholFree
				}
			}else{
				Map lMapAlcoholFree=this.lTHAMotorCarQuotationInputUtil.inputAlcoholFree(lAlcoholFree)
				if(!lMapAlcoholFree.Result){
					lAlcoholFree=''
				}else{
					lAlcoholFree=lMapAlcoholFree.AlcoholFree
				}
			}
			lResult=lAlcoholFree.length()>0
			if(lResult){
				lreturn.put('AlcoholFree',lAlcoholFree)
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
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapPolicyInsurer=this.lTHAMotorBikeQuotationInputUtil.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lResult=lMapPolicyInsurer.Result
			}else{
				Map lMapPolicyInsurer=this.lTHAMotorCarQuotationInputUtil.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lResult=lMapPolicyInsurer.Result
			}
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
	public Map inputSalesforceProceedVerify(Map caseOutput){
		Map lreturn=[:]
		String lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=''
		String lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyResult=''
		String lSalesforceVerifyCompareDetail=''
		String lSalesforceVerifyCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result',lResult)
			String lText=''
			String lAutomationOpportunityNumber=caseOutput.GroundPartnerAgentRenewalReportCardSelectedOpportunity
			String lSalesforceOpportunityNumber=caseOutput.SalesforceVerifyDataOpportunityObjName
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
			}
			String lAutomationPaymentFrequency=''
			String lSalesforcePaymentFrequency=''
			Boolean lIsPaymentFrequency=false
			String lAutomationYearly=''
			String lSalesforceYearly=''
			Float lAutomationYearlyNumber=0
			Float lSalesforceYearlyNumber=0
			Float lYearlyPrice=0
			String lAutomationPremiumNoDepositAmount=''
			String lSalesforcePremiumNoDepositAmount=''
			Float lAutomationPremiumNoDepositAmountNumber=0
			Float lSalesforcePremiumNoDepositAmountNumber=0
			Float lPremiumNoDepositAmountPrice=0
			String lAutomationPremiumNoDepositTotal=''
			String lSalesforcePremiumNoDepositTotal=''
			Float lAutomationPremiumNoDepositTotalNumber=0
			Float lSalesforcePremiumNoDepositTotalNumber=0
			Float lPremiumNoDepositTotalPrice=0
			String lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod=caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod
			switch(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod){
				case '2':
					lAutomationYearly=caseOutput.GroundPartnerAgentRenewalReportPremiumYearly
					lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
						lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
						lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
						lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
						if(lYearlyPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
							lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					break
				case '3':
					lAutomationYearly=caseOutput.GroundPartnerAgentRenewalReportPremiumYearly
					lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
						lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
						lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
						lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
						if(lYearlyPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
							lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					break
				case '4':
					lAutomationPaymentFrequency=caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentTrueMoneyIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.GroundPartnerAgentRenewalReportPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				case '5':
					lAutomationPaymentFrequency=caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentRabbitLinePayIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.GroundPartnerAgentRenewalReportPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				default:
					lAutomationPaymentFrequency=caseOutput.GroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentCcIsYearly
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=caseOutput.GroundPartnerAgentRenewalReportPremiumYearly
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositAmount
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=caseOutput.GroundPartnerAgentRenewalReportPremiumNoDepositTotal
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
			}
			if(!IGNUemaHelper.checkStringContainString(lGroundPartnerAgentMenuRenewalReportOpportunityDetailPaymentMethod,'3')){
				String lSalesforceTransaction=caseOutput.SalesforceVerifyDataOpportunityObjStagename
				if(!IGNUemaHelper.checkStringContainString(lSalesforceTransaction,'Closed Won')){
					lIsOK=false
					lText='Transaction='+lSalesforceTransaction
					lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
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
						lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
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
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'VOL')){
							String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
							if(lQuoteLineItemTaxInvoice.length()<=0){
								lIsOK=false
								lText='TaxInvoice VOL'
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'RSA')){
							String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
							if(lQuoteLineItemTaxInvoice.length()<=0){
								lIsOK=false
								lText='TaxInvoice RSA'
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						if(IGNUemaHelper.checkStringContainString(lQuoteLineItem,'CRS')){
							String lQuoteLineItemTaxInvoice=caseOutput.('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C')
							if(lQuoteLineItemTaxInvoice.length()<=0){
								lIsOK=false
								lText='TaxInvoice CRS'
								lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail+lText+'\n'
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
				}
			}
			if(lIsOK){
				caseOutput.GroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail='Passed'
				caseOutput.SalesforceVerifyCompareDetail='Passed'
				caseOutput.GroundPartnerAgentRenewalReportSalesAndPolicyVerifyResult='Passed'
				caseOutput.SalesforceVerifyCompareResult='Passed'
			}else{
				caseOutput.GroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail.trim()
				caseOutput.SalesforceVerifyCompareDetail=lGroundPartnerAgentRenewalReportSalesAndPolicyVerifyDetail.trim()
				caseOutput.GroundPartnerAgentRenewalReportSalesAndPolicyVerifyResult='Failed'
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
	public Map validateGroundPartnerAgentProductMotorItem(WebElement webElementGroundPartnerAgentProductMotorButton,String strGroundPartnerAgentProductNameValue){
		Map lreturn=[:]
		String lGroundPartnerAgentProductNameValue=strGroundPartnerAgentProductNameValue.trim()
		try{
			Boolean lResult=false
			Integer lIndexProductName=0
			lreturn.put('IndexProductName',lIndexProductName)
			lreturn.put('Result',lResult)
			Boolean lFoundProductName=false
			def lOptionItemProductName=null
			String lOptionFindProductName=''
			Map lGroundPartnerAgentProductNameList=['1':'All','2':'MotorCar','3':'MotorBike','4':'Health','5':'Personal Accident']
			String lGroundPartnerAgentProductNameItem=lGroundPartnerAgentProductNameList.get(lGroundPartnerAgentProductNameValue)
			if(!lGroundPartnerAgentProductNameItem){
				return lreturn
			}
			Select lSelectProductName=new Select(webElementGroundPartnerAgentProductMotorButton)
			def lOptionListProductName=lSelectProductName.getOptions()
			if(lOptionListProductName.size()<=0){
				return lreturn
			}else{
				for(Integer lOptionIndexProductName=0;lOptionIndexProductName<=lOptionListProductName.size()-1;lOptionIndexProductName++){
					lOptionItemProductName=lOptionListProductName.get(lOptionIndexProductName)
					lOptionFindProductName=lOptionItemProductName.getAttribute('value')
					if(lOptionFindProductName.contains(lGroundPartnerAgentProductNameItem)){
						lFoundProductName=true
						lIndexProductName=lOptionIndexProductName
						break
					}
				}
				lResult=lFoundProductName
			}
			if(lResult){
				lreturn.put('IndexProductName',lIndexProductName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map validateRenewalReportFilterDateTypeItem(WebElement webElementRenewalReportFilterDateTypeButton,String strRenewalReportFilterDateTypeValue){
		Map lreturn=[:]
		String lRenewalReportFilterDateTypeValue=strRenewalReportFilterDateTypeValue.trim()
		try{
			Boolean lResult=false
			Integer lIndexDateType=0
			lreturn.put('IndexDateType',lIndexDateType)
			lreturn.put('Result',lResult)
			Boolean lFoundDateType=false
			def lOptionItemDateType=null
			String lOptionFindDateType=''
			Map lRenewalReportFilterDateTypeValueList=['1':'renewaldate','2':'expirydate']
			String lRenewalReportFilterDateTypeValueItem=lRenewalReportFilterDateTypeValueList.get(lRenewalReportFilterDateTypeValue)
			if(!lRenewalReportFilterDateTypeValueItem){
				return lreturn
			}
			Select lSelectDateType=new Select(webElementRenewalReportFilterDateTypeButton)
			def lOptionListDateType=lSelectDateType.getOptions()
			if(lOptionListDateType.size()<=0){
				return lreturn
			}else{
				for(Integer lOptionIndexDateType=0;lOptionIndexDateType<=lOptionListDateType.size()-1;lOptionIndexDateType++){
					lOptionItemDateType=lOptionListDateType.get(lOptionIndexDateType)
					lOptionFindDateType=lOptionItemDateType.getAttribute('value')
					if(lOptionFindDateType.contains(lRenewalReportFilterDateTypeValueItem)){
						lFoundDateType=true
						lIndexDateType=lOptionIndexDateType
						break
					}
				}
				lResult=lFoundDateType
			}
			if(lResult){
				lreturn.put('IndexDateType',lIndexDateType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}