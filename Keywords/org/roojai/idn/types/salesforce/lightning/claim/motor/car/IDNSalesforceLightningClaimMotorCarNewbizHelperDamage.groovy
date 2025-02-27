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
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
public class IDNSalesforceLightningClaimMotorCarNewbizHelperDamage{
	public static WebElement getElementIgniteClaimDamageFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
		WebElement lreturn=null
		Boolean lResult=false
		Boolean lIsIgnoreCssLocator=isIgnoreCssLocator
		if(IGNUemaHelper.checkObjectNullOfObject(cssLocator)){
			return lreturn
		}
		String lStrCssLocator=cssLocator.trim()
		if(!lIsIgnoreCssLocator){
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrCssLocator)){
				return lreturn
			}
		}
		try{
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-ign-damage-details-app'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-damage-create-form'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02=lStrCssLocator
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormOutput=null
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)){
				WebElement lElementSearch01InputLevel01IgniteClaimReportingFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormParent){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormParent,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01,true)
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
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
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
	public static Map inputSfCreateOrEditDamageToDo(String strCreateOrEditAdditionalDetailDamageToDo){
		Map lreturn=[:]
		String lStrCreateOrEditAdditionalDetailDamageToDo=strCreateOrEditAdditionalDetailDamageToDo
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateOrEditAdditionalDetailDamageToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lIsCreateOrEditAdditionalDetailDamageToDo=false
			lreturn.put('StrCreateOrEditAdditionalDetailDamageToDo','')
			lreturn.put('BoolCreateOrEditAdditionalDetailDamageToDo',lIsCreateOrEditAdditionalDetailDamageToDo)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			lIsCreateOrEditAdditionalDetailDamageToDo=IGNUemaHelper.convertStringToBoolean(lStrCreateOrEditAdditionalDetailDamageToDo)
			lResult=true
			lreturn.put('StrCreateOrEditAdditionalDetailDamageToDo',lStrCreateOrEditAdditionalDetailDamageToDo)
			lreturn.put('BoolCreateOrEditAdditionalDetailDamageToDo',lIsCreateOrEditAdditionalDetailDamageToDo)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfProceedAdditionalDetailDamage(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,Map mapSfClaimDamageInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimDamageInput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			Boolean lIsInputSfSaveButtonOK=false
			Map lMapInputSfDamageDetailDamageType=this.inputSfDamageDetailDamageType(webDriver,lElementIgniteClaimDamageFormRoot,mapSfClaimDamageInput.DamageType)
			if(lMapInputSfDamageDetailDamageType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfDamageDetailDamageType.ErrorMessage
			}
			if(!lMapInputSfDamageDetailDamageType.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfDamageDetailDamageType.Result
			Map lMapInputSfDamageDetailNonMandatory=this.inputSfDamageDetailNonMandatory(webDriver,lElementIgniteClaimDamageFormRoot,mapSfClaimDamageInput)
			if(lMapInputSfDamageDetailNonMandatory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfDamageDetailNonMandatory.ErrorMessage
			}
			if(!lMapInputSfDamageDetailNonMandatory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfDamageDetailNonMandatory.Result
			lStrCssLocator='c-ign-damage-details-app'
			lElementIgniteClaimDamageFormRoot=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimDamageFormRoot)){
				return lreturn
			}
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimDamageFormRoot,'next')
			if(!lIsInputSfSaveButtonOK){
				return lreturn
			}
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimDamageFormRoot,'save')
			if(!lIsInputSfSaveButtonOK){
				return lreturn
			}
			lResult=lIsInputSfSaveButtonOK
			if(lResult){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map inputSfDamageDetailNonMandatory(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,Map mapSfClaimDamageInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimDamageInput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			if(mapSfClaimDamageInput.DamageAssessorName.length()>0){
				Map lMapInputSfDamageDetailAssessorName=this.inputSfDamageDetailAssessorName(webDriver,lElementIgniteClaimDamageFormRoot,mapSfClaimDamageInput.DamageAssessorName)
				if(lMapInputSfDamageDetailAssessorName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfDamageDetailAssessorName.ErrorMessage
				}
				if(!lMapInputSfDamageDetailAssessorName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfDamageDetailAssessorName.Result
			}
			if(mapSfClaimDamageInput.DamageRecoveryAgentName.length()>0){
				Map lMapInputSfDamageDetailRecoveryAgentName=this.inputSfDamageDetailRecoveryAgentName(webDriver,lElementIgniteClaimDamageFormRoot,mapSfClaimDamageInput.DamageRecoveryAgentName)
				if(lMapInputSfDamageDetailRecoveryAgentName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfDamageDetailRecoveryAgentName.ErrorMessage
				}
				if(!lMapInputSfDamageDetailRecoveryAgentName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfDamageDetailRecoveryAgentName.Result
			}
			if(mapSfClaimDamageInput.DamageServiceProviderName.length()>0){
				Map lMapInputSfDamageDetailServiceProviderName=this.inputSfDamageDetailServiceProviderName(webDriver,lElementIgniteClaimDamageFormRoot,mapSfClaimDamageInput.DamageServiceProviderName)
				if(lMapInputSfDamageDetailServiceProviderName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfDamageDetailServiceProviderName.ErrorMessage
				}
				if(!lMapInputSfDamageDetailServiceProviderName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfDamageDetailServiceProviderName.Result
			}
			if(mapSfClaimDamageInput.DamageQuotationApprovalStatus.length()>0){
				Map lMapInputSfDamageDetailQuotationApprovalStatus=this.inputSfDamageDetailQuotationApprovalStatus(webDriver,lElementIgniteClaimDamageFormRoot,mapSfClaimDamageInput.DamageQuotationApprovalStatus)
				if(lMapInputSfDamageDetailQuotationApprovalStatus.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfDamageDetailQuotationApprovalStatus.ErrorMessage
				}
				if(!lMapInputSfDamageDetailQuotationApprovalStatus.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfDamageDetailQuotationApprovalStatus.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfDamageDetailDamageType(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,String strSfDamageTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfDamageTypeValue)){
			return lreturn
		}
		String lStrSfDamageTypeValue=strSfDamageTypeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='damageType'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimDamageFormRoot,lStrTargetFieldName,lStrSfDamageTypeValue)
			if(lMapInputSfLightningComboBoxWithPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningComboBoxWithPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningComboBoxWithPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningComboBoxWithPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfDamageDetailAssessorName(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,String strSfDamageAssessorNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfDamageAssessorNameValue)){
			return lreturn
		}
		String lStrSfDamageAssessorNameValue=strSfDamageAssessorNameValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='assessor'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimDamageFormRoot,lStrTargetFieldName,lStrSfDamageAssessorNameValue)
			if(lMapInputValueWithOutButtonWithSearch.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputValueWithOutButtonWithSearch.ErrorMessage
			}
			if(!lMapInputValueWithOutButtonWithSearch.Result){
				return lreturn
			}
			lResult=lMapInputValueWithOutButtonWithSearch.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfDamageDetailRecoveryAgentName(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,String strSfDamageRecoveryAgentNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfDamageRecoveryAgentNameValue)){
			return lreturn
		}
		String lStrSfDamageRecoveryAgentNameValue=strSfDamageRecoveryAgentNameValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='recoveryAgent'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimDamageFormRoot,lStrTargetFieldName,lStrSfDamageRecoveryAgentNameValue)
			if(lMapInputValueWithOutButtonWithSearch.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputValueWithOutButtonWithSearch.ErrorMessage
			}
			if(!lMapInputValueWithOutButtonWithSearch.Result){
				return lreturn
			}
			lResult=lMapInputValueWithOutButtonWithSearch.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfDamageDetailServiceProviderName(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,String strSfDamageServiceProviderNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfDamageServiceProviderNameValue)){
			return lreturn
		}
		String lStrSfDamageServiceProviderNameValue=strSfDamageServiceProviderNameValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='serviceProvider'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimDamageFormRoot,lStrTargetFieldName,lStrSfDamageServiceProviderNameValue)
			if(lMapInputValueWithOutButtonWithSearch.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputValueWithOutButtonWithSearch.ErrorMessage
			}
			if(!lMapInputValueWithOutButtonWithSearch.Result){
				return lreturn
			}
			lResult=lMapInputValueWithOutButtonWithSearch.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfDamageDetailQuotationApprovalStatus(WebDriver webDriver,WebElement elementIgniteClaimDamageFormRoot,String strSfDamageDetailQuotationApprovalStatusValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimDamageFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimDamageFormRoot=elementIgniteClaimDamageFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfDamageDetailQuotationApprovalStatusValue)){
			return lreturn
		}
		String lStrSfDamageDetailQuotationApprovalStatusValue=strSfDamageDetailQuotationApprovalStatusValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='quotationApprovalStatus'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimDamageFormRoot,lStrTargetFieldName,lStrSfDamageDetailQuotationApprovalStatusValue)
			if(lMapInputSfLightningComboBoxWithPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningComboBoxWithPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningComboBoxWithPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningComboBoxWithPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map writeDamageObjectOutput(String strTargetId){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetId)){
			return lreturn
		}
		String lStrTargetId=strTargetId
		try{
			Boolean lResult=false
			Map lMapSfDamageOutput=[:]
			lreturn.put('MapSfDamageOutput',lMapSfDamageOutput)
			lreturn.put('Result',lResult)
			String lStrTargetSfField='Id,Claim_Number__c,Name,Claim_Damage_Type__c,Assessor__c,Recovery_Agent__c,Service_Provider__c,Quotation_Approval_Status__c'
			String lStrTargetSalesforceObjectName='Damage__c'
			Boolean lIsToPreferSelectedFieldName=false
			List<String> lListFieldNameAll=new ArrayList<String>()
			List<String> lListFieldNameSelected=new ArrayList<String>()
			Boolean lIsWhereJoinOperatorAnd=true
			String lStrClauseCustomText=''
			Map lMapClauseEqualAnd=[:]
			Map lMapClauseEqualOr=[:]
			Map lMapClauseInAnd=[:]
			Map lMapClauseInOr=[:]
			Map lMapClauseLikeAnd=[:]
			Map lMapClauseLikeOr=[:]
			Map lMapClauseNotEqualAnd=[:]
			Map lMapClauseNotEqualOr=[:]
			Map lMapClauseNotInAnd=[:]
			Map lMapClauseNotInOr=[:]
			Map lMapClauseNotLikeAnd=[:]
			Map lMapClauseNotLikeOr=[:]
			String lStrWhereClause=''
			String lStrSuffixQuery=''
			lIsToPreferSelectedFieldName=false
			lListFieldNameAll.clear()
			lListFieldNameSelected.clear()
			lIsWhereJoinOperatorAnd=true
			lStrClauseCustomText=''
			lMapClauseEqualAnd.clear()
			lMapClauseEqualOr.clear()
			lMapClauseInAnd.clear()
			lMapClauseInOr.clear()
			lMapClauseLikeAnd.clear()
			lMapClauseLikeOr.clear()
			lMapClauseNotEqualAnd.clear()
			lMapClauseNotEqualOr.clear()
			lMapClauseNotInAnd.clear()
			lMapClauseNotInOr.clear()
			lMapClauseNotLikeAnd.clear()
			lMapClauseNotLikeOr.clear()
			lListFieldNameSelected=lStrTargetSfField.split(',')
			lMapClauseEqualAnd.put('Claim_Number__c',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrTargetId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectTarget=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectTarget.Result){
				lMapGetSalesforceObjectTarget=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectTarget.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectTarget=lMapGetSalesforceObjectTarget.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectTarget.size()<=0){
				return lreturn
			}
			Map lMapJsonTarget=lListMapJsonGetSalesforceObjectTarget[0]
			if(!lMapJsonTarget){
				return lreturn
			}
			Integer lNumberOfObjectTargetNum=lMapJsonTarget.records.size()
			if(lNumberOfObjectTargetNum<=0){
				return lreturn
			}
			List<Map> lListMapGetSalesforceObjectTargetRecord=lMapGetSalesforceObjectTarget.ListMapSalesforceObjectRecord
			if(lListMapGetSalesforceObjectTargetRecord.size()>0){
				List<Map> lListMapSalesforceObjectRecordID=[]
				for(Integer lIndex=0;lIndex<=lListMapGetSalesforceObjectTargetRecord.size()-1;lIndex++){
					Map<String,String> lMapSalesforceObjectRecordID=lListMapGetSalesforceObjectTargetRecord.get(lIndex)
					lMapSalesforceObjectRecordID.remove('attributes')
					Map lMapInputInitSfDamageOutput=[:]
					this.inputInitSfClaimDamageInputOutput(lMapInputInitSfDamageOutput)
					lMapInputInitSfDamageOutput.ClaimSfId=lMapSalesforceObjectRecordID.Claim_Number__c
					lMapInputInitSfDamageOutput.DamageSfId=lMapSalesforceObjectRecordID.Id
					lMapInputInitSfDamageOutput.DamageName=lMapSalesforceObjectRecordID.Name
					lMapInputInitSfDamageOutput.DamageType=lMapSalesforceObjectRecordID.Claim_Damage_Type__c
					lMapInputInitSfDamageOutput.DamageAssessorName=lMapSalesforceObjectRecordID.Assessor__c
					lMapInputInitSfDamageOutput.DamageRecoveryAgentName=lMapSalesforceObjectRecordID.Recovery_Agent__c
					lMapInputInitSfDamageOutput.DamageServiceProviderName=lMapSalesforceObjectRecordID.Service_Provider__c
					lMapInputInitSfDamageOutput.DamageQuotationApprovalStatus=lMapSalesforceObjectRecordID.Quotation_Approval_Status__c
					lListMapSalesforceObjectRecordID.add(lMapInputInitSfDamageOutput)
				}
				lMapSfDamageOutput.put('damageList',lListMapSalesforceObjectRecordID)
			}
			lResult=true
			lreturn.put('MapSfDamageOutput',lMapSfDamageOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimDamageInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('ClaimSfId','')
			targetMap.put('DamageSfId','')
			targetMap.put('DamageName','')
			targetMap.put('DamageType','')
			targetMap.put('DamageAssessorName','')
			targetMap.put('DamageRecoveryAgentName','')
			targetMap.put('DamageServiceProviderName','')
			targetMap.put('DamageQuotationApprovalStatus','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}