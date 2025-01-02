package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.tha.types.roojaiquote.extendedwarranty.THAExtendedWarrantyQuotationInputUtil
public class THARGPAExtendedWarrantyQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAExtendedWarrantyQuotationInputUtil lTHAExtendedWarrantyQuotationInputUtil=null
	public THARGPAExtendedWarrantyQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAExtendedWarrantyQuotationInputUtil getlTHAExtendedWarrantyQuotationInputUtil(){
		return this.lTHAExtendedWarrantyQuotationInputUtil
	}
	private void setlTHAExtendedWarrantyQuotationInputUtil(THAExtendedWarrantyQuotationInputUtil newlTHAExtendedWarrantyQuotationInputUtil){
		//Do Nothing
		//this.lTHAExtendedWarrantyQuotationInputUtil=newlTHAExtendedWarrantyQuotationInputUtil
	}
	public Boolean inputInput(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lGroundPartnerAgentLoginMethod=caseInput.GroundPartnerAgentLoginMethod.toString().trim()
		String lGroundPartnerAgentAccountSource=caseInput.GroundPartnerAgentAccountSource.toString().trim()
		String lGroundPartnerAgentUrlProductSelect=caseInput.GroundPartnerAgentUrlProductSelect.toString().trim()
		String lGroundPartnerAgentUser=caseInput.GroundPartnerAgentUser.toString().trim()
		String lGroundPartnerAgentPassword=caseInput.GroundPartnerAgentPassword.toString().trim()
		String lGroundPartnerAgentLanguage=caseInput.GroundPartnerAgentLanguage.toString().trim()
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
			THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_USER=lGroundPartnerAgentUser
			THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_PASSWORD=lGroundPartnerAgentPassword
			caseOutput.GroundPartnerAgentUser=lGroundPartnerAgentUser
			caseOutput.GroundPartnerAgentPassword=IGNUemaHelper.convertStringToPassword(lGroundPartnerAgentPassword)
			if(lGroundPartnerAgentUser.length()<=0){
				return lreturn
			}
			if(lGroundPartnerAgentPassword.length()<=0){
				return lreturn
			}
			Map lMapGroundPartnerAgentLoginMethod=this.inputGroundPartnerAgentLoginMethod(lGroundPartnerAgentLoginMethod,lGroundPartnerAgentAccountSource,lGroundPartnerAgentUrlProductSelect,lGroundPartnerAgentLanguage)
			if(!lMapGroundPartnerAgentLoginMethod.Result){
				lGroundPartnerAgentLoginMethod=''
				lGroundPartnerAgentAccountSource=''
				lGroundPartnerAgentUrlProductSelect=''
				lGroundPartnerAgentLanguage=''
				lGroundPartnerAgentSkipLoginUrl=''
			}else{
				lGroundPartnerAgentLoginMethod=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentLoginMethod
				lGroundPartnerAgentAccountSource=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentAccountSource
				lGroundPartnerAgentUrlProductSelect=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentUrlProductSelect
				lGroundPartnerAgentLanguage=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentLanguage
				lGroundPartnerAgentSkipLoginUrl=lMapGroundPartnerAgentLoginMethod.GroundPartnerAgentSkipLoginUrl
			}
			caseOutput.GroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethod
			caseOutput.GroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSource
			caseOutput.GroundPartnerAgentUrlProductSelect=lGroundPartnerAgentUrlProductSelect
			caseOutput.GroundPartnerAgentLanguage=lGroundPartnerAgentLanguage
			caseOutput.GroundPartnerAgentSkipLoginUrl=lGroundPartnerAgentSkipLoginUrl
			if(!lMapGroundPartnerAgentLoginMethod.Result){
				return lreturn
			}
			this.lTHAExtendedWarrantyQuotationInputUtil=new THAExtendedWarrantyQuotationInputUtil(this.driver,this.selenium)
			if(!lTHAExtendedWarrantyQuotationInputUtil.waitUntilLoaded()){
				lTHAExtendedWarrantyQuotationInputUtil.waitUntilLoaded()
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
			lPositiveCase=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_POSITIVE_CASE
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
	public Map inputGroundPartnerAgentLogin(String strGroundPartnerAgentUser,String strGroundPartnerAgentPassword){
		Map lreturn=[:]
		String lGroundPartnerAgentUser=strGroundPartnerAgentUser.trim()
		if(lGroundPartnerAgentUser.length()<=0){
			lGroundPartnerAgentUser=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_USER
		}
		String lGroundPartnerAgentPassword=strGroundPartnerAgentPassword.trim()
		if(lGroundPartnerAgentPassword.length()<=0){
			lGroundPartnerAgentPassword=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_PASSWORD
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
	public Map inputGroundPartnerAgentLoginMethod(String strGroundPartnerAgentLoginMethod,String strGroundPartnerAgentAccountSource,String strGroundPartnerAgentUrlProductSelect,String strGroundPartnerAgentLanguage){
		Map lreturn=[:]
		String lGroundPartnerAgentLoginMethod=strGroundPartnerAgentLoginMethod.trim()
		if(lGroundPartnerAgentLoginMethod.length()<=0){
			lGroundPartnerAgentLoginMethod=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD
		}
		String lGroundPartnerAgentAccountSource=strGroundPartnerAgentAccountSource.trim()
		if(lGroundPartnerAgentAccountSource.length()<=0){
			lGroundPartnerAgentAccountSource=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE
		}
		String lGroundPartnerAgentUrlProductSelect=strGroundPartnerAgentUrlProductSelect.trim()
		if(lGroundPartnerAgentUrlProductSelect.length()<=0){
			lGroundPartnerAgentUrlProductSelect=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT
		}
		String lGroundPartnerAgentLanguage=strGroundPartnerAgentLanguage.toUpperCase().trim()
		if(lGroundPartnerAgentLanguage.length()<=0){
			lGroundPartnerAgentLanguage=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE.toUpperCase()
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
			lreturn.put('GroundPartnerAgentSkipLoginUrl','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(lGroundPartnerAgentLoginMethod)
			if(!lGroundPartnerAgentLoginMethodItem){
				lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
			String lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(lGroundPartnerAgentAccountSource)
			if(!lGroundPartnerAgentAccountSourceItem){
				lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSourceItem
			if(lGroundPartnerAgentAccountSource.equalsIgnoreCase('4')){
				if(lGroundPartnerAgentLoginMethod.equalsIgnoreCase('2')){
					lGroundPartnerAgentLoginMethodItem='3'
					lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
				}
			}
			THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentAccountSource,THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE)
			if(THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE==3){
				THARGPAExtendedWarrantyCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPAExtendedWarrantyCoreType.CURRENT_SOCIAL_SKIP_RATING=true
			}else{
				THARGPAExtendedWarrantyCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPAExtendedWarrantyCoreType.CURRENT_SOCIAL_SKIP_RATING=false
			}
			THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT=lGroundPartnerAgentUrlProductSelect
			String lLanguageItem=lLanguageList.get(lGroundPartnerAgentLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARGPAExtendedWarrantyQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE.toUpperCase())
			}
			lGroundPartnerAgentLanguage=lLanguageItem
			String lLocatorFormApp=''
			Boolean lIsFormReady=false
			switch(lGroundPartnerAgentLoginMethodItem){
				case '2':
					THARGPAExtendedWarrantyCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					lLocatorMenuButtonProductOpenChildImage='#new-quote .row .card-body img[src="img/nq-ew.png"]'
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
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuButtonProductOpenChildButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuButtonProductOpenChildButton)
						IGNUemaHelper.delayThreadSecond(5)
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
								return lreturn
							}else{
								if(lSetWinHandle.size()<=1){
									return lreturn
								}
							}
							for(String lWindowHandle:lSetWinHandle){
								if(!lMainWindow.equals(lWindowHandle)){
									this.driver.switchTo().window(lWindowHandle)
									IGNUemaHelper.delayThreadSecond(10)
									break
								}else{
									this.driver.close()
								}
							}
						}catch(Exception ex){
							return lreturn
						}
					}
					lResult=true
					break
				case '3':
					lLocatorFormApp='#app .row'
					THARGPAExtendedWarrantyCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=false
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
						THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_SKIP_LOGIN=lGroundPartnerAgentSkipLoginUrl
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
						lTagProductSelectButton='extended-warranty-btn'
						String lLocatorProductSelectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProductSelectButton)
						WebElement lElementProductSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProductSelectButton)
						if(!lElementProductSelectButton){
							lLocatorProductSelectButton='#product-link img[alt="Extended Warranty Insurance"]'
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
						String lLocatorProductSpecificPageSelectButton='#extended-insure-hero a'
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
					THARGPAExtendedWarrantyCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					String lGroundPartnerAgentUser=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputEmailText,THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_USER)
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
					lSelectGroundPartnerAgentProduct.selectByValue('extended-warranty')
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
			lLanguage=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_LANGUAGE.toUpperCase()
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			lLanguage=this.lTHAExtendedWarrantyQuotationInputUtil.inputLanguage(lLanguage)
			lResult=lLanguage.length()>0
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(3)
				lLanguage=this.lTHAExtendedWarrantyQuotationInputUtil.inputLanguage(lLanguage)
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(5)
				lLanguage=this.lTHAExtendedWarrantyQuotationInputUtil.inputLanguage(lLanguage)
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(7)
				lLanguage=this.lTHAExtendedWarrantyQuotationInputUtil.inputLanguage(lLanguage)
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				lLanguage=''
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
			lCarMake=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			Map lMapCarMake=this.lTHAExtendedWarrantyQuotationInputUtil.inputCarMake(lCarMake)
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
			lCarModel=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			Map lMapCarModel=this.lTHAExtendedWarrantyQuotationInputUtil.inputCarModel(lCarModel)
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
			lCarYear=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			Map lMapCarYear=this.lTHAExtendedWarrantyQuotationInputUtil.inputCarYear(lCarYear)
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
	public Map inputCarSubmodel(String strSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			Map lMapCarSubmodel=this.lTHAExtendedWarrantyQuotationInputUtil.inputCarSubmodel(lCarSubmodel)
			if(!lMapCarSubmodel.Result){
				lCarSubmodel=''
			}else{
				lCarSubmodel=lMapCarSubmodel.CarSubmodel
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
	public Map inputCarOdometerReading(String strCarOdometerReading){
		Map lreturn=[:]
		String lCarOdometerReading=strCarOdometerReading.trim()
		if(lCarOdometerReading.length()<=0){
			lCarOdometerReading=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_CAR_ODOMETER_READING
		}
		try{
			Boolean lResult=false
			lreturn.put('CarOdometerReading','')
			lreturn.put('Result',lResult)
			Map lMapCarOdometerReading=this.lTHAExtendedWarrantyQuotationInputUtil.inputCarOdometerReading(lCarOdometerReading)
			if(!lMapCarOdometerReading.Result){
				lCarOdometerReading=''
			}else{
				lCarOdometerReading=lMapCarOdometerReading.CarOdometerReading
			}
			lResult=lCarOdometerReading.length()>0
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
	public Map inputInsuredGenderAndMaritalStatus(String strInsuredGenderAndMaritalStatus){
		Map lreturn=[:]
		String lInsuredGenderAndMaritalStatus=strInsuredGenderAndMaritalStatus.trim()
		if(lInsuredGenderAndMaritalStatus.length()<=0){
			lInsuredGenderAndMaritalStatus=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			Map lMapInsuredGenderAndMaritalStatus=this.lTHAExtendedWarrantyQuotationInputUtil.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
			if(!lMapInsuredGenderAndMaritalStatus.Result){
				lInsuredGenderAndMaritalStatus=''
			}else{
				lInsuredGenderAndMaritalStatus=lMapInsuredGenderAndMaritalStatus.InsuredGenderAndMaritalStatus
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
		String lInsuredPostalCode=strInsuredPostalCode.trim()
		if(lInsuredPostalCode.length()<=0){
			lInsuredPostalCode=THARGPAExtendedWarrantyQuotationInputType.DEFAULT_INSURED_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredPostalCode','')
			lreturn.put('Result',lResult)
			Map lMapInsuredPostalCode=this.lTHAExtendedWarrantyQuotationInputUtil.inputInsuredPostalCode(lInsuredPostalCode)
			if(!lMapInsuredPostalCode.Result){
				lInsuredPostalCode=''
			}else{
				lInsuredPostalCode=lMapInsuredPostalCode.InsuredPostalCode
			}
			lResult=lInsuredPostalCode.length()>0
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
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			Map lMapPolicyInsurer=this.lTHAExtendedWarrantyQuotationInputUtil.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			lResult=lPolicyInsurer.length()>0
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
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Map lMapActualResult=this.lTHAExtendedWarrantyQuotationInputUtil.inputActualResult(isPositiveCase)
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
}