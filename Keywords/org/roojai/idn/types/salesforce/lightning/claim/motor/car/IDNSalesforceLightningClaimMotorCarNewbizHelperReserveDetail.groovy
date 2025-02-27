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
public class IDNSalesforceLightningClaimMotorCarNewbizHelperReserveDetail{
	public static WebElement getElementIgniteClaimReserveDetailFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-ign-reserve-details-app'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-reserve-type-form'
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
	public static Map inputSfCreateOrEditReserveDetailToDo(String strCreateOrEditAdditionalDetailReserveDetailToDo){
		Map lreturn=[:]
		String lStrCreateOrEditAdditionalDetailReserveDetailToDo=strCreateOrEditAdditionalDetailReserveDetailToDo
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateOrEditAdditionalDetailReserveDetailToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lICreateOrEditAdditionalDetailReserveDetailToDo=false
			lreturn.put('StrCreateOrEditAdditionalDetailReserveDetailToDo','')
			lreturn.put('BoolCreateOrEditAdditionalDetailReserveDetailToDo',lICreateOrEditAdditionalDetailReserveDetailToDo)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			lICreateOrEditAdditionalDetailReserveDetailToDo=IGNUemaHelper.convertStringToBoolean(lStrCreateOrEditAdditionalDetailReserveDetailToDo)
			lResult=true
			lreturn.put('StrCreateOrEditAdditionalDetailReserveDetailToDo',lStrCreateOrEditAdditionalDetailReserveDetailToDo)
			lreturn.put('BoolCreateOrEditAdditionalDetailReserveDetailToDo',lICreateOrEditAdditionalDetailReserveDetailToDo)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfProceedAdditionalDetailReserveDetail(WebDriver webDriver,WebElement elementIgniteClaimReserveDetailFormRoot,Map mapSfClaimReserveDetailInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReserveDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReserveDetailFormRoot=elementIgniteClaimReserveDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimReserveDetailInput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			Boolean lIsInputSfSaveButtonOK=false
			Map lMapInputSfReserveDetailReserveType=this.inputSfReserveDetailReserveType(webDriver,lElementIgniteClaimReserveDetailFormRoot,mapSfClaimReserveDetailInput.ReserveType)
			if(lMapInputSfReserveDetailReserveType.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfReserveDetailReserveType.ErrorMessage
			}
			if(!lMapInputSfReserveDetailReserveType.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfReserveDetailReserveType.Result
			Map lMapInputSfReserveDetailNonMandatory=this.inputSfReserveDetailNonMandatory(webDriver,lElementIgniteClaimReserveDetailFormRoot,mapSfClaimReserveDetailInput)
			if(lMapInputSfReserveDetailNonMandatory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfReserveDetailNonMandatory.ErrorMessage
			}
			if(!lMapInputSfReserveDetailNonMandatory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfReserveDetailNonMandatory.Result
			lStrCssLocator='c-ign-reserve-details-app'
			lElementIgniteClaimReserveDetailFormRoot=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReserveDetailFormRoot)){
				return lreturn
			}
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimReserveDetailFormRoot,'next')
			if(!lIsInputSfSaveButtonOK){
				return lreturn
			}
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimReserveDetailFormRoot,'save')
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
	public static Map inputSfReserveDetailNonMandatory(WebDriver webDriver,WebElement elementIgniteClaimReserveDetailFormRoot,Map mapSfClaimReserveDetailInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReserveDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReserveDetailFormRoot=elementIgniteClaimReserveDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimReserveDetailInput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			if(mapSfClaimReserveDetailInput.ThirdPartyName.length()>0){
				Map lMapInputSfReserveDetailThirdPartyName=this.inputSfReserveDetailThirdPartyName(webDriver,lElementIgniteClaimReserveDetailFormRoot,mapSfClaimReserveDetailInput.ThirdPartyName)
				if(lMapInputSfReserveDetailThirdPartyName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReserveDetailThirdPartyName.ErrorMessage
				}
				if(!lMapInputSfReserveDetailThirdPartyName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReserveDetailThirdPartyName.Result
			}
			if(mapSfClaimReserveDetailInput.ThirdPartySequence.length()>0){
				Map lMapInputSfReserveDetailThirdPartySequence=this.inputSfReserveDetailThirdPartySequence(webDriver,lElementIgniteClaimReserveDetailFormRoot,mapSfClaimReserveDetailInput.ThirdPartySequence)
				if(lMapInputSfReserveDetailThirdPartySequence.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReserveDetailThirdPartySequence.ErrorMessage
				}
				if(!lMapInputSfReserveDetailThirdPartySequence.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReserveDetailThirdPartySequence.Result
			}
			if(mapSfClaimReserveDetailInput.OutstandingReserve.length()>0){
				Map lMapInputSfReserveDetailOutstandingReserve=this.inputSfReserveDetailOutstandingReserve(webDriver,lElementIgniteClaimReserveDetailFormRoot,mapSfClaimReserveDetailInput.OutstandingReserve)
				if(lMapInputSfReserveDetailOutstandingReserve.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReserveDetailOutstandingReserve.ErrorMessage
				}
				if(!lMapInputSfReserveDetailOutstandingReserve.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReserveDetailOutstandingReserve.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReserveDetailReserveType(WebDriver webDriver,WebElement elementIgniteClaimReserveDetailFormRoot,String strSfReserveTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReserveDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReserveDetailFormRoot=elementIgniteClaimReserveDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReserveTypeValue)){
			return lreturn
		}
		String lStrSfReserveTypeValue=strSfReserveTypeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='reserveType'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimReserveDetailFormRoot,lStrTargetFieldName,lStrSfReserveTypeValue)
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
	public static Map inputSfReserveDetailThirdPartyName(WebDriver webDriver,WebElement elementIgniteClaimReserveDetailFormRoot,String strSfThirdPartyNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReserveDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReserveDetailFormRoot=elementIgniteClaimReserveDetailFormRoot
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
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimReserveDetailFormRoot,lStrTargetFieldName,lStrSfThirdPartyNameValue)
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
	public static Map inputSfReserveDetailThirdPartySequence(WebDriver webDriver,WebElement elementIgniteClaimReserveDetailFormRoot,String strSfThirdPartySequence){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReserveDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReserveDetailFormRoot=elementIgniteClaimReserveDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfThirdPartySequence)){
			return lreturn
		}
		String lStrSfThirdPartySequence=strSfThirdPartySequence.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='thirdPartySequence'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReserveDetailFormRoot,lStrTargetFieldName,lStrSfThirdPartySequence)
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
	public static Map inputSfReserveDetailOutstandingReserve(WebDriver webDriver,WebElement elementIgniteClaimReserveDetailFormRoot,String strSfOutstandingReserve){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReserveDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReserveDetailFormRoot=elementIgniteClaimReserveDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfOutstandingReserve)){
			return lreturn
		}
		String lStrSfOutstandingReserve=strSfOutstandingReserve.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='outstandingReserveAmount'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReserveDetailFormRoot,lStrTargetFieldName,lStrSfOutstandingReserve)
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
	public static Map writeReserveDetailObjectOutput(List<String> listStrTargetId){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(listStrTargetId)){
			return lreturn
		}
		List<String> lListStrTargetId=listStrTargetId
		try{
			Boolean lResult=false
			Map lMapSfReserveDetailOutput=[:]
			lreturn.put('MapSfReserveDetailOutput',lMapSfReserveDetailOutput)
			lreturn.put('Result',lResult)
			String lStrTargetId=''
			String lStrTargetSfField='Id,Damage_no__c,Name,Reserve_Type__c,Third_Party__c,Third_Party_Sequence__c,Outstanding_Reserve__c'
			String lStrTargetSalesforceObjectName='Reserve_Details__c'
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
					Map lMapInputInitSfReserveDetailOutput=[:]
					this.inputInitSfClaimReserveDetailInputOutput(lMapInputInitSfReserveDetailOutput)
					lMapInputInitSfReserveDetailOutput.DamageSfId=lMapSalesforceObjectRecordID.Damage_no__c
					lMapInputInitSfReserveDetailOutput.ReserveDetailSfId=lMapSalesforceObjectRecordID.Id
					lMapInputInitSfReserveDetailOutput.ReserveDetailName=lMapSalesforceObjectRecordID.Name
					lMapInputInitSfReserveDetailOutput.ReserveType=lMapSalesforceObjectRecordID.Reserve_Type__c
					lMapInputInitSfReserveDetailOutput.ThirdPartyName=lMapSalesforceObjectRecordID.Third_Party__c
					lMapInputInitSfReserveDetailOutput.ThirdPartySequence=lMapSalesforceObjectRecordID.Third_Party_Sequence__c
					lMapInputInitSfReserveDetailOutput.OutstandingReserve=lMapSalesforceObjectRecordID.Outstanding_Reserve__c
					lListMapSalesforceObjectRecordID.add(lMapInputInitSfReserveDetailOutput)
				}
				lMapSfReserveDetailOutput.put('reserveDetailList',lListMapSalesforceObjectRecordID)
			}
			lResult=true
			lreturn.put('MapSfReserveDetailOutput',lMapSfReserveDetailOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimReserveDetailInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('DamageSfId','')
			targetMap.put('ReserveDetailSfId','')
			targetMap.put('ReserveDetailName','')
			targetMap.put('ReserveType','')
			targetMap.put('ThirdPartyName','')
			targetMap.put('ThirdPartySequence','')
			targetMap.put('OutstandingReserve','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}