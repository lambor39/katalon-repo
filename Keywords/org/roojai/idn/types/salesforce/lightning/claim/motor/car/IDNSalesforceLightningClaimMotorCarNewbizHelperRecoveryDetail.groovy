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
import org.roojai.idn.types.salesforce.lightning.claim.motor.car.IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsRecoveryTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryTypeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryTypeValueFromElement=lStrSfRecoveryTypeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryTypeValueFromElement,'recoveryType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsRecoveryTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsRecoveryTypeClickOK){
						lIsRecoveryTypeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrSfRecoveryTypeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfRecoveryTypeValueFromElement=lStrSfRecoveryTypeValueFromElement.toLowerCase()
						lStrSfRecoveryTypeValue=lStrSfRecoveryTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryTypeValueFromElement,lStrSfRecoveryTypeValue)){
							lIsRecoveryTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsRecoveryTypeClickOK
						}
						if(lIsRecoveryTypeClickOK){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryDetailRecoverFromValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryDetailRecoverFromValueFromElement=lStrSfRecoveryDetailRecoverFromValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryDetailRecoverFromValueFromElement,'recoveryFrom')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfRecoveryDetailRecoverFromValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrSfRecoveryDetailRecoverFromValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrSfRecoveryDetailRecoverFromValueFromElement=lStrSfRecoveryDetailRecoverFromValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryDetailRecoverFromValueFromElement,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			lElementSearch01InputLevel01IgniteClaimAddressFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				lElementSearch01InputLevel01IgniteClaimAddressFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormParent,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormChild01,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteClaimAddressFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(webDriver,lListElementSearch01InputLevel01IgniteClaimAddressFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsThirdPartyNameClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfThirdPartyNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfThirdPartyNameValueFromElement=lStrSfThirdPartyNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfThirdPartyNameValueFromElement,'thirdParty')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsThirdPartyNameClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsThirdPartyNameClickOK){
						lIsThirdPartyNameClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrSfThirdPartyNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfThirdPartyNameValueFromElement=lStrSfThirdPartyNameValueFromElement.toLowerCase()
						lStrSfThirdPartyNameValue=lStrSfThirdPartyNameValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfThirdPartyNameValueFromElement,lStrSfThirdPartyNameValue)){
							lIsThirdPartyNameClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsThirdPartyNameClickOK
						}
						if(lIsThirdPartyNameClickOK){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfOutstandingRecoveryFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfOutstandingRecoveryFromElement=lStrSfOutstandingRecoveryFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfOutstandingRecoveryFromElement,'outstandingRecovery')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfOutstandingRecovery)
			}
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsRecoveryTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryTypeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryTypeValueFromElement=lStrSfRecoveryTypeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryTypeValueFromElement,'recoveryType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsRecoveryTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsRecoveryTypeClickOK){
						lIsRecoveryTypeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrSfRecoveryStageValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfRecoveryStageValueFromElement=lStrSfRecoveryStageValueFromElement.toLowerCase()
						lStrSfRecoveryStageValue=lStrSfRecoveryStageValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryStageValueFromElement,lStrSfRecoveryStageValue)){
							lIsRecoveryTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsRecoveryTypeClickOK
						}
						if(lIsRecoveryTypeClickOK){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryDetailDescriptionFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryDetailDescriptionFromElement=lStrSfRecoveryDetailDescriptionFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryDetailDescriptionFromElement,'recoveryDescription')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfRecoveryDetailDescription)
			if(!lResult){
				lStrErrorMessage='Cannot input text in recovery detail description'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimRecoveryDetailInput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
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