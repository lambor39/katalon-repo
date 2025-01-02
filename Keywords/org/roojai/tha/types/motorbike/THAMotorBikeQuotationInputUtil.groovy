package org.roojai.tha.types.motorbike
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAMotorBikeQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAMotorBikeQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Map inputVersionReferrer(String strBaseUrl,String strVersion,String strReferrer){
		Map lreturn=[:]
		String lBaseUrl=strBaseUrl.trim()
		if(lBaseUrl.length()<=0){
			lBaseUrl=THAMotorBikeQuotationInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAMotorBikeQuotationInputType.DEFAULT_VERSION
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
			this.driver.get(lBaseUrl+'&abtesting='+lVersion+'&referrer='+lReferrer)
			IGNUemaHelper.delayThreadSecond(3)
			this.driver.get(lBaseUrl+'&abtesting='+lVersion+'&referrer='+lReferrer)
			IGNUemaHelper.delayThreadSecond(5)
			lVersionOutput=lVersion.toUpperCase()
			lVersionOutput=IGNUemaHelper.concatMessageLeftRightByPipe(lVersionOutput,lBrowserInfo)
			lVersionOutput=IGNUemaHelper.concatMessageLeftRightByPipe(lVersionOutput,lBuildVersion)
			lResult=lVersionOutput.length()>0
			lreturn.put('Version',lVersionOutput)
			lreturn.put('Referrer',lReferrer)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInputFromCmsRoojai(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lStartFromCmsFormMini=caseOutput.StartFromCmsFormMini.toString().trim()
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
			Boolean lIsStartFromCmsFormMini=IGNUemaHelper.convertStringToBoolean(lStartFromCmsFormMini)
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
			Map lMapCmsCarMake=this.inputCmsCarMake(lCmsCarMake)
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
				lMapCmsCarMake=this.inputCmsCarMake(lCmsCarMake)
				if(!lMapCmsCarMake.Result){
					lCmsCarMake=''
				}else{
					lCmsCarMake=lMapCmsCarMake.CmsCarMake
				}
				caseOutput.CmsCarMake=lCmsCarMake
				if(lCmsCarMake.length()<=0){
					return lreturn
				}
				lMapCmsCarModel=this.inputCmsCarModel(lCmsCarModel)
			}
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
				lCmsPostCarMake=lMapCmsKeepDetail.CmsPostCarMake
				lCmsPostCarModel=lMapCmsKeepDetail.CmsPostCarModel
				lCmsPostCarYear=lMapCmsKeepDetail.CmsPostCarYear
				lCmsPostCarSubmodel=lMapCmsKeepDetail.CmsPostCarSubmodel
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
				lCarMake=lCmsPostCarMake
				lCarModel=lCmsPostCarModel
				lCarYear=lCmsPostCarYear
				lSubmodel=lCmsPostCarSubmodel
				caseOutput.Language=lLanguage
				caseOutput.CarMake=lCarMake
				caseOutput.CarModel=lCarModel
				caseOutput.CarYear=lCarYear
				caseOutput.Submodel=lSubmodel
			}else{
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
							this.checkHandShake()
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
							break
						case 'B':
							this.checkHandShake()
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
							break
						default:
							return lreturn
							break
					}
				}else{
					this.checkHandShake()
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
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						this.checkHandShake()
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
	public Boolean inputInputFromCmsAffiliate(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lStartFromCmsAffiliateMain=caseInput.StartFromCmsAffiliateMain.toString().trim()
		String lCmsAffiliateLanguage=caseInput.CmsAffiliateLanguage.toString().trim()
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
			Boolean lIsStartFromCmsAffiliateMain=IGNUemaHelper.convertStringToBoolean(lStartFromCmsAffiliateMain)
			Map lMapCmsAffiliateLanguage=this.inputCmsAffiliateLanguage(lCmsAffiliateLanguage)
			if(!lMapCmsAffiliateLanguage.Result){
				lCmsAffiliateLanguage=''
			}else{
				lCmsAffiliateLanguage=lMapCmsAffiliateLanguage.CmsAffiliateLanguage
			}
			caseOutput.CmsAffiliateLanguage=lCmsAffiliateLanguage
			if(lCmsAffiliateLanguage.length()<=0){
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
						this.checkHandShake()
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
	public Boolean inputInputFromProduct(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseOutput.BaseUrl.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lReferrer=caseInput.Referrer.toString().trim()
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
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
						this.checkHandShake()
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
			lPositiveCase=THAMotorBikeQuotationInputType.DEFAULT_POSITIVE_CASE
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
			String lLocatorResultPage='#result-package'
			if(lElementButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			}
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorResultPage,20)
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
			String lLocatorResultPage='#result-package'
			if(lElementButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			}
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorResultPage,20)
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
	public Map inputCmsLanguage(String strCmsLanguage){
		Map lreturn=[:]
		String lCmsLanguage=strCmsLanguage.trim()
		if(lCmsLanguage.length()<=0){
			lCmsLanguage=THAMotorBikeQuotationInputType.DEFAULT_CMS_LANGUAGE
		}
		Map lCmsLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('CmsLanguage','')
			lreturn.put('Result',lResult)
			String lCmsLanguageItem=lCmsLanguageList.get(lCmsLanguage)
			if(!lCmsLanguageItem){
				lCmsLanguageItem=lCmsLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_CMS_LANGUAGE)
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
				String lLocatorCMSLanguageChangeButton=''
				switch(lCmsLanguageItem){
					case 'en':
						lLocatorCMSLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/en.svg"]'
						break
					case 'zh':
						lLocatorCMSLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/cn.svg"]'
						break
					default:
						lLocatorCMSLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/th.svg"]'
						break
				}
				WebElement lElementCMSLanguageChangeButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCMSLanguageChangeButton)
				if(!lElementCMSLanguageChangeButton){
					lCmsLanguageItem=lCmsLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_CMS_LANGUAGE)
					lLocatorCMSLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/th.svg"]'
				}
				lElementCMSLanguageChangeButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCMSLanguageChangeButton)
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
			lCmsLanguage=lCmsLanguageItem.toUpperCase()
			lResult=lCmsLanguage.length()>0
			String lLocatorCmsCarMakeTitle='.step-title'
			WebElement lElementCmsCarMakeTitle=null
			String lCmsCarMakeTitleText=''
			Boolean lIsCmsCarMakeTitleLoaded=false
			Integer lIndexCmsCarMakeTitleLoaded=0
			for(lIndexCmsCarMakeTitleLoaded=0;lIndexCmsCarMakeTitleLoaded<=5;lIndexCmsCarMakeTitleLoaded++){
				lElementCmsCarMakeTitle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsCarMakeTitle)
				if(!lElementCmsCarMakeTitle){
					IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
					IGNUemaHelper.performClickLeftOnWebElementByCenter(this.driver,lElementCmsCarMakeTitle)
					lCmsCarMakeTitleText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsCarMakeTitle).trim()
					if(lCmsCarMakeTitleText.length()>0){
						if(IGNUemaHelper.checkStringContainString(lCmsCarMakeTitleText,'{')){
							IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
						}else{
							lIsCmsCarMakeTitleLoaded=true
							break
						}
					}else{
						lIsCmsCarMakeTitleLoaded=true
						break
					}
				}
			}
			if(!lIsCmsCarMakeTitleLoaded){
				WebUI.refresh()
				for(lIndexCmsCarMakeTitleLoaded=0;lIndexCmsCarMakeTitleLoaded<=5;lIndexCmsCarMakeTitleLoaded++){
					lElementCmsCarMakeTitle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsCarMakeTitle)
					if(!lElementCmsCarMakeTitle){
						IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
					}else{
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
						IGNUemaHelper.performClickLeftOnWebElementByCenter(this.driver,lElementCmsCarMakeTitle)
						lCmsCarMakeTitleText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsCarMakeTitle).trim()
						if(lCmsCarMakeTitleText.length()>0){
							if(IGNUemaHelper.checkStringContainString(lCmsCarMakeTitleText,'{')){
								IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
							}else{
								lIsCmsCarMakeTitleLoaded=true
								break
							}
						}else{
							lIsCmsCarMakeTitleLoaded=true
							break
						}
					}
				}
			}
			String lTagVoluntaryType2Button=''
			String lLocatorVoluntaryType2Button='.insurance-type>ul>li:nth-child(3)>a>div>div.card-body.p-0.p-md-4>p'
			WebElement lElementVoluntaryType2Button=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorVoluntaryType2Button)
			if(!lIsCmsCarMakeTitleLoaded){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
			}
			lElementVoluntaryType2Button=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorVoluntaryType2Button)
			if(lElementVoluntaryType2Button){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
				IGNUemaHelper.delayThreadSecond(1)
			}
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
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
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
			for(lIndexCmsCarMakeTitleLoaded=0;lIndexCmsCarMakeTitleLoaded<=5;lIndexCmsCarMakeTitleLoaded++){
				lElementCmsCarMakeTitle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsCarMakeTitle)
				if(!lElementCmsCarMakeTitle){
					IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
					IGNUemaHelper.performClickLeftOnWebElementByCenter(this.driver,lElementCmsCarMakeTitle)
					lCmsCarMakeTitleText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsCarMakeTitle).trim()
					if(lCmsCarMakeTitleText.length()>0){
						if(IGNUemaHelper.checkStringContainString(lCmsCarMakeTitleText,'{')){
							IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
						}else{
							lIsCmsCarMakeTitleLoaded=true
							break
						}
					}else{
						lIsCmsCarMakeTitleLoaded=true
						break
					}
				}
			}
			if(!lIsCmsCarMakeTitleLoaded){
				for(lIndexCmsCarMakeTitleLoaded=0;lIndexCmsCarMakeTitleLoaded<=5;lIndexCmsCarMakeTitleLoaded++){
					lElementCmsCarMakeTitle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsCarMakeTitle)
					if(!lElementCmsCarMakeTitle){
						IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
					}else{
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
						IGNUemaHelper.performClickLeftOnWebElementByCenter(this.driver,lElementCmsCarMakeTitle)
						lCmsCarMakeTitleText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsCarMakeTitle).trim()
						if(lCmsCarMakeTitleText.length()>0){
							if(IGNUemaHelper.checkStringContainString(lCmsCarMakeTitleText,'{')){
								IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
							}else{
								lIsCmsCarMakeTitleLoaded=true
								break
							}
						}else{
							lIsCmsCarMakeTitleLoaded=true
							break
						}
					}
				}
			}
			if(!lIsCmsCarMakeTitleLoaded){
				for(lIndexCmsCarMakeTitleLoaded=0;lIndexCmsCarMakeTitleLoaded<=5;lIndexCmsCarMakeTitleLoaded++){
					lElementCmsCarMakeTitle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsCarMakeTitle)
					if(!lElementCmsCarMakeTitle){
						IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
					}else{
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCmsCarMakeTitle)
						IGNUemaHelper.performClickLeftOnWebElementByCenter(this.driver,lElementCmsCarMakeTitle)
						lCmsCarMakeTitleText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsCarMakeTitle).trim()
						if(lCmsCarMakeTitleText.length()>0){
							if(IGNUemaHelper.checkStringContainString(lCmsCarMakeTitleText,'{')){
								IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
							}else{
								lIsCmsCarMakeTitleLoaded=true
								break
							}
						}else{
							lIsCmsCarMakeTitleLoaded=true
							break
						}
					}
				}
			}
			if(!lIsCmsCarMakeTitleLoaded){
				//return lreturn
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
	public Map inputCmsAffiliateLanguage(String strCmsAffiliateLanguage){
		Map lreturn=[:]
		String lCmsAffiliateLanguage=strCmsAffiliateLanguage.trim()
		if(lCmsAffiliateLanguage.length()<=0){
			lCmsAffiliateLanguage=THAMotorBikeQuotationInputType.DEFAULT_CMS_AFFILIATE_LANGUAGE
		}
		Map lCmsAffiliateLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			Boolean lIsDone=false
			Boolean lIsOK=false
			lreturn.put('CmsAffiliateLanguage','')
			lreturn.put('Result',lResult)
			String lCmsAffiliateLanguageItem=lCmsAffiliateLanguageList.get(lCmsAffiliateLanguage)
			if(!lCmsAffiliateLanguageItem){
				lCmsAffiliateLanguageItem=lCmsAffiliateLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_CMS_AFFILIATE_LANGUAGE)
			}
			lCmsAffiliateLanguage=''
			Boolean lIsCmsAffiliateLanguageTargetThai=lCmsAffiliateLanguageItem.equalsIgnoreCase('TH')
			String lLocatorCmsAffiliateLanguageSelectedImage='#navbar-action ul li a img'
			WebElement lElementCmsAffiliateLanguageSelectedImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsAffiliateLanguageSelectedImage)
			if(!lElementCmsAffiliateLanguageSelectedImage){
				lCmsAffiliateLanguage='No Option'
			}
			if(lElementCmsAffiliateLanguageSelectedImage){
				String lStrElementAttributeImageSource='src'
				String lCmsAffiliateLanguageSelectedImageSource=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsAffiliateLanguageSelectedImage,lStrElementAttributeImageSource)
				if(lCmsAffiliateLanguageSelectedImageSource.length()<=0){
					return lreturn
				}
				String lStrCmsAffiliateLanguageImageSourceThai='th.svg'
				Boolean lIsCmsAffiliateLanguageCurrentThai=lCmsAffiliateLanguageSelectedImageSource.toLowerCase().contains(lStrCmsAffiliateLanguageImageSourceThai)
				Boolean lToChangeCmsAffiliateLanguage=false
				if(lIsCmsAffiliateLanguageTargetThai){
					if(!lIsCmsAffiliateLanguageCurrentThai){
						lToChangeCmsAffiliateLanguage=true
					}
				}else{
					if(lIsCmsAffiliateLanguageCurrentThai){
						lToChangeCmsAffiliateLanguage=true
					}
				}
				if(lToChangeCmsAffiliateLanguage){
					String lLocatorCmsAffiliateLanguageChangeButton=''
					switch(lCmsAffiliateLanguageItem){
						case 'en':
							lLocatorCmsAffiliateLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/en.svg"]'
							break
						case 'zh':
							lLocatorCmsAffiliateLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/cn.svg"]'
							break
						default:
							lLocatorCmsAffiliateLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/th.svg"]'
							break
					}
					WebElement lElementCmsAffiliateLanguageChangeButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsAffiliateLanguageChangeButton)
					if(!lElementCmsAffiliateLanguageChangeButton){
						lCmsAffiliateLanguageItem=lCmsAffiliateLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_CMS_AFFILIATE_LANGUAGE)
						lLocatorCmsAffiliateLanguageChangeButton='#navbar-action ul li a img[src="/wp-content/uploads/flags/th.svg"]'
					}
					lElementCmsAffiliateLanguageChangeButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsAffiliateLanguageChangeButton)
					if(!lElementCmsAffiliateLanguageChangeButton){
						return lreturn
					}
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCmsAffiliateLanguageChangeButton)
					IGNUemaHelper.delayThreadSecond(3)
				}
				lElementCmsAffiliateLanguageSelectedImage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsAffiliateLanguageSelectedImage)
				if(!lElementCmsAffiliateLanguageSelectedImage){
					return lreturn
				}
				lCmsAffiliateLanguageSelectedImageSource=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsAffiliateLanguageSelectedImage,lStrElementAttributeImageSource)
				if(lCmsAffiliateLanguageSelectedImageSource.length()<=0){
					return lreturn
				}
				lCmsAffiliateLanguage=lCmsAffiliateLanguageItem
			}
			lIsOK=lCmsAffiliateLanguage.length()>0
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
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
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
			String lTagCmsAffiliateProductButton=''
			String lLocatorCmsAffiliateProductButton='.section .container .row a'
			List<WebElement> lElementCmsAffiliateProductButtontList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCmsAffiliateProductButton)
			if(!lElementCmsAffiliateProductButtontList){
				return lreturn
			}
			if(lElementCmsAffiliateProductButtontList){
				for(WebElement lElementCmsAffiliateProductButtontItem in lElementCmsAffiliateProductButtontList){
					String lCmsAffiliateProductButtontHrefText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsAffiliateProductButtontItem,'href')
					Boolean lIsCmsAffiliateProductMotorBike=false
					lIsCmsAffiliateProductMotorBike=IGNUemaHelper.checkStringContainString(lCmsAffiliateProductButtontHrefText,'productType=Motorbike')
					if(lIsCmsAffiliateProductMotorBike){
						lIsDone=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsAffiliateProductButtontItem)
						break
					}
				}
			}
			lResult=lIsDone&&lIsOK
			if(lResult){
				lreturn.put('CmsAffiliateLanguage',lCmsAffiliateLanguage)
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
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAMotorBikeQuotationInputType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguage.length()<=0){
					lLanguage='No Option'
				}
			}
			lResult=lLanguage.length()>0
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
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAMotorBikeQuotationInputType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THAMotorBikeQuotationInputType.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguageItem.length()<=0){
					lLanguage='No Option'
				}
			}
			lResult=lLanguage.length()>0
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
				lreturn.put('Language',lLanguage)
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
			lCmsCarMake=THAMotorBikeQuotationInputType.DEFAULT_CMS_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsCarMake','')
			lreturn.put('Result',lResult)
			String lCmsCarMakeTarget=lCmsCarMake.toLowerCase()
			Boolean lIsRandomFromTopList=lCmsCarMakeTarget.length()<=0
			lCmsCarMake=''
			String lLocatorCmsCarMakeTitle='.step-title'
			WebElement lElementCmsCarMakeTitle=null
			String lCmsCarMakeTitleText=''
			Boolean lIsCmsCarMakeTitleLoaded=false
			Integer lIndexCmsCarMakeTitleLoaded=0
			for(lIndexCmsCarMakeTitleLoaded=0;lIndexCmsCarMakeTitleLoaded<=10;lIndexCmsCarMakeTitleLoaded++){
				lElementCmsCarMakeTitle=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCmsCarMakeTitle)
				if(!lElementCmsCarMakeTitle){
					IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
				}else{
					lCmsCarMakeTitleText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsCarMakeTitle)
					if(lCmsCarMakeTitleText.length()>0){
						if(IGNUemaHelper.checkStringContainString(lCmsCarMakeTitleText,'{')){
							IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
						}else{
							lIsCmsCarMakeTitleLoaded=true
							break
						}
					}else{
						IGNUemaHelper.delayThreadSecond(lIndexCmsCarMakeTitleLoaded)
					}
				}
			}
			if(!lIsCmsCarMakeTitleLoaded){
				//return lreturn
			}
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
			Integer lIndexFirst=0
			for(lIndexFirst=0;lIndexFirst<=10;lIndexFirst++){
				lElementCarMakeHitButtonList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCarMakeHitButtonList)
				if(!lElementCarMakeHitButtonList){
					IGNUemaHelper.delayThreadSecond(lIndexFirst)
				}else{
					if(lElementCarMakeHitButtonList.size()>0){
						break
					}else{
						IGNUemaHelper.delayThreadSecond(lIndexFirst)
					}
				}
			}
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
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeHitButtonItem)
					IGNUemaHelper.delayThreadSecond(2)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeHitButtonItem)
					lCmsCarMake=lStrCarMakeHitButtonItem
				}else{
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeHitButtonItem)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeHitButtonItem)
					lCmsCarMake=lStrCarMakeHitButtonItem
				}
			}else{
				WebElement lElementCarMakeOtherButtonOpen=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarMakeOtherButtonOpen)
				if(!lElementCarMakeOtherButtonOpen){
					lLocatorCarMakeOtherButtonOpen='#mini-form .btn-other-brand'
					lElementCarMakeOtherButtonOpen=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCarMakeOtherButtonOpen)
					if(!lElementCarMakeOtherButtonOpen){
						return lreturn
					}else{
						lCmsCarMake='No Option'
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarMakeOtherButtonOpen)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeOtherButtonOpen)
						this.waitUntilLoaded()
					}
				}else{
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarMakeOtherButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeOtherButtonOpen)
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
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeOtherButtonItem)
							IGNUemaHelper.delayThreadSecond(2)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeOtherButtonItem)
							lCmsCarMake=lStrCarMakeOtherButtonItem
						}else{
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeOtherButtonItem)
							IGNUemaHelper.delayThreadSecond(1)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarMakeOtherButtonItem)
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
			lCarMake=THAMotorBikeQuotationInputType.DEFAULT_CAR_MAKE
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
			lCarMake=THAMotorBikeQuotationInputType.DEFAULT_CAR_MAKE
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
			lCmsCarModel=THAMotorBikeQuotationInputType.DEFAULT_CMS_CAR_MODEL
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
				lCmsCarModel='No Option'
			}
			if(lElementCarModelGroupListAll){
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
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarModelButtonItem)
						IGNUemaHelper.delayThreadSecond(2)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarModelButtonItem)
						lCmsCarModel=lStrCarModelButtonItem
					}else{
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarModelButtonItem)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarModelButtonItem)
						lCmsCarModel=lStrCarModelButtonItem
					}
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
			lCarModel=THAMotorBikeQuotationInputType.DEFAULT_CAR_MODEL
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
			lCarModel=THAMotorBikeQuotationInputType.DEFAULT_CAR_MODEL
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
			lCmsCarYear=THAMotorBikeQuotationInputType.DEFAULT_CMS_CAR_YEAR
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
				lCmsCarYear='No Option'
			}
			if(lElementCarYearGroupListAll){
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
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarYearButtonItem)
						IGNUemaHelper.delayThreadSecond(2)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarYearButtonItem)
						lCmsCarYear=lStrCarYearButtonItem
					}else{
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarYearButtonItem)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarYearButtonItem)
						lCmsCarYear=lStrCarYearButtonItem
					}
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
			lCarYear=THAMotorBikeQuotationInputType.DEFAULT_CAR_YEAR
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
			lCarYear=THAMotorBikeQuotationInputType.DEFAULT_CAR_YEAR
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
			lCmsCarSubmodel=THAMotorBikeQuotationInputType.DEFAULT_CMS_CAR_SUBMODEL
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
				lCmsCarSubmodel='No Option'
			}
			if(lElementCarSubmodelGroupListAll){
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
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarSubmodelButtonItem)
						IGNUemaHelper.delayThreadSecond(2)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarSubmodelButtonItem)
						lCmsCarSubmodel=lStrCarSubmodelButtonItem
					}else{
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarSubmodelButtonItem)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCarSubmodelButtonItem)
						lCmsCarSubmodel=lStrCarSubmodelButtonItem
					}
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
	public Map inputSubmodel(String strSubmodel){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Submodel','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputSubmodelA(strSubmodel)
						break
					case 'B':
						lreturn=this.inputSubmodelB(strSubmodel)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputSubmodelA(strSubmodel)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSubmodelA(String strSubmodel){
		Map lreturn=[:]
		String lSubmodel=strSubmodel.trim()
		if(lSubmodel.length()<=0){
			lSubmodel=THAMotorBikeQuotationInputType.DEFAULT_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('Submodel','')
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
			if(lSubmodel.length()<=0){
				if(lValid){
					lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lSubmodel,true)
				}
			}else{
				if(!lValid){
					lSubmodel=''
				}else{
					lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lSubmodel,false)
				}
			}
			if(lSubmodel.length()<=0){
				if(!lValid){
					lSubmodel='No Option'
				}else{
					lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lSubmodel,true)
					if(lSubmodel.length()<=0){
						lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lSubmodel,true)
					}
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
	public Map inputSubmodelB(String strSubmodel){
		Map lreturn=[:]
		String lSubmodel=strSubmodel.trim()
		if(lSubmodel.length()<=0){
			lSubmodel=THAMotorBikeQuotationInputType.DEFAULT_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('Submodel','')
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
			if(lSubmodel.length()<=0){
				if(lValid){
					lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lSubmodel,true)
				}
			}else{
				if(!lValid){
					lSubmodel=''
				}else{
					lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lSubmodel,false)
				}
			}
			if(lSubmodel.length()<=0){
				if(!lValid){
					lSubmodel='No Option'
				}else{
					lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListHit,lSubmodel,true)
					if(lSubmodel.length()<=0){
						lSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownListAll,lSubmodel,true)
					}
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
			lCmsKeepDetail=THAMotorBikeQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
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
			lCmsKeepDetail=IGNUemaHelper.convertBooleanToYesNoString(lIsCmsKeepDetail)
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			if(lCmsCarMake.length()<=0){
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
			}
			String lTagToCheckMainProductReady='carBrand'
			String lLocatorToCheckMainProductReady=IGNUemaHelper.getTagDataSeleniumKey(lTagToCheckMainProductReady)
			Boolean lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
			if(!lIsMainProductReady){
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
			}
			String lStrJavascript='VueApp.process();'
			if(!lIsMainProductReady){
				IGNUemaHelper.callJavascriptExecutor(this.driver,lStrJavascript,[])
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
				if(!lIsMainProductReady){
					lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
				}
			}
			if(!lIsMainProductReady){
				return lreturn
			}
			if(!lCmsLanguage.contains('No Option')){
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
			}else{
				lCmsPostLanguage=lCmsLanguage
			}
			if(!lCmsCarMake.contains('No Option')){
				String lTagCmsPostCarMakeButton='carBrand'
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
			}else{
				lIsCmsKeepDetail=false
				lCmsKeepDetail=IGNUemaHelper.convertBooleanToYesNoString(lIsCmsKeepDetail)
				lCmsPostCarMake=lCmsCarMake
			}
			if(!lCmsCarModel.contains('No Option')){
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
			}else{
				lCmsPostCarModel=lCmsCarModel
			}
			if(!lCmsCarYear.contains('No Option')){
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
			}else{
				lCmsPostCarYear=lCmsCarYear
			}
			if(!lCmsCarSubmodel.contains('No Option')){
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
				lCmsPostCarSubmodel=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarSubmodelButton).trim()
			}else{
				lCmsPostCarSubmodel=lCmsCarSubmodel
			}
			if(lCmsPostLanguage.length()<=0){
				return lreturn
			}
			if(lCmsPostCarMake.length()<=0){
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
			}
			Boolean lIsDone=false
			Boolean lIsOK=false
			lIsOK=lCmsKeepDetail.length()>0
			lIsDone=lIsOK
			lIsOK=(lCmsLanguage.equalsIgnoreCase(lCmsPostLanguage))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarMake.equalsIgnoreCase(lCmsPostCarMake))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarModel.equalsIgnoreCase(lCmsPostCarModel))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarYear.equalsIgnoreCase(lCmsPostCarYear))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarSubmodel.equalsIgnoreCase(lCmsPostCarSubmodel))
			lIsDone=lIsDone&&lIsOK
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
			lCmsKeepDetail=THAMotorBikeQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
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
			lCmsKeepDetail=IGNUemaHelper.convertBooleanToYesNoString(lIsCmsKeepDetail)
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			if(lCmsCarMake.length()<=0){
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
			}
			String lTagToCheckMainProductReady='carBrand'
			String lLocatorToCheckMainProductReady=IGNUemaHelper.getTagDataSeleniumKey(lTagToCheckMainProductReady)
			Boolean lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
			if(!lIsMainProductReady){
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
			}
			String lStrJavascript='VueApp.process();'
			if(!lIsMainProductReady){
				IGNUemaHelper.callJavascriptExecutor(this.driver,lStrJavascript,[])
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
				if(!lIsMainProductReady){
					lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,15)
				}
			}
			if(!lIsMainProductReady){
				return lreturn
			}
			if(!lCmsLanguage.contains('No Option')){
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
			}else{
				lCmsPostLanguage=lCmsLanguage
			}
			if(!lCmsCarMake.contains('No Option')){
				String lTagCmsPostCarMakeButton='carBrand'
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
			}else{
				lIsCmsKeepDetail=false
				lCmsKeepDetail=IGNUemaHelper.convertBooleanToYesNoString(lIsCmsKeepDetail)
				lCmsPostCarMake=lCmsCarMake
			}
			if(!lCmsCarModel.contains('No Option')){
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
			}else{
				lCmsPostCarModel=lCmsCarModel
			}
			if(!lCmsCarYear.contains('No Option')){
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
			}else{
				lCmsPostCarYear=lCmsCarYear
			}
			if(!lCmsCarSubmodel.contains('No Option')){
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
				lCmsPostCarSubmodel=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCmsPostCarSubmodelButton).trim()
			}else{
				lCmsPostCarSubmodel=lCmsCarSubmodel
			}
			if(lCmsPostLanguage.length()<=0){
				return lreturn
			}
			if(lCmsPostCarMake.length()<=0){
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
			}
			Boolean lIsDone=false
			Boolean lIsOK=false
			lIsOK=lCmsKeepDetail.length()>0
			lIsDone=lIsOK
			lIsOK=(lCmsLanguage.equalsIgnoreCase(lCmsPostLanguage))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarMake.equalsIgnoreCase(lCmsPostCarMake))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarModel.equalsIgnoreCase(lCmsPostCarModel))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarYear.equalsIgnoreCase(lCmsPostCarYear))
			lIsDone=lIsDone&&lIsOK
			lIsOK=(lCmsCarSubmodel.equalsIgnoreCase(lCmsPostCarSubmodel))
			lIsDone=lIsDone&&lIsOK
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
	public Map inputGenderMainMaritalStatus(String strGenderMain,String strMaritalStatus){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('GenderMain','')
			lreturn.put('MaritalStatus','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputGenderMainMaritalStatusA(strGenderMain,strMaritalStatus)
						break
					case 'B':
						lreturn=this.inputGenderMainMaritalStatusB(strGenderMain,strMaritalStatus)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputGenderMainMaritalStatusA(strGenderMain,strMaritalStatus)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGenderMainMaritalStatusA(String strGenderMain,String strMaritalStatus){
		Map lreturn=[:]
		String lGenderMain=strGenderMain.trim()
		if(lGenderMain.length()<=0){
			lGenderMain=THAMotorBikeQuotationInputType.DEFAULT_GENDER_MAIN
		}
		String lMaritalStatus=strMaritalStatus.trim()
		if(lMaritalStatus.length()<=0){
			lMaritalStatus=THAMotorBikeQuotationInputType.DEFAULT_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('GenderMain','')
			lreturn.put('MaritalStatus','')
			lreturn.put('Result',lResult)
			String lTagButtonKey='GenderMD'
			String lTagButtonValue=''
			String lLocatorButton=''
			WebElement lElementButton=null
			if(lGenderMain.equalsIgnoreCase('FEMALE')){
				lGenderMain='Female'
				if(lMaritalStatus.equalsIgnoreCase('MARRIED')){
					lMaritalStatus='Married'
					lTagButtonValue='Female-Married'
				}else{
					lMaritalStatus=THAMotorBikeQuotationInputType.DEFAULT_MARITAL_STATUS
					lTagButtonValue='Female-Single'
				}
			}else{
				lGenderMain=THAMotorBikeQuotationInputType.DEFAULT_GENDER_MAIN
				if(lMaritalStatus.equalsIgnoreCase('MARRIED')){
					lMaritalStatus='Married'
					lTagButtonValue='Male-Married'
				}else{
					lMaritalStatus=THAMotorBikeQuotationInputType.DEFAULT_MARITAL_STATUS
					lTagButtonValue='Male-Single'
				}
			}
			lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(3)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(lElementButton){
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(5)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(lElementButton){
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
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
	public Map inputGenderMainMaritalStatusB(String strGenderMain,String strMaritalStatus){
		Map lreturn=[:]
		String lGenderMain=strGenderMain.trim()
		if(lGenderMain.length()<=0){
			lGenderMain=THAMotorBikeQuotationInputType.DEFAULT_GENDER_MAIN
		}
		String lMaritalStatus=strMaritalStatus.trim()
		if(lMaritalStatus.length()<=0){
			lMaritalStatus=THAMotorBikeQuotationInputType.DEFAULT_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('GenderMain','')
			lreturn.put('MaritalStatus','')
			lreturn.put('Result',lResult)
			String lTagButtonKey='GenderMD'
			String lTagButtonValue=''
			String lLocatorButton=''
			WebElement lElementButton=null
			if(lGenderMain.equalsIgnoreCase('FEMALE')){
				lGenderMain='Female'
				if(lMaritalStatus.equalsIgnoreCase('MARRIED')){
					lMaritalStatus='Married'
					lTagButtonValue='Female-Married'
				}else{
					lMaritalStatus=THAMotorBikeQuotationInputType.DEFAULT_MARITAL_STATUS
					lTagButtonValue='Female-Single'
				}
			}else{
				lGenderMain=THAMotorBikeQuotationInputType.DEFAULT_GENDER_MAIN
				if(lMaritalStatus.equalsIgnoreCase('MARRIED')){
					lMaritalStatus='Married'
					lTagButtonValue='Male-Married'
				}else{
					lMaritalStatus=THAMotorBikeQuotationInputType.DEFAULT_MARITAL_STATUS
					lTagButtonValue='Male-Single'
				}
			}
			lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(3)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(lElementButton){
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(5)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(lElementButton){
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
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
		try{
			Boolean lResult=false
			lreturn.put('BirthDateMain','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputBirthDateMainA(strBirthDateMain)
						break
					case 'B':
						lreturn=this.inputBirthDateMainB(strBirthDateMain)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputBirthDateMainA(strBirthDateMain)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputBirthDateMainA(String strBirthDateMain){
		Map lreturn=[:]
		String lBirthDateMain=strBirthDateMain.trim()
		if(lBirthDateMain.length()<=0){
			lBirthDateMain=THAMotorBikeQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('BirthDateMain','')
			lreturn.put('Result',lResult)
			String lBirthDateMainDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lBirthDateMain)
			String lBirthDateMainMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lBirthDateMain)
			String lBirthDateMainYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lBirthDateMain)
			lBirthDateMain=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lBirthDateMainDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lBirthDateMainDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lBirthDateMainMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lBirthDateMainMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lBirthDateMainYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lBirthDateMainYYYY)
			lBirthDateMain=lBirthDateMainDD+'/'+lBirthDateMainMM+'/'+lBirthDateMainYYYY
			String lTagButtonNext='DOBMD-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputBirthDateMainB(String strBirthDateMain){
		Map lreturn=[:]
		String lBirthDateMain=strBirthDateMain.trim()
		if(lBirthDateMain.length()<=0){
			lBirthDateMain=THAMotorBikeQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('BirthDateMain','')
			lreturn.put('Result',lResult)
			String lBirthDateMainDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lBirthDateMain)
			String lBirthDateMainMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lBirthDateMain)
			String lBirthDateMainYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lBirthDateMain)
			lBirthDateMain=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lBirthDateMainDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lBirthDateMainDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lBirthDateMainMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lBirthDateMainMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lBirthDateMainYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lBirthDateMainYYYY)
			lBirthDateMain=lBirthDateMainDD+'/'+lBirthDateMainMM+'/'+lBirthDateMainYYYY
			String lTagButtonNext='DOBMD-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('YearDriving','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputYearDrivingA(strYearDriving)
						break
					case 'B':
						lreturn=this.inputYearDrivingB(strYearDriving)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputYearDrivingA(strYearDriving)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputYearDrivingA(String strYearDriving){
		Map lreturn=[:]
		String lYearDriving=strYearDriving.trim()
		if(lYearDriving.length()<=0){
			lYearDriving=THAMotorBikeQuotationInputType.DEFAULT_YEAR_DRIVING
		}
		Integer lYearDrivingMin=0
		Integer lYearDrivingMax=6
		Integer lYearDrivingDefault=6
		Integer lYearDrivingNum=IGNUemaHelper.convertStringToInteger(lYearDriving,lYearDrivingDefault)
		if((lYearDrivingNum<lYearDrivingMin)||(lYearDrivingNum>lYearDrivingMax)){
			lYearDrivingNum=lYearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('YearDriving','')
			lreturn.put('Result',lResult)
			lYearDriving=lYearDrivingNum.toString()
			String lTagButtonKey='drivingExperience'
			String lTagButtonValue=lYearDriving
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(lElementButton){
				String lYearDrivingText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton).trim()
				if(lYearDrivingText.length()>0){
					lYearDriving=lYearDriving+'|'+lYearDrivingText
				}
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
	public Map inputYearDrivingB(String strYearDriving){
		Map lreturn=[:]
		String lYearDriving=strYearDriving.trim()
		if(lYearDriving.length()<=0){
			lYearDriving=THAMotorBikeQuotationInputType.DEFAULT_YEAR_DRIVING
		}
		Integer lYearDrivingMin=0
		Integer lYearDrivingMax=6
		Integer lYearDrivingDefault=6
		Integer lYearDrivingNum=IGNUemaHelper.convertStringToInteger(lYearDriving,lYearDrivingDefault)
		if((lYearDrivingNum<lYearDrivingMin)||(lYearDrivingNum>lYearDrivingMax)){
			lYearDrivingNum=lYearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('YearDriving','')
			lreturn.put('Result',lResult)
			lYearDriving=lYearDrivingNum.toString()
			String lTagButtonKey='drivingExperience'
			String lTagButtonValue=lYearDriving
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(lElementButton){
				String lYearDrivingText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton).trim()
				if(lYearDrivingText.length()>0){
					lYearDriving=lYearDriving+'|'+lYearDrivingText
				}
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
		try{
			Boolean lResult=false
			lreturn.put('ClaimsNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputClaimsNoA(strClaimsNo)
						break
					case 'B':
						lreturn=this.inputClaimsNoB(strClaimsNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputClaimsNoA(strClaimsNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputClaimsNoA(String strClaimsNo){
		Map lreturn=[:]
		String lClaimsNo=strClaimsNo.trim()
		if(lClaimsNo.length()<=0){
			lClaimsNo=THAMotorBikeQuotationInputType.DEFAULT_CLAIMS_NO
		}
		Integer lClaimsNoMin=0
		Integer lClaimsNoMax=3
		Integer lClaimsNoDefault=0
		Integer lClaimsNoNum=IGNUemaHelper.convertStringToInteger(lClaimsNo,lClaimsNoDefault)
		if((lClaimsNoNum<lClaimsNoMin)||(lClaimsNoNum>lClaimsNoMax)){
			lClaimsNoNum=lClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('ClaimsNo','')
			lreturn.put('Result',lResult)
			lClaimsNo=lClaimsNoNum.toString()
			String lTagButtonKey='claim'
			String lTagButtonValue=lClaimsNo
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(lElementButton){
				String lClaimsNoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton).trim()
				if(lClaimsNoText.length()>0){
					lClaimsNo=lClaimsNo+'|'+lClaimsNoText
				}
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
	public Map inputClaimsNoB(String strClaimsNo){
		Map lreturn=[:]
		String lClaimsNo=strClaimsNo.trim()
		if(lClaimsNo.length()<=0){
			lClaimsNo=THAMotorBikeQuotationInputType.DEFAULT_CLAIMS_NO
		}
		Integer lClaimsNoMin=0
		Integer lClaimsNoMax=3
		Integer lClaimsNoDefault=0
		Integer lClaimsNoNum=IGNUemaHelper.convertStringToInteger(lClaimsNo,lClaimsNoDefault)
		if((lClaimsNoNum<lClaimsNoMin)||(lClaimsNoNum>lClaimsNoMax)){
			lClaimsNoNum=lClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('ClaimsNo','')
			lreturn.put('Result',lResult)
			lClaimsNo=lClaimsNoNum.toString()
			String lTagButtonKey='claim'
			String lTagButtonValue=lClaimsNo
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(lElementButton){
				String lClaimsNoText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton).trim()
				if(lClaimsNoText.length()>0){
					lClaimsNo=lClaimsNo+'|'+lClaimsNoText
				}
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsage','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputVehicleUsageA(strVehicleUsage)
						break
					case 'B':
						lreturn=this.inputVehicleUsageB(strVehicleUsage)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputVehicleUsageA(strVehicleUsage)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageA(String strVehicleUsage){
		Map lreturn=[:]
		String lVehicleUsage=strVehicleUsage.toUpperCase().trim()
		Map lVehicleUsageList=['SPT':'SPT','DTBW':'DTBW','COMMERCIAL':'Commercial']
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsage','')
			lreturn.put('Result',lResult)
			String lVehicleUsageItem=lVehicleUsageList.get(lVehicleUsage)
			if(!lVehicleUsageItem){
				lVehicleUsageItem=lVehicleUsageList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE.toUpperCase())
			}
			lVehicleUsage=lVehicleUsageItem
			String lTagButtonKey='carUsage'
			String lTagButtonValue=lVehicleUsage
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lVehicleUsage='No Option'
				lResult=lVehicleUsage.length()>0
			}else{
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
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
	public Map inputVehicleUsageB(String strVehicleUsage){
		Map lreturn=[:]
		String lVehicleUsage=strVehicleUsage.toUpperCase().trim()
		Map lVehicleUsageList=['SPT':'SPT','DTBW':'DTBW','COMMERCIAL':'Commercial']
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsage','')
			lreturn.put('Result',lResult)
			String lVehicleUsageItem=lVehicleUsageList.get(lVehicleUsage)
			if(!lVehicleUsageItem){
				lVehicleUsageItem=lVehicleUsageList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE.toUpperCase())
			}
			lVehicleUsage=lVehicleUsageItem
			String lTagButtonKey='carUsage'
			String lTagButtonValue=lVehicleUsage
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lVehicleUsage='No Option'
				lResult=lVehicleUsage.length()>0
			}else{
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
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
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageForCommercial','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputVehicleUsageForCommercialA(strVehicleUsageForCommercial)
						break
					case 'B':
						lreturn=this.inputVehicleUsageForCommercialB(strVehicleUsageForCommercial)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputVehicleUsageForCommercialA(strVehicleUsageForCommercial)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageForCommercialA(String strVehicleUsageForCommercial){
		Map lreturn=[:]
		String lVehicleUsageForCommercial=strVehicleUsageForCommercial.toUpperCase().trim()
		Map lVehicleUsageForCommercialList=['No':'SPT','Yes':'Commercial']
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageForCommercial','')
			lreturn.put('Result',lResult)
			Boolean lIsVehicleUsageForCommercialValue=IGNUemaHelper.convertStringToBoolean(lVehicleUsageForCommercial)
			Boolean lIsVehicleUsageForCommercialContainDefault=IGNUemaHelper.checkStringContainString(lVehicleUsageForCommercial,'NO')
			if(lIsVehicleUsageForCommercialContainDefault){
				if(lIsVehicleUsageForCommercialValue){
					lIsVehicleUsageForCommercialValue=false
				}
			}
			lVehicleUsageForCommercial=IGNUemaHelper.convertBooleanToYesNoString(lIsVehicleUsageForCommercialValue)
			String lVehicleUsageForCommercialItem=lVehicleUsageForCommercialList.get(lVehicleUsageForCommercial)
			if(!lVehicleUsageForCommercialItem){
				lVehicleUsageForCommercialItem=lVehicleUsageForCommercialList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE_FOR_COMMERCIAL)
			}
			String lTagButtonKey='carUsage'
			String lTagButtonValue=lVehicleUsageForCommercialItem
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lVehicleUsageForCommercial='No Option'
				lResult=lVehicleUsageForCommercial.length()>0
			}else{
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
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
	public Map inputVehicleUsageForCommercialB(String strVehicleUsageForCommercial){
		Map lreturn=[:]
		String lVehicleUsageForCommercial=strVehicleUsageForCommercial.toUpperCase().trim()
		Map lVehicleUsageForCommercialList=['No':'SPT','Yes':'Commercial']
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageForCommercial','')
			lreturn.put('Result',lResult)
			Boolean lIsVehicleUsageForCommercialValue=IGNUemaHelper.convertStringToBoolean(lVehicleUsageForCommercial)
			Boolean lIsVehicleUsageForCommercialContainDefault=IGNUemaHelper.checkStringContainString(lVehicleUsageForCommercial,'NO')
			if(lIsVehicleUsageForCommercialContainDefault){
				if(lIsVehicleUsageForCommercialValue){
					lIsVehicleUsageForCommercialValue=false
				}
			}
			lVehicleUsageForCommercial=IGNUemaHelper.convertBooleanToYesNoString(lIsVehicleUsageForCommercialValue)
			String lVehicleUsageForCommercialItem=lVehicleUsageForCommercialList.get(lVehicleUsageForCommercial)
			if(!lVehicleUsageForCommercialItem){
				lVehicleUsageForCommercialItem=lVehicleUsageForCommercialList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE_FOR_COMMERCIAL)
			}
			String lTagButtonKey='carUsage'
			String lTagButtonValue=lVehicleUsageForCommercialItem
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lVehicleUsageForCommercial='No Option'
				lResult=lVehicleUsageForCommercial.length()>0
			}else{
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
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
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWork','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputVehicleUsageDriveToWorkA(strVehicleUsageDriveToWork)
						break
					case 'B':
						lreturn=this.inputVehicleUsageDriveToWorkB(strVehicleUsageDriveToWork)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputVehicleUsageDriveToWorkA(strVehicleUsageDriveToWork)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageDriveToWorkA(String strVehicleUsageDriveToWork){
		Map lreturn=[:]
		String lVehicleUsageDriveToWork=strVehicleUsageDriveToWork.toUpperCase().trim()
		Map lVehicleUsageDriveToWorkList=['No':'SPT','Yes':'DTBW']
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWork','')
			lreturn.put('Result',lResult)
			Boolean lIsVehicleUsageDriveToWorkValue=IGNUemaHelper.convertStringToBoolean(lVehicleUsageDriveToWork)
			Boolean lIsVehicleUsageDriveToWorkContainDefault=IGNUemaHelper.checkStringContainString(lVehicleUsageDriveToWork,'YES')
			if(lIsVehicleUsageDriveToWorkContainDefault){
				if(!lIsVehicleUsageDriveToWorkValue){
					lIsVehicleUsageDriveToWorkValue=true
				}
			}
			lVehicleUsageDriveToWork=IGNUemaHelper.convertBooleanToYesNoString(lIsVehicleUsageDriveToWorkValue)
			String lVehicleUsageDriveToWorkItem=lVehicleUsageDriveToWorkList.get(lVehicleUsageDriveToWork)
			if(!lVehicleUsageDriveToWorkItem){
				lVehicleUsageDriveToWorkItem=lVehicleUsageDriveToWorkList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK)
			}
			String lTagButtonKey='personalUse'
			String lTagButtonValue=lVehicleUsageDriveToWorkItem
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lVehicleUsageDriveToWork='No Option'
				lResult=lVehicleUsageDriveToWork.length()>0
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lVehicleUsageDriveToWork='No Option'
					lResult=lVehicleUsageDriveToWork.length()>0
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
	public Map inputVehicleUsageDriveToWorkB(String strVehicleUsageDriveToWork){
		Map lreturn=[:]
		String lVehicleUsageDriveToWork=strVehicleUsageDriveToWork.toUpperCase().trim()
		Map lVehicleUsageDriveToWorkList=['No':'SPT','Yes':'DTBW']
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWork','')
			lreturn.put('Result',lResult)
			Boolean lIsVehicleUsageDriveToWorkValue=IGNUemaHelper.convertStringToBoolean(lVehicleUsageDriveToWork)
			Boolean lIsVehicleUsageDriveToWorkContainDefault=IGNUemaHelper.checkStringContainString(lVehicleUsageDriveToWork,'YES')
			if(lIsVehicleUsageDriveToWorkContainDefault){
				if(!lIsVehicleUsageDriveToWorkValue){
					lIsVehicleUsageDriveToWorkValue=true
				}
			}
			lVehicleUsageDriveToWork=IGNUemaHelper.convertBooleanToYesNoString(lIsVehicleUsageDriveToWorkValue)
			String lVehicleUsageDriveToWorkItem=lVehicleUsageDriveToWorkList.get(lVehicleUsageDriveToWork)
			if(!lVehicleUsageDriveToWorkItem){
				lVehicleUsageDriveToWorkItem=lVehicleUsageDriveToWorkList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK)
			}
			String lTagButtonKey='personalUse'
			String lTagButtonValue=lVehicleUsageDriveToWorkItem
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lVehicleUsageDriveToWork='No Option'
				lResult=lVehicleUsageDriveToWork.length()>0
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lVehicleUsageDriveToWork='No Option'
					lResult=lVehicleUsageDriveToWork.length()>0
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWorkOften','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputVehicleUsageDriveToWorkOftenA(strVehicleUsageDriveToWorkOften)
						break
					case 'B':
						lreturn=this.inputVehicleUsageDriveToWorkOftenB(strVehicleUsageDriveToWorkOften)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputVehicleUsageDriveToWorkOftenA(strVehicleUsageDriveToWorkOften)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVehicleUsageDriveToWorkOftenA(String strVehicleUsageDriveToWorkOften){
		Map lreturn=[:]
		String lVehicleUsageDriveToWorkOften=strVehicleUsageDriveToWorkOften.trim()
		Map lVehicleUsageDriveToWorkOftenList=['1':'1','2':'2','3':'3']
		Integer lVehicleUsageDriveToWorkOftenDefaultMin=1
		Integer lVehicleUsageDriveToWorkOftenDefaultMax=3
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWorkOften','')
			lreturn.put('Result',lResult)
			String lVehicleUsageDriveToWorkOftenItem=lVehicleUsageDriveToWorkOftenList.get(lVehicleUsageDriveToWorkOften)
			if(!lVehicleUsageDriveToWorkOftenItem){
				lVehicleUsageDriveToWorkOftenItem=lVehicleUsageDriveToWorkOftenList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK_OFTEN)
			}
			lVehicleUsageDriveToWorkOften=''
			Integer lVehicleUsageDriveToWorkOftenItemNum=IGNUemaHelper.convertStringToInteger(lVehicleUsageDriveToWorkOftenItem,lVehicleUsageDriveToWorkOftenDefaultMin)
			String lTagVehicleUsageDriveToWorkOftenModalForm=''
			String lLocatorVehicleUsageDriveToWorkOftenModalForm='#useToCommuteToWorkOften'
			Boolean lIsVehicleUsageDriveToWorkOftenModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorVehicleUsageDriveToWorkOftenModalForm)
			if(!lIsVehicleUsageDriveToWorkOftenModalFormDisplayed){
				lVehicleUsageDriveToWorkOften='No Option'
			}else{
				String lTagVehicleUsageDriveToWorkOftenButtonKey='personalUse'
				String lTagVehicleUsageDriveToWorkOftenButtonValue=''
				switch(lVehicleUsageDriveToWorkOftenItemNum){
					case 2:
						lTagVehicleUsageDriveToWorkOftenButtonValue='SPTCSomeTime'
						break
					case 3:
						lTagVehicleUsageDriveToWorkOftenButtonValue='SPTCOften'
						break
					default:
						lTagVehicleUsageDriveToWorkOftenButtonValue='SPT'
						break
				}
				String lLocatorVehicleUsageDriveToWorkOftenSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagVehicleUsageDriveToWorkOftenButtonKey,lTagVehicleUsageDriveToWorkOftenButtonValue)
				WebElement lElementVehicleUsageDriveToWorkOftenSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagVehicleUsageDriveToWorkOftenButtonKey,lTagVehicleUsageDriveToWorkOftenButtonValue)
				if(!lElementVehicleUsageDriveToWorkOftenSelectButton){
					lVehicleUsageDriveToWorkOften='No Option'
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementVehicleUsageDriveToWorkOftenSelectButton)
				lVehicleUsageDriveToWorkOften=lVehicleUsageDriveToWorkOftenItemNum.toString()
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
	public Map inputVehicleUsageDriveToWorkOftenB(String strVehicleUsageDriveToWorkOften){
		Map lreturn=[:]
		String lVehicleUsageDriveToWorkOften=strVehicleUsageDriveToWorkOften.trim()
		Map lVehicleUsageDriveToWorkOftenList=['1':'1','2':'2','3':'3']
		Integer lVehicleUsageDriveToWorkOftenDefaultMin=1
		Integer lVehicleUsageDriveToWorkOftenDefaultMax=3
		try{
			Boolean lResult=false
			lreturn.put('VehicleUsageDriveToWorkOften','')
			lreturn.put('Result',lResult)
			String lVehicleUsageDriveToWorkOftenItem=lVehicleUsageDriveToWorkOftenList.get(lVehicleUsageDriveToWorkOften)
			if(!lVehicleUsageDriveToWorkOftenItem){
				lVehicleUsageDriveToWorkOftenItem=lVehicleUsageDriveToWorkOftenList.get(THAMotorBikeQuotationInputType.DEFAULT_VEHICLE_USAGE_DRIVE_TO_WORK_OFTEN)
			}
			lVehicleUsageDriveToWorkOften=''
			Integer lVehicleUsageDriveToWorkOftenItemNum=IGNUemaHelper.convertStringToInteger(lVehicleUsageDriveToWorkOftenItem,lVehicleUsageDriveToWorkOftenDefaultMin)
			String lTagVehicleUsageDriveToWorkOftenModalForm=''
			String lLocatorVehicleUsageDriveToWorkOftenModalForm='#useToCommuteToWorkOften'
			Boolean lIsVehicleUsageDriveToWorkOftenModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorVehicleUsageDriveToWorkOftenModalForm)
			if(!lIsVehicleUsageDriveToWorkOftenModalFormDisplayed){
				lVehicleUsageDriveToWorkOften='No Option'
			}else{
				String lTagVehicleUsageDriveToWorkOftenButtonKey='personalUse'
				String lTagVehicleUsageDriveToWorkOftenButtonValue=''
				switch(lVehicleUsageDriveToWorkOftenItemNum){
					case 2:
						lTagVehicleUsageDriveToWorkOftenButtonValue='SPTCSomeTime'
						break
					case 3:
						lTagVehicleUsageDriveToWorkOftenButtonValue='SPTCOften'
						break
					default:
						lTagVehicleUsageDriveToWorkOftenButtonValue='SPT'
						break
				}
				String lLocatorVehicleUsageDriveToWorkOftenSelectButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagVehicleUsageDriveToWorkOftenButtonKey,lTagVehicleUsageDriveToWorkOftenButtonValue)
				WebElement lElementVehicleUsageDriveToWorkOftenSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagVehicleUsageDriveToWorkOftenButtonKey,lTagVehicleUsageDriveToWorkOftenButtonValue)
				if(!lElementVehicleUsageDriveToWorkOftenSelectButton){
					lVehicleUsageDriveToWorkOften='No Option'
				}
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementVehicleUsageDriveToWorkOftenSelectButton)
				lVehicleUsageDriveToWorkOften=lVehicleUsageDriveToWorkOftenItemNum.toString()
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
		try{
			Boolean lResult=false
			lreturn.put('TaxiOrVehicleForHire','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputTaxiOrVehicleForHireA(strTaxiOrVehicleForHire)
						break
					case 'B':
						lreturn=this.inputTaxiOrVehicleForHireB(strTaxiOrVehicleForHire)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputTaxiOrVehicleForHireA(strTaxiOrVehicleForHire)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputTaxiOrVehicleForHireA(String strTaxiOrVehicleForHire){
		Map lreturn=[:]
		String lTaxiOrVehicleForHire=strTaxiOrVehicleForHire.trim()
		if(lTaxiOrVehicleForHire.length()<=0){
			lTaxiOrVehicleForHire=THAMotorBikeQuotationInputType.DEFAULT_TAXI_OR_VEHICLE_FOR_HIRE
		}
		try{
			Boolean lResult=false
			lreturn.put('TaxiOrVehicleForHire','')
			lreturn.put('Result',lResult)
			Boolean lIsTaxiOrVehicleForHire=IGNUemaHelper.convertStringToBoolean(lTaxiOrVehicleForHire)
			String lTagButtonKey='taxi-veh-for-hire'
			String lTagButtonValue=''
			if(lIsTaxiOrVehicleForHire){
				lTaxiOrVehicleForHire='Yes'
			}else{
				lTaxiOrVehicleForHire='No'
			}
			lTagButtonValue=lTaxiOrVehicleForHire
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lTaxiOrVehicleForHire='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lTaxiOrVehicleForHire='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
	public Map inputTaxiOrVehicleForHireB(String strTaxiOrVehicleForHire){
		Map lreturn=[:]
		String lTaxiOrVehicleForHire=strTaxiOrVehicleForHire.trim()
		if(lTaxiOrVehicleForHire.length()<=0){
			lTaxiOrVehicleForHire=THAMotorBikeQuotationInputType.DEFAULT_TAXI_OR_VEHICLE_FOR_HIRE
		}
		try{
			Boolean lResult=false
			lreturn.put('TaxiOrVehicleForHire','')
			lreturn.put('Result',lResult)
			Boolean lIsTaxiOrVehicleForHire=IGNUemaHelper.convertStringToBoolean(lTaxiOrVehicleForHire)
			String lTagButtonKey='taxi-veh-for-hire'
			String lTagButtonValue=''
			if(lIsTaxiOrVehicleForHire){
				lTaxiOrVehicleForHire='Yes'
			}else{
				lTaxiOrVehicleForHire='No'
			}
			lTagButtonValue=lTaxiOrVehicleForHire
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lTaxiOrVehicleForHire='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lTaxiOrVehicleForHire='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('RentalVehicle','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputRentalVehicleA(strRentalVehicle)
						break
					case 'B':
						lreturn=this.inputRentalVehicleB(strRentalVehicle)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputRentalVehicleA(strRentalVehicle)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputRentalVehicleA(String strRentalVehicle){
		Map lreturn=[:]
		String lRentalVehicle=strRentalVehicle.trim()
		if(lRentalVehicle.length()<=0){
			lRentalVehicle=THAMotorBikeQuotationInputType.DEFAULT_RENTAL_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('RentalVehicle','')
			lreturn.put('Result',lResult)
			Boolean lIsRentalVehicle=IGNUemaHelper.convertStringToBoolean(lRentalVehicle)
			String lTagButtonKey='rental-vehicle'
			String lTagButtonValue=''
			if(lIsRentalVehicle){
				lRentalVehicle='Yes'
			}else{
				lRentalVehicle='No'
			}
			lTagButtonValue=lRentalVehicle
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lRentalVehicle='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lRentalVehicle='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
	public Map inputRentalVehicleB(String strRentalVehicle){
		Map lreturn=[:]
		String lRentalVehicle=strRentalVehicle.trim()
		if(lRentalVehicle.length()<=0){
			lRentalVehicle=THAMotorBikeQuotationInputType.DEFAULT_RENTAL_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('RentalVehicle','')
			lreturn.put('Result',lResult)
			Boolean lIsRentalVehicle=IGNUemaHelper.convertStringToBoolean(lRentalVehicle)
			String lTagButtonKey='rental-vehicle'
			String lTagButtonValue=''
			if(lIsRentalVehicle){
				lRentalVehicle='Yes'
			}else{
				lRentalVehicle='No'
			}
			lTagButtonValue=lRentalVehicle
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lRentalVehicle='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lRentalVehicle='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportVehicle','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputGoodsTransportVehicleA(strGoodsTransportVehicle)
						break
					case 'B':
						lreturn=this.inputGoodsTransportVehicleB(strGoodsTransportVehicle)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputGoodsTransportVehicleA(strGoodsTransportVehicle)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGoodsTransportVehicleA(String strGoodsTransportVehicle){
		Map lreturn=[:]
		String lGoodsTransportVehicle=strGoodsTransportVehicle.trim()
		if(lGoodsTransportVehicle.length()<=0){
			lGoodsTransportVehicle=THAMotorBikeQuotationInputType.DEFAULT_GOODS_TRANSPORT_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportVehicle','')
			lreturn.put('Result',lResult)
			Boolean lIsGoodsTransportVehicle=IGNUemaHelper.convertStringToBoolean(lGoodsTransportVehicle)
			String lTagButtonKey='goods-transport-vehicle'
			String lTagButtonValue=''
			if(lIsGoodsTransportVehicle){
				lGoodsTransportVehicle='Yes'
			}else{
				lGoodsTransportVehicle='No'
			}
			lTagButtonValue=lGoodsTransportVehicle
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lGoodsTransportVehicle='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lGoodsTransportVehicle='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
	public Map inputGoodsTransportVehicleB(String strGoodsTransportVehicle){
		Map lreturn=[:]
		String lGoodsTransportVehicle=strGoodsTransportVehicle.trim()
		if(lGoodsTransportVehicle.length()<=0){
			lGoodsTransportVehicle=THAMotorBikeQuotationInputType.DEFAULT_GOODS_TRANSPORT_VEHICLE
		}
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportVehicle','')
			lreturn.put('Result',lResult)
			Boolean lIsGoodsTransportVehicle=IGNUemaHelper.convertStringToBoolean(lGoodsTransportVehicle)
			String lTagButtonKey='goods-transport-vehicle'
			String lTagButtonValue=''
			if(lIsGoodsTransportVehicle){
				lGoodsTransportVehicle='Yes'
			}else{
				lGoodsTransportVehicle='No'
			}
			lTagButtonValue=lGoodsTransportVehicle
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lGoodsTransportVehicle='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lGoodsTransportVehicle='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('LogisticsOrCourierCompany','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputLogisticsOrCourierCompanyA(strLogisticsOrCourierCompany)
						break
					case 'B':
						lreturn=this.inputLogisticsOrCourierCompanyB(strLogisticsOrCourierCompany)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputLogisticsOrCourierCompanyA(strLogisticsOrCourierCompany)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLogisticsOrCourierCompanyA(String strLogisticsOrCourierCompany){
		Map lreturn=[:]
		String lLogisticsOrCourierCompany=strLogisticsOrCourierCompany.trim()
		if(lLogisticsOrCourierCompany.length()<=0){
			lLogisticsOrCourierCompany=THAMotorBikeQuotationInputType.DEFAULT_LOGISTICS_OR_COURIER_COMPANY
		}
		try{
			Boolean lResult=false
			lreturn.put('LogisticsOrCourierCompany','')
			lreturn.put('Result',lResult)
			Boolean lIsLogisticsOrCourierCompany=IGNUemaHelper.convertStringToBoolean(lLogisticsOrCourierCompany)
			String lTagButtonKey='whose-goods'
			String lTagButtonValue=''
			if(lIsLogisticsOrCourierCompany){
				lLogisticsOrCourierCompany='Yes'
			}else{
				lLogisticsOrCourierCompany='No'
			}
			lTagButtonValue=lLogisticsOrCourierCompany
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lLogisticsOrCourierCompany='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lLogisticsOrCourierCompany='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
	public Map inputLogisticsOrCourierCompanyB(String strLogisticsOrCourierCompany){
		Map lreturn=[:]
		String lLogisticsOrCourierCompany=strLogisticsOrCourierCompany.trim()
		if(lLogisticsOrCourierCompany.length()<=0){
			lLogisticsOrCourierCompany=THAMotorBikeQuotationInputType.DEFAULT_LOGISTICS_OR_COURIER_COMPANY
		}
		try{
			Boolean lResult=false
			lreturn.put('LogisticsOrCourierCompany','')
			lreturn.put('Result',lResult)
			Boolean lIsLogisticsOrCourierCompany=IGNUemaHelper.convertStringToBoolean(lLogisticsOrCourierCompany)
			String lTagButtonKey='whose-goods'
			String lTagButtonValue=''
			if(lIsLogisticsOrCourierCompany){
				lLogisticsOrCourierCompany='Yes'
			}else{
				lLogisticsOrCourierCompany='No'
			}
			lTagButtonValue=lLogisticsOrCourierCompany
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lLogisticsOrCourierCompany='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lLogisticsOrCourierCompany='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportRoute','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputGoodsTransportRouteA(strGoodsTransportRoute)
						break
					case 'B':
						lreturn=this.inputGoodsTransportRouteB(strGoodsTransportRoute)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputGoodsTransportRouteA(strGoodsTransportRoute)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGoodsTransportRouteA(String strGoodsTransportRoute){
		Map lreturn=[:]
		String lGoodsTransportRoute=strGoodsTransportRoute.toUpperCase().trim()
		Map lGoodsTransportRouteList=['FIXED':'Fixed','VARIABLE':'Variable']
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportRoute','')
			lreturn.put('Result',lResult)
			String lGoodsTransportRouteItem=lGoodsTransportRouteList.get(lGoodsTransportRoute)
			if(!lGoodsTransportRouteItem){
				lGoodsTransportRouteItem=lGoodsTransportRouteList.get(THAMotorBikeQuotationInputType.DEFAULT_GOODS_TRANSPORT_ROUTE.toUpperCase())
			}
			lGoodsTransportRoute=lGoodsTransportRouteItem
			String lTagButtonKey='goods-transport-route'
			String lTagButtonValue=lGoodsTransportRoute
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lGoodsTransportRoute='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lGoodsTransportRoute='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
	public Map inputGoodsTransportRouteB(String strGoodsTransportRoute){
		Map lreturn=[:]
		String lGoodsTransportRoute=strGoodsTransportRoute.toUpperCase().trim()
		Map lGoodsTransportRouteList=['FIXED':'Fixed','VARIABLE':'Variable']
		try{
			Boolean lResult=false
			lreturn.put('GoodsTransportRoute','')
			lreturn.put('Result',lResult)
			String lGoodsTransportRouteItem=lGoodsTransportRouteList.get(lGoodsTransportRoute)
			if(!lGoodsTransportRouteItem){
				lGoodsTransportRouteItem=lGoodsTransportRouteList.get(THAMotorBikeQuotationInputType.DEFAULT_GOODS_TRANSPORT_ROUTE.toUpperCase())
			}
			lGoodsTransportRoute=lGoodsTransportRouteItem
			String lTagButtonKey='goods-transport-route'
			String lTagButtonValue=lGoodsTransportRoute
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				lGoodsTransportRoute='No Option'
				lResult=true
			}else{
				if(!IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementButton)){
					lGoodsTransportRoute='No Option'
					lResult=true
				}else{
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('PostalCode','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPostalCodeA(strPostalCode)
						break
					case 'B':
						lreturn=this.inputPostalCodeB(strPostalCode)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPostalCodeA(strPostalCode)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPostalCodeA(String strPostalCode){
		Map lreturn=[:]
		String lPostalCode=strPostalCode.trim()
		if(lPostalCode.length()<=0){
			lPostalCode=THAMotorBikeQuotationInputType.DEFAULT_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('PostalCode','')
			lreturn.put('Result',lResult)
			String lTagInputText='quotePostalCode'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			WebElement lElementInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText)
			lPostalCode=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputText,lPostalCode)
			String lTagButtonNext='quotePostalCode-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputPostalCodeB(String strPostalCode){
		Map lreturn=[:]
		String lPostalCode=strPostalCode.trim()
		if(lPostalCode.length()<=0){
			lPostalCode=THAMotorBikeQuotationInputType.DEFAULT_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('PostalCode','')
			lreturn.put('Result',lResult)
			String lTagInputText='quotePostalCode'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			WebElement lElementInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText)
			lPostalCode=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputText,lPostalCode)
			String lTagButtonNext='quotePostalCode-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('OdometerReading','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputOdometerReadingA(strOdometerReading)
						break
					case 'B':
						lreturn=this.inputOdometerReadingB(strOdometerReading)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputOdometerReadingA(strOdometerReading)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputOdometerReadingA(String strOdometerReading){
		Map lreturn=[:]
		String lOdometerReading=strOdometerReading.trim()
		if(lOdometerReading.length()<=0){
			lOdometerReading=THAMotorBikeQuotationInputType.DEFAULT_ODOMETER_READING
		}
		Integer lOdometerReadingMin=0
		Integer lOdometerReadingMax=20
		Integer lOdometerReadingDefault=3
		Integer lOdometerReadingNum=IGNUemaHelper.convertStringToInteger(lOdometerReading,lOdometerReadingDefault)
		if((lOdometerReadingNum<lOdometerReadingMin)||(lOdometerReadingNum>lOdometerReadingMax)){
			lOdometerReadingNum=lOdometerReadingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('OdometerReading','')
			lreturn.put('Result',lResult)
			lOdometerReading=''
			String lTagSliderInput='ODOmeter'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lOdometerInput=lOdometerReadingNum.toString()
			lOdometerInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lOdometerInput)
			IGNUemaHelper.delayThreadSecond(1)
			lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lOdometerText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderInput).trim()
			IGNUemaHelper.printLog('lOdometerNum:'+lOdometerText)
			String lTagOdometerValueStep='ODOmeter-step'
			String lLocatorOdometerValueStep=IGNUemaHelper.getTagDataSeleniumKey(lTagOdometerValueStep)
			WebElement lElementOdometerValueStep=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOdometerValueStep)
			if(!lElementOdometerValueStep){
				return lreturn
			}
			String lOdometerValueStepText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOdometerValueStep).trim()
			if(lOdometerValueStepText.length()<=0){
				return lreturn
			}
			Integer lOdometerValueStepNum=IGNUemaHelper.convertStringToInteger(lOdometerValueStepText,0)
			Float lOdometerNumFloat=lOdometerReadingNum*lOdometerValueStepNum
			Integer lOdometerNumInt=lOdometerNumFloat.intValue()
			lOdometerText='OdometerNum='+lOdometerText+'|EachStep='+lOdometerValueStepText+'|CalValue='+lOdometerNumInt.toString()
			String lTagOdometerDisplayText=''
			String lLocatorOdometerDisplayText='.car-mileage .selected-migeage'
			String lOdometerDisplayText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorOdometerDisplayText).trim()
			if(lOdometerDisplayText.length()>0){
				lOdometerText=lOdometerText+'|Text='+lOdometerDisplayText
			}
			lOdometerReading=lOdometerText
			String lTagOdometerNext='ODOmeter-next'
			String lLocatorOdometerNext=IGNUemaHelper.getTagDataSeleniumKey(lTagOdometerNext)
			WebElement lElementOdometerNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOdometerNext)
			if(lElementOdometerNext){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementOdometerNext)
			}
			lResult=lResult&&(lOdometerReading.length()>0)
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
	public Map inputOdometerReadingB(String strOdometerReading){
		Map lreturn=[:]
		String lOdometerReading=strOdometerReading.trim()
		if(lOdometerReading.length()<=0){
			lOdometerReading=THAMotorBikeQuotationInputType.DEFAULT_ODOMETER_READING
		}
		Integer lOdometerReadingMin=0
		Integer lOdometerReadingMax=20
		Integer lOdometerReadingDefault=3
		Integer lOdometerReadingNum=IGNUemaHelper.convertStringToInteger(lOdometerReading,lOdometerReadingDefault)
		if((lOdometerReadingNum<lOdometerReadingMin)||(lOdometerReadingNum>lOdometerReadingMax)){
			lOdometerReadingNum=lOdometerReadingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('OdometerReading','')
			lreturn.put('Result',lResult)
			lOdometerReading=''
			String lTagSliderInput='ODOmeter'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lOdometerInput=lOdometerReadingNum.toString()
			lOdometerInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lOdometerInput)
			IGNUemaHelper.delayThreadSecond(1)
			lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lOdometerText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderInput).trim()
			IGNUemaHelper.printLog('lOdometerNum:'+lOdometerText)
			String lTagOdometerValueStep='ODOmeter-step'
			String lLocatorOdometerValueStep=IGNUemaHelper.getTagDataSeleniumKey(lTagOdometerValueStep)
			WebElement lElementOdometerValueStep=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOdometerValueStep)
			if(!lElementOdometerValueStep){
				return lreturn
			}
			String lOdometerValueStepText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOdometerValueStep).trim()
			if(lOdometerValueStepText.length()<=0){
				return lreturn
			}
			Integer lOdometerValueStepNum=IGNUemaHelper.convertStringToInteger(lOdometerValueStepText,0)
			Float lOdometerNumFloat=lOdometerReadingNum*lOdometerValueStepNum
			Integer lOdometerNumInt=lOdometerNumFloat.intValue()
			lOdometerText='OdometerNum='+lOdometerText+'|EachStep='+lOdometerValueStepText+'|CalValue='+lOdometerNumInt.toString()
			String lTagOdometerDisplayText=''
			String lLocatorOdometerDisplayText='.car-mileage .selected-migeage'
			String lOdometerDisplayText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorOdometerDisplayText).trim()
			if(lOdometerDisplayText.length()>0){
				lOdometerText=lOdometerText+'|Text='+lOdometerDisplayText
			}
			lOdometerReading=lOdometerText
			String lTagOdometerNext='ODOmeter-next'
			String lLocatorOdometerNext=IGNUemaHelper.getTagDataSeleniumKey(lTagOdometerNext)
			WebElement lElementOdometerNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOdometerNext)
			if(lElementOdometerNext){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementOdometerNext)
			}
			lResult=lResult&&(lOdometerReading.length()>0)
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
		try{
			Boolean lResult=false
			lreturn.put('DeclaredNcb','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDeclaredNcbA(strDeclaredNcb)
						break
					case 'B':
						lreturn=this.inputDeclaredNcbB(strDeclaredNcb)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDeclaredNcbA(strDeclaredNcb)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDeclaredNcbA(String strDeclaredNcb){
		Map lreturn=[:]
		String lDeclaredNcb=strDeclaredNcb.trim()
		if(lDeclaredNcb.length()<=0){
			lDeclaredNcb=THAMotorBikeQuotationInputType.DEFAULT_DECLARED_NCB
		}
		Integer lDeclaredNcbMin=0
		Integer lDeclaredNcbMax=5
		Integer lDeclaredNcbDefault=5
		Integer lDeclaredNcbNum=IGNUemaHelper.convertStringToInteger(lDeclaredNcb,lDeclaredNcbDefault)
		if((lDeclaredNcbNum<lDeclaredNcbMin)||(lDeclaredNcbNum>lDeclaredNcbMax)){
			lDeclaredNcbNum=lDeclaredNcbDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('DeclaredNcb','')
			lreturn.put('Result',lResult)
			lDeclaredNcb=lDeclaredNcbNum.toString()
			String lTagButtonKey='hdDeclareNCB'
			String lTagButtonValue=lDeclaredNcb
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(lElementButton){
				String lDeclaredNcbText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton).trim()
				if(lDeclaredNcbText.length()>0){
					lDeclaredNcb=lDeclaredNcb+'|'+lDeclaredNcbText
				}
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
	public Map inputDeclaredNcbB(String strDeclaredNcb){
		Map lreturn=[:]
		String lDeclaredNcb=strDeclaredNcb.trim()
		if(lDeclaredNcb.length()<=0){
			lDeclaredNcb=THAMotorBikeQuotationInputType.DEFAULT_DECLARED_NCB
		}
		Integer lDeclaredNcbMin=0
		Integer lDeclaredNcbMax=5
		Integer lDeclaredNcbDefault=5
		Integer lDeclaredNcbNum=IGNUemaHelper.convertStringToInteger(lDeclaredNcb,lDeclaredNcbDefault)
		if((lDeclaredNcbNum<lDeclaredNcbMin)||(lDeclaredNcbNum>lDeclaredNcbMax)){
			lDeclaredNcbNum=lDeclaredNcbDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('DeclaredNcb','')
			lreturn.put('Result',lResult)
			lDeclaredNcb=lDeclaredNcbNum.toString()
			String lTagButtonKey='hdDeclareNCB'
			String lTagButtonValue=lDeclaredNcb
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(lElementButton){
				String lDeclaredNcbText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButton).trim()
				if(lDeclaredNcbText.length()>0){
					lDeclaredNcb=lDeclaredNcb+'|'+lDeclaredNcbText
				}
			}
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
		try{
			Boolean lResult=false
			lreturn.put('UnderFinancing','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputUnderFinancingA(strUnderFinancing)
						break
					case 'B':
						lreturn=this.inputUnderFinancingB(strUnderFinancing)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputUnderFinancingA(strUnderFinancing)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputUnderFinancingA(String strUnderFinancing){
		Map lreturn=[:]
		String lUnderFinancing=strUnderFinancing.toUpperCase().trim()
		if(lUnderFinancing.length()<=0){
			lUnderFinancing=THAMotorBikeQuotationInputType.DEFAULT_UNDER_FINANCING.toUpperCase()
		}
		Map lUnderFinancingList=['YES':'Yes','NO':'No']
		try{
			Boolean lResult=false
			lreturn.put('UnderFinancing','')
			lreturn.put('Result',lResult)
			String lUnderFinancingItem=lUnderFinancingList.get(lUnderFinancing)
			if(!lUnderFinancingItem){
				lUnderFinancingItem=lUnderFinancingList.get(THAMotorBikeQuotationInputType.DEFAULT_UNDER_FINANCING.toUpperCase())
			}
			lUnderFinancing=''
			String lLocatorQuestionVisible='#carFinancingQuestion'
			Boolean lIsQuestionVisible=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorQuestionVisible)
			if(!lIsQuestionVisible){
				lUnderFinancing='No Option'
			}else{
				String lTagButtonKey='CarFinancing'
				String lTagButtonValue=lUnderFinancingItem
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(!lElementButton){
					lUnderFinancing='No Option'
				}else{
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
						lUnderFinancing=lUnderFinancingItem
					}
					if(lUnderFinancing.length()<=0){
						lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)){
							lUnderFinancing=lUnderFinancingItem
						}
					}
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
	public Map inputUnderFinancingB(String strUnderFinancing){
		Map lreturn=[:]
		String lUnderFinancing=strUnderFinancing.toUpperCase().trim()
		if(lUnderFinancing.length()<=0){
			lUnderFinancing=THAMotorBikeQuotationInputType.DEFAULT_UNDER_FINANCING.toUpperCase()
		}
		Map lUnderFinancingList=['YES':'Yes','NO':'No']
		try{
			Boolean lResult=false
			lreturn.put('UnderFinancing','')
			lreturn.put('Result',lResult)
			String lUnderFinancingItem=lUnderFinancingList.get(lUnderFinancing)
			if(!lUnderFinancingItem){
				lUnderFinancingItem=lUnderFinancingList.get(THAMotorBikeQuotationInputType.DEFAULT_UNDER_FINANCING.toUpperCase())
			}
			lUnderFinancing=''
			String lLocatorQuestionVisible='#carFinancingQuestion'
			Boolean lIsQuestionVisible=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorQuestionVisible)
			if(!lIsQuestionVisible){
				lUnderFinancing='No Option'
			}else{
				String lTagButtonKey='CarFinancing'
				String lTagButtonValue=lUnderFinancingItem
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(!lElementButton){
					lUnderFinancing='No Option'
				}else{
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
						lUnderFinancing=lUnderFinancingItem
					}
					if(lUnderFinancing.length()<=0){
						lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
						if(IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)){
							lUnderFinancing=lUnderFinancingItem
						}
					}
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
		try{
			Boolean lResult=false
			lreturn.put('CarCamera','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarCameraA(strCarCamera)
						break
					case 'B':
						lreturn=this.inputCarCameraB(strCarCamera)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarCameraA(strCarCamera)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarCameraA(String strCarCamera){
		Map lreturn=[:]
		String lCarCamera=strCarCamera.trim()
		if(lCarCamera.length()<=0){
			lCarCamera=THAMotorBikeQuotationInputType.DEFAULT_CAR_CAMERA
		}
		try{
			Boolean lResult=false
			lreturn.put('CarCamera','')
			lreturn.put('Result',lResult)
			Boolean lIsCarCamera=IGNUemaHelper.convertStringToBoolean(lCarCamera)
			String lTagButtonKey='carcam'
			String lTagButtonValue=''
			if(lIsCarCamera){
				lCarCamera='Yes'
			}else{
				lCarCamera='No'
			}
			lTagButtonValue=lCarCamera
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			}
			if(!lElementButton){
				lCarCamera='No Option'
				lResult=true
			}else{
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				if(!lResult){
					IGNUemaHelper.delayThreadSecond(3)
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
					if(lElementButton){
						lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}
				if(!lResult){
					IGNUemaHelper.delayThreadSecond(5)
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
					if(lElementButton){
						lResult=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)
					}
				}
			}
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
	public Map inputCarCameraB(String strCarCamera){
		Map lreturn=[:]
		String lCarCamera=strCarCamera.trim()
		if(lCarCamera.length()<=0){
			lCarCamera=THAMotorBikeQuotationInputType.DEFAULT_CAR_CAMERA
		}
		try{
			Boolean lResult=false
			lreturn.put('CarCamera','')
			lreturn.put('Result',lResult)
			Boolean lIsCarCamera=IGNUemaHelper.convertStringToBoolean(lCarCamera)
			String lTagButtonKey='carcam'
			String lTagButtonValue=''
			if(lIsCarCamera){
				lCarCamera='Yes'
			}else{
				lCarCamera='No'
			}
			lTagButtonValue=lCarCamera
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			if(!lElementButton){
				IGNUemaHelper.delayThreadSecond(3)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			}
			if(!lElementButton){
				lCarCamera='No Option'
				lResult=true
			}else{
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				if(!lResult){
					IGNUemaHelper.delayThreadSecond(3)
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
					if(lElementButton){
						lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}
				if(!lResult){
					IGNUemaHelper.delayThreadSecond(5)
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
					if(lElementButton){
						lResult=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)
					}
				}
			}
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
		try{
			Boolean lResult=false
			lreturn.put('Tentative','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputTentativeA(strTentative)
						break
					case 'B':
						lreturn=this.inputTentativeB(strTentative)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputTentativeA(strTentative)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputTentativeA(String strTentative){
		Map lreturn=[:]
		String lTentative=strTentative.trim()
		if(lTentative.length()<=0){
			lTentative=THAMotorBikeQuotationInputType.DEFAULT_TENTATIVE
		}
		try{
			Boolean lResult=false
			lreturn.put('Tentative','')
			lreturn.put('Result',lResult)
			String lTagButtonKey='policyStartDate'
			String lTagButtonValue=''
			lTentative=lTentative.toUpperCase()
			switch(lTentative){
				case 'TODAY':
					lTentative='Today'
					break
				case 'TOMORROW':
					lTentative='Tomorrow'
					break
				default:
					lTentative=THAMotorBikeQuotationInputType.DEFAULT_TENTATIVE
					break
			}
			lTagButtonValue=lTentative
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
	public Map inputTentativeB(String strTentative){
		Map lreturn=[:]
		String lTentative=strTentative.trim()
		if(lTentative.length()<=0){
			lTentative=THAMotorBikeQuotationInputType.DEFAULT_TENTATIVE
		}
		try{
			Boolean lResult=false
			lreturn.put('Tentative','')
			lreturn.put('Result',lResult)
			String lTagButtonKey='policyStartDate'
			String lTagButtonValue=''
			lTentative=lTentative.toUpperCase()
			switch(lTentative){
				case 'TODAY':
					lTentative='Today'
					break
				case 'TOMORROW':
					lTentative='Tomorrow'
					break
				default:
					lTentative=THAMotorBikeQuotationInputType.DEFAULT_TENTATIVE
					break
			}
			lTagButtonValue=lTentative
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
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
		try{
			Boolean lResult=false
			lreturn.put('AlcoholFree','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputAlcoholFreeA(strAlcoholFree)
						break
					case 'B':
						lreturn=this.inputAlcoholFreeB(strAlcoholFree)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputAlcoholFreeB(strAlcoholFree)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAlcoholFreeA(String strAlcoholFree){
		Map lreturn=[:]
		String lAlcoholFree=strAlcoholFree.toUpperCase().trim()
		if(lAlcoholFree.length()<=0){
			lAlcoholFree=THAMotorBikeQuotationInputType.DEFAULT_ALCOHOL_FREE.toUpperCase()
		}
		Map lAlcoholFreeList=['YES':'Yes','NO':'No']
		try{
			Boolean lResult=false
			lreturn.put('AlcoholFree','')
			lreturn.put('Result',lResult)
			String lAlcoholFreeItem=lAlcoholFreeList.get(lAlcoholFree)
			if(!lAlcoholFreeItem){
				lAlcoholFreeItem=lAlcoholFreeList.get(THAMotorBikeQuotationInputType.DEFAULT_UNDER_FINANCING.toUpperCase())
			}
			lAlcoholFree=''
			String lLocatorQuestionVisible='#alcohol-free'
			Boolean lIsQuestionVisible=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorQuestionVisible)
			if(!lIsQuestionVisible){
				lAlcoholFree='No Option'
			}else{
				String lTagButtonKey='alcohol-free'
				String lTagButtonValue=lAlcoholFreeItem
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(!lElementButton){
					lAlcoholFree='No Option'
				}else{
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
						lAlcoholFree=lAlcoholFreeItem
					}
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
	public Map inputAlcoholFreeB(String strAlcoholFree){
		Map lreturn=[:]
		String lAlcoholFree=strAlcoholFree.toUpperCase().trim()
		if(lAlcoholFree.length()<=0){
			lAlcoholFree=THAMotorBikeQuotationInputType.DEFAULT_ALCOHOL_FREE.toUpperCase()
		}
		Map lAlcoholFreeList=['YES':'Yes','NO':'No']
		try{
			Boolean lResult=false
			lreturn.put('AlcoholFree','')
			lreturn.put('Result',lResult)
			String lAlcoholFreeItem=lAlcoholFreeList.get(lAlcoholFree)
			if(!lAlcoholFreeItem){
				lAlcoholFreeItem=lAlcoholFreeList.get(THAMotorBikeQuotationInputType.DEFAULT_UNDER_FINANCING.toUpperCase())
			}
			lAlcoholFree=''
			String lLocatorQuestionVisible='#alcohol-free'
			Boolean lIsQuestionVisible=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorQuestionVisible)
			if(!lIsQuestionVisible){
				lAlcoholFree='No Option'
			}else{
				String lTagButtonKey='alcohol-free'
				String lTagButtonValue=lAlcoholFreeItem
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButtonKey,lTagButtonValue)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButtonKey,lTagButtonValue)
				if(!lElementButton){
					lAlcoholFree='No Option'
				}else{
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
						lAlcoholFree=lAlcoholFreeItem
					}
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