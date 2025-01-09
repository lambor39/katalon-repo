package org.roojai.idn.types.salesforce.lightning.claim.motor.car
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.openqa.selenium.*
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate
import org.roojai.idn.types.salesforce.lightning.claim.motor.car.IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectDriverType
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
public class IDNSalesforceLightningClaimMotorCarNewbizCreateUtil{
	private IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate parentStageController=null
	public IDNSalesforceLightningClaimMotorCarNewbizCreateUtil(IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate initStageController){
		super()
		try{
			this.parentStageController=initStageController
		}catch(Exception e){
		}
	}
	public IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate getParentStageController(){
		try{
			return this.parentStageController
		}catch(Exception e){
		}
	}
	public void setParentStageController(IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate newParentStageController){
		//Do Nothing
	}
	public Boolean inputClaimCreate(Map<String,String> caseInput,Map<String,String> caseOutput){
		Boolean lreturn=false
		String lErrorMessage=''
		try{
			String lStrSalesforceRecordID=''
			String lStrSalesforceSearchByDefaultObjectValue=''
			String lStrCssLocator=''
			Boolean lIsVisible=false
			Map lMapSearchDefaultObject=this.inputSearchBySfObject(caseInput,caseOutput)
			if(!lMapSearchDefaultObject.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObject.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObject.StrSalesforceSearchByDefaultObjectValue
			}
			List<WebElement> lListElementCreateClaimFlowButton=this.getListElementCreateClaimFlowButton()
			if(lListElementCreateClaimFlowButton.size()==0){
				return lreturn
			}
			String lStrCreateClaimFlowButtonName='Create Claim'
			Map lMapInputCreateClaimFlowButton=this.inputCreateClaimFlowButton(lListElementCreateClaimFlowButton,lStrCreateClaimFlowButtonName)
			if(!lMapInputCreateClaimFlowButton.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputCreateClaimFlowButton.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(lErrorMessage.length()>0){
				return lreturn
			}
			lStrCssLocator='c-ign-claim-reporting-form'
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lStrCssLocator,5)
			WebElement lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator,false)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			Boolean lIsInputSfNextButtonOK=false
			switch(lStrSalesforceSearchByDefaultObjectValue){
				case 'Account':
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfProductType=this.inputSfProductType(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfProductType.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfProductType.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfProductType.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfOpportunityNo=this.inputSfOpportunityNo(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfOpportunityNo.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfOpportunityNo.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfOpportunityNo.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfLossDateAndTime=this.inputSfLossDateAndTime(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfLossDateAndTime.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfLossDateAndTime.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfLossDateAndTime.Result){
						return lreturn
					}
					break
				case 'Contract':
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfLossDateAndTime=this.inputSfLossDateAndTime(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfLossDateAndTime.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfLossDateAndTime.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfLossDateAndTime.Result){
						return lreturn
					}
					break
				default:
					return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			if(lIsInputSfNextButtonOK){
				IGNUemaHelper.delayWebUISecond(5)
				lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'next')
			}
			if(lIsInputSfNextButtonOK){
				IGNUemaHelper.delayWebUISecond(5)
				lStrCssLocator='c-ign-open-claim-form'
				lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator,false)
				if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfIncidentDriver=this.inputSfIncidentDriver(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfIncidentDriver.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfIncidentDriver.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfIncidentDriver.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfAddress=this.inputSfAddress(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfAddress.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfAddress.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfAddress.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfClaimCauseAndIncidentType=this.inputSfClaimCauseAndIncidentType(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfClaimCauseAndIncidentType.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfClaimCauseAndIncidentType.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfClaimCauseAndIncidentType.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfLiability=this.inputSfLiability(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfLiability.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfLiability.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfLiability.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfWereYouTravellingOrWork=this.inputSfWereYouTravellingOrWork(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfWereYouTravellingOrWork.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfWereYouTravellingOrWork.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfWereYouTravellingOrWork.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfAppointmentPlace=this.inputSfAppointmentPlace(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfAppointmentPlace.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfAppointmentPlace.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfAppointmentPlace.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfIndependentWitness=this.inputSfIndependentWitness(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfIndependentWitness.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfIndependentWitness.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfIndependentWitness.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfCarIsDrivable=this.inputSfCarIsDrivable(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfCarIsDrivable.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfCarIsDrivable.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfCarIsDrivable.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfClaimDescription=this.inputSfClaimDescription(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfClaimDescription.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfClaimDescription.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfClaimDescription.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfAnyInjury=this.inputSfAnyInjury(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfAnyInjury.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfAnyInjury.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfAnyInjury.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfClaimReportDate=this.inputSfClaimReportDate(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfClaimReportDate.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfClaimReportDate.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfClaimReportDate.Result){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfSurveyorRequired=this.inputSfSurveyorRequired(lElementIgniteClaimReportingFormRoot)
				if(lMapInputSfSurveyorRequired.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfSurveyorRequired.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfSurveyorRequired.Result){
					return lreturn
				}
				if(lMapInputSfSurveyorRequired.IsSurveyorRequired){
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfSurveyCompany=this.inputSfSurveyCompany(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfSurveyCompany.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfSurveyCompany.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfSurveyCompany.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfSurveyorName=this.inputSfSurveyorName(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfSurveyorName.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfSurveyorName.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfSurveyorName.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfSurveyorMobileNo=this.inputSfSurveyorMobileNo(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfSurveyorMobileNo.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfSurveyorMobileNo.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfSurveyorMobileNo.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfSurveyType=this.inputSfSurveyType(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfSurveyType.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfSurveyType.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfSurveyType.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfReasonForSurveyType=this.inputSfReasonForSurveyType(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfReasonForSurveyType.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfReasonForSurveyType.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfReasonForSurveyType.Result){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Map lMapInputSfSurveyorAppointedDateAndTime=this.inputSfSurveyorAppointedDateAndTime(lElementIgniteClaimReportingFormRoot)
					if(lMapInputSfSurveyorAppointedDateAndTime.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfSurveyorAppointedDateAndTime.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfSurveyorAppointedDateAndTime.Result){
						return lreturn
					}
				}
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lStrCssLocator='c-ign-claim-additional-info-form'
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator,false)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Map lMapInputSfReportedBy=this.inputSfReportedBy(lElementIgniteClaimReportingFormRoot)
			if(lMapInputSfReportedBy.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfReportedBy.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfReportedBy.Result){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Map lMapInputSfChronologyAccident=this.inputSfChronologyAccident(lElementIgniteClaimReportingFormRoot)
			if(lMapInputSfChronologyAccident.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfChronologyAccident.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfChronologyAccident.Result){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Map lMapInputSfClaimAccidentVillage=this.inputSfClaimAccidentVillage(lElementIgniteClaimReportingFormRoot)
			if(lMapInputSfClaimAccidentVillage.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimAccidentVillage.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimAccidentVillage.Result){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'finish')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lreturn=lMapSearchDefaultObject.Result
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public Map inputSearchBySfObject(Map mapCaseDataCurrentInput,Map mapCaseDataCurrentOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentOutput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('StrSalesforceRecordId','')
			lreturn.put('StrSalesforceSearchByDefaultObjectValue','')
			lreturn.put('Result',lResult)
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			Map lMapCaseDataCurrentOutput=mapCaseDataCurrentOutput
			String lStrSalesforceRecordId=''
			String lStrSalesforceSearchByDefaultObjectValue=''
			Map lMapSearchDefaultObjectResult=IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil.inputSearchBySfObject(this.parentStageController.getWebDriver(),lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			if(!lMapSearchDefaultObjectResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordId=lMapSearchDefaultObjectResult.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObjectResult.StrSalesforceSearchByDefaultObjectValue
			}
			lResult=lStrSalesforceRecordId.length()>0
			if(lResult){
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordId)
				lreturn.put('StrSalesforceSearchByDefaultObjectValue',lStrSalesforceSearchByDefaultObjectValue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public List<WebElement> getListElementCreateClaimFlowButton(){
		List<WebElement> lreturn=null
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01SearchHomeFlexipageParent='div.recordHomeFlexipage2'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild01='div.actionsContainer'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild02='runtime_platform_actions-actions-ribbon'
			WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild02=null
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01SearchHomeFlexipageParent,5)
			if(IGNUemaHelper.checkElementPresentByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01SearchHomeFlexipageParent)){
				WebElement lElementSearch01InputLevel01SearchHomeFlexipageParent=IGNUemaHelper.getWebElementFromCssLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01SearchHomeFlexipageParent)
				if(lElementSearch01InputLevel01SearchHomeFlexipageParent){
					WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild01=IGNUemaHelper.getChildWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01SearchHomeFlexipageParent,lLocatorSearch01InputLevel01SearchHomeFlexipageChild01,true)
					if(lElementSearch01InputLevel01SearchHomeFlexipageChild01){
						lElementSearch01InputLevel01SearchHomeFlexipageChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01SearchHomeFlexipageChild01,lLocatorSearch01InputLevel01SearchHomeFlexipageChild02,true)
					}
				}
			}
			String lLocatorSearch02InputLevel01LightningButtonMenuParent='ul'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild01='li'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild02='runtime_platform_actions-action-renderer'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild03='lightning-button'
			List<WebElement> lListElementSearch02InputLevel01LightningButtonMenuChild01=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild02=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild03=null
			if(lElementSearch01InputLevel01SearchHomeFlexipageChild02){
				WebElement lElementSearch02InputLevel01LightningButtonMenuParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01SearchHomeFlexipageChild02,lLocatorSearch02InputLevel01LightningButtonMenuParent,true)
				if(lElementSearch02InputLevel01LightningButtonMenuParent){
					lListElementSearch02InputLevel01LightningButtonMenuChild01=IGNUemaHelper.getChildWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch02InputLevel01LightningButtonMenuParent,lLocatorSearch02InputLevel01LightningButtonMenuChild01)
				}
			}
			lResult=lListElementSearch02InputLevel01LightningButtonMenuChild01.size()>0
			if(lResult){
				lreturn=lListElementSearch02InputLevel01LightningButtonMenuChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputCreateClaimFlowButton(List<WebElement> listElementCreateClaimFlowButton,String strCreateClaimFlowButtonName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementCreateClaimFlowButton)){
			return lreturn
		}
		List<WebElement> lListElementCreateClaimFlowButton=listElementCreateClaimFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(strCreateClaimFlowButtonName)){
			return lreturn
		}
		String lStrCreateClaimFlowButtonName=strCreateClaimFlowButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateClaimFlowButtonName)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01LightningButtonParent='runtime_platform_actions-action-renderer'
			String lLocatorSearch01InputLevel01LightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			for(Integer lIndex=0;lIndex<=lListElementCreateClaimFlowButton.size()-1;lIndex++){
				WebElement lElementCreateClaimFlowButton=lListElementCreateClaimFlowButton.get(lIndex)
				WebElement lElementSearch01InputLevel01LightningButtonParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementCreateClaimFlowButton,lLocatorSearch01InputLevel01LightningButtonParent,true)
				String lStrCreateClaimFlowButtonValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningButtonParent,'title')
				if(lStrCreateClaimFlowButtonValue==lStrCreateClaimFlowButtonName){
					WebElement lElementSearch01InputLevel01LightningButtonChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningButtonParent,lLocatorSearch01InputLevel01LightningButtonChild01,true)
					if(lElementSearch01InputLevel01LightningButtonChild01){
						WebElement lElementSearch01InputLevel01LightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningButtonChild01,lLocatorSearch01InputLevel01LightningButtonChild02,true)
						if(lElementSearch01InputLevel01LightningButtonChild02){
							IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningButtonChild02)
							lResult=true
						}
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementIgniteClaimReportingFormRoot(String cssLocator,Boolean isIgnoreCssLocator=true){
		WebElement lreturn=null
		Boolean lResult=false
		Boolean lIsIgnoreCssLocator=isIgnoreCssLocator
		if(IGNUemaHelper.checkObjectNullOfObject(cssLocator)){
			return lreturn
		}
		String lStrCssLocator=cssLocator.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCssLocator)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-i-g-n-claim-flow'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-claim-form-app'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02=lStrCssLocator
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormOutput=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)){
				WebElement lElementSearch01InputLevel01IgniteClaimReportingFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormParent){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormParent,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01,true)
				}
			}
			if(lIsIgnoreCssLocator){
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormOutput=lElementSearch01InputLevel01IgniteClaimReportingFormChild01
					lResult=true
				}
			}
			if(!lIsIgnoreCssLocator){
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormOutput=lElementSearch01InputLevel01IgniteClaimReportingFormChild02
					lResult=true
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01IgniteClaimReportingFormOutput
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfNextButton(WebElement elementIgniteClaimReportingFormRoot,String strTargetButton){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetButton)){
			return lreturn
		}
		String lStrTargetButton=strTargetButton
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetButton)){
			return lreturn
		}
		try{
			Boolean lIsNextButtonClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=this.getElementSfTargetNextButton(lElementIgniteClaimReportingFormRoot,lStrTargetButton)
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lIsNextButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01)
				lResult=lIsNextButtonClickOK
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementSfTargetNextButton(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetButtonName){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetButtonName=strTargetButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningInputChild02='button'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			List<WebElement> lListElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningInputChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01LightningInputChild01=lListElementSearch01InputLevel01LightningInputChild01.get(lIndex)
				if(lElementSearch01InputLevel01LightningInputChild01){
					lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
				}
				if(!lElementSearch01InputLevel01LightningInputChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01LightningInputChild02){
					String lStrNameValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild02,'name')
					lStrNameValue=lStrNameValue.toLowerCase()
					lStrTargetButtonName=lStrTargetButtonName.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrNameValue,lStrTargetButtonName)){
						lResult=true
						break
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01LightningInputChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputValueSfToTargetTextArea(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetInputText=strTargetInputText
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetInputText)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-textarea'
			String lLocatorSearch01InputLevel01LightningInputChild02='textarea'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild02,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputValueSfToTargetInputTextA(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetInputText=strTargetInputText
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetInputText)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-input'
			String lLocatorSearch01InputLevel01LightningInputChild02='input'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild02,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputValueSfToTargetInputTextB(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetInputText=strTargetInputText
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetInputText)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-input'
			String lLocatorSearch01InputLevel01LightningInputChild02='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01LightningInputChild03='input'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild03=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild03){
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild03,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean clickSfToTargetButton(WebElement elementSearch01InputLevel01LightningInputParent){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild03='button'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild03=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild03){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild03)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean selectedValueSfToTargetBaseComboBoxItem(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetBaseComboBoxItemName,Boolean isContainString=false){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetBaseComboBoxItemName=strTargetBaseComboBoxItemName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetBaseComboBoxItemName)){
			return lreturn
		}
		Boolean lIsContainString=isContainString
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild03='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01LightningInputChild04='span.slds-truncate'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild03=null
			WebElement lElementSearch01InputLevel01LightningInputChild04=null
			List<WebElement> lListElementSearch01InputLevel01LightningInputChild03=[]
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lListElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03)
			}
			if(lListElementSearch01InputLevel01LightningInputChild03.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningInputChild03.size()-1;lIndex++){
					lElementSearch01InputLevel01LightningInputChild03=lListElementSearch01InputLevel01LightningInputChild03.get(lIndex)
					if(!lElementSearch01InputLevel01LightningInputChild03){
						return lreturn
					}
					if(lElementSearch01InputLevel01LightningInputChild03){
						lElementSearch01InputLevel01LightningInputChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild03,lLocatorSearch01InputLevel01LightningInputChild04,true)
					}
					if(!lElementSearch01InputLevel01LightningInputChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01LightningInputChild04){
						String lStrValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild04,'title')
						lStrValue=lStrValue.toLowerCase()
						lStrTargetBaseComboBoxItemName=lStrTargetBaseComboBoxItemName.toLowerCase()
						if(lIsContainString){
							if(IGNUemaHelper.checkStringContainString(lStrValue,lStrTargetBaseComboBoxItemName)){
								lResult=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild04)
							}
						}else{
							if(lStrValue.equalsIgnoreCase(lStrTargetBaseComboBoxItemName)){
								lResult=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01LightningInputChild04)
							}
						}
						if(lResult){
							break
						}
					}
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfProductType(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorProductType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenProductType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Product_Type')
			String lStrSfClaimMotorProductTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimMotorProductType)
			Map lMapInputSfClaimMotorProductType=this.inputSfClaimMotorProductType(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorProductTypeValue)
			if(!lMapInputSfClaimMotorProductType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimMotorProductType.ErrorMessage
			}
			lResult=lMapInputSfClaimMotorProductType.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimMotorProductType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorProductType){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorProductType)){
			return lreturn
		}
		String lStrSfClaimMotorProductType=strSfClaimMotorProductType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorProductType)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox-item'
			Boolean lIsProductTypeDropDownClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'ProductType')){
						IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsProductTypeDropDownClickOK=true
					}
					if(lIsProductTypeDropDownClickOK){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'data-value')
				lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
				lStrSfClaimMotorProductType='MotorCar'
				lStrSfClaimMotorProductType=lStrSfClaimMotorProductType.toLowerCase()
				if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,lStrSfClaimMotorProductType)){
					IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
					lIsProductTypeDropDownClickOK=true
					lResult=lIsProductTypeDropDownClickOK
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfOpportunityNo(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorOpportunityNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenOpportunityNo
			Map lMapInputSfClaimMotorOpportunityNo=this.inputSfClaimMotorOpportunityNo(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorOpportunityNo)
			if(!lMapInputSfClaimMotorOpportunityNo.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimMotorOpportunityNo.ErrorMessage
			}
			lResult=lMapInputSfClaimMotorOpportunityNo.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimMotorOpportunityNo(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorOpportunityNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorOpportunityNo)){
			return lreturn
		}
		String lStrSfClaimMotorOpportunityNo=strSfClaimMotorOpportunityNo.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorOpportunityNo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='span.slds-truncate'
			Boolean lIsOpportunityNoDropDownClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'policyNumber')){
						IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsOpportunityNoDropDownClickOK=true
					}
					if(lIsOpportunityNoDropDownClickOK){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				String lStrOpportunityNoValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06,'title')
				lStrOpportunityNoValue=lStrOpportunityNoValue.toLowerCase()
				lStrSfClaimMotorOpportunityNo=lStrSfClaimMotorOpportunityNo.toLowerCase()
				if(IGNUemaHelper.checkStringContainString(lStrOpportunityNoValue,lStrSfClaimMotorOpportunityNo)){
					IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
					lIsOpportunityNoDropDownClickOK=true
					lResult=lIsOpportunityNoDropDownClickOK
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfLossDateAndTime(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorLossDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimRequiredLossDate
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Required_Loss_Date')
			String lStrSfClaimMotorLossDateValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimMotorLossDate)
			String lStrSfClaimMotorLossTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimLossDateTime
			IGNTestManager lIGNTestManager02=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager02.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Loss_Date_Time')
			String lStrSfClaimMotorLossTimeValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfClaimMotorLossTime)
			Map lMapInputSfClaimLossDate=this.inputSfClaimLossDate(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossDateValue)
			if(!lMapInputSfClaimLossDate.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimLossDate.ErrorMessage
			}
			lResult=lMapInputSfClaimLossDate.Result
			if(lResult){
				Map lMapInputSfClaimLossTime=this.inputSfClaimLossTime(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossTimeValue)
				if(!lMapInputSfClaimLossTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimLossTime.ErrorMessage
				}
				lResult=lMapInputSfClaimLossTime.Result
			}
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimLossDate(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorLossDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorLossDateValue)){
			//return lreturn
		}
		//String lStrSfClaimMotorLossDateValue=strSfClaimMotorLossDateValue.trim()
		String lStrSfClaimMotorLossDateValue=''
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorLossDateValue)){
			//return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					continue
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					String lStrClaimLossDateValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrClaimLossDateValue=lStrClaimLossDateValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLossDateValue,'claimLossDate')){
						lResult=IGNUemaHelper.typeSetTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'22 Nov 2024')
						break
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimLossTime(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorLossTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorLossTimeValue)){
			return lreturn
		}
		String lStrSfClaimMotorLossTimeValue=strSfClaimMotorLossTimeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorLossTimeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimLossTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					continue
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
					String lStrClaimLossTimeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06,'name')
					lStrClaimLossTimeValue=lStrClaimLossTimeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLossTimeValue,'claimLossDate')){
						IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsClaimLossTimeClickOK=true
					}
					if(lIsClaimLossTimeClickOK){
						lIsClaimLossTimeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrClaimLossTimeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrClaimLossTimeValue=lStrClaimLossTimeValue.toLowerCase()
						lStrSfClaimMotorLossTimeValue=lStrSfClaimMotorLossTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimLossTimeValue,lStrSfClaimMotorLossTimeValue)){
							lIsClaimLossTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimLossTimeClickOK
						}
						if(lResult){
							break
						}
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfIncidentDriver(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorIncidentDriver=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimIncidentDriver
			Map lMapInputSfClaimIncidentDriver=this.inputSfClaimIncidentDriver(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorIncidentDriver)
			if(!lMapInputSfClaimIncidentDriver.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimIncidentDriver.ErrorMessage
			}
			lResult=lMapInputSfClaimIncidentDriver.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIncidentDriver(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorIncidentDriver){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorIncidentDriver)){
			return lreturn
		}
		String lStrSfClaimMotorIncidentDriver=strSfClaimMotorIncidentDriver.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorIncidentDriver)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-lookup'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-lookup-desktop'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-grouped-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormParent=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'incidentPerson')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				lResult=IGNUemaHelper.typeTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lStrSfClaimMotorIncidentDriver)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild08=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild08)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			lElementSearch01InputLevel01IgniteIncidentDriverFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteIncidentDriverFormParent,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteIncidentDriverFormChild01,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(this.parentStageController.getWebDriver(),lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfAddress(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimAddress=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAddress
			Map lMapInputSfClaimAddress=this.inputSfClaimAddress(elementIgniteClaimReportingFormRoot,lStrSfClaimAddress)
			if(!lMapInputSfClaimAddress.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimAddress.ErrorMessage
			}
			lResult=lMapInputSfClaimAddress.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimAddress(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorAddress){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorAddress)){
			return lreturn
		}
		String lStrSfClaimMotorAddress=strSfClaimMotorAddress.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorAddress)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-lookup'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-lookup-desktop'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-grouped-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormParent=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'incidentLocationData_address')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
				IGNUemaHelper.typeTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimMotorAddress)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			lElementSearch01InputLevel01IgniteClaimAddressFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				lElementSearch01InputLevel01IgniteClaimAddressFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimAddressFormParent,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimAddressFormChild01,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteClaimAddressFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(this.parentStageController.getWebDriver(),lListElementSearch01InputLevel01IgniteClaimAddressFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimCauseAndIncidentType(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Integer lNumSfClaimCauseTypeIndex=0
			Integer lNumSfClaimIncidentTypeIndex=1
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimCauseAndIncidentType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimCauseAndIncidentType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Cause_And_Incident_Type')
			String lStrSfClaimCauseAndIncidentTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimCauseAndIncidentType)
			List<String>lListSfClaimCauseAndIncidentType=lStrSfClaimCauseAndIncidentTypeValue.split('[|]')
			String lStrSfClaimCauseTypeValue=lListSfClaimCauseAndIncidentType.get(lNumSfClaimCauseTypeIndex)
			String lStrSfClaimIncidentTypeValue=lListSfClaimCauseAndIncidentType.get(lNumSfClaimIncidentTypeIndex)
			Map lMapInputSfClaimCauseType=this.inputSfClaimCauseType(elementIgniteClaimReportingFormRoot,lStrSfClaimCauseTypeValue)
			if(!lMapInputSfClaimCauseType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimCauseType.ErrorMessage
			}
			lResult=lMapInputSfClaimCauseType.Result
			if(lResult){
				Map lMapInputSfClaimIncidentType=this.inputSfClaimIncidentType(elementIgniteClaimReportingFormRoot,lStrSfClaimIncidentTypeValue)
				if(!lMapInputSfClaimIncidentType.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIncidentType.ErrorMessage
				}
				lResult=lMapInputSfClaimIncidentType.Result
			}
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimCauseType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCauseTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCauseTypeValue)){
			return lreturn
		}
		String lStrSfClaimCauseTypeValue=strSfClaimCauseTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimCauseTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsClaimCauseTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCauseTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCauseTypeValue=lStrClaimCauseTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCauseTypeValue,'claimCauseType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsClaimCauseTypeClickOK){
						lIsClaimCauseTypeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrClaimCauseTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrClaimCauseTypeValue=lStrClaimCauseTypeValue.toLowerCase()
						lStrSfClaimCauseTypeValue=lStrSfClaimCauseTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimCauseTypeValue,lStrSfClaimCauseTypeValue)){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsClaimCauseTypeClickOK
						}
						if(lIsClaimCauseTypeClickOK){
							break
						}
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIncidentType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIncidentTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIncidentTypeValue)){
			return lreturn
		}
		String lStrSfClaimIncidentTypeValue=strSfClaimIncidentTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimIncidentTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsClaimCauseTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIncidentTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIncidentTypeValue=lStrClaimIncidentTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIncidentTypeValue,'claimIncidentType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsClaimCauseTypeClickOK){
						lIsClaimCauseTypeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrClaimIncidentTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrClaimIncidentTypeValue=lStrClaimIncidentTypeValue.toLowerCase()
						lStrSfClaimIncidentTypeValue=lStrSfClaimIncidentTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimIncidentTypeValue,lStrSfClaimIncidentTypeValue)){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsClaimCauseTypeClickOK
						}
						if(lIsClaimCauseTypeClickOK){
							break
						}
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfLiability(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfLiability=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenLiability
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Liability')
			String lStrSfClaimLiabilityValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfLiability)
			Map lMapInputSfClaimLiability=this.inputSfClaimLiability(elementIgniteClaimReportingFormRoot,lStrSfClaimLiabilityValue)
			if(!lMapInputSfClaimLiability.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimLiability.ErrorMessage
			}
			lResult=lMapInputSfClaimLiability.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimLiability(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimLiabilityValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimLiabilityValue)){
			return lreturn
		}
		String lStrSfClaimLiabilityValue=strSfClaimLiabilityValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimLiabilityValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'incidentReportingMotorData_liability')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimLiabilityValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim liability'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfWereYouTravellingOrWork(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfWereYouTravellingOrWork=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenWereYouTravellingToOrFromWork
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Were_You_Travelling_To_Or_From_Work')
			String lStrSfClaimWereYouTravellingOrWorkValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfWereYouTravellingOrWork)
			Map lMapInputSfClaimWereYouTravellingOrWork=this.inputSfClaimWereYouTravellingOrWork(elementIgniteClaimReportingFormRoot,lStrSfClaimWereYouTravellingOrWorkValue)
			if(!lMapInputSfClaimWereYouTravellingOrWork.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimWereYouTravellingOrWork.ErrorMessage
			}
			lResult=lMapInputSfClaimWereYouTravellingOrWork.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimWereYouTravellingOrWork(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWereYouTravellingOrWorkValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimWereYouTravellingOrWorkValue)){
			return lreturn
		}
		String lStrSfClaimWereYouTravellingOrWorkValue=strSfClaimWereYouTravellingOrWorkValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimWereYouTravellingOrWorkValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'flagUsageDriveToWork')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimWereYouTravellingOrWorkValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim were you travelling or work'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfAppointmentPlace(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimAppointmentPlaceValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAppointmentPlace
			Map lMapInputSfClaimAppointmentPlace=this.inputSfClaimAppointmentPlace(elementIgniteClaimReportingFormRoot,lStrSfClaimAppointmentPlaceValue)
			if(!lMapInputSfClaimAppointmentPlace.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimAppointmentPlace.ErrorMessage
			}
			lResult=lMapInputSfClaimAppointmentPlace.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimAppointmentPlace(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAppointmentPlaceValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAppointmentPlaceValue)){
			return lreturn
		}
		String lStrSfClaimAppointmentPlaceValue=strSfClaimAppointmentPlaceValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimAppointmentPlaceValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'surveyorData_accidentLocationLandmark')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimAppointmentPlaceValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim appointment place'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfIndependentWitness(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfIndependentWitness=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenWereYouTravellingToOrFromWork
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Were_You_Travelling_To_Or_From_Work')
			String lStrSfClaimIndependentWitnessValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfIndependentWitness)
			Map lMapInputSfClaimIndependentWitness=this.inputSfClaimIndependentWitness(elementIgniteClaimReportingFormRoot,lStrSfClaimIndependentWitnessValue)
			if(!lMapInputSfClaimIndependentWitness.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimIndependentWitness.ErrorMessage
			}
			lResult=lMapInputSfClaimIndependentWitness.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIndependentWitness(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIndependentWitnessValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIndependentWitnessValue)){
			return lreturn
		}
		String lStrSfClaimIndependentWitnessValue=strSfClaimIndependentWitnessValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimIndependentWitnessValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIndependentWitnessValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIndependentWitnessValue=lStrClaimIndependentWitnessValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIndependentWitnessValue,'incidentReportingData_independentWitness')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimIndependentWitnessValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim independent witness'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfCarIsDrivable(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfCarIsDrivable=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCarIsDrivable
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Car_Is_Drivable')
			String lStrSfClaimCarIsDrivableValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfCarIsDrivable)
			Map lMapInputSfClaimCarIsDrivable=this.inputSfClaimCarIsDrivable(elementIgniteClaimReportingFormRoot,lStrSfClaimCarIsDrivableValue)
			if(!lMapInputSfClaimCarIsDrivable.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimCarIsDrivable.ErrorMessage
			}
			lResult=lMapInputSfClaimCarIsDrivable.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimCarIsDrivable(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCarIsDrivableValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCarIsDrivableValue)){
			return lreturn
		}
		String lStrSfClaimCarIsDrivableValue=strSfClaimCarIsDrivableValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimCarIsDrivableValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCarIsDrivableValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCarIsDrivableValue=lStrClaimCarIsDrivableValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCarIsDrivableValue,'surveyorData_vehicleIsDrivable')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimCarIsDrivableValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim car is drivable'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimDescription(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimDescriptionValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimDescription
			Map lMapInputSfClaimClaimDescription=this.inputSfClaimClaimDescription(elementIgniteClaimReportingFormRoot,lStrSfClaimDescriptionValue)
			if(!lMapInputSfClaimClaimDescription.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimClaimDescription.ErrorMessage
			}
			lResult=lMapInputSfClaimClaimDescription.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimClaimDescription(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimDescriptionValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimDescriptionValue)){
			return lreturn
		}
		String lStrSfClaimDescriptionValueValue=strSfClaimDescriptionValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimDescriptionValueValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'claimDescription')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimDescriptionValueValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim description'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfAnyInjury(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfAnyInjury=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAnyInjury
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Any_Injury')
			String lStrSfClaimAnyInjuryValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfAnyInjury)
			Map lMapInputSfClaimAnyInjury=this.inputSfClaimAnyInjury(elementIgniteClaimReportingFormRoot,lStrSfClaimAnyInjuryValue)
			if(!lMapInputSfClaimAnyInjury.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimAnyInjury.ErrorMessage
			}
			lResult=lMapInputSfClaimAnyInjury.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimAnyInjury(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAnyInjuryValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAnyInjuryValue)){
			return lreturn
		}
		String lStrSfClaimAnyInjuryValue=strSfClaimAnyInjuryValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimAnyInjuryValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimAnyInjuryValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimAnyInjuryValue=lStrClaimAnyInjuryValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimAnyInjuryValue,'anyInjury')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimAnyInjuryValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim any injury'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimReportDate(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimReportDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimRequiredLossDate
			Map lMapInputSfClaimClaimReportDate=this.inputSfClaimClaimReportDate(elementIgniteClaimReportingFormRoot,lStrSfClaimReportDateValue)
			if(!lMapInputSfClaimClaimReportDate.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimClaimReportDate.ErrorMessage
			}
			lResult=lMapInputSfClaimClaimReportDate.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimClaimReportDate(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportDateValue)){
			//return lreturn
		}
		String lStrSfClaimReportDateValue=strSfClaimReportDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReportDateValue)){
			//return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrReportDateValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrReportDateValue=lStrReportDateValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrReportDateValue,'claimReportDate')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'26 Nov 2024')
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyorRequired(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lIsSurveyorRequired=false
			lreturn.put('IsSurveyorRequired',lIsSurveyorRequired)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfSurveyorRequired=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorRequiredToDo
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Surveyor_Required_To_Do')
			String lStrSfClaimSurveyorRequiredValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSurveyorRequired)
			lIsSurveyorRequired=IGNUemaHelper.convertStringToBoolean(lStrSfClaimSurveyorRequiredValue)
			Map lMapInputSfClaimSurveyorRequired=this.inputSfClaimSurveyorRequired(lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorRequiredValue)
			if(!lMapInputSfClaimSurveyorRequired.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimSurveyorRequired.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorRequired.Result
			lreturn.put('IsSurveyorRequired',lIsSurveyorRequired)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyorRequired(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorRequiredValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorRequiredValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorRequiredValue=strSfClaimSurveyorRequiredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorRequiredValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimSurveyorRequiredValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimSurveyorRequiredValue=lStrClaimSurveyorRequiredValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyorRequiredValue,'surveyorData_doYouRequireASurveyorAtTheScene')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimSurveyorRequiredValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim surveyor required'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyCompany(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyCompany=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyCompany
			Map lMapInputSfClaimSurveyCompany=this.inputSfClaimSurveyCompany(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyCompany)
			if(!lMapInputSfClaimSurveyCompany.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimSurveyCompany.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyCompany.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyCompany(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyCompany){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyCompany)){
			return lreturn
		}
		String lStrSfClaimSurveyCompany=strSfClaimSurveyCompany.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyCompany)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-lookup'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-lookup-desktop'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-grouped-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormParent=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorCompany')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
				IGNUemaHelper.typeTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimSurveyCompany)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			lElementSearch01InputLevel01IgniteClaimAddressFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.parentStageController.getWebDriver(),lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				lElementSearch01InputLevel01IgniteClaimAddressFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimAddressFormParent,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimAddressFormChild01,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteClaimAddressFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(this.parentStageController.getWebDriver(),lListElementSearch01InputLevel01IgniteClaimAddressFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyorName(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyorName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorName
			Map lMapInputSfClaimSurveyorName=this.inputSfClaimSurveyorName(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorName)
			if(!lMapInputSfClaimSurveyorName.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimSurveyorName.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorName.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyorName(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorName)){
			return lreturn
		}
		String lStrSfClaimSurveyorName=strSfClaimSurveyorName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorName)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorName')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimSurveyorName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyorMobileNo(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyorMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorMobileNo
			Map lMapInputSfClaimSurveyorMobileNo=this.inputSfClaimSurveyorMobileNo(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorMobileNo)
			if(!lMapInputSfClaimSurveyorMobileNo.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimSurveyorMobileNo.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorMobileNo.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyorMobileNo(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorMobileNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorMobileNo)){
			return lreturn
		}
		String lStrSfClaimSurveyorMobileNo=strSfClaimSurveyorMobileNo.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorMobileNo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorMobileNo')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimSurveyorMobileNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyType(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfSurveyType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Survey_Type')
			String lStrSfClaimSurveyTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSurveyType)
			Map lMapInputSfClaimSurveyType=this.inputSfClaimSurveyType(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyTypeValue)
			if(!lMapInputSfClaimSurveyType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimSurveyType.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyType.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyTypeValue)){
			return lreturn
		}
		String lStrSfClaimSurveyTypeValue=strSfClaimSurveyTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimSurveyTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimSurveyTypeValue=lStrClaimSurveyTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyTypeValue,'surveyorData_surveyType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimSurveyTypeValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim survey type'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfReasonForSurveyType(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfReasonForSurveyType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenReasonForSurveyType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Reason_For_Survey_Type')
			//String lStrSfClaimReasonForSurveyTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfReasonForSurveyType)
			String lStrSfClaimReasonForSurveyTypeValue='Others'
			Map lMapInputSfClaimReasonForSurveyType=this.inputSfClaimReasonForSurveyType(elementIgniteClaimReportingFormRoot,lStrSfClaimReasonForSurveyTypeValue)
			if(!lMapInputSfClaimReasonForSurveyType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimReasonForSurveyType.ErrorMessage
			}
			lResult=lMapInputSfClaimReasonForSurveyType.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimReasonForSurveyType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReasonForSurveyTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReasonForSurveyTypeValue)){
			return lreturn
		}
		String lStrSfClaimReasonForSurveyTypeValue=strSfClaimReasonForSurveyTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReasonForSurveyTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimReasonForSurveyTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimReasonForSurveyTypeValue=lStrClaimReasonForSurveyTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimReasonForSurveyTypeValue,'surveyorData_reasonForSurveyType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimReasonForSurveyTypeValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim reason for survey type'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyorAppointedDateAndTime(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyorAppointedDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorAppointedDate
			String lStrSfClaimSurveyorAppointedTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorAppointedTime
			/*
			 IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			 IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Surveyor_Appointed_Time')
			 String lStrSfClaimSurveyorAppointedTimeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimSurveyorAppointedTime)
			 */
			String lStrSfClaimSurveyorAppointedTimeValue=''
			Map lMapInputSfClaimSurveyorAppointedDate=this.inputSfClaimSurveyorAppointedDate(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedDateValue)
			if(!lMapInputSfClaimSurveyorAppointedDate.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimSurveyorAppointedDate.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorAppointedDate.Result
			if(lResult){
				Map lMapInputSfClaimSurveyorAppointedTime=this.inputSfClaimSurveyorAppointedTime(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedTimeValue)
				if(!lMapInputSfClaimSurveyorAppointedTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSurveyorAppointedTime.ErrorMessage
				}
				lResult=lMapInputSfClaimSurveyorAppointedTime.Result
			}
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyorAppointedDate(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorAppointedDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorAppointedDateValue)){
			//return lreturn
		}
		//String lStrSfClaimSurveyorAppointedDateValue=strSfClaimSurveyorAppointedDateValue.trim()
		String lStrSfClaimSurveyorAppointedDateValue=''
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorAppointedDateValue)){
			//return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorAppointedDateTime')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'28 Nov 2024')
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyorAppointedTime(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorAppointedTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorAppointedTimeValue)){
			//return lreturn
		}
		String lStrSfClaimSurveyorAppointedTimeValue=strSfClaimSurveyorAppointedTimeValue
		lStrSfClaimSurveyorAppointedTimeValue='07.45'
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorAppointedTimeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimSurveyorAppointedTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorAppointedDateTime')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				lIsClaimSurveyorAppointedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimSurveyorAppointedTimeClickOK){
				return lreturn
			}
			if(lIsClaimSurveyorAppointedTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimSurveyorAppointedTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrClaimSurveyorAppointedTimeValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrClaimSurveyorAppointedTimeValue=lStrClaimSurveyorAppointedTimeValue.toLowerCase()
						lStrSfClaimSurveyorAppointedTimeValue=lStrSfClaimSurveyorAppointedTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyorAppointedTimeValue,lStrSfClaimSurveyorAppointedTimeValue)){
							lIsClaimSurveyorAppointedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimSurveyorAppointedTimeClickOK
						}
						if(lIsClaimSurveyorAppointedTimeClickOK){
							break
						}
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfReportedBy(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			//String lStrSfClaimReportedByValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenReportedByValue
			String lStrSfClaimReportedByValue='asdfdgfds'
			Map lMapInputSfClaimReportedBy=this.inputSfClaimReportedBy(elementIgniteClaimReportingFormRoot,lStrSfClaimReportedByValue)
			if(!lMapInputSfClaimReportedBy.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimReportedBy.ErrorMessage
			}
			lResult=lMapInputSfClaimReportedBy.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimReportedBy(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportedByValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportedByValue)){
			return lreturn
		}
		String lStrSfClaimReportedByValue=strSfClaimReportedByValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReportedByValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'reportedBy')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetInputTextB(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimReportedByValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim reported by'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfChronologyAccident(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			//String lStrSfChronologyAccidentValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenChronologyAccident
			String lStrSfChronologyAccidentValue='sdfsdfsdfsdf'
			Map lMapInputSfClaimChronologyAccident=this.inputSfClaimChronologyAccident(elementIgniteClaimReportingFormRoot,lStrSfChronologyAccidentValue)
			if(!lMapInputSfClaimChronologyAccident.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimChronologyAccident.ErrorMessage
			}
			lResult=lMapInputSfClaimChronologyAccident.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimChronologyAccident(WebElement elementIgniteClaimReportingFormRoot,String strSfChronologyAccidentValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfChronologyAccidentValue)){
			return lreturn
		}
		String lStrSfChronologyAccidentValue=strSfChronologyAccidentValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfChronologyAccidentValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'chronologyAccident')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfChronologyAccidentValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim chronology accident'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimAccidentVillage(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			//String lStrSfClaimReportedByValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenReportedByValue
			String lStrSfClaimAccidentVillageValue='d5556'
			Map lMapInputSfClaimClaimAccidentVillage=this.inputSfClaimClaimAccidentVillage(elementIgniteClaimReportingFormRoot,lStrSfClaimAccidentVillageValue)
			if(!lMapInputSfClaimClaimAccidentVillage.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimClaimAccidentVillage.ErrorMessage
			}
			lResult=lMapInputSfClaimClaimAccidentVillage.Result
			IGNUemaHelper.delayWebUISecond(5)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimClaimAccidentVillage(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentVillageValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentVillageValue)){
			return lreturn
		}
		String lStrSfClaimAccidentVillageValue=strSfClaimAccidentVillageValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimAccidentVillageValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.parentStageController.getWebDriver(),lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'incidentLocationData_claimAccidentVillage')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetInputTextB(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimAccidentVillageValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim accident village'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
}