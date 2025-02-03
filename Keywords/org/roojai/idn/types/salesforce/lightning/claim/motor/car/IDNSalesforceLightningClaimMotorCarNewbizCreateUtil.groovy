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
import org.roojai.idn.types.salesforce.lightning.claim.motor.car.IDNSalesforceLightningClaimMotorCarNewbizCoreHelper
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
			Map lMapSearchDefaultObject=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSearchBySfObject(this.parentStageController.getWebDriver(),caseInput,caseOutput)
			if(!lMapSearchDefaultObject.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObject.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObject.StrSalesforceSearchByDefaultObjectValue
			}
			List<WebElement> lListElementCreateClaimFlowButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getListElementCreateClaimFlowButton(this.parentStageController.getWebDriver())
			if(lListElementCreateClaimFlowButton.size()==0){
				return lreturn
			}
			String lStrCreateClaimFlowButtonName='Create Claim'
			Map lMapInputCreateClaimFlowButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputCreateClaimFlowButton(this.parentStageController.getWebDriver(),lListElementCreateClaimFlowButton,lStrCreateClaimFlowButtonName)
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
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lStrCssLocator,10)
			WebElement lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator,false)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			Boolean lIsInputSfNextButtonOK=false
			switch(lStrSalesforceSearchByDefaultObjectValue){
				case 'Account':
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
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			if(lIsInputSfNextButtonOK){
				lIsInputSfNextButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,'next')
			}
			if(lIsInputSfNextButtonOK){
				lStrCssLocator='c-ign-open-claim-form'
				IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lStrCssLocator,10)
				lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator,false)
				if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
					return lreturn
				}
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
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			lStrCssLocator='c-ign-claim-additional-info-form'
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lStrCssLocator,10)
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator,false)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
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
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,'finish')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lreturn=lMapSearchDefaultObject.Result
		}catch(Exception e){
			e.printStackTrace()
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
			String lStrSfClaimMotorProductType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFirstFormProductType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_First_Form_Product_Type')
			lStrSfClaimMotorProductType=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimMotorProductType)
			Map lMapInputSfClaimMotorProductType=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimMotorProductType(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimMotorProductType)
			if(!lMapInputSfClaimMotorProductType.Result){
				lStrErrorMessage=lMapInputSfClaimMotorProductType.ErrorMessage
			}
			lResult=lMapInputSfClaimMotorProductType.Result
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
			String lStrSfClaimMotorOpportunityNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFirstFormOpportunityNo
			Map lMapInputSfClaimMotorOpportunityNo=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimMotorOpportunityNo(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimMotorOpportunityNo)
			if(!lMapInputSfClaimMotorOpportunityNo.Result){
				lStrErrorMessage=lMapInputSfClaimMotorOpportunityNo.ErrorMessage
			}
			lResult=lMapInputSfClaimMotorOpportunityNo.Result
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
			String lStrSfClaimMotorLossDateOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFirstFormClaimRequiredLossDateOffset
			String lStrSfClaimMotorLossDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFirstFormClaimRequiredLossDateValue
			Map lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimMotorLossDateOffset,lStrSfClaimMotorLossDateValue)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimMotorLossDateValue=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			String lStrSfClaimMotorLossTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFirstFormClaimLossDateTimeValue
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_First_Form_Claim_Loss_Date_Time_Value')
			String lStrSfClaimMotorLossTimeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimMotorLossTime)
			Map lMapInputSfClaimLossDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimLossDate(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossDateValue)
			if(!lMapInputSfClaimLossDate.Result){
				lStrErrorMessage=lMapInputSfClaimLossDate.ErrorMessage
			}
			lResult=lMapInputSfClaimLossDate.Result
			if(lResult){
				Map lMapInputSfClaimLossTime=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimLossTime(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossTimeValue)
				if(!lMapInputSfClaimLossTime.Result){
					lStrErrorMessage=lMapInputSfClaimLossTime.ErrorMessage
				}
				lResult=lMapInputSfClaimLossTime.Result
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
			String lStrSfClaimMotorIncidentDriver=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoIncidentDriverName
			Map lMapInputSfClaimIncidentDriver=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimIncidentDriver(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimMotorIncidentDriver)
			if(!lMapInputSfClaimIncidentDriver.Result){
				lStrErrorMessage=lMapInputSfClaimIncidentDriver.ErrorMessage
			}
			lResult=lMapInputSfClaimIncidentDriver.Result
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
			String lStrSfClaimAddress=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoAddress
			Map lMapInputSfClaimAddress=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimAddress(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimAddress)
			if(!lMapInputSfClaimAddress.Result){
				lStrErrorMessage=lMapInputSfClaimAddress.ErrorMessage
			}
			lResult=lMapInputSfClaimAddress.Result
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
			String lStrSfClaimCauseAndIncidentType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoClaimCauseAndIncidentType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_Claim_Cause_And_Incident_Type')
			String lStrSfClaimCauseAndIncidentTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimCauseAndIncidentType)
			List<String>lListSfClaimCauseAndIncidentType=lStrSfClaimCauseAndIncidentTypeValue.split('[|]')
			String lStrSfClaimCauseTypeValue=lListSfClaimCauseAndIncidentType.get(lNumSfClaimCauseTypeIndex)
			String lStrSfClaimIncidentTypeValue=lListSfClaimCauseAndIncidentType.get(lNumSfClaimIncidentTypeIndex)
			Map lMapInputSfClaimCauseType=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimCauseType(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimCauseTypeValue)
			if(!lMapInputSfClaimCauseType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimCauseType.ErrorMessage
			}
			lResult=lMapInputSfClaimCauseType.Result
			if(lResult){
				Map lMapInputSfClaimIncidentType=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimIncidentType(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimIncidentTypeValue)
				if(!lMapInputSfClaimIncidentType.Result){
					lStrErrorMessage=lMapInputSfClaimIncidentType.ErrorMessage
				}
				lResult=lMapInputSfClaimIncidentType.Result
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
			String lStrSfLiability=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoLiability
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_Liability')
			String lStrSfClaimLiabilityValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfLiability)
			Map lMapInputSfClaimLiability=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimLiability(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimLiabilityValue)
			if(!lMapInputSfClaimLiability.Result){
				lStrErrorMessage=lMapInputSfClaimLiability.ErrorMessage
			}
			lResult=lMapInputSfClaimLiability.Result
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
			String lStrSfWereYouTravellingOrWork=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoWereYouTravellingToOrFromWork
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_Were_You_Travelling_To_Or_From_Work')
			String lStrSfClaimWereYouTravellingOrWorkValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfWereYouTravellingOrWork)
			Map lMapInputSfClaimWereYouTravellingOrWork=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimWereYouTravellingOrWork(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimWereYouTravellingOrWorkValue)
			if(!lMapInputSfClaimWereYouTravellingOrWork.Result){
				lStrErrorMessage=lMapInputSfClaimWereYouTravellingOrWork.ErrorMessage
			}
			lResult=lMapInputSfClaimWereYouTravellingOrWork.Result
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
			String lStrSfClaimAppointmentPlaceValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoAppointmentPlace
			Map lMapInputSfClaimAppointmentPlace=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimAppointmentPlace(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimAppointmentPlaceValue)
			if(!lMapInputSfClaimAppointmentPlace.Result){
				lStrErrorMessage=lMapInputSfClaimAppointmentPlace.ErrorMessage
			}
			lResult=lMapInputSfClaimAppointmentPlace.Result
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
			String lStrSfIndependentWitness=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoWereYouTravellingToOrFromWork
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_Were_You_Travelling_To_Or_From_Work')
			String lStrSfClaimIndependentWitnessValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfIndependentWitness)
			Map lMapInputSfClaimIndependentWitness=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimIndependentWitness(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimIndependentWitnessValue)
			if(!lMapInputSfClaimIndependentWitness.Result){
				lStrErrorMessage=lMapInputSfClaimIndependentWitness.ErrorMessage
			}
			lResult=lMapInputSfClaimIndependentWitness.Result
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
			String lStrSfCarIsDrivable=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoCarIsDrivable
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Car_Is_Drivable')
			String lStrSfClaimCarIsDrivableValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfCarIsDrivable)
			Map lMapInputSfClaimCarIsDrivable=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimCarIsDrivable(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimCarIsDrivableValue)
			if(!lMapInputSfClaimCarIsDrivable.Result){
				lStrErrorMessage=lMapInputSfClaimCarIsDrivable.ErrorMessage
			}
			lResult=lMapInputSfClaimCarIsDrivable.Result
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
			String lStrSfClaimDescriptionValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoClaimDescription
			Map lMapInputSfClaimClaimDescription=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimClaimDescription(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimDescriptionValue)
			if(!lMapInputSfClaimClaimDescription.Result){
				lStrErrorMessage=lMapInputSfClaimClaimDescription.ErrorMessage
			}
			lResult=lMapInputSfClaimClaimDescription.Result
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
			String lStrSfAnyInjury=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoAnyInjury
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_Any_Injury')
			String lStrSfClaimAnyInjuryValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfAnyInjury)
			Map lMapInputSfClaimAnyInjury=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimAnyInjury(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimAnyInjuryValue)
			if(!lMapInputSfClaimAnyInjury.Result){
				lStrErrorMessage=lMapInputSfClaimAnyInjury.ErrorMessage
			}
			lResult=lMapInputSfClaimAnyInjury.Result
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
			String lStrSfClaimReportDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoClaimReportDateValue
			Map lMapInputSfClaimClaimReportDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimClaimReportDate(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimReportDateValue)
			if(!lMapInputSfClaimClaimReportDate.Result){
				lStrErrorMessage=lMapInputSfClaimClaimReportDate.ErrorMessage
			}
			lResult=lMapInputSfClaimClaimReportDate.Result
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
			String lStrSfSurveyorRequired=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorRequiredToDo
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Surveyor_Required_To_Do')
			String lStrSfClaimSurveyorRequiredValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSurveyorRequired)
			lIsSurveyorRequired=IGNUemaHelper.convertStringToBoolean(lStrSfClaimSurveyorRequiredValue)
			Map lMapInputSfClaimSurveyorRequired=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyorRequired(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorRequiredValue)
			if(!lMapInputSfClaimSurveyorRequired.Result){
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
			String lStrSfClaimSurveyCompany=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyCompany
			Map lMapInputSfClaimSurveyCompany=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyCompany(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyCompany)
			if(!lMapInputSfClaimSurveyCompany.Result){
				lStrErrorMessage=lMapInputSfClaimSurveyCompany.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyCompany.Result
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
			String lStrSfClaimSurveyorName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorName
			Map lMapInputSfClaimSurveyorName=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyorName(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorName)
			if(!lMapInputSfClaimSurveyorName.Result){
				lStrErrorMessage=lMapInputSfClaimSurveyorName.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorName.Result
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
			String lStrSfClaimSurveyorMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorMobileNo
			Map lMapInputSfClaimSurveyorMobileNo=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyorMobileNo(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorMobileNo)
			if(!lMapInputSfClaimSurveyorMobileNo.Result){
				lStrErrorMessage=lMapInputSfClaimSurveyorMobileNo.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorMobileNo.Result
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
			String lStrSfSurveyType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Survey_Type')
			String lStrSfClaimSurveyTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSurveyType)
			Map lMapInputSfClaimSurveyType=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyType(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyTypeValue)
			if(!lMapInputSfClaimSurveyType.Result){
				lStrErrorMessage=lMapInputSfClaimSurveyType.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyType.Result
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
			String lStrSfReasonForSurveyType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoReasonForSurveyType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Reason_For_Survey_Type')
			String lStrSfClaimReasonForSurveyTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfReasonForSurveyType)
			Map lMapInputSfClaimReasonForSurveyType=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimReasonForSurveyType(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimReasonForSurveyTypeValue)
			if(!lMapInputSfClaimReasonForSurveyType.Result){
				lStrErrorMessage=lMapInputSfClaimReasonForSurveyType.ErrorMessage
			}
			lResult=lMapInputSfClaimReasonForSurveyType.Result
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
			String lStrSfClaimSurveyorAppointedDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorAppointedDateValue
			String lStrSfClaimSurveyorAppointedTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorAppointedTimeValue
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Surveyor_Appointed_Time_Value')
			String lStrSfClaimSurveyorAppointedTimeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimSurveyorAppointedTime)
			Map lMapInputSfClaimSurveyorAppointedDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyorAppointedDate(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedDateValue)
			if(!lMapInputSfClaimSurveyorAppointedDate.Result){
				lStrErrorMessage=lMapInputSfClaimSurveyorAppointedDate.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorAppointedDate.Result
			if(lResult){
				Map lMapInputSfClaimSurveyorAppointedTime=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimSurveyorAppointedTime(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedTimeValue)
				if(!lMapInputSfClaimSurveyorAppointedTime.Result){
					lStrErrorMessage=lMapInputSfClaimSurveyorAppointedTime.ErrorMessage
				}
				lResult=lMapInputSfClaimSurveyorAppointedTime.Result
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
			String lStrSfClaimReportedByValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoReportedByName
			Map lMapInputSfClaimReportedBy=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimReportedBy(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimReportedByValue)
			if(!lMapInputSfClaimReportedBy.Result){
				lStrErrorMessage=lMapInputSfClaimReportedBy.ErrorMessage
			}
			lResult=lMapInputSfClaimReportedBy.Result
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
			String lStrSfChronologyAccidentValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoChronologyAccident
			Map lMapInputSfClaimChronologyAccident=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimChronologyAccident(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfChronologyAccidentValue)
			if(!lMapInputSfClaimChronologyAccident.Result){
				lStrErrorMessage=lMapInputSfClaimChronologyAccident.ErrorMessage
			}
			lResult=lMapInputSfClaimChronologyAccident.Result
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
			String lStrSfClaimAccidentVillageValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoClaimAccidentVillage
			Map lMapInputSfClaimClaimAccidentVillage=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfClaimClaimAccidentVillage(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimAccidentVillageValue)
			if(!lMapInputSfClaimClaimAccidentVillage.Result){
				lStrErrorMessage=lMapInputSfClaimClaimAccidentVillage.ErrorMessage
			}
			lResult=lMapInputSfClaimClaimAccidentVillage.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputCreateClaimDetailToDo(strCreateClaimDetailToDo){
		Map lreturn=[:]
		String lStrCreateClaimDetailToDo=strCreateClaimDetailToDo.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateClaimDetailToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('CreateClaimDetailToDo','')
			lreturn.put('Result',lResult)
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_To_Do')
			lStrCreateClaimDetailToDo=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrCreateClaimDetailToDo)
			lResult=lStrCreateClaimDetailToDo.length()>0
			if(lResult){
				lreturn.put('CreateClaimDetailToDo',lStrCreateClaimDetailToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}