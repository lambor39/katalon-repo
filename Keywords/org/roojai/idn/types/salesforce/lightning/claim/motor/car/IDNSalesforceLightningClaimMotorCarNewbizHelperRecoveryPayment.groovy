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
			String lStrTargetFieldName='paymentCategory'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentPaymentCategoryValue)
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
			String lStrTargetFieldName='recoveredFrom'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimRecoveryDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentRecoverFromValue)
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
			String lStrTargetFieldName='recoveredBy'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentRecoveredByValue)
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
			String lStrTargetFieldName='paymentDate'
			Map lMapInputSfLightningDatePickerWithOutTime=IDNSalesforceLightningCoreHelperUI.inputSfLightningDatePickerWithOutTime(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentPaymentDateValue)
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
			String lStrTargetFieldName='paymentData_netAmount'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentNetAmount)
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
			String lStrTargetFieldName='paymentData_vatRate'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentVATRate)
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
			String lStrTargetFieldName='whtReferenceNumber'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentWHTReferenceNo)
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
			String lStrTargetFieldName='paymentData_whtRate'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentWHTRate)
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
			String lStrTargetFieldName='description'
			Map lMapInputSfLightningTextArea=IDNSalesforceLightningCoreHelperUI.inputSfLightningTextArea(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentDescription)
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
			String lStrTargetFieldName='payeeIdentificationCardNumber'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimRecoveryPaymentDetailFormRoot,lStrTargetFieldName,lStrSfRecoveryPaymentPayeeIdentificationCardNo)
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
	public static Map writeRecoveryPaymentObjectOutput(List<String> listStrTargetId){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(listStrTargetId)){
			return lreturn
		}
		List<String> lListStrTargetId=listStrTargetId
		try{
			Boolean lResult=false
			Map lMapSfRecoveryPaymentOutput=[:]
			lreturn.put('MapSfRecoveryPaymentOutput',lMapSfRecoveryPaymentOutput)
			lreturn.put('Result',lResult)
			String lStrTargetId=''
			String lStrTargetSfField='Id,Name,Claim_Name__c,Damage_no__c,Reserve_Catagory__c,Payment_Category__c,Net_Amount__c,VAT_Rate__c,WHT_Rate__c,Stamp_Duty__c,Salvage__c,Recovery__c,Invoice_No__c,Payment_Date__c,Payment_Method__c,Bank_Account__c,Final_Payment__c,Payee__c,Invoice_Date__c,KPI_Payment_Date__c,Invoice_Submitted_Date__c,Cheque_No__c'
			String lStrTargetSalesforceObjectName='Recovery_Payment__c'
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
			lMapClauseInAnd.put('Recovery_Category__c',lStrTargetId)
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
					Map lMapInputInitSfRecoveryPaymentOutput=[:]
					this.inputInitSfClaimRecoveryPaymentInputOutput(lMapInputInitSfRecoveryPaymentOutput)
					lMapInputInitSfRecoveryPaymentOutput.DamageSfId=lMapSalesforceObjectRecordID.Damage_No__c
					lMapInputInitSfRecoveryPaymentOutput.RecoveryPaymentSfId=lMapSalesforceObjectRecordID.Id
					lMapInputInitSfRecoveryPaymentOutput.RecoveryPaymentName=lMapSalesforceObjectRecordID.Name
					lMapInputInitSfRecoveryPaymentOutput.PaymentCategory=lMapSalesforceObjectRecordID.Payment_Category__c
					lMapInputInitSfRecoveryPaymentOutput.RecoverFrom=lMapSalesforceObjectRecordID.Issue_By__c
					lMapInputInitSfRecoveryPaymentOutput.RecoveredBy=lMapSalesforceObjectRecordID.Recovered_by__c
					lMapInputInitSfRecoveryPaymentOutput.PaymentDateValue=lMapSalesforceObjectRecordID.Payment_Date__c
					lMapInputInitSfRecoveryPaymentOutput.NetAmount=lMapSalesforceObjectRecordID.Net_Amount__c
					lMapInputInitSfRecoveryPaymentOutput.VATRate=lMapSalesforceObjectRecordID.VAT_Rate__c
					lMapInputInitSfRecoveryPaymentOutput.VATAmount=lMapSalesforceObjectRecordID.VAT_Amount__c
					lMapInputInitSfRecoveryPaymentOutput.WHTReferenceNo=lMapSalesforceObjectRecordID.WHT_Reference_No__c
					lMapInputInitSfRecoveryPaymentOutput.WHTRate=lMapSalesforceObjectRecordID.WHT_Rate__c
					lMapInputInitSfRecoveryPaymentOutput.WHTAmount=lMapSalesforceObjectRecordID.WHT_Amount__c
					lMapInputInitSfRecoveryPaymentOutput.Description=lMapSalesforceObjectRecordID.Description__c
					lMapInputInitSfRecoveryPaymentOutput.RecoveryPaymentStatus=lMapSalesforceObjectRecordID.Recovery_Payment_Status__c
					lMapInputInitSfRecoveryPaymentOutput.FinalRecovery=lMapSalesforceObjectRecordID.Final_Recovery__c
					lMapInputInitSfRecoveryPaymentOutput.PayeeIdentificationCardNo=lMapSalesforceObjectRecordID.Payee_Identification__c
					lListMapSalesforceObjectRecordID.add(lMapInputInitSfRecoveryPaymentOutput)
				}
				lMapSfRecoveryPaymentOutput.put('recoveryPaymentList',lListMapSalesforceObjectRecordID)
			}
			lResult=true
			lreturn.put('MapSfRecoveryPaymentOutput',lMapSfRecoveryPaymentOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimRecoveryPaymentInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('DamageSfId','')
			targetMap.put('RecoveryPaymentSfId','')
			targetMap.put('RecoveryPaymentName','')
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