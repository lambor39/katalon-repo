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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsReserveTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReserveDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfReserveTypeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfReserveTypeValueFromElement=lStrSfReserveTypeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfReserveTypeValueFromElement,'reserveType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsReserveTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsReserveTypeClickOK){
						lIsReserveTypeClickOK=false
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
						String lStrSfReserveTypeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrSfReserveTypeValueFromElement=lStrSfReserveTypeValueFromElement.toLowerCase()
						lStrSfReserveTypeValue=lStrSfReserveTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfReserveTypeValueFromElement,lStrSfReserveTypeValue)){
							lIsReserveTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsReserveTypeClickOK
						}
						if(lIsReserveTypeClickOK){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsReserveTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReserveDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
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
							lIsReserveTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsReserveTypeClickOK){
						lIsReserveTypeClickOK=false
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
							lIsReserveTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsReserveTypeClickOK
						}
						if(lIsReserveTypeClickOK){
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
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfThirdPartySequence)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReserveDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfThirdPartySequenceFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfThirdPartySequenceFromElement=lStrSfThirdPartySequenceFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfThirdPartySequenceFromElement,'thirdPartySequence')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfThirdPartySequence)
			}
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
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfOutstandingReserve)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReserveDetailFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfOutstandingReserveFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfOutstandingReserveFromElement=lStrSfOutstandingReserveFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfOutstandingReserveFromElement,'outstandingReserveAmount')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfOutstandingReserve)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputInitSfClaimReserveDetailInput(Map targetMap){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			targetMap.clear()
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