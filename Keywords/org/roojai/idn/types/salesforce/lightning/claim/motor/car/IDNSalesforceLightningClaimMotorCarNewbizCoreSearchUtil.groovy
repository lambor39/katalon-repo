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
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.core.IDNGlobalConst
import org.roojai.idn.types.salesforce.lightning.core.*
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperCommon
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectTypeName
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate
public class IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil{
	private static Map<String,String> mapStrInputInitSfSearchByDetailObjAccountInput=[:]
	private static Map<String,String> mapStrInputSalesforceAccountPersonalFieldList=[:]
	private static Map<String,String> mapStrInputSalesforceAccountBusinessFieldList=[:]
	private static Map<String,String> mapStrSalesforceClaimMotorNewBizDoManageSearchMainUtilOutput=[:]
	private static String strDefaultSalesforceEndPointUrl=''
	private static WebDriver webDriver
	public static Map inputSearchBySfObject(WebDriver webDriver,Map mapCaseDataInput,Map mapCaseDataOutput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordID=''
		if(!webDriver){
			return lreturn
		}
		this.webDriver=webDriver
		this.strDefaultSalesforceEndPointUrl=IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_URL_UAT
		try{
			lreturn.put('StrSalesforceRecordId','')
			lreturn.put('StrSalesforceSearchByDefaultObjectValue','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataOutput)){
				return lreturn
			}
			Map lMapCaseDataCurrentInput=mapCaseDataInput
			Map lMapCaseDataCurrentOutput=mapCaseDataOutput
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrSfSwitchProfileToDo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchProfileToDo
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Switch_Profile_To_Do')
			String lStrSfSwitchProfileToDoValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSwitchProfileToDo)
			String lStrSfSwitchProfileAccountName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchProfileAccountName
			String lStrSfSwitchToMode=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchToMode
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Switch_To_Mode')
			String lStrStrSfSwitchToModeValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfSwitchToMode)
			String lStrSfSwitchAppLauncherToDo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchAppLauncherToDo
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Switch_App_Launcher_To_Do')
			String lStrSfSwitchAppLauncherToDoValue=lIGNTestMasterFieldTypeSingle03.getMasterPairValueByKey(lStrSfSwitchAppLauncherToDo)
			String lStrSfSwitchAppLauncherName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchAppLauncherName
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle04=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Switch_App_Launcher_Name')
			String lStrSfSwitchAppLauncherNameValue=lIGNTestMasterFieldTypeSingle04.getMasterPairValueByKey(lStrSfSwitchAppLauncherName)
			String lStrSfSearchByDefaultSalesforceRecordId=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDefaultSalesforceRecordId
			String lStrSfSearchByDefaultObject=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDefaultObject
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle05=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Default_Object')
			String lStrSfSearchByDefaultObjectValue=lIGNTestMasterFieldTypeSingle05.getMasterPairValueByKey(lStrSfSearchByDefaultObject)
			String lStrSfSearchByDetailContinueStep=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailContinueStep
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle06=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Continue_Step')
			String lStrSfSearchByDetailContinueStepValue=lIGNTestMasterFieldTypeSingle06.getMasterPairValueByKey(lStrSfSearchByDetailContinueStep)
			String lStrSfSearchByDetailExpectedAccountType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailExpectedAccountType
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle07=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Expected_Account_Type')
			String lStrSfSearchByDetailExpectedAccountTypeValue=lIGNTestMasterFieldTypeSingle07.getMasterPairValueByKey(lStrSfSearchByDetailExpectedAccountType)
			String lStrSfSearchByDetailSelectionOnMultipleRecord=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailSelectionOnMultipleRecord
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle08=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Selection_On_Multiple_Record')
			String lStrSfSearchByDetailSelectionOnMultipleRecordValue=lIGNTestMasterFieldTypeSingle08.getMasterPairValueByKey(lStrSfSearchByDetailSelectionOnMultipleRecord)
			String lStrSfSearchByDetailObjAccountResidentialStatus=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountResidentialStatus
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle09=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Obj_Account_Residential_Status')
			String lStrSfSearchByDetailObjAccountResidentialStatusValue=lIGNTestMasterFieldTypeSingle09.getMasterPairValueByKey(lStrSfSearchByDetailSelectionOnMultipleRecord)
			String lStrSfSearchByDetailObjAccountDefaultOption=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountDefaultOption
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle10=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Obj_Account_Default_Option')
			String lStrSfSearchByDetailObjAccountDefaultOptionValue=lIGNTestMasterFieldTypeSingle10.getMasterPairValueByKey(lStrSfSearchByDetailSelectionOnMultipleRecord)
			String lStrSfSearchByDetailObjAccountIdentificationNumber=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountIdentificationNumber
			String lStrSfSearchByDetailObjAccountFirstNameText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountFirstNameText
			String lStrSfSearchByDetailObjAccountLastNameText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountLastNameText
			String lStrSfSearchByDetailObjAccountEmailText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountEmailText
			String lStrSfSearchByDetailObjAccountMobileText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountMobileText
			String lStrSfSearchByDetailObjAccountPhoneText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountPhoneText
			String lStrSfSearchByDetailObjAccountCompanyNameText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountCompanyNameText
			String lStrSfSearchByDetailObjAccountCompanyNumberText=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountCompanyNumberText
			String lStrPositiveCase=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldPositiveCase
			String lStrActualResult=''
			String lStrResultMessage=''
			String lStrSalesforceSearchBySfObject01=''
			String lStrSalesforceSearchBySfObject02=''
			String lStrSalesforceSearchBySfObject03=''
			String lStrSalesforceSearchGenerateTargetSalesforceFullId=''
			String lStrSalesforceSearchGenerateUrlAccessSfObject=''
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldPositiveCase=lStrPositiveCase
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lStrPositiveCase)
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchProfileToDo=lStrSfSwitchProfileToDoValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchToMode=lStrStrSfSwitchToModeValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchAppLauncherToDo=lStrSfSwitchAppLauncherToDoValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchAppLauncherName=lStrSfSwitchAppLauncherNameValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDefaultObject=lStrSfSearchByDefaultObjectValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailContinueStep=lStrSfSearchByDetailContinueStepValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailExpectedAccountType=lStrSfSearchByDetailExpectedAccountTypeValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailSelectionOnMultipleRecord=lStrSfSearchByDetailSelectionOnMultipleRecordValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountResidentialStatus=lStrSfSearchByDetailObjAccountResidentialStatusValue
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailObjAccountDefaultOption=lStrSfSearchByDetailObjAccountDefaultOptionValue
			this.inputInitSfSearchByDetailObjAccountInput(mapStrInputInitSfSearchByDetailObjAccountInput)
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailExpectedAccountType=lStrSfSearchByDetailExpectedAccountTypeValue
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailSelectionOnMultipleRecord=lStrSfSearchByDetailSelectionOnMultipleRecordValue
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountResidentialStatus=lStrSfSearchByDetailObjAccountResidentialStatusValue
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountDefaultOption=lStrSfSearchByDetailObjAccountDefaultOptionValue
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountIdentificationNumber=lStrSfSearchByDetailObjAccountIdentificationNumber
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountFirstNameText=lStrSfSearchByDetailObjAccountFirstNameText
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountLastNameText=lStrSfSearchByDetailObjAccountLastNameText
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountEmailText=lStrSfSearchByDetailObjAccountEmailText
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountMobileText=lStrSfSearchByDetailObjAccountMobileText
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountPhoneText=lStrSfSearchByDetailObjAccountPhoneText
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountCompanyNameText=lStrSfSearchByDetailObjAccountCompanyNameText
			mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountCompanyNumberText=lStrSfSearchByDetailObjAccountCompanyNumberText
			if(!IGNUemaHelper.checkObjectEmptyOfMap(mapStrInputInitSfSearchByDetailObjAccountInput)){
				this.inputSalesforceAccountPersonalFieldList(mapStrInputInitSfSearchByDetailObjAccountInput,mapStrInputSalesforceAccountPersonalFieldList)
				this.inputSalesforceAccountBusinessFieldList(mapStrInputInitSfSearchByDetailObjAccountInput,mapStrInputSalesforceAccountBusinessFieldList)
			}
			Boolean lIsInputMapSalesforceRecordIdPageResult=false
			Boolean lIsInputMapSalesforceSearchDetailByDefaultOptionResult=false
			Boolean lIsSalesforceSearchByDetailContinueStepResult=false
			Boolean lIsSfModeLightningOK=IDNSalesforceLightningCoreHelperUI.checkTargetSalesforceModeIsLightning(lStrStrSfSwitchToModeValue)
			lIsInputMapSalesforceRecordIdPageResult=IDNSalesforceLightningCoreHelperUI.inputSalesforceDefaultRecordIdPage(this.webDriver,lStrSfSearchByDefaultSalesforceRecordId,lStrSfSearchByDefaultObjectValue,lIsSfModeLightningOK)
			lIsInputMapSalesforceSearchDetailByDefaultOptionResult=lIsInputMapSalesforceRecordIdPageResult
			lIsSalesforceSearchByDetailContinueStepResult=IGNUemaHelper.convertStringToBoolean(lStrSfSearchByDetailContinueStepValue)
			if(lIsInputMapSalesforceRecordIdPageResult){
				Map lMapGetSalesforceTargetFullUrlRecordId=this.getMapSalesforceTargetFullUrlRecordId()
				if(!lMapGetSalesforceTargetFullUrlRecordId.Result){
					lStrSalesforceSearchGenerateTargetSalesforceFullId=''
					lStrSalesforceSearchGenerateUrlAccessSfObject=''
				}else{
					lStrSalesforceSearchGenerateTargetSalesforceFullId=lMapGetSalesforceTargetFullUrlRecordId.StrSalesforceTargetRecordId
					lStrSalesforceSearchGenerateUrlAccessSfObject=lMapGetSalesforceTargetFullUrlRecordId.StrSalesforceTargetFullUrlRecordId
				}
			}
			if(lIsInputMapSalesforceRecordIdPageResult){
				switch(lStrSfSearchByDefaultObjectValue){
					case 'Account':
						lIsSalesforceSearchByDetailContinueStepResult=false
						break
					case 'Contract':
						lIsSalesforceSearchByDetailContinueStepResult=false
						break
				}
			}else{
				lStrSfSearchByDefaultObjectValue=IDNSalesforceLightningCoreType.SALESFORCE_ACTION_SEARCH_DEFAULT_BY_OBJECT
			}
			if(lIsSalesforceSearchByDetailContinueStepResult){
				Map lMapinputMapSalesforceSearchDetailByDefaultOption=this.inputMapSalesforceSearchDetailByDefaultOption(lIsSfModeLightningOK,lStrSfSearchByDefaultObjectValue,lStrSalesforceSearchGenerateTargetSalesforceFullId)
				if(!lMapinputMapSalesforceSearchDetailByDefaultOption.Result){
					lStrSalesforceSearchGenerateTargetSalesforceFullId=''
					lStrSalesforceSearchGenerateUrlAccessSfObject=''
				}else{
					lStrSalesforceSearchGenerateTargetSalesforceFullId=lMapinputMapSalesforceSearchDetailByDefaultOption.StrSalesforceTargetRecordId
					lStrSalesforceSearchGenerateUrlAccessSfObject=lMapinputMapSalesforceSearchDetailByDefaultOption.StrSalesforceTargetFullUrlRecordId
				}
				lIsInputMapSalesforceSearchDetailByDefaultOptionResult=lMapinputMapSalesforceSearchDetailByDefaultOption.Result
				lIsInputMapSalesforceRecordIdPageResult=lIsInputMapSalesforceSearchDetailByDefaultOptionResult
			}
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchGenerateTargetSalesforceFullId=lStrSalesforceSearchGenerateTargetSalesforceFullId
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchGenerateUrlAccessSfObject=lStrSalesforceSearchGenerateUrlAccessSfObject
			Map lMapActualResult=this.inputMapActualResult(lIsPositiveCase,lIsInputMapSalesforceRecordIdPageResult,lIsInputMapSalesforceSearchDetailByDefaultOptionResult)
			if(!lMapActualResult.Result){
				lStrActualResult=''
			}else{
				lStrActualResult=lMapActualResult.ActualResult
			}
			Map lMapResultMessageResult=this.inputMapResultMessage(lStrActualResult)
			if(lMapResultMessageResult.Result){
				lStrResultMessage=lMapResultMessageResult.ResultMessage
			}
			mapStrSalesforceClaimMotorNewBizDoManageSearchMainUtilOutput.ActualResult=lStrActualResult
			mapStrSalesforceClaimMotorNewBizDoManageSearchMainUtilOutput.ResultMessage=lStrResultMessage
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldActualResult=mapStrSalesforceClaimMotorNewBizDoManageSearchMainUtilOutput.ActualResult
			lMapCaseDataCurrentOutput.GroupSfLightningShareClaimMotorStage02DoManageFieldResultMessage=mapStrSalesforceClaimMotorNewBizDoManageSearchMainUtilOutput.ResultMessage
			lStrSalesforceRecordID=lStrSalesforceSearchGenerateTargetSalesforceFullId
			lResult=lStrSalesforceRecordID.length()>0
			if(lResult){
				Boolean lIsNavigateSfTargetObjectPageByDirectAccessOK=IDNSalesforceLightningCoreHelperUI.navigateSfTargetObjectByDirectAccess(webDriver,lStrSalesforceRecordID,lStrSfSearchByDefaultObjectValue,lIsSfModeLightningOK)
				IGNUemaHelper.delayThreadSecond(5)
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
				lreturn.put('StrSalesforceSearchByDefaultObjectValue',lStrSfSearchByDefaultObjectValue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map getMapSalesforceTargetFullUrlRecordId(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			String lStrSalesforceTargetRecordId=''
			String lStrSalesforceTargetFullUrlRecordId=''
			lreturn.put('StrSalesforceTargetRecordId','')
			lreturn.put('StrSalesforceTargetFullUrlRecordId','')
			lreturn.put('Result',lResult)
			List<String> lListStrSalesforceParameterUrl=[]
			lStrSalesforceTargetFullUrlRecordId=this.webDriver.getCurrentUrl()
			lListStrSalesforceParameterUrl=lStrSalesforceTargetFullUrlRecordId.split('/')
			lStrSalesforceTargetRecordId=lListStrSalesforceParameterUrl.get(6)
			lResult=lStrSalesforceTargetRecordId.length()>1
			if(lResult){
				lreturn.put('StrSalesforceTargetRecordId',lStrSalesforceTargetRecordId)
				lreturn.put('StrSalesforceTargetFullUrlRecordId',lStrSalesforceTargetFullUrlRecordId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputMapSalesforceSearchDetailByDefaultOption(Boolean isSfModeLightningOK,String strSfSearchByDefaultObject,String strSalesforceSearchGenerateTargetSalesforceFullId){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			String lStrSalesforceTargetRecordId=''
			String lStrSalesforceTargetFullUrlRecordId=''
			lreturn.put('StrSalesforceTargetRecordId','')
			lreturn.put('StrSalesforceTargetFullUrlRecordId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfString(strSfSearchByDefaultObject)){
				return lreturn
			}
			String lStrSalesforceSearchByDefaultObject=strSfSearchByDefaultObject.trim()
			String lStrSalesforceSearchGenerateTargetSalesforceFullId=strSalesforceSearchGenerateTargetSalesforceFullId.trim()
			switch(lStrSalesforceSearchByDefaultObject){
				case 'Account':
					Map lMapSalesforceSearchByAccount=this.inputMapSalesforceSearchByAccount(isSfModeLightningOK,lStrSalesforceSearchByDefaultObject)
					if(!lMapSalesforceSearchByAccount.Result){
						lStrSalesforceTargetRecordId=''
						lStrSalesforceTargetFullUrlRecordId=''
					}else{
						lStrSalesforceTargetRecordId=lMapSalesforceSearchByAccount.StrSalesforceTargetFullId
						lStrSalesforceTargetFullUrlRecordId=lMapSalesforceSearchByAccount.StrSalesforceTargetFullAccessPageUrl
						lResult=true
					}
					break
				case 'Opportunity':
					if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceSearchGenerateTargetSalesforceFullId)){
						Map lMapSalesforceSearchByOpportunity=this.inputMapSalesforceSearchByOpportunity(lStrSalesforceSearchByDefaultObject,lStrSalesforceSearchGenerateTargetSalesforceFullId)
						if(!lMapSalesforceSearchByOpportunity.Result){
							lStrSalesforceTargetRecordId=''
							lStrSalesforceTargetFullUrlRecordId=''
						}else{
							lStrSalesforceTargetRecordId=lMapSalesforceSearchByOpportunity.StrSalesforceTargetFullId
							lStrSalesforceTargetFullUrlRecordId=lMapSalesforceSearchByOpportunity.StrSalesforceTargetFullAccessPageUrl
							lResult=true
						}
					}
					break
				case 'Claim':
					break
			}
			if(lResult){
				lreturn.put('StrSalesforceTargetRecordId',lStrSalesforceTargetRecordId)
				lreturn.put('StrSalesforceTargetFullUrlRecordId',lStrSalesforceTargetFullUrlRecordId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputMapSalesforceSearchByAccount(Boolean isSfModeLightningOK,String strSfSearchByDefaultObject){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('StrSalesforceTargetFullId','')
			lreturn.put('StrSalesforceTargetFullAccessPageUrl','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfString(strSfSearchByDefaultObject)){
				return lreturn
			}
			String lStrSfSearchByDefaultObject=strSfSearchByDefaultObject.trim()
			String lStrSfSearchByDetailExpectedAccountType=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailExpectedAccountType
			String lStrSfSearchByDetailSelectionOnMultipleRecord=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailSelectionOnMultipleRecord
			String lStrSfSearchByDetailObjAccountResidentialStatus=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountResidentialStatus
			String lStrSfSearchByDetailObjAccountDefaultOption=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountDefaultOption
			String lStrSfSearchByDetailObjAccountIdentificationNumber=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountIdentificationNumber
			String lStrSfSearchByDetailObjAccountFirstNameText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountFirstNameText
			String lStrSfSearchByDetailObjAccountLastNameText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountLastNameText
			String lStrSfSearchByDetailObjAccountEmailText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountEmailText
			String lStrSfSearchByDetailObjAccountMobileText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountMobileText
			String lStrSfSearchByDetailObjAccountPhoneText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountPhoneText
			String lStrSfSearchByDetailObjAccountCompanyNameText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountCompanyNameText
			String lStrSfSearchByDetailObjAccountCompanyNumberText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountCompanyNumberText
			String lStrInputAccountDefaultOption=''
			String lStrSalesforceRecordId=''
			String lStrSalesforceTargetFullId=''
			String lStrSalesforceTargetFullAccessPageUrl=''
			List<String> lListStrSalesforceRecordId=new ArrayList<String>()
			switch(lStrSfSearchByDetailObjAccountDefaultOption){
				case 'Identification_Number':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountIdentificationNumber
					break
				case 'First_Name':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountFirstNameText
					break
				case 'Last_Name':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountLastNameText
					break
				case 'Email':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountEmailText
					break
				case 'Mobile':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountMobileText
					break
				case 'Phone':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountPhoneText
					break
				case 'Company_Name':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountCompanyNameText
					break
				case 'Company_Number':
					lStrInputAccountDefaultOption=lStrSfSearchByDetailObjAccountCompanyNumberText
					break
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrInputAccountDefaultOption)){
				return lreturn
			}
			Map lMapInputSalesforceTargetObjectSearchDetailByDefaultOptionValue=IDNSalesforceLightningCoreHelperUI.inputSalesforceTargetObjectSearchDetailByDefaultOptionValue(this.webDriver,isSfModeLightningOK,lStrSfSearchByDefaultObject,lStrInputAccountDefaultOption)
			if(!lMapInputSalesforceTargetObjectSearchDetailByDefaultOptionValue.Result){
				lStrSalesforceRecordId=''
			}else{
				lStrSalesforceRecordId=lMapInputSalesforceTargetObjectSearchDetailByDefaultOptionValue.StrSalesforceRecordID
			}
			if(!lMapInputSalesforceTargetObjectSearchDetailByDefaultOptionValue.Result){
				return lreturn
			}
			Map lMapGetSalesforceAccountRecordIdListFromRestAPIObject=IDNSalesforceLightningCoreHelperAPI.mapGetSalesforceAccountRecordIdListFromRestAPIObject(lStrSfSearchByDefaultObject,lStrSalesforceRecordId,lStrSfSearchByDetailExpectedAccountType,mapStrInputSalesforceAccountPersonalFieldList,mapStrInputSalesforceAccountBusinessFieldList)
			if(!lMapGetSalesforceAccountRecordIdListFromRestAPIObject.Result){
				lListStrSalesforceRecordId.clear()
			}else{
				lListStrSalesforceRecordId=lMapGetSalesforceAccountRecordIdListFromRestAPIObject.ListSalesforceRecordId
			}
			if(!lMapGetSalesforceAccountRecordIdListFromRestAPIObject.Result){
				return lreturn
			}
			lStrSalesforceTargetFullId=IDNSalesforceLightningCoreHelperAPI.getStringSalesforceRecordIDSelectionOnMultiPleRecord(lStrSfSearchByDefaultObject,lStrSfSearchByDetailSelectionOnMultipleRecord,lListStrSalesforceRecordId)
			lResult=lStrSalesforceTargetFullId.length()>0
			if(lResult){
				lStrSalesforceTargetFullAccessPageUrl=this.strDefaultSalesforceEndPointUrl+IDNSalesforceLightningCoreType.SALESFORCE_LIGHTNING_URL_PATH_SF_OBJECT_ACCOUNT+lStrSalesforceTargetFullId+'/view'
				GlobalVariable.BrowserInit=WebUI.navigateToUrl(lStrSalesforceTargetFullAccessPageUrl)
				IGNUemaHelper.delayThreadSecond(5)
			}
			if(lResult){
				lreturn.put('StrSalesforceTargetFullId',lStrSalesforceTargetFullId)
				lreturn.put('StrSalesforceTargetFullAccessPageUrl',lStrSalesforceTargetFullAccessPageUrl)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputMapSalesforceSearchByOpportunity(String strSalesforceSearchByDefaultObject,String strSalesforceTargetFullId){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('StrSalesforceTargetFullId','')
			lreturn.put('StrSalesforceTargetFullAccessPageUrl','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfString(strSalesforceSearchByDefaultObject)){
				return lreturn
			}
			String lStrSalesforceSearchByDefaultObject=strSalesforceSearchByDefaultObject
			if(IGNUemaHelper.checkObjectEmptyOfString(strSalesforceTargetFullId)){
				return lreturn
			}
			String lStrSalesforceTargetFullId=strSalesforceTargetFullId
			String lStrSalesforceTargetFullAccessPageUrl=''
			List<String> lListStrTargetSalesforceRecordId=[]
			List<String> lListStrSalesforceRecordId=[]
			Map lMapGetSalesforceAccountRecordIdListFromRestAPIObject=IDNSalesforceLightningCoreHelperAPI.mapGetSalesforceAnyRecordIdListFromRestAPIObject(lStrSalesforceSearchByDefaultObject,lStrSalesforceTargetFullId,"ContractId")
			if(!lMapGetSalesforceAccountRecordIdListFromRestAPIObject.Result){
				lListStrSalesforceRecordId.clear()
			}else{
				lListStrSalesforceRecordId=lMapGetSalesforceAccountRecordIdListFromRestAPIObject.ListSalesforceRecordId
			}
			if(!lMapGetSalesforceAccountRecordIdListFromRestAPIObject.Result){
				return lreturn
			}
			if(lListStrSalesforceRecordId.size()>0){
				lStrSalesforceTargetFullId=lListStrSalesforceRecordId[0]
			}
			lResult=lStrSalesforceTargetFullId.length()>0
			if(lResult){
				lStrSalesforceTargetFullAccessPageUrl=this.strDefaultSalesforceEndPointUrl+IDNSalesforceLightningCoreType.SALESFORCE_LIGHTNING_URL_PATH_SF_OBJECT_CONTRACT+lStrSalesforceTargetFullId+'/view'
				GlobalVariable.BrowserInit=WebUI.navigateToUrl(lStrSalesforceTargetFullAccessPageUrl)
				IGNUemaHelper.delayThreadSecond(5)
			}
			if(lResult){
				lreturn.put('StrSalesforceTargetFullId',lStrSalesforceTargetFullId)
				lreturn.put('StrSalesforceTargetFullAccessPageUrl',lStrSalesforceTargetFullAccessPageUrl)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputMapActualResult(Boolean isPositiveCase,Boolean isInputSalesforceRecordIdPageResult,Boolean isInputMapSalesforceSearchDetailByDefaultOptionResult){
		Map lreturn=[:]
		String lStrActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			Boolean lIsOK=true
			lIsOK=isInputSalesforceRecordIdPageResult&&isInputMapSalesforceSearchDetailByDefaultOptionResult
			if(isPositiveCase){
				lIsActualResult=lIsOK
			}else{
				lIsActualResult=!lIsOK
			}
			lStrActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			lResult=lStrActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lStrActualResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map inputMapResultMessage(String strActualResult){
		Map lreturn=[:]
		String lStrActualResult=strActualResult.trim()
		String lStrResultMessage=''
		try{
			Boolean lResult=false
			String lMessage=''
			lreturn.put('ResultMessage',lStrResultMessage)
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lStrActualResult)
			if(lIsActualResult){
				lMessage='Searching successfully'
			}else{
				lMessage='Searching failed'
			}
			lStrResultMessage=lMessage
			lResult=lStrResultMessage.length()>0
			if(lResult){
				lreturn.put('ResultMessage',lStrResultMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean inputInitSfSearchByDetailObjAccountInput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('SfSearchByDetailExpectedAccountType','')
			targetMap.put('SfSearchByDetailSelectionOnMultipleRecord','')
			targetMap.put('SfSearchByDetailObjAccountResidentialStatus','')
			targetMap.put('SfSearchByDetailObjAccountDefaultOption','')
			targetMap.put('SfSearchByDetailObjAccountIdentificationNumber','')
			targetMap.put('SfSearchByDetailObjAccountFirstNameText','')
			targetMap.put('SfSearchByDetailObjAccountLastNameText','')
			targetMap.put('SfSearchByDetailObjAccountEmailText','')
			targetMap.put('SfSearchByDetailObjAccountMobileText','')
			targetMap.put('SfSearchByDetailObjAccountPhoneText','')
			targetMap.put('SfSearchByDetailObjAccountCompanyNameText','')
			targetMap.put('SfSearchByDetailObjAccountCompanyNumberText','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean inputSalesforceAccountPersonalFieldList(Map mapStrInputInitSfSearchByDetailObjAccountInput,Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(mapStrInputInitSfSearchByDetailObjAccountInput)){
			return lreturn
		}
		String lStrSfSearchByDetailObjAccountResidentialStatus=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountResidentialStatus
		String lStrSfSearchByDetailObjAccountIdentificationNumber=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountIdentificationNumber
		String lStrSfSearchByDetailObjAccountFirstNameText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountFirstNameText
		String lStrSfSearchByDetailObjAccountLastNameText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountLastNameText
		String lStrSfSearchByDetailObjAccountEmailText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountEmailText
		String lStrSfSearchByDetailObjAccountMobileText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountMobileText
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountResidentialStatus)){
				targetMap.put('Residential_Status__c',lStrSfSearchByDetailObjAccountResidentialStatus)
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountResidentialStatus)){
				if(lStrSfSearchByDetailObjAccountResidentialStatus.equalsIgnoreCase('FOREIGN RESIDENT')){
					targetMap.put('Contact_Individual_Passport_Number__c',lStrSfSearchByDetailObjAccountIdentificationNumber)
				}else{
					targetMap.put('Thai_Identification_Number__c',lStrSfSearchByDetailObjAccountIdentificationNumber)
				}
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountFirstNameText)){
				targetMap.put('FirstName',lStrSfSearchByDetailObjAccountFirstNameText)
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountLastNameText)){
				targetMap.put('LastName',lStrSfSearchByDetailObjAccountLastNameText)
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountEmailText)){
				targetMap.put('Active_Email__c',lStrSfSearchByDetailObjAccountEmailText)
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean inputSalesforceAccountBusinessFieldList(Map mapStrInputInitSfSearchByDetailObjAccountInput,Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(mapStrInputInitSfSearchByDetailObjAccountInput)){
			return lreturn
		}
		String lStrSfSearchByDetailObjAccountEmailText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountEmailText
		String lStrSfSearchByDetailObjAccountPhoneText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountPhoneText
		String lStrSfSearchByDetailObjAccountCompanyNameText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountCompanyNameText
		String lStrSfSearchByDetailObjAccountCompanyNumberText=mapStrInputInitSfSearchByDetailObjAccountInput.SfSearchByDetailObjAccountCompanyNumberText
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountEmailText)){
				targetMap.put('Last_Used_Email__c',lStrSfSearchByDetailObjAccountEmailText)
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountPhoneText)){
				targetMap.put('Last_Used_Phone__c',lStrSfSearchByDetailObjAccountPhoneText)
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountCompanyNameText)){
				targetMap.put('ACCOUNT_NAME__c',lStrSfSearchByDetailObjAccountCompanyNameText)
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountCompanyNumberText)){
				targetMap.put('Company_Business_Registration_Number__c',lStrSfSearchByDetailObjAccountCompanyNumberText)
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
}