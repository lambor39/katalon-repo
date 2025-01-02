package org.roojai.tha.types.roojaigroundpartneragent.personalaccident
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentQuotationInputUtil
public class THARGPAPersonalAccidentQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAPersonalAccidentQuotationInputUtil lTHAPersonalAccidentQuotationInputUtil=null
	public THARGPAPersonalAccidentQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THAPersonalAccidentQuotationInputUtil getlTHAPersonalAccidentQuotationInputUtil(){
		return this.lTHAPersonalAccidentQuotationInputUtil
	}
	private void setlTHAPersonalAccidentQuotationInputUtil(THAPersonalAccidentQuotationInputUtil newlTHAPersonalAccidentQuotationInputUtil){
		//Do Nothing
		//this.lTHAPersonalAccidentQuotationInputUtil=newlTHAPersonalAccidentQuotationInputUtil
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
			THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_USER=lGroundPartnerAgentUser
			THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_PASSWORD=lGroundPartnerAgentPassword
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
			this.lTHAPersonalAccidentQuotationInputUtil=new THAPersonalAccidentQuotationInputUtil(this.driver,this.selenium)
			if(!lTHAPersonalAccidentQuotationInputUtil.waitUntilLoaded()){
				lTHAPersonalAccidentQuotationInputUtil.waitUntilLoaded()
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
			lPositiveCase=THARGPAPersonalAccidentQuotationInputType.DEFAULT_POSITIVE_CASE
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
			lGroundPartnerAgentUser=THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_USER
		}
		String lGroundPartnerAgentPassword=strGroundPartnerAgentPassword.trim()
		if(lGroundPartnerAgentPassword.length()<=0){
			lGroundPartnerAgentPassword=THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_PASSWORD
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
			lGroundPartnerAgentLoginMethod=THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD
		}
		String lGroundPartnerAgentAccountSource=strGroundPartnerAgentAccountSource.trim()
		if(lGroundPartnerAgentAccountSource.length()<=0){
			lGroundPartnerAgentAccountSource=THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE
		}
		String lGroundPartnerAgentUrlProductSelect=strGroundPartnerAgentUrlProductSelect.trim()
		if(lGroundPartnerAgentUrlProductSelect.length()<=0){
			lGroundPartnerAgentUrlProductSelect=THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT
		}
		String lGroundPartnerAgentLanguage=strGroundPartnerAgentLanguage.trim()
		if(lGroundPartnerAgentLanguage.length()<=0){
			lGroundPartnerAgentLanguage=THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE
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
			lreturn.put('GroundPartnerAgentSkipLoginUrl','')
			lreturn.put('Result',lResult)
			String lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(lGroundPartnerAgentLoginMethod)
			if(!lGroundPartnerAgentLoginMethodItem){
				lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
			String lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(lGroundPartnerAgentAccountSource)
			if(!lGroundPartnerAgentAccountSourceItem){
				lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSourceItem
			if(lGroundPartnerAgentAccountSource.equalsIgnoreCase('4')){
				if(lGroundPartnerAgentLoginMethod.equalsIgnoreCase('2')){
					lGroundPartnerAgentLoginMethodItem='3'
					lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
				}
			}
			THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentAccountSource,THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE)
			if(THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE==3){
				THARGPAPersonalAccidentCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPAPersonalAccidentCoreType.CURRENT_SOCIAL_SKIP_RATING=true
			}else{
				THARGPAPersonalAccidentCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPAPersonalAccidentCoreType.CURRENT_SOCIAL_SKIP_RATING=false
			}
			THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT=lGroundPartnerAgentUrlProductSelect
			String lLanguageItem=lLanguageList.get(lGroundPartnerAgentLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARGPAPersonalAccidentQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE)
			}
			lGroundPartnerAgentLanguage=lLanguageItem.toUpperCase()
			String lLocatorFormApp=''
			Boolean lIsFormReady=false
			switch(lGroundPartnerAgentLoginMethodItem){
				case '2':
					THARGPAPersonalAccidentCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					lLocatorMenuButtonProductOpenChildImage='#app .container-fluid #new-quote .row:nth-child(2) img[src="img/nq-pa.png"]'
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
					THARGPAPersonalAccidentCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=false
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
						THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_SKIP_LOGIN=lGroundPartnerAgentSkipLoginUrl
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
						lTagProductSelectButton='pa-btn'
						String lLocatorProductSelectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProductSelectButton)
						WebElement lElementProductSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProductSelectButton)
						if(!lElementProductSelectButton){
							lLocatorProductSelectButton='#product-link img[alt="Personal accident insurance"]'
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
						String lLocatorProductSpecificPageSelectButton='#pa-insure-hero a'
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
					THARGPAPersonalAccidentCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					String lGroundPartnerAgentUser=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputEmailText,THARGPAPersonalAccidentCoreType.CURRENT_GROUND_PARTNER_AGENT_USER)
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
					lSelectGroundPartnerAgentProduct.selectByValue('pa')
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
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAPersonalAccidentQuotationInputType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAPersonalAccidentQuotationInputUtil.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lResult=lLanguage.length()>0
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(3)
				lMapLanguage=this.lTHAPersonalAccidentQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(5)
				lMapLanguage=this.lTHAPersonalAccidentQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(8)
				lMapLanguage=this.lTHAPersonalAccidentQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
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
	public Map inputInsuredGenderAndMaritalStatus(String strInsuredGenderAndMaritalStatus){
		Map lreturn=[:]
		String lInsuredGenderAndMaritalStatus=strInsuredGenderAndMaritalStatus.trim()
		if(lInsuredGenderAndMaritalStatus.length()<=0){
			lInsuredGenderAndMaritalStatus=THARGPAPersonalAccidentQuotationInputType.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			Map lMapInsuredGenderAndMaritalStatus=this.lTHAPersonalAccidentQuotationInputUtil.inputInsuredGenderAndMaritalStatus(lInsuredGenderAndMaritalStatus)
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
	public Map inputInsuredBirthDate(String strInsuredBirthDate){
		Map lreturn=[:]
		String lInsuredBirthDate=strInsuredBirthDate.trim()
		if(lInsuredBirthDate.length()<=0){
			lInsuredBirthDate=THARGPAPersonalAccidentQuotationInputType.DEFAULT_INSURED_BIRTH_DATE
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredBirthDate','')
			lreturn.put('Result',lResult)
			Map lMapInsuredBirthDate=this.lTHAPersonalAccidentQuotationInputUtil.inputInsuredBirthDate(lInsuredBirthDate)
			if(!lMapInsuredBirthDate.Result){
				lInsuredBirthDate=''
			}else{
				lInsuredBirthDate=lMapInsuredBirthDate.InsuredBirthDate
			}
			lResult=lInsuredBirthDate.length()>0
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
		String lInsuredOccupation=strInsuredOccupation.trim()
		if(lInsuredOccupation.length()<=0){
			lInsuredOccupation=THARGPAPersonalAccidentQuotationInputType.DEFAULT_INSURED_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredOccupation','')
			lreturn.put('Result',lResult)
			Map lMapInsuredOccupation=this.lTHAPersonalAccidentQuotationInputUtil.inputInsuredOccupation(lInsuredOccupation)
			if(!lMapInsuredOccupation.Result){
				lInsuredOccupation=''
			}else{
				lInsuredOccupation=lMapInsuredOccupation.InsuredOccupation
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
		String lInsuredSalary=strInsuredSalary.trim()
		if(lInsuredSalary.length()<=0){
			lInsuredSalary=THARGPAPersonalAccidentQuotationInputType.DEFAULT_INSURED_SALARY
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			Map lMapInsuredSalary=this.lTHAPersonalAccidentQuotationInputUtil.inputInsuredSalary(lInsuredSalary)
			if(!lMapInsuredSalary.Result){
				lInsuredSalary=''
			}else{
				lInsuredSalary=lMapInsuredSalary.InsuredSalary
			}
			lResult=lInsuredSalary.length()>0
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
		String lQueryPersonalAccidentInsurance=strQueryPersonalAccidentInsurance.trim().toUpperCase().trim()
		if(lQueryPersonalAccidentInsurance.length()<=0){
			lQueryPersonalAccidentInsurance=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.trim().toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryAccidentOrInjury=strQueryAccidentOrInjury.trim().toUpperCase().trim()
		if(lQueryAccidentOrInjury.length()<=0){
			lQueryAccidentOrInjury=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_ACCIDENT_OR_INJURY
		}
		String lQueryReceivedMedicalTreatment=strQueryReceivedMedicalTreatment.trim().toUpperCase().trim()
		if(lQueryReceivedMedicalTreatment.length()<=0){
			lQueryReceivedMedicalTreatment=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT
		}
		String lQueryHypertensionBloodPositive=strQueryHypertensionBloodPositive.trim().toUpperCase().trim()
		if(lQueryHypertensionBloodPositive.length()<=0){
			lQueryHypertensionBloodPositive=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.trim().toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.trim().toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.trim().toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.trim().toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.trim().toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.trim().toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.trim().toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.trim().toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.trim().toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.trim().toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THARGPAPersonalAccidentQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
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
			Map lMapQueryQuestion=this.lTHAPersonalAccidentQuotationInputUtil.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
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
			lResult=lMapQueryQuestion.Result
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
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Map lMapActualResult=this.lTHAPersonalAccidentQuotationInputUtil.inputActualResult(isPositiveCase)
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