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
	public Boolean inputClaimCreateTest(Map<String,String> caseInput,Map<String,String> caseOutput){
		Boolean lreturn=false
		String lErrorMessage=''
		try{
			String lStrSalesforceRecordID=''
			String lStrSalesforceSearchByDefaultObjectValue=''
			String lStrCssLocator=''
			Boolean lIsVisible=false
			/*
			 List<WebElement> lListElementMainButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getListElementMainButton(this.parentStageController.getWebDriver())
			 if(lListElementMainButton.size()==0){
			 return lreturn
			 }
			 String lStrMainTargetButtonName='Create Damage'
			 Map lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
			 if(lMapInputMainTargetButton.Result){
			 lErrorMessage=''
			 }else{
			 lErrorMessage=lMapInputMainTargetButton.ErrorMessage
			 }
			 caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			 if(lErrorMessage.length()>0){
			 return lreturn
			 }
			 */
			String lStrSfAdditionalDetailWhichMode=''
			Integer lNumAdditionalDetailWhichMode=0
			Map lMapInputSfAdditionalDetailWhichMode=this.inputSfAdditionalDetailWhichMode()
			if(lMapInputSfAdditionalDetailWhichMode.Result){
				lStrSfAdditionalDetailWhichMode=lMapInputSfAdditionalDetailWhichMode.AdditionalDetailWhichMode
				lNumAdditionalDetailWhichMode=lMapInputSfAdditionalDetailWhichMode.NumAdditionalDetailWhichMode
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfAdditionalDetailWhichMode.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfAdditionalDetailWhichMode.Result){
				return lreturn
			}
			Integer lNumCreateOrEditAdditionalDetailHowManyItem=0
			Map lMapInputSfCreateOrEditAdditionalDetailHowManyItem=this.inputSfCreateOrEditAdditionalDetailHowManyItem()
			if(lMapInputSfCreateOrEditAdditionalDetailHowManyItem.Result){
				lNumCreateOrEditAdditionalDetailHowManyItem=lMapInputSfCreateOrEditAdditionalDetailHowManyItem.CreateOrEditAdditionalDetailHowManyItem
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfCreateOrEditAdditionalDetailHowManyItem.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfCreateOrEditAdditionalDetailHowManyItem.Result){
				return lreturn
			}
			if(lNumCreateOrEditAdditionalDetailHowManyItem==0){
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage='CreateOrEditAdditionalDetailHowManyItem field is 0 so this case will not proceed'
				return lreturn
			}
			switch(lNumAdditionalDetailWhichMode){
				case 1:
					Map lMapInputSfAutoCreateAdditionalObjectDetail=this.inputSfAutoCreateAdditionalObjectDetail(lNumCreateOrEditAdditionalDetailHowManyItem,caseOutput)
					if(lMapInputSfAutoCreateAdditionalObjectDetail.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfAutoCreateAdditionalObjectDetail.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfAutoCreateAdditionalObjectDetail.Result){
						return lreturn
					}
					break
				case 2:
					Map lMapInputSfManualCreateAdditionalObjectDetail=this.inputSfManualCreateAdditionalObjectDetail(lNumCreateOrEditAdditionalDetailHowManyItem)
					if(lMapInputSfManualCreateAdditionalObjectDetail.Result){
						lErrorMessage=''
					}else{
						lErrorMessage=lMapInputSfManualCreateAdditionalObjectDetail.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
					if(!lMapInputSfManualCreateAdditionalObjectDetail.Result){
						return lreturn
					}
					break
				default:
					return lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public Boolean inputClaimCreate(Map<String,String> caseInput,Map<String,String> caseOutput){
		Boolean lreturn=false
		String lErrorMessage=''
		try{
			String lStrSalesforceRecordID=''
			String lStrSalesforceSearchByDefaultObjectValue=''
			String lStrCssLocator=''
			String lStrSfAdditionalDetailWhichMode=''
			Integer lNumAdditionalDetailWhichMode=0
			Integer lNumCreateOrEditAdditionalDetailHowManyItem=0
			Integer lNumCreateOrEditThirdPartyDetailHowManyItem=0
			Boolean lIsVisible=false
			Map lMapSearchDefaultObject=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSearchBySfObject(this.parentStageController.getWebDriver(),caseInput,caseOutput)
			if(!lMapSearchDefaultObject.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObject.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObject.StrSalesforceSearchByDefaultObjectValue
			}
			List<WebElement> lListElementMainButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getListElementMainButton(this.parentStageController.getWebDriver())
			if(lListElementMainButton.size()==0){
				return lreturn
			}
			String lStrMainTargetButtonName='Create Claim'
			Map lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
			if(lMapInputMainTargetButton.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputMainTargetButton.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(lErrorMessage.length()>0){
				return lreturn
			}
			lStrCssLocator='c-ign-claim-reporting-form'
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lStrCssLocator,10)
			WebElement lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator,false)
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
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
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
				lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator,false)
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
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			lStrCssLocator='c-ign-claim-additional-info-form'
			IGNUemaHelper.waitElementVisibleByLocator(this.parentStageController.getWebDriver(),lStrCssLocator,10)
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator,false)
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
			Map lMapInputSfClaimDetailNonMandatory=this.inputSfClaimProgressStatusDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimIncidentPersonInfoDetailNonMandatory=this.inputSfClaimIncidentPersonInfoDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimIncidentPersonInfoDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimIncidentPersonInfoDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimIncidentPersonInfoDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimSurveyorInfoDetailNonMandatory=this.inputSfClaimSurveyorInfoDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimSurveyorInfoDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimSurveyorInfoDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimSurveyorInfoDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimIncidentInfoDetailNonMandatory=this.inputSfClaimIncidentInfoDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimIncidentInfoDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimIncidentInfoDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimIncidentInfoDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimIncidentLocationInfoDetailNonMandatory=this.inputSfClaimIncidentLocationInfoDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimIncidentLocationInfoDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimIncidentLocationInfoDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimIncidentLocationInfoDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimAtTheSceneDetailNonMandatory=this.inputSfClaimAtTheSceneDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimAtTheSceneDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimAtTheSceneDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimAtTheSceneDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimFraudVerificationDetailNonMandatory=this.inputSfClaimFraudVerificationDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimFraudVerificationDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimFraudVerificationDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimFraudVerificationDetailNonMandatory.Result){
				return lreturn
			}
			Map lMapInputSfClaimIrregularitiesDetailNonMandatory=this.inputSfClaimIrregularitiesDetailNonMandatory(lElementIgniteClaimReportingFormRoot,caseOutput)
			if(lMapInputSfClaimIrregularitiesDetailNonMandatory.Result){
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfClaimIrregularitiesDetailNonMandatory.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfClaimIrregularitiesDetailNonMandatory.Result){
				return lreturn
			}
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,'finish')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			lElementIgniteClaimReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.getElementIgniteClaimReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			Map lMapInputSfCreateOrEditThirdPartyDetailHowManyItem=this.inputSfCreateOrEditThirdPartyDetailHowManyItem()
			if(lMapInputSfCreateOrEditThirdPartyDetailHowManyItem.Result){
				lNumCreateOrEditThirdPartyDetailHowManyItem=lMapInputSfCreateOrEditThirdPartyDetailHowManyItem.CreateOrEditThirdPartyDetailHowManyItem
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfCreateOrEditThirdPartyDetailHowManyItem.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfCreateOrEditThirdPartyDetailHowManyItem.Result){
				return lreturn
			}
			if(lNumCreateOrEditThirdPartyDetailHowManyItem>0){
				Map lMapInputSfCreateOrEditThirdPartyObjectDetail=this.inputSfCreateOrEditThirdPartyObjectDetail(lNumCreateOrEditThirdPartyDetailHowManyItem,caseOutput)
				if(lMapInputSfCreateOrEditThirdPartyObjectDetail.Result){
					lErrorMessage=''
				}else{
					lErrorMessage=lMapInputSfCreateOrEditThirdPartyObjectDetail.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
				if(!lMapInputSfCreateOrEditThirdPartyObjectDetail.Result){
					return lreturn
				}
			}
			Map lMapInputSfAdditionalDetailWhichMode=this.inputSfAdditionalDetailWhichMode()
			if(lMapInputSfAdditionalDetailWhichMode.Result){
				lStrSfAdditionalDetailWhichMode=lMapInputSfAdditionalDetailWhichMode.AdditionalDetailWhichMode
				lNumAdditionalDetailWhichMode=lMapInputSfAdditionalDetailWhichMode.NumAdditionalDetailWhichMode
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfAdditionalDetailWhichMode.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfAdditionalDetailWhichMode.Result){
				return lreturn
			}
			Map lMapInputSfCreateOrEditAdditionalDetailHowManyItem=this.inputSfCreateOrEditAdditionalDetailHowManyItem()
			if(lMapInputSfCreateOrEditAdditionalDetailHowManyItem.Result){
				lNumCreateOrEditThirdPartyDetailHowManyItem=lMapInputSfCreateOrEditAdditionalDetailHowManyItem.CreateOrEditAdditionalDetailHowManyItem
				lErrorMessage=''
			}else{
				lErrorMessage=lMapInputSfCreateOrEditAdditionalDetailHowManyItem.ErrorMessage
			}
			caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
			if(!lMapInputSfCreateOrEditAdditionalDetailHowManyItem.Result){
				return lreturn
			}
			if(lNumCreateOrEditAdditionalDetailHowManyItem>0){
				switch(lNumAdditionalDetailWhichMode){
					case 1:
						Map lMapInputSfAutoCreateAdditionalObjectDetail=this.inputSfAutoCreateAdditionalObjectDetail(lNumCreateOrEditAdditionalDetailHowManyItem,caseOutput)
						if(lMapInputSfAutoCreateAdditionalObjectDetail.Result){
							lErrorMessage=''
						}else{
							lErrorMessage=lMapInputSfAutoCreateAdditionalObjectDetail.ErrorMessage
						}
						caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
						if(!lMapInputSfAutoCreateAdditionalObjectDetail.Result){
							return lreturn
						}
						break
					case 2:
						Map lMapInputSfManualCreateAdditionalObjectDetail=this.inputSfManualCreateAdditionalObjectDetail(lNumCreateOrEditAdditionalDetailHowManyItem)
						if(lMapInputSfManualCreateAdditionalObjectDetail.Result){
							lErrorMessage=''
						}else{
							lErrorMessage=lMapInputSfManualCreateAdditionalObjectDetail.ErrorMessage
						}
						caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lErrorMessage
						if(!lMapInputSfManualCreateAdditionalObjectDetail.Result){
							return lreturn
						}
						break
					default:
						return lreturn
				}
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
			Map lMapInputSfClaimMotorProductType=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimMotorProductType(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimMotorProductType)
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
			Map lMapInputSfClaimMotorOpportunityNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimMotorOpportunityNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimMotorOpportunityNo)
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
			Map lMapInputSfClaimLossDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimLossDate(this.parentStageController.getWebDriver(),elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossDateValue)
			if(!lMapInputSfClaimLossDate.Result){
				lStrErrorMessage=lMapInputSfClaimLossDate.ErrorMessage
			}
			lResult=lMapInputSfClaimLossDate.Result
			if(lResult){
				Map lMapInputSfClaimLossTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimLossTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossTimeValue)
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
			Map lMapInputSfClaimIncidentDriver=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIncidentDriver(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimMotorIncidentDriver)
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
			Map lMapInputSfClaimAddress=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAddress(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAddress)
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
			Map lMapInputSfClaimCauseType=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimCauseType(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimCauseTypeValue)
			if(!lMapInputSfClaimCauseType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfClaimCauseType.ErrorMessage
			}
			lResult=lMapInputSfClaimCauseType.Result
			if(lResult){
				Map lMapInputSfClaimIncidentType=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIncidentType(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimIncidentTypeValue)
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
			Map lMapInputSfClaimLiability=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimLiability(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimLiabilityValue)
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
			Map lMapInputSfClaimWereYouTravellingOrWork=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimWereYouTravellingOrWork(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimWereYouTravellingOrWorkValue)
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
			Map lMapInputSfClaimAppointmentPlace=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAppointmentPlace(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAppointmentPlaceValue)
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
			Map lMapInputSfClaimIndependentWitness=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIndependentWitness(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimIndependentWitnessValue)
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
			Map lMapInputSfClaimCarIsDrivable=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimCarIsDrivable(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimCarIsDrivableValue)
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
			Map lMapInputSfClaimClaimDescription=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimClaimDescription(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimDescriptionValue)
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
			Map lMapInputSfClaimAnyInjury=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAnyInjury(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAnyInjuryValue)
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
			String lStrSfClaimReportDateOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoClaimReportDateOffset
			String lStrSfClaimReportDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoClaimReportDateValue
			Map lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimReportDateOffset,lStrSfClaimReportDateValue)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimReportDateValue=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			Map lMapInputSfClaimClaimReportDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimClaimReportDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimReportDateValue)
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
			Map lMapInputSfClaimSurveyorRequired=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorRequired(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorRequiredValue)
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
			Map lMapInputSfClaimSurveyCompany=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyCompany(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyCompany)
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
			Map lMapInputSfClaimSurveyorName=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorName(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorName)
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
			Map lMapInputSfClaimSurveyorMobileNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorMobileNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorMobileNo)
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
			Map lMapInputSfClaimSurveyType=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyType(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyTypeValue)
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
			Map lMapInputSfClaimReasonForSurveyType=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimReasonForSurveyType(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimReasonForSurveyTypeValue)
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
			String lStrSfClaimSurveyorAppointedDateOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorAppointedDateOffset
			String lStrSfClaimSurveyorAppointedDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorAppointedDateValue
			Map lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimSurveyorAppointedDateOffset,lStrSfClaimSurveyorAppointedDateValue)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimSurveyorAppointedDateValue=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			String lStrSfClaimSurveyorAppointedTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorAppointedTimeValue
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Surveyor_Appointed_Time_Value')
			String lStrSfClaimSurveyorAppointedTimeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimSurveyorAppointedTime)
			Map lMapInputSfClaimSurveyorAppointedDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorAppointedDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedDateValue)
			if(!lMapInputSfClaimSurveyorAppointedDate.Result){
				lStrErrorMessage=lMapInputSfClaimSurveyorAppointedDate.ErrorMessage
			}
			lResult=lMapInputSfClaimSurveyorAppointedDate.Result
			if(lResult){
				Map lMapInputSfClaimSurveyorAppointedTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorAppointedTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedTimeValue)
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
			Map lMapInputSfClaimReportedBy=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimReportedBy(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimReportedByValue)
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
			Map lMapInputSfClaimChronologyAccident=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimChronologyAccident(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfChronologyAccidentValue)
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
			Map lMapInputSfClaimClaimAccidentVillage=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimClaimAccidentVillage(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAccidentVillageValue)
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
	public Map inputSfClaimProgressStatusDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map lMapInputAdjustDate=[:]
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			String lStrSfClaimTouchPointStage=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoTouchpointStage
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Claim_Progress_Info_Touchpoint_Stage')
			lStrSfClaimTouchPointStage=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimTouchPointStage)
			if(lStrSfClaimTouchPointStage.length()>0){
				Map lMapInputSfTouchPointStage=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimTouchPointStage(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimTouchPointStage)
				if(lMapInputSfTouchPointStage.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfTouchPointStage.ErrorMessage
				}
				if(!lMapInputSfTouchPointStage.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfTouchPointStage.Result
			}
			String lStrSfClaimQuotationReceivedFromGarageOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoQuotationReceivedFromGarageDateOffset
			String lStrSfClaimQuotationReceivedFromGarageDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoQuotationReceivedFromGarageDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimQuotationReceivedFromGarageOffset,lStrSfClaimQuotationReceivedFromGarageDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimQuotationReceivedFromGarageDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimQuotationReceivedFromGarageDate.length()>0){
				Map lMapInputSfClaimQuotationReceivedFromGarageDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimQuotationReceivedFromGarageDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimQuotationReceivedFromGarageDate)
				if(lMapInputSfClaimQuotationReceivedFromGarageDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimQuotationReceivedFromGarageDate.ErrorMessage
				}
				if(!lMapInputSfClaimQuotationReceivedFromGarageDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimQuotationReceivedFromGarageDate.Result
			}
			String lStrSfClaimQuotationReceivedFromGarageTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoQuotationReceivedFromGarageTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Claim_Progress_Info_Quotation_Received_From_Garage_Time_Value')
			lStrSfClaimQuotationReceivedFromGarageTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimQuotationReceivedFromGarageTime)
			if(lStrSfClaimQuotationReceivedFromGarageTime.length()>0){
				Map lMapInputSfClaimQuotationReceivedFromGarageTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimQuotationReceivedFromGarageTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimQuotationReceivedFromGarageTime)
				if(lMapInputSfClaimQuotationReceivedFromGarageTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimQuotationReceivedFromGarageTime.ErrorMessage
				}
				if(!lMapInputSfClaimQuotationReceivedFromGarageTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimQuotationReceivedFromGarageTime.Result
			}
			String lStrSfClaimQuotationApprovalOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoQuotationApprovalDateOffset
			String lStrSfClaimQuotationApprovalDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoQuotationApprovalDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimQuotationApprovalOffset,lStrSfClaimQuotationApprovalDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimQuotationReceivedFromGarageDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimQuotationApprovalDate.length()>0){
				Map lMapInputSfClaimQuotationApprovalDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimQuotationApprovalDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimQuotationApprovalDate)
				if(lMapInputSfClaimQuotationApprovalDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimQuotationApprovalDate.ErrorMessage
				}
				if(!lMapInputSfClaimQuotationApprovalDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimQuotationApprovalDate.Result
			}
			String lStrSfClaimQuotationApprovalTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoQuotationApprovalTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Claim_Progress_Info_Quotation_Approval_Time_Value')
			lStrSfClaimQuotationApprovalTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimQuotationApprovalTime)
			if(lStrSfClaimQuotationApprovalTime.length()>0){
				Map lMapInputSfClaimQuotationApprovalTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimQuotationApprovalTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimQuotationApprovalTime)
				if(lMapInputSfClaimQuotationApprovalTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimQuotationApprovalTime.ErrorMessage
				}
				if(!lMapInputSfClaimQuotationApprovalTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimQuotationApprovalTime.Result
			}
			String lStrSfClaimBeginRepairOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoBeginRepairDateOffset
			String lStrSfClaimBeginRepairDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoBeginRepairDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimBeginRepairOffset,lStrSfClaimBeginRepairDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimQuotationReceivedFromGarageDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimBeginRepairDate.length()>0){
				Map lMapInputSfClaimBeginRepairDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimBeginRepairDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimBeginRepairDate)
				if(lMapInputSfClaimBeginRepairDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimBeginRepairDate.ErrorMessage
				}
				if(!lMapInputSfClaimBeginRepairDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimBeginRepairDate.Result
			}
			String lStrSfClaimBeginRepairTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoBeginRepairTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Claim_Progress_Info_Begin_Repair_Time_Value')
			lStrSfClaimBeginRepairTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimBeginRepairTime)
			if(lStrSfClaimBeginRepairTime.length()>0){
				Map lMapInputSfClaimBeginRepairTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimBeginRepairTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimBeginRepairTime)
				if(lMapInputSfClaimBeginRepairTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimBeginRepairTime.ErrorMessage
				}
				if(!lMapInputSfClaimBeginRepairTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimBeginRepairTime.Result
			}
			String lStrSfClaimFinishRepairOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoFinishRepairDateOffset
			String lStrSfClaimFinishRepairDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoFinishRepairDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimFinishRepairOffset,lStrSfClaimFinishRepairDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimQuotationReceivedFromGarageDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimFinishRepairDate.length()>0){
				Map lMapInputSfClaimFinishRepairDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimFinishRepairDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimFinishRepairDate)
				if(lMapInputSfClaimFinishRepairDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimFinishRepairDate.ErrorMessage
				}
				if(!lMapInputSfClaimFinishRepairDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimFinishRepairDate.Result
			}
			String lStrSfClaimFinishRepairTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoFinishRepairTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Claim_Progress_Info_Finish_Repair_Time_Value')
			lStrSfClaimFinishRepairTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimFinishRepairTime)
			if(lStrSfClaimFinishRepairTime.length()>0){
				Map lMapInputSfClaimFinishRepairTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimFinishRepairTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimFinishRepairTime)
				if(lMapInputSfClaimFinishRepairTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimFinishRepairTime.ErrorMessage
				}
				if(!lMapInputSfClaimFinishRepairTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimFinishRepairTime.Result
			}
			String lStrSfClaimInsurerApprovalStatus=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoInsurerApprovalStatus
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Claim_Progress_Info_Insurer_Approval_Status')
			lStrSfClaimInsurerApprovalStatus=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimInsurerApprovalStatus)
			if(lStrSfClaimInsurerApprovalStatus.length()>0){
				Map lMapInputSfClaimInsurerApprovalStatus=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimInsurerApprovalStatus(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimInsurerApprovalStatus)
				if(lMapInputSfClaimInsurerApprovalStatus.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimInsurerApprovalStatus.ErrorMessage
				}
				if(!lMapInputSfClaimInsurerApprovalStatus.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimInsurerApprovalStatus.Result
			}
			String lStrSfClaimInsurerClaimNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoInsurerClaimNo
			if(lStrSfClaimInsurerClaimNo.length()>0){
				Map lMapInputSfClaimInsurerClaimNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimInsurerClaimNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimInsurerClaimNo)
				if(lMapInputSfClaimInsurerClaimNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimInsurerClaimNo.ErrorMessage
				}
				if(!lMapInputSfClaimInsurerClaimNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimInsurerClaimNo.Result
			}
			String lStrSfClaimApprovalDateOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoApprovalDateOffset
			String lStrSfClaimApprovalDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoApprovalDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimApprovalDateOffset,lStrSfClaimApprovalDateValue)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimQuotationReceivedFromGarageDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimApprovalDateValue.length()>0){
				Map lMapInputSfClaimApprovalDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimApprovalDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimApprovalDateValue)
				if(lMapInputSfClaimApprovalDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimApprovalDate.ErrorMessage
				}
				if(!lMapInputSfClaimApprovalDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimApprovalDate.Result
			}
			String lStrSfClaimCancellationAndRejectionRemarks=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailClaimProgressInfoInsurerClaimNo
			if(lStrSfClaimCancellationAndRejectionRemarks.length()>0){
				Map lMapInputSfClaimCancellationAndRejectionRemarks=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimCancellationAndRejectionRemarks(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimCancellationAndRejectionRemarks)
				if(lMapInputSfClaimCancellationAndRejectionRemarks.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimCancellationAndRejectionRemarks.ErrorMessage
				}
				if(!lMapInputSfClaimCancellationAndRejectionRemarks.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimCancellationAndRejectionRemarks.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIncidentPersonInfoDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimIncidentDriverMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoIncidentDriverMobileNo
			if(lStrSfClaimIncidentDriverMobileNo.length()>0){
				Map lMapInputSfClaimIncidentDriverMobileNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIncidentDriverMobileNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimIncidentDriverMobileNo)
				if(lMapInputSfClaimIncidentDriverMobileNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIncidentDriverMobileNo.ErrorMessage
				}
				if(!lMapInputSfClaimIncidentDriverMobileNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIncidentDriverMobileNo.Result
			}
			String lStrSfClaimClaimantName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoClaimantName
			if(lStrSfClaimClaimantName.length()>0){
				Map lMapInputSfClaimClaimantName=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimClaimantName(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimClaimantName)
				if(lMapInputSfClaimClaimantName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimClaimantName.ErrorMessage
				}
				if(!lMapInputSfClaimClaimantName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimClaimantName.Result
			}
			String lStrSfClaimClaimantMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoClaimantMobileNo
			if(lStrSfClaimClaimantMobileNo.length()>0){
				Map lMapInputSfClaimClaimantMobileNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimClaimantMobileNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimClaimantMobileNo)
				if(lMapInputSfClaimClaimantMobileNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimClaimantMobileNo.ErrorMessage
				}
				if(!lMapInputSfClaimClaimantMobileNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimClaimantMobileNo.Result
			}
			String lStrSfClaimReportedByName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoReportedByName
			if(lStrSfClaimReportedByName.length()>0){
				Map lMapInputSfClaimantMobileNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimReportedByName(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimReportedByName)
				if(lMapInputSfClaimantMobileNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimantMobileNo.ErrorMessage
				}
				if(!lMapInputSfClaimantMobileNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimantMobileNo.Result
			}
			String lStrSfClaimReportedByMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentPersonInfoReportedByMobileNo
			if(lStrSfClaimReportedByMobileNo.length()>0){
				Map lMapInputSfClaimReportedByMobileNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimReportedByMobileNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimReportedByMobileNo)
				if(lMapInputSfClaimReportedByMobileNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimReportedByMobileNo.ErrorMessage
				}
				if(!lMapInputSfClaimReportedByMobileNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimReportedByMobileNo.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimSurveyorInfoDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map lMapInputAdjustDate=[:]
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			String lStrSfClaimDriverOnScene=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoDriverOnScene
			if(lStrSfClaimDriverOnScene.length()>0){
				Map lMapInputSfClaimDriverOnScene=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimDriverOnScene(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimDriverOnScene)
				if(lMapInputSfClaimDriverOnScene.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimDriverOnScene.ErrorMessage
				}
				if(!lMapInputSfClaimDriverOnScene.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimDriverOnScene.Result
			}
			String lStrSfClaimCarIsAtWorkshop=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoCarIsAtWorkshop
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Car_Is_At_Workshop')
			lStrSfClaimCarIsAtWorkshop=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimCarIsAtWorkshop)
			if(lStrSfClaimCarIsAtWorkshop.length()>0){
				Map lMapInputSfClaimCarIsAtWorkshop=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimCarIsAtWorkshop(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimCarIsAtWorkshop)
				if(lMapInputSfClaimCarIsAtWorkshop.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimCarIsAtWorkshop.ErrorMessage
				}
				if(!lMapInputSfClaimCarIsAtWorkshop.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimCarIsAtWorkshop.Result
			}
			String lStrSfClaimSurveyorArrivedOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorArrivedDateOffset
			String lStrSfClaimSurveyorArrivedDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorArrivedDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimSurveyorArrivedOffset,lStrSfClaimSurveyorArrivedDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimSurveyorArrivedDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimSurveyorArrivedDate.length()>0){
				Map lMapInputSfClaimSurveyorArrivedDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorArrivedDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorArrivedDate)
				if(lMapInputSfClaimSurveyorArrivedDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSurveyorArrivedDate.ErrorMessage
				}
				if(!lMapInputSfClaimSurveyorArrivedDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimSurveyorArrivedDate.Result
			}
			String lStrSfClaimSurveyorArrivedTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorArrivedTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Surveyor_Arrived_Time_Value')
			lStrSfClaimSurveyorArrivedTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimSurveyorArrivedTime)
			if(lStrSfClaimSurveyorArrivedTime.length()>0){
				Map lMapInputSfClaimSurveyorArrivedTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorArrivedTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorArrivedTime)
				if(lMapInputSfClaimSurveyorArrivedTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSurveyorArrivedTime.ErrorMessage
				}
				if(!lMapInputSfClaimSurveyorArrivedTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimSurveyorArrivedTime.Result
			}
			String lStrSfClaimSurveyorFinishedOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorFinishedDateOffset
			String lStrSfClaimSurveyorFinishedDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorFinishedDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimSurveyorFinishedOffset,lStrSfClaimSurveyorFinishedDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimSurveyorArrivedDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimSurveyorFinishedDate.length()>0){
				Map lMapInputSfClaimSurveyorFinishedDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorFinishedDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorFinishedDate)
				if(lMapInputSfClaimSurveyorFinishedDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSurveyorFinishedDate.ErrorMessage
				}
				if(!lMapInputSfClaimSurveyorFinishedDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimSurveyorFinishedDate.Result
			}
			String lStrSfClaimSurveyorFinishedTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorFinishedTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Surveyor_Info_Surveyor_Finished_Time_Value')
			lStrSfClaimSurveyorArrivedTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimSurveyorArrivedTime)
			if(lStrSfClaimSurveyorFinishedTime.length()>0){
				Map lMapInputSfClaimSurveyorFinishedTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorFinishedTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorFinishedTime)
				if(lMapInputSfClaimSurveyorFinishedTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSurveyorFinishedTime.ErrorMessage
				}
				if(!lMapInputSfClaimSurveyorFinishedTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimSurveyorFinishedTime.Result
			}
			String lStrSfClaimSurveyorReportAttached=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailSurveyorInfoSurveyorReportAttached
			if(lStrSfClaimSurveyorReportAttached.length()>0){
				Map lMapInputSfClaimSurveyorReportAttached=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSurveyorReportAttached(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorReportAttached)
				if(lMapInputSfClaimSurveyorReportAttached.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSurveyorReportAttached.ErrorMessage
				}
				if(!lMapInputSfClaimSurveyorReportAttached.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimSurveyorReportAttached.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIncidentInfoDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			String lStrSfClaimVehicleDamaged=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoVehicleDamaged
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_Vehicle_Damaged')
			lStrSfClaimVehicleDamaged=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimVehicleDamaged)
			if(lStrSfClaimVehicleDamaged.length()>0){
				Map lMapInputSfClaimVehicleDamaged=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimVehicleDamaged(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimVehicleDamaged)
				if(lMapInputSfClaimVehicleDamaged.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimVehicleDamaged.ErrorMessage
				}
				if(!lMapInputSfClaimVehicleDamaged.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimVehicleDamaged.Result
			}
			String lStrSfClaimKFK=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoKFK
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Info_KFK')
			lStrSfClaimKFK=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimKFK)
			if(lStrSfClaimKFK.length()>0){
				Map lMapInputSfClaimKFK=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimKFK(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimKFK)
				if(lMapInputSfClaimKFK.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimKFK.ErrorMessage
				}
				if(!lMapInputSfClaimKFK.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimKFK.Result
			}
			String lStrSfClaimIsDryClaim=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoIsDryClaim
			if(lStrSfClaimIsDryClaim.length()>0){
				Map lMapInputSfClaimIsDryClaim=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIsDryClaim(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimIsDryClaim)
				if(lMapInputSfClaimIsDryClaim.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIsDryClaim.ErrorMessage
				}
				if(!lMapInputSfClaimIsDryClaim.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIsDryClaim.Result
			}
			String lStrSfClaimCollisionCountByVehicle=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoCollisionCountByVehicle
			if(lStrSfClaimCollisionCountByVehicle.length()>0){
				Map lMapInputSfClaimCollisionCountByVehicle=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimCollisionCountByVehicle(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimCollisionCountByVehicle)
				if(lMapInputSfClaimCollisionCountByVehicle.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimCollisionCountByVehicle.ErrorMessage
				}
				if(!lMapInputSfClaimCollisionCountByVehicle.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimCollisionCountByVehicle.Result
			}
			String lStrSfClaimIncidentInfoTotalRejectAmount=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentInfoTotalRejectAmount
			if(lStrSfClaimIncidentInfoTotalRejectAmount.length()>0){
				Map lMapInputSfClaimIncidentInfoTotalRejectAmount=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIncidentInfoTotalRejectAmount(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimIncidentInfoTotalRejectAmount)
				if(lMapInputSfClaimIncidentInfoTotalRejectAmount.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIncidentInfoTotalRejectAmount.ErrorMessage
				}
				if(!lMapInputSfClaimIncidentInfoTotalRejectAmount.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIncidentInfoTotalRejectAmount.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIncidentLocationInfoDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			String lStrSfClaimAccidentHouseNumber=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoClaimAccidentHouseNumber
			if(lStrSfClaimAccidentHouseNumber.length()>0){
				Map lMapInputSfClaimAccidentHouseNumber=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAccidentHouseNumber(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAccidentHouseNumber)
				if(lMapInputSfClaimAccidentHouseNumber.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimAccidentHouseNumber.ErrorMessage
				}
				if(!lMapInputSfClaimAccidentHouseNumber.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimAccidentHouseNumber.Result
			}
			String lStrSfClaimAccidentRoad=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoClaimAccidentRoad
			if(lStrSfClaimAccidentRoad.length()>0){
				Map lMapInputSfClaimAccidentRoad=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAccidentRoad(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAccidentRoad)
				if(lMapInputSfClaimAccidentRoad.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimAccidentRoad.ErrorMessage
				}
				if(!lMapInputSfClaimAccidentRoad.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimAccidentRoad.Result
			}
			String lStrSfClaimAccidentCountry=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoClaimAccidentCountry
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Incident_Location_Info_Claim_Accident_Country')
			lStrSfClaimAccidentCountry=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimAccidentCountry)
			if(lStrSfClaimAccidentCountry.length()>0){
				Map lMapInputSfClaimAccidentCountry=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAccidentCountry(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAccidentCountry)
				if(lMapInputSfClaimAccidentCountry.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimAccidentCountry.ErrorMessage
				}
				if(!lMapInputSfClaimAccidentCountry.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimAccidentCountry.Result
			}
			String lStrSfClaimAccidentGeoLocationLongitude=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoAccidentGeoLocationLongitude
			if(lStrSfClaimAccidentGeoLocationLongitude.length()>0){
				Map lMapInputSfClaimAccidentGeoLocationLongitude=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAccidentGeoLocationLongitude(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAccidentGeoLocationLongitude)
				if(lMapInputSfClaimAccidentGeoLocationLongitude.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimAccidentGeoLocationLongitude.ErrorMessage
				}
				if(!lMapInputSfClaimAccidentGeoLocationLongitude.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimAccidentGeoLocationLongitude.Result
			}
			String lStrSfClaimAccidentGeoLocationLatitude=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailIncidentLocationInfoAccidentGeoLocationLatitude
			if(lStrSfClaimAccidentGeoLocationLatitude.length()>0){
				Map lMapInputSfClaimAccidentGeoLocationLatitude=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimAccidentGeoLocationLatitude(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimAccidentGeoLocationLatitude)
				if(lMapInputSfClaimAccidentGeoLocationLatitude.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimAccidentGeoLocationLatitude.ErrorMessage
				}
				if(!lMapInputSfClaimAccidentGeoLocationLatitude.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimAccidentGeoLocationLatitude.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimAtTheSceneDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map lMapInputAdjustDate=[:]
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			String lStrSfClaimPhotosTaken=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPhotosTaken
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_At_The_Scene_Info_Photos_Taken')
			lStrSfClaimPhotosTaken=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimPhotosTaken)
			if(lStrSfClaimPhotosTaken.length()>0){
				Map lMapInputSfClaimPhotosTaken=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPhotosTaken(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPhotosTaken)
				if(lMapInputSfClaimPhotosTaken.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPhotosTaken.ErrorMessage
				}
				if(!lMapInputSfClaimPhotosTaken.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPhotosTaken.Result
			}
			String lStrSfClaimTowingRequired=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoTowingRequired
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_At_The_Scene_Info_Towing_Required')
			lStrSfClaimTowingRequired=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimTowingRequired)
			if(lStrSfClaimTowingRequired.length()>0){
				Map lMapInputSfClaimTowingRequired=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimTowingRequired(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimTowingRequired)
				if(lMapInputSfClaimTowingRequired.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTowingRequired.ErrorMessage
				}
				if(!lMapInputSfClaimTowingRequired.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTowingRequired.Result
			}
			String lStrSfClaimTowingCompany=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoTowingCompany
			if(lStrSfClaimTowingCompany.length()>0){
				Map lMapInputSfClaimTowingCompany=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimTowingCompany(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimTowingCompany)
				if(lMapInputSfClaimTowingCompany.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTowingCompany.ErrorMessage
				}
				if(!lMapInputSfClaimTowingCompany.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTowingCompany.Result
			}
			String lStrSfClaimDidAnyoneCallAnAmbulance=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoDidAnyoneCallAnAmbulance
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_At_The_Scene_Info_Did_Anyone_Call_An_Ambulance')
			lStrSfClaimDidAnyoneCallAnAmbulance=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimDidAnyoneCallAnAmbulance)
			if(lStrSfClaimDidAnyoneCallAnAmbulance.length()>0){
				Map lMapInputSfClaimDidAnyoneCallAnAmbulance=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimDidAnyoneCallAnAmbulance(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimDidAnyoneCallAnAmbulance)
				if(lMapInputSfClaimDidAnyoneCallAnAmbulance.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimDidAnyoneCallAnAmbulance.ErrorMessage
				}
				if(!lMapInputSfClaimDidAnyoneCallAnAmbulance.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimDidAnyoneCallAnAmbulance.Result
			}
			//If Independent witness? is true will do below
			String lStrSfClaimWitnessName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoWitnessName
			if(lStrSfClaimWitnessName.length()>0){
				Map lMapInputSfClaimWitnessName=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimWitnessName(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimWitnessName)
				if(lMapInputSfClaimWitnessName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimWitnessName.ErrorMessage
				}
				if(!lMapInputSfClaimWitnessName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimWitnessName.Result
			}
			String lStrSfClaimWitnessPhone=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoWitnessPhone
			if(lStrSfClaimWitnessPhone.length()>0){
				Map lMapInputSfClaimWitnessPhone=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimWitnessPhone(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimWitnessPhone)
				if(lMapInputSfClaimWitnessPhone.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimWitnessPhone.ErrorMessage
				}
				if(!lMapInputSfClaimWitnessPhone.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimWitnessPhone.Result
			}
			String lStrSfClaimWitnessRelation=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoWitnessRelation
			if(lStrSfClaimWitnessRelation.length()>0){
				Map lMapInputSfClaimWitnessRelation=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimWitnessRelation(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimWitnessRelation)
				if(lMapInputSfClaimWitnessRelation.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimWitnessRelation.ErrorMessage
				}
				if(!lMapInputSfClaimWitnessRelation.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimWitnessRelation.Result
			}
			//
			String lStrSfClaimWasTheIncidentReportedToThePolice=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoWasTheIncidentReportedToThePolice
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_At_The_Scene_Info_Was_The_Incident_Reported_To_The_Police')
			lStrSfClaimWasTheIncidentReportedToThePolice=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimWasTheIncidentReportedToThePolice)
			if(lStrSfClaimDidAnyoneCallAnAmbulance.length()>0){
				Map lMapInputSfClaimWasTheIncidentReportedToThePolice=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimWasTheIncidentReportedToThePolice(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimWasTheIncidentReportedToThePolice)
				if(lMapInputSfClaimWasTheIncidentReportedToThePolice.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimWasTheIncidentReportedToThePolice.ErrorMessage
				}
				if(!lMapInputSfClaimWasTheIncidentReportedToThePolice.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimWasTheIncidentReportedToThePolice.Result
			}
			String lStrSfClaimPoliceStation=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceStation
			if(lStrSfClaimPoliceStation.length()>0){
				Map lMapInputSfClaimPoliceStation=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPoliceStation(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPoliceStation)
				if(lMapInputSfClaimPoliceStation.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPoliceStation.ErrorMessage
				}
				if(!lMapInputSfClaimPoliceStation.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPoliceStation.Result
			}
			String lStrSfClaimPoliceOfficerName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceOfficerName
			if(lStrSfClaimPoliceOfficerName.length()>0){
				Map lMapInputSfClaimPoliceOfficerName=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPoliceOfficerName(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPoliceOfficerName)
				if(lMapInputSfClaimPoliceOfficerName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPoliceOfficerName.ErrorMessage
				}
				if(!lMapInputSfClaimPoliceOfficerName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPoliceOfficerName.Result
			}
			String lStrSfClaimPoliceMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceMobileNo
			if(lStrSfClaimPoliceMobileNo.length()>0){
				Map lMapInputSfClaimPoliceMobileNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPoliceMobileNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPoliceMobileNo)
				if(lMapInputSfClaimPoliceMobileNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPoliceMobileNo.ErrorMessage
				}
				if(!lMapInputSfClaimPoliceMobileNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPoliceMobileNo.Result
			}
			String lStrSfClaimPoliceReportNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceReportNo
			if(lStrSfClaimPoliceReportNo.length()>0){
				Map lMapInputSfClaimPoliceReportNo=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPoliceReportNo(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPoliceReportNo)
				if(lMapInputSfClaimPoliceReportNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPoliceReportNo.ErrorMessage
				}
				if(!lMapInputSfClaimPoliceReportNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPoliceReportNo.Result
			}
			String lStrSfClaimPoliceReportOffset=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceReportDateOffset
			String lStrSfClaimPoliceReportDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceReportDateValue
			lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(lStrSfClaimPoliceReportOffset,lStrSfClaimPoliceReportDate)
			if(lMapInputAdjustDate.Result){
				lStrSfClaimPoliceReportDate=lMapInputAdjustDate.DateValue
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
			}
			if(!lMapInputAdjustDate.Result){
				return lreturn
			}
			if(lStrSfClaimPoliceReportDate.length()>0){
				Map lMapInputSfClaimPoliceReportDate=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPoliceReportDate(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPoliceReportDate)
				if(lMapInputSfClaimPoliceReportDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPoliceReportDate.ErrorMessage
				}
				if(!lMapInputSfClaimPoliceReportDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPoliceReportDate.Result
			}
			String lStrSfClaimPoliceReportTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailAtTheSceneInfoPoliceReportTimeValue
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_At_The_Scene_Info_Police_Report_Time_Value')
			lStrSfClaimPoliceReportTime=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimPoliceReportTime)
			if(lStrSfClaimPoliceReportTime.length()>0){
				Map lMapInputSfClaimPoliceReportTime=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimPoliceReportTime(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimPoliceReportTime)
				if(lMapInputSfClaimPoliceReportTime.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimPoliceReportTime.ErrorMessage
				}
				if(!lMapInputSfClaimPoliceReportTime.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimPoliceReportTime.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimFraudVerificationDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			String lStrSfClaimSuspectedFraud=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFraudVerificationInfoSuspectedFraud
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Fraud_Verification_Info_Suspected_Fraud')
			lStrSfClaimSuspectedFraud=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimSuspectedFraud)
			if(lStrSfClaimSuspectedFraud.length()>0){
				Map lMapInputSfClaimSuspectedFraud=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimSuspectedFraud(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimSuspectedFraud)
				if(lMapInputSfClaimSuspectedFraud.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimSuspectedFraud.ErrorMessage
				}
				if(!lMapInputSfClaimSuspectedFraud.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimSuspectedFraud.Result
			}
			String lStrSfClaimConfirmedFraud=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFraudVerificationInfoConfirmedFraud
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Fraud_Verification_Info_Confirmed_Fraud')
			lStrSfClaimConfirmedFraud=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimConfirmedFraud)
			if(lStrSfClaimConfirmedFraud.length()>0){
				Map lMapInputSfClaimConfirmedFraud=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimConfirmedFraud(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimConfirmedFraud)
				if(lMapInputSfClaimConfirmedFraud.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimConfirmedFraud.ErrorMessage
				}
				if(!lMapInputSfClaimConfirmedFraud.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimConfirmedFraud.Result
			}
			String lStrSfClaimProvenFraud=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFraudVerificationInfoProvenFraud
			lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Claim_Detail_Fraud_Verification_Info_Proven_Fraud')
			lStrSfClaimProvenFraud=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrSfClaimProvenFraud)
			if(lStrSfClaimProvenFraud.length()>0){
				Map lMapInputSfClaimProvenFraud=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimProvenFraud(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimProvenFraud)
				if(lMapInputSfClaimProvenFraud.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimProvenFraud.ErrorMessage
				}
				if(!lMapInputSfClaimProvenFraud.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimProvenFraud.Result
			}
			String lStrSfClaimCommentBox=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailFraudVerificationInfoCommentBox
			if(lStrSfClaimCommentBox.length()>0){
				Map lMapInputSfClaimCommentBox=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimCommentBox(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimCommentBox)
				if(lMapInputSfClaimCommentBox.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimCommentBox.ErrorMessage
				}
				if(!lMapInputSfClaimCommentBox.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimCommentBox.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfClaimIrregularitiesDetailNonMandatory(WebElement elementIgniteClaimReportingFormRoot,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimIrregularitiesObserved=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateClaimDetailCreateIrregularitiesInfoIrregularitiesObserved
			if(lStrSfClaimIrregularitiesObserved.length()>0){
				Map lMapInputSfClaimIrregularitiesObserved=IDNSalesforceLightningClaimMotorCarNewbizHelperClaim.inputSfClaimIrregularitiesObserved(this.parentStageController.getWebDriver(),lElementIgniteClaimReportingFormRoot,lStrSfClaimIrregularitiesObserved)
				if(lMapInputSfClaimIrregularitiesObserved.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIrregularitiesObserved.ErrorMessage
				}
				if(!lMapInputSfClaimIrregularitiesObserved.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIrregularitiesObserved.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfAdditionalDetailWhichMode(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('StrAdditionalDetailWhichMode','')
			lreturn.put('NumAdditionalDetailWhichMode',0)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Integer lNumAdditionalDetailWhichMode=0
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrAdditionalDetailWhichMode=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAdditionalDetailWhichMode
			lNumAdditionalDetailWhichMode=IGNUemaHelper.convertStringToInteger(lStrAdditionalDetailWhichMode,0)
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Additional_Detail_Which_Mode')
			lStrAdditionalDetailWhichMode=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrAdditionalDetailWhichMode)
			lResult=lStrAdditionalDetailWhichMode.length()>0
			lreturn.put('AdditionalDetailWhichMode',lStrAdditionalDetailWhichMode)
			lreturn.put('NumAdditionalDetailWhichMode',lNumAdditionalDetailWhichMode)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfCreateOrEditAdditionalDetailHowManyItem(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CreateOrEditAdditionalDetailHowManyItem',0)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Integer lNumCreateOrEditAdditionalDetailHowManyItem=0
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrCreateOrEditAdditionalDetailHowManyItem=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateOrEditAdditionalDetailHowManyItem
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Or_Edit_Additional_Detail_How_Many_Item')
			lStrCreateOrEditAdditionalDetailHowManyItem=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrCreateOrEditAdditionalDetailHowManyItem)
			lResult=lStrCreateOrEditAdditionalDetailHowManyItem.length()>0
			lNumCreateOrEditAdditionalDetailHowManyItem=IGNUemaHelper.convertStringToInteger(lStrCreateOrEditAdditionalDetailHowManyItem,0)
			lreturn.put('CreateOrEditAdditionalDetailHowManyItem',lNumCreateOrEditAdditionalDetailHowManyItem)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfCreateOrEditThirdPartyDetailHowManyItem(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CreateOrEditThirdPartyDetailHowManyItem',0)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			Integer lNumCreateOrEditThirdPartyDetailHowManyItem=0
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrCreateOrEditThirdPartyDetailHowManyItem=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateOrEditThirdPartyDetailHowManyItem
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Create_Or_Edit_Third_Party_Detail_How_Many_Item')
			lStrCreateOrEditThirdPartyDetailHowManyItem=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrCreateOrEditThirdPartyDetailHowManyItem)
			lResult=lStrCreateOrEditThirdPartyDetailHowManyItem.length()>0
			lNumCreateOrEditThirdPartyDetailHowManyItem=IGNUemaHelper.convertStringToInteger(lStrCreateOrEditThirdPartyDetailHowManyItem,0)
			lreturn.put('CreateOrEditThirdPartyDetailHowManyItem',lNumCreateOrEditThirdPartyDetailHowManyItem)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfCreateOrEditThirdPartyObjectDetail(Integer numCreateOrEditThirdPartyDetailHowManyItem,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(numCreateOrEditThirdPartyDetailHowManyItem)){
			return lreturn
		}
		Integer lNumCreateOrEditThirdPartyDetailHowManyItem=numCreateOrEditThirdPartyDetailHowManyItem
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			String lStrMainTargetButtonName=''
			Boolean lIsCreateThirdPartyToDo=false
			Map lMapInputMainTargetButton=[:]
			List<WebElement> lListElementMainButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getListElementMainButton(this.parentStageController.getWebDriver())
			if(lListElementMainButton.size()==0){
				return lreturn
			}
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			for(Integer lCreateOrEditThirdPartyDetailHowManyItem=1;lCreateOrEditThirdPartyDetailHowManyItem<=lNumCreateOrEditThirdPartyDetailHowManyItem;lCreateOrEditThirdPartyDetailHowManyItem++){
				String lStrCreateOrEditThirdPartyDetailToDo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'ToDo'
				lStrCreateOrEditThirdPartyDetailToDo=lMapCaseDataCurrentInput.get(lStrCreateOrEditThirdPartyDetailToDo)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_To_Do')
				lStrCreateOrEditThirdPartyDetailToDo=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrCreateOrEditThirdPartyDetailToDo)
				Map lMapInputSfCreateOrEditThirdPartyToDo=IDNSalesforceLightningClaimMotorCarNewbizHelperThirdParty.inputSfCreateOrEditThirdPartyToDo(lStrCreateOrEditThirdPartyDetailToDo)
				if(lMapInputSfCreateOrEditThirdPartyToDo.Result){
					lIsCreateThirdPartyToDo=lMapInputSfCreateOrEditThirdPartyToDo.BoolCreateOrEditThirdPartyToDo
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfCreateOrEditThirdPartyToDo.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
				if(!lMapInputSfCreateOrEditThirdPartyToDo.Result){
					return lreturn
				}
				if(lIsCreateThirdPartyToDo){
					lStrMainTargetButtonName='Create Third Party'
					lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
					if(lMapInputMainTargetButton.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputMainTargetButton.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(lStrErrorMessage.length()>0){
						return lreturn
					}
					WebElement lElementIgnitThirdPartyReportingFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperThirdParty.getElementIgnitThirdPartyReportingFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementIgnitThirdPartyReportingFormRoot)){
						return lreturn
					}
					String lStrThirdPartyIsTPVehicleDamage='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'IsTPVehicleDamage'
					lStrThirdPartyIsTPVehicleDamage=lMapCaseDataCurrentInput.get(lStrThirdPartyIsTPVehicleDamage)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_Is_TP_Vehicle_Damage')
					lStrThirdPartyIsTPVehicleDamage=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyIsTPVehicleDamage)
					String lStrThirdPartyTPDriverName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPDriverName'
					lStrThirdPartyTPDriverName=lMapCaseDataCurrentInput.get(lStrThirdPartyTPDriverName)
					String lStrThirdPartyTPClaimNumber='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPClaimNumber'
					lStrThirdPartyTPClaimNumber=lMapCaseDataCurrentInput.get(lStrThirdPartyTPClaimNumber)
					String lStrThirdPartyIsTPDriverInjured='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'IsTPDriverInjured'
					lStrThirdPartyIsTPDriverInjured=lMapCaseDataCurrentInput.get(lStrThirdPartyIsTPDriverInjured)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_Is_TP_Driver_Injured')
					lStrThirdPartyIsTPDriverInjured=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyIsTPDriverInjured)
					String lStrThirdPartyRelationship='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'Relationship'
					lStrThirdPartyRelationship=lMapCaseDataCurrentInput.get(lStrThirdPartyRelationship)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_Relationship')
					lStrThirdPartyRelationship=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyRelationship)
					String lStrThirdPartyTPCarPlateNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPCarPlateNo'
					lStrThirdPartyTPCarPlateNo=lMapCaseDataCurrentInput.get(lStrThirdPartyTPCarPlateNo)
					String lStrThirdPartyTPCarPlateProvince='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPCarPlateProvince'
					lStrThirdPartyTPCarPlateProvince=lMapCaseDataCurrentInput.get(lStrThirdPartyTPCarPlateProvince)
					String lStrThirdPartyTPChassisNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPChassisNo'
					lStrThirdPartyTPChassisNo=lMapCaseDataCurrentInput.get(lStrThirdPartyTPChassisNo)
					String lStrThirdPartyTPCarMake='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPCarMake'
					lStrThirdPartyTPCarMake=lMapCaseDataCurrentInput.get(lStrThirdPartyTPCarMake)
					String lStrThirdPartyTPPropertyDamage='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPropertyDamage'
					lStrThirdPartyTPPropertyDamage=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPropertyDamage)
					String lStrThirdPartyTPPropertyDescription='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPropertyDescription'
					lStrThirdPartyTPPropertyDescription=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPropertyDescription)
					String lStrThirdPartyIsTPInsured='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'IsTPInsured'
					lStrThirdPartyIsTPInsured=lMapCaseDataCurrentInput.get(lStrThirdPartyIsTPInsured)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_Is_TP_Insured')
					lStrThirdPartyIsTPInsured=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyIsTPInsured)
					String lStrThirdPartyLiability='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'Liability'
					lStrThirdPartyLiability=lMapCaseDataCurrentInput.get(lStrThirdPartyLiability)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'Liability')
					lStrThirdPartyLiability=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyLiability)
					String lStrThirdPartyTPInjuryDescription='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPInjuryDescription'
					lStrThirdPartyTPInjuryDescription=lMapCaseDataCurrentInput.get(lStrThirdPartyTPInjuryDescription)
					String lStrThirdPartyNotifyRelatedPeople='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'NotifyRelatedPeople'
					lStrThirdPartyNotifyRelatedPeople=lMapCaseDataCurrentInput.get(lStrThirdPartyNotifyRelatedPeople)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_Notify_Related_People')
					lStrThirdPartyNotifyRelatedPeople=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyNotifyRelatedPeople)
					String lStrThirdPartyTPPolicyExpiryDateOffset='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPolicyExpiryDateOffset'
					lStrThirdPartyTPPolicyExpiryDateOffset=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPolicyExpiryDateOffset)
					String lStrThirdPartyTPPolicyExpiryDateValue='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPolicyExpiryDateValue'
					lStrThirdPartyTPPolicyExpiryDateValue=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPolicyExpiryDateValue)
					String lStrThirdPartyTPInsuranceCompany='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPInsuranceCompany'
					lStrThirdPartyTPInsuranceCompany=lMapCaseDataCurrentInput.get(lStrThirdPartyTPInsuranceCompany)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_TP_Insurance_Company')
					lStrThirdPartyTPInsuranceCompany=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyTPInsuranceCompany)
					String lStrThirdPartyTPPolicyNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPolicyNo'
					lStrThirdPartyTPPolicyNo=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPolicyNo)
					String lStrThirdPartyTPPolicyType='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPolicyType'
					lStrThirdPartyTPPolicyType=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPolicyType)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Third_Party_Detail_'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'_TP_Policy_Type')
					lStrThirdPartyTPPolicyType=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrThirdPartyTPPolicyType)
					String lStrThirdPartyTPCarModel='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPCarModel'
					lStrThirdPartyTPCarModel=lMapCaseDataCurrentInput.get(lStrThirdPartyTPCarModel)
					String lStrThirdPartyTPPropertyInsuranceCompany='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCreateThirdPartyDetail'+String.format('%02d',lCreateOrEditThirdPartyDetailHowManyItem)+'TPPropertyInsuranceCompany'
					lStrThirdPartyTPPropertyInsuranceCompany=lMapCaseDataCurrentInput.get(lStrThirdPartyTPPropertyInsuranceCompany)
					Map lMapInitSfClaimThirdPartyInput=[:]
					IDNSalesforceLightningClaimMotorCarNewbizHelperThirdParty.inputInitSfClaimThirdPartyInput(lMapInitSfClaimThirdPartyInput)
					lMapInitSfClaimThirdPartyInput.IsTPVehicleDamage=lStrThirdPartyIsTPVehicleDamage
					lMapInitSfClaimThirdPartyInput.TPDriverName=lStrThirdPartyTPDriverName
					lMapInitSfClaimThirdPartyInput.TPClaimNumber=lStrThirdPartyTPClaimNumber
					lMapInitSfClaimThirdPartyInput.IsTPDriverInjured=lStrThirdPartyIsTPDriverInjured
					lMapInitSfClaimThirdPartyInput.Relationship=lStrThirdPartyRelationship
					lMapInitSfClaimThirdPartyInput.TPCarPlateNo=lStrThirdPartyTPCarPlateNo
					lMapInitSfClaimThirdPartyInput.TPCarPlateProvince=lStrThirdPartyTPCarPlateProvince
					lMapInitSfClaimThirdPartyInput.TPChassisNo=lStrThirdPartyTPChassisNo
					lMapInitSfClaimThirdPartyInput.TPCarMake=lStrThirdPartyTPCarMake
					lMapInitSfClaimThirdPartyInput.TPPropertyDamage=lStrThirdPartyTPPropertyDamage
					lMapInitSfClaimThirdPartyInput.TPPropertyDescription=lStrThirdPartyTPPropertyDescription
					lMapInitSfClaimThirdPartyInput.IsTPInsured=lStrThirdPartyIsTPInsured
					lMapInitSfClaimThirdPartyInput.Liability=lStrThirdPartyLiability
					lMapInitSfClaimThirdPartyInput.TPInjuryDescription=lStrThirdPartyTPInjuryDescription
					lMapInitSfClaimThirdPartyInput.NotifyRelatedPeople=lStrThirdPartyNotifyRelatedPeople
					lMapInitSfClaimThirdPartyInput.TPPolicyExpiryDateOffset=lStrThirdPartyTPPolicyExpiryDateOffset
					lMapInitSfClaimThirdPartyInput.TPPolicyExpiryDateValue=lStrThirdPartyTPPolicyExpiryDateValue
					lMapInitSfClaimThirdPartyInput.TPInsuranceCompany=lStrThirdPartyTPInsuranceCompany
					lMapInitSfClaimThirdPartyInput.TPPolicyNo=lStrThirdPartyTPPolicyNo
					lMapInitSfClaimThirdPartyInput.TPPolicyType=lStrThirdPartyTPPolicyType
					lMapInitSfClaimThirdPartyInput.TPCarModel=lStrThirdPartyTPCarModel
					lMapInitSfClaimThirdPartyInput.TPPropertyInsuranceCompany=lStrThirdPartyTPPropertyInsuranceCompany
					Map lMapInputSfThirdPartyNonMandatory=IDNSalesforceLightningClaimMotorCarNewbizHelperThirdParty.inputSfThirdPartyNonMandatory(this.parentStageController.getWebDriver(),lElementIgnitThirdPartyReportingFormRoot,lMapInitSfClaimThirdPartyInput)
					if(lMapInputSfThirdPartyNonMandatory.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputSfThirdPartyNonMandatory.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(!lMapInputSfThirdPartyNonMandatory.Result){
						return lreturn
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfAutoCreateAdditionalObjectDetail(Integer numCreateOrEditAdditionalDetailHowManyItem,Map<String,String> caseOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(numCreateOrEditAdditionalDetailHowManyItem)){
			return lreturn
		}
		Integer lNumCreateOrEditAdditionalDetailHowManyItem=numCreateOrEditAdditionalDetailHowManyItem
		if(IGNUemaHelper.checkObjectNullOfObject(caseOutput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			String lStrMainTargetButtonName=''
			Boolean lIsCreateAdditionalDetailDamageToDo=false
			Boolean lIsCreateAdditionalDetailReserveToDo=false
			Boolean lIsCreateAdditionalDetailReservePaymentToDo=false
			Boolean lIsCreateAdditionalDetailRecoveryToDo=false
			Boolean lIsCreateAdditionalDetailRecoveryPaymentToDo=false
			Map lMapInputMainTargetButton=[:]
			List<WebElement> lListElementMainButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.getListElementMainButton(this.parentStageController.getWebDriver())
			if(lListElementMainButton.size()==0){
				return lreturn
			}
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=null
			for(Integer lCreateOrEditAdditionalDetailItem=1;lCreateOrEditAdditionalDetailItem<=lNumCreateOrEditAdditionalDetailHowManyItem;lCreateOrEditAdditionalDetailItem++){
				String lStrCreateAdditionalDetailDamageToDo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'DamageToDo'
				lStrCreateAdditionalDetailDamageToDo=lMapCaseDataCurrentInput.get(lStrCreateAdditionalDetailDamageToDo)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Damage_To_Do')
				lStrCreateAdditionalDetailDamageToDo=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrCreateAdditionalDetailDamageToDo)
				lStrCreateAdditionalDetailDamageToDo='Yes'
				String lStrDamageTypeMapWithClaimIncidentType='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'DamageTypeMapWithClaimIncidentType'
				lStrDamageTypeMapWithClaimIncidentType=lMapCaseDataCurrentInput.get(lStrDamageTypeMapWithClaimIncidentType)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Damage_Type_Map_With_Claim_Incident_Type')
				lStrDamageTypeMapWithClaimIncidentType=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrDamageTypeMapWithClaimIncidentType)
				String lStrReserveTypeAndReservePaymentOption='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReserveTypeAndReservePaymentOption'
				lStrReserveTypeAndReservePaymentOption=lMapCaseDataCurrentInput.get(lStrReserveTypeAndReservePaymentOption)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Type_And_Reserve_Payment_Option')
				lStrReserveTypeAndReservePaymentOption=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrReserveTypeAndReservePaymentOption)
				String lStrDamageType=''
				String lStrReserveType=''
				String[] lStrArrayDamageTypeMapWithClaimIncidentType=lStrDamageTypeMapWithClaimIncidentType.split('@')
				List<String> lListDamageTypeAndReserveTypeOption=[]
				if(!IGNUemaHelper.checkObjectNullOfObject(lStrArrayDamageTypeMapWithClaimIncidentType[1])){
					lStrArrayDamageTypeMapWithClaimIncidentType[1]=lStrArrayDamageTypeMapWithClaimIncidentType[1].replaceAll("[\\[\\]\\(\\)\\'\\'\"\\\n]",'')
					lListDamageTypeAndReserveTypeOption=Arrays.asList(lStrArrayDamageTypeMapWithClaimIncidentType[1].split(','))
				}
				Map<String,String> lMapDamageTypeAndReserveTypeOption=[:]
				for(String strDamageTypeAndReserveTypeOption:lListDamageTypeAndReserveTypeOption){
					List<String> lListDamageTypeAndReserveTypeDetail=Arrays.asList(strDamageTypeAndReserveTypeOption.split(':'))
					lMapDamageTypeAndReserveTypeOption.put(lListDamageTypeAndReserveTypeDetail.get(0),lListDamageTypeAndReserveTypeDetail.get(1))
				}
				Integer lIndexDamageTypeLocation=0
				Integer lIndexReserveTypeLocation=1
				if(!IGNUemaHelper.checkObjectNullOfObject(lMapDamageTypeAndReserveTypeOption)){
					String[] lStrArraySplitDamageTypeAndReserveType=lMapDamageTypeAndReserveTypeOption.get(lStrReserveTypeAndReservePaymentOption).split('\\|')
					if(lListDamageTypeAndReserveTypeOption.size()>0){
						lStrDamageType=lStrArraySplitDamageTypeAndReserveType[lIndexDamageTypeLocation]
						lStrReserveType=lStrArraySplitDamageTypeAndReserveType[lIndexReserveTypeLocation]
					}
				}
				Map lMapInputSfCreateOrEditDamageToDo=IDNSalesforceLightningClaimMotorCarNewbizHelperDamage.inputSfCreateOrEditDamageToDo(lStrCreateAdditionalDetailDamageToDo)
				if(lMapInputSfCreateOrEditDamageToDo.Result){
					lIsCreateAdditionalDetailDamageToDo=lMapInputSfCreateOrEditDamageToDo.BoolCreateOrEditAdditionalDetailDamageToDo
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfCreateOrEditDamageToDo.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
				if(!lMapInputSfCreateOrEditDamageToDo.Result){
					return lreturn
				}
				if(lIsCreateAdditionalDetailDamageToDo){
					WebElement lElementIgniteClaimDamageFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperDamage.getElementIgniteClaimDamageFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimDamageFormRoot)){
						return lreturn
					}
					String lStrDamageAssessorName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'DamageAssessorName'
					lStrDamageAssessorName=lMapCaseDataCurrentInput.get(lStrDamageAssessorName)
					String lStrDamageRecoveryAgentName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'DamageRecoveryAgentName'
					lStrDamageRecoveryAgentName=lMapCaseDataCurrentInput.get(lStrDamageRecoveryAgentName)
					String lStrDamageServiceProviderName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'DamageServiceProviderName'
					lStrDamageServiceProviderName=lMapCaseDataCurrentInput.get(lStrDamageServiceProviderName)
					String lStrDamageQuotationApprovalStatus='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'DamageQuotationApprovalStatus'
					lStrDamageQuotationApprovalStatus=lMapCaseDataCurrentInput.get(lStrDamageQuotationApprovalStatus)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Damage_Quotation_Approval_Status')
					lStrDamageQuotationApprovalStatus=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrDamageQuotationApprovalStatus)
					Map lMapInitSfClaimDamageInput=[:]
					IDNSalesforceLightningClaimMotorCarNewbizHelperDamage.inputInitSfClaimDamageInput(lMapInitSfClaimDamageInput)
					lMapInitSfClaimDamageInput.DamageType=lStrDamageType
					lMapInitSfClaimDamageInput.DamageAssessorName=lStrDamageAssessorName
					lMapInitSfClaimDamageInput.DamageRecoveryAgentName=lStrDamageRecoveryAgentName
					lMapInitSfClaimDamageInput.DamageServiceProviderName=lStrDamageServiceProviderName
					lMapInitSfClaimDamageInput.DamageQuotationApprovalStatus=lStrDamageQuotationApprovalStatus
					Map lMapInputSfProceedAdditionalDetailDamage=IDNSalesforceLightningClaimMotorCarNewbizHelperDamage.inputSfProceedAdditionalDetailDamage(this.parentStageController.getWebDriver(),lElementIgniteClaimDamageFormRoot,lMapInitSfClaimDamageInput)
					if(lMapInputSfProceedAdditionalDetailDamage.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputSfProceedAdditionalDetailDamage.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(!lMapInputSfProceedAdditionalDetailDamage.Result){
						return lreturn
					}
				}
				String lStrCreateAdditionalDetailReserveDetailToDo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReserveDetailToDo'
				lStrCreateAdditionalDetailReserveDetailToDo=lMapCaseDataCurrentInput.get(lStrCreateAdditionalDetailReserveDetailToDo)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Detail_To_Do')
				lStrCreateAdditionalDetailReserveDetailToDo=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrCreateAdditionalDetailReserveDetailToDo)
				lStrCreateAdditionalDetailReserveDetailToDo='No'
				Map lMapInputSfCreateOrEditReserveDetailToDo=IDNSalesforceLightningClaimMotorCarNewbizHelperReserveDetail.inputSfCreateOrEditReserveDetailToDo(lStrCreateAdditionalDetailReserveDetailToDo)
				if(lMapInputSfCreateOrEditReserveDetailToDo.Result){
					lIsCreateAdditionalDetailReserveToDo=lMapInputSfCreateOrEditReserveDetailToDo.BoolCreateOrEditAdditionalDetailReserveDetailToDo
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfCreateOrEditReserveDetailToDo.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
				if(!lMapInputSfCreateOrEditDamageToDo.Result){
					return lreturn
				}
				if(lIsCreateAdditionalDetailReserveToDo){
					lStrMainTargetButtonName='Create Reserve'
					lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
					if(lMapInputMainTargetButton.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputMainTargetButton.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(lStrErrorMessage.length()>0){
						return lreturn
					}
					WebElement lElementIgniteClaimReserveDetailFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperReserveDetail.getElementIgniteClaimReserveDetailFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReserveDetailFormRoot)){
						return lreturn
					}
					String lStrReserveDetailThirdPartyName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReserveDetailThirdPartyName'
					lStrReserveDetailThirdPartyName=lMapCaseDataCurrentInput.get(lStrReserveDetailThirdPartyName)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Detail_Third_Party_Name')
					lStrReserveDetailThirdPartyName=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrReserveDetailThirdPartyName)
					String lStrReserveDetailThirdPartySequence='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReserveDetailThirdPartySequence'
					lStrReserveDetailThirdPartySequence=lMapCaseDataCurrentInput.get(lStrReserveDetailThirdPartySequence)
					String lStrReserveDetailOutstandingReserve='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReserveDetailOutstandingReserve'
					lStrReserveDetailOutstandingReserve=lMapCaseDataCurrentInput.get(lStrReserveDetailOutstandingReserve)
					Map lMapInitSfClaimReserveDetailInput=[:]
					IDNSalesforceLightningClaimMotorCarNewbizHelperReserveDetail.inputInitSfClaimReserveDetailInput(lMapInitSfClaimReserveDetailInput)
					lMapInitSfClaimReserveDetailInput.ReserveType=lStrReserveType
					lMapInitSfClaimReserveDetailInput.ThirdPartyName=lStrReserveDetailThirdPartyName
					lMapInitSfClaimReserveDetailInput.ThirdPartySequence=lStrReserveDetailThirdPartySequence
					lMapInitSfClaimReserveDetailInput.OutstandingReserve=lStrReserveDetailOutstandingReserve
					Map lMapInputSfProceedAdditionalDetailReserveDetail=IDNSalesforceLightningClaimMotorCarNewbizHelperReserveDetail.inputSfProceedAdditionalDetailReserveDetail(this.parentStageController.getWebDriver(),lElementIgniteClaimReserveDetailFormRoot,lMapInitSfClaimReserveDetailInput)
					if(lMapInputSfProceedAdditionalDetailReserveDetail.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputSfProceedAdditionalDetailReserveDetail.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(!lMapInputSfProceedAdditionalDetailReserveDetail.Result){
						return lreturn
					}
				}
				String lStrCreateAdditionalDetailReservePaymentToDo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentToDo'
				lStrCreateAdditionalDetailReservePaymentToDo=lMapCaseDataCurrentInput.get(lStrCreateAdditionalDetailReservePaymentToDo)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Payment_To_Do')
				lStrCreateAdditionalDetailReservePaymentToDo=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrCreateAdditionalDetailReservePaymentToDo)
				lStrCreateAdditionalDetailReservePaymentToDo='No'
				Map lMapInputSfCreateOrEditReservePaymentToDo=IDNSalesforceLightningClaimMotorCarNewbizHelperReservePayment.inputSfCreateOrEditReservePaymentToDo(lStrCreateAdditionalDetailReservePaymentToDo)
				if(lMapInputSfCreateOrEditReservePaymentToDo.Result){
					lIsCreateAdditionalDetailReservePaymentToDo=lMapInputSfCreateOrEditReservePaymentToDo.BoolCreateOrEditAdditionalDetailReservePaymentToDo
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfCreateOrEditReservePaymentToDo.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
				if(!lMapInputSfCreateOrEditReservePaymentToDo.Result){
					return lreturn
				}
				if(lIsCreateAdditionalDetailReservePaymentToDo){
					lStrMainTargetButtonName='Create Reserve Payment'
					lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
					if(lMapInputMainTargetButton.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputMainTargetButton.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(lStrErrorMessage.length()>0){
						return lreturn
					}
					WebElement lElementIgniteClaimReservePaymentDetailFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperReservePayment.getElementIgniteClaimReservePaymentDetailFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReservePaymentDetailFormRoot)){
						return lreturn
					}
					String lStrReservePaymentCategory='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentCategory'
					lStrReservePaymentCategory=lMapCaseDataCurrentInput.get(lStrReservePaymentCategory)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Payment_Category')
					lStrReservePaymentCategory=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrReservePaymentCategory)
					String lStrReservePaymentNetAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentNetAmount'
					lStrReservePaymentNetAmount=lMapCaseDataCurrentInput.get(lStrReservePaymentNetAmount)
					String lStrReservePaymentVATRate='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentVATRate'
					lStrReservePaymentVATRate=lMapCaseDataCurrentInput.get(lStrReservePaymentVATRate)
					String lStrReservePaymentWHTRate='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentWHTRate'
					lStrReservePaymentWHTRate=lMapCaseDataCurrentInput.get(lStrReservePaymentWHTRate)
					String lStrReservePaymentStampDuty='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentStampDuty'
					lStrReservePaymentStampDuty=lMapCaseDataCurrentInput.get(lStrReservePaymentStampDuty)
					String lStrReservePaymentSalvageRate='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentSalvageRate'
					lStrReservePaymentSalvageRate=lMapCaseDataCurrentInput.get(lStrReservePaymentSalvageRate)
					String lStrReservePaymentRecoveryAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentRecoveryAmount'
					lStrReservePaymentRecoveryAmount=lMapCaseDataCurrentInput.get(lStrReservePaymentRecoveryAmount)
					String lStrReservePaymentInvoiceNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentInvoiceNo'
					lStrReservePaymentInvoiceNo=lMapCaseDataCurrentInput.get(lStrReservePaymentInvoiceNo)
					String lStrReservePaymentPaymentDateOffset='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentPaymentDateOffset'
					lStrReservePaymentPaymentDateOffset=lMapCaseDataCurrentInput.get(lStrReservePaymentPaymentDateOffset)
					String lStrReservePaymentPaymentDateValue='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentPaymentDateValue'
					lStrReservePaymentPaymentDateValue=lMapCaseDataCurrentInput.get(lStrReservePaymentPaymentDateValue)
					String lStrReservePaymentPaymentMethod='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentPaymentMethod'
					lStrReservePaymentPaymentMethod=lMapCaseDataCurrentInput.get(lStrReservePaymentPaymentMethod)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Payment_Payment_Method')
					lStrReservePaymentPaymentMethod=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrReservePaymentPaymentMethod)
					String lStrReservePaymentBankName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentBankName'
					lStrReservePaymentBankName=lMapCaseDataCurrentInput.get(lStrReservePaymentBankName)
					String lStrReservePaymentFinalPayment='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentFinalPayment'
					lStrReservePaymentFinalPayment=lMapCaseDataCurrentInput.get(lStrReservePaymentFinalPayment)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Reserve_Payment_Final_Payment')
					lStrReservePaymentFinalPayment=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrReservePaymentFinalPayment)
					String lStrReservePaymentPayeeName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentPayeeName'
					lStrReservePaymentPayeeName=lMapCaseDataCurrentInput.get(lStrReservePaymentPayeeName)
					lStrReservePaymentPayeeName='zxca adaf'
					String lStrReservePaymentInvoiceDateOffset='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentInvoiceDateOffset'
					lStrReservePaymentInvoiceDateOffset=lMapCaseDataCurrentInput.get(lStrReservePaymentInvoiceDateOffset)
					String lStrReservePaymentInvoiceDateValue='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentInvoiceDateValue'
					lStrReservePaymentInvoiceDateValue=lMapCaseDataCurrentInput.get(lStrReservePaymentInvoiceDateValue)
					String lStrReservePaymentPaymentDueDateOffset='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentPaymentDueDateOffset'
					lStrReservePaymentPaymentDueDateOffset=lMapCaseDataCurrentInput.get(lStrReservePaymentPaymentDueDateOffset)
					String lStrReservePaymentPaymentDueDateValue='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentPaymentDueDateValue'
					lStrReservePaymentPaymentDueDateValue=lMapCaseDataCurrentInput.get(lStrReservePaymentPaymentDueDateValue)
					String lStrReservePaymentInvoiceSubmittedDateOffset='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentInvoiceSubmittedDateOffset'
					lStrReservePaymentInvoiceSubmittedDateOffset=lMapCaseDataCurrentInput.get(lStrReservePaymentInvoiceSubmittedDateOffset)
					String lStrReservePaymentInvoiceSubmittedDateValue='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentInvoiceSubmittedDateValue'
					lStrReservePaymentInvoiceSubmittedDateValue=lMapCaseDataCurrentInput.get(lStrReservePaymentInvoiceSubmittedDateValue)
					String lStrReservePaymentChequeNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'ReservePaymentChequeNo'
					lStrReservePaymentChequeNo=lMapCaseDataCurrentInput.get(lStrReservePaymentChequeNo)
					Map lMapInitSfClaimReservePaymentDetailInput=[:]
					IDNSalesforceLightningClaimMotorCarNewbizHelperReservePayment.inputInitSfClaimReservePaymentInput(lMapInitSfClaimReservePaymentDetailInput)
					lMapInitSfClaimReservePaymentDetailInput.Category=lStrReservePaymentCategory
					lMapInitSfClaimReservePaymentDetailInput.NetAmount=lStrReservePaymentNetAmount
					lMapInitSfClaimReservePaymentDetailInput.VATRate=lStrReservePaymentVATRate
					lMapInitSfClaimReservePaymentDetailInput.WHTRate=lStrReservePaymentWHTRate
					lMapInitSfClaimReservePaymentDetailInput.StampDuty=lStrReservePaymentStampDuty
					lMapInitSfClaimReservePaymentDetailInput.SalvageRate=lStrReservePaymentSalvageRate
					lMapInitSfClaimReservePaymentDetailInput.RecoveryAmount=lStrReservePaymentRecoveryAmount
					lMapInitSfClaimReservePaymentDetailInput.InvoiceNo=lStrReservePaymentInvoiceNo
					lMapInitSfClaimReservePaymentDetailInput.PaymentDateOffset=lStrReservePaymentPaymentDateOffset
					lMapInitSfClaimReservePaymentDetailInput.PaymentDateValue=lStrReservePaymentPaymentDateValue
					lMapInitSfClaimReservePaymentDetailInput.PaymentMethod=lStrReservePaymentPaymentMethod
					lMapInitSfClaimReservePaymentDetailInput.BankName=lStrReservePaymentBankName
					lMapInitSfClaimReservePaymentDetailInput.FinalPayment=lStrReservePaymentFinalPayment
					lMapInitSfClaimReservePaymentDetailInput.PayeeName=lStrReservePaymentPayeeName
					lMapInitSfClaimReservePaymentDetailInput.InvoiceDateOffset=lStrReservePaymentInvoiceDateOffset
					lMapInitSfClaimReservePaymentDetailInput.InvoiceDateValue=lStrReservePaymentInvoiceDateValue
					lMapInitSfClaimReservePaymentDetailInput.PaymentDueDateOffset=lStrReservePaymentPaymentDueDateOffset
					lMapInitSfClaimReservePaymentDetailInput.PaymentDueDateValue=lStrReservePaymentPaymentDueDateValue
					lMapInitSfClaimReservePaymentDetailInput.InvoiceSubmittedDateOffset=lStrReservePaymentInvoiceSubmittedDateOffset
					lMapInitSfClaimReservePaymentDetailInput.InvoiceSubmittedDateValue=lStrReservePaymentInvoiceSubmittedDateValue
					lMapInitSfClaimReservePaymentDetailInput.ChequeNo=lStrReservePaymentChequeNo
					Map lMapInputSfProceedAdditionalDetailReservePayment=IDNSalesforceLightningClaimMotorCarNewbizHelperReservePayment.inputSfProceedAdditionalDetailReservePayment(this.parentStageController.getWebDriver(),lElementIgniteClaimReservePaymentDetailFormRoot,lMapInitSfClaimReservePaymentDetailInput)
					if(lMapInputSfProceedAdditionalDetailReservePayment.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputSfProceedAdditionalDetailReservePayment.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(!lMapInputSfProceedAdditionalDetailReservePayment.Result){
						return lreturn
					}
				}
				String lStrCreateAdditionalDetailRecoveryDetailToDo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailToDo'
				lStrCreateAdditionalDetailRecoveryDetailToDo=lMapCaseDataCurrentInput.get(lStrCreateAdditionalDetailRecoveryDetailToDo)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Detail_To_Do')
				lStrCreateAdditionalDetailRecoveryDetailToDo=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrCreateAdditionalDetailRecoveryDetailToDo)
				lStrCreateAdditionalDetailRecoveryDetailToDo='No'
				Map lMapInputSfCreateOrEditRecoveryDetailToDo=IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryDetail.inputSfCreateOrEditRecoveryDetailToDo(lStrCreateAdditionalDetailRecoveryDetailToDo)
				if(lMapInputSfCreateOrEditRecoveryDetailToDo.Result){
					lIsCreateAdditionalDetailRecoveryToDo=lMapInputSfCreateOrEditRecoveryDetailToDo.BoolCreateOrEditAdditionalDetailRecoveryDetailToDo
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfCreateOrEditRecoveryDetailToDo.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
				if(!lMapInputSfCreateOrEditRecoveryDetailToDo.Result){
					return lreturn
				}
				if(lIsCreateAdditionalDetailRecoveryToDo){
					lStrMainTargetButtonName='Create Recovery'
					lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
					if(lMapInputMainTargetButton.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputMainTargetButton.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(lStrErrorMessage.length()>0){
						return lreturn
					}
					WebElement lElementIgniteClaimRecoveryDetailFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryDetail.getElementIgniteClaimRecoveryDetailFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimRecoveryDetailFormRoot)){
						return lreturn
					}
					String lStrRecoveryDetailRecoveryType='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailRecoveryType'
					lStrRecoveryDetailRecoveryType=lMapCaseDataCurrentInput.get(lStrRecoveryDetailRecoveryType)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Detail_Recovery_Type')
					lStrRecoveryDetailRecoveryType=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryDetailRecoveryType)
					String lStrRecoveryDetailRecoverFrom='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailRecoverFrom'
					lStrRecoveryDetailRecoverFrom=lMapCaseDataCurrentInput.get(lStrRecoveryDetailRecoverFrom)
					String lStrRecoveryDetailThirdPartyName='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailThirdPartyName'
					lStrRecoveryDetailThirdPartyName=lMapCaseDataCurrentInput.get(lStrRecoveryDetailThirdPartyName)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Detail_Third_Party_Name')
					lStrRecoveryDetailThirdPartyName=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryDetailThirdPartyName)
					String lStrRecoveryDetailOutstandingRecovery='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailOutstandingRecovery'
					lStrRecoveryDetailOutstandingRecovery=lMapCaseDataCurrentInput.get(lStrRecoveryDetailOutstandingRecovery)
					String lStrRecoveryDetailAmountSubjectToRecovery='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailAmountSubjectToRecovery'
					lStrRecoveryDetailAmountSubjectToRecovery=lMapCaseDataCurrentInput.get(lStrRecoveryDetailAmountSubjectToRecovery)
					String lStrRecoveryDetailRecoveryStatus='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailRecoveryStatus'
					lStrRecoveryDetailRecoveryStatus=lMapCaseDataCurrentInput.get(lStrRecoveryDetailRecoveryStatus)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Detail_Recovery_Status')
					lStrRecoveryDetailRecoveryStatus=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryDetailRecoveryStatus)
					String lStrRecoveryDetailRecoveryStage='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailRecoveryStage'
					lStrRecoveryDetailRecoveryStage=lMapCaseDataCurrentInput.get(lStrRecoveryDetailRecoveryStage)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Detail_Recovery_Stage')
					lStrRecoveryDetailRecoveryStage=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryDetailRecoveryStage)
					String lStrRecoveryDetailDescription='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailDescription'
					lStrRecoveryDetailDescription=lMapCaseDataCurrentInput.get(lStrRecoveryDetailDescription)
					String lStrRecoveryDetailRecoveredAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailRecoveredAmount'
					lStrRecoveryDetailRecoveredAmount=lMapCaseDataCurrentInput.get(lStrRecoveryDetailRecoveredAmount)
					String lStrRecoveryDetailTotalRecoveryAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryDetailTotalRecoveryAmount'
					lStrRecoveryDetailTotalRecoveryAmount=lMapCaseDataCurrentInput.get(lStrRecoveryDetailTotalRecoveryAmount)
					Map lMapInitSfClaimRecoveryDetailInput=[:]
					IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryDetail.inputInitSfClaimRecoveryDetailInput(lMapInitSfClaimRecoveryDetailInput)
					lMapInitSfClaimRecoveryDetailInput.RecoveryType=lStrRecoveryDetailRecoveryType
					lMapInitSfClaimRecoveryDetailInput.RecoverFrom=lStrRecoveryDetailRecoverFrom
					lMapInitSfClaimRecoveryDetailInput.ThirdPartyName=lStrRecoveryDetailThirdPartyName
					lMapInitSfClaimRecoveryDetailInput.OutstandingRecovery=lStrRecoveryDetailOutstandingRecovery
					lMapInitSfClaimRecoveryDetailInput.AmountSubjectToRecovery=lStrRecoveryDetailAmountSubjectToRecovery
					lMapInitSfClaimRecoveryDetailInput.RecoveryStatus=lStrRecoveryDetailRecoveryStatus
					lMapInitSfClaimRecoveryDetailInput.RecoveryStage=lStrRecoveryDetailRecoveryStage
					lMapInitSfClaimRecoveryDetailInput.Description=lStrRecoveryDetailDescription
					lMapInitSfClaimRecoveryDetailInput.RecoveredAmount=lStrRecoveryDetailRecoveredAmount
					lMapInitSfClaimRecoveryDetailInput.TotalRecoveryAmount=lStrRecoveryDetailTotalRecoveryAmount
					Map lMapInputSfProceedAdditionalDetailReserveDetail=IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryDetail.inputSfProceedAdditionalDetailRecoveryDetail(this.parentStageController.getWebDriver(),lElementIgniteClaimRecoveryDetailFormRoot,lMapInitSfClaimRecoveryDetailInput)
					if(lMapInputSfProceedAdditionalDetailReserveDetail.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputSfProceedAdditionalDetailReserveDetail.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(!lMapInputSfProceedAdditionalDetailReserveDetail.Result){
						return lreturn
					}
				}
				String lStrCreateAdditionalDetailRecoveryPaymentToDo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentToDo'
				lStrCreateAdditionalDetailRecoveryPaymentToDo=lMapCaseDataCurrentInput.get(lStrCreateAdditionalDetailRecoveryPaymentToDo)
				lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Payment_To_Do')
				lStrCreateAdditionalDetailRecoveryPaymentToDo=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrCreateAdditionalDetailRecoveryPaymentToDo)
				lStrCreateAdditionalDetailRecoveryPaymentToDo='No'
				Map lMapInputSfCreateOrEditRecoveryPaymentToDo=IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryPayment.inputSfCreateOrEditRecoveryPaymentToDo(lStrCreateAdditionalDetailRecoveryPaymentToDo)
				if(lMapInputSfCreateOrEditRecoveryPaymentToDo.Result){
					lIsCreateAdditionalDetailRecoveryPaymentToDo=lMapInputSfCreateOrEditRecoveryPaymentToDo.BoolCreateOrEditAdditionalDetailRecoveryPaymentToDo
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfCreateOrEditRecoveryPaymentToDo.ErrorMessage
				}
				caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
				if(!lMapInputSfCreateOrEditRecoveryDetailToDo.Result){
					return lreturn
				}
				if(lIsCreateAdditionalDetailRecoveryPaymentToDo){
					lStrMainTargetButtonName='Create Recovery Payment'
					lMapInputMainTargetButton=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputMainTargetButton(this.parentStageController.getWebDriver(),lListElementMainButton,lStrMainTargetButtonName)
					if(lMapInputMainTargetButton.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputMainTargetButton.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(lStrErrorMessage.length()>0){
						return lreturn
					}
					WebElement lElementIgniteClaimRecoveryPaymentFormRoot=IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryPayment.getElementIgniteClaimRecoveryPaymentFormRoot(this.parentStageController.getWebDriver(),lStrCssLocator)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimRecoveryPaymentFormRoot)){
						return lreturn
					}
					String lStrRecoveryPaymentPaymentCategory='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentPaymentCategory'
					lStrRecoveryPaymentPaymentCategory=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentPaymentCategory)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Payment_Payment_Category')
					lStrRecoveryPaymentPaymentCategory=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryPaymentPaymentCategory)
					String lStrRecoveryPaymentRecoverFrom='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentRecoverFrom'
					lStrRecoveryPaymentRecoverFrom=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentRecoverFrom)
					String lStrRecoveryPaymentRecoveredBy='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentRecoveredBy'
					lStrRecoveryPaymentRecoveredBy=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentRecoveredBy)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Payment_Recovered_By')
					lStrRecoveryPaymentRecoveredBy=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryPaymentRecoveredBy)
					String lStrRecoveryPaymentPaymentDateOffset='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentPaymentDateOffset'
					lStrRecoveryPaymentPaymentDateOffset=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentPaymentDateOffset)
					String lStrRecoveryPaymentPaymentDateValue='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentPaymentDateValue'
					lStrRecoveryPaymentPaymentDateValue=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentPaymentDateValue)
					String lStrRecoveryPaymentNetAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentNetAmount'
					lStrRecoveryPaymentNetAmount=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentNetAmount)
					String lStrRecoveryPaymentVATRate='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentVATRate'
					lStrRecoveryPaymentVATRate=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentVATRate)
					String lStrRecoveryPaymentVATAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentVATAmount'
					lStrRecoveryPaymentVATAmount=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentVATAmount)
					String lStrRecoveryPaymentWHTReferenceNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentWHTReferenceNo'
					lStrRecoveryPaymentWHTReferenceNo=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentWHTReferenceNo)
					String lStrRecoveryPaymentWHTRate='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentWHTRate'
					lStrRecoveryPaymentWHTRate=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentWHTRate)
					String lStrRecoveryPaymentWHTAmount='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentWHTAmount'
					lStrRecoveryPaymentWHTAmount=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentWHTAmount)
					String lStrRecoveryPaymentNetAmountInclTax='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentNetAmountInclTax'
					lStrRecoveryPaymentNetAmountInclTax=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentNetAmountInclTax)
					String lStrRecoveryPaymentDescription='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentDescription'
					lStrRecoveryPaymentDescription=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentDescription)
					String lStrRecoveryPaymentRecoveryPaymentStatus='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentRecoveryPaymentStatus'
					lStrRecoveryPaymentRecoveryPaymentStatus=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentRecoveryPaymentStatus)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Payment_Recovery_Payment_Status')
					lStrRecoveryPaymentRecoveryPaymentStatus=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryPaymentRecoveryPaymentStatus)
					String lStrRecoveryPaymentFinalRecovery='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentFinalRecovery'
					lStrRecoveryPaymentFinalRecovery=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentFinalRecovery)
					lIGNTestMasterFieldTypeSingle=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Mode_01_Create_Additional_Detail_'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'_Recovery_Payment_Final_Recovery')
					lStrRecoveryPaymentFinalRecovery=lIGNTestMasterFieldTypeSingle.getMasterPairValueByKey(lStrRecoveryPaymentFinalRecovery)
					String lStrRecoveryPaymentPayeeIdentificationCardNo='GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenMode01CreateAdditionalDetail'+String.format('%02d',lCreateOrEditAdditionalDetailItem)+'RecoveryPaymentPayeeIdentificationCardNo'
					lStrRecoveryPaymentPayeeIdentificationCardNo=lMapCaseDataCurrentInput.get(lStrRecoveryPaymentPayeeIdentificationCardNo)
					Map lMapInitSfClaimRecoveryPaymentInput=[:]
					IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryPayment.inputInitSfClaimRecoveryPaymentInput(lMapInitSfClaimRecoveryPaymentInput)
					lMapInitSfClaimRecoveryPaymentInput.PaymentCategory=lStrRecoveryPaymentPaymentCategory
					lMapInitSfClaimRecoveryPaymentInput.RecoverFrom=lStrRecoveryPaymentRecoverFrom
					lMapInitSfClaimRecoveryPaymentInput.RecoveredBy=lStrRecoveryPaymentRecoveredBy
					lMapInitSfClaimRecoveryPaymentInput.PaymentDateOffset=lStrRecoveryPaymentPaymentDateOffset
					lMapInitSfClaimRecoveryPaymentInput.PaymentDateValue=lStrRecoveryPaymentPaymentDateValue
					lMapInitSfClaimRecoveryPaymentInput.NetAmount=lStrRecoveryPaymentNetAmount
					lMapInitSfClaimRecoveryPaymentInput.VATRate=lStrRecoveryPaymentVATRate
					lMapInitSfClaimRecoveryPaymentInput.VATAmount=lStrRecoveryPaymentVATAmount
					lMapInitSfClaimRecoveryPaymentInput.WHTReferenceNo=lStrRecoveryPaymentWHTReferenceNo
					lMapInitSfClaimRecoveryPaymentInput.WHTRate=lStrRecoveryPaymentWHTRate
					lMapInitSfClaimRecoveryPaymentInput.WHTAmount=lStrRecoveryPaymentWHTAmount
					lMapInitSfClaimRecoveryPaymentInput.NetAmountInclTax=lStrRecoveryPaymentNetAmountInclTax
					lMapInitSfClaimRecoveryPaymentInput.Description=lStrRecoveryPaymentDescription
					lMapInitSfClaimRecoveryPaymentInput.RecoveryPaymentStatus=lStrRecoveryPaymentRecoveryPaymentStatus
					lMapInitSfClaimRecoveryPaymentInput.FinalRecovery=lStrRecoveryPaymentFinalRecovery
					lMapInitSfClaimRecoveryPaymentInput.PayeeIdentificationCardNo=lStrRecoveryPaymentPayeeIdentificationCardNo
					Map lMapInputSfProceedAdditionalDetailRecoveryPayment=IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryPayment.inputSfProceedAdditionalDetailRecoveryPayment(this.parentStageController.getWebDriver(),lElementIgniteClaimRecoveryPaymentFormRoot,lMapInitSfClaimRecoveryPaymentInput)
					if(lMapInputSfProceedAdditionalDetailRecoveryPayment.Result){
						lStrErrorMessage=''
					}else{
						lStrErrorMessage=lMapInputSfProceedAdditionalDetailRecoveryPayment.ErrorMessage
					}
					caseOutput.GroupSfLightningShareClaimMotorStage01DoVerifyFieldStage01ManageResultMessage=lStrErrorMessage
					if(!lMapInputSfProceedAdditionalDetailRecoveryPayment.Result){
						return lreturn
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
}