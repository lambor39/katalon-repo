package org.roojai.tha.types.roojaipersonalaccident
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAPersonalAccidentQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAPersonalAccidentQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Map inputVersion(String strBaseUrl,String strVersion){
		Map lreturn=[:]
		String lBaseUrl=strBaseUrl.trim()
		if(lBaseUrl.length()<=0){
			lBaseUrl=THAPersonalAccidentQuotationInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAPersonalAccidentQuotationInputType.DEFAULT_VERSION
		String lVersion=strVersion.trim()
		if(lVersion.length()<=0){
			lVersion=lDefaultVersion
		}
		try{
			Boolean lResult=false
			lreturn.put('Version','')
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
			this.driver.get(lBaseUrl+'&abtesting='+lVersion)
			IGNUemaHelper.delayThreadSecond(3)
			this.driver.get(lBaseUrl+'&abtesting='+lVersion)
			IGNUemaHelper.delayThreadSecond(5)
			lVersionOutput=lVersion.toUpperCase()
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
	public Boolean inputInputFromCmsMain(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lCmsLanguage=caseInput.CmsLanguage.toString().trim()
		String lCmsGenderAndMaritalStatus=caseInput.CmsGenderAndMaritalStatus.toString().trim()
		String lCmsBirthDateMain=caseInput.CmsBirthDateMain.toString().trim()
		String lCmsInsuredOccupation=caseInput.CmsInsuredOccupation.toString().trim()
		String lCmsInsuredSalary=caseInput.CmsInsuredSalary.toString().trim()
		String lCmsKeepDetail=caseInput.CmsKeepDetail.toString().trim()
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredBirthDate=caseInput.InsuredBirthDate.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lQueryPersonalAccidentInsurance=caseInput.QueryPersonalAccidentInsurance.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryAccidentOrInjury=caseInput.QueryAccidentOrInjury.toString().trim()
		String lQueryReceivedMedicalTreatment=caseInput.QueryReceivedMedicalTreatment.toString().trim()
		String lQueryHypertensionBloodPositive=caseInput.QueryHypertensionBloodPositive.toString().trim()
		String lQueryOtherQuestion01=caseInput.QueryOtherQuestion01.toString().trim()
		String lQueryOtherQuestion02=caseInput.QueryOtherQuestion02.toString().trim()
		String lQueryOtherQuestion03=caseInput.QueryOtherQuestion03.toString().trim()
		String lQueryOtherQuestion04=caseInput.QueryOtherQuestion04.toString().trim()
		String lQueryOtherQuestion05=caseInput.QueryOtherQuestion05.toString().trim()
		String lQueryOtherQuestion06=caseInput.QueryOtherQuestion06.toString().trim()
		String lQueryOtherQuestion07=caseInput.QueryOtherQuestion07.toString().trim()
		String lQueryOtherQuestion08=caseInput.QueryOtherQuestion08.toString().trim()
		String lQueryOtherQuestion09=caseInput.QueryOtherQuestion09.toString().trim()
		String lQueryOtherQuestion10=caseInput.QueryOtherQuestion10.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			/*Map lMapVersion=this.inputVersion(lBaseUrl,lVersion)
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
			 this.waitUntilLoaded()
			}*/
			Boolean lIsCmsMainProductPersonalAccident=false
			String lTagCmsMainProductButton=''
			String lLocatorCmsMainProductButton='#product-link a'
			List<WebElement> lElementCmsMainProductButtontList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCmsMainProductButton)
			if(!lElementCmsMainProductButtontList){
				return lreturn
			}
			if(lElementCmsMainProductButtontList){
				for(WebElement lElementCmsMainProductButtontItem in lElementCmsMainProductButtontList){
					String lCmsMainProductButtontHrefText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsMainProductButtontItem,'href')
					lIsCmsMainProductPersonalAccident=IGNUemaHelper.checkStringContainString(lCmsMainProductButtontHrefText,'productType=PA')
					if(lIsCmsMainProductPersonalAccident){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsMainProductButtontItem)
						break
					}
				}
				if(!lIsCmsMainProductPersonalAccident){
					return lreturn
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
					lVersion=IGNUemaHelper.CURRENT_AB_TESTING_VERSION
					caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,'ActualVersion:'+lVersion)
				}
			}
			Map lMapCmsKeepDetail=this.inputCmsKeepDetail(lCmsKeepDetail,lCmsLanguage,lCmsGenderAndMaritalStatus,lCmsBirthDateMain,lCmsInsuredOccupation,lCmsInsuredSalary)
			if(!lMapCmsKeepDetail.Result){
				lCmsKeepDetail=''
				lCmsPostLanguage=''
				lCmsPostGenderAndMaritalStatus=''
				lCmsPostBirthDateMain=''
				lCmsPostInsuredOccupation=''
				lCmsPostInsuredSalary=''
			}else{
				lCmsKeepDetail=lMapCmsKeepDetail.CmsKeepDetail
				lCmsPostLanguage=lMapCmsKeepDetail.CmsPostLanguage
				lCmsPostGenderAndMaritalStatus=lMapCmsKeepDetail.CmsPostGenderAndMaritalStatus
				lCmsPostBirthDateMain=lMapCmsKeepDetail.CmsPostBirthDateMain
				lCmsPostInsuredOccupation=lMapCmsKeepDetail.CmsPostInsuredOccupation
				lCmsPostInsuredSalary=lMapCmsKeepDetail.CmsPostInsuredSalary
			}
			caseOutput.CmsKeepDetail=lCmsKeepDetail
			caseOutput.CmsPostLanguage=lCmsPostLanguage
			caseOutput.CmsPostGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
			caseOutput.CmsPostBirthDateMain=lCmsPostBirthDateMain
			caseOutput.CmsPostInsuredOccupation=lCmsPostInsuredOccupation
			caseOutput.CmsPostInsuredSalary=lCmsPostInsuredSalary
			if(!lMapCmsKeepDetail.Result){
				return lreturn
			}
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			if(lIsCmsKeepDetail){
				lLanguage=lCmsPostLanguage
				lInsuredGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
				lInsuredBirthDate=lCmsPostBirthDateMain
				lInsuredOccupation=lCmsPostInsuredOccupation
				lInsuredSalary=lCmsPostInsuredSalary
				caseOutput.Language=lLanguage
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				caseOutput.InsuredBirthDate=lInsuredBirthDate
				caseOutput.InsuredOccupation=lInsuredOccupation
				caseOutput.InsuredSalary=lInsuredSalary
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
					Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
					if(!lMapInsuredBirthDate.Result){
						lInsuredBirthDate=''
					}else{
						lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
					}
					caseOutput.InsuredBirthDate=lInsuredBirthDate
					if(lInsuredBirthDate.length()<=0){
						return lreturn
					}
					Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
					if(!lMapInsuredOccupation.Result){
						lInsuredOccupation=''
					}else{
						lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
					}
					caseOutput.InsuredOccupation=lInsuredOccupation
					if(lInsuredOccupation.length()<=0){
						return lreturn
					}
					Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
					if(!lMapInsuredSalary.Result){
						lInsuredSalary=''
					}else{
						lInsuredSalary=lMapInsuredSalary.InsuredSalary
					}
					caseOutput.InsuredSalary=lInsuredSalary
					if(lInsuredSalary.length()<=0){
						return lreturn
					}
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryPersonalAccidentInsurance=''
						lQueryInsuredDeniedCoverage=''
						lQueryAccidentOrInjury=''
						lQueryReceivedMedicalTreatment=''
						lQueryHypertensionBloodPositive=''
						lQueryOtherQuestion01=''
						lQueryOtherQuestion02=''
						lQueryOtherQuestion03=''
						lQueryOtherQuestion04=''
						lQueryOtherQuestion05=''
						lQueryOtherQuestion06=''
						lQueryOtherQuestion07=''
						lQueryOtherQuestion08=''
						lQueryOtherQuestion09=''
						lQueryOtherQuestion10=''
					}else{
						lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
						lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
						lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
						lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
						lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
						lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
						lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
						lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
						lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
						lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
						lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
						lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
						lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
					}
					caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
					caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
					caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
					caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
					caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
					caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
					caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
					caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
					caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
					caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
					caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
					caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
					caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
					if(!lMapQueryQuestion.Result){
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
					Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
					if(!lMapInsuredBirthDate.Result){
						lInsuredBirthDate=''
					}else{
						lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
					}
					caseOutput.InsuredBirthDate=lInsuredBirthDate
					if(lInsuredBirthDate.length()<=0){
						return lreturn
					}
					Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
					if(!lMapInsuredOccupation.Result){
						lInsuredOccupation=''
					}else{
						lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
					}
					caseOutput.InsuredOccupation=lInsuredOccupation
					if(lInsuredOccupation.length()<=0){
						return lreturn
					}
					Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
					if(!lMapInsuredSalary.Result){
						lInsuredSalary=''
					}else{
						lInsuredSalary=lMapInsuredSalary.InsuredSalary
					}
					caseOutput.InsuredSalary=lInsuredSalary
					if(lInsuredSalary.length()<=0){
						return lreturn
					}
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryPersonalAccidentInsurance=''
						lQueryInsuredDeniedCoverage=''
						lQueryAccidentOrInjury=''
						lQueryReceivedMedicalTreatment=''
						lQueryHypertensionBloodPositive=''
						lQueryOtherQuestion01=''
						lQueryOtherQuestion02=''
						lQueryOtherQuestion03=''
						lQueryOtherQuestion04=''
						lQueryOtherQuestion05=''
						lQueryOtherQuestion06=''
						lQueryOtherQuestion07=''
						lQueryOtherQuestion08=''
						lQueryOtherQuestion09=''
						lQueryOtherQuestion10=''
					}else{
						lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
						lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
						lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
						lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
						lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
						lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
						lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
						lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
						lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
						lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
						lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
						lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
						lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
					}
					caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
					caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
					caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
					caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
					caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
					caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
					caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
					caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
					caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
					caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
					caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
					caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
					caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
					if(!lMapQueryQuestion.Result){
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
		}catch(Exception e){
			e.printStackTrace()
			lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,e.getMessage())
			caseOutput.ResultMessage=lResultMessage
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInputFromCmsMini(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lCmsLanguage=caseInput.CmsLanguage.toString().trim()
		String lCmsGenderAndMaritalStatus=caseInput.CmsGenderAndMaritalStatus.toString().trim()
		String lCmsBirthDateMain=caseInput.CmsBirthDateMain.toString().trim()
		String lCmsInsuredOccupation=caseInput.CmsInsuredOccupation.toString().trim()
		String lCmsInsuredSalary=caseInput.CmsInsuredSalary.toString().trim()
		String lCmsKeepDetail=caseInput.CmsKeepDetail.toString().trim()
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredBirthDate=caseInput.InsuredBirthDate.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lQueryPersonalAccidentInsurance=caseInput.QueryPersonalAccidentInsurance.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryAccidentOrInjury=caseInput.QueryAccidentOrInjury.toString().trim()
		String lQueryReceivedMedicalTreatment=caseInput.QueryReceivedMedicalTreatment.toString().trim()
		String lQueryHypertensionBloodPositive=caseInput.QueryHypertensionBloodPositive.toString().trim()
		String lQueryOtherQuestion01=caseInput.QueryOtherQuestion01.toString().trim()
		String lQueryOtherQuestion02=caseInput.QueryOtherQuestion02.toString().trim()
		String lQueryOtherQuestion03=caseInput.QueryOtherQuestion03.toString().trim()
		String lQueryOtherQuestion04=caseInput.QueryOtherQuestion04.toString().trim()
		String lQueryOtherQuestion05=caseInput.QueryOtherQuestion05.toString().trim()
		String lQueryOtherQuestion06=caseInput.QueryOtherQuestion06.toString().trim()
		String lQueryOtherQuestion07=caseInput.QueryOtherQuestion07.toString().trim()
		String lQueryOtherQuestion08=caseInput.QueryOtherQuestion08.toString().trim()
		String lQueryOtherQuestion09=caseInput.QueryOtherQuestion09.toString().trim()
		String lQueryOtherQuestion10=caseInput.QueryOtherQuestion10.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			/*Map lMapVersion=this.inputVersion(lBaseUrl,lVersion)
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
			 this.waitUntilLoaded()
			}*/
			String lStartQuoteButton='#main .section-header a.btn'
			WebElement lElementStartQuoteButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lStartQuoteButton)
			if(lElementStartQuoteButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementStartQuoteButton)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementStartQuoteButton)
				IGNUemaHelper.delayThreadSecond(5)
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
			Map lMapCmsKeepDetail=this.inputCmsKeepDetail(lCmsKeepDetail,lCmsLanguage,lCmsGenderAndMaritalStatus,lCmsBirthDateMain,lCmsInsuredOccupation,lCmsInsuredSalary)
			if(!lMapCmsKeepDetail.Result){
				lCmsKeepDetail=''
				lCmsPostLanguage=''
				lCmsPostGenderAndMaritalStatus=''
				lCmsPostBirthDateMain=''
				lCmsPostInsuredOccupation=''
				lCmsPostInsuredSalary=''
			}else{
				lCmsKeepDetail=lMapCmsKeepDetail.CmsKeepDetail
				lCmsPostLanguage=lMapCmsKeepDetail.CmsPostLanguage
				lCmsPostGenderAndMaritalStatus=lMapCmsKeepDetail.CmsPostGenderAndMaritalStatus
				lCmsPostBirthDateMain=lMapCmsKeepDetail.CmsPostBirthDateMain
				lCmsPostInsuredOccupation=lMapCmsKeepDetail.CmsPostInsuredOccupation
				lCmsPostInsuredSalary=lMapCmsKeepDetail.CmsPostInsuredSalary
			}
			caseOutput.CmsKeepDetail=lCmsKeepDetail
			caseOutput.CmsPostLanguage=lCmsPostLanguage
			caseOutput.CmsPostGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
			caseOutput.CmsPostBirthDateMain=lCmsPostBirthDateMain
			caseOutput.CmsPostInsuredOccupation=lCmsPostInsuredOccupation
			caseOutput.CmsPostInsuredSalary=lCmsPostInsuredSalary
			if(!lMapCmsKeepDetail.Result){
				return lreturn
			}
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			if(lIsCmsKeepDetail){
				lLanguage=lCmsPostLanguage
				lInsuredGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
				lInsuredBirthDate=lCmsPostBirthDateMain
				lInsuredOccupation=lCmsPostInsuredOccupation
				lInsuredSalary=lCmsPostInsuredSalary
				caseOutput.Language=lLanguage
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				caseOutput.InsuredBirthDate=lInsuredBirthDate
				caseOutput.InsuredOccupation=lInsuredOccupation
				caseOutput.InsuredSalary=lInsuredSalary
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
					Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
					if(!lMapInsuredBirthDate.Result){
						lInsuredBirthDate=''
					}else{
						lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
					}
					caseOutput.InsuredBirthDate=lInsuredBirthDate
					if(lInsuredBirthDate.length()<=0){
						return lreturn
					}
					Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
					if(!lMapInsuredOccupation.Result){
						lInsuredOccupation=''
					}else{
						lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
					}
					caseOutput.InsuredOccupation=lInsuredOccupation
					if(lInsuredOccupation.length()<=0){
						return lreturn
					}
					Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
					if(!lMapInsuredSalary.Result){
						lInsuredSalary=''
					}else{
						lInsuredSalary=lMapInsuredSalary.InsuredSalary
					}
					caseOutput.InsuredSalary=lInsuredSalary
					if(lInsuredSalary.length()<=0){
						return lreturn
					}
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryPersonalAccidentInsurance=''
						lQueryInsuredDeniedCoverage=''
						lQueryAccidentOrInjury=''
						lQueryReceivedMedicalTreatment=''
						lQueryHypertensionBloodPositive=''
						lQueryOtherQuestion01=''
						lQueryOtherQuestion02=''
						lQueryOtherQuestion03=''
						lQueryOtherQuestion04=''
						lQueryOtherQuestion05=''
						lQueryOtherQuestion06=''
						lQueryOtherQuestion07=''
						lQueryOtherQuestion08=''
						lQueryOtherQuestion09=''
						lQueryOtherQuestion10=''
					}else{
						lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
						lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
						lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
						lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
						lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
						lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
						lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
						lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
						lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
						lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
						lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
						lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
						lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
					}
					caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
					caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
					caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
					caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
					caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
					caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
					caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
					caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
					caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
					caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
					caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
					caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
					caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
					if(!lMapQueryQuestion.Result){
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
							Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
							if(!lMapInsuredBirthDate.Result){
								lInsuredBirthDate=''
							}else{
								lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
							}
							caseOutput.InsuredBirthDate=lInsuredBirthDate
							if(lInsuredBirthDate.length()<=0){
								return lreturn
							}
							Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
							if(!lMapInsuredOccupation.Result){
								lInsuredOccupation=''
							}else{
								lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
							}
							caseOutput.InsuredOccupation=lInsuredOccupation
							if(lInsuredOccupation.length()<=0){
								return lreturn
							}
							Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
							if(!lMapInsuredSalary.Result){
								lInsuredSalary=''
							}else{
								lInsuredSalary=lMapInsuredSalary.InsuredSalary
							}
							caseOutput.InsuredSalary=lInsuredSalary
							if(lInsuredSalary.length()<=0){
								return lreturn
							}
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryPersonalAccidentInsurance=''
								lQueryInsuredDeniedCoverage=''
								lQueryAccidentOrInjury=''
								lQueryReceivedMedicalTreatment=''
								lQueryHypertensionBloodPositive=''
								lQueryOtherQuestion01=''
								lQueryOtherQuestion02=''
								lQueryOtherQuestion03=''
								lQueryOtherQuestion04=''
								lQueryOtherQuestion05=''
								lQueryOtherQuestion06=''
								lQueryOtherQuestion07=''
								lQueryOtherQuestion08=''
								lQueryOtherQuestion09=''
								lQueryOtherQuestion10=''
							}else{
								lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
								lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
								lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
								lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
								lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
								lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
								lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
								lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
								lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
								lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
								lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
								lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
								lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
							}
							caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
							caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
							caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
							caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
							caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
							caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
							caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
							caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
							caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
							caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
							caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
							caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
							caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
							if(!lMapQueryQuestion.Result){
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
					Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
					if(!lMapInsuredBirthDate.Result){
						lInsuredBirthDate=''
					}else{
						lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
					}
					caseOutput.InsuredBirthDate=lInsuredBirthDate
					if(lInsuredBirthDate.length()<=0){
						return lreturn
					}
					Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
					if(!lMapInsuredOccupation.Result){
						lInsuredOccupation=''
					}else{
						lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
					}
					caseOutput.InsuredOccupation=lInsuredOccupation
					if(lInsuredOccupation.length()<=0){
						return lreturn
					}
					Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
					if(!lMapInsuredSalary.Result){
						lInsuredSalary=''
					}else{
						lInsuredSalary=lMapInsuredSalary.InsuredSalary
					}
					caseOutput.InsuredSalary=lInsuredSalary
					if(lInsuredSalary.length()<=0){
						return lreturn
					}
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryPersonalAccidentInsurance=''
						lQueryInsuredDeniedCoverage=''
						lQueryAccidentOrInjury=''
						lQueryReceivedMedicalTreatment=''
						lQueryHypertensionBloodPositive=''
						lQueryOtherQuestion01=''
						lQueryOtherQuestion02=''
						lQueryOtherQuestion03=''
						lQueryOtherQuestion04=''
						lQueryOtherQuestion05=''
						lQueryOtherQuestion06=''
						lQueryOtherQuestion07=''
						lQueryOtherQuestion08=''
						lQueryOtherQuestion09=''
						lQueryOtherQuestion10=''
					}else{
						lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
						lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
						lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
						lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
						lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
						lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
						lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
						lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
						lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
						lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
						lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
						lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
						lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
					}
					caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
					caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
					caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
					caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
					caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
					caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
					caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
					caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
					caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
					caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
					caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
					caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
					caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
					if(!lMapQueryQuestion.Result){
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
		}catch(Exception e){
			e.printStackTrace()
			lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,e.getMessage())
			caseOutput.ResultMessage=lResultMessage
			return lreturn
		}
		return lreturn
	}
	public Boolean inputInputFromProduct(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredBirthDate=caseInput.InsuredBirthDate.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lQueryPersonalAccidentInsurance=caseInput.QueryPersonalAccidentInsurance.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryAccidentOrInjury=caseInput.QueryAccidentOrInjury.toString().trim()
		String lQueryReceivedMedicalTreatment=caseInput.QueryReceivedMedicalTreatment.toString().trim()
		String lQueryHypertensionBloodPositive=caseInput.QueryHypertensionBloodPositive.toString().trim()
		String lQueryOtherQuestion01=caseInput.QueryOtherQuestion01.toString().trim()
		String lQueryOtherQuestion02=caseInput.QueryOtherQuestion02.toString().trim()
		String lQueryOtherQuestion03=caseInput.QueryOtherQuestion03.toString().trim()
		String lQueryOtherQuestion04=caseInput.QueryOtherQuestion04.toString().trim()
		String lQueryOtherQuestion05=caseInput.QueryOtherQuestion05.toString().trim()
		String lQueryOtherQuestion06=caseInput.QueryOtherQuestion06.toString().trim()
		String lQueryOtherQuestion07=caseInput.QueryOtherQuestion07.toString().trim()
		String lQueryOtherQuestion08=caseInput.QueryOtherQuestion08.toString().trim()
		String lQueryOtherQuestion09=caseInput.QueryOtherQuestion09.toString().trim()
		String lQueryOtherQuestion10=caseInput.QueryOtherQuestion10.toString().trim()
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
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
				this.waitUntilLoaded()
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
						Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
						if(!lMapInsuredBirthDate.Result){
							lInsuredBirthDate=''
						}else{
							lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
						}
						caseOutput.InsuredBirthDate=lInsuredBirthDate
						if(lInsuredBirthDate.length()<=0){
							return lreturn
						}
						Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
						if(!lMapInsuredOccupation.Result){
							lInsuredOccupation=''
						}else{
							lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
						}
						caseOutput.InsuredOccupation=lInsuredOccupation
						if(lInsuredOccupation.length()<=0){
							return lreturn
						}
						Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
						if(!lMapInsuredSalary.Result){
							lInsuredSalary=''
						}else{
							lInsuredSalary=lMapInsuredSalary.InsuredSalary
						}
						caseOutput.InsuredSalary=lInsuredSalary
						if(lInsuredSalary.length()<=0){
							return lreturn
						}
						Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
						if(!lMapQueryQuestion.Result){
							lQueryPersonalAccidentInsurance=''
							lQueryInsuredDeniedCoverage=''
							lQueryAccidentOrInjury=''
							lQueryReceivedMedicalTreatment=''
							lQueryHypertensionBloodPositive=''
							lQueryOtherQuestion01=''
							lQueryOtherQuestion02=''
							lQueryOtherQuestion03=''
							lQueryOtherQuestion04=''
							lQueryOtherQuestion05=''
							lQueryOtherQuestion06=''
							lQueryOtherQuestion07=''
							lQueryOtherQuestion08=''
							lQueryOtherQuestion09=''
							lQueryOtherQuestion10=''
						}else{
							lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
							lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
							lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
							lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
							lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
							lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
							lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
							lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
							lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
							lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
							lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
							lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
							lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
							lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
							lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
						}
						caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
						caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
						caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
						caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
						caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
						caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
						caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
						caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
						caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
						caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
						caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
						caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
						caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
						caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
						caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
						if(!lMapQueryQuestion.Result){
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
						Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
						if(!lMapInsuredBirthDate.Result){
							lInsuredBirthDate=''
						}else{
							lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
						}
						caseOutput.InsuredBirthDate=lInsuredBirthDate
						if(lInsuredBirthDate.length()<=0){
							return lreturn
						}
						Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
						if(!lMapInsuredOccupation.Result){
							lInsuredOccupation=''
						}else{
							lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
						}
						caseOutput.InsuredOccupation=lInsuredOccupation
						if(lInsuredOccupation.length()<=0){
							return lreturn
						}
						Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
						if(!lMapInsuredSalary.Result){
							lInsuredSalary=''
						}else{
							lInsuredSalary=lMapInsuredSalary.InsuredSalary
						}
						caseOutput.InsuredSalary=lInsuredSalary
						if(lInsuredSalary.length()<=0){
							return lreturn
						}
						Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
						if(!lMapQueryQuestion.Result){
							lQueryPersonalAccidentInsurance=''
							lQueryInsuredDeniedCoverage=''
							lQueryAccidentOrInjury=''
							lQueryReceivedMedicalTreatment=''
							lQueryHypertensionBloodPositive=''
							lQueryOtherQuestion01=''
							lQueryOtherQuestion02=''
							lQueryOtherQuestion03=''
							lQueryOtherQuestion04=''
							lQueryOtherQuestion05=''
							lQueryOtherQuestion06=''
							lQueryOtherQuestion07=''
							lQueryOtherQuestion08=''
							lQueryOtherQuestion09=''
							lQueryOtherQuestion10=''
						}else{
							lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
							lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
							lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
							lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
							lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
							lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
							lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
							lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
							lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
							lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
							lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
							lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
							lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
							lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
							lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
						}
						caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
						caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
						caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
						caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
						caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
						caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
						caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
						caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
						caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
						caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
						caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
						caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
						caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
						caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
						caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
						if(!lMapQueryQuestion.Result){
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
				Map lMapInsuredBirthDate=this.inputInsuredBirthDate(lInsuredBirthDate)
				if(!lMapInsuredBirthDate.Result){
					lInsuredBirthDate=''
				}else{
					lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
				}
				caseOutput.InsuredBirthDate=lInsuredBirthDate
				if(lInsuredBirthDate.length()<=0){
					return lreturn
				}
				Map lMapInsuredOccupation=this.inputInsuredOccupation(lInsuredOccupation)
				if(!lMapInsuredOccupation.Result){
					lInsuredOccupation=''
				}else{
					lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
				}
				caseOutput.InsuredOccupation=lInsuredOccupation
				if(lInsuredOccupation.length()<=0){
					return lreturn
				}
				Map lMapInsuredSalary=this.inputInsuredSalary(lInsuredSalary)
				if(!lMapInsuredSalary.Result){
					lInsuredSalary=''
				}else{
					lInsuredSalary=lMapInsuredSalary.InsuredSalary
				}
				caseOutput.InsuredSalary=lInsuredSalary
				if(lInsuredSalary.length()<=0){
					return lreturn
				}
				Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
				if(!lMapQueryQuestion.Result){
					lQueryPersonalAccidentInsurance=''
					lQueryInsuredDeniedCoverage=''
					lQueryAccidentOrInjury=''
					lQueryReceivedMedicalTreatment=''
					lQueryHypertensionBloodPositive=''
					lQueryOtherQuestion01=''
					lQueryOtherQuestion02=''
					lQueryOtherQuestion03=''
					lQueryOtherQuestion04=''
					lQueryOtherQuestion05=''
					lQueryOtherQuestion06=''
					lQueryOtherQuestion07=''
					lQueryOtherQuestion08=''
					lQueryOtherQuestion09=''
					lQueryOtherQuestion10=''
				}else{
					lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
					lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
					lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
					lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
					lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
					lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
					lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
					lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
					lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
					lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
					lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
					lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
					lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
					lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
					lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
				}
				caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
				caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
				caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
				caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
				caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
				caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
				caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
				caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
				caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
				caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
				caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
				caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
				caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
				caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
				caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
				if(!lMapQueryQuestion.Result){
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
			lPositiveCase=THAPersonalAccidentQuotationInputType.DEFAULT_POSITIVE_CASE
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
	public Map inputCmsLanguage(String strCmsLanguage){
		Map lreturn=[:]
		String lCmsLanguage=strCmsLanguage.trim()
		if(lCmsLanguage.length()<=0){
			lCmsLanguage=THAPersonalAccidentQuotationInputType.DEFAULT_CMS_LANGUAGE
		}
		Map lCmsLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('CmsLanguage','')
			lreturn.put('Result',lResult)
			String lCmsLanguageItem=lCmsLanguageList.get(lCmsLanguage)
			if(!lCmsLanguageItem){
				lCmsLanguageItem=lCmsLanguageList.get(THAPersonalAccidentQuotationInputType.DEFAULT_CMS_LANGUAGE)
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
					lCmsLanguageItem=lCmsLanguageList.get(THAPersonalAccidentQuotationInputType.DEFAULT_CMS_LANGUAGE)
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
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,10)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,10)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToBottom(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,10)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,10)
			}

			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,10)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(1)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,5)
			}
			if(!lIsClassPDPAFormDisplayed){
				IGNUemaHelper.delayThreadSecond(3)
				lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPDPAForm,10)
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
	public Map inputCmsGenderAndMaritalStatus(String strCmsGenderAndMaritalStatus){
		Map lreturn=[:]
		String lCmsGenderAndMaritalStatus=strCmsGenderAndMaritalStatus.trim()
		if(lCmsGenderAndMaritalStatus.length()<=0){
			lCmsGenderAndMaritalStatus=THAPersonalAccidentQuotationInputType.DEFAULT_CMS_GENDER_AND_MARITAL_STATUS
		}
		Map lCmsGenderAndMaritalStatusList=['1':'Male','2':'Female']
		try{
			Boolean lResult=false
			lreturn.put('CmsGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lCmsGenderAndMaritalStatusItem=lCmsGenderAndMaritalStatusList.get(lCmsGenderAndMaritalStatus)
			if(!lCmsGenderAndMaritalStatusItem){
				lCmsGenderAndMaritalStatusItem=lCmsGenderAndMaritalStatusList.get(THAPersonalAccidentQuotationInputType.DEFAULT_CMS_GENDER_AND_MARITAL_STATUS)
			}
			lCmsGenderAndMaritalStatus=''
			String lTagCmsGenderAndMaritalStatusButtonKey='gender'
			String lTagCmsGenderAndMaritalStatusButtonValue=lCmsGenderAndMaritalStatusItem
			String lLocatorCmsGenderAndMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCmsGenderAndMaritalStatusButtonKey,lTagCmsGenderAndMaritalStatusButtonValue)
			WebElement lElementCmsGenderAndMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCmsGenderAndMaritalStatusButtonKey,lTagCmsGenderAndMaritalStatusButtonValue)
			if(!lElementCmsGenderAndMaritalStatusButton){
				return lreturn
			}else{
				String lCmsGenderAndMaritalStatusText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsGenderAndMaritalStatusButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsGenderAndMaritalStatusButton)){
					lCmsGenderAndMaritalStatus=lCmsGenderAndMaritalStatusText
				}
			}
			lResult=lCmsGenderAndMaritalStatus.length()>0
			if(lResult){
				lreturn.put('CmsGenderAndMaritalStatus',lCmsGenderAndMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsBirthDateMain(String strCmsBirthDateMain){
		Map lreturn=[:]
		String lCmsBirthDateMain=strCmsBirthDateMain.trim()
		if(lCmsBirthDateMain.length()<=0){
			lCmsBirthDateMain=THAPersonalAccidentQuotationInputType.DEFAULT_CMS_BIRTH_DATE_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsBirthDateMain','')
			lreturn.put('Result',lResult)
			String lCmsBirthDateMainDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lCmsBirthDateMain)
			String lCmsBirthDateMainMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lCmsBirthDateMain)
			String lCmsBirthDateMainYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lCmsBirthDateMain)
			lCmsBirthDateMain=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lCmsBirthDateMainDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lCmsBirthDateMainDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lCmsBirthDateMainMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lCmsBirthDateMainMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lCmsBirthDateMainYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lCmsBirthDateMainYYYY)
			lCmsBirthDateMain=lCmsBirthDateMainDD+'/'+lCmsBirthDateMainMM+'/'+lCmsBirthDateMainYYYY
			String lTagButtonNext='dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			if(lResult){
				lreturn.put('CmsBirthDateMain',lCmsBirthDateMain)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsInsuredOccupation(String strCmsInsuredOccupation){
		Map lreturn=[:]
		String lCmsInsuredOccupation=strCmsInsuredOccupation.trim()
		if(lCmsInsuredOccupation.length()<=0){
			lCmsInsuredOccupation=THAPersonalAccidentQuotationInputType.DEFAULT_CMS_INSURED_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsInsuredOccupation','')
			lreturn.put('Result',lResult)
			String lTagCmsInsuredOccupationButton='selected-occupation'
			String lLocatorCmsInsuredOccupationButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsInsuredOccupationButton)
			String lTagCmsInsuredOccupationDropdownList='occupation-item'
			String lLocatorCmsInsuredOccupationDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsInsuredOccupationDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorCmsInsuredOccupationButton)
			if(!lValid){
				lCmsInsuredOccupation='No Option'
			}else{
				lCmsInsuredOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCmsInsuredOccupationButton,lTagCmsInsuredOccupationDropdownList,lCmsInsuredOccupation,true)
			}
			String lTagCmsInsuredOccupationButtonNext='occupation-next'
			String lLocatorCmsInsuredOccupationButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsInsuredOccupationButtonNext)
			WebElement lElementCmsInsuredOccupationButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsInsuredOccupationButtonNext)
			if(lElementCmsInsuredOccupationButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsInsuredOccupationButtonNext)
			}
			lResult=lCmsInsuredOccupation.length()>0
			if(lResult){
				lreturn.put('CmsInsuredOccupation',lCmsInsuredOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsInsuredSalary(String strCmsInsuredSalary){
		Map lreturn=[:]
		String lCmsInsuredSalary=strCmsInsuredSalary.trim()
		if(lCmsInsuredSalary.length()<=0){
			lCmsInsuredSalary=THAPersonalAccidentQuotationInputType.DEFAULT_CMS_INSURED_SALARY
		}
		Map lCmsInsuredSalaryList=['0':'0','1':'5000','2':'8000','3':'16000','4':'32000','5':'50000','6':'80000','7':'150000']
		try{
			Boolean lResult=false
			lreturn.put('CmsInsuredSalary','')
			lreturn.put('Result',lResult)
			String lCmsInsuredSalaryItem=lCmsInsuredSalaryList.get(lCmsInsuredSalary)
			if(!lCmsInsuredSalaryItem){
				lCmsInsuredSalaryItem=lCmsInsuredSalaryList.get(THAPersonalAccidentQuotationInputType.DEFAULT_CMS_INSURED_SALARY)
			}
			lCmsInsuredSalary=''
			String lTagSliderInput='slider-income-input'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				//return lreturn
				lCmsInsuredSalary='No Option'
				lResult=lCmsInsuredSalary.length()>0
			}else{
				String lCmsInsuredSalaryInput=lCmsInsuredSalaryItem
				lCmsInsuredSalaryInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lCmsInsuredSalaryInput)
				IGNUemaHelper.delayThreadSecond(1)
				String lTagSliderText='selected-income'
				String lLocatorSliderText=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderText)
				WebElement lElementSliderText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderText)
				if(!lElementSliderText){
					return lreturn
				}
				String lCmsInsuredSalaryText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderText).trim()
				IGNUemaHelper.printLog('lCmsInsuredSalaryNum:'+lCmsInsuredSalaryText)
				lCmsInsuredSalaryText='CmsInsuredSalaryNum='+lCmsInsuredSalaryText+'|ValueText='+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementSliderText).trim()
				lCmsInsuredSalary=lCmsInsuredSalaryText
				String lTagCmsInsuredSalaryNext='income-next'
				String lLocatorCmsInsuredSalaryNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsInsuredSalaryNext)
				WebElement lElementCmsInsuredSalaryNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsInsuredSalaryNext)
				if(lElementCmsInsuredSalaryNext){
					lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsInsuredSalaryNext)
				}
				lResult=lResult&&(lCmsInsuredSalary.length()>0)
			}
			if(lResult){
				lreturn.put('CmsInsuredSalary',lCmsInsuredSalary)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsKeepDetail(String strCmsKeepDetail,String strCmsLanguage,String strCmsGenderAndMaritalStatus,String strCmsBirthDateMain,String strCmsInsuredOccupation,String strCmsInsuredSalary){
		Map lreturn=[:]
		String lCmsKeepDetail=strCmsKeepDetail.trim()
		if(lCmsKeepDetail.length()<=0){
			lCmsKeepDetail=THAPersonalAccidentQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
		}
		String lCmsLanguage=strCmsLanguage.toUpperCase().trim()
		String lCmsGenderAndMaritalStatus=strCmsGenderAndMaritalStatus.trim()
		String lCmsBirthDateMain=strCmsBirthDateMain.trim()
		String lCmsInsuredOccupation=strCmsInsuredOccupation.trim()
		String lCmsInsuredSalary=strCmsInsuredSalary.trim()
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostGenderAndMaritalStatus','')
			lreturn.put('CmsPostBirthDateMain','')
			lreturn.put('CmsPostInsuredOccupation','')
			lreturn.put('CmsPostInsuredSalary','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.delayThreadSecond(3)
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			lCmsKeepDetail=IGNUemaHelper.convertBooleanToString(lIsCmsKeepDetail)
			if(lCmsLanguage.length()<=0){
				return lreturn
			}
			String lTagToCheckMainProductReady='gender'
			String lLocatorToCheckMainProductReady=IGNUemaHelper.getTagDataSeleniumKey(lTagToCheckMainProductReady)
			Boolean lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,20)
			if(!lIsMainProductReady){
				lIsMainProductReady=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorToCheckMainProductReady,20)
			}
			if(!lIsMainProductReady){
				return lreturn
			}
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
			if(lCmsPostLanguage.length()<=0){
				return lreturn
			}

			Boolean lIsDone=false
			Boolean lIsOK=false
			lIsOK=lCmsKeepDetail.length()>0
			lIsDone=lIsOK
			lIsOK=(lCmsLanguage.equalsIgnoreCase(lCmsPostLanguage))
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
				lreturn.put('CmsPostGenderAndMaritalStatus',lCmsPostGenderAndMaritalStatus)
				lreturn.put('CmsPostBirthDateMain',lCmsPostBirthDateMain)
				lreturn.put('CmsPostInsuredOccupation',lCmsPostInsuredOccupation)
				lreturn.put('CmsPostInsuredSalary',lCmsPostInsuredSalary)
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
			lLanguage=THAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE)
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
			lLanguage=THAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE)
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
	public Map inputInsuredGenderAndMaritalStatus(String strInsuredGenderAndMaritalStatus){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputInsuredGenderAndMaritalStatusA(strInsuredGenderAndMaritalStatus)
						break
					case 'B':
						lreturn=this.inputInsuredGenderAndMaritalStatusB(strInsuredGenderAndMaritalStatus)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputInsuredGenderAndMaritalStatusA(strInsuredGenderAndMaritalStatus)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredGenderAndMaritalStatusA(String strGenderAndMaritalStatus){
		Map lreturn=[:]
		String lGenderAndMaritalStatus=strGenderAndMaritalStatus.trim()
		if(lGenderAndMaritalStatus.length()<=0){
			lGenderAndMaritalStatus=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		Map lGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(lGenderAndMaritalStatus)
			if(!lGenderAndMaritalStatusItem){
				lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
			}
			lGenderAndMaritalStatus=''
			String lTagGenderAndMaritalStatusButtonKey='gender'
			String lTagGenderAndMaritalStatusButtonValue=lGenderAndMaritalStatusItem
			String lLocatorGenderAndMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagGenderAndMaritalStatusButtonKey,lTagGenderAndMaritalStatusButtonValue)
			WebElement lElementGenderAndMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagGenderAndMaritalStatusButtonKey,lTagGenderAndMaritalStatusButtonValue)
			if(!lElementGenderAndMaritalStatusButton){
				return lreturn
			}else{
				String lGenderAndMaritalStatusText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementGenderAndMaritalStatusButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementGenderAndMaritalStatusButton)){
					lGenderAndMaritalStatus=lGenderAndMaritalStatusText
				}
			}
			lResult=lGenderAndMaritalStatus.length()>0
			if(lResult){
				lreturn.put('InsuredGenderAndMaritalStatus',lGenderAndMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredGenderAndMaritalStatusB(String strGenderAndMaritalStatus){
		Map lreturn=[:]
		String lGenderAndMaritalStatus=strGenderAndMaritalStatus.trim()
		if(lGenderAndMaritalStatus.length()<=0){
			lGenderAndMaritalStatus=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		Map lGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(lGenderAndMaritalStatus)
			if(!lGenderAndMaritalStatusItem){
				lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
			}
			lGenderAndMaritalStatus=''
			String lTagGenderAndMaritalStatusButtonKey='gender'
			String lTagGenderAndMaritalStatusButtonValue=lGenderAndMaritalStatusItem
			String lLocatorGenderAndMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagGenderAndMaritalStatusButtonKey,lTagGenderAndMaritalStatusButtonValue)
			WebElement lElementGenderAndMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagGenderAndMaritalStatusButtonKey,lTagGenderAndMaritalStatusButtonValue)
			if(!lElementGenderAndMaritalStatusButton){
				return lreturn
			}else{
				String lGenderAndMaritalStatusText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementGenderAndMaritalStatusButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementGenderAndMaritalStatusButton)){
					lGenderAndMaritalStatus=lGenderAndMaritalStatusText
				}
			}
			lResult=lGenderAndMaritalStatus.length()>0
			if(lResult){
				lreturn.put('InsuredGenderAndMaritalStatus',lGenderAndMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredBirthDate(String strInsuredBirthDate){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('InsuredBirthDate','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputInsuredBirthDateA(strInsuredBirthDate)
						break
					case 'B':
						lreturn=this.inputInsuredBirthDateB(strInsuredBirthDate)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputInsuredBirthDateA(strInsuredBirthDate)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredBirthDateA(String strInsuredBirthDate){
		Map lreturn=[:]
		String lInsuredBirthDate=strInsuredBirthDate.trim()
		if(lInsuredBirthDate.length()<=0){
			lInsuredBirthDate=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_BIRTH_DATE
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredBirthDate','')
			lreturn.put('Result',lResult)
			String lInsuredBirthDateDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lInsuredBirthDate)
			String lInsuredBirthDateMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lInsuredBirthDate)
			String lInsuredBirthDateYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lInsuredBirthDate)
			lInsuredBirthDate=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lInsuredBirthDateDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lInsuredBirthDateDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lInsuredBirthDateMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lInsuredBirthDateMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lInsuredBirthDateYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lInsuredBirthDateYYYY)
			lInsuredBirthDate=lInsuredBirthDateDD+'/'+lInsuredBirthDateMM+'/'+lInsuredBirthDateYYYY
			String lTagButtonNext='dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			if(lResult){
				lreturn.put('InsuredBirthDate',lInsuredBirthDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredBirthDateB(String strInsuredBirthDate){
		Map lreturn=[:]
		String lInsuredBirthDate=strInsuredBirthDate.trim()
		if(lInsuredBirthDate.length()<=0){
			lInsuredBirthDate=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_BIRTH_DATE
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredBirthDate','')
			lreturn.put('Result',lResult)
			String lInsuredBirthDateDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lInsuredBirthDate)
			String lInsuredBirthDateMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lInsuredBirthDate)
			String lInsuredBirthDateYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lInsuredBirthDate)
			lInsuredBirthDate=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lInsuredBirthDateDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lInsuredBirthDateDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lInsuredBirthDateMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lInsuredBirthDateMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lInsuredBirthDateYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lInsuredBirthDateYYYY)
			lInsuredBirthDate=lInsuredBirthDateDD+'/'+lInsuredBirthDateMM+'/'+lInsuredBirthDateYYYY
			String lTagButtonNext='dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			if(lResult){
				lreturn.put('InsuredBirthDate',lInsuredBirthDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredOccupation(String strInsuredOccupation){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('InsuredOccupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputInsuredOccupationA(strInsuredOccupation)
						break
					case 'B':
						lreturn=this.inputInsuredOccupationB(strInsuredOccupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputInsuredOccupationA(strInsuredOccupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredOccupationA(String strInsuredOccupation){
		Map lreturn=[:]
		String lInsuredOccupation=strInsuredOccupation.trim()
		if(lInsuredOccupation.length()<=0){
			lInsuredOccupation=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredOccupation','')
			lreturn.put('Result',lResult)
			String lTagInsuredOccupationButton='selected-occupation'
			String lLocatorInsuredOccupationButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredOccupationButton)
			String lTagInsuredOccupationDropdownList='occupation-item'
			String lLocatorInsuredOccupationDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredOccupationDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorInsuredOccupationButton)
			if(!lValid){
				lInsuredOccupation='No Option'
			}else{
				lInsuredOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagInsuredOccupationButton,lTagInsuredOccupationDropdownList,lInsuredOccupation,true)
			}
			String lTagInsuredOccupationButtonNext='occupation-next'
			String lLocatorInsuredOccupationButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredOccupationButtonNext)
			WebElement lElementInsuredOccupationButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredOccupationButtonNext)
			if(lElementInsuredOccupationButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredOccupationButtonNext)
			}
			lResult=lInsuredOccupation.length()>0
			if(lResult){
				lreturn.put('InsuredOccupation',lInsuredOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredOccupationB(String strInsuredOccupation){
		Map lreturn=[:]
		String lInsuredOccupation=strInsuredOccupation.trim()
		if(lInsuredOccupation.length()<=0){
			lInsuredOccupation=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredOccupation','')
			lreturn.put('Result',lResult)
			String lTagInsuredOccupationButton='selected-occupation'
			String lLocatorInsuredOccupationButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredOccupationButton)
			String lTagInsuredOccupationDropdownList='occupation-item'
			String lLocatorInsuredOccupationDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredOccupationDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorInsuredOccupationButton)
			if(!lValid){
				lInsuredOccupation='No Option'
			}else{
				lInsuredOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagInsuredOccupationButton,lTagInsuredOccupationDropdownList,lInsuredOccupation,true)
			}
			String lTagInsuredOccupationButtonNext='occupation-next'
			String lLocatorInsuredOccupationButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredOccupationButtonNext)
			WebElement lElementInsuredOccupationButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredOccupationButtonNext)
			if(lElementInsuredOccupationButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredOccupationButtonNext)
			}
			lResult=lInsuredOccupation.length()>0
			if(lResult){
				lreturn.put('InsuredOccupation',lInsuredOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredSalary(String strInsuredSalary){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputInsuredSalaryA(strInsuredSalary)
						break
					case 'B':
						lreturn=this.inputInsuredSalaryB(strInsuredSalary)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputInsuredSalaryA(strInsuredSalary)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredSalaryA(String strInsuredSalary){
		Map lreturn=[:]
		String lInsuredSalary=strInsuredSalary.trim()
		if(lInsuredSalary.length()<=0){
			lInsuredSalary=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_SALARY
		}
		Map lInsuredSalaryList=['0':'0','1':'5000','2':'8000','3':'16000','4':'32000','5':'50000','6':'80000','7':'150000']
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			String lInsuredSalaryItem=lInsuredSalaryList.get(lInsuredSalary)
			if(!lInsuredSalaryItem){
				lInsuredSalaryItem=lInsuredSalaryList.get(THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_SALARY)
			}
			lInsuredSalary=''
			String lTagSliderInput='slider-income-input'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lInsuredSalaryInput=lInsuredSalaryItem
			lInsuredSalaryInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lInsuredSalaryInput)
			IGNUemaHelper.delayThreadSecond(1)
			String lTagSliderText='selected-income'
			String lLocatorSliderText=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderText)
			WebElement lElementSliderText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderText)
			if(!lElementSliderText){
				return lreturn
			}
			String lInsuredSalaryText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderText).trim()
			IGNUemaHelper.printLog('lInsuredSalaryNum:'+lInsuredSalaryText)
			lInsuredSalaryText='InsuredSalaryNum='+lInsuredSalaryText+'|ValueText='+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementSliderText).trim()
			lInsuredSalary=lInsuredSalaryText
			String lTagInsuredSalaryNext='income-next'
			String lLocatorInsuredSalaryNext=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredSalaryNext)
			WebElement lElementInsuredSalaryNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredSalaryNext)
			if(lElementInsuredSalaryNext){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredSalaryNext)
			}
			lResult=lResult&&(lInsuredSalary.length()>0)
			if(lResult){
				lreturn.put('InsuredSalary',lInsuredSalary)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredSalaryB(String strInsuredSalary){
		Map lreturn=[:]
		String lInsuredSalary=strInsuredSalary.trim()
		if(lInsuredSalary.length()<=0){
			lInsuredSalary=THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_SALARY
		}
		Map lInsuredSalaryList=['0':'0','1':'5000','2':'8000','3':'16000','4':'32000','5':'50000','6':'80000','7':'150000']
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			String lInsuredSalaryItem=lInsuredSalaryList.get(lInsuredSalary)
			if(!lInsuredSalaryItem){
				lInsuredSalaryItem=lInsuredSalaryList.get(THAPersonalAccidentQuotationInputType.DEFAULT_INSURED_SALARY)
			}
			lInsuredSalary=''
			String lTagSliderInput='slider-income-input'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				return lreturn
			}
			String lInsuredSalaryInput=lInsuredSalaryItem
			lInsuredSalaryInput=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementSliderInput,lInsuredSalaryInput)
			IGNUemaHelper.delayThreadSecond(1)
			String lTagSliderText='selected-income'
			String lLocatorSliderText=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderText)
			WebElement lElementSliderText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderText)
			if(!lElementSliderText){
				return lreturn
			}
			String lInsuredSalaryText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSliderText).trim()
			IGNUemaHelper.printLog('lInsuredSalaryNum:'+lInsuredSalaryText)
			lInsuredSalaryText='InsuredSalaryNum='+lInsuredSalaryText+'|ValueText='+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementSliderText).trim()
			lInsuredSalary=lInsuredSalaryText
			String lTagInsuredSalaryNext='income-next'
			String lLocatorInsuredSalaryNext=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredSalaryNext)
			WebElement lElementInsuredSalaryNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredSalaryNext)
			if(lElementInsuredSalaryNext){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredSalaryNext)
			}
			lResult=lResult&&(lInsuredSalary.length()>0)
			if(lResult){
				lreturn.put('InsuredSalary',lInsuredSalary)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestion(String strQueryPersonalAccidentInsurance,String strQueryInsuredDeniedCoverage,String strQueryAccidentOrInjury,String strQueryReceivedMedicalTreatment,String strQueryHypertensionBloodPositive,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('QueryPersonalAccidentInsurance','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryAccidentOrInjury','')
			lreturn.put('QueryReceivedMedicalTreatment','')
			lreturn.put('QueryHypertensionBloodPositive','')
			lreturn.put('QueryOtherQuestion01','')
			lreturn.put('QueryOtherQuestion02','')
			lreturn.put('QueryOtherQuestion03','')
			lreturn.put('QueryOtherQuestion04','')
			lreturn.put('QueryOtherQuestion05','')
			lreturn.put('QueryOtherQuestion06','')
			lreturn.put('QueryOtherQuestion07','')
			lreturn.put('QueryOtherQuestion08','')
			lreturn.put('QueryOtherQuestion09','')
			lreturn.put('QueryOtherQuestion10','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQueryQuestionA(strQueryPersonalAccidentInsurance,strQueryInsuredDeniedCoverage,strQueryAccidentOrInjury,strQueryReceivedMedicalTreatment,strQueryHypertensionBloodPositive,strQueryOtherQuestion01,strQueryOtherQuestion02,strQueryOtherQuestion03,strQueryOtherQuestion04,strQueryOtherQuestion05,strQueryOtherQuestion06,strQueryOtherQuestion07,strQueryOtherQuestion08,strQueryOtherQuestion09,strQueryOtherQuestion10)
						break
					case 'B':
						lreturn=this.inputQueryQuestionB(strQueryPersonalAccidentInsurance,strQueryInsuredDeniedCoverage,strQueryAccidentOrInjury,strQueryReceivedMedicalTreatment,strQueryHypertensionBloodPositive,strQueryOtherQuestion01,strQueryOtherQuestion02,strQueryOtherQuestion03,strQueryOtherQuestion04,strQueryOtherQuestion05,strQueryOtherQuestion06,strQueryOtherQuestion07,strQueryOtherQuestion08,strQueryOtherQuestion09,strQueryOtherQuestion10)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQueryQuestionA(strQueryPersonalAccidentInsurance,strQueryInsuredDeniedCoverage,strQueryAccidentOrInjury,strQueryReceivedMedicalTreatment,strQueryHypertensionBloodPositive,strQueryOtherQuestion01,strQueryOtherQuestion02,strQueryOtherQuestion03,strQueryOtherQuestion04,strQueryOtherQuestion05,strQueryOtherQuestion06,strQueryOtherQuestion07,strQueryOtherQuestion08,strQueryOtherQuestion09,strQueryOtherQuestion10)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestionA(String strQueryPersonalAccidentInsurance,String strQueryInsuredDeniedCoverage,String strQueryAccidentOrInjury,String strQueryReceivedMedicalTreatment,String strQueryHypertensionBloodPositive,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		String lQueryPersonalAccidentInsurance=strQueryPersonalAccidentInsurance.trim().toUpperCase().trim()
		if(lQueryPersonalAccidentInsurance.length()<=0){
			lQueryPersonalAccidentInsurance=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.trim().toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryAccidentOrInjury=strQueryAccidentOrInjury.trim().toUpperCase().trim()
		if(lQueryAccidentOrInjury.length()<=0){
			lQueryAccidentOrInjury=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_ACCIDENT_OR_INJURY
		}
		String lQueryReceivedMedicalTreatment=strQueryReceivedMedicalTreatment.trim().toUpperCase().trim()
		if(lQueryReceivedMedicalTreatment.length()<=0){
			lQueryReceivedMedicalTreatment=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT
		}
		String lQueryHypertensionBloodPositive=strQueryHypertensionBloodPositive.trim().toUpperCase().trim()
		if(lQueryHypertensionBloodPositive.length()<=0){
			lQueryHypertensionBloodPositive=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.trim().toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.trim().toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.trim().toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.trim().toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.trim().toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.trim().toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.trim().toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.trim().toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.trim().toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.trim().toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		Map lQueryQuestionListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
		Map lQueryQuestionListAnswerTypeAnswerType2=['1':'0|Yes','2':'1|No','3':'2|No']
		Map lQueryQuestionListAnswerTypeAnswerType3=['1':'0|No','2':'1|Yes','3':'2|Yes']
		try{
			Boolean lResult=false
			lreturn.put('QueryPersonalAccidentInsurance','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryAccidentOrInjury','')
			lreturn.put('QueryReceivedMedicalTreatment','')
			lreturn.put('QueryHypertensionBloodPositive','')
			lreturn.put('QueryOtherQuestion01','')
			lreturn.put('QueryOtherQuestion02','')
			lreturn.put('QueryOtherQuestion03','')
			lreturn.put('QueryOtherQuestion04','')
			lreturn.put('QueryOtherQuestion05','')
			lreturn.put('QueryOtherQuestion06','')
			lreturn.put('QueryOtherQuestion07','')
			lreturn.put('QueryOtherQuestion08','')
			lreturn.put('QueryOtherQuestion09','')
			lreturn.put('QueryOtherQuestion10','')
			lreturn.put('Result',lResult)
			String lQueryPersonalAccidentInsuranceItem=lQueryQuestionListAnswerTypeAnswerType2.get(lQueryPersonalAccidentInsurance)
			if(!lQueryPersonalAccidentInsuranceItem){
				lQueryPersonalAccidentInsuranceItem=lQueryQuestionListAnswerTypeAnswerType2.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE.toUpperCase())
			}
			lQueryPersonalAccidentInsurance=''
			Boolean lIsQueryPersonalAccidentInsurance=IGNUemaHelper.checkStringContainString(lQueryPersonalAccidentInsuranceItem,'YES')
			String lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryInsuredDeniedCoverage)
			if(!lQueryInsuredDeniedCoverageItem){
				lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE.toUpperCase())
			}
			lQueryInsuredDeniedCoverage=''
			Boolean lIsQueryInsuredDeniedCoverage=IGNUemaHelper.checkStringContainString(lQueryInsuredDeniedCoverageItem,'YES')
			String lQueryAccidentOrInjuryItem=lQueryQuestionListAnswerTypeAnswerType3.get(lQueryAccidentOrInjury)
			if(!lQueryAccidentOrInjuryItem){
				lQueryAccidentOrInjuryItem=lQueryQuestionListAnswerTypeAnswerType3.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_ACCIDENT_OR_INJURY.toUpperCase())
			}
			lQueryAccidentOrInjury=''
			Boolean lIsQueryAccidentOrInjury=IGNUemaHelper.checkStringContainString(lQueryAccidentOrInjuryItem,'YES')
			String lQueryReceivedMedicalTreatmentItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryReceivedMedicalTreatment)
			if(!lQueryReceivedMedicalTreatmentItem){
				lQueryReceivedMedicalTreatmentItem=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT.toUpperCase())
			}
			lQueryReceivedMedicalTreatment=''
			Boolean lIsQueryReceivedMedicalTreatment=IGNUemaHelper.checkStringContainString(lQueryReceivedMedicalTreatmentItem,'YES')
			String lQueryHypertensionBloodPositiveItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHypertensionBloodPositive)
			if(!lQueryHypertensionBloodPositiveItem){
				lQueryHypertensionBloodPositiveItem=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE.toUpperCase())
			}
			lQueryHypertensionBloodPositive=''
			Boolean lIsQueryHypertensionBloodPositive=IGNUemaHelper.checkStringContainString(lQueryHypertensionBloodPositiveItem,'YES')
			String lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion01)
			if(!lQueryOtherQuestion01Item){
				lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01.toUpperCase())
			}
			lQueryOtherQuestion01=''
			Boolean lIsQueryOtherQuestion01=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion01Item,'YES')
			String lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion02)
			if(!lQueryOtherQuestion02Item){
				lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02.toUpperCase())
			}
			lQueryOtherQuestion02=''
			Boolean lIsQueryOtherQuestion02=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion02Item,'YES')
			String lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion03)
			if(!lQueryOtherQuestion03Item){
				lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03.toUpperCase())
			}
			lQueryOtherQuestion03=''
			Boolean lIsQueryOtherQuestion03=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion03Item,'YES')
			String lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion04)
			if(!lQueryOtherQuestion04Item){
				lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04.toUpperCase())
			}
			lQueryOtherQuestion04=''
			Boolean lIsQueryOtherQuestion04=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion04Item,'YES')
			String lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion05)
			if(!lQueryOtherQuestion05Item){
				lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05.toUpperCase())
			}
			lQueryOtherQuestion05=''
			Boolean lIsQueryOtherQuestion05=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion05Item,'YES')
			String lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion06)
			if(!lQueryOtherQuestion06Item){
				lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06.toUpperCase())
			}
			lQueryOtherQuestion06=''
			Boolean lIsQueryOtherQuestion06=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion06Item,'YES')
			String lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion07)
			if(!lQueryOtherQuestion07Item){
				lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07.toUpperCase())
			}
			lQueryOtherQuestion07=''
			Boolean lIsQueryOtherQuestion07=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion07Item,'YES')
			String lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion08)
			if(!lQueryOtherQuestion08Item){
				lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08.toUpperCase())
			}
			lQueryOtherQuestion08=''
			Boolean lIsQueryOtherQuestion08=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion08Item,'YES')
			String lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion09)
			if(!lQueryOtherQuestion09Item){
				lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09.toUpperCase())
			}
			lQueryOtherQuestion09=''
			Boolean lIsQueryOtherQuestion09=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion09Item,'YES')
			String lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion10)
			if(!lQueryOtherQuestion10Item){
				lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10.toUpperCase())
			}
			lQueryOtherQuestion10=''
			Boolean lIsQueryOtherQuestion10=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryPersonalAccidentInsurance=false
			Boolean lIsDoneQueryInsuredDeniedCoverage=false
			Boolean lIsDoneQueryAccidentOrInjury=false
			Boolean lIsDoneQueryReceivedMedicalTreatment=false
			Boolean lIsDoneQueryHypertensionBloodPositive=false
			Boolean lIsDoneQueryOtherQuestion01=false
			Boolean lIsDoneQueryOtherQuestion02=false
			Boolean lIsDoneQueryOtherQuestion03=false
			Boolean lIsDoneQueryOtherQuestion04=false
			Boolean lIsDoneQueryOtherQuestion05=false
			Boolean lIsDoneQueryOtherQuestion06=false
			Boolean lIsDoneQueryOtherQuestion07=false
			Boolean lIsDoneQueryOtherQuestion08=false
			Boolean lIsDoneQueryOtherQuestion09=false
			Boolean lIsDoneQueryOtherQuestion10=false
			String lTagQueryPersonalAccidentInsuranceButtonKey='productQuestion-PAQ01'
			String lTagQueryPersonalAccidentInsuranceButtonValue=lQueryPersonalAccidentInsuranceItem
			String lLocatorQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
			WebElement lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
			String lTagQueryInsuredDeniedCoverageButtonKey='productQuestion-PAQ02'
			String lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
			String lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			WebElement lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			String lTagQueryAccidentOrInjuryButtonKey='productQuestion-PAQ03'
			String lTagQueryAccidentOrInjuryButtonValue=lQueryAccidentOrInjuryItem
			String lLocatorQueryAccidentOrInjuryButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
			WebElement lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
			String lTagQueryReceivedMedicalTreatmentButtonKey='productQuestion-PAQ04'
			String lTagQueryReceivedMedicalTreatmentButtonValue=lQueryReceivedMedicalTreatmentItem
			String lLocatorQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
			WebElement lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
			String lTagQueryHypertensionBloodPositiveButtonKey='productQuestion-PAQ05'
			String lTagQueryHypertensionBloodPositiveButtonValue=lQueryHypertensionBloodPositiveItem
			String lLocatorQueryHypertensionBloodPositiveButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
			WebElement lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
			String lTagQueryOtherQuestion01ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion01ButtonValue=lQueryOtherQuestion01Item
			String lLocatorQueryOtherQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
			WebElement lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
			String lTagQueryOtherQuestion02ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion02ButtonValue=lQueryOtherQuestion02Item
			String lLocatorQueryOtherQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
			WebElement lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
			String lTagQueryOtherQuestion03ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion03ButtonValue=lQueryOtherQuestion03Item
			String lLocatorQueryOtherQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
			WebElement lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
			String lTagQueryOtherQuestion04ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion04ButtonValue=lQueryOtherQuestion04Item
			String lLocatorQueryOtherQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
			WebElement lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
			String lTagQueryOtherQuestion05ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion05ButtonValue=lQueryOtherQuestion05Item
			String lLocatorQueryOtherQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
			WebElement lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
			String lTagQueryOtherQuestion06ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion06ButtonValue=lQueryOtherQuestion06Item
			String lLocatorQueryOtherQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
			WebElement lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
			String lTagQueryOtherQuestion07ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion07ButtonValue=lQueryOtherQuestion07Item
			String lLocatorQueryOtherQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
			WebElement lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
			String lTagQueryOtherQuestion08ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion08ButtonValue=lQueryOtherQuestion08Item
			String lLocatorQueryOtherQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
			WebElement lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
			String lTagQueryOtherQuestion09ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion09ButtonValue=lQueryOtherQuestion09Item
			String lLocatorQueryOtherQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
			WebElement lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
			String lTagQueryOtherQuestion10ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion10ButtonValue=lQueryOtherQuestion10Item
			String lLocatorQueryOtherQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
			WebElement lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
			String lTagCheckPointNextButton='getQuote'
			String lLocatorCheckPointNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton)
			WebElement lElementCheckPointNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton)
			Boolean lIsCheckPointNextButtonVisible=false
			if(lElementCheckPointNextButton){
				lIsCheckPointNextButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton)
				if(lIsCheckPointNextButtonVisible){
					lQueryPersonalAccidentInsurance='No Option'
					lQueryInsuredDeniedCoverage='No Option'
					lQueryAccidentOrInjury='No Option'
					lQueryReceivedMedicalTreatment='No Option'
					lQueryHypertensionBloodPositive='No Option'
					lQueryOtherQuestion01='No Option'
					lQueryOtherQuestion02='No Option'
					lQueryOtherQuestion03='No Option'
					lQueryOtherQuestion04='No Option'
					lQueryOtherQuestion05='No Option'
					lQueryOtherQuestion06='No Option'
					lQueryOtherQuestion07='No Option'
					lQueryOtherQuestion08='No Option'
					lQueryOtherQuestion09='No Option'
					lQueryOtherQuestion10='No Option'
					lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
					if(!lElementQueryPersonalAccidentInsuranceButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
					}
					if(lElementQueryPersonalAccidentInsuranceButton){
						if(!lIsDoneQueryPersonalAccidentInsurance){
							lIsDoneQueryPersonalAccidentInsurance=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButton)
							if(lIsDoneQueryPersonalAccidentInsurance){
								lQueryPersonalAccidentInsurance=lQueryPersonalAccidentInsuranceItem
								lQueryPersonalAccidentInsurance=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryPersonalAccidentInsurance,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryPersonalAccidentInsuranceButton))
							}
							if(lIsQueryPersonalAccidentInsurance){
								String lTagQueryPersonalAccidentInsuranceButtonClose=''
								String lLocatorQueryPersonalAccidentInsuranceButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose,15)){
									WebElement lElementQueryPersonalAccidentInsuranceButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lTagQueryInsuredDeniedCoverageButtonKey=lTagQueryInsuredDeniedCoverageButtonKey
					lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
					lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					if(!lElementQueryInsuredDeniedCoverageButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					}
					if(lElementQueryInsuredDeniedCoverageButton){
						if(!lIsDoneQueryInsuredDeniedCoverage){
							lIsDoneQueryInsuredDeniedCoverage=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButton)
							if(lIsDoneQueryInsuredDeniedCoverage){
								lQueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverageItem
								lQueryInsuredDeniedCoverage=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryInsuredDeniedCoverage,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryInsuredDeniedCoverageButton))
							}
							if(lIsQueryInsuredDeniedCoverage){
								String lTagQueryInsuredDeniedCoverageButtonClose=''
								String lLocatorQueryInsuredDeniedCoverageButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose,15)){
									WebElement lElementQueryInsuredDeniedCoverageButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
					if(!lElementQueryAccidentOrInjuryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
					}
					if(lElementQueryAccidentOrInjuryButton){
						if(!lIsDoneQueryAccidentOrInjury){
							lIsDoneQueryAccidentOrInjury=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryAccidentOrInjuryButton)
							if(lIsDoneQueryAccidentOrInjury){
								lQueryAccidentOrInjury=lQueryAccidentOrInjuryItem
								lQueryAccidentOrInjury=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryAccidentOrInjury,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryAccidentOrInjuryButton))
							}
							if(lIsQueryAccidentOrInjury){
								String lTagQueryAccidentOrInjuryButtonClose=''
								String lLocatorQueryAccidentOrInjuryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose,15)){
									WebElement lElementQueryAccidentOrInjuryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryAccidentOrInjuryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryAccidentOrInjuryButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
					if(!lElementQueryReceivedMedicalTreatmentButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
					}
					if(lElementQueryReceivedMedicalTreatmentButton){
						if(!lIsDoneQueryReceivedMedicalTreatment){
							lIsDoneQueryReceivedMedicalTreatment=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButton)
							if(lIsDoneQueryReceivedMedicalTreatment){
								lQueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatmentItem
								lQueryReceivedMedicalTreatment=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryReceivedMedicalTreatment,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryReceivedMedicalTreatmentButton))
							}
							if(lIsQueryReceivedMedicalTreatment){
								String lTagQueryReceivedMedicalTreatmentButtonClose=''
								String lLocatorQueryReceivedMedicalTreatmentButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose,15)){
									WebElement lElementQueryReceivedMedicalTreatmentButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
					if(!lElementQueryHypertensionBloodPositiveButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
					}
					if(lElementQueryHypertensionBloodPositiveButton){
						if(!lIsDoneQueryHypertensionBloodPositive){
							lIsDoneQueryHypertensionBloodPositive=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButton)
							if(lIsDoneQueryHypertensionBloodPositive){
								lQueryHypertensionBloodPositive=lQueryHypertensionBloodPositiveItem
								lQueryHypertensionBloodPositive=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHypertensionBloodPositive,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHypertensionBloodPositiveButton))
							}
							if(lIsQueryHypertensionBloodPositive){
								String lTagQueryHypertensionBloodPositiveButtonClose=''
								String lLocatorQueryHypertensionBloodPositiveButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose,15)){
									WebElement lElementQueryHypertensionBloodPositiveButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
					if(!lElementQueryOtherQuestion01Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
					}
					if(lElementQueryOtherQuestion01Button){
						if(!lIsDoneQueryOtherQuestion01){
							lIsDoneQueryOtherQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion01Button)
							if(lIsDoneQueryOtherQuestion01){
								lQueryOtherQuestion01=lQueryOtherQuestion01Item
								lQueryOtherQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion01Button))
							}
							if(lIsQueryOtherQuestion01){
								String lTagQueryOtherQuestion01ButtonClose=''
								String lLocatorQueryOtherQuestion01ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose,15)){
									WebElement lElementQueryOtherQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion01ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion01ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
					if(!lElementQueryOtherQuestion02Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
					}
					if(lElementQueryOtherQuestion02Button){
						if(!lIsDoneQueryOtherQuestion02){
							lIsDoneQueryOtherQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion02Button)
							if(lIsDoneQueryOtherQuestion02){
								lQueryOtherQuestion02=lQueryOtherQuestion02Item
								lQueryOtherQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion02Button))
							}
							if(lIsQueryOtherQuestion02){
								String lTagQueryOtherQuestion02ButtonClose=''
								String lLocatorQueryOtherQuestion02ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose,15)){
									WebElement lElementQueryOtherQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion02ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion02ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
					if(!lElementQueryOtherQuestion03Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
					}
					if(lElementQueryOtherQuestion03Button){
						if(!lIsDoneQueryOtherQuestion03){
							lIsDoneQueryOtherQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion03Button)
							if(lIsDoneQueryOtherQuestion03){
								lQueryOtherQuestion03=lQueryOtherQuestion03Item
								lQueryOtherQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion03Button))
							}
							if(lIsQueryOtherQuestion03){
								String lTagQueryOtherQuestion03ButtonClose=''
								String lLocatorQueryOtherQuestion03ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose,15)){
									WebElement lElementQueryOtherQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion03ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion03ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
					if(!lElementQueryOtherQuestion04Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
					}
					if(lElementQueryOtherQuestion04Button){
						if(!lIsDoneQueryOtherQuestion04){
							lIsDoneQueryOtherQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion04Button)
							if(lIsDoneQueryOtherQuestion04){
								lQueryOtherQuestion04=lQueryOtherQuestion04Item
								lQueryOtherQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion04Button))
							}
							if(lIsQueryOtherQuestion04){
								String lTagQueryOtherQuestion04ButtonClose=''
								String lLocatorQueryOtherQuestion04ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose,15)){
									WebElement lElementQueryOtherQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion04ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion04ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
					if(!lElementQueryOtherQuestion05Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
					}
					if(lElementQueryOtherQuestion05Button){
						if(!lIsDoneQueryOtherQuestion05){
							lIsDoneQueryOtherQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion05Button)
							if(lIsDoneQueryOtherQuestion05){
								lQueryOtherQuestion05=lQueryOtherQuestion05Item
								lQueryOtherQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion05Button))
							}
							if(lIsQueryOtherQuestion05){
								String lTagQueryOtherQuestion05ButtonClose=''
								String lLocatorQueryOtherQuestion05ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose,15)){
									WebElement lElementQueryOtherQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion05ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion05ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
					if(!lElementQueryOtherQuestion06Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
					}
					if(lElementQueryOtherQuestion06Button){
						if(!lIsDoneQueryOtherQuestion06){
							lIsDoneQueryOtherQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion06Button)
							if(lIsDoneQueryOtherQuestion06){
								lQueryOtherQuestion06=lQueryOtherQuestion06Item
								lQueryOtherQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion06Button))
							}
							if(lIsQueryOtherQuestion06){
								String lTagQueryOtherQuestion06ButtonClose=''
								String lLocatorQueryOtherQuestion06ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose,15)){
									WebElement lElementQueryOtherQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion06ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion06ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
					if(!lElementQueryOtherQuestion07Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
					}
					if(lElementQueryOtherQuestion07Button){
						if(!lIsDoneQueryOtherQuestion07){
							lIsDoneQueryOtherQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion07Button)
							if(lIsDoneQueryOtherQuestion07){
								lQueryOtherQuestion07=lQueryOtherQuestion07Item
								lQueryOtherQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion07Button))
							}
							if(lIsQueryOtherQuestion07){
								String lTagQueryOtherQuestion07ButtonClose=''
								String lLocatorQueryOtherQuestion07ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose,15)){
									WebElement lElementQueryOtherQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion07ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion07ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
					if(!lElementQueryOtherQuestion08Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
					}
					if(lElementQueryOtherQuestion08Button){
						if(!lIsDoneQueryOtherQuestion08){
							lIsDoneQueryOtherQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion08Button)
							if(lIsDoneQueryOtherQuestion08){
								lQueryOtherQuestion08=lQueryOtherQuestion08Item
								lQueryOtherQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion08Button))
							}
							if(lIsQueryOtherQuestion08){
								String lTagQueryOtherQuestion08ButtonClose=''
								String lLocatorQueryOtherQuestion08ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose,15)){
									WebElement lElementQueryOtherQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion08ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion08ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
					if(!lElementQueryOtherQuestion09Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
					}
					if(lElementQueryOtherQuestion09Button){
						if(!lIsDoneQueryOtherQuestion09){
							lIsDoneQueryOtherQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion09Button)
							if(lIsDoneQueryOtherQuestion09){
								lQueryOtherQuestion09=lQueryOtherQuestion09Item
								lQueryOtherQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion09Button))
							}
							if(lIsQueryOtherQuestion09){
								String lTagQueryOtherQuestion09ButtonClose=''
								String lLocatorQueryOtherQuestion09ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose,15)){
									WebElement lElementQueryOtherQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion09ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion09ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
					if(!lElementQueryOtherQuestion10Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
					}
					if(lElementQueryOtherQuestion10Button){
						if(!lIsDoneQueryOtherQuestion10){
							lIsDoneQueryOtherQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion10Button)
							if(lIsDoneQueryOtherQuestion10){
								lQueryOtherQuestion10=lQueryOtherQuestion10Item
								lQueryOtherQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion10Button))
							}
							if(lIsQueryOtherQuestion10){
								String lTagQueryOtherQuestion10ButtonClose=''
								String lLocatorQueryOtherQuestion10ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose,15)){
									WebElement lElementQueryOtherQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion10ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion10ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}
			Boolean lIsFoundNewQuestion=false
			Integer lIndexNoNewQuestionRound=0
			Integer lIndexTry=0
			for(lIndexTry=1;lIndexTry<=20;lIndexTry++){
				lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
				if(!lElementQueryPersonalAccidentInsuranceButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
				}
				if(lElementQueryPersonalAccidentInsuranceButton){
					if(!lIsDoneQueryPersonalAccidentInsurance){
						lIsDoneQueryPersonalAccidentInsurance=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButton)
						if(lIsDoneQueryPersonalAccidentInsurance){
							lQueryPersonalAccidentInsurance=lQueryPersonalAccidentInsuranceItem
							lQueryPersonalAccidentInsurance=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryPersonalAccidentInsurance,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryPersonalAccidentInsuranceButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryPersonalAccidentInsurance){
							String lTagQueryPersonalAccidentInsuranceButtonClose=''
							String lLocatorQueryPersonalAccidentInsuranceButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose,15)){
								WebElement lElementQueryPersonalAccidentInsuranceButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lTagQueryInsuredDeniedCoverageButtonKey=lTagQueryInsuredDeniedCoverageButtonKey
				lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
				lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				if(!lElementQueryInsuredDeniedCoverageButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				}
				if(lElementQueryInsuredDeniedCoverageButton){
					if(!lIsDoneQueryInsuredDeniedCoverage){
						lIsDoneQueryInsuredDeniedCoverage=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButton)
						if(lIsDoneQueryInsuredDeniedCoverage){
							lQueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverageItem
							lQueryInsuredDeniedCoverage=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryInsuredDeniedCoverage,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryInsuredDeniedCoverageButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryInsuredDeniedCoverage){
							String lTagQueryInsuredDeniedCoverageButtonClose=''
							String lLocatorQueryInsuredDeniedCoverageButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose,15)){
								WebElement lElementQueryInsuredDeniedCoverageButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
				if(!lElementQueryAccidentOrInjuryButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
				}
				if(lElementQueryAccidentOrInjuryButton){
					if(!lIsDoneQueryAccidentOrInjury){
						lIsDoneQueryAccidentOrInjury=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryAccidentOrInjuryButton)
						if(lIsDoneQueryAccidentOrInjury){
							lQueryAccidentOrInjury=lQueryAccidentOrInjuryItem
							lQueryAccidentOrInjury=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryAccidentOrInjury,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryAccidentOrInjuryButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryAccidentOrInjury){
							String lTagQueryAccidentOrInjuryButtonClose=''
							String lLocatorQueryAccidentOrInjuryButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose,15)){
								WebElement lElementQueryAccidentOrInjuryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryAccidentOrInjuryButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryAccidentOrInjuryButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
				if(!lElementQueryReceivedMedicalTreatmentButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
				}
				if(lElementQueryReceivedMedicalTreatmentButton){
					if(!lIsDoneQueryReceivedMedicalTreatment){
						lIsDoneQueryReceivedMedicalTreatment=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButton)
						if(lIsDoneQueryReceivedMedicalTreatment){
							lQueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatmentItem
							lQueryReceivedMedicalTreatment=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryReceivedMedicalTreatment,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryReceivedMedicalTreatmentButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryReceivedMedicalTreatment){
							String lTagQueryReceivedMedicalTreatmentButtonClose=''
							String lLocatorQueryReceivedMedicalTreatmentButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose,15)){
								WebElement lElementQueryReceivedMedicalTreatmentButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
				if(!lElementQueryHypertensionBloodPositiveButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
				}
				if(lElementQueryHypertensionBloodPositiveButton){
					if(!lIsDoneQueryHypertensionBloodPositive){
						lIsDoneQueryHypertensionBloodPositive=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButton)
						if(lIsDoneQueryHypertensionBloodPositive){
							lQueryHypertensionBloodPositive=lQueryHypertensionBloodPositiveItem
							lQueryHypertensionBloodPositive=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHypertensionBloodPositive,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHypertensionBloodPositiveButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryHypertensionBloodPositive){
							String lTagQueryHypertensionBloodPositiveButtonClose=''
							String lLocatorQueryHypertensionBloodPositiveButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose,15)){
								WebElement lElementQueryHypertensionBloodPositiveButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
				if(!lElementQueryOtherQuestion01Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
				}
				if(lElementQueryOtherQuestion01Button){
					if(!lIsDoneQueryOtherQuestion01){
						lIsDoneQueryOtherQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion01Button)
						if(lIsDoneQueryOtherQuestion01){
							lQueryOtherQuestion01=lQueryOtherQuestion01Item
							lQueryOtherQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion01Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion01){
							String lTagQueryOtherQuestion01ButtonClose=''
							String lLocatorQueryOtherQuestion01ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose,15)){
								WebElement lElementQueryOtherQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion01ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion01ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
				if(!lElementQueryOtherQuestion02Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
				}
				if(lElementQueryOtherQuestion02Button){
					if(!lIsDoneQueryOtherQuestion02){
						lIsDoneQueryOtherQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion02Button)
						if(lIsDoneQueryOtherQuestion02){
							lQueryOtherQuestion02=lQueryOtherQuestion02Item
							lQueryOtherQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion02Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion02){
							String lTagQueryOtherQuestion02ButtonClose=''
							String lLocatorQueryOtherQuestion02ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose,15)){
								WebElement lElementQueryOtherQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion02ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion02ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
				if(!lElementQueryOtherQuestion03Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
				}
				if(lElementQueryOtherQuestion03Button){
					if(!lIsDoneQueryOtherQuestion03){
						lIsDoneQueryOtherQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion03Button)
						if(lIsDoneQueryOtherQuestion03){
							lQueryOtherQuestion03=lQueryOtherQuestion03Item
							lQueryOtherQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion03Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion03){
							String lTagQueryOtherQuestion03ButtonClose=''
							String lLocatorQueryOtherQuestion03ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose,15)){
								WebElement lElementQueryOtherQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion03ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion03ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
				if(!lElementQueryOtherQuestion04Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
				}
				if(lElementQueryOtherQuestion04Button){
					if(!lIsDoneQueryOtherQuestion04){
						lIsDoneQueryOtherQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion04Button)
						if(lIsDoneQueryOtherQuestion04){
							lQueryOtherQuestion04=lQueryOtherQuestion04Item
							lQueryOtherQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion04Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion04){
							String lTagQueryOtherQuestion04ButtonClose=''
							String lLocatorQueryOtherQuestion04ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose,15)){
								WebElement lElementQueryOtherQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion04ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion04ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
				if(!lElementQueryOtherQuestion05Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
				}
				if(lElementQueryOtherQuestion05Button){
					if(!lIsDoneQueryOtherQuestion05){
						lIsDoneQueryOtherQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion05Button)
						if(lIsDoneQueryOtherQuestion05){
							lQueryOtherQuestion05=lQueryOtherQuestion05Item
							lQueryOtherQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion05Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion05){
							String lTagQueryOtherQuestion05ButtonClose=''
							String lLocatorQueryOtherQuestion05ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose,15)){
								WebElement lElementQueryOtherQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion05ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion05ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
				if(!lElementQueryOtherQuestion06Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
				}
				if(lElementQueryOtherQuestion06Button){
					if(!lIsDoneQueryOtherQuestion06){
						lIsDoneQueryOtherQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion06Button)
						if(lIsDoneQueryOtherQuestion06){
							lQueryOtherQuestion06=lQueryOtherQuestion06Item
							lQueryOtherQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion06Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion06){
							String lTagQueryOtherQuestion06ButtonClose=''
							String lLocatorQueryOtherQuestion06ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose,15)){
								WebElement lElementQueryOtherQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion06ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion06ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
				if(!lElementQueryOtherQuestion07Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
				}
				if(lElementQueryOtherQuestion07Button){
					if(!lIsDoneQueryOtherQuestion07){
						lIsDoneQueryOtherQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion07Button)
						if(lIsDoneQueryOtherQuestion07){
							lQueryOtherQuestion07=lQueryOtherQuestion07Item
							lQueryOtherQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion07Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion07){
							String lTagQueryOtherQuestion07ButtonClose=''
							String lLocatorQueryOtherQuestion07ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose,15)){
								WebElement lElementQueryOtherQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion07ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion07ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
				if(!lElementQueryOtherQuestion08Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
				}
				if(lElementQueryOtherQuestion08Button){
					if(!lIsDoneQueryOtherQuestion08){
						lIsDoneQueryOtherQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion08Button)
						if(lIsDoneQueryOtherQuestion08){
							lQueryOtherQuestion08=lQueryOtherQuestion08Item
							lQueryOtherQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion08Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion08){
							String lTagQueryOtherQuestion08ButtonClose=''
							String lLocatorQueryOtherQuestion08ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose,15)){
								WebElement lElementQueryOtherQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion08ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion08ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
				if(!lElementQueryOtherQuestion09Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
				}
				if(lElementQueryOtherQuestion09Button){
					if(!lIsDoneQueryOtherQuestion09){
						lIsDoneQueryOtherQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion09Button)
						if(lIsDoneQueryOtherQuestion09){
							lQueryOtherQuestion09=lQueryOtherQuestion09Item
							lQueryOtherQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion09Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion09){
							String lTagQueryOtherQuestion09ButtonClose=''
							String lLocatorQueryOtherQuestion09ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose,15)){
								WebElement lElementQueryOtherQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion09ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion09ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
				if(!lElementQueryOtherQuestion10Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
				}
				if(lElementQueryOtherQuestion10Button){
					if(!lIsDoneQueryOtherQuestion10){
						lIsDoneQueryOtherQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion10Button)
						if(lIsDoneQueryOtherQuestion10){
							lQueryOtherQuestion10=lQueryOtherQuestion10Item
							lQueryOtherQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion10Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion10){
							String lTagQueryOtherQuestion10ButtonClose=''
							String lLocatorQueryOtherQuestion10ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose,15)){
								WebElement lElementQueryOtherQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion10ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion10ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementCheckPointNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton)
				if(lElementCheckPointNextButton){
					lIsCheckPointNextButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton)
					if(lIsCheckPointNextButtonVisible){
						break
					}
				}
				if(lIsFoundNewQuestion){
					lIsFoundNewQuestion=false
					lIndexNoNewQuestionRound=0
				}else{
					lIndexNoNewQuestionRound=lIndexNoNewQuestionRound+1
					if(lIndexNoNewQuestionRound>1){
						break
					}
				}
			}
			lIsDoneQueryAll=true
			if(!lElementQueryPersonalAccidentInsuranceButton){
				lQueryPersonalAccidentInsurance='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryPersonalAccidentInsurance
			}
			if(!lElementQueryInsuredDeniedCoverageButton){
				lQueryInsuredDeniedCoverage='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryInsuredDeniedCoverage
			}
			if(!lElementQueryAccidentOrInjuryButton){
				lQueryAccidentOrInjury='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryAccidentOrInjury
			}
			if(!lElementQueryReceivedMedicalTreatmentButton){
				lQueryReceivedMedicalTreatment='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryReceivedMedicalTreatment
			}
			if(!lElementQueryHypertensionBloodPositiveButton){
				lQueryHypertensionBloodPositive='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHypertensionBloodPositive
			}
			if(!lElementQueryOtherQuestion01Button){
				lQueryOtherQuestion01='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion01
			}
			if(!lElementQueryOtherQuestion02Button){
				lQueryOtherQuestion02='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion02
			}
			if(!lElementQueryOtherQuestion03Button){
				lQueryOtherQuestion03='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion03
			}
			if(!lElementQueryOtherQuestion04Button){
				lQueryOtherQuestion04='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion04
			}
			if(!lElementQueryOtherQuestion05Button){
				lQueryOtherQuestion05='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion05
			}
			if(!lElementQueryOtherQuestion06Button){
				lQueryOtherQuestion06='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion06
			}
			if(!lElementQueryOtherQuestion07Button){
				lQueryOtherQuestion07='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion07
			}
			if(!lElementQueryOtherQuestion08Button){
				lQueryOtherQuestion08='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion08
			}
			if(!lElementQueryOtherQuestion09Button){
				lQueryOtherQuestion09='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion09
			}
			if(!lElementQueryOtherQuestion10Button){
				lQueryOtherQuestion10='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion10
			}
			lResult=lIsDoneQueryAll
			if(lResult){
				lreturn.put('QueryPersonalAccidentInsurance',lQueryPersonalAccidentInsurance)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryAccidentOrInjury',lQueryAccidentOrInjury)
				lreturn.put('QueryReceivedMedicalTreatment',lQueryReceivedMedicalTreatment)
				lreturn.put('QueryHypertensionBloodPositive',lQueryHypertensionBloodPositive)
				lreturn.put('QueryOtherQuestion01',lQueryOtherQuestion01)
				lreturn.put('QueryOtherQuestion02',lQueryOtherQuestion02)
				lreturn.put('QueryOtherQuestion03',lQueryOtherQuestion03)
				lreturn.put('QueryOtherQuestion04',lQueryOtherQuestion04)
				lreturn.put('QueryOtherQuestion05',lQueryOtherQuestion05)
				lreturn.put('QueryOtherQuestion06',lQueryOtherQuestion06)
				lreturn.put('QueryOtherQuestion07',lQueryOtherQuestion07)
				lreturn.put('QueryOtherQuestion08',lQueryOtherQuestion08)
				lreturn.put('QueryOtherQuestion09',lQueryOtherQuestion09)
				lreturn.put('QueryOtherQuestion10',lQueryOtherQuestion10)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestionB(String strQueryPersonalAccidentInsurance,String strQueryInsuredDeniedCoverage,String strQueryAccidentOrInjury,String strQueryReceivedMedicalTreatment,String strQueryHypertensionBloodPositive,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		String lQueryPersonalAccidentInsurance=strQueryPersonalAccidentInsurance.trim().toUpperCase().trim()
		if(lQueryPersonalAccidentInsurance.length()<=0){
			lQueryPersonalAccidentInsurance=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.trim().toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryAccidentOrInjury=strQueryAccidentOrInjury.trim().toUpperCase().trim()
		if(lQueryAccidentOrInjury.length()<=0){
			lQueryAccidentOrInjury=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_ACCIDENT_OR_INJURY
		}
		String lQueryReceivedMedicalTreatment=strQueryReceivedMedicalTreatment.trim().toUpperCase().trim()
		if(lQueryReceivedMedicalTreatment.length()<=0){
			lQueryReceivedMedicalTreatment=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT
		}
		String lQueryHypertensionBloodPositive=strQueryHypertensionBloodPositive.trim().toUpperCase().trim()
		if(lQueryHypertensionBloodPositive.length()<=0){
			lQueryHypertensionBloodPositive=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.trim().toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.trim().toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.trim().toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.trim().toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.trim().toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.trim().toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.trim().toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.trim().toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.trim().toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.trim().toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		Map lQueryQuestionListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
		Map lQueryQuestionListAnswerTypeAnswerType2=['1':'0|Yes','2':'1|No','3':'2|No']
		Map lQueryQuestionListAnswerTypeAnswerType3=['1':'0|No','2':'1|Yes','3':'2|Yes']
		try{
			Boolean lResult=false
			lreturn.put('QueryPersonalAccidentInsurance','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryAccidentOrInjury','')
			lreturn.put('QueryReceivedMedicalTreatment','')
			lreturn.put('QueryHypertensionBloodPositive','')
			lreturn.put('QueryOtherQuestion01','')
			lreturn.put('QueryOtherQuestion02','')
			lreturn.put('QueryOtherQuestion03','')
			lreturn.put('QueryOtherQuestion04','')
			lreturn.put('QueryOtherQuestion05','')
			lreturn.put('QueryOtherQuestion06','')
			lreturn.put('QueryOtherQuestion07','')
			lreturn.put('QueryOtherQuestion08','')
			lreturn.put('QueryOtherQuestion09','')
			lreturn.put('QueryOtherQuestion10','')
			lreturn.put('Result',lResult)
			String lQueryPersonalAccidentInsuranceItem=lQueryQuestionListAnswerTypeAnswerType2.get(lQueryPersonalAccidentInsurance)
			if(!lQueryPersonalAccidentInsuranceItem){
				lQueryPersonalAccidentInsuranceItem=lQueryQuestionListAnswerTypeAnswerType2.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE.toUpperCase())
			}
			lQueryPersonalAccidentInsurance=''
			Boolean lIsQueryPersonalAccidentInsurance=IGNUemaHelper.checkStringContainString(lQueryPersonalAccidentInsuranceItem,'YES')
			String lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryInsuredDeniedCoverage)
			if(!lQueryInsuredDeniedCoverageItem){
				lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE.toUpperCase())
			}
			lQueryInsuredDeniedCoverage=''
			Boolean lIsQueryInsuredDeniedCoverage=IGNUemaHelper.checkStringContainString(lQueryInsuredDeniedCoverageItem,'YES')
			String lQueryAccidentOrInjuryItem=lQueryQuestionListAnswerTypeAnswerType3.get(lQueryAccidentOrInjury)
			if(!lQueryAccidentOrInjuryItem){
				lQueryAccidentOrInjuryItem=lQueryQuestionListAnswerTypeAnswerType3.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_ACCIDENT_OR_INJURY.toUpperCase())
			}
			lQueryAccidentOrInjury=''
			Boolean lIsQueryAccidentOrInjury=IGNUemaHelper.checkStringContainString(lQueryAccidentOrInjuryItem,'YES')
			String lQueryReceivedMedicalTreatmentItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryReceivedMedicalTreatment)
			if(!lQueryReceivedMedicalTreatmentItem){
				lQueryReceivedMedicalTreatmentItem=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT.toUpperCase())
			}
			lQueryReceivedMedicalTreatment=''
			Boolean lIsQueryReceivedMedicalTreatment=IGNUemaHelper.checkStringContainString(lQueryReceivedMedicalTreatmentItem,'YES')
			String lQueryHypertensionBloodPositiveItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHypertensionBloodPositive)
			if(!lQueryHypertensionBloodPositiveItem){
				lQueryHypertensionBloodPositiveItem=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE.toUpperCase())
			}
			lQueryHypertensionBloodPositive=''
			Boolean lIsQueryHypertensionBloodPositive=IGNUemaHelper.checkStringContainString(lQueryHypertensionBloodPositiveItem,'YES')
			String lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion01)
			if(!lQueryOtherQuestion01Item){
				lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01.toUpperCase())
			}
			lQueryOtherQuestion01=''
			Boolean lIsQueryOtherQuestion01=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion01Item,'YES')
			String lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion02)
			if(!lQueryOtherQuestion02Item){
				lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02.toUpperCase())
			}
			lQueryOtherQuestion02=''
			Boolean lIsQueryOtherQuestion02=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion02Item,'YES')
			String lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion03)
			if(!lQueryOtherQuestion03Item){
				lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03.toUpperCase())
			}
			lQueryOtherQuestion03=''
			Boolean lIsQueryOtherQuestion03=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion03Item,'YES')
			String lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion04)
			if(!lQueryOtherQuestion04Item){
				lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04.toUpperCase())
			}
			lQueryOtherQuestion04=''
			Boolean lIsQueryOtherQuestion04=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion04Item,'YES')
			String lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion05)
			if(!lQueryOtherQuestion05Item){
				lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05.toUpperCase())
			}
			lQueryOtherQuestion05=''
			Boolean lIsQueryOtherQuestion05=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion05Item,'YES')
			String lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion06)
			if(!lQueryOtherQuestion06Item){
				lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06.toUpperCase())
			}
			lQueryOtherQuestion06=''
			Boolean lIsQueryOtherQuestion06=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion06Item,'YES')
			String lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion07)
			if(!lQueryOtherQuestion07Item){
				lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07.toUpperCase())
			}
			lQueryOtherQuestion07=''
			Boolean lIsQueryOtherQuestion07=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion07Item,'YES')
			String lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion08)
			if(!lQueryOtherQuestion08Item){
				lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08.toUpperCase())
			}
			lQueryOtherQuestion08=''
			Boolean lIsQueryOtherQuestion08=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion08Item,'YES')
			String lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion09)
			if(!lQueryOtherQuestion09Item){
				lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09.toUpperCase())
			}
			lQueryOtherQuestion09=''
			Boolean lIsQueryOtherQuestion09=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion09Item,'YES')
			String lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion10)
			if(!lQueryOtherQuestion10Item){
				lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(THAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10.toUpperCase())
			}
			lQueryOtherQuestion10=''
			Boolean lIsQueryOtherQuestion10=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryPersonalAccidentInsurance=false
			Boolean lIsDoneQueryInsuredDeniedCoverage=false
			Boolean lIsDoneQueryAccidentOrInjury=false
			Boolean lIsDoneQueryReceivedMedicalTreatment=false
			Boolean lIsDoneQueryHypertensionBloodPositive=false
			Boolean lIsDoneQueryOtherQuestion01=false
			Boolean lIsDoneQueryOtherQuestion02=false
			Boolean lIsDoneQueryOtherQuestion03=false
			Boolean lIsDoneQueryOtherQuestion04=false
			Boolean lIsDoneQueryOtherQuestion05=false
			Boolean lIsDoneQueryOtherQuestion06=false
			Boolean lIsDoneQueryOtherQuestion07=false
			Boolean lIsDoneQueryOtherQuestion08=false
			Boolean lIsDoneQueryOtherQuestion09=false
			Boolean lIsDoneQueryOtherQuestion10=false
			String lTagQueryPersonalAccidentInsuranceButtonKey='productQuestion-PAQ01'
			String lTagQueryPersonalAccidentInsuranceButtonValue=lQueryPersonalAccidentInsuranceItem
			String lLocatorQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
			WebElement lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
			String lTagQueryInsuredDeniedCoverageButtonKey='productQuestion-PAQ02'
			String lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
			String lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			WebElement lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			String lTagQueryAccidentOrInjuryButtonKey='productQuestion-PAQ03'
			String lTagQueryAccidentOrInjuryButtonValue=lQueryAccidentOrInjuryItem
			String lLocatorQueryAccidentOrInjuryButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
			WebElement lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
			String lTagQueryReceivedMedicalTreatmentButtonKey='productQuestion-PAQ04'
			String lTagQueryReceivedMedicalTreatmentButtonValue=lQueryReceivedMedicalTreatmentItem
			String lLocatorQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
			WebElement lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
			String lTagQueryHypertensionBloodPositiveButtonKey='productQuestion-PAQ05'
			String lTagQueryHypertensionBloodPositiveButtonValue=lQueryHypertensionBloodPositiveItem
			String lLocatorQueryHypertensionBloodPositiveButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
			WebElement lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
			String lTagQueryOtherQuestion01ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion01ButtonValue=lQueryOtherQuestion01Item
			String lLocatorQueryOtherQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
			WebElement lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
			String lTagQueryOtherQuestion02ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion02ButtonValue=lQueryOtherQuestion02Item
			String lLocatorQueryOtherQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
			WebElement lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
			String lTagQueryOtherQuestion03ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion03ButtonValue=lQueryOtherQuestion03Item
			String lLocatorQueryOtherQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
			WebElement lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
			String lTagQueryOtherQuestion04ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion04ButtonValue=lQueryOtherQuestion04Item
			String lLocatorQueryOtherQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
			WebElement lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
			String lTagQueryOtherQuestion05ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion05ButtonValue=lQueryOtherQuestion05Item
			String lLocatorQueryOtherQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
			WebElement lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
			String lTagQueryOtherQuestion06ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion06ButtonValue=lQueryOtherQuestion06Item
			String lLocatorQueryOtherQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
			WebElement lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
			String lTagQueryOtherQuestion07ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion07ButtonValue=lQueryOtherQuestion07Item
			String lLocatorQueryOtherQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
			WebElement lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
			String lTagQueryOtherQuestion08ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion08ButtonValue=lQueryOtherQuestion08Item
			String lLocatorQueryOtherQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
			WebElement lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
			String lTagQueryOtherQuestion09ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion09ButtonValue=lQueryOtherQuestion09Item
			String lLocatorQueryOtherQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
			WebElement lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
			String lTagQueryOtherQuestion10ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion10ButtonValue=lQueryOtherQuestion10Item
			String lLocatorQueryOtherQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
			WebElement lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
			String lTagCheckPointNextButton='getQuote'
			String lLocatorCheckPointNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton)
			WebElement lElementCheckPointNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton)
			Boolean lIsCheckPointNextButtonVisible=false
			if(lElementCheckPointNextButton){
				lIsCheckPointNextButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton)
				if(lIsCheckPointNextButtonVisible){
					lQueryPersonalAccidentInsurance='No Option'
					lQueryInsuredDeniedCoverage='No Option'
					lQueryAccidentOrInjury='No Option'
					lQueryReceivedMedicalTreatment='No Option'
					lQueryHypertensionBloodPositive='No Option'
					lQueryOtherQuestion01='No Option'
					lQueryOtherQuestion02='No Option'
					lQueryOtherQuestion03='No Option'
					lQueryOtherQuestion04='No Option'
					lQueryOtherQuestion05='No Option'
					lQueryOtherQuestion06='No Option'
					lQueryOtherQuestion07='No Option'
					lQueryOtherQuestion08='No Option'
					lQueryOtherQuestion09='No Option'
					lQueryOtherQuestion10='No Option'
					lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
					if(!lElementQueryPersonalAccidentInsuranceButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
					}
					if(lElementQueryPersonalAccidentInsuranceButton){
						if(!lIsDoneQueryPersonalAccidentInsurance){
							lIsDoneQueryPersonalAccidentInsurance=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButton)
							if(lIsDoneQueryPersonalAccidentInsurance){
								lQueryPersonalAccidentInsurance=lQueryPersonalAccidentInsuranceItem
								lQueryPersonalAccidentInsurance=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryPersonalAccidentInsurance,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryPersonalAccidentInsuranceButton))
							}
							if(lIsQueryPersonalAccidentInsurance){
								String lTagQueryPersonalAccidentInsuranceButtonClose=''
								String lLocatorQueryPersonalAccidentInsuranceButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose,15)){
									WebElement lElementQueryPersonalAccidentInsuranceButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lTagQueryInsuredDeniedCoverageButtonKey=lTagQueryInsuredDeniedCoverageButtonKey
					lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
					lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					if(!lElementQueryInsuredDeniedCoverageButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					}
					if(lElementQueryInsuredDeniedCoverageButton){
						if(!lIsDoneQueryInsuredDeniedCoverage){
							lIsDoneQueryInsuredDeniedCoverage=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButton)
							if(lIsDoneQueryInsuredDeniedCoverage){
								lQueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverageItem
								lQueryInsuredDeniedCoverage=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryInsuredDeniedCoverage,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryInsuredDeniedCoverageButton))
							}
							if(lIsQueryInsuredDeniedCoverage){
								String lTagQueryInsuredDeniedCoverageButtonClose=''
								String lLocatorQueryInsuredDeniedCoverageButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose,15)){
									WebElement lElementQueryInsuredDeniedCoverageButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
					if(!lElementQueryAccidentOrInjuryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
					}
					if(lElementQueryAccidentOrInjuryButton){
						if(!lIsDoneQueryAccidentOrInjury){
							lIsDoneQueryAccidentOrInjury=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryAccidentOrInjuryButton)
							if(lIsDoneQueryAccidentOrInjury){
								lQueryAccidentOrInjury=lQueryAccidentOrInjuryItem
								lQueryAccidentOrInjury=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryAccidentOrInjury,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryAccidentOrInjuryButton))
							}
							if(lIsQueryAccidentOrInjury){
								String lTagQueryAccidentOrInjuryButtonClose=''
								String lLocatorQueryAccidentOrInjuryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose,15)){
									WebElement lElementQueryAccidentOrInjuryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryAccidentOrInjuryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryAccidentOrInjuryButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
					if(!lElementQueryReceivedMedicalTreatmentButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
					}
					if(lElementQueryReceivedMedicalTreatmentButton){
						if(!lIsDoneQueryReceivedMedicalTreatment){
							lIsDoneQueryReceivedMedicalTreatment=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButton)
							if(lIsDoneQueryReceivedMedicalTreatment){
								lQueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatmentItem
								lQueryReceivedMedicalTreatment=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryReceivedMedicalTreatment,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryReceivedMedicalTreatmentButton))
							}
							if(lIsQueryReceivedMedicalTreatment){
								String lTagQueryReceivedMedicalTreatmentButtonClose=''
								String lLocatorQueryReceivedMedicalTreatmentButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose,15)){
									WebElement lElementQueryReceivedMedicalTreatmentButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
					if(!lElementQueryHypertensionBloodPositiveButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
					}
					if(lElementQueryHypertensionBloodPositiveButton){
						if(!lIsDoneQueryHypertensionBloodPositive){
							lIsDoneQueryHypertensionBloodPositive=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButton)
							if(lIsDoneQueryHypertensionBloodPositive){
								lQueryHypertensionBloodPositive=lQueryHypertensionBloodPositiveItem
								lQueryHypertensionBloodPositive=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHypertensionBloodPositive,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHypertensionBloodPositiveButton))
							}
							if(lIsQueryHypertensionBloodPositive){
								String lTagQueryHypertensionBloodPositiveButtonClose=''
								String lLocatorQueryHypertensionBloodPositiveButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose,15)){
									WebElement lElementQueryHypertensionBloodPositiveButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
					if(!lElementQueryOtherQuestion01Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
					}
					if(lElementQueryOtherQuestion01Button){
						if(!lIsDoneQueryOtherQuestion01){
							lIsDoneQueryOtherQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion01Button)
							if(lIsDoneQueryOtherQuestion01){
								lQueryOtherQuestion01=lQueryOtherQuestion01Item
								lQueryOtherQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion01Button))
							}
							if(lIsQueryOtherQuestion01){
								String lTagQueryOtherQuestion01ButtonClose=''
								String lLocatorQueryOtherQuestion01ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose,15)){
									WebElement lElementQueryOtherQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion01ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion01ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
					if(!lElementQueryOtherQuestion02Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
					}
					if(lElementQueryOtherQuestion02Button){
						if(!lIsDoneQueryOtherQuestion02){
							lIsDoneQueryOtherQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion02Button)
							if(lIsDoneQueryOtherQuestion02){
								lQueryOtherQuestion02=lQueryOtherQuestion02Item
								lQueryOtherQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion02Button))
							}
							if(lIsQueryOtherQuestion02){
								String lTagQueryOtherQuestion02ButtonClose=''
								String lLocatorQueryOtherQuestion02ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose,15)){
									WebElement lElementQueryOtherQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion02ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion02ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
					if(!lElementQueryOtherQuestion03Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
					}
					if(lElementQueryOtherQuestion03Button){
						if(!lIsDoneQueryOtherQuestion03){
							lIsDoneQueryOtherQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion03Button)
							if(lIsDoneQueryOtherQuestion03){
								lQueryOtherQuestion03=lQueryOtherQuestion03Item
								lQueryOtherQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion03Button))
							}
							if(lIsQueryOtherQuestion03){
								String lTagQueryOtherQuestion03ButtonClose=''
								String lLocatorQueryOtherQuestion03ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose,15)){
									WebElement lElementQueryOtherQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion03ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion03ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
					if(!lElementQueryOtherQuestion04Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
					}
					if(lElementQueryOtherQuestion04Button){
						if(!lIsDoneQueryOtherQuestion04){
							lIsDoneQueryOtherQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion04Button)
							if(lIsDoneQueryOtherQuestion04){
								lQueryOtherQuestion04=lQueryOtherQuestion04Item
								lQueryOtherQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion04Button))
							}
							if(lIsQueryOtherQuestion04){
								String lTagQueryOtherQuestion04ButtonClose=''
								String lLocatorQueryOtherQuestion04ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose,15)){
									WebElement lElementQueryOtherQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion04ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion04ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
					if(!lElementQueryOtherQuestion05Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
					}
					if(lElementQueryOtherQuestion05Button){
						if(!lIsDoneQueryOtherQuestion05){
							lIsDoneQueryOtherQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion05Button)
							if(lIsDoneQueryOtherQuestion05){
								lQueryOtherQuestion05=lQueryOtherQuestion05Item
								lQueryOtherQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion05Button))
							}
							if(lIsQueryOtherQuestion05){
								String lTagQueryOtherQuestion05ButtonClose=''
								String lLocatorQueryOtherQuestion05ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose,15)){
									WebElement lElementQueryOtherQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion05ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion05ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
					if(!lElementQueryOtherQuestion06Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
					}
					if(lElementQueryOtherQuestion06Button){
						if(!lIsDoneQueryOtherQuestion06){
							lIsDoneQueryOtherQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion06Button)
							if(lIsDoneQueryOtherQuestion06){
								lQueryOtherQuestion06=lQueryOtherQuestion06Item
								lQueryOtherQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion06Button))
							}
							if(lIsQueryOtherQuestion06){
								String lTagQueryOtherQuestion06ButtonClose=''
								String lLocatorQueryOtherQuestion06ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose,15)){
									WebElement lElementQueryOtherQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion06ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion06ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
					if(!lElementQueryOtherQuestion07Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
					}
					if(lElementQueryOtherQuestion07Button){
						if(!lIsDoneQueryOtherQuestion07){
							lIsDoneQueryOtherQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion07Button)
							if(lIsDoneQueryOtherQuestion07){
								lQueryOtherQuestion07=lQueryOtherQuestion07Item
								lQueryOtherQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion07Button))
							}
							if(lIsQueryOtherQuestion07){
								String lTagQueryOtherQuestion07ButtonClose=''
								String lLocatorQueryOtherQuestion07ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose,15)){
									WebElement lElementQueryOtherQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion07ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion07ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
					if(!lElementQueryOtherQuestion08Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
					}
					if(lElementQueryOtherQuestion08Button){
						if(!lIsDoneQueryOtherQuestion08){
							lIsDoneQueryOtherQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion08Button)
							if(lIsDoneQueryOtherQuestion08){
								lQueryOtherQuestion08=lQueryOtherQuestion08Item
								lQueryOtherQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion08Button))
							}
							if(lIsQueryOtherQuestion08){
								String lTagQueryOtherQuestion08ButtonClose=''
								String lLocatorQueryOtherQuestion08ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose,15)){
									WebElement lElementQueryOtherQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion08ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion08ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
					if(!lElementQueryOtherQuestion09Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
					}
					if(lElementQueryOtherQuestion09Button){
						if(!lIsDoneQueryOtherQuestion09){
							lIsDoneQueryOtherQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion09Button)
							if(lIsDoneQueryOtherQuestion09){
								lQueryOtherQuestion09=lQueryOtherQuestion09Item
								lQueryOtherQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion09Button))
							}
							if(lIsQueryOtherQuestion09){
								String lTagQueryOtherQuestion09ButtonClose=''
								String lLocatorQueryOtherQuestion09ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose,15)){
									WebElement lElementQueryOtherQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion09ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion09ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
					if(!lElementQueryOtherQuestion10Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
					}
					if(lElementQueryOtherQuestion10Button){
						if(!lIsDoneQueryOtherQuestion10){
							lIsDoneQueryOtherQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion10Button)
							if(lIsDoneQueryOtherQuestion10){
								lQueryOtherQuestion10=lQueryOtherQuestion10Item
								lQueryOtherQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion10Button))
							}
							if(lIsQueryOtherQuestion10){
								String lTagQueryOtherQuestion10ButtonClose=''
								String lLocatorQueryOtherQuestion10ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose,15)){
									WebElement lElementQueryOtherQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion10ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion10ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
			}
			Boolean lIsFoundNewQuestion=false
			Integer lIndexNoNewQuestionRound=0
			Integer lIndexTry=0
			for(lIndexTry=1;lIndexTry<=20;lIndexTry++){
				lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
				if(!lElementQueryPersonalAccidentInsuranceButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryPersonalAccidentInsuranceButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryPersonalAccidentInsuranceButtonKey,lTagQueryPersonalAccidentInsuranceButtonValue)
				}
				if(lElementQueryPersonalAccidentInsuranceButton){
					if(!lIsDoneQueryPersonalAccidentInsurance){
						lIsDoneQueryPersonalAccidentInsurance=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButton)
						if(lIsDoneQueryPersonalAccidentInsurance){
							lQueryPersonalAccidentInsurance=lQueryPersonalAccidentInsuranceItem
							lQueryPersonalAccidentInsurance=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryPersonalAccidentInsurance,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryPersonalAccidentInsuranceButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryPersonalAccidentInsurance){
							String lTagQueryPersonalAccidentInsuranceButtonClose=''
							String lLocatorQueryPersonalAccidentInsuranceButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose,15)){
								WebElement lElementQueryPersonalAccidentInsuranceButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryPersonalAccidentInsuranceButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryPersonalAccidentInsuranceButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lTagQueryInsuredDeniedCoverageButtonKey=lTagQueryInsuredDeniedCoverageButtonKey
				lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
				lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				if(!lElementQueryInsuredDeniedCoverageButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				}
				if(lElementQueryInsuredDeniedCoverageButton){
					if(!lIsDoneQueryInsuredDeniedCoverage){
						lIsDoneQueryInsuredDeniedCoverage=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButton)
						if(lIsDoneQueryInsuredDeniedCoverage){
							lQueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverageItem
							lQueryInsuredDeniedCoverage=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryInsuredDeniedCoverage,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryInsuredDeniedCoverageButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryInsuredDeniedCoverage){
							String lTagQueryInsuredDeniedCoverageButtonClose=''
							String lLocatorQueryInsuredDeniedCoverageButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose,15)){
								WebElement lElementQueryInsuredDeniedCoverageButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
				if(!lElementQueryAccidentOrInjuryButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryAccidentOrInjuryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryAccidentOrInjuryButtonKey,lTagQueryAccidentOrInjuryButtonValue)
				}
				if(lElementQueryAccidentOrInjuryButton){
					if(!lIsDoneQueryAccidentOrInjury){
						lIsDoneQueryAccidentOrInjury=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryAccidentOrInjuryButton)
						if(lIsDoneQueryAccidentOrInjury){
							lQueryAccidentOrInjury=lQueryAccidentOrInjuryItem
							lQueryAccidentOrInjury=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryAccidentOrInjury,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryAccidentOrInjuryButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryAccidentOrInjury){
							String lTagQueryAccidentOrInjuryButtonClose=''
							String lLocatorQueryAccidentOrInjuryButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose,15)){
								WebElement lElementQueryAccidentOrInjuryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryAccidentOrInjuryButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryAccidentOrInjuryButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryAccidentOrInjuryButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
				if(!lElementQueryReceivedMedicalTreatmentButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryReceivedMedicalTreatmentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryReceivedMedicalTreatmentButtonKey,lTagQueryReceivedMedicalTreatmentButtonValue)
				}
				if(lElementQueryReceivedMedicalTreatmentButton){
					if(!lIsDoneQueryReceivedMedicalTreatment){
						lIsDoneQueryReceivedMedicalTreatment=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButton)
						if(lIsDoneQueryReceivedMedicalTreatment){
							lQueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatmentItem
							lQueryReceivedMedicalTreatment=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryReceivedMedicalTreatment,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryReceivedMedicalTreatmentButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryReceivedMedicalTreatment){
							String lTagQueryReceivedMedicalTreatmentButtonClose=''
							String lLocatorQueryReceivedMedicalTreatmentButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose,15)){
								WebElement lElementQueryReceivedMedicalTreatmentButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryReceivedMedicalTreatmentButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryReceivedMedicalTreatmentButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
				if(!lElementQueryHypertensionBloodPositiveButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHypertensionBloodPositiveButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHypertensionBloodPositiveButtonKey,lTagQueryHypertensionBloodPositiveButtonValue)
				}
				if(lElementQueryHypertensionBloodPositiveButton){
					if(!lIsDoneQueryHypertensionBloodPositive){
						lIsDoneQueryHypertensionBloodPositive=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButton)
						if(lIsDoneQueryHypertensionBloodPositive){
							lQueryHypertensionBloodPositive=lQueryHypertensionBloodPositiveItem
							lQueryHypertensionBloodPositive=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHypertensionBloodPositive,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHypertensionBloodPositiveButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryHypertensionBloodPositive){
							String lTagQueryHypertensionBloodPositiveButtonClose=''
							String lLocatorQueryHypertensionBloodPositiveButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose,15)){
								WebElement lElementQueryHypertensionBloodPositiveButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHypertensionBloodPositiveButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHypertensionBloodPositiveButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
				if(!lElementQueryOtherQuestion01Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
				}
				if(lElementQueryOtherQuestion01Button){
					if(!lIsDoneQueryOtherQuestion01){
						lIsDoneQueryOtherQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion01Button)
						if(lIsDoneQueryOtherQuestion01){
							lQueryOtherQuestion01=lQueryOtherQuestion01Item
							lQueryOtherQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion01Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion01){
							String lTagQueryOtherQuestion01ButtonClose=''
							String lLocatorQueryOtherQuestion01ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose,15)){
								WebElement lElementQueryOtherQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion01ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion01ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
				if(!lElementQueryOtherQuestion02Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
				}
				if(lElementQueryOtherQuestion02Button){
					if(!lIsDoneQueryOtherQuestion02){
						lIsDoneQueryOtherQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion02Button)
						if(lIsDoneQueryOtherQuestion02){
							lQueryOtherQuestion02=lQueryOtherQuestion02Item
							lQueryOtherQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion02Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion02){
							String lTagQueryOtherQuestion02ButtonClose=''
							String lLocatorQueryOtherQuestion02ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose,15)){
								WebElement lElementQueryOtherQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion02ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion02ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
				if(!lElementQueryOtherQuestion03Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
				}
				if(lElementQueryOtherQuestion03Button){
					if(!lIsDoneQueryOtherQuestion03){
						lIsDoneQueryOtherQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion03Button)
						if(lIsDoneQueryOtherQuestion03){
							lQueryOtherQuestion03=lQueryOtherQuestion03Item
							lQueryOtherQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion03Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion03){
							String lTagQueryOtherQuestion03ButtonClose=''
							String lLocatorQueryOtherQuestion03ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose,15)){
								WebElement lElementQueryOtherQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion03ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion03ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
				if(!lElementQueryOtherQuestion04Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
				}
				if(lElementQueryOtherQuestion04Button){
					if(!lIsDoneQueryOtherQuestion04){
						lIsDoneQueryOtherQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion04Button)
						if(lIsDoneQueryOtherQuestion04){
							lQueryOtherQuestion04=lQueryOtherQuestion04Item
							lQueryOtherQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion04Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion04){
							String lTagQueryOtherQuestion04ButtonClose=''
							String lLocatorQueryOtherQuestion04ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose,15)){
								WebElement lElementQueryOtherQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion04ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion04ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
				if(!lElementQueryOtherQuestion05Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
				}
				if(lElementQueryOtherQuestion05Button){
					if(!lIsDoneQueryOtherQuestion05){
						lIsDoneQueryOtherQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion05Button)
						if(lIsDoneQueryOtherQuestion05){
							lQueryOtherQuestion05=lQueryOtherQuestion05Item
							lQueryOtherQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion05Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion05){
							String lTagQueryOtherQuestion05ButtonClose=''
							String lLocatorQueryOtherQuestion05ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose,15)){
								WebElement lElementQueryOtherQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion05ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion05ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
				if(!lElementQueryOtherQuestion06Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
				}
				if(lElementQueryOtherQuestion06Button){
					if(!lIsDoneQueryOtherQuestion06){
						lIsDoneQueryOtherQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion06Button)
						if(lIsDoneQueryOtherQuestion06){
							lQueryOtherQuestion06=lQueryOtherQuestion06Item
							lQueryOtherQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion06Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion06){
							String lTagQueryOtherQuestion06ButtonClose=''
							String lLocatorQueryOtherQuestion06ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose,15)){
								WebElement lElementQueryOtherQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion06ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion06ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
				if(!lElementQueryOtherQuestion07Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
				}
				if(lElementQueryOtherQuestion07Button){
					if(!lIsDoneQueryOtherQuestion07){
						lIsDoneQueryOtherQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion07Button)
						if(lIsDoneQueryOtherQuestion07){
							lQueryOtherQuestion07=lQueryOtherQuestion07Item
							lQueryOtherQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion07Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion07){
							String lTagQueryOtherQuestion07ButtonClose=''
							String lLocatorQueryOtherQuestion07ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose,15)){
								WebElement lElementQueryOtherQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion07ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion07ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
				if(!lElementQueryOtherQuestion08Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
				}
				if(lElementQueryOtherQuestion08Button){
					if(!lIsDoneQueryOtherQuestion08){
						lIsDoneQueryOtherQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion08Button)
						if(lIsDoneQueryOtherQuestion08){
							lQueryOtherQuestion08=lQueryOtherQuestion08Item
							lQueryOtherQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion08Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion08){
							String lTagQueryOtherQuestion08ButtonClose=''
							String lLocatorQueryOtherQuestion08ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose,15)){
								WebElement lElementQueryOtherQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion08ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion08ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
				if(!lElementQueryOtherQuestion09Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
				}
				if(lElementQueryOtherQuestion09Button){
					if(!lIsDoneQueryOtherQuestion09){
						lIsDoneQueryOtherQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion09Button)
						if(lIsDoneQueryOtherQuestion09){
							lQueryOtherQuestion09=lQueryOtherQuestion09Item
							lQueryOtherQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion09Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion09){
							String lTagQueryOtherQuestion09ButtonClose=''
							String lLocatorQueryOtherQuestion09ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose,15)){
								WebElement lElementQueryOtherQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion09ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion09ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
				if(!lElementQueryOtherQuestion10Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
				}
				if(lElementQueryOtherQuestion10Button){
					if(!lIsDoneQueryOtherQuestion10){
						lIsDoneQueryOtherQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion10Button)
						if(lIsDoneQueryOtherQuestion10){
							lQueryOtherQuestion10=lQueryOtherQuestion10Item
							lQueryOtherQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion10Button))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryOtherQuestion10){
							String lTagQueryOtherQuestion10ButtonClose=''
							String lLocatorQueryOtherQuestion10ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose,15)){
								WebElement lElementQueryOtherQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion10ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion10ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementCheckPointNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton)
				if(lElementCheckPointNextButton){
					lIsCheckPointNextButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton)
					if(lIsCheckPointNextButtonVisible){
						break
					}
				}
				if(lIsFoundNewQuestion){
					lIsFoundNewQuestion=false
					lIndexNoNewQuestionRound=0
				}else{
					lIndexNoNewQuestionRound=lIndexNoNewQuestionRound+1
					if(lIndexNoNewQuestionRound>1){
						break
					}
				}
			}
			lIsDoneQueryAll=true
			if(!lElementQueryPersonalAccidentInsuranceButton){
				lQueryPersonalAccidentInsurance='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryPersonalAccidentInsurance
			}
			if(!lElementQueryInsuredDeniedCoverageButton){
				lQueryInsuredDeniedCoverage='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryInsuredDeniedCoverage
			}
			if(!lElementQueryAccidentOrInjuryButton){
				lQueryAccidentOrInjury='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryAccidentOrInjury
			}
			if(!lElementQueryReceivedMedicalTreatmentButton){
				lQueryReceivedMedicalTreatment='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryReceivedMedicalTreatment
			}
			if(!lElementQueryHypertensionBloodPositiveButton){
				lQueryHypertensionBloodPositive='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHypertensionBloodPositive
			}
			if(!lElementQueryOtherQuestion01Button){
				lQueryOtherQuestion01='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion01
			}
			if(!lElementQueryOtherQuestion02Button){
				lQueryOtherQuestion02='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion02
			}
			if(!lElementQueryOtherQuestion03Button){
				lQueryOtherQuestion03='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion03
			}
			if(!lElementQueryOtherQuestion04Button){
				lQueryOtherQuestion04='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion04
			}
			if(!lElementQueryOtherQuestion05Button){
				lQueryOtherQuestion05='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion05
			}
			if(!lElementQueryOtherQuestion06Button){
				lQueryOtherQuestion06='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion06
			}
			if(!lElementQueryOtherQuestion07Button){
				lQueryOtherQuestion07='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion07
			}
			if(!lElementQueryOtherQuestion08Button){
				lQueryOtherQuestion08='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion08
			}
			if(!lElementQueryOtherQuestion09Button){
				lQueryOtherQuestion09='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion09
			}
			if(!lElementQueryOtherQuestion10Button){
				lQueryOtherQuestion10='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion10
			}
			lResult=lIsDoneQueryAll
			if(lResult){
				lreturn.put('QueryPersonalAccidentInsurance',lQueryPersonalAccidentInsurance)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryAccidentOrInjury',lQueryAccidentOrInjury)
				lreturn.put('QueryReceivedMedicalTreatment',lQueryReceivedMedicalTreatment)
				lreturn.put('QueryHypertensionBloodPositive',lQueryHypertensionBloodPositive)
				lreturn.put('QueryOtherQuestion01',lQueryOtherQuestion01)
				lreturn.put('QueryOtherQuestion02',lQueryOtherQuestion02)
				lreturn.put('QueryOtherQuestion03',lQueryOtherQuestion03)
				lreturn.put('QueryOtherQuestion04',lQueryOtherQuestion04)
				lreturn.put('QueryOtherQuestion05',lQueryOtherQuestion05)
				lreturn.put('QueryOtherQuestion06',lQueryOtherQuestion06)
				lreturn.put('QueryOtherQuestion07',lQueryOtherQuestion07)
				lreturn.put('QueryOtherQuestion08',lQueryOtherQuestion08)
				lreturn.put('QueryOtherQuestion09',lQueryOtherQuestion09)
				lreturn.put('QueryOtherQuestion10',lQueryOtherQuestion10)
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
			if(lElementButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			}
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			String lLocatorResultPage='#pa-packages'
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
			if(lElementButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			}
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			String lLocatorResultPage='#pa-packages'
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
}