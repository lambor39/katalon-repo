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
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper
public class IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryDetail{
	public static WebElement getElementIgniteClaimRecoveryDetailFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-ign-recovery-details-app'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-recovery-details-form'
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
	public static Map inputSfCreateOrEditRecoveryDetailToDo(String strCreateOrEditAdditionalDetailRecoveryDetailToDo){
		Map lreturn=[:]
		String lStrCreateOrEditAdditionalDetailRecoveryDetailToDo=strCreateOrEditAdditionalDetailRecoveryDetailToDo
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateOrEditAdditionalDetailRecoveryDetailToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lICreateOrEditAdditionalDetailRecoveryDetailToDo=false
			lreturn.put('StrCreateOrEditAdditionalDetailRecoveryDetailToDo','')
			lreturn.put('BoolCreateOrEditAdditionalDetailRecoveryDetailToDo',lICreateOrEditAdditionalDetailRecoveryDetailToDo)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			lICreateOrEditAdditionalDetailRecoveryDetailToDo=IGNUemaHelper.convertStringToBoolean(lStrCreateOrEditAdditionalDetailRecoveryDetailToDo)
			lResult=true
			lreturn.put('StrCreateOrEditAdditionalDetailRecoveryDetailToDo',lStrCreateOrEditAdditionalDetailRecoveryDetailToDo)
			lreturn.put('BoolCreateOrEditAdditionalDetailRecoveryDetailToDo',lICreateOrEditAdditionalDetailRecoveryDetailToDo)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfProceedAdditionalDetailRecoveryDetail(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,Map mapSfClaimRecoveryDetailInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimRecoveryDetailInput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			Boolean lIsInputSfSaveButtonOK=false
			Map lMapInputSfRecoveryDetailRecoveryType=this.inputSfRecoveryDetailRecoveryType(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput.RecoveryType)
			if(lMapInputSfRecoveryDetailRecoveryType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfRecoveryDetailRecoveryType.ErrorMessage
			}
			if(!lMapInputSfRecoveryDetailRecoveryType.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfRecoveryDetailRecoveryType.Result
			Map lMapInputSfRecoveryDetailNonMandatory=this.inputSfRecoveryDetailNonMandatory(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput)
			if(lMapInputSfRecoveryDetailNonMandatory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfRecoveryDetailNonMandatory.ErrorMessage
			}
			if(!lMapInputSfRecoveryDetailNonMandatory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfRecoveryDetailNonMandatory.Result
			lStrCssLocator='c-ign-recovery-details-app'
			lElementIgniteClaimRecoveryDetailFormRoot=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimRecoveryDetailFormRoot)){
				return lreturn
			}
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,'next')
			if(!lIsInputSfSaveButtonOK){
				return lreturn
			}
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,'save')
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
	public static Map inputSfRecoveryDetailNonMandatory(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,Map mapSfClaimRecoveryDetailInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimRecoveryDetailInput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			if(mapSfClaimRecoveryDetailInput.ThirdPartySequence.length()>0){
				Map lMapInputSfReserveDetailRecoverFrom=this.inputSfRecoveryDetailRecoverFrom(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput.RecoverFrom)
				if(lMapInputSfReserveDetailRecoverFrom.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReserveDetailRecoverFrom.ErrorMessage
				}
				if(!lMapInputSfReserveDetailRecoverFrom.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReserveDetailRecoverFrom.Result
			}
			if(mapSfClaimRecoveryDetailInput.ThirdPartyName.length()>0){
				Map lMapInputSfRecoveryDetailThirdPartyName=this.inputSfRecoveryDetailThirdPartyName(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput.ThirdPartyName)
				if(lMapInputSfRecoveryDetailThirdPartyName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryDetailThirdPartyName.ErrorMessage
				}
				if(!lMapInputSfRecoveryDetailThirdPartyName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryDetailThirdPartyName.Result
			}
			if(mapSfClaimRecoveryDetailInput.OutstandingRecovery.length()>0){
				Map lMapInputSfRecoveryDetailOutstandingRecovery=this.inputSfRecoveryDetailOutstandingRecovery(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput.OutstandingRecovery)
				if(lMapInputSfRecoveryDetailOutstandingRecovery.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryDetailOutstandingRecovery.ErrorMessage
				}
				if(!lMapInputSfRecoveryDetailOutstandingRecovery.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryDetailOutstandingRecovery.Result
			}
			if(mapSfClaimRecoveryDetailInput.RecoveryStage.length()>0){
				Map lMapInputSfRecoveryDetailRecoveryStage=this.inputSfRecoveryDetailRecoveryStage(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput.RecoveryStage)
				if(lMapInputSfRecoveryDetailRecoveryStage.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryDetailRecoveryStage.ErrorMessage
				}
				if(!lMapInputSfRecoveryDetailRecoveryStage.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryDetailRecoveryStage.Result
			}
			if(mapSfClaimRecoveryDetailInput.Description.length()>0){
				Map lMapInputSfRecoveryDetailDescription=this.inputSfRecoveryDetailDescription(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,mapSfClaimRecoveryDetailInput.Description)
				if(lMapInputSfRecoveryDetailDescription.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryDetailDescription.ErrorMessage
				}
				if(!lMapInputSfRecoveryDetailDescription.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryDetailDescription.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryDetailRecoveryType(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,String strSfRecoveryTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryTypeValue)){
			return lreturn
		}
		String lStrSfRecoveryTypeValue=strSfRecoveryTypeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='recoveryType'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryTypeValue)
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
	public static Map inputSfRecoveryDetailRecoverFrom(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,String strSfRecoveryDetailRecoverFromValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryDetailRecoverFromValue)){
			return lreturn
		}
		String lStrSfRecoveryDetailRecoverFromValue=strSfRecoveryDetailRecoverFromValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='recoveryFrom'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryDetailRecoverFromValue)
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
	public static Map inputSfRecoveryDetailThirdPartyName(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,String strSfThirdPartyNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfThirdPartyNameValue)){
			return lreturn
		}
		String lStrSfThirdPartyNameValue=strSfThirdPartyNameValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='thirdParty'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfThirdPartyNameValue)
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
	public static Map inputSfRecoveryDetailOutstandingRecovery(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,String strSfOutstandingRecovery){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfOutstandingRecovery)){
			return lreturn
		}
		String lStrSfOutstandingRecovery=strSfOutstandingRecovery.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='outstandingRecovery'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfOutstandingRecovery)
			if(lMapInputSfLightningPrimitiveInput.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPrimitiveInput.ErrorMessage
			}
			if(!lMapInputSfLightningPrimitiveInput.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPrimitiveInput.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryDetailRecoveryStage(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,String strSfRecoveryStageValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryStageValue)){
			return lreturn
		}
		String lStrSfRecoveryStageValue=strSfRecoveryStageValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='recoveryType'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryStageValue)
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
	public static Map inputSfRecoveryDetailDescription(WebDriver webDriver,WebElement elementIgniteClaimRecoveryDetailFormRoot,String strSfRecoveryDetailDescription){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryDetailDescription)){
			return lreturn
		}
		String lStrSfRecoveryDetailDescription=strSfRecoveryDetailDescription
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='recoveryDescription'
			Map lMapInputSfLightningTextArea=IDNSalesforceLightningCoreHelperUI.inputSfLightningTextArea(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryDetailDescription)
			if(lMapInputSfLightningTextArea.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningTextArea.ErrorMessage
			}
			if(!lMapInputSfLightningTextArea.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningTextArea.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map writeRecoveryDetailObjectOutput(List<String> listStrTargetId){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(listStrTargetId)){
			return lreturn
		}
		List<String> lListStrTargetId=listStrTargetId
		try{
			Boolean lResult=false
			Map lMapSfRecoveryDetailOutput=[:]
			lreturn.put('MapSfRecoveryDetailOutput',lMapSfRecoveryDetailOutput)
			lreturn.put('Result',lResult)
			String lStrTargetId=''
			String lStrTargetSfField='Id,Name,Claim_Name__c,Damage_no__c,Reserve_Catagory__c,Payment_Category__c,Net_Amount__c,VAT_Rate__c,WHT_Rate__c,Stamp_Duty__c,Salvage__c,Recovery__c,Invoice_No__c,Payment_Date__c,Payment_Method__c,Bank_Account__c,Final_Payment__c,Payee__c,Invoice_Date__c,KPI_Payment_Date__c,Invoice_Submitted_Date__c,Cheque_No__c'
			String lStrTargetSalesforceObjectName='Recovery_Details__c'
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
			for(Integer lIndex=0;lIndex<=lListStrTargetId.size()-1;lIndex++){
				if(lIndex>0){
					lStrTargetId=lStrTargetId+','+IGNUemaHelper.getAddedSingleQuoteBeginEnd(lListStrTargetId[lIndex])
				}else{
					lStrTargetId=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lListStrTargetId[lIndex])
				}
			}
			lMapClauseInAnd.put('Damage_no__c',lStrTargetId)
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectTarget=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectTarget.Result){
				lMapGetSalesforceObjectTarget=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectTarget.Result){
				return lreturn
			}
			List<Map> lListMapGetSalesforceObjectTargetRecord=lMapGetSalesforceObjectTarget.ListMapSalesforceObjectRecord
			if(lListMapGetSalesforceObjectTargetRecord.size()>0){
				List<Map> lListMapSalesforceObjectRecordID=[]
				for(Integer lIndex=0;lIndex<=lListMapGetSalesforceObjectTargetRecord.size()-1;lIndex++){
					Map<String,String> lMapSalesforceObjectRecordID=lListMapGetSalesforceObjectTargetRecord.get(lIndex)
					lMapSalesforceObjectRecordID.remove('attributes')
					Map lMapInputInitSfRecoveryDetailOutput=[:]
					this.inputInitSfClaimRecoveryDetailInputOutput(lMapInputInitSfRecoveryDetailOutput)
					lMapInputInitSfRecoveryDetailOutput.DamageSfId=lMapSalesforceObjectRecordID.Damage_no__c
					lMapInputInitSfRecoveryDetailOutput.RecoveryDetailSfId=lMapSalesforceObjectRecordID.Id
					lMapInputInitSfRecoveryDetailOutput.RecoveryDetailName=lMapSalesforceObjectRecordID.Name
					lMapInputInitSfRecoveryDetailOutput.RecoveryType=lMapSalesforceObjectRecordID.Recovery_Type__c
					lMapInputInitSfRecoveryDetailOutput.RecoverFrom=lMapSalesforceObjectRecordID.Recovery_from__c
					lMapInputInitSfRecoveryDetailOutput.ThirdPartyName=lMapSalesforceObjectRecordID.Third_Party__c
					lMapInputInitSfRecoveryDetailOutput.OutstandingRecovery=lMapSalesforceObjectRecordID.Outstanding_Recovery__c
					lMapInputInitSfRecoveryDetailOutput.AmountSubjectToRecovery=lMapSalesforceObjectRecordID.Amount_subject_to_recovery__c
					lMapInputInitSfRecoveryDetailOutput.RecoveryStatus=lMapSalesforceObjectRecordID.Recovery_Status__c
					lMapInputInitSfRecoveryDetailOutput.RecoveryStage=lMapSalesforceObjectRecordID.Recovery_Stage__c
					lMapInputInitSfRecoveryDetailOutput.Description=lMapSalesforceObjectRecordID.Recovery_Description__c
					lMapInputInitSfRecoveryDetailOutput.RecoveredAmount=lMapSalesforceObjectRecordID.Recovered_Amount_Calc__c
					lMapInputInitSfRecoveryDetailOutput.TotalRecoveryAmount=lMapSalesforceObjectRecordID.Total_Recovery_Amount__c
					lListMapSalesforceObjectRecordID.add(lMapInputInitSfRecoveryDetailOutput)
				}
				lMapSfRecoveryDetailOutput.put('recoveryDetailList',lListMapSalesforceObjectRecordID)
			}
			lResult=true
			lreturn.put('MapSfRecoveryDetailOutput',lMapSfRecoveryDetailOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimRecoveryDetailInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('DamageSfId','')
			targetMap.put('RecoveryDetailSfId','')
			targetMap.put('RecoveryDetailName','')
			targetMap.put('RecoveryType','')
			targetMap.put('RecoverFrom','')
			targetMap.put('ThirdPartyName','')
			targetMap.put('OutstandingRecovery','')
			targetMap.put('AmountSubjectToRecovery','')
			targetMap.put('RecoveryStatus','')
			targetMap.put('RecoveryStage','')
			targetMap.put('Description','')
			targetMap.put('RecoveredAmount','')
			targetMap.put('TotalRecoveryAmount','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}