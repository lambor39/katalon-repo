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
public class IDNSalesforceLightningClaimMotorCarNewbizHelperRecoveryPayment{
	public static WebElement getElementIgniteClaimRecoveryPaymentFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-ign-reserve-payment-form'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01=lStrCssLocator
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormOutput=null
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)){
				WebElement lElementSearch01InputLevel01IgniteClaimReportingFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)
				if(lIsIgnoreCssLocator){
					if(lElementSearch01InputLevel01IgniteClaimReportingFormParent){
						lElementSearch01InputLevel01IgniteClaimReportingFormOutput=lElementSearch01InputLevel01IgniteClaimReportingFormParent
						lResult=true
					}
				}
				if(!lIsIgnoreCssLocator){
					if(lElementSearch01InputLevel01IgniteClaimReportingFormParent){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormParent,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01,true)
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
						lElementSearch01InputLevel01IgniteClaimReportingFormOutput=lElementSearch01InputLevel01IgniteClaimReportingFormChild01
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01IgniteClaimReportingFormOutput
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfCreateOrEditRecoveryPaymentToDo(String strCreateOrEditAdditionalDetailRecoveryPaymentToDo){
		Map lreturn=[:]
		String lStrCreateOrEditAdditionalDetailRecoveryPaymentToDo=strCreateOrEditAdditionalDetailRecoveryPaymentToDo
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateOrEditAdditionalDetailRecoveryPaymentToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lIsCreateOrEditAdditionalDetailRecoveryPaymentToDo=false
			lreturn.put('StrCreateOrEditAdditionalDetailRecoveryPaymentToDo','')
			lreturn.put('BoolCreateOrEditAdditionalDetailRecoveryPaymentToDo',lIsCreateOrEditAdditionalDetailRecoveryPaymentToDo)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			lIsCreateOrEditAdditionalDetailRecoveryPaymentToDo=IGNUemaHelper.convertStringToBoolean(lStrCreateOrEditAdditionalDetailRecoveryPaymentToDo)
			lResult=true
			lreturn.put('StrCreateOrEditAdditionalDetailRecoveryPaymentToDo',lStrCreateOrEditAdditionalDetailRecoveryPaymentToDo)
			lreturn.put('BoolCreateOrEditAdditionalDetailRecoveryPaymentToDo',lIsCreateOrEditAdditionalDetailRecoveryPaymentToDo)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfProceedAdditionalDetailRecoveryPayment(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,Map mapSfClaimRecoveryPaymentInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimRecoveryPaymentInput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			Boolean lIsInputSfSaveButtonOK=false
			Map lMapInputSfRecoveryPaymentPaymentCategory=this.inputSfRecoveryPaymentPaymentCategory(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.PaymentCategory)
			if(lMapInputSfRecoveryPaymentPaymentCategory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfRecoveryPaymentPaymentCategory.ErrorMessage
			}
			if(!lMapInputSfRecoveryPaymentPaymentCategory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfRecoveryPaymentPaymentCategory.Result
			Map lMapInputSfRecoveryPaymentNonMandatory=this.inputSfRecoveryPaymentNonMandatory(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput)
			if(lMapInputSfRecoveryPaymentNonMandatory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfRecoveryPaymentNonMandatory.ErrorMessage
			}
			if(!lMapInputSfRecoveryPaymentNonMandatory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfRecoveryPaymentNonMandatory.Result
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,'save')
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
	public static Map inputSfRecoveryPaymentNonMandatory(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,Map mapSfClaimRecoveryPaymentInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimRecoveryPaymentInput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrSfDateValue=''
			Map lMapInputAdjustDate=[:]
			if(mapSfClaimRecoveryPaymentInput.RecoverFrom.length()>0){
				Map lMapInputSfRecoveryPaymentRecoverFrom=this.inputSfRecoveryPaymentRecoverFrom(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.RecoverFrom)
				if(lMapInputSfRecoveryPaymentRecoverFrom.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentRecoverFrom.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentRecoverFrom.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentRecoverFrom.Result
			}
			if(mapSfClaimRecoveryPaymentInput.RecoveredBy.length()>0){
				Map lMapInputSfRecoveryPaymentRecoveredBy=this.inputSfRecoveryPaymentRecoveredBy(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.RecoveredBy)
				if(lMapInputSfRecoveryPaymentRecoveredBy.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentRecoveredBy.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentRecoveredBy.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentRecoveredBy.Result
			}
			if(mapSfClaimRecoveryPaymentInput.PaymentDateOffset.length()>0&&mapSfClaimRecoveryPaymentInput.PaymentDateValue.length()>0){
				lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(mapSfClaimRecoveryPaymentInput.PaymentDateOffset,mapSfClaimRecoveryPaymentInput.PaymentDateValue)
				if(lMapInputAdjustDate.Result){
					lStrSfDateValue=lMapInputAdjustDate.DateValue
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
				}
				if(!lMapInputAdjustDate.Result){
					return lreturn
				}
				Map lMapInputSfRecoveryPaymentPaymentDate=this.inputSfRecoveryPaymentPaymentDate(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrSfDateValue)
				if(lMapInputSfRecoveryPaymentPaymentDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentPaymentDate.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentPaymentDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentPaymentDate.Result
			}
			if(mapSfClaimRecoveryPaymentInput.NetAmount.length()>0){
				Map lMapInputSfRecoveryPaymentNetAmount=this.inputSfRecoveryPaymentNetAmount(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.NetAmount)
				if(lMapInputSfRecoveryPaymentNetAmount.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentNetAmount.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentNetAmount.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentNetAmount.Result
			}
			if(mapSfClaimRecoveryPaymentInput.VATRate.length()>0){
				Map lMapInputSfRecoveryPaymentVATRate=this.inputSfRecoveryPaymentVATRate(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.VATRate)
				if(lMapInputSfRecoveryPaymentVATRate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentVATRate.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentVATRate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentVATRate.Result
			}
			if(mapSfClaimRecoveryPaymentInput.WHTReferenceNo.length()>0){
				Map lMapInputSfRecoveryPaymentWHTReferenceNo=this.inputSfRecoveryPaymentWHTReferenceNo(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.WHTReferenceNo)
				if(lMapInputSfRecoveryPaymentWHTReferenceNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentWHTReferenceNo.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentWHTReferenceNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentWHTReferenceNo.Result
			}
			if(mapSfClaimRecoveryPaymentInput.WHTRate.length()>0){
				Map lMapInputSfRecoveryPaymentWHTRate=this.inputSfRecoveryPaymentWHTRate(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.WHTRate)
				if(lMapInputSfRecoveryPaymentWHTRate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentWHTRate.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentWHTRate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentWHTRate.Result
			}
			if(mapSfClaimRecoveryPaymentInput.Description.length()>0){
				Map lMapInputSfRecoveryPaymentDescription=this.inputSfRecoveryPaymentDescription(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.Description)
				if(lMapInputSfRecoveryPaymentDescription.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentDescription.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentDescription.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentDescription.Result
			}
			/*
			 if(mapSfClaimRecoveryPaymentInput.FinalRecovery.length()>0){
			 Map lMapInputSfRecoveryPaymentFinalRecovery=this.inputSfRecoveryPaymentFinalRecovery(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.FinalRecovery)
			 if(lMapInputSfRecoveryPaymentFinalRecovery.Result){
			 lStrErrorMessage=''
			 }else{
			 lStrErrorMessage=lMapInputSfRecoveryPaymentFinalRecovery.ErrorMessage
			 }
			 if(!lMapInputSfRecoveryPaymentFinalRecovery.Result){
			 lreturn.put('ErrorMessage',lStrErrorMessage)
			 return lreturn
			 }
			 lResult=lMapInputSfRecoveryPaymentFinalRecovery.Result
			 }
			 */
			if(mapSfClaimRecoveryPaymentInput.PayeeIdentificationCardNo.length()>0){
				Map lMapInputSfRecoveryPaymentPayeeIdentificationCardNo=this.inputSfRecoveryPaymentPayeeIdentificationCardNo(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,mapSfClaimRecoveryPaymentInput.PayeeIdentificationCardNo)
				if(lMapInputSfRecoveryPaymentPayeeIdentificationCardNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfRecoveryPaymentPayeeIdentificationCardNo.ErrorMessage
				}
				if(!lMapInputSfRecoveryPaymentPayeeIdentificationCardNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfRecoveryPaymentPayeeIdentificationCardNo.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentPaymentCategory(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentPaymentCategoryValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentPaymentCategoryValue)){
			return lreturn
		}
		String lStrSfRecoveryPaymentPaymentCategoryValue=strSfRecoveryPaymentPaymentCategoryValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsRecoveryPaymentCategoryClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentPaymentCategoryValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentPaymentCategoryValueFromElement=lStrSfRecoveryPaymentPaymentCategoryValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentPaymentCategoryValueFromElement,'paymentCategory')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsRecoveryPaymentCategoryClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsRecoveryPaymentCategoryClickOK){
						lIsRecoveryPaymentCategoryClickOK=false
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
						String lStrSfRecoveryPaymentPaymentCategoryValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfRecoveryPaymentPaymentCategoryValueFromElement=lStrSfRecoveryPaymentPaymentCategoryValueFromElement.toLowerCase()
						lStrSfRecoveryPaymentPaymentCategoryValue=lStrSfRecoveryPaymentPaymentCategoryValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentPaymentCategoryValueFromElement,lStrSfRecoveryPaymentPaymentCategoryValue)){
							lIsRecoveryPaymentCategoryClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsRecoveryPaymentCategoryClickOK
						}
						if(lIsRecoveryPaymentCategoryClickOK){
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
	public static Map inputSfRecoveryPaymentRecoverFrom(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentRecoverFromValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentRecoverFromValue)){
			return lreturn
		}
		String lStrSfRecoveryPaymentRecoverFromValue=strSfRecoveryPaymentRecoverFromValue.trim()
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
					String lStrSfRecoveryPaymentRecoverFromValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentRecoverFromValueFromElement=lStrSfRecoveryPaymentRecoverFromValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentRecoverFromValueFromElement,'recoveredFrom')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfRecoveryPaymentRecoverFromValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrSfRecoveryPaymentRecoverFromValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrSfRecoveryPaymentRecoverFromValueFromElement=lStrSfRecoveryPaymentRecoverFromValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentRecoverFromValueFromElement,'actionAdvancedSearch')){
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
	public static Map inputSfRecoveryPaymentRecoveredBy(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentRecoveredByValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentRecoveredByValue)){
			return lreturn
		}
		String lStrSfRecoveryPaymentRecoveredByValue=strSfRecoveryPaymentRecoveredByValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsRecoveryPaymentRecoveredByClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentRecoveredByValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentRecoveredByValueFromElement=lStrSfRecoveryPaymentRecoveredByValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentRecoveredByValueFromElement,'recoveredBy')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsRecoveryPaymentRecoveredByClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsRecoveryPaymentRecoveredByClickOK){
						lIsRecoveryPaymentRecoveredByClickOK=false
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
						String lStrSfRecoveryPaymentPaymentCategoryValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfRecoveryPaymentPaymentCategoryValueFromElement=lStrSfRecoveryPaymentPaymentCategoryValueFromElement.toLowerCase()
						lStrSfRecoveryPaymentRecoveredByValue=lStrSfRecoveryPaymentRecoveredByValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentPaymentCategoryValueFromElement,lStrSfRecoveryPaymentRecoveredByValue)){
							lIsRecoveryPaymentRecoveredByClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsRecoveryPaymentRecoveredByClickOK
						}
						if(lIsRecoveryPaymentRecoveredByClickOK){
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
	public static Map inputSfRecoveryPaymentPaymentDate(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentPaymentDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentPaymentDateValue)){
			return lreturn
		}
		String lStrSfRecoveryPaymentPaymentDateValue=strSfRecoveryPaymentPaymentDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentPaymentDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentPaymentDateValueFromElement=lStrSfRecoveryPaymentPaymentDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentPaymentDateValueFromElement,'paymentDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfRecoveryPaymentPaymentDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentNetAmount(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentNetAmount){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentNetAmount)){
			return lreturn
		}
		String lStrSfRecoveryPaymentNetAmount=strSfRecoveryPaymentNetAmount.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentNetAmountFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentNetAmountFromElement=lStrSfRecoveryPaymentNetAmountFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentNetAmountFromElement,'paymentData_netAmount')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfRecoveryPaymentNetAmount)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentVATRate(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentVATRate){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentVATRate)){
			return lreturn
		}
		String lStrSfRecoveryPaymentVATRate=strSfRecoveryPaymentVATRate.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentVATRateFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentVATRateFromElement=lStrSfRecoveryPaymentVATRateFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentVATRateFromElement,'paymentData_vatRate')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfRecoveryPaymentVATRate)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentWHTReferenceNo(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentWHTReferenceNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentWHTReferenceNo)){
			return lreturn
		}
		String lStrSfRecoveryPaymentWHTReferenceNo=strSfRecoveryPaymentWHTReferenceNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentWHTReferenceNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentWHTReferenceNoFromElement=lStrSfRecoveryPaymentWHTReferenceNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentWHTReferenceNoFromElement,'whtReferenceNumber')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfRecoveryPaymentWHTReferenceNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentWHTRate(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentWHTRate){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentWHTRate)){
			return lreturn
		}
		String lStrSfRecoveryPaymentWHTRate=strSfRecoveryPaymentWHTRate.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentWHTRateFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentWHTRateFromElement=lStrSfRecoveryPaymentWHTRateFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentWHTRateFromElement,'paymentData_whtRate')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfRecoveryPaymentWHTRate)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentDescription(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentDescription){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentDescription)){
			return lreturn
		}
		String lStrSfRecoveryPaymentDescription=strSfRecoveryPaymentDescription
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentDescriptionFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentDescriptionFromElement=lStrSfRecoveryPaymentDescriptionFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentDescriptionFromElement,'description')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfRecoveryPaymentDescription)
			if(!lResult){
				lStrErrorMessage='Cannot input text in recovery payment description'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfRecoveryPaymentPayeeIdentificationCardNo(WebDriver webDriver,WebElement elementIgniteClaimRecoveryPaymentDetailFormRoot,String strSfRecoveryPaymentPayeeIdentificationCardNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimRecoveryPaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimRecoveryPaymentDetailFormRoot=elementIgniteClaimRecoveryPaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfRecoveryPaymentPayeeIdentificationCardNo)){
			return lreturn
		}
		String lStrSfRecoveryPaymentPayeeIdentificationCardNo=strSfRecoveryPaymentPayeeIdentificationCardNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfRecoveryPaymentPayeeIdentificationCardNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfRecoveryPaymentPayeeIdentificationCardNoFromElement=lStrSfRecoveryPaymentPayeeIdentificationCardNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfRecoveryPaymentPayeeIdentificationCardNoFromElement,'payeeIdentificationCardNumber')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfRecoveryPaymentPayeeIdentificationCardNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimRecoveryPaymentInput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('PaymentCategory','')
			targetMap.put('RecoverFrom','')
			targetMap.put('RecoveredBy','')
			targetMap.put('PaymentDateOffset','')
			targetMap.put('PaymentDateValue','')
			targetMap.put('NetAmount','')
			targetMap.put('VATRate','')
			targetMap.put('VATAmount','')
			targetMap.put('WHTReferenceNo','')
			targetMap.put('WHTRate','')
			targetMap.put('WHTAmount','')
			targetMap.put('NetAmountInclTax','')
			targetMap.put('Description','')
			targetMap.put('RecoveryPaymentStatus','')
			targetMap.put('FinalRecovery','')
			targetMap.put('PayeeIdentificationCardNo','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}