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
import org.openqa.selenium.*
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.idn.types.salesforce.lightning.core.*
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperCommon
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectTypeName
import org.roojai.ignite.types.testmanager.*
public class IDNSalesforceLightningQuoteMotorCarNewbizCoreSearchUtil{
	public static Map inputSfSearchObjectAccount(WebDriver webDriver,Map mapCaseDataInput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordID=''
		if(!webDriver){
			return lreturn
		}
		try{
			lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataInput)){
				return lreturn
			}
			Map lMapCaseDataInput=mapCaseDataInput
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			String lStrSfSearchDefaultRecordId=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDefaultSalesforceRecordId
			IDNEnumSalesforceObjectTypeName lIDNEnumSalesforceObjectTypeName=IDNEnumSalesforceObjectTypeName.valueOf('Account')
			String lStrSalesforceObjectName=lIDNEnumSalesforceObjectTypeName.lStrName
			String lStrSfSwitchMode=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSwitchToMode
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Switch_To_Mode')
			String lStrStrSfSwitchModeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSwitchMode)
			Boolean lIsSfModeLightningOK=IDNSalesforceLightningCoreHelperUI.checkTargetSalesforceModeIsLightning(lStrStrSfSwitchModeValue)
			Boolean lIsSfSearchDefaultRecordIdOK=IDNSalesforceLightningCoreHelperUI.inputSalesforceDefaultRecordIdPage(webDriver, lStrSfSearchDefaultRecordId,lStrSalesforceObjectName,lIsSfModeLightningOK)
			if(lIsSfSearchDefaultRecordIdOK){
				lStrSalesforceRecordID=lStrSfSearchDefaultRecordId
			}else{
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Continue_Step')
				String lStrSfSearchByDetailContinueStep=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailContinueStep
				lStrSfSearchByDetailContinueStep=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfSearchByDetailContinueStep)
				Boolean lIsSfSearchByDetailContinueStepOK=IGNUemaHelper.convertStringToBoolean(lStrSfSearchByDetailContinueStep)
				if(lIsSfSearchByDetailContinueStepOK){
					String lStrSfSearchByDetailObjAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountDefaultOption
					IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Obj_Account_Default_Option')
					lStrSfSearchByDetailObjAccountDefaultOption=lIGNTestMasterFieldTypeSingle03.getMasterPairValueByKey(lStrSfSearchByDetailObjAccountDefaultOption)
					String lStrSfSearchDetailByDefaultOptionValue=this.getSalesforceSearchDetailByDefaultOption(lStrSfSearchByDetailObjAccountDefaultOption,lMapCaseDataInput)
					Map lMapInputSearchByDetailObjectAccountDefaultOptionValueResult=IDNSalesforceLightningCoreHelperUI.inputSalesforceTargetObjectSearchDetailByDefaultOptionValue(webDriver,lIsSfModeLightningOK,lStrSalesforceObjectName,lStrSfSearchDetailByDefaultOptionValue)
					if(lMapInputSearchByDetailObjectAccountDefaultOptionValueResult.Result){
						List lListSalesforceRecordID=lMapInputSearchByDetailObjectAccountDefaultOptionValueResult.ListSalesforceRecordID
						String lStrSalesforceRecordIDList=lMapInputSearchByDetailObjectAccountDefaultOptionValueResult.StrSalesforceRecordID
						String lStrTargetRecordID=this.getStrSalesforceRecordIdByAdditionalDetail(lStrSalesforceObjectName,lStrSfSearchByDetailObjAccountDefaultOption,lStrSfSearchDetailByDefaultOptionValue,lStrSalesforceRecordIDList,lMapCaseDataInput)
						lStrSalesforceRecordID=lStrTargetRecordID
					}
				}
			}
			lResult=lStrSalesforceRecordID.length()>0
			if(lResult){
				Boolean lIsNavigateSfTargetObjectPageByDirectAccessOK=IDNSalesforceLightningCoreHelperUI.navigateSfTargetObjectByDirectAccess(webDriver,lStrSalesforceRecordID,lStrSalesforceObjectName,lIsSfModeLightningOK)
				IGNUemaHelper.delayThreadSecond(5)
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static String getSalesforceSearchDetailByDefaultOption(String strSfSearchByDetailObjAccountDefaultOption,Map mapCaseDataInput){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strSfSearchByDetailObjAccountDefaultOption)){
			return lreturn
		}
		String lSfSearchByDetailObjAccountDefaultOption=strSfSearchByDetailObjAccountDefaultOption
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataInput)){
			return lreturn
		}
		Map lMapCaseDataInput=mapCaseDataInput
		String lStrInputAccountDefaultOption=''
		try{
			switch(lSfSearchByDetailObjAccountDefaultOption){
				case 'Identification_Number':
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountIdentificationNumber
					break
				case 'Full_Name':
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountFullNameText
					break
				case 'Last_Name':
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountLastNameText
					break
				case 'Email':
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountEmailText
					break
				case 'Company_Number':
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountCompanyNumberText
					break
				case 'Phone':
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountPhoneText
					break
				default:
					lStrInputAccountDefaultOption=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountFirstNameText
					break
			}
			lResult=lStrInputAccountDefaultOption.length()>1
			if(lResult){
				lreturn=lStrInputAccountDefaultOption
			}
		}catch(Exception e){
		}
	}
	public static String getStrSalesforceRecordIdByAdditionalDetail(String strSalesforceObjectName,String strSfSearchByDetailObjAccountDefaultOption,String strSfSearchDetailByDefaultOptionValue,String strSfRecordIDList,Map mapCaseDataInput){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataInput)){
			return lreturn
		}
		Map lMapCaseDataInput=mapCaseDataInput
		if(IGNUemaHelper.checkObjectNullOfObject(strSalesforceObjectName)){
			return lreturn
		}
		String lStrTargetSearchObjectName=strSalesforceObjectName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSfSearchByDetailObjAccountDefaultOption)){
			return lreturn
		}
		String lStrSfSearchByDetailObjAccountDefaultOption=strSfSearchByDetailObjAccountDefaultOption.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountDefaultOption)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSfSearchDetailByDefaultOptionValue)){
			return lreturn
		}
		String lStrSfSearchDetailByDefaultOptionValue=strSfSearchDetailByDefaultOptionValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchDetailByDefaultOptionValue)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecordIDList)){
			return lreturn
		}
		String lStrSfRecordIDList=strSfRecordIDList.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfRecordIDList)){
			return lreturn
		}
		try{
			Map lMapAccountPersonFieldList=[:]
			Map lMapAccountBusinessFieldList=[:]
			String lStrTargetSalesforceRecordId=''
			String lStrSfSearchByAdditionalDetailObjAccountPassportNumber=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByAdditionalDetailObjAccountPassportNumber
			String lStrSfSearchByAdditionalDetailObjAccountMobileText=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByAdditionalDetailObjAccountMobileText
			String lStrSfSearchByAdditionalDetailObjAccountResidentialStatus=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByAdditionalDetailObjAccountResidentialStatus
			String lStrSfSearchByAdditionalDetailObjAccountCompanyNameText=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByAdditionalDetailObjAccountCompanyNameText
			String lStrSfSearchByAdditionalDetailObjAccountGenderText=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByAdditionalDetailObjAccountGenderText
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByAdditionalDetailObjAccountPassportNumber)){
				lMapAccountPersonFieldList.put('Contact_Individual_Passport_Number__c',lStrSfSearchByAdditionalDetailObjAccountPassportNumber)
			}
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByAdditionalDetailObjAccountMobileText)){
				lMapAccountPersonFieldList.put('Active_Phone_No__c',lStrSfSearchByAdditionalDetailObjAccountMobileText)
				lMapAccountBusinessFieldList.put('Active_Phone_No__c',lStrSfSearchByAdditionalDetailObjAccountMobileText)
			}
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByAdditionalDetailObjAccountResidentialStatus)){
				lMapAccountPersonFieldList.put('Residential_Status__c',lStrSfSearchByAdditionalDetailObjAccountResidentialStatus)
			}
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByAdditionalDetailObjAccountCompanyNameText)){
				lMapAccountBusinessFieldList.put('Company_Name__pc',lStrSfSearchByAdditionalDetailObjAccountCompanyNameText)
			}
			if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByAdditionalDetailObjAccountGenderText)){
				lMapAccountPersonFieldList.put('Gender__pc',lStrSfSearchByAdditionalDetailObjAccountGenderText)
			}
			switch(lStrSfSearchByDetailObjAccountDefaultOption){
				case 'Identification_Number':
					lMapAccountPersonFieldList.put('Thai_Identification_Number__c',lStrSfSearchDetailByDefaultOptionValue)
					break
				case 'Full_Name':
					lMapAccountPersonFieldList.put('Name',lStrSfSearchDetailByDefaultOptionValue)
					lMapAccountBusinessFieldList.put('Name',lStrSfSearchDetailByDefaultOptionValue)
					break
				case 'Last_Name':
					lMapAccountPersonFieldList.put('LastName',lStrSfSearchDetailByDefaultOptionValue)
					lMapAccountBusinessFieldList.put('LastName',lStrSfSearchDetailByDefaultOptionValue)
					break
				case 'Email':
					lMapAccountBusinessFieldList.put('Business_Finance_Email__c',lStrSfSearchDetailByDefaultOptionValue)
					lMapAccountPersonFieldList.put('Active_Email__c',lStrSfSearchDetailByDefaultOptionValue)
					break
				case 'Company_Number':
					lMapAccountBusinessFieldList.put('Company_Business_Registration_Number__c',lStrSfSearchDetailByDefaultOptionValue)
					break
				case 'Phone':
					lMapAccountBusinessFieldList.put('Active_Phone_No__c',lStrSfSearchDetailByDefaultOptionValue)
					lMapAccountPersonFieldList.put('Active_Phone_No__c',lStrSfSearchDetailByDefaultOptionValue)
					break
				default:
					lMapAccountPersonFieldList.put('LastName',lStrSfSearchDetailByDefaultOptionValue)
					lMapAccountBusinessFieldList.put('LastName',lStrSfSearchDetailByDefaultOptionValue)
					break
			}
			String lStrSfSearchByDetailObjAccountType=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailObjAccountType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Obj_Account_Type')
			String lStrSfSearchByDetailObjAccountTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSearchByDetailObjAccountType)
			Map lMapGetSalesforceAccountRecordIdListFromRestAPIObjectResult=IDNSalesforceLightningCoreHelperAPI.mapGetSalesforceAccountRecordIdListFromRestAPIObject(lStrTargetSearchObjectName,lStrSfRecordIDList,lStrSfSearchByDetailObjAccountTypeValue,lMapAccountPersonFieldList,lMapAccountBusinessFieldList)
			if(lMapGetSalesforceAccountRecordIdListFromRestAPIObjectResult.Result){
				List<String> lListSalesforceRecordID=lMapGetSalesforceAccountRecordIdListFromRestAPIObjectResult.ListSalesforceRecordId
				if(lListSalesforceRecordID.size()>0){
					String lStrSfSearchByDetailSelectionOnMultipleRecord=lMapCaseDataInput.GroupSfLightningShareQuoteMotorStage02DoManageFieldSfSearchByDetailSelectionOnMultipleRecord
					IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Quote_Motor_Stage_02_Do_Manage_Field_Sf_Search_By_Detail_Selection_On_Multiple_Record')
					String lStrSfSearchByDetailSelectionOnMultipleRecordValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSearchByDetailSelectionOnMultipleRecord)
					lStrTargetSalesforceRecordId=IDNSalesforceLightningCoreHelperAPI.getStringSalesforceRecordIDSelectionOnMultiPleRecord(lStrTargetSearchObjectName,lStrSfSearchByDetailSelectionOnMultipleRecordValue,lListSalesforceRecordID)
				}
			}
			lResult=lStrTargetSalesforceRecordId.length()>0
			if(lResult){
				lreturn=lStrTargetSalesforceRecordId
			}
		}catch(Exception e){
		}
		return lreturn
	}
}