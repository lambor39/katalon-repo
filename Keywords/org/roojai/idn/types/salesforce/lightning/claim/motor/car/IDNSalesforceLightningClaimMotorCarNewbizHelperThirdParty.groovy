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
public class IDNSalesforceLightningClaimMotorCarNewbizHelperThirdParty{
	public static WebElement getElementIgnitThirdPartyReportingFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-ign-third-party-details-app'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-third-party-details-form'
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
	public static Map inputSfCreateOrEditThirdPartyToDo(String strCreateOrEditThirdPartyToDo){
		Map lreturn=[:]
		String lStrCreateOrEditThirdPartyToDo=strCreateOrEditThirdPartyToDo
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateOrEditThirdPartyToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lICreateOrEditThirdPartyToDo=false
			lreturn.put('StrCreateOrEditThirdPartyToDo','')
			lreturn.put('BoolCreateOrEditThirdPartyToDo',lICreateOrEditThirdPartyToDo)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			lICreateOrEditThirdPartyToDo=IGNUemaHelper.convertStringToBoolean(lStrCreateOrEditThirdPartyToDo)
			lResult=true
			lreturn.put('StrCreateOrEditThirdPartyToDo',lStrCreateOrEditThirdPartyToDo)
			lreturn.put('BoolCreateOrEditThirdPartyToDo',lICreateOrEditThirdPartyToDo)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfThirdPartyNonMandatory(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,Map mapSfClaimThirdPartyInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrSfDateValue=''
			Map lMapInputAdjustDate=[:]
			if(mapSfClaimThirdPartyInput.IsTPVehicleDamage.length()>0){
				Map lMapInputSfClaimIsTPVehicleDamage=this.inputSfClaimIsTPVehicleDamage(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.IsTPVehicleDamage)
				if(lMapInputSfClaimIsTPVehicleDamage.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIsTPVehicleDamage.ErrorMessage
				}
				if(!lMapInputSfClaimIsTPVehicleDamage.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIsTPVehicleDamage.Result
			}
			if(mapSfClaimThirdPartyInput.TPDriverName.length()>0){
				Map lMapInputSfClaimTPDriverName=this.inputSfClaimTPDriverName(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPDriverName)
				if(lMapInputSfClaimTPDriverName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPDriverName.ErrorMessage
				}
				if(!lMapInputSfClaimTPDriverName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPDriverName.Result
			}
			if(mapSfClaimThirdPartyInput.TPClaimNumber.length()>0){
				Map lMapInputSfClaimTPClaimNumber=this.inputSfClaimTPClaimNumber(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPClaimNumber)
				if(lMapInputSfClaimTPClaimNumber.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPClaimNumber.ErrorMessage
				}
				if(!lMapInputSfClaimTPClaimNumber.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPClaimNumber.Result
			}
			if(mapSfClaimThirdPartyInput.IsTPDriverInjured.length()>0){
				Map lMapInputSfClaimIsTPDriverInjured=this.inputSfClaimIsTPDriverInjured(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.IsTPDriverInjured)
				if(lMapInputSfClaimIsTPDriverInjured.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIsTPDriverInjured.ErrorMessage
				}
				if(!lMapInputSfClaimIsTPDriverInjured.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIsTPDriverInjured.Result
			}
			if(mapSfClaimThirdPartyInput.Relationship.length()>0){
				Map lMapInputSfClaimTPRelationship=this.inputSfClaimTPRelationship(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.Relationship)
				if(lMapInputSfClaimTPRelationship.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPRelationship.ErrorMessage
				}
				if(!lMapInputSfClaimTPRelationship.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPRelationship.Result
			}
			if(mapSfClaimThirdPartyInput.TPCarPlateNo.length()>0){
				Map lMapInputSfClaimTPCarPlateNo=this.inputSfClaimTPCarPlateNo(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPCarPlateNo)
				if(lMapInputSfClaimTPCarPlateNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPCarPlateNo.ErrorMessage
				}
				if(!lMapInputSfClaimTPCarPlateNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPCarPlateNo.Result
			}
			if(mapSfClaimThirdPartyInput.TPCarPlateProvince.length()>0){
				Map lMapInputSfClaimTPCarPlateProvince=this.inputSfClaimTPCarPlateProvince(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPCarPlateProvince)
				if(lMapInputSfClaimTPCarPlateProvince.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPCarPlateProvince.ErrorMessage
				}
				if(!lMapInputSfClaimTPCarPlateProvince.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPCarPlateProvince.Result
			}
			if(mapSfClaimThirdPartyInput.TPChassisNo.length()>0){
				Map lMapInputSfClaimTPChassisNo=this.inputSfClaimTPChassisNo(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPChassisNo)
				if(lMapInputSfClaimTPChassisNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPChassisNo.ErrorMessage
				}
				if(!lMapInputSfClaimTPChassisNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPChassisNo.Result
			}
			if(mapSfClaimThirdPartyInput.TPCarMake.length()>0){
				Map lMapInputSfClaimTPCarMake=this.inputSfClaimTPCarMake(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPCarMake)
				if(lMapInputSfClaimTPCarMake.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPCarMake.ErrorMessage
				}
				if(!lMapInputSfClaimTPCarMake.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPCarMake.Result
			}
			if(mapSfClaimThirdPartyInput.TPPropertyDamage.length()>0){
				Map lMapInputSfClaimTPPropertyDamage=this.inputSfClaimTPPropertyDamage(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPPropertyDamage)
				if(lMapInputSfClaimTPPropertyDamage.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPPropertyDamage.ErrorMessage
				}
				if(!lMapInputSfClaimTPPropertyDamage.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPPropertyDamage.Result
			}
			if(mapSfClaimThirdPartyInput.TPPropertyDescription.length()>0){
				Map lMapInputSfClaimTPPropertyDescription=this.inputSfClaimTPPropertyDescription(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPPropertyDescription)
				if(lMapInputSfClaimTPPropertyDescription.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPPropertyDescription.ErrorMessage
				}
				if(!lMapInputSfClaimTPPropertyDescription.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPPropertyDescription.Result
			}
			if(mapSfClaimThirdPartyInput.IsTPInsured.length()>0){
				Map lMapInputSfClaimIsTPInsured=this.inputSfClaimIsTPInsured(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.IsTPInsured)
				if(lMapInputSfClaimIsTPInsured.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimIsTPInsured.ErrorMessage
				}
				if(!lMapInputSfClaimIsTPInsured.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimIsTPInsured.Result
			}
			if(mapSfClaimThirdPartyInput.Liability.length()>0){
				Map lMapInputSfClaimTPLiability=this.inputSfClaimTPLiability(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.Liability)
				if(lMapInputSfClaimTPLiability.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPLiability.ErrorMessage
				}
				if(!lMapInputSfClaimTPLiability.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPLiability.Result
			}
			if(mapSfClaimThirdPartyInput.TPInjuryDescription.length()>0){
				Map lMapInputSfClaimTPInjuryDescription=this.inputSfClaimTPInjuryDescription(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPInjuryDescription)
				if(lMapInputSfClaimTPInjuryDescription.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPInjuryDescription.ErrorMessage
				}
				if(!lMapInputSfClaimTPInjuryDescription.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPInjuryDescription.Result
			}
			if(mapSfClaimThirdPartyInput.NotifyRelatedPeople.length()>0){
				/*
				 Map lMapInputSfClaimTPNotifyRelatedPeople=this.inputSfClaimTPNotifyRelatedPeople(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.NotifyRelatedPeople)
				 if(lMapInputSfClaimTPNotifyRelatedPeople.Result){
				 lStrErrorMessage=''
				 }else{
				 lStrErrorMessage=lMapInputSfClaimTPNotifyRelatedPeople.ErrorMessage
				 }
				 if(!lMapInputSfClaimTPNotifyRelatedPeople.Result){
				 lreturn.put('ErrorMessage',lStrErrorMessage)
				 return lreturn
				 }
				 lResult=lMapInputSfClaimTPNotifyRelatedPeople.Result
				 */
			}
			if(mapSfClaimThirdPartyInput.TPPolicyExpiryDateOffset.length()>0&&mapSfClaimThirdPartyInput.TPPolicyExpiryDateValue.length()>0){
				lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(mapSfClaimThirdPartyInput.TPPolicyExpiryDateOffset,mapSfClaimThirdPartyInput.TPPolicyExpiryDateValue)
				if(lMapInputAdjustDate.Result){
					lStrSfDateValue=lMapInputAdjustDate.DateValue
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
				}
				if(!lMapInputAdjustDate.Result){
					return lreturn
				}
				Map lMapInputSfClaimTPPolicyExpiryDate=this.inputSfClaimTPPolicyExpiryDate(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrSfDateValue)
				if(lMapInputSfClaimTPPolicyExpiryDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPPolicyExpiryDate.ErrorMessage
				}
				if(!lMapInputSfClaimTPPolicyExpiryDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPPolicyExpiryDate.Result
			}
			if(mapSfClaimThirdPartyInput.TPInsuranceCompany.length()>0){
				Map lMapInputSfClaimTPInsuranceCompany=this.inputSfClaimTPInsuranceCompany(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPInsuranceCompany)
				if(lMapInputSfClaimTPInsuranceCompany.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPInsuranceCompany.ErrorMessage
				}
				if(!lMapInputSfClaimTPInsuranceCompany.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPInsuranceCompany.Result
			}
			if(mapSfClaimThirdPartyInput.TPPolicyNo.length()>0){
				Map lMapInputSfClaimTPPolicyNo=this.inputSfClaimTPPolicyNo(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPPolicyNo)
				if(lMapInputSfClaimTPPolicyNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPPolicyNo.ErrorMessage
				}
				if(!lMapInputSfClaimTPPolicyNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPPolicyNo.Result
			}
			if(mapSfClaimThirdPartyInput.TPPolicyType.length()>0){
				Map lMapInputSfClaimTPPolicyType=this.inputSfClaimTPPolicyType(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPPolicyType)
				if(lMapInputSfClaimTPPolicyType.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPPolicyType.ErrorMessage
				}
				if(!lMapInputSfClaimTPPolicyType.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPPolicyType.Result
			}
			if(mapSfClaimThirdPartyInput.TPCarModel.length()>0){
				Map lMapInputSfClaimTPCarModel=this.inputSfClaimTPCarModel(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPCarModel)
				if(lMapInputSfClaimTPCarModel.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPCarModel.ErrorMessage
				}
				if(!lMapInputSfClaimTPCarModel.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPCarModel.Result
			}
			if(mapSfClaimThirdPartyInput.TPPropertyInsuranceCompany.length()>0){
				Map lMapInputSfClaimTPPropertyInsuranceCompany=this.inputSfClaimTPPropertyInsuranceCompany(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,mapSfClaimThirdPartyInput.TPPropertyInsuranceCompany)
				if(lMapInputSfClaimTPPropertyInsuranceCompany.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfClaimTPPropertyInsuranceCompany.ErrorMessage
				}
				if(!lMapInputSfClaimTPPropertyInsuranceCompany.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfClaimTPPropertyInsuranceCompany.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimIsTPVehicleDamage(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimIsTPVehicleDamageValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIsTPVehicleDamageValue)){
			return lreturn
		}
		String lStrSfClaimIsTPVehicleDamageValue=strSfClaimIsTPVehicleDamageValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='isTpVehicleDamage'
			Map lMapInputSfLightningPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningPicklist(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimIsTPVehicleDamageValue,false)
			if(lMapInputSfLightningPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPDriverName(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPDriverName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPDriverName)){
			return lreturn
		}
		String lStrSfClaimTPDriverName=strSfClaimTPDriverName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpDriverName'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPDriverName)
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
	public static Map inputSfClaimTPClaimNumber(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPClaimNumber){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPClaimNumber)){
			return lreturn
		}
		String lStrSfClaimTPClaimNumber=strSfClaimTPClaimNumber.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpClaimNo'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPClaimNumber)
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
	public static Map inputSfClaimIsTPDriverInjured(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimIsTPDriverInjuredValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIsTPDriverInjuredValue)){
			return lreturn
		}
		String lStrSfClaimIsTPDriverInjuredValue=strSfClaimIsTPDriverInjuredValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='isTpInjured'
			Map lMapInputSfLightningPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningPicklist(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimIsTPDriverInjuredValue,false)
			if(lMapInputSfLightningPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPRelationship(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimRelationship){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimRelationship)){
			return lreturn
		}
		String lStrSfClaimRelationship=strSfClaimRelationship.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='relationship'
			Map lMapInputValueWithInButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithInButtonWithSearch(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimRelationship)
			if(lMapInputValueWithInButtonWithSearch.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputValueWithInButtonWithSearch.ErrorMessage
			}
			if(!lMapInputValueWithInButtonWithSearch.Result){
				return lreturn
			}
			lResult=lMapInputValueWithInButtonWithSearch.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPCarPlateNo(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPCarPlateNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPCarPlateNo)){
			return lreturn
		}
		String lStrSfClaimTPCarPlateNo=strSfClaimTPCarPlateNo.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpCarPlateNo'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPCarPlateNo)
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
	public static Map inputSfClaimTPCarPlateProvince(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPCarPlateProvince){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPCarPlateProvince)){
			return lreturn
		}
		String lStrSfClaimTPCarPlateProvince=strSfClaimTPCarPlateProvince.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpCarPlateProvince'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPCarPlateProvince)
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
	public static Map inputSfClaimTPChassisNo(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPChassisNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPChassisNo)){
			return lreturn
		}
		String lStrSfClaimTPChassisNo=strSfClaimTPChassisNo.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpChassisNo'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPChassisNo)
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
	public static Map inputSfClaimTPCarMake(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPCarMake){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPCarMake)){
			return lreturn
		}
		String lStrSfClaimTPCarMake=strSfClaimTPCarMake.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpCarMake'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPCarMake)
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
	public static Map inputSfClaimTPPropertyDamage(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPPropertyDamage){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPPropertyDamage)){
			return lreturn
		}
		String lStrSfClaimTPPropertyDamage=strSfClaimTPPropertyDamage.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpPropertyDamage'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPPropertyDamage)
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
	public static Map inputSfClaimTPPropertyDescription(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPPropertyDescription){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPPropertyDescription)){
			return lreturn
		}
		String lStrSfClaimTPPropertyDescription=strSfClaimTPPropertyDescription
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='claimDescription'
			Map lMapInputSfLightningTextArea=IDNSalesforceLightningCoreHelperUI.inputSfLightningTextArea(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPPropertyDescription)
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
	public static Map inputSfClaimIsTPInsured(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimIsTPInsuredValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIsTPInsuredValue)){
			return lreturn
		}
		String lStrSfClaimIsTPInsuredValue=strSfClaimIsTPInsuredValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='isTpInsured'
			Map lMapInputSfLightningPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningPicklist(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimIsTPInsuredValue,false)
			if(lMapInputSfLightningPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPLiability(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPLiabilityValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPLiabilityValue)){
			return lreturn
		}
		String lStrSfClaimTPLiabilityValue=strSfClaimTPLiabilityValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='liability'
			Map lMapInputSfLightningPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningPicklist(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPLiabilityValue,true)
			if(lMapInputSfLightningPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPInjuryDescription(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPInjuryDescription){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPInjuryDescription)){
			return lreturn
		}
		String lStrSfClaimTPInjuryDescription=strSfClaimTPInjuryDescription
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpInjuryDescription'
			Map lMapInputSfLightningTextArea=IDNSalesforceLightningCoreHelperUI.inputSfLightningTextArea(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPInjuryDescription)
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
	public static Map inputSfClaimTPNotifyRelatedPeople(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPNotifyRelatedPeople){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPNotifyRelatedPeople)){
			return lreturn
		}
		String lStrSfClaimTPNotifyRelatedPeople=strSfClaimTPNotifyRelatedPeople.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='flagNotifiedRelatedPeople'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPNotifyRelatedPeople)
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
	public static Map inputSfClaimTPPolicyExpiryDate(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPPolicyExpiryDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPPolicyExpiryDateValue)){
			return lreturn
		}
		String lStrSfClaimTPPolicyExpiryDateValue=strSfClaimTPPolicyExpiryDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpPolicyExpiryDate'
			Map lMapInputSfLightningDatePickerWithOutTime=IDNSalesforceLightningCoreHelperUI.inputSfLightningDatePickerWithOutTime(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPPolicyExpiryDateValue)
			if(lMapInputSfLightningDatePickerWithOutTime.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningDatePickerWithOutTime.ErrorMessage
			}
			if(!lMapInputSfLightningDatePickerWithOutTime.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningDatePickerWithOutTime.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPInsuranceCompany(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPInsuranceCompanyValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPInsuranceCompanyValue)){
			return lreturn
		}
		String lStrSfClaimTPInsuranceCompanyValue=strSfClaimTPInsuranceCompanyValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpInsuranceCompany'
			Map lMapInputSfLightningPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningPicklist(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPInsuranceCompanyValue,true)
			if(lMapInputSfLightningPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPPolicyNo(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPPolicyNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPPolicyNo)){
			return lreturn
		}
		String lStrSfClaimTPPolicyNo=strSfClaimTPPolicyNo.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpPolicyNumber'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPPolicyNo)
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
	public static Map inputSfClaimTPPolicyType(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPPolicyTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPPolicyTypeValue)){
			return lreturn
		}
		String lStrSfClaimTPPolicyTypeValue=strSfClaimTPPolicyTypeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpPolicyType'
			Map lMapInputSfLightningPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningPicklist(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPPolicyTypeValue,true)
			if(lMapInputSfLightningPicklist.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfLightningPicklist.ErrorMessage
			}
			if(!lMapInputSfLightningPicklist.Result){
				return lreturn
			}
			lResult=lMapInputSfLightningPicklist.Result
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTPCarModel(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPCarModel){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPCarModel)){
			return lreturn
		}
		String lStrSfClaimTPCarModel=strSfClaimTPCarModel.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpCarModel'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPCarModel)
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
	public static Map inputSfClaimTPPropertyInsuranceCompany(WebDriver webDriver,WebElement elementIgniteClaimThirdPartyDetailFormRoot,String strSfClaimTPPropertyInsuranceCompany){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimThirdPartyDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimThirdPartyDetailFormRoot=elementIgniteClaimThirdPartyDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTPPropertyInsuranceCompany)){
			return lreturn
		}
		String lStrSfClaimTPPropertyInsuranceCompany=strSfClaimTPPropertyInsuranceCompany.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='tpPropertyInsuranceCompany'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimThirdPartyDetailFormRoot,lStrTargetFieldName,lStrSfClaimTPPropertyInsuranceCompany)
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
	public static Map writeThirdPartyObjectOutput(List<String> listStrTargetId){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(listStrTargetId)){
			return lreturn
		}
		List<String> lListStrTargetId=listStrTargetId
		try{
			Boolean lResult=false
			Map lMapSfThirdPartyOutput=[:]
			lreturn.put('MapSfThirdPartyOutput',lMapSfThirdPartyOutput)
			lreturn.put('Result',lResult)
			String lStrTargetId=''
			String lStrTargetSfField='Id,Name,Claim__c,Is_TP_vehicle_damage__c,TP_Driver_name__c,TP_Claim_Number__c,Is_TP_Driver_injured__c,Relationship__c,TP_Vehicle__c,TP_Car_Plate_Province__c,TP_Chassis_No__c,TP_Car_Make__c,TP_Property_Damage__c,TP_Property_Descriptioin__c,Is_TP_insured__c,Liability__c,TP_Injury_Description__c,Notify_Related_People__c,TP_Policy_expiry_date__c,TP_Insurance_company__c,TP_Policy_no__c,TP_Policy_type__c,TP_Car_Model__c,TP_Property_Insurance_company__c'
			String lStrTargetSalesforceObjectName='Third_Party__c'
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
			lMapClauseInAnd.put('Claim__c',lStrTargetId)
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
					Map lMapInputInitSfThirdPartyOutput=[:]
					this.inputInitSfClaimThirdPartyInputOutput(lMapInputInitSfThirdPartyOutput)
					lMapInputInitSfThirdPartyOutput.ClaimSfId=lMapSalesforceObjectRecordID.Claim__c
					lMapInputInitSfThirdPartyOutput.ThirdPartySfId=lMapSalesforceObjectRecordID.Id
					lMapInputInitSfThirdPartyOutput.ThirdPartyName=lMapSalesforceObjectRecordID.Name
					lMapInputInitSfThirdPartyOutput.IsTPVehicleDamage=lMapSalesforceObjectRecordID.Is_TP_vehicle_damage__c
					lMapInputInitSfThirdPartyOutput.TPDriverName=lMapSalesforceObjectRecordID.TP_Driver_name__c
					lMapInputInitSfThirdPartyOutput.TPClaimNumber=lMapSalesforceObjectRecordID.TP_Claim_Number__c
					lMapInputInitSfThirdPartyOutput.IsTPDriverInjured=lMapSalesforceObjectRecordID.Is_TP_Driver_injured__c
					lMapInputInitSfThirdPartyOutput.Relationship=lMapSalesforceObjectRecordID.Relationship__c
					lMapInputInitSfThirdPartyOutput.TPCarPlateNo=lMapSalesforceObjectRecordID.TP_Vehicle__c
					lMapInputInitSfThirdPartyOutput.TPCarPlateProvince=lMapSalesforceObjectRecordID.TP_Car_Plate_Province__c
					lMapInputInitSfThirdPartyOutput.TPChassisNo=lMapSalesforceObjectRecordID.TP_Chassis_No__c
					lMapInputInitSfThirdPartyOutput.TPCarMake=lMapSalesforceObjectRecordID.TP_Car_Make__c
					lMapInputInitSfThirdPartyOutput.TPPropertyDamage=lMapSalesforceObjectRecordID.TP_Property_Damage__c
					lMapInputInitSfThirdPartyOutput.TPPropertyDescription=lMapSalesforceObjectRecordID.TP_Property_Descriptioin__c
					lMapInputInitSfThirdPartyOutput.IsTPInsured=lMapSalesforceObjectRecordID.Is_TP_insured__c
					lMapInputInitSfThirdPartyOutput.Liability=lMapSalesforceObjectRecordID.Liability__c
					lMapInputInitSfThirdPartyOutput.TPInjuryDescription=lMapSalesforceObjectRecordID.TP_Injury_Description__c
					lMapInputInitSfThirdPartyOutput.NotifyRelatedPeople=lMapSalesforceObjectRecordID.Notify_Related_People__c
					lMapInputInitSfThirdPartyOutput.TPPolicyExpiryDateValue=lMapSalesforceObjectRecordID.TP_Policy_expiry_date__c
					lMapInputInitSfThirdPartyOutput.TPInsuranceCompany=lMapSalesforceObjectRecordID.TP_Insurance_company__c
					lMapInputInitSfThirdPartyOutput.TPPolicyNo=lMapSalesforceObjectRecordID.TP_Policy_no__c
					lMapInputInitSfThirdPartyOutput.TPPolicyType=lMapSalesforceObjectRecordID.TP_Policy_type__c
					lMapInputInitSfThirdPartyOutput.TPCarModel=lMapSalesforceObjectRecordID.TP_Car_Model__c
					lMapInputInitSfThirdPartyOutput.TPPropertyInsuranceCompany=lMapSalesforceObjectRecordID.TP_Property_Insurance_company__c
					lListMapSalesforceObjectRecordID.add(lMapInputInitSfThirdPartyOutput)
				}
				lMapSfThirdPartyOutput.put('thirdPartyList',lListMapSalesforceObjectRecordID)
			}
			lResult=true
			lreturn.put('MapSfThirdPartyOutput',lMapSfThirdPartyOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimThirdPartyInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('ClaimSfId','')
			targetMap.put('ThirdPartySfId','')
			targetMap.put('ThirdPartyName','')
			targetMap.put('IsTPVehicleDamage','')
			targetMap.put('TPDriverName','')
			targetMap.put('TPClaimNumber','')
			targetMap.put('IsTPDriverInjured','')
			targetMap.put('Relationship','')
			targetMap.put('TPCarPlateNo','')
			targetMap.put('TPCarPlateProvince','')
			targetMap.put('TPChassisNo','')
			targetMap.put('TPCarMake','')
			targetMap.put('TPPropertyDamage','')
			targetMap.put('TPPropertyDescription','')
			targetMap.put('IsTPInsured','')
			targetMap.put('Liability','')
			targetMap.put('TPInjuryDescription','')
			targetMap.put('NotifyRelatedPeople','')
			targetMap.put('TPPolicyExpiryDateOffset','')
			targetMap.put('TPPolicyExpiryDateValue','')
			targetMap.put('TPInsuranceCompany','')
			targetMap.put('TPPolicyNo','')
			targetMap.put('TPPolicyType','')
			targetMap.put('TPCarModel','')
			targetMap.put('TPPropertyInsuranceCompany','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}