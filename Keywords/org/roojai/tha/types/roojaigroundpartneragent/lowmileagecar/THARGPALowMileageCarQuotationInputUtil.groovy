package org.roojai.tha.types.roojaigroundpartneragent.lowmileagecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarQuotationInputUtil
public class THARGPALowMileageCarQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lLowMileageCarQuotationInputUtil=null
	public THARGPALowMileageCarQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THALowMileageCarQuotationInputUtil getlLowMileageCarQuotationInputUtil(){
		return this.lLowMileageCarQuotationInputUtil
	}
	private void setlLowMileageCarQuotationInputUtil(THALowMileageCarQuotationInputUtil newlLowMileageCarQuotationInputUtil){
		//Do Nothing
		//this.lLowMileageCarQuotationInputUtil=newlLowMileageCarQuotationInputUtil
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
	public Boolean inputInput(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lGroundPartnerAgentLoginMethod=caseInput.GroundPartnerAgentLoginMethod.toString().trim()
		String lGroundPartnerAgentAccountSource=caseInput.GroundPartnerAgentAccountSource.toString().trim()
		String lGroundPartnerAgentUrlProductSelect=caseInput.GroundPartnerAgentUrlProductSelect.toString().trim()
		String lGroundPartnerAgentUser=caseInput.GroundPartnerAgentUser.toString().trim()
		String lGroundPartnerAgentPassword=caseInput.GroundPartnerAgentPassword.toString().trim()
		String lGroundPartnerAgentLanguage=caseInput.GroundPartnerAgentLanguage.toString().trim()
		String lGroundPartnerAgentIsLowMileageCar=caseInput.GroundPartnerAgentIsLowMileageCar.toString().trim()
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
			THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_USER=lGroundPartnerAgentUser
			THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_PASSWORD=lGroundPartnerAgentPassword
			caseOutput.GroundPartnerAgentUser=lGroundPartnerAgentUser
			caseOutput.GroundPartnerAgentPassword=IGNUemaHelper.convertStringToPassword(lGroundPartnerAgentPassword)
			if(lGroundPartnerAgentUser.length()<=0){
				return lreturn
			}
			if(lGroundPartnerAgentPassword.length()<=0){
				return lreturn
			}
			Map lMapGroundPartnerAgentLoginMethod=this.inputGroundPartnerAgentLoginMethod(lGroundPartnerAgentLoginMethod,lGroundPartnerAgentAccountSource,lGroundPartnerAgentUrlProductSelect,lGroundPartnerAgentLanguage,lGroundPartnerAgentIsLowMileageCar)
			if(!lMapGroundPartnerAgentLoginMethod.Result){
				lGroundPartnerAgentLoginMethod=''
				lGroundPartnerAgentAccountSource=''
				lGroundPartnerAgentUrlProductSelect=''
				lGroundPartnerAgentLanguage=''
				lGroundPartnerAgentIsLowMileageCar=''
				lGroundPartnerAgentSkipLoginUrl=''
			}else{
				lGroundPartnerAgentLoginMethod=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentLoginMethod
				lGroundPartnerAgentAccountSource=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentAccountSource
				lGroundPartnerAgentUrlProductSelect=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentUrlProductSelect
				lGroundPartnerAgentLanguage=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentLanguage
				lGroundPartnerAgentIsLowMileageCar=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentIsLowMileageCar
				lGroundPartnerAgentSkipLoginUrl=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentSkipLoginUrl
			}
			caseOutput.GroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethod
			caseOutput.GroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSource
			caseOutput.GroundPartnerAgentUrlProductSelect=lGroundPartnerAgentUrlProductSelect
			caseOutput.GroundPartnerAgentLanguage=lGroundPartnerAgentLanguage
			caseOutput.GroundPartnerAgentIsLowMileageCar=lGroundPartnerAgentIsLowMileageCar
			caseOutput.GroundPartnerAgentSkipLoginUrl=lGroundPartnerAgentSkipLoginUrl
			if(!lMapGroundPartnerAgentLoginMethod.Result){
				return lreturn
			}
			this.lLowMileageCarQuotationInputUtil=new THALowMileageCarQuotationInputUtil(this.driver,this.selenium)
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
			lPositiveCase=THARGPALowMileageCarQuotationInputType.DEFAULT_POSITIVE_CASE
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
			Map lMapActualResult=this.lTHALowMileageCarQuotationInputUtil.inputActualResult(isPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			lResult=lMapActualResult.Result
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
	public Map inputGroundPartnerAgentLogin(String strGroundPartnerAgentUser,String strGroundPartnerAgentPassword){
		Map lreturn=[:]
		String lGroundPartnerAgentUser=strGroundPartnerAgentUser.trim()
		if(lGroundPartnerAgentUser.length()<=0){
			lGroundPartnerAgentUser=THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_USER
		}
		String lGroundPartnerAgentPassword=strGroundPartnerAgentPassword.trim()
		if(lGroundPartnerAgentPassword.length()<=0){
			lGroundPartnerAgentPassword=THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_PASSWORD
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
	public Map inputGroundPartnerAgentLoginMethod(String strGroundPartnerAgentLoginMethod,String strGroundPartnerAgentAccountSource,String strGroundPartnerAgentUrlProductSelect,String strGroundPartnerAgentLanguage,String strGroundPartnerAgentIsLowMileageCar){
		Map lreturn=[:]
		String lGroundPartnerAgentLoginMethod=strGroundPartnerAgentLoginMethod.trim()
		if(lGroundPartnerAgentLoginMethod.length()<=0){
			lGroundPartnerAgentLoginMethod=THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD
		}
		String lGroundPartnerAgentAccountSource=strGroundPartnerAgentAccountSource.trim()
		if(lGroundPartnerAgentAccountSource.length()<=0){
			lGroundPartnerAgentAccountSource=THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE
		}
		String lGroundPartnerAgentUrlProductSelect=strGroundPartnerAgentUrlProductSelect.trim()
		if(lGroundPartnerAgentUrlProductSelect.length()<=0){
			lGroundPartnerAgentUrlProductSelect=THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT
		}
		String lGroundPartnerAgentLanguage=strGroundPartnerAgentLanguage.toUpperCase().trim()
		if(lGroundPartnerAgentLanguage.length()<=0){
			lGroundPartnerAgentLanguage=THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE.toUpperCase()
		}
		String lGroundPartnerAgentSkipLoginUrl=''
		Map lGroundPartnerAgentLoginMethodList=['2':'2','3':'3']
		Map lGroundPartnerAgentAccountSourceList=['1':'1','2':'2','3':'3','4':'4']
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('GroundPartnerAgentLoginMethod','')
			lreturn.put('GroundPartnerAgentAccountSource','')
			lreturn.put('GroundPartnerAgentUrlProductSelect','')
			lreturn.put('GroundPartnerAgentLanguage','')
			lreturn.put('GroundPartnerAgentIsLowMileageCar','')
			lreturn.put('GroundPartnerAgentSkipLoginUrl','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(lGroundPartnerAgentLoginMethod)
			if(!lGroundPartnerAgentLoginMethodItem){
				lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
			String lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(lGroundPartnerAgentAccountSource)
			if(!lGroundPartnerAgentAccountSourceItem){
				lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSourceItem
			if(lGroundPartnerAgentAccountSource.equalsIgnoreCase('4')){
				if(lGroundPartnerAgentLoginMethod.equalsIgnoreCase('2')){
					lGroundPartnerAgentLoginMethodItem='3'
					lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
				}
			}
			THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentAccountSource,THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE)
			if(THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE==3){
				THARGPALowMileageCarCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPALowMileageCarCoreType.CURRENT_SOCIAL_SKIP_RATING=true
			}else{
				THARGPALowMileageCarCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPALowMileageCarCoreType.CURRENT_SOCIAL_SKIP_RATING=false
			}
			THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT=lGroundPartnerAgentUrlProductSelect
			String lLanguageItem=lLanguageList.get(lGroundPartnerAgentLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARGPALowMileageCarQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE.toUpperCase())
			}
			lGroundPartnerAgentLanguage=lLanguageItem
			String lLocatorFormApp=''
			Boolean lIsFormReady=false
			switch(lGroundPartnerAgentLoginMethodItem){
				case '2':
					THARGPALowMileageCarCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					lLocatorMenuButtonProductOpenChildImage='#app .container-fluid #new-quote .row:nth-child(2) img[src="img/nq-car.png"]'
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
					THARGPALowMileageCarCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=false
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
						THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_SKIP_LOGIN=lGroundPartnerAgentSkipLoginUrl
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
						lGroundPartnerAgentLanguage=lLanguageSelected
						String lTagProductSelectButton=''
						lTagProductSelectButton='LowMileageCar-btn'
						String lLocatorProductSelectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProductSelectButton)
						WebElement lElementProductSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProductSelectButton)
						if(!lElementProductSelectButton){
							lLocatorProductSelectButton='#product-link img[alt="LowMileageCar insurance"]'
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
						lLocatorProductSpecificPageSelectButton='#LowMileageCar-insure-hero a'
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
					THARGPALowMileageCarCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					lGroundPartnerAgentLanguage=lLanguageSelected
					String lTagInputEmailText='email'
					String lLocatorInputEmailText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputEmailText)
					String lGroundPartnerAgentUser=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputEmailText,THARGPALowMileageCarCoreType.CURRENT_GROUND_PARTNER_AGENT_USER)
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
					lSelectGroundPartnerAgentProduct.selectByValue('LowMileageCar')
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
				lreturn.put('GroundPartnerAgentSkipLoginUrl',lGroundPartnerAgentSkipLoginUrl)
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
		String lLanguage=strLanguage.toUpperCase().trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPALowMileageCarQuotationInputType.DEFAULT_LANGUAGE.toUpperCase()
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			lLanguage=this.lTHALowMileageCarQuotationInputUtil.inputLanguage(lLanguage)
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
	public Map inputCarMake(String strCarMake){
		Map lreturn=[:]
		String lCarMake=strCarMake.trim()
		if(lCarMake.length()<=0){
			lCarMake=THARGPALowMileageCarQuotationInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			Map lMapCarMake=this.lTHALowMileageCarQuotationInputUtil.inputCarMake(lCarMake)
			if(!lMapCarMake.Result){
				lCarMake=''
			}else{
				lCarMake=lMapCarMake.CarMake
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
			lCarModel=THARGPALowMileageCarQuotationInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			Map lMapCarModel=this.lTHALowMileageCarQuotationInputUtil.inputCarModel(lCarModel)
			if(!lMapCarModel.Result){
				lCarModel=''
			}else{
				lCarModel=lMapCarModel.CarModel
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
			lCarYear=THARGPALowMileageCarQuotationInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			Map lMapCarYear=this.lTHALowMileageCarQuotationInputUtil.inputCarYear(lCarYear)
			if(!lMapCarYear.Result){
				lCarYear=''
			}else{
				lCarYear=lMapCarYear.CarYear
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
			lSubmodel=THARGPALowMileageCarQuotationInputType.DEFAULT_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('Submodel','')
			lreturn.put('Result',lResult)
			Map lMapSubmodel=this.lTHALowMileageCarQuotationInputUtil.inputSubmodel(lSubmodel)
			if(!lMapSubmodel.Result){
				lSubmodel=''
			}else{
				lSubmodel=lMapSubmodel.Submodel
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
			lGenderMain=THARGPALowMileageCarQuotationInputType.DEFAULT_GENDER_MAIN
		}
		String lMaritalStatus=strMaritalStatus.trim()
		if(lMaritalStatus.length()<=0){
			lMaritalStatus=THARGPALowMileageCarQuotationInputType.DEFAULT_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('GenderMain','')
			lreturn.put('MaritalStatus','')
			lreturn.put('Result',lResult)
			Map lMapGenderMain=this.lTHALowMileageCarQuotationInputUtil.inputGenderMainMaritalStatus(lGenderMain,lMaritalStatus)
			if(!lMapGenderMain.Result){
				lGenderMain=''
			}else{
				lGenderMain=lMapGenderMain.GenderMain
			}
			lResult=lMapGenderMain.Result
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
			lBirthDateMain=THARGPALowMileageCarQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('BirthDateMain','')
			lreturn.put('Result',lResult)
			Map lMapBirthDateMain=this.lTHALowMileageCarQuotationInputUtil.inputBirthDateMain(lBirthDateMain)
			if(!lMapBirthDateMain.Result){
				lBirthDateMain=''
			}else{
				lBirthDateMain=lMapBirthDateMain.BirthDateMain
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
			lYearDriving=THARGPALowMileageCarQuotationInputType.DEFAULT_YEAR_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('YearDriving','')
			lreturn.put('Result',lResult)
			Map lMapYearDriving=this.lTHALowMileageCarQuotationInputUtil.inputYearDriving(lYearDriving)
			if(!lMapYearDriving.Result){
				lYearDriving=''
			}else{
				lYearDriving=lMapYearDriving.YearDriving
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
			lClaimsNo=THARGPALowMileageCarQuotationInputType.DEFAULT_CLAIMS_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('ClaimsNo','')
			lreturn.put('Result',lResult)
			Map lMapClaimsNo=this.lTHALowMileageCarQuotationInputUtil.inputClaimsNo(lClaimsNo)
			if(!lMapClaimsNo.Result){
				lClaimsNo=''
			}else{
				lClaimsNo=lMapClaimsNo.ClaimsNo
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
			lVehicleUsage=THARGPALowMileageCarQuotationInputType.DEFAULT_VEHICLE_USAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsage','')
			lreturn.put('Result',lResult)
			Map lMapVehicleUsage=this.lTHALowMileageCarQuotationInputUtil.inputVehicleUsage(lVehicleUsage)
			if(!lMapVehicleUsage.Result){
				lVehicleUsage=''
			}else{
				lVehicleUsage=lMapVehicleUsage.VehicleUsage
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
			lVehicleUsageForCommercial=THARGPALowMileageCarQuotationInputType.DEFAULT_VEHICLE_USAGE_FOR_COMMERCIAL
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageForCommercial','')
			lreturn.put('Result',lResult)
			Map lMapVehicleUsageForCommercial=this.lTHALowMileageCarQuotationInputUtil.inputVehicleUsageForCommercial(lVehicleUsageForCommercial)
			if(!lMapVehicleUsageForCommercial.Result){
				lVehicleUsageForCommercial=''
			}else{
				lVehicleUsageForCommercial=lMapVehicleUsageForCommercial.VehicleUsageForCommercial
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
			lVehicleUsageDriveToWork=THARGPALowMileageCarQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWork','')
			lreturn.put('Result',lResult)
			Map lMapVehicleUsageDriveToWork=this.lTHALowMileageCarQuotationInputUtil.inputVehicleUsageDriveToWork(lVehicleUsageDriveToWork)
			if(!lMapVehicleUsageDriveToWork.Result){
				lVehicleUsageDriveToWork=''
			}else{
				lVehicleUsageDriveToWork=lMapVehicleUsageDriveToWork.VehicleUsageDriveToWork
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
			lVehicleUsageDriveToWorkOften=THARGPALowMileageCarQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK_OFTEN
		}
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWorkOften','')
			lreturn.put('Result',lResult)
			Map lMapVehicleUsageDriveToWorkOften=this.lTHALowMileageCarQuotationInputUtil.inputVehicleUsageDriveToWorkOften(lVehicleUsageDriveToWorkOften)
			if(!lMapVehicleUsageDriveToWorkOften.Result){
				lVehicleUsageDriveToWorkOften=''
			}else{
				lVehicleUsageDriveToWorkOften=lMapVehicleUsageDriveToWorkOften.VehicleUsageDriveToWorkOften
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
			lTaxiOrVehicleForHire=THARGPALowMileageCarQuotationInputType.DEFAULT_TAXI_OR_VEHICLE_FOR_HIRE
		}
		try{
			Boolean lResult=false
			lreturn.put('TaxiOrVehicleForHire','')
			lreturn.put('Result',lResult)
			Map lMapTaxiOrVehicleForHire=this.lTHALowMileageCarQuotationInputUtil.inputTaxiOrVehicleForHire(lTaxiOrVehicleForHire)
			if(!lMapTaxiOrVehicleForHire.Result){
				lTaxiOrVehicleForHire=''
			}else{
				lTaxiOrVehicleForHire=lMapTaxiOrVehicleForHire.TaxiOrVehicleForHire
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
			lRentalVehicle=THARGPALowMileageCarQuotationInputType.DEFAULT_RENTAL_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('RentalVehicle','')
			lreturn.put('Result',lResult)
			Map lMapRentalVehicle=this.lTHALowMileageCarQuotationInputUtil.inputRentalVehicle(lRentalVehicle)
			if(!lMapRentalVehicle.Result){
				lRentalVehicle=''
			}else{
				lRentalVehicle=lMapRentalVehicle.RentalVehicle
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
			lGoodsTransportVehicle=THARGPALowMileageCarQuotationInputType.DEFAULT_GOODS_TRANSPORT_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportVehicle','')
			lreturn.put('Result',lResult)
			Map lMapGoodsTransportVehicle=this.lTHALowMileageCarQuotationInputUtil.inputGoodsTransportVehicle(lGoodsTransportVehicle)
			if(!lMapGoodsTransportVehicle.Result){
				lGoodsTransportVehicle=''
			}else{
				lGoodsTransportVehicle=lMapGoodsTransportVehicle.GoodsTransportVehicle
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
			lLogisticsOrCourierCompany=THARGPALowMileageCarQuotationInputType.DEFAULT_LOGISTICS_OR_COURIER_COMPANY
		}
		try{
			Boolean lResult=false
			lreturn.put('LogisticsOrCourierCompany','')
			lreturn.put('Result',lResult)
			Map lMapLogisticsOrCourierCompany=this.lTHALowMileageCarQuotationInputUtil.inputLogisticsOrCourierCompany(lLogisticsOrCourierCompany)
			if(!lMapLogisticsOrCourierCompany.Result){
				lLogisticsOrCourierCompany=''
			}else{
				lLogisticsOrCourierCompany=lMapLogisticsOrCourierCompany.LogisticsOrCourierCompany
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
			lGoodsTransportRoute=THARGPALowMileageCarQuotationInputType.DEFAULT_GOODS_TRANSPORT_ROUTE
		}
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportRoute','')
			lreturn.put('Result',lResult)
			Map lMapGoodsTransportRoute=this.lTHALowMileageCarQuotationInputUtil.inputGoodsTransportRoute(lGoodsTransportRoute)
			if(!lMapGoodsTransportRoute.Result){
				lGoodsTransportRoute=''
			}else{
				lGoodsTransportRoute=lMapGoodsTransportRoute.GoodsTransportRoute
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
			lPostalCode=THARGPALowMileageCarQuotationInputType.DEFAULT_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('PostalCode','')
			lreturn.put('Result',lResult)
			Map lMapPostalCode=this.lTHALowMileageCarQuotationInputUtil.inputPostalCode(lPostalCode)
			if(!lMapPostalCode.Result){
				lPostalCode=''
			}else{
				lPostalCode=lMapPostalCode.PostalCode
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
			lOdometerReading=THARGPALowMileageCarQuotationInputType.DEFAULT_ODOMETER_READING
		}
		try{
			Boolean lResult=false
			lreturn.put('OdometerReading','')
			lreturn.put('Result',lResult)
			Map lMapOdometerReading=this.lTHALowMileageCarQuotationInputUtil.inputOdometerReading(lOdometerReading)
			if(!lMapOdometerReading.Result){
				lOdometerReading=''
			}else{
				lOdometerReading=lMapOdometerReading.OdometerReading
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
			lDeclaredNcb=THARGPALowMileageCarQuotationInputType.DEFAULT_DECLARED_NCB
		}
		try{
			Boolean lResult=false
			lreturn.put('DeclaredNcb','')
			lreturn.put('Result',lResult)
			Map lMapDeclaredNcb=this.lTHALowMileageCarQuotationInputUtil.inputDeclaredNcb(lDeclaredNcb)
			if(!lMapDeclaredNcb.Result){
				lDeclaredNcb=''
			}else{
				lDeclaredNcb=lMapDeclaredNcb.DeclaredNcb
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
			lUnderFinancing=THARGPALowMileageCarQuotationInputType.DEFAULT_UNDER_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('UnderFinancing','')
			lreturn.put('Result',lResult)
			Map lMapUnderFinancing=this.lTHALowMileageCarQuotationInputUtil.inputUnderFinancing(lUnderFinancing)
			if(!lMapUnderFinancing.Result){
				lUnderFinancing=''
			}else{
				lUnderFinancing=lMapUnderFinancing.UnderFinancing
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
			lCarCamera=THARGPALowMileageCarQuotationInputType.DEFAULT_CAR_CAMERA
		}
		try{
			Boolean lResult=false
			lreturn.put('CarCamera','')
			lreturn.put('Result',lResult)
			Map lMapCarCamera=this.lTHALowMileageCarQuotationInputUtil.inputCarCamera(lCarCamera)
			if(!lMapCarCamera.Result){
				lCarCamera=''
			}else{
				lCarCamera=lMapCarCamera.CarCamera
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
			lTentative=THARGPALowMileageCarQuotationInputType.DEFAULT_TENTATIVE
		}
		try{
			Boolean lResult=false
			lreturn.put('Tentative','')
			lreturn.put('Result',lResult)
			Map lMapTentative=this.lTHALowMileageCarQuotationInputUtil.inputTentative(lTentative)
			if(!lMapTentative.Result){
				lTentative=''
			}else{
				lTentative=lMapTentative.Tentative
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
			lAlcoholFree=THARGPALowMileageCarQuotationInputType.DEFAULT_ALCOHOL_FREE
		}
		try{
			Boolean lResult=false
			lreturn.put('AlcoholFree','')
			lreturn.put('Result',lResult)
			Map lMapAlcoholFree=this.lTHALowMileageCarQuotationInputUtil.inputAlcoholFree(lAlcoholFree)
			if(!lMapAlcoholFree.Result){
				lAlcoholFree=''
			}else{
				lAlcoholFree=lMapAlcoholFree.AlcoholFree
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
			Map lMapPolicyInsurer=this.lTHALowMileageCarQuotationInputUtil.inputPolicyInsurer(lPolicyInsurer)
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
}