package org.roojai.tha.types.roojaicriticalillness
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THACriticalIllnessQuotationInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THACriticalIllnessQuotationInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
			lBaseUrl=THACriticalIllnessQuotationInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THACriticalIllnessQuotationInputType.DEFAULT_VERSION
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
		String lCmsHeight=caseInput.CmsHeight.toString().trim()
		String lCmsWeight=caseInput.CmsWeight.toString().trim()
		String lCmsInsuredOccupation=caseInput.CmsInsuredOccupation.toString().trim()
		String lCmsInsuredSalary=caseInput.CmsInsuredSalary.toString().trim()
		String lCmsSmokingHabbit=caseInput.CmsSmokingHabbit.toString().trim()
		String lCmsKeepDetail=caseInput.CmsKeepDetail.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lGenderAndMaritalStatus=caseInput.GenderAndMaritalStatus.toString().trim()
		String lBirthDateMain=caseInput.BirthDateMain.toString().trim()
		String lHeight=caseInput.Height.toString().trim()
		String lWeight=caseInput.Weight.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lSmokingHabbit=caseInput.SmokingHabbit.toString().trim()
		String lQueryHealthCondition=caseInput.QueryHealthCondition.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryDiedFromCriticalIllnesses=caseInput.QueryDiedFromCriticalIllnesses.toString().trim()
		String lQueryIndustry=caseInput.QueryIndustry.toString().trim()
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
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostHeight=''
		String lCmsPostWeight=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
		String lCmsPostSmokingHabbit=''
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
			Boolean lIsCmsMainProductCriticalIllness=false
			String lTagCmsMainProductButton=''
			String lLocatorCmsMainProductButton='#product-link a'
			List<WebElement> lElementCmsMainProductButtontList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCmsMainProductButton)
			if(!lElementCmsMainProductButtontList){
				return lreturn
			}
			if(lElementCmsMainProductButtontList){
				for(WebElement lElementCmsMainProductButtontItem in lElementCmsMainProductButtontList){
					String lCmsMainProductButtontHrefText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsMainProductButtontItem,'href')
					lIsCmsMainProductCriticalIllness=IGNUemaHelper.checkStringContainString(lCmsMainProductButtontHrefText,'productType=CriticalIllness')
					if(lIsCmsMainProductCriticalIllness){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsMainProductButtontItem)
						break
					}
				}
				if(!lIsCmsMainProductCriticalIllness){
					return lreturn
				}
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			Map lMapCmsKeepDetail=this.inputCmsKeepDetail(lCmsKeepDetail,lCmsLanguage,lCmsGenderAndMaritalStatus,lCmsBirthDateMain,lCmsHeight,lCmsWeight,lCmsInsuredOccupation,lCmsInsuredSalary,lCmsSmokingHabbit)
			if(!lMapCmsKeepDetail.Result){
				lCmsKeepDetail=''
				lCmsPostLanguage=''
				lCmsPostGenderAndMaritalStatus=''
				lCmsPostBirthDateMain=''
				lCmsPostHeight=''
				lCmsPostWeight=''
				lCmsPostInsuredOccupation=''
				lCmsPostInsuredSalary=''
				lCmsPostSmokingHabbit=''
			}else{
				lCmsKeepDetail=lMapCmsKeepDetail.CmsKeepDetail
				lCmsPostLanguage=lMapCmsKeepDetail.CmsPostLanguage
				/*lCmsPostGenderAndMaritalStatus=lMapCmsKeepDetail.CmsPostGenderAndMaritalStatus
				 lCmsPostBirthDateMain=lMapCmsKeepDetail.CmsPostBirthDateMain
				 lCmsPostHeight=lMapCmsKeepDetail.CmsPostHeight
				 lCmsPostWeight=lMapCmsKeepDetail.CmsPostWeight
				 lCmsPostInsuredOccupation=lMapCmsKeepDetail.CmsPostInsuredOccupation
				 lCmsPostInsuredSalary=lMapCmsKeepDetail.CmsPostInsuredSalary
				 lCmsPostSmokingHabbit=lMapCmsKeepDetail.CmsPostSmokingHabbit*/
			}
			caseOutput.CmsKeepDetail=lCmsKeepDetail
			caseOutput.CmsPostLanguage=lCmsPostLanguage
			caseOutput.CmsPostGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
			caseOutput.CmsPostBirthDateMain=lCmsPostBirthDateMain
			caseOutput.CmsPostHeight=lCmsPostHeight
			caseOutput.CmsPostWeight=lCmsPostWeight
			caseOutput.CmsPostInsuredOccupation=lCmsPostInsuredOccupation
			caseOutput.CmsPostInsuredSalary=lCmsPostInsuredSalary
			caseOutput.CmsPostSmokingHabbit=lCmsPostSmokingHabbit
			if(!lMapCmsKeepDetail.Result){
				return lreturn
			}
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			if(lIsCmsKeepDetail){
				lLanguage=lCmsPostLanguage
				/*lGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
				 lBirthDateMain=lCmsPostBirthDateMain
				 lHeight=lCmsPostHeight
				 lWeight=lCmsPostWeight
				 lInsuredOccupation=lCmsPostInsuredOccupation
				 lInsuredSalary=lCmsPostInsuredSalary
				 lSmokingHabbit=lCmsPostSmokingHabbit*/
				caseOutput.Language=lLanguage
				/*caseOutput.GenderAndMaritalStatus=lGenderAndMaritalStatus
				 caseOutput.BirthDateMain=lBirthDateMain
				 caseOutput.Height=lHeight
				 caseOutput.Weight=lWeight
				 caseOutput.InsuredOccupation=lInsuredOccupation
				 caseOutput.InsuredSalary=lInsuredSalary
				 caseOutput.SmokingHabbit=lSmokingHabbit*/
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryHealthCondition=''
						lQueryInsuredDeniedCoverage=''
						lQueryDiedFromCriticalIllnesses=''
						lQueryIndustry=''
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
						lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
						lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
					caseOutput.QueryHealthCondition=lQueryHealthCondition
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
					caseOutput.QueryIndustry=lQueryIndustry
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryHealthCondition=''
						lQueryInsuredDeniedCoverage=''
						lQueryDiedFromCriticalIllnesses=''
						lQueryIndustry=''
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
						lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
						lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
					caseOutput.QueryHealthCondition=lQueryHealthCondition
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
					caseOutput.QueryIndustry=lQueryIndustry
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
		String lCmsHeight=caseInput.CmsHeight.toString().trim()
		String lCmsWeight=caseInput.CmsWeight.toString().trim()
		String lCmsInsuredOccupation=caseInput.CmsInsuredOccupation.toString().trim()
		String lCmsInsuredSalary=caseInput.CmsInsuredSalary.toString().trim()
		String lCmsSmokingHabbit=caseInput.CmsSmokingHabbit.toString().trim()
		String lCmsKeepDetail=caseInput.CmsKeepDetail.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lGenderAndMaritalStatus=caseInput.GenderAndMaritalStatus.toString().trim()
		String lBirthDateMain=caseInput.BirthDateMain.toString().trim()
		String lHeight=caseInput.Height.toString().trim()
		String lWeight=caseInput.Weight.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lSmokingHabbit=caseInput.SmokingHabbit.toString().trim()
		String lQueryHealthCondition=caseInput.QueryHealthCondition.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryDiedFromCriticalIllnesses=caseInput.QueryDiedFromCriticalIllnesses.toString().trim()
		String lQueryIndustry=caseInput.QueryIndustry.toString().trim()
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
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostHeight=''
		String lCmsPostWeight=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
		String lCmsPostSmokingHabbit=''
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
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			Map lMapCmsKeepDetail=this.inputCmsKeepDetail(lCmsKeepDetail,lCmsLanguage,lCmsGenderAndMaritalStatus,lCmsBirthDateMain,lCmsHeight,lCmsWeight,lCmsInsuredOccupation,lCmsInsuredSalary,lCmsSmokingHabbit)
			if(!lMapCmsKeepDetail.Result){
				lCmsKeepDetail=''
				lCmsPostLanguage=''
				lCmsPostGenderAndMaritalStatus=''
				lCmsPostBirthDateMain=''
				lCmsPostHeight=''
				lCmsPostWeight=''
				lCmsPostInsuredOccupation=''
				lCmsPostInsuredSalary=''
				lCmsPostSmokingHabbit=''
			}else{
				lCmsKeepDetail=lMapCmsKeepDetail.CmsKeepDetail
				lCmsPostLanguage=lMapCmsKeepDetail.CmsPostLanguage
				/*lCmsPostGenderAndMaritalStatus=lMapCmsKeepDetail.CmsPostGenderAndMaritalStatus
				 lCmsPostBirthDateMain=lMapCmsKeepDetail.CmsPostBirthDateMain
				 lCmsPostHeight=lMapCmsKeepDetail.CmsPostHeight
				 lCmsPostWeight=lMapCmsKeepDetail.CmsPostWeight
				 lCmsPostInsuredOccupation=lMapCmsKeepDetail.CmsPostInsuredOccupation
				 lCmsPostInsuredSalary=lMapCmsKeepDetail.CmsPostInsuredSalary
				 lCmsPostSmokingHabbit=lMapCmsKeepDetail.CmsPostSmokingHabbit*/
			}
			caseOutput.CmsKeepDetail=lCmsKeepDetail
			caseOutput.CmsPostLanguage=lCmsPostLanguage
			caseOutput.CmsPostGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
			caseOutput.CmsPostBirthDateMain=lCmsPostBirthDateMain
			caseOutput.CmsPostHeight=lCmsPostHeight
			caseOutput.CmsPostWeight=lCmsPostWeight
			caseOutput.CmsPostInsuredOccupation=lCmsPostInsuredOccupation
			caseOutput.CmsPostInsuredSalary=lCmsPostInsuredSalary
			caseOutput.CmsPostSmokingHabbit=lCmsPostSmokingHabbit
			if(!lMapCmsKeepDetail.Result){
				return lreturn
			}
			Boolean lIsCmsKeepDetail=IGNUemaHelper.convertStringToBoolean(lCmsKeepDetail)
			if(lIsCmsKeepDetail){
				lLanguage=lCmsPostLanguage
				/*lGenderAndMaritalStatus=lCmsPostGenderAndMaritalStatus
				 lBirthDateMain=lCmsPostBirthDateMain
				 lHeight=lCmsPostHeight
				 lWeight=lCmsPostWeight
				 lInsuredOccupation=lCmsPostInsuredOccupation
				 lInsuredSalary=lCmsPostInsuredSalary
				 lSmokingHabbit=lCmsPostSmokingHabbit*/
				caseOutput.Language=lLanguage
				/*caseOutput.GenderAndMaritalStatus=lGenderAndMaritalStatus
				 caseOutput.BirthDateMain=lBirthDateMain
				 caseOutput.Height=lHeight
				 caseOutput.Weight=lWeight
				 caseOutput.InsuredOccupation=lInsuredOccupation
				 caseOutput.InsuredSalary=lInsuredSalary
				 caseOutput.SmokingHabbit=lSmokingHabbit*/
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
						case 'A':
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryHealthCondition=''
						lQueryInsuredDeniedCoverage=''
						lQueryDiedFromCriticalIllnesses=''
						lQueryIndustry=''
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
						lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
						lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
					caseOutput.QueryHealthCondition=lQueryHealthCondition
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
					caseOutput.QueryIndustry=lQueryIndustry
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
							Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
							if(!lMapQueryQuestion.Result){
								lQueryHealthCondition=''
								lQueryInsuredDeniedCoverage=''
								lQueryDiedFromCriticalIllnesses=''
								lQueryIndustry=''
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
								lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
								lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
								lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
								lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
							caseOutput.QueryHealthCondition=lQueryHealthCondition
							caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
							caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
							caseOutput.QueryIndustry=lQueryIndustry
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
					Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
					if(!lMapQueryQuestion.Result){
						lQueryHealthCondition=''
						lQueryInsuredDeniedCoverage=''
						lQueryDiedFromCriticalIllnesses=''
						lQueryIndustry=''
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
						lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
						lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
						lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
						lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
					caseOutput.QueryHealthCondition=lQueryHealthCondition
					caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
					caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
					caseOutput.QueryIndustry=lQueryIndustry
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
		String lGenderAndMaritalStatus=caseInput.GenderAndMaritalStatus.toString().trim()
		String lBirthDateMain=caseInput.BirthDateMain.toString().trim()
		String lHeight=caseInput.Height.toString().trim()
		String lWeight=caseInput.Weight.toString().trim()
		String lInsuredOccupation=caseInput.InsuredOccupation.toString().trim()
		String lInsuredSalary=caseInput.InsuredSalary.toString().trim()
		String lSmokingHabbit=caseInput.SmokingHabbit.toString().trim()
		String lQueryHealthCondition=caseInput.QueryHealthCondition.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryDiedFromCriticalIllnesses=caseInput.QueryDiedFromCriticalIllnesses.toString().trim()
		String lQueryIndustry=caseInput.QueryIndustry.toString().trim()
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
						Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
						if(!lMapQueryQuestion.Result){
							lQueryHealthCondition=''
							lQueryInsuredDeniedCoverage=''
							lQueryDiedFromCriticalIllnesses=''
							lQueryIndustry=''
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
							lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
							lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
							lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
							lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
						caseOutput.QueryHealthCondition=lQueryHealthCondition
						caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
						caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
						caseOutput.QueryIndustry=lQueryIndustry
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
						Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
						if(!lMapQueryQuestion.Result){
							lQueryHealthCondition=''
							lQueryInsuredDeniedCoverage=''
							lQueryDiedFromCriticalIllnesses=''
							lQueryIndustry=''
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
							lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
							lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
							lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
							lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
						caseOutput.QueryHealthCondition=lQueryHealthCondition
						caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
						caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
						caseOutput.QueryIndustry=lQueryIndustry
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
				Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
				if(!lMapQueryQuestion.Result){
					lQueryHealthCondition=''
					lQueryInsuredDeniedCoverage=''
					lQueryDiedFromCriticalIllnesses=''
					lQueryIndustry=''
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
					lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
					lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
					lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
					lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
				caseOutput.QueryHealthCondition=lQueryHealthCondition
				caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
				caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
				caseOutput.QueryIndustry=lQueryIndustry
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
			lPositiveCase=THACriticalIllnessQuotationInputType.DEFAULT_POSITIVE_CASE
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
			lCmsLanguage=THACriticalIllnessQuotationInputType.DEFAULT_CMS_LANGUAGE
		}
		Map lCmsLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('CmsLanguage','')
			lreturn.put('Result',lResult)
			String lCmsLanguageItem=lCmsLanguageList.get(lCmsLanguage)
			if(!lCmsLanguageItem){
				lCmsLanguageItem=lCmsLanguageList.get(THACriticalIllnessQuotationInputType.DEFAULT_CMS_LANGUAGE)
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
					lCmsLanguageItem=lCmsLanguageList.get(THACriticalIllnessQuotationInputType.DEFAULT_CMS_LANGUAGE)
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
			lLanguage=THACriticalIllnessQuotationInputType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THACriticalIllnessQuotationInputType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THACriticalIllnessQuotationInputType.DEFAULT_LANGUAGE)
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
			lLanguage=THACriticalIllnessQuotationInputType.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THACriticalIllnessQuotationInputType.DEFAULT_LANGUAGE)
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
					lLanguageItem=lLanguageList.get(THACriticalIllnessQuotationInputType.DEFAULT_LANGUAGE)
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
	public Map inputCmsGenderAndMaritalStatus(String strCmsGenderAndMaritalStatus){
		Map lreturn=[:]
		String lCmsGenderAndMaritalStatus=strCmsGenderAndMaritalStatus.trim()
		if(lCmsGenderAndMaritalStatus.length()<=0){
			lCmsGenderAndMaritalStatus=THACriticalIllnessQuotationInputType.DEFAULT_CMS_GENDER_AND_MARITAL_STATUS
		}
		Map lCmsGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('CmsGenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lCmsGenderAndMaritalStatusItem=lCmsGenderAndMaritalStatusList.get(lCmsGenderAndMaritalStatus)
			if(!lCmsGenderAndMaritalStatusItem){
				lCmsGenderAndMaritalStatusItem=lCmsGenderAndMaritalStatusList.get(THACriticalIllnessQuotationInputType.DEFAULT_CMS_GENDER_AND_MARITAL_STATUS)
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
	public Map inputGenderAndMaritalStatus(String strGenderAndMaritalStatus){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('GenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputGenderAndMaritalStatusA(strGenderAndMaritalStatus)
						break
					case 'B':
						lreturn=this.inputGenderAndMaritalStatusB(strGenderAndMaritalStatus)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputGenderAndMaritalStatusA(strGenderAndMaritalStatus)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGenderAndMaritalStatusA(String strGenderAndMaritalStatus){
		Map lreturn=[:]
		String lGenderAndMaritalStatus=strGenderAndMaritalStatus.trim()
		if(lGenderAndMaritalStatus.length()<=0){
			lGenderAndMaritalStatus=THACriticalIllnessQuotationInputType.DEFAULT_GENDER_AND_MARITAL_STATUS
		}
		Map lGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('GenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(lGenderAndMaritalStatus)
			if(!lGenderAndMaritalStatusItem){
				lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(THACriticalIllnessQuotationInputType.DEFAULT_GENDER_AND_MARITAL_STATUS)
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
				lreturn.put('GenderAndMaritalStatus',lGenderAndMaritalStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGenderAndMaritalStatusB(String strGenderAndMaritalStatus){
		Map lreturn=[:]
		String lGenderAndMaritalStatus=strGenderAndMaritalStatus.trim()
		if(lGenderAndMaritalStatus.length()<=0){
			lGenderAndMaritalStatus=THACriticalIllnessQuotationInputType.DEFAULT_GENDER_AND_MARITAL_STATUS
		}
		Map lGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		try{
			Boolean lResult=false
			lreturn.put('GenderAndMaritalStatus','')
			lreturn.put('Result',lResult)
			String lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(lGenderAndMaritalStatus)
			if(!lGenderAndMaritalStatusItem){
				lGenderAndMaritalStatusItem=lGenderAndMaritalStatusList.get(THACriticalIllnessQuotationInputType.DEFAULT_GENDER_AND_MARITAL_STATUS)
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
				lreturn.put('GenderAndMaritalStatus',lGenderAndMaritalStatus)
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
			lCmsBirthDateMain=THACriticalIllnessQuotationInputType.DEFAULT_CMS_BIRTH_DATE_MAIN
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
			lBirthDateMain=THACriticalIllnessQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
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
			String lTagButtonNext='dob-next'
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
			lBirthDateMain=THACriticalIllnessQuotationInputType.DEFAULT_BIRTH_DATE_MAIN
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
			String lTagButtonNext='dob-next'
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
	public Map inputCmsHeight(String strCmsHeight){
		Map lreturn=[:]
		String lCmsHeight=strCmsHeight.trim()
		if(lCmsHeight.length()<=0){
			lCmsHeight=THACriticalIllnessQuotationInputType.DEFAULT_CMS_HEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsHeight','')
			lreturn.put('Result',lResult)
			String lCmsHeightText=lCmsHeight
			lCmsHeight=''
			String lTagCmsHeightInput='CmsHeight'
			String lLocatorCmsHeightInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsHeightInput)
			WebElement lElementCmsHeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsHeightInput)
			if(lElementCmsHeightInput){
				lCmsHeightText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCmsHeightInput,lCmsHeightText)
			}
			lElementCmsHeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsHeightInput)
			if(lElementCmsHeightInput){
				lCmsHeightText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsHeightInput,'value')
				lCmsHeight=lCmsHeightText
			}
			String lTagCmsHeightButtonNext='CmsHeight-weight-next'
			String lLocatorCmsHeightButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsHeightButtonNext)
			WebElement lElementCmsHeightButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsHeightButtonNext)
			if(lElementCmsHeightButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsHeightButtonNext)
			}
			lResult=lCmsHeight.length()>0
			if(lResult){
				lreturn.put('CmsHeight',lCmsHeight)
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
		try{
			Boolean lResult=false
			lreturn.put('Height','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHeightA(strHeight)
						break
					case 'B':
						lreturn=this.inputHeightB(strHeight)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHeightA(strHeight)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHeightA(String strHeight){
		Map lreturn=[:]
		String lHeight=strHeight.trim()
		if(lHeight.length()<=0){
			lHeight=THACriticalIllnessQuotationInputType.DEFAULT_HEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('Height','')
			lreturn.put('Result',lResult)
			String lHeightText=lHeight
			lHeight=''
			String lTagHeightInput='height'
			String lLocatorHeightInput=IGNUemaHelper.getTagDataSeleniumKey(lTagHeightInput)
			WebElement lElementHeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHeightInput)
			if(lElementHeightInput){
				lHeightText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHeightInput,lHeightText)
			}
			lElementHeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHeightInput)
			if(lElementHeightInput){
				lHeightText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementHeightInput,'value')
				lHeight=lHeightText
			}
			String lTagHeightButtonNext='height-weight-next'
			String lLocatorHeightButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHeightButtonNext)
			WebElement lElementHeightButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHeightButtonNext)
			if(lElementHeightButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHeightButtonNext)
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
	public Map inputHeightB(String strHeight){
		Map lreturn=[:]
		String lHeight=strHeight.trim()
		if(lHeight.length()<=0){
			lHeight=THACriticalIllnessQuotationInputType.DEFAULT_HEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('Height','')
			lreturn.put('Result',lResult)
			String lHeightText=lHeight
			lHeight=''
			String lTagHeightInput='height'
			String lLocatorHeightInput=IGNUemaHelper.getTagDataSeleniumKey(lTagHeightInput)
			WebElement lElementHeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHeightInput)
			if(lElementHeightInput){
				lHeightText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHeightInput,lHeightText)
			}
			lElementHeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHeightInput)
			if(lElementHeightInput){
				lHeightText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementHeightInput,'value')
				lHeight=lHeightText
			}
			String lTagHeightButtonNext='height-weight-next'
			String lLocatorHeightButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHeightButtonNext)
			WebElement lElementHeightButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHeightButtonNext)
			if(lElementHeightButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHeightButtonNext)
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
	public Map inputCmsWeight(String strCmsWeight){
		Map lreturn=[:]
		String lCmsWeight=strCmsWeight.trim()
		if(lCmsWeight.length()<=0){
			lCmsWeight=THACriticalIllnessQuotationInputType.DEFAULT_CMS_WEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('CmsWeight','')
			lreturn.put('Result',lResult)
			String lCmsWeightText=lCmsWeight
			lCmsWeight=''
			String lTagCmsWeightInput='CmsWeight'
			String lLocatorCmsWeightInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsWeightInput)
			WebElement lElementCmsWeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsWeightInput)
			if(lElementCmsWeightInput){
				lCmsWeightText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCmsWeightInput,lCmsWeightText)
			}
			lElementCmsWeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsWeightInput)
			if(lElementCmsWeightInput){
				lCmsWeightText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCmsWeightInput,'value')
				lCmsWeight=lCmsWeightText
			}
			String lTagCmsWeightButtonNext='height-CmsWeight-next'
			String lLocatorCmsWeightButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagCmsWeightButtonNext)
			WebElement lElementCmsWeightButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCmsWeightButtonNext)
			if(lElementCmsWeightButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsWeightButtonNext)
			}
			lResult=lCmsWeight.length()>0
			if(lResult){
				lreturn.put('CmsWeight',lCmsWeight)
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
		try{
			Boolean lResult=false
			lreturn.put('Weight','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputWeightA(strWeight)
						break
					case 'B':
						lreturn=this.inputWeightB(strWeight)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputWeightA(strWeight)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputWeightA(String strWeight){
		Map lreturn=[:]
		String lWeight=strWeight.trim()
		if(lWeight.length()<=0){
			lWeight=THACriticalIllnessQuotationInputType.DEFAULT_WEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('Weight','')
			lreturn.put('Result',lResult)
			String lWeightText=lWeight
			lWeight=''
			String lTagWeightInput='weight'
			String lLocatorWeightInput=IGNUemaHelper.getTagDataSeleniumKey(lTagWeightInput)
			WebElement lElementWeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagWeightInput)
			if(lElementWeightInput){
				lWeightText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementWeightInput,lWeightText)
			}
			lElementWeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagWeightInput)
			if(lElementWeightInput){
				lWeightText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementWeightInput,'value')
				lWeight=lWeightText
			}
			String lTagWeightButtonNext='height-weight-next'
			String lLocatorWeightButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagWeightButtonNext)
			WebElement lElementWeightButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagWeightButtonNext)
			if(lElementWeightButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementWeightButtonNext)
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
	public Map inputWeightB(String strWeight){
		Map lreturn=[:]
		String lWeight=strWeight.trim()
		if(lWeight.length()<=0){
			lWeight=THACriticalIllnessQuotationInputType.DEFAULT_WEIGHT
		}
		try{
			Boolean lResult=false
			lreturn.put('Weight','')
			lreturn.put('Result',lResult)
			String lWeightText=lWeight
			lWeight=''
			String lTagWeightInput='weight'
			String lLocatorWeightInput=IGNUemaHelper.getTagDataSeleniumKey(lTagWeightInput)
			WebElement lElementWeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagWeightInput)
			if(lElementWeightInput){
				lWeightText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementWeightInput,lWeightText)
			}
			lElementWeightInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagWeightInput)
			if(lElementWeightInput){
				lWeightText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementWeightInput,'value')
				lWeight=lWeightText
			}
			String lTagWeightButtonNext='height-weight-next'
			String lLocatorWeightButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagWeightButtonNext)
			WebElement lElementWeightButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagWeightButtonNext)
			if(lElementWeightButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementWeightButtonNext)
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
	public Map inputCmsInsuredOccupation(String strCmsInsuredOccupation){
		Map lreturn=[:]
		String lCmsInsuredOccupation=strCmsInsuredOccupation.trim()
		if(lCmsInsuredOccupation.length()<=0){
			lCmsInsuredOccupation=THACriticalIllnessQuotationInputType.DEFAULT_CMS_INSURED_OCCUPATION
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
			lInsuredOccupation=THACriticalIllnessQuotationInputType.DEFAULT_INSURED_OCCUPATION
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
			lInsuredOccupation=THACriticalIllnessQuotationInputType.DEFAULT_INSURED_OCCUPATION
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
	public Map inputCmsInsuredSalary(String strCmsInsuredSalary){
		Map lreturn=[:]
		String lCmsInsuredSalary=strCmsInsuredSalary.trim()
		if(lCmsInsuredSalary.length()<=0){
			lCmsInsuredSalary=THACriticalIllnessQuotationInputType.DEFAULT_CMS_INSURED_SALARY
		}
		Map lCmsInsuredSalaryList=['0':'0','1':'5000','2':'8000','3':'16000','4':'32000','5':'50000','6':'80000','7':'150000']
		try{
			Boolean lResult=false
			lreturn.put('CmsInsuredSalary','')
			lreturn.put('Result',lResult)
			String lCmsInsuredSalaryItem=lCmsInsuredSalaryList.get(lCmsInsuredSalary)
			if(!lCmsInsuredSalaryItem){
				lCmsInsuredSalaryItem=lCmsInsuredSalaryList.get(THACriticalIllnessQuotationInputType.DEFAULT_CMS_INSURED_SALARY)
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
			lInsuredSalary=THACriticalIllnessQuotationInputType.DEFAULT_INSURED_SALARY
		}
		Map lInsuredSalaryList=['0':'0','1':'5000','2':'8000','3':'16000','4':'32000','5':'50000','6':'80000','7':'150000']
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			String lInsuredSalaryItem=lInsuredSalaryList.get(lInsuredSalary)
			if(!lInsuredSalaryItem){
				lInsuredSalaryItem=lInsuredSalaryList.get(THACriticalIllnessQuotationInputType.DEFAULT_INSURED_SALARY)
			}
			lInsuredSalary=''
			String lTagSliderInput='slider-income-input'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				//return lreturn
				lInsuredSalary='No Option'
				lResult=lInsuredSalary.length()>0
			}else{
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
			}
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
			lInsuredSalary=THACriticalIllnessQuotationInputType.DEFAULT_INSURED_SALARY
		}
		Map lInsuredSalaryList=['0':'0','1':'5000','2':'8000','3':'16000','4':'32000','5':'50000','6':'80000','7':'150000']
		try{
			Boolean lResult=false
			lreturn.put('InsuredSalary','')
			lreturn.put('Result',lResult)
			String lInsuredSalaryItem=lInsuredSalaryList.get(lInsuredSalary)
			if(!lInsuredSalaryItem){
				lInsuredSalaryItem=lInsuredSalaryList.get(THACriticalIllnessQuotationInputType.DEFAULT_INSURED_SALARY)
			}
			lInsuredSalary=''
			String lTagSliderInput='slider-income-input'
			String lLocatorSliderInput=IGNUemaHelper.getTagDataSeleniumKey(lTagSliderInput)
			WebElement lElementSliderInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSliderInput)
			if(!lElementSliderInput){
				//return lreturn
				lInsuredSalary='No Option'
				lResult=lInsuredSalary.length()>0
			}else{
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
			}
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
	public Map inputCmsSmokingHabbit(String strCmsSmokingHabbit){
		Map lreturn=[:]
		String lCmsSmokingHabbit=strCmsSmokingHabbit.trim()
		if(lCmsSmokingHabbit.length()<=0){
			lCmsSmokingHabbit=THACriticalIllnessQuotationInputType.DEFAULT_CMS_SMOKING_HABBIT
		}
		Map lCmsSmokingHabbitList=['1':'Never','2':'Occasional','3':'Frequent']
		try{
			Boolean lResult=false
			lreturn.put('CmsSmokingHabbit','')
			lreturn.put('Result',lResult)
			String lCmsSmokingHabbitItem=lCmsSmokingHabbitList.get(lCmsSmokingHabbit)
			if(!lCmsSmokingHabbitItem){
				lCmsSmokingHabbitItem=lCmsSmokingHabbitList.get(THACriticalIllnessQuotationInputType.DEFAULT_CMS_SMOKING_HABBIT.toUpperCase())
			}
			lCmsSmokingHabbit=''
			String lTagCmsSmokingHabbitButtonKey='smokingHabit'
			String lTagCmsSmokingHabbitButtonValue=lCmsSmokingHabbitItem
			String lLocatorCmsSmokingHabbitButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCmsSmokingHabbitButtonKey,lTagCmsSmokingHabbitButtonValue)
			WebElement lElementCmsSmokingHabbitButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCmsSmokingHabbitButtonKey,lTagCmsSmokingHabbitButtonValue)
			if(!lElementCmsSmokingHabbitButton){
				return lreturn
			}else{
				String lCmsSmokingHabbitText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementCmsSmokingHabbitButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCmsSmokingHabbitButton)){
					lCmsSmokingHabbit=lCmsSmokingHabbitText
				}
			}
			lResult=lCmsSmokingHabbit.length()>0
			if(lResult){
				lreturn.put('CmsSmokingHabbit',lCmsSmokingHabbit)
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
		try{
			Boolean lResult=false
			lreturn.put('SmokingHabbit','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputSmokingHabbitA(strSmokingHabbit)
						break
					case 'B':
						lreturn=this.inputSmokingHabbitB(strSmokingHabbit)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputSmokingHabbitA(strSmokingHabbit)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSmokingHabbitA(String strSmokingHabbit){
		Map lreturn=[:]
		String lSmokingHabbit=strSmokingHabbit.trim()
		if(lSmokingHabbit.length()<=0){
			lSmokingHabbit=THACriticalIllnessQuotationInputType.DEFAULT_SMOKING_HABBIT
		}
		Map lSmokingHabbitList=['1':'Never','2':'Occasional','3':'Frequent']
		try{
			Boolean lResult=false
			lreturn.put('SmokingHabbit','')
			lreturn.put('Result',lResult)
			String lSmokingHabbitItem=lSmokingHabbitList.get(lSmokingHabbit)
			if(!lSmokingHabbitItem){
				lSmokingHabbitItem=lSmokingHabbitList.get(THACriticalIllnessQuotationInputType.DEFAULT_SMOKING_HABBIT.toUpperCase())
			}
			lSmokingHabbit=''
			String lTagSmokingHabbitButtonKey='smokingHabit'
			String lTagSmokingHabbitButtonValue=lSmokingHabbitItem
			String lLocatorSmokingHabbitButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagSmokingHabbitButtonKey,lTagSmokingHabbitButtonValue)
			WebElement lElementSmokingHabbitButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagSmokingHabbitButtonKey,lTagSmokingHabbitButtonValue)
			if(!lElementSmokingHabbitButton){
				return lreturn
			}else{
				String lSmokingHabbitText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementSmokingHabbitButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSmokingHabbitButton)){
					lSmokingHabbit=lSmokingHabbitText
				}
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
	public Map inputSmokingHabbitB(String strSmokingHabbit){
		Map lreturn=[:]
		String lSmokingHabbit=strSmokingHabbit.trim()
		if(lSmokingHabbit.length()<=0){
			lSmokingHabbit=THACriticalIllnessQuotationInputType.DEFAULT_SMOKING_HABBIT
		}
		Map lSmokingHabbitList=['1':'Never','2':'Occasional','3':'Frequent']
		try{
			Boolean lResult=false
			lreturn.put('SmokingHabbit','')
			lreturn.put('Result',lResult)
			String lSmokingHabbitItem=lSmokingHabbitList.get(lSmokingHabbit)
			if(!lSmokingHabbitItem){
				lSmokingHabbitItem=lSmokingHabbitList.get(THACriticalIllnessQuotationInputType.DEFAULT_SMOKING_HABBIT.toUpperCase())
			}
			lSmokingHabbit=''
			String lTagSmokingHabbitButtonKey='smokingHabit'
			String lTagSmokingHabbitButtonValue=lSmokingHabbitItem
			String lLocatorSmokingHabbitButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagSmokingHabbitButtonKey,lTagSmokingHabbitButtonValue)
			WebElement lElementSmokingHabbitButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagSmokingHabbitButtonKey,lTagSmokingHabbitButtonValue)
			if(!lElementSmokingHabbitButton){
				return lreturn
			}else{
				String lSmokingHabbitText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementSmokingHabbitButton).trim()
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSmokingHabbitButton)){
					lSmokingHabbit=lSmokingHabbitText
				}
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
	public Map inputCmsKeepDetail(String strCmsKeepDetail,String strCmsLanguage,String strCmsGenderAndMaritalStatus,String strCmsBirthDateMain,String strCmsHeight,String strCmsWeight,String strCmsInsuredOccupation,String strCmsInsuredSalary,String strCmsSmokingHabbit){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostGenderAndMaritalStatus','')
			lreturn.put('CmsPostBirthDateMain','')
			lreturn.put('CmsPostHeight','')
			lreturn.put('CmsPostWeight','')
			lreturn.put('CmsPostInsuredOccupation','')
			lreturn.put('CmsPostInsuredSalary','')
			lreturn.put('CmsPostSmokingHabbit','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCmsKeepDetailA(strCmsKeepDetail,strCmsLanguage,strCmsGenderAndMaritalStatus,strCmsBirthDateMain,strCmsHeight,strCmsWeight,strCmsInsuredOccupation,strCmsInsuredSalary,strCmsSmokingHabbit)
						break
					case 'B':
						lreturn=this.inputCmsKeepDetailB(strCmsKeepDetail,strCmsLanguage,strCmsGenderAndMaritalStatus,strCmsBirthDateMain,strCmsHeight,strCmsWeight,strCmsInsuredOccupation,strCmsInsuredSalary,strCmsSmokingHabbit)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCmsKeepDetailA(strCmsKeepDetail,strCmsLanguage,strCmsGenderAndMaritalStatus,strCmsBirthDateMain,strCmsHeight,strCmsWeight,strCmsInsuredOccupation,strCmsInsuredSalary,strCmsSmokingHabbit)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsKeepDetailA(String strCmsKeepDetail,String strCmsLanguage,String strCmsGenderAndMaritalStatus,String strCmsBirthDateMain,String strCmsHeight,String strCmsWeight,String strCmsInsuredOccupation,String strCmsInsuredSalary,String strCmsSmokingHabbit){
		Map lreturn=[:]
		String lCmsKeepDetail=strCmsKeepDetail.trim()
		if(lCmsKeepDetail.length()<=0){
			lCmsKeepDetail=THACriticalIllnessQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
		}

		String lCmsLanguage=strCmsLanguage.toUpperCase().trim()
		String lCmsGenderAndMaritalStatus=strCmsGenderAndMaritalStatus.trim()
		String lCmsBirthDateMain=strCmsBirthDateMain.trim()
		String lCmsHeight=strCmsHeight.trim()
		String lCmsWeight=strCmsWeight.trim()
		String lCmsInsuredOccupation=strCmsInsuredOccupation.trim()
		String lCmsInsuredSalary=strCmsInsuredSalary.trim()
		String lCmsSmokingHabbit=strCmsSmokingHabbit.trim()
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostHeight=''
		String lCmsPostWeight=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
		String lCmsPostSmokingHabbit=''
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostGenderAndMaritalStatus','')
			lreturn.put('CmsPostBirthDateMain','')
			lreturn.put('CmsPostHeight','')
			lreturn.put('CmsPostWeight','')
			lreturn.put('CmsPostInsuredOccupation','')
			lreturn.put('CmsPostInsuredSalary','')
			lreturn.put('CmsPostSmokingHabbit','')
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
				lreturn.put('CmsPostHeight',lCmsPostHeight)
				lreturn.put('CmsPostWeight',lCmsPostWeight)
				lreturn.put('CmsPostInsuredOccupation',lCmsPostInsuredOccupation)
				lreturn.put('CmsPostInsuredSalary',lCmsPostInsuredSalary)
				lreturn.put('CmsPostSmokingHabbit',lCmsPostSmokingHabbit)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCmsKeepDetailB(String strCmsKeepDetail,String strCmsLanguage,String strCmsGenderAndMaritalStatus,String strCmsBirthDateMain,String strCmsHeight,String strCmsWeight,String strCmsInsuredOccupation,String strCmsInsuredSalary,String strCmsSmokingHabbit){
		Map lreturn=[:]
		String lCmsKeepDetail=strCmsKeepDetail.trim()
		if(lCmsKeepDetail.length()<=0){
			lCmsKeepDetail=THACriticalIllnessQuotationInputType.DEFAULT_CMS_KEEP_DETAIL
		}

		String lCmsLanguage=strCmsLanguage.toUpperCase().trim()
		String lCmsGenderAndMaritalStatus=strCmsGenderAndMaritalStatus.trim()
		String lCmsBirthDateMain=strCmsBirthDateMain.trim()
		String lCmsHeight=strCmsHeight.trim()
		String lCmsWeight=strCmsWeight.trim()
		String lCmsInsuredOccupation=strCmsInsuredOccupation.trim()
		String lCmsInsuredSalary=strCmsInsuredSalary.trim()
		String lCmsSmokingHabbit=strCmsSmokingHabbit.trim()
		String lCmsPostLanguage=''
		String lCmsPostGenderAndMaritalStatus=''
		String lCmsPostBirthDateMain=''
		String lCmsPostHeight=''
		String lCmsPostWeight=''
		String lCmsPostInsuredOccupation=''
		String lCmsPostInsuredSalary=''
		String lCmsPostSmokingHabbit=''
		try{
			Boolean lResult=false
			lreturn.put('CmsKeepDetail','')
			lreturn.put('CmsPostLanguage','')
			lreturn.put('CmsPostGenderAndMaritalStatus','')
			lreturn.put('CmsPostBirthDateMain','')
			lreturn.put('CmsPostHeight','')
			lreturn.put('CmsPostWeight','')
			lreturn.put('CmsPostInsuredOccupation','')
			lreturn.put('CmsPostInsuredSalary','')
			lreturn.put('CmsPostSmokingHabbit','')
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
				lreturn.put('CmsPostHeight',lCmsPostHeight)
				lreturn.put('CmsPostWeight',lCmsPostWeight)
				lreturn.put('CmsPostInsuredOccupation',lCmsPostInsuredOccupation)
				lreturn.put('CmsPostInsuredSalary',lCmsPostInsuredSalary)
				lreturn.put('CmsPostSmokingHabbit',lCmsPostSmokingHabbit)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestion(String strQueryHealthCondition,String strQueryInsuredDeniedCoverage,String strQueryDiedFromCriticalIllnesses,String strQueryIndustry,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('QueryHealthCondition','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryDiedFromCriticalIllnesses','')
			lreturn.put('QueryIndustry','')
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
						lreturn=this.inputQueryQuestionA(strQueryHealthCondition,strQueryInsuredDeniedCoverage,strQueryDiedFromCriticalIllnesses,strQueryIndustry,strQueryOtherQuestion01,strQueryOtherQuestion02,strQueryOtherQuestion03,strQueryOtherQuestion04,strQueryOtherQuestion05,strQueryOtherQuestion06,strQueryOtherQuestion07,strQueryOtherQuestion08,strQueryOtherQuestion09,strQueryOtherQuestion10)
						break
					case 'B':
						lreturn=this.inputQueryQuestionB(strQueryHealthCondition,strQueryInsuredDeniedCoverage,strQueryDiedFromCriticalIllnesses,strQueryIndustry,strQueryOtherQuestion01,strQueryOtherQuestion02,strQueryOtherQuestion03,strQueryOtherQuestion04,strQueryOtherQuestion05,strQueryOtherQuestion06,strQueryOtherQuestion07,strQueryOtherQuestion08,strQueryOtherQuestion09,strQueryOtherQuestion10)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQueryQuestionA(strQueryHealthCondition,strQueryInsuredDeniedCoverage,strQueryDiedFromCriticalIllnesses,strQueryIndustry,strQueryOtherQuestion01,strQueryOtherQuestion02,strQueryOtherQuestion03,strQueryOtherQuestion04,strQueryOtherQuestion05,strQueryOtherQuestion06,strQueryOtherQuestion07,strQueryOtherQuestion08,strQueryOtherQuestion09,strQueryOtherQuestion10)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestionA(String strQueryHealthCondition,String strQueryInsuredDeniedCoverage,String strQueryDiedFromCriticalIllnesses,String strQueryIndustry,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		String lQueryHealthCondition=strQueryHealthCondition.toUpperCase().trim()
		if(lQueryHealthCondition.length()<=0){
			lQueryHealthCondition=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HEALTH_CONDITION
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryDiedFromCriticalIllnesses=strQueryDiedFromCriticalIllnesses.toUpperCase().trim()
		if(lQueryDiedFromCriticalIllnesses.length()<=0){
			lQueryDiedFromCriticalIllnesses=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES
		}
		String lQueryIndustry=strQueryIndustry.toUpperCase().trim()
		if(lQueryIndustry.length()<=0){
			lQueryIndustry=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INDUSTRY
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		Map lQueryQuestionListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
		try{
			Boolean lResult=false
			lreturn.put('QueryHealthCondition','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryDiedFromCriticalIllnesses','')
			lreturn.put('QueryIndustry','')
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
			String lQueryHealthConditionItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHealthCondition)
			if(!lQueryHealthConditionItem){
				lQueryHealthConditionItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HEALTH_CONDITION.toUpperCase())
			}
			lQueryHealthCondition=''
			Boolean lIsQueryHealthCondition=IGNUemaHelper.checkStringContainString(lQueryHealthConditionItem,'YES')
			String lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryInsuredDeniedCoverage)
			if(!lQueryInsuredDeniedCoverageItem){
				lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE.toUpperCase())
			}
			lQueryInsuredDeniedCoverage=''
			Boolean lIsQueryInsuredDeniedCoverage=IGNUemaHelper.checkStringContainString(lQueryInsuredDeniedCoverageItem,'YES')
			String lQueryDiedFromCriticalIllnessesItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryDiedFromCriticalIllnesses)
			if(!lQueryDiedFromCriticalIllnessesItem){
				lQueryDiedFromCriticalIllnessesItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES.toUpperCase())
			}
			lQueryDiedFromCriticalIllnesses=''
			Boolean lIsQueryDiedFromCriticalIllnesses=IGNUemaHelper.checkStringContainString(lQueryDiedFromCriticalIllnessesItem,'YES')
			String lQueryIndustryItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryIndustry)
			if(!lQueryIndustryItem){
				lQueryIndustryItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INDUSTRY.toUpperCase())
			}
			lQueryIndustry=''
			Boolean lIsQueryIndustry=IGNUemaHelper.checkStringContainString(lQueryIndustryItem,'YES')
			String lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion01)
			if(!lQueryOtherQuestion01Item){
				lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01.toUpperCase())
			}
			lQueryOtherQuestion01=''
			Boolean lIsQueryOtherQuestion01=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion01Item,'YES')
			String lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion02)
			if(!lQueryOtherQuestion02Item){
				lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02.toUpperCase())
			}
			lQueryOtherQuestion02=''
			Boolean lIsQueryOtherQuestion02=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion02Item,'YES')
			String lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion03)
			if(!lQueryOtherQuestion03Item){
				lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03.toUpperCase())
			}
			lQueryOtherQuestion03=''
			Boolean lIsQueryOtherQuestion03=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion03Item,'YES')
			String lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion04)
			if(!lQueryOtherQuestion04Item){
				lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04.toUpperCase())
			}
			lQueryOtherQuestion04=''
			Boolean lIsQueryOtherQuestion04=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion04Item,'YES')
			String lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion05)
			if(!lQueryOtherQuestion05Item){
				lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05.toUpperCase())
			}
			lQueryOtherQuestion05=''
			Boolean lIsQueryOtherQuestion05=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion05Item,'YES')
			String lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion06)
			if(!lQueryOtherQuestion06Item){
				lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06.toUpperCase())
			}
			lQueryOtherQuestion06=''
			Boolean lIsQueryOtherQuestion06=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion06Item,'YES')
			String lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion07)
			if(!lQueryOtherQuestion07Item){
				lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07.toUpperCase())
			}
			lQueryOtherQuestion07=''
			Boolean lIsQueryOtherQuestion07=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion07Item,'YES')
			String lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion08)
			if(!lQueryOtherQuestion08Item){
				lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08.toUpperCase())
			}
			lQueryOtherQuestion08=''
			Boolean lIsQueryOtherQuestion08=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion08Item,'YES')
			String lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion09)
			if(!lQueryOtherQuestion09Item){
				lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09.toUpperCase())
			}
			lQueryOtherQuestion09=''
			Boolean lIsQueryOtherQuestion09=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion09Item,'YES')
			String lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion10)
			if(!lQueryOtherQuestion10Item){
				lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10.toUpperCase())
			}
			lQueryOtherQuestion10=''
			Boolean lIsQueryOtherQuestion10=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryHealthCondition=false
			Boolean lIsDoneQueryInsuredDeniedCoverage=false
			Boolean lIsDoneQueryDiedFromCriticalIllnesses=false
			Boolean lIsDoneQueryIndustry=false
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
			String lTagQueryHealthConditionButtonKey='productQuestion-QCI002'
			String lTagQueryHealthConditionButtonValue=lQueryHealthConditionItem
			String lLocatorQueryHealthConditionButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
			WebElement lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
			String lTagQueryInsuredDeniedCoverageButtonKey='productQuestion-TMQ006'
			String lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
			String lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			WebElement lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			String lTagQueryDiedFromCriticalIllnessesButtonKey='productQuestion-QCI003'
			String lTagQueryDiedFromCriticalIllnessesButtonValue=lQueryDiedFromCriticalIllnessesItem
			String lLocatorQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
			WebElement lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
			String lTagQueryIndustryButtonKey='productQuestion-RJQ001'
			String lTagQueryIndustryButtonValue=lQueryIndustryItem
			String lLocatorQueryIndustryButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
			WebElement lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
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
			String lTagCheckPointNextButton01Key='getQuote'
			String lLocatorCheckPointNextButton01=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton01Key)
			WebElement lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
			Boolean lIsCheckPointNextButton01Visible=false
			String lTagCheckPointNextButton02Key='HIB'
			String lTagCheckPointNextButton02Value='1|No'
			String lLocatorCheckPointNextButton02=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCheckPointNextButton02Key,lTagCheckPointNextButton02Value)
			WebElement lElementCheckPointNextButton02=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCheckPointNextButton02Key,lTagCheckPointNextButton02Value)
			Boolean lIsCheckPointNextButton02Visible=false
			if(lElementCheckPointNextButton01){
				lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
				if(lIsCheckPointNextButton01Visible){
					lQueryHealthCondition='No Option'
					lQueryInsuredDeniedCoverage='No Option'
					lQueryDiedFromCriticalIllnesses='No Option'
					lQueryIndustry='No Option'
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
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					if(!lElementQueryHealthConditionButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					}
					if(lElementQueryHealthConditionButton){
						if(!lIsDoneQueryHealthCondition){
							lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
							if(lIsDoneQueryHealthCondition){
								lQueryHealthCondition=lQueryHealthConditionItem
								lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
							}
							if(lIsQueryHealthCondition){
								String lTagQueryHealthConditionButtonClose=''
								String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
									WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
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
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					if(!lElementQueryDiedFromCriticalIllnessesButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					}
					if(lElementQueryDiedFromCriticalIllnessesButton){
						if(!lIsDoneQueryDiedFromCriticalIllnesses){
							lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
							if(lIsDoneQueryDiedFromCriticalIllnesses){
								lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
								lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
							}
							if(lIsQueryDiedFromCriticalIllnesses){
								String lTagQueryDiedFromCriticalIllnessesButtonClose=''
								String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
									WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					if(!lElementQueryIndustryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					}
					if(lElementQueryIndustryButton){
						if(!lIsDoneQueryIndustry){
							lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
							if(lIsDoneQueryIndustry){
								lQueryIndustry=lQueryIndustryItem
								lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
							}
							if(lIsQueryIndustry){
								String lTagQueryIndustryButtonClose=''
								String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
									WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
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
			if(lElementCheckPointNextButton02){
				lIsCheckPointNextButton02Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton02)
				if(lIsCheckPointNextButton02Visible){
					lQueryHealthCondition='No Option'
					lQueryInsuredDeniedCoverage='No Option'
					lQueryDiedFromCriticalIllnesses='No Option'
					lQueryIndustry='No Option'
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
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					if(!lElementQueryHealthConditionButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					}
					if(lElementQueryHealthConditionButton){
						if(!lIsDoneQueryHealthCondition){
							lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
							if(lIsDoneQueryHealthCondition){
								lQueryHealthCondition=lQueryHealthConditionItem
								lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
							}
							if(lIsQueryHealthCondition){
								String lTagQueryHealthConditionButtonClose=''
								String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
									WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
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
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					if(!lElementQueryDiedFromCriticalIllnessesButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					}
					if(lElementQueryDiedFromCriticalIllnessesButton){
						if(!lIsDoneQueryDiedFromCriticalIllnesses){
							lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
							if(lIsDoneQueryDiedFromCriticalIllnesses){
								lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
								lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
							}
							if(lIsQueryDiedFromCriticalIllnesses){
								String lTagQueryDiedFromCriticalIllnessesButtonClose=''
								String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
									WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					if(!lElementQueryIndustryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					}
					if(lElementQueryIndustryButton){
						if(!lIsDoneQueryIndustry){
							lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
							if(lIsDoneQueryIndustry){
								lQueryIndustry=lQueryIndustryItem
								lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
							}
							if(lIsQueryIndustry){
								String lTagQueryIndustryButtonClose=''
								String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
									WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
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
			for(lIndexTry=1;lIndexTry<=25;lIndexTry++){
				lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
				if(!lElementQueryHealthConditionButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
				}
				if(lElementQueryHealthConditionButton){
					if(!lIsDoneQueryHealthCondition){
						lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
						if(lIsDoneQueryHealthCondition){
							lQueryHealthCondition=lQueryHealthConditionItem
							lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryHealthCondition){
							String lTagQueryHealthConditionButtonClose=''
							String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
								WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
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
				lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
				if(!lElementQueryDiedFromCriticalIllnessesButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
				}
				if(lElementQueryDiedFromCriticalIllnessesButton){
					if(!lIsDoneQueryDiedFromCriticalIllnesses){
						lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
						if(lIsDoneQueryDiedFromCriticalIllnesses){
							lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
							lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryDiedFromCriticalIllnesses){
							String lTagQueryDiedFromCriticalIllnessesButtonClose=''
							String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
								WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
				if(!lElementQueryIndustryButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
				}
				if(lElementQueryIndustryButton){
					if(!lIsDoneQueryIndustry){
						lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
						if(lIsDoneQueryIndustry){
							lQueryIndustry=lQueryIndustryItem
							lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryIndustry){
							String lTagQueryIndustryButtonClose=''
							String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
								WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
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
				lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
				if(lElementCheckPointNextButton01){
					lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
					if(lIsCheckPointNextButton01Visible){
						break
					}
				}
				lElementCheckPointNextButton02=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCheckPointNextButton02Key,lTagCheckPointNextButton02Value)
				if(lElementCheckPointNextButton02){
					lIsCheckPointNextButton02Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton02)
					if(lIsCheckPointNextButton02Visible){
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
			if(!lElementQueryHealthConditionButton){
				lQueryHealthCondition='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHealthCondition
			}
			if(!lElementQueryInsuredDeniedCoverageButton){
				lQueryInsuredDeniedCoverage='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryInsuredDeniedCoverage
			}
			if(!lElementQueryDiedFromCriticalIllnessesButton){
				lQueryDiedFromCriticalIllnesses='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryDiedFromCriticalIllnesses
			}
			if(!lElementQueryIndustryButton){
				lQueryIndustry='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryIndustry
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
				lreturn.put('QueryHealthCondition',lQueryHealthCondition)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryDiedFromCriticalIllnesses',lQueryDiedFromCriticalIllnesses)
				lreturn.put('QueryIndustry',lQueryIndustry)
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
	public Map inputQueryQuestionB(String strQueryHealthCondition,String strQueryInsuredDeniedCoverage,String strQueryDiedFromCriticalIllnesses,String strQueryIndustry,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		String lQueryHealthCondition=strQueryHealthCondition.toUpperCase().trim()
		if(lQueryHealthCondition.length()<=0){
			lQueryHealthCondition=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HEALTH_CONDITION
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryDiedFromCriticalIllnesses=strQueryDiedFromCriticalIllnesses.toUpperCase().trim()
		if(lQueryDiedFromCriticalIllnesses.length()<=0){
			lQueryDiedFromCriticalIllnesses=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES
		}
		String lQueryIndustry=strQueryIndustry.toUpperCase().trim()
		if(lQueryIndustry.length()<=0){
			lQueryIndustry=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INDUSTRY
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		Map lQueryQuestionListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
		try{
			Boolean lResult=false
			lreturn.put('QueryHealthCondition','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryDiedFromCriticalIllnesses','')
			lreturn.put('QueryIndustry','')
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
			String lQueryHealthConditionItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHealthCondition)
			if(!lQueryHealthConditionItem){
				lQueryHealthConditionItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HEALTH_CONDITION.toUpperCase())
			}
			lQueryHealthCondition=''
			Boolean lIsQueryHealthCondition=IGNUemaHelper.checkStringContainString(lQueryHealthConditionItem,'YES')
			String lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryInsuredDeniedCoverage)
			if(!lQueryInsuredDeniedCoverageItem){
				lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INSURED_DENIED_COVERAGE.toUpperCase())
			}
			lQueryInsuredDeniedCoverage=''
			Boolean lIsQueryInsuredDeniedCoverage=IGNUemaHelper.checkStringContainString(lQueryInsuredDeniedCoverageItem,'YES')
			String lQueryDiedFromCriticalIllnessesItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryDiedFromCriticalIllnesses)
			if(!lQueryDiedFromCriticalIllnessesItem){
				lQueryDiedFromCriticalIllnessesItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES.toUpperCase())
			}
			lQueryDiedFromCriticalIllnesses=''
			Boolean lIsQueryDiedFromCriticalIllnesses=IGNUemaHelper.checkStringContainString(lQueryDiedFromCriticalIllnessesItem,'YES')
			String lQueryIndustryItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryIndustry)
			if(!lQueryIndustryItem){
				lQueryIndustryItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_INDUSTRY.toUpperCase())
			}
			lQueryIndustry=''
			Boolean lIsQueryIndustry=IGNUemaHelper.checkStringContainString(lQueryIndustryItem,'YES')
			String lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion01)
			if(!lQueryOtherQuestion01Item){
				lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_01.toUpperCase())
			}
			lQueryOtherQuestion01=''
			Boolean lIsQueryOtherQuestion01=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion01Item,'YES')
			String lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion02)
			if(!lQueryOtherQuestion02Item){
				lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_02.toUpperCase())
			}
			lQueryOtherQuestion02=''
			Boolean lIsQueryOtherQuestion02=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion02Item,'YES')
			String lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion03)
			if(!lQueryOtherQuestion03Item){
				lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_03.toUpperCase())
			}
			lQueryOtherQuestion03=''
			Boolean lIsQueryOtherQuestion03=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion03Item,'YES')
			String lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion04)
			if(!lQueryOtherQuestion04Item){
				lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_04.toUpperCase())
			}
			lQueryOtherQuestion04=''
			Boolean lIsQueryOtherQuestion04=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion04Item,'YES')
			String lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion05)
			if(!lQueryOtherQuestion05Item){
				lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_05.toUpperCase())
			}
			lQueryOtherQuestion05=''
			Boolean lIsQueryOtherQuestion05=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion05Item,'YES')
			String lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion06)
			if(!lQueryOtherQuestion06Item){
				lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06.toUpperCase())
			}
			lQueryOtherQuestion06=''
			Boolean lIsQueryOtherQuestion06=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion06Item,'YES')
			String lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion07)
			if(!lQueryOtherQuestion07Item){
				lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07.toUpperCase())
			}
			lQueryOtherQuestion07=''
			Boolean lIsQueryOtherQuestion07=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion07Item,'YES')
			String lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion08)
			if(!lQueryOtherQuestion08Item){
				lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08.toUpperCase())
			}
			lQueryOtherQuestion08=''
			Boolean lIsQueryOtherQuestion08=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion08Item,'YES')
			String lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion09)
			if(!lQueryOtherQuestion09Item){
				lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09.toUpperCase())
			}
			lQueryOtherQuestion09=''
			Boolean lIsQueryOtherQuestion09=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion09Item,'YES')
			String lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion10)
			if(!lQueryOtherQuestion10Item){
				lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10.toUpperCase())
			}
			lQueryOtherQuestion10=''
			Boolean lIsQueryOtherQuestion10=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryHealthCondition=false
			Boolean lIsDoneQueryInsuredDeniedCoverage=false
			Boolean lIsDoneQueryDiedFromCriticalIllnesses=false
			Boolean lIsDoneQueryIndustry=false
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
			String lTagQueryHealthConditionButtonKey='productQuestion-QCI002'
			String lTagQueryHealthConditionButtonValue=lQueryHealthConditionItem
			String lLocatorQueryHealthConditionButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
			WebElement lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
			String lTagQueryInsuredDeniedCoverageButtonKey='productQuestion-TMQ006'
			String lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
			String lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			WebElement lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			String lTagQueryDiedFromCriticalIllnessesButtonKey='productQuestion-QCI003'
			String lTagQueryDiedFromCriticalIllnessesButtonValue=lQueryDiedFromCriticalIllnessesItem
			String lLocatorQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
			WebElement lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
			String lTagQueryIndustryButtonKey='productQuestion-RJQ001'
			String lTagQueryIndustryButtonValue=lQueryIndustryItem
			String lLocatorQueryIndustryButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
			WebElement lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
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
			String lTagCheckPointNextButton01Key='getQuote'
			String lLocatorCheckPointNextButton01=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton01Key)
			WebElement lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
			Boolean lIsCheckPointNextButton01Visible=false
			String lTagCheckPointNextButton02Key='HIB'
			String lTagCheckPointNextButton02Value='1|No'
			String lLocatorCheckPointNextButton02=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCheckPointNextButton02Key,lTagCheckPointNextButton02Value)
			WebElement lElementCheckPointNextButton02=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCheckPointNextButton02Key,lTagCheckPointNextButton02Value)
			Boolean lIsCheckPointNextButton02Visible=false
			if(lElementCheckPointNextButton01){
				lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
				if(lIsCheckPointNextButton01Visible){
					lQueryHealthCondition='No Option'
					lQueryInsuredDeniedCoverage='No Option'
					lQueryDiedFromCriticalIllnesses='No Option'
					lQueryIndustry='No Option'
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
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					if(!lElementQueryHealthConditionButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					}
					if(lElementQueryHealthConditionButton){
						if(!lIsDoneQueryHealthCondition){
							lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
							if(lIsDoneQueryHealthCondition){
								lQueryHealthCondition=lQueryHealthConditionItem
								lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
							}
							if(lIsQueryHealthCondition){
								String lTagQueryHealthConditionButtonClose=''
								String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
									WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
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
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					if(!lElementQueryDiedFromCriticalIllnessesButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					}
					if(lElementQueryDiedFromCriticalIllnessesButton){
						if(!lIsDoneQueryDiedFromCriticalIllnesses){
							lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
							if(lIsDoneQueryDiedFromCriticalIllnesses){
								lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
								lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
							}
							if(lIsQueryDiedFromCriticalIllnesses){
								String lTagQueryDiedFromCriticalIllnessesButtonClose=''
								String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
									WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					if(!lElementQueryIndustryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					}
					if(lElementQueryIndustryButton){
						if(!lIsDoneQueryIndustry){
							lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
							if(lIsDoneQueryIndustry){
								lQueryIndustry=lQueryIndustryItem
								lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
							}
							if(lIsQueryIndustry){
								String lTagQueryIndustryButtonClose=''
								String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
									WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
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
			if(lElementCheckPointNextButton02){
				lIsCheckPointNextButton02Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton02)
				if(lIsCheckPointNextButton02Visible){
					lQueryHealthCondition='No Option'
					lQueryInsuredDeniedCoverage='No Option'
					lQueryDiedFromCriticalIllnesses='No Option'
					lQueryIndustry='No Option'
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
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					if(!lElementQueryHealthConditionButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					}
					if(lElementQueryHealthConditionButton){
						if(!lIsDoneQueryHealthCondition){
							lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
							if(lIsDoneQueryHealthCondition){
								lQueryHealthCondition=lQueryHealthConditionItem
								lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
							}
							if(lIsQueryHealthCondition){
								String lTagQueryHealthConditionButtonClose=''
								String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
									WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
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
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					if(!lElementQueryDiedFromCriticalIllnessesButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					}
					if(lElementQueryDiedFromCriticalIllnessesButton){
						if(!lIsDoneQueryDiedFromCriticalIllnesses){
							lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
							if(lIsDoneQueryDiedFromCriticalIllnesses){
								lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
								lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
							}
							if(lIsQueryDiedFromCriticalIllnesses){
								String lTagQueryDiedFromCriticalIllnessesButtonClose=''
								String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
									WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					if(!lElementQueryIndustryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					}
					if(lElementQueryIndustryButton){
						if(!lIsDoneQueryIndustry){
							lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
							if(lIsDoneQueryIndustry){
								lQueryIndustry=lQueryIndustryItem
								lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
							}
							if(lIsQueryIndustry){
								String lTagQueryIndustryButtonClose=''
								String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
									WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
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
			for(lIndexTry=1;lIndexTry<=25;lIndexTry++){
				lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
				if(!lElementQueryHealthConditionButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
				}
				if(lElementQueryHealthConditionButton){
					if(!lIsDoneQueryHealthCondition){
						lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
						if(lIsDoneQueryHealthCondition){
							lQueryHealthCondition=lQueryHealthConditionItem
							lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryHealthCondition){
							String lTagQueryHealthConditionButtonClose=''
							String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
								WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
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
				lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
				if(!lElementQueryDiedFromCriticalIllnessesButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
				}
				if(lElementQueryDiedFromCriticalIllnessesButton){
					if(!lIsDoneQueryDiedFromCriticalIllnesses){
						lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
						if(lIsDoneQueryDiedFromCriticalIllnesses){
							lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
							lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryDiedFromCriticalIllnesses){
							String lTagQueryDiedFromCriticalIllnessesButtonClose=''
							String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
								WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
				if(!lElementQueryIndustryButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
				}
				if(lElementQueryIndustryButton){
					if(!lIsDoneQueryIndustry){
						lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
						if(lIsDoneQueryIndustry){
							lQueryIndustry=lQueryIndustryItem
							lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
							lIsFoundNewQuestion=true
						}
						if(lIsQueryIndustry){
							String lTagQueryIndustryButtonClose=''
							String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
								WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
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
				lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
				if(lElementCheckPointNextButton01){
					lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
					if(lIsCheckPointNextButton01Visible){
						break
					}
				}
				lElementCheckPointNextButton02=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCheckPointNextButton02Key,lTagCheckPointNextButton02Value)
				if(lElementCheckPointNextButton02){
					lIsCheckPointNextButton02Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton02)
					if(lIsCheckPointNextButton02Visible){
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
			if(!lElementQueryHealthConditionButton){
				lQueryHealthCondition='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHealthCondition
			}
			if(!lElementQueryInsuredDeniedCoverageButton){
				lQueryInsuredDeniedCoverage='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryInsuredDeniedCoverage
			}
			if(!lElementQueryDiedFromCriticalIllnessesButton){
				lQueryDiedFromCriticalIllnesses='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryDiedFromCriticalIllnesses
			}
			if(!lElementQueryIndustryButton){
				lQueryIndustry='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryIndustry
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
				lreturn.put('QueryHealthCondition',lQueryHealthCondition)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryDiedFromCriticalIllnesses',lQueryDiedFromCriticalIllnesses)
				lreturn.put('QueryIndustry',lQueryIndustry)
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
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputQueryHospitalIncomeBenefitToDoA(strQueryHospitalIncomeBenefitToDo,strQueryHospitalIncomeBenefitQuestion01,strQueryHospitalIncomeBenefitQuestion02,strQueryHospitalIncomeBenefitQuestion03,strQueryHospitalIncomeBenefitQuestion04,strQueryHospitalIncomeBenefitQuestion05,strQueryHospitalIncomeBenefitQuestion06,strQueryHospitalIncomeBenefitQuestion07,strQueryHospitalIncomeBenefitQuestion08,strQueryHospitalIncomeBenefitQuestion09,strQueryHospitalIncomeBenefitQuestion10)
						break
					case 'B':
						lreturn=this.inputQueryHospitalIncomeBenefitToDoB(strQueryHospitalIncomeBenefitToDo,strQueryHospitalIncomeBenefitQuestion01,strQueryHospitalIncomeBenefitQuestion02,strQueryHospitalIncomeBenefitQuestion03,strQueryHospitalIncomeBenefitQuestion04,strQueryHospitalIncomeBenefitQuestion05,strQueryHospitalIncomeBenefitQuestion06,strQueryHospitalIncomeBenefitQuestion07,strQueryHospitalIncomeBenefitQuestion08,strQueryHospitalIncomeBenefitQuestion09,strQueryHospitalIncomeBenefitQuestion10)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputQueryHospitalIncomeBenefitToDoA(strQueryHospitalIncomeBenefitToDo,strQueryHospitalIncomeBenefitQuestion01,strQueryHospitalIncomeBenefitQuestion02,strQueryHospitalIncomeBenefitQuestion03,strQueryHospitalIncomeBenefitQuestion04,strQueryHospitalIncomeBenefitQuestion05,strQueryHospitalIncomeBenefitQuestion06,strQueryHospitalIncomeBenefitQuestion07,strQueryHospitalIncomeBenefitQuestion08,strQueryHospitalIncomeBenefitQuestion09,strQueryHospitalIncomeBenefitQuestion10)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryHospitalIncomeBenefitToDoA(String strQueryHospitalIncomeBenefitToDo,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lQueryHospitalIncomeBenefitToDo=strQueryHospitalIncomeBenefitToDo.trim()
		if(lQueryHospitalIncomeBenefitToDo.length()<=0){
			lQueryHospitalIncomeBenefitToDo=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_TO_DO
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		Map lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
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
			String lTagDivSectionQueryHospitalIncomeBenefitToDo=''
			String lLocatorDivSectionQueryHospitalIncomeBenefitToDo='#needHIB'
			WebElement lElementDivSectionQueryHospitalIncomeBenefitToDo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorDivSectionQueryHospitalIncomeBenefitToDo)
			Boolean lIsDivSectionQueryHospitalIncomeBenefitToDoDisplayed=false
			if(lElementDivSectionQueryHospitalIncomeBenefitToDo){
				lIsDivSectionQueryHospitalIncomeBenefitToDoDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementDivSectionQueryHospitalIncomeBenefitToDo)
			}
			String lTagDivSectionQueryHospitalIncomeBenefitQuestion=''
			String lLocatorDivSectionQueryHospitalIncomeBenefitQuestion='#detail-questions2'
			WebElement lElementDivSectionQueryHospitalIncomeBenefitQuestion=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorDivSectionQueryHospitalIncomeBenefitQuestion)
			Boolean lIsDivSectionQueryHospitalIncomeBenefitQuestionDisplayed=false
			if(lElementDivSectionQueryHospitalIncomeBenefitQuestion){
				lIsDivSectionQueryHospitalIncomeBenefitQuestionDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementDivSectionQueryHospitalIncomeBenefitQuestion)
			}
			if(!lIsDivSectionQueryHospitalIncomeBenefitToDoDisplayed){
				lQueryHospitalIncomeBenefitToDo='No Option'
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
				lResult=true
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
				return lreturn
			}
			Boolean lIsQueryHospitalIncomeBenefitToDo=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitToDo,'YES')
			if(lIsQueryHospitalIncomeBenefitToDo){
				lQueryHospitalIncomeBenefitToDo='1'
			}else{
				lQueryHospitalIncomeBenefitToDo='2'
			}
			String lQueryHospitalIncomeBenefitToDoItem=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitToDo)
			if(!lQueryHospitalIncomeBenefitToDoItem){
				lQueryHospitalIncomeBenefitToDoItem=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
			}
			lQueryHospitalIncomeBenefitToDo=''
			String lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion01)
			if(!lQueryHospitalIncomeBenefitQuestion01Item){
				lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion01=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion01Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion02)
			if(!lQueryHospitalIncomeBenefitQuestion02Item){
				lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion02=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion02Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion03)
			if(!lQueryHospitalIncomeBenefitQuestion03Item){
				lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion03=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion03Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion04)
			if(!lQueryHospitalIncomeBenefitQuestion04Item){
				lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion04=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion04Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion05)
			if(!lQueryHospitalIncomeBenefitQuestion05Item){
				lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion05=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion05Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion06)
			if(!lQueryHospitalIncomeBenefitQuestion06Item){
				lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion06=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion06Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion07)
			if(!lQueryHospitalIncomeBenefitQuestion07Item){
				lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion07=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion07Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion08)
			if(!lQueryHospitalIncomeBenefitQuestion08Item){
				lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion08=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion08Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion09)
			if(!lQueryHospitalIncomeBenefitQuestion09Item){
				lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion09=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion09Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion10)
			if(!lQueryHospitalIncomeBenefitQuestion10Item){
				lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion10=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion01=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion02=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion03=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion04=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion05=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion06=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion07=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion08=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion09=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion10=false
			String lTagQueryHospitalIncomeBenefitToDoButtonKey='HIB'
			String lTagQueryHospitalIncomeBenefitToDoButtonValue=lQueryHospitalIncomeBenefitToDoItem
			String lLocatorQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			Boolean lIsQueryHospitalIncomeBenefitToDoButtonVisible=false
			String lTagQueryHospitalIncomeBenefitQuestion01ButtonKey='productQuestion-TMQ005'
			String lTagQueryHospitalIncomeBenefitQuestion01ButtonValue=lQueryHospitalIncomeBenefitQuestion01Item
			String lLocatorQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion02ButtonKey='productQuestion-HIR01Q01'
			String lTagQueryHospitalIncomeBenefitQuestion02ButtonValue=lQueryHospitalIncomeBenefitQuestion02Item
			String lLocatorQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion03ButtonKey='productQuestion-HIR01Q03'
			String lTagQueryHospitalIncomeBenefitQuestion03ButtonValue=lQueryHospitalIncomeBenefitQuestion03Item
			String lLocatorQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion04ButtonKey='productQuestion-HIR01Q04'
			String lTagQueryHospitalIncomeBenefitQuestion04ButtonValue=lQueryHospitalIncomeBenefitQuestion04Item
			String lLocatorQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion05ButtonKey='productQuestion-HIR01Q05'
			String lTagQueryHospitalIncomeBenefitQuestion05ButtonValue=lQueryHospitalIncomeBenefitQuestion05Item
			String lLocatorQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion06ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion06ButtonValue=lQueryHospitalIncomeBenefitQuestion06Item
			String lLocatorQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion07ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion07ButtonValue=lQueryHospitalIncomeBenefitQuestion07Item
			String lLocatorQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion08ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion08ButtonValue=lQueryHospitalIncomeBenefitQuestion08Item
			String lLocatorQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion09ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion09ButtonValue=lQueryHospitalIncomeBenefitQuestion09Item
			String lLocatorQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion10ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion10ButtonValue=lQueryHospitalIncomeBenefitQuestion10Item
			String lLocatorQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
			String lTagCheckPointNextButton01Key='getQuote'
			String lLocatorCheckPointNextButton01=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton01Key)
			WebElement lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
			Boolean lIsCheckPointNextButton01Visible=false
			lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			if(!lElementQueryHospitalIncomeBenefitToDoButton){
				IGNUemaHelper.delayThreadSecond(2)
				lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			}
			if(!lElementQueryHospitalIncomeBenefitToDoButton){
				lIsDoneQueryAll=true
				lQueryHospitalIncomeBenefitToDo='No Option'
			}else{
				lIsQueryHospitalIncomeBenefitToDoButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)
				if(!lIsQueryHospitalIncomeBenefitToDoButtonVisible){
					lIsDoneQueryAll=true
					lQueryHospitalIncomeBenefitToDo='No Option'
				}else{
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)
					lQueryHospitalIncomeBenefitToDo=IGNUemaHelper.convertBooleanToString(lIsQueryHospitalIncomeBenefitToDo)
				}
			}
			if(!lIsQueryHospitalIncomeBenefitToDo){
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
				lResult=true
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
				return lreturn
			}
			if(!lIsDoneQueryAll){
				if(lIsQueryHospitalIncomeBenefitToDo){
					if(lElementCheckPointNextButton01){
						lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
						if(lIsCheckPointNextButton01Visible){
							lQueryHospitalIncomeBenefitQuestion01='No Option'
							lQueryHospitalIncomeBenefitQuestion02='No Option'
							lQueryHospitalIncomeBenefitQuestion03='No Option'
							lQueryHospitalIncomeBenefitQuestion04='No Option'
							lQueryHospitalIncomeBenefitQuestion05='No Option'
							lQueryHospitalIncomeBenefitQuestion06='No Option'
							lQueryHospitalIncomeBenefitQuestion07='No Option'
							lQueryHospitalIncomeBenefitQuestion08='No Option'
							lQueryHospitalIncomeBenefitQuestion09='No Option'
							lQueryHospitalIncomeBenefitQuestion10='No Option'
							lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion01Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
									lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
										lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
										lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion01){
										String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion02Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
									lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
										lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
										lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion02){
										String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion03Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
									lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
										lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
										lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion03){
										String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion04Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
									lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
										lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
										lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion04){
										String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion05Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
									lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
										lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
										lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion05){
										String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion06Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
									lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
										lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
										lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion06){
										String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion07Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
									lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
										lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
										lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion07){
										String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion08Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
									lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
										lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
										lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion08){
										String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion09Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
									lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
										lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
										lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion09){
										String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion10Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
									lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
										lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
										lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion10){
										String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
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
					for(lIndexTry=1;lIndexTry<=15;lIndexTry++){
						lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion01Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
								lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
									lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
									lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion01){
									String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion02Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
								lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
									lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
									lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion02){
									String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion03Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
								lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
									lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
									lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion03){
									String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion04Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
								lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
									lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
									lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion04){
									String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion05Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
								lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
									lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
									lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion05){
									String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion06Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
								lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
									lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
									lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion06){
									String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion07Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
								lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
									lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
									lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion07){
									String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion08Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
								lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
									lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
									lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion08){
									String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion09Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
								lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
									lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
									lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion09){
									String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion10Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
								lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
									lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
									lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion10){
									String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
						if(lElementCheckPointNextButton01){
							lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
							if(lIsCheckPointNextButton01Visible){
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
				}
				lIsDoneQueryAll=true
				if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
					lQueryHospitalIncomeBenefitQuestion01='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion01
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
					lQueryHospitalIncomeBenefitQuestion02='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion02
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
					lQueryHospitalIncomeBenefitQuestion03='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion03
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
					lQueryHospitalIncomeBenefitQuestion04='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion04
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
					lQueryHospitalIncomeBenefitQuestion05='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion05
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
					lQueryHospitalIncomeBenefitQuestion06='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion06
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
					lQueryHospitalIncomeBenefitQuestion07='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion07
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
					lQueryHospitalIncomeBenefitQuestion08='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion08
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
					lQueryHospitalIncomeBenefitQuestion09='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion09
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
					lQueryHospitalIncomeBenefitQuestion10='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion10
				}
			}
			lResult=lIsDoneQueryAll
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
	public Map inputQueryHospitalIncomeBenefitToDoB(String strQueryHospitalIncomeBenefitToDo,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lQueryHospitalIncomeBenefitToDo=strQueryHospitalIncomeBenefitToDo.trim()
		if(lQueryHospitalIncomeBenefitToDo.length()<=0){
			lQueryHospitalIncomeBenefitToDo=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_TO_DO
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		Map lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
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
			String lTagDivSectionQueryHospitalIncomeBenefitToDo=''
			String lLocatorDivSectionQueryHospitalIncomeBenefitToDo='#needHIB'
			WebElement lElementDivSectionQueryHospitalIncomeBenefitToDo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorDivSectionQueryHospitalIncomeBenefitToDo)
			Boolean lIsDivSectionQueryHospitalIncomeBenefitToDoDisplayed=false
			if(lElementDivSectionQueryHospitalIncomeBenefitToDo){
				lIsDivSectionQueryHospitalIncomeBenefitToDoDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementDivSectionQueryHospitalIncomeBenefitToDo)
			}
			String lTagDivSectionQueryHospitalIncomeBenefitQuestion=''
			String lLocatorDivSectionQueryHospitalIncomeBenefitQuestion='#detail-questions2'
			WebElement lElementDivSectionQueryHospitalIncomeBenefitQuestion=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorDivSectionQueryHospitalIncomeBenefitQuestion)
			Boolean lIsDivSectionQueryHospitalIncomeBenefitQuestionDisplayed=false
			if(lElementDivSectionQueryHospitalIncomeBenefitQuestion){
				lIsDivSectionQueryHospitalIncomeBenefitQuestionDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementDivSectionQueryHospitalIncomeBenefitQuestion)
			}
			if(!lIsDivSectionQueryHospitalIncomeBenefitToDoDisplayed){
				lQueryHospitalIncomeBenefitToDo='No Option'
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
				lResult=true
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
				return lreturn
			}
			Boolean lIsQueryHospitalIncomeBenefitToDo=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitToDo,'YES')
			if(lIsQueryHospitalIncomeBenefitToDo){
				lQueryHospitalIncomeBenefitToDo='1'
			}else{
				lQueryHospitalIncomeBenefitToDo='2'
			}
			String lQueryHospitalIncomeBenefitToDoItem=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitToDo)
			if(!lQueryHospitalIncomeBenefitToDoItem){
				lQueryHospitalIncomeBenefitToDoItem=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
			}
			lQueryHospitalIncomeBenefitToDo=''
			String lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion01)
			if(!lQueryHospitalIncomeBenefitQuestion01Item){
				lQueryHospitalIncomeBenefitQuestion01Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion01=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion01Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion02)
			if(!lQueryHospitalIncomeBenefitQuestion02Item){
				lQueryHospitalIncomeBenefitQuestion02Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion02=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion02Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion03)
			if(!lQueryHospitalIncomeBenefitQuestion03Item){
				lQueryHospitalIncomeBenefitQuestion03Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion03=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion03Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion04)
			if(!lQueryHospitalIncomeBenefitQuestion04Item){
				lQueryHospitalIncomeBenefitQuestion04Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion04=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion04Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion05)
			if(!lQueryHospitalIncomeBenefitQuestion05Item){
				lQueryHospitalIncomeBenefitQuestion05Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion05=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion05Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion06)
			if(!lQueryHospitalIncomeBenefitQuestion06Item){
				lQueryHospitalIncomeBenefitQuestion06Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion06=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion06Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion07)
			if(!lQueryHospitalIncomeBenefitQuestion07Item){
				lQueryHospitalIncomeBenefitQuestion07Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion07=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion07Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion08)
			if(!lQueryHospitalIncomeBenefitQuestion08Item){
				lQueryHospitalIncomeBenefitQuestion08Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion08=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion08Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion09)
			if(!lQueryHospitalIncomeBenefitQuestion09Item){
				lQueryHospitalIncomeBenefitQuestion09Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion09=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion09Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion10)
			if(!lQueryHospitalIncomeBenefitQuestion10Item){
				lQueryHospitalIncomeBenefitQuestion10Item=lQueryHospitalIncomeBenefitToDoListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion10=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion01=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion02=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion03=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion04=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion05=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion06=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion07=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion08=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion09=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion10=false
			String lTagQueryHospitalIncomeBenefitToDoButtonKey='HIB'
			String lTagQueryHospitalIncomeBenefitToDoButtonValue=lQueryHospitalIncomeBenefitToDoItem
			String lLocatorQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			Boolean lIsQueryHospitalIncomeBenefitToDoButtonVisible=false
			String lTagQueryHospitalIncomeBenefitQuestion01ButtonKey='productQuestion-TMQ005'
			String lTagQueryHospitalIncomeBenefitQuestion01ButtonValue=lQueryHospitalIncomeBenefitQuestion01Item
			String lLocatorQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion02ButtonKey='productQuestion-HIR01Q01'
			String lTagQueryHospitalIncomeBenefitQuestion02ButtonValue=lQueryHospitalIncomeBenefitQuestion02Item
			String lLocatorQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion03ButtonKey='productQuestion-HIR01Q03'
			String lTagQueryHospitalIncomeBenefitQuestion03ButtonValue=lQueryHospitalIncomeBenefitQuestion03Item
			String lLocatorQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion04ButtonKey='productQuestion-HIR01Q04'
			String lTagQueryHospitalIncomeBenefitQuestion04ButtonValue=lQueryHospitalIncomeBenefitQuestion04Item
			String lLocatorQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion05ButtonKey='productQuestion-HIR01Q05'
			String lTagQueryHospitalIncomeBenefitQuestion05ButtonValue=lQueryHospitalIncomeBenefitQuestion05Item
			String lLocatorQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion06ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion06ButtonValue=lQueryHospitalIncomeBenefitQuestion06Item
			String lLocatorQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion07ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion07ButtonValue=lQueryHospitalIncomeBenefitQuestion07Item
			String lLocatorQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion08ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion08ButtonValue=lQueryHospitalIncomeBenefitQuestion08Item
			String lLocatorQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion09ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion09ButtonValue=lQueryHospitalIncomeBenefitQuestion09Item
			String lLocatorQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion10ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion10ButtonValue=lQueryHospitalIncomeBenefitQuestion10Item
			String lLocatorQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
			String lTagCheckPointNextButton01Key='getQuote'
			String lLocatorCheckPointNextButton01=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton01Key)
			WebElement lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
			Boolean lIsCheckPointNextButton01Visible=false
			lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			if(!lElementQueryHospitalIncomeBenefitToDoButton){
				IGNUemaHelper.delayThreadSecond(2)
				lElementQueryHospitalIncomeBenefitToDoButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitToDoButtonKey,lTagQueryHospitalIncomeBenefitToDoButtonValue)
			}
			if(!lElementQueryHospitalIncomeBenefitToDoButton){
				lIsDoneQueryAll=true
				lQueryHospitalIncomeBenefitToDo='No Option'
			}else{
				lIsQueryHospitalIncomeBenefitToDoButtonVisible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)
				if(!lIsQueryHospitalIncomeBenefitToDoButtonVisible){
					lIsDoneQueryAll=true
					lQueryHospitalIncomeBenefitToDo='No Option'
				}else{
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitToDoButton)
					lQueryHospitalIncomeBenefitToDo=IGNUemaHelper.convertBooleanToString(lIsQueryHospitalIncomeBenefitToDo)
				}
			}
			if(!lIsQueryHospitalIncomeBenefitToDo){
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
				lResult=true
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
				return lreturn
			}
			if(!lIsDoneQueryAll){
				if(lIsQueryHospitalIncomeBenefitToDo){
					if(lElementCheckPointNextButton01){
						lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
						if(lIsCheckPointNextButton01Visible){
							lQueryHospitalIncomeBenefitQuestion01='No Option'
							lQueryHospitalIncomeBenefitQuestion02='No Option'
							lQueryHospitalIncomeBenefitQuestion03='No Option'
							lQueryHospitalIncomeBenefitQuestion04='No Option'
							lQueryHospitalIncomeBenefitQuestion05='No Option'
							lQueryHospitalIncomeBenefitQuestion06='No Option'
							lQueryHospitalIncomeBenefitQuestion07='No Option'
							lQueryHospitalIncomeBenefitQuestion08='No Option'
							lQueryHospitalIncomeBenefitQuestion09='No Option'
							lQueryHospitalIncomeBenefitQuestion10='No Option'
							lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion01Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
									lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
										lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
										lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion01){
										String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion02Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
									lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
										lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
										lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion02){
										String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion03Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
									lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
										lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
										lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion03){
										String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion04Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
									lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
										lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
										lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion04){
										String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion05Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
									lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
										lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
										lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion05){
										String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion06Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
									lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
										lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
										lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion06){
										String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion07Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
									lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
										lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
										lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion07){
										String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion08Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
									lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
										lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
										lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion08){
										String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion09Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
									lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
										lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
										lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion09){
										String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
										}
									}
									IGNUemaHelper.delayThreadSecond(1)
								}
							}
							lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
								IGNUemaHelper.delayThreadSecond(2)
								lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
							}
							if(lElementQueryHospitalIncomeBenefitQuestion10Button){
								if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
									lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
									if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
										lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
										lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
									}
									if(lIsQueryHospitalIncomeBenefitQuestion10){
										String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
										String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
										if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
											WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
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
					for(lIndexTry=1;lIndexTry<=15;lIndexTry++){
						lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion01Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
								lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
									lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
									lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion01){
									String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion02Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
								lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
									lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
									lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion02){
									String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion03Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
								lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
									lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
									lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion03){
									String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion04Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
								lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
									lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
									lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion04){
									String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion05Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
								lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
									lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
									lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion05){
									String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion06Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
								lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
									lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
									lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion06){
									String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion07Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
								lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
									lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
									lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion07){
									String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion08Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
								lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
									lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
									lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion08){
									String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion09Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
								lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
									lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
									lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion09){
									String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
						if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
							IGNUemaHelper.delayThreadSecond(2)
							lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
						}
						if(lElementQueryHospitalIncomeBenefitQuestion10Button){
							if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
								lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
								if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
									lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
									lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
									lIsFoundNewQuestion=true
								}
								if(lIsQueryHospitalIncomeBenefitQuestion10){
									String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
									String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
									if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
										WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
						lElementCheckPointNextButton01=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton01Key)
						if(lElementCheckPointNextButton01){
							lIsCheckPointNextButton01Visible=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCheckPointNextButton01)
							if(lIsCheckPointNextButton01Visible){
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
				}
				lIsDoneQueryAll=true
				if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
					lQueryHospitalIncomeBenefitQuestion01='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion01
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
					lQueryHospitalIncomeBenefitQuestion02='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion02
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
					lQueryHospitalIncomeBenefitQuestion03='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion03
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
					lQueryHospitalIncomeBenefitQuestion04='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion04
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
					lQueryHospitalIncomeBenefitQuestion05='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion05
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
					lQueryHospitalIncomeBenefitQuestion06='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion06
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
					lQueryHospitalIncomeBenefitQuestion07='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion07
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
					lQueryHospitalIncomeBenefitQuestion08='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion08
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
					lQueryHospitalIncomeBenefitQuestion09='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion09
				}
				if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
					lQueryHospitalIncomeBenefitQuestion10='No Option'
				}else{
					lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion10
				}
			}
			lResult=lIsDoneQueryAll
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
			String lLocatorResultPage='#sci-packages'
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
			String lLocatorResultPage='#sci-packages'
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