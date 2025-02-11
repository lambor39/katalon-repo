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
public class IDNSalesforceLightningClaimMotorCarNewbizHelperReservePayment{
	public static WebElement getElementIgniteClaimReservePaymentDetailFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
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
	public static Map inputSfCreateOrEditReservePaymentToDo(String strCreateOrEditAdditionalDetailReservePaymentToDo){
		Map lreturn=[:]
		String lStrCreateOrEditAdditionalDetailReservePaymentToDo=strCreateOrEditAdditionalDetailReservePaymentToDo
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateOrEditAdditionalDetailReservePaymentToDo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			Boolean lICreateOrEditAdditionalDetailReservePaymentToDo=false
			lreturn.put('StrCreateOrEditAdditionalDetailReservePaymentToDo','')
			lreturn.put('BoolCreateOrEditAdditionalDetailReservePaymentToDo',lICreateOrEditAdditionalDetailReservePaymentToDo)
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			lICreateOrEditAdditionalDetailReservePaymentToDo=IGNUemaHelper.convertStringToBoolean(lStrCreateOrEditAdditionalDetailReservePaymentToDo)
			lResult=true
			lreturn.put('StrCreateOrEditAdditionalDetailReservePaymentToDo',lStrCreateOrEditAdditionalDetailReservePaymentToDo)
			lreturn.put('BoolCreateOrEditAdditionalDetailReservePaymentToDo',lICreateOrEditAdditionalDetailReservePaymentToDo)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfProceedAdditionalDetailReservePayment(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,Map mapSfClaimReservePaymentInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimReservePaymentInput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrCssLocator=''
			Boolean lIsInputSfSaveButtonOK=false
			Map lMapInputSfReservePaymentCategory=this.inputSfReservePaymentCategory(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.Category)
			if(lMapInputSfReservePaymentCategory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfReservePaymentCategory.ErrorMessage
			}
			if(!lMapInputSfReservePaymentCategory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfReservePaymentCategory.Result
			Map lMapInputSfReservePaymentPayeeName=this.inputSfReservePaymentPayeeName(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.PayeeName)
			if(lMapInputSfReservePaymentPayeeName.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfReservePaymentPayeeName.ErrorMessage
			}
			if(!lMapInputSfReservePaymentPayeeName.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfReservePaymentPayeeName.Result
			Map lMapInputSfReservePaymentNonMandatory=this.inputSfReservePaymentNonMandatory(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput)
			if(lMapInputSfReservePaymentNonMandatory.Result){
				lStrErrorMessage=''
			}else{
				lStrErrorMessage=lMapInputSfReservePaymentNonMandatory.ErrorMessage
			}
			if(!lMapInputSfReservePaymentNonMandatory.Result){
				lreturn.put('ErrorMessage',lStrErrorMessage)
				return lreturn
			}
			lResult=lMapInputSfReservePaymentNonMandatory.Result
			lIsInputSfSaveButtonOK=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputSfNextButton(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,'save')
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
	public static Map inputSfReservePaymentNonMandatory(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,Map mapSfClaimReservePaymentInput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(mapSfClaimReservePaymentInput)){
			return lreturn
		}
		try{
			Boolean lResult=true
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrSfDateValue=''
			Map lMapInputAdjustDate=[:]
			if(mapSfClaimReservePaymentInput.NetAmount.length()>0){
				Map lMapInputSfReservePaymentNetAmount=this.inputSfReservePaymentNetAmount(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.NetAmount)
				if(lMapInputSfReservePaymentNetAmount.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentNetAmount.ErrorMessage
				}
				if(!lMapInputSfReservePaymentNetAmount.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentNetAmount.Result
			}
			if(mapSfClaimReservePaymentInput.VATRate.length()>0){
				Map lMapInputSfReservePaymentVATRate=this.inputSfReservePaymentVATRate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.VATRate)
				if(lMapInputSfReservePaymentVATRate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentVATRate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentVATRate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentVATRate.Result
			}
			if(mapSfClaimReservePaymentInput.WHTRate.length()>0){
				Map lMapInputSfReservePaymentWHTRate=this.inputSfReservePaymentWHTRate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.WHTRate)
				if(lMapInputSfReservePaymentWHTRate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentWHTRate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentWHTRate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentWHTRate.Result
			}
			if(mapSfClaimReservePaymentInput.StampDuty.length()>0){
				Map lMapInputSfReservePaymentStampDuty=this.inputSfReservePaymentStampDuty(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.StampDuty)
				if(lMapInputSfReservePaymentStampDuty.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentStampDuty.ErrorMessage
				}
				if(!lMapInputSfReservePaymentStampDuty.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentStampDuty.Result
			}
			if(mapSfClaimReservePaymentInput.SalvageRate.length()>0){
				Map lMapInputSfReservePaymentSalvageRate=this.inputSfReservePaymentSalvageRate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.SalvageRate)
				if(lMapInputSfReservePaymentSalvageRate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentSalvageRate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentSalvageRate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentSalvageRate.Result
			}
			if(mapSfClaimReservePaymentInput.RecoveryAmount.length()>0){
				Map lMapInputSfReservePaymentRecoveryAmount=this.inputSfReservePaymentRecoveryAmount(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.RecoveryAmount)
				if(lMapInputSfReservePaymentRecoveryAmount.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentRecoveryAmount.ErrorMessage
				}
				if(!lMapInputSfReservePaymentRecoveryAmount.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentRecoveryAmount.Result
			}
			if(mapSfClaimReservePaymentInput.InvoiceNo.length()>0){
				Map lMapInputSfReservePaymentInvoiceNo=this.inputSfReservePaymentInvoiceNo(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.InvoiceNo)
				if(lMapInputSfReservePaymentInvoiceNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentInvoiceNo.ErrorMessage
				}
				if(!lMapInputSfReservePaymentInvoiceNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentInvoiceNo.Result
			}
			if(mapSfClaimReservePaymentInput.PaymentDateOffset.length()>0&&mapSfClaimReservePaymentInput.PaymentDateValue.length()>0){
				lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(mapSfClaimReservePaymentInput.PaymentDateOffset,mapSfClaimReservePaymentInput.PaymentDateValue)
				if(lMapInputAdjustDate.Result){
					lStrSfDateValue=lMapInputAdjustDate.DateValue
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
				}
				if(!lMapInputAdjustDate.Result){
					return lreturn
				}
				Map lMapInputSfReservePaymentPaymentDate=this.inputSfReservePaymentPaymentDate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrSfDateValue)
				if(lMapInputSfReservePaymentPaymentDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentPaymentDate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentPaymentDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentPaymentDate.Result
			}
			if(mapSfClaimReservePaymentInput.PaymentMethod.length()>0){
				Map lMapInputSfReservePaymentPaymentMethod=this.inputSfReservePaymentPaymentMethod(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.PaymentMethod)
				if(lMapInputSfReservePaymentPaymentMethod.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentPaymentMethod.ErrorMessage
				}
				if(!lMapInputSfReservePaymentPaymentMethod.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentPaymentMethod.Result
			}
			if(mapSfClaimReservePaymentInput.BankName.length()>0){
				Map lMapInputSfReservePaymentBankName=this.inputSfReservePaymentBankName(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.BankName)
				if(lMapInputSfReservePaymentBankName.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentBankName.ErrorMessage
				}
				if(!lMapInputSfReservePaymentBankName.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentBankName.Result
			}
			/*
			 if(mapSfClaimReservePaymentInput.FinalPayment.length()>0){
			 Map lMapInputSfReservePaymentFinalPayment=this.inputSfReservePaymentFinalPayment(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.FinalPayment)
			 if(lMapInputSfReservePaymentFinalPayment.Result){
			 lStrErrorMessage=''
			 }else{
			 lStrErrorMessage=lMapInputSfReservePaymentFinalPayment.ErrorMessage
			 }
			 if(!lMapInputSfReservePaymentFinalPayment.Result){
			 lreturn.put('ErrorMessage',lStrErrorMessage)
			 return lreturn
			 }
			 lResult=lMapInputSfReservePaymentFinalPayment.Result
			 }
			 */
			if(mapSfClaimReservePaymentInput.InvoiceDateOffset.length()>0&&mapSfClaimReservePaymentInput.InvoiceDateValue.length()>0){
				lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(mapSfClaimReservePaymentInput.InvoiceDateOffset,mapSfClaimReservePaymentInput.InvoiceDateValue)
				if(lMapInputAdjustDate.Result){
					lStrSfDateValue=lMapInputAdjustDate.DateValue
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
				}
				if(!lMapInputAdjustDate.Result){
					return lreturn
				}
				Map lMapInputSfReservePaymentInvoiceDate=this.inputSfReservePaymentInvoiceDate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrSfDateValue)
				if(lMapInputSfReservePaymentInvoiceDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentInvoiceDate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentInvoiceDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentInvoiceDate.Result
			}
			if(mapSfClaimReservePaymentInput.PaymentDueDateOffset.length()>0&&mapSfClaimReservePaymentInput.PaymentDueDateValue.length()>0){
				lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(mapSfClaimReservePaymentInput.PaymentDueDateOffset,mapSfClaimReservePaymentInput.PaymentDueDateValue)
				if(lMapInputAdjustDate.Result){
					lStrSfDateValue=lMapInputAdjustDate.DateValue
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
				}
				if(!lMapInputAdjustDate.Result){
					return lreturn
				}
				Map lMapInputSfReservePaymentPaymentDueDate=this.inputSfReservePaymentPaymentDueDate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrSfDateValue)
				if(lMapInputSfReservePaymentPaymentDueDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentPaymentDueDate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentPaymentDueDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentPaymentDueDate.Result
			}
			if(mapSfClaimReservePaymentInput.InvoiceSubmittedDateOffset.length()>0&&mapSfClaimReservePaymentInput.InvoiceSubmittedDateValue.length()>0){
				lMapInputAdjustDate=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputAdjustDate(mapSfClaimReservePaymentInput.InvoiceSubmittedDateOffset,mapSfClaimReservePaymentInput.InvoiceSubmittedDateValue)
				if(lMapInputAdjustDate.Result){
					lStrSfDateValue=lMapInputAdjustDate.DateValue
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputAdjustDate.ErrorMessage
				}
				if(!lMapInputAdjustDate.Result){
					return lreturn
				}
				Map lMapInputSfReservePaymentInvoiceSubmittedDate=this.inputSfReservePaymentInvoiceSubmittedDate(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrSfDateValue)
				if(lMapInputSfReservePaymentInvoiceSubmittedDate.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentInvoiceSubmittedDate.ErrorMessage
				}
				if(!lMapInputSfReservePaymentInvoiceSubmittedDate.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentInvoiceSubmittedDate.Result
			}
			if(mapSfClaimReservePaymentInput.ChequeNo.length()>0){
				Map lMapInputSfReservePaymentChequeNo=this.inputSfReservePaymentChequeNo(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,mapSfClaimReservePaymentInput.ChequeNo)
				if(lMapInputSfReservePaymentChequeNo.Result){
					lStrErrorMessage=''
				}else{
					lStrErrorMessage=lMapInputSfReservePaymentChequeNo.ErrorMessage
				}
				if(!lMapInputSfReservePaymentChequeNo.Result){
					lreturn.put('ErrorMessage',lStrErrorMessage)
					return lreturn
				}
				lResult=lMapInputSfReservePaymentChequeNo.Result
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentCategory(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentCategoryValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentCategoryValue)){
			return lreturn
		}
		String lStrSfReservePaymentCategoryValue=strSfReservePaymentCategoryValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsReservePaymentCategoryClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentCategoryValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentCategoryValueFromElement=lStrSfReservePaymentCategoryValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentCategoryValueFromElement,'paymentCategory')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsReservePaymentCategoryClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsReservePaymentCategoryClickOK){
						lIsReservePaymentCategoryClickOK=false
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
						String lStrSfReservePaymentCategoryValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfReservePaymentCategoryValueFromElement=lStrSfReservePaymentCategoryValueFromElement.toLowerCase()
						lStrSfReservePaymentCategoryValue=lStrSfReservePaymentCategoryValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentCategoryValueFromElement,lStrSfReservePaymentCategoryValue)){
							lIsReservePaymentCategoryClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsReservePaymentCategoryClickOK
						}
						if(lIsReservePaymentCategoryClickOK){
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
	public static Map inputSfReservePaymentPayeeName(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentPayeeNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentPayeeNameValue)){
			return lreturn
		}
		String lStrSfReservePaymentPayeeNameValue=strSfReservePaymentPayeeNameValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfReservePaymentPayeeNameValue)){
			return lreturn
		}
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentPayeeNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentPayeeNameValueFromElement=lStrSfReservePaymentPayeeNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentPayeeNameValueFromElement,'payee')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfReservePaymentPayeeNameValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrSfReservePaymentPayeeNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrSfReservePaymentPayeeNameValueFromElement=lStrSfReservePaymentPayeeNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentPayeeNameValueFromElement,'actionAdvancedSearch')){
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
	public static Map inputSfReservePaymentNetAmount(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentNetAmount){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentNetAmount)){
			return lreturn
		}
		String lStrSfReservePaymentNetAmount=strSfReservePaymentNetAmount.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentNetAmountFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentNetAmountFromElement=lStrSfReservePaymentNetAmountFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentNetAmountFromElement,'paymentData_netAmount')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentNetAmount)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentVATRate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentVATRate){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentVATRate)){
			return lreturn
		}
		String lStrSfReservePaymentVATRate=strSfReservePaymentVATRate.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfReservePaymentVATRate)){
			return lreturn
		}
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentVATRateFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentVATRateFromElement=lStrSfReservePaymentVATRateFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentVATRateFromElement,'paymentData_vatRate')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentVATRate)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentWHTRate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentWHTRate){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentWHTRate)){
			return lreturn
		}
		String lStrSfReservePaymentWHTRate=strSfReservePaymentWHTRate.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentWHTRateFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentWHTRateFromElement=lStrSfReservePaymentWHTRateFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentWHTRateFromElement,'paymentData_whtRate')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentWHTRate)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentStampDuty(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentStampDuty){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentStampDuty)){
			return lreturn
		}
		String lStrSfReservePaymentStampDuty=strSfReservePaymentStampDuty.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentStampDutyFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentStampDutyFromElement=lStrSfReservePaymentStampDutyFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentStampDutyFromElement,'paymentData_stampDuty')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentStampDuty)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentSalvageRate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentSalvageRate){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentSalvageRate)){
			return lreturn
		}
		String lStrSfReservePaymentSalvageRate=strSfReservePaymentSalvageRate.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentSalvageRateFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentSalvageRateFromElement=lStrSfReservePaymentSalvageRateFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentSalvageRateFromElement,'paymentData_salvageRate')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentSalvageRate)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentRecoveryAmount(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentRecoveryAmount){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentRecoveryAmount)){
			return lreturn
		}
		String lStrSfReservePaymentRecoveryAmount=strSfReservePaymentRecoveryAmount.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentRecoveryAmountFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentRecoveryAmountFromElement=lStrSfReservePaymentRecoveryAmountFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentRecoveryAmountFromElement,'paymentData_recoveryAmount')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentRecoveryAmount)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentInvoiceNo(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentInvoiceNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentInvoiceNo)){
			return lreturn
		}
		String lStrSfReservePaymentInvoiceNo=strSfReservePaymentInvoiceNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentInvoiceNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentInvoiceNoFromElement=lStrSfReservePaymentInvoiceNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentInvoiceNoFromElement,'invoiceNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentInvoiceNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentPaymentDate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentPaymentDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentPaymentDateValue)){
			return lreturn
		}
		String lStrSfReservePaymentPaymentDateValue=strSfReservePaymentPaymentDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfReservePaymentPaymentDateValue)){
			return lreturn
		}
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentPaymentDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentPaymentDateValueFromElement=lStrSfReservePaymentPaymentDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentPaymentDateValueFromElement,'paymentDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentPaymentDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentPaymentMethod(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentPaymentMethodValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentPaymentMethodValue)){
			return lreturn
		}
		String lStrSfReservePaymentPaymentMethodValue=strSfReservePaymentPaymentMethodValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsReservePaymentCategoryClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentPaymentMethodValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentPaymentMethodValueFromElement=lStrSfReservePaymentPaymentMethodValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentPaymentMethodValueFromElement,'paymentMethod')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsReservePaymentCategoryClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsReservePaymentCategoryClickOK){
						lIsReservePaymentCategoryClickOK=false
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
						String lStrSfReservePaymentPaymentMethodValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfReservePaymentPaymentMethodValueFromElement=lStrSfReservePaymentPaymentMethodValueFromElement.toLowerCase()
						lStrSfReservePaymentPaymentMethodValue=lStrSfReservePaymentPaymentMethodValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentPaymentMethodValueFromElement,lStrSfReservePaymentPaymentMethodValue)){
							lIsReservePaymentCategoryClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsReservePaymentCategoryClickOK
						}
						if(lIsReservePaymentCategoryClickOK){
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
	public static Map inputSfReservePaymentBankName(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentBankNameValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentBankNameValue)){
			return lreturn
		}
		String lStrSfReservePaymentBankNameValue=strSfReservePaymentBankNameValue.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentBankNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentBankNameValueFromElement=lStrSfReservePaymentBankNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentBankNameValueFromElement,'bankAccount')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfReservePaymentBankNameValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrSfReservePaymentBankNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrSfReservePaymentBankNameValueFromElement=lStrSfReservePaymentBankNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentBankNameValueFromElement,'actionAdvancedSearch')){
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
	public static Map inputSfReservePaymentInvoiceDate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentInvoiceDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentInvoiceDateValue)){
			return lreturn
		}
		String lStrSfReservePaymentInvoiceDateValue=strSfReservePaymentInvoiceDateValue.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentInvoiceDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentInvoiceDateValueFromElement=lStrSfReservePaymentInvoiceDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentInvoiceDateValueFromElement,'invoiceDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentInvoiceDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentPaymentDueDate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentPaymentDueDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentPaymentDueDateValue)){
			return lreturn
		}
		String lStrSfReservePaymentPaymentDueDateValue=strSfReservePaymentPaymentDueDateValue.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentPaymentDueDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentPaymentDueDateValueFromElement=lStrSfReservePaymentPaymentDueDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentPaymentDueDateValueFromElement,'tentativePaymentDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentPaymentDueDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentInvoiceSubmittedDate(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentInvoiceSubmittedDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentInvoiceSubmittedDateValue)){
			return lreturn
		}
		String lStrSfReservePaymentInvoiceSubmittedDateValue=strSfReservePaymentInvoiceSubmittedDateValue.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentInvoiceSubmittedDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentInvoiceSubmittedDateValueFromElement=lStrSfReservePaymentInvoiceSubmittedDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentInvoiceSubmittedDateValueFromElement,'invoiceSubmittedDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentInvoiceSubmittedDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfReservePaymentChequeNo(WebDriver webDriver,WebElement elementIgniteClaimReservePaymentDetailFormRoot,String strSfReservePaymentChequeNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReservePaymentDetailFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReservePaymentDetailFormRoot=elementIgniteClaimReservePaymentDetailFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfReservePaymentChequeNo)){
			return lreturn
		}
		String lStrSfReservePaymentChequeNo=strSfReservePaymentChequeNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReservePaymentChequeNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReservePaymentChequeNo=lStrSfReservePaymentChequeNo.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReservePaymentChequeNo,'chequeNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfReservePaymentChequeNo)
			}
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
	public static Boolean inputInitSfClaimReservePaymentInput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('Category','')
			targetMap.put('NetAmount','')
			targetMap.put('VATRate','')
			targetMap.put('WHTRate','')
			targetMap.put('StampDuty','')
			targetMap.put('SalvageRate','')
			targetMap.put('RecoveryAmount','')
			targetMap.put('InvoiceNo','')
			targetMap.put('PaymentDateOffset','')
			targetMap.put('PaymentDateValue','')
			targetMap.put('PaymentMethod','')
			targetMap.put('BankName','')
			targetMap.put('FinalPayment','')
			targetMap.put('PayeeName','')
			targetMap.put('InvoiceDateOffset','')
			targetMap.put('InvoiceDateValue','')
			targetMap.put('PaymentDueDateOffset','')
			targetMap.put('PaymentDueDateValue','')
			targetMap.put('InvoiceSubmittedDateOffset','')
			targetMap.put('InvoiceSubmittedDateValue','')
			targetMap.put('ChequeNo','')
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}