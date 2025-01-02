package org.roojai.idn.types.salesforce.lightning.quote.motor.car
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
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.openqa.selenium.*
import org.roojai.ignite.types.testmanager.*
import org.roojai.ignite.types.testmanager.IGNTestManagerHelperIDN
import org.roojai.idn.types.salesforce.lightning.quote.motor.car.IDNSalesforceLightningQuoteMotorCarNewbizCoreSearchUtil
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectDriverType
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
public class IDNSalesforceLightningQuoteMotorCarNewbizCreateUtil{
	public WebDriver webDriver
	private IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate parentStageController=null
	public IDNSalesforceLightningQuoteMotorCarNewbizCreateUtil(WebDriver webDriver,IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate initStageController){
		super()
		try{
			this.webDriver=webDriver
			this.parentStageController=initStageController
		}catch(Exception e){
		}
	}
	public IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate getParentStageController(){
		try{
			return this.parentStageController
		}catch(Exception e){
		}
	}
	public void setParentStageController(IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate newParentStageController){
		//Do Nothing
		//this.parentStageController=newParentStageController
	}
	public Boolean inputCase(){
		Boolean lreturn=false
		try{
			String lStrSalesforceRecordID=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			Map lMapSearchDefaultObjectByAccountResult=this.inputSearchObjectAccount(lMapCaseDataCurrentInput)
			if(!lMapSearchDefaultObjectByAccountResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObjectByAccountResult.StrSalesforceRecordID
			}
			IGNUemaHelper.delayWebUISecond(5)
			List<WebElement> lListElementPolicyFlowButton=this.getListElementPolicyFlowButton()
			if(lListElementPolicyFlowButton.size()==0){
				return lreturn
			}
			String lStrOpenPolicyFlowButtonName='New Quote'
			Boolean lIsInputOpenPolicyFlowOK=this.inputPolicyFlowButton(lListElementPolicyFlowButton,lStrOpenPolicyFlowButtonName)
			if(!lIsInputOpenPolicyFlowOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			WebElement lElementIgnitePolicyFlowRoot=this.getElementIgnitePolicyFlowRoot()
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgnitePolicyFlowRoot)){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputProductTypeOK=this.inputSfProductType(lElementIgnitePolicyFlowRoot)
			if(!lIsInputProductTypeOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfVehicleBasicDetailOK=this.inputSfVehicleBasicDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputSfVehicleBasicDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfMainInsuredDetailOK=this.inputSfMainInsuredDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputSfMainInsuredDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfVehicleOtherDetailOK=this.inputSfVehicleOtherDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputSfVehicleOtherDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfVehicleAccessoryDetailOK=this.inputSfVehicleAccessoryDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputSfVehicleAccessoryDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfPlanSelectionDetailOK=this.inputSfPlanSelectionDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputSfPlanSelectionDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputPolicyBasicDetailOK=this.inputSfPolicyBasicDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputPolicyBasicDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputPolicyInformationDetailOK=this.inputSfPolicyInformationDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputPolicyInformationDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputPolicyCoverageDetailOK=this.inputSfPolicyCoverageDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputPolicyCoverageDetailOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputPolicyPaymentDetailOK=this.inputSfPolicyPaymentDetail(lElementIgnitePolicyFlowRoot)
			if(!lIsInputPolicyPaymentDetailOK){
				return lreturn
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSearchObjectAccount(Map mapCaseDataCurrentInput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordID=''
		try{
			lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
				return lreturn
			}
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			Map lMapSearchDefaultObjectByAccountResult=IDNSalesforceLightningQuoteMotorCarNewbizCoreSearchUtil.inputSfSearchObjectAccount(this.webDriver,lMapCaseDataCurrentInput)
			if(!lMapSearchDefaultObjectByAccountResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObjectByAccountResult.StrSalesforceRecordId
			}
			lResult=lStrSalesforceRecordID.length()>0
			IGNUemaHelper.printLog(lResult)
			if(lResult){
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfProductType(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfQuoteMotorProductType=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorProductType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Product_Type')
			String lStrSfQuoteMotorProductTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuoteMotorProductType)
			lreturn=this.inputSfQuoteMotorProductType(lElementIgnitePolicyFlowRoot,lStrSfQuoteMotorProductTypeValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfVehicleBasicDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfQuoteMotorMake=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorMake
			String lStrSfQuoteMotorModel=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorModel
			String lStrSfQuoteMotorModelDescription=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorModelDescription
			String lStrSfQuoteMotorYearRegistration=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorYearRegistration
			String lLocatorVehicleBasicDetailFlowFormRoot='c-ign-vehicle-basic-details'
			WebElement lElementVehicleBasicDetailFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorVehicleBasicDetailFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementVehicleBasicDetailFlowFormRoot)){
				return lreturn
			}
			String lStrInputSfQuoteMotorMakeName='vehicle_make'
			Boolean lIsInputSfQuoteMotorMakeOK=this.inputSfTargetDetailByComboBox(lElementVehicleBasicDetailFlowFormRoot,lStrInputSfQuoteMotorMakeName,lStrSfQuoteMotorMake,true)
			(lIsInputSfQuoteMotorMakeOK)
			if(!lIsInputSfQuoteMotorMakeOK){
				return lreturn
			}
			String lStrInputSfQuoteMotorModelName='vehicle_modelFamily'
			Boolean lIsInputSfQuoteMotorModelOK=this.inputSfTargetDetailByComboBox(lElementVehicleBasicDetailFlowFormRoot,lStrInputSfQuoteMotorModelName,lStrSfQuoteMotorModel,true)
			if(!lIsInputSfQuoteMotorModelOK){
				return lreturn
			}
			String lStrInputSfQuoteMotorManufactureYearName='vehicle_yearOfManufacture'
			Boolean lIsInputSfQuoteMotorManufactureYearOK=this.inputSfTargetDetailByComboBox(lElementVehicleBasicDetailFlowFormRoot,lStrInputSfQuoteMotorManufactureYearName,lStrSfQuoteMotorYearRegistration,true)
			if(!lIsInputSfQuoteMotorManufactureYearOK){
				return lreturn
			}
			String lStrInputSfQuoteMotorModelDescriptionName='vehicle_modelDescription'
			Boolean lIsInputSfQuoteMotorModelDescriptionOK=this.inputSfTargetDetailByComboBox(lElementVehicleBasicDetailFlowFormRoot,lStrInputSfQuoteMotorModelDescriptionName,lStrSfQuoteMotorModelDescription,true)
			if(!lIsInputSfQuoteMotorModelDescriptionOK){
				return lreturn
			}
			Boolean lIsInputNextButtonOK=this.inputNextPageNavigationAction(lElementVehicleBasicDetailFlowFormRoot,'Next')
			if(!lIsInputNextButtonOK){
				return lreturn
			}
			Boolean lIsInputDisclaimerButtonOK=this.inputDisclaimerPageNavigationAction()
			if(!lIsInputDisclaimerButtonOK){
				return lreturn
			}
			lreturn=lIsInputDisclaimerButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfMainInsuredDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lLocatorMainInsuredDetailFlowFormRoot='c-ign-main-insured-details'
			WebElement lElementMainInsuredDetailFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorMainInsuredDetailFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementMainInsuredDetailFlowFormRoot)){
				return lreturn
			}
			String lStrSfQuoteMotorMainDriverOption=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorMainDriverOption
			String lStrSfQuoteMotorCommonMainDriverDob=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverDob
			String lStrSfQuoteMotorCommonMainDriverDrivingLicense=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverDrivingLicense
			String lStrSfQuoteMotorCommonMainDriverMaritalStatus=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverMaritalStatus
			String lStrSfQuoteMotorCommonMainDriverGender=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverGender
			String lStrSfQuoteMotorCommonMainDriverOccupation=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverOccupation
			String lStrSfQuoteMotorOppVehicleNotForCommercialUsage=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorOppVehicleNotForCommercialUsage
			String lStrSfQuoteMotorCarClaimInPast12Month=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCarClaimInPast12Month
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrInputMainInsuredOccupationName='insured_occupation'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Occupation')
			String lStrSfQuoteMotorMainDriverOccupationValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverOccupation)
			Boolean lIsInputMainInsuredOccupationOK=this.inputSfTargetDetailByComboBox(lElementMainInsuredDetailFlowFormRoot,lStrInputMainInsuredOccupationName,lStrSfQuoteMotorMainDriverOccupationValue,true)
			if(!lIsInputMainInsuredOccupationOK){
				return lreturn
			}
			String lStrInputCarOwnerIsMainInsuredName='quote_flagPolicyHolderMainInsured'
			String lStrSfMainDriverReferOptionValue=''
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Main_Driver_Option')
			String lStrSfQuoteMotorMainDriverOptionValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfQuoteMotorMainDriverOption)
			Boolean lIsInputMainDriverOptionOK=this.inputSfMainDriverOption(lStrSfQuoteMotorMainDriverOptionValue,lElementMainInsuredDetailFlowFormRoot)
			if(!lIsInputMainDriverOptionOK){
				return lreturn
			}
			String lStrInputMainInsuredDobName='insured_dob'
			Boolean lIsInputMainInsuredDobOK=this.inputSfMainInsuredDob(lElementMainInsuredDetailFlowFormRoot,lStrInputMainInsuredDobName,lStrSfQuoteMotorCommonMainDriverDob)
			if(!lIsInputMainInsuredDobOK){
				return lreturn
			}
			String lStrMainInsuredGender='insured_gender'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Gender')
			String lStrSfQuoteMotorMainDriverGenderValue=lIGNTestMasterFieldTypeSingle03.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverGender)
			Boolean lIsInputMainInsuredGenderOK=this.inputSfTargetDetailByRadioButton(lElementMainInsuredDetailFlowFormRoot,lStrMainInsuredGender,lStrSfQuoteMotorMainDriverGenderValue,true)
			if(!lIsInputMainInsuredGenderOK){
				return lreturn
			}
			String lStrMainInsuredMaritalStatus='insured_maritialStatus'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle04=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Marital_Status')
			String lStrSfQuoteMotorMainDriverMaritalStatusValue=lIGNTestMasterFieldTypeSingle04.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverMaritalStatus)
			Boolean lIsInputMainInsuredMaritalStatusOK=this.inputSfTargetDetailByRadioButton(lElementMainInsuredDetailFlowFormRoot,lStrMainInsuredMaritalStatus,lStrSfQuoteMotorMainDriverMaritalStatusValue,true)
			if(!lIsInputMainInsuredMaritalStatusOK){
				return lreturn
			}
			String lStrMainInsuredDrivingExp='insured_drivingExperience'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle05=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Driving_License')
			String lStrSfQuoteMotorMainDriverDrivingLicenseValue=lIGNTestMasterFieldTypeSingle05.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverDrivingLicense)
			Boolean lIsInputMainInsuredDrivingExpOK=this.inputSfTargetDetailByRadioButton(lElementMainInsuredDetailFlowFormRoot,lStrMainInsuredDrivingExp,lStrSfQuoteMotorMainDriverDrivingLicenseValue,true)
			if(!lIsInputMainInsuredDrivingExpOK){
				return lreturn
			}
			String lStrMainInsuredNoOfClaim='insured_driverAccidents'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle06=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Car_Claim_In_Past_12_Month')
			String lStrSfQuoteMotorCarClaimInPast12MonthValue=lIGNTestMasterFieldTypeSingle06.getMasterPairValueByKey(lStrSfQuoteMotorCarClaimInPast12Month)
			Boolean lIsInputMainInsuredNoOfClaimOK=this.inputSfTargetDetailByRadioButton(lElementMainInsuredDetailFlowFormRoot,lStrMainInsuredNoOfClaim,lStrSfQuoteMotorCarClaimInPast12MonthValue,true)
			if(!lIsInputMainInsuredNoOfClaimOK){
				return lreturn
			}
			String lStrMainInsuredCommercialVehicleUsage='commercial_vehicle__c'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle07=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Opp_Vehicle_Not_For_Commercial_Usage')
			String lStrSfQuoteMotorOppVehicleNotForCommercialUsageValue=lIGNTestMasterFieldTypeSingle07.getMasterPairValueByKey(lStrSfQuoteMotorOppVehicleNotForCommercialUsage)
			Boolean lIsInputMainInsuredCommercialVehicleUsageOK=this.inputSfTargetDetailByRadioButton(lElementMainInsuredDetailFlowFormRoot,lStrMainInsuredCommercialVehicleUsage,lStrSfQuoteMotorOppVehicleNotForCommercialUsageValue,true)
			if(!lIsInputMainInsuredCommercialVehicleUsageOK){
				return lreturn
			}
			Boolean lIsInputMainInsuredNextButtonOK=this.inputNextPageNavigationAction(lElementMainInsuredDetailFlowFormRoot,'Next')
			if(!lIsInputMainInsuredNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputMainInsuredNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfVehicleOtherDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput

			String lLocatorOtherInsuredDetailFlowFormRoot='c-ign-vehicle-other-details'
			WebElement lElementOtherInsuredDetailFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorOtherInsuredDetailFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementOtherInsuredDetailFlowFormRoot)){
				return lreturn
			}
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrSfQuoteMotorVehicleUsage=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorVehicleUsage
			String lStrSfQuoteMotorPostalCode=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorPostalCode
			String lStrSfQuoteMotorOdoMeter=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorOdoMeter
			String lStrSfQuoteMotorCarPlateProvince=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCarPlateProvince
			String lStrSfQuoteMotorCarDashCamInstalledToDo=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCarDashCamInstalledToDo
			String lStrOtherInsuredVehicleUsage='vehicle_vehicleUsage'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Vehicle_Usage')
			String lStrSfQuoteMotorVehicleUsageValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuoteMotorVehicleUsage)
			Boolean lIsInputOtherInsuredVehicleUsageOK=this.inputSfTargetDetailByRadioButton(lElementOtherInsuredDetailFlowFormRoot,lStrOtherInsuredVehicleUsage,lStrSfQuoteMotorVehicleUsageValue,false)
			if(!lIsInputOtherInsuredVehicleUsageOK){
				return lreturn
			}
			String lStrInputOtherInsuredPostalCodeName='Quote_postalCode'
			Boolean lIsInputOtherInsuredPostalCodeOK=this.inputSfTargetDetailByValue(lElementOtherInsuredDetailFlowFormRoot,lStrInputOtherInsuredPostalCodeName,lStrSfQuoteMotorPostalCode)
			if(!lIsInputOtherInsuredPostalCodeOK){
				return lreturn
			}
			String lStrInputOtherInsuredOdometerReadingName='vehicle_odometerReading'
			Boolean lIsInputOtherInsuredOdometerReadingOK=this.inputSfTargetDetailByValue(lElementOtherInsuredDetailFlowFormRoot,lStrInputOtherInsuredOdometerReadingName,lStrSfQuoteMotorOdoMeter)
			if(!lIsInputOtherInsuredOdometerReadingOK){
				return lreturn
			}
			String lStrInputOtherInsuredCarPlateProvinceName='vehicle_carPlateProvince'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Car_Plate_Province')
			String lStrSfQuoteMotorCarPlateProvinceValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfQuoteMotorCarPlateProvince)
			Boolean lIsInputOtherInsuredCarPlateProvinceOK=this.inputSfTargetDetailByComboBox(lElementOtherInsuredDetailFlowFormRoot,lStrInputOtherInsuredCarPlateProvinceName,lStrSfQuoteMotorCarPlateProvinceValue,true)
			if(!lIsInputOtherInsuredCarPlateProvinceOK){
				return lreturn
			}
			String lStrMainInsuredCarAccessory='vehicle_carAccessoryCarCamera'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Car_Dash_Cam_Installed_To_Do')
			String lStrSfQuoteMotorCarDashCamInstalledToDoValue=lIGNTestMasterFieldTypeSingle03.getMasterPairValueByKey(lStrSfQuoteMotorCarDashCamInstalledToDo)
			Boolean lIsInputMainInsuredCarAccessoryOK=this.inputSfTargetDetailByRadioButton(lElementOtherInsuredDetailFlowFormRoot,lStrMainInsuredCarAccessory,lStrSfQuoteMotorCarDashCamInstalledToDoValue,true)
			if(!lIsInputMainInsuredCarAccessoryOK){
				return lreturn
			}
			Boolean lIsInputOtherInsuredNextButtonOK=this.inputNextPageNavigationAction(lElementOtherInsuredDetailFlowFormRoot,'Next')
			if(!lIsInputOtherInsuredNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputOtherInsuredNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfVehicleAccessoryDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lLocatorAccessoryDetailFlowFormRoot='c-ign-accessories-info'
			WebElement lElementAccessoryDetailFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorAccessoryDetailFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementAccessoryDetailFlowFormRoot)){
				return lreturn
			}
			List<WebElement> lListElementAccessoryDetailFlowFormRoot=this.getListElementAccessoryDetailFlowFormRoot(lElementAccessoryDetailFlowFormRoot)
			(lListElementAccessoryDetailFlowFormRoot.size())
			if(lListElementAccessoryDetailFlowFormRoot.size()==0){
				return lreturn
			}
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrSfQuoteCarAccessoryAdd=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCarAccessoryAdd
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCarAccessoryAdd')
			String lStrSfQuoteCarAccessoryAddValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuoteCarAccessoryAdd)
			Boolean lIsStrSfQuoteCarAccessoryAdd=IGNUemaHelper.convertStringToBoolean(lStrSfQuoteCarAccessoryAddValue)
			if(lIsStrSfQuoteCarAccessoryAdd){
				Map lMapCarAccessoryInputResult=this.getMapCarAccessoryItemFromCaseInput(lMapCaseDataCurrentInput,'SfQuoteCarAccessoryItem')
				Map lMapCarAccessoryInput=lMapCarAccessoryInputResult.MapCarAccessoryInput
				Boolean lIsInputAccessoryOK=this.inputAccessoryDetailTable(lElementAccessoryDetailFlowFormRoot,lListElementAccessoryDetailFlowFormRoot,lMapCarAccessoryInput)
			}
			Boolean lIsInputAccessoryDetailFlowFormNextButtonOK=this.inputNextPageNavigationAction(lElementAccessoryDetailFlowFormRoot,'Next')
			if(!lIsInputAccessoryDetailFlowFormNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputAccessoryDetailFlowFormNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPlanSelectionDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot

		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lLocatorIgnitePlanDetailFlowFormRoot='c-ign-plan-selection'
			WebElement lElementIgnitePlanFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorIgnitePlanDetailFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgnitePlanFlowFormRoot)){
				return lreturn
			}
			String lStrSfQuotePaymentFrequency=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePaymentFrequency
			String lStrSfQuoteCoveragePlanType=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoveragePlanType
			String lStrSfQuoteCoverageDriverPlan=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageDriverPlan
			String lStrSfQuoteCoverageWorkshopType=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageWorkshopType
			String lStrSfQuoteCoverageExcess=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageExcess
			String lStrSfQuoteCoverageTpl=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageTpl
			String lStrSfQuoteCoveragePAME=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoveragePaAndMedicalExpenseSiCar
			String lStrSfQuoteCoverageRsa=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageRsa
			String lStrSfQuoteCoverageSrcc=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageSrcc
			String lStrSfQuoteCoverageTa=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageTa
			String lStrSfQuoteCoverageEq=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageEq
			String lStrSfQuoteCoverageFl=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageFl
			String lStrSfQuoteCoverageTrr=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageTrr
			String lStrInputSfQuotePaymentFrequencyName='paymentFrequency'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePaymentFrequency')
			String lStrSfQuotePaymentFrequencyValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuotePaymentFrequency)
			Boolean lIsInputSfQuotePaymentFrequencyOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuotePaymentFrequencyName,lStrSfQuotePaymentFrequencyValue,true)
			if(!lIsInputSfQuotePaymentFrequencyOK){
				return lreturn
			}
			String lStrInputSfQuoteCoveragePlanTypeName='MOTORVEHICLE__2__Type'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoveragePlanType')
			String lStrSfQuoteCoveragePlanTypeValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfQuoteCoveragePlanType)
			Boolean lIsInputSfQuoteCoveragePlanTypeOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuoteCoveragePlanTypeName,lStrSfQuoteCoveragePlanTypeValue,true)
			if(!lIsInputSfQuoteCoveragePlanTypeOK){
				return lreturn
			}
			String lStrInputSfQuoteCoverageDrivingPlanName='MOTORVEHICLE__3__DrivingPlan'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageDriverPlan')
			String lStrSfQuoteCoverageDrivingPlanValue=lIGNTestMasterFieldTypeSingle03.getMasterPairValueByKey(lStrSfQuoteCoverageDriverPlan)
			Boolean lIsInputSfQuoteCoverageDrivingPlanOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuoteCoverageDrivingPlanName,lStrSfQuoteCoverageDrivingPlanValue,true)
			if(!lIsInputSfQuoteCoverageDrivingPlanOK){
				return lreturn
			}
			String lStrInputSfQuoteCoverageWorkshopTypeName='MOTORVEHICLE__4__Workshop'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle04=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageWorkshopType')
			String lStrSfQuoteCoverageWorkshopTypeValue=lIGNTestMasterFieldTypeSingle04.getMasterPairValueByKey(lStrSfQuoteCoverageWorkshopType)
			Boolean lIsInputSfQuoteCoverageWorkshopTypeOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuoteCoverageWorkshopTypeName,lStrSfQuoteCoverageWorkshopTypeValue,true)
			if(!lIsInputSfQuoteCoverageWorkshopTypeOK){
				return lreturn
			}
			String lStrInputSfQuoteCoverageExcessName='MOTORVEHICLE__5__Excess'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle05=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageExcess')
			String lStrSfQuoteCoverageExcessValue=lIGNTestMasterFieldTypeSingle05.getMasterPairValueByKey(lStrSfQuoteCoverageExcess)
			Boolean lIsInputSfQuoteCoverageExcessOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuoteCoverageExcessName,lStrSfQuoteCoverageExcessValue,true)
			if(!lIsInputSfQuoteCoverageExcessOK){
				return lreturn
			}
			String lStrInputSfQuoteCoveragePAMEName='PAME__1__PAMESumAssured'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle06=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoveragePaAndMedicalExpenseSiCar')
			String lStrSfQuoteCoveragePAMEValue=lIGNTestMasterFieldTypeSingle06.getMasterPairValueByKey(lStrSfQuoteCoveragePAME)
			Boolean lIsInputSfQuoteCoveragePAMEOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuoteCoveragePAMEName,lStrSfQuoteCoveragePAMEValue,true)
			if(!lIsInputSfQuoteCoveragePAMEOK){
				return lreturn
			}
			String lStrInputSfQuoteCoverageTplName='TPL__1__TPLSumAssured'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle07=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageTpl')
			String lStrSfQuoteCoverageTplValue=lIGNTestMasterFieldTypeSingle07.getMasterPairValueByKey(lStrSfQuoteCoverageTpl)
			Boolean lIsInputSfQuoteCoverageTplOK=this.inputSfTargetDetailByComboBox(lElementIgnitePlanFlowFormRoot,lStrInputSfQuoteCoverageTplName,lStrSfQuoteCoverageTplValue,true)
			if(!lIsInputSfQuoteCoverageTplOK){
				return lreturn
			}
			String lStrSfQuoteCoverageEqName='EQ__1__EQ'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle08=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageEq')
			String lStrSfQuoteCoverageEqValue=lIGNTestMasterFieldTypeSingle08.getMasterPairValueByKey(lStrSfQuoteCoverageEq)
			Boolean lIsInputSfQuoteCoverageEqOK=this.inputSfTargetPlanDetailByCheckBox(lElementIgnitePlanFlowFormRoot,lStrSfQuoteCoverageEqName,lStrSfQuoteCoverageEqValue)
			if(!lIsInputSfQuoteCoverageEqOK){
				return lreturn
			}
			String lStrSfQuoteCoverageSrccName='SRCC__1__SRCC'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle09=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageSrcc')
			String lStrSfQuoteCoverageSrccValue=lIGNTestMasterFieldTypeSingle09.getMasterPairValueByKey(lStrSfQuoteCoverageSrcc)
			Boolean lIsInputSfQuoteCoverageSrccOK=this.inputSfTargetPlanDetailByCheckBox(lElementIgnitePlanFlowFormRoot,lStrSfQuoteCoverageSrccName,lStrSfQuoteCoverageSrccValue)
			if(!lIsInputSfQuoteCoverageSrccOK){
				return lreturn
			}
			String lStrSfQuoteCoverageRsaName='RSA__1__RSA'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle10=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageRsa')
			String lStrSfQuoteCoverageRsaValue=lIGNTestMasterFieldTypeSingle10.getMasterPairValueByKey(lStrSfQuoteCoverageRsa)
			Boolean lIsInputSfQuoteCoverageRsaOK=this.inputSfTargetPlanDetailByCheckBox(lElementIgnitePlanFlowFormRoot,lStrSfQuoteCoverageRsaName,lStrSfQuoteCoverageRsaValue)
			if(!lIsInputSfQuoteCoverageRsaOK){
				return lreturn
			}
			String lStrSfQuoteCoverageTaName='TA__1__TA'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle11=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageTa')
			String lStrSfQuoteCoverageTaValue=lIGNTestMasterFieldTypeSingle11.getMasterPairValueByKey(lStrSfQuoteCoverageTa)
			Boolean lIsInputSfQuoteCoverageTaOK=this.inputSfTargetPlanDetailByCheckBox(lElementIgnitePlanFlowFormRoot,lStrSfQuoteCoverageTaName,lStrSfQuoteCoverageTaValue)
			if(!lIsInputSfQuoteCoverageTaOK){
				return lreturn
			}
			String lStrSfQuoteCoverageTrrName='TRR__1__TRR'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle12=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageTrr')
			String lStrSfQuoteCoverageTrrValue=lIGNTestMasterFieldTypeSingle12.getMasterPairValueByKey(lStrSfQuoteCoverageTrr)
			Boolean lIsInputSfQuoteCoverageTrrOK=this.inputSfTargetPlanDetailByCheckBox(lElementIgnitePlanFlowFormRoot,lStrSfQuoteCoverageTrrName,lStrSfQuoteCoverageTrrValue)
			if(!lIsInputSfQuoteCoverageTrrOK){
				return lreturn
			}
			String lStrSfQuoteCoverageFlName='FL__1__FL'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle13=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteCoverageFl')
			String lStrSfQuoteCoverageFlValue=lIGNTestMasterFieldTypeSingle13.getMasterPairValueByKey(lStrSfQuoteCoverageFl)
			Boolean lIsInputSfQuoteCoverageFlOK=this.inputSfTargetPlanDetailByCheckBox(lElementIgnitePlanFlowFormRoot,lStrSfQuoteCoverageFlName,lStrSfQuoteCoverageFlValue)
			if(!lIsInputSfQuoteCoverageFlOK){
				return lreturn
			}
			Boolean lIsInputIgnitePlanFlowFormNextButtonOK=this.inputNextPageNavigationAction(lElementIgnitePlanFlowFormRoot,'Next')
			if(!lIsInputIgnitePlanFlowFormNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputIgnitePlanFlowFormNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyBasicDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot

		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrSfQuoteMotorMainDriverOption=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorMainDriverOption
			String lStrSfQuoteMotorCommonMainDriverName=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverName
			String lStrSfQuoteMotorCommonMainDriverDob=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverDob
			String lStrSfQuoteMotorCommonMainDriverDrivingLicense=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverDrivingLicense
			String lStrSfQuoteMotorCommonMainDriverMaritalStatus=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverMaritalStatus
			String lStrSfQuoteMotorCommonMainDriverGender=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverGender
			String lStrSfQuoteMotorCommonMainDriverOccupation=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCommonMainDriverOccupation
			String lStrSfQuoteMotorCarClaimInPast12Month=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuoteMotorCarClaimInPast12Month
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Main_Driver_Option')
			String lStrSfQuoteMotorMainDriverOptionValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuoteMotorMainDriverOption)
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Occupation')
			String lStrSfQuoteMotorMainDriverOccupationValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverOccupation)
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Gender')
			String lStrSfQuoteMotorMainDriverGenderValue=lIGNTestMasterFieldTypeSingle03.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverGender)
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle04=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Marital_Status')
			String lStrSfQuoteMotorMainDriverMaritalStatusValue=lIGNTestMasterFieldTypeSingle04.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverMaritalStatus)
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle05=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Common_Main_Driver_Driving_License')
			String lStrSfQuoteMotorMainDriverDrivingLicenseValue=lIGNTestMasterFieldTypeSingle05.getMasterPairValueByKey(lStrSfQuoteMotorCommonMainDriverDrivingLicense)
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle06=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Quote_Motor_Car_Claim_In_Past_12_Month')
			String lStrSfQuoteMotorCarClaimInPast12MonthValue=lIGNTestMasterFieldTypeSingle06.getMasterPairValueByKey(lStrSfQuoteMotorCarClaimInPast12Month)
			String lLocatorPolicyDetailBasicFlowFormRoot='c-ign-policy-details-basic'
			WebElement lElementPolicyDetailBasicFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorPolicyDetailBasicFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementPolicyDetailBasicFlowFormRoot)){
				return lreturn
			}
			IDNEnumSalesforceObjectDriverType lIDNEnumSalesforceObjectDriverType=null
			try{
				lIDNEnumSalesforceObjectDriverType=IDNEnumSalesforceObjectDriverType.valueOf(lStrSfQuoteMotorMainDriverOptionValue)
			}catch(Exception e){
			}
			String lLocatorPolicyHolderAndMainInsuredFlowFormRoot='c-ign-policy-holder-and-main-insured-details'
			WebElement lElementPolicyHolderAndMainInsuredFlowFormRoot=this.getElementPolicyHolderAndMainInsured(lElementPolicyDetailBasicFlowFormRoot,lIDNEnumSalesforceObjectDriverType)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementPolicyHolderAndMainInsuredFlowFormRoot)){
				return lreturn
			}
			if(lIDNEnumSalesforceObjectDriverType!=IDNEnumSalesforceObjectDriverType.SameDriver){
				WebElement lElementInputPolicyHolderAndMainInsuredName=this.getElementInputPolicyHolderAndMainInsuredName(lElementPolicyHolderAndMainInsuredFlowFormRoot)
				if(lIDNEnumSalesforceObjectDriverType==IDNEnumSalesforceObjectDriverType.NewDriver){
				}else{
					Boolean lIsSelectPolicyHolderAndMainInsuredNameOK=this.selectPolicyHolderAndMainInsuredNameFromList(lElementPolicyHolderAndMainInsuredFlowFormRoot,lElementInputPolicyHolderAndMainInsuredName,lStrSfQuoteMotorCommonMainDriverName)
					if(!lIsSelectPolicyHolderAndMainInsuredNameOK){
						return lreturn
					}
				}
				Boolean lIsInputEditPolicyHolderAndMainInsuredPageActionOK=this.inputEditPolicyHolderAndMainInsuredPageAction(lElementPolicyHolderAndMainInsuredFlowFormRoot)
				if(!lIsInputEditPolicyHolderAndMainInsuredPageActionOK){
					return lreturn
				}
				String lLocatorIgniteAccountFlowFormRoot='c-ign-account-form-data'
				WebElement lElementIgniteAccountFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementPolicyHolderAndMainInsuredFlowFormRoot,lLocatorIgniteAccountFlowFormRoot)
				if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteAccountFlowFormRoot)){
					return lreturn
				}
				Boolean lIsInputSfPolicyHolderAndMainInsuredPageNavigationSaveButtonClickOK=this.inputSfPolicyHolderAndMainInsuredPageActionNavigation(lElementIgniteAccountFlowFormRoot,'Save')
				if(!lIsInputSfPolicyHolderAndMainInsuredPageNavigationSaveButtonClickOK){
					return lreturn
				}
				lIsInputEditPolicyHolderAndMainInsuredPageActionOK=this.inputEditPolicyHolderAndMainInsuredPageAction(lElementPolicyHolderAndMainInsuredFlowFormRoot)
				if(!lIsInputEditPolicyHolderAndMainInsuredPageActionOK){
					return lreturn
				}
				lElementIgniteAccountFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementPolicyHolderAndMainInsuredFlowFormRoot,lLocatorIgniteAccountFlowFormRoot)
				String lInputSfPolicyHolderAndMainInsuredDateOfBirthName='PersonBirthdate'
				Boolean lIsSfPolicyHolderAndMainInsuredDateOfBirthOK=this.inputSfPolicyHolderAndMainInsuredDob(lElementIgniteAccountFlowFormRoot,lInputSfPolicyHolderAndMainInsuredDateOfBirthName,lStrSfQuoteMotorCommonMainDriverDob)
				if(!lIsSfPolicyHolderAndMainInsuredDateOfBirthOK){
					return lreturn
				}
				String lInputSfPolicyHolderAndMainInsuredOccupationName='Contact_Individual_Occupation__c'
				Boolean lIsSfPolicyHolderAndMainInsuredOccupationOK=this.inputSfPolicyHolderAndMainInsuredByComboBox(lElementIgniteAccountFlowFormRoot,lInputSfPolicyHolderAndMainInsuredOccupationName,lStrSfQuoteMotorMainDriverOccupationValue,true)
				if(!lIsSfPolicyHolderAndMainInsuredOccupationOK){
					return lreturn
				}
				String lInputSfPolicyHolderAndMainInsuredGenderName='Contact_Individual_Gender__c'
				Boolean lIsSfPolicyHolderAndMainInsuredGenderOK=this.inputSfPolicyHolderAndMainInsuredByComboBox(lElementIgniteAccountFlowFormRoot,lInputSfPolicyHolderAndMainInsuredGenderName,lStrSfQuoteMotorMainDriverGenderValue,true)
				if(!lIsSfPolicyHolderAndMainInsuredGenderOK){
					return lreturn
				}
				String lInputSfPolicyHolderAndMainInsuredMaritalStatusName='Contact_Individual_Marital_Status__c'
				Boolean lIsSfPolicyHolderAndMainInsuredMaritalStatusOK=this.inputSfPolicyHolderAndMainInsuredByComboBox(lElementIgniteAccountFlowFormRoot,lInputSfPolicyHolderAndMainInsuredMaritalStatusName,lStrSfQuoteMotorMainDriverMaritalStatusValue,true)
				if(!lIsSfPolicyHolderAndMainInsuredMaritalStatusOK){
					return lreturn
				}
				String lInputSfPolicyHolderAndMainInsuredDrivingLicenseExperienceName='Driving_Experience__c'
				Boolean lIsSfPolicyHolderAndMainInsuredDrivingLicenseExperienceOK=this.inputSfPolicyHolderAndMainInsuredByComboBox(lElementIgniteAccountFlowFormRoot,lInputSfPolicyHolderAndMainInsuredDrivingLicenseExperienceName,lStrSfQuoteMotorMainDriverDrivingLicenseValue,true)
				if(!lIsSfPolicyHolderAndMainInsuredDrivingLicenseExperienceOK){
					return lreturn
				}
				String lInputSfPolicyHolderAndMainInsuredClaim12MonthName='Acccidents_in_the_last_12_mnths__c'
				Boolean lIsSfPolicyHolderAndMainInsuredClaim12MonthOK=this.inputSfPolicyHolderAndMainInsuredByComboBox(lElementIgniteAccountFlowFormRoot,lInputSfPolicyHolderAndMainInsuredClaim12MonthName,lStrSfQuoteMotorCarClaimInPast12MonthValue,true)
				if(!lIsSfPolicyHolderAndMainInsuredClaim12MonthOK){
					return lreturn
				}
				lIsInputSfPolicyHolderAndMainInsuredPageNavigationSaveButtonClickOK=this.inputSfPolicyHolderAndMainInsuredPageActionNavigation(lElementIgniteAccountFlowFormRoot,'Save')
				if(!lIsInputSfPolicyHolderAndMainInsuredPageNavigationSaveButtonClickOK){
					return lreturn
				}
			}
			Boolean lIsInputPolicyDetailBasiclowFormNextButtonOK=this.inputNextPageNavigationAction(lElementPolicyDetailBasicFlowFormRoot,'Next')
			if(!lIsInputPolicyDetailBasiclowFormNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputPolicyDetailBasiclowFormNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyInformationDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lLocatorPolicyDetailInformationFlowFormRoot='c-ign-policy-details-information'
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrSfQuotePolicyStartDateOffsetDay=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyStartDateOffsetDay
			String lStrSfQuoteCarPlateNumber=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarPlateNumber
			String lStrSfQuoteCarChassisNumber=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyChassisNumber
			String lStrSfQuotePolicyPreviousInsurer=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyPreviousInsurer
			String lStrSfQuotePolicyCurrentCoverType=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCurrentCoverType
			String lStrSfQuotePolicyCarModification=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarModification
			String lStrSfQuotePolicyCarFinancing=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarFinancing
			String lStrSfQuotePolicyCarBeneficiary=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarBeneficiary
			String lStrSfQuotePolicyCarBeneficiarySpecifyOtherReason=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarBeneficiarySpecifyOtherReason
			WebElement lElementPolicyDetailInformationFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorPolicyDetailInformationFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementPolicyDetailInformationFlowFormRoot)){
				return lreturn
			}
			Map lMapInputfQuotePolicyStartDateResult=this.inputSfQuotePolicyStartDate(lStrSfQuotePolicyStartDateOffsetDay)
			if(!lMapInputfQuotePolicyStartDateResult.Result){
				return lreturn
			}
			String lStrSfQuotePolicyStartDateText=lMapInputfQuotePolicyStartDateResult.StrQuotePolicyStartDate
			String lStrInputPolicyStartDateName='quote_startDate'
			Boolean lIsInputPolicyStartDateOK=this.inputSfPolicyDetailInformationByValue(lElementPolicyDetailInformationFlowFormRoot,lStrInputPolicyStartDateName,lStrSfQuotePolicyStartDateText)
			if(!lIsInputPolicyStartDateOK){
				return lreturn
			}
			String lStrInputCarPlateNumberName='vehicle_carPlateNumber'
			Boolean lIsInputCarPlateNumberOK=this.inputSfPolicyDetailInformationByValue(lElementPolicyDetailInformationFlowFormRoot,lStrInputCarPlateNumberName,lStrSfQuoteCarPlateNumber)
			if(!lIsInputCarPlateNumberOK){
				return lreturn
			}
			String lStrInputChassisNumberName='vehicle_chassisNumber'
			Boolean lIsInputChassisNumberOK=this.inputSfPolicyDetailInformationByValue(lElementPolicyDetailInformationFlowFormRoot,lStrInputChassisNumberName,lStrSfQuoteCarChassisNumber)
			if(!lIsInputChassisNumberOK){
				return lreturn
			}
			String lStrInputSfQuotePolicyPreviousInsurerName='quote_previousInsurer'
			Boolean lIsInputSfQuotePolicyPreviousInsurerOK=this.inputSfTargetDetailByComboBox(lElementPolicyDetailInformationFlowFormRoot,lStrInputSfQuotePolicyPreviousInsurerName,lStrSfQuotePolicyPreviousInsurer,true)
			if(!lIsInputSfQuotePolicyPreviousInsurerOK){
				return lreturn
			}
			String lStrInputSfQuotePolicyCurrentCoverTypeName='quote_previousCoverType'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle26=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCurrentCoverType')
			String lStrSfQuotePolicyCurrentCoverTypeValue=lIGNTestMasterFieldTypeSingle26.getMasterPairValueByKey(lStrSfQuotePolicyCurrentCoverType)
			Boolean lIsInputSfQuotePolicyCurrentCoverTypeOK=this.inputSfTargetDetailByComboBox(lElementPolicyDetailInformationFlowFormRoot,lStrInputSfQuotePolicyCurrentCoverTypeName,lStrSfQuotePolicyCurrentCoverTypeValue,true)
			if(!lIsInputSfQuotePolicyCurrentCoverTypeOK){
				return lreturn
			}
			String lStrInputSfQuotePolicyCarModificationName='vehicle_isCarModified'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle27=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarModification')
			String lStrSfQuotePolicyCarModificationValue=lIGNTestMasterFieldTypeSingle27.getMasterPairValueByKey(lStrSfQuotePolicyCarModification)
			Boolean lIsInputSfQuotePolicyCarModificationOK=this.inputSfTargetDetailByComboBox(lElementPolicyDetailInformationFlowFormRoot,lStrInputSfQuotePolicyCarModificationName,lStrSfQuotePolicyCarModificationValue,true)
			if(!lIsInputSfQuotePolicyCarModificationOK){
				return lreturn
			}
			String lStrInputSfQuotePolicyCarFinancingName='vehicle_flagCarFinancing'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle28=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePolicyCarFinancing')
			String lStrSfQuotePolicyCarFinancingValue=lIGNTestMasterFieldTypeSingle28.getMasterPairValueByKey(lStrSfQuotePolicyCarFinancing)
			Boolean lIsInputSfQuotePolicyCarFinancingOK=this.inputSfTargetDetailByComboBox(lElementPolicyDetailInformationFlowFormRoot,lStrInputSfQuotePolicyCarFinancingName,lStrSfQuotePolicyCarFinancingValue,true)
			if(!lIsInputSfQuotePolicyCarFinancingOK){
				return lreturn
			}
			String lStrInputSfQuotePolicyCarBeneficiaryName='quote_beneficiariesData'
			Boolean lIsInputSfQuotePolicyCarBeneficiaryOK=this.inputSfTargetDetailByComboBox(lElementPolicyDetailInformationFlowFormRoot,lStrInputSfQuotePolicyCarBeneficiaryName,lStrSfQuotePolicyCarBeneficiary,true)
			if(!lIsInputSfQuotePolicyCarBeneficiaryOK){
				return lreturn
			}
			if(lStrSfQuotePolicyCarBeneficiary=='Other Financing Company'){
				String lStrInputSfQuotePolicyCarBeneficiarySpecifyOtherReasonName='financeCompany'
				Boolean lIsInputSfQuotePolicyCarBeneficiarySpecifyOtherReasonOK=this.inputSfPolicyDetailInformationByValue(lElementPolicyDetailInformationFlowFormRoot,lStrInputSfQuotePolicyCarBeneficiarySpecifyOtherReasonName,lStrSfQuotePolicyCarBeneficiarySpecifyOtherReason)
				if(!lIsInputSfQuotePolicyCarBeneficiarySpecifyOtherReasonOK){
					return lreturn
				}
			}
			Boolean lIsInputPolicyDetailInformationFlowFormNextButtonOK=this.inputNextPageNavigationAction(lElementPolicyDetailInformationFlowFormRoot,'Next')
			if(!lIsInputPolicyDetailInformationFlowFormNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputPolicyDetailInformationFlowFormNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyCoverageDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
				String lLocatorIgniteSelectedCoverageFlowFormRoot='c-ign-selected-coverage'
			WebElement lElementIgniteSelectedCoverageFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorIgniteSelectedCoverageFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteSelectedCoverageFlowFormRoot)){
				return lreturn
			}
			Boolean lIsInputIgniteSelectedCoverageFlowFormNextButtonOK=this.inputNextPageNavigationAction(lElementIgniteSelectedCoverageFlowFormRoot,'Next')
			if(!lIsInputIgniteSelectedCoverageFlowFormNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputIgniteSelectedCoverageFlowFormNextButtonOK
			}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyPaymentDetail(WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfQuotePaymentMethod=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePaymentMethod
			String lStrSfQuotePaymentDecision=lMapCaseDataCurrentInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePaymentDecision
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lLocatorIgnitePaymentPageFlowFormRoot='c-ign-payment-page'
			WebElement lElementIgnitePaymentPageFlowFormRoot=this.getElementTargetFlowDetailRoot(lElementIgnitePolicyFlowRoot,lLocatorIgnitePaymentPageFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgnitePaymentPageFlowFormRoot)){
				return lreturn
			}
			String lStrInputSfQuotePaymentMethodName='paymentMethod'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePaymentMethod')
			String lStrSfQuotePaymentMethodValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfQuotePaymentMethod)
			Boolean lIsInputSfQuotePaymentMethodOK=this.inputSfTargetDetailByComboBox(lElementIgnitePaymentPageFlowFormRoot,lStrInputSfQuotePaymentMethodName,lStrSfQuotePaymentMethodValue,true)
			if(!lIsInputSfQuotePaymentMethodOK){
				return lreturn
			}
			String lStrInputSfQuotePaymentDecisionName='paymentDecision'
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName('GroupSfLightningShareQuoteMotorStage02DoManageFieldSfQuotePaymentDecision')
			String lStrSfQuotePaymentDecisionValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfQuotePaymentDecision)
			Boolean lIsInputSfQuotePaymentDecisionOK=this.inputSfTargetDetailByComboBox(lElementIgnitePaymentPageFlowFormRoot,lStrInputSfQuotePaymentDecisionName,lStrSfQuotePaymentDecisionValue,false)
			if(!lIsInputSfQuotePaymentDecisionOK){
				return lreturn
			}
			Boolean lIsInputIgnitePaymentPageFlowFormActivatePolicyButtonOK=this.inputNextPageNavigationAction(lElementIgnitePaymentPageFlowFormRoot,'Activate Policy')
			if(!lIsInputIgnitePaymentPageFlowFormActivatePolicyButtonOK){
				return lreturn
			}
			lreturn=lIsInputIgnitePaymentPageFlowFormActivatePolicyButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	
	public List<WebElement> getListElementPolicyFlowButton(){
		List<WebElement> lreturn=null
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01SearchHomeFlexipageParent='div.recordHomeFlexipage2'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild01='div.actionsContainer'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild02='runtime_platform_actions-actions-ribbon'
			List<WebElement> lListElementSearch03InputLevel01PolicyFlowButton=null
			WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)){
				WebElement lElementSearch01InputLevel01SearchHomeFlexipageParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)
				if(lElementSearch01InputLevel01SearchHomeFlexipageParent){
					WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild01=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01SearchHomeFlexipageParent,lLocatorSearch01InputLevel01SearchHomeFlexipageChild01,true)
					if(lElementSearch01InputLevel01SearchHomeFlexipageChild01){
						lElementSearch01InputLevel01SearchHomeFlexipageChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild01,lLocatorSearch01InputLevel01SearchHomeFlexipageChild02,true)
					}
				}
			}
			String lLocatorSearch02InputLevel01LightningButtonMenuParent='ul'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild01='li'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild02='runtime_platform_actions-action-renderer'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild03='lightning-button'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild04='button'
			List<WebElement> lListElementSearch02InputLevel01LightningButtonMenuChild01=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild02=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild03=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild04=null
			if(lElementSearch01InputLevel01SearchHomeFlexipageChild02){
				WebElement lElementSearch02InputLevel01LightningButtonMenuParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild02,lLocatorSearch02InputLevel01LightningButtonMenuParent,true)
				if(lElementSearch02InputLevel01LightningButtonMenuParent){
					lListElementSearch02InputLevel01LightningButtonMenuChild01=IGNUemaHelper.getChildWebElementListOfWebElement(this.webDriver,lElementSearch02InputLevel01LightningButtonMenuParent,lLocatorSearch02InputLevel01LightningButtonMenuChild01)
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
	public Boolean inputPolicyFlowButton(List<WebElement> listElementPolicyFlowButton,String strOpenPolicyFlowButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementPolicyFlowButton)){
			return lreturn
		}
		List<WebElement> lListElementPolicyFlowButton=listElementPolicyFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(strOpenPolicyFlowButtonName)){
			return lreturn
		}
		String lStrOpenPolicyFlowButtonName=strOpenPolicyFlowButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrOpenPolicyFlowButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningButtonParent='runtime_platform_actions-action-renderer'
			String lLocatorSearch01InputLevel01LightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			for(Integer lIndex=0;lIndex<=lListElementPolicyFlowButton.size()-1;lIndex++){
				WebElement lElementPolicyFlowButton=lListElementPolicyFlowButton.get(lIndex)
				WebElement lElementSearch01InputLevel01LightningButtonParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementPolicyFlowButton,lLocatorSearch01InputLevel01LightningButtonParent,true)
				String lStrPolicyFlowButtonValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01LightningButtonParent,'title')
				if(lStrPolicyFlowButtonValue==lStrOpenPolicyFlowButtonName){
					WebElement lElementSearch01InputLevel01LightningButtonChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningButtonParent,lLocatorSearch01InputLevel01LightningButtonChild01,true)
					if(lElementSearch01InputLevel01LightningButtonChild01){
						WebElement lElementSearch01InputLevel01LightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningButtonChild01,lLocatorSearch01InputLevel01LightningButtonChild02,true)
						if(lElementSearch01InputLevel01LightningButtonChild02){
							IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningButtonChild02)
							lResult=true
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
	public WebElement getElementIgnitePolicyFlowRoot(){
		WebElement lreturn=null
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01IgnitePolicyFlowParent='c-ignite-policy-flow'
			String lLocatorSearch01InputLevel01IgnitePolicyFlowChild01='div.slds-grid'
			String lLocatorSearch01InputLevel01IgnitePolicyFlowChild02='c-ign-quotation-flow'
			WebElement lElementSearch01InputLevel01IgnitePolicyFlowChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.webDriver,lLocatorSearch01InputLevel01IgnitePolicyFlowParent)){
				WebElement lElementSearch01InputLevel01IgnitePolicyFlowParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01IgnitePolicyFlowParent)
				if(lElementSearch01InputLevel01IgnitePolicyFlowParent){
					WebElement lElementSearch01InputLevel01IgnitePolicyFlowChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgnitePolicyFlowParent,lLocatorSearch01InputLevel01IgnitePolicyFlowChild01,true)
					if(lElementSearch01InputLevel01IgnitePolicyFlowChild01){
						lElementSearch01InputLevel01IgnitePolicyFlowChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgnitePolicyFlowChild01,lLocatorSearch01InputLevel01IgnitePolicyFlowChild02,true)
					}
				}
			}
			if(lElementSearch01InputLevel01IgnitePolicyFlowChild02){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01IgnitePolicyFlowChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfQuoteMotorProductType(WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorProductType){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorProductType)){
			return lreturn
		}
		String lStrSfQuoteMotorProductType=strSfQuoteMotorProductType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorProductType)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild05='lightning-base-combobox-item'
			Boolean lIsProductTypeDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
					if(lElementSearch01InputLevel01QuotationFlowFormChild02){
						String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,'id')
						if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'ProductType')){
							lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
						}
					}
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild03){
				WebElement lElemenSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03,lLocatorSearch01InputLevel01QuotationFlowFormChild04,true)
				if(lElemenSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElemenSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild03){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03,lLocatorSearch01InputLevel01QuotationFlowFormChild05)
				if(lListElementSearch01InputLevel01QuotationFlowFormChild04.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
						String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,'data-value')
						lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
						lStrSfQuoteMotorProductType=lStrSfQuoteMotorProductType.toLowerCase()
						if(lStrProductTypeValue==lStrSfQuoteMotorProductType){
							IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
							lIsProductTypeDropDownClickOK=true
						}
					}
				}
			}
			if(lIsProductTypeDropDownClickOK){
				if(lElementSearch01InputLevel01QuotationFlowFormParent){
					Boolean lIsInputNextPageNavigationActionDoneOK=this.inputNextPageNavigationAction(lElementSearch01InputLevel01QuotationFlowFormParent,'Next')
					if(lIsInputNextPageNavigationActionDoneOK){
						lResult=true
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean checkSameDriverOption(String strSfMainDriverReferOptionValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(strSfMainDriverReferOptionValue)){
			return lreturn
		}
		String lStrSfMainDriverReferOptionValue=strSfMainDriverReferOptionValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfMainDriverReferOptionValue)){
			return lreturn
		}
		try{
			Integer lNumSfMainDriverReferOption=IGNUemaHelper.convertStringToInteger(lStrSfMainDriverReferOptionValue,0)
			switch(lNumSfMainDriverReferOption){
				case 0:
					lResult=true
					break
				default:
					lResult=false
					break
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean checkNewDriverOption(String strSfMainDriverReferOptionValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(strSfMainDriverReferOptionValue)){
			return lreturn
		}
		String lStrSfMainDriverReferOptionValue=strSfMainDriverReferOptionValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfMainDriverReferOptionValue)){
			return lreturn
		}
		try{
			Integer lNumSfMainDriverReferOption=IGNUemaHelper.convertStringToInteger(lStrSfMainDriverReferOptionValue,0)
			switch(lNumSfMainDriverReferOption){
				case 2:
					lResult=true
					break
				default:
					lResult=false
					break
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputEditPolicyHolderAndMainInsuredPageAction(WebElement elementPolicyHolderAndMainInsuredRoot){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementPolicyHolderAndMainInsuredRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent=elementPolicyHolderAndMainInsuredRoot
		try{
			WebElement lElementPolicyHolderAndMainInsuredLightningButtonMain=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02='button'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02=null
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01,true)
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01){
				lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02,true)
			}
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02)
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean closePolicyHolderAndMainInsuredAccountName(WebElement elementPolicyHolderAndMainInsuredRoot){
		Boolean lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementPolicyHolderAndMainInsuredRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconParent=elementPolicyHolderAndMainInsuredRoot
		try{
			WebElement lElementPolicyHolderAndMainInsuredCloseIconMain=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild01='div.pillDiv.slds-show'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild02='button'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild03='lightning-icon.slds-icon-utility-close.slds-icon_container'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04='lightning-primitive-icon'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04=null
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild01,true)
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild01){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild02,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild02){
					WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild03=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild03,true)
					if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild03){
						lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild03,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04,true)
					}
				}
			}
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04)
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCloseIconChild04)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementInputPolicyHolderAndMainInsuredName(WebElement elementPolicyHolderAndMainInsuredRoot){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementPolicyHolderAndMainInsuredRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent=elementPolicyHolderAndMainInsuredRoot
		try{
			WebElement lElementPolicyHolderAndMainInsuredLightningInputMain=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01='c-ign-custom-record-search'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02='lightning-input'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04='input'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04=null
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01,true)
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01){
				Boolean lIsClosePolicyHolderAndMainInsuredAccount=this.closePolicyHolderAndMainInsuredAccountName(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01)
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02){
					WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,true)
					if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03){
						lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04,true)
					}
				}
			}
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04)
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04)
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean selectPolicyHolderAndMainInsuredNameFromList(WebElement elementPolicyHolderAndMainInsuredRoot,WebElement elementInputPolicyHolderAndMainInsuredName,String strSfCommonMainDriverName){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementPolicyHolderAndMainInsuredRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxParent=elementPolicyHolderAndMainInsuredRoot
		if(IGNUemaHelper.checkObjectNullOfObject(elementInputPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		WebElement lElementInputPolicyHolderAndMainInsuredName=elementInputPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectNullOfObject(strSfCommonMainDriverName)){
			return lreturn
		}
		String lStrSfCommonMainDriverName=strSfCommonMainDriverName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfCommonMainDriverName)){
			return lreturn
		}
		try{
			WebElement lElementPolicyHolderAndMainInsuredListBoxMain=null
			IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementInputPolicyHolderAndMainInsuredName,lStrSfCommonMainDriverName)
			IGNUemaHelper.delayWebUISecond(3)
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild01='c-ign-custom-record-search'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02='li.slds-listbox__item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03='span.slds-listbox__option-text.slds-listbox__option-text_entity'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild04='div.slds-media.slds-listbox__option'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild05='lightning-primitive-icon'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild06='path'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03=null
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild01,true)
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild01){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02.get(lIndex)
						lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03){
							String lStrSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03Text=lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03.getText()
							if(lStrSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild03Text==lStrSfCommonMainDriverName){
								Boolean lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK=false
								IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementInputPolicyHolderAndMainInsuredName)
								lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK=IGNUemaHelper.clickByWebElementNoScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02)
								if(!lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK){
									IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementInputPolicyHolderAndMainInsuredName)
									lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK=IGNUemaHelper.clickByWebElementNoScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02)
								}
								if(!lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK){
									IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementInputPolicyHolderAndMainInsuredName)
									lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK=IGNUemaHelper.clickByWebElementNoScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02)
								}
								if(!lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK){
									IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementInputPolicyHolderAndMainInsuredName)
									lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02ClickOK=IGNUemaHelper.clickByWebElementNoScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredListBoxChild02)
								}
							}
						}
					}
				}
			}
			lResult=true
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputNextPageNavigationAction(WebElement elementIgnitePolicyFlowRoot,String strNavigationButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationParent=elementIgnitePolicyFlowRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strNavigationButtonName)){
			return lreturn
		}
		String lStrNavigationButtonName=strNavigationButtonName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrNavigationButtonName)){
			return lreturn
		}
		try{
			WebElement lElementQuotationFlowFormFooterNavigationLightningButtonMain=null
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild01='div.slds-card__footer.navigationBar'
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild02='lightning-button'
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild03='button'
			WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03=null
			WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationParent,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild01,true)
			if(lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01){
				List<WebElement> lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02=IGNUemaHelper.getChildWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild02)
				if(lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02=lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.get(lIndex)
						String lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text=lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.getText()
						if((lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text==lStrNavigationButtonName)||(IGNUemaHelper.checkStringContainString(lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text,lStrNavigationButtonName))){
							lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild03,true)
						}
					}
				}
			}
			if(lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03)
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputDisclaimerPageNavigationAction(){
		Boolean lreturn=false
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01LightningOverlayContainerParent='lightning-overlay-container'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild01='lightning-modal-base'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild02='lightning-modal'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild03='lightning-button'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild04='button'
			WebElement lElementSearch01InputLevel01LightningOverlayContainerChild04=null
			WebElement lElementSearch01InputLevel01LightningOverlayContainerParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver, lLocatorSearch01InputLevel01LightningOverlayContainerParent)
			if(lElementSearch01InputLevel01LightningOverlayContainerParent){
				WebElement lElementSearch01InputLevel01LightningOverlayContainerChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningOverlayContainerParent,lLocatorSearch01InputLevel01LightningOverlayContainerChild01,true)
				if(lElementSearch01InputLevel01LightningOverlayContainerChild01){
					WebElement lElementSearch01InputLevel01LightningOverlayContainerChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild01,lLocatorSearch01InputLevel01LightningOverlayContainerChild02,true)
					if(lElementSearch01InputLevel01LightningOverlayContainerChild02){
						List<WebElement> lListElementSearch01InputLevel01LightningOverlayContainerChild03=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild02,lLocatorSearch01InputLevel01LightningOverlayContainerChild03)
						if(lListElementSearch01InputLevel01LightningOverlayContainerChild03.size()>0){
							for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningOverlayContainerChild03.size()-1;lIndex++){
								WebElement lElementSearch01InputLevel01LightningOverlayContainerChild03=lListElementSearch01InputLevel01LightningOverlayContainerChild03.get(lIndex)
								String lStrElementSearch01InputLevel01LightningOverlayContainerChild03Text=lElementSearch01InputLevel01LightningOverlayContainerChild03.getText()
								if(lStrElementSearch01InputLevel01LightningOverlayContainerChild03Text=='Ok'){
									lElementSearch01InputLevel01LightningOverlayContainerChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild03,lLocatorSearch01InputLevel01LightningOverlayContainerChild04,true)
								}
							}
						}
					}
				}
			}
			if(lElementSearch01InputLevel01LightningOverlayContainerChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild04)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementPolicyHolderAndMainInsured(WebElement elementSearch01InputLevel01TargetFlowDetailParent,IDNEnumSalesforceObjectDriverType enumIDNSalesforceObjectDriverType){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(enumIDNSalesforceObjectDriverType)){
			return lreturn
		}
		IDNEnumSalesforceObjectDriverType lIDNEnumSalesforceObjectDriverType=enumIDNSalesforceObjectDriverType
		try{
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			List<WebElement> lListElementSearch01InputLevel01TargetFlowDetailChild01=null
			String lLocatorSearch01InputLevel01TargetDetailFlowFormChild01='c-ign-policy-holder-and-main-insured-details'
			switch(lIDNEnumSalesforceObjectDriverType){
				case lIDNEnumSalesforceObjectDriverType.SameDriver:
					lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetDetailFlowFormChild01,false)
					break
				default:
					lListElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetDetailFlowFormChild01)
					lElementSearch01InputLevel01TargetFlowDetailChild01=lListElementSearch01InputLevel01TargetFlowDetailChild01.get(0)
					break
			}
			if(lElementSearch01InputLevel01TargetFlowDetailChild01){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementTargetFlowDetailRoot(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strLocatorSearch01InputLevel01TargetFlowDetailChild01){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strLocatorSearch01InputLevel01TargetFlowDetailChild01)){
			return lreturn
		}
		String lLocatorSearch01InputLevel01TargetDetailFlowFormChild01=strLocatorSearch01InputLevel01TargetFlowDetailChild01.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lLocatorSearch01InputLevel01TargetDetailFlowFormChild01)){
			return lreturn
		}
		try{
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetDetailFlowFormChild01,false)
			if(lElementSearch01InputLevel01TargetFlowDetailChild01){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getWebElementTargetDetailFlowFormInputByName(WebElement elementSearch01InputLevel01TargetPolicyDetailParent,String strTargetDetailInputName){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetPolicyDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetPolicyDetailParent=elementSearch01InputLevel01TargetPolicyDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailInputName)){
			return lreturn
		}
		String lStrTargetDetailInputName=strTargetDetailInputName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailInputName)){
			return lreturn
		}
		try{
			WebElement lElementSearch01InputLevel01TargetPolicyDetailByName=null
			IGNUemaHelper.delayThreadSecond(5)
			List<WebElement> lListElementSearch01InputLevel01TargetPolicyDetailParent=IGNUemaHelper.getChildShadowWebElementListAll(this.webDriver,lElementSearch01InputLevel01TargetPolicyDetailParent)
			if(lListElementSearch01InputLevel01TargetPolicyDetailParent.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetPolicyDetailParent.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01TargetPolicyDetailCurrent=lListElementSearch01InputLevel01TargetPolicyDetailParent.get(lIndex)
					String lStrElementSearch01InputLevel01TargetPolicyDetailCurrentName=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01TargetPolicyDetailCurrent,'name')
					if(lStrElementSearch01InputLevel01TargetPolicyDetailCurrentName==lStrTargetDetailInputName){
						lElementSearch01InputLevel01TargetPolicyDetailByName=lElementSearch01InputLevel01TargetPolicyDetailCurrent
					}
				}
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetPolicyDetailByName
			}
			lResult=lreturn
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfMainInsuredDob(WebElement elementSearch01InputLevel01MainInsuredParent,String strMainInsuredName,String strMainInsuredValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01MainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01MainInsuredParent=elementSearch01InputLevel01MainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strMainInsuredName)){
			return lreturn
		}
		String lStrMainInsuredName=strMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strMainInsuredValue)){
			return lreturn
		}
		String lStrMainInsuredValue=strMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainInsuredValue)){
			return lreturn
		}
		try{
			WebElement lElementMainInsuredInput=null
			String lLocatorSearch01InputLevel01MainInsuredChild01='lightning-datepicker'
			String lLocatorSearch01InputLevel01MainInsuredChild02='input'
			WebElement lElementSearch01InputLevel01MainInsuredByNameParent=this.getWebElementTargetDetailFlowFormInputByName(lElementSearch01InputLevel01MainInsuredParent,lStrMainInsuredName)
			if(lElementSearch01InputLevel01MainInsuredByNameParent){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01MainInsuredByNameParent)
				WebElement lElementSearch01InputLevel01MainInsuredChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01MainInsuredByNameParent,lLocatorSearch01InputLevel01MainInsuredChild01,false)
				if(lElementSearch01InputLevel01MainInsuredChild01){
					WebElement lElementSearch01InputLevel01MainInsuredChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01MainInsuredChild01,lLocatorSearch01InputLevel01MainInsuredChild02,false)
					if(lElementSearch01InputLevel01MainInsuredChild02){
						IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01MainInsuredChild02,lStrMainInsuredValue)
						lResult=true
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfMainDriverOption(String strSfMainDriverOptionValue,WebElement elementMainInsuredDetailFlowFormRoot){
		Boolean lreturn=false
		String lStrSfMainDriverReferOptionValue=''
		Boolean lIsInputCarOwnerIsMainInsuredOK=false
		IDNEnumSalesforceObjectDriverType lIDNEnumSalesforceObjectDriverType=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(strSfMainDriverOptionValue)){
			return lreturn
		}
		String lStrSfMainDriverOptionValue=strSfMainDriverOptionValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfMainDriverOptionValue)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementMainInsuredDetailFlowFormRoot)){
			return lreturn
		}
		WebElement lElementMainInsuredDetailFlowFormRoot=elementMainInsuredDetailFlowFormRoot
		try{
			try{
				lIDNEnumSalesforceObjectDriverType=IDNEnumSalesforceObjectDriverType.valueOf(lStrSfMainDriverOptionValue)
			}catch(Exception e){
			}
			lStrSfMainDriverReferOptionValue=lIDNEnumSalesforceObjectDriverType.toRefString()
			Integer lNumSfMainDriverReferOption=IGNUemaHelper.convertStringToInteger(lStrSfMainDriverReferOptionValue,0)
			String lStrInputCarOwnerIsMainInsuredName='quote_flagPolicyHolderMainInsured'
			lIsInputCarOwnerIsMainInsuredOK=false
			switch(lIDNEnumSalesforceObjectDriverType){
				case lIDNEnumSalesforceObjectDriverType.SameDriver:
					lIsInputCarOwnerIsMainInsuredOK=this.inputSfTargetDetailByCheckBox(lElementMainInsuredDetailFlowFormRoot,lStrInputCarOwnerIsMainInsuredName,'Yes')
					break
				default:
					lIsInputCarOwnerIsMainInsuredOK=this.inputSfTargetDetailByCheckBox(lElementMainInsuredDetailFlowFormRoot,lStrInputCarOwnerIsMainInsuredName,'No')
					break
			}
			lResult=lIsInputCarOwnerIsMainInsuredOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyHolderAndMainInsuredByComboBox(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredParent,String strPolicyHolderAndMainInsuredName,String strPolicyHolderAndMainInsuredValue,Boolean boolIsSelectComboboxByValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredValue=strPolicyHolderAndMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		Boolean lIsSelectComboboxByValue=boolIsSelectComboboxByValue
		try{
			WebElement lElementPolicyHolderAndMainInsuredInput=null
			Boolean lIsInputSfPolicyHolderAndMainInsuredComboBoxOK=false
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01='lightning-layout-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02='lightning-input-field'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03='lightning-picklist'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04='lightning-combobox'
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01.get(lIndex)
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02){
							WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03,true)
							if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03){
								WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04,true)
								if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04){
									WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05=this.getElementCheckBoxFromPolicyHolderAndMainInsuredFormList(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04,lStrPolicyHolderAndMainInsuredName)
									if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05){
										if(lIsSelectComboboxByValue){
											lIsInputSfPolicyHolderAndMainInsuredComboBoxOK=this.selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByValue(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05,lStrPolicyHolderAndMainInsuredValue)
										}else{
											lIsInputSfPolicyHolderAndMainInsuredComboBoxOK=this.selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByTitle(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05,lStrPolicyHolderAndMainInsuredValue)
										}
									}
								}
							}
						}
					}
				}
			}
			lResult=lIsInputSfPolicyHolderAndMainInsuredComboBoxOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyHolderAndMainInsuredPageActionNavigation(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredParent,String strPolicyHolderAndMainInsuredButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredButtonName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredButtonName=strPolicyHolderAndMainInsuredButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02='button'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02=null
			if( lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver, lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01.get(lIndex)
						lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02){
							String lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02NameValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02,'title')
							if(lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02NameValue==lStrPolicyHolderAndMainInsuredButtonName){
								Boolean lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02ClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02)
								lreturn=lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02ClickOK
								return lreturn
							}
						}
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyHolderAndMainInsuredDob(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,String strPolicyHolderAndMainInsuredName,String strPolicyHolderAndMainInsuredValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredValue=strPolicyHolderAndMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		Boolean lIsInputSfPolicyHolderAndMainInsuredValueOK=false
		try{
			WebElement lElementPolicyHolderAndMainInsuredInput=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01='lightning-layout-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02='lightning-input-field'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03='lightning-input'
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.get(lIndex)
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02){
							WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,true)
							if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03){
								WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04=this.getElementSfPolicyHolderAndMainInsuredDobByName(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,lStrPolicyHolderAndMainInsuredName)
								if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04){
									lIsInputSfPolicyHolderAndMainInsuredValueOK=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04,lStrPolicyHolderAndMainInsuredValue)
									lreturn=lIsInputSfPolicyHolderAndMainInsuredValueOK
									return lreturn
								}
							}
						}
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementSfPolicyHolderAndMainInsuredDobByName(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent,String strMainInsuredName){
		WebElement  lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent
		if(IGNUemaHelper.checkObjectNullOfObject(strMainInsuredName)){
			return lreturn
		}
		String lStrMainInsuredName=strMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainInsuredName)){
			return lreturn
		}
		try{
			WebElement lElementMainInsuredInput=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01='lightning-datepicker'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02='input'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02=null
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01,false)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01){
					lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02,false)
					if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02){
						String lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02NameValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02,'Name')
						if(lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02NameValue==lStrMainInsuredName){
							lResult=true
						}
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyHolderAndMainInsuredByValue(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,String strPolicyHolderAndMainInsuredName,String strPolicyHolderAndMainInsuredValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredValue=strPolicyHolderAndMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		Boolean lIsInputSfPolicyHolderAndMainInsuredValueOK=false
		try{
			WebElement lElementPolicyHolderAndMainInsuredInput=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01='lightning-layout-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02='lightning-input-field'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03='lightning-input'
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.get(lIndex)
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02){
							WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,true)
							if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03){
								WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04=this.getElementSfPolicyHolderAndMainInsuredByName(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,lStrPolicyHolderAndMainInsuredName)
								if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04){
									lIsInputSfPolicyHolderAndMainInsuredValueOK=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04,lStrPolicyHolderAndMainInsuredValue)
								}
							}
						}
					}
				}
			}
			lResult= lIsInputSfPolicyHolderAndMainInsuredValueOK
			if(lResult){
				lreturn=lResult
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfTargetDetailByComboBox(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetFlowDetailName,String strTargetFlowDetailValue,Boolean boolIsSelectComboboxByValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailName)){
			return lreturn
		}
		String lStrTargetFlowDetailName=strTargetFlowDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailValue)){
			return lreturn
		}
		String lStrTargetFlowDetailValue=strTargetFlowDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailValue)){
			return lreturn
		}
		Boolean lIsSelectComboboxByValue=boolIsSelectComboboxByValue
		try{
			WebElement lElementTargetDetailInput=null
			Boolean lIsInputSfTargetFlowDetailMainComboxOK=false
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementTargetDetailFlowFormInputByName(lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetFlowDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent)
				if(lIsSelectComboboxByValue){
					lIsInputSfTargetFlowDetailMainComboxOK=this.selectTargetDetailFormMotorComboboxItemByValue(lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetFlowDetailValue)
				}else{
					lIsInputSfTargetFlowDetailMainComboxOK=this.selectTargetDetailFormMotorComboboxItemByTitle(lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetFlowDetailValue)
				}

				lResult=lIsInputSfTargetFlowDetailMainComboxOK
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementSfPolicyHolderAndMainInsuredByName(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strPolicyHolderAndMainInsuredName){
		WebElement lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01TargetFlowDetailChild02='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild02=null
			if(lElementSearch01InputLevel01TargetFlowDetailParent){
				WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetFlowDetailChild01,true)
				if(lElementSearch01InputLevel01TargetFlowDetailChild01){
					lElementSearch01InputLevel01TargetFlowDetailChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailChild01,lLocatorSearch01InputLevel01TargetFlowDetailChild02,true)
				}
			}
			if(lElementSearch01InputLevel01TargetFlowDetailChild02){
				String lStrElementSearch01InputLevel01TargetFlowDetailChild02NameValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailChild02,'Name')
				if(lStrElementSearch01InputLevel01TargetFlowDetailChild02NameValue==lStrPolicyHolderAndMainInsuredName){
					lResult=true
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild02
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfTargetDetailByValue(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01TargetFlowDetailChild02='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild02=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementTargetDetailFlowFormInputByName(lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lLocatorSearch01InputLevel01TargetFlowDetailChild01,true)
				if(lElementSearch01InputLevel01TargetFlowDetailChild01){
					lElementSearch01InputLevel01TargetFlowDetailChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailChild01,lLocatorSearch01InputLevel01TargetFlowDetailChild02,true)
				}
			}
			if(lElementSearch01InputLevel01TargetFlowDetailChild02){
				IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailChild02,lStrTargetDetailValue)
				lResult=true
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfPolicyDetailInformationByValue(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementTargetDetailFlowFormInputByName(lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				lResult=true
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfTargetDetailByRadioButtonByLabel(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		try{
			WebElement lElementTargetDetailInput=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementTargetDetailFlowFormInputByName(lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent)
				WebElement lElementSearch01InputLevel01TargetFlowDetailByLabel=this.getElementTargetRadioButtonByLabel(lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				if(lElementSearch01InputLevel01TargetFlowDetailByLabel){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailByLabel)
					lResult=true
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfTargetDetailByRadioButton(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue,Boolean booIsSearchByInput){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		Boolean lIsSearchByInput=booIsSearchByInput
		try{
			WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButton=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementTargetDetailFlowFormInputByName(lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent)
				if(lIsSearchByInput){
					lElementSearch01InputLevel01TargetFlowDetailRadioButton=this.getElementTargetRadioButtonByValue(lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				}else{
					lElementSearch01InputLevel01TargetFlowDetailRadioButton=this.getElementTargetRadioButtonByLabel(lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				}
				if(lElementSearch01InputLevel01TargetFlowDetailRadioButton){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailRadioButton)
					lResult=true
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementTargetRadioButtonByValue(WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strRadioValue){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strRadioValue)){
			return lreturn
		}
		String lStrRadioValue=strRadioValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrRadioValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			List<WebElement> lListElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetFlowDetailChild01)
			if(lListElementSearch01InputLevel01TargetFlowDetailChild01.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetFlowDetailChild01.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01TargetFlowDetailCurrentChild01=lListElementSearch01InputLevel01TargetFlowDetailChild01.get(lIndex)
					String lStrSearch01InputLevel01TargetFlowDetailChild01Value=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailCurrentChild01,'value')
					if(lStrSearch01InputLevel01TargetFlowDetailChild01Value==lStrRadioValue){
						lElementSearch01InputLevel01TargetFlowDetailChild01=lElementSearch01InputLevel01TargetFlowDetailCurrentChild01
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementTargetRadioButtonByLabel(WebElement elementSearch01InputLevel01TargetFlowDetailRadioButtonParent,String strRadioValue){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailRadioButtonParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButtonParent=elementSearch01InputLevel01TargetFlowDetailRadioButtonParent
		if(IGNUemaHelper.checkObjectNullOfObject(strRadioValue)){
			return lreturn
		}
		String lStrRadioValue=strRadioValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrRadioValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01='input'
			String lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01='label'
			WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01=null
			List<WebElement> lListSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailRadioButtonParent,lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01)
			List<WebElement> lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01TargetFlowDetailRadioButtonParent,lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01)
			if(lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.size()>0){
				for(Integer lIndex=0;lIndex<=lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01=lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.get(lIndex)
					String lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value=lElementSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.getText()
					lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value=lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value.toLowerCase()
					lStrRadioValue=lStrRadioValue.toLowerCase()
					if(lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value==lStrRadioValue){
						lElementSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01=lListSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01.get(lIndex)
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean selectTargetDetailFormMotorComboboxItemByValue(WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='lightning-base-combobox-item'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild04)
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
					String lStrSearch01InputLevel01QuotationFlowFormChild04Value=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,'data-value')
					lStrSearch01InputLevel01QuotationFlowFormChild04Value=lStrSearch01InputLevel01QuotationFlowFormChild04Value.toLowerCase()
					lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
					if((lStrSearch01InputLevel01QuotationFlowFormChild04Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01QuotationFlowFormChild04Value, lStrSfQuoteMotorComboboxItem))){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
						lResult=true
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
	public Boolean selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByTitle(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02='lightning-base-combobox.slds-combobox_container'
			List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.size()-1;lIndex++){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.get(lIndex)
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02){
					String lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02,'title')
					lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value.toLowerCase()
					lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
					if((lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value,lStrSfQuoteMotorComboboxItem))){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02)
						lResult=true
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
	public Boolean selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByValue(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02='span.slds-truncate'
			List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.size()-1;lIndex++){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.get(lIndex)
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02){
					String lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01,'data-value')
					lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value.toLowerCase()
					lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
					if((lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value,lStrSfQuoteMotorComboboxItem))){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02)
						lResult=true
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
	public WebElement getElementCheckBoxFromPolicyHolderAndMainInsuredFormList(WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent,String strPolicyHolderAndMainInsuredComboBoxName){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredComboBoxName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredComboBoxName=strPolicyHolderAndMainInsuredComboBoxName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredComboBoxName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03='button'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild04='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild05='span.slds-truncate'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02=null
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01){
					lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03){
					String lStrSearch01InputLevel01PolicyHolderAndMainInsuredChild03Value=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03,'Name')
					if(lStrSearch01InputLevel01PolicyHolderAndMainInsuredChild03Value==lStrPolicyHolderAndMainInsuredComboBoxName){
						IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03)
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03)
						IGNUemaHelper.delayThreadSecond(3)
						lIsComboboxItemDropDownClickOK=true
					}
				}
			}
			lResult=lIsComboboxItemDropDownClickOK
			if(lResult){
				lreturn=lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean selectTargetDetailFormMotorComboboxItemByTitle(WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild05='span.slds-truncate'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild04)
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,lLocatorSearch01InputLevel01QuotationFlowFormChild05,true)
					if(lElementSearch01InputLevel01QuotationFlowFormChild05){
						String lStrSearch01InputLevel01QuotationFlowFormChild05Value=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild05,'title')
						lStrSearch01InputLevel01QuotationFlowFormChild05Value=lStrSearch01InputLevel01QuotationFlowFormChild05Value.toLowerCase()
						lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
						if((lStrSearch01InputLevel01QuotationFlowFormChild05Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01QuotationFlowFormChild05Value, lStrSfQuoteMotorComboboxItem))){
							IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
							lResult=true
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
	public Boolean inputSfTargetDetailByCheckBox(WebElement elementTargetDetailFlowParent,String strTargetDetailCheckBoxName,String strTargetDetailCheckBoxValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementTargetDetailFlowParent)){
			return lreturn
		}
		WebElement lElementTargetDetailFlowParent=elementTargetDetailFlowParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxName)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxName=strTargetDetailCheckBoxName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxValue)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxValue=strTargetDetailCheckBoxValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxValue)){
			return lreturn
		}
		try{
			WebElement lElementTargetDetailFlowByName=this.getWebElementTargetDetailFlowFormInputByName(lElementTargetDetailFlowParent,lStrTargetDetailCheckBoxName)
			if(lElementTargetDetailFlowByName){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementTargetDetailFlowByName)
				Boolean lIsTargetDetailCheckBoxValueOK=IGNUemaHelper.convertStringToBoolean(lStrTargetDetailCheckBoxValue)
				String lStrCheckBoxValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementTargetDetailFlowByName,'value')
				Boolean lIsStrCheckBoxValueOK=IGNUemaHelper.convertStringToBoolean(lStrCheckBoxValue)
				if(lIsTargetDetailCheckBoxValueOK){
					if(!lIsStrCheckBoxValueOK){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementTargetDetailFlowByName)
					}
					lResult=true
				}else{
					if(lIsStrCheckBoxValueOK){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementTargetDetailFlowByName)
					}
					lResult=true
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfTargetPlanDetailByCheckBox(WebElement elementTargetDetailFlowParent,String strTargetDetailCheckBoxName,String strTargetDetailCheckBoxValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementTargetDetailFlowParent)){
			return lreturn
		}
		WebElement lElementTargetDetailFlowParent=elementTargetDetailFlowParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxName)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxName=strTargetDetailCheckBoxName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxValue)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxValue=strTargetDetailCheckBoxValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxValue)){
			return lreturn
		}
		try{
			WebElement lElementSearch01InputLevel01LightningInputParent=this.getWebElementTargetDetailFlowFormInputByName(lElementTargetDetailFlowParent,lStrTargetDetailCheckBoxName)
			if(lElementSearch01InputLevel01LightningInputParent){
				IGNUemaHelper.webJsScrollToElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent)
				Boolean lIsTargetDetailCheckBoxValueOK=IGNUemaHelper.convertStringToBoolean(lStrTargetDetailCheckBoxValue)
				if(lIsTargetDetailCheckBoxValueOK){
					WebElement lElementSearch01InputLevel01LightningInputChild01=this.getElementSfPlanDetailTargetCheckBox(lElementSearch01InputLevel01LightningInputParent)
					if(lElementSearch01InputLevel01LightningInputChild01){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningInputChild01)
						lResult=true
					}
				}else{
					lResult=true
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementSfPlanDetailTargetCheckBox(WebElement elementSearch01InputLevel01LightningInputParent){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-primitive-input-checkbox'
			String lLocatorSearch01InputLevel01LightningInputChild02='input'
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01LightningInputChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public List<WebElement> getListElementAccessoryDetailFlowFormRoot(WebElement elementSearch01InputLevel01AccessoryDetailParent){
		List<WebElement> lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01AccessoryDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01AccessoryDetailParent=elementSearch01InputLevel01AccessoryDetailParent
		try{
			String lLocatorSearch01InputLevel01AccessoryDetailChild01='table'
			String lLocatorSearch01InputLevel01AccessoryDetailChild02='tbody'
			String lLocatorSearch01InputLevel01AccessoryDetailChild03='tr'
			List<WebElement> lListSearch01InputLevel01AccessoryDetailChild03=null
			WebElement lElementSearch01InputLevel01AccessoryDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01AccessoryDetailParent,lLocatorSearch01InputLevel01AccessoryDetailChild01,true)
			if(lElementSearch01InputLevel01AccessoryDetailChild01){
				WebElement lElementSearch01InputLevel01AccessoryDetailChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01AccessoryDetailChild01,lLocatorSearch01InputLevel01AccessoryDetailChild02,true)
				if(lElementSearch01InputLevel01AccessoryDetailChild02){
					lListSearch01InputLevel01AccessoryDetailChild03=IGNUemaHelper.getChildWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01AccessoryDetailChild02,lLocatorSearch01InputLevel01AccessoryDetailChild03)
				}
			}
			lResult=lListSearch01InputLevel01AccessoryDetailChild03.size()>0
			if(lResult){
				lreturn=lListSearch01InputLevel01AccessoryDetailChild03
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputAccessoryDetailTable(WebElement elementSearch01InputLevel01AccessoryDetailParent,List<WebElement> listElementSearch01InputLevel01AccessoryDetailLightningDataTable,Map mapCarAccessoryInput){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01AccessoryDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01AccessoryDetailParent=elementSearch01InputLevel01AccessoryDetailParent
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementSearch01InputLevel01AccessoryDetailLightningDataTable)){
			return lreturn
		}
		List<WebElement> lListElementSearch01InputLevel01AccessoryDetailLightningDataTable=listElementSearch01InputLevel01AccessoryDetailLightningDataTable
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCarAccessoryInput)){
			return lreturn
		}
		Map lMapCarAccessoryInput=mapCarAccessoryInput
		try{
			String lLocatorSearch01InputLevel01AccessoryDetailLightningDataTableChild01='td'
			String lLocatorSearch01InputLevel01AccessoryDetailLightningDataTableChild02='lightning-combobox.slds-form-element'
			for(Map.Entry lEntry : lMapCarAccessoryInput.entrySet()){
				String lStrCarAccessoryName=lEntry.getKey()
				String lStrCarAccessoryValue=lEntry.getValue()
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01AccessoryDetailLightningDataTable.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01AccessoryDetailLightningDataTable=lListElementSearch01InputLevel01AccessoryDetailLightningDataTable.get(lIndex)
					WebElement lElementSearch01InputLevel01AccessoryDetailLightningDataTableAccessoryName=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01AccessoryDetailLightningDataTable,lLocatorSearch01InputLevel01AccessoryDetailLightningDataTableChild01,true)
					String lStrElementAccessoryNameText=lElementSearch01InputLevel01AccessoryDetailLightningDataTableAccessoryName.getText()
					if(lStrElementAccessoryNameText==lStrCarAccessoryName){
						WebElement lElementSearch01InputLevel01AccessoryDetailLightningDataTableChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01AccessoryDetailLightningDataTable,lLocatorSearch01InputLevel01AccessoryDetailLightningDataTableChild02,true)
						if(lElementSearch01InputLevel01AccessoryDetailLightningDataTableChild02){
							Boolean lIsInputCarAccessoryValueOK=this.selectTargetDetailFormMotorComboboxItemByValue(lElementSearch01InputLevel01AccessoryDetailLightningDataTableChild02,lStrCarAccessoryValue)
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
	public Map getMapCarAccessoryItemFromCaseInput(Map mapCaseDataInput,String strCarAccessoryParameterName){
		Map lreturn=[:]
		Map lMapCarAccessoryInput=[:]
		Boolean lResult=false
		try{
			lreturn.put('MapCarAccessoryInput',lMapCarAccessoryInput)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataInput)){
				return lreturn
			}
			Map lMapCaseDataInput=mapCaseDataInput
			if(IGNUemaHelper.checkObjectEmptyOfString(strCarAccessoryParameterName)){
				return lreturn
			}
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperTHA.getIGNTestManagerInstance()
			String lStrCarAccessoryParameterName=strCarAccessoryParameterName
			String lCarAccessoryName=''
			String lCarAccessoryValue=''
			for(Map.Entry lEntry : lMapCaseDataInput.entrySet()){
				String lKey=lEntry.getKey()
				String lValue=lEntry.getValue()
				if(lKey.contains(lStrCarAccessoryParameterName)){
					if(lKey.contains('Name')){
						IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lKey)
						lCarAccessoryName=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lValue)
					}else{
						lCarAccessoryValue=lValue
						if(!IGNUemaHelper.checkObjectEmptyOfString(lCarAccessoryValue)){
							lMapCarAccessoryInput.put(lCarAccessoryName,lCarAccessoryValue)
						}
					}
				}
			}
			if(!IGNUemaHelper.checkObjectEmptyOfMap(lMapCarAccessoryInput)){
				lResult=true
			}
			if(lResult){
				lreturn.put('MapCarAccessoryInput',lMapCarAccessoryInput)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfQuotePolicyStartDate(String strQuoteOptionalPolicyStartOffsetDay){
		Map lreturn=[:]
		String lQuoteOptionalPolicyStartDate=''
		try{
			Boolean lResult=false
			lreturn.put('StrQuotePolicyStartDate',lQuoteOptionalPolicyStartDate)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strQuoteOptionalPolicyStartOffsetDay)){
				return lreturn
			}
			String lQuoteOptionalPolicyStartDateOffsetDay=strQuoteOptionalPolicyStartOffsetDay
			if(IGNUemaHelper.checkObjectEmptyOfString(lQuoteOptionalPolicyStartDateOffsetDay)){
				lQuoteOptionalPolicyStartDateOffsetDay='0'
			}
			String lFormatDate='dd/MM/yyyy'
			lQuoteOptionalPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
			Integer lQuoteOptionalPolicyStartDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteOptionalPolicyStartDateOffsetDay,0)
			lQuoteOptionalPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteOptionalPolicyStartDate,lQuoteOptionalPolicyStartDateOffsetDayNum)
			lResult=(lQuoteOptionalPolicyStartDate.length()>0)
			if(lResult){
				lreturn.put('StrQuotePolicyStartDate',lQuoteOptionalPolicyStartDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}
