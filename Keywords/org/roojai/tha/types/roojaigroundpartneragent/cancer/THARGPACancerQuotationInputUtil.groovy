package org.roojai.tha.types.roojaigroundpartneragent.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.tha.types.roojaicancer.THACancerQuotationInputUtil
public class THARGPACancerQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THACancerQuotationInputUtil lTHACancerQuotationInputUtil=null
	public THARGPACancerQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	private THACancerQuotationInputUtil getlTHACancerQuotationInputUtil(){
		return this.lTHACancerQuotationInputUtil
	}
	private void setlTHACancerQuotationInputUtil(THACancerQuotationInputUtil newlTHACancerQuotationInputUtil){
		//Do Nothing
		//this.lTHACancerQuotationInputUtil=newlTHACancerQuotationInputUtil
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
		String lGenderAndMaritalStatus=caseInput.GenderAndMaritalStatus.toString().trim()
		String lBirthDateMain=caseInput.BirthDateMain.toString().trim()
		String lHeight=caseInput.Height.toString().trim()
		String lWeight=caseInput.Weight.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lSmokingHabbit=caseInput.SmokingHabbit.toString().trim()
		String lQueryTravelledHighRiskCountry=caseInput.QueryTravelledHighRiskCountry.toString().trim()
		String lQueryHealthCondition=caseInput.QueryHealthCondition.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryDiedFromCancer=caseInput.QueryDiedFromCancer.toString().trim()
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
		String lQueryHospitalIncomeBenefitToDo=caseInput.QueryHospitalIncomeBenefitToDo.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion01=caseInput.QueryHospitalIncomeBenefitQuestion01.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion02=caseInput.QueryHospitalIncomeBenefitQuestion02.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion03=caseInput.QueryHospitalIncomeBenefitQuestion03.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion04=caseInput.QueryHospitalIncomeBenefitQuestion04.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion05=caseInput.QueryHospitalIncomeBenefitQuestion05.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion06=caseInput.QueryHospitalIncomeBenefitQuestion06.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion07=caseInput.QueryHospitalIncomeBenefitQuestion07.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion08=caseInput.QueryHospitalIncomeBenefitQuestion08.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion09=caseInput.QueryHospitalIncomeBenefitQuestion09.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion10=caseInput.QueryHospitalIncomeBenefitQuestion10.toString().trim()
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
			THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_USER=lGroundPartnerAgentUser
			THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_PASSWORD=lGroundPartnerAgentPassword
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
			this.lTHACancerQuotationInputUtil=new THACancerQuotationInputUtil(this.driver,this.selenium)
			if(!lTHACancerQuotationInputUtil.waitUntilLoaded()){
				lTHACancerQuotationInputUtil.waitUntilLoaded()
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
						Map lMapGenderAndMaritalStatus=this.inputGenderAndMaritalStatus(lGenderAndMaritalStatus)
						if(!lMapGenderAndMaritalStatus.Result){
							lGenderAndMaritalStatus=''
						}else{
							lGenderAndMaritalStatus=lMapGenderAndMaritalStatus.GenderAndMaritalStatus
						}
						caseOutput.GenderAndMaritalStatus=lGenderAndMaritalStatus
						if(lGenderAndMaritalStatus.length()<=0){
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
						Map lMapHeight=this.inputHeight(lHeight)
						if(!lMapHeight.Result){
							lHeight=''
						}else{
							lHeight=lMapHeight.Height
						}
						caseOutput.Height=lHeight
						if(lHeight.length()<=0){
							return lreturn
						}
						Map lMapWeight=this.inputWeight(lWeight)
						if(!lMapWeight.Result){
							lWeight=''
						}else{
							lWeight=lMapWeight.Weight
						}
						caseOutput.Weight=lWeight
						if(lWeight.length()<=0){
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
						Map lMapSmokingHabbit=this.inputSmokingHabbit(lSmokingHabbit)
						if(!lMapSmokingHabbit.Result){
							lSmokingHabbit=''
						}else{
							lSmokingHabbit=lMapSmokingHabbit.SmokingHabbit
						}
						caseOutput.SmokingHabbit=lSmokingHabbit
						if(lSmokingHabbit.length()<=0){
							return lreturn
						}
						Map lMapQueryQuestion=this.inputQueryQuestion(lQueryTravelledHighRiskCountry,lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCancer,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
						if(!lMapQueryQuestion.Result){
							lQueryTravelledHighRiskCountry=''
							lQueryHealthCondition=''
							lQueryInsuredDeniedCoverage=''
							lQueryDiedFromCancer=''
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
							lQueryTravelledHighRiskCountry=lMapQueryQuestion.QueryTravelledHighRiskCountry
							lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
							lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
							lQueryDiedFromCancer=lMapQueryQuestion.QueryDiedFromCancer
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
						caseOutput.QueryTravelledHighRiskCountry=lQueryTravelledHighRiskCountry
						caseOutput.QueryHealthCondition=lQueryHealthCondition
						caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
						caseOutput.QueryDiedFromCancer=lQueryDiedFromCancer
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
						Map lMapQueryHospitalIncomeBenefitToDo=this.inputQueryHospitalIncomeBenefitToDo(lQueryHospitalIncomeBenefitToDo,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
						if(!lMapQueryHospitalIncomeBenefitToDo.Result){
							lQueryHospitalIncomeBenefitToDo=''
							lQueryHospitalIncomeBenefitQuestion01=''
							lQueryHospitalIncomeBenefitQuestion02=''
							lQueryHospitalIncomeBenefitQuestion03=''
							lQueryHospitalIncomeBenefitQuestion04=''
							lQueryHospitalIncomeBenefitQuestion05=''
							lQueryHospitalIncomeBenefitQuestion06=''
							lQueryHospitalIncomeBenefitQuestion07=''
							lQueryHospitalIncomeBenefitQuestion08=''
							lQueryHospitalIncomeBenefitQuestion09=''
							lQueryHospitalIncomeBenefitQuestion10=''
						}else{
							lQueryHospitalIncomeBenefitToDo=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitToDo
							lQueryHospitalIncomeBenefitQuestion01=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion01
							lQueryHospitalIncomeBenefitQuestion02=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion02
							lQueryHospitalIncomeBenefitQuestion03=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion03
							lQueryHospitalIncomeBenefitQuestion04=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion04
							lQueryHospitalIncomeBenefitQuestion05=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion05
							lQueryHospitalIncomeBenefitQuestion06=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion06
							lQueryHospitalIncomeBenefitQuestion07=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion07
							lQueryHospitalIncomeBenefitQuestion08=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion08
							lQueryHospitalIncomeBenefitQuestion09=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion09
							lQueryHospitalIncomeBenefitQuestion10=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion10
						}
						caseOutput.QueryHospitalIncomeBenefitToDo=lQueryHospitalIncomeBenefitToDo
						caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
						caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
						caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
						caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
						caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
						caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
						caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
						caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
						caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
						caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
						if(!lMapQueryHospitalIncomeBenefitToDo.Result){
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
						Map lMapGenderAndMaritalStatus=this.inputGenderAndMaritalStatus(lGenderAndMaritalStatus)
						if(!lMapGenderAndMaritalStatus.Result){
							lGenderAndMaritalStatus=''
						}else{
							lGenderAndMaritalStatus=lMapGenderAndMaritalStatus.GenderAndMaritalStatus
						}
						caseOutput.GenderAndMaritalStatus=lGenderAndMaritalStatus
						if(lGenderAndMaritalStatus.length()<=0){
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
						Map lMapHeight=this.inputHeight(lHeight)
						if(!lMapHeight.Result){
							lHeight=''
						}else{
							lHeight=lMapHeight.Height
						}
						caseOutput.Height=lHeight
						if(lHeight.length()<=0){
							return lreturn
						}
						Map lMapWeight=this.inputWeight(lWeight)
						if(!lMapWeight.Result){
							lWeight=''
						}else{
							lWeight=lMapWeight.Weight
						}
						caseOutput.Weight=lWeight
						if(lWeight.length()<=0){
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
						Map lMapSmokingHabbit=this.inputSmokingHabbit(lSmokingHabbit)
						if(!lMapSmokingHabbit.Result){
							lSmokingHabbit=''
						}else{
							lSmokingHabbit=lMapSmokingHabbit.SmokingHabbit
						}
						caseOutput.SmokingHabbit=lSmokingHabbit
						if(lSmokingHabbit.length()<=0){
							return lreturn
						}
						Map lMapQueryQuestion=this.inputQueryQuestion(lQueryTravelledHighRiskCountry,lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCancer,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
						if(!lMapQueryQuestion.Result){
							lQueryTravelledHighRiskCountry=''
							lQueryHealthCondition=''
							lQueryInsuredDeniedCoverage=''
							lQueryDiedFromCancer=''
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
							lQueryTravelledHighRiskCountry=lMapQueryQuestion.QueryTravelledHighRiskCountry
							lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
							lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
							lQueryDiedFromCancer=lMapQueryQuestion.QueryDiedFromCancer
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
						caseOutput.QueryTravelledHighRiskCountry=lQueryTravelledHighRiskCountry
						caseOutput.QueryHealthCondition=lQueryHealthCondition
						caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
						caseOutput.QueryDiedFromCancer=lQueryDiedFromCancer
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
						Map lMapQueryHospitalIncomeBenefitToDo=this.inputQueryHospitalIncomeBenefitToDo(lQueryHospitalIncomeBenefitToDo,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
						if(!lMapQueryHospitalIncomeBenefitToDo.Result){
							lQueryHospitalIncomeBenefitToDo=''
							lQueryHospitalIncomeBenefitQuestion01=''
							lQueryHospitalIncomeBenefitQuestion02=''
							lQueryHospitalIncomeBenefitQuestion03=''
							lQueryHospitalIncomeBenefitQuestion04=''
							lQueryHospitalIncomeBenefitQuestion05=''
							lQueryHospitalIncomeBenefitQuestion06=''
							lQueryHospitalIncomeBenefitQuestion07=''
							lQueryHospitalIncomeBenefitQuestion08=''
							lQueryHospitalIncomeBenefitQuestion09=''
							lQueryHospitalIncomeBenefitQuestion10=''
						}else{
							lQueryHospitalIncomeBenefitToDo=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitToDo
							lQueryHospitalIncomeBenefitQuestion01=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion01
							lQueryHospitalIncomeBenefitQuestion02=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion02
							lQueryHospitalIncomeBenefitQuestion03=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion03
							lQueryHospitalIncomeBenefitQuestion04=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion04
							lQueryHospitalIncomeBenefitQuestion05=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion05
							lQueryHospitalIncomeBenefitQuestion06=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion06
							lQueryHospitalIncomeBenefitQuestion07=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion07
							lQueryHospitalIncomeBenefitQuestion08=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion08
							lQueryHospitalIncomeBenefitQuestion09=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion09
							lQueryHospitalIncomeBenefitQuestion10=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion10
						}
						caseOutput.QueryHospitalIncomeBenefitToDo=lQueryHospitalIncomeBenefitToDo
						caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
						caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
						caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
						caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
						caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
						caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
						caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
						caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
						caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
						caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
						if(!lMapQueryHospitalIncomeBenefitToDo.Result){
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
				Map lMapGenderAndMaritalStatus=this.inputGenderAndMaritalStatus(lGenderAndMaritalStatus)
				if(!lMapGenderAndMaritalStatus.Result){
					lGenderAndMaritalStatus=''
				}else{
					lGenderAndMaritalStatus=lMapGenderAndMaritalStatus.GenderAndMaritalStatus
				}
				caseOutput.GenderAndMaritalStatus=lGenderAndMaritalStatus
				if(lGenderAndMaritalStatus.length()<=0){
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
				Map lMapHeight=this.inputHeight(lHeight)
				if(!lMapHeight.Result){
					lHeight=''
				}else{
					lHeight=lMapHeight.Height
				}
				caseOutput.Height=lHeight
				if(lHeight.length()<=0){
					return lreturn
				}
				Map lMapWeight=this.inputWeight(lWeight)
				if(!lMapWeight.Result){
					lWeight=''
				}else{
					lWeight=lMapWeight.Weight
				}
				caseOutput.Weight=lWeight
				if(lWeight.length()<=0){
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
				Map lMapSmokingHabbit=this.inputSmokingHabbit(lSmokingHabbit)
				if(!lMapSmokingHabbit.Result){
					lSmokingHabbit=''
				}else{
					lSmokingHabbit=lMapSmokingHabbit.SmokingHabbit
				}
				caseOutput.SmokingHabbit=lSmokingHabbit
				if(lSmokingHabbit.length()<=0){
					return lreturn
				}
				Map lMapQueryQuestion=this.inputQueryQuestion(lQueryTravelledHighRiskCountry,lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCancer,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
				if(!lMapQueryQuestion.Result){
					lQueryTravelledHighRiskCountry=''
					lQueryHealthCondition=''
					lQueryInsuredDeniedCoverage=''
					lQueryDiedFromCancer=''
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
					lQueryTravelledHighRiskCountry=lMapQueryQuestion.QueryTravelledHighRiskCountry
					lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
					lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
					lQueryDiedFromCancer=lMapQueryQuestion.QueryDiedFromCancer
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
				caseOutput.QueryTravelledHighRiskCountry=lQueryTravelledHighRiskCountry
				caseOutput.QueryHealthCondition=lQueryHealthCondition
				caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
				caseOutput.QueryDiedFromCancer=lQueryDiedFromCancer
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
				Map lMapQueryHospitalIncomeBenefitToDo=this.inputQueryHospitalIncomeBenefitToDo(lQueryHospitalIncomeBenefitToDo,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
				if(!lMapQueryHospitalIncomeBenefitToDo.Result){
					lQueryHospitalIncomeBenefitToDo=''
					lQueryHospitalIncomeBenefitQuestion01=''
					lQueryHospitalIncomeBenefitQuestion02=''
					lQueryHospitalIncomeBenefitQuestion03=''
					lQueryHospitalIncomeBenefitQuestion04=''
					lQueryHospitalIncomeBenefitQuestion05=''
					lQueryHospitalIncomeBenefitQuestion06=''
					lQueryHospitalIncomeBenefitQuestion07=''
					lQueryHospitalIncomeBenefitQuestion08=''
					lQueryHospitalIncomeBenefitQuestion09=''
					lQueryHospitalIncomeBenefitQuestion10=''
				}else{
					lQueryHospitalIncomeBenefitToDo=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitToDo
					lQueryHospitalIncomeBenefitQuestion01=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion01
					lQueryHospitalIncomeBenefitQuestion02=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion02
					lQueryHospitalIncomeBenefitQuestion03=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion03
					lQueryHospitalIncomeBenefitQuestion04=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion04
					lQueryHospitalIncomeBenefitQuestion05=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion05
					lQueryHospitalIncomeBenefitQuestion06=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion06
					lQueryHospitalIncomeBenefitQuestion07=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion07
					lQueryHospitalIncomeBenefitQuestion08=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion08
					lQueryHospitalIncomeBenefitQuestion09=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion09
					lQueryHospitalIncomeBenefitQuestion10=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion10
				}
				caseOutput.QueryHospitalIncomeBenefitToDo=lQueryHospitalIncomeBenefitToDo
				caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
				caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
				caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
				caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
				caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
				caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
				caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
				caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
				caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
				caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
				if(!lMapQueryHospitalIncomeBenefitToDo.Result){
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
			lPositiveCase=THARGPACancerQuotationInputType.DEFAULT_POSITIVE_CASE
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
			lGroundPartnerAgentUser=THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_USER
		}
		String lGroundPartnerAgentPassword=strGroundPartnerAgentPassword.trim()
		if(lGroundPartnerAgentPassword.length()<=0){
			lGroundPartnerAgentPassword=THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_PASSWORD
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
			lGroundPartnerAgentLoginMethod=THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD
		}
		String lGroundPartnerAgentAccountSource=strGroundPartnerAgentAccountSource.trim()
		if(lGroundPartnerAgentAccountSource.length()<=0){
			lGroundPartnerAgentAccountSource=THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE
		}
		String lGroundPartnerAgentUrlProductSelect=strGroundPartnerAgentUrlProductSelect.trim()
		if(lGroundPartnerAgentUrlProductSelect.length()<=0){
			lGroundPartnerAgentUrlProductSelect=THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT
		}
		String lGroundPartnerAgentLanguage=strGroundPartnerAgentLanguage.trim()
		if(lGroundPartnerAgentLanguage.length()<=0){
			lGroundPartnerAgentLanguage=THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE
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
				lGroundPartnerAgentLoginMethodItem=lGroundPartnerAgentLoginMethodList.get(THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
			String lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(lGroundPartnerAgentAccountSource)
			if(!lGroundPartnerAgentAccountSourceItem){
				lGroundPartnerAgentAccountSourceItem=lGroundPartnerAgentAccountSourceList.get(THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LOGIN_METHOD)
			}
			lGroundPartnerAgentAccountSource=lGroundPartnerAgentAccountSourceItem
			if(lGroundPartnerAgentAccountSource.equalsIgnoreCase('4')){
				if(lGroundPartnerAgentLoginMethod.equalsIgnoreCase('2')){
					lGroundPartnerAgentLoginMethodItem='3'
					lGroundPartnerAgentLoginMethod=lGroundPartnerAgentLoginMethodItem
				}
			}
			THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE=IGNUemaHelper.convertStringToInteger(lGroundPartnerAgentAccountSource,THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE)
			if(THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_ACCOUNT_SOURCE==3){
				THARGPACancerCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPACancerCoreType.CURRENT_SOCIAL_SKIP_RATING=true
			}else{
				THARGPACancerCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW=false
				THARGPACancerCoreType.CURRENT_SOCIAL_SKIP_RATING=false
			}
			THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_PRODUCT_SELECT=lGroundPartnerAgentUrlProductSelect
			String lLanguageItem=lLanguageList.get(lGroundPartnerAgentLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARGPACancerQuotationInputType.DEFAULT_GROUND_PARTNER_AGENT_LANGUAGE)
			}
			lGroundPartnerAgentLanguage=lLanguageItem.toUpperCase()
			String lLocatorFormApp=''
			Boolean lIsFormReady=false
			switch(lGroundPartnerAgentLoginMethodItem){
				case '2':
					THARGPACancerCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					lLocatorMenuButtonProductOpenChildImage='#app .container-fluid #new-quote .row:nth-child(2) img[src="img/nq-cancer.png"]'
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
					THARGPACancerCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=false
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
						THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_SKIP_LOGIN=lGroundPartnerAgentSkipLoginUrl
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
						lTagProductSelectButton='health-btn'
						String lLocatorProductSelectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProductSelectButton)
						WebElement lElementProductSelectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProductSelectButton)
						if(!lElementProductSelectButton){
							lLocatorProductSelectButton='#product-link img[alt="Cancer insurance"]'
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
						String lLocatorProductSpecificPageSelectButton='#product-cancer-insurance a'
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
					THARGPACancerCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP=true
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
					String lGroundPartnerAgentUser=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputEmailText,THARGPACancerCoreType.CURRENT_GROUND_PARTNER_AGENT_USER)
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
					lSelectGroundPartnerAgentProduct.selectByValue('health')
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
			lLanguage=THARGPACancerQuotationInputType.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHACancerQuotationInputUtil.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lResult=lLanguage.length()>0
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(3)
				lMapLanguage=this.lTHACancerQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(5)
				lMapLanguage=this.lTHACancerQuotationInputUtil.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
				lResult=lLanguage.length()>0
			}
			if(!lResult){
				IGNUemaHelper.delayThreadSecond(8)
				lMapLanguage=this.lTHACancerQuotationInputUtil.inputLanguage(lLanguage)
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
	public Map inputGenderAndMaritalStatus(String strGenderAndMaritalStatus){
		Map lreturn=[:]
		String lGenderAndMaritalStatus=strGenderAndMaritalStatus.trim()
		if(lGenderAndMaritalStatus.length()<=0){
			lGenderAndMaritalStatus=THARGPACancerQuotationInputType.DEFAULT_GENDER_AND_MARITAL_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('GenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			Map lMapGenderAndMaritalStatus=this.lTHACancerQuotationInputUtil.inputGenderAndMaritalStatus(lGenderAndMaritalStatus)
			if(!lMapGenderAndMaritalStatus.Result){
				lGenderAndMaritalStatus=''
			}else{
				lGenderAndMaritalStatus=lMapGenderAndMaritalStatus.GenderAndMaritalStatus
			}
			lResult=lGenderAndMaritalStatus.length()>0
			if(lResult){
				lreturn.put('GenderAndMaritalStatus',lGenderAndMaritalStatus)
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
			lBirthDateMain=THARGPACancerQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('BirthDateMain','')
			lreturn.put('Result',lResult)
			Map lMapBirthDateMain=this.lTHACancerQuotationInputUtil.inputBirthDateMain(lBirthDateMain)
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
	public Map inputHeight(String strHeight){
		Map lreturn=[:]
		String lHeight=strHeight.trim()
		if(lHeight.length()<=0){
			lHeight=THARGPACancerQuotationInputType.DEFAULT_HEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('Height','')
			lreturn.put('Result',lResult)
			Map lMapHeight=this.lTHACancerQuotationInputUtil.inputHeight(lHeight)
			if(!lMapHeight.Result){
				lHeight=''
			}else{
				lHeight=lMapHeight.Height
			}
			lResult=lHeight.length()>0
			if(lResult){
				lreturn.put('Height',lHeight)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWeight(String strWeight){
		Map lreturn=[:]
		String lWeight=strWeight.trim()
		if(lWeight.length()<=0){
			lWeight=THARGPACancerQuotationInputType.DEFAULT_WEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('Weight','')
			lreturn.put('Result',lResult)
			Map lMapWeight=this.lTHACancerQuotationInputUtil.inputWeight(lWeight)
			if(!lMapWeight.Result){
				lWeight=''
			}else{
				lWeight=lMapWeight.Weight
			}
			lResult=lWeight.length()>0
			if(lResult){
				lreturn.put('Weight',lWeight)
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
			lInsuredOccupation=THARGPACancerQuotationInputType.DEFAULT_INSURED_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredOccupation','')
			lreturn.put('Result',lResult)
			Map lMapInsuredOccupation=this.lTHACancerQuotationInputUtil.inputInsuredOccupation(lInsuredOccupation)
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
			lInsuredSalary=THARGPACancerQuotationInputType.DEFAULT_INSURED_SALARY
		}
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			Map lMapInsuredSalary=this.lTHACancerQuotationInputUtil.inputInsuredSalary(lInsuredSalary)
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
	public Map inputSmokingHabbit(String strSmokingHabbit){
		Map lreturn=[:]
		String lSmokingHabbit=strSmokingHabbit.trim()
		if(lSmokingHabbit.length()<=0){
			lSmokingHabbit=THARGPACancerQuotationInputType.DEFAULT_SMOKING_HABBIT
		}
		try{
			Boolean lResult=false
			lreturn.put('SmokingHabbit','')
			lreturn.put('Result',lResult)
			Map lMapSmokingHabbit=this.lTHACancerQuotationInputUtil.inputSmokingHabbit(lSmokingHabbit)
			if(!lMapSmokingHabbit.Result){
				lSmokingHabbit=''
			}else{
				lSmokingHabbit=lMapSmokingHabbit.SmokingHabbit
			}
			lResult=lSmokingHabbit.length()>0
			if(lResult){
				lreturn.put('SmokingHabbit',lSmokingHabbit)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestion(String strQueryTravelledHighRiskCountry,String strQueryHealthCondition,String strQueryInsuredDeniedCoverage,String strQueryDiedFromCancer,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		String lQueryTravelledHighRiskCountry=strQueryTravelledHighRiskCountry.toUpperCase().trim()
		if(lQueryTravelledHighRiskCountry.length()<=0){
			lQueryTravelledHighRiskCountry=THARGPACancerQuotationInputType.DEFAULT_QUERY_TRAVELLED_HIGH_RISK_COUNTRY
		}
		String lQueryHealthCondition=strQueryHealthCondition.toUpperCase().trim()
		if(lQueryHealthCondition.length()<=0){
			lQueryHealthCondition=THARGPACancerQuotationInputType.DEFAULT_QUERY_HEALTH_CONDITION
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THARGPACancerQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryDiedFromCancer=strQueryDiedFromCancer.toUpperCase().trim()
		if(lQueryDiedFromCancer.length()<=0){
			lQueryDiedFromCancer=THARGPACancerQuotationInputType.DEFAULT_QUERY_DIED_FROM_CANCER
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THARGPACancerQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		try{
			Boolean lResult=false
			lreturn.put('QueryTravelledHighRiskCountry','')
			lreturn.put('QueryHealthCondition','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryDiedFromCancer','')
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
			Map lMapQueryQuestion=this.lTHACancerQuotationInputUtil.inputQueryQuestion(lQueryTravelledHighRiskCountry,lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCancer,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
			if(!lMapQueryQuestion.Result){
				lQueryTravelledHighRiskCountry=''
				lQueryHealthCondition=''
				lQueryInsuredDeniedCoverage=''
				lQueryDiedFromCancer=''
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
				lQueryTravelledHighRiskCountry=lMapQueryQuestion.QueryTravelledHighRiskCountry
				lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
				lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
				lQueryDiedFromCancer=lMapQueryQuestion.QueryDiedFromCancer
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
				lreturn.put('QueryTravelledHighRiskCountry',lQueryTravelledHighRiskCountry)
				lreturn.put('QueryHealthCondition',lQueryHealthCondition)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryDiedFromCancer',lQueryDiedFromCancer)
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
	public Map inputQueryHospitalIncomeBenefitToDo(String strQueryHospitalIncomeBenefitToDo,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lQueryHospitalIncomeBenefitToDo=strQueryHospitalIncomeBenefitToDo.trim()
		if(lQueryHospitalIncomeBenefitToDo.length()<=0){
			lQueryHospitalIncomeBenefitToDo=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_TO_DO
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THARGPACancerQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		try{
			Boolean lResult=false
			lreturn.put('QueryHospitalIncomeBenefitToDo','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion01','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion02','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion03','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion04','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion05','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion06','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion07','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion08','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion09','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion10','')
			lreturn.put('Result',lResult)
			Map lMapQueryHospitalIncomeBenefitToDo=this.lTHACancerQuotationInputUtil.inputQueryHospitalIncomeBenefitToDo(lQueryHospitalIncomeBenefitToDo,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
			if(!lMapQueryHospitalIncomeBenefitToDo.Result){
				lQueryHospitalIncomeBenefitToDo=''
				lQueryHospitalIncomeBenefitQuestion01=''
				lQueryHospitalIncomeBenefitQuestion02=''
				lQueryHospitalIncomeBenefitQuestion03=''
				lQueryHospitalIncomeBenefitQuestion04=''
				lQueryHospitalIncomeBenefitQuestion05=''
				lQueryHospitalIncomeBenefitQuestion06=''
				lQueryHospitalIncomeBenefitQuestion07=''
				lQueryHospitalIncomeBenefitQuestion08=''
				lQueryHospitalIncomeBenefitQuestion09=''
				lQueryHospitalIncomeBenefitQuestion10=''
			}else{
				lQueryHospitalIncomeBenefitToDo=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitToDo
				lQueryHospitalIncomeBenefitQuestion01=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion01
				lQueryHospitalIncomeBenefitQuestion02=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion02
				lQueryHospitalIncomeBenefitQuestion03=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion03
				lQueryHospitalIncomeBenefitQuestion04=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion04
				lQueryHospitalIncomeBenefitQuestion05=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion05
				lQueryHospitalIncomeBenefitQuestion06=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion06
				lQueryHospitalIncomeBenefitQuestion07=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion07
				lQueryHospitalIncomeBenefitQuestion08=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion08
				lQueryHospitalIncomeBenefitQuestion09=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion09
				lQueryHospitalIncomeBenefitQuestion10=lMapQueryHospitalIncomeBenefitToDo.QueryHospitalIncomeBenefitQuestion10
			}
			lResult=lMapQueryHospitalIncomeBenefitToDo.Result
			if(lResult){
				lreturn.put('QueryHospitalIncomeBenefitToDo',lQueryHospitalIncomeBenefitToDo)
				lreturn.put('QueryHospitalIncomeBenefitQuestion01',lQueryHospitalIncomeBenefitQuestion01)
				lreturn.put('QueryHospitalIncomeBenefitQuestion02',lQueryHospitalIncomeBenefitQuestion02)
				lreturn.put('QueryHospitalIncomeBenefitQuestion03',lQueryHospitalIncomeBenefitQuestion03)
				lreturn.put('QueryHospitalIncomeBenefitQuestion04',lQueryHospitalIncomeBenefitQuestion04)
				lreturn.put('QueryHospitalIncomeBenefitQuestion05',lQueryHospitalIncomeBenefitQuestion05)
				lreturn.put('QueryHospitalIncomeBenefitQuestion06',lQueryHospitalIncomeBenefitQuestion06)
				lreturn.put('QueryHospitalIncomeBenefitQuestion07',lQueryHospitalIncomeBenefitQuestion07)
				lreturn.put('QueryHospitalIncomeBenefitQuestion08',lQueryHospitalIncomeBenefitQuestion08)
				lreturn.put('QueryHospitalIncomeBenefitQuestion09',lQueryHospitalIncomeBenefitQuestion09)
				lreturn.put('QueryHospitalIncomeBenefitQuestion10',lQueryHospitalIncomeBenefitQuestion10)
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
			Map lMapActualResult=this.lTHACancerQuotationInputUtil.inputActualResult(isPositiveCase)
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