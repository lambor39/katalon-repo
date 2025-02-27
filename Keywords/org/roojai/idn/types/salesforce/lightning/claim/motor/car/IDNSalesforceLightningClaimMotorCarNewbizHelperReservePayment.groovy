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
			String lStrTargetFieldName='paymentCategory'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentCategoryValue)
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
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='payee'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentPayeeNameValue)
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
			String lStrTargetFieldName='paymentData_netAmount'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentNetAmount)
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
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='paymentData_vatRate'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentVATRate)
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
			String lStrTargetFieldName='paymentData_whtRate'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentWHTRate)
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
			String lStrTargetFieldName='paymentData_stampDuty'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentStampDuty)
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
			String lStrTargetFieldName='paymentData_salvageRate'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentSalvageRate)
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
			String lStrTargetFieldName='paymentData_recoveryAmount'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentRecoveryAmount)
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
			String lStrTargetFieldName='invoiceNo'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentInvoiceNo)
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
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lStrTargetFieldName='paymentDate'
			Map lMapInputSfLightningDatePickerWithOutTime=IDNSalesforceLightningCoreHelperUI.inputSfLightningDatePickerWithOutTime(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentPaymentDateValue)
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
			String lStrTargetFieldName='paymentMethod'
			Map lMapInputSfLightningComboBoxWithPicklist=IDNSalesforceLightningCoreHelperUI.inputSfLightningComboBoxWithPicklist(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentPaymentMethodValue)
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
			String lStrTargetFieldName='bankAccount'
			Map lMapInputValueWithOutButtonWithSearch=IDNSalesforceLightningCoreHelperUI.inputValueWithOutButtonWithSearch(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentBankNameValue)
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
			String lStrTargetFieldName='invoiceDate'
			Map lMapInputSfLightningDatePickerWithOutTime=IDNSalesforceLightningCoreHelperUI.inputSfLightningDatePickerWithOutTime(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentInvoiceDateValue)
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
			String lStrTargetFieldName='tentativePaymentDate'
			Map lMapInputSfLightningDatePickerWithOutTime=IDNSalesforceLightningCoreHelperUI.inputSfLightningDatePickerWithOutTime(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentPaymentDueDateValue)
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
			String lStrTargetFieldName='invoiceSubmittedDate'
			Map lMapInputSfLightningDatePickerWithOutTime=IDNSalesforceLightningCoreHelperUI.inputSfLightningDatePickerWithOutTime(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentInvoiceSubmittedDateValue)
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
			String lStrTargetFieldName='chequeNo'
			Map lMapInputSfLightningPrimitiveInput=IDNSalesforceLightningCoreHelperUI.inputSfLightningPrimitiveInput(webDriver,lElementIgniteClaimReservePaymentDetailFormRoot,lStrTargetFieldName,lStrSfReservePaymentChequeNo)
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
	public static Map writePaymentDetailObjectOutput(List<String> listStrTargetId){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(listStrTargetId)){
			return lreturn
		}
		List<String> lListStrTargetId=listStrTargetId
		try{
			Boolean lResult=false
			Map lMapSfPaymentDetailOutput=[:]
			lreturn.put('MapSfPaymentDetailOutput',lMapSfPaymentDetailOutput)
			lreturn.put('Result',lResult)
			String lStrTargetId=''
			String lStrTargetSfField='Id,Name,Claim_Name__c,Damage_no__c,Reserve_Catagory__c,Payment_Category__c,Net_Amount__c,VAT_Rate__c,WHT_Rate__c,Stamp_Duty__c,Salvage__c,Recovery__c,Invoice_No__c,Payment_Date__c,Payment_Method__c,Bank_Account__c,Final_Payment__c,Payee__c,Invoice_Date__c,KPI_Payment_Date__c,Invoice_Submitted_Date__c,Cheque_No__c'
			String lStrTargetSalesforceObjectName='Payment_Details__c'
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
			lMapClauseInAnd.put('Reserve_Catagory__c',lStrTargetId)
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
					Map lMapInputInitSfPaymentDetailOutput=[:]
					this.inputInitSfClaimReservePaymentInputOutput(lMapInputInitSfPaymentDetailOutput)
					lMapInputInitSfPaymentDetailOutput.ClaimName=lMapSalesforceObjectRecordID.Claim_Name__c
					lMapInputInitSfPaymentDetailOutput.DamageSfId=lMapSalesforceObjectRecordID.Damage_no__c
					lMapInputInitSfPaymentDetailOutput.ReserveDetailSfId=lMapSalesforceObjectRecordID.Reserve_Catagory__c
					lMapInputInitSfPaymentDetailOutput.PaymentDetailSfId=lMapSalesforceObjectRecordID.Id
					lMapInputInitSfPaymentDetailOutput.PaymentDetailName=lMapSalesforceObjectRecordID.Name
					lMapInputInitSfPaymentDetailOutput.Category=lMapSalesforceObjectRecordID.Payment_Category__c
					lMapInputInitSfPaymentDetailOutput.NetAmount=lMapSalesforceObjectRecordID.Net_Amount__c
					lMapInputInitSfPaymentDetailOutput.VATRate=lMapSalesforceObjectRecordID.VAT_Rate__c
					lMapInputInitSfPaymentDetailOutput.WHTRate=lMapSalesforceObjectRecordID.WHT_Rate__c
					lMapInputInitSfPaymentDetailOutput.StampDuty=lMapSalesforceObjectRecordID.Stamp_Duty__c
					lMapInputInitSfPaymentDetailOutput.SalvageRate=lMapSalesforceObjectRecordID.Salvage__c
					lMapInputInitSfPaymentDetailOutput.RecoveryAmount=lMapSalesforceObjectRecordID.Recovery__c
					lMapInputInitSfPaymentDetailOutput.InvoiceNo=lMapSalesforceObjectRecordID.Invoice_No__c
					lMapInputInitSfPaymentDetailOutput.PaymentDateValue=lMapSalesforceObjectRecordID.Payment_Date__c
					lMapInputInitSfPaymentDetailOutput.PaymentMethod=lMapSalesforceObjectRecordID.Payment_Method__c
					lMapInputInitSfPaymentDetailOutput.BankSfId=lMapSalesforceObjectRecordID.Bank_Account__c
					lMapInputInitSfPaymentDetailOutput.FinalPayment=lMapSalesforceObjectRecordID.Final_Payment__c
					lMapInputInitSfPaymentDetailOutput.PayeeSfId=lMapSalesforceObjectRecordID.Payee__c
					lMapInputInitSfPaymentDetailOutput.InvoiceDateValue=lMapSalesforceObjectRecordID.Invoice_Date__c
					lMapInputInitSfPaymentDetailOutput.PaymentDueDateValue=lMapSalesforceObjectRecordID.KPI_Payment_Date__c
					lMapInputInitSfPaymentDetailOutput.InvoiceSubmittedDateValue=lMapSalesforceObjectRecordID.Invoice_Submitted_Date__c
					lMapInputInitSfPaymentDetailOutput.ChequeNo=lMapSalesforceObjectRecordID.Cheque_No__c
					lListMapSalesforceObjectRecordID.add(lMapInputInitSfPaymentDetailOutput)
				}
				lMapSfPaymentDetailOutput.put('paymentDetailList',lListMapSalesforceObjectRecordID)
			}
			lResult=true
			lreturn.put('MapSfPaymentDetailOutput',lMapSfPaymentDetailOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimReservePaymentInputOutput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
			targetMap.put('ClaimName','')
			targetMap.put('DamageSfId','')
			targetMap.put('ReserveDetailSfId','')
			targetMap.put('PaymentDetailSfId','')
			targetMap.put('PaymentDetailName','')
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
			targetMap.put('BankSfId','')
			targetMap.put('BankName','')
			targetMap.put('FinalPayment','')
			targetMap.put('PayeeSfId','')
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