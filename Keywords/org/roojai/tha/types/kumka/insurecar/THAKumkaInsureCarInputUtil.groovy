package org.roojai.tha.types.kumka.insurecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaInsureCarInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaInsureCarInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
		String lBaseUrl=caseOutput.BaseUrl.toString().trim()
		String lLoginUser=caseInput.LoginUser.toString().trim()
		String lLoginPassword=caseInput.LoginPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lCarMake=caseInput.CarMake.toString().trim()
		String lCarModel=caseInput.CarModel.toString().trim()
		String lCarYear=caseInput.CarYear.toString().trim()
		String lCarSubmodel=caseInput.CarSubmodel.toString().trim()
		String lCustomerPhoneNo=caseInput.CustomerPhoneNo.toString().trim()
		String lCustomerMaritalStatusSex=caseInput.CustomerMaritalStatusSex.toString().trim()
		String lCustomerDobPositiveCase=caseInput.CustomerDobPositiveCase.toString().trim()
		String lCustomerDob=caseInput.CustomerDob.toString().trim()
		String lCustomerYearOfDriving=caseInput.CustomerYearOfDriving.toString().trim()
		String lCustomerNumberOfClaim=caseInput.CustomerNumberOfClaim.toString().trim()
		String lCustomerPostalCodePositiveCase=caseInput.CustomerPostalCodePositiveCase.toString().trim()
		String lCustomerPostalCode=caseInput.CustomerPostalCode.toString().trim()
		String lCarOdometer=caseInput.CarOdometer.toString().trim()
		String lCarUsage=caseInput.CarUsage.toString().trim()
		String lCarDashCamera=caseInput.CarDashCamera.toString().trim()
		String lCarInsuranceDue=caseInput.CarInsuranceDue.toString().trim()
		String lCarNcbRate=caseInput.CarNcbRate.toString().trim()
		String lCarCurrentInsurer=caseInput.CarCurrentInsurer.toString().trim()
		String lCarFinancing=caseInput.CarFinancing.toString().trim()
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCustomerMaritalStatusSex=this.inputCustomerMaritalStatusSex(lCustomerMaritalStatusSex)
						if(!lMapCustomerMaritalStatusSex.Result){
							lCustomerMaritalStatusSex=''
						}else{
							lCustomerMaritalStatusSex=lMapCustomerMaritalStatusSex.CustomerMaritalStatusSex
						}
						caseOutput.CustomerMaritalStatusSex=lCustomerMaritalStatusSex
						if(!lMapCustomerMaritalStatusSex.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerDobPositiveCase=this.inputCustomerDobPositiveCase(lCustomerDobPositiveCase)
						if(!lMapCustomerDobPositiveCase.Result){
							lCustomerDobPositiveCase=''
						}else{
							lCustomerDobPositiveCase=lMapCustomerDobPositiveCase.CustomerDobPositiveCase
						}
						caseOutput.CustomerDobPositiveCase=lCustomerDobPositiveCase
						if(lCustomerDobPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
						Map lMapCustomerDob=this.inputCustomerDob(lCustomerDob,lIsCustomerDobPositiveCase)
						lCustomerDob=lMapCustomerDob.CustomerDob
						THAKumkaInsureCarCoreType.CURRENT_QUOTATION_ACCOUNT_PERSONAL_BIRTHDATE=lCustomerDob
						caseOutput.CustomerDob=lCustomerDob
						if(!lMapCustomerDob.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerPostalCodePositiveCase=this.inputCustomerPostalCodePositiveCase(lCustomerPostalCodePositiveCase)
						if(!lMapCustomerPostalCodePositiveCase.Result){
							lCustomerPostalCodePositiveCase=''
						}else{
							lCustomerPostalCodePositiveCase=lMapCustomerPostalCodePositiveCase.CustomerPostalCodePositiveCase
						}
						caseOutput.CustomerPostalCodePositiveCase=lCustomerPostalCodePositiveCase
						if(lCustomerPostalCodePositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerPostalCodePositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerPostalCodePositiveCase)
						Map lMapCustomerPostalCode=this.inputCustomerPostalCode(lCustomerPostalCode,lIsCustomerPostalCodePositiveCase)
						lCustomerPostalCode=lMapCustomerPostalCode.CustomerPostalCode
						caseOutput.CustomerPostalCode=lCustomerPostalCode
						if(!lMapCustomerPostalCode.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerYearOfDriving=this.inputCustomerYearOfDriving(lCustomerYearOfDriving)
						if(!lMapCustomerYearOfDriving.Result){
							lCustomerYearOfDriving=''
						}else{
							lCustomerYearOfDriving=lMapCustomerYearOfDriving.CustomerYearOfDriving
						}
						caseOutput.CustomerYearOfDriving=lCustomerYearOfDriving
						if(!lMapCustomerYearOfDriving.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerNumberOfClaim=this.inputCustomerNumberOfClaim(lCustomerNumberOfClaim)
						if(!lMapCustomerNumberOfClaim.Result){
							lCustomerNumberOfClaim=''
						}else{
							lCustomerNumberOfClaim=lMapCustomerNumberOfClaim.CustomerNumberOfClaim
						}
						caseOutput.CustomerNumberOfClaim=lCustomerNumberOfClaim
						if(lCustomerNumberOfClaim.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarOdometer=this.inputCarOdometer(lCarOdometer)
						if(!lMapCarOdometer.Result){
							lCarOdometer=''
						}else{
							lCarOdometer=lMapCarOdometer.CarOdometer
						}
						caseOutput.CarOdometer=lCarOdometer
						if(lCarOdometer.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarUsage=this.inputCarUsage(lCarUsage)
						if(!lMapCarUsage.Result){
							lCarUsage=''
						}else{
							lCarUsage=lMapCarUsage.CarUsage
						}
						caseOutput.CarUsage=lCarUsage
						if(lCarUsage.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarDashCamera=this.inputCarDashCamera(lCarDashCamera)
						if(!lMapCarDashCamera.Result){
							lCarDashCamera=''
						}else{
							lCarDashCamera=lMapCarDashCamera.CarDashCamera
						}
						caseOutput.CarDashCamera=lCarDashCamera
						if(lCarDashCamera.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						lCarInsuranceDue='No Option'
						caseOutput.CarInsuranceDue=lCarInsuranceDue
					/*
					 Map lMapCarInsuranceDue=this.inputCarInsuranceDue(lCarInsuranceDue)
					 if(!lMapCarInsuranceDue.Result){
					 lCarInsuranceDue=''
					 }else{
					 lCarInsuranceDue=lMapCarInsuranceDue.CarInsuranceDue
					 }
					 caseOutput.CarInsuranceDue=lCarInsuranceDue
					 if(lCarInsuranceDue.length()<=0){
					 return lreturn
					 }
					 if(!this.waitUntilLoaded()){
					 return lreturn
					 }*/
						Map lMapCarNcbRate=this.inputCarNcbRate(lCarNcbRate)
						if(!lMapCarNcbRate.Result){
							lCarNcbRate=''
						}else{
							lCarNcbRate=lMapCarNcbRate.CarNcbRate
						}
						caseOutput.CarNcbRate=lCarNcbRate
						if(lCarNcbRate.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarCurrentInsurer=this.inputCarCurrentInsurer(lCarCurrentInsurer)
						if(!lMapCarCurrentInsurer.Result){
							lCarCurrentInsurer=''
						}else{
							lCarCurrentInsurer=lMapCarCurrentInsurer.CarCurrentInsurer
						}
						caseOutput.CarCurrentInsurer=lCarCurrentInsurer
						if(lCarCurrentInsurer.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarFinancing=this.inputCarFinancing(lCarFinancing)
						if(!lMapCarFinancing.Result){
							lCarFinancing=''
						}else{
							lCarFinancing=lMapCarFinancing.CarFinancing
						}
						caseOutput.CarFinancing=lCarFinancing
						if(lCarFinancing.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCustomerPhoneNo=this.inputCustomerPhoneNo(lCustomerPhoneNo)
						if(!lMapCustomerPhoneNo.Result){
							lCustomerPhoneNo=''
						}else{
							lCustomerPhoneNo=lMapCustomerPhoneNo.CustomerPhoneNo
						}
						caseOutput.CustomerPhoneNo=lCustomerPhoneNo
						if(lCustomerPhoneNo.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						break
					case 'B':
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
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
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCustomerMaritalStatusSex=this.inputCustomerMaritalStatusSex(lCustomerMaritalStatusSex)
						if(!lMapCustomerMaritalStatusSex.Result){
							lCustomerMaritalStatusSex=''
						}else{
							lCustomerMaritalStatusSex=lMapCustomerMaritalStatusSex.CustomerMaritalStatusSex
						}
						caseOutput.CustomerMaritalStatusSex=lCustomerMaritalStatusSex
						if(!lMapCustomerMaritalStatusSex.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerDobPositiveCase=this.inputCustomerDobPositiveCase(lCustomerDobPositiveCase)
						if(!lMapCustomerDobPositiveCase.Result){
							lCustomerDobPositiveCase=''
						}else{
							lCustomerDobPositiveCase=lMapCustomerDobPositiveCase.CustomerDobPositiveCase
						}
						caseOutput.CustomerDobPositiveCase=lCustomerDobPositiveCase
						if(lCustomerDobPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
						Map lMapCustomerDob=this.inputCustomerDob(lCustomerDob,lIsCustomerDobPositiveCase)
						lCustomerDob=lMapCustomerDob.CustomerDob
						THAKumkaInsureCarCoreType.CURRENT_QUOTATION_ACCOUNT_PERSONAL_BIRTHDATE=lCustomerDob
						caseOutput.CustomerDob=lCustomerDob
						if(!lMapCustomerDob.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerPostalCodePositiveCase=this.inputCustomerPostalCodePositiveCase(lCustomerPostalCodePositiveCase)
						if(!lMapCustomerPostalCodePositiveCase.Result){
							lCustomerPostalCodePositiveCase=''
						}else{
							lCustomerPostalCodePositiveCase=lMapCustomerPostalCodePositiveCase.CustomerPostalCodePositiveCase
						}
						caseOutput.CustomerPostalCodePositiveCase=lCustomerPostalCodePositiveCase
						if(lCustomerPostalCodePositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerPostalCodePositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerPostalCodePositiveCase)
						Map lMapCustomerPostalCode=this.inputCustomerPostalCode(lCustomerPostalCode,lIsCustomerPostalCodePositiveCase)
						lCustomerPostalCode=lMapCustomerPostalCode.CustomerPostalCode
						caseOutput.CustomerPostalCode=lCustomerPostalCode
						if(!lMapCustomerPostalCode.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerYearOfDriving=this.inputCustomerYearOfDriving(lCustomerYearOfDriving)
						if(!lMapCustomerYearOfDriving.Result){
							lCustomerYearOfDriving=''
						}else{
							lCustomerYearOfDriving=lMapCustomerYearOfDriving.CustomerYearOfDriving
						}
						caseOutput.CustomerYearOfDriving=lCustomerYearOfDriving
						if(!lMapCustomerYearOfDriving.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerNumberOfClaim=this.inputCustomerNumberOfClaim(lCustomerNumberOfClaim)
						if(!lMapCustomerNumberOfClaim.Result){
							lCustomerNumberOfClaim=''
						}else{
							lCustomerNumberOfClaim=lMapCustomerNumberOfClaim.CustomerNumberOfClaim
						}
						caseOutput.CustomerNumberOfClaim=lCustomerNumberOfClaim
						if(lCustomerNumberOfClaim.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarOdometer=this.inputCarOdometer(lCarOdometer)
						if(!lMapCarOdometer.Result){
							lCarOdometer=''
						}else{
							lCarOdometer=lMapCarOdometer.CarOdometer
						}
						caseOutput.CarOdometer=lCarOdometer
						if(lCarOdometer.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarUsage=this.inputCarUsage(lCarUsage)
						if(!lMapCarUsage.Result){
							lCarUsage=''
						}else{
							lCarUsage=lMapCarUsage.CarUsage
						}
						caseOutput.CarUsage=lCarUsage
						if(lCarUsage.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarDashCamera=this.inputCarDashCamera(lCarDashCamera)
						if(!lMapCarDashCamera.Result){
							lCarDashCamera=''
						}else{
							lCarDashCamera=lMapCarDashCamera.CarDashCamera
						}
						caseOutput.CarDashCamera=lCarDashCamera
						if(lCarDashCamera.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						lCarInsuranceDue='No Option'
						caseOutput.CarInsuranceDue=lCarInsuranceDue
					/*
					 Map lMapCarInsuranceDue=this.inputCarInsuranceDue(lCarInsuranceDue)
					 if(!lMapCarInsuranceDue.Result){
					 lCarInsuranceDue=''
					 }else{
					 lCarInsuranceDue=lMapCarInsuranceDue.CarInsuranceDue
					 }
					 caseOutput.CarInsuranceDue=lCarInsuranceDue
					 if(lCarInsuranceDue.length()<=0){
					 return lreturn
					 }
					 if(!this.waitUntilLoaded()){
					 return lreturn
					 }*/
						Map lMapCarNcbRate=this.inputCarNcbRate(lCarNcbRate)
						if(!lMapCarNcbRate.Result){
							lCarNcbRate=''
						}else{
							lCarNcbRate=lMapCarNcbRate.CarNcbRate
						}
						caseOutput.CarNcbRate=lCarNcbRate
						if(lCarNcbRate.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarCurrentInsurer=this.inputCarCurrentInsurer(lCarCurrentInsurer)
						if(!lMapCarCurrentInsurer.Result){
							lCarCurrentInsurer=''
						}else{
							lCarCurrentInsurer=lMapCarCurrentInsurer.CarCurrentInsurer
						}
						caseOutput.CarCurrentInsurer=lCarCurrentInsurer
						if(lCarCurrentInsurer.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarFinancing=this.inputCarFinancing(lCarFinancing)
						if(!lMapCarFinancing.Result){
							lCarFinancing=''
						}else{
							lCarFinancing=lMapCarFinancing.CarFinancing
						}
						caseOutput.CarFinancing=lCarFinancing
						if(lCarFinancing.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCustomerPhoneNo=this.inputCustomerPhoneNo(lCustomerPhoneNo)
						if(!lMapCustomerPhoneNo.Result){
							lCustomerPhoneNo=''
						}else{
							lCustomerPhoneNo=lMapCustomerPhoneNo.CustomerPhoneNo
						}
						caseOutput.CustomerPhoneNo=lCustomerPhoneNo
						if(lCustomerPhoneNo.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						break
					default:
						return lreturn
						break
				}
			}else{
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
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
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
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
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
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
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
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCustomerMaritalStatusSex=this.inputCustomerMaritalStatusSex(lCustomerMaritalStatusSex)
				if(!lMapCustomerMaritalStatusSex.Result){
					lCustomerMaritalStatusSex=''
				}else{
					lCustomerMaritalStatusSex=lMapCustomerMaritalStatusSex.CustomerMaritalStatusSex
				}
				caseOutput.CustomerMaritalStatusSex=lCustomerMaritalStatusSex
				if(!lMapCustomerMaritalStatusSex.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerDobPositiveCase=this.inputCustomerDobPositiveCase(lCustomerDobPositiveCase)
				if(!lMapCustomerDobPositiveCase.Result){
					lCustomerDobPositiveCase=''
				}else{
					lCustomerDobPositiveCase=lMapCustomerDobPositiveCase.CustomerDobPositiveCase
				}
				caseOutput.CustomerDobPositiveCase=lCustomerDobPositiveCase
				if(lCustomerDobPositiveCase.length()<=0){
					return lreturn
				}
				Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
				Map lMapCustomerDob=this.inputCustomerDob(lCustomerDob,lIsCustomerDobPositiveCase)
				lCustomerDob=lMapCustomerDob.CustomerDob
				THAKumkaInsureCarCoreType.CURRENT_QUOTATION_ACCOUNT_PERSONAL_BIRTHDATE=lCustomerDob
				caseOutput.CustomerDob=lCustomerDob
				if(!lMapCustomerDob.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerPostalCodePositiveCase=this.inputCustomerPostalCodePositiveCase(lCustomerPostalCodePositiveCase)
				if(!lMapCustomerPostalCodePositiveCase.Result){
					lCustomerPostalCodePositiveCase=''
				}else{
					lCustomerPostalCodePositiveCase=lMapCustomerPostalCodePositiveCase.CustomerPostalCodePositiveCase
				}
				caseOutput.CustomerPostalCodePositiveCase=lCustomerPostalCodePositiveCase
				if(lCustomerPostalCodePositiveCase.length()<=0){
					return lreturn
				}
				Boolean lIsCustomerPostalCodePositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerPostalCodePositiveCase)
				Map lMapCustomerPostalCode=this.inputCustomerPostalCode(lCustomerPostalCode,lIsCustomerPostalCodePositiveCase)
				lCustomerPostalCode=lMapCustomerPostalCode.CustomerPostalCode
				caseOutput.CustomerPostalCode=lCustomerPostalCode
				if(!lMapCustomerPostalCode.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerYearOfDriving=this.inputCustomerYearOfDriving(lCustomerYearOfDriving)
				if(!lMapCustomerYearOfDriving.Result){
					lCustomerYearOfDriving=''
				}else{
					lCustomerYearOfDriving=lMapCustomerYearOfDriving.CustomerYearOfDriving
				}
				caseOutput.CustomerYearOfDriving=lCustomerYearOfDriving
				if(!lMapCustomerYearOfDriving.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerNumberOfClaim=this.inputCustomerNumberOfClaim(lCustomerNumberOfClaim)
				if(!lMapCustomerNumberOfClaim.Result){
					lCustomerNumberOfClaim=''
				}else{
					lCustomerNumberOfClaim=lMapCustomerNumberOfClaim.CustomerNumberOfClaim
				}
				caseOutput.CustomerNumberOfClaim=lCustomerNumberOfClaim
				if(lCustomerNumberOfClaim.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCarOdometer=this.inputCarOdometer(lCarOdometer)
				if(!lMapCarOdometer.Result){
					lCarOdometer=''
				}else{
					lCarOdometer=lMapCarOdometer.CarOdometer
				}
				caseOutput.CarOdometer=lCarOdometer
				if(lCarOdometer.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCarUsage=this.inputCarUsage(lCarUsage)
				if(!lMapCarUsage.Result){
					lCarUsage=''
				}else{
					lCarUsage=lMapCarUsage.CarUsage
				}
				caseOutput.CarUsage=lCarUsage
				if(lCarUsage.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCarDashCamera=this.inputCarDashCamera(lCarDashCamera)
				if(!lMapCarDashCamera.Result){
					lCarDashCamera=''
				}else{
					lCarDashCamera=lMapCarDashCamera.CarDashCamera
				}
				caseOutput.CarDashCamera=lCarDashCamera
				if(lCarDashCamera.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				lCarInsuranceDue='No Option'
				caseOutput.CarInsuranceDue=lCarInsuranceDue
				/*
				 Map lMapCarInsuranceDue=this.inputCarInsuranceDue(lCarInsuranceDue)
				 if(!lMapCarInsuranceDue.Result){
				 lCarInsuranceDue=''
				 }else{
				 lCarInsuranceDue=lMapCarInsuranceDue.CarInsuranceDue
				 }
				 caseOutput.CarInsuranceDue=lCarInsuranceDue
				 if(lCarInsuranceDue.length()<=0){
				 return lreturn
				 }
				 if(!this.waitUntilLoaded()){
				 return lreturn
				 }*/
				Map lMapCarNcbRate=this.inputCarNcbRate(lCarNcbRate)
				if(!lMapCarNcbRate.Result){
					lCarNcbRate=''
				}else{
					lCarNcbRate=lMapCarNcbRate.CarNcbRate
				}
				caseOutput.CarNcbRate=lCarNcbRate
				if(lCarNcbRate.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCarCurrentInsurer=this.inputCarCurrentInsurer(lCarCurrentInsurer)
				if(!lMapCarCurrentInsurer.Result){
					lCarCurrentInsurer=''
				}else{
					lCarCurrentInsurer=lMapCarCurrentInsurer.CarCurrentInsurer
				}
				caseOutput.CarCurrentInsurer=lCarCurrentInsurer
				if(lCarCurrentInsurer.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCarFinancing=this.inputCarFinancing(lCarFinancing)
				if(!lMapCarFinancing.Result){
					lCarFinancing=''
				}else{
					lCarFinancing=lMapCarFinancing.CarFinancing
				}
				caseOutput.CarFinancing=lCarFinancing
				if(lCarFinancing.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCustomerPhoneNo=this.inputCustomerPhoneNo(lCustomerPhoneNo)
				if(!lMapCustomerPhoneNo.Result){
					lCustomerPhoneNo=''
				}else{
					lCustomerPhoneNo=lMapCustomerPhoneNo.CustomerPhoneNo
				}
				caseOutput.CustomerPhoneNo=lCustomerPhoneNo
				if(lCustomerPhoneNo.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
			}
			if(!this.waitUntilLoaded()){
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
			lPositiveCase=THAKumkaInsureCarInputType.DEFAULT_POSITIVE_CASE
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
			lLoginUser=THAKumkaInsureCarInputType.DEFAULT_LOGIN_USER
		}
		String lLoginPassword=strLoginPassword.trim()
		if(lLoginPassword.length()<=0){
			lLoginPassword=THAKumkaInsureCarInputType.DEFAULT_LOGIN_PASSWORD
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
			lBaseUrl=THAKumkaInsureCarInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAKumkaInsureCarInputType.DEFAULT_VERSION
		lDefaultVersion=lDefaultVersion.toUpperCase()
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
			lVersion=lVersion.toUpperCase()
			String lNavigateUrl=lBaseUrl+'/#/'
			String[] lVersionStringList=lVersion.split('-')
			Integer lVersionStringIndex=0
			String lVersionStringText=''
			lVersion=''
			for(String lVersionStringItem in lVersionStringList){
				lVersionStringText=lVersionStringItem.trim()
				if(lVersionStringIndex==0){
					lVersionStringText='?ABTestResultPlan='+lVersionStringText
					lVersion=lVersion+lVersionStringText
					lNavigateUrl=lNavigateUrl+lVersionStringText
				}
				if(lVersionStringIndex==1){
					lVersionStringText='&questionPrevInsurer='+lVersionStringText
					lVersion=lVersion+lVersionStringText
					lNavigateUrl=lNavigateUrl+lVersionStringText
				}
				if(lVersionStringIndex==2){
					lVersionStringText='&carFinancing='+lVersionStringText
					lVersion=lVersion+lVersionStringText
					lNavigateUrl=lNavigateUrl+lVersionStringText
				}
				lVersionStringIndex=lVersionStringIndex+1
			}
			this.driver.get(lNavigateUrl)
			IGNUemaHelper.delayThreadSecond(3)
			lVersionOutput=lVersion
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
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
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
	public Map inputLanguageA(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAKumkaInsureCarInputType.DEFAULT_LANGUAGE.toUpperCase())
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
				lLanguage=THAKumkaInsureCarInputType.DEFAULT_LANGUAGE
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
	public Map inputLanguageB(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAKumkaInsureCarInputType.DEFAULT_LANGUAGE.toUpperCase())
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
				lLanguage=THAKumkaInsureCarInputType.DEFAULT_LANGUAGE
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
	public static final String CONST_TAG_PAGE_GROUP_LIST='step-card'
	public static final String CONST_TAG_PAGE_GROUP_CLASS_ACTIVE='opacity1'
	public static final String CONST_TAG_PAGE_ITEM_LIST='question-card'
	public static final String CONST_TAG_PAGE_ITEM_CLASS_ACTIVE='active'
	public static final String CONST_TAG_BUTTON_PAGE_NEXT='next-btn'
	public String getLocatorPageGroupActiveByCurrent(){
		//document.querySelector('[data-selenium-name="step-card"].opacity1')
		String lreturn=''
		try{
			String lTagPageGroup=this.CONST_TAG_PAGE_GROUP_LIST
			String lLocatorPageGroupActiveByCurrent=IGNUemaHelper.getTagDataSeleniumKey(lTagPageGroup)+'.'+this.CONST_TAG_PAGE_GROUP_CLASS_ACTIVE
			lreturn=lLocatorPageGroupActiveByCurrent
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public WebElement getWebElementPageGroupActiveByCurrent(){
		WebElement lreturn=null
		try{
			lreturn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,this.getLocatorPageGroupActiveByCurrent())
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getLocatorPageGroupActiveByName(String tagPageGroupName){
		//document.querySelector('[data-selenium-name="step-card"][data-selenium-value="stepCar"].opacity1')
		String lreturn=''
		try{
			String lTagPageGroup=this.CONST_TAG_PAGE_GROUP_LIST
			String lLocatorPageGroupActiveByName=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPageGroup,tagPageGroupName)+'.'+this.CONST_TAG_PAGE_GROUP_CLASS_ACTIVE
			lreturn=lLocatorPageGroupActiveByName
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public WebElement getWebElementPageGroupActiveByName(String tagPageGroupName){
		WebElement lreturn=null
		try{
			lreturn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,this.getLocatorPageGroupActiveByName(tagPageGroupName))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean checkPageGroupIsActiveByName(String tagPageGroupName){
		Boolean lreturn=false
		try{
			WebElement lElementPageGroupActiveByName=this.getWebElementPageGroupActiveByName(tagPageGroupName)
			if(lElementPageGroupActiveByName){
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getLocatorPageItemActiveByCurrent(String tagPageGroupName){
		//document.querySelector('[data-selenium-name="step-card"][data-selenium-value="stepCar"].opacity1 [data-selenium-name="question-card"].active')
		String lreturn=''
		try{
			String lTagPageItem=this.CONST_TAG_PAGE_ITEM_LIST
			String lLocatorPageItemActiveByCurrent=IGNUemaHelper.concatCssLocatorParentChild(this.getLocatorPageGroupActiveByName(tagPageGroupName),IGNUemaHelper.getTagDataSeleniumKey(lTagPageItem)+'.'+this.CONST_TAG_PAGE_GROUP_CLASS_ACTIVE)
			lreturn=lLocatorPageItemActiveByCurrent
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public WebElement getWebElementPageItemActiveByCurrent(){
		WebElement lreturn=null
		try{
			lreturn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,this.getLocatorPageItemActiveByCurrent(IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,this.getWebElementPageGroupActiveByCurrent())))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String getLocatorPageItemActiveByName(String tagPageGroupName,String tagPageItemName){
		//document.querySelector('[data-selenium-name="step-card"][data-selenium-value="stepCar"].opacity1 [data-selenium-name="question-card"][data-selenium-value="brand"].active')
		String lreturn=''
		try{
			String lTagPageItem=this.CONST_TAG_PAGE_ITEM_LIST
			String lLocatorPageItemActiveByName=IGNUemaHelper.concatCssLocatorParentChild(this.getLocatorPageGroupActiveByName(tagPageGroupName),IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPageItem,tagPageItemName)+'.'+this.CONST_TAG_PAGE_ITEM_CLASS_ACTIVE)
			lreturn=lLocatorPageItemActiveByName
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public WebElement getWebElementPageItemActiveByName(String tagPageGroupName,String tagPageItemName){
		WebElement lreturn=null
		try{
			lreturn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,this.getLocatorPageItemActiveByName(tagPageGroupName,tagPageItemName))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean checkPageItemIsActiveByName(String tagPageGroupName,String tagPageItemName){
		Boolean lreturn=false
		try{
			WebElement lElementPageItemActiveByName=this.getWebElementPageItemActiveByName(tagPageGroupName,tagPageItemName)
			if(lElementPageItemActiveByName){
				lreturn=true
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
			lCarMake=THAKumkaInsureCarInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarMake=false
			String lTagCarMakePopularImageButtonList='brand-logo'
			String lTagCarMakeDropdownButton='brand-selected'
			String lTagCarMakeDropdownItemList='brand-item'
			String lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarMakePopularImageButtonList,lCarMake,false)
			lIsFoundCarMake=lCarMakeItem.length()>0
			if(!lIsFoundCarMake){
				lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarMakeDropdownButton,lTagCarMakeDropdownItemList,lCarMake,false)
				lIsFoundCarMake=lCarMakeItem.length()>0
			}
			if(!lIsFoundCarMake){
				lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarMakePopularImageButtonList,lCarMake,true)
				lIsFoundCarMake=lCarMakeItem.length()>0
			}
			lCarMake=lCarMakeItem
			lResult=lIsFoundCarMake
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
			lCarMake=THAKumkaInsureCarInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarMake=false
			String lTagCarMakePopularImageButtonList='brand-logo'
			String lTagCarMakeDropdownButton='brand-selected'
			String lTagCarMakeDropdownItemList='brand-item'
			String lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarMakePopularImageButtonList,lCarMake,false)
			lIsFoundCarMake=lCarMakeItem.length()>0
			if(!lIsFoundCarMake){
				lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarMakeDropdownButton,lTagCarMakeDropdownItemList,lCarMake,false)
				lIsFoundCarMake=lCarMakeItem.length()>0
			}
			if(!lIsFoundCarMake){
				lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarMakePopularImageButtonList,lCarMake,true)
				lIsFoundCarMake=lCarMakeItem.length()>0
			}
			lCarMake=lCarMakeItem
			lResult=lIsFoundCarMake
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
			lCarModel=THAKumkaInsureCarInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarModel=false
			String lTagCarModelDropdownButton='model-selected'
			String lTagCarModelDropdownItemList='model-item'
			String lCarModelItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarModelDropdownButton,lTagCarModelDropdownItemList,lCarModel,true)
			lIsFoundCarModel=lCarModelItem.length()>0
			lCarModel=lCarModelItem
			lResult=lIsFoundCarModel
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
			lCarModel=THAKumkaInsureCarInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarModel=false
			String lTagCarModelDropdownButton='model-selected'
			String lTagCarModelDropdownItemList='model-item'
			String lCarModelItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarModelDropdownButton,lTagCarModelDropdownItemList,lCarModel,true)
			lIsFoundCarModel=lCarModelItem.length()>0
			lCarModel=lCarModelItem
			lResult=lIsFoundCarModel
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
			lCarYear=THAKumkaInsureCarInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarYear=false
			String lTagCarYearDropdownButton='year-selected'
			String lTagCarYearDropdownItemList='year-item'
			String lCarYearItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarYearDropdownButton,lTagCarYearDropdownItemList,lCarYear,true)
			lIsFoundCarYear=lCarYearItem.length()>0
			lCarYear=lCarYearItem
			lResult=lIsFoundCarYear
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
			lCarYear=THAKumkaInsureCarInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarYear=false
			String lTagCarYearDropdownButton='year-selected'
			String lTagCarYearDropdownItemList='year-item'
			String lCarYearItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarYearDropdownButton,lTagCarYearDropdownItemList,lCarYear,true)
			lIsFoundCarYear=lCarYearItem.length()>0
			lCarYear=lCarYearItem
			lResult=lIsFoundCarYear
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
	public Map inputCarSubmodelA(String strCarSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strCarSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THAKumkaInsureCarInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarSubmodel=false
			String lTagCarSubmodelDropdownButton='subModel-select'
			String lTagCarSubmodelDropdownItemList='subModel-item'
			String lCarSubmodelItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV3(this.driver,lTagCarSubmodelDropdownButton,lTagCarSubmodelDropdownItemList,lCarSubmodel,true)
			lIsFoundCarSubmodel=lCarSubmodelItem.length()>0
			lCarSubmodel=lCarSubmodelItem
			lResult=lIsFoundCarSubmodel
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
	public Map inputCarSubmodelB(String strCarSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strCarSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THAKumkaInsureCarInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarSubmodel=false
			String lTagCarSubmodelDropdownButton='subModel-select'
			String lTagCarSubmodelDropdownItemList='subModel-item'
			String lCarSubmodelItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV3(this.driver,lTagCarSubmodelDropdownButton,lTagCarSubmodelDropdownItemList,lCarSubmodel,true)
			lIsFoundCarSubmodel=lCarSubmodelItem.length()>0
			lCarSubmodel=lCarSubmodelItem
			lResult=lIsFoundCarSubmodel
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
	public Map inputCustomerPhoneNo(String strCustomerPhoneNo){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerPhoneNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerPhoneNoA(strCustomerPhoneNo)
						break
					case 'B':
						lreturn=this.inputCustomerPhoneNoB(strCustomerPhoneNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerPhoneNoA(strCustomerPhoneNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerPhoneNoA(String strCustomerPhoneNo){
		Map lreturn=[:]
		String lCustomerPhoneNo=strCustomerPhoneNo.trim()
		if(lCustomerPhoneNo.length()<=0){
			lCustomerPhoneNo=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerPhoneNo','')
			lreturn.put('Result',lResult)
			String lCustomerPhoneNoText=lCustomerPhoneNo
			lCustomerPhoneNo=''
			String lTagCustomerPhoneNoInput='callMeBack-input'
			String lLocatorCustomerPhoneNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPhoneNoInput)
			WebElement lElementCustomerPhoneNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPhoneNoInput)
			if(lElementCustomerPhoneNoInput){
				lCustomerPhoneNoText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCustomerPhoneNoInput,lCustomerPhoneNoText)
				String lTagCustomerPhoneNoNext='callMeBack-submit'
				String lLocatorCustomerPhoneNoNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPhoneNoNext)
				WebElement lElementCustomerPhoneNoNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPhoneNoNext)
				if(lElementCustomerPhoneNoNext){
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerPhoneNoNext)){
						lCustomerPhoneNo=lCustomerPhoneNoText
					}
				}
			}
			if(lCustomerPhoneNo.length()<=0){
				lCustomerPhoneNo='No Option'
				String lTagCustomerPhoneNoSkip='callMeBack-skip'
				String lLocatorCustomerPhoneNoSkip=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPhoneNoSkip)
				WebElement lElementCustomerPhoneNoSkip=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPhoneNoSkip)
				if(lElementCustomerPhoneNoSkip){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerPhoneNoSkip)
				}
			}
			lResult=lCustomerPhoneNo.length()>0
			if(lResult){
				lreturn.put('CustomerPhoneNo',lCustomerPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerPhoneNoB(String strCustomerPhoneNo){
		Map lreturn=[:]
		String lCustomerPhoneNo=strCustomerPhoneNo.trim()
		if(lCustomerPhoneNo.length()<=0){
			lCustomerPhoneNo=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerPhoneNo','')
			lreturn.put('Result',lResult)
			String lCustomerPhoneNoText=lCustomerPhoneNo
			lCustomerPhoneNo=''
			String lTagCustomerPhoneNoInput='callMeBack-input'
			String lLocatorCustomerPhoneNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPhoneNoInput)
			WebElement lElementCustomerPhoneNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPhoneNoInput)
			if(lElementCustomerPhoneNoInput){
				lCustomerPhoneNoText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCustomerPhoneNoInput,lCustomerPhoneNoText)
				String lTagCustomerPhoneNoNext='callMeBack-submit'
				String lLocatorCustomerPhoneNoNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPhoneNoNext)
				WebElement lElementCustomerPhoneNoNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPhoneNoNext)
				if(lElementCustomerPhoneNoNext){
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerPhoneNoNext)){
						lCustomerPhoneNo=lCustomerPhoneNoText
					}
				}
			}
			if(lCustomerPhoneNo.length()<=0){
				lCustomerPhoneNo='No Option'
				String lTagCustomerPhoneNoSkip='callMeBack-skip'
				String lLocatorCustomerPhoneNoSkip=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPhoneNoSkip)
				WebElement lElementCustomerPhoneNoSkip=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPhoneNoSkip)
				if(lElementCustomerPhoneNoSkip){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerPhoneNoSkip)
				}
			}
			lResult=lCustomerPhoneNo.length()>0
			if(lResult){
				lreturn.put('CustomerPhoneNo',lCustomerPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerMaritalStatusSex(String strCustomerMaritalStatusSex){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerMaritalStatusSex','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerMaritalStatusSexA(strCustomerMaritalStatusSex)
						break
					case 'B':
						lreturn=this.inputCustomerMaritalStatusSexB(strCustomerMaritalStatusSex)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerMaritalStatusSexA(strCustomerMaritalStatusSex)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerMaritalStatusSexA(String strCustomerMaritalStatusSex){
		Map lreturn=[:]
		String lCustomerMaritalStatusSex=strCustomerMaritalStatusSex.trim()
		Map lCustomerMaritalStatusSexList=['1':'MR|true','2':'MR|false','3':'MISS|true','4':'MISS|false']
		if(lCustomerMaritalStatusSex.length()<=0){
			lCustomerMaritalStatusSex=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_MARITAL_STATUS_SEX
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerMaritalStatusSex','')
			lreturn.put('Result',lResult)
			String lCustomerMaritalStatusSexItem=lCustomerMaritalStatusSexList.get(lCustomerMaritalStatusSex)
			if(!lCustomerMaritalStatusSexItem){
				lCustomerMaritalStatusSexItem=lCustomerMaritalStatusSexList.get(THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_MARITAL_STATUS_SEX)
			}
			lCustomerMaritalStatusSex=''
			String lTagButton='prefixAndIsSingle-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCustomerMaritalStatusSexItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCustomerMaritalStatusSexItem)
			if(!lElementButton){
				return lreturn
			}
			lCustomerMaritalStatusSex=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CustomerMaritalStatusSex',lCustomerMaritalStatusSex)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerMaritalStatusSexB(String strCustomerMaritalStatusSex){
		Map lreturn=[:]
		String lCustomerMaritalStatusSex=strCustomerMaritalStatusSex.trim()
		Map lCustomerMaritalStatusSexList=['1':'MR|true','2':'MR|false','3':'MISS|true','4':'MISS|false']
		if(lCustomerMaritalStatusSex.length()<=0){
			lCustomerMaritalStatusSex=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_MARITAL_STATUS_SEX
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerMaritalStatusSex','')
			lreturn.put('Result',lResult)
			String lCustomerMaritalStatusSexItem=lCustomerMaritalStatusSexList.get(lCustomerMaritalStatusSex)
			if(!lCustomerMaritalStatusSexItem){
				lCustomerMaritalStatusSexItem=lCustomerMaritalStatusSexList.get(THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_MARITAL_STATUS_SEX)
			}
			lCustomerMaritalStatusSex=''
			String lTagButton='prefixAndIsSingle-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCustomerMaritalStatusSexItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCustomerMaritalStatusSexItem)
			if(!lElementButton){
				return lreturn
			}
			lCustomerMaritalStatusSex=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CustomerMaritalStatusSex',lCustomerMaritalStatusSex)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobPositiveCase(String strCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDobPositiveCase=strCustomerDobPositiveCase.trim()
		if(lCustomerDobPositiveCase.length()<=0){
			lCustomerDobPositiveCase=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_DOB_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDobPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
			lCustomerDobPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerDobPositiveCase)
			lResult=lCustomerDobPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerDobPositiveCase',lCustomerDobPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDob(String strCustomerDob,Boolean isCustomerDobPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerDob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerDobA(strCustomerDob,isCustomerDobPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerDobB(strCustomerDob,isCustomerDobPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerDobA(strCustomerDob,isCustomerDobPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobA(String strCustomerDob,Boolean isCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDob=strCustomerDob.trim()
		if(lCustomerDob.length()<=0){
			lCustomerDob=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDob','')
			lreturn.put('Result',lResult)
			String lDobDay=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lCustomerDob)
			String lDobMonth=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lCustomerDob)
			String lDobYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lCustomerDob)
			lCustomerDob=''
			String lTagDobDayInput='dob-input-date'
			String lLocatorDobDayInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobDayInput)
			String lTagDobMonthInput='dob-input-month'
			String lLocatorDobMonthInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobMonthInput)
			String lTagDobYearInput='dob-input-year'
			String lLocatorDobYearInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobYearInput)
			lDobDay=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobDayInput,lDobDay)
			lDobMonth=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobMonthInput,lDobMonth)
			lDobYear=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobYearInput,lDobYear)
			String lTagDobNextButton='dob-next'
			String lLocatorDobNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDobNextButton)
			WebElement lElementDobNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDobNextButton)
			if(!lElementDobNextButton){
				return lreturn
			}
			Boolean lIsDobNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementDobNextButton)
			if(isCustomerDobPositiveCase){
				lResult=lIsDobNextClicked
			}else{
				lResult=!lIsDobNextClicked
			}
			if(lResult){
				lCustomerDob=lDobDay+'/'+lDobMonth+'/'+lDobYear
			}
			if(lResult){
				lreturn.put('CustomerDob',lCustomerDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobB(String strCustomerDob,Boolean isCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDob=strCustomerDob.trim()
		if(lCustomerDob.length()<=0){
			lCustomerDob=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDob','')
			lreturn.put('Result',lResult)
			String lDobDay=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lCustomerDob)
			String lDobMonth=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lCustomerDob)
			String lDobYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lCustomerDob)
			lCustomerDob=''
			String lTagDobDayInput='dob-input-date'
			String lLocatorDobDayInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobDayInput)
			String lTagDobMonthInput='dob-input-month'
			String lLocatorDobMonthInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobMonthInput)
			String lTagDobYearInput='dob-input-year'
			String lLocatorDobYearInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobYearInput)
			lDobDay=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobDayInput,lDobDay)
			lDobMonth=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobMonthInput,lDobMonth)
			lDobYear=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobYearInput,lDobYear)
			String lTagDobNextButton='dob-next'
			String lLocatorDobNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDobNextButton)
			WebElement lElementDobNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDobNextButton)
			if(!lElementDobNextButton){
				return lreturn
			}
			Boolean lIsDobNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementDobNextButton)
			if(isCustomerDobPositiveCase){
				lResult=lIsDobNextClicked
			}else{
				lResult=!lIsDobNextClicked
			}
			if(lResult){
				lCustomerDob=lDobDay+'/'+lDobMonth+'/'+lDobYear
			}
			if(lResult){
				lreturn.put('CustomerDob',lCustomerDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerYearOfDriving(String strCustomerYearOfDriving){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerYearOfDriving','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerYearOfDrivingA(strCustomerYearOfDriving)
						break
					case 'B':
						lreturn=this.inputCustomerYearOfDrivingB(strCustomerYearOfDriving)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerYearOfDrivingA(strCustomerYearOfDriving)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerYearOfDrivingA(String strCustomerYearOfDriving){
		Map lreturn=[:]
		String lCustomerYearOfDriving=strCustomerYearOfDriving.trim()
		Map lCustomerYearOfDrivingList=['1':'6','2':'5','3':'4','4':'3','5':'2','6':'1','7':'0']
		if(lCustomerYearOfDriving.length()<=0){
			lCustomerYearOfDriving=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_YEAR_OF_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerYearOfDriving','')
			lreturn.put('Result',lResult)
			String lCustomerYearOfDrivingItem=lCustomerYearOfDrivingList.get(lCustomerYearOfDriving)
			if(!lCustomerYearOfDrivingItem){
				lCustomerYearOfDrivingItem=lCustomerYearOfDrivingList.get(THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_YEAR_OF_DRIVING)
			}
			lCustomerYearOfDriving=''
			String lTagButton='yrOfDriving-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCustomerYearOfDrivingItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCustomerYearOfDrivingItem)
			if(!lElementButton){
				return lreturn
			}
			lCustomerYearOfDriving=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CustomerYearOfDriving',lCustomerYearOfDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerYearOfDrivingB(String strCustomerYearOfDriving){
		Map lreturn=[:]
		String lCustomerYearOfDriving=strCustomerYearOfDriving.trim()
		Map lCustomerYearOfDrivingList=['1':'6','2':'5','3':'4','4':'3','5':'2','6':'1','7':'0']
		if(lCustomerYearOfDriving.length()<=0){
			lCustomerYearOfDriving=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_YEAR_OF_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerYearOfDriving','')
			lreturn.put('Result',lResult)
			String lCustomerYearOfDrivingItem=lCustomerYearOfDrivingList.get(lCustomerYearOfDriving)
			if(!lCustomerYearOfDrivingItem){
				lCustomerYearOfDrivingItem=lCustomerYearOfDrivingList.get(THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_YEAR_OF_DRIVING)
			}
			lCustomerYearOfDriving=''
			String lTagButton='yrOfDriving-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCustomerYearOfDrivingItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCustomerYearOfDrivingItem)
			if(!lElementButton){
				return lreturn
			}
			lCustomerYearOfDriving=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CustomerYearOfDriving',lCustomerYearOfDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerNumberOfClaim(String strCustomerNumberOfClaim){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerNumberOfClaim','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerNumberOfClaimA(strCustomerNumberOfClaim)
						break
					case 'B':
						lreturn=this.inputCustomerNumberOfClaimB(strCustomerNumberOfClaim)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerNumberOfClaimA(strCustomerNumberOfClaim)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerNumberOfClaimA(String strCustomerNumberOfClaim){
		Map lreturn=[:]
		String lCustomerNumberOfClaim=strCustomerNumberOfClaim.trim()
		Map lCustomerNumberOfClaimList=['1':'0','2':'1','3':'2','4':'3']
		if(lCustomerNumberOfClaim.length()<=0){
			lCustomerNumberOfClaim=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_NUMBER_OF_CLAIM
		}
		Integer lCustomerNumberOfClaimDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CustomerNumberOfClaim','')
			lreturn.put('Result',lResult)
			String lCustomerNumberOfClaimItem=lCustomerNumberOfClaimList.get(lCustomerNumberOfClaim)
			if(!lCustomerNumberOfClaimItem){
				lCustomerNumberOfClaimItem=lCustomerNumberOfClaimList.get(THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_NUMBER_OF_CLAIM)
			}
			Integer lCustomerNumberOfClaimNum=IGNUemaHelper.convertStringToInteger(lCustomerNumberOfClaimItem,lCustomerNumberOfClaimDefault)
			lCustomerNumberOfClaim=''
			String lTagButton='noOfClaim-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCustomerNumberOfClaimItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCustomerNumberOfClaimItem)
			if(!lElementButton){
				return lreturn
			}
			lCustomerNumberOfClaim=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CustomerNumberOfClaim',lCustomerNumberOfClaim)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerNumberOfClaimB(String strCustomerNumberOfClaim){
		Map lreturn=[:]
		String lCustomerNumberOfClaim=strCustomerNumberOfClaim.trim()
		Map lCustomerNumberOfClaimList=['1':'0','2':'1','3':'2','4':'3']
		if(lCustomerNumberOfClaim.length()<=0){
			lCustomerNumberOfClaim=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_NUMBER_OF_CLAIM
		}
		Integer lCustomerNumberOfClaimDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CustomerNumberOfClaim','')
			lreturn.put('Result',lResult)
			String lCustomerNumberOfClaimItem=lCustomerNumberOfClaimList.get(lCustomerNumberOfClaim)
			if(!lCustomerNumberOfClaimItem){
				lCustomerNumberOfClaimItem=lCustomerNumberOfClaimList.get(THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_NUMBER_OF_CLAIM)
			}
			Integer lCustomerNumberOfClaimNum=IGNUemaHelper.convertStringToInteger(lCustomerNumberOfClaimItem,lCustomerNumberOfClaimDefault)
			lCustomerNumberOfClaim=''
			String lTagButton='noOfClaim-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCustomerNumberOfClaimItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCustomerNumberOfClaimItem)
			if(!lElementButton){
				return lreturn
			}
			lCustomerNumberOfClaim=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CustomerNumberOfClaim',lCustomerNumberOfClaim)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerPostalCodePositiveCase(String strCustomerPostalCodePositiveCase){
		Map lreturn=[:]
		String lCustomerPostalCodePositiveCase=strCustomerPostalCodePositiveCase.trim()
		if(lCustomerPostalCodePositiveCase.length()<=0){
			lCustomerPostalCodePositiveCase=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_POSTAL_CODE_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerPostalCodePositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerPostalCodePositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerPostalCodePositiveCase)
			lCustomerPostalCodePositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerPostalCodePositiveCase)
			lResult=lCustomerPostalCodePositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerPostalCodePositiveCase',lCustomerPostalCodePositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerPostalCode(String strCustomerPostalCode,Boolean isCustomerPostalCodePositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerPostalCode','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerPostalCodeA(strCustomerPostalCode,isCustomerPostalCodePositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerPostalCodeB(strCustomerPostalCode,isCustomerPostalCodePositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerPostalCodeA(strCustomerPostalCode,isCustomerPostalCodePositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerPostalCodeA(String strCustomerPostalCode,Boolean isCustomerPostalCodePositiveCase){
		Map lreturn=[:]
		String lCustomerPostalCode=strCustomerPostalCode.trim()
		if(lCustomerPostalCode.length()<=0){
			lCustomerPostalCode=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerPostalCode','')
			lreturn.put('Result',lResult)
			String lTagInputText='postalCode-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerPostalCode=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCustomerPostalCode)
			String lTagCustomerPostalCodeNextButton='postalCode-next'
			String lLocatorCustomerPostalCodeNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPostalCodeNextButton)
			WebElement lElementCustomerPostalCodeNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPostalCodeNextButton)
			if(!lElementCustomerPostalCodeNextButton){
				return lreturn
			}
			Boolean lIsCustomerPostalCodeNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerPostalCodeNextButton)
			if(isCustomerPostalCodePositiveCase){
				lResult=lIsCustomerPostalCodeNextClicked
			}else{
				lResult=!lIsCustomerPostalCodeNextClicked
			}
			if(lResult){
				lreturn.put('CustomerPostalCode',lCustomerPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerPostalCodeB(String strCustomerPostalCode,Boolean isCustomerPostalCodePositiveCase){
		Map lreturn=[:]
		String lCustomerPostalCode=strCustomerPostalCode.trim()
		if(lCustomerPostalCode.length()<=0){
			lCustomerPostalCode=THAKumkaInsureCarInputType.DEFAULT_CUSTOMER_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerPostalCode','')
			lreturn.put('Result',lResult)
			String lTagInputText='postalCode-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerPostalCode=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCustomerPostalCode)
			String lTagCustomerPostalCodeNextButton='postalCode-next'
			String lLocatorCustomerPostalCodeNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerPostalCodeNextButton)
			WebElement lElementCustomerPostalCodeNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerPostalCodeNextButton)
			if(!lElementCustomerPostalCodeNextButton){
				return lreturn
			}
			Boolean lIsCustomerPostalCodeNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerPostalCodeNextButton)
			if(isCustomerPostalCodePositiveCase){
				lResult=lIsCustomerPostalCodeNextClicked
			}else{
				lResult=!lIsCustomerPostalCodeNextClicked
			}
			if(lResult){
				lreturn.put('CustomerPostalCode',lCustomerPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOdometer(String strCarOdometer){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarOdometer','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarOdometerA(strCarOdometer)
						break
					case 'B':
						lreturn=this.inputCarOdometerB(strCarOdometer)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarOdometerA(strCarOdometer)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOdometerA(String strCarOdometer){
		Map lreturn=[:]
		String lCarOdometer=strCarOdometer.trim()
		Map lCarOdometerList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5','7':'6','8':'7','9':'8','10':'9']
		if(lCarOdometer.length()<=0){
			lCarOdometer=THAKumkaInsureCarInputType.DEFAULT_CAR_ODOMETER
		}
		Integer lCarOdometerDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarOdometer','')
			lreturn.put('Result',lResult)
			String lCarOdometerItem=lCarOdometerList.get(lCarOdometer)
			if(!lCarOdometerItem){
				lCarOdometerItem=lCarOdometerList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_ODOMETER)
			}
			Integer lCarOdometerNum=IGNUemaHelper.convertStringToInteger(lCarOdometerItem,lCarOdometerDefault)
			lCarOdometer=''
			Boolean lIsFoundCarOdometer=false
			String lTagCarOdometerDropdownButton='odoMeter-selected'
			String lTagCarOdometerDropdownItemList='odoMeter-item'
			String lCarOdometerItemSelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV4(this.driver,lTagCarOdometerDropdownButton,lTagCarOdometerDropdownItemList,lCarOdometerNum,false)
			lIsFoundCarOdometer=lCarOdometerItemSelected.length()>0
			lCarOdometer=lCarOdometerItemSelected
			lResult=lIsFoundCarOdometer
			if(lResult){
				lreturn.put('CarOdometer',lCarOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOdometerB(String strCarOdometer){
		Map lreturn=[:]
		String lCarOdometer=strCarOdometer.trim()
		Map lCarOdometerList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5','7':'6','8':'7','9':'8','10':'9']
		if(lCarOdometer.length()<=0){
			lCarOdometer=THAKumkaInsureCarInputType.DEFAULT_CAR_ODOMETER
		}
		Integer lCarOdometerDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarOdometer','')
			lreturn.put('Result',lResult)
			String lCarOdometerItem=lCarOdometerList.get(lCarOdometer)
			if(!lCarOdometerItem){
				lCarOdometerItem=lCarOdometerList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_ODOMETER)
			}
			Integer lCarOdometerNum=IGNUemaHelper.convertStringToInteger(lCarOdometerItem,lCarOdometerDefault)
			lCarOdometer=''
			Boolean lIsFoundCarOdometer=false
			String lTagCarOdometerDropdownButton='odoMeter-selected'
			String lTagCarOdometerDropdownItemList='odoMeter-item'
			String lCarOdometerItemSelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV4(this.driver,lTagCarOdometerDropdownButton,lTagCarOdometerDropdownItemList,lCarOdometerNum,false)
			lIsFoundCarOdometer=lCarOdometerItemSelected.length()>0
			lCarOdometer=lCarOdometerItemSelected
			lResult=lIsFoundCarOdometer
			if(lResult){
				lreturn.put('CarOdometer',lCarOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarUsage(String strCarUsage){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarUsage','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarUsageA(strCarUsage)
						break
					case 'B':
						lreturn=this.inputCarUsageB(strCarUsage)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarUsageA(strCarUsage)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarUsageA(String strCarUsage){
		Map lreturn=[:]
		String lCarUsage=strCarUsage.trim()
		Map lCarUsageList=['1':'0','2':'1','3':'2']
		if(lCarUsage.length()<=0){
			lCarUsage=THAKumkaInsureCarInputType.DEFAULT_CAR_USAGE
		}
		Integer lCarUsageDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarUsage','')
			lreturn.put('Result',lResult)
			String lCarUsageItem=lCarUsageList.get(lCarUsage)
			if(!lCarUsageItem){
				lCarUsageItem=lCarUsageList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_USAGE)
			}
			Integer lCarUsageNum=IGNUemaHelper.convertStringToInteger(lCarUsageItem,lCarUsageDefault)
			lCarUsage=''
			String lTagButtonList='carUsage-radio'
			String lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonList)
			WebElement lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarUsageNum,lTagButtonList)
			if(!lElementButton){
				lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,0,lTagButtonList)
			}
			if(!lElementButton){
				lTagButtonList='isGoToWorkOnly-radio'
				lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonList)
				lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarUsageNum,lTagButtonList)
				if(!lElementButton){
					lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,0,lTagButtonList)
				}
			}
			if(!lElementButton){
				return lreturn
			}
			lCarUsage=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CarUsage',lCarUsage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarUsageB(String strCarUsage){
		Map lreturn=[:]
		String lCarUsage=strCarUsage.trim()
		Map lCarUsageList=['1':'0','2':'1','3':'2']
		if(lCarUsage.length()<=0){
			lCarUsage=THAKumkaInsureCarInputType.DEFAULT_CAR_USAGE
		}
		Integer lCarUsageDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarUsage','')
			lreturn.put('Result',lResult)
			String lCarUsageItem=lCarUsageList.get(lCarUsage)
			if(!lCarUsageItem){
				lCarUsageItem=lCarUsageList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_USAGE)
			}
			Integer lCarUsageNum=IGNUemaHelper.convertStringToInteger(lCarUsageItem,lCarUsageDefault)
			lCarUsage=''
			String lTagButtonList='carUsage-radio'
			String lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonList)
			WebElement lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarUsageNum,lTagButtonList)
			if(!lElementButton){
				lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,0,lTagButtonList)
			}
			if(!lElementButton){
				lTagButtonList='isGoToWorkOnly-radio'
				lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonList)
				lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarUsageNum,lTagButtonList)
				if(!lElementButton){
					lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,0,lTagButtonList)
				}
			}
			if(!lElementButton){
				return lreturn
			}
			lCarUsage=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CarUsage',lCarUsage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarDashCamera(String strCarDashCamera){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarDashCamera','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarDashCameraA(strCarDashCamera)
						break
					case 'B':
						lreturn=this.inputCarDashCameraB(strCarDashCamera)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarDashCameraA(strCarDashCamera)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarDashCameraA(String strCarDashCamera){
		Map lreturn=[:]
		String lCarDashCamera=strCarDashCamera.trim()
		Map lCarDashCameraList=['YES':'0','NO':'1']
		if(lCarDashCamera.length()<=0){
			lCarDashCamera=THAKumkaInsureCarInputType.DEFAULT_CAR_DASH_CAMERA.toUpperCase()
		}
		Integer lCarDashCameraDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarDashCamera','')
			lreturn.put('Result',lResult)
			String lCarDashCameraItem=lCarDashCameraList.get(lCarDashCamera)
			if(!lCarDashCameraItem){
				lCarDashCameraItem=lCarDashCameraList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_DASH_CAMERA.toUpperCase())
			}
			Integer lCarDashCameraNum=IGNUemaHelper.convertStringToInteger(lCarDashCameraItem,lCarDashCameraDefault)
			lCarDashCamera=''
			String lTagButtonList='isDashcam-radio'
			String lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonList,lCarDashCameraItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarDashCameraNum,lTagButtonList)
			if(!lElementButton){
				return lreturn
			}
			lCarDashCamera=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CarDashCamera',lCarDashCamera)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarDashCameraB(String strCarDashCamera){
		Map lreturn=[:]
		String lCarDashCamera=strCarDashCamera.trim()
		Map lCarDashCameraList=['YES':'0','NO':'1']
		if(lCarDashCamera.length()<=0){
			lCarDashCamera=THAKumkaInsureCarInputType.DEFAULT_CAR_DASH_CAMERA.toUpperCase()
		}
		Integer lCarDashCameraDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarDashCamera','')
			lreturn.put('Result',lResult)
			String lCarDashCameraItem=lCarDashCameraList.get(lCarDashCamera)
			if(!lCarDashCameraItem){
				lCarDashCameraItem=lCarDashCameraList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_DASH_CAMERA.toUpperCase())
			}
			Integer lCarDashCameraNum=IGNUemaHelper.convertStringToInteger(lCarDashCameraItem,lCarDashCameraDefault)
			lCarDashCamera=''
			String lTagButtonList='isDashcam-radio'
			String lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonList,lCarDashCameraItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarDashCameraNum,lTagButtonList)
			if(!lElementButton){
				return lreturn
			}
			lCarDashCamera=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CarDashCamera',lCarDashCamera)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceDue(String strCarInsuranceDue){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceDue','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInsuranceDueA(strCarInsuranceDue)
						break
					case 'B':
						lreturn=this.inputCarInsuranceDueB(strCarInsuranceDue)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInsuranceDueA(strCarInsuranceDue)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceDueA(String strCarInsuranceDue){
		Map lreturn=[:]
		String lCarInsuranceDue=strCarInsuranceDue.trim()
		Map lCarInsuranceDueList=['1':'0','2':'1']
		if(lCarInsuranceDue.length()<=0){
			lCarInsuranceDue=THAKumkaInsureCarInputType.DEFAULT_CAR_INSURANCE_DUE
		}
		Integer lCarInsuranceDueDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceDue','')
			lreturn.put('Result',lResult)
			String lCarInsuranceDueItem=lCarInsuranceDueList.get(lCarInsuranceDue)
			if(!lCarInsuranceDueItem){
				lCarInsuranceDueItem=lCarInsuranceDueList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_INSURANCE_DUE)
			}
			Integer lCarInsuranceDueNum=IGNUemaHelper.convertStringToInteger(lCarInsuranceDueItem,lCarInsuranceDueDefault)
			lCarInsuranceDue=''
			lResult=lCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('CarInsuranceDue',lCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceDueB(String strCarInsuranceDue){
		Map lreturn=[:]
		String lCarInsuranceDue=strCarInsuranceDue.trim()
		Map lCarInsuranceDueList=['1':'0','2':'1']
		if(lCarInsuranceDue.length()<=0){
			lCarInsuranceDue=THAKumkaInsureCarInputType.DEFAULT_CAR_INSURANCE_DUE
		}
		Integer lCarInsuranceDueDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceDue','')
			lreturn.put('Result',lResult)
			String lCarInsuranceDueItem=lCarInsuranceDueList.get(lCarInsuranceDue)
			if(!lCarInsuranceDueItem){
				lCarInsuranceDueItem=lCarInsuranceDueList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_INSURANCE_DUE)
			}
			Integer lCarInsuranceDueNum=IGNUemaHelper.convertStringToInteger(lCarInsuranceDueItem,lCarInsuranceDueDefault)
			lCarInsuranceDue=''
			lResult=lCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('CarInsuranceDue',lCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarNcbRate(String strCarNcbRate){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarNcbRate','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarNcbRateA(strCarNcbRate)
						break
					case 'B':
						lreturn=this.inputCarNcbRateB(strCarNcbRate)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarNcbRateA(strCarNcbRate)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarNcbRateA(String strCarNcbRate){
		Map lreturn=[:]
		String lCarNcbRate=strCarNcbRate.trim()
		Map lCarNcbRateList=['1':'N','2':'0','3':'20','4':'30','5':'40','6':'50']
		if(lCarNcbRate.length()<=0){
			lCarNcbRate=THAKumkaInsureCarInputType.DEFAULT_CAR_NCB_RATE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarNcbRate','')
			lreturn.put('Result',lResult)
			String lCarNcbRateItem=lCarNcbRateList.get(lCarNcbRate)
			if(!lCarNcbRateItem){
				lCarNcbRateItem=lCarNcbRateList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_NCB_RATE)
			}
			lCarNcbRate=''
			String lTagButton='NCBRate-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCarNcbRateItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCarNcbRateItem)
			if(!lElementButton){
				return lreturn
			}
			lCarNcbRate=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CarNcbRate',lCarNcbRate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarNcbRateB(String strCarNcbRate){
		Map lreturn=[:]
		String lCarNcbRate=strCarNcbRate.trim()
		Map lCarNcbRateList=['1':'N','2':'0','3':'20','4':'30','5':'40','6':'50']
		if(lCarNcbRate.length()<=0){
			lCarNcbRate=THAKumkaInsureCarInputType.DEFAULT_CAR_NCB_RATE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarNcbRate','')
			lreturn.put('Result',lResult)
			String lCarNcbRateItem=lCarNcbRateList.get(lCarNcbRate)
			if(!lCarNcbRateItem){
				lCarNcbRateItem=lCarNcbRateList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_NCB_RATE)
			}
			lCarNcbRate=''
			String lTagButton='NCBRate-item'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCarNcbRateItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCarNcbRateItem)
			if(!lElementButton){
				return lreturn
			}
			lCarNcbRate=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(lResult){
				lreturn.put('CarNcbRate',lCarNcbRate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarCurrentInsurer(String strCarCurrentInsurer){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarCurrentInsurer','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarCurrentInsurerA(strCarCurrentInsurer)
						break
					case 'B':
						lreturn=this.inputCarCurrentInsurerB(strCarCurrentInsurer)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarCurrentInsurerA(strCarCurrentInsurer)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarCurrentInsurerA(String strCarCurrentInsurer){
		Map lreturn=[:]
		String lCarCurrentInsurer=strCarCurrentInsurer.trim()
		if(lCarCurrentInsurer.length()<=0){
			lCarCurrentInsurer=THAKumkaInsureCarInputType.DEFAULT_CAR_CURRENT_INSURER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarCurrentInsurer','')
			lreturn.put('Result',lResult)
			String lTagCarCurrentInsurerModalFormDisplayed=''
			String lLocatorCarCurrentInsurerModalFormDisplayed='#section-previousInsurer'
			Boolean lIsCarCurrentInsurerModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCarCurrentInsurerModalFormDisplayed)
			if(!lIsCarCurrentInsurerModalFormDisplayed){
				lCarCurrentInsurer='No Option'
			}else{
				Boolean lIsFoundCarCurrentInsurer=false
				String lTagCarCurrentInsurerPopularImageButtonList='previousInsurer-logo'
				String lTagCarCurrentInsurerDropdownButton='previousInsurer-selected'
				String lTagCarCurrentInsurerDropdownItemList='previousInsurer-item'
				String lCarCurrentInsurerItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarCurrentInsurerPopularImageButtonList,lCarCurrentInsurer,false)
				lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				if(!lIsFoundCarCurrentInsurer){
					lCarCurrentInsurerItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarCurrentInsurerDropdownButton,lTagCarCurrentInsurerDropdownItemList,lCarCurrentInsurer,false)
					lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				}
				if(!lIsFoundCarCurrentInsurer){
					lCarCurrentInsurerItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarCurrentInsurerPopularImageButtonList,lCarCurrentInsurer,true)
					lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				}
				if(!lIsFoundCarCurrentInsurer){
					lCarCurrentInsurerItem='No Option'
					lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				}
				lCarCurrentInsurer=lCarCurrentInsurerItem
			}
			lResult=lCarCurrentInsurer.length()>0
			if(lResult){
				lreturn.put('CarCurrentInsurer',lCarCurrentInsurer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarCurrentInsurerB(String strCarCurrentInsurer){
		Map lreturn=[:]
		String lCarCurrentInsurer=strCarCurrentInsurer.trim()
		if(lCarCurrentInsurer.length()<=0){
			lCarCurrentInsurer=THAKumkaInsureCarInputType.DEFAULT_CAR_CURRENT_INSURER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarCurrentInsurer','')
			lreturn.put('Result',lResult)
			String lTagCarCurrentInsurerModalFormDisplayed=''
			String lLocatorCarCurrentInsurerModalFormDisplayed='#section-previousInsurer'
			Boolean lIsCarCurrentInsurerModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCarCurrentInsurerModalFormDisplayed)
			if(!lIsCarCurrentInsurerModalFormDisplayed){
				lCarCurrentInsurer='No Option'
			}else{
				Boolean lIsFoundCarCurrentInsurer=false
				String lTagCarCurrentInsurerPopularImageButtonList='previousInsurer-logo'
				String lTagCarCurrentInsurerDropdownButton='previousInsurer-selected'
				String lTagCarCurrentInsurerDropdownItemList='previousInsurer-item'
				String lCarCurrentInsurerItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarCurrentInsurerPopularImageButtonList,lCarCurrentInsurer,false)
				lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				if(!lIsFoundCarCurrentInsurer){
					lCarCurrentInsurerItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarCurrentInsurerDropdownButton,lTagCarCurrentInsurerDropdownItemList,lCarCurrentInsurer,false)
					lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				}
				if(!lIsFoundCarCurrentInsurer){
					lCarCurrentInsurerItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarCurrentInsurerPopularImageButtonList,lCarCurrentInsurer,true)
					lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				}
				if(!lIsFoundCarCurrentInsurer){
					lCarCurrentInsurerItem='No Option'
					lIsFoundCarCurrentInsurer=lCarCurrentInsurerItem.length()>0
				}
				lCarCurrentInsurer=lCarCurrentInsurerItem
			}
			lResult=lCarCurrentInsurer.length()>0
			if(lResult){
				lreturn.put('CarCurrentInsurer',lCarCurrentInsurer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarFinancing(String strCarFinancing){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarFinancing','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarFinancingA(strCarFinancing)
						break
					case 'B':
						lreturn=this.inputCarFinancingB(strCarFinancing)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarFinancingA(strCarFinancing)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarFinancingA(String strCarFinancing){
		Map lreturn=[:]
		String lCarFinancing=strCarFinancing.trim()
		Map lCarFinancingList=['YES':'0','NO':'1']
		if(lCarFinancing.length()<=0){
			lCarFinancing=THAKumkaInsureCarInputType.DEFAULT_CAR_FINANCING.toUpperCase()
		}
		Integer lCarFinancingDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarFinancing','')
			lreturn.put('Result',lResult)
			String lTagCarFinancingModalForm='carFinancing-selected'
			String lLocatorCarFinancingModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagCarFinancingModalForm)
			Boolean lIsCarFinancingModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCarFinancingModalForm)
			if(!lIsCarFinancingModalFormDisplayed){
				lCarFinancing='No Option'
			}else{
				String lCarFinancingItem=lCarFinancingList.get(lCarFinancing)
				if(!lCarFinancingItem){
					lCarFinancingItem=lCarFinancingList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_DASH_CAMERA.toUpperCase())
				}
				Integer lCarFinancingNum=IGNUemaHelper.convertStringToInteger(lCarFinancingItem,lCarFinancingDefault)
				lCarFinancing=''
				String lTagButtonList='carFinancing'
				String lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonList,lCarFinancingItem)
				WebElement lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarFinancingNum,lTagButtonList)
				if(!lElementButton){
					return lreturn
				}
				lCarFinancing=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementButton)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lResult=lCarFinancing.length()>0
			if(lResult){
				lreturn.put('CarFinancing',lCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarFinancingB(String strCarFinancing){
		Map lreturn=[:]
		String lCarFinancing=strCarFinancing.trim()
		Map lCarFinancingList=['YES':'0','NO':'1']
		if(lCarFinancing.length()<=0){
			lCarFinancing=THAKumkaInsureCarInputType.DEFAULT_CAR_FINANCING.toUpperCase()
		}
		Integer lCarFinancingDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarFinancing','')
			lreturn.put('Result',lResult)
			String lTagCarFinancingModalForm='carFinancing-selected'
			String lLocatorCarFinancingModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagCarFinancingModalForm)
			Boolean lIsCarFinancingModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCarFinancingModalForm)
			if(!lIsCarFinancingModalFormDisplayed){
				lCarFinancing='No Option'
			}else{
				String lCarFinancingItem=lCarFinancingList.get(lCarFinancing)
				if(!lCarFinancingItem){
					lCarFinancingItem=lCarFinancingList.get(THAKumkaInsureCarInputType.DEFAULT_CAR_DASH_CAMERA.toUpperCase())
				}
				Integer lCarFinancingNum=IGNUemaHelper.convertStringToInteger(lCarFinancingItem,lCarFinancingDefault)
				lCarFinancing=''
				String lTagButtonList='carFinancing'
				String lLocatorButtonList=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonList,lCarFinancingItem)
				WebElement lElementButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementListDataSeleniumKey(this.driver,lCarFinancingNum,lTagButtonList)
				if(!lElementButton){
					return lreturn
				}
				lCarFinancing=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton)
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementButton)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lResult=lCarFinancing.length()>0
			if(lResult){
				lreturn.put('CarFinancing',lCarFinancing)
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
			String lTagButtonNext='goToCard'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			if(!lElementButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			Boolean lRedirected=false
			Boolean lIsDone=false
			lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app #resultsPage',30)
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
			String lTagButtonNext='goToCard'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			if(!lElementButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			Boolean lRedirected=false
			Boolean lIsDone=false
			lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app #resultsPage',30)
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
}